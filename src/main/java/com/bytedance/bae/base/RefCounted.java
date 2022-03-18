package com.bytedance.bae.base;

public interface RefCounted {
    void release();

    void retain();
}
