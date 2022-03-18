package com.ss.android.lark.chat.entity.preview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.ss.android.lark.chat.entity.preview.Gradient;
import com.ss.android.lark.tangram.base.style.TCStyle;
import com.ss.android.lark.tangram.base.style.Value;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 02\u00020\u0001:\u0002/0B\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0002\u0010\u0016J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\b\u0010%\u001a\u00020\u0000H\u0016J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u0017\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020\u0014H\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00061"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/Style;", "Lcom/ss/android/lark/tangram/base/style/TCStyle;", "sizeLevel", "Lcom/ss/android/lark/chat/entity/preview/SizeLevel;", "fontLevel", "Lcom/ss/android/lark/chat/entity/preview/FontLevel;", "textColorV2", "Lcom/ss/android/lark/chat/entity/preview/ThemeColor;", "border", "Lcom/ss/android/lark/chat/entity/preview/Border;", "backgroundColor", "Lcom/ss/android/lark/chat/entity/preview/Gradient;", "width", "Lcom/ss/android/lark/tangram/base/style/Value;", "height", "minWidth", "minHeight", "maxWidth", "maxHeight", "growWeight", "", "shrinkWeight", "(Lcom/ss/android/lark/chat/entity/preview/SizeLevel;Lcom/ss/android/lark/chat/entity/preview/FontLevel;Lcom/ss/android/lark/chat/entity/preview/ThemeColor;Lcom/ss/android/lark/chat/entity/preview/Border;Lcom/ss/android/lark/chat/entity/preview/Gradient;Lcom/ss/android/lark/tangram/base/style/Value;Lcom/ss/android/lark/tangram/base/style/Value;Lcom/ss/android/lark/tangram/base/style/Value;Lcom/ss/android/lark/tangram/base/style/Value;Lcom/ss/android/lark/tangram/base/style/Value;Lcom/ss/android/lark/tangram/base/style/Value;II)V", "getBackgroundColor", "()Lcom/ss/android/lark/chat/entity/preview/Gradient;", "getBorder", "()Lcom/ss/android/lark/chat/entity/preview/Border;", "getFontLevel", "()Lcom/ss/android/lark/chat/entity/preview/FontLevel;", "getSizeLevel", "()Lcom/ss/android/lark/chat/entity/preview/SizeLevel;", "getTextColorV2", "()Lcom/ss/android/lark/chat/entity/preview/ThemeColor;", "applyToBackground", "", "view", "Landroid/view/View;", "clone", "equals", "", "other", "", "getOrientationFromAngle", "Landroid/graphics/drawable/GradientDrawable$Orientation;", "angle", "(Ljava/lang/Integer;)Landroid/graphics/drawable/GradientDrawable$Orientation;", "hashCode", "Builder", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class Style extends TCStyle {
    public static final Companion Companion = new Companion(null);
    private final Gradient backgroundColor;
    private final Border border;
    private final FontLevel fontLevel;
    private final SizeLevel sizeLevel;
    private final ThemeColor textColorV2;

    public Style() {
        this(null, null, null, null, null, null, null, null, null, null, null, 0, 0, 8191, null);
    }

    @JvmStatic
    /* renamed from: default  reason: not valid java name */
    public static final Style m270395default() {
        return Companion.mo125774a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/Style$Companion;", "", "()V", "default", "Lcom/ss/android/lark/chat/entity/preview/Style;", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.preview.Style$b */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final Style mo125774a() {
            return new Builder().mo125773a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Gradient getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Border getBorder() {
        return this.border;
    }

    public final FontLevel getFontLevel() {
        return this.fontLevel;
    }

    public final SizeLevel getSizeLevel() {
        return this.sizeLevel;
    }

    public final ThemeColor getTextColorV2() {
        return this.textColorV2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010(\u001a\u00020)H\u0016J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\"\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/Style$Builder;", "Lcom/ss/android/lark/tangram/base/style/TCStyle$Builder;", "()V", "backgroundColor", "Lcom/ss/android/lark/chat/entity/preview/Gradient;", "getBackgroundColor", "()Lcom/ss/android/lark/chat/entity/preview/Gradient;", "setBackgroundColor", "(Lcom/ss/android/lark/chat/entity/preview/Gradient;)V", "border", "Lcom/ss/android/lark/chat/entity/preview/Border;", "getBorder", "()Lcom/ss/android/lark/chat/entity/preview/Border;", "setBorder", "(Lcom/ss/android/lark/chat/entity/preview/Border;)V", "fontLevel", "Lcom/ss/android/lark/chat/entity/preview/FontLevel;", "getFontLevel", "()Lcom/ss/android/lark/chat/entity/preview/FontLevel;", "setFontLevel", "(Lcom/ss/android/lark/chat/entity/preview/FontLevel;)V", "sizeLevel", "Lcom/ss/android/lark/chat/entity/preview/SizeLevel;", "getSizeLevel", "()Lcom/ss/android/lark/chat/entity/preview/SizeLevel;", "setSizeLevel", "(Lcom/ss/android/lark/chat/entity/preview/SizeLevel;)V", "textColor", "", "getTextColor", "()Ljava/lang/Integer;", "setTextColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "textColorV2", "Lcom/ss/android/lark/chat/entity/preview/ThemeColor;", "getTextColorV2", "()Lcom/ss/android/lark/chat/entity/preview/ThemeColor;", "setTextColorV2", "(Lcom/ss/android/lark/chat/entity/preview/ThemeColor;)V", "build", "Lcom/ss/android/lark/chat/entity/preview/Style;", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.preview.Style$a */
    public static final class Builder extends TCStyle.Builder {

        /* renamed from: a */
        private SizeLevel f87886a = SizeLevel.NORMAL;

        /* renamed from: b */
        private Integer f87887b = -1;

        /* renamed from: c */
        private Gradient f87888c;

        /* renamed from: d */
        private FontLevel f87889d;

        /* renamed from: e */
        private Border f87890e;

        /* renamed from: f */
        private ThemeColor f87891f;

        /* renamed from: a */
        public Style mo125773a() {
            return new Style(this.f87886a, this.f87889d, this.f87891f, this.f87890e, this.f87888c, mo188847b(), mo188848c(), mo188849d(), mo188850e(), mo188851f(), mo188852g(), mo188853h(), mo188854i());
        }
    }

    @Override // com.ss.android.lark.tangram.base.style.TCStyle, java.lang.Object
    public Style clone() {
        Style style = new Style(this.sizeLevel, this.fontLevel, this.textColorV2, this.border, this.backgroundColor, getWidth(), getHeight(), getMinWidth(), getMinHeight(), getMaxWidth(), getMaxHeight(), getGrowWeight(), getShrinkWeight());
        style.setScaleWidth(getScaleWidth());
        style.setScaleHeight(getScaleHeight());
        return style;
    }

    @Override // com.ss.android.lark.tangram.base.style.TCStyle
    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int hashCode = super.hashCode() * 31;
        Border border2 = this.border;
        int i11 = 0;
        if (border2 != null) {
            i = border2.hashCode();
        } else {
            i = 0;
        }
        int i12 = (hashCode + i) * 31;
        SizeLevel sizeLevel2 = this.sizeLevel;
        if (sizeLevel2 != null) {
            i2 = sizeLevel2.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = (i12 + i2) * 31;
        FontLevel fontLevel2 = this.fontLevel;
        if (fontLevel2 != null) {
            i3 = fontLevel2.hashCode();
        } else {
            i3 = 0;
        }
        int i14 = (i13 + i3) * 31;
        ThemeColor themeColor = this.textColorV2;
        if (themeColor != null) {
            i4 = themeColor.hashCode();
        } else {
            i4 = 0;
        }
        int i15 = (i14 + i4) * 31;
        Gradient gradient = this.backgroundColor;
        if (gradient != null) {
            i5 = gradient.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 31;
        Value width = getWidth();
        if (width != null) {
            i6 = width.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = (i16 + i6) * 31;
        Value height = getHeight();
        if (height != null) {
            i7 = height.hashCode();
        } else {
            i7 = 0;
        }
        int i18 = (i17 + i7) * 31;
        Value maxWidth = getMaxWidth();
        if (maxWidth != null) {
            i8 = maxWidth.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 31;
        Value maxHeight = getMaxHeight();
        if (maxHeight != null) {
            i9 = maxHeight.hashCode();
        } else {
            i9 = 0;
        }
        int i20 = (i19 + i9) * 31;
        Value minWidth = getMinWidth();
        if (minWidth != null) {
            i10 = minWidth.hashCode();
        } else {
            i10 = 0;
        }
        int i21 = (i20 + i10) * 31;
        Value minHeight = getMinHeight();
        if (minHeight != null) {
            i11 = minHeight.hashCode();
        }
        return ((((i21 + i11) * 31) + getGrowWeight()) * 31) + getShrinkWeight();
    }

    private final GradientDrawable.Orientation getOrientationFromAngle(Integer num) {
        if (num == null) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
        int abs = Math.abs(num.intValue()) % 360;
        if (abs == 0) {
            return GradientDrawable.Orientation.BOTTOM_TOP;
        }
        if (abs == 45) {
            return GradientDrawable.Orientation.BL_TR;
        }
        if (abs == 90) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
        if (abs == 135) {
            return GradientDrawable.Orientation.TL_BR;
        }
        if (abs == 180) {
            return GradientDrawable.Orientation.TOP_BOTTOM;
        }
        if (abs == 225) {
            return GradientDrawable.Orientation.TR_BL;
        }
        if (abs == 270) {
            return GradientDrawable.Orientation.RIGHT_LEFT;
        }
        if (abs != 315) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
        return GradientDrawable.Orientation.BR_TL;
    }

    public final void applyToBackground(View view) {
        Float cornerRadius;
        Intrinsics.checkParameterIsNotNull(view, "view");
        ThemeColor themeColor = null;
        view.setBackground(null);
        Gradient gradient = this.backgroundColor;
        if (gradient != null && gradient.getType() == Gradient.Type.LINEAR) {
            Gradient.Content content = gradient.getContent();
            if (content != null) {
                Gradient.Linear linear = (Gradient.Linear) content;
                List<ThemeColor> themeColors = linear.getThemeColors();
                if (themeColors != null) {
                    int[] iArr = new int[themeColors.size()];
                    int size = themeColors.size();
                    for (int i = 0; i < size; i++) {
                        ColorUtils aVar = ColorUtils.f87906a;
                        Context context = view.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                        iArr[i] = aVar.mo125874a(themeColors.get(i), context);
                    }
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    if (themeColors.size() == 1) {
                        gradientDrawable.setColor(iArr[0]);
                    } else if (themeColors.size() > 1) {
                        gradientDrawable.setOrientation(getOrientationFromAngle(linear.getDeg()));
                        gradientDrawable.setColors(iArr);
                    }
                    Border border2 = this.border;
                    if (!(border2 == null || (cornerRadius = border2.getCornerRadius()) == null)) {
                        gradientDrawable.setCornerRadius((float) UIHelper.dp2px(cornerRadius.floatValue()));
                    }
                    Border border3 = this.border;
                    if (border3 != null) {
                        themeColor = border3.getThemeColor();
                    }
                    if (!(themeColor == null || this.border.getWidth() == null || this.border.getWidth().floatValue() <= ((float) 0))) {
                        ColorUtils aVar2 = ColorUtils.f87906a;
                        ThemeColor themeColor2 = this.border.getThemeColor();
                        Context context2 = view.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context2, "view.context");
                        gradientDrawable.setStroke(UIHelper.dp2px(this.border.getWidth().floatValue()), aVar2.mo125874a(themeColor2, context2));
                    }
                    view.setBackground(gradientDrawable);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.Gradient.Linear");
        }
    }

    @Override // com.ss.android.lark.tangram.base.style.TCStyle
    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if ((!Intrinsics.areEqual(cls2, cls)) || !super.equals(obj)) {
            return false;
        }
        if (obj != null) {
            Style style = (Style) obj;
            if (!(!Intrinsics.areEqual(this.border, style.border)) && this.sizeLevel == style.sizeLevel && !(!Intrinsics.areEqual(this.fontLevel, style.fontLevel)) && !(!Intrinsics.areEqual(this.textColorV2, style.textColorV2)) && !(!Intrinsics.areEqual(this.backgroundColor, style.backgroundColor)) && !(!Intrinsics.areEqual(getWidth(), style.getWidth())) && !(!Intrinsics.areEqual(getHeight(), style.getHeight())) && !(!Intrinsics.areEqual(getMaxWidth(), style.getMaxWidth())) && !(!Intrinsics.areEqual(getMaxHeight(), style.getMaxHeight())) && !(!Intrinsics.areEqual(getMinWidth(), style.getMinWidth())) && !(!Intrinsics.areEqual(getMinHeight(), style.getMinHeight())) && getGrowWeight() == style.getGrowWeight() && getShrinkWeight() == style.getShrinkWeight()) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.Style");
    }

    public Style(SizeLevel sizeLevel2, FontLevel fontLevel2, ThemeColor themeColor, Border border2, Gradient gradient, Value value, Value value2, Value value3, Value value4, Value value5, Value value6, int i, int i2) {
        super(value, value2, value3, value4, value5, value6, i, i2, null, null, 768, null);
        this.sizeLevel = sizeLevel2;
        this.fontLevel = fontLevel2;
        this.textColorV2 = themeColor;
        this.border = border2;
        this.backgroundColor = gradient;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Style(com.ss.android.lark.chat.entity.preview.SizeLevel r15, com.ss.android.lark.chat.entity.preview.FontLevel r16, com.ss.android.lark.chat.entity.preview.ThemeColor r17, com.ss.android.lark.chat.entity.preview.Border r18, com.ss.android.lark.chat.entity.preview.Gradient r19, com.ss.android.lark.tangram.base.style.Value r20, com.ss.android.lark.tangram.base.style.Value r21, com.ss.android.lark.tangram.base.style.Value r22, com.ss.android.lark.tangram.base.style.Value r23, com.ss.android.lark.tangram.base.style.Value r24, com.ss.android.lark.tangram.base.style.Value r25, int r26, int r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.entity.preview.Style.<init>(com.ss.android.lark.chat.entity.preview.SizeLevel, com.ss.android.lark.chat.entity.preview.FontLevel, com.ss.android.lark.chat.entity.preview.ThemeColor, com.ss.android.lark.chat.entity.preview.Border, com.ss.android.lark.chat.entity.preview.Gradient, com.ss.android.lark.tangram.base.style.Value, com.ss.android.lark.tangram.base.style.Value, com.ss.android.lark.tangram.base.style.Value, com.ss.android.lark.tangram.base.style.Value, com.ss.android.lark.tangram.base.style.Value, com.ss.android.lark.tangram.base.style.Value, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
