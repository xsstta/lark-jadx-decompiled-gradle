package com.bytedance.ee.bear.doc.resupdate;

import android.content.Context;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.io.C13683i;
import com.larksuite.suite.R;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bytedance.ee.bear.doc.resupdate.d */
public class C5453d implements AbstractC5467g {
    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5467g
    /* renamed from: a */
    public String mo21825a() {
        return "eesz";
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5467g
    /* renamed from: a */
    public File mo21824a(Context context) {
        String str;
        String string = context.getString(R.string.config_gecko_channel);
        try {
            C5487q c = C5483n.m22268c(context);
            String a = c.mo21917a();
            File a2 = C5483n.m22255a(context, string);
            if (c.mo21921b()) {
                str = "_sim";
            } else {
                str = "";
            }
            File file = new File(a2, a + str);
            if (!file.exists()) {
                File file2 = new File(a2, a + "_" + System.currentTimeMillis() + "_" + "_temp");
                file2.mkdir();
                C13683i.m55566a(context, "eesz.zip", new File(file2, "eesz").getAbsolutePath(), true);
                if (file.exists()) {
                    C13479a.m54764b("DocsDefaultResourceImp", "getResource(): destParentFile exists() after unzip delete temp file , destParentFile= " + file);
                    C13675f.m55498a(file2);
                } else {
                    boolean renameTo = file2.renameTo(file);
                    C13479a.m54764b("DocsDefaultResourceImp", "getResource(): rename result = " + renameTo);
                }
            } else {
                C13479a.m54764b("DocsDefaultResourceImp", "getResource(): destParentFile exists()");
            }
            File file3 = new File(file, "eesz");
            C13479a.m54764b("DocsDefaultResourceImp", "getResource(): file " + file3 + ",isSim = " + c.mo21921b());
            return file3;
        } catch (IOException e) {
            C13479a.m54759a("DocsDefaultResourceImp", "docs getResource(): failed ", e);
            return null;
        }
    }
}
