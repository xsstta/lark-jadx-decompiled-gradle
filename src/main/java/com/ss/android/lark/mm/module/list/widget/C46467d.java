package com.ss.android.lark.mm.module.list.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDCheckBoxDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.mm.module.list.data.MinutesSummaryData;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47085h;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.ResString;

/* renamed from: com.ss.android.lark.mm.module.list.widget.d */
public class C46467d {

    /* renamed from: a */
    public MinutesSummaryData f117014a;

    /* renamed from: b */
    public AbstractC46477a f117015b;

    /* renamed from: c */
    private Context f117016c;

    /* renamed from: d */
    private MmListControl.DataSource f117017d;

    /* renamed from: e */
    private boolean f117018e;

    /* renamed from: com.ss.android.lark.mm.module.list.widget.d$a */
    public interface AbstractC46477a {
        /* renamed from: a */
        void mo163302a(DialogInterface dialogInterface);

        /* renamed from: a */
        void mo163303a(DialogInterface dialogInterface, boolean z);
    }

    /* renamed from: b */
    private Dialog m183821b() {
        final boolean[] zArr = {false};
        return ((UDCheckBoxDialogBuilder) ((UDCheckBoxDialogBuilder) ((UDCheckBoxDialogBuilder) ((UDCheckBoxDialogBuilder) new UDCheckBoxDialogBuilder(this.f117016c).title(ResString.f118656a.mo165504a(R.string.MMWeb_M_Home_MyRemoveFromRecent_PopupTitle))).message(R.string.MMWeb_M_Home_MyRemoveFromRecent_PopupText)).mo90892a(ResString.f118656a.mo165504a(R.string.MMWeb_M_Home_MyDeleteOriginalFile_Checkbox)).mo90891a(new UDCheckBox.OnCheckedChangeListener() {
            /* class com.ss.android.lark.mm.module.list.widget.C46467d.C464725 */

            @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
            public void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
                uDCheckBox.setChecked(z);
                zArr[0] = z;
            }
        }).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90706b(R.string.MMWeb_M_Home_MyRemoveFromRecent_RemoveButton).mo90710d(R.color.ud_R500).mo90703a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mm.module.list.widget.C46467d.DialogInterface$OnClickListenerC464714 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C47083e.m186425a(C47085h.m186431a(C46467d.this.f117014a), "vc_minutes_remove_click", C47086i.m186432a().mo165422d("remove").mo165423e("vc_minutes_list_view").mo165418b("delete_original_file", zArr[0]).mo165421c());
                C46467d.this.f117015b.mo163303a(dialogInterface, zArr[0]);
            }
        }))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.MMWeb_M_Home_MyRemoveFromRecent_CancelButton, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mm.module.list.widget.C46467d.DialogInterface$OnClickListenerC464681 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C47083e.m186425a(C47085h.m186431a(C46467d.this.f117014a), "vc_minutes_remove_click", C47086i.m186432a().mo165422d("cancel").mo165423e("vc_minutes_list_view").mo165421c());
                C46467d.this.f117015b.mo163302a(dialogInterface);
            }
        })).show();
    }

    /* renamed from: c */
    private Dialog m183822c() {
        return ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f117016c).title(ResString.f118656a.mo165504a(R.string.MMWeb_M_Home_SharedRemoveFromAllList_PopupTitle))).message(R.string.MMWeb_M_Home_SharedRemoveFromAllList_PopupText)).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90706b(R.string.MMWeb_M_Home_SharedRemoveFromAllList_ConfirmButton).mo90710d(R.color.ud_R500).mo90703a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mm.module.list.widget.C46467d.DialogInterface$OnClickListenerC464747 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C46467d.this.f117015b.mo163303a(dialogInterface, false);
                C47083e.m186425a(C47085h.m186431a(C46467d.this.f117014a), "vc_minutes_remove_click", C47086i.m186432a().mo165422d("remove").mo165423e("vc_minutes_list_view").mo165413a("delete_original_file", "none").mo165421c());
            }
        }))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.MMWeb_M_Home_SharedRemoveFromAllList_CancelButton, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mm.module.list.widget.C46467d.DialogInterface$OnClickListenerC464736 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C46467d.this.f117015b.mo163302a(dialogInterface);
                C47083e.m186425a(C47085h.m186431a(C46467d.this.f117014a), "vc_minutes_remove_click", C47086i.m186432a().mo165422d("cancel").mo165423e("vc_minutes_list_view").mo165421c());
            }
        })).show();
    }

    /* renamed from: d */
    private Dialog m183823d() {
        return ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f117016c).title(ResString.f118656a.mo165504a(R.string.MMWeb_G_My_DeleteFileName_PopupTItle))).message(R.string.MMWeb_G_My_DeleteFileName_PopupText)).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90706b(R.string.MMWeb_G_My_DeleteFileName_DeleteBTN).mo90710d(R.color.ud_R500).mo90703a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mm.module.list.widget.C46467d.DialogInterface$OnClickListenerC464769 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C47083e.m186425a(C47085h.m186431a(C46467d.this.f117014a), "vc_minutes_delete_click", C47086i.m186432a().mo165422d("confirm").mo165423e("vc_minutes_list_view").mo165421c());
                C46467d.this.f117015b.mo163303a(dialogInterface, false);
            }
        }))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.MMWeb_G_My_DeleteFileName_CancelButton, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mm.module.list.widget.C46467d.DialogInterface$OnClickListenerC464758 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C47083e.m186425a(C47085h.m186431a(C46467d.this.f117014a), "vc_minutes_delete_click", C47086i.m186432a().mo165422d("cancel").mo165423e("vc_minutes_list_view").mo165421c());
                C46467d.this.f117015b.mo163302a(dialogInterface);
            }
        })).show();
    }

    /* renamed from: e */
    private Dialog m183824e() {
        return ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f117016c).title(ResString.f118656a.mo165504a(R.string.MMWeb_G_Shared_RemoveFromShared_PopupTitle))).message(R.string.MMWeb_G_Shared_RemoveFromShared_PopupText)).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90706b(R.string.MMWeb_G_Shared_RemoveShared_RemoveButton).mo90710d(R.color.ud_R500).mo90703a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mm.module.list.widget.C46467d.AnonymousClass11 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C47083e.m186425a(C47085h.m186431a(C46467d.this.f117014a), "vc_minutes_remove_click", C47086i.m186432a().mo165422d("remove").mo165423e("vc_minutes_list_view").mo165413a("delete_original_file", "none").mo165421c());
                C46467d.this.f117015b.mo163303a(dialogInterface, false);
            }
        }))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.MMWeb_G_Shared_RemoveShared_CancelButton, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mm.module.list.widget.C46467d.AnonymousClass10 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C47083e.m186425a(C47085h.m186431a(C46467d.this.f117014a), "vc_minutes_remove_click", C47086i.m186432a().mo165422d("cancel").mo165423e("vc_minutes_list_view").mo165421c());
                C46467d.this.f117015b.mo163302a(dialogInterface);
            }
        })).show();
    }

    /* renamed from: f */
    private Dialog m183825f() {
        return ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f117016c).title(ResString.f118656a.mo165504a(R.string.MMWeb_G_Trash_DeleteThisFilePermanently_PopupTitle))).message(R.string.MMWeb_G_Trash_DeleteThisFilePermanently_PopupText)).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90706b(R.string.MMWeb_G_Trash_DeleteThisFilePermanently_DeleteButton).mo90710d(R.color.ud_R500).mo90703a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mm.module.list.widget.C46467d.DialogInterface$OnClickListenerC464703 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C47083e.m186425a(C47085h.m186431a(C46467d.this.f117014a), "vc_minutes_delete_permanently_click", C47086i.m186432a().mo165422d("confirm").mo165423e("vc_minutes_list_view").mo165421c());
                C46467d.this.f117015b.mo163303a(dialogInterface, false);
            }
        }))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.MMWeb_G_Trash_DeleteThisFilePermanently_CancelButton, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mm.module.list.widget.C46467d.DialogInterface$OnClickListenerC464692 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C47083e.m186425a(C47085h.m186431a(C46467d.this.f117014a), "vc_minutes_delete_permanently_click", C47086i.m186432a().mo165422d("cancel").mo165423e("vc_minutes_list_view").mo165421c());
                C46467d.this.f117015b.mo163302a(dialogInterface);
            }
        })).show();
    }

    /* renamed from: a */
    public Dialog mo163324a() {
        if (this.f117017d == MmListControl.DataSource.HomeList && this.f117018e) {
            C47083e.m186425a(C47085h.m186431a(this.f117014a), "vc_minutes_remove_view", C47086i.m186432a().mo165413a("include_original_file", "true").mo165421c());
            return m183821b();
        } else if (this.f117017d == MmListControl.DataSource.HomeList) {
            C47083e.m186425a(C47085h.m186431a(this.f117014a), "vc_minutes_remove_view", C47086i.m186432a().mo165413a("include_original_file", "false").mo165421c());
            return m183822c();
        } else if (this.f117017d == MmListControl.DataSource.MyList) {
            C47083e.m186425a(C47085h.m186431a(this.f117014a), "vc_minutes_delete_view", C47086i.m186432a().mo165421c());
            return m183823d();
        } else if (this.f117017d == MmListControl.DataSource.ShareList) {
            C47083e.m186425a(C47085h.m186431a(this.f117014a), "vc_minutes_remove_view", C47086i.m186432a().mo165413a("include_original_file", "false").mo165421c());
            return m183824e();
        } else if (this.f117017d != MmListControl.DataSource.TrashList) {
            return m183821b();
        } else {
            C47083e.m186425a(C47085h.m186431a(this.f117014a), "vc_minutes_delete_permanently_view", C47086i.m186432a().mo165421c());
            return m183825f();
        }
    }

    public C46467d(Context context, MmListControl.DataSource dataSource, boolean z, MinutesSummaryData minutesSummaryData, AbstractC46477a aVar) {
        this.f117016c = context;
        this.f117017d = dataSource;
        this.f117018e = z;
        this.f117014a = minutesSummaryData;
        this.f117015b = aVar;
    }
}
