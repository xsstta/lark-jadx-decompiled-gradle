package com.ss.lark.android.passport.biz.link_handler;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.storage.C49216a;
import com.ss.lark.android.passport.biz.feature.sso.loading.TransparentLoadingActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\f\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\u001c\u0010\u000e\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/lark/android/passport/biz/link_handler/JoinTeamHandler;", "Lcom/ss/lark/android/passport/biz/link_handler/PassportAppLinkHandler;", "()V", "ACTIVITY_FLAG", "", "JOIN_TEAM_APPLINK", "canOpen", "", "context", "Landroid/content/Context;", "appLink", "Lcom/ss/android/lark/applink/AppLink;", "handle", "needBackToLark", "needLogin", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.link_handler.b */
public final class JoinTeamHandler extends PassportAppLinkHandler {

    /* renamed from: a */
    public static final Companion f164081a = new Companion(null);

    /* renamed from: b */
    private final String f164082b = "activity_flag";

    /* renamed from: c */
    private final String f164083c = "join_team";

    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return true;
    }

    @Override // com.ss.android.lark.applink.AbstractC29186b
    /* renamed from: a */
    public boolean mo103460a(Context context, AppLink appLink) {
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/lark/android/passport/biz/link_handler/JoinTeamHandler$Companion;", "", "()V", "KEY_APP_LINK", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.link_handler.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        mo224384b().mo171465b("n_action_applink_join_team", "canOpen");
        if (context != null && appLink != null && !TextUtils.isEmpty(appLink.mo103435a())) {
            return true;
        }
        mo224384b().mo171471d("n_action_applink_join_team", "canOpen invalid parameter");
        return false;
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, AppLink appLink) {
        mo224384b().mo171465b("n_action_applink_join_team", "start");
        if (appLink == null) {
            mo224384b().mo171464b("n_action_applink_is_null");
            return false;
        }
        String queryParameter = Uri.parse(appLink.mo103435a()).getQueryParameter("X-Flow-Key");
        if (queryParameter != null) {
            PassportLog b = mo224384b();
            b.mo171471d("n_action_applink_join_team", "xFlowKey:" + queryParameter);
            C49216a.m194036a().mo171740a("X-Flow-Key", queryParameter);
        } else {
            mo224384b().mo171464b("n_action_x_flow_key_is_empty");
        }
        Intent intent = new Intent(context, TransparentLoadingActivity.class);
        intent.putExtra(this.f164082b, this.f164083c);
        intent.addFlags(65536);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        mo224384b().mo171465b("n_action_applink_join_team", "start loadingActivity");
        if (context == null) {
            return true;
        }
        context.startActivity(intent);
        return true;
    }
}
