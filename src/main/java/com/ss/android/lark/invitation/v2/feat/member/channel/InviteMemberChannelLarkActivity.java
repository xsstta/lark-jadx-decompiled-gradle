package com.ss.android.lark.invitation.v2.feat.member.channel;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.internal.DebouncingOnClickListener;
import com.bytedance.lark.pb.onboarding.v1.Element;
import com.bytedance.lark.pb.onboarding.v1.GetDynamicFlowStepResponse;
import com.bytedance.lark.pb.onboarding.v1.Slot;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.inv.export.util.C40120n;
import com.ss.android.lark.inv.export.util.C40125p;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.inv.export.util.InvAppreciableUtils;
import com.ss.android.lark.inv.export.util.InvErrorView;
import com.ss.android.lark.invitation.v2.feat.member.bean.MemberInvitationInfo;
import com.ss.android.lark.invitation.v2.feat.member.channel.common.LarkChannelItem;
import com.ss.android.lark.invitation.v2.feat.member.channel.p2059a.C40327a;
import com.ss.android.lark.invitation.v2.feat.member.common.C40338c;
import com.ss.android.lark.invitation.v2.feat.member.common.C40341d;
import com.ss.android.lark.invitation.v2.feat.member.common.InviteMemberProcessGuideAbsActivity;
import com.ss.android.lark.invitation.v2.feat.member.contact.C40351a;
import com.ss.android.lark.invitation.v2.feat.member.contact.InviteMemberContactActivity;
import com.ss.android.lark.invitation.v2.feat.member.nonDirectional.InviteMemberNonDirectionalActivity;
import com.ss.android.lark.invitation.v2.feat.member.orientation.InviteMemberOrientationActivity;
import com.ss.android.lark.invitation.v2.feat.member.teamCode.InviteMemberTeamCodeActivity;
import com.ss.android.lark.invitation.v2.p2052c.C40157a;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.thirdshare.lark.p2746a.p2748b.C55761a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.widget.recyclerview.p2964a.C58973b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class InviteMemberChannelLarkActivity extends InviteMemberProcessGuideAbsActivity {

    /* renamed from: a */
    private CommonTitleBar f102443a;

    /* renamed from: f */
    private RecyclerView f102444f;

    /* renamed from: g */
    private LinearLayout f102445g;

    /* renamed from: h */
    private LinearLayout f102446h;

    /* renamed from: i */
    private LinearLayout f102447i;

    /* renamed from: j */
    private InvErrorView f102448j;

    /* renamed from: k */
    private ViewUtils.C57757c f102449k;

    /* renamed from: l */
    private ViewUtils.C57751a f102450l;

    /* renamed from: a */
    public Context mo146211a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo146200a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo146212a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m159844a(this, context);
    }

    /* renamed from: b */
    public void mo146202b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo146213c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m159836a(this, configuration);
    }

    public AssetManager getAssets() {
        return m159851c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m159837a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isSlideEnable() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m159850b(this);
    }

    /* renamed from: g */
    private void m159858g() {
        C40120n.m159082a("client/invite/member/channelLark", new ApiUtils.AbstractC57748a() {
            /* class com.ss.android.lark.invitation.v2.feat.member.channel.$$Lambda$InviteMemberChannelLarkActivity$4hYf5THelZgCCHxMYERGB9M7iZU */

            @Override // com.ss.android.lark.utils.ApiUtils.AbstractC57748a
            public final void consume(Object obj) {
                InviteMemberChannelLarkActivity.this.m159839a((InviteMemberChannelLarkActivity) ((GetDynamicFlowStepResponse) obj));
            }
        });
    }

    /* renamed from: h */
    private void m159860h() {
        this.f102449k.mo196042e();
        this.f102448j.mo145638a();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.inv.export.ui.InvBaseFragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        C40351a.m159930a(C40147z.m159160a().isLarkEnv());
    }

    /* renamed from: j */
    private void m159862j() {
        ViewUtils.C57757c d = ViewUtils.m224155d(this);
        this.f102449k = d;
        d.mo196036a(new DialogInterface.OnCancelListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.channel.InviteMemberChannelLarkActivity.DialogInterface$OnCancelListenerC403263 */

            public void onCancel(DialogInterface dialogInterface) {
                InviteMemberChannelLarkActivity.this.finish();
            }
        });
        this.f102449k.mo196039b();
    }

    /* renamed from: d */
    private void m159854d() {
        this.f102443a.setTitle(UIHelper.getString(R.string.Lark_Invitation_InviteTeamMembers_TitleBar));
        this.f102443a.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.channel.$$Lambda$InviteMemberChannelLarkActivity$QiGroYo7h52emNFn515dVDrAqw */

            public final void onClick(View view) {
                InviteMemberChannelLarkActivity.this.m159859g(view);
            }
        });
        mo146220a(this.f102443a);
        this.f102447i.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.channel.$$Lambda$InviteMemberChannelLarkActivity$hQkf557ATv17WV7bjcIR7VehNY0 */

            public final void onClick(View view) {
                InviteMemberChannelLarkActivity.this.m159857f(view);
            }
        });
        this.f102446h.setOnClickListener(new DebouncingOnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.channel.InviteMemberChannelLarkActivity.C403241 */

            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View view) {
                InviteMemberChannelLarkActivity inviteMemberChannelLarkActivity = InviteMemberChannelLarkActivity.this;
                InviteMemberNonDirectionalActivity.m160023a(inviteMemberChannelLarkActivity, inviteMemberChannelLarkActivity.f102464b, "qr_code", InviteMemberChannelLarkActivity.this.f102465c);
                InvHitPoint.m160387i(InviteMemberChannelLarkActivity.this.f102464b);
            }
        });
        this.f102448j.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.channel.$$Lambda$InviteMemberChannelLarkActivity$fWhxe868VbhJKC4JxNM6P1faE20 */

            public final void onClick(View view) {
                InviteMemberChannelLarkActivity.this.m159856e(view);
            }
        });
    }

    /* renamed from: i */
    private void m159861i() {
        InvHitPoint.m160333L(this.f102464b);
        if (this.f102450l == null) {
            this.f102450l = ViewUtils.m224154c(this);
        }
        C40338c.m159892a().mo146227a(this.f102465c, C55761a.m215988a(), this.f102450l, new IGetDataCallback<MemberInvitationInfo>() {
            /* class com.ss.android.lark.invitation.v2.feat.member.channel.InviteMemberChannelLarkActivity.C403252 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(MemberInvitationInfo memberInvitationInfo) {
                C40157a.m159182a(InviteMemberChannelLarkActivity.this, UIHelper.getString(R.string.Lark_Invitation_InviteMemberQuickEntry_MoreInvitationWay_InviteInLark), memberInvitationInfo.getLinkMsg());
            }
        });
    }

    /* renamed from: k */
    private void m159863k() {
        this.f102443a = (CommonTitleBar) findViewById(R.id.imclTitleBar);
        this.f102444f = (RecyclerView) findViewById(R.id.imclRv);
        this.f102445g = (LinearLayout) findViewById(R.id.imclBottomLl);
        this.f102446h = (LinearLayout) findViewById(R.id.imclShareQrCodeLl);
        this.f102447i = (LinearLayout) findViewById(R.id.imclShareTeamCodeLl);
        this.f102448j = (InvErrorView) findViewById(R.id.imclErrorView);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m159838a(View view) {
        m159861i();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ void m159859g(View view) {
        finish();
    }

    /* renamed from: c */
    private List<C40327a> m159852c(GetDynamicFlowStepResponse getDynamicFlowStepResponse) {
        ArrayList arrayList = new ArrayList();
        m159841a(getDynamicFlowStepResponse, arrayList);
        m159848b(getDynamicFlowStepResponse, arrayList);
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m159855d(View view) {
        InviteMemberNonDirectionalActivity.m160023a(this, this.f102464b, "link", this.f102465c);
        InvHitPoint.m160385h(this.f102464b);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m159856e(View view) {
        this.f102449k.mo196039b();
        this.f102448j.mo145640b();
        m159858g();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private /* synthetic */ void m159857f(View view) {
        InviteMemberTeamCodeActivity.m160192a(this, this.f102464b, "");
        InvHitPoint.m160332K(this.f102464b);
    }

    /* renamed from: a */
    public static Resources m159837a(InviteMemberChannelLarkActivity inviteMemberChannelLarkActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteMemberChannelLarkActivity);
        }
        return inviteMemberChannelLarkActivity.mo146200a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m159846b(View view) {
        InviteMemberOrientationActivity.m160104a(this, this.f102464b, this.f102465c, true, Collections.emptyMap());
        InvHitPoint.m160326E(this.f102464b);
    }

    /* renamed from: c */
    public static AssetManager m159851c(InviteMemberChannelLarkActivity inviteMemberChannelLarkActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteMemberChannelLarkActivity);
        }
        return inviteMemberChannelLarkActivity.mo146213c();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.invitation.v2.feat.member.common.InviteMemberProcessGuideAbsActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        setContentView(R.layout.inv_invite_member_channel_lark_activity);
        m159863k();
        m159862j();
        m159854d();
        m159858g();
    }

    /* renamed from: b */
    private void m159847b(GetDynamicFlowStepResponse getDynamicFlowStepResponse) {
        this.f102449k.mo196042e();
        mo146222e();
        this.f102445g.setVisibility(0);
        C58973b bVar = new C58973b();
        bVar.mo200080a(m159852c(getDynamicFlowStepResponse));
        this.f102444f.setAdapter(bVar);
        this.f102444f.setLayoutManager(new LinearLayoutManager(this));
        InvHitPoint.m160322B(this.f102464b);
        InvAppreciableUtils.f101934a.mo145659b(false);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m159853c(View view) {
        InviteMemberContactActivity.m159903a(this, C40147z.m159160a().isLarkEnv(), this.f102464b, this.f102465c, "add_member_channel");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m159839a(GetDynamicFlowStepResponse getDynamicFlowStepResponse) {
        if (getDynamicFlowStepResponse == null) {
            m159860h();
            return;
        }
        Element a = C40120n.m159077a(getDynamicFlowStepResponse, "header_cover", Element.ElementType.PICTURE);
        if (a == null) {
            m159847b(getDynamicFlowStepResponse);
        } else {
            C40125p.m159090a(this, a.picture_element_data.image_data, new ApiUtils.AbstractC57748a(getDynamicFlowStepResponse) {
                /* class com.ss.android.lark.invitation.v2.feat.member.channel.$$Lambda$InviteMemberChannelLarkActivity$8yG6Mzg02nM8ah7YegsITHjBjcM */
                public final /* synthetic */ GetDynamicFlowStepResponse f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.utils.ApiUtils.AbstractC57748a
                public final void consume(Object obj) {
                    InviteMemberChannelLarkActivity.this.m159840a((InviteMemberChannelLarkActivity) this.f$1, (GetDynamicFlowStepResponse) ((Boolean) obj));
                }
            });
        }
    }

    /* renamed from: b */
    public static void m159850b(InviteMemberChannelLarkActivity inviteMemberChannelLarkActivity) {
        inviteMemberChannelLarkActivity.mo146202b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InviteMemberChannelLarkActivity inviteMemberChannelLarkActivity2 = inviteMemberChannelLarkActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inviteMemberChannelLarkActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m159849b(DialogC25637f fVar, int i) {
        finish();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m159840a(GetDynamicFlowStepResponse getDynamicFlowStepResponse, Boolean bool) {
        if (bool.booleanValue()) {
            m159847b(getDynamicFlowStepResponse);
        } else {
            m159860h();
        }
    }

    /* renamed from: a */
    public static Context m159836a(InviteMemberChannelLarkActivity inviteMemberChannelLarkActivity, Configuration configuration) {
        Context a = inviteMemberChannelLarkActivity.mo146211a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    private int m159835a(Map<String, Slot> map, String str) {
        Slot slot = map.get(str);
        if (slot == null) {
            Log.m165383e("InvitationModule", "slot of <" + str + "> is null!");
            return R.drawable.ud_icon_lark_outlined;
        } else if ("item_link_icon".equals(slot.element_id)) {
            return R.drawable.ud_icon_link_copy_outlined;
        } else {
            if ("item_contact_icon".equals(slot.element_id)) {
                return R.drawable.ud_icon_contacts_outlined;
            }
            if ("item_direct_icon".equals(slot.element_id)) {
                return R.drawable.ud_icon_edit_outlined;
            }
            if ("item_in_lark_icon".equals(slot.element_id)) {
                return R.drawable.ud_icon_lark_outlined;
            }
            Log.m165383e("InvitationModule", "slot of <" + str + "> not found!");
            return R.drawable.ud_icon_lark_outlined;
        }
    }

    /* renamed from: b */
    private int m159845b(Map<String, Slot> map, String str) {
        Slot slot = map.get(str);
        if (slot == null) {
            Log.m165383e("InvitationModule", "slot of <" + str + "> is null!");
            return 0;
        } else if ("item_link_icon".equals(slot.element_id)) {
            return R.color.ud_O500;
        } else {
            if ("item_contact_icon".equals(slot.element_id)) {
                return R.color.ud_G500;
            }
            if ("item_direct_icon".equals(slot.element_id)) {
                return R.color.primary_pri_500;
            }
            if ("item_in_lark_icon".equals(slot.element_id)) {
                return R.color.text_title;
            }
            Log.m165383e("InvitationModule", "slot of <" + str + "> not found!");
            return 0;
        }
    }

    /* renamed from: b */
    private void m159848b(GetDynamicFlowStepResponse getDynamicFlowStepResponse, List<C40327a> list) {
        m159842a(getDynamicFlowStepResponse, list, "item_0_icon", "item_0_title", "item_0_subtitle", new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.channel.$$Lambda$InviteMemberChannelLarkActivity$mHmy7Rka9uwcmoLCn7S64vxD_nk */

            public final void onClick(View view) {
                InviteMemberChannelLarkActivity.this.m159855d(view);
            }
        });
        m159842a(getDynamicFlowStepResponse, list, "item_1_icon", "item_1_title", "item_1_subtitle", new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.channel.$$Lambda$InviteMemberChannelLarkActivity$CGeYhBfoLae0qTzzBFJ40WQOVw4 */

            public final void onClick(View view) {
                InviteMemberChannelLarkActivity.this.m159853c((InviteMemberChannelLarkActivity) view);
            }
        });
        m159842a(getDynamicFlowStepResponse, list, "item_2_icon", "item_2_title", "item_2_subtitle", new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.channel.$$Lambda$InviteMemberChannelLarkActivity$xKfh2jWVPndL63n51GAnRYJhRHU */

            public final void onClick(View view) {
                InviteMemberChannelLarkActivity.this.m159846b((InviteMemberChannelLarkActivity) view);
            }
        });
        if (C40147z.m159160a().isFgEnable("invite.through.chat.enable")) {
            m159842a(getDynamicFlowStepResponse, list, "item_3_icon", "item_3_title", "item_3_subtitle", new View.OnClickListener() {
                /* class com.ss.android.lark.invitation.v2.feat.member.channel.$$Lambda$InviteMemberChannelLarkActivity$ovQMznE5vTAAkmy4yylt421UWKA */

                public final void onClick(View view) {
                    InviteMemberChannelLarkActivity.this.m159838a((InviteMemberChannelLarkActivity) view);
                }
            });
        }
    }

    /* renamed from: a */
    private void m159841a(GetDynamicFlowStepResponse getDynamicFlowStepResponse, List<C40327a> list) {
        Map<String, Slot> map = getDynamicFlowStepResponse.step.slots;
        Element a = C40120n.m159077a(getDynamicFlowStepResponse, "header_cover", Element.ElementType.PICTURE);
        Element a2 = C40120n.m159077a(getDynamicFlowStepResponse, "header_content", Element.ElementType.TEXT);
        if (a == null || a2 == null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f102444f.getLayoutParams();
            layoutParams.addRule(3, R.id.imclTitleBar);
            this.f102444f.setLayoutParams(layoutParams);
            return;
        }
        list.add(new C40327a(a.picture_element_data.image_data, C40120n.m159079a(a2.text_element_data, Pair.create("TEAM_NAME", C40147z.m159160a().getLoginDependency().mo145588d()))));
    }

    /* renamed from: a */
    public static void m159844a(InviteMemberChannelLarkActivity inviteMemberChannelLarkActivity, Context context) {
        inviteMemberChannelLarkActivity.mo146212a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteMemberChannelLarkActivity);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.invitation.v2.feat.member.common.InviteMemberProcessGuideAbsActivity, androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10010 && i2 == -1) {
            InvHitPoint.m160352a(intent, this.f102464b);
            if ("new_guide".equals(this.f102464b) || "upgrade".equals(this.f102464b)) {
                new C40341d(this, false, UIHelper.getString(R.string.Lark_Invitation_AddMembersInLarkSucceedContent), new DialogC25637f.AbstractC25638a() {
                    /* class com.ss.android.lark.invitation.v2.feat.member.channel.$$Lambda$InviteMemberChannelLarkActivity$GMdan7dHsS2j8N_KZDaivOpIQM4 */

                    @Override // com.larksuite.component.ui.dialog.DialogC25637f.AbstractC25638a
                    public final void onClick(DialogC25637f fVar, int i) {
                        InviteMemberChannelLarkActivity.this.m159849b((InviteMemberChannelLarkActivity) fVar, (DialogC25637f) i);
                    }
                }, $$Lambda$InviteMemberChannelLarkActivity$W_pGwG51sZ141jxnNaCXbDAZk2U.INSTANCE).mo146231a();
            } else {
                ViewUtils.m224145a((int) R.string.Lark_Invitation_AddMembersSucceedTitle);
            }
        }
    }

    /* renamed from: a */
    private void m159842a(GetDynamicFlowStepResponse getDynamicFlowStepResponse, List<C40327a> list, String str, String str2, String str3, View.OnClickListener onClickListener) {
        String str4;
        Map<String, Slot> map = getDynamicFlowStepResponse.step.slots;
        Element a = C40120n.m159077a(getDynamicFlowStepResponse, str2, Element.ElementType.TEXT);
        if (a != null) {
            String charSequence = C40120n.m159079a(a.text_element_data, new Pair[0]).toString();
            Element a2 = C40120n.m159077a(getDynamicFlowStepResponse, str3, Element.ElementType.TEXT);
            if (a2 != null) {
                str4 = C40120n.m159079a(a2.text_element_data, new Pair[0]).toString();
            } else {
                str4 = "";
            }
            list.add(new LarkChannelItem(m159835a(map, str), m159845b(map, str), charSequence, str4, onClickListener));
        }
    }
}
