package com.facebook.react.modules.network;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.GuardedResultAsyncTask;
import com.facebook.react.bridge.ReactContext;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.react.modules.network.e */
public class C21217e extends CookieHandler {

    /* renamed from: a */
    public static final boolean f51705a;

    /* renamed from: b */
    public final C21222a f51706b = new C21222a();

    /* renamed from: c */
    private final ReactContext f51707c;

    /* renamed from: d */
    private CookieManager f51708d;

    /* access modifiers changed from: private */
    /* renamed from: com.facebook.react.modules.network.e$a */
    public class C21222a {

        /* renamed from: b */
        private final Handler f51720b;

        /* renamed from: a */
        public void mo72065a() {
            if (C21217e.f51705a) {
                this.f51720b.sendEmptyMessageDelayed(1, 30000);
            }
        }

        /* renamed from: c */
        public void mo72067c() {
            CookieManager b = C21217e.this.mo72056b();
            if (b != null) {
                b.flush();
            }
        }

        /* renamed from: b */
        public void mo72066b() {
            this.f51720b.removeMessages(1);
            C21217e.this.mo72055a(new Runnable() {
                /* class com.facebook.react.modules.network.C21217e.C21222a.RunnableC212242 */

                public void run() {
                    if (C21217e.f51705a) {
                        CookieSyncManager.getInstance().sync();
                    } else {
                        C21222a.this.mo72067c();
                    }
                }
            });
        }

        public C21222a() {
            this.f51720b = new Handler(Looper.getMainLooper(), new Handler.Callback(C21217e.this) {
                /* class com.facebook.react.modules.network.C21217e.C21222a.C212231 */

                public boolean handleMessage(Message message) {
                    if (message.what != 1) {
                        return false;
                    }
                    C21222a.this.mo72066b();
                    return true;
                }
            });
        }
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT < 21) {
            z = true;
        } else {
            z = false;
        }
        f51705a = z;
    }

    /* renamed from: b */
    public CookieManager mo72056b() {
        if (this.f51708d == null) {
            m76977a(this.f51707c);
            try {
                CookieManager instance = CookieManager.getInstance();
                this.f51708d = instance;
                if (f51705a) {
                    instance.removeExpiredCookie();
                }
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Exception e) {
                String message = e.getMessage();
                if (message != null && message.contains("No WebView installed")) {
                    return null;
                }
                throw e;
            }
        }
        return this.f51708d;
    }

    /* renamed from: a */
    public void mo72053a() {
        if (f51705a) {
            CookieManager b = mo72056b();
            if (b != null) {
                b.removeExpiredCookie();
            }
            this.f51706b.mo72066b();
        }
    }

    public C21217e(ReactContext reactContext) {
        this.f51707c = reactContext;
    }

    /* renamed from: a */
    private static void m76977a(Context context) {
        if (f51705a) {
            CookieSyncManager.createInstance(context).sync();
        }
    }

    /* renamed from: b */
    private void m76981b(final Callback callback) {
        CookieManager b = mo72056b();
        if (b != null) {
            b.removeAllCookies(new ValueCallback<Boolean>() {
                /* class com.facebook.react.modules.network.C21217e.C212192 */

                /* renamed from: a */
                public void onReceiveValue(Boolean bool) {
                    C21217e.this.f51706b.mo72065a();
                    callback.invoke(bool);
                }
            });
        }
    }

    /* renamed from: a */
    private static boolean m76980a(String str) {
        if (str.equalsIgnoreCase("Set-cookie") || str.equalsIgnoreCase("Set-cookie2")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo72054a(final Callback callback) {
        if (f51705a) {
            new GuardedResultAsyncTask<Boolean>(this.f51707c) {
                /* class com.facebook.react.modules.network.C21217e.AsyncTaskC212181 */

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public Boolean doInBackgroundGuarded() {
                    CookieManager b = C21217e.this.mo72056b();
                    if (b != null) {
                        b.removeAllCookie();
                    }
                    C21217e.this.f51706b.mo72065a();
                    return true;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void onPostExecuteGuarded(Boolean bool) {
                    callback.invoke(bool);
                }
            }.execute(new Void[0]);
        } else {
            m76981b(callback);
        }
    }

    /* renamed from: a */
    public void mo72055a(final Runnable runnable) {
        new GuardedAsyncTask<Void, Void>(this.f51707c) {
            /* class com.facebook.react.modules.network.C21217e.AsyncTaskC212214 */

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void doInBackgroundGuarded(Void... voidArr) {
                runnable.run();
            }
        }.execute(new Void[0]);
    }

    /* renamed from: a */
    private void m76978a(String str, String str2) {
        CookieManager b = mo72056b();
        if (b != null) {
            b.setCookie(str, str2, null);
        }
    }

    /* renamed from: a */
    private void m76979a(final String str, final List<String> list) {
        final CookieManager b = mo72056b();
        if (b != null) {
            if (f51705a) {
                mo72055a(new Runnable() {
                    /* class com.facebook.react.modules.network.C21217e.RunnableC212203 */

                    public void run() {
                        for (String str : list) {
                            b.setCookie(str, str);
                        }
                        C21217e.this.f51706b.mo72065a();
                    }
                });
                return;
            }
            for (String str2 : list) {
                m76978a(str, str2);
            }
            b.flush();
            this.f51706b.mo72065a();
        }
    }

    @Override // java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) throws IOException {
        CookieManager b = mo72056b();
        if (b == null) {
            return Collections.emptyMap();
        }
        String cookie = b.getCookie(uri.toString());
        if (TextUtils.isEmpty(cookie)) {
            return Collections.emptyMap();
        }
        return Collections.singletonMap("Cookie", Collections.singletonList(cookie));
    }

    @Override // java.net.CookieHandler
    public void put(URI uri, Map<String, List<String>> map) throws IOException {
        String uri2 = uri.toString();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null && m76980a(key)) {
                m76979a(uri2, entry.getValue());
            }
        }
    }
}
