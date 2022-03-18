package com.bytedance.common.jato.lock.sp;

import java.util.Objects;

public class SpRecord implements Comparable<SpRecord> {
    String name;
    int seq;
    int weedOutCount;

    public int hashCode() {
        return Objects.hash(this.name);
    }

    public String toString() {
        return this.seq + ",," + this.name + ",," + this.weedOutCount;
    }

    public int compareTo(SpRecord spRecord) {
        return this.seq - spRecord.seq;
    }

    static SpRecord create(String str) {
        try {
            String[] split = str.split(",,");
            return new SpRecord(Integer.parseInt(split[0]), split[1], Integer.parseInt(split[2]));
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.name, ((SpRecord) obj).name);
    }

    public SpRecord(int i, String str, int i2) {
        this.seq = i;
        this.name = str;
        this.weedOutCount = i2;
    }
}
