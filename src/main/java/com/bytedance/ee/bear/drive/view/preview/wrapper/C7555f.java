package com.bytedance.ee.bear.drive.view.preview.wrapper;

import android.view.View;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.drive.biz.comment.area.CommentRectF;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader;
import com.bytedance.ee.bear.drive.report.C7136g;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.wrapper.f */
public class C7555f extends AbstractC1142af {
    private int bizType = 2;
    private boolean isBlockViewChanging = false;
    private boolean isVCFollowMode = false;
    private final C1177w<Boolean> liveInnerAreaCommentEnableState = new C1177w<>();
    private final C1177w<C7556a> liveInnerChangeTipsState = new C1177w<>();
    private final C1177w<Void> liveInnerClosePage = new C1177w<>();
    private final C1177w<CommentRectF> liveInnerCommentSelected = new C1177w<>();
    private final C1177w<Boolean> liveInnerCreateNewComment = new C1177w<>();
    private final C1177w<Integer> liveInnerDowngrade = new C1177w<>();
    private final C1177w<IDownloader.C7022a> liveInnerDownloadCompleteFile = new C1177w<>();
    private final C1177w<Integer> liveInnerEditModeSwitchAction = new C1177w<>();
    private final C1177w<Boolean> liveInnerEditModeSwitchActive = new C1177w<>();
    private final C1177w<Boolean> liveInnerExtraViewVisible = new C1177w<>();
    private final C1177w<String> liveInnerFileNameChanged = new C1177w<>();
    private final C1177w<C6522b> liveInnerFilePermissionChanged = new C1177w<>();
    private final C1177w<Boolean> liveInnerForceFullScreen = new C1177w<>();
    private final C1177w<Boolean> liveInnerForceImgFullScreen = new C1177w<>();
    private final C1177w<Boolean> liveInnerInterceptMaskClick = new C1177w<>();
    private final C1177w<Boolean> liveInnerIsPresentationMode = new C1177w<>();
    private final C1177w<Boolean> liveInnerKeepScreenOn = new C1177w<>();
    private final C1177w<Integer> liveInnerMemoryOverLimit = new C1177w<>();
    private final C1177w<Boolean> liveInnerOnPreviewContentReady = new C1177w<>();
    private final C1177w<Void> liveInnerOpenExternal = new C1177w<>();
    private final C1177w<String> liveInnerPasswordProtected = new C1177w<>();
    private final C1177w<Integer> liveInnerPreviewShowStatus = new C1177w<>();
    private final C1177w<Void> liveInnerReload = new C1177w<>();
    private final C7136g<C7557g> liveInnerReportMsg = new C7136g<>();
    private final C1177w<String> liveInnerRoute = new C1177w<>();
    private final C1177w<Integer> liveInnerSearchResultCount = new C1177w<>();
    private final C1177w<Boolean> liveInnerSetSwipeEnable = new C1177w<>();
    private final C1177w<Boolean> liveInnerShowPresentationAction = new C1177w<>();
    private final C1177w<Void> liveInnerShowPreviewFailedPage = new C1177w<>();
    private final C1177w<Void> liveInnerShowRetryPage = new C1177w<>();
    private final C1177w<Boolean> liveInnerShowSearchBar = new C1177w<>();
    private final C1177w<Void> liveInnerSingleTap = new C1177w<>();
    private final C1177w<Object> liveInnerStreamingDone = new C1177w<>();
    private final C1177w<Boolean> liveInnerThumbVisibleState = new C1177w<>();
    private final C1177w<String> liveInnerToggleFullScreen = new C1177w<>();
    private final C1177w<String> liveInnerUnsupprtPreview = new C1177w<>();
    private final C1177w<Boolean> liveInnerVideoFullScreen = new C1177w<>();
    private final C1177w<Boolean> liveInnerWPSEditModeAvailable = new C1177w<>(false);
    private final C1177w<Boolean> liveInnerWPSKeyboardChangedActive = new C1177w<>();
    private final C1177w<Integer> liveInnerWPSViewPaddingChanged = new C1177w<>();
    private final C1177w<AbstractC7552c<Boolean>> liveOuterCommentCardVisible = new C1177w<>();
    private final C1177w<Boolean> liveOuterCommentable = new C1177w<>();
    private final C1177w<Boolean> liveOuterCopyable = new C1177w<>();
    private final C1177w<Boolean> liveOuterDisableShowComment = new C1177w<>();
    private final C1177w<Void> liveOuterEnterPresentationMode = new C1177w<>();
    private final C1177w<Boolean> liveOuterExportVisible = new C1177w<>();
    private final C1177w<Boolean> liveOuterFullScreenSate = new C1177w<>();
    private final C1177w<Boolean> liveOuterNetState = new C1177w<>();
    private final C1177w<AbstractC7552c<Integer>> liveOuterNotPreviewContentHeight = new C1177w<>();
    private final C1177w<Object> liveOuterSearchStatus = new C1177w<>();
    private final C1177w<Boolean> liveOuterSupportAreaComment = new C1177w<>();

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.wrapper.f$a */
    public static class C7556a {

        /* renamed from: a */
        private String f20446a;

        /* renamed from: b */
        private int f20447b;

        /* renamed from: c */
        private boolean f20448c;

        /* renamed from: d */
        private int f20449d;

        /* renamed from: e */
        private String f20450e;

        /* renamed from: f */
        private View.OnClickListener f20451f;

        /* renamed from: a */
        public String mo29559a() {
            return this.f20446a;
        }

        /* renamed from: b */
        public int mo29564b() {
            return this.f20447b;
        }

        /* renamed from: c */
        public String mo29567c() {
            return this.f20450e;
        }

        /* renamed from: d */
        public View.OnClickListener mo29568d() {
            return this.f20451f;
        }

        /* renamed from: e */
        public boolean mo29569e() {
            return this.f20448c;
        }

        /* renamed from: f */
        public int mo29570f() {
            return this.f20449d;
        }

        /* renamed from: a */
        public void mo29560a(int i) {
            this.f20447b = i;
        }

        /* renamed from: b */
        public void mo29565b(int i) {
            this.f20449d = i;
        }

        /* renamed from: a */
        public void mo29561a(View.OnClickListener onClickListener) {
            this.f20451f = onClickListener;
        }

        /* renamed from: b */
        public void mo29566b(String str) {
            this.f20450e = str;
        }

        /* renamed from: a */
        public void mo29562a(String str) {
            this.f20446a = str;
        }

        /* renamed from: a */
        public void mo29563a(boolean z) {
            this.f20448c = z;
        }
    }

    public int getBizType() {
        return this.bizType;
    }

    public C1177w<C7556a> getLiveInnerChangeTipsState() {
        return this.liveInnerChangeTipsState;
    }

    public C1177w<Void> getLiveInnerShowPreviewFailedPage() {
        return this.liveInnerShowPreviewFailedPage;
    }

    public C1177w<Integer> getliveInnerDowngrade() {
        return this.liveInnerDowngrade;
    }

    public boolean isBlockViewChanging() {
        return this.isBlockViewChanging;
    }

    public boolean isVCFollowMode() {
        return this.isVCFollowMode;
    }

    public C1177w<Boolean> liveInnerAreaCommentEnableState() {
        return this.liveInnerAreaCommentEnableState;
    }

    public C1177w<Void> liveInnerClosePage() {
        return this.liveInnerClosePage;
    }

    public C1177w<CommentRectF> liveInnerCommentSelected() {
        return this.liveInnerCommentSelected;
    }

    public C1177w<Boolean> liveInnerCreateNewComment() {
        return this.liveInnerCreateNewComment;
    }

    public C1177w<IDownloader.C7022a> liveInnerDownloadCompleteFile() {
        return this.liveInnerDownloadCompleteFile;
    }

    public C1177w<Integer> liveInnerEditModeSwitchAction() {
        return this.liveInnerEditModeSwitchAction;
    }

    public C1177w<Boolean> liveInnerEditModeSwitchActive() {
        return this.liveInnerEditModeSwitchActive;
    }

    public C1177w<Boolean> liveInnerExtraViewVisible() {
        return this.liveInnerExtraViewVisible;
    }

    public C1177w<String> liveInnerFileNameChanged() {
        return this.liveInnerFileNameChanged;
    }

    public C1177w<C6522b> liveInnerFilePermissionChanged() {
        return this.liveInnerFilePermissionChanged;
    }

    public C1177w<Boolean> liveInnerForceFullScreen() {
        return this.liveInnerForceFullScreen;
    }

    public C1177w<Boolean> liveInnerForceImgFullScreen() {
        return this.liveInnerForceImgFullScreen;
    }

    public C1177w<Boolean> liveInnerInterceptMaskClick() {
        return this.liveInnerInterceptMaskClick;
    }

    public C1177w<Boolean> liveInnerIsPresentationMode() {
        return this.liveInnerIsPresentationMode;
    }

    public C1177w<Boolean> liveInnerKeepScreenOn() {
        return this.liveInnerKeepScreenOn;
    }

    public C1177w<Integer> liveInnerMemoryOverLimit() {
        return this.liveInnerMemoryOverLimit;
    }

    public C1177w<Boolean> liveInnerOnPreviewContentReady() {
        return this.liveInnerOnPreviewContentReady;
    }

    public C1177w<Void> liveInnerOpenExternal() {
        return this.liveInnerOpenExternal;
    }

    public C1177w<String> liveInnerPasswordProtected() {
        return this.liveInnerPasswordProtected;
    }

    public C1177w<Integer> liveInnerPreviewShowStatus() {
        return this.liveInnerPreviewShowStatus;
    }

    public C1177w<Void> liveInnerReload() {
        return this.liveInnerReload;
    }

    public C7136g<C7557g> liveInnerReportMsg() {
        return this.liveInnerReportMsg;
    }

    public C1177w<String> liveInnerRoute() {
        return this.liveInnerRoute;
    }

    public C1177w<Object> liveInnerSaveCache() {
        return this.liveInnerStreamingDone;
    }

    public C1177w<Integer> liveInnerSearchCount() {
        return this.liveInnerSearchResultCount;
    }

    public C1177w<Boolean> liveInnerSetSwipeEnable() {
        return this.liveInnerSetSwipeEnable;
    }

    public C1177w<Boolean> liveInnerShowPresentationAction() {
        return this.liveInnerShowPresentationAction;
    }

    public C1177w<Void> liveInnerShowRetryPage() {
        return this.liveInnerShowRetryPage;
    }

    public C1177w<Boolean> liveInnerShowSearchBar() {
        return this.liveInnerShowSearchBar;
    }

    public C1177w<Void> liveInnerSingleTap() {
        return this.liveInnerSingleTap;
    }

    public C1177w<Boolean> liveInnerThumbVisibleState() {
        return this.liveInnerThumbVisibleState;
    }

    public C1177w<String> liveInnerToggleFullScreen() {
        return this.liveInnerToggleFullScreen;
    }

    public C1177w<String> liveInnerUnsupprtPreview() {
        return this.liveInnerUnsupprtPreview;
    }

    public C1177w<Boolean> liveInnerVideoFullScreen() {
        return this.liveInnerVideoFullScreen;
    }

    public C1177w<Boolean> liveInnerWPSEditModeAvailable() {
        return this.liveInnerWPSEditModeAvailable;
    }

    public C1177w<Boolean> liveInnerWPSKeyboardChangedActive() {
        return this.liveInnerWPSKeyboardChangedActive;
    }

    public C1177w<Integer> liveInnerWPSViewPaddingChanged() {
        return this.liveInnerWPSViewPaddingChanged;
    }

    public C1177w<AbstractC7552c<Boolean>> liveOuterCommentCardVisible() {
        return this.liveOuterCommentCardVisible;
    }

    public C1177w<Boolean> liveOuterCommentable() {
        return this.liveOuterCommentable;
    }

    public C1177w<Boolean> liveOuterCopyable() {
        return this.liveOuterCopyable;
    }

    public C1177w<Boolean> liveOuterDisableShowComment() {
        return this.liveOuterDisableShowComment;
    }

    public C1177w<Void> liveOuterEnterPresentationMode() {
        return this.liveOuterEnterPresentationMode;
    }

    public C1177w<Boolean> liveOuterExportVisible() {
        return this.liveOuterExportVisible;
    }

    public C1177w<Boolean> liveOuterFullScreenSate() {
        return this.liveOuterFullScreenSate;
    }

    public C1177w<Boolean> liveOuterNetState() {
        return this.liveOuterNetState;
    }

    public C1177w<AbstractC7552c<Integer>> liveOuterNotPreviewContentHeight() {
        return this.liveOuterNotPreviewContentHeight;
    }

    public C1177w<Object> liveOuterSearchStatus() {
        return this.liveOuterSearchStatus;
    }

    public C1177w<Boolean> liveOuterSupportAreaComment() {
        return this.liveOuterSupportAreaComment;
    }

    public void setBizType(int i) {
        this.bizType = i;
    }

    public void setBlockViewChanging(boolean z) {
        this.isBlockViewChanging = z;
    }

    public void setVCFollowMode(boolean z) {
        this.isVCFollowMode = z;
    }
}
