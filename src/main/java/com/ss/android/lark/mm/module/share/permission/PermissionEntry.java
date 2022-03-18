package com.ss.android.lark.mm.module.share.permission;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.share.model.SharePermission;
import com.ss.android.lark.mm.module.share.model.User;
import com.ss.android.lark.mm.utils.ResString;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u0012\u0010\u001e\u001a\u00020\u00192\b\b\u0002\u0010\u001f\u001a\u00020\u000eH\u0002J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lcom/ss/android/lark/mm/module/share/permission/PermissionEntry;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "isModifyEnabled", "", "()Z", "setModifyEnabled", "(Z)V", "permission", "Lcom/ss/android/lark/mm/module/share/model/SharePermission;", "getPermission", "()Lcom/ss/android/lark/mm/module/share/model/SharePermission;", "setPermission", "(Lcom/ss/android/lark/mm/module/share/model/SharePermission;)V", "bindData", "", "user", "Lcom/ss/android/lark/mm/module/share/model/User;", "selfPermission", "init", "setPermissionStyle", "isEnabled", "setPermissionText", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PermissionEntry extends LinearLayout {

    /* renamed from: a */
    public SharePermission f118318a;

    /* renamed from: b */
    private boolean f118319b;

    /* renamed from: c */
    private HashMap f118320c;

    /* renamed from: a */
    public View mo165179a(int i) {
        if (this.f118320c == null) {
            this.f118320c = new HashMap();
        }
        View view = (View) this.f118320c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118320c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final SharePermission getPermission() {
        SharePermission sharePermission = this.f118318a;
        if (sharePermission == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permission");
        }
        return sharePermission;
    }

    /* renamed from: a */
    private final void m186083a() {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_permission_entry, this);
        setPadding(UIUtils.dp2px(getContext(), 12.0f), 0, 0, 0);
    }

    public final void setModifyEnabled(boolean z) {
        this.f118319b = z;
    }

    public final void setPermission(SharePermission sharePermission) {
        Intrinsics.checkParameterIsNotNull(sharePermission, "<set-?>");
        this.f118318a = sharePermission;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PermissionEntry(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    private final void setPermissionText(User user) {
        String str;
        TextView textView = (TextView) mo165179a(R.id.tvPermission);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvPermission");
        if (user.isOwner()) {
            str = ResString.f118656a.mo165504a(R.string.MMWeb_G_Owner);
        } else if (user.isEditable()) {
            str = ResString.f118656a.mo165504a(R.string.MMWeb_G_CanEdit);
        } else if (user.isReadable()) {
            str = ResString.f118656a.mo165504a(R.string.MMWeb_G_CanView);
        }
        textView.setText(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setPermissionStyle(boolean r7) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.share.permission.PermissionEntry.setPermissionStyle(boolean):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PermissionEntry(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo165180a(User user, SharePermission sharePermission) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(user, "user");
        Intrinsics.checkParameterIsNotNull(sharePermission, "selfPermission");
        setPermissionText(user);
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.ILoginDepend loginDepend = a.getLoginDepend();
        Intrinsics.checkExpressionValueIsNotNull(loginDepend, "MmDepend.impl().loginDepend");
        String a2 = loginDepend.mo144647a();
        if (a2 == null) {
            a2 = "";
        }
        boolean areEqual = Intrinsics.areEqual(a2, user.getUserId());
        boolean z2 = true;
        if ((sharePermission == SharePermission.OWNER || sharePermission == SharePermission.EDIT) && !user.isOwner()) {
            z = true;
        } else {
            z = false;
        }
        if (areEqual || !z) {
            z2 = false;
        }
        setPermissionStyle(z2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PermissionEntry(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PermissionEntry(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f118319b = true;
        m186083a();
    }
}
