package com.ss.android.lark.invitation.v2.feat.member.debug;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.inv.export.ui.InvBaseFragmentActivity;
import com.ss.android.lark.inv.export.util.C40103e;
import com.ss.android.lark.inv.export.util.C40132r;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.thirdshare.base.C55680a;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import com.ss.android.lark.thirdshare.container.LarkShareContainer;
import com.ss.android.lark.thirdshare.container.LarkShareContainerConfig;
import com.ss.android.lark.thirdshare.container.LarkShareContainerUiConfig;
import com.ss.android.lark.thirdshare.container.p2744b.C55730a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/debug/InviteDebugActivity;", "Lcom/ss/android/lark/inv/export/ui/InvBaseFragmentActivity;", "()V", "curShareType", "", "getCurShareType", "()I", "setCurShareType", "(I)V", "Lcom/ss/android/lark/thirdshare/base/export/ShareActionType;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showMockContainer", "updateCurShareType", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InviteDebugActivity extends InvBaseFragmentActivity {

    /* renamed from: a */
    public static final Map<Integer, ShareActionType> f102532a = MapsKt.mapOf(TuplesKt.to(0, ShareActionType.WX), TuplesKt.to(1, ShareActionType.WX_TIMELINE), TuplesKt.to(2, ShareActionType.QQ), TuplesKt.to(3, ShareActionType.WB));

    /* renamed from: b */
    public static int f102533b;

    /* renamed from: c */
    public static final Companion f102534c = new Companion(null);

    /* renamed from: d */
    private int f102535d;

    /* renamed from: e */
    private HashMap f102536e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/invitation/v2/feat/member/debug/InviteDebugActivity$showMockContainer$2", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$LinkConfigSupplier;", "getLinkConfig", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$LinkConfig;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.debug.InviteDebugActivity$h */
    public static final class C40364h implements LarkShareContainerConfig.LinkConfigSupplier {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/invitation/v2/feat/member/debug/InviteDebugActivity$showMockContainer$2$getLinkConfig$1", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$RetryCallback;", "onRetry", "", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.invitation.v2.feat.member.debug.InviteDebugActivity$h$a */
        public static final class C40365a implements LarkShareContainerConfig.RetryCallback {
            C40365a() {
            }

            @Override // com.ss.android.lark.thirdshare.container.LarkShareContainerConfig.RetryCallback
            /* renamed from: a */
            public void mo146277a() {
                ViewUtils.m224150a("onRetry");
            }
        }

        C40364h() {
        }

        @Override // com.ss.android.lark.thirdshare.container.LarkShareContainerConfig.LinkConfigSupplier
        /* renamed from: a */
        public LarkShareContainerConfig.LinkConfig mo146276a() {
            Thread.sleep(2000);
            Companion aVar = InviteDebugActivity.f102534c;
            aVar.mo146265a(aVar.mo146264a() + 1);
            if (InviteDebugActivity.f102534c.mo146264a() % 3 == 0) {
                return LarkShareContainerConfig.LinkConfig.f137448h.mo189908a("link error", new C40365a());
            }
            LarkShareContainerConfig.LinkConfig.Companion aVar2 = LarkShareContainerConfig.LinkConfig.f137448h;
            IInvitationModuleDependency a = C40147z.m159160a();
            Intrinsics.checkExpressionValueIsNotNull(a, "InvUtils.getDep()");
            IInvitationModuleDependency.AbstractC40087c loginDependency = a.getLoginDependency();
            Intrinsics.checkExpressionValueIsNotNull(loginDependency, "InvUtils.getDep().loginDependency");
            String c = loginDependency.mo145587c();
            Intrinsics.checkExpressionValueIsNotNull(c, "InvUtils.getDep().loginD…ndency.loginUserAvatarKey");
            IInvitationModuleDependency a2 = C40147z.m159160a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "InvUtils.getDep()");
            IInvitationModuleDependency.AbstractC40087c loginDependency2 = a2.getLoginDependency();
            Intrinsics.checkExpressionValueIsNotNull(loginDependency2, "InvUtils.getDep().loginDependency");
            String a3 = loginDependency2.mo145582a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "InvUtils.getDep().loginDependency.loginUserId");
            LarkShareContainerConfig.LinkConfig a4 = aVar2.mo189909a("lark.container.app.share.link", "卡片title", new LarkShareContainerConfig.Head(c, a3, "name", "desc"), "我在飞书分享了一个应用给你，快点击链接查看 https://www.baidu.com/", "https://www.baidu.com/", new InviteDebugActivity$showMockContainer$2$getLinkConfig$success$1());
            a4.mo189897c("该链接在7天内（04/19）有效");
            a4.mo189899d("该群组为 Bytedance 内部群，仅限内部成员点击链接加入");
            return a4;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/invitation/v2/feat/member/debug/InviteDebugActivity$showMockContainer$3", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$QrcodeConfigSupplier;", "getQrcodeConfig", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$QrcodeConfig;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.debug.InviteDebugActivity$i */
    public static final class C40366i implements LarkShareContainerConfig.QrcodeConfigSupplier {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/invitation/v2/feat/member/debug/InviteDebugActivity$showMockContainer$3$getQrcodeConfig$1", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$RetryCallback;", "onRetry", "", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.invitation.v2.feat.member.debug.InviteDebugActivity$i$a */
        public static final class C40367a implements LarkShareContainerConfig.RetryCallback {
            C40367a() {
            }

            @Override // com.ss.android.lark.thirdshare.container.LarkShareContainerConfig.RetryCallback
            /* renamed from: a */
            public void mo146277a() {
                ViewUtils.m224150a("onRetry");
            }
        }

        C40366i() {
        }

        @Override // com.ss.android.lark.thirdshare.container.LarkShareContainerConfig.QrcodeConfigSupplier
        /* renamed from: a */
        public LarkShareContainerConfig.QrcodeConfig mo146278a() {
            Thread.sleep(2000);
            Companion aVar = InviteDebugActivity.f102534c;
            aVar.mo146265a(aVar.mo146264a() + 1);
            if (InviteDebugActivity.f102534c.mo146264a() % 3 == 0) {
                return LarkShareContainerConfig.QrcodeConfig.f137460f.mo189923a("link error", new C40367a());
            }
            LarkShareContainerConfig.QrcodeConfig.Companion aVar2 = LarkShareContainerConfig.QrcodeConfig.f137460f;
            IInvitationModuleDependency a = C40147z.m159160a();
            Intrinsics.checkExpressionValueIsNotNull(a, "InvUtils.getDep()");
            IInvitationModuleDependency.AbstractC40087c loginDependency = a.getLoginDependency();
            Intrinsics.checkExpressionValueIsNotNull(loginDependency, "InvUtils.getDep().loginDependency");
            String c = loginDependency.mo145587c();
            Intrinsics.checkExpressionValueIsNotNull(c, "InvUtils.getDep().loginD…ndency.loginUserAvatarKey");
            IInvitationModuleDependency a2 = C40147z.m159160a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "InvUtils.getDep()");
            IInvitationModuleDependency.AbstractC40087c loginDependency2 = a2.getLoginDependency();
            Intrinsics.checkExpressionValueIsNotNull(loginDependency2, "InvUtils.getDep().loginDependency");
            String a3 = loginDependency2.mo145582a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "InvUtils.getDep().loginDependency.loginUserId");
            LarkShareContainerConfig.QrcodeConfig a4 = aVar2.mo189924a("lark.container.app.share.qrcode", new LarkShareContainerConfig.Head(c, a3, "name", "desc"), "https://www.baidu.com/", new InviteDebugActivity$showMockContainer$3$getQrcodeConfig$success$1());
            a4.mo189912a("该链接在7天内（04/19）有效");
            a4.mo189914b("该群组为 Bytedance 内部群，仅限内部成员点击链接加入");
            return a4;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/invitation/v2/feat/member/debug/InviteDebugActivity$showMockContainer$4", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainer$LarkShareContainerSupplier;", "getContainer", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainer;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.debug.InviteDebugActivity$j */
    public static final class C40368j implements LarkShareContainer.LarkShareContainerSupplier {

        /* renamed from: a */
        final /* synthetic */ ArrayList f102544a;

        /* renamed from: b */
        final /* synthetic */ LarkShareContainerConfig f102545b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/invitation/v2/feat/member/debug/InviteDebugActivity$showMockContainer$4$getContainer$1", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerUiConfig$UiCallback;", "onDismiss", "", "onShow", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.invitation.v2.feat.member.debug.InviteDebugActivity$j$a */
        public static final class C40369a implements LarkShareContainerUiConfig.UiCallback {
            C40369a() {
            }

            @Override // com.ss.android.lark.thirdshare.container.LarkShareContainerUiConfig.UiCallback
            /* renamed from: a */
            public void mo146280a() {
                ViewUtils.m224150a("onShow");
            }

            @Override // com.ss.android.lark.thirdshare.container.LarkShareContainerUiConfig.UiCallback
            /* renamed from: b */
            public void mo146281b() {
                ViewUtils.m224150a("onDismiss");
            }
        }

        @Override // com.ss.android.lark.thirdshare.container.LarkShareContainer.LarkShareContainerSupplier
        /* renamed from: a */
        public LarkShareContainer mo146279a() {
            return new LarkShareContainer(new LarkShareContainerUiConfig("分享组件 title", "link", this.f102544a, new C40369a()), this.f102545b);
        }

        C40368j(ArrayList arrayList, LarkShareContainerConfig larkShareContainerConfig) {
            this.f102544a = arrayList;
            this.f102545b = larkShareContainerConfig;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m159937a(Context context) {
        f102534c.mo146266a(context);
    }

    /* renamed from: a */
    public Context mo146252a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m159938a(this, context);
    }

    /* renamed from: b */
    public View mo146254b(int i) {
        if (this.f102536e == null) {
            this.f102536e = new HashMap();
        }
        View view = (View) this.f102536e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f102536e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public void mo146256b(Context context) {
        super.attachBaseContext(context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m159935a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo146260e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo146261f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo146262g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m159940c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m159936a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m159939b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/debug/InviteDebugActivity$Companion;", "", "()V", "SHARE_CONTAINER_LINK_ID", "", "SHARE_CONTAINER_QRCODE_ID", "TAG", "flag", "", "getFlag", "()I", "setFlag", "(I)V", "shareTypeMap", "", "Lcom/ss/android/lark/thirdshare/base/export/ShareActionType;", "getShareTypeMap", "()Ljava/util/Map;", "isURL", "", "input", "", "start", "", "context", "Landroid/content/Context;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.debug.InviteDebugActivity$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo146264a() {
            return InviteDebugActivity.f102533b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo146265a(int i) {
            InviteDebugActivity.f102533b = i;
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo146266a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            context.startActivity(new Intent(context, InviteDebugActivity.class));
        }

        /* renamed from: a */
        public final boolean mo146267a(CharSequence charSequence) {
            return Pattern.matches("[a-zA-z]+://[^\\s]*", charSequence);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/invitation/v2/feat/member/debug/InviteDebugActivity$showMockContainer$1", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$ForwardCallback;", "onForward", "", "targets", "", "Lcom/ss/android/lark/thirdshare/container/bean/ForwardTarget4Container;", "extraMsg", "", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.debug.InviteDebugActivity$g */
    public static final class C40363g implements LarkShareContainerConfig.ForwardCallback {
        C40363g() {
        }

        @Override // com.ss.android.lark.thirdshare.container.LarkShareContainerConfig.ForwardCallback
        /* renamed from: a */
        public void mo146275a(List<? extends C55730a> list, String str) {
            Intrinsics.checkParameterIsNotNull(list, "targets");
            Intrinsics.checkParameterIsNotNull(str, "extraMsg");
            Log.m165383e("InvitationModule", "chatIds -> " + list + ", extraMsg -> " + str);
        }
    }

    /* renamed from: a */
    public final int mo146251a() {
        return this.f102535d;
    }

    /* renamed from: b */
    public final void mo146255b() {
        ((TextView) mo146254b(R.id.idToggleShareType)).setText(String.valueOf(mo146257c()));
    }

    /* renamed from: c */
    public final ShareActionType mo146257c() {
        Map<Integer, ShareActionType> map = f102532a;
        return map.get(Integer.valueOf(this.f102535d % map.size()));
    }

    /* renamed from: d */
    public final void mo146259d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LarkShareContainerUiConfig.Tab.f137477d.mo189933a("inapp", "all"));
        arrayList.add(LarkShareContainerUiConfig.Tab.f137477d.mo189934b("link", "round_rect"));
        arrayList.add(LarkShareContainerUiConfig.Tab.f137477d.mo189935c("qrcode", "circle"));
        LarkShareContainerConfig larkShareContainerConfig = new LarkShareContainerConfig();
        larkShareContainerConfig.mo189876a(LarkShareContainerConfig.InappConfig.f137445c.mo189890a("confirm title", new C40363g()));
        larkShareContainerConfig.mo189877a(new C40364h());
        larkShareContainerConfig.mo189878a(new C40366i());
        LarkShareContainer.f137484c.mo189939a(this, new C40368j(arrayList, larkShareContainerConfig));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.debug.InviteDebugActivity$c */
    static final class View$OnClickListenerC40357c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteDebugActivity f102538a;

        View$OnClickListenerC40357c(InviteDebugActivity inviteDebugActivity) {
            this.f102538a = inviteDebugActivity;
        }

        public final void onClick(View view) {
            this.f102538a.mo146259d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.debug.InviteDebugActivity$e */
    static final class View$OnClickListenerC40359e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteDebugActivity f102540a;

        View$OnClickListenerC40359e(InviteDebugActivity inviteDebugActivity) {
            this.f102540a = inviteDebugActivity;
        }

        public final void onClick(View view) {
            C55680a.m215708a(this.f102540a.mo146257c(), "分享内容文本", C403601.f102541a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.debug.InviteDebugActivity$d */
    static final class View$OnClickListenerC40358d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteDebugActivity f102539a;

        View$OnClickListenerC40358d(InviteDebugActivity inviteDebugActivity) {
            this.f102539a = inviteDebugActivity;
        }

        public final void onClick(View view) {
            InviteDebugActivity inviteDebugActivity = this.f102539a;
            inviteDebugActivity.mo146253a(inviteDebugActivity.mo146251a() + 1);
            this.f102539a.mo146255b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.debug.InviteDebugActivity$f */
    static final class View$OnClickListenerC40361f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteDebugActivity f102542a;

        View$OnClickListenerC40361f(InviteDebugActivity inviteDebugActivity) {
            this.f102542a = inviteDebugActivity;
        }

        public final void onClick(View view) {
            C55680a.m215705a(this.f102542a.mo146257c(), BitmapFactory.decodeResource(UIHelper.getResources(), R.drawable.ic_launcher), C403621.f102543a);
        }
    }

    /* renamed from: a */
    public static Resources m159936a(InviteDebugActivity inviteDebugActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteDebugActivity);
        }
        return inviteDebugActivity.mo146260e();
    }

    /* renamed from: c */
    public static AssetManager m159940c(InviteDebugActivity inviteDebugActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteDebugActivity);
        }
        return inviteDebugActivity.mo146262g();
    }

    /* renamed from: b */
    public static void m159939b(InviteDebugActivity inviteDebugActivity) {
        inviteDebugActivity.mo146261f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InviteDebugActivity inviteDebugActivity2 = inviteDebugActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inviteDebugActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.debug.InviteDebugActivity$b */
    static final class View$OnClickListenerC40356b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteDebugActivity f102537a;

        View$OnClickListenerC40356b(InviteDebugActivity inviteDebugActivity) {
            this.f102537a = inviteDebugActivity;
        }

        public final void onClick(View view) {
            int i;
            boolean z;
            String obj = ((EditText) this.f102537a.mo146254b(R.id.idInputUrlEt)).getText().toString();
            int length = obj.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (obj.charAt(i) <= ' ') {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i2++;
                    }
                } else if (!z) {
                    break;
                } else {
                    length--;
                }
            }
            String obj2 = obj.subSequence(i2, length + 1).toString();
            String str = obj2;
            if (TextUtils.isEmpty(str)) {
                ViewUtils.m224150a("Please input url.");
                return;
            }
            if (!InviteDebugActivity.f102534c.mo146267a(str)) {
                if (obj2 != null) {
                    char[] charArray = obj2.toCharArray();
                    Intrinsics.checkExpressionValueIsNotNull(charArray, "(this as java.lang.String).toCharArray()");
                    if (Character.isDigit(charArray[0])) {
                        obj2 = "http://" + obj2;
                    } else {
                        obj2 = "https://" + obj2;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            C40132r.m159118a(obj2);
        }
    }

    /* renamed from: a */
    public final void mo146253a(int i) {
        this.f102535d = i;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.inv_invite_debug_activity);
        C40103e.m159005a((TextView) mo146254b(R.id.idJumpTv), new View$OnClickListenerC40356b(this));
        ((TextView) mo146254b(R.id.idShareContainer)).setOnClickListener(new View$OnClickListenerC40357c(this));
        Map<Integer, ShareActionType> map = f102532a;
        ((TextView) mo146254b(R.id.idToggleShareType)).setText(String.valueOf(map.get(Integer.valueOf(this.f102535d % map.size()))));
        ((TextView) mo146254b(R.id.idToggleShareType)).setOnClickListener(new View$OnClickListenerC40358d(this));
        ((TextView) mo146254b(R.id.idShareTextSys)).setOnClickListener(new View$OnClickListenerC40359e(this));
        ((TextView) mo146254b(R.id.idShareImageSys)).setOnClickListener(new View$OnClickListenerC40361f(this));
    }

    /* renamed from: a */
    public static void m159938a(InviteDebugActivity inviteDebugActivity, Context context) {
        inviteDebugActivity.mo146256b(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteDebugActivity);
        }
    }

    /* renamed from: a */
    public static Context m159935a(InviteDebugActivity inviteDebugActivity, Configuration configuration) {
        Context a = inviteDebugActivity.mo146252a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
