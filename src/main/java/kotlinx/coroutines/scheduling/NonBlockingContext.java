package kotlinx.coroutines.scheduling;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/scheduling/NonBlockingContext;", "Lkotlinx/coroutines/scheduling/TaskContext;", "()V", "taskMode", "", "getTaskMode", "()I", "afterTask", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.scheduling.g */
public final class NonBlockingContext implements TaskContext {

    /* renamed from: a */
    public static final NonBlockingContext f173910a = new NonBlockingContext();

    /* renamed from: b */
    private static final int f173911b = 0;

    @Override // kotlinx.coroutines.scheduling.TaskContext
    /* renamed from: b */
    public void mo243100b() {
    }

    private NonBlockingContext() {
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    /* renamed from: c */
    public int mo243101c() {
        return f173911b;
    }
}
