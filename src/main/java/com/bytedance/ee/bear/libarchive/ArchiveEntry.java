package com.bytedance.ee.bear.libarchive;

public class ArchiveEntry {
    private int entryType;
    private String path;
    private long size;

    public int getEntryType() {
        return this.entryType;
    }

    public String getPath() {
        return this.path;
    }

    public long getSize() {
        return this.size;
    }

    public boolean isFolder() {
        if (this.entryType == 16384) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "ArchiveEntry{entryType=" + this.entryType + ", path='" + this.path + '\'' + ", size=" + this.size + '}';
    }

    public void setEntryType(int i) {
        this.entryType = i;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public ArchiveEntry(int i, String str, long j) {
        this.entryType = i;
        this.path = str;
        this.size = j;
    }
}
