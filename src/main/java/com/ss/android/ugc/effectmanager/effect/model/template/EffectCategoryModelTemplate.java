package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R&\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR*\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\f8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/template/EffectCategoryModelTemplate;", "Lcom/ss/ugc/effectplatform/model/EffectCategoryModel;", "kCategoryModel", "(Lcom/ss/ugc/effectplatform/model/EffectCategoryModel;)V", "value", "", "isDefault", "()Z", "setDefault", "(Z)V", "getKCategoryModel", "()Lcom/ss/ugc/effectplatform/model/EffectCategoryModel;", "", "tagsUpdateTime", "getTagsUpdateTime", "()Ljava/lang/String;", "setTagsUpdateTime", "(Ljava/lang/String;)V", "setIsDefault", "", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.e */
public class EffectCategoryModelTemplate extends EffectCategoryModel {
    private boolean isDefault;
    private final transient EffectCategoryModel kCategoryModel;
    private String tagsUpdateTime;

    public EffectCategoryModelTemplate() {
        this(null, 1, null);
    }

    public EffectCategoryModel getKCategoryModel() {
        return this.kCategoryModel;
    }

    public boolean isDefault() {
        EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            return kCategoryModel2.is_default();
        }
        return super.is_default();
    }

    public String getTagsUpdateTime() {
        String tags_updated_at;
        EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (tags_updated_at = kCategoryModel2.getTags_updated_at()) == null) {
            return super.getTags_updated_at();
        }
        return tags_updated_at;
    }

    public void setDefault(boolean z) {
        this.isDefault = z;
        EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.set_default(z);
        }
        super.set_default(z);
    }

    public void setTagsUpdateTime(String str) {
        this.tagsUpdateTime = str;
        EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setTags_updated_at(str);
        }
        super.setTags_updated_at(str);
    }

    public EffectCategoryModelTemplate(EffectCategoryModel effectCategoryModel) {
        super(null, null, null, null, null, null, null, null, false, null, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);
        this.kCategoryModel = effectCategoryModel;
    }

    public void setIsDefault(boolean z) {
        EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.set_default(is_default());
        }
        super.set_default(is_default());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectCategoryModelTemplate(EffectCategoryModel effectCategoryModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectCategoryModel);
    }
}
