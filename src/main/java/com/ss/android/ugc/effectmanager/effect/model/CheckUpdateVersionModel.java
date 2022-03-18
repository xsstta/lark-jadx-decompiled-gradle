package com.ss.android.ugc.effectmanager.effect.model;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.ugc.effectmanager.effect.model.template.CheckUpdateVersionModelTemplate;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\fR(\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/CheckUpdateVersionModel;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/CheckUpdateVersionModelTemplate;", "Ljava/io/Serializable;", "kUpdateModel", "Lcom/ss/ugc/effectplatform/model/CheckUpdateVersionModel;", "(Lcom/ss/ugc/effectplatform/model/CheckUpdateVersionModel;)V", "value", "", "cursor", "getCursor", "()Ljava/lang/String;", "setCursor", "(Ljava/lang/String;)V", "getKUpdateModel", "()Lcom/ss/ugc/effectplatform/model/CheckUpdateVersionModel;", "sorting_position", "getSorting_position", "setSorting_position", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "getVersion", "setVersion", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CheckUpdateVersionModel extends CheckUpdateVersionModelTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel;

    public CheckUpdateVersionModel() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CheckUpdateVersionModelTemplate
    public com.ss.ugc.effectplatform.model.CheckUpdateVersionModel getKUpdateModel() {
        return this.kUpdateModel;
    }

    @Override // com.ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public String getCursor() {
        String cursor;
        com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel2 = getKUpdateModel();
        if (kUpdateModel2 == null || (cursor = kUpdateModel2.getCursor()) == null) {
            return super.getCursor();
        }
        return cursor;
    }

    @Override // com.ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public String getSorting_position() {
        String sorting_position;
        com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel2 = getKUpdateModel();
        if (kUpdateModel2 == null || (sorting_position = kUpdateModel2.getSorting_position()) == null) {
            return super.getSorting_position();
        }
        return sorting_position;
    }

    @Override // com.ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public String getVersion() {
        String version;
        com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel2 = getKUpdateModel();
        if (kUpdateModel2 == null || (version = kUpdateModel2.getVersion()) == null) {
            return super.getVersion();
        }
        return version;
    }

    @Override // com.ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public void setCursor(String str) {
        com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel2 = getKUpdateModel();
        if (kUpdateModel2 != null) {
            kUpdateModel2.setCursor(str);
        }
        super.setCursor(str);
    }

    @Override // com.ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public void setSorting_position(String str) {
        com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel2 = getKUpdateModel();
        if (kUpdateModel2 != null) {
            kUpdateModel2.setSorting_position(str);
        }
        super.setSorting_position(str);
    }

    @Override // com.ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public void setVersion(String str) {
        com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel2 = getKUpdateModel();
        if (kUpdateModel2 != null) {
            kUpdateModel2.setVersion(str);
        }
        super.setVersion(str);
    }

    public CheckUpdateVersionModel(com.ss.ugc.effectplatform.model.CheckUpdateVersionModel checkUpdateVersionModel) {
        super(checkUpdateVersionModel);
        this.kUpdateModel = checkUpdateVersionModel;
        com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel2 = getKUpdateModel();
        if (kUpdateModel2 != null) {
            String cursor = kUpdateModel2.getCursor();
            if (cursor != null) {
                super.setCursor(cursor);
            }
            String sorting_position = kUpdateModel2.getSorting_position();
            if (sorting_position != null) {
                super.setSorting_position(sorting_position);
            }
            String version = kUpdateModel2.getVersion();
            if (version != null) {
                super.setVersion(version);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckUpdateVersionModel(com.ss.ugc.effectplatform.model.CheckUpdateVersionModel checkUpdateVersionModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : checkUpdateVersionModel);
    }
}
