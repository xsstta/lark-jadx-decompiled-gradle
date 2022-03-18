package com.ss.android.lark.mm.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mm/widget/MmBubbleTagSwitch;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", UpdateKey.STATUS, "Lcom/ss/android/lark/mm/widget/MmBubbleTagSwitch$Status;", "init", "", "switch", "isExpanded", "", "Status", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmBubbleTagSwitch extends RelativeLayout {

    /* renamed from: a */
    private Status f118707a;

    /* renamed from: b */
    private HashMap f118708b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mm/widget/MmBubbleTagSwitch$Status;", "", "(Ljava/lang/String;I)V", "COLLAPSED", "EXPANDED", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Status {
        COLLAPSED,
        EXPANDED
    }

    /* renamed from: a */
    public View mo165575a(int i) {
        if (this.f118708b == null) {
            this.f118708b = new HashMap();
        }
        View view = (View) this.f118708b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118708b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmBubbleTagSwitch(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo165576a(boolean z) {
        if (z) {
            this.f118707a = Status.EXPANDED;
            RelativeLayout relativeLayout = (RelativeLayout) mo165575a(R.id.containerExpanded);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "containerExpanded");
            relativeLayout.setVisibility(0);
            RelativeLayout relativeLayout2 = (RelativeLayout) mo165575a(R.id.containerCollapsed);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "containerCollapsed");
            relativeLayout2.setVisibility(8);
        } else {
            this.f118707a = Status.COLLAPSED;
            RelativeLayout relativeLayout3 = (RelativeLayout) mo165575a(R.id.containerCollapsed);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout3, "containerCollapsed");
            relativeLayout3.setVisibility(0);
            RelativeLayout relativeLayout4 = (RelativeLayout) mo165575a(R.id.containerExpanded);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout4, "containerExpanded");
            relativeLayout4.setVisibility(8);
        }
        measure(-2, -1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmBubbleTagSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m186630a(AttributeSet attributeSet, int i) {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_tag_switch, this);
        setPadding(UIUtils.dp2px(getContext(), 10.0f), 0, 0, 0);
        mo165576a(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmBubbleTagSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f118707a = Status.COLLAPSED;
        m186630a(attributeSet, i);
    }
}
