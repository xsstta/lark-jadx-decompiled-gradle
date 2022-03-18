package com.ss.android.lark.filedetail.impl;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class FileDetailFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FileDetailFragment f98019a;

    @Override // butterknife.Unbinder
    public void unbind() {
        FileDetailFragment fileDetailFragment = this.f98019a;
        if (fileDetailFragment != null) {
            this.f98019a = null;
            fileDetailFragment.mRootView = null;
            fileDetailFragment.vTitleBar = null;
            fileDetailFragment.vBtnFunction = null;
            fileDetailFragment.vImageFileIcon = null;
            fileDetailFragment.vTextFileName = null;
            fileDetailFragment.mCloseIv = null;
            fileDetailFragment.vLayoutProgress = null;
            fileDetailFragment.vProgressBar = null;
            fileDetailFragment.mTipsTv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FileDetailFragment_ViewBinding(FileDetailFragment fileDetailFragment, View view) {
        this.f98019a = fileDetailFragment;
        fileDetailFragment.mRootView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.root_view, "field 'mRootView'", ViewGroup.class);
        fileDetailFragment.vTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar_file_detail, "field 'vTitleBar'", CommonTitleBar.class);
        fileDetailFragment.vBtnFunction = (TextView) Utils.findRequiredViewAsType(view, R.id.btn_file_download, "field 'vBtnFunction'", TextView.class);
        fileDetailFragment.vImageFileIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.image_file_icon, "field 'vImageFileIcon'", ImageView.class);
        fileDetailFragment.vTextFileName = (TextView) Utils.findRequiredViewAsType(view, R.id.text_file_name, "field 'vTextFileName'", TextView.class);
        fileDetailFragment.mCloseIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.btn_file_progress_close, "field 'mCloseIv'", ImageView.class);
        fileDetailFragment.vLayoutProgress = Utils.findRequiredView(view, R.id.layout_file_progress, "field 'vLayoutProgress'");
        fileDetailFragment.vProgressBar = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.progressbar, "field 'vProgressBar'", ProgressBar.class);
        fileDetailFragment.mTipsTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tips_tv, "field 'mTipsTv'", TextView.class);
    }
}
