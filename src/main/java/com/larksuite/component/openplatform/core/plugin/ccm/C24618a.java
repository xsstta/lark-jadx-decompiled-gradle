package com.larksuite.component.openplatform.core.plugin.ccm;

import android.graphics.BitmapFactory;
import com.bytedance.ee.log.C13479a;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.refer.common.annotation.ApiHandler;
import com.tt.refer.impl.business.file.TTFileHelper;
import java.io.File;

@ApiHandler(eventName = "editorFilePathConvert")
/* renamed from: com.larksuite.component.openplatform.core.plugin.ccm.a */
public class C24618a extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "editorFilePathConvert";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        if (TTFileHelper.m264259a("editorFilePathConvert", this.iAppContext)) {
            return m89694a();
        }
        return m89696b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0191  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m89696b() {
        /*
        // Method dump skipped, instructions count: 504
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.ccm.C24618a.m89696b():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x017a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m89694a() {
        /*
        // Method dump skipped, instructions count: 552
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.ccm.C24618a.m89694a():java.lang.String");
    }

    /* renamed from: a */
    private int[] m89695a(File file) {
        if (file == null) {
            C13479a.m54758a("ImageUtil", "getSize(): file is null");
            return new int[]{0, 0};
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return new int[]{options.outWidth, options.outHeight};
    }

    public C24618a(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
