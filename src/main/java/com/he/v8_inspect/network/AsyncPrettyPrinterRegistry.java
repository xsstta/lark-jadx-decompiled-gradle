package com.he.v8_inspect.network;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class AsyncPrettyPrinterRegistry {
    private final Map<String, AsyncPrettyPrinterFactory> mRegistry = new HashMap();

    @Nullable
    public synchronized AsyncPrettyPrinterFactory lookup(String str) {
        return this.mRegistry.get(str);
    }

    public synchronized boolean unregister(String str) {
        boolean z;
        if (this.mRegistry.remove(str) != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized void register(String str, AsyncPrettyPrinterFactory asyncPrettyPrinterFactory) {
        this.mRegistry.put(str, asyncPrettyPrinterFactory);
    }
}
