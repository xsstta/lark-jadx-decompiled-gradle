package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.lark.pb.email.v1.DeleteMailDraftResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.action.AbsChangeMailAction;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;

public class DiscardDraftAction extends MessageMailAction {
    public static final Parcelable.Creator<DiscardDraftAction> CREATOR = new Parcelable.Creator<DiscardDraftAction>() {
        /* class com.ss.android.lark.mail.impl.action.DiscardDraftAction.C417801 */

        /* renamed from: a */
        public DiscardDraftAction[] newArray(int i) {
            return new DiscardDraftAction[i];
        }

        /* renamed from: a */
        public DiscardDraftAction createFromParcel(Parcel parcel) {
            return new DiscardDraftAction(parcel);
        }
    };

    /* renamed from: a */
    private boolean f106071a;

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public int mo150234a(MailThread mailThread) {
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction
    /* renamed from: b */
    public int mo150246b() {
        if (this.f106071a) {
            return R.string.Mail_Toast_DraftDiscarded;
        }
        return 0;
    }

    private DiscardDraftAction(Parcel parcel) {
        this(parcel.readString(), parcel.readString());
    }

    /* renamed from: a */
    public void mo150273a(boolean z) {
        this.f106071a = z;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public void mo150238a(final AbstractC41815b bVar) {
        C42176e.m168344a().mo152207a(mo150292g(), mo150245a(), new IGetDataCallback<DeleteMailDraftResponse>() {
            /* class com.ss.android.lark.mail.impl.action.DiscardDraftAction.C417812 */

            /* renamed from: a */
            public void onSuccess(DeleteMailDraftResponse deleteMailDraftResponse) {
                bVar.mo150376a();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                bVar.mo150377b();
                C42209j.m168612a("read_delete_draft_fail", "toast");
            }
        });
    }

    public DiscardDraftAction(String str, String str2) {
        super(str, str2);
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public AbsChangeMailAction.OP mo150235a(MailThread mailThread, String str) {
        return AbsChangeMailAction.OP.UNKNOWN;
    }
}
