package com.bytedance.ee.bear.search.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.search.model.SearchResponse;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.bytedance.ee.bear.search.adapter.c */
public class C10811c extends RecyclerView.Adapter<View$OnClickListenerC10813b> {

    /* renamed from: a */
    public AbstractC10812a f28990a;

    /* renamed from: b */
    public List<SearchResponse.Data.Candidates> f28991b = new ArrayList();

    /* renamed from: c */
    public List<String> f28992c = new ArrayList();

    /* renamed from: d */
    public List<String> f28993d = new ArrayList();

    /* renamed from: e */
    private String f28994e;

    /* renamed from: f */
    private boolean f28995f;

    /* renamed from: g */
    private Context f28996g;

    /* renamed from: com.bytedance.ee.bear.search.adapter.c$a */
    public interface AbstractC10812a {
        /* renamed from: a */
        void mo40817a(SearchResponse.Data.Candidates candidates, int i);

        /* renamed from: a */
        void mo40818a(String str, int i);

        /* renamed from: b */
        void mo40822b(String str, int i);
    }

    /* renamed from: b */
    private int m44845b() {
        if (this.f28995f) {
            return this.f28991b.size();
        }
        return 0;
    }

    /* renamed from: a */
    private void m44844a() {
        for (String str : this.f28992c) {
            this.f28993d.remove(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return Math.min(5, m44845b() + this.f28992c.size() + this.f28993d.size());
    }

    /* renamed from: a */
    public void mo40905a(AbstractC10812a aVar) {
        this.f28990a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i < m44845b()) {
            return 0;
        }
        if (i < m44845b() + this.f28992c.size()) {
            return 1;
        }
        return 2;
    }

    public C10811c(Context context) {
        this.f28996g = context;
        this.f28994e = C4484g.m18494b().mo17252c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.search.adapter.c$b */
    public class View$OnClickListenerC10813b extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a */
        ImageView f28997a;

        /* renamed from: b */
        TextView f28998b;

        /* renamed from: c */
        View f28999c;

        public void onClick(View view) {
            if (C10811c.this.f28990a != null) {
                int itemViewType = getItemViewType();
                int a = C10811c.this.mo40903a(itemViewType, getAdapterPosition());
                if (itemViewType == 0) {
                    if (a >= 0 && a < C10811c.this.f28991b.size()) {
                        C10811c.this.f28990a.mo40817a(C10811c.this.f28991b.get(a), getAdapterPosition());
                    }
                } else if (itemViewType == 1) {
                    if (a >= 0 && a < C10811c.this.f28992c.size()) {
                        C10811c.this.f28990a.mo40818a(C10811c.this.f28992c.get(a), getAdapterPosition());
                    }
                } else if (a >= 0 && a < C10811c.this.f28993d.size()) {
                    C10811c.this.f28990a.mo40822b(C10811c.this.f28993d.get(a), getAdapterPosition());
                }
            }
        }

        View$OnClickListenerC10813b(View view) {
            super(view);
            this.f28997a = (ImageView) view.findViewById(R.id.search_suggest_avatar);
            this.f28998b = (TextView) view.findViewById(R.id.search_suggest_text);
            this.f28999c = view.findViewById(R.id.search_suggest_divider);
            view.setOnClickListener(this);
        }
    }

    /* renamed from: a */
    private String m44843a(SearchResponse.Data.Candidates candidates) {
        if (TextUtils.isEmpty(candidates.getCn_name())) {
            return candidates.getEn_name();
        }
        if (Locale.ENGLISH.getLanguage().equals(this.f28994e)) {
            return String.format("%s(%s)", candidates.getEn_name(), candidates.getCn_name());
        }
        return String.format("%s(%s)", candidates.getCn_name(), candidates.getEn_name());
    }

    /* renamed from: a */
    public int mo40903a(int i, int i2) {
        int size;
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            size = m44845b();
        } else {
            i2 -= m44845b();
            size = this.f28992c.size();
        }
        return i2 - size;
    }

    /* renamed from: a */
    public View$OnClickListenerC10813b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new View$OnClickListenerC10813b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_suggestion_list_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(View$OnClickListenerC10813b bVar, int i) {
        int i2;
        View view = bVar.f28999c;
        if (i + 1 == getItemCount()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        int a = mo40903a(bVar.getItemViewType(), i);
        int itemViewType = bVar.getItemViewType();
        if (itemViewType == 0) {
            bVar.f28997a.setImageTintList(null);
            SearchResponse.Data.Candidates candidates = this.f28991b.get(a);
            bVar.f28998b.setText(m44843a(candidates));
            String avatar_url = candidates.getAvatar_url();
            if (!TextUtils.isEmpty(avatar_url)) {
                ComponentCallbacks2C2115c.m9151c(this.f28996g).mo10414a(new C13664a(avatar_url)).mo10399a(bVar.f28997a);
            }
        } else if (itemViewType == 1) {
            bVar.f28998b.setText(this.f28992c.get(a));
            bVar.f28997a.setImageResource(R.drawable.ud_icon_search_outlined);
            C13747j.m55728a(bVar.f28997a, (int) R.color.icon_n3);
        } else if (itemViewType == 2) {
            bVar.f28998b.setText(this.f28993d.get(a));
            bVar.f28997a.setImageResource(R.drawable.ud_icon_search_outlined);
            C13747j.m55728a(bVar.f28997a, (int) R.color.icon_n3);
        }
    }

    /* renamed from: a */
    public void mo40907a(List<SearchResponse.Data.Candidates> list, List<String> list2, List<String> list3, boolean z) {
        this.f28991b.clear();
        if (list != null && !list.isEmpty()) {
            this.f28991b.add(list.get(0));
        }
        this.f28992c.clear();
        if (list2 != null) {
            this.f28992c.addAll(list2);
        }
        this.f28993d.clear();
        if (list3 != null) {
            this.f28993d.addAll(list3);
        }
        m44844a();
        this.f28995f = z;
        notifyDataSetChanged();
    }
}
