package com.ss.android.lark.invitation.v2.feat.external.main;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.inv.export.util.C40133s;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.inv.export.util.InvErrorView;
import com.ss.android.lark.invitation.v2.feat.external.bean.C40219a;
import com.ss.android.lark.invitation.v2.feat.external.common.InviteExternalViewDependency;
import com.ss.android.lark.invitation.v2.feat.external.main.AbstractC40268a;
import com.ss.android.lark.invitation.v2.feat.external.main.p2058a.C40274b;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.p2964a.C58973b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.invitation.v2.feat.external.main.f */
public class C40281f implements AbstractC40268a.AbstractC40271b {

    /* renamed from: a */
    public CommonTitleBar f102348a;

    /* renamed from: b */
    public InviteExternalShareCardView f102349b;

    /* renamed from: c */
    private final String f102350c;

    /* renamed from: d */
    private final boolean f102351d;

    /* renamed from: e */
    private final InviteExternalViewDependency f102352e;

    /* renamed from: f */
    private AbstractC40268a.AbstractC40271b.AbstractC40272a f102353f;

    /* renamed from: g */
    private RelativeLayout f102354g;

    /* renamed from: h */
    private RelativeLayout f102355h;

    /* renamed from: i */
    private TextView f102356i;

    /* renamed from: j */
    private ScrollView f102357j;

    /* renamed from: k */
    private RecyclerView f102358k;

    /* renamed from: l */
    private InvErrorView f102359l;

    /* renamed from: m */
    private LinearLayout f102360m;

    /* renamed from: n */
    private View.OnClickListener f102361n;

    /* renamed from: o */
    private String f102362o;

    /* renamed from: p */
    private LKUIStatus f102363p;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.main.AbstractC40268a.AbstractC40271b
    /* renamed from: a */
    public Activity mo146070a() {
        return this.f102352e.mo145900a();
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.main.AbstractC40268a.AbstractC40271b
    /* renamed from: c */
    public void mo146075c() {
        C40133s.m159126b(this.f102363p);
    }

    /* renamed from: e */
    private void m159648e() {
        InvHitPoint.m160374c(this.f102351d, this.f102350c);
        C40147z.m159160a().getContactDependency().mo145577a(this.f102352e.mo145900a());
    }

    /* renamed from: f */
    private void m159650f() {
        if (DesktopUtil.m144307b()) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f102355h.getLayoutParams();
            layoutParams.height = UIHelper.dp2px(48.0f);
            this.f102355h.setLayoutParams(layoutParams);
            this.f102348a.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
            DesktopUtil.m144299a((TextView) this.f102352e.mo145901a(R.id.ieSearchTv));
        }
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.main.AbstractC40268a.AbstractC40271b
    /* renamed from: b */
    public void mo146074b() {
        if (this.f102363p == null) {
            this.f102363p = C40133s.m159123a(mo146070a());
        }
        C40133s.m159125a(this.f102363p);
    }

    /* renamed from: d */
    private List<C40274b> m159646d() {
        ArrayList arrayList = new ArrayList();
        if (C40147z.m159160a().isFgEnable("lark.chat.f2f_chat")) {
            arrayList.add(new C40274b(R.drawable.ud_icon_nearby_group_outlined, R.color.ud_G500, UIHelper.getString(R.string.Lark_NewContacts_AddExternalContacts_FacetoFace), new View.OnClickListener() {
                /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$f$fS7UKyzNSSR2MQY_8gy8AzyKWKI */

                public final void onClick(View view) {
                    C40281f.lambda$fS7UKyzNSSR2MQY_8gy8AzyKWKI(C40281f.this, view);
                }
            }));
        }
        if (!C40147z.m159165e()) {
            arrayList.add(new C40274b(R.drawable.ud_icon_qr_outlined, R.color.ud_O500, UIHelper.getString(R.string.Lark_Legacy_LarkScan), new View.OnClickListener() {
                /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$f$aDCEIBc3pUg96O5iwdKqnBnuVew */

                public final void onClick(View view) {
                    C40281f.lambda$aDCEIBc3pUg96O5iwdKqnBnuVew(C40281f.this, view);
                }
            }));
        }
        arrayList.add(new C40274b(R.drawable.ud_icon_qr_outlined, R.color.ud_O500, UIHelper.getString(R.string.Lark_Contacts_MobileContacts), new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$f$sabnsILh6QklNfha0rwWFIwQEI8 */

            public final void onClick(View view) {
                C40281f.lambda$sabnsILh6QklNfha0rwWFIwQEI8(C40281f.this, view);
            }
        }));
        return arrayList;
    }

    /* renamed from: g */
    private void m159652g() {
        this.f102354g = (RelativeLayout) this.f102352e.mo145901a(R.id.ieRootRl);
        this.f102348a = (CommonTitleBar) this.f102352e.mo145901a(R.id.ieTitleBar);
        this.f102355h = (RelativeLayout) this.f102352e.mo145901a(R.id.ieSearchRl);
        this.f102356i = (TextView) this.f102352e.mo145901a(R.id.ieSearchTv);
        this.f102357j = (ScrollView) this.f102352e.mo145901a(R.id.ieContentSv);
        this.f102349b = (InviteExternalShareCardView) this.f102352e.mo145901a(R.id.ieShareCardPanel);
        this.f102358k = (RecyclerView) this.f102352e.mo145901a(R.id.ieRv);
        this.f102359l = (InvErrorView) this.f102352e.mo145901a(R.id.ieErrorView);
        this.f102360m = (LinearLayout) this.f102352e.mo145901a(R.id.ieDisableLl);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m159652g();
        m159650f();
        this.f102354g.setBackgroundColor(C57582a.m223616d(mo146070a(), R.color.bg_base));
        this.f102348a.setTitle(R.string.Lark_Legacy_MyQrCode);
        this.f102355h.setVisibility(8);
        this.f102358k.setVisibility(8);
        this.f102362o = "qr_code";
        this.f102348a.setBackgroundColor(0);
        InvHitPoint.ae(this.f102350c);
        this.f102348a.addAction(new C40283a(this.f102351d) {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.C40281f.C402821 */

            @Override // com.ss.android.lark.invitation.v2.feat.external.main.C40281f.C40283a, com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                super.performAction(view);
                C40281f.this.f102349b.mo146055c();
                String type = C40281f.this.f102349b.getType();
                if ("qr_code".equals(type)) {
                    C40281f.this.f102348a.setTitle(R.string.Lark_Legacy_MyQrCode);
                } else if ("link".equals(type)) {
                    C40281f.this.f102348a.setTitle(R.string.Lark_Contact_ShareMyLink_Title);
                }
            }
        });
        this.f102348a.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$f$M4sCIVRLYlI__7b91v8I9wVBY */

            public final void onClick(View view) {
                C40281f.m270648lambda$M4sCIVRLYlI__7b91v8I9wVBY(C40281f.this, view);
            }
        });
        this.f102357j.setVisibility(8);
        this.f102356i.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$f$zuDOUvRWXJS0vUCfpeozp3ZR6Zw */

            public final void onClick(View view) {
                C40281f.lambda$zuDOUvRWXJS0vUCfpeozp3ZR6Zw(C40281f.this, view);
            }
        });
        this.f102360m.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$f$4ruzInUXl_WMYAtSpz_yuTnX7Q0 */

            public final void onClick(View view) {
                C40281f.lambda$4ruzInUXl_WMYAtSpz_yuTnX7Q0(C40281f.this, view);
            }
        });
        C58973b bVar = new C58973b();
        bVar.mo200080a(m159646d());
        this.f102358k.setAdapter(bVar);
        this.f102358k.setLayoutManager(new LinearLayoutManager(mo146070a()));
    }

    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m159649e(View view) {
        m159648e();
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC40268a.AbstractC40271b.AbstractC40272a aVar) {
        this.f102353f = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m159647d(View view) {
        this.f102353f.mo146076a();
    }

    /* access modifiers changed from: public */
    /* renamed from: f */
    private /* synthetic */ void m159651f(View view) {
        this.f102353f.mo146078c();
    }

    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ void m159653g(View view) {
        this.f102352e.mo145902b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.main.f$a */
    public static class C40283a extends IActionTitlebar.C57573a {

        /* renamed from: a */
        private boolean f102365a;

        /* renamed from: a */
        private static int m159661a(boolean z) {
            return z ? R.drawable.ud_icon_link_copy_outlined : R.drawable.ud_icon_qr_outlined;
        }

        C40283a(boolean z) {
            super(m159661a(z), R.color.icon_n1);
            this.f102365a = z;
        }

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            boolean z = !this.f102365a;
            this.f102365a = z;
            mo195538a(m159661a(z));
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m159643b(View view) {
        this.f102353f.mo146077b();
        InvHitPoint.m160347Z(this.f102350c);
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m159645c(View view) {
        C57805b.m224331b(mo146070a(), new C57805b.AbstractC57809a() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$f$MFtzAiaFthc_w6xjimQy0IbCTc */

            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
            public final void permissionGranted(boolean z) {
                C40281f.m270650lambda$MFtzAiaFthc_w6xjimQy0IbCTc(C40281f.this, z);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m159642a(View view) {
        mo146074b();
        this.f102357j.setVisibility(8);
        this.f102359l.mo145640b();
        this.f102353f.mo146079d();
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m159644b(boolean z) {
        if (z) {
            InvHitPoint.m160343V(this.f102350c);
            C40147z.m159160a().startScanQRCodeActivity(mo146070a());
            InvHitPoint.ad(this.f102350c);
        }
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.main.AbstractC40268a.AbstractC40271b
    /* renamed from: a */
    public void mo146071a(C40219a aVar) {
        this.f102359l.mo145640b();
        mo146073a(!aVar.mo145909a(this.f102362o).canSearchWithToken);
        this.f102357j.setVisibility(0);
        this.f102349b.setShowShareTextView((TextView) this.f102352e.mo145901a(R.id.scvShowShareTv));
        this.f102349b.setShowSaveOrCopyLinkTextView((TextView) this.f102352e.mo145901a(R.id.scvShowSaveOrCopyLinkTv));
        this.f102349b.mo146053a(this.f102362o, aVar);
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.main.AbstractC40268a.AbstractC40271b
    /* renamed from: a */
    public void mo146072a(String str) {
        this.f102359l.mo145639a(str);
        this.f102357j.setVisibility(8);
        if (this.f102361n == null) {
            $$Lambda$f$JI8QGZJba58JekUHzgr0pbYxH4 r2 = new View.OnClickListener() {
                /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$f$JI8QGZJba58JekUHzgr0pbYxH4 */

                public final void onClick(View view) {
                    C40281f.m270649lambda$JI8QGZJba58JekUHzgr0pbYxH4(C40281f.this, view);
                }
            };
            this.f102361n = r2;
            this.f102359l.setOnClickListener(r2);
        }
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.main.AbstractC40268a.AbstractC40271b
    /* renamed from: a */
    public void mo146073a(boolean z) {
        int i;
        LinearLayout linearLayout = this.f102360m;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
        InvHitPoint.m160361a(z, this.f102350c);
    }

    public C40281f(InviteExternalViewDependency eVar, String str, boolean z) {
        this.f102352e = eVar;
        this.f102350c = str;
        this.f102351d = z;
    }
}
