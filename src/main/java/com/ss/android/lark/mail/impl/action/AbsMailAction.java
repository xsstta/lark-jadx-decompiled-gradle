package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;

public abstract class AbsMailAction implements IMailAction {

    /* renamed from: a */
    private final String f106057a;

    /* renamed from: b */
    public int mo150246b() {
        return 0;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo150245a() {
        return this.f106057a;
    }

    /* renamed from: c */
    public String mo150247c() {
        if (mo150246b() != 0) {
            return C41816b.m166115a().mo150132b().getString(mo150246b());
        }
        return "";
    }

    /* renamed from: d */
    public void mo150248d() {
        if (mo150246b() != 0) {
            MailToast.m173698a(mo150246b(), MailToast.Type.SUCCESS);
        } else {
            MailToast.m173704a(mo150247c(), MailToast.Type.SUCCESS);
        }
    }

    public AbsMailAction(String str) {
        this.f106057a = str;
    }

    public AbsMailAction(Parcel parcel) {
        this.f106057a = parcel.readString();
    }

    /* renamed from: a */
    public static boolean m165934a(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f106057a);
    }

    /* renamed from: a */
    public static void m165933a(Parcel parcel, boolean z) {
        if (z) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
    }
}
