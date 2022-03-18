package kotlin.reflect.jvm.internal.impl.types;

public abstract class TypeProjectionBase implements TypeProjection {
    public int hashCode() {
        int i;
        int hashCode = getProjectionKind().hashCode();
        if (TypeUtils.noExpectedType(getType())) {
            return (hashCode * 31) + 19;
        }
        int i2 = hashCode * 31;
        if (isStarProjection()) {
            i = 17;
        } else {
            i = getType().hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        if (isStarProjection()) {
            return "*";
        }
        if (getProjectionKind() == Variance.INVARIANT) {
            return getType().toString();
        }
        return getProjectionKind() + " " + getType();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeProjection)) {
            return false;
        }
        TypeProjection typeProjection = (TypeProjection) obj;
        if (isStarProjection() == typeProjection.isStarProjection() && getProjectionKind() == typeProjection.getProjectionKind() && getType().equals(typeProjection.getType())) {
            return true;
        }
        return false;
    }
}
