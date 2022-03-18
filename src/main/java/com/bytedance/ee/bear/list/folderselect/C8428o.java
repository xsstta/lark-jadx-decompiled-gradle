package com.bytedance.ee.bear.list.folderselect;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.route.parcelable.DocOperateBean;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.config.SpaceFeatureGatingV2;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.folderselect.AbstractC8407f;
import com.bytedance.ee.bear.list.folderselect.C8397b;
import com.bytedance.ee.bear.list.loadstateview.C8594b;
import com.bytedance.ee.bear.list.loadstateview.EmptyCategory;
import com.bytedance.ee.bear.list.loadstateview.LoadStateView;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.C11824c;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.folderselect.o */
public class C8428o implements AbstractC8407f.AbstractC8409b {

    /* renamed from: a */
    public AbstractC8407f.AbstractC8409b.AbstractC8410a f22739a;

    /* renamed from: b */
    private final String f22740b;

    /* renamed from: c */
    private final int f22741c;

    /* renamed from: d */
    private int f22742d;

    /* renamed from: e */
    private final int f22743e;

    /* renamed from: f */
    private ShareFolderUserPermission f22744f;

    /* renamed from: g */
    private final boolean f22745g;

    /* renamed from: h */
    private final Context f22746h;

    /* renamed from: i */
    private final C10917c f22747i;

    /* renamed from: j */
    private final DocOperateBean f22748j;

    /* renamed from: k */
    private final String f22749k;

    /* renamed from: l */
    private final boolean f22750l;

    /* renamed from: m */
    private C8397b f22751m;

    /* renamed from: n */
    private C11824c f22752n;

    /* renamed from: o */
    private final View f22753o;

    /* renamed from: p */
    private BaseTitleBar f22754p;

    /* renamed from: q */
    private SwipeRefreshLayout f22755q;

    /* renamed from: r */
    private C8594b f22756r;

    /* renamed from: s */
    private Group f22757s;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f22739a = null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: m */
    private /* synthetic */ void m34925m() {
        AbstractC8407f.AbstractC8409b.AbstractC8410a aVar = this.f22739a;
        if (aVar != null) {
            aVar.mo32872b();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: n */
    private /* synthetic */ void m34926n() {
        AbstractC8407f.AbstractC8409b.AbstractC8410a aVar = this.f22739a;
        if (aVar != null) {
            aVar.mo32872b();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m34916d();
        m34917e();
    }

    /* renamed from: g */
    private void m34919g() {
        int i;
        Group group = this.f22757s;
        if (m34920h()) {
            i = 8;
        } else {
            i = 0;
        }
        group.setVisibility(i);
    }

    /* renamed from: d */
    private void m34916d() {
        this.f22751m = new C8397b(this.f22746h, this.f22748j, ((an) KoinJavaComponent.m268610a(an.class)).mo16408f());
    }

    /* renamed from: e */
    private void m34917e() {
        m34923k();
        m34921i();
        m34922j();
        m34918f();
        this.f22752n = new C11824c(this.f22746h);
    }

    @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8407f.AbstractC8409b
    /* renamed from: a */
    public void mo32862a() {
        this.f22756r.mo33503a();
    }

    /* renamed from: f */
    private void m34918f() {
        this.f22757s = (Group) this.f22753o.findViewById(R.id.list_doc_operate_btn_group);
        Button button = (Button) this.f22753o.findViewById(R.id.list_folder_select_copy_or_move);
        if (!TextUtils.isEmpty(this.f22749k)) {
            button.setText(this.f22749k);
        }
        button.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.folderselect.C8428o.C84291 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C8428o.this.f22739a != null) {
                    C8428o.this.f22739a.mo32874d();
                }
            }
        });
        m34919g();
    }

    /* renamed from: i */
    private void m34921i() {
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f22753o.findViewById(R.id.list_swipe_refresh);
        this.f22755q = swipeRefreshLayout;
        swipeRefreshLayout.setRefreshing(false);
        this.f22755q.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            /* class com.bytedance.ee.bear.list.folderselect.$$Lambda$o$MrG7rojpC27Zpj1gJOUl9toi0uw */

            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                C8428o.this.m34926n();
            }
        });
        RecyclerView recyclerView = (RecyclerView) this.f22753o.findViewById(R.id.list_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f22746h));
        recyclerView.setAdapter(this.f22751m);
        this.f22751m.mo32848a(new C8397b.AbstractC8399a() {
            /* class com.bytedance.ee.bear.list.folderselect.$$Lambda$o$vqbG5msALmCoADe0rTNADFAHH2M */

            @Override // com.bytedance.ee.bear.list.folderselect.C8397b.AbstractC8399a
            public final void onItemClick(View view, int i, Document document) {
                C8428o.this.m34914a(view, i, document);
            }
        });
    }

    /* renamed from: j */
    private void m34922j() {
        C8594b bVar = new C8594b((LoadStateView) this.f22753o.findViewById(R.id.list_state_view_root), Looper.getMainLooper());
        this.f22756r = bVar;
        bVar.mo33511a(false, EmptyCategory.f23248l);
        this.f22756r.mo33509a(new LoadStateView.AbstractC8574f() {
            /* class com.bytedance.ee.bear.list.folderselect.$$Lambda$o$ZPYJ9KCjYwowCUB5ABQhkGmy3O4 */

            @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8574f
            public final void onTouchEvent() {
                C8428o.this.m34925m();
            }
        });
    }

    /* renamed from: k */
    private void m34923k() {
        BaseTitleBar baseTitleBar = (BaseTitleBar) this.f22753o.findViewById(R.id.list_folder_select_titlebar);
        this.f22754p = baseTitleBar;
        baseTitleBar.setDividerVisible(false);
        this.f22754p.setLeftClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.folderselect.C8428o.C84302 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C8428o.this.f22739a != null) {
                    C8428o.this.f22739a.mo32875e();
                }
            }
        });
        this.f22754p.setTitle(this.f22740b);
        m34924l();
        ((FrameLayout) this.f22753o.findViewById(R.id.search_layout)).setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.folderselect.C8428o.C84313 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C8428o.this.f22739a != null) {
                    C8428o.this.f22739a.mo32870a();
                }
            }
        });
    }

    @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8407f.AbstractC8409b
    /* renamed from: c */
    public void mo32869c() {
        new BearUDDialogBuilder(this.f22746h).mo45344a(R.string.CreationMobile_ECM_NotificationTitle).mo45362d(R.string.CreationMobile_ECM_TransferDesc).mo45360c(8388611).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_Confirm, new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.list.folderselect.$$Lambda$o$nRiGmo9x9a8DMOG_pTUaavRXINs */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C8428o.this.m34913a(dialogInterface, i);
            }
        }).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, (DialogInterface.OnClickListener) null).mo45355a().show();
    }

    /* renamed from: h */
    private boolean m34920h() {
        if (SpaceFeatureGatingV2.m32622a()) {
            int i = this.f22741c;
            if (i != 6 && (!(i == 4 && this.f22748j.mo20971a() == 3) && (this.f22741c != 4 || this.f22748j.mo20983i() || this.f22748j.mo20977d() == C8275a.f22370c.mo32555b()))) {
                if (this.f22741c == 4 || !FolderVersion.isShareFolderV2(this.f22743e)) {
                    return false;
                }
                ShareFolderUserPermission shareFolderUserPermission = this.f22744f;
                if (shareFolderUserPermission == null || !shareFolderUserPermission.canMoveToHere()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        int i2 = this.f22741c;
        if (i2 == 6 || i2 == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private void m34924l() {
        boolean z;
        ShareFolderUserPermission shareFolderUserPermission;
        C13479a.m54764b("SubFolderSelectView", "addCreateBtn()...mFolderType = " + this.f22741c);
        if (this.f22750l) {
            C13479a.m54764b("SubFolderSelectView", "addCreateBtn()...mDisableCreateFolder = true");
            return;
        }
        int i = this.f22741c;
        if (i != 6) {
            boolean z2 = false;
            if (i == 4 || !this.f22745g) {
                z = true;
            } else {
                z = false;
            }
            if (z || this.f22742d == 2 || (FolderVersion.isShareFolderV2(this.f22743e) && (shareFolderUserPermission = this.f22744f) != null && shareFolderUserPermission.canCreateSubNode())) {
                z2 = true;
            }
            if (z2) {
                this.f22754p.mo45073a();
                this.f22754p.mo45070a(new BaseTitleBar.C11803d(R.drawable.ud_icon_creat_folder_outlined) {
                    /* class com.bytedance.ee.bear.list.folderselect.C8428o.C84324 */

                    @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.AbstractC11800a, com.bytedance.ee.bear.widgets.BaseTitleBar.C11801b
                    /* renamed from: a */
                    public void mo16854a(View view) {
                        if (C8428o.this.f22739a != null) {
                            C8428o.this.f22739a.mo32873c();
                        }
                    }
                });
                this.f22754p.setActionIconTint(R.color.facade_selector_icon_n1);
            }
        }
    }

    @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8407f.AbstractC8409b
    /* renamed from: b */
    public void mo32868b() {
        Context context = this.f22746h;
        new BearUDDialogBuilder(this.f22746h).mo45344a(R.string.CreationMobile_ECM_MovedExternalConfirmTitle).mo45357b(C10539a.m43639a(context, R.string.CreationMobile_ECM_MovedExternalConfirmDesc, ShareHitPoint.f121869d, C8292f.m34168b(context, this.f22748j.mo20977d()))).mo45360c(8388611).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_Confirm, new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.list.folderselect.$$Lambda$o$cpJQhSQYuLQF69CJ93lu8GweFZU */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C8428o.this.m34915b(dialogInterface, i);
            }
        }).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, (DialogInterface.OnClickListener) null).mo45355a().show();
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC8407f.AbstractC8409b.AbstractC8410a aVar) {
        this.f22739a = aVar;
    }

    @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8407f.AbstractC8409b
    /* renamed from: a */
    public void mo32863a(Document document) {
        if (document != null) {
            this.f22742d = document.mo32398N();
            m34924l();
            m34919g();
        }
    }

    @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8407f.AbstractC8409b
    /* renamed from: a */
    public void mo32864a(ShareFolderUserPermission shareFolderUserPermission) {
        this.f22744f = shareFolderUserPermission;
    }

    @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8407f.AbstractC8409b
    /* renamed from: a */
    public void mo32865a(Throwable th) {
        this.f22755q.setRefreshing(false);
        this.f22756r.mo33510a(th);
    }

    @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8407f.AbstractC8409b
    /* renamed from: a */
    public void mo32866a(List<Document> list) {
        this.f22755q.setRefreshing(false);
        this.f22756r.mo33514b(C13657b.m55424c(list));
        this.f22751m.mo32850a(list);
        this.f22751m.notifyDataSetChanged();
    }

    @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8407f.AbstractC8409b
    /* renamed from: a */
    public void mo32867a(boolean z) {
        if (z) {
            this.f22752n.mo45304d();
        } else {
            this.f22752n.mo45303c();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m34913a(DialogInterface dialogInterface, int i) {
        AbstractC8407f.AbstractC8409b.AbstractC8410a aVar = this.f22739a;
        if (aVar != null) {
            aVar.mo32877g();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m34915b(DialogInterface dialogInterface, int i) {
        AbstractC8407f.AbstractC8409b.AbstractC8410a aVar = this.f22739a;
        if (aVar != null) {
            aVar.mo32876f();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m34914a(View view, int i, Document document) {
        AbstractC8407f.AbstractC8409b.AbstractC8410a aVar = this.f22739a;
        if (aVar != null) {
            aVar.mo32871a(view, i, document);
        }
    }

    C8428o(Context context, View view, C10917c cVar, DocOperateBean docOperateBean, String str, boolean z, int i, String str2, int i2, int i3, boolean z2) {
        this.f22746h = context;
        this.f22753o = view;
        this.f22747i = cVar;
        this.f22748j = docOperateBean;
        this.f22749k = str;
        this.f22750l = z;
        this.f22741c = i;
        this.f22740b = str2;
        this.f22743e = i2;
        this.f22742d = i3;
        this.f22745g = z2;
    }
}
