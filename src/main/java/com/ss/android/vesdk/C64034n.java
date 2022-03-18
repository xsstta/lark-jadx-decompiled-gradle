package com.ss.android.vesdk;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Bundle;
import com.bytedance.bpea.basics.PrivacyCert;
import com.ss.android.medialib.log.C59401a;
import com.ss.android.ttve.editorInfo.C60192a;
import com.ss.android.ttve.monitor.C60217b;
import com.ss.android.ttve.monitor.C60227g;
import com.ss.android.ttve.monitor.C60229h;
import com.ss.android.ttve.nativePort.TELogcat;
import com.ss.android.ttvecamera.AbstractC60313b;
import com.ss.android.ttvecamera.C60401j;
import com.ss.android.ttvecamera.C60405k;
import com.ss.android.ttvecamera.C60408m;
import com.ss.android.ttvecamera.C60410n;
import com.ss.android.ttvecamera.C60420o;
import com.ss.android.ttvecamera.C60424p;
import com.ss.android.ttvecamera.C60427s;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.p3038g.AbstractC60370b;
import com.ss.android.ttvecamera.p3038g.C60375c;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESensService;
import com.ss.android.vesdk.p3187a.AbstractC63923a;
import com.ss.android.vesdk.p3189c.C63960a;
import com.ss.android.vesdk.p3189c.C63961b;
import com.ss.android.vesdk.p3189c.C63964c;
import com.ss.android.vesdk.p3189c.C63965d;
import com.ss.android.vesdk.p3190d.C63968a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.n */
public class C64034n implements TECameraSettings.AbstractC60304k, TECameraSettings.AbstractC60306m, C60401j.AbstractC60402a, AbstractC63923a {

    /* renamed from: a */
    public static final String f161683a = "n";

    /* renamed from: b */
    protected VECameraSettings f161684b;

    /* renamed from: c */
    protected TECameraSettings f161685c;

    /* renamed from: d */
    protected Context f161686d;

    /* renamed from: e */
    protected VESize f161687e = new VESize(1280, 720);

    /* renamed from: f */
    protected VESize f161688f = null;

    /* renamed from: g */
    protected VERecorder.AbstractC63896d f161689g;

    /* renamed from: h */
    protected VERecorder.AbstractC63903k f161690h;

    /* renamed from: i */
    protected VERecorder.AbstractC63902j f161691i;

    /* renamed from: j */
    protected VEListener.AbstractC63867j f161692j;

    /* renamed from: k */
    protected VEListener.AbstractC63882y f161693k;

    /* renamed from: l */
    public AtomicBoolean f161694l = new AtomicBoolean(false);

    /* renamed from: m */
    public C63961b f161695m;

    /* renamed from: n */
    public boolean f161696n;

    /* renamed from: o */
    public boolean f161697o = false;

    /* renamed from: p */
    public long f161698p = 0;

    /* renamed from: q */
    public C60401j.AbstractC60404c f161699q = new C60401j.AbstractC60404c() {
        /* class com.ss.android.vesdk.C64034n.C640439 */

        @Override // com.ss.android.ttvecamera.C60401j.AbstractC60404c
        /* renamed from: a */
        public TEFrameSizei mo206869a(List<TEFrameSizei> list, List<TEFrameSizei> list2) {
            if (C64034n.this.f161693k == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (TEFrameSizei tEFrameSizei : list) {
                arrayList.add(new VESize(tEFrameSizei.f150716a, tEFrameSizei.f150717b));
            }
            for (TEFrameSizei tEFrameSizei2 : list2) {
                arrayList2.add(new VESize(tEFrameSizei2.f150716a, tEFrameSizei2.f150717b));
            }
            VESize a = C64034n.this.f161693k.mo220864a(arrayList, arrayList2);
            if (a == null) {
                return null;
            }
            TEFrameSizei tEFrameSizei3 = new TEFrameSizei();
            tEFrameSizei3.f150716a = a.width;
            tEFrameSizei3.f150717b = a.height;
            return tEFrameSizei3;
        }
    };

    /* renamed from: r */
    public TECameraSettings.AbstractC60303j f161700r = new TECameraSettings.AbstractC60303j() {
        /* class com.ss.android.vesdk.C64034n.C640362 */
    };

    /* renamed from: s */
    private C63922a<C63961b> f161701s;

    /* renamed from: t */
    private C60401j f161702t = new C60401j(this, this.f161699q);

    /* renamed from: u */
    private int f161703u = -1;

    /* renamed from: v */
    private int f161704v = -1;

    /* renamed from: w */
    private boolean f161705w = true;

    /* renamed from: x */
    private final Object f161706x = new Object();

    /* renamed from: y */
    private AbstractC60370b.AbstractC60373a f161707y = new AbstractC60370b.AbstractC60374b() {
        /* class com.ss.android.vesdk.C64034n.C640428 */

        @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b.AbstractC60373a
        /* renamed from: a */
        public void mo206794a(SurfaceTexture surfaceTexture) {
            C63961b bVar = C64034n.this.f161695m;
            if (bVar != null && bVar.mo221326f() != null) {
                bVar.mo221326f().mo206794a(surfaceTexture);
            }
        }

        @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b.AbstractC60373a
        /* renamed from: a */
        public void mo206795a(TECameraFrame tECameraFrame) {
            C63961b bVar = C64034n.this.f161695m;
            if (C64034n.this.f161684b.mo220551p() == VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME && (C64034n.this.f161684b.mo220533a().ordinal() != tECameraFrame.mo206379j() || C64034n.this.f161697o || !C64034n.this.f161694l.get())) {
                String str = C64034n.f161683a;
                C63929ab.m250974a(str, "getCameraFacing:" + C64034n.this.f161684b.mo220533a().ordinal() + "  frameFacing:" + tECameraFrame.mo206379j() + " mSwitchCamera:" + C64034n.this.f161697o + " mIsConnected:" + C64034n.this.f161694l.get());
                if (C64034n.this.f161697o) {
                    C64034n.this.f161697o = false;
                }
            } else if (!(bVar == null || bVar.mo221326f() == null)) {
                bVar.f161522g = !C64034n.this.f161696n;
                bVar.mo221326f().mo206795a(tECameraFrame);
            }
            if (!C64034n.this.f161696n) {
                long currentTimeMillis = System.currentTimeMillis() - C64034n.this.f161698p;
                C60229h.m234090a(0, "te_record_camera_preview_first_frame_cost", currentTimeMillis);
                C60427s.m234838a("te_record_camera_preview_first_frame_cost", Long.valueOf(currentTimeMillis));
                VEListener.AbstractC63867j jVar = C64034n.this.f161692j;
                if (jVar != null) {
                    jVar.mo180960a(3, 0, "Camera first frame captured");
                }
                C64034n.this.f161696n = true;
                C63929ab.m250974a(C64034n.f161683a, "Camera first frame captured!!");
            }
        }
    };

    @Override // com.ss.android.vesdk.p3187a.AbstractC63924b
    /* renamed from: h */
    public VECameraSettings mo221146h() {
        return this.f161684b;
    }

    @Override // com.ss.android.vesdk.p3187a.AbstractC63924b
    /* renamed from: i */
    public VESize mo221147i() {
        return this.f161687e;
    }

    /* renamed from: a */
    public int mo221750a(boolean z, PrivacyCert privacyCert) {
        an.m251028a("close");
        this.f161694l.set(false);
        m251320l();
        int a = this.f161702t.mo206861a(!z, privacyCert);
        an.m251027a();
        return a;
    }

    /* renamed from: a */
    public void mo221752a(VERecorder.AbstractC63896d dVar) {
        this.f161689g = dVar;
    }

    @Override // com.ss.android.ttvecamera.TECameraSettings.AbstractC60306m
    /* renamed from: a */
    public boolean mo206537a() {
        VERecorder.AbstractC63896d dVar = this.f161689g;
        return dVar != null && dVar.mo120726a();
    }

    @Override // com.ss.android.ttvecamera.TECameraSettings.AbstractC60306m
    /* renamed from: a */
    public void mo206536a(int i, boolean z, boolean z2, float f, List<Integer> list) {
        VERecorder.AbstractC63896d dVar = this.f161689g;
        if (dVar != null) {
            dVar.mo120725a(i, z, z2, f, list);
        }
    }

    @Override // com.ss.android.ttvecamera.TECameraSettings.AbstractC60306m
    /* renamed from: a */
    public void mo206535a(int i, float f, boolean z) {
        VERecorder.AbstractC63896d dVar = this.f161689g;
        if (dVar != null) {
            dVar.mo120724a(i, f, z);
        }
    }

    @Override // com.ss.android.ttvecamera.TECameraSettings.AbstractC60304k
    /* renamed from: a */
    public void mo206533a(float f) {
        VERecorder.AbstractC63903k kVar = this.f161690h;
        if (kVar != null) {
            kVar.mo220941a(f);
        }
    }

    @Override // com.ss.android.vesdk.p3187a.AbstractC63924b
    /* renamed from: a */
    public void mo221145a(Bundle bundle) {
        String string = bundle.getString("record");
        String str = f161683a;
        C63929ab.m250974a(str, "setParamFromRecorder recordMessage = " + string);
        if (!string.isEmpty()) {
            string.hashCode();
            if (string.equals("stop_record")) {
                this.f161702t.mo206862b();
            } else if (string.equals("start_record")) {
                this.f161702t.mo206853a();
            }
        }
    }

    @Override // com.ss.android.ttvecamera.C60401j.AbstractC60402a
    /* renamed from: a */
    public void mo206868a(int i, String str) {
        VEListener.AbstractC63867j jVar = this.f161692j;
        if (jVar != null) {
            jVar.mo180961a(i, str);
        }
    }

    @Override // com.ss.android.ttvecamera.C60401j.AbstractC60402a
    /* renamed from: a */
    public void mo206867a(int i, int i2, String str) {
        VEListener.AbstractC63867j jVar = this.f161692j;
        if (jVar != null) {
            jVar.mo180960a(i != 3 ? i : 6, i2, str);
        }
        if (i == 0) {
            this.f161696n = false;
        } else if (i == 50 && str != null) {
            String[] split = str.split("x");
            if (split != null && split.length == 2) {
                TEFrameSizei tEFrameSizei = new TEFrameSizei(Integer.valueOf(split[0]).intValue(), Integer.valueOf(split[1]).intValue());
                C63961b bVar = this.f161695m;
                if (!(bVar == null || bVar.mo221326f() == null)) {
                    bVar.mo221326f().mo221329a(tEFrameSizei);
                }
                this.f161688f = new VESize(tEFrameSizei.f150717b, tEFrameSizei.f150716a);
            }
        } else if (i == 3 && i2 == 2) {
            this.f161698p = System.currentTimeMillis();
        } else if (i == 51) {
            this.f161704v = 1;
        } else if (i == 111) {
            m251319k();
        } else if (i == 110) {
            m251318j();
        }
        if (i == 104) {
            C60217b.m234045a("vesdk_event_will_change_flash_mode", m251314a(str, String.valueOf(System.currentTimeMillis()), ""), "behavior");
        }
        if (i == 105) {
            C60217b.m234045a("vesdk_event_did_change_flash_mode", m251314a(str, "", String.valueOf(System.currentTimeMillis())), "behavior");
        }
        if (i == 106) {
            C60217b.m234045a("vesdk_event_will_start_camera", m251314a(str, String.valueOf(System.currentTimeMillis()), ""), "behavior");
        }
        if (i == 107) {
            C60217b.m234045a("vesdk_event_did_start_camera", m251314a(str, "", String.valueOf(System.currentTimeMillis())), "behavior");
        }
        if (i == 108) {
            C60217b.m234045a("vesdk_event_will_stop_camera", m251314a(str, String.valueOf(System.currentTimeMillis()), ""), "behavior");
        }
        if (i == 109) {
            C60217b.m234045a("vesdk_event_did_stop_camera", m251314a(str, "", String.valueOf(System.currentTimeMillis())), "behavior");
        }
        if (i == 113) {
            m251315a("vesdk_event_camera_stablization");
        }
        if (i == 112) {
            m251315a("vesdk_event_camera_wide_angle");
        }
        if (i == 114) {
            m251315a("vesdk_event_camera_zoom");
        }
        if (i == 115) {
            m251315a("vesdk_event_camera_exposure_compensation");
        }
        if (i == 116) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("flashMode", i2);
                jSONObject.put("resultCode", 0);
                C60217b.m234045a("vesdk_event_camera_flash_mode", jSONObject, "behavior");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.ttvecamera.C60401j.AbstractC60402a
    /* renamed from: a */
    public void mo206866a(int i, int i2) {
        synchronized (this) {
            TECameraSettings tECameraSettings = this.f161685c;
            if (tECameraSettings != null) {
                this.f161684b.mo220534a(m251317b(tECameraSettings.f150676e));
                C60192a.m233970a("te_camera_api ", i == 2 ? "cameraAPI2" : i == 1 ? "cameraAPI1" : "Private API");
                if (tECameraSettings.f150687p != null) {
                    C60192a.m233970a("te_camera_texture_size ", "width = " + tECameraSettings.f150687p.f150716a + ", height = " + tECameraSettings.f150687p.f150717b);
                }
                if (tECameraSettings.f150686o != null) {
                    C60192a.m233970a("te_camera_preview_size ", "width = " + tECameraSettings.f150686o.f150716a + ", height = " + tECameraSettings.f150686o.f150717b);
                }
            }
        }
        VEListener.AbstractC63867j jVar = this.f161692j;
        if (i2 == 0) {
            mo221142c();
            if (this.f161705w) {
                this.f161705w = false;
            }
            if (jVar != null) {
                jVar.mo180958a();
                jVar.mo180960a(2, i, "Camera type: " + i);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cameraType", i);
                C60217b.m234045a("vesdk_event_camera_type", jSONObject, "performance");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (jVar != null) {
            jVar.mo180959a(i);
        }
    }

    @Override // com.ss.android.ttvecamera.C60401j.AbstractC60402a
    /* renamed from: a */
    public void mo206865a(int i) {
        VEListener.AbstractC63867j jVar = this.f161692j;
        if (jVar != null) {
            jVar.mo180960a(5, i, "Camera is closed!");
        }
    }

    @Override // com.ss.android.vesdk.p3187a.AbstractC63923a
    /* renamed from: b */
    public int mo221141b() {
        return mo221747a((PrivacyCert) null);
    }

    /* renamed from: e */
    public int mo221758e() {
        return mo221754b((PrivacyCert) null);
    }

    /* renamed from: g */
    public int mo221759g() {
        return mo221756c(null);
    }

    /* renamed from: d */
    public int mo221757d() {
        an.m251028a("stopPreview");
        int d = this.f161702t.mo206864d();
        an.m251027a();
        return d;
    }

    /* renamed from: j */
    private void m251318j() {
        VESensService.getInstance().setSensCheckObjStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_CAMERA), VESensService.PRIVACY_STATUS.PRIVACY_STATUS_RELEASE);
    }

    /* renamed from: k */
    private void m251319k() {
        VESensService.getInstance().setSensCheckObjStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_CAMERA), VESensService.PRIVACY_STATUS.PRIVACY_STATUS_USING);
    }

    /* renamed from: l */
    private void m251320l() {
        VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_CAMERA), VESensService.PRIVACY_STATUS.PRIVACY_STATUS_RELEASE);
    }

    /* renamed from: m */
    private void m251321m() {
        VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_CAMERA), VESensService.PRIVACY_STATUS.PRIVACY_STATUS_USING);
    }

    @Override // com.ss.android.vesdk.p3187a.AbstractC63923a
    /* renamed from: f */
    public void mo221143f() {
        an.m251028a("destroy");
        this.f161689g = null;
        this.f161700r = null;
        this.f161691i = null;
        this.f161692j = null;
        this.f161686d = null;
        this.f161699q = null;
        TECameraSettings tECameraSettings = this.f161685c;
        if (tECameraSettings != null) {
            tECameraSettings.mo206522b();
            this.f161685c = null;
        }
        C60401j.m234738a(C63929ab.m250968a(), (C60427s.AbstractC60429b) null);
        C60401j.m234739a((C60405k.AbstractC60406a) null);
        an.m251027a();
    }

    @Override // com.ss.android.vesdk.p3187a.AbstractC63923a
    /* renamed from: c */
    public int mo221142c() {
        int i;
        AbstractC60370b.AbstractC60373a aVar;
        C60375c.C60376a aVar2;
        C63922a<C63961b> aVar3 = this.f161701s;
        if (aVar3 == null || aVar3.mo221137b()) {
            C63929ab.m250980d(f161683a, "start with empty TECapturePipeline list");
            return -100;
        } else if (!this.f161694l.get()) {
            C63929ab.m250978c(f161683a, "startPreview when camera is closed!");
            return -105;
        } else {
            an.m251028a("startPreview");
            boolean equals = "landscape".equals(this.f161684b.mo220545j());
            boolean z = false;
            for (C63961b bVar : this.f161701s.mo221139c()) {
                if (bVar == null || !bVar.mo221321c()) {
                    C63929ab.m250978c(f161683a, "pipeline is not valid");
                } else {
                    if (bVar.mo221327g()) {
                        aVar = this.f161707y;
                        this.f161695m = bVar;
                    } else {
                        aVar = bVar.mo221326f();
                    }
                    if (bVar.mo221324d() == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Recorder) {
                        C63964c cVar = (C63964c) bVar;
                        if (this.f161704v == 1 && !this.f161705w) {
                            cVar.mo221319a().release();
                            cVar.mo221322a(new C63968a(cVar.mo221331i()));
                            if (this.f161704v == 1) {
                                this.f161704v = 0;
                            }
                        }
                        aVar2 = new C60375c.C60376a(cVar.mo221325e(), aVar, cVar.mo221327g(), cVar.mo221319a(), cVar.mo221331i(), cVar.mo221330b());
                    } else if (bVar.mo221324d() == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES) {
                        C63965d dVar = (C63965d) bVar;
                        if (this.f161704v == 1 && !this.f161705w) {
                            dVar.mo221319a().release();
                            C63968a aVar4 = new C63968a(dVar.mo221332b());
                            dVar.mo221322a(aVar4);
                            if (aVar != null) {
                                aVar.mo206794a(aVar4);
                            }
                            if (this.f161704v == 1) {
                                this.f161704v = 0;
                            }
                            C60427s.m234842b(f161683a, "NewSurfaceTexture...");
                        }
                        aVar2 = new C60375c.C60376a(dVar.mo221325e(), aVar, dVar.mo221327g(), dVar.mo221319a(), dVar.mo221332b());
                    } else {
                        C63960a aVar5 = (C63960a) bVar;
                        aVar2 = new C60375c.C60376a(aVar5.mo221325e(), aVar, aVar5.mo221327g(), aVar5.mo221319a(), aVar5.mo221324d(), aVar5.mo221320b());
                    }
                    this.f161702t.mo206859a(aVar2);
                    bVar.mo221323a(equals);
                    z = true;
                }
            }
            if (z) {
                i = this.f161702t.mo206863c();
            } else {
                i = -1;
            }
            an.m251027a();
            return i;
        }
    }

    /* renamed from: a */
    public void mo221751a(VEListener.AbstractC63867j jVar) {
        this.f161692j = jVar;
    }

    @Override // com.ss.android.vesdk.p3187a.AbstractC63923a
    /* renamed from: a */
    public int mo221140a(boolean z) {
        return mo221750a(z, (PrivacyCert) null);
    }

    /* renamed from: a */
    public int mo221749a(C64074t tVar) {
        return this.f161702t.mo206860a(m251316b(tVar));
    }

    /* renamed from: b */
    public int mo221753b(float f) {
        return this.f161702t.mo206854a(f, this);
    }

    /* renamed from: c */
    public int mo221756c(PrivacyCert privacyCert) {
        VECameraSettings.CAMERA_FACING_ID camera_facing_id;
        if (this.f161685c.f150676e == 0) {
            camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_FRONT;
        } else {
            camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_BACK;
        }
        return mo221748a(camera_facing_id, privacyCert);
    }

    /* renamed from: a */
    private void m251315a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultCode", 0);
            C60217b.m234045a(str, jSONObject, "behavior");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private VECameraSettings.CAMERA_FACING_ID m251317b(int i) {
        if (i == 0) {
            return VECameraSettings.CAMERA_FACING_ID.FACING_BACK;
        }
        if (i == 1) {
            return VECameraSettings.CAMERA_FACING_ID.FACING_FRONT;
        }
        if (i == 2) {
            return VECameraSettings.CAMERA_FACING_ID.FACING_WIDE_ANGLE;
        }
        if (i == 3) {
            return VECameraSettings.CAMERA_FACING_ID.FACING_TELEPHOTO;
        }
        return VECameraSettings.CAMERA_FACING_ID.FACING_BACK;
    }

    /* renamed from: b */
    public int mo221754b(PrivacyCert privacyCert) {
        an.m251028a("close");
        this.f161694l.set(false);
        m251320l();
        int a = this.f161702t.mo206856a(privacyCert);
        an.m251027a();
        return a;
    }

    /* renamed from: b */
    private C60420o m251316b(final C64074t tVar) {
        if (tVar == null) {
            return null;
        }
        C60420o oVar = new C60420o(tVar.mo221841b(), tVar.mo221842c(), tVar.mo221843d(), tVar.mo221844e(), tVar.mo221845f());
        oVar.mo206897a(tVar.mo221846g());
        oVar.mo206900b(tVar.mo221847h());
        oVar.mo206902c(tVar.mo221848i());
        oVar.mo206904d(tVar.mo221849j());
        if (tVar.mo221850k() != null) {
            oVar.mo206894a(new AbstractC60313b.AbstractC60314a() {
                /* class com.ss.android.vesdk.C64034n.C640395 */

                @Override // com.ss.android.ttvecamera.AbstractC60313b.AbstractC60314a
                /* renamed from: a */
                public List<Camera.Area> mo206564a(int i, int i2, int i3, int i4, int i5, boolean z) {
                    return tVar.mo221850k().mo221148a(i, i2, i3, i4, i5, z);
                }
            });
        }
        if (tVar.mo221851l() != null) {
            oVar.mo206895a(new AbstractC60313b.AbstractC60315b() {
                /* class com.ss.android.vesdk.C64034n.C640406 */

                @Override // com.ss.android.ttvecamera.AbstractC60313b.AbstractC60315b
                /* renamed from: a */
                public List<Camera.Area> mo206565a(int i, int i2, int i3, int i4, int i5, boolean z) {
                    return tVar.mo221851l().mo221149a(i, i2, i3, i4, i5, z);
                }
            });
        }
        if (tVar.mo221840a() != null) {
            oVar.mo206896a(new C60420o.AbstractC60422a() {
                /* class com.ss.android.vesdk.C64034n.C640417 */

                @Override // com.ss.android.ttvecamera.C60420o.AbstractC60422a
                /* renamed from: a */
                public void mo206916a(int i, int i2, String str) {
                    tVar.mo221840a().mo221854a(i, i2, str);
                }
            });
        }
        return oVar;
    }

    /* renamed from: a */
    public int mo221747a(PrivacyCert privacyCert) {
        TECameraSettings tECameraSettings = this.f161685c;
        if (tECameraSettings == null || this.f161684b == null) {
            C60427s.m234844d(f161683a, "mCameraParams == null, please init VECameraCapture!");
            return -105;
        } else if (tECameraSettings.f150686o.f150716a <= 0 || this.f161685c.f150686o.f150717b <= 0) {
            return -100;
        } else {
            if (!this.f161694l.get()) {
                C59401a.f147462a = System.currentTimeMillis();
            }
            this.f161694l.set(true);
            if (this.f161685c.f150674c != this.f161684b.mo220537c().ordinal()) {
                this.f161685c = m251313a(this.f161684b);
            }
            an.m251028a("open");
            m251321m();
            int a = this.f161702t.mo206858a(this.f161685c, privacyCert);
            an.m251027a();
            return a;
        }
    }

    /* renamed from: b */
    public int mo221755b(boolean z) {
        return this.f161702t.mo206857a(this, z);
    }

    /* renamed from: a */
    private TECameraSettings m251313a(VECameraSettings vECameraSettings) {
        boolean z;
        if (vECameraSettings == null) {
            return null;
        }
        TECameraSettings tECameraSettings = new TECameraSettings(this.f161686d);
        vECameraSettings.mo220517E();
        tECameraSettings.f150674c = vECameraSettings.mo220537c().ordinal();
        tECameraSettings.f150676e = vECameraSettings.mo220533a().ordinal();
        tECameraSettings.f150652F = vECameraSettings.mo220536b();
        tECameraSettings.f150647A = vECameraSettings.mo220544i().ordinal();
        tECameraSettings.f150686o.f150716a = vECameraSettings.mo220538d().height;
        tECameraSettings.f150686o.f150717b = vECameraSettings.mo220538d().width;
        tECameraSettings.f150656J = vECameraSettings.mo220543h();
        tECameraSettings.f150663Q = vECameraSettings.mo220552q();
        tECameraSettings.f150694w = vECameraSettings.mo220553r();
        tECameraSettings.f150690s = vECameraSettings.mo220550o();
        tECameraSettings.f150696y = vECameraSettings.mo220519G().ordinal();
        this.f161687e.width = tECameraSettings.f150686o.f150716a;
        this.f161687e.height = tECameraSettings.f150686o.f150717b;
        tECameraSettings.f150654H = vECameraSettings.mo220554s();
        tECameraSettings.f150680i = vECameraSettings.mo220555t();
        tECameraSettings.f150691t = vECameraSettings.mo220547l();
        tECameraSettings.f150692u = vECameraSettings.mo220549n();
        tECameraSettings.f150693v = vECameraSettings.mo220548m();
        tECameraSettings.f150657K = vECameraSettings.mo220520H().ordinal();
        tECameraSettings.f150648B = vECameraSettings.mo220513A();
        tECameraSettings.ab = vECameraSettings.mo220528P().ordinal();
        tECameraSettings.f150649C = vECameraSettings.mo220546k();
        C60410n.f150977a = tECameraSettings.f150649C;
        tECameraSettings.f150658L = vECameraSettings.mo220521I();
        tECameraSettings.f150659M = vECameraSettings.mo220522J();
        tECameraSettings.f150660N = vECameraSettings.mo220523K();
        tECameraSettings.f150661O = vECameraSettings.mo220524L();
        tECameraSettings.f150662P = vECameraSettings.mo220525M();
        tECameraSettings.f150665S = vECameraSettings.mo220526N();
        tECameraSettings.f150666T = vECameraSettings.mo220527O();
        tECameraSettings.f150667U = vECameraSettings.mo220541f();
        tECameraSettings.f150668V = vECameraSettings.mo220542g();
        tECameraSettings.f150681j = vECameraSettings.mo220556u();
        tECameraSettings.f150682k = vECameraSettings.mo220557v();
        tECameraSettings.f150684m = vECameraSettings.mo220558w();
        tECameraSettings.f150685n = vECameraSettings.mo220562z();
        tECameraSettings.f150683l = vECameraSettings.mo220518F();
        if (vECameraSettings.mo220537c() == VECameraSettings.CAMERA_TYPE.TYPE_GNOB_Unit) {
            tECameraSettings.f150648B.putBoolean("enable_video_stabilization", vECameraSettings.mo220552q());
        }
        if (vECameraSettings.mo220537c() == VECameraSettings.CAMERA_TYPE.TYPE_VENDOR_GNOB) {
            Bundle bundle = tECameraSettings.f150648B;
            if (vECameraSettings.mo220533a() == VECameraSettings.CAMERA_FACING_ID.FACING_BACK) {
                z = true;
            } else {
                z = false;
            }
            bundle.putBoolean("enable_video_stabilization", z);
        }
        if (vECameraSettings.mo220537c() == VECameraSettings.CAMERA_TYPE.TYPE_VENDOR_RDHW) {
            tECameraSettings.f150648B.putString("noise_reduce", "fast");
            tECameraSettings.f150648B.putBoolean("enable_video_hdr", true);
            if (vECameraSettings.mo220533a() == VECameraSettings.CAMERA_FACING_ID.FACING_FRONT) {
                tECameraSettings.f150648B.putBoolean("enable_video_stabilization", false);
            } else {
                tECameraSettings.f150648B.putBoolean("enable_video_stabilization", true);
            }
        }
        if (vECameraSettings.mo220529Q()) {
            tECameraSettings.ac = true;
        } else {
            tECameraSettings.ac = ((Boolean) VEConfigCenter.m250617a().mo220632a("ve_camera_enable_previewing_fallback", Boolean.valueOf(tECameraSettings.ac))).booleanValue();
        }
        String str = f161683a;
        C63929ab.m250976b(str, "camera previewing fallback enabled: " + tECameraSettings.ac);
        if (vECameraSettings.mo220530R()) {
            tECameraSettings.ad = true;
        } else {
            tECameraSettings.ad = ((Boolean) VEConfigCenter.m250617a().mo220632a("ve_enable_background_strategy", Boolean.valueOf(tECameraSettings.ad))).booleanValue();
        }
        C63929ab.m250974a(str, "KEY_ENABLE_BACKGROUND_STRATEGY : " + tECameraSettings.ad);
        if (vECameraSettings.mo220531S()) {
            tECameraSettings.ae = true;
        } else {
            tECameraSettings.ae = ((Boolean) VEConfigCenter.m250617a().mo220632a("ve_enable_open_camera1_optimize", (Object) false)).booleanValue();
        }
        C63929ab.m250974a(str, "enable open camera1 opt : " + tECameraSettings.ae);
        if (vECameraSettings.mo220532T()) {
            tECameraSettings.af = true;
        } else {
            tECameraSettings.af = ((Boolean) VEConfigCenter.m250617a().mo220632a("ve_enable_open_camera1_crs", (Object) false)).booleanValue();
        }
        C63929ab.m250974a(str, "enable open camera1 crs : " + tECameraSettings.af);
        tECameraSettings.f150669W = vECameraSettings.mo220514B();
        tECameraSettings.f150670X = vECameraSettings.mo220515C();
        tECameraSettings.f150671Y = vECameraSettings.mo220516D();
        int[] e = vECameraSettings.mo220540e();
        tECameraSettings.f150675d = new C60424p(e[0], e[1]);
        tECameraSettings.ah = vECameraSettings.mo220560x();
        tECameraSettings.f175458ai = vECameraSettings.mo220561y();
        tECameraSettings.f150648B.putBoolean("ve_enable_camera_devices_cache", ((Boolean) VEConfigCenter.m250617a().mo220632a("ve_enable_camera_devices_cache", (Object) false)).booleanValue());
        return tECameraSettings;
    }

    @Override // com.ss.android.vesdk.p3187a.AbstractC63924b
    /* renamed from: a */
    public int mo221144a(C63922a<C63961b> aVar) {
        this.f161701s = aVar;
        if (aVar == null || aVar.mo221137b()) {
            C63929ab.m250980d(f161683a, "start with empty TECapturePipeline list");
            return -100;
        }
        C63929ab.m250976b(f161683a, "start with TECapturePipeline list");
        an.m251028a("start");
        int c = mo221142c();
        an.m251027a();
        return c;
    }

    /* renamed from: a */
    public int mo221746a(Context context, VECameraSettings vECameraSettings) {
        an.m251028a("init");
        this.f161686d = context;
        this.f161684b = vECameraSettings;
        this.f161685c = m251313a(vECameraSettings);
        C60401j.m234738a(C63929ab.m250968a(), new C60427s.AbstractC60429b() {
            /* class com.ss.android.vesdk.C64034n.C640351 */

            @Override // com.ss.android.ttvecamera.C60427s.AbstractC60429b
            /* renamed from: a */
            public void mo206922a(byte b, String str, String str2) {
                TELogcat.Log(b, str, str2);
            }
        });
        C60401j.m234740a(new C60408m.AbstractC60409a() {
            /* class com.ss.android.vesdk.C64034n.C640373 */

            @Override // com.ss.android.ttvecamera.C60408m.AbstractC60409a
            /* renamed from: a */
            public void mo206871a(String str, double d) {
                C60229h.m234089a(0, str, d);
            }

            @Override // com.ss.android.ttvecamera.C60408m.AbstractC60409a
            /* renamed from: a */
            public void mo206872a(String str, long j) {
                C60229h.m234090a(0, str, j);
            }

            @Override // com.ss.android.ttvecamera.C60408m.AbstractC60409a
            /* renamed from: a */
            public void mo206873a(String str, String str2) {
                C60229h.m234091a(0, str, str2);
            }
        });
        C60401j.m234739a(new C60405k.AbstractC60406a() {
            /* class com.ss.android.vesdk.C64034n.C640384 */

            @Override // com.ss.android.ttvecamera.C60405k.AbstractC60406a
            /* renamed from: a */
            public void mo206870a(Throwable th) {
                C60227g.m234084a(th);
            }
        });
        an.m251027a();
        return 0;
    }

    /* renamed from: a */
    public int mo221748a(VECameraSettings.CAMERA_FACING_ID camera_facing_id, PrivacyCert privacyCert) {
        C59401a.f147463b = System.currentTimeMillis();
        if (!this.f161694l.get()) {
            C63929ab.m250980d(f161683a, "Camera server is not connected now!!");
            return -105;
        }
        int a = this.f161702t.mo206855a(camera_facing_id.ordinal(), privacyCert);
        this.f161697o = true;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("currentCamera", camera_facing_id.name());
            jSONObject.put("resultCode", a);
            C60217b.m234045a("vesdk_event_recorder_change_camera", jSONObject, "behavior");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return a;
    }

    /* renamed from: a */
    private JSONObject m251314a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldState", "");
            jSONObject.put("newState", "");
            jSONObject.put("error", str);
            jSONObject.put("startTime", str2);
            jSONObject.put("endTime", str3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
