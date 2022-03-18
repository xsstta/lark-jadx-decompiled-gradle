package bolts;

/* renamed from: bolts.g */
public class C1670g<TResult> {

    /* renamed from: a */
    private final Task<TResult> f5694a = new Task<>();

    /* renamed from: a */
    public Task<TResult> mo8496a() {
        return this.f5694a;
    }

    /* renamed from: b */
    public boolean mo8501b() {
        return this.f5694a.trySetCancelled();
    }

    /* renamed from: c */
    public void mo8502c() {
        if (!mo8501b()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    /* renamed from: a */
    public boolean mo8497a(Exception exc) {
        return this.f5694a.trySetError(exc);
    }

    /* renamed from: a */
    public boolean mo8498a(TResult tresult) {
        return this.f5694a.trySetResult(tresult);
    }

    /* renamed from: b */
    public void mo8499b(Exception exc) {
        if (!mo8497a(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    /* renamed from: b */
    public void mo8500b(TResult tresult) {
        if (!mo8498a((Object) tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }
}
