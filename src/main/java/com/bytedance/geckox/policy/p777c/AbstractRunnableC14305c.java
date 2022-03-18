package com.bytedance.geckox.policy.p777c;

/* renamed from: com.bytedance.geckox.policy.c.c */
public abstract class AbstractRunnableC14305c implements Comparable<AbstractRunnableC14305c>, Runnable {

    /* renamed from: a */
    private int f37585a;

    /* renamed from: b */
    private String f37586b;

    /* renamed from: a */
    public int mo52349a() {
        return this.f37585a;
    }

    /* renamed from: a */
    public int compareTo(AbstractRunnableC14305c cVar) {
        if (mo52349a() < cVar.mo52349a()) {
            return -1;
        }
        if (mo52349a() > cVar.mo52349a()) {
            return 1;
        }
        return 0;
    }

    public AbstractRunnableC14305c(int i, String str) {
        this.f37585a = i;
        this.f37586b = str;
    }
}
