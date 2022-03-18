package com.ss.ugc.effectplatform.task;

import bytekn.foundation.task.ITask;
import bytekn.foundation.utils.Transmitter;
import com.ss.ugc.effectplatform.listener.CallbackManager;
import com.ss.ugc.effectplatform.listener.IEffectPlatformBaseListener;
import com.ss.ugc.effectplatform.listener.IEffectPlatformWithLifeCycleListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H$J\b\u0010\u0012\u001a\u00020\u0010H$J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\u0016\u0010\u0015\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0017H\u0004R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/ugc/effectplatform/task/BaseTask;", "Lbytekn/foundation/task/ITask;", "taskId", "", "callbackManager", "Lcom/ss/ugc/effectplatform/listener/CallbackManager;", "(Ljava/lang/String;Lcom/ss/ugc/effectplatform/listener/CallbackManager;)V", "id", "getId", "()Ljava/lang/String;", "isCanceled", "", "()Z", "setCanceled", "(Z)V", "cancel", "", "execute", "onCancel", "onPreExecute", "run", "runOnMainThread", "block", "Lkotlin/Function0;", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.task.b */
public abstract class BaseTask implements ITask {

    /* renamed from: a */
    private boolean f165006a;

    /* renamed from: b */
    private String f165007b;

    /* renamed from: c */
    private final CallbackManager f165008c;

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo228248f();

    /* renamed from: h */
    public void mo228261h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo228260g() {
        return this.f165006a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/ss/ugc/effectplatform/task/BaseTask$runOnMainThread$1", "Ljava/lang/Runnable;", "Lbytekn/foundation/concurrent/Runnable;", "run", "", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.b$a */
    public static final class RunnableC65525a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Function0 f165009a;

        public void run() {
            this.f165009a.invoke();
        }

        RunnableC65525a(Function0 function0) {
            this.f165009a = function0;
        }
    }

    @Override // bytekn.foundation.task.ITask
    /* renamed from: a */
    public String mo8666a() {
        String str = this.f165007b;
        if (str != null) {
            return str;
        }
        return "0";
    }

    @Override // bytekn.foundation.task.ITask
    /* renamed from: b */
    public void mo8667b() {
        IEffectPlatformBaseListener bVar;
        String str = this.f165007b;
        IEffectPlatformBaseListener bVar2 = null;
        if (str != null) {
            CallbackManager aVar = this.f165008c;
            if (aVar != null) {
                bVar = aVar.mo227753a(str);
            } else {
                bVar = null;
            }
            if (bVar instanceof IEffectPlatformWithLifeCycleListener) {
                ((IEffectPlatformWithLifeCycleListener) bVar).mo227756a();
            }
        }
        if (!this.f165006a) {
            mo228248f();
            String str2 = this.f165007b;
            if (str2 != null) {
                CallbackManager aVar2 = this.f165008c;
                if (aVar2 != null) {
                    bVar2 = aVar2.mo227753a(str2);
                }
                if (bVar2 instanceof IEffectPlatformWithLifeCycleListener) {
                    ((IEffectPlatformWithLifeCycleListener) bVar2).mo227757b();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo228259a(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "block");
        Transmitter.f5769a.mo8678a(new RunnableC65525a(function0));
    }

    public BaseTask(String str, CallbackManager aVar) {
        this.f165007b = str;
        this.f165008c = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseTask(String str, CallbackManager aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : aVar);
    }
}
