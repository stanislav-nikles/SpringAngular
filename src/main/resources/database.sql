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

ALTER TABLE users ADD COLUMN photo VARCHAR NOT NULL;


INSERT INTO address VALUES (1, 'city1', 'street1');
INSERT INTO address VALUES (2, 'city2', 'street2');
INSERT INTO address VALUES (3, 'city3', 'street3');
INSERT INTO address VALUES (4, 'city4', 'street4');

INSERT INTO full_name VALUES (1, 'Angelina', 'Jolly');
INSERT INTO full_name VALUES (2, 'Brad', 'Pitt');
INSERT INTO full_name VALUES (3, 'Johnny', 'Depp');
INSERT INTO full_name VALUES (4, 'Tom', 'Cruise');

INSERT INTO users VALUES (1, 1, 1,
                          'http://rusjev.net/jvrs/wp-content/uploads/2018/06/a6b2ed3ab2650494ebbf6231b8dcef85_753.jpg');

INSERT INTO users VALUES (2, 2, 2,
                          'http://www.womanhit.ru/media/CACHE/images/article/pitt_tq0D6ki/da205f31473e2978bce34755740ffbe4.png');

INSERT INTO users VALUES (3, 3, 3,
                          'https://icdn.lenta.ru/images/2018/05/07/21/20180507211542827/pic_dbb0e756076e5047b08c73401048fbb7.jpg');

INSERT INTO users VALUES (4, 4, 4,
                          'https://s8.cdn.teleprogramma.pro/wp-content/uploads/2017/09/f39583210f556a8a0b12a770d5170c5d.jpg');


