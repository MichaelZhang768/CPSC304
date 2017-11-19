use sql3205841;

create table User (
email varchar(30) not null,
password varchar(16) not null,
username varchar(16) not null,
PRIMARY KEY (username));

create table AdminUser (
username varchar(16) not null,
PRIMARY KEY (username),
foreign key (username) references User(username));

create table RegularUser (
username varchar(16) not null,
accountBalance float(32) not null,
PRIMARY KEY (username),
foreign key (username) references User(username));

create table Friend (
username1 varchar(16) not null,
username2 varchar(16) not null,
dateOfFriendship date not null,
PRIMARY KEY (username1, username2),
foreign key (username1) references User(username),
foreign key (username2) references User(username));


create table Payment (
username varchar(16) not null,
paymentNumber integer not null,
dateOfPayment date not null,
cost float(16) not null,
paymentMethod varchar(16) not null,
PRIMARY KEY (username, paymentNumber),
foreign key (username) references RegularUser(username));

create table Developer (
developerId integer not null,
developerName varchar(32) not null,
PRIMARY KEY (developerId));

create table Game (
gameId integer not null,
totalCost float(16) not null,
developerId integer not null,
gameName varchar(32) not null,
PRIMARY KEY (gameId),
foreign key (developerId) references Developer(developerId));

create table DLC (
dlcId integer not null,
gameId integer not null,
dlcName varchar(32) not null,
dlcPrice float(32) not null,
PRIMARY KEY (dlcId, gameId),
foreign key (gameId) references Game(gameId) ON DELETE CASCADE);

create table Owns (
username varchar(16) not null,
gameId integer not null,
purchasePrice float(32) not null,
dateOfPurchase date not null,
PRIMARY KEY (username, gameId),
foreign key (username) references User(username),
foreign key (gameId) references Game(gameId));

create table Genre (
genreName varchar(16) not null,
PRIMARY KEY (genreName));

create table Has (
gameId integer not null,
genreName varchar(16) not null,
PRIMARY KEY (gameId, genreName),
foreign key (gameId) references Game(gameId),
foreign key (genreName) references Genre(genreName));

commit;