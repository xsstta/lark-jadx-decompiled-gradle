package com.bytedance.ee.bear.middleground.permission.apply;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.permission.sharefolder.FolderPermissionManagerDispatcher;
import io.reactivex.AbstractC68307f;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.bear.middleground.permission.apply.b */
public class C9560b {

    /* renamed from: a */
    private NetService f25659a;

    /* renamed from: b */
    private String f25660b;

    /* renamed from: c */
    private String f25661c;

    /* renamed from: d */
    private boolean f25662d;

    /* renamed from: a */
    public AbstractC68307f<NetService.Result<String>> mo36615a(boolean z, String str, int i) {
        if (z) {
            return FolderPermissionManagerDispatcher.m41256a(this.f25662d).mo37734a(this.f25660b, i, str);
        }
        NetService.AbstractC5075d a = this.f25659a.mo20117a(new C9574g());
        HashMap hashMap = new HashMap();
        hashMap.put("token", this.f25660b);
        if (str != null) {
            hashMap.put("message", str);
        }
        NetService.C5077f fVar = new NetService.C5077f("/api/suite/permission/apply_permission/");
        hashMap.put("obj_type", this.f25661c);
        hashMap.put("permission", String.valueOf(i));
        fVar.mo20147a(hashMap);
        fVar.mo20143a(1);
        return a.mo20141a(fVar);
    }

    public C9560b(NetService netService, String str, String str2, boolean z) {
        this.f25659a = netService;
        this.f25660b = str;
        this.f25661c = str2;
        this.f25662d = z;
    }
}
