package com.ss.android.vesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.view.SurfaceView;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttve.monitor.C60217b;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.keyvaluepair.C64030a;
import com.ss.android.vesdk.p3187a.AbstractC63923a;
import com.ss.android.vesdk.p3187a.AbstractC63924b;
import com.ss.android.vesdk.p3192f.C63988b;
import com.ss.android.vesdk.p3192f.SurfaceHolder$CallbackC63987a;
import com.ss.android.vesdk.runtime.AbstractC64063e;
import com.ss.android.vesdk.runtime.C64060b;
import com.ss.android.vesdk.runtime.VERuntime;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class VERecorder {

    /* renamed from: a */
    protected AbstractC64063e f161366a;

    /* renamed from: b */
    protected AbstractC64021g f161367b;

    /* renamed from: c */
    private VERuntime f161368c;

    public enum VEMirrorMode {
        NO_MIRROR,
        X_MIRROR,
        Y_MIRROR
    }

    public enum VERotation {
        Rotation_0,
        Rotation_90,
        Rotation_180,
        Rotation_270
    }

    /* renamed from: com.ss.android.vesdk.VERecorder$a */
    public interface AbstractC63892a {
    }

    /* renamed from: com.ss.android.vesdk.VERecorder$b */
    public interface AbstractC63893b {
        /* renamed from: a */
        void mo120731a(Bitmap bitmap, int i);
    }

    /* renamed from: com.ss.android.vesdk.VERecorder$c */
    public interface AbstractC63894c {

        /* renamed from: com.ss.android.vesdk.VERecorder$c$a */
        public static class C63895a {

            /* renamed from: a */
            public boolean f161374a;

            /* renamed from: b */
            public VEFrame.ETEPixelFormat f161375b = VEFrame.ETEPixelFormat.TEPixFmt_OpenGL_RGBA8;
        }

        /* renamed from: a */
        C63895a mo180962a();

        /* renamed from: a */
        void mo180963a(VEFrame vEFrame);
    }

    /* renamed from: com.ss.android.vesdk.VERecorder$d */
    public interface AbstractC63896d {
        /* renamed from: a */
        void mo120724a(int i, float f, boolean z);

        /* renamed from: a */
        void mo120725a(int i, boolean z, boolean z2, float f, List<Integer> list);

        /* renamed from: a */
        boolean mo120726a();
    }

    /* renamed from: com.ss.android.vesdk.VERecorder$e */
    public interface AbstractC63897e {
    }

    /* renamed from: com.ss.android.vesdk.VERecorder$f */
    public interface AbstractC63898f {
    }

    /* renamed from: com.ss.android.vesdk.VERecorder$g */
    public interface AbstractC63899g {
    }

    /* renamed from: com.ss.android.vesdk.VERecorder$h */
    public interface AbstractC63900h {
    }

    /* renamed from: com.ss.android.vesdk.VERecorder$i */
    public interface AbstractC63901i {
        /* renamed from: a */
        void mo220940a(VEPreviewRadio vEPreviewRadio, int i);
    }

    /* renamed from: com.ss.android.vesdk.VERecorder$j */
    public interface AbstractC63902j {
    }

    /* renamed from: com.ss.android.vesdk.VERecorder$k */
    public interface AbstractC63903k {
        /* renamed from: a */
        void mo220941a(float f);
    }

    /* renamed from: com.ss.android.vesdk.VERecorder$l */
    public interface AbstractC63904l {
    }

    /* renamed from: com.ss.android.vesdk.VERecorder$m */
    public interface AbstractC63905m {
        /* renamed from: a */
        void mo220942a(boolean z);
    }

    /* renamed from: a */
    public void mo220934a(boolean z) {
        C63929ab.m250974a("VERecorder", "enableRecordingMp4... enable: " + z);
        this.f161367b.mo221404b(z);
    }

    /* renamed from: a */
    public void mo220933a(AbstractC63924b bVar) {
        this.f161367b.mo221391a(bVar);
    }

    /* renamed from: a */
    public void mo220935a(boolean z, long j) {
        this.f161367b.mo221396a(z, j);
    }

    /* renamed from: a */
    public int mo220924a() {
        return this.f161367b.mo221399b();
    }

    /* renamed from: b */
    public String[] mo220936b() {
        return this.f161367b.mo221407c();
    }

    /* renamed from: c */
    public void mo220937c() throws VEException {
        this.f161367b.mo221410e();
    }

    /* renamed from: e */
    public EnigmaResult mo220939e() {
        return this.f161367b.mo221416l();
    }

    /* renamed from: d */
    public void mo220938d() {
        C63929ab.m250978c("VERecorder", "onDestroy...");
        AbstractC64021g gVar = this.f161367b;
        if (gVar != null) {
            gVar.mo221412g();
        }
        AbstractC64063e eVar = this.f161366a;
        if (eVar != null) {
            eVar.mo221805b();
        }
    }

    /* renamed from: a */
    public void mo220930a(VEListener.AbstractC63856ac acVar) {
        this.f161367b.mo221674a(acVar);
    }

    /* renamed from: a */
    public void mo220931a(final VEListener.AbstractC63866i iVar) {
        this.f161367b.mo221403b(new VEListener.AbstractC63866i() {
            /* class com.ss.android.vesdk.VERecorder.C638912 */

            @Override // com.ss.android.vesdk.VEListener.AbstractC63866i
            public void onDone(int i) {
                int i2;
                JSONObject jSONObject = new JSONObject();
                if (i > 0) {
                    i2 = 0;
                } else {
                    i2 = -1;
                }
                try {
                    jSONObject.put("resultCode", i2);
                    C60217b.m234045a("vesdk_event_recorder_record_finish", jSONObject, "behavior");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                iVar.onDone(i);
            }
        });
    }

    /* renamed from: a */
    public void mo220932a(AbstractC63894c cVar) {
        this.f161367b.mo221387a(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC64021g mo220927a(Context context, C63988b bVar) {
        return C63986f.m251179a(context, this.f161366a, bVar);
    }

    /* renamed from: a */
    public void mo220928a(final float f, final VEListener.AbstractC63866i iVar) {
        this.f161367b.mo221381a(f, new VEListener.AbstractC63866i() {
            /* class com.ss.android.vesdk.VERecorder.C638901 */

            @Override // com.ss.android.vesdk.VEListener.AbstractC63866i
            public void onDone(int i) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("speed", (double) f);
                    jSONObject.put("resultCode", i);
                    C60217b.m234045a("vesdk_event_recorder_start_record_async", jSONObject, "behavior");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                iVar.onDone(i);
            }
        });
    }

    public VERecorder(String str, Context context, SurfaceView surfaceView) throws VEException {
        this(str, context, new SurfaceHolder$CallbackC63987a(surfaceView));
    }

    public VERecorder(String str, Context context, C63988b bVar) throws VEException {
        if (!TextUtils.isEmpty(str)) {
            this.f161366a = new C64060b(str);
            this.f161368c = VERuntime.m251382a();
            this.f161367b = mo220927a(context, bVar);
            return;
        }
        throw new VEException(-100, "workSpace is null");
    }

    /* renamed from: a */
    public int mo220925a(AbstractC63923a aVar, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, VEPreviewSettings vEPreviewSettings) {
        return mo220926a(aVar, vEVideoEncodeSettings, vEAudioEncodeSettings, vEPreviewSettings, false);
    }

    /* renamed from: a */
    public int mo220926a(AbstractC63923a aVar, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, VEPreviewSettings vEPreviewSettings, boolean z) {
        an.m251028a("init");
        try {
            int a = this.f161367b.mo221377a(aVar, vEVideoEncodeSettings, vEAudioEncodeSettings, vEPreviewSettings, this.f161366a.mo221800a(), this.f161368c.mo221782d().mo221804b(), z);
            an.m251027a();
            return a;
        } catch (NullPointerException e) {
            throw new VEException(-1, "init failed: VESDK need to be init: " + Log.getStackTraceString(e));
        } catch (Throwable th) {
            an.m251027a();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo220929a(int i, int i2, boolean z, boolean z2, AbstractC63893b bVar, boolean z3) {
        new C64030a();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", i);
            jSONObject.put("height", i2);
            if (z3) {
                jSONObject.put("tag", "takePicture");
                C60217b.m234045a("vesdk_event_recorder_take_picture", jSONObject, "behavior");
            } else {
                jSONObject.put("tag", "shotScreen");
                C60217b.m234045a("vesdk_event_recorder_shot_screen", jSONObject, "behavior");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.f161367b.mo221374a(i, i2, z, z2, bVar);
    }
}
