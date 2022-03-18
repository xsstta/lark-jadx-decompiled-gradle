package com.ss.android.lark.calendar.impl.features.events.detail.p1507d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.article.common.monitor.stack.C3474b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.CalendarLoadAvatarUtil;
import com.ss.android.lark.calendar.impl.utils.ContextUtils;
import com.ss.android.lark.calendar.impl.utils.IFakeAvatarCreator;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.util.Locale;

/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.d.c */
public class C31256c {
    /* renamed from: a */
    public static Bitmap m117133a(float f, String str) {
        if (TextUtils.isEmpty(str)) {
            return BitmapFactory.decodeResource(ContextUtils.m125334a().getResources(), R.drawable.calendar_avatar_no_name);
        }
        int dp2px = UIUtils.dp2px(ContextUtils.m125334a(), f);
        int i = 2;
        if (str.length() < 2) {
            i = str.length();
        }
        String upperCase = str.substring(0, i).toUpperCase(Locale.ENGLISH);
        Bitmap createBitmap = Bitmap.createBitmap(dp2px, dp2px, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) canvas.getWidth(), (float) canvas.getHeight());
        Paint paint = new Paint(257);
        paint.setColor(-1);
        canvas.drawOval(rectF, paint);
        paint.setColor(C32634ae.m125178a(R.color.lkui_B500));
        float f2 = (float) dp2px;
        canvas.drawRect(new RectF(f2, f2, rectF.width() - f2, rectF.height() - f2), paint);
        paint.setColor(-1);
        paint.setTextSize(f2 * 0.4f);
        paint.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        canvas.drawText(upperCase, rectF.centerX(), (((rectF.bottom + rectF.top) - ((float) fontMetricsInt.bottom)) - ((float) fontMetricsInt.top)) / 2.0f, paint);
        return createBitmap;
    }

    /* renamed from: a */
    public static void m117134a(Context context, ImageView imageView, int i, int i2, CalendarEventAttendee calendarEventAttendee, boolean z) {
        m117135a(context, imageView, i, i2, calendarEventAttendee.getAvatarKey(), calendarEventAttendee.getAttendeeCalendarId(), calendarEventAttendee.getLocalizedDisplayName(), z, calendarEventAttendee.getAvatarEntityId());
    }

    /* renamed from: a */
    public static void m117135a(final Context context, ImageView imageView, int i, int i2, String str, final String str2, final String str3, final boolean z, String str4) {
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str3)) {
            CalendarLoadAvatarUtil.m125306a(context, imageView, i, i2, str, str4, new IFakeAvatarCreator() {
                /* class com.ss.android.lark.calendar.impl.features.events.detail.p1507d.C31256c.C312571 */

                @Override // com.ss.android.lark.calendar.impl.utils.IFakeAvatarCreator
                /* renamed from: b */
                public String mo110401b() {
                    return str2 + "_calendar_image.jpg";
                }

                @Override // com.ss.android.lark.calendar.impl.utils.IFakeAvatarCreator
                /* renamed from: a */
                public Bitmap mo110400a() {
                    String str;
                    if (TextUtils.isEmpty(str3) || str3.length() <= 0) {
                        str = "";
                    } else {
                        str = str3.substring(0, 1);
                        if (Character.isLetter(str.charAt(0))) {
                            str = str.toUpperCase(Locale.ENGLISH);
                        }
                    }
                    int dp2px = UIUtils.dp2px(context, 100.0f);
                    if (z) {
                        return C30022a.f74882a.utilsDependency().mo108194a(dp2px, dp2px, str, -10970641);
                    }
                    return C30022a.f74882a.utilsDependency().mo108193a(dp2px, dp2px, str);
                }
            });
            return;
        }
        C3474b.m14691a("attendeeId=" + str2);
        Log.m165383e("CalendarAvatarUtil", C32673y.m125377c("attendeeId=" + str2));
    }
}
