package com.bytedance.ee.bear.widgets.popupmenu;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\n\u0018\u0000 )2\u00020\u0001:\u0003)*+B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\u001bJ\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\u0006\u0010\u001f\u001a\u00020\fJ\u0014\u0010 \u001a\u00020\u001b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\"J\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u0013J\u000e\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u0015J\u0006\u0010'\u001a\u00020\u001bJ\u0006\u0010(\u001a\u00020\u001bJ\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\fH\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/bytedance/ee/bear/widgets/popupmenu/PopupMenuView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "animatorSet", "Landroid/animation/AnimatorSet;", "backGrayView", "Landroid/view/View;", "isShow", "", "menuAdapter", "Lcom/bytedance/ee/bear/widgets/popupmenu/PopupMenuAdapter;", "menuItems", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/widgets/popupmenu/PopupMenuItem;", "onMenuItemClickListener", "Lcom/bytedance/ee/bear/widgets/popupmenu/PopupMenuView$OnMenuItemClickListener;", "onMenuProxy", "Lcom/bytedance/ee/bear/widgets/popupmenu/PopupMenuView$OnMenuProxy;", "rootView", "Landroid/widget/LinearLayout;", "rvMenuContainer", "Landroidx/recyclerview/widget/RecyclerView;", "addGrayBackView", "", "hide", "initAdapter", "initViews", "isAnimatorStart", "setMenus", "menus", "", "setOnMenuItemClickListener", "listener", "setOnMenuProxy", "proxy", "show", "switchMenu", "Companion", "OnMenuItemClickListener", "OnMenuProxy", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class PopupMenuView extends FrameLayout {

    /* renamed from: e */
    public static final Companion f32011e = new Companion(null);

    /* renamed from: a */
    public PopupMenuAdapter f32012a;

    /* renamed from: b */
    public AnimatorSet f32013b;

    /* renamed from: c */
    public OnMenuItemClickListener f32014c;

    /* renamed from: d */
    public OnMenuProxy f32015d;

    /* renamed from: f */
    private LinearLayout f32016f;

    /* renamed from: g */
    private RecyclerView f32017g;

    /* renamed from: h */
    private View f32018h;

    /* renamed from: i */
    private ArrayList<PopupMenuItem> f32019i = new ArrayList<>();

    /* renamed from: j */
    private boolean f32020j = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/widgets/popupmenu/PopupMenuView$OnMenuItemClickListener;", "", "onMenuItemClick", "", "menuItem", "Lcom/bytedance/ee/bear/widgets/popupmenu/PopupMenuItem;", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.popupmenu.PopupMenuView$b */
    public interface OnMenuItemClickListener {
        /* renamed from: a */
        void mo45467a(PopupMenuItem bVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/widgets/popupmenu/PopupMenuView$OnMenuProxy;", "", "onMenuClose", "", "onMenuOpen", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.popupmenu.PopupMenuView$c */
    public interface OnMenuProxy {
        /* renamed from: a */
        void mo45468a();

        /* renamed from: b */
        void mo45469b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/widgets/popupmenu/PopupMenuView$Companion;", "", "()V", "CREATE_MENU_ANIMATE_DURATION", "", "TAG", "", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.popupmenu.PopupMenuView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    private final void m49196b() {
        View view = new View(getContext());
        this.f32018h = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backGrayView");
        }
        view.setId(R.id.widget_gray_layer);
        View view2 = this.f32018h;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backGrayView");
        }
        view2.setBackgroundResource(R.color.widget_color_transparent_30_percent_black);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        View view3 = this.f32018h;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backGrayView");
        }
        addView(view3, layoutParams);
    }

    /* renamed from: c */
    private final void m49197c() {
        this.f32012a = new PopupMenuAdapter(this.f32019i);
        RecyclerView recyclerView = this.f32017g;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvMenuContainer");
        }
        PopupMenuAdapter aVar = this.f32012a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("menuAdapter");
        }
        recyclerView.setAdapter(aVar);
        PopupMenuAdapter aVar2 = this.f32012a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("menuAdapter");
        }
        aVar2.mo70668a((BaseQuickAdapter.AbstractC20911a) new C11848d(this));
    }

    /* renamed from: a */
    private final void m49195a() {
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        m49196b();
        LayoutInflater.from(getContext()).inflate(R.layout.widget_popup_menu_layout, this);
        View findViewById = findViewById(R.id.widget_menu_root);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById<LinearLayout>(R.id.widget_menu_root)");
        this.f32016f = (LinearLayout) findViewById;
        View findViewById2 = findViewById(R.id.widget_menu_recyclerview);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById<RecyclerVie…widget_menu_recyclerview)");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        this.f32017g = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvMenuContainer");
        }
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        setOnClickListener(new View$OnClickListenerC11849e(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.popupmenu.PopupMenuView$e */
    public static final class View$OnClickListenerC11849e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PopupMenuView f32022a;

        View$OnClickListenerC11849e(PopupMenuView popupMenuView) {
            this.f32022a = popupMenuView;
        }

        public final void onClick(View view) {
            this.f32022a.mo45463a(false);
        }
    }

    public final void setOnMenuItemClickListener(OnMenuItemClickListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f32014c = bVar;
    }

    public final void setOnMenuProxy(OnMenuProxy cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "proxy");
        this.f32015d = cVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ PopupMenuAdapter m49194a(PopupMenuView popupMenuView) {
        PopupMenuAdapter aVar = popupMenuView.f32012a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("menuAdapter");
        }
        return aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/widgets/popupmenu/PopupMenuView$switchMenu$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.popupmenu.PopupMenuView$f */
    public static final class C11850f implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ PopupMenuView f32023a;

        /* renamed from: b */
        final /* synthetic */ boolean f32024b;

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            if (!this.f32024b) {
                this.f32023a.setVisibility(8);
            }
            this.f32023a.f32013b = null;
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            if (!this.f32024b) {
                this.f32023a.setVisibility(8);
            }
            this.f32023a.f32013b = null;
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            if (this.f32024b) {
                OnMenuProxy cVar = this.f32023a.f32015d;
                if (cVar != null) {
                    cVar.mo45468a();
                    return;
                }
                return;
            }
            OnMenuProxy cVar2 = this.f32023a.f32015d;
            if (cVar2 != null) {
                cVar2.mo45469b();
            }
        }

        C11850f(PopupMenuView popupMenuView, boolean z) {
            this.f32023a = popupMenuView;
            this.f32024b = z;
        }
    }

    public final void setMenus(List<PopupMenuItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "menus");
        this.f32019i.clear();
        this.f32019i.addAll(list);
        PopupMenuAdapter aVar = this.f32012a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("menuAdapter");
        }
        aVar.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo45463a(boolean z) {
        boolean z2;
        float f;
        float f2;
        if (getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f32020j = !z;
        if (z != z2) {
            if (z) {
                setVisibility(0);
            }
            float f3 = 1.0f;
            float f4 = BitmapDescriptorFactory.HUE_RED;
            if (z) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = 1.0f;
            }
            if (!z) {
                f3 = BitmapDescriptorFactory.HUE_RED;
            }
            View view = this.f32018h;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("backGrayView");
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", f, f3);
            LinearLayout linearLayout = this.f32016f;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            int height = linearLayout.getHeight();
            if (z) {
                f2 = (float) (-height);
            } else {
                f2 = BitmapDescriptorFactory.HUE_RED;
            }
            if (!z) {
                f4 = (float) (-height);
            }
            LinearLayout linearLayout2 = this.f32016f;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout2, "translationY", f2, f4);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f32013b = animatorSet;
            if (animatorSet == null) {
                Intrinsics.throwNpe();
            }
            animatorSet.playTogether(ofFloat, ofFloat2);
            AnimatorSet animatorSet2 = this.f32013b;
            if (animatorSet2 == null) {
                Intrinsics.throwNpe();
            }
            animatorSet2.setDuration(200L);
            AnimatorSet animatorSet3 = this.f32013b;
            if (animatorSet3 == null) {
                Intrinsics.throwNpe();
            }
            animatorSet3.addListener(new C11850f(this, z));
            AnimatorSet animatorSet4 = this.f32013b;
            if (animatorSet4 == null) {
                Intrinsics.throwNpe();
            }
            animatorSet4.start();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PopupMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m49195a();
        m49197c();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u000128\u0010\u0002\u001a4\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005*\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003¨\u0006\u00010\u0003¨\u0006\u00012\u000e\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\b0\b2\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "", "adapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "kotlin.jvm.PlatformType", "Lcom/chad/library/adapter/base/BaseViewHolder;", "view", "Landroid/view/View;", "position", "", "onItemClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.popupmenu.PopupMenuView$d */
    public static final class C11848d implements BaseQuickAdapter.AbstractC20911a {

        /* renamed from: a */
        final /* synthetic */ PopupMenuView f32021a;

        C11848d(PopupMenuView popupMenuView) {
            this.f32021a = popupMenuView;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter.AbstractC20911a
        public final void onItemClick(BaseQuickAdapter<Object, C20923c> baseQuickAdapter, View view, int i) {
            OnMenuItemClickListener bVar = this.f32021a.f32014c;
            if (bVar != null) {
                bVar.mo45467a((PopupMenuItem) PopupMenuView.m49194a(this.f32021a).mo70685d(i));
            }
            this.f32021a.mo45463a(false);
        }
    }
}
