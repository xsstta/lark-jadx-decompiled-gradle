package com.ss.android.ugc.effectmanager.model;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R*\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00058V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/effectmanager/model/ModelInfoTemplate;", "Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;", "kModelInfo", "(Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;)V", "value", "Lcom/ss/android/ugc/effectmanager/model/ExtendedUrlModel;", "fileUrl", "getFileUrl", "()Lcom/ss/android/ugc/effectmanager/model/ExtendedUrlModel;", "setFileUrl", "(Lcom/ss/android/ugc/effectmanager/model/ExtendedUrlModel;)V", "getKModelInfo", "()Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;", "getMD5", "", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.model.d */
public class ModelInfoTemplate extends ModelInfo {
    private ExtendedUrlModel fileUrl;
    private final transient ModelInfo kModelInfo;

    public ModelInfoTemplate() {
        this(null, 1, null);
    }

    public ModelInfo getKModelInfo() {
        return this.kModelInfo;
    }

    public String getMD5() {
        ExtendedUrlModel file_url = getFile_url();
        if (file_url != null) {
            return file_url.getUri();
        }
        return null;
    }

    public ExtendedUrlModel getFileUrl() {
        ExtendedUrlModel extendedUrlModel;
        ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 == null || (extendedUrlModel = kModelInfo2.getFile_url()) == null) {
            extendedUrlModel = super.getFile_url();
        }
        return new ExtendedUrlModel(extendedUrlModel);
    }

    public ModelInfoTemplate(ModelInfo modelInfo) {
        super(null, null, null, null, 0, 0, 0, SmActions.ACTION_ONTHECALL_ENTRY, null);
        this.kModelInfo = modelInfo;
    }

    public void setFileUrl(ExtendedUrlModel extendedUrlModel) {
        this.fileUrl = extendedUrlModel;
        ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            kModelInfo2.setFile_url(extendedUrlModel);
        }
        super.setFile_url(extendedUrlModel);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ModelInfoTemplate(ModelInfo modelInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : modelInfo);
    }
}
