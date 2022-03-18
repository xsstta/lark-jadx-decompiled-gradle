package com.bytedance.ee.bear.search.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.suite.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SearchByTypeAdapter extends RecyclerView.Adapter<C10801b> {

    /* renamed from: a */
    public AbstractC10800a f28953a;

    /* renamed from: b */
    private List<TypeItem> f28954b = new ArrayList();

    /* renamed from: c */
    private int f28955c = -1;

    /* renamed from: com.bytedance.ee.bear.search.adapter.SearchByTypeAdapter$a */
    public interface AbstractC10800a {
        void onTypeItemClick(TypeItem typeItem);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f28954b.size();
    }

    /* renamed from: a */
    public void mo40889a(AbstractC10800a aVar) {
        this.f28953a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.search.adapter.SearchByTypeAdapter$b */
    public static class C10801b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        View f28958a;

        /* renamed from: b */
        ImageView f28959b;

        /* renamed from: c */
        TextView f28960c;

        public C10801b(View view) {
            super(view);
            this.f28958a = view;
            this.f28959b = (ImageView) view.findViewById(R.id.search_by_type_icon);
            this.f28960c = (TextView) view.findViewById(R.id.search_by_type_txt);
        }
    }

    /* renamed from: a */
    public void mo40891a(List<TypeItem> list) {
        this.f28954b.clear();
        if (!(list == null || list.size() == 0)) {
            this.f28954b.addAll(list);
        }
        notifyDataSetChanged();
    }

    public SearchByTypeAdapter(List<TypeItem> list, int i) {
        this.f28955c = i;
        mo40891a(list);
    }

    /* renamed from: a */
    public C10801b onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = this.f28955c;
        if (i2 == -1) {
            i2 = R.layout.search_by_type_item;
        }
        this.f28955c = i2;
        return new C10801b(LayoutInflater.from(viewGroup.getContext()).inflate(this.f28955c, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C10801b bVar, int i) {
        final TypeItem typeItem = this.f28954b.get(i);
        bVar.f28959b.setImageResource(typeItem.iconId);
        C13747j.m55728a(bVar.f28959b, (int) R.color.icon_n1);
        bVar.f28960c.setText(typeItem.nameId);
        bVar.f28958a.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.adapter.SearchByTypeAdapter.C107991 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (SearchByTypeAdapter.this.f28953a != null) {
                    SearchByTypeAdapter.this.f28953a.onTypeItemClick(typeItem);
                }
            }
        });
    }

    public static class TypeItem implements Serializable {
        public int iconId;
        public boolean isFile;
        public int nameId;
        public int typeId;

        public TypeItem(int i, int i2, int i3) {
            this.typeId = i;
            this.iconId = i2;
            this.nameId = i3;
        }

        public TypeItem(int i, int i2, int i3, boolean z) {
            this(i, i2, i3);
            this.isFile = z;
        }
    }
}
