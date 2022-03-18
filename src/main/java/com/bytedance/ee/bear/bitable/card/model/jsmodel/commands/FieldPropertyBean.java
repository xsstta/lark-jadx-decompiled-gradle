package com.bytedance.ee.bear.bitable.card.model.jsmodel.commands;

import com.bytedance.ee.util.io.NonProguard;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J \u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001b\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/FieldPropertyBean;", "Lcom/bytedance/ee/util/io/NonProguard;", "options", "", "Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/OptionBean;", "([Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/OptionBean;)V", "getOptions", "()[Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/OptionBean;", "[Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/OptionBean;", "component1", "copy", "([Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/OptionBean;)Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/FieldPropertyBean;", "equals", "", "other", "", "hashCode", "", "toString", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class FieldPropertyBean implements NonProguard {
    private final OptionBean[] options;

    public FieldPropertyBean() {
        this(null, 1, null);
    }

    public static /* synthetic */ FieldPropertyBean copy$default(FieldPropertyBean fieldPropertyBean, OptionBean[] optionBeanArr, int i, Object obj) {
        if ((i & 1) != 0) {
            optionBeanArr = fieldPropertyBean.options;
        }
        return fieldPropertyBean.copy(optionBeanArr);
    }

    public final OptionBean[] component1() {
        return this.options;
    }

    public final FieldPropertyBean copy(OptionBean[] optionBeanArr) {
        return new FieldPropertyBean(optionBeanArr);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FieldPropertyBean) && Intrinsics.areEqual(this.options, ((FieldPropertyBean) obj).options);
        }
        return true;
    }

    public int hashCode() {
        OptionBean[] optionBeanArr = this.options;
        if (optionBeanArr != null) {
            return Arrays.hashCode(optionBeanArr);
        }
        return 0;
    }

    public String toString() {
        return "FieldPropertyBean(options=" + Arrays.toString(this.options) + ")";
    }

    public final OptionBean[] getOptions() {
        return this.options;
    }

    public FieldPropertyBean(OptionBean[] optionBeanArr) {
        this.options = optionBeanArr;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FieldPropertyBean(OptionBean[] optionBeanArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : optionBeanArr);
    }
}
