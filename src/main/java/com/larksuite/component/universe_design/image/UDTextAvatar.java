package com.larksuite.component.universe_design.image;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0010\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010!H\u0003J\b\u0010\"\u001a\u00020\tH\u0002J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0003J\u0010\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0002J\"\u0010'\u001a\u00020$2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0014J\b\u0010*\u001a\u00020$H\u0014J\u0012\u0010+\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0010\u0010,\u001a\u00020$2\b\u0010-\u001a\u0004\u0018\u00010\u0013J\u0015\u0010.\u001a\u00020$2\b\u0010/\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u00100J\b\u00101\u001a\u000202H\u0002R\u001a\u0010\r\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/larksuite/component/universe_design/image/UDTextAvatar;", "Lcom/larksuite/component/universe_design/image/UDAvatar;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "avatarBgColor", "getAvatarBgColor", "()I", "setAvatarBgColor", "(I)V", "avatarText", "", "getAvatarText", "()Ljava/lang/String;", "setAvatarText", "(Ljava/lang/String;)V", "avatarTextColor", "avatarTextSize", "getAvatarTextSize", "setAvatarTextSize", "bgPaint", "Landroid/graphics/Paint;", "textPaint", "Landroid/text/TextPaint;", "breakAvatarText", "", "countAvatarText", "drawText", "", "canvas", "Landroid/graphics/Canvas;", "init", "ta", "Landroid/content/res/TypedArray;", "onAvatarSizeChanged", "onDraw", "setText", "text", "setTextColor", "color", "(Ljava/lang/Integer;)V", "shouldDrawText", "", "universe-ui-avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UDTextAvatar extends UDAvatar {

    /* renamed from: b */
    private int f63462b;

    /* renamed from: c */
    private TextPaint f63463c;

    /* renamed from: d */
    private String f63464d;

    /* renamed from: e */
    private int f63465e;

    /* renamed from: f */
    private int f63466f;

    /* renamed from: g */
    private Paint f63467g;

    public final int getAvatarBgColor() {
        return this.f63466f;
    }

    public final String getAvatarText() {
        return this.f63464d;
    }

    public final int getAvatarTextSize() {
        return this.f63465e;
    }

    /* renamed from: c */
    private final boolean m92878c() {
        boolean z;
        String str = this.f63464d;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    /* renamed from: e */
    private final int m92880e() {
        boolean z;
        String str = this.f63464d;
        int i = 0;
        if (str == null) {
            return 0;
        }
        String str2 = str;
        if (str2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return 0;
        }
        int length = str2.length();
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            if (str != null) {
                String substring = str.substring(i, i3);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                Charset charset = Charsets.f173341a;
                if (substring != null) {
                    byte[] bytes = substring.getBytes(charset);
                    Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
                    if (bytes.length == 1) {
                        i2++;
                    } else {
                        i2 += 2;
                    }
                    i = i3;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.image.UDAvatar
    /* renamed from: a */
    public void mo90987a() {
        int i;
        super.mo90987a();
        int avatarSize = getAvatarSize();
        if (avatarSize == -4) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            i = UDDimenUtils.m93313d(context, R.dimen.ud_avatar_more_text_size_mini);
        } else if (avatarSize == -3) {
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            i = UDDimenUtils.m93313d(context2, R.dimen.ud_avatar_more_text_size_small);
        } else if (avatarSize == -2) {
            Context context3 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            i = UDDimenUtils.m93313d(context3, R.dimen.ud_avatar_more_text_size_middle);
        } else if (avatarSize != -1) {
            Context context4 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context4, "context");
            i = UDDimenUtils.m93313d(context4, R.dimen.ud_avatar_more_text_size_large);
        } else {
            Context context5 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context5, "context");
            i = UDDimenUtils.m93313d(context5, R.dimen.ud_avatar_more_text_size_large);
        }
        this.f63465e = i;
    }

    /* renamed from: d */
    private final List<String> m92879d() {
        boolean z;
        boolean z2;
        int i;
        float f;
        String str = this.f63464d;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = this.f63465e;
        if (i2 > 0) {
            TextPaint textPaint = this.f63463c;
            if (textPaint != null) {
                textPaint.setTextSize((float) i2);
            }
            String str2 = this.f63464d;
            if (str2 != null) {
                arrayList.add(str2);
            }
            return arrayList;
        }
        int e = m92880e();
        TextPaint textPaint2 = this.f63463c;
        if (textPaint2 != null) {
            if (e == 0 || e == 1) {
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                f = UDDimenUtils.m93311c(context, (int) R.dimen.ud_avatar_text_size_large);
            } else if (e == 2) {
                Context context2 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                f = UDDimenUtils.m93311c(context2, (int) R.dimen.ud_avatar_text_size_middle);
            } else if (e == 3 || e == 4) {
                Context context3 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context3, "context");
                f = UDDimenUtils.m93311c(context3, (int) R.dimen.ud_avatar_text_size_small);
            } else {
                Context context4 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context4, "context");
                f = UDDimenUtils.m93311c(context4, (int) R.dimen.ud_avatar_text_size_mini);
            }
            textPaint2.setTextSize(f);
        }
        String str3 = this.f63464d;
        if (str3 != null) {
            String str4 = str3;
            if (str4.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int length = str4.length();
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i3 < length) {
                    int i6 = i3 + 1;
                    if (str3 != null) {
                        String substring = str3.substring(i3, i6);
                        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        Charset charset = Charsets.f173341a;
                        if (substring != null) {
                            byte[] bytes = substring.getBytes(charset);
                            Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
                            if (bytes.length == 1) {
                                i = 1;
                            } else {
                                i = 2;
                            }
                            i4 += i;
                            if (i4 == 4) {
                                if (str3 != null) {
                                    String substring2 = str3.substring(i5, i6);
                                    Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    arrayList.add(substring2);
                                    i5 = i6;
                                    i4 = 0;
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                }
                            } else if (i4 > 4) {
                                if (str3 != null) {
                                    String substring3 = str3.substring(i5, i3);
                                    Intrinsics.checkExpressionValueIsNotNull(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    arrayList.add(substring3);
                                    if (arrayList.size() < 2 && i3 >= str3.length() - 1) {
                                        int length2 = str3.length();
                                        if (str3 != null) {
                                            String substring4 = str3.substring(i3, length2);
                                            Intrinsics.checkExpressionValueIsNotNull(substring4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                            arrayList.add(substring4);
                                        } else {
                                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                        }
                                    }
                                    i5 = i3;
                                    i4 = 2;
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                }
                            } else if (i3 >= str3.length() - 1) {
                                int length3 = str3.length();
                                if (str3 != null) {
                                    String substring5 = str3.substring(i5, length3);
                                    Intrinsics.checkExpressionValueIsNotNull(substring5, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    arrayList.add(substring5);
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                }
                            }
                            if (arrayList.size() >= 2) {
                                break;
                            }
                            i3 = i6;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                if (arrayList.size() == 0) {
                    arrayList.add(str3);
                }
            }
        }
        return arrayList;
    }

    public final void setAvatarBgColor(int i) {
        this.f63466f = i;
    }

    public final void setAvatarText(String str) {
        this.f63464d = str;
    }

    public final void setAvatarTextSize(int i) {
        this.f63465e = i;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.image.UDAvatar
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m92877a(canvas);
    }

    public final void setText(String str) {
        if (str != null) {
            this.f63464d = str;
            invalidate();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDTextAvatar(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setTextColor(Integer num) {
        if (num != null) {
            num.intValue();
            this.f63462b = num.intValue();
            invalidate();
        }
    }

    /* renamed from: a */
    private final void m92876a(TypedArray typedArray) {
        String str;
        CharSequence text = typedArray.getText(6);
        if (text == null || (str = text.toString()) == null) {
            str = typedArray.getString(6);
        }
        this.f63464d = str;
        this.f63462b = typedArray.getColor(7, 0);
        this.f63466f = typedArray.getColor(0, 0);
    }

    /* renamed from: a */
    private final void m92877a(Canvas canvas) {
        float f;
        int i;
        if (m92878c()) {
            if (getBackground() == null && (i = this.f63466f) != 0) {
                Paint paint = this.f63467g;
                if (paint != null) {
                    paint.setColor(i);
                }
                Paint paint2 = this.f63467g;
                if (!(paint2 == null || canvas == null)) {
                    canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight(), paint2);
                }
            }
            List<String> d = m92879d();
            if (d != null) {
                TextPaint textPaint = this.f63463c;
                if (textPaint != null) {
                    textPaint.setColor(this.f63462b);
                }
                int i2 = 0;
                for (T t : d) {
                    Rect rect = new Rect();
                    TextPaint textPaint2 = this.f63463c;
                    if (textPaint2 != null) {
                        textPaint2.getTextBounds((String) t, 0, t.length(), rect);
                    }
                    int height = getHeight() / d.size();
                    float width = (float) getWidth();
                    TextPaint textPaint3 = this.f63463c;
                    if (textPaint3 != null) {
                        f = textPaint3.measureText(t);
                    } else {
                        f = BitmapDescriptorFactory.HUE_RED;
                    }
                    float f2 = ((width - f) - ((float) rect.left)) / ((float) 2);
                    float f3 = ((float) (i2 * height)) + (((float) height) / 2.0f);
                    TextPaint textPaint4 = this.f63463c;
                    if (textPaint4 != null) {
                        float f4 = (f3 + (((float) (textPaint4.getFontMetricsInt().descent - textPaint4.getFontMetricsInt().ascent)) / 2.0f)) - ((float) textPaint4.getFontMetricsInt().descent);
                        if (d.size() > 1) {
                            int i3 = textPaint4.getFontMetricsInt().descent;
                            if (i2 != 0) {
                                i3 = -i3;
                            }
                            f4 += (float) i3;
                        }
                        if (canvas != null) {
                            canvas.drawText(t, f2, f4, textPaint4);
                        }
                    }
                    i2++;
                }
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDTextAvatar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDTextAvatar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.image.UDAvatar
    /* renamed from: a */
    public void mo90988a(AttributeSet attributeSet, int i, int i2) {
        super.mo90988a(attributeSet, i, i2);
        Paint paint = new Paint();
        this.f63467g = paint;
        if (paint != null) {
            paint.setStyle(Paint.Style.FILL);
        }
        TextPaint textPaint = new TextPaint(1);
        this.f63463c = textPaint;
        if (textPaint != null) {
            textPaint.setFakeBoldText(true);
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            textPaint.setTextSize((float) UDDimenUtils.m93313d(context, R.dimen.ud_avatar_more_text_size_large));
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ud_avatar_background, R.attr.ud_avatar_borderColor, R.attr.ud_avatar_borderStyle, R.attr.ud_avatar_borderWidth, R.attr.ud_avatar_cornerRadius, R.attr.ud_avatar_size, R.attr.ud_avatar_text, R.attr.ud_avatar_textColor, R.attr.ud_avatar_textSize}, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…efStyleAttr, defStyleRes)");
        m92876a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDTextAvatar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        mo90988a(attributeSet, i, i2);
    }
}
