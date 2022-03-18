package com.bytedance.ee.bear.quoto;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.suite.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/quoto/SuiteTypeVersion;", "", "()V", "Companion", "quoto-api_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.quoto.z */
public final class SuiteTypeVersion {

    /* renamed from: a */
    public static final List<String> f28437a = CollectionsKt.listOf((Object[]) new String[]{"1", "2", "3", "4", "5", "6"});

    /* renamed from: b */
    public static final Companion f28438b = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final String m43879a(Context context, String str) {
        return f28438b.mo40060a(context, str);
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m43880a(String str) {
        return f28438b.mo40064c(str);
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m43881b(String str) {
        return f28438b.mo40065d(str);
    }

    @JvmStatic
    /* renamed from: c */
    public static final boolean m43882c(String str) {
        return f28438b.mo40066e(str);
    }

    @JvmStatic
    /* renamed from: d */
    public static final boolean m43883d(String str) {
        return f28438b.mo40067f(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010\u0017\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010\u0018\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/quoto/SuiteTypeVersion$Companion;", "", "()V", "KEY_SUITE_TYPE_LIST", "", "", "getKEY_SUITE_TYPE_LIST", "()Ljava/util/List;", "SUITE_TYPE_BUSINESS", "SUITE_TYPE_CERT_STANDARD", "SUITE_TYPE_ENTERPRISE", "SUITE_TYPE_LEGACY_ENTERPRISE", "SUITE_TYPE_LEGACY_FREE", "SUITE_TYPE_STANDARD", "getVersionName", "context", "Landroid/content/Context;", "suiteType", "isBusiness", "", "isCertStandard", "isEnterprise", "isLegacyEnterprise", "isLegacyFree", "isUnCertStandard", "quoto-api_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.quoto.z$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final List<String> mo40061a() {
            return SuiteTypeVersion.f28437a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean mo40062a(String str) {
            return TextUtils.equals(str, "1");
        }

        @JvmStatic
        /* renamed from: b */
        public final boolean mo40063b(String str) {
            return TextUtils.equals(str, "2");
        }

        @JvmStatic
        /* renamed from: c */
        public final boolean mo40064c(String str) {
            return TextUtils.equals(str, "3");
        }

        @JvmStatic
        /* renamed from: d */
        public final boolean mo40065d(String str) {
            return TextUtils.equals(str, "4");
        }

        @JvmStatic
        /* renamed from: e */
        public final boolean mo40066e(String str) {
            return TextUtils.equals(str, "5");
        }

        @JvmStatic
        /* renamed from: f */
        public final boolean mo40067f(String str) {
            return TextUtils.equals(str, "6");
        }

        @JvmStatic
        /* renamed from: a */
        public final String mo40060a(Context context, String str) {
            String str2;
            Intrinsics.checkParameterIsNotNull(context, "context");
            Companion aVar = this;
            if (aVar.mo40062a(str) || aVar.mo40064c(str) || aVar.mo40065d(str)) {
                String string = context.getString(R.string.CreationMobile_version_standard);
                Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…nMobile_version_standard)");
                return string;
            }
            if (aVar.mo40063b(str) || aVar.mo40067f(str)) {
                str2 = context.getString(R.string.CreationMobile_version_enterprise);
            } else {
                str2 = context.getString(R.string.CreationMobile_version_business);
            }
            Intrinsics.checkExpressionValueIsNotNull(str2, "if (isLegacyEnterprise(s…n_business)\n            }");
            return str2;
        }
    }
}
