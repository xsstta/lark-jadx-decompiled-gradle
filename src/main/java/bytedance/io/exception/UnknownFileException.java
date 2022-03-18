package bytedance.io.exception;

public class UnknownFileException extends Exception {
    public UnknownFileException() {
    }

    public UnknownFileException(String str) {
        super(str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private UnknownFileException(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            if (r4 != 0) goto L_0x000d
            java.lang.String r3 = ""
            goto L_0x0023
        L_0x000d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = " ("
            r3.append(r1)
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x0023:
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bytedance.io.exception.UnknownFileException.<init>(java.lang.String, java.lang.String):void");
    }
}
