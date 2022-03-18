package com.bytedance.kit.nglynx.model;

import com.lynx.jsbridge.LynxModule;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0006R$\u0010\u0002\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/bytedance/kit/nglynx/model/LynxModuleWrapper;", "", "clz", "Ljava/lang/Class;", "Lcom/lynx/jsbridge/LynxModule;", "moduleParams", "(Ljava/lang/Class;Ljava/lang/Object;)V", "getClz", "()Ljava/lang/Class;", "setClz", "(Ljava/lang/Class;)V", "getModuleParams", "()Ljava/lang/Object;", "setModuleParams", "(Ljava/lang/Object;)V", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.kit.nglynx.e.b */
public final class LynxModuleWrapper {

    /* renamed from: a */
    private Class<? extends LynxModule> f38607a;

    /* renamed from: b */
    private Object f38608b;

    public LynxModuleWrapper() {
        this(null, null, 3, null);
    }

    /* renamed from: a */
    public final Class<? extends LynxModule> mo53809a() {
        return this.f38607a;
    }

    /* renamed from: b */
    public final Object mo53810b() {
        return this.f38608b;
    }

    public LynxModuleWrapper(Class<? extends LynxModule> cls, Object obj) {
        this.f38607a = cls;
        this.f38608b = obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LynxModuleWrapper(Class cls, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cls, (i & 2) != 0 ? null : obj);
    }
}
