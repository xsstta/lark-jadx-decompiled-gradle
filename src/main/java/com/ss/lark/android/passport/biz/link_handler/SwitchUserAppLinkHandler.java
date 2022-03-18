package com.ss.lark.android.passport.biz.link_handler;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.IUserListService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.entity.SessionResult;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService;
import com.ss.lark.android.passport.biz.widget.C65297d;
import com.tt.frontendapiinterface.ApiHandler;
import ee.android.framework.manis.C68183b;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u001c\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\r"}, d2 = {"Lcom/ss/lark/android/passport/biz/link_handler/SwitchUserAppLinkHandler;", "Lcom/ss/lark/android/passport/biz/link_handler/PassportAppLinkHandler;", "()V", "canOpen", "", "context", "Landroid/content/Context;", "appLink", "Lcom/ss/android/lark/applink/AppLink;", "handle", "needBackToLark", "needHandleLinkByIPC", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.link_handler.i */
public final class SwitchUserAppLinkHandler extends PassportAppLinkHandler {

    /* renamed from: a */
    public static final Companion f164101a = new Companion(null);

    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.applink.AbstractC29186b
    /* renamed from: b */
    public boolean mo103462b(Context context, AppLink appLink) {
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/lark/android/passport/biz/link_handler/SwitchUserAppLinkHandler$Companion;", "", "()V", "KEY_APP_LINK", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.link_handler.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b¸\u0006\u0000"}, d2 = {"com/ss/lark/android/passport/biz/link_handler/SwitchUserAppLinkHandler$handle$3$3", "Lcom/ss/lark/android/passport/biz/link_handler/ISwitchUserManisService$ISwitchUserCallback;", "onError", "", "errCode", "", ApiHandler.API_CALLBACK_ERRMSG, "", "onSuccess", "sessionResult", "Lcom/ss/android/lark/passport/signinsdk_api/entity/SessionResult;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.link_handler.i$b */
    public static final class C65171b implements ISwitchUserManisService.AbstractC65155a {

        /* renamed from: a */
        final /* synthetic */ SwitchUserAppLinkHandler f164102a;

        /* renamed from: b */
        final /* synthetic */ ViewUtils.C57751a f164103b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f164104c;

        /* renamed from: d */
        final /* synthetic */ Context f164105d;

        /* renamed from: e */
        final /* synthetic */ String f164106e;

        /* renamed from: f */
        final /* synthetic */ String f164107f;

        /* renamed from: g */
        final /* synthetic */ String f164108g;

        @Override // com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService.AbstractC65155a
        public void onSuccess(SessionResult sessionResult) {
            this.f164103b.mo196042e();
            this.f164102a.mo224384b().mo171465b("n_action_applink_switch_user", "Switcher user success");
        }

        @Override // com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService.AbstractC65155a
        public void onError(int i, final String str) {
            this.f164103b.mo196042e();
            this.f164102a.mo224384b().mo171471d("n_action_applink_switch_user", str);
            if (-101 != i && str != null && this.f164105d != null) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.lark.android.passport.biz.link_handler.SwitchUserAppLinkHandler.C65171b.RunnableC651721 */

                    public final void run() {
                        UDToast.makeToast(this.f164105d, str).show();
                    }
                });
            }
        }

        C65171b(SwitchUserAppLinkHandler iVar, ViewUtils.C57751a aVar, WeakReference weakReference, Context context, String str, String str2, String str3) {
            this.f164102a = iVar;
            this.f164103b = aVar;
            this.f164104c = weakReference;
            this.f164105d = context;
            this.f164106e = str;
            this.f164107f = str2;
            this.f164108g = str3;
        }
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        mo224384b().mo171465b("n_action_applink_switch_user", "canOpen");
        if (context != null && appLink != null && !TextUtils.isEmpty(appLink.mo103435a())) {
            return true;
        }
        mo224384b().mo171471d("n_action_applink_switch_user", "canOpen invalid parameter");
        return false;
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, AppLink appLink) {
        String str;
        String str2;
        Resources resources;
        mo224384b().mo171465b("n_action_applink_switch_user", "start");
        if (appLink == null) {
            mo224384b().mo171464b("n_action_applink_is_null");
            return false;
        }
        User foregroundUser = ((IUserListService) ServiceFinder.m193746a(IUserListService.class)).getForegroundUser();
        if (foregroundUser == null || !foregroundUser.isExcludeLogin()) {
            UniContext uniContext = UniContext.CONTEXT_SWITCH;
            PassportLog b = mo224384b();
            StringBuilder sb = new StringBuilder();
            sb.append("SwitchUserHandler handle context:");
            sb.append(context);
            sb.append(",thread:");
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            b.mo171461a("n_action_applink_switch_user", sb.toString());
            if (context == null || (resources = context.getResources()) == null) {
                str = null;
            } else {
                str = resources.getString(R.string.Lark_Setting_SwitchUserLoadingTip);
            }
            ViewUtils.C57751a a = ViewUtils.m224143a(context, str);
            a.mo196039b();
            WeakReference weakReference = new WeakReference(context);
            Uri parse = Uri.parse(appLink.mo103435a());
            mo224384b().mo171465b("n_action_applink_switch_user", "url: " + appLink.mo103435a() + ' ');
            String queryParameter = parse.getQueryParameter("X-Flow-Key");
            if (queryParameter == null) {
                mo224384b().mo171464b("n_action_x_flow_key_is_empty");
                Unit unit = Unit.INSTANCE;
            }
            String queryParameter2 = parse.getQueryParameter("flow_type");
            if (queryParameter2 == null) {
                mo224384b().mo171464b("n_action_flow_type_is_empty");
                Unit unit2 = Unit.INSTANCE;
            }
            String queryParameter3 = parse.getQueryParameter("user_id");
            if (queryParameter3 != null) {
                User foregroundUser2 = ServiceFinder.m193744a().getForegroundUser();
                if (foregroundUser2 != null) {
                    str2 = foregroundUser2.userId;
                } else {
                    str2 = null;
                }
                if (Intrinsics.areEqual(queryParameter3, str2)) {
                    a.mo196042e();
                    Context context2 = (Context) weakReference.get();
                    if (context2 != null) {
                        mo224384b().mo171460a("n_action_launch_feed_page");
                        ServiceFinder.m193752g().launchMainWindow(context2, null, new Bundle());
                        return true;
                    }
                    mo224384b().mo171464b("n_action_applink_context_empty");
                    return true;
                }
                ISwitchUserManisService iSwitchUserManisService = (ISwitchUserManisService) C68183b.m264839a().mo237086a(context, ISwitchUserManisService.class);
                if (iSwitchUserManisService != null) {
                    iSwitchUserManisService.switchUser(queryParameter3, queryParameter2, queryParameter, new C65171b(this, a, weakReference, context, queryParameter3, queryParameter2, queryParameter));
                    return true;
                }
                mo224384b().mo171464b("n_action_switch_user_manis_service_is_null");
                return true;
            }
            a.mo196042e();
            mo224384b().mo171464b("n_action_userId_is_empty");
            return true;
        }
        new C65297d().mo224649a(foregroundUser, mo224384b());
        return false;
    }
}
