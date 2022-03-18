package com.ss.android.medialib.model;

public class Point {
    long left;
    long right;

    public long getLeft() {
        return this.left;
    }

    public long getRight() {
        return this.right;
    }

    public void setLeft(long j) {
        this.left = j;
    }

    public void setRight(long j) {
        this.right = j;
    }

    public Point(long j, long j2) {
        this.left = j;
        this.right = j2;
    }
}
