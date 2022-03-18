package com.facebook.react.modules.storage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

@ReactModule(name = "AsyncSQLiteDBStorage")
public final class AsyncStorageModule extends ReactContextBaseJavaModule {
    private final ExecutorC21248a executor;
    public C21252c mReactDatabaseSupplier;
    private boolean mShuttingDown;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AsyncSQLiteDBStorage";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
    }

    public void clearSensitiveData() {
        this.mReactDatabaseSupplier.mo72106c();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    public boolean ensureDatabase() {
        if (this.mShuttingDown || !this.mReactDatabaseSupplier.mo72104a()) {
            return false;
        }
        return true;
    }

    /* renamed from: com.facebook.react.modules.storage.AsyncStorageModule$a */
    private class ExecutorC21248a implements Executor {

        /* renamed from: b */
        private final ArrayDeque<Runnable> f51764b = new ArrayDeque<>();

        /* renamed from: c */
        private Runnable f51765c;

        /* renamed from: d */
        private final Executor f51766d;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo72101a() {
            Runnable poll = this.f51764b.poll();
            this.f51765c = poll;
            if (poll != null) {
                this.f51766d.execute(poll);
            }
        }

        public synchronized void execute(final Runnable runnable) {
            this.f51764b.offer(new Runnable() {
                /* class com.facebook.react.modules.storage.AsyncStorageModule.ExecutorC21248a.RunnableC212491 */

                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        ExecutorC21248a.this.mo72101a();
                    }
                }
            });
            if (this.f51765c == null) {
                mo72101a();
            }
        }

        ExecutorC21248a(Executor executor) {
            this.f51766d = executor;
        }
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @ReactMethod
    public void clear(final Callback callback) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* class com.facebook.react.modules.storage.AsyncStorageModule.AsyncTaskC212465 */

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void doInBackgroundGuarded(Void... voidArr) {
                if (!AsyncStorageModule.this.mReactDatabaseSupplier.mo72104a()) {
                    callback.invoke(C21251b.m77042c(null));
                    return;
                }
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo72107d();
                    callback.invoke(new Object[0]);
                } catch (Exception e) {
                    FLog.m76615w("ReactNative", e.getMessage(), e);
                    callback.invoke(C21251b.m77040a(null, e.getMessage()));
                }
            }
        }.executeOnExecutor(this.executor, new Void[0]);
    }

    @ReactMethod
    public void getAllKeys(final Callback callback) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* class com.facebook.react.modules.storage.AsyncStorageModule.AsyncTaskC212476 */

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void doInBackgroundGuarded(Void... voidArr) {
                if (!AsyncStorageModule.this.ensureDatabase()) {
                    callback.invoke(C21251b.m77042c(null), null);
                    return;
                }
                WritableArray createArray = Arguments.createArray();
                Cursor query = AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().query("catalystLocalStorage", new String[]{"key"}, null, null, null, null, null);
                try {
                    if (query.moveToFirst()) {
                        do {
                            createArray.pushString(query.getString(0));
                        } while (query.moveToNext());
                    }
                    query.close();
                    callback.invoke(null, createArray);
                } catch (Exception e) {
                    FLog.m76615w("ReactNative", e.getMessage(), e);
                    callback.invoke(C21251b.m77040a(null, e.getMessage()), null);
                    query.close();
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
        }.executeOnExecutor(this.executor, new Void[0]);
    }

    AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor2) {
        super(reactApplicationContext);
        this.executor = new ExecutorC21248a(executor2);
        this.mReactDatabaseSupplier = C21252c.m77043a(reactApplicationContext);
    }

    @ReactMethod
    public void multiMerge(final ReadableArray readableArray, final Callback callback) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* class com.facebook.react.modules.storage.AsyncStorageModule.AsyncTaskC212454 */

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void doInBackgroundGuarded(Void... voidArr) {
                WritableMap writableMap = null;
                if (!AsyncStorageModule.this.ensureDatabase()) {
                    callback.invoke(C21251b.m77042c(null));
                    return;
                }
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().beginTransaction();
                    for (int i = 0; i < readableArray.size(); i++) {
                        if (readableArray.getArray(i).size() != 2) {
                            WritableMap b = C21251b.m77041b(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().endTransaction();
                                return;
                            } catch (Exception e) {
                                FLog.m76615w("ReactNative", e.getMessage(), e);
                                if (b == null) {
                                    C21251b.m77040a(null, e.getMessage());
                                    return;
                                }
                                return;
                            }
                        } else if (readableArray.getArray(i).getString(0) == null) {
                            WritableMap a = C21251b.m77039a(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().endTransaction();
                                return;
                            } catch (Exception e2) {
                                FLog.m76615w("ReactNative", e2.getMessage(), e2);
                                if (a == null) {
                                    C21251b.m77040a(null, e2.getMessage());
                                    return;
                                }
                                return;
                            }
                        } else if (readableArray.getArray(i).getString(1) == null) {
                            WritableMap b2 = C21251b.m77041b(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().endTransaction();
                                return;
                            } catch (Exception e3) {
                                FLog.m76615w("ReactNative", e3.getMessage(), e3);
                                if (b2 == null) {
                                    C21251b.m77040a(null, e3.getMessage());
                                    return;
                                }
                                return;
                            }
                        } else if (!C21250a.m77038b(AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b(), readableArray.getArray(i).getString(0), readableArray.getArray(i).getString(1))) {
                            WritableMap c = C21251b.m77042c(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().endTransaction();
                                return;
                            } catch (Exception e4) {
                                FLog.m76615w("ReactNative", e4.getMessage(), e4);
                                if (c == null) {
                                    C21251b.m77040a(null, e4.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().endTransaction();
                    } catch (Exception e5) {
                        FLog.m76615w("ReactNative", e5.getMessage(), e5);
                        writableMap = C21251b.m77040a(null, e5.getMessage());
                    }
                } catch (Exception e6) {
                    FLog.m76615w("ReactNative", e6.getMessage(), e6);
                    WritableMap a2 = C21251b.m77040a(null, e6.getMessage());
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().endTransaction();
                    } catch (Exception e7) {
                        FLog.m76615w("ReactNative", e7.getMessage(), e7);
                        if (a2 == null) {
                            writableMap = C21251b.m77040a(null, e7.getMessage());
                        }
                    }
                    writableMap = a2;
                } catch (Throwable th) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().endTransaction();
                    } catch (Exception e8) {
                        FLog.m76615w("ReactNative", e8.getMessage(), e8);
                        C21251b.m77040a(null, e8.getMessage());
                    }
                    throw th;
                }
                if (writableMap != null) {
                    callback.invoke(writableMap);
                    return;
                }
                callback.invoke(new Object[0]);
            }
        }.executeOnExecutor(this.executor, new Void[0]);
    }

    @ReactMethod
    public void multiGet(final ReadableArray readableArray, final Callback callback) {
        if (readableArray == null) {
            callback.invoke(C21251b.m77039a(null), null);
            return;
        }
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* class com.facebook.react.modules.storage.AsyncStorageModule.AsyncTaskC212421 */

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void doInBackgroundGuarded(Void... voidArr) {
                if (!AsyncStorageModule.this.ensureDatabase()) {
                    callback.invoke(C21251b.m77042c(null), null);
                    return;
                }
                String[] strArr = {"key", "value"};
                HashSet hashSet = new HashSet();
                WritableArray createArray = Arguments.createArray();
                for (int i = 0; i < readableArray.size(); i += 999) {
                    int min = Math.min(readableArray.size() - i, 999);
                    Cursor query = AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().query("catalystLocalStorage", strArr, C21250a.m77033a(min), C21250a.m77037a(readableArray, i, min), null, null, null);
                    hashSet.clear();
                    try {
                        if (query.getCount() != readableArray.size()) {
                            for (int i2 = i; i2 < i + min; i2++) {
                                hashSet.add(readableArray.getString(i2));
                            }
                        }
                        if (query.moveToFirst()) {
                            do {
                                WritableArray createArray2 = Arguments.createArray();
                                createArray2.pushString(query.getString(0));
                                createArray2.pushString(query.getString(1));
                                createArray.pushArray(createArray2);
                                hashSet.remove(query.getString(0));
                            } while (query.moveToNext());
                        }
                        query.close();
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            WritableArray createArray3 = Arguments.createArray();
                            createArray3.pushString((String) it.next());
                            createArray3.pushNull();
                            createArray.pushArray(createArray3);
                        }
                        hashSet.clear();
                    } catch (Exception e) {
                        FLog.m76615w("ReactNative", e.getMessage(), e);
                        callback.invoke(C21251b.m77040a(null, e.getMessage()), null);
                        query.close();
                        return;
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                callback.invoke(null, createArray);
            }
        }.executeOnExecutor(this.executor, new Void[0]);
    }

    @ReactMethod
    public void multiRemove(final ReadableArray readableArray, final Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(C21251b.m77039a(null));
            return;
        }
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* class com.facebook.react.modules.storage.AsyncStorageModule.AsyncTaskC212443 */

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void doInBackgroundGuarded(Void... voidArr) {
                WritableMap writableMap = null;
                if (!AsyncStorageModule.this.ensureDatabase()) {
                    callback.invoke(C21251b.m77042c(null));
                    return;
                }
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().beginTransaction();
                    for (int i = 0; i < readableArray.size(); i += 999) {
                        int min = Math.min(readableArray.size() - i, 999);
                        AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().delete("catalystLocalStorage", C21250a.m77033a(min), C21250a.m77037a(readableArray, i, min));
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().endTransaction();
                    } catch (Exception e) {
                        FLog.m76615w("ReactNative", e.getMessage(), e);
                        writableMap = C21251b.m77040a(null, e.getMessage());
                    }
                } catch (Exception e2) {
                    FLog.m76615w("ReactNative", e2.getMessage(), e2);
                    WritableMap a = C21251b.m77040a(null, e2.getMessage());
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().endTransaction();
                    } catch (Exception e3) {
                        FLog.m76615w("ReactNative", e3.getMessage(), e3);
                        if (a == null) {
                            writableMap = C21251b.m77040a(null, e3.getMessage());
                        }
                    }
                    writableMap = a;
                } catch (Throwable th) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().endTransaction();
                    } catch (Exception e4) {
                        FLog.m76615w("ReactNative", e4.getMessage(), e4);
                        C21251b.m77040a(null, e4.getMessage());
                    }
                    throw th;
                }
                if (writableMap != null) {
                    callback.invoke(writableMap);
                    return;
                }
                callback.invoke(new Object[0]);
            }
        }.executeOnExecutor(this.executor, new Void[0]);
    }

    @ReactMethod
    public void multiSet(final ReadableArray readableArray, final Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(C21251b.m77039a(null));
            return;
        }
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* class com.facebook.react.modules.storage.AsyncStorageModule.AsyncTaskC212432 */

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void doInBackgroundGuarded(Void... voidArr) {
                WritableMap writableMap = null;
                if (!AsyncStorageModule.this.ensureDatabase()) {
                    callback.invoke(C21251b.m77042c(null));
                    return;
                }
                SQLiteStatement compileStatement = AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().beginTransaction();
                    for (int i = 0; i < readableArray.size(); i++) {
                        if (readableArray.getArray(i).size() != 2) {
                            WritableMap b = C21251b.m77041b(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().endTransaction();
                                return;
                            } catch (Exception e) {
                                FLog.m76615w("ReactNative", e.getMessage(), e);
                                if (b == null) {
                                    C21251b.m77040a(null, e.getMessage());
                                    return;
                                }
                                return;
                            }
                        } else if (readableArray.getArray(i).getString(0) == null) {
                            WritableMap a = C21251b.m77039a(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().endTransaction();
                                return;
                            } catch (Exception e2) {
                                FLog.m76615w("ReactNative", e2.getMessage(), e2);
                                if (a == null) {
                                    C21251b.m77040a(null, e2.getMessage());
                                    return;
                                }
                                return;
                            }
                        } else if (readableArray.getArray(i).getString(1) == null) {
                            WritableMap b2 = C21251b.m77041b(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().endTransaction();
                                return;
                            } catch (Exception e3) {
                                FLog.m76615w("ReactNative", e3.getMessage(), e3);
                                if (b2 == null) {
                                    C21251b.m77040a(null, e3.getMessage());
                                    return;
                                }
                                return;
                            }
                        } else {
                            compileStatement.clearBindings();
                            compileStatement.bindString(1, readableArray.getArray(i).getString(0));
                            compileStatement.bindString(2, readableArray.getArray(i).getString(1));
                            compileStatement.execute();
                        }
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().endTransaction();
                    } catch (Exception e4) {
                        FLog.m76615w("ReactNative", e4.getMessage(), e4);
                        writableMap = C21251b.m77040a(null, e4.getMessage());
                    }
                } catch (Exception e5) {
                    FLog.m76615w("ReactNative", e5.getMessage(), e5);
                    WritableMap a2 = C21251b.m77040a(null, e5.getMessage());
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().endTransaction();
                    } catch (Exception e6) {
                        FLog.m76615w("ReactNative", e6.getMessage(), e6);
                        if (a2 == null) {
                            writableMap = C21251b.m77040a(null, e6.getMessage());
                        }
                    }
                    writableMap = a2;
                } catch (Throwable th) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.mo72105b().endTransaction();
                    } catch (Exception e7) {
                        FLog.m76615w("ReactNative", e7.getMessage(), e7);
                        C21251b.m77040a(null, e7.getMessage());
                    }
                    throw th;
                }
                if (writableMap != null) {
                    callback.invoke(writableMap);
                    return;
                }
                callback.invoke(new Object[0]);
            }
        }.executeOnExecutor(this.executor, new Void[0]);
    }
}
