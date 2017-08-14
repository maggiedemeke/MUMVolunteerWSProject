
INSERT INTO `organization` (`id`, `name`, `status`) VALUES
	(1, 'MUM', "ACTIVE"),
	(2, 'WALMART', "ACTIVE"),
	(3, 'LOGLIS', "INACTIVE");



INSERT INTO `project` (`id`, `start_date`, `category`, `end_date`, `max_num_of_memebers`, `name`, `status`, `organization_id`) VALUES
(1, '2017-08-08', 'TUTOR', '2017-08-23', 10, 'ENGLISH CLASSES', 'NEW', 1);
