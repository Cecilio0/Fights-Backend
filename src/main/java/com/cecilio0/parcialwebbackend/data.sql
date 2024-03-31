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

insert into fighters (id_fighter, name, biography, id_base_class, strength, dexterity, constitution, intelligence, wisdom, charisma) values (1, 'Géraldine', 'Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus.', 12, 22, 20, 6, 9, 21, 16);
insert into fighters (id_fighter, name, biography, id_base_class, strength, dexterity, constitution, intelligence, wisdom, charisma) values (2, 'Nuó', 'Aenean fermentum. Donec ut mauris eget massa tempor convallis.', 9, 16, 1, 20, 25, 22, 11);
insert into fighters (id_fighter, name, biography, id_base_class, strength, dexterity, constitution, intelligence, wisdom, charisma) values (3, 'Vénus', 'Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis. Fusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl.', 8, 24, 19, 27, 20, 13, 24);
insert into fighters (id_fighter, name, biography, id_base_class, strength, dexterity, constitution, intelligence, wisdom, charisma) values (4, 'Cecilio', 'Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl.', 6, 30, 29, 1, 9, 2, 20);
insert into fighters (id_fighter, name, biography, id_base_class, strength, dexterity, constitution, intelligence, wisdom, charisma) values (5, 'Cécilia', 'Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis.', 7, 18, 20, 17, 24, 9, 11);
insert into fighters (id_fighter, name, biography, id_base_class, strength, dexterity, constitution, intelligence, wisdom, charisma) values (6, 'Personnalisée', 'Nulla mollis molestie lorem. Quisque ut erat.', 9, 26, 0, 9, 17, 8, 26);
insert into fighters (id_fighter, name, biography, id_base_class, strength, dexterity, constitution, intelligence, wisdom, charisma) values (7, 'Mylène', 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio.', 11, 0, 2, 2, 28, 27, 22);
insert into fighters (id_fighter, name, biography, id_base_class, strength, dexterity, constitution, intelligence, wisdom, charisma) values (8, 'Maëlle', 'Morbi non quam nec dui luctus rutrum.', 9, 3, 5, 2, 20, 30, 28);
insert into fighters (id_fighter, name, biography, id_base_class, strength, dexterity, constitution, intelligence, wisdom, charisma) values (9, 'Estée', 'Morbi vel lectus in quam fringilla rhoncus. Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci.', 3, 21, 4, 25, 28, 28, 26);
insert into fighters (id_fighter, name, biography, id_base_class, strength, dexterity, constitution, intelligence, wisdom, charisma) values (10, 'Åsa', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin risus.', 10, 27, 25, 6, 5, 28, 6);
insert into fighters (id_fighter, name, biography, id_base_class, strength, dexterity, constitution, intelligence, wisdom, charisma) values (11, 'Gwenaëlle', 'In hac habitasse platea dictumst. Maecenas ut massa quis augue luctus tincidunt. Nulla mollis molestie lorem.', 2, 25, 13, 10, 9, 2, 4);
insert into fighters (id_fighter, name, biography, id_base_class, strength, dexterity, constitution, intelligence, wisdom, charisma) values (12, 'Pélagie', 'Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis. Fusce posuere felis sed lacus.', 12, 10, 22, 29, 28, 2, 13);
insert into fighters (id_fighter, name, biography, id_base_class, strength, dexterity, constitution, intelligence, wisdom, charisma) values (13, 'Lorène', 'Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante.', 1, 3, 29, 7, 28, 20, 18);
insert into fighters (id_fighter, name, biography, id_base_class, strength, dexterity, constitution, intelligence, wisdom, charisma) values (14, 'Laurène', 'Aenean auctor gravida sem. Praesent id massa id nisl venenatis lacinia.', 12, 7, 29, 15, 20, 20, 0);
insert into fighters (id_fighter, name, biography, id_base_class, strength, dexterity, constitution, intelligence, wisdom, charisma) values (15, 'Joséphine', 'Nulla justo. Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros.', 12, 30, 6, 16, 0, 0, 10);
insert into fighters (id_fighter, name, biography, id_base_class, strength, dexterity, constitution, intelligence, wisdom, charisma) values (16, 'Märta', 'Integer a nibh. In quis justo. Maecenas rhoncus aliquam lacus.', 1, 24, 3, 30, 7, 13, 18);
insert into fighters (id_fighter, name, biography, id_base_class, strength, dexterity, constitution, intelligence, wisdom, charisma) values (17, 'Régine', 'Morbi non lectus.', 7, 26, 9, 21, 5, 25, 1);
insert into fighters (id_fighter, name, biography, id_base_class, strength, dexterity, constitution, intelligence, wisdom, charisma) values (18, 'Josée', 'Morbi non quam nec dui luctus rutrum.', 3, 16, 2, 12, 3, 10, 27);
insert into fighters (id_fighter, name, biography, id_base_class, strength, dexterity, constitution, intelligence, wisdom, charisma) values (19, 'Anaïs', 'Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh. Quisque id justo sit amet sapien dignissim vestibulum.', 2, 9, 6, 30, 18, 20, 8);
insert into fighters (id_fighter, name, biography, id_base_class, strength, dexterity, constitution, intelligence, wisdom, charisma) values (20, 'Gérald', 'Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim. Lorem ipsum dolor sit amet, consectetuer adipiscing elit.', 8, 8, 14, 26, 0, 11, 19);

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