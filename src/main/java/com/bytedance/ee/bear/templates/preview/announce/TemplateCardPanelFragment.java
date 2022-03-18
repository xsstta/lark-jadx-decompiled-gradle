package com.bytedance.ee.bear.templates.preview.announce;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bizwidget.p271a.C4861b;
import com.bytedance.ee.bear.list.loadstateview.C8594b;
import com.bytedance.ee.bear.list.loadstateview.EmptyCategory;
import com.bytedance.ee.bear.list.loadstateview.LoadStateView;
import com.bytedance.ee.bear.list.loadstateview.LoadingCategory;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.preview.announce.AnnounceTemplateViewModel;
import com.bytedance.ee.bear.templates.preview.announce.PanelTemplateAdapter;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3466b.C69029a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 '2\u00020\u0001:\u0002'(B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J&\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010&\u001a\u00020\u0018H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00060\u000bR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/TemplateCardPanelFragment;", "Lcom/bytedance/ee/bear/bizwidget/dialogfragment/BaseDialogFragment;", "()V", "cardPanel", "Landroidx/constraintlayout/widget/ConstraintLayout;", "hideTemplates", "Landroid/widget/TextView;", "loadStateViewDispatcher", "Lcom/bytedance/ee/bear/list/loadstateview/LoadStateViewDispatcher;", "panelTitle", "panelViewDelegate", "Lcom/bytedance/ee/bear/templates/preview/announce/TemplateCardPanelFragment$PanelViewDelegate;", "templateAdapter", "Lcom/bytedance/ee/bear/templates/preview/announce/PanelTemplateAdapter;", "templateViewModel", "Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateViewModel;", "templatesRv", "Landroidx/recyclerview/widget/RecyclerView;", "getInternalDimensionSize", "", "res", "Landroid/content/res/Resources;", "getStatusBarHeight", "initAdapter", "", "initView", "rootView", "Landroid/view/View;", "observe", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "startAnimatorSet", "Companion", "PanelViewDelegate", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.preview.announce.e */
public final class TemplateCardPanelFragment extends C4861b {

    /* renamed from: h */
    public static final Companion f31150h = new Companion(null);

    /* renamed from: c */
    public RecyclerView f31151c;

    /* renamed from: d */
    public ConstraintLayout f31152d;

    /* renamed from: e */
    public AnnounceTemplateViewModel f31153e;

    /* renamed from: f */
    public PanelTemplateAdapter f31154f;

    /* renamed from: g */
    public C8594b f31155g;

    /* renamed from: i */
    private TextView f31156i;

    /* renamed from: j */
    private TextView f31157j;

    /* renamed from: k */
    private final PanelViewDelegate f31158k = new PanelViewDelegate();

    /* renamed from: l */
    private HashMap f31159l;

    /* renamed from: h */
    public void mo44431h() {
        HashMap hashMap = this.f31159l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44431h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/TemplateCardPanelFragment$Companion;", "", "()V", "ANIMATOR_DURATION", "", "STATUS_BAR_HEIGHT_RES_NAME", "", "TAG", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/TemplateCardPanelFragment$PanelViewDelegate;", "Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateViewModel$ViewDelegate;", "(Lcom/bytedance/ee/bear/templates/preview/announce/TemplateCardPanelFragment;)V", "onStartAnimator", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.e$b */
    public final class PanelViewDelegate implements AnnounceTemplateViewModel.ViewDelegate {
        @Override // com.bytedance.ee.bear.templates.preview.announce.AnnounceTemplateViewModel.ViewDelegate
        /* renamed from: a */
        public void mo44408a() {
            TemplateCardPanelFragment.this.mo44430g();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public PanelViewDelegate() {
        }
    }

    /* renamed from: j */
    private final float m48114j() {
        Resources system = Resources.getSystem();
        Intrinsics.checkExpressionValueIsNotNull(system, "Resources.getSystem()");
        return m48110a(system);
    }

    /* renamed from: i */
    private final void m48113i() {
        C1177w<ArrayList<AnnounceTemplate>> templates;
        AnnounceTemplateViewModel cVar = this.f31153e;
        if (cVar != null && (templates = cVar.getTemplates()) != null) {
            templates.mo5923a(this, new C11567f(this));
        }
    }

    /* renamed from: f */
    public final void mo44429f() {
        if (this.f31154f == null) {
            this.f31154f = new PanelTemplateAdapter(new C10917c(new C10929e()));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.e$c */
    public static final class RunnableC11564c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TemplateCardPanelFragment f31161a;

        RunnableC11564c(TemplateCardPanelFragment eVar) {
            this.f31161a = eVar;
        }

        public final void run() {
            int[] iArr;
            C1177w<Boolean> panelActive;
            TemplateData templateData;
            int[] iArr2;
            AnnounceTemplateViewModel cVar = this.f31161a.f31153e;
            Boolean bool = null;
            if (cVar != null) {
                iArr = cVar.getPanelLocOnScreen();
            } else {
                iArr = null;
            }
            if (iArr == null) {
                int[] iArr3 = new int[2];
                AnnounceTemplateViewModel cVar2 = this.f31161a.f31153e;
                if (cVar2 != null) {
                    cVar2.setPanelLocOnScreen(iArr3);
                }
                ConstraintLayout constraintLayout = this.f31161a.f31152d;
                if (constraintLayout != null) {
                    AnnounceTemplateViewModel cVar3 = this.f31161a.f31153e;
                    if (cVar3 != null) {
                        iArr2 = cVar3.getPanelLocOnScreen();
                    } else {
                        iArr2 = null;
                    }
                    if (iArr2 == null) {
                        Intrinsics.throwNpe();
                    }
                    constraintLayout.getLocationOnScreen(iArr2);
                }
            }
            AnnounceTemplateViewModel cVar4 = this.f31161a.f31153e;
            if (!(cVar4 == null || (templateData = cVar4.getTemplateData()) == null)) {
                bool = templateData.getNeedAnimation();
            }
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                this.f31161a.mo44430g();
                return;
            }
            AnnounceTemplateViewModel cVar5 = this.f31161a.f31153e;
            if (!(cVar5 == null || (panelActive = cVar5.m269993getPanelActive()) == null)) {
                panelActive.mo5929b((Boolean) true);
            }
            ConstraintLayout constraintLayout2 = this.f31161a.f31152d;
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(0);
            }
        }
    }

    /* renamed from: g */
    public final void mo44430g() {
        TemplateData templateData;
        Float f;
        float f2;
        Float f3;
        float f4;
        float f5;
        int[] iArr;
        float f6;
        float f7;
        FrameLayout.LayoutParams layoutParams;
        ViewParent parent;
        AnnounceTemplateViewModel cVar = this.f31153e;
        if (cVar != null) {
            templateData = cVar.getTemplateData();
        } else {
            templateData = null;
        }
        if (templateData == null) {
            Intrinsics.throwNpe();
        }
        boolean areEqual = Intrinsics.areEqual((Object) templateData.getVisible(), (Object) true);
        Float x = templateData.getX();
        float f8 = BitmapDescriptorFactory.HUE_RED;
        if (x == null) {
            f = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
        } else {
            f = templateData.getX();
        }
        if (templateData.getY() == null) {
            f2 = BitmapDescriptorFactory.HUE_RED;
        } else {
            Float y = templateData.getY();
            if (y == null) {
                Intrinsics.throwNpe();
            }
            f2 = y.floatValue();
        }
        AnnounceTemplateViewModel cVar2 = this.f31153e;
        if (cVar2 != null) {
            f3 = Float.valueOf(cVar2.getTitleBarHeight());
        } else {
            f3 = null;
        }
        if (Intrinsics.areEqual(f3, (float) BitmapDescriptorFactory.HUE_RED)) {
            f3 = Float.valueOf(50.0f);
        }
        float j = m48114j();
        if (f3 == null) {
            Intrinsics.throwNpe();
        }
        float floatValue = f3.floatValue() + j + f2;
        if (areEqual) {
            if (f == null) {
                Intrinsics.throwNpe();
            }
            f4 = f.floatValue();
        } else {
            f4 = BitmapDescriptorFactory.HUE_RED;
        }
        if (areEqual) {
            f5 = BitmapDescriptorFactory.HUE_RED;
        } else {
            if (f == null) {
                Intrinsics.throwNpe();
            }
            f5 = f.floatValue();
        }
        AnnounceTemplateViewModel cVar3 = this.f31153e;
        if (cVar3 != null) {
            iArr = cVar3.getPanelLocOnScreen();
        } else {
            iArr = null;
        }
        if (areEqual) {
            f6 = floatValue;
        } else {
            if (iArr == null) {
                Intrinsics.throwNpe();
            }
            f6 = ((float) iArr[1]) - f2;
        }
        if (areEqual) {
            if (iArr == null) {
                Intrinsics.throwNpe();
            }
            floatValue = (((float) iArr[1]) - f2) - j;
        }
        if (areEqual) {
            f7 = BitmapDescriptorFactory.HUE_RED;
        } else {
            f7 = 1.0f;
        }
        if (areEqual) {
            f8 = 1.0f;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ConstraintLayout constraintLayout = this.f31152d;
        if (constraintLayout != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(constraintLayout, "scaleX", f7, f8);
            ConstraintLayout constraintLayout2 = this.f31152d;
            if (constraintLayout2 != null) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(constraintLayout2, "scaleY", f7, f8);
                ConstraintLayout constraintLayout3 = this.f31152d;
                if (constraintLayout3 != null) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(constraintLayout3, "translationX", f4, f5);
                    ConstraintLayout constraintLayout4 = this.f31152d;
                    if (constraintLayout4 != null) {
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(constraintLayout4, "translationY", f6, floatValue);
                        ConstraintLayout constraintLayout5 = this.f31152d;
                        if (constraintLayout5 != null) {
                            layoutParams = constraintLayout5.getLayoutParams();
                        } else {
                            layoutParams = null;
                        }
                        if (layoutParams != null) {
                            FrameLayout.LayoutParams layoutParams2 = layoutParams;
                            if (areEqual) {
                                layoutParams2.topMargin = C69029a.m265653a(f2);
                                layoutParams2.gravity = 48;
                                ConstraintLayout constraintLayout6 = this.f31152d;
                                if (constraintLayout6 != null) {
                                    constraintLayout6.setLayoutParams(layoutParams2);
                                }
                                ConstraintLayout constraintLayout7 = this.f31152d;
                                if (!(constraintLayout7 == null || (parent = constraintLayout7.getParent()) == null)) {
                                    parent.requestLayout();
                                }
                            }
                            animatorSet.setDuration(300L);
                            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                            animatorSet.setInterpolator(new AccelerateInterpolator());
                            animatorSet.addListener(new C11568g(this, templateData));
                            animatorSet.start();
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.view.View");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.View");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/templates/preview/announce/TemplateCardPanelFragment$initView$3", "Lcom/bytedance/ee/bear/templates/preview/announce/PanelTemplateAdapter$TemplateClickListener;", "onTemplateClicked", "", "position", "", "template", "Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplate;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.e$e */
    public static final class C11566e implements PanelTemplateAdapter.TemplateClickListener {

        /* renamed from: a */
        final /* synthetic */ TemplateCardPanelFragment f31163a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11566e(TemplateCardPanelFragment eVar) {
            this.f31163a = eVar;
        }

        @Override // com.bytedance.ee.bear.templates.preview.announce.PanelTemplateAdapter.TemplateClickListener
        /* renamed from: a */
        public void mo44427a(int i, AnnounceTemplate announceTemplate) {
            Intrinsics.checkParameterIsNotNull(announceTemplate, "template");
            C13479a.m54764b("TemplateCardPanelFragment", "onTemplateClicked()...template = " + announceTemplate);
            AnnounceTemplateViewModel cVar = this.f31163a.f31153e;
            if (cVar != null) {
                cVar.loadAnnounceUrl(i, true);
            }
            AnnounceTemplateAnalytic.f31127b.mo44379b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.e$d */
    public static final class View$OnClickListenerC11565d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TemplateCardPanelFragment f31162a;

        View$OnClickListenerC11565d(TemplateCardPanelFragment eVar) {
            this.f31162a = eVar;
        }

        public final void onClick(View view) {
            AnnounceTemplateViewModel cVar = this.f31162a.f31153e;
            if (cVar != null) {
                cVar.onClickHidePanel();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C8594b m48111a(TemplateCardPanelFragment eVar) {
        C8594b bVar = eVar.f31155g;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        return bVar;
    }

    /* renamed from: a */
    private final float m48110a(Resources resources) {
        int i;
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = resources.getDimensionPixelSize(identifier);
        } else {
            i = 0;
        }
        return (float) i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/templates/preview/announce/TemplateCardPanelFragment$startAnimatorSet$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "isReverse", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.e$g */
    public static final class C11568g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ TemplateCardPanelFragment f31165a;

        /* renamed from: b */
        final /* synthetic */ TemplateData f31166b;

        public void onAnimationEnd(Animator animator) {
            AnnounceTemplateViewModel.PanelDelegate panelDelegate;
            super.onAnimationEnd(animator);
            if (Intrinsics.areEqual((Object) this.f31166b.getVisible(), (Object) false)) {
                AnnounceTemplateViewModel cVar = this.f31165a.f31153e;
                if (!(cVar == null || (panelDelegate = cVar.getPanelDelegate()) == null)) {
                    panelDelegate.mo44316b();
                }
                ConstraintLayout constraintLayout = this.f31165a.f31152d;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(8);
                }
            }
        }

        C11568g(TemplateCardPanelFragment eVar, TemplateData templateData) {
            this.f31165a = eVar;
            this.f31166b = templateData;
        }

        public void onAnimationStart(Animator animator, boolean z) {
            C1177w<Boolean> panelActive;
            ConstraintLayout constraintLayout = this.f31165a.f31152d;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
            super.onAnimationStart(animator, z);
            AnnounceTemplateViewModel cVar = this.f31165a.f31153e;
            if (cVar != null && (panelActive = cVar.m269993getPanelActive()) != null) {
                panelActive.mo5929b(this.f31166b.getVisible());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000120\u0010\u0002\u001a,\u0012\u0004\u0012\u00020\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplate;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.e$f */
    public static final class C11567f<T> implements AbstractC1178x<ArrayList<AnnounceTemplate>> {

        /* renamed from: a */
        final /* synthetic */ TemplateCardPanelFragment f31164a;

        C11567f(TemplateCardPanelFragment eVar) {
            this.f31164a = eVar;
        }

        /* renamed from: a */
        public final void onChanged(ArrayList<AnnounceTemplate> arrayList) {
            if (arrayList != null) {
                RecyclerView recyclerView = this.f31164a.f31151c;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                if (this.f31164a.f31154f == null) {
                    this.f31164a.mo44429f();
                }
                PanelTemplateAdapter dVar = this.f31164a.f31154f;
                if (dVar != null) {
                    dVar.mo44420a(arrayList);
                }
                TemplateCardPanelFragment.m48111a(this.f31164a).mo33513b();
                return;
            }
            RecyclerView recyclerView2 = this.f31164a.f31151c;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(4);
            }
            TemplateCardPanelFragment.m48111a(this.f31164a).mo33510a(new Throwable());
        }
    }

    /* renamed from: a */
    private final void m48112a(View view) {
        this.f31156i = (TextView) view.findViewById(R.id.panelTitle);
        this.f31157j = (TextView) view.findViewById(R.id.hideTemplates);
        this.f31152d = (ConstraintLayout) view.findViewById(R.id.layout_announce_car_panel);
        C8594b bVar = new C8594b((LoadStateView) view.findViewById(R.id.loadStateView), Looper.getMainLooper());
        this.f31155g = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        bVar.mo33512a(false, EmptyCategory.f23250n, LoadingCategory.CATEGORY_TEMPLATE);
        C8594b bVar2 = this.f31155g;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadStateViewDispatcher");
        }
        bVar2.mo33503a();
        ConstraintLayout constraintLayout = this.f31152d;
        if (constraintLayout != null) {
            constraintLayout.post(new RunnableC11564c(this));
        }
        TextView textView = this.f31157j;
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC11565d(this));
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_templates);
        this.f31151c = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }
        mo44429f();
        PanelTemplateAdapter dVar = this.f31154f;
        if (dVar != null) {
            dVar.mo44419a(new C11566e(this));
        }
        RecyclerView recyclerView2 = this.f31151c;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f31154f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        AnnounceTemplateViewModel cVar = (AnnounceTemplateViewModel) new C1144ai(requireActivity()).mo6005a(AnnounceTemplateViewModel.class);
        this.f31153e = cVar;
        if (cVar != null) {
            cVar.setViewDelegate(this.f31158k);
        }
        m48112a(view);
        m48113i();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.announce_template_card_panel_fragment, viewGroup, false);
    }
}
