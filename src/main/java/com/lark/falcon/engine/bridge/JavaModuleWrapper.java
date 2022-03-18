package com.lark.falcon.engine.bridge;

import com.lark.falcon.engine.holder.AndroidFalconShellHolder;
import com.lark.falcon.engine.module.JavaBaseModule;
import com.lark.falcon.engine.module.anonotations.FalconMethod;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class JavaModuleWrapper {
    private final ArrayList<MethodDescriptor> mDescs = new ArrayList<>();
    private final ArrayList<Object> mMethods = new ArrayList<>();
    private final JavaBaseModule mModule;
    private AndroidFalconShellHolder mShellHolder;

    public JavaBaseModule getModule() {
        return this.mModule;
    }

    public String getName() {
        return this.mModule.name();
    }

    public List<MethodDescriptor> getMethodDescriptors() {
        if (this.mDescs.isEmpty()) {
            findBindingMetaInfo();
        }
        return this.mDescs;
    }

    public String getAliasName() {
        if (this.mModule.hasAliasName()) {
            return this.mModule.aliasName();
        }
        return "";
    }

    public ReadableMap getConstants() {
        if (this.mModule.getConstants() == null) {
            return new JavaOnlyMap();
        }
        return getModule().getConstants();
    }

    private void findBindingMetaInfo() {
        Method[] declaredMethods = getModule().getClass().getDeclaredMethods();
        HashSet hashSet = new HashSet();
        for (Method method : declaredMethods) {
            if (((FalconMethod) method.getAnnotation(FalconMethod.class)) != null) {
                String name = method.getName();
                if (!hashSet.contains(name)) {
                    JavaMethodWrapper javaMethodWrapper = new JavaMethodWrapper(this, method);
                    MethodDescriptor methodDescriptor = new MethodDescriptor(method, javaMethodWrapper.getSignature(), name, javaMethodWrapper.getType());
                    this.mMethods.add(javaMethodWrapper);
                    this.mDescs.add(methodDescriptor);
                } else {
                    throw new IllegalArgumentException("Java Module " + getName() + " method name already registered: " + name);
                }
            }
        }
    }

    public static JavaModuleWrapper create(JavaBaseModule javaBaseModule) {
        return new JavaModuleWrapper(javaBaseModule);
    }

    public void initModule(AndroidFalconShellHolder androidFalconShellHolder) {
        this.mModule.initialize(androidFalconShellHolder);
        this.mShellHolder = androidFalconShellHolder;
    }

    public JavaModuleWrapper(JavaBaseModule javaBaseModule) {
        this.mModule = javaBaseModule;
    }

    public void onErrorReport(int i, String str) {
        AndroidFalconShellHolder androidFalconShellHolder = this.mShellHolder;
        if (androidFalconShellHolder != null && androidFalconShellHolder.mo86097h() != null) {
            this.mShellHolder.mo86097h().onError(i, str);
        }
    }
}
