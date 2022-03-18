package com.larksuite.component.metriclogger.consts.domains;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.larksuite.component.metriclogger.consts.domains.a */
public class C24340a {

    /* renamed from: a */
    private static final Map<Class, int[]> f60030a = new HashMap();

    /* renamed from: b */
    private static final int[] f60031b = new int[0];

    /* renamed from: a */
    public static int[] m88851a(Class<? extends C24340a> cls) {
        if (cls == null) {
            return f60031b;
        }
        Map<Class, int[]> map = f60030a;
        int[] iArr = map.get(cls);
        if (iArr != null) {
            return iArr;
        }
        int[] b = m88852b(cls);
        map.put(cls, b);
        return b;
    }

    /* renamed from: b */
    private static int[] m88852b(Class<? extends C24340a> cls) {
        int[] iArr = new int[0];
        if (cls == null) {
            return iArr;
        }
        ArrayList arrayList = new ArrayList();
        Annotation annotation = cls.getAnnotation(DomainAnno.class);
        while (true) {
            DomainAnno domainAnno = (DomainAnno) annotation;
            if (C24340a.class.isAssignableFrom(cls) && domainAnno != null) {
                arrayList.add(0, Integer.valueOf(domainAnno.value()));
                cls = cls.getSuperclass();
                annotation = cls.getAnnotation(DomainAnno.class);
            }
        }
        if (arrayList.isEmpty()) {
            return iArr;
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr2[i] = ((Integer) arrayList.get(i)).intValue();
        }
        return iArr2;
    }
}
