package com.bytedance.ee.bear.sheet.inputbar.at.p545a;

import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.p398i.C7827a;
import com.bytedance.ee.bear.p398i.C7838i;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.at.a.a */
public class C11190a extends C7827a {

    /* renamed from: d */
    private final List<BaseSegment> f30111d;

    /* renamed from: e */
    private final Map<Object, BaseSegment> f30112e;

    /* renamed from: b */
    public List<BaseSegment> mo42775b() {
        return this.f30111d;
    }

    /* renamed from: c */
    public Map<Object, BaseSegment> mo42776c() {
        return this.f30112e;
    }

    public C11190a() {
        this.f30111d = new ArrayList();
        this.f30112e = new HashMap();
    }

    public C11190a(String str, C4517a[] aVarArr, C7838i[] iVarArr, List<BaseSegment> list, Map<Object, BaseSegment> map) {
        super(str, aVarArr, iVarArr);
        ArrayList arrayList = new ArrayList();
        this.f30111d = arrayList;
        HashMap hashMap = new HashMap();
        this.f30112e = hashMap;
        if (list != null) {
            arrayList.addAll(list);
        }
        if (map != null) {
            hashMap.putAll(map);
        }
    }
}
