package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.name.FqName;

public interface KotlinMetadataFinder {
    InputStream findBuiltInsData(FqName fqName);
}
