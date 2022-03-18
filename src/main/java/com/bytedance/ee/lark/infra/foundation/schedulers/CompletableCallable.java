package com.bytedance.ee.lark.infra.foundation.schedulers;

import java.util.concurrent.Callable;

public class CompletableCallable<V> implements Callable<V> {
    private Function<V> innerFunction;

    @Override // java.util.concurrent.Callable
    public V call() throws Exception {
        return this.innerFunction.fun();
    }

    public CompletableCallable(Function function) {
        this.innerFunction = function;
    }

    public CompletableCallable(final Action action) {
        this.innerFunction = new Function<V>() {
            /* class com.bytedance.ee.lark.infra.foundation.schedulers.CompletableCallable.C127731 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Function
            public V fun() {
                action.act();
                return null;
            }
        };
    }
}
