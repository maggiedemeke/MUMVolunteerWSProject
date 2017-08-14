

INSERT INTO `organization` (`id`, `name`, `status`) VALUES
	(1, 'MUM', "ACTIVE"),
	(2, 'WALMART', "ACTIVE"),
	(3, 'LOGLIS', "INACTIVE");



INSERT INTO `project` (`id`, `start_date`, `category`, `end_date`, `max_num_of_memebers`, `name`, `status`, `organization_id`) VALUES
(1, '2017-08-08', 'TUTOR', '2017-08-23', 10, 'ENGLISH CLASSES', 'NEW', 1);


INSERT INTO `activity` (`id`, `name`, `project_id`) VALUES
	(1, 'tutorial1', 1),
	(2, 'tutorial2', 1),
	(3, 'tutorial3', 1);

