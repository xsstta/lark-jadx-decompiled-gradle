package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/NonDisposableHandle;", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/ChildHandle;", "()V", "childCancelled", "", "cause", "", "dispose", "", "toString", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.cg */
public final class NonDisposableHandle implements DisposableHandle, ChildHandle {

    /* renamed from: a */
    public static final NonDisposableHandle f173485a = new NonDisposableHandle();

    @Override // kotlinx.coroutines.DisposableHandle
    /* renamed from: a */
    public void mo242687a() {
    }

    @Override // kotlinx.coroutines.ChildHandle
    /* renamed from: b */
    public boolean mo242781b(Throwable th) {
        return false;
    }

    public String toString() {
        return "NonDisposableHandle";
    }

    private NonDisposableHandle() {
    }
}
