package com.tt.option.ext;

import android.view.View;
import com.tt.frontendapiinterface.IBaseRender;
import com.tt.miniapp.component.nativeview.AbstractC65886f;
import com.tt.miniapp.view.webcore.C67231a;
import com.tt.miniapp.view.webcore.C67257d;

/* renamed from: com.tt.option.ext.i */
public interface AbstractC67624i {
    boolean enableTTRender(View view);

    boolean enableTTRender(String str);

    AbstractC65886f getNativeComponentView(String str, int i, int i2, C67231a aVar, C67257d dVar, IBaseRender iBaseRender);
}
