package com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9843f;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.FolderPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.d */
public class C9840d extends C7667e implements C9843f.AbstractC9848a {

    /* renamed from: a */
    private final ArrayList<UserInfo> f26503a = new ArrayList<>();

    /* renamed from: b */
    private C10917c f26504b = new C10917c(new C10929e());

    /* renamed from: c */
    private View f26505c;

    /* renamed from: d */
    private FolderPermSetInfo f26506d;

    /* renamed from: e */
    private ShareUserInfoResult f26507e;

    /* renamed from: f */
    private String f26508f;

    /* renamed from: g */
    private C9843f f26509g;

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C9843f fVar = this.f26509g;
        if (fVar != null) {
            fVar.destroy();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9843f.AbstractC9848a
    /* renamed from: a */
    public void mo37426a() {
        C13479a.m54764b("ShareFolderCollaboratorManageFragment", "finish()...");
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    /* renamed from: b */
    private void m40679b() {
        C9843f fVar = new C9843f(getContext(), getActivity(), new C9849g(getContext(), getActivity(), this.f26504b, this.f26505c, this.f26506d, this.f26507e.isHasMore()), new C9841e(this.f26504b, this.f26503a), this, this.f26506d, this.f26507e, this.f26508f);
        this.f26509g = fVar;
        fVar.create();
    }

    /* renamed from: c */
    private void m40680c() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f26503a.clear();
            ShareUserInfoResult shareUserInfoResult = (ShareUserInfoResult) arguments.getParcelable("share_user_result");
            this.f26507e = shareUserInfoResult;
            if (!(shareUserInfoResult == null || shareUserInfoResult.getUserInfoList() == null || this.f26507e.getUserInfoList().size() <= 0)) {
                this.f26503a.addAll(this.f26507e.getUserInfoList());
            }
            FolderPermSetInfo folderPermSetInfo = (FolderPermSetInfo) arguments.getParcelable("permission_doc_info");
            this.f26506d = folderPermSetInfo;
            if (folderPermSetInfo == null) {
                folderPermSetInfo = new FolderPermSetInfo();
            }
            this.f26506d = folderPermSetInfo;
            this.f26508f = arguments.getString("permission_module", "");
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13479a.m54764b("ShareFolderCollaboratorManageFragment", "onCreate()...");
        m40680c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m40679b();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.share_fragment_share_folder_collaborator_manage, viewGroup, false);
        this.f26505c = inflate;
        return inflate;
    }

    /* renamed from: a */
    public static C9840d m40678a(ShareUserInfoResult shareUserInfoResult, FolderPermSetInfo folderPermSetInfo, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("share_user_result", shareUserInfoResult);
        bundle.putParcelable("permission_doc_info", folderPermSetInfo);
        bundle.putString("permission_module", str);
        C9840d dVar = new C9840d();
        dVar.setArguments(bundle);
        return dVar;
    }
}
