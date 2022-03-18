package com.ss.android.lark.main.app.drawer.adapter;

import android.content.Context;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.utils.C57832h;

/* renamed from: com.ss.android.lark.main.app.drawer.adapter.b */
public class C44216b extends AbstractC44213a<TenantInfo.PendingUser> {
    public C44216b(Context context) {
        super(context);
        setHasStableIds(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        return (long) ((TenantInfo.PendingUser) getItem(i)).hashCode();
    }

    /* renamed from: a */
    public void onBindViewHolder(TenantItemHolder tenantItemHolder, int i) {
        final TenantInfo.PendingUser pendingUser = (TenantInfo.PendingUser) getItem(i);
        mo157240a(tenantItemHolder.mAvatar, pendingUser.tenantIconUrl);
        tenantItemHolder.mCurrentUserIndicator.setVisibility(4);
        tenantItemHolder.itemView.setOnClickListener(new C57832h.AbstractView$OnClickListenerC57837c(this.f112189e, 500) {
            /* class com.ss.android.lark.main.app.drawer.adapter.C44216b.C442171 */

            @Override // com.ss.android.lark.utils.C57832h.AbstractView$OnClickListenerC57837c
            /* renamed from: a */
            public void mo146063a(View view) {
            }

            @Override // com.ss.android.lark.utils.C57832h.AbstractView$OnClickListenerC57837c
            /* renamed from: a */
            public void mo146064a(View view, int i) {
                if (C44216b.this.f112186b != null) {
                    C44216b.this.f112186b.mo157212a(pendingUser);
                }
            }
        });
        if (this.f112187c) {
            tenantItemHolder.mTenantAvatarBadge.mo89322b(R.drawable.tenant_badge_pending_user_bg).mo89320a();
        } else {
            tenantItemHolder.mTenantAvatarBadge.setVisibility(8);
        }
    }
}
