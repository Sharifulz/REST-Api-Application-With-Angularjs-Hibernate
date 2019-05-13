CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
 
INSERT INTO `admin` VALUES (1,'munna','moon@gmail.com','123');

CREATE TABLE `commenthighlights` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(25) DEFAULT NULL,
  `comment` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `commenthighlights` VALUES (1,1,'Amazing post. Keep it up'),(2,1,'Keep it up'),
(3,2,'Keep it up'),(4,2,'It was a nice post'),(5,3,'It was a nice post'),(6,3,'Last comment'),
(7,2,'Highlist comment from ui'),(8,1,'Thank You again');

CREATE TABLE `commentmorning` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(25) DEFAULT NULL,
  `comment` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `commentmorning` VALUES (1,1,'It was a nice post'),(2,1,'Thanks for your post');

CREATE TABLE `commentscience` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(25) DEFAULT NULL,
  `comment` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
INSERT INTO `commentscience` VALUES (1,1,'Excellent post, keep it up sir.'),(2,1,'Excellent post, keep it up sir.'),
(3,1,'t, keep it up sir.'),(4,1,'I thing you are right.'),(5,2,'I thing you are right.'),
(6,2,'Whats next?'),(7,2,'Amazing post. Keep it up'),
(8,1,'This is a new Comment');

CREATE TABLE `highlights` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `post` varchar(500) DEFAULT NULL,
  `date` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`pid`)
);
INSERT INTO `highlights` VALUES (1,'Politics In Bangladesh','Lorem ipsum dolor sit amet, consectetur adipisicing elit. Libero quam blanditiis distinctio error, dolor fuga placeat quo, qui dolorum? Cum nihil possimus temporibus eaque nesciunt illo eius inventore vero veniam veritatis','25 February,2019'),(2,'Politics In Canada','Lorem ipsum dolor sit amet, consectetur adipisicing elit. Libero quam blanditiis distinctio error, dolor fuga placeat quo, qui dolorum? Cum nihil possimus temporibus eaque nesciunt illo eius inventore vero veniam veritatis','25 February,2019'),(3,'Politics In Inno Sumalia','Lorem ipsum dolor sit amet, consectetur adipisicing elit. Libero quam blanditiis distinctio error, dolor fuga placeat quo, qui dolorum? Cum nihil possimus temporibus eaque nesciunt illo eius inventore vero veniam veritatis','25 February,2019'),(6,'Highlightsn Title (Dipty)','This is some post article textThis is some post article textThis is some post article textThis is some post article textThis is some post article text','11 May, 2019');

CREATE TABLE `member` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
INSERT INTO `member` VALUES (1,'munna','moon@gmail.com','123'),(5,'munia','moon@gmail.com','123'),
(6,'shaarif','shaarifulz@gmail.com','123'),(7,'dipty','deep@gmail.com','123');

CREATE TABLE `morning` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `post` varchar(500) DEFAULT NULL,
  `date` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`pid`)
);
INSERT INTO `morning` VALUES (1,'Good Morning Bangladesh','Lorem ipsum dolor sit amet, consectetur adipisicing elit. Libero quam blanditiis distinctio error, dolor fuga placeat quo, qui dolorum? Cum nihil possimus temporibus eaque nesciunt illo eius inventore vero veniam veritatis','25 February,2019'),(2,'Good Morning India','Lorem ipsum dolor sit amet, consectetur adipisicing elit. Libero quam blanditiis distinctio error, dolor fuga placeat quo, qui dolorum? Cum nihil possimus temporibus eaque nesciunt illo eius inventore vero veniam veritatis','25 February,2019'),(3,'Good Morning Katalunia','Lorem ipsum dolor sit amet, consectetur adipisicing elit. Libero quam blanditiis distinctio error, dolor fuga placeat quo, qui dolorum? Cum nihil possimus temporibus eaque nesciunt illo eius inventore vero veniam veritatis','25 February,2019');

CREATE TABLE `science` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `post` varchar(500) DEFAULT NULL,
  `date` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`pid`)
);
INSERT INTO `science` VALUES (1,'Science Agency','Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quibusdam sequi dicta sapiente eveniet consectetur odit, corporis commodi facere alias eligendi ullam saepe soluta adipisci impedit libero est laudantium animi non ut totam eius blanditiis! Officia rem deserunt mollitia fuga, temporibus. Quis aperiam cumque voluptas ad, soluta consequuntur doloremque cum sint rem. Reprehenderit, architecto quasi impedit perspiciatis iu.','25 April,2019'),(2,'Women Empowerment','Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quibusdam sequi dicta sapiente eveniet consectetur odit, corporis commodi facere alias eligendi ullam saepe soluta adipisci impedit libero est laudantium animi non ut totam eius blanditiis! Officia rem deserunt mollitia fuga, temporibus. Quis aperiam cumque voluptas ad, soluta consequuntur doloremque cum sint rem. Reprehenderit, architecto quasi impedit perspiciatis iu.','25 February,2019'),(3,'Price Hiking In Bangladesh','Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quibusdam sequi dicta sapiente eveniet consectetur odit, corporis commodi facere alias eligendi ullam saepe soluta adipisci impedit libero est laudantium animi non ut totam eius blanditiis! Officia rem deserunt mollitia fuga, temporibus. Quis aperiam cumque voluptas ad, soluta consequuntur doloremque cum sint rem. Reprehenderit, architecto quasi impedit perspiciatis iu.','25 February,2019');
