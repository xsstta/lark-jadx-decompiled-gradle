package com.ss.android.lark.mm.module.share.permission;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.share.model.SharePermission;
import com.ss.android.lark.mm.widget.BoldTextView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ1\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00140\u0018J\"\u0010\u001b\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0016H\u0002J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0016H\u0016R\u001a\u0010\r\u001a\u00020\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/ss/android/lark/mm/module/share/permission/PermissionMenu;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "permission", "Lcom/ss/android/lark/mm/module/share/model/SharePermission;", "getPermission", "()Lcom/ss/android/lark/mm/module/share/model/SharePermission;", "setPermission", "(Lcom/ss/android/lark/mm/module/share/model/SharePermission;)V", "bindData", "", "isChecked", "", "onSelected", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "init", "setDanger", "isDanger", "setSelected", "selected", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PermissionMenu extends RelativeLayout {

    /* renamed from: a */
    public SharePermission f118321a;

    /* renamed from: b */
    private HashMap f118322b;

    /* renamed from: a */
    public View mo165184a(int i) {
        if (this.f118322b == null) {
            this.f118322b = new HashMap();
        }
        View view = (View) this.f118322b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118322b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final SharePermission getPermission() {
        SharePermission sharePermission = this.f118321a;
        if (sharePermission == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permission");
        }
        return sharePermission;
    }

    public final void setPermission(SharePermission sharePermission) {
        Intrinsics.checkParameterIsNotNull(sharePermission, "<set-?>");
        this.f118321a = sharePermission;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.permission.PermissionMenu$a */
    static final class View$OnClickListenerC47009a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PermissionMenu f118323a;

        /* renamed from: b */
        final /* synthetic */ Function1 f118324b;

        View$OnClickListenerC47009a(PermissionMenu permissionMenu, Function1 function1) {
            this.f118323a = permissionMenu;
            this.f118324b = function1;
        }

        public final void onClick(View view) {
            this.f118324b.invoke(this.f118323a.getPermission());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PermissionMenu(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public void setSelected(boolean z) {
        int i;
        super.setSelected(z);
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo165184a(R.id.ivState);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "ivState");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        appCompatImageView.setVisibility(i);
    }

    private final void setDanger(boolean z) {
        int i;
        BoldTextView boldTextView = (BoldTextView) mo165184a(R.id.tvTitle);
        if (z) {
            i = UIUtils.getColor(getContext(), R.color.lkui_R500);
        } else {
            i = Color.parseColor("#212121");
        }
        boldTextView.setTextColor(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PermissionMenu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo165185a(boolean z, Function1<? super SharePermission, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "onSelected");
        setSelected(z);
        if (!z) {
            setOnClickListener(new View$OnClickListenerC47009a(this, function1));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PermissionMenu(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m186086a(AttributeSet attributeSet, int i, int i2) {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_permission_menu, this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.share_menu_is_danger, R.attr.share_menu_title, R.attr.share_permission}, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…tr, defStyleRes\n        )");
        String string = obtainStyledAttributes.getString(1);
        BoldTextView boldTextView = (BoldTextView) mo165184a(R.id.tvTitle);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvTitle");
        boldTextView.setText(string);
        setDanger(obtainStyledAttributes.getBoolean(0, false));
        String string2 = obtainStyledAttributes.getString(2);
        if (string2 == null) {
            string2 = "";
        }
        this.f118321a = SharePermission.valueOf(string2);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PermissionMenu(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m186086a(attributeSet, i, i2);
    }
}
