package com.ss.android.appcenter.business.tab.business.popups;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.net.pupups.PopupsData;
import com.ss.android.appcenter.business.tab.business.popups.content.IPopupsContent;
import com.ss.android.appcenter.business.tab.business.popups.content.img.ImagePopupsContent;
import com.ss.android.appcenter.business.tab.business.popups.content.video.VideoPopupsContent;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28190k;
import javax.annotation.Nonnull;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0019H\u0003J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0006\u0010$\u001a\u00020\u0019J\u0012\u0010%\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\"\u0010%\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u001bH\u0016J*\u0010%\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u001bH\u0016J*\u0010)\u001a\u00020\u00192\b\u0010*\u001a\u0004\u0018\u00010\b2\u0006\u0010(\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001bH\u0016J\u0006\u0010-\u001a\u00020\u0019R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/popups/BizPopupsWindow;", "Lcom/larksuite/framework/ui/BasePopupWindow;", "Landroidx/lifecycle/LifecycleEventObserver;", "ctx", "Landroid/content/Context;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "anchor", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/appcenter/business/net/pupups/PopupsData;", "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Landroid/view/View;Lcom/ss/android/appcenter/business/net/pupups/PopupsData;)V", "animDuration", "", "animatorSet", "Landroid/animation/AnimatorSet;", "contentContainer", "Landroid/widget/FrameLayout;", "popupsContent", "Lcom/ss/android/appcenter/business/tab/business/popups/content/IPopupsContent;", "tag", "", "vBgMask", "vPopupsContent", "dismiss", "", "getAnimationStyle", "", "initConfig", "initContent", "initView", "onStateChanged", "owner", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "show", "showAsDropDown", "xoff", "yoff", "gravity", "showAtLocation", "parent", "x", "y", "superDismiss", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BizPopupsWindow extends BasePopupWindow implements AbstractC1168n {

    /* renamed from: a */
    private final String f69617a = "AppCenterBizPopupsWindow";

    /* renamed from: b */
    private FrameLayout f69618b;

    /* renamed from: c */
    private View f69619c;

    /* renamed from: d */
    private View f69620d;

    /* renamed from: e */
    private final AnimatorSet f69621e = new AnimatorSet();

    /* renamed from: f */
    private final long f69622f = 300;

    /* renamed from: g */
    private IPopupsContent f69623g;

    /* renamed from: h */
    private final Context f69624h;

    /* renamed from: i */
    private final Lifecycle f69625i;

    /* renamed from: j */
    private final View f69626j;

    /* renamed from: k */
    private final PopupsData f69627k;

    public int getAnimationStyle() {
        return R.style.AnimationDialog;
    }

    @Override // com.larksuite.framework.ui.BasePopupWindow
    public void showAsDropDown(View view) {
    }

    @Override // com.larksuite.framework.ui.BasePopupWindow
    public void showAsDropDown(View view, int i, int i2) {
    }

    @Override // com.larksuite.framework.ui.BasePopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
    }

    @Override // com.larksuite.framework.ui.BasePopupWindow
    public void showAtLocation(View view, int i, int i2, int i3) {
    }

    /* renamed from: b */
    public final void mo99355b() {
        IPopupsContent bVar = this.f69623g;
        if (bVar != null) {
            bVar.mo99375g();
        }
        this.f69625i.removeObserver(this);
        super.dismiss();
    }

    /* renamed from: c */
    private final void m101722c() {
        setFocusable(true);
        setBackgroundDrawable(new BitmapDrawable((Resources) null, (Bitmap) null));
        setClippingEnabled(false);
        setSoftInputMode(48);
        setWidth(-1);
        setHeight(C28190k.m103259a(this.f69624h) + C28190k.m103261c(this.f69624h) + C28190k.m103262d(this.f69624h));
        setContentView(LayoutInflater.from(this.f69624h).inflate(R.layout.appcenter_biz_popups_layout, (ViewGroup) null, false));
        this.f69625i.addObserver(this);
    }

    /* renamed from: d */
    private final void m101723d() {
        View findViewById = getContentView().findViewById(R.id.v_bg_mask);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "contentView.findViewById(R.id.v_bg_mask)");
        this.f69619c = findViewById;
        View findViewById2 = getContentView().findViewById(R.id.cl_biz_popups_content);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "contentView.findViewById…id.cl_biz_popups_content)");
        this.f69620d = findViewById2;
        View findViewById3 = getContentView().findViewById(R.id.fl_content_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "contentView.findViewById….id.fl_content_container)");
        this.f69618b = (FrameLayout) findViewById3;
        getContentView().findViewById(R.id.iv_close_biz_popups).setOnClickListener(new View$OnClickListenerC27853b(this));
    }

    /* renamed from: e */
    private final void m101724e() {
        ImagePopupsContent aVar;
        int i = C27858b.f69641a[this.f69627k.contentType().ordinal()];
        View view = null;
        if (i == 1) {
            aVar = new ImagePopupsContent(this.f69627k);
        } else if (i != 2) {
            aVar = null;
        } else {
            aVar = new VideoPopupsContent(this.f69627k);
        }
        this.f69623g = aVar;
        if (aVar == null) {
            mo99355b();
            C28184h.m103248b(this.f69617a, "can't go this branch! popups content type is error");
            return;
        }
        if (aVar != null) {
            Context context = this.f69624h;
            BizPopupsWindow bizPopupsWindow = this;
            FrameLayout frameLayout = this.f69618b;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentContainer");
            }
            view = aVar.mo99371a(context, bizPopupsWindow, frameLayout);
        }
        FrameLayout frameLayout2 = this.f69618b;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentContainer");
        }
        frameLayout2.addView(view);
    }

    /* renamed from: a */
    public final void mo99354a() {
        super.showAtLocation(this.f69626j, 17, 0, 0);
        View view = this.f69620d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vPopupsContent");
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", BitmapDescriptorFactory.HUE_RED, 1.0f);
        View view2 = this.f69620d;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vPopupsContent");
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", BitmapDescriptorFactory.HUE_RED, 1.0f);
        View view3 = this.f69619c;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vBgMask");
        }
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view3, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.f69621e.playTogether(ofFloat, ofFloat2, ofFloat3);
        this.f69621e.setDuration(this.f69622f);
        this.f69621e.start();
    }

    @Override // com.larksuite.framework.ui.BasePopupWindow
    public void dismiss() {
        if (!this.f69621e.isRunning()) {
            this.f69621e.cancel();
            View view = this.f69620d;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vPopupsContent");
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, BitmapDescriptorFactory.HUE_RED);
            View view2 = this.f69620d;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vPopupsContent");
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", 1.0f, BitmapDescriptorFactory.HUE_RED);
            View view3 = this.f69619c;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vBgMask");
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view3, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED);
            this.f69621e.playTogether(ofFloat, ofFloat2, ofFloat3);
            this.f69621e.setDuration(this.f69622f);
            this.f69621e.removeAllListeners();
            this.f69621e.addListener(new C27852a(this));
            this.f69621e.start();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/appcenter/business/tab/business/popups/BizPopupsWindow$dismiss$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.popups.BizPopupsWindow$a */
    public static final class C27852a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ BizPopupsWindow f69628a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C27852a(BizPopupsWindow bizPopupsWindow) {
            this.f69628a = bizPopupsWindow;
        }

        public void onAnimationEnd(Animator animator) {
            this.f69628a.mo99355b();
            BizPopupsHelper.f69630a.mo99360a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.popups.BizPopupsWindow$b */
    public static final class View$OnClickListenerC27853b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BizPopupsWindow f69629a;

        View$OnClickListenerC27853b(BizPopupsWindow bizPopupsWindow) {
            this.f69629a = bizPopupsWindow;
        }

        public final void onClick(View view) {
            this.f69629a.dismiss();
        }
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        IPopupsContent bVar;
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Intrinsics.checkParameterIsNotNull(event, "event");
        int i = C27858b.f69642b[event.ordinal()];
        if (i == 1) {
            IPopupsContent bVar2 = this.f69623g;
            if (bVar2 != null) {
                bVar2.mo99374f();
            }
        } else if (i == 2) {
            IPopupsContent bVar3 = this.f69623g;
            if (bVar3 != null) {
                bVar3.mo99373e();
            }
        } else if (i == 3 && (bVar = this.f69623g) != null) {
            bVar.mo99375g();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BizPopupsWindow(@Nonnull Context context, @Nonnull Lifecycle lifecycle, @Nonnull View view, @Nonnull PopupsData popupsData) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        Intrinsics.checkParameterIsNotNull(lifecycle, "lifecycle");
        Intrinsics.checkParameterIsNotNull(view, "anchor");
        Intrinsics.checkParameterIsNotNull(popupsData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f69624h = context;
        this.f69625i = lifecycle;
        this.f69626j = view;
        this.f69627k = popupsData;
        m101722c();
        m101723d();
        m101724e();
    }
}
