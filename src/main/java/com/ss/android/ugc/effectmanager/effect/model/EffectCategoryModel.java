package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate;
import com.ss.ugc.effectplatform.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0010\u00107\u001a\u0002082\u0006\u0010 \u001a\u00020\u001fH\u0016R0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\b8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u00138V@VX\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u00138V@VX\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R$\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R$\u0010 \u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u001f8V@VX\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010$\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u001f8V@VX\u000e¢\u0006\f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R$\u0010(\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010\u0012R$\u0010+\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\b,\u0010\u0010\"\u0004\b-\u0010\u0012R0\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b/\u0010\u000b\"\u0004\b0\u0010\rR(\u00101\u001a\u0004\u0018\u00010\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\b8V@VX\u000e¢\u0006\f\u001a\u0004\b2\u0010\u0010\"\u0004\b3\u0010\u0012R(\u00104\u001a\u0004\u0018\u00010\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\b8V@VX\u000e¢\u0006\f\u001a\u0004\b5\u0010\u0010\"\u0004\b6\u0010\u0012¨\u00069"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryModel;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/EffectCategoryModelTemplate;", "Ljava/io/Serializable;", "kCategoryModel", "Lcom/ss/ugc/effectplatform/model/EffectCategoryModel;", "(Lcom/ss/ugc/effectplatform/model/EffectCategoryModel;)V", "value", "", "", "effects", "getEffects", "()Ljava/util/List;", "setEffects", "(Ljava/util/List;)V", "extra", "getExtra", "()Ljava/lang/String;", "setExtra", "(Ljava/lang/String;)V", "Lcom/ss/ugc/effectplatform/model/UrlModel;", "icon", "getIcon", "()Lcom/ss/ugc/effectplatform/model/UrlModel;", "setIcon", "(Lcom/ss/ugc/effectplatform/model/UrlModel;)V", "icon_selected", "getIcon_selected", "setIcon_selected", "id", "getId", "setId", "", "isDefault", "()Z", "setDefault", "(Z)V", "is_default", "set_default", "getKCategoryModel", "()Lcom/ss/ugc/effectplatform/model/EffectCategoryModel;", "key", "getKey", "setKey", "name", "getName", "setName", "tags", "getTags", "setTags", "tagsUpdateTime", "getTagsUpdateTime", "setTagsUpdateTime", "tags_updated_at", "getTags_updated_at", "setTags_updated_at", "setIsDefault", "", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class EffectCategoryModel extends EffectCategoryModelTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel;

    public EffectCategoryModel() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public com.ss.ugc.effectplatform.model.EffectCategoryModel getKCategoryModel() {
        return this.kCategoryModel;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public String getTagsUpdateTime() {
        return super.getTagsUpdateTime();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public boolean isDefault() {
        return super.isDefault();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public boolean is_default() {
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            return kCategoryModel2.is_default();
        }
        return super.is_default();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public List<String> getEffects() {
        List<String> effects;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (effects = kCategoryModel2.getEffects()) == null) {
            return super.getEffects();
        }
        return effects;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public String getExtra() {
        String extra;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (extra = kCategoryModel2.getExtra()) == null) {
            return super.getExtra();
        }
        return extra;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public UrlModel getIcon() {
        UrlModel icon;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (icon = kCategoryModel2.getIcon()) == null) {
            return super.getIcon();
        }
        return icon;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public UrlModel getIcon_selected() {
        UrlModel icon_selected;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (icon_selected = kCategoryModel2.getIcon_selected()) == null) {
            return super.getIcon_selected();
        }
        return icon_selected;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public String getId() {
        String id;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (id = kCategoryModel2.getId()) == null) {
            return super.getId();
        }
        return id;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public String getKey() {
        String key;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (key = kCategoryModel2.getKey()) == null) {
            return super.getKey();
        }
        return key;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public String getName() {
        String name;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (name = kCategoryModel2.getName()) == null) {
            return super.getName();
        }
        return name;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public List<String> getTags() {
        List<String> tags;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (tags = kCategoryModel2.getTags()) == null) {
            return super.getTags();
        }
        return tags;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public String getTags_updated_at() {
        String tags_updated_at;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (tags_updated_at = kCategoryModel2.getTags_updated_at()) == null) {
            return super.getTags_updated_at();
        }
        return tags_updated_at;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public void setDefault(boolean z) {
        super.setDefault(z);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public void setIsDefault(boolean z) {
        super.setIsDefault(z);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public void setTagsUpdateTime(String str) {
        super.setTagsUpdateTime(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public void setExtra(String str) {
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setExtra(str);
        }
        super.setExtra(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public void setIcon(UrlModel urlModel) {
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setIcon(urlModel);
        }
        super.setIcon(urlModel);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public void setIcon_selected(UrlModel urlModel) {
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setIcon_selected(urlModel);
        }
        super.setIcon_selected(urlModel);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public void setTags_updated_at(String str) {
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setTags_updated_at(str);
        }
        super.setTags_updated_at(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public void set_default(boolean z) {
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.set_default(z);
        }
        super.set_default(z);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public void setEffects(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setEffects(list);
        }
        super.setEffects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public void setId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setId(str);
        }
        super.setId(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public void setKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setKey(str);
        }
        super.setKey(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public void setName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setName(str);
        }
        super.setName(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public void setTags(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setTags(list);
        }
        super.setTags(list);
    }

    public EffectCategoryModel(com.ss.ugc.effectplatform.model.EffectCategoryModel effectCategoryModel) {
        super(effectCategoryModel);
        this.kCategoryModel = effectCategoryModel;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            List<String> effects = kCategoryModel2.getEffects();
            if (effects != null) {
                super.setEffects(effects);
            }
            String extra = kCategoryModel2.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            UrlModel icon = kCategoryModel2.getIcon();
            if (icon != null) {
                super.setIcon(icon);
            }
            UrlModel icon_selected = kCategoryModel2.getIcon_selected();
            if (icon_selected != null) {
                super.setIcon_selected(icon_selected);
            }
            String id = kCategoryModel2.getId();
            if (id != null) {
                super.setId(id);
            }
            super.set_default(kCategoryModel2.is_default());
            String key = kCategoryModel2.getKey();
            if (key != null) {
                super.setKey(key);
            }
            String name = kCategoryModel2.getName();
            if (name != null) {
                super.setName(name);
            }
            List<String> tags = kCategoryModel2.getTags();
            if (tags != null) {
                super.setTags(tags);
            }
            String tags_updated_at = kCategoryModel2.getTags_updated_at();
            if (tags_updated_at != null) {
                super.setTags_updated_at(tags_updated_at);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectCategoryModel(com.ss.ugc.effectplatform.model.EffectCategoryModel effectCategoryModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectCategoryModel);
    }
}
