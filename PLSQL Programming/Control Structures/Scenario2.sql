-- Scenario 2 : Promoting a customer to VIP if balance > $10,000.

BEGIN
  FOR cus IN (
    SELECT CustomerID, Balance FROM Customers
  )
  LOOP
    IF cus.Balance > 10000 THEN
      UPDATE Customers
      SET IsVIP = 'TRUE'
      WHERE CustomerID = cus.CustomerID;
    END IF;
  END LOOP;
  COMMIT;
END;
/