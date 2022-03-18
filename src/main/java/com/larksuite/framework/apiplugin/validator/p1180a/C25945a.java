package com.larksuite.framework.apiplugin.validator.p1180a;

import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.validator.format.Max;
import com.larksuite.framework.apiplugin.validator.format.Min;
import com.larksuite.framework.apiplugin.validator.format.NotBlank;
import com.larksuite.framework.apiplugin.validator.format.NumberEnum;
import com.larksuite.framework.apiplugin.validator.format.Pattern;
import com.larksuite.framework.apiplugin.validator.format.Prefix;
import com.larksuite.framework.apiplugin.validator.format.StringEnum;
import com.larksuite.framework.apiplugin.validator.format.Suffix;
import java.lang.annotation.Annotation;

/* renamed from: com.larksuite.framework.apiplugin.validator.a.a */
public class C25945a {
    /* renamed from: b */
    public static boolean m93929b(Annotation annotation) {
        return annotation instanceof NotBlank;
    }

    /* renamed from: c */
    public static boolean m93930c(Annotation annotation) {
        return annotation instanceof StringEnum;
    }

    /* renamed from: d */
    public static boolean m93931d(Annotation annotation) {
        return annotation instanceof NumberEnum;
    }

    /* renamed from: e */
    public static boolean m93932e(Annotation annotation) {
        return annotation instanceof Max;
    }

    /* renamed from: f */
    public static boolean m93933f(Annotation annotation) {
        return annotation instanceof Min;
    }

    /* renamed from: g */
    public static boolean m93934g(Annotation annotation) {
        return annotation instanceof Prefix;
    }

    /* renamed from: h */
    public static boolean m93935h(Annotation annotation) {
        return annotation instanceof Suffix;
    }

    /* renamed from: i */
    public static boolean m93936i(Annotation annotation) {
        return annotation instanceof Pattern;
    }

    /* renamed from: j */
    public static boolean m93937j(Annotation annotation) {
        return annotation instanceof LKRequiredParam;
    }

    /* renamed from: a */
    public static boolean m93928a(Annotation annotation) {
        if ((annotation instanceof NotBlank) || (annotation instanceof StringEnum) || (annotation instanceof NumberEnum) || (annotation instanceof Min) || (annotation instanceof Max) || (annotation instanceof Prefix) || (annotation instanceof Suffix) || (annotation instanceof Pattern) || (annotation instanceof LKRequiredParam)) {
            return true;
        }
        return false;
    }
}
