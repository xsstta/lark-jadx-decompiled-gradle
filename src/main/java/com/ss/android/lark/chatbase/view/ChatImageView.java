package com.ss.android.lark.chatbase.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\bR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chatbase/view/ChatImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onImageDrawableChangedListener", "Lcom/ss/android/lark/chatbase/view/ChatImageView$OnImageDrawableChangedListener;", "setImageDrawable", "", "drawable", "Landroid/graphics/drawable/Drawable;", "setOnImageDrawableChangedListener", "listener", "OnImageDrawableChangedListener", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatImageView extends AppCompatImageView {

    /* renamed from: a */
    private OnImageDrawableChangedListener f88930a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chatbase/view/ChatImageView$OnImageDrawableChangedListener;", "", "onImageDrawableChanged", "", "drawable", "Landroid/graphics/drawable/Drawable;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatbase.view.ChatImageView$a */
    public interface OnImageDrawableChangedListener {
        void onImageDrawableChanged(Drawable drawable);
    }

    public final void setOnImageDrawableChangedListener(OnImageDrawableChangedListener aVar) {
        this.f88930a = aVar;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        OnImageDrawableChangedListener aVar = this.f88930a;
        if (aVar != null) {
            aVar.onImageDrawableChanged(drawable);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
