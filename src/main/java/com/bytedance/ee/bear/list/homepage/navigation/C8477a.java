package com.bytedance.ee.bear.list.homepage.navigation;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.larksuite.component.universe_design.badge.UDBadgeView;

/* renamed from: com.bytedance.ee.bear.list.homepage.navigation.a */
public class C8477a extends BaseQuickAdapter<C8482c, C8483d> {

    /* renamed from: a */
    public AbstractC8479a f22894a;

    /* renamed from: b */
    private View f22895b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.list.homepage.navigation.a$a */
    public interface AbstractC8479a {
        void onItemClick(View view, int i, C8482c cVar);
    }

    /* renamed from: a */
    public View mo18916a() {
        return this.f22895b;
    }

    public C8477a() {
        super(0);
    }

    /* renamed from: a */
    public void mo33146a(AbstractC8479a aVar) {
        this.f22894a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C8483d mo32344a(ViewGroup viewGroup, int i) {
        return new C8483d(new NavigationItemView(this.f51211q));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(final C8483d dVar, final C8482c cVar) {
        int i;
        dVar.f22909a.f22890a.setImageResource(cVar.f22906b);
        dVar.f22909a.mo33145a(this.f51211q.getString(cVar.f22907c));
        UDBadgeView uDBadgeView = dVar.f22909a.f22892c;
        if (cVar.f22908d) {
            i = 0;
        } else {
            i = 8;
        }
        uDBadgeView.setVisibility(i);
        dVar.f22909a.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.homepage.navigation.C8477a.C84781 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C8477a.this.f22894a != null) {
                    C8477a.this.f22894a.onItemClick(view, dVar.getAdapterPosition(), cVar);
                }
            }
        });
        if (cVar.mo33151a() == NavigationEnum.SHARED_SPACE.id) {
            this.f22895b = dVar.f22909a.f22891b;
        }
    }
}
