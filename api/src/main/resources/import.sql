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

--AWP
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Dragon Lore', 'A lendária skin Dragon Lore.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/AWP+Dragon+Lore.png', 15000.00, 6, 1, 3, 1);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Medusa', 'Uma skin com o design da Medusa.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/AWP+Medusa.png', 14000.00, 6, 2, 3, 2);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('BOOM', 'Uma skin colorida e detalhada.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/AWP+BOOM.png', 5000.00, 6, 4, 3, 3);

-- Glock-18
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Fade', 'Uma skin com um gradiente de cores.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Glock-18+Fade.png', 2000.00, 1, 20, 5, 1);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Water Elemental', 'Uma skin com tema de água.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Glock-18+Water+Elemental.png', 1500.00, 1, 15, 5, 2);

-- USP-S
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Kill Confirmed', 'Uma skin com um design gráfico.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/USP-S+Kill+Confirmed.png', 2500.00, 1, 10, 6, 4);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Neo-Noir', 'Uma skin com design artístico.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/USP-S+Neo-Noir.png', 2800.00, 1, 12, 6, 6);

-- Desert Eagle
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Blaze', 'Uma skin com chamas.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Deseart+Eagle+Blaze.png', 5000.00, 1, 15, 7, 1);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Kumicho Dragon', 'Uma skin com dragões.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Deseart+Eagle+Kumicho+Dragon.png', 1500.00, 1, 18, 7, 2);

-- P90
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Death by Kitty', 'Uma skin com tema de gato.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/P90+Death+by+Kitty.png', 2000.00, 2, 10, 13, 1);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Shapewood', 'Uma skin com tema de madeira.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/P90+Shapewood.png', 23.00, 2, 12, 13, 3);

-- MP7
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Nemesis', 'Uma skin com tema de inimigo.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/MP7+Nemesis.png', 67.00, 2, 15, 14, 4);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Whiteout', 'Uma skin completamente branca.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/MP7+Whiteout.png', 1000.00, 2, 6, 14, 5);

-- MP9

INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Ruby Poison Dart', 'Uma skin com tema de dardo venenoso.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/MP9+Ruby+Poison+Dart.png', 1500.00, 2, 8, 15, 2);

-- Nova
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Koi', 'Uma skin com tema de peixe koi.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Nova+Koi.png', 1500.00, 3, 8, 24, 4);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Antique', 'Uma skin com tema antigo.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Nova+Antique.png', 1800.00, 3, 9, 24, 5);

-- XM1014
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Scumbria', 'Uma skin com tema de escama.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/XM1014+Scumbria.png', 1500.00, 3, 8, 25, 1);

INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Red Leather', 'Uma skin com tema de queimador.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/XM1014+Red+Leather.png', 1200.00, 3, 10, 25, 3);

-- MAG-7
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Justice', 'Uma skin com tema de justiça.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/MAG-7+Justice.png', 1500.00, 3, 8, 26, 4);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Praetorian', 'Uma skin com tema de pretoriano.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/MAG-7++Praetorian.png', 1800.00, 3, 9, 26, 5);

-- M249
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('System Lock', 'Uma skin com tema de sistema.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/M249+System+Lock.png', 1500.00, 4, 8, 28, 4);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Nebula Crusader', 'Uma skin com tema de nebulosa.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/M249++Nebula+Crusader.png', 1800.00, 4, 9, 28, 5);

-- Negev
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Loudmouth', 'Uma skin com tema de boca alta.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Negev+Loudmouth.png', 1500.00, 4, 8, 29, 1);
INSERT INTO tb_product (name, description, image_url, price, category_id, quantity, model_id, exterior_id)
VALUES ('Power Loader', 'Uma skin com tema de carregador.', 'https://4clutch-images.s3.us-east-2.amazonaws.com/Negev+Power+Loader.png', 1800.00, 4, 9, 29, 2);

