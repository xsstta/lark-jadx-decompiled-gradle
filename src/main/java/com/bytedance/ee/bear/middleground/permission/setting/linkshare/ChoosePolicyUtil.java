package com.bytedance.ee.bear.middleground.permission.setting.linkshare;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10074o;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/ChoosePolicyUtil;", "", "()V", "Companion", "OnPolicyViewClickListener", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.a */
public final class ChoosePolicyUtil {

    /* renamed from: a */
    public static final Companion f27066a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/ChoosePolicyUtil$OnPolicyViewClickListener;", "", "onClickPrivacy", "", "onClickServiceTerm", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.a$b */
    public interface OnPolicyViewClickListener {
        /* renamed from: a */
        void mo38306a();

        /* renamed from: b */
        void mo38307b();
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m41675a(C10917c cVar, PolicyConfig policyConfig) {
        return f27066a.mo38301a(cVar, policyConfig);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m41676a(TextView textView, Context context, int i, String str, OnPolicyViewClickListener bVar) {
        f27066a.mo38302a(textView, context, i, str, bVar);
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m41677b(C10917c cVar, PolicyConfig policyConfig) {
        return f27066a.mo38303b(cVar, policyConfig);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/ChoosePolicyUtil$Companion;", "", "()V", "HTTPS_PREFIX", "", "LARK_DOCS_SERVICE_TERM_DEFAULT", "LARK_SERVICE_TERM_DEFAULT", "MATCH_DOC_TYPE", "MATCH_PRIVACY", "MATCH_SERVICE", "PRIVACY_DEFAULT", "TAG", "generatePolicyView", "", "tv", "Landroid/widget/TextView;", "mContext", "Landroid/content/Context;", ShareHitPoint.f121869d, "", "contentStr", "listener", "Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/ChoosePolicyUtil$OnPolicyViewClickListener;", "getPrivacyUrl", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "policyConfig", "Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/PolicyConfig;", "getServiceTermUrl", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.a$a$a */
        public static final class C10015a implements C10074o.AbstractView$OnClickListenerC10075a {

            /* renamed from: a */
            final /* synthetic */ OnPolicyViewClickListener f27067a;

            C10015a(OnPolicyViewClickListener bVar) {
                this.f27067a = bVar;
            }

            @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10074o.AbstractView$OnClickListenerC10075a
            /* renamed from: a */
            public /* synthetic */ boolean mo36610a(TextPaint textPaint) {
                return C10074o.AbstractView$OnClickListenerC10075a.CC.$default$a(this, textPaint);
            }

            public final void onClick(View view) {
                C13479a.m54764b("ChoosePolicyUtil", "click getServiceTermUrl ");
                this.f27067a.mo38306a();
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.a$a$b */
        public static final class C10016b implements C10074o.AbstractView$OnClickListenerC10075a {

            /* renamed from: a */
            final /* synthetic */ OnPolicyViewClickListener f27068a;

            C10016b(OnPolicyViewClickListener bVar) {
                this.f27068a = bVar;
            }

            @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10074o.AbstractView$OnClickListenerC10075a
            /* renamed from: a */
            public /* synthetic */ boolean mo36610a(TextPaint textPaint) {
                return C10074o.AbstractView$OnClickListenerC10075a.CC.$default$a(this, textPaint);
            }

            public final void onClick(View view) {
                C13479a.m54764b("ChoosePolicyUtil", "click getPolicyUrl ");
                this.f27068a.mo38307b();
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final String mo38301a(C10917c cVar, PolicyConfig policyConfig) {
            String str;
            Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
            Intrinsics.checkParameterIsNotNull(policyConfig, "policyConfig");
            String c = C4484g.m18494b().mo17252c();
            Intrinsics.checkExpressionValueIsNotNull(c, "SdkLocaleServiceWrapper.…tance().provideLanguage()");
            String privacy_url = policyConfig.getPrivacy_url();
            if (privacy_url == null) {
                privacy_url = "";
            }
            if (TextUtils.isEmpty(privacy_url)) {
                C13479a.m54764b("ChoosePolicyUtil", "getPrivacyUrl use default");
                str = "https://feishu.cn/{lan}/privacy";
            } else {
                str = "https://" + privacy_url;
            }
            return StringsKt.replace$default(str, "{lan}", c, false, 4, (Object) null);
        }

        @JvmStatic
        /* renamed from: b */
        public final String mo38303b(C10917c cVar, PolicyConfig policyConfig) {
            String str;
            String str2;
            Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
            Intrinsics.checkParameterIsNotNull(policyConfig, "policyConfig");
            String c = C4484g.m18494b().mo17252c();
            Intrinsics.checkExpressionValueIsNotNull(c, "SdkLocaleServiceWrapper.…tance().provideLanguage()");
            al d = C4511g.m18594d();
            Intrinsics.checkExpressionValueIsNotNull(d, "InfoProvideServiceImp.getInstance()");
            int E = d.mo17344E();
            String service_term_url = policyConfig.getService_term_url();
            if (service_term_url == null) {
                service_term_url = "";
            }
            if (TextUtils.isEmpty(service_term_url)) {
                StringBuilder sb = new StringBuilder();
                sb.append("https://");
                if (E == 1) {
                    str2 = "feishu.cn/{lan}/terms";
                } else {
                    str2 = "docs.feishu.cn/{lan}/terms";
                }
                sb.append(str2);
                str = sb.toString();
                C13479a.m54764b("ChoosePolicyUtil", "getServiceTermUrl use default");
            } else {
                str = "https://" + service_term_url;
            }
            return StringsKt.replace$default(str, "{lan}", c, false, 4, (Object) null);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo38302a(TextView textView, Context context, int i, String str, OnPolicyViewClickListener bVar) {
            Intrinsics.checkParameterIsNotNull(str, "contentStr");
            Intrinsics.checkParameterIsNotNull(bVar, "listener");
            if (textView != null && context != null && !TextUtils.isEmpty(str)) {
                String string = context.getResources().getString(R.string.Doc_Share_ServiceTerm);
                Intrinsics.checkExpressionValueIsNotNull(string, "mContext.resources.getSt…ng.Doc_Share_ServiceTerm)");
                String string2 = context.getResources().getString(R.string.Doc_Share_Privacy);
                Intrinsics.checkExpressionValueIsNotNull(string2, "mContext.resources.getSt…string.Doc_Share_Privacy)");
                String b = ((AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null)).mo31510b(context, i);
                int length = string.length();
                int length2 = string2.length();
                String replace$default = StringsKt.replace$default(StringsKt.replace$default(str, "{{serviceTerm}}", string, false, 4, (Object) null), "{{privacy}}", string2, false, 4, (Object) null);
                if (StringsKt.contains$default((CharSequence) replace$default, (CharSequence) "{{doc_type}}", false, 2, (Object) null)) {
                    Intrinsics.checkExpressionValueIsNotNull(b, "docType");
                    replace$default = StringsKt.replace$default(replace$default, "{{doc_type}}", b, false, 4, (Object) null);
                }
                String str2 = replace$default;
                int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, string2, 0, false, 6, (Object) null);
                int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str2, string, 0, false, 6, (Object) null);
                SpannableString spannableString = new SpannableString(str2);
                spannableString.setSpan(new C10074o(context, new C10015a(bVar)), indexOf$default2, indexOf$default2 + length, 33);
                spannableString.setSpan(new C10074o(context, new C10016b(bVar)), indexOf$default, indexOf$default + length2, 33);
                textView.setText(spannableString);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setHighlightColor(0);
            }
        }
    }
}
