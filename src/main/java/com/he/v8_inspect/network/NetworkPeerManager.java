package com.he.v8_inspect.network;

import android.content.Context;
import com.he.v8_inspect.helper.ChromePeerManager;
import com.he.v8_inspect.helper.PeersRegisteredListener;
import com.he.v8_inspect.utils.Util;
import javax.annotation.Nullable;

public class NetworkPeerManager extends ChromePeerManager {
    private static NetworkPeerManager sInstance;
    public AsyncPrettyPrinterRegistry mAsyncPrettyPrinterRegistry;
    public AsyncPrettyPrinterInitializer mPrettyPrinterInitializer;
    public final ResponseBodyFileManager mResponseBodyFileManager;
    private final PeersRegisteredListener mTempFileCleanup;

    @Nullable
    public AsyncPrettyPrinterRegistry getAsyncPrettyPrinterRegistry() {
        return this.mAsyncPrettyPrinterRegistry;
    }

    public ResponseBodyFileManager getResponseBodyFileManager() {
        return this.mResponseBodyFileManager;
    }

    @Nullable
    public static synchronized NetworkPeerManager getInstanceOrNull() {
        NetworkPeerManager networkPeerManager;
        synchronized (NetworkPeerManager.class) {
            networkPeerManager = sInstance;
        }
        return networkPeerManager;
    }

    public NetworkPeerManager(ResponseBodyFileManager responseBodyFileManager) {
        C233881 r0 = new PeersRegisteredListener() {
            /* class com.he.v8_inspect.network.NetworkPeerManager.C233881 */

            /* access modifiers changed from: protected */
            @Override // com.he.v8_inspect.helper.PeersRegisteredListener
            public void onLastPeerUnregistered() {
                NetworkPeerManager.this.mResponseBodyFileManager.cleanupFiles();
                AsyncPrettyPrinterExecutorHolder.shutdown();
            }

            /* access modifiers changed from: protected */
            @Override // com.he.v8_inspect.helper.PeersRegisteredListener
            public void onFirstPeerRegistered() {
                AsyncPrettyPrinterExecutorHolder.ensureInitialized();
                if (NetworkPeerManager.this.mAsyncPrettyPrinterRegistry == null && NetworkPeerManager.this.mPrettyPrinterInitializer != null) {
                    NetworkPeerManager.this.mAsyncPrettyPrinterRegistry = new AsyncPrettyPrinterRegistry();
                    NetworkPeerManager.this.mPrettyPrinterInitializer.populatePrettyPrinters(NetworkPeerManager.this.mAsyncPrettyPrinterRegistry);
                }
                NetworkPeerManager.this.mResponseBodyFileManager.cleanupFiles();
            }
        };
        this.mTempFileCleanup = r0;
        this.mResponseBodyFileManager = responseBodyFileManager;
        setListener(r0);
    }

    public void setPrettyPrinterInitializer(AsyncPrettyPrinterInitializer asyncPrettyPrinterInitializer) {
        Util.throwIfNotNull(this.mPrettyPrinterInitializer);
        this.mPrettyPrinterInitializer = (AsyncPrettyPrinterInitializer) Util.throwIfNull(asyncPrettyPrinterInitializer);
    }

    public static synchronized NetworkPeerManager getOrCreateInstance(Context context) {
        NetworkPeerManager networkPeerManager;
        synchronized (NetworkPeerManager.class) {
            if (sInstance == null) {
                sInstance = new NetworkPeerManager(new ResponseBodyFileManager(context.getApplicationContext()));
            }
            networkPeerManager = sInstance;
        }
        return networkPeerManager;
    }
}
