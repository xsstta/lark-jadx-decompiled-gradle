package com.ss.android.lark.feed.service.impl;

/* renamed from: com.ss.android.lark.feed.service.impl.b */
public class C38126b implements Comparable<C38126b> {

    /* renamed from: a */
    public long f97759a;

    /* renamed from: b */
    public long f97760b;

    /* renamed from: c */
    public FeedCursor f97761c;

    public C38126b() {
    }

    public C38126b(FeedCursor dVar) {
        this.f97761c = dVar;
    }

    /* renamed from: a */
    public int compareTo(C38126b bVar) {
        if (bVar == null) {
            return 0;
        }
        long j = this.f97760b;
        long j2 = bVar.f97760b;
        if (j == j2) {
            if (this.f97759a < bVar.f97759a) {
                return 1;
            }
            return -1;
        } else if (j < j2) {
            return 1;
        } else {
            return -1;
        }
    }

    public C38126b(long j, long j2) {
        long j3;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            j3 = j;
        } else {
            j3 = j2;
        }
        this.f97759a = j3;
        this.f97760b = i < 0 ? j2 : j;
    }
}
