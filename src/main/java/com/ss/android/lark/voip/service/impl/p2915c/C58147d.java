package com.ss.android.lark.voip.service.impl.p2915c;

import android.content.Context;
import android.util.Base64;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.voip.service.impl.app.C58103o;
import com.ss.android.lark.voip.service.impl.app.C58133t;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;
import com.ss.android.lark.voip.service.impl.statistics.KeypairFailEvent;
import com.ss.android.vc.irtc.AbstractC61058j;
import com.ss.android.vc.irtc.AbstractC61063o;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.voip.service.impl.c.d */
public class C58147d {

    /* renamed from: a */
    private AbstractC58146c f143039a;

    /* renamed from: b */
    private AbstractC58146c f143040b;

    /* renamed from: a */
    public AbstractC58146c mo197048a() {
        return this.f143040b;
    }

    /* renamed from: b */
    public C58145b mo197052b() {
        return (C58145b) this.f143039a;
    }

    /* renamed from: a */
    public AbstractC58146c mo197049a(VoiceCall voiceCall) {
        return this.f143040b;
    }

    /* renamed from: a */
    public void mo197050a(AbstractC61058j jVar) {
        AbstractC58146c cVar = this.f143039a;
        if (cVar != null) {
            cVar.mo197041a(jVar);
        }
    }

    /* renamed from: b */
    public void mo197053b(AbstractC61058j jVar) {
        AbstractC58146c cVar = this.f143039a;
        if (cVar != null) {
            cVar.mo197043b(jVar);
        }
    }

    /* renamed from: a */
    public boolean mo197051a(Context context) {
        if (this.f143039a == null) {
            this.f143039a = new C58145b(context);
            C58149g.m225570a().mo210496a(context);
            C58149g.m225570a().mo210567y();
            C58149g.m225570a().mo210511a(new AbstractC61063o() {
                /* class com.ss.android.lark.voip.service.impl.p2915c.C58147d.C581481 */

                @Override // com.ss.android.vc.irtc.AbstractC61063o
                /* renamed from: a */
                public void mo197054a(boolean z, int i, byte[] bArr) {
                    Log.m165389i("RtcEngineCompatible", "[reportEncryptDecryptException] isEncrypt = " + z + ", errorCode = " + i);
                    VoiceCall a = C58103o.m225371a().mo196949f().mo196802a();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("isEncrypt", z);
                        jSONObject.put("errorCode", i);
                        if (bArr != null && bArr.length > 0) {
                            jSONObject.put("base64Data", new String(Base64.encode(bArr, 2)));
                        }
                    } catch (Exception unused) {
                    }
                    if (a != null) {
                        KeypairFailEvent.m225587a(a.getId(), C58133t.m225480a(a), jSONObject);
                    }
                }
            });
        }
        this.f143040b = this.f143039a;
        return true;
    }
}
