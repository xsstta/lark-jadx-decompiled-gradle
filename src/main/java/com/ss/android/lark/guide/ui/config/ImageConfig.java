package com.ss.android.lark.guide.ui.config;

import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0011\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/guide/ui/config/ImageConfig;", "", "image", "Landroid/graphics/drawable/Drawable;", "(Landroid/graphics/drawable/Drawable;)V", "imageCustomView", "Landroid/view/View;", "(Landroid/view/View;)V", "getImage", "()Landroid/graphics/drawable/Drawable;", "getImageCustomView", "()Landroid/view/View;", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guide.ui.config.h */
public final class ImageConfig {

    /* renamed from: a */
    private final Drawable f99527a;

    /* renamed from: b */
    private final View f99528b;

    /* renamed from: a */
    public final Drawable mo141775a() {
        return this.f99527a;
    }

    /* renamed from: b */
    public final View mo141776b() {
        return this.f99528b;
    }

    public ImageConfig(Drawable drawable) {
        Intrinsics.checkParameterIsNotNull(drawable, "image");
        this.f99527a = drawable;
        this.f99528b = null;
    }

    public ImageConfig(View view) {
        this.f99527a = null;
        this.f99528b = view;
    }
}
