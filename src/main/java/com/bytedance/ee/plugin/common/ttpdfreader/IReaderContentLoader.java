package com.bytedance.ee.plugin.common.ttpdfreader;

public interface IReaderContentLoader {
    long getTotalSize();

    int load(int i, byte[] bArr, int i2);
}
