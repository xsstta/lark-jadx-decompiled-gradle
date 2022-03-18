package com.ss.android.lark.main.app.drawer.adapter;

import android.content.Context;
import android.view.View;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.drawer.p2232a.C44212a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.utils.C57832h;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.main.app.drawer.adapter.d */
public class C44222d extends AbstractC44213a<TenantInfo> {
    public C44222d(Context context) {
        super(context);
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        return Long.parseLong(((TenantInfo) getItem(i)).getUserId());
    }

    /* renamed from: a */
    private void m175402a(TenantItemHolder tenantItemHolder) {
        tenantItemHolder.mAvatar.setAlpha(0.3f);
        tenantItemHolder.mTenantName.setTextColor(UIHelper.getColor(R.color.text_placeholder));
    }

    /* renamed from: b */
    private void m175404b(TenantItemHolder tenantItemHolder) {
        tenantItemHolder.mAvatar.setAlpha(1.0f);
        tenantItemHolder.mTenantName.setTextColor(UIHelper.getColor(R.color.text_title));
        UIUtils.hide(tenantItemHolder.unvalidTipView);
    }

    /* renamed from: b */
    private void m175405b(TenantItemHolder tenantItemHolder, TenantInfo tenantInfo) {
        m175402a(tenantItemHolder);
        if (tenantInfo.isNewUser()) {
            UIUtils.hide(tenantItemHolder.unvalidTipView);
            UIUtils.show(tenantItemHolder.mTenantAvatarBadge);
            tenantItemHolder.mTenantAvatarBadge.mo89319a("New").mo89316a(12.0f).mo89322b(R.drawable.new_tenant_bg).mo89320a();
            return;
        }
        UIUtils.show(tenantItemHolder.unvalidTipView);
        UIUtils.hide(tenantItemHolder.mTenantAvatarBadge);
    }

    /* renamed from: a */
    private void m175403a(TenantItemHolder tenantItemHolder, TenantInfo tenantInfo) {
        m175404b(tenantItemHolder);
        if (tenantInfo.getBadgeCount() <= 0 || tenantInfo.isCurrentUser() || !this.f112187c) {
            tenantItemHolder.mTenantAvatarBadge.setVisibility(8);
            return;
        }
        tenantItemHolder.mTenantAvatarBadge.setVisibility(0);
        C44212a.m175385a(tenantItemHolder.mTenantAvatarBadge, tenantInfo.getBadgeCount(), true);
        Log.m165389i("TenantInfoAdapter", "data.getBadgeCount() = " + tenantInfo.getBadgeCount());
    }

    /* renamed from: a */
    public void onBindViewHolder(TenantItemHolder tenantItemHolder, int i) {
        int i2;
        final TenantInfo tenantInfo = (TenantInfo) getItem(i);
        if (tenantInfo == null) {
            Log.m165397w("TenantInfoAdapter", "tenant data is null!");
            return;
        }
        mo157240a(tenantItemHolder.mAvatar, tenantInfo.getAvatarUrl());
        tenantItemHolder.mTenantName.setText(tenantInfo.getTenantName());
        View view = tenantItemHolder.mCurrentUserIndicator;
        if (tenantInfo.isCurrentUser()) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        view.setVisibility(i2);
        tenantItemHolder.itemView.setOnClickListener(new C57832h.AbstractView$OnClickListenerC57837c(this.f112189e, 500) {
            /* class com.ss.android.lark.main.app.drawer.adapter.C44222d.C442231 */

            @Override // com.ss.android.lark.utils.C57832h.AbstractView$OnClickListenerC57837c
            /* renamed from: a */
            public void mo146063a(View view) {
                if (C44222d.this.f112188d != null && tenantInfo.isCurrentUser()) {
                    C44222d.this.f112188d.mo157213a(view);
                }
            }

            @Override // com.ss.android.lark.utils.C57832h.AbstractView$OnClickListenerC57837c
            /* renamed from: a */
            public void mo146064a(View view, int i) {
                if (C44222d.this.f112186b != null && !tenantInfo.isCurrentUser()) {
                    C44222d.this.f112186b.mo157212a(tenantInfo);
                }
            }
        });
        if (i == 0) {
            this.f112187c = C44134a.m174959a().mo133270z().mo133361a("lark.tenant.penetration.enable");
        }
        Log.m165389i("TeantInfoAdapter", "mTenantPenetrationEnable: " + this.f112187c);
        if (tenantInfo.isSessionValid()) {
            m175403a(tenantItemHolder, tenantInfo);
        } else {
            m175405b(tenantItemHolder, tenantInfo);
        }
    }
}
