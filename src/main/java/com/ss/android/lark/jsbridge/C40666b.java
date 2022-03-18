package com.ss.android.lark.jsbridge;

/* renamed from: com.ss.android.lark.jsbridge.b */
public class C40666b {

    /* renamed from: a */
    public static String f103271a = "javascript:window.onLarkTabBack && window.onLarkTabBack();";

    /* renamed from: a */
    public static String m160677a(String str) {
        return str.replace("javascript:LkWebViewJavascriptBridge.", "").replaceAll("\\(.*\\);", "");
    }

    /* renamed from: c */
    public static String m160679c(String str) {
        String[] split = str.replace("larkbridge://return/", "").split("/");
        if (split.length >= 1) {
            return split[0];
        }
        return null;
    }

    /* renamed from: b */
    public static String m160678b(String str) {
        if (str.startsWith("larkbridge://return/_fetchQueue/")) {
            return str.replace("larkbridge://return/_fetchQueue/", "");
        }
        String[] split = str.replace("larkbridge://return/", "").split("/");
        if (split.length < 2) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < split.length; i++) {
            sb.append(split[i]);
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004a A[SYNTHETIC, Splitter:B:25:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0052 A[SYNTHETIC, Splitter:B:32:0x0052] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m160676a(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch:{ Exception -> 0x003f, all -> 0x003d }
            java.io.InputStream r4 = r4.open(r5)     // Catch:{ Exception -> 0x003f, all -> 0x003d }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003b }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x003b }
            r1.<init>(r4)     // Catch:{ Exception -> 0x003b }
            r5.<init>(r1)     // Catch:{ Exception -> 0x003b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003b }
            r1.<init>()     // Catch:{ Exception -> 0x003b }
        L_0x0018:
            java.lang.String r2 = r5.readLine()     // Catch:{ Exception -> 0x003b }
            if (r2 == 0) goto L_0x0029
            java.lang.String r3 = "^\\s*\\/\\/.*"
            boolean r3 = r2.matches(r3)     // Catch:{ Exception -> 0x003b }
            if (r3 != 0) goto L_0x0029
            r1.append(r2)     // Catch:{ Exception -> 0x003b }
        L_0x0029:
            if (r2 != 0) goto L_0x0018
            r5.close()     // Catch:{ Exception -> 0x003b }
            r4.close()     // Catch:{ Exception -> 0x003b }
            java.lang.String r5 = r1.toString()     // Catch:{ Exception -> 0x003b }
            if (r4 == 0) goto L_0x003a
            r4.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            return r5
        L_0x003b:
            r5 = move-exception
            goto L_0x0041
        L_0x003d:
            r5 = move-exception
            goto L_0x0050
        L_0x003f:
            r5 = move-exception
            r4 = r0
        L_0x0041:
            java.lang.String r1 = "BridgeUtil"
            java.lang.String r2 = "load from assets"
            android.util.Log.w(r1, r2, r5)     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x004d
            r4.close()     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            return r0
        L_0x004e:
            r5 = move-exception
            r0 = r4
        L_0x0050:
            if (r0 == 0) goto L_0x0055
            r0.close()     // Catch:{ IOException -> 0x0055 }
        L_0x0055:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.jsbridge.C40666b.m160676a(android.content.Context, java.lang.String):java.lang.String");
    }
}
