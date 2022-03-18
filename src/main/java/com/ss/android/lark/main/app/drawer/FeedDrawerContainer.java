package com.ss.android.lark.main.app.drawer;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.drawer.C44232c;
import com.ss.android.lark.main.app.drawer.FeedDrawerView;
import com.ss.android.lark.main.interfaces.IMainDrawer;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;

public class FeedDrawerContainer extends LinearLayout implements IMainDrawer {

    /* renamed from: a */
    public AbstractC44548e f112136a;

    /* renamed from: b */
    FeedDrawerView.AbstractC44206a f112137b = new FeedDrawerView.AbstractC44206a() {
        /* class com.ss.android.lark.main.app.drawer.FeedDrawerContainer.C441921 */

        @Override // com.ss.android.lark.main.app.drawer.FeedDrawerView.AbstractC44206a
        /* renamed from: a */
        public void mo157187a() {
            C44134a.m174959a().mo133246d();
        }

        @Override // com.ss.android.lark.main.app.drawer.FeedDrawerView.AbstractC44206a
        /* renamed from: a */
        public void mo157188a(C44232c.AbstractC44235b bVar) {
            ButterKnife.bind(bVar, FeedDrawerContainer.this);
        }

        @Override // com.ss.android.lark.main.app.drawer.FeedDrawerView.AbstractC44206a
        /* renamed from: a */
        public void mo157189a(TenantInfo tenantInfo) {
            C44134a.m174959a().mo133188H().mo133396a(FeedDrawerContainer.this.getContext(), tenantInfo.getUserId());
        }

        @Override // com.ss.android.lark.main.app.drawer.FeedDrawerView.AbstractC44206a
        /* renamed from: a */
        public void mo157190a(boolean z) {
            FeedDrawerContainer.this.f112136a.mo99186a(z);
        }
    };

    /* renamed from: c */
    private Configuration f112138c = new Configuration();

    /* renamed from: d */
    private C44224b f112139d;

    /* renamed from: e */
    private FragmentManager f112140e;

    @Override // com.ss.android.lark.main.interfaces.IMainDrawer
    public View getContentView() {
        return this;
    }

    @Override // com.ss.android.lark.main.interfaces.IMainDrawer
    /* renamed from: a */
    public void mo157182a() {
        C44224b bVar = this.f112139d;
        if (bVar != null) {
            bVar.destroy();
        }
    }

    /* renamed from: b */
    private void m175329b() {
        C44224b bVar = new C44224b(new FeedDrawerView(getContext(), this.f112140e, this.f112137b), new C44207a());
        this.f112139d = bVar;
        bVar.create();
    }

    @Override // com.ss.android.lark.main.interfaces.IMainDrawer
    /* renamed from: a */
    public void mo157183a(int i) {
        C44224b bVar = this.f112139d;
        if (bVar != null) {
            bVar.mo157252a(i);
        }
    }

    public FeedDrawerContainer(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        boolean z;
        super.onConfigurationChanged(configuration);
        if ((this.f112138c.updateFrom(configuration) & 1024) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f112139d.mo157255d();
        }
    }

    public FeedDrawerContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.ss.android.lark.main.interfaces.IMainDrawer
    /* renamed from: a */
    public void mo157184a(FragmentManager fragmentManager, AbstractC44548e eVar) {
        this.f112136a = eVar;
        LayoutInflater.from(getContext()).inflate(R.layout.activity_feed_drawer, this);
        this.f112140e = fragmentManager;
        m175329b();
        this.f112138c.updateFrom(getResources().getConfiguration());
    }

    public FeedDrawerContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
