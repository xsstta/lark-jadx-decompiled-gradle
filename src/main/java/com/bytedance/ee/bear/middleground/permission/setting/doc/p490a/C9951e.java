package com.bytedance.ee.bear.middleground.permission.setting.doc.p490a;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.setting.SelectItemView;
import com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.AbstractC9953f;
import com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.C9957g;
import com.bytedance.ee.bear.middleground.permission.util.ToCUtil;
import com.bytedance.ee.bear.middleground.permission.widget.DividerTextView;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.p513o.AbstractC10365a;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.C11824c;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.a.e */
public class C9951e implements AbstractC9953f.AbstractView$OnClickListenerC9955b {

    /* renamed from: s */
    static final /* synthetic */ boolean f26897s;

    /* renamed from: a */
    protected final Context f26898a;

    /* renamed from: b */
    public final Fragment f26899b;

    /* renamed from: c */
    public DocPermSetInfo f26900c;

    /* renamed from: d */
    protected boolean f26901d;

    /* renamed from: e */
    protected final View f26902e;

    /* renamed from: f */
    protected DividerTextView f26903f;

    /* renamed from: g */
    protected View f26904g;

    /* renamed from: h */
    protected UDSwitch f26905h;

    /* renamed from: i */
    protected SelectItemView f26906i;

    /* renamed from: j */
    protected SelectItemView f26907j;

    /* renamed from: k */
    protected SelectItemView f26908k;

    /* renamed from: l */
    protected SelectItemView f26909l;

    /* renamed from: m */
    protected SelectItemView f26910m;

    /* renamed from: n */
    protected SelectItemView f26911n;

    /* renamed from: o */
    protected SelectItemView f26912o;

    /* renamed from: p */
    protected SelectItemView f26913p;

    /* renamed from: q */
    protected SelectItemView f26914q;

    /* renamed from: r */
    protected SelectItemView f26915r;

    /* renamed from: t */
    private final C10917c f26916t;

    /* renamed from: u */
    private AccountService.Account f26917u;

    /* renamed from: v */
    private final String f26918v;

    /* renamed from: w */
    private C9957g f26919w;

    /* renamed from: x */
    private C11824c f26920x;

    /* renamed from: y */
    private DividerTextView f26921y;

    /* renamed from: z */
    private C68289a f26922z = new C68289a();

    public static /* synthetic */ void lambda$TG2BS4U2AFId6atQyrA6kEQlNMw(C9951e eVar, boolean z, Throwable th) {
        eVar.m41418a(z, th);
    }

    public static /* synthetic */ void lambda$eK2n0DXKUVRCfT6DszkR06HZ4vI(C9951e eVar, boolean z, DialogInterface dialogInterface, int i) {
        eVar.m41421b(z, dialogInterface, i);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC9953f.AbstractView$OnClickListenerC9955b.AbstractC9956a aVar) {
    }

    /* renamed from: a */
    public void mo38143a(boolean z, boolean z2) {
        this.f26905h.setChecked(z2);
        int i = 0;
        boolean z3 = (this.f26901d || !z) ? false : f26897s;
        View view = this.f26904g;
        if (!z3) {
            i = 8;
        }
        view.setVisibility(i);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f26922z.dispose();
    }

    /* renamed from: g */
    private void m41423g() {
        ((BaseTitleBar) this.f26902e.findViewById(R.id.top_bar)).setLeftClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.C9951e.C99521 */

            /* renamed from: a */
            static final /* synthetic */ boolean f26923a = C9951e.f26897s;

            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                PermissionAnalyticV2.m39697r();
                if (f26923a || C9951e.this.f26899b.getActivity() != null) {
                    C9951e.this.f26899b.getActivity().finish();
                    return;
                }
                throw new AssertionError();
            }
        });
    }

    /* renamed from: j */
    private String m41426j() {
        AccountService.Account account = this.f26917u;
        if (account == null || TextUtils.isEmpty(account.f14593j)) {
            return "";
        }
        return this.f26917u.f14593j;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        mo38139a();
        mo38144b();
        m41427k();
        PermissionAnalytic.m39400a(this.f26900c, this.f26918v);
        PermissionAnalyticV2.m39668d(false);
    }

    /* renamed from: i */
    private boolean m41425i() {
        boolean f = ((IAdminPermissionProxy) KoinJavaComponent.m268610a(IAdminPermissionProxy.class)).mo36547f(this.f26900c.mo38825b(), this.f26900c.mo38827c());
        if (!this.f26900c.mo38793B() || !f) {
            return false;
        }
        return f26897s;
    }

    /* renamed from: k */
    private void m41427k() {
        this.f26920x = new C11824c(this.f26898a);
        this.f26919w.getState().mo5923a(this.f26899b, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.$$Lambda$e$u3r4SCtP3KVDR1hhMqmMvY4aQFU */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C9951e.this.m41413a((C9951e) ((C9957g.C9959a) obj));
            }
        });
        this.f26919w.getPermSetInfoLiveData().mo5923a(this.f26899b, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.$$Lambda$e$58LxJ7Pd0Y_YVXWR2uqUoRmNwg */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C9951e.m269861lambda$58LxJ7Pd0Y_YVXWR2uqUoRmNwg(C9951e.this, (DocPermSetInfo) obj);
            }
        });
    }

    /* renamed from: d */
    public void mo38147d() {
        this.f26906i = (SelectItemView) this.f26902e.findViewById(R.id.perm_comment_with_read);
        this.f26907j = (SelectItemView) this.f26902e.findViewById(R.id.perm_comment_with_edit);
        this.f26906i.setOnClickListener(this);
        this.f26907j.setOnClickListener(this);
    }

    /* renamed from: e */
    public void mo38148e() {
        this.f26904g = this.f26902e.findViewById(R.id.perm_external_share_layout);
        UDSwitch uDSwitch = (UDSwitch) this.f26902e.findViewById(R.id.perm_external_share_switch);
        this.f26905h = uDSwitch;
        uDSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.$$Lambda$e$wTzth1dEFHoNBxHbteLbNe1cNU */

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C9951e.this.m41412a((C9951e) compoundButton, (CompoundButton) z);
            }
        });
    }

    /* renamed from: f */
    public void mo38149f() {
        C13479a.m54764b("DocumentPermissionSetView", "updateView()...");
        boolean i = m41425i();
        boolean C = this.f26900c.mo38794C();
        boolean D = this.f26900c.mo38795D();
        mo38143a(i, C);
        mo38141a(this.f26900c.mo38837j());
        mo38142a(this.f26900c.mo38837j(), i, C, D);
        mo38145b(this.f26900c.mo38837j());
    }

    /* renamed from: h */
    private void m41424h() {
        boolean z;
        int i;
        C13479a.m54764b("DocumentPermissionSetView", "is consumer:" + this.f26901d);
        SelectItemView selectItemView = (SelectItemView) this.f26902e.findViewById(R.id.perm_share_anyone);
        this.f26908k = selectItemView;
        selectItemView.setText(R.string.CreationMobile_ECM_AllCollaboratorButton);
        this.f26908k.setOnClickListener(this);
        SelectItemView selectItemView2 = (SelectItemView) this.f26902e.findViewById(R.id.perm_share_tenant);
        this.f26909l = selectItemView2;
        selectItemView2.setText(R.string.CreationMobile_ECM_OrganizationButton);
        this.f26909l.setOnClickListener(this);
        this.f26903f = (DividerTextView) this.f26902e.findViewById(R.id.collaborator_setting_divider);
        SelectItemView selectItemView3 = (SelectItemView) this.f26902e.findViewById(R.id.perm_share_tenant_invite_colleague);
        this.f26910m = selectItemView3;
        selectItemView3.setText(C10539a.m43639a(this.f26898a, R.string.Doc_Share_SettingInviteCompanny, "company", m41426j()));
        this.f26910m.setOnClickListener(this);
        SelectItemView selectItemView4 = (SelectItemView) this.f26902e.findViewById(R.id.perm_share_tenant_invite_anyone);
        this.f26911n = selectItemView4;
        selectItemView4.setOnClickListener(this);
        this.f26912o = (SelectItemView) this.f26902e.findViewById(R.id.perm_share_only_me);
        if ((!this.f26900c.mo38844q() || !this.f26900c.ab()) && !this.f26900c.mo38816Y()) {
            z = false;
        } else {
            z = f26897s;
        }
        if (z) {
            i = R.string.CreationMobile_ECM_AllPermissionOnlyDesc;
        } else {
            i = R.string.CreationMobile_ECM_OnlyMeButton;
        }
        this.f26912o.setText(i);
        this.f26912o.setOnClickListener(this);
    }

    /* renamed from: b */
    public void mo38144b() {
        m41423g();
        mo38148e();
        mo38147d();
        m41424h();
        mo38146c();
        if (f26897s || this.f26899b.getActivity() != null) {
            ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40650a(this.f26900c.mo38827c(), String.valueOf(this.f26900c.mo38825b()), this.f26899b.getActivity());
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    public void mo38146c() {
        boolean z;
        int i;
        this.f26921y = (DividerTextView) this.f26902e.findViewById(R.id.perm_security_title);
        this.f26913p = (SelectItemView) this.f26902e.findViewById(R.id.perm_security_read);
        this.f26914q = (SelectItemView) this.f26902e.findViewById(R.id.perm_security_edit);
        this.f26915r = (SelectItemView) this.f26902e.findViewById(R.id.perm_security_fa);
        this.f26913p.setOnClickListener(this);
        this.f26914q.setOnClickListener(this);
        this.f26915r.setOnClickListener(this);
        if (this.f26900c.mo38825b() == C8275a.f22379l.mo32555b()) {
            this.f26921y.setText(R.string.CreationMobile_Minutes_permissions_settings_question);
        } else {
            this.f26921y.setText(R.string.CreationMobile_common_whocan);
        }
        if ((!this.f26900c.mo38844q() || !this.f26900c.ab()) && !this.f26900c.mo38816Y()) {
            z = false;
        } else {
            z = f26897s;
        }
        if (z) {
            i = R.string.CreationMobile_ECM_AllPermissionOnlyDesc;
        } else {
            i = R.string.CreationMobile_ECM_OnlyMeButton;
        }
        this.f26915r.setText(i);
        if (this.f26900c.mo38825b() == C8275a.f22379l.mo32555b()) {
            this.f26914q.mo38107a(f26897s);
            this.f26915r.setVisibility(0);
            return;
        }
        this.f26914q.mo38107a(false);
        this.f26915r.setVisibility(8);
    }

    /* renamed from: a */
    public void mo38139a() {
        boolean z;
        this.f26917u = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        boolean a = ((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22259a();
        if (ToCUtil.f26828a.mo37760b(this.f26917u) || a) {
            z = f26897s;
        } else {
            z = false;
        }
        this.f26901d = z;
        this.f26919w = (C9957g) aj.m5365a(this.f26899b, C9945a.m41403a(this.f26900c)).mo6005a(C9957g.class);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m41414a(DocPermSetInfo docPermSetInfo) {
        this.f26900c = docPermSetInfo;
        mo38149f();
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m41419b(C9957g.C9959a aVar) {
        if (C5203d.m21235a(aVar.f26927b, 10040)) {
            Toast.showFailureText(this.f26898a, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
        } else {
            Toast.showFailureText(this.f26898a.getApplicationContext(), (int) R.string.Doc_Share_ModifyFailed);
        }
    }

    /* renamed from: c */
    private void m41422c(boolean z) {
        String str;
        this.f26919w.updateEnable(z);
        if (z) {
            str = "outside_visit_swtich:open";
        } else {
            str = "outside_visit_swtich:close";
        }
        PermissionAnalytic.m39409a(str, this.f26900c);
        PermissionAnalyticV2.m39673e(z);
    }

    /* renamed from: a */
    private void m41415a(boolean z) {
        this.f26922z.mo237937a(this.f26919w.checkLock(this.f26900c.mo38827c(), this.f26900c.mo38825b(), z).mo238001b(new Consumer(z) {
            /* class com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.$$Lambda$e$FAGGR6SBFofFrjlW3rggrbiIlaQ */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9951e.lambda$FAGGR6SBFofFrjlW3rggrbiIlaQ(C9951e.this, this.f$1, (Boolean) obj);
            }
        }, new Consumer(z) {
            /* class com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.$$Lambda$e$TG2BS4U2AFId6atQyrA6kEQlNMw */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9951e.lambda$TG2BS4U2AFId6atQyrA6kEQlNMw(C9951e.this, this.f$1, (Throwable) obj);
            }
        }));
    }

    /* renamed from: b */
    public void mo38145b(IDocPublicPermission iDocPublicPermission) {
        this.f26913p.setSelected(iDocPublicPermission.isSecurityWithRead());
        this.f26914q.setSelected(iDocPublicPermission.isSecurityWithEdit());
        this.f26915r.setSelected(iDocPublicPermission.isSecurityWithFA());
    }

    /* renamed from: a */
    private /* synthetic */ void m41413a(C9957g.C9959a aVar) {
        C13479a.m54764b("DocumentPermissionSetView", "new state = " + aVar);
        if (aVar == null) {
            return;
        }
        if (aVar.f26926a == 1) {
            this.f26920x.m49046e();
        } else if (aVar.f26926a == 4) {
            this.f26920x.mo45303c();
        } else if (aVar.f26926a == 3) {
            this.f26920x.mo45303c();
            if (this.f26905h.getTag() instanceof Boolean) {
                UDSwitch uDSwitch = this.f26905h;
                uDSwitch.setChecked(((Boolean) uDSwitch.getTag()).booleanValue());
            }
            ((AbstractC10365a) KoinJavaComponent.m268610a(AbstractC10365a.class)).mo39500a(this.f26898a.getApplicationContext(), aVar.f26927b, new Runnable(aVar) {
                /* class com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.$$Lambda$e$03E7snPuYHs1vvDa2DPvilCag3M */
                public final /* synthetic */ C9957g.C9959a f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C9951e.lambda$03E7snPuYHs1vvDa2DPvilCag3M(C9951e.this, this.f$1);
                }
            });
        }
    }

    /* renamed from: b */
    private void m41420b(boolean z) {
        int i;
        if (this.f26900c.mo38844q()) {
            i = R.string.CreationMobile_Wiki_Permission_SettingsDivision_Placeholder;
        } else {
            i = R.string.CreationMobile_ECM_PermissionChangedDesc;
        }
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40651a(this.f26900c.mo38827c(), String.valueOf(this.f26900c.mo38825b()), new BearUDDialogBuilder(this.f26898a).mo45344a(R.string.CreationMobile_Wiki_Permission_ChangePermission_Title).mo45362d(i).mo45360c(8388611).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_Confirm, new DialogInterface.OnClickListener(z) {
            /* class com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.$$Lambda$e$eK2n0DXKUVRCfT6DszkR06HZ4vI */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C9951e.lambda$eK2n0DXKUVRCfT6DszkR06HZ4vI(C9951e.this, this.f$1, dialogInterface, i);
            }
        }).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, new DialogInterface.OnClickListener(z) {
            /* class com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.$$Lambda$e$7R6rsX4pYuI_LPoB2HAqKNB84e4 */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C9951e.lambda$7R6rsX4pYuI_LPoB2HAqKNB84e4(C9951e.this, this.f$1, dialogInterface, i);
            }
        }).mo45359b());
        PermissionAnalyticV2.m39643b("external_switch");
    }

    public void onClick(View view) {
        if (!view.isSelected()) {
            String str = "public_permission_use_file:editable_user";
            int i = 2;
            if (view.getId() == R.id.perm_comment_with_read) {
                PermissionAnalyticV2.m39594a(0);
                str = "public_permission_comment:readable_user";
            } else if (view.getId() == R.id.perm_comment_with_edit) {
                i = 3;
                PermissionAnalyticV2.m39594a(1);
                str = "public_permission_comment:editable_user";
            } else if (view.getId() == R.id.perm_share_anyone) {
                PermissionAnalyticV2.m39640b(2, this.f26900c.mo38795D());
                str = "public_permission_share:all_readable_user";
                i = 4;
            } else if (view.getId() == R.id.perm_share_tenant) {
                i = 5;
                PermissionAnalyticV2.m39640b(1, this.f26900c.mo38795D());
                str = "public_permission_share:readable_user";
            } else if (view.getId() == R.id.perm_share_tenant_invite_colleague) {
                i = 6;
                PermissionAnalyticV2.m39640b(1, false);
                str = "public_permission_share:invite_only_inside";
            } else if (view.getId() == R.id.perm_share_tenant_invite_anyone) {
                i = 7;
                PermissionAnalyticV2.m39640b(1, (boolean) f26897s);
                str = "public_permission_share:invite_anyone";
            } else if (view.getId() == R.id.perm_share_only_me) {
                i = 8;
                PermissionAnalyticV2.m39640b(0, this.f26900c.mo38795D());
                str = "public_permission_share:private";
            } else if (view.getId() == R.id.perm_security_read) {
                i = 9;
                PermissionAnalyticV2.m39639b(0);
                str = "public_permission_use_file:readable_user";
            } else if (view.getId() == R.id.perm_security_edit) {
                i = 10;
                PermissionAnalyticV2.m39639b(1);
            } else if (view.getId() == R.id.perm_security_fa) {
                PermissionAnalyticV2.m39639b(2);
                i = 11;
            } else {
                str = "";
                i = -1;
            }
            C13479a.m54764b("DocumentPermissionSetView", "onClick(): actionType = " + str);
            if (!TextUtils.isEmpty(str)) {
                PermissionAnalytic.m39409a(str, this.f26900c);
            }
            if (i != -1) {
                this.f26919w.updatePermission(i);
            }
        }
    }

    /* renamed from: a */
    public void mo38141a(IDocPublicPermission iDocPublicPermission) {
        this.f26906i.setSelected(iDocPublicPermission.isCommentWithRead());
        this.f26907j.setSelected(iDocPublicPermission.isCommentWithEdit());
    }

    /* renamed from: a */
    private /* synthetic */ void m41412a(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            compoundButton.setTag(Boolean.valueOf(z ^ f26897s));
            m41415a(z);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m41417a(boolean z, Boolean bool) {
        if (bool.booleanValue()) {
            m41420b(z);
        } else {
            m41422c(z);
        }
    }

    /* renamed from: a */
    private /* synthetic */ void m41418a(boolean z, Throwable th) {
        C13479a.m54759a("DocumentPermissionSetView", "checkLock()...error", th);
        m41422c(z);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m41416a(boolean z, DialogInterface dialogInterface, int i) {
        this.f26905h.setChecked(z ^ f26897s);
        PermissionAnalyticV2.m39626a("external_switch", false);
    }

    /* renamed from: b */
    private /* synthetic */ void m41421b(boolean z, DialogInterface dialogInterface, int i) {
        m41422c(z);
        PermissionAnalyticV2.m39626a("external_switch", (boolean) f26897s);
    }

    /* renamed from: a */
    public void mo38142a(IDocPublicPermission iDocPublicPermission, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        int i;
        this.f26908k.setSelected(iDocPublicPermission.isShareAnyone());
        this.f26912o.setSelected(iDocPublicPermission.isShareOnlyMe());
        int i2 = 8;
        if (this.f26901d) {
            this.f26909l.setVisibility(8);
            this.f26910m.setVisibility(8);
            this.f26911n.setVisibility(8);
            return;
        }
        boolean isShareInternal = iDocPublicPermission.isShareInternal();
        boolean z6 = f26897s;
        if (!isShareInternal || !z || !z2) {
            z4 = false;
        } else {
            z4 = f26897s;
        }
        this.f26909l.setSelected(isShareInternal);
        SelectItemView selectItemView = this.f26910m;
        if (!isShareInternal || z3) {
            z5 = false;
        } else {
            z5 = f26897s;
        }
        selectItemView.setSelected(z5);
        SelectItemView selectItemView2 = this.f26911n;
        if (!isShareInternal || !z3) {
            z6 = false;
        }
        selectItemView2.setSelected(z6);
        SelectItemView selectItemView3 = this.f26911n;
        if (z4) {
            i = 0;
        } else {
            i = 8;
        }
        selectItemView3.setVisibility(i);
        SelectItemView selectItemView4 = this.f26910m;
        if (z4) {
            i2 = 0;
        }
        selectItemView4.setVisibility(i2);
    }

    public C9951e(Context context, Fragment fragment, C10917c cVar, DocPermSetInfo docPermSetInfo, String str, View view) {
        this.f26898a = context;
        this.f26899b = fragment;
        this.f26916t = cVar;
        this.f26900c = docPermSetInfo;
        this.f26918v = str;
        this.f26902e = view;
    }
}
