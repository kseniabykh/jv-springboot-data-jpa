package mate.academy.springboot.repository;

import java.math.BigDecimal;
import java.util.List;
import mate.academy.springboot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> getAllByPriceBetween(BigDecimal from, BigDecimal to);

    List<Product> getAllByCategoryIdIn(List<Long> categoryIds);
}