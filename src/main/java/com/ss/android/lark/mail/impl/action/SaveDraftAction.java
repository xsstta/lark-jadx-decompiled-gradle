package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.lark.mail.impl.action.AbsChangeMailAction;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.entity.MailThreadStatus;
import com.ss.android.lark.mail.impl.service.C43277a;
import java.util.ArrayList;

public class SaveDraftAction extends ThreadMailAction {
    public static final Parcelable.Creator<SaveDraftAction> CREATOR = new Parcelable.Creator<SaveDraftAction>() {
        /* class com.ss.android.lark.mail.impl.action.SaveDraftAction.C418071 */

        /* renamed from: a */
        public SaveDraftAction[] newArray(int i) {
            return new SaveDraftAction[i];
        }

        /* renamed from: a */
        public SaveDraftAction createFromParcel(Parcel parcel) {
            return new SaveDraftAction(parcel);
        }
    };

    /* renamed from: a */
    private MailDraft f106141a;

    /* renamed from: e */
    public MailDraft mo150354e() {
        return this.f106141a;
    }

    private SaveDraftAction(Parcel parcel) {
        this(parcel.readString());
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public void mo150238a(AbstractC41815b bVar) {
        bVar.mo150376a();
    }

    public SaveDraftAction(String str) {
        super(str);
    }

    /* renamed from: a */
    public void mo150353a(MailDraft mailDraft) {
        this.f106141a = mailDraft;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public int mo150234a(MailThread mailThread) {
        if (!this.f106141a.mo151367t()) {
            return -1;
        }
        mailThread.mo151680a(this.f106141a);
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public C41814a mo150237a(String str) {
        if (!"DRAFT".equals(str)) {
            return null;
        }
        MailThread mailThread = new MailThread();
        if (!this.f106141a.mo151367t()) {
            return new C41814a(-1, mailThread, AbsChangeMailAction.OP.UNKNOWN);
        }
        String n = this.f106141a.mo151361n();
        if (TextUtils.isEmpty(n)) {
            n = this.f106141a.mo151321a();
        }
        mailThread.mo151682a(n);
        mailThread.mo151678a(1L);
        mailThread.mo151692c(System.currentTimeMillis());
        mailThread.mo151687b(System.currentTimeMillis());
        MailThreadStatus mailThreadStatus = new MailThreadStatus();
        mailThreadStatus.mo151737a(2);
        if (this.f106141a.mo151331b() == null || !this.f106141a.mo151331b().mo151185g()) {
            this.f106141a.mo151325a(C43277a.m171921a().mo154947k());
        }
        mailThread.mo151681a(mailThreadStatus);
        ArrayList arrayList = new ArrayList();
        MailAddress.C42062a aVar = new MailAddress.C42062a();
        aVar.mo151212b(this.f106141a.mo151331b().mo151182e());
        aVar.mo151209a(this.f106141a.mo151331b().mo151176a());
        arrayList.add(aVar.mo151210a());
        mailThread.mo151683a(arrayList);
        mailThread.mo151680a(this.f106141a);
        return new C41814a(-1, mailThread, AbsChangeMailAction.OP.INSERT);
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public AbsChangeMailAction.OP mo150235a(MailThread mailThread, String str) {
        return AbsChangeMailAction.OP.UPDATE;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
