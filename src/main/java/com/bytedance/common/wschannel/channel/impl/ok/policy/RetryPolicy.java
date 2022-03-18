package com.bytedance.common.wschannel.channel.impl.ok.policy;

import okhttp3.Response;

public interface RetryPolicy {
    long getRandomInterval();

    long getRetryIntervalWithResponse(Response response);

    void reset();
}
