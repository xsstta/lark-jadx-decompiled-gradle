package com.bytedance.ee.bear.middleground.permission.setting.linkshare;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10034i;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10037k;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10079s;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10056f;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.IUpdatePasswordStateToPermSetInfo;
import com.bytedance.ee.bear.middleground.permission.util.ToCUtil;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.FolderPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
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

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.s */
public class C10079s extends BasePresenter<AbstractC10036j, AbstractC10034i, AbstractC10034i.AbstractC10035a> implements AbstractC10034i.AbstractC10035a, C10037k.AbstractC10038a {

    /* renamed from: a */
    public Context f27233a;

    /* renamed from: b */
    public FolderPermSetInfo f27234b;

    /* renamed from: c */
    public C11824c f27235c;

    /* renamed from: d */
    public C10056f f27236d;

    /* renamed from: e */
    public String f27237e;

    /* renamed from: f */
    private C10917c f27238f;

    /* renamed from: g */
    private String f27239g;

    /* renamed from: h */
    private boolean f27240h;

    /* renamed from: i */
    private AccountService.Account f27241i;

    /* renamed from: j */
    private boolean f27242j;

    /* renamed from: k */
    private C68289a f27243k = new C68289a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC10034i.AbstractC10035a createViewDelegate() {
        return this;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m41944b();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f27236d = null;
        this.f27243k.dispose();
    }

    /* renamed from: b */
    private void m41944b() {
        boolean z;
        this.f27240h = C4511g.m18594d().mo17345F();
        this.f27241i = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        if (ToCUtil.f26828a.mo37760b(this.f27241i) || ((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22259a()) {
            z = true;
        } else {
            z = false;
        }
        this.f27242j = z;
        ((AbstractC10034i) getView()).mo38334a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.s$a */
    public static class C10080a implements AbstractC10169g {

        /* renamed from: a */
        private WeakReference<C10079s> f27244a;

        /* renamed from: b */
        private int f27245b;

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17110a() {
            if (this.f27244a.get() == null) {
                C13479a.m54764b("ShareFolderLinkShareSettingPresenter", "onRequestStart()...presenterRef is null");
                return;
            }
            C10079s sVar = this.f27244a.get();
            if (sVar.f27235c == null) {
                sVar.f27235c = new C11824c(sVar.f27233a);
            }
            sVar.f27235c.mo45304d();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static /* synthetic */ void m41951b(Throwable th) throws Exception {
            C13479a.m54758a("ShareFolderLinkShareSettingPresenter", "fetchShareFolderPublicPermission()...fail, error = " + th);
        }

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17111a(int i) {
            if (this.f27244a.get() == null) {
                C13479a.m54764b("ShareFolderLinkShareSettingPresenter", "onRequestSuccess()...presenterRef is null, permission = " + i);
                return;
            }
            C10079s sVar = this.f27244a.get();
            if (sVar.f27235c != null) {
                sVar.f27235c.mo45303c();
            }
            ((AbstractC10036j) sVar.getModel()).mo38348a(sVar.f27237e, sVar.f27234b.mo38873i()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(sVar) {
                /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.$$Lambda$s$a$FB6sgM8GfuFh7V5i3PRnycu4YYs */
                public final /* synthetic */ C10079s f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C10079s.C10080a.this.m41950a(this.f$1, (ShareFolderPublicPermission) obj);
                }
            }, $$Lambda$s$a$IqhA1ZPZNsvl2YrKUU16IXqGtUs.INSTANCE);
        }

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17112a(Throwable th) {
            if (this.f27244a.get() == null) {
                C13479a.m54758a("ShareFolderLinkShareSettingPresenter", "onRequestFail()...presenterRef is null, error = " + th);
                return;
            }
            C13479a.m54758a("ShareFolderLinkShareSettingPresenter", "onRequestFail()...throwable = " + th);
            C10079s sVar = this.f27244a.get();
            if (sVar.f27235c != null) {
                sVar.f27235c.mo45303c();
            }
            if (C5203d.m21235a(th, 10040)) {
                Toast.showFailureText(sVar.f27233a, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
            } else {
                Toast.showFailureText(sVar.f27233a, sVar.f27233a.getString(R.string.Doc_Facade_SaveFailed), 0);
            }
        }

        C10080a(C10079s sVar, int i) {
            this.f27244a = new WeakReference<>(sVar);
            this.f27245b = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m41950a(C10079s sVar, ShareFolderPublicPermission shareFolderPublicPermission) throws Exception {
            C13479a.m54764b("ShareFolderLinkShareSettingPresenter", "fetchShareFolderPublicPermission()...permission = " + shareFolderPublicPermission);
            sVar.f27234b.mo38859a(shareFolderPublicPermission);
            ((AbstractC10034i) sVar.getView()).mo38332a(this.f27245b);
            if (sVar.f27236d != null) {
                sVar.f27236d.mo38407a(shareFolderPublicPermission.getHasLinkPassword(), shareFolderPublicPermission.getLinkPassword());
            }
            PermissionAnalyticV2.m39607a(shareFolderPublicPermission.getReportPublicPermJson());
        }
    }

    /* renamed from: a */
    private void m41936a(int i) {
        C10071n.m41902a(this.f27233a, this.f27234b.mo38863b(), this.f27234b.mo38864c(), "", false, "from_share_link", true, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(i) {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.$$Lambda$s$SNONMvcpMTogJr7H95rqzQm9Wj8 */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C10079s.this.m41937a((C10079s) this.f$1, (int) dialogInterface, (DialogInterface) i);
            }
        }, (DialogInterface.OnClickListener) null);
    }

    /* renamed from: a */
    private void m41939a(LinkShareItem linkShareItem) {
        int i;
        int type = linkShareItem.getType();
        if (type != 1) {
            if (type != 7) {
                if (type == 3) {
                    i = ShareFolderPublicPermission.getLinkShareInternalReadPerm();
                } else if (type == 4) {
                    i = ShareFolderPublicPermission.getLinkShareInternalEditPerm();
                } else if (type != 5) {
                    i = 0;
                }
            }
            i = ShareFolderPublicPermission.getLinkShareAnyonePerm(this.f27234b.mo38883s());
        } else {
            i = ShareFolderPublicPermission.getLinkShareClosePerm();
        }
        this.f27243k.mo237937a(((AbstractC10036j) getModel()).mo38347a(this.f27234b.mo38864c(), i).mo238001b(new Consumer(linkShareItem) {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.$$Lambda$s$rL490NkNDCnx_CItXf__QX_BK_M */
            public final /* synthetic */ LinkShareItem f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10079s.this.m41941a((C10079s) this.f$1, (LinkShareItem) ((Boolean) obj));
            }
        }, new Consumer(linkShareItem) {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.$$Lambda$s$LI510hDk7UIc3Zrrgdk7cizK3ao */
            public final /* synthetic */ LinkShareItem f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10079s.this.m41942a((C10079s) this.f$1, (LinkShareItem) ((Throwable) obj));
            }
        }));
    }

    /* renamed from: b */
    private void m41945b(LinkShareItem linkShareItem) {
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40651a(this.f27234b.mo38864c(), String.valueOf(this.f27234b.mo38863b()), new BearUDDialogBuilder(this.f27233a).mo45344a(R.string.CreationMobile_Wiki_Permission_ChangePermission_Title).mo45362d(R.string.CreationMobile_ECM_InheritDesc).mo45360c(8388611).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_Confirm, new DialogInterface.OnClickListener(linkShareItem) {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.$$Lambda$s$lfdZgacIjZ4cksvCnaVxN0xCpCQ */
            public final /* synthetic */ LinkShareItem f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C10079s.this.m41940a((C10079s) this.f$1, (LinkShareItem) dialogInterface, (DialogInterface) i);
            }
        }).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, $$Lambda$s$QFTP7RgLrxHudAZ65WtLCq5uxmo.INSTANCE).mo45359b());
        PermissionAnalyticV2.m39643b("reduce_sharelink");
    }

    /* renamed from: c */
    private void m41946c(LinkShareItem linkShareItem) {
        int linkShareClosePerm = ShareFolderPublicPermission.getLinkShareClosePerm();
        int type = linkShareItem.getType();
        String str = "visit_with_permission:any_readable";
        if (type == 1) {
            linkShareClosePerm = ShareFolderPublicPermission.getLinkShareClosePerm();
            ((AbstractC10036j) getModel()).mo38349a(this.f27237e, new C10080a(this, linkShareItem.getType()));
            str = "url_visit_swtich:close";
        } else if (type == 7) {
            linkShareClosePerm = ShareFolderPublicPermission.getLinkShareAnyonePerm(this.f27234b.mo38883s());
            if (this.f27240h) {
                ((AbstractC10036j) getModel()).mo38352d(this.f27237e, new C10080a(this, linkShareItem.getType()));
            } else {
                m41936a(linkShareItem.getType());
            }
        } else if (type == 3) {
            linkShareClosePerm = ShareFolderPublicPermission.getLinkShareInternalReadPerm();
            ((AbstractC10036j) getModel()).mo38350b(this.f27237e, new C10080a(this, linkShareItem.getType()));
            str = "visit_with_permission:readable";
        } else if (type == 4) {
            linkShareClosePerm = ShareFolderPublicPermission.getLinkShareInternalEditPerm();
            ((AbstractC10036j) getModel()).mo38351c(this.f27237e, new C10080a(this, linkShareItem.getType()));
            str = "visit_with_permission:editable";
        } else if (type != 5) {
            str = "";
        } else {
            linkShareClosePerm = ShareFolderPublicPermission.getLinkShareAnyonePerm(this.f27234b.mo38883s());
            m41936a(linkShareItem.getType());
        }
        if (!TextUtils.isEmpty(str)) {
            PermissionAnalytic.m39408a(str, this.f27234b.mo38863b(), this.f27234b.mo38864c(), this.f27234b.mo38874j(), this.f27234b.mo38865d(), this.f27234b.mo38869f(), this.f27234b.mo38870g());
        }
        PermissionAnalyticV2.m39595a(linkShareClosePerm, this.f27234b.mo38883s());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m41941a(LinkShareItem linkShareItem, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            m41945b(linkShareItem);
        } else {
            m41946c(linkShareItem);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m41942a(LinkShareItem linkShareItem, Throwable th) throws Exception {
        C13479a.m54759a("ShareFolderLinkShareSettingPresenter", "checkLock()....", th);
        m41946c(linkShareItem);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m41943a(boolean z, String str) {
        this.f27234b.mo38862a(z);
        this.f27234b.mo38861a(str);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10034i.AbstractC10035a
    /* renamed from: a */
    public void mo38345a(LinkShareItem linkShareItem, int i) {
        if (linkShareItem == null || linkShareItem.getType() == 1000) {
            C13479a.m54758a("ShareFolderLinkShareSettingPresenter", "onShareItemClick()...linkShareItem is null or click password item");
        } else if (linkShareItem.getType() != i) {
            if (this.f27234b.mo38883s() && !this.f27234b.mo38876l() && (linkShareItem.getType() == 5 || linkShareItem.getType() == 7)) {
                Toast.showText(this.f27233a, (int) R.string.CreationMobile_ECM_ExternalShare_SwitchOption_Enable_folder_toast);
            } else if (this.f27234b.mo38883s()) {
                m41939a(linkShareItem);
            } else {
                m41946c(linkShareItem);
            }
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10037k.AbstractC10038a
    /* renamed from: a */
    public void mo38346a(boolean z, View view) {
        if (this.f27236d == null) {
            this.f27236d = C10056f.m41841a(view, this.f27234b.mo38858a(), this.f27234b.mo38864c(), this.f27234b.mo38863b(), "", this.f27234b.mo38879o(), this.f27234b.mo38880p(), this.f27242j, this.f27239g, new IUpdatePasswordStateToPermSetInfo() {
                /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.$$Lambda$s$sY01JzdzKEazoAIb1F0gVn1JUSE */

                @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.IUpdatePasswordStateToPermSetInfo
                public final void onPasswordStateUpdate(boolean z, String str) {
                    C10079s.this.m41943a((C10079s) z, (boolean) str);
                }
            }, this.f27234b.mo38883s());
        }
        this.f27236d.mo38406a(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m41940a(LinkShareItem linkShareItem, DialogInterface dialogInterface, int i) {
        m41946c(linkShareItem);
        PermissionAnalyticV2.m39626a("reduce_sharelink", true);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m41937a(int i, DialogInterface dialogInterface, int i2) {
        ((AbstractC10036j) getModel()).mo38352d(this.f27237e, new C10080a(this, i));
    }

    C10079s(AbstractC10036j jVar, AbstractC10034i iVar, Context context, C10917c cVar, FolderPermSetInfo folderPermSetInfo, String str) {
        super(jVar, iVar);
        String str2;
        this.f27233a = context;
        this.f27238f = cVar;
        this.f27234b = folderPermSetInfo;
        this.f27239g = str;
        if (folderPermSetInfo.mo38883s()) {
            str2 = this.f27234b.mo38864c();
        } else {
            str2 = this.f27234b.mo38871h();
        }
        this.f27237e = str2;
    }
}
