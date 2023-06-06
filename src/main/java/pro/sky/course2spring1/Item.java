package pro.sky.course2spring1;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Component
@SessionScope
public class Item {
    private final Set<Integer> ids = new HashSet<>();
    public void add (List<Integer> ids){
        this.ids.addAll(ids);
    }
    public Set<Integer> getAll(){
        return this.ids;
    }
}
