package com.ss.lark.android.passport.biz.link_handler;

import android.content.Context;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.p2069j.p2070a.C40633aa;
import com.ss.android.lark.passport.infra.log.PassportLog;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0006\u0010\u000f\u001a\u00020\u0010J\u001c\u0010\u0011\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048DX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/ss/lark/android/passport/biz/link_handler/PassportAppLinkHandler;", "Lcom/ss/android/lark/applink/AppLinkHandler;", "()V", "logger", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "getLogger", "()Lcom/ss/android/lark/passport/infra/log/PassportLog;", "logger$delegate", "Lkotlin/Lazy;", "canOpen", "", "context", "Landroid/content/Context;", "appLink", "Lcom/ss/android/lark/applink/AppLink;", "getOPMonitorCodeForLog", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "handle", "needBackToLark", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.link_handler.d */
public class PassportAppLinkHandler extends AbstractC29186b {

    /* renamed from: a */
    private final Lazy f164088a = LazyKt.lazy(new C65161a(this));

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final PassportLog mo224384b() {
        return (PassportLog) this.f164088a.getValue();
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, AppLink appLink) {
        return false;
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.link_handler.d$a */
    static final class C65161a extends Lambda implements Function0<PassportLog> {
        final /* synthetic */ PassportAppLinkHandler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65161a(PassportAppLinkHandler dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final PassportLog invoke() {
            return PassportLog.f123351c.mo171475a(this.this$0.mo224385c());
        }
    }

    /* renamed from: c */
    public final OPMonitorCode mo224385c() {
        C40633aa aaVar = C40633aa.f103061a;
        Intrinsics.checkExpressionValueIsNotNull(aaVar, "EPMClientPassportUnivers…de.PASSPORT_UNIVERSAL_LOG");
        return aaVar;
    }
}
