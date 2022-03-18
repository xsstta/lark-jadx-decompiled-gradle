package com.ss.android.lark.filedetail.impl.folder.manage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.breadcrumb.UDBreadcrumb;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;

public final class FolderManageView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FolderManageView f98154a;

    @Override // butterknife.Unbinder
    public void unbind() {
        FolderManageView folderManageView = this.f98154a;
        if (folderManageView != null) {
            this.f98154a = null;
            folderManageView.mTitleBar = null;
            folderManageView.mSearchEt = null;
            folderManageView.mBreadCrumb = null;
            folderManageView.mSingleFolderNameTv = null;
            folderManageView.mFileListRv = null;
            folderManageView.mPtrView = null;
            folderManageView.mContentLayout = null;
            folderManageView.mLoadingLayout = null;
            folderManageView.mEmptyLayout = null;
            folderManageView.mEmptyIv = null;
            folderManageView.mEmptyHint = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FolderManageView_ViewBinding(FolderManageView folderManageView, View view) {
        this.f98154a = folderManageView;
        folderManageView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        folderManageView.mSearchEt = (EditText) Utils.findRequiredViewAsType(view, R.id.search_et, "field 'mSearchEt'", EditText.class);
        folderManageView.mBreadCrumb = (UDBreadcrumb) Utils.findRequiredViewAsType(view, R.id.folder_name_list, "field 'mBreadCrumb'", UDBreadcrumb.class);
        folderManageView.mSingleFolderNameTv = (TextView) Utils.findRequiredViewAsType(view, R.id.parent_folder_name_tv, "field 'mSingleFolderNameTv'", TextView.class);
        folderManageView.mFileListRv = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.file_info_list_rv, "field 'mFileListRv'", RecyclerView.class);
        folderManageView.mPtrView = (LKUIPtrClassicFrameLayout) Utils.findRequiredViewAsType(view, R.id.ptr_view, "field 'mPtrView'", LKUIPtrClassicFrameLayout.class);
        folderManageView.mContentLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.content_layout, "field 'mContentLayout'", ViewGroup.class);
        folderManageView.mLoadingLayout = Utils.findRequiredView(view, R.id.fetch_loading, "field 'mLoadingLayout'");
        folderManageView.mEmptyLayout = Utils.findRequiredView(view, R.id.fetch_result_empty, "field 'mEmptyLayout'");
        folderManageView.mEmptyIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.empty_iv, "field 'mEmptyIv'", ImageView.class);
        folderManageView.mEmptyHint = (TextView) Utils.findRequiredViewAsType(view, R.id.empty_hint, "field 'mEmptyHint'", TextView.class);
    }
}
