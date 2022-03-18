package com.bytedance.ee.bear.drive.biz.importfile.p328b;

import android.text.TextUtils;
import com.bytedance.ee.bear.drive.biz.importfile.C6475b;
import com.bytedance.ee.bear.drive.biz.importfile.exception.DriveCannotImportBySizeException;
import com.bytedance.ee.bear.drive.biz.importfile.exception.DriveCannotImportByTypeException;
import com.bytedance.ee.bear.drive.biz.importfile.exception.DriveFailedImportCanSupportException;
import com.bytedance.ee.bear.drive.biz.importfile.exception.DriveNoImportPermissionException;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.biz.importfile.b.a */
public class C6476a {
    /* renamed from: a */
    public static boolean m26021a(int i) {
        return C6475b.m26017a(i);
    }

    /* renamed from: b */
    public static int m26023b(int i) {
        return C6475b.m26018b(i);
    }

    /* renamed from: a */
    public static int m26019a(String str) {
        C13479a.m54764b("ImportTypeUtil", "canImport starting...");
        return C6475b.m26016a(str);
    }

    /* renamed from: a */
    public static boolean m26022a(C7086a aVar) {
        if (aVar == null || m26019a(aVar.mo27322a().mo27358a()) < 101) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static int m26024b(C7086a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.mo27322a().mo27358a())) {
            return R.string.Doc_Facade_ImportAsDoc;
        }
        int a = m26019a(aVar.mo27322a().mo27358a());
        if (a == 102) {
            return R.string.Doc_Facade_ImportAsSheet;
        }
        if (a != 103) {
            return R.string.Doc_Facade_ImportAsDoc;
        }
        return R.string.Doc_Facade_ImportAsMindnote;
    }

    /* renamed from: a */
    public static int m26020a(Throwable th) {
        if (th instanceof DriveFailedImportCanSupportException) {
            ErrCode errCode = ((DriveFailedImportCanSupportException) th).getErrCode();
            if (errCode != ErrCode.FILE_NOT_FOUND) {
                if (errCode == ErrCode.PERMISSION_DENIED) {
                    return -2;
                }
                if (errCode == ErrCode.POLICY_DENIED) {
                    return -5;
                }
                if (errCode == ErrCode.OWNER_DELETED_FILE) {
                    return -4;
                }
                if (!(errCode == ErrCode.COPY_FAILED || errCode == ErrCode.COPY_TIMEOUT)) {
                    return -7;
                }
            }
            return -3;
        } else if (th instanceof DriveCannotImportBySizeException) {
            return -6;
        } else {
            if (!(th instanceof DriveCannotImportByTypeException) && (th instanceof DriveNoImportPermissionException)) {
                return -1;
            }
            return -7;
        }
    }

    /* renamed from: b */
    public static AbstractC68307f<Boolean> m26025b(String str) {
        C13479a.m54764b("ImportTypeUtil", "checkPermission");
        return ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36638a().mo36649b(str, C8275a.f22375h.mo32555b()).mo238020d($$Lambda$nlYPP9WIhcQ4rJyvJ_986aZptJk.INSTANCE);
    }
}
