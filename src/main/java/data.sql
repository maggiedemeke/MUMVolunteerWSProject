

INSERT INTO `organization` (`id`, `name`, `status`,`description`) VALUES
	(1, 'MUM', "ACTIVE","IT IS ONE OF THE MOST INFLUENTIAL ORGANIZATION IN FAIRFEILD"),
	(2, 'WALMART', "ACTIVE", "THIS MARKET IS ONE OF THE MOST CONTRIBUTING COMPANIES FOR MANY PROJECTS"),
	(3, 'LOGLIS', "INACTIVE", "COMPANY INFORMATION HERE");



INSERT INTO `project` (`id`, `start_date`, `category`, `end_date`, `max_num_of_memebers`, `name`, `status`, `organization_id`,`description`) VALUES
(1, '2017-08-08', 'TUTOR', '2017-08-23', 10, 'ENGLISH CLASSES', 'NEW', 1, 'This is a big project led by Maharishi Univeristy of Management');

INSERT INTO `project` (`id`, `start_date`, `category`, `end_date`, `max_num_of_memebers`, `name`, `status`, `organization_id`,`description`) VALUES
(2, '2017-08-09', 'EVENTS', '2017-08-30', 20, 'Planting trees', 'INPROGRESS', 1, 'This is another big project inprogress led by Maharishi Univeristy of Management');


INSERT INTO `project` (`id`, `start_date`, `category`, `end_date`, `max_num_of_memebers`, `name`, `status`, `organization_id`,`description`) VALUES
(3, '2016-08-09', 'EVENTS', '2016-08-30', 20, 'Planting trees', 'COMPLETED', 1, 'This is another big project completed led by Maharishi Univeristy of Management');

INSERT INTO `activity` (`id`, `name`, `project_id`) VALUES
	(1, 'tutorial1', 1),
	(2, 'tutorial2', 1),
	(3, 'tutorial3', 1);

INSERT INTO `user` (`id`, `email`, `first_name`, `last_name`, `hours`, `password`, `username`) VALUES
	(1, 'german.andres.segura@gmail.com', 'GERMAN', 'SEGURA', '0', 'gsegura', 'gsegura');


INSERT INTO `role` (`id`, `role`, `user_id`) VALUES
	(1, 'ROLE_MEMBER', 1),
	(2, 'ROLE_ADMIN', 1); 
	