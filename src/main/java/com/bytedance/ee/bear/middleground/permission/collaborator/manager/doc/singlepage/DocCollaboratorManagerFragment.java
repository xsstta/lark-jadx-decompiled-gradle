package com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0018\u001a\u00020\tH\u0016J\u001a\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/IDocCollaboratorManagerDependency;", "()V", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "presenter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerPresenter;", "checkLockState", "", "initMVP", "rootView", "Landroid/view/View;", "isShowSinglePageTab", "", "notifyUpdateTitle", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "setSinglePageTabVisible", "show", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.b */
public final class DocCollaboratorManagerFragment extends C7667e implements IDocCollaboratorManagerDependency {

    /* renamed from: a */
    public static final Companion f26312a = new Companion(null);

    /* renamed from: b */
    private DocPermSetInfo f26313b = new DocPermSetInfo(null, 0, null, false, null, null, null, false, false, false, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);

    /* renamed from: c */
    private DocCollaboratorManagerPresenter f26314c;

    /* renamed from: d */
    private HashMap f26315d;

    @JvmStatic
    /* renamed from: a */
    public static final Fragment m40377a(DocPermSetInfo docPermSetInfo) {
        return f26312a.mo37235a(docPermSetInfo);
    }

    /* renamed from: d */
    public void mo37234d() {
        HashMap hashMap = this.f26315d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerFragment$Companion;", "", "()V", "EXTRA_PERM_SET_INFO", "", "newInstance", "Landroidx/fragment/app/Fragment;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Fragment mo37235a(DocPermSetInfo docPermSetInfo) {
            Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_perm_set_info", docPermSetInfo);
            DocCollaboratorManagerFragment bVar = new DocCollaboratorManagerFragment();
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.IDocCollaboratorManagerDependency
    /* renamed from: a */
    public void mo37230a() {
        DocCollaboratorManagerPresenter dVar = this.f26314c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        dVar.mo37240f();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.IDocCollaboratorManagerDependency
    /* renamed from: b */
    public void mo37232b() {
        DocCollaboratorManagerPresenter dVar = this.f26314c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        dVar.mo37241g();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.IDocCollaboratorManagerDependency
    /* renamed from: c */
    public boolean mo37233c() {
        DocCollaboratorManagerPresenter dVar = this.f26314c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return dVar.mo37242h();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        DocCollaboratorManagerPresenter dVar = this.f26314c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        dVar.destroy();
        mo37234d();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.IDocCollaboratorManagerDependency
    /* renamed from: a */
    public void mo37231a(boolean z) {
        DocCollaboratorManagerPresenter dVar = this.f26314c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        dVar.mo37236a(z);
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            DocPermSetInfo docPermSetInfo = (DocPermSetInfo) arguments.getParcelable("extra_perm_set_info");
            if (docPermSetInfo == null) {
                docPermSetInfo = this.f26313b;
            }
            this.f26313b = docPermSetInfo;
        }
    }

    /* renamed from: a */
    private final void m40378a(View view) {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        DocCollaboratorManagerPresenter dVar = new DocCollaboratorManagerPresenter(new DocCollaboratorManagerModel(this.f26313b.mo38827c(), this.f26313b.mo38825b()), new DocCollaboratorManagerView(this, view, this.f26313b), requireActivity, this.f26313b);
        this.f26314c = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        dVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m40378a(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.permission_doc_collaborator_manager_fragment, viewGroup, false);
    }
}
