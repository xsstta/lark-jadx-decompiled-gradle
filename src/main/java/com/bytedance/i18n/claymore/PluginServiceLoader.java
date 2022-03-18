package com.bytedance.i18n.claymore;

import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0000\u0010\u0005*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007H\u0007J%\u0010\b\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007H\u0007¢\u0006\u0002\u0010\tJ'\u0010\n\u001a\u0004\u0018\u0001H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007H\u0007¢\u0006\u0002\u0010\tJ.\u0010\u000b\u001a\u00020\f\"\b\b\u0000\u0010\u0005*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lcom/bytedance/i18n/claymore/PluginServiceLoader;", "", "()V", "loadAll", "", "T", C60375c.f150914a, "Ljava/lang/Class;", "loadFirst", "(Ljava/lang/Class;)Ljava/lang/Object;", "loadFirstOrNull", "registerLoader", "", "loader", "Lcom/bytedance/i18n/claymore/ClaymoreServiceLoader$Loader;", "core"}, mo238835k = 1, mv = {1, 4, 0})
public final class PluginServiceLoader {
    public static final PluginServiceLoader INSTANCE = new PluginServiceLoader();

    private PluginServiceLoader() {
    }

    @JvmStatic
    public static final <T> Iterator<T> loadAll(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, C60375c.f150914a);
        return ClaymoreServiceLoader.loadAll(cls);
    }

    @JvmStatic
    public static final <T> T loadFirst(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, C60375c.f150914a);
        return (T) ClaymoreServiceLoader.loadFirst(cls);
    }

    @JvmStatic
    public static final <T> T loadFirstOrNull(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, C60375c.f150914a);
        return (T) ClaymoreServiceLoader.loadFirstOrNull(cls);
    }

    @JvmStatic
    public static final <T> void registerLoader(Class<T> cls, ClaymoreServiceLoader.Loader<T> loader) {
        Intrinsics.checkParameterIsNotNull(cls, C60375c.f150914a);
        Intrinsics.checkParameterIsNotNull(loader, "loader");
        ClaymoreServiceLoader.registerLoader(cls, loader);
    }
}
