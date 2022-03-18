package com.bytedance.ee.falcon.inspector.network;

import android.content.Context;
import android.util.Base64OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.falcon.inspector.network.n */
public class C12685n {

    /* renamed from: a */
    private final Context f33939a;

    /* renamed from: b */
    private final Map<String, AbstractC12664a> f33940b = Collections.synchronizedMap(new HashMap());

    public C12685n(Context context) {
        this.f33939a = context;
    }

    /* renamed from: a */
    private static String m52550a(String str) {
        return "network-response-body-" + str;
    }

    /* renamed from: a */
    public OutputStream mo48072a(String str, boolean z) throws IOException {
        FileOutputStream openFileOutput = this.f33939a.openFileOutput(m52550a(str), 0);
        openFileOutput.write(z ? 1 : 0);
        if (z) {
            return new Base64OutputStream(openFileOutput, 0);
        }
        return openFileOutput;
    }

    /* renamed from: a */
    public void mo48073a(String str, AbstractC12664a aVar) {
        if (this.f33940b.put(str, aVar) != null) {
            throw new IllegalArgumentException("cannot associate different pretty printers with the same request id: " + str);
        }
    }
}
