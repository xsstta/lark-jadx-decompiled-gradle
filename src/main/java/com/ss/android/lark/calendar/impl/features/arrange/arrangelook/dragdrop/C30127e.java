package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop;

import android.widget.FrameLayout;
import com.larksuite.framework.ui.dragger.C26201b;
import com.larksuite.framework.ui.dragger.C26204e;
import com.larksuite.framework.ui.dragger.C26205f;

/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.e */
public class C30127e extends C30129g<C30128f> {
    /* renamed from: a */
    public void mo108608a(C26204e eVar, C30128f fVar) {
        C30132j jVar = (C30132j) eVar.mo93204k();
        if (jVar != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jVar.getLayoutParams();
            int d = (layoutParams.height + ((int) eVar.mo93197d())) - (layoutParams.topMargin + layoutParams.height);
            int dragCircleRadius = jVar.getDragCircleRadius();
            if (!mo108633a(d, dragCircleRadius)) {
                layoutParams.height = mo108634b(d, dragCircleRadius);
                jVar.requestLayout();
                mo108631a(jVar.getChipViewLayoutParams());
            }
        }
    }

    /* renamed from: a */
    public void mo108605a(C26201b bVar, C30128f fVar) {
        super.mo108605a(bVar, (AbstractC30124b) fVar);
        C30132j jVar = (C30132j) bVar.mo93204k();
        if (jVar != null) {
            FrameLayout.LayoutParams chipViewLayoutParams = jVar.getChipViewLayoutParams();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jVar.getLayoutParams();
            int i = layoutParams.leftMargin;
            int i2 = layoutParams.topMargin;
            layoutParams.height = (((AbstractC30150o) mo108603a(AbstractC30150o.class)).mo108692a((float) i, (float) (chipViewLayoutParams.topMargin + chipViewLayoutParams.height)).top - i2) + jVar.getDragCircleRadius();
            jVar.requestLayout();
            mo108631a(jVar.getChipViewLayoutParams());
        }
    }

    /* renamed from: a */
    public void mo108609a(C26205f fVar, C30128f fVar2) {
        C30132j jVar = (C30132j) fVar.mo93204k();
        AbstractC30150o oVar = (AbstractC30150o) mo108603a(AbstractC30150o.class);
        if (jVar != null && oVar != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jVar.getLayoutParams();
            layoutParams.height = (oVar.mo108693b() - layoutParams.topMargin) + jVar.getDragCircleRadius();
            jVar.requestLayout();
            mo108631a(jVar.getChipViewLayoutParams());
        }
    }
}
