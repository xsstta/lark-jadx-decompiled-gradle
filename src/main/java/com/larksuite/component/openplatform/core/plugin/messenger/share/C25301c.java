package com.larksuite.component.openplatform.core.plugin.messenger.share;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.util.SparseArray;
import android.view.TextureView;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandFragment;
import com.tt.miniapp.C66546p;
import com.tt.miniapp.component.nativeview.C65903j;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67434b;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.impl.business.file.UriUtil;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.share.c */
public class C25301c {
    /* renamed from: a */
    private static AbstractC67709b m90795a(IAppContext iAppContext) {
        return (AbstractC67709b) iAppContext.findServiceByInterface(AbstractC67709b.class);
    }

    /* renamed from: b */
    private static AbstractC67709b.AbstractC67710a m90797b(IAppContext iAppContext) {
        return (AbstractC67709b.AbstractC67710a) m90795a(iAppContext).mo235130i();
    }

    /* renamed from: a */
    private static int m90789a(BitmapFactory.Options options) {
        int i = 1;
        while (((long) ((((options.outHeight / i) * options.outWidth) / i) * 2)) > 1048576) {
            i *= 2;
        }
        return i;
    }

    /* renamed from: a */
    public static Bitmap m90790a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int i = (int) (((float) width) * 0.6255924f);
        if (bitmap.getHeight() < i) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, i);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* renamed from: a */
    private static Bitmap m90793a(URL url) throws IOException {
        InputStream inputStream = url.openConnection().getInputStream();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        int a = m90789a(options);
        inputStream.close();
        options.inJustDecodeBounds = false;
        options.inSampleSize = a;
        InputStream inputStream2 = url.openConnection().getInputStream();
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream2, null, options);
        inputStream2.close();
        return decodeStream;
    }

    /* renamed from: a */
    public static Bitmap m90791a(AbstractC67434b bVar) {
        Fragment C = ((C66546p) bVar).mo232111C();
        if (C == null || C.getView() == null) {
            return null;
        }
        View findViewById = C.getView().findViewById(R.id.microapp_m_swipe_target);
        Bitmap createBitmap = Bitmap.createBitmap(findViewById.getWidth(), findViewById.getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(createBitmap, (float) findViewById.getWidth(), (float) findViewById.getHeight(), new Paint());
        findViewById.draw(canvas);
        if (C instanceof AppbrandFragment) {
            SparseArray<View> allNativeViews = ((AppbrandFragment) C).getNativeViewManager().getAllNativeViews();
            for (int i = 0; i < allNativeViews.size(); i++) {
                View valueAt = allNativeViews.valueAt(i);
                if (valueAt instanceof C65903j) {
                    TextureView renderView = ((C65903j) valueAt).getRenderView();
                    if (renderView != null) {
                        Bitmap bitmap = renderView.getBitmap();
                        int[] iArr = new int[2];
                        findViewById.getLocationInWindow(iArr);
                        int[] iArr2 = new int[2];
                        renderView.getLocationInWindow(iArr2);
                        int i2 = iArr2[0] - iArr[0];
                        int i3 = iArr2[1] - iArr[1];
                        Bitmap createBitmap2 = Bitmap.createBitmap(findViewById.getWidth(), findViewById.getHeight(), Bitmap.Config.RGB_565);
                        Canvas canvas2 = new Canvas(createBitmap2);
                        canvas2.drawBitmap(bitmap, (float) i2, (float) i3, new Paint());
                        canvas2.drawBitmap(createBitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new Paint());
                        bitmap.recycle();
                        createBitmap.recycle();
                        return createBitmap2;
                    }
                    AppBrandLogger.m52829e("LarkShareAppMessageCtrl", "Page Has video, but we can not get TextureView");
                }
            }
        }
        return createBitmap;
    }

    /* renamed from: a */
    private static Bitmap m90794a(byte[] bArr) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int a = m90789a(options);
        options.inJustDecodeBounds = false;
        options.inSampleSize = a;
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }

    /* renamed from: b */
    private static Bitmap m90796b(String str, IAppContext iAppContext) throws IOException {
        Uri a = UriUtil.m264453a(str);
        if (UriUtil.m264454a(a, "http") || UriUtil.m264454a(a, "https")) {
            return m90793a(new URL(str));
        }
        try {
            File i = ((AbstractC67722a) iAppContext.findServiceByInterface(AbstractC67722a.class)).mo235635i(new TTFile(str), new TTFileContext(null, "shareAppMessageDirectly"));
            return m90793a(new URL("file://" + i.getPath()));
        } catch (TTFileException e) {
            AppBrandLogger.m52829e("LarkShareAppMessageCtrl", "getSystemFile exception:", e);
            throw new IOException("getSystemFile failed", e);
        }
    }

    /* renamed from: a */
    static Bitmap m90792a(String str, IAppContext iAppContext) throws IOException {
        if (TTFileHelper.m264259a("shareAppMessageDirectly", iAppContext)) {
            return m90796b(str, iAppContext);
        }
        String c = m90797b(iAppContext).mo235044c(str);
        if (c.startsWith("http")) {
            return m90793a(new URL(str));
        }
        File file = new File(c);
        if (file.exists()) {
            if (m90797b(iAppContext).mo235035a(file)) {
                return m90793a(new URL("file://" + c));
            }
            AppBrandLogger.m52829e("LarkShareAppMessageCtrl", "file not found");
            throw new IOException("IllegalFile");
        } else if (StreamLoader.findFile(c, iAppContext) != null) {
            return m90794a(StreamLoader.loadByteFromStream(c, iAppContext));
        } else {
            AppBrandLogger.m52829e("LarkShareAppMessageCtrl", "file not found");
            throw new IOException("IllegalFile");
        }
    }
}
