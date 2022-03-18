package com.bytedance.ee.bear.facade.common.widget.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27128g;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;

public class PlaceholderHeader extends View implements AbstractC7741a {

    /* renamed from: a */
    private AbstractC7741a f20975a;

    /* renamed from: a */
    private void m30993a(Context context, AttributeSet attributeSet) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public void mo30298a(float f, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public boolean mo30301a() {
        return false;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: b */
    public void mo30304b(AbstractC27129h hVar, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void b_(float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public View getView() {
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public void setPrimaryColors(int... iArr) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public SpinnerStyle getSpinnerStyle() {
        return SpinnerStyle.Translate;
    }

    @Override // com.bytedance.ee.bear.facade.common.widget.recyclerview.AbstractC7741a
    public void setAssociatedHeader(AbstractC7741a aVar) {
        this.f20975a = aVar;
    }

    public PlaceholderHeader(Context context) {
        super(context);
        m30993a(context, (AttributeSet) null);
    }

    @Override // com.bytedance.ee.bear.facade.common.widget.recyclerview.AbstractC7741a
    public void setCustomText(String str) {
        AbstractC7741a aVar = this.f20975a;
        if (aVar != null) {
            aVar.setCustomText(str);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.widget.recyclerview.AbstractC7741a
    public void setStartNumber(int i) {
        AbstractC7741a aVar = this.f20975a;
        if (aVar != null) {
            aVar.setStartNumber(i);
        }
    }

    public PlaceholderHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30993a(context, attributeSet);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public int mo30297a(AbstractC27129h hVar, boolean z) {
        AbstractC7741a aVar = this.f20975a;
        if (aVar != null) {
            return aVar.mo30297a(hVar, z);
        }
        return ParticipantRepo.f117150c;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void a_(AbstractC27129h hVar, int i, int i2) {
        AbstractC7741a aVar = this.f20975a;
        if (aVar != null) {
            aVar.a_(hVar, i, i2);
        }
    }

    public PlaceholderHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30993a(context, attributeSet);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public void mo30299a(AbstractC27128g gVar, int i, int i2) {
        AbstractC7741a aVar = this.f20975a;
        if (aVar != null) {
            aVar.mo30299a(gVar, i, i2);
        }
    }

    @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27141e
    /* renamed from: a */
    public void mo30300a(AbstractC27129h hVar, RefreshState refreshState, RefreshState refreshState2) {
        AbstractC7741a aVar = this.f20975a;
        if (aVar != null) {
            aVar.mo30300a(hVar, refreshState, refreshState2);
        }
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void a_(float f, int i, int i2, int i3) {
        AbstractC7741a aVar = this.f20975a;
        if (aVar != null) {
            aVar.a_(f, i, i2, i3);
        }
    }
}
