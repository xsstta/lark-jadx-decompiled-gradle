package com.ss.android.lark.integrator.littleapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.service.p663a.AbstractC13304a;
import com.bytedance.ee.larkbrand.service.p663a.AbstractC13306c;
import com.bytedance.ee.larkbrand.utils.C13344e;
import com.ss.android.lark.location.dto.C41579a;
import com.ss.android.lark.location.dto.C41581c;
import com.ss.android.lark.location.p2146b.AbstractC41559c;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.miniapp.util.C67070z;
import com.tt.refer.common.util.C67866g;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.integrator.littleapp.g */
public class C39821g implements AbstractC13304a {

    /* renamed from: a */
    public AbstractC41559c f101443a;

    @Override // com.bytedance.ee.larkbrand.service.p663a.AbstractC13304a
    /* renamed from: b */
    public void mo49559b() {
        this.f101443a.mo149567d();
    }

    @Override // com.bytedance.ee.larkbrand.service.p663a.AbstractC13304a
    /* renamed from: c */
    public void mo49560c() {
        this.f101443a.mo149566c();
    }

    @Override // com.bytedance.ee.larkbrand.service.p663a.AbstractC13304a
    /* renamed from: d */
    public void mo49561d() {
        this.f101443a.mo149568e();
    }

    @Override // com.bytedance.ee.larkbrand.service.p663a.AbstractC13304a
    /* renamed from: e */
    public void mo49562e() {
        this.f101443a.mo149547b();
    }

    @Override // com.bytedance.ee.larkbrand.service.p663a.AbstractC13304a
    /* renamed from: a */
    public void mo49552a() {
        this.f101443a.mo149541a();
    }

    public C39821g(AbstractC41559c cVar) {
        this.f101443a = cVar;
    }

    @Override // com.bytedance.ee.larkbrand.service.p663a.AbstractC13304a
    /* renamed from: a */
    public void mo49554a(float f) {
        this.f101443a.mo149543a(f);
    }

    @Override // com.bytedance.ee.larkbrand.service.p663a.AbstractC13304a
    /* renamed from: a */
    public void mo49555a(final AbstractC13306c cVar) {
        this.f101443a.mo149544a(new AbstractC41559c.AbstractC41560a() {
            /* class com.ss.android.lark.integrator.littleapp.C39821g.C398232 */

            @Override // com.ss.android.lark.location.p2146b.AbstractC41559c.AbstractC41560a
            /* renamed from: a */
            public boolean mo144320a() {
                cVar.onMapReady();
                return true;
            }
        });
    }

    @Override // com.bytedance.ee.larkbrand.service.p663a.AbstractC13304a
    /* renamed from: a */
    public void mo49556a(JSONArray jSONArray) {
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                arrayList.add(new C41579a().mo149680b(optJSONObject.optDouble("latitude")).mo149676a(optJSONObject.optDouble("longitude")).mo149681b(optJSONObject.optInt("radius")).mo149682b(C13344e.m54322a(optJSONObject.optString("color"))).mo149677a(optJSONObject.optInt("strokeWidth", 10)).mo149678a(C13344e.m54322a(optJSONObject.optString("fillColor"))));
            }
            this.f101443a.mo149548b(arrayList);
        }
    }

    @Override // com.bytedance.ee.larkbrand.service.p663a.AbstractC13304a
    /* renamed from: a */
    public void mo49558a(boolean z) {
        this.f101443a.mo149546a(z);
    }

    @Override // com.bytedance.ee.larkbrand.service.p663a.AbstractC13304a
    /* renamed from: a */
    public void mo49553a(double d, double d2) {
        this.f101443a.mo149542a(d, d2);
    }

    @Override // com.bytedance.ee.larkbrand.service.p663a.AbstractC13304a
    /* renamed from: a */
    public void mo49557a(final JSONArray jSONArray, final IAppContext iAppContext) {
        if (jSONArray != null && jSONArray.length() != 0) {
            C67866g.m264025a(new Action() {
                /* class com.ss.android.lark.integrator.littleapp.C39821g.C398221 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        Bitmap bitmap = null;
                        byte[] loadByteFromStream = StreamLoader.loadByteFromStream(optJSONObject.optString("iconPath"), iAppContext);
                        if (loadByteFromStream != null && loadByteFromStream.length > 0) {
                            bitmap = C67070z.m261385a(loadByteFromStream);
                        }
                        C41581c a = new C41581c().mo149690a(optJSONObject.optDouble("latitude")).mo149694b(optJSONObject.optDouble("longitude")).mo149692a(optJSONObject.optString("title"));
                        if (bitmap != null) {
                            a.mo149691a(bitmap);
                        }
                        arrayList.add(a);
                    }
                    C39821g.this.f101443a.mo149545a(arrayList);
                }
            }, Schedulers.longIO());
        }
    }

    @Override // com.bytedance.ee.larkbrand.service.p663a.AbstractC13304a
    /* renamed from: a */
    public View mo49551a(Context context, Bundle bundle, boolean z) {
        return this.f101443a.mo149540a(context, bundle, z);
    }
}
