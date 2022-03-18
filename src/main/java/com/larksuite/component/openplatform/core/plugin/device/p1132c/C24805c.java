package com.larksuite.component.openplatform.core.plugin.device.p1132c;

import android.os.Vibrator;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;

@ApiSupportType(apiName = {"vibrateLong"}, support = {AppType.WebAPP}, testSupport = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.device.c.c */
public class C24805c extends AbstractC65797c {
    public C24805c() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("vibrateLong");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        Vibrator vibrator = (Vibrator) mo230473f().getApplicationContext().getSystemService("vibrator");
        if (vibrator == null || !vibrator.hasVibrator()) {
            mo230482a(ApiCode.GENERAL_UNKONW_ERROR, "vibrator disable");
            return;
        }
        vibrator.vibrate(400);
        mo230494j();
    }

    public C24805c(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
