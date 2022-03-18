package com.bytedance.ee.bear.drive.view.preview.wrapper;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.drive.biz.external.C6418d;
import com.bytedance.ee.bear.drive.biz.preview.vc.C6738g;
import com.larksuite.suite.R;

public class ApkPreviewView extends AbsPreviewView {
    private C7550b mPlaceHolderViewWrapper;

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onBackPressed() {
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public View getView() {
        return this.mPlaceHolderViewWrapper.mo29469a();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void show() {
        trackOpenStart();
        this.mPlaceHolderViewWrapper.mo29470b();
        trackOpenSuccess("apk_view");
        if (this.mPreviewViewModel != null) {
            this.mPreviewViewModel.liveInnerFileNameChanged().mo5923a(this.mViewOwner.lifecycleOwner(), new AbstractC1178x() {
                /* class com.bytedance.ee.bear.drive.view.preview.wrapper.$$Lambda$ApkPreviewView$Q9oJ12RssHtRY5H223bzxXZ2W1g */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    ApkPreviewView.this.lambda$show$0$ApkPreviewView((String) obj);
                }
            });
        }
    }

    private void initPlaceHolderView() {
        PlaceHolderView placeHolderView = new PlaceHolderView(this.mContext);
        placeHolderView.setImagePlaceHolder(R.drawable.ud_icon_file_round_android_colorful);
        placeHolderView.setTipsText(this.mFileModel.mo29480c());
        placeHolderView.setSizeInBytes(this.mFileModel.mo29488g());
        placeHolderView.setBtnText(this.mContext.getString(R.string.Drive_Drive_InstallApk));
        this.mPlaceHolderViewWrapper = new C7550b(this.mContext, placeHolderView, C6418d.m25763a(this.mPreviewViewModel.getBizType(), this.mContext, this.mServiceContext), this.mViewOwner, this.mFileModel);
    }

    public /* synthetic */ void lambda$show$0$ApkPreviewView(String str) {
        this.mFileModel.mo29481c(str);
        this.mPlaceHolderViewWrapper.mo29469a().setTipsText(this.mFileModel.mo29480c());
    }

    public ApkPreviewView(ViewOwner viewOwner, Context context, C7553d dVar, C6738g gVar) {
        super(viewOwner, context, dVar, gVar);
        initPlaceHolderView();
    }
}
