package com.bytedance.ee.bear.drive.biz.preview.show;

import com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.drive.biz.preview.show.a */
public class C6712a {
    /* renamed from: a */
    public static void m26463a(C7555f fVar, AbstractC7549a aVar) {
        if (fVar == null) {
            C13479a.m54758a("DrivePreviewShowStatus", "onShowStart preview viewModel is null: " + aVar.getClass().getSimpleName());
            return;
        }
        fVar.liveInnerPreviewShowStatus().mo5926a((Integer) 1);
    }

    /* renamed from: b */
    public static void m26464b(C7555f fVar, AbstractC7549a aVar) {
        if (fVar == null) {
            C13479a.m54758a("DrivePreviewShowStatus", "showSuccess preview viewModel is null: " + aVar.getClass().getSimpleName());
            return;
        }
        fVar.liveInnerPreviewShowStatus().mo5926a((Integer) 2);
    }

    /* renamed from: c */
    public static void m26465c(C7555f fVar, AbstractC7549a aVar) {
        if (fVar == null) {
            C13479a.m54758a("DrivePreviewShowStatus", "showFailed preview viewModel is null: " + aVar.getClass().getSimpleName());
            return;
        }
        fVar.liveInnerPreviewShowStatus().mo5926a((Integer) 3);
    }
}
