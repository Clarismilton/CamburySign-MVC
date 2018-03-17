package br.cambury.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cambury.bean.Usuario;

public interface UsuarioDaoI extends JpaRepository<Usuario, Long> {}