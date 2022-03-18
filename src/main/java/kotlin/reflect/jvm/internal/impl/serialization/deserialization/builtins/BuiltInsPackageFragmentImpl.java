package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

public final class BuiltInsPackageFragmentImpl extends DeserializedPackageFragmentImpl implements BuiltInsPackageFragment {
    public static final Companion Companion = new Companion(null);
    private final boolean isFallback;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0083, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0084, code lost:
            kotlin.io.C69101b.m265907a(r1, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0088, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl create(kotlin.reflect.jvm.internal.impl.name.FqName r11, kotlin.reflect.jvm.internal.impl.storage.StorageManager r12, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r13, java.io.InputStream r14, boolean r15) {
            /*
            // Method dump skipped, instructions count: 137
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl.Companion.create(kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.storage.StorageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, java.io.InputStream, boolean):kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl");
        }
    }

    private BuiltInsPackageFragmentImpl(FqName fqName, StorageManager storageManager, ModuleDescriptor moduleDescriptor, ProtoBuf.PackageFragment packageFragment, BuiltInsBinaryVersion builtInsBinaryVersion, boolean z) {
        super(fqName, storageManager, moduleDescriptor, packageFragment, builtInsBinaryVersion, null);
        this.isFallback = z;
    }

    public /* synthetic */ BuiltInsPackageFragmentImpl(FqName fqName, StorageManager storageManager, ModuleDescriptor moduleDescriptor, ProtoBuf.PackageFragment packageFragment, BuiltInsBinaryVersion builtInsBinaryVersion, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(fqName, storageManager, moduleDescriptor, packageFragment, builtInsBinaryVersion, z);
    }
}
