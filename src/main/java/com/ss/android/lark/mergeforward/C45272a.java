package com.ss.android.lark.mergeforward;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.mergeforward.a */
public class C45272a {

    /* renamed from: a */
    AbstractC45276d f114623a;

    /* renamed from: b */
    AbstractC45273a f114624b;

    /* renamed from: c */
    Context f114625c;

    /* renamed from: com.ss.android.lark.mergeforward.a$a */
    public interface AbstractC45273a {
        /* renamed from: a */
        void mo126189a();

        /* renamed from: b */
        void mo126190b();
    }

    /* renamed from: a */
    public void mo159975a() {
        this.f114624b.mo126189a();
    }

    /* renamed from: b */
    public void mo159976b() {
        new C25639g(this.f114625c).mo89248g(R.string.Lark_Legacy_SaveBoxDeleteConfirm).mo89238b(true).mo89251j(2).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmInfo, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mergeforward.$$Lambda$a$teELwpQ5SPn9z2Nx_S3wyZ_U3q4 */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C45272a.this.m179786a(dialogInterface, i);
            }
        }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_CancelTip, (DialogInterface.OnClickListener) null).mo89239c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m179786a(DialogInterface dialogInterface, int i) {
        this.f114624b.mo126190b();
    }

    public C45272a(AbstractC45276d dVar, AbstractC45273a aVar, Context context) {
        this.f114623a = dVar;
        this.f114624b = aVar;
        this.f114625c = context;
    }
}
