package com.bytedance.ee.bear.list.homepage.title;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.ee.bear.facade.common.widget.RoundImageView;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.homepage.title.HomeMainTitleBar;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13747j;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class MainTabTitleBar extends RelativeLayout implements AbstractC8505c {

    /* renamed from: a */
    public Animator f22971a;

    /* renamed from: b */
    public boolean f22972b = true;

    /* renamed from: c */
    private float f22973c;

    /* renamed from: d */
    private ImageView f22974d;

    /* renamed from: e */
    private AppCompatImageView f22975e;

    /* renamed from: f */
    private TextView f22976f;

    /* renamed from: g */
    private BaseTitleBar f22977g;

    /* renamed from: h */
    private int f22978h;

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    public View getCreateView() {
        return null;
    }

    public void setCreateViewEnable(boolean z) {
    }

    public void setOnCreateViewClickListener(View.OnClickListener onClickListener) {
    }

    public void setOnGridViewClickListener(HomeMainTitleBar.AbstractC8495a aVar) {
    }

    public void setShowBadgeDelegate(HomeMainTitleBar.AbstractC8496b bVar) {
    }

    public View getLeftView() {
        return this.f22974d;
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    public int getTitleType() {
        return this.f22978h;
    }

    public Bitmap getTitleSnapshot() {
        return C8292f.m34121a(this);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        mo33220b();
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    /* renamed from: a */
    public void mo33175a() {
        setAvatarVisible(true);
        setSearchVisible(true);
        setAllReadVisible(false);
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    public int getTitleBarHeight() {
        return getResources().getDimensionPixelSize(R.dimen.list_home_title_bar_height_min);
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    /* renamed from: k */
    public void mo33198k() {
        this.f22973c = BitmapDescriptorFactory.HUE_RED;
        this.f22972b = true;
        setAlpha(1.0f);
        setVisibility(0);
    }

    /* renamed from: c */
    private void m35224c() {
        BaseTitleBar baseTitleBar = new BaseTitleBar(getContext());
        this.f22977g = baseTitleBar;
        baseTitleBar.setDividerVisible(false);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(this.f22977g, layoutParams);
    }

    /* renamed from: d */
    private void m35225d() {
        RoundImageView roundImageView = new RoundImageView(getContext());
        this.f22974d = roundImageView;
        roundImageView.setImageResource(R.drawable.facade_common_avatar_place_holder);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C13749l.m55738a(32), C13749l.m55738a(32));
        layoutParams.setMarginStart(C13749l.m55738a(16));
        layoutParams.addRule(20);
        layoutParams.addRule(15);
        addView(this.f22974d, layoutParams);
    }

    /* renamed from: b */
    public void mo33220b() {
        setLayoutParams(new RelativeLayout.LayoutParams(-1, (int) getResources().getDimension(R.dimen.list_home_title_bar_height_min)));
        setBackgroundColor(C13749l.m55755c(getContext(), R.color.bg_body));
        m35225d();
        m35226e();
        m35224c();
        m35227f();
    }

    /* renamed from: e */
    private void m35226e() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        this.f22975e = appCompatImageView;
        appCompatImageView.setId(View.generateViewId());
        this.f22975e.setImageResource(R.drawable.ud_icon_search_outlined);
        C13747j.m55728a((ImageView) this.f22975e, (int) R.color.facade_selector_icon_n1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C13749l.m55738a(24), C13749l.m55738a(24));
        layoutParams.setMarginEnd(C13749l.m55738a(16));
        layoutParams.addRule(21);
        layoutParams.addRule(15);
        addView(this.f22975e, layoutParams);
    }

    /* renamed from: f */
    private void m35227f() {
        TextView textView = new TextView(getContext());
        this.f22976f = textView;
        textView.setTextSize(1, 16.0f);
        this.f22976f.setTextColor(getResources().getColor(R.color.primary_pri_500));
        this.f22976f.setText(getResources().getString(R.string.FeishuDocs_ClickToRead_Button));
        this.f22976f.setVisibility(8);
        this.f22976f.setGravity(17);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(C13749l.m55738a(16));
        layoutParams.addRule(21);
        layoutParams.addRule(15);
        addView(this.f22976f, layoutParams);
    }

    public void setAllReadClickListener(View.OnClickListener onClickListener) {
        TextView textView = this.f22976f;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }

    public void setOnLeftViewClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f22974d;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    public void setSearchViewClickListener(View.OnClickListener onClickListener) {
        AppCompatImageView appCompatImageView = this.f22975e;
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(onClickListener);
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    public void setTitle(String str) {
        BaseTitleBar baseTitleBar = this.f22977g;
        if (baseTitleBar != null) {
            baseTitleBar.setTitle(str);
        }
    }

    public MainTabTitleBar(Context context) {
        super(context);
        mo33220b();
    }

    public void setAllReadVisible(boolean z) {
        int i;
        TextView textView = this.f22976f;
        if (textView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    public void setAvatarVisible(boolean z) {
        int i;
        ImageView imageView = this.f22974d;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public void setSearchVisible(boolean z) {
        int i;
        AppCompatImageView appCompatImageView = this.f22975e;
        if (appCompatImageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            appCompatImageView.setVisibility(i);
        }
    }

    public void setAllReadState(boolean z) {
        TextView textView = this.f22976f;
        if (textView != null) {
            if (z) {
                textView.setText(getResources().getString(R.string.FeishuDocs_MarkAllRead_Button));
                this.f22976f.setTextColor(getResources().getColor(R.color.text_disable));
            } else {
                textView.setTextColor(getResources().getColor(R.color.primary_pri_500));
                this.f22976f.setText(getResources().getString(R.string.FeishuDocs_ClickToRead_Button));
            }
            this.f22976f.setClickable(!z);
        }
    }

    /* renamed from: a */
    public void mo33219a(boolean z) {
        float f;
        if (z != this.f22972b) {
            Animator animator = this.f22971a;
            if (animator != null) {
                animator.cancel();
            }
            this.f22972b = z;
            if (z) {
                setVisibility(0);
            }
            boolean z2 = this.f22972b;
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (z2) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = 1.0f;
            }
            if (z2) {
                f2 = 1.0f;
            }
            ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", f, f2).setDuration(200L);
            this.f22971a = duration;
            duration.start();
            this.f22971a.addListener(new Animator.AnimatorListener() {
                /* class com.bytedance.ee.bear.list.homepage.title.MainTabTitleBar.C84991 */

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationCancel(Animator animator) {
                    MainTabTitleBar.this.f22971a = null;
                }

                public void onAnimationStart(Animator animator) {
                    if (MainTabTitleBar.this.f22972b) {
                        MainTabTitleBar.this.setVisibility(0);
                    }
                }

                public void onAnimationEnd(Animator animator) {
                    if (!MainTabTitleBar.this.f22972b) {
                        MainTabTitleBar.this.setVisibility(8);
                    }
                    MainTabTitleBar.this.f22971a = null;
                }
            });
        }
    }

    public MainTabTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    /* renamed from: a */
    public void mo33176a(int i, int i2) {
        boolean z;
        this.f22973c += (float) i2;
        float f = (float) getLayoutParams().height;
        C13479a.m54772d("MainTabTitleBar", "dy:" + i2 + ", mTotalDy:" + this.f22973c + "height = " + f);
        float f2 = this.f22973c;
        if (f2 > f) {
            this.f22973c = f;
        } else if (f2 < BitmapDescriptorFactory.HUE_RED) {
            this.f22973c = BitmapDescriptorFactory.HUE_RED;
        }
        if ((f - this.f22973c) / f > 0.1f) {
            z = true;
        } else {
            z = false;
        }
        C13479a.m54772d("MainTabTitleBar", "correct mTotalDy:" + this.f22973c + "visible = " + z);
        mo33219a(z);
    }

    public MainTabTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
