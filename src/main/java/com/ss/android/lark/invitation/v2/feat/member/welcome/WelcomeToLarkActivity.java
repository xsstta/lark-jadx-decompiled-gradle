package com.ss.android.lark.invitation.v2.feat.member.welcome;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.component.universe_design.toast.UDToastImpl;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.framework.utils.al;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.inv.export.api.InvitationApi;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.inv.export.ui.InvBaseFragmentActivity;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.member.guide.InviteMemberGuideActivity;
import com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b;
import com.ss.android.lark.invitation.v2.feat.member.welcome.dto.GroupScale;
import com.ss.android.lark.invitation.v2.feat.member.welcome.dto.IndustryInfo;
import com.ss.android.lark.invitation.v2.feat.member.welcome.util.JSONAssetParser;
import com.ss.android.lark.invitation.v2.statistic.InvHitPointNew;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 32\u00020\u0001:\u00013B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0013H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0002J\b\u0010\u001c\u001a\u00020\u0011H\u0002J\b\u0010\u001d\u001a\u00020\u0011H\u0002J\b\u0010\u001e\u001a\u00020\u0011H\u0002J\b\u0010\u001f\u001a\u00020\u0011H\u0002J\b\u0010 \u001a\u00020\u0011H\u0002J\b\u0010!\u001a\u00020\u0011H\u0002J\b\u0010\"\u001a\u00020\u0011H\u0016J\u0012\u0010#\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\b\u0010&\u001a\u00020\u0011H\u0002J\b\u0010'\u001a\u00020\u0011H\u0002J\b\u0010(\u001a\u00020\u0011H\u0002J$\u0010)\u001a\u00020\u00112\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020\u0011H\u0002J\b\u00101\u001a\u00020\u0011H\u0002J\b\u00102\u001a\u00020\u0011H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/welcome/WelcomeToLarkActivity;", "Lcom/ss/android/lark/inv/export/ui/InvBaseFragmentActivity;", "()V", "groupScaleCode", "", "groupScaleList", "", "Lcom/ss/android/lark/invitation/v2/feat/member/welcome/dto/GroupScale;", "groupScalePicker", "Lcom/ss/android/lark/invitation/v2/feat/member/welcome/MultiItemPicker;", "industryCode", "industryList", "Lcom/ss/android/lark/invitation/v2/feat/member/welcome/dto/IndustryInfo;", "industryPicker", "loadingToast", "Lcom/larksuite/component/universe_design/toast/UDToastImpl;", "doDividerBgTransAnimator", "", "dividerView", "Landroid/view/View;", "hasFocus", "", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "hideKeyboard", "v", "initBlankView", "initEditText", "initHintText", "initMultiItemPickers", "initNextStepButton", "initTitle", "initTitleBar", "initView", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPickGroupScaleClick", "onPickIndustryClick", "refreshNextBtnStatus", "setStroken", "context", "Landroid/content/Context;", "gd", "Landroid/graphics/drawable/GradientDrawable;", "currentColor", "", "showGroupScaleActionPanel", "showHintDialog", "showIndustryActionPanel", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class WelcomeToLarkActivity extends InvBaseFragmentActivity {

    /* renamed from: f */
    public static final Companion f102849f = new Companion(null);

    /* renamed from: i */
    private static final int f102850i = Color.parseColor("#E6E8EB");

    /* renamed from: j */
    private static final int f102851j = Color.parseColor("#3377FF");

    /* renamed from: a */
    public UDToastImpl f102852a;

    /* renamed from: b */
    public List<? extends IndustryInfo> f102853b;

    /* renamed from: c */
    public String f102854c;

    /* renamed from: d */
    public List<? extends GroupScale> f102855d;

    /* renamed from: e */
    public String f102856e;

    /* renamed from: g */
    private C40516b<?> f102857g;

    /* renamed from: h */
    private C40516b<?> f102858h;

    /* renamed from: k */
    private HashMap f102859k;

    @JvmStatic
    /* renamed from: a */
    public static final void m160238a(Context context, String str, Bundle bundle) {
        f102849f.mo146554a(context, str, bundle);
    }

    /* renamed from: a */
    public Context mo146535a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public View mo146536a(int i) {
        if (this.f102859k == null) {
            this.f102859k = new HashMap();
        }
        View view = (View) this.f102859k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f102859k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo146538a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m160240a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m160236a(this, configuration);
    }

    /* renamed from: g */
    public Resources mo146546g() {
        return super.getResources();
    }

    public AssetManager getAssets() {
        return m160242c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m160237a(this);
    }

    /* renamed from: h */
    public void mo146548h() {
        super.onStop();
    }

    /* renamed from: i */
    public AssetManager mo146550i() {
        return super.getAssets();
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m160241b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0015\u001a\u00020\u000fJ&\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/welcome/WelcomeToLarkActivity$Companion;", "", "()V", "ANIMATION_DURATION", "", "FOCUSED_COLOR", "", "LOG_TAG", "", "MINE_TEA_PATH", "OPEN_JOIN_WAY_KEY", "TOAST_MAX_DURATION", "UNFOCUSED_COLOR", "UPGRADE_TO_TEAM_DELAY", "goInviteMemberGuideActivity", "", "context", "Landroid/content/Context;", "bundle", "Landroid/os/Bundle;", "goInviteTenantJoinWayPage", "reportStrongGuide", "start", "from", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.WelcomeToLarkActivity$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo146551a() {
            InvitationApi c = C40147z.m159163c();
            Intrinsics.checkExpressionValueIsNotNull(c, "InvUtils.getModule()");
            c.getDependency().bizReport(CollectionsKt.listOf("new_user_create_team_strong_guide"));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/invitation/v2/feat/member/welcome/WelcomeToLarkActivity$Companion$goInviteTenantJoinWayPage$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.WelcomeToLarkActivity$a$a */
        public static final class C40493a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ Context f102860a;

            C40493a(Context context) {
                this.f102860a = context;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165389i("EnterOrgNameActivity", errorResult.getDebugMsg());
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (Intrinsics.areEqual((Object) bool, (Object) false)) {
                    UDToast.show(this.f102860a, (int) R.string.Lark_Legacy_ErrorMessageTip);
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo146552a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            mo146551a();
            al.m95028a().mo93366a("OPEN_JOIN_WAY", true);
            InvitationApi c = C40147z.m159163c();
            Intrinsics.checkExpressionValueIsNotNull(c, "InvUtils.getModule()");
            IInvitationModuleDependency dependency = c.getDependency();
            Intrinsics.checkExpressionValueIsNotNull(dependency, "InvUtils.getModule().dependency");
            dependency.getLoginDependency().mo145584a(context, "mine", new C40493a(context));
            InvHitPointNew.f102936a.mo146631a(InvHitPointNew.OnboardingTeamCreateJoinGuideClickParam.MOBILE_JOINTEAM);
        }

        /* renamed from: a */
        public final void mo146553a(Context context, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            InviteMemberGuideActivity.f102546a.mo146290a(context, null, bundle);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo146554a(Context context, String str, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            if (C40147z.m159165e()) {
                mo146553a(context, bundle);
                return;
            }
            Intent intent = new Intent(context, WelcomeToLarkActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtra("from_scenes", str);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            context.startActivity(intent);
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/invitation/v2/feat/member/welcome/WelcomeToLarkActivity$showGroupScaleActionPanel$1", "Lcom/ss/android/lark/invitation/v2/feat/member/welcome/MultiItemPicker$PickItemListener;", "onDismiss", "", "pick", "item", "", "Lcom/ss/android/lark/invitation/v2/feat/member/welcome/MultiItemPicker$IPickerData;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.WelcomeToLarkActivity$o */
    public static final class C40509o implements C40516b.AbstractC40525d {

        /* renamed from: a */
        final /* synthetic */ WelcomeToLarkActivity f102877a;

        @Override // com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b.AbstractC40525d
        /* renamed from: a */
        public void mo146572a() {
            ((CommonPickInput) this.f102877a.mo146536a(R.id.pickGroupScale)).mo146529a(false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40509o(WelcomeToLarkActivity welcomeToLarkActivity) {
            this.f102877a = welcomeToLarkActivity;
        }

        @Override // com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b.AbstractC40525d
        /* renamed from: a */
        public void mo146573a(List<C40516b.AbstractC40523b> list) {
            C40516b.AbstractC40523b bVar;
            if (list != null && (bVar = (C40516b.AbstractC40523b) CollectionsKt.firstOrNull((List) list)) != null) {
                this.f102877a.f102856e = bVar.getKey();
                ((CommonPickInput) this.f102877a.mo146536a(R.id.pickGroupScale)).setInputText(bVar.getContent());
                this.f102877a.mo146544e();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/invitation/v2/feat/member/welcome/WelcomeToLarkActivity$showIndustryActionPanel$1", "Lcom/ss/android/lark/invitation/v2/feat/member/welcome/MultiItemPicker$PickItemListener;", "onDismiss", "", "pick", "item", "", "Lcom/ss/android/lark/invitation/v2/feat/member/welcome/MultiItemPicker$IPickerData;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.WelcomeToLarkActivity$r */
    public static final class C40512r implements C40516b.AbstractC40525d {

        /* renamed from: a */
        final /* synthetic */ WelcomeToLarkActivity f102880a;

        @Override // com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b.AbstractC40525d
        /* renamed from: a */
        public void mo146572a() {
            ((CommonPickInput) this.f102880a.mo146536a(R.id.pickIndustry)).mo146529a(false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40512r(WelcomeToLarkActivity welcomeToLarkActivity) {
            this.f102880a = welcomeToLarkActivity;
        }

        @Override // com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b.AbstractC40525d
        /* renamed from: a */
        public void mo146573a(List<C40516b.AbstractC40523b> list) {
            boolean z;
            String str;
            List<C40516b.AbstractC40523b> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z && list.size() >= 2) {
                C40516b.AbstractC40523b bVar = list.get(0);
                C40516b.AbstractC40523b bVar2 = list.get(1);
                WelcomeToLarkActivity welcomeToLarkActivity = this.f102880a;
                if (Intrinsics.areEqual(bVar.getKey(), bVar2.getKey())) {
                    str = bVar.getKey();
                } else {
                    str = bVar.getKey() + '-' + bVar2.getKey();
                }
                welcomeToLarkActivity.f102854c = str;
                ((CommonPickInput) this.f102880a.mo146536a(R.id.pickIndustry)).setInputText(bVar2.getContent());
                this.f102880a.mo146544e();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/invitation/v2/feat/member/welcome/dto/GroupScale;", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.WelcomeToLarkActivity$k */
    public static final class C40505k<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ WelcomeToLarkActivity f102873a;

        C40505k(WelcomeToLarkActivity welcomeToLarkActivity) {
            this.f102873a = welcomeToLarkActivity;
        }

        /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.List<? extends com.ss.android.lark.invitation.v2.feat.member.welcome.dto.GroupScale>, java.util.List<com.ss.android.lark.invitation.v2.feat.member.welcome.dto.GroupScale> */
        /* renamed from: a */
        public final List<GroupScale> produce() {
            List list = this.f102873a.f102855d;
            if (list != null) {
                return list;
            }
            WelcomeToLarkActivity welcomeToLarkActivity = this.f102873a;
            List<GroupScale> b = JSONAssetParser.m160294b();
            welcomeToLarkActivity.f102855d = b;
            return b;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/invitation/v2/feat/member/welcome/dto/IndustryInfo;", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.WelcomeToLarkActivity$m */
    public static final class C40507m<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ WelcomeToLarkActivity f102875a;

        C40507m(WelcomeToLarkActivity welcomeToLarkActivity) {
            this.f102875a = welcomeToLarkActivity;
        }

        /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.List<? extends com.ss.android.lark.invitation.v2.feat.member.welcome.dto.IndustryInfo>, java.util.List<com.ss.android.lark.invitation.v2.feat.member.welcome.dto.IndustryInfo> */
        /* renamed from: a */
        public final List<IndustryInfo> produce() {
            List list = this.f102875a.f102853b;
            if (list != null) {
                return list;
            }
            WelcomeToLarkActivity welcomeToLarkActivity = this.f102875a;
            List<IndustryInfo> a = JSONAssetParser.m160293a();
            welcomeToLarkActivity.f102853b = a;
            return a;
        }
    }

    /* renamed from: j */
    private final void m160243j() {
        m160244k();
        m160245l();
        m160246m();
        m160247n();
        m160248o();
        m160249p();
        m160250q();
    }

    /* renamed from: o */
    private final void m160248o() {
        ((UDButton) mo146536a(R.id.nextStepBtn)).setOnClickListener(new View$OnClickListenerC40501i(this));
    }

    /* renamed from: p */
    private final void m160249p() {
        mo146536a(R.id.blankView).setOnTouchListener(new View$OnTouchListenerC40495c(this));
    }

    /* renamed from: b */
    public final void mo146540b() {
        C57865c.m224574a(new C40505k(this), new C40506l(this));
    }

    /* renamed from: k */
    private final void m160244k() {
        ((CommonTitleBar) mo146536a(R.id.titleBar)).setLeftVisible(false);
        ((CommonTitleBar) mo146536a(R.id.titleBar)).addAction(new C40504j(this, UIHelper.getString(R.string.Lark_Guide_TeamCreate1Later)));
    }

    /* renamed from: l */
    private final void m160245l() {
        String str;
        TextView textView = (TextView) mo146536a(R.id.welcomeTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView, "welcomeTitle");
        IInvitationModuleDependency a = C40147z.m159160a();
        Intrinsics.checkExpressionValueIsNotNull(a, "InvUtils.getDep()");
        boolean isLarkEnv = a.isLarkEnv();
        if (isLarkEnv) {
            IInvitationModuleDependency a2 = C40147z.m159160a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "InvUtils.getDep()");
            IInvitationModuleDependency.AbstractC40087c loginDependency = a2.getLoginDependency();
            Intrinsics.checkExpressionValueIsNotNull(loginDependency, "InvUtils.getDep().loginDependency");
            str = UIHelper.mustacheFormat((int) R.string.Lark_Guide_TeamCreate1TitleLark, "USER_NAME", loginDependency.mo145586b());
        } else if (!isLarkEnv) {
            str = UIHelper.mustacheFormat((int) R.string.Lark_Guide_TeamCreate1TitleFeishu, "APP_DISPLAY_NAME", UIHelper.getString(R.string.Lark_App_Name));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        textView.setText(str);
    }

    /* renamed from: m */
    private final void m160246m() {
        String str;
        EditText editText = (EditText) mo146536a(R.id.orgNameEt);
        Intrinsics.checkExpressionValueIsNotNull(editText, "orgNameEt");
        IInvitationModuleDependency a = C40147z.m159160a();
        Intrinsics.checkExpressionValueIsNotNull(a, "InvUtils.getDep()");
        if (a.isLarkEnv()) {
            str = UIHelper.getString(R.string.Lark_Guide_TeamCreate1HintLark);
        } else {
            str = UIHelper.mustacheFormat((int) R.string.Lark_Guide_TeamCreate1HintExample, "APP_DISPLAY_NAME", UIHelper.getString(R.string.Lark_App_Name));
        }
        editText.setHint(str);
        ((EditText) mo146536a(R.id.orgNameEt)).addTextChangedListener(new C40496d(this));
    }

    /* renamed from: n */
    private final void m160247n() {
        TextView textView = (TextView) mo146536a(R.id.joinLarkTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "joinLarkTv");
        textView.setText(UIHelper.mustacheFormat((int) R.string.Lark_Guide_TeamCreate1HaveCodeQuestion, "APP_DISPLAY_NAME", UIHelper.getString(R.string.Lark_App_Name)));
        ((ImageView) mo146536a(R.id.joinWayIv)).setOnClickListener(new View$OnClickListenerC40497e(this));
        ((TextView) mo146536a(R.id.joinWayTv)).setOnClickListener(new View$OnClickListenerC40498f(this));
    }

    /* renamed from: d */
    public final void mo146543d() {
        ((EditText) mo146536a(R.id.orgNameEt)).clearFocus();
        KeyboardUtils.hideKeyboard(this, (EditText) mo146536a(R.id.orgNameEt));
        CommonPickInput commonPickInput = (CommonPickInput) mo146536a(R.id.pickGroupScale);
        Intrinsics.checkExpressionValueIsNotNull(commonPickInput, "pickGroupScale");
        m160239a((View) commonPickInput, true);
        List<String> listOf = CollectionsKt.listOf(UIHelper.getString(R.string.Lark_Passport_TeamInfoScaleDropdownTab));
        if (this.f102858h == null) {
            this.f102858h = new C40516b.C40522a().mo146604a(this).mo146608b(listOf).mo146606a((List<C40516b.AbstractC40523b>) this.f102855d).mo146605a(new C40509o(this)).mo146607a();
        }
        ((CommonPickInput) mo146536a(R.id.pickGroupScale)).mo146529a(true);
        C40516b<?> bVar = this.f102858h;
        if (bVar != null) {
            bVar.mo146593a((UDButton) mo146536a(R.id.nextStepBtn));
        }
    }

    /* renamed from: f */
    public final void mo146545f() {
        new C25639g(this).mo89237b(UIHelper.getString(R.string.Lark_Guide_WebPopUpNotice)).mo89242c(UIHelper.mustacheFormat((int) R.string.Lark_Guide_TeamCreateLaterNoticeContent, "APP_DISPLAY_NAME", UIHelper.getString(R.string.Lark_App_Name))).mo89238b(true).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, DialogInterface$OnClickListenerC40510p.f102878a).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_Next, new DialogInterface$OnClickListenerC40511q(this)).mo89239c();
        InvHitPointNew.f102936a.mo146633b();
    }

    /* renamed from: q */
    private final void m160250q() {
        int i;
        CommonPickInput commonPickInput = (CommonPickInput) mo146536a(R.id.pickIndustry);
        Intrinsics.checkExpressionValueIsNotNull(commonPickInput, "pickIndustry");
        IInvitationModuleDependency a = C40147z.m159160a();
        Intrinsics.checkExpressionValueIsNotNull(a, "InvUtils.getDep()");
        int i2 = 0;
        if (a.isLarkEnv()) {
            i = 0;
        } else {
            i = 8;
        }
        commonPickInput.setVisibility(i);
        ((CommonPickInput) mo146536a(R.id.pickIndustry)).setInputHint(UIHelper.getString(R.string.Lark_Passport_TeamInfoIndustryDropdown));
        ((CommonPickInput) mo146536a(R.id.pickIndustry)).setOnClickListener(new View$OnClickListenerC40499g(this));
        CommonPickInput commonPickInput2 = (CommonPickInput) mo146536a(R.id.pickGroupScale);
        Intrinsics.checkExpressionValueIsNotNull(commonPickInput2, "pickGroupScale");
        IInvitationModuleDependency a2 = C40147z.m159160a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "InvUtils.getDep()");
        if (!a2.isLarkEnv()) {
            i2 = 8;
        }
        commonPickInput2.setVisibility(i2);
        ((CommonPickInput) mo146536a(R.id.pickGroupScale)).setInputHint(UIHelper.getString(R.string.Lark_Passport_TeamInfoScaleDropdown));
        ((CommonPickInput) mo146536a(R.id.pickGroupScale)).setOnClickListener(new View$OnClickListenerC40500h(this));
    }

    /* renamed from: c */
    public final void mo146541c() {
        ((EditText) mo146536a(R.id.orgNameEt)).clearFocus();
        KeyboardUtils.hideKeyboard(this, (EditText) mo146536a(R.id.orgNameEt));
        CommonPickInput commonPickInput = (CommonPickInput) mo146536a(R.id.pickIndustry);
        Intrinsics.checkExpressionValueIsNotNull(commonPickInput, "pickIndustry");
        m160239a((View) commonPickInput, true);
        List<String> listOf = CollectionsKt.listOf((Object[]) new String[]{UIHelper.getString(R.string.Lark_Passport_TeamInfoMainIndustryDropdownTab), UIHelper.getString(R.string.Lark_Passport_TeamInfoSubIndustryDropdownTab)});
        if (this.f102857g == null) {
            this.f102857g = new C40516b.C40522a().mo146604a(this).mo146608b(listOf).mo146606a((List<C40516b.AbstractC40523b>) this.f102853b).mo146605a(new C40512r(this)).mo146607a();
        }
        ((CommonPickInput) mo146536a(R.id.pickIndustry)).mo146529a(true);
        C40516b<?> bVar = this.f102857g;
        if (bVar != null) {
            bVar.mo146593a((UDButton) mo146536a(R.id.nextStepBtn));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a3, code lost:
        if (r1 != false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00cb, code lost:
        if (r1.length() > 0) goto L_0x00a5;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo146544e() {
        /*
        // Method dump skipped, instructions count: 216
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.invitation.v2.feat.member.welcome.WelcomeToLarkActivity.mo146544e():void");
    }

    /* renamed from: a */
    public final void mo146537a() {
        C57865c.m224574a(new C40507m(this), new C40508n(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/invitation/v2/feat/member/welcome/WelcomeToLarkActivity$initEditText$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.WelcomeToLarkActivity$d */
    public static final class C40496d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ WelcomeToLarkActivity f102864a;

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40496d(WelcomeToLarkActivity welcomeToLarkActivity) {
            this.f102864a = welcomeToLarkActivity;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f102864a.mo146544e();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.WelcomeToLarkActivity$g */
    public static final class View$OnClickListenerC40499g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WelcomeToLarkActivity f102867a;

        View$OnClickListenerC40499g(WelcomeToLarkActivity welcomeToLarkActivity) {
            this.f102867a = welcomeToLarkActivity;
        }

        public final void onClick(View view) {
            this.f102867a.mo146537a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.WelcomeToLarkActivity$h */
    public static final class View$OnClickListenerC40500h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WelcomeToLarkActivity f102868a;

        View$OnClickListenerC40500h(WelcomeToLarkActivity welcomeToLarkActivity) {
            this.f102868a = welcomeToLarkActivity;
        }

        public final void onClick(View view) {
            this.f102868a.mo146540b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/invitation/v2/feat/member/welcome/dto/GroupScale;", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.WelcomeToLarkActivity$l */
    public static final class C40506l<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ WelcomeToLarkActivity f102874a;

        C40506l(WelcomeToLarkActivity welcomeToLarkActivity) {
            this.f102874a = welcomeToLarkActivity;
        }

        /* renamed from: a */
        public final void consume(List<? extends GroupScale> list) {
            this.f102874a.mo146543d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/invitation/v2/feat/member/welcome/dto/IndustryInfo;", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.WelcomeToLarkActivity$n */
    public static final class C40508n<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ WelcomeToLarkActivity f102876a;

        C40508n(WelcomeToLarkActivity welcomeToLarkActivity) {
            this.f102876a = welcomeToLarkActivity;
        }

        /* renamed from: a */
        public final void consume(List<? extends IndustryInfo> list) {
            this.f102876a.mo146541c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.WelcomeToLarkActivity$e */
    public static final class View$OnClickListenerC40497e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WelcomeToLarkActivity f102865a;

        View$OnClickListenerC40497e(WelcomeToLarkActivity welcomeToLarkActivity) {
            this.f102865a = welcomeToLarkActivity;
        }

        public final void onClick(View view) {
            WelcomeToLarkActivity.f102849f.mo146552a(this.f102865a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.WelcomeToLarkActivity$f */
    public static final class View$OnClickListenerC40498f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WelcomeToLarkActivity f102866a;

        View$OnClickListenerC40498f(WelcomeToLarkActivity welcomeToLarkActivity) {
            this.f102866a = welcomeToLarkActivity;
        }

        public final void onClick(View view) {
            WelcomeToLarkActivity.f102849f.mo146552a(this.f102866a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/invitation/v2/feat/member/welcome/WelcomeToLarkActivity$initTitleBar$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.WelcomeToLarkActivity$j */
    public static final class C40504j extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ WelcomeToLarkActivity f102872a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            this.f102872a.mo146545f();
            WelcomeToLarkActivity.f102849f.mo146551a();
            InvHitPointNew.f102936a.mo146631a(InvHitPointNew.OnboardingTeamCreateJoinGuideClickParam.SKIP);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40504j(WelcomeToLarkActivity welcomeToLarkActivity, String str) {
            super(str);
            this.f102872a = welcomeToLarkActivity;
        }
    }

    /* renamed from: a */
    public static Resources m160237a(WelcomeToLarkActivity welcomeToLarkActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(welcomeToLarkActivity);
        }
        return welcomeToLarkActivity.mo146546g();
    }

    /* renamed from: c */
    public static AssetManager m160242c(WelcomeToLarkActivity welcomeToLarkActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(welcomeToLarkActivity);
        }
        return welcomeToLarkActivity.mo146550i();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.WelcomeToLarkActivity$b */
    public static final class C40494b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ WelcomeToLarkActivity f102861a;

        /* renamed from: b */
        final /* synthetic */ Drawable f102862b;

        C40494b(WelcomeToLarkActivity welcomeToLarkActivity, Drawable drawable) {
            this.f102861a = welcomeToLarkActivity;
            this.f102862b = drawable;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                WelcomeToLarkActivity welcomeToLarkActivity = this.f102861a;
                welcomeToLarkActivity.mo146539a(welcomeToLarkActivity, (GradientDrawable) this.f102862b, intValue);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: b */
    public static void m160241b(WelcomeToLarkActivity welcomeToLarkActivity) {
        welcomeToLarkActivity.mo146548h();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            WelcomeToLarkActivity welcomeToLarkActivity2 = welcomeToLarkActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    welcomeToLarkActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void hideKeyboard(View view) {
        ((EditText) mo146536a(R.id.orgNameEt)).clearFocus();
        Object systemService = view.getContext().getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(R.layout.inv_enter_org_name_activity);
        InvHitPointNew.f102936a.mo146629a();
        Window window = getWindow();
        IInvitationModuleDependency a = C40147z.m159160a();
        Intrinsics.checkExpressionValueIsNotNull(a, "InvUtils.getDep()");
        if (a.isLarkEnv()) {
            i = 2;
        } else {
            i = 16;
        }
        window.setSoftInputMode(i);
        m160243j();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.WelcomeToLarkActivity$i */
    public static final class View$OnClickListenerC40501i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WelcomeToLarkActivity f102869a;

        View$OnClickListenerC40501i(WelcomeToLarkActivity welcomeToLarkActivity) {
            this.f102869a = welcomeToLarkActivity;
        }

        public final void onClick(View view) {
            WelcomeToLarkActivity welcomeToLarkActivity = this.f102869a;
            Intrinsics.checkExpressionValueIsNotNull(view, "v");
            welcomeToLarkActivity.hideKeyboard(view);
            WelcomeToLarkActivity welcomeToLarkActivity2 = this.f102869a;
            UDToast.Builder a = UDToast.build(welcomeToLarkActivity2).mo91637a(R.string.Lark_Legacy_LoadingWait);
            CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(this.f102869a);
            circularProgressDrawable.mo7698a(1);
            circularProgressDrawable.mo7701a(UDColorUtils.getColor(this.f102869a, R.color.static_white));
            circularProgressDrawable.mo7699a(Paint.Cap.ROUND);
            welcomeToLarkActivity2.f102852a = a.mo91641a(circularProgressDrawable).mo91640a(10000L).mo91655j();
            UDToastImpl dVar = this.f102869a.f102852a;
            if (dVar != null) {
                dVar.show();
            }
            InvitationApi c = C40147z.m159163c();
            Intrinsics.checkExpressionValueIsNotNull(c, "InvUtils.getModule()");
            IInvitationModuleDependency dependency = c.getDependency();
            Intrinsics.checkExpressionValueIsNotNull(dependency, "InvUtils.getModule().dependency");
            IInvitationModuleDependency.AbstractC40087c loginDependency = dependency.getLoginDependency();
            EditText editText = (EditText) this.f102869a.mo146536a(R.id.orgNameEt);
            Intrinsics.checkExpressionValueIsNotNull(editText, "orgNameEt");
            loginDependency.mo145585a(editText.getText().toString(), this.f102869a.f102854c, this.f102869a.f102856e, new IGetDataCallback<Boolean>(this) {
                /* class com.ss.android.lark.invitation.v2.feat.member.welcome.WelcomeToLarkActivity.View$OnClickListenerC40501i.C405021 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC40501i f102870a;

                /* access modifiers changed from: package-private */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.WelcomeToLarkActivity$i$1$a */
                public static final class RunnableC40503a implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ C405021 f102871a;

                    RunnableC40503a(C405021 r1) {
                        this.f102871a = r1;
                    }

                    public final void run() {
                        Intent intent = this.f102871a.f102870a.f102869a.getIntent();
                        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
                        WelcomeToLarkActivity.f102849f.mo146553a(this.f102871a.f102870a.f102869a, intent.getExtras());
                        UDToastImpl dVar = this.f102871a.f102870a.f102869a.f102852a;
                        if (dVar != null) {
                            dVar.cancel();
                        }
                        this.f102871a.f102870a.f102869a.f102852a = null;
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f102870a = r1;
                }

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC40503a(this), 500);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    WelcomeToLarkActivity welcomeToLarkActivity = this.f102870a.f102869a;
                    String displayMsg = errorResult.getDisplayMsg();
                    if (displayMsg == null) {
                        displayMsg = UIHelper.getString(R.string.Lark_Legacy_ErrorMessageTip);
                        Intrinsics.checkExpressionValueIsNotNull(displayMsg, "UIHelper.getString(R.str…k_Legacy_ErrorMessageTip)");
                    }
                    UDToast.show(welcomeToLarkActivity, displayMsg);
                    UDToastImpl dVar = this.f102870a.f102869a.f102852a;
                    if (dVar != null) {
                        dVar.cancel();
                    }
                    this.f102870a.f102869a.f102852a = null;
                }
            });
            InvHitPointNew.f102936a.mo146631a(InvHitPointNew.OnboardingTeamCreateJoinGuideClickParam.CREATETEAM);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.WelcomeToLarkActivity$p */
    public static final class DialogInterface$OnClickListenerC40510p implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC40510p f102878a = new DialogInterface$OnClickListenerC40510p();

        DialogInterface$OnClickListenerC40510p() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            InvHitPointNew.f102936a.mo146632a(InvHitPointNew.OnboardingTeamCreateJoinGuideSkipClickParam.REMOVE);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.WelcomeToLarkActivity$c */
    public static final class View$OnTouchListenerC40495c implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ WelcomeToLarkActivity f102863a;

        View$OnTouchListenerC40495c(WelcomeToLarkActivity welcomeToLarkActivity) {
            this.f102863a = welcomeToLarkActivity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            WelcomeToLarkActivity welcomeToLarkActivity = this.f102863a;
            Intrinsics.checkExpressionValueIsNotNull(view, "v");
            welcomeToLarkActivity.hideKeyboard(view);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.WelcomeToLarkActivity$q */
    public static final class DialogInterface$OnClickListenerC40511q implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WelcomeToLarkActivity f102879a;

        DialogInterface$OnClickListenerC40511q(WelcomeToLarkActivity welcomeToLarkActivity) {
            this.f102879a = welcomeToLarkActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f102879a.finish();
            InvHitPointNew.f102936a.mo146632a(InvHitPointNew.OnboardingTeamCreateJoinGuideSkipClickParam.NEXT);
        }
    }

    /* renamed from: a */
    public static void m160240a(WelcomeToLarkActivity welcomeToLarkActivity, Context context) {
        welcomeToLarkActivity.mo146538a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(welcomeToLarkActivity);
        }
    }

    /* renamed from: a */
    public static Context m160236a(WelcomeToLarkActivity welcomeToLarkActivity, Configuration configuration) {
        Context a = welcomeToLarkActivity.mo146535a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    private final void m160239a(View view, boolean z) {
        int i;
        int i2;
        if (z) {
            i = f102850i;
        } else {
            i = f102851j;
        }
        if (z) {
            i2 = f102851j;
        } else {
            i2 = f102850i;
        }
        Drawable background = view.getBackground();
        if (background != null && (background instanceof GradientDrawable)) {
            ValueAnimator duration = ValueAnimator.ofInt(i, i2).setDuration(300L);
            duration.addUpdateListener(new C40494b(this, background));
            Intrinsics.checkExpressionValueIsNotNull(duration, "valueAnimator");
            duration.setInterpolator(PathInterpolatorCompat.create(0.32f, 0.94f, 0.6f, 1.0f));
            duration.setEvaluator(new ArgbEvaluator());
            duration.start();
        }
    }

    /* renamed from: a */
    public final void mo146539a(Context context, GradientDrawable gradientDrawable, int i) {
        if (gradientDrawable != null) {
            gradientDrawable.setStroke(UIUtils.dp2px(context, 1.0f), i);
        }
    }
}
