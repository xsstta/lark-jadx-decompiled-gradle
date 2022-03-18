package com.ss.android.lark.integrator.im.container;

import com.bytedance.i18n.claymore.PluginServiceLoader;
import com.ss.android.lark.biz.im.extension.ChatContext;
import com.ss.android.lark.biz.im.extension.ChatWindowObserver;
import com.ss.android.lark.biz.im.extension.ExtensionFactory;
import com.ss.android.lark.biz.im.extension.ImExtension;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0007J\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000eJ\b\u0010\u0012\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/integrator/im/container/ExtensionManager;", "", "()V", "TAG", "", "extensionList", "", "Lcom/ss/android/lark/biz/im/extension/ImExtension;", "imContext", "Lcom/ss/android/lark/integrator/im/container/ImContextImpl;", "addExtension", "", "extension", "getChatWindowObserverFactoryList", "", "Lcom/ss/android/lark/biz/im/extension/ExtensionFactory;", "Lcom/ss/android/lark/biz/im/extension/ChatContext;", "Lcom/ss/android/lark/biz/im/extension/ChatWindowObserver;", "injectImExtensions", "im-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.im.d.a */
public final class ExtensionManager {

    /* renamed from: a */
    public static final ExtensionManager f101030a;

    /* renamed from: b */
    private static final List<ImExtension> f101031b = new ArrayList();

    /* renamed from: c */
    private static final ImContextImpl f101032c = new ImContextImpl();

    private ExtensionManager() {
    }

    /* renamed from: a */
    public final List<ExtensionFactory<ChatContext, ChatWindowObserver>> mo143621a() {
        return f101032c.mo143623a();
    }

    static {
        ExtensionManager aVar = new ExtensionManager();
        f101030a = aVar;
        aVar.m156641b();
    }

    /* renamed from: b */
    private final void m156641b() {
        Log.m165389i("ExtensionManager", "injectImExtensions");
        Iterator loadAll = PluginServiceLoader.loadAll(ImExtension.class);
        while (loadAll.hasNext()) {
            ImExtension gVar = (ImExtension) loadAll.next();
            Log.m165389i("ExtensionManager", "load ImExtension: " + gVar.getClass());
            f101030a.mo143622a(gVar);
        }
    }

    /* renamed from: a */
    public final void mo143622a(ImExtension gVar) {
        if (gVar != null) {
            List<ImExtension> list = f101031b;
            if (!list.contains(gVar)) {
                gVar.mo106817a(f101032c);
                list.add(gVar);
            }
        }
    }
}
