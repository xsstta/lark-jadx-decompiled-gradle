package com.larksuite.component.universe_design.datepicker.impl.listener;

import android.graphics.Canvas;
import android.graphics.Typeface;
import com.larksuite.component.universe_design.datepicker.impl.data.BaseDay;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/impl/listener/IDayRender;", "", "drawDay", "", "canvas", "Landroid/graphics/Canvas;", "baseDay", "Lcom/larksuite/component/universe_design/datepicker/impl/data/BaseDay;", "getCellHeight", "", "setMonthTextSize", "textSize", "", "setTypeFace", "typeFace", "Landroid/graphics/Typeface;", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.datepicker.impl.a.a */
public interface IDayRender {
    /* renamed from: a */
    int mo90473a();

    /* renamed from: a */
    void mo90474a(float f);

    /* renamed from: a */
    void mo90475a(Canvas canvas, BaseDay aVar);

    /* renamed from: a */
    void mo90476a(Typeface typeface);
}
