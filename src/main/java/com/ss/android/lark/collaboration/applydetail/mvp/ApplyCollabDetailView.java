package com.ss.android.lark.collaboration.applydetail.mvp;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.larksuite.suite.R;
import com.ss.android.lark.collaboration.applydetail.mvp.AbstractC35350d;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

public class ApplyCollabDetailView implements AbstractC35350d.AbstractC35353b {

    /* renamed from: a */
    private AbstractC35343a f91375a;

    /* renamed from: b */
    private AbstractC35350d.AbstractC35353b.AbstractC35354a f91376b;

    /* renamed from: c */
    private C35348c f91377c;
    @BindView(7063)
    RecyclerView mContactListRV;
    @BindView(8261)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.collaboration.applydetail.mvp.ApplyCollabDetailView$a */
    public interface AbstractC35343a {
        /* renamed from: a */
        Context mo130074a();

        /* renamed from: a */
        void mo130075a(ApplyCollabDetailView applyCollabDetailView);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.collaboration.applydetail.mvp.AbstractC35350d.AbstractC35353b
    /* renamed from: a */
    public void mo130080a() {
        this.f91377c.notifyDataSetChanged();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f91375a.mo130075a(this);
        m138102b();
    }

    /* renamed from: b */
    private void m138102b() {
        this.f91377c = new C35348c(this.f91375a.mo130074a(), R.layout.apply_collab_detail_item_layout);
        this.mContactListRV.setLayoutManager(new LinearLayoutManager(this.f91375a.mo130074a(), 1, false));
        this.mContactListRV.setAdapter(this.f91377c);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC35350d.AbstractC35353b.AbstractC35354a aVar) {
        this.f91376b = aVar;
    }

    public ApplyCollabDetailView(AbstractC35343a aVar) {
        this.f91375a = aVar;
    }

    @Override // com.ss.android.lark.collaboration.applydetail.mvp.AbstractC35350d.AbstractC35353b
    /* renamed from: a */
    public void mo130082a(List<Contact> list) {
        this.mTitleBar.setTitle(UIHelper.mustacheFormat((int) R.string.Lark_NewContacts_PermissionRequestMobileRemoveTitle, "Number", String.valueOf(list.size())));
        this.f91377c.resetAll(list);
    }
}
