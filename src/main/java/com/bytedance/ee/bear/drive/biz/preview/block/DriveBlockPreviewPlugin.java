package com.bytedance.ee.bear.drive.biz.preview.block;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.BasePlugin;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.biz.preview.screen.DriveFullScreenVM;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.view.preview.block.DriveBlockPreviewVM;
import com.bytedance.ee.bear.drive.view.preview.block.DriveMainRootLayout;
import com.bytedance.ee.bear.drive.view.preview.block.IBlockClickInterceptor;
import com.bytedance.ee.bear.drive.view.preview.media.DriveMediaDurationVm;
import com.bytedance.ee.bear.drive.view.preview.media.DriveMediaVM;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.icon.C7713a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13672c;
import com.bytedance.ee.util.p718t.C13727b;
import com.bytedance.ee.util.p718t.C13749l;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.slideback.SlideFrameLayout;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001EB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001e\u001a\u00020\u001cJ\n\u0010\u001f\u001a\u0004\u0018\u00010\u0012H\u0002J\u0014\u0010 \u001a\u0004\u0018\u00010\u00122\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u001cH\u0002J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u0005H\u0002J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*H\u0016J\u0018\u0010+\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0017J\b\u0010.\u001a\u00020\u0005H\u0016J\u0018\u0010/\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u00100\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u0014H\u0002J\b\u00102\u001a\u00020\u001cH\u0002J\b\u00103\u001a\u00020\u001cH\u0002J\u0001\u00104\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u00142\u0006\u0010:\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u00142\u0006\u0010<\u001a\u00020\u00142\u0006\u0010=\u001a\u00020\u00142\u0006\u0010>\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u00142\u0006\u0010@\u001a\u00020\u00142\u0006\u0010A\u001a\u00020\u00142\u0006\u0010B\u001a\u00020\u00142\n\b\u0002\u0010C\u001a\u0004\u0018\u00010DH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/block/DriveBlockPreviewPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "Lcom/bytedance/ee/bear/facade/common/BackPressHandler;", "()V", "animating", "", "animatingBgAlphaView", "Landroid/view/View;", "blockTitleView", "Lcom/bytedance/ee/bear/drive/biz/preview/block/DriveBlockTitleView;", "enableSlideDown", "hideAnimSet", "Ljava/util/ArrayList;", "Landroid/animation/ValueAnimator;", "Lkotlin/collections/ArrayList;", "mainRootLayout", "Lcom/bytedance/ee/bear/drive/view/preview/block/DriveMainRootLayout;", "mainTitleBarRoot", "Landroid/view/ViewGroup;", "middleLeftMargin", "", "getMiddleLeftMargin", "()I", "middleTopMargin", "getMiddleTopMargin", "placeContentView", "showAnimSet", "cancelAnim", "", "disableMultiTaskSlide", "enableMultiTaskSlide", "findFullScreenAttachRoot", "findPlaceholderView", "parent", "Landroid/view/ViewParent;", "getBlockLocation", "", "handleDetachMainLayout", "handlePreviewStateAnim", "withCurrentState", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "onAttachToUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "onBackPressed", "onDetachFromUIContainer", "reportSlideEvent", ShareHitPoint.f121869d, "setBlockClickListener", "setSlideListener", "startAnim", "dur", "", "layoutParam", "Landroid/widget/FrameLayout$LayoutParams;", "startW", "endW", "startH", "endH", "startTopMargin", "endTopMargin", "startLeftMargin", "endLeftMargin", "titleHStart", "titleHEnd", "listener", "Landroid/animation/Animator$AnimatorListener;", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveBlockPreviewPlugin extends AbsDrivePlugin implements AbstractC7666d {
    public static final Companion Companion = new Companion(null);
    public boolean animating;
    public View animatingBgAlphaView;
    public DriveBlockTitleView blockTitleView;
    public boolean enableSlideDown;
    public ArrayList<ValueAnimator> hideAnimSet;
    public DriveMainRootLayout mainRootLayout;
    public ViewGroup mainTitleBarRoot;
    private final int middleLeftMargin = C13749l.m55738a(24);
    private final int middleTopMargin = C13749l.m55738a(45);
    public ViewGroup placeContentView;
    public ArrayList<ValueAnimator> showAnimSet;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/block/DriveBlockPreviewPlugin$Companion;", "", "()V", "ENTER_ANIM_DUR_STEP_1", "", "ENTER_ANIM_DUR_STEP_2", "EXIST_ANIM_DUR_STEP_1", "EXIST_ANIM_DUR_STEP_2", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockPreviewPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getMiddleLeftMargin() {
        return this.middleLeftMargin;
    }

    public final int getMiddleTopMargin() {
        return this.middleTopMargin;
    }

    private final void setBlockClickListener() {
        DriveBlockPreviewVM driveBlockPreviewVM = (DriveBlockPreviewVM) viewModel(DriveBlockPreviewVM.class);
        DriveMainRootLayout driveMainRootLayout = this.mainRootLayout;
        if (driveMainRootLayout != null) {
            driveMainRootLayout.setInterceptClickListener(new View$OnClickListenerC6559l(this, driveBlockPreviewVM));
        }
    }

    private final void setSlideListener() {
        float a = ((float) (C13749l.m55736a() * 2)) / 3.0f;
        AbstractC1142af a2 = new C1144ai(getActivity()).mo6005a(DriveFullScreenVM.class);
        Intrinsics.checkExpressionValueIsNotNull(a2, "ViewModelProvider(activi…FullScreenVM::class.java)");
        DriveFullScreenVM bVar = (DriveFullScreenVM) a2;
        DriveMainRootLayout driveMainRootLayout = this.mainRootLayout;
        if (driveMainRootLayout != null) {
            driveMainRootLayout.setSlideListener(new C6560m(this, a, bVar));
        }
    }

    public final void disableMultiTaskSlide() {
        View view;
        C13479a.m54764b("DriveBlockPreviewPlugin", "disableMultiTaskSlide()...");
        FragmentActivity activity = getActivity();
        ViewParent viewParent = null;
        if (activity != null) {
            view = activity.findViewById(16908290);
        } else {
            view = null;
        }
        if (view != null) {
            viewParent = view.getParent();
        }
        if (viewParent instanceof SlideFrameLayout) {
            C13479a.m54764b("DriveBlockPreviewPlugin", "SlideFrameLayout exist, setCanSlide = false");
            ViewParent parent = view.getParent();
            if (parent != null) {
                ((SlideFrameLayout) parent).setSlideable(false);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.slideback.SlideFrameLayout");
        }
    }

    public final void enableMultiTaskSlide() {
        View view;
        C13479a.m54764b("DriveBlockPreviewPlugin", "enableMultiTaskSlide()...");
        FragmentActivity activity = getActivity();
        ViewParent viewParent = null;
        if (activity != null) {
            view = activity.findViewById(16908290);
        } else {
            view = null;
        }
        if (view != null) {
            viewParent = view.getParent();
        }
        if (viewParent instanceof SlideFrameLayout) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                ((SlideFrameLayout) parent).setSlideable(true);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.slideback.SlideFrameLayout");
        }
    }

    public final int[] getBlockLocation() {
        int[] iArr = {0, 0};
        ViewGroup viewGroup = this.placeContentView;
        if (viewGroup != null) {
            viewGroup.getLocationOnScreen(iArr);
        }
        int[] iArr2 = {0, 0};
        ViewGroup findFullScreenAttachRoot = findFullScreenAttachRoot();
        if (findFullScreenAttachRoot != null) {
            findFullScreenAttachRoot.getLocationOnScreen(iArr2);
        }
        iArr[1] = iArr[1] - iArr2[1];
        return iArr;
    }

    public final void handleDetachMainLayout() {
        ViewParent viewParent;
        DriveMainRootLayout driveMainRootLayout = this.mainRootLayout;
        if (driveMainRootLayout != null) {
            viewParent = driveMainRootLayout.getParent();
        } else {
            viewParent = null;
        }
        ViewGroup viewGroup = (ViewGroup) viewParent;
        C13479a.m54775e("DriveBlockPreviewPlugin", "handleDetachMainLayout() mainRootLayoutParent=" + viewGroup);
        if (viewGroup != null) {
            viewGroup.removeView(this.mainRootLayout);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        LiveData<Integer> livePreviewType = ((DrivePluginHost) getHost()).mo27261l().livePreviewType();
        Intrinsics.checkExpressionValueIsNotNull(livePreviewType, "host.driveViewModel.livePreviewType()");
        Integer b = livePreviewType.mo5927b();
        if (b == null || b.intValue() != 4) {
            return false;
        }
        handlePreviewStateAnim(false);
        return true;
    }

    private final void cancelAnim() {
        List<ValueAnimator> list;
        List<ValueAnimator> list2;
        ArrayList<ValueAnimator> arrayList = this.showAnimSet;
        if (arrayList != null) {
            list = arrayList;
        } else {
            list = CollectionsKt.emptyList();
        }
        for (ValueAnimator valueAnimator : list) {
            valueAnimator.cancel();
        }
        ArrayList<ValueAnimator> arrayList2 = this.showAnimSet;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        ArrayList<ValueAnimator> arrayList3 = this.hideAnimSet;
        if (arrayList3 != null) {
            list2 = arrayList3;
        } else {
            list2 = CollectionsKt.emptyList();
        }
        for (ValueAnimator valueAnimator2 : list2) {
            valueAnimator2.cancel();
        }
        ArrayList<ValueAnimator> arrayList4 = this.hideAnimSet;
        if (arrayList4 != null) {
            arrayList4.clear();
        }
    }

    private final ViewGroup findFullScreenAttachRoot() {
        int i;
        Fragment parentFragment;
        Fragment parentFragment2;
        BaseOpenEntity openEntity = ((DrivePluginHost) getHost()).mo27261l().getOpenEntity();
        Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
        if (openEntity.isInVc()) {
            Fragment parentFragment3 = ((DrivePluginHost) getHost()).mo23794b().getParentFragment();
            if (((parentFragment3 == null || (parentFragment2 = parentFragment3.getParentFragment()) == null) ? null : parentFragment2.getParentFragment()) != null) {
                Fragment parentFragment4 = ((DrivePluginHost) getHost()).mo23794b().getParentFragment();
                ViewGroup viewGroup = (ViewGroup) ((parentFragment4 == null || (parentFragment = parentFragment4.getParentFragment()) == null) ? null : parentFragment.getView());
                if (viewGroup != null) {
                    i = viewGroup.getChildCount();
                } else {
                    i = 0;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    View childAt = viewGroup != null ? viewGroup.getChildAt(i2) : null;
                    if (childAt instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) childAt;
                        if (viewGroup2.getId() == R.id.pluginUIContainer) {
                            C13479a.m54764b("DriveBlockPreviewPlugin", "findFullScreenAttachRoot() attachmentDocRoot not null");
                            return viewGroup2;
                        }
                    }
                }
            }
        }
        C13479a.m54764b("DriveBlockPreviewPlugin", "findFullScreenAttachRoot() use android.R.id.content");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return (ViewGroup) activity.findViewById(16908290);
        }
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/block/DriveBlockPreviewPlugin$handlePreviewStateAnim$2", "Lcom/bytedance/ee/util/ui/AnimationUtils$SimpleAnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockPreviewPlugin$c */
    public static final class C6547c extends C13727b.C13735a {

        /* renamed from: a */
        final /* synthetic */ DriveBlockPreviewPlugin f18010a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout.LayoutParams f18011b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f18012c;

        /* renamed from: d */
        final /* synthetic */ int f18013d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/block/DriveBlockPreviewPlugin$handlePreviewStateAnim$2$onAnimationEnd$secondAnims$1", "Lcom/bytedance/ee/util/ui/AnimationUtils$SimpleAnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockPreviewPlugin$c$a */
        public static final class C6548a extends C13727b.C13735a {

            /* renamed from: a */
            final /* synthetic */ C6547c f18014a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C6548a(C6547c cVar) {
                this.f18014a = cVar;
            }

            @Override // com.bytedance.ee.util.p718t.C13727b.C13735a
            public void onAnimationCancel(Animator animator) {
                C13479a.m54764b("DriveBlockPreviewPlugin", "handlePreviewStateAnim() canceled ENTER_ANIM_DUR_STEP_2");
            }

            @Override // com.bytedance.ee.util.p718t.C13727b.C13735a
            public void onAnimationEnd(Animator animator) {
                C13479a.m54764b("DriveBlockPreviewPlugin", "handlePreviewStateAnim() done ENTER_ANIM_DUR_STEP_2");
                DrivePluginHost aVar = (DrivePluginHost) this.f18014a.f18010a.getHost();
                Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
                C6891a.m27236d(aVar).setBlockViewChanging(false);
                ((DrivePluginHost) this.f18014a.f18010a.getHost()).mo27261l().updatePreviewType(4);
                if (this.f18014a.f18010a.isUIContainerDetached()) {
                    C13479a.m54764b("DriveBlockPreviewPlugin", "handlePreviewStateAnim() done ENTER_ANIM_DUR_STEP_2 isUIContainerDetached");
                    this.f18014a.f18010a.handleDetachMainLayout();
                    return;
                }
                this.f18014a.f18011b.width = -1;
                this.f18014a.f18011b.height = -1;
                DriveMainRootLayout driveMainRootLayout = this.f18014a.f18010a.mainRootLayout;
                if (driveMainRootLayout != null) {
                    driveMainRootLayout.setLayoutParams(this.f18014a.f18011b);
                }
                ViewGroup viewGroup = this.f18014a.f18010a.mainTitleBarRoot;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                DriveBlockTitleView driveBlockTitleView = this.f18014a.f18010a.blockTitleView;
                if (driveBlockTitleView != null) {
                    driveBlockTitleView.setVisibility(8);
                }
                DriveMainRootLayout driveMainRootLayout2 = this.f18014a.f18010a.mainRootLayout;
                if (driveMainRootLayout2 != null) {
                    driveMainRootLayout2.removeView(this.f18014a.f18010a.blockTitleView);
                }
                this.f18014a.f18010a.animating = false;
            }
        }

        @Override // com.bytedance.ee.util.p718t.C13727b.C13735a
        public void onAnimationCancel(Animator animator) {
            C13479a.m54764b("DriveBlockPreviewPlugin", "handlePreviewStateAnim() canceled ENTER_ANIM_DUR_STEP_1");
        }

        @Override // com.bytedance.ee.util.p718t.C13727b.C13735a
        public void onAnimationEnd(Animator animator) {
            C13479a.m54764b("DriveBlockPreviewPlugin", "handlePreviewStateAnim() done ENTER_ANIM_DUR_STEP_1 start ENTER_ANIM_DUR_STEP_2");
            DriveBlockPreviewPlugin driveBlockPreviewPlugin = this.f18010a;
            FrameLayout.LayoutParams layoutParams = this.f18011b;
            int width = this.f18012c.getWidth() - (this.f18010a.getMiddleLeftMargin() * 2);
            int width2 = this.f18012c.getWidth();
            int height = this.f18012c.getHeight() - (this.f18010a.getMiddleTopMargin() * 2);
            int height2 = this.f18012c.getHeight();
            int middleTopMargin = this.f18010a.getMiddleTopMargin();
            int middleLeftMargin = this.f18010a.getMiddleLeftMargin();
            int i = this.f18013d;
            ArrayList<ValueAnimator> startAnim = driveBlockPreviewPlugin.startAnim(100, layoutParams, width, width2, height, height2, middleTopMargin, 0, middleLeftMargin, 0, i, i, new C6548a(this));
            ArrayList<ValueAnimator> arrayList = this.f18010a.showAnimSet;
            if (arrayList != null) {
                arrayList.addAll(startAnim);
            }
        }

        C6547c(DriveBlockPreviewPlugin driveBlockPreviewPlugin, FrameLayout.LayoutParams layoutParams, ViewGroup viewGroup, int i) {
            this.f18010a = driveBlockPreviewPlugin;
            this.f18011b = layoutParams;
            this.f18012c = viewGroup;
            this.f18013d = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/block/DriveBlockPreviewPlugin$handlePreviewStateAnim$3", "Lcom/bytedance/ee/util/ui/AnimationUtils$SimpleAnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockPreviewPlugin$d */
    public static final class C6549d extends C13727b.C13735a {

        /* renamed from: a */
        final /* synthetic */ DriveBlockPreviewPlugin f18015a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f18016b;

        /* renamed from: c */
        final /* synthetic */ FrameLayout.LayoutParams f18017c;

        /* renamed from: d */
        final /* synthetic */ int[] f18018d;

        /* renamed from: e */
        final /* synthetic */ int f18019e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/block/DriveBlockPreviewPlugin$handlePreviewStateAnim$3$onAnimationEnd$secondAnims$1", "Lcom/bytedance/ee/util/ui/AnimationUtils$SimpleAnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockPreviewPlugin$d$a */
        public static final class C6550a extends C13727b.C13735a {

            /* renamed from: a */
            final /* synthetic */ C6549d f18020a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C6550a(C6549d dVar) {
                this.f18020a = dVar;
            }

            @Override // com.bytedance.ee.util.p718t.C13727b.C13735a
            public void onAnimationCancel(Animator animator) {
                C13479a.m54764b("DriveBlockPreviewPlugin", "handlePreviewStateAnim() canceled EXIST_ANIM_DUR_STEP_2");
            }

            @Override // com.bytedance.ee.util.p718t.C13727b.C13735a
            public void onAnimationEnd(Animator animator) {
                ViewParent viewParent;
                DriveMainRootLayout driveMainRootLayout;
                C13479a.m54764b("DriveBlockPreviewPlugin", "handlePreviewStateAnim() done EXIST_ANIM_DUR_STEP_2");
                DriveMainRootLayout driveMainRootLayout2 = this.f18020a.f18015a.mainRootLayout;
                ViewParent viewParent2 = null;
                if (driveMainRootLayout2 != null) {
                    viewParent = driveMainRootLayout2.getParent();
                } else {
                    viewParent = null;
                }
                ViewGroup viewGroup = (ViewGroup) viewParent;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f18020a.f18015a.mainRootLayout);
                }
                this.f18020a.f18017c.topMargin = 0;
                this.f18020a.f18017c.leftMargin = 0;
                this.f18020a.f18017c.width = -1;
                this.f18020a.f18017c.height = -1;
                ViewGroup viewGroup2 = this.f18020a.f18015a.placeContentView;
                if (viewGroup2 != null) {
                    viewGroup2.addView(this.f18020a.f18015a.mainRootLayout, this.f18020a.f18017c);
                }
                ((DrivePluginHost) this.f18020a.f18015a.getHost()).mo27261l().updatePreviewType(3);
                DrivePluginHost aVar = (DrivePluginHost) this.f18020a.f18015a.getHost();
                Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
                C6891a.m27236d(aVar).setBlockViewChanging(false);
                ViewGroup viewGroup3 = this.f18020a.f18015a.mainTitleBarRoot;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(8);
                }
                DriveBlockTitleView driveBlockTitleView = this.f18020a.f18015a.blockTitleView;
                if (driveBlockTitleView != null) {
                    driveBlockTitleView.setVisibility(0);
                }
                DriveBlockTitleView driveBlockTitleView2 = this.f18020a.f18015a.blockTitleView;
                if (driveBlockTitleView2 != null) {
                    viewParent2 = driveBlockTitleView2.getParent();
                }
                if (viewParent2 == null && (driveMainRootLayout = this.f18020a.f18015a.mainRootLayout) != null) {
                    driveMainRootLayout.addView(this.f18020a.f18015a.blockTitleView);
                }
                this.f18020a.f18015a.animating = false;
                C13479a.m54764b("DriveBlockPreviewPlugin", "handlePreviewStateAnim() done EXIST_ANIM_DUR_STEP_2 mainRootLayoutParent=" + viewGroup + " placeContentView=" + this.f18020a.f18015a.placeContentView);
                if (this.f18020a.f18015a.isUIContainerDetached()) {
                    C13479a.m54764b("DriveBlockPreviewPlugin", "handlePreviewStateAnim() done EXIST_ANIM_DUR_STEP_2 isUIContainerDetached");
                    this.f18020a.f18015a.handleDetachMainLayout();
                }
            }
        }

        @Override // com.bytedance.ee.util.p718t.C13727b.C13735a
        public void onAnimationCancel(Animator animator) {
            C13479a.m54764b("DriveBlockPreviewPlugin", "handlePreviewStateAnim() canceled EXIST_ANIM_DUR_STEP_1");
        }

        @Override // com.bytedance.ee.util.p718t.C13727b.C13735a
        public void onAnimationEnd(Animator animator) {
            C13479a.m54764b("DriveBlockPreviewPlugin", "handlePreviewStateAnim() done EXIST_ANIM_DUR_STEP_1 start EXIST_ANIM_DUR_STEP_2");
            this.f18016b.removeView(this.f18015a.animatingBgAlphaView);
            DriveBlockPreviewPlugin driveBlockPreviewPlugin = this.f18015a;
            FrameLayout.LayoutParams layoutParams = this.f18017c;
            int width = this.f18016b.getWidth() - (this.f18015a.getMiddleLeftMargin() * 2);
            ViewGroup viewGroup = this.f18015a.placeContentView;
            if (viewGroup == null) {
                Intrinsics.throwNpe();
            }
            int width2 = viewGroup.getWidth();
            int height = this.f18016b.getHeight() - (this.f18015a.getMiddleTopMargin() * 2);
            ViewGroup viewGroup2 = this.f18015a.placeContentView;
            if (viewGroup2 == null) {
                Intrinsics.throwNpe();
            }
            ArrayList<ValueAnimator> startAnim = driveBlockPreviewPlugin.startAnim(150, layoutParams, width, width2, height, viewGroup2.getHeight(), this.f18015a.getMiddleTopMargin(), this.f18018d[1], this.f18015a.getMiddleLeftMargin(), this.f18018d[0], this.f18019e, 0, new C6550a(this));
            ArrayList<ValueAnimator> arrayList = this.f18015a.hideAnimSet;
            if (arrayList != null) {
                arrayList.addAll(startAnim);
            }
        }

        C6549d(DriveBlockPreviewPlugin driveBlockPreviewPlugin, ViewGroup viewGroup, FrameLayout.LayoutParams layoutParams, int[] iArr, int i) {
            this.f18015a = driveBlockPreviewPlugin;
            this.f18016b = viewGroup;
            this.f18017c = layoutParams;
            this.f18018d = iArr;
            this.f18019e = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0004H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/block/DriveBlockPreviewPlugin$onAttachToHost$1", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$SimpleLoadListener;", "onInfo", "", "T", "code", "Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;Ljava/lang/Object;)V", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockPreviewPlugin$e */
    public static final class C6551e extends IFileLoader.SimpleLoadListener {

        /* renamed from: a */
        final /* synthetic */ DriveBlockPreviewPlugin f18021a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6551e(DriveBlockPreviewPlugin driveBlockPreviewPlugin) {
            this.f18021a = driveBlockPreviewPlugin;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockPreviewPlugin$e$a */
        static final class View$OnClickListenerC6552a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C6551e f18022a;

            View$OnClickListenerC6552a(C6551e eVar) {
                this.f18022a = eVar;
            }

            public final void onClick(View view) {
                this.f18022a.f18021a.handlePreviewStateAnim(false);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> void mo25427a(com.bytedance.ee.bear.drive.loader.model.InfoCode r7, T r8) {
            /*
            // Method dump skipped, instructions count: 152
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockPreviewPlugin.C6551e.mo25427a(com.bytedance.ee.bear.drive.loader.model.InfoCode, java.lang.Object):void");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockPreviewPlugin$j */
    public static final class C6557j<T> implements AbstractC1178x<Object> {

        /* renamed from: a */
        final /* synthetic */ DriveBlockPreviewPlugin f18031a;

        C6557j(DriveBlockPreviewPlugin driveBlockPreviewPlugin) {
            this.f18031a = driveBlockPreviewPlugin;
        }

        @Override // androidx.lifecycle.AbstractC1178x
        public final void onChanged(Object obj) {
            this.f18031a.handlePreviewStateAnim(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockPreviewPlugin$b */
    public static final class View$OnClickListenerC6546b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DriveBlockPreviewPlugin f18009a;

        View$OnClickListenerC6546b(DriveBlockPreviewPlugin driveBlockPreviewPlugin) {
            this.f18009a = driveBlockPreviewPlugin;
        }

        public final void onClick(View view) {
            C13479a.m54764b("DriveBlockPreviewPlugin", "handlePreviewStateAnim() LeftClick");
            this.f18009a.handlePreviewStateAnim(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Long;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockPreviewPlugin$g */
    public static final class C6554g<T> implements AbstractC1178x<Long> {

        /* renamed from: a */
        final /* synthetic */ DriveBlockPreviewPlugin f18025a;

        /* renamed from: b */
        final /* synthetic */ DriveMediaDurationVm f18026b;

        C6554g(DriveBlockPreviewPlugin driveBlockPreviewPlugin, DriveMediaDurationVm aVar) {
            this.f18025a = driveBlockPreviewPlugin;
            this.f18026b = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Long l) {
            this.f18026b.setExtraData(C6891a.m27230a((BasePlugin<DrivePluginHost>) this.f18025a), l);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockPreviewPlugin$i */
    public static final class C6556i<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ DriveBlockPreviewPlugin f18030a;

        C6556i(DriveBlockPreviewPlugin driveBlockPreviewPlugin) {
            this.f18030a = driveBlockPreviewPlugin;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            DriveBlockTitleView driveBlockTitleView = this.f18030a.blockTitleView;
            if (driveBlockTitleView != null) {
                driveBlockTitleView.setTitle(str);
            }
            DriveBlockTitleView driveBlockTitleView2 = this.f18030a.blockTitleView;
            if (driveBlockTitleView2 != null) {
                driveBlockTitleView2.setIcon(C7713a.m30848b(C13672c.m55481b(str)));
            }
        }
    }

    private final ViewGroup findPlaceholderView(ViewParent viewParent) {
        if (!(viewParent instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) viewParent;
        if (Intrinsics.areEqual("block_place_holder", viewGroup.getTag())) {
            return viewGroup;
        }
        return findPlaceholderView(viewGroup.getParent());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockPreviewPlugin$k */
    public static final class C6558k<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveBlockPreviewPlugin f18032a;

        C6558k(DriveBlockPreviewPlugin driveBlockPreviewPlugin) {
            this.f18032a = driveBlockPreviewPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                DriveBlockTitleView driveBlockTitleView = this.f18032a.blockTitleView;
                if (driveBlockTitleView != null) {
                    driveBlockTitleView.setForceGone(false);
                }
                DriveBlockTitleView driveBlockTitleView2 = this.f18032a.blockTitleView;
                if (driveBlockTitleView2 != null) {
                    driveBlockTitleView2.setVisibility(0);
                    return;
                }
                return;
            }
            DriveBlockTitleView driveBlockTitleView3 = this.f18032a.blockTitleView;
            if (driveBlockTitleView3 != null) {
                driveBlockTitleView3.setForceGone(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockPreviewPlugin$l */
    public static final class View$OnClickListenerC6559l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DriveBlockPreviewPlugin f18033a;

        /* renamed from: b */
        final /* synthetic */ DriveBlockPreviewVM f18034b;

        View$OnClickListenerC6559l(DriveBlockPreviewPlugin driveBlockPreviewPlugin, DriveBlockPreviewVM driveBlockPreviewVM) {
            this.f18033a = driveBlockPreviewPlugin;
            this.f18034b = driveBlockPreviewVM;
        }

        public final void onClick(View view) {
            Iterator<IBlockClickInterceptor> it = this.f18034b.getBlockClickInterceptors().iterator();
            while (it.hasNext()) {
                if (it.next().mo28325d()) {
                    return;
                }
            }
            this.f18033a.handlePreviewStateAnim(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/block/DriveBlockPreviewPlugin$setSlideListener$1", "Lcom/bytedance/ee/bear/drive/view/preview/block/DriveMainRootLayout$OnSlideListener;", "onMove", "", ShareHitPoint.f121869d, "", "distance", "onSlide", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockPreviewPlugin$m */
    public static final class C6560m implements DriveMainRootLayout.AbstractC7255a {

        /* renamed from: a */
        final /* synthetic */ DriveBlockPreviewPlugin f18035a;

        /* renamed from: b */
        final /* synthetic */ float f18036b;

        /* renamed from: c */
        final /* synthetic */ DriveFullScreenVM f18037c;

        @Override // com.bytedance.ee.bear.drive.view.preview.block.DriveMainRootLayout.AbstractC7255a
        /* renamed from: a */
        public boolean mo26157a(int i) {
            if (i != 3 || !this.f18035a.enableSlideDown || !(!Intrinsics.areEqual((Object) this.f18037c.getLiveFullScreen().mo5927b(), (Object) true))) {
                return false;
            }
            this.f18035a.handlePreviewStateAnim(false);
            this.f18035a.reportSlideEvent(i);
            return true;
        }

        C6560m(DriveBlockPreviewPlugin driveBlockPreviewPlugin, float f, DriveFullScreenVM bVar) {
            this.f18035a = driveBlockPreviewPlugin;
            this.f18036b = f;
            this.f18037c = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockPreviewPlugin$n */
    public static final class C6561n implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ DriveBlockPreviewPlugin f18038a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup.LayoutParams f18039b;

        C6561n(DriveBlockPreviewPlugin driveBlockPreviewPlugin, ViewGroup.LayoutParams layoutParams) {
            this.f18038a = driveBlockPreviewPlugin;
            this.f18039b = layoutParams;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f18039b;
            if (layoutParams != null) {
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    layoutParams.height = ((Integer) animatedValue).intValue();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
            }
            ViewGroup viewGroup = this.f18038a.mainTitleBarRoot;
            if (viewGroup != null) {
                viewGroup.setLayoutParams(this.f18039b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockPreviewPlugin$o */
    public static final class C6562o implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ DriveBlockPreviewPlugin f18040a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout.LayoutParams f18041b;

        C6562o(DriveBlockPreviewPlugin driveBlockPreviewPlugin, FrameLayout.LayoutParams layoutParams) {
            this.f18040a = driveBlockPreviewPlugin;
            this.f18041b = layoutParams;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            FrameLayout.LayoutParams layoutParams = this.f18041b;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                layoutParams.topMargin = ((Integer) animatedValue).intValue();
                DriveMainRootLayout driveMainRootLayout = this.f18040a.mainRootLayout;
                if (driveMainRootLayout != null) {
                    driveMainRootLayout.setLayoutParams(this.f18041b);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockPreviewPlugin$p */
    public static final class C6563p implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ DriveBlockPreviewPlugin f18042a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout.LayoutParams f18043b;

        C6563p(DriveBlockPreviewPlugin driveBlockPreviewPlugin, FrameLayout.LayoutParams layoutParams) {
            this.f18042a = driveBlockPreviewPlugin;
            this.f18043b = layoutParams;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            FrameLayout.LayoutParams layoutParams = this.f18043b;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                layoutParams.leftMargin = ((Integer) animatedValue).intValue();
                DriveMainRootLayout driveMainRootLayout = this.f18042a.mainRootLayout;
                if (driveMainRootLayout != null) {
                    driveMainRootLayout.setLayoutParams(this.f18043b);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockPreviewPlugin$q */
    public static final class C6564q implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ DriveBlockPreviewPlugin f18044a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout.LayoutParams f18045b;

        C6564q(DriveBlockPreviewPlugin driveBlockPreviewPlugin, FrameLayout.LayoutParams layoutParams) {
            this.f18044a = driveBlockPreviewPlugin;
            this.f18045b = layoutParams;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                this.f18045b.width = ((Integer) animatedValue).intValue();
                DriveMainRootLayout driveMainRootLayout = this.f18044a.mainRootLayout;
                if (driveMainRootLayout != null) {
                    driveMainRootLayout.setLayoutParams(this.f18045b);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockPreviewPlugin$r */
    public static final class C6565r implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ DriveBlockPreviewPlugin f18046a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout.LayoutParams f18047b;

        C6565r(DriveBlockPreviewPlugin driveBlockPreviewPlugin, FrameLayout.LayoutParams layoutParams) {
            this.f18046a = driveBlockPreviewPlugin;
            this.f18047b = layoutParams;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                this.f18047b.height = ((Integer) animatedValue).intValue();
                DriveMainRootLayout driveMainRootLayout = this.f18046a.mainRootLayout;
                if (driveMainRootLayout != null) {
                    driveMainRootLayout.setLayoutParams(this.f18047b);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockPreviewPlugin$f */
    public static final class C6553f<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ DriveBlockPreviewPlugin f18023a;

        /* renamed from: b */
        final /* synthetic */ DriveBlockPreviewVM f18024b;

        C6553f(DriveBlockPreviewPlugin driveBlockPreviewPlugin, DriveBlockPreviewVM driveBlockPreviewVM) {
            this.f18023a = driveBlockPreviewPlugin;
            this.f18024b = driveBlockPreviewVM;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            C13479a.m54764b("DriveBlockPreviewPlugin", "livePreviewType() value=" + num);
            if (num != null && num.intValue() == 3) {
                this.f18024b.getLiveBlockState().mo5929b(DriveBlockPreviewVM.BlockState.BLOCK);
                DriveMainRootLayout driveMainRootLayout = this.f18023a.mainRootLayout;
                if (driveMainRootLayout != null) {
                    driveMainRootLayout.setInBlock(true);
                }
                DriveMainRootLayout driveMainRootLayout2 = this.f18023a.mainRootLayout;
                if (driveMainRootLayout2 != null) {
                    driveMainRootLayout2.setForeground(this.f18023a.getResources().getDrawable(R.drawable.drive_block_border));
                }
            } else if (num != null && num.intValue() == 4) {
                this.f18024b.getLiveBlockState().mo5929b(DriveBlockPreviewVM.BlockState.FULLSCREEN);
                DriveMainRootLayout driveMainRootLayout3 = this.f18023a.mainRootLayout;
                if (driveMainRootLayout3 != null) {
                    driveMainRootLayout3.setInBlock(false);
                }
                DriveMainRootLayout driveMainRootLayout4 = this.f18023a.mainRootLayout;
                if (driveMainRootLayout4 != null) {
                    driveMainRootLayout4.setClipToOutline(false);
                }
                KeyboardUtils.hideKeyboard(this.f18023a.getActivity());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "map", "", "", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockPreviewPlugin$h */
    public static final class C6555h<T> implements AbstractC1178x<Map<String, Long>> {

        /* renamed from: a */
        final /* synthetic */ DriveBlockPreviewPlugin f18027a;

        /* renamed from: b */
        final /* synthetic */ DriveMediaDurationVm f18028b;

        /* renamed from: c */
        final /* synthetic */ DriveMediaVM f18029c;

        C6555h(DriveBlockPreviewPlugin driveBlockPreviewPlugin, DriveMediaDurationVm aVar, DriveMediaVM bVar) {
            this.f18027a = driveBlockPreviewPlugin;
            this.f18028b = aVar;
            this.f18029c = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Map<String, Long> map) {
            C1177w<Map<String, Long>> extraData = this.f18028b.getExtraData();
            if (extraData != null) {
                extraData.mo5922a(this.f18027a.getLifecycleOwner());
            }
            Long l = map.get(C6891a.m27230a((BasePlugin<DrivePluginHost>) this.f18027a));
            C13479a.m54764b("DriveBlockPreviewPlugin", "DriveMediaDurationVm#record position=" + l);
            if (l != null) {
                this.f18029c.getResumePosition().mo5926a(Long.valueOf(l.longValue()));
            }
        }
    }

    public final void reportSlideEvent(int i) {
        String str;
        String str2;
        if (i == 3) {
            str = "slide_down";
        } else {
            str = "slide_right";
        }
        LiveData<Integer> livePreviewType = ((DrivePluginHost) getHost()).mo27261l().livePreviewType();
        Intrinsics.checkExpressionValueIsNotNull(livePreviewType, "host.driveViewModel.livePreviewType()");
        Integer b = livePreviewType.mo5927b();
        if (b != null && b.intValue() == 4) {
            str2 = "preview";
        } else {
            str2 = "card";
        }
        DrivePluginHost aVar = (DrivePluginHost) getHost();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
        C6891a.m27229a(aVar).mo27932b(((DrivePluginHost) getHost()).mo27261l().getFileModel(), "slide", str2, str);
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        C13479a.m54764b("DriveBlockPreviewPlugin", "onAttachToHost()");
        DriveBlockPreviewVM driveBlockPreviewVM = (DriveBlockPreviewVM) viewModel(DriveBlockPreviewVM.class);
        DriveMediaVM bVar = (DriveMediaVM) viewModel(DriveMediaVM.class);
        bVar.setAutoPlay(false);
        aVar.mo27262m().mo27297a(new C6551e(this));
        aVar.mo27261l().livePreviewType().mo5923a(getLifecycleOwner(), new C6553f(this, driveBlockPreviewVM));
        AbstractC1142af a = new C1144ai(getActivity()).mo6005a(DriveMediaDurationVm.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProvider(activi…iaDurationVm::class.java)");
        DriveMediaDurationVm aVar2 = (DriveMediaDurationVm) a;
        bVar.getPlayPosition().mo5923a(getLifecycleOwner(), new C6554g(this, aVar2));
        C1177w<Map<String, Long>> extraData = aVar2.getExtraData();
        if (extraData != null) {
            extraData.mo5923a(getLifecycleOwner(), new C6555h(this, aVar2, bVar));
        }
        this.blockTitleView = new DriveBlockTitleView(getActivity());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C57582a.m223600a(44));
        layoutParams.gravity = 48;
        DriveBlockTitleView driveBlockTitleView = this.blockTitleView;
        if (driveBlockTitleView != null) {
            driveBlockTitleView.setVisibility(8);
        }
        DriveBlockTitleView driveBlockTitleView2 = this.blockTitleView;
        if (driveBlockTitleView2 != null) {
            driveBlockTitleView2.setLayoutParams(layoutParams);
        }
        driveBlockPreviewVM.setBlockTitleView(this.blockTitleView);
        aVar.mo27261l().liveFileName().mo5923a(getLifecycleOwner(), new C6556i(this));
        driveBlockPreviewVM.getEnterFullScreen().mo5923a(getLifecycleOwner(), new C6557j(this));
        driveBlockPreviewVM.getBlockTitleViewVisibility().mo5923a(getLifecycleOwner(), new C6558k(this));
    }

    public final void handlePreviewStateAnim(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewParent viewParent;
        ViewParent viewParent2;
        C13479a.m54764b("DriveBlockPreviewPlugin", "handlePreviewStateAnim() withCurrentState=" + z);
        if (this.placeContentView == null) {
            AbstractC4958n uIContainer = getUIContainer();
            Intrinsics.checkExpressionValueIsNotNull(uIContainer, "uiContainer");
            View f = uIContainer.mo19601f();
            Intrinsics.checkExpressionValueIsNotNull(f, "uiContainer.contentView");
            this.placeContentView = findPlaceholderView(f.getParent());
            C13479a.m54764b("DriveBlockPreviewPlugin", "handlePreviewStateAnim() findPlaceholderView done");
        }
        if (this.placeContentView == null || this.mainRootLayout == null || this.animating) {
            C13479a.m54764b("DriveBlockPreviewPlugin", "handlePreviewStateAnim() wrong state return, placeContentView=" + this.placeContentView + ", mainRootLayout=" + this.mainRootLayout + ", animating=" + this.animating);
            return;
        }
        ViewGroup findFullScreenAttachRoot = findFullScreenAttachRoot();
        if (findFullScreenAttachRoot != null) {
            C13479a.m54764b("DriveBlockPreviewPlugin", "DriveBlockPreviewPlugin#findPlaceholderView placeContentView=" + this.placeContentView);
            this.animating = true;
            cancelAnim();
            DrivePluginHost aVar = (DrivePluginHost) getHost();
            Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
            C6891a.m27236d(aVar).setBlockViewChanging(true);
            DriveMainRootLayout driveMainRootLayout = this.mainRootLayout;
            if (driveMainRootLayout != null) {
                driveMainRootLayout.setForeground(null);
            }
            int[] blockLocation = getBlockLocation();
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.drive_main_page_title_bar_height);
            DriveMainRootLayout driveMainRootLayout2 = this.mainRootLayout;
            if (driveMainRootLayout2 == null) {
                Intrinsics.throwNpe();
            }
            ViewGroup.LayoutParams layoutParams = driveMainRootLayout2.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                DriveMainRootLayout driveMainRootLayout3 = this.mainRootLayout;
                if (driveMainRootLayout3 != null) {
                    driveMainRootLayout3.setClipToOutline(true);
                }
                LiveData<Integer> livePreviewType = ((DrivePluginHost) getHost()).mo27261l().livePreviewType();
                Intrinsics.checkExpressionValueIsNotNull(livePreviewType, "host.driveViewModel.livePreviewType()");
                Integer b = livePreviewType.mo5927b();
                String str = "preview";
                if (b != null && b.intValue() == 3) {
                    C13479a.m54764b("DriveBlockPreviewPlugin", "handlePreviewStateAnim() start fullScreen");
                    layoutParams2.leftMargin = blockLocation[0];
                    layoutParams2.topMargin = blockLocation[1];
                    View view = this.animatingBgAlphaView;
                    if (view != null) {
                        if (view != null) {
                            viewParent2 = view.getParent();
                        } else {
                            viewParent2 = null;
                        }
                        if (viewParent2 == null) {
                            findFullScreenAttachRoot.addView(this.animatingBgAlphaView);
                        }
                    }
                    DriveMainRootLayout driveMainRootLayout4 = this.mainRootLayout;
                    if (driveMainRootLayout4 != null) {
                        viewParent = driveMainRootLayout4.getParent();
                    } else {
                        viewParent = null;
                    }
                    ViewGroup viewGroup = (ViewGroup) viewParent;
                    C13479a.m54764b("DriveBlockPreviewPlugin", "handlePreviewStateAnim() mainRootLayoutParent=" + viewGroup);
                    if (viewGroup != null) {
                        viewGroup.removeView(this.mainRootLayout);
                    }
                    findFullScreenAttachRoot.addView(this.mainRootLayout, layoutParams2);
                    setSlideListener();
                    disableMultiTaskSlide();
                    DriveMainRootLayout driveMainRootLayout5 = this.mainRootLayout;
                    if (driveMainRootLayout5 != null) {
                        driveMainRootLayout5.removeView(this.blockTitleView);
                    }
                    ViewGroup viewGroup2 = this.mainTitleBarRoot;
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(0);
                    }
                    DriveBlockTitleView driveBlockTitleView = this.blockTitleView;
                    if (driveBlockTitleView != null) {
                        driveBlockTitleView.setVisibility(8);
                    }
                    DriveMainRootLayout driveMainRootLayout6 = this.mainRootLayout;
                    if (driveMainRootLayout6 != null) {
                        driveMainRootLayout6.setInterceptClickListener(null);
                    }
                    AbstractC4958n uIContainer2 = getUIContainer();
                    Intrinsics.checkExpressionValueIsNotNull(uIContainer2, "uiContainer");
                    TitleBar e = uIContainer2.mo19600e();
                    Intrinsics.checkExpressionValueIsNotNull(e, "uiContainer.titleBar");
                    e.mo19508a().setLeftClickListener(new View$OnClickListenerC6546b(this));
                    LiveData<Integer> livePreviewType2 = ((DrivePluginHost) getHost()).mo27261l().livePreviewType();
                    Intrinsics.checkExpressionValueIsNotNull(livePreviewType2, "host.driveViewModel.livePreviewType()");
                    Integer b2 = livePreviewType2.mo5927b();
                    if (b2 == null || b2.intValue() != 4) {
                        str = "card";
                    }
                    DrivePluginHost aVar2 = (DrivePluginHost) getHost();
                    Intrinsics.checkExpressionValueIsNotNull(aVar2, "host");
                    C6891a.m27229a(aVar2).mo27940c(((DrivePluginHost) getHost()).mo27261l().getFileModel(), str);
                    C13479a.m54764b("DriveBlockPreviewPlugin", "handlePreviewStateAnim() start ENTER_ANIM_DUR_STEP_1");
                    ViewGroup viewGroup3 = this.placeContentView;
                    if (viewGroup3 == null) {
                        Intrinsics.throwNpe();
                    }
                    int width = viewGroup3.getWidth();
                    int width2 = findFullScreenAttachRoot.getWidth() - (this.middleLeftMargin * 2);
                    ViewGroup viewGroup4 = this.placeContentView;
                    if (viewGroup4 == null) {
                        Intrinsics.throwNpe();
                    }
                    int height = viewGroup4.getHeight();
                    int height2 = findFullScreenAttachRoot.getHeight();
                    int i5 = this.middleTopMargin;
                    this.showAnimSet = startAnim(200, layoutParams2, width, width2, height, height2 - (i5 * 2), blockLocation[1], i5, blockLocation[0], this.middleLeftMargin, 0, dimensionPixelSize, new C6547c(this, layoutParams2, findFullScreenAttachRoot, dimensionPixelSize));
                    return;
                }
                C13479a.m54764b("DriveBlockPreviewPlugin", "handlePreviewStateAnim() start exist fullScreen");
                setBlockClickListener();
                DriveMainRootLayout driveMainRootLayout7 = this.mainRootLayout;
                if (driveMainRootLayout7 != null) {
                    driveMainRootLayout7.setSlideListener(null);
                }
                enableMultiTaskSlide();
                LiveData<Integer> livePreviewType3 = ((DrivePluginHost) getHost()).mo27261l().livePreviewType();
                Intrinsics.checkExpressionValueIsNotNull(livePreviewType3, "host.driveViewModel.livePreviewType()");
                Integer b3 = livePreviewType3.mo5927b();
                if (b3 == null || b3.intValue() != 4) {
                    str = "card";
                }
                DrivePluginHost aVar3 = (DrivePluginHost) getHost();
                Intrinsics.checkExpressionValueIsNotNull(aVar3, "host");
                C6891a.m27229a(aVar3).mo27907a(((DrivePluginHost) getHost()).mo27261l().getFileModel(), "click_return", str);
                ViewGroup viewGroup5 = this.mainTitleBarRoot;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(0);
                }
                if (z) {
                    i = layoutParams2.width;
                } else {
                    i = findFullScreenAttachRoot.getWidth();
                }
                if (z) {
                    i2 = layoutParams2.height;
                } else {
                    i2 = findFullScreenAttachRoot.getHeight();
                }
                if (z) {
                    i3 = layoutParams2.topMargin;
                } else {
                    i3 = 0;
                }
                if (z) {
                    i4 = layoutParams2.leftMargin;
                } else {
                    i4 = 0;
                }
                C13479a.m54764b("DriveBlockPreviewPlugin", "handlePreviewStateAnim() start EXIST_ANIM_DUR_STEP_1");
                int width3 = findFullScreenAttachRoot.getWidth() - (this.middleLeftMargin * 2);
                int height3 = findFullScreenAttachRoot.getHeight();
                int i6 = this.middleTopMargin;
                this.hideAnimSet = startAnim(200, layoutParams2, i, width3, i2, height3 - (i6 * 2), i3, i6, i4, this.middleLeftMargin, dimensionPixelSize, dimensionPixelSize, new C6549d(this, findFullScreenAttachRoot, layoutParams2, blockLocation, dimensionPixelSize));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    public void onDetachFromUIContainer(DrivePluginHost aVar, AbstractC4958n nVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        Intrinsics.checkParameterIsNotNull(nVar, "uiContainer");
        super.onDetachFromUIContainer((C4943e) aVar, nVar);
        cancelAnim();
        if (!aVar.mo27261l().isInBlockState()) {
            handleDetachMainLayout();
        }
    }

    public void onAttachToUIContainer(DrivePluginHost aVar, AbstractC4958n nVar) {
        ViewParent parent;
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        Intrinsics.checkParameterIsNotNull(nVar, "uiContainer");
        super.onAttachToUIContainer((C4943e) aVar, nVar);
        this.mainRootLayout = (DriveMainRootLayout) findViewById(R.id.main_page_root);
        setBlockClickListener();
        setSlideListener();
        DriveMainRootLayout driveMainRootLayout = this.mainRootLayout;
        if (driveMainRootLayout != null) {
            driveMainRootLayout.setInBlock(true);
        }
        DriveBlockTitleView driveBlockTitleView = this.blockTitleView;
        if (!(driveBlockTitleView == null || (parent = driveBlockTitleView.getParent()) == null)) {
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.blockTitleView);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        DriveMainRootLayout driveMainRootLayout2 = this.mainRootLayout;
        if (driveMainRootLayout2 != null) {
            driveMainRootLayout2.addView(this.blockTitleView);
        }
        DriveMainRootLayout driveMainRootLayout3 = this.mainRootLayout;
        if (driveMainRootLayout3 != null) {
            driveMainRootLayout3.setClipToOutline(true);
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.drive_sdk_main_title_bar_root_fl);
        this.mainTitleBarRoot = viewGroup;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    public final ArrayList<ValueAnimator> startAnim(long j, FrameLayout.LayoutParams layoutParams, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, Animator.AnimatorListener animatorListener) {
        ViewGroup.LayoutParams layoutParams2;
        C13479a.m54764b("DriveBlockPreviewPlugin", "startAnim() called with: dur = " + j + ", layoutParam = " + layoutParams + ", startW = " + i + ", endW = " + i2 + ", startH = " + i3 + ", endH = " + i4 + ", startTopMargin = " + i5 + ", endTopMargin = " + i6 + ", startLeftMargin = " + i7 + ", endLeftMargin = " + i8 + ", titleHStart = " + i9 + ", titleHEnd = " + i10 + ", listener = " + animatorListener);
        ((DriveBlockPreviewVM) viewModel(DriveBlockPreviewVM.class)).getLiveBlockState().mo5929b(DriveBlockPreviewVM.BlockState.ANIMATING);
        ValueAnimator ofInt = ObjectAnimator.ofInt(i, i2);
        ValueAnimator ofInt2 = ObjectAnimator.ofInt(i3, i4);
        ValueAnimator ofInt3 = ObjectAnimator.ofInt(i5, i6);
        ValueAnimator ofInt4 = ObjectAnimator.ofInt(i7, i8);
        ValueAnimator ofInt5 = ObjectAnimator.ofInt(i9, i10);
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "widthAnim");
        ofInt.setDuration(j);
        Intrinsics.checkExpressionValueIsNotNull(ofInt2, "heightAnim");
        ofInt2.setDuration(j);
        Intrinsics.checkExpressionValueIsNotNull(ofInt3, "topMarginAnim");
        ofInt3.setDuration(j);
        Intrinsics.checkExpressionValueIsNotNull(ofInt4, "leftMarginAnim");
        ofInt4.setDuration(j);
        Intrinsics.checkExpressionValueIsNotNull(ofInt5, "titleHeightAnim");
        ofInt5.setDuration(j);
        ViewGroup viewGroup = this.mainTitleBarRoot;
        if (viewGroup != null) {
            layoutParams2 = viewGroup.getLayoutParams();
        } else {
            layoutParams2 = null;
        }
        ofInt5.addUpdateListener(new C6561n(this, layoutParams2));
        ofInt3.addUpdateListener(new C6562o(this, layoutParams));
        ofInt4.addUpdateListener(new C6563p(this, layoutParams));
        ofInt.addUpdateListener(new C6564q(this, layoutParams));
        ofInt2.addUpdateListener(new C6565r(this, layoutParams));
        if (animatorListener != null) {
            ofInt2.addListener(animatorListener);
        }
        List listOf = CollectionsKt.listOf((Object[]) new ValueAnimator[]{ofInt5, ofInt3, ofInt4, ofInt, ofInt2});
        if (i9 != i10) {
            ofInt5.start();
        }
        ofInt3.start();
        ofInt4.start();
        ofInt.start();
        ofInt2.start();
        return new ArrayList<>(listOf);
    }

    static /* synthetic */ ArrayList startAnim$default(DriveBlockPreviewPlugin driveBlockPreviewPlugin, long j, FrameLayout.LayoutParams layoutParams, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, Animator.AnimatorListener animatorListener, int i11, Object obj) {
        Animator.AnimatorListener animatorListener2;
        if ((i11 & 4096) != 0) {
            animatorListener2 = null;
        } else {
            animatorListener2 = animatorListener;
        }
        return driveBlockPreviewPlugin.startAnim(j, layoutParams, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, animatorListener2);
    }
}
