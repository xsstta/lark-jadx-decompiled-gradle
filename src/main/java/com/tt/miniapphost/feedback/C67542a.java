package com.tt.miniapphost.feedback;

import com.tt.miniapp.feedback.screenrecord.C66166c;

/* renamed from: com.tt.miniapphost.feedback.a */
public class C67542a {
    /* renamed from: a */
    private static AbstractC67544b m262699a() {
        return C67543a.f170353a;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapphost.feedback.a$a */
    public static class C67543a {

        /* renamed from: a */
        public static AbstractC67544b f170353a = m262702a();

        /* renamed from: a */
        private static AbstractC67544b m262702a() {
            return new C66166c();
        }
    }

    /* renamed from: a */
    public static void m262700a(IFeedbackRecordCallback iFeedbackRecordCallback) {
        if (m262699a() != null) {
            m262699a().mo231476a(iFeedbackRecordCallback);
        }
    }

    /* renamed from: b */
    public static void m262701b(IFeedbackRecordCallback iFeedbackRecordCallback) {
        if (m262699a() != null) {
            m262699a().mo231477b(iFeedbackRecordCallback);
        }
    }
}
