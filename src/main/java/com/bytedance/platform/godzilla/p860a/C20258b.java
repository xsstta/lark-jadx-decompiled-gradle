package com.bytedance.platform.godzilla.p860a;

import com.bytedance.platform.godzilla.p860a.p870d.C20282a;
import com.bytedance.platform.godzilla.p860a.p870d.C20283b;
import com.bytedance.platform.godzilla.p860a.p870d.C20285d;
import com.bytedance.platform.godzilla.p860a.p870d.C20287f;
import com.bytedance.platform.godzilla.p860a.p870d.C20290h;
import com.bytedance.platform.godzilla.p860a.p870d.C20291i;
import com.bytedance.platform.godzilla.plugin.AbstractC20329a;
import com.bytedance.platform.godzilla.plugin.AbstractC20330b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.platform.godzilla.a.b */
public class C20258b extends AbstractC20330b {
    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "CrashPlugin";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20330b
    /* renamed from: c */
    public List<AbstractC20329a> mo68541c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C20282a());
        arrayList.add(new C20283b());
        arrayList.add(new C20285d());
        arrayList.add(new C20287f());
        arrayList.add(new C20290h());
        arrayList.add(new C20291i());
        arrayList.add(new C20293f());
        arrayList.add(new C20254a());
        arrayList.add(new C20292e());
        arrayList.add(new C20294g());
        return arrayList;
    }
}
