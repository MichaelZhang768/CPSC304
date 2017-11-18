use cpsc304;

insert into Store values(12222222);

insert into Store values(12222223);

insert into Store values(12222224);

insert into Store values(12222225);

insert into Store values(12222226);

insert into Store values(12222227);

insert into Store values(12222228);

insert into Store values(12222229);

insert into Store values(22222222);

insert into Store values(12222220);

insert into User values("user1@gmail.com", 11111111, "password1", "username1");

insert into User values("user2@gmail.com", 11111112, "password2", "username2");

insert into User values("user3@gmail.com", 11111113, "password3", "username3");

insert into User values("user4@gmail.com", 11111114, "password4", "username4");

insert into User values("user5@gmail.com", 11111115, "password5", "username5");

insert into User values("user6@gmail.com", 11111116, "password6", "username6");

insert into User values("user7@gmail.com", 11111117, "password7", "username7");	

insert into User values("user8@gmail.com", 11111118, "password8", "username8");

insert into User values("user9@gmail.com", 11111119, "password9", "username9");

insert into User values("user10@gmail.com", 11111101, "password10", "username10");

insert into User values("user11@gmail.com", 11111102, "password11", "username11");

insert into User values("user12@gmail.com", 11111103, "password12", "username12");

insert into User values("user13@gmail.com", 11111104, "password13", "username13");

insert into User values("user14@gmail.com", 11111105, "password14", "username14");

insert into User values("user15@gmail.com", 11111106, "password15", "username15");

insert into User values("user16@gmail.com", 11111107, "password16", "username16");

insert into User values("user17@gmail.com", 11111108, "password17", "username17");

insert into User values("user18@gmail.com", 11111109, "password18", "username18");

insert into User values("user19@gmail.com", 11111120, "password19", "username19");

insert into User values("user20@gmail.com", 11111121, "password20", "username20");

insert into AdminUser values(11111111);

insert into AdminUser values(11111112);

insert into AdminUser values(11111113);

insert into AdminUser values(11111114);

insert into AdminUser values(11111115);

insert into AdminUser values(11111116);

insert into AdminUser values(11111117);

insert into AdminUser values(11111118);

insert into AdminUser values(11111119);

insert into AdminUser values(11111101);

insert into RegularUser values(11111102, 12222222, 100.00);

insert into RegularUser values(11111103, 12222222, 53.24);

insert into RegularUser values(11111104, 12222222, 2342.75);

insert into RegularUser values(11111105, 12222222, 24.00);

insert into RegularUser values(11111106, 12222222, 0.00);
	
insert into RegularUser values(11111107, 12222222, 245.84);

insert into RegularUser values(11111108, 12222222, 0.00);

insert into RegularUser values(11111109, 12222222, 60.00);

insert into RegularUser values(11111120, 12222222, 153.45);

insert into RegularUser values(11111121, 12222222, 153512335.52);

insert into Friend values(11111111, 11111102);

insert into Friend values(11111111, 11111103);

insert into Friend values(11111111, 11111104);

insert into Friend values(11111104, 11111105);

insert into Friend values(11111102, 11111103);

insert into Friend values(11111111, 11111105);

insert into Friend values(11111105, 11111121);

insert into Friend values(11111106, 11111107);

insert into Friend values(11111105, 11111106);

insert into Friend values(11111106, 11111109);

insert into Manages values(11111111, 11111102);

insert into Manages values(11111111, 11111103);

insert into Manages values(11111111, 11111104);

insert into Manages values(11111111, 11111105);

insert into Manages values(11111111, 11111106);

insert into Manages values(11111112, 11111107);

insert into Manages values(11111112, 11111108);

insert into Manages values(11111112, 11111109);

insert into Manages values(11111112, 11111120);

insert into Manages values(11111112, 11111121);

insert into Cart values(0, 128.00);

insert into Cart values(1, 0.00);

insert into Cart values(2, 99.00);

insert into Cart values(3, 29.00);

insert into Cart values(4, 167.00);

insert into Cart values(5, 29.00);

insert into Cart values(6, 19.00);

insert into Cart values(7, 29.00);

insert into Cart values(8, 39.00);

insert into Cart values(9, 49.00);

insert into Payment values(11111102, 0, 0, '2017-11-10', 128.00, "Credit Card");

insert into Payment values(11111102, 2, 1, '2017-11-09', 99.00, "PayPal");

insert into Payment values(11111103, 8, 2, '2001-09-11', 39.00, "Debit Card");

insert into Payment values(11111103, 9, 3, '2017-11-09', 49.00, "PayPal");

insert into Payment values(11111104, 3, 4, '2017-11-09', 29.00, "Credit Card");

insert into Payment values(11111104, 4, 5, '2017-05-23', 167.00, "Account Credit");

insert into Payment values(11111105, 5, 6, '2017-05-31', 29.00, "Gift Card");

insert into Payment values(11111106, 6, 7, '2017-02-09', 19.00, "Debit Card");

insert into Payment values(11111107, 7, 8, '2017-10-23', 29.00, "Credit Card");

insert into Payment values(11111102, 1, 9, '2017-09-09', 0.00, "Instant Noodles");

insert into Developer values(0, "Electronic Smarts");

insert into Developer values(1, "Many Thinking Apes");

insert into Developer values(2, "Macrosoft Studios");

insert into Developer values(3, "Rito Games");

insert into Developer values(4, "Valve");

insert into Developer values(5, "Hatcom");

insert into Developer values(6, "Fish Games");

insert into Developer values(7, "MICE");

insert into Developer values(8, "Deactivision");

insert into Developer values(9, "Mediocre Games");

insert into Game values(0, 59.00, 0, 12222222, "Connect 4");

insert into Game values(1, 69.00, 0, 12222222, "Connect 5");

insert into Game values(2, 29.00, 1, 12222222, "Party In My Basement");

insert into Game values(3, 19.00, 2, 12222222, "Potato Ninja");

insert into Game values(4, 39.00, 3, 12222222, "Legends of League");

insert into Game values(5, 59.00, 4, 12222222, "The Lab");

insert into Game values(6, 59.00, 4, 12222222, "The Potato");

insert into Game values(7, 49.00, 6, 12222222, "Feed the Fish");

insert into Game values(8, 89.00, 7, 12222222, "Micefield 1");

insert into Game values(9, 99.00, 8, 12222222, "Call of Potatoes");

insert into Genre values(0, "MOBA");

insert into Genre values(1, "FPS");

insert into Genre values(2, "VR");

insert into Genre values(3, "Fun");

insert into Genre values(4, "RPG");

insert into Genre values(5, "Adventure");

insert into Genre values(6, "Survival");

insert into Genre values(7, "Strategy");

insert into Genre values(8, "Fantasy");

insert into Genre values(9, "Horror");

insert into Has values(0, 3);

insert into Has values(0, 7);

insert into Has values(1, 3);

insert into Has values(1, 7);

insert into Has values(2, 4);

insert into Has values(2, 5);

insert into Has values(2, 9);

insert into Has values(3, 4);

insert into Has values(3, 8);

insert into Has values(4, 0);

insert into Has values(4, 7);

insert into Has values(5, 2);

insert into Has values(5, 9);

insert into Has values(6, 3);

insert into Has values(7, 7);

insert into Has values(8, 1);

insert into Has values(8, 6);

insert into Has values(8, 7);

insert into Has values(9, 1);

insert into Owns values(11111102, 0, 59.00, '2017-11-10');

insert into Owns values(11111102, 1, 69.00, '2017-11-05');

insert into Owns values(11111103, 0, 59.00, '2015-11-10');

insert into Owns values(11111104, 3, 19.00, '2013-09-11');

insert into Owns values(11111105, 6, 59.00, '2013-12-04');

insert into Owns values(11111106, 5, 59.00, '2016-07-29');

insert into Owns values(11111107, 9, 99.00, '2017-11-01');

insert into Owns values(11111108, 6, 59.00, '2017-02-11');

insert into Owns values(11111109, 7, 79.00, '2001-11-10');

insert into Owns values(11111109, 9, 99.00, '2010-02-25');

insert into DLC values(0, 4, "Summoner's Canyon", 19.00);

insert into DLC values(1, 2, "Alcohol Expansion", 19.00);

insert into DLC values(2, 5, "For Science!", 19.00);

insert into DLC values(3, 8, "French Stuff", 19.00);

insert into DLC values(4, 4, "New Champinos", 19.00);

insert into DLC values(5, 9, "Tomatoes Invade", 19.00);

insert into DLC values(6, 8, "French Mice", 29.00);

insert into DLC values(7, 6, "Free Stuff", 0.00);

insert into DLC values(8, 3, "Tomato Ninja", 19.00);

insert into DLC values(9, 8, "Russian Mice", 19.00);

insert into Contains values(0, 0);

insert into Contains values(0, 1);

insert into Contains values(2, 9);

insert into Contains values(4, 0);

insert into Contains values(4, 1);

insert into Contains values(4, 4);

insert into Contains values(3, 2);

insert into Contains values(5, 2);

insert into Contains values(6, 3);

insert into Contains values(7, 2);

insert into Contains values(8, 4);

insert into Contains values(9, 7);

commit work;