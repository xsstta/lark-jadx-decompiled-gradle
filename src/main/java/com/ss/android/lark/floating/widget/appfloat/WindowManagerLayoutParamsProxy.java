package com.ss.android.lark.floating.widget.appfloat;

import android.view.WindowManager;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010'\u001a\u00020(R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8F@FX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8F@FX\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8F@FX\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR$\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8F@FX\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R$\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8F@FX\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000fR$\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8F@FX\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u000fR$\u0010!\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8F@FX\u000e¢\u0006\f\u001a\u0004\b\"\u0010\r\"\u0004\b#\u0010\u000fR$\u0010$\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8F@FX\u000e¢\u0006\f\u001a\u0004\b%\u0010\r\"\u0004\b&\u0010\u000f¨\u0006)"}, d2 = {"Lcom/ss/android/lark/floating/widget/appfloat/WindowManagerLayoutParamsProxy;", "", "()V", "value", "", "dimAmount", "getDimAmount", "()F", "setDimAmount", "(F)V", "", "flags", "getFlags", "()I", "setFlags", "(I)V", "format", "getFormat", "setFormat", "gravity", "getGravity", "setGravity", "height", "getHeight", "setHeight", "params", "Lcom/ss/android/lark/floating/widget/appfloat/WindowManagerLayoutParamsInternal;", ShareHitPoint.f121869d, "getType", "setType", "width", "getWidth", "setWidth", "x", "getX", "setX", "y", "getY", "setY", "asLayoutParams", "Landroid/view/WindowManager$LayoutParams;", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.floating.widget.appfloat.g */
public final class WindowManagerLayoutParamsProxy {

    /* renamed from: a */
    private final WindowManagerLayoutParamsInternal f98600a = new WindowManagerLayoutParamsInternal();

    /* renamed from: a */
    public final int mo140368a() {
        return this.f98600a.flags;
    }

    /* renamed from: b */
    public final int mo140371b() {
        return this.f98600a.x;
    }

    /* renamed from: c */
    public final int mo140373c() {
        return this.f98600a.y;
    }

    /* renamed from: d */
    public final WindowManager.LayoutParams mo140375d() {
        return this.f98600a;
    }

    /* renamed from: e */
    public final void mo140377e(int i) {
        this.f98600a.width = i;
    }

    /* renamed from: f */
    public final void mo140378f(int i) {
        this.f98600a.height = i;
    }

    /* renamed from: g */
    public final void mo140379g(int i) {
        this.f98600a.x = i;
    }

    /* renamed from: h */
    public final void mo140380h(int i) {
        this.f98600a.y = i;
    }

    /* renamed from: a */
    public final void mo140369a(float f) {
        this.f98600a.dimAmount = f;
    }

    /* renamed from: b */
    public final void mo140372b(int i) {
        this.f98600a.format = i;
    }

    /* renamed from: c */
    public final void mo140374c(int i) {
        this.f98600a.gravity = i;
    }

    /* renamed from: d */
    public final void mo140376d(int i) {
        this.f98600a.flags = i;
    }

    /* renamed from: a */
    public final void mo140370a(int i) {
        this.f98600a.type = i;
    }
}
