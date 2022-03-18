package com.ss.videoarch.liveplayer.p3251b;

import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.liveplayer.b.a */
public class C65611a {

    /* renamed from: a */
    private C65613c[] f165146a;

    /* renamed from: b */
    private C65612b f165147b;

    /* renamed from: c */
    private String[] f165148c;

    /* renamed from: d */
    private int f165149d;

    /* renamed from: e */
    private int f165150e;

    /* renamed from: g */
    public int mo229591g() {
        return this.f165149d;
    }

    /* renamed from: a */
    public boolean mo229575a(String str) {
        C65612b bVar;
        if (this.f165149d != 2 || (bVar = this.f165147b) == null) {
            return false;
        }
        return bVar.mo229609c(str);
    }

    /* renamed from: f */
    public String mo229590f() {
        this.f165150e++;
        return mo229584d();
    }

    /* renamed from: e */
    public C65613c mo229586e() {
        C65613c[] cVarArr = this.f165146a;
        if (!(cVarArr == null || cVarArr.length == 0)) {
            for (C65613c cVar : cVarArr) {
                if (cVar.f165157a != null) {
                    return cVar;
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    public void mo229594h() {
        this.f165150e = 0;
        this.f165148c = null;
        this.f165147b = null;
        this.f165146a = null;
    }

    /* renamed from: b */
    public String mo229577b() {
        C65612b bVar;
        if (this.f165149d != 2 || (bVar = this.f165147b) == null) {
            return null;
        }
        return bVar.mo229603b();
    }

    /* renamed from: c */
    public Map<String, String> mo229581c() {
        C65612b bVar;
        if (this.f165149d != 2 || (bVar = this.f165147b) == null) {
            return null;
        }
        return bVar.mo229608c();
    }

    /* renamed from: d */
    public String mo229584d() {
        String[] strArr = this.f165148c;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        int i = this.f165150e;
        if (i >= strArr.length) {
            i = 0;
        }
        return strArr[i];
    }

    /* renamed from: a */
    public JSONObject mo229570a() {
        C65612b bVar;
        if (this.f165149d != 2 || (bVar = this.f165147b) == null) {
            return null;
        }
        return bVar.mo229599a();
    }

    /* renamed from: c */
    public void mo229582c(String str) {
        this.f165147b.mo229606b(str);
    }

    /* renamed from: d */
    public void mo229585d(String str) {
        C65612b bVar = this.f165147b;
        if (bVar != null) {
            bVar.mo229600a(str);
        }
    }

    /* renamed from: a */
    public void mo229571a(C65612b bVar) {
        this.f165147b = bVar;
        this.f165150e = 0;
        this.f165149d = 2;
    }

    /* renamed from: e */
    public C65613c mo229587e(String str) {
        C65613c[] cVarArr;
        if (!(str == null || (cVarArr = this.f165146a) == null || cVarArr.length == 0)) {
            for (C65613c cVar : cVarArr) {
                if (str.equals(cVar.mo229618a()) && cVar.f165157a != null) {
                    return cVar;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo229579b(String str) {
        C65612b bVar;
        if (this.f165149d != 2 || (bVar = this.f165147b) == null) {
            return false;
        }
        return bVar.mo229612d(str);
    }

    /* renamed from: a */
    public void mo229572a(boolean z) {
        C65612b bVar = this.f165147b;
        if (bVar != null) {
            bVar.mo229601a(z);
        }
    }

    /* renamed from: a */
    public void mo229573a(C65613c[] cVarArr) {
        this.f165146a = cVarArr;
        this.f165150e = 0;
        this.f165149d = 1;
        ArrayList arrayList = new ArrayList();
        for (C65613c cVar : cVarArr) {
            if (cVar.f165157a != null) {
                arrayList.add(cVar.f165157a);
            }
            if (cVar.f165158b != null) {
                arrayList.add(cVar.f165158b);
            }
        }
        String[] strArr = new String[arrayList.size()];
        this.f165148c = strArr;
        arrayList.toArray(strArr);
    }

    /* renamed from: a */
    public boolean mo229574a(int i) {
        C65612b bVar = this.f165147b;
        if (bVar == null) {
            return false;
        }
        return bVar.mo229602a(i);
    }

    /* renamed from: a */
    public String mo229567a(String str, String str2) {
        return this.f165147b.mo229604b(str, str2);
    }

    /* renamed from: g */
    public String mo229592g(String str, String str2) {
        C65612b bVar = this.f165147b;
        if (bVar == null) {
            return null;
        }
        return bVar.mo229611d(str, str2);
    }

    /* renamed from: h */
    public String mo229593h(String str, String str2) {
        C65612b bVar = this.f165147b;
        if (bVar == null) {
            return null;
        }
        return bVar.mo229613e(str, str2);
    }

    /* renamed from: a */
    public String mo229566a(long j, String str) {
        C65612b bVar;
        if (this.f165149d != 2 || (bVar = this.f165147b) == null) {
            return null;
        }
        return bVar.mo229596a(j, str);
    }

    /* renamed from: b */
    public int mo229576b(String str, String str2) {
        C65612b bVar;
        if (this.f165149d != 2 || (bVar = this.f165147b) == null) {
            return -1;
        }
        return bVar.mo229607c(str, str2);
    }

    /* renamed from: c */
    public String mo229580c(String str, String str2) {
        C65612b bVar;
        if (this.f165149d != 2 || (bVar = this.f165147b) == null) {
            return null;
        }
        return bVar.mo229614f(str, str2);
    }

    /* renamed from: d */
    public int mo229583d(String str, String str2) {
        C65612b bVar;
        if (this.f165149d != 2 || (bVar = this.f165147b) == null) {
            return 0;
        }
        return bVar.mo229595a(str, str2);
    }

    /* renamed from: f */
    public long mo229589f(String str, String str2) {
        C65612b bVar;
        if (this.f165149d != 2 || (bVar = this.f165147b) == null) {
            return 0;
        }
        return bVar.mo229615g(str, str2);
    }

    /* renamed from: e */
    public String mo229588e(String str, String str2) {
        C65612b bVar;
        if (this.f165149d != 2 || (bVar = this.f165147b) == null) {
            return null;
        }
        return bVar.mo229617i(str, str2);
    }

    /* renamed from: b */
    public String mo229578b(String str, String str2, String str3) {
        C65612b bVar = this.f165147b;
        if (bVar == null) {
            return null;
        }
        return bVar.mo229605b(str, str2, str3);
    }

    /* renamed from: a */
    public String mo229568a(String str, String str2, String str3) {
        C65612b bVar;
        if (this.f165149d != 2 || (bVar = this.f165147b) == null) {
            return null;
        }
        return bVar.mo229597a(str, str2, str3);
    }

    /* renamed from: a */
    public String mo229569a(String str, String str2, String str3, String str4) {
        C65612b bVar;
        if (this.f165149d != 2 || (bVar = this.f165147b) == null) {
            return null;
        }
        return bVar.mo229598a(str, str2, str3, str4);
    }
}
