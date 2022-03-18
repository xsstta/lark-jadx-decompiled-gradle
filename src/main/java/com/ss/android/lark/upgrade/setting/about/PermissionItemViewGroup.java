package com.ss.android.lark.upgrade.setting.about;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/upgrade/setting/about/PermissionItemViewGroup;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "Lcom/ss/android/lark/upgrade/setting/about/PermissionItemViewGroup$Status;", UpdateKey.STATUS, "getStatus", "()Lcom/ss/android/lark/upgrade/setting/about/PermissionItemViewGroup$Status;", "setStatus", "(Lcom/ss/android/lark/upgrade/setting/about/PermissionItemViewGroup$Status;)V", "statusText", "Landroid/widget/TextView;", "getStatusText", "()Landroid/widget/TextView;", "subtitleText", "getSubtitleText", "titleText", "getTitleText", "Status", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PermissionItemViewGroup extends ConstraintLayout {

    /* renamed from: a */
    private final TextView f142122a;

    /* renamed from: b */
    private final TextView f142123b;

    /* renamed from: c */
    private final TextView f142124c;

    /* renamed from: d */
    private Status f142125d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/upgrade/setting/about/PermissionItemViewGroup$Status;", "", "(Ljava/lang/String;I)V", "ON", "OFF", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Status {
        ON,
        OFF
    }

    public PermissionItemViewGroup(Context context) {
        this(context, null, 2, null);
    }

    public final Status getStatus() {
        return this.f142125d;
    }

    public final TextView getStatusText() {
        return this.f142124c;
    }

    public final TextView getSubtitleText() {
        return this.f142123b;
    }

    public final TextView getTitleText() {
        return this.f142122a;
    }

    public final void setStatus(Status status) {
        int i;
        Intrinsics.checkParameterIsNotNull(status, "value");
        this.f142125d = status;
        TextView textView = this.f142124c;
        if (status == Status.ON) {
            i = R.string.Lark_CoreAccess_AccessPermissionOn_Status;
        } else {
            i = R.string.Lark_CoreAccess_AccessPermission_GoToSettings;
        }
        textView.setText(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PermissionItemViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        ConstraintLayout.inflate(context, R.layout.permission_detail_item, this);
        View findViewById = findViewById(R.id.item_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.item_title)");
        TextView textView = (TextView) findViewById;
        this.f142122a = textView;
        View findViewById2 = findViewById(R.id.item_subtitle);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.item_subtitle)");
        TextView textView2 = (TextView) findViewById2;
        this.f142123b = textView2;
        View findViewById3 = findViewById(R.id.item_status);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.item_status)");
        this.f142124c = (TextView) findViewById3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.piv_status, R.attr.piv_subtitle, R.attr.piv_title});
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr….PermissionItemViewGroup)");
        textView.setText(obtainStyledAttributes.getString(2));
        textView2.setText(obtainStyledAttributes.getString(1));
        obtainStyledAttributes.recycle();
        int dp2px = UIUtils.dp2px(context, 16.0f);
        int dp2px2 = UIUtils.dp2px(context, 12.0f);
        setPadding(dp2px, dp2px2, dp2px, dp2px2);
        this.f142125d = Status.OFF;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PermissionItemViewGroup(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
