package com.bytedance.ee.bear.document.toolbar;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13746i;
import com.bytedance.ee.util.p718t.C13749l;

/* renamed from: com.bytedance.ee.bear.document.toolbar.f */
public class C6218f {

    /* renamed from: a */
    private NavBarBottomInsetCompatEntity f17299a;

    /* renamed from: b */
    private int f17300b;

    /* renamed from: com.bytedance.ee.bear.document.toolbar.f$a */
    public static class C6221a {

        /* renamed from: a */
        public static C6218f f17307a = new C6218f();
    }

    /* renamed from: a */
    public static C6218f m25065a() {
        return C6221a.f17307a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25066a(Activity activity) {
        this.f17300b = C13746i.m55721a(activity);
        C13479a.m54772d("ToolbarCompatHelper", "NavBarBottomInsetCompat init: " + this.f17300b);
    }

    /* renamed from: a */
    public View mo25151a(View view) {
        int i;
        C13479a.m54764b("ToolbarCompatHelper", "doCompat2 sEntity=" + this.f17299a + " " + this.f17300b);
        NavBarBottomInsetCompatEntity navBarBottomInsetCompatEntity = this.f17299a;
        if (navBarBottomInsetCompatEntity == null || !navBarBottomInsetCompatEntity.isEnable() || this.f17300b <= this.f17299a.getMinLimit() || this.f17300b > this.f17299a.getMinHeight()) {
            return view;
        }
        Context context = view.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(View.generateViewId());
        frameLayout.setTag("CompatNavBarLayout");
        frameLayout.addView(view);
        final AbstractC10550f b = AbstractC10550f.AbstractC10551a.m43717b((Activity) context);
        final $$Lambda$f$GoFUkWRDrncjMVWgkdfkhkHSGQ r0 = new AbstractC10549e(frameLayout, b) {
            /* class com.bytedance.ee.bear.document.toolbar.$$Lambda$f$GoFUkWRDrncjMVWgkdfkhkHSGQ */
            public final /* synthetic */ FrameLayout f$1;
            public final /* synthetic */ AbstractC10550f f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
            public final void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
                C6218f.this.m25068a(this.f$1, this.f$2, fVar, i, i2);
            }
        };
        int paddingLeft = frameLayout.getPaddingLeft();
        int paddingTop = frameLayout.getPaddingTop();
        int paddingRight = frameLayout.getPaddingRight();
        if (b.mo39935i()) {
            i = this.f17299a.getPadding();
        } else {
            i = 0;
        }
        frameLayout.setPadding(paddingLeft, paddingTop, paddingRight, i);
        frameLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.bytedance.ee.bear.document.toolbar.C6218f.View$OnAttachStateChangeListenerC62191 */

            public void onViewAttachedToWindow(View view) {
                b.mo39924a(r0);
            }

            public void onViewDetachedFromWindow(View view) {
                b.mo39928b(r0);
            }
        });
        return frameLayout;
    }

    /* renamed from: a */
    public View mo25152a(View view, int i) {
        ColorDrawable colorDrawable;
        C13479a.m54764b("ToolbarCompatHelper", "doCompat sEntity=" + this.f17299a + " " + this.f17300b);
        NavBarBottomInsetCompatEntity navBarBottomInsetCompatEntity = this.f17299a;
        if (navBarBottomInsetCompatEntity == null || !navBarBottomInsetCompatEntity.isEnable() || this.f17300b <= this.f17299a.getMinLimit() || this.f17300b > this.f17299a.getMinHeight()) {
            return view;
        }
        Context context = view.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(View.generateViewId());
        frameLayout.setTag("CompatNavBarLayout");
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
        frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), this.f17299a.getPadding());
        final AbstractC10550f b = AbstractC10550f.AbstractC10551a.m43717b((Activity) context);
        final $$Lambda$f$f9BGqhrcs9FCCxIEj390hmN3Vw r2 = new AbstractC10549e(frameLayout, b, context, i) {
            /* class com.bytedance.ee.bear.document.toolbar.$$Lambda$f$f9BGqhrcs9FCCxIEj390hmN3Vw */
            public final /* synthetic */ FrameLayout f$0;
            public final /* synthetic */ AbstractC10550f f$1;
            public final /* synthetic */ Context f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
            public final void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
                C6218f.m25067a(this.f$0, this.f$1, this.f$2, this.f$3, fVar, i, i2);
            }
        };
        if (b.mo39935i()) {
            colorDrawable = null;
        } else {
            colorDrawable = new ColorDrawable(C13749l.m55755c(context, i));
        }
        frameLayout.setBackground(colorDrawable);
        frameLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.bytedance.ee.bear.document.toolbar.C6218f.View$OnAttachStateChangeListenerC62202 */

            public void onViewAttachedToWindow(View view) {
                b.mo39924a(r2);
            }

            public void onViewDetachedFromWindow(View view) {
                b.mo39928b(r2);
            }
        });
        return frameLayout;
    }

    /* renamed from: a */
    public void mo25153a(Activity activity, NavBarBottomInsetCompatEntity navBarBottomInsetCompatEntity) {
        this.f17299a = navBarBottomInsetCompatEntity;
        if (navBarBottomInsetCompatEntity != null && navBarBottomInsetCompatEntity.isEnable() && activity != null) {
            activity.getWindow().getDecorView().post(new Runnable(activity) {
                /* class com.bytedance.ee.bear.document.toolbar.$$Lambda$f$ALzwbJXraCv0lXN0FJA8fevLlc */
                public final /* synthetic */ Activity f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C6218f.this.m25066a((C6218f) this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25068a(FrameLayout frameLayout, AbstractC10550f fVar, AbstractC10550f fVar2, int i, int i2) {
        int i3;
        C13479a.m54764b("ToolbarCompatHelper", "doCompat2 keyboard changed " + i);
        int paddingLeft = frameLayout.getPaddingLeft();
        int paddingTop = frameLayout.getPaddingTop();
        int paddingRight = frameLayout.getPaddingRight();
        if (fVar.mo39935i()) {
            i3 = this.f17299a.getPadding();
        } else {
            i3 = 0;
        }
        frameLayout.setPadding(paddingLeft, paddingTop, paddingRight, i3);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m25067a(FrameLayout frameLayout, AbstractC10550f fVar, Context context, int i, AbstractC10550f fVar2, int i2, int i3) {
        ColorDrawable colorDrawable;
        C13479a.m54764b("ToolbarCompatHelper", "doCompat keyboard changed " + i2);
        if (fVar.mo39935i()) {
            colorDrawable = null;
        } else {
            colorDrawable = new ColorDrawable(C13749l.m55755c(context, i));
        }
        frameLayout.setBackground(colorDrawable);
    }
}
