package com.ss.android.vc.entity.livestream;

import android.text.TextUtils;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.AbstractC60906t;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0001 B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005B)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bB\u001d\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u0003H\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Lcom/ss/android/vc/entity/livestream/MsgWithUrlInfo;", "", "msg", "", "eventName", "(Ljava/lang/String;Ljava/lang/String;)V", "urls", "", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/util/List;)V", "actionName1", "getActionName1", "()Ljava/lang/String;", "setActionName1", "(Ljava/lang/String;)V", "actionName2", "getActionName2", "setActionName2", "getEventName", "setEventName", "message", "getMessage", "setMessage", "urlList", "getUrlList", "()Ljava/util/List;", "setUrlList", "(Ljava/util/List;)V", "setEventActionName", "", "setUrl", "toString", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.livestream.b */
public final class MsgWithUrlInfo {

    /* renamed from: a */
    public static final Companion f152526a = new Companion(null);

    /* renamed from: b */
    private String f152527b;

    /* renamed from: c */
    private List<String> f152528c = new ArrayList();

    /* renamed from: d */
    private String f152529d;

    /* renamed from: e */
    private String f152530e;

    /* renamed from: f */
    private String f152531f;

    @JvmStatic
    /* renamed from: a */
    public static final MsgWithUrlInfo m237104a(int i) {
        return f152526a.mo209961a(i);
    }

    @JvmStatic
    /* renamed from: a */
    public static final MsgWithUrlInfo m237105a(String str, List<String> list) {
        return f152526a.mo209962a(str, list);
    }

    @JvmStatic
    /* renamed from: b */
    public static final MsgWithUrlInfo m237106b(int i) {
        return f152526a.mo209963b(i);
    }

    @JvmStatic
    /* renamed from: b */
    public static final MsgWithUrlInfo m237107b(String str, List<String> list) {
        return f152526a.mo209964b(str, list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u001e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0007¨\u0006\r"}, d2 = {"Lcom/ss/android/vc/entity/livestream/MsgWithUrlInfo$Companion;", "", "()V", "getMsgForAuth", "Lcom/ss/android/vc/entity/livestream/MsgWithUrlInfo;", "str", "", "urls", "", "getMsgForEnterMeeting", "res", "", "getMsgForInMeeting", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.entity.livestream.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final MsgWithUrlInfo mo209961a(int i) {
            String a = C60773o.m236119a(i);
            Intrinsics.checkExpressionValueIsNotNull(a, "VCCommonUtils.getString(res)");
            return new MsgWithUrlInfo(a, "vc_privacy_policy_popup");
        }

        @JvmStatic
        /* renamed from: b */
        public final MsgWithUrlInfo mo209963b(int i) {
            String a = C60773o.m236119a(i);
            Intrinsics.checkExpressionValueIsNotNull(a, "VCCommonUtils.getString(res)");
            return new MsgWithUrlInfo(a, "vc_begin_live_popup");
        }

        @JvmStatic
        /* renamed from: b */
        public final MsgWithUrlInfo mo209964b(String str, List<String> list) {
            Intrinsics.checkParameterIsNotNull(str, "str");
            Intrinsics.checkParameterIsNotNull(list, "urls");
            return new MsgWithUrlInfo(str, list);
        }

        @JvmStatic
        /* renamed from: a */
        public final MsgWithUrlInfo mo209962a(String str, List<String> list) {
            Intrinsics.checkParameterIsNotNull(str, "str");
            Intrinsics.checkParameterIsNotNull(list, "urls");
            return new MsgWithUrlInfo(str, list, "vc_begin_live_popup");
        }
    }

    /* renamed from: a */
    public final String mo209955a() {
        return this.f152527b;
    }

    /* renamed from: b */
    public final List<String> mo209956b() {
        return this.f152528c;
    }

    /* renamed from: c */
    public final String mo209957c() {
        return this.f152529d;
    }

    /* renamed from: d */
    public final String mo209958d() {
        return this.f152530e;
    }

    /* renamed from: e */
    public final String mo209959e() {
        return this.f152531f;
    }

    /* renamed from: f */
    private final void m237108f() {
        this.f152530e = "click_privacy_policy";
        this.f152531f = "click_user_terms_of_service";
    }

    /* renamed from: g */
    private final void m237109g() {
        AbstractC60906t languageDependency = VideoChatModuleDependency.getLanguageDependency();
        Intrinsics.checkExpressionValueIsNotNull(languageDependency, "VideoChatModuleDependency.getLanguageDependency()");
        Locale languageSetting = languageDependency.getLanguageSetting();
        Intrinsics.checkExpressionValueIsNotNull(languageSetting, "VideoChatModuleDependenc…endency().languageSetting");
        Locale locale = Locale.JAPANESE;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.JAPANESE");
        if (TextUtils.equals(languageSetting.getLanguage(), locale.getLanguage())) {
            this.f152528c.add("https://www.larksuite.com/ja_jp/privacy-policy");
            this.f152528c.add("https://www.larksuite.com/ja_jp/user-terms-of-service");
            return;
        }
        AbstractC60906t languageDependency2 = VideoChatModuleDependency.getLanguageDependency();
        Intrinsics.checkExpressionValueIsNotNull(languageDependency2, "VideoChatModuleDependency.getLanguageDependency()");
        Locale languageSetting2 = languageDependency2.getLanguageSetting();
        Intrinsics.checkExpressionValueIsNotNull(languageSetting2, "VideoChatModuleDependenc…endency().languageSetting");
        Locale locale2 = Locale.CHINESE;
        Intrinsics.checkExpressionValueIsNotNull(locale2, "Locale.CHINESE");
        if (TextUtils.equals(languageSetting2.getLanguage(), locale2.getLanguage())) {
            this.f152528c.add("https://www.larksuite.com/en_us/privacy-policy");
            this.f152528c.add("https://www.larksuite.com/en_us/user-terms-of-service");
            return;
        }
        this.f152528c.add("https://www.larksuite.com/en_us/privacy-policy");
        this.f152528c.add("https://www.larksuite.com/en_us/user-terms-of-service");
    }

    public String toString() {
        return "MsgWithUrlInfo(message=" + this.f152527b + ", urlList=" + this.f152528c + ", eventName=" + this.f152529d + ", actionName1=" + this.f152530e + ", actionName2=" + this.f152531f + ')';
    }

    public MsgWithUrlInfo(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        this.f152527b = str;
        m237109g();
        m237108f();
    }

    public MsgWithUrlInfo(String str, List<String> list) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        Intrinsics.checkParameterIsNotNull(list, "urls");
        this.f152527b = str;
        this.f152528c = list;
    }

    public MsgWithUrlInfo(String str, List<String> list, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        Intrinsics.checkParameterIsNotNull(list, "urls");
        this.f152527b = str;
        this.f152528c = list;
        m237108f();
    }
}
