package com.ss.android.lark.chat.preview.components.utils;

import android.content.Context;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.ss.android.lark.chat.entity.preview.FontLevel;
import com.ss.android.lark.chat.entity.preview.FontType;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/utils/FontUtils;", "", "()V", "getFakeBold", "", "fontLevel", "Lcom/ss/android/lark/chat/entity/preview/FontLevel;", "getLarkFont", "Lcom/larksuite/component/ui/display/manager/LarkFont;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/preview/FontType;", "level", "", "getTextSizeInPx", "", "context", "Landroid/content/Context;", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.components.a.a */
public final class FontUtils {

    /* renamed from: a */
    public static final FontUtils f88131a = new FontUtils();

    private FontUtils() {
    }

    /* renamed from: a */
    public final boolean mo126269a(FontLevel fontLevel) {
        FontType fontType;
        int i;
        if (fontLevel == null || (fontType = fontLevel.getType()) == null) {
            fontType = FontType.CAPTION;
        }
        if (fontLevel != null) {
            i = fontLevel.getLevel();
        } else {
            i = 0;
        }
        int i2 = C34090b.f88132a[fontType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return true;
        }
        if (i2 != 3) {
            if (i == 0 || (i != 1 && i == 2)) {
                return true;
            }
            return false;
        } else if (i == 0 || i != 1) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final float mo126267a(Context context, FontLevel fontLevel) {
        FontType fontType;
        int i;
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (fontLevel == null || (fontType = fontLevel.getType()) == null) {
            fontType = FontType.CAPTION;
        }
        if (fontLevel != null) {
            i = fontLevel.getLevel();
        } else {
            i = 0;
        }
        return LKUIDisplayManager.m91865a(context, mo126268a(fontType, i));
    }

    /* renamed from: a */
    public final LarkFont mo126268a(FontType fontType, int i) {
        Intrinsics.checkParameterIsNotNull(fontType, ShareHitPoint.f121869d);
        int i2 = C34090b.f88133b[fontType.ordinal()];
        if (i2 == 1) {
            return LarkFont.TITLE4;
        }
        if (i2 == 2) {
            return LarkFont.HEADLINE;
        }
        if (i2 != 3) {
            if (i == 0) {
                return LarkFont.CAPTION0;
            }
            if (i == 1) {
                return LarkFont.CAPTION1;
            }
            if (i != 2) {
                return LarkFont.CAPTION3;
            }
            return LarkFont.CAPTION2;
        } else if (i == 0) {
            return LarkFont.BODY0;
        } else {
            if (i != 1) {
                return LarkFont.BODY2;
            }
            return LarkFont.BODY1;
        }
    }
}
