package com.bytedance.ee.bear.lark.selector.auth;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.C0261c;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.lark.selector.auth.ChatDocAuthSeletorAdapter;
import com.larksuite.suite.R;
import com.ss.android.lark.doc.entity.DocPermPair;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.dialog.BottomSheetListDialog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.lark.selector.auth.a */
public class C8075a extends C0261c {

    /* renamed from: c */
    AbstractC8079a f21626c;

    /* renamed from: d */
    public boolean f21627d;

    /* renamed from: e */
    private List<DocResult> f21628e;

    /* renamed from: com.bytedance.ee.bear.lark.selector.auth.a$a */
    public interface AbstractC8079a {
        /* renamed from: a */
        void mo31228a();

        /* renamed from: a */
        void mo31229a(Map<String, DocPermPair.PermType> map);

        /* renamed from: b */
        void mo31230b();
    }

    /* renamed from: a */
    public C8075a mo31223a(AbstractC8079a aVar) {
        this.f21626c = aVar;
        return this;
    }

    /* renamed from: a */
    public static C8075a m32326a(List<DocResult> list) {
        C8075a aVar = new C8075a();
        aVar.f21628e = list;
        return aVar;
    }

    /* renamed from: a */
    public void mo31224a(FragmentActivity fragmentActivity) {
        mo5511a(fragmentActivity.getSupportFragmentManager(), getClass().getSimpleName());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31225a(Map<String, DocPermPair.PermType> map) {
        mo5513b();
        AbstractC8079a aVar = this.f21626c;
        if (aVar != null) {
            aVar.mo31229a(map);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.f21627d) {
            AbstractC8079a aVar = this.f21626c;
            if (aVar != null) {
                aVar.mo31230b();
            }
            this.f21627d = false;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.appcompat.app.C0261c
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        if (this.f21628e == null) {
            mo31225a(new HashMap());
            return null;
        }
        final ChatDocAuthSeletorAdapter chatDocAuthSeletorAdapter = new ChatDocAuthSeletorAdapter(getContext(), this.f21628e);
        chatDocAuthSeletorAdapter.mo31216a(new ChatDocAuthSeletorAdapter.AbstractC8074a() {
            /* class com.bytedance.ee.bear.lark.selector.auth.C8075a.C80761 */

            @Override // com.bytedance.ee.bear.lark.selector.auth.ChatDocAuthSeletorAdapter.AbstractC8074a
            /* renamed from: a */
            public void mo31222a() {
                ((BottomSheetListDialog) C8075a.this.v_()).mo197742a(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_ChatDocAuthCountBtn, "count", Integer.toString(chatDocAuthSeletorAdapter.mo31218b())));
            }
        });
        return new BottomSheetListDialog.C58412a(getActivity()).mo197751a(false).mo197748a(getString(R.string.Lark_Legacy_ChatDocNewGroupTitle)).mo197747a(chatDocAuthSeletorAdapter).mo197753b(getString(R.string.Lark_Legacy_ChatDocAuthNewGroupMessage)).mo197754b(getString(R.string.Lark_Legacy_Skip), new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.lark.selector.auth.C8075a.DialogInterface$OnClickListenerC80783 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C8075a.this.f21627d = true;
                if (C8075a.this.f21626c != null) {
                    C8075a.this.f21626c.mo31228a();
                }
            }
        }).mo197750a(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_ChatDocAuthCountBtn, "count", Integer.toString(chatDocAuthSeletorAdapter.mo31218b())), true, new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.lark.selector.auth.C8075a.DialogInterface$OnClickListenerC80772 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C8075a.this.f21627d = true;
                List<DocResult> a = chatDocAuthSeletorAdapter.mo31214a();
                HashMap<String, DocPermPair.PermType> c = chatDocAuthSeletorAdapter.mo31219c();
                HashMap hashMap = new HashMap();
                for (DocResult docResult : a) {
                    String url = docResult.getDoc().getUrl();
                    hashMap.put(url, c.get(url));
                }
                C8075a.this.mo31225a(hashMap);
            }
        }).mo197752a();
    }
}
