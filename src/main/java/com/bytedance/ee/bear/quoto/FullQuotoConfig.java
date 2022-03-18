package com.bytedance.ee.bear.quoto;

import com.larksuite.suite.R;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/quoto/FullQuotoConfig;", "", "placeHolderId", "", "mainTitleId", "subTitleId", "reportType", "", "(Ljava/lang/String;IIIILjava/lang/String;)V", "getMainTitleId", "()I", "getPlaceHolderId", "getReportType", "()Ljava/lang/String;", "getSubTitleId", "UPLOAD", "MAKE_COPY", "TRANSLATE", "CREATE_TEMPLATE", "SAVE_TO_TEMPLATE", "SAVE_TO_DRIVE", "SAVE_TO_WPS", "quoto-api_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum FullQuotoConfig {
    UPLOAD(R.drawable.illustration_ccm_empty_positive_storage_limit, R.string.CreationMobile_ECM_SpaceMaxToast, R.string.CreationMobile_ECM_SpaceMaxDesc, "drive_storage_limit"),
    MAKE_COPY(R.drawable.illustration_ccm_empty_positive_storage_limit, R.string.CreationMobile_ECM_SpaceMaxToast, R.string.CreationMobile_ECM_SpaceCantCopyDesc, "drive_storage_limit"),
    TRANSLATE(R.drawable.illustration_ccm_empty_positive_translation_limit, R.string.CreationMobile_Docs_Billing_Translation_Title, R.string.CreationMobile_Docs_Biling_MaxTranslationTimes_Toast, "doc_translation_number_limit"),
    CREATE_TEMPLATE(R.drawable.illustration_ccm_empty_positive_storage_limit, R.string.CreationMobile_ECM_SpaceMaxToast, R.string.CreationMobile_ECM_SpaceCantCreateDesc, "drive_storage_limit"),
    SAVE_TO_TEMPLATE(R.drawable.illustration_ccm_empty_positive_storage_limit, R.string.CreationMobile_ECM_SpaceMaxToast, R.string.CreationMobile_ECM_SpaceCantTemplateDesc, "drive_storage_limit"),
    SAVE_TO_DRIVE(R.drawable.illustration_ccm_empty_positive_storage_limit, R.string.CreationMobile_ECM_SpaceMaxToast, R.string.CreationMobile_ECM_SpaceCantSaveDesc, "drive_storage_limit"),
    SAVE_TO_WPS(R.drawable.illustration_ccm_empty_positive_storage_limit, R.string.CreationMobile_ECM_SpaceMaxToast, R.string.CreationMobile_ECM_CapacityFullCannotEdit, "drive_storage_limit");
    
    private final int mainTitleId;
    private final int placeHolderId;
    private final String reportType;
    private final int subTitleId;

    public final int getMainTitleId() {
        return this.mainTitleId;
    }

    public final int getPlaceHolderId() {
        return this.placeHolderId;
    }

    public final String getReportType() {
        return this.reportType;
    }

    public final int getSubTitleId() {
        return this.subTitleId;
    }

    private FullQuotoConfig(int i, int i2, int i3, String str) {
        this.placeHolderId = i;
        this.mainTitleId = i2;
        this.subTitleId = i3;
        this.reportType = str;
    }
}
