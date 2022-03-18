package com.ss.android.lark.mail.impl.action;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.mail.impl.action.AbsChangeMailAction;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.p2168g.C42176e;

public abstract class PushThreadAction extends AbsChangeMailAction {

    /* renamed from: a */
    public MailThread f106128a;

    /* renamed from: b */
    private String f106129b = "";

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction
    /* renamed from: b */
    public int mo150246b() {
        return 0;
    }

    /* renamed from: e */
    public MailThread mo150334e() {
        return this.f106128a;
    }

    /* renamed from: f */
    public String mo150335f() {
        return this.f106129b;
    }

    /* renamed from: g */
    public boolean mo150336g() {
        MailThread mailThread = this.f106128a;
        if (mailThread == null || TextUtils.isEmpty(mailThread.mo151676a())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public int mo150234a(MailThread mailThread) {
        m165925a(this.f106128a, mailThread);
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public void mo150238a(AbstractC41815b bVar) {
        mo150333a(bVar, this.f106129b);
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public AbsChangeMailAction.OP mo150235a(MailThread mailThread, String str) {
        return AbsChangeMailAction.OP.UPDATE;
    }

    public PushThreadAction(String str, String str2) {
        super(str);
        this.f106129b = str2;
    }

    /* renamed from: a */
    public void mo150333a(final AbstractC41815b bVar, String str) {
        C42176e.m168344a().mo152243c(mo150245a(), str, new IGetDataCallback<MailThread>() {
            /* class com.ss.android.lark.mail.impl.action.PushThreadAction.C418011 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                bVar.mo150377b();
            }

            /* renamed from: a */
            public void onSuccess(MailThread mailThread) {
                PushThreadAction.this.f106128a = mailThread;
                bVar.mo150376a();
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public C41814a mo150236a(MailThread mailThread, int i, String str) {
        if (mailThread == null || !TextUtils.equals(this.f106129b, str) || !TextUtils.equals(mailThread.mo151676a(), mo150245a())) {
            return null;
        }
        mo150234a(mailThread);
        return new C41814a(i, mailThread, mo150235a(mailThread, str));
    }
}
