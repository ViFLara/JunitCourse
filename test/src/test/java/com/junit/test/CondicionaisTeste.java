package com.junit.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {

    @Test
    //@EnabledIfEnvironmentVariable(named = "USER", matches = "Willian")
    //@DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    //@EnabledOnOs(OS.LINUX)
    //@EnabledOnJre(JRE.JAVA_17)
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_18)
    void validarAlgoSomenteNoUsuarioWillian() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
