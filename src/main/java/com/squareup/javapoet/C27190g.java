package com.squareup.javapoet;

import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.javapoet.g */
public final class C27190g {

    /* renamed from: a */
    private final C27193b f67645a;

    /* renamed from: b */
    private final String f67646b;

    /* renamed from: c */
    private final int f67647c;

    /* renamed from: d */
    private boolean f67648d;

    /* renamed from: e */
    private final StringBuilder f67649e = new StringBuilder();

    /* renamed from: f */
    private int f67650f = 0;

    /* renamed from: g */
    private int f67651g = -1;

    /* renamed from: h */
    private EnumC27192a f67652h;

    /* access modifiers changed from: private */
    /* renamed from: com.squareup.javapoet.g$a */
    public enum EnumC27192a {
        WRAP,
        SPACE,
        EMPTY
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public char mo96838a() {
        return this.f67645a.f67655a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.javapoet.g$1 */
    public static /* synthetic */ class C271911 {

        /* renamed from: a */
        static final /* synthetic */ int[] f67653a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.squareup.javapoet.g$a[] r0 = com.squareup.javapoet.C27190g.EnumC27192a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.squareup.javapoet.C27190g.C271911.f67653a = r0
                com.squareup.javapoet.g$a r1 = com.squareup.javapoet.C27190g.EnumC27192a.WRAP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.squareup.javapoet.C27190g.C271911.f67653a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.squareup.javapoet.g$a r1 = com.squareup.javapoet.C27190g.EnumC27192a.SPACE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.squareup.javapoet.C27190g.C271911.f67653a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.squareup.javapoet.g$a r1 = com.squareup.javapoet.C27190g.EnumC27192a.EMPTY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.javapoet.C27190g.C271911.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.javapoet.g$b */
    public static final class C27193b implements Appendable {

        /* renamed from: a */
        char f67655a;

        /* renamed from: b */
        private final Appendable f67656b;

        C27193b(Appendable appendable) {
            this.f67656b = appendable;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) throws IOException {
            this.f67655a = c;
            return this.f67656b.append(c);
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) throws IOException {
            int length = charSequence.length();
            if (length != 0) {
                this.f67655a = charSequence.charAt(length - 1);
            }
            return this.f67656b.append(charSequence);
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            return append(charSequence.subSequence(i, i2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo96839a(int i) throws IOException {
        if (!this.f67648d) {
            EnumC27192a aVar = this.f67652h;
            if (aVar != null) {
                m98851a(aVar);
            }
            this.f67650f++;
            this.f67652h = EnumC27192a.SPACE;
            this.f67651g = i;
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo96841b(int i) throws IOException {
        if (this.f67648d) {
            throw new IllegalStateException("closed");
        } else if (this.f67650f != 0) {
            EnumC27192a aVar = this.f67652h;
            if (aVar != null) {
                m98851a(aVar);
            }
            this.f67652h = EnumC27192a.EMPTY;
            this.f67651g = i;
        }
    }

    /* renamed from: a */
    private void m98851a(EnumC27192a aVar) throws IOException {
        int i;
        int i2 = C271911.f67653a[aVar.ordinal()];
        if (i2 == 1) {
            this.f67645a.append('\n');
            int i3 = 0;
            while (true) {
                i = this.f67651g;
                if (i3 >= i) {
                    break;
                }
                this.f67645a.append(this.f67646b);
                i3++;
            }
            int length = i * this.f67646b.length();
            this.f67650f = length;
            this.f67650f = length + this.f67649e.length();
        } else if (i2 == 2) {
            this.f67645a.append(' ');
        } else if (i2 != 3) {
            throw new IllegalArgumentException("Unknown FlushType: " + aVar);
        }
        this.f67645a.append(this.f67649e);
        StringBuilder sb = this.f67649e;
        sb.delete(0, sb.length());
        this.f67651g = -1;
        this.f67652h = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo96840a(String str) throws IOException {
        int i;
        boolean z;
        EnumC27192a aVar;
        if (!this.f67648d) {
            if (this.f67652h != null) {
                int indexOf = str.indexOf(10);
                if (indexOf != -1 || this.f67650f + str.length() > this.f67647c) {
                    if (indexOf == -1 || this.f67650f + indexOf > this.f67647c) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        aVar = EnumC27192a.WRAP;
                    } else {
                        aVar = this.f67652h;
                    }
                    m98851a(aVar);
                } else {
                    this.f67649e.append(str);
                    this.f67650f += str.length();
                    return;
                }
            }
            this.f67645a.append(str);
            int lastIndexOf = str.lastIndexOf(10);
            if (lastIndexOf != -1) {
                i = (str.length() - lastIndexOf) - 1;
            } else {
                i = str.length() + this.f67650f;
            }
            this.f67650f = i;
            return;
        }
        throw new IllegalStateException("closed");
    }

    C27190g(Appendable appendable, String str, int i) {
        C27200m.m98877a(appendable, "out == null", new Object[0]);
        this.f67645a = new C27193b(appendable);
        this.f67646b = str;
        this.f67647c = i;
    }
}
