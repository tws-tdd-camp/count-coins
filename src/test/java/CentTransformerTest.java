import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CentTransformerTest {
    @Test
    void should_return_empty_list_when_input_is_0() {
        assertThat(CentTransformer.change(0)).hasSize(0);
    }

    @Test
    void should_return_empty_list_when_input_is_1() {
        assertThat(CentTransformer.change(1)).hasSize(1);

        assertThat(CentTransformer.change(1)).contains(
                Arrays.asList(1)
        );
    }

    @Test
    void should_return_empty_list_when_input_is_2() {
        assertThat(CentTransformer.change(2)).hasSize(1);

        assertThat(CentTransformer.change(2)).contains(
                Arrays.asList(1, 1)
        );
    }

    @Test
    void should_return_empty_list_when_input_is_3() {

        List<List<Integer>> actual = CentTransformer.change(3);

        assertThat(actual).hasSize(1);

        assertThat(actual).contains(
                Arrays.asList(1, 1, 1)
        );
    }

    @Test
    void should_return_empty_list_when_input_is_5() {

        List<List<Integer>> actual = CentTransformer.change(5);

        assertThat(actual).hasSize(2);

        assertThat(actual).contains(
                Arrays.asList(5),
                Arrays.asList(1, 1, 1, 1, 1)
        );
    }

    @Test
    void should_return_empty_list_when_input_is_6() {

        List<List<Integer>> actual = CentTransformer.change(6);

        assertThat(actual).hasSize(2);

        assertThat(actual).contains(
                Arrays.asList(5, 1),
                Arrays.asList(1, 1, 1, 1, 1, 1)
        );
    }

    @Test
    void should_return_empty_list_when_input_is_10() {

        List<List<Integer>> actual = CentTransformer.change(10);

        assertThat(actual).hasSize(4);

        assertThat(actual).contains(
                Arrays.asList(10),
                Arrays.asList(5, 5),
                Arrays.asList(5, 1, 1, 1, 1, 1),
                Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
        );
    }

    @Test
    void should_return_empty_list_when_input_is_11() {

        List<List<Integer>> actual = CentTransformer.change(11);

        assertThat(actual).hasSize(4);

        assertThat(actual).contains(
                Arrays.asList(10, 1)
        );
    }

    @Test
    void should_return_empty_list_when_input_is_15() {

        List<List<Integer>> actual = CentTransformer.change(15);

        assertThat(actual).hasSize(6);
    }

    @Test
    void should_return_empty_list_when_input_is_25() {

        List<List<Integer>> actual = CentTransformer.change(25);

        assertThat(actual).hasSize(13);
    }

    @Test
    void should_return_empty_list_when_input_is_100() {

        List<List<Integer>> actual = CentTransformer.change(100);

        assertThat(actual).hasSize(235);
    }
}


