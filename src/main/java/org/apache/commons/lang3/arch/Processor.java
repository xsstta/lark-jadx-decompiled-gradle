package org.apache.commons.lang3.arch;

public class Processor {

    public enum Arch {
        BIT_32,
        BIT_64,
        UNKNOWN
    }

    public enum Type {
        X86,
        IA_64,
        PPC,
        UNKNOWN
    }
}
