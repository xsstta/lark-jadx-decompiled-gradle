package com.ss.android.lark.todo.impl.features.mainview2.entity;

import com.bytedance.lark.pb.todo.v1.CustomComplete;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.larksuite.framework.section.IActionData;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J=\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010&\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006,"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/entity/CheckBoxActionData;", "Lcom/larksuite/framework/section/IActionData;", "todoGuid", "", "isTargetCompleted", "", "todoSource", "Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "multiCompleteType", "Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$MultiCompleteType;", "completeAction", "Lcom/bytedance/lark/pb/todo/v1/CustomComplete$Action;", "(Ljava/lang/String;ZLcom/bytedance/lark/pb/todo/v1/TodoSource;Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$MultiCompleteType;Lcom/bytedance/lark/pb/todo/v1/CustomComplete$Action;)V", "getCompleteAction", "()Lcom/bytedance/lark/pb/todo/v1/CustomComplete$Action;", "setCompleteAction", "(Lcom/bytedance/lark/pb/todo/v1/CustomComplete$Action;)V", "()Z", "setTargetCompleted", "(Z)V", "getMultiCompleteType", "()Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$MultiCompleteType;", "setMultiCompleteType", "(Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$MultiCompleteType;)V", "getTodoGuid", "()Ljava/lang/String;", "setTodoGuid", "(Ljava/lang/String;)V", "getTodoSource", "()Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "setTodoSource", "(Lcom/bytedance/lark/pb/todo/v1/TodoSource;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.a.a */
public final class CheckBoxActionData implements IActionData {

    /* renamed from: a */
    private String f140547a;

    /* renamed from: b */
    private boolean f140548b;

    /* renamed from: c */
    private TodoSource f140549c;

    /* renamed from: d */
    private MultiCompleteHelper.MultiCompleteType f140550d;

    /* renamed from: e */
    private CustomComplete.Action f140551e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckBoxActionData)) {
            return false;
        }
        CheckBoxActionData aVar = (CheckBoxActionData) obj;
        return Intrinsics.areEqual(this.f140547a, aVar.f140547a) && this.f140548b == aVar.f140548b && Intrinsics.areEqual(this.f140549c, aVar.f140549c) && Intrinsics.areEqual(this.f140550d, aVar.f140550d) && Intrinsics.areEqual(this.f140551e, aVar.f140551e);
    }

    public int hashCode() {
        String str = this.f140547a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f140548b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        TodoSource todoSource = this.f140549c;
        int hashCode2 = (i5 + (todoSource != null ? todoSource.hashCode() : 0)) * 31;
        MultiCompleteHelper.MultiCompleteType multiCompleteType = this.f140550d;
        int hashCode3 = (hashCode2 + (multiCompleteType != null ? multiCompleteType.hashCode() : 0)) * 31;
        CustomComplete.Action action = this.f140551e;
        if (action != null) {
            i = action.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "CheckBoxActionData(todoGuid=" + this.f140547a + ", isTargetCompleted=" + this.f140548b + ", todoSource=" + this.f140549c + ", multiCompleteType=" + this.f140550d + ", completeAction=" + this.f140551e + ")";
    }

    /* renamed from: a */
    public final String mo193483a() {
        return this.f140547a;
    }

    /* renamed from: b */
    public final boolean mo193484b() {
        return this.f140548b;
    }

    /* renamed from: c */
    public final TodoSource mo193485c() {
        return this.f140549c;
    }

    /* renamed from: d */
    public final MultiCompleteHelper.MultiCompleteType mo193486d() {
        return this.f140550d;
    }

    /* renamed from: e */
    public final CustomComplete.Action mo193487e() {
        return this.f140551e;
    }

    public CheckBoxActionData(String str, boolean z, TodoSource todoSource, MultiCompleteHelper.MultiCompleteType multiCompleteType, CustomComplete.Action action) {
        Intrinsics.checkParameterIsNotNull(str, "todoGuid");
        Intrinsics.checkParameterIsNotNull(todoSource, "todoSource");
        Intrinsics.checkParameterIsNotNull(multiCompleteType, "multiCompleteType");
        this.f140547a = str;
        this.f140548b = z;
        this.f140549c = todoSource;
        this.f140550d = multiCompleteType;
        this.f140551e = action;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckBoxActionData(String str, boolean z, TodoSource todoSource, MultiCompleteHelper.MultiCompleteType multiCompleteType, CustomComplete.Action action, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, todoSource, multiCompleteType, (i & 16) != 0 ? null : action);
    }
}
