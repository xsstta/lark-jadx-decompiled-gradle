package com.larksuite.component.openplatform.infra.network.configcenter;

import com.bytedance.ee.lark.infra.network.ref.entity.AbstractC12876c;
import com.bytedance.ee.lark.infra.network.ref.entity.AbstractC12877d;
import com.bytedance.ee.lark.infra.network.ref.entity.MethodType;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12865a;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12872h;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.component.openplatform.infra.network.base.C25542c;
import com.larksuite.component.openplatform.infra.network.base.OpenPlatformRequestConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinaRequestConfig extends OpenPlatformRequestConfig {
    @Override // com.bytedance.ee.lark.infra.network.ref.p636b.AbstractC12871g
    /* renamed from: c */
    public String mo48526c() {
        return "/config/get";
    }

    @Override // com.bytedance.ee.lark.infra.network.ref.p636b.AbstractC12871g
    /* renamed from: i */
    public AbstractC12877d mo48532i() {
        return null;
    }

    @Override // com.bytedance.ee.lark.infra.network.ref.p636b.AbstractC12871g
    /* renamed from: d */
    public MethodType mo48527d() {
        return MethodType.POST;
    }

    @Override // com.bytedance.ee.lark.infra.network.ref.p636b.AbstractC12871g
    /* renamed from: h */
    public AbstractC12876c mo48531h() {
        return new C12865a();
    }

    @Override // com.larksuite.component.openplatform.infra.network.base.OpenPlatformRequestConfig, com.bytedance.ee.lark.infra.network.ref.p636b.AbstractC12871g
    /* renamed from: e */
    public Map<String, String> mo48528e() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/json");
        return hashMap;
    }

    @Override // com.larksuite.component.openplatform.infra.network.base.OpenPlatformRequestConfig
    /* renamed from: k */
    public List<C12872h> mo88683k() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C25542c(DomainSettings.Alias.MP_CONFIG));
        arrayList.add(new C25547a());
        return arrayList;
    }
}
