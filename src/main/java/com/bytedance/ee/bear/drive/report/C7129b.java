package com.bytedance.ee.bear.drive.report;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7557g;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.drive.report.b */
public class C7129b {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m28574a(C6937b bVar, C7130c cVar, C7128a aVar, C7557g gVar) {
        if (gVar != null) {
            try {
                m28576a(gVar, C7130c.m28587b(bVar.getFileModel()), cVar, aVar, bVar);
            } catch (Exception e) {
                C13479a.m54761a("DRIVE_PREVIEW_FLOW", e);
            }
        }
    }

    /* renamed from: a */
    public static void m28575a(C7555f fVar, C6937b bVar, C7130c cVar, C7128a aVar) {
        if (fVar != null && cVar != null && aVar != null && bVar != null) {
            fVar.liveInnerReportMsg().mo28017a(new AbstractC1178x(cVar, aVar) {
                /* class com.bytedance.ee.bear.drive.report.$$Lambda$b$jIoyxK6kb5yUhBqQf1j6h89ch3k */
                public final /* synthetic */ C7130c f$1;
                public final /* synthetic */ C7128a f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    C7129b.m28574a(C6937b.this, this.f$1, this.f$2, (C7557g) obj);
                }
            });
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02d0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m28576a(com.bytedance.ee.bear.drive.view.preview.wrapper.C7557g r19, com.bytedance.ee.bear.drive.report.C7130c.C7132a r20, com.bytedance.ee.bear.drive.report.C7130c r21, com.bytedance.ee.bear.drive.report.C7128a r22, com.bytedance.ee.bear.drive.core.C6937b r23) {
        /*
        // Method dump skipped, instructions count: 904
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.report.C7129b.m28576a(com.bytedance.ee.bear.drive.view.preview.wrapper.g, com.bytedance.ee.bear.drive.report.c$a, com.bytedance.ee.bear.drive.report.c, com.bytedance.ee.bear.drive.report.a, com.bytedance.ee.bear.drive.core.b):void");
    }
}
