package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop;

import android.widget.FrameLayout;
import com.larksuite.framework.ui.dragger.C26201b;
import com.larksuite.framework.ui.dragger.C26204e;
import com.larksuite.framework.ui.dragger.C26205f;

/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.v */
public class C30157v extends C30129g<C30158w> {
    /* renamed from: a */
    public void mo108605a(C26201b bVar, C30158w wVar) {
        super.mo108605a(bVar, (AbstractC30124b) wVar);
        C30132j jVar = (C30132j) bVar.mo93204k();
        if (jVar != null) {
            FrameLayout.LayoutParams chipViewLayoutParams = jVar.getChipViewLayoutParams();
            int i = chipViewLayoutParams.leftMargin;
            int i2 = chipViewLayoutParams.topMargin;
            int i3 = ((AbstractC30150o) mo108603a(AbstractC30150o.class)).mo108692a((float) i, (float) i2).top - i2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jVar.getLayoutParams();
            layoutParams.topMargin += i3;
            layoutParams.height -= i3;
            jVar.requestLayout();
            mo108631a(jVar.getChipViewLayoutParams());
        }
    }

    /* renamed from: a */
    public void mo108608a(C26204e eVar, C30158w wVar) {
        C30132j jVar = (C30132j) eVar.mo93204k();
        if (jVar != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jVar.getLayoutParams();
            int d = (int) eVar.mo93197d();
            int i = (layoutParams.topMargin + layoutParams.height) - d;
            int dragCircleRadius = wVar.getDragCircleRadius();
            if (!mo108633a(i, dragCircleRadius)) {
                int b = mo108634b(i, dragCircleRadius);
                layoutParams.topMargin = d + (i - b);
                layoutParams.height = b;
                jVar.requestLayout();
                mo108631a(jVar.getChipViewLayoutParams());
            }
        }
    }

    /* renamed from: a */
    public void mo108609a(C26205f fVar, C30158w wVar) {
        C30132j jVar = (C30132j) fVar.mo93204k();
        AbstractC30150o oVar = (AbstractC30150o) mo108603a(AbstractC30150o.class);
        if (jVar != null && oVar != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jVar.getLayoutParams();
            int i = layoutParams.topMargin;
            int a = oVar.mo108690a() - jVar.getDragCircleRadius();
            layoutParams.topMargin = a;
            layoutParams.height += i - a;
            jVar.requestLayout();
            mo108631a(jVar.getChipViewLayoutParams());
        }
    }
}
