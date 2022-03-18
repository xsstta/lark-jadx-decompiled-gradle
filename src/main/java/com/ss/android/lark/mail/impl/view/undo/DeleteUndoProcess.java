package com.ss.android.lark.mail.impl.view.undo;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.lark.pb.email.client.v1.MailUndoResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.service.C43383h;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;

public class DeleteUndoProcess extends AbstractC43977b<String> implements Parcelable {
    public static final Parcelable.Creator<DeleteUndoProcess> CREATOR = new Parcelable.Creator<DeleteUndoProcess>() {
        /* class com.ss.android.lark.mail.impl.view.undo.DeleteUndoProcess.C439612 */

        /* renamed from: a */
        public DeleteUndoProcess[] newArray(int i) {
            return new DeleteUndoProcess[i];
        }

        /* renamed from: a */
        public DeleteUndoProcess createFromParcel(Parcel parcel) {
            return new DeleteUndoProcess(parcel);
        }
    };

    /* renamed from: a */
    private String f111546a;

    /* renamed from: g */
    private String f111547g;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.view.undo.AbstractC43977b
    /* renamed from: a */
    public long mo156428a() {
        return 7;
    }

    @Override // com.ss.android.lark.mail.impl.view.undo.AbstractC43977b
    /* renamed from: b */
    public boolean mo156431b() {
        return false;
    }

    public int describeContents() {
        return 0;
    }

    protected DeleteUndoProcess(Parcel parcel) {
        this(parcel.readString(), parcel.readString());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f111546a);
        parcel.writeString(this.f111547g);
    }

    public DeleteUndoProcess(String str, String str2) {
        super(str, str2, C43819s.m173684a((int) R.string.Mail_Toast_Undo));
        this.f111546a = str;
        this.f111547g = str2;
        C43383h.m172311a().mo155144a("message");
    }

    /* renamed from: a */
    public void mo156429a(final Context context, final String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            C42187a.m168501b(this, str);
            C42176e.m168344a().mo152256g(str, new AbstractC41870b<MailUndoResponse>() {
                /* class com.ss.android.lark.mail.impl.view.undo.DeleteUndoProcess.C439601 */

                @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
                /* renamed from: a */
                public void mo150434a(ErrorResult errorResult) {
                    C42187a.m168478a((AbstractC43977b) DeleteUndoProcess.this, str, false);
                }

                /* renamed from: a */
                public void mo150435a(MailUndoResponse mailUndoResponse) {
                    if (context != null) {
                        MailToast.m173697a((int) R.string.Mail_Toast_ActionUndone);
                        C42187a.m168478a((AbstractC43977b) DeleteUndoProcess.this, str, true);
                    }
                    if (DeleteUndoProcess.this.f111611f != null) {
                        C43849u.m173826a(DeleteUndoProcess.this.f111611f);
                    }
                }
            });
        }
    }
}
