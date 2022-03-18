package com.ss.android.lark.collaboration.applydetail.mvp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.collaboration.ContactCollaborationModule;
import com.ss.android.lark.collaboration.p1730a.AbstractC35340a;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.collaboration.applydetail.mvp.c */
public class C35348c extends LarkRecyclerViewBaseAdapter<C35349a, Contact> {

    /* renamed from: a */
    private static final int f91383a = UIHelper.dp2px(40.0f);

    /* renamed from: b */
    private final Context f91384b;

    /* renamed from: c */
    private final int f91385c;

    /* renamed from: com.ss.android.lark.collaboration.applydetail.mvp.c$a */
    public static class C35349a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        LKUIRoundedImageView2 f91386a;

        /* renamed from: b */
        TextView f91387b;

        public C35349a(View view) {
            super(view);
            this.f91386a = (LKUIRoundedImageView2) view.findViewById(R.id.contact_avatar);
            this.f91387b = (TextView) view.findViewById(R.id.contact_name);
        }
    }

    public C35348c(Context context, int i) {
        this.f91384b = context;
        this.f91385c = i;
    }

    /* renamed from: a */
    public C35349a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C35349a(LayoutInflater.from(viewGroup.getContext()).inflate(this.f91385c, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C35349a aVar, int i) {
        Contact contact = (Contact) getItem(i);
        if (contact != null) {
            if (aVar.f91387b != null) {
                aVar.f91387b.setText(contact.mo130408c());
            }
            AbstractC35340a a = ContactCollaborationModule.m138138a();
            if (a == null) {
                Log.m165379d("ContactListAdapter", "dependency is null");
                return;
            }
            Context context = this.f91384b;
            LKUIRoundedImageView2 lKUIRoundedImageView2 = aVar.f91386a;
            String b = contact.mo130407b();
            String a2 = contact.mo130406a();
            LoadParams loadParams = new LoadParams();
            int i2 = f91383a;
            a.mo130063a(context, lKUIRoundedImageView2, b, a2, loadParams.mo105413a(i2).mo105422b(i2));
        }
    }
}
