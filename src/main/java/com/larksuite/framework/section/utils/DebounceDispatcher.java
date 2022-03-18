package com.larksuite.framework.section.utils;

import com.larksuite.framework.section.IActionDispatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/larksuite/framework/section/utils/DebounceDispatcher;", "", "dispatcher", "Lcom/larksuite/framework/section/IActionDispatcher;", "lastClickTime", "", "(Lcom/larksuite/framework/section/IActionDispatcher;J)V", "getLastClickTime", "()J", "setLastClickTime", "(J)V", "dispatchActionWithDebounce", "", "action", "", "interval", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.framework.a.a.b */
public final class DebounceDispatcher {

    /* renamed from: a */
    private final IActionDispatcher f64016a;

    /* renamed from: b */
    private long f64017b;

    public DebounceDispatcher(IActionDispatcher cVar, long j) {
        Intrinsics.checkParameterIsNotNull(cVar, "dispatcher");
        this.f64016a = cVar;
        this.f64017b = j;
    }

    /* renamed from: a */
    public final void mo92053a(int i, long j) {
        if (System.currentTimeMillis() - this.f64017b > j) {
            this.f64017b = System.currentTimeMillis();
            this.f64016a.mo92064a(i);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DebounceDispatcher(IActionDispatcher cVar, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, (i & 2) != 0 ? 0 : j);
    }

    /* renamed from: a */
    public static /* synthetic */ void m93662a(DebounceDispatcher bVar, int i, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 1000;
        }
        bVar.mo92053a(i, j);
    }
}
