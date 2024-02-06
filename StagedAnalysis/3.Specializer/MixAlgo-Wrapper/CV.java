import java.util.ArrayList;
import java.util.List;

public class CV {
    List<Dependency> dep = new ArrayList<>();

    public static CV createCV(){
        CV a = new CV();
        a.dep = new ArrayList<>();
        return a;
    }
}
