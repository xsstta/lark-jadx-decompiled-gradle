package com.ss.android.lark.filedetail.impl.folder.manage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FileState;
import com.ss.android.lark.filedetail.FileDetailModule;
import com.ss.android.lark.filedetail.dto.FileDetailLaunchParams;
import com.ss.android.lark.filedetail.dto.FolderManageLaunchParams;
import com.ss.android.lark.filedetail.impl.detail.FileDetailController;
import com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView;
import com.ss.android.lark.filedetail.impl.folder.manage.entity.FilePreviewInfo;
import com.ss.android.lark.filedetail.p1885a.AbstractC38197a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0006\u0010\t\u001a\u00020\nJ&\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManageFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mPresenter", "Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManagePresenter;", "mRootView", "Landroid/view/View;", "getLaunchParams", "Lcom/ss/android/lark/filedetail/dto/FolderManageLaunchParams;", "onBackPressed", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "ViewDependency", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.a */
public final class FolderManageFragment extends BaseFragment {

    /* renamed from: a */
    public View f98155a;

    /* renamed from: b */
    private FolderManagePresenter f98156b;

    /* renamed from: c */
    private HashMap f98157c;

    /* renamed from: b */
    public void mo139880b() {
        HashMap hashMap = this.f98157c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo139880b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J0\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0012\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManageFragment$ViewDependency;", "Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManageView$IViewDependency;", "(Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManageFragment;)V", "goFileDetailPage", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FilePreviewInfo;", "params", "Lcom/ss/android/lark/filedetail/dto/FolderManageLaunchParams;", "goShareFileCopySelectPage", "fileKey", "", "fileName", "size", "", "isFolder", "", "messageId", "goToSearchPage", "chatId", "gotoLastPage", "injectView", "view", "Lcom/ss/android/lark/filedetail/impl/folder/manage/IView;", "openChatById", "position", "", "openThread", "threadId", "threadPosition", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.a$a */
    private final class ViewDependency implements FolderManageView.IViewDependency {
        @Override // com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView.IViewDependency
        /* renamed from: a */
        public void mo139867a() {
            FolderManageFragment.this.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDependency() {
        }

        @Override // com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView.IViewDependency
        /* renamed from: a */
        public void mo139868a(IView eVar) {
            View view;
            if (eVar != null && (view = FolderManageFragment.this.f98155a) != null) {
                ButterKnife.bind(eVar, view);
            }
        }

        @Override // com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView.IViewDependency
        /* renamed from: a */
        public void mo139870a(String str) {
            AbstractC38197a.AbstractC38207j searchDependency;
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
            if (a != null && (searchDependency = a.getSearchDependency()) != null) {
                searchDependency.mo139630a(FolderManageFragment.this.getContext(), str);
            }
        }

        @Override // com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView.IViewDependency
        /* renamed from: b */
        public void mo139873b(String str, int i) {
            AbstractC38197a.AbstractC38199b chatDependency;
            Intrinsics.checkParameterIsNotNull(str, "threadId");
            AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
            if (a != null && (chatDependency = a.getChatDependency()) != null) {
                chatDependency.mo139600a(FolderManageFragment.this.getContext(), str, i);
            }
        }

        @Override // com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView.IViewDependency
        /* renamed from: a */
        public void mo139871a(String str, int i) {
            AbstractC38197a a;
            AbstractC38197a.AbstractC38199b chatDependency;
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            if (i != -1 && (a = FileDetailModule.f97880b.mo139564a()) != null && (chatDependency = a.getChatDependency()) != null) {
                chatDependency.mo139601a(FolderManageFragment.this.getActivity(), str, "FolderManageActivity", i);
            }
        }

        @Override // com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView.IViewDependency
        /* renamed from: a */
        public void mo139869a(FilePreviewInfo aVar, FolderManageLaunchParams folderManageLaunchParams) {
            boolean z;
            FileState fileState;
            int i;
            boolean z2;
            boolean z3;
            Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Intrinsics.checkParameterIsNotNull(folderManageLaunchParams, "params");
            FileContent fileContent = new FileContent();
            fileContent.setName(aVar.mo139968c());
            fileContent.setKey(aVar.mo139966a());
            fileContent.setFilePath(aVar.mo139973g());
            if (aVar.mo139973g().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                fileState = FileState.DOWNLOAD;
            } else {
                fileState = FileState.DONE;
            }
            fileContent.setFileState(fileState);
            String c = C26311p.m95283c(aVar.mo139968c());
            Intrinsics.checkExpressionValueIsNotNull(c, "FileUtils.getMIMEType(data.name)");
            fileContent.setMime(c);
            fileContent.setSize(aVar.mo139969d());
            switch (folderManageLaunchParams.mo139689e()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 9:
                    i = 1;
                    break;
                case 4:
                    i = 6;
                    break;
                case 5:
                default:
                    i = 0;
                    break;
                case 6:
                    i = 5;
                    break;
                case 7:
                    i = 3;
                    break;
                case 8:
                    i = 4;
                    break;
            }
            if (folderManageLaunchParams.mo139691f() == 3) {
                i = 7;
            }
            if (folderManageLaunchParams.mo139689e() == 8) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (folderManageLaunchParams.mo139689e() != 5) {
                z3 = true;
            } else {
                z3 = false;
            }
            Context requireContext = FolderManageFragment.this.requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            FileDetailLaunchParams.Builder a = new FileDetailLaunchParams.Builder(requireContext, fileContent, folderManageLaunchParams.mo139672a()).mo139657a(folderManageLaunchParams.mo139679b()).mo139654a((long) i).mo139653a(folderManageLaunchParams.mo139682c());
            String i2 = folderManageLaunchParams.mo139696i();
            String str = "";
            if (i2 == null) {
                i2 = str;
            }
            FileDetailLaunchParams.Builder b = a.mo139661b(i2);
            String j = folderManageLaunchParams.mo139697j();
            if (j != null) {
                str = j;
            }
            FileDetailLaunchParams.Builder h = b.mo139663c(str).mo139662b(z2).mo139664c(folderManageLaunchParams.mo139687d()).mo139660b(folderManageLaunchParams.mo139691f()).mo139668f(false).mo139666d(false).mo139667e(z3).mo139670h(true);
            FavoriteMessageInfo n = folderManageLaunchParams.mo139701n();
            if (n != null) {
                Message sourceMessage = n.getSourceMessage();
                Intrinsics.checkExpressionValueIsNotNull(sourceMessage, "it.sourceMessage");
                h.mo139656a(sourceMessage).mo139655a(n);
            }
            FileDetailController.f98037a.mo139811a(h.mo139659a());
        }

        @Override // com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView.IViewDependency
        /* renamed from: a */
        public void mo139872a(String str, String str2, long j, boolean z, String str3) {
            AbstractC38197a.AbstractC38205h forwardDependency;
            Intrinsics.checkParameterIsNotNull(str, "fileKey");
            Intrinsics.checkParameterIsNotNull(str2, "fileName");
            Intrinsics.checkParameterIsNotNull(str3, "messageId");
            AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
            if (a != null && (forwardDependency = a.getForwardDependency()) != null) {
                forwardDependency.mo139627a(FolderManageFragment.this.getActivity(), str, str2, j, z, str3);
            }
        }
    }

    /* renamed from: a */
    public final void mo139879a() {
        FolderManagePresenter cVar = this.f98156b;
        if (cVar != null) {
            cVar.mo139920c();
        }
    }

    /* renamed from: c */
    private final FolderManageLaunchParams m150468c() {
        FolderManageLaunchParams folderManageLaunchParams;
        boolean z;
        boolean z2;
        Bundle arguments = getArguments();
        if (!(arguments == null || (folderManageLaunchParams = (FolderManageLaunchParams) arguments.getParcelable("extra.launch.params")) == null)) {
            Intrinsics.checkExpressionValueIsNotNull(folderManageLaunchParams, "arguments?.getParcelable…CH_PARAMS) ?: return null");
            boolean z3 = true;
            if (folderManageLaunchParams.mo139672a().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (folderManageLaunchParams.mo139695h().length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    if (folderManageLaunchParams.mo139693g().length() != 0) {
                        z3 = false;
                    }
                    if (z3) {
                        return null;
                    }
                    return folderManageLaunchParams;
                }
            }
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (this.f98155a == null || getContext() == null) {
            finish();
            return;
        }
        FolderManageLaunchParams c = m150468c();
        if (c == null) {
            finish();
            return;
        }
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        FolderManagePresenter cVar = new FolderManagePresenter(requireContext, new ViewDependency(), c);
        this.f98156b = cVar;
        if (cVar != null) {
            cVar.create();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.activity_folder_view, viewGroup, false);
        this.f98155a = inflate;
        return inflate;
    }
}
