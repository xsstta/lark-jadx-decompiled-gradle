package com.ss.android.lark.contact.impl.contacts_new;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.dto.ChatApplication;
import com.ss.android.lark.contact.feat.p1745d.C35466d;
import com.ss.android.lark.contact.impl.contacts_new.AbstractC35695a;
import com.ss.android.lark.contact.impl.contacts_new.NewContactAdapter;
import com.ss.android.lark.contact.impl.contacts_new.NewContactView;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57832h;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.util.C59252a;
import java.util.List;

public class NewContactView implements AbstractC35695a.AbstractC35698b {

    /* renamed from: a */
    public AbstractC35695a.AbstractC35698b.AbstractC35699a f92309a;

    /* renamed from: b */
    public NewContactAdapter f92310b;

    /* renamed from: c */
    private Context f92311c;

    /* renamed from: d */
    private AbstractC35694b f92312d;

    /* renamed from: e */
    private LKUIStatus f92313e;
    ViewGroup mContentView;
    View mNewContactEmptyLayout;
    RecyclerView mNewContactRV;
    LKUIPtrClassicFrameLayout mPtrFrame;
    CommonTitleBar mTitleBar;
    RelativeLayout newContactAddExtRl;
    TextView newContactAddExtTv;
    TextView newContactSubTitleTv;

    /* renamed from: com.ss.android.lark.contact.impl.contacts_new.NewContactView$b */
    public interface AbstractC35694b {
        /* renamed from: a */
        void mo131476a();

        /* renamed from: a */
        void mo131477a(NewContactView newContactView);

        /* renamed from: a */
        void mo131478a(String str, String str2);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_new.AbstractC35695a.AbstractC35698b
    /* renamed from: c */
    public void mo131473c() {
        this.f92313e.mo89838a(300);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_new.AbstractC35695a.AbstractC35698b
    /* renamed from: d */
    public void mo131474d() {
        this.f92313e.mo89847d();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f92312d = null;
        this.f92309a = null;
    }

    /* renamed from: e */
    private void m139717e() {
        m139718f();
        m139719g();
        m139720h();
        m139721i();
    }

    /* renamed from: f */
    private void m139718f() {
        this.mTitleBar.setTitle(R.string.Lark_Legacy_ContactsNew);
        this.mTitleBar.setVisibility(0);
    }

    /* renamed from: j */
    private void m139722j() {
        this.mContentView.setVisibility(0);
        this.mNewContactEmptyLayout.setVisibility(8);
        if (C35466d.m138738a()) {
            this.mContentView.setVisibility(0);
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_new.AbstractC35695a.AbstractC35698b
    /* renamed from: a */
    public void mo131464a() {
        this.mPtrFrame.refreshComplete();
    }

    @Override // com.ss.android.lark.contact.impl.contacts_new.AbstractC35695a.AbstractC35698b
    /* renamed from: b */
    public void mo131470b() {
        this.mContentView.setVisibility(8);
        this.mNewContactEmptyLayout.setVisibility(0);
        C57582a.m223615c(this.mNewContactEmptyLayout);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f92312d.mo131477a(this);
        this.f92311c = this.mTitleBar.getContext();
        m139717e();
    }

    /* renamed from: h */
    private void m139720h() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f92311c);
        this.mPtrFrame.setKeepHeaderWhenRefresh(true);
        this.mPtrFrame.setFooterView(chatWindowPtrLoadingHeader);
        this.mPtrFrame.addPtrUIHandler(chatWindowPtrLoadingHeader);
        this.mPtrFrame.disableWhenHorizontalMove(true);
        this.mPtrFrame.setPtrHandler(new LKUIPtrDefaultHandler2() {
            /* class com.ss.android.lark.contact.impl.contacts_new.NewContactView.C356901 */

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                NewContactView.this.f92309a.mo131489b();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                if (!super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2) || !NewContactView.this.f92309a.mo131488a()) {
                    return false;
                }
                return true;
            }
        });
    }

    /* renamed from: g */
    private void m139719g() {
        AbstractC35361b.AbstractC35374m e = C35358a.m138143a().mo130158e();
        if (e.mo130216a()) {
            this.newContactAddExtRl.setVisibility(0);
            C57832h.m224486a(this.newContactAddExtRl);
            this.newContactAddExtRl.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.contact.impl.contacts_new.$$Lambda$NewContactView$9LOUnzetQTNSmkQucVoQmsTx9M */

                public final void onClick(View view) {
                    NewContactView.m270487lambda$9LOUnzetQTNSmkQucVoQmsTx9M(NewContactView.this, view);
                }
            });
            this.newContactAddExtTv.setText(e.mo130220c());
        } else {
            this.newContactAddExtRl.setVisibility(8);
        }
        if (C35466d.m138738a()) {
            this.newContactSubTitleTv.setVisibility(0);
        } else {
            this.newContactSubTitleTv.setVisibility(8);
        }
    }

    /* renamed from: i */
    private void m139721i() {
        this.mNewContactRV.setLayoutManager(new LinearLayoutManager(this.f92311c, 1, false));
        if (this.f92310b == null) {
            this.f92310b = new NewContactAdapter();
        }
        this.f92310b.mo131457a(new NewContactAdapter.AbstractC35689a() {
            /* class com.ss.android.lark.contact.impl.contacts_new.NewContactView.C356912 */

            @Override // com.ss.android.lark.contact.impl.contacts_new.NewContactAdapter.AbstractC35689a
            /* renamed from: a */
            public void mo131462a(C35693a aVar) {
                NewContactView.this.mo131471b(aVar);
            }

            @Override // com.ss.android.lark.contact.impl.contacts_new.NewContactAdapter.AbstractC35689a
            /* renamed from: a */
            public void mo131463a(String str, String str2) {
                NewContactView.this.f92309a.mo131487a(str, str2);
            }
        });
        this.mNewContactRV.setAdapter(this.f92310b);
        C59252a.m230151a(this.f92311c, this.mPtrFrame, this.mNewContactRV, new C59252a.AbstractC59254a() {
            /* class com.ss.android.lark.contact.impl.contacts_new.NewContactView.C356923 */

            @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
            /* renamed from: a */
            public int mo31266a() {
                return NewContactView.this.f92310b.getItemCount() - 7;
            }

            @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
            /* renamed from: b */
            public boolean mo31267b() {
                if (NewContactView.this.f92309a == null || !NewContactView.this.f92309a.mo131488a()) {
                    return false;
                }
                return true;
            }
        });
        this.f92313e = new LKUIStatus.C25680a(this.mContentView).mo89859a();
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC35695a.AbstractC35698b.AbstractC35699a aVar) {
        this.f92309a = aVar;
    }

    public NewContactView(AbstractC35694b bVar) {
        this.f92312d = bVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m139714a(View view) {
        ContactHitPoint.m140806h("add_external");
        this.f92312d.mo131476a();
    }

    /* renamed from: com.ss.android.lark.contact.impl.contacts_new.NewContactView$a */
    public static class C35693a {

        /* renamed from: a */
        public String f92317a;

        /* renamed from: b */
        public String f92318b;

        /* renamed from: c */
        public String f92319c;

        /* renamed from: d */
        public String f92320d;

        /* renamed from: e */
        public String f92321e;

        /* renamed from: f */
        public String f92322f;

        /* renamed from: g */
        public ChatApplication.Status f92323g;

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35693a)) {
                return false;
            }
            String str = this.f92317a;
            String str2 = ((C35693a) obj).f92317a;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
            return false;
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_new.AbstractC35695a.AbstractC35698b
    /* renamed from: a */
    public void mo131465a(int i) {
        Context context = this.f92311c;
        if (context != null) {
            UDToast.show(context, i);
        }
    }

    /* renamed from: b */
    public void mo131471b(C35693a aVar) {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f92311c).title(R.string.Lark_Contacts_DeleteNewContactHistory)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_ConfirmTip, new DialogInterface.OnClickListener(aVar) {
            /* class com.ss.android.lark.contact.impl.contacts_new.$$Lambda$NewContactView$vGQ7YbZPbxW5j6nCVcxs2xqE0 */
            public final /* synthetic */ NewContactView.C35693a f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                NewContactView.m270488lambda$vGQ7YbZPbxW5j6nCVcxs2xqE0(NewContactView.this, this.f$1, dialogInterface, i);
            }
        })).show();
    }

    /* renamed from: c */
    private void m139716c(C35693a aVar) {
        List items = this.f92310b.getItems();
        if (items.contains(aVar)) {
            C35693a aVar2 = (C35693a) items.get(items.indexOf(aVar));
            aVar2.f92323g = aVar.f92323g;
            if (aVar2.f92323g == ChatApplication.Status.AGREED || aVar2.f92323g == ChatApplication.Status.PEDING || aVar2.f92323g == ChatApplication.Status.EXPIRED) {
                this.f92310b.notifyItemChanged(aVar2);
            } else if (aVar2.f92323g == ChatApplication.Status.DELETED) {
                this.f92310b.remove(aVar2);
            }
        }
        if (CollectionUtils.isEmpty(items)) {
            mo131470b();
        } else {
            m139722j();
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_new.AbstractC35695a.AbstractC35698b
    /* renamed from: a */
    public void mo131466a(C35693a aVar) {
        this.f92310b.remove(aVar);
        if (CollectionUtils.isEmpty(this.f92310b.getItems())) {
            mo131470b();
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_new.AbstractC35695a.AbstractC35698b
    /* renamed from: b */
    public void mo131472b(List<C35693a> list) {
        for (C35693a aVar : list) {
            m139716c(aVar);
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_new.AbstractC35695a.AbstractC35698b
    /* renamed from: a */
    public void mo131469a(List<C35693a> list) {
        m139722j();
        this.f92310b.addAll(list);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_new.AbstractC35695a.AbstractC35698b
    /* renamed from: a */
    public void mo131468a(String str, String str2) {
        this.f92312d.mo131478a(str, str2);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m139715a(C35693a aVar, DialogInterface dialogInterface, int i) {
        this.f92309a.mo131486a(aVar);
    }
}
