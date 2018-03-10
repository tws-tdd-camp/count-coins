import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AssertJAssertionDemo {

    @Test
    void should_return_empty_list_when_input_is_0() {
        assertThat(CentTransformer.transform(0)).hasSize(0);
    }

    @Test
    void should_return_one_way_when_input_is_1() {
        List<List<String>> actual = CentTransformer.transform(1);

        assertThat(actual).hasSize(1);
        assertThat(actual).contains(Arrays.asList("penny"));
    }

    @Test
    void should_return_one_way_when_input_is_2() {
        List<List<String>> actual = CentTransformer.transform(2);

        assertThat(actual).hasSize(1);
        assertThat(actual).contains(Arrays.asList("penny", "penny"));
    }

    @Test
    void should_return_one_way_when_input_is_3() {
        List<List<String>> actual = CentTransformer.transform(3);

        assertThat(actual).hasSize(1);
        assertThat(actual).contains(Arrays.asList("penny", "penny", "penny"));
    }

    @Test
    void should_return_one_way_when_input_is_5() {
        List<List<String>> actual = CentTransformer.transform(5);

        assertThat(actual).hasSize(2);

        assertThat(actual).contains(Arrays.asList("penny", "penny", "penny", "penny", "penny"));
        assertThat(actual).contains(Arrays.asList("nickel"));
    }

    @Test
    void should_return_one_way_when_input_is_6() {
        List<List<String>> actual = CentTransformer.transform(6);

        assertThat(actual).hasSize(2);

        assertThat(actual).contains(Arrays.asList("penny", "penny", "penny", "penny", "penny", "penny"));
        assertThat(actual).contains(Arrays.asList("nickel", "penny"));
    }

    @Test
    void should_return_one_way_when_input_is_10() {
        List<List<String>> actual = CentTransformer.transform(10);

        assertThat(actual).hasSize(4);
    }
}


