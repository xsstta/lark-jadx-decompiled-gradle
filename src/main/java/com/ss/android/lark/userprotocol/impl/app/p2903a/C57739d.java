package com.ss.android.lark.userprotocol.impl.app.p2903a;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.KeyEvent;
import com.ss.android.lark.biz.core.api.AbstractC29571p;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.userprotocol.impl.app.DialogC57725a;
import com.ss.android.lark.userprotocol.impl.app.UserProtocolDialog;
import com.ss.android.lark.userprotocol.impl.app.p2903a.C57727a;

/* renamed from: com.ss.android.lark.userprotocol.impl.app.a.d */
public class C57739d implements C57727a.AbstractC57729b {

    /* renamed from: a */
    private DialogC57725a f142234a;

    /* renamed from: a */
    public void setViewDelegate(C57727a.AbstractC57729b.AbstractC57730a aVar) {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f142234a = null;
    }

    @Override // com.ss.android.lark.userprotocol.impl.app.p2903a.C57727a.AbstractC57729b
    /* renamed from: a */
    public void mo195901a() {
        this.f142234a.dismiss();
    }

    @Override // com.ss.android.lark.userprotocol.impl.app.p2903a.C57727a.AbstractC57729b
    /* renamed from: a */
    public void mo195902a(Activity activity, UserProtocolDialog.C57724b bVar, UserProtocolDialog.AbstractC57723a aVar, final AbstractC29571p pVar) {
        DialogC57725a aVar2 = this.f142234a;
        if (aVar2 != null && aVar2.isShowing()) {
            Log.m165388i("Showing user agreement popup");
        } else if (bVar != null) {
            UserProtocolDialog userProtocolDialog = new UserProtocolDialog(activity, bVar, aVar);
            this.f142234a = userProtocolDialog;
            userProtocolDialog.setCanceledOnTouchOutside(false);
            this.f142234a.setOnKeyListener(new DialogInterface.OnKeyListener() {
                /* class com.ss.android.lark.userprotocol.impl.app.p2903a.C57739d.DialogInterface$OnKeyListenerC577401 */

                public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return i == 4;
                }
            });
            this.f142234a.mo195896a(new DialogC57725a.AbstractC57726a() {
                /* class com.ss.android.lark.userprotocol.impl.app.p2903a.C57739d.C577412 */

                @Override // com.ss.android.lark.userprotocol.impl.app.DialogC57725a.AbstractC57726a
                /* renamed from: a */
                public void mo195898a() {
                    AbstractC29571p pVar = pVar;
                    if (pVar != null) {
                        pVar.mo105814a(true);
                    }
                }
            });
            this.f142234a.show();
        }
    }
}
