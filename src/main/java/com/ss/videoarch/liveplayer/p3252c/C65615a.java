package com.ss.videoarch.liveplayer.p3252c;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.ss.videoarch.liveplayer.AbstractC65627d;
import com.ss.videoarch.liveplayer.log.C65658c;
import com.ss.videoarch.liveplayer.log.LiveError;
import com.ss.videoarch.liveplayer.p3252c.C65621b;
import com.ss.videoarch.liveplayer.p3252c.C65625e;
import com.tt.frontendapiinterface.ApiHandler;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.liveplayer.c.a */
public final class C65615a {

    /* renamed from: b */
    public static volatile long f165160b;

    /* renamed from: a */
    public volatile String f165161a;

    /* renamed from: c */
    private final ExecutorService f165162c;

    /* renamed from: d */
    private final AbstractC65627d f165163d;

    /* renamed from: e */
    private Context f165164e;

    /* renamed from: f */
    private Future f165165f;

    /* renamed from: g */
    private volatile boolean f165166g;

    /* renamed from: h */
    private String f165167h;

    /* renamed from: i */
    private volatile AbstractC65619a f165168i;

    /* renamed from: j */
    private int f165169j = 600000;

    /* renamed from: com.ss.videoarch.liveplayer.c.a$a */
    public interface AbstractC65619a {
        /* renamed from: a */
        void mo229632a(String str, String str2, LiveError liveError, boolean z);
    }

    /* renamed from: c */
    public String mo229627c() {
        mo229625b();
        return this.f165161a;
    }

    /* renamed from: a */
    public void mo229620a() {
        this.f165168i = null;
        Future future = this.f165165f;
        if (future != null && !future.isDone()) {
            this.f165165f.cancel(true);
            this.f165165f = null;
        }
    }

    /* renamed from: b */
    public void mo229625b() {
        if (SystemClock.elapsedRealtime() - f165160b >= 300000) {
            this.f165162c.submit(new Runnable() {
                /* class com.ss.videoarch.liveplayer.p3252c.C65615a.RunnableC656183 */

                public void run() {
                    try {
                        InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                        if (byName != null) {
                            C65615a.this.f165161a = byName.getHostAddress();
                            C65615a.f165160b = SystemClock.elapsedRealtime();
                            C65658c.m257425a("DnsHelper", "update dns server ip:" + C65615a.this.f165161a);
                        }
                    } catch (UnknownHostException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public static String m257228c(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        C65620b f = m257231f(str);
        return str.substring(f.f165176a, f.f165177b);
    }

    /* renamed from: e */
    private String m257230e(String str) {
        return String.format("https://%s/q?host=%s", this.f165167h, str);
    }

    /* renamed from: d */
    public static boolean m257229d(String str) {
        if (str == null || str.length() < 7 || str.length() > 15 || "".equals(str)) {
            return false;
        }
        return Pattern.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str).find();
    }

    /* renamed from: a */
    public void mo229621a(final String str) {
        C65625e.m257254a(this.f165163d, m257230e(str), this.f165167h, new C65625e.AbstractC65626a() {
            /* class com.ss.videoarch.liveplayer.p3252c.C65615a.C656172 */

            @Override // com.ss.videoarch.liveplayer.p3252c.C65625e.AbstractC65626a
            /* renamed from: a */
            public void mo229629a(LiveError liveError) {
                C65615a.this.mo229624a(true, str, null, liveError, true);
            }

            @Override // com.ss.videoarch.liveplayer.p3252c.C65625e.AbstractC65626a
            /* renamed from: a */
            public void mo229630a(JSONObject jSONObject) {
                JSONArray optJSONArray = jSONObject.optJSONArray("ips");
                if (optJSONArray == null || optJSONArray.length() == 0) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("host", str);
                    C65615a.this.mo229624a(true, str, null, new LiveError(-100011, "http dns response ip empty", hashMap), true);
                    return;
                }
                String str = null;
                try {
                    str = optJSONArray.getString(0);
                } catch (Exception e) {
                    Log.d("DnsHelper", e.toString());
                }
                C65615a.this.mo229624a(true, str, str, null, true);
            }
        });
    }

    /* renamed from: f */
    private static C65620b m257231f(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int indexOf = str.indexOf("://") + 3;
        int length = str.length();
        int i = indexOf;
        int i2 = -1;
        while (indexOf < length) {
            char charAt = str.charAt(indexOf);
            if (charAt == '#' || charAt == '/') {
                break;
            }
            if (charAt != ':') {
                if (charAt == '?') {
                    break;
                } else if (charAt == '@') {
                    i = indexOf + 1;
                }
            } else {
                i2 = indexOf;
            }
            indexOf++;
        }
        if (i2 == -1) {
            i2 = indexOf;
        }
        return new C65620b(i, i2, indexOf);
    }

    /* renamed from: b */
    public void mo229626b(String str) {
        try {
            InetAddress byName = InetAddress.getByName(str);
            if (byName == null) {
                mo229624a(false, str, null, new LiveError(-100010, "", null), true);
                return;
            }
            String hostAddress = byName.getHostAddress();
            if (byName instanceof Inet6Address) {
                hostAddress = String.format("[%s]", hostAddress);
            }
            mo229624a(false, str, hostAddress, null, true);
        } catch (UnknownHostException e) {
            HashMap hashMap = new HashMap();
            hashMap.put("reason", "Unknown host name");
            hashMap.put("host", str);
            hashMap.put(ApiHandler.API_CALLBACK_EXCEPTION, e.toString());
            mo229624a(false, str, null, new LiveError(-100010, "Unknown Host", hashMap), true);
        }
    }

    /* renamed from: a */
    public static String m257227a(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return null;
        }
        C65620b f = m257231f(str);
        boolean startsWith = str.startsWith("http");
        String str3 = str.substring(0, f.f165176a) + str2;
        int i = f.f165177b;
        if (f.f165178c != -1) {
            str3 = str3 + str.substring(f.f165177b, f.f165178c);
            i = f.f165178c;
        }
        if (!startsWith) {
            str3 = str3 + "/" + m257228c(str);
        }
        return str3 + str.substring(i);
    }

    /* renamed from: a */
    public void mo229622a(final String str, AbstractC65619a aVar) {
        int i;
        String str2;
        if (!TextUtils.isEmpty(str) && aVar != null) {
            if (this.f165162c != null) {
                final boolean z = this.f165166g;
                mo229620a();
                this.f165168i = aVar;
                boolean z2 = false;
                NetworkInfo a = C65624d.m257253a(this.f165164e);
                if (a == null || !a.isAvailable()) {
                    str2 = null;
                    i = -1;
                } else {
                    i = a.getType();
                    str2 = a.getExtraInfo();
                }
                int c = C65621b.m257243a().mo229638c();
                boolean z3 = true;
                if (i == -1) {
                    Log.d("DnsHelper", "start: NetWork may have some problems");
                } else if (i == c) {
                    String d = C65621b.m257243a().mo229640d();
                    if (str2 == null ? d != null : !(d != null && str2.equals(d))) {
                        z2 = true;
                    }
                    z3 = z2;
                }
                if (z3) {
                    C65621b.m257243a().mo229636b();
                    C65621b.m257243a().mo229639c(str2);
                    C65621b.m257243a().mo229634a(i);
                }
                C65621b.C65622a a2 = C65621b.m257243a().mo229633a(str);
                if (a2 != null && System.currentTimeMillis() - a2.f165184b <= ((long) this.f165169j) && !a2.f165185c) {
                    mo229624a(this.f165166g, str, a2.f165183a, null, false);
                } else if (!this.f165162c.isShutdown()) {
                    this.f165165f = this.f165162c.submit(new Runnable() {
                        /* class com.ss.videoarch.liveplayer.p3252c.C65615a.RunnableC656161 */

                        public void run() {
                            if (z) {
                                C65615a.this.mo229621a(str);
                            } else {
                                C65615a.this.mo229626b(str);
                            }
                        }
                    });
                } else {
                    mo229624a(false, str, null, null, false);
                }
            } else {
                throw new IllegalStateException("mExecutor should not be null");
            }
        }
    }

    /* renamed from: a */
    public void mo229623a(boolean z, String str) {
        boolean z2;
        if (!z || this.f165163d == null || TextUtils.isEmpty(str) || str.equals("null")) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f165166g = z2;
        this.f165167h = str;
        Log.i("DnsHelper", this.f165166g + this.f165167h);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.videoarch.liveplayer.c.a$b */
    public static final class C65620b {

        /* renamed from: a */
        int f165176a;

        /* renamed from: b */
        int f165177b;

        /* renamed from: c */
        int f165178c;

        C65620b(int i, int i2, int i3) {
            this.f165176a = i;
            this.f165177b = i2;
            this.f165178c = i3;
        }
    }

    public C65615a(Context context, ExecutorService executorService, AbstractC65627d dVar) {
        this.f165164e = context;
        this.f165162c = executorService;
        this.f165163d = dVar;
    }

    /* renamed from: a */
    public void mo229624a(boolean z, String str, String str2, LiveError liveError, boolean z2) {
        AbstractC65619a aVar;
        if (this.f165166g == z && (aVar = this.f165168i) != null) {
            if (z2 && str2 != null) {
                C65621b.C65622a aVar2 = new C65621b.C65622a();
                aVar2.f165184b = System.currentTimeMillis();
                aVar2.f165183a = str2;
                aVar2.f165185c = false;
                C65621b.m257243a().mo229635a(str, aVar2);
            }
            aVar.mo229632a(str, str2, liveError, z2);
        }
    }
}
