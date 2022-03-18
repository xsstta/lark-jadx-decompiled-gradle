package com.bytedance.ee.bear.drive.loader.download.platform.processor.misc;

import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7043e;
import com.bytedance.ee.bear.drive.loader.download.platform.api.C7072f;
import com.bytedance.ee.bear.drive.loader.model.DriveException;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.huawei.hms.support.api.entity.core.CommonCode;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.processor.misc.a */
public class C7084a {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static DriveException m28226a(AbstractC7043e eVar, AbstractC6949c cVar, Throwable th, boolean z) {
        if (eVar != null) {
            int a = eVar.mo27603a();
            if (a == 9) {
                return new DriveException(ErrCode.REQUEST_TRANSFORM_FILE_ENCRYPTION);
            }
            if (a != 10) {
                switch (a) {
                    case 1:
                    case 2:
                        ErrCode errCode = ErrCode.REQUEST_TRANSFORM_CANCEL_EXP;
                        return new DriveException(errCode, "preview url server state error, status= " + a + " ext= " + cVar.mo27373c(), cVar);
                    case 3:
                        ErrCode errCode2 = ErrCode.REQUEST_TRANSFORM_SERVER_EXP;
                        return new DriveException(errCode2, "preview url server state error, status= " + a + " ext= " + cVar.mo27373c(), cVar);
                    case 4:
                        break;
                    case 5:
                        return new DriveException(ErrCode.DRIVE_FILE_OVER_SIZE);
                    case 6:
                        return new DriveException(ErrCode.DRIVE_FILE_ZERO_SIZE);
                    default:
                        switch (a) {
                            case CommonCode.StatusCode.API_CLIENT_EXPIRED /*{ENCODED_INT: 1001}*/:
                            case 1002:
                            case 1003:
                                break;
                            default:
                                ErrCode errCode3 = ErrCode.REQUEST_TRANSFORM_UNKNOW_EXP;
                                return new DriveException(errCode3, "unknown url server state error, status= " + a + " ext= " + cVar.mo27373c(), cVar);
                        }
                }
            }
            return new DriveException(ErrCode.DRIVE_FILE_NOT_SUPPORT_PREVIEW);
        } else if (z) {
            return new DriveException(ErrCode.REQUEST_TRANSFORM_SHUTDOWN_EXP, "processor is shutdown. ", th, cVar);
        } else {
            if (C7072f.m28122a(th)) {
                return new DriveException(ErrCode.NO_NETWORK, th);
            }
            return new DriveException(ErrCode.REQUEST_PREVIEW_URL_EXP, th);
        }
    }
}
