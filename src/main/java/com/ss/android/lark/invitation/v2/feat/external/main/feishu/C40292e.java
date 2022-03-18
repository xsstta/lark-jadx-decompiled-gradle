package com.ss.android.lark.invitation.v2.feat.external.main.feishu;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.inv.export.util.C40132r;
import com.ss.android.lark.inv.export.util.C40133s;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.external.common.InviteExternalViewDependency;
import com.ss.android.lark.invitation.v2.feat.external.main.InviteExternalActivity;
import com.ss.android.lark.invitation.v2.feat.external.main.feishu.AbstractC40284a;
import com.ss.android.lark.invitation.v2.feat.external.main.p2058a.C40274b;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.widget.recyclerview.p2964a.C58973b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.invitation.v2.feat.external.main.feishu.e */
public class C40292e implements AbstractC40284a.AbstractC40286b {

    /* renamed from: a */
    public LKUIStatus f102374a;

    /* renamed from: b */
    private final String f102375b;

    /* renamed from: c */
    private final InviteExternalViewDependency f102376c;

    /* renamed from: d */
    private AbstractC40284a.AbstractC40286b.AbstractC40287a f102377d;

    /* renamed from: e */
    private RelativeLayout f102378e;

    /* renamed from: f */
    private CommonTitleBar f102379f;

    /* renamed from: g */
    private ViewGroup f102380g;

    /* renamed from: h */
    private TextView f102381h;

    /* renamed from: i */
    private ViewGroup f102382i;

    /* renamed from: j */
    private RecyclerView f102383j;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.main.feishu.AbstractC40284a.AbstractC40286b
    /* renamed from: a */
    public Activity mo146104a() {
        return this.f102376c.mo145900a();
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.main.feishu.AbstractC40284a.AbstractC40286b
    /* renamed from: c */
    public void mo146106c() {
        ViewUtils.m224149a(new Runnable() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.feishu.C40292e.RunnableC402931 */

            public void run() {
                C40292e.this.mo146107d();
                C40133s.m159126b(C40292e.this.f102374a);
            }
        }, 600);
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.main.feishu.AbstractC40284a.AbstractC40286b
    /* renamed from: d */
    public void mo146107d() {
        RelativeLayout relativeLayout = this.f102378e;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.main.feishu.AbstractC40284a.AbstractC40286b
    /* renamed from: b */
    public void mo146105b() {
        if (this.f102374a == null) {
            this.f102374a = C40133s.m159123a(mo146104a());
        }
        C40133s.m159125a(this.f102374a);
    }

    /* renamed from: e */
    private List<C40274b> m159696e() {
        ArrayList arrayList = new ArrayList();
        if (C40147z.m159160a().isFgEnable("lark.chat.f2f_chat")) {
            arrayList.add(new C40274b(R.drawable.ud_icon_nearby_group_outlined, R.color.ud_G500, UIHelper.getString(R.string.Lark_NewContacts_AddExternalContacts_FacetoFace), new View.OnClickListener() {
                /* class com.ss.android.lark.invitation.v2.feat.external.main.feishu.$$Lambda$e$9yoXGhtjM8zVRCRi6GQ2KYJYbxE */

                public final void onClick(View view) {
                    C40292e.lambda$9yoXGhtjM8zVRCRi6GQ2KYJYbxE(C40292e.this, view);
                }
            }));
        }
        if (!C40147z.m159165e()) {
            arrayList.add(new C40274b(R.drawable.ud_icon_qr_outlined, R.color.ud_O500, UIHelper.getString(R.string.Lark_Legacy_LarkScan), new View.OnClickListener() {
                /* class com.ss.android.lark.invitation.v2.feat.external.main.feishu.$$Lambda$e$qmkKcxb7flWdmK99oxw2Etuu2U */

                public final void onClick(View view) {
                    C40292e.m270651lambda$qmkKcxb7flWdmK99oxw2Etuu2U(C40292e.this, view);
                }
            }));
        }
        arrayList.add(new C40274b(R.drawable.ud_icon_phone_outlined, R.color.ud_P600, UIHelper.getString(R.string.Lark_Contacts_MobileContacts), new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.feishu.$$Lambda$e$RWIQ8jspnLYo10Z0JW_8LXufaNs */

            public final void onClick(View view) {
                C40292e.lambda$RWIQ8jspnLYo10Z0JW_8LXufaNs(C40292e.this, view);
            }
        }));
        return arrayList;
    }

    /* renamed from: f */
    private void m159698f() {
        this.f102378e = (RelativeLayout) this.f102376c.mo145901a(R.id.iefRootRl);
        this.f102379f = (CommonTitleBar) this.f102376c.mo145901a(R.id.iefTitleBar);
        this.f102380g = (ViewGroup) this.f102376c.mo145901a(R.id.iefSearchLl);
        this.f102381h = (TextView) this.f102376c.mo145901a(R.id.iefSearchTv);
        this.f102382i = (ViewGroup) this.f102376c.mo145901a(R.id.iefMyQrcodeRl);
        this.f102383j = (RecyclerView) this.f102376c.mo145901a(R.id.iefRv);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        int i;
        m159698f();
        this.f102378e.setVisibility(8);
        this.f102379f.setTitle(C40147z.m159163c().getInviteExternalPageTitle());
        Activity a = mo146104a();
        if (DesktopUtil.m144307b()) {
            i = R.drawable.inv_title_bar_right_icon_desktop_selector;
        } else {
            i = R.drawable.ud_icon_maybe_outlined;
        }
        Drawable c = C57582a.m223614c(a, i);
        c.mutate().setTint(C57582a.m223616d(mo146104a(), R.color.icon_n1));
        this.f102379f.setRightImage(c);
        this.f102379f.getRightView(0).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.feishu.$$Lambda$e$7ECL7jMqJrlVYePwlXs7Od1LhjM */

            public final void onClick(View view) {
                C40292e.lambda$7ECL7jMqJrlVYePwlXs7Od1LhjM(C40292e.this, view);
            }
        });
        this.f102379f.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.feishu.$$Lambda$e$UrfsojtSibrzJgB9abox43K4KXQ */

            public final void onClick(View view) {
                C40292e.lambda$UrfsojtSibrzJgB9abox43K4KXQ(C40292e.this, view);
            }
        });
        this.f102382i.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.feishu.$$Lambda$e$cYERo4CHGLm9EVErAAkbI93H9s0 */

            public final void onClick(View view) {
                C40292e.lambda$cYERo4CHGLm9EVErAAkbI93H9s0(C40292e.this, view);
            }
        });
        this.f102381h.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.feishu.$$Lambda$e$WtNmxK1IWnjZ8jp3WKZB704dXfo */

            public final void onClick(View view) {
                C40292e.lambda$WtNmxK1IWnjZ8jp3WKZB704dXfo(C40292e.this, view);
            }
        });
        C58973b bVar = new C58973b();
        bVar.mo200080a(m159696e());
        this.f102383j.setAdapter(bVar);
        this.f102383j.setLayoutManager(new LinearLayoutManager(mo146104a()));
        InvHitPoint.m160361a(false, this.f102375b);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC40284a.AbstractC40286b.AbstractC40287a aVar) {
        this.f102377d = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m159694c(View view) {
        this.f102377d.mo146108a();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m159695d(View view) {
        this.f102377d.mo146110c();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m159699f(View view) {
        this.f102376c.mo145902b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m159691a(View view) {
        this.f102377d.mo146109b();
        InvHitPoint.m160347Z(this.f102375b);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m159693b(View view) {
        C57805b.m224331b(mo146104a(), new C57805b.AbstractC57809a() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.feishu.$$Lambda$e$FRbahFqakcJ2kdlNaYn9nRiHVQI */

            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
            public final void permissionGranted(boolean z) {
                C40292e.lambda$FRbahFqakcJ2kdlNaYn9nRiHVQI(C40292e.this, z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m159697e(View view) {
        InviteExternalActivity.m159555a(mo146104a(), this.f102375b, true);
        InvHitPoint.ac(this.f102375b);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m159700g(View view) {
        C40132r.m159117a();
        InvHitPoint.m160334M(this.f102375b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m159692a(boolean z) {
        if (z) {
            InvHitPoint.m160343V(this.f102375b);
            C40147z.m159160a().startScanQRCodeActivity(mo146104a());
            InvHitPoint.ad(this.f102375b);
        }
    }

    public C40292e(InviteExternalViewDependency eVar, String str) {
        this.f102376c = eVar;
        this.f102375b = str;
    }
}
