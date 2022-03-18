package bolts;

import bolts.Task;

/* access modifiers changed from: package-private */
/* renamed from: bolts.h */
public class C1671h {

    /* renamed from: a */
    private Task<?> f5695a;

    /* renamed from: a */
    public void mo8503a() {
        this.f5695a = null;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        Task.AbstractC1659b unobservedExceptionHandler;
        try {
            Task<?> task = this.f5695a;
            if (!(task == null || (unobservedExceptionHandler = Task.getUnobservedExceptionHandler()) == null)) {
                unobservedExceptionHandler.mo8481a(task, new UnobservedTaskException(task.getError()));
            }
        } finally {
            super.finalize();
        }
    }

    public C1671h(Task<?> task) {
        this.f5695a = task;
    }
}
