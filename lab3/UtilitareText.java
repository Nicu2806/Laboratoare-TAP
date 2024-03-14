import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilitareText implements CautareSubsir {
    @Override
    public boolean cautaSubsir(String text, String sablon) {
        Pattern pattern = Pattern.compile(sablon);
        Matcher matcher = pattern.matcher(text);

        return matcher.find();
    }
}
