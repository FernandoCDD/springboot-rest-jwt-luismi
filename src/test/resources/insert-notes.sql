INSERT INTO note(title, content, author, important, tags, created_at) VALUES ('Nota1', 'Contenido1', '8da85d1d-ef9f-4f9d-ab46-2e13a96e9118', true, ARRAY['tag1', 'tag2'], '2024-01-23T19:34:56');
INSERT INTO note (title, content, author, important, tags, created_at) VALUES ('Nota2', 'Contenido2', '8da85d1d-ef9f-4f9d-ab46-2e13a96e9118', true, ARRAY['tag3', 'tag4'], '2024-01-23T19:34:56');

INSERT INTO user_entity(id, username, password, avatar, full_name, account_non_expired, account_non_locked, credentials_non_expired, enabled, created_at, last_password_change_at) VALUES ('8da85d1d-ef9f-4f9d-ab46-2e13a96e9118', 'Fernando', '1234', 'avatar', 'Fernando Claro', true, true, true, true, '2024-01-23T19:04:55', '2024-01-23T19:05:34');

