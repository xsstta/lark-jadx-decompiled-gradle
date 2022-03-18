package com.lynx.tasm.animation.p1218b;

import android.graphics.Rect;
import android.view.animation.Animation;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.animation.C26562a;
import com.lynx.tasm.animation.C26570b;
import com.lynx.tasm.behavior.ui.LynxUI;

/* renamed from: com.lynx.tasm.animation.b.a */
public abstract class AbstractC26573a {

    /* renamed from: a */
    protected C26562a f65732a = new C26562a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Animation mo94430a(LynxUI lynxUI, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect, float f);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo94434a() {
        C26562a aVar = this.f65732a;
        if (aVar == null || aVar.mo94378b() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo94431a(int i) {
        this.f65732a.mo94375a(i);
    }

    /* renamed from: b */
    public void mo94436b(long j) {
        this.f65732a.mo94376a(j);
    }

    /* renamed from: a */
    public void mo94432a(long j) {
        this.f65732a.mo94381b(j);
    }

    /* renamed from: a */
    public void mo94433a(ReadableArray readableArray) {
        this.f65732a.mo94372a(readableArray, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Animation mo94435b(LynxUI lynxUI, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect, float f) {
        if (!mo94434a()) {
            return null;
        }
        Animation a = mo94430a(lynxUI, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect, f);
        if (a != null) {
            a.setDuration(this.f65732a.mo94378b());
            a.setStartOffset(this.f65732a.mo94382c());
            a.setInterpolator(C26570b.m96358a(this.f65732a));
        }
        return a;
    }
}
