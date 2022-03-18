package com.ss.android.lark.keyboard.plugin.tool.burnlife;

public class BurnTimeItem {

    /* renamed from: a */
    private String f103762a;

    /* renamed from: b */
    private int f103763b;

    /* renamed from: c */
    private int f103764c;

    /* renamed from: d */
    private boolean f103765d;

    /* renamed from: e */
    private boolean f103766e;

    /* renamed from: f */
    private Type f103767f;

    public enum Type {
        CANCEL(1),
        BURN_TIME(2),
        UNKNOWN(-1);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            if (i == 1) {
                return CANCEL;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return BURN_TIME;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public BurnTimeItem() {
    }

    /* renamed from: a */
    public String mo147397a() {
        return this.f103762a;
    }

    /* renamed from: b */
    public int mo147399b() {
        return this.f103763b;
    }

    /* renamed from: c */
    public int mo147400c() {
        return this.f103764c;
    }

    /* renamed from: d */
    public boolean mo147401d() {
        return this.f103766e;
    }

    /* renamed from: e */
    public boolean mo147402e() {
        return this.f103765d;
    }

    /* renamed from: f */
    public Type mo147403f() {
        return this.f103767f;
    }

    /* renamed from: a */
    public void mo147398a(boolean z) {
        this.f103766e = z;
    }

    public BurnTimeItem(String str, int i, int i2, boolean z, boolean z2, Type type) {
        this.f103762a = str;
        this.f103763b = i;
        this.f103764c = i2;
        this.f103765d = z;
        this.f103766e = z2;
        this.f103767f = type;
    }
}
