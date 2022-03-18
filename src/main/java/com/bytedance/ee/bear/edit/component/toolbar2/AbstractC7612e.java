package com.bytedance.ee.bear.edit.component.toolbar2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.document.model.toolbar.ItemIdV2;
import com.bytedance.ee.bear.document.model.toolbar.ItemV2;
import com.bytedance.ee.bear.document.model.toolbar.ToolbarV2;
import com.bytedance.ee.bear.document.toolbar.AbstractC6207c;
import com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a;
import com.bytedance.ee.bear.document.toolbar.media.impl.C6238c;
import com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6262h;
import com.bytedance.ee.bear.document.widget.KeyboardPlaceholderView;
import com.bytedance.ee.bear.edit.component.document.at.C7599b;
import com.bytedance.ee.bear.edit.component.toolbar2.HorizontalOverScrollView;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.fileselector.FileSelectFragment;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.util.keyboard.HardKeyboardUtils;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13747j;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.e */
public abstract class AbstractC7612e<Toolbar extends ToolbarV2> extends C7667e {

    /* renamed from: a */
    private static final int f20655a = C13749l.m55737a(0.5f);

    /* renamed from: k */
    static final /* synthetic */ boolean f20656k = true;

    /* renamed from: l */
    private static final int f20657l = C13749l.m55738a(24);

    /* renamed from: m */
    private static final int f20658m = C13749l.m55738a(44);

    /* renamed from: n */
    private static final int f20659n = C13749l.m55738a(3);

    /* renamed from: b */
    protected AbstractC7616f<Toolbar> f20660b;

    /* renamed from: c */
    protected View f20661c;

    /* renamed from: d */
    protected View f20662d;

    /* renamed from: e */
    protected ImageView f20663e;

    /* renamed from: f */
    public View f20664f;

    /* renamed from: g */
    protected ViewGroup f20665g;

    /* renamed from: h */
    protected ViewGroup f20666h;

    /* renamed from: i */
    protected AbstractC10550f f20667i;

    /* renamed from: j */
    protected KeyboardPlaceholderView f20668j;

    /* renamed from: o */
    private View f20669o;

    /* renamed from: p */
    private ViewGroup f20670p;

    /* renamed from: q */
    private ObjectAnimator f20671q;

    /* renamed from: r */
    private HorizontalOverScrollView f20672r;

    /* renamed from: s */
    private int f20673s;

    /* renamed from: t */
    private HorizontalOverScrollView.AbstractC7602a f20674t;

    /* renamed from: u */
    private C6238c f20675u;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo29924a(ItemIdV2 itemIdV2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC7616f mo22165a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29925a(int i) {
    }

    /* renamed from: a */
    public void mo29926a(FragmentActivity fragmentActivity, Fragment fragment) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo29928a(Fragment fragment);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Class<? extends AbstractC6207c> mo29929b(ItemIdV2 itemIdV2);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Class<? extends AbstractC7610d> mo29930c(ItemIdV2 itemIdV2);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo29932d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29949a(Toolbar toolbar, int i) {
        if (toolbar == null || toolbar.getItems().length == 0) {
            this.f20664f.setVisibility(8);
            C13479a.m54764b("ToolbarV2", "hide toolbar items length = 0");
            return;
        }
        this.f20664f.setVisibility(0);
        mo29948a(toolbar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29948a(Toolbar toolbar) {
        ItemV2[] items = toolbar.getItems();
        int childCount = this.f20670p.getChildCount();
        if (items.length > childCount) {
            LayoutInflater from = LayoutInflater.from(getContext());
            for (int i = 0; i < items.length - childCount; i++) {
                from.inflate(R.layout.toolbar_v2_top_level_item, this.f20670p);
            }
        } else if (items.length < childCount) {
            for (int i2 = 0; i2 < childCount - items.length; i2++) {
                ViewGroup viewGroup = this.f20670p;
                viewGroup.removeViewAt(viewGroup.getChildCount() - 1);
            }
        }
        for (int i3 = 0; i3 < items.length; i3++) {
            m30537a(items[i3], this.f20670p.getChildAt(i3), toolbar.getShowingItemId());
        }
        int i4 = 0;
        for (ItemV2 itemV2 : items) {
            if (itemV2.id().name().equals(ItemIdV2.ConstId.separator.name())) {
                i4++;
            }
        }
        this.f20673s = items.length - i4;
        m30550f();
        int e = C13749l.m55760e(getContext());
        int min = Math.min(7, this.f20673s);
        int min2 = Math.min(e / 8, f20658m);
        int i5 = f20659n;
        int i6 = min2 + i5;
        int i7 = 10;
        int min3 = Math.min(10, items.length + 1);
        if (items.length >= 7) {
            i7 = min3;
        }
        int i8 = f20657l;
        int i9 = ((e - (min * i8)) - i6) / i7;
        if (items.length < 6) {
            i9 = ((e - (i8 * 7)) - i6) / i7;
        }
        int i10 = i8 + i9;
        int i11 = i9 / 2;
        this.f20670p.setPadding(i11, 0, i11, 0);
        this.f20670p.setClipToPadding(false);
        m30532a(min2 + i5, this.f20662d);
        for (int i12 = 0; i12 < this.f20670p.getChildCount(); i12++) {
            View childAt = this.f20670p.getChildAt(i12);
            if (items[i12].id().name().equals(ItemIdV2.ConstId.separator.name())) {
                m30532a(f20655a + i9, childAt);
            } else {
                m30532a(i10, childAt);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22166a(ItemIdV2 itemIdV2, String str) {
        if (itemIdV2 != ItemIdV2.ConstId.keyboard) {
            this.f20660b.processToolbarItemClick(itemIdV2, str);
        } else if (HardKeyboardUtils.m43694a((Context) getActivity()) || HardKeyboardUtils.m43693a((Activity) getActivity())) {
            C10548d.m43696a(getContext());
            this.f20660b.hideToolbar();
        } else {
            this.f20660b.processToolbarItemClick(itemIdV2, str);
            mo29931c();
        }
    }

    /* renamed from: a */
    public void mo29927a(ItemV2 itemV2) {
        this.f20668j.mo25308a();
        FragmentActivity activity = getActivity();
        if (f20656k || activity != null) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            String name = itemV2.id().name();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(name);
            if (!(findFragmentByTag instanceof AbstractC6207c)) {
                Class<? extends AbstractC6207c> b = mo29929b(itemV2.id());
                if (b != null) {
                    ((AbstractC6207c) Fragment.instantiate(activity, b.getName(), getArguments() == null ? new Bundle() : getArguments())).mo5511a(supportFragmentManager, name);
                    return;
                }
                return;
            }
            m30542b(findFragmentByTag);
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29950a(boolean z) {
        FragmentActivity activity = getActivity();
        if (f20656k || activity != null) {
            List<Fragment> fragments = activity.getSupportFragmentManager().getFragments();
            if (fragments != null) {
                for (Fragment fragment : fragments) {
                    if ((fragment instanceof AbstractC6207c) || (fragment instanceof C6262h)) {
                        if (z) {
                            ((DialogInterface$OnCancelListenerC1021b) fragment).mo5513b();
                        } else {
                            m30545c(fragment);
                        }
                    }
                    mo29926a(activity, fragment);
                }
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f20672r.mo29918b(this.f20674t);
        mo29950a((boolean) f20656k);
    }

    /* renamed from: b */
    private void mo22167b() {
        mo29949a(this.f20660b.getToolbar().mo5927b(), this.f20660b.getKeyboardHeight());
        m30549e();
    }

    /* renamed from: f */
    private void m30550f() {
        $$Lambda$e$0p6QNaKUpJ4cgGeXBkMQcuCGEI r0 = new Runnable() {
            /* class com.bytedance.ee.bear.edit.component.toolbar2.$$Lambda$e$0p6QNaKUpJ4cgGeXBkMQcuCGEI */

            public final void run() {
                AbstractC7612e.this.m30554h();
            }
        };
        if (this.f20672r.isLaidOut()) {
            r0.run();
        } else {
            this.f20672r.post(r0);
        }
        if (this.f20674t == null) {
            $$Lambda$e$NfJMfmceEF2eeb6cKiQkJBUow5Q r1 = new HorizontalOverScrollView.AbstractC7602a(r0) {
                /* class com.bytedance.ee.bear.edit.component.toolbar2.$$Lambda$e$NfJMfmceEF2eeb6cKiQkJBUow5Q */
                public final /* synthetic */ Runnable f$0;

                {
                    this.f$0 = r1;
                }

                @Override // com.bytedance.ee.bear.edit.component.toolbar2.HorizontalOverScrollView.AbstractC7602a
                public final void onScrollChanged(int i, int i2) {
                    this.f$0.run();
                }
            };
            this.f20674t = r1;
            this.f20672r.mo29917a(r1);
        }
    }

    /* renamed from: g */
    private void m30552g() {
        C13479a.m54764b("ToolbarV2", "removeAllSubToolBarV2 ");
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        if (fragments != null) {
            for (Fragment fragment : fragments) {
                if (fragment instanceof AbstractC7610d) {
                    m30536a(getChildFragmentManager(), fragment);
                }
            }
        }
    }

    /* renamed from: e */
    private void m30549e() {
        boolean z;
        ItemV2 b = this.f20660b.getExpandedSubToolbar().mo5927b();
        boolean i = this.f20667i.mo39935i();
        boolean a = HardKeyboardUtils.m43694a((Context) getActivity());
        boolean z2 = f20656k;
        if (a || HardKeyboardUtils.m43693a((Activity) getActivity())) {
            z = f20656k;
        } else {
            z = false;
        }
        if (z) {
            this.f20662d.setSelected(false);
            return;
        }
        View view = this.f20662d;
        if (i && (b == null || b.id().displayMode() != ItemIdV2.DisplayMode.FunctionPanel)) {
            z2 = false;
        }
        view.setSelected(z2);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: h */
    private /* synthetic */ void m30554h() {
        boolean z;
        int i = this.f20673s;
        boolean z2 = f20656k;
        int i2 = 0;
        if (i > 7) {
            z = f20656k;
        } else {
            z = false;
        }
        int measuredWidth = this.f20672r.getChildAt(0).getMeasuredWidth() - this.f20672r.getMeasuredWidth();
        StringBuilder sb = new StringBuilder();
        sb.append("setMarkVisible outSize  ");
        sb.append(z);
        sb.append(" max=scrollX ");
        if (measuredWidth != this.f20672r.getScrollX()) {
            z2 = false;
        }
        sb.append(z2);
        C13479a.m54772d("ToolbarV2", sb.toString());
        if (z) {
            View view = this.f20669o;
            if (measuredWidth == this.f20672r.getScrollX()) {
                i2 = 4;
            }
            view.setVisibility(i2);
            return;
        }
        this.f20669o.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo29931c() {
        boolean clearSubToolbar = this.f20660b.clearSubToolbar();
        if (!clearSubToolbar) {
            FragmentActivity activity = getActivity();
            if (f20656k || activity != null) {
                Iterator<Fragment> it = activity.getSupportFragmentManager().getFragments().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Fragment next = it.next();
                    if ((next instanceof AbstractC6207c) || (next instanceof C6262h)) {
                        ((DialogInterface$OnCancelListenerC1021b) next).mo5513b();
                        clearSubToolbar = f20656k;
                    } else {
                        mo29926a(activity, next);
                    }
                }
            } else {
                throw new AssertionError();
            }
        }
        if (!clearSubToolbar) {
            C10548d.m43696a(getContext());
        } else {
            C10548d.m43702b(getContext());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m30533a(View view) {
        mo22166a(ItemIdV2.ConstId.keyboard, String.valueOf(this.f20663e.isSelected()));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m30535a(AppCompatImageView appCompatImageView) {
        Rect rect = new Rect();
        appCompatImageView.getGlobalVisibleRect(rect);
        mo22165a().updateSubToolbarV2Rect(rect);
    }

    /* renamed from: b */
    private void m30542b(Fragment fragment) {
        Dialog v_ = ((DialogInterface$OnCancelListenerC1021b) fragment).v_();
        if (v_ != null && !v_.isShowing()) {
            v_.show();
        }
    }

    /* renamed from: c */
    private void m30545c(Fragment fragment) {
        Dialog v_ = ((DialogInterface$OnCancelListenerC1021b) fragment).v_();
        if (v_ != null && v_.isShowing()) {
            C13479a.m54764b("ToolbarV2", "dismiss " + fragment.getTag());
            v_.dismiss();
        }
    }

    /* renamed from: e */
    private ViewGroup m30548e(ItemV2 itemV2) {
        if (this.f20665g.getChildCount() > 0) {
            m30534a(this.f20665g);
            return this.f20666h;
        } else if (this.f20666h.getChildCount() <= 0) {
            return this.f20665g;
        } else {
            m30534a(this.f20666h);
            return this.f20665g;
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (f20656k || activity != null) {
            this.f20660b = mo22165a();
            this.f20667i = AbstractC10550f.AbstractC10551a.m43717b(activity);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private void m30534a(ViewGroup viewGroup) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        if (viewGroup.getChildCount() > 0) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getTag() != null) {
                    C13479a.m54772d("ToolbarV2", "remove fragment " + childAt.getTag());
                    m30536a(childFragmentManager, childFragmentManager.findFragmentByTag((String) childAt.getTag()));
                }
            }
        }
    }

    /* renamed from: b */
    private void m30543b(ItemV2 itemV2) {
        if (itemV2 == null) {
            mo29950a(false);
            m30552g();
            return;
        }
        m30547d(itemV2);
        m30546c(itemV2);
    }

    /* renamed from: c */
    private void m30546c(ItemV2 itemV2) {
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        if (fragments != null) {
            for (Fragment fragment : fragments) {
                if ((fragment instanceof AbstractC7610d) && !m30540a(itemV2, fragment)) {
                    C13479a.m54764b("ToolbarV2", "remove fragment " + fragment.getTag());
                    m30536a(getChildFragmentManager(), fragment);
                    mo22165a().requestUpdateContentHeight();
                }
            }
            boolean z = false;
            ItemIdV2 id = itemV2.id();
            Iterator<Fragment> it = fragments.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (id.name().equals(it.next().getTag())) {
                        z = f20656k;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z && id.displayMode() == ItemIdV2.DisplayMode.SubToolBarV2) {
                m30551f(itemV2);
            }
        }
    }

    /* renamed from: f */
    private void m30551f(ItemV2 itemV2) {
        Bundle bundle;
        FragmentActivity activity = getActivity();
        if (f20656k || activity != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            String name = itemV2.id().name();
            if (!(childFragmentManager.findFragmentByTag(name) instanceof AbstractC7610d)) {
                Class<? extends AbstractC7610d> c = mo29930c(itemV2.id());
                if (c != null) {
                    ViewGroup e = m30548e(itemV2);
                    if (getArguments() == null) {
                        bundle = new Bundle();
                    } else {
                        bundle = getArguments();
                    }
                    bundle.putSerializable(ItemV2.class.getName(), itemV2);
                    childFragmentManager.beginTransaction().setCustomAnimations(R.anim.subtoolbar_in_from_bottom, R.anim.subtoolbar_out_to_bottom, R.anim.subtoolbar_in_from_bottom, R.anim.subtoolbar_out_to_bottom).replace(e.getId(), (AbstractC7610d) Fragment.instantiate(activity, c.getName(), bundle), name).commitAllowingStateLoss();
                    mo22165a().requestUpdateContentHeight();
                    return;
                }
                return;
            }
            C13479a.m54764b("ToolbarV2", "showSubToolbarV2 already show");
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ void m30553g(ItemV2 itemV2) {
        C13479a.m54764b("ToolbarV2", "UI: sub toolbar change: " + itemV2);
        this.f20668j.mo25310a(this.f20660b.hasFunctionPanel());
        mo22167b();
        m30543b(itemV2);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m30544b(ToolbarV2 toolbarV2) {
        C13479a.m54764b("ToolbarV2", "UI: toolbar change: " + toolbarV2);
        mo22167b();
        mo29932d();
    }

    /* renamed from: d */
    private void m30547d(ItemV2 itemV2) {
        FragmentActivity activity = getActivity();
        if (f20656k || activity != null) {
            List<Fragment> fragments = activity.getSupportFragmentManager().getFragments();
            if (fragments != null) {
                for (Fragment fragment : fragments) {
                    if ((fragment instanceof AbstractC6207c) && !m30540a(itemV2, fragment) && mo29928a(fragment)) {
                        m30545c(fragment);
                    }
                    if (fragment instanceof FileSelectFragment) {
                        mo29926a(getActivity(), fragment);
                    }
                }
                boolean z = false;
                ItemIdV2 id = itemV2.id();
                Iterator<Fragment> it = fragments.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Fragment next = it.next();
                    if (id.name().equals(next.getTag())) {
                        z = f20656k;
                        if (next instanceof AbstractC6207c) {
                            m30542b(next);
                        }
                    }
                }
                if (!z && id.displayMode() == ItemIdV2.DisplayMode.FunctionPanel) {
                    mo29927a(itemV2);
                    return;
                }
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public void mo29951b(boolean z) {
        int i;
        int i2;
        ObjectAnimator objectAnimator = this.f20671q;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        final View view = getView();
        if (f20656k || view != null) {
            if (z) {
                i = -view.getWidth();
                i2 = 0;
            } else {
                i2 = -view.getWidth();
                i = 0;
            }
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, "translationX", (float) i, (float) i2).setDuration((long) LocationRequest.PRIORITY_HD_ACCURACY);
            this.f20671q = duration;
            duration.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e.C76153 */

                public void onAnimationEnd(Animator animator) {
                    view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                }
            });
            this.f20671q.start();
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m30538a(Integer num) {
        C13479a.m54764b("ToolbarV2", "UI: keyboardHeightLiveData: " + num);
        mo22167b();
        mo29925a(num.intValue());
    }

    /* renamed from: a */
    private void m30532a(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width != i) {
            layoutParams.width = i;
            view.requestLayout();
        }
    }

    /* renamed from: a */
    private void m30536a(FragmentManager fragmentManager, Fragment fragment) {
        if (fragmentManager != null && fragment != null) {
            fragmentManager.beginTransaction().setCustomAnimations(R.anim.subtoolbar_in_from_bottom, R.anim.subtoolbar_out_to_bottom, R.anim.subtoolbar_in_from_bottom, R.anim.subtoolbar_out_to_bottom).remove(fragment).commitAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f20672r = (HorizontalOverScrollView) view.findViewById(R.id.scroll_view);
        this.f20669o = view.findViewById(R.id.mark);
        this.f20662d = view.findViewById(R.id.keyboardSwitchIconParent);
        ImageView imageView = (ImageView) view.findViewById(R.id.keyboardSwitchIcon);
        this.f20663e = imageView;
        C13747j.m55728a(imageView, (int) R.color.icon_n1);
        this.f20661c = view.findViewById(R.id.keyboardSwitch);
        this.f20663e.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.edit.component.toolbar2.$$Lambda$e$elGHl9EMuEfEz5q97YdlbEedo */

            public final void onClick(View view) {
                AbstractC7612e.this.m30533a((AbstractC7612e) view);
            }
        });
        this.f20668j = (KeyboardPlaceholderView) view.findViewById(R.id.keyboardPlaceholder);
        this.f20664f = view.findViewById(R.id.toolbarLayout);
        this.f20670p = (ViewGroup) view.findViewById(R.id.topLevelItems);
        this.f20665g = (ViewGroup) view.findViewById(R.id.container_1);
        this.f20666h = (ViewGroup) view.findViewById(R.id.container_2);
        this.f20675u = (C6238c) aj.m5366a(getActivity()).mo6005a(C6238c.class);
        this.f20660b.keyboardHeightLiveData().mo5923a(getViewLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.edit.component.toolbar2.$$Lambda$e$yplrS1SviO5zrGF_75UoriZ8RY */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                AbstractC7612e.this.m30538a((AbstractC7612e) ((Integer) obj));
            }
        });
        this.f20660b.getToolbar().mo5923a(getViewLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.edit.component.toolbar2.$$Lambda$e$QE6wIsJHhaKjWnj6jcTxHYD4y3M */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                AbstractC7612e.this.m30544b((AbstractC7612e) ((ToolbarV2) obj));
            }
        });
        this.f20660b.getExpandedSubToolbar().mo5923a(getViewLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.edit.component.toolbar2.$$Lambda$e$pWnWD18960iDzoIhScvmg3WFuKA */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                AbstractC7612e.this.m30553g((ItemV2) obj);
            }
        });
        this.f20660b.observeActivePanel(this, new AbstractC1178x<AbstractC6214a>() {
            /* class com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e.C76131 */

            /* renamed from: a */
            AbstractC6214a f20676a;

            /* renamed from: a */
            public void onChanged(AbstractC6214a aVar) {
                if (aVar instanceof C7599b) {
                    AbstractC7612e.this.mo29951b(false);
                } else if (AbstractC7612e.this.f20660b == aVar && (this.f20676a instanceof C7599b)) {
                    AbstractC7612e.this.mo29951b(AbstractC7612e.f20656k);
                }
                this.f20676a = aVar;
            }
        });
    }

    /* renamed from: a */
    private boolean m30540a(ItemV2 itemV2, Fragment fragment) {
        if (itemV2 == null) {
            return false;
        }
        return itemV2.id().name().equals(fragment.getTag());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.toolbar_v2_fragment, viewGroup, false);
    }

    /* renamed from: a */
    private void m30537a(ItemV2 itemV2, View view, String str) {
        boolean z;
        float f;
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.toolbarItemImg);
        View findViewById = view.findViewById(R.id.separator);
        view.setTag(itemV2.id().name());
        boolean z2 = false;
        if (ItemIdV2.ConstId.separator.name().equals(itemV2.id().name())) {
            appCompatImageView.setVisibility(8);
            findViewById.setVisibility(0);
            ItemIdV2 id = itemV2.id();
            if (id != appCompatImageView.getTag()) {
                appCompatImageView.setTag(id);
                return;
            }
            return;
        }
        appCompatImageView.setVisibility(0);
        findViewById.setVisibility(8);
        final ItemIdV2 id2 = itemV2.id();
        if (id2 != appCompatImageView.getTag()) {
            appCompatImageView.setTag(id2);
            appCompatImageView.setImageResource(mo29924a(itemV2.id()));
        }
        if (itemV2.isAdminLimit() || itemV2.isEnable()) {
            z = f20656k;
        } else {
            z = false;
        }
        appCompatImageView.setEnabled(z);
        float f2 = 0.5f;
        if (itemV2.isAdminLimit()) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        appCompatImageView.setAlpha(f);
        appCompatImageView.setSelected(itemV2.isSelected());
        view.setTag(id2.name());
        if (itemV2.isAdminLimit() || itemV2.isEnable()) {
            z2 = f20656k;
        }
        view.setEnabled(z2);
        if (!itemV2.isAdminLimit()) {
            f2 = 1.0f;
        }
        view.setAlpha(f2);
        view.setSelected(itemV2.isSelected());
        final boolean isExpanded = this.f20660b.isExpanded(itemV2);
        if (itemV2.id().name().equals(str)) {
            appCompatImageView.setBackgroundResource(R.drawable.doc_toolbar_v2_subitem_all_pressed);
            appCompatImageView.post(new Runnable(appCompatImageView) {
                /* class com.bytedance.ee.bear.edit.component.toolbar2.$$Lambda$e$7hwunMxDQbyWTkVxChFOu5IJHI */
                public final /* synthetic */ AppCompatImageView f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    AbstractC7612e.this.m30535a((AbstractC7612e) this.f$1);
                }
            });
        } else {
            appCompatImageView.setBackgroundResource(R.drawable.doc_toolbar_v2_subitem_all_selector);
        }
        view.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e.C76142 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                AbstractC7612e.this.mo22166a(id2, String.valueOf(isExpanded));
            }
        });
    }
}
