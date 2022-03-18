package com.ss.android.photoeditor.ve.view;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/ss/android/photoeditor/ve/view/ColorViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "colorSelectedView", "colorView", "Landroid/widget/ImageView;", "getColorView", "()Landroid/widget/ImageView;", "bindData", "", "colorInt", "", "notifySelected", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.ve.view.b */
public final class ColorViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final ImageView f149473a;

    /* renamed from: b */
    private final View f149474b;

    /* renamed from: a */
    public final ImageView mo204170a() {
        return this.f149473a;
    }

    /* renamed from: b */
    public final void mo204172b() {
        if (this.f149473a.isSelected()) {
            this.f149474b.setVisibility(0);
        } else {
            this.f149474b.setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ColorViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        View findViewById = view.findViewById(R.id.iv_color_view);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.iv_color_view)");
        this.f149473a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.iv_color_selected);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.iv_color_selected)");
        this.f149474b = findViewById2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003c, code lost:
        if (r5 == r1.getResources().getColor(com.larksuite.suite.R.color.lkui_N1000)) goto L_0x003e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo204171a(int r5) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.photoeditor.ve.view.ColorViewHolder.mo204171a(int):void");
    }
}
