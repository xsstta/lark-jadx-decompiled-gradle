package com.tt.refer.impl.business.file;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/tt/refer/impl/business/file/TTFileError;", "", "code", "", "(I)V", "getCode", "()I", "toString", "", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.impl.business.file.i */
public class TTFileError {

    /* renamed from: h */
    public static final TTFileError f171106h = new TTFileError(UpdateDialogStatusCode.DISMISS);

    /* renamed from: i */
    public static final TTFileError f171107i = new TTFileError(UpdateDialogStatusCode.SHOW);

    /* renamed from: j */
    public static final TTFileError f171108j = new TTFileError(10003);

    /* renamed from: k */
    public static final TTFileError f171109k = new TTFileError(10004);

    /* renamed from: l */
    public static final TTFileError f171110l = new TTFileError(10005);

    /* renamed from: m */
    public static final TTFileError f171111m = new TTFileError(10006);

    /* renamed from: n */
    public static final TTFileError f171112n = new TTFileError(10007);

    /* renamed from: o */
    public static final TTFileError f171113o = new TTFileError(10008);

    /* renamed from: p */
    public static final TTFileError f171114p = new TTFileError(10009);

    /* renamed from: q */
    public static final TTFileError f171115q = new TTFileError(10010);

    /* renamed from: r */
    public static final TTFileError f171116r = new TTFileError(10011);

    /* renamed from: s */
    public static final TTFileError f171117s = new TTFileError(10012);

    /* renamed from: t */
    public static final TTFileError f171118t = new TTFileError(10013);

    /* renamed from: u */
    public static final TTFileError f171119u = new TTFileError(10014);

    /* renamed from: v */
    public static final TTFileError f171120v = new TTFileError(10015);

    /* renamed from: w */
    public static final TTFileError f171121w = new TTFileError(10016);

    /* renamed from: x */
    public static final Companion f171122x = new Companion(null);

    /* renamed from: a */
    private final int f171123a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tt/refer/impl/business/file/TTFileError$Companion;", "", "()V", "ALREADY_EXISTS", "Lcom/tt/refer/impl/business/file/TTFileError;", "BIZ_ERROR", "CANNOT_OPERATE_PATH_AND_SUBPATH", "CANNOT_READ", "CANNOT_WRITE", "DECRYPT_ERROR", "DIR_NOT_EMPTY", "ENCRYPT_ERROR", "INVALID_PARAM", "NOT_DIR", "NOT_EXISTS", "NOT_FILE", "OVER_READ_THRESHOLD", "OVER_SIZE_LIMIT", "PARENT_NOT_EXISTS", "SYSTEM_ERROR", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.file.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo235661a() {
        return this.f171123a;
    }

    public String toString() {
        return "TTFileError(code=" + this.f171123a + ')';
    }

    public TTFileError(int i) {
        this.f171123a = i;
    }
}
