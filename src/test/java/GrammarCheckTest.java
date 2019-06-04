import org.junit.Assert;
import org.junit.Test;
import services.grammarcheck.GrammarCheck;
import services.grammarcheck.GrammarCheckImpl;

import static org.hamcrest.core.Is.is;

/**
 * Created by dongchul on 2019-06-04.
 */
public class GrammarCheckTest {

    @Test
    public void test_correct() {
        GrammarCheck grammarCheck = new GrammarCheckImpl();
        Assert.assertThat(grammarCheck.isCorrect(), is(false));
    }
}
