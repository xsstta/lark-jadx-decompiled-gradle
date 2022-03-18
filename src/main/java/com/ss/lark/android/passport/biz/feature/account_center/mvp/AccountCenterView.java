package com.ss.lark.android.passport.biz.feature.account_center.mvp;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.request.p095a.AbstractC2513c;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bumptech.glide.request.p096b.AbstractC2529b;
import com.larksuite.suite.R;
import com.ss.android.bytedcert.utils.C28441g;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.base.network.C49070b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49226y;
import com.ss.android.lark.passport.infra.widget.CommonTitleBar;
import com.ss.android.lark.passport.signinsdk_api.account.Tenant;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.UIHelper;
import com.ss.lark.android.passport.biz.entity.UserItem;
import com.ss.lark.android.passport.biz.feature.account_center.AccountCenterStatisticsHelper;
import com.ss.lark.android.passport.biz.feature.account_center.UserOperationCenterInfo;
import com.ss.lark.android.passport.biz.feature.account_center.mvp.IAccountCenterContract;
import com.ss.lark.android.passport.biz.widget.AccountCenterButtonItemView;
import com.ss.lark.android.passport.biz.widget.AccountCenterTeamItemView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.C69364ai;
import kotlinx.coroutines.C69389f;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.cr;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020:H\u0016J\u001e\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=2\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=H\u0002J\u001d\u0010@\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010\bH@ø\u0001\u0000¢\u0006\u0002\u0010CJ\n\u0010D\u001a\u0004\u0018\u00010EH\u0016J\b\u0010F\u001a\u00020:H\u0016J\b\u0010G\u001a\u00020:H\u0002J\u001c\u0010H\u001a\b\u0012\u0004\u0012\u00020>0=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=H\u0002J\u0012\u0010I\u001a\u00020:2\b\u0010J\u001a\u0004\u0018\u00010EH\u0016J\u0012\u0010K\u001a\u00020:2\b\u0010L\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010M\u001a\u00020:2\b\u0010N\u001a\u0004\u0018\u00010OH\u0002J\b\u0010P\u001a\u00020:H\u0016J$\u0010Q\u001a\u00020:2\u001a\u0010R\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0T\u0018\u00010SH\u0002J\b\u0010V\u001a\u00020:H\u0003J\u0018\u0010W\u001a\u00020:2\u000e\u0010X\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=H\u0002J\u0012\u0010Y\u001a\u00020:2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J(\u0010Z\u001a\u00020:*\u00020[2\b\b\u0002\u0010\\\u001a\u00020,2\b\b\u0002\u0010]\u001a\u00020,2\b\b\u0002\u0010^\u001a\u00020,J&\u0010_\u001a\u00020`*\u00020[2\u0017\u0010a\u001a\u0013\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020:0b¢\u0006\u0002\bcH\bR\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\rXD¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u000fR\u0014\u0010!\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u000fR\u0014\u0010#\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u000fR\u001c\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020,X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u000200X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u001c\u00103\u001a\u0004\u0018\u000104X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108\u0002\u0004\n\u0002\b\u0019¨\u0006d"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/AccountCenterView;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/BaseView;", "Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/IAccountCenterContract$IView$Delegate;", "Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/IAccountCenterContract$IView;", "context", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "MATCH_COUNT", "", "MATCH_CP", "getContext", "()Landroidx/appcompat/app/AppCompatActivity;", "imgWidth", "", "getImgWidth", "()F", "llBottomButton", "Landroid/widget/LinearLayout;", "getLlBottomButton", "()Landroid/widget/LinearLayout;", "setLlBottomButton", "(Landroid/widget/LinearLayout;)V", "llGroupList", "getLlGroupList", "setLlGroupList", "mViewDelegate", "getMViewDelegate", "()Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/IAccountCenterContract$IView$Delegate;", "setMViewDelegate", "(Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/IAccountCenterContract$IView$Delegate;)V", "marginBottom", "marginLeft", "getMarginLeft", "minHeight", "getMinHeight", "paddingTop", "getPaddingTop", "parentLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getParentLayout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setParentLayout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "radius", "", "getRadius", "()I", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "titleBar", "Lcom/ss/android/lark/passport/infra/widget/CommonTitleBar;", "getTitleBar", "()Lcom/ss/android/lark/passport/infra/widget/CommonTitleBar;", "setTitleBar", "(Lcom/ss/android/lark/passport/infra/widget/CommonTitleBar;)V", "create", "", "destroy", "filterList", "", "Lcom/ss/lark/android/passport/biz/feature/account_center/UserOperationCenterInfo$IdentityBindUserList;", "credentialBindingIdentities", "getBitmap", "Landroid/graphics/Bitmap;", "iconUrl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "hideLoadingView", "jumpOfficialList", "mergeSameCredentialUsers", "setUniContext", "uniContext", "setViewDelegate", "viewDelegate", "showBottomButton", "stepInfo", "Lcom/ss/lark/android/passport/biz/feature/account_center/UserOperationCenterInfo;", "showLoadingView", "showOfficialGroupList", "officialEmailList", "", "", "Lcom/ss/lark/android/passport/biz/feature/account_center/UserOperationCenterInfo$ResponseTenant;", "showOtherLoginBtn", "showPhoneGroupList", "unLoginUsers", "showView", "createSpace", "Landroid/view/ViewGroup;", "mMarginLeft", "height", "background", "space", "Landroid/view/View;", "initializer", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.c */
public class AccountCenterView extends AbstractC49023c<IAccountCenterContract.IView.Delegate> implements IAccountCenterContract.IView {

    /* renamed from: c */
    public final float f163020c = 52.0f;

    /* renamed from: d */
    private IAccountCenterContract.IView.Delegate f163021d;

    /* renamed from: e */
    private LinearLayout f163022e;

    /* renamed from: f */
    private LinearLayout f163023f;

    /* renamed from: g */
    private ConstraintLayout f163024g;

    /* renamed from: h */
    private CommonTitleBar f163025h;

    /* renamed from: i */
    private final String f163026i = "cp";

    /* renamed from: j */
    private final String f163027j = "count";

    /* renamed from: k */
    private final float f163028k = 42.0f;

    /* renamed from: l */
    private final int f163029l = C49154ag.m193838b((Context) LarkContext.getApplication(), (int) R.dimen.signin_sdk_rect_avatar_radius);

    /* renamed from: m */
    private final float f163030m = 16.0f;

    /* renamed from: n */
    private final float f163031n = 20.0f;

    /* renamed from: o */
    private final float f163032o = 104.0f;

    /* renamed from: p */
    private final CoroutineScope f163033p = C69364ai.m266265a(cr.m266795a(null, 1, null).plus(C49070b.m193384a()));

    /* renamed from: q */
    private final AppCompatActivity f163034q;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: c */
    public UniContext mo171187c() {
        return this.f123084a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final IAccountCenterContract.IView.Delegate mo223336d() {
        return this.f163021d;
    }

    /* renamed from: e */
    public final LinearLayout mo223337e() {
        return this.f163022e;
    }

    /* renamed from: f */
    public final LinearLayout mo223338f() {
        return this.f163023f;
    }

    /* renamed from: g */
    public final ConstraintLayout mo223339g() {
        return this.f163024g;
    }

    /* renamed from: h */
    public final CommonTitleBar mo223340h() {
        return this.f163025h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final float mo223341i() {
        return this.f163028k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final int mo223342j() {
        return this.f163029l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final float mo223343k() {
        return this.f163030m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final float mo223344l() {
        return this.f163031n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final float mo223345m() {
        return this.f163032o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final CoroutineScope mo223346n() {
        return this.f163033p;
    }

    /* renamed from: r */
    public final AppCompatActivity mo223350r() {
        return this.f163034q;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        CommonTitleBar commonTitleBar = this.f163025h;
        if (commonTitleBar != null) {
            commonTitleBar.setTitleClickListener(new C64577a(this));
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.account_center.mvp.IAccountCenterContract.IView
    /* renamed from: o */
    public void mo223347o() {
        AppCompatActivity appCompatActivity = this.f163034q;
        if (appCompatActivity instanceof BaseActivity) {
            ((BaseActivity) appCompatActivity).mo171141m();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.account_center.mvp.IAccountCenterContract.IView
    /* renamed from: p */
    public void mo223348p() {
        AppCompatActivity appCompatActivity = this.f163034q;
        if (appCompatActivity instanceof BaseActivity) {
            ((BaseActivity) appCompatActivity).mo171143o();
        }
    }

    /* renamed from: q */
    public final void mo223349q() {
        AccountCenterStatisticsHelper.f163012a.mo223312b();
        IAccountCenterContract.IView.Delegate aVar = this.f163021d;
        if (aVar != null) {
            aVar.mo223323a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/lark/android/passport/biz/feature/account_center/mvp/AccountCenterView$create$1", "Lcom/ss/android/lark/passport/infra/widget/CommonTitleBar$OnTitleBarClickListener;", "onClickLeftIcon", "", "onClickLeftText", "onClickRightText", "onClickTitle", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.c$a */
    public static final class C64577a implements CommonTitleBar.AbstractC49238b {

        /* renamed from: a */
        final /* synthetic */ AccountCenterView f163035a;

        @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
        /* renamed from: b */
        public void mo171770b() {
        }

        @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
        /* renamed from: c */
        public void mo171771c() {
        }

        @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
        /* renamed from: d */
        public void mo171772d() {
        }

        @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
        /* renamed from: a */
        public void mo171769a() {
            this.f163035a.f123085b.mo171465b("n_page_account_center", "click ");
            IAccountCenterContract.IView.Delegate d = this.f163035a.mo223336d();
            if (d != null) {
                d.mo223329c();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64577a(AccountCenterView cVar) {
            this.f163035a = cVar;
        }
    }

    /* renamed from: s */
    private final void m253782s() {
        ViewTreeObserver viewTreeObserver;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        ConstraintLayout constraintLayout = this.f163024g;
        if (constraintLayout != null && (viewTreeObserver = constraintLayout.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC64586h(this, booleanRef));
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f163021d = null;
        LinearLayout linearLayout = this.f163022e;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        LinearLayout linearLayout2 = this.f163023f;
        if (linearLayout2 != null) {
            linearLayout2.removeAllViews();
        }
        C69364ai.m266267a(this.f163033p, null, 1, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onGlobalLayout"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.c$h */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC64586h implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ AccountCenterView f163044a;

        /* renamed from: b */
        final /* synthetic */ Ref.BooleanRef f163045b;

        ViewTreeObserver$OnGlobalLayoutListenerC64586h(AccountCenterView cVar, Ref.BooleanRef booleanRef) {
            this.f163044a = cVar;
            this.f163045b = booleanRef;
        }

        public final void onGlobalLayout() {
            int i;
            if (!this.f163045b.element) {
                ConstraintLayout g = this.f163044a.mo223339g();
                if (g != null) {
                    i = g.getMeasuredHeight();
                } else {
                    i = 0;
                }
                View findViewById = this.f163044a.mo223350r().findViewById(16908290);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "context.findViewById<View>(android.R.id.content)");
                int measuredHeight = findViewById.getMeasuredHeight();
                View findViewById2 = this.f163044a.mo223350r().findViewById(R.id.titlebar);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "context.findViewById<View>(R.id.titlebar)");
                int measuredHeight2 = findViewById2.getMeasuredHeight() + i;
                int a = (int) C28441g.m104234a(this.f163044a.mo223350r(), this.f163044a.mo223345m());
                int i2 = measuredHeight - measuredHeight2;
                if (i2 > a) {
                    a = i2;
                }
                RelativeLayout relativeLayout = new RelativeLayout(this.f163044a.mo223350r());
                LinearLayout f = this.f163044a.mo223338f();
                if (f != null) {
                    f.addView(relativeLayout);
                }
                ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                layoutParams.height = a;
                layoutParams.width = -1;
                relativeLayout.setLayoutParams(layoutParams);
                TextView textView = new TextView(this.f163044a.mo223350r());
                textView.setText(this.f163044a.mo223350r().getString(R.string.Lark_Passport_AddAccount_SwitchAnotherPhoneMail));
                ColorStateList colorStateList = this.f163044a.mo223350r().getResources().getColorStateList(R.drawable.signin_sdk_account_center_other_login);
                Intrinsics.checkExpressionValueIsNotNull(colorStateList, "context.resources.getCol…count_center_other_login)");
                textView.setTextColor(colorStateList);
                textView.setOnClickListener(new View.OnClickListener(this) {
                    /* class com.ss.lark.android.passport.biz.feature.account_center.mvp.AccountCenterView.ViewTreeObserver$OnGlobalLayoutListenerC64586h.View$OnClickListenerC645871 */

                    /* renamed from: a */
                    final /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC64586h f163046a;

                    {
                        this.f163046a = r1;
                    }

                    public final void onClick(View view) {
                        AccountCenterStatisticsHelper.f163012a.mo223313c();
                        IAccountCenterContract.IView.Delegate d = this.f163046a.f163044a.mo223336d();
                        if (d != null) {
                            d.mo223327b();
                        }
                    }
                });
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, (int) C28441g.m104234a(this.f163044a.mo223350r(), this.f163044a.mo223344l()));
                layoutParams2.addRule(12);
                layoutParams2.addRule(14);
                layoutParams2.bottomMargin = (int) C28441g.m104234a(this.f163044a.mo223350r(), this.f163044a.f163020c);
                textView.setLayoutParams(layoutParams2);
                relativeLayout.addView(textView);
                this.f163045b.element = true;
            }
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: a */
    public void mo171186a(UniContext uniContext) {
        this.f123084a = uniContext;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\"\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0010\u0010\b\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/ss/lark/android/passport/biz/feature/account_center/mvp/AccountCenterView$getBitmap$2$target$1", "Lcom/bumptech/glide/request/target/CustomTarget;", "Landroid/graphics/Bitmap;", "onLoadCleared", "", "p0", "Landroid/graphics/drawable/Drawable;", "onResourceReady", "p1", "Lcom/bumptech/glide/request/transition/Transition;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.c$b */
    public static final class C64578b extends AbstractC2513c<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ Continuation f163036a;

        @Override // com.bumptech.glide.request.p095a.AbstractC2522j
        /* renamed from: a */
        public void mo11036a(Drawable drawable) {
        }

        C64578b(Continuation cVar) {
            this.f163036a = cVar;
        }

        @Override // com.bumptech.glide.request.p095a.AbstractC2522j
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo10442a(Object obj, AbstractC2529b bVar) {
            mo223351a((Bitmap) obj, (AbstractC2529b<? super Bitmap>) bVar);
        }

        /* renamed from: a */
        public void mo223351a(Bitmap bitmap, AbstractC2529b<? super Bitmap> bVar) {
            Intrinsics.checkParameterIsNotNull(bitmap, "p0");
            Continuation cVar = this.f163036a;
            Result.Companion aVar = Result.Companion;
            cVar.resumeWith(Result.m271569constructorimpl(bitmap));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.c$f */
    public static final class View$OnClickListenerC64582f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AccountCenterView f163043a;

        View$OnClickListenerC64582f(AccountCenterView cVar) {
            this.f163043a = cVar;
        }

        public final void onClick(View view) {
            this.f163043a.mo223349q();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.c$c */
    public static final class View$OnClickListenerC64579c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AccountCenterView f163037a;

        /* renamed from: b */
        final /* synthetic */ UserOperationCenterInfo f163038b;

        View$OnClickListenerC64579c(AccountCenterView cVar, UserOperationCenterInfo userOperationCenterInfo) {
            this.f163037a = cVar;
            this.f163038b = userOperationCenterInfo;
        }

        public final void onClick(View view) {
            BaseStepData baseStepData;
            AccountCenterStatisticsHelper.f163012a.mo223314d();
            IAccountCenterContract.IView.Delegate d = this.f163037a.mo223336d();
            if (d != null) {
                UserOperationCenterInfo userOperationCenterInfo = this.f163038b;
                if (userOperationCenterInfo != null) {
                    baseStepData = userOperationCenterInfo.joinTeam;
                } else {
                    baseStepData = null;
                }
                d.mo223325a(baseStepData);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.c$d */
    public static final class View$OnClickListenerC64580d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AccountCenterView f163039a;

        /* renamed from: b */
        final /* synthetic */ UserOperationCenterInfo f163040b;

        View$OnClickListenerC64580d(AccountCenterView cVar, UserOperationCenterInfo userOperationCenterInfo) {
            this.f163039a = cVar;
            this.f163040b = userOperationCenterInfo;
        }

        public final void onClick(View view) {
            BaseStepData baseStepData;
            AccountCenterStatisticsHelper.f163012a.mo223316f();
            IAccountCenterContract.IView.Delegate d = this.f163039a.mo223336d();
            if (d != null) {
                UserOperationCenterInfo userOperationCenterInfo = this.f163040b;
                if (userOperationCenterInfo != null) {
                    baseStepData = userOperationCenterInfo.createTeam;
                } else {
                    baseStepData = null;
                }
                d.mo223328b(baseStepData);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.c$e */
    public static final class View$OnClickListenerC64581e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AccountCenterView f163041a;

        /* renamed from: b */
        final /* synthetic */ UserOperationCenterInfo f163042b;

        View$OnClickListenerC64581e(AccountCenterView cVar, UserOperationCenterInfo userOperationCenterInfo) {
            this.f163041a = cVar;
            this.f163042b = userOperationCenterInfo;
        }

        public final void onClick(View view) {
            BaseStepData baseStepData;
            AccountCenterStatisticsHelper.f163012a.mo223315e();
            IAccountCenterContract.IView.Delegate d = this.f163041a.mo223336d();
            if (d != null) {
                UserOperationCenterInfo userOperationCenterInfo = this.f163042b;
                if (userOperationCenterInfo != null) {
                    baseStepData = userOperationCenterInfo.personalStep;
                } else {
                    baseStepData = null;
                }
                d.mo223330c(baseStepData);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/lark/android/passport/biz/feature/account_center/mvp/AccountCenterView$showPhoneGroupList$3$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.c$j */
    public static final class View$OnClickListenerC64591j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserItem f163047a;

        /* renamed from: b */
        final /* synthetic */ AccountCenterView f163048b;

        /* renamed from: c */
        final /* synthetic */ UserOperationCenterInfo.IdentityBindUserList f163049c;

        View$OnClickListenerC64591j(UserItem userItem, AccountCenterView cVar, UserOperationCenterInfo.IdentityBindUserList identityBindUserList) {
            this.f163047a = userItem;
            this.f163048b = cVar;
            this.f163049c = identityBindUserList;
        }

        public final void onClick(View view) {
            User user = this.f163047a.user;
            IAccountCenterContract.IView.Delegate d = this.f163048b.mo223336d();
            if (d != null) {
                d.mo223324a(this.f163048b.mo223350r(), user);
            }
        }
    }

    /* renamed from: a */
    public void mo171188a(IAccountCenterContract.IView.Delegate aVar) {
        this.f163021d = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/lark/android/passport/biz/feature/account_center/mvp/AccountCenterView$showPhoneGroupList$3$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.c$k */
    public static final class View$OnClickListenerC64592k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserItem f163050a;

        /* renamed from: b */
        final /* synthetic */ AccountCenterView f163051b;

        /* renamed from: c */
        final /* synthetic */ UserOperationCenterInfo.IdentityBindUserList f163052c;

        View$OnClickListenerC64592k(UserItem userItem, AccountCenterView cVar, UserOperationCenterInfo.IdentityBindUserList identityBindUserList) {
            this.f163050a = userItem;
            this.f163051b = cVar;
            this.f163052c = identityBindUserList;
        }

        public final void onClick(View view) {
            User user;
            AccountCenterStatisticsHelper.f163012a.mo223311a();
            UserItem userItem = this.f163050a;
            if (userItem != null) {
                user = userItem.user;
            } else {
                user = null;
            }
            IAccountCenterContract.IView.Delegate d = this.f163051b.mo223336d();
            if (d != null) {
                d.mo223324a(this.f163051b.mo223350r(), user);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/ss/lark/android/passport/biz/feature/account_center/mvp/AccountCenterView$showPhoneGroupList$3$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.c$i */
    public static final class C64588i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AccountCenterTeamItemView $button;
        final /* synthetic */ UserItem $user;
        final /* synthetic */ UserOperationCenterInfo.IdentityBindUserList $userList$inlined;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ AccountCenterView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64588i(UserItem userItem, AccountCenterTeamItemView aVar, Continuation cVar, AccountCenterView cVar2, UserOperationCenterInfo.IdentityBindUserList identityBindUserList) {
            super(2, cVar);
            this.$user = userItem;
            this.$button = aVar;
            this.this$0 = cVar2;
            this.$userList$inlined = identityBindUserList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C64588i iVar = new C64588i(this.$user, this.$button, cVar, this.this$0, this.$userList$inlined);
            iVar.p$ = (CoroutineScope) obj;
            return iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C64588i) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                final Bitmap bitmap = (Bitmap) C69389f.m266835a(null, new Function2<CoroutineScope, Continuation<? super Bitmap>, Object>(this, null) {
                    /* class com.ss.lark.android.passport.biz.feature.account_center.mvp.AccountCenterView.C64588i.C645891 */
                    Object L$0;
                    int label;
                    private CoroutineScope p$;
                    final /* synthetic */ C64588i this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                        Intrinsics.checkParameterIsNotNull(cVar, "completion");
                        C645891 r0 = 

                        public AccountCenterView(AppCompatActivity appCompatActivity) {
                            Intrinsics.checkParameterIsNotNull(appCompatActivity, "context");
                            this.f163034q = appCompatActivity;
                            this.f163025h = (CommonTitleBar) appCompatActivity.findViewById(R.id.titlebar);
                            this.f163022e = (LinearLayout) appCompatActivity.findViewById(R.id.ll_group_list);
                            this.f163023f = (LinearLayout) appCompatActivity.findViewById(R.id.ll_bottom_button);
                            this.f163024g = (ConstraintLayout) appCompatActivity.findViewById(R.id.scorll_container);
                        }

                        /* renamed from: b */
                        private final List<UserOperationCenterInfo.IdentityBindUserList> m253779b(List<? extends UserOperationCenterInfo.IdentityBindUserList> list) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (T t : list) {
                                UserOperationCenterInfo.ResponseCredential responseCredential = t.credential;
                                Intrinsics.checkExpressionValueIsNotNull(responseCredential, "it.credential");
                                List<UserItem> list2 = t.userItemList;
                                UserOperationCenterInfo.IdentityBindUserList identityBindUserList = (UserOperationCenterInfo.IdentityBindUserList) linkedHashMap.get(responseCredential.credential);
                                if (identityBindUserList == null) {
                                    this.f123085b.mo171465b("n_action_merge_same_credential_users", "identityBindUserList is null");
                                    String str = responseCredential.credential;
                                    Intrinsics.checkExpressionValueIsNotNull(str, "credential.credential");
                                    linkedHashMap.put(str, t);
                                } else {
                                    List<UserItem> list3 = identityBindUserList.userItemList;
                                    Intrinsics.checkExpressionValueIsNotNull(list2, "userItemList");
                                    list3.addAll(list2);
                                }
                            }
                            PassportLog passportLog = this.f123085b;
                            passportLog.mo171465b("n_action_merge_same_credential_users", "userList size = " + linkedHashMap.values().size());
                            Collection values = linkedHashMap.values();
                            Intrinsics.checkExpressionValueIsNotNull(values, "userListByCredential.values");
                            return CollectionsKt.toList(values);
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                        @DebugMetadata(mo239172c = "com.ss.lark.android.passport.biz.feature.account_center.mvp.AccountCenterView$showOfficialGroupList$2", mo239173f = "AccountCenterView.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
                        /* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.c$g */
                        public static final class C64583g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ List $bitmapList;
                            final /* synthetic */ AccountCenterTeamItemView $button;
                            final /* synthetic */ Ref.IntRef $count;
                            final /* synthetic */ Map $officialEmailList;
                            int label;
                            private CoroutineScope p$;
                            final /* synthetic */ AccountCenterView this$0;

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C64583g(AccountCenterView cVar, Map map, Ref.IntRef intRef, List list, AccountCenterTeamItemView aVar, Continuation cVar2) {
                                super(2, cVar2);
                                this.this$0 = cVar;
                                this.$officialEmailList = map;
                                this.$count = intRef;
                                this.$bitmapList = list;
                                this.$button = aVar;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                C64583g gVar = new C64583g(this.this$0, this.$officialEmailList, this.$count, this.$bitmapList, this.$button, cVar);
                                gVar.p$ = (CoroutineScope) obj;
                                return gVar;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                                return ((C64583g) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                C69086a.m265828a();
                                if (this.label == 0) {
                                    C69097g.m265891a(obj);
                                    for (Map.Entry entry : this.$officialEmailList.entrySet()) {
                                        for (final UserOperationCenterInfo.ResponseTenant responseTenant : (List) entry.getValue()) {
                                            if (this.$count.element == 4) {
                                                break;
                                            }
                                            Bitmap bitmap = (Bitmap) C69389f.m266835a(null, new Function2<CoroutineScope, Continuation<? super Bitmap>, Object>(this, null) {
                                                /* class com.ss.lark.android.passport.biz.feature.account_center.mvp.AccountCenterView.C64583g.C645841 */
                                                Object L$0;
                                                int label;
                                                private CoroutineScope p$;
                                                final /* synthetic */ C64583g this$0;

                                                {
                                                    this.this$0 = r1;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                                    Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                                    C645841 r0 = 

                                                    /* renamed from: b */
                                                    private final void m253780b(UserOperationCenterInfo userOperationCenterInfo) {
                                                        LinearLayout linearLayout = this.f163023f;
                                                        if (linearLayout != null) {
                                                            m253777a(this, linearLayout, 0, 0, 0, 7, null);
                                                        }
                                                        AccountCenterButtonItemView accountCenterButtonItemView = new AccountCenterButtonItemView(this.f163034q);
                                                        accountCenterButtonItemView.setText(this.f163034q.getString(R.string.Lark_Passport_AddAccountJoinTeamButton));
                                                        accountCenterButtonItemView.setImg(1);
                                                        accountCenterButtonItemView.setOnClickListener(new View$OnClickListenerC64579c(this, userOperationCenterInfo));
                                                        LinearLayout linearLayout2 = this.f163023f;
                                                        if (linearLayout2 != null) {
                                                            linearLayout2.addView(accountCenterButtonItemView);
                                                        }
                                                        LinearLayout linearLayout3 = this.f163023f;
                                                        if (linearLayout3 != null) {
                                                            m253777a(this, linearLayout3, C49154ag.m193828a(this.f163034q, this.f163030m), 0, 0, 6, null);
                                                        }
                                                        AccountCenterButtonItemView accountCenterButtonItemView2 = new AccountCenterButtonItemView(this.f163034q);
                                                        accountCenterButtonItemView2.setText(this.f163034q.getString(R.string.Lark_Passport_AddAccountCreateTeamButton));
                                                        accountCenterButtonItemView2.setImg(2);
                                                        accountCenterButtonItemView2.setOnClickListener(new View$OnClickListenerC64580d(this, userOperationCenterInfo));
                                                        LinearLayout linearLayout4 = this.f163023f;
                                                        if (linearLayout4 != null) {
                                                            linearLayout4.addView(accountCenterButtonItemView2);
                                                        }
                                                        LinearLayout linearLayout5 = this.f163023f;
                                                        if (linearLayout5 != null) {
                                                            m253777a(this, linearLayout5, C49154ag.m193828a(this.f163034q, this.f163030m), 0, 0, 6, null);
                                                        }
                                                        AccountCenterButtonItemView accountCenterButtonItemView3 = new AccountCenterButtonItemView(this.f163034q);
                                                        accountCenterButtonItemView3.setText(this.f163034q.getString(R.string.Lark_Passport_AddAccountPersonalUseButton));
                                                        accountCenterButtonItemView3.setImg(3);
                                                        accountCenterButtonItemView3.setOnClickListener(new View$OnClickListenerC64581e(this, userOperationCenterInfo));
                                                        LinearLayout linearLayout6 = this.f163023f;
                                                        if (linearLayout6 != null) {
                                                            linearLayout6.addView(accountCenterButtonItemView3);
                                                        }
                                                        LinearLayout linearLayout7 = this.f163023f;
                                                        if (linearLayout7 != null) {
                                                            m253777a(this, linearLayout7, 0, 0, 0, 7, null);
                                                        }
                                                    }

                                                    /* renamed from: a */
                                                    private final void m253778a(Map<String, List<UserOperationCenterInfo.ResponseTenant>> map) {
                                                        if (map == null) {
                                                            this.f123085b.mo171471d("n_action_show_offical_email_list", "officialEmailList is null");
                                                            return;
                                                        }
                                                        this.f123085b.mo171460a("n_action_show_offical_email_list");
                                                        Ref.IntRef intRef = new Ref.IntRef();
                                                        intRef.element = 0;
                                                        for (Map.Entry<String, List<UserOperationCenterInfo.ResponseTenant>> entry : map.entrySet()) {
                                                            intRef.element += entry.getValue().size();
                                                        }
                                                        this.f123085b.mo171465b("n_action_show_offical_email_list", "officialEmailList size = " + intRef.element);
                                                        if (intRef.element != 0) {
                                                            LinearLayout linearLayout = this.f163022e;
                                                            if (linearLayout != null) {
                                                                m253777a(this, linearLayout, 0, (int) C28441g.m104234a(this.f163034q, this.f163031n), this.f163034q.getResources().getColor(R.color.bg_base), 1, null);
                                                            }
                                                            LinearLayout linearLayout2 = this.f163022e;
                                                            if (linearLayout2 != null) {
                                                                m253777a(this, linearLayout2, 0, 0, 0, 7, null);
                                                            }
                                                            AccountCenterTeamItemView aVar = new AccountCenterTeamItemView(this.f163034q);
                                                            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Passport_AddAccount_DirectJoinViaMailEntry, this.f163027j, String.valueOf(intRef.element));
                                                            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "text");
                                                            aVar.mo224639a(mustacheFormat, null);
                                                            aVar.setOnClickListener(new View$OnClickListenerC64582f(this));
                                                            LinearLayout linearLayout3 = this.f163022e;
                                                            if (linearLayout3 != null) {
                                                                linearLayout3.addView(aVar);
                                                            }
                                                            LinearLayout linearLayout4 = this.f163022e;
                                                            if (linearLayout4 != null) {
                                                                m253777a(this, linearLayout4, 0, 0, 0, 7, null);
                                                            }
                                                            intRef.element = 0;
                                                            Job unused = C69553g.m266944a(this.f163033p, Dispatchers.m266326d(), null, new C64583g(this, map, intRef, new ArrayList(), aVar, null), 2, null);
                                                        }
                                                    }

                                                    /* renamed from: a */
                                                    private final List<UserOperationCenterInfo.IdentityBindUserList> m253776a(List<? extends UserOperationCenterInfo.IdentityBindUserList> list) {
                                                        Iterator<? extends UserOperationCenterInfo.IdentityBindUserList> it;
                                                        ArrayList arrayList;
                                                        Integer num;
                                                        Tenant tenant;
                                                        Iterator<? extends UserOperationCenterInfo.IdentityBindUserList> it2;
                                                        String str;
                                                        User user;
                                                        boolean z;
                                                        User user2;
                                                        boolean z2;
                                                        Tenant tenant2;
                                                        boolean z3;
                                                        User user3;
                                                        User user4;
                                                        String str2;
                                                        ArrayList arrayList2 = new ArrayList();
                                                        if (list == null) {
                                                            this.f123085b.mo171471d("n_action_filter_credential_binding_identities", "credentialBindingIdentities is null");
                                                            return arrayList2;
                                                        }
                                                        this.f123085b.mo171465b("n_action_filter_credential_binding_identities", "start");
                                                        ArrayList arrayList3 = new ArrayList();
                                                        ArrayList arrayList4 = new ArrayList();
                                                        ArrayList arrayList5 = new ArrayList();
                                                        Iterator<? extends UserOperationCenterInfo.IdentityBindUserList> it3 = list.iterator();
                                                        while (it3.hasNext()) {
                                                            UserOperationCenterInfo.IdentityBindUserList identityBindUserList = (UserOperationCenterInfo.IdentityBindUserList) it3.next();
                                                            UserOperationCenterInfo.ResponseCredential responseCredential = identityBindUserList.credential;
                                                            if (responseCredential != null) {
                                                                PassportLog passportLog = this.f123085b;
                                                                passportLog.mo171465b("n_action_filter_credential_binding_identities", "credential_id:" + responseCredential.credentialId);
                                                            } else {
                                                                this.f123085b.mo171471d("n_action_filter_credential_binding_identities", "credential is null");
                                                            }
                                                            if (identityBindUserList.userItemList == null) {
                                                                this.f123085b.mo171471d("n_action_filter_credential_binding_identities", "userList is null");
                                                                Unit unit = Unit.INSTANCE;
                                                            }
                                                            List<User> allValidUserList = ServiceFinder.m193744a().getAllValidUserList();
                                                            Intrinsics.checkExpressionValueIsNotNull(allValidUserList, "ServiceFinder.userListService.allValidUserList");
                                                            ArrayList arrayList6 = new ArrayList();
                                                            for (T t : allValidUserList) {
                                                                if (t != null) {
                                                                    str2 = t.userId;
                                                                } else {
                                                                    str2 = null;
                                                                }
                                                                if (str2 != null) {
                                                                    arrayList6.add(str2);
                                                                }
                                                            }
                                                            Set set = CollectionsKt.toSet(arrayList6);
                                                            UserOperationCenterInfo.IdentityBindUserList identityBindUserList2 = new UserOperationCenterInfo.IdentityBindUserList();
                                                            identityBindUserList2.credential = new UserOperationCenterInfo.ResponseCredential(identityBindUserList.credential);
                                                            List<UserItem> list2 = identityBindUserList.userItemList;
                                                            if (list2 != null) {
                                                                ArrayList arrayList7 = new ArrayList();
                                                                for (T t2 : list2) {
                                                                    T t3 = t2;
                                                                    if (t3 == null || (user4 = t3.user) == null) {
                                                                        tenant = null;
                                                                    } else {
                                                                        tenant = user4.tenant;
                                                                    }
                                                                    if (tenant == null) {
                                                                        PassportLog passportLog2 = this.f123085b;
                                                                        StringBuilder sb = new StringBuilder();
                                                                        sb.append("useItem is null: ");
                                                                        if (t3 == null) {
                                                                            z = true;
                                                                        } else {
                                                                            z = false;
                                                                        }
                                                                        sb.append(z);
                                                                        sb.append(", ");
                                                                        it2 = it3;
                                                                        sb.append("userItem.user is null:");
                                                                        if (t3 != null) {
                                                                            user2 = t3.user;
                                                                        } else {
                                                                            user2 = null;
                                                                        }
                                                                        if (user2 == null) {
                                                                            z2 = true;
                                                                        } else {
                                                                            z2 = false;
                                                                        }
                                                                        sb.append(z2);
                                                                        sb.append(", ");
                                                                        sb.append("userItem.user.tenant is null:");
                                                                        if (t3 == null || (user3 = t3.user) == null) {
                                                                            tenant2 = null;
                                                                        } else {
                                                                            tenant2 = user3.tenant;
                                                                        }
                                                                        if (tenant2 == null) {
                                                                            z3 = true;
                                                                        } else {
                                                                            z3 = false;
                                                                        }
                                                                        sb.append(z3);
                                                                        passportLog2.mo171471d("n_action_filter_credential_binding_identities", sb.toString());
                                                                    } else {
                                                                        it2 = it3;
                                                                    }
                                                                    Set set2 = set;
                                                                    if (t3 == null || (user = t3.user) == null) {
                                                                        str = null;
                                                                    } else {
                                                                        str = user.userId;
                                                                    }
                                                                    if (!CollectionsKt.contains(set2, str)) {
                                                                        arrayList7.add(t2);
                                                                    }
                                                                    it3 = it2;
                                                                }
                                                                it = it3;
                                                                arrayList = arrayList7;
                                                            } else {
                                                                it = it3;
                                                                arrayList = null;
                                                            }
                                                            identityBindUserList2.userItemList = arrayList;
                                                            List<UserItem> list3 = identityBindUserList2.userItemList;
                                                            if (list3 == null || list3.size() != 0) {
                                                                UserOperationCenterInfo.ResponseCredential responseCredential2 = identityBindUserList2.credential;
                                                                if (responseCredential2 != null) {
                                                                    num = Integer.valueOf(responseCredential2.credentialType);
                                                                } else {
                                                                    num = null;
                                                                }
                                                                if (num != null && num.intValue() == 1) {
                                                                    this.f123085b.mo171465b("n_action_filter_credential_binding_identities", "credentialType = TYPE_MOBILE");
                                                                    arrayList3.add(identityBindUserList2);
                                                                } else if (num != null && num.intValue() == 2) {
                                                                    this.f123085b.mo171465b("n_action_filter_credential_binding_identities", "credentialType = TYPE_EMAIL");
                                                                    arrayList4.add(identityBindUserList2);
                                                                } else {
                                                                    this.f123085b.mo171465b("n_action_filter_credential_binding_identities", "credentialType = IDP/Other");
                                                                    arrayList5.add(identityBindUserList2);
                                                                }
                                                            } else {
                                                                this.f123085b.mo171465b("n_action_filter_credential_binding_identities", "userItemList size == 0");
                                                            }
                                                            it3 = it;
                                                        }
                                                        this.f123085b.mo171460a("n_action_merge_same_email_credential_users");
                                                        List<UserOperationCenterInfo.IdentityBindUserList> b = m253779b(arrayList4);
                                                        this.f123085b.mo171460a("n_action_merge_same_phone_credential_users");
                                                        List<UserOperationCenterInfo.IdentityBindUserList> b2 = m253779b(arrayList3);
                                                        this.f123085b.mo171460a("n_action_merge_same_idp_credential_users");
                                                        List<UserOperationCenterInfo.IdentityBindUserList> b3 = m253779b(arrayList5);
                                                        if (ServiceFinder.m193748c().isLarkPackage()) {
                                                            this.f123085b.mo171465b("n_action_sort_identity_bind_users_by_package", "Lark");
                                                            arrayList2.addAll(b);
                                                            arrayList2.addAll(b2);
                                                            arrayList2.addAll(b3);
                                                        } else {
                                                            this.f123085b.mo171465b("n_action_sort_identity_bind_users_by_package", "FeiShu");
                                                            arrayList2.addAll(b2);
                                                            arrayList2.addAll(b);
                                                            arrayList2.addAll(b3);
                                                        }
                                                        return arrayList2;
                                                    }

                                                    /* renamed from: c */
                                                    private final void m253781c(List<? extends UserOperationCenterInfo.IdentityBindUserList> list) {
                                                        int i;
                                                        String str;
                                                        User user;
                                                        String str2;
                                                        User user2;
                                                        Tenant tenant;
                                                        User user3;
                                                        User user4;
                                                        if (list == null) {
                                                            this.f123085b.mo171471d("n_action_show_credential_bind_user_list", "userList is null");
                                                            return;
                                                        }
                                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                        for (UserOperationCenterInfo.IdentityBindUserList identityBindUserList : list) {
                                                            this.f123085b.mo171465b("n_action_show_credential_bind_user_list", "credential_id: " + identityBindUserList.credential.credentialId);
                                                            List<UserItem> list2 = identityBindUserList.userItemList;
                                                            Intrinsics.checkExpressionValueIsNotNull(list2, "userList.userItemList");
                                                            ArrayList arrayList = new ArrayList();
                                                            Iterator<T> it = list2.iterator();
                                                            while (true) {
                                                                String str3 = null;
                                                                i = 1;
                                                                if (!it.hasNext()) {
                                                                    break;
                                                                }
                                                                T next = it.next();
                                                                T t = next;
                                                                LinkedHashSet linkedHashSet2 = linkedHashSet;
                                                                if (!(t == null || (user4 = t.user) == null)) {
                                                                    str3 = user4.userId;
                                                                }
                                                                if (!CollectionsKt.contains(linkedHashSet2, str3)) {
                                                                    arrayList.add(next);
                                                                }
                                                            }
                                                            identityBindUserList.userItemList = arrayList;
                                                            if (identityBindUserList.userItemList.size() == 0) {
                                                                this.f123085b.mo171465b("n_action_show_credential_bind_user_list", "userList size == 0");
                                                            } else {
                                                                List<UserItem> list3 = identityBindUserList.userItemList;
                                                                Intrinsics.checkExpressionValueIsNotNull(list3, "userList.userItemList");
                                                                ArrayList arrayList2 = new ArrayList();
                                                                for (T t2 : list3) {
                                                                    String str4 = (t2 == null || (user3 = t2.user) == null) ? null : user3.userId;
                                                                    if (str4 != null) {
                                                                        arrayList2.add(str4);
                                                                    }
                                                                }
                                                                linkedHashSet.addAll(arrayList2);
                                                                TextView textView = new TextView(this.f163034q);
                                                                C49226y.m194061a(this.f163034q, textView, UIHelper.mustacheFormat((int) R.string.Lark_Passport_AddAccountAlreadyAddedDesc, this.f163026i, identityBindUserList.credential.credential), null, this.f123085b);
                                                                textView.setTextColor(this.f163034q.getResources().getColor(R.color.text_caption));
                                                                textView.setPadding((int) C28441g.m104234a(this.f163034q, this.f163030m), (int) C28441g.m104234a(this.f163034q, this.f163031n), (int) C28441g.m104234a(this.f163034q, this.f163030m), this.f163029l);
                                                                LinearLayout linearLayout = this.f163022e;
                                                                if (linearLayout != null) {
                                                                    linearLayout.addView(textView);
                                                                }
                                                                LinearLayout linearLayout2 = this.f163022e;
                                                                if (linearLayout2 != null) {
                                                                    m253777a(this, linearLayout2, 0, 0, 0, 7, null);
                                                                }
                                                                List<UserItem> list4 = identityBindUserList.userItemList;
                                                                Intrinsics.checkExpressionValueIsNotNull(list4, "userList.userItemList");
                                                                int i2 = 0;
                                                                for (T t3 : list4) {
                                                                    int i3 = i2 + 1;
                                                                    if (i2 < 0) {
                                                                        CollectionsKt.throwIndexOverflow();
                                                                    }
                                                                    T t4 = t3;
                                                                    AccountCenterTeamItemView aVar = new AccountCenterTeamItemView(this.f163034q);
                                                                    String str5 = "";
                                                                    if (t4 == null || (user2 = t4.user) == null || (tenant = user2.tenant) == null || (str = tenant.name) == null) {
                                                                        str = str5;
                                                                    }
                                                                    if (!(t4 == null || (user = t4.user) == null || (str2 = user.name) == null)) {
                                                                        str5 = str2;
                                                                    }
                                                                    aVar.mo224639a(str, str5);
                                                                    aVar.setMaxLines(i);
                                                                    Job unused = C69553g.m266944a(this.f163033p, Dispatchers.m266326d(), null, new C64588i(t4, aVar, null, this, identityBindUserList), 2, null);
                                                                    Intrinsics.checkExpressionValueIsNotNull(t4, "user");
                                                                    aVar.setStatus(t4);
                                                                    User user5 = t4.user;
                                                                    if (user5 != null && 1 == user5.getStatus()) {
                                                                        aVar.setAppealOnClickListener(new View$OnClickListenerC64591j(t4, this, identityBindUserList));
                                                                    }
                                                                    aVar.setOnClickListener(new View$OnClickListenerC64592k(t4, this, identityBindUserList));
                                                                    LinearLayout linearLayout3 = this.f163022e;
                                                                    if (linearLayout3 != null) {
                                                                        linearLayout3.addView(aVar);
                                                                    }
                                                                    i = 1;
                                                                    if (i2 == identityBindUserList.userItemList.size() - 1) {
                                                                        LinearLayout linearLayout4 = this.f163022e;
                                                                        if (linearLayout4 != null) {
                                                                            m253777a(this, linearLayout4, 0, 0, 0, 7, null);
                                                                        }
                                                                    } else {
                                                                        LinearLayout linearLayout5 = this.f163022e;
                                                                        if (linearLayout5 != null) {
                                                                            m253777a(this, linearLayout5, C49154ag.m193828a(this.f163034q, this.f163030m), 0, 0, 6, null);
                                                                        }
                                                                    }
                                                                    i2 = i3;
                                                                }
                                                            }
                                                        }
                                                    }

                                                    @Override // com.ss.lark.android.passport.biz.feature.account_center.mvp.IAccountCenterContract.IView
                                                    /* renamed from: a */
                                                    public void mo223334a(UserOperationCenterInfo userOperationCenterInfo) {
                                                        if (userOperationCenterInfo != null) {
                                                            m253781c(m253776a(userOperationCenterInfo.credentialBindingIdentities));
                                                            m253778a(userOperationCenterInfo.officialEmailList);
                                                            m253780b(userOperationCenterInfo);
                                                            m253782s();
                                                            return;
                                                        }
                                                        this.f123085b.mo171471d("n_page_account_center", "stepInfo is null");
                                                    }

                                                    /* access modifiers changed from: protected */
                                                    /* renamed from: a */
                                                    public final Object mo223332a(String str, Continuation<? super Bitmap> cVar) {
                                                        SafeContinuation gVar = new SafeContinuation(C69086a.m265825a(cVar));
                                                        ((C2124f) ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9143a((FragmentActivity) this.f163034q).mo10430i().mo10396a(str).mo11150h()).mo11123a(R.drawable.signin_sdk_default_tenant_avatar)).mo11143c(R.drawable.signin_sdk_default_tenant_avatar)).mo10397a((AbstractC2522j) new C64578b(gVar));
                                                        Object a = gVar.mo239163a();
                                                        if (a == C69086a.m265828a()) {
                                                            C69091e.m265847c(cVar);
                                                        }
                                                        return a;
                                                    }

                                                    /* renamed from: a */
                                                    public final void mo223333a(ViewGroup viewGroup, int i, int i2, int i3) {
                                                        Intrinsics.checkParameterIsNotNull(viewGroup, "$this$createSpace");
                                                        View view = new View(viewGroup.getContext());
                                                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, i2);
                                                        layoutParams.setMargins(i, 0, 0, 0);
                                                        view.setLayoutParams(layoutParams);
                                                        view.setBackgroundColor(i3);
                                                        viewGroup.addView(view);
                                                    }

                                                    /* renamed from: a */
                                                    public static /* synthetic */ void m253777a(AccountCenterView cVar, ViewGroup viewGroup, int i, int i2, int i3, int i4, Object obj) {
                                                        if (obj == null) {
                                                            if ((i4 & 1) != 0) {
                                                                i = 0;
                                                            }
                                                            if ((i4 & 2) != 0) {
                                                                i2 = (int) C28441g.m104234a(viewGroup.getContext(), 0.5f);
                                                            }
                                                            if ((i4 & 4) != 0) {
                                                                Context context = viewGroup.getContext();
                                                                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                                                                i3 = context.getResources().getColor(R.color.line_border_card);
                                                            }
                                                            cVar.mo223333a(viewGroup, i, i2, i3);
                                                            return;
                                                        }
                                                        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSpace");
                                                    }
                                                }
