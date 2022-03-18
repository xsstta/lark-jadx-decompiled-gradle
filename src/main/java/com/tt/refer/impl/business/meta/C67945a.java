package com.tt.refer.impl.business.meta;

import android.os.Trace;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.utils.StringUtil;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.infra.p1137a.p1138a.C25532a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67552k;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.base.AppType;
import com.tt.refer.impl.business.meta.GadgetSchema;
import java.util.HashMap;

/* renamed from: com.tt.refer.impl.business.meta.a */
public class C67945a extends C25532a<GadgetAppInfo, GadgetSchema.C67943Entity> {

    /* renamed from: j */
    private String f171185j;

    /* renamed from: k */
    private String f171186k;

    /* renamed from: l */
    private String f171187l;

    public C67945a(IAppContext iAppContext) {
        super(iAppContext);
    }

    @Override // com.tt.refer.common.meta.AbstractC67796c, com.larksuite.component.openplatform.infra.p1137a.p1138a.C25532a
    /* renamed from: a */
    public HashMap<String, Object> mo50340a(int i) {
        HashMap<String, Object> a = super.mo50340a(i);
        Trace.beginSection("computeTraceId");
        if (TextUtils.isEmpty(this.f171185j)) {
            if (ProcessUtil.isMiniappProcess()) {
                this.f171185j = AppbrandContext.getInst().getTraceId();
            } else if (this.f62169i != null && AppType.GadgetAPP == this.f62169i.getAppType()) {
                this.f171185j = this.f62169i.getTraceId();
            }
        }
        Trace.endSection();
        Trace.beginSection("computeJsVersion");
        if (TextUtils.isEmpty(this.f171186k)) {
            this.f171186k = C67552k.m262720a(AppbrandContext.getInst().getApplicationContext(), this.f62169i);
        }
        Trace.endSection();
        Trace.beginSection("computeJsGreyVersion");
        if (TextUtils.isEmpty(this.f171187l)) {
            this.f171187l = C67552k.m262719a(AppbrandContext.getInst().getApplicationContext());
        }
        Trace.endSection();
        Trace.beginSection("computeAddGadgetParams");
        if (!TextUtils.isEmpty(this.f171185j)) {
            a.put("trace_id", this.f171185j);
        }
        a.put("js_version", this.f171186k);
        a.put("js_grey_hash", this.f171187l);
        if (this.f62168h != null) {
            a.put("scene", StringUtil.f34171a.mo48349a(((GadgetSchema.C67943Entity) this.f62168h).getScene()));
            a.put("scene_type", StringUtil.f34171a.mo48349a(((GadgetSchema.C67943Entity) this.f62168h).getScene()));
            a.put("sub_scene", StringUtil.f34171a.mo48349a(((GadgetSchema.C67943Entity) this.f62168h).getSubScene()));
        }
        Trace.endSection();
        return a;
    }
}
