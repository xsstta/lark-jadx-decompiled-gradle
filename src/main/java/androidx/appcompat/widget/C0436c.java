package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.c */
public class C0436c extends DataSetObservable {

    /* renamed from: a */
    static final String f1595a = "c";

    /* renamed from: e */
    private static final Object f1596e = new Object();

    /* renamed from: f */
    private static final Map<String, C0436c> f1597f = new HashMap();

    /* renamed from: b */
    final Context f1598b;

    /* renamed from: c */
    final String f1599c;

    /* renamed from: d */
    boolean f1600d = true;

    /* renamed from: g */
    private final Object f1601g = new Object();

    /* renamed from: h */
    private final List<C0437a> f1602h = new ArrayList();

    /* renamed from: i */
    private final List<C0440d> f1603i = new ArrayList();

    /* renamed from: j */
    private Intent f1604j;

    /* renamed from: k */
    private AbstractC0438b f1605k = new C0439c();

    /* renamed from: l */
    private int f1606l = 50;

    /* renamed from: m */
    private boolean f1607m = false;

    /* renamed from: n */
    private boolean f1608n = true;

    /* renamed from: o */
    private boolean f1609o = false;

    /* renamed from: p */
    private AbstractC0441e f1610p;

    /* renamed from: androidx.appcompat.widget.c$b */
    public interface AbstractC0438b {
        /* renamed from: a */
        void mo2563a(Intent intent, List<C0437a> list, List<C0440d> list2);
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    public interface AbstractC0441e {
        /* renamed from: a */
        boolean mo2567a(C0436c cVar, Intent intent);
    }

    /* renamed from: androidx.appcompat.widget.c$a */
    public static final class C0437a implements Comparable<C0437a> {

        /* renamed from: a */
        public final ResolveInfo f1611a;

        /* renamed from: b */
        public float f1612b;

        public int hashCode() {
            return Float.floatToIntBits(this.f1612b) + 31;
        }

        public String toString() {
            return "[" + "resolveInfo:" + this.f1611a.toString() + "; weight:" + new BigDecimal((double) this.f1612b) + "]";
        }

        public C0437a(ResolveInfo resolveInfo) {
            this.f1611a = resolveInfo;
        }

        /* renamed from: a */
        public int compareTo(C0437a aVar) {
            return Float.floatToIntBits(aVar.f1612b) - Float.floatToIntBits(this.f1612b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass() && Float.floatToIntBits(this.f1612b) == Float.floatToIntBits(((C0437a) obj).f1612b)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    private static final class C0439c implements AbstractC0438b {

        /* renamed from: a */
        private final Map<ComponentName, C0437a> f1613a = new HashMap();

        C0439c() {
        }

        @Override // androidx.appcompat.widget.C0436c.AbstractC0438b
        /* renamed from: a */
        public void mo2563a(Intent intent, List<C0437a> list, List<C0440d> list2) {
            Map<ComponentName, C0437a> map = this.f1613a;
            map.clear();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C0437a aVar = list.get(i);
                aVar.f1612b = BitmapDescriptorFactory.HUE_RED;
                map.put(new ComponentName(aVar.f1611a.activityInfo.packageName, aVar.f1611a.activityInfo.name), aVar);
            }
            float f = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                C0440d dVar = list2.get(size2);
                C0437a aVar2 = map.get(dVar.f1614a);
                if (aVar2 != null) {
                    aVar2.f1612b += dVar.f1616c * f;
                    f *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    /* renamed from: e */
    private void m1870e() {
        boolean g = m1872g() | m1873h();
        m1874i();
        if (g) {
            m1871f();
            notifyChanged();
        }
    }

    /* renamed from: h */
    private boolean m1873h() {
        if (!this.f1600d || !this.f1608n || TextUtils.isEmpty(this.f1599c)) {
            return false;
        }
        this.f1600d = false;
        this.f1607m = true;
        m1875j();
        return true;
    }

    /* renamed from: i */
    private void m1874i() {
        int size = this.f1603i.size() - this.f1606l;
        if (size > 0) {
            this.f1608n = true;
            for (int i = 0; i < size; i++) {
                this.f1603i.remove(0);
            }
        }
    }

    /* renamed from: c */
    public int mo2556c() {
        int size;
        synchronized (this.f1601g) {
            m1870e();
            size = this.f1603i.size();
        }
        return size;
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    public static final class C0440d {

        /* renamed from: a */
        public final ComponentName f1614a;

        /* renamed from: b */
        public final long f1615b;

        /* renamed from: c */
        public final float f1616c;

        public int hashCode() {
            int i;
            ComponentName componentName = this.f1614a;
            if (componentName == null) {
                i = 0;
            } else {
                i = componentName.hashCode();
            }
            long j = this.f1615b;
            return ((((i + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.f1616c);
        }

        public String toString() {
            return "[" + "; activity:" + this.f1614a + "; time:" + this.f1615b + "; weight:" + new BigDecimal((double) this.f1616c) + "]";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0440d dVar = (C0440d) obj;
            ComponentName componentName = this.f1614a;
            if (componentName == null) {
                if (dVar.f1614a != null) {
                    return false;
                }
            } else if (!componentName.equals(dVar.f1614a)) {
                return false;
            }
            if (this.f1615b == dVar.f1615b && Float.floatToIntBits(this.f1616c) == Float.floatToIntBits(dVar.f1616c)) {
                return true;
            }
            return false;
        }

        public C0440d(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public C0440d(ComponentName componentName, long j, float f) {
            this.f1614a = componentName;
            this.f1615b = j;
            this.f1616c = f;
        }
    }

    /* renamed from: d */
    private void m1869d() {
        if (!this.f1607m) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.f1608n) {
            this.f1608n = false;
            if (!TextUtils.isEmpty(this.f1599c)) {
                new AsyncTaskC0442f().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f1603i), this.f1599c);
            }
        }
    }

    /* renamed from: f */
    private boolean m1871f() {
        if (this.f1605k == null || this.f1604j == null || this.f1602h.isEmpty() || this.f1603i.isEmpty()) {
            return false;
        }
        this.f1605k.mo2563a(this.f1604j, this.f1602h, Collections.unmodifiableList(this.f1603i));
        return true;
    }

    /* renamed from: g */
    private boolean m1872g() {
        if (!this.f1609o || this.f1604j == null) {
            return false;
        }
        this.f1609o = false;
        this.f1602h.clear();
        List<ResolveInfo> queryIntentActivities = this.f1598b.getPackageManager().queryIntentActivities(this.f1604j, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f1602h.add(new C0437a(queryIntentActivities.get(i)));
        }
        return true;
    }

    /* renamed from: b */
    public ResolveInfo mo2555b() {
        synchronized (this.f1601g) {
            m1870e();
            if (this.f1602h.isEmpty()) {
                return null;
            }
            return this.f1602h.get(0).f1611a;
        }
    }

    /* renamed from: a */
    public int mo2551a() {
        int size;
        synchronized (this.f1601g) {
            m1870e();
            size = this.f1602h.size();
        }
        return size;
    }

    /* renamed from: j */
    private void m1875j() {
        try {
            FileInputStream openFileInput = this.f1598b.openFileInput(this.f1599c);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, "UTF-8");
                int i = 0;
                while (i != 1 && i != 2) {
                    i = newPullParser.next();
                }
                if ("historical-records".equals(newPullParser.getName())) {
                    List<C0440d> list = this.f1603i;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1) {
                            if (openFileInput == null) {
                                return;
                            }
                        } else if (!(next == 3 || next == 4)) {
                            if ("historical-record".equals(newPullParser.getName())) {
                                list.add(new C0440d(newPullParser.getAttributeValue(null, "activity"), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                            } else {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                        }
                    }
                    try {
                        openFileInput.close();
                    } catch (IOException unused) {
                    }
                } else {
                    throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                }
            } catch (XmlPullParserException e) {
                String str = f1595a;
                Log.e(str, "Error reading historical recrod file: " + this.f1599c, e);
                if (openFileInput == null) {
                }
            } catch (IOException e2) {
                String str2 = f1595a;
                Log.e(str2, "Error reading historical recrod file: " + this.f1599c, e2);
                if (openFileInput == null) {
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused3) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$f */
    public final class AsyncTaskC0442f extends AsyncTask<Object, Void, Void> {
        AsyncTaskC0442f() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x006d, code lost:
            if (r15 != null) goto L_0x006f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r15.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0092, code lost:
            if (r15 == null) goto L_0x00d5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b2, code lost:
            if (r15 == null) goto L_0x00d5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d2, code lost:
            if (r15 == null) goto L_0x00d5;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Object... r15) {
            /*
            // Method dump skipped, instructions count: 246
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0436c.AsyncTaskC0442f.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    /* renamed from: a */
    private boolean m1868a(C0440d dVar) {
        boolean add = this.f1603i.add(dVar);
        if (add) {
            this.f1608n = true;
            m1874i();
            m1869d();
            m1871f();
            notifyChanged();
        }
        return add;
    }

    /* renamed from: b */
    public Intent mo2554b(int i) {
        synchronized (this.f1601g) {
            if (this.f1604j == null) {
                return null;
            }
            m1870e();
            C0437a aVar = this.f1602h.get(i);
            ComponentName componentName = new ComponentName(aVar.f1611a.activityInfo.packageName, aVar.f1611a.activityInfo.name);
            Intent intent = new Intent(this.f1604j);
            intent.setComponent(componentName);
            if (this.f1610p != null) {
                if (this.f1610p.mo2567a(this, new Intent(intent))) {
                    return null;
                }
            }
            m1868a(new C0440d(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    /* renamed from: c */
    public void mo2557c(int i) {
        float f;
        synchronized (this.f1601g) {
            m1870e();
            C0437a aVar = this.f1602h.get(i);
            C0437a aVar2 = this.f1602h.get(0);
            if (aVar2 != null) {
                f = (aVar2.f1612b - aVar.f1612b) + 5.0f;
            } else {
                f = 1.0f;
            }
            m1868a(new C0440d(new ComponentName(aVar.f1611a.activityInfo.packageName, aVar.f1611a.activityInfo.name), System.currentTimeMillis(), f));
        }
    }

    /* renamed from: a */
    public int mo2552a(ResolveInfo resolveInfo) {
        synchronized (this.f1601g) {
            m1870e();
            List<C0437a> list = this.f1602h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).f1611a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    public ResolveInfo mo2553a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f1601g) {
            m1870e();
            resolveInfo = this.f1602h.get(i).f1611a;
        }
        return resolveInfo;
    }

    /* renamed from: a */
    public static C0436c m1867a(Context context, String str) {
        C0436c cVar;
        synchronized (f1596e) {
            Map<String, C0436c> map = f1597f;
            cVar = map.get(str);
            if (cVar == null) {
                cVar = new C0436c(context, str);
                map.put(str, cVar);
            }
        }
        return cVar;
    }

    private C0436c(Context context, String str) {
        this.f1598b = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(".xml")) {
            this.f1599c = str;
            return;
        }
        this.f1599c = str + ".xml";
    }
}
