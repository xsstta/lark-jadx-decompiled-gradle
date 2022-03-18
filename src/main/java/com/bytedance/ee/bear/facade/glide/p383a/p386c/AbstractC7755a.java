package com.bytedance.ee.bear.facade.glide.p383a.p386c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.AbstractC5082ab;
import com.bytedance.ee.bear.facade.glide.p383a.C7754c;
import com.bytedance.ee.bear.facade.glide.p383a.p384a.C7745a;
import com.bytedance.ee.bear.facade.glide.p383a.p385b.C7753e;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.Response;

/* renamed from: com.bytedance.ee.bear.facade.glide.a.c.a */
public abstract class AbstractC7755a implements AbstractC7761e {
    /* renamed from: a */
    private boolean m31072a(int i) {
        return i > 0 || i == -2;
    }

    /* renamed from: a */
    private int m31071a(View view) {
        if (view == null) {
            C13479a.m54775e("AbsDefaultImgFileProvider", "view == null");
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (m31072a(view.getHeight())) {
            return view.getHeight();
        }
        if (layoutParams != null) {
            return layoutParams.height;
        }
        return 0;
    }

    /* renamed from: b */
    private int m31074b(View view) {
        if (view == null) {
            C13479a.m54775e("AbsDefaultImgFileProvider", "view == null");
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (m31072a(view.getWidth())) {
            return view.getWidth();
        }
        if (layoutParams != null) {
            return layoutParams.width;
        }
        return 0;
    }

    /* renamed from: a */
    private static byte[] m31073a(C7754c cVar, String str) throws IOException {
        AbstractC5082ab i;
        if (!TextUtils.isEmpty(str) && (i = cVar.mo30381i()) != null) {
            return (byte[]) i.mo20177a(str);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream mo30396a(C7754c cVar, Response response, int i, int i2, int i3, int i4) throws IOException {
        int code = response.code();
        if (code / 100 == 3) {
            C13479a.m54764b("AbsDefaultImgFileProvider", "statusCode=" + code + ", use cache， need not decrypt");
            byte[] a = m31073a(cVar, cVar.mo29120e());
            if (a == null || a.length == 0) {
                C7745a.m31019a().mo30370c(cVar.mo29122g(), cVar.mo30395w());
            }
            return new ByteArrayInputStream(a);
        } else if (response.body() == null) {
            C13479a.m54758a("AbsDefaultImgFileProvider", "response.body() == null");
            return null;
        } else {
            byte[] bytes = response.body().bytes();
            byte[] a2 = new C7753e().mo30375a(cVar.mo30384l(), cVar.mo30385m(), cVar.mo30386n(), bytes);
            boolean z = false;
            if (a2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("decodeData == null, origin data is null = ");
                if (bytes == null) {
                    z = true;
                }
                sb.append(z);
                C13479a.m54758a("AbsDefaultImgFileProvider", sb.toString());
                return null;
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a2, 0, a2.length);
            if (decodeByteArray == null) {
                C13479a.m54758a("AbsDefaultImgFileProvider", "decodeByteArray failed");
                return null;
            }
            int b = m31074b(cVar.mo30394v());
            int a3 = m31071a(cVar.mo30394v());
            if (b <= 0 || a3 <= 0) {
                C13479a.m54758a("AbsDefaultImgFileProvider", "width = " + b + ", height = " + a3);
                return null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(b, a3, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(-1);
            Rect rect = new Rect(0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight());
            RectF rectF = new RectF();
            float min = Math.min((((float) ((b - (i * 2)) - i3)) * 1.0f) / ((float) decodeByteArray.getWidth()), (((float) ((a3 - (i2 * 2)) - i4)) * 1.0f) / ((float) decodeByteArray.getHeight()));
            float width = ((float) decodeByteArray.getWidth()) * min;
            float height = ((float) decodeByteArray.getHeight()) * min;
            float f = (((float) (b - i3)) - width) / 2.0f;
            float f2 = (((float) (a3 - i4)) - height) / 2.0f;
            if (f <= BitmapDescriptorFactory.HUE_RED) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            rectF.left = f;
            if (f2 <= BitmapDescriptorFactory.HUE_RED) {
                f2 = BitmapDescriptorFactory.HUE_RED;
            }
            rectF.top = f2;
            rectF.right = rectF.left + width;
            rectF.bottom = rectF.top + height;
            new Canvas(createBitmap).drawBitmap(decodeByteArray, rect, rectF, new Paint(6));
            decodeByteArray.recycle();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        }
    }
}
