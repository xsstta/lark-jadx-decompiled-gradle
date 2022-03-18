package com.ss.android.lark.guide.biz.bubble.chat;

import android.content.Context;
import android.graphics.Rect;
import android.util.Size;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.ui.common.popup.Component;
import com.ss.android.lark.guide.ui.common.popup.IGuide;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH\u0004J \u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\fH\u0002J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0004H\u0016J \u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/guide/biz/bubble/chat/BaseInputMessageTip;", "Lcom/ss/android/lark/guide/ui/common/popup/Component;", "()V", "getAnchorFit", "", "getAnchorGravity", "getContent", "", "getContext", "Landroid/content/Context;", "getCrossOffset", "containerView", "Landroid/widget/LinearLayout;", "containerWH", "Landroid/util/Size;", "anchorRect", "Landroid/graphics/Rect;", "getMainOffset", "getTitle", "initViews", "", "onAlignChanged", "offset", "onCreateView", "context", "guide", "Lcom/ss/android/lark/guide/ui/common/popup/IGuide;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.a.a.a */
public abstract class BaseInputMessageTip implements Component {
    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: a */
    public int mo141300a() {
        return 2;
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: a */
    public int mo141301a(LinearLayout linearLayout, Size size, Rect rect) {
        Intrinsics.checkParameterIsNotNull(linearLayout, "containerView");
        Intrinsics.checkParameterIsNotNull(size, "containerWH");
        Intrinsics.checkParameterIsNotNull(rect, "anchorRect");
        return 0;
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: a */
    public void mo141303a(LinearLayout linearLayout, Size size, int i) {
        Intrinsics.checkParameterIsNotNull(linearLayout, "containerView");
        Intrinsics.checkParameterIsNotNull(size, "containerWH");
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: b */
    public int mo141304b() {
        return 16;
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: b */
    public int mo141305b(LinearLayout linearLayout, Size size, Rect rect) {
        Intrinsics.checkParameterIsNotNull(linearLayout, "containerView");
        Intrinsics.checkParameterIsNotNull(size, "containerWH");
        Intrinsics.checkParameterIsNotNull(rect, "anchorRect");
        return 0;
    }

    /* renamed from: c */
    public String mo141306c() {
        return "";
    }

    /* renamed from: d */
    public abstract String mo141307d();

    /* renamed from: a */
    private final void m152104a(LinearLayout linearLayout) {
        boolean z;
        ((TextView) linearLayout.findViewById(R.id.tip_content)).setText(mo141307d());
        String c = mo141306c();
        if (c == null || StringsKt.isBlank(c)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TextView textView = (TextView) linearLayout.findViewById(R.id.tip_title);
            Intrinsics.checkExpressionValueIsNotNull(textView, "this");
            textView.setVisibility(8);
            return;
        }
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.tip_title);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "this");
        textView2.setVisibility(0);
        textView2.setText(c);
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: a */
    public void mo141302a(Context context, LinearLayout linearLayout, IGuide fVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(linearLayout, "containerView");
        Intrinsics.checkParameterIsNotNull(fVar, "guide");
        LayoutInflater.from(context).inflate(R.layout.guide_new_onboarding_input_message_tip, linearLayout);
        m152104a(linearLayout);
    }
}
