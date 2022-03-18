package com.ss.android.lark.thirdshare.base.export.downgrade;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.larksuite.suite.R;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import java.io.Serializable;

public class CtaBtnStyle implements Serializable {
    public static final CtaBtnStyle QQ = new CtaBtnStyle(R.drawable.ts_icon_qq_logo, R.string.Lark_Invitation_ShareViaQQ_ImageCreatedAndSaved_button, R.color.static_white, R.color.ud_W500, R.color.ud_W600);
    public static final CtaBtnStyle WB = new CtaBtnStyle(R.drawable.ts_icon_wb_logo, R.string.Lark_Invitation_ShareViaWeibo_ImageCreatedAndSaved_button, R.color.static_white, R.color.ud_R500, R.color.ud_R600);
    public static final CtaBtnStyle WX = new CtaBtnStyle(R.drawable.ts_icon_wx_logo, R.string.Lark_Invitation_ShareViaWeChat_ImageCreatedAndSaved_button, R.color.static_white, R.color.ud_G500, R.color.ud_G600);
    private int logoDrawableId;
    private int normalColorRes;
    private int pressedColorRes;
    private int textColorRes;
    private int textId;

    protected CtaBtnStyle() {
    }

    public int getNormalColor(Context context) {
        return ContextCompat.getColor(context, this.normalColorRes);
    }

    public int getPressedColor(Context context) {
        return ContextCompat.getColor(context, this.pressedColorRes);
    }

    public int getTextColor(Context context) {
        return ContextCompat.getColor(context, this.textColorRes);
    }

    public String getText(Context context) {
        int i = this.textId;
        if (i == 0) {
            return null;
        }
        return context.getString(i);
    }

    public Drawable getLogoDrawable(Context context) {
        int i = this.logoDrawableId;
        if (i == 0) {
            return null;
        }
        Drawable drawable = ContextCompat.getDrawable(context, i);
        drawable.mutate();
        drawable.setTint(ContextCompat.getColor(context, R.color.static_white));
        return drawable;
    }

    public static CtaBtnStyle getThirdAppCtaBtnStyle(ShareActionType shareActionType) {
        if (ShareActionType.WX.equals(shareActionType) || ShareActionType.WX_TIMELINE.equals(shareActionType)) {
            return WX;
        }
        if (ShareActionType.QQ.equals(shareActionType)) {
            return QQ;
        }
        if (ShareActionType.WB.equals(shareActionType)) {
            return WB;
        }
        return null;
    }

    public CtaBtnStyle(int i, int i2, int i3, int i4, int i5) {
        this.logoDrawableId = i;
        this.textId = i2;
        this.textColorRes = i3;
        this.normalColorRes = i4;
        this.pressedColorRes = i5;
    }
}
