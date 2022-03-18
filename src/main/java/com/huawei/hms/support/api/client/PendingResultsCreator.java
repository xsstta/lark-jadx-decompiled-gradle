package com.huawei.hms.support.api.client;

import com.huawei.hms.common.api.OptionalPendingResult;
import com.huawei.hms.common.api.internal.OptionalPendingResultImpl;

public final class PendingResultsCreator {

    public static class DiscardedPendingResult<R extends Result> extends EmptyPendingResult {
        @Override // com.huawei.hms.support.api.client.PendingResult, com.huawei.hms.support.api.client.EmptyPendingResult
        public boolean isCanceled() {
            return true;
        }

        public DiscardedPendingResult() {
        }

        public DiscardedPendingResult(R r) {
            setResult(r);
        }
    }

    public static class InstantPendingResult<R extends Result> extends EmptyPendingResult {
        @Override // com.huawei.hms.support.api.client.PendingResult, com.huawei.hms.support.api.client.EmptyPendingResult
        public void cancel() {
            throw new IllegalStateException("cancel() is not available.");
        }

        public InstantPendingResult(R r) {
            setResult(r);
        }

        @Override // com.huawei.hms.support.api.client.PendingResult, com.huawei.hms.support.api.client.EmptyPendingResult
        public void setResultCallback(ResultCallback resultCallback) {
            resultCallback.onResult(getResult());
        }
    }

    public static PendingResult<Status> discardedPendingResult() {
        return new DiscardedPendingResult();
    }

    public static PendingResult<Status> instantPendingResult(Status status) {
        return new InstantPendingResult(status);
    }

    public static <R extends Result> PendingResult<R> discardedPendingResult(R r) {
        return new DiscardedPendingResult(r);
    }

    public static <R extends Result> OptionalPendingResult<R> instantPendingResult(R r) {
        return new OptionalPendingResultImpl(new InstantPendingResult(r));
    }
}
