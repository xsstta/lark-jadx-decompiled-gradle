package com.ss.android.lark.optrace.core;

import com.ss.android.lark.optrace.api.TracingSpanData;
import com.ss.android.lark.optrace.p2413c.C48933a;

public class TracingSpanMemData implements TracingSpanData {
    private final String span = C48933a.m192780b();

    @Override // com.ss.android.lark.optrace.api.TracingSpanData
    public String getSpan() {
        return this.span;
    }

    public String toString() {
        return "TracingSpanMemData{span='" + this.span + '\'' + '}';
    }
}
