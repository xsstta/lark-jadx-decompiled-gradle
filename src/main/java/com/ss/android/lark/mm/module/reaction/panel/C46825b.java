package com.ss.android.lark.mm.module.reaction.panel;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.lark.reaction.p2557b.C52986b;

/* renamed from: com.ss.android.lark.mm.module.reaction.panel.b */
public class C46825b {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mm.module.reaction.panel.b$a */
    public static class C46826a {

        /* renamed from: a */
        public static C46825b f117879a = new C46825b();
    }

    /* renamed from: a */
    public static C46825b m185521a() {
        return C46826a.f117879a;
    }

    /* renamed from: b */
    private Bitmap m185522b(String str) {
        return C52986b.m205218b(str);
    }

    /* renamed from: a */
    public Bitmap mo164505a(String str) {
        Bitmap b = m185522b(str);
        if (b != null) {
            return Bitmap.createScaledBitmap(b, C45851c.m181650c(R.dimen.dp_14), C45851c.m181650c(R.dimen.dp_14), true);
        }
        return null;
    }

    /* renamed from: a */
    public void mo164506a(ImageView imageView, String str) {
        C52977a.m205190a().mo180995a(imageView, str);
    }
}
