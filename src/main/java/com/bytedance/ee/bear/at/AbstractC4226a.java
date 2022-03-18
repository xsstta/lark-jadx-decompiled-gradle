package com.bytedance.ee.bear.at;

import android.view.View;
import com.bytedance.ee.bear.at.AbstractC4230c;
import com.bytedance.ee.bear.atfinder.View$OnKeyListenerC4262a;
import com.bytedance.ee.bear.bean.C4520c;
import com.bytedance.ee.bear.p526r.C10598a;
import com.bytedance.ee.bear.p526r.C10599b;
import com.bytedance.ee.bear.widget.AtFinderView;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.at.a */
public abstract class AbstractC4226a implements AbstractC4230c {

    /* renamed from: a */
    public AbstractC4230c.AbstractC4232b f12740a;

    /* renamed from: b */
    public View$OnKeyListenerC4262a f12741b;

    /* renamed from: c */
    public AtFinderView f12742c;

    @Override // com.bytedance.ee.bear.at.AbstractC4230c
    /* renamed from: a */
    public void mo16627a(int i) {
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4230c
    /* renamed from: a */
    public void mo16628a(View view) {
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4230c
    /* renamed from: b */
    public void mo16634b(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ArrayList<String> mo16626a() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(C10599b.m43906b());
        arrayList.addAll(Arrays.asList(C10598a.f28440b));
        return arrayList;
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4230c
    /* renamed from: a */
    public void mo16629a(AbstractC4230c.AbstractC4232b bVar) {
        this.f12740a = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16630a(C4233d dVar) {
        if (dVar.f12764m != null) {
            this.f12742c.setSearchDelegate(dVar.f12764m);
        } else {
            C13479a.m54775e("AbsAtWindow", "setSearchDelegate: null");
        }
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4230c
    /* renamed from: a */
    public void mo16631a(C4520c cVar) {
        this.f12741b.mo16783a(cVar);
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4230c
    /* renamed from: a */
    public void mo16632a(Map<String, Object> map) {
        this.f12741b.mo16785a(map);
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4230c
    /* renamed from: a */
    public void mo16633a(boolean z) {
        this.f12741b.mo16789b(z);
    }
}
