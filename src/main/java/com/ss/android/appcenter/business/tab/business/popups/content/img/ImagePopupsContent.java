package com.ss.android.appcenter.business.tab.business.popups.content.img;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.appcenter.C27528a;
import com.ss.android.appcenter.business.net.p1270a.C27714b;
import com.ss.android.appcenter.business.net.pupups.PopupsConfig;
import com.ss.android.appcenter.business.net.pupups.PopupsData;
import com.ss.android.appcenter.business.net.pupups.PopupsElement;
import com.ss.android.appcenter.business.net.pupups.PopupsNotification;
import com.ss.android.appcenter.business.p1268b.C27688a;
import com.ss.android.appcenter.business.tab.business.popups.BizPopupsHelper;
import com.ss.android.appcenter.business.tab.business.popups.content.BasePopupsContent;
import com.ss.android.appcenter.business.tab.fragmentv3.component.status.TemplateErrorView;
import com.ss.android.appcenter.business.tab.fragmentv3.component.status.TemplateLoadingView;
import com.ss.android.appcenter.business.view.StatusController;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27545j;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.image.api.C38818i;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u0016H\u0002J \u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0016H\u0016J\b\u0010%\u001a\u00020\u0016H\u0016J\b\u0010&\u001a\u00020\u0016H\u0016J\b\u0010'\u001a\u00020\u0016H\u0002J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014XD¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/popups/content/img/ImagePopupsContent;", "Lcom/ss/android/appcenter/business/tab/business/popups/content/BasePopupsContent;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/appcenter/business/net/pupups/PopupsData;", "(Lcom/ss/android/appcenter/business/net/pupups/PopupsData;)V", "errorView", "Lcom/ss/android/appcenter/business/tab/fragmentv3/component/status/TemplateErrorView;", "imgView", "Landroid/widget/ImageView;", "llImgWrapper", "Landroidx/appcompat/widget/LinearLayoutCompat;", "loadingView", "Lcom/ss/android/appcenter/business/tab/fragmentv3/component/status/TemplateLoadingView;", "rootView", "Landroid/view/View;", "scrollContainer", "Landroidx/core/widget/NestedScrollView;", "statusController", "Lcom/ss/android/appcenter/business/view/StatusController;", "tag", "", "adjustImgCenter", "", "imgViewHeight", "", "scrollHeight", "initContent", "listenImageSizeChange", "loadImgContent", "onCreateView", "ctx", "Landroid/content/Context;", "window", "Landroid/widget/PopupWindow;", "parent", "Landroid/view/ViewGroup;", "onDestroy", "onHide", "onShow", "openUrl", "updateContentSize", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.business.tab.business.popups.content.a.a */
public final class ImagePopupsContent extends BasePopupsContent {

    /* renamed from: a */
    public final String f69647a = "AppCenterImagePopupsContent";

    /* renamed from: b */
    public ImageView f69648b;

    /* renamed from: c */
    public TemplateLoadingView f69649c;

    /* renamed from: d */
    public final StatusController f69650d = new StatusController();

    /* renamed from: e */
    public NestedScrollView f69651e;

    /* renamed from: f */
    public final PopupsData f69652f;

    /* renamed from: g */
    private View f69653g;

    /* renamed from: h */
    private LinearLayoutCompat f69654h;

    /* renamed from: i */
    private TemplateErrorView f69655i;

    @Override // com.ss.android.appcenter.business.tab.business.popups.content.IPopupsContent
    /* renamed from: e */
    public void mo99373e() {
    }

    @Override // com.ss.android.appcenter.business.tab.business.popups.content.IPopupsContent
    /* renamed from: f */
    public void mo99374f() {
    }

    @Override // com.ss.android.appcenter.business.tab.business.popups.content.IPopupsContent
    /* renamed from: g */
    public void mo99375g() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/appcenter/business/tab/business/popups/content/img/ImagePopupsContent$loadImgContent$1", "Lcom/ss/android/lark/image/api/SimpleTarget;", "Ljava/io/File;", "onLoadFailed", "", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "onLoadStarted", "placeholder", "onResourceReady", "resource", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.popups.content.a.a$d */
    public static final class C27862d extends C38818i<File> {

        /* renamed from: a */
        final /* synthetic */ ImagePopupsContent f69659a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onStatusChanged"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.appcenter.business.tab.business.popups.content.a.a$d$a */
        static final class C27863a implements StatusController.AbstractC28104a {

            /* renamed from: a */
            final /* synthetic */ C27862d f69660a;

            C27863a(C27862d dVar) {
                this.f69660a = dVar;
            }

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28104a
            public final void onStatusChanged() {
                TemplateLoadingView templateLoadingView = this.f69660a.f69659a.f69649c;
                if (templateLoadingView != null) {
                    templateLoadingView.mo99958b();
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onStatusChanged"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.appcenter.business.tab.business.popups.content.a.a$d$b */
        static final class C27864b implements StatusController.AbstractC28104a {

            /* renamed from: a */
            final /* synthetic */ C27862d f69661a;

            C27864b(C27862d dVar) {
                this.f69661a = dVar;
            }

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28104a
            public final void onStatusChanged() {
                TemplateLoadingView templateLoadingView = this.f69661a.f69659a.f69649c;
                if (templateLoadingView != null) {
                    templateLoadingView.mo99957a();
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onStatusChanged"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.appcenter.business.tab.business.popups.content.a.a$d$c */
        public static final class C27865c implements StatusController.AbstractC28104a {

            /* renamed from: a */
            final /* synthetic */ C27862d f69662a;

            C27865c(C27862d dVar) {
                this.f69662a = dVar;
            }

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28104a
            public final void onStatusChanged() {
                TemplateLoadingView templateLoadingView = this.f69662a.f69659a.f69649c;
                if (templateLoadingView != null) {
                    templateLoadingView.mo99958b();
                }
                this.f69662a.f69659a.mo99378j();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C27862d(ImagePopupsContent aVar) {
            this.f69659a = aVar;
        }

        @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
        /* renamed from: a */
        public void mo49247a(Drawable drawable) {
            String str;
            String str2 = this.f69659a.f69647a;
            StringBuilder sb = new StringBuilder();
            sb.append("load image content failed,nId=");
            PopupsNotification notification = this.f69659a.f69652f.getNotification();
            if (notification != null) {
                str = notification.getId();
            } else {
                str = null;
            }
            sb.append(str);
            C28184h.m103250d(str2, sb.toString());
            this.f69659a.f69650d.mo100034a(StatusController.Status.ERROR, new C27863a(this));
        }

        @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
        /* renamed from: b */
        public void mo99365b(Drawable drawable) {
            String str;
            String str2 = this.f69659a.f69647a;
            StringBuilder sb = new StringBuilder();
            sb.append("load image start,nId=");
            PopupsNotification notification = this.f69659a.f69652f.getNotification();
            if (notification != null) {
                str = notification.getId();
            } else {
                str = null;
            }
            sb.append(str);
            C28184h.m103250d(str2, sb.toString());
            this.f69659a.f69650d.mo100034a(StatusController.Status.LOADING, new C27864b(this));
        }

        /* renamed from: a */
        public void mo49248a(File file) {
            String str;
            if (file != null) {
                String str2 = this.f69659a.f69647a;
                StringBuilder sb = new StringBuilder();
                sb.append("load image content success,nId=");
                PopupsNotification notification = this.f69659a.f69652f.getNotification();
                if (notification != null) {
                    str = notification.getId();
                } else {
                    str = null;
                }
                sb.append(str);
                C28184h.m103250d(str2, sb.toString());
                ImageView imageView = this.f69659a.f69648b;
                if (imageView != null) {
                    C27688a.m101212a(imageView, file);
                    this.f69659a.f69650d.mo100034a(StatusController.Status.CONTENT, new C27865c(this));
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo99378j() {
        ViewTreeObserver viewTreeObserver;
        ImageView imageView = this.f69648b;
        if (imageView != null && (viewTreeObserver = imageView.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC27861c(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/appcenter/business/tab/business/popups/content/img/ImagePopupsContent$listenImageSizeChange$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.popups.content.a.a$c */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC27861c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ ImagePopupsContent f69658a;

        public void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver;
            int i;
            ImageView imageView = this.f69658a.f69648b;
            if (imageView != null && (viewTreeObserver = imageView.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
                ImageView imageView2 = this.f69658a.f69648b;
                int i2 = 0;
                if (imageView2 != null) {
                    i = imageView2.getMeasuredHeight();
                } else {
                    i = 0;
                }
                if (i > 0) {
                    NestedScrollView nestedScrollView = this.f69658a.f69651e;
                    if (nestedScrollView != null) {
                        i2 = nestedScrollView.getMeasuredHeight();
                    }
                    this.f69658a.mo99372a(i, i2);
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC27861c(ImagePopupsContent aVar) {
            this.f69658a = aVar;
        }
    }

    /* renamed from: i */
    public final void mo99377i() {
        PopupsNotification notification;
        PopupsElement contentElement;
        String imgKey;
        Context context;
        if (!this.f69650d.mo100039c() && (notification = this.f69652f.getNotification()) != null && (contentElement = notification.contentElement()) != null && (imgKey = contentElement.getImgKey()) != null) {
            String a = BizPopupsHelper.f69630a.mo99359a(imgKey);
            ImageView imageView = this.f69648b;
            if (imageView != null) {
                context = imageView.getContext();
            } else {
                context = null;
            }
            C27688a.m101211a(context, a, C27714b.m101357a(), new C27862d(this));
        }
    }

    /* renamed from: h */
    public final void mo99376h() {
        PopupsElement contentElement;
        String url;
        PopupsNotification notification = this.f69652f.getNotification();
        if (notification != null && (contentElement = notification.contentElement()) != null && (url = contentElement.getUrl()) != null) {
            String str = this.f69647a;
            C28184h.m103250d(str, "open image popups url," + url);
            C27548m m = C27548m.m100547m();
            Intrinsics.checkExpressionValueIsNotNull(m, "Providers.getInstance()");
            AbstractC27545j f = m.mo98222f();
            C27528a a = C27528a.m100471a();
            Intrinsics.checkExpressionValueIsNotNull(a, "AppCenter.getInstance()");
            f.mo98206c(a.mo98143b(), url);
        }
    }

    /* renamed from: k */
    private final void m101752k() {
        View view = this.f69653g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        this.f69651e = (NestedScrollView) view.findViewById(R.id.sv_img_container);
        View view2 = this.f69653g;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        this.f69648b = (ImageView) view2.findViewById(R.id.iv_img_biz_popups);
        View view3 = this.f69653g;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        this.f69654h = (LinearLayoutCompat) view3.findViewById(R.id.ll_img_wrapper);
        View view4 = this.f69653g;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        this.f69649c = (TemplateLoadingView) view4.findViewById(R.id.loading_img_biz_popups);
        View view5 = this.f69653g;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        this.f69655i = (TemplateErrorView) view5.findViewById(R.id.error_img_biz_popups);
        this.f69650d.mo100032a(this.f69648b, StatusController.Status.CONTENT);
        this.f69650d.mo100032a(this.f69649c, StatusController.Status.LOADING);
        this.f69650d.mo100032a(this.f69655i, StatusController.Status.ERROR);
        ImageView imageView = this.f69648b;
        if (imageView != null) {
            imageView.setOnClickListener(new View$OnClickListenerC27859a(this));
        }
        TemplateErrorView templateErrorView = this.f69655i;
        if (templateErrorView != null) {
            templateErrorView.setOnClickListener(new View$OnClickListenerC27860b(this));
        }
        m101751a(this.f69652f);
        mo99377i();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.popups.content.a.a$a */
    public static final class View$OnClickListenerC27859a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImagePopupsContent f69656a;

        View$OnClickListenerC27859a(ImagePopupsContent aVar) {
            this.f69656a = aVar;
        }

        public final void onClick(View view) {
            this.f69656a.mo99376h();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.popups.content.a.a$b */
    public static final class View$OnClickListenerC27860b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImagePopupsContent f69657a;

        View$OnClickListenerC27860b(ImagePopupsContent aVar) {
            this.f69657a = aVar;
        }

        public final void onClick(View view) {
            this.f69657a.mo99377i();
        }
    }

    public ImagePopupsContent(PopupsData popupsData) {
        Intrinsics.checkParameterIsNotNull(popupsData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f69652f = popupsData;
    }

    /* renamed from: a */
    private final void m101751a(PopupsData popupsData) {
        PopupsConfig popupsConfig;
        float f;
        float f2;
        float f3;
        int i;
        PopupsNotification notification = popupsData.getNotification();
        if (notification != null) {
            popupsConfig = notification.contentConfig();
        } else {
            popupsConfig = null;
        }
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
        } else {
            f3 = BitmapDescriptorFactory.HUE_RED;
        }
        View view = this.f69653g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        int a = C28209p.m103293a(view.getContext(), f);
        if (a > mo99369c()) {
            a = mo99369c();
        }
        if (a < mo99367a()) {
            a = mo99367a();
        }
        if (f3 > BitmapDescriptorFactory.HUE_RED) {
            i = (int) (((float) a) / f3);
        } else {
            i = mo99368b();
        }
        if (i > mo99370d()) {
            i = mo99370d();
        }
        if (i < mo99368b()) {
            a = (int) (((float) a) / (((float) i) / ((float) mo99368b())));
            i = mo99368b();
        }
        if (a > mo99369c()) {
            a = mo99369c();
        }
        View view2 = this.f69653g;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.width = a;
        layoutParams.height = i;
        View view3 = this.f69653g;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        view3.setLayoutParams(layoutParams);
        String str = this.f69647a;
        C28184h.m103250d(str, "update image content size,width=" + a + ",height=" + i);
    }

    /* renamed from: a */
    public final void mo99372a(int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        LinearLayoutCompat linearLayoutCompat = this.f69654h;
        if (linearLayoutCompat != null) {
            layoutParams = linearLayoutCompat.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (i > i2) {
            if (layoutParams != null) {
                layoutParams.height = -2;
            }
        } else if (layoutParams != null) {
            layoutParams.height = -1;
        }
        LinearLayoutCompat linearLayoutCompat2 = this.f69654h;
        if (linearLayoutCompat2 != null) {
            linearLayoutCompat2.setLayoutParams(layoutParams);
        }
        LinearLayoutCompat linearLayoutCompat3 = this.f69654h;
        if (linearLayoutCompat3 != null) {
            linearLayoutCompat3.requestLayout();
        }
    }

    @Override // com.ss.android.appcenter.business.tab.business.popups.content.IPopupsContent
    /* renamed from: a */
    public View mo99371a(Context context, PopupWindow popupWindow, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        Intrinsics.checkParameterIsNotNull(popupWindow, "window");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(context).inflate(R.layout.appcenter_biz_popups_image_layout, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(ctx)…ge_layout, parent, false)");
        this.f69653g = inflate;
        m101752k();
        View view = this.f69653g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return view;
    }
}
