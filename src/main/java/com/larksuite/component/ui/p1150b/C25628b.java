package com.larksuite.component.ui.p1150b;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* access modifiers changed from: package-private */
/* renamed from: com.larksuite.component.ui.b.b */
public class C25628b {
    /* renamed from: a */
    public static Bitmap m91677a(Context context, Bitmap bitmap, int i) {
        RenderScript create = RenderScript.create(context);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setInput(createFromBitmap);
        create2.setRadius((float) i);
        create2.forEach(createTyped);
        createTyped.copyTo(bitmap);
        create.destroy();
        return bitmap;
    }
}
