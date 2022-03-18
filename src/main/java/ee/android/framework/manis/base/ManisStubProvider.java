package ee.android.framework.manis.base;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import ee.android.framework.manis.C68183b;
import ee.android.framework.manis.p3450a.C68181b;
import ee.android.framework.manis.p3450a.C68182c;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ManisStubProvider extends ContentProvider {
    private final long WAIT_TIMEOUT_MILL = 4000;
    protected Map<String, IBinder> mBinderMaps = new HashMap();
    private AtomicInteger mBinderThreadCount = new AtomicInteger(0);
    private volatile ClassLoader mClassLoader;
    private volatile long mStart = 0;

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public boolean onCreate() {
        this.mStart = System.currentTimeMillis();
        return true;
    }

    private void reportTooBlockingBinderThread(int i) {
        RuntimeException runtimeException = new RuntimeException("BlockingQuery");
        runtimeException.fillInStackTrace();
        if (i > 3) {
            Log.m165385e("ManisManager", "query thread waiting count:" + i, runtimeException, true);
        }
    }

    public IBinder getBinderByClass(Uri uri, String str) {
        IBinder iBinder = this.mBinderMaps.get(str);
        if (iBinder != null) {
            return iBinder;
        }
        if (this.mClassLoader == null) {
            this.mClassLoader = getContext().getClassLoader();
        }
        Log.m165389i("ManisManager", "getBinderByClass  className:" + str + ", classLoader:" + this.mClassLoader.toString());
        synchronized (this) {
            IBinder iBinder2 = this.mBinderMaps.get(str);
            if (iBinder2 != null) {
                return iBinder2;
            }
            try {
                IBinder iBinder3 = (IBinder) this.mClassLoader.loadClass(str).getConstructor(Context.class).newInstance(getContext().getApplicationContext());
                if (iBinder3 != null) {
                    this.mBinderMaps.put(str, iBinder3);
                    return iBinder3;
                }
                Log.m165383e("ManisManager", "ERROR: create binder <" + str + "> failed for uri:" + uri.toString());
                Log.m165383e("ManisManager", "ERROR: getBinderByClass failed for uri:" + uri.toString());
                return null;
            } catch (IllegalAccessException e) {
                Log.m165385e("ManisManager", "ERROR: create binder <" + str + "> class illegalAccessException! for uri:" + uri.toString(), e, true);
            } catch (InstantiationException e2) {
                Log.m165385e("ManisManager", "ERROR: create binder <" + str + "> class instantiation failed! for uri:" + uri.toString(), e2, true);
            } catch (ClassNotFoundException e3) {
                Log.m165385e("ManisManager", "ERROR: create binder <" + str + "> class not found! for uri:" + uri.toString(), e3, true);
            } catch (NoSuchMethodException e4) {
                Log.m165385e("ManisManager", "ERROR: create binder <" + str + "> NoSuchMethodException! has no constructor! for uri:" + uri.toString(), e4, true);
            } catch (InvocationTargetException e5) {
                Log.m165385e("ManisManager", "ERROR: create binder <" + str + "> InvocationTargetException! invoke constructor exception! for uri:" + uri.toString(), e5, true);
            }
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (uri == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.mStart;
        Log.m165379d("ManisManager", "query called. start: " + this.mStart + " diff:" + currentTimeMillis + ", current thread:" + Thread.currentThread().getName());
        Log.m165389i("ManisManager", "query service" + getClass().getName() + " uri: " + uri.toString() + " in process:" + C68182c.m264836c(getContext()));
        String queryParameter = uri.getQueryParameter("class");
        if (TextUtils.isEmpty(queryParameter)) {
            Log.m165383e("ManisManager", "query service service name is empty, uri:" + uri.toString());
            return null;
        }
        IBinder binderByClass = getBinderByClass(uri, queryParameter + "Stub");
        if (binderByClass == null) {
            Log.m165383e("ManisManager", "query service getBinderByClass is empty, serviceName:" + queryParameter);
            return null;
        }
        if (!C68183b.m264839a().mo237089d() && currentTimeMillis < 4000) {
            Log.m165389i("ManisManager", "query called, wait.");
            Object c = C68183b.m264839a().mo237088c();
            synchronized (c) {
                try {
                    reportTooBlockingBinderThread(this.mBinderThreadCount.getAndIncrement());
                    long j = 4000 - currentTimeMillis;
                    c.wait(j);
                    Log.m165389i("ManisManager", "query service called. wait:" + j);
                    this.mBinderThreadCount.getAndDecrement();
                } catch (InterruptedException e) {
                    Log.m165383e("ManisManager", "failed to wait, e:" + e);
                    this.mBinderThreadCount.getAndDecrement();
                } catch (Throwable th) {
                    this.mBinderThreadCount.getAndDecrement();
                    this.mStart = 0;
                    throw th;
                }
                this.mStart = 0;
            }
        }
        return C68181b.m264832a(binderByClass);
    }
}
