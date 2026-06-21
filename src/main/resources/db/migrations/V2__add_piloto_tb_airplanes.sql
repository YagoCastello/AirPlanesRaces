--V2: Migrations para adicionar a coluna piloto
ALTER TABLE tb_airplanes
ADD COLUMN piloto VARCHAR(255);