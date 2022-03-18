package com.ss.ugc.effectplatform.model.algorithm;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ugc.effectplatform.EffectPlatformEncryptor;
import com.ss.ugc.effectplatform.IEffectPlatformEncryptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0017\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\u00038VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016¨\u0006%"}, d2 = {"Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;", "", "_name", "", "name_sec", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "file_url", "Lcom/ss/ugc/effectplatform/model/algorithm/ExtendedUrlModel;", "totalSize", "", ShareHitPoint.f121869d, "", UpdateKey.STATUS, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/ugc/effectplatform/model/algorithm/ExtendedUrlModel;JII)V", "getFile_url", "()Lcom/ss/ugc/effectplatform/model/algorithm/ExtendedUrlModel;", "setFile_url", "(Lcom/ss/ugc/effectplatform/model/algorithm/ExtendedUrlModel;)V", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getName_sec", "setName_sec", "getStatus", "()I", "setStatus", "(I)V", "getTotalSize", "()J", "setTotalSize", "(J)V", "getType", "setType", "getVersion", "setVersion", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
public class ModelInfo {
    private String _name;
    private ExtendedUrlModel file_url;
    private String name;
    private String name_sec;
    private int status;
    private long totalSize;
    private int type;
    private String version;

    public ModelInfo() {
        this(null, null, null, null, 0, 0, 0, SmActions.ACTION_ONTHECALL_ENTRY, null);
    }

    public ExtendedUrlModel getFile_url() {
        return this.file_url;
    }

    public String getName_sec() {
        return this.name_sec;
    }

    public int getStatus() {
        return this.status;
    }

    public long getTotalSize() {
        return this.totalSize;
    }

    public int getType() {
        return this.type;
    }

    public String getVersion() {
        return this.version;
    }

    public String getName() {
        String str;
        if (StringsKt.isBlank(this._name) && (!StringsKt.isBlank(getName_sec()))) {
            IEffectPlatformEncryptor a = EffectPlatformEncryptor.f164860a.mo227729a();
            if (a == null || (str = a.mo207361a(getName_sec())) == null) {
                str = "";
            }
            this._name = str;
        }
        if (StringsKt.isBlank(this._name)) {
            return this.name;
        }
        return this._name;
    }

    public void setFile_url(ExtendedUrlModel extendedUrlModel) {
        this.file_url = extendedUrlModel;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTotalSize(long j) {
        this.totalSize = j;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.name = str;
    }

    public void setName_sec(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.name_sec = str;
    }

    public void setVersion(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.version = str;
    }

    public ModelInfo(String str, String str2, String str3, ExtendedUrlModel extendedUrlModel, long j, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "_name");
        Intrinsics.checkParameterIsNotNull(str2, "name_sec");
        Intrinsics.checkParameterIsNotNull(str3, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        this._name = str;
        this.name_sec = str2;
        this.version = str3;
        this.file_url = extendedUrlModel;
        this.totalSize = j;
        this.type = i;
        this.status = i2;
        this.name = "";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ModelInfo(java.lang.String r9, java.lang.String r10, java.lang.String r11, com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel r12, long r13, int r15, int r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r8 = this;
            r0 = r17 & 1
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0008
            r0 = r1
            goto L_0x0009
        L_0x0008:
            r0 = r9
        L_0x0009:
            r2 = r17 & 2
            if (r2 == 0) goto L_0x000f
            r2 = r1
            goto L_0x0010
        L_0x000f:
            r2 = r10
        L_0x0010:
            r3 = r17 & 4
            if (r3 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r1 = r11
        L_0x0016:
            r3 = r17 & 8
            if (r3 == 0) goto L_0x001e
            r3 = 0
            com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel r3 = (com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel) r3
            goto L_0x001f
        L_0x001e:
            r3 = r12
        L_0x001f:
            r4 = r17 & 16
            if (r4 == 0) goto L_0x0026
            r4 = 0
            goto L_0x0027
        L_0x0026:
            r4 = r13
        L_0x0027:
            r6 = r17 & 32
            if (r6 == 0) goto L_0x002d
            r6 = 0
            goto L_0x002e
        L_0x002d:
            r6 = r15
        L_0x002e:
            r7 = r17 & 64
            if (r7 == 0) goto L_0x0034
            r7 = 1
            goto L_0x0036
        L_0x0034:
            r7 = r16
        L_0x0036:
            r9 = r8
            r10 = r0
            r11 = r2
            r12 = r1
            r13 = r3
            r14 = r4
            r16 = r6
            r17 = r7
            r9.<init>(r10, r11, r12, r13, r14, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.algorithm.ModelInfo.<init>(java.lang.String, java.lang.String, java.lang.String, com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel, long, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
