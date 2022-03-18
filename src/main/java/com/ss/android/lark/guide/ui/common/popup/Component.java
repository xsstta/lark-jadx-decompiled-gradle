package com.ss.android.lark.guide.ui.common.popup;

import android.content.Context;
import android.graphics.Rect;
import android.util.Size;
import android.widget.LinearLayout;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J \u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J \u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0003H&J \u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H&¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/guide/ui/common/popup/Component;", "", "getAnchorFit", "", "getAnchorGravity", "getCrossOffset", "containerView", "Landroid/widget/LinearLayout;", "containerWH", "Landroid/util/Size;", "anchorRect", "Landroid/graphics/Rect;", "getMainOffset", "onAlignChanged", "", "offset", "onCreateView", "context", "Landroid/content/Context;", "guide", "Lcom/ss/android/lark/guide/ui/common/popup/IGuide;", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guide.ui.common.popup.b */
public interface Component {
    /* renamed from: a */
    int mo141300a();

    /* renamed from: a */
    int mo141301a(LinearLayout linearLayout, Size size, Rect rect);

    /* renamed from: a */
    void mo141302a(Context context, LinearLayout linearLayout, IGuide fVar);

    /* renamed from: a */
    void mo141303a(LinearLayout linearLayout, Size size, int i);

    /* renamed from: b */
    int mo141304b();

    /* renamed from: b */
    int mo141305b(LinearLayout linearLayout, Size size, Rect rect);
}
