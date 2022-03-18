package com.ss.android.lark.widget.richtext2.entity;

import java.io.Serializable;

public abstract class AbstractParseResult implements Serializable {
    private static final long serialVersionUID = -5721926812249440813L;

    public abstract boolean canPartialUpdate(AbstractParseResult abstractParseResult);

    public abstract int getHashCode();

    public abstract boolean isEquals(Object obj);

    public int hashCode() {
        return getHashCode();
    }

    public boolean equals(Object obj) {
        return isEquals(obj);
    }
}
