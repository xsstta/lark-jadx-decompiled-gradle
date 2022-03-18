package com.ss.android.lark.main.app.widgets.desktop.tenant_switcher;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.AbstractC44462a;
import com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44473d;
import com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.MainTenantSwitcherView;
import com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.entity.C44487b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MainTenantSwitcher extends ConstraintLayout implements AbstractC44462a {

    /* renamed from: a */
    C44473d f112776a;

    /* renamed from: b */
    Map<AbstractC44462a.AbstractC44463a, Integer> f112777b = new ConcurrentHashMap();

    /* renamed from: c */
    View f112778c;

    /* renamed from: d */
    private MainTenantSwitcherView.AbstractC44456a f112779d = new MainTenantSwitcherView.AbstractC44456a() {
        /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.MainTenantSwitcher.C444502 */

        @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.MainTenantSwitcherView.AbstractC44456a
        /* renamed from: a */
        public void mo157850a() {
            for (AbstractC44462a.AbstractC44463a aVar : MainTenantSwitcher.this.f112777b.keySet()) {
                aVar.mo157340b(true);
            }
        }

        @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.MainTenantSwitcherView.AbstractC44456a
        /* renamed from: b */
        public void mo157853b() {
            for (AbstractC44462a.AbstractC44463a aVar : MainTenantSwitcher.this.f112777b.keySet()) {
                aVar.mo157340b(false);
            }
        }

        @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.MainTenantSwitcherView.AbstractC44456a
        /* renamed from: a */
        public void mo157851a(MainTenantSwitcherView mainTenantSwitcherView) {
            ButterKnife.bind(mainTenantSwitcherView, MainTenantSwitcher.this.f112778c);
        }

        @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.MainTenantSwitcherView.AbstractC44456a
        /* renamed from: a */
        public void mo157852a(boolean z) {
            for (AbstractC44462a.AbstractC44463a aVar : MainTenantSwitcher.this.f112777b.keySet()) {
                aVar.mo157339a(z);
            }
        }
    };

    /* renamed from: b */
    public void mo157847b() {
        this.f112776a.destroy();
    }

    /* renamed from: a */
    public void mo157845a() {
        this.f112778c = LayoutInflater.from(getContext()).inflate(R.layout.tenant_switch_list_view, (ViewGroup) this, true);
        m176376c();
    }

    /* renamed from: c */
    private void m176376c() {
        C44473d dVar = new C44473d(new C44470c(), new MainTenantSwitcherView(getContext(), this.f112779d));
        this.f112776a = dVar;
        dVar.mo157893a(new C44473d.AbstractC44485a() {
            /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.MainTenantSwitcher.C444491 */

            @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44473d.AbstractC44485a
            /* renamed from: a */
            public void mo157849a(C44487b bVar) {
                for (AbstractC44462a.AbstractC44463a aVar : MainTenantSwitcher.this.f112777b.keySet()) {
                    aVar.mo157338a(bVar);
                }
            }
        });
        this.f112776a.create();
    }

    /* renamed from: a */
    public void mo157846a(AbstractC44462a.AbstractC44463a aVar) {
        this.f112777b.put(aVar, 0);
    }

    /* renamed from: b */
    public void mo157848b(AbstractC44462a.AbstractC44463a aVar) {
        this.f112777b.remove(aVar);
    }

    public MainTenantSwitcher(Context context) {
        super(context);
    }

    public MainTenantSwitcher(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MainTenantSwitcher(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
