package com.ss.android.lark.chat.preview.parser;

import com.bytedance.lark.pb.basic.v1.Gradient;
import com.bytedance.lark.pb.basic.v1.ThemeColor;
import com.bytedance.lark.pb.basic.v1.URLPreviewComponent;
import com.ss.android.lark.chat.entity.preview.Border;
import com.ss.android.lark.chat.entity.preview.FontLevel;
import com.ss.android.lark.chat.entity.preview.FontType;
import com.ss.android.lark.chat.entity.preview.Gradient;
import com.ss.android.lark.chat.entity.preview.SizeLevel;
import com.ss.android.lark.chat.entity.preview.Style;
import com.ss.android.lark.chat.entity.preview.ThemeColor;
import com.ss.android.lark.tangram.base.style.Value;
import com.ss.android.lark.tangram.base.style.ValueType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J \u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00182\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018H\u0007J\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/chat/preview/parser/ModelParserUrlPreviewStyle;", "", "()V", "parseBorder", "Lcom/ss/android/lark/chat/entity/preview/Border;", "pbBorder", "Lcom/bytedance/lark/pb/basic/v1/Border;", "parseGradientFromPb", "Lcom/ss/android/lark/chat/entity/preview/Gradient;", "pbGradient", "Lcom/bytedance/lark/pb/basic/v1/Gradient;", "parseGradientLinearFromPb", "Lcom/ss/android/lark/chat/entity/preview/Gradient$Linear;", "pbLinear", "Lcom/bytedance/lark/pb/basic/v1/Gradient$Linear;", "parseStyleFromPb", "Lcom/ss/android/lark/chat/entity/preview/Style;", "pbStyle", "Lcom/bytedance/lark/pb/basic/v1/URLPreviewComponent$Style;", "parseThemeColor", "Lcom/ss/android/lark/chat/entity/preview/ThemeColor;", "themeColor", "Lcom/bytedance/lark/pb/basic/v1/ThemeColor;", "parseThemeColorList", "", "themeColors", "parseValueFromPb", "Lcom/ss/android/lark/tangram/base/style/Value;", "pbValue", "Lcom/bytedance/lark/pb/basic/v1/URLPreviewComponent$Value;", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.c.e */
public final class ModelParserUrlPreviewStyle {

    /* renamed from: a */
    public static final ModelParserUrlPreviewStyle f88129a = new ModelParserUrlPreviewStyle();

    private ModelParserUrlPreviewStyle() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final Border m132295a(com.bytedance.lark.pb.basic.v1.Border border) {
        if (border == null) {
            return null;
        }
        return new Border(border.width, border.corner_radius, m132299a(border.color_v2));
    }

    @JvmStatic
    /* renamed from: a */
    public static final Gradient.Linear m132296a(Gradient.Linear linear) {
        if (linear == null) {
            return new Gradient.Linear(0, null);
        }
        return new Gradient.Linear(linear.deg, m132301a(linear.colors_v2));
    }

    @JvmStatic
    /* renamed from: a */
    public static final com.ss.android.lark.chat.entity.preview.Gradient m132297a(com.bytedance.lark.pb.basic.v1.Gradient gradient) {
        if (gradient == null) {
            return null;
        }
        Gradient.Type.Companion aVar = Gradient.Type.Companion;
        Gradient.Type type = gradient.type;
        Intrinsics.checkExpressionValueIsNotNull(type, "pbGradient.type");
        return new com.ss.android.lark.chat.entity.preview.Gradient(aVar.mo125715a(type.getValue()), m132296a(gradient.linear));
    }

    @JvmStatic
    /* renamed from: a */
    public static final Style m132298a(URLPreviewComponent.Style style) {
        int i;
        Integer num;
        URLPreviewComponent.FontType fontType;
        if (style == null) {
            return null;
        }
        SizeLevel.Companion aVar = SizeLevel.Companion;
        URLPreviewComponent.SizeLevel sizeLevel = style.size_level;
        Intrinsics.checkExpressionValueIsNotNull(sizeLevel, "pbStyle.size_level");
        SizeLevel a = aVar.mo125763a(sizeLevel.getValue());
        FontType.Companion aVar2 = FontType.Companion;
        URLPreviewComponent.FontLevel fontLevel = style.font_level;
        int i2 = 0;
        if (fontLevel == null || (fontType = fontLevel.type) == null) {
            i = 0;
        } else {
            i = fontType.getValue();
        }
        FontType a2 = aVar2.mo125696a(i);
        URLPreviewComponent.FontLevel fontLevel2 = style.font_level;
        if (!(fontLevel2 == null || (num = fontLevel2.level) == null)) {
            i2 = num.intValue();
        }
        FontLevel fontLevel3 = new FontLevel(a2, i2);
        ThemeColor a3 = m132299a(style.text_color_v2);
        Border a4 = m132295a(style.border);
        com.ss.android.lark.chat.entity.preview.Gradient a5 = m132297a(style.background_color);
        Value a6 = m132300a(style.width);
        Value a7 = m132300a(style.height);
        Value a8 = m132300a(style.min_width);
        Value a9 = m132300a(style.min_height);
        Value a10 = m132300a(style.max_width);
        Value a11 = m132300a(style.max_height);
        Integer num2 = style.grow_weight;
        Intrinsics.checkExpressionValueIsNotNull(num2, "pbStyle.grow_weight");
        int intValue = num2.intValue();
        Integer num3 = style.shrink_weight;
        Intrinsics.checkExpressionValueIsNotNull(num3, "pbStyle.shrink_weight");
        return new Style(a, fontLevel3, a3, a4, a5, a6, a7, a8, a9, a10, a11, intValue, num3.intValue());
    }

    @JvmStatic
    /* renamed from: a */
    public static final ThemeColor m132299a(com.bytedance.lark.pb.basic.v1.ThemeColor themeColor) {
        Integer num;
        int i;
        Integer num2;
        ThemeColor.KeyType keyType;
        Integer num3 = null;
        if (themeColor == null) {
            return null;
        }
        ThemeColor.Key key = themeColor.key;
        String str = themeColor.token;
        Integer num4 = themeColor.value;
        ThemeColor.KeyType.Companion aVar = ThemeColor.KeyType.Companion;
        if (key == null || (keyType = key.type) == null) {
            num = null;
        } else {
            num = Integer.valueOf(keyType.getValue());
        }
        ThemeColor.KeyType a = aVar.mo125795a(num);
        if (key != null) {
            num3 = key.value;
        }
        if (key == null || (num2 = key.alpha) == null) {
            i = 100;
        } else {
            i = num2.intValue();
        }
        return new com.ss.android.lark.chat.entity.preview.ThemeColor(str, num4, new ThemeColor.Key(a, num3, i));
    }

    @JvmStatic
    /* renamed from: a */
    public static final Value m132300a(URLPreviewComponent.Value value) {
        if (value == null) {
            return null;
        }
        ValueType.Companion aVar = ValueType.Companion;
        URLPreviewComponent.ValueType valueType = value.type;
        Intrinsics.checkExpressionValueIsNotNull(valueType, "pbValue.type");
        return new Value(aVar.mo188869a(valueType.getValue()), value.value);
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<com.ss.android.lark.chat.entity.preview.ThemeColor> m132301a(List<com.bytedance.lark.pb.basic.v1.ThemeColor> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            com.ss.android.lark.chat.entity.preview.ThemeColor a = m132299a((com.bytedance.lark.pb.basic.v1.ThemeColor) it.next());
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }
}
