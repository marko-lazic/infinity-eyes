package ml.mlazic.infinityeyes.services;

import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * CountingService.java
 * Purpose: Counts number of I's in a string.
 *
 * @author Marko Lazic
 * @version 1.0 4/19/18
 */
@Service
public class CountingService {

    /**
     * This method counts I's in given string,
     *
     * @param text input string.
     * @return returns integer of I's in text.
     */
    public int count(String text) {
        Pattern pattern = Pattern.compile("([I])");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) count++;
        return count;
    }
}
