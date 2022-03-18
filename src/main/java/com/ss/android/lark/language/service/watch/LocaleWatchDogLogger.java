package com.ss.android.lark.language.service.watch;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.C26326z;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.log.LogLevel;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/language/service/watch/LocaleWatchDogLogger;", "", "()V", "Companion", "WatchChangeParam", "WatchParam", "base_language_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.language.service.b.b */
public final class LocaleWatchDogLogger {

    /* renamed from: a */
    public static final Companion f104874a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B-\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/language/service/watch/LocaleWatchDogLogger$WatchChangeParam;", "", "builder", "Lcom/ss/android/lark/language/service/watch/LocaleWatchDogLogger$WatchChangeParam$Builder;", "(Lcom/ss/android/lark/language/service/watch/LocaleWatchDogLogger$WatchChangeParam$Builder;)V", "processName", "", "originLocale", "Ljava/util/Locale;", "newLocale", "scene", "(Ljava/lang/String;Ljava/util/Locale;Ljava/util/Locale;Ljava/lang/String;)V", "isValid", "", "toString", "watch", "", "logLevel", "Lcom/ss/android/lark/log/LogLevel;", "Builder", "base_language_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.language.service.b.b$b */
    public static final class WatchChangeParam {

        /* renamed from: a */
        private String f104875a;

        /* renamed from: b */
        private Locale f104876b;

        /* renamed from: c */
        private Locale f104877c;

        /* renamed from: d */
        private String f104878d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\n@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\n@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/language/service/watch/LocaleWatchDogLogger$WatchChangeParam$Builder;", "", "()V", "<set-?>", "Ljava/util/Locale;", "newLocale", "getNewLocale", "()Ljava/util/Locale;", "originLocale", "getOriginLocale", "", "processName", "getProcessName", "()Ljava/lang/String;", "scene", "getScene", "build", "Lcom/ss/android/lark/language/service/watch/LocaleWatchDogLogger$WatchChangeParam;", "locale", "oriLocale", "base_language_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.language.service.b.b$b$a */
        public static final class Builder {

            /* renamed from: a */
            private String f104879a;

            /* renamed from: b */
            private Locale f104880b;

            /* renamed from: c */
            private Locale f104881c;

            /* renamed from: d */
            private String f104882d;

            /* renamed from: a */
            public final String mo148329a() {
                return this.f104879a;
            }

            /* renamed from: b */
            public final Locale mo148332b() {
                return this.f104880b;
            }

            /* renamed from: c */
            public final Locale mo148333c() {
                return this.f104881c;
            }

            /* renamed from: d */
            public final String mo148334d() {
                return this.f104882d;
            }

            /* renamed from: e */
            public final WatchChangeParam mo148335e() {
                return new WatchChangeParam(this, null);
            }

            /* renamed from: a */
            public final Builder mo148327a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "processName");
                Builder aVar = this;
                aVar.f104879a = str;
                return aVar;
            }

            /* renamed from: b */
            public final Builder mo148330b(String str) {
                Intrinsics.checkParameterIsNotNull(str, "scene");
                Builder aVar = this;
                aVar.f104882d = str;
                return aVar;
            }

            /* renamed from: a */
            public final Builder mo148328a(Locale locale) {
                Intrinsics.checkParameterIsNotNull(locale, "locale");
                Builder aVar = this;
                aVar.f104880b = locale;
                return aVar;
            }

            /* renamed from: b */
            public final Builder mo148331b(Locale locale) {
                Intrinsics.checkParameterIsNotNull(locale, "locale");
                Builder aVar = this;
                aVar.f104881c = locale;
                return aVar;
            }
        }

        /* renamed from: b */
        private final boolean m163111b() {
            if (this.f104878d != null) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo148324a() {
            mo148325a(LogLevel.INFO);
        }

        public String toString() {
            String str = this.f104875a;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            if (!(this.f104876b == null || this.f104877c == null)) {
                str2 = ", Locale change from " + this.f104876b + " to " + this.f104877c;
            }
            return "Locale(scene =" + this.f104878d + ", processName=" + str + ' ' + str2 + ')';
        }

        private WatchChangeParam(Builder aVar) {
            this(aVar.mo148329a(), aVar.mo148332b(), aVar.mo148333c(), aVar.mo148334d());
        }

        /* renamed from: a */
        public final void mo148325a(LogLevel logLevel) {
            Intrinsics.checkParameterIsNotNull(logLevel, "logLevel");
            if (!m163111b()) {
                return;
            }
            if (logLevel == LogLevel.INFO) {
                Log.m165389i("LocaleWatchDog", toString());
            } else if (logLevel.compareTo((Enum) LogLevel.INFO) < 0) {
                Log.m165379d("LocaleWatchDog", toString());
            }
        }

        public /* synthetic */ WatchChangeParam(Builder aVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar);
        }

        public WatchChangeParam(String str, Locale locale, Locale locale2, String str2) {
            this.f104875a = str;
            this.f104876b = locale;
            this.f104877c = locale2;
            this.f104878d = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B7\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/language/service/watch/LocaleWatchDogLogger$WatchParam;", "", "builder", "Lcom/ss/android/lark/language/service/watch/LocaleWatchDogLogger$WatchParam$Builder;", "(Lcom/ss/android/lark/language/service/watch/LocaleWatchDogLogger$WatchParam$Builder;)V", "activityName", "", "processName", "activityLocale", "Ljava/util/Locale;", "applicationLocale", "scene", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/util/Locale;Ljava/lang/String;)V", "isValid", "", "toString", "watch", "", "logLevel", "Lcom/ss/android/lark/log/LogLevel;", "Builder", "base_language_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.language.service.b.b$c */
    public static final class WatchParam {

        /* renamed from: a */
        private String f104883a;

        /* renamed from: b */
        private String f104884b;

        /* renamed from: c */
        private Locale f104885c;

        /* renamed from: d */
        private Locale f104886d;

        /* renamed from: e */
        private String f104887e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0004R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\b@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\b@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/language/service/watch/LocaleWatchDogLogger$WatchParam$Builder;", "", "()V", "<set-?>", "", "activityName", "getActivityName", "()Ljava/lang/String;", "Ljava/util/Locale;", "applicationLocale", "getApplicationLocale", "()Ljava/util/Locale;", "locale", "getLocale", "processName", "getProcessName", "scene", "getScene", "build", "Lcom/ss/android/lark/language/service/watch/LocaleWatchDogLogger$WatchParam;", "base_language_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.language.service.b.b$c$a */
        public static final class Builder {

            /* renamed from: a */
            private String f104888a;

            /* renamed from: b */
            private Locale f104889b;

            /* renamed from: c */
            private Locale f104890c;

            /* renamed from: d */
            private String f104891d;

            /* renamed from: e */
            private String f104892e;

            /* renamed from: a */
            public final String mo148341a() {
                return this.f104888a;
            }

            /* renamed from: b */
            public final Locale mo148344b() {
                return this.f104889b;
            }

            /* renamed from: c */
            public final Locale mo148346c() {
                return this.f104890c;
            }

            /* renamed from: d */
            public final String mo148347d() {
                return this.f104891d;
            }

            /* renamed from: e */
            public final String mo148348e() {
                return this.f104892e;
            }

            /* renamed from: f */
            public final WatchParam mo148349f() {
                return new WatchParam(this, null);
            }

            /* renamed from: a */
            public final Builder mo148339a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "processName");
                Builder aVar = this;
                aVar.f104888a = str;
                return aVar;
            }

            /* renamed from: b */
            public final Builder mo148342b(String str) {
                Intrinsics.checkParameterIsNotNull(str, "activityName");
                Builder aVar = this;
                aVar.f104891d = str;
                return aVar;
            }

            /* renamed from: c */
            public final Builder mo148345c(String str) {
                Intrinsics.checkParameterIsNotNull(str, "scene");
                Builder aVar = this;
                aVar.f104892e = str;
                return aVar;
            }

            /* renamed from: a */
            public final Builder mo148340a(Locale locale) {
                Intrinsics.checkParameterIsNotNull(locale, "locale");
                Builder aVar = this;
                aVar.f104889b = locale;
                return aVar;
            }

            /* renamed from: b */
            public final Builder mo148343b(Locale locale) {
                Intrinsics.checkParameterIsNotNull(locale, "locale");
                Builder aVar = this;
                aVar.f104890c = locale;
                return aVar;
            }
        }

        /* renamed from: b */
        private final boolean m163123b() {
            if (this.f104887e != null) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo148336a() {
            mo148337a(LogLevel.INFO);
        }

        public String toString() {
            String str;
            String str2 = "";
            if (this.f104883a == null) {
                str = str2;
            } else {
                str = "activityName=" + this.f104883a + ',';
            }
            if (this.f104885c != null) {
                str2 = "activityLocale=" + this.f104885c + ',';
            }
            return "Locale(scene =" + this.f104887e + ", processName=" + this.f104884b + ", " + str + ' ' + str2 + " application_locale=" + this.f104886d + ')';
        }

        private WatchParam(Builder aVar) {
            this(aVar.mo148347d(), aVar.mo148341a(), aVar.mo148344b(), aVar.mo148346c(), aVar.mo148348e());
        }

        /* renamed from: a */
        public final void mo148337a(LogLevel logLevel) {
            Intrinsics.checkParameterIsNotNull(logLevel, "logLevel");
            if (!m163123b()) {
                return;
            }
            if (logLevel == LogLevel.INFO) {
                Log.m165389i("LocaleWatchDog", toString());
            } else if (logLevel.compareTo((Enum) LogLevel.INFO) < 0) {
                Log.m165379d("LocaleWatchDog", toString());
            }
        }

        public /* synthetic */ WatchParam(Builder aVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar);
        }

        public WatchParam(String str, String str2, Locale locale, Locale locale2, String str3) {
            this.f104883a = str;
            this.f104884b = str2;
            this.f104885c = locale;
            this.f104886d = locale2;
            this.f104887e = str3;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final Locale m163107a(Context context) {
        return f104874a.mo148323a(context);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/language/service/watch/LocaleWatchDogLogger$Companion;", "", "()V", "getLocale", "Ljava/util/Locale;", "context", "Landroid/content/Context;", "watchActivity", "Lcom/ss/android/lark/language/service/watch/LocaleWatchDogLogger$WatchParam;", "scene", "", "activity", "Landroid/app/Activity;", "application", "Landroid/app/Application;", "watchApplication", "base_language_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.language.service.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Locale mo148323a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            if (C26326z.m95341e()) {
                Resources resources = context.getResources();
                Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
                Configuration configuration = resources.getConfiguration();
                Intrinsics.checkExpressionValueIsNotNull(configuration, "context.resources.configuration");
                Locale locale = configuration.getLocales().get(0);
                Intrinsics.checkExpressionValueIsNotNull(locale, "context.resources.configuration.locales[0]");
                return locale;
            }
            Resources resources2 = context.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources2, "context.resources");
            Locale locale2 = resources2.getConfiguration().locale;
            Intrinsics.checkExpressionValueIsNotNull(locale2, "context.resources.configuration.locale");
            return locale2;
        }

        @JvmStatic
        /* renamed from: a */
        public final WatchParam mo148322a(String str, Application application) {
            Intrinsics.checkParameterIsNotNull(str, "scene");
            Intrinsics.checkParameterIsNotNull(application, "application");
            try {
                WatchParam.Builder b = new WatchParam.Builder().mo148343b(mo148323a(application));
                String a = C26252ad.m94992a(application);
                Intrinsics.checkExpressionValueIsNotNull(a, "ProcessUtil.getProcessName(application)");
                return b.mo148339a(a).mo148345c(str).mo148349f();
            } catch (Exception e) {
                Log.m165383e("LocaleWatchDog", "error: " + e.getMessage());
                return new WatchParam.Builder().mo148349f();
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final WatchParam mo148321a(String str, Activity activity, Application application) {
            Locale locale;
            Locale locale2;
            Intrinsics.checkParameterIsNotNull(str, "scene");
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(application, "application");
            try {
                if (C26326z.m95341e()) {
                    Resources resources = activity.getResources();
                    Intrinsics.checkExpressionValueIsNotNull(resources, "activity.resources");
                    Configuration configuration = resources.getConfiguration();
                    Intrinsics.checkExpressionValueIsNotNull(configuration, "activity.resources.configuration");
                    locale2 = configuration.getLocales().get(0);
                    Intrinsics.checkExpressionValueIsNotNull(locale2, "activity.resources.configuration.locales[0]");
                    Resources resources2 = application.getResources();
                    Intrinsics.checkExpressionValueIsNotNull(resources2, "application.resources");
                    Configuration configuration2 = resources2.getConfiguration();
                    Intrinsics.checkExpressionValueIsNotNull(configuration2, "application.resources.configuration");
                    locale = configuration2.getLocales().get(0);
                    Intrinsics.checkExpressionValueIsNotNull(locale, "application.resources.configuration.locales[0]");
                } else {
                    Resources resources3 = activity.getResources();
                    Intrinsics.checkExpressionValueIsNotNull(resources3, "activity.resources");
                    locale2 = resources3.getConfiguration().locale;
                    Intrinsics.checkExpressionValueIsNotNull(locale2, "activity.resources.configuration.locale");
                    Resources resources4 = application.getResources();
                    Intrinsics.checkExpressionValueIsNotNull(resources4, "application.resources");
                    locale = resources4.getConfiguration().locale;
                    Intrinsics.checkExpressionValueIsNotNull(locale, "application.resources.configuration.locale");
                }
                WatchParam.Builder b = new WatchParam.Builder().mo148340a(locale2).mo148343b(locale);
                String a = C26252ad.m94992a(application);
                Intrinsics.checkExpressionValueIsNotNull(a, "ProcessUtil.getProcessName(application)");
                WatchParam.Builder a2 = b.mo148339a(a);
                String simpleName = activity.getClass().getSimpleName();
                Intrinsics.checkExpressionValueIsNotNull(simpleName, "activity.javaClass.simpleName");
                return a2.mo148342b(simpleName).mo148345c(str).mo148349f();
            } catch (Exception e) {
                Log.m165383e("LocaleWatchDog", "error: " + e.getMessage());
                return new WatchParam.Builder().mo148349f();
            }
        }
    }
}
