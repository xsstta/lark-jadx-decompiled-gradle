package com.he.v8_inspect.network;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.Nullable;

final class AsyncPrettyPrinterExecutorHolder {
    private static ExecutorService sExecutorService;

    private AsyncPrettyPrinterExecutorHolder() {
    }

    @Nullable
    public static ExecutorService getExecutorService() {
        return sExecutorService;
    }

    public static void ensureInitialized() {
        if (sExecutorService == null) {
            sExecutorService = Executors.newCachedThreadPool();
        }
    }

    public static void shutdown() {
        sExecutorService.shutdown();
        sExecutorService = null;
    }
}
