package com.ss.android.lark.passport.infra.util;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.passport.infra.log.PassportLog;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/passport/infra/util/OperatorAuthTokenInfo;", "Ljava/io/Serializable;", "securityPhone", "", "authToken", "netType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthToken", "()Ljava/lang/String;", "setAuthToken", "(Ljava/lang/String;)V", "getNetType", "setNetType", "getSecurityPhone", "setSecurityPhone", "Companion", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class OperatorAuthTokenInfo implements Serializable {
    public static final Companion Companion = new Companion(null);
    private String authToken;
    private String netType;
    private String securityPhone;

    public OperatorAuthTokenInfo() {
        this(null, null, null, 7, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/passport/infra/util/OperatorAuthTokenInfo$Companion;", "", "()V", "TELECOM", "", "UNICOM", "getOperatorNameByNetType", "context", "Landroid/content/Context;", ShareHitPoint.f121869d, "log", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "getOperatorPrivacyByNetType", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.util.OperatorAuthTokenInfo$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo171616a(Context context, String str, PassportLog passportLog) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
            Intrinsics.checkParameterIsNotNull(passportLog, "log");
            passportLog.mo171465b("OperatorAuthTokenInfo", "getOperatorNameByNetType " + str);
            if (TextUtils.isEmpty(str)) {
                String string = context.getResources().getString(R.string.Lark_Login_mobileOperatorChinaMobile);
                Intrinsics.checkExpressionValueIsNotNull(string, "context.resources.getStr…obileOperatorChinaMobile)");
                return string;
            } else if (StringsKt.startsWith$default(str, "unicom", false, 2, (Object) null)) {
                String string2 = context.getResources().getString(R.string.Lark_Login_mobileOperatorChinaUnicom);
                Intrinsics.checkExpressionValueIsNotNull(string2, "context.resources.getStr…obileOperatorChinaUnicom)");
                return string2;
            } else if (StringsKt.startsWith$default(str, "telecom", false, 2, (Object) null)) {
                String string3 = context.getResources().getString(R.string.Lark_Login_mobileOperatorChinaTelecom);
                Intrinsics.checkExpressionValueIsNotNull(string3, "context.resources.getStr…bileOperatorChinaTelecom)");
                return string3;
            } else {
                String string4 = context.getResources().getString(R.string.Lark_Login_mobileOperatorChinaMobile);
                Intrinsics.checkExpressionValueIsNotNull(string4, "context.resources.getStr…obileOperatorChinaMobile)");
                return string4;
            }
        }

        /* renamed from: b */
        public final String mo171617b(Context context, String str, PassportLog passportLog) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
            Intrinsics.checkParameterIsNotNull(passportLog, "log");
            passportLog.mo171465b("OperatorAuthTokenInfo", "getOperatorPrivacyByNetType " + str);
            if (TextUtils.isEmpty(str)) {
                String string = context.getResources().getString(R.string.Lark_Login_operatorAgreementChinaMobile);
                Intrinsics.checkExpressionValueIsNotNull(string, "context.resources.getStr…atorAgreementChinaMobile)");
                return string;
            } else if (StringsKt.startsWith$default(str, "unicom", false, 2, (Object) null)) {
                String string2 = context.getResources().getString(R.string.Lark_Login_operatorAgreementChinaUnicom);
                Intrinsics.checkExpressionValueIsNotNull(string2, "context.resources.getStr…atorAgreementChinaUnicom)");
                return string2;
            } else if (StringsKt.startsWith$default(str, "telecom", false, 2, (Object) null)) {
                String string3 = context.getResources().getString(R.string.Lark_Login_operatorAgreementChinaTelecom);
                Intrinsics.checkExpressionValueIsNotNull(string3, "context.resources.getStr…torAgreementChinaTelecom)");
                return string3;
            } else {
                String string4 = context.getResources().getString(R.string.Lark_Login_operatorAgreementChinaMobile);
                Intrinsics.checkExpressionValueIsNotNull(string4, "context.resources.getStr…atorAgreementChinaMobile)");
                return string4;
            }
        }
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final String getNetType() {
        return this.netType;
    }

    public final String getSecurityPhone() {
        return this.securityPhone;
    }

    public final void setAuthToken(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.authToken = str;
    }

    public final void setNetType(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.netType = str;
    }

    public final void setSecurityPhone(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.securityPhone = str;
    }

    public OperatorAuthTokenInfo(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "securityPhone");
        Intrinsics.checkParameterIsNotNull(str2, "authToken");
        Intrinsics.checkParameterIsNotNull(str3, "netType");
        this.securityPhone = str;
        this.authToken = str2;
        this.netType = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OperatorAuthTokenInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
