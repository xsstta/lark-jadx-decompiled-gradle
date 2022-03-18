package com.android.volley.toolbox;

import com.android.volley.C1933h;
import com.android.volley.C1936j;
import com.android.volley.ParseError;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.android.volley.toolbox.m */
public class C1971m extends AbstractC1972n<JSONObject> {
    /* access modifiers changed from: protected */
    @Override // com.android.volley.Request, com.android.volley.toolbox.AbstractC1972n
    public C1936j<JSONObject> parseNetworkResponse(C1933h hVar) {
        try {
            return C1936j.m8594a(new JSONObject(new String(hVar.f6598b, C1956g.m8661a(hVar.f6599c, "utf-8"))), C1956g.m8659a(hVar));
        } catch (UnsupportedEncodingException e) {
            return C1936j.m8593a(new ParseError(e));
        } catch (JSONException e2) {
            return C1936j.m8593a(new ParseError(e2));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1971m(java.lang.String r8, org.json.JSONObject r9, com.android.volley.C1936j.AbstractC1938b<org.json.JSONObject> r10, com.android.volley.C1936j.AbstractC1937a r11) {
        /*
            r7 = this;
            if (r9 != 0) goto L_0x0005
            r0 = 0
            r2 = 0
            goto L_0x0007
        L_0x0005:
            r0 = 1
            r2 = 1
        L_0x0007:
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.C1971m.<init>(java.lang.String, org.json.JSONObject, com.android.volley.j$b, com.android.volley.j$a):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1971m(int r7, java.lang.String r8, org.json.JSONObject r9, com.android.volley.C1936j.AbstractC1938b<org.json.JSONObject> r10, com.android.volley.C1936j.AbstractC1937a r11) {
        /*
            r6 = this;
            if (r9 != 0) goto L_0x0004
            r9 = 0
            goto L_0x0008
        L_0x0004:
            java.lang.String r9 = r9.toString()
        L_0x0008:
            r3 = r9
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.C1971m.<init>(int, java.lang.String, org.json.JSONObject, com.android.volley.j$b, com.android.volley.j$a):void");
    }
}
