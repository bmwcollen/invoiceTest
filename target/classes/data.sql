INSERT INTO Invoice (client, vatRate, invoiceDate) VALUES ('TestClient', '15', TODAY());

INSERT INTO lineItem (quantity, descrition, unitPrice) VALUES (10, 'POP', 2.50);

COMMIT;