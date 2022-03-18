package com.ss.android.lark.feed.app.binder;

public class BinderNotFoundException extends RuntimeException {
    public BinderNotFoundException(Class<?> cls) {
        super("Do you have registered {className}.class to the binder in the adapter/pool?".replace("{className}", cls.getSimpleName()));
    }
}
