package com.ss.android.vc.p3069b.p3071b;

import com.ss.android.vc.p3069b.C60674c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.b.b.a */
public class C60672a extends C60674c {

    /* renamed from: b */
    private int f151769b;

    /* renamed from: c */
    private int f151770c;

    /* renamed from: d */
    private int f151771d;

    public C60672a() {
    }

    @Override // com.ss.android.vc.p3069b.C60674c
    public String toString() {
        return mo208228a().toString();
    }

    /* renamed from: a */
    public JSONObject mo208228a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("vcLocalLogNum", this.f151769b);
            jSONObject.put("rtcLocalLogNum", this.f151770c);
            jSONObject.put("rtcSlardarLogNum", this.f151771d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: b */
    public C60672a mo208227a(int i) {
        C60672a aVar = new C60672a();
        aVar.f151769b = this.f151769b / i;
        aVar.f151770c = this.f151770c / i;
        aVar.f151771d = this.f151771d / i;
        return aVar;
    }

    /* renamed from: a */
    public void mo208229a(C60672a aVar) {
        this.f151769b += aVar.f151769b;
        this.f151770c += aVar.f151770c;
        this.f151771d += aVar.f151771d;
    }

    public C60672a(int i, int i2, int i3) {
        this.f151769b = i;
        this.f151770c = i2;
        this.f151771d = i3;
    }
}
