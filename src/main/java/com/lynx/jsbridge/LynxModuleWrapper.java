package com.lynx.jsbridge;

import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.base.LLog;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class LynxModuleWrapper {

    /* renamed from: a */
    private final LynxModule f65527a;

    /* renamed from: b */
    private final ArrayList<MethodDescriptor> f65528b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<AttributeDescriptor> f65529c = new ArrayList<>();

    /* renamed from: d */
    private final String f65530d;

    public LynxModule getModule() {
        return this.f65527a;
    }

    public String getName() {
        return this.f65530d;
    }

    public Collection<AttributeDescriptor> getAttributeDescriptor() {
        if (this.f65529c.isEmpty()) {
            try {
                m96070b();
            } catch (RuntimeException e) {
                LLog.m96429e("LynxModuleWrapper", e.toString());
            }
        }
        return this.f65529c;
    }

    public Collection<MethodDescriptor> getMethodDescriptors() {
        if (this.f65528b.isEmpty()) {
            try {
                m96069a();
            } catch (RuntimeException e) {
                LLog.m96429e("LynxModuleWrapper", e.toString());
            }
        }
        return this.f65528b;
    }

    /* renamed from: a */
    private void m96069a() {
        HashSet hashSet = new HashSet();
        Method[] declaredMethods = this.f65527a.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (((LynxMethod) method.getAnnotation(LynxMethod.class)) != null) {
                String name = method.getName();
                if (!hashSet.contains(name)) {
                    hashSet.add(name);
                    MethodDescriptor methodDescriptor = new MethodDescriptor();
                    C26508c cVar = new C26508c(method);
                    methodDescriptor.f65540c = name;
                    methodDescriptor.f65539b = cVar.mo93989a();
                    methodDescriptor.f65538a = method;
                    this.f65528b.add(methodDescriptor);
                } else {
                    throw new IllegalArgumentException("Java Module " + getName() + " method name already registered: " + name);
                }
            }
        }
    }

    /* renamed from: b */
    private void m96070b() {
        HashSet hashSet = new HashSet();
        Field[] declaredFields = this.f65527a.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            if (((LynxAttribute) field.getAnnotation(LynxAttribute.class)) != null) {
                String name = field.getName();
                if (!hashSet.contains(name)) {
                    hashSet.add(name);
                    AttributeDescriptor attributeDescriptor = new AttributeDescriptor();
                    attributeDescriptor.f65505a = name;
                    attributeDescriptor.f65506b = new JavaOnlyArray();
                    try {
                        attributeDescriptor.f65506b.add(field.get(this.f65527a));
                    } catch (IllegalAccessException e) {
                        LLog.m96429e("LynxModuleWrapper", e.toString());
                    }
                    this.f65529c.add(attributeDescriptor);
                } else {
                    throw new IllegalArgumentException("Java Module " + getName() + " attribute name already registered: " + name);
                }
            }
        }
    }

    public LynxModuleWrapper(String str, LynxModule lynxModule) {
        this.f65530d = str;
        this.f65527a = lynxModule;
    }
}
