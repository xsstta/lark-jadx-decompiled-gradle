package com.bytedance.ee.bear.drive.view.preview.wrapper;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.drive.biz.preview.vc.C6738g;
import com.bytedance.ee.bear.drive.preload.C7115c;
import com.bytedance.ee.bear.drive.view.preview.block.DriveBlockPreviewVM;
import com.bytedance.ee.bear.drive.view.preview.video.TTVideoView;
import com.bytedance.ee.bear.drive.view.preview.video.VideoPlayerContentView;
import com.bytedance.ee.bear.drive.view.preview.video.VideoPlayerControllerView;
import com.bytedance.ee.bear.drive.view.preview.video.VideoView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.File;
import java.util.LinkedHashMap;
import org.koin.java.KoinJavaComponent;

public class VideoPreviewView extends AbsPreviewView {

    /* renamed from: a */
    public VideoView f20384a;

    /* renamed from: b */
    private String f20385b = "";

    /* renamed from: c */
    private boolean f20386c;

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public View getView() {
        return this.f20384a;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void show() {
        trackOpenStart();
        this.f20384a.mo29261h();
    }

    /* renamed from: b */
    private String m30213b() {
        String a = m30209a(this.mFileModel);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        C13479a.m54758a("DRIVE_VideoPlayer", "getVideoUrl() previewUrl is empty!!!");
        return new Uri.Builder().scheme("https").authority(C6313i.f17510b).appendEncodedPath("space/api/box/stream/download/preview/").appendEncodedPath(this.mFileModel.mo29479b()).appendQueryParameter(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, this.mFileModel.mo29476a()).appendQueryParameter("preview_type", String.valueOf(16)).build().toString();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onBackPressed() {
        if (this.f20384a == null) {
            return false;
        }
        C13479a.m54764b("DRIVE_VideoPlayer", "onBackPressed, current play mode " + this.f20384a.getCurrentPlayMode());
        if (this.f20384a.getCurrentPlayMode() != 1) {
            return false;
        }
        this.f20384a.mo29268o();
        if (!this.f20384a.mo29264k()) {
            return false;
        }
        try {
            this.f20384a.mo29258e();
        } catch (Exception e) {
            C13479a.m54759a("DRIVE_VideoPlayer", "mVideoPlayer.exitFullScreen error", e);
        }
        return true;
    }

    /* renamed from: a */
    private void m30210a() {
        TTVideoView tTVideoView = new TTVideoView(this.mContext, this.mServiceContext);
        this.f20384a = tTVideoView;
        tTVideoView.setup(this.mViewOwner);
        this.f20384a.setCommunication(this.mPreviewViewModel);
        VideoPlayerControllerView videoPlayerControllerView = new VideoPlayerControllerView(this.mContext);
        videoPlayerControllerView.setViewModel(this.mViewOwner);
        this.f20384a.mo29253a(new VideoPlayerContentView(this.mContext));
        this.f20384a.mo29254a(videoPlayerControllerView);
        an anVar = (an) KoinJavaComponent.m268610a(an.class);
        File file = new File(this.mFileModel.mo29485e());
        String d = C7115c.m28490d(this.mFileModel.mo29479b(), this.mFileModel.mo29476a());
        if (this.mFileModel.mo29495n() && !C13657b.m55422a(this.mFileModel.mo29487f())) {
            C13479a.m54764b("DRIVE_VideoPlayer", "preview video from preload cache");
            this.f20384a.mo29200a(new VideoView.C7493b(m30213b(), anVar.mo16408f().f14591h, d, this.mFileModel.mo29487f(), this.mFileModel));
            this.f20385b = "partCache";
        } else if (this.mFileModel.mo29493l()) {
            C13479a.m54764b("DRIVE_VideoPlayer", "preview local video file type is " + this.mFileModel.mo29483d());
            this.f20384a.mo29200a(new VideoView.C7493b(Uri.fromFile(file).toString(), anVar.mo16408f().f14591h, d, this.mFileModel.mo29487f(), this.mFileModel));
            this.f20385b = "fullCache";
        } else if (!C13657b.m55422a(this.mFileModel.mo29487f())) {
            C13479a.m54764b("DRIVE_VideoPlayer", "preview video from net");
            this.f20384a.mo29200a(new VideoView.C7493b(m30213b(), anVar.mo16408f().f14591h, d, this.mFileModel.mo29487f(), this.mFileModel));
            this.f20385b = "previewUrl";
        } else {
            C13479a.m54758a("DRIVE_VideoPlayer", "initVideoView no logic");
            this.f20384a.mo29200a(new VideoView.C7493b(m30213b(), anVar.mo16408f().f14591h, d, this.mFileModel.mo29487f(), this.mFileModel));
            this.f20385b = "originUrl";
        }
        final DriveBlockPreviewVM driveBlockPreviewVM = (DriveBlockPreviewVM) this.mViewOwner.viewModel(DriveBlockPreviewVM.class);
        this.f20384a.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.drive.view.preview.wrapper.VideoPreviewView.C75421 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                DriveBlockPreviewVM.BlockState b = driveBlockPreviewVM.getLiveBlockState().mo5927b();
                if (b == null || b == DriveBlockPreviewVM.BlockState.FULLSCREEN) {
                    if (VideoPreviewView.this.mPreviewViewModel != null && !VideoPreviewView.this.f20384a.mo29264k() && !VideoPreviewView.this.f20384a.mo29265l()) {
                        VideoPreviewView.this.mPreviewViewModel.liveInnerToggleFullScreen().mo5926a(VideoPreviewView.this.mFileModel.mo29483d());
                    } else if (VideoPreviewView.this.mPreviewViewModel != null && !VideoPreviewView.this.f20384a.mo29263j() && VideoPreviewView.this.f20384a.mo29264k()) {
                        int barsShowState = VideoPreviewView.this.f20384a.getBarsShowState();
                        C13479a.m54764b("DRIVE_VideoPlayer", "horizon video bars show mode " + barsShowState);
                        if (barsShowState == 1) {
                            VideoPreviewView.this.f20384a.mo29266m();
                        } else if (barsShowState == 0) {
                            VideoPreviewView.this.f20384a.mo29267n();
                        }
                    }
                } else if (VideoPreviewView.this.f20384a.getBarsShowState() != 0) {
                    VideoPreviewView.this.f20384a.mo29266m();
                }
            }
        });
        this.mPreviewViewModel.liveOuterFullScreenSate().mo5923a(this.mViewOwner.lifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.drive.view.preview.wrapper.$$Lambda$VideoPreviewView$z4GVOB70ep8RQZiLGG9myVJAsus */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                VideoPreviewView.this.m30211a((VideoPreviewView) ((Boolean) obj));
            }
        });
        this.f20384a.setReportCb(new VideoView.AbstractC7492a() {
            /* class com.bytedance.ee.bear.drive.view.preview.wrapper.$$Lambda$VideoPreviewView$YglwTcjgUbDvWAu3wiLPlQdrA4I */

            @Override // com.bytedance.ee.bear.drive.view.preview.video.VideoView.AbstractC7492a
            public final void onReport(boolean z, Throwable th) {
                VideoPreviewView.this.m30212a(z, th);
            }
        });
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void onPermissionChanged(boolean z) {
        this.f20384a.mo29255a(z);
    }

    /* renamed from: a */
    private static String m30209a(C7553d dVar) {
        LinkedHashMap<String, String> f = dVar.mo29487f();
        if (f == null || f.isEmpty()) {
            return null;
        }
        return f.values().iterator().next();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30211a(Boolean bool) {
        if (bool == null) {
            C13479a.m54758a("DriveSdk", "VideoPreviewView#liveOuterFullScreenSate() fullScreen null.");
        } else {
            this.f20384a.setCurrentPlayMode(bool.booleanValue() ? 1 : 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30212a(boolean z, Throwable th) {
        if (!this.f20386c) {
            this.f20386c = true;
            String str = "tt_video_" + this.f20385b;
            if (z) {
                trackOpenSuccess(str);
            } else {
                trackOpenFailed(str, th);
            }
        }
    }

    public VideoPreviewView(ViewOwner viewOwner, Context context, C7553d dVar, C6738g gVar) {
        super(viewOwner, context, dVar, gVar);
        m30210a();
    }
}
