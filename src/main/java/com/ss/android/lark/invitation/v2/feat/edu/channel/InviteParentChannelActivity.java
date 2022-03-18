package com.ss.android.lark.invitation.v2.feat.edu.channel;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.contact.v1.GetDepartmentInactiveInfoRequest;
import com.bytedance.lark.pb.contact.v1.GetDepartmentInactiveInfoResponse;
import com.bytedance.lark.pb.contact.v1.GetDepartmentInvitationUrlRequest;
import com.bytedance.lark.pb.contact.v1.GetDepartmentInvitationUrlResponse;
import com.bytedance.lark.pb.contact.v1.InvitationSource;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.inv.export.ui.InvBaseFragmentActivity;
import com.ss.android.lark.inv.export.util.C40103e;
import com.ss.android.lark.inv.export.util.C40108g;
import com.ss.android.lark.inv.export.util.C40118l;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.inv.export.util.InvApmUtils;
import com.ss.android.lark.inv.export.util.InvErrorView;
import com.ss.android.lark.invitation.v2.feat.edu.bean.EduInvitation;
import com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.InviteParentNonDirectionActivity;
import com.ss.android.lark.invitation.v2.feat.member.channel.p2059a.C40327a;
import com.ss.android.lark.invitation.v2.feat.member.contact.C40351a;
import com.ss.android.lark.invitation.v2.p2052c.C40157a;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import com.ss.android.lark.thirdshare.lark.p2746a.p2748b.C55761a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.widget.recyclerview.p2964a.C58973b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020 H\u0014J\"\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0012\u0010'\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\b\u0010*\u001a\u00020\u001bH\u0014J\u0016\u0010+\u001a\u00020\u001b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050-H\u0002J\u0016\u0010.\u001a\u00020\u001b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050-H\u0002J\u0010\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u000201H\u0002J\u0018\u00102\u001a\u00020\u001b2\u0006\u00100\u001a\u0002012\u0006\u00103\u001a\u00020\u0015H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0007X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/edu/channel/InviteParentChannelActivity;", "Lcom/ss/android/lark/inv/export/ui/InvBaseFragmentActivity;", "()V", "adapter", "Lcom/ss/android/lark/widget/recyclerview/item/BaseItemAdapter;", "Lcom/ss/android/lark/invitation/v2/feat/member/channel/common/ChannelItem;", "chatId", "", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "departments", "getDepartments", "setDepartments", "from", "getFrom", "setFrom", "loadingDialog", "Lcom/ss/android/lark/utils/ViewUtils$ActionLoadingDialog;", "mInvitation", "Lcom/ss/android/lark/invitation/v2/feat/edu/bean/EduInvitation;", "pageLoadingDialog", "Lcom/ss/android/lark/utils/ViewUtils$PageLoadingDialog;", "response", "Lcom/bytedance/lark/pb/contact/v1/GetDepartmentInactiveInfoResponse;", "fetchData", "", "getChannelItems", "", "initLoading", "isSlideEnable", "", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "processNonDirectionalChannel", "items", "", "processRemindActivation", "processShare", ShareHitPoint.f121869d, "Lcom/ss/android/lark/thirdshare/base/export/ShareActionType;", "processShareReal", "invitation", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InviteParentChannelActivity extends InvBaseFragmentActivity {

    /* renamed from: i */
    public static final Companion f102073i = new Companion(null);

    /* renamed from: a */
    public String f102074a;

    /* renamed from: b */
    public String f102075b;

    /* renamed from: c */
    public String f102076c;

    /* renamed from: d */
    public ViewUtils.C57757c f102077d;

    /* renamed from: e */
    public ViewUtils.C57751a f102078e;

    /* renamed from: f */
    public C58973b<C40327a> f102079f;

    /* renamed from: g */
    public GetDepartmentInactiveInfoResponse f102080g;

    /* renamed from: h */
    public EduInvitation f102081h;

    /* renamed from: j */
    private HashMap f102082j;

    @JvmStatic
    /* renamed from: a */
    public static final void m159254a(Context context, String str, String str2, String str3, Map<String, String> map) {
        f102073i.mo145803a(context, str, str2, str3, map);
    }

    /* renamed from: a */
    public Context mo145788a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public View mo145789a(int i) {
        if (this.f102082j == null) {
            this.f102082j = new HashMap();
        }
        View view = (View) this.f102082j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f102082j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo145791a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m159255a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m159252a(this, configuration);
    }

    /* renamed from: f */
    public Resources mo145799f() {
        return super.getResources();
    }

    /* renamed from: g */
    public void mo145800g() {
        super.onStop();
    }

    public AssetManager getAssets() {
        return m159262f(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m159260d(this);
    }

    /* renamed from: h */
    public AssetManager mo145802h() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isSlideEnable() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m159261e(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/edu/channel/InviteParentChannelActivity$Companion;", "", "()V", "TAG", "", "start", "", "context", "Landroid/content/Context;", "from", "departments", "chatId", "customParams", "", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.edu.channel.InviteParentChannelActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo145803a(Context context, String str, String str2, String str3, Map<String, String> map) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "from");
            Intrinsics.checkParameterIsNotNull(str2, "departments");
            Intrinsics.checkParameterIsNotNull(str3, "chatId");
            HashMap a = C40108g.m159014a(Pair.create("from_scenes", str), Pair.create("departments", str2), Pair.create("chat_id", str3));
            if (map != null) {
                a.putAll(map);
            }
            C40118l.m159074a(context, "//client/invite/parent/channel", a);
        }
    }

    /* renamed from: b */
    public final String mo145794b() {
        String str = this.f102075b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatId");
        }
        return str;
    }

    /* renamed from: c */
    public final String mo145795c() {
        String str = this.f102076c;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("departments");
        }
        return str;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.inv.export.ui.InvBaseFragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        IInvitationModuleDependency a = C40147z.m159160a();
        Intrinsics.checkExpressionValueIsNotNull(a, "InvUtils.getDep()");
        C40351a.m159930a(a.isLarkEnv());
    }

    /* renamed from: i */
    private final void m159263i() {
        ViewUtils.C57757c d = ViewUtils.m224155d(this);
        Intrinsics.checkExpressionValueIsNotNull(d, "ViewUtils.createPageLoadingDialog(this)");
        this.f102077d = d;
        if (d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageLoadingDialog");
        }
        d.mo196036a(new DialogInterface$OnCancelListenerC40180c(this));
        ViewUtils.C57757c cVar = this.f102077d;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageLoadingDialog");
        }
        cVar.mo196039b();
    }

    /* renamed from: d */
    public final void mo145797d() {
        GetDepartmentInactiveInfoRequest.C16228a aVar = new GetDepartmentInactiveInfoRequest.C16228a();
        String str = this.f102075b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatId");
        }
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f102075b;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatId");
            }
            aVar.mo58156b(str2);
        } else {
            String str3 = this.f102076c;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("departments");
            }
            if (!TextUtils.isEmpty(str3)) {
                String str4 = this.f102076c;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("departments");
                }
                aVar.mo58154a(str4);
            }
        }
        C40147z.m159162b().getDepartmentInactiveInfo(aVar, new UIGetDataCallback(new C40179b(this)));
    }

    /* renamed from: e */
    public final List<C40327a> mo145798e() {
        ArrayList arrayList = new ArrayList();
        GetDepartmentInactiveInfoResponse getDepartmentInactiveInfoResponse = this.f102080g;
        if (getDepartmentInactiveInfoResponse == null) {
            Intrinsics.throwUninitializedPropertyAccessException("response");
        }
        Boolean bool = getDepartmentInactiveInfoResponse.has_invite_permission;
        Intrinsics.checkExpressionValueIsNotNull(bool, "response.has_invite_permission");
        if (bool.booleanValue()) {
            m159256a(arrayList);
        }
        m159258b(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public final String mo145790a() {
        String str = this.f102074a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("from");
        }
        return str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/invitation/v2/feat/edu/channel/InviteParentChannelActivity$fetchData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/contact/v1/GetDepartmentInactiveInfoResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.edu.channel.InviteParentChannelActivity$b */
    public static final class C40179b implements IGetDataCallback<GetDepartmentInactiveInfoResponse> {

        /* renamed from: a */
        final /* synthetic */ InviteParentChannelActivity f102083a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40179b(InviteParentChannelActivity inviteParentChannelActivity) {
            this.f102083a = inviteParentChannelActivity;
        }

        /* renamed from: a */
        public void onSuccess(GetDepartmentInactiveInfoResponse getDepartmentInactiveInfoResponse) {
            Intrinsics.checkParameterIsNotNull(getDepartmentInactiveInfoResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            InviteParentChannelActivity.m159253a(this.f102083a).mo196042e();
            this.f102083a.f102080g = getDepartmentInactiveInfoResponse;
            InviteParentChannelActivity.m159259c(this.f102083a).mo200080a(this.f102083a.mo145798e());
            RecyclerView recyclerView = (RecyclerView) this.f102083a.mo145789a(R.id.imceRv);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "imceRv");
            recyclerView.setAdapter(InviteParentChannelActivity.m159259c(this.f102083a));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("InvitationModule", errorResult.getDebugMsg());
            InviteParentChannelActivity.m159253a(this.f102083a).mo196042e();
            ((InvErrorView) this.f102083a.mo145789a(R.id.imceErrorView)).mo145638a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "onCancel"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.edu.channel.InviteParentChannelActivity$c */
    public static final class DialogInterface$OnCancelListenerC40180c implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ InviteParentChannelActivity f102084a;

        DialogInterface$OnCancelListenerC40180c(InviteParentChannelActivity inviteParentChannelActivity) {
            this.f102084a = inviteParentChannelActivity;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f102084a.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/invitation/v2/feat/edu/channel/InviteParentChannelActivity$processNonDirectionalChannel$1", "Lcom/ss/android/lark/inv/export/util/InvClickUtils$OnDebouncingClickListener;", "onDebouncingClick", "", "v", "Landroid/view/View;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.edu.channel.InviteParentChannelActivity$e */
    public static final class C40182e extends C40103e.AbstractView$OnClickListenerC40105a {

        /* renamed from: a */
        final /* synthetic */ InviteParentChannelActivity f102086a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40182e(InviteParentChannelActivity inviteParentChannelActivity) {
            this.f102086a = inviteParentChannelActivity;
        }

        @Override // com.ss.android.lark.inv.export.util.C40103e.AbstractView$OnClickListenerC40105a
        /* renamed from: a */
        public void mo145670a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            InviteParentChannelActivity inviteParentChannelActivity = this.f102086a;
            ShareActionType shareActionType = ShareActionType.WX;
            Intrinsics.checkExpressionValueIsNotNull(shareActionType, "ShareActionType.WX");
            inviteParentChannelActivity.mo145792a(shareActionType);
            InvHitPoint.m160370c(1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/invitation/v2/feat/edu/channel/InviteParentChannelActivity$processNonDirectionalChannel$4", "Lcom/ss/android/lark/inv/export/util/InvClickUtils$OnDebouncingClickListener;", "onDebouncingClick", "", "v", "Landroid/view/View;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.edu.channel.InviteParentChannelActivity$h */
    public static final class C40185h extends C40103e.AbstractView$OnClickListenerC40105a {

        /* renamed from: a */
        final /* synthetic */ InviteParentChannelActivity f102089a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40185h(InviteParentChannelActivity inviteParentChannelActivity) {
            this.f102089a = inviteParentChannelActivity;
        }

        @Override // com.ss.android.lark.inv.export.util.C40103e.AbstractView$OnClickListenerC40105a
        /* renamed from: a */
        public void mo145670a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            InviteParentChannelActivity inviteParentChannelActivity = this.f102089a;
            ShareActionType a = C55761a.m215988a();
            Intrinsics.checkExpressionValueIsNotNull(a, "LarkChatShareActionType.getInstance()");
            inviteParentChannelActivity.mo145792a(a);
            InvHitPoint.m160370c(4);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ViewUtils.C57757c m159253a(InviteParentChannelActivity inviteParentChannelActivity) {
        ViewUtils.C57757c cVar = inviteParentChannelActivity.f102077d;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageLoadingDialog");
        }
        return cVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ GetDepartmentInactiveInfoResponse m159257b(InviteParentChannelActivity inviteParentChannelActivity) {
        GetDepartmentInactiveInfoResponse getDepartmentInactiveInfoResponse = inviteParentChannelActivity.f102080g;
        if (getDepartmentInactiveInfoResponse == null) {
            Intrinsics.throwUninitializedPropertyAccessException("response");
        }
        return getDepartmentInactiveInfoResponse;
    }

    /* renamed from: c */
    public static final /* synthetic */ C58973b m159259c(InviteParentChannelActivity inviteParentChannelActivity) {
        C58973b<C40327a> bVar = inviteParentChannelActivity.f102079f;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        return bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.edu.channel.InviteParentChannelActivity$d */
    static final class View$OnClickListenerC40181d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteParentChannelActivity f102085a;

        View$OnClickListenerC40181d(InviteParentChannelActivity inviteParentChannelActivity) {
            this.f102085a = inviteParentChannelActivity;
        }

        public final void onClick(View view) {
            InviteParentChannelActivity.m159253a(this.f102085a).mo196039b();
            ((InvErrorView) this.f102085a.mo145789a(R.id.imceErrorView)).mo145640b();
            this.f102085a.mo145797d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/invitation/v2/feat/edu/channel/InviteParentChannelActivity$processShare$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/contact/v1/GetDepartmentInvitationUrlResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.edu.channel.InviteParentChannelActivity$j */
    public static final class C40187j implements IGetDataCallback<GetDepartmentInvitationUrlResponse> {

        /* renamed from: a */
        final /* synthetic */ InviteParentChannelActivity f102091a;

        /* renamed from: b */
        final /* synthetic */ ShareActionType f102092b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("InvitationModule", errorResult.getDebugMsg());
            ViewUtils.C57751a aVar = this.f102091a.f102078e;
            if (aVar != null) {
                aVar.mo196042e();
            }
            ViewUtils.m224152b(errorResult.getDisplayMsg());
        }

        /* renamed from: a */
        public void onSuccess(GetDepartmentInvitationUrlResponse getDepartmentInvitationUrlResponse) {
            Intrinsics.checkParameterIsNotNull(getDepartmentInvitationUrlResponse, "response");
            ViewUtils.C57751a aVar = this.f102091a.f102078e;
            if (aVar != null) {
                aVar.mo196042e();
            }
            this.f102091a.f102081h = EduInvitation.f102065h.mo145787a(getDepartmentInvitationUrlResponse);
            EduInvitation aVar2 = this.f102091a.f102081h;
            if (aVar2 != null) {
                this.f102091a.mo145793a(this.f102092b, aVar2);
            }
        }

        C40187j(InviteParentChannelActivity inviteParentChannelActivity, ShareActionType shareActionType) {
            this.f102091a = inviteParentChannelActivity;
            this.f102092b = shareActionType;
        }
    }

    /* renamed from: d */
    public static Resources m159260d(InviteParentChannelActivity inviteParentChannelActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteParentChannelActivity);
        }
        return inviteParentChannelActivity.mo145799f();
    }

    /* renamed from: f */
    public static AssetManager m159262f(InviteParentChannelActivity inviteParentChannelActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteParentChannelActivity);
        }
        return inviteParentChannelActivity.mo145802h();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.edu.channel.InviteParentChannelActivity$f */
    public static final class View$OnClickListenerC40183f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteParentChannelActivity f102087a;

        View$OnClickListenerC40183f(InviteParentChannelActivity inviteParentChannelActivity) {
            this.f102087a = inviteParentChannelActivity;
        }

        public final void onClick(View view) {
            InviteParentNonDirectionActivity.Companion aVar = InviteParentNonDirectionActivity.f102093a;
            InviteParentChannelActivity inviteParentChannelActivity = this.f102087a;
            aVar.mo145829a(inviteParentChannelActivity, inviteParentChannelActivity.mo145790a(), "qr_code", this.f102087a.mo145795c(), this.f102087a.mo145794b());
            InvHitPoint.m160370c(2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.edu.channel.InviteParentChannelActivity$g */
    public static final class View$OnClickListenerC40184g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteParentChannelActivity f102088a;

        View$OnClickListenerC40184g(InviteParentChannelActivity inviteParentChannelActivity) {
            this.f102088a = inviteParentChannelActivity;
        }

        public final void onClick(View view) {
            InviteParentNonDirectionActivity.Companion aVar = InviteParentNonDirectionActivity.f102093a;
            InviteParentChannelActivity inviteParentChannelActivity = this.f102088a;
            aVar.mo145829a(inviteParentChannelActivity, inviteParentChannelActivity.mo145790a(), "link", this.f102088a.mo145795c(), this.f102088a.mo145794b());
            InvHitPoint.m160370c(3);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.edu.channel.InviteParentChannelActivity$i */
    public static final class View$OnClickListenerC40186i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteParentChannelActivity f102090a;

        View$OnClickListenerC40186i(InviteParentChannelActivity inviteParentChannelActivity) {
            this.f102090a = inviteParentChannelActivity;
        }

        public final void onClick(View view) {
            IInvitationModuleDependency a = C40147z.m159160a();
            InviteParentChannelActivity inviteParentChannelActivity = this.f102090a;
            InviteParentChannelActivity inviteParentChannelActivity2 = inviteParentChannelActivity;
            String c = inviteParentChannelActivity.mo145795c();
            String str = InviteParentChannelActivity.m159257b(this.f102090a).department_alias_name;
            Integer num = InviteParentChannelActivity.m159257b(this.f102090a).inactive_member_count;
            Intrinsics.checkExpressionValueIsNotNull(num, "response.inactive_member_count");
            a.openInviteInactiveParentListActivity(inviteParentChannelActivity2, c, str, num.intValue());
            InvHitPoint.m160408t();
        }
    }

    /* renamed from: e */
    public static void m159261e(InviteParentChannelActivity inviteParentChannelActivity) {
        inviteParentChannelActivity.mo145800g();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InviteParentChannelActivity inviteParentChannelActivity2 = inviteParentChannelActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inviteParentChannelActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private final void m159256a(List<C40327a> list) {
        list.add(new C40327a(UIHelper.getString(R.string.Lark_Education_RemindParentActivate)));
        GetDepartmentInactiveInfoResponse getDepartmentInactiveInfoResponse = this.f102080g;
        if (getDepartmentInactiveInfoResponse == null) {
            Intrinsics.throwUninitializedPropertyAccessException("response");
        }
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Education_ContactScope, "ContactScope", getDepartmentInactiveInfoResponse.department_alias_name);
        GetDepartmentInactiveInfoResponse getDepartmentInactiveInfoResponse2 = this.f102080g;
        if (getDepartmentInactiveInfoResponse2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("response");
        }
        Integer num = getDepartmentInactiveInfoResponse2.inactive_member_count;
        Intrinsics.checkExpressionValueIsNotNull(num, "response.inactive_member_count");
        list.add(new C40327a(mustacheFormat, num.intValue(), new View$OnClickListenerC40186i(this)));
    }

    /* renamed from: b */
    private final void m159258b(List<C40327a> list) {
        list.add(new C40327a(UIHelper.getString(R.string.Lark_Education_InviteMoreParents)));
        IInvitationModuleDependency a = C40147z.m159160a();
        Intrinsics.checkExpressionValueIsNotNull(a, "dependency");
        if (!a.isGooglePlay() && a.isFgEnable("third.share.wx.enable")) {
            list.add(new C40327a(R.drawable.ud_icon_wechat_colorful, 0, UIHelper.getString(R.string.Lark_Invitation_AddMembersWechatInvite), new C40182e(this)));
        }
        list.add(new C40327a(R.drawable.ud_icon_qr_outlined, R.color.ud_W500, UIHelper.getString(R.string.Lark_Education_QRCodeInvite), UIHelper.getString(R.string.Lark_Education_QRCodeInviteDesc), new View$OnClickListenerC40183f(this)));
        list.add(new C40327a(R.drawable.ud_icon_link_copy_outlined, R.color.ud_O500, UIHelper.getString(R.string.Lark_Education_LinkInvite), UIHelper.getString(R.string.Lark_Education_QRCodeInviteDesc), new View$OnClickListenerC40184g(this)));
        list.add(new C40327a(R.drawable.ud_icon_lark_outlined, R.color.primary_pri_500, UIHelper.mustacheFormat((int) R.string.Lark_Education_FeishuInvite), new C40185h(this)));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("from_scenes");
        if (stringExtra == null) {
            stringExtra = "edu_contact";
        }
        this.f102074a = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("chat_id");
        String str = "";
        if (stringExtra2 == null) {
            stringExtra2 = str;
        }
        this.f102075b = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("departments");
        if (stringExtra3 != null) {
            str = stringExtra3;
        }
        this.f102076c = str;
        StringBuilder sb = new StringBuilder();
        sb.append("onCreate InviteMemberChannelEduActivity from: ");
        String str2 = this.f102074a;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("from");
        }
        sb.append(str2);
        sb.append(", departments: ");
        String str3 = this.f102076c;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("departments");
        }
        sb.append(str3);
        sb.append(", chatId: ");
        String str4 = this.f102075b;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatId");
        }
        sb.append(str4);
        Log.m165389i("InvitationModule", sb.toString());
        setContentView(R.layout.inv_invite_member_channel_edu_activity);
        m159263i();
        ((InvErrorView) mo145789a(R.id.imceErrorView)).setOnClickListener(new View$OnClickListenerC40181d(this));
        RecyclerView recyclerView = (RecyclerView) mo145789a(R.id.imceRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "imceRv");
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.f102079f = new C58973b<>();
        mo145797d();
        InvHitPoint.m160406s();
    }

    /* renamed from: a */
    public final void mo145792a(ShareActionType shareActionType) {
        EduInvitation aVar = this.f102081h;
        if (aVar == null) {
            if (this.f102078e == null) {
                this.f102078e = ViewUtils.m224154c(this);
            }
            ViewUtils.C57751a aVar2 = this.f102078e;
            if (aVar2 != null) {
                aVar2.mo196039b();
            }
            GetDepartmentInvitationUrlRequest.C16232a aVar3 = new GetDepartmentInvitationUrlRequest.C16232a();
            String str = this.f102075b;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatId");
            }
            if (!TextUtils.isEmpty(str)) {
                String str2 = this.f102075b;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("chatId");
                }
                aVar3.mo58167b(str2);
                aVar3.mo58164a(InvitationSource.HOME_SCHOOL_CHAT);
            } else {
                String str3 = this.f102076c;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("departments");
                }
                aVar3.mo58165a(str3);
                aVar3.mo58164a(InvitationSource.HOME_SCHOOL_CONTACT);
            }
            C40147z.m159162b().getDepartmentInvitationInfo(aVar3, new UIGetDataCallback(new C40187j(this, shareActionType)));
        } else if (aVar != null) {
            mo145793a(shareActionType, aVar);
        }
    }

    /* renamed from: a */
    public static Context m159252a(InviteParentChannelActivity inviteParentChannelActivity, Configuration configuration) {
        Context a = inviteParentChannelActivity.mo145788a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m159255a(InviteParentChannelActivity inviteParentChannelActivity, Context context) {
        inviteParentChannelActivity.mo145791a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteParentChannelActivity);
        }
    }

    /* renamed from: a */
    public final void mo145793a(ShareActionType shareActionType, EduInvitation aVar) {
        if (Intrinsics.areEqual(shareActionType, C55761a.m215988a())) {
            C40157a.m159181a(this, aVar.mo145785h());
            InvApmUtils.m158968a("ug_invite_parent_nondirectional_share", true, (Map<String, ? extends Object>) MapsKt.mapOf(TuplesKt.to(ShareHitPoint.f121869d, "link"), TuplesKt.to("item", shareActionType.name())));
        } else if (Intrinsics.areEqual(shareActionType, ShareActionType.WX)) {
            C40157a.m159186b(this, aVar, new InviteParentChannelActivity$processShareReal$1());
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10010 && i2 == -1) {
            LKUIToast.show(this, (int) R.string.Lark_Invitation_AddMembersSucceedTitle);
        }
    }
}
