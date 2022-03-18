package com.ss.android.lark.chat.entity.preview;

import android.content.Context;
import android.graphics.Color;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.ss.android.lark.chat.entity.preview.ThemeColor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/ColorUtils;", "", "()V", "STATIC_WHITE_TOKEN", "", "getColorByThemeColor", "", "themeColor", "Lcom/ss/android/lark/chat/entity/preview/ThemeColor;", "context", "Landroid/content/Context;", "int2Argb", "colorValue", "rgba2Argb", "color", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.entity.preview.a */
public final class ColorUtils {

    /* renamed from: a */
    public static final ColorUtils f87906a = new ColorUtils();

    private ColorUtils() {
    }

    /* renamed from: a */
    public final int mo125873a(int i) {
        return Color.argb(i & 255, (i >> 24) & 255, (i >> 16) & 255, (i >> 8) & 255);
    }

    /* renamed from: a */
    public final int mo125874a(ThemeColor themeColor, Context context) {
        String str;
        int colorIdByToken;
        Intrinsics.checkParameterIsNotNull(themeColor, "themeColor");
        Intrinsics.checkParameterIsNotNull(context, "context");
        String token = themeColor.getToken();
        if (token != null && (colorIdByToken = UDColorUtils.getColorIdByToken(context, token)) > 0) {
            return UDColorUtils.getColor(context, colorIdByToken);
        }
        int i = 0;
        if (themeColor.getKey().getType() != null) {
            ThemeColor.Key key = themeColor.getKey();
            if (key.getType() == ThemeColor.KeyType.STATIC_WHITE) {
                int colorIdByToken2 = UDColorUtils.getColorIdByToken(context, "static_white");
                if (colorIdByToken2 != 0) {
                    return UDColorUtils.getAlphaColor(context, colorIdByToken2, ((float) key.getAlpha()) / 100.0f);
                }
                ColorUtils aVar = f87906a;
                Integer value = themeColor.getValue();
                if (value != null) {
                    i = value.intValue();
                }
                return aVar.mo125873a(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ud_");
            ThemeColor.KeyType type = key.getType();
            if (type != null) {
                str = type.name();
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(key.getValue());
            int colorIdByToken3 = UDColorUtils.getColorIdByToken(context, sb.toString());
            if (colorIdByToken3 != 0) {
                return UDColorUtils.getAlphaColor(context, colorIdByToken3, ((float) key.getAlpha()) / 100.0f);
            }
            ColorUtils aVar2 = f87906a;
            Integer value2 = themeColor.getValue();
            if (value2 != null) {
                i = value2.intValue();
            }
            return aVar2.mo125873a(i);
        }
        Integer value3 = themeColor.getValue();
        if (value3 != null) {
            i = value3.intValue();
        }
        return mo125873a(i);
    }
}
