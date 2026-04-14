package client.response;

import java.math.BigDecimal;

public record PlatziProductResponse(Long id, String name, BigDecimal price) {
}
