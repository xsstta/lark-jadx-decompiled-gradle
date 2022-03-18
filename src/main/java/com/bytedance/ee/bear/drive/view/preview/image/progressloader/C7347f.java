package com.bytedance.ee.bear.drive.view.preview.image.progressloader;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.widget.ImageView;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode.DecodeFormat;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7301c;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.C7302d;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.C7305f;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.decode.C7339d;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p368a.C7282a;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p371c.C7323a;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p372d.C7333f;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.f */
public class C7347f {

    /* renamed from: e */
    private static final C7347f f19656e = new C7347f();

    /* renamed from: a */
    private AbstractC7301c f19657a = m29331b();

    /* renamed from: b */
    private DecodeFormat f19658b = DecodeFormat.DEFAULT;

    /* renamed from: c */
    private C7348g f19659c = new C7348g();

    /* renamed from: d */
    private C7280a f19660d = new C7280a();

    /* renamed from: a */
    public static C7347f m29330a() {
        C7333f.m29296a();
        return f19656e;
    }

    private C7347f() {
    }

    /* renamed from: b */
    private AbstractC7301c m29331b() {
        if (Build.VERSION.SDK_INT >= 11) {
            return new C7305f(16384);
        }
        return new C7302d();
    }

    /* renamed from: a */
    public void mo28602a(String str) {
        C7333f.m29296a();
        this.f19659c.mo28603a(str);
    }

    /* renamed from: b */
    private static boolean m29332b(String str) {
        String scheme;
        if (str == null || (scheme = Uri.parse(str).getScheme()) == null) {
            return false;
        }
        if ("http".equals(scheme) || "https".equals(scheme)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public String mo28601a(C7282a aVar, ImageView imageView, AbstractC7326d<ImageView, Bitmap, byte[]> dVar) {
        C7333f.m29296a();
        if (aVar == null || !m29332b(aVar.mo28458b()) || imageView == null) {
            C13479a.m54764b("ProgressiveImageLoader", "not a network url, or target is null");
            return "";
        }
        C7293b bVar = new C7293b(aVar, new C7323a(imageView), dVar, new C7339d(this.f19657a, this.f19658b), this.f19660d);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f19659c.mo28604a(valueOf, bVar);
        return valueOf;
    }
}
