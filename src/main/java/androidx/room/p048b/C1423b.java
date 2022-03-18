package androidx.room.p048b;

import android.database.Cursor;
import android.os.Build;
import androidx.p038g.p039a.AbstractC1082b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: androidx.room.b.b */
public class C1423b {

    /* renamed from: a */
    public final String f4999a;

    /* renamed from: b */
    public final Map<String, C1424a> f5000b;

    /* renamed from: c */
    public final Set<C1425b> f5001c;

    /* renamed from: d */
    public final Set<C1427d> f5002d;

    /* renamed from: androidx.room.b.b$a */
    public static class C1424a {

        /* renamed from: a */
        public final String f5003a;

        /* renamed from: b */
        public final String f5004b;

        /* renamed from: c */
        public final int f5005c;

        /* renamed from: d */
        public final boolean f5006d;

        /* renamed from: e */
        public final int f5007e;

        /* renamed from: a */
        public boolean mo7575a() {
            if (this.f5007e > 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int hashCode = ((this.f5003a.hashCode() * 31) + this.f5005c) * 31;
            if (this.f5006d) {
                i = 1231;
            } else {
                i = 1237;
            }
            return ((hashCode + i) * 31) + this.f5007e;
        }

        public String toString() {
            return "Column{name='" + this.f5003a + '\'' + ", type='" + this.f5004b + '\'' + ", affinity='" + this.f5005c + '\'' + ", notNull=" + this.f5006d + ", primaryKeyPosition=" + this.f5007e + '}';
        }

        /* renamed from: a */
        private static int m6528a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            if (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) {
                return 4;
            }
            return 1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1424a aVar = (C1424a) obj;
            if (Build.VERSION.SDK_INT >= 20) {
                if (this.f5007e != aVar.f5007e) {
                    return false;
                }
            } else if (mo7575a() != aVar.mo7575a()) {
                return false;
            }
            if (this.f5003a.equals(aVar.f5003a) && this.f5006d == aVar.f5006d && this.f5005c == aVar.f5005c) {
                return true;
            }
            return false;
        }

        public C1424a(String str, String str2, boolean z, int i) {
            this.f5003a = str;
            this.f5004b = str2;
            this.f5006d = z;
            this.f5007e = i;
            this.f5005c = m6528a(str2);
        }
    }

    /* renamed from: androidx.room.b.b$b */
    public static class C1425b {

        /* renamed from: a */
        public final String f5008a;

        /* renamed from: b */
        public final String f5009b;

        /* renamed from: c */
        public final String f5010c;

        /* renamed from: d */
        public final List<String> f5011d;

        /* renamed from: e */
        public final List<String> f5012e;

        public int hashCode() {
            return (((((((this.f5008a.hashCode() * 31) + this.f5009b.hashCode()) * 31) + this.f5010c.hashCode()) * 31) + this.f5011d.hashCode()) * 31) + this.f5012e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f5008a + '\'' + ", onDelete='" + this.f5009b + '\'' + ", onUpdate='" + this.f5010c + '\'' + ", columnNames=" + this.f5011d + ", referenceColumnNames=" + this.f5012e + '}';
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1425b bVar = (C1425b) obj;
            if (this.f5008a.equals(bVar.f5008a) && this.f5009b.equals(bVar.f5009b) && this.f5010c.equals(bVar.f5010c) && this.f5011d.equals(bVar.f5011d)) {
                return this.f5012e.equals(bVar.f5012e);
            }
            return false;
        }

        public C1425b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f5008a = str;
            this.f5009b = str2;
            this.f5010c = str3;
            this.f5011d = Collections.unmodifiableList(list);
            this.f5012e = Collections.unmodifiableList(list2);
        }
    }

    /* renamed from: androidx.room.b.b$d */
    public static class C1427d {

        /* renamed from: a */
        public final String f5017a;

        /* renamed from: b */
        public final boolean f5018b;

        /* renamed from: c */
        public final List<String> f5019c;

        public int hashCode() {
            int i;
            if (this.f5017a.startsWith("index_")) {
                i = -1184239155;
            } else {
                i = this.f5017a.hashCode();
            }
            return (((i * 31) + (this.f5018b ? 1 : 0)) * 31) + this.f5019c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f5017a + '\'' + ", unique=" + this.f5018b + ", columns=" + this.f5019c + '}';
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1427d dVar = (C1427d) obj;
            if (this.f5018b != dVar.f5018b || !this.f5019c.equals(dVar.f5019c)) {
                return false;
            }
            if (this.f5017a.startsWith("index_")) {
                return dVar.f5017a.startsWith("index_");
            }
            return this.f5017a.equals(dVar.f5017a);
        }

        public C1427d(String str, boolean z, List<String> list) {
            this.f5017a = str;
            this.f5018b = z;
            this.f5019c = list;
        }
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f4999a;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Map<String, C1424a> map = this.f5000b;
        if (map != null) {
            i2 = map.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Set<C1425b> set = this.f5001c;
        if (set != null) {
            i3 = set.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        return "TableInfo{name='" + this.f4999a + '\'' + ", columns=" + this.f5000b + ", foreignKeys=" + this.f5001c + ", indices=" + this.f5002d + '}';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.room.b.b$c */
    public static class C1426c implements Comparable<C1426c> {

        /* renamed from: a */
        final int f5013a;

        /* renamed from: b */
        final int f5014b;

        /* renamed from: c */
        final String f5015c;

        /* renamed from: d */
        final String f5016d;

        /* renamed from: a */
        public int compareTo(C1426c cVar) {
            int i = this.f5013a - cVar.f5013a;
            if (i == 0) {
                return this.f5014b - cVar.f5014b;
            }
            return i;
        }

        C1426c(int i, int i2, String str, String str2) {
            this.f5013a = i;
            this.f5014b = i2;
            this.f5015c = str;
            this.f5016d = str2;
        }
    }

    public boolean equals(Object obj) {
        Set<C1427d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1423b bVar = (C1423b) obj;
        String str = this.f4999a;
        if (str == null ? bVar.f4999a != null : !str.equals(bVar.f4999a)) {
            return false;
        }
        Map<String, C1424a> map = this.f5000b;
        if (map == null ? bVar.f5000b != null : !map.equals(bVar.f5000b)) {
            return false;
        }
        Set<C1425b> set2 = this.f5001c;
        if (set2 == null ? bVar.f5001c != null : !set2.equals(bVar.f5001c)) {
            return false;
        }
        Set<C1427d> set3 = this.f5002d;
        if (set3 == null || (set = bVar.f5002d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    /* renamed from: a */
    private static List<C1426c> m6524a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C1426c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public static C1423b m6523a(AbstractC1082b bVar, String str) {
        return new C1423b(str, m6526c(bVar, str), m6525b(bVar, str), m6527d(bVar, str));
    }

    /* renamed from: c */
    private static Map<String, C1424a> m6526c(AbstractC1082b bVar, String str) {
        boolean z;
        Cursor query = bVar.query("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (query.getColumnCount() > 0) {
                int columnIndex = query.getColumnIndex("name");
                int columnIndex2 = query.getColumnIndex(ShareHitPoint.f121869d);
                int columnIndex3 = query.getColumnIndex("notnull");
                int columnIndex4 = query.getColumnIndex("pk");
                while (query.moveToNext()) {
                    String string = query.getString(columnIndex);
                    String string2 = query.getString(columnIndex2);
                    if (query.getInt(columnIndex3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hashMap.put(string, new C1424a(string, string2, z, query.getInt(columnIndex4)));
                }
            }
            return hashMap;
        } finally {
            query.close();
        }
    }

    /* renamed from: d */
    private static Set<C1427d> m6527d(AbstractC1082b bVar, String str) {
        Cursor query = bVar.query("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = query.getColumnIndex("name");
            int columnIndex2 = query.getColumnIndex("origin");
            int columnIndex3 = query.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    HashSet hashSet = new HashSet();
                    while (query.moveToNext()) {
                        if (C60375c.f150914a.equals(query.getString(columnIndex2))) {
                            String string = query.getString(columnIndex);
                            boolean z = true;
                            if (query.getInt(columnIndex3) != 1) {
                                z = false;
                            }
                            C1427d a = m6522a(bVar, string, z);
                            if (a == null) {
                                query.close();
                                return null;
                            }
                            hashSet.add(a);
                        }
                    }
                    query.close();
                    return hashSet;
                }
            }
            return null;
        } finally {
            query.close();
        }
    }

    /* renamed from: b */
    private static Set<C1425b> m6525b(AbstractC1082b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor query = bVar.query("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = query.getColumnIndex("id");
            int columnIndex2 = query.getColumnIndex("seq");
            int columnIndex3 = query.getColumnIndex("table");
            int columnIndex4 = query.getColumnIndex("on_delete");
            int columnIndex5 = query.getColumnIndex("on_update");
            List<C1426c> a = m6524a(query);
            int count = query.getCount();
            for (int i = 0; i < count; i++) {
                query.moveToPosition(i);
                if (query.getInt(columnIndex2) == 0) {
                    int i2 = query.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C1426c cVar : a) {
                        if (cVar.f5013a == i2) {
                            arrayList.add(cVar.f5015c);
                            arrayList2.add(cVar.f5016d);
                        }
                    }
                    hashSet.add(new C1425b(query.getString(columnIndex3), query.getString(columnIndex4), query.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            query.close();
        }
    }

    /* renamed from: a */
    private static C1427d m6522a(AbstractC1082b bVar, String str, boolean z) {
        Cursor query = bVar.query("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = query.getColumnIndex("seqno");
            int columnIndex2 = query.getColumnIndex("cid");
            int columnIndex3 = query.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (query.moveToNext()) {
                        if (query.getInt(columnIndex2) >= 0) {
                            int i = query.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i), query.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    C1427d dVar = new C1427d(str, z, arrayList);
                    query.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            query.close();
        }
    }

    public C1423b(String str, Map<String, C1424a> map, Set<C1425b> set, Set<C1427d> set2) {
        Set<C1427d> set3;
        this.f4999a = str;
        this.f5000b = Collections.unmodifiableMap(map);
        this.f5001c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            set3 = null;
        } else {
            set3 = Collections.unmodifiableSet(set2);
        }
        this.f5002d = set3;
    }
}
