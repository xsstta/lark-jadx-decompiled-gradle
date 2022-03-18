package com.ss.android.lark.todo.impl.features.detail.comment;

import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.section.IActionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentPushData;", "Lcom/larksuite/framework/section/IActionData;", "jsonObject", "Lcom/alibaba/fastjson/JSONObject;", "(Lcom/alibaba/fastjson/JSONObject;)V", "getJsonObject", "()Lcom/alibaba/fastjson/JSONObject;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.q */
public final class CommentPushData implements IActionData {

    /* renamed from: a */
    private final JSONObject f139872a;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CommentPushData) && Intrinsics.areEqual(this.f139872a, ((CommentPushData) obj).f139872a);
        }
        return true;
    }

    public int hashCode() {
        JSONObject jSONObject = this.f139872a;
        if (jSONObject != null) {
            return jSONObject.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "CommentPushData(jsonObject=" + this.f139872a + ")";
    }

    /* renamed from: a */
    public final JSONObject mo192453a() {
        return this.f139872a;
    }

    public CommentPushData(JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(jSONObject, "jsonObject");
        this.f139872a = jSONObject;
    }
}
