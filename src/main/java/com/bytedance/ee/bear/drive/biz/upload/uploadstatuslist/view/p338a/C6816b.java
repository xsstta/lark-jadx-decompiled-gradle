package com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.p338a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.a.b */
public class C6816b {

    /* renamed from: a */
    private Dialog f18531a;

    /* renamed from: b */
    private Context f18532b;

    /* renamed from: c */
    private C7130c f18533c;

    /* renamed from: d */
    private AbstractC6817a f18534d;

    /* renamed from: com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.a.b$a */
    public interface AbstractC6817a {
        void cancelAllFilesClick();
    }

    /* renamed from: a */
    public Dialog mo26850a() {
        UDDialog b = new BearUDDialogBuilder(this.f18532b).mo45362d(R.string.Drive_Drive_StopAllNonUploadProcesses).mo45345a(R.id.ud_dialog_btn_primary, R.string.Drive_Drive_Confirm, R.color.primary_pri_500, new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.p338a.$$Lambda$b$Nu0TzSx5ktcaBsBlIgVHM27_PqU */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C6816b.lambda$Nu0TzSx5ktcaBsBlIgVHM27_PqU(C6816b.this, dialogInterface, i);
            }
        }).mo45345a(R.id.ud_dialog_btn_secondary, R.string.Drive_Drive_Cancel, R.color.text_title, new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.p338a.$$Lambda$b$plDRWJPcoSgtjHsDWAFSCYSS5hA */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C6816b.lambda$plDRWJPcoSgtjHsDWAFSCYSS5hA(C6816b.this, dialogInterface, i);
            }
        }).mo45367h(R.style.ActionSheetDialogStyle).mo45359b();
        this.f18531a = b;
        return b;
    }

    /* renamed from: a */
    public C6816b mo26851a(AbstractC6817a aVar) {
        this.f18534d = aVar;
        return this;
    }

    public C6816b(Context context, C7130c cVar) {
        this.f18532b = context;
        this.f18533c = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m26903a(DialogInterface dialogInterface, int i) {
        this.f18533c.mo27971j();
        this.f18533c.mo27935b("cancel");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m26904b(DialogInterface dialogInterface, int i) {
        this.f18534d.cancelAllFilesClick();
        this.f18533c.mo27968i();
        this.f18533c.mo27935b("confirm");
    }
}
