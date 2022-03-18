package kotlin.reflect.jvm.internal.impl.types.model;

import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.jvm.internal.Intrinsics;

public interface TypeSystemOptimizationContext {

    public static final class DefaultImpls {
        public static boolean identicalArguments(TypeSystemOptimizationContext typeSystemOptimizationContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
            Intrinsics.checkParameterIsNotNull(simpleTypeMarker, AbstractC60044a.f149675a);
            Intrinsics.checkParameterIsNotNull(simpleTypeMarker2, C63954b.f161494a);
            return false;
        }
    }

    boolean identicalArguments(SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2);
}
