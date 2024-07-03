insert into tb_category (name) values ('Pistolas');
insert into tb_category (name) values ('Submetralhadoras');
insert into tb_category (name) values ('Espingardas');
insert into tb_category (name) values ('Metralhadoras');
insert into tb_category (name) values ('Rifles');
insert into tb_category (name) values ('Snipers');
insert into tb_category (name) values ('Facas');


INSERT INTO tb_model (name) VALUES ('AK-47');
INSERT INTO tb_model (name) VALUES ('M4A1-S');
INSERT INTO tb_model (name) VALUES ('AWP');
INSERT INTO tb_model (name) VALUES ('M4A4');
INSERT INTO tb_model (name) VALUES ('Glock-18');
INSERT INTO tb_model (name) VALUES ('USP-S');
INSERT INTO tb_model (name) VALUES ('Desert Eagle');
INSERT INTO tb_model (name) VALUES ('P250');
INSERT INTO tb_model (name) VALUES ('Five-SeveN');
INSERT INTO tb_model (name) VALUES ('Tec-9');
INSERT INTO tb_model (name) VALUES ('CZ75-Auto');
INSERT INTO tb_model (name) VALUES ('Dual Berettas');
INSERT INTO tb_model (name) VALUES ('P90');
INSERT INTO tb_model (name) VALUES ('MP7');
INSERT INTO tb_model (name) VALUES ('MP9');
INSERT INTO tb_model (name) VALUES ('MAC-10');
INSERT INTO tb_model (name) VALUES ('UMP-45');
INSERT INTO tb_model (name) VALUES ('PP-Bizon');
INSERT INTO tb_model (name) VALUES ('FAMAS');
INSERT INTO tb_model (name) VALUES ('Galil AR');
INSERT INTO tb_model (name) VALUES ('SSG 08');
INSERT INTO tb_model (name) VALUES ('SCAR-20');
INSERT INTO tb_model (name) VALUES ('G3SG1');
INSERT INTO tb_model (name) VALUES ('Nova');
INSERT INTO tb_model (name) VALUES ('XM1014');
INSERT INTO tb_model (name) VALUES ('MAG-7');
INSERT INTO tb_model (name) VALUES ('Sawed-Off');
INSERT INTO tb_model (name) VALUES ('M249');
INSERT INTO tb_model (name) VALUES ('Negev');
INSERT INTO tb_model (name) VALUES ('Karambit');
INSERT INTO tb_model (name) VALUES ('Bayonet');
INSERT INTO tb_model (name) VALUES ('Flip Knife');
INSERT INTO tb_model (name) VALUES ('Gut Knife');
INSERT INTO tb_model (name) VALUES ('Huntsman Knife');
INSERT INTO tb_model (name) VALUES ('Falchion Knife');
INSERT INTO tb_model (name) VALUES ('Bowie Knife');
INSERT INTO tb_model (name) VALUES ('Butterfly Knife');
INSERT INTO tb_model (name) VALUES ('Shadow Daggers');
INSERT INTO tb_model (name) VALUES ('Ursus Knife');
INSERT INTO tb_model (name) VALUES ('Navaja Knife');
INSERT INTO tb_model (name) VALUES ('Stiletto Knife');
INSERT INTO tb_model (name) VALUES ('Talon Knife');
INSERT INTO tb_model (name) VALUES ('Classic Knife');
INSERT INTO tb_model (name) VALUES ('Paracord Knife');
INSERT INTO tb_model (name) VALUES ('Survival Knife');
INSERT INTO tb_model (name) VALUES ('Nomad Knife');
INSERT INTO tb_model (name) VALUES ('Skeleton Knife');

INSERT INTO tb_exterior (name) VALUES ('Novo de Fábrica');
INSERT INTO tb_exterior (name) VALUES ('Pouco Usada');
INSERT INTO tb_exterior (name) VALUES ('Testada em Campo');
INSERT INTO tb_exterior (name) VALUES ('Bem Desgastada');
INSERT INTO tb_exterior (name) VALUES ('Veterana de Guerra');




insert into tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
values ('Fall Hazard',
'Altamente preciso e perfurante, o caro Five-Seven é um carregador lento que compensa com um carregador generoso de 20 tiros e um recuo indulgente. Uma pintura personalizada multicolorida onde se lê "FALL" e "CONSTRUCTION" foi aplicada. Cuidado com o vão',
'https://4clutch-images.s3.us-east-2.amazonaws.com/Five-SeveN+-+Fall+Hazard.png',532.00,1,1,9,6);


--AK
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Redline', 'A AK-47 é uma das armas mais icônicas do jogo.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/AK-47+Redline.png', 1000.00, 5, 10, 1, 1);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Vulcan', 'Uma skin azul e branca.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/AK-47+Vulcan.png', 1500.00, 5, 8, 1, 2);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Bloodsport', 'Uma skin com design futurista.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/AK-47+Bloodsport.png', 2000.00, 5, 5, 1, 3);

--M4A1-S
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Hyper Beast', 'A M4A1-S com uma skin colorida e detalhada.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/M4A1-S+Hyper+Beast.png', 1200.00, 5, 12, 2, 4);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Flashback', 'A M4A1-S com uma skin colorida e detalhada.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/M4A1-S+Flashback.png', 520.00, 5, 12, 2, 4);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Decimator', 'A M4A1-S com uma skin colorida e detalhada.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/M4A1-S+Decimator.png', 310.00, 5, 12, 2, 4);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Nightmare', 'A M4A1-S com uma skin colorida e detalhada.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/M4A1-S+Nightmare.png', 600.00, 5, 12, 2, 4);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Hyper Beast', 'A M4A1-S com uma skin colorida e detalhada.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/M4A1-S+Hyper+Beast.png', 800.00, 5, 12, 2, 4);

--M4A4
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Griffin', 'A M4A4 com uma skin colorida e detalhada.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/M4A4+Griffin.png', 2500.00, 5, 12, 4, 4);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Poseidon', 'A M4A4 com uma skin colorida e detalhada.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/M4A4+Poseidon.png', 5350.00, 5, 12, 4, 4);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('The Emperor', 'A M4A4 com uma skin colorida e detalhada.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/M4A4+The+Emperor.png', 520.00, 5, 12, 4, 4);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Hellfire', 'A M4A4 com uma skin colorida e detalhada.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/M4A4+Hellfire.png', 320.00, 5, 12, 4, 4);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Tornado', 'A M4A4 com uma skin colorida e detalhada.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/M4A4+Tornado.png', 150.00, 5, 12, 4, 4);

--AWP
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Dragon Lore', 'A lendária skin Dragon Lore.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/AWP+Dragon+Lore.png', 15000.00, 6, 1, 3, 1);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Medusa', 'Uma skin com o design da Medusa.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/AWP+Medusa.png', 14000.00, 6, 2, 3, 2);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('BOOM', 'Uma skin colorida e detalhada.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/AWP+BOOM.png', 400.00, 6, 4, 3, 3);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Mortis', 'Uma skin colorida e detalhada.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/AWP+Mortis.png', 1000.00, 6, 4, 3, 1);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Phobos', 'Uma skin colorida e detalhada.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/AWP+Phobos.png', 50.00, 6, 4, 3, 2);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Exoskeleton', 'Uma skin colorida e detalhada.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/AWP+Exoskeleton.png', 42.00, 6, 4, 3, 1);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Corticera', 'Uma skin colorida e detalhada.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/AWP+Corticera.png', 240.00, 6, 4, 3, 2);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Graphite', 'Uma skin colorida e detalhada.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/AWP+Graphite.png', 1500.00, 6, 4, 3, 4);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Wildfire', 'Uma skin colorida e detalhada.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/AWP++Wildfire.png', 2400.00, 6, 4, 3, 5);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('POP', 'Uma skin colorida e detalhada.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/AWP+POP+AWP.png', 120.00, 6, 4, 3, 3);

--SSG-08
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Dragonfire', 'Uma skin colorida e detalhada.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/SSG+08+Dragonfire.png', 1500.00, 6, 4, 21, 3);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Bloodshot', 'Uma skin colorida e detalhada.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/SSG+08+Bloodshot.png', 500.00, 6, 4, 21, 3);

-- Glock-18
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Fade', 'Uma skin com um gradiente de cores.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Glock-18+Fade.png', 2000.00, 1, 20, 5, 1);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Water Elemental', 'Uma skin com tema de água.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Glock-18+Water+Elemental.png', 300.00, 1, 15, 5, 2);

-- USP-S
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Kill Confirmed', 'Uma skin com um design gráfico.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/USP-S+Kill+Confirmed.png', 2500.00, 1, 10, 6, 4);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Neo-Noir', 'Uma skin com design artístico.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/USP-S+Neo-Noir.png', 150.00, 1, 12, 6, 5);

-- CZ75
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Auto Chalice', 'Uma skin com um design gráfico.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/CZ75-Auto++Chalice.png', 120.00, 1, 10, 11, 4);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Auto Emerald Quartz', 'Uma skin com design artístico.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/CZ75-Auto+Emerald+Quartz.png', 500.00, 1, 12, 11, 4);


-- Desert Eagle
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Blaze', 'Uma skin com chamas.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Deseart+Eagle+Blaze.png', 2400.00, 1, 15, 7, 1);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Kumicho Dragon', 'Uma skin com dragões.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Deseart+Eagle+Kumicho+Dragon.png', 100.00, 1, 18, 7, 2);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Printstream', 'Uma skin com muito fera.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Desert+Eagle+Printstream.png', 520.00, 1, 18, 7, 3);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Corinthian', 'Uma skin do Corinthians.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Desert+Eagle+Corinthian.png', 120.00, 1, 18, 7, 2);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Sputnik', 'Uma skin do Corinthians.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Desert+Eagle+Sputnik.png', 550.00, 1, 18, 7, 1);

-- P90
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Death by Kitty', 'Uma skin com tema de gato.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/P90+Death+by+Kitty.png', 1500.00, 2, 10, 13, 1);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Shapewood', 'Uma skin com tema de madeira.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/P90+Shapewood.png', 150.00, 2, 12, 13, 4);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Scorched', 'Uma skin com tema de madeira.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/P90+Scorched.png', 50.00, 2, 12, 13, 2);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Virus', 'Uma skin com tema de madeira.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/P90+Virus.png', 120.00, 2, 12, 13, 1);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Freight', 'Uma skin com tema de madeira.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/P90+Freight.png', 250.00, 2, 12, 13, 3);

-- MP7
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Nemesis', 'Uma skin com tema de inimigo.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/MP7+Nemesis.png', 67.00, 2, 15, 14, 4);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Whiteout', 'Uma skin completamente branca.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/MP7+Whiteout.png', 56.00, 2, 6, 14, 5);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Bloodsport', 'Uma skin completamente branca.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/MP7+Bloodsport.png', 100.00, 2, 6, 14, 3);

-- MP9

INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Ruby Poison Dart', 'Uma skin com tema de dardo venenoso.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/MP9+Ruby+Poison+Dart.png', 1500.00, 2, 8, 15, 2);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Hydra', 'Uma skin com tema de dardo venenoso.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/MP9+Hydra.png', 1500.00, 2, 8, 15, 2);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Goo', 'Uma skin com tema de dardo venenoso.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/MP9+Goo.png', 1500.00, 2, 8, 15, 1);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Storm', 'Uma skin com tema de dardo venenoso.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/MP9+Storm.png', 1500.00, 2, 8, 15, 3);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Bulldozer', 'Uma skin com tema de dardo venenoso.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/MP9+Bulldozer.png', 1500.00, 2, 8, 15, 2);

-- Nova
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Koi', 'Uma skin com tema de peixe koi.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Nova+Koi.png', 1500.00, 3, 8, 24, 4);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Antique', 'Uma skin com tema antigo.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Nova+Antique.png', 1800.00, 3, 9, 24, 5);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Interlock', 'Uma skin com tema antigo.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Nova+Interlock.png', 1800.00, 3, 9, 24, 3);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Gila', 'Uma skin com tema antigo.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Nova+Gila.png', 1800.00, 3, 9, 24, 1);

-- XM1014
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Scumbria', 'Uma skin com tema de escama.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/XM1014+Scumbria.png', 1500.00, 3, 8, 25, 1);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Red Leather', 'Uma skin com tema de queimador.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/XM1014+Red+Leather.png', 1200.00, 3, 10, 25, 3);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Seasons', 'Uma skin com tema de queimador.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/XM1014+Seasons.png', 1200.00, 3, 10, 25, 3);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Incinegator', 'Uma skin com tema de queimador.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/XM1014+Incinegator.png', 1200.00, 3, 10, 25, 1);

-- Sawed-Off
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Highwayman', 'Uma skin com tema de queimador.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Sawed-Off++Highwayman.png', 1200.00, 3, 10, 27, 2);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Limelight', 'Uma skin com tema de queimador.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Sawed-Off+Limelight.png', 1200.00, 3, 10, 27, 1);

-- MAG-7
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Justice', 'Uma skin com tema de justiça.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/MAG-7+Justice.png', 1500.00, 3, 8, 26, 1);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Praetorian', 'Uma skin com tema de pretoriano.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/MAG-7++Praetorian.png', 1800.00, 3, 9, 26, 2);

-- M249
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('System Lock', 'Uma skin com tema de sistema.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/M249+System+Lock.png', 1500.00, 4, 8, 28, 1);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Nebula Crusader', 'Uma skin com tema de nebulosa.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/M249++Nebula+Crusader.png', 1800.00, 4, 9, 28, 2);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Spectre', 'Uma skin com tema de nebulosa.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/M249+Spectre.png', 1800.00, 4, 9, 28, 4);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Downtown', 'Uma skin com tema de nebulosa.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/M249+Downtown.png', 1800.00, 4, 9, 28, 5);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Jungle DDPAT', 'Uma skin com tema de nebulosa.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/M249+Jungle+DDPAT.png', 1800.00, 4, 9, 28, 1);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Impact Drill', 'Uma skin com tema de nebulosa.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/M249+Impact+Drill.png', 1800.00, 4, 9, 28, 3);

-- Negev
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Loudmouth', 'Uma skin com tema de boca alta.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Negev+Loudmouth.png', 1500.00, 4, 8, 29, 1);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Power Loader', 'Uma skin com tema de carregador.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Negev+Power+Loader.png', 1800.00, 4, 9, 29, 4);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Dazzle', 'Uma skin com tema de carregador.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Negev+Dazzle.png', 1800.00, 4, 9, 29, 3);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Infrastructure', 'Uma skin com tema de carregador.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Negev+Infrastructure.png', 1800.00, 4, 9, 29, 1);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Terrain', 'Uma skin com tema de carregador.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Negev+Terrain.png', 1800.00, 4, 9, 29, 1);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Bulkhead', 'Uma skin com tema de carregador.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Negev+Bulkhead.png', 1800.00, 4, 9, 29, 3);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('CaliCamo', 'Uma skin com tema de carregador.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Negev+CaliCamo.png', 1800.00, 4, 9, 29, 1);

--Talon Knife
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Blue Steel', 'Uma faca com tema de aço azul.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Talon+Knife+Blue+Steel.png', 1800.00, 4, 9, 42, 1);

--Bayonet
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Lore', 'Uma faca com tema de ouro.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Bayonet+Lore.png', 1800.00, 4, 9, 31, 2);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Marble Fade', 'Uma faca com tema de ouro.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/M9+Bayonet+Marble+Fade.png', 1800.00, 4, 9, 31, 1);

--Butterfly
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Freehand', 'Uma faca com tema de mão.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Butterfly+Knife+Freehand.png', 1200.00, 4, 9, 37, 3);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Gold Lore', 'Uma faca com tema de mão.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Butterfly+Knife+Lore.png', 3800.00, 4, 9, 37, 2);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Steel Blue', 'faca com tema de mão.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Butterfly+Knife+Blue+Steel.png', 4200.00, 4, 9, 37, 2);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Night', 'faca com tema de mão.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Butterfly+Knife+Night.png', 3200.00, 4, 9, 37, 1);

--Karambit
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Crimson Web', 'faca com tema de mão.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Karambit+Crimson+Web.png', 5200.00, 4, 9, 30, 3);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Lore King', 'faca com tema de mão.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Karambit+Lore.png', 2320.00, 4, 9, 30, 2);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Case Hardened', 'faca com tema de mão.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Karambit+Case+Hardened.png', 1230.00, 4, 9, 30, 1);
