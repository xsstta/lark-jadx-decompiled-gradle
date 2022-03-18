package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.mail.impl.action.AbsChangeMailAction;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.entity.MailThreadStatus;
import com.ss.android.lark.mail.impl.service.C43277a;
import java.util.ArrayList;
import java.util.List;

public class SentMailAction extends MessageMailAction {
    public static final Parcelable.Creator<SentMailAction> CREATOR = new Parcelable.Creator<SentMailAction>() {
        /* class com.ss.android.lark.mail.impl.action.SentMailAction.C418081 */

        /* renamed from: a */
        public SentMailAction[] newArray(int i) {
            return new SentMailAction[i];
        }

        /* renamed from: a */
        public SentMailAction createFromParcel(Parcel parcel) {
            return new SentMailAction(parcel);
        }
    };

    /* renamed from: a */
    private MailMessage f106142a;

    /* renamed from: e */
    private boolean m166085e() {
        String e = C43277a.m171921a().mo154947k().mo151182e();
        boolean z = false;
        if (TextUtils.isEmpty(e)) {
            return false;
        }
        if (this.f106142a.mo151591d() != null && !this.f106142a.mo151591d().isEmpty()) {
            z = m166084a(e, this.f106142a.mo151591d());
        }
        if (!z && this.f106142a.mo151598e() != null && !this.f106142a.mo151598e().isEmpty()) {
            z = m166084a(e, this.f106142a.mo151598e());
        }
        if (z || this.f106142a.mo151601f() == null || this.f106142a.mo151601f().isEmpty()) {
            return z;
        }
        return m166084a(e, this.f106142a.mo151601f());
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public void mo150238a(AbstractC41815b bVar) {
        bVar.mo150376a();
    }

    private SentMailAction(Parcel parcel) {
        this(parcel.readString(), parcel.readString());
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public int mo150234a(MailThread mailThread) {
        mailThread.mo151680a((MailDraft) null);
        mailThread.mo151693c(this.f106142a.mo151608i());
        mailThread.mo151684a(!CollectionUtils.isEmpty(this.f106142a.mo151610j()));
        mailThread.mo151687b(this.f106142a.mo151614n());
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public C41814a mo150237a(String str) {
        if (!"SENT".equals(str) && ("INBOX".equals(str) || !m166085e())) {
            return null;
        }
        MailThread mailThread = new MailThread();
        String z = this.f106142a.mo151627z();
        if (TextUtils.isEmpty(z)) {
            z = this.f106142a.mo151581b();
        }
        mailThread.mo151682a(z);
        mailThread.mo151678a(1L);
        MailThreadStatus mailThreadStatus = new MailThreadStatus();
        mailThreadStatus.mo151737a(2);
        mailThread.mo151688b(this.f106142a.mo151604g());
        mailThread.mo151693c(this.f106142a.mo151608i());
        mailThread.mo151684a(!CollectionUtils.isEmpty(this.f106142a.mo151610j()));
        mailThread.mo151687b(this.f106142a.mo151614n());
        mailThread.mo151692c(this.f106142a.mo151614n());
        mailThread.mo151681a(mailThreadStatus);
        mailThread.mo151690b("SENT".equals(str));
        ArrayList arrayList = new ArrayList();
        MailAddress.C42062a aVar = new MailAddress.C42062a();
        aVar.mo151212b(C43277a.m171921a().mo154947k().mo151182e());
        aVar.mo151209a(C43277a.m171921a().mo154947k().mo151176a());
        arrayList.add(aVar.mo151210a());
        mailThread.mo151683a(arrayList);
        return new C41814a(-1, mailThread, AbsChangeMailAction.OP.INSERT);
    }

    public SentMailAction(String str, String str2) {
        super(str, str2);
    }

    /* renamed from: a */
    private boolean m166084a(String str, List<MailAddress> list) {
        for (MailAddress mailAddress : list) {
            if (TextUtils.equals(str, mailAddress.mo151182e())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public AbsChangeMailAction.OP mo150235a(MailThread mailThread, String str) {
        if ("DRAFT".equals(str)) {
            return AbsChangeMailAction.OP.DELETE;
        }
        if ("SENT".equals(str)) {
            return AbsChangeMailAction.OP.DELETE_AND_INSERT;
        }
        return AbsChangeMailAction.OP.DELETE_AND_INSERT;
    }
}
