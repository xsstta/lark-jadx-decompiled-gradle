package com.bytedance.ee.bear.quoto;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import io.reactivex.AbstractC68307f;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.quoto.e */
public class C10566e implements AbstractC10572i {
    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ QuotaInfoResult m43780a(String str) throws NetService.ParseException {
        return (QuotaInfoResult) JSON.parseObject(str, QuotaInfoResult.class);
    }

    @Override // com.bytedance.ee.bear.quoto.AbstractC10572i
    /* renamed from: a */
    public AbstractC68307f<QuotaInfoResult> mo40016a(String str, String str2) {
        NetService.C5077f fVar = new NetService.C5077f("/space/api/box/quota/info/");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            fVar.mo20145a("mount_node_token", str);
            fVar.mo20145a("mount_point", str2);
        }
        new C10917c(new C10929e());
        return ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a($$Lambda$e$59G9KCElgHCyYGXrLy61dpIL8Y.INSTANCE).mo20141a(fVar);
    }
}
