package com.ss.android.lark.diskmanage.monitor;

import android.content.Context;
import com.ss.android.lark.diskmanage.monitor.settings.MonitorExceptionConfig;
import com.ss.android.lark.diskmanage.storage.StoragePathUtils;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.diskmanage.monitor.b */
public class C36823b {

    /* renamed from: a */
    MonitorExceptionConfig f94616a;

    /* renamed from: b */
    private List<String> f94617b = new ArrayList();

    /* renamed from: c */
    private List<String> f94618c = new ArrayList();

    /* renamed from: d */
    private List<String> f94619d = new ArrayList();

    /* renamed from: e */
    private Map<String, String> f94620e = new HashMap();

    /* renamed from: f */
    private Context f94621f;

    /* renamed from: com.ss.android.lark.diskmanage.monitor.b$b */
    static class C36825b<E extends Comparable> {

        /* renamed from: a */
        private PriorityQueue<E> f94624a;

        /* renamed from: b */
        private int f94625b;

        /* renamed from: b */
        public void mo135652b() {
            this.f94624a.clear();
        }

        /* renamed from: a */
        public List<E> mo135650a() {
            return new ArrayList(this.f94624a);
        }

        C36825b(int i) {
            if (i > 0) {
                this.f94625b = i;
                this.f94624a = new PriorityQueue<>(i, $$Lambda$b$b$tT52CJDWb57wl3SqN6RtUGlOb6g.INSTANCE);
                return;
            }
            throw new IllegalStateException();
        }

        /* renamed from: a */
        public void mo135651a(E e) {
            if (this.f94624a.size() < this.f94625b) {
                this.f94624a.add(e);
            } else if (e.compareTo(this.f94624a.peek()) > 0) {
                this.f94624a.poll();
                this.f94624a.add(e);
            }
        }
    }

    /* renamed from: a */
    private void m145278a() {
        if (this.f94616a == null) {
            Log.m165389i("StorageExceptionHandler", "parseConfig is null");
            return;
        }
        String str = this.f94621f.getFilesDir().getParent() + File.separator + "lib";
        this.f94617b.add(str + File.separator + "liblark.so");
        this.f94618c.add(str);
        List<String> ignoredRelativeFiles = this.f94616a.getIgnoredRelativeFiles();
        if (ignoredRelativeFiles != null) {
            for (String str2 : ignoredRelativeFiles) {
                if (str2.contains("internal")) {
                    this.f94617b.add(str2.replace("internal", C36826c.f94626b));
                } else if (str2.contains("external")) {
                    this.f94617b.add(str2.replace("external", C36826c.f94628d));
                }
            }
        }
        List<String> ignoredRelativeDirs = this.f94616a.getIgnoredRelativeDirs();
        if (ignoredRelativeDirs != null) {
            for (String str3 : ignoredRelativeDirs) {
                if (str3.contains("internal")) {
                    this.f94618c.add(str3.replace("internal", C36826c.f94626b));
                } else if (str3.contains("external")) {
                    this.f94618c.add(str3.replace("external", C36826c.f94628d));
                }
            }
        }
        Map<String, String> modules = this.f94616a.getModules();
        if (modules != null) {
            for (Map.Entry<String, String> entry : modules.entrySet()) {
                for (String str4 : entry.getValue().split(",")) {
                    this.f94620e.put(str4, entry.getKey());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo135647a(MonitorExceptionConfig monitorExceptionConfig) {
        this.f94616a = monitorExceptionConfig;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo135648a(List<String> list) {
        this.f94619d = list;
    }

    /* renamed from: com.ss.android.lark.diskmanage.monitor.b$a */
    static class C36824a implements Comparable {

        /* renamed from: a */
        public String f94622a;

        /* renamed from: b */
        public long f94623b;

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            long j = this.f94623b;
            long j2 = ((C36824a) obj).f94623b;
            if (j == j2) {
                return 0;
            }
            if (j > j2) {
                return 1;
            }
            return -1;
        }

        C36824a(String str, long j) {
            this.f94622a = str;
            this.f94623b = j;
        }
    }

    C36823b(Context context) {
        this.f94621f = context;
    }

    /* renamed from: a */
    private String m145277a(String str) {
        if (str.startsWith(C36826c.f94627c) || str.startsWith(C36826c.f94629e)) {
            return "cache";
        }
        for (Map.Entry<String, String> entry : this.f94620e.entrySet()) {
            if (str.contains(entry.getKey())) {
                return entry.getValue();
            }
        }
        if (str.contains("sdk_storage")) {
            return "rust";
        }
        return "unknown";
    }

    /* renamed from: a */
    public void mo135646a(Context context, List<C36824a> list, List<C36824a> list2) {
        boolean z;
        boolean z2;
        Log.m165389i("StorageExceptionHandler", "handle start");
        m145278a();
        HashMap hashMap = new HashMap();
        String q = StoragePathUtils.f94669a.mo135751q(context);
        String str = StoragePathUtils.f94669a.mo135728Z(context) + File.separator + "ccm/drive/offlineV2";
        if (list != null && !list.isEmpty()) {
            for (C36824a aVar : list) {
                String str2 = aVar.f94622a;
                Iterator<String> it = this.f94617b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().contains(str2)) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (!z2) {
                    File file = new File(str2);
                    if (str2.startsWith(str)) {
                        str2 = file.getParent() + File.separator + "*drive_cache_file*";
                    } else if (str2.startsWith(q)) {
                        String name = file.getName();
                        if (name.contains("encrypted") && name.contains("db")) {
                            str2 = file.getParent() + File.separator + name.substring(name.indexOf("_"));
                        }
                    }
                    Iterator<String> it2 = this.f94619d.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String next = it2.next();
                        if (str2.contains(next)) {
                            str2 = str2.replaceAll(next, "*user_id*");
                            break;
                        }
                    }
                    String a = m145277a(str2);
                    List list3 = (List) hashMap.get(a);
                    if (list3 == null) {
                        list3 = new ArrayList();
                    }
                    list3.add(new C36824a(str2, aVar.f94623b));
                    hashMap.put(a, list3);
                }
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            for (C36824a aVar2 : list2) {
                String str3 = aVar2.f94622a;
                Iterator<String> it3 = this.f94618c.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (it3.next().contains(str3)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    Iterator<String> it4 = this.f94619d.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        String next2 = it4.next();
                        if (str3.contains(next2)) {
                            str3 = str3.replaceAll(next2, "*user_id*");
                            break;
                        }
                    }
                    String a2 = m145277a(str3);
                    List list4 = (List) hashMap.get(a2);
                    if (list4 == null) {
                        list4 = new ArrayList();
                    }
                    list4.add(new C36824a(str3, aVar2.f94623b));
                    hashMap.put(a2, list4);
                }
            }
        }
        try {
            for (Map.Entry entry : hashMap.entrySet()) {
                JSONObject jSONObject = new JSONObject();
                Log.m165379d("StorageExceptionHandler", "module: " + ((String) entry.getKey()));
                jSONObject.put("module", entry.getKey());
                JSONObject jSONObject2 = new JSONObject();
                for (C36824a aVar3 : (List) entry.getValue()) {
                    Log.m165379d("StorageExceptionHandler", "path: " + C36826c.m145287a(aVar3.f94622a) + ", size: " + aVar3.f94623b);
                    jSONObject2.put(C36826c.m145287a(aVar3.f94622a), aVar3.f94623b);
                }
                C36830d.m145308a("lark_storage_exception", jSONObject, jSONObject2, null);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
