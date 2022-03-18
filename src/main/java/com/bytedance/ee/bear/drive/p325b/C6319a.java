package com.bytedance.ee.bear.drive.p325b;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.ee.bear.drive.biz.importfile.DriveImportFileActivity;
import com.bytedance.ee.bear.drive.biz.importfile.DriveImportFileMainProcActivity;
import com.bytedance.ee.bear.drive.biz.upload.error.DriveUploadErrorTipsActivity;
import com.bytedance.ee.bear.drive.biz.upload.error.DriveUploadErrorTipsMainProcActivity;
import com.bytedance.ee.bear.drive.biz.versions.VersionOperationRecordActivity;
import com.bytedance.ee.bear.drive.biz.versions.VersionOperationRecordMainProcActivity;
import com.bytedance.ee.bear.drive.importfile.ImportFileEntity;
import com.bytedance.ee.bear.drive.test.DriveTestActivity;
import com.bytedance.ee.bear.drive.test.DriveTestMainProcActivity;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p699b.C13595b;

/* renamed from: com.bytedance.ee.bear.drive.b.a */
public final class C6319a {
    /* renamed from: a */
    public static void m25390a(Context context, int i) {
        Class cls;
        if (C13595b.m55176a()) {
            cls = DriveUploadErrorTipsMainProcActivity.class;
        } else {
            cls = DriveUploadErrorTipsActivity.class;
        }
        Intent intent = new Intent(context, cls);
        intent.putExtra("drive_upload_error", i);
        if (context instanceof Application) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m25391a(Context context, Bundle bundle) {
        Class cls;
        try {
            if (C13595b.m55176a()) {
                cls = DriveTestMainProcActivity.class;
            } else {
                cls = DriveTestActivity.class;
            }
            Intent intent = new Intent(context, cls);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            if (context instanceof Application) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        } catch (Exception e) {
            C13479a.m54759a("DriveRouteHelper", "openDriveTestActivity: ", e);
        }
    }

    /* renamed from: a */
    public static void m25392a(Context context, ImportFileEntity importFileEntity) {
        Class cls;
        if (C13595b.m55176a()) {
            cls = DriveImportFileMainProcActivity.class;
        } else {
            cls = DriveImportFileActivity.class;
        }
        Intent intent = new Intent(context, cls);
        intent.putExtra("extra_drive_file_open_entity", importFileEntity);
        if (context instanceof Application) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m25393a(Context context, String str, String str2, String str3) {
        Class cls;
        if (C13595b.m55176a()) {
            cls = VersionOperationRecordMainProcActivity.class;
        } else {
            cls = VersionOperationRecordActivity.class;
        }
        Intent intent = new Intent(context, cls);
        intent.putExtra("extra_obj_token", str);
        intent.putExtra("extra_file_name", str2);
        intent.putExtra("extra_launch_version", str3);
        if (context instanceof Application) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }
}
