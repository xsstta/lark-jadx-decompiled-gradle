package com.ss.android.lark.calendar.impl.utils;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.p042i.p043a.p044a.C1106i;
import com.bytedance.article.common.monitor.stack.C3474b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.framework.C32484a;
import com.ss.android.lark.log.Log;
import java.lang.reflect.Field;

public class ao {
    /* renamed from: a */
    public static boolean m125229a(float f, float f2, float f3, float f4) {
        return Math.pow((double) (f3 - f), 2.0d) + Math.pow((double) (f4 - f2), 2.0d) >= Math.pow((double) m125215a(), 2.0d);
    }

    /* renamed from: a */
    public static void m125226a(View view, TextView textView, String str) {
        if (TextUtils.isEmpty(str)) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        textView.setText(str);
    }

    /* renamed from: a */
    public static void m125225a(View view, TextView textView, SpannableStringBuilder spannableStringBuilder) {
        if (TextUtils.isEmpty(spannableStringBuilder)) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        textView.setText(spannableStringBuilder);
    }

    /* renamed from: a */
    public static void m125228a(ScrollView scrollView) {
        if (Build.VERSION.SDK_INT >= 14) {
            try {
                m125227a(scrollView, ScrollView.class.getDeclaredField("mEdgeGlowTop"), new C32644a(scrollView.getContext()));
                m125227a(scrollView, ScrollView.class.getDeclaredField("mEdgeGlowBottom"), new C32644a(scrollView.getContext()));
            } catch (Exception e) {
                C3474b.m14692a(e);
                Log.m165378d(e.toString());
            }
        }
    }

    /* renamed from: a */
    private static void m125227a(View view, Field field, C32644a aVar) throws IllegalAccessException {
        field.setAccessible(true);
        field.set(view, aVar);
    }

    /* renamed from: a */
    public static int m125215a() {
        return ViewConfiguration.get(new C32484a().mo118635a()).getScaledTouchSlop();
    }

    /* renamed from: com.ss.android.lark.calendar.impl.utils.ao$a */
    public static class C32644a extends EdgeEffect {
        public boolean draw(Canvas canvas) {
            return false;
        }

        public void onAbsorb(int i) {
        }

        public void onPull(float f, float f2) {
        }

        public void onRelease() {
        }

        public C32644a(Context context) {
            super(context);
        }
    }

    /* renamed from: a */
    public static void m125222a(final View view) {
        if (view != null) {
            ((View) view.getParent()).post(new Runnable() {
                /* class com.ss.android.lark.calendar.impl.utils.ao.RunnableC326424 */

                public void run() {
                    Rect rect = new Rect();
                    rect.setEmpty();
                    TouchDelegate touchDelegate = new TouchDelegate(rect, view);
                    if (View.class.isInstance(view.getParent())) {
                        ((View) view.getParent()).setTouchDelegate(touchDelegate);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static Bitmap m125216a(Context context, int i) {
        return m125217a(context, i, -1);
    }

    /* renamed from: a */
    public static GradientDrawable m125221a(int i, int i2, int i3) {
        C326391 r0 = new GradientDrawable() {
            /* class com.ss.android.lark.calendar.impl.utils.ao.C326391 */

            public int getOpacity() {
                return -3;
            }
        };
        r0.setShape(1);
        r0.setColor(i);
        if (i2 >= 0) {
            r0.setStroke(i2, i3);
        }
        return r0;
    }

    /* renamed from: a */
    public static Bitmap m125217a(Context context, int i, int i2) {
        Bitmap bitmap;
        Drawable drawable = ContextCompat.getDrawable(context, i);
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if ((drawable instanceof VectorDrawable) || (drawable instanceof C1106i)) {
            if (i2 > 0) {
                int a = (int) UDDimenUtils.m93308a(context, i2);
                bitmap = Bitmap.createBitmap(a, a, Bitmap.Config.ARGB_8888);
            } else {
                bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            }
            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmap;
        }
        Log.m165383e("ViewUtil", C32673y.m125378d("drawable:" + drawable));
        return null;
    }

    /* renamed from: a */
    public static void m125223a(final View view, final int i, final int i2) {
        if (view != null) {
            ((View) view.getParent()).post(new Runnable() {
                /* class com.ss.android.lark.calendar.impl.utils.ao.RunnableC326413 */

                public void run() {
                    Rect rect = new Rect();
                    view.getHitRect(rect);
                    Context context = view.getContext();
                    rect.inset(-UIUtils.dp2px(context, (float) i), -UIUtils.dp2px(context, (float) i2));
                    TouchDelegate touchDelegate = new TouchDelegate(rect, view);
                    if (View.class.isInstance(view.getParent())) {
                        ((View) view.getParent()).setTouchDelegate(touchDelegate);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m125224a(final View view, final int i, long j) {
        final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        int i2 = layoutParams.leftMargin;
        final int min = i2 - Math.min(DeviceUtils.getScreenWidth(view.getContext()) - layoutParams.width, i2);
        ValueAnimator ofInt = ValueAnimator.ofInt(i2, min);
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.calendar.impl.utils.ao.C326435 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                layoutParams.leftMargin = intValue;
                if (min == intValue) {
                    layoutParams.leftMargin = i;
                }
                view.setLayoutParams(layoutParams);
            }
        });
        ofInt.start();
    }

    /* renamed from: a */
    public static Drawable m125218a(int i, float[] fArr, int i2, int i3) {
        return m125219a(i, fArr, i2, i3, 0, 0);
    }

    /* renamed from: a */
    public static Drawable m125220a(Context context, String str, int i, float f, float f2) {
        Drawable d = C32634ae.m125184d(R.drawable.icon_external_bg);
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextSize((float) i);
        float dp2px = (float) UIUtils.dp2px(context, 10.0f);
        if (f <= ((float) ((int) textPaint.measureText(str)))) {
            f = ((float) ((int) textPaint.measureText(str))) + dp2px;
        }
        int i2 = (int) f;
        int i3 = (int) f2;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        d.setBounds(0, 0, i2, i3);
        d.draw(canvas);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setColor(-1);
        canvas.drawText(str, f / 2.0f, (f2 / 2.0f) + ((float) (((double) i) / 2.5d)), textPaint);
        return new BitmapDrawable(context.getResources(), createBitmap);
    }

    /* renamed from: a */
    public static Drawable m125219a(int i, float[] fArr, int i2, int i3, int i4, int i5) {
        float[] fArr2 = fArr != null ? new float[]{fArr[0], fArr[0], fArr[1], fArr[1], fArr[2], fArr[2], fArr[3], fArr[3]} : new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        C326402 r6 = new GradientDrawable() {
            /* class com.ss.android.lark.calendar.impl.utils.ao.C326402 */

            public int getOpacity() {
                return -3;
            }
        };
        r6.setColor(i);
        r6.setCornerRadii(fArr2);
        if (i2 >= 0 && i3 != 0) {
            if (i4 <= 0 || i5 <= 0) {
                r6.setStroke(i2, i3);
            } else {
                r6.setStroke(i2, i3, (float) i4, (float) i5);
            }
        }
        return r6;
    }
}
