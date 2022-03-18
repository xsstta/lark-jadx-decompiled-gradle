package com.bytedance.ee.bear.middleground.record.viewhistory;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.middleground.record.viewhistory.RecordListResult;
import com.larksuite.suite.R;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.middleground.record.viewhistory.a */
public class C10144a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private List<RecordListResult.C10143a> f27394a;

    /* renamed from: b */
    private String f27395b;

    /* renamed from: c */
    private Context f27396c;

    /* renamed from: d */
    private final int f27397d = 1;

    /* renamed from: e */
    private final int f27398e = 2;

    /* renamed from: f */
    private final int f27399f = 3;

    /* renamed from: g */
    private final int f27400g = 4;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f27394a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f27394a.get(i).f27388i;
    }

    public C10144a(Context context, List<RecordListResult.C10143a> list) {
        this.f27394a = list;
        this.f27396c = context;
        this.f27395b = C4484g.m18494b().mo17252c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C10147c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_history_item_bottom, viewGroup, false));
        }
        return new C10145b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_history_item_user, viewGroup, false), this.f27395b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            ((C10147c) viewHolder).mo38576a();
        } else if (itemViewType == 1) {
            C10145b bVar = (C10145b) viewHolder;
            bVar.mo38571a(this.f27394a.get(i));
            if (i == 0) {
                bVar.mo38570a();
            }
        } else if (itemViewType == 2) {
            C10145b bVar2 = (C10145b) viewHolder;
            bVar2.mo38573c(this.f27394a.get(i));
            if (i == 0) {
                bVar2.mo38570a();
            }
        } else if (itemViewType == 3) {
            C10145b bVar3 = (C10145b) viewHolder;
            bVar3.mo38574d(this.f27394a.get(i));
            if (i == 0) {
                bVar3.mo38570a();
            }
        } else if (itemViewType == 4) {
            C10145b bVar4 = (C10145b) viewHolder;
            bVar4.mo38572b(this.f27394a.get(i));
            if (i == 0) {
                bVar4.mo38570a();
            }
        }
    }
}
