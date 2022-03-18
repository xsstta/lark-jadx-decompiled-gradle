package com.bytedance.ee.bear.block.jira;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.block.jira.JiraViewModel;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u000e\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/block/jira/JiraPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "()V", "jarLinkInterceptor", "Landroid/webkit/WebViewClient;", "jiraViewModel", "Lcom/bytedance/ee/bear/block/jira/JiraViewModel;", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "onAttachToUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "onDetachFromUIContainer", "Companion", "JiraActionHandler", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class JiraPlugin extends DocumentPlugin {
    public static final Companion Companion = new Companion(null);
    public static JiraConfig publicJiraConfig;
    private WebViewClient jarLinkInterceptor = new C4906c(this);
    public JiraViewModel jiraViewModel;

    @JvmStatic
    public static final boolean interceptJiraUrl(String str, Activity activity) {
        return Companion.mo19259a(str, activity);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001a\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\"\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/block/jira/JiraPlugin$Companion;", "", "()V", "BIZ_BITABLE_LAUNCH_ACTIONSHEET", "", "TAG", "publicJiraConfig", "Lcom/bytedance/ee/bear/block/jira/JiraConfig;", "canInterceptPublicJira", "", "host", "doPrivateJiraIntercept", "uri", "Landroid/net/Uri;", "doPublicJiraIntercept", "activity", "Landroid/app/Activity;", "interceptJiraUrl", "url", "sendIntent", "packageName", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.block.jira.JiraPlugin$a */
    public static final class Companion {
        /* renamed from: a */
        private final boolean m20204a(Uri uri) {
            return false;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final boolean m20206a(java.lang.String r6) {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.block.jira.JiraPlugin.Companion.m20206a(java.lang.String):boolean");
        }

        /* renamed from: a */
        private final boolean m20205a(Uri uri, Activity activity) {
            String str;
            Companion aVar = this;
            if (aVar.m20206a(uri.getHost())) {
                JiraConfig bVar = JiraPlugin.publicJiraConfig;
                if (bVar != null) {
                    str = bVar.mo19282a();
                } else {
                    str = null;
                }
                if (aVar.m20207a(str, uri, activity)) {
                    return true;
                }
            }
            return false;
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean mo19259a(String str, Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            JiraConfig bVar = JiraPlugin.publicJiraConfig;
            if (bVar == null || !bVar.mo19287b() || TextUtils.isEmpty(str)) {
                return false;
            }
            Uri parse = Uri.parse(str);
            Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
            if (TextUtils.isEmpty(parse.getHost())) {
                return false;
            }
            if (JiraPlugin.Companion.m20205a(parse, activity) || JiraPlugin.Companion.m20204a(parse)) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private final boolean m20207a(String str, Uri uri, Activity activity) {
            Intent intent = new Intent();
            intent.setPackage(str);
            intent.setAction("android.intent.action.VIEW");
            intent.setData(uri);
            if (intent.resolveActivity(activity.getPackageManager()) == null) {
                return false;
            }
            activity.startActivity(intent);
            return true;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/block/jira/JiraPlugin$JiraActionHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/block/jira/JiraActionData;", "(Lcom/bytedance/ee/bear/block/jira/JiraPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.block.jira.JiraPlugin$b */
    public final class JiraActionHandler implements AbstractC7945d<JiraActionData> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/block/jira/JiraPlugin$JiraActionHandler$handle$1", "Lcom/bytedance/ee/bear/block/jira/JiraViewModel$Delegate;", "onJiraCallBack", "", "blockId", "", "actionId", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.block.jira.JiraPlugin$b$a */
        public static final class C4905a implements JiraViewModel.Delegate {

            /* renamed from: a */
            final /* synthetic */ AbstractC7947h f14427a;

            C4905a(AbstractC7947h hVar) {
                this.f14427a = hVar;
            }

            @Override // com.bytedance.ee.bear.block.jira.JiraViewModel.Delegate
            /* renamed from: a */
            public void mo19261a(String str, String str2) {
                Intrinsics.checkParameterIsNotNull(str, "blockId");
                Intrinsics.checkParameterIsNotNull(str2, "actionId");
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((Object) "blockId", (Object) str);
                jSONObject2.put((Object) "actionId", (Object) str2);
                C13479a.m54772d("JiraPlugin", "callback: data = " + jSONObject);
                AbstractC7947h hVar = this.f14427a;
                if (hVar != null) {
                    hVar.mo17188a(jSONObject);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public JiraActionHandler() {
        }

        /* renamed from: a */
        public void handle(JiraActionData jiraActionData, AbstractC7947h hVar) {
            C13479a.m54764b("JiraPlugin", "launch actionSheet: data = " + jiraActionData);
            if (jiraActionData == null || jiraActionData.isEmpty()) {
                JiraPlugin.access$getJiraViewModel$p(JiraPlugin.this).setActive(false);
                return;
            }
            JiraPlugin.access$getJiraViewModel$p(JiraPlugin.this).setActive(true);
            JiraPlugin.access$getJiraViewModel$p(JiraPlugin.this).setJiraActionData(jiraActionData);
            JiraPlugin.access$getJiraViewModel$p(JiraPlugin.this).setDelegate(new C4905a(hVar));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/block/jira/JiraPlugin$jarLinkInterceptor$1", "Landroid/webkit/WebViewClient;", "shouldOverrideUrlLoading", "", "view", "Landroid/webkit/WebView;", "url", "", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.block.jira.JiraPlugin$c */
    public static final class C4906c extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ JiraPlugin f14428a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4906c(JiraPlugin jiraPlugin) {
            this.f14428a = jiraPlugin;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Companion aVar = JiraPlugin.Companion;
            FragmentActivity activity = this.f14428a.getActivity();
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
            return aVar.mo19259a(str, activity);
        }
    }

    public static final /* synthetic */ JiraViewModel access$getJiraViewModel$p(JiraPlugin jiraPlugin) {
        JiraViewModel eVar = jiraPlugin.jiraViewModel;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("jiraViewModel");
        }
        return eVar;
    }

    public void onAttachToHost(C6095s sVar) {
        Intrinsics.checkParameterIsNotNull(sVar, "host");
        C6095s sVar2 = sVar;
        super.onAttachToHost((C4943e) sVar2);
        AbstractC1142af a = C4950k.m20478a(sVar2, JiraViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "PluginViewModelProviders…iraViewModel::class.java)");
        JiraViewModel eVar = (JiraViewModel) a;
        this.jiraViewModel = eVar;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("jiraViewModel");
        }
        eVar.getActive().mo5923a(getLifecycleOwner(), new C4907d(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.block.jira.JiraPlugin$d */
    public static final class C4907d<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ JiraPlugin f14429a;

        C4907d(JiraPlugin jiraPlugin) {
            this.f14429a = jiraPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            FragmentActivity activity = this.f14429a.getActivity();
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
            Fragment findFragmentByTag = activity.getSupportFragmentManager().findFragmentByTag(JiraActionFragment.f14431d);
            if (!(findFragmentByTag instanceof DialogInterface$OnCancelListenerC1021b)) {
                findFragmentByTag = null;
            }
            DialogInterface$OnCancelListenerC1021b bVar = (DialogInterface$OnCancelListenerC1021b) findFragmentByTag;
            if (Intrinsics.areEqual((Object) true, (Object) bool)) {
                if (bVar == null) {
                    FragmentActivity activity2 = this.f14429a.getActivity();
                    Intrinsics.checkExpressionValueIsNotNull(activity2, "activity");
                    ((DialogInterface$OnCancelListenerC1021b) this.f14429a.instantiateFragment(JiraActionFragment.class)).mo5511a(activity2.getSupportFragmentManager(), JiraActionFragment.f14431d);
                    return;
                }
                C13479a.m54775e("JiraPlugin", "showJiraActionFragment, fragment exist");
            } else if (bVar != null) {
                bVar.mo5513b();
            }
        }
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        getWeb().mo19438b(this.jarLinkInterceptor);
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        publicJiraConfig = new PublicJiraConfig().mo19264a().invoke();
        getWeb().mo19425a(this.jarLinkInterceptor);
        bindBridgeHandler("biz.bitable.launchActionSheet", new JiraActionHandler());
    }
}
