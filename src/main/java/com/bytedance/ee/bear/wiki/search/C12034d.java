package com.bytedance.ee.bear.wiki.search;

import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.facade.common.widget.CustomTitleView;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wiki.search.d */
public class C12034d extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public AbstractC12037a f32484a;

    /* renamed from: b */
    private boolean f32485b;

    /* renamed from: c */
    private AbstractC5197b f32486c;

    /* renamed from: d */
    private List<C12033c> f32487d = new ArrayList();

    /* renamed from: com.bytedance.ee.bear.wiki.search.d$a */
    public interface AbstractC12037a {
        /* renamed from: a */
        void mo46040a(String str, String str2, String str3, int i);
    }

    /* renamed from: a */
    private int m49859a(int i) {
        return i == 3 ? R.drawable.icon_wikifile_sheet_outline : i == 11 ? R.drawable.icon_wikifile_mindnote_outline : R.drawable.icon_wikifile_doc_outline;
    }

    /* renamed from: a */
    public void mo46055a() {
        this.f32487d.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f32487d.size();
    }

    /* renamed from: b */
    public boolean mo46058b() {
        return !CollectionUtils.isEmpty(this.f32487d);
    }

    /* renamed from: a */
    public void mo46056a(AbstractC12037a aVar) {
        this.f32484a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f32485b) {
            return 2;
        }
        return 1;
    }

    /* renamed from: a */
    public void mo46057a(List<C12033c> list) {
        if (list == null) {
            C13479a.m54758a("WikiSearchTAG", "WikiSearchResultAdapter add list is null ......");
            return;
        }
        int size = this.f32487d.size();
        this.f32487d.addAll(list);
        notifyItemRangeInserted(size, list.size());
    }

    public C12034d(boolean z, C10917c cVar) {
        this.f32485b = z;
        this.f32486c = (AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class);
    }

    /* renamed from: com.bytedance.ee.bear.wiki.search.d$c */
    public class C12039c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        RelativeLayout f32501a;

        /* renamed from: b */
        ImageView f32502b;

        /* renamed from: c */
        TextView f32503c;

        /* renamed from: d */
        TextView f32504d;

        public C12039c(View view) {
            super(view);
            this.f32501a = (RelativeLayout) view.findViewById(R.id.wiki_search_item);
            this.f32502b = (ImageView) view.findViewById(R.id.wiki_result_image_view);
            this.f32503c = (TextView) view.findViewById(R.id.wiki_search_result_name);
            this.f32504d = (TextView) view.findViewById(R.id.wiki_search_parent_name);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 2) {
            return new C12038b(from.inflate(R.layout.wiki_all_space_list_recycler_view_item, viewGroup, false));
        }
        return new C12039c(from.inflate(R.layout.wiki_search_result_item, viewGroup, false));
    }

    /* renamed from: com.bytedance.ee.bear.wiki.search.d$b */
    public class C12038b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        SwipeMenuLayout f32494a;

        /* renamed from: b */
        ConstraintLayout f32495b;

        /* renamed from: c */
        CustomTitleView f32496c = ((CustomTitleView) this.f32495b.findViewById(R.id.item_name));

        /* renamed from: d */
        ImageView f32497d;

        /* renamed from: e */
        TextView f32498e = ((TextView) this.f32495b.findViewById(R.id.update_time));

        /* renamed from: f */
        View f32499f = this.f32495b.findViewById(R.id.bottom_divider);

        public C12038b(View view) {
            super(view);
            this.f32494a = (SwipeMenuLayout) view.findViewById(R.id.list_item);
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.item_content);
            this.f32495b = constraintLayout;
            this.f32497d = (ImageView) constraintLayout.findViewById(R.id.item_icon);
        }
    }

    /* renamed from: a */
    private Spanned m49860a(String str, String str2) {
        if (str.contains("<em>")) {
            return Html.fromHtml(str.replaceAll("<em>", "<font color=#f01d94>").replaceAll("</em>", "</font>"));
        }
        C13479a.m54764b("WikiSearchTAG", "do not have <em> tag, result is " + C13598b.m55197d(str) + " key is " + C13598b.m55197d(str2));
        String quote = Pattern.quote(str2);
        return Html.fromHtml(str.replaceAll(quote, "<font color=#f01d94>" + str2 + "</font>"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r5.f32487d.get(r7);
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r6, final int r7) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.wiki.search.C12034d.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }
}
