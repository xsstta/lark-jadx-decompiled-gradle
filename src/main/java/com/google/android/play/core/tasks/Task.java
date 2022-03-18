package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;

public abstract class Task<ResultT> {
    public abstract Task<ResultT> addOnCompleteListener(AbstractC22729a<ResultT> aVar);

    public abstract Task<ResultT> addOnCompleteListener(Executor executor, AbstractC22729a<ResultT> aVar);

    public abstract Task<ResultT> addOnFailureListener(OnFailureListener onFailureListener);

    public abstract Task<ResultT> addOnFailureListener(Executor executor, OnFailureListener onFailureListener);

    public abstract Task<ResultT> addOnSuccessListener(OnSuccessListener<? super ResultT> onSuccessListener);

    public abstract Task<ResultT> addOnSuccessListener(Executor executor, OnSuccessListener<? super ResultT> onSuccessListener);

    public abstract Exception getException();

    public abstract ResultT getResult();

    public abstract <X extends Throwable> ResultT getResult(Class<X> cls) throws Throwable;

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();
}
