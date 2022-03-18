package com.bytedance.common.wschannel.channel.impl.ok.policy;

import android.content.Context;

public class RetryTimesPolicy extends RetryIntervalPolicy {
    private int mCurrRetryTime;
    private final int mMaxRetryTime;

    @Override // com.bytedance.common.wschannel.channel.impl.ok.policy.RetryPolicy, com.bytedance.common.wschannel.channel.impl.ok.policy.RetryIntervalPolicy
    public void reset() {
        super.reset();
        this.mCurrRetryTime = 0;
    }

    @Override // com.bytedance.common.wschannel.channel.impl.ok.policy.RetryIntervalPolicy
    public long getNextRetryInterval() {
        long j;
        if (this.mCurrRetryTime < this.mMaxRetryTime) {
            j = super.getNextRetryInterval();
        } else {
            j = -1;
        }
        if (j != -1) {
            this.mCurrRetryTime++;
        }
        return j;
    }

    public String toString() {
        return "RetryTimesPolicy{mMaxRetryTime=" + this.mMaxRetryTime + ", mCurrRetryTime=" + this.mCurrRetryTime + '}';
    }

    public RetryTimesPolicy(Context context) {
        this(context, 4);
    }

    RetryTimesPolicy(Context context, int i) {
        super(context);
        this.mMaxRetryTime = i < 0 ? 4 : i;
    }
}
