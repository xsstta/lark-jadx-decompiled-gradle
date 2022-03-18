package com.ss.android.vc.p3091e;

import android.content.Context;
import com.smt.usbcam.OnConnectListener;
import com.smt.usbcam.USBCamApi;
import com.smt.usbcam.USBCamManager;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.vc.e.a */
public class C60917a {

    /* renamed from: a */
    public static volatile boolean f152418a;

    /* renamed from: b */
    public static volatile boolean f152419b;

    /* renamed from: c */
    private static USBCamApi f152420c = USBCamManager.getApiSingleton();

    /* renamed from: d */
    private static volatile boolean f152421d = false;

    /* renamed from: e */
    private static Object f152422e = new Object();

    /* renamed from: f */
    private static ConcurrentHashMap<AbstractC60919a, Object> f152423f = new ConcurrentHashMap<>();

    /* renamed from: g */
    private static AtomicBoolean f152424g = new AtomicBoolean(false);

    /* renamed from: h */
    private static boolean f152425h = DesktopUtil.m144307b();

    /* renamed from: i */
    private static OnConnectListener f152426i = new OnConnectListener() {
        /* class com.ss.android.vc.p3091e.C60917a.C609181 */

        @Override // com.smt.usbcam.OnConnectListener
        public void onCancel() {
            C60920b.m236772a("BostonCameraHelper", "[onCancel]");
        }

        @Override // com.smt.usbcam.OnConnectListener
        public void onAttach() {
            C60920b.m236772a("BostonCameraHelper", "[onAttach]");
            C60917a.f152418a = true;
        }

        @Override // com.smt.usbcam.OnConnectListener
        public void onConnect() {
            C60920b.m236772a("BostonCameraHelper", "[onConnect]");
            C60917a.f152419b = true;
        }

        @Override // com.smt.usbcam.OnConnectListener
        public void onDettach() {
            C60920b.m236772a("BostonCameraHelper", "[onDettach]");
            C60917a.f152418a = false;
        }

        @Override // com.smt.usbcam.OnConnectListener
        public void onDisconnect() {
            C60920b.m236772a("BostonCameraHelper", "[onDisconnect]");
            C60917a.f152419b = false;
        }

        @Override // com.smt.usbcam.OnConnectListener
        public void onBusy(boolean z) {
            C60920b.m236772a("BostonCameraHelper", "[onBusy]" + z);
            C60917a.m236771c();
        }
    };

    /* renamed from: com.ss.android.vc.e.a$a */
    public interface AbstractC60919a {
    }

    /* renamed from: a */
    public static boolean m236769a() {
        return f152419b;
    }

    /* renamed from: b */
    public static boolean m236770b() {
        if (f152425h && f152418a && DesktopUtil.m144307b()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static synchronized void m236771c() {
        synchronized (C60917a.class) {
            if (f152425h) {
                if (f152421d) {
                    C60920b.m236772a("BostonCameraHelper", "[stopPreviewInternal]");
                    f152421d = false;
                    f152420c.stopPreview();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m236767a(Context context) {
        if (f152425h && f152424g.compareAndSet(false, true)) {
            C60920b.m236772a("BostonCameraHelper", "[init]");
            f152420c.init(context, f152426i);
        }
    }

    /* renamed from: a */
    public static void m236768a(AbstractC60919a aVar) {
        if (f152425h) {
            C60920b.m236772a("BostonCameraHelper", "[addListener]");
            f152423f.put(aVar, f152422e);
        }
    }
}
