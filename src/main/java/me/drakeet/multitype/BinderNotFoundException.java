package me.drakeet.multitype;

public class BinderNotFoundException extends RuntimeException {
    public BinderNotFoundException(Class<?> cls) {
        super("Do you have registered the binder for {className}.class in the adapter/pool?".replace("{className}", cls.getSimpleName()));
    }
}
