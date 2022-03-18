package com.ss.android.appcenter.business.tab.business.popups.content.video;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.net.p1270a.C27714b;
import com.ss.android.appcenter.business.net.pupups.PopupsConfig;
import com.ss.android.appcenter.business.net.pupups.PopupsData;
import com.ss.android.appcenter.business.net.pupups.PopupsElement;
import com.ss.android.appcenter.business.net.pupups.PopupsNotification;
import com.ss.android.appcenter.business.tab.business.popups.BizPopupsHelper;
import com.ss.android.appcenter.business.tab.business.popups.content.BasePopupsContent;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.view.video.VideoView;
import com.ss.android.appcenter.common.view.video.data.DataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J \u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0016J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/popups/content/video/VideoPopupsContent;", "Lcom/ss/android/appcenter/business/tab/business/popups/content/BasePopupsContent;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/appcenter/business/net/pupups/PopupsData;", "(Lcom/ss/android/appcenter/business/net/pupups/PopupsData;)V", "rootView", "Landroid/view/View;", "tag", "", "vidCtrlView", "Lcom/ss/android/appcenter/business/tab/business/popups/content/video/PopupsVideoCtrlView;", "videoView", "Lcom/ss/android/appcenter/common/view/video/VideoView;", "initContent", "", "loadVideoContent", "onCreateView", "ctx", "Landroid/content/Context;", "window", "Landroid/widget/PopupWindow;", "parent", "Landroid/view/ViewGroup;", "onDestroy", "onHide", "onShow", "updateContentSize", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.business.tab.business.popups.content.video.a */
public final class VideoPopupsContent extends BasePopupsContent {

    /* renamed from: a */
    private final String f69689a = "AppCenterVideoPopupsContent";

    /* renamed from: b */
    private View f69690b;

    /* renamed from: c */
    private VideoView f69691c;

    /* renamed from: d */
    private PopupsVideoCtrlView f69692d;

    /* renamed from: e */
    private final PopupsData f69693e;

    @Override // com.ss.android.appcenter.business.tab.business.popups.content.IPopupsContent
    /* renamed from: e */
    public void mo99373e() {
        PopupsVideoCtrlView popupsVideoCtrlView = this.f69692d;
        if (popupsVideoCtrlView != null) {
            popupsVideoCtrlView.mo99384a();
        }
    }

    @Override // com.ss.android.appcenter.business.tab.business.popups.content.IPopupsContent
    /* renamed from: f */
    public void mo99374f() {
        PopupsVideoCtrlView popupsVideoCtrlView = this.f69692d;
        if (popupsVideoCtrlView != null) {
            popupsVideoCtrlView.mo99387b();
        }
    }

    @Override // com.ss.android.appcenter.business.tab.business.popups.content.IPopupsContent
    /* renamed from: g */
    public void mo99375g() {
        VideoView videoView = this.f69691c;
        if (videoView != null) {
            videoView.mo100472i();
        }
    }

    /* renamed from: h */
    private final void m101788h() {
        View view = this.f69690b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        this.f69691c = (VideoView) view.findViewById(R.id.vid_video_biz_popups);
        View view2 = this.f69690b;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        this.f69692d = (PopupsVideoCtrlView) view2.findViewById(R.id.vid_ctrl_video_biz_popups);
        m101787a(this.f69693e);
        m101789i();
    }

    /* renamed from: i */
    private final void m101789i() {
        PopupsVideoCtrlView popupsVideoCtrlView;
        PopupsNotification notification;
        PopupsElement contentElement;
        String fileKey;
        String str;
        PopupsElement contentElement2;
        VideoView videoView = this.f69691c;
        if (videoView != null && (popupsVideoCtrlView = this.f69692d) != null && (notification = this.f69693e.getNotification()) != null && (contentElement = notification.contentElement()) != null && (fileKey = contentElement.getFileKey()) != null) {
            DataSource dataSource = new DataSource(BizPopupsHelper.f69630a.mo99359a(fileKey));
            PopupsNotification notification2 = this.f69693e.getNotification();
            if (notification2 == null || (contentElement2 = notification2.contentElement()) == null) {
                str = null;
            } else {
                str = contentElement2.getImgKey();
            }
            String a = BizPopupsHelper.f69630a.mo99359a(str);
            dataSource.setExtra(C27714b.m101357a());
            videoView.setDataSource(dataSource);
            popupsVideoCtrlView.mo99386a(videoView, a);
        }
    }

    public VideoPopupsContent(PopupsData popupsData) {
        Intrinsics.checkParameterIsNotNull(popupsData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f69693e = popupsData;
    }

    /* renamed from: a */
    private final void m101787a(PopupsData popupsData) {
        PopupsConfig popupsConfig;
        float f;
        float f2;
        PopupsNotification notification = popupsData.getNotification();
        if (notification != null) {
            popupsConfig = notification.contentConfig();
        } else {
            popupsConfig = null;
        }
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (popupsConfig != null) {
            f = (float) popupsConfig.getWidth();
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (popupsConfig != null) {
            f2 = (float) popupsConfig.getHeight();
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        if (f2 > BitmapDescriptorFactory.HUE_RED) {
            f3 = f / f2;
        }
        int c = mo99369c();
        int i = (int) (((float) c) / f3);
        if (i > mo99370d()) {
            i = mo99370d();
        }
        if (i < mo99368b()) {
            i = mo99368b();
        }
        View view = this.f69690b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = c;
        layoutParams.height = i;
        View view2 = this.f69690b;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        view2.setLayoutParams(layoutParams);
        String str = this.f69689a;
        C28184h.m103250d(str, "update video content size,width=" + c + ",height=" + i);
    }

    @Override // com.ss.android.appcenter.business.tab.business.popups.content.IPopupsContent
    /* renamed from: a */
    public View mo99371a(Context context, PopupWindow popupWindow, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        Intrinsics.checkParameterIsNotNull(popupWindow, "window");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(context).inflate(R.layout.appcenter_biz_popups_video_layout, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(ctx)…eo_layout, parent, false)");
        this.f69690b = inflate;
        m101788h();
        View view = this.f69690b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return view;
    }
}
