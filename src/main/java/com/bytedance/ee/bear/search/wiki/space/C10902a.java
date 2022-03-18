package com.bytedance.ee.bear.search.wiki.space;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bytedance.ee.bear.facade.common.widget.CustomTitleView;
import com.bytedance.ee.bear.search.model.SearchResponse;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p703f.C13664a;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.search.wiki.space.a */
public class C10902a extends RecyclerView.Adapter<C10905b> {

    /* renamed from: a */
    public AbstractC10904a f29364a;

    /* renamed from: b */
    private List<SearchResponse.Data.SpaceData> f29365b = new ArrayList();

    /* renamed from: c */
    private Context f29366c;

    /* renamed from: com.bytedance.ee.bear.search.wiki.space.a$a */
    public interface AbstractC10904a {
        /* renamed from: a */
        void mo41449a(SearchResponse.Data.SpaceData spaceData);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f29365b.size();
    }

    /* renamed from: a */
    public void mo41452a(AbstractC10904a aVar) {
        this.f29364a = aVar;
    }

    public C10902a(Context context) {
        this.f29366c = context;
    }

    /* renamed from: a */
    public void mo41454a(List<SearchResponse.Data.SpaceData> list) {
        this.f29365b.clear();
        if (list != null) {
            this.f29365b.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* renamed from: com.bytedance.ee.bear.search.wiki.space.a$b */
    public static class C10905b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public View f29369a;

        /* renamed from: b */
        public AppCompatImageView f29370b;

        /* renamed from: c */
        public CustomTitleView f29371c;

        /* renamed from: d */
        public TextView f29372d;

        /* renamed from: e */
        public View f29373e;

        public C10905b(View view) {
            super(view);
            this.f29369a = view;
            this.f29370b = (AppCompatImageView) view.findViewById(R.id.item_icon);
            this.f29371c = (CustomTitleView) view.findViewById(R.id.item_title);
            this.f29372d = (TextView) view.findViewById(R.id.item_update);
            View findViewById = view.findViewById(R.id.item_close);
            this.f29373e = findViewById;
            findViewById.setVisibility(8);
        }
    }

    /* renamed from: a */
    public C10905b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C10905b(LayoutInflater.from(this.f29366c).inflate(R.layout.search_result_list_item_no_preview, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C10905b bVar, int i) {
        final SearchResponse.Data.SpaceData spaceData = this.f29365b.get(i);
        bVar.f29371c.setTitle(spaceData.getSpace_name());
        bVar.f29372d.setText(spaceData.getDescription());
        bVar.f29373e.setVisibility(8);
        if (!TextUtils.isEmpty(spaceData.getSpace_icon())) {
            ComponentCallbacks2C2115c.m9151c(this.f29366c).mo10414a(new C13664a(spaceData.getSpace_icon())).mo10399a((ImageView) bVar.f29370b);
        }
        bVar.f29369a.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.wiki.space.C10902a.C109031 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C10902a.this.f29364a != null) {
                    C10902a.this.f29364a.mo41449a(spaceData);
                }
            }
        });
    }
}
