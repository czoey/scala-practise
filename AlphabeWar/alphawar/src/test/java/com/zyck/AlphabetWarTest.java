package com.zyck;

import org.testng.annotations.Test;
import org.testng.Assert;

import static org.assertj.core.api.Assertions.*;



public class AlphabetWarTest { 
    @Test
    public void test() {
        Assert.assertEquals("Right side wins!",AlphabetWar.alphabetWar("z"));
        Assert.assertEquals("Let's fight again!",AlphabetWar.alphabetWar("zdqmwpbs"));
        Assert.assertEquals("Right side wins!", AlphabetWar.alphabetWar("zzzzs"));
        Assert.assertEquals("Left side wins!", AlphabetWar.alphabetWar("wwwwwwz"));

        assertThat("Right side wins!").isEqualTo(AlphabetWar.alphabetWar("z"));
        assertThat("Let's fight again!").isEqualTo(AlphabetWar.alphabetWar("zdqmwpbs"));
        assertThat("Right side wins!").isEqualTo( AlphabetWar.alphabetWar("zzzzs"));
        assertThat("Left side wins!").isEqualTo(AlphabetWar.alphabetWar("wwwwwwz"));
    }
}