-- Table for address
CREATE TABLE address (
  id     BIGSERIAL PRIMARY KEY,
  city   VARCHAR NOT NULL,
  street VARCHAR NOT NULL
);

-- Table for names
CREATE TABLE full_name (
  id         BIGSERIAL PRIMARY KEY,
  first_name VARCHAR NOT NULL,
  last_name  VARCHAR NOT NULL
);

-- Table for users
CREATE TABLE users (
  id        BIGSERIAL PRIMARY KEY,
  full_name BIGINT REFERENCES full_name(id),
  address   BIGINT REFERENCES address(id)
);