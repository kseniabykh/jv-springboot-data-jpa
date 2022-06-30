package mate.academy.springboot.service;

import java.math.BigDecimal;
import java.util.List;
import mate.academy.springboot.model.Product;

public interface ProductService {
    Product add(Product product);

    Product get(Long id);

    void delete(Long id);

    Product update(Product product);

    List<Product> getBetweenPrice(BigDecimal from, BigDecimal to);

    List<Product> getByCategories(List<Long> categoryIds);
}
