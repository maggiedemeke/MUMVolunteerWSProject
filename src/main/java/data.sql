
INSERT INTO `organization` (`id`, `name`, `status`) VALUES
	(1, 'MUM', 1),
	(2, 'WALMART', 1),
	(3, 'LOGLIS', 0);



INSERT INTO `project` (`id`, `start_date`, `category`, `end_date`, `max_num_of_memebers`, `name`, `status`, `organization_id`) VALUES
(1, '2017-08-08', 'TUTOR', '2017-08-23', 10, 'ENGLISH CLASSES', 'NEW', 1);
