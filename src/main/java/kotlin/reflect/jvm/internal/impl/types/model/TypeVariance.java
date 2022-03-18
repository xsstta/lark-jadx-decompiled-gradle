package kotlin.reflect.jvm.internal.impl.types.model;

public enum TypeVariance {
    IN("in"),
    OUT("out"),
    INV("");
    
    private final String presentation;

    public String toString() {
        return this.presentation;
    }

    private TypeVariance(String str) {
        this.presentation = str;
    }
}
