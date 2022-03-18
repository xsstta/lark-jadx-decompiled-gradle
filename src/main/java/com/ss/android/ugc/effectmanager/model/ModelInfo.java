package com.ss.android.ugc.effectmanager.model;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\n\u00100\u001a\u0004\u0018\u00010\u0015H\u0016R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\r8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00158V@VX\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00158V@VX\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u001e8V@VX\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020$8V@VX\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010*\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u001e8V@VX\u000e¢\u0006\f\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R$\u0010-\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00158V@VX\u000e¢\u0006\f\u001a\u0004\b.\u0010\u0018\"\u0004\b/\u0010\u001a¨\u00061"}, d2 = {"Lcom/ss/android/ugc/effectmanager/model/ModelInfo;", "Lcom/ss/android/ugc/effectmanager/model/ModelInfoTemplate;", "Ljava/io/Serializable;", "kModelInfo", "Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;", "(Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;)V", "value", "Lcom/ss/android/ugc/effectmanager/model/ExtendedUrlModel;", "fileUrl", "getFileUrl", "()Lcom/ss/android/ugc/effectmanager/model/ExtendedUrlModel;", "setFileUrl", "(Lcom/ss/android/ugc/effectmanager/model/ExtendedUrlModel;)V", "Lcom/ss/ugc/effectplatform/model/algorithm/ExtendedUrlModel;", "file_url", "getFile_url", "()Lcom/ss/ugc/effectplatform/model/algorithm/ExtendedUrlModel;", "setFile_url", "(Lcom/ss/ugc/effectplatform/model/algorithm/ExtendedUrlModel;)V", "getKModelInfo", "()Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name_sec", "getName_sec", "setName_sec", "", UpdateKey.STATUS, "getStatus", "()I", "setStatus", "(I)V", "", "totalSize", "getTotalSize", "()J", "setTotalSize", "(J)V", ShareHitPoint.f121869d, "getType", "setType", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "getVersion", "setVersion", "getMD5", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ModelInfo extends ModelInfoTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo;

    public ModelInfo() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.model.ModelInfoTemplate
    public com.ss.ugc.effectplatform.model.algorithm.ModelInfo getKModelInfo() {
        return this.kModelInfo;
    }

    @Override // com.ss.android.ugc.effectmanager.model.ModelInfoTemplate
    public ExtendedUrlModel getFileUrl() {
        return super.getFileUrl();
    }

    @Override // com.ss.android.ugc.effectmanager.model.ModelInfoTemplate
    public String getMD5() {
        return super.getMD5();
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public int getStatus() {
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            return kModelInfo2.getStatus();
        }
        return super.getStatus();
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public long getTotalSize() {
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            return kModelInfo2.getTotalSize();
        }
        return super.getTotalSize();
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public int getType() {
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            return kModelInfo2.getType();
        }
        return super.getType();
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public ExtendedUrlModel getFile_url() {
        ExtendedUrlModel file_url;
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 == null || (file_url = kModelInfo2.getFile_url()) == null) {
            return super.getFile_url();
        }
        return file_url;
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public String getName() {
        String name;
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 == null || (name = kModelInfo2.getName()) == null) {
            return super.getName();
        }
        return name;
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public String getName_sec() {
        String name_sec;
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 == null || (name_sec = kModelInfo2.getName_sec()) == null) {
            return super.getName_sec();
        }
        return name_sec;
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public String getVersion() {
        String version;
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 == null || (version = kModelInfo2.getVersion()) == null) {
            return super.getVersion();
        }
        return version;
    }

    @Override // com.ss.android.ugc.effectmanager.model.ModelInfoTemplate
    public void setFileUrl(ExtendedUrlModel extendedUrlModel) {
        super.setFileUrl(extendedUrlModel);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public void setFile_url(ExtendedUrlModel extendedUrlModel) {
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            kModelInfo2.setFile_url(extendedUrlModel);
        }
        super.setFile_url(extendedUrlModel);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public void setStatus(int i) {
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            kModelInfo2.setStatus(i);
        }
        super.setStatus(i);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public void setTotalSize(long j) {
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            kModelInfo2.setTotalSize(j);
        }
        super.setTotalSize(j);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public void setType(int i) {
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            kModelInfo2.setType(i);
        }
        super.setType(i);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public void setName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            kModelInfo2.setName(str);
        }
        super.setName(str);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public void setName_sec(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            kModelInfo2.setName_sec(str);
        }
        super.setName_sec(str);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public void setVersion(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            kModelInfo2.setVersion(str);
        }
        super.setVersion(str);
    }

    public ModelInfo(com.ss.ugc.effectplatform.model.algorithm.ModelInfo modelInfo) {
        super(modelInfo);
        this.kModelInfo = modelInfo;
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            ExtendedUrlModel file_url = kModelInfo2.getFile_url();
            if (file_url != null) {
                super.setFile_url(file_url);
            }
            String name = kModelInfo2.getName();
            if (name != null) {
                super.setName(name);
            }
            String name_sec = kModelInfo2.getName_sec();
            if (name_sec != null) {
                super.setName_sec(name_sec);
            }
            super.setStatus(kModelInfo2.getStatus());
            super.setTotalSize(kModelInfo2.getTotalSize());
            super.setType(kModelInfo2.getType());
            String version = kModelInfo2.getVersion();
            if (version != null) {
                super.setVersion(version);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ModelInfo(com.ss.ugc.effectplatform.model.algorithm.ModelInfo modelInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : modelInfo);
    }
}
