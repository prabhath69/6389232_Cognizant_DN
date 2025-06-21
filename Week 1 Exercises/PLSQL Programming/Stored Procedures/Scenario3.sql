CREATE OR REPLACE PROCEDURE TransferFunds(
  p_from IN NUMBER,
  p_to IN NUMBER,
  p_amount IN NUMBER
) IS
  v_balance NUMBER;
BEGIN
  -- Get balance of source account
  SELECT Balance INTO v_balance
  FROM Accounts
  WHERE AccountID = p_from;

  IF v_balance < p_amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in source account.');
  END IF;

  -- Deduct from source
  UPDATE Accounts
  SET Balance = Balance - p_amount,
      LastModified = SYSDATE
  WHERE AccountID = p_from;

  -- Add to destination
  UPDATE Accounts
  SET Balance = Balance + p_amount,
      LastModified = SYSDATE
  WHERE AccountID = p_to;

  COMMIT;
END;
/
