package mate.academy.springboot.dto;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class ProductRequestDto {
    private String title;
    private BigDecimal price;
    private Long categoryId;
}
