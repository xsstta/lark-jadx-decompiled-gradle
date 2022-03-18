package com.lark.falcon.engine.module;

import com.lark.falcon.engine.bridge.JavaOnlyArray;
import com.lark.falcon.engine.bridge.ReadableMap;
import com.lark.falcon.engine.module.anonotations.FalconMethod;
import com.lark.falcon.engine.module.anonotations.FalconPropGet;
import com.lark.falcon.engine.module.anonotations.FalconPropSet;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

public class ModuleHolder {
    HashMap<String, C24013a> mGetFieldMetas;
    HashMap<String, C24019e> mMethodMetas;
    JavaBaseModule mModule;
    HashMap<String, C24020f> mSetFieldMetas;

    public Object invokeMethod(String str, JavaOnlyArray javaOnlyArray) {
        return null;
    }

    public JavaBaseModule getModule() {
        return this.mModule;
    }

    public ReadableMap getConstants() {
        return this.mModule.getConstants();
    }

    public String name() {
        return this.mModule.name();
    }

    public boolean hasConstants() {
        if (this.mModule.getConstants() != null) {
            return true;
        }
        return false;
    }

    private void generatorMetaInfo() {
        Method[] declaredMethods = this.mModule.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation.getClass() == FalconPropGet.class) {
                    String name = ((FalconPropGet) annotation).name();
                    this.mGetFieldMetas.put(name, new C24013a(name, method.getReturnType(), method));
                } else if (annotation.getClass() == FalconPropSet.class) {
                    String name2 = ((FalconPropSet) annotation).name();
                    this.mSetFieldMetas.put(name2, new C24020f(name2, method));
                } else if (annotation.getClass() == FalconMethod.class) {
                    this.mMethodMetas.put(method.getName(), new C24019e(method.getName(), method.getReturnType(), Arrays.asList(method.getParameterTypes())));
                }
            }
        }
    }

    public ModuleHolder(JavaBaseModule javaBaseModule) {
        this.mModule = javaBaseModule;
        generatorMetaInfo();
    }

    public Object invokeGetField(String str) {
        C24013a aVar = this.mGetFieldMetas.get(str);
        if (aVar == null) {
            return null;
        }
        try {
            aVar.mo86194a().invoke(this.mModule, new Object[0]);
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void invokeSetField(String str, Object obj) {
        C24020f fVar = this.mSetFieldMetas.get(str);
        if (fVar != null) {
            try {
                fVar.mo86202a().invoke(this.mModule, obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }
}
