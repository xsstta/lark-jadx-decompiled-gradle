package com.google.android.gms.tasks;

import android.app.Activity;
import java.util.concurrent.Executor;

public abstract class Task<TResult> {
    public abstract Task<TResult> addOnFailureListener(Activity activity, AbstractC22092d dVar);

    public abstract Task<TResult> addOnFailureListener(AbstractC22092d dVar);

    public abstract Task<TResult> addOnFailureListener(Executor executor, AbstractC22092d dVar);

    public abstract Task<TResult> addOnSuccessListener(Activity activity, AbstractC22093e<? super TResult> eVar);

    public abstract Task<TResult> addOnSuccessListener(AbstractC22093e<? super TResult> eVar);

    public abstract Task<TResult> addOnSuccessListener(Executor executor, AbstractC22093e<? super TResult> eVar);

    public abstract Exception getException();

    public abstract TResult getResult();

    public abstract <X extends Throwable> TResult getResult(Class<X> cls) throws Throwable;

    public abstract boolean isCanceled();

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();

    public Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public Task<TResult> addOnCompleteListener(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public Task<TResult> addOnCompleteListener(Activity activity, OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public Task<TResult> addOnCanceledListener(AbstractC22091c cVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public Task<TResult> addOnCanceledListener(Executor executor, AbstractC22091c cVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public Task<TResult> addOnCanceledListener(Activity activity, AbstractC22091c cVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(Executor executor, Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
