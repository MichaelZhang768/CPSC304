use cpsc304;

create table Store (
storeId integer not null,
PRIMARY KEY (storeId));

create table User (
email varchar(30) not null,
userId integer not null,
password varchar(16) not null,
username varchar(16) not null,
PRIMARY KEY (userId));

create table AdminUser (
userId integer not null,
PRIMARY KEY (userId),
foreign key (userId) references User(userId));

create table RegularUser (
userId integer not null,
storeId integer not null,
accountBalance float(32) not null,
PRIMARY KEY (userId),
foreign key (userId) references User(userId),
foreign key (storeId) references Store(storeId));

create table Friend (
userId1 integer not null,
userId2 integer not null,
PRIMARY KEY (userId1, userId2),
foreign key (userId1) references User(userId),
foreign key (userId2) references User(userId));

create table Manages (
userId1 integer not null,
userId2 integer not null,
PRIMARY KEY (userId1, userId2),
foreign key (userId1) references AdminUser(userId),
foreign key (userId2) references RegularUser(userId));

create table Cart (
cartId integer not null,
totalCost float(16) not null,
PRIMARY KEY (cartId));

create table Payment (
userId integer not null,
cartId integer not null,
paymentNumber integer not null,
dateOfPayment date not null,
cost float(16) not null,
paymentMethod varchar(16) not null,
PRIMARY KEY (userId, paymentNumber),
foreign key (cartId) references Cart(cartId),
foreign key (userId) references RegularUser(userId) ON DELETE CASCADE);

create table Developer (
developerId integer not null,
developerName varchar(32) not null,
PRIMARY KEY (developerId));

create table Game (
gameId integer not null,
totalCost float(16) not null,
developerId integer not null,
storeId integer not null,
gameName varchar(32) not null,
PRIMARY KEY (gameId),
foreign key (developerId) references Developer(developerId),
foreign key (storeId) references Store(storeId));

create table DLC (
dlcId integer not null,
gameId integer not null,
dlcName varchar(32) not null,
dlcPrice float(32) not null,
PRIMARY KEY (dlcId, gameId),
foreign key (gameId) references Game(gameId) ON DELETE CASCADE);

create table Owns (
userId integer not null,
gameId integer not null,
purchasePrice float(32) not null,
dateOfPurchase date not null,
PRIMARY KEY (userId, gameId),
foreign key (userId) references User(userId),
foreign key (gameId) references Game(gameId));

create table Contains (
cartId integer not null,
gameId integer,
PRIMARY KEY (cartId, gameId),
foreign key (cartId) references Cart(cartId),
foreign key (gameId) references Game(gameId));

create table Genre (
genreId integer not null,
genreName varchar(16) not null,
PRIMARY KEY (genreId));

create table Has (
gameId integer not null,
genreId integer not null,
PRIMARY KEY (gameId, genreId),
foreign key (gameId) references Game(gameId),
foreign key (genreId) references Genre(genreId));

commit;