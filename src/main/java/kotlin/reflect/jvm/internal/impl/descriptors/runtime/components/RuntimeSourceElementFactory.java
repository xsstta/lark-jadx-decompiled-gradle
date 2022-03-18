package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;

public final class RuntimeSourceElementFactory implements JavaSourceElementFactory {
    public static final RuntimeSourceElementFactory INSTANCE = new RuntimeSourceElementFactory();

    public static final class RuntimeSourceElement implements JavaSourceElement {
        private final ReflectJavaElement javaElement;

        @Override // kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement
        public ReflectJavaElement getJavaElement() {
            return this.javaElement;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
        public SourceFile getContainingFile() {
            SourceFile sourceFile = SourceFile.NO_SOURCE_FILE;
            Intrinsics.checkExpressionValueIsNotNull(sourceFile, "SourceFile.NO_SOURCE_FILE");
            return sourceFile;
        }

        public String toString() {
            return getClass().getName() + ": " + getJavaElement().toString();
        }

        public RuntimeSourceElement(ReflectJavaElement reflectJavaElement) {
            Intrinsics.checkParameterIsNotNull(reflectJavaElement, "javaElement");
            this.javaElement = reflectJavaElement;
        }
    }

    private RuntimeSourceElementFactory() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory
    public JavaSourceElement source(JavaElement javaElement) {
        Intrinsics.checkParameterIsNotNull(javaElement, "javaElement");
        return new RuntimeSourceElement((ReflectJavaElement) javaElement);
    }
}
