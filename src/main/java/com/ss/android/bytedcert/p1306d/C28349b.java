package com.ss.android.bytedcert.p1306d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Base64;
import com.bytedance.common.utility.Logger;
import com.ss.android.bytedcert.activities.OCRTakePhotoActivity;
import com.ss.android.bytedcert.callback.AbstractC28336g;
import com.ss.android.bytedcert.p1304b.C28319b;
import com.ss.android.bytedcert.p1314g.C28381c;
import com.ss.android.bytedcert.utils.C28431a;
import com.ss.android.bytedcert.utils.C28439e;
import com.ss.android.bytedcert.view.camera.C28445a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.io.ByteArrayOutputStream;

/* renamed from: com.ss.android.bytedcert.d.b */
public class C28349b {
    /* renamed from: a */
    public static Intent m103984a(Activity activity, String str) {
        Intent intent = new Intent(activity, OCRTakePhotoActivity.class);
        intent.putExtra(ShareHitPoint.f121869d, str);
        if ("hold".equals(str)) {
            C28445a.f71543a = 1;
        } else {
            C28445a.f71543a = 0;
        }
        return intent;
    }

    /* renamed from: a */
    public static void m103989a(String str, String str2) {
        try {
            ExifInterface exifInterface = new ExifInterface(str2);
            C28319b.f71163a.put(str, new C28381c(C28431a.m104205a(str2, 1280, 720), exifInterface));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m103987a(Activity activity, String str, int i) {
        if (activity != null) {
            activity.startActivityForResult(m103984a(activity, str), i);
        }
    }

    /* renamed from: a */
    public static String m103985a(String str, int i, int i2) {
        Bitmap bitmap;
        Bitmap a = C28319b.f71163a.get(str).mo101085a();
        if (a.getWidth() <= a.getHeight()) {
            bitmap = C28431a.m104201a(i, a);
        } else {
            bitmap = C28431a.m104203a(a, i);
        }
        Logger.m15167d(C60375c.f150914a, bitmap.getHeight() + "," + bitmap.getWidth());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (i2 == 0) {
            i2 = 85;
        }
        bitmap.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        return "data:image/jpeg;base64," + encodeToString;
    }

    /* renamed from: a */
    public static void m103988a(Context context, String str, Uri uri) {
        if (uri != null) {
            m103989a(str, C28439e.m104225a(context, uri));
        }
    }

    /* renamed from: a */
    public static void m103986a(Activity activity, int i, AbstractC28336g.AbstractC28337a aVar, AbstractC28336g.AbstractC28338b bVar) {
        if (aVar == null) {
            activity.startActivityForResult(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), i);
        } else {
            aVar.mo100939a(1, bVar);
        }
    }
}
