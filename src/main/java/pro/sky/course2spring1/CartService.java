package pro.sky.course2spring1;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
@Service
public class CartService {
    private final Item item;
    public CartService(Item item){

        this.item = item;
    }
    public void add (List<Integer> ids){
        item.add(ids);
    }
    public Set<Integer> get(){
        return item.getAll();
    }
}
