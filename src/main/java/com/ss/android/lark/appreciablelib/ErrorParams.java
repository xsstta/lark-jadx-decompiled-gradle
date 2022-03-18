package com.ss.android.lark.appreciablelib;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\bI\b\b\u0018\u00002\u00020\u0001B]\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010B¯\u0001\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f¢\u0006\u0002\u0010\u0019B·\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0014\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f¢\u0006\u0002\u0010\u001bJ\t\u0010K\u001a\u00020\u0003HÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010=J\t\u0010M\u001a\u00020\u0014HÆ\u0003J\u0017\u0010N\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fHÆ\u0003J\u0017\u0010O\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fHÆ\u0003J\u0017\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fHÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010S\u001a\u00020\u0007HÆ\u0003J\t\u0010T\u001a\u00020\tHÆ\u0003J\t\u0010U\u001a\u00020\u0014HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u000bHÆ\u0003JÎ\u0001\u0010Y\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00142\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010ZJ\u0013\u0010[\u001a\u00020\u00162\b\u0010\\\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010]\u001a\u00020\u0014HÖ\u0001J\t\u0010^\u001a\u00020\u000bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R(\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00105\"\u0004\b9\u00107R(\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00105\"\u0004\b;\u00107R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0010\n\u0002\u0010@\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010)\"\u0004\bB\u0010+R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010)\"\u0004\bH\u0010+R\u001a\u0010\u001a\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010!\"\u0004\bJ\u0010#¨\u0006_"}, d2 = {"Lcom/ss/android/lark/appreciablelib/ErrorParams;", "", "biz", "Lcom/ss/android/lark/appreciablelib/Biz;", "scene", "Lcom/ss/android/lark/appreciablelib/Scene;", "errorType", "Lcom/ss/android/lark/appreciablelib/ErrorType;", "errorLevel", "Lcom/ss/android/lark/appreciablelib/ErrorLevel;", "userAction", "", "page", "errorMessage", "extra", "", "(Lcom/ss/android/lark/appreciablelib/Biz;Lcom/ss/android/lark/appreciablelib/Scene;Lcom/ss/android/lark/appreciablelib/ErrorType;Lcom/ss/android/lark/appreciablelib/ErrorLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "event", "Lcom/ss/android/lark/appreciablelib/Event;", "errorCode", "", "needNet", "", "extraMetric", "extraCategory", "(Lcom/ss/android/lark/appreciablelib/Biz;Lcom/ss/android/lark/appreciablelib/Scene;Lcom/ss/android/lark/appreciablelib/Event;Lcom/ss/android/lark/appreciablelib/ErrorType;Lcom/ss/android/lark/appreciablelib/ErrorLevel;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "(Lcom/ss/android/lark/appreciablelib/Biz;Lcom/ss/android/lark/appreciablelib/Scene;Lcom/ss/android/lark/appreciablelib/Event;Lcom/ss/android/lark/appreciablelib/ErrorType;Lcom/ss/android/lark/appreciablelib/ErrorLevel;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILjava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getBiz", "()Lcom/ss/android/lark/appreciablelib/Biz;", "setBiz", "(Lcom/ss/android/lark/appreciablelib/Biz;)V", "getErrorCode", "()I", "setErrorCode", "(I)V", "getErrorLevel", "()Lcom/ss/android/lark/appreciablelib/ErrorLevel;", "setErrorLevel", "(Lcom/ss/android/lark/appreciablelib/ErrorLevel;)V", "getErrorMessage", "()Ljava/lang/String;", "setErrorMessage", "(Ljava/lang/String;)V", "getErrorType", "()Lcom/ss/android/lark/appreciablelib/ErrorType;", "setErrorType", "(Lcom/ss/android/lark/appreciablelib/ErrorType;)V", "getEvent", "()Lcom/ss/android/lark/appreciablelib/Event;", "setEvent", "(Lcom/ss/android/lark/appreciablelib/Event;)V", "getExtra", "()Ljava/util/Map;", "setExtra", "(Ljava/util/Map;)V", "getExtraCategory", "setExtraCategory", "getExtraMetric", "setExtraMetric", "getNeedNet", "()Ljava/lang/Boolean;", "setNeedNet", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPage", "setPage", "getScene", "()Lcom/ss/android/lark/appreciablelib/Scene;", "setScene", "(Lcom/ss/android/lark/appreciablelib/Scene;)V", "getUserAction", "setUserAction", "getVersion", "setVersion", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/ss/android/lark/appreciablelib/Biz;Lcom/ss/android/lark/appreciablelib/Scene;Lcom/ss/android/lark/appreciablelib/Event;Lcom/ss/android/lark/appreciablelib/ErrorType;Lcom/ss/android/lark/appreciablelib/ErrorLevel;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILjava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/ss/android/lark/appreciablelib/ErrorParams;", "equals", "other", "hashCode", "toString", "appreciablelib_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.appreciablelib.c */
public final class ErrorParams {

    /* renamed from: a */
    private Biz f73111a;

    /* renamed from: b */
    private Scene f73112b;

    /* renamed from: c */
    private Event f73113c;

    /* renamed from: d */
    private ErrorType f73114d;

    /* renamed from: e */
    private ErrorLevel f73115e;

    /* renamed from: f */
    private int f73116f;

    /* renamed from: g */
    private String f73117g;

    /* renamed from: h */
    private String f73118h;

    /* renamed from: i */
    private String f73119i;

    /* renamed from: j */
    private Boolean f73120j;

    /* renamed from: k */
    private int f73121k;

    /* renamed from: l */
    private Map<String, ? extends Object> f73122l;

    /* renamed from: m */
    private Map<String, ? extends Object> f73123m;

    /* renamed from: n */
    private Map<String, ? extends Object> f73124n;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ErrorParams) {
                ErrorParams cVar = (ErrorParams) obj;
                if (Intrinsics.areEqual(this.f73111a, cVar.f73111a) && Intrinsics.areEqual(this.f73112b, cVar.f73112b) && Intrinsics.areEqual(this.f73113c, cVar.f73113c) && Intrinsics.areEqual(this.f73114d, cVar.f73114d) && Intrinsics.areEqual(this.f73115e, cVar.f73115e)) {
                    if ((this.f73116f == cVar.f73116f) && Intrinsics.areEqual(this.f73117g, cVar.f73117g) && Intrinsics.areEqual(this.f73118h, cVar.f73118h) && Intrinsics.areEqual(this.f73119i, cVar.f73119i) && Intrinsics.areEqual(this.f73120j, cVar.f73120j)) {
                        if (!(this.f73121k == cVar.f73121k) || !Intrinsics.areEqual(this.f73122l, cVar.f73122l) || !Intrinsics.areEqual(this.f73123m, cVar.f73123m) || !Intrinsics.areEqual(this.f73124n, cVar.f73124n)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Biz biz = this.f73111a;
        int i = 0;
        int hashCode = (biz != null ? biz.hashCode() : 0) * 31;
        Scene scene = this.f73112b;
        int hashCode2 = (hashCode + (scene != null ? scene.hashCode() : 0)) * 31;
        Event event = this.f73113c;
        int hashCode3 = (hashCode2 + (event != null ? event.hashCode() : 0)) * 31;
        ErrorType errorType = this.f73114d;
        int hashCode4 = (hashCode3 + (errorType != null ? errorType.hashCode() : 0)) * 31;
        ErrorLevel errorLevel = this.f73115e;
        int hashCode5 = (((hashCode4 + (errorLevel != null ? errorLevel.hashCode() : 0)) * 31) + this.f73116f) * 31;
        String str = this.f73117g;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f73118h;
        int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f73119i;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Boolean bool = this.f73120j;
        int hashCode9 = (((hashCode8 + (bool != null ? bool.hashCode() : 0)) * 31) + this.f73121k) * 31;
        Map<String, ? extends Object> map = this.f73122l;
        int hashCode10 = (hashCode9 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, ? extends Object> map2 = this.f73123m;
        int hashCode11 = (hashCode10 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<String, ? extends Object> map3 = this.f73124n;
        if (map3 != null) {
            i = map3.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        return "ErrorParams(biz=" + this.f73111a + ", scene=" + this.f73112b + ", event=" + this.f73113c + ", errorType=" + this.f73114d + ", errorLevel=" + this.f73115e + ", errorCode=" + this.f73116f + ", userAction=" + this.f73117g + ", page=" + this.f73118h + ", errorMessage=" + this.f73119i + ", needNet=" + this.f73120j + ", version=" + this.f73121k + ", extra=" + this.f73122l + ", extraMetric=" + this.f73123m + ", extraCategory=" + this.f73124n + ")";
    }

    /* renamed from: a */
    public final Biz mo103534a() {
        return this.f73111a;
    }

    /* renamed from: b */
    public final Scene mo103535b() {
        return this.f73112b;
    }

    /* renamed from: c */
    public final Event mo103536c() {
        return this.f73113c;
    }

    /* renamed from: d */
    public final ErrorType mo103537d() {
        return this.f73114d;
    }

    /* renamed from: e */
    public final ErrorLevel mo103538e() {
        return this.f73115e;
    }

    /* renamed from: f */
    public final int mo103540f() {
        return this.f73116f;
    }

    /* renamed from: g */
    public final String mo103541g() {
        return this.f73117g;
    }

    /* renamed from: h */
    public final String mo103542h() {
        return this.f73118h;
    }

    /* renamed from: i */
    public final String mo103544i() {
        return this.f73119i;
    }

    /* renamed from: j */
    public final Boolean mo103545j() {
        return this.f73120j;
    }

    /* renamed from: k */
    public final int mo103546k() {
        return this.f73121k;
    }

    /* renamed from: l */
    public final Map<String, Object> mo103547l() {
        return this.f73122l;
    }

    /* renamed from: m */
    public final Map<String, Object> mo103548m() {
        return this.f73123m;
    }

    /* renamed from: n */
    public final Map<String, Object> mo103549n() {
        return this.f73124n;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.WARNING, message = "格式更新 https://bytedance.feishu.cn/docs/doccnxWkTEi4U8Yx6dZdSGFdKkd", replaceWith = @ReplaceWith(expression = "\"replace with new ErrorParams\"", imports = {}))
    public ErrorParams(Biz biz, Scene scene, ErrorType errorType, ErrorLevel errorLevel, String str, String str2, String str3, Map<String, ? extends Object> map) {
        this(biz, scene, null, errorType, errorLevel, -1, str, str2, str3, true, map, null, null);
        Intrinsics.checkParameterIsNotNull(biz, "biz");
        Intrinsics.checkParameterIsNotNull(scene, "scene");
        Intrinsics.checkParameterIsNotNull(errorType, "errorType");
        Intrinsics.checkParameterIsNotNull(errorLevel, "errorLevel");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ErrorParams(com.ss.android.lark.appreciablelib.Biz r11, com.ss.android.lark.appreciablelib.Scene r12, com.ss.android.lark.appreciablelib.ErrorType r13, com.ss.android.lark.appreciablelib.ErrorLevel r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.util.Map r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r19
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x000b
            r0 = 0
            java.util.Map r0 = (java.util.Map) r0
            r9 = r0
            goto L_0x000d
        L_0x000b:
            r9 = r18
        L_0x000d:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.appreciablelib.ErrorParams.<init>(com.ss.android.lark.appreciablelib.Biz, com.ss.android.lark.appreciablelib.Scene, com.ss.android.lark.appreciablelib.ErrorType, com.ss.android.lark.appreciablelib.ErrorLevel, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ErrorParams(Biz biz, Scene scene, Event event, ErrorType errorType, ErrorLevel errorLevel, int i, String str, String str2, String str3, Boolean bool, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3) {
        this(biz, scene, event, errorType, errorLevel, i, str, str2, str3, bool, 1, map, map2, map3);
        Intrinsics.checkParameterIsNotNull(biz, "biz");
        Intrinsics.checkParameterIsNotNull(scene, "scene");
        Intrinsics.checkParameterIsNotNull(errorType, "errorType");
        Intrinsics.checkParameterIsNotNull(errorLevel, "errorLevel");
    }

    public ErrorParams(Biz biz, Scene scene, Event event, ErrorType errorType, ErrorLevel errorLevel, int i, String str, String str2, String str3, Boolean bool, int i2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3) {
        Intrinsics.checkParameterIsNotNull(biz, "biz");
        Intrinsics.checkParameterIsNotNull(scene, "scene");
        Intrinsics.checkParameterIsNotNull(errorType, "errorType");
        Intrinsics.checkParameterIsNotNull(errorLevel, "errorLevel");
        this.f73111a = biz;
        this.f73112b = scene;
        this.f73113c = event;
        this.f73114d = errorType;
        this.f73115e = errorLevel;
        this.f73116f = i;
        this.f73117g = str;
        this.f73118h = str2;
        this.f73119i = str3;
        this.f73120j = bool;
        this.f73121k = i2;
        this.f73122l = map;
        this.f73123m = map2;
        this.f73124n = map3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ErrorParams(com.ss.android.lark.appreciablelib.Biz r18, com.ss.android.lark.appreciablelib.Scene r19, com.ss.android.lark.appreciablelib.Event r20, com.ss.android.lark.appreciablelib.ErrorType r21, com.ss.android.lark.appreciablelib.ErrorLevel r22, int r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.Boolean r27, java.util.Map r28, java.util.Map r29, java.util.Map r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x000c
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            goto L_0x000e
        L_0x000c:
            r10 = r24
        L_0x000e:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0017
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            goto L_0x0019
        L_0x0017:
            r11 = r25
        L_0x0019:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0022
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1
            r12 = r1
            goto L_0x0024
        L_0x0022:
            r12 = r26
        L_0x0024:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x002d
            r1 = r2
            java.util.Map r1 = (java.util.Map) r1
            r14 = r1
            goto L_0x002f
        L_0x002d:
            r14 = r28
        L_0x002f:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0038
            r1 = r2
            java.util.Map r1 = (java.util.Map) r1
            r15 = r1
            goto L_0x003a
        L_0x0038:
            r15 = r29
        L_0x003a:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0044
            r0 = r2
            java.util.Map r0 = (java.util.Map) r0
            r16 = r0
            goto L_0x0046
        L_0x0044:
            r16 = r30
        L_0x0046:
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r13 = r27
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.appreciablelib.ErrorParams.<init>(com.ss.android.lark.appreciablelib.Biz, com.ss.android.lark.appreciablelib.Scene, com.ss.android.lark.appreciablelib.Event, com.ss.android.lark.appreciablelib.ErrorType, com.ss.android.lark.appreciablelib.ErrorLevel, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.Map, java.util.Map, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
