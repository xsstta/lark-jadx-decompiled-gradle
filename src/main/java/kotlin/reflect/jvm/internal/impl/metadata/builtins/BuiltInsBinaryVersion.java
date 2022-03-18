package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;

public final class BuiltInsBinaryVersion extends BinaryVersion {
    public static final Companion Companion = new Companion(null);
    public static final BuiltInsBinaryVersion INSTANCE = new BuiltInsBinaryVersion(1, 0, 7);
    public static final BuiltInsBinaryVersion INVALID_VERSION = new BuiltInsBinaryVersion(new int[0]);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BuiltInsBinaryVersion readFrom(InputStream inputStream) {
            Intrinsics.checkParameterIsNotNull(inputStream, "stream");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            IntRange kVar = new IntRange(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(kVar, 10));
            Iterator it = kVar.iterator();
            while (it.hasNext()) {
                ((IntIterator) it).mo238946b();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] intArray = CollectionsKt.toIntArray(arrayList);
            return new BuiltInsBinaryVersion(Arrays.copyOf(intArray, intArray.length));
        }
    }

    public boolean isCompatible() {
        return isCompatibleTo(INSTANCE);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuiltInsBinaryVersion(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        Intrinsics.checkParameterIsNotNull(iArr, "numbers");
    }
}
