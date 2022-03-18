package com.bytedance.ee.bear.middleground.permission.widget.editpermdialog;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.bear.middleground.permission.widget.editpermdialog.EditPermItemModel;
import com.larksuite.suite.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u001e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rJ.\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rJ\u001e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rJ&\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/widget/editpermdialog/EditPermItemModelHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "modelList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/middleground/permission/widget/editpermdialog/EditPermItemModel;", "Lkotlin/collections/ArrayList;", "addDeleteItemModel", "clickListener", "Landroid/view/View$OnClickListener;", "addEditItemModel", "isSelect", "", "clickable", "addFullAccessItemModel", "canShowFa", "isWiki", "addReadItemModel", "addRemoveItemModel", "showDivider", "removeStrId", "", "addRemoveItemModelForFolder", "addTransferItemModel", "canTransfer", "addTransferItemModelForFolder", "getModelList", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.widget.a.d */
public final class EditPermItemModelHelper {

    /* renamed from: a */
    private final ArrayList<EditPermItemModel> f27340a = new ArrayList<>(4);

    /* renamed from: b */
    private final Context f27341b;

    /* renamed from: a */
    public final ArrayList<EditPermItemModel> mo38519a() {
        return this.f27340a;
    }

    public EditPermItemModelHelper(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f27341b = context;
    }

    /* renamed from: a */
    public final EditPermItemModelHelper mo38515a(View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "clickListener");
        EditPermItemModel.Builder aVar = new EditPermItemModel.Builder();
        String string = this.f27341b.getString(R.string.Doc_Facade_Delete);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.Doc_Facade_Delete)");
        this.f27340a.add(aVar.mo38507a(string).mo38505a(R.color.function_danger_500).mo38508a(false).mo38511b(true).mo38506a(onClickListener).mo38512c(true).mo38509a());
        return this;
    }

    /* renamed from: b */
    public final EditPermItemModelHelper mo38520b(boolean z, View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "clickListener");
        if (!z) {
            return this;
        }
        EditPermItemModel.Builder aVar = new EditPermItemModel.Builder();
        String string = this.f27341b.getString(R.string.Doc_Share_SetAsOwner);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.Doc_Share_SetAsOwner)");
        this.f27340a.add(aVar.mo38507a(string).mo38508a(false).mo38511b(true).mo38506a(onClickListener).mo38512c(true).mo38509a());
        return this;
    }

    /* renamed from: c */
    public final EditPermItemModelHelper mo38522c(boolean z, View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "clickListener");
        if (!z) {
            return this;
        }
        EditPermItemModel.Builder aVar = new EditPermItemModel.Builder();
        String string = this.f27341b.getString(R.string.Doc_Share_SetAsOwner);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.Doc_Share_SetAsOwner)");
        this.f27340a.add(aVar.mo38507a(string).mo38508a(false).mo38511b(true).mo38506a(onClickListener).mo38512c(true).mo38509a());
        return this;
    }

    /* renamed from: a */
    public final EditPermItemModelHelper mo38516a(boolean z, View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "clickListener");
        EditPermItemModel.Builder aVar = new EditPermItemModel.Builder();
        String string = this.f27341b.getString(R.string.Doc_Facade_Remove);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.Doc_Facade_Remove)");
        this.f27340a.add(aVar.mo38507a(string).mo38505a(R.color.function_danger_500).mo38508a(false).mo38511b(true).mo38506a(onClickListener).mo38512c(z).mo38509a());
        return this;
    }

    /* renamed from: b */
    public final EditPermItemModelHelper mo38521b(boolean z, boolean z2, View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "clickListener");
        EditPermItemModel.Builder aVar = new EditPermItemModel.Builder();
        String string = this.f27341b.getString(R.string.Doc_Share_Editable);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.Doc_Share_Editable)");
        this.f27340a.add(aVar.mo38507a(string).mo38508a(z).mo38511b(z2).mo38506a(onClickListener).mo38512c(false).mo38509a());
        return this;
    }

    /* renamed from: a */
    public final EditPermItemModelHelper mo38517a(boolean z, boolean z2, View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "clickListener");
        EditPermItemModel.Builder aVar = new EditPermItemModel.Builder();
        String string = this.f27341b.getString(R.string.Doc_Share_Readable);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.Doc_Share_Readable)");
        this.f27340a.add(aVar.mo38507a(string).mo38508a(z).mo38511b(z2).mo38506a(onClickListener).mo38512c(false).mo38509a());
        return this;
    }

    /* renamed from: a */
    public final EditPermItemModelHelper mo38514a(int i, boolean z, boolean z2, View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "clickListener");
        EditPermItemModel.Builder aVar = new EditPermItemModel.Builder();
        String string = this.f27341b.getString(i);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(removeStrId)");
        this.f27340a.add(aVar.mo38507a(string).mo38505a(R.color.function_danger_500).mo38508a(z2).mo38511b(true).mo38506a(onClickListener).mo38512c(z).mo38509a());
        return this;
    }

    /* renamed from: a */
    public final EditPermItemModelHelper mo38518a(boolean z, boolean z2, boolean z3, boolean z4, View.OnClickListener onClickListener) {
        int i;
        Intrinsics.checkParameterIsNotNull(onClickListener, "clickListener");
        if (!z) {
            return this;
        }
        if (z4) {
            i = R.string.CreationMobile_Wiki_Permission_FullAccessPermission_Tooltip;
        } else {
            i = R.string.CreationMobile_ECM_AllPermissionDesc;
        }
        EditPermItemModel.Builder aVar = new EditPermItemModel.Builder();
        String string = this.f27341b.getString(R.string.CreationMobile_Wiki_Permission_FullAccess_Options);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(\n     …ssion_FullAccess_Options)");
        EditPermItemModel.Builder a = aVar.mo38507a(string);
        String string2 = this.f27341b.getString(i);
        Intrinsics.checkExpressionValueIsNotNull(string2, "context.getString(tipResId)");
        this.f27340a.add(a.mo38510b(string2).mo38508a(z3).mo38511b(z2).mo38506a(onClickListener).mo38512c(false).mo38509a());
        return this;
    }
}
