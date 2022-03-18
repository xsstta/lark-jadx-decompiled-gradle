package com.ss.android.lark.chatsetting.impl.group.info.qrcode;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.joooonho.SelectableRoundedImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/info/qrcode/ListenableImageView;", "Lcom/joooonho/SelectableRoundedImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onImageDrawableChangedListener", "Lcom/ss/android/lark/chatsetting/impl/group/info/qrcode/ListenableImageView$OnImageDrawableChangedListener;", "getOnImageDrawableChangedListener", "()Lcom/ss/android/lark/chatsetting/impl/group/info/qrcode/ListenableImageView$OnImageDrawableChangedListener;", "setOnImageDrawableChangedListener", "(Lcom/ss/android/lark/chatsetting/impl/group/info/qrcode/ListenableImageView$OnImageDrawableChangedListener;)V", "setImageDrawable", "", "drawable", "Landroid/graphics/drawable/Drawable;", "OnImageDrawableChangedListener", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ListenableImageView extends SelectableRoundedImageView {

    /* renamed from: a */
    private OnImageDrawableChangedListener f89470a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/info/qrcode/ListenableImageView$OnImageDrawableChangedListener;", "", "onImageDrawableChanged", "", "oldDrawable", "Landroid/graphics/drawable/Drawable;", "newDrawable", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.qrcode.ListenableImageView$a */
    public interface OnImageDrawableChangedListener {
        /* renamed from: a */
        void mo127991a(Drawable drawable, Drawable drawable2);
    }

    public ListenableImageView(Context context) {
        this(context, null, 2, null);
    }

    public final OnImageDrawableChangedListener getOnImageDrawableChangedListener() {
        return this.f89470a;
    }

    public final void setOnImageDrawableChangedListener(OnImageDrawableChangedListener aVar) {
        this.f89470a = aVar;
    }

    @Override // com.joooonho.SelectableRoundedImageView
    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        super.setImageDrawable(drawable);
        OnImageDrawableChangedListener aVar = this.f89470a;
        if (aVar != null) {
            aVar.mo127991a(drawable2, drawable);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListenableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListenableImageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
