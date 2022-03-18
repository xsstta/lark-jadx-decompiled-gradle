package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

public interface JavaEnumValueAnnotationArgument extends JavaAnnotationArgument {
    Name getEntryName();

    ClassId getEnumClassId();
}
