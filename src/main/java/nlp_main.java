import com.joestelmach.natty.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class nlp_main {
    public static void main(String args[]) {


        Parser parser = new Parser();
        List groups = parser.parse("the day before next thursday");
        for (int i = 0; i < groups.size(); i++) {
            DateGroup group = (DateGroup) groups.get(i);
            List dates = group.getDates();
            int line = group.getLine();
            int column = group.getPosition();
            String matchingValue = group.getText();
            String syntaxTree = group.getSyntaxTree().toStringTree();
            Map parseMap = group.getParseLocations();
            boolean isRecurreing = group.isRecurring();
            Date recursUntil = group.getRecursUntil();
        }
    }
}
