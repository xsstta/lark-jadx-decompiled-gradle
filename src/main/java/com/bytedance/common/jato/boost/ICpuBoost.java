package com.bytedance.common.jato.boost;

import android.content.Context;

public interface ICpuBoost {
    void init(Context context);

    void release();

    boolean tryBoostCpu(long j);

    boolean tryBoostGpu(long j);
}
