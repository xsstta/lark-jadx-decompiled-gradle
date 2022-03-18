package com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.doc.isv.template;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9638a;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.doc.DocInviteMemberManagerView;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.larksuite.suite.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/doc/isv/template/TemplateInviteMemberManagerView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/doc/DocInviteMemberManagerView;", "context", "Landroid/content/Context;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "view", "Landroid/view/View;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "(Landroid/content/Context;Lcom/bytedance/ee/bear/service/ServiceContext;Landroid/view/View;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;)V", "getContext", "()Landroid/content/Context;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "getAdapter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/BaseInviteCollaboratorManageAdapter;", "getInviteBtnTextId", "", "setNotesInput", "", "visible", "", "showInviteSuccessToast", "showNotifyTipsIfNeed", "updateBannerVisible", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c.a.a.c */
public class TemplateInviteMemberManagerView extends DocInviteMemberManagerView {

    /* renamed from: k */
    private final Context f25992k;

    /* renamed from: l */
    private final C10917c f25993l;

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerView
    /* renamed from: d */
    public int mo36893d() {
        return R.string.Doc_Facade_Share;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerView
    /* renamed from: r */
    public boolean mo36884r() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerView, com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView
    /* renamed from: n */
    public void mo36883n() {
        mo36894e();
        mo36895f();
        mo36896g();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerView, com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView
    /* renamed from: m */
    public void mo36902m() {
        String string = this.f25992k.getString(R.string.Doc_List_ShareCustomTempSuccess);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…t_ShareCustomTempSuccess)");
        Toast.showSuccessText(this.f25992k, string);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.doc.DocInviteMemberManagerView, com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerView
    /* renamed from: c */
    public C9638a mo36882c() {
        Locale d = C4484g.m18494b().mo17253d();
        Intrinsics.checkExpressionValueIsNotNull(d, "SdkLocaleServiceWrapper.…nstance().provideLocale()");
        return new C9666a(d, ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerView
    /* renamed from: a */
    public void mo36881a(boolean z) {
        super.mo36881a(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TemplateInviteMemberManagerView(Context context, C10917c cVar, View view, DocPermSetInfo docPermSetInfo) {
        super(context, cVar, view, docPermSetInfo);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.f25992k = context;
        this.f25993l = cVar;
        TextView textView = (TextView) view.findViewById(R.id.titleTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.titleTv");
        textView.setText(context.getText(R.string.Doc_List_ShareTemplTitle));
    }
}
