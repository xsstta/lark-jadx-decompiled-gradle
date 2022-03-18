package com.ss.android.lark.image.entity;

import android.graphics.drawable.GradientDrawable;
import java.util.Objects;

/* renamed from: com.ss.android.lark.image.entity.a */
public class C38823a extends GradientDrawable {

    /* renamed from: a */
    private int f99771a;

    @Override // android.graphics.drawable.GradientDrawable
    public void setColor(int i) {
        super.setColor(i);
        this.f99771a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38823a)) {
            return false;
        }
        C38823a aVar = (C38823a) obj;
        if (!Objects.equals(Integer.valueOf(getIntrinsicWidth()), Integer.valueOf(aVar.getIntrinsicWidth())) || !Objects.equals(Integer.valueOf(getIntrinsicHeight()), Integer.valueOf(aVar.getIntrinsicHeight())) || !Objects.equals(Integer.valueOf(this.f99771a), Integer.valueOf(aVar.f99771a))) {
            return false;
        }
        return true;
    }
}
