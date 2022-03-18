package com.bytedance.ee.bear.search.adapter;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.facade.common.widget.CustomTitleView;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.DocsLinearLayoutManager;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.p376e.p377a.AbstractC7588a;
import com.bytedance.ee.bear.search.C10868m;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p716r.C13721c;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.search.adapter.b */
public class C10804b extends RecyclerView.Adapter<C10808a> {

    /* renamed from: a */
    public Context f28963a;

    /* renamed from: b */
    public AbstractC10809b f28964b;

    /* renamed from: c */
    public int f28965c;

    /* renamed from: d */
    private List<Document> f28966d;

    /* renamed from: e */
    private C10917c f28967e;

    /* renamed from: f */
    private boolean f28968f;

    /* renamed from: g */
    private AccountService.Account f28969g;

    /* renamed from: h */
    private boolean f28970h;

    /* renamed from: i */
    private DocsLinearLayoutManager f28971i;

    /* renamed from: j */
    private boolean f28972j;

    /* renamed from: com.bytedance.ee.bear.search.adapter.b$b */
    public interface AbstractC10809b {
        /* renamed from: a */
        void mo40815a(Document document, int i);

        /* renamed from: b */
        void mo40821b(Document document, int i);

        /* renamed from: c */
        void mo40825c(Document document, int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f28966d.size();
    }

    /* renamed from: b */
    public void mo40901b() {
        if (SwipeMenuLayout.getViewCache() != null) {
            SwipeMenuLayout.getViewCache().mo30347d();
        }
    }

    public C10804b() {
        this.f28966d = new ArrayList();
        this.f28968f = true;
        this.f28970h = false;
        this.f28965c = -1;
    }

    /* renamed from: a */
    public String mo40895a() {
        int i;
        try {
            if (C13657b.m55421a(this.f28966d) || (i = this.f28965c) < 0 || i >= this.f28966d.size()) {
                return "";
            }
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 <= this.f28965c; i2++) {
                Document document = this.f28966d.get(i2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("entity_id", C13598b.m55197d(document.mo32472o()));
                jSONObject.put("result_type", C8275a.m34050a(document.mo32483t()));
                jSONObject.put("tag", "null");
                jSONArray.put(jSONObject);
            }
            return jSONArray.toString();
        } catch (Exception e) {
            C13479a.m54761a("SearchResultAdapter", e);
            return "";
        }
    }

    /* renamed from: a */
    public void mo40896a(AccountService.Account account) {
        this.f28969g = account;
    }

    /* renamed from: b */
    public void mo40902b(boolean z) {
        this.f28970h = z;
    }

    /* renamed from: a */
    public void mo40899a(boolean z) {
        this.f28968f = z;
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.search.adapter.b$c */
    public static class C10810c extends C10808a {

        /* renamed from: h */
        TextView f28989h;

        C10810c(SwipeMenuLayout swipeMenuLayout) {
            super(swipeMenuLayout);
            this.f28989h = (TextView) swipeMenuLayout.findViewById(R.id.item_preview);
        }
    }

    /* renamed from: a */
    public boolean mo40900a(Document document) {
        if (this.f28968f || document.mo32464l()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        boolean z;
        Document document = this.f28966d.get(i);
        if (document == null || TextUtils.isEmpty(document.mo32465m())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return 2;
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.search.adapter.b$a */
    public static class C10808a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        View f28982a;

        /* renamed from: b */
        AppCompatImageView f28983b;

        /* renamed from: c */
        CustomTitleView f28984c;

        /* renamed from: d */
        TextView f28985d;

        /* renamed from: e */
        ImageView f28986e;

        /* renamed from: f */
        View f28987f;

        /* renamed from: g */
        View f28988g;

        C10808a(SwipeMenuLayout swipeMenuLayout) {
            super(swipeMenuLayout);
            this.f28982a = swipeMenuLayout.findViewById(R.id.item_content);
            this.f28983b = (AppCompatImageView) swipeMenuLayout.findViewById(R.id.item_icon);
            this.f28984c = (CustomTitleView) swipeMenuLayout.findViewById(R.id.item_title);
            this.f28985d = (TextView) swipeMenuLayout.findViewById(R.id.item_update);
            ImageView imageView = (ImageView) swipeMenuLayout.findViewById(R.id.item_close);
            this.f28986e = imageView;
            imageView.setVisibility(8);
            this.f28987f = swipeMenuLayout.findViewById(R.id.search_swipe_menu_more);
            this.f28988g = swipeMenuLayout.findViewById(R.id.search_swipe_menu_share);
        }
    }

    /* renamed from: a */
    public void mo40898a(List<Document> list) {
        this.f28966d.clear();
        this.f28965c = 0;
        if (!(list == null || list.size() == 0)) {
            this.f28966d.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    private void m44826a(C10810c cVar, Document document) {
        cVar.f28989h.setText(Html.fromHtml(C10868m.m45144a(document.mo32465m(), document.mo32465m())));
    }

    /* renamed from: a */
    private void m44825a(C10808a aVar, Document document) {
        String str;
        AccountService.Account account = this.f28969g;
        if (account != null) {
            str = account.f14591h;
        } else {
            str = "";
        }
        ((AbstractC7588a) KoinJavaComponent.m268610a(AbstractC7588a.class)).mo29854a(aVar.f28983b);
        ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31497a(this.f28967e, this.f28963a, document, str, false, (ImageView) aVar.f28983b);
    }

    /* renamed from: b */
    private void m44827b(C10808a aVar, Document document) {
        boolean z;
        AccountService.Account account;
        boolean z2 = ((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20778d().f14914a;
        CustomTitleView customTitleView = aVar.f28984c;
        boolean z3 = true;
        if (!document.mo32400P() || (account = this.f28969g) == null || account.mo19681c()) {
            z = false;
        } else {
            z = true;
        }
        customTitleView.setExternalVisible(z);
        aVar.f28984c.setTitle(Html.fromHtml(C10868m.m45144a(document.mo32469n(), ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31518c(this.f28963a, document))));
        CustomTitleView customTitleView2 = aVar.f28984c;
        if (!document.mo32456j() || !z2) {
            z3 = false;
        }
        customTitleView2.setStarVisible(z3);
    }

    /* renamed from: a */
    public C10808a onCreateViewHolder(ViewGroup viewGroup, int i) {
        boolean z;
        int i2;
        Context context = viewGroup.getContext();
        this.f28963a = context;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = R.layout.search_result_item_layout_with_preview;
        } else {
            i2 = R.layout.search_result_item_layout_no_preview;
        }
        SwipeMenuLayout swipeMenuLayout = (SwipeMenuLayout) LayoutInflater.from(context).inflate(i2, viewGroup, false);
        DocsLinearLayoutManager docsLinearLayoutManager = this.f28971i;
        if (docsLinearLayoutManager != null) {
            swipeMenuLayout.setLayoutManager(docsLinearLayoutManager);
        }
        swipeMenuLayout.setSwipeEnable(this.f28972j);
        if (z) {
            return new C10810c(swipeMenuLayout);
        }
        return new C10808a(swipeMenuLayout);
    }

    /* renamed from: a */
    public void onBindViewHolder(C10808a aVar, final int i) {
        float f;
        String str;
        int i2 = this.f28965c;
        if (i2 < i && i2 <= 60) {
            this.f28965c = i;
        }
        final Document document = this.f28966d.get(i);
        m44825a(aVar, document);
        m44827b(aVar, document);
        if (!TextUtils.isEmpty(document.mo32479r())) {
            if (!this.f28970h || C13721c.m55642a(document.mo32492x(), 0L) == 0) {
                str = ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31490a(this.f28963a, document);
            } else {
                str = ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31511b(this.f28963a, document);
            }
            aVar.f28985d.setText(str);
        }
        if (getItemViewType(i) == 2 && (aVar instanceof C10810c)) {
            m44826a((C10810c) aVar, document);
        }
        aVar.f28982a.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.adapter.C10804b.C108051 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C10804b.this.f28964b != null) {
                    if (C10804b.this.mo40900a(document)) {
                        C10804b.this.f28964b.mo40815a(document, i);
                    } else {
                        Toast.showText(C10804b.this.f28963a, C10804b.this.f28963a.getString(R.string.Doc_List_OfflineOpenDocFail), 0);
                    }
                }
                C10804b.this.mo40901b();
            }
        });
        View view = aVar.itemView;
        if (mo40900a(document)) {
            f = 1.0f;
        } else {
            f = 0.3f;
        }
        view.setAlpha(f);
        aVar.f28987f.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.adapter.C10804b.C108062 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C10804b.this.f28964b != null) {
                    C10804b.this.f28964b.mo40821b(document, i);
                }
                C10804b.this.mo40901b();
            }
        });
        aVar.f28988g.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.adapter.C10804b.C108073 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C10804b.this.f28964b != null) {
                    C10804b.this.f28964b.mo40825c(document, i);
                }
                C10804b.this.mo40901b();
            }
        });
    }

    public C10804b(C10917c cVar, boolean z, AccountService.Account account, AbstractC10809b bVar) {
        this.f28966d = new ArrayList();
        this.f28968f = true;
        this.f28970h = false;
        this.f28965c = -1;
        this.f28967e = cVar;
        this.f28968f = z;
        this.f28969g = account;
        this.f28964b = bVar;
    }

    public C10804b(C10917c cVar, boolean z, boolean z2, DocsLinearLayoutManager docsLinearLayoutManager, AccountService.Account account, AbstractC10809b bVar) {
        this(cVar, z, account, bVar);
        this.f28972j = z2;
        this.f28971i = docsLinearLayoutManager;
    }
}
