package com.bytedance.platform.godzilla.sysopt;

import com.bytedance.platform.godzilla.plugin.AbstractC20329a;
import com.bytedance.platform.godzilla.plugin.AbstractC20330b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.platform.godzilla.sysopt.g */
public class C20338g extends AbstractC20330b {
    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "SysOptPlugin";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20330b
    /* renamed from: c */
    public List<AbstractC20329a> mo68541c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C20334c());
        arrayList.add(new C20332a(true, true));
        arrayList.add(new C20337f());
        arrayList.add(new C20335d());
        arrayList.add(new C20333b());
        return arrayList;
    }
}
