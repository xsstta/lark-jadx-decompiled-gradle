package com.ss.android.lark.invite_new_tenant.invite.single.mobile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.ui.p1198b.AbstractC26197e;
import com.larksuite.suite.R;
import com.ss.android.lark.invite_new_tenant.C40531a;
import com.ss.android.lark.invite_new_tenant.invite.single.AbstractC40580a;
import com.ss.android.lark.invite_new_tenant.invite.single.mobile.entity.MobileCode;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.invite_new_tenant.invite.single.mobile.a */
public class C40600a extends RecyclerView.Adapter<C40603b> implements AbstractC26197e<C40602a> {

    /* renamed from: a */
    public AbstractC40580a f103019a;

    /* renamed from: b */
    private List<MobileCode> f103020b = new ArrayList();

    /* renamed from: c */
    private List<MobileCode> f103021c;

    /* renamed from: d */
    private boolean f103022d;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.larksuite.framework.ui.p1198b.AbstractC26197e
    public int getItemCount() {
        return this.f103020b.size() + this.f103021c.size();
    }

    /* renamed from: a */
    public void mo146729a(AbstractC40580a aVar) {
        this.f103019a = aVar;
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public long mo93176a(int i) {
        if (i < this.f103021c.size()) {
            return 0;
        }
        return 1;
    }

    /* renamed from: b */
    public C40602a mo93177a(ViewGroup viewGroup) {
        return new C40602a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_invite_mobile_area_header, viewGroup, false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.invite_new_tenant.invite.single.mobile.a$a */
    public class C40602a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f103025a;

        public C40602a(View view) {
            super(view);
            this.f103025a = (TextView) view.findViewById(R.id.area_header);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.invite_new_tenant.invite.single.mobile.a$b */
    public class C40603b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f103027a;

        /* renamed from: b */
        public TextView f103028b;

        public C40603b(View view) {
            super(view);
            this.f103027a = (TextView) view.findViewById(R.id.area_name);
            this.f103028b = (TextView) view.findViewById(R.id.area_code);
        }
    }

    /* renamed from: a */
    public C40603b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C40603b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_invite_mobile_area, viewGroup, false));
    }

    public C40600a(List<MobileCode> list, List<MobileCode> list2) {
        ArrayList arrayList = new ArrayList();
        this.f103021c = arrayList;
        this.f103022d = false;
        arrayList.addAll(list);
        this.f103020b.addAll(list2);
        this.f103022d = C40531a.m160431a().mo143860c();
    }

    /* renamed from: a */
    public void mo93178a(C40602a aVar, int i) {
        String str;
        if (i < this.f103021c.size()) {
            str = UIHelper.getString(R.string.Lark_Legacy_PopularCountryOrArea);
        } else {
            str = UIHelper.getString(R.string.Lark_Legacy_AllCountryOrArea);
        }
        aVar.f103025a.setText(str);
    }

    /* renamed from: a */
    public void onBindViewHolder(C40603b bVar, int i) {
        final MobileCode mobileCode;
        String str;
        if (i < this.f103021c.size()) {
            mobileCode = this.f103021c.get(i);
        } else {
            mobileCode = this.f103020b.get(i - this.f103021c.size());
        }
        bVar.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invite_new_tenant.invite.single.mobile.C40600a.View$OnClickListenerC406011 */

            public void onClick(View view) {
                if (C40600a.this.f103019a != null) {
                    C40600a.this.f103019a.onItemSelected(mobileCode);
                }
            }
        });
        TextView textView = bVar.f103027a;
        if (this.f103022d) {
            str = mobileCode.name;
        } else {
            str = mobileCode.enName;
        }
        textView.setText(str);
        bVar.f103028b.setText(mobileCode.code);
    }
}
