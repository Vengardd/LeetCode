package LongestCommonPrefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static common.Common.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

class LongestCommonPrefixTest {

    private LongestCommonPrefix testee = new LongestCommonPrefix();

    @Test
    public void onEmptyStringsShouldReturnEmptyString() {
        String[] input = new String[]{};

        String prefix = testee.longestCommonPrefix(input);

        assertThat(prefix).isEmpty();
    }

    @Test
    public void onOneStringShouldReturnThisString() {
        String word = "word";
        String[] input = new String[]{word};

        String prefix = testee.longestCommonPrefix(input);

        assertThat(prefix).isEqualTo(word);
    }

    @Test
    public void onStringsShouldReturnCommonPrefix() {
        String expectedPrefix = "fl";

        List<String> words = Arrays.asList("flower", "flow", "flight");
        String[] input = (String[]) words.toArray();

        String prefix = testee.longestCommonPrefix(input);

        assertThat(prefix).isEqualTo(expectedPrefix);
    }

    @Test
    public void onStringsWithOneEmptyShouldReturnEmptyString() {
        List<String> words = Arrays.asList("flower", "", "flight");
        String[] input = (String[]) words.toArray();

        String prefix = testee.longestCommonPrefix(input);

        assertThat(prefix).isEqualTo(EMPTY_STRING);
    }

    @Test
    public void onStringsWithoutCommonPrefixShouldReturnEmptyString() {
        List<String> words = Arrays.asList("flower", "car", "flight");
        String[] input = (String[]) words.toArray();

        String prefix = testee.longestCommonPrefix(input);

        assertThat(prefix).isEqualTo(EMPTY_STRING);
    }

    @Test
    public void onTwoStringsWithFirstLongerThanSecondShouldReturnCommonPrefix() {
        String expectedPrefix = "a";

        List<String> words = Arrays.asList("ab", "a");
        String[] input = (String[]) words.toArray();

        String prefix = testee.longestCommonPrefix(input);

        assertThat(prefix).isEqualTo(expectedPrefix);
    }
}