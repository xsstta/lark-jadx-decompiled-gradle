package com.ss.android.lark.widget.tab;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.p095a.AbstractC2513c;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bumptech.glide.request.p096b.AbstractC2529b;
import com.larksuite.component.dynamicresources.DynamicResourcesFacade;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.desktopmode.view.C36592a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import java.util.Map;

public class MainTabItemView extends ConstraintLayout {

    /* renamed from: a */
    private FrameLayout f146976a;

    /* renamed from: b */
    private boolean f146977b;

    /* renamed from: c */
    protected boolean f146978c;

    /* renamed from: d */
    public boolean f146979d;

    /* renamed from: e */
    public C59204a f146980e;

    /* renamed from: f */
    private ImageView f146981f;

    /* renamed from: g */
    private TextView f146982g;

    /* renamed from: h */
    private Drawable f146983h;

    /* renamed from: i */
    private Drawable f146984i;

    /* renamed from: j */
    private C36592a f146985j;

    /* renamed from: k */
    private Animation f146986k;

    /* renamed from: l */
    private AbstractC59196a f146987l;

    /* renamed from: m */
    private String f146988m;

    /* renamed from: com.ss.android.lark.widget.tab.MainTabItemView$a */
    public interface AbstractC59196a {
        Drawable getDrawable();
    }

    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        return true;
    }

    public Drawable getDrawableDefault() {
        return this.f146983h;
    }

    public ImageView getIcon() {
        return this.f146981f;
    }

    public <T extends C59204a> T getRedDotView() {
        return (T) this.f146980e;
    }

    /* access modifiers changed from: protected */
    public final boolean getRemoteDrawableTintEnabled() {
        return this.f146977b;
    }

    public boolean getStatus() {
        return this.f146978c;
    }

    /* renamed from: l */
    private boolean m229927l() {
        return DynamicResourcesFacade.m88635b((int) R.color.suite_skin_vi_icon_color);
    }

    /* renamed from: h */
    public void mo201248h() {
        C59204a aVar = this.f146980e;
        if (aVar != null) {
            aVar.mo201284c();
        }
    }

    /* renamed from: k */
    private void m229926k() {
        C36592a aVar = this.f146985j;
        if (aVar != null) {
            aVar.dismiss();
            this.f146985j = null;
        }
    }

    /* renamed from: b */
    public void mo110683b() {
        mo201238b(false);
        this.f146981f.clearAnimation();
    }

    /* renamed from: f */
    public void mo201240f() {
        if (this.f146981f != null) {
            this.f146976a.bringToFront();
            this.f146981f.bringToFront();
        }
    }

    /* renamed from: g */
    public final boolean mo201241g() {
        if (!this.f146979d || !this.f146977b) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void mo137108c() {
        m229919b(getContext());
        m229916a(getContext());
        m229925j();
    }

    /* renamed from: e */
    private void mo167444e() {
        int dp2px = UIUtils.dp2px(getContext(), 22.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp2px, dp2px);
        layoutParams.gravity = 81;
        this.f146981f.setLayoutParams(layoutParams);
    }

    /* renamed from: j */
    private void m229925j() {
        if (DesktopUtil.m144301a(getContext())) {
            setOnHoverListener(new View.OnHoverListener() {
                /* class com.ss.android.lark.widget.tab.MainTabItemView.View$OnHoverListenerC591953 */

                public boolean onHover(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 9) {
                        MainTabItemView.this.setHovered(true);
                    } else if (motionEvent.getAction() == 10) {
                        MainTabItemView.this.setHovered(false);
                    }
                    return false;
                }
            });
        }
    }

    /* renamed from: a */
    public void mo110677a() {
        mo201238b(true);
        if (this.f146986k == null) {
            this.f146986k = getTabAnimation();
        }
        Animation animation = this.f146986k;
        if (animation != null) {
            this.f146981f.startAnimation(animation);
        } else {
            Log.m165383e("MainTabItemView", "mTabAnimation is null");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.tab.MainTabItemView$b */
    public class C59197b {

        /* renamed from: a */
        public Map<String, C59199a> f146994a;

        /* renamed from: c */
        private IGetDataCallback<Map<String, C59199a>> f146996c;

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.lark.widget.tab.MainTabItemView$b$a */
        public class C59199a {

            /* renamed from: a */
            public boolean f147000a;

            /* renamed from: b */
            public Drawable f147001b;

            public String toString() {
                return "LoadResult{" + "finished=" + this.f147000a + ", drawable=" + this.f147001b + '}';
            }

            private C59199a() {
            }
        }

        /* renamed from: b */
        private void m229941b() {
            for (String str : this.f146994a.keySet()) {
                ComponentCallbacks2C2115c.m9151c(MainTabItemView.this.getContext()).mo10415a(str).mo10397a((AbstractC2522j) new AbstractC2513c<Drawable>(str) {
                    /* class com.ss.android.lark.widget.tab.MainTabItemView.C59197b.C591981 */

                    /* renamed from: a */
                    final /* synthetic */ String f146997a;

                    /* renamed from: c */
                    private String f146999c;

                    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
                    /* renamed from: a */
                    public void mo11036a(Drawable drawable) {
                        Log.m165389i("MainTabItemView", "onLoadCleared() called with: placeholder = [" + drawable + "]");
                    }

                    @Override // com.bumptech.glide.request.p095a.AbstractC2513c, com.bumptech.glide.request.p095a.AbstractC2522j
                    /* renamed from: b */
                    public void mo10444b(Drawable drawable) {
                        Log.m165398w("MainTabItemView", "onLoadFailed() called with: errorDrawable = [" + drawable + "]", new GlideException("main tab item icon failed " + this.f146999c));
                        super.mo10444b(drawable);
                        C59199a aVar = C59197b.this.f146994a.get(this.f146999c);
                        if (aVar != null) {
                            aVar.f147000a = true;
                        }
                        C59197b.this.mo201259a();
                    }

                    {
                        this.f146997a = r2;
                        this.f146999c = r2;
                    }

                    /* renamed from: a */
                    public void mo10442a(Drawable drawable, AbstractC2529b bVar) {
                        C59199a aVar = C59197b.this.f146994a.get(this.f146999c);
                        Log.m165389i("MainTabItemView", "onResourceReady() called");
                        if (aVar != null) {
                            aVar.f147000a = true;
                            aVar.f147001b = drawable;
                        }
                        C59197b.this.mo201259a();
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo201259a() {
            for (C59199a aVar : this.f146994a.values()) {
                if (!(aVar == null || aVar.f147000a)) {
                    return;
                }
            }
            IGetDataCallback<Map<String, C59199a>> iGetDataCallback = this.f146996c;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(this.f146994a);
                this.f146996c = null;
            }
        }

        private C59197b() {
            this.f146994a = new HashMap();
        }

        /* renamed from: a */
        public void mo201260a(IGetDataCallback<Map<String, C59199a>> iGetDataCallback, String... strArr) {
            if (!(strArr == null || strArr.length == 0)) {
                this.f146996c = iGetDataCallback;
                for (String str : strArr) {
                    this.f146994a.put(str, new C59199a());
                }
                m229941b();
            }
        }
    }

    /* renamed from: d */
    private void mo153398d() {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(UIUtils.dp2px(getContext(), 38.0f), UIUtils.dp2px(getContext(), 30.0f));
        layoutParams.f2815g = 0;
        layoutParams.f2812d = 0;
        layoutParams.f2816h = 0;
        layoutParams.topMargin = (int) C25653b.m91892a(getContext(), 9.0f);
        this.f146976a.setLayoutParams(layoutParams);
    }

    /* renamed from: i */
    private void m229924i() {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.f2815g = 0;
        layoutParams.f2812d = 0;
        layoutParams.f2817i = R.id.layout_container;
        layoutParams.topMargin = UIUtils.dp2px(getContext(), 5.0f);
        this.f146982g.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public Animation getTabAnimation() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(125);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        scaleAnimation.setRepeatCount(1);
        scaleAnimation.setRepeatMode(2);
        return scaleAnimation;
    }

    /* access modifiers changed from: protected */
    public final void setRemoteDrawableTintEnabled(boolean z) {
        this.f146977b = z;
    }

    public MainTabItemView(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    public void mo201239c(float f) {
        ImageView imageView = this.f146981f;
        if (imageView != null) {
            imageView.setAlpha(f);
        }
    }

    /* renamed from: a */
    public void mo201233a(int i) {
        C59204a aVar = this.f146980e;
        if (aVar != null) {
            aVar.mo31307a(Integer.valueOf(i));
        }
    }

    public void setTabTitle(String str) {
        this.f146988m = str;
        TextView textView = this.f146982g;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* renamed from: b */
    private void m229920b(ImageView imageView) {
        if (!this.f146977b) {
            imageView.setImageTintList(getContext().getResources().getColorStateList(R.color.fill_img_mask));
            imageView.setImageTintMode(PorterDuff.Mode.SRC_ATOP);
        }
    }

    /* renamed from: a */
    private void m229916a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.f146976a = frameLayout;
        frameLayout.setId(R.id.layout_container);
        mo153398d();
        addView(this.f146976a);
        ImageView imageView = new ImageView(context);
        this.f146981f = imageView;
        imageView.setId(R.id.icon);
        mo167444e();
        this.f146976a.addView(this.f146981f);
    }

    /* renamed from: b */
    public void mo201238b(boolean z) {
        this.f146978c = z;
        setIconSelectStatus(z);
        setSelected(z);
    }

    public void onHoverChanged(boolean z) {
        super.onHoverChanged(z);
        if (DesktopUtil.m144301a(getContext())) {
            if (!this.f146978c) {
                setIconSelectStatus(z);
            }
            if (z) {
                m229917a(this, this.f146988m);
            } else {
                m229926k();
            }
        }
    }

    public void setRedDotView(C59204a aVar) {
        C59204a aVar2 = this.f146980e;
        if (aVar2 != null) {
            removeView(aVar2.mo201282b());
        }
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.f2816h = R.id.layout_container;
        layoutParams.f2827s = R.id.layout_container;
        this.f146980e = aVar;
        mo201248h();
        addView(this.f146980e.mo201282b(), layoutParams);
    }

    /* renamed from: b */
    private void m229919b(Context context) {
        TextView textView = new TextView(getContext());
        this.f146982g = textView;
        textView.setId(R.id.textItem);
        m229924i();
        if (!DesktopUtil.m144301a(context)) {
            this.f146982g.setTextSize(12.0f);
            this.f146982g.setTextColor(getContext().getResources().getColor(R.color.text_caption));
            this.f146982g.setSingleLine(true);
            this.f146982g.setEllipsize(TextUtils.TruncateAt.END);
            addView(this.f146982g);
            return;
        }
        setBackgroundResource(R.drawable.main_tab_bg_selector);
    }

    /* renamed from: a */
    private void m229918a(ImageView imageView) {
        imageView.setImageTintList(new ColorStateList(new int[][]{new int[]{16842913}, new int[]{16842910}}, new int[]{UIHelper.getColor(R.color.suite_skin_vi_icon_color), UIHelper.getColor(R.color.icon_n3)}));
    }

    public void setIconSelectStatus(boolean z) {
        boolean z2;
        Drawable drawable;
        int i;
        AbstractC59196a aVar;
        super.setSelected(z);
        if (z) {
            if (this.f146984i == null && (aVar = this.f146987l) != null) {
                this.f146984i = aVar.getDrawable();
            }
            if (!m229927l() || (this.f146979d && !this.f146977b)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                ImageView imageView = this.f146981f;
                if (imageView != null) {
                    m229918a(imageView);
                }
                Log.m165389i("MainTabItemView", "the vi skin of MainTab icon has worked");
            } else if (this.f146979d) {
                m229920b(this.f146981f);
            }
            ImageView imageView2 = this.f146981f;
            if (z2) {
                drawable = this.f146983h;
            } else {
                drawable = this.f146984i;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f146982g != null) {
                if (m229927l()) {
                    i = R.color.suite_skin_vi_icon_color;
                    Log.m165389i("MainTabItemView", "the vi skin of MainTab icon has worked");
                } else {
                    i = R.color.primary_pri_500;
                }
                this.f146982g.setTextColor(getContext().getResources().getColor(i));
                return;
            }
            return;
        }
        this.f146981f.setImageDrawable(this.f146983h);
        TextView textView = this.f146982g;
        if (textView != null) {
            textView.setTextColor(getContext().getResources().getColor(R.color.text_caption));
        }
    }

    /* renamed from: a */
    public void mo201236a(C59204a aVar, ConstraintLayout.LayoutParams layoutParams) {
        setRedDotView(aVar);
    }

    public MainTabItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m229917a(View view, String str) {
        if (str != null) {
            if (this.f146985j == null) {
                this.f146985j = new C36592a.C36593a().mo135002a(str).mo135003a(getContext());
            }
            this.f146985j.mo134998a(view, 60, 48, -10, 0);
        }
    }

    /* renamed from: a */
    public void mo201234a(Drawable drawable, Drawable drawable2) {
        Log.m165389i("MainTabItemView", "setIconDrawable() called with: drawableDefault = [" + drawable + "], drawableSelected = [" + drawable2 + "]");
        this.f146983h = drawable;
        this.f146984i = drawable2;
        ImageView imageView = this.f146981f;
        if (this.f146978c) {
            drawable = drawable2;
        }
        imageView.setImageDrawable(drawable);
        if (m229927l() && (!this.f146979d || this.f146977b)) {
            m229918a(this.f146981f);
        } else if (this.f146979d && this.f146977b) {
            this.f146981f.setImageTintList(getContext().getResources().getColorStateList(R.color.mine_tab_icon_color));
            this.f146981f.setImageTintMode(PorterDuff.Mode.SRC_IN);
        }
    }

    /* renamed from: a */
    public void mo201235a(Drawable drawable, AbstractC59196a aVar) {
        this.f146983h = drawable;
        this.f146987l = aVar;
        if (this.f146978c) {
            if (aVar != null) {
                this.f146984i = aVar.getDrawable();
            }
            this.f146981f.setImageDrawable(this.f146984i);
        } else {
            this.f146981f.setImageDrawable(drawable);
        }
        if (m229927l() && (!this.f146979d || this.f146977b)) {
            m229918a(this.f146981f);
        } else if (this.f146979d && this.f146977b) {
            this.f146981f.setImageTintList(getContext().getResources().getColorStateList(R.color.mine_tab_icon_color));
            this.f146981f.setImageTintMode(PorterDuff.Mode.SRC_IN);
        }
    }

    /* renamed from: a */
    public void mo201237a(AbstractC59206b bVar, AbstractC59206b bVar2) {
        this.f146979d = true;
        final AbstractC59206b a = AbstractC59207c.m229970a(bVar);
        final AbstractC59206b a2 = AbstractC59207c.m229970a(bVar2);
        Log.m165389i("MainTabItemView", getClass().getName() + " setRemoteDrawable() called with: defaultRemoteDrawable = [" + a + "], selectedRemoteDrawable = [" + a2 + "]");
        this.f146983h = bVar.mo149226a();
        $$Lambda$MainTabItemView$hZN5hCTlI2C3_p4QXOrRyHsf_GE r3 = new AbstractC59196a() {
            /* class com.ss.android.lark.widget.tab.$$Lambda$MainTabItemView$hZN5hCTlI2C3_p4QXOrRyHsf_GE */

            @Override // com.ss.android.lark.widget.tab.MainTabItemView.AbstractC59196a
            public final Drawable getDrawable() {
                return AbstractC59206b.this.mo149226a();
            }
        };
        this.f146987l = r3;
        mo201235a(this.f146983h, r3);
        new C59197b().mo201260a(new IGetDataCallback<Map<String, C59197b.C59199a>>() {
            /* class com.ss.android.lark.widget.tab.MainTabItemView.C591942 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                MainTabItemView.this.f146979d = false;
                Log.m165398w("MainTabItemView", MainTabItemView.this.getClass().getName() + " setRemoteDrawable() failed defaultRemoteDrawable = [" + a + "], selectedRemoteDrawable = [" + a2 + "]", errorResult.getException());
            }

            /* renamed from: a */
            public void onSuccess(Map<String, C59197b.C59199a> map) {
                if (map != null) {
                    Drawable drawable = map.get(a.mo149227b()).f147001b;
                    Drawable drawable2 = map.get(a2.mo149227b()).f147001b;
                    if (drawable == null || drawable2 == null) {
                        Log.m165397w("MainTabItemView", MainTabItemView.this.getClass().getName() + " setRemoteDrawable() success, one or more drawable is null. defaultRemoteDrawable = [" + drawable + "], selectedRemoteDrawable = [" + drawable2 + "]");
                        return;
                    }
                    Log.m165389i("MainTabItemView", MainTabItemView.this.getClass().getName() + " setRemoteDrawable() success defaultRemoteDrawable = [" + a + "], selectedRemoteDrawable = [" + a2 + "]");
                    MainTabItemView.this.mo201234a(drawable, drawable2);
                    MainTabItemView.this.f146979d = true;
                }
            }
        }, bVar.mo149227b(), bVar2.mo149227b());
        m229920b(this.f146981f);
    }

    public MainTabItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo137108c();
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.ss.android.lark.widget.tab.MainTabItemView.View$OnAttachStateChangeListenerC591931 */

            public void onViewDetachedFromWindow(View view) {
            }

            public void onViewAttachedToWindow(View view) {
                if (MainTabItemView.this.f146980e != null && MainTabItemView.this.f146980e.mo201282b() != null) {
                    MainTabItemView.this.f146980e.mo201282b().requestLayout();
                }
            }
        });
    }
}
