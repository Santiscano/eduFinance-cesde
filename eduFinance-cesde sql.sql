

CREATE TABLE UserClient (
    id_user_client INT PRIMARY KEY,
   
    name_user VARCHAR(30),
    email VARCHAR(30),
    password VARCHAR(30)
	
);
CREATE TABLE Category (
    id_category INT PRIMARY KEY,
   
    name_category VARCHAR(30),
    
);

CREATE TABLE Expenses (
    id_expenses INT PRIMARY KEY,
    user_id INT,
    category_id INT,
    description VARCHAR(30),
    cantidad INT,
    fecha DATE,
    FOREIGN KEY (user_id) REFERENCES UserClient(id_user_client),
    FOREIGN KEY (category_id) REFERENCES Category(id_category) 
);