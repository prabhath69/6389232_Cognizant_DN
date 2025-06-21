-- Scenario 1 : Senior citizen discount

BEGIN
FOR cus IN (SELECT c.CustomerID, TRUNC(MONTHS_BETWEEN(SYSDATE, c.DOB)/12) AS age, l.loanID FROM Customers c JOIN Loans l ON C.CustomerID = L.CustomerID)
LOOP
    IF cus.age >= 60 THEN
        UPDATE Loans
        SET InterestRate = InterestRate - 1.0
        WHERE loanID = cus.loanID;
    END IF;
    DBMS_OUTPUT.PUT_LINE('Senior citizen discount applied for Customer ID: ' || cus.CustomerID || '');
END LOOP;
END;
/