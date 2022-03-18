package com.ss.android.lark.mail.impl.share;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.ui.p1198b.AbstractC26197e;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.share.d */
public class C43681d extends RecyclerView.Adapter implements AbstractC26197e {

    /* renamed from: a */
    public AbstractC43684a f110827a;

    /* renamed from: b */
    private final String f110828b = "ShareMemberListAdapter";

    /* renamed from: c */
    private final int f110829c = 1;

    /* renamed from: d */
    private Context f110830d;

    /* renamed from: e */
    private ArrayList<C43689g> f110831e;

    /* renamed from: f */
    private boolean f110832f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.share.d$a */
    public interface AbstractC43684a {
        /* renamed from: a */
        void mo155762a(int i);
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public void mo93178a(RecyclerView.ViewHolder viewHolder, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.larksuite.framework.ui.p1198b.AbstractC26197e
    public int getItemCount() {
        ArrayList<C43689g> arrayList = this.f110831e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public long mo93176a(int i) {
        if (this.f110832f) {
            return 1;
        }
        return -1;
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public RecyclerView.ViewHolder mo93177a(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f110830d).inflate(R.layout.mail_share_recent_chats_header_layout, (ViewGroup) null);
        inflate.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f110830d.getResources().getDimensionPixelSize(R.dimen.mail_share_header_height)));
        return new RecyclerView.ViewHolder(inflate) {
            /* class com.ss.android.lark.mail.impl.share.C43681d.C436832 */
        };
    }

    public C43681d(Context context, AbstractC43684a aVar) {
        this.f110830d = context;
        this.f110827a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155760a(ArrayList<C43689g> arrayList, boolean z) {
        Log.m165389i("ShareMemberListAdapter", "update list");
        this.f110831e = arrayList;
        this.f110832f = z;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f110830d).inflate(R.layout.mail_share_add_member_candidate_list_item, (ViewGroup) null);
        inflate.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new C43706j(this.f110830d, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        ArrayList<C43689g> arrayList;
        if ((viewHolder instanceof C43706j) && (arrayList = this.f110831e) != null && arrayList.size() > i) {
            C43706j jVar = (C43706j) viewHolder;
            jVar.mo155799a(this.f110831e.get(i));
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.share.C43681d.View$OnClickListenerC436821 */

                public void onClick(View view) {
                    if (C43681d.this.f110827a != null) {
                        C43681d.this.f110827a.mo155762a(i);
                    }
                }
            });
            boolean z = true;
            if (i == this.f110831e.size() - 1) {
                z = false;
            }
            jVar.mo155800a(z);
        }
    }
}
