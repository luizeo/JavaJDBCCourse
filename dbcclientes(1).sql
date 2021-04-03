-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 21/01/2020 às 15:00
-- Versão do servidor: 8.0.13
-- Versão do PHP: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `dbcclientes`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `cliente`
--

CREATE TABLE `cliente` (
  `cli_cod` int(11) NOT NULL,
  `cli_nome` varchar(100) DEFAULT NULL,
  `cli_cpf` varchar(20) DEFAULT NULL,
  `cli_dt_nasc` date DEFAULT NULL,
  `cli_sexo` varchar(1) DEFAULT NULL,
  `cli_fone` varchar(20) DEFAULT NULL,
  `cli_endereco` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Despejando dados para a tabela `cliente`
--

INSERT INTO `cliente` (`cli_cod`, `cli_nome`, `cli_cpf`, `cli_dt_nasc`, `cli_sexo`, `cli_fone`, `cli_endereco`) VALUES
(2, 'José Faria', '030303003030', '2019-09-11', 'M', '6190909090909', 'Av. Rio'),
(3, 'Ana Maria', '03030303003', '1999-07-31', 'F', '6190909090909', 'Av. Brasil'),
(12, 'Hanna Gabriela Costa', '288390', '2003-04-28', 'F', '619866776676', 'Av. Brasil'),
(13, 'Luiz Carlos da Silva', '02093090089', '1990-09-19', 'M', '7198775166', 'Largo de Roma, 89890'),
(14, 'Maria Cristina de Almeida', '02594090056', '1995-07-13', 'F', '7132452500', 'Av. Sete de Setembro'),
(15, 'Pedro Paulo Diniz de Azevedo', '02694050689', '1989-11-10', 'M', '1134567890', 'Bairro Jardins, São Paulo'),
(16, 'Valquiria Michelsen', '07093030089', '1982-10-10', 'F', '61993456789', 'SQS 214, Asa Sul'),
(17, 'Humberto Eco', '025913080089', '1945-11-19', 'M', '113234549039', 'Av. Rebouças, Centro, São Paulo'),
(19, 'Ludimila Rincon', '8887776666', '1978-12-05', 'F', '61987766655', 'Av. Rio de Janeiro');

-- --------------------------------------------------------

--
-- Estrutura para tabela `login`
--

CREATE TABLE `login` (
  `log_seq` int(11) NOT NULL,
  `log_nome` varchar(30) DEFAULT NULL,
  `log_senha` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Despejando dados para a tabela `login`
--

INSERT INTO `login` (`log_seq`, `log_nome`, `log_senha`) VALUES
(1, 'teste', 'teste');

-- --------------------------------------------------------

--
-- Estrutura para tabela `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `u_nome` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Despejando dados para a tabela `usuario`
--

INSERT INTO `usuario` (`id`, `u_nome`, `u_email`) VALUES
(1, 'Hafy', 'hafy@hotmail.com'),
(2, 'Marcos', 'marcos@gmail.com'),
(3, 'Luiz', 'luizeduardo.unb@gmail.com');

--
-- Índices de tabelas apagadas
--

--
-- Índices de tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cli_cod`);

--
-- Índices de tabela `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`log_seq`);

--
-- Índices de tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas apagadas
--

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `cli_cod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de tabela `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
