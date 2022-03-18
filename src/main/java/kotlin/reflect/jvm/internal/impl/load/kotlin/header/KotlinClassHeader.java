package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C69043h;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmBytecodeBinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;

public final class KotlinClassHeader {
    private final JvmBytecodeBinaryVersion bytecodeVersion;
    private final String[] data;
    private final int extraInt;
    private final String extraString;
    private final String[] incompatibleData;
    private final Kind kind;
    private final JvmMetadataVersion metadataVersion;
    private final String packageName;
    private final String[] strings;

    public enum Kind {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        
        public static final Companion Companion = new Companion(null);
        public static final Map<Integer, Kind> entryById;
        private final int id;

        @JvmStatic
        public static final Kind getById(int i) {
            return Companion.getById(i);
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final Kind getById(int i) {
                Kind kind = Kind.entryById.get(Integer.valueOf(i));
                if (kind != null) {
                    return kind;
                }
                return Kind.UNKNOWN;
            }
        }

        static {
            Kind[] values = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
            for (Kind kind : values) {
                linkedHashMap.put(Integer.valueOf(kind.id), kind);
            }
            entryById = linkedHashMap;
        }

        private Kind(int i) {
            this.id = i;
        }
    }

    public final String[] getData() {
        return this.data;
    }

    public final String[] getIncompatibleData() {
        return this.incompatibleData;
    }

    public final Kind getKind() {
        return this.kind;
    }

    public final JvmMetadataVersion getMetadataVersion() {
        return this.metadataVersion;
    }

    public final String[] getStrings() {
        return this.strings;
    }

    public final String getMultifileClassName() {
        boolean z;
        String str = this.extraString;
        if (this.kind == Kind.MULTIFILE_CLASS_PART) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        return null;
    }

    public final boolean isPreRelease() {
        if ((this.extraInt & 2) != 0) {
            return true;
        }
        return false;
    }

    public final List<String> getMultifilePartNames() {
        boolean z;
        String[] strArr = this.data;
        if (this.kind == Kind.MULTIFILE_CLASS) {
            z = true;
        } else {
            z = false;
        }
        List<String> list = null;
        if (!z) {
            strArr = null;
        }
        if (strArr != null) {
            list = C69043h.m265716a(strArr);
        }
        if (list != null) {
            return list;
        }
        return CollectionsKt.emptyList();
    }

    public String toString() {
        return this.kind + " version=" + this.metadataVersion;
    }

    public KotlinClassHeader(Kind kind2, JvmMetadataVersion jvmMetadataVersion, JvmBytecodeBinaryVersion jvmBytecodeBinaryVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i, String str2) {
        Intrinsics.checkParameterIsNotNull(kind2, "kind");
        Intrinsics.checkParameterIsNotNull(jvmMetadataVersion, "metadataVersion");
        Intrinsics.checkParameterIsNotNull(jvmBytecodeBinaryVersion, "bytecodeVersion");
        this.kind = kind2;
        this.metadataVersion = jvmMetadataVersion;
        this.bytecodeVersion = jvmBytecodeBinaryVersion;
        this.data = strArr;
        this.incompatibleData = strArr2;
        this.strings = strArr3;
        this.extraString = str;
        this.extraInt = i;
        this.packageName = str2;
    }
}
