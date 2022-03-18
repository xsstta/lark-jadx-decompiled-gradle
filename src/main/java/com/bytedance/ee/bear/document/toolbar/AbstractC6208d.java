package com.bytedance.ee.bear.document.toolbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.document.toolbar.Toolbar;
import com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6262h;
import com.bytedance.ee.bear.document.widget.KeyboardPlaceholderView;
import com.bytedance.ee.bear.edit.component.document.at.C7599b;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.util.keyboard.HardKeyboardUtils;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p718t.C13749l;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* renamed from: com.bytedance.ee.bear.document.toolbar.d */
public abstract class AbstractC6208d<Toolbar extends Toolbar> extends C7667e {

    /* renamed from: f */
    static final /* synthetic */ boolean f17276f = true;

    /* renamed from: g */
    private static int f17277g;

    /* renamed from: a */
    protected AbstractC6212e<Toolbar> f17278a;

    /* renamed from: b */
    protected C6215b f17279b;

    /* renamed from: c */
    protected View f17280c;

    /* renamed from: d */
    protected View f17281d;

    /* renamed from: e */
    protected View f17282e;

    /* renamed from: h */
    private ViewGroup f17283h;

    /* renamed from: i */
    private ObjectAnimator f17284i;

    /* renamed from: j */
    private KeyboardPlaceholderView f17285j;

    /* renamed from: k */
    private AbstractC10550f f17286k;

    /* renamed from: l */
    private ViewTreeObserver.OnWindowFocusChangeListener f17287l = new ViewTreeObserver.OnWindowFocusChangeListener() {
        /* class com.bytedance.ee.bear.document.toolbar.$$Lambda$d$kor4aAKh6nrCGQPPLT7eikRgdPY */

        public final void onWindowFocusChanged(boolean z) {
            AbstractC6208d.this.mo153701c((AbstractC6208d) z);
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo22139a(ItemId itemId);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC6212e mo22140a(FragmentActivity fragmentActivity);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Class<? extends DialogInterface$OnCancelListenerC1021b> mo22141b(ItemId itemId);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25101a(Toolbar toolbar, int i) {
        if (toolbar == null || toolbar.getChildren().length == 0) {
            this.f17282e.setVisibility(8);
        } else if (i > 0 || this.f17278a.hasExpandedSubToolbar() || HardKeyboardUtils.m43694a((Context) getActivity())) {
            this.f17282e.setVisibility(0);
            mo25100a(toolbar);
        } else {
            this.f17282e.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25100a(Toolbar toolbar) {
        int i;
        Item[] children = toolbar.getChildren();
        int childCount = this.f17283h.getChildCount();
        if (children.length > childCount) {
            LayoutInflater from = LayoutInflater.from(getContext());
            for (int i2 = 0; i2 < children.length - childCount; i2++) {
                from.inflate(R.layout.toolbar_top_level_item, this.f17283h);
            }
        } else if (children.length < childCount) {
            for (int i3 = 0; i3 < childCount - children.length; i3++) {
                ViewGroup viewGroup = this.f17283h;
                viewGroup.removeViewAt(viewGroup.getChildCount() - 1);
            }
        }
        for (int i4 = 0; i4 < children.length; i4++) {
            mo25098a(children[i4], this.f17283h.getChildAt(i4));
        }
        int length = children.length + 1;
        int e = C13749l.m55760e(getContext());
        if (length == 7) {
            i = Math.round((float) (e / 7));
        } else {
            i = f17277g;
        }
        mo25097a(i);
        for (int i5 = 0; i5 < this.f17283h.getChildCount(); i5++) {
            m25033a(i, this.f17283h.getChildAt(i5));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25098a(Item item, final View view) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.toolbarItemImg);
        final ItemId id = item.id();
        if (id != appCompatImageView.getTag()) {
            appCompatImageView.setTag(id);
            appCompatImageView.setImageResource(mo22139a(item.id()));
        }
        boolean z = false;
        appCompatImageView.setEnabled((item.isAdminLimit() || item.isEnable()) ? f17276f : false);
        float f = 0.5f;
        appCompatImageView.setAlpha(item.isAdminLimit() ? 0.5f : 1.0f);
        appCompatImageView.setSelected(item.isSelected());
        appCompatImageView.setActivated(this.f17278a.isExpanded(item));
        Stack<ItemId> b = this.f17278a.getExpandedSubToolbars().mo5927b();
        if (f17276f || b != null) {
            view.setTag(id.name());
            if (item.isAdminLimit() || item.isEnable()) {
                z = f17276f;
            }
            view.setEnabled(z);
            if (!item.isAdminLimit()) {
                f = 1.0f;
            }
            view.setAlpha(f);
            view.setSelected(item.isSelected());
            view.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.document.toolbar.AbstractC6208d.C62102 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    AbstractC6208d.this.mo25099a(id, String.valueOf(view.isSelected()));
                }
            });
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25099a(ItemId itemId, String str) {
        this.f17278a.processToolbarItemClick(itemId, str);
        AbstractC6212e<Toolbar> eVar = this.f17278a;
        eVar.setLastItemId(eVar.getCurrItemId());
        this.f17278a.setCurrItemId(itemId);
        if (itemId != ItemId.ConstId.keyboard) {
            return;
        }
        if (!this.f17278a.clearSubToolbars()) {
            C10548d.m43696a(getContext());
        } else {
            C10548d.m43702b(getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25102a(boolean z) {
        FragmentActivity activity = getActivity();
        if (f17276f || activity != null) {
            List<Fragment> fragments = activity.getSupportFragmentManager().getFragments();
            if (fragments != null) {
                for (Fragment fragment : fragments) {
                    if ((fragment instanceof AbstractC6207c) || (fragment instanceof C6262h)) {
                        if (z) {
                            ((DialogInterface$OnCancelListenerC1021b) fragment).mo5513b();
                        } else {
                            m25040b(fragment);
                        }
                    }
                }
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    private void mo153699b() {
        mo25101a(this.f17278a.getToolbar().mo5927b(), this.f17278a.getKeyboardHeight());
        mo153700c();
    }

    /* renamed from: c */
    private void mo153700c() {
        boolean z;
        boolean hasExpandedSubToolbar = this.f17278a.hasExpandedSubToolbar();
        boolean i = this.f17286k.mo39935i();
        View view = this.f17281d;
        if (!i || hasExpandedSubToolbar) {
            z = f17276f;
        } else {
            z = false;
        }
        view.setSelected(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        mo25102a((boolean) f17276f);
        if (getView() != null) {
            getView().getViewTreeObserver().removeOnWindowFocusChangeListener(this.f17287l);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25096a() {
        this.f17285j.mo25312c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25036a(Integer num) {
        mo153699b();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m25041b(Toolbar toolbar) {
        mo153699b();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void mo153701c(boolean z) {
        AbstractC6212e<Toolbar> eVar = this.f17278a;
        if (eVar != null) {
            eVar.hasWindowFocus().mo5929b(Boolean.valueOf(z));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25034a(View view) {
        mo25099a(ItemId.ConstId.keyboard, String.valueOf(this.f17281d.isSelected()));
    }

    /* renamed from: a */
    private void m25035a(Fragment fragment) {
        Dialog v_ = ((DialogInterface$OnCancelListenerC1021b) fragment).v_();
        if (v_ != null && !v_.isShowing() && getActivity() != null && !getActivity().isFinishing() && !getActivity().isDestroyed()) {
            v_.show();
        }
    }

    /* renamed from: b */
    private void m25040b(Fragment fragment) {
        Dialog v_ = ((DialogInterface$OnCancelListenerC1021b) fragment).v_();
        if (v_ != null && v_.isShowing()) {
            v_.dismiss();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (f17276f || activity != null) {
            this.f17278a = mo22140a(activity);
            this.f17279b = (C6215b) aj.m5366a(activity).mo6005a(C6215b.class);
            this.f17286k = AbstractC10550f.AbstractC10551a.m43717b(activity);
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m25042b(Stack stack) {
        this.f17285j.mo25310a(this.f17278a.hasExpandedSubToolbar());
        mo153699b();
        if (f17276f || stack != null) {
            m25037a(stack);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    public void mo25104c(ItemId itemId) {
        Bundle bundle;
        this.f17285j.mo25311b();
        FragmentActivity activity = getActivity();
        if (f17276f || activity != null) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            String name = itemId.name();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(name);
            if (!(findFragmentByTag instanceof DialogInterface$OnCancelListenerC1021b)) {
                Class<? extends DialogInterface$OnCancelListenerC1021b> b = mo22141b(itemId);
                if (getArguments() == null) {
                    bundle = new Bundle();
                } else {
                    bundle = getArguments();
                }
                ((DialogInterface$OnCancelListenerC1021b) Fragment.instantiate(activity, b.getName(), bundle)).mo5511a(supportFragmentManager, name);
                return;
            }
            m25035a(findFragmentByTag);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private void m25037a(Stack<ItemId> stack) {
        boolean z;
        if (stack.isEmpty()) {
            mo25096a();
            mo25102a(false);
            return;
        }
        FragmentActivity activity = getActivity();
        if (f17276f || activity != null) {
            List<Fragment> fragments = activity.getSupportFragmentManager().getFragments();
            if (fragments != null) {
                for (Fragment fragment : fragments) {
                    if ((fragment instanceof DialogInterface$OnCancelListenerC1021b) && !m25038a(stack, fragment)) {
                        m25040b(fragment);
                    }
                }
                Iterator<ItemId> it = stack.iterator();
                while (it.hasNext()) {
                    ItemId next = it.next();
                    Iterator<Fragment> it2 = fragments.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z = false;
                            break;
                        }
                        Fragment next2 = it2.next();
                        if (next.name().equals(next2.getTag())) {
                            z = f17276f;
                            if (next2 instanceof DialogInterface$OnCancelListenerC1021b) {
                                m25035a(next2);
                            }
                        }
                    }
                    if (!z) {
                        mo25104c(next);
                    }
                }
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public void mo25103b(boolean z) {
        int i;
        int i2;
        ObjectAnimator objectAnimator = this.f17284i;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        final View view = getView();
        if (f17276f || view != null) {
            int a = m25032a(view.getResources(), (int) R.integer.at_finder_anim_duration);
            if (z) {
                i = -view.getWidth();
                i2 = 0;
            } else {
                i2 = -view.getWidth();
                i = 0;
            }
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, "translationX", (float) i, (float) i2).setDuration((long) a);
            this.f17284i = duration;
            duration.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.ee.bear.document.toolbar.AbstractC6208d.C62113 */

                public void onAnimationEnd(Animator animator) {
                    view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                }
            });
            this.f17284i.start();
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25097a(int i) {
        m25033a(i, this.f17280c);
    }

    /* renamed from: a */
    private void m25033a(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width != i) {
            layoutParams.width = i;
            view.requestLayout();
        }
    }

    /* renamed from: a */
    public static int m25032a(Resources resources, int i) throws Resources.NotFoundException {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
        if (matchConfig == null) {
            return resources.getInteger(i);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            Log.d("ResProtector", "return admin result " + matchConfig.mReturnIdWhenException + ", level = " + i2);
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        f17277g = getContext().getResources().getDimensionPixelSize(R.dimen.toolbar_size);
        View findViewById = view.findViewById(R.id.keyboardSwitch);
        this.f17280c = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.document.toolbar.$$Lambda$d$orTarOB41EeABqKcho0MNpVm_w */

            public final void onClick(View view) {
                AbstractC6208d.this.m25034a((AbstractC6208d) view);
            }
        });
        this.f17281d = view.findViewById(R.id.keyboardSwitchIcon);
        this.f17285j = (KeyboardPlaceholderView) view.findViewById(R.id.keyboardPlaceholder);
        this.f17282e = view.findViewById(R.id.toolbarLayout);
        this.f17283h = (ViewGroup) view.findViewById(R.id.topLevelItems);
        this.f17278a.keyboardHeightLiveData().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.toolbar.$$Lambda$d$ZAxe9W0mWinco9XnlLzzJ2uThKU */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                AbstractC6208d.this.m25036a((AbstractC6208d) ((Integer) obj));
            }
        });
        this.f17278a.getToolbar().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.toolbar.$$Lambda$d$piTYJ6m06boe37SZLxtCYV8VIxo */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                AbstractC6208d.this.m25041b((AbstractC6208d) ((Toolbar) obj));
            }
        });
        this.f17278a.getExpandedSubToolbars().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.toolbar.$$Lambda$d$mK9CkR3_7YC_UCVdVb1ukLAP73o */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                AbstractC6208d.this.m25042b((AbstractC6208d) ((Stack) obj));
            }
        });
        this.f17279b.getActiveEditPanel().mo5923a(this, new AbstractC1178x<AbstractC6214a>() {
            /* class com.bytedance.ee.bear.document.toolbar.AbstractC6208d.C62091 */

            /* renamed from: a */
            AbstractC6214a f17288a;

            /* renamed from: a */
            public void onChanged(AbstractC6214a aVar) {
                if (aVar instanceof C7599b) {
                    AbstractC6208d.this.mo25103b(false);
                } else if (AbstractC6208d.this.f17278a == aVar && (this.f17288a instanceof C7599b)) {
                    AbstractC6208d.this.mo25103b(AbstractC6208d.f17276f);
                }
                this.f17288a = aVar;
            }
        });
        view.getViewTreeObserver().addOnWindowFocusChangeListener(this.f17287l);
    }

    /* renamed from: a */
    private boolean m25038a(Stack<ItemId> stack, Fragment fragment) {
        if (stack.isEmpty()) {
            return false;
        }
        String tag = fragment.getTag();
        Iterator<ItemId> it = stack.iterator();
        while (it.hasNext()) {
            if (it.next().name().equals(tag)) {
                return f17276f;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.toolbar_fragment, viewGroup, false);
    }
}
