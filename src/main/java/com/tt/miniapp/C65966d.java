package com.tt.miniapp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.larksuite.suite.R;
import com.tt.frontendapiinterface.IActivityLife;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.C66546p;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.jsbridge.C66236a;
import com.tt.miniapp.launchschedule.LaunchScheduler;
import com.tt.miniapp.p3294i.C66203a;
import com.tt.miniapp.p3299l.C66284a;
import com.tt.miniapp.p3335u.p3336a.C66996c;
import com.tt.miniapp.titlemenu.AbstractC66907c;
import com.tt.miniapp.titlemenu.C66898a;
import com.tt.miniapp.titlemenu.DialogC66908d;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapp.view.TitleBarProgressView;
import com.tt.miniapp.view.swipeback.C67224a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.entity.C67527g;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67434b;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.util.C67588f;
import com.tt.miniapphost.util.C67590h;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.option.p3390k.AbstractC67648c;
import com.tt.refer.common.util.C67866g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.d */
public class C65966d implements AbstractC66202i {

    /* renamed from: g */
    public static final AbstractC66202i f166500g = new AbstractC66202i() {
        /* class com.tt.miniapp.C65966d.C659682 */

        @Override // com.tt.miniapp.AbstractC66202i
        /* renamed from: b */
        public boolean mo230941b() {
            return false;
        }

        @Override // com.tt.miniapp.AbstractC66202i
        /* renamed from: k */
        public void mo230950k() {
            throw new IllegalStateException("disable to do this action when Fragment not render");
        }

        @Override // com.tt.miniapp.AbstractC66202i
        /* renamed from: b */
        public void mo230940b(boolean z, IAppContext iAppContext) {
            C65966d.m258372a(z, iAppContext);
        }
    };

    /* renamed from: A */
    private C65977a f166501A;

    /* renamed from: a */
    public Context f166502a;

    /* renamed from: b */
    public View f166503b;

    /* renamed from: c */
    public LinearLayout f166504c;

    /* renamed from: d */
    public View f166505d;

    /* renamed from: e */
    public ImageView f166506e;

    /* renamed from: f */
    public IAppContext f166507f;

    /* renamed from: h */
    private View f166508h;

    /* renamed from: i */
    private ImageView f166509i;

    /* renamed from: j */
    private TextView f166510j;

    /* renamed from: k */
    private String f166511k;

    /* renamed from: l */
    private ImageView f166512l;

    /* renamed from: m */
    private int f166513m;

    /* renamed from: n */
    private String f166514n;

    /* renamed from: o */
    private ImageView f166515o;

    /* renamed from: p */
    private boolean f166516p;

    /* renamed from: q */
    private String f166517q = "white";

    /* renamed from: r */
    private int f166518r;

    /* renamed from: s */
    private String f166519s;

    /* renamed from: t */
    private String f166520t;

    /* renamed from: u */
    private String f166521u;

    /* renamed from: v */
    private String f166522v;

    /* renamed from: w */
    private String f166523w;

    /* renamed from: x */
    private ImageView f166524x;

    /* renamed from: y */
    private LinearLayout f166525y;

    /* renamed from: z */
    private TitleBarProgressView f166526z;

    /* renamed from: com.tt.miniapp.d$a */
    public static class C65977a {

        /* renamed from: a */
        public boolean f166539a = true;

        /* renamed from: b */
        public ArrayList<WeakReference<C65966d>> f166540b = new ArrayList<>();
    }

    /* renamed from: a */
    public String mo230929a() {
        return this.f166517q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo230935a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f166519s = jSONObject.optString("navigationStyle");
            this.f166520t = jSONObject.optString("navigationBarTitleText");
            this.f166521u = jSONObject.optString("navigationBarTextStyle");
            this.f166522v = jSONObject.optString("navigationBarBackgroundColor");
            this.f166523w = jSONObject.optString("transparentTitle");
        }
    }

    /* renamed from: a */
    public void mo230936a(boolean z) {
        if (!this.f166516p) {
            if (z) {
                this.f166526z.mo233503a(TextUtils.equals(this.f166517q, "black"));
                return;
            }
            this.f166526z.mo233507c();
        }
    }

    /* renamed from: a */
    public boolean mo230937a(AppInfoEntity appInfoEntity, AppConfig appConfig) {
        boolean z;
        String str;
        boolean z2;
        if (appInfoEntity == null || appConfig == null) {
            return false;
        }
        AbstractC67434b a = ((AbstractC67433a) this.f166507f).mo234156a();
        if (a instanceof C66546p) {
            C66546p pVar = (C66546p) a;
            str = pVar.mo231014g();
            z = pVar.mo232131t();
            z2 = pVar.mo232130s();
            AppBrandLogger.m52828d("tma_AppbrandTitleBar", "getCurrentPage ", str, " isRelaunch ", Boolean.valueOf(z), " UIUtils.isViewVisible(mPageCloseFl) ", Boolean.valueOf(C67590h.m263085b(this.f166509i)));
        } else {
            str = "";
            z2 = false;
            z = true;
        }
        if ((appConfig.f165499f || TextUtils.isEmpty(appInfoEntity.startPage) || TextUtils.equals(AppConfig.m257578b(str), appConfig.f165497d) || TextUtils.equals(AppConfig.m257578b(appInfoEntity.startPage), appConfig.f165497d)) && (!TextUtils.isEmpty(appInfoEntity.startPage) || !z || z2 || appConfig.f165499f || this.f166516p || C67590h.m263085b(this.f166509i) || TextUtils.equals(AppConfig.m257578b(str), appConfig.f165497d))) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void mo230946g() {
        m258375d(this.f166517q);
    }

    /* renamed from: d */
    public void mo230943d() {
        if (!this.f166516p) {
            this.f166525y.setVisibility(8);
        }
    }

    /* renamed from: e */
    public void mo230944e() {
        if (!this.f166516p) {
            this.f166525y.setVisibility(0);
        }
    }

    /* renamed from: f */
    public void mo230945f() {
        C66284a.m259352a(mo230951l(), new Runnable() {
            /* class com.tt.miniapp.C65966d.RunnableC659758 */

            public void run() {
                ((LaunchScheduler) AppbrandApplicationImpl.getInst(C65966d.this.f166507f).getService(LaunchScheduler.class)).onClose(C65966d.this.mo230951l().getWindow().getDecorView(), C67588f.m263060a(C65966d.this.mo230951l()) + C65966d.this.mo230948i());
                C67070z.m261391a(C65966d.this.mo230951l(), 2, C65966d.this.f166507f);
            }
        }, this.f166507f);
    }

    /* renamed from: h */
    public boolean mo230947h() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public int mo230948i() {
        if (this.f166516p) {
            return 0;
        }
        return this.f166505d.getMeasuredHeight();
    }

    @Override // com.tt.miniapp.AbstractC66202i
    /* renamed from: k */
    public void mo230950k() {
        C67866g.m264027a(new Runnable() {
            /* class com.tt.miniapp.C65966d.AnonymousClass10 */

            public void run() {
                View findViewById = C65966d.this.f166503b.findViewById(R.id.microapp_m_titlebar_capsule_more);
                if (findViewById != null) {
                    findViewById.performClick();
                    return;
                }
                DebugUtil.logOrThrow("tma_AppbrandTitleBar", "capsuleMoreButton is null");
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public FragmentActivity mo230951l() {
        return (FragmentActivity) this.f166507f.getCurrentActivity();
    }

    /* renamed from: n */
    private String m258382n() {
        AppConfig.C65688c cVar;
        AppConfig.Window window;
        AppConfig appConfig = AppbrandApplicationImpl.getInst(this.f166507f).getAppConfig();
        if (appConfig == null || (cVar = appConfig.f165494a) == null || (window = cVar.f165528a) == null || !window.hasNavigationBarTitleText) {
            return null;
        }
        return window.navigationBarTitleText;
    }

    @Override // com.tt.miniapp.AbstractC66202i
    /* renamed from: b */
    public boolean mo230941b() {
        if (((ViewStub) this.f166503b.findViewById(R.id.microapp_m_viewstub_title_custom)) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void mo230949j() {
        ArrayList<WeakReference<C65966d>> arrayList = this.f166501A.f166540b;
        Iterator<WeakReference<C65966d>> it = arrayList.iterator();
        while (it.hasNext()) {
            WeakReference<C65966d> next = it.next();
            if (next.get() == this) {
                arrayList.remove(next);
                return;
            }
        }
    }

    /* renamed from: m */
    private void m258381m() {
        if (!this.f166516p && this.f166525y.getVisibility() == 0) {
            this.f166524x.setImageDrawable(mo230951l().getResources().getDrawable(R.drawable.ud_icon_home_outlined));
            if (TextUtils.equals(this.f166517q, "black")) {
                this.f166524x.setColorFilter(45282144);
            } else {
                this.f166524x.setColorFilter(-1);
            }
        }
    }

    /* renamed from: c */
    public boolean mo230942c() {
        List<C66546p.C66557b> B;
        int size;
        C66546p.C66557b bVar;
        AppConfig appConfig = AppbrandApplicationImpl.getInst(this.f166507f).getAppConfig();
        if (appConfig == null) {
            return false;
        }
        IActivityLife activityLife = C67432a.m262319a(this.f166507f).getActivityLife();
        if ((activityLife instanceof C66546p) && !this.f166516p && (B = ((C66546p) activityLife).mo232110B()) != null && (size = B.size()) == 1 && (bVar = B.get(size - 1)) != null && !bVar.f168058c && !TextUtils.equals(appConfig.f165497d, AppConfig.m257578b(bVar.f168056a))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C65977a m258371a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234280a().f170179f;
    }

    /* renamed from: g */
    private String m258378g(String str) {
        str.hashCode();
        String str2 = "always";
        if (!str.equals(str2)) {
            str2 = "auto";
            if (!str.equals(str2)) {
                return "none";
            }
        }
        return str2;
    }

    /* renamed from: e */
    private String m258376e(String str) {
        AppConfig.Window window;
        AppConfig.Window a;
        if (!TextUtils.isEmpty(this.f166522v)) {
            return this.f166522v;
        }
        AppConfig appConfig = AppbrandApplicationImpl.getInst(this.f166507f).getAppConfig();
        if (appConfig == null) {
            return "#000000";
        }
        AppConfig.C65690e eVar = appConfig.f165495b;
        if (eVar != null && (a = eVar.mo230061a(str)) != null && a.hasNavigationBarBackgroundColor) {
            return a.navigationBarBackgroundColor;
        }
        AppConfig.C65688c cVar = appConfig.f165494a;
        if (cVar == null || (window = cVar.f165528a) == null || !window.hasNavigationBarBackgroundColor) {
            return "#000000";
        }
        return window.navigationBarBackgroundColor;
    }

    /* renamed from: i */
    private String m258380i(String str) {
        AppConfig.C65690e eVar;
        AppConfig.Window a;
        if (!TextUtils.isEmpty(this.f166520t)) {
            return this.f166520t;
        }
        AppConfig appConfig = AppbrandApplicationImpl.getInst(this.f166507f).getAppConfig();
        if (appConfig == null || (eVar = appConfig.f165495b) == null || (a = eVar.mo230061a(str)) == null || !a.hasNavigationBarTitleText) {
            return null;
        }
        return a.navigationBarTitleText;
    }

    /* renamed from: b */
    public String mo230938b(String str) {
        AppConfig.Window window;
        AppConfig.Window a;
        if (!TextUtils.isEmpty(this.f166519s)) {
            return this.f166519s;
        }
        AppConfig appConfig = AppbrandApplicationImpl.getInst(this.f166507f).getAppConfig();
        if (appConfig == null) {
            return "default";
        }
        if (appConfig.f165495b != null && (a = appConfig.f165495b.mo230061a(str)) != null && a.hasNavigationStyle) {
            return a.navigationStyle;
        }
        AppConfig.C65688c cVar = appConfig.f165494a;
        if (cVar == null || (window = cVar.f165528a) == null || !window.hasNavigationStyle) {
            return "default";
        }
        return window.navigationStyle;
    }

    /* renamed from: f */
    private String m258377f(String str) {
        AppConfig.Window window;
        AppConfig.Window a;
        if (!TextUtils.isEmpty(this.f166523w)) {
            return this.f166523w;
        }
        AppConfig appConfig = AppbrandApplicationImpl.getInst(this.f166507f).getAppConfig();
        if (appConfig == null) {
            return "none";
        }
        if (appConfig.f165495b != null && (a = appConfig.f165495b.mo230061a(str)) != null && a.hasTransparentTitle) {
            return m258378g(a.transparentTitle);
        }
        AppConfig.C65688c cVar = appConfig.f165494a;
        if (cVar == null || (window = cVar.f165528a) == null || !window.hasTransparentTitle) {
            return "none";
        }
        return m258378g(window.transparentTitle);
    }

    /* renamed from: h */
    private String m258379h(String str) {
        AppConfig.Window window;
        AppConfig.Window a;
        AppConfig appConfig = AppbrandApplicationImpl.getInst(this.f166507f).getAppConfig();
        if (appConfig == null) {
            return "white";
        }
        AppConfig.C65690e eVar = appConfig.f165495b;
        if (eVar == null || (a = eVar.mo230061a(str)) == null || !a.hasNavigationBarTextStyle) {
            AppConfig.C65688c cVar = appConfig.f165494a;
            if (cVar == null || (window = cVar.f165528a) == null || TextUtils.isEmpty(window.navigationBarTextStyle)) {
                return "white";
            }
            AppBrandLogger.m52828d("tma_AppbrandTitleBar", "getNavigationBarTextStyle2 ", window.navigationBarTextStyle);
            return window.navigationBarTextStyle;
        }
        AppBrandLogger.m52828d("tma_AppbrandTitleBar", "getNavigationBarTextStyle ", a.navigationBarTextStyle);
        return a.navigationBarTextStyle;
    }

    /* renamed from: a */
    public void mo230930a(int i) {
        if (!this.f166516p && TextUtils.equals(this.f166523w, "auto") && mo230948i() > 0) {
            AppBrandLogger.m52828d("tma_AppbrandTitleBar", Integer.valueOf(i));
            int i2 = mo230948i() * 2;
            if (i < i2) {
                this.f166518r = (i * 255) / i2;
            } else {
                this.f166518r = 255;
            }
            if (i < i2 / 2) {
                m258375d(this.f166517q);
            } else if (TextUtils.equals(this.f166517q, "black")) {
                m258375d("white");
            } else {
                m258375d("black");
            }
            this.f166505d.getBackground().setAlpha(this.f166518r);
        }
    }

    /* renamed from: b */
    public void mo230939b(boolean z) {
        if (!this.f166516p) {
            IActivityLife activityLife = C67432a.m262319a(this.f166507f).getActivityLife();
            int i = 0;
            if (activityLife == null || activityLife.getCurrentPageSize() == 1) {
                ImageView imageView = this.f166509i;
                if (!z) {
                    i = 8;
                }
                imageView.setVisibility(i);
                return;
            }
            this.f166509i.setVisibility(0);
        }
    }

    /* renamed from: c */
    private void m258374c(String str) {
        String str2;
        this.f166514n = str;
        String i = m258380i(str);
        String n = m258382n();
        if (i != null) {
            this.f166511k = i;
            this.f166510j.setText(i);
        } else if (n != null) {
            this.f166510j.setText(n);
        } else {
            this.f166510j.setText("");
        }
        if (TextUtils.isEmpty(this.f166521u)) {
            str2 = m258379h(str);
        } else {
            str2 = this.f166521u;
        }
        this.f166517q = str2;
        AppBrandLogger.m52828d("tma_AppbrandTitleBar", "getNavigationBarTitleText ", this.f166510j.getText());
        try {
            this.f166513m = C67590h.m263068a(m258376e(str));
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_AppbrandTitleBar", "解析颜色字符串失败", e);
            this.f166513m = ContextCompat.getColor(this.f166502a, R.color.microapp_m_black);
        }
        this.f166505d.setBackgroundColor(this.f166513m);
        IActivityLife activityLife = C67432a.m262319a(this.f166507f).getActivityLife();
        if (activityLife != null && activityLife.getCurrentPageSize() <= 1) {
            this.f166509i.setVisibility(8);
        }
        if (mo230942c()) {
            this.f166525y.setVisibility(0);
        }
        if (this.f166516p) {
            this.f166509i.setVisibility(8);
            this.f166510j.setVisibility(8);
            this.f166505d.setBackgroundColor(Color.parseColor("#00000000"));
        } else if (!TextUtils.equals(this.f166523w, "none")) {
            this.f166505d.getBackground().setAlpha(this.f166518r);
        }
    }

    /* renamed from: d */
    private void m258375d(String str) {
        Drawable drawable;
        Integer num;
        Drawable drawable2;
        Integer num2;
        int i;
        int i2;
        String str2;
        boolean equals = TextUtils.equals(str, "black");
        C67527g a = C67527g.m262641a();
        if (equals) {
            a.mo234491e();
        } else {
            a.mo234488b();
        }
        if (equals) {
            drawable = a.mo234492f();
        } else {
            drawable = a.mo234489c();
        }
        if (equals) {
            num = a.mo234496j();
        } else {
            num = a.mo234495i();
        }
        if (equals) {
            drawable2 = a.mo234493g();
        } else {
            drawable2 = a.mo234490d();
        }
        if (equals) {
            num2 = a.mo234496j();
        } else {
            num2 = a.mo234495i();
        }
        Drawable drawable3 = ContextCompat.getDrawable(this.f166502a, R.drawable.ud_icon_more_outlined);
        int i3 = 45282144;
        if (equals) {
            i = 45282144;
        } else {
            i = -1;
        }
        Drawable drawable4 = ContextCompat.getDrawable(this.f166502a, R.drawable.ud_icon_close_outlined);
        if (equals) {
            i2 = 45282144;
        } else {
            i2 = -1;
        }
        TextView textView = this.f166510j;
        if (equals) {
            str2 = "#000000";
        } else {
            str2 = "#ffffff";
        }
        textView.setTextColor(Color.parseColor(str2));
        ImageView imageView = this.f166509i;
        if (!equals) {
            i3 = -1;
        }
        imageView.setColorFilter(i3);
        this.f166508h.setVisibility(0);
        if (drawable == null) {
            drawable = drawable3;
        }
        if (num != null) {
            i = num.intValue();
        }
        this.f166515o.setImageDrawable(drawable);
        this.f166515o.setColorFilter(i);
        if (drawable2 == null) {
            drawable2 = drawable4;
        }
        if (num2 != null) {
            i2 = num2.intValue();
        }
        this.f166512l.setImageDrawable(drawable2);
        this.f166512l.setColorFilter(i2);
        if (mo230947h()) {
            C66205j.m259188a(mo230951l().getWindow(), equals);
        }
        m258381m();
        if (!this.f166526z.mo233506b()) {
            return;
        }
        if (!this.f166526z.mo233504a() || !equals) {
            this.f166526z.mo233505b(equals);
        }
    }

    /* renamed from: a */
    public void mo230931a(String str) {
        this.f166511k = str;
        if (!C67590h.m263085b(this.f166510j)) {
            C67590h.m263079a(this.f166510j, 0);
        }
        this.f166510j.setText(str);
    }

    @Override // com.tt.miniapp.AbstractC66202i
    /* renamed from: b */
    public void mo230940b(boolean z, IAppContext iAppContext) {
        m258372a(z, iAppContext);
    }

    /* renamed from: a */
    public static void m258372a(final boolean z, final IAppContext iAppContext) {
        C67866g.m264027a(new Runnable() {
            /* class com.tt.miniapp.C65966d.RunnableC659769 */

            public void run() {
                Iterator<WeakReference<C65966d>> it = C65966d.m258371a(iAppContext).f166540b.iterator();
                while (it.hasNext()) {
                    C65966d dVar = it.next().get();
                    if (dVar != null) {
                        LinearLayout linearLayout = dVar.f166504c;
                        int i = 0;
                        if (linearLayout != null) {
                            if (!z) {
                                i = 4;
                            }
                            linearLayout.setVisibility(i);
                            linearLayout.requestLayout();
                        } else {
                            DebugUtil.logOrThrow("tma_AppbrandTitleBar", "appbrandTitleBar.mTitlebarCapsule is null");
                        }
                    }
                }
                C65966d.m258371a(iAppContext).f166539a = z;
            }
        });
    }

    /* renamed from: a */
    public static boolean m258373a(String str, IAppContext iAppContext) {
        boolean z;
        AppConfig.Window a;
        AppConfig appConfig = AppbrandApplicationImpl.getInst(iAppContext).getAppConfig();
        if (appConfig != null) {
            AppConfig.C65690e eVar = appConfig.f165495b;
            if (eVar != null && (a = eVar.mo230061a(str)) != null && a.hasDisableScroll) {
                return a.disableScroll;
            }
            if (appConfig.f165494a == null || appConfig.f165494a.f165528a == null) {
                z = false;
            } else {
                z = true;
            }
            if (z && appConfig.f165494a.f165528a.hasDisableScroll) {
                return appConfig.f165494a.f165528a.disableScroll;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo230932a(String str, final Runnable runnable) {
        if (TextUtils.equals(mo230938b(str), "custom")) {
            this.f166516p = true;
        }
        String f = m258377f(str);
        this.f166523w = f;
        int i = 0;
        if (this.f166516p) {
            this.f166505d = ((ViewStub) this.f166503b.findViewById(R.id.microapp_m_viewstub_title_custom)).inflate();
        } else if (!TextUtils.equals(f, "none")) {
            this.f166505d = ((ViewStub) this.f166503b.findViewById(R.id.microapp_m_viewstub_title_custom)).inflate();
            this.f166518r = 0;
        } else {
            this.f166505d = ((ViewStub) this.f166503b.findViewById(R.id.microapp_m_viewstub_title_normal)).inflate();
            this.f166518r = 255;
        }
        this.f166506e = (ImageView) this.f166503b.findViewById(R.id.microapp_m_titlebar_red_dot);
        boolean featureGating = LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.gadget.multi_task.open");
        if (!LarkExtensionManager.getInstance().getExtension().mo49599e("ecosystem_gadget_mutitask_badge") || !featureGating) {
            this.f166506e.setVisibility(8);
        } else {
            this.f166506e.setVisibility(0);
        }
        C66898a.m260906a(this.f166507f).mo232911a(new AbstractC66907c() {
            /* class com.tt.miniapp.C65966d.C659671 */

            @Override // com.tt.miniapp.titlemenu.AbstractC66907c
            /* renamed from: a */
            public void mo230952a(boolean z) {
                if (z) {
                    C65966d.this.f166506e.setVisibility(0);
                } else {
                    C65966d.this.f166506e.setVisibility(8);
                }
            }
        });
        C67590h.m263075a(this.f166502a, this.f166505d, runnable);
        this.f166505d.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
            /* class com.tt.miniapp.C65966d.View$OnApplyWindowInsetsListenerC659693 */

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C67590h.m263075a(C65966d.this.f166502a, C65966d.this.f166505d, runnable);
                return view.onApplyWindowInsets(windowInsets);
            }
        });
        ImageView imageView = (ImageView) this.f166505d.findViewById(R.id.microapp_m_page_close);
        this.f166509i = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.C65966d.View$OnClickListenerC659704 */

            public void onClick(View view) {
                IActivityLife activityLife = C67432a.m262319a(C65966d.this.f166507f).getActivityLife();
                if (activityLife != null) {
                    activityLife.goback();
                }
            }
        });
        this.f166510j = (TextView) this.f166505d.findViewById(R.id.microapp_m_page_title);
        this.f166504c = (LinearLayout) this.f166505d.findViewById(R.id.microapp_m_titlebar_capsule);
        this.f166512l = (ImageView) this.f166505d.findViewById(R.id.microapp_m_titlebar_capsule_back);
        this.f166508h = this.f166505d.findViewById(R.id.microapp_m_titlebar_capsule_divider);
        this.f166524x = (ImageView) this.f166505d.findViewById(R.id.microapp_m_titlebar_home);
        this.f166525y = (LinearLayout) this.f166505d.findViewById(R.id.microapp_m_titlebar_home_container);
        TitleBarProgressView titleBarProgressView = (TitleBarProgressView) this.f166505d.findViewById(R.id.microapp_m_titlebar_loading);
        this.f166526z = titleBarProgressView;
        titleBarProgressView.mo233502a(this.f166510j);
        this.f166512l.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.C65966d.View$OnClickListenerC659715 */

            public void onClick(View view) {
                AppConfig appConfig = AppbrandApplicationImpl.getInst(C65966d.this.f166507f).getAppConfig();
                if (appConfig != null) {
                    appConfig.f165499f = false;
                }
                AppbrandApplicationImpl.getInst(C65966d.this.f166507f).setStopReason("click_close_btn");
                C67224a.f169674a = "btn";
                C67224a.f169675b = false;
                new C67500a(C67501b.aG, C65966d.this.f166507f).tracing(AppbrandContext.getInst().getTraceId()).reportPlatform(6).flush();
                if (C66236a.m259226b(C65966d.this.f166507f)) {
                    C66203a.m259184a(C65966d.this.f166507f).mo231544a(false, new Runnable() {
                        /* class com.tt.miniapp.C65966d.View$OnClickListenerC659715.RunnableC659721 */

                        public void run() {
                            C65966d.this.mo230945f();
                        }
                    });
                } else {
                    C65966d.this.mo230945f();
                }
            }
        });
        this.f166515o = (ImageView) this.f166505d.findViewById(R.id.microapp_m_titlebar_capsule_more);
        List<AbstractC67648c> titleMenuItems = AppbrandContext.getInst().getTitleMenuItems();
        if (titleMenuItems != null && titleMenuItems.size() > 0) {
            this.f166515o.setVisibility(0);
        }
        this.f166515o.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.C65966d.View$OnClickListenerC659736 */

            public void onClick(View view) {
                AppInfoEntity appInfo = C67432a.m262319a(C65966d.this.f166507f).getAppInfo();
                DialogC66908d.m260930a(C65966d.this.f166507f).mo232928a(C65966d.this.mo230937a(appInfo, AppbrandApplicationImpl.getInst(C65966d.this.f166507f).getAppConfig())).show();
                if (appInfo != null) {
                    C66020b.m258530a("mp_more_btn_click", C65966d.this.f166507f).mo231092a();
                }
            }
        });
        AppBrandLogger.m52828d("tma_AppbrandTitleBar", "initView ");
        m258374c(str);
        C66996c.m261114a(this.f166507f).mo233034a(this.f166515o);
        LinearLayout linearLayout = this.f166504c;
        if (linearLayout != null) {
            if (!this.f166501A.f166539a) {
                i = 4;
            }
            linearLayout.setVisibility(i);
        }
        this.f166524x.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.C65966d.View$OnClickListenerC659747 */

            public void onClick(View view) {
                AppConfig appConfig;
                C66020b.m258530a("mp_home_btn_click", C65966d.this.f166507f).mo231092a();
                AbstractC67434b a = ((AbstractC67433a) C65966d.this.f166507f).mo234156a();
                AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(C65966d.this.f166507f);
                if ((a instanceof C66546p) && inst != null && (appConfig = inst.getAppConfig()) != null && !TextUtils.isEmpty(appConfig.f165497d) && !TextUtils.isEmpty(appConfig.f165497d)) {
                    String decode = Uri.decode(appConfig.f165497d);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("url", decode);
                        ((C66546p) a).mo232120b(jSONObject.toString(), true);
                    } catch (Exception e) {
                        AppBrandLogger.m52829e("tma_AppbrandTitleBar", "onNewIntent", e);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo230933a(String str, String str2) {
        if (TextUtils.equals(str, "#000000")) {
            this.f166517q = "black";
        } else if (TextUtils.equals(str, "#ffffff")) {
            this.f166517q = "white";
        }
        if (!this.f166516p) {
            int a = C67590h.m263069a(str2, "#000000");
            this.f166513m = a;
            this.f166505d.setBackgroundColor(a);
            this.f166505d.getBackground().setAlpha(this.f166518r);
        }
        mo230946g();
    }

    /* renamed from: a */
    public void mo230934a(String str, boolean z) {
        if (this.f166516p) {
            AppBrandLogger.m52828d("tma_AppbrandTitleBar", "custom title bar, h5 title invalid");
        } else if (this.f166511k == null || z) {
            if (!C67590h.m263085b(this.f166510j)) {
                C67590h.m263079a(this.f166510j, 0);
            }
            this.f166510j.setText(str);
        } else {
            AppBrandLogger.m52828d("tma_AppbrandTitleBar", "page has title, h5 title invalid");
            this.f166510j.setText(this.f166511k);
        }
    }

    public C65966d(Context context, View view, IAppContext iAppContext) {
        this.f166503b = view;
        this.f166502a = context;
        this.f166507f = iAppContext;
        C65977a a = m258371a(iAppContext);
        this.f166501A = a;
        a.f166540b.add(new WeakReference<>(this));
    }
}
