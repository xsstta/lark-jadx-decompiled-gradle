package com.larksuite.framework.callback;

public interface IRequestCallback<S, E> extends ICallback {
    void onError(E e);

    void onSuccess(S s);
}
