package com.tt.miniapp.manager;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.util.C67586c;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.util.C67866g;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: com.tt.miniapp.manager.l */
public class C66452l {

    /* renamed from: a */
    private static Runnable f167756a = new Runnable() {
        /* class com.tt.miniapp.manager.C66452l.RunnableC664574 */

        public void run() {
            C66452l.m259767a();
        }
    };

    /* renamed from: com.tt.miniapp.manager.l$a */
    public static class C66458a {

        /* renamed from: b */
        public static final Object f167763b = new Object();

        /* renamed from: a */
        public Bitmap f167764a;

        /* renamed from: c */
        public WeakReference<Activity> f167765c;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.manager.l$b */
    public interface AbstractC66459b {
        /* renamed from: a */
        void mo232003a(Bitmap bitmap);
    }

    /* renamed from: a */
    public static byte[] m259770a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int i = 100;
        byte[] bArr = new byte[0];
        while (i > 60) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
            i -= 20;
            if (bArr.length < 524288) {
                break;
            }
        }
        return bArr;
    }

    /* renamed from: c */
    private static C66458a m259774c() {
        return ContextSingletonInstance.getInstance().snapshotDataInstance;
    }

    /* renamed from: b */
    public static String m259773b() {
        String processIdentify = ProcessUtil.getProcessIdentify();
        processIdentify.hashCode();
        char c = 65535;
        switch (processIdentify.hashCode()) {
            case -1359418618:
                if (processIdentify.equals("miniapp0")) {
                    c = 0;
                    break;
                }
                break;
            case -1359418617:
                if (processIdentify.equals("miniapp1")) {
                    c = 1;
                    break;
                }
                break;
            case -1359418616:
                if (processIdentify.equals("miniapp2")) {
                    c = 2;
                    break;
                }
                break;
            case -1359418615:
                if (processIdentify.equals("miniapp3")) {
                    c = 3;
                    break;
                }
                break;
            case -1359418614:
                if (processIdentify.equals("miniapp4")) {
                    c = 4;
                    break;
                }
                break;
            case 1716294567:
                if (processIdentify.equals("hostProcess")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return ".m0";
            case 1:
                return ".m1";
            case 2:
                return ".m2";
            case 3:
                return ".m3";
            case 4:
                return ".m4";
            case 5:
                return ".h";
            default:
                return "";
        }
    }

    /* renamed from: a */
    public static void m259767a() {
        AppBrandLogger.m52828d("SnapshotManager", "clearCacheSnapshot");
        C67866g.m264031b(f167756a);
        C66458a c = m259774c();
        if (c.f167764a != null) {
            synchronized (C66458a.f167763b) {
                c.f167764a = null;
                c.f167765c = null;
            }
        }
    }

    /* renamed from: a */
    public static void m259769a(final Context context) {
        C67866g.m264026a(new Action() {
            /* class com.tt.miniapp.manager.C66452l.C664531 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                C67586c.m263046a(C66452l.m259772b(context));
            }
        }, C67554l.m262725b(), false);
    }

    /* renamed from: b */
    public static File m259772b(Context context) {
        File file = new File(context.getCacheDir(), "miniapp_ss");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    public static Bitmap m259762a(Activity activity) {
        if (activity == null) {
            AppBrandLogger.m52829e("SnapshotManager", "getSnapshot activity == null");
            return null;
        }
        C67866g.m264031b(f167756a);
        C66458a c = m259774c();
        if (c.f167764a != null) {
            synchronized (C66458a.f167763b) {
                if (c.f167765c != null) {
                    if (activity == c.f167765c.get()) {
                        C67866g.m264028a(f167756a, 3000);
                        return c.f167764a;
                    }
                }
                AppBrandLogger.m52830i("SnapshotManager", "clear old snapshot");
                c.f167765c = null;
                c.f167764a = null;
            }
        }
        Bitmap b = m259771b(activity);
        if (b != null) {
            C67866g.m264028a(f167756a, 3000);
        }
        return b;
    }

    /* renamed from: b */
    private static Bitmap m259771b(final Activity activity) {
        AppBrandLogger.m52830i("SnapshotManager", "generateCacheSnapshot activity:", activity);
        final C66458a c = m259774c();
        synchronized (C66458a.f167763b) {
            if (c.f167764a != null) {
                return c.f167764a;
            }
            C67866g.m264027a(new Runnable() {
                /* class com.tt.miniapp.manager.C66452l.RunnableC664542 */

                public void run() {
                    C66452l.m259768a(activity, new AbstractC66459b() {
                        /* class com.tt.miniapp.manager.C66452l.RunnableC664542.C664551 */

                        @Override // com.tt.miniapp.manager.C66452l.AbstractC66459b
                        /* renamed from: a */
                        public void mo232003a(Bitmap bitmap) {
                            synchronized (C66458a.f167763b) {
                                c.f167764a = bitmap;
                                c.f167765c = new WeakReference<>(activity);
                                C66458a.f167763b.notifyAll();
                            }
                        }
                    });
                }
            });
            try {
                C66458a.f167763b.wait();
            } catch (InterruptedException e) {
                AppBrandLogger.m52829e("SnapshotManager", "generateCacheSnapshot", e);
            }
            return c.f167764a;
        }
    }

    /* renamed from: a */
    public static BitmapDrawable m259764a(Resources resources, String str) {
        try {
            return m259765a(resources, str, -1, -1);
        } catch (OutOfMemoryError e) {
            AppBrandLogger.m52829e("SnapshotManager", "getSnapshotDrawableFromFile OutOfMemoryError:", e);
            C67586c.m263051b(new File(str));
            return null;
        }
    }

    /* renamed from: a */
    public static File m259766a(Activity activity, byte[] bArr) {
        if (activity == null || bArr == null) {
            return null;
        }
        File b = m259772b((Context) activity);
        File file = new File(b, System.currentTimeMillis() + m259773b());
        C67586c.m263049a(file.getAbsolutePath(), bArr);
        return file;
    }

    /* renamed from: a */
    public static void m259768a(Activity activity, final AbstractC66459b bVar) {
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT >= 26) {
            View rootView = activity.findViewById(16908290).getRootView();
            if (rootView == null) {
                bVar.mo232003a(null);
                return;
            }
            int width = rootView.getWidth();
            int height = rootView.getHeight();
            if (width <= 0 || height <= 0) {
                bVar.mo232003a(null);
                return;
            }
            final Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            int[] iArr = new int[2];
            rootView.getLocationInWindow(iArr);
            try {
                PixelCopy.request(activity.getWindow(), new Rect(iArr[0], iArr[1], iArr[0] + width, iArr[1] + height), createBitmap, new PixelCopy.OnPixelCopyFinishedListener() {
                    /* class com.tt.miniapp.manager.C66452l.PixelCopy$OnPixelCopyFinishedListenerC664563 */

                    public void onPixelCopyFinished(int i) {
                        AppBrandLogger.m52830i("SnapshotManager", "onPixelCopyFinished:" + i);
                        if (i == 0) {
                            bVar.mo232003a(createBitmap);
                        } else {
                            bVar.mo232003a(null);
                        }
                    }
                }, new Handler(Looper.getMainLooper()));
            } catch (IllegalArgumentException e) {
                AppBrandLogger.m52829e("SnapshotManager", e);
                bVar.mo232003a(null);
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            int measuredWidth = viewGroup.getMeasuredWidth();
            int measuredHeight = viewGroup.getMeasuredHeight();
            if (measuredWidth <= 0 || measuredHeight <= 0) {
                bVar.mo232003a(null);
                return;
            }
            try {
                bitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.RGB_565);
                viewGroup.draw(new Canvas(bitmap));
            } catch (OutOfMemoryError e2) {
                AppBrandLogger.m52829e("SnapshotManager", "generateCacheSnapshot error:", e2);
            }
            bVar.mo232003a(bitmap);
        }
    }

    /* renamed from: a */
    public static Bitmap m259763a(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i <= 0 || i >= width) {
            i = width;
        }
        if (i2 <= 0 || i2 >= height) {
            i2 = height;
        }
        if (i == width && i2 == height) {
            return bitmap;
        }
        return Bitmap.createBitmap(bitmap, 0, 0, i, i2);
    }

    /* renamed from: a */
    public static BitmapDrawable m259765a(Resources resources, String str, int i, int i2) {
        byte[] a = C67586c.m263050a(str);
        if (a == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a, 0, a.length, options);
        C67586c.m263051b(new File(str));
        return new BitmapDrawable(resources, m259763a(decodeByteArray, i, i2));
    }
}
