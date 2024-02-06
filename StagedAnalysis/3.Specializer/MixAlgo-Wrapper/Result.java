import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Result {
        Map<Dependency, String> worklist = new HashMap<>();
        Map<Dependency, String> worklistnew = new HashMap<>();
        //Map<Dependency, String> tempworklistnew = new HashMap<>();
        Map<String, String> globalvariable = new HashMap<>();
        //Map<String, String > varlist = new HashMap<>();
        ArrayList<String> code = new ArrayList<>();
        ArrayList<String> pr = new ArrayList<>();
}
