package com.ss.android.lark.mm.widget.avatar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0010\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010!H\u0003J\b\u0010\"\u001a\u00020\tH\u0002J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0003J\u0010\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0002J\"\u0010'\u001a\u00020$2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0014J\b\u0010*\u001a\u00020$H\u0014J\u0012\u0010+\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0015\u0010,\u001a\u00020$2\b\u0010-\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020$2\b\u00100\u001a\u0004\u0018\u00010\u0013J\u0015\u00101\u001a\u00020$2\b\u0010-\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010.J\u0015\u00102\u001a\u00020$2\b\u00103\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010.J\b\u00104\u001a\u000205H\u0002R\u001a\u0010\r\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ss/android/lark/mm/widget/avatar/TextAvatar;", "Lcom/ss/android/lark/mm/widget/avatar/Avatar;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "avatarBgColor", "getAvatarBgColor", "()I", "setAvatarBgColor", "(I)V", "avatarText", "", "getAvatarText", "()Ljava/lang/String;", "setAvatarText", "(Ljava/lang/String;)V", "avatarTextColor", "avatarTextSize", "getAvatarTextSize", "setAvatarTextSize", "bgPaint", "Landroid/graphics/Paint;", "textPaint", "Landroid/text/TextPaint;", "breakAvatarText", "", "countAvatarText", "drawText", "", "canvas", "Landroid/graphics/Canvas;", "init", "ta", "Landroid/content/res/TypedArray;", "onAvatarSizeChanged", "onDraw", "setBackgroundColor", "color", "(Ljava/lang/Integer;)V", "setText", "text", "setTextColor", "setTextSize", "size", "shouldDrawText", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TextAvatar extends Avatar {

    /* renamed from: b */
    private int f118802b;

    /* renamed from: c */
    private TextPaint f118803c;

    /* renamed from: d */
    private String f118804d;

    /* renamed from: e */
    private int f118805e;

    /* renamed from: f */
    private int f118806f;

    /* renamed from: g */
    private Paint f118807g;

    public final int getAvatarBgColor() {
        return this.f118806f;
    }

    public final String getAvatarText() {
        return this.f118804d;
    }

    public final int getAvatarTextSize() {
        return this.f118805e;
    }

    /* renamed from: c */
    private final boolean m186706c() {
        boolean z;
        String str = this.f118804d;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    /* renamed from: e */
    private final int m186708e() {
        boolean z;
        String str = this.f118804d;
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
    @Override // com.ss.android.lark.mm.widget.avatar.Avatar
    /* renamed from: a */
    public void mo165655a() {
        int i;
        super.mo165655a();
        int avatarSize = getAvatarSize();
        if (avatarSize == -5) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            i = context.getResources().getDimensionPixelSize(R.dimen.avatar_more_text_size_mini);
        } else if (avatarSize == -4) {
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            i = context2.getResources().getDimensionPixelSize(R.dimen.avatar_more_text_size_small);
        } else if (avatarSize == -3) {
            Context context3 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            i = context3.getResources().getDimensionPixelSize(R.dimen.avatar_more_text_size_middle);
        } else if (avatarSize != -2) {
            Context context4 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context4, "context");
            i = context4.getResources().getDimensionPixelSize(R.dimen.avatar_more_text_size_large);
        } else {
            Context context5 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context5, "context");
            i = context5.getResources().getDimensionPixelSize(R.dimen.avatar_more_text_size_large);
        }
        this.f118805e = i;
    }

    /* renamed from: d */
    private final List<String> m186707d() {
        boolean z;
        boolean z2;
        int i;
        int i2;
        String str = this.f118804d;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = this.f118805e;
        if (i3 > 0) {
            TextPaint textPaint = this.f118803c;
            if (textPaint != null) {
                textPaint.setTextSize((float) i3);
            }
            String str2 = this.f118804d;
            if (str2 != null) {
                arrayList.add(str2);
            }
            return arrayList;
        }
        int e = m186708e();
        TextPaint textPaint2 = this.f118803c;
        if (textPaint2 != null) {
            if (e == 0 || e == 1) {
                i2 = UIUtils.getDimens(getContext(), R.dimen.avatar_text_size_large);
            } else if (e == 2) {
                i2 = UIUtils.getDimens(getContext(), R.dimen.avatar_text_size_middle);
            } else if (e == 3 || e == 4) {
                i2 = UIUtils.getDimens(getContext(), R.dimen.avatar_text_size_small);
            } else {
                i2 = UIUtils.getDimens(getContext(), R.dimen.avatar_text_size_mini);
            }
            textPaint2.setTextSize((float) i2);
        }
        String str3 = this.f118804d;
        if (str3 != null) {
            String str4 = str3;
            if (str4.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int length = str4.length();
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (i4 < length) {
                    int i7 = i4 + 1;
                    if (str3 != null) {
                        String substring = str3.substring(i4, i7);
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
                            i5 += i;
                            if (i5 == 4) {
                                if (str3 != null) {
                                    String substring2 = str3.substring(i6, i7);
                                    Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    arrayList.add(substring2);
                                    i6 = i7;
                                    i5 = 0;
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                }
                            } else if (i5 > 4) {
                                if (str3 != null) {
                                    String substring3 = str3.substring(i6, i4);
                                    Intrinsics.checkExpressionValueIsNotNull(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    arrayList.add(substring3);
                                    if (arrayList.size() < 2 && i4 >= str3.length() - 1) {
                                        int length2 = str3.length();
                                        if (str3 != null) {
                                            String substring4 = str3.substring(i4, length2);
                                            Intrinsics.checkExpressionValueIsNotNull(substring4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                            arrayList.add(substring4);
                                        } else {
                                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                        }
                                    }
                                    i6 = i4;
                                    i5 = 2;
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                }
                            } else if (i4 >= str3.length() - 1) {
                                int length3 = str3.length();
                                if (str3 != null) {
                                    String substring5 = str3.substring(i6, length3);
                                    Intrinsics.checkExpressionValueIsNotNull(substring5, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    arrayList.add(substring5);
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                }
                            }
                            if (arrayList.size() >= 2) {
                                break;
                            }
                            i4 = i7;
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
        this.f118806f = i;
    }

    public final void setAvatarText(String str) {
        this.f118804d = str;
    }

    public final void setAvatarTextSize(int i) {
        this.f118805e = i;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mm.widget.avatar.Avatar
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m186705a(canvas);
    }

    public final void setText(String str) {
        if (str != null) {
            this.f118804d = str;
            invalidate();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TextAvatar(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setBackgroundColor(Integer num) {
        if (num != null) {
            num.intValue();
            this.f118806f = num.intValue();
            invalidate();
        }
    }

    public final void setTextColor(Integer num) {
        if (num != null) {
            num.intValue();
            this.f118802b = num.intValue();
            invalidate();
        }
    }

    public final void setTextSize(Integer num) {
        if (num != null) {
            num.intValue();
            this.f118805e = num.intValue();
            invalidate();
        }
    }

    /* renamed from: a */
    private final void m186704a(TypedArray typedArray) {
        String str;
        CharSequence text = typedArray.getText(6);
        if (text == null || (str = text.toString()) == null) {
            str = typedArray.getString(6);
        }
        this.f118804d = str;
        this.f118802b = typedArray.getColor(7, 0);
        this.f118806f = typedArray.getColor(0, 0);
    }

    /* renamed from: a */
    private final void m186705a(Canvas canvas) {
        float f;
        int i;
        if (m186706c()) {
            if (getBackground() == null && (i = this.f118806f) != 0) {
                Paint paint = this.f118807g;
                if (paint != null) {
                    paint.setColor(i);
                }
                if (canvas != null) {
                    float width = (float) getWidth();
                    float height = (float) getHeight();
                    Paint paint2 = this.f118807g;
                    if (paint2 == null) {
                        Intrinsics.throwNpe();
                    }
                    canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height, paint2);
                }
            }
            List<String> d = m186707d();
            if (d != null) {
                TextPaint textPaint = this.f118803c;
                if (textPaint != null) {
                    textPaint.setColor(this.f118802b);
                }
                int i2 = 0;
                for (T t : d) {
                    Rect rect = new Rect();
                    TextPaint textPaint2 = this.f118803c;
                    if (textPaint2 != null) {
                        textPaint2.getTextBounds((String) t, 0, t.length(), rect);
                    }
                    int height2 = getHeight() / d.size();
                    float width2 = (float) getWidth();
                    TextPaint textPaint3 = this.f118803c;
                    if (textPaint3 != null) {
                        f = textPaint3.measureText(t);
                    } else {
                        f = BitmapDescriptorFactory.HUE_RED;
                    }
                    float f2 = ((width2 - f) - ((float) rect.left)) / ((float) 2);
                    float f3 = ((float) (i2 * height2)) + (((float) height2) / 2.0f);
                    TextPaint textPaint4 = this.f118803c;
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
    public TextAvatar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TextAvatar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mm.widget.avatar.Avatar
    /* renamed from: a */
    public void mo165656a(AttributeSet attributeSet, int i, int i2) {
        super.mo165656a(attributeSet, i, i2);
        Paint paint = new Paint();
        this.f118807g = paint;
        if (paint != null) {
            paint.setStyle(Paint.Style.FILL);
        }
        TextPaint textPaint = new TextPaint(1);
        this.f118803c = textPaint;
        if (textPaint != null) {
            textPaint.setFakeBoldText(true);
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            textPaint.setTextSize((float) context.getResources().getDimensionPixelSize(R.dimen.avatar_more_text_size_large));
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.avatar_background, R.attr.avatar_borderColor, R.attr.avatar_borderStyle, R.attr.avatar_borderWidth, R.attr.avatar_cornerRadius, R.attr.avatar_sizeType, R.attr.avatar_text, R.attr.avatar_textColor, R.attr.avatar_textSize}, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…efStyleAttr, defStyleRes)");
        m186704a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextAvatar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        mo165656a(attributeSet, i, i2);
    }
}
