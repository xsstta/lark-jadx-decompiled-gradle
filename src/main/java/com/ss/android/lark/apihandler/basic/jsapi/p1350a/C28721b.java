package com.ss.android.lark.apihandler.basic.jsapi.p1350a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.webkit.WebView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.apihandler.basic.jsapi.p1350a.C28710a;
import com.ss.android.lark.apihandler.basic.jsapi.p1350a.p1351a.AbstractC28720a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57881t;
import java.util.List;

/* renamed from: com.ss.android.lark.apihandler.basic.jsapi.a.b */
public class C28721b {
    /* renamed from: a */
    public static final Bitmap m105295a(View view) {
        if (view == null) {
            return null;
        }
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        view.destroyDrawingCache();
        return createBitmap;
    }

    /* renamed from: a */
    public static void m105297a(WebView webView, AbstractC28720a aVar) {
        int i;
        int i2;
        Picture capturePicture = webView.capturePicture();
        if (capturePicture != null) {
            i = capturePicture.getHeight();
            i2 = capturePicture.getWidth();
        } else if (webView == null) {
            Log.m165383e("ScreenshotUtils", "captureWebViewIfNeed while getWebView null");
            return;
        } else {
            webView.measure(0, 0);
            i = webView.getMeasuredHeight();
            i2 = webView.getMeasuredWidth();
        }
        int height = webView.getHeight();
        int i3 = i / height;
        Log.m165389i("ScreenshotUtils", "captureWebViewIfNeed()... count = " + i3 + ", contentHeight =" + i + ",height = " + height);
        if (i3 >= 40) {
            aVar.mo102135a(-1, "There is too much content on this page");
        } else {
            new C28710a.C28719a(webView.getContext()).mo102128a(webView).mo102127a(i2).mo102132b(i).mo102133c(webView.getHeight()).mo102130a(C57881t.m224606E(webView.getContext())).mo102129a(aVar).mo102131a().mo102111a();
        }
    }

    /* renamed from: a */
    public static final Bitmap m105296a(List<Bitmap> list, int i, int i2, float f) {
        Bitmap bitmap;
        OutOfMemoryError e;
        Rect rect;
        RectF rectF;
        if (list != null && list.size() > 0) {
            try {
                bitmap = Bitmap.createBitmap(list.get(0).getWidth(), i, Bitmap.Config.RGB_565);
                try {
                    Canvas canvas = new Canvas(bitmap);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        Bitmap bitmap2 = list.get(i3);
                        float height = (float) (bitmap2.getHeight() * i3);
                        if (i3 != size - 1 || i2 <= 0) {
                            rect = new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
                            rectF = new RectF(BitmapDescriptorFactory.HUE_RED, height, (float) bitmap2.getWidth(), ((float) bitmap2.getHeight()) + height);
                        } else {
                            rect = new Rect(0, bitmap2.getHeight() - i2, bitmap2.getWidth(), bitmap2.getHeight());
                            rectF = new RectF(BitmapDescriptorFactory.HUE_RED, height, (float) bitmap2.getWidth(), ((float) i2) + height);
                        }
                        canvas.drawBitmap(bitmap2, rect, rectF, paint);
                    }
                    Matrix matrix = new Matrix();
                    matrix.setScale(f, f);
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    if (createBitmap != null && !createBitmap.isRecycled()) {
                        bitmap.recycle();
                        return createBitmap;
                    }
                } catch (OutOfMemoryError e2) {
                    e = e2;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    Log.m165386e("ScreenshotUtils", e);
                    return null;
                }
            } catch (OutOfMemoryError e3) {
                e = e3;
                bitmap = null;
                bitmap.recycle();
                Log.m165386e("ScreenshotUtils", e);
                return null;
            }
        }
        return null;
    }
}
