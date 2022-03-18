package com.tt.miniapp.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13264d;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ignition.widget.squircle.SquircleImageView;
import com.larksuite.component.universe_design.emptystate.UDEmptyState;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapp.view.lark.dotsloader.LinearDotsLoader;
import com.tt.miniapp.view.swipeback.C67224a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.C67590h;
import com.tt.p3255a.C65678c;
import com.tt.refer.common.util.C67866g;

/* renamed from: com.tt.miniapp.view.a */
public class C67152a extends BaseLaunchLoadingView {

    /* renamed from: a */
    public SquircleImageView f169332a;

    /* renamed from: b */
    public TextView f169333b;

    /* renamed from: c */
    public LinearDotsLoader f169334c;

    /* renamed from: d */
    public Activity f169335d;

    /* renamed from: e */
    public volatile boolean f169336e;

    /* renamed from: f */
    public IAppContext f169337f;

    /* renamed from: g */
    public UDEmptyState f169338g;

    /* renamed from: h */
    public RelativeLayout f169339h = this;

    /* renamed from: i */
    public Context f169340i;

    /* renamed from: j */
    private LinearLayout f169341j;

    @Override // com.tt.miniapp.view.BaseLaunchLoadingView
    /* renamed from: c */
    public void mo49129c() {
        this.f169335d = null;
    }

    /* renamed from: a */
    private void m261782a() {
        setBackgroundResource(R.color.bg_body);
        m261783d();
        m261784e();
        m261785f();
        m261786g();
    }

    @Override // com.tt.miniapp.view.BaseLaunchLoadingView
    /* renamed from: b */
    public void mo49128b() {
        if (!this.f169336e) {
            AppBrandLogger.m52828d("LaunchLoadingView2", "removeLoadingLayout");
            post(new Runnable() {
                /* class com.tt.miniapp.view.C67152a.RunnableC671553 */

                public void run() {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, (float) BitmapDescriptorFactory.HUE_RED);
                    alphaAnimation.setDuration(100);
                    alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
                        /* class com.tt.miniapp.view.C67152a.RunnableC671553.animationAnimation$AnimationListenerC671561 */

                        public void onAnimationRepeat(Animation animation) {
                        }

                        public void onAnimationStart(Animation animation) {
                        }

                        public void onAnimationEnd(Animation animation) {
                            C67152a.this.setVisibility(4);
                            C67152a.this.mo49124a(4, 100);
                            ViewParent parent = C67152a.this.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(C67152a.this);
                            }
                        }
                    });
                    C67152a.this.startAnimation(alphaAnimation);
                }
            });
        }
    }

    /* renamed from: f */
    private void m261785f() {
        TextView textView = new TextView(getContext());
        this.f169333b = textView;
        textView.setId(R.id.microapp_m_launch_loading_app_text);
        this.f169333b.setSingleLine();
        this.f169333b.setEllipsize(TextUtils.TruncateAt.END);
        int a = m261781a(R.dimen.microapp_m_launch_loading_name_padding_horizontal);
        this.f169333b.setPadding(a, 0, a, 0);
        this.f169333b.setIncludeFontPadding(false);
        this.f169333b.setTextColor(this.f169340i.getResources().getColor(R.color.text_title));
        this.f169333b.setTextSize(18.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(3, this.f169332a.getId());
        layoutParams.topMargin = m261781a(R.dimen.microapp_m_launch_loading_name_margin_top);
        layoutParams.addRule(14, -1);
        addView(this.f169333b, layoutParams);
    }

    /* renamed from: g */
    private void m261786g() {
        LinearDotsLoader linearDotsLoader = new LinearDotsLoader(getContext());
        this.f169334c = linearDotsLoader;
        linearDotsLoader.setRadius(m261781a(R.dimen.microapp_m_launch_loading_dot_radius));
        this.f169334c.setDotsDistance(m261781a(R.dimen.microapp_m_launch_loading_dot_dist));
        this.f169334c.setDefaultColor(this.f169340i.getResources().getColor(R.color.ud_N200));
        this.f169334c.setSelectedColor(this.f169340i.getResources().getColor(R.color.ud_N400));
        this.f169334c.setSelRadius(m261781a(R.dimen.microapp_m_launch_loading_dot_selected_radius));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(3, this.f169333b.getId());
        layoutParams.topMargin = m261781a(R.dimen.microapp_m_launch_loading_dot_margin_top);
        layoutParams.addRule(14, -1);
        addView(this.f169334c, layoutParams);
    }

    /* renamed from: d */
    private void m261783d() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f169341j = linearLayout;
        linearLayout.setId(R.id.microapp_m_launch_loading_title);
        this.f169341j.setOrientation(0);
        this.f169341j.setGravity(8388693);
        this.f169341j.setPadding(0, 0, m261781a(R.dimen.microapp_m_capsule_margin_right), m261781a(R.dimen.microapp_m_launch_loading_title_image_margin_bottom));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.ud_icon_more_outlined);
        imageView.setImageTintList(ContextCompat.getColorStateList(this.f169340i, R.color.icon_n1));
        imageView.setImageTintMode(PorterDuff.Mode.SRC_ATOP);
        this.f169341j.addView(imageView, m261781a(R.dimen.microapp_m_launch_loading_title_image_width), m261781a(R.dimen.microapp_m_launch_loading_title_image_height));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setImageResource(R.drawable.ud_icon_close_outlined);
        imageView2.setImageTintList(ContextCompat.getColorStateList(this.f169340i, R.color.icon_n1));
        imageView2.setImageTintMode(PorterDuff.Mode.SRC_ATOP);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m261781a(R.dimen.microapp_m_launch_loading_title_image_width), m261781a(R.dimen.microapp_m_launch_loading_title_image_height));
        layoutParams.leftMargin = m261781a(R.dimen.microapp_m_launch_loading_title_image_margin_left);
        this.f169341j.addView(imageView2, layoutParams);
        imageView2.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.view.C67152a.View$OnClickListenerC671531 */

            public void onClick(View view) {
                C67070z.m261391a(C67152a.this.f169335d, 1, C67152a.this.f169337f);
            }
        });
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, m261781a(R.dimen.microapp_m_launch_loading_title_height));
        layoutParams2.addRule(14, -1);
        addView(this.f169341j, layoutParams2);
    }

    /* renamed from: e */
    private void m261784e() {
        SquircleImageView squircleImageView = new SquircleImageView(getContext());
        this.f169332a = squircleImageView;
        squircleImageView.setId(R.id.microapp_m_launch_loading_icon);
        this.f169332a.setImageResource(R.drawable.microapp_m_app_icon_default);
        this.f169332a.setImageTintList(ContextCompat.getColorStateList(this.f169340i, R.color.ud_N300));
        this.f169332a.setImageTintMode(PorterDuff.Mode.SRC_ATOP);
        this.f169332a.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f169332a.setBorderColor(Color.parseColor("#1A1F2329"));
        this.f169332a.setBorderWidth(C13264d.m54034a(getContext(), 0.8f));
        this.f169332a.setRadius(C13264d.m54034a(getContext(), 12.0f));
        int a = m261781a(R.dimen.microapp_m_launch_loading_icon_size);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a, a);
        layoutParams.addRule(3, this.f169341j.getId());
        layoutParams.topMargin = m261781a(R.dimen.microapp_m_launch_loading_icon_margin_top);
        layoutParams.addRule(14, -1);
        addView(this.f169332a, layoutParams);
    }

    @Override // com.tt.miniapp.view.BaseLaunchLoadingView
    /* renamed from: a */
    public void mo49125a(Activity activity) {
        this.f169335d = activity;
    }

    /* renamed from: a */
    private int m261781a(int i) {
        return getResources().getDimensionPixelSize(i);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C67590h.m263074a(this.f169335d, this.f169341j);
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // com.tt.miniapp.view.BaseLaunchLoadingView
    /* renamed from: a */
    public void mo49126a(final AppInfoEntity appInfoEntity) {
        C67866g.m264027a(new Runnable() {
            /* class com.tt.miniapp.view.C67152a.RunnableC671542 */

            public void run() {
                if (!TextUtils.isEmpty(appInfoEntity.icon)) {
                    HostDependManager.getInst().loadImage(C67152a.this.getContext(), new C65678c(appInfoEntity.icon).mo229924b(R.drawable.microapp_m_app_icon_default).mo229919a(R.drawable.microapp_m_app_icon_default).mo229922a(C67152a.this.f169332a));
                    C67152a.this.f169332a.setImageTintList(ContextCompat.getColorStateList(C67152a.this.f169340i, R.color.fill_img_mask));
                    C67152a.this.f169332a.setImageTintMode(PorterDuff.Mode.SRC_ATOP);
                }
                if (!TextUtils.isEmpty(appInfoEntity.appName)) {
                    C67152a.this.f169333b.setText(appInfoEntity.appName);
                }
            }
        });
    }

    public C67152a(Context context, IAppContext iAppContext) {
        super(context);
        this.f169337f = iAppContext;
        this.f169340i = context;
        m261782a();
    }

    @Override // com.tt.miniapp.view.BaseLaunchLoadingView
    /* renamed from: a */
    public void mo49127a(final String str, boolean z, String str2) {
        post(new Runnable() {
            /* class com.tt.miniapp.view.C67152a.RunnableC671574 */

            public void run() {
                C67152a.this.f169336e = true;
                C67152a.this.f169333b.setVisibility(8);
                C67152a.this.f169334c.setVisibility(8);
                C67152a.this.f169332a.setVisibility(8);
                if (C67152a.this.f169338g == null) {
                    C67152a.this.f169338g = new UDEmptyState(C67152a.this.f169340i);
                }
                C67152a.this.f169338g.setImageRes(2131234581);
                C67152a.this.f169338g.setImageSize(Float.valueOf(C67152a.this.f169340i.getResources().getDimension(R.dimen.microapp_m_menu_indicator_height)));
                C67152a.this.f169338g.setDesc(str);
                C67152a.this.f169338g.setSecondaryText(C67152a.this.getContext().getString(R.string.microapp_m_retry_later));
                C67152a.this.f169338g.setSecondaryClickListener(new View.OnClickListener() {
                    /* class com.tt.miniapp.view.C67152a.RunnableC671574.View$OnClickListenerC671581 */

                    public void onClick(View view) {
                        LarkInnerEventHelper.mpLoadingExit("retry", C67152a.this.f169337f);
                        C67224a.f169674a = "others";
                        C67224a.f169675b = true;
                        C66612a.m260227a(AppbrandApplicationImpl.getInst(C67152a.this.f169337f).getAppInfo().appId, AppbrandApplicationImpl.getInst(C67152a.this.f169337f).getSchema(), false);
                    }
                });
                C67152a.this.f169338g.setContainer(C67152a.this.f169339h);
            }
        });
    }
}
