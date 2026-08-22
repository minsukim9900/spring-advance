package hello.advanced.proxy.app.v3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proxy")
public class OrderControllerV3 {
    private final OrderServiceV3 orderService;

    public OrderControllerV3(OrderServiceV3 orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/v3/request")
    public String request(@RequestParam("itemId") String itemId) {
        orderService.orderItem(itemId);

        return itemId;
    }

    @GetMapping("/v3/no-log")
    public String noLog() {
        return "ok";
    }
}
