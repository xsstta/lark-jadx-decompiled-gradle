package com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar;

import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteMemberParams;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar.ITopbarContract;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0002\u001c\u001dB7\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0014J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/TopbarPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/ITopbarContract$IModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/ITopbarContract$IView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/ITopbarContract$IView$IDelegate;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/SelectedUserChangeListener;", "topbarModel", "topbarView", "dependency", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/TopbarPresenter$IDependency;", "keywordChangeListener", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/KeywordChangeListener;", "params", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;", "from", "", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/ITopbarContract$IModel;Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/ITopbarContract$IView;Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/TopbarPresenter$IDependency;Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/KeywordChangeListener;Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;I)V", "create", "", "createViewDelegate", "destroy", "onAddUser", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "onRemoveUser", "reportClickSearchBar", "hasFocus", "", "IDependency", "ViewDelegate", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.b.e */
public final class TopbarPresenter extends BasePresenter<ITopbarContract.IModel, ITopbarContract.IView, ITopbarContract.IView.IDelegate> implements SelectedUserChangeListener {

    /* renamed from: a */
    public final ITopbarContract.IModel f26617a;

    /* renamed from: b */
    public final IDependency f26618b;

    /* renamed from: c */
    public final KeywordChangeListener f26619c;

    /* renamed from: d */
    public final InviteMemberParams f26620d;

    /* renamed from: e */
    public final int f26621e;

    /* renamed from: f */
    private final ITopbarContract.IView f26622f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/TopbarPresenter$IDependency;", "", "onBack", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.b.e$a */
    public interface IDependency {
        /* renamed from: a */
        void mo37507a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ITopbarContract.IView.IDelegate createViewDelegate() {
        return new ViewDelegate();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f26617a.mo37495b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/TopbarPresenter$ViewDelegate;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/ITopbarContract$IView$IDelegate;", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/TopbarPresenter;)V", "onBackClicked", "", "onClearQueryClick", "onFocusChanged", "hasFocus", "", "onKeywordChange", "keyword", "", "onSearchClick", "onSelectedItemClicked", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.b.e$b */
    public final class ViewDelegate implements ITopbarContract.IView.IDelegate {
        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar.ITopbarContract.IView.IDelegate
        /* renamed from: b */
        public void mo37505b() {
            PermissionAnalyticV2.m39666d(TopbarPresenter.this.f26620d.mo36834a(), TopbarPresenter.this.f26620d.mo36835b(), TopbarPresenter.this.f26620d.mo36837d(), TopbarPresenter.this.f26620d.mo36843h());
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar.ITopbarContract.IView.IDelegate
        /* renamed from: a */
        public void mo37501a() {
            if (TopbarPresenter.this.f26621e == 0) {
                PermissionAnalyticV2.m39608a(TopbarPresenter.this.f26620d.mo36834a(), TopbarPresenter.this.f26620d.mo36835b(), TopbarPresenter.this.f26620d.mo36837d(), TopbarPresenter.this.f26620d.mo36843h());
            } else if (TopbarPresenter.this.f26621e == 1) {
                PermissionAnalyticV2.m39680h(TopbarPresenter.this.f26620d.mo36834a(), TopbarPresenter.this.f26620d.mo36835b(), TopbarPresenter.this.f26620d.mo36837d(), TopbarPresenter.this.f26620d.mo36843h());
            }
            TopbarPresenter.this.f26618b.mo37507a();
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar.ITopbarContract.IView.IDelegate
        /* renamed from: c */
        public void mo37506c() {
            if (TopbarPresenter.this.f26621e == 0) {
                PermissionAnalyticV2.m39656c(TopbarPresenter.this.f26620d.mo36834a(), TopbarPresenter.this.f26620d.mo36835b(), TopbarPresenter.this.f26620d.mo36837d(), TopbarPresenter.this.f26620d.mo36843h());
            } else if (TopbarPresenter.this.f26621e == 1) {
                PermissionAnalyticV2.m39683i(TopbarPresenter.this.f26620d.mo36834a(), TopbarPresenter.this.f26620d.mo36835b(), TopbarPresenter.this.f26620d.mo36837d(), TopbarPresenter.this.f26620d.mo36843h());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar.ITopbarContract.IView.IDelegate
        /* renamed from: a */
        public void mo37504a(boolean z) {
            TopbarPresenter.this.mo37511a(z);
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar.ITopbarContract.IView.IDelegate
        /* renamed from: a */
        public void mo37502a(UserInfo userInfo) {
            Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
            TopbarPresenter.this.f26617a.mo37494a(userInfo);
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar.ITopbarContract.IView.IDelegate
        /* renamed from: a */
        public void mo37503a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "keyword");
            KeywordChangeListener bVar = TopbarPresenter.this.f26619c;
            if (bVar != null) {
                bVar.mo37469a(str);
            }
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f26617a.mo37493a(this);
        if (this.f26617a.mo37492a().size() > 0) {
            ArrayList<UserInfo> arrayList = new ArrayList<>();
            Iterator<T> it = this.f26617a.mo37492a().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            this.f26622f.mo37498a(arrayList);
            this.f26622f.mo37496a();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener
    /* renamed from: a */
    public void mo37126a(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        if (this.f26617a.mo37492a().size() > 0) {
            this.f26622f.mo37496a();
        }
        this.f26622f.mo37497a(userInfo);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener
    /* renamed from: b */
    public void mo37127b(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        if (this.f26617a.mo37492a().size() == 0) {
            this.f26622f.mo37499b();
        }
        this.f26622f.mo37500b(userInfo);
    }

    /* renamed from: a */
    public final void mo37511a(boolean z) {
        if (z) {
            PermissionAnalytic.m39401a(new DocPermSetInfo(null, 0, null, false, null, null, null, false, false, false, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null), "click_invite_search_bar", (Map<String, String>) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopbarPresenter(ITopbarContract.IModel aVar, ITopbarContract.IView bVar, IDependency aVar2, KeywordChangeListener bVar2, InviteMemberParams inviteMemberParams, int i) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "topbarModel");
        Intrinsics.checkParameterIsNotNull(bVar, "topbarView");
        Intrinsics.checkParameterIsNotNull(aVar2, "dependency");
        Intrinsics.checkParameterIsNotNull(inviteMemberParams, "params");
        this.f26617a = aVar;
        this.f26622f = bVar;
        this.f26618b = aVar2;
        this.f26619c = bVar2;
        this.f26620d = inviteMemberParams;
        this.f26621e = i;
    }
}
