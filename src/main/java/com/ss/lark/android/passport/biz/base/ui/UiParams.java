package com.ss.lark.android.passport.biz.base.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/lark/android/passport/biz/base/ui/UiParams;", "", "enableTransparentStatusBar", "", "fitsStatusBar", "(ZZ)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.base.ui.c */
public final class UiParams {

    /* renamed from: c */
    public static final UiParams f162617c = new UiParams(true, true);

    /* renamed from: d */
    public static final UiParams f162618d = new UiParams(true, false);

    /* renamed from: e */
    public static final Companion f162619e = new Companion(null);

    /* renamed from: a */
    public final boolean f162620a;

    /* renamed from: b */
    public final boolean f162621b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiParams)) {
            return false;
        }
        UiParams cVar = (UiParams) obj;
        return this.f162620a == cVar.f162620a && this.f162621b == cVar.f162621b;
    }

    public int hashCode() {
        boolean z = this.f162620a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.f162621b;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i5 + i;
    }

    public String toString() {
        return "UiParams(enableTransparentStatusBar=" + this.f162620a + ", fitsStatusBar=" + this.f162621b + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/lark/android/passport/biz/base/ui/UiParams$Companion;", "", "()V", "DefaultBaseUi", "Lcom/ss/lark/android/passport/biz/base/ui/UiParams;", "getDefaultBaseUi", "()Lcom/ss/lark/android/passport/biz/base/ui/UiParams;", "DefaultCommonUi", "getDefaultCommonUi", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.base.ui.c$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final UiParams mo222894a() {
            return UiParams.f162617c;
        }

        /* renamed from: b */
        public final UiParams mo222895b() {
            return UiParams.f162618d;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UiParams(boolean z, boolean z2) {
        this.f162620a = z;
        this.f162621b = z2;
    }
}
