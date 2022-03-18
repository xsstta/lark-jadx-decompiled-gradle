package androidx.lifecycle;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.C1442a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.lifecycle.ab */
public final class C1133ab {

    /* renamed from: e */
    private static final Class[] f4231e;

    /* renamed from: a */
    final Map<String, Object> f4232a;

    /* renamed from: b */
    final Map<String, C1442a.AbstractC1444b> f4233b;

    /* renamed from: c */
    private final Map<String, Object<?>> f4234c;

    /* renamed from: d */
    private final C1442a.AbstractC1444b f4235d;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1442a.AbstractC1444b mo5989a() {
        return this.f4235d;
    }

    public C1133ab() {
        this.f4233b = new HashMap();
        this.f4234c = new HashMap();
        this.f4235d = new C1442a.AbstractC1444b() {
            /* class androidx.lifecycle.C1133ab.C11341 */

            @Override // androidx.savedstate.C1442a.AbstractC1444b
            /* renamed from: a */
            public Bundle mo5991a() {
                for (Map.Entry entry : new HashMap(C1133ab.this.f4233b).entrySet()) {
                    C1133ab.this.mo5990a((String) entry.getKey(), ((C1442a.AbstractC1444b) entry.getValue()).mo5991a());
                }
                Set<String> keySet = C1133ab.this.f4232a.keySet();
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(keySet.size());
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
                for (String str : keySet) {
                    arrayList.add(str);
                    arrayList2.add(C1133ab.this.f4232a.get(str));
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("keys", arrayList);
                bundle.putParcelableArrayList("values", arrayList2);
                return bundle;
            }
        };
        this.f4232a = new HashMap();
    }

    static {
        Class<Size> cls;
        Class<SizeF> cls2;
        Class[] clsArr = new Class[29];
        clsArr[0] = Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = Double.TYPE;
        clsArr[3] = double[].class;
        clsArr[4] = Integer.TYPE;
        clsArr[5] = int[].class;
        clsArr[6] = Long.TYPE;
        clsArr[7] = long[].class;
        clsArr[8] = String.class;
        clsArr[9] = String[].class;
        clsArr[10] = Binder.class;
        clsArr[11] = Bundle.class;
        clsArr[12] = Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = Character.TYPE;
        clsArr[15] = char[].class;
        clsArr[16] = CharSequence.class;
        clsArr[17] = CharSequence[].class;
        clsArr[18] = ArrayList.class;
        clsArr[19] = Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = Parcelable.class;
        clsArr[22] = Parcelable[].class;
        clsArr[23] = Serializable.class;
        clsArr[24] = Short.TYPE;
        clsArr[25] = short[].class;
        clsArr[26] = SparseArray.class;
        if (Build.VERSION.SDK_INT >= 21) {
            cls = Size.class;
        } else {
            cls = Integer.TYPE;
        }
        clsArr[27] = cls;
        if (Build.VERSION.SDK_INT >= 21) {
            cls2 = SizeF.class;
        } else {
            cls2 = Integer.TYPE;
        }
        clsArr[28] = cls2;
        f4231e = clsArr;
    }

    public C1133ab(Map<String, Object> map) {
        this.f4233b = new HashMap();
        this.f4234c = new HashMap();
        this.f4235d = new C1442a.AbstractC1444b() {
            /* class androidx.lifecycle.C1133ab.C11341 */

            @Override // androidx.savedstate.C1442a.AbstractC1444b
            /* renamed from: a */
            public Bundle mo5991a() {
                for (Map.Entry entry : new HashMap(C1133ab.this.f4233b).entrySet()) {
                    C1133ab.this.mo5990a((String) entry.getKey(), ((C1442a.AbstractC1444b) entry.getValue()).mo5991a());
                }
                Set<String> keySet = C1133ab.this.f4232a.keySet();
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(keySet.size());
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
                for (String str : keySet) {
                    arrayList.add(str);
                    arrayList2.add(C1133ab.this.f4232a.get(str));
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("keys", arrayList);
                bundle.putParcelableArrayList("values", arrayList2);
                return bundle;
            }
        };
        this.f4232a = new HashMap(map);
    }

    /* renamed from: a */
    private static void m5341a(Object obj) {
        if (obj != null) {
            for (Class cls : f4231e) {
                if (cls.isInstance(obj)) {
                    return;
                }
            }
            throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
        }
    }

    /* renamed from: a */
    public <T> void mo5990a(String str, T t) {
        m5341a(t);
        C1177w wVar = (C1177w) this.f4234c.get(str);
        if (wVar != null) {
            wVar.mo5929b((Object) t);
        } else {
            this.f4232a.put(str, t);
        }
    }

    /* renamed from: a */
    static C1133ab m5340a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return new C1133ab();
        }
        HashMap hashMap = new HashMap();
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                hashMap.put(str, bundle2.get(str));
            }
        }
        if (bundle == null) {
            return new C1133ab(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashMap.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
        }
        return new C1133ab(hashMap);
    }
}
