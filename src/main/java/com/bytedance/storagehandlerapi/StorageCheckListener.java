package com.bytedance.storagehandlerapi;

public interface StorageCheckListener {

    public enum Operate {
        OPEN,
        NATIVE_OPEN,
        MKDIR,
        NATIVE_MKDIR,
        DELETE,
        NATIVE_DELETE,
        RENAME,
        LINK,
        MKFIFO
    }
}
