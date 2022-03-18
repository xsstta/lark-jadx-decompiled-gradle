package com.ss.android.ttvecamera;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import com.bytedance.bpea.basics.PrivacyCert;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.ttvecamera.AbstractC60396i;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.p3034c.C60329c;
import com.ss.android.ttvecamera.p3038g.C60368a;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.d */
public class C60339d extends AbstractC60396i {

    /* renamed from: a */
    Camera f150790a;

    /* renamed from: b */
    public Camera.Parameters f150791b;

    /* renamed from: c */
    public boolean f150792c = false;

    /* renamed from: d */
    private C60329c f150793d;

    /* renamed from: e */
    private String f150794e = "";

    /* renamed from: f */
    private int f150795f;

    /* renamed from: g */
    private List<TEFrameSizei> f150796g = new ArrayList();

    /* renamed from: h */
    private List<TEFrameSizei> f150797h = new ArrayList();

    /* renamed from: i */
    private List<TEFrameSizei> f150798i = new ArrayList();

    /* renamed from: j */
    private List<Integer> f150799j = null;

    /* renamed from: k */
    private float f150800k = 100.0f;

    /* renamed from: l */
    private AtomicBoolean f150801l = new AtomicBoolean(false);

    /* renamed from: m */
    private long f150802m = 0;

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: e */
    public int mo206664e() {
        return 1;
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206646a(PrivacyCert privacyCert) {
        super.mo206646a(privacyCert);
        try {
            Camera camera = this.f150790a;
            if (camera != null) {
                C60359f.m234459a(privacyCert, camera);
                this.f150790a = null;
            }
        } catch (Exception unused) {
            C60427s.m234844d("TECamera1", "force close camera failed");
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206647a(final TECameraSettings.AbstractC60302i iVar) {
        C60427s.m234839a("TECamera1", "takePicture...");
        if (this.f150790a == null) {
            C60427s.m234844d("TECamera1", "takePicture: camera is null.");
            this.f150960q.mo206499a(1, -401, "takePicture: camera is null.", this.f150790a);
            return;
        }
        try {
            this.f150959p = false;
            C60427s.m234839a("TECamera1", "takePicture size: " + this.f150958o.f150687p.toString());
            final long currentTimeMillis = System.currentTimeMillis();
            this.f150790a.takePicture(null, null, new Camera.PictureCallback() {
                /* class com.ss.android.ttvecamera.C60339d.C603423 */

                public void onPictureTaken(byte[] bArr, Camera camera) {
                    int i;
                    C60427s.m234839a("TECamera1", "capture data arrive consume: " + (System.currentTimeMillis() - currentTimeMillis));
                    if (C60339d.this.f150790a != null) {
                        C60339d.this.f150790a.stopPreview();
                    }
                    if (iVar != null) {
                        TECameraFrame.ETEPixelFormat eTEPixelFormat = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_JPEG;
                        int i2 = C60339d.this.f150791b.getPictureSize().width;
                        int i3 = C60339d.this.f150791b.getPictureSize().height;
                        if (C60339d.this.f150965v == 1) {
                            i = 270;
                        } else {
                            i = 90;
                        }
                        iVar.mo206531a(new TECameraFrame(bArr, eTEPixelFormat, i2, i3, i), C60339d.this);
                    }
                }
            });
        } catch (Exception e) {
            C60405k.m234764a(e);
            if (iVar != null) {
                iVar.mo206532a(mo206848a(e, IByteRtcError.BRERR_INVALID_TOKEN));
            }
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206651a(final C60420o oVar) {
        Camera camera = this.f150790a;
        if (camera == null) {
            C60427s.m234844d("TECamera1", "focusAtPoint: camera is null.");
            oVar.mo206893a().mo206916a(-401, this.f150958o.f150676e, "focusAtPoint: camera is null.");
            this.f150960q.mo206499a(1, -401, "focusAtPoint: camera is null.", this.f150790a);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f150791b = parameters;
            if (!this.f150793d.mo206619a(parameters, this.f150794e)) {
                C60427s.m234844d("TECamera1", "Error: not support focus.");
                this.f150960q.mo206502b(-412, -412, "Error: not support focus.", this.f150790a);
                if (!this.f150793d.mo206617a(this.f150958o.f150676e, this.f150791b) || !oVar.mo206910j()) {
                    oVar.mo206893a().mo206916a(-412, this.f150958o.f150676e, "Error: not support focus.");
                    return;
                }
                if (oVar.mo206914n() != null) {
                    this.f150791b.setMeteringAreas(oVar.mo206914n().mo206565a(oVar.mo206903d(), oVar.mo206905e(), oVar.mo206906f(), oVar.mo206907g(), this.f150958o.f150677f, this.f150958o.f150676e == 1));
                } else {
                    this.f150791b.setMeteringAreas(this.f150793d.mo206620b(oVar.mo206903d(), oVar.mo206905e(), oVar.mo206908h(), oVar.mo206906f(), oVar.mo206907g(), this.f150958o.f150677f));
                }
                this.f150790a.setParameters(this.f150791b);
                return;
            }
            if (oVar.mo206910j() && this.f150793d.mo206617a(this.f150958o.f150676e, this.f150791b)) {
                if (oVar.mo206914n() != null) {
                    this.f150791b.setMeteringAreas(oVar.mo206914n().mo206565a(oVar.mo206903d(), oVar.mo206905e(), oVar.mo206906f(), oVar.mo206907g(), this.f150958o.f150677f, this.f150958o.f150676e == 1));
                } else {
                    this.f150791b.setMeteringAreas(this.f150793d.mo206620b(oVar.mo206903d(), oVar.mo206905e(), oVar.mo206908h(), oVar.mo206906f(), oVar.mo206907g(), this.f150958o.f150677f));
                }
            }
            if (oVar.mo206909i()) {
                if (oVar.mo206913m() != null) {
                    this.f150791b.setFocusAreas(oVar.mo206913m().mo206564a(oVar.mo206903d(), oVar.mo206905e(), oVar.mo206906f(), oVar.mo206907g(), this.f150958o.f150677f, this.f150958o.f150676e == 1));
                } else {
                    this.f150791b.setFocusAreas(this.f150793d.mo206616a(oVar.mo206903d(), oVar.mo206905e(), oVar.mo206908h(), oVar.mo206906f(), oVar.mo206907g(), this.f150958o.f150677f));
                }
                this.f150790a.cancelAutoFocus();
                this.f150791b.setFocusMode("auto");
                this.f150790a.setParameters(this.f150791b);
                this.f150790a.autoFocus(new Camera.AutoFocusCallback() {
                    /* class com.ss.android.ttvecamera.C60339d.C603434 */

                    public void onAutoFocus(boolean z, Camera camera) {
                        String str;
                        if (z) {
                            str = "Camera Focus Succeed!";
                            oVar.mo206893a().mo206916a(oVar.mo206901c(), C60339d.this.f150958o.f150676e, str);
                        } else {
                            str = "Camera Focus Failed!";
                            oVar.mo206893a().mo206916a(-1, C60339d.this.f150958o.f150676e, str);
                        }
                        C60427s.m234839a("TECamera1", str);
                        if (!oVar.mo206911k() || !z) {
                            try {
                                Camera.Parameters parameters = camera.getParameters();
                                parameters.setFocusMode("continuous-video");
                                camera.setParameters(parameters);
                                if (C60339d.this.f150792c) {
                                    C60339d.this.mo206659c();
                                }
                            } catch (Exception e) {
                                String str2 = "Error: focusAtPoint failed: " + e.toString();
                                C60427s.m234844d("TECamera1", str2);
                                C60339d.this.f150960q.mo206499a(1, -411, str2, C60339d.this.f150790a);
                            }
                        }
                    }
                });
                return;
            }
            this.f150790a.setParameters(this.f150791b);
            C60427s.m234839a("TECamera1", "focus is not enable!");
        } catch (Exception e) {
            String str = "Error: focusAtPoint failed: " + e.toString();
            C60427s.m234844d("TECamera1", str);
            oVar.mo206893a().mo206916a(-411, this.f150958o.f150676e, str);
            this.f150960q.mo206499a(1, -411, str, this.f150790a);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206652a(boolean z) {
        C60427s.m234839a("TECamera1", "setAutoExposureLock...");
        if (this.f150790a == null || this.f150791b == null || !this.f150959p) {
            this.f150960q.mo206499a(1, -401, "setAutoExposureLock failed. ： Camera is null.", this.f150790a);
        } else if (!this.f150791b.isAutoExposureLockSupported()) {
            C60427s.m234843c("TECamera1", "Current camera doesn't support ae lock.");
            this.f150960q.mo206502b(-426, -426, "Current camera doesn't support ae lock.", this.f150790a);
        } else {
            try {
                this.f150791b.setAutoExposureLock(z);
                this.f150790a.setParameters(this.f150791b);
            } catch (Exception e) {
                String str = "Error: setAutoExposureLock failed: " + e.toString();
                C60427s.m234844d("TECamera1", str);
                this.f150960q.mo206502b(-427, -427, str, this.f150790a);
            }
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206653a(boolean z, String str) {
        if (this.f150790a == null || !this.f150959p) {
            C60427s.m234844d("TECamera1", "setWhileBalance : Camera is null!");
            this.f150960q.mo206499a(1, -401, "setWhileBalance : Camera is null!", this.f150790a);
            return;
        }
        try {
            Camera.Parameters parameters = this.f150790a.getParameters();
            this.f150791b = parameters;
            List<String> supportedWhiteBalance = parameters.getSupportedWhiteBalance();
            if (supportedWhiteBalance == null || !supportedWhiteBalance.contains(str)) {
                String str2 = "SupportWBList has no value: " + str;
                C60427s.m234844d("TECamera1", str2);
                this.f150960q.mo206499a(1, -424, str2, this.f150790a);
                return;
            }
            this.f150791b.setWhiteBalance(str);
            this.f150790a.setParameters(this.f150791b);
        } catch (Exception e) {
            String str3 = "Set WhileBalance failed: " + e.toString();
            C60427s.m234844d("TECamera1", str3);
            this.f150960q.mo206499a(1, -424, str3, this.f150790a);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206650a(TECameraSettings.AbstractC60306m mVar, boolean z) {
        if (mVar == null) {
            C60427s.m234844d("TECamera1", "ZoomCallback is null, do nothing!");
            return;
        }
        Camera camera = this.f150790a;
        if (camera == null) {
            C60427s.m234844d("TECamera1", "queryZoomAbility : Camera is null!");
            this.f150960q.mo206499a(1, -401, "queryZoomAbility : Camera is null!", this.f150790a);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f150967x = (float) parameters.getMaxZoom();
            if (z) {
                mVar.mo206536a(1, parameters.isZoomSupported(), parameters.isSmoothZoomSupported(), ((float) this.f150799j.get((int) this.f150967x).intValue()) / 100.0f, parameters.getZoomRatios());
                return;
            }
            mVar.mo206536a(1, parameters.isZoomSupported(), parameters.isSmoothZoomSupported(), (float) parameters.getMaxZoom(), parameters.getZoomRatios());
        } catch (Exception e) {
            String str = "Query zoom ability failed : " + e.toString();
            C60427s.m234844d("TECamera1", str);
            this.f150960q.mo206499a(1, -420, str, this.f150790a);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206648a(TECameraSettings.AbstractC60304k kVar) {
        if (kVar == null) {
            C60427s.m234844d("TECamera1", "ShaderZoomCallback is null, do nothing!");
            return;
        }
        Camera camera = this.f150790a;
        if (camera == null) {
            C60427s.m234844d("TECamera1", "queryShaderZoomStep : Camera is null!");
            this.f150960q.mo206499a(1, -401, "queryShaderZoomStep : Camera is null!", this.f150790a);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters != null && parameters.isZoomSupported()) {
                int maxZoom = parameters.getMaxZoom();
                if (maxZoom > 99) {
                    maxZoom = 99;
                }
                List<Integer> zoomRatios = parameters.getZoomRatios();
                if (maxZoom <= 0) {
                    kVar.mo206533a(BitmapDescriptorFactory.HUE_RED);
                } else {
                    kVar.mo206533a(((float) Math.pow((double) ((((float) (zoomRatios.get(1).intValue() - zoomRatios.get(0).intValue())) / 100.0f) + 1.0f), 0.5d)) - 1.0f);
                }
            }
        } catch (Exception e) {
            String str = "Query shader zoom step failed : " + e.toString();
            C60427s.m234844d("TECamera1", str);
            this.f150960q.mo206499a(1, -420, str, this.f150790a);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206649a(TECameraSettings.AbstractC60306m mVar) {
        Camera camera = this.f150790a;
        if (camera == null) {
            C60427s.m234844d("TECamera1", "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -401. Reason: mCameraDevice is null");
            C60427s.m234844d("TECamera1", "stopZoom : Camera is null!");
            this.f150960q.mo206499a(1, -401, "stopZoom : Camera is null!", this.f150790a);
            return;
        }
        try {
            if (camera.getParameters().isSmoothZoomSupported() && mVar != null && mVar.mo206537a()) {
                this.f150790a.stopSmoothZoom();
            }
        } catch (Exception e) {
            C60427s.m234844d("TECamera1", "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -420. Reason: " + e);
            String str = "Stop zoom failed : " + e.toString();
            C60427s.m234844d("TECamera1", str);
            this.f150960q.mo206499a(1, -420, str, this.f150790a);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: l */
    public void mo206671l() {
        C60427s.m234842b("TECamera1", "cancelFocus...");
        Camera camera = this.f150790a;
        if (camera != null) {
            try {
                camera.cancelAutoFocus();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: E */
    private List<TEFrameSizei> m234338E() {
        Camera.Parameters parameters = this.f150791b;
        if (parameters == null) {
            this.f150797h.clear();
            return this.f150797h;
        }
        List<TEFrameSizei> a = m234341a(parameters.getSupportedPictureSizes());
        this.f150797h = a;
        return a;
    }

    /* renamed from: F */
    private List<TEFrameSizei> m234339F() {
        Camera.Parameters parameters = this.f150791b;
        if (parameters == null) {
            this.f150798i.clear();
            return this.f150798i;
        }
        List<TEFrameSizei> a = m234341a(parameters.getSupportedVideoSizes());
        this.f150798i = a;
        return a;
    }

    /* renamed from: v */
    private void m234344v() {
        if (this.f150958o.f150668V) {
            try {
                this.f150791b.setRecordingHint(false);
                this.f150790a.setParameters(this.f150791b);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: w */
    private void m234345w() {
        if (this.f150958o.f150668V) {
            try {
                this.f150791b.setRecordingHint(true);
                this.f150790a.setParameters(this.f150791b);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: y */
    private List<TEFrameSizei> m234347y() {
        Camera.Parameters parameters = this.f150791b;
        if (parameters == null) {
            this.f150796g.clear();
            return this.f150796g;
        }
        List<TEFrameSizei> a = m234341a(parameters.getSupportedPreviewSizes());
        this.f150796g = a;
        return a;
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: d */
    public void mo206662d() {
        Camera camera;
        if (this.f150959p && (camera = this.f150790a) != null) {
            try {
                camera.stopFaceDetection();
            } catch (Exception unused) {
                C60427s.m234844d("TECamera1", "camera stop face detect failed");
            }
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: g */
    public int[] mo206666g() {
        Camera camera = this.f150790a;
        if (camera == null) {
            return null;
        }
        try {
            Camera.Size previewSize = camera.getParameters().getPreviewSize();
            return new int[]{previewSize.width, previewSize.height};
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: n */
    public boolean mo206673n() {
        C60427s.m234839a("TECamera1", "isSupportedExposureCompensation...");
        if (this.f150790a == null || this.f150791b == null || !this.f150959p) {
            return false;
        }
        return this.f150958o.f150653G.mo206524a();
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: o */
    public boolean mo206674o() {
        C60427s.m234839a("TECamera1", "isAutoExposureLockSupported...");
        if (this.f150790a == null || this.f150791b == null || !this.f150959p) {
            return false;
        }
        return this.f150791b.isAutoExposureLockSupported();
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: r */
    public boolean mo206677r() {
        Bundle bundle = mo206837K().get(this.f150958o.f150651E);
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("camera_torch_supported", false);
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: c */
    public void mo206659c() {
        C60427s.m234842b("TECamera1", "Camera start face detect");
        if (this.f150959p && this.f150790a != null && this.f150791b.getMaxNumDetectedFaces() > 0) {
            try {
                this.f150790a.startFaceDetection();
            } catch (Exception unused) {
                C60427s.m234844d("TECamera1", "camera start face detect failed");
            }
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: f */
    public int[] mo206665f() {
        Camera camera = this.f150790a;
        if (camera == null) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            camera.getParameters().getPreviewFpsRange(iArr);
            iArr[0] = iArr[0] / 1000;
            iArr[1] = iArr[1] / 1000;
            return iArr;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int[] mo206669j() {
        /*
            r4 = this;
            android.hardware.Camera r0 = r4.f150790a
            r1 = 0
            if (r0 == 0) goto L_0x0012
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch:{ Exception -> 0x000e }
            android.hardware.Camera$Size r0 = r0.getPictureSize()     // Catch:{ Exception -> 0x000e }
            goto L_0x0013
        L_0x000e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0012:
            r0 = r1
        L_0x0013:
            if (r0 != 0) goto L_0x0016
            return r1
        L_0x0016:
            r1 = 2
            int[] r1 = new int[r1]
            r2 = 0
            int r3 = r0.width
            r1[r2] = r3
            r2 = 1
            int r0 = r0.height
            r1[r2] = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.C60339d.mo206669j():int[]");
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: p */
    public boolean mo206675p() {
        C60427s.m234839a("TECamera1", "isAutoFocusLockSupported...");
        if (this.f150790a == null || this.f150791b == null || !this.f150959p) {
            this.f150960q.mo206499a(1, -401, "setAutoFocusLock failed. ： Camera is null.", this.f150790a);
            return false;
        }
        try {
            if (this.f150791b.getSupportedFocusModes().contains("fixed")) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            this.f150960q.mo206502b(-433, -433, "isAutoFocusLockSupported failed", this.f150790a);
            return false;
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: b */
    public void mo206654b() {
        C60427s.m234842b("TECamera1", "Camera stopPreview...");
        if (this.f150959p && this.f150790a != null) {
            this.f150959p = false;
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.f150790a.stopPreview();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                C60408m.m234769a("te_record_camera1_stop_preview_cost", currentTimeMillis2);
                C60427s.m234838a("te_record_camera1_stop_preview_cost", Long.valueOf(currentTimeMillis2));
            } catch (Exception e) {
                C60427s.m234844d("TECamera1", "camera stopcapture failed: " + e.getMessage());
            }
            this.f150802m = 0;
            C60427s.m234839a("TECamera1", "Camera preview stopped!");
            this.f150960q.mo206501b(1, 4, 0, "TECamera1 preview stoped", this.f150790a);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: h */
    public int mo206667h() {
        int a = C60410n.m234776a(this.f150962s);
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.f150964u = this.f150965v;
        try {
            Camera.getCameraInfo(this.f150958o.f150678g, cameraInfo);
            if (this.f150964u == 1) {
                this.f150966w = (cameraInfo.orientation + a) % 360;
                this.f150966w = ((360 - this.f150966w) + 180) % 360;
            } else {
                this.f150966w = ((cameraInfo.orientation - a) + 360) % 360;
            }
            return this.f150966w;
        } catch (Exception e) {
            AbstractC60396i.AbstractC60397a aVar = this.f150960q;
            aVar.mo206499a(1, -425, "getFrameOrientation :" + e.getMessage(), this.f150790a);
            return 0;
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: i */
    public int mo206668i() {
        Camera camera = this.f150790a;
        if (camera != null) {
            String str = null;
            try {
                str = camera.getParameters().getFlashMode();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if ("on".equals(str)) {
                return 1;
            }
            if ("auto".equals(str)) {
                return 3;
            }
            if ("off".equals(str)) {
                return 0;
            }
            if ("torch".equals(str)) {
                return 2;
            }
            if ("red-eye".equals(str)) {
                return 4;
            }
        }
        return -1;
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: k */
    public float[] mo206670k() {
        float[] fArr = new float[2];
        Camera camera = this.f150790a;
        if (camera == null) {
            C60427s.m234844d("TECamera1", "getFOV: camera device is null.");
            this.f150960q.mo206499a(1, -401, "getFOV: camera device is null.", this.f150790a);
            return new float[]{-2.0f, -2.0f};
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f150791b = parameters;
            fArr[0] = parameters.getVerticalViewAngle();
            fArr[1] = this.f150791b.getHorizontalViewAngle();
            C60427s.m234842b("TECamera1", "Camera1:verticalFOV = " + fArr[0] + ",horizontalFOV = " + fArr[1]);
            return fArr;
        } catch (Exception e) {
            e.printStackTrace();
            return new float[]{-2.0f, -2.0f};
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: m */
    public void mo206672m() {
        if (this.f150790a != null && this.f150791b != null) {
            C60427s.m234842b("TECamera1", "enableCaf...");
            try {
                if (this.f150791b.getSupportedFocusModes().contains("continuous-video")) {
                    this.f150790a.cancelAutoFocus();
                    this.f150791b.setFocusMode("continuous-video");
                    this.f150790a.setParameters(this.f150791b);
                }
            } catch (Throwable th) {
                String str = "Error: focusAtPoint failed: " + th.toString();
                C60427s.m234844d("TECamera1", str);
                this.f150960q.mo206499a(1, -411, str, this.f150790a);
            }
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: q */
    public boolean mo206676q() {
        try {
            Camera camera = this.f150790a;
            if (camera == null || camera.getParameters() == null || this.f150790a.getParameters().getSupportedWhiteBalance() == null || !this.f150790a.getParameters().isAutoWhiteBalanceLockSupported()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C60427s.m234844d("TECamera1", "Unsupported whileBalance!: " + e.toString());
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: s */
    public Bundle mo206678s() {
        boolean z;
        TECameraSettings tECameraSettings = this.f150958o;
        tECameraSettings.f150651E = this.f150958o.f150676e + "";
        Bundle s = super.mo206678s();
        s.putParcelableArrayList("support_preview_sizes", (ArrayList) m234347y());
        s.putParcelableArrayList("support_picture_sizes", (ArrayList) m234338E());
        s.putParcelableArrayList("support_video_sizes", (ArrayList) m234339F());
        s.putParcelable("camera_preview_size", this.f150958o.f150686o);
        try {
            Camera camera = this.f150790a;
            if (camera == null || camera.getParameters() == null || this.f150790a.getParameters().getSupportedFlashModes() == null) {
                z = false;
            } else {
                z = true;
            }
            s.putBoolean("camera_torch_supported", z);
        } catch (Exception e) {
            C60427s.m234844d("TECamera1", "Get camera torch information failed: " + e.toString());
            s.putBoolean("camera_torch_supported", false);
        }
        return s;
    }

    /* renamed from: x */
    private int m234346x() {
        String str;
        TEFrameSizei tEFrameSizei;
        Camera camera = this.f150790a;
        if (camera == null) {
            C60427s.m234844d("TECamera1", "initCamera: Camera is not opened!");
            this.f150960q.mo206499a(1, -401, "initCamera: Camera is not opened!", this.f150790a);
            return -401;
        }
        Camera.Parameters parameters = camera.getParameters();
        this.f150791b = parameters;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        int[] a = C60410n.m234789a(this.f150958o.f150657K, this.f150958o.f150676e, this.f150958o.f150675d.mo206918a(C60424p.m234829a(supportedPreviewFpsRange)), supportedPreviewFpsRange);
        if (a == null && supportedPreviewFpsRange.size() > 0) {
            a = supportedPreviewFpsRange.get(supportedPreviewFpsRange.size() - 1);
        }
        C60427s.m234839a("TECamera1", "Selected FPS Range: " + a[0] + "," + a[1]);
        this.f150958o.f150686o = C60410n.m234778a(m234347y(), this.f150958o.f150686o);
        StringBuilder sb = new StringBuilder();
        sb.append("Preview Size:");
        sb.append(this.f150958o.f150686o);
        C60427s.m234839a("TECamera1", sb.toString());
        this.f150791b.setPictureFormat(DynamicModule.f58006b);
        this.f150791b.setJpegQuality(100);
        if (this.f150958o.f150694w) {
            this.f150958o.f150687p = C60410n.m234779a(m234341a(this.f150791b.getSupportedPictureSizes()), this.f150958o.mo206521a(), this.f150958o.f150690s);
        } else {
            if (this.f150969z != null) {
                tEFrameSizei = this.f150969z.mo206508a(m234341a(this.f150791b.getSupportedPictureSizes()), m234341a(this.f150791b.getSupportedPreviewSizes()));
            } else {
                tEFrameSizei = null;
            }
            if (tEFrameSizei != null) {
                this.f150958o.f150687p = tEFrameSizei;
            } else {
                this.f150958o.f150687p = C60410n.m234780a(m234338E(), this.f150958o.f150686o, this.f150958o.f150687p);
            }
        }
        if (this.f150958o.f150687p != null) {
            this.f150791b.setPictureSize(this.f150958o.f150687p.f150716a, this.f150958o.f150687p.f150717b);
            C60427s.m234839a("TECamera1", "Picture Size:" + this.f150958o.f150687p);
        } else {
            C60427s.m234844d("TECamera1", "No closest supported picture size");
        }
        this.f150791b.setPreviewSize(this.f150958o.f150686o.f150716a, this.f150958o.f150686o.f150717b);
        if (this.f150958o.f150648B == null || !this.f150958o.f150648B.getBoolean("enable_dim_light_quality") || a[0] <= a[1]) {
            this.f150791b.setPreviewFpsRange(a[0], a[1]);
            if (this.f150958o.f150658L) {
                C60427s.m234842b("TECamera1", "use setRecordingHint");
                this.f150791b.setRecordingHint(true);
            }
        }
        this.f150791b.setWhiteBalance("auto");
        this.f150791b.setSceneMode("auto");
        this.f150791b.setPreviewFormat(this.f150958o.f150679h);
        this.f150790a.setParameters(this.f150791b);
        if (this.f150958o.f150663Q && Build.VERSION.SDK_INT >= 15) {
            if (this.f150791b.isVideoStabilizationSupported()) {
                this.f150791b.setVideoStabilization(true);
                C60408m.m234769a("te_record_camera_stabilization", 1L);
                this.f150960q.mo206502b(SmEvents.EVENT_RE, 1, "", this.f150790a);
            } else {
                C60408m.m234769a("te_record_camera_stabilization", 0L);
            }
        }
        String a2 = this.f150793d.mo206615a(this.f150958o.f150676e, this.f150791b, this.f150958o.f150648B.getBoolean("enableFrontFacingVideoContinueFocus"));
        this.f150794e = a2;
        if (a2 != "") {
            this.f150791b.setFocusMode(a2);
        } else {
            C60427s.m234843c("TECamera1", "No Supported Focus Mode for Facing" + this.f150958o.f150676e);
        }
        this.f150958o.f150653G.f150704a = this.f150791b.getMaxExposureCompensation();
        this.f150958o.f150653G.f150706c = this.f150791b.getMinExposureCompensation();
        this.f150958o.f150653G.f150707d = this.f150791b.getExposureCompensationStep();
        this.f150958o.f150653G.f150705b = this.f150791b.getExposureCompensation();
        if (this.f150958o.f150680i) {
            String str2 = this.f150791b.get("zsl-values");
            if ("off".equals(this.f150791b.get("zsl")) && str2 != null && str2.contains("on")) {
                this.f150791b.set("zsl", "on");
            }
            this.f150957n = "on".equals(this.f150791b.get("zsl"));
            if (!this.f150957n && this.f150958o.f150680i && TextUtils.isEmpty(str2) && C60355e.m234454a() && C60355e.m234455b()) {
                String str3 = this.f150791b.get("zsd-mode-values");
                if ("off".equals(this.f150791b.get("zsd-mode")) && str3 != null && str3.contains("on")) {
                    this.f150791b.set("zsd-mode", "on");
                }
                this.f150957n = "on".equals(this.f150791b.get("zsd-mode"));
            }
        }
        Object[] objArr = new Object[1];
        if (this.f150957n) {
            str = "Enable";
        } else {
            str = "Disable";
        }
        objArr[0] = str;
        C60427s.m234839a("TECamera1", String.format("%s zsl", objArr));
        this.f150799j = null;
        if (this.f150791b.isZoomSupported()) {
            List<Integer> zoomRatios = this.f150791b.getZoomRatios();
            this.f150799j = zoomRatios;
            Collections.sort(zoomRatios);
            this.f150800k = 100.0f;
        } else {
            C60427s.m234844d("TECamera1", "camera don't support zoom");
        }
        if (this.f150958o.f150648B.containsKey("enableShutterSound") && Build.VERSION.SDK_INT >= 17) {
            try {
                this.f150790a.enableShutterSound(this.f150958o.f150648B.getBoolean("enableShutterSound"));
            } catch (Exception e) {
                C60427s.m234844d("TECamera1", "unsupport enableShutterSound, " + e.getMessage());
            }
        }
        this.f150790a.setParameters(this.f150791b);
        try {
            this.f150790a.setDisplayOrientation(0);
        } catch (Throwable unused) {
        }
        return 0;
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206640a() {
        C60427s.m234839a("TECamera1", "Camera startPreview...");
        if (this.f150959p) {
            C60427s.m234843c("TECamera1", "Camera is previewing...");
        } else if (this.f150790a != null) {
            try {
                if (this.f150963t != null) {
                    Camera.Parameters parameters = this.f150790a.getParameters();
                    this.f150791b = parameters;
                    int a = this.f150963t.mo206797a(m234341a(parameters.getSupportedPreviewSizes()), this.f150958o.f150686o);
                    if (a != 0) {
                        C60427s.m234844d("TECamera1", "Init provider failed, ret = " + a);
                        return;
                    }
                    if (this.f150963t.mo206801c() == 1) {
                        if (this.f150963t.mo206804f() != null) {
                            this.f150790a.setPreviewTexture(this.f150963t.mo206804f());
                        } else {
                            C60427s.m234844d("TECamera1", "SurfaceTexture is null");
                            throw new AndroidRuntimeException("SurfaceTexture is null");
                        }
                    } else if (this.f150963t.mo206801c() == 4) {
                        C60368a aVar = (C60368a) this.f150963t.mo206800b();
                        if (aVar == null) {
                            throw new AndroidRuntimeException("Provider is null");
                        } else if (this.f150963t.mo206804f() != null) {
                            if (this.f150801l.compareAndSet(false, true)) {
                                for (byte[] bArr : aVar.mo206781a(3)) {
                                    this.f150790a.addCallbackBuffer(bArr);
                                }
                            }
                            this.f150790a.setPreviewCallbackWithBuffer(aVar.mo206784d());
                            this.f150790a.setPreviewTexture(this.f150963t.mo206804f());
                        } else {
                            C60427s.m234844d("TECamera1", "SurfaceTexture is null");
                            throw new AndroidRuntimeException("SurfaceTexture is null");
                        }
                    } else {
                        C60427s.m234844d("TECamera1", "Unsupported camera provider type : " + this.f150963t.mo206801c());
                        return;
                    }
                    TEFrameSizei g = this.f150963t.mo206805g();
                    if (g != null) {
                        if (!(this.f150791b.getPreviewSize().width == g.f150716a && this.f150791b.getPreviewSize().height == g.f150717b)) {
                            this.f150791b.setPreviewSize(g.f150716a, g.f150717b);
                            if (this.f150958o.f150694w) {
                                if (!this.f150958o.f150695x) {
                                    this.f150958o.f150687p = C60410n.m234779a(m234341a(this.f150791b.getSupportedPictureSizes()), g, this.f150958o.f150690s);
                                } else {
                                    this.f150958o.f150695x = false;
                                }
                                this.f150791b.setPictureSize(this.f150958o.f150687p.f150716a, this.f150958o.f150687p.f150717b);
                            }
                            this.f150790a.setParameters(this.f150791b);
                        }
                        this.f150960q.mo206502b(50, 0, g.toString(), this.f150790a);
                    }
                    if (this.f150958o.f150695x) {
                        this.f150958o.f150695x = false;
                        this.f150791b.setPictureSize(this.f150958o.f150687p.f150716a, this.f150958o.f150687p.f150717b);
                        this.f150790a.setParameters(this.f150791b);
                        C60427s.m234839a("TECamera1", "force set picture size: " + this.f150958o.f150687p.f150716a + "x" + this.f150958o.f150687p.f150717b);
                    }
                    this.f150790a.setErrorCallback(new Camera.ErrorCallback() {
                        /* class com.ss.android.ttvecamera.C60339d.C603401 */

                        public void onError(int i, Camera camera) {
                            String str;
                            C60408m.m234769a("te_record_camera_err_ret", (long) i);
                            if (i == 100) {
                                str = "Camera server died!";
                            } else if (Build.VERSION.SDK_INT >= 23 && i == 2) {
                                str = "Camera disconnected: " + i;
                            } else if (i == 1) {
                                str = "Camera unknown error: " + i;
                            } else {
                                C60427s.m234843c("TECamera1", "Ignore camera error here: " + i);
                                return;
                            }
                            C60427s.m234844d("TECamera1", str);
                            C60339d dVar = C60339d.this;
                            dVar.mo206657b(dVar.f150955C);
                            C60339d.this.mo206846T();
                            if (i == 2) {
                                AbstractC60396i.AbstractC60397a aVar = C60339d.this.f150960q;
                                C60339d dVar2 = C60339d.this;
                                aVar.mo206500a(1, dVar2, dVar2.f150790a);
                                return;
                            }
                            C60339d.this.f150960q.mo206504c(1, -425, str, C60339d.this.f150790a);
                        }
                    });
                    this.f150958o.f150677f = mo206667h();
                    C60427s.m234842b("TECamera1", "Camera rotation = " + this.f150958o.f150677f);
                    long currentTimeMillis = System.currentTimeMillis();
                    C60427s.m234839a("TECamera1", "Camera startPreview start");
                    this.f150790a.startPreview();
                    C60427s.m234839a("TECamera1", "Camera startPreview end");
                    boolean z = this.f150958o.f150648B.getBoolean("useCameraFaceDetect");
                    this.f150792c = z;
                    if (z) {
                        mo206659c();
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    this.f150802m = currentTimeMillis2;
                    long j = currentTimeMillis2 - currentTimeMillis;
                    C60408m.m234769a("te_record_camera1_start_preview_cost", j);
                    C60427s.m234838a("te_record_camera1_start_preview_cost", Long.valueOf(j));
                    this.f150959p = true;
                    this.f150960q.mo206497a(1, 0, 0, "TECamera1 preview", this.f150790a);
                    return;
                }
                throw new AndroidRuntimeException("ProviderManager is null");
            } catch (Exception e) {
                C60427s.m234844d("TECamera1", "startPreview: Error " + e.getMessage());
                C60405k.m234764a(e);
                this.f150959p = false;
                try {
                    if (this.f150968y == 0) {
                        this.f150960q.mo206502b(108, 0, "preview error will close camera1", null);
                        C60359f.m234459a(this.f150955C, this.f150790a);
                        this.f150960q.mo206502b(SmEvents.EVENT_NO, 0, "closePrivacy", null);
                        this.f150960q.mo206502b(SmEvents.EVENT_NR, 0, "preview error did close camera1", null);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (this.f150968y == 0) {
                    this.f150790a = null;
                }
                this.f150960q.mo206504c(1, -425, e.getMessage(), this.f150790a);
            }
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206642a(int i) {
        super.mo206642a(i);
        if (i == 0) {
            m234344v();
        } else if (i == 1) {
            m234345w();
        } else {
            throw new IllegalArgumentException("un support scene");
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: b */
    public void mo206656b(int i) {
        C60427s.m234843c("TECamera1", "Does not support switch mode for camera1");
        this.f150960q.mo206502b(-200, -200, "Does not support switch mode for camera1", this.f150790a);
    }

    /* renamed from: a */
    public static List<TEFrameSizei> m234341a(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Camera.Size size : list) {
            arrayList.add(new TEFrameSizei(size.width, size.height));
        }
        return arrayList;
    }

    /* renamed from: e */
    private int m234343e(int i) {
        int size = this.f150799j.size() - 1;
        int i2 = 0;
        while (size - i2 > 1) {
            int i3 = (i2 + size) / 2;
            if (i > this.f150799j.get(i3).intValue()) {
                i2 = i3;
            } else {
                size = i3;
            }
        }
        if (Math.abs(i - this.f150799j.get(i2).intValue()) > Math.abs(i - this.f150799j.get(size).intValue())) {
            return size;
        }
        return i2;
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: c */
    public void mo206660c(int i) {
        String str;
        C60427s.m234839a("TECamera1", "setExposureCompensation... value: " + i);
        int i2 = -413;
        if (this.f150790a == null || this.f150791b == null || !this.f150959p || !this.f150958o.f150653G.mo206524a()) {
            if (this.f150790a == null || this.f150791b == null || !this.f150959p) {
                str = "setExposureCompensation ： Camera is null.";
                this.f150960q.mo206499a(1, -401, str, this.f150790a);
            } else {
                i2 = -414;
                str = "Unsupported exposure compensation!";
            }
            C60427s.m234844d("TECamera1", str);
            this.f150960q.mo206499a(1, i2, str, this.f150790a);
        } else if (i > this.f150958o.f150653G.f150704a || i < this.f150958o.f150653G.f150706c) {
            this.f150960q.mo206499a(1, -415, "Invalid exposure: " + i, this.f150790a);
        } else {
            try {
                this.f150791b.setExposureCompensation(i);
                this.f150790a.setParameters(this.f150791b);
                this.f150958o.f150653G.f150705b = this.f150791b.getExposureCompensation();
                C60427s.m234839a("TECamera1", "EC = " + this.f150958o.f150653G.f150705b + ", EV = " + (((float) this.f150958o.f150653G.f150705b) * this.f150958o.f150653G.f150707d));
            } catch (Exception e) {
                String str2 = "Error: setExposureCompensation failed: " + e.toString();
                C60427s.m234844d("TECamera1", str2);
                this.f150960q.mo206499a(1, -413, str2, this.f150790a);
            }
        }
    }

    /* renamed from: c */
    private int m234342c(PrivacyCert privacyCert) {
        int i;
        Exception e;
        this.f150955C = privacyCert;
        try {
            int i2 = 0;
            if (Build.VERSION.SDK_INT > 8) {
                int numberOfCameras = Camera.getNumberOfCameras();
                this.f150795f = numberOfCameras;
                C60408m.m234769a("te_record_camera_size", (long) numberOfCameras);
                C60427s.m234839a("TECamera1", "innerOpen mNumberOfCameras: " + this.f150795f + ", current mDefaultCameraID:" + this.f150958o.f150678g);
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                int i3 = 0;
                while (true) {
                    if (i3 >= this.f150795f) {
                        break;
                    }
                    Camera.getCameraInfo(i3, cameraInfo);
                    C60427s.m234839a("TECamera1", "innerOpen cameraInfo facing: " + cameraInfo.facing + ", mCameraSettings.mFacing:" + this.f150958o.f150676e);
                    if (cameraInfo.facing == this.f150958o.f150676e) {
                        this.f150958o.f150678g = i3;
                        break;
                    }
                    i3++;
                }
            }
            if (this.f150958o.f150678g == -1 && this.f150795f > 0) {
                if (this.f150958o.af) {
                    C60427s.m234843c("TECamera1", "innerOpen: camera info check error");
                    throw new RuntimeException("CameraIDError");
                }
            }
            if (this.f150958o.f150678g == -1 && this.f150795f > 0 && this.f150958o.ae) {
                C60427s.m234843c("TECamera1", "innerOpen: camera info check, set CameraID to 0");
                this.f150958o.f150678g = 0;
            }
            C60427s.m234839a("TECamera1", "innerOpen: " + this.f150958o.f150678g);
            this.f150960q.mo206502b(106, 0, "will start camera1", null);
            if (this.f150958o.f150678g < 0) {
                this.f150790a = C60359f.m234458a(privacyCert, this.f150958o.f150678g);
                this.f150960q.mo206502b(SmEvents.EVENT_NT, 0, "openPrivacy", this.f150790a);
                this.f150958o.f150676e = 0;
                this.f150965v = this.f150958o.f150676e;
                Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                int i4 = 0;
                while (true) {
                    if (i4 >= this.f150795f) {
                        break;
                    }
                    Camera.getCameraInfo(i4, cameraInfo2);
                    if (cameraInfo2.facing == this.f150965v) {
                        this.f150958o.f150678g = i4;
                        break;
                    }
                    i4++;
                }
            } else {
                this.f150790a = C60359f.m234458a(privacyCert, this.f150958o.f150678g);
                this.f150960q.mo206502b(SmEvents.EVENT_NT, 0, "openPrivacy", this.f150790a);
            }
            C60427s.m234839a("TECamera1", "innerOpen mNewFacing: " + this.f150965v);
            C60427s.m234839a("TECamera1", "innerOpen mCameraSettings.mDefaultCameraID: " + this.f150958o.f150678g);
            this.f150960q.mo206502b(ActivityIdentificationData.WALKING, 0, "did start camera1", null);
            if (this.f150790a == null) {
                C60427s.m234844d("TECamera1", "Open Camera Failed width ID:" + this.f150958o.f150678g);
                this.f150960q.mo206498a(1, -401, (AbstractC60396i) null, this.f150790a);
                return -401;
            }
            try {
                i = m234346x();
                try {
                    mo206678s();
                    this.f150960q.mo206502b(1, 0, "TECamera1 features is ready", this.f150790a);
                } catch (Exception e2) {
                    e = e2;
                    i2 = i;
                }
            } catch (Exception e3) {
                e = e3;
                C60427s.m234844d("TECamera1", "Open init Camera Failed!: " + Log.getStackTraceString(e));
                C60405k.m234764a(e);
                i = i2;
                this.f150960q.mo206498a(1, i, this, this.f150790a);
                return i;
            }
            this.f150960q.mo206498a(1, i, this, this.f150790a);
            return i;
        } catch (RuntimeException e4) {
            C60427s.m234844d("TECamera1", "Open Camera Failed!: " + Log.getStackTraceString(e4));
            C60405k.m234764a(e4);
            this.f150960q.mo206498a(1, -401, (AbstractC60396i) null, this.f150790a);
            this.f150790a = null;
            return -401;
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: b */
    public void mo206657b(PrivacyCert privacyCert) {
        C60427s.m234839a("TECamera1", "Camera close start...");
        if (this.f150790a != null) {
            if (this.f150959p) {
                try {
                    Camera.Parameters parameters = this.f150790a.getParameters();
                    this.f150791b = parameters;
                    parameters.setFlashMode("off");
                    this.f150790a.setParameters(this.f150791b);
                    long currentTimeMillis = System.currentTimeMillis();
                    this.f150790a.stopPreview();
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    C60408m.m234769a("te_record_camera1_stop_preview_cost", currentTimeMillis2);
                    C60427s.m234838a("te_record_camera1_stop_preview_cost", Long.valueOf(currentTimeMillis2));
                    if (this.f150963t.mo206801c() == 1) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f150963t.mo206804f().setOnFrameAvailableListener(null, null);
                        } else {
                            this.f150963t.mo206804f().setOnFrameAvailableListener(null);
                        }
                    } else if (this.f150963t.mo206801c() == 4) {
                        this.f150790a.setPreviewCallbackWithBuffer(null);
                    }
                } catch (Exception e) {
                    C60427s.m234844d("TECamera1", "Close camera failed: " + e.getMessage());
                }
                this.f150959p = false;
            }
            try {
                this.f150790a.setErrorCallback(null);
                this.f150960q.mo206502b(108, 0, "will close camera1", null);
                C60359f.m234459a(privacyCert, this.f150790a);
                this.f150960q.mo206502b(SmEvents.EVENT_NO, 0, "closePrivacy", null);
                this.f150960q.mo206502b(SmEvents.EVENT_NR, 0, "did close camera1", null);
            } catch (Exception e2) {
                C60427s.m234844d("TECamera1", "Camera release failed: " + e2.getMessage());
            }
            this.f150801l.set(false);
            this.f150790a = null;
            C60427s.m234839a("TECamera1", "Camera closed end!");
            this.f150960q.mo206500a(1, this, this.f150790a);
        }
        this.f150955C = null;
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: d */
    public void mo206663d(final int i) {
        int i2;
        String str;
        int i3;
        String str2;
        int i4;
        int i5;
        if (this.f150790a == null) {
            C60427s.m234844d("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -401. Reason: mCameraDevice is null");
            C60427s.m234844d("TECamera1", "switchFlashMode failed: Camera is not ready!");
            this.f150960q.mo206499a(1, -401, "switchFlashMode failed: Camera is not ready!", this.f150790a);
            AbstractC60396i.AbstractC60397a aVar = this.f150960q;
            if (i == 0) {
                i5 = 0;
            } else {
                i5 = 1;
            }
            aVar.mo206505d(1, -401, i5, "switchFlashMode failed: Camera is not ready!", this.f150790a);
        } else if (this.f150802m == 0 || System.currentTimeMillis() - this.f150802m >= 200 || this.f150961r == null) {
            try {
                Camera.Parameters parameters = this.f150790a.getParameters();
                this.f150791b = parameters;
                List<String> supportedFlashModes = parameters.getSupportedFlashModes();
                if (supportedFlashModes != null) {
                    if (i == 0) {
                        str2 = "off";
                    } else if (i == 1) {
                        str2 = "on";
                    } else if (i == 2) {
                        str2 = "torch";
                    } else if (i == 3) {
                        str2 = "auto";
                    } else if (i != 4) {
                        str2 = null;
                    } else {
                        str2 = "red-eye";
                    }
                    if (str2 != null && str2.equalsIgnoreCase(this.f150791b.getFlashMode())) {
                        C60427s.m234844d("TECamera1", "no need switchFlashMode");
                        return;
                    } else if (str2 != null && supportedFlashModes.contains(str2)) {
                        this.f150960q.mo206502b(104, 0, "camera1 will change flash mode " + str2, null);
                        this.f150791b.setFlashMode(str2);
                        this.f150790a.setParameters(this.f150791b);
                        if ("off".equalsIgnoreCase(str2) && this.f150958o.f150648B.getBoolean("enableSwitchFlashSleepToTakeEffect")) {
                            try {
                                Thread.sleep(200);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        this.f150960q.mo206502b(LocationRequest.PRIORITY_NO_POWER, 0, "camera1 did change flash mode " + str2, null);
                        AbstractC60396i.AbstractC60397a aVar2 = this.f150960q;
                        if (i == 0) {
                            i4 = 0;
                        } else {
                            i4 = 1;
                        }
                        aVar2.mo206503c(1, 0, i4, "torch success", this.f150790a);
                        return;
                    }
                }
                if (supportedFlashModes != null) {
                    str = "Camera does not support flash mode: " + i + "support list: " + supportedFlashModes.toString();
                } else {
                    str = "Camera does not support flash mode: " + i;
                }
                C60427s.m234844d("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -419. Reason: not support flash mode " + i);
                C60427s.m234844d("TECamera1", str);
                this.f150960q.mo206499a(1, -419, str, this.f150790a);
                AbstractC60396i.AbstractC60397a aVar3 = this.f150960q;
                if (i == 0) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                aVar3.mo206505d(1, -419, i3, str, this.f150790a);
            } catch (Exception e2) {
                C60427s.m234844d("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -419. Reason: " + e2);
                String str3 = "Switch flash mode failed: " + e2.toString();
                C60427s.m234844d("TECamera1", str3);
                this.f150960q.mo206499a(1, -418, str3, this.f150790a);
                AbstractC60396i.AbstractC60397a aVar4 = this.f150960q;
                if (i == 0) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                aVar4.mo206505d(1, -418, i2, str3, this.f150790a);
            }
        } else {
            this.f150961r.postDelayed(new Runnable() {
                /* class com.ss.android.ttvecamera.C60339d.RunnableC603445 */

                public void run() {
                    C60339d.this.mo206663d(i);
                }
            }, 200);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: b */
    public void mo206658b(boolean z) {
        C60427s.m234839a("TECamera1", "setAutoFocusLock...");
        if (this.f150790a == null || this.f150791b == null || !this.f150959p) {
            this.f150960q.mo206499a(1, -401, "setAutoFocusLock failed. ： Camera is null.", this.f150790a);
        } else if (!mo206675p()) {
            C60427s.m234843c("TECamera1", "Current camera doesn't support af lock.");
            this.f150960q.mo206502b(-433, -433, "Current camera doesn't support af lock.", this.f150790a);
        } else {
            if (z) {
                try {
                    this.f150791b.setFocusMode("fixed");
                } catch (Exception e) {
                    String str = "Error: setAutoFocusLock failed: " + e.toString();
                    C60427s.m234844d("TECamera1", str);
                    this.f150960q.mo206502b(-427, -427, str, this.f150790a);
                    return;
                }
            } else {
                this.f150791b.setFocusMode("continuous-video");
            }
            this.f150790a.setParameters(this.f150791b);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: c */
    public void mo206661c(boolean z) {
        String str;
        int i;
        if (this.f150790a == null) {
            C60427s.m234844d("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -401. Reason: mCameraDevice is null");
            C60427s.m234844d("TECamera1", "toggleTorch : Camera is not ready!");
            this.f150960q.mo206499a(1, -401, "toggleTorch : Camera is not ready!", this.f150790a);
            this.f150960q.mo206505d(1, -401, z ? 1 : 0, "toggleTorch : Camera is not ready!", this.f150790a);
        } else if (this.f150958o.f150676e == 1) {
            C60427s.m234844d("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support torch");
            C60427s.m234843c("TECamera1", "Front camera does not support torch!");
            this.f150960q.mo206502b(-416, -416, "Front camera does not support torch!", this.f150790a);
            this.f150960q.mo206505d(1, -416, z, "Front camera does not support torch!", this.f150790a);
        } else {
            try {
                this.f150960q.mo206502b(104, 0, "camera1 will change flash mode " + z, null);
                Camera.Parameters parameters = this.f150790a.getParameters();
                this.f150791b = parameters;
                if (z != 0) {
                    str = "torch";
                } else {
                    str = "off";
                }
                parameters.setFlashMode(str);
                this.f150790a.setParameters(this.f150791b);
                this.f150960q.mo206502b(LocationRequest.PRIORITY_NO_POWER, 0, "camera1 did change flash mode " + z, null);
                AbstractC60396i.AbstractC60397a aVar = this.f150960q;
                if (z != 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                aVar.mo206503c(1, 0, i, "toggleTorch " + z, this.f150790a);
            } catch (Exception e) {
                C60427s.m234844d("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -417. Reason: " + e);
                String str2 = "Toggle torch failed: " + e.toString();
                C60427s.m234844d("TECamera1", str2);
                this.f150960q.mo206499a(1, -417, str2, this.f150790a);
                this.f150960q.mo206505d(1, -417, z, str2, this.f150790a);
            }
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206645a(Bundle bundle) {
        super.mo206645a(bundle);
        if (bundle != null) {
            Bundle bundle2 = (Bundle) this.f150953A.get(this.f150958o.f150651E);
            for (String str : bundle.keySet()) {
                if (TECameraSettings.C60301h.m234228a(str, bundle.get(str)) && TextUtils.equals(str, "support_light_soft")) {
                    bundle2.putBoolean("support_light_soft", bundle.getBoolean("support_light_soft"));
                }
            }
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public int mo206638a(TECameraSettings tECameraSettings, PrivacyCert privacyCert) {
        super.mo206638a(tECameraSettings, privacyCert);
        this.f150958o = tECameraSettings;
        this.f150965v = tECameraSettings.f150676e;
        return m234342c(privacyCert);
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public TEFrameSizei mo206639a(float f, TEFrameSizei tEFrameSizei) {
        Camera camera = this.f150790a;
        if (camera == null) {
            C60427s.m234844d("TECamera1", "getBestPreviewSize: Camera is not opened!");
            return null;
        }
        if (this.f150791b == null) {
            this.f150791b = camera.getParameters();
        }
        if (tEFrameSizei != null) {
            return C60410n.m234778a(m234347y(), tEFrameSizei);
        }
        return C60410n.m234777a(m234347y(), f);
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206641a(float f, final TECameraSettings.AbstractC60306m mVar) {
        Camera camera = this.f150790a;
        if (camera == null) {
            C60427s.m234844d("TECamera1", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -401. Reason: mCameraDevice is null");
            C60427s.m234844d("TECamera1", "startZoom : Camera is null!");
            this.f150960q.mo206499a(1, -401, "startZoom : Camera is null!", this.f150790a);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f150791b = parameters;
            if (parameters.isZoomSupported() || this.f150791b.isSmoothZoomSupported()) {
                int min = (int) Math.min((float) this.f150791b.getMaxZoom(), f);
                if (!this.f150791b.isSmoothZoomSupported() || mVar == null || !mVar.mo206537a()) {
                    this.f150791b.setZoom(min);
                    this.f150790a.setParameters(this.f150791b);
                    if (mVar != null) {
                        mVar.mo206535a(1, (float) min, true);
                        return;
                    }
                    return;
                }
                this.f150790a.startSmoothZoom(min);
                this.f150790a.setZoomChangeListener(new Camera.OnZoomChangeListener() {
                    /* class com.ss.android.ttvecamera.C60339d.C603456 */

                    public void onZoomChange(int i, boolean z, Camera camera) {
                        TECameraSettings.AbstractC60306m mVar = mVar;
                        if (mVar != null) {
                            mVar.mo206535a(1, (float) i, z);
                        }
                    }
                });
                return;
            }
            C60427s.m234844d("TECamera1", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -421. Reason: camera is not support zoom");
            C60427s.m234844d("TECamera1", "Camera is not support zoom!");
            this.f150960q.mo206499a(1, -421, "Camera is not support zoom!", this.f150790a);
        } catch (Exception e) {
            C60427s.m234844d("TECamera1", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + e);
            String str = "Start zoom failed : " + e.toString();
            C60427s.m234844d("TECamera1", str);
            this.f150960q.mo206499a(1, -420, str, this.f150790a);
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: b */
    public void mo206655b(float f, TECameraSettings.AbstractC60306m mVar) {
        List<Integer> list = this.f150799j;
        if (list != null && this.f150790a != null) {
            float f2 = this.f150800k * f;
            this.f150800k = f2;
            try {
                if (f2 < ((float) list.get(0).intValue())) {
                    this.f150800k = (float) this.f150799j.get(0).intValue();
                }
                float f3 = this.f150800k;
                List<Integer> list2 = this.f150799j;
                if (f3 > ((float) list2.get(list2.size() - 1).intValue())) {
                    List<Integer> list3 = this.f150799j;
                    this.f150800k = (float) list3.get(list3.size() - 1).intValue();
                }
                Camera.Parameters parameters = this.f150790a.getParameters();
                if (parameters != null) {
                    int e = m234343e((int) this.f150800k);
                    if (parameters.getZoom() != e) {
                        parameters.setZoom(e);
                        this.f150790a.setParameters(parameters);
                        if (mVar != null) {
                            mVar.mo206535a(1, ((float) this.f150799j.get(e).intValue()) / 100.0f, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C60427s.m234844d("TECamera1", "[VE_UI_TEST]Failed event: SET_ZOOM. Code: -420. Reason: getParameters is null");
                C60427s.m234844d("TECamera1", "setZoom failed for getParameters null");
            } catch (Exception e2) {
                C60427s.m234844d("TECamera1", "[VE_UI_TEST]Failed event: SET_ZOOM. Code: -420. Reason: " + e2);
                C60427s.m234844d("TECamera1", "setZoom failed, " + e2.getMessage());
            }
        }
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206643a(int i, int i2) {
        this.f150958o.f150695x = true;
        this.f150958o.f150687p.f150716a = i;
        this.f150958o.f150687p.f150717b = i2;
        mo206654b();
        mo206640a();
    }

    @Override // com.ss.android.ttvecamera.AbstractC60396i
    /* renamed from: a */
    public void mo206644a(int i, int i2, final TECameraSettings.AbstractC60302i iVar) {
        Camera camera = this.f150790a;
        if (camera == null) {
            C60427s.m234844d("TECamera1", "takePicture : camera is null");
            this.f150960q.mo206499a(1, -401, "takePicture : camera is null", this.f150790a);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f150791b = parameters;
            if (!(parameters.getPictureSize().width == i && this.f150791b.getPictureSize().height == i2)) {
                TEFrameSizei a = C60410n.m234780a(m234341a(this.f150791b.getSupportedPictureSizes()), this.f150958o.mo206521a(), new TEFrameSizei(i, i2));
                this.f150791b.setPictureSize(a.f150716a, a.f150717b);
                this.f150791b.setPictureFormat(DynamicModule.f58006b);
                this.f150791b.setJpegQuality(100);
                this.f150790a.setParameters(this.f150791b);
            }
            this.f150959p = false;
            this.f150790a.takePicture(null, null, new Camera.PictureCallback() {
                /* class com.ss.android.ttvecamera.C60339d.C603412 */

                public void onPictureTaken(byte[] bArr, Camera camera) {
                    if (iVar != null) {
                        iVar.mo206531a(new TECameraFrame(bArr, TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_JPEG, C60339d.this.f150791b.getPictureSize().width, C60339d.this.f150791b.getPictureSize().height, 0), C60339d.this);
                    }
                }
            });
        } catch (Exception e) {
            C60405k.m234764a(e);
            if (iVar != null) {
                iVar.mo206532a(mo206848a(e, IByteRtcError.BRERR_INVALID_TOKEN));
            }
        }
    }

    /* renamed from: a */
    public static C60339d m234340a(Context context, AbstractC60396i.AbstractC60397a aVar, Handler handler, AbstractC60396i.AbstractC60399c cVar) {
        return new C60339d(context, aVar, handler, cVar);
    }

    private C60339d(Context context, AbstractC60396i.AbstractC60397a aVar, Handler handler, AbstractC60396i.AbstractC60399c cVar) {
        super(context, aVar, handler, cVar);
        this.f150958o = new TECameraSettings(context, 1);
        this.f150793d = new C60329c(1);
        this.f150955C = null;
    }
}
