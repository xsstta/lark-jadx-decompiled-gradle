package com.facebook.react.bridge;

import com.facebook.react.bridge.NativeModule;
import com.facebook.systrace.C21273a;
import com.facebook.systrace.Systrace;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class JavaModuleWrapper {
    private final ArrayList<MethodDescriptor> mDescs = new ArrayList<>();
    private final JSInstance mJSInstance;
    private final ArrayList<NativeModule.NativeMethod> mMethods = new ArrayList<>();
    private final ModuleHolder mModuleHolder;

    public String getName() {
        return this.mModuleHolder.getName();
    }

    public List<MethodDescriptor> getMethodDescriptors() {
        if (this.mDescs.isEmpty()) {
            findMethods();
        }
        return this.mDescs;
    }

    public BaseJavaModule getModule() {
        return (BaseJavaModule) this.mModuleHolder.getModule();
    }

    public NativeMap getConstants() {
        if (!this.mModuleHolder.getHasConstants()) {
            return null;
        }
        String name = getName();
        C21273a.m77086a(0, "JavaModuleWrapper.getConstants").mo72176a("moduleName", name).mo72177a();
        ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_START, name);
        BaseJavaModule module = getModule();
        Systrace.m77079a(0, "module.getConstants");
        Map<String, Object> constants = module.getConstants();
        Systrace.m77083b(0);
        Systrace.m77079a(0, "create WritableNativeMap");
        ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_START, name);
        try {
            return Arguments.makeNativeMap(constants);
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_END, name);
            Systrace.m77083b(0);
            ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_END, name);
            C21273a.m77085a(0).mo72177a();
        }
    }

    private void findMethods() {
        Systrace.m77079a(0, "findMethods");
        HashSet hashSet = new HashSet();
        Class<?> cls = this.mModuleHolder.getModule().getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (ReactModuleWithSpec.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            if (reactMethod != null) {
                String name = method.getName();
                if (!hashSet.contains(name)) {
                    MethodDescriptor methodDescriptor = new MethodDescriptor();
                    JavaMethodWrapper javaMethodWrapper = new JavaMethodWrapper(this, method, reactMethod.isBlockingSynchronousMethod());
                    methodDescriptor.name = name;
                    methodDescriptor.type = javaMethodWrapper.getType();
                    if (methodDescriptor.type == "sync") {
                        methodDescriptor.signature = javaMethodWrapper.getSignature();
                        methodDescriptor.method = method;
                    }
                    this.mMethods.add(javaMethodWrapper);
                    this.mDescs.add(methodDescriptor);
                } else {
                    throw new IllegalArgumentException("Java Module " + getName() + " method name already registered: " + name);
                }
            }
        }
        Systrace.m77083b(0);
    }

    public class MethodDescriptor {
        Method method;
        String name;
        String signature;
        String type;

        public MethodDescriptor() {
        }
    }

    public JavaModuleWrapper(JSInstance jSInstance, ModuleHolder moduleHolder) {
        this.mJSInstance = jSInstance;
        this.mModuleHolder = moduleHolder;
    }

    public void invoke(int i, ReadableNativeArray readableNativeArray) {
        ArrayList<NativeModule.NativeMethod> arrayList = this.mMethods;
        if (arrayList != null && i < arrayList.size()) {
            this.mMethods.get(i).invoke(this.mJSInstance, readableNativeArray);
        }
    }
}
