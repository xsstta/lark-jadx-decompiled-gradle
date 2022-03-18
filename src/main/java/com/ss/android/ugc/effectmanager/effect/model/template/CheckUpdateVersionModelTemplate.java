package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.ugc.effectplatform.model.CheckUpdateVersionModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/template/CheckUpdateVersionModelTemplate;", "Lcom/ss/ugc/effectplatform/model/CheckUpdateVersionModel;", "kUpdateModel", "(Lcom/ss/ugc/effectplatform/model/CheckUpdateVersionModel;)V", "getKUpdateModel", "()Lcom/ss/ugc/effectplatform/model/CheckUpdateVersionModel;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.c */
public class CheckUpdateVersionModelTemplate extends CheckUpdateVersionModel {
    private final transient CheckUpdateVersionModel kUpdateModel;

    public CheckUpdateVersionModelTemplate() {
        this(null, 1, null);
    }

    public CheckUpdateVersionModel getKUpdateModel() {
        return this.kUpdateModel;
    }

    public CheckUpdateVersionModelTemplate(CheckUpdateVersionModel checkUpdateVersionModel) {
        super(null, null, null, 7, null);
        this.kUpdateModel = checkUpdateVersionModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckUpdateVersionModelTemplate(CheckUpdateVersionModel checkUpdateVersionModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : checkUpdateVersionModel);
    }
}
