package com.bytedance.pipeline.exception;

import java.util.List;

public class SerialException extends ParallelException {
    public SerialException(List<Throwable> list) {
        super(list);
    }
}
