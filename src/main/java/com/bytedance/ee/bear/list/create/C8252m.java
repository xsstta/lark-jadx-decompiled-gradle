package com.bytedance.ee.bear.list.create;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1144ai;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.create.C8242h;
import com.bytedance.ee.bear.templates.p552a.AbstractC11438a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.larksuite.suite.R;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.create.m */
public class C8252m implements C8242h.AbstractC8244b {

    /* renamed from: a */
    public C8254n f22253a;

    /* renamed from: b */
    private final Context f22254b;

    /* renamed from: c */
    private final C7718l f22255c;

    /* renamed from: d */
    private final View f22256d;

    /* renamed from: e */
    private final FragmentManager f22257e;

    /* renamed from: f */
    private final String f22258f;

    /* renamed from: g */
    private final String f22259g;

    /* renamed from: h */
    private final String f22260h;

    /* renamed from: i */
    private final boolean f22261i;

    /* renamed from: j */
    private final boolean f22262j;

    /* renamed from: k */
    private final C8246i f22263k = new C8246i(R.layout.list_create_menu_item_new);

    /* renamed from: l */
    private C8242h.AbstractC8244b.AbstractC8245a f22264l;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: b */
    private void m33887b() {
        if (this.f22257e.findFragmentById(R.id.recentTemplatesFragment) == null) {
            m33888c();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C13479a.m54764b("SelectCreationMenuView", "create()...");
        m33884a();
    }

    /* renamed from: a */
    private void m33884a() {
        if (this.f22255c.getActivity() != null) {
            this.f22253a = (C8254n) new C1144ai(this.f22255c.getActivity()).mo6005a(C8254n.class);
        } else {
            C13479a.m54764b("SelectCreationMenuView", "initView()...activity is null");
        }
        m33885a(R.id.list_menu_create_recycler_view, this.f22263k);
        m33887b();
    }

    /* renamed from: c */
    private void m33888c() {
        this.f22257e.beginTransaction().add(R.id.recentTemplatesFragment, ((AbstractC11438a) KoinJavaComponent.m268610a(AbstractC11438a.class)).mo43930a(this.f22254b, this.f22260h, this.f22258f, this.f22259g, Boolean.valueOf(this.f22261i), Boolean.valueOf(this.f22262j), false)).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public void setViewDelegate(C8242h.AbstractC8244b.AbstractC8245a aVar) {
        this.f22264l = aVar;
    }

    @Override // com.bytedance.ee.bear.list.create.C8242h.AbstractC8244b
    /* renamed from: a */
    public void mo32342a(ArrayList<SelectCreationMenuItem> arrayList, ArrayList<SelectCreationMenuItem> arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        if (C13657b.m55423b(arrayList)) {
            arrayList3.addAll(arrayList);
        }
        if (C13657b.m55423b(arrayList2)) {
            arrayList3.addAll(arrayList2);
        }
        this.f22263k.mo70690f(arrayList3);
    }

    /* renamed from: a */
    private void m33885a(int i, C8246i iVar) {
        final RecyclerView recyclerView = (RecyclerView) this.f22256d.findViewById(i);
        recyclerView.setAdapter(iVar);
        recyclerView.setLayoutManager(new GridLayoutManager(this.f22254b, 4));
        iVar.mo70668a((BaseQuickAdapter.AbstractC20911a) new BaseQuickAdapter.AbstractC20911a() {
            /* class com.bytedance.ee.bear.list.create.$$Lambda$m$NxsxrcObpyJCQu75Z8aVKBi_bk */

            @Override // com.chad.library.adapter.base.BaseQuickAdapter.AbstractC20911a
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                C8252m.this.m33886a(baseQuickAdapter, view, i);
            }
        });
        recyclerView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            /* class com.bytedance.ee.bear.list.create.C8252m.ViewTreeObserver$OnPreDrawListenerC82531 */

            public boolean onPreDraw() {
                if (recyclerView.getChildCount() > 0) {
                    recyclerView.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (C8252m.this.f22253a != null) {
                        C8252m.this.f22253a.setSelectCreationMenuState(1);
                    }
                }
                return true;
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m33886a(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        C13479a.m54764b("SelectCreationMenuView", "onItemClick()...position = " + i);
        if (this.f22264l == null || baseQuickAdapter.mo70685d(i) == null) {
            C13479a.m54764b("SelectCreationMenuView", "onItemClick()...delegate or item is null");
            return;
        }
        SelectCreationMenuItem selectCreationMenuItem = (SelectCreationMenuItem) baseQuickAdapter.mo70685d(i);
        if (selectCreationMenuItem != null) {
            if (selectCreationMenuItem.mo32310d()) {
                this.f22264l.mo32343a(selectCreationMenuItem.mo32307a().type);
                return;
            }
            C13479a.m54764b("SelectCreationMenuView", "onItemClick()...item is disable, mIsConnect = " + selectCreationMenuItem.mo32311e());
            if (!selectCreationMenuItem.mo32313f()) {
                Toast.showText(this.f22254b, (int) R.string.CreationMobile_ECM_AdminDisableToast);
            } else if (!selectCreationMenuItem.mo32311e()) {
                Toast.showFailureText(this.f22254b, (int) R.string.Doc_List_OperateFailedNoNet);
            }
        }
    }

    C8252m(Context context, C7718l lVar, View view, FragmentManager fragmentManager, String str, String str2, String str3, boolean z, boolean z2) {
        this.f22254b = context;
        this.f22255c = lVar;
        this.f22256d = view;
        this.f22257e = fragmentManager;
        this.f22258f = str;
        this.f22259g = str2;
        this.f22260h = str3;
        this.f22261i = z;
        this.f22262j = z2;
    }
}
