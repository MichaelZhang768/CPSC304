use cpsc304;

insert into User values("user1@gmail.com", "password1", "username1", "N/A");

insert into User values("user2@gmail.com", "password2", "username2", "N/A");

insert into User values("user3@gmail.com", "password3", "username3", "N/A");

insert into User values("user4@gmail.com", "password4", "username4", "N/A");

insert into User values("user5@gmail.com", "password5", "username5", "N/A");

insert into User values("user6@gmail.com", "password6", "username6", "N/A");

insert into User values("user7@gmail.com", "password7", "username7", "N/A");	

insert into User values("user8@gmail.com", "password8", "username8", "N/A");

insert into User values("user9@gmail.com", "password9", "username9", "N/A");

insert into User values("user10@gmail.com", "password10", "username10", "N/A");

insert into User values("user11@gmail.com", "password11", "username11", "N/A");

insert into User values("user12@gmail.com", "password12", "username12", "N/A");

insert into User values("user13@gmail.com", "password13", "username13", "N/A");

insert into User values("user14@gmail.com", "password14", "username14", "N/A");

insert into User values("user15@gmail.com", "password15", "username15", "N/A");

insert into User values("user16@gmail.com", "password16", "username16", "N/A");

insert into User values("user17@gmail.com", "password17", "username17", "N/A");

insert into User values("user18@gmail.com", "password18", "username18", "N/A");

insert into User values("user19@gmail.com", "password19", "username19", "N/A");

insert into User values("user20@gmail.com", "password20", "username20", "N/A");

insert into AdminUser values(username1);

insert into AdminUser values(username2);

insert into AdminUser values(username3);

insert into AdminUser values(username4);

insert into AdminUser values(username5);

insert into AdminUser values(username6);

insert into AdminUser values(username7);

insert into AdminUser values(username8);

insert into AdminUser values(username9);

insert into AdminUser values(username10);

insert into RegularUser values(username2, 100.00);

insert into RegularUser values(username3, 53.24);

insert into RegularUser values(username4, 2342.75);

insert into RegularUser values(username5, 24.00);

insert into RegularUser values(username6, 0.00);
	
insert into RegularUser values(username7, 245.84);

insert into RegularUser values(username8, 0.00);

insert into RegularUser values(username9, 60.00);

insert into RegularUser values(username20, 153.45);

insert into RegularUser values(username21, 153512335.52);

insert into Friend values(username1, username2, '2017-1-10');
insert into Friend values(username2, username1, '2017-1-10');

insert into Friend values(username1, username3, '2017-2-10');
insert into Friend values(username3, username1, '2017-2-10');

insert into Friend values(username1, username4, '2017-3-10');
insert into Friend values(username4, username1, '2017-3-10');

insert into Friend values(username4, username5, '2017-4-10');
insert into Friend values(username5, username4, '2017-4-10');

insert into Friend values(username2, username3, '2017-5-10');
insert into Friend values(username3, username2, '2017-5-10');

insert into Friend values(username1, username5, '2017-6-10');
insert into Friend values(username5, username1, '2017-6-10');

insert into Friend values(username5, username21, '2017-7-10');
insert into Friend values(username21, username5, '2017-7-10');

insert into Friend values(username6, username7, '2017-8-10');
insert into Friend values(username7, username6, '2017-8-10');

insert into Friend values(username5, username6, '2017-9-10');
insert into Friend values(username6, username5, '2017-9-10');

insert into Friend values(username6, username9, '2017-10-10');
insert into Friend values(username9, username6, '2017-10-10');

insert into Payment values(username2, 00000000, '2017-11-10', 128.00, "Credit Card");

insert into Payment values(username2, 00000002, '2017-11-09', 99.00, "PayPal");

insert into Payment values(username3, 00000008, '2001-09-11', 39.00, "Debit Card");

insert into Payment values(username3, 00000009, '2017-11-09', 49.00, "PayPal");

insert into Payment values(username4, 00000003, '2017-11-09', 29.00, "Credit Card");

insert into Payment values(username4, 00000004, '2017-05-23', 167.00, "Account Credit");

insert into Payment values(username5, 00000005, '2017-05-31', 29.00, "Gift Card");

insert into Payment values(username6, 00000006, '2017-02-09', 19.00, "Debit Card");

insert into Payment values(username7, 00000007, '2017-10-23', 29.00, "Credit Card");

insert into Payment values(username2, 00000001, '2017-09-09', 0.00, "Instant Noodles");

insert into Developer values("Electronic Smarts");

insert into Developer values("Many Thinking Apes");

insert into Developer values("Macrosoft Studios");

insert into Developer values("Rito Games");

insert into Developer values("Valve");

insert into Developer values("Hatcom");

insert into Developer values("Fish Games");

insert into Developer values("MICE");

insert into Developer values("Deactivision");

insert into Developer values("Mediocre Games");

insert into Game values(0000000, 59.00, "Electronic Smarts", "Connect 4");

insert into Game values(0000001, 69.00, "Electronic Smarts", "Connect 5");

insert into Game values(0000002, 29.00, "Many Thinking Apes", "Party In My Basement");

insert into Game values(0000003, 19.00, "Macrosoft Studios", "Potato Ninja");

insert into Game values(0000004, 39.00, "Rito Games", "Legends of League");

insert into Game values(0000005, 59.00, "Valve", "The Lab");

insert into Game values(0000006, 59.00, "Valve", "The Potato");

insert into Game values(0000007, 49.00, "Fish Games", "Feed the Fish");

insert into Game values(0000008, 89.00, "MICE", "Micefield 1");

insert into Game values(0000009, 99.00, "Deactivision", "Call of Potatoes");

insert into IsGenre values(00000000, "MOBA");

insert into IsGenre values(00000001, "FPS");

insert into IsGenre values(00000002, "VR");

insert into IsGenre values(00000003, "Fun");

insert into IsGenre values(00000004, "RPG");

insert into IsGenre values(00000005, "Adventure");

insert into IsGenre values(00000006, "Survival");

insert into IsGenre values(00000007, "Strategy");

insert into IsGenre values(00000008, "Fantasy");

insert into IsGenre values(00000009, "Horror");

insert into Owns values(username2, 00000000, 59.00, '2017-11-10');

insert into Owns values(username2, 00000001, 69.00, '2017-11-05');

insert into Owns values(username3, 00000000, 59.00, '2015-11-10');

insert into Owns values(username4, 00000003, 19.00, '2013-09-11');

insert into Owns values(username5, 00000006, 59.00, '2013-12-04');

insert into Owns values(username6, 00000005, 59.00, '2016-07-29');

insert into Owns values(username7, 00000009, 99.00, '2017-11-01');

insert into Owns values(username8, 00000006, 59.00, '2017-02-11');

insert into Owns values(username9, 00000007, 79.00, '2001-11-10');

insert into Owns values(username10, 00000009, 99.00, '2010-02-25');

insert into DLC values(00000000, 00000004, "Summoner's Canyon", 19.00);

insert into DLC values(00000001, 00000002, "Alcohol Expansion", 19.00);

insert into DLC values(00000002, 00000005, "For Science!", 19.00);

insert into DLC values(00000003, 00000008, "French Stuff", 19.00);

insert into DLC values(00000004, 00000004, "New Champinos", 19.00);

insert into DLC values(00000005, 00000009, "Tomatoes Invade", 19.00);

insert into DLC values(00000006, 00000008, "French Mice", 29.00);

insert into DLC values(00000007, 00000006, "Free Stuff", 0.00);

insert into DLC values(00000008, 00000003, "Tomato Ninja", 19.00);

insert into DLC values(00000009, 00000008, "Russian Mice", 19.00);

commit work;
