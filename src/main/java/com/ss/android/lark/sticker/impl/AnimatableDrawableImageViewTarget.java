package com.ss.android.lark.sticker.impl;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.ss.android.lark.image.api.C38811b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\nH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/sticker/impl/AnimatableDrawableImageViewTarget;", "Lcom/ss/android/lark/image/api/DrawableImageViewTarget;", "imageView", "Landroid/widget/ImageView;", "(Landroid/widget/ImageView;)V", "animatable", "Landroid/graphics/drawable/Animatable;", "onLoadCleared", "", "placeholder", "Landroid/graphics/drawable/Drawable;", "onLoadFailed", "errorDrawable", "onLoadStarted", "onResourceReady", "resource", "im_sticker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.sticker.a.a */
public final class AnimatableDrawableImageViewTarget extends C38811b {

    /* renamed from: b */
    private Animatable f135933b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatableDrawableImageViewTarget(ImageView imageView) {
        super(imageView);
        Intrinsics.checkParameterIsNotNull(imageView, "imageView");
    }

    @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
    /* renamed from: a */
    public void mo49247a(Drawable drawable) {
        Animatable animatable = this.f135933b;
        if (animatable != null) {
            animatable.stop();
        }
        this.f135933b = null;
    }

    @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
    /* renamed from: b */
    public void mo99365b(Drawable drawable) {
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            animatable.start();
            this.f135933b = animatable;
        }
    }

    @Override // com.ss.android.lark.image.api.C38811b, com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
    /* renamed from: c */
    public void mo142224c(Drawable drawable) {
        Animatable animatable = this.f135933b;
        if (animatable != null) {
            animatable.stop();
        }
        this.f135933b = null;
    }

    /* renamed from: d */
    public void mo49248a(Drawable drawable) {
        Intrinsics.checkParameterIsNotNull(drawable, "resource");
        Animatable animatable = this.f135933b;
        if (animatable != null) {
            animatable.stop();
        }
        this.f135933b = null;
    }
}
