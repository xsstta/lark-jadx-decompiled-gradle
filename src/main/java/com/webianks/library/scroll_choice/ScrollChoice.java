package com.webianks.library.scroll_choice;

import android.content.Context;
import android.util.AttributeSet;
import com.webianks.library.scroll_choice.WheelPicker;

public class ScrollChoice extends WheelPicker {

    /* renamed from: a */
    WheelPicker.C68083a f171254a;

    /* renamed from: l */
    private AbstractC68081a f171255l;

    /* renamed from: m */
    private int f171256m;

    /* renamed from: com.webianks.library.scroll_choice.ScrollChoice$a */
    public interface AbstractC68081a {
        /* renamed from: a */
        void mo236899a(ScrollChoice scrollChoice, int i, String str);
    }

    /* access modifiers changed from: protected */
    @Override // com.webianks.library.scroll_choice.WheelPicker
    /* renamed from: b */
    public void mo236894b(int i, Object obj) {
    }

    public int getDefaultItemIndex() {
        return this.f171256m;
    }

    @Override // com.webianks.library.scroll_choice.WheelPicker
    public int getDefaultItemPosition() {
        return this.f171256m;
    }

    public String getCurrentSelection() {
        return this.f171254a.mo236940b(getCurrentItemPosition());
    }

    public void setOnItemSelectedListener(AbstractC68081a aVar) {
        this.f171255l = aVar;
    }

    public ScrollChoice(Context context) {
        this(context, null);
    }

    public ScrollChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        WheelPicker.C68083a aVar = new WheelPicker.C68083a();
        this.f171254a = aVar;
        setAdapter(aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.webianks.library.scroll_choice.WheelPicker
    /* renamed from: a */
    public void mo236893a(int i, Object obj) {
        AbstractC68081a aVar = this.f171255l;
        if (aVar != null) {
            aVar.mo236899a(this, i, (String) obj);
        }
    }
}
