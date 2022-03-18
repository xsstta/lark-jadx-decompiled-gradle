package com.ss.android.lark.utils;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26308n;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.compress.VideoCompressErrorResult;
import com.ss.android.vesdk.AbstractC64045p;
import com.ss.android.vesdk.AbstractC64077u;
import com.ss.android.vesdk.C63937ah;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class ao {

    /* renamed from: a */
    public static boolean f142338a;

    /* renamed from: b */
    public static boolean f142339b;

    /* renamed from: c */
    private static volatile boolean f142340c;

    /* renamed from: d */
    private static Map<String, C57803b> f142341d = new HashMap();

    /* renamed from: com.ss.android.lark.utils.ao$a */
    public interface AbstractC57802a {
        /* renamed from: a */
        void mo126686a(float f);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.utils.ao$c */
    public static class C57804c {

        /* renamed from: a */
        public boolean f142363a;

        private C57804c() {
        }
    }

    /* renamed from: a */
    public static boolean m224307a(String str) {
        m224301a();
        if (VEUtils.m250911a(str, 0, 1) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m224309a(AtomicBoolean atomicBoolean, String str, Bitmap[] bitmapArr, CountDownLatch countDownLatch, ByteBuffer byteBuffer, int i, int i2, int i3) {
        Bitmap bitmap;
        try {
            bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_4444);
            bitmap.copyPixelsFromBuffer(byteBuffer);
            Log.m165389i("VideoTools", "use ve sdk api get first frame");
        } catch (Exception unused) {
            atomicBoolean.set(false);
            bitmap = m224321j(str);
        }
        bitmapArr[0] = bitmap;
        countDownLatch.countDown();
        return false;
    }

    /* renamed from: a */
    public static int[] m224310a(int[] iArr) {
        int i;
        int i2;
        if (iArr[2] == 90 || iArr[2] == 270) {
            i2 = iArr[1];
            i = iArr[0];
        } else {
            i2 = iArr[0];
            i = iArr[1];
        }
        return new int[]{i2, i};
    }

    /* renamed from: a */
    public static boolean m224308a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        if (!C26311p.m95290j(str)) {
            return false;
        }
        if (!C26311p.m95290j(str2)) {
            return new File(str).renameTo(new File(str2));
        }
        return true;
    }

    /* renamed from: b */
    private static String m224312b() {
        return "_" + -1884180608;
    }

    /* renamed from: a */
    private static void m224301a() {
        if (!f142340c) {
            synchronized (ao.class) {
                if (!f142340c) {
                    Application application = LarkContext.getApplication();
                    VeSDKTools.m224287b(application);
                    C63937ah.m250998a(false);
                    try {
                        Log.m165389i("VideoTools", "initVESDK");
                        C63937ah.m250993a(application, m224299a(application));
                        VeSDKTools.m224284a(application);
                        f142340c = true;
                    } catch (Exception e) {
                        Log.m165383e("VideoTools", "checkToInitSDK: " + e.getMessage());
                        f142340c = false;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static int m224314c(String str) {
        m224301a();
        return VEUtils.m250916b(str);
    }

    /* renamed from: e */
    public static synchronized void m224316e(String str) {
        synchronized (ao.class) {
            f142341d.remove(str);
        }
    }

    /* renamed from: a */
    private static String m224299a(Context context) {
        String str = C26308n.m95256b(context) + "/video_editor/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: g */
    public static boolean m224318g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains(m224312b());
    }

    /* renamed from: h */
    public static String m224319h(String str) {
        return str + ".temp";
    }

    /* renamed from: a */
    private static void m224303a(VEVideoEncodeSettings vEVideoEncodeSettings) {
        Log.m165389i("VideoTools", "ve compress settings: " + vEVideoEncodeSettings.toString());
    }

    /* renamed from: b */
    public static VEUtils.VEVideoFileInfo m224311b(String str) {
        m224301a();
        VEUtils.VEVideoFileInfo a = VEUtils.m250915a(str);
        if (a == null) {
            a = new VEUtils.VEVideoFileInfo();
        }
        Log.m165389i("VideoTools", "media: " + str + ", info" + a.toString());
        return a;
    }

    /* renamed from: f */
    public static synchronized void m224317f(String str) {
        synchronized (ao.class) {
            C57803b bVar = f142341d.get(str);
            if (bVar != null) {
                bVar.f142361a.mo220711g();
                bVar.f142362b.onError((ErrorResult) new VideoCompressErrorResult(-2, "Cancel By User"));
            }
        }
    }

    /* renamed from: j */
    private static synchronized Bitmap m224321j(String str) {
        Bitmap bitmap;
        synchronized (ao.class) {
            bitmap = null;
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(str);
                bitmap = mediaMetadataRetriever.getFrameAtTime();
                Log.m165389i("VideoTools", "use android api get first frame");
            } catch (Exception e) {
                Log.m165383e("VideoTools", "getVideoThumbFrame exception: " + e.getMessage());
            }
        }
        return bitmap;
    }

    /* renamed from: b */
    public static void m224313b(boolean z) {
        Log.m165389i("VideoTools", "isUseVeNewMuxer: " + z);
        f142339b = z;
    }

    /* renamed from: d */
    public static synchronized Bitmap m224315d(String str) {
        Bitmap bitmap;
        synchronized (ao.class) {
            long currentTimeMillis = System.currentTimeMillis();
            if (f142338a) {
                bitmap = m224320i(str);
            } else {
                bitmap = m224321j(str);
            }
            Log.m165389i("VideoTools", "getVideoThumbFrame current thread: " + Thread.currentThread().getName() + ", cost time: " + (System.currentTimeMillis() - currentTimeMillis));
        }
        return bitmap;
    }

    /* renamed from: i */
    private static synchronized Bitmap m224320i(String str) {
        Bitmap bitmap;
        synchronized (ao.class) {
            m224301a();
            Bitmap[] bitmapArr = new Bitmap[1];
            CountDownLatch countDownLatch = new CountDownLatch(1);
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            long currentTimeMillis = System.currentTimeMillis();
            VEUtils.m250912a(str, 0, new AbstractC64077u(atomicBoolean, str, bitmapArr, countDownLatch) {
                /* class com.ss.android.lark.utils.$$Lambda$ao$6v3_GUZ8ZDEVxRFNKQ5BiaarkEg */
                public final /* synthetic */ AtomicBoolean f$0;
                public final /* synthetic */ String f$1;
                public final /* synthetic */ Bitmap[] f$2;
                public final /* synthetic */ CountDownLatch f$3;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                @Override // com.ss.android.vesdk.AbstractC64077u
                public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
                    return ao.m224309a(this.f$0, this.f$1, this.f$2, this.f$3, byteBuffer, i, i2, i3);
                }
            }, true, 80, 40, 20, 0);
            try {
                countDownLatch.await(2, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Log.m165383e("VideoTools", "getVideoThumbFrameByVe exception: " + e.getMessage());
            }
            if (bitmapArr[0] == null) {
                atomicBoolean.set(false);
            }
            m224306a(atomicBoolean.get(), System.currentTimeMillis() - currentTimeMillis);
            bitmap = bitmapArr[0];
        }
        return bitmap;
    }

    /* renamed from: a */
    public static void m224305a(boolean z) {
        Log.m165389i("VideoTools", "useVeGetFirstFrame: " + z);
        f142338a = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.utils.ao$b */
    public static class C57803b {

        /* renamed from: a */
        public VEEditor f142361a;

        /* renamed from: b */
        public IGetDataCallback<String> f142362b;

        public C57803b(VEEditor vEEditor, IGetDataCallback<String> iGetDataCallback) {
            this.f142361a = vEEditor;
            this.f142362b = iGetDataCallback;
        }
    }

    /* renamed from: a */
    public static int m224298a(String str, int[] iArr) {
        m224301a();
        return VEUtils.m250913a(str, iArr);
    }

    /* renamed from: a */
    public static synchronized void m224304a(String str, C57803b bVar) {
        synchronized (ao.class) {
            f142341d.put(str, bVar);
        }
    }

    /* renamed from: a */
    private static void m224306a(boolean z, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cut_result", z ? 1 : 0);
            jSONObject.put("cut_duration", j);
            Statistics.sendEvent("video_first_frame_event_dev", jSONObject);
        } catch (JSONException e) {
            Log.m165383e("VideoTools", e.getMessage());
        }
    }

    /* renamed from: a */
    public static String m224300a(Context context, String str, Boolean bool) {
        String str2;
        String str3 = "";
        if (TextUtils.isEmpty(str) || !C26311p.m95290j(str)) {
            return str3;
        }
        String s = C57881t.m224647s(context);
        File file = new File(str);
        StringBuilder sb = new StringBuilder();
        sb.append(("SUCCESS_COMPRESS_MEDIA_" + file.hashCode() + "_" + file.lastModified() + "_" + file.length()).hashCode());
        sb.append(File.separator);
        String sb2 = sb.toString();
        String name = file.getName();
        if (bool.booleanValue()) {
            str3 = m224312b();
        }
        int lastIndexOf = name.lastIndexOf(".");
        if (lastIndexOf > 0) {
            str2 = name.substring(0, lastIndexOf) + str3 + ".mp4";
        } else {
            str2 = name + str3;
        }
        return s + sb2 + str2;
    }

    /* renamed from: a */
    public static void m224302a(final Context context, final String str, final String str2, final String str3, final int i, final int i2, final int i3, boolean z, final boolean z2, final IGetDataCallback<String> iGetDataCallback, final AbstractC57802a aVar) {
        IGetDataCallback<String> iGetDataCallback2;
        VEEditor vEEditor;
        Exception e;
        final boolean z3;
        m224301a();
        final VEEditor vEEditor2 = new VEEditor(m224299a(context));
        try {
            vEEditor2.mo220689a(new String[]{str2}, (String[]) null, (String[]) null, VEEditor.VIDEO_RATIO.VIDEO_OUT_RATIO_ORIGINAL);
            vEEditor2.mo220708d(false);
            vEEditor2.mo220687a(VEEditor.SCALE_MODE.SCALE_MODE_CENTER_CROP);
            vEEditor2.mo220710f();
            if (!f142339b) {
                z3 = false;
            } else {
                z3 = z;
            }
            VeHWUtils.m224276g();
            VeConfig c = VideoSettingUtils.m224296c();
            VEVideoEncodeSettings a = new VEVideoEncodeSettings.C63917a(2).mo221104b(2).mo221102a(z3).mo221099a(i, i2).mo221098a(i3).mo221100a(VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_HIGH).mo221105b(z2).mo221101a(c.getExternalSetting()).mo221103a();
            RemuxSetting remuxSetting = c.getRemuxSetting();
            if (m224318g(str3)) {
                a.setEnableRemuxVideoRes(remuxSetting.getOriginResolution());
                a.setEnableRemuxVideoFPS(remuxSetting.getOriginFPS());
                a.setEnableRemuxVideoBitrate(remuxSetting.getOriginBitrate());
            } else {
                a.setEnableRemuxVideoRes(remuxSetting.getCommonResolution());
                a.setEnableRemuxVideoFPS(remuxSetting.getCommonFPS());
                a.setEnableRemuxVideoBitrate(remuxSetting.getCommonBitrate());
            }
            if (f142339b) {
                a.setEnableAvInterLeave(true);
            } else {
                a.setEnableInterLeave(true);
            }
            m224303a(a);
            final C57804c cVar = new C57804c();
            Log.m165389i("VideoTools", "compress video, file size: " + new File(str2).length());
            vEEditor2.mo220701b(new AbstractC64045p() {
                /* class com.ss.android.lark.utils.ao.C578001 */

                @Override // com.ss.android.vesdk.AbstractC64045p
                /* renamed from: a */
                public void mo196111a(int i, int i2, float f, String str) {
                    AbstractC57802a aVar;
                    if (i == 4103) {
                        ak.m224269d();
                        Log.m165389i("VideoTools", "sync result: " + cVar.f142363a + ", compress video success, file size: " + new File(str3).length());
                        if (!cVar.f142363a) {
                            iGetDataCallback.onSuccess("");
                            vEEditor2.mo220711g();
                            ao.m224316e(str);
                            return;
                        }
                        Log.m165383e("VideoTools", "has callback OnErrorListener：" + cVar.toString());
                    } else if (i == 4105 && (aVar = aVar) != null) {
                        aVar.mo126686a(f);
                    }
                }
            });
            try {
                vEEditor2.mo220694a(new AbstractC64045p() {
                    /* class com.ss.android.lark.utils.ao.C578012 */

                    @Override // com.ss.android.vesdk.AbstractC64045p
                    /* renamed from: a */
                    public void mo196111a(int i, int i2, float f, String str) {
                        ak.m224269d();
                        cVar.f142363a = true;
                        Log.m165383e("VideoTools", "video compress failed: " + cVar.toString() + " type = [" + i + "], ext = [" + i2 + "], f = [" + f + "], msg = [" + str + "]");
                        if (z2) {
                            vEEditor2.mo220711g();
                            ao.m224316e(str);
                            ao.m224302a(context, str, str2, str3, i, i2, i3, z3, false, iGetDataCallback, aVar);
                            return;
                        }
                        iGetDataCallback.onError((ErrorResult) new VideoCompressErrorResult(-1, str));
                        vEEditor2.mo220711g();
                        ao.m224316e(str);
                    }
                });
                vEEditor = vEEditor2;
                try {
                    File parentFile = new File(str3).getParentFile();
                    if (parentFile.exists() || parentFile.mkdirs()) {
                        m224304a(str, new C57803b(vEEditor, iGetDataCallback));
                        ak.m224268c();
                        vEEditor.mo220697a(str3, (String) null, a);
                        return;
                    }
                    iGetDataCallback2 = iGetDataCallback;
                    try {
                        iGetDataCallback2.onError((ErrorResult) new VideoCompressErrorResult(-3, "cannot create compress path，compress: " + str3));
                        vEEditor.mo220711g();
                    } catch (Exception e2) {
                        e = e2;
                        iGetDataCallback2.onError((ErrorResult) new VideoCompressErrorResult(-4, e.getMessage()));
                        vEEditor.mo220711g();
                    }
                } catch (Exception e3) {
                    e = e3;
                    iGetDataCallback2 = iGetDataCallback;
                    iGetDataCallback2.onError((ErrorResult) new VideoCompressErrorResult(-4, e.getMessage()));
                    vEEditor.mo220711g();
                }
            } catch (Exception e4) {
                e = e4;
                iGetDataCallback2 = iGetDataCallback;
                vEEditor = vEEditor2;
                iGetDataCallback2.onError((ErrorResult) new VideoCompressErrorResult(-4, e.getMessage()));
                vEEditor.mo220711g();
            }
        } catch (Exception e5) {
            e = e5;
            vEEditor = vEEditor2;
            iGetDataCallback2 = iGetDataCallback;
            iGetDataCallback2.onError((ErrorResult) new VideoCompressErrorResult(-4, e.getMessage()));
            vEEditor.mo220711g();
        }
    }
}
