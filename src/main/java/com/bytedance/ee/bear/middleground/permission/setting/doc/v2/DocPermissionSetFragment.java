package com.bytedance.ee.bear.middleground.permission.setting.doc.v2;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13616d;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\u001a\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "presenter", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetPresenter;", "getDefaultTrigger", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/IDocPermissionSetPageTrigger;", "initMVP", "", "rootView", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.a */
public final class DocPermissionSetFragment extends C7667e {

    /* renamed from: a */
    public static final Companion f26930a = new Companion(null);

    /* renamed from: b */
    private DocPermSetInfo f26931b = new DocPermSetInfo(null, 0, null, false, null, null, null, false, false, false, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);

    /* renamed from: c */
    private DocPermissionSetPresenter f26932c;

    /* renamed from: d */
    private HashMap f26933d;

    @JvmStatic
    /* renamed from: a */
    public static final Fragment m41452a(DocPermSetInfo docPermSetInfo) {
        return f26930a.mo38159a(docPermSetInfo);
    }

    /* renamed from: a */
    public void mo38158a() {
        HashMap hashMap = this.f26933d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetFragment$Companion;", "", "()V", "EXTRA_PERM_SET_INFO", "", "TAG", "newInstance", "Landroidx/fragment/app/Fragment;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Fragment mo38159a(DocPermSetInfo docPermSetInfo) {
            Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_perm_set_info", docPermSetInfo);
            DocPermissionSetFragment aVar = new DocPermissionSetFragment();
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetFragment$getDefaultTrigger$1", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/IDocPermissionSetPageTrigger;", "triggerToCommentPage", "", "triggerToManagerCollaboratorPage", "triggerToSecurityPage", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.a$b */
    public static final class C9962b implements IDocPermissionSetPageTrigger {
        C9962b() {
        }

        @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.IDocPermissionSetPageTrigger
        /* renamed from: a */
        public void mo38125a() {
            if (!C13616d.m55261a()) {
                C13479a.m54758a("DocPermissionSetFragment", "triggerToManagerCollaboratorPage()... use default impl");
                return;
            }
            throw new RuntimeException("IDocPermissionSetPageTrigger must not use default impl");
        }

        @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.IDocPermissionSetPageTrigger
        /* renamed from: b */
        public void mo38127b() {
            if (!C13616d.m55261a()) {
                C13479a.m54758a("DocPermissionSetFragment", "triggerToSecurityPage()... use default impl");
                return;
            }
            throw new RuntimeException("IDocPermissionSetPageTrigger must not use default impl");
        }

        @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.IDocPermissionSetPageTrigger
        /* renamed from: c */
        public void mo38128c() {
            if (!C13616d.m55261a()) {
                C13479a.m54758a("DocPermissionSetFragment", "triggerToCommentPage()... use default impl");
                return;
            }
            throw new RuntimeException("IDocPermissionSetPageTrigger must not use default impl");
        }
    }

    /* renamed from: b */
    private final IDocPermissionSetPageTrigger m41454b() {
        return new C9962b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        DocPermissionSetPresenter cVar = this.f26932c;
        if (cVar != null) {
            cVar.destroy();
        }
        mo38158a();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Parcelable parcelable = arguments.getParcelable("extra_perm_set_info");
            if (parcelable != null) {
                this.f26931b = (DocPermSetInfo) parcelable;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo");
        }
    }

    /* renamed from: a */
    private final void m41453a(View view) {
        DocPermissionSetView dVar;
        IDocPermissionSetPageTrigger iVar;
        DocPermissionSetModel bVar = new DocPermissionSetModel(this.f26931b.mo38827c(), this.f26931b.mo38825b());
        boolean ab = this.f26931b.ab();
        C13479a.m54764b("DocPermissionSetFragment", "initMVP()...isWikiV2Enable = " + ab);
        if (!this.f26931b.mo38844q() || !ab) {
            dVar = new DocPermissionSetView(view, this.f26931b);
        } else {
            dVar = new WikiPermSetView(view, this.f26931b);
        }
        if (getActivity() instanceof IDocPermissionSetPageTrigger) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                iVar = (IDocPermissionSetPageTrigger) activity;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.permission.setting.doc.v2.IDocPermissionSetPageTrigger");
            }
        } else {
            iVar = m41454b();
        }
        DocPermissionSetPresenter cVar = new DocPermissionSetPresenter(this, bVar, dVar, this.f26931b, iVar);
        this.f26932c = cVar;
        if (cVar != null) {
            cVar.create();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m41453a(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.permission_doc_perm_set_root_fragment, viewGroup, false);
    }
}
