package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlinx.coroutines.al;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B!\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u00060\u0003j\u0002`\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/scheduling/TaskImpl;", "Lkotlinx/coroutines/scheduling/Task;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "submissionTime", "", "taskContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "(Ljava/lang/Runnable;JLkotlinx/coroutines/scheduling/TaskContext;)V", "run", "", "toString", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.scheduling.j */
public final class TaskImpl extends Task {

    /* renamed from: a */
    public final Runnable f173914a;

    public void run() {
        try {
            this.f173914a.run();
        } finally {
            this.f173913g.mo243100b();
        }
    }

    public String toString() {
        return "Task[" + al.m266275b(this.f173914a) + '@' + al.m266273a(this.f173914a) + ", " + this.f173912f + ", " + this.f173913g + ']';
    }

    public TaskImpl(Runnable runnable, long j, TaskContext iVar) {
        super(j, iVar);
        this.f173914a = runnable;
    }
}
