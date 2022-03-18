package com.ss.android.lark.mail.impl.view.undo;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.lark.pb.email.client.v1.MailUndoResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.C42101o;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43320g;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;

public class SendUndoProcess extends AbstractC43975a<String> implements Parcelable {
    public static final Parcelable.Creator<SendUndoProcess> CREATOR = new Parcelable.Creator<SendUndoProcess>() {
        /* class com.ss.android.lark.mail.impl.view.undo.SendUndoProcess.C439662 */

        /* renamed from: a */
        public SendUndoProcess[] newArray(int i) {
            return new SendUndoProcess[i];
        }

        /* renamed from: a */
        public SendUndoProcess createFromParcel(Parcel parcel) {
            return new SendUndoProcess(parcel);
        }
    };

    /* renamed from: a */
    public String f111557a;

    /* renamed from: g */
    private String f111558g;

    /* renamed from: c */
    public void mo156457b(Context context, String str) {
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.view.undo.AbstractC43977b
    /* renamed from: a */
    public long mo156428a() {
        C42101o b = C43350d.m172098a().mo155050p().mo5927b();
        if (b != null) {
            return b.mo152006b();
        }
        return 5;
    }

    protected SendUndoProcess(Parcel parcel) {
        this(parcel.readString(), parcel.readString());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f111558g);
        parcel.writeString(this.f111557a);
    }

    public SendUndoProcess(String str, String str2) {
        super(str, C43819s.m173684a((int) R.string.Mail_Toast_EmailSent), C43819s.m173684a((int) R.string.Mail_Toast_Undo));
        this.f111558g = str;
        this.f111557a = str2;
    }

    /* renamed from: b */
    public void mo156429a(final Context context, final String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            Log.m165389i("SendUndoProcess", "onUndoAction id:" + str + ", process:" + C41816b.m166115a().mo150120a());
            mo156524d();
            C42187a.m168501b(this, str);
            C42176e.m168344a().mo152256g(str, new AbstractC41870b<MailUndoResponse>() {
                /* class com.ss.android.lark.mail.impl.view.undo.SendUndoProcess.C439651 */

                /* renamed from: a */
                public void mo150435a(MailUndoResponse mailUndoResponse) {
                    SendUndoProcess.this.mo156525e();
                    MailToast.m173697a((int) R.string.Mail_Toast_SendingUndone);
                    ((AbstractC43320g) Watchers.m167205a(AbstractC43320g.class)).mo154474n(SendUndoProcess.this.f111557a);
                    C42187a.m168478a((AbstractC43977b) SendUndoProcess.this, str, true);
                    SendUndoProcess sendUndoProcess = SendUndoProcess.this;
                    sendUndoProcess.mo156521a(context, sendUndoProcess.f111557a);
                }

                @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
                /* renamed from: a */
                public void mo150434a(ErrorResult errorResult) {
                    Log.m165384e("SendUndoProcess", "tryUndo fail:", errorResult);
                    SendUndoProcess.this.mo156525e();
                    MailToast.m173697a((int) R.string.Mail_Toast_UndoFailed);
                    C42209j.m168612a("undo_failed", "toast");
                    C42187a.m168478a((AbstractC43977b) SendUndoProcess.this, str, false);
                }
            });
            C42330c.m169076e();
        }
    }
}
