package ml.mlazic.infinityeyes.services;

import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class CountingService {
    public int count(String text) {
        Pattern pattern = Pattern.compile("([I])");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) count++;
        return count;
    }
}
