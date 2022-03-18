package com.ss.android.lark.widget.tab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.request.p095a.AbstractC2513c;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bumptech.glide.request.p096b.AbstractC2529b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ignition.widget.squircle.SquircleImageView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.tab.C59204a;

public class NavigationTabItemView extends ConstraintLayout {

    /* renamed from: a */
    private int f147003a;

    /* renamed from: b */
    private int f147004b;

    /* renamed from: c */
    public SquircleImageView f147005c;

    /* renamed from: d */
    public C59204a f147006d;

    /* renamed from: e */
    public AbstractC59203a f147007e;

    /* renamed from: f */
    private FrameLayout f147008f;

    /* renamed from: g */
    private TextView f147009g;

    /* renamed from: h */
    private View f147010h;

    /* renamed from: com.ss.android.lark.widget.tab.NavigationTabItemView$a */
    public interface AbstractC59203a {
        /* renamed from: a */
        void mo157495a(NavigationTabItemView navigationTabItemView, boolean z, int i);
    }

    public void setTabColor(int i) {
    }

    public <T extends C59204a> T getRedDotView() {
        return (T) this.f147006d;
    }

    /* renamed from: d */
    public void mo201266d() {
        C59204a aVar = this.f147006d;
        if (aVar != null) {
            aVar.mo201284c();
        }
    }

    public Drawable getDefaultDrawable() {
        return this.f147005c.getDrawable();
    }

    public String getTextContent() {
        return this.f147009g.getText().toString();
    }

    public CharSequence getTitle() {
        TextView textView = this.f147009g;
        if (textView == null) {
            return "";
        }
        return textView.getText();
    }

    /* renamed from: a */
    private void mo153395a() {
        C59204a aVar = this.f147006d;
        if (aVar != null && this.f147007e != null) {
            aVar.mo201281a((C59204a.AbstractC59205a) new C59204a.AbstractC59205a() {
                /* class com.ss.android.lark.widget.tab.NavigationTabItemView.C592023 */

                @Override // com.ss.android.lark.widget.tab.C59204a.AbstractC59205a
                /* renamed from: a */
                public void mo201280a(boolean z, int i) {
                    if (NavigationTabItemView.this.f147007e != null) {
                        NavigationTabItemView.this.f147007e.mo157495a(NavigationTabItemView.this, z, i);
                    }
                }
            });
        }
    }

    public NavigationTabItemView(Context context) {
        this(context, null);
    }

    public void setTabTitle(String str) {
        this.f147009g.setText(str);
    }

    /* renamed from: a */
    public void mo201263a(int i) {
        C59204a aVar = this.f147006d;
        if (aVar != null) {
            aVar.mo31307a(Integer.valueOf(i));
        }
    }

    public void setTabIcon(Drawable drawable) {
        SquircleImageView squircleImageView = this.f147005c;
        if (squircleImageView != null && drawable != null) {
            squircleImageView.setImageDrawable(drawable);
        }
    }

    public void setNavigationRedDotListener(AbstractC59203a aVar) {
        C59204a aVar2;
        this.f147007e = aVar;
        if (aVar != null || (aVar2 = this.f147006d) == null) {
            mo153395a();
        } else {
            aVar2.mo201281a((C59204a.AbstractC59205a) null);
        }
    }

    public void setRedDotView(C59204a aVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        C59204a aVar2 = this.f147006d;
        if (aVar2 != null) {
            removeView(aVar2.mo201282b());
        }
        this.f147006d = aVar;
        mo201266d();
        this.f147008f.addView(this.f147006d.mo201282b(), layoutParams);
        mo153395a();
    }

    /* renamed from: a */
    public void mo201265a(boolean z) {
        if (z) {
            if (this.f147010h == null) {
                View view = new View(getContext());
                this.f147010h = view;
                view.setBackgroundResource(R.drawable.ic_nav_blue_dot);
                int dp2px = UIUtils.dp2px(getContext(), 6.0f);
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(dp2px, dp2px);
                layoutParams.f2812d = R.id.textItem;
                layoutParams.f2816h = R.id.textItem;
                layoutParams.f2819k = R.id.textItem;
                addView(this.f147010h, layoutParams);
            }
            TextView textView = this.f147009g;
            int i = this.f147004b;
            textView.setPadding(i, 0, i, 0);
            this.f147010h.setVisibility(0);
            return;
        }
        TextView textView2 = this.f147009g;
        int i2 = this.f147003a;
        textView2.setPadding(i2, 0, i2, 0);
        View view2 = this.f147010h;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    public void setRemoteDrawable(AbstractC59206b bVar) {
        if (bVar != null) {
            this.f147005c.setImageDrawable(bVar.mo149226a());
            final AbstractC59206b a = AbstractC59207c.m229970a(bVar);
            Log.m165389i("NavigationTabItemView", "setRemoteDrawable() called with: remoteDrawable = [" + bVar + "]");
            ((C2124f) ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9141a(this).mo10415a(bVar.mo149227b()).mo11125a(bVar.mo149226a())).mo11140b(bVar.mo149226a())).mo11157n()).mo10397a((AbstractC2522j) new AbstractC2513c<Drawable>() {
                /* class com.ss.android.lark.widget.tab.NavigationTabItemView.C592012 */

                @Override // com.bumptech.glide.request.p095a.AbstractC2522j
                /* renamed from: a */
                public void mo11036a(Drawable drawable) {
                    NavigationTabItemView.this.f147005c.setImageDrawable(drawable);
                    Log.m165389i("NavigationTabItemView", "setRemoteDrawable() cleared with: remoteDrawable = [" + a + "]");
                }

                @Override // com.bumptech.glide.request.p095a.AbstractC2513c, com.bumptech.glide.request.p095a.AbstractC2522j
                /* renamed from: b */
                public void mo10444b(Drawable drawable) {
                    NavigationTabItemView.this.f147005c.setImageDrawable(drawable);
                    Log.m165389i("NavigationTabItemView", "setRemoteDrawable() failed with: remoteDrawable = [" + a + "]");
                }

                @Override // com.bumptech.glide.request.p095a.AbstractC2522j
                /* renamed from: a */
                public /* bridge */ /* synthetic */ void mo10442a(Object obj, AbstractC2529b bVar) {
                    mo201279a((Drawable) obj, (AbstractC2529b<? super Drawable>) bVar);
                }

                /* renamed from: a */
                public void mo201279a(Drawable drawable, AbstractC2529b<? super Drawable> bVar) {
                    NavigationTabItemView.this.f147005c.setImageDrawable(drawable);
                    Log.m165389i("NavigationTabItemView", "setRemoteDrawable() success with: remoteDrawable = [" + a + "]");
                }
            });
        }
    }

    /* renamed from: a */
    private void m229950a(Context context) {
        float f;
        ConstraintLayout.LayoutParams layoutParams;
        this.f147003a = UIUtils.dp2px(context, 6.0f);
        float f2 = 12.0f;
        this.f147004b = UIUtils.dp2px(context, 12.0f);
        boolean b = DesktopUtil.m144307b();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f147008f = frameLayout;
        frameLayout.setId(R.id.layout_container);
        SquircleImageView squircleImageView = new SquircleImageView(getContext());
        this.f147005c = squircleImageView;
        squircleImageView.setId(R.id.icon);
        this.f147005c.setRadius(UIUtils.dp2px(context, 12.0f));
        this.f147005c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f147005c.setBackgroundColor(ContextCompat.getColor(context, R.color.ud_N900_05));
        if (b) {
            f = 32.0f;
        } else {
            f = 52.0f;
        }
        int dp2px = UIUtils.dp2px(context, f);
        int dp2px2 = UIUtils.dp2px(getContext(), 4.5f) * 2;
        if (!b) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dp2px, dp2px);
            layoutParams2.gravity = 17;
            int dp2px3 = UIUtils.dp2px(context, 14.0f);
            this.f147005c.setPadding(dp2px3, dp2px3, dp2px3, dp2px3);
            this.f147008f.addView(this.f147005c, layoutParams2);
            int i = dp2px + dp2px2;
            ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(i, i);
            layoutParams3.f2815g = 0;
            layoutParams3.f2812d = 0;
            layoutParams3.f2816h = 0;
            layoutParams3.topMargin = UIUtils.dp2px(getContext(), 3.5f);
            addView(this.f147008f, layoutParams3);
        } else {
            ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(dp2px, dp2px2 + dp2px);
            layoutParams4.f2812d = 0;
            layoutParams4.f2816h = 0;
            layoutParams4.f2819k = 0;
            layoutParams4.leftMargin = UIUtils.dp2px(getContext(), 12.0f);
            addView(this.f147005c, layoutParams4);
        }
        TextView textView = new TextView(getContext());
        this.f147009g = textView;
        textView.setId(R.id.textItem);
        if (!b) {
            layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.f2815g = 0;
            layoutParams.f2812d = 0;
            layoutParams.f2817i = R.id.layout_container;
            layoutParams.f2819k = 0;
            layoutParams.f2783A = BitmapDescriptorFactory.HUE_RED;
            this.f147009g.setGravity(49);
            TextView textView2 = this.f147009g;
            int i2 = this.f147003a;
            textView2.setPadding(i2, 0, i2, 0);
            this.f147009g.setMaxLines(2);
        } else {
            layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.f2813e = R.id.icon;
            layoutParams.f2816h = 0;
            layoutParams.f2819k = 0;
            layoutParams.leftMargin = UIUtils.dp2px(getContext(), 4.0f);
            this.f147009g.setSingleLine(true);
        }
        TextView textView3 = this.f147009g;
        if (b) {
            f2 = 14.0f;
        }
        textView3.setTextSize(f2);
        TextView textView4 = this.f147009g;
        textView4.setTextColor(ContextCompat.getColor(textView4.getContext(), R.color.text_caption));
        this.f147009g.setEllipsize(TextUtils.TruncateAt.END);
        addView(this.f147009g, layoutParams);
    }

    /* renamed from: a */
    public <T extends ViewGroup.MarginLayoutParams> void mo201264a(C59204a aVar, T t) {
        setRedDotView(aVar);
    }

    public NavigationTabItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationTabItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m229950a(context);
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.ss.android.lark.widget.tab.NavigationTabItemView.View$OnAttachStateChangeListenerC592001 */

            public void onViewDetachedFromWindow(View view) {
            }

            public void onViewAttachedToWindow(View view) {
                if (NavigationTabItemView.this.f147006d != null && NavigationTabItemView.this.f147006d.mo201282b() != null) {
                    NavigationTabItemView.this.f147006d.mo201282b().requestLayout();
                }
            }
        });
    }
}
