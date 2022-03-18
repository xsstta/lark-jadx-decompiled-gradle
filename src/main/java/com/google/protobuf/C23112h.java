package com.google.protobuf;

import com.google.protobuf.C23112h.AbstractC23114a;
import com.google.protobuf.C23119j;
import com.google.protobuf.WireFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.h */
final class C23112h<FieldDescriptorType extends AbstractC23114a<FieldDescriptorType>> {

    /* renamed from: d */
    private static final C23112h f57055d = new C23112h(true);

    /* renamed from: a */
    private final C23189t<FieldDescriptorType, Object> f57056a = C23189t.m83963a(16);

    /* renamed from: b */
    private boolean f57057b;

    /* renamed from: c */
    private boolean f57058c;

    /* renamed from: com.google.protobuf.h$a */
    public interface AbstractC23114a<T extends AbstractC23114a<T>> extends Comparable<T> {
        /* renamed from: a */
        WireFormat.FieldType mo80158a();

        /* renamed from: b */
        boolean mo80159b();
    }

    /* renamed from: a */
    public static <T extends AbstractC23114a<T>> C23112h<T> m83799a() {
        return new C23112h<>();
    }

    public int hashCode() {
        return this.f57056a.hashCode();
    }

    private C23112h() {
    }

    /* renamed from: b */
    public void mo80272b() {
        if (!this.f57057b) {
            this.f57056a.mo80420a();
            this.f57057b = true;
        }
    }

    /* renamed from: d */
    public Iterator<Map.Entry<FieldDescriptorType, Object>> mo80275d() {
        if (this.f57058c) {
            return new C23119j.C23122b(this.f57056a.entrySet().iterator());
        }
        return this.f57056a.entrySet().iterator();
    }

    /* renamed from: c */
    public C23112h<FieldDescriptorType> clone() {
        C23112h<FieldDescriptorType> a = m83799a();
        for (int i = 0; i < this.f57056a.mo80423c(); i++) {
            Map.Entry<FieldDescriptorType, Object> b = this.f57056a.mo80421b(i);
            a.mo80271a(b.getKey(), b.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f57056a.mo80428e()) {
            a.mo80271a(entry.getKey(), entry.getValue());
        }
        a.f57058c = this.f57058c;
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.h$1 */
    public static /* synthetic */ class C231131 {

        /* renamed from: a */
        static final /* synthetic */ int[] f57059a;

        /* renamed from: b */
        static final /* synthetic */ int[] f57060b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
            // Method dump skipped, instructions count: 314
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23112h.C231131.<clinit>():void");
        }
    }

    private C23112h(boolean z) {
        mo80272b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23112h)) {
            return false;
        }
        return this.f57056a.equals(((C23112h) obj).f57056a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.protobuf.C23119j) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof com.google.protobuf.C23115i.AbstractC23116a) == false) goto L_0x0030;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m83800a(com.google.protobuf.WireFormat.FieldType r2, java.lang.Object r3) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23112h.m83800a(com.google.protobuf.WireFormat$FieldType, java.lang.Object):void");
    }

    /* renamed from: a */
    public void mo80271a(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo80159b()) {
            m83800a(fielddescriptortype.mo80158a(), obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            for (Object obj2 : arrayList) {
                m83800a(fielddescriptortype.mo80158a(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C23119j) {
            this.f57058c = true;
        }
        this.f57056a.put(fielddescriptortype, obj);
    }
}
