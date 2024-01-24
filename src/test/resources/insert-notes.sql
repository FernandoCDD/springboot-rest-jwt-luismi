INSERT INTO user_entity(id, username, password, avatar, full_name, account_non_expired, account_non_locked, credentials_non_expired, enabled, created_at, last_password_change_at) VALUES ('8da85d1d-ef9f-4f9d-ab46-2e13a96e9118', 'Fernando', '1234', 'avatar', 'Fernando Claro', true, true, true, true, '2024-01-23T19:04:55', '2024-01-23T19:05:34');

INSERT INTO note (id, title, content, author, important, created_at) VALUES (1, 'Nota1', 'Contenido1', '8da85d1d-ef9f-4f9d-ab46-2e13a96e9118', true, '2024-01-23T19:34:56');
INSERT INTO note (id, title, content, author, important, created_at) VALUES (2, 'Nota2', 'Contenido2', '8da85d1d-ef9f-4f9d-ab46-2e13a96e9118', true, '2024-01-23T19:34:56');

INSERT INTO note_tags(note_id, tags) VALUES (1, 'tag1, tag2');
INSERT INTO note_tags(note_id, tags) VALUES (2, 'tag1, tag2');


