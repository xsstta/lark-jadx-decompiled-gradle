package com.larksuite.framework.palette.di;

import com.larksuite.framework.palette.colour.BaseColour;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u001c\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005H&J\b\u0010\b\u001a\u00020\tH'¨\u0006\n"}, d2 = {"Lcom/larksuite/framework/palette/di/IInnerColourFactory;", "", "getColourAttr", "", "getColourMap", "", "Ljava/lang/Class;", "Lcom/larksuite/framework/palette/colour/BaseColour;", "getPaletteStyleable", "", "palette_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.framework.palette.c.a */
public interface IInnerColourFactory {
    /* renamed from: a */
    int[] mo92645a();

    /* renamed from: b */
    int mo92646b();

    /* renamed from: c */
    Map<Integer, Class<? extends BaseColour>> mo92647c();
}
