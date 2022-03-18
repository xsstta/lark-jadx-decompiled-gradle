package com.lark.falcon.engine.module;

import com.lark.falcon.engine.bridge.ReadableMap;
import com.lark.falcon.engine.holder.AndroidFalconShellHolder;

public interface JavaBaseModule {

    /* renamed from: com.lark.falcon.engine.module.JavaBaseModule$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static String $default$aliasName(JavaBaseModule javaBaseModule) {
            return null;
        }

        public static ReadableMap $default$getConstants(JavaBaseModule javaBaseModule) {
            return null;
        }

        public static boolean $default$hasAliasName(JavaBaseModule javaBaseModule) {
            return false;
        }

        public static void $default$initialize(JavaBaseModule javaBaseModule, AndroidFalconShellHolder androidFalconShellHolder) {
        }
    }

    String aliasName();

    ReadableMap getConstants();

    boolean hasAliasName();

    void initialize(AndroidFalconShellHolder androidFalconShellHolder);

    String name();
}
