package com.bytedance.ee.bear.middleground.permission.setting.linkshare;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.permission.PermFGUtils;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10034i;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10031g;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10037k;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10056f;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.IUpdatePasswordStateToPermSetInfo;
import com.bytedance.ee.bear.middleground.permission.setting.permselect.SelectPermTypeFragment;
import com.bytedance.ee.bear.middleground.permission.setting.permselect.SelectPermTypeViewModel;
import com.bytedance.ee.bear.middleground.permission.util.ToCUtil;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.C11824c;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.g */
public class C10031g extends BasePresenter<AbstractC10033h, AbstractC10034i, AbstractC10034i.AbstractC10035a> implements AbstractC10034i.AbstractC10035a, C10037k.AbstractC10038a {

    /* renamed from: a */
    public Context f27120a;

    /* renamed from: b */
    public DocPermSetInfo f27121b;

    /* renamed from: c */
    public C11824c f27122c;

    /* renamed from: d */
    public C10056f f27123d;

    /* renamed from: e */
    private Fragment f27124e;

    /* renamed from: f */
    private String f27125f;

    /* renamed from: g */
    private boolean f27126g = true;

    /* renamed from: h */
    private boolean f27127h;

    /* renamed from: i */
    private AccountService.Account f27128i;

    /* renamed from: j */
    private boolean f27129j;

    /* renamed from: k */
    private LinkShareItem f27130k;

    /* renamed from: l */
    private C68289a f27131l = new C68289a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC10034i.AbstractC10035a createViewDelegate() {
        return this;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10037k.AbstractC10038a
    /* renamed from: a */
    public void mo38346a(boolean z, View view) {
        if (this.f27123d == null) {
            this.f27123d = C10056f.m41841a(view, this.f27121b.mo38818a(), this.f27121b.mo38827c(), this.f27121b.mo38825b(), this.f27121b.mo38830e(), this.f27121b.mo38801J(), this.f27121b.mo38802K(), this.f27129j, this.f27125f, new IUpdatePasswordStateToPermSetInfo() {
                /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.$$Lambda$g$ND6BDz4a9_sn3ZXa98nl0zNGXmU */

                @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.IUpdatePasswordStateToPermSetInfo
                public final void onPasswordStateUpdate(boolean z, String str) {
                    C10031g.this.m41746a((C10031g) z, (boolean) str);
                }
            }, false);
        }
        this.f27123d.mo38406a(z);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f27131l.dispose();
        this.f27123d = null;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m41747b();
        SelectPermTypeViewModel bVar = (SelectPermTypeViewModel) aj.m5366a(this.f27124e.getActivity()).mo6005a(SelectPermTypeViewModel.class);
        bVar.getDismissLiveData().mo5923a(this.f27124e, new AbstractC1178x(bVar) {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.$$Lambda$g$UusEjigMU4JKPwI5wVyojvfeBM4 */
            public final /* synthetic */ SelectPermTypeViewModel f$1;

            {
                this.f$1 = r2;
            }

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C10031g.this.m41739a((C10031g) this.f$1, (SelectPermTypeViewModel) ((Boolean) obj));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.g$a */
    public static class C10032a implements AbstractC10169g {

        /* renamed from: a */
        private WeakReference<C10031g> f27132a;

        /* renamed from: b */
        private int f27133b;

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17110a() {
            if (this.f27132a.get() == null) {
                C13479a.m54764b("DocumentLinkShareSettingPresenter", "onRequestStart()...presenterRef is null");
                return;
            }
            C10031g gVar = this.f27132a.get();
            if (gVar.f27122c == null) {
                gVar.f27122c = new C11824c(gVar.f27120a);
            }
            gVar.f27122c.mo45304d();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static /* synthetic */ void m41755b(Throwable th) throws Exception {
            C13479a.m54758a("DocumentLinkShareSettingPresenter", "fetchDocPublicPermission()...fail, error = " + th);
        }

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17111a(int i) {
            if (this.f27132a.get() == null) {
                C13479a.m54764b("DocumentLinkShareSettingPresenter", "onRequestSuccess()...presenterRef is null, permission = " + i);
                return;
            }
            C10031g gVar = this.f27132a.get();
            if (gVar.f27122c != null) {
                gVar.f27122c.mo45303c();
            }
            ((AbstractC10033h) gVar.getModel()).mo38337a(gVar.f27121b.mo38827c(), gVar.f27121b.mo38825b()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(gVar) {
                /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.$$Lambda$g$a$og3izGiQ6EYwalXI8xko1EklrOs */
                public final /* synthetic */ C10031g f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C10031g.C10032a.this.m41754a(this.f$1, (IDocPublicPermission) obj);
                }
            }, $$Lambda$g$a$nPCUsZkD7IA_ogRQUkj1b_u_LEA.INSTANCE);
        }

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17112a(Throwable th) {
            if (this.f27132a.get() == null) {
                C13479a.m54758a("DocumentLinkShareSettingPresenter", "onRequestFail()...presenterRef is null, error = " + th);
                return;
            }
            C13479a.m54758a("DocumentLinkShareSettingPresenter", "onRequestFail()...throwable = " + th);
            C10031g gVar = this.f27132a.get();
            if (gVar.f27122c != null) {
                gVar.f27122c.mo45303c();
            }
            if (C5203d.m21235a(th, 10040)) {
                Toast.showFailureText(gVar.f27120a, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
            } else if (C5203d.m21235a(th, 10011)) {
                Toast.showFailureText(gVar.f27120a, (int) R.string.CreationMobile_Wiki_SharePanel_InheritSettings);
            } else {
                Toast.showFailureText(gVar.f27120a, gVar.f27120a.getString(R.string.Doc_Facade_SaveFailed), 0);
            }
        }

        C10032a(C10031g gVar, int i) {
            this.f27132a = new WeakReference<>(gVar);
            this.f27133b = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m41754a(C10031g gVar, IDocPublicPermission iDocPublicPermission) throws Exception {
            gVar.f27121b.mo38819a(iDocPublicPermission);
            ((AbstractC10034i) gVar.getView()).mo38332a(this.f27133b);
            if (gVar.f27123d != null) {
                gVar.f27123d.mo38407a(iDocPublicPermission.hasLinkPassword(), iDocPublicPermission.linkPassword());
            }
            PermissionAnalyticV2.m39607a(iDocPublicPermission.getReportJson());
        }
    }

    /* renamed from: b */
    private void m41747b() {
        boolean z;
        this.f27127h = C4511g.m18594d().mo17345F();
        this.f27128i = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        if (ToCUtil.f26828a.mo37760b(this.f27128i) || ((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22259a()) {
            z = true;
        } else {
            z = false;
        }
        this.f27129j = z;
        ((AbstractC10034i) getView()).mo38334a(this);
        m41749c();
    }

    /* renamed from: c */
    private void m41749c() {
        boolean z;
        if (this.f27121b.mo38837j().isLinkShareClose() || this.f27121b.mo38837j().isLinkShareInternalRead() || this.f27121b.mo38837j().isLinkShareInternalEdit()) {
            z = true;
        } else {
            z = false;
        }
        this.f27126g = z;
        C13479a.m54764b("DocumentLinkShareSettingPresenter", "mShowRemind = " + this.f27126g);
    }

    /* renamed from: a */
    private void m41740a(LinkShareItem linkShareItem) {
        int i;
        if (this.f27121b.mo38844q()) {
            i = R.string.CreationMobile_Wiki_Permission_SettingsDivision_Placeholder;
        } else {
            i = R.string.CreationMobile_ECM_PermissionChangedDesc;
        }
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40651a(this.f27121b.mo38827c(), String.valueOf(this.f27121b.mo38825b()), new BearUDDialogBuilder(this.f27120a).mo45344a(R.string.CreationMobile_Wiki_Permission_ChangePermission_Title).mo45362d(i).mo45360c(8388611).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_Confirm, new DialogInterface.OnClickListener(linkShareItem) {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.$$Lambda$g$oVBx68qG58mAHJFRl2QczarHyJI */
            public final /* synthetic */ LinkShareItem f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C10031g.this.m41741a((C10031g) this.f$1, (LinkShareItem) dialogInterface, (DialogInterface) i);
            }
        }).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, $$Lambda$g$DPpD5pB1Giyugz6ExWbWE2Hvn_0.INSTANCE).mo45359b());
        PermissionAnalyticV2.m39643b("reduce_sharelink");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m41739a(SelectPermTypeViewModel bVar, Boolean bool) {
        if (bool.booleanValue() && this.f27130k != null) {
            int permTypeValue = bVar.getPermTypeValue();
            if (permTypeValue == 1 || permTypeValue == 2) {
                m41750c(this.f27130k, permTypeValue);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m41742a(LinkShareItem linkShareItem, Boolean bool) throws Exception {
        if (this.f27121b.mo38844q() && this.f27121b.ab() && PermFGUtils.m39534c() && this.f27121b.mo38797F()) {
            this.f27130k = linkShareItem;
            SelectPermTypeFragment.m41375a(this.f27124e.requireActivity(), bool.booleanValue(), "link_share");
        } else if (bool.booleanValue()) {
            m41740a(linkShareItem);
        } else {
            m41750c(linkShareItem, 1);
        }
    }

    /* renamed from: b */
    private void m41748b(LinkShareItem linkShareItem, int i) {
        this.f27131l.mo237937a(((AbstractC10033h) getModel()).mo38338a(this.f27121b.mo38827c(), this.f27121b.mo38825b(), i).mo238001b(new Consumer(linkShareItem) {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.$$Lambda$g$3E30Qq6kB6IAkrsrBsdLXfNYEQ */
            public final /* synthetic */ LinkShareItem f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10031g.this.m41742a((C10031g) this.f$1, (LinkShareItem) ((Boolean) obj));
            }
        }, new Consumer(linkShareItem) {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.$$Lambda$g$7iuAT4tbQ70pJjwtOh4PwjhKE0 */
            public final /* synthetic */ LinkShareItem f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10031g.this.m41743a((C10031g) this.f$1, (LinkShareItem) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m41743a(LinkShareItem linkShareItem, Throwable th) throws Exception {
        C13479a.m54761a("DocumentLinkShareSettingPresenter", th);
        m41750c(linkShareItem, 1);
    }

    /* renamed from: c */
    private void m41750c(LinkShareItem linkShareItem, int i) {
        String str = "visit_with_permission:any_editable";
        switch (linkShareItem.getType()) {
            case 1:
                ((AbstractC10033h) getModel()).mo38339a(this.f27121b.mo38825b(), this.f27121b.mo38827c(), i, new C10032a(this, linkShareItem.getType()));
                str = "url_visit_swtich:close";
                break;
            case 2:
            default:
                str = "";
                break;
            case 3:
                ((AbstractC10033h) getModel()).mo38340b(this.f27121b.mo38825b(), this.f27121b.mo38827c(), i, new C10032a(this, linkShareItem.getType()));
                str = "visit_with_permission:readable";
                break;
            case 4:
                ((AbstractC10033h) getModel()).mo38341c(this.f27121b.mo38825b(), this.f27121b.mo38827c(), i, new C10032a(this, linkShareItem.getType()));
                str = "visit_with_permission:editable";
                break;
            case 5:
                m41749c();
                if (this.f27126g) {
                    m41744a(true, linkShareItem.getType(), i);
                } else {
                    ((AbstractC10033h) getModel()).mo38342d(this.f27121b.mo38825b(), this.f27121b.mo38827c(), i, new C10032a(this, linkShareItem.getType()));
                }
                str = "visit_with_permission:any_readable";
                break;
            case 6:
                m41749c();
                if (!this.f27126g) {
                    ((AbstractC10033h) getModel()).mo38343e(this.f27121b.mo38825b(), this.f27121b.mo38827c(), i, new C10032a(this, linkShareItem.getType()));
                    break;
                } else {
                    m41744a(false, linkShareItem.getType(), i);
                    break;
                }
            case 7:
                m41749c();
                if (this.f27127h || !this.f27126g) {
                    ((AbstractC10033h) getModel()).mo38342d(this.f27121b.mo38825b(), this.f27121b.mo38827c(), i, new C10032a(this, linkShareItem.getType()));
                } else {
                    m41744a(true, linkShareItem.getType(), i);
                }
                str = "visit_with_permission:any_readable";
                break;
            case 8:
                m41749c();
                if (!this.f27127h && this.f27126g) {
                    m41744a(false, linkShareItem.getType(), i);
                    break;
                } else {
                    ((AbstractC10033h) getModel()).mo38343e(this.f27121b.mo38825b(), this.f27121b.mo38827c(), i, new C10032a(this, linkShareItem.getType()));
                    break;
                }
                break;
        }
        if (!TextUtils.isEmpty(str)) {
            PermissionAnalytic.m39409a(str, this.f27121b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m41746a(boolean z, String str) {
        this.f27121b.mo38822a(z);
        this.f27121b.mo38821a(str);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10034i.AbstractC10035a
    /* renamed from: a */
    public void mo38345a(LinkShareItem linkShareItem, int i) {
        int i2;
        if (linkShareItem == null || linkShareItem.getType() == 1000) {
            C13479a.m54758a("DocumentLinkShareSettingPresenter", "onShareItemClick()...linkShareItem is null or click password item");
        } else if (linkShareItem.getType() == i) {
            C13479a.m54764b("DocumentLinkShareSettingPresenter", "onShareItemClick()...linkShareItem is current");
        } else {
            boolean z = true;
            switch (linkShareItem.getType()) {
                case 1:
                case 2:
                default:
                    i2 = 0;
                    break;
                case 3:
                    i2 = 1;
                    break;
                case 4:
                    i2 = 2;
                    break;
                case 5:
                case 7:
                    i2 = 3;
                    break;
                case 6:
                case 8:
                    i2 = 4;
                    break;
            }
            C13479a.m54764b("DocumentLinkShareSettingPresenter", "newLinkShareEntity: " + i2 + ", externalAccess: " + this.f27121b.mo38794C());
            if ((i2 == 3 || i2 == 4) && !this.f27121b.mo38794C() && this.f27121b.mo38816Y()) {
                Toast.showText(this.f27120a, (int) R.string.CreationMobile_ECM_ExternalShare_SwitchOption_Enable_toast);
                return;
            }
            if ((!this.f27121b.mo38844q() || !this.f27121b.ab()) && !this.f27121b.mo38816Y()) {
                m41750c(linkShareItem, 1);
            } else if (!this.f27121b.mo38844q() || !this.f27121b.ab() || !PermFGUtils.m39534c() || this.f27121b.mo38847t() || !this.f27121b.mo38849u()) {
                m41748b(linkShareItem, i2);
            } else {
                m41750c(linkShareItem, 2);
            }
            if (!this.f27121b.mo38844q() || !this.f27121b.ab() || !PermFGUtils.m39534c() || !this.f27121b.mo38797F()) {
                z = false;
            }
            PermissionAnalyticV2.m39596a(i2, this.f27121b.mo38816Y(), z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m41741a(LinkShareItem linkShareItem, DialogInterface dialogInterface, int i) {
        m41750c(linkShareItem, 1);
        PermissionAnalyticV2.m39626a("reduce_sharelink", true);
    }

    /* renamed from: a */
    private void m41744a(boolean z, int i, int i2) {
        C10071n.m41902a(this.f27120a, this.f27121b.mo38825b(), this.f27121b.mo38827c(), this.f27121b.mo38830e(), this.f27121b.mo38844q(), "from_share_link", z, new DialogInterface.OnClickListener(z, i2, i) {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.$$Lambda$g$1OXS64ske6bce3Ympmx89I5Uc */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C10031g.this.m41745a(this.f$1, this.f$2, this.f$3, dialogInterface, i);
            }
        }, (DialogInterface.OnClickListener) null);
    }

    C10031g(AbstractC10033h hVar, AbstractC10034i iVar, Fragment fragment, DocPermSetInfo docPermSetInfo, String str) {
        super(hVar, iVar);
        this.f27120a = fragment.getContext();
        this.f27124e = fragment;
        this.f27121b = docPermSetInfo;
        this.f27125f = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m41745a(boolean z, int i, int i2, DialogInterface dialogInterface, int i3) {
        if (z) {
            ((AbstractC10033h) getModel()).mo38342d(this.f27121b.mo38825b(), this.f27121b.mo38827c(), i, new C10032a(this, i2));
        } else {
            ((AbstractC10033h) getModel()).mo38343e(this.f27121b.mo38825b(), this.f27121b.mo38827c(), i, new C10032a(this, i2));
        }
    }
}
