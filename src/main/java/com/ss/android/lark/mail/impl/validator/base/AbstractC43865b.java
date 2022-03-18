package com.ss.android.lark.mail.impl.validator.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.ss.android.lark.mail.impl.validator.base.b */
abstract class AbstractC43865b<T> implements Iterator<T> {

    /* renamed from: a */
    private EnumC43867a f111318a = EnumC43867a.NOT_READY;

    /* renamed from: b */
    private T f111319b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.validator.base.b$a */
    public enum EnumC43867a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo156251a();

    protected AbstractC43865b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final T mo156252b() {
        this.f111318a = EnumC43867a.DONE;
        return null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.validator.base.b$1 */
    public static /* synthetic */ class C438661 {

        /* renamed from: a */
        static final /* synthetic */ int[] f111320a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.mail.impl.validator.base.b$a[] r0 = com.ss.android.lark.mail.impl.validator.base.AbstractC43865b.EnumC43867a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.validator.base.AbstractC43865b.C438661.f111320a = r0
                com.ss.android.lark.mail.impl.validator.base.b$a r1 = com.ss.android.lark.mail.impl.validator.base.AbstractC43865b.EnumC43867a.READY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.validator.base.AbstractC43865b.C438661.f111320a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.validator.base.b$a r1 = com.ss.android.lark.mail.impl.validator.base.AbstractC43865b.EnumC43867a.DONE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.validator.base.AbstractC43865b.C438661.<clinit>():void");
        }
    }

    /* renamed from: c */
    private boolean mo156279c() {
        this.f111318a = EnumC43867a.FAILED;
        this.f111319b = mo156251a();
        if (this.f111318a == EnumC43867a.DONE) {
            return false;
        }
        this.f111318a = EnumC43867a.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f111318a = EnumC43867a.NOT_READY;
            T t = this.f111319b;
            this.f111319b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        boolean z;
        if (this.f111318a != EnumC43867a.FAILED) {
            z = true;
        } else {
            z = false;
        }
        C43886f.m173945b(z);
        int i = C438661.f111320a[this.f111318a.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return mo156279c();
        }
        return false;
    }
}
