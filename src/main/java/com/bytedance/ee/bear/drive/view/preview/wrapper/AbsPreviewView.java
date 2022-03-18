package com.bytedance.ee.bear.drive.view.preview.wrapper;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.drive.biz.comment.area.CommentRectF;
import com.bytedance.ee.bear.drive.biz.preview.show.C6712a;
import com.bytedance.ee.bear.drive.biz.preview.vc.C6738g;
import com.bytedance.ee.bear.drive.biz.preview.viewfinder.DriveViewFinderVM;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.report.C7128a;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.drive.view.preview.AbstractC7256c;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class AbsPreviewView implements AbstractC7549a {
    protected Context mContext;
    protected C7130c mDriveReport;
    public C7553d mFileModel;
    public C7555f mPreviewViewModel;
    protected C10917c mServiceContext = ar.m20936a();
    protected AbstractC7256c mShowViewTrackEventCallback;
    protected int mSourceType;
    protected C6738g mVCFollowManager;
    protected ViewOwner mViewOwner;

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    /* renamed from: a */
    public /* synthetic */ void mo28370a(Configuration configuration) {
        AbstractC7549a.CC.$default$a(this, configuration);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public String getCommentQuote() {
        return null;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public CommentRectF hideCreateComment() {
        return null;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onAreaClick() {
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void onCommentInputPanelClose() {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void onCommentListPanelClose() {
    }

    public void onPermissionChanged(boolean z) {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void show() {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void showSelectedComment(String str) {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void showThumbnailPreview() {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void updateComment(ArrayList<CommentRectF> arrayList) {
    }

    /* access modifiers changed from: protected */
    public void disableBehavior() {
        View findViewById = ((DriveViewFinderVM) this.mViewOwner.viewModel(DriveViewFinderVM.class)).findViewById(R.id.main_page_holder_view);
        if (findViewById != null) {
            ((CoordinatorLayout.LayoutParams) findViewById.getLayoutParams()).setBehavior(null);
        }
    }

    /* access modifiers changed from: protected */
    public void trackOpenStart() {
        C7555f fVar = this.mPreviewViewModel;
        if (fVar != null) {
            fVar.liveInnerReportMsg().mo28018a(C7557g.m30300a(1));
        }
        C6712a.m26463a(this.mPreviewViewModel, this);
    }

    /* access modifiers changed from: protected */
    public void initWebViewBehavior() {
        View findViewById = ((DriveViewFinderVM) this.mViewOwner.viewModel(DriveViewFinderVM.class)).findViewById(R.id.main_page_holder_view);
        if (findViewById != null) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) findViewById.getLayoutParams();
            CoordinatorLayout.Behavior behavior = layoutParams.getBehavior();
            if (behavior instanceof FooterBehavior) {
                layoutParams.setBehavior(new WebViewFooterBehavior(((FooterBehavior) behavior).mo29431a()));
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7262d
    public void setOnShowViewTrackEventCallback(AbstractC7256c cVar) {
        this.mShowViewTrackEventCallback = cVar;
    }

    public void setSourceType(int i) {
        this.mSourceType = i;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void onSetup(ViewOwner viewOwner) {
        this.mViewOwner = viewOwner;
        this.mPreviewViewModel = (C7555f) viewOwner.viewModel(C7555f.class);
    }

    public void trackOpenSuccess(String str) {
        if (this.mPreviewViewModel != null && !TextUtils.equals(str, "not_support_view")) {
            HashMap hashMap = new HashMap();
            hashMap.put("open_type", str);
            hashMap.put("source_type", String.valueOf(this.mSourceType));
            this.mPreviewViewModel.liveInnerReportMsg().mo28018a(C7557g.m30301a(2, hashMap));
        }
        AbstractC7256c cVar = this.mShowViewTrackEventCallback;
        if (cVar != null) {
            cVar.mo26118a(str);
        }
        C6712a.m26464b(this.mPreviewViewModel, this);
    }

    /* access modifiers changed from: protected */
    public void trackOpenDowngradeSuccess(String str) {
        C13479a.m54764b("AbsPreviewView", "trackOpenDowngradeSuccess, openType: " + str);
        if (this.mPreviewViewModel != null && !TextUtils.equals(str, "not_support_view")) {
            HashMap hashMap = new HashMap();
            hashMap.put("open_type", str);
            hashMap.put("source_type", String.valueOf(this.mSourceType));
            this.mPreviewViewModel.liveInnerReportMsg().mo28018a(C7557g.m30301a(22, hashMap));
        }
    }

    /* access modifiers changed from: protected */
    public void trackOpenDowngradeFail(String str, Throwable th) {
        C13479a.m54773d("AbsPreviewView", "trackOpenDowngradeFail, openType: " + str, th);
        if (this.mPreviewViewModel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("open_type", str);
            hashMap.put("source_type", String.valueOf(this.mSourceType));
            hashMap.put("error_message", C7128a.m28540a(th));
            this.mPreviewViewModel.liveInnerReportMsg().mo28018a(C7557g.m30301a(21, hashMap));
        }
    }

    public void trackOpenFailed(String str, Throwable th) {
        C13479a.m54773d("AbsPreviewView", "trackOpenFailed, openType: " + str, th);
        if (this.mPreviewViewModel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("open_type", str);
            hashMap.put("source_type", String.valueOf(this.mSourceType));
            hashMap.put("error_message", C7128a.m28540a(th));
            this.mPreviewViewModel.liveInnerReportMsg().mo28018a(C7557g.m30301a(3, hashMap));
        }
        AbstractC7256c cVar = this.mShowViewTrackEventCallback;
        if (cVar != null) {
            cVar.mo26119a(str, th);
        }
        C6712a.m26465c(this.mPreviewViewModel, this);
    }

    public AbsPreviewView(ViewOwner viewOwner, Context context, C7553d dVar, C6738g gVar) {
        this.mViewOwner = viewOwner;
        this.mPreviewViewModel = (C7555f) viewOwner.viewModel(C7555f.class);
        this.mContext = context;
        this.mFileModel = dVar;
        this.mVCFollowManager = gVar;
        this.mDriveReport = C6920b.m27342f().mo27166a();
    }
}
