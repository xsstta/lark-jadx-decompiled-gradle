package com.bytedance.ee.bear;

import com.bytedance.ee.util.io.NonProguard;
import java.util.Objects;

public class TableSimpleInfo implements NonProguard {
    private String id;
    private String name;

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableSimpleInfo tableSimpleInfo = (TableSimpleInfo) obj;
        if (!Objects.equals(this.id, tableSimpleInfo.id) || !Objects.equals(this.name, tableSimpleInfo.name)) {
            return false;
        }
        return true;
    }
}
