package com.he.v8_inspect;

import java.util.Objects;

public class InspectTarget {
    private String mDisplayName;
    private final String mInspectorPath;

    public String getDisplayName() {
        return this.mDisplayName;
    }

    public String getInspectorPath() {
        return this.mInspectorPath;
    }

    public int hashCode() {
        return Objects.hash(this.mDisplayName, this.mInspectorPath);
    }

    public void setDisplayName(String str) {
        this.mDisplayName = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InspectTarget inspectTarget = (InspectTarget) obj;
        if (!Objects.equals(this.mDisplayName, inspectTarget.mDisplayName) || !Objects.equals(this.mInspectorPath, inspectTarget.mInspectorPath)) {
            return false;
        }
        return true;
    }

    public InspectTarget(String str, String str2) {
        this.mDisplayName = str;
        this.mInspectorPath = str2;
    }
}
