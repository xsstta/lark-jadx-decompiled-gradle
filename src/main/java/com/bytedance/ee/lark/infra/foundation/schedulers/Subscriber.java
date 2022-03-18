package com.bytedance.ee.lark.infra.foundation.schedulers;

public interface Subscriber<T> {

    public static class NoConcernSubscriber<T> implements Subscriber<T> {
        @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
        public void onError(Throwable th) {
        }

        @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
        public void onSuccess() {
        }

        @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
        public void onSuccess(T t) {
        }
    }

    public static abstract class ResultLessSubscriber<T> implements Subscriber<T> {
        @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
        public void onSuccess(T t) {
        }
    }

    public static abstract class ResultableSubscriber<T> implements Subscriber<T> {
        @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
        public void onSuccess() {
        }
    }

    void onError(Throwable th);

    void onSuccess();

    void onSuccess(T t);
}
