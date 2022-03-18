package com.ss.android.lark.guide.landing.general.mvp;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.guide.C38548a;
import com.ss.android.lark.guide.landing.general.mvp.C38639c;
import com.ss.android.lark.guide.landing.general.ui.GuidePageTransApi;
import com.ss.android.lark.guide.landing.general.view.ColorAnimationView;
import com.ss.android.lark.guide.landing.general.view.GuidePageIndicatorView;
import com.ss.android.lark.guide.landing.general.view.GuidePageItemView;
import com.ss.android.lark.guide.landing.general.view.GuideViewPager;
import com.ss.android.lark.guide.landing.general.view.ViewPagerAutoScrollController;
import com.ss.android.lark.guide.statistics.OnboardingHitPointNew;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.AbstractC49360d;
import com.ss.android.lark.passport.signinsdk_api.ISigninSdkApi;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.ug.attribution.C57347a;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class GuidePageView implements C38639c.AbstractC38641b {

    /* renamed from: a */
    public List<GuidePageItemView.C38647a> f99304a = new LinkedList();

    /* renamed from: b */
    public int f99305b = 0;

    /* renamed from: c */
    public int f99306c = 1;
    TextView createTeamBtn;

    /* renamed from: d */
    public Context f99307d;

    /* renamed from: e */
    public C38633b f99308e;

    /* renamed from: f */
    private AbstractC38634c f99309f;

    /* renamed from: g */
    private C38639c.AbstractC38641b.AbstractC38642a f99310g;

    /* renamed from: h */
    private ViewPagerAutoScrollController f99311h;
    TextView joinMeeting;
    ColorAnimationView mColorAnimationView;
    GuidePageIndicatorView mIndicatorView;
    Button startLoginBtn;
    GuideViewPager viewPager;

    /* renamed from: com.ss.android.lark.guide.landing.general.mvp.GuidePageView$c */
    public interface AbstractC38634c {
        /* renamed from: a */
        Lifecycle mo141530a();

        /* renamed from: a */
        void mo141531a(C38639c.AbstractC38641b bVar);

        /* renamed from: a */
        void mo141532a(String str, JSONObject jSONObject);
    }

    /* renamed from: b */
    private void m152463b() {
        this.joinMeeting.setVisibility(8);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f99309f = null;
        this.f99310g = null;
        this.f99307d = null;
        this.f99308e = null;
        this.f99311h.mo141567d();
        this.f99311h = null;
        GuidePageTransApi.m152498a().mo141545a(null);
    }

    /* renamed from: com.ss.android.lark.guide.landing.general.mvp.GuidePageView$b */
    public class C38633b extends PagerAdapter {

        /* renamed from: a */
        List<GuidePageItemView> f99314a = new ArrayList();

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return Integer.MAX_VALUE;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* renamed from: a */
        private void m152471a() {
            for (int i = 0; i < GuidePageView.this.f99304a.size(); i++) {
                GuidePageItemView guidePageItemView = new GuidePageItemView(GuidePageView.this.f99307d);
                guidePageItemView.setData(GuidePageView.this.f99304a.get(i));
                this.f99314a.add(guidePageItemView);
            }
        }

        /* renamed from: b */
        public int mo141529b(int i) {
            return i % GuidePageView.this.f99305b;
        }

        C38633b() {
            GuidePageView.this = r1;
            m152471a();
        }

        /* renamed from: a */
        public View mo141528a(int i) {
            int b = mo141529b(i);
            if (this.f99314a.size() == 0) {
                m152471a();
            }
            if (b >= 0 && b <= this.f99314a.size() - 1) {
                return this.f99314a.get(b);
            }
            Log.m165383e("GuidePageView", "getItem error " + b + " count= " + getCount());
            return null;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            GuidePageItemView guidePageItemView = this.f99314a.get(mo141529b(i));
            viewGroup.addView(guidePageItemView);
            return guidePageItemView;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        AbstractC38634c cVar = this.f99309f;
        if (cVar != null) {
            cVar.mo141531a(this);
        }
        this.f99308e = new C38633b();
        m152461a();
        ViewPagerAutoScrollController aVar = new ViewPagerAutoScrollController();
        this.f99311h = aVar;
        aVar.mo141563a(this.viewPager, this.f99309f.mo141530a());
        AbstractC38634c cVar2 = this.f99309f;
        if (cVar2 != null) {
            cVar2.mo141532a("enter_guide_page", new JSONObject());
        }
        OnboardingHitPointNew.m152608a();
    }

    /* renamed from: a */
    private void m152461a() {
        if (DesktopUtil.m144301a(this.f99307d)) {
            this.startLoginBtn.getLayoutParams().width = C57582a.m223600a((int) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL);
            this.createTeamBtn.getLayoutParams().width = C57582a.m223600a((int) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL);
        }
        mo141525a("guide_carousel_view", this.f99306c);
        m152463b();
        this.f99305b = this.f99304a.size();
        this.viewPager.setAdapter(this.f99308e);
        this.viewPager.addOnPageChangeListener(new C38632a());
        String string = this.f99307d.getResources().getString(R.string.Lark_Passport_Newsignup_SignUpTeamButton);
        if (!TextUtils.isEmpty(string)) {
            this.createTeamBtn.setText(UIHelper.mustacheFormat(string, "BrandName", mo141522a(this.f99307d)));
        }
        this.createTeamBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.guide.landing.general.mvp.$$Lambda$GuidePageView$zb_spbPDlhRHwHtUnt3NXK5eHAs */

            public final void onClick(View view) {
                GuidePageView.lambda$zb_spbPDlhRHwHtUnt3NXK5eHAs(GuidePageView.this, view);
            }
        });
        this.startLoginBtn.setText(R.string.Lark_UserGrowth_guide_carousel_login);
        this.startLoginBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.guide.landing.general.mvp.$$Lambda$GuidePageView$Ag7N13CZsmFFWjOSg_3oK1VlYg */

            public final void onClick(View view) {
                GuidePageView.m270567lambda$Ag7N13CZsmFFWjOSg_3oK1VlYg(GuidePageView.this, view);
            }
        });
        GuidePageTransApi.m152498a().mo141545a(new GuidePageTransApi.AbstractC38645a() {
            /* class com.ss.android.lark.guide.landing.general.mvp.GuidePageView.C386311 */

            @Override // com.ss.android.lark.guide.landing.general.ui.GuidePageTransApi.AbstractC38645a
            /* renamed from: a */
            public boolean mo141527a(int i, boolean z) {
                Log.m165389i("GuidePageView", "setCurrentItem, position=" + i + ", count=" + GuidePageView.this.viewPager.getChildCount() + ", mPageCount=" + GuidePageView.this.f99305b);
                if (i < 0 || i > GuidePageView.this.f99305b - 1) {
                    return false;
                }
                GuidePageView.this.viewPager.setCurrentItem(i, z);
                return true;
            }
        });
        String d = C57347a.m222308a().mo194496d("launch_guide_key");
        Log.m165389i("GuidePageView", "try to load default guide key;key=" + d);
        if (!TextUtils.isEmpty(d)) {
            GuidePageTransApi.m152498a().mo141546a(d, false);
        }
    }

    /* renamed from: a */
    public void setViewDelegate(C38639c.AbstractC38641b.AbstractC38642a aVar) {
        this.f99310g = aVar;
    }

    /* renamed from: com.ss.android.lark.guide.landing.general.mvp.GuidePageView$a */
    public class C38632a implements ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        public C38632a() {
            GuidePageView.this = r1;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            GuidePageView.this.f99306c = i + 1;
            GuidePageView guidePageView = GuidePageView.this;
            guidePageView.mo141525a("guide_carousel_view", guidePageView.f99306c);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            GuidePageView.this.mo141523a(i, f);
            GuidePageView.this.mIndicatorView.setProportion((((float) GuidePageView.this.f99308e.mo141529b(i)) + f) / ((float) (GuidePageView.this.f99305b - 1)));
        }
    }

    @Override // com.ss.android.lark.guide.landing.general.mvp.C38639c.AbstractC38641b
    /* renamed from: a */
    public void mo141526a(List<GuidePageItemView.C38647a> list) {
        this.f99304a = list;
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m152464b(View view) {
        C38639c.AbstractC38641b.AbstractC38642a aVar = this.f99310g;
        if (aVar != null) {
            aVar.mo141535a();
        }
        OnboardingHitPointNew.m152609a(false);
        mo141525a("guide_carousel_create_team", this.f99306c);
        C57744a.m224104a().putBoolean("sp_key_guide_page_clicked", true);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m152462a(View view) {
        OnboardingHitPointNew.m152609a(true);
        AbstractC38634c cVar = this.f99309f;
        if (cVar != null) {
            cVar.mo141532a("login_guide_page", new JSONObject());
        }
        C38639c.AbstractC38641b.AbstractC38642a aVar = this.f99310g;
        if (aVar != null) {
            aVar.mo141536b();
        }
        mo141525a("guide_carousel_sign_in", this.f99306c);
        C57744a.m224104a().putBoolean("sp_key_guide_page_clicked", true);
    }

    /* renamed from: a */
    public synchronized String mo141522a(Context context) {
        try {
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
    }

    public GuidePageView(Context context, AbstractC38634c cVar) {
        this.f99309f = cVar;
        this.f99307d = context;
    }

    /* renamed from: a */
    public void mo141523a(int i, float f) {
        GuidePageItemView guidePageItemView = (GuidePageItemView) this.f99308e.mo141528a(i);
        if (guidePageItemView != null) {
            guidePageItemView.setPagerScrollOffset(f);
        }
        int i2 = i + 1;
        if (i2 < this.f99308e.getCount()) {
            ((GuidePageItemView) this.f99308e.mo141528a(i2)).setPagerScrollOffset(f - 1.0f);
        }
    }

    /* renamed from: a */
    public void mo141525a(String str, int i) {
        AbstractC49360d dVar;
        try {
            if (this.f99309f != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("slide_number", i);
                this.f99309f.mo141532a(str, jSONObject);
            }
            ISigninSdkApi b = C38548a.m152027a().mo141260j().mo141275b();
            if (b != null) {
                dVar = b.getLog();
            } else {
                dVar = null;
            }
            if (dVar != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("index", Integer.valueOf(i));
                Statistics.sendEvent("show_launch_page", new JSONObject(hashMap));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
