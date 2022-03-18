package com.ss.android.lark.create.groupchat.impl.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.universe_design.dimension.UDDimension;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.anko.C70023a;
import org.jetbrains.anko.C70024b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 .2\u00020\u0001:\u0003./0B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020(H\u0002J\u000e\u0010)\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020\u001fH\u0002J\u0016\u0010,\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\tR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00061"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/widget/GroupModeSelector;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "btnLeft", "Landroid/view/View;", "btnMiddle", "btnRight", "leftBtnIv", "Landroid/widget/ImageView;", "leftBtnTv", "Landroid/widget/TextView;", "mOnClickListener", "Lcom/ss/android/lark/create/groupchat/impl/widget/GroupModeSelector$OnStatusChangeListener;", "getMOnClickListener", "()Lcom/ss/android/lark/create/groupchat/impl/widget/GroupModeSelector$OnStatusChangeListener;", "setMOnClickListener", "(Lcom/ss/android/lark/create/groupchat/impl/widget/GroupModeSelector$OnStatusChangeListener;)V", "middleBtnIv", "middleBtnTv", "rightBtnIv", "rightBtnTv", "rootLayoutView", UpdateKey.STATUS, "Lcom/ss/android/lark/create/groupchat/impl/widget/GroupModeSelector$SelectedStatus;", "getStatus", "()Lcom/ss/android/lark/create/groupchat/impl/widget/GroupModeSelector$SelectedStatus;", "setStatus", "(Lcom/ss/android/lark/create/groupchat/impl/widget/GroupModeSelector$SelectedStatus;)V", "changeBtnStatus", "", "x", C63954b.f161494a, "", "changeStatus", "onBeforeChangeStatus", "nextStatus", "setStatusBtnVisibility", "visibility", "Companion", "OnStatusChangeListener", "SelectedStatus", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class GroupModeSelector extends LinearLayout {

    /* renamed from: a */
    public static final Companion f93948a = new Companion(null);

    /* renamed from: b */
    private SelectedStatus f93949b;

    /* renamed from: c */
    private OnStatusChangeListener f93950c;

    /* renamed from: d */
    private final View f93951d;

    /* renamed from: e */
    private final View f93952e;

    /* renamed from: f */
    private final View f93953f;

    /* renamed from: g */
    private final View f93954g;

    /* renamed from: h */
    private final TextView f93955h;

    /* renamed from: i */
    private final ImageView f93956i;

    /* renamed from: j */
    private final TextView f93957j;

    /* renamed from: k */
    private final ImageView f93958k;

    /* renamed from: l */
    private final TextView f93959l;

    /* renamed from: m */
    private final ImageView f93960m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/widget/GroupModeSelector$OnStatusChangeListener;", "", "onBeforeChangeStatus", "", UpdateKey.STATUS, "Lcom/ss/android/lark/create/groupchat/impl/widget/GroupModeSelector$SelectedStatus;", "onChange", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.widget.GroupModeSelector$b */
    public interface OnStatusChangeListener {
        /* renamed from: a */
        boolean mo134258a(SelectedStatus selectedStatus);

        /* renamed from: b */
        void mo134259b(SelectedStatus selectedStatus);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/widget/GroupModeSelector$SelectedStatus;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "LEFT_SELECTED", "MIDDLE_SELECTED", "RIGHT_SELECTED", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum SelectedStatus {
        LEFT_SELECTED(0),
        MIDDLE_SELECTED(1),
        RIGHT_SELECTED(2);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        private SelectedStatus(int i) {
            this.value = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/widget/GroupModeSelector$Companion;", "", "()V", "SELECT_DRAWABLE_SIZE", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.widget.GroupModeSelector$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final OnStatusChangeListener getMOnClickListener() {
        return this.f93950c;
    }

    public final SelectedStatus getStatus() {
        return this.f93949b;
    }

    public final void setMOnClickListener(OnStatusChangeListener bVar) {
        this.f93950c = bVar;
    }

    public final void setStatus(SelectedStatus selectedStatus) {
        Intrinsics.checkParameterIsNotNull(selectedStatus, "<set-?>");
        this.f93949b = selectedStatus;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GroupModeSelector(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final boolean mo134268a(SelectedStatus selectedStatus) {
        OnStatusChangeListener bVar = this.f93950c;
        if (bVar == null || !bVar.mo134258a(selectedStatus)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo134269b(SelectedStatus selectedStatus) {
        Intrinsics.checkParameterIsNotNull(selectedStatus, UpdateKey.STATUS);
        this.f93949b = selectedStatus;
        int i = C36419a.f93964a[selectedStatus.ordinal()];
        if (i == 1) {
            mo134266a(1, true);
            mo134266a(2, false);
            mo134266a(3, false);
        } else if (i == 2) {
            mo134266a(2, true);
            mo134266a(1, false);
            mo134266a(3, false);
        } else if (i == 3) {
            mo134266a(3, true);
            mo134266a(1, false);
            mo134266a(2, false);
        }
        OnStatusChangeListener bVar = this.f93950c;
        if (bVar != null) {
            bVar.mo134259b(selectedStatus);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GroupModeSelector(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo134267a(SelectedStatus selectedStatus, int i) {
        Intrinsics.checkParameterIsNotNull(selectedStatus, UpdateKey.STATUS);
        int i2 = C36419a.f93965b[selectedStatus.ordinal()];
        if (i2 == 1) {
            this.f93952e.setVisibility(i);
        } else if (i2 == 2) {
            this.f93953f.setVisibility(i);
        } else if (i2 == 3) {
            this.f93954g.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final void mo134266a(int i, boolean z) {
        Context context = this.f93956i.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "leftBtnIv.context");
        Context context2 = this.f93956i.getContext();
        int i2 = R.color.static_white;
        Drawable iconDrawable = UDIconUtils.getIconDrawable(context, R.drawable.ud_icon_list_check_outlined, UIUtils.getColor(context2, R.color.static_white), new UDDimension.Dp(16.0f));
        int i3 = R.drawable.pattern_btn_selected_bg;
        if (i == 1) {
            View view = this.f93952e;
            if (!z) {
                i3 = R.drawable.pattern_btn_normal_bg;
            }
            C70024b.m268600a(view, i3);
            if (z) {
                this.f93956i.setImageDrawable(iconDrawable);
            } else {
                C70024b.m268601a(this.f93956i, (int) R.drawable.pattern_btn_normal_ic);
            }
            TextView textView = this.f93955h;
            if (!z) {
                i2 = R.color.text_title;
            }
            C70023a.m268599a(textView, i2);
            this.f93955h.setText(UIUtils.getString(getContext(), R.string.Lark_Group_CreateGroup_Mode_Default_Name));
        } else if (i == 2) {
            View view2 = this.f93953f;
            if (!z) {
                i3 = R.drawable.pattern_btn_normal_bg;
            }
            C70024b.m268600a(view2, i3);
            if (z) {
                this.f93958k.setImageDrawable(iconDrawable);
            } else {
                C70024b.m268601a(this.f93958k, (int) R.drawable.pattern_btn_normal_ic);
            }
            TextView textView2 = this.f93957j;
            if (!z) {
                i2 = R.color.text_title;
            }
            C70023a.m268599a(textView2, i2);
            this.f93957j.setText(UIUtils.getString(getContext(), R.string.Lark_Group_CreateGroup_Mode_Topic_Name));
        } else if (i == 3) {
            View view3 = this.f93954g;
            if (!z) {
                i3 = R.drawable.pattern_btn_normal_bg;
            }
            C70024b.m268600a(view3, i3);
            if (z) {
                this.f93960m.setImageDrawable(iconDrawable);
            } else {
                C70024b.m268601a(this.f93960m, (int) R.drawable.pattern_btn_normal_ic);
            }
            TextView textView3 = this.f93959l;
            if (!z) {
                i2 = R.color.text_title;
            }
            C70023a.m268599a(textView3, i2);
            this.f93959l.setText(UIUtils.getString(getContext(), R.string.Lark_Group_CreateGroup_Mode_Secret_Name));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupModeSelector(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f93949b = SelectedStatus.LEFT_SELECTED;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.selector_btn, (ViewGroup) this, true);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…selector_btn, this, true)");
        this.f93951d = inflate;
        View findViewById = inflate.findViewById(R.id.left_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootLayoutView.findViewById(R.id.left_layout)");
        this.f93952e = findViewById;
        View findViewById2 = inflate.findViewById(R.id.middle_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootLayoutView.findViewById(R.id.middle_layout)");
        this.f93953f = findViewById2;
        View findViewById3 = inflate.findViewById(R.id.right_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootLayoutView.findViewById(R.id.right_layout)");
        this.f93954g = findViewById3;
        View findViewById4 = findViewById.findViewById(R.id.left_name_tv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "btnLeft.findViewById<TextView>(R.id.left_name_tv)");
        this.f93955h = (TextView) findViewById4;
        View findViewById5 = findViewById.findViewById(R.id.left_ic_iv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "btnLeft.findViewById<ImageView>(R.id.left_ic_iv)");
        this.f93956i = (ImageView) findViewById5;
        View findViewById6 = findViewById2.findViewById(R.id.middle_name_tv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "btnMiddle.findViewById<T…iew>(R.id.middle_name_tv)");
        this.f93957j = (TextView) findViewById6;
        View findViewById7 = findViewById2.findViewById(R.id.middle_ic_iv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "btnMiddle.findViewById<I…eView>(R.id.middle_ic_iv)");
        this.f93958k = (ImageView) findViewById7;
        View findViewById8 = findViewById3.findViewById(R.id.right_name_tv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "btnRight.findViewById<Te…View>(R.id.right_name_tv)");
        this.f93959l = (TextView) findViewById8;
        View findViewById9 = findViewById3.findViewById(R.id.right_ic_iv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "btnRight.findViewById<ImageView>(R.id.right_ic_iv)");
        this.f93960m = (ImageView) findViewById9;
        mo134266a(1, true);
        mo134266a(2, false);
        mo134266a(3, false);
        findViewById.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.lark.create.groupchat.impl.widget.GroupModeSelector.View$OnClickListenerC364161 */

            /* renamed from: a */
            final /* synthetic */ GroupModeSelector f93961a;

            {
                this.f93961a = r1;
            }

            public final void onClick(View view) {
                if (!this.f93961a.mo134268a(SelectedStatus.LEFT_SELECTED)) {
                    this.f93961a.mo134266a(1, true);
                    this.f93961a.mo134266a(2, false);
                    this.f93961a.mo134266a(3, false);
                    this.f93961a.setStatus(SelectedStatus.LEFT_SELECTED);
                    OnStatusChangeListener mOnClickListener = this.f93961a.getMOnClickListener();
                    if (mOnClickListener != null) {
                        mOnClickListener.mo134259b(SelectedStatus.LEFT_SELECTED);
                    }
                }
            }
        });
        findViewById2.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.lark.create.groupchat.impl.widget.GroupModeSelector.View$OnClickListenerC364172 */

            /* renamed from: a */
            final /* synthetic */ GroupModeSelector f93962a;

            {
                this.f93962a = r1;
            }

            public final void onClick(View view) {
                if (!this.f93962a.mo134268a(SelectedStatus.MIDDLE_SELECTED)) {
                    this.f93962a.mo134266a(2, true);
                    this.f93962a.mo134266a(1, false);
                    this.f93962a.mo134266a(3, false);
                    this.f93962a.setStatus(SelectedStatus.MIDDLE_SELECTED);
                    OnStatusChangeListener mOnClickListener = this.f93962a.getMOnClickListener();
                    if (mOnClickListener != null) {
                        mOnClickListener.mo134259b(SelectedStatus.MIDDLE_SELECTED);
                    }
                }
            }
        });
        findViewById3.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.lark.create.groupchat.impl.widget.GroupModeSelector.View$OnClickListenerC364183 */

            /* renamed from: a */
            final /* synthetic */ GroupModeSelector f93963a;

            {
                this.f93963a = r1;
            }

            public final void onClick(View view) {
                if (!this.f93963a.mo134268a(SelectedStatus.RIGHT_SELECTED)) {
                    this.f93963a.mo134266a(3, true);
                    this.f93963a.mo134266a(1, false);
                    this.f93963a.mo134266a(2, false);
                    this.f93963a.setStatus(SelectedStatus.RIGHT_SELECTED);
                    OnStatusChangeListener mOnClickListener = this.f93963a.getMOnClickListener();
                    if (mOnClickListener != null) {
                        mOnClickListener.mo134259b(SelectedStatus.RIGHT_SELECTED);
                    }
                }
            }
        });
    }
}
