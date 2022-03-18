package com.ss.lark.android.passport.biz.utils;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.passport.infra.config.PassportConfigCenter;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.IDomainService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49157ai;
import com.ss.android.lark.passport.infra.util.OperatorAuthTokenInfo;
import com.ss.android.lark.passport.infra.widget.p2444b.C49249b;
import com.ss.android.lark.util.share_preference.C57744a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u00042345B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001a\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0004H\u0002J\u001a\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0004H\u0002JH\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0015\u001a\u00020\u00162\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r\u0018\u00010\u00182\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bJ*\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010 H\u0002JS\u0010!\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\r2\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0002¢\u0006\u0002\u0010'J&\u0010(\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010)\u001a\u00020\u00042\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140+H\u0002J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020.H\u0007J\u0012\u0010/\u001a\u00020\u001c*\u0002002\u0006\u00101\u001a\u00020.R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u00066"}, d2 = {"Lcom/ss/lark/android/passport/biz/utils/PrivacyPolicyUtils;", "", "()V", "TAG", "", "agreementPatterns", "", "[Ljava/lang/String;", "logger", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "privacyPatterns", "termServicePatterns", "buildAgreementPolicy", "Lcom/ss/lark/android/passport/biz/utils/PrivacyPolicyUtils$Policy;", "context", "Landroid/content/Context;", "buildPrivacyPolicy", "url", "buildServiceTermPolicy", "generatePolicy", "", "stringRes", "", "mustacheMap", "", "Lcom/ss/lark/android/passport/biz/utils/PrivacyPolicyUtils$PolicyType;", "onClickListener", "Lkotlin/Function1;", "", "generatePolicySpannedString", ShareHitPoint.f121868c, "policyUrl", "Landroid/view/View$OnClickListener;", "mustache", "spannedSb", "Landroid/text/SpannableStringBuilder;", "patterns", ShareHitPoint.f121869d, "policy", "(Landroid/content/Context;Landroid/text/SpannableStringBuilder;[Ljava/lang/String;Lcom/ss/lark/android/passport/biz/utils/PrivacyPolicyUtils$PolicyType;Lcom/ss/lark/android/passport/biz/utils/PrivacyPolicyUtils$Policy;Lkotlin/jvm/functions/Function1;)V", "mustacheIfNeeded", "format", "spanProvider", "Lkotlin/Function0;", "setupTextView", "tv", "Landroid/widget/TextView;", "setText", "Lcom/ss/lark/android/passport/biz/utils/PrivacyPolicyUtils$Builder;", "textView", "Builder", "Policy", "PolicyType", "TextViewBuilder", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PrivacyPolicyUtils {

    /* renamed from: a */
    public static final PrivacyPolicyUtils f164289a = new PrivacyPolicyUtils();

    /* renamed from: b */
    private static final String[] f164290b = {"{{serviceTerm}}", "{{termService}}"};

    /* renamed from: c */
    private static final String[] f164291c = {"{{privacy}}", "{{privacyPolicy}}"};

    /* renamed from: d */
    private static final String[] f164292d = {"{{operatorAgreement}}"};

    /* renamed from: e */
    private static final PassportLog f164293e = PassportLog.f123351c.mo171474a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/lark/android/passport/biz/utils/PrivacyPolicyUtils$PolicyType;", "", "(Ljava/lang/String;I)V", "SERVICE_TERM", "PRIVACY", "AGREEMENT", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum PolicyType {
        SERVICE_TERM,
        PRIVACY,
        AGREEMENT
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/ss/lark/android/passport/biz/utils/PrivacyPolicyUtils$Policy;", "", "replacement", "", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "getReplacement", "()Ljava/lang/String;", "setReplacement", "(Ljava/lang/String;)V", "getUrl", "setUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.utils.PrivacyPolicyUtils$b */
    public static final class Policy {

        /* renamed from: a */
        private String f164299a;

        /* renamed from: b */
        private String f164300b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Policy)) {
                return false;
            }
            Policy bVar = (Policy) obj;
            return Intrinsics.areEqual(this.f164299a, bVar.f164299a) && Intrinsics.areEqual(this.f164300b, bVar.f164300b);
        }

        public int hashCode() {
            String str = this.f164299a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f164300b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "Policy(replacement=" + this.f164299a + ", url=" + this.f164300b + ")";
        }

        /* renamed from: a */
        public final String mo224488a() {
            return this.f164299a;
        }

        /* renamed from: b */
        public final String mo224489b() {
            return this.f164300b;
        }

        public Policy(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "replacement");
            Intrinsics.checkParameterIsNotNull(str2, "url");
            this.f164299a = str;
            this.f164300b = str2;
        }
    }

    private PrivacyPolicyUtils() {
    }

    /* renamed from: a */
    public final CharSequence mo224483a(Context context, String str, String str2, View.OnClickListener onClickListener) {
        C49249b bVar = new C49249b(context, new C65240d(onClickListener, context, str2));
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(bVar, 0, str.length(), 33);
        return spannableString;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u001c\u0010\u0018\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/lark/android/passport/biz/utils/PrivacyPolicyUtils$Builder;", "", "context", "Landroid/content/Context;", "stringRes", "", "unitType", "Lcom/ss/android/lark/passport/infra/service/IDomainService$UrlUnitType;", "(Landroid/content/Context;ILcom/ss/android/lark/passport/infra/service/IDomainService$UrlUnitType;)V", "host", "", "(Landroid/content/Context;ILjava/lang/String;)V", "mustacheMap", "", "Lcom/ss/lark/android/passport/biz/utils/PrivacyPolicyUtils$PolicyType;", "Lcom/ss/lark/android/passport/biz/utils/PrivacyPolicyUtils$Policy;", "onClickListener", "Lkotlin/Function1;", "", "generate", "", "putCustomPolicy", "policyType", "policy", "setOnClickListener", "listener", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.utils.PrivacyPolicyUtils$a */
    public static class Builder {

        /* renamed from: a */
        private Function1<? super PolicyType, Unit> f164294a;

        /* renamed from: b */
        private final Map<PolicyType, Policy> f164295b;

        /* renamed from: c */
        private final Context f164296c;

        /* renamed from: d */
        private final int f164297d;

        /* renamed from: e */
        private final String f164298e;

        /* renamed from: a */
        public final CharSequence mo224487a() {
            return PrivacyPolicyUtils.f164289a.mo224482a(this.f164296c, this.f164297d, this.f164295b, this.f164294a);
        }

        /* renamed from: a */
        public Builder mo224486a(Function1<? super PolicyType, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "listener");
            this.f164294a = function1;
            return this;
        }

        /* renamed from: a */
        public Builder mo224485a(PolicyType policyType, Policy bVar) {
            Intrinsics.checkParameterIsNotNull(policyType, "policyType");
            Intrinsics.checkParameterIsNotNull(bVar, "policy");
            this.f164295b.put(policyType, bVar);
            return this;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(Context context, int i, IDomainService.UrlUnitType urlUnitType) {
            this(context, i, ServiceFinder.m193751f().getPolicyHost(urlUnitType));
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(urlUnitType, "unitType");
        }

        public Builder(Context context, int i, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "host");
            this.f164296c = context;
            this.f164297d = i;
            this.f164298e = str;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.f164295b = linkedHashMap;
            linkedHashMap.put(PolicyType.SERVICE_TERM, PrivacyPolicyUtils.f164289a.mo224481a(context, ServiceFinder.m193751f().getPolicyUrl(str, IDomainService.Policy.SERVICE_TERM)));
            linkedHashMap.put(PolicyType.PRIVACY, PrivacyPolicyUtils.f164289a.mo224484b(context, ServiceFinder.m193751f().getPolicyUrl(str, IDomainService.Policy.PRIVACY)));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.utils.PrivacyPolicyUtils$e */
    public static final class C65241e extends Lambda implements Function0<CharSequence> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Function1 $onClickListener;
        final /* synthetic */ Policy $policy;
        final /* synthetic */ PolicyType $type;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65241e(Context context, Policy bVar, Function1 function1, PolicyType policyType) {
            super(0);
            this.$context = context;
            this.$policy = bVar;
            this.$onClickListener = function1;
            this.$type = policyType;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CharSequence invoke() {
            return PrivacyPolicyUtils.f164289a.mo224483a(this.$context, this.$policy.mo224488a(), this.$policy.mo224489b(), new View.OnClickListener(this) {
                /* class com.ss.lark.android.passport.biz.utils.PrivacyPolicyUtils.C65241e.View$OnClickListenerC652421 */

                /* renamed from: a */
                final /* synthetic */ C65241e f164305a;

                {
                    this.f164305a = r1;
                }

                public final void onClick(View view) {
                    Function1 function1 = this.f164305a.$onClickListener;
                    if (function1 != null) {
                        Unit unit = (Unit) function1.invoke(this.f164305a.$type);
                    }
                    PrivacyPolicyUtils privacyPolicyUtils = PrivacyPolicyUtils.f164289a;
                    PassportLog passportLog = PrivacyPolicyUtils.f164293e;
                    passportLog.mo171465b("PrivacyPolicyUtils", this.f164305a.$type + " clicked: " + this.f164305a.$policy.mo224489b());
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u0006\u0010\u0015\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/lark/android/passport/biz/utils/PrivacyPolicyUtils$TextViewBuilder;", "Lcom/ss/lark/android/passport/biz/utils/PrivacyPolicyUtils$Builder;", "textView", "Landroid/widget/TextView;", "stringRes", "", "unitType", "Lcom/ss/android/lark/passport/infra/service/IDomainService$UrlUnitType;", "(Landroid/widget/TextView;ILcom/ss/android/lark/passport/infra/service/IDomainService$UrlUnitType;)V", "host", "", "(Landroid/widget/TextView;ILjava/lang/String;)V", "putCustomPolicy", "policyType", "Lcom/ss/lark/android/passport/biz/utils/PrivacyPolicyUtils$PolicyType;", "policy", "Lcom/ss/lark/android/passport/biz/utils/PrivacyPolicyUtils$Policy;", "setOnClickListener", "listener", "Lkotlin/Function1;", "", "setText", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.utils.PrivacyPolicyUtils$c */
    public static final class TextViewBuilder extends Builder {

        /* renamed from: a */
        private final TextView f164301a;

        /* renamed from: b */
        public final void mo224495b() {
            PrivacyPolicyUtils.m256108a(this.f164301a);
            this.f164301a.setText(mo224487a());
        }

        /* renamed from: b */
        public TextViewBuilder mo224486a(Function1<? super PolicyType, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "listener");
            super.mo224486a(function1);
            return this;
        }

        /* renamed from: b */
        public TextViewBuilder mo224485a(PolicyType policyType, Policy bVar) {
            Intrinsics.checkParameterIsNotNull(policyType, "policyType");
            Intrinsics.checkParameterIsNotNull(bVar, "policy");
            super.mo224485a(policyType, bVar);
            return this;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public TextViewBuilder(TextView textView, int i, IDomainService.UrlUnitType urlUnitType) {
            this(textView, i, ServiceFinder.m193751f().getPolicyHost(urlUnitType));
            Intrinsics.checkParameterIsNotNull(textView, "textView");
            Intrinsics.checkParameterIsNotNull(urlUnitType, "unitType");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public TextViewBuilder(android.widget.TextView r3, int r4, java.lang.String r5) {
            /*
                r2 = this;
                java.lang.String r0 = "textView"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
                java.lang.String r0 = "host"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
                android.content.Context r0 = r3.getContext()
                java.lang.String r1 = "textView.context"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r2.<init>(r0, r4, r5)
                r2.f164301a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.lark.android.passport.biz.utils.PrivacyPolicyUtils.TextViewBuilder.<init>(android.widget.TextView, int, java.lang.String):void");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.utils.PrivacyPolicyUtils$d */
    public static final class C65240d implements C49249b.AbstractView$OnClickListenerC49250a {

        /* renamed from: a */
        final /* synthetic */ View.OnClickListener f164302a;

        /* renamed from: b */
        final /* synthetic */ Context f164303b;

        /* renamed from: c */
        final /* synthetic */ String f164304c;

        C65240d(View.OnClickListener onClickListener, Context context, String str) {
            this.f164302a = onClickListener;
            this.f164303b = context;
            this.f164304c = str;
        }

        @Override // com.ss.android.lark.passport.infra.widget.p2444b.C49249b.AbstractView$OnClickListenerC49250a
        /* renamed from: a */
        public /* synthetic */ boolean mo171692a(TextPaint textPaint) {
            return C49249b.AbstractView$OnClickListenerC49250a.CC.$default$a(this, textPaint);
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener = this.f164302a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            C49157ai.m193846a(this.f164303b, this.f164304c);
        }
    }

    /* renamed from: a */
    private final Policy m256104a(Context context) {
        String string = C57744a.m224104a().getString("one_key_login_net_type");
        String policyUrlByNetType = PassportConfigCenter.f123034a.mo171113d().getOneKeyAuthData().policyUrls.getPolicyUrlByNetType(string);
        if (policyUrlByNetType == null) {
            policyUrlByNetType = "";
        }
        if (StringsKt.isBlank(policyUrlByNetType)) {
            PassportLog passportLog = f164293e;
            passportLog.mo171471d("PrivacyPolicyUtils", "onekey login policy url not found, netType: " + string);
        }
        OperatorAuthTokenInfo.Companion aVar = OperatorAuthTokenInfo.Companion;
        Intrinsics.checkExpressionValueIsNotNull(string, "netType");
        return new Policy(aVar.mo171617b(context, string, f164293e), policyUrlByNetType);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m256108a(TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "tv");
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
    }

    /* renamed from: b */
    public final Policy mo224484b(Context context, String str) {
        String string = context.getString(R.string.Lark_Login_V3_PrivacyPolicy);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…k_Login_V3_PrivacyPolicy)");
        return new Policy(string, str);
    }

    /* renamed from: a */
    public final Policy mo224481a(Context context, String str) {
        String string = context.getString(R.string.Lark_Login_V3_TermService);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…ark_Login_V3_TermService)");
        return new Policy(string, str);
    }

    /* renamed from: a */
    private final void m256107a(SpannableStringBuilder spannableStringBuilder, String str, Function0<? extends CharSequence> function0) {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableStringBuilder, str, 0, false, 6, (Object) null);
        if (indexOf$default >= 0) {
            spannableStringBuilder.replace(indexOf$default, str.length() + indexOf$default, (CharSequence) function0.invoke());
        }
    }

    /* renamed from: a */
    public final CharSequence mo224482a(Context context, int i, Map<PolicyType, Policy> map, Function1<? super PolicyType, Unit> function1) {
        Policy bVar;
        Policy bVar2;
        Policy bVar3;
        Policy bVar4;
        Intrinsics.checkParameterIsNotNull(context, "context");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) context.getString(i));
        if (map == null || (bVar = map.get(PolicyType.SERVICE_TERM)) == null) {
            bVar = m256105a(this, context, null, 2, null);
        }
        m256106a(context, spannableStringBuilder, f164290b, PolicyType.SERVICE_TERM, bVar, function1);
        if (map == null || (bVar4 = map.get(PolicyType.PRIVACY)) == null) {
            bVar2 = m256109b(this, context, null, 2, null);
        } else {
            bVar2 = bVar4;
        }
        m256106a(context, spannableStringBuilder, f164291c, PolicyType.PRIVACY, bVar2, function1);
        if (map == null || (bVar3 = map.get(PolicyType.AGREEMENT)) == null) {
            bVar3 = m256104a(context);
        }
        m256106a(context, spannableStringBuilder, f164292d, PolicyType.AGREEMENT, bVar3, function1);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    static /* synthetic */ Policy m256105a(PrivacyPolicyUtils privacyPolicyUtils, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = ServiceFinder.m193751f().getPolicyUrl(IDomainService.UrlUnitType.HOST_UNIT, IDomainService.Policy.SERVICE_TERM);
        }
        return privacyPolicyUtils.mo224481a(context, str);
    }

    /* renamed from: b */
    static /* synthetic */ Policy m256109b(PrivacyPolicyUtils privacyPolicyUtils, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = ServiceFinder.m193751f().getPolicyUrl(IDomainService.UrlUnitType.HOST_UNIT, IDomainService.Policy.PRIVACY);
        }
        return privacyPolicyUtils.mo224484b(context, str);
    }

    /* renamed from: a */
    private final void m256106a(Context context, SpannableStringBuilder spannableStringBuilder, String[] strArr, PolicyType policyType, Policy bVar, Function1<? super PolicyType, Unit> function1) {
        C65241e eVar = new C65241e(context, bVar, function1, policyType);
        for (String str : strArr) {
            f164289a.m256107a(spannableStringBuilder, str, eVar);
        }
    }
}
