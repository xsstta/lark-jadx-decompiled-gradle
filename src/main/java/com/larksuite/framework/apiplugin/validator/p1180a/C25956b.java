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
import com.larksuite.framework.apiplugin.validator.p1180a.p1181a.C25947b;
import com.larksuite.framework.apiplugin.validator.p1180a.p1181a.C25948c;
import com.larksuite.framework.apiplugin.validator.p1180a.p1181a.C25949d;
import com.larksuite.framework.apiplugin.validator.p1180a.p1181a.C25950e;
import com.larksuite.framework.apiplugin.validator.p1180a.p1181a.C25951f;
import com.larksuite.framework.apiplugin.validator.p1180a.p1181a.C25952g;
import com.larksuite.framework.apiplugin.validator.p1180a.p1181a.C25953h;
import com.larksuite.framework.apiplugin.validator.p1180a.p1181a.C25954i;
import com.larksuite.framework.apiplugin.validator.p1180a.p1181a.C25955j;
import com.larksuite.framework.apiplugin.validator.p1180a.p1182b.AbstractC25957a;
import com.larksuite.framework.apiplugin.validator.p1183b.AbstractC25960a;
import java.lang.reflect.Field;

/* renamed from: com.larksuite.framework.apiplugin.validator.a.b */
public class C25956b {
    /* renamed from: a */
    public static AbstractC25957a m93959a(Field field, LKRequiredParam lKRequiredParam, Object obj, AbstractC25960a aVar) {
        return new C25953h(field, lKRequiredParam, obj, aVar);
    }

    /* renamed from: a */
    public static AbstractC25957a m93960a(Field field, Max max, Object obj, AbstractC25960a aVar) {
        return new C25947b(field, max, obj, aVar);
    }

    /* renamed from: a */
    public static AbstractC25957a m93961a(Field field, Min min, Object obj, AbstractC25960a aVar) {
        return new C25948c(field, min, obj, aVar);
    }

    /* renamed from: a */
    public static AbstractC25957a m93962a(Field field, NotBlank notBlank, Object obj, AbstractC25960a aVar) {
        return new C25949d(field, notBlank, obj, aVar);
    }

    /* renamed from: a */
    public static AbstractC25957a m93963a(Field field, NumberEnum numberEnum, Object obj, AbstractC25960a aVar) {
        return new C25950e(field, numberEnum, obj, aVar);
    }

    /* renamed from: a */
    public static AbstractC25957a m93964a(Field field, Pattern pattern, Object obj, AbstractC25960a aVar) {
        return new C25951f(field, pattern, obj, aVar);
    }

    /* renamed from: a */
    public static AbstractC25957a m93965a(Field field, Prefix prefix, Object obj, AbstractC25960a aVar) {
        return new C25952g(field, prefix, obj, aVar);
    }

    /* renamed from: a */
    public static AbstractC25957a m93966a(Field field, StringEnum stringEnum, Object obj, AbstractC25960a aVar) {
        return new C25954i(field, stringEnum, obj, aVar);
    }

    /* renamed from: a */
    public static AbstractC25957a m93967a(Field field, Suffix suffix, Object obj, AbstractC25960a aVar) {
        return new C25955j(field, suffix, obj, aVar);
    }
}
