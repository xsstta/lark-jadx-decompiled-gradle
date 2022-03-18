package com.ss.android.lark.todo.impl.features.mainview.entity;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.todo.impl.features.common.helper.OperationToastHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoListToastUnit;", "", "stringId", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/todo/impl/features/common/helper/OperationToastHelper$ToastType;", "toastStr", "", "(ILcom/ss/android/lark/todo/impl/features/common/helper/OperationToastHelper$ToastType;Ljava/lang/String;)V", "getStringId", "()I", "setStringId", "(I)V", "getToastStr", "()Ljava/lang/String;", "setToastStr", "(Ljava/lang/String;)V", "getType", "()Lcom/ss/android/lark/todo/impl/features/common/helper/OperationToastHelper$ToastType;", "setType", "(Lcom/ss/android/lark/todo/impl/features/common/helper/OperationToastHelper$ToastType;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview.entity.d */
public final class TodoListToastUnit {

    /* renamed from: a */
    private int f140338a;

    /* renamed from: b */
    private OperationToastHelper.ToastType f140339b;

    /* renamed from: c */
    private String f140340c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TodoListToastUnit)) {
            return false;
        }
        TodoListToastUnit dVar = (TodoListToastUnit) obj;
        return this.f140338a == dVar.f140338a && Intrinsics.areEqual(this.f140339b, dVar.f140339b) && Intrinsics.areEqual(this.f140340c, dVar.f140340c);
    }

    public int hashCode() {
        int i = this.f140338a * 31;
        OperationToastHelper.ToastType toastType = this.f140339b;
        int i2 = 0;
        int hashCode = (i + (toastType != null ? toastType.hashCode() : 0)) * 31;
        String str = this.f140340c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "TodoListToastUnit(stringId=" + this.f140338a + ", type=" + this.f140339b + ", toastStr=" + this.f140340c + ")";
    }

    /* renamed from: a */
    public final int mo193213a() {
        return this.f140338a;
    }

    /* renamed from: b */
    public final OperationToastHelper.ToastType mo193214b() {
        return this.f140339b;
    }

    /* renamed from: c */
    public final String mo193215c() {
        return this.f140340c;
    }

    public TodoListToastUnit(int i, OperationToastHelper.ToastType toastType, String str) {
        Intrinsics.checkParameterIsNotNull(toastType, ShareHitPoint.f121869d);
        this.f140338a = i;
        this.f140339b = toastType;
        this.f140340c = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TodoListToastUnit(int i, OperationToastHelper.ToastType toastType, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, toastType, (i2 & 4) != 0 ? null : str);
    }
}
