package pro.sky.course2spring1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;
@RestController
@RequestMapping("/store/order")
public class CartController {
    private final CartService service;
    public CartController(CartService service) {

        this.service = service;
    }
    @GetMapping("/add")
    public void add(@RequestParam("ID") List<Integer> ids) {
        service.add(ids);
    }
    @GetMapping("/get")
    public Set<Integer> get() {
        return service.get();

    }

}
