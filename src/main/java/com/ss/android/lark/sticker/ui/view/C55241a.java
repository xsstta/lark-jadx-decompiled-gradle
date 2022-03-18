package com.ss.android.lark.sticker.ui.view;

import android.content.Context;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.p2936e.AbstractC58438c;
import com.ss.android.lark.widget.p2936e.C58436a;
import com.ss.android.lark.widget.p2936e.C58437b;

/* renamed from: com.ss.android.lark.sticker.ui.view.a */
public class C55241a extends AbstractC58438c {

    /* renamed from: a */
    private Context f136318a;

    public C55241a(Context context) {
        super(context);
        this.f136318a = context;
    }

    @Override // com.ss.android.lark.widget.p2936e.AbstractC58438c
    /* renamed from: a */
    public C58436a mo188247a(int i) {
        int i2 = i % 5;
        if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) {
            return new C58437b().mo197841a(true, UIUtils.getColor(this.f136318a, R.color.bg_base), 2.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED).mo197842b(true, UIUtils.getColor(this.f136318a, R.color.bg_base), 2.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED).mo197840a();
        }
        if (i2 != 4) {
            return null;
        }
        return new C58437b().mo197842b(true, UIUtils.getColor(this.f136318a, R.color.bg_base), 2.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED).mo197840a();
    }
}
