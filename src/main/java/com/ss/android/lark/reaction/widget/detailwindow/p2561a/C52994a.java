package com.ss.android.lark.reaction.widget.detailwindow.p2561a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.widget.detailwindow.bean.DetailUserInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.reaction.widget.detailwindow.a.a */
public class C52994a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private Context f130905a;

    /* renamed from: b */
    private List<DetailUserInfo> f130906b;

    /* renamed from: c */
    private AbstractC52995a f130907c;

    /* renamed from: d */
    private C52998c f130908d;

    /* renamed from: com.ss.android.lark.reaction.widget.detailwindow.a.a$a */
    public interface AbstractC52995a {
        void click(String str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f130906b.size();
    }

    /* renamed from: a */
    public void mo181030a(AbstractC52995a aVar) {
        this.f130907c = aVar;
    }

    /* renamed from: a */
    public void mo181031a(List<DetailUserInfo> list) {
        this.f130906b = list;
        notifyDataSetChanged();
    }

    public C52994a(Context context, List<DetailUserInfo> list) {
        this.f130905a = context;
        this.f130906b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (this.f130908d == null) {
            this.f130908d = new C52998c(this.f130905a, this.f130907c);
        }
        this.f130908d.mo181038a((C53000d) viewHolder, this.f130906b.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C53000d(LayoutInflater.from(this.f130905a).inflate(R.layout.reaction_detail_people_list_item, viewGroup, false));
    }
}
