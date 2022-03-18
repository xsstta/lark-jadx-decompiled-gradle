package com.ss.ugc.effectplatform.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0016B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/ss/ugc/effectplatform/model/CategoryPageModel;", "", "category_effects", "Lcom/ss/ugc/effectplatform/model/CategoryEffectModel;", "url_prefix", "", "", "extra", "Lcom/ss/ugc/effectplatform/model/CategoryPageModel$Extra;", "(Lcom/ss/ugc/effectplatform/model/CategoryEffectModel;Ljava/util/List;Lcom/ss/ugc/effectplatform/model/CategoryPageModel$Extra;)V", "getCategory_effects", "()Lcom/ss/ugc/effectplatform/model/CategoryEffectModel;", "setCategory_effects", "(Lcom/ss/ugc/effectplatform/model/CategoryEffectModel;)V", "getExtra", "()Lcom/ss/ugc/effectplatform/model/CategoryPageModel$Extra;", "setExtra", "(Lcom/ss/ugc/effectplatform/model/CategoryPageModel$Extra;)V", "getUrl_prefix", "()Ljava/util/List;", "setUrl_prefix", "(Ljava/util/List;)V", "Extra", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
public class CategoryPageModel {
    private CategoryEffectModel category_effects;
    private Extra extra;
    private List<String> url_prefix;

    public CategoryPageModel() {
        this(null, null, null, 7, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/ugc/effectplatform/model/CategoryPageModel$Extra;", "", "()V", "rec_id", "", "getRec_id", "()Ljava/lang/String;", "setRec_id", "(Ljava/lang/String;)V", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Extra {
        private String rec_id = "";

        public final String getRec_id() {
            return this.rec_id;
        }

        public final void setRec_id(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.rec_id = str;
        }
    }

    public CategoryEffectModel getCategory_effects() {
        return this.category_effects;
    }

    public final Extra getExtra() {
        return this.extra;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public void setCategory_effects(CategoryEffectModel categoryEffectModel) {
        this.category_effects = categoryEffectModel;
    }

    public final void setExtra(Extra extra2) {
        this.extra = extra2;
    }

    public void setUrl_prefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.url_prefix = list;
    }

    public CategoryPageModel(CategoryEffectModel categoryEffectModel, List<String> list, Extra extra2) {
        Intrinsics.checkParameterIsNotNull(list, "url_prefix");
        this.category_effects = categoryEffectModel;
        this.url_prefix = list;
        this.extra = extra2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryPageModel(CategoryEffectModel categoryEffectModel, List list, Extra extra2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : categoryEffectModel, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? null : extra2);
    }
}
