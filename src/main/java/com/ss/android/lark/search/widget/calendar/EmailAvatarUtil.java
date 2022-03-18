package com.ss.android.lark.search.widget.calendar;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.UIHelper;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/search/widget/calendar/EmailAvatarUtil;", "", "()V", "getEmailAvatarBitmapByName", "Landroid/graphics/Bitmap;", "localizedDisplayName", "", "avatarSize", "", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.widget.calendar.a */
public final class EmailAvatarUtil {

    /* renamed from: a */
    public static final EmailAvatarUtil f133095a = new EmailAvatarUtil();

    private EmailAvatarUtil() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final Bitmap m208701a(String str, float f) {
        String str2;
        int i;
        Intrinsics.checkParameterIsNotNull(str, "localizedDisplayName");
        int dp2px = UIUtils.dp2px(LarkContext.getApplication(), f);
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            if (str.length() < 2) {
                i = str.length();
            } else {
                i = 2;
            }
            String substring = str.substring(0, i);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            Locale locale = Locale.ENGLISH;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ENGLISH");
            if (substring != null) {
                str2 = substring.toUpperCase(locale);
                Intrinsics.checkExpressionValueIsNotNull(str2, "(this as java.lang.String).toUpperCase(locale)");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(dp2px, dp2px, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) canvas.getWidth(), (float) canvas.getHeight());
        Paint paint = new Paint(257);
        paint.setColor(-1);
        canvas.drawOval(rectF, paint);
        paint.setColor(UIHelper.getColor(R.color.lkui_B500));
        float f2 = (float) dp2px;
        canvas.drawRect(new RectF(f2, f2, rectF.width() - f2, rectF.height() - f2), paint);
        paint.setColor(-1);
        paint.setTextSize(f2 * 0.4f);
        paint.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        canvas.drawText(str2, rectF.centerX(), (((rectF.bottom + rectF.top) - ((float) fontMetricsInt.bottom)) - ((float) fontMetricsInt.top)) / ((float) 2), paint);
        Intrinsics.checkExpressionValueIsNotNull(createBitmap, "bitmap");
        return createBitmap;
    }
}
