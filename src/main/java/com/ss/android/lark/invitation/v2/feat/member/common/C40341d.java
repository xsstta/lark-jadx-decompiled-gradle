package com.ss.android.lark.invitation.v2.feat.member.common;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.suite.R;
import com.ss.android.lark.inv.export.util.C40145x;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.invitation.v2.feat.member.common.d */
public final class C40341d {

    /* renamed from: a */
    private DialogC25637f f102494a;

    /* renamed from: a */
    public void mo146231a() {
        this.f102494a.show();
    }

    /* renamed from: a */
    public static C40341d m159898a(Activity activity, boolean z, boolean z2, DialogC25637f.AbstractC25638a aVar, DialogC25637f.AbstractC25638a aVar2) {
        int i;
        if (z) {
            i = R.string.Lark_Invitation_AddMembersNeedApproveContent;
        } else {
            i = R.string.Lark_Invitation_AddMembersSucceedContent;
        }
        return new C40341d(activity, z, UIHelper.mustacheFormat(i, "APP_DISPLAY_NAME", C40145x.m159157a()), aVar, aVar2);
    }

    public C40341d(Activity activity, final boolean z, final CharSequence charSequence, final DialogC25637f.AbstractC25638a aVar, final DialogC25637f.AbstractC25638a aVar2) {
        this.f102494a = new C25639g(activity).mo89260s(R.layout.inv_invite_member_success_dialog).mo89222a(0.8f).mo89246d(false).mo89230a(new C25639g.AbstractC25641b() {
            /* class com.ss.android.lark.invitation.v2.feat.member.common.C40341d.C403421 */

            /* access modifiers changed from: protected */
            @Override // com.larksuite.component.ui.dialog.C25639g.AbstractC25641b
            /* renamed from: b */
            public void mo89274b(final DialogC25637f fVar) {
                super.mo89274b(fVar);
                TextView textView = (TextView) fVar.findViewById(R.id.imsdhTitleTv);
                if (z) {
                    textView.setText(R.string.Lark_Invitation_AddMembersNeedApproveTitle);
                } else {
                    textView.setText(R.string.Lark_Invitation_AddMembersSucceedTitle);
                }
                ((TextView) fVar.findViewById(R.id.imsdhMsgTv)).setText(charSequence);
                fVar.findViewById(R.id.imsdhFinishTv).setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.invitation.v2.feat.member.common.C40341d.C403421.View$OnClickListenerC403431 */

                    public void onClick(View view) {
                        aVar.onClick(fVar, R.id.imsdhFinishTv);
                    }
                });
                fVar.findViewById(R.id.imsdhAddMoreTv).setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.invitation.v2.feat.member.common.C40341d.C403421.View$OnClickListenerC403442 */

                    public void onClick(View view) {
                        aVar2.onClick(fVar, R.id.imsdhAddMoreTv);
                    }
                });
            }
        }).mo89233b();
    }
}
