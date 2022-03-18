package com.bytedance.ee.bear.bitable.card.view.table;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4525a;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f;
import com.bytedance.ee.bear.bitable.card.view.p258a.C4553i;
import com.bytedance.ee.bear.bitable.card.view.p258a.C4554j;
import com.bytedance.ee.bear.bitable.card.viewmodel.C4771b;
import com.bytedance.ee.bear.widgets.viewpager.AbstractC11869b;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.table.b */
public class C4739b extends AbstractC11869b {

    /* renamed from: a */
    public C4771b f13987a;

    /* renamed from: b */
    private List<C4525a> f13988b = new ArrayList();

    /* renamed from: c */
    private List<C4525a> f13989c = new ArrayList();

    /* renamed from: d */
    private List<AbstractC4549f> f13990d = new ArrayList();

    /* renamed from: e */
    private AbstractC4712d f13991e;

    /* renamed from: f */
    private AbstractC4741a f13992f;

    /* renamed from: com.bytedance.ee.bear.bitable.card.view.table.b$a */
    public interface AbstractC4741a {
        /* renamed from: a */
        void mo18469a(AbstractC4549f fVar);
    }

    @Override // com.bytedance.ee.bear.widgets.viewpager.AbstractC11869b
    /* renamed from: a */
    public int mo18476a() {
        return this.f13988b.size();
    }

    /* renamed from: a */
    public void mo18480a(AbstractC4741a aVar) {
        this.f13992f = aVar;
    }

    /* renamed from: a */
    public void mo18481a(List<C4525a> list) {
        this.f13989c.clear();
        this.f13989c.addAll(this.f13988b);
        this.f13988b.clear();
        this.f13988b.addAll(list);
        mo34842c();
    }

    @Override // com.bytedance.ee.bear.widgets.viewpager.AbstractC11869b
    /* renamed from: a */
    public int mo18477a(Object obj) {
        C4553i iVar = (C4553i) obj;
        C4525a b = iVar.mo17933b();
        if (!this.f13988b.contains(b)) {
            return -2;
        }
        int indexOf = this.f13989c.indexOf(b);
        int indexOf2 = this.f13988b.indexOf(b);
        C13479a.m54772d("RecordPageAdapter_update", "itemPosition changed, updateRecord");
        iVar.mo17932a(this.f13988b.get(indexOf2));
        if (indexOf == indexOf2) {
            return -1;
        }
        return indexOf2;
    }

    @Override // com.bytedance.ee.bear.widgets.viewpager.AbstractC11869b
    /* renamed from: a */
    public boolean mo18482a(View view, Object obj) {
        if (view == ((C4553i) obj).mo17931a().getRootView()) {
            return true;
        }
        return false;
    }

    public C4739b(C4771b bVar, AbstractC4712d dVar) {
        this.f13987a = bVar;
        this.f13991e = dVar;
    }

    @Override // com.bytedance.ee.bear.widgets.viewpager.AbstractC11869b
    /* renamed from: a */
    public Object mo18478a(ViewGroup viewGroup, int i) {
        AbstractC4549f fVar;
        C4525a aVar = this.f13988b.get(i);
        C13479a.m54772d("RecordPageAdapter", "instantiateItem, record is " + aVar);
        if (this.f13990d.isEmpty()) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bitable_record_layout, viewGroup, false);
            fVar = new C4554j(inflate, this.f13987a, this.f13991e);
            inflate.setScaleX(0.95f);
            inflate.setScaleY(0.95f);
            inflate.setAlpha(0.8f);
            C13479a.m54772d("RecordPageAdapter", "create view");
        } else {
            fVar = this.f13990d.remove(0);
            C13479a.m54772d("RecordPageAdapter_cache", "obtain view: " + fVar);
        }
        if (this.f13987a.getEnableFollow().mo5927b().booleanValue()) {
            fVar.setUpdateCardStatusListener(new AbstractC4549f.AbstractC4551b() {
                /* class com.bytedance.ee.bear.bitable.card.view.table.C4739b.C47401 */

                @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f.AbstractC4551b
                /* renamed from: a */
                public void mo17929a(String str) {
                    if (str != null) {
                        C4739b.this.f13987a.sendFollowData(str);
                    } else {
                        C13479a.m54758a("RecordPageAdapter", "get toppFeedId is null!");
                    }
                }
            });
        }
        viewGroup.addView(fVar.getRootView());
        C4553i iVar = new C4553i(fVar);
        iVar.mo17932a(aVar);
        C13479a.m54772d("RecordPageAdapter", "instantiateItem end");
        return iVar;
    }

    @Override // com.bytedance.ee.bear.widgets.viewpager.AbstractC11869b
    /* renamed from: b */
    public void mo18483b(ViewGroup viewGroup, int i, Object obj) {
        AbstractC4741a aVar;
        super.mo18483b(viewGroup, i, obj);
        if ((obj instanceof C4553i) && (aVar = this.f13992f) != null) {
            aVar.mo18469a(((C4553i) obj).mo17931a());
        }
    }

    @Override // com.bytedance.ee.bear.widgets.viewpager.AbstractC11869b
    /* renamed from: a */
    public void mo18479a(ViewGroup viewGroup, int i, Object obj) {
        C4553i iVar = (C4553i) obj;
        AbstractC4549f a = iVar.mo17931a();
        a.mo17916b();
        viewGroup.removeView(a.getRootView());
        this.f13990d.add(a);
        iVar.mo17934c();
        C13479a.m54772d("RecordPageAdapter_cache", "recycler view: " + a);
        C13479a.m54772d("RecordPageAdapter", "destroyItem, record is " + iVar.mo17933b());
    }
}
