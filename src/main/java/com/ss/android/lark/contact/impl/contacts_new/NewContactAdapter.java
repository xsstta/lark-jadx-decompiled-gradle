package com.ss.android.lark.contact.impl.contacts_new;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.dto.ChatApplication;
import com.ss.android.lark.contact.feat.p1745d.C35464c;
import com.ss.android.lark.contact.impl.contacts_new.NewContactView;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.contact.widget.HoverEventDisallowLinearLayout;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.inv.export.util.InvApmUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.C57768af;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.widget.listener.AbstractView$OnClickListenerC58542c;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class NewContactAdapter extends LarkRecyclerViewBaseAdapter<NewContactViewHolder, NewContactView.C35693a> {

    /* renamed from: a */
    public Context f92293a;

    /* renamed from: b */
    public AbstractC35689a f92294b;

    /* renamed from: c */
    public CallbackManager f92295c = new CallbackManager();

    /* renamed from: com.ss.android.lark.contact.impl.contacts_new.NewContactAdapter$a */
    public interface AbstractC35689a {
        /* renamed from: a */
        void mo131462a(NewContactView.C35693a aVar);

        /* renamed from: a */
        void mo131463a(String str, String str2);
    }

    public class NewContactViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private NewContactViewHolder f92308a;

        @Override // butterknife.Unbinder
        public void unbind() {
            NewContactViewHolder newContactViewHolder = this.f92308a;
            if (newContactViewHolder != null) {
                this.f92308a = null;
                newContactViewHolder.newContactLayout = null;
                newContactViewHolder.newContactAvatar = null;
                newContactViewHolder.newContactNameTV = null;
                newContactViewHolder.newContactTenantTV = null;
                newContactViewHolder.newContactExtraMessageTV = null;
                newContactViewHolder.confirmBtn = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public NewContactViewHolder_ViewBinding(NewContactViewHolder newContactViewHolder, View view) {
            this.f92308a = newContactViewHolder;
            newContactViewHolder.newContactLayout = (HoverEventDisallowLinearLayout) Utils.findRequiredViewAsType(view, R.id.contact_item_layout, "field 'newContactLayout'", HoverEventDisallowLinearLayout.class);
            newContactViewHolder.newContactAvatar = (LKUIRoundedImageView2) Utils.findRequiredViewAsType(view, R.id.contact_avatar, "field 'newContactAvatar'", LKUIRoundedImageView2.class);
            newContactViewHolder.newContactNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.contact_name, "field 'newContactNameTV'", TextView.class);
            newContactViewHolder.newContactTenantTV = (TextView) Utils.findRequiredViewAsType(view, R.id.contact_tenant, "field 'newContactTenantTV'", TextView.class);
            newContactViewHolder.newContactExtraMessageTV = (TextView) Utils.findRequiredViewAsType(view, R.id.contact_extra_message, "field 'newContactExtraMessageTV'", TextView.class);
            newContactViewHolder.confirmBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.confirm_btn, "field 'confirmBtn'", TextView.class);
        }
    }

    /* renamed from: a */
    public void mo131457a(AbstractC35689a aVar) {
        this.f92294b = aVar;
    }

    public class NewContactViewHolder extends RecyclerView.ViewHolder {
        TextView confirmBtn;
        LKUIRoundedImageView2 newContactAvatar;
        TextView newContactExtraMessageTV;
        HoverEventDisallowLinearLayout newContactLayout;
        TextView newContactNameTV;
        TextView newContactTenantTV;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NewContactViewHolder(View view) {
            super(view);
            NewContactAdapter.this = r1;
            ButterKnife.bind(this, view);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m139701a(NewContactView.C35693a aVar, View view) {
        AbstractC35689a aVar2 = this.f92294b;
        if (aVar2 == null) {
            return true;
        }
        aVar2.mo131462a(aVar);
        return true;
    }

    /* renamed from: a */
    public void mo131458a(final NewContactView.C35693a aVar, final int i) {
        final UIGetDataCallback uIGetDataCallback = new UIGetDataCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.contact.impl.contacts_new.NewContactAdapter.C356873 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                InvApmUtils.m158971b("contact_opt_approve_friend_request_success");
                ((NewContactView.C35693a) NewContactAdapter.this.getItem(i)).f92323g = ChatApplication.Status.AGREED;
                NewContactAdapter.this.notifyItemChanged(i);
                ViewUtils.m224150a(UIHelper.mustacheFormat((int) R.string.Lark_NewContacts_AcceptedContactRequestToast));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                AbstractC35361b.AbstractC35364c s = C35358a.m138143a().mo130174s();
                if (errorResult.getErrorCode() == s.mo130187b()) {
                    s.mo130186a(NewContactAdapter.this.f92293a, errorResult.getDisplayMsg(s.mo130188c()));
                    return;
                }
                Log.m165383e("ContactFeat", errorResult.getDisplayMsg());
                ViewUtils.m224150a(errorResult.getDisplayMsg());
                InvApmUtils.m158959a("contact_opt_approve_friend_request_fail", errorResult);
            }
        });
        Statistics.sendEvent("newcontact_add_click");
        C57768af.m224220b(this.f92293a, new C57768af.AbstractRunnableC57773c<Boolean>() {
            /* class com.ss.android.lark.contact.impl.contacts_new.NewContactAdapter.C356884 */

            /* renamed from: a */
            public void mo130914a(Boolean bool) {
            }

            /* renamed from: a */
            public Boolean mo130916b() {
                C35464c.m138729a(aVar.f92317a, (IGetDataCallback) NewContactAdapter.this.f92295c.wrapAndAddCallback(uIGetDataCallback));
                return true;
            }
        });
    }

    /* renamed from: a */
    public NewContactViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        Context context = viewGroup.getContext();
        this.f92293a = context;
        LayoutInflater from = LayoutInflater.from(context);
        if (DesktopUtil.m144301a(this.f92293a)) {
            i2 = R.layout.item_new_contact_desktop;
        } else {
            i2 = R.layout.item_new_contact;
        }
        return new NewContactViewHolder(from.inflate(i2, viewGroup, false));
    }

    /* renamed from: a */
    private void m139700a(ChatApplication.Status status, NewContactViewHolder newContactViewHolder) {
        if (status == ChatApplication.Status.PEDING) {
            newContactViewHolder.confirmBtn.setVisibility(0);
            newContactViewHolder.confirmBtn.setTextColor(UIHelper.getColor(R.color.primary_pri_500));
            newContactViewHolder.confirmBtn.setBackground(UIHelper.getDrawable(R.drawable.contact_external_or_new_item_bg));
            newContactViewHolder.confirmBtn.setText(UIHelper.getString(R.string.Lark_Legacy_Agree));
        } else if (status == ChatApplication.Status.AGREED || status == ChatApplication.Status.EXPIRED) {
            newContactViewHolder.confirmBtn.setVisibility(0);
            newContactViewHolder.confirmBtn.setBackground(null);
            newContactViewHolder.confirmBtn.setTextColor(UIHelper.getColor(R.color.text_placeholder));
            if (status == ChatApplication.Status.AGREED) {
                newContactViewHolder.confirmBtn.setText(UIHelper.getString(R.string.Lark_NewContacts_ContactRequestAccepted));
            } else {
                newContactViewHolder.confirmBtn.setText(UIHelper.getString(R.string.Lark_Legacy_FriendRequestExpired));
            }
        } else {
            newContactViewHolder.confirmBtn.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(NewContactViewHolder newContactViewHolder, final int i) {
        final NewContactView.C35693a aVar = (NewContactView.C35693a) getItem(i);
        String str = aVar.f92320d;
        String str2 = aVar.f92321e;
        newContactViewHolder.newContactNameTV.setText(str);
        if (!TextUtils.isEmpty(str2)) {
            newContactViewHolder.newContactTenantTV.setVisibility(0);
            newContactViewHolder.newContactTenantTV.setText(str2);
        } else {
            newContactViewHolder.newContactTenantTV.setVisibility(8);
        }
        int dp2px = UIHelper.dp2px(40.0f);
        C35358a.m138143a().mo130164i().mo130211a(this.f92293a, aVar.f92319c, aVar.f92318b, newContactViewHolder.newContactAvatar, dp2px, dp2px);
        final ChatApplication.Status status = aVar.f92323g;
        m139700a(status, newContactViewHolder);
        if (status == ChatApplication.Status.DELETED) {
            newContactViewHolder.newContactLayout.setVisibility(8);
        }
        newContactViewHolder.newContactExtraMessageTV.setText(aVar.f92322f);
        newContactViewHolder.confirmBtn.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.contact.impl.contacts_new.NewContactAdapter.C356851 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (status == ChatApplication.Status.PEDING) {
                    NewContactAdapter.this.mo131458a(aVar, i);
                } else if (NewContactAdapter.this.f92294b != null) {
                    NewContactAdapter.this.f92294b.mo131463a(aVar.f92318b, aVar.f92317a);
                }
            }
        });
        newContactViewHolder.newContactLayout.setOnClickListener(new AbstractView$OnClickListenerC58542c() {
            /* class com.ss.android.lark.contact.impl.contacts_new.NewContactAdapter.C356862 */

            @Override // com.ss.android.lark.widget.listener.AbstractView$OnClickListenerC58542c
            /* renamed from: a */
            public void mo123648a(View view) {
                ContactHitPoint.m140806h("member_avatar");
                if (NewContactAdapter.this.f92294b != null) {
                    NewContactAdapter.this.f92294b.mo131463a(aVar.f92318b, aVar.f92317a);
                }
            }
        });
        newContactViewHolder.newContactLayout.setOnLongClickListener(new View.OnLongClickListener(aVar) {
            /* class com.ss.android.lark.contact.impl.contacts_new.$$Lambda$NewContactAdapter$WIcvYvnOvgy1vN6NJX7kZk7Ipvc */
            public final /* synthetic */ NewContactView.C35693a f$1;

            {
                this.f$1 = r2;
            }

            public final boolean onLongClick(View view) {
                return NewContactAdapter.lambda$WIcvYvnOvgy1vN6NJX7kZk7Ipvc(NewContactAdapter.this, this.f$1, view);
            }
        });
    }
}
