package com.bytedance.ee.bear.wiki.wikitree.tree;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.DialogC0259b;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.l */
class C12156l {

    /* renamed from: a */
    private DialogC0259b f32727a;

    C12156l() {
    }

    /* renamed from: a */
    public void mo46480a() {
        DialogC0259b bVar = this.f32727a;
        if (bVar != null && bVar.isShowing()) {
            this.f32727a.dismiss();
        }
    }

    /* renamed from: e */
    public void mo46487e(Context context, DialogInterface.OnDismissListener onDismissListener) {
        mo46482a(context, onDismissListener, R.string.Doc_Wiki_Reload);
    }

    /* renamed from: f */
    public void mo46488f(Context context, DialogInterface.OnDismissListener onDismissListener) {
        mo46484b(context, onDismissListener, R.string.Doc_Wiki_Reload);
    }

    /* renamed from: a */
    public void mo46481a(Context context, DialogInterface.OnDismissListener onDismissListener) {
        mo46480a();
        DialogC25637f b = new C25639g(context).mo89263v(R.color.bg_body).mo89256o(R.color.text_title).mo89253l(8388611).mo89254m(R.string.Doc_Wiki_PageWasCanceled).mo89248g(R.string.Doc_Wiki_PermissionChanged).mo89250i(R.color.text_title).mo89238b(true).mo89247e(false).mo89245d(0.3f).mo89257p(17).mo89227a(onDismissListener).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89269b(R.string.Doc_Wiki_Known).mo89267a($$Lambda$l$UrIl4dLGtJkmIXH_LfdlZa3IwM.INSTANCE).mo89271d(R.color.function_danger_500)).mo89233b();
        this.f32727a = b;
        b.show();
    }

    /* renamed from: b */
    public void mo46483b(Context context, DialogInterface.OnDismissListener onDismissListener) {
        mo46480a();
        DialogC25637f b = new C25639g(context).mo89263v(R.color.bg_body).mo89256o(R.color.text_title).mo89253l(8388611).mo89254m(R.string.Doc_Wiki_SpaceNoPermission).mo89248g(R.string.Doc_Wiki_PermissionChanged).mo89250i(R.color.text_title).mo89238b(true).mo89247e(false).mo89245d(0.3f).mo89257p(17).mo89227a(onDismissListener).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89269b(R.string.Doc_Wiki_Known).mo89267a($$Lambda$l$u8yFQaa52V5kDPw5VcO98dBlCmA.INSTANCE).mo89271d(R.color.function_danger_500)).mo89233b();
        this.f32727a = b;
        b.show();
    }

    /* renamed from: c */
    public void mo46485c(Context context, DialogInterface.OnDismissListener onDismissListener) {
        mo46480a();
        DialogC25637f b = new C25639g(context).mo89263v(R.color.bg_body).mo89256o(R.color.text_title).mo89253l(8388611).mo89254m(R.string.Doc_Wiki_MemberToAdmin).mo89248g(R.string.Doc_Wiki_PermissionChanged).mo89250i(R.color.text_title).mo89238b(true).mo89247e(false).mo89245d(0.3f).mo89257p(17).mo89227a(onDismissListener).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89269b(R.string.Doc_Wiki_Reload).mo89267a($$Lambda$l$o5SvLrYC2Fjw5BimRmM72db6xA.INSTANCE).mo89271d(R.color.function_danger_500)).mo89233b();
        this.f32727a = b;
        b.show();
    }

    /* renamed from: d */
    public void mo46486d(Context context, DialogInterface.OnDismissListener onDismissListener) {
        DialogC25637f b = new C25639g(context).mo89263v(R.color.bg_body).mo89256o(R.color.text_title).mo89253l(8388611).mo89254m(R.string.Doc_Wiki_AdminToMember).mo89248g(R.string.Doc_Wiki_PermissionChanged).mo89250i(R.color.text_title).mo89238b(true).mo89247e(false).mo89245d(0.3f).mo89257p(17).mo89227a(onDismissListener).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89269b(R.string.Doc_Wiki_Reload).mo89267a($$Lambda$l$hU6iNcrnF0uXuFxywBl8UQXfXhs.INSTANCE).mo89271d(R.color.function_danger_500)).mo89233b();
        this.f32727a = b;
        b.show();
    }

    /* renamed from: a */
    public void mo46482a(Context context, DialogInterface.OnDismissListener onDismissListener, int i) {
        mo46480a();
        DialogC25637f b = new C25639g(context).mo89263v(R.color.bg_body).mo89256o(R.color.text_title).mo89253l(8388611).mo89254m(R.string.Doc_Wiki_PageRemoved).mo89248g(R.string.Doc_Wiki_PageChanged).mo89250i(R.color.text_title).mo89238b(true).mo89247e(false).mo89245d(0.3f).mo89257p(17).mo89227a(onDismissListener).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89269b(i).mo89267a($$Lambda$l$VN6erHhBgc_vrC9Ypc67QP1QA.INSTANCE).mo89271d(R.color.function_danger_500)).mo89233b();
        this.f32727a = b;
        b.show();
    }

    /* renamed from: b */
    public void mo46484b(Context context, DialogInterface.OnDismissListener onDismissListener, int i) {
        mo46480a();
        DialogC25637f b = new C25639g(context).mo89263v(R.color.bg_body).mo89256o(R.color.text_title).mo89253l(8388611).mo89254m(R.string.Doc_Wiki_SpacePermissionChange).mo89248g(R.string.Doc_Wiki_PermissionChanged).mo89250i(R.color.text_title).mo89238b(true).mo89247e(false).mo89245d(0.3f).mo89257p(17).mo89227a(onDismissListener).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89269b(i).mo89267a($$Lambda$l$2zEuKG63X8N2x6env77c1V92O8.INSTANCE).mo89271d(R.color.function_danger_500)).mo89233b();
        this.f32727a = b;
        b.show();
    }
}
