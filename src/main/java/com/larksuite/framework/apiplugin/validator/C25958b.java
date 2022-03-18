package com.larksuite.framework.apiplugin.validator;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.validator.format.Max;
import com.larksuite.framework.apiplugin.validator.format.Min;
import com.larksuite.framework.apiplugin.validator.format.NotBlank;
import com.larksuite.framework.apiplugin.validator.format.NumberEnum;
import com.larksuite.framework.apiplugin.validator.format.Pattern;
import com.larksuite.framework.apiplugin.validator.format.Prefix;
import com.larksuite.framework.apiplugin.validator.format.StringEnum;
import com.larksuite.framework.apiplugin.validator.format.Suffix;
import com.larksuite.framework.apiplugin.validator.p1180a.C25945a;
import com.larksuite.framework.apiplugin.validator.p1180a.C25956b;
import com.larksuite.framework.apiplugin.validator.p1180a.p1181a.AbstractC25946a;
import com.larksuite.framework.apiplugin.validator.p1180a.p1182b.AbstractC25957a;
import com.larksuite.framework.apiplugin.validator.p1183b.AbstractC25960a;
import com.ss.android.lark.log.Log;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.List;

/* renamed from: com.larksuite.framework.apiplugin.validator.b */
public class C25958b {

    /* renamed from: a */
    private final AbstractC25960a f64273a;

    /* renamed from: b */
    private final JSONObject f64274b;

    /* renamed from: c */
    private final Class<?> f64275c;

    /* renamed from: com.larksuite.framework.apiplugin.validator.b$a */
    public static class C25959a {

        /* renamed from: a */
        private String f64276a;

        /* renamed from: b */
        private Class<?> f64277b;

        /* renamed from: c */
        private AbstractC25960a f64278c;

        /* renamed from: a */
        public C25958b mo92296a() {
            return new C25958b(this.f64278c, (JSONObject) JSON.parse(this.f64276a), this.f64277b);
        }

        /* renamed from: a */
        public C25959a mo92293a(AbstractC25960a aVar) {
            this.f64278c = aVar;
            return this;
        }

        /* renamed from: a */
        public C25959a mo92294a(Class<?> cls) {
            this.f64277b = cls;
            return this;
        }

        /* renamed from: a */
        public C25959a mo92295a(String str) {
            this.f64276a = str;
            return this;
        }
    }

    /* renamed from: a */
    public C25944a mo92292a() {
        Class<?> cls;
        JSONObject jSONObject = this.f64274b;
        if (jSONObject == null || (cls = this.f64275c) == null) {
            return new C25944a(true);
        }
        return m93970a(jSONObject, cls);
    }

    /* renamed from: c */
    private boolean m93975c(Class<?> cls) {
        if (cls == Float.TYPE || Float.class.isAssignableFrom(cls) || cls == Double.TYPE || Double.class.isAssignableFrom(cls) || BigDecimal.class.isAssignableFrom(cls)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m93974b(Class<?> cls) {
        if (cls == Long.TYPE || Long.class.isAssignableFrom(cls) || cls == Integer.TYPE || Integer.class.isAssignableFrom(cls) || cls == Short.TYPE || Short.class.isAssignableFrom(cls) || cls == Byte.TYPE || Byte.class.isAssignableFrom(cls) || cls == Float.TYPE || Float.class.isAssignableFrom(cls) || cls == Double.TYPE || Double.class.isAssignableFrom(cls) || BigDecimal.class.isAssignableFrom(cls)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m93972a(Class<?> cls) {
        if (cls.isPrimitive() || cls.isArray() || Long.class.isAssignableFrom(cls) || Integer.class.isAssignableFrom(cls) || Short.class.isAssignableFrom(cls) || Byte.class.isAssignableFrom(cls) || Float.class.isAssignableFrom(cls) || Double.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls) || Character.class.isAssignableFrom(cls) || String.class.isAssignableFrom(cls) || List.class.isAssignableFrom(cls)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private C25944a m93970a(JSONObject jSONObject, Class<?> cls) {
        String str;
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(JSONField.class)) {
                str = ((JSONField) field.getAnnotation(JSONField.class)).name();
            } else {
                str = field.getName();
            }
            Object obj = jSONObject.get(str);
            Class<?> type = field.getType();
            if (obj instanceof JSONObject) {
                C25944a a = m93970a((JSONObject) obj, type);
                if (!a.f64255a) {
                    return a;
                }
            } else if (!m93972a(type)) {
                return new C25944a(true);
            } else {
                C25944a a2 = m93971a(field, obj);
                if (!a2.f64255a) {
                    Log.m165397w(AbstractC25946a.f64257a, field.getName() + " type is not " + type);
                    return a2;
                }
                C25944a b = m93973b(field, obj);
                if (!b.f64255a) {
                    return b;
                }
            }
        }
        return new C25944a(true);
    }

    /* renamed from: a */
    private C25944a m93971a(Field field, Object obj) {
        Class<?> type = field.getType();
        C25944a aVar = new C25944a(true);
        if (obj instanceof Number) {
            if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal)) {
                if (!m93975c(type)) {
                    aVar.f64255a = false;
                    aVar.f64256b = field.getName() + " type is not Decimal Number";
                    return aVar;
                }
            } else if (!m93974b(type)) {
                aVar.f64255a = false;
                aVar.f64256b = field.getName() + " type is not Integer Number";
                return aVar;
            }
        } else if (obj instanceof CharSequence) {
            if (!String.class.isAssignableFrom(type)) {
                aVar.f64255a = false;
                aVar.f64256b = field.getName() + " type is not String";
                return aVar;
            }
        } else if (obj instanceof Boolean) {
            if (type != Boolean.TYPE && !Boolean.class.isAssignableFrom(type)) {
                aVar.f64255a = false;
                aVar.f64256b = field.getName() + " type is not Boolean";
                return aVar;
            }
        } else if ((obj instanceof JSONArray) && !List.class.isAssignableFrom(type) && !type.isArray()) {
            aVar.f64255a = false;
            aVar.f64256b = field.getName() + " type is not List or Array";
        }
        return aVar;
    }

    /* renamed from: b */
    private C25944a m93973b(Field field, Object obj) {
        Annotation[] annotations = field.getAnnotations();
        if (annotations == null || annotations.length == 0) {
            return new C25944a(true);
        }
        for (Annotation annotation : annotations) {
            if (C25945a.m93928a(annotation)) {
                AbstractC25957a aVar = null;
                if (C25945a.m93929b(annotation)) {
                    aVar = C25956b.m93962a(field, (NotBlank) annotation, obj, this.f64273a);
                } else if (C25945a.m93930c(annotation)) {
                    aVar = C25956b.m93966a(field, (StringEnum) annotation, obj, this.f64273a);
                } else if (C25945a.m93931d(annotation)) {
                    aVar = C25956b.m93963a(field, (NumberEnum) annotation, obj, this.f64273a);
                } else if (C25945a.m93932e(annotation)) {
                    aVar = C25956b.m93960a(field, (Max) annotation, obj, this.f64273a);
                } else if (C25945a.m93933f(annotation)) {
                    aVar = C25956b.m93961a(field, (Min) annotation, obj, this.f64273a);
                } else if (C25945a.m93934g(annotation)) {
                    aVar = C25956b.m93965a(field, (Prefix) annotation, obj, this.f64273a);
                } else if (C25945a.m93935h(annotation)) {
                    aVar = C25956b.m93967a(field, (Suffix) annotation, obj, this.f64273a);
                } else if (C25945a.m93936i(annotation)) {
                    aVar = C25956b.m93964a(field, (Pattern) annotation, obj, this.f64273a);
                } else if (C25945a.m93937j(annotation)) {
                    aVar = C25956b.m93959a(field, (LKRequiredParam) annotation, obj, this.f64273a);
                }
                if (aVar != null && !aVar.mo92291c()) {
                    return new C25944a(false, aVar.mo92290b());
                }
            }
        }
        return new C25944a(true);
    }

    public C25958b(AbstractC25960a aVar, JSONObject jSONObject, Class<?> cls) {
        this.f64273a = aVar;
        this.f64274b = jSONObject;
        this.f64275c = cls;
    }
}
