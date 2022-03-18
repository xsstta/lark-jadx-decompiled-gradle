package com.ss.android.lark.multitask.screencapture;

import android.os.MemoryFile;
import android.os.ParcelFileDescriptor;
import com.ss.android.lark.log.Log;
import java.io.FileDescriptor;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000\u001a\b\u0010\t\u001a\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\n"}, d2 = {"TAG", "", "isValid", "", "Landroid/os/ParcelFileDescriptor;", "(Landroid/os/ParcelFileDescriptor;)Z", "dup", "memoryFile", "Landroid/os/MemoryFile;", "invalidFd", "base_multitask_impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.multitask.screencapture.b */
public final class C48350b {
    /* renamed from: a */
    public static final ParcelFileDescriptor m190714a() {
        ParcelFileDescriptor adoptFd = ParcelFileDescriptor.adoptFd(-1);
        Intrinsics.checkExpressionValueIsNotNull(adoptFd, "ParcelFileDescriptor.adoptFd(-1)");
        return adoptFd;
    }

    /* renamed from: a */
    public static final boolean m190716a(ParcelFileDescriptor parcelFileDescriptor) {
        Intrinsics.checkParameterIsNotNull(parcelFileDescriptor, "$this$isValid");
        if (parcelFileDescriptor.getFd() != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final ParcelFileDescriptor m190715a(MemoryFile memoryFile) {
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            Object invoke = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]).invoke(memoryFile, new Object[0]);
            if (invoke != null) {
                parcelFileDescriptor = ParcelFileDescriptor.dup((FileDescriptor) invoke);
                if (parcelFileDescriptor == null) {
                    return m190714a();
                }
                return parcelFileDescriptor;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.io.FileDescriptor");
        } catch (Exception e) {
            Log.m165384e("MemoryFiles", "error dup MemoryFile", e);
        }
    }
}
