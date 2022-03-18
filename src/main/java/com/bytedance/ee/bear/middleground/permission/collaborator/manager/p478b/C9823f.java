package com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.net.AbstractC5204e;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.AbstractC9636d;
import com.bytedance.ee.bear.middleground.permission.collaborator.InviteMembersUtils;
import com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9706c;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.AbstractC9751b;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.C9823f;
import com.bytedance.ee.bear.middleground.permission.permission.doc.DocUserPermission;
import com.bytedance.ee.bear.middleground.permission.util.PermissionUtils;
import com.bytedance.ee.bear.middleground.permission.widget.editpermdialog.EditPermDialog;
import com.bytedance.ee.bear.middleground.permission.widget.editpermdialog.EditPermItemModel;
import com.bytedance.ee.bear.middleground.permission.widget.editpermdialog.EditPermItemModelHelper;
import com.bytedance.ee.bear.middleground_permission_export.model.MemberChangeListener;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.p513o.AbstractC10365a;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.share.export.AbstractC11003a;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.C11824c;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.f */
public class C9823f extends BasePresenter<AbstractC9827g, AbstractC9751b, AbstractC9751b.AbstractC9752a> implements AbstractC9751b.AbstractC9752a, MemberChangeListener {

    /* renamed from: f */
    static final /* synthetic */ boolean f26468f = true;

    /* renamed from: a */
    public final Fragment f26469a;

    /* renamed from: b */
    protected final Context f26470b;

    /* renamed from: c */
    protected final DocPermSetInfo f26471c;

    /* renamed from: d */
    public ShareUserInfoResult f26472d;

    /* renamed from: e */
    protected boolean f26473e;

    /* renamed from: g */
    private final C10917c f26474g;

    /* renamed from: h */
    private final String f26475h;

    /* renamed from: i */
    private Locale f26476i;

    /* renamed from: j */
    private AccountService.Account f26477j;

    /* renamed from: l */
    private int f26478l;

    /* renamed from: m */
    private final int f26479m;

    /* renamed from: n */
    private C11824c f26480n;

    /* renamed from: o */
    private EditPermDialog f26481o;

    /* renamed from: p */
    private final C68289a f26482p = new C68289a();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public AbstractC9751b.AbstractC9752a createViewDelegate() {
        return this;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.AbstractC9751b.AbstractC9752a
    /* renamed from: a */
    public void mo37191a(AbstractC27129h hVar) {
        ShareUserInfoResult shareUserInfoResult = this.f26472d;
        if (shareUserInfoResult == null || !shareUserInfoResult.isHasMore()) {
            C13479a.m54764b("DocumentCollaboratorManagerPresenter", "onLoadMore()...no more");
        } else {
            ((AbstractC9827g) getModel()).mo37333a(this.f26471c.mo38827c(), this.f26471c.mo38825b(), this.f26472d.getLastLabel(), new C9825a(this, f26468f, false));
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.AbstractC9751b.AbstractC9752a
    /* renamed from: a */
    public void mo37189a() {
        ArrayList<UserInfo> arrayList;
        if (f26468f || this.f26469a.getActivity() != null) {
            if (this.f26472d.getUserInfoList() == null) {
                arrayList = new ArrayList<>();
            } else {
                arrayList = this.f26472d.getUserInfoList();
            }
            InviteMembersUtils.m39847a(this.f26469a.getActivity(), this.f26471c, arrayList, this.f26475h, false);
            PermissionAnalyticV2.m39689l();
            return;
        }
        throw new AssertionError();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.AbstractC9751b.AbstractC9752a
    /* renamed from: a */
    public void mo37190a(int i, UserInfo userInfo) {
        C13479a.m54764b("DocumentCollaboratorManagerPresenter", "onCollaboratorPermissionClick()...position = " + i + ", isOwner = " + this.f26471c.mo38845r());
        this.f26478l = i;
        if (this.f26481o == null) {
            this.f26481o = new EditPermDialog(this.f26470b);
        }
        this.f26481o.mo38494a(userInfo, this.f26471c.mo38827c(), this.f26471c.mo38825b(), mo37337a(userInfo));
        PermissionAnalytic.m39397a(this.f26471c, userInfo);
        PermissionAnalyticV2.m39599a(userInfo);
        PermissionAnalyticV2.m39641b(userInfo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ArrayList<EditPermItemModel> mo37337a(UserInfo userInfo) {
        boolean v = this.f26471c.mo38850v();
        boolean w = this.f26471c.mo38851w();
        boolean x = this.f26471c.mo38853x();
        boolean isFullAccess = DocUserPermission.isFullAccess(userInfo.getPermission());
        boolean z = (isFullAccess || !DocUserPermission.canEdit(userInfo.getPermission())) ? false : f26468f;
        boolean z2 = (isFullAccess || z || !DocUserPermission.canRead(userInfo.getPermission())) ? false : f26468f;
        boolean z3 = (isFullAccess || z || z2) ? false : f26468f;
        boolean f = mo37347f(userInfo);
        int i = userInfo.getOwnerType() == 24 ? R.string.CreationMobile_Wiki_Permission_NoAccess_Options : R.string.Doc_Facade_Remove;
        C13479a.m54764b("DocumentCollaboratorManagerPresenter", "canUserFa: " + v + ", canUserEdit: " + w + ", canMemberEdit:" + z + ", canMemberRead:" + z2 + ", faEnable:" + this.f26473e + ", canTransfer:" + f);
        return new EditPermItemModelHelper(this.f26470b).mo38518a(this.f26473e, v, isFullAccess, this.f26471c.mo38844q(), new View.OnClickListener(userInfo) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$Wpsap9qrg6khghZJ6gKIGUGsR4 */
            public final /* synthetic */ UserInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C9823f.this.m40581e(this.f$1, view);
            }
        }).mo38521b(z, (w || v) ? f26468f : false, new View.OnClickListener(userInfo) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$iAtV9n7Q1Xw1zWCwi7SSMj7pWQ */
            public final /* synthetic */ UserInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C9823f.this.m40579d(this.f$1, view);
            }
        }).mo38517a(z2, x, new View.OnClickListener(userInfo) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$Ol92DlZiFHWV0fO0z8hH50kJx5Q */
            public final /* synthetic */ UserInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C9823f.this.m40576c((C9823f) this.f$1, (UserInfo) view);
            }
        }).mo38520b(f, new View.OnClickListener(userInfo) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$vrawjG0HHKRisDUs6W4RfkDO4o */
            public final /* synthetic */ UserInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C9823f.this.m40569b((C9823f) this.f$1, (UserInfo) view);
            }
        }).mo38514a(i, true ^ f, z3, new View.OnClickListener(userInfo) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$1xSzNbMKDIgMPYjOe81LNCiLQD0 */
            public final /* synthetic */ UserInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C9823f.this.m40557a((C9823f) this.f$1, (UserInfo) view);
            }
        }).mo38519a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo37339b(UserInfo userInfo) {
        m40588j();
        PermissionAnalytic.m39399a(this.f26471c, userInfo, this.f26475h, (boolean) f26468f);
        PermissionAnalyticV2.m39600a(userInfo, 4);
        $$Lambda$f$2cmJi8MoZsiRHe4f7rDgYiFkCs r1 = new Runnable(userInfo) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$2cmJi8MoZsiRHe4f7rDgYiFkCs */
            public final /* synthetic */ UserInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C9823f.this.m40591k(this.f$1);
            }
        };
        if (!this.f26473e) {
            r1.run();
        } else if (m40585h(userInfo)) {
            m40560a(new Runnable(userInfo, r1) {
                /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$lXkTDnNBLAAmI7qILFjF09fnZE */
                public final /* synthetic */ UserInfo f$1;
                public final /* synthetic */ Runnable f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C9823f.this.m40577c((C9823f) this.f$1, (UserInfo) this.f$2);
                }
            });
        } else {
            m40555a(userInfo, 4, r1);
        }
    }

    /* renamed from: a */
    private void m40564a(Runnable runnable, String str, UserInfo userInfo) {
        m40566a(this.f26470b.getString(R.string.CreationMobile_Wiki_Permission_ChangePermission_Title), this.f26470b.getString(this.f26471c.mo38844q() ? R.string.CreationMobile_Wiki_Permission_SettingsDivision_Placeholder : R.string.CreationMobile_ECM_PermissionChangedDesc), new Runnable(runnable, str, userInfo) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$se27hWQcczdkJKsLIY1RNXO9kyc */
            public final /* synthetic */ Runnable f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ UserInfo f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C9823f.m40574b(this.f$0, this.f$1, this.f$2);
            }
        }, new Runnable(str) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$mm7lzjwzQ0kd46VEz2Nwp1nmhUg */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
                	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
                	at java.base/java.util.Objects.checkIndex(Objects.java:372)
                	at java.base/java.util.ArrayList.get(ArrayList.java:459)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                */
            public final void run() {
                /*
                    r1 = this;
                    java.lang.String r0 = r1.f$0
                    com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.C9823f.lambda$mm7lzjwzQ0kd46VEz2Nwp1nmhUg(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$mm7lzjwzQ0kd46VEz2Nwp1nmhUg.run():void");
            }
        });
        PermissionAnalyticV2.m39621a(str, userInfo);
    }

    /* renamed from: a */
    private void m40566a(String str, String str2, Runnable runnable, Runnable runnable2) {
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40651a(this.f26471c.mo38827c(), String.valueOf(this.f26471c.mo38825b()), new BearUDDialogBuilder(this.f26470b).mo45353a(str).mo45357b(str2).mo45360c(8388611).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_Confirm, new DialogInterface.OnClickListener(runnable) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$sc4Q78dVJt7JObVYL8Bp7JvM0A */
            public final /* synthetic */ Runnable f$0;

            {
                this.f$0 = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f$0.run();
            }
        }).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, new DialogInterface.OnClickListener(runnable2) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$PAOWVDniYwIOoyzwWomJOFXrOg */
            public final /* synthetic */ Runnable f$0;

            {
                this.f$0 = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f$0.run();
            }
        }).mo45359b());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40567a(Throwable th) throws Exception {
        C13479a.m54761a("DocumentCollaboratorManagerPresenter", th);
        if (C5203d.m21235a(th, 4)) {
            m40592l();
        }
    }

    /* renamed from: j */
    private void m40588j() {
        EditPermDialog bVar = this.f26481o;
        if (bVar != null) {
            bVar.mo38493a();
        }
    }

    /* renamed from: f */
    public void mo37346f() {
        C11824c cVar = this.f26480n;
        if (cVar != null) {
            cVar.mo45303c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.f$b */
    public static final class C9826b implements AbstractC9636d {

        /* renamed from: a */
        static final /* synthetic */ boolean f26487a = C9823f.f26468f;

        /* renamed from: b */
        private final WeakReference<C9823f> f26488b;

        /* renamed from: c */
        private final UserInfo f26489c;

        /* renamed from: d */
        private final boolean f26490d;

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17110a() {
            this.f26488b.get().mo37344e();
        }

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17111a(int i) {
            m40618b(i);
        }

        /* renamed from: b */
        private void m40618b(int i) {
            C13479a.m54764b("DocumentCollaboratorManagerPresenter", "SetCollaboratorPermissionCallback#onRequestSuccess()...permission = " + i);
            if (this.f26488b.get() == null) {
                C13479a.m54764b("DocumentCollaboratorManagerPresenter", "presenterRef is null");
                return;
            }
            C9823f fVar = this.f26488b.get();
            fVar.mo37346f();
            if (f26487a || fVar.f26469a.getActivity() != null) {
                fVar.mo37338b(i, this.f26489c);
                Toast.showSuccessText(fVar.f26470b, fVar.f26470b.getString(R.string.Doc_Facade_Success), 0);
                if (this.f26490d) {
                    fVar.mo37348g();
                    return;
                }
                return;
            }
            throw new AssertionError();
        }

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17112a(Throwable th) {
            C13479a.m54764b("DocumentCollaboratorManagerPresenter", "SetCollaboratorPermissionCallback#onRequestFail()...throwable = " + th);
            if (this.f26488b.get() == null) {
                C13479a.m54764b("DocumentCollaboratorManagerPresenter", "presenterRef is null");
                return;
            }
            C9823f fVar = this.f26488b.get();
            fVar.mo37346f();
            ((AbstractC10365a) KoinJavaComponent.m268610a(AbstractC10365a.class)).mo39500a(fVar.f26470b, th, new Runnable(th, fVar) {
                /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$b$Z_ZDYifuQpmZpdX6LWhcrQfc8oM */
                public final /* synthetic */ Throwable f$0;
                public final /* synthetic */ C9823f f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    C9823f.C9826b.m40617a(this.f$0, this.f$1);
                }
            });
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.AbstractC9636d
        /* renamed from: a */
        public void mo36832a(int i, List<NotNotifyUserEntity> list) {
            m40618b(i);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m40617a(Throwable th, C9823f fVar) {
            if (C5203d.m21235a(th, 10040)) {
                Toast.showFailureText(fVar.f26470b, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
            } else {
                Toast.showFailureText(fVar.f26470b, fVar.f26470b.getString(R.string.Doc_Share_EditFailed), 0);
            }
        }

        C9826b(C9823f fVar, UserInfo userInfo, boolean z) {
            this.f26488b = new WeakReference<>(fVar);
            this.f26489c = userInfo;
            this.f26490d = z;
        }
    }

    /* renamed from: h */
    private void m40584h() {
        this.f26476i = C4484g.m18494b().mo17253d();
        this.f26477j = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
    }

    /* renamed from: i */
    private void m40586i() {
        int i;
        if (this.f26471c.mo38799H()) {
            if (this.f26471c.mo38844q()) {
                i = R.string.CreationMobile_Wiki_Permission_NoLongerInherit_Placeholder;
            } else {
                i = R.string.CreationMobile_ECM_PermissionRestrictionDesc;
            }
            ((AbstractC9751b) getView()).mo37144a(this.f26470b.getString(i), this.f26471c.mo38800I(), new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.C9823f.C98241 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    PermissionAnalyticV2.m39685j();
                    C9823f.this.mo37342d();
                }
            });
            return;
        }
        ((AbstractC9751b) getView()).mo37149d();
    }

    /* renamed from: k */
    private void m40590k() {
        if (!this.f26471c.mo38845r()) {
            this.f26482p.mo237937a(((AbstractC9827g) getModel()).mo37336c(this.f26471c.mo38827c(), this.f26471c.mo38825b()).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$ZUSu1mbP2_hKJ3wiTC0nOfyppAE */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C9823f.this.m40554a((C9823f) ((IDocUserPermission) obj));
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$PE08qSQO035IhJEvxwr8OpH1_A */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C9823f.this.m40567a((C9823f) ((Throwable) obj));
                }
            }));
        }
    }

    /* renamed from: l */
    private void m40592l() {
        C13479a.m54764b("DocumentCollaboratorManagerPresenter", "exit manager activity");
        FragmentActivity activity = this.f26469a.getActivity();
        if (C13726a.m55676b(activity)) {
            activity.finish();
        }
        ((AbstractC11003a) KoinJavaComponent.m268610a(AbstractC11003a.class)).mo41768d();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m40594n() {
        ((AbstractC9751b) getView()).mo37149d();
        this.f26482p.mo237937a(((AbstractC9827g) getModel()).mo37334b(this.f26471c.mo38827c(), this.f26471c.mo38825b()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$osRSjYCHlFqvd9_uiKezkpDd4EY */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9823f.this.m40559a((C9823f) ((Boolean) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$Iy0yT_VBvRhV9XmX6txpgQmkEqY */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9823f.this.m40582e((C9823f) ((Throwable) obj));
            }
        }));
        PermissionAnalyticV2.m39681h(f26468f);
    }

    /* renamed from: d */
    public void mo37342d() {
        int i;
        if (this.f26471c.mo38844q()) {
            i = R.string.CreationMobile_Wiki_Permission_RestoreInherit_Placeholder;
        } else {
            i = R.string.CreationMobile_ECM_PermissionChangeDesc;
        }
        m40566a(this.f26470b.getString(R.string.CreationMobile_Wiki_Permission_ChangePermission_Title), this.f26470b.getString(i), new Runnable() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$mFK4nIOM2ZqblEZee7ODXQ11vM */

            public final void run() {
                C9823f.this.m40594n();
            }
        }, $$Lambda$f$9sVA2JF9A5YV8qwj6dc6GGhvk.INSTANCE);
        PermissionAnalyticV2.m39583E();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36638a().mo36651b(this);
        ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36638a().mo36646a(1);
        this.f26482p.dispose();
    }

    /* renamed from: e */
    public void mo37344e() {
        if (this.f26480n == null) {
            this.f26480n = new C11824c(this.f26470b);
        }
        this.f26480n.mo45304d();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m40584h();
        ((AbstractC9751b) getView()).mo37145a(this.f26472d.getUserInfoList());
        ((AbstractC9751b) getView()).mo37143a(C9706c.m40178a(this.f26470b, this.f26472d.getTotalNum()));
        ((AbstractC9751b) getView()).mo37146a(this.f26472d.isHasMore());
        ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36638a().mo36648a(this);
        m40586i();
        PermissionAnalytic.m39401a(this.f26471c, "show_collaborate_setting_page", (Map<String, String>) null);
    }

    /* renamed from: g */
    public void mo37348g() {
        this.f26482p.mo237937a(((AbstractC9827g) getModel()).mo37328a(this.f26471c.mo38827c(), this.f26471c.mo38825b()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$JIZ_2PrzjRTDXYZ_mYBjQIvtUT4 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9823f.this.m40553a((C9823f) ((IDocPublicPermission) obj));
            }
        }, $$Lambda$f$UIgOcxTZnpe6XcgkM9PYWySn84.INSTANCE));
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.AbstractC9751b.AbstractC9752a
    /* renamed from: b */
    public void mo37192b() {
        PermissionAnalyticV2.m39687k();
        if (f26468f || this.f26469a.getActivity() != null) {
            this.f26469a.getActivity().finish();
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40553a(IDocPublicPermission iDocPublicPermission) throws Exception {
        this.f26471c.mo38819a(iDocPublicPermission);
        m40586i();
        PermissionAnalyticV2.m39607a(iDocPublicPermission.getReportJson());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m40571b(Runnable runnable) {
        runnable.run();
        PermissionAnalyticV2.m39650b((boolean) f26468f);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40559a(Boolean bool) throws Exception {
        Toast.showSuccessText(this.f26470b, (int) R.string.CreationMobile_Wiki_Restored_Toast);
        ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36638a().mo36646a(2);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m40582e(Throwable th) throws Exception {
        C13479a.m54759a("DocumentCollaboratorManagerPresenter", "onUnLockClicked()...", th);
        ((AbstractC9751b) getView()).mo37150e();
        Toast.showFailureText(this.f26470b, (int) R.string.CreationMobile_Wiki_CannotRestore_Toast);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m40589j(UserInfo userInfo) {
        ((AbstractC9827g) getModel()).mo37331a(this.f26471c.mo38827c(), this.f26471c.mo38825b(), 1, userInfo, new C9826b(this, userInfo, f26468f));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m40591k(UserInfo userInfo) {
        ((AbstractC9827g) getModel()).mo37331a(this.f26471c.mo38827c(), this.f26471c.mo38825b(), 4, userInfo, new C9826b(this, userInfo, f26468f));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40554a(IDocUserPermission iDocUserPermission) throws Exception {
        this.f26471c.mo38820a(iDocUserPermission);
        C13479a.m54764b("DocumentCollaboratorManagerPresenter", "checkSharePermission()...canShare = " + iDocUserPermission.canManageCollaborator());
        if (!iDocUserPermission.canManageCollaborator()) {
            m40592l();
        }
    }

    /* renamed from: g */
    private void m40583g(UserInfo userInfo) {
        m40588j();
        ((AbstractC9827g) getModel()).mo37331a(this.f26471c.mo38827c(), this.f26471c.mo38825b(), 1024, userInfo, new C9826b(this, userInfo, f26468f));
        PermissionAnalyticV2.m39600a(userInfo, 1024);
    }

    /* renamed from: h */
    private boolean m40585h(UserInfo userInfo) {
        AccountService.Account account = this.f26477j;
        if (account == null || account.f14584a == null || !TextUtils.equals(this.f26477j.f14584a, userInfo.getId())) {
            return false;
        }
        return f26468f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo37341c(UserInfo userInfo) {
        m40588j();
        PermissionAnalytic.m39399a(this.f26471c, userInfo, this.f26475h, false);
        PermissionAnalyticV2.m39600a(userInfo, 1);
        $$Lambda$f$dcMMecgLY03LDW7xI19Y8LzQqpo r1 = new Runnable(userInfo) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$dcMMecgLY03LDW7xI19Y8LzQqpo */
            public final /* synthetic */ UserInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C9823f.this.m40589j(this.f$1);
            }
        };
        if (!this.f26473e) {
            r1.run();
        } else if (m40585h(userInfo)) {
            m40560a(new Runnable(userInfo, r1) {
                /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$4lvOfcYwDKq_KoCPl8Snbu_3Sc */
                public final /* synthetic */ UserInfo f$1;
                public final /* synthetic */ Runnable f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C9823f.this.m40570b((C9823f) this.f$1, (UserInfo) this.f$2);
                }
            });
        } else {
            m40555a(userInfo, 1, r1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo37347f(UserInfo userInfo) {
        boolean z;
        boolean z2;
        AccountService.Account account = this.f26477j;
        if (account == null || !account.mo19678a(userInfo.getTenantId())) {
            z = false;
        } else {
            z = f26468f;
        }
        if (userInfo.getOwnerType() == 0 || userInfo.getOwnerType() == 1) {
            z2 = f26468f;
        } else {
            z2 = false;
        }
        if (!this.f26471c.aa() || !this.f26471c.mo38845r() || !z2 || !z || m40585h(userInfo)) {
            return false;
        }
        return f26468f;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.f$a */
    public static final class C9825a implements AbstractC5204e<ShareUserInfoResult> {

        /* renamed from: a */
        private final WeakReference<C9823f> f26484a;

        /* renamed from: b */
        private final boolean f26485b;

        /* renamed from: c */
        private final boolean f26486c;

        /* renamed from: a */
        public void mo20806a(ShareUserInfoResult shareUserInfoResult) {
            C13479a.m54764b("DocumentCollaboratorManagerPresenter", "RequestCollaboratorsCallback#onSuccess()...");
            if (this.f26484a.get() == null) {
                C13479a.m54764b("DocumentCollaboratorManagerPresenter", "presenterRef is null");
                return;
            }
            C9823f fVar = this.f26484a.get();
            if (this.f26485b) {
                fVar.f26472d.getUserInfoList().addAll(shareUserInfoResult.getUserInfoList());
                shareUserInfoResult.setUserInfoList(fVar.f26472d.getUserInfoList());
                ((AbstractC9751b) fVar.getView()).mo37140a();
            }
            fVar.f26472d = shareUserInfoResult;
            fVar.mo37346f();
            ((AbstractC9751b) fVar.getView()).mo37146a(shareUserInfoResult.isHasMore());
            ((AbstractC9751b) fVar.getView()).mo37143a(C9706c.m40178a(fVar.f26470b, shareUserInfoResult.getTotalNum()));
            ((AbstractC9751b) fVar.getView()).mo37145a(fVar.f26472d.getUserInfoList());
            if (this.f26486c) {
                fVar.mo37348g();
            }
        }

        @Override // com.bytedance.ee.bear.contract.net.AbstractC5204e
        /* renamed from: a */
        public void mo20807a(Throwable th) {
            C13479a.m54758a("DocumentCollaboratorManagerPresenter", "RequestCollaboratorsCallback#onFailed()...throwable = " + th);
            if (this.f26484a.get() == null) {
                C13479a.m54764b("DocumentCollaboratorManagerPresenter", "presenterRef is null");
                return;
            }
            C9823f fVar = this.f26484a.get();
            fVar.mo37346f();
            if (this.f26485b) {
                ((AbstractC9751b) fVar.getView()).mo37140a();
            }
            Toast.showFailureText(fVar.f26470b, fVar.f26470b.getString(R.string.Doc_Share_LoadFailed), 0);
        }

        C9825a(C9823f fVar, boolean z, boolean z2) {
            this.f26484a = new WeakReference<>(fVar);
            this.f26485b = z;
            this.f26486c = z2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m40587i(UserInfo userInfo) {
        PermissionAnalytic.m39398a(this.f26471c, userInfo, "confirm_remove", this.f26475h);
        ((AbstractC9827g) getModel()).mo37335b(this.f26471c.mo38827c(), this.f26471c.mo38825b(), userInfo, new C9826b(this, userInfo, f26468f));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo37345e(UserInfo userInfo) {
        int i;
        PermissionAnalyticV2.m39654c(userInfo);
        m40588j();
        PermissionAnalytic.m39398a(this.f26471c, userInfo, "popup", this.f26475h);
        $$Lambda$f$vi1G4FegTlvjGkKw5gF_Ynnwrk r0 = new Runnable(userInfo) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$vi1G4FegTlvjGkKw5gF_Ynnwrk */
            public final /* synthetic */ UserInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C9823f.this.m40587i(this.f$1);
            }
        };
        if (!m40585h(userInfo) || !this.f26473e) {
            int i2 = -1;
            int ownerType = userInfo.getOwnerType();
            if (ownerType != 16) {
                switch (ownerType) {
                    case 8:
                        i = R.string.Doc_Share_RemoveCompanyPermissionConfirm;
                        break;
                    case 9:
                        i2 = R.string.Doc_Share_RemoveMeetingPermissionTitle;
                        i = R.string.Doc_Share_RemoveMeetingPermissionBody;
                        break;
                    case 10:
                        i = R.string.Doc_Share_RemoveWikiPermission;
                        break;
                    default:
                        i = R.string.Doc_Share_RemoveUesrPermissionConfirm;
                        break;
                }
            } else {
                i = R.string.Doc_Share_WikiRemovePermissionTips;
            }
            if (f26468f || this.f26469a.getActivity() != null) {
                PermissionUtils.m41301a(this.f26469a.getActivity(), i2, i, new DialogInterface.OnClickListener(r0, userInfo) {
                    /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$APpISFIo76mLRwfXiycxbxVn_0 */
                    public final /* synthetic */ Runnable f$1;
                    public final /* synthetic */ UserInfo f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C9823f.this.m40562a((C9823f) this.f$1, (Runnable) this.f$2, (UserInfo) dialogInterface, (DialogInterface) i);
                    }
                });
                return;
            }
            throw new AssertionError();
        }
        m40560a(r0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo37343d(UserInfo userInfo) {
        boolean z;
        String str;
        String str2;
        int i;
        PermissionAnalyticV2.m39664d(userInfo);
        m40588j();
        if (f26468f || this.f26469a.getActivity() != null) {
            FragmentActivity activity = this.f26469a.getActivity();
            boolean a = C4211a.m17514a().mo16536a("ccm.permission.mobile.batch_transfer_owner", false);
            if (this.f26471c.mo38825b() == C8275a.f22379l.mo32555b()) {
                z = f26468f;
            } else {
                z = false;
            }
            if (this.f26471c.mo38844q() || z || !this.f26471c.mo38816Y() || !a) {
                HashMap hashMap = new HashMap();
                hashMap.put("who", userInfo.getDisplayName(this.f26476i));
                hashMap.put("doc_type", ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31510b(activity, this.f26471c.mo38825b()));
                if (z) {
                    i = R.string.CreationMobile_Common_MinutesBot;
                } else {
                    i = R.string.CreatinoMobile_Minutes_bot_DocsAssist;
                }
                hashMap.put("bot", activity.getString(i));
                String a2 = C10539a.m43639a(activity, R.string.Doc_Share_ConfirmTransferOwner, "who", userInfo.getDisplayName(this.f26476i));
                str = C10539a.m43640a(activity, R.string.Doc_Share_TransferDocOwnerExplain_AddVariable, hashMap);
                str2 = a2;
            } else {
                str2 = activity.getString(R.string.CreationMobile_ECM_Transfer_DocTitle);
                str = C10539a.m43639a(activity, R.string.CreationMobile_ECM_Transfer_DocContent, "username", userInfo.getDisplayName(this.f26476i));
            }
            new BearUDDialogBuilder(activity).mo45353a(str2).mo45357b(str).mo45361c(f26468f).mo45343a(260.0f).mo45366g(0).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Share_Transfer, new DialogInterface.OnClickListener(userInfo) {
                /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$w2XnvFAZIWSVwc2P_SOMcCds5DQ */
                public final /* synthetic */ UserInfo f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C9823f.this.m40568b((C9823f) this.f$1, (UserInfo) dialogInterface, (DialogInterface) i);
                }
            }).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, new DialogInterface.OnClickListener() {
                /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$Jv1yKdcoW3u06Iad6fTXBl8f45E */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    PermissionAnalyticV2.m39602a(UserInfo.this, (DialogInterface) false);
                }
            }).mo45355a().show();
            PermissionAnalyticV2.m39670e(userInfo);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private void m40560a(Runnable runnable) {
        m40566a(this.f26470b.getString(R.string.CreationMobile_Wiki_Permission_ChangePermission_Title), this.f26470b.getString(R.string.CreationMobile_ECM_PermissionUpdatedDesc), new Runnable(runnable) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$6v2ovPKweaC361mDblOLAczOLq0 */
            public final /* synthetic */ Runnable f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                C9823f.m40571b(this.f$0);
            }
        }, $$Lambda$f$wNjPeMqWMl6_DJnJkcEFWHN9JYw.INSTANCE);
        PermissionAnalyticV2.m39691m();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.MemberChangeListener
    /* renamed from: b */
    public void mo18937b(int i) {
        boolean z = f26468f;
        if (i != 1) {
            AbstractC9827g gVar = (AbstractC9827g) getModel();
            String c = this.f26471c.mo38827c();
            int b = this.f26471c.mo38825b();
            if (i != 2) {
                z = false;
            }
            gVar.mo37333a(c, b, "", new C9825a(this, false, z));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40557a(UserInfo userInfo, View view) {
        mo37345e(userInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m40569b(UserInfo userInfo, View view) {
        mo37343d(userInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m40576c(UserInfo userInfo, View view) {
        mo37341c(userInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m40579d(UserInfo userInfo, View view) {
        mo37339b(userInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m40581e(UserInfo userInfo, View view) {
        m40583g(userInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m40570b(UserInfo userInfo, Runnable runnable) {
        m40555a(userInfo, 1, runnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m40577c(UserInfo userInfo, Runnable runnable) {
        m40555a(userInfo, 4, runnable);
    }

    /* renamed from: a */
    private void m40558a(UserInfo userInfo, Runnable runnable) {
        this.f26482p.mo237937a(((AbstractC9827g) getModel()).mo37330a(this.f26471c.mo38827c(), this.f26471c.mo38825b(), userInfo).mo238001b(new Consumer(runnable, userInfo) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$q3D6qbQmVVDwn7oJFatQlbXJ4Tc */
            public final /* synthetic */ Runnable f$1;
            public final /* synthetic */ UserInfo f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9823f.this.m40563a((C9823f) this.f$1, (Runnable) this.f$2, (UserInfo) ((Boolean) obj));
            }
        }, $$Lambda$f$EbUxL0NnxZaKTxwUu8sTuP0FU.INSTANCE));
    }

    /* renamed from: b */
    public void mo37338b(int i, UserInfo userInfo) {
        if (i == -1) {
            if (userInfo.getOwnerType() == 24) {
                userInfo.setPermission(0);
                this.f26472d.getUserInfoList().set(this.f26478l, userInfo);
                ((AbstractC9751b) getView()).mo37141a(this.f26478l, userInfo);
            } else {
                this.f26472d.getUserInfoList().remove(this.f26478l);
                ((AbstractC9751b) getView()).mo37145a(this.f26472d.getUserInfoList());
                ShareUserInfoResult shareUserInfoResult = this.f26472d;
                shareUserInfoResult.setTotalNum(shareUserInfoResult.getTotalNum() - 1);
                ((AbstractC9751b) getView()).mo37143a(C9706c.m40178a(this.f26470b, this.f26472d.getTotalNum()));
            }
        } else if (i == -2) {
            this.f26471c.mo38826b(false);
            ((AbstractC9827g) getModel()).mo37333a(this.f26471c.mo38827c(), this.f26471c.mo38825b(), "", new C9825a(this, false, f26468f));
        } else {
            if (userInfo.getPermission() > i) {
                userInfo.setPermSource("");
            }
            userInfo.setPermission(i);
            this.f26472d.getUserInfoList().set(this.f26478l, userInfo);
            ((AbstractC9751b) getView()).mo37141a(this.f26478l, userInfo);
        }
        if (i != -2) {
            if (m40585h(userInfo) || !(userInfo.getOwnerType() == 0 || userInfo.getOwnerType() == 1)) {
                m40590k();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m40568b(UserInfo userInfo, DialogInterface dialogInterface, int i) {
        PermissionAnalyticV2.m39602a(userInfo, (boolean) f26468f);
        ((AbstractC9827g) getModel()).mo37332a(this.f26471c.mo38827c(), this.f26471c.mo38825b(), userInfo, new C9826b(this, userInfo, f26468f));
    }

    /* renamed from: a */
    private void m40555a(UserInfo userInfo, int i, Runnable runnable) {
        this.f26482p.mo237937a(((AbstractC9827g) getModel()).mo37329a(this.f26471c.mo38827c(), this.f26471c.mo38825b(), i, userInfo).mo238001b(new Consumer(runnable, userInfo) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$f$hNAEPpqlF_gK_ObBFkj55zgerow */
            public final /* synthetic */ Runnable f$1;
            public final /* synthetic */ UserInfo f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9823f.this.m40573b((C9823f) this.f$1, (Runnable) this.f$2, (UserInfo) ((Boolean) obj));
            }
        }, $$Lambda$f$9agV3VhCOEt2PkJlZx5iVTaVzfE.INSTANCE));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m40573b(Runnable runnable, UserInfo userInfo, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            m40564a(runnable, "reduce_permissions", userInfo);
        } else {
            runnable.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m40574b(Runnable runnable, String str, UserInfo userInfo) {
        runnable.run();
        PermissionAnalyticV2.m39627a(str, (boolean) f26468f, userInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40563a(Runnable runnable, UserInfo userInfo, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            m40564a(runnable, "reduce_collaborators", userInfo);
        } else {
            runnable.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40562a(Runnable runnable, UserInfo userInfo, DialogInterface dialogInterface, int i) {
        if (!this.f26473e) {
            runnable.run();
        } else {
            m40558a(userInfo, runnable);
        }
    }

    C9823f(AbstractC9827g gVar, AbstractC9751b bVar, Fragment fragment, Context context, C10917c cVar, DocPermSetInfo docPermSetInfo, ShareUserInfoResult shareUserInfoResult, String str, int i) {
        super(gVar, bVar);
        boolean z;
        this.f26469a = fragment;
        this.f26470b = context;
        this.f26474g = cVar;
        this.f26471c = docPermSetInfo;
        this.f26472d = shareUserInfoResult;
        this.f26475h = str;
        this.f26479m = i;
        if ((!docPermSetInfo.mo38844q() || !docPermSetInfo.ab()) && !docPermSetInfo.mo38816Y()) {
            z = false;
        } else {
            z = f26468f;
        }
        this.f26473e = z;
    }
}
