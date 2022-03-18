package com.ss.android.lark.image.api;

public enum DataSource {
    LOCAL,
    REMOTE,
    DATA_DISK_CACHE,
    RESOURCE_DISK_CACHE,
    MEMORY_CACHE;

    public static DataSource fromOrdinal(int i) {
        DataSource[] values = values();
        for (DataSource dataSource : values) {
            if (dataSource.ordinal() == i) {
                return dataSource;
            }
        }
        return LOCAL;
    }
}
