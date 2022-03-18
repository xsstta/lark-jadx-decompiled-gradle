package com.bytedance.ee.bear.bitable.fab;

import com.bytedance.ee.util.io.NonProguard;
import java.util.Arrays;
import java.util.Objects;

public class BitableFabModel implements NonProguard {
    private BitableFabItem[] data;

    public static class BitableFabItem implements NonProguard {
        private String id;
        private String title;

        public String getId() {
            return this.id;
        }

        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Objects.hash(this.id);
        }

        public String toString() {
            return "BitableFabItem{id='" + this.id + '\'' + '}';
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Objects.equals(this.id, ((BitableFabItem) obj).id);
        }
    }

    public BitableFabItem[] getData() {
        return this.data;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data);
    }

    public String toString() {
        return "BitableFabModel{data=" + Arrays.toString(this.data) + '}';
    }

    public void setData(BitableFabItem[] bitableFabItemArr) {
        this.data = bitableFabItemArr;
    }

    public static boolean isValid(BitableFabModel bitableFabModel) {
        if (bitableFabModel == null || bitableFabModel.getData() == null || bitableFabModel.getData().length <= 0) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.data, ((BitableFabModel) obj).data);
    }
}
