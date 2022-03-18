package com.ss.android.lark.fastqrcode.p1833c;

import com.ss.android.lark.fastqrcode.C37051b;

/* renamed from: com.ss.android.lark.fastqrcode.c.a */
public class C37056a {

    /* renamed from: a */
    private static AbstractC37057a f95203a;

    /* renamed from: com.ss.android.lark.fastqrcode.c.a$a */
    public interface AbstractC37057a {
        /* renamed from: a */
        void mo136579a();

        /* renamed from: a */
        void mo136580a(int i);

        /* renamed from: a */
        void mo136581a(long j);

        /* renamed from: b */
        void mo136582b(long j);

        /* renamed from: c */
        void mo136583c(long j);

        /* renamed from: d */
        void mo136584d(long j);

        /* renamed from: e */
        void mo136585e(long j);
    }

    /* renamed from: a */
    public static void m146160a() {
        C37051b.m146151b("QRCodeStatistics", "sendOnOpen");
        AbstractC37057a aVar = f95203a;
        if (aVar != null) {
            aVar.mo136579a();
        }
    }

    /* renamed from: a */
    public static void m146163a(AbstractC37057a aVar) {
        f95203a = aVar;
    }

    /* renamed from: a */
    public static void m146161a(int i) {
        C37051b.m146151b("QRCodeStatistics", "sendSuccessFrameCount = " + i);
        AbstractC37057a aVar = f95203a;
        if (aVar != null) {
            aVar.mo136580a(i);
        }
    }

    /* renamed from: b */
    public static void m146164b(long j) {
        C37051b.m146151b("QRCodeStatistics", "sendSuccessDetectTimeConsuming = " + j);
        AbstractC37057a aVar = f95203a;
        if (aVar != null) {
            aVar.mo136582b(j);
        }
    }

    /* renamed from: c */
    public static void m146165c(long j) {
        C37051b.m146151b("QRCodeStatistics", "sendSuccessParseFromPicTimeConsuming = " + j);
        AbstractC37057a aVar = f95203a;
        if (aVar != null) {
            aVar.mo136583c(j);
        }
    }

    /* renamed from: d */
    public static void m146166d(long j) {
        C37051b.m146151b("QRCodeStatistics", "sendCoreAlgorithmSuccessParseTimeConsuming = " + j);
        AbstractC37057a aVar = f95203a;
        if (aVar != null) {
            aVar.mo136584d(j);
        }
    }

    /* renamed from: e */
    public static void m146167e(long j) {
        C37051b.m146151b("QRCodeStatistics", "sendFirstFrameCost = " + j);
        AbstractC37057a aVar = f95203a;
        if (aVar != null) {
            aVar.mo136585e(j);
        }
    }

    /* renamed from: a */
    public static void m146162a(long j) {
        C37051b.m146151b("QRCodeStatistics", "sendSuccessScanTimeConsuming = " + j);
        AbstractC37057a aVar = f95203a;
        if (aVar != null) {
            aVar.mo136581a(j);
        }
    }
}
