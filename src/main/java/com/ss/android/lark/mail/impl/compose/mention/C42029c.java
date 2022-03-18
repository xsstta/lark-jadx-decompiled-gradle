package com.ss.android.lark.mail.impl.compose.mention;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.email.client.v1.SearchMemberInfo;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.compose.mention.c */
public class C42029c extends RecyclerView.Adapter<C42032d> {

    /* renamed from: a */
    public AbstractC42031a f106656a;

    /* renamed from: b */
    private final String f106657b = "MentionListAdapter";

    /* renamed from: c */
    private Context f106658c;

    /* renamed from: d */
    private List<SearchMemberInfo> f106659d;

    /* renamed from: com.ss.android.lark.mail.impl.compose.mention.c$a */
    interface AbstractC42031a {
        /* renamed from: a */
        void mo151036a(SearchMemberInfo searchMemberInfo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<SearchMemberInfo> list = this.f106659d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo151046a(List<SearchMemberInfo> list) {
        Log.m165389i("MentionListAdapter", "update");
        this.f106659d = list;
        notifyDataSetChanged();
    }

    C42029c(Context context, AbstractC42031a aVar) {
        this.f106658c = context;
        this.f106656a = aVar;
    }

    /* renamed from: a */
    public C42032d onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f106658c).inflate(R.layout.mail_compose_mention_select_list_item_layout, (ViewGroup) null);
        inflate.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f106658c.getResources().getDimensionPixelSize(R.dimen.mail_mention_select_list_item_height)));
        return new C42032d(this.f106658c, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(C42032d dVar, int i) {
        if (CollectionUtils.isEmpty(this.f106659d) || this.f106659d.size() <= i) {
            Log.m165383e("MentionListAdapter", "onBindViewHolder invalid data");
            return;
        }
        final SearchMemberInfo searchMemberInfo = this.f106659d.get(i);
        boolean z = true;
        if (i != getItemCount() - 1) {
            z = false;
        }
        dVar.mo151048a(searchMemberInfo, z);
        dVar.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.compose.mention.C42029c.View$OnClickListenerC420301 */

            public void onClick(View view) {
                if (C42029c.this.f106656a != null) {
                    C42029c.this.f106656a.mo151036a(searchMemberInfo);
                }
            }
        });
    }
}
