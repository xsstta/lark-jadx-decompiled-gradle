package com.lark.falcon.engine.module;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class FalconModuleRegistry {
    private ConcurrentHashMap<Class<? extends JavaBaseModule>, JavaBaseModule> mModuleClsMap = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, JavaBaseModule> mModules = new ConcurrentHashMap<>();

    static FalconModuleRegistry createRegistry() {
        return new FalconModuleRegistry();
    }

    public List<JavaBaseModule> getModules() {
        return new ArrayList(this.mModules.values());
    }

    public <T extends JavaBaseModule> T getModule(Class<T> cls) {
        return (T) this.mModuleClsMap.get(cls);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.util.concurrent.ConcurrentHashMap<java.lang.Class<? extends com.lark.falcon.engine.module.JavaBaseModule>, com.lark.falcon.engine.module.JavaBaseModule> */
    /* JADX WARN: Multi-variable type inference failed */
    public void registerModule(JavaBaseModule javaBaseModule) {
        this.mModules.put(javaBaseModule.name(), javaBaseModule);
        this.mModuleClsMap.put(javaBaseModule.getClass(), javaBaseModule);
    }
}
