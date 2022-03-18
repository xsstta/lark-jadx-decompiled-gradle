package com.google.firebase.components;

public final class Dependency {
    private final Class<?> anInterface;
    private final int injection;
    private final int type;

    public Class<?> getInterface() {
        return this.anInterface;
    }

    public boolean isDirectInjection() {
        if (this.injection == 0) {
            return true;
        }
        return false;
    }

    public boolean isRequired() {
        if (this.type == 1) {
            return true;
        }
        return false;
    }

    public boolean isSet() {
        if (this.type == 2) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.anInterface.hashCode() ^ 1000003) * 1000003) ^ this.type) * 1000003) ^ this.injection;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.anInterface);
        sb.append(", type=");
        int i = this.type;
        boolean z = true;
        if (i == 1) {
            str = "required";
        } else if (i == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", direct=");
        if (this.injection != 0) {
            z = false;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public static Dependency optional(Class<?> cls) {
        return new Dependency(cls, 0, 0);
    }

    public static Dependency optionalProvider(Class<?> cls) {
        return new Dependency(cls, 0, 1);
    }

    public static Dependency required(Class<?> cls) {
        return new Dependency(cls, 1, 0);
    }

    public static Dependency requiredProvider(Class<?> cls) {
        return new Dependency(cls, 1, 1);
    }

    public static Dependency setOf(Class<?> cls) {
        return new Dependency(cls, 2, 0);
    }

    public static Dependency setOfProvider(Class<?> cls) {
        return new Dependency(cls, 2, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Dependency)) {
            return false;
        }
        Dependency dependency = (Dependency) obj;
        if (this.anInterface == dependency.anInterface && this.type == dependency.type && this.injection == dependency.injection) {
            return true;
        }
        return false;
    }

    private Dependency(Class<?> cls, int i, int i2) {
        this.anInterface = (Class) C22776n.m82764a(cls, "Null dependency anInterface.");
        this.type = i;
        this.injection = i2;
    }
}
