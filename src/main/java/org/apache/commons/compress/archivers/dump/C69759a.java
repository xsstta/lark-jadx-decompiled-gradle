package org.apache.commons.compress.archivers.dump;

/* renamed from: org.apache.commons.compress.archivers.dump.a */
public class C69759a {

    /* renamed from: a */
    private long f174231a;

    /* renamed from: b */
    private String f174232b;

    /* renamed from: c */
    private String f174233c;

    /* renamed from: d */
    private String f174234d;

    /* renamed from: a */
    public String mo244700a() {
        return this.f174233c;
    }

    /* renamed from: b */
    public String mo244701b() {
        return this.f174234d;
    }

    public int hashCode() {
        int i;
        String str = this.f174232b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 17;
        }
        int i2 = (int) (((long) i) + (this.f174231a * 31));
        String str2 = this.f174234d;
        if (str2 != null) {
            i2 = (str2.hashCode() * 31) + 17;
        }
        String str3 = this.f174233c;
        if (str3 != null) {
            return (str3.hashCode() * 31) + 17;
        }
        return i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass().equals(getClass())) {
            C69759a aVar = (C69759a) obj;
            if (this.f174231a == aVar.f174231a && mo244701b() != null && mo244701b().equals(aVar.mo244701b()) && mo244700a() != null && mo244700a().equals(aVar.mo244700a())) {
                return true;
            }
        }
        return false;
    }
}
