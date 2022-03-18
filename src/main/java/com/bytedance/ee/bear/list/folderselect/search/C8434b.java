package com.bytedance.ee.bear.list.folderselect.search;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.contract.route.parcelable.DocOperateBean;
import com.bytedance.ee.bear.facade.common.icon.C7713a;
import com.bytedance.ee.bear.facade.common.widget.CustomTitleView;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.ToCUtil;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.folderselect.search.b */
public class C8434b extends RecyclerView.Adapter<C8437b> {

    /* renamed from: a */
    public AbstractC8436a f22762a;

    /* renamed from: b */
    private List<Document> f22763b = new ArrayList();

    /* renamed from: c */
    private AccountService.Account f22764c;

    /* renamed from: d */
    private Context f22765d;

    /* renamed from: e */
    private DocOperateBean f22766e;

    /* renamed from: f */
    private AbstractC5197b f22767f;

    /* renamed from: com.bytedance.ee.bear.list.folderselect.search.b$a */
    public interface AbstractC8436a {
        /* renamed from: a */
        void mo33022a(Document document, int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f22763b.size();
    }

    /* renamed from: a */
    public void mo33019a(AccountService.Account account) {
        this.f22764c = account;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.list.folderselect.search.b$b */
    public static class C8437b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        AppCompatImageView f22772a;

        /* renamed from: b */
        CustomTitleView f22773b;

        /* renamed from: c */
        TextView f22774c;

        C8437b(View view) {
            super(view);
            this.f22772a = (AppCompatImageView) view.findViewById(R.id.item_icon);
            this.f22773b = (CustomTitleView) view.findViewById(R.id.item_title);
            this.f22774c = (TextView) view.findViewById(R.id.item_update);
        }
    }

    /* renamed from: a */
    public void mo33021a(List<Document> list) {
        this.f22763b.clear();
        if (!(list == null || list.size() == 0)) {
            this.f22763b.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public C8437b onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        this.f22765d = context;
        return new C8437b(LayoutInflater.from(context).inflate(R.layout.search_result_list_item, viewGroup, false));
    }

    /* renamed from: a */
    private String m34952a(String str, String str2) {
        if (TextUtils.isEmpty(str) || !str.contains("<em>") || !str.contains("</em>")) {
            return str2;
        }
        return str.replaceAll("<em>", "<font color=#007Aff>").replaceAll("</em>", "</font>");
    }

    /* renamed from: a */
    private void m34953a(C8437b bVar, Document document) {
        int i;
        if (FolderVersion.isShareFolder(document.an(), document.ap())) {
            i = C7713a.m30836a();
        } else {
            i = C7713a.m30837a(document.mo32483t());
        }
        bVar.f22772a.setImageResource(i);
    }

    /* renamed from: b */
    private void m34954b(C8437b bVar, Document document) {
        boolean z;
        CustomTitleView customTitleView = bVar.f22773b;
        boolean z2 = true;
        if (!document.mo32400P() || !ToCUtil.f23737a.mo33873a(this.f22764c)) {
            z = false;
        } else {
            z = true;
        }
        customTitleView.setExternalVisible(z);
        bVar.f22773b.setTitle(Html.fromHtml(m34952a(document.mo32469n(), C8292f.m34193g(this.f22765d, document))));
        CustomTitleView customTitleView2 = bVar.f22773b;
        if (!document.mo32456j() || !this.f22767f.mo20801b().mo20778d().f14914a) {
            z2 = false;
        }
        customTitleView2.setStarVisible(z2);
    }

    /* renamed from: a */
    public void onBindViewHolder(C8437b bVar, final int i) {
        float f;
        final Document document = this.f22763b.get(i);
        m34953a(bVar, document);
        m34954b(bVar, document);
        if (!TextUtils.isEmpty(document.mo32479r())) {
            bVar.f22774c.setText(C8292f.m34130a(this.f22765d, document));
        }
        final boolean equals = TextUtils.equals(document.mo32472o(), this.f22766e.mo20976c());
        View view = bVar.itemView;
        if (!equals) {
            f = 1.0f;
        } else {
            f = 0.3f;
        }
        view.setAlpha(f);
        bVar.itemView.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.folderselect.search.C8434b.C84351 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (!equals && C8434b.this.f22762a != null) {
                    C8434b.this.f22762a.mo33022a(document, i);
                }
            }
        });
    }

    public C8434b(AbstractC8436a aVar, DocOperateBean docOperateBean, C10917c cVar) {
        this.f22762a = aVar;
        this.f22766e = docOperateBean;
        this.f22767f = (AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class);
    }
}
