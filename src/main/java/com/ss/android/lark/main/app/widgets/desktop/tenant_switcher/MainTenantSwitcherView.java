package com.ss.android.lark.main.app.widgets.desktop.tenant_switcher;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44464b;
import com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.TenantFolderSwitchAdapter;
import com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.entity.C44486a;
import com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.entity.C44487b;
import com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.entity.C44489d;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.ui.C57605g;
import com.ss.android.lark.utils.UIHelper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class MainTenantSwitcherView implements C44464b.AbstractC44467b {

    /* renamed from: a */
    public AbstractC44456a f112782a;

    /* renamed from: b */
    public C44464b.AbstractC44467b.AbstractC44468a f112783b;

    /* renamed from: c */
    public TenantFolderSwitchAdapter f112784c;

    /* renamed from: d */
    public List<C44487b> f112785d = new ArrayList();

    /* renamed from: e */
    private Context f112786e;

    /* renamed from: f */
    private AbstractC44136a.AbstractC44137a f112787f;

    /* renamed from: g */
    private C57605g f112788g;
    @BindView(7774)
    RecyclerView mTenantRV;

    @Retention(RetentionPolicy.SOURCE)
    public @interface TenantFailReason {
    }

    /* renamed from: com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.MainTenantSwitcherView$a */
    public interface AbstractC44456a {
        /* renamed from: a */
        void mo157850a();

        /* renamed from: a */
        void mo157851a(MainTenantSwitcherView mainTenantSwitcherView);

        /* renamed from: a */
        void mo157852a(boolean z);

        /* renamed from: b */
        void mo157853b();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: c */
    private void m176387c() {
        this.mTenantRV.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.MainTenantSwitcherView.ViewTreeObserver$OnGlobalLayoutListenerC444544 */

            public void onGlobalLayout() {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.MainTenantSwitcherView.ViewTreeObserver$OnGlobalLayoutListenerC444544.RunnableC444551 */

                    public void run() {
                        boolean z;
                        if (MainTenantSwitcherView.this.f112783b != null) {
                            C44464b.AbstractC44467b.AbstractC44468a aVar = MainTenantSwitcherView.this.f112783b;
                            if (MainTenantSwitcherView.this.f112784c.getItemCount() >= 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            aVar.mo157888a(z);
                        }
                    }
                });
                MainTenantSwitcherView.this.mTenantRV.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        AbstractC44456a aVar = this.f112782a;
        if (aVar != null) {
            aVar.mo157851a(this);
        }
        m176386b();
    }

    /* renamed from: b */
    private void m176386b() {
        this.mTenantRV.setLayoutManager(new LinearLayoutManager(this.f112786e, 1, true));
        this.mTenantRV.setItemAnimator(null);
        if (this.f112784c == null) {
            TenantFolderSwitchAdapter tenantFolderSwitchAdapter = new TenantFolderSwitchAdapter();
            this.f112784c = tenantFolderSwitchAdapter;
            tenantFolderSwitchAdapter.mo157873a(new TenantFolderSwitchAdapter.AbstractC44461b() {
                /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.MainTenantSwitcherView.C444533 */

                @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.TenantFolderSwitchAdapter.AbstractC44461b
                /* renamed from: a */
                public void mo157864a() {
                    MainTenantSwitcherView.this.f112782a.mo157850a();
                    MainTenantSwitcherView mainTenantSwitcherView = MainTenantSwitcherView.this;
                    mainTenantSwitcherView.mo157862c(mainTenantSwitcherView.f112785d);
                }

                @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.TenantFolderSwitchAdapter.AbstractC44461b
                /* renamed from: b */
                public void mo157866b() {
                    MainTenantSwitcherView.this.f112782a.mo157853b();
                    MainTenantSwitcherView mainTenantSwitcherView = MainTenantSwitcherView.this;
                    mainTenantSwitcherView.mo157861b(mainTenantSwitcherView.f112785d);
                }

                @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.TenantFolderSwitchAdapter.AbstractC44461b
                /* renamed from: a */
                public void mo157865a(C44487b bVar) {
                    if (MainTenantSwitcherView.this.f112783b == null) {
                        return;
                    }
                    if (bVar.mo157917j()) {
                        MainTenantSwitcherView.this.f112783b.mo157889b(bVar);
                    } else {
                        MainTenantSwitcherView.this.f112783b.mo157887a(bVar);
                    }
                }
            });
        }
        this.mTenantRV.setAdapter(this.f112784c);
    }

    @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44464b.AbstractC44467b
    /* renamed from: a */
    public void mo157854a() {
        C57605g gVar = this.f112788g;
        if (gVar == null || !gVar.mo195588b()) {
            View findViewByPosition = this.mTenantRV.getLayoutManager().findViewByPosition(1);
            if (this.f112788g == null) {
                C57605g gVar2 = new C57605g(this.f112786e);
                this.f112788g = gVar2;
                View a = gVar2.mo195585a(R.layout.common_blue_tip_layout, UIHelper.dp2px(270.0f), -2, new ColorDrawable(0));
                this.f112788g.mo195586a().setAnimationStyle(R.style.PopUpWindowEnterExitAnimation);
                ((TextView) a.findViewById(R.id.text)).setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_FeedTenantGuideTip));
            }
            if (findViewByPosition != null && findViewByPosition.getVisibility() == 0) {
                this.f112788g.mo195587a(findViewByPosition, new C57605g.C57606a(8), -UIHelper.dp2px(5.0f), -UIHelper.dp2px(7.5f));
            }
            this.f112788g.mo195586a().setOnDismissListener(new PopupWindow.OnDismissListener() {
                /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.MainTenantSwitcherView.C444511 */

                public void onDismiss() {
                    if (MainTenantSwitcherView.this.f112783b != null) {
                        MainTenantSwitcherView.this.f112783b.mo157886a();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void setViewDelegate(C44464b.AbstractC44467b.AbstractC44468a aVar) {
        this.f112783b = aVar;
    }

    @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44464b.AbstractC44467b
    /* renamed from: a */
    public void mo157859a(boolean z) {
        AbstractC44456a aVar = this.f112782a;
        if (aVar != null) {
            aVar.mo157852a(z);
        }
    }

    @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44464b.AbstractC44467b
    /* renamed from: a */
    public void mo157857a(final C44464b.AbstractC44467b.AbstractC44469b bVar) {
        this.f112787f.mo133319a(this.f112786e, new AbstractC44136a.AbstractC44137a.AbstractC44138a() {
            /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.MainTenantSwitcherView.C444522 */

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44137a.AbstractC44138a
            /* renamed from: a */
            public void mo157125a() {
                C44464b.AbstractC44467b.AbstractC44469b bVar = bVar;
                if (bVar != null) {
                    bVar.mo157890a();
                }
            }
        });
    }

    /* renamed from: d */
    private List<C44487b> m176388d(List<C44487b> list) {
        ArrayList arrayList = new ArrayList();
        for (C44487b bVar : list) {
            arrayList.add(new C44487b(bVar));
        }
        return arrayList;
    }

    /* renamed from: b */
    public void mo157861b(List<C44487b> list) {
        ArrayList arrayList = new ArrayList(m176388d(list));
        arrayList.add(new C44486a());
        this.f112784c.mo157875a(arrayList, 1);
    }

    /* renamed from: c */
    public void mo157862c(List<C44487b> list) {
        ArrayList arrayList = new ArrayList(m176388d(list.subList(0, 2)));
        arrayList.add(new C44489d());
        this.f112784c.mo157875a(arrayList, 0);
    }

    @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44464b.AbstractC44467b
    /* renamed from: a */
    public void mo157855a(int i) {
        if (i == 1) {
            new C25639g(this.f112786e).mo89248g(R.string.Lark_Legacy_SwitchAccountToCNotRegisted).mo89254m(R.string.Lark_Legacy_SwitchAccountToCNotRegistedContent).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmTip, (DialogInterface.OnClickListener) null).mo89239c();
        }
    }

    @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44464b.AbstractC44467b
    /* renamed from: a */
    public void mo157858a(List<C44487b> list) {
        this.f112785d = list;
        if (this.f112784c != null) {
            if (list.size() <= 3) {
                this.f112784c.mo157875a(m176388d(list), 0);
            } else if (this.f112784c.mo157876b() == 0) {
                mo157862c(list);
            } else {
                mo157861b(list);
            }
        }
        m176387c();
    }

    @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.C44464b.AbstractC44467b
    /* renamed from: b */
    public void mo157860b(int i) {
        if (this.f112785d.size() <= 3) {
            this.f112784c.mo157875a(m176388d(this.f112785d), 0);
            this.f112782a.mo157850a();
        } else if (i == 0) {
            this.f112782a.mo157850a();
            mo157862c(this.f112785d);
        } else {
            this.f112782a.mo157853b();
            mo157861b(this.f112785d);
        }
    }

    public MainTenantSwitcherView(Context context, AbstractC44456a aVar) {
        this.f112786e = context;
        this.f112782a = aVar;
        this.f112787f = C44134a.m174959a().mo133251g();
    }
}
