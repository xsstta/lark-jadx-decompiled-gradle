package com.ss.android.lark.keyboard.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\nJ\u0010\u0010\u0011\u001a\u00020\u000e2\b\b\u0001\u0010\u0012\u001a\u00020\u0007J\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/StickerTabItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mFaceDependency", "Lcom/ss/android/lark/keyboard/plugin/tool/face/IFaceDependency;", "mIvTabIcon", "Landroid/widget/ImageView;", "init", "", "setFaceDependency", "faceDependency", "setTabIcon", "iconId", "key", "", "path", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class StickerTabItemView extends FrameLayout {

    /* renamed from: a */
    private ImageView f104788a;

    /* renamed from: b */
    private IFaceDependency f104789b;

    public StickerTabItemView(Context context) {
        this(context, null, 0, 6, null);
    }

    public StickerTabItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    private final void m162983a() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_sticker_tab_item, this);
        View findViewById = findViewById(R.id.iv_icon);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.iv_icon)");
        this.f104788a = (ImageView) findViewById;
    }

    public final void setFaceDependency(IFaceDependency gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "faceDependency");
        this.f104789b = gVar;
    }

    public final void setTabIcon(int i) {
        ImageView imageView = this.f104788a;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvTabIcon");
        }
        imageView.setImageResource(i);
    }

    /* renamed from: a */
    public final void mo148225a(String str, String str2) {
        int i;
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "path");
        if (DesktopUtil.m144307b()) {
            i = UIUtils.dp2px(getContext(), 22.0f);
        } else {
            i = getWidth();
        }
        IFaceDependency gVar = this.f104789b;
        if (gVar != null) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            ImageView imageView = this.f104788a;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvTabIcon");
            }
            gVar.mo127076a(context, true, i, i, str, imageView, R.drawable.ic_icon_sticker_tab_default, R.drawable.ic_icon_sticker_tab_default, str2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerTabItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m162983a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StickerTabItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
