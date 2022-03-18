package com.bytedance.ee.bear.document.at;

import com.bytedance.ee.bear.atbottombar.C4260d;
import com.bytedance.ee.bear.atfinder.AbstractC4270e;
import com.bytedance.ee.bear.atfinder.AtFinderResultList;
import com.bytedance.ee.bear.atfinder.MentionModel;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.document.at.e */
public abstract class AbstractC5670e implements AbstractC4270e {

    /* renamed from: a */
    private ArrayList<C4260d> f16029a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo22651a(ArrayList<C4260d> arrayList);

    @Override // com.bytedance.ee.bear.atfinder.AbstractC4270e
    /* renamed from: a */
    public List<C4260d> mo16808a() {
        return this.f16029a;
    }

    public AbstractC5670e() {
        ArrayList<C4260d> arrayList = new ArrayList<>();
        this.f16029a = arrayList;
        mo22651a(arrayList);
    }

    @Override // com.bytedance.ee.bear.atfinder.AbstractC4270e
    /* renamed from: a */
    public void mo16809a(AtFinderResultList atFinderResultList) {
        C13479a.m54772d("BaseMentionDelegate", "onSelectData ");
    }

    @Override // com.bytedance.ee.bear.atfinder.AbstractC4270e
    /* renamed from: a */
    public void mo16810a(MentionModel mentionModel) {
        for (C4260d dVar : mo16808a()) {
            dVar.mo16726a(mentionModel);
        }
    }
}
