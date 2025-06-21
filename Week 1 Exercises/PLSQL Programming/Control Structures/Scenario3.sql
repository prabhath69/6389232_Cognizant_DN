-- Scenario 3 : Loan Due Remainder to Customers

BEGIN
  FOR loan IN (
    SELECT LoanID, CustomerID, EndDate
    FROM Loans
    WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30
  )
  LOOP
    DBMS_OUTPUT.PUT_LINE(
      'Reminder: Loan ID ' || loan.LoanID ||
      ' for Customer ' || loan.CustomerID ||
      ' is due on ' || TO_CHAR(loan.EndDate, 'DD-MON-YYYY')
    );
  END LOOP;
END;
/