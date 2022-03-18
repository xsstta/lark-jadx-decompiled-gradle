package com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0016J\u001a\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorSubFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/IDocCollaboratorSubViewController;", "()V", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "permType", "", "presenter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorSubPresenter;", "initMVP", "", "rootView", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "setDescVisible", "visible", "", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.g */
public final class DocCollaboratorSubFragment extends Fragment implements IDocCollaboratorSubViewController {

    /* renamed from: a */
    public static final Companion f26346a = new Companion(null);

    /* renamed from: b */
    private int f26347b = 1;

    /* renamed from: c */
    private DocPermSetInfo f26348c = new DocPermSetInfo(null, 0, null, false, null, null, null, false, false, false, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);

    /* renamed from: d */
    private DocCollaboratorSubPresenter f26349d;

    /* renamed from: e */
    private HashMap f26350e;

    /* renamed from: a */
    public void mo37270a() {
        HashMap hashMap = this.f26350e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorSubFragment$Companion;", "", "()V", "EXTRA_PERM_SET_INFO", "", "EXTRA_PERM_TYPE", "newInstance", "Landroidx/fragment/app/Fragment;", "permType", "", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fragment mo37272a(int i, DocPermSetInfo docPermSetInfo) {
            Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
            Bundle bundle = new Bundle();
            bundle.putInt("extra_perm_type", i);
            bundle.putParcelable("extra_perm_set_info", docPermSetInfo);
            DocCollaboratorSubFragment gVar = new DocCollaboratorSubFragment();
            gVar.setArguments(bundle);
            return gVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        DocCollaboratorSubPresenter iVar = this.f26349d;
        if (iVar != null) {
            iVar.destroy();
        }
        mo37270a();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.IDocCollaboratorSubViewController
    /* renamed from: a */
    public void mo37271a(boolean z) {
        DocCollaboratorSubPresenter iVar = this.f26349d;
        if (iVar != null) {
            iVar.mo37285b(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f26347b = arguments.getInt("extra_perm_type");
            DocPermSetInfo docPermSetInfo = (DocPermSetInfo) arguments.getParcelable("extra_perm_set_info");
            if (docPermSetInfo == null) {
                docPermSetInfo = this.f26348c;
            }
            this.f26348c = docPermSetInfo;
        }
    }

    /* renamed from: a */
    private final void m40439a(View view) {
        DocCollaboratorSubModel hVar = new DocCollaboratorSubModel(this.f26348c.mo38827c(), this.f26348c.mo38825b(), this.f26347b);
        DocCollaboratorSubView jVar = new DocCollaboratorSubView(this, view, this.f26348c, this.f26347b);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
            DocCollaboratorSubPresenter iVar = new DocCollaboratorSubPresenter(hVar, jVar, requireActivity, (IDocCollaboratorManagerDependency) parentFragment, this.f26348c, this.f26347b);
            this.f26349d = iVar;
            if (iVar != null) {
                iVar.create();
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.IDocCollaboratorManagerDependency");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m40439a(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.permission_doc_collaborator_list_fragment, viewGroup, false);
    }
}
