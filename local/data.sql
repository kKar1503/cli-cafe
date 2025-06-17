# Dump of table category
# ------------------------------------------------------------

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;

INSERT INTO `category` (`id`, `name`, `description`)
VALUES
	(1,'Appetizers','Light dishes served before the main course.'),
	(2,'Main Courses','Hearty dishes served as the primary meal.'),
	(3,'Desserts','Sweet dishes served after the main course.'),
	(4,'Beverages','Drinks served hot or cold.'),
	(5,'Salads','Fresh and healthy vegetable or fruit-based dishes.');

/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table food
# ------------------------------------------------------------

LOCK TABLES `food` WRITE;
/*!40000 ALTER TABLE `food` DISABLE KEYS */;

INSERT INTO `food` (`id`, `name`, `description`, `price`, `category_id`)
VALUES
	(1,'Spring Rolls','Crispy rolls filled with vegetables and glass noodles.',5.5,1),
	(2,'Garlic Bread','Toasted bread with garlic butter and herbs.',4,1),
	(3,'Chicken Wings','Fried chicken wings tossed in spicy sauce.',7,1),
	(4,'Bruschetta','Grilled bread topped with diced tomatoes and basil.',6,1),
	(5,'Grilled Salmon','Salmon fillet grilled and served with lemon butter.',18.5,2),
	(6,'Beef Steak','Juicy grilled steak with peppercorn sauce.',22,2),
	(7,'Spaghetti Carbonara','Classic pasta with bacon, eggs, and cheese.',13,2),
	(8,'Chicken Teriyaki','Grilled chicken glazed with teriyaki sauce.',14.5,2),
	(9,'Vegetable Stir-fry','Mixed veggies sautéed with soy sauce and garlic.',11,2),
	(10,'Chocolate Lava Cake','Warm chocolate cake with molten center.',8,3),
	(11,'Vanilla Ice Cream','Classic vanilla ice cream scoop.',4.5,3),
	(12,'Cheesecake','Rich and creamy cheesecake with a graham crust.',7,3),
	(13,'Fruit Tart','Mini tart with custard and assorted fruits.',6,3),
	(14,'Coca-Cola','Chilled soft drink.',2.5,4),
	(15,'Iced Lemon Tea','Refreshing tea with lemon.',3,4),
	(16,'Espresso','Strong black coffee.',3.5,4),
	(17,'Matcha Latte','Green tea latte with milk.',4.5,4),
	(18,'Caesar Salad','Romaine lettuce with Caesar dressing and croutons.',9,5),
	(19,'Greek Salad','Tomatoes, cucumber, feta cheese, and olives.',8.5,5),
	(20,'Quinoa Salad','Healthy quinoa with vegetables and lemon dressing.',10,5);

/*!40000 ALTER TABLE `food` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table receipt
# ------------------------------------------------------------

LOCK TABLES `receipt` WRITE;
/*!40000 ALTER TABLE `receipt` DISABLE KEYS */;

INSERT INTO `receipt` (`id`)
VALUES
	(1),
	(2),
	(3),
	(4),
	(5),
	(6),
	(7);

/*!40000 ALTER TABLE `receipt` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table receipt_items
# ------------------------------------------------------------

LOCK TABLES `receipt_items` WRITE;
/*!40000 ALTER TABLE `receipt_items` DISABLE KEYS */;

INSERT INTO `receipt_items` (`receipt_id`, `food_id`, `count`)
VALUES
	(1,1,2),
	(1,2,1),
	(2,5,1),
	(2,17,2),
	(3,11,1),
	(3,12,1),
	(3,17,1),
	(4,4,1),
	(4,6,1),
	(4,18,1),
	(5,10,1),
	(6,8,2),
	(7,2,1),
	(7,3,2),
	(7,13,1),
	(7,19,1);

/*!40000 ALTER TABLE `receipt_items` ENABLE KEYS */;
UNLOCK TABLES;