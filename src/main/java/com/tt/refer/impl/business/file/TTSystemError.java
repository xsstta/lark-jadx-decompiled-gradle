package com.tt.refer.impl.business.file;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tt/refer/impl/business/file/TTSystemError;", "Lcom/tt/refer/impl/business/file/TTFileError;", "code", "", "(I)V", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.impl.business.file.k */
public final class TTSystemError extends TTFileError {

    /* renamed from: a */
    public static final TTSystemError f171128a = new TTSystemError(UpdateDialogStatusCode.DISMISS);

    /* renamed from: b */
    public static final TTSystemError f171129b = new TTSystemError(UpdateDialogStatusCode.SHOW);

    /* renamed from: c */
    public static final Companion f171130c = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/tt/refer/impl/business/file/TTSystemError$Companion;", "", "()V", "CANNOT_DELETE", "Lcom/tt/refer/impl/business/file/TTSystemError;", "IO_EXCEPTION", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.file.k$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public TTSystemError(int i) {
        super(i);
    }
}
