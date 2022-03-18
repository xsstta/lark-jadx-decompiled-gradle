package com.ss.android.lark.widget.span;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;
import android.text.style.ImageSpan;
import android.widget.EditText;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.UIHelper;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.lark.widget.span.t */
public class C59185t extends ImageSpan {

    /* renamed from: a */
    public String f146900a;

    /* renamed from: b */
    public EditText f146901b;

    /* renamed from: c */
    public boolean f146902c;

    /* renamed from: d */
    public int f146903d = -1;

    /* renamed from: e */
    private Context f146904e;

    /* renamed from: f */
    private String f146905f;

    public Drawable getDrawable() {
        if (!this.f146902c) {
            Context context = this.f146904e;
            if (context == null) {
                return super.getDrawable();
            }
            if ((context instanceof Activity) && !UIUtils.isActivityRunning((Activity) context)) {
                return super.getDrawable();
            }
            ImageLoader.with(this.f146904e).load(this.f146905f).asBitmap().into(new C38818i<Bitmap>() {
                /* class com.ss.android.lark.widget.span.C59185t.C591861 */

                /* renamed from: a */
                public void mo49248a(Bitmap bitmap) {
                    Resources resources = C59185t.this.f146901b.getContext().getResources();
                    int[] a = ImageUtils.m224135a(bitmap.getWidth(), bitmap.getHeight(), (int) (((double) resources.getDisplayMetrics().widthPixels) * 0.4d), (int) (((double) resources.getDisplayMetrics().heightPixels) * 0.4d), 80, 80);
                    if (C59185t.this.f146903d >= 1 && C59185t.this.f146903d < a[1]) {
                        a[0] = C59185t.this.f146903d;
                        a[1] = C59185t.this.f146903d;
                    }
                    Bitmap a2 = C59185t.this.mo201138a(bitmap, a[0]);
                    C59185t tVar = C59185t.this;
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, C59185t.this.mo201139a(a2, tVar.mo201140a(tVar.f146900a)));
                    bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
                    try {
                        Field declaredField = ImageSpan.class.getDeclaredField("mDrawable");
                        declaredField.setAccessible(true);
                        declaredField.set(C59185t.this, bitmapDrawable);
                        Field declaredField2 = DynamicDrawableSpan.class.getDeclaredField("mDrawableRef");
                        declaredField2.setAccessible(true);
                        declaredField2.set(C59185t.this, null);
                        C59185t.this.f146902c = true;
                        final int selectionEnd = C59185t.this.f146901b.getSelectionEnd();
                        C59185t.this.f146901b.post(new Runnable() {
                            /* class com.ss.android.lark.widget.span.C59185t.C591861.RunnableC591871 */

                            public void run() {
                                C59185t.this.f146901b.setText(C59185t.this.f146901b.getText());
                                C59185t.this.f146901b.setSelection(selectionEnd);
                            }
                        });
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (NoSuchFieldException e2) {
                        e2.printStackTrace();
                    } catch (IndexOutOfBoundsException e3) {
                        e3.printStackTrace();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                }
            });
        }
        return super.getDrawable();
    }

    /* renamed from: a */
    public void mo201141a(int i) {
        this.f146903d = i;
    }

    /* renamed from: a */
    public Bitmap mo201140a(String str) {
        Bitmap decodeResource = BitmapFactory.decodeResource(this.f146904e.getResources(), R.drawable.ic_richtext_video_label);
        Rect rect = new Rect();
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setTextSize((float) UIHelper.dp2px(12.0f));
        paint.getTextBounds(str, 0, str.length(), rect);
        int dp2px = UIHelper.dp2px(6.0f);
        int dp2px2 = UIHelper.dp2px(3.5f);
        int width = decodeResource.getWidth() + dp2px + dp2px2 + rect.width() + dp2px;
        int height = rect.height() + dp2px + dp2px;
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor("#B2141F33"));
        paint.setStyle(Paint.Style.FILL);
        RectF rectF = new RectF();
        rectF.left = BitmapDescriptorFactory.HUE_RED;
        rectF.top = BitmapDescriptorFactory.HUE_RED;
        rectF.right = (float) width;
        rectF.bottom = (float) height;
        float f = (float) (height / 2);
        canvas.drawRoundRect(rectF, f, f, paint);
        RectF rectF2 = new RectF();
        rectF2.left = (float) dp2px;
        rectF2.right = rectF2.left + ((float) decodeResource.getWidth());
        rectF2.top = (float) ((height - decodeResource.getHeight()) >> 1);
        rectF2.bottom = (float) ((decodeResource.getHeight() + height) >> 1);
        canvas.drawBitmap(decodeResource, (Rect) null, rectF2, paint);
        paint.setColor(-1);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        canvas.drawText(str, rectF2.right + ((float) dp2px2), (float) ((((height - fontMetricsInt.bottom) + fontMetricsInt.top) / 2) - fontMetricsInt.top), paint);
        return createBitmap;
    }

    /* renamed from: a */
    public Bitmap mo201138a(Bitmap bitmap, int i) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = ((float) i) / ((float) width);
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    /* renamed from: a */
    public Bitmap mo201139a(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        canvas.drawBitmap(bitmap2, (float) ((width - UIHelper.dp2px(12.0f)) - bitmap2.getWidth()), (float) ((height - UIHelper.dp2px(12.0f)) - bitmap2.getHeight()), (Paint) null);
        return createBitmap;
    }

    public C59185t(Context context, String str, String str2, EditText editText) {
        super(context, (int) R.drawable.chat_window_image_item_holder);
        this.f146904e = context;
        this.f146905f = str;
        this.f146901b = editText;
        this.f146900a = str2;
    }
}
