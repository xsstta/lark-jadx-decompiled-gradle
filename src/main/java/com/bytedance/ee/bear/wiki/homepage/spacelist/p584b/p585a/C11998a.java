package com.bytedance.ee.bear.wiki.homepage.spacelist.p584b.p585a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.list.cache.C8213o;
import com.bytedance.ee.bear.list.preload.ListTitleView;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.wiki.homepage.spacelist.p584b.AbstractC11997a;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wiki.homepage.spacelist.b.a.a */
public class C11998a extends RecyclerView.Adapter<C12000b> {

    /* renamed from: a */
    private AbstractC11997a f32386a;

    /* renamed from: b */
    private C10917c f32387b;

    /* renamed from: c */
    private AbstractC5233x f32388c = C5234y.m21391b();

    /* renamed from: d */
    private AbstractC11999a f32389d;

    /* renamed from: e */
    private AbstractC5197b f32390e = ((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class));

    /* renamed from: f */
    private List<C8213o> f32391f;

    /* renamed from: com.bytedance.ee.bear.wiki.homepage.spacelist.b.a.a$a */
    public interface AbstractC11999a {
        void onSpaceItemClick(View view, int i, C8213o oVar);
    }

    /* renamed from: a */
    public void mo45955a() {
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<C8213o> list = this.f32391f;
        if (list != null) {
            return list.size();
        }
        C13479a.m54758a("WikiAllSpaceListAdapter", "getItemCount() spaceList = null");
        return 0;
    }

    /* renamed from: a */
    public void mo45956a(AbstractC11999a aVar) {
        this.f32389d = aVar;
    }

    /* renamed from: a */
    public void mo45958a(List<C8213o> list) {
        if (list == null) {
            C13479a.m54758a("WikiAllSpaceListAdapter", "setSPaceList() spaceList = null");
        } else {
            this.f32391f = list;
        }
    }

    public C11998a(AbstractC11997a aVar, C10917c cVar) {
        this.f32386a = aVar;
        this.f32387b = cVar;
    }

    /* renamed from: a */
    public C12000b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C12000b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_doc_recycler_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C12000b bVar, int i) {
        C8213o oVar;
        boolean z;
        if (i < this.f32391f.size() && (oVar = this.f32391f.get(i)) != null) {
            if (oVar.mo32190e() == 0) {
                bVar.f32395d.setImageResource(R.drawable.ud_icon_wikibook_circle_colorful);
            } else {
                bVar.f32395d.setImageResource(R.drawable.ud_icon_wikibooklock_circle_colorful);
            }
            ListTitleView listTitleView = bVar.f32394c;
            if (!oVar.mo32195g() || !this.f32390e.mo20801b().mo20778d().f14914a) {
                z = false;
            } else {
                z = true;
            }
            listTitleView.setStarVisible(z);
            bVar.f32394c.setTitle(oVar.mo32184c());
            if (!TextUtils.isEmpty(oVar.mo32192f())) {
                bVar.f32396e.setText(oVar.mo32192f());
            } else {
                bVar.f32396e.setText(R.string.Doc_Wiki_Home_DescriptionEmptyText);
            }
            bVar.f32392a.setSwipeEnable(false);
            bVar.f32393b.setOnClickListener(new View.OnClickListener(i, oVar) {
                /* class com.bytedance.ee.bear.wiki.homepage.spacelist.p584b.p585a.$$Lambda$a$B2UNxDKXD03Fr6PK1yYC5jsxjA */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ C8213o f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(View view) {
                    C11998a.m270037lambda$B2UNxDKXD03Fr6PK1yYC5jsxjA(C11998a.this, this.f$1, this.f$2, view);
                }
            });
            if (this.f32386a.mo45952a()) {
                bVar.f32393b.setEnabled(true);
                bVar.f32393b.setAlpha(1.0f);
                return;
            }
            bVar.f32393b.setEnabled(false);
            bVar.f32393b.setAlpha(0.3f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m49764a(int i, C8213o oVar, View view) {
        AbstractC11999a aVar = this.f32389d;
        if (aVar != null) {
            aVar.onSpaceItemClick(view, i, oVar);
        }
    }
}
