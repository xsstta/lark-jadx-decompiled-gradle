package com.ss.android.lark.thirdshare.base.export.downgrade;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/thirdshare/base/export/downgrade/RemoteCtaBtnStyle;", "Lcom/ss/android/lark/thirdshare/base/export/downgrade/CtaBtnStyle;", "text", "", "textColor", "", "normalColor", "pressedColor", "(Ljava/lang/String;III)V", "getLogoDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "getNormalColor", "getPressedColor", "getText", "getTextColor", "components_third-share_base_export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class RemoteCtaBtnStyle extends CtaBtnStyle {
    private final int normalColor;
    private final int pressedColor;
    private final String text;
    private final int textColor;

    @Override // com.ss.android.lark.thirdshare.base.export.downgrade.CtaBtnStyle
    public Drawable getLogoDrawable(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return null;
    }

    @Override // com.ss.android.lark.thirdshare.base.export.downgrade.CtaBtnStyle
    public int getNormalColor(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return this.normalColor;
    }

    @Override // com.ss.android.lark.thirdshare.base.export.downgrade.CtaBtnStyle
    public int getPressedColor(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return this.pressedColor;
    }

    @Override // com.ss.android.lark.thirdshare.base.export.downgrade.CtaBtnStyle
    public String getText(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return this.text;
    }

    @Override // com.ss.android.lark.thirdshare.base.export.downgrade.CtaBtnStyle
    public int getTextColor(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return this.textColor;
    }

    public RemoteCtaBtnStyle(String str, int i, int i2, int i3) {
        this.text = str;
        this.textColor = i;
        this.normalColor = i2;
        this.pressedColor = i3;
    }
}
