package com.tt.miniapp.titlemenu;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.menu.AbstractC13135b;
import com.bytedance.ee.larkbrand.menu.C13141f;
import com.bytedance.ee.larkbrand.menu.WorkplaceConfigData;
import com.bytedance.ee.larkbrand.menu.WorkplaceConfigResponse;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.larksuite.component.ignition.widget.squircle.SquircleImageView;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.multitask.MultitaskHelper;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.p3335u.p3336a.C66996c;
import com.tt.miniapp.titlemenu.Indicator.C66892a;
import com.tt.miniapp.titlemenu.Indicator.MagicIndicator;
import com.tt.miniapp.titlemenu.item.C66914a;
import com.tt.miniapp.titlemenu.item.C66917b;
import com.tt.miniapp.titlemenu.item.C66919c;
import com.tt.miniapp.titlemenu.item.C66935d;
import com.tt.miniapp.titlemenu.item.C66938f;
import com.tt.miniapp.titlemenu.item.C66940g;
import com.tt.miniapp.titlemenu.item.C66942h;
import com.tt.miniapp.titlemenu.item.C66944i;
import com.tt.miniapp.titlemenu.item.C66946j;
import com.tt.miniapp.titlemenu.item.C66948k;
import com.tt.miniapp.titlemenu.item.C66951l;
import com.tt.miniapp.titlemenu.item.C66953m;
import com.tt.miniapp.titlemenu.item.C66955n;
import com.tt.miniapp.titlemenu.item.C66957o;
import com.tt.miniapp.titlemenu.item.C66959p;
import com.tt.miniapp.titlemenu.item.IMenuItem;
import com.tt.miniapp.titlemenu.p3332a.C66899a;
import com.tt.miniapp.titlemenu.p3332a.C66901c;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.entity.C67533i;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.util.C67590h;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.p3255a.C65678c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.miniapp.titlemenu.d */
public class DialogC66908d extends Dialog {

    /* renamed from: a */
    public IAppContext f168769a;

    /* renamed from: b */
    public C66959p f168770b;

    /* renamed from: c */
    private Activity f168771c;

    /* renamed from: d */
    private boolean f168772d = false;

    /* renamed from: e */
    private C66951l f168773e;

    /* renamed from: f */
    private MultitaskHelper f168774f;

    /* renamed from: g */
    private final List<Class> f168775g = new ArrayList();

    /* renamed from: h */
    private final List<IMenuItem> f168776h = new ArrayList();

    /* renamed from: a */
    public boolean mo232930a() {
        Activity activity = this.f168771c;
        return activity != null && !activity.isFinishing();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo232929a(Activity activity) {
        this.f168776h.clear();
        this.f168776h.add(new C66953m(activity, this.f168769a));
        this.f168776h.add(new C66919c(activity, this.f168769a));
        this.f168776h.add(new C66955n(activity, this.f168769a));
        this.f168776h.add(new C66946j(activity, this.f168769a));
        this.f168776h.add(new C66951l(activity, this.f168769a));
        this.f168776h.add(new C66935d(activity, this.f168769a));
        this.f168776h.add(new C66957o(activity, this.f168769a));
        this.f168776h.add(new C66948k(activity, this.f168769a));
        this.f168776h.add(new C66942h(activity, this.f168769a));
        this.f168776h.add(new C66940g(activity, this.f168769a));
        C66959p pVar = new C66959p(activity, this.f168769a);
        this.f168770b = pVar;
        this.f168776h.add(pVar);
        if (!C25529d.m91166g(this.f168769a)) {
            C66938f fVar = new C66938f(activity, this.f168769a, this.f168774f);
            fVar.mo232962a(new C66938f.AbstractC66939a() {
                /* class com.tt.miniapp.titlemenu.DialogC66908d.C669091 */

                @Override // com.tt.miniapp.titlemenu.item.C66938f.AbstractC66939a
                /* renamed from: a */
                public void mo232935a() {
                    DialogC66908d.this.dismiss();
                }
            });
            this.f168776h.add(fVar);
            this.f168776h.add(new C66944i(activity, this.f168769a));
        }
        this.f168776h.add(new C66917b(activity, this.f168769a));
        this.f168776h.add(new C66914a(activity, this.f168769a));
    }

    /* renamed from: a */
    private void m260932a(C66901c cVar, int i) {
        int i2;
        Context context = getContext();
        if (getWindow() != null) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            if (context.getResources().getConfiguration().orientation == 1) {
                i2 = C67043j.m261275b(context);
            } else {
                i2 = context.getResources().getDimensionPixelSize(R.dimen.microapp_m_more_menu_land_width);
            }
            attributes.width = i2;
            attributes.height = context.getResources().getDimensionPixelSize(R.dimen.microapp_m_more_menu_double_line_height);
            if (!cVar.mo232925a()) {
                attributes.height = context.getResources().getDimensionPixelSize(R.dimen.microapp_m_more_menu_single_line_height);
            } else if (cVar.getCount() > 1) {
                attributes.height += context.getResources().getDimensionPixelSize(R.dimen.microapp_m_menu_indicator_height);
            } else if (cVar.mo232925a() && cVar.getCount() <= 1) {
                attributes.height = context.getResources().getDimensionPixelSize(R.dimen.microapp_m_more_menu_double_line_no_indicator_height);
            }
            attributes.height += i;
            getWindow().setAttributes(attributes);
        }
    }

    /* renamed from: a */
    private void m260931a(SquircleImageView squircleImageView) {
        try {
            float dimension = getContext().getResources().getDimension(R.dimen.microapp_m_menu_title_icon_angle);
            float dimension2 = getContext().getResources().getDimension(R.dimen.microapp_m_menu_title_icon_stroke_width);
            int color = getContext().getResources().getColor(R.color.microapp_m_menu_title_icon_stroke_color);
            squircleImageView.setRadius((int) dimension);
            squircleImageView.setBorderWidth((int) dimension2);
            squircleImageView.setBorderColor(color);
            squircleImageView.setImageTintList(ContextCompat.getColorStateList(this.f168771c, R.color.fill_img_mask));
            squircleImageView.setImageTintMode(PorterDuff.Mode.SRC_ATOP);
            HostDependManager.getInst().loadImage(getContext(), new C65678c(Uri.parse(AppbrandApplicationImpl.getInst(this.f168769a).getAppInfo().icon)).mo229919a(R.drawable.microapp_m_app_icon_default).mo229924b(R.drawable.microapp_m_app_icon_default).mo229922a(squircleImageView));
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("MenuDialog", "loadAppIcon", e);
        }
    }

    /* renamed from: b */
    public void mo232931b() {
        this.f168771c = null;
        this.f168769a = null;
        this.f168773e = null;
    }

    /* renamed from: h */
    private void m260942h() {
        AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(this.f168769a).getAppInfo();
        if (appInfo != null) {
            final AbstractC13135b bVar = (AbstractC13135b) this.f168769a.findServiceByInterface(AbstractC13135b.class);
            bVar.mo49186a(appInfo.appId, new C13141f.AbstractC13143a() {
                /* class com.tt.miniapp.titlemenu.DialogC66908d.C669124 */

                @Override // com.bytedance.ee.larkbrand.menu.C13141f.AbstractC13143a
                /* renamed from: a */
                public void mo49198a(ErrorResult errorResult, C13141f.C13144b bVar) {
                    new C67500a("mp_containerActions_onFavoriteLoad", C67501b.f170254v, DialogC66908d.this.f168769a).addCategoryValue("action_error_type", "network_error").flush();
                }

                @Override // com.bytedance.ee.larkbrand.menu.C13141f.AbstractC13143a
                /* renamed from: a */
                public void mo49197a(SendHttpResponse sendHttpResponse, C13141f.C13144b bVar) {
                    boolean z;
                    try {
                        WorkplaceConfigResponse workplaceConfigResponse = (WorkplaceConfigResponse) new Gson().fromJson(sendHttpResponse.json_body, WorkplaceConfigResponse.class);
                        if (workplaceConfigResponse != null && workplaceConfigResponse.getCode() == 0) {
                            if (workplaceConfigResponse.getData() != null) {
                                WorkplaceConfigData data = workplaceConfigResponse.getData();
                                bVar.mo49187a(data.isUserCommon);
                                C66959p pVar = DialogC66908d.this.f168770b;
                                if (!data.isUserCommon) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                pVar.mo232977b(z);
                                return;
                            }
                        }
                        new C67500a("mp_containerActions_onFavoriteLoad", C67501b.f170254v, DialogC66908d.this.f168769a).addCategoryValue("action_error_type", "data_error").flush();
                    } catch (JsonSyntaxException e) {
                        AppBrandLogger.m52829e("MenuDialog", e);
                    }
                }
            });
        }
    }

    public void dismiss() {
        boolean z;
        Activity activity = this.f168771c;
        if (activity == null || activity.isFinishing()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            for (IMenuItem iMenuItem : HostDependManager.getInst().replacesMenuItems(new ArrayList(this.f168776h), this.f168769a)) {
                if (iMenuItem != null) {
                    iMenuItem.mo232941e();
                }
            }
            this.f168772d = false;
            super.dismiss();
        }
    }

    /* renamed from: e */
    private void m260939e() {
        Window window = getWindow();
        if (window != null) {
            if (TextUtils.equals(C67043j.m261271a().toLowerCase(), "huawei") && AppbrandContext.getInst().isGame()) {
                window.setFlags(1024, 1024);
                window.getDecorView().setSystemUiVisibility(2822);
            }
            window.setGravity(80);
            window.setWindowAnimations(R.style.microapp_i_BottomDialogAnimation);
            window.getDecorView().setSystemUiVisibility(2304);
        }
    }

    /* renamed from: g */
    private boolean m260941g() {
        String str;
        AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(this.f168769a);
        AppInfoEntity appInfo = inst.getAppInfo();
        if (appInfo != null && appInfo.shareLevel == 3) {
            return false;
        }
        if (appInfo == null || !appInfo.isGame()) {
            str = inst.getCurrentPage();
        } else {
            str = appInfo.appId;
        }
        AppBrandLogger.m52828d("MenuDialog", "currentPage ", str);
        ArrayMap<String, Boolean> currentPageHideShareMenuArrayMap = inst.getCurrentPageHideShareMenuArrayMap();
        if (!currentPageHideShareMenuArrayMap.containsKey(str) || !currentPageHideShareMenuArrayMap.get(str).booleanValue()) {
            return true;
        }
        AppBrandLogger.m52830i("MenuDialog", "not show share menu");
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo232932c() {
        this.f168775g.add(C66914a.class);
        this.f168775g.add(C66917b.class);
        this.f168775g.add(C66919c.class);
        this.f168775g.add(C66935d.class);
        this.f168775g.add(C66940g.class);
        this.f168775g.add(C66942h.class);
        this.f168775g.add(C66946j.class);
        this.f168775g.add(C66948k.class);
        this.f168775g.add(C66951l.class);
        this.f168775g.add(C66953m.class);
        this.f168775g.add(C66955n.class);
        this.f168775g.add(C66957o.class);
    }

    public void show() {
        if (mo232930a()) {
            m260936b(getContext());
            m260938d();
            m260942h();
            for (IMenuItem iMenuItem : HostDependManager.getInst().replacesMenuItems(new ArrayList(this.f168776h), this.f168769a)) {
                if (iMenuItem != null) {
                    iMenuItem.mo232939c();
                }
            }
            super.show();
            new C67500a("openplatform_mp_container_menu_view", this.f168769a).reportPlatform(4).flush();
        }
    }

    /* renamed from: d */
    private void m260938d() {
        Context context = getContext();
        List<C66899a> f = m260940f();
        int a = (int) C67590h.m263065a(context, 48.0f);
        int a2 = (int) C67590h.m263065a(context, 48.0f);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        int generateViewId = View.generateViewId();
        int generateViewId2 = View.generateViewId();
        int generateViewId3 = View.generateViewId();
        int generateViewId4 = View.generateViewId();
        relativeLayout.addView(m260925a(context, a, generateViewId3));
        relativeLayout.addView(m260927a(context, a, generateViewId, generateViewId3));
        if (C66996c.m261114a(this.f168769a).mo233037c() != null) {
            C66996c.m261114a(this.f168769a).mo233035a(relativeLayout, generateViewId3, generateViewId);
        }
        relativeLayout.addView(m260935b(context, generateViewId2, generateViewId));
        C66901c cVar = new C66901c(context, f);
        ViewPager a3 = m260928a(context, cVar, generateViewId4, generateViewId2);
        a3.setAdapter(cVar);
        relativeLayout.addView(a3);
        MagicIndicator a4 = m260929a(context, a2, a3);
        if (cVar.getCount() > 1) {
            a4.setVisibility(0);
        } else {
            a4.setVisibility(8);
        }
        relativeLayout.addView(a4);
        relativeLayout.addView(m260934b(context, a2));
        relativeLayout.addView(m260926a(context, a2));
        relativeLayout.setBackground(m260924a(context));
        setContentView(relativeLayout);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        m260939e();
        m260932a(cVar, 0);
    }

    /* renamed from: f */
    private List<C66899a> m260940f() {
        ArrayList<C66899a> arrayList = new ArrayList();
        for (IMenuItem iMenuItem : HostDependManager.getInst().replacesMenuItems(new ArrayList(this.f168776h), this.f168769a)) {
            boolean a = m260933a(iMenuItem);
            if (m260937b(iMenuItem)) {
                a &= m260941g();
            }
            if (iMenuItem instanceof C66917b) {
                a = this.f168772d;
            }
            if (a) {
                if (this.f168775g.contains(iMenuItem.getClass())) {
                    iMenuItem.mo49184b().setReportHostCustomClickEvent(false);
                }
                arrayList.add(iMenuItem.mo49184b());
                if (iMenuItem instanceof C66951l) {
                    this.f168773e = (C66951l) iMenuItem;
                }
            }
        }
        for (C66899a aVar : arrayList) {
            if (aVar.getParent() != null) {
                ((ViewGroup) aVar.getParent()).removeView(aVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public DialogC66908d mo232928a(boolean z) {
        this.f168772d = z;
        return this;
    }

    /* renamed from: a */
    public static synchronized DialogC66908d m260930a(IAppContext iAppContext) {
        DialogC66908d B;
        synchronized (DialogC66908d.class) {
            B = C67485a.m262488a(iAppContext).mo234272B();
        }
        return B;
    }

    /* renamed from: b */
    private static void m260936b(Context context) {
        DebugUtil.updateDebugState(context, null);
        if (DebugUtil.debug()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    /* renamed from: a */
    private boolean m260933a(IMenuItem iMenuItem) {
        if (iMenuItem.mo49184b() == null || iMenuItem.mo49184b().getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m260937b(IMenuItem iMenuItem) {
        if (iMenuItem.mo232940d() == null || iMenuItem.mo232940d() != IMenuItem.ItemCategory.SHARE) {
            return false;
        }
        return true;
    }

    public DialogC66908d(IAppContext iAppContext) {
        super(iAppContext.getCurrentActivity(), R.style.microapp_i_titlemenudialog);
        this.f168769a = iAppContext;
        this.f168771c = iAppContext.getCurrentActivity();
        this.f168774f = C67485a.m262488a(iAppContext).mo234283d();
        mo232932c();
        mo232929a(this.f168771c);
    }

    /* renamed from: a */
    private GradientDrawable m260924a(Context context) {
        int a = (int) C67590h.m263065a(context, C67533i.m262676a().mo234528h());
        if (context.getResources().getConfiguration().orientation == 1) {
            a = (int) C67590h.m263065a(context, C67533i.m262676a().mo234529i());
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f = (float) a;
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(ContextCompat.getColor(context, R.color.bg_float_base));
        return gradientDrawable;
    }

    /* renamed from: b */
    private View m260934b(Context context, int i) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, 1);
        View view = new View(context);
        layoutParams.addRule(12);
        layoutParams.bottomMargin = i;
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(context.getResources().getColor(R.color.line_divider_default));
        return view;
    }

    /* renamed from: a */
    private TextView m260926a(Context context, int i) {
        TextView textView = new TextView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, i);
        layoutParams.addRule(12);
        textView.setLayoutParams(layoutParams);
        textView.setBackgroundColor(getContext().getResources().getColor(R.color.bg_float_base));
        textView.setTextColor(getContext().getResources().getColor(R.color.text_title));
        textView.setTextSize(16.0f);
        textView.setText(context.getString(R.string.microapp_m_more_menu_cancel));
        textView.setGravity(17);
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.titlemenu.DialogC66908d.View$OnClickListenerC669113 */

            public void onClick(View view) {
                DialogC66908d.this.dismiss();
            }
        });
        return textView;
    }

    /* renamed from: b */
    private View m260935b(Context context, int i, int i2) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, 1);
        View view = new View(context);
        view.setId(i);
        layoutParams.addRule(3, i2);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(context.getResources().getColor(R.color.line_divider_default));
        return view;
    }

    /* renamed from: a */
    private RelativeLayout m260925a(Context context, int i, int i2) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(getContext().getResources().getColor(R.color.bg_float_base));
        relativeLayout.setId(i2);
        SquircleImageView squircleImageView = new SquircleImageView(context);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.microapp_m_menu_title_drawable_size);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dimensionPixelOffset, i);
        relativeLayout.setLayoutParams(layoutParams);
        layoutParams.setMargins(context.getResources().getDimensionPixelOffset(R.dimen.microapp_m_menu_title_icon_marginLeft), 0, 0, 0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dimensionPixelOffset, dimensionPixelOffset);
        layoutParams2.addRule(15, -1);
        squircleImageView.setLayoutParams(layoutParams2);
        m260931a(squircleImageView);
        relativeLayout.addView(squircleImageView);
        return relativeLayout;
    }

    /* renamed from: a */
    private MagicIndicator m260929a(Context context, int i, ViewPager viewPager) {
        int i2;
        C66892a aVar = new C66892a(context);
        aVar.setSelectedColor(ContextCompat.getColor(context, R.color.primary_pri_500));
        aVar.setUnselectedColor(ContextCompat.getColor(context, R.color.icon_disable));
        if (viewPager.getAdapter() == null) {
            i2 = 0;
        } else {
            i2 = viewPager.getAdapter().getCount();
        }
        aVar.setCircleCount(i2);
        final MagicIndicator magicIndicator = new MagicIndicator(context);
        magicIndicator.setNavigator(aVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        layoutParams.bottomMargin = (int) (((float) i) + C67590h.m263065a(context, 14.0f));
        magicIndicator.setLayoutParams(layoutParams);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.tt.miniapp.titlemenu.DialogC66908d.C669102 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                magicIndicator.mo232885b(i);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                magicIndicator.mo232883a(i);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                magicIndicator.mo232884a(i, f, i2);
            }
        });
        return magicIndicator;
    }

    /* renamed from: a */
    private ViewPager m260928a(Context context, C66901c cVar, int i, int i2) {
        ViewPager viewPager = new ViewPager(context);
        viewPager.setId(i);
        viewPager.setOverScrollMode(2);
        viewPager.setAdapter(cVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.addRule(3, i2);
        viewPager.setLayoutParams(layoutParams);
        viewPager.setBackgroundColor(context.getResources().getColor(R.color.bg_float_base));
        return viewPager;
    }

    /* renamed from: a */
    private TextView m260927a(Context context, int i, int i2, int i3) {
        TextView textView = new TextView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, i);
        layoutParams.addRule(10);
        layoutParams.addRule(15, -1);
        layoutParams.addRule(1, i3);
        layoutParams.setMargins(context.getResources().getDimensionPixelOffset(R.dimen.microapp_m_menu_title_name_marginLeft), 0, context.getResources().getDimensionPixelOffset(R.dimen.microapp_m_menu_title_name_marginRight), 0);
        textView.setId(i2);
        textView.setLayoutParams(layoutParams);
        textView.setBackgroundColor(getContext().getResources().getColor(R.color.bg_float_base));
        textView.setTextColor(getContext().getResources().getColor(R.color.text_title));
        textView.setTextSize(16.0f);
        textView.setGravity(16);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(AppbrandApplicationImpl.getInst(this.f168769a).getAppInfo().appName);
        return textView;
    }
}
