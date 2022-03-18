package com.ss.android.lark.main.splash;

import com.larksuite.framework.callback.Entity.ErrorResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/main/splash/SplashAdLoadResult;", "", "()V", "SplashAdData", "SplashAdLoadError", "Lcom/ss/android/lark/main/splash/SplashAdLoadResult$SplashAdData;", "Lcom/ss/android/lark/main/splash/SplashAdLoadResult$SplashAdLoadError;", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.splash.a */
public abstract class SplashAdLoadResult {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/main/splash/SplashAdLoadResult$SplashAdData;", "Lcom/ss/android/lark/main/splash/SplashAdLoadResult;", "splashAd", "", "(Ljava/lang/String;)V", "getSplashAd", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.splash.a$a */
    public static final class SplashAdData extends SplashAdLoadResult {

        /* renamed from: a */
        private final String f112874a;

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof SplashAdData) && Intrinsics.areEqual(this.f112874a, ((SplashAdData) obj).f112874a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.f112874a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "SplashAdData(splashAd=" + this.f112874a + ")";
        }

        /* renamed from: a */
        public final String mo157969a() {
            return this.f112874a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SplashAdData(String str) {
            super(null);
            Intrinsics.checkParameterIsNotNull(str, "splashAd");
            this.f112874a = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/main/splash/SplashAdLoadResult$SplashAdLoadError;", "Lcom/ss/android/lark/main/splash/SplashAdLoadResult;", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "(Lcom/larksuite/framework/callback/Entity/ErrorResult;)V", "getErrorResult", "()Lcom/larksuite/framework/callback/Entity/ErrorResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.splash.a$b */
    public static final class SplashAdLoadError extends SplashAdLoadResult {

        /* renamed from: a */
        private final ErrorResult f112875a;

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof SplashAdLoadError) && Intrinsics.areEqual(this.f112875a, ((SplashAdLoadError) obj).f112875a);
            }
            return true;
        }

        public int hashCode() {
            ErrorResult errorResult = this.f112875a;
            if (errorResult != null) {
                return errorResult.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "SplashAdLoadError(errorResult=" + this.f112875a + ")";
        }

        /* renamed from: a */
        public final ErrorResult mo157973a() {
            return this.f112875a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SplashAdLoadError(ErrorResult errorResult) {
            super(null);
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
            this.f112875a = errorResult;
        }
    }

    private SplashAdLoadResult() {
    }

    public /* synthetic */ SplashAdLoadResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
