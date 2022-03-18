package com.ss.android.lark.guide.ui.config;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/guide/ui/config/ImageDialogConfig;", "", "image", "Landroid/graphics/drawable/Drawable;", "title", "", "detail", "button", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig;", "(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/guide/ui/config/ButtonConfig;)V", "getButton", "()Lcom/ss/android/lark/guide/ui/config/ButtonConfig;", "getDetail", "()Ljava/lang/String;", "getImage", "()Landroid/graphics/drawable/Drawable;", "onDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "getOnDismissListener", "()Landroid/content/DialogInterface$OnDismissListener;", "setOnDismissListener", "(Landroid/content/DialogInterface$OnDismissListener;)V", "getTitle", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guide.ui.config.i */
public final class ImageDialogConfig {

    /* renamed from: a */
    private DialogInterface.OnDismissListener f99529a;

    /* renamed from: b */
    private final Drawable f99530b;

    /* renamed from: c */
    private final String f99531c;

    /* renamed from: d */
    private final String f99532d;

    /* renamed from: e */
    private final ButtonConfig f99533e;

    /* renamed from: a */
    public final DialogInterface.OnDismissListener mo141777a() {
        return this.f99529a;
    }

    /* renamed from: b */
    public final Drawable mo141779b() {
        return this.f99530b;
    }

    /* renamed from: c */
    public final String mo141780c() {
        return this.f99531c;
    }

    /* renamed from: d */
    public final String mo141781d() {
        return this.f99532d;
    }

    /* renamed from: e */
    public final ButtonConfig mo141782e() {
        return this.f99533e;
    }

    /* renamed from: a */
    public final void mo141778a(DialogInterface.OnDismissListener onDismissListener) {
        this.f99529a = onDismissListener;
    }
}
