package kotlin.reflect.jvm.internal.impl.incremental.components;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Position implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final Position NO_POSITION = new Position(-1, -1);
    private final int column;
    private final int line;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Position)) {
            return false;
        }
        Position position = (Position) obj;
        return this.line == position.line && this.column == position.column;
    }

    public int hashCode() {
        return (this.line * 31) + this.column;
    }

    public String toString() {
        return "Position(line=" + this.line + ", column=" + this.column + ")";
    }

    public static final class Companion {
        private Companion() {
        }

        public final Position getNO_POSITION() {
            return Position.NO_POSITION;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Position(int i, int i2) {
        this.line = i;
        this.column = i2;
    }
}
