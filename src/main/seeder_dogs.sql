USE springblog_db;
INSERT INTO dogs (age, name, reside_state)
VALUES
    (2, 'Chuck', 'TX'),
    (5, 'Fred', 'OH'),
    (3, 'Bud', 'TN'),
    (10, 'Bailey', 'AL'),
    (11, 'Lexie', 'TX'),
    (1, 'Snickers', 'TX'),
    (6, 'Red', 'FL'),
    (8, 'Barney', 'CA'),
    (12, 'Bowser', 'TX');

use springblog_db;
INSERT INTO products(product_name,cost_in_cents)
VALUES('Dishwasher',2200),
      ('Yorkies',1400),
      ('Tuchonka',800);

use springblog_db;
INSERT INTO posts(title,body)
VALUES('I\'m leaving showbusines', 'I just think I\'m not funny anymore.'),
('you never hear about quicksand anymore','idk it\'s like you just used to hear about it more'),
('Dogs dont like me', 'I\'m not a bad person\, I like Dogs\, why dont they like me back?');
