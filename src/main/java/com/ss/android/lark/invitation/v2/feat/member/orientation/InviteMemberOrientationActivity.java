package com.ss.android.lark.invitation.v2.feat.member.orientation;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.inv.export.util.C40108g;
import com.ss.android.lark.inv.export.util.C40118l;
import com.ss.android.lark.inv.export.util.C40129q;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.member.common.C40341d;
import com.ss.android.lark.invitation.v2.feat.member.common.InviteMemberProcessGuideAbsActivity;
import com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.C40433b;
import com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.C40453b;
import com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.C40459e;
import com.ss.android.lark.invitation.v2.p2051b.C40156a;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57783ah;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3483b.C69625a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69627a;

public class InviteMemberOrientationActivity extends InviteMemberProcessGuideAbsActivity {

    /* renamed from: a */
    public List<C40156a> f102699a;

    /* renamed from: f */
    public ViewPager f102700f;

    /* renamed from: g */
    public int f102701g;

    /* renamed from: h */
    private CommonTitleBar f102702h;

    /* renamed from: i */
    private View f102703i;

    /* renamed from: j */
    private UDTabLayout f102704j;

    /* renamed from: k */
    private FrameLayout f102705k;

    /* renamed from: l */
    private C40453b f102706l;

    /* renamed from: m */
    private C40433b f102707m;

    /* renamed from: n */
    private boolean f102708n;

    /* renamed from: o */
    private boolean f102709o;

    /* renamed from: p */
    private AbstractC69621a f102710p = new AbstractC69621a() {
        /* class com.ss.android.lark.invitation.v2.feat.member.orientation.InviteMemberOrientationActivity.C404251 */

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public int mo16055a() {
            return InviteMemberOrientationActivity.this.f102699a.size();
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69623c mo16056a(Context context) {
            C69625a aVar = new C69625a(context);
            aVar.setColors(Integer.valueOf(UIHelper.getColor(R.color.lkui_B500)));
            aVar.setMode(0);
            aVar.setLineHeight((float) UIHelper.dp2px(2.0f));
            return aVar;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69624d mo16057a(Context context, final int i) {
            C69627a aVar = new C69627a(context);
            aVar.setTextSize(14.0f);
            aVar.setNormalColor(C57582a.m223616d(context, R.color.text_title));
            aVar.setSelectedColor(C57582a.m223616d(context, R.color.primary_pri_500));
            aVar.setText(InviteMemberOrientationActivity.this.f102699a.get(i).f102007b);
            aVar.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.invitation.v2.feat.member.orientation.InviteMemberOrientationActivity.C404251.View$OnClickListenerC404261 */

                public void onClick(View view) {
                    InviteMemberOrientationActivity.this.f102700f.setCurrentItem(i);
                }
            });
            return aVar;
        }
    };

    /* renamed from: a */
    public Context mo146420a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo146421a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m160108a(this, context);
    }

    /* renamed from: b */
    public Resources mo146202b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo146422c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m160102a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo146424d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m160111c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m160103a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m160110b(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        if (getIntent().getStringExtra("from_scenes").equals("invite_member_guide")) {
            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
        }
        return super.getEnterAnimationConfig();
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        if (this.f102709o) {
            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
        }
        return super.getExitAnimationConfig();
    }

    /* renamed from: g */
    private void m160112g() {
        if (this.f102709o) {
            this.f102702h.setTitle(R.string.Lark_Guide_TeamCreate2ViaEmailTitle);
            this.f102702h.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
        } else if (C40147z.m159163c().isInviteMemberAdminEnable()) {
            this.f102702h.setTitle(R.string.Lark_Invitation_AddMembers_SubtitleThree_AddMembersDirectly_EnterPhone);
        } else {
            this.f102702h.setTitle(R.string.Lark_Invitation_AddMembersTitle);
        }
        this.f102702h.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.$$Lambda$InviteMemberOrientationActivity$esc43Vf85SgVXyJ0lqJjqJfYpM */

            public final void onClick(View view) {
                InviteMemberOrientationActivity.this.m160106a((InviteMemberOrientationActivity) view);
            }
        });
        mo146220a(this.f102702h);
    }

    /* renamed from: i */
    private void m160114i() {
        this.f102700f = (ViewPager) findViewById(R.id.imViewPager);
        this.f102704j = (UDTabLayout) findViewById(R.id.imTabLayout);
        this.f102705k = (FrameLayout) findViewById(R.id.imContentFl);
        this.f102702h = (CommonTitleBar) findViewById(R.id.imTitleBar);
        this.f102703i = findViewById(R.id.imShadowView);
    }

    /* renamed from: h */
    private void m160113h() {
        mo146222e();
        List<C40156a> j = m160115j();
        this.f102699a = j;
        if (j.size() <= 1) {
            this.f102703i.setVisibility(8);
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.f102700f.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.InviteMemberOrientationActivity.C404272 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                InviteMemberOrientationActivity.this.f102701g = i;
                InviteMemberOrientationActivity.this.mo146200a();
                C40129q.m159107a(InviteMemberOrientationActivity.this);
            }
        });
        this.f102700f.setAdapter(new FragmentPagerAdapter(supportFragmentManager) {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.InviteMemberOrientationActivity.C404283 */

            @Override // androidx.viewpager.widget.PagerAdapter
            public int getCount() {
                return InviteMemberOrientationActivity.this.f102699a.size();
            }

            @Override // androidx.fragment.app.FragmentPagerAdapter
            public Fragment getItem(int i) {
                return InviteMemberOrientationActivity.this.f102699a.get(i).f102006a;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public CharSequence getPageTitle(int i) {
                return InviteMemberOrientationActivity.this.f102699a.get(i).f102007b;
            }
        });
        if (this.f102699a.size() > 1) {
            this.f102704j.setVisibility(0);
            new UDTabLayoutCoordinator(this.f102704j, this.f102700f).attach();
            this.f102704j.setBackgroundResource(R.color.bg_body);
            return;
        }
        this.f102704j.setVisibility(8);
    }

    /* renamed from: j */
    private List<C40156a> m160115j() {
        ArrayList arrayList = new ArrayList();
        IInvitationModuleDependency a = C40147z.m159160a();
        if (a.isFgEnable("invite.member.email.enable") || this.f102709o) {
            C40433b a2 = C40433b.m160133a(this.f102464b, this.f102465c);
            this.f102707m = a2;
            arrayList.add(new C40156a(a2, UIHelper.getString(R.string.Lark_Invitation_AddMembersViaEmail)));
        }
        if (a.isFgEnable("invite.member.phone.enable") && !this.f102709o) {
            C40453b a3 = C40453b.m160165a(this.f102464b, this.f102465c);
            this.f102706l = a3;
            arrayList.add(new C40156a(a3, UIHelper.getString(R.string.Lark_Invitation_AddMembersViaPhone)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo146200a() {
        C40156a aVar = this.f102699a.get(this.f102701g);
        if (aVar.f102006a instanceof C40453b) {
            InvHitPoint.m160391k(this.f102464b);
        } else if (aVar.f102006a instanceof C40433b) {
            InvHitPoint.m160389j(this.f102464b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m160106a(View view) {
        finish();
        InvHitPoint.m160419y(this.f102464b);
    }

    /* renamed from: a */
    public static Resources m160103a(InviteMemberOrientationActivity inviteMemberOrientationActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteMemberOrientationActivity);
        }
        return inviteMemberOrientationActivity.mo146202b();
    }

    /* renamed from: c */
    public static AssetManager m160111c(InviteMemberOrientationActivity inviteMemberOrientationActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteMemberOrientationActivity);
        }
        return inviteMemberOrientationActivity.mo146424d();
    }

    /* renamed from: b */
    public static void m160110b(InviteMemberOrientationActivity inviteMemberOrientationActivity) {
        inviteMemberOrientationActivity.mo146422c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InviteMemberOrientationActivity inviteMemberOrientationActivity2 = inviteMemberOrientationActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inviteMemberOrientationActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.invitation.v2.feat.member.common.InviteMemberProcessGuideAbsActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.inv_invite_member_activity);
        this.f102708n = getIntent().getBooleanExtra("extra_is_from_channel", false);
        this.f102709o = getIntent().getStringExtra("from_scenes").equals("invite_member_guide");
        C53241h.m205898b("InvitationModule", "onCreate InviteMemberOrientationActivity isFromChannel: " + this.f102708n + ", isFromInviteMemberGuide: " + this.f102709o);
        m160114i();
        m160112g();
        m160113h();
        InvHitPoint.m160354a(this.f102464b);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m160109b(DialogC25637f fVar, int i) {
        finish();
    }

    /* renamed from: a */
    public static Context m160102a(InviteMemberOrientationActivity inviteMemberOrientationActivity, Configuration configuration) {
        Context a = inviteMemberOrientationActivity.mo146420a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m160108a(InviteMemberOrientationActivity inviteMemberOrientationActivity, Context context) {
        inviteMemberOrientationActivity.mo146421a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteMemberOrientationActivity);
        }
    }

    /* renamed from: a */
    public static void m160105a(Context context, String str, Map<String, String> map) {
        m160104a(context, str, "", false, map);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.invitation.v2.feat.member.common.InviteMemberProcessGuideAbsActivity, androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086) {
            if (i2 == -1) {
                C57783ah.m224245a().mo196093a(C40459e.f102761a, ((CountryBean) intent.getSerializableExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)).getCode());
            } else {
                C57783ah.m224245a().mo196091a(C40459e.f102761a);
            }
        } else if (i == 10010 && i2 == -1) {
            InvHitPoint.m160352a(intent, this.f102464b);
            if ("new_guide".equals(this.f102464b) || "upgrade".equals(this.f102464b) || "ug_flow".equals(this.f102464b)) {
                new C40341d(this, false, UIHelper.getString(R.string.Lark_Invitation_AddMembersInLarkSucceedContent), new DialogC25637f.AbstractC25638a() {
                    /* class com.ss.android.lark.invitation.v2.feat.member.orientation.$$Lambda$InviteMemberOrientationActivity$27p3ENWcAzVebLvSVFNxZA8xFg */

                    @Override // com.larksuite.component.ui.dialog.DialogC25637f.AbstractC25638a
                    public final void onClick(DialogC25637f fVar, int i) {
                        InviteMemberOrientationActivity.this.m160109b(fVar, i);
                    }
                }, $$Lambda$InviteMemberOrientationActivity$YKPLwqjc7p8EVSPlXJnWj233Nk.INSTANCE).mo146231a();
            } else {
                LKUIToast.show(this, (int) R.string.Lark_Invitation_AddMembersSucceedTitle);
            }
        }
    }

    /* renamed from: a */
    public static void m160104a(Context context, String str, String str2, boolean z, Map<String, String> map) {
        HashMap a = C40108g.m159014a(Pair.create("from_scenes", str), Pair.create("extra_is_from_channel", Boolean.toString(z)), Pair.create("departments", str2));
        if ("new_guide".equals(str) || "upgrade".equals(str) || "ug_flow".equals(str)) {
            C40118l.m159075a(context, "//client/invite/member", a, 255);
        } else {
            C40118l.m159074a(context, "//client/invite/member", a);
        }
    }
}
