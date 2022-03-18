package com.bytedance.ee.bear.middleground.permission;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.permission.ReadPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10160d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.bytedance.ee.bear.middleground.permission.i */
public class C9923i implements AbstractC10160d {

    /* renamed from: a */
    private ReadPermission f26830a;

    /* renamed from: b */
    private Map<String, Function1<String, Unit>> f26831b = new HashMap();

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10160d
    /* renamed from: a */
    public void mo37762a() {
        this.f26831b.clear();
        ReadPermission fVar = this.f26830a;
        if (fVar != null) {
            fVar.mo37719a();
            this.f26830a = null;
        }
    }

    /* renamed from: b */
    private void m41306b() {
        if (this.f26830a == null) {
            this.f26830a = new ReadPermission("native", new WeakReference(new Function1() {
                /* class com.bytedance.ee.bear.middleground.permission.$$Lambda$i$dy_Mvkl2bT6noEgvn88Iz24RcZE */

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C9923i.this.m41305a((List) obj);
                }
            }));
        }
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10160d
    /* renamed from: a */
    public void mo37763a(String str) {
        this.f26831b.remove(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Unit m41305a(List list) {
        for (String str : this.f26831b.keySet()) {
            Function1<String, Unit> function1 = this.f26831b.get(str);
            if (function1 != null) {
                function1.invoke(JSON.toJSONString(list));
            }
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10160d
    /* renamed from: a */
    public void mo37764a(String str, Function1<String, Unit> function1) {
        this.f26831b.put(str, function1);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10160d
    /* renamed from: a */
    public void mo37765a(List<C8275a> list, List<String> list2) {
        m41306b();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new ReadPermission.FileInfo(list.get(i), list2.get(i)));
        }
        this.f26830a.mo37722a(arrayList);
    }
}
