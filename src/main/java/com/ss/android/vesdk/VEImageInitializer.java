package com.ss.android.vesdk;

import android.app.Application;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/vesdk/VEImageInitializer;", "", "()V", "resourceFinder", "Lcom/bef/effectsdk/ResourceFinder;", "createEffectResourceFinder", "", "effectHandle", "destoryEffectResourceFinder", "", "init", "application", "Landroid/app/Application;", "veimage_release"}, mo238835k = 1, mv = {1, 1, 13})
public final class VEImageInitializer {
    public static final VEImageInitializer INSTANCE = new VEImageInitializer();
    private static ResourceFinder resourceFinder;

    private VEImageInitializer() {
    }

    public final void init(Application application) {
        Intrinsics.checkParameterIsNotNull(application, "application");
        resourceFinder = new AssetResourceFinder(application.getAssets(), "");
    }

    @JvmStatic
    private static final long createEffectResourceFinder(long j) {
        ResourceFinder resourceFinder2 = resourceFinder;
        if (resourceFinder2 != null) {
            return resourceFinder2.createNativeResourceFinder(j);
        }
        Object invoke = Class.forName("com.ss.android.medialib.VideoSdkCore").getDeclaredMethod("getNativeFinder", Long.TYPE).invoke(null, Long.valueOf(j));
        if (invoke != null) {
            return ((Long) invoke).longValue();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Long");
    }

    @JvmStatic
    private static final void destoryEffectResourceFinder(long j) {
        ResourceFinder resourceFinder2 = resourceFinder;
        if (resourceFinder2 != null) {
            resourceFinder = null;
            resourceFinder2.release(j);
            return;
        }
        Class.forName("com.ss.android.medialib.VideoSdkCore").getDeclaredMethod("releaseNativeFinder", Long.TYPE).invoke(null, Long.valueOf(j));
    }
}
