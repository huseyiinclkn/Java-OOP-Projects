import java.util.LinkedList;
import java.util.List;

public class Generic <T>{

    private List<T> list =new LinkedList<>();

    public void addList(T t){
        this.list.add(t);
    }

    public List<T> getList(){
        return this.list;
    }
}
