package com.ss.android.lark.mail.impl.share.collaborate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.share.collaborate.C43676d;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.share.collaborate.b */
public class C43663b extends RecyclerView.Adapter {

    /* renamed from: a */
    public AbstractC43665a f110776a;

    /* renamed from: b */
    private final String f110777b = "ShareMemberListAdapter";

    /* renamed from: c */
    private Context f110778c;

    /* renamed from: d */
    private ArrayList<Collaborator> f110779d;

    /* renamed from: e */
    private PermissionCode f110780e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.share.collaborate.b$a */
    public interface AbstractC43665a {
        /* renamed from: a */
        void mo155743a(Collaborator collaborator, int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList<Collaborator> arrayList = this.f110779d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155741a(ArrayList<Collaborator> arrayList) {
        Log.m165389i("ShareMemberListAdapter", "update list");
        this.f110779d = arrayList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ArrayList<Collaborator> arrayList;
        if ((viewHolder instanceof C43676d) && (arrayList = this.f110779d) != null && arrayList.size() > i) {
            ((C43676d) viewHolder).mo155758a(this.f110779d.get(i), i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f110778c).inflate(R.layout.mail_collaborate_list_item, (ViewGroup) null);
        inflate.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new C43676d(this.f110778c, inflate, new C43676d.AbstractC43679a() {
            /* class com.ss.android.lark.mail.impl.share.collaborate.C43663b.C436641 */

            @Override // com.ss.android.lark.mail.impl.share.collaborate.C43676d.AbstractC43679a
            /* renamed from: a */
            public void mo155742a(Collaborator collaborator, int i) {
                if (C43663b.this.f110776a != null) {
                    C43663b.this.f110776a.mo155743a(collaborator, i);
                }
            }
        }, this.f110780e);
    }

    public C43663b(Context context, AbstractC43665a aVar, PermissionCode permissionCode) {
        this.f110778c = context;
        this.f110776a = aVar;
        this.f110780e = permissionCode;
    }
}
