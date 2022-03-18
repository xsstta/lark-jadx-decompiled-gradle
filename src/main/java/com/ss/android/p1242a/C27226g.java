package com.ss.android.p1242a;

import com.ss.android.p1242a.C27223f;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.a.g */
public class C27226g {
    /* renamed from: b */
    private static boolean m98966b(String str) {
        if (str == null || str.equals("")) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:10|11|12|13|14|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0026 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003f A[SYNTHETIC, Splitter:B:26:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0046 A[SYNTHETIC, Splitter:B:30:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x004e A[SYNTHETIC, Splitter:B:37:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0055 A[SYNTHETIC, Splitter:B:41:0x0055] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.p1242a.C27223f m98964a(java.io.InputStream r6) {
        /*
            r0 = 0
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x004a, all -> 0x0039 }
            r1.<init>(r6)     // Catch:{ Exception -> 0x004a, all -> 0x0039 }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0037, all -> 0x0032 }
            r6.<init>(r1)     // Catch:{ Exception -> 0x0037, all -> 0x0032 }
            java.lang.String r2 = ""
        L_0x000d:
            java.lang.String r3 = r6.readLine()     // Catch:{ Exception -> 0x0030, all -> 0x002e }
            if (r3 == 0) goto L_0x0023
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0030, all -> 0x002e }
            r4.<init>()     // Catch:{ Exception -> 0x0030, all -> 0x002e }
            r4.append(r2)     // Catch:{ Exception -> 0x0030, all -> 0x002e }
            r4.append(r3)     // Catch:{ Exception -> 0x0030, all -> 0x002e }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x0030, all -> 0x002e }
            goto L_0x000d
        L_0x0023:
            r1.close()     // Catch:{ Exception -> 0x0026 }
        L_0x0026:
            r6.close()     // Catch:{ Exception -> 0x0029 }
        L_0x0029:
            com.ss.android.a.f r6 = m98965a(r2)
            return r6
        L_0x002e:
            r0 = move-exception
            goto L_0x003d
        L_0x0030:
            goto L_0x004c
        L_0x0032:
            r6 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto L_0x003d
        L_0x0037:
            r6 = r0
            goto L_0x004c
        L_0x0039:
            r6 = move-exception
            r1 = r0
            r0 = r6
            r6 = r1
        L_0x003d:
            if (r1 == 0) goto L_0x0044
            r1.close()     // Catch:{ Exception -> 0x0043 }
            goto L_0x0044
        L_0x0043:
        L_0x0044:
            if (r6 == 0) goto L_0x0049
            r6.close()     // Catch:{ Exception -> 0x0049 }
        L_0x0049:
            throw r0
        L_0x004a:
            r6 = r0
            r1 = r6
        L_0x004c:
            if (r1 == 0) goto L_0x0053
            r1.close()     // Catch:{ Exception -> 0x0052 }
            goto L_0x0053
        L_0x0052:
        L_0x0053:
            if (r6 == 0) goto L_0x0058
            r6.close()     // Catch:{ Exception -> 0x0058 }
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.p1242a.C27226g.m98964a(java.io.InputStream):com.ss.android.a.f");
    }

    /* renamed from: a */
    public static C27223f m98965a(String str) {
        C27223f fVar = new C27223f(false);
        try {
            JSONObject jSONObject = new JSONObject(str);
            fVar.mo97090a(jSONObject.optBoolean("enable", false));
            if (jSONObject.has("abilist")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("abilist");
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    String optString = jSONObject2.optString("abi");
                    if (!m98966b(optString)) {
                        C27223f.C27224a a = fVar.mo97088a(optString);
                        JSONArray optJSONArray2 = jSONObject2.optJSONArray("filelist");
                        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                            JSONObject optJSONObject = optJSONArray2.optJSONObject(i2);
                            String optString2 = optJSONObject.optString("name", "");
                            String optString3 = optJSONObject.optString("md5", "");
                            if (!m98966b(optString2)) {
                                if (!m98966b(optString3)) {
                                    a.mo97091a(optString2).mo97095a(optString3);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return fVar;
    }
}
