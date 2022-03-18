package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

public final class BuiltInsResourceLoader {
    public final InputStream loadResource(String str) {
        InputStream resourceAsStream;
        Intrinsics.checkParameterIsNotNull(str, "path");
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null || (resourceAsStream = classLoader.getResourceAsStream(str)) == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        return resourceAsStream;
    }
}
