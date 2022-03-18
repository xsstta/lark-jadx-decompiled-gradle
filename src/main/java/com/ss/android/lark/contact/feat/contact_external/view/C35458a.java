package com.ss.android.lark.contact.feat.contact_external.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.feat.contact_external.data.ExternalContactViewData;
import com.ss.android.lark.contact.impl.contacts_home.ContactsHomeItemViewHolder;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.UserStatusHelper;
import com.ss.android.lark.widget.listener.C58546g;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.contact.feat.contact_external.view.a */
public class C35458a extends IndexRecyclerViewAdapter<ContactsHomeItemViewHolder, ExternalContactViewData> {

    /* renamed from: a */
    public AbstractC35461a f91661a;

    /* renamed from: c */
    private Context f91662c;

    /* renamed from: com.ss.android.lark.contact.feat.contact_external.view.a$a */
    public interface AbstractC35461a {
        /* renamed from: a */
        void mo130802a(ExternalContactViewData aVar);

        /* renamed from: a */
        void mo130803a(String str);
    }

    /* renamed from: a */
    public void mo130851a(AbstractC35461a aVar) {
        this.f91661a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f91662c = recyclerView.getContext();
    }

    @Override // com.ss.android.lark.contact.feat.contact_external.view.IndexRecyclerViewAdapter
    /* renamed from: a */
    public Map<Integer, String> mo130850a(List<? extends ExternalContactViewData> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.size() == 0) {
            return new HashMap();
        }
        linkedHashMap.put(0, ((ExternalContactViewData) list.get(0)).mo130787i());
        for (int i = 1; i < list.size(); i++) {
            ExternalContactViewData aVar = (ExternalContactViewData) list.get(i);
            if (!((ExternalContactViewData) list.get(i - 1)).mo130787i().equalsIgnoreCase(aVar.mo130787i())) {
                linkedHashMap.put(Integer.valueOf(i), aVar.mo130787i());
            }
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m138685a(ExternalContactViewData aVar, View view) {
        AbstractC35461a aVar2 = this.f91661a;
        if (aVar2 == null) {
            return true;
        }
        aVar2.mo130802a(aVar);
        return true;
    }

    /* renamed from: a */
    public ContactsHomeItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        LayoutInflater from = LayoutInflater.from(this.f91662c);
        if (DesktopUtil.m144307b()) {
            i2 = R.layout.activity_contacts_home_item_desktop;
        } else {
            i2 = R.layout.activity_contacts_home_item;
        }
        return new ContactsHomeItemViewHolder(from.inflate(i2, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(ContactsHomeItemViewHolder contactsHomeItemViewHolder, int i) {
        final ExternalContactViewData aVar = (ExternalContactViewData) getItem(i);
        String a = aVar.mo130766a();
        String g = aVar.mo130783g();
        if (!TextUtils.isEmpty(g)) {
            a = String.format("%s(%s)", a, g);
        }
        String b = aVar.mo130771b();
        contactsHomeItemViewHolder.contactNameTV.setText(a);
        contactsHomeItemViewHolder.contactNameTV.setMaxLines(1);
        contactsHomeItemViewHolder.contactNameTV.setEllipsize(TextUtils.TruncateAt.END);
        contactsHomeItemViewHolder.contactTenantTV.setText(b);
        if (!TextUtils.isEmpty(b)) {
            contactsHomeItemViewHolder.contactTenantTV.setVisibility(0);
            contactsHomeItemViewHolder.contactTenantTV.setText(b);
            contactsHomeItemViewHolder.contactNameTV.setPadding(0, UIHelper.dp2px(4.0f), 0, 0);
            contactsHomeItemViewHolder.contactUserStatus.setPadding(0, UIHelper.dp2px(4.0f), 0, 0);
        } else {
            contactsHomeItemViewHolder.contactTenantTV.setVisibility(8);
            contactsHomeItemViewHolder.contactNameTV.setPadding(0, 0, 0, 0);
            contactsHomeItemViewHolder.contactUserStatus.setPadding(0, 0, 0, 0);
        }
        int dp2px = UIHelper.dp2px(48.0f);
        C35358a.m138143a().mo130164i().mo130211a(this.f91662c, aVar.mo130773c(), aVar.mo130776d(), contactsHomeItemViewHolder.contactAvatar, dp2px, dp2px);
        contactsHomeItemViewHolder.checkBox.setVisibility(8);
        if (aVar.mo130781f() == null || TextUtils.isEmpty(aVar.mo130781f().description)) {
            contactsHomeItemViewHolder.contactUserStatus.setVisibility(8);
        } else {
            contactsHomeItemViewHolder.contactUserStatus.setVisibility(0);
            contactsHomeItemViewHolder.contactUserStatus.setTextColor(this.f91662c.getResources().getColor(R.color.text_placeholder));
            contactsHomeItemViewHolder.contactUserStatus.mo201154a(aVar.mo130781f().description, UIUtils.getDrawable(this.f91662c, UserStatusHelper.m224138a().mo195998a(aVar.mo130781f().type.getNumber())));
        }
        contactsHomeItemViewHolder.contactLayout.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.contact.feat.contact_external.view.C35458a.C354591 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ContactHitPoint.m140804g("member_avatar");
                C58546g.m227072a().mo198455a(view);
                if (C35458a.this.f91661a != null) {
                    C35458a.this.f91661a.mo130803a(aVar.mo130776d());
                }
            }
        });
        contactsHomeItemViewHolder.contactLayout.setOnLongClickListener(new View.OnLongClickListener(aVar) {
            /* class com.ss.android.lark.contact.feat.contact_external.view.$$Lambda$a$9nWBvfDBcqDm4U7UI2rjFONiJo */
            public final /* synthetic */ ExternalContactViewData f$1;

            {
                this.f$1 = r2;
            }

            public final boolean onLongClick(View view) {
                return C35458a.this.m138685a(this.f$1, view);
            }
        });
        contactsHomeItemViewHolder.deleteBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.contact.feat.contact_external.view.C35458a.View$OnClickListenerC354602 */

            public void onClick(View view) {
                if (C35458a.this.f91661a != null) {
                    C35458a.this.f91661a.mo130802a(aVar);
                }
            }
        });
    }
}
