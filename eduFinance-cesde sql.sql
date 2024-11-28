

CREATE TABLE Expenses (
    id_expenses INT IDENTITY(1,1) PRIMARY KEY,
    user_id INT,
    category_id INT,
    description VARCHAR(30),
    cantidad INT,
    fecha DATE,
    FOREIGN KEY (user_id) REFERENCES UserClient(id_user_client),
    FOREIGN KEY (category_id) REFERENCES Category(id_category) 
);
