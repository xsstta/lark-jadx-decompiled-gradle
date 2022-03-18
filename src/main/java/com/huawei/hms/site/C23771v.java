package com.huawei.hms.site;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.site.api.model.Site;
import com.larksuite.suite.R;
import java.util.List;

/* renamed from: com.huawei.hms.site.v */
public class C23771v extends RecyclerView.Adapter<C23773b> {

    /* renamed from: a */
    public List<Site> f58846a;

    /* renamed from: b */
    public AbstractC23772a f58847b;

    /* renamed from: com.huawei.hms.site.v$a */
    public interface AbstractC23772a {
    }

    /* renamed from: com.huawei.hms.site.v$b */
    public class C23773b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f58848a;

        /* renamed from: b */
        public TextView f58849b;

        /* renamed from: c */
        public View f58850c;

        public C23773b(C23771v vVar, View view) {
            super(view);
            this.f58850c = view;
            this.f58848a = (TextView) view.findViewById(R.id.item_record_name);
            this.f58849b = (TextView) view.findViewById(R.id.item_record_address);
        }
    }

    public C23771v(List<Site> list) {
        this.f58846a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<Site> list = this.f58846a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public C23773b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C23773b bVar = new C23773b(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.records_item_in_sdk, viewGroup, false));
        bVar.f58850c.setOnClickListener(new View$OnClickListenerC23769t(this));
        return bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(C23773b bVar, int i) {
        Site site;
        C23773b bVar2 = bVar;
        List<Site> list = this.f58846a;
        if (!(list == null || (site = list.get(i)) == null)) {
            String name = site.getName();
            String formatAddress = site.getFormatAddress();
            bVar2.f58848a.setText(name);
            bVar2.f58849b.setText(formatAddress);
        }
        bVar2.itemView.setOnClickListener(new View$OnClickListenerC23770u(this, i));
    }
}
