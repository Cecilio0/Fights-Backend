insert into abilities (id_ability, name, power) values (1, 'Clarity Clear Skin Essentials', 20);
insert into abilities (id_ability, name, power) values (2, 'Headache - Migraine', 4);
insert into abilities (id_ability, name, power) values (3, 'METHOTREXATE', 8);
insert into abilities (id_ability, name, power) values (4, 'CRIXIVAN', 13);
insert into abilities (id_ability, name, power) values (5, 'flormar Soft Touch Foundation Sunscreen Broad Spectrum SPF 20 ST03 Natural Pink', 23);

insert into subplots (id_subplot, info) values (1, 'In congue. Etiam justo. Etiam pretium iaculis justo. In hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus. Nulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi. Cras non velit nec nisi vulputate nonummy. Maecenas tincidunt lacus at velit. Vivamus vel nulla eget eros elementum pellentesque. Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus. Phasellus in felis. Donec semper sapien a libero. Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis.');
insert into subplots (id_subplot, info) values (2, 'Proin eu mi. Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem. Duis aliquam convallis nunc. Proin at turpis a pede posuere nonummy. Integer non velit. Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec pharetra, magna vestibulum aliquet ultrices, erat tortor sollicitudin mi, sit amet lobortis sapien sapien non mi. Integer ac neque. Duis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus. In sagittis dui vel nisl. Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus. Suspendisse potenti. In eleifend quam a odio. In hac habitasse platea dictumst.');
insert into subplots (id_subplot, info) values (3, 'Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem. Duis aliquam convallis nunc. Proin at turpis a pede posuere nonummy. Integer non velit. Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec pharetra, magna vestibulum aliquet ultrices, erat tortor sollicitudin mi, sit amet lobortis sapien sapien non mi. Integer ac neque. Duis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus. In sagittis dui vel nisl. Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus. Suspendisse potenti. In eleifend quam a odio. In hac habitasse platea dictumst. Maecenas ut massa quis augue luctus tincidunt. Nulla mollis molestie lorem. Quisque ut erat.');
insert into subplots (id_subplot, info) values (4, 'Vestibulum sed magna at nunc commodo placerat. Praesent blandit. Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede. Morbi porttitor lorem id ligula. Suspendisse ornare consequat lectus. In est risus, auctor sed, tristique in, tempus sit amet, sem. Fusce consequat. Nulla nisl. Nunc nisl. Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa. Donec dapibus.');
insert into subplots (id_subplot, info) values (5, 'Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus. Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Etiam vel augue. Vestibulum rutrum rutrum neque. Aenean auctor gravida sem. Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio. Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue.');

INSERT INTO base_classes(id_base_class, name, main_attribute, secondary_attribute)
VALUES
	(1, 'barbarian','strength','constitution'),
	(2, 'bard','charisma','dexterity'),
	(3, 'cleric','wisdom','charisma'),
	(4, 'druid','wisdom','intelligence'),
	(5, 'fighter','strength','dexterity'),
	(6, 'monk','dexterity','wisdom'),
	(7, 'paladin','strength','charisma'),
	(8, 'ranger','dexterity','wisdom'),
	(9, 'rogue','dexterity','intelligence'),
	(10, 'sorcerer','charisma','constitution'),
	(11, 'warlock','charisma','wisdom'),
	(12, 'wizard','intelligence','wisdom');

insert into fighters (id_fighter, name, biography, id_base_class, hp, strength, dexterity, constitution, intelligence, wisdom, charisma) values (1, 'Cecilio', 'Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue.', 3, 79, 27, 9, 2, 30, 30, 16);
insert into fighters (id_fighter, name, biography, id_base_class, hp, strength, dexterity, constitution, intelligence, wisdom, charisma) values (2, 'Laurélie', 'Vivamus in felis eu sapien cursus vestibulum.', 11, 8, 2, 12, 8, 30, 18, 20);
insert into fighters (id_fighter, name, biography, id_base_class, hp, strength, dexterity, constitution, intelligence, wisdom, charisma) values (3, 'Östen', 'Fusce consequat. Nulla nisl. Nunc nisl.', 1, 10, 9, 19, 23, 0, 26, 3);
insert into fighters (id_fighter, name, biography, id_base_class, hp, strength, dexterity, constitution, intelligence, wisdom, charisma) values (4, 'Stévina', 'Nam dui.', 4, 62, 16, 6, 21, 2, 21, 8);
insert into fighters (id_fighter, name, biography, id_base_class, hp, strength, dexterity, constitution, intelligence, wisdom, charisma) values (5, 'Jú', 'In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem. Duis aliquam convallis nunc.', 11, 73, 0, 21, 14, 29, 8, 6);
insert into fighters (id_fighter, name, biography, id_base_class, hp, strength, dexterity, constitution, intelligence, wisdom, charisma) values (6, 'Danièle', 'In congue.', 4, 61, 27, 27, 24, 14, 2, 9);
insert into fighters (id_fighter, name, biography, id_base_class, hp, strength, dexterity, constitution, intelligence, wisdom, charisma) values (7, 'Personnalisée', 'Morbi a ipsum. Integer a nibh.', 4, 7, 20, 2, 12, 11, 8, 21);
insert into fighters (id_fighter, name, biography, id_base_class, hp, strength, dexterity, constitution, intelligence, wisdom, charisma) values (8, 'Marie-hélène', 'Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus.', 10, 73, 22, 24, 22, 15, 22, 14);
insert into fighters (id_fighter, name, biography, id_base_class, hp, strength, dexterity, constitution, intelligence, wisdom, charisma) values (9, 'Léonore', 'Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede. Morbi porttitor lorem id ligula.', 8, 2, 3, 11, 17, 24, 28, 20);
insert into fighters (id_fighter, name, biography, id_base_class, hp, strength, dexterity, constitution, intelligence, wisdom, charisma) values (10, 'Örjan', 'Aliquam quis turpis eget elit sodales scelerisque.', 2, 77, 21, 6, 16, 22, 12, 8);
insert into fighters (id_fighter, name, biography, id_base_class, hp, strength, dexterity, constitution, intelligence, wisdom, charisma) values (11, 'Dà', 'Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo.', 1, 45, 7, 12, 2, 13, 27, 14);
insert into fighters (id_fighter, name, biography, id_base_class, hp, strength, dexterity, constitution, intelligence, wisdom, charisma) values (12, 'Maëlla', 'Nulla nisl. Nunc nisl. Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa.', 8, 6, 5, 2, 11, 22, 18, 16);
insert into fighters (id_fighter, name, biography, id_base_class, hp, strength, dexterity, constitution, intelligence, wisdom, charisma) values (13, 'Cécilia', 'Integer ac leo. Pellentesque ultrices mattis odio. Donec vitae nisi.', 7, 51, 4, 23, 2, 8, 24, 15);
insert into fighters (id_fighter, name, biography, id_base_class, hp, strength, dexterity, constitution, intelligence, wisdom, charisma) values (14, 'Kù', 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis.', 1, 36, 6, 12, 11, 19, 0, 1);
insert into fighters (id_fighter, name, biography, id_base_class, hp, strength, dexterity, constitution, intelligence, wisdom, charisma) values (15, 'Nélie', 'Nulla tempus. Vivamus in felis eu sapien cursus vestibulum. Proin eu mi.', 12, 13, 25, 19, 2, 10, 1, 1);
insert into fighters (id_fighter, name, biography, id_base_class, hp, strength, dexterity, constitution, intelligence, wisdom, charisma) values (16, 'Pò', 'Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh. Quisque id justo sit amet sapien dignissim vestibulum.', 4, 1, 29, 13, 8, 12, 5, 9);
insert into fighters (id_fighter, name, biography, id_base_class, hp, strength, dexterity, constitution, intelligence, wisdom, charisma) values (17, 'Mårten', 'Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros. Vestibulum ac est lacinia nisi venenatis tristique.', 5, 72, 30, 21, 8, 1, 18, 17);
insert into fighters (id_fighter, name, biography, id_base_class, hp, strength, dexterity, constitution, intelligence, wisdom, charisma) values (18, 'Liè', 'Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis. Fusce posuere felis sed lacus.', 9, 31, 17, 6, 6, 11, 6, 6);
insert into fighters (id_fighter, name, biography, id_base_class, hp, strength, dexterity, constitution, intelligence, wisdom, charisma) values (19, 'Andrée', 'Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo. Aliquam quis turpis eget elit sodales scelerisque.', 3, 44, 23, 5, 15, 8, 22, 22);
insert into fighters (id_fighter, name, biography, id_base_class, hp, strength, dexterity, constitution, intelligence, wisdom, charisma) values (20, 'Camélia', 'Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus.', 4, 69, 1, 13, 18, 8, 20, 19);

insert into fighters_subplots (id_fighter, id_subplot) values (11, 3);
insert into fighters_subplots (id_fighter, id_subplot) values (8, 2);
insert into fighters_subplots (id_fighter, id_subplot) values (4, 1);
insert into fighters_subplots (id_fighter, id_subplot) values (16, 4);
insert into fighters_subplots (id_fighter, id_subplot) values (12, 4);
insert into fighters_subplots (id_fighter, id_subplot) values (11, 1);
insert into fighters_subplots (id_fighter, id_subplot) values (14, 5);
insert into fighters_subplots (id_fighter, id_subplot) values (6, 5);
insert into fighters_subplots (id_fighter, id_subplot) values (8, 3);
insert into fighters_subplots (id_fighter, id_subplot) values (13, 1);
insert into fighters_subplots (id_fighter, id_subplot) values (20, 3);
insert into fighters_subplots (id_fighter, id_subplot) values (1, 4);
insert into fighters_subplots (id_fighter, id_subplot) values (2, 3);
insert into fighters_subplots (id_fighter, id_subplot) values (13, 2);
insert into fighters_subplots (id_fighter, id_subplot) values (11, 5);
insert into fighters_subplots (id_fighter, id_subplot) values (10, 4);
insert into fighters_subplots (id_fighter, id_subplot) values (12, 3);
insert into fighters_subplots (id_fighter, id_subplot) values (16, 1);
insert into fighters_subplots (id_fighter, id_subplot) values (1, 3);
insert into fighters_subplots (id_fighter, id_subplot) values (20, 3);
insert into fighters_subplots (id_fighter, id_subplot) values (12, 4);
insert into fighters_subplots (id_fighter, id_subplot) values (2, 3);
insert into fighters_subplots (id_fighter, id_subplot) values (2, 3);
insert into fighters_subplots (id_fighter, id_subplot) values (11, 5);
insert into fighters_subplots (id_fighter, id_subplot) values (5, 4);

insert into fighters_abilities (id_ability, id_fighter) values (1, 12);
insert into fighters_abilities (id_ability, id_fighter) values (2, 15);
insert into fighters_abilities (id_ability, id_fighter) values (4, 16);
insert into fighters_abilities (id_ability, id_fighter) values (1, 5);
insert into fighters_abilities (id_ability, id_fighter) values (2, 6);
insert into fighters_abilities (id_ability, id_fighter) values (3, 15);
insert into fighters_abilities (id_ability, id_fighter) values (3, 19);
insert into fighters_abilities (id_ability, id_fighter) values (4, 11);
insert into fighters_abilities (id_ability, id_fighter) values (1, 9);
insert into fighters_abilities (id_ability, id_fighter) values (1, 14);
insert into fighters_abilities (id_ability, id_fighter) values (5, 1);
insert into fighters_abilities (id_ability, id_fighter) values (5, 12);
insert into fighters_abilities (id_ability, id_fighter) values (1, 8);
insert into fighters_abilities (id_ability, id_fighter) values (3, 4);
insert into fighters_abilities (id_ability, id_fighter) values (1, 11);
insert into fighters_abilities (id_ability, id_fighter) values (4, 9);
insert into fighters_abilities (id_ability, id_fighter) values (4, 14);
insert into fighters_abilities (id_ability, id_fighter) values (4, 16);
insert into fighters_abilities (id_ability, id_fighter) values (3, 18);
insert into fighters_abilities (id_ability, id_fighter) values (5, 7);
insert into fighters_abilities (id_ability, id_fighter) values (2, 1);
insert into fighters_abilities (id_ability, id_fighter) values (2, 9);
insert into fighters_abilities (id_ability, id_fighter) values (4, 7);
insert into fighters_abilities (id_ability, id_fighter) values (3, 15);
insert into fighters_abilities (id_ability, id_fighter) values (4, 10);