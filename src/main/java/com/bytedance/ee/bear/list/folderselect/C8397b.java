package com.bytedance.ee.bear.list.folderselect;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.contract.route.parcelable.DocOperateBean;
import com.bytedance.ee.bear.facade.common.icon.C7713a;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.ToCUtil;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.preload.ListTitleView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.folderselect.b */
public class C8397b extends RecyclerView.Adapter<C8400b> {

    /* renamed from: a */
    private final Context f22666a;

    /* renamed from: b */
    private final DocOperateBean f22667b;

    /* renamed from: c */
    private final AccountService.Account f22668c;

    /* renamed from: d */
    private List<Document> f22669d = new ArrayList();

    /* renamed from: e */
    private AbstractC8399a f22670e;

    /* renamed from: f */
    private final AbstractC5197b f22671f;

    /* renamed from: com.bytedance.ee.bear.list.folderselect.b$a */
    public interface AbstractC8399a {
        void onItemClick(View view, int i, Document document);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f22669d.size();
    }

    /* renamed from: a */
    public void mo32847a() {
        if (this.f22667b.mo20971a() == 0) {
            Context context = this.f22666a;
            Toast.showText(context, context.getString(R.string.CreationMobile_ECM_UnableAddFolderToast));
        } else if (this.f22667b.mo20971a() == 1) {
            if (this.f22667b.mo20983i()) {
                Context context2 = this.f22666a;
                Toast.showText(context2, context2.getString(R.string.CreationMobile_ECM_UnableMoveDocToast));
                return;
            }
            Context context3 = this.f22666a;
            Toast.showText(context3, context3.getString(R.string.CreationMobile_ECM_UnableMoveToast));
        } else if (this.f22667b.mo20971a() == 2) {
            Context context4 = this.f22666a;
            Toast.showText(context4, context4.getString(R.string.CreationMobile_ECM_UnableShortToast));
        }
    }

    /* renamed from: a */
    public void mo32848a(AbstractC8399a aVar) {
        this.f22670e = aVar;
    }

    /* renamed from: c */
    private boolean m34802c(Document document) {
        return TextUtils.equals(document.mo32472o(), this.f22667b.mo20976c());
    }

    /* renamed from: a */
    public void mo32850a(List<Document> list) {
        this.f22669d = list;
    }

    /* renamed from: com.bytedance.ee.bear.list.folderselect.b$b */
    public static class C8400b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ConstraintLayout f22674a;

        /* renamed from: b */
        ListTitleView f22675b = ((ListTitleView) this.f22674a.findViewById(R.id.item_name));

        /* renamed from: c */
        AppCompatImageView f22676c;

        /* renamed from: d */
        TextView f22677d = ((TextView) this.f22674a.findViewById(R.id.update_time));

        C8400b(View view) {
            super(view);
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.item_content);
            this.f22674a = constraintLayout;
            this.f22676c = (AppCompatImageView) constraintLayout.findViewById(R.id.item_icon);
        }
    }

    /* renamed from: b */
    private boolean m34801b(Document document) {
        if (this.f22667b.mo20985k() || this.f22667b.mo20987m()) {
            return true;
        }
        if (m34802c(document)) {
            return false;
        }
        return !mo32851a(document);
    }

    /* renamed from: a */
    public boolean mo32851a(Document document) {
        if (this.f22667b.mo20983i() && !FolderVersion.isShareFolderV2(document.an())) {
            return true;
        }
        if (this.f22667b.mo20983i() || !FolderVersion.isShareFolderV2(document.an())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public C8400b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C8400b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_doc_recycler_item_content, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C8400b bVar, int i) {
        boolean z;
        int i2;
        final Document document = this.f22669d.get(i);
        bVar.f22674a.setTag(Integer.valueOf(i));
        bVar.f22674a.setOnClickListener(new View.OnClickListener(i, document) {
            /* class com.bytedance.ee.bear.list.folderselect.$$Lambda$b$WlFkDUkaFmyRQFTiTXbtz_zk9A */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ Document f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                C8397b.m269659lambda$WlFkDUkaFmyRQFTiTXbtz_zk9A(C8397b.this, this.f$1, this.f$2, view);
            }
        });
        bVar.f22675b.setTitle(C8292f.m34193g(this.f22666a, document));
        ListTitleView listTitleView = bVar.f22675b;
        boolean z2 = true;
        if (!document.mo32400P() || !ToCUtil.f23737a.mo33873a(this.f22668c)) {
            z = false;
        } else {
            z = true;
        }
        listTitleView.setExternalVisible(z);
        ListTitleView listTitleView2 = bVar.f22675b;
        if (!FolderVersion.isShareFolderV2(document.an()) || !C4211a.m17514a().mo16536a("spacekit.mobile.single_container_tag_enable", false)) {
            z2 = false;
        }
        listTitleView2.setSecondVisible(z2);
        bVar.f22675b.setStarVisible(document.mo32456j() & this.f22671f.mo20801b().mo20778d().f14914a);
        bVar.f22677d.setText(C8292f.m34130a(this.f22666a, document));
        AppCompatImageView appCompatImageView = bVar.f22676c;
        if (FolderVersion.isPersonalFolder(document.an(), document.ap())) {
            i2 = C7713a.m30837a(C8275a.f22370c.mo32555b());
        } else {
            i2 = C7713a.m30836a();
        }
        appCompatImageView.setImageResource(i2);
        if (m34801b(document)) {
            bVar.itemView.setAlpha(1.0f);
            return;
        }
        bVar.f22674a.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.folderselect.C8397b.C83981 */

            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C8397b.this.mo32851a(document)) {
                    C8397b.this.mo32847a();
                }
            }
        });
        bVar.itemView.setAlpha(0.3f);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m34800a(int i, Document document, View view) {
        AbstractC8399a aVar = this.f22670e;
        if (aVar != null) {
            aVar.onItemClick(view, i, document);
        }
    }

    C8397b(Context context, DocOperateBean docOperateBean, AccountService.Account account) {
        this.f22666a = context;
        this.f22667b = docOperateBean;
        this.f22668c = account;
        this.f22671f = (AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class);
    }
}
