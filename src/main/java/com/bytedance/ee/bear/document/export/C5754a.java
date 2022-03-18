package com.bytedance.ee.bear.document.export;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

/* renamed from: com.bytedance.ee.bear.document.export.a */
public class C5754a {
    /* renamed from: b */
    private static int m23244b(int i) {
        return i != 3 ? i != 4 ? i != 9004 ? i != 9012 ? i != 9013 ? R.string.Doc_Document_ExportError : R.string.Doc_Document_ExportUnit : R.string.Doc_Document_ExportClose : R.string.Doc_Document_ExportOverSize : R.string.Doc_Document_ExportServerNoPermission : R.string.Doc_Document_ExportErrorNone;
    }

    /* renamed from: c */
    private static int m23245c(int i) {
        if (i == 107) {
            return R.string.CreationMobile_DocX_export_failed_TooLarge;
        }
        if (i == 126) {
            return R.string.CreationMobile_export_export_unit;
        }
        if (i == 1002) {
            return R.string.CreationMobile_DocX_export_failed_NoPermission;
        }
        if (i == 1004) {
            return R.string.CreationMobile_Docs_duplicate_inProgress_toast;
        }
        if (i == 1006) {
            return R.string.CreationMobile_DocX_export_failed_deleted;
        }
        if (i == 1014) {
            return R.string.CreationMobile_Docs_duplicate_inProgress_toast;
        }
        if (i == 1016) {
            return R.string.CreationMobile_export_export_unit;
        }
        if (i == 6000) {
            return R.string.CreationMobile_Docs_duplicate_inProgress_toast;
        }
        if (i == 123) {
            return R.string.CreationMobile_DocX_export_failed_deleted;
        }
        if (i == 124) {
            return R.string.CreationMobile_Docs_duplicate_inProgress_toast;
        }
        switch (i) {
            case SmEvents.EVENT_NR /*{ENCODED_INT: 109}*/:
            case SmEvents.EVENT_NE_RR /*{ENCODED_INT: 112}*/:
                return R.string.CreationMobile_Docs_duplicate_inProgress_toast;
            case SmEvents.EVENT_NO /*{ENCODED_INT: 110}*/:
                return R.string.CreationMobile_DocX_export_failed_NoPermission;
            case SmEvents.EVENT_NT /*{ENCODED_INT: 111}*/:
                return R.string.CreationMobile_DocX_export_failed_deleted;
            default:
                return R.string.CreationMobile_export_failed_retry;
        }
    }

    /* renamed from: a */
    public static int m23243a(int i) {
        if (C4211a.m17514a().mo16536a("ccm.suite.export_replace_api_enabled", false)) {
            return m23245c(i);
        }
        return m23244b(i);
    }
}
