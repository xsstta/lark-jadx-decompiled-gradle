package com.ss.ugc.effectplatform.model.net;

import com.google.firebase.messaging.Constants;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.NetResponseChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J+\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010 \u001a\u00020\u0007H\u0016J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/ss/ugc/effectplatform/model/net/CategoryEffectListResponse;", "Lcom/ss/ugc/effectplatform/model/NetResponseChecker;", "Lcom/ss/ugc/effectplatform/model/CategoryPageModel;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "message", "", "status_code", "", "(Lcom/ss/ugc/effectplatform/model/CategoryPageModel;Ljava/lang/String;I)V", "getData", "()Lcom/ss/ugc/effectplatform/model/CategoryPageModel;", "setData", "(Lcom/ss/ugc/effectplatform/model/CategoryPageModel;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getStatus_code", "()I", "setStatus_code", "(I)V", "checkValue", "", "component1", "component2", "component3", "copy", "equals", "other", "", "getResponseData", "getResponseMessage", "getStatusCode", "hashCode", "toString", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CategoryEffectListResponse extends NetResponseChecker<CategoryPageModel> {
    private CategoryPageModel data;
    private String message;
    private int status_code;

    public CategoryEffectListResponse() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ CategoryEffectListResponse copy$default(CategoryEffectListResponse categoryEffectListResponse, CategoryPageModel categoryPageModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            categoryPageModel = categoryEffectListResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = categoryEffectListResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = categoryEffectListResponse.status_code;
        }
        return categoryEffectListResponse.copy(categoryPageModel, str, i);
    }

    public final CategoryPageModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final CategoryEffectListResponse copy(CategoryPageModel categoryPageModel, String str, int i) {
        return new CategoryEffectListResponse(categoryPageModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryEffectListResponse)) {
            return false;
        }
        CategoryEffectListResponse categoryEffectListResponse = (CategoryEffectListResponse) obj;
        return Intrinsics.areEqual(this.data, categoryEffectListResponse.data) && Intrinsics.areEqual(this.message, categoryEffectListResponse.message) && this.status_code == categoryEffectListResponse.status_code;
    }

    public int hashCode() {
        CategoryPageModel categoryPageModel = this.data;
        int i = 0;
        int hashCode = (categoryPageModel != null ? categoryPageModel.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.status_code;
    }

    public String toString() {
        return "CategoryEffectListResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    public final CategoryPageModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public CategoryPageModel getResponseData() {
        return this.data;
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public String getResponseMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public boolean checkValue() {
        CategoryPageModel categoryPageModel = this.data;
        if (categoryPageModel == null || categoryPageModel.getCategory_effects() == null) {
            return false;
        }
        return true;
    }

    public final void setData(CategoryPageModel categoryPageModel) {
        this.data = categoryPageModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public CategoryEffectListResponse(CategoryPageModel categoryPageModel, String str, int i) {
        this.data = categoryPageModel;
        this.message = str;
        this.status_code = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryEffectListResponse(CategoryPageModel categoryPageModel, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : categoryPageModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
