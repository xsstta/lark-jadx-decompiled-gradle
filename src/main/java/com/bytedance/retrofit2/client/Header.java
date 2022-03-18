package com.bytedance.retrofit2.client;

public final class Header {
    private final String name;
    private final String value;

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        int i;
        String str = this.name;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.value;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.name;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        sb.append(str);
        sb.append(": ");
        String str3 = this.value;
        if (str3 != null) {
            str2 = str3;
        }
        sb.append(str2);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Header header = (Header) obj;
        String str = this.name;
        if (str == null ? header.name != null : !str.equals(header.name)) {
            return false;
        }
        String str2 = this.value;
        String str3 = header.value;
        if (str2 == null ? str3 == null : str2.equals(str3)) {
            return true;
        }
        return false;
    }

    public Header(String str, String str2) {
        this.name = str;
        this.value = str2;
    }
}
