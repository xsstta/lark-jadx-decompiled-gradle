package com.tt.refer.impl.business.file;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tt/refer/impl/business/file/TTBizError;", "Lcom/tt/refer/impl/business/file/TTFileError;", "code", "", "(I)V", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.impl.business.file.f */
public final class TTBizError extends TTFileError {

    /* renamed from: a */
    public static final TTBizError f171092a = new TTBizError(UpdateDialogStatusCode.DISMISS);

    /* renamed from: b */
    public static final TTBizError f171093b = new TTBizError(UpdateDialogStatusCode.SHOW);

    /* renamed from: c */
    public static final TTBizError f171094c = new TTBizError(10003);

    /* renamed from: d */
    public static final TTBizError f171095d = new TTBizError(10004);

    /* renamed from: e */
    public static final TTBizError f171096e = new TTBizError(10005);

    /* renamed from: f */
    public static final TTBizError f171097f = new TTBizError(10006);

    /* renamed from: g */
    public static final Companion f171098g = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tt/refer/impl/business/file/TTBizError$Companion;", "", "()V", "DATA_IS_NULL", "Lcom/tt/refer/impl/business/file/TTBizError;", "DIR_EMPTY", "EXTRACT_EXCEPTION", "INVALID_TTFILE", "LOGIC_ERROR", "ZIP_EXCEPTION", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.file.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public TTBizError(int i) {
        super(i);
    }
}
