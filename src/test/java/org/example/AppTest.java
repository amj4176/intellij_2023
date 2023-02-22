package org.example;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AppTest {
    @Test
    void t1() {
        assertThat(new App().plus(10,20)).isEqualTo(30);
    }

    @Test
    void t2() {
        assertThat(new App().plus(30,20)).isEqualTo(40);
    }
}
