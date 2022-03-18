package com.ss.android.lark.widget.photo_picker.gallery.function.action;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import java.io.File;

/* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.action.f */
public class C58772f implements AbstractC58768d {

    /* renamed from: a */
    public Context f145265a;

    /* renamed from: b */
    public AbstractC58774a f145266b;

    /* renamed from: c */
    public String f145267c;

    /* renamed from: d */
    private final boolean f145268d;

    /* renamed from: e */
    private PhotoItem f145269e;

    /* renamed from: f */
    private File f145270f;

    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.action.f$a */
    public interface AbstractC58774a {
        /* renamed from: a */
        void mo199197a(String str, Context context);
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: d */
    public int mo199179d() {
        return R.drawable.icon_qrcode_recognize_selector;
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: a */
    public Runnable mo199177a() {
        return new Runnable() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58772f.RunnableC587731 */

            public void run() {
                if (!TextUtils.isEmpty(C58772f.this.f145267c)) {
                    C58772f.this.f145266b.mo199197a(C58772f.this.f145267c, C58772f.this.f145265a);
                }
            }
        };
    }

    /* renamed from: b */
    private boolean m227981b() {
        return C58612c.m227290a().mo102854b("lark.scale.qrcode.file");
    }

    /* renamed from: f */
    private boolean m227983f() {
        return C58612c.m227290a().mo102854b("lark.skip.too.large.file");
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: c */
    public String mo199178c() {
        return UIUtils.getString(this.f145265a, R.string.Lark_Legacy_QRCode);
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: e */
    public boolean mo199180e() {
        if (!this.f145268d || TextUtils.isEmpty(this.f145267c)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private int[] m227982b(String str) {
        if (!C26311p.m95290j(str)) {
            return new int[]{0, 0};
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: a */
    private String m227980a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (m227983f()) {
            int[] b = m227982b(str);
            int i = b[0];
            int i2 = b[1];
            if (i * i2 > 25000000) {
                Log.m165397w("QrcodeRecognAction", "imageSize:[" + i + ", " + i2 + "], skip decodeQRCode");
                return null;
            }
        }
        return C58612c.m227290a().mo102858d(str);
    }

    /* renamed from: a */
    private String m227979a(Context context, String str) {
        int[] b = m227982b(str);
        int i = b[0];
        int i2 = 1;
        int i3 = b[1];
        int screenWidth = DeviceUtils.getScreenWidth(context);
        int screenHeight = DeviceUtils.getScreenHeight(context);
        if (i > screenWidth || i3 > screenHeight) {
            while (true) {
                if (i / i2 <= screenWidth && i3 / i2 <= screenHeight) {
                    break;
                }
                i2 *= 2;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i2;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            options.inMutable = false;
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                if (decodeFile != null) {
                    Log.m165389i("QrcodeRecognAction", "oriWidth:" + i + ", oriHeight:" + i3 + ", bitmap width:" + decodeFile.getWidth() + ", bitmap height:" + decodeFile.getHeight());
                    String a = C58612c.m227290a().mo102831a(decodeFile);
                    if (!decodeFile.isRecycled()) {
                        Log.m165389i("QrcodeRecognAction", "recycle bitmap");
                        decodeFile.recycle();
                    }
                    return a;
                }
            } catch (Exception e) {
                Log.m165386e("QrcodeRecognAction", e);
            }
        }
        return m227980a(str);
    }

    public C58772f(Context context, boolean z, PhotoItem photoItem, File file, AbstractC58774a aVar) {
        this.f145265a = context;
        this.f145268d = z;
        this.f145269e = photoItem;
        this.f145270f = file;
        this.f145266b = aVar;
        if (file != null) {
            String path = file.getPath();
            if (m227981b()) {
                this.f145267c = m227979a(context, path);
            } else {
                this.f145267c = m227980a(path);
            }
        }
    }
}
