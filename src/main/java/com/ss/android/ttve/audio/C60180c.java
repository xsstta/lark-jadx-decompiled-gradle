package com.ss.android.ttve.audio;

import android.media.AudioRecord;
import com.bytedance.bpea.basics.PrivacyCert;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.ss.android.ttve.monitor.C60217b;
import com.ss.android.vesdk.C63967d;
import com.ss.android.vesdk.VESensService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.audio.c */
public class C60180c {

    /* renamed from: a */
    protected static int f150182a = -1;

    /* renamed from: b */
    protected static int[] f150183b = {44100, JosStatusCodes.RTN_CODE_COMMON_ERROR, 11025, 16000, 22050};

    /* renamed from: c */
    protected static int f150184c = -1;

    /* renamed from: d */
    protected static int[] f150185d = {12, 16, 1};

    /* renamed from: e */
    AudioRecord f150186e;

    /* renamed from: f */
    int f150187f = -1;

    /* renamed from: g */
    int f150188g = -1;

    /* renamed from: h */
    int f150189h = 2;

    /* renamed from: i */
    AbstractC60179b f150190i;

    /* renamed from: j */
    private PrivacyCert f150191j;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo205506b() {
        VESensService.getInstance().setSensCheckObjStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.PRIVACY_STATUS.PRIVACY_STATUS_RELEASE);
    }

    /* renamed from: a */
    public void mo205505a() {
        AudioRecord audioRecord = this.f150186e;
        if (audioRecord != null) {
            try {
                if (audioRecord.getState() != 0) {
                    C60217b.m234045a("vesdk_event_will_stop_mic", m233911a("editor uninit will stop mic", String.valueOf(System.currentTimeMillis()), ""), "behavior");
                    C63967d.m251091b(this.f150191j, this.f150186e);
                    mo205506b();
                    C60217b.m234045a("vesdk_event_did_stop_mic", m233911a("editor uninit did stop mic", "", String.valueOf(System.currentTimeMillis())), "behavior");
                }
                C63967d.m251092c(this.f150191j, this.f150186e);
            } catch (Exception unused) {
            }
            this.f150186e = null;
        }
        AbstractC60179b bVar = this.f150190i;
        if (bVar != null) {
            bVar.mo205496a();
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        AudioRecord audioRecord = this.f150186e;
        if (audioRecord != null) {
            try {
                if (audioRecord.getState() != 0) {
                    C60217b.m234045a("vesdk_event_will_stop_mic", m233911a("editor finalize will stop mic", String.valueOf(System.currentTimeMillis()), ""), "behavior");
                    C63967d.m251091b(this.f150191j, this.f150186e);
                    mo205506b();
                    C60217b.m234045a("vesdk_event_did_stop_mic", m233911a("editor finalize did stop mic", "", String.valueOf(System.currentTimeMillis())), "behavior");
                }
                C63967d.m251092c(this.f150191j, this.f150186e);
            } catch (Exception unused) {
            }
            this.f150186e = null;
        }
        super.finalize();
    }

    public C60180c(AbstractC60179b bVar) {
        this.f150190i = bVar;
    }

    /* renamed from: a */
    private JSONObject m233911a(String str, String str2, String str3) {
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
