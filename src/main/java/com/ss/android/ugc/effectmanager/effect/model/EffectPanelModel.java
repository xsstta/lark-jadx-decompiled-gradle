package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.EffectPanelModelTemplate;
import com.ss.ugc.effectplatform.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\r8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R0\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00188V@VX\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u001e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\n\"\u0004\b \u0010\fR(\u0010!\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\"\u0010\n\"\u0004\b#\u0010\f¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/EffectPanelModel;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/EffectPanelModelTemplate;", "Ljava/io/Serializable;", "kPanelModel", "Lcom/ss/ugc/effectplatform/model/EffectPanelModel;", "(Lcom/ss/ugc/effectplatform/model/EffectPanelModel;)V", "value", "", "extra", "getExtra", "()Ljava/lang/String;", "setExtra", "(Ljava/lang/String;)V", "Lcom/ss/ugc/effectplatform/model/UrlModel;", "icon", "getIcon", "()Lcom/ss/ugc/effectplatform/model/UrlModel;", "setIcon", "(Lcom/ss/ugc/effectplatform/model/UrlModel;)V", "id", "getId", "setId", "getKPanelModel", "()Lcom/ss/ugc/effectplatform/model/EffectPanelModel;", "", "tags", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "tags_updated_at", "getTags_updated_at", "setTags_updated_at", "text", "getText", "setText", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class EffectPanelModel extends EffectPanelModelTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel;

    public EffectPanelModel() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectPanelModelTemplate
    public com.ss.ugc.effectplatform.model.EffectPanelModel getKPanelModel() {
        return this.kPanelModel;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public String getExtra() {
        String extra;
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (extra = kPanelModel2.getExtra()) == null) {
            return super.getExtra();
        }
        return extra;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public UrlModel getIcon() {
        UrlModel icon;
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (icon = kPanelModel2.getIcon()) == null) {
            return super.getIcon();
        }
        return icon;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public String getId() {
        String id;
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (id = kPanelModel2.getId()) == null) {
            return super.getId();
        }
        return id;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public List<String> getTags() {
        List<String> tags;
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (tags = kPanelModel2.getTags()) == null) {
            return super.getTags();
        }
        return tags;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public String getTags_updated_at() {
        String tags_updated_at;
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (tags_updated_at = kPanelModel2.getTags_updated_at()) == null) {
            return super.getTags_updated_at();
        }
        return tags_updated_at;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public String getText() {
        String text;
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (text = kPanelModel2.getText()) == null) {
            return super.getText();
        }
        return text;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public void setExtra(String str) {
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setExtra(str);
        }
        super.setExtra(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public void setIcon(UrlModel urlModel) {
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setIcon(urlModel);
        }
        super.setIcon(urlModel);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public void setId(String str) {
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setId(str);
        }
        super.setId(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public void setTags_updated_at(String str) {
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setTags_updated_at(str);
        }
        super.setTags_updated_at(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public void setText(String str) {
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setText(str);
        }
        super.setText(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public void setTags(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setTags(list);
        }
        super.setTags(list);
    }

    public EffectPanelModel(com.ss.ugc.effectplatform.model.EffectPanelModel effectPanelModel) {
        super(effectPanelModel);
        this.kPanelModel = effectPanelModel;
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            String extra = kPanelModel2.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            UrlModel icon = kPanelModel2.getIcon();
            if (icon != null) {
                super.setIcon(icon);
            }
            String id = kPanelModel2.getId();
            if (id != null) {
                super.setId(id);
            }
            List<String> tags = kPanelModel2.getTags();
            if (tags != null) {
                super.setTags(tags);
            }
            String tags_updated_at = kPanelModel2.getTags_updated_at();
            if (tags_updated_at != null) {
                super.setTags_updated_at(tags_updated_at);
            }
            String text = kPanelModel2.getText();
            if (text != null) {
                super.setText(text);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectPanelModel(com.ss.ugc.effectplatform.model.EffectPanelModel effectPanelModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectPanelModel);
    }
}
