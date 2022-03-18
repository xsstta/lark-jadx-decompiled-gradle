package com.ss.android.lark.invitation.v2.feat.member.nonDirectional;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.inv.export.ui.InvBaseFragmentActivity;
import com.ss.android.lark.inv.export.ui.NoSlideViewPager;
import com.ss.android.lark.inv.export.util.C40103e;
import com.ss.android.lark.inv.export.util.C40108g;
import com.ss.android.lark.inv.export.util.C40118l;
import com.ss.android.lark.inv.export.util.InvErrorView;
import com.ss.android.lark.invitation.v2.feat.member.bean.MemberInvitationInfo;
import com.ss.android.lark.invitation.v2.feat.member.common.C40338c;
import com.ss.android.lark.invitation.v2.feat.member.nonDirectional.link.InviteMemberNonDirectionLinkFragment;
import com.ss.android.lark.invitation.v2.feat.member.nonDirectional.qrCode.InviteMemberNonDirectionQrCodeFragment;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bH\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0006\u0010\u001a\u001a\u00020\u0014J\u0012\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\u0018\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u000bH\u0002J\u0018\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000bH\u0002J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/InviteMemberNonDirectionalActivity;", "Lcom/ss/android/lark/inv/export/ui/InvBaseFragmentActivity;", "()V", "curType", "", "departments", "fragments", "", "Landroidx/fragment/app/Fragment;", "from", "isInitTitleBar", "", "linkFragment", "Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/link/InviteMemberNonDirectionLinkFragment;", "loadingDialog", "Lcom/ss/android/lark/utils/ViewUtils$PageLoadingDialog;", "qrCodeFragment", "Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/qrCode/InviteMemberNonDirectionQrCodeFragment;", "srcType", "dataFromIntent", "", "getInvitationInfo", "isRefreshAction", "initLoading", "initTitleBar", "initView", "onClickRefresh", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setInviteMode", "showCardView", "info", "Lcom/ss/android/lark/invitation/v2/feat/member/bean/MemberInvitationInfo;", "showError", "msg", "updateRefreshAnim", "isStart", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InviteMemberNonDirectionalActivity extends InvBaseFragmentActivity {

    /* renamed from: f */
    public static final Companion f102615f = new Companion(null);

    /* renamed from: a */
    public String f102616a;

    /* renamed from: b */
    public String f102617b;

    /* renamed from: c */
    public String f102618c;

    /* renamed from: d */
    public ViewUtils.C57757c f102619d;

    /* renamed from: e */
    public final List<Fragment> f102620e = new ArrayList();

    /* renamed from: g */
    private String f102621g;

    /* renamed from: h */
    private InviteMemberNonDirectionQrCodeFragment f102622h;

    /* renamed from: i */
    private InviteMemberNonDirectionLinkFragment f102623i;

    /* renamed from: j */
    private boolean f102624j;

    /* renamed from: k */
    private HashMap f102625k;

    @JvmStatic
    /* renamed from: a */
    public static final void m160023a(Context context, String str, String str2, String str3) {
        f102615f.mo146354a(context, str, str2, str3);
    }

    /* renamed from: a */
    public Context mo146341a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public View mo146342a(int i) {
        if (this.f102625k == null) {
            this.f102625k = new HashMap();
        }
        View view = (View) this.f102625k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f102625k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo146344a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m160024a(this, context);
    }

    /* renamed from: c */
    public Resources mo146349c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m160021a(this, configuration);
    }

    /* renamed from: d */
    public void mo146351d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo146352e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m160032g(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m160029e(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m160031f(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/InviteMemberNonDirectionalActivity$Companion;", "", "()V", "TAG", "", "start", "", "context", "Landroid/content/Context;", "from", ShareHitPoint.f121869d, "departments", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.InviteMemberNonDirectionalActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo146354a(Context context, String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "from");
            Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121869d);
            C40118l.m159074a(context, "//client/invite/member/share", C40108g.m159014a(Pair.create("from_scenes", str), Pair.create(ShareHitPoint.f121869d, str2), Pair.create("departments", str3)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/invitation/v2/feat/member/nonDirectional/InviteMemberNonDirectionalActivity$initView$2", "Landroidx/fragment/app/FragmentPagerAdapter;", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.InviteMemberNonDirectionalActivity$f */
    public static final class C40401f extends FragmentPagerAdapter {

        /* renamed from: a */
        final /* synthetic */ InviteMemberNonDirectionalActivity f102631a;

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f102631a.f102620e.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            return this.f102631a.f102620e.get(i);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40401f(InviteMemberNonDirectionalActivity inviteMemberNonDirectionalActivity, FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f102631a = inviteMemberNonDirectionalActivity;
        }
    }

    /* renamed from: h */
    private final void m160034h() {
        mo146343a();
        C40103e.m159004a(((CommonTitleBar) mo146342a(R.id.imndLinkTitleBar)).getRightView(0), 500, new View$OnClickListenerC40399d(this));
    }

    /* renamed from: i */
    private final void m160035i() {
        ViewUtils.C57757c d = ViewUtils.m224155d(this);
        Intrinsics.checkExpressionValueIsNotNull(d, "ViewUtils.createPageLoadingDialog(this)");
        this.f102619d = d;
        if (d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingDialog");
        }
        d.mo196036a(new DialogInterface$OnCancelListenerC40398c(this));
        ViewUtils.C57757c cVar = this.f102619d;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingDialog");
        }
        cVar.mo196039b();
    }

    /* renamed from: f */
    private final void m160030f() {
        String stringExtra = getIntent().getStringExtra(ShareHitPoint.f121869d);
        if (stringExtra == null) {
            stringExtra = "qr_code";
        }
        this.f102617b = stringExtra;
        if (stringExtra == null) {
            Intrinsics.throwUninitializedPropertyAccessException("srcType");
        }
        this.f102618c = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("from_scenes");
        String str = "";
        if (stringExtra2 == null) {
            stringExtra2 = str;
        }
        this.f102616a = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("departments");
        if (stringExtra3 != null) {
            str = stringExtra3;
        }
        this.f102621g = str;
        StringBuilder sb = new StringBuilder();
        sb.append("onCreate InviteMemberShareActivity from: ");
        String str2 = this.f102616a;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("from");
        }
        sb.append(str2);
        sb.append(", type: ");
        String str3 = this.f102617b;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("srcType");
        }
        sb.append(str3);
        Log.m165389i("InvitationModule", sb.toString());
    }

    /* renamed from: b */
    public final void mo146348b() {
        String str;
        String str2 = this.f102618c;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("curType");
        }
        if (Intrinsics.areEqual("qr_code", str2)) {
            String str3 = this.f102616a;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("from");
            }
            InvHitPoint.m160356a(str3, "qrcode");
            str = UIHelper.getString(R.string.Lark_Invitation_AddMembersRefreshDialogContentQRCode);
        } else {
            String str4 = this.f102616a;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("from");
            }
            InvHitPoint.m160356a(str4, "link");
            str = UIHelper.getString(R.string.Lark_Invitation_AddMembersRefreshDialogContentLink);
        }
        new C25639g(this).mo89248g(R.string.Lark_Legacy_Hint).mo89242c(str).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Invitation_AddMembersRefreshDialogCancel, new DialogInterface$OnClickListenerC40402g(this)).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Invitation_AddMembersRefreshDialogConfirm, new DialogInterface$OnClickListenerC40403h(this)).mo89239c();
    }

    /* renamed from: g */
    private final void m160033g() {
        ((CommonTitleBar) mo146342a(R.id.imndLinkTitleBar)).setLeftClickListener(new View$OnClickListenerC40400e(this));
        InviteMemberNonDirectionQrCodeFragment.Companion aVar = InviteMemberNonDirectionQrCodeFragment.f102676c;
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        this.f102622h = aVar.mo146399a(intent.getExtras());
        InviteMemberNonDirectionLinkFragment.Companion aVar2 = InviteMemberNonDirectionLinkFragment.f102649c;
        Intent intent2 = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent2, "intent");
        this.f102623i = aVar2.mo146376a(intent2.getExtras());
        String str = this.f102617b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("srcType");
        }
        if (Intrinsics.areEqual("qr_code", str)) {
            List<Fragment> list = this.f102620e;
            InviteMemberNonDirectionQrCodeFragment aVar3 = this.f102622h;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("qrCodeFragment");
            }
            list.add(aVar3);
            List<Fragment> list2 = this.f102620e;
            InviteMemberNonDirectionLinkFragment aVar4 = this.f102623i;
            if (aVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("linkFragment");
            }
            list2.add(aVar4);
        } else {
            List<Fragment> list3 = this.f102620e;
            InviteMemberNonDirectionLinkFragment aVar5 = this.f102623i;
            if (aVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("linkFragment");
            }
            list3.add(aVar5);
            List<Fragment> list4 = this.f102620e;
            InviteMemberNonDirectionQrCodeFragment aVar6 = this.f102622h;
            if (aVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("qrCodeFragment");
            }
            list4.add(aVar6);
        }
        NoSlideViewPager noSlideViewPager = (NoSlideViewPager) mo146342a(R.id.imndVp);
        Intrinsics.checkExpressionValueIsNotNull(noSlideViewPager, "imndVp");
        noSlideViewPager.setAdapter(new C40401f(this, getSupportFragmentManager()));
    }

    /* renamed from: a */
    public final void mo146343a() {
        String str = this.f102618c;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("curType");
        }
        if (Intrinsics.areEqual("qr_code", str)) {
            ((CommonTitleBar) mo146342a(R.id.imndLinkTitleBar)).setTitle(R.string.Lark_Invitation_AddMembers_SubtitleTwo_AddMemberstoJoin_TeamQRCode);
            Drawable drawable = UIHelper.getDrawable(R.drawable.ud_icon_link_copy_outlined);
            drawable.mutate().setTint(C57582a.m223616d(this, R.color.icon_n1));
            ((CommonTitleBar) mo146342a(R.id.imndLinkTitleBar)).setRightImage(drawable);
            String str2 = this.f102616a;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("from");
            }
            InvHitPoint.m160395m(str2);
            return;
        }
        ((CommonTitleBar) mo146342a(R.id.imndLinkTitleBar)).setTitle(R.string.Lark_Invitation_AddMembers_SubtitleTwo_AddMemberstoJoin_TeamLink);
        Drawable drawable2 = UIHelper.getDrawable(R.drawable.ud_icon_qr_outlined);
        drawable2.mutate().setTint(C57582a.m223616d(this, R.color.icon_n1));
        ((CommonTitleBar) mo146342a(R.id.imndLinkTitleBar)).setRightImage(drawable2);
        String str3 = this.f102616a;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("from");
        }
        InvHitPoint.m160393l(str3);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onCancel"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.InviteMemberNonDirectionalActivity$c */
    public static final class DialogInterface$OnCancelListenerC40398c implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberNonDirectionalActivity f102628a;

        DialogInterface$OnCancelListenerC40398c(InviteMemberNonDirectionalActivity inviteMemberNonDirectionalActivity) {
            this.f102628a = inviteMemberNonDirectionalActivity;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f102628a.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/invitation/v2/feat/member/nonDirectional/InviteMemberNonDirectionalActivity$getInvitationInfo$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/invitation/v2/feat/member/bean/MemberInvitationInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "info", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.InviteMemberNonDirectionalActivity$b */
    public static final class C40397b implements IGetDataCallback<MemberInvitationInfo> {

        /* renamed from: a */
        final /* synthetic */ InviteMemberNonDirectionalActivity f102626a;

        /* renamed from: b */
        final /* synthetic */ boolean f102627b;

        /* renamed from: a */
        public void onSuccess(MemberInvitationInfo memberInvitationInfo) {
            Intrinsics.checkParameterIsNotNull(memberInvitationInfo, "info");
            this.f102626a.mo146345a(memberInvitationInfo, this.f102627b);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            if (Intrinsics.areEqual(C40338c.f102487a, errorResult)) {
                InviteMemberNonDirectionalActivity inviteMemberNonDirectionalActivity = this.f102626a;
                String string = UIHelper.getString(R.string.Lark_UserGrowth_InviteMemberPermissionDeny);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…viteMemberPermissionDeny)");
                inviteMemberNonDirectionalActivity.mo146346a(string, this.f102627b);
                return;
            }
            InviteMemberNonDirectionalActivity inviteMemberNonDirectionalActivity2 = this.f102626a;
            String string2 = UIHelper.getString(R.string.Lark_Legacy_LoadFailedRetryTip);
            Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.str…egacy_LoadFailedRetryTip)");
            inviteMemberNonDirectionalActivity2.mo146346a(string2, this.f102627b);
        }

        C40397b(InviteMemberNonDirectionalActivity inviteMemberNonDirectionalActivity, boolean z) {
            this.f102626a = inviteMemberNonDirectionalActivity;
            this.f102627b = z;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.InviteMemberNonDirectionalActivity$e */
    public static final class View$OnClickListenerC40400e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberNonDirectionalActivity f102630a;

        View$OnClickListenerC40400e(InviteMemberNonDirectionalActivity inviteMemberNonDirectionalActivity) {
            this.f102630a = inviteMemberNonDirectionalActivity;
        }

        public final void onClick(View view) {
            this.f102630a.finish();
            InvHitPoint.m160421z(InviteMemberNonDirectionalActivity.m160022a(this.f102630a));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ String m160022a(InviteMemberNonDirectionalActivity inviteMemberNonDirectionalActivity) {
        String str = inviteMemberNonDirectionalActivity.f102616a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("from");
        }
        return str;
    }

    /* renamed from: b */
    public static final /* synthetic */ ViewUtils.C57757c m160025b(InviteMemberNonDirectionalActivity inviteMemberNonDirectionalActivity) {
        ViewUtils.C57757c cVar = inviteMemberNonDirectionalActivity.f102619d;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingDialog");
        }
        return cVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ String m160027c(InviteMemberNonDirectionalActivity inviteMemberNonDirectionalActivity) {
        String str = inviteMemberNonDirectionalActivity.f102618c;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("curType");
        }
        return str;
    }

    /* renamed from: d */
    public static final /* synthetic */ String m160028d(InviteMemberNonDirectionalActivity inviteMemberNonDirectionalActivity) {
        String str = inviteMemberNonDirectionalActivity.f102617b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("srcType");
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.InviteMemberNonDirectionalActivity$i */
    public static final class View$OnClickListenerC40404i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberNonDirectionalActivity f102634a;

        View$OnClickListenerC40404i(InviteMemberNonDirectionalActivity inviteMemberNonDirectionalActivity) {
            this.f102634a = inviteMemberNonDirectionalActivity;
        }

        public final void onClick(View view) {
            InviteMemberNonDirectionalActivity.m160025b(this.f102634a).mo196039b();
            ((InvErrorView) this.f102634a.mo146342a(R.id.imndErrorView)).mo145640b();
            this.f102634a.mo146347a(false);
        }
    }

    /* renamed from: e */
    public static Resources m160029e(InviteMemberNonDirectionalActivity inviteMemberNonDirectionalActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteMemberNonDirectionalActivity);
        }
        return inviteMemberNonDirectionalActivity.mo146349c();
    }

    /* renamed from: g */
    public static AssetManager m160032g(InviteMemberNonDirectionalActivity inviteMemberNonDirectionalActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteMemberNonDirectionalActivity);
        }
        return inviteMemberNonDirectionalActivity.mo146352e();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_body);
        setContentView(R.layout.inv_invite_member_non_directional_view);
        m160030f();
        m160033g();
        mo146347a(false);
        m160035i();
    }

    /* renamed from: b */
    private final void m160026b(boolean z) {
        InviteMemberNonDirectionQrCodeFragment aVar = this.f102622h;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("qrCodeFragment");
        }
        aVar.mo146397b().mo146404a(z);
        InviteMemberNonDirectionLinkFragment aVar2 = this.f102623i;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linkFragment");
        }
        aVar2.mo146374b().mo146378a(z);
    }

    /* renamed from: f */
    public static void m160031f(InviteMemberNonDirectionalActivity inviteMemberNonDirectionalActivity) {
        inviteMemberNonDirectionalActivity.mo146351d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InviteMemberNonDirectionalActivity inviteMemberNonDirectionalActivity2 = inviteMemberNonDirectionalActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inviteMemberNonDirectionalActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.InviteMemberNonDirectionalActivity$d */
    public static final class View$OnClickListenerC40399d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberNonDirectionalActivity f102629a;

        View$OnClickListenerC40399d(InviteMemberNonDirectionalActivity inviteMemberNonDirectionalActivity) {
            this.f102629a = inviteMemberNonDirectionalActivity;
        }

        public final void onClick(View view) {
            InviteMemberNonDirectionalActivity inviteMemberNonDirectionalActivity = this.f102629a;
            String str = "qr_code";
            if (Intrinsics.areEqual(str, InviteMemberNonDirectionalActivity.m160027c(inviteMemberNonDirectionalActivity))) {
                str = "link";
            }
            inviteMemberNonDirectionalActivity.f102618c = str;
            this.f102629a.mo146343a();
            NoSlideViewPager noSlideViewPager = (NoSlideViewPager) this.f102629a.mo146342a(R.id.imndVp);
            Intrinsics.checkExpressionValueIsNotNull(noSlideViewPager, "imndVp");
            noSlideViewPager.setCurrentItem(!Intrinsics.areEqual(InviteMemberNonDirectionalActivity.m160028d(this.f102629a), InviteMemberNonDirectionalActivity.m160027c(this.f102629a)) ? 1 : 0);
            InvHitPoint.m160401p(InviteMemberNonDirectionalActivity.m160022a(this.f102629a));
        }
    }

    /* renamed from: a */
    public final void mo146347a(boolean z) {
        if (z) {
            m160026b(true);
        }
        C40338c a = C40338c.m159892a();
        String str = this.f102621g;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("departments");
        }
        a.mo146228a(z, str, new C40397b(this, z));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.InviteMemberNonDirectionalActivity$g */
    public static final class DialogInterface$OnClickListenerC40402g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberNonDirectionalActivity f102632a;

        DialogInterface$OnClickListenerC40402g(InviteMemberNonDirectionalActivity inviteMemberNonDirectionalActivity) {
            this.f102632a = inviteMemberNonDirectionalActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Intrinsics.checkParameterIsNotNull(dialogInterface, "dialog");
            dialogInterface.dismiss();
            InvHitPoint.m160405r(InviteMemberNonDirectionalActivity.m160022a(this.f102632a));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.InviteMemberNonDirectionalActivity$h */
    public static final class DialogInterface$OnClickListenerC40403h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberNonDirectionalActivity f102633a;

        DialogInterface$OnClickListenerC40403h(InviteMemberNonDirectionalActivity inviteMemberNonDirectionalActivity) {
            this.f102633a = inviteMemberNonDirectionalActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Intrinsics.checkParameterIsNotNull(dialogInterface, "dialog");
            dialogInterface.dismiss();
            this.f102633a.mo146347a(true);
            InvHitPoint.m160403q(InviteMemberNonDirectionalActivity.m160022a(this.f102633a));
        }
    }

    /* renamed from: a */
    public static void m160024a(InviteMemberNonDirectionalActivity inviteMemberNonDirectionalActivity, Context context) {
        inviteMemberNonDirectionalActivity.mo146344a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteMemberNonDirectionalActivity);
        }
    }

    /* renamed from: a */
    public static Context m160021a(InviteMemberNonDirectionalActivity inviteMemberNonDirectionalActivity, Configuration configuration) {
        Context a = inviteMemberNonDirectionalActivity.mo146341a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public final void mo146345a(MemberInvitationInfo memberInvitationInfo, boolean z) {
        if (!this.f102624j) {
            m160034h();
            this.f102624j = true;
        }
        if (z) {
            m160026b(false);
        } else {
            ViewUtils.C57757c cVar = this.f102619d;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadingDialog");
            }
            cVar.mo196042e();
            NoSlideViewPager noSlideViewPager = (NoSlideViewPager) mo146342a(R.id.imndVp);
            Intrinsics.checkExpressionValueIsNotNull(noSlideViewPager, "imndVp");
            noSlideViewPager.setVisibility(0);
        }
        InviteMemberNonDirectionQrCodeFragment aVar = this.f102622h;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("qrCodeFragment");
        }
        aVar.mo146397b().mo146401a(memberInvitationInfo, z);
        InviteMemberNonDirectionLinkFragment aVar2 = this.f102623i;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linkFragment");
        }
        aVar2.mo146374b().mo146377a(memberInvitationInfo, z);
    }

    /* renamed from: a */
    public final void mo146346a(String str, boolean z) {
        if (z) {
            m160026b(false);
        } else {
            ViewUtils.C57757c cVar = this.f102619d;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadingDialog");
            }
            cVar.mo196042e();
        }
        ((InvErrorView) mo146342a(R.id.imndErrorView)).mo145639a(str);
        View$OnClickListenerC40404i iVar = null;
        if (!Intrinsics.areEqual(UIHelper.getString(R.string.Lark_UserGrowth_InviteMemberPermissionDeny), str)) {
            iVar = new View$OnClickListenerC40404i(this);
        }
        ((InvErrorView) mo146342a(R.id.imndErrorView)).setOnClickListener(iVar);
    }
}
