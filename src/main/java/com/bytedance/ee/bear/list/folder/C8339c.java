package com.bytedance.ee.bear.list.folder;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.p426d.C8263g;
import com.bytedance.ee.bear.service.C10917c;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.folder.c */
public class C8339c extends RecyclerView.Adapter<C8341b> {

    /* renamed from: a */
    private Context f22527a;

    /* renamed from: b */
    private List<Document> f22528b = new ArrayList();

    /* renamed from: c */
    private AbstractC8340a f22529c;

    /* renamed from: d */
    private AccountService.Account f22530d;

    /* renamed from: e */
    private C10917c f22531e;

    /* renamed from: f */
    private boolean f22532f;

    /* renamed from: com.bytedance.ee.bear.list.folder.c$a */
    public interface AbstractC8340a {
        void onItemClick(int i, Document document);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f22528b.size();
    }

    /* renamed from: a */
    public void mo32762a(AbstractC8340a aVar) {
        this.f22529c = aVar;
    }

    /* renamed from: a */
    public void mo32761a(AccountService.Account account) {
        this.f22530d = account;
        notifyDataSetChanged();
    }

    public C8339c(C10917c cVar) {
        this.f22531e = cVar;
        this.f22532f = C4211a.m17514a().mo16536a("spacekit.mobile.docs_diy_icon", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.list.folder.c$b */
    public static class C8341b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        AppCompatImageView f22533a;

        /* renamed from: b */
        TextView f22534b;

        /* renamed from: c */
        TextView f22535c;

        /* renamed from: d */
        TextView f22536d;

        /* renamed from: e */
        AppCompatImageView f22537e;

        /* renamed from: f */
        TextView f22538f;

        C8341b(View view) {
            super(view);
            this.f22533a = (AppCompatImageView) view.findViewById(R.id.item_file_icon);
            this.f22534b = (TextView) view.findViewById(R.id.item_file_name);
            this.f22535c = (TextView) view.findViewById(R.id.item_user_name);
            this.f22536d = (TextView) view.findViewById(R.id.item_user_name_title);
            this.f22537e = (AppCompatImageView) view.findViewById(R.id.item_file_no_permission_icon);
            this.f22538f = (TextView) view.findViewById(R.id.item_no_permission_file_name);
        }
    }

    /* renamed from: a */
    public void mo32764a(List<Document> list) {
        if (list != null) {
            if (list instanceof ArrayList) {
                this.f22528b = list;
            } else {
                this.f22528b.clear();
                this.f22528b.addAll(list);
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private void m34534a(Document document, ImageView imageView) {
        String str;
        AccountService.Account account = this.f22530d;
        if (account != null) {
            str = account.f14591h;
        } else {
            str = "";
        }
        new C8263g(this.f22531e, this.f22527a, document, str, false, imageView, this.f22532f).mo32361a();
    }

    /* renamed from: a */
    public C8341b onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        this.f22527a = context;
        return new C8341b(LayoutInflater.from(context).inflate(R.layout.list_users_authority_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C8341b bVar, int i) {
        String str;
        Document document = this.f22528b.get(i);
        bVar.itemView.setOnClickListener(new View.OnClickListener(i, document) {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$c$JnjQ3lrHUaVoF9lmurTzgWo3OHc */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ Document f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                C8339c.this.m34533a(this.f$1, this.f$2, view);
            }
        });
        if (document.ah()) {
            String g = C8292f.m34193g(this.f22527a, document);
            if (TextUtils.isEmpty(document.mo32488v())) {
                str = "";
            } else {
                str = document.mo32488v();
            }
            m34534a(document, bVar.f22533a);
            bVar.f22534b.setText(g);
            bVar.f22535c.setText(str);
            bVar.f22533a.setVisibility(0);
            bVar.f22534b.setVisibility(0);
            bVar.f22535c.setVisibility(0);
            bVar.f22536d.setVisibility(0);
            bVar.f22537e.setVisibility(8);
            bVar.f22538f.setVisibility(8);
            return;
        }
        bVar.f22533a.setVisibility(8);
        bVar.f22534b.setVisibility(8);
        bVar.f22535c.setVisibility(8);
        bVar.f22536d.setVisibility(8);
        bVar.f22537e.setVisibility(0);
        bVar.f22538f.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m34533a(int i, Document document, View view) {
        AbstractC8340a aVar = this.f22529c;
        if (aVar != null) {
            aVar.onItemClick(i, document);
        }
    }
}
