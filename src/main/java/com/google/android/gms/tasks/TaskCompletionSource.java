package com.google.android.gms.tasks;

public class TaskCompletionSource<TResult> {
    private final C22085ab<TResult> zza = new C22085ab<>();

    public TaskCompletionSource() {
    }

    public TaskCompletionSource(AbstractC22083a aVar) {
        aVar.mo75029a(new C22115z(this));
    }

    public void setResult(TResult tresult) {
        this.zza.mo75033a((Object) tresult);
    }

    public boolean trySetResult(TResult tresult) {
        return this.zza.mo75036b((Object) tresult);
    }

    public void setException(Exception exc) {
        this.zza.mo75032a(exc);
    }

    public boolean trySetException(Exception exc) {
        return this.zza.mo75035b(exc);
    }

    public Task<TResult> getTask() {
        return this.zza;
    }
}
