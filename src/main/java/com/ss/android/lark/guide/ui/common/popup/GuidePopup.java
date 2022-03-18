package com.ss.android.lark.guide.ui.common.popup;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.guide.ui.common.popup.view.MaskView;
import com.ss.android.lark.guide.ui.common.popup.view.TipsPopupWindow;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.ViewUtils;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0003J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\"H\u0002J\u0010\u0010'\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0015H\u0002J\b\u0010+\u001a\u00020)H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/lark/guide/ui/common/popup/GuidePopup;", "Lcom/ss/android/lark/guide/ui/common/popup/IGuide;", "params", "Lcom/ss/android/lark/guide/ui/common/popup/BuildParams;", "(Lcom/ss/android/lark/guide/ui/common/popup/BuildParams;)V", "bottomBaseLine", "", "containerViewWH", "Landroid/util/Size;", "contentView", "Landroid/widget/LinearLayout;", "leftBaseLine", "maskView", "Lcom/ss/android/lark/guide/ui/common/popup/view/MaskView;", "popupWindow", "Lcom/ss/android/lark/guide/ui/common/popup/view/TipsPopupWindow;", "rightBaseLine", "screenHeight", "screenWidth", "topBaseLine", "addMask", "", "activity", "Landroid/app/Activity;", "anchorView", "Landroid/view/View;", "anchorRect", "Landroid/graphics/Rect;", "calculateAnchorRect", "close", "computeOnAlign", "Landroid/graphics/Point;", "targetPoint", "popupCell", "Lcom/ss/android/lark/guide/ui/common/popup/IPopupCell;", "createView", "context", "Landroid/content/Context;", "component", "initCommonParams", "isShowing", "", "removeMask", "show", "Companion", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guide.ui.common.popup.c */
public final class GuidePopup implements IGuide {

    /* renamed from: c */
    public static final Companion f99454c = new Companion(null);

    /* renamed from: a */
    public MaskView f99455a;

    /* renamed from: b */
    public final BuildParams f99456b;

    /* renamed from: d */
    private int f99457d;

    /* renamed from: e */
    private int f99458e;

    /* renamed from: f */
    private int f99459f;

    /* renamed from: g */
    private int f99460g;

    /* renamed from: h */
    private int f99461h;

    /* renamed from: i */
    private int f99462i;

    /* renamed from: j */
    private TipsPopupWindow f99463j;

    /* renamed from: k */
    private LinearLayout f99464k;

    /* renamed from: l */
    private Size f99465l = new Size(0, 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/guide/ui/common/popup/GuidePopup$Companion;", "", "()V", "TAG", "", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.common.popup.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.IGuide
    /* renamed from: c */
    public void mo141708c() {
        TipsPopupWindow aVar = this.f99463j;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.IGuide
    /* renamed from: d */
    public boolean mo141709d() {
        TipsPopupWindow aVar = this.f99463j;
        if (aVar != null) {
            return aVar.isShowing();
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "onDismiss", "com/ss/android/lark/guide/ui/common/popup/GuidePopup$show$1$4"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.common.popup.c$d */
    static final class C38691d implements PopupWindow.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ GuidePopup f99470a;

        /* renamed from: b */
        final /* synthetic */ View f99471b;

        /* renamed from: c */
        final /* synthetic */ Point f99472c;

        C38691d(GuidePopup cVar, View view, Point point) {
            this.f99470a = cVar;
            this.f99471b = view;
            this.f99472c = point;
        }

        public final void onDismiss() {
            this.f99470a.mo141706a();
            PopupWindow.OnDismissListener n = this.f99470a.f99456b.mo141704n();
            if (n != null) {
                n.onDismiss();
            }
        }
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.IGuide
    /* renamed from: b */
    public boolean mo141707b() {
        Activity activity;
        boolean z;
        boolean z2;
        View b = this.f99456b.mo141690b();
        if (b == null) {
            Log.m165389i("GuidePopup", "params.anchorView is null");
            return false;
        } else if (b.getWindowToken() == null) {
            Log.m165389i("GuidePopup", "anchorView.windowToken is null, anchorView.isAttachedToWindow=" + b.isAttachedToWindow());
            return false;
        } else {
            Component a = this.f99456b.mo141689a();
            if (a != null) {
                PopupCell a2 = PopupCell.f99487a.mo141733a(a);
                Context context = b.getContext();
                if (context instanceof Activity) {
                    activity = (Activity) context;
                } else if (this.f99456b.mo141693e() != null) {
                    activity = this.f99456b.mo141693e();
                } else {
                    activity = ViewUtils.m224141a(context);
                    if (activity == null) {
                        Log.m165389i("GuidePopup", "not found activity");
                        return false;
                    }
                }
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                m152730a(context);
                PopupCell iVar = a2;
                this.f99464k = m152728a(context, iVar);
                Rect a3 = m152727a(b);
                LinearLayout linearLayout = this.f99464k;
                if (linearLayout == null) {
                    Intrinsics.throwNpe();
                }
                Point a4 = m152726a(a2.mo141732a(linearLayout, this.f99465l, a3), iVar);
                try {
                    int width = this.f99465l.getWidth();
                    int height = this.f99465l.getHeight();
                    if (width > 0) {
                        if (height > 0) {
                            TipsPopupWindow aVar = new TipsPopupWindow(this.f99464k, width, height);
                            Boolean m = this.f99456b.mo141703m();
                            if (m != null) {
                                z = m.booleanValue();
                            } else {
                                z = true;
                            }
                            aVar.setFocusable(z);
                            Boolean c = this.f99456b.mo141691c();
                            if (c != null) {
                                z2 = c.booleanValue();
                            } else {
                                z2 = true;
                            }
                            aVar.setOutsideTouchable(z2);
                            OnBackPressedListener l = this.f99456b.mo141702l();
                            if (l != null) {
                                aVar.setFocusable(true);
                                aVar.mo141745a(l);
                            }
                            aVar.setBackgroundDrawable(new ColorDrawable(0));
                            aVar.setAnimationStyle(2131886490);
                            aVar.setOnDismissListener(new C38691d(this, b, a4));
                            aVar.showAtLocation(b, 8388659, a4.x, a4.y);
                            this.f99463j = aVar;
                            if (aVar.isShowing()) {
                                m152729a(activity, b, a3);
                                return true;
                            }
                            return false;
                        }
                    }
                    Log.m165397w("GuidePopup", "show error, width=" + width + ", height=" + height);
                    return false;
                } catch (Exception e) {
                    Log.m165384e("GuidePopup", "show error", e);
                }
            } else {
                Log.m165389i("GuidePopup", "params.component is null");
                return false;
            }
        }
    }

    /* renamed from: a */
    public final void mo141706a() {
        ViewParent parent;
        MaskView maskView = this.f99455a;
        if (maskView != null && (parent = maskView.getParent()) != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, (float) BitmapDescriptorFactory.HUE_RED);
            alphaAnimation.setDuration(200);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            alphaAnimation.setAnimationListener(new animationAnimation$AnimationListenerC38690c(parent, maskView, this));
            maskView.startAnimation(alphaAnimation);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.common.popup.c$b */
    public static final class View$OnClickListenerC38689b implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC38689b f99466a = new View$OnClickListenerC38689b();

        View$OnClickListenerC38689b() {
        }

        public final void onClick(View view) {
            Log.m165379d("GuidePopup", "MaskView click");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b¸\u0006\n"}, d2 = {"com/ss/android/lark/guide/ui/common/popup/GuidePopup$removeMask$1$1$1$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "guide-ui_release", "com/ss/android/lark/guide/ui/common/popup/GuidePopup$$special$$inlined$apply$lambda$1", "com/ss/android/lark/guide/ui/common/popup/GuidePopup$$special$$inlined$let$lambda$1"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.common.popup.c$c  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC38690c implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewParent f99467a;

        /* renamed from: b */
        final /* synthetic */ MaskView f99468b;

        /* renamed from: c */
        final /* synthetic */ GuidePopup f99469c;

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        public void onAnimationEnd(Animation animation) {
            ViewParent viewParent = this.f99467a;
            if (viewParent != null) {
                ((ViewGroup) viewParent).removeView(this.f99469c.f99455a);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }

        animationAnimation$AnimationListenerC38690c(ViewParent viewParent, MaskView maskView, GuidePopup cVar) {
            this.f99467a = viewParent;
            this.f99468b = maskView;
            this.f99469c = cVar;
        }
    }

    public GuidePopup(BuildParams aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        this.f99456b = aVar;
    }

    /* renamed from: a */
    private final Rect m152727a(View view) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = iArr[0] + measuredWidth;
        rect.bottom = iArr[1] + measuredHeight;
        return rect;
    }

    /* renamed from: a */
    private final void m152730a(Context context) {
        this.f99457d = DeviceUtils.getScreenWidth(context);
        this.f99458e = DeviceUtils.getScreenHeight(context);
        int dp2px = UIUtils.dp2px(context, 12.0f);
        this.f99459f = dp2px;
        this.f99460g = this.f99457d - dp2px;
        this.f99461h = StatusBarUtil.getStatusBarHeight(context) + dp2px;
        this.f99462i = this.f99458e - dp2px;
    }

    /* renamed from: a */
    private final LinearLayout m152728a(Context context, IPopupCell gVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        gVar.mo141730a(context, linearLayout, this);
        LinearLayout linearLayout2 = linearLayout;
        this.f99465l = new Size(UIUtils.getWidth(linearLayout2), UIUtils.getHeight(linearLayout2));
        linearLayout.setFocusable(true);
        linearLayout.setFocusableInTouchMode(true);
        return linearLayout;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.graphics.Point m152726a(android.graphics.Point r5, com.ss.android.lark.guide.ui.common.popup.IPopupCell r6) {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.guide.ui.common.popup.GuidePopup.m152726a(android.graphics.Point, com.ss.android.lark.guide.ui.common.popup.g):android.graphics.Point");
    }

    /* renamed from: a */
    private final void m152729a(Activity activity, View view, Rect rect) {
        if (!Intrinsics.areEqual((Object) this.f99456b.mo141692d(), (Object) true)) {
            return;
        }
        if (this.f99456b.mo141696g() != null || this.f99456b.mo141695f() != null) {
            this.f99455a = new MaskView(view.getContext());
            Integer g = this.f99456b.mo141696g();
            if (g != null) {
                int intValue = g.intValue();
                MaskView maskView = this.f99455a;
                if (maskView == null) {
                    Intrinsics.throwNpe();
                }
                maskView.setFullingColor(intValue);
            }
            Integer f = this.f99456b.mo141695f();
            if (f != null) {
                int intValue2 = f.intValue();
                MaskView maskView2 = this.f99455a;
                if (maskView2 == null) {
                    Intrinsics.throwNpe();
                }
                maskView2.setFullingAlpha(intValue2);
            }
            Boolean h = this.f99456b.mo141697h();
            if (h != null) {
                boolean booleanValue = h.booleanValue();
                MaskView maskView3 = this.f99455a;
                if (maskView3 == null) {
                    Intrinsics.throwNpe();
                }
                maskView3.setTargetHighlight(booleanValue);
            }
            HighlightHandler k = this.f99456b.mo141701k();
            if (k != null) {
                Rect computeHighlightArea = k.computeHighlightArea(rect);
                MaskView maskView4 = this.f99455a;
                if (maskView4 == null) {
                    Intrinsics.throwNpe();
                }
                maskView4.setTargetRect(computeHighlightArea);
            }
            Integer i = this.f99456b.mo141699i();
            if (i != null) {
                int intValue3 = i.intValue();
                MaskView maskView5 = this.f99455a;
                if (maskView5 == null) {
                    Intrinsics.throwNpe();
                }
                maskView5.setHighlightTargetCorner(intValue3);
            }
            Integer j = this.f99456b.mo141700j();
            if (j != null) {
                int intValue4 = j.intValue();
                MaskView maskView6 = this.f99455a;
                if (maskView6 == null) {
                    Intrinsics.throwNpe();
                }
                maskView6.setHighTargetGraphStyle(intValue4);
            }
            if (!Intrinsics.areEqual((Object) this.f99456b.mo141691c(), (Object) true)) {
                MaskView maskView7 = this.f99455a;
                if (maskView7 == null) {
                    Intrinsics.throwNpe();
                }
                maskView7.setOnClickListener(View$OnClickListenerC38689b.f99466a);
            }
            Window window = activity.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
            View decorView = window.getDecorView();
            if (decorView != null) {
                ((ViewGroup) decorView).addView(this.f99455a);
                MaskView maskView8 = this.f99455a;
                if (maskView8 == null) {
                    Intrinsics.throwNpe();
                }
                AlphaAnimation alphaAnimation = new AlphaAnimation((float) BitmapDescriptorFactory.HUE_RED, 1.0f);
                alphaAnimation.setDuration(200);
                alphaAnimation.setInterpolator(new DecelerateInterpolator());
                maskView8.startAnimation(alphaAnimation);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }
}
