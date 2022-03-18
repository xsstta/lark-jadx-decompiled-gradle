package com.ss.lark.android.passport.biz.compat.web.jsbridge;

import android.app.Activity;
import android.content.ClipboardManager;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.jsbridge.AbstractC40669e;
import com.ss.android.lark.passport.infra.log.PassportLog;

public class CopyTextHandler extends AbstractC64564a {

    /* renamed from: a */
    private final Activity f162995a;

    public static class Model extends BaseJSModel {
        public String text;
    }

    @Override // com.ss.lark.android.passport.biz.compat.web.jsbridge.AbstractC64564a
    /* renamed from: a */
    public String mo223288a() {
        return "biz.util.copyText";
    }

    public CopyTextHandler(Activity activity) {
        this.f162995a = activity;
    }

    @Override // com.ss.lark.android.passport.biz.compat.web.jsbridge.AbstractC64564a, com.ss.android.lark.jsbridge.AbstractC40665a
    /* renamed from: a */
    public void mo146778a(String str, AbstractC40669e eVar) {
        ClipboardManager clipboardManager;
        PassportLog.f123351c.mo171474a().mo171465b("Bridge", String.format("%s : %s", "CopyTextHandler", str));
        Model model = (Model) C38760a.m153056a(str, Model.class);
        Activity activity = this.f162995a;
        if (activity != null && model != null && (clipboardManager = (ClipboardManager) activity.getSystemService("clipboard")) != null) {
            clipboardManager.setText(model.text);
        }
    }
}
