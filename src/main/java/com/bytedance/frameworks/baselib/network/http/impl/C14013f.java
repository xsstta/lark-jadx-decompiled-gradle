package com.bytedance.frameworks.baselib.network.http.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.common.utility.persistent.SharedPrefsEditorCompat;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.frameworks.baselib.network.http.impl.f */
public class C14013f implements AbstractC14008c {

    /* renamed from: a */
    private static final String f36726a = "f";

    /* renamed from: c */
    private static final Map<String, String> f36727c = new LinkedHashMap();

    /* renamed from: d */
    private static String f36728d;

    /* renamed from: b */
    private final SharedPreferences f36729b;

    /* renamed from: e */
    private final Map<URI, Set<SerializableHttpCookie>> f36730e = new LinkedHashMap();

    /* renamed from: a */
    public static void m56738a() {
        f36728d = "ttnetCookieStore";
    }

    /* renamed from: b */
    public synchronized void mo51616b() {
        Map<URI, Set<SerializableHttpCookie>> map = this.f36730e;
        if (map != null) {
            if (!map.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<URI, Set<SerializableHttpCookie>> entry : this.f36730e.entrySet()) {
                    if (entry != null) {
                        URI key = entry.getKey();
                        if (key.getScheme() != null && key.getScheme().equals("https")) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        if (entry2 != null) {
                            URI uri = (URI) entry2.getKey();
                            Set<SerializableHttpCookie> set = (Set) entry2.getValue();
                            try {
                                URI uri2 = new URI(uri.toString().replace("https:", "http:"));
                                Set<SerializableHttpCookie> set2 = this.f36730e.get(uri2);
                                if (set2 != null) {
                                    if (!set2.isEmpty()) {
                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                        for (SerializableHttpCookie serializableHttpCookie : set2) {
                                            boolean z = false;
                                            for (SerializableHttpCookie serializableHttpCookie2 : set) {
                                                if (serializableHttpCookie != null) {
                                                    if (serializableHttpCookie2 != null) {
                                                        if (serializableHttpCookie.getHttpCookie().equals(serializableHttpCookie2.getHttpCookie()) && serializableHttpCookie2.getWhenCreated().longValue() >= serializableHttpCookie.getWhenCreated().longValue()) {
                                                            linkedHashSet.add(serializableHttpCookie2);
                                                            z = true;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!z) {
                                                linkedHashSet.add(serializableHttpCookie);
                                            }
                                        }
                                        for (SerializableHttpCookie serializableHttpCookie3 : set) {
                                            if (!linkedHashSet.contains(serializableHttpCookie3)) {
                                                linkedHashSet.add(serializableHttpCookie3);
                                            }
                                        }
                                        this.f36730e.remove(uri);
                                        this.f36730e.put(uri2, linkedHashSet);
                                    }
                                }
                                this.f36730e.remove(uri);
                                this.f36730e.put(uri2, set);
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                    }
                    try {
                        Map<URI, Set<SerializableHttpCookie>> map2 = this.f36730e;
                        if (map2 != null) {
                            if (!map2.isEmpty()) {
                                SharedPreferences.Editor edit = this.f36729b.edit();
                                edit.clear();
                                for (Map.Entry<URI, Set<SerializableHttpCookie>> entry3 : this.f36730e.entrySet()) {
                                    URI key2 = entry3.getKey();
                                    for (SerializableHttpCookie serializableHttpCookie4 : entry3.getValue()) {
                                        String str = key2.toString() + "|" + serializableHttpCookie4.getHttpCookie().mo51602f();
                                        String encode = serializableHttpCookie4.encode();
                                        if (serializableHttpCookie4.getHttpCookie().mo51599e() > 0) {
                                            edit.putString(str, encode);
                                        } else {
                                            f36727c.put(str, encode);
                                        }
                                    }
                                }
                                SharedPrefsEditorCompat.apply(edit);
                            }
                        }
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.AbstractC14008c
    /* renamed from: a */
    public synchronized List<C14010e> mo51583a(URI uri) {
        return m56744b(uri);
    }

    public C14013f(Context context) {
        int i;
        String str = f36728d;
        str = str == null ? "cookieStore" : str;
        if (Build.VERSION.SDK_INT < 11) {
            i = 0;
        } else {
            i = 4;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, i);
        this.f36729b = sharedPreferences;
        m56741a(sharedPreferences.getAll(), true);
        m56741a((Map<String, ?>) f36727c, false);
    }

    /* renamed from: b */
    private List<C14010e> m56744b(URI uri) {
        ArrayList<SerializableHttpCookie> arrayList = new ArrayList();
        for (URI uri2 : this.f36730e.keySet()) {
            if (m56742a(uri2.getHost(), uri.getHost()) && m56745b(uri2.getPath(), uri.getPath())) {
                arrayList.addAll(this.f36730e.get(uri2));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (SerializableHttpCookie serializableHttpCookie : arrayList) {
            if (serializableHttpCookie.hasExpired()) {
                arrayList3.add(serializableHttpCookie);
            } else {
                arrayList2.add(serializableHttpCookie.getHttpCookie());
            }
        }
        if (!arrayList3.isEmpty()) {
            m56740a(uri, arrayList3);
        }
        return arrayList2;
    }

    /* renamed from: a */
    private boolean m56742a(String str, String str2) {
        if (!str2.equals(str)) {
            if (str2.endsWith("." + str)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static URI m56743b(URI uri, C14010e eVar) {
        String str;
        if (eVar.mo51597d() == null) {
            return uri;
        }
        String d = eVar.mo51597d();
        if (d.charAt(0) == '.') {
            d = d.substring(1);
        }
        try {
            if (eVar.mo51604g() == null) {
                str = "/";
            } else {
                str = eVar.mo51604g();
            }
            return new URI("http", d, str, null);
        } catch (URISyntaxException e) {
            Log.w(f36726a, e);
            return uri;
        }
    }

    /* renamed from: a */
    private void m56739a(URI uri, SerializableHttpCookie serializableHttpCookie) {
        String str = uri.toString() + "|" + serializableHttpCookie.getHttpCookie().mo51602f();
        String encode = serializableHttpCookie.encode();
        if (serializableHttpCookie.getHttpCookie().mo51599e() > 0) {
            SharedPreferences.Editor edit = this.f36729b.edit();
            edit.putString(str, encode);
            edit.apply();
            return;
        }
        f36727c.put(str, encode);
    }

    /* renamed from: a */
    private void m56740a(URI uri, List<SerializableHttpCookie> list) {
        SharedPreferences.Editor edit = this.f36729b.edit();
        Iterator<SerializableHttpCookie> it = list.iterator();
        while (it.hasNext()) {
            String str = uri.toString() + "|" + it.next().getHttpCookie().mo51602f();
            edit.remove(str);
            f36727c.remove(str);
        }
        edit.apply();
    }

    /* renamed from: b */
    private boolean m56745b(String str, String str2) {
        if (str2.equals(str) || ((str2.startsWith(str) && str.charAt(str.length() - 1) == '/') || (str2.startsWith(str) && str2.substring(str.length()).charAt(0) == '/'))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private synchronized void m56741a(Map<String, ?> map, boolean z) {
        if (map != null) {
            if (!map.isEmpty()) {
                try {
                    for (Map.Entry<String, ?> entry : map.entrySet()) {
                        try {
                            URI uri = new URI(entry.getKey().split("\\|", 2)[0]);
                            SerializableHttpCookie decode = SerializableHttpCookie.decode((String) entry.getValue());
                            Set<SerializableHttpCookie> set = this.f36730e.get(uri);
                            if (set == null) {
                                set = new HashSet<>();
                                this.f36730e.put(uri, set);
                            }
                            if (decode != null) {
                                set.add(decode);
                            }
                        } catch (URISyntaxException e) {
                            e.printStackTrace();
                        }
                    }
                    if (z) {
                        ThreadPlus.submitRunnable(new Runnable() {
                            /* class com.bytedance.frameworks.baselib.network.http.impl.C14013f.RunnableC140141 */

                            public void run() {
                                try {
                                    C14013f.this.mo51616b();
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.AbstractC14008c
    /* renamed from: a */
    public synchronized void mo51584a(URI uri, C14010e eVar) {
        URI b = m56743b(uri, eVar);
        Set<SerializableHttpCookie> set = this.f36730e.get(b);
        SerializableHttpCookie serializableHttpCookie = new SerializableHttpCookie(eVar);
        if (set == null) {
            set = new HashSet<>();
            this.f36730e.put(b, set);
        } else {
            set.remove(serializableHttpCookie);
        }
        set.add(serializableHttpCookie);
        m56739a(b, serializableHttpCookie);
    }
}
