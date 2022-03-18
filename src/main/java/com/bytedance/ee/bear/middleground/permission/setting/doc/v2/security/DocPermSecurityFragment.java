package com.bytedance.ee.bear.middleground.permission.setting.doc.v2.security;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\u001a\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/security/DocPermSecurityFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "presenter", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/security/DocPermSecurityPresenter;", "initMVP", "", "rootView", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c.a */
public final class DocPermSecurityFragment extends C7667e {

    /* renamed from: a */
    public static final Companion f27013a = new Companion(null);

    /* renamed from: b */
    private DocPermSetInfo f27014b = new DocPermSetInfo(null, 0, null, false, null, null, null, false, false, false, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);

    /* renamed from: c */
    private DocPermSecurityPresenter f27015c;

    /* renamed from: d */
    private HashMap f27016d;

    /* renamed from: a */
    public void mo38218a() {
        HashMap hashMap = this.f27016d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/security/DocPermSecurityFragment$Companion;", "", "()V", "EXTRA_PERM_SET_INFO", "", "newInstance", "Landroidx/fragment/app/Fragment;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fragment mo38219a(DocPermSetInfo docPermSetInfo) {
            Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_perm_set_info", docPermSetInfo);
            DocPermSecurityFragment aVar = new DocPermSecurityFragment();
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        DocPermSecurityPresenter cVar = this.f27015c;
        if (cVar != null) {
            cVar.destroy();
        }
        mo38218a();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        DocPermSetInfo docPermSetInfo;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            docPermSetInfo = (DocPermSetInfo) arguments.getParcelable("extra_perm_set_info");
        } else {
            docPermSetInfo = null;
        }
        if (docPermSetInfo != null) {
            this.f27014b = docPermSetInfo;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo");
    }

    /* renamed from: a */
    private final void m41561a(View view) {
        DocPermSecurityView dVar;
        DocPermSecurityModel bVar = new DocPermSecurityModel(this.f27014b.mo38827c(), this.f27014b.mo38825b());
        boolean ab = this.f27014b.ab();
        if (!this.f27014b.mo38844q() || !ab) {
            dVar = new DocPermSecurityView(view, this.f27014b);
        } else {
            dVar = new WikiPermSecurityView(view, this.f27014b);
        }
        DocPermSecurityPresenter cVar = new DocPermSecurityPresenter(bVar, dVar, this, this.f27014b);
        this.f27015c = cVar;
        if (cVar != null) {
            cVar.create();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m41561a(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.permission_doc_perm_set_security_fragment, viewGroup, false);
    }
}
