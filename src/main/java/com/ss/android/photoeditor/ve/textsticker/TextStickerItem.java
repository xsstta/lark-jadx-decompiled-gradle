package com.ss.android.photoeditor.ve.textsticker;

import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00109\u001a\u00020\u0010J\u0006\u0010:\u001a\u00020\u0010J\u0006\u0010;\u001a\u00020<J\u0006\u0010=\u001a\u00020<J\u0006\u0010>\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001a\u0010\u001e\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001a\u0010!\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u001a\u0010$\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001a\u0010'\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R\u001a\u0010*\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR\u001a\u0010-\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0012\"\u0004\b2\u0010\u0014R\u001a\u00103\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0012\"\u0004\b5\u0010\u0014R\u001a\u00106\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0012\"\u0004\b8\u0010\u0014¨\u0006?"}, d2 = {"Lcom/ss/android/photoeditor/ve/textsticker/TextStickerItem;", "", "()V", "backgroundColor", "", "getBackgroundColor", "()I", "setBackgroundColor", "(I)V", "fontPath", "", "getFontPath", "()Ljava/lang/String;", "setFontPath", "(Ljava/lang/String;)V", "height", "", "getHeight", "()F", "setHeight", "(F)V", "index", "getIndex", "setIndex", "layerIndex", "getLayerIndex", "setLayerIndex", "lineMaxWidth", "getLineMaxWidth", "setLineMaxWidth", "originX", "getOriginX", "setOriginX", "originY", "getOriginY", "setOriginY", "rotation", "getRotation", "setRotation", "scale", "getScale", "setScale", "text", "getText", "setText", "textColor", "getTextColor", "setTextColor", "width", "getWidth", "setWidth", "x", "getX", "setX", "y", "getY", "setY", "getCenterX", "getCenterY", "getLeftDownOriginRect", "Landroid/graphics/RectF;", "getLeftUpOriginRect", "toStickerDesc", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.ve.textsticker.a */
public final class TextStickerItem {

    /* renamed from: a */
    private int f149354a;

    /* renamed from: b */
    private float f149355b;

    /* renamed from: c */
    private float f149356c;

    /* renamed from: d */
    private float f149357d;

    /* renamed from: e */
    private float f149358e = 1.0f;

    /* renamed from: f */
    private float f149359f;

    /* renamed from: g */
    private float f149360g;

    /* renamed from: h */
    private float f149361h;

    /* renamed from: i */
    private float f149362i;

    /* renamed from: j */
    private String f149363j = "";

    /* renamed from: k */
    private int f149364k = -1;

    /* renamed from: l */
    private int f149365l;

    /* renamed from: m */
    private int f149366m;

    /* renamed from: n */
    private float f149367n = 0.8f;

    /* renamed from: o */
    private String f149368o = "";

    /* renamed from: a */
    public final int mo204075a() {
        return this.f149354a;
    }

    /* renamed from: b */
    public final float mo204079b() {
        return this.f149355b;
    }

    /* renamed from: c */
    public final float mo204082c() {
        return this.f149358e;
    }

    /* renamed from: d */
    public final float mo204085d() {
        return this.f149359f;
    }

    /* renamed from: e */
    public final float mo204088e() {
        return this.f149360g;
    }

    /* renamed from: f */
    public final float mo204090f() {
        return this.f149361h;
    }

    /* renamed from: g */
    public final float mo204092g() {
        return this.f149362i;
    }

    /* renamed from: h */
    public final String mo204094h() {
        return this.f149363j;
    }

    /* renamed from: i */
    public final int mo204096i() {
        return this.f149364k;
    }

    /* renamed from: j */
    public final int mo204097j() {
        return this.f149365l;
    }

    /* renamed from: k */
    public final int mo204098k() {
        return this.f149366m;
    }

    /* renamed from: m */
    public final float mo204100m() {
        return mo204099l().centerX();
    }

    /* renamed from: n */
    public final float mo204101n() {
        return mo204099l().centerY();
    }

    /* renamed from: l */
    public final RectF mo204099l() {
        float f = this.f149356c;
        float f2 = this.f149358e;
        float f3 = (f * f2) - f;
        float f4 = (float) 2;
        float f5 = f3 / f4;
        float f6 = this.f149357d;
        float f7 = ((f2 * f6) - f6) / f4;
        float f8 = this.f149359f;
        float f9 = this.f149360g;
        RectF rectF = new RectF(f8, this.f149357d + f9, this.f149356c + f8, f9);
        rectF.inset(-f5, -f7);
        return rectF;
    }

    /* renamed from: a */
    public final void mo204076a(float f) {
        this.f149355b = f;
    }

    /* renamed from: b */
    public final void mo204080b(float f) {
        this.f149356c = f;
    }

    /* renamed from: c */
    public final void mo204083c(float f) {
        this.f149357d = f;
    }

    /* renamed from: d */
    public final void mo204086d(float f) {
        this.f149358e = f;
    }

    /* renamed from: e */
    public final void mo204089e(float f) {
        this.f149359f = f;
    }

    /* renamed from: f */
    public final void mo204091f(float f) {
        this.f149360g = f;
    }

    /* renamed from: g */
    public final void mo204093g(float f) {
        this.f149361h = f;
    }

    /* renamed from: h */
    public final void mo204095h(float f) {
        this.f149362i = f;
    }

    /* renamed from: a */
    public final void mo204077a(int i) {
        this.f149354a = i;
    }

    /* renamed from: b */
    public final void mo204081b(int i) {
        this.f149364k = i;
    }

    /* renamed from: c */
    public final void mo204084c(int i) {
        this.f149365l = i;
    }

    /* renamed from: d */
    public final void mo204087d(int i) {
        this.f149366m = i;
    }

    /* renamed from: a */
    public final void mo204078a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f149363j = str;
    }
}
