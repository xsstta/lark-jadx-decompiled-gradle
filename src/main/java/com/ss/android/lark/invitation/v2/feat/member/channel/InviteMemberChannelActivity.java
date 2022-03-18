package com.ss.android.lark.invitation.v2.feat.member.channel;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.contact.v1.BizScenario;
import com.bytedance.lark.pb.contact.v1.GetDynamicMediaRequest;
import com.bytedance.lark.pb.contact.v1.ImageOptions;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.abtest.api.IABTestService;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.inv.export.util.C40103e;
import com.ss.android.lark.inv.export.util.C40108g;
import com.ss.android.lark.inv.export.util.C40111j;
import com.ss.android.lark.inv.export.util.C40118l;
import com.ss.android.lark.inv.export.util.C40132r;
import com.ss.android.lark.inv.export.util.C40145x;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.inv.export.util.InvApmUtils;
import com.ss.android.lark.inv.export.util.InvAppreciableUtils;
import com.ss.android.lark.invitation.v2.feat.member.bean.MemberInvitationInfo;
import com.ss.android.lark.invitation.v2.feat.member.channel.InviteMemberChannelActivity;
import com.ss.android.lark.invitation.v2.feat.member.channel.p2059a.C40327a;
import com.ss.android.lark.invitation.v2.feat.member.common.C40338c;
import com.ss.android.lark.invitation.v2.feat.member.common.C40341d;
import com.ss.android.lark.invitation.v2.feat.member.common.InviteConstantKeyImageDataParser;
import com.ss.android.lark.invitation.v2.feat.member.common.InviteMemberProcessGuideAbsActivity;
import com.ss.android.lark.invitation.v2.feat.member.contact.C40351a;
import com.ss.android.lark.invitation.v2.feat.member.contact.InviteMemberContactActivity;
import com.ss.android.lark.invitation.v2.feat.member.nonDirectional.InviteMemberNonDirectionalActivity;
import com.ss.android.lark.invitation.v2.feat.member.orientation.InviteMemberOrientationActivity;
import com.ss.android.lark.invitation.v2.feat.member.teamCode.InviteMemberTeamCodeActivity;
import com.ss.android.lark.invitation.v2.p2050a.C40155b;
import com.ss.android.lark.invitation.v2.p2052c.C40157a;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import com.ss.android.lark.thirdshare.lark.p2746a.p2748b.C55761a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57768af;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.widget.recyclerview.p2964a.C58973b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InviteMemberChannelActivity extends InviteMemberProcessGuideAbsActivity {

    /* renamed from: a */
    public MemberInvitationInfo f102432a;

    /* renamed from: f */
    private CommonTitleBar f102433f;

    /* renamed from: g */
    private RecyclerView f102434g;

    /* renamed from: h */
    private ViewUtils.C57751a f102435h;

    /* renamed from: i */
    private boolean f102436i = true;

    /* renamed from: a */
    public Context mo146199a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo146201a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m159793a(this, context);
    }

    /* renamed from: b */
    public Resources mo146202b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo146203c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m159787a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo146205d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m159802c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m159788a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m159799b(this);
    }

    /* renamed from: a */
    public void mo146200a() {
        if (this.f102432a != null) {
            C40157a.m159182a(this, UIHelper.getString(R.string.Lark_Invitation_AddMembers_SubtitleOne_QuickInvitation_InviteViaFeishu), this.f102432a.getLinkMsg());
            return;
        }
        if (this.f102435h == null) {
            this.f102435h = ViewUtils.m224154c(this);
        }
        C40338c.m159892a().mo146227a(this.f102465c, C55761a.m215988a(), this.f102435h, new IGetDataCallback<MemberInvitationInfo>() {
            /* class com.ss.android.lark.invitation.v2.feat.member.channel.InviteMemberChannelActivity.C403202 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165386e("InvitationModule", errorResult);
            }

            /* renamed from: a */
            public void onSuccess(MemberInvitationInfo memberInvitationInfo) {
                InviteMemberChannelActivity.this.f102432a = memberInvitationInfo;
                C40157a.m159182a(InviteMemberChannelActivity.this, UIHelper.getString(R.string.Lark_Invitation_AddMembers_SubtitleOne_QuickInvitation_InviteViaFeishu), memberInvitationInfo.getLinkMsg());
                InvApmUtils.m158968a("ug_invite_member_nondirectional_share", true, (Map<String, ? extends Object>) C40108g.m159014a(Pair.create(ShareHitPoint.f121869d, "link"), Pair.create("item", C55761a.m215988a().name())));
            }
        });
    }

    /* renamed from: h */
    private void m159814h() {
        m159794a(new ApiUtils.AbstractC57748a() {
            /* class com.ss.android.lark.invitation.v2.feat.member.channel.$$Lambda$InviteMemberChannelActivity$DSxa7YooAS2VRgwTVYj2zU2Lz1Y */

            @Override // com.ss.android.lark.utils.ApiUtils.AbstractC57748a
            public final void consume(Object obj) {
                InviteMemberChannelActivity.this.m159790a((InviteMemberChannelActivity) ((Bitmap) obj));
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isSlideEnable() {
        if ("ug_flow".equals(this.f102464b)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.inv.export.ui.InvBaseFragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        C40351a.m159930a(C40147z.m159160a().isLarkEnv());
    }

    /* renamed from: g */
    private List<C40327a> m159811g() {
        ArrayList arrayList = new ArrayList();
        if (this.f102436i) {
            m159795a(arrayList);
            m159801b(arrayList);
            m159804c(arrayList);
        } else {
            m159806d(arrayList);
            m159808e(arrayList);
            m159810f(arrayList);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m159812g(View view) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m159790a(Bitmap bitmap) {
        if (bitmap == null) {
            ViewUtils.m224144a();
        } else {
            C40157a.m159190e(this, bitmap, new OnShareCallback() {
                /* class com.ss.android.lark.invitation.v2.feat.member.channel.InviteMemberChannelActivity.C403213 */

                @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
                public boolean intercept(ShareActionType shareActionType) {
                    if (shareActionType != ShareActionType.WX) {
                        return false;
                    }
                    InvHitPoint.m160380f();
                    return false;
                }

                @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
                public void onSuccess(ShareActionType shareActionType) {
                    InvHitPoint.m160366b(InviteMemberChannelActivity.this.f102464b, shareActionType);
                    InvApmUtils.m158968a("ug_invite_member_nondirectional_share", true, (Map<String, ? extends Object>) C40108g.m159014a(Pair.create(ShareHitPoint.f121869d, "qrcode"), Pair.create("item", shareActionType.name())));
                }

                @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
                public void onFailed(ShareActionType shareActionType, OnShareCallback.ShareError shareError) {
                    if (NOT_INSTALLED.equals(shareError)) {
                        ViewUtils.m224150a(UIHelper.getString(R.string.Lark_UserGrowth_InvitePeopleContactsShareNotInstalled));
                    }
                    InvApmUtils.m158961a("ug_invite_member_nondirectional_share", C40108g.m159014a(Pair.create(ShareHitPoint.f121869d, "qrcode"), Pair.create("item", shareActionType.name())), shareError.getCode(), shareError.getMsg());
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m159797b(View view) {
        m159814h();
        InvHitPoint.m160327F(this.f102464b);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m159803c(View view) {
        InviteMemberNonDirectionalActivity.m160023a(this, this.f102464b, "link", this.f102465c);
        InvHitPoint.m160385h(this.f102464b);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m159805d(View view) {
        InviteMemberNonDirectionalActivity.m160023a(this, this.f102464b, "qr_code", this.f102465c);
        InvHitPoint.m160387i(this.f102464b);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m159809f(View view) {
        C40132r.m159120b();
        InvHitPoint.af(this.f102464b);
    }

    /* renamed from: a */
    public static Resources m159788a(InviteMemberChannelActivity inviteMemberChannelActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteMemberChannelActivity);
        }
        return inviteMemberChannelActivity.mo146202b();
    }

    /* renamed from: c */
    public static AssetManager m159802c(InviteMemberChannelActivity inviteMemberChannelActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteMemberChannelActivity);
        }
        return inviteMemberChannelActivity.mo146205d();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m159807e(View view) {
        InviteMemberContactActivity.m159903a(this, C40147z.m159160a().isLarkEnv(), this.f102464b, this.f102465c, "add_member_channel");
    }

    /* renamed from: b */
    public static void m159799b(InviteMemberChannelActivity inviteMemberChannelActivity) {
        inviteMemberChannelActivity.mo146203c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InviteMemberChannelActivity inviteMemberChannelActivity2 = inviteMemberChannelActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inviteMemberChannelActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: c */
    private void m159804c(List<C40327a> list) {
        C40327a aVar = new C40327a(UIHelper.getString(R.string.Lark_Invitation_AddMembers_SubtitleThree_AddMembersDirectly));
        list.add(aVar);
        m159815h(list);
        m159813g(list);
        if (list.indexOf(aVar) == list.size() - 1) {
            list.remove(aVar);
        }
    }

    /* renamed from: d */
    private void m159806d(List<C40327a> list) {
        C40327a aVar = new C40327a(UIHelper.getString(R.string.Lark_Invitation_AddMembersTitleInvitation));
        list.add(aVar);
        m159818k(list);
        m159817j(list);
        m159816i(list);
        if (list.indexOf(aVar) == list.size() - 1) {
            list.remove(aVar);
        }
    }

    /* renamed from: e */
    private void m159808e(List<C40327a> list) {
        C40327a aVar = new C40327a(UIHelper.getString(R.string.Lark_Invitation_AddMembersTitleDirectAdd));
        list.add(aVar);
        m159815h(list);
        m159813g(list);
        if (list.indexOf(aVar) == list.size() - 1) {
            list.remove(aVar);
        }
    }

    /* renamed from: f */
    private void m159810f(List<C40327a> list) {
        C40327a aVar = new C40327a(UIHelper.getString(R.string.Lark_Invitation_AddMembersTitleOtherWay));
        list.add(aVar);
        m159819l(list);
        if (list.indexOf(aVar) == list.size() - 1) {
            list.remove(aVar);
        }
    }

    /* renamed from: h */
    private void m159815h(List<C40327a> list) {
        int i;
        if (this.f102436i) {
            i = R.string.Lark_Invitation_AddMembers_SubtitleThree_AddMembersDirectly_ImportFromContacts;
        } else {
            i = R.string.Lark_Invitation_AddMembersImportContactsNew;
        }
        list.add(new C40327a(R.drawable.ud_icon_contacts_outlined, R.color.ud_G500, UIHelper.getString(i), new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.channel.$$Lambda$InviteMemberChannelActivity$xLebnTDOcej3EnUGc0aPmNTydMo */

            public final void onClick(View view) {
                InviteMemberChannelActivity.this.m159807e((InviteMemberChannelActivity) view);
            }
        }));
    }

    /* renamed from: i */
    private void m159816i(List<C40327a> list) {
        String str;
        if (C40147z.m159160a().isFgEnable("invite.through.chat.enable")) {
            if (this.f102436i) {
                str = UIHelper.getString(R.string.Lark_Invitation_AddMembers_SubtitleOne_QuickInvitation_InviteViaFeishu);
            } else {
                str = UIHelper.mustacheFormat((int) R.string.Lark_Invitation_AddMembersLarkInvite, "ENV_DISPLAY_NAME", C40145x.m159157a());
            }
            list.add(new C40327a(R.drawable.ud_icon_lark_outlined, R.color.primary_pri_500, str, new C40103e.AbstractView$OnClickListenerC40105a() {
                /* class com.ss.android.lark.invitation.v2.feat.member.channel.InviteMemberChannelActivity.C403191 */

                @Override // com.ss.android.lark.inv.export.util.C40103e.AbstractView$OnClickListenerC40105a
                /* renamed from: a */
                public void mo145670a(View view) {
                    InviteMemberChannelActivity.this.mo146200a();
                    InvHitPoint.m160333L(InviteMemberChannelActivity.this.f102464b);
                }
            }));
        }
    }

    /* renamed from: k */
    private void m159818k(List<C40327a> list) {
        int i;
        if (!C40147z.m159160a().isGooglePlay() && C40147z.m159160a().isFgEnable("third.share.wx.enable")) {
            if (this.f102436i) {
                i = R.string.Lark_Invitation_AddMembers_SubtitleOne_QuickInvitation_InviteViaWeChat;
            } else {
                i = R.string.Lark_Invitation_AddMembersWechatInvite;
            }
            list.add(new C40327a(R.drawable.ud_icon_wechat_colorful, 0, UIHelper.getString(i), new View.OnClickListener() {
                /* class com.ss.android.lark.invitation.v2.feat.member.channel.$$Lambda$InviteMemberChannelActivity$OgBldRQL7rJtbXJ6G4tP0Gfkao */

                public final void onClick(View view) {
                    InviteMemberChannelActivity.this.m159797b((InviteMemberChannelActivity) view);
                }
            }));
        }
    }

    /* renamed from: l */
    private void m159819l(List<C40327a> list) {
        int i;
        if (this.f102436i) {
            i = R.string.Lark_Invitation_AddMembers_SubtitleTwo_AddMemberstoJoin_TeamCode;
        } else {
            i = R.string.Lark_Invitation_AddMembersCheckTeamCode;
        }
        list.add(new C40327a(R.drawable.ud_icon_team_code_outlined, R.color.primary_pri_500, UIHelper.getString(i), new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.channel.$$Lambda$InviteMemberChannelActivity$y7BWgIQAUpIa7QVajh2usYhINMw */

            public final void onClick(View view) {
                InviteMemberChannelActivity.this.m159791a((InviteMemberChannelActivity) view);
            }
        }));
    }

    /* renamed from: b */
    private void m159801b(List<C40327a> list) {
        C40327a aVar = new C40327a(UIHelper.getString(R.string.Lark_Invitation_AddMembers_SubtitleTwo_AddMemberstoJoin));
        list.add(aVar);
        m159817j(list);
        m159819l(list);
        if (list.indexOf(aVar) == list.size() - 1) {
            list.remove(aVar);
        }
    }

    /* renamed from: g */
    private void m159813g(List<C40327a> list) {
        int i;
        IInvitationModuleDependency a = C40147z.m159160a();
        boolean isFgEnable = a.isFgEnable("invite.member.email.enable");
        boolean isFgEnable2 = a.isFgEnable("invite.member.phone.enable");
        if (isFgEnable && isFgEnable2) {
            i = R.string.Lark_Invitation_AddMembersInputPhoneorEmail;
        } else if (isFgEnable) {
            i = R.string.Lark_Invitation_AddMembersInputEmail;
        } else if (!isFgEnable2) {
            i = -1;
        } else if (this.f102436i) {
            i = R.string.Lark_Invitation_AddMembers_SubtitleThree_AddMembersDirectly_EnterPhone;
        } else {
            i = R.string.Lark_Invitation_AddMembersInputPhone;
        }
        if (i != -1) {
            list.add(new C40327a(R.drawable.ud_icon_edit_outlined, R.color.primary_pri_500, UIHelper.getString(i), new View.OnClickListener(isFgEnable, isFgEnable2) {
                /* class com.ss.android.lark.invitation.v2.feat.member.channel.$$Lambda$InviteMemberChannelActivity$5t4Pfg6nlc8EXqVzS0DU6U9_Yhc */
                public final /* synthetic */ boolean f$1;
                public final /* synthetic */ boolean f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(View view) {
                    InviteMemberChannelActivity.this.m159796a(this.f$1, this.f$2, view);
                }
            }));
        }
    }

    /* renamed from: j */
    private void m159817j(List<C40327a> list) {
        int i;
        int i2;
        String str;
        boolean isLarkEnv = C40147z.m159160a().isLarkEnv();
        if (C40147z.m159160a().isFgEnable("invite.member.channels.page.qrcode.enable")) {
            if (this.f102436i) {
                i2 = R.string.Lark_Invitation_AddMembers_SubtitleTwo_AddMemberstoJoin_TeamQRCode;
            } else {
                i2 = R.string.Lark_Invitation_AddMembersTeamQRCodeInvite;
            }
            String string = UIHelper.getString(i2);
            if (this.f102436i) {
                str = "";
            } else {
                str = UIHelper.getString(R.string.Lark_Invitation_AddMembersShareForQRCode);
            }
            list.add(new C40327a(R.drawable.ud_icon_qr_outlined, R.color.ud_W500, string, str, new View.OnClickListener() {
                /* class com.ss.android.lark.invitation.v2.feat.member.channel.$$Lambda$InviteMemberChannelActivity$GPtvClf3vUJYKMseSouQ3Rr6IsM */

                public final void onClick(View view) {
                    InviteMemberChannelActivity.this.m159805d((InviteMemberChannelActivity) view);
                }
            }));
        }
        if (C40147z.m159160a().isFgEnable("invite.member.channels.page.link.enable")) {
            if (isLarkEnv) {
                i = R.string.Lark_Invitation_AddMembersShareForLink;
            } else {
                i = R.string.Lark_Invitation_AddMembersShareForFeishuLink;
            }
            list.add(new C40327a(R.drawable.ud_icon_link_copy_outlined, R.color.ud_O500, UIHelper.getString(R.string.Lark_Invitation_AddMembersTeamLinkInvite), UIHelper.getString(i), new View.OnClickListener() {
                /* class com.ss.android.lark.invitation.v2.feat.member.channel.$$Lambda$InviteMemberChannelActivity$InCJCMI_jBMni_XBR5VXOmnV8MY */

                public final void onClick(View view) {
                    InviteMemberChannelActivity.this.m159803c((InviteMemberChannelActivity) view);
                }
            }));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m159791a(View view) {
        InviteMemberTeamCodeActivity.m160192a(this, this.f102464b, this.f102465c);
        InvHitPoint.m160328G(this.f102464b);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.invitation.v2.feat.member.common.InviteMemberProcessGuideAbsActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(R.layout.inv_invite_member_channel_activity);
        Boolean bool = (Boolean) ((IABTestService) ApiUtils.getApi(IABTestService.class)).getAbTestValue(C40155b.class, true);
        if (bool != null) {
            this.f102436i = bool.booleanValue();
        }
        Log.m165389i("InvitationModule", "isAdjust -> " + this.f102436i);
        mo146222e();
        this.f102433f = (CommonTitleBar) findViewById(R.id.imcTitleBar);
        this.f102434g = (RecyclerView) findViewById(R.id.imcRv);
        this.f102433f.setTitle(UIHelper.getString(R.string.Lark_Invitation_InviteTeamMembers_TitleBar));
        this.f102433f.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.channel.$$Lambda$InviteMemberChannelActivity$vWWwd1AOAUwDiXn6oWealGXSVw */

            public final void onClick(View view) {
                InviteMemberChannelActivity.this.m159812g((InviteMemberChannelActivity) view);
            }
        });
        if (mo146223f() && this.f102436i) {
            if (DesktopUtil.m144307b()) {
                i = R.drawable.inv_title_bar_right_icon_desktop_selector;
            } else {
                i = R.drawable.ud_icon_maybe_outlined;
            }
            Drawable c = C57582a.m223614c(this, i);
            c.mutate();
            c.setTint(C57582a.m223616d(this, R.color.icon_n1));
            this.f102433f.setRightImage(c);
            this.f102433f.getRightView(0).setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.invitation.v2.feat.member.channel.$$Lambda$InviteMemberChannelActivity$OSpQpA1Sqp_XYodOHRsgyT092CI */

                public final void onClick(View view) {
                    InviteMemberChannelActivity.this.m159809f((InviteMemberChannelActivity) view);
                }
            });
        }
        mo146220a(this.f102433f);
        C58973b bVar = new C58973b();
        bVar.mo200080a(m159811g());
        this.f102434g.setAdapter(bVar);
        this.f102434g.setLayoutManager(new LinearLayoutManager(this));
        InvHitPoint.m160322B(this.f102464b);
        InvAppreciableUtils.f101934a.mo145659b(false);
    }

    /* renamed from: a */
    private void m159794a(final ApiUtils.AbstractC57748a<Bitmap> aVar) {
        C57768af.m224220b(this, new C57768af.AbstractRunnableC57773c<Bitmap>() {
            /* class com.ss.android.lark.invitation.v2.feat.member.channel.InviteMemberChannelActivity.C403224 */

            /* renamed from: a */
            public Bitmap mo130916b() {
                if (InviteMemberChannelActivity.this.f102432a != null) {
                    return m159828a(InviteMemberChannelActivity.this.f102432a);
                }
                final C57768af.C57772b bVar = new C57768af.C57772b();
                C40338c.m159892a().mo146228a(false, InviteMemberChannelActivity.this.f102465c, new IGetDataCallback<MemberInvitationInfo>() {
                    /* class com.ss.android.lark.invitation.v2.feat.member.channel.InviteMemberChannelActivity.C403224.C403231 */

                    /* renamed from: a */
                    public void onSuccess(MemberInvitationInfo memberInvitationInfo) {
                        InviteMemberChannelActivity.this.f102432a = memberInvitationInfo;
                        bVar.mo196072a(memberInvitationInfo);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        bVar.mo196072a(null);
                        Log.m165386e("InvitationModule", errorResult);
                        ViewUtils.m224150a(errorResult.getDisplayMsg());
                    }
                });
                MemberInvitationInfo memberInvitationInfo = (MemberInvitationInfo) bVar.mo196071a();
                if (memberInvitationInfo == null) {
                    return null;
                }
                return m159828a(memberInvitationInfo);
            }

            /* renamed from: a */
            public void mo130914a(Bitmap bitmap) {
                aVar.consume(bitmap);
            }

            /* renamed from: a */
            private Bitmap m159828a(MemberInvitationInfo memberInvitationInfo) {
                InvApmUtils.m158958a("ug_invite_member_nondirectional_get_save_or_share_qrcode");
                InvApmUtils.m158958a("ug_invite_member_nondir_get_save_or_share_qr");
                C57768af.C57772b bVar = new C57768af.C57772b();
                GetDynamicMediaRequest.C16236a aVar = new GetDynamicMediaRequest.C16236a();
                aVar.mo58176a(BizScenario.TeamCard);
                aVar.mo58178a(new ImageOptions.C16314a().mo58348a(ImageOptions.ResolutionType.HighDefinition).build());
                C40111j.m159029a(aVar, new InviteConstantKeyImageDataParser(C40147z.m159160a().encodeQRCode(memberInvitationInfo.qrUrl, UIHelper.dp2px(110.0f), UIHelper.dp2px(110.0f), 0), memberInvitationInfo.getDisplayTeamCode()), new ApiUtils.AbstractC57748a() {
                    /* class com.ss.android.lark.invitation.v2.feat.member.channel.$$Lambda$InviteMemberChannelActivity$4$ndFh0UGluznwaschMC8uuu5TP_E */

                    @Override // com.ss.android.lark.utils.ApiUtils.AbstractC57748a
                    public final void consume(Object obj) {
                        InviteMemberChannelActivity.C403224.m159829a(C57768af.C57772b.this, (SdkSender.C53233d) obj);
                    }
                });
                return (Bitmap) bVar.mo196071a();
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m159829a(C57768af.C57772b bVar, SdkSender.C53233d dVar) {
                if (dVar.f131573b != null) {
                    InvApmUtils.m158959a("ug_invite_member_nondirectional_get_save_or_share_qrcode", dVar.f131573b);
                    InvApmUtils.m158959a("ug_invite_member_nondir_get_save_or_share_qr", dVar.f131573b);
                } else {
                    InvApmUtils.m158967a("ug_invite_member_nondirectional_get_save_or_share_qrcode", true);
                    InvApmUtils.m158967a("ug_invite_member_nondir_get_save_or_share_qr", true);
                }
                bVar.mo196072a(dVar.f131572a);
            }
        }.mo196073a(5000, new Runnable() {
            /* class com.ss.android.lark.invitation.v2.feat.member.channel.$$Lambda$InviteMemberChannelActivity$ahLPK_wpFJnWiNVe155QN0E5LC4 */

            public final void run() {
                ApiUtils.AbstractC57748a.this.consume(null);
            }
        }));
    }

    /* renamed from: a */
    private void m159795a(List<C40327a> list) {
        C40327a aVar = new C40327a(UIHelper.getString(R.string.Lark_Invitation_AddMembers_SubtitleOne_QuickInvitation));
        list.add(aVar);
        m159818k(list);
        m159816i(list);
        if (list.indexOf(aVar) == list.size() - 1) {
            list.remove(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m159798b(DialogC25637f fVar, int i) {
        finish();
    }

    /* renamed from: a */
    public static Context m159787a(InviteMemberChannelActivity inviteMemberChannelActivity, Configuration configuration) {
        Context a = inviteMemberChannelActivity.mo146199a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m159793a(InviteMemberChannelActivity inviteMemberChannelActivity, Context context) {
        inviteMemberChannelActivity.mo146201a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteMemberChannelActivity);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.invitation.v2.feat.member.common.InviteMemberProcessGuideAbsActivity, androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10010 && i2 == -1) {
            InvHitPoint.m160352a(intent, this.f102464b);
            if ("new_guide".equals(this.f102464b) || "upgrade".equals(this.f102464b) || "ug_flow".equals(this.f102464b)) {
                new C40341d(this, false, UIHelper.getString(R.string.Lark_Invitation_AddMembersInLarkSucceedContent), new DialogC25637f.AbstractC25638a() {
                    /* class com.ss.android.lark.invitation.v2.feat.member.channel.$$Lambda$InviteMemberChannelActivity$h9YFVv0UudtWuapDa77v2BEgv7Q */

                    @Override // com.larksuite.component.ui.dialog.DialogC25637f.AbstractC25638a
                    public final void onClick(DialogC25637f fVar, int i) {
                        InviteMemberChannelActivity.this.m159798b(fVar, i);
                    }
                }, $$Lambda$InviteMemberChannelActivity$K3uDYbdMA7KixlUutoja_MRMj6w.INSTANCE).mo146231a();
            } else {
                LKUIToast.show(this, (int) R.string.Lark_Invitation_AddMembersSucceedTitle);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m159796a(boolean z, boolean z2, View view) {
        InviteMemberOrientationActivity.m160104a(this, this.f102464b, this.f102465c, true, Collections.emptyMap());
        if (z && z2) {
            InvHitPoint.m160326E(this.f102464b);
        } else if (z) {
            InvHitPoint.m160325D(this.f102464b);
        } else {
            InvHitPoint.m160323C(this.f102464b);
        }
    }

    /* renamed from: a */
    public static void m159789a(Context context, String str, String str2, Map<String, String> map) {
        String str3;
        HashMap a = C40108g.m159014a(Pair.create("from_scenes", str), Pair.create("departments", str2));
        if (map != null) {
            a.putAll(map);
        }
        if (C40147z.m159160a().isLarkEnv()) {
            str3 = "//client/invite/member/channelLark";
        } else {
            str3 = "//client/invite/member/channel";
        }
        if ("new_guide".equals(str) || "upgrade".equals(str) || "ug_flow".equals(str)) {
            C40118l.m159075a(context, str3, a, 255);
        } else {
            C40118l.m159074a(context, str3, a);
        }
        InvAppreciableUtils.f101934a.mo145659b(true);
    }
}
