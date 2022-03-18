package com.ss.android.lark.widget.recyclerview.hive;

import android.view.MotionEvent;
import android.view.View;

public interface ICellHoverHandler<Value> {

    public @interface HOVER_TYPE {
    }

    /* renamed from: a */
    void mo122222a(View view, AbstractC59004b bVar, AbstractC59010e eVar, Value value);

    /* renamed from: a */
    boolean mo122224a(View view, AbstractC59004b bVar, AbstractC59010e eVar, Value value, MotionEvent motionEvent, int i);

    /* renamed from: a */
    boolean mo122226a(AbstractC59004b bVar, AbstractC59010e eVar, Value value);

    /* renamed from: b */
    void mo122228b(View view, AbstractC59004b bVar, AbstractC59010e eVar, Value value);

    /* renamed from: b */
    boolean mo122230b(AbstractC59004b bVar, AbstractC59010e eVar, Value value);

    /* renamed from: c */
    void mo122232c(View view, AbstractC59004b bVar, AbstractC59010e eVar, Value value);

    /* renamed from: c */
    boolean mo122234c(AbstractC59004b bVar, AbstractC59010e eVar, Value value);
}
