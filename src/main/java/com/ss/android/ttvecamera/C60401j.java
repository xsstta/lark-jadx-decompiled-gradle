package com.ss.android.ttvecamera;

import android.os.Bundle;
import com.bytedance.bpea.basics.PrivacyCert;
import com.ss.android.ttvecamera.C60405k;
import com.ss.android.ttvecamera.C60408m;
import com.ss.android.ttvecamera.C60427s;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ttvecamera.j */
public class C60401j {

    /* renamed from: a */
    protected TECameraSettings f150970a;

    /* renamed from: b */
    protected AbstractC60402a f150971b = C60403b.m234757a();

    /* renamed from: c */
    protected AbstractC60404c f150972c;

    /* renamed from: d */
    protected Map<Integer, Bundle> f150973d = new HashMap();

    /* renamed from: com.ss.android.ttvecamera.j$a */
    public interface AbstractC60402a {
        /* renamed from: a */
        void mo206865a(int i);

        /* renamed from: a */
        void mo206866a(int i, int i2);

        /* renamed from: a */
        void mo206867a(int i, int i2, String str);

        /* renamed from: a */
        void mo206868a(int i, String str);
    }

    /* renamed from: com.ss.android.ttvecamera.j$c */
    public interface AbstractC60404c {
        /* renamed from: a */
        TEFrameSizei mo206869a(List<TEFrameSizei> list, List<TEFrameSizei> list2);
    }

    /* renamed from: com.ss.android.ttvecamera.j$b */
    protected static class C60403b implements AbstractC60402a {

        /* renamed from: a */
        private static volatile C60403b f150974a;

        @Override // com.ss.android.ttvecamera.C60401j.AbstractC60402a
        /* renamed from: a */
        public void mo206865a(int i) {
        }

        @Override // com.ss.android.ttvecamera.C60401j.AbstractC60402a
        /* renamed from: a */
        public void mo206866a(int i, int i2) {
        }

        @Override // com.ss.android.ttvecamera.C60401j.AbstractC60402a
        /* renamed from: a */
        public void mo206867a(int i, int i2, String str) {
        }

        @Override // com.ss.android.ttvecamera.C60401j.AbstractC60402a
        /* renamed from: a */
        public void mo206868a(int i, String str) {
        }

        protected C60403b() {
        }

        /* renamed from: a */
        public static C60403b m234757a() {
            C60403b bVar;
            synchronized (C60403b.class) {
                if (f150974a == null) {
                    synchronized (C60403b.class) {
                        f150974a = new C60403b();
                    }
                }
                bVar = f150974a;
            }
            return bVar;
        }
    }

    /* renamed from: a */
    public int mo206861a(boolean z, PrivacyCert privacyCert) {
        return TECameraServer.INSTANCE.disConnect(this, z, privacyCert);
    }

    /* renamed from: b */
    public int mo206862b() {
        return TECameraServer.INSTANCE.stopRecording(this);
    }

    /* renamed from: c */
    public int mo206863c() {
        return TECameraServer.INSTANCE.start(this);
    }

    /* renamed from: d */
    public int mo206864d() {
        return TECameraServer.INSTANCE.stop(this);
    }

    /* renamed from: a */
    public int mo206853a() {
        return TECameraServer.INSTANCE.startRecording(this);
    }

    /* renamed from: a */
    public static void m234739a(C60405k.AbstractC60406a aVar) {
        C60405k.m234763a(aVar);
    }

    /* renamed from: a */
    public static void m234740a(C60408m.AbstractC60409a aVar) {
        C60408m.m234767a(aVar);
    }

    /* renamed from: a */
    public int mo206856a(PrivacyCert privacyCert) {
        return TECameraServer.INSTANCE.disConnect(this, privacyCert);
    }

    /* renamed from: a */
    public int mo206859a(C60375c.C60376a aVar) {
        return TECameraServer.INSTANCE.addCameraProvider(this, aVar);
    }

    /* renamed from: a */
    public int mo206860a(C60420o oVar) {
        oVar.mo206899b();
        return TECameraServer.INSTANCE.focusAtPoint(this, oVar);
    }

    /* renamed from: a */
    public static void m234738a(byte b, C60427s.AbstractC60429b bVar) {
        C60427s.m234836a(bVar);
        C60427s.m234837a("VESDK", b);
    }

    public C60401j(AbstractC60402a aVar, AbstractC60404c cVar) {
        this.f150971b = aVar;
        this.f150972c = cVar;
    }

    /* renamed from: a */
    public int mo206854a(float f, TECameraSettings.AbstractC60306m mVar) {
        return TECameraServer.INSTANCE.zoomV2(this, f, mVar);
    }

    /* renamed from: a */
    public int mo206855a(int i, PrivacyCert privacyCert) {
        return TECameraServer.INSTANCE.switchCamera(this, i, privacyCert);
    }

    /* renamed from: a */
    public int mo206857a(TECameraSettings.AbstractC60306m mVar, boolean z) {
        return TECameraServer.INSTANCE.queryZoomAbility(this, mVar, z);
    }

    /* renamed from: a */
    public int mo206858a(TECameraSettings tECameraSettings, PrivacyCert privacyCert) {
        this.f150970a = tECameraSettings;
        return TECameraServer.INSTANCE.connect(this, this.f150971b, this.f150970a, this.f150972c, privacyCert);
    }
}
