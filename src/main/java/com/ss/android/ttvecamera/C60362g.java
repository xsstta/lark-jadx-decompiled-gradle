package com.ss.android.ttvecamera;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.util.Size;
import com.bytedance.bpea.basics.PrivacyCert;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.ttvecamera.AbstractC60396i;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.hardware.C60390e;
import com.ss.android.ttvecamera.p3032a.C60312b;
import com.ss.android.ttvecamera.p3033b.C60316a;
import com.ss.android.ttvecamera.p3033b.C60322b;
import com.ss.android.ttvecamera.p3035d.AbstractC60347b;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ttvecamera.g */
public class C60362g extends AbstractC60396i {

    /* renamed from: a */
    protected C60390e f150876a;

    /* renamed from: b */
    protected volatile int f150877b;

    /* renamed from: c */
    protected CameraCharacteristics f150878c;

    /* renamed from: d */
    protected CaptureRequest f150879d;

    /* renamed from: e */
    protected CameraManager f150880e;

    /* renamed from: f */
    protected volatile CameraDevice f150881f;

    /* renamed from: g */
    protected int f150882g = -1;

    /* renamed from: h */
    protected boolean f150883h = true;

    /* renamed from: i */
    protected AbstractC60347b f150884i;

    /* renamed from: j */
    protected boolean f150885j;

    /* renamed from: k */
    protected boolean f150886k;

    /* renamed from: l */
    protected ConditionVariable f150887l = new ConditionVariable();

    /* renamed from: m */
    protected CameraDevice.StateCallback f150888m = new CameraDevice.StateCallback() {
        /* class com.ss.android.ttvecamera.C60362g.C603631 */

        /* renamed from: a */
        C60364a<CameraDevice> f150889a;

        {
            this.f150889a = new C60364a<>(C60362g.this);
        }

        public void onClosed(CameraDevice cameraDevice) {
            if (C60362g.this.f150884i instanceof C60312b) {
                ((C60312b) C60362g.this.f150884i).mo206560a(cameraDevice, 4, -1);
            }
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            C60427s.m234839a("TECamera2", "onDisconnected: OpenCameraCallBack");
            if (C60362g.this.f150884i instanceof C60312b) {
                ((C60312b) C60362g.this.f150884i).mo206560a(cameraDevice, 1, -1);
            }
            C60362g.this.mo206753G();
            C60364a<CameraDevice> aVar = this.f150889a;
            if (aVar != null) {
                aVar.mo206774b(cameraDevice);
            }
        }

        public void onOpened(CameraDevice cameraDevice) {
            C60427s.m234839a("TECamera2", "onOpened: OpenCameraCallBack");
            C60362g.this.f150960q.mo206502b(ActivityIdentificationData.WALKING, 0, "did start camera2", null);
            if (C60362g.this.f150884i instanceof C60312b) {
                ((C60312b) C60362g.this.f150884i).mo206560a(cameraDevice, 0, -1);
            }
            C60362g.this.f150881f = cameraDevice;
            C60362g.this.f150884i.mo206696a(cameraDevice);
            C60362g.this.mo206753G();
            C60364a<CameraDevice> aVar = this.f150889a;
            if (aVar == null || !aVar.mo206772a(cameraDevice)) {
                cameraDevice.close();
                C60362g.this.f150960q.mo206502b(SmEvents.EVENT_NO, 0, "onOpened error closePrivacy", C60362g.this.f150881f);
                C60427s.m234843c("TECamera2", "onOpened: OpenCameraCallBack, some bad case occur, close camera!");
            } else if (C60362g.this.f150886k && C60362g.this.f150885j) {
                cameraDevice.close();
                C60362g.this.f150960q.mo206502b(SmEvents.EVENT_NO, 0, "close intent... closePrivacy", C60362g.this.f150881f);
                C60427s.m234843c("TECamera2", "onOpened: OpenCameraCallBack, but had camera close intent...");
                C60362g.this.f150885j = false;
            }
        }

        public void onError(CameraDevice cameraDevice, int i) {
            C60427s.m234839a("TECamera2", "onError: " + i);
            if (C60362g.this.f150884i instanceof C60312b) {
                ((C60312b) C60362g.this.f150884i).mo206560a(cameraDevice, 3, i);
            }
            C60362g.this.mo206753G();
            C60364a<CameraDevice> aVar = this.f150889a;
            if (aVar == null) {
                C60427s.m234844d("TECamera2", "had called onError");
                return;
            }
            aVar.mo206773a(cameraDevice, i);
            this.f150889a = null;
        }
    };

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206649a(TECameraSettings.AbstractC60306m mVar) {
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: e */
    public int mo206664e() {
        return 2;
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: p */
    public boolean mo206675p() {
        return true;
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: q */
    public boolean mo206676q() {
        return true;
    }

    /* renamed from: E */
    public int mo206751E() {
        return this.f150877b;
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206645a(Bundle bundle) {
        super.mo206645a(bundle);
        if (bundle != null) {
            Bundle bundle2 = (Bundle) this.f150953A.get(this.f150958o.f150651E);
            for (String str : bundle.keySet()) {
                if (TECameraSettings.C60301h.m234228a(str, bundle.get(str)) && "support_light_soft".equalsIgnoreCase(str)) {
                    bundle2.putBoolean("support_light_soft", bundle.getBoolean("support_light_soft"));
                }
            }
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206646a(PrivacyCert privacyCert) {
        super.mo206646a(privacyCert);
        if (this.f150881f != null) {
            C60385h.m234615a(privacyCert, this.f150881f);
            this.f150881f = null;
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206644a(int i, int i2, TECameraSettings.AbstractC60302i iVar) {
        AbstractC60347b bVar;
        if (this.f150877b == 1) {
            C60427s.m234842b("TECamera2", "Camera is opening, ignore takePicture operation.");
        } else if (this.f150877b == 2) {
            C60427s.m234842b("TECamera2", "Camera is opened, ignore takePicture operation.");
        } else if (!mo206766y() || (bVar = this.f150884i) == null) {
            C60427s.m234844d("TECamera2", "takePicture : camera is null.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "takePicture : camera is null.", this.f150881f);
        } else {
            bVar.mo206571a(i, i2, iVar);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206647a(TECameraSettings.AbstractC60302i iVar) {
        AbstractC60347b bVar;
        if (this.f150877b == 1) {
            C60427s.m234842b("TECamera2", "Camera is opening, ignore takePicture operation.");
        } else if (this.f150877b == 2) {
            C60427s.m234842b("TECamera2", "Camera is opened, ignore takePicture operation.");
        } else if (!mo206766y() || (bVar = this.f150884i) == null) {
            C60427s.m234844d("TECamera2", "takePicture : camera is null.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "takePicture : camera is null.", this.f150881f);
        } else {
            bVar.mo206573a(iVar, this.f150965v);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206651a(C60420o oVar) {
        AbstractC60347b bVar;
        C60427s.m234842b("TECamera2", "setFocusAreas...");
        if (this.f150877b == 1) {
            C60427s.m234842b("TECamera2", "Camera is opening, ignore setFocusAreas operation.");
            oVar.mo206893a().mo206916a(0, this.f150958o.f150676e, "Camera is opening, ignore setFocusAreas operation.");
        } else if (!mo206766y() || (bVar = this.f150884i) == null) {
            C60427s.m234844d("TECamera2", "focusAtPoint : camera is null.");
            oVar.mo206893a().mo206916a(-401, this.f150958o.f150676e, "focusAtPoint : camera is null.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "focusAtPoint : camera is null.", this.f150881f);
        } else {
            int a = bVar.mo206566a(oVar);
            if (a != 0) {
                this.f150960q.mo206502b(-411, a, "focusAtPoint : something wrong.", this.f150881f);
            }
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206652a(boolean z) {
        AbstractC60347b bVar;
        C60427s.m234839a("TECamera2", "setAutoExposureLock...");
        if (this.f150877b == 1) {
            C60427s.m234843c("TECamera2", "Camera is opening, ignore setAutoExposureLock operation.");
        } else if (!mo206766y() || (bVar = this.f150884i) == null || bVar.f150838m == null) {
            C60427s.m234844d("TECamera2", "setAutoExposureLock : camera is null.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "setAutoExposureLock : camera is null.", this.f150881f);
        } else if (Build.VERSION.SDK_INT < 23) {
            C60427s.m234843c("TECamera2", "Current camera doesn't support auto exposure lock.");
            this.f150960q.mo206502b(-426, -426, "Current camera doesn't support auto exposure lock.", this.f150881f);
        } else {
            Boolean bool = (Boolean) this.f150884i.f150838m.get(CameraCharacteristics.CONTROL_AE_LOCK_AVAILABLE);
            if (bool == null || !bool.booleanValue()) {
                C60427s.m234843c("TECamera2", "Current camera doesn't support auto exposure lock.");
                this.f150960q.mo206502b(-426, -426, "Current camera doesn't support auto exposure lock.", this.f150881f);
                return;
            }
            this.f150884i.mo206702b(z);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206653a(boolean z, String str) {
        AbstractC60347b bVar;
        C60427s.m234842b("TECamera2", "setWhileBalance: " + str);
        if (this.f150877b == 1) {
            C60427s.m234843c("TECamera2", "Camera is opening, ignore setWhileBalance operation.");
        } else if (!mo206766y() || (bVar = this.f150884i) == null) {
            C60427s.m234843c("TECamera2", "setWhileBalance : camera is null.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "setWhileBalance : camera is null.", this.f150881f);
        } else {
            bVar.mo206697a(z, str);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206755a(long j) {
        AbstractC60347b bVar;
        C60427s.m234842b("TECamera2", "setShutterTime : " + j);
        if (this.f150877b == 1) {
            C60427s.m234843c("TECamera2", "Camera is opening, ignore setShutterTime operation.");
        } else if (!mo206766y() || (bVar = this.f150884i) == null) {
            C60427s.m234843c("TECamera2", "setISO : camera is null.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "setISO : camera is null.", this.f150881f);
        } else {
            bVar.mo206694a(j);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206650a(TECameraSettings.AbstractC60306m mVar, boolean z) {
        AbstractC60347b bVar;
        if (!mo206766y() || (bVar = this.f150884i) == null || bVar.f150838m == null) {
            C60427s.m234844d("TECamera2", "queryZoomAbility: camera is null.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "queryZoomAbility: camera is null.", this.f150881f);
            return;
        }
        C60390e eVar = this.f150876a;
        if (eVar == null) {
            C60427s.m234844d("TECamera2", "DeviceProxy is null!");
            this.f150960q.mo206499a(this.f150958o.f150674c, -420, "", this.f150881f);
            return;
        }
        float a = eVar.mo206819a(this.f150884i.f150838m, this.f150958o.f150674c, this.f150958o.f150685n);
        this.f150967x = a;
        C60427s.m234842b("TECamera2", "zoom: " + a + ", factor = " + this.f150958o.f150685n);
        if (mVar != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf((int) (100.0f * a)));
            mVar.mo206536a(this.f150958o.f150674c, a > BitmapDescriptorFactory.HUE_RED, false, a, arrayList);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206648a(TECameraSettings.AbstractC60304k kVar) {
        AbstractC60347b bVar;
        if (!mo206766y() || (bVar = this.f150884i) == null || bVar.f150838m == null) {
            C60427s.m234844d("TECamera2", "queryShaderZoomStep: camera is null.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "queryShaderZoomStep: camera is null.", this.f150881f);
            return;
        }
        C60390e eVar = this.f150876a;
        if (eVar == null) {
            C60427s.m234844d("TECamera2", "DeviceProxy is null!");
            this.f150960q.mo206499a(this.f150958o.f150674c, -420, "", this.f150881f);
            return;
        }
        float a = eVar.mo206818a(this.f150884i.f150838m);
        if (kVar != null) {
            kVar.mo206533a(a);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: t */
    public int mo206762t() {
        return this.f150884i.bu_();
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: u */
    public int mo206763u() {
        return this.f150884i.bv_();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public boolean mo206766y() {
        if (this.f150881f != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: f */
    public int[] mo206665f() {
        AbstractC60347b bVar = this.f150884i;
        if (bVar == null) {
            return null;
        }
        return bVar.mo206717q();
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: g */
    public int[] mo206666g() {
        AbstractC60347b bVar = this.f150884i;
        if (bVar == null) {
            return null;
        }
        return bVar.bt_();
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: i */
    public int mo206668i() {
        AbstractC60347b bVar = this.f150884i;
        if (bVar == null) {
            return -1;
        }
        return bVar.mo206584k();
    }

    /* renamed from: U */
    private List<TEFrameSizei> m234474U() {
        return C60410n.m234783a(((StreamConfigurationMap) this.f150884i.f150838m.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class));
    }

    /* renamed from: V */
    private List<TEFrameSizei> m234475V() {
        return C60410n.m234783a(((StreamConfigurationMap) this.f150884i.f150838m.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(DynamicModule.f58006b));
    }

    /* renamed from: G */
    public void mo206753G() {
        if (this.f150958o.f150682k) {
            this.f150887l.open();
            C60427s.m234839a("TECamera2", "open camera-operation lock");
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: j */
    public int[] mo206669j() {
        AbstractC60347b bVar = this.f150884i;
        if (bVar != null) {
            return bVar.mo206578e();
        }
        C60427s.m234844d("TECamera2", "get picture size failed, no mode...");
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: s */
    public Bundle mo206678s() {
        Bundle s = super.mo206678s();
        s.putParcelableArrayList("support_preview_sizes", (ArrayList) m234474U());
        s.putParcelableArrayList("support_picture_sizes", (ArrayList) m234475V());
        return s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo206737v() {
        C60427s.m234839a("TECamera2", "create TEVideo2Mode");
        this.f150884i = new C60322b(this, this.f150962s, this.f150880e, this.f150961r);
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: B */
    public int mo206748B() {
        AbstractC60347b bVar;
        C60427s.m234842b("TECamera2", "getISO...");
        if (this.f150877b == 1) {
            C60427s.m234843c("TECamera2", "Camera is opening, ignore setISO operation.");
            return -1;
        } else if (mo206766y() && (bVar = this.f150884i) != null) {
            return bVar.mo206722v();
        } else {
            C60427s.m234843c("TECamera2", "getISO : camera is null.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "getISO : camera is null.", this.f150881f);
            return -1;
        }
    }

    /* renamed from: F */
    public void mo206752F() {
        if (this.f150958o.f150682k) {
            this.f150887l.close();
            C60427s.m234839a("TECamera2", "block camera-operation start...");
            boolean block = this.f150887l.block(1000);
            C60427s.m234839a("TECamera2", "block camera-operation end...result = " + block);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: b */
    public void mo206654b() {
        C60427s.m234842b("TECamera2", "stopCapture...");
        if (!mo206766y()) {
            C60427s.m234844d("TECamera2", "Device is not ready.");
            return;
        }
        if (this.f150877b != 3) {
            C60427s.m234844d("TECamera2", "Invalid state: " + this.f150877b);
        }
        mo206765x();
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: h */
    public int mo206667h() {
        int i;
        int a = C60410n.m234776a(this.f150962s);
        this.f150964u = this.f150965v;
        CameraCharacteristics cameraCharacteristics = this.f150878c;
        if (cameraCharacteristics != null) {
            i = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        } else {
            i = this.f150958o.f150677f;
        }
        if (this.f150964u == 1) {
            this.f150966w = (i + a) % 360;
            this.f150966w = ((360 - this.f150966w) + 180) % 360;
        } else {
            this.f150966w = ((i - a) + 360) % 360;
        }
        return this.f150966w;
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: l */
    public void mo206671l() {
        AbstractC60347b bVar;
        if (this.f150877b == 1) {
            C60427s.m234842b("TECamera2", "Camera is opening, ignore cancelAutoFocus operation.");
        } else if (!mo206766y() || (bVar = this.f150884i) == null) {
            C60427s.m234844d("TECamera2", "cancelFocus : camera is null.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "cancelFocus : camera is null.", this.f150881f);
        } else {
            bVar.mo206718r();
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: m */
    public void mo206672m() {
        AbstractC60347b bVar;
        if (this.f150877b == 1) {
            C60427s.m234842b("TECamera2", "Camera is opening, ignore cancelAutoFocus operation.");
        } else if (!mo206766y() || (bVar = this.f150884i) == null) {
            C60427s.m234844d("TECamera2", "enableCaf : camera is null.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "enableCaf : camera is null.", this.f150881f);
        } else {
            bVar.mo206719s();
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: n */
    public boolean mo206673n() {
        AbstractC60347b bVar;
        C60427s.m234839a("TECamera2", "isSupportedExposureCompensation...");
        if (this.f150877b == 1) {
            C60427s.m234843c("TECamera2", "Camera is opening, ignore setExposureCompensation operation.");
            return false;
        } else if (mo206766y() && (bVar = this.f150884i) != null && bVar.f150838m != null) {
            return this.f150958o.f150653G.mo206524a();
        } else {
            C60427s.m234844d("TECamera2", "isSupportedExposureCompensation : camera is null.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "isSupportedExposureCompensation : camera is null.", this.f150881f);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public int mo206765x() {
        AbstractC60347b bVar = this.f150884i;
        if (bVar == null) {
            this.f150960q.mo206499a(this.f150958o.f150674c, -425, "_stopCapture : mode is null", this.f150881f);
            return -1;
        }
        try {
            bVar.mo206583j();
            this.f150960q.mo206501b(2, 4, 0, "TECamera2 preview stoped", this.f150881f);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            this.f150960q.mo206499a(this.f150958o.f150674c, -425, "Error:_stopCapture : mode is null", this.f150881f);
            return -1;
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: z */
    public float mo206767z() {
        AbstractC60347b bVar;
        if (this.f150877b == 1) {
            C60427s.m234842b("TECamera2", "Camera is opening, ignore getManualFocusAbility operation.");
            return -1.0f;
        } else if (mo206766y() && (bVar = this.f150884i) != null) {
            return bVar.mo206720t();
        } else {
            C60427s.m234844d("TECamera2", "getManualFocusAbility : camera is null.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "getManualFocusAbility : camera is null.", this.f150881f);
            return -1.0f;
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: A */
    public int[] mo206747A() {
        AbstractC60347b bVar;
        C60427s.m234842b("TECamera2", "getISORange...");
        if (this.f150877b == 1) {
            C60427s.m234843c("TECamera2", "Camera is opening, ignore setWhileBalance operation.");
            return new int[]{-1, -1};
        } else if (mo206766y() && (bVar = this.f150884i) != null) {
            return bVar.mo206721u();
        } else {
            C60427s.m234843c("TECamera2", "setWhileBalance : camera is null.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "setWhileBalance : camera is null.", this.f150881f);
            return new int[]{-1, -1};
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: C */
    public long[] mo206749C() {
        AbstractC60347b bVar;
        C60427s.m234842b("TECamera2", "getShutterTimeRange...");
        if (this.f150877b == 1) {
            C60427s.m234843c("TECamera2", "Camera is opening, ignore getShutterTimeRange operation.");
            return new long[]{-1, -1};
        } else if (mo206766y() && (bVar = this.f150884i) != null) {
            return bVar.mo206723w();
        } else {
            C60427s.m234843c("TECamera2", "getShutterTimeRange : camera is null.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "getShutterTimeRange : camera is null.", this.f150881f);
            return new long[]{-1, -1};
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: D */
    public float[] mo206750D() {
        AbstractC60347b bVar;
        C60427s.m234842b("TECamera2", "getApertureRange...");
        if (this.f150877b == 1) {
            C60427s.m234843c("TECamera2", "Camera is opening, ignore getApertureRange operation.");
            return new float[]{-1.0f, -1.0f};
        } else if (mo206766y() && (bVar = this.f150884i) != null) {
            return bVar.mo206724x();
        } else {
            C60427s.m234843c("TECamera2", "getApertureRange : camera is null.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "getApertureRange : camera is null.", this.f150881f);
            return new float[]{-1.0f, -1.0f};
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: k */
    public float[] mo206670k() {
        AbstractC60347b bVar;
        C60427s.m234842b("TECamera2", "getVFOV...");
        if (this.f150877b == 1) {
            C60427s.m234842b("TECamera2", "Camera is opening, ignore getVFOV operation.");
            return new float[]{-2.0f, -2.0f};
        } else if (mo206766y() && (bVar = this.f150884i) != null) {
            return bVar.mo206725y();
        } else {
            C60427s.m234844d("TECamera2", "getFOV : camera is null.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "getFOV : camera is null.", this.f150881f);
            return new float[]{-2.0f, -2.0f};
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: o */
    public boolean mo206674o() {
        AbstractC60347b bVar;
        Boolean bool;
        C60427s.m234839a("TECamera2", "isAutoExposureLockSupported...");
        if (this.f150877b == 1) {
            C60427s.m234843c("TECamera2", "Camera is opening, ignore isAutoExposureLockSupported operation.");
            return false;
        } else if (!mo206766y() || (bVar = this.f150884i) == null || bVar.f150838m == null) {
            C60427s.m234844d("TECamera2", "isAutoExposureLockSupported : camera is null.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "isAutoExposureLockSupported : camera is null.", this.f150881f);
            return false;
        } else if (Build.VERSION.SDK_INT >= 23 && (bool = (Boolean) this.f150884i.f150838m.get(CameraCharacteristics.CONTROL_AE_LOCK_AVAILABLE)) != null) {
            return bool.booleanValue();
        } else {
            return false;
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: r */
    public boolean mo206677r() {
        AbstractC60347b bVar;
        if (!mo206766y() || (bVar = this.f150884i) == null || bVar.f150838m == null) {
            C60427s.m234843c("TECamera2", "Query torch info failed, you must open camera first.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "Query torch info failed, you must open camera first.", this.f150881f);
            return false;
        } else if (this.f150876a == null) {
            C60427s.m234844d("TECamera2", "DeviceProxy is null!");
            this.f150960q.mo206499a(this.f150958o.f150674c, -417, "", this.f150881f);
            return false;
        } else {
            Bundle bundle = mo206837K().get(this.f150958o.f150651E);
            if (bundle == null) {
                return false;
            }
            return bundle.getBoolean("camera_torch_supported", false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int mo206764w() {
        AbstractC60347b bVar = this.f150884i;
        if (bVar == null) {
            mo206846T();
            this.f150960q.mo206504c(this.f150958o.f150674c, -425, "_startCapture : mode is null", this.f150881f);
            return -1;
        }
        try {
            int b = bVar.mo206561b();
            if (b != 0) {
                mo206753G();
                this.f150960q.mo206504c(this.f150958o.f150674c, b, "_startCapture : something wrong", this.f150881f);
            }
            return b;
        } catch (Exception e) {
            mo206753G();
            e.printStackTrace();
            C60405k.m234764a(e);
            this.f150960q.mo206504c(this.f150958o.f150674c, -425, "_startCapture : mode is null", this.f150881f);
            return -1;
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206640a() {
        C60427s.m234839a("TECamera2", "Camera startCapture...");
        if (!mo206766y() || this.f150963t == null) {
            C60427s.m234844d("TECamera2", "Device is not ready.");
        } else if (this.f150877b == 2 || this.f150877b == 3) {
            try {
                this.f150958o.f150677f = mo206667h();
                C60427s.m234839a("TECamera2", "Camera rotation = " + this.f150958o.f150677f);
            } catch (Exception e) {
                C60405k.m234764a(e);
                mo206758d(this.f150955C);
                if (this.f150960q != null) {
                    this.f150960q.mo206498a(this.f150958o.f150674c, -425, (AbstractC60396i) null, this.f150881f);
                }
            }
            mo206764w();
        } else {
            C60427s.m234844d("TECamera2", "Invalid state: " + this.f150877b);
        }
    }

    /* renamed from: com.ss.android.ttvecamera.g$a */
    public static class C60364a<T> {

        /* renamed from: a */
        WeakReference<C60362g> f150891a;

        public C60364a(C60362g gVar) {
            this.f150891a = new WeakReference<>(gVar);
        }

        /* renamed from: a */
        public boolean mo206772a(T t) {
            C60427s.m234839a("TECamera2", "StateCallback::onOpened...");
            final C60362g gVar = this.f150891a.get();
            if (gVar == null) {
                return false;
            }
            gVar.f150958o.ah = false;
            gVar.mo206761g(2);
            RunnableC603651 r1 = new Runnable() {
                /* class com.ss.android.ttvecamera.C60362g.C60364a.RunnableC603651 */

                public void run() {
                    if (gVar.f150960q != null) {
                        gVar.f150960q.mo206498a(gVar.f150958o.f150674c, 0, (AbstractC60396i) null, gVar.f150881f);
                    } else {
                        C60427s.m234844d("TECamera2", "mCameraEvents is null!");
                    }
                }
            };
            if (gVar.f150958o.f150682k) {
                gVar.f150961r.post(r1);
            } else {
                r1.run();
            }
            gVar.f150883h = false;
            return true;
        }

        /* renamed from: b */
        public boolean mo206774b(T t) {
            C60427s.m234844d("TECamera2", "StateCallback::onDisconnected...");
            final C60362g gVar = this.f150891a.get();
            if (gVar == null) {
                return false;
            }
            if (gVar.f150958o.ah) {
                C60427s.m234844d("TECamera2", "StateCallback::onDisconnected...ignore reset...");
                gVar.f150958o.ah = false;
                return false;
            }
            RunnableC603662 r4 = new Runnable() {
                /* class com.ss.android.ttvecamera.C60362g.C60364a.RunnableC603662 */

                public void run() {
                    C60362g gVar = gVar;
                    gVar.mo206758d(gVar.f150955C);
                }
            };
            if (gVar.f150958o.f150682k) {
                gVar.f150961r.post(r4);
                return true;
            }
            r4.run();
            return true;
        }

        /* renamed from: a */
        public boolean mo206773a(T t, final int i) {
            C60427s.m234839a("TECamera2", "StateCallback::onError...");
            final C60362g gVar = this.f150891a.get();
            if (gVar == null) {
                return false;
            }
            RunnableC603673 r0 = new Runnable() {
                /* class com.ss.android.ttvecamera.C60362g.C60364a.RunnableC603673 */

                public void run() {
                    C60362g gVar = gVar;
                    gVar.mo206758d(gVar.f150955C);
                    if (gVar.f150960q != null) {
                        gVar.f150960q.mo206498a(gVar.f150958o.f150674c, i, (AbstractC60396i) null, gVar.f150881f);
                    }
                }
            };
            if (gVar.f150958o.f150682k) {
                gVar.f150961r.post(r0);
            } else {
                r0.run();
            }
            gVar.mo206761g(4);
            return true;
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206642a(int i) {
        super.mo206642a(i);
        AbstractC60347b bVar = this.f150884i;
        if (bVar == null) {
            C60427s.m234844d("TECamera2", "set scene failed, no mode...");
        } else {
            bVar.mo206575b(i);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: b */
    public void mo206657b(PrivacyCert privacyCert) {
        C60427s.m234842b("TECamera2", "close...");
        if (this.f150877b != 1) {
            mo206758d(privacyCert);
            AbstractC60347b bVar = this.f150884i;
            if (bVar != null) {
                bVar.mo206714n();
            }
        } else if (this.f150886k) {
            this.f150885j = true;
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206754a(float f) {
        AbstractC60347b bVar;
        if (this.f150877b == 1) {
            C60427s.m234842b("TECamera2", "Camera is opening, ignore setManualFocusDistance operation.");
        } else if (!mo206766y() || (bVar = this.f150884i) == null) {
            C60427s.m234844d("TECamera2", "setManualFocusDistance : camera is null.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "setManualFocusDistance : camera is null.", this.f150881f);
        } else {
            bVar.mo206693a(f);
        }
    }

    /* renamed from: g */
    public void mo206761g(int i) {
        if (this.f150877b == i) {
            C60427s.m234843c("TECamera2", "No need update state: " + i);
            return;
        }
        C60427s.m234839a("TECamera2", "[updateSessionState]: " + this.f150877b + " -> " + i);
        this.f150877b = i;
    }

    /* renamed from: b */
    private Map<String, Boolean> m234478b(String str) {
        HashMap hashMap = new HashMap();
        CameraManager cameraManager = this.f150880e;
        if (cameraManager != null) {
            try {
                String[] cameraIdList = cameraManager.getCameraIdList();
                for (String str2 : cameraIdList) {
                    hashMap.put(str2, false);
                    int[] iArr = (int[]) this.f150880e.getCameraCharacteristics(str2).get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                    if (iArr != null) {
                        int length = iArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            int i2 = iArr[i];
                            Integer b = TECameraSettings.C60297d.m234223b(str);
                            if (b != null && i2 == b.intValue()) {
                                hashMap.put(str2, true);
                                break;
                            }
                            i++;
                        }
                    }
                }
            } catch (CameraAccessException e) {
                C60427s.m234844d("TECamera2", "Could not initialize Camera Cache");
                e.printStackTrace();
            }
        }
        return hashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: c */
    public void mo206661c(boolean z) {
        AbstractC60347b bVar;
        C60427s.m234842b("TECamera2", "toggleTorch: " + z);
        if (this.f150877b == 1) {
            C60427s.m234844d("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -401. Reason: camera is opening, ignore toggleTorch operation");
            C60427s.m234842b("TECamera2", "Camera is opening, ignore toggleTorch operation.");
            this.f150960q.mo206505d(this.f150958o.f150674c, -401, z ? 1 : 0, "Camera is opening, ignore toggleTorch operation.", this.f150881f);
        } else if (!mo206766y() || (bVar = this.f150884i) == null) {
            C60427s.m234844d("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -401. Reason: camera is null");
            C60427s.m234843c("TECamera2", "Toggle torch failed, you must open camera first.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "Toggle torch failed, you must open camera first.", this.f150881f);
            this.f150960q.mo206505d(this.f150958o.f150674c, -401, z, "Toggle torch failed, you must open camera first.", this.f150881f);
        } else {
            bVar.mo206568a(z);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: d */
    public void mo206663d(int i) {
        int i2;
        AbstractC60347b bVar;
        int i3;
        C60427s.m234842b("TECamera2", "switchFlashMode: " + i);
        if (this.f150877b == 1) {
            C60427s.m234844d("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -401. Reason: camera is opening, ignore toggleTorch operation");
            C60427s.m234843c("TECamera2", "Camera is opening, ignore toggleTorch operation.");
            AbstractC60396i.AbstractC60397a aVar = this.f150960q;
            int i4 = this.f150958o.f150674c;
            if (i == 0) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            aVar.mo206505d(i4, -401, i3, "Camera is opening, ignore toggleTorch operation.", this.f150881f);
        } else if (!mo206766y() || (bVar = this.f150884i) == null) {
            C60427s.m234844d("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -401. Reason: camera is null");
            C60427s.m234844d("TECamera2", "switch flash mode  failed, you must open camera first.");
            AbstractC60396i.AbstractC60397a aVar2 = this.f150960q;
            int i5 = this.f150958o.f150674c;
            if (i == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            aVar2.mo206505d(i5, -401, i2, "switch flash mode  failed, you must open camera first.", this.f150881f);
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "switch flash mode  failed, you must open camera first.", this.f150881f);
        } else {
            bVar.mo206558a(i);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: f */
    public void mo206760f(int i) {
        AbstractC60347b bVar;
        C60427s.m234842b("TECamera2", "setISO : " + i);
        if (this.f150877b == 1) {
            C60427s.m234843c("TECamera2", "Camera is opening, ignore setISO operation.");
        } else if (!mo206766y() || (bVar = this.f150884i) == null) {
            C60427s.m234843c("TECamera2", "setISO : camera is null.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "setISO : camera is null.", this.f150881f);
        } else {
            bVar.mo206709d(i);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: b */
    public void mo206756b(float f) {
        AbstractC60347b bVar;
        C60427s.m234842b("TECamera2", "setAperture : " + f);
        if (this.f150877b == 1) {
            C60427s.m234843c("TECamera2", "Camera is opening, ignore setAperture operation.");
        } else if (!mo206766y() || (bVar = this.f150884i) == null) {
            C60427s.m234843c("TECamera2", "setAperture : camera is null.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "setAperture : camera is null.", this.f150881f);
        } else {
            bVar.mo206708d(f);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: c */
    public void mo206660c(int i) {
        AbstractC60347b bVar;
        C60427s.m234839a("TECamera2", "setExposureCompensation... value: " + i);
        if (this.f150877b == 1) {
            C60427s.m234843c("TECamera2", "Camera is opening, ignore setExposureCompensation operation.");
        } else if (!mo206766y() || (bVar = this.f150884i) == null || bVar.f150838m == null) {
            C60427s.m234844d("TECamera2", "setExposureCompensation : camera is null.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "setExposureCompensation : camera is null.", this.f150881f);
        } else if (!this.f150958o.f150653G.mo206524a()) {
            C60427s.m234843c("TECamera2", "Current camera doesn't support setting exposure compensation.");
            this.f150960q.mo206502b(-414, -414, "Current camera doesn't support setting exposure compensation.", this.f150881f);
        } else if (i > this.f150958o.f150653G.f150704a || i < this.f150958o.f150653G.f150706c) {
            String str = "Invalid exposure compensation value: " + i + ", it must between [" + this.f150958o.f150653G.f150706c + ", " + this.f150958o.f150653G.f150704a + "].";
            C60427s.m234843c("TECamera2", str);
            this.f150960q.mo206502b(-415, -415, str, this.f150881f);
        } else {
            this.f150884i.mo206711f(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo206758d(PrivacyCert privacyCert) {
        try {
            this.f150884i.mo206713m();
            this.f150884i.mo206583j();
            if (this.f150881f != null) {
                this.f150960q.mo206502b(108, 0, "will close camera2", null);
                C60385h.m234615a(privacyCert, this.f150881f);
                this.f150960q.mo206502b(SmEvents.EVENT_NR, 0, "did close camera2", null);
                this.f150960q.mo206502b(SmEvents.EVENT_NO, 0, "reset closePrivacy", null);
                this.f150881f = null;
                this.f150960q.mo206500a(2, this, this.f150881f);
            }
        } catch (Throwable th) {
            C60427s.m234844d("TECamera2", th.getMessage());
        }
        mo206761g(0);
        this.f150878c = null;
        this.f150879d = null;
        this.f150955C = null;
        if (this.f150884i != null && this.f150958o.f150696y == 2) {
            ((C60312b) this.f150884i).mo206557a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo206759e(int i) {
        Handler handler;
        if (this.f150884i != null) {
            mo206765x();
            if (i == 0) {
                mo206737v();
            } else if (i == 1) {
                C60316a aVar = new C60316a(this, this.f150962s, this.f150880e, this.f150961r);
                this.f150884i = aVar;
                aVar.mo206695a(this.f150969z);
            } else {
                this.f150884i = new C60312b(this, this.f150962s, this.f150880e, this.f150961r);
            }
            if (this.f150958o.f150682k) {
                handler = this.f150884i.mo206685A();
            } else {
                handler = this.f150961r;
            }
            AbstractC60347b bVar = this.f150884i;
            if (bVar instanceof C60312b) {
                ((C60312b) bVar).mo206559a(this.f150962s, handler);
            }
            try {
                this.f150958o.f150651E = this.f150884i.mo206705c(this.f150958o.f150676e);
                if (this.f150958o.f150651E == null || this.f150884i.mo206567a(this.f150958o.f150651E, this.f150958o.f150647A) != 0) {
                    return;
                }
            } catch (CameraAccessException e) {
                e.printStackTrace();
            }
            this.f150884i.mo206696a(this.f150881f);
            mo206764w();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo206757c(PrivacyCert privacyCert) throws Exception {
        Handler handler;
        int i;
        if (this.f150880e == null) {
            CameraManager cameraManager = (CameraManager) this.f150962s.getSystemService("camera");
            this.f150880e = cameraManager;
            if (cameraManager == null) {
                return -401;
            }
        }
        if (this.f150958o.f150696y == 0) {
            mo206737v();
        } else if (this.f150958o.f150696y == 1) {
            C60316a aVar = new C60316a(this, this.f150962s, this.f150880e, this.f150961r);
            this.f150884i = aVar;
            aVar.mo206695a(this.f150969z);
        } else {
            this.f150884i = new C60312b(this, this.f150962s, this.f150880e, this.f150961r);
            this.f150960q.mo206502b(117, 0, "enable arcore", this.f150881f);
        }
        if (this.f150958o.f150682k) {
            handler = this.f150884i.mo206685A();
        } else {
            handler = this.f150961r;
        }
        AbstractC60347b bVar = this.f150884i;
        if (bVar instanceof C60312b) {
            ((C60312b) bVar).mo206559a(this.f150962s, handler);
        }
        this.f150958o.f150651E = this.f150884i.mo206705c(this.f150958o.f150676e);
        if (this.f150958o.f150651E == null) {
            C60427s.m234844d("TECamera2", "Invalid CameraID");
            return -401;
        }
        AbstractC60347b bVar2 = this.f150884i;
        String str = this.f150958o.f150651E;
        if (this.f150883h) {
            i = this.f150958o.f150647A;
        } else {
            i = 0;
        }
        int a = bVar2.mo206567a(str, i);
        if (a != 0) {
            return a;
        }
        mo206678s();
        m234477a(this.f150958o.f150674c, this.f150880e);
        for (String str2 : TECameraSettings.C60297d.m234222a()) {
            Map<String, Boolean> b = m234478b(str2);
            Boolean bool = b.get(this.f150958o.f150651E);
            if (bool != null) {
                mo206847a(this.f150958o.f150651E).putBoolean(str2, bool.booleanValue());
            }
            if (str2.equals("support_depth_output")) {
                C60408m.m234770a("te_record_camera_depth_capacity", b.toString());
            }
        }
        this.f150960q.mo206502b(1, 0, "TECamera2 features is ready", this.f150881f);
        if (this.f150958o.f150682k) {
            try {
                this.f150881f = null;
                C60385h.m234616a(privacyCert, this.f150880e, this.f150958o.f150651E, this.f150888m, handler);
                this.f150960q.mo206502b(SmEvents.EVENT_NT, 0, "use sync mode openPrivacy", this.f150881f);
                if (this.f150881f == null) {
                    mo206752F();
                }
            } catch (CameraAccessException e) {
                e.printStackTrace();
                mo206753G();
                return e.getReason();
            }
        } else {
            try {
                this.f150960q.mo206502b(106, 0, "will start camera2", null);
                C60385h.m234616a(privacyCert, this.f150880e, this.f150958o.f150651E, this.f150888m, handler);
                this.f150960q.mo206502b(SmEvents.EVENT_NT, 0, "normal openPrivacy", null);
            } catch (CameraAccessException e2) {
                e2.printStackTrace();
                return e2.getReason();
            }
        }
        return 0;
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: b */
    public void mo206656b(int i) {
        if (this.f150877b != 3) {
            C60427s.m234843c("TECamera2", "Invalid state: " + this.f150877b);
            return;
        }
        mo206759e(i);
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: b */
    public void mo206658b(boolean z) {
        AbstractC60347b bVar;
        C60427s.m234839a("TECamera2", "setAutoFocusLock...");
        if (this.f150877b == 1) {
            C60427s.m234843c("TECamera2", "Camera is opening, ignore setAutoFocusLock operation.");
        } else if (!mo206766y() || (bVar = this.f150884i) == null || bVar.f150838m == null) {
            C60427s.m234844d("TECamera2", "setAutoFocusLock : camera is null.");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "setAutoFocusLock : camera is null.", this.f150881f);
        } else if (Build.VERSION.SDK_INT < 21) {
            C60427s.m234843c("TECamera2", "Current camera doesn't support auto focus lock.");
            this.f150960q.mo206502b(-433, -433, "Current camera doesn't support auto focus lock.", this.f150881f);
        } else {
            this.f150884i.mo206706c(z);
        }
    }

    /* renamed from: a */
    private void m234477a(int i, CameraManager cameraManager) {
        C60390e eVar = this.f150876a;
        if (eVar != null) {
            eVar.mo206816a(this.f150958o.f150674c, this.f150880e);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public int mo206638a(TECameraSettings tECameraSettings, PrivacyCert privacyCert) {
        super.mo206638a(tECameraSettings, privacyCert);
        this.f150955C = privacyCert;
        this.f150958o = tECameraSettings;
        if (this.f150877b == 4) {
            mo206758d(privacyCert);
        }
        try {
            mo206761g(1);
            int c = mo206757c(privacyCert);
            this.f150965v = tECameraSettings.f150676e;
            C60427s.m234839a("TECamera2", "open: camera face = " + this.f150965v);
            if (c != 0) {
                mo206761g(0);
                mo206758d(privacyCert);
                if (this.f150960q != null) {
                    this.f150960q.mo206498a(tECameraSettings.f150674c, c, (AbstractC60396i) null, this.f150881f);
                }
                return -1;
            }
            this.f150886k = tECameraSettings.f150659M;
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            this.f150877b = 4;
            mo206758d(privacyCert);
            if (this.f150960q != null) {
                this.f150960q.mo206498a(tECameraSettings.f150674c, -401, (AbstractC60396i) null, this.f150881f);
            }
            return -1;
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public TEFrameSizei mo206639a(float f, TEFrameSizei tEFrameSizei) {
        if (this.f150877b == 0 || this.f150877b == 1) {
            C60427s.m234844d("TECamera2", "Camera is not opened, ignore getBestPreviewSize operation.");
            return null;
        }
        Size[] outputSizes = ((StreamConfigurationMap) this.f150884i.f150838m.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        if (tEFrameSizei != null) {
            return C60410n.m234778a(arrayList, tEFrameSizei);
        }
        return C60410n.m234777a(arrayList, f);
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: b */
    public void mo206655b(float f, TECameraSettings.AbstractC60306m mVar) {
        AbstractC60347b bVar;
        if (this.f150877b != 3) {
            C60427s.m234844d("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: session is not running");
            this.f150960q.mo206499a(this.f150958o.f150674c, -420, "Invalid state, state = " + this.f150877b, this.f150881f);
        } else if (!mo206766y() || (bVar = this.f150884i) == null) {
            C60427s.m234844d("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -401. Reason: camera is null");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "zoomV2 : Camera is null.", this.f150881f);
        } else {
            bVar.mo206700b(f, mVar);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206641a(float f, TECameraSettings.AbstractC60306m mVar) {
        AbstractC60347b bVar;
        if (this.f150877b != 3) {
            C60427s.m234844d("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: session is not running");
            this.f150960q.mo206502b(-420, -420, "Invalid state, state = " + this.f150877b, this.f150881f);
        } else if (!mo206766y() || (bVar = this.f150884i) == null) {
            C60427s.m234844d("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -401. Reason: camera is null");
            this.f150960q.mo206499a(this.f150958o.f150674c, -401, "startZoom : Camera is null.", this.f150881f);
        } else {
            bVar.mo206689a(f, mVar);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206643a(int i, int i2) {
        AbstractC60347b bVar = this.f150884i;
        if (bVar == null) {
            C60427s.m234844d("TECamera2", "set picture size failed, no mode...");
        } else {
            bVar.mo206570a(i, i2);
        }
    }

    public C60362g(int i, Context context, AbstractC60396i.AbstractC60397a aVar, Handler handler, AbstractC60396i.AbstractC60399c cVar) {
        super(context, aVar, handler, cVar);
        this.f150958o = new TECameraSettings(context, i);
        this.f150876a = C60390e.m234633a(context, i);
    }

    /* renamed from: a */
    public static C60362g m234476a(int i, Context context, AbstractC60396i.AbstractC60397a aVar, Handler handler, AbstractC60396i.AbstractC60399c cVar) {
        if (i == 3 && Build.VERSION.SDK_INT >= 24) {
            return C60433t.m234857a(i, context, aVar, handler, cVar);
        }
        if (i == 4) {
            return C60425q.m234832a(i, context, aVar, handler, cVar);
        }
        if (i == 6) {
            return C60323c.m234293a(i, context, aVar, handler, cVar);
        }
        if (i == 7) {
            return C60426r.m234833a(i, context, aVar, handler, cVar);
        }
        if (i != 8 || Build.VERSION.SDK_INT < 21) {
            return new C60362g(i, context, aVar, handler, cVar);
        }
        return C60434u.m234858a(i, context, aVar, handler, cVar);
    }
}
