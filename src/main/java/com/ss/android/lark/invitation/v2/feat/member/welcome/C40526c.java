package com.ss.android.lark.invitation.v2.feat.member.welcome;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.c */
public class C40526c extends RecyclerView.Adapter<C40529b> {

    /* renamed from: a */
    public final List<C40516b.AbstractC40523b> f102925a = new ArrayList();

    /* renamed from: b */
    public AbstractC40528a f102926b;

    /* renamed from: c */
    public int f102927c = -1;

    /* renamed from: d */
    private final Context f102928d;

    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.c$a */
    public interface AbstractC40528a {
        /* renamed from: a */
        void mo146603a(int i, C40516b.AbstractC40523b bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f102925a.size();
    }

    /* renamed from: a */
    public void mo146611a(AbstractC40528a aVar) {
        this.f102926b = aVar;
    }

    public C40526c(Context context) {
        this.f102928d = context;
    }

    /* renamed from: a */
    public void mo146613a(List<C40516b.AbstractC40523b> list) {
        if (list != null) {
            this.f102925a.clear();
            this.f102925a.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public C40529b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C40529b(LayoutInflater.from(this.f102928d).inflate(R.layout.inv_item_picker, viewGroup, false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.c$b */
    public class C40529b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f102931a;

        /* renamed from: b */
        View f102932b;

        /* renamed from: c */
        ImageView f102933c;

        private C40529b(View view) {
            super(view);
            this.f102931a = (TextView) view.findViewById(R.id.tv_content);
            this.f102932b = view.findViewById(R.id.ll_content);
            this.f102933c = (ImageView) view.findViewById(R.id.iv_check);
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(C40529b bVar, final int i) {
        bVar.f102931a.setText(this.f102925a.get(i).getContent());
        bVar.f102932b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.welcome.C40526c.View$OnClickListenerC405271 */

            public void onClick(View view) {
                if (C40526c.this.f102926b != null) {
                    C40526c.this.f102926b.mo146603a(i, C40526c.this.f102925a.get(i));
                }
                int i = C40526c.this.f102927c;
                C40526c.this.f102927c = i;
                C40526c.this.notifyItemChanged(i);
                C40526c cVar = C40526c.this;
                cVar.notifyItemChanged(cVar.f102927c);
            }
        });
        if (this.f102925a.get(i).getPickDatas() == null && i == this.f102927c) {
            bVar.f102933c.setVisibility(0);
        } else {
            bVar.f102933c.setVisibility(4);
        }
    }
}
