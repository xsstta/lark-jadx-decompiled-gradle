package com.ss.android.lark.chat.utils;

/* renamed from: com.ss.android.lark.chat.utils.x */
public class C34378x {

    /* renamed from: a */
    private final int f88760a;

    /* renamed from: b */
    private int f88761b;

    /* renamed from: c */
    private int f88762c;

    /* renamed from: d */
    private long f88763d;

    /* renamed from: com.ss.android.lark.chat.utils.x$a */
    public interface AbstractC34379a {
        void onTick(int i);
    }

    /* renamed from: com.ss.android.lark.chat.utils.x$b */
    public static class C34380b {

        /* renamed from: a */
        public static final C34378x f88764a = new C34378x(100, 1000);
    }

    /* renamed from: a */
    public static C34378x m133309a() {
        return C34380b.f88764a;
    }

    /* renamed from: a */
    public void mo126949a(AbstractC34379a aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f88763d;
        if (currentTimeMillis - j > ((long) this.f88760a)) {
            this.f88762c = 0;
        }
        if (currentTimeMillis - j > ((long) this.f88761b)) {
            int i = this.f88762c + 1;
            this.f88762c = i;
            this.f88763d = currentTimeMillis;
            if (aVar != null) {
                aVar.onTick(i);
            }
        }
    }

    public C34378x(int i, int i2) {
        this.f88761b = i;
        this.f88760a = i2;
    }
}
