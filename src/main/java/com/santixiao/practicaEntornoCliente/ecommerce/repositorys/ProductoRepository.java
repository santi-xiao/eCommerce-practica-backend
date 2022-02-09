package com.santixiao.practicaEntornoCliente.ecommerce.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santixiao.practicaEntornoCliente.ecommerce.entitys.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
