package com.ss.android.lark.mail.service;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.mail.C41724a;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.p2157a.AbstractC41740a;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/mail/service/MailLauncherService;", "Lcom/ss/android/lark/mail/dependency/IMailModuleDependency$IMailLauncherService;", "()V", "getAppLinkHandlers", "", "", "Lcom/ss/android/lark/applink/AppLinkHandler;", "context", "Landroid/content/Context;", "openMessageListActivity", "", "threadId", "fromSideBar", "", "Companion", "HOLDER", "com.ss.android.lark.mail-wrapper"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.c.d */
public final class MailLauncherService implements AbstractC41740a.AbstractC41754m {

    /* renamed from: a */
    public static final MailLauncherService f106049a = HOLDER.f106051a.mo150213a();

    /* renamed from: b */
    public static final Companion f106050b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mail/service/MailLauncherService$Companion;", "", "()V", "instance", "Lcom/ss/android/lark/mail/service/MailLauncherService;", "getInstance", "()Lcom/ss/android/lark/mail/service/MailLauncherService;", "com.ss.android.lark.mail-wrapper"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.c.d$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final MailLauncherService mo150212a() {
            return MailLauncherService.f106049a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mail/service/MailLauncherService$HOLDER;", "", "()V", "INSTANCE", "Lcom/ss/android/lark/mail/service/MailLauncherService;", "getINSTANCE", "()Lcom/ss/android/lark/mail/service/MailLauncherService;", "com.ss.android.lark.mail-wrapper"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.c.d$b */
    private static final class HOLDER {

        /* renamed from: a */
        public static final HOLDER f106051a = new HOLDER();

        /* renamed from: b */
        private static final MailLauncherService f106052b = new MailLauncherService();

        private HOLDER() {
        }

        /* renamed from: a */
        public final MailLauncherService mo150213a() {
            return f106052b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/mail/service/MailLauncherService$getAppLinkHandlers$linkHandler$1", "Lcom/ss/android/lark/applink/AppLinkHandler;", "canOpen", "", "context", "Landroid/content/Context;", "appLink", "Lcom/ss/android/lark/applink/AppLink;", "handle", "handleContext", "needBackToLark", "com.ss.android.lark.mail-wrapper"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.c.d$c */
    public static final class C41770c extends AbstractC29186b {

        /* renamed from: a */
        final /* synthetic */ MailLauncherService f106053a;

        @Override // com.ss.android.lark.applink.AbstractC29194f
        /* renamed from: a */
        public boolean mo103482a() {
            return true;
        }

        @Override // com.ss.android.lark.applink.AbstractC29194f
        /* renamed from: d */
        public boolean mo103484d(Context context, AppLink appLink) {
            Intrinsics.checkParameterIsNotNull(appLink, "appLink");
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41770c(MailLauncherService dVar) {
            this.f106053a = dVar;
        }

        @Override // com.ss.android.lark.applink.AbstractC29194f
        /* renamed from: c */
        public boolean mo103483c(Context context, AppLink appLink) {
            String str;
            Intrinsics.checkParameterIsNotNull(appLink, "appLink");
            boolean z = false;
            if (context == null) {
                return false;
            }
            Uri parse = Uri.parse(appLink.mo103435a());
            AbstractC41740a a = C41724a.m165678a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MailModule.getDependency()");
            if (TextUtils.equals(parse.getQueryParameter("ownerId"), a.getUserId())) {
                str = parse.getQueryParameter("threadIdOwner");
            } else {
                str = parse.getQueryParameter("threadIdEditor");
            }
            MailLauncherService dVar = this.f106053a;
            if (parse.getQueryParameter("bdp_launch_query") == null) {
                z = true;
            }
            dVar.mo150211a(context, str, z);
            return true;
        }
    }

    @Override // com.ss.android.lark.mail.p2157a.AbstractC41740a.AbstractC41754m
    /* renamed from: a */
    public Map<String, AbstractC29186b> mo150207a(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("/client/mail/collaborate/thread", new C41770c(this));
        hashMap.put("/client/mail/forward/card", new C41767a());
        hashMap.put("/client/mail/forward/inbox", new C41768b());
        hashMap.put("/client/mail/setting", new C41769c());
        return hashMap;
    }

    /* renamed from: a */
    public final void mo150211a(Context context, String str, boolean z) {
        if (str != null) {
            C42699a.m170240a(context, str, z);
        }
    }
}
