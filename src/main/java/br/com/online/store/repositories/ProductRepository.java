package br.com.online.store.repositories;

import java.util.UUID;

import br.com.online.store.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
}
