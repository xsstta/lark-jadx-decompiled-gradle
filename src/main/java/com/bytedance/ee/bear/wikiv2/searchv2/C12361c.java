package com.bytedance.ee.bear.wikiv2.searchv2;

import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.c */
public class C12361c extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    protected AbstractC12363a f33171a;

    /* renamed from: b */
    protected List<C12360b> f33172b = new ArrayList();

    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.c$a */
    public interface AbstractC12363a {
        /* renamed from: a */
        void mo47074a(C12360b bVar, int i);
    }

    /* renamed from: a */
    public void mo47080a() {
        this.f33172b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f33172b.size();
    }

    /* renamed from: b */
    public boolean mo47083b() {
        return !CollectionUtils.isEmpty(this.f33172b);
    }

    /* renamed from: a */
    public void mo47081a(AbstractC12363a aVar) {
        this.f33171a = aVar;
    }

    /* renamed from: a */
    public void mo47082a(List<C12360b> list) {
        if (list == null) {
            C13479a.m54758a("WikiSearchResultAdapter", "WikiSearchResultAdapter add list is null ......");
            return;
        }
        int size = this.f33172b.size();
        this.f33172b.addAll(list);
        notifyItemRangeInserted(size, list.size());
    }

    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.c$b */
    private static class C12364b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        RelativeLayout f33176a;

        /* renamed from: b */
        ImageView f33177b;

        /* renamed from: c */
        TextView f33178c;

        /* renamed from: d */
        TextView f33179d;

        C12364b(View view) {
            super(view);
            this.f33176a = (RelativeLayout) view.findViewById(R.id.wiki_search_item);
            this.f33177b = (ImageView) view.findViewById(R.id.wiki_result_image_view);
            this.f33178c = (TextView) view.findViewById(R.id.wiki_search_result_name);
            this.f33179d = (TextView) view.findViewById(R.id.wiki_search_parent_name);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C12364b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wiki_searchv2_result_item, viewGroup, false));
    }

    /* renamed from: a */
    private Spanned m51449a(String str, String str2) {
        if (str.contains("<em>")) {
            return Html.fromHtml(str.replaceAll("<em>", "<font color=#f01d94>").replaceAll("</em>", "</font>"));
        }
        C13479a.m54764b("WikiSearchResultAdapter", "do not have <em> tag, result is " + C13598b.m55197d(str) + " key is " + C13598b.m55197d(str2));
        String quote = Pattern.quote(str2);
        return Html.fromHtml(str.replaceAll(quote, "<font color=#f01d94>" + str2 + "</font>"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r5.f33172b.get(r7);
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r6, final int r7) {
        /*
            r5 = this;
            java.util.List<com.bytedance.ee.bear.wikiv2.searchv2.b> r0 = r5.f33172b
            int r0 = r0.size()
            if (r7 >= r0) goto L_0x0055
            java.util.List<com.bytedance.ee.bear.wikiv2.searchv2.b> r0 = r5.f33172b
            java.lang.Object r0 = r0.get(r7)
            com.bytedance.ee.bear.wikiv2.searchv2.b r0 = (com.bytedance.ee.bear.wikiv2.searchv2.C12360b) r0
            if (r0 == 0) goto L_0x0055
            com.bytedance.ee.bear.wikiv2.searchv2.c$b r6 = (com.bytedance.ee.bear.wikiv2.searchv2.C12361c.C12364b) r6
            java.lang.String r1 = r0.f33157b
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0025
            android.widget.TextView r1 = r6.f33178c
            r2 = 2131826519(0x7f111757, float:1.9285925E38)
            r1.setText(r2)
            goto L_0x0032
        L_0x0025:
            java.lang.String r1 = r0.f33157b
            java.lang.String r2 = r0.f33156a
            android.text.Spanned r1 = r5.m51449a(r1, r2)
            android.widget.TextView r2 = r6.f33178c
            r2.setText(r1)
        L_0x0032:
            android.widget.ImageView r1 = r6.f33177b
            int r2 = r0.f33163h
            java.lang.String r3 = r0.f33157b
            java.lang.String r3 = com.bytedance.ee.bear.facade.common.icon.p381a.C7714b.m30853a(r3)
            r4 = 0
            int r2 = com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.TreeKt.m52179a(r2, r4, r4, r3)
            r1.setImageResource(r2)
            android.widget.TextView r1 = r6.f33179d
            java.lang.String r2 = r0.f33158c
            r1.setText(r2)
            android.widget.RelativeLayout r6 = r6.f33176a
            com.bytedance.ee.bear.wikiv2.searchv2.c$1 r1 = new com.bytedance.ee.bear.wikiv2.searchv2.c$1
            r1.<init>(r0, r7)
            r6.setOnClickListener(r1)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.wikiv2.searchv2.C12361c.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }
}
