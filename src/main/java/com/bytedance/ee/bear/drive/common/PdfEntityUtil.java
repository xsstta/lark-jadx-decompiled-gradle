package com.bytedance.ee.bear.drive.common;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.drive.view.preview.pdf.C7413a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import java.io.Serializable;

public class PdfEntityUtil {

    public static class SimplePdfExtra implements Serializable {
        private int pages_num;

        public int getPagesNum() {
            return this.pages_num;
        }

        public void setPagesNum(int i) {
            this.pages_num = i;
        }
    }

    /* renamed from: a */
    private static String m27191a(C7553d dVar) {
        try {
            if (C13657b.m55422a(dVar.mo29487f())) {
                return "";
            }
            return dVar.mo29487f().values().iterator().next();
        } catch (Exception e) {
            C13479a.m54761a("DRIVE_PREVIEW_FLOW", e);
            return "";
        }
    }

    /* renamed from: a */
    public static boolean m27193a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            boolean booleanValue = JSON.parseObject(str).getBooleanValue("is_limited");
            C13479a.m54764b("PdfEntityUtil", "getIsLimit: " + booleanValue);
            return booleanValue;
        } catch (Exception e) {
            C13479a.m54761a("PdfEntityUtil", e);
            return false;
        }
    }

    /* renamed from: a */
    public static void m27192a(C7413a aVar, C7553d dVar) {
        if (aVar == null || dVar == null) {
            C13479a.m54758a("PdfEntityUtil", "pdfEntityData or fileModel is null");
            return;
        }
        aVar.mo28940a(dVar.mo29493l());
        aVar.mo28944c(dVar.mo29494m());
        aVar.mo28939a(dVar.mo29485e());
        aVar.mo28946d(dVar.mo29480c());
        aVar.mo28942b(m27191a(dVar));
        aVar.mo28943b(m27193a(dVar.mo29489h()));
    }
}
