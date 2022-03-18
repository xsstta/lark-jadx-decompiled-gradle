package com.bytedance.ee.bear.sheet.exportimage.alert;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.bizwidget.shareview.C4891e;
import com.bytedance.ee.bear.bizwidget.shareview.ExternalShareView;
import com.bytedance.ee.bear.bizwidget.shareview.ShareType;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.sheet.exportimage.C11094a;
import com.bytedance.ee.bear.sheet.exportimage.alert.ImageAlertModel;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.ImageViewState;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.vc.statistics.p3180a.C63690d;
import java.io.File;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001@B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u001fH\u0002J\u0010\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&H\u0002J\u0006\u0010'\u001a\u00020(J\u0012\u0010)\u001a\u00020\u001f2\b\u0010*\u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J&\u0010/\u001a\u0004\u0018\u00010&2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u00104\u001a\u00020\u001fH\u0016J\b\u00105\u001a\u00020\u001fH\u0002J\b\u00106\u001a\u00020\u001fH\u0002J\u0010\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u00020\u001fH\u0016J\u001a\u0010;\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020&2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010=\u001a\u00020\u001fH\u0002J\b\u0010>\u001a\u00020\u001fH\u0002J\b\u0010?\u001a\u00020\u001fH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroid/view/View$OnClickListener;", "()V", "closeIv", "Landroid/widget/ImageView;", "externalShareView", "Lcom/bytedance/ee/bear/bizwidget/shareview/ExternalShareView;", "externalShareViewContainer", "Landroid/widget/FrameLayout;", "imageHeight", "", "imageWidth", "loadingView", "Lcom/bytedance/ee/bear/facade/common/widget/BearLottieView;", "messageTv", "Landroid/widget/TextView;", "minScale", "", "saveTv", "screenshotImageContainer", "screenshotImageIv", "Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;", "screenshtRoot", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "shareTv", "titleTv", "viewModel", "Lcom/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertViewModel;", "endLoadingStatus", "", "image", "Ljava/io/File;", "hideExternalView", "initObservers", "initViews", "root", "Landroid/view/View;", "onBackPressed", "", "onClick", "v", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onSave", "onShare", "onShareToExternalApp", "shareType", "Lcom/bytedance/ee/bear/bizwidget/shareview/ShareType;", "onStart", "onViewCreated", "view", "showExternalView", "startLoading", "updateExternalConfig", "Companion", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.exportimage.alert.a */
public final class ScreenshotImageAlertFragment extends DialogInterface$OnCancelListenerC1021b implements View.OnClickListener {

    /* renamed from: l */
    public static final String f29812l = f29812l;

    /* renamed from: m */
    public static final float f29813m = 5.0f;

    /* renamed from: n */
    public static final int f29814n = f29814n;

    /* renamed from: o */
    public static final int f29815o = 26;

    /* renamed from: p */
    public static final Companion f29816p = new Companion(null);

    /* renamed from: c */
    public ScreenshotImageAlertViewModel f29817c;

    /* renamed from: d */
    public TextView f29818d;

    /* renamed from: e */
    public TextView f29819e;

    /* renamed from: f */
    public FrameLayout f29820f;

    /* renamed from: g */
    public SubsamplingScaleImageView f29821g;

    /* renamed from: h */
    public FrameLayout f29822h;

    /* renamed from: i */
    public int f29823i;

    /* renamed from: j */
    public int f29824j;

    /* renamed from: k */
    public float f29825k;

    /* renamed from: q */
    private TextView f29826q;

    /* renamed from: r */
    private TextView f29827r;

    /* renamed from: s */
    private ImageView f29828s;

    /* renamed from: t */
    private BearLottieView f29829t;

    /* renamed from: u */
    private ExternalShareView f29830u;

    /* renamed from: v */
    private FrameLayout f29831v;

    /* renamed from: w */
    private final C10917c f29832w = new C10917c(new C10929e());

    /* renamed from: x */
    private HashMap f29833x;

    /* renamed from: h */
    public void mo42351h() {
        HashMap hashMap = this.f29833x;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eXD¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertFragment$Companion;", "", "()V", "IMAGE_MAX_HEIGHT", "", "getIMAGE_MAX_HEIGHT", "()I", "IMAGE_MIN_HEIGHT", "getIMAGE_MIN_HEIGHT", "MAX_SCALE_VALUE", "", "getMAX_SCALE_VALUE", "()F", "TAG", "", "getTAG", "()Ljava/lang/String;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.alert.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo42353a() {
            return ScreenshotImageAlertFragment.f29812l;
        }

        /* renamed from: b */
        public final float mo42354b() {
            return ScreenshotImageAlertFragment.f29813m;
        }

        /* renamed from: c */
        public final int mo42355c() {
            return ScreenshotImageAlertFragment.f29814n;
        }

        /* renamed from: d */
        public final int mo42356d() {
            return ScreenshotImageAlertFragment.f29815o;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertFragment$updateExternalConfig$1", "Lcom/bytedance/ee/bear/bizwidget/shareview/SimpleShareItemClickListener;", "onShareMore", "", "onShareToLark", "onShareToQQ", "onShareToWechat", "onShareToWechatMoments", "onShareToWeibo", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.alert.a$h */
    public static final class C11109h extends C4891e {

        /* renamed from: a */
        final /* synthetic */ ScreenshotImageAlertFragment f29840a;

        @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.bizwidget.shareview.C4891e
        /* renamed from: a */
        public void mo19175a() {
            this.f29840a.mo42347a(ShareType.Lark);
        }

        @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.bizwidget.shareview.C4891e
        /* renamed from: g */
        public void mo19179g() {
            this.f29840a.mo42347a(ShareType.Wechat);
        }

        @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.bizwidget.shareview.C4891e
        /* renamed from: h */
        public void mo19180h() {
            this.f29840a.mo42347a(ShareType.WechatMoments);
        }

        @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.bizwidget.shareview.C4891e
        /* renamed from: i */
        public void mo19181i() {
            this.f29840a.mo42347a(ShareType.QQ);
        }

        @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.bizwidget.shareview.C4891e
        /* renamed from: j */
        public void mo19182j() {
            this.f29840a.mo42347a(ShareType.Weibo);
        }

        @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.bizwidget.shareview.C4891e
        /* renamed from: l */
        public void mo19184l() {
            this.f29840a.mo42347a(ShareType.More);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11109h(ScreenshotImageAlertFragment aVar) {
            this.f29840a = aVar;
        }
    }

    /* renamed from: k */
    private final void m46206k() {
        FrameLayout frameLayout = this.f29831v;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        ExternalShareView externalShareView = this.f29830u;
        if (externalShareView != null) {
            externalShareView.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.alert.a$d */
    public static final class RunnableC11105d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ScreenshotImageAlertFragment f29836a;

        RunnableC11105d(ScreenshotImageAlertFragment aVar) {
            this.f29836a = aVar;
        }

        public final void run() {
            FrameLayout frameLayout = this.f29836a.f29822h;
            if (frameLayout != null) {
                ((IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null)).mo40646a(frameLayout);
            }
        }
    }

    /* renamed from: l */
    private final void m46207l() {
        FrameLayout frameLayout = this.f29831v;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        ExternalShareView externalShareView = this.f29830u;
        if (externalShareView != null) {
            externalShareView.setVisibility(8);
        }
    }

    /* renamed from: g */
    public final boolean mo42350g() {
        FrameLayout frameLayout = this.f29831v;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            ScreenshotImageAlertViewModel bVar = this.f29817c;
            if (bVar == null) {
                return true;
            }
            bVar.close();
            return true;
        }
        m46207l();
        return true;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        BearLottieView bearLottieView = this.f29829t;
        if (bearLottieView != null) {
            bearLottieView.cancelAnimation();
        }
        FrameLayout frameLayout = this.f29822h;
        if (frameLayout != null) {
            ((IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null)).mo40653b(frameLayout);
        }
        mo42351h();
    }

    /* renamed from: i */
    private final void m46204i() {
        C1177w<File> imageBitmap;
        C1177w<ImageAlertModel> imageAlertData;
        ScreenshotImageAlertViewModel bVar = this.f29817c;
        if (!(bVar == null || (imageAlertData = bVar.getImageAlertData()) == null)) {
            imageAlertData.mo5923a(this, new C11103b(this));
        }
        ScreenshotImageAlertViewModel bVar2 = this.f29817c;
        if (bVar2 != null && (imageBitmap = bVar2.getImageBitmap()) != null) {
            imageBitmap.mo5923a(this, new C11104c(this));
        }
    }

    /* renamed from: m */
    private final void m46208m() {
        if (C36808a.m145211c() == 1) {
            Context context = getContext();
            if (context != null) {
                Toast.showText(context, context.getString(R.string.CreationMobile_ECM_ShareSecuritySettingKAToast), 1);
                return;
            }
            return;
        }
        ScreenshotImageAlertViewModel bVar = this.f29817c;
        if (bVar != null) {
            bVar.onClickShareBtn();
        }
        m46206k();
    }

    /* renamed from: n */
    private final void m46209n() {
        File file;
        C1177w<File> imageBitmap;
        ScreenshotImageAlertViewModel bVar = this.f29817c;
        if (bVar != null) {
            bVar.onClickSaveBtn();
        }
        Context context = getContext();
        ScreenshotImageAlertViewModel bVar2 = this.f29817c;
        if (bVar2 == null || (imageBitmap = bVar2.getImageBitmap()) == null) {
            file = null;
        } else {
            file = imageBitmap.mo5927b();
        }
        C11094a.m46172a(context, file, new C11106e(this));
    }

    /* renamed from: f */
    public final void mo42349f() {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f29821g;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setVisibility(8);
        }
        BearLottieView bearLottieView = this.f29829t;
        if (bearLottieView != null) {
            bearLottieView.setVisibility(0);
        }
        FrameLayout frameLayout = this.f29820f;
        if (frameLayout != null) {
            frameLayout.post(new RunnableC11108g(this));
        }
        TextView textView = this.f29826q;
        if (textView != null) {
            textView.setEnabled(false);
        }
        TextView textView2 = this.f29827r;
        if (textView2 != null) {
            textView2.setEnabled(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.alert.a$g */
    public static final class RunnableC11108g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ScreenshotImageAlertFragment f29839a;

        RunnableC11108g(ScreenshotImageAlertFragment aVar) {
            this.f29839a = aVar;
        }

        public final void run() {
            int i;
            FrameLayout frameLayout = this.f29839a.f29820f;
            if (frameLayout != null) {
                i = frameLayout.getMeasuredWidth();
            } else {
                i = 0;
            }
            ScreenshotImageAlertFragment aVar = this.f29839a;
            aVar.f29825k = ((float) i) / ((float) aVar.f29823i);
            SubsamplingScaleImageView subsamplingScaleImageView = this.f29839a.f29821g;
            if (subsamplingScaleImageView != null) {
                subsamplingScaleImageView.setMinScale(this.f29839a.f29825k);
            }
            SubsamplingScaleImageView subsamplingScaleImageView2 = this.f29839a.f29821g;
            if (subsamplingScaleImageView2 != null) {
                subsamplingScaleImageView2.setMaxScale(RangesKt.coerceAtLeast(this.f29839a.f29825k, ScreenshotImageAlertFragment.f29816p.mo42354b()));
            }
            FrameLayout frameLayout2 = this.f29839a.f29820f;
            if (frameLayout2 != null) {
                ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                layoutParams.height = Math.min(C13749l.m55738a(ScreenshotImageAlertFragment.f29816p.mo42355c()), Math.max(C13749l.m55738a(ScreenshotImageAlertFragment.f29816p.mo42356d()), (int) (((float) this.f29839a.f29824j) * this.f29839a.f29825k)));
                frameLayout2.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog v_ = v_();
        if (v_ != null) {
            window = v_.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.4f;
            attributes.width = -1;
            attributes.gravity = 80;
            attributes.height = -1;
            int i = attributes.flags;
            attributes.windowAnimations = 0;
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(0));
            v_.setOnKeyListener(new DialogInterface$OnKeyListenerC11107f(this));
        }
        mo5512a(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m46205j() {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.sheet.exportimage.alert.ScreenshotImageAlertFragment.m46205j():void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertFragment$initObservers$1", "Landroidx/lifecycle/Observer;", "Lcom/bytedance/ee/bear/sheet/exportimage/alert/ImageAlertModel;", "onChanged", "", "imageAlertModel", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.alert.a$b */
    public static final class C11103b implements AbstractC1178x<ImageAlertModel> {

        /* renamed from: a */
        final /* synthetic */ ScreenshotImageAlertFragment f29834a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11103b(ScreenshotImageAlertFragment aVar) {
            this.f29834a = aVar;
        }

        /* renamed from: a */
        public void onChanged(ImageAlertModel imageAlertModel) {
            if (imageAlertModel != null) {
                TextView textView = this.f29834a.f29818d;
                if (textView != null) {
                    textView.setText(imageAlertModel.getTitle());
                }
                TextView textView2 = this.f29834a.f29819e;
                if (textView2 != null) {
                    textView2.setText(imageAlertModel.getMessages());
                }
                ScreenshotImageAlertFragment aVar = this.f29834a;
                ImageAlertModel.ImageInfo imageInfo = imageAlertModel.getImageInfo();
                Intrinsics.checkExpressionValueIsNotNull(imageInfo, "imageAlertModel.imageInfo");
                aVar.f29823i = imageInfo.getImageWidth();
                ScreenshotImageAlertFragment aVar2 = this.f29834a;
                ImageAlertModel.ImageInfo imageInfo2 = imageAlertModel.getImageInfo();
                Intrinsics.checkExpressionValueIsNotNull(imageInfo2, "imageAlertModel.imageInfo");
                aVar2.f29824j = imageInfo2.getImageHeight();
                this.f29834a.mo42349f();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertFragment$initObservers$2", "Landroidx/lifecycle/Observer;", "Ljava/io/File;", "onChanged", "", "image", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.alert.a$c */
    public static final class C11104c implements AbstractC1178x<File> {

        /* renamed from: a */
        final /* synthetic */ ScreenshotImageAlertFragment f29835a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11104c(ScreenshotImageAlertFragment aVar) {
            this.f29835a = aVar;
        }

        /* renamed from: a */
        public void onChanged(File file) {
            if (file != null) {
                String a = ScreenshotImageAlertFragment.f29816p.mo42353a();
                C13479a.m54764b(a, "Get image file, endLoadingStatus: " + file);
                this.f29835a.mo42348a(file);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertFragment$onSave$1", "Lcom/bytedance/ee/bear/sheet/exportimage/ShareImageAndTextHelper$OnShareResultListener;", "onFail", "", "shareType", "Lcom/bytedance/ee/bear/bizwidget/shareview/ShareType;", "msg", "", "onSuccess", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.alert.a$e */
    public static final class C11106e implements C11094a.AbstractC11098a {

        /* renamed from: a */
        final /* synthetic */ ScreenshotImageAlertFragment f29837a;

        @Override // com.bytedance.ee.bear.sheet.exportimage.C11094a.AbstractC11098a
        /* renamed from: a */
        public void mo42314a(ShareType shareType, String str) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11106e(ScreenshotImageAlertFragment aVar) {
            this.f29837a = aVar;
        }

        @Override // com.bytedance.ee.bear.sheet.exportimage.C11094a.AbstractC11098a
        /* renamed from: a */
        public void mo42313a(ShareType shareType) {
            ScreenshotImageAlertViewModel bVar = this.f29837a.f29817c;
            if (bVar != null) {
                bVar.onShareSuccess(ShareType.Download);
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        return new Dialog(context, R.style.ScreenshotFragmentStyle);
    }

    /* renamed from: a */
    public final void mo42347a(ShareType shareType) {
        File file;
        C1177w<File> imageBitmap;
        ScreenshotImageAlertViewModel bVar = this.f29817c;
        if (bVar != null) {
            bVar.onShareToExternalApp(shareType);
        }
        C10917c cVar = this.f29832w;
        Context context = getContext();
        ScreenshotImageAlertViewModel bVar2 = this.f29817c;
        if (bVar2 == null || (imageBitmap = bVar2.getImageBitmap()) == null) {
            file = null;
        } else {
            file = imageBitmap.mo5927b();
        }
        C11094a.m46175a(cVar, context, shareType, file, (C11094a.AbstractC11098a) null);
        ScreenshotImageAlertViewModel bVar3 = this.f29817c;
        if (bVar3 != null) {
            bVar3.onShareSuccess(shareType);
        }
    }

    public void onClick(View view) {
        if (view != null) {
            int id = view.getId();
            if (id == R.id.image_alert_save) {
                m46209n();
            } else if (id == R.id.image_alert_share) {
                m46208m();
            } else if (id == R.id.image_alert_close) {
                ScreenshotImageAlertViewModel bVar = this.f29817c;
                if (bVar != null) {
                    bVar.close();
                }
            } else if (id == R.id.external_share_view_container) {
                m46207l();
            }
        }
    }

    /* renamed from: a */
    public final void mo42348a(File file) {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f29821g;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setVisibility(0);
        }
        BearLottieView bearLottieView = this.f29829t;
        if (bearLottieView != null) {
            bearLottieView.setVisibility(8);
        }
        BearLottieView bearLottieView2 = this.f29829t;
        if (bearLottieView2 != null) {
            bearLottieView2.cancelAnimation();
        }
        TextView textView = this.f29826q;
        if (textView != null) {
            textView.setEnabled(true);
        }
        TextView textView2 = this.f29827r;
        if (textView2 != null) {
            textView2.setEnabled(true);
        }
        SubsamplingScaleImageView subsamplingScaleImageView2 = this.f29821g;
        if (subsamplingScaleImageView2 != null) {
            subsamplingScaleImageView2.setEagerLoadingEnabled(false);
        }
        SubsamplingScaleImageView subsamplingScaleImageView3 = this.f29821g;
        if (subsamplingScaleImageView3 != null) {
            subsamplingScaleImageView3.setImage(ImageSource.uri(Uri.fromFile(file)), new ImageViewState(this.f29825k, new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), 0));
        }
    }

    /* renamed from: a */
    private final void m46203a(View view) {
        this.f29822h = (FrameLayout) view.findViewById(R.id.screeenshot_root);
        this.f29818d = (TextView) view.findViewById(R.id.image_alert_title);
        this.f29819e = (TextView) view.findViewById(R.id.image_alert_message);
        TextView textView = (TextView) view.findViewById(R.id.image_alert_save);
        this.f29826q = textView;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.image_alert_share);
        this.f29827r = textView2;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.image_alert_close);
        this.f29828s = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        this.f29820f = (FrameLayout) view.findViewById(R.id.screenshot_image_container);
        this.f29829t = (BearLottieView) view.findViewById(R.id.iv_screenshot_loading);
        this.f29821g = (SubsamplingScaleImageView) view.findViewById(R.id.ssiv_screenshot_image);
        this.f29831v = (FrameLayout) view.findViewById(R.id.external_share_view_container);
        this.f29830u = (ExternalShareView) view.findViewById(R.id.image_alert_external_share_view);
        FrameLayout frameLayout = this.f29831v;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(this);
        }
        m46205j();
        m46207l();
        FrameLayout frameLayout2 = this.f29822h;
        if (frameLayout2 != null) {
            frameLayout2.post(new RunnableC11105d(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m46203a(view);
        m46204i();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", C63690d.f160779a, "Landroid/content/DialogInterface;", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onKey"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.alert.a$f */
    static final class DialogInterface$OnKeyListenerC11107f implements DialogInterface.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ ScreenshotImageAlertFragment f29838a;

        DialogInterface$OnKeyListenerC11107f(ScreenshotImageAlertFragment aVar) {
            this.f29838a = aVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            if (i == 4 && keyEvent != null && keyEvent.getAction() == 1) {
                this.f29838a.mo42350g();
            }
            return true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        this.f29817c = (ScreenshotImageAlertViewModel) C4950k.m20474a(this, ScreenshotImageAlertViewModel.class);
        return layoutInflater.inflate(R.layout.sheet_screenshot_image_alert_fragment, viewGroup, false);
    }
}
