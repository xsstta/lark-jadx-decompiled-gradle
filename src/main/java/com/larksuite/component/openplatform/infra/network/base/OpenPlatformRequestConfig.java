package com.larksuite.component.openplatform.infra.network.base;

import com.bytedance.ee.lark.infra.network.ref.entity.C12882h;
import com.bytedance.ee.lark.infra.network.ref.entity.ECONetworkSchema;
import com.bytedance.ee.lark.infra.network.ref.p636b.AbstractC12871g;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12872h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class OpenPlatformRequestConfig implements AbstractC12871g {
    @Override // com.bytedance.ee.lark.infra.network.ref.p636b.AbstractC12871g
    /* renamed from: b */
    public String mo48525b() {
        return "";
    }

    @Override // com.bytedance.ee.lark.infra.network.ref.p636b.AbstractC12871g
    /* renamed from: e */
    public Map<String, String> mo48528e() {
        return null;
    }

    @Override // com.bytedance.ee.lark.infra.network.ref.p636b.AbstractC12871g
    /* renamed from: f */
    public C12882h mo48529f() {
        return null;
    }

    /* renamed from: k */
    public abstract List<C12872h> mo88683k();

    @Override // com.bytedance.ee.lark.infra.network.ref.p636b.AbstractC12871g
    /* renamed from: a */
    public ECONetworkSchema mo48524a() {
        return ECONetworkSchema.HTTPS;
    }

    @Override // com.bytedance.ee.lark.infra.network.ref.p636b.AbstractC12871g
    /* renamed from: g */
    public List<C12872h> mo48530g() {
        ArrayList arrayList = new ArrayList();
        List<C12872h> j = mo88682j();
        List<C12872h> k = mo88683k();
        if (j != null && j.size() > 0) {
            arrayList.addAll(j);
        }
        if (k != null && k.size() > 0) {
            arrayList.addAll(k);
        }
        return arrayList;
    }

    /* renamed from: j */
    public List<C12872h> mo88682j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C25540a());
        arrayList.add(new C25541b());
        arrayList.add(new C25546g());
        arrayList.add(new C25543d());
        return arrayList;
    }
}
