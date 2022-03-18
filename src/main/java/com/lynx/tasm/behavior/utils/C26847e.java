package com.lynx.tasm.behavior.utils;

import androidx.collection.ArrayMap;
import com.lynx.react.bridge.AbstractC26517a;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.LynxPropGroup;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.tasm.behavior.utils.e */
public class C26847e {

    /* renamed from: a */
    private static final Map<Class, Map<String, AbstractC26858j>> f66678a = new ArrayMap();

    /* renamed from: b */
    private static final Map<String, AbstractC26858j> f66679b = new ArrayMap();

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.behavior.utils.e$a */
    public static class C26849a extends AbstractC26858j {
        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.C26847e.AbstractC26858j
        /* renamed from: a */
        public Object mo95610a(C26697s sVar) {
            return sVar.mo94779d(this.f66688a);
        }

        public C26849a(LynxProp lynxProp, Method method) {
            super(lynxProp, "Array", method);
        }

        public C26849a(LynxPropGroup lynxPropGroup, Method method, int i) {
            super(lynxPropGroup, "Array", method, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.behavior.utils.e$f */
    public static class C26854f extends AbstractC26858j {
        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.C26847e.AbstractC26858j
        /* renamed from: a */
        public Object mo95610a(C26697s sVar) {
            return sVar.mo94781f(this.f66688a);
        }

        public C26854f(LynxProp lynxProp, Method method) {
            super(lynxProp, "mixed", method);
        }

        public C26854f(LynxPropGroup lynxPropGroup, Method method, int i) {
            super(lynxPropGroup, "mixed", method, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.behavior.utils.e$i */
    public static class C26857i extends AbstractC26858j {
        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.C26847e.AbstractC26858j
        /* renamed from: a */
        public Object mo95610a(C26697s sVar) {
            return sVar.mo94780e(this.f66688a);
        }

        public C26857i(LynxProp lynxProp, Method method) {
            super(lynxProp, "Map", method);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.behavior.utils.e$k */
    public static class C26859k extends AbstractC26858j {
        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.C26847e.AbstractC26858j
        /* renamed from: a */
        public Object mo95610a(C26697s sVar) {
            return sVar.mo94778c(this.f66688a);
        }

        public C26859k(LynxProp lynxProp, Method method) {
            super(lynxProp, "String", method);
        }

        public C26859k(LynxPropGroup lynxPropGroup, Method method, int i) {
            super(lynxPropGroup, "String", method, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.behavior.utils.e$b */
    public static class C26850b extends AbstractC26858j {

        /* renamed from: e */
        private final boolean f66680e;

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.C26847e.AbstractC26858j
        /* renamed from: a */
        public Object mo95610a(C26697s sVar) {
            if (sVar.mo94776a(this.f66688a, this.f66680e)) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }

        public C26850b(LynxProp lynxProp, Method method, boolean z) {
            super(lynxProp, "boolean", method);
            this.f66680e = z;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.behavior.utils.e$e */
    public static class C26853e extends AbstractC26858j {

        /* renamed from: e */
        private final double f66681e;

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.C26847e.AbstractC26858j
        /* renamed from: a */
        public Object mo95610a(C26697s sVar) {
            return Double.valueOf(sVar.mo94772a(this.f66688a, this.f66681e));
        }

        public C26853e(LynxProp lynxProp, Method method, double d) {
            super(lynxProp, "number", method);
            this.f66681e = d;
        }

        public C26853e(LynxPropGroup lynxPropGroup, Method method, int i, double d) {
            super(lynxPropGroup, "number", method, i);
            this.f66681e = d;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.behavior.utils.e$g */
    public static class C26855g extends AbstractC26858j {

        /* renamed from: e */
        private final float f66682e;

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.C26847e.AbstractC26858j
        /* renamed from: a */
        public Object mo95610a(C26697s sVar) {
            return Float.valueOf(sVar.mo94773a(this.f66688a, this.f66682e));
        }

        public C26855g(LynxProp lynxProp, Method method, float f) {
            super(lynxProp, "number", method);
            this.f66682e = f;
        }

        public C26855g(LynxPropGroup lynxPropGroup, Method method, int i, float f) {
            super(lynxPropGroup, "number", method, i);
            this.f66682e = f;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.behavior.utils.e$h */
    public static class C26856h extends AbstractC26858j {

        /* renamed from: e */
        private final int f66683e;

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.C26847e.AbstractC26858j
        /* renamed from: a */
        public Object mo95610a(C26697s sVar) {
            return Integer.valueOf(sVar.mo94774a(this.f66688a, this.f66683e));
        }

        public C26856h(LynxProp lynxProp, Method method, int i) {
            super(lynxProp, "number", method);
            this.f66683e = i;
        }

        public C26856h(LynxPropGroup lynxPropGroup, Method method, int i, int i2) {
            super(lynxPropGroup, "number", method, i);
            this.f66683e = i2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.behavior.utils.e$c */
    public static class C26851c extends AbstractC26858j {
        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.C26847e.AbstractC26858j
        /* renamed from: a */
        public Object mo95610a(C26697s sVar) {
            if (sVar.mo94777b(this.f66688a)) {
                return null;
            }
            if (sVar.mo94776a(this.f66688a, false)) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }

        public C26851c(LynxProp lynxProp, Method method) {
            super(lynxProp, "boolean", method);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.behavior.utils.e$d */
    public static class C26852d extends AbstractC26858j {
        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.C26847e.AbstractC26858j
        /* renamed from: a */
        public Object mo95610a(C26697s sVar) {
            if (!sVar.mo94777b(this.f66688a)) {
                return Integer.valueOf(sVar.mo94774a(this.f66688a, 0));
            }
            return null;
        }

        public C26852d(LynxProp lynxProp, Method method) {
            super(lynxProp, "number", method);
        }

        public C26852d(LynxPropGroup lynxPropGroup, Method method, int i) {
            super(lynxPropGroup, "number", method, i);
        }
    }

    /* renamed from: a */
    static Map<String, AbstractC26858j> m97616a(Class<? extends LynxBaseUI> cls) {
        Class<? super Object> cls2;
        if (cls == null) {
            return f66679b;
        }
        Map<Class, Map<String, AbstractC26858j>> map = f66678a;
        Map<String, AbstractC26858j> map2 = map.get(cls);
        if (map2 != null) {
            return map2;
        }
        ArrayMap arrayMap = new ArrayMap();
        if (cls == LynxBaseUI.class) {
            cls2 = null;
        } else {
            cls2 = cls.getSuperclass();
        }
        arrayMap.putAll(m97616a(cls2));
        m97618a(cls, arrayMap);
        map.put(cls, arrayMap);
        return arrayMap;
    }

    /* renamed from: b */
    static Map<String, AbstractC26858j> m97619b(Class<? extends ShadowNode> cls) {
        Class<? super Object> cls2;
        if (cls == null) {
            return f66679b;
        }
        Map<Class, Map<String, AbstractC26858j>> map = f66678a;
        Map<String, AbstractC26858j> map2 = map.get(cls);
        if (map2 != null) {
            return map2;
        }
        ArrayMap arrayMap = new ArrayMap();
        if (cls == ShadowNode.class) {
            cls2 = null;
        } else {
            cls2 = cls.getSuperclass();
        }
        arrayMap.putAll(m97619b(cls2));
        m97620b(cls, arrayMap);
        map.put(cls, arrayMap);
        return arrayMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.utils.e$j */
    public static abstract class AbstractC26858j {

        /* renamed from: e */
        private static final Object[] f66684e = new Object[1];

        /* renamed from: f */
        private static final Object[] f66685f = new Object[2];

        /* renamed from: g */
        private static final Object[] f66686g = new Object[1];

        /* renamed from: h */
        private static final Object[] f66687h = new Object[2];

        /* renamed from: a */
        protected final String f66688a;

        /* renamed from: b */
        protected final String f66689b;

        /* renamed from: c */
        protected final Method f66690c;

        /* renamed from: d */
        protected final Integer f66691d;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract Object mo95610a(C26697s sVar);

        /* renamed from: a */
        public void mo95611a(ShadowNode shadowNode, C26697s sVar) {
            try {
                Integer num = this.f66691d;
                if (num == null) {
                    Object[] objArr = f66686g;
                    objArr[0] = mo95610a(sVar);
                    this.f66690c.invoke(shadowNode, objArr);
                    Arrays.fill(objArr, (Object) null);
                    return;
                }
                Object[] objArr2 = f66687h;
                objArr2[0] = num;
                objArr2[1] = mo95610a(sVar);
                this.f66690c.invoke(shadowNode, objArr2);
                Arrays.fill(objArr2, (Object) null);
            } catch (Throwable th) {
                throw new RuntimeException("Error while updating property '" + this.f66688a + "' in shadow node of type: " + shadowNode.mo94805h(), th);
            }
        }

        /* renamed from: a */
        public void mo95612a(LynxBaseUI lynxBaseUI, C26697s sVar) {
            try {
                Integer num = this.f66691d;
                if (num == null) {
                    Object[] objArr = f66684e;
                    objArr[0] = mo95610a(sVar);
                    this.f66690c.invoke(lynxBaseUI, objArr);
                    Arrays.fill(objArr, (Object) null);
                    return;
                }
                Object[] objArr2 = f66685f;
                objArr2[0] = num;
                objArr2[1] = mo95610a(sVar);
                this.f66690c.invoke(lynxBaseUI, objArr2);
                Arrays.fill(objArr2, (Object) null);
            } catch (Throwable th) {
                throw new RuntimeException("Error while updating property '" + this.f66688a + "' in shadow node of type: " + lynxBaseUI.getClass(), th);
            }
        }

        private AbstractC26858j(LynxProp lynxProp, String str, Method method) {
            this.f66688a = lynxProp.name();
            this.f66689b = !"__default_type__".equals(lynxProp.customType()) ? lynxProp.customType() : str;
            this.f66690c = method;
            this.f66691d = null;
        }

        private AbstractC26858j(LynxPropGroup lynxPropGroup, String str, Method method, int i) {
            this.f66688a = lynxPropGroup.names()[i];
            this.f66689b = !"__default_type__".equals(lynxPropGroup.customType()) ? lynxPropGroup.customType() : str;
            this.f66690c = method;
            this.f66691d = Integer.valueOf(i);
        }
    }

    /* renamed from: b */
    private static void m97620b(Class<? extends ShadowNode> cls, Map<String, AbstractC26858j> map) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            LynxProp lynxProp = (LynxProp) method.getAnnotation(LynxProp.class);
            if (lynxProp != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    map.put(lynxProp.name(), m97615a(lynxProp, method, parameterTypes[0]));
                } else {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
            }
            LynxPropGroup lynxPropGroup = (LynxPropGroup) method.getAnnotation(LynxPropGroup.class);
            if (lynxPropGroup != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                } else if (parameterTypes2[0] == Integer.TYPE) {
                    m97617a(lynxPropGroup, method, parameterTypes2[1], map);
                } else {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
            }
        }
    }

    /* renamed from: a */
    private static void m97618a(Class<? extends LynxBaseUI> cls, Map<String, AbstractC26858j> map) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            LynxProp lynxProp = (LynxProp) method.getAnnotation(LynxProp.class);
            if (lynxProp != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    map.put(lynxProp.name(), m97615a(lynxProp, method, parameterTypes[0]));
                } else {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
            }
            LynxPropGroup lynxPropGroup = (LynxPropGroup) method.getAnnotation(LynxPropGroup.class);
            if (lynxPropGroup != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                } else if (parameterTypes2[0] == Integer.TYPE) {
                    m97617a(lynxPropGroup, method, parameterTypes2[1], map);
                } else {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
            }
        }
    }

    /* renamed from: a */
    private static AbstractC26858j m97615a(LynxProp lynxProp, Method method, Class<?> cls) {
        if (cls == AbstractC26517a.class) {
            return new C26854f(lynxProp, method);
        }
        if (cls == Boolean.TYPE) {
            return new C26850b(lynxProp, method, lynxProp.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            return new C26856h(lynxProp, method, lynxProp.defaultInt());
        }
        if (cls == Float.TYPE) {
            return new C26855g(lynxProp, method, lynxProp.defaultFloat());
        }
        if (cls == Double.TYPE) {
            return new C26853e(lynxProp, method, lynxProp.defaultDouble());
        }
        if (cls == String.class) {
            return new C26859k(lynxProp, method);
        }
        if (cls == Boolean.class) {
            return new C26851c(lynxProp, method);
        }
        if (cls == Integer.class) {
            return new C26852d(lynxProp, method);
        }
        if (cls == ReadableArray.class) {
            return new C26849a(lynxProp, method);
        }
        if (cls == ReadableMap.class) {
            return new C26857i(lynxProp, method);
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
    }

    /* renamed from: a */
    private static void m97617a(LynxPropGroup lynxPropGroup, Method method, Class<?> cls, Map<String, AbstractC26858j> map) {
        String[] names = lynxPropGroup.names();
        int i = 0;
        if (cls == AbstractC26517a.class) {
            while (i < names.length) {
                map.put(names[i], new C26854f(lynxPropGroup, method, i));
                i++;
            }
        } else if (cls == Integer.TYPE) {
            while (i < names.length) {
                map.put(names[i], new C26856h(lynxPropGroup, method, i, lynxPropGroup.defaultInt()));
                i++;
            }
        } else if (cls == Float.TYPE) {
            while (i < names.length) {
                map.put(names[i], new C26855g(lynxPropGroup, method, i, lynxPropGroup.defaultFloat()));
                i++;
            }
        } else if (cls == Double.TYPE) {
            while (i < names.length) {
                map.put(names[i], new C26853e(lynxPropGroup, method, i, lynxPropGroup.defaultDouble()));
                i++;
            }
        } else if (cls == Integer.class) {
            while (i < names.length) {
                map.put(names[i], new C26852d(lynxPropGroup, method, i));
                i++;
            }
        } else if (cls == String.class) {
            while (i < names.length) {
                map.put(names[i], new C26859k(lynxPropGroup, method, i));
                i++;
            }
        } else if (cls == ReadableArray.class) {
            while (i < names.length) {
                map.put(names[i], new C26849a(lynxPropGroup, method, i));
                i++;
            }
        } else {
            throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
        }
    }
}
