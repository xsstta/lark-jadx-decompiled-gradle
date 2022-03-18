package com.bytedance.ee.webapp.config;

import com.ss.android.lark.opmonitor.trace.OPTrace;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/webapp/config/WebappAuthStrategyCreator;", "", "()V", "currentStrategy", "", "getCurrentStrategy", "()Ljava/lang/String;", "setCurrentStrategy", "(Ljava/lang/String;)V", "create", "Lcom/bytedance/ee/webapp/config/IWebappAuthStrategy;", "opTrace", "Lcom/ss/android/lark/opmonitor/trace/OPTrace;", "createWebappContainerAuthStrategy", "Lcom/bytedance/ee/webapp/config/WebappContainerAuthStrategy;", "createWebappPrefixAuthStrategy", "Lcom/bytedance/ee/webapp/config/WebappPrefixAuthStrategy;", "createWebappUrlAuthStrategy", "Lcom/bytedance/ee/webapp/config/WebappUrlAuthStrategy;", "StrategyType", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class WebappAuthStrategyCreator {

    /* renamed from: a */
    public static final WebappAuthStrategyCreator f35997a = new WebappAuthStrategyCreator();
    @StrategyType

    /* renamed from: b */
    private static String f35998b = "container";

    @Target({ElementType.FIELD, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    @kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/webapp/config/WebappAuthStrategyCreator$StrategyType;", "", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface StrategyType {
        public static final Companion Companion = Companion.f35999a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/webapp/config/WebappAuthStrategyCreator$StrategyType$Companion;", "", "()V", "CONTAINER", "", "PREFIX", "URL", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.bytedance.ee.webapp.config.WebappAuthStrategyCreator$StrategyType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f35999a = new Companion();

            private Companion() {
            }
        }
    }

    private WebappAuthStrategyCreator() {
    }

    /* renamed from: a */
    public final String mo50783a() {
        return f35998b;
    }

    /* renamed from: b */
    private final WebappContainerAuthStrategy m55791b(OPTrace oPTrace) {
        f35998b = "container";
        return new WebappContainerAuthStrategy(oPTrace);
    }

    /* renamed from: c */
    private final WebappUrlAuthStrategy m55792c(OPTrace oPTrace) {
        f35998b = "url";
        return new WebappUrlAuthStrategy(oPTrace);
    }

    /* renamed from: d */
    private final WebappPrefixAuthStrategy m55793d(OPTrace oPTrace) {
        f35998b = "prefix";
        return new WebappPrefixAuthStrategy(oPTrace);
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC13780f m55790a(OPTrace oPTrace) {
        Intrinsics.checkParameterIsNotNull(oPTrace, "opTrace");
        String a = WebappAuthSettingHandler.f36021b.mo50808b().mo50806a();
        int hashCode = a.hashCode();
        if (hashCode != -980110702) {
            if (hashCode != -410956671) {
                if (hashCode == 116079 && a.equals("url")) {
                    return f35997a.m55792c(oPTrace);
                }
            } else if (a.equals("container")) {
                return f35997a.m55791b(oPTrace);
            }
        } else if (a.equals("prefix")) {
            return f35997a.m55793d(oPTrace);
        }
        return f35997a.m55791b(oPTrace);
    }
}
