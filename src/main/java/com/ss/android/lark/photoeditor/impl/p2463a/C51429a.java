package com.ss.android.lark.photoeditor.impl.p2463a;

import android.content.Context;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.photoeditor.LarkPhotoEditorModule;

/* renamed from: com.ss.android.lark.photoeditor.impl.a.a */
public class C51429a implements AbstractC51431b {

    /* renamed from: a */
    public Context f127970a;

    /* renamed from: b */
    public String f127971b;

    /* renamed from: c */
    private boolean f127972c;

    @Override // com.ss.android.lark.photoeditor.impl.p2463a.AbstractC51431b
    /* renamed from: a */
    public Runnable mo177084a() {
        return new Runnable() {
            /* class com.ss.android.lark.photoeditor.impl.p2463a.C51429a.RunnableC514301 */

            public void run() {
                LarkPhotoEditorModule.m199349a().mo102819a(C51429a.this.f127970a, C51429a.this.f127971b, 16);
            }
        };
    }

    @Override // com.ss.android.lark.photoeditor.impl.p2463a.AbstractC51431b
    /* renamed from: b */
    public String mo177085b() {
        return UIUtils.getString(this.f127970a, R.string.Lark_Legacy_MenuForward);
    }

    @Override // com.ss.android.lark.photoeditor.impl.p2463a.AbstractC51431b
    /* renamed from: c */
    public boolean mo177086c() {
        if (!this.f127972c || DesktopUtil.m144301a(this.f127970a)) {
            return false;
        }
        return true;
    }

    public C51429a(Context context, boolean z, String str) {
        this.f127970a = context;
        this.f127972c = z;
        this.f127971b = str;
    }
}
