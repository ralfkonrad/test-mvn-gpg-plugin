package io.github.ralfkonrad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheAnswerTest {

    @Test
    void toLifeTheUniverseAndEverything() {
        Assertions.assertEquals(42, TheAnswer.toLifeTheUniverseAndEverything());
    }
}
