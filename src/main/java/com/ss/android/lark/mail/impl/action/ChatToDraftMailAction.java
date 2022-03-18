package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;

public class ChatToDraftMailAction extends DraftMailAction {
    public static final Parcelable.Creator<DraftMailAction> CREATOR = new Parcelable.Creator<DraftMailAction>() {
        /* class com.ss.android.lark.mail.impl.action.ChatToDraftMailAction.C417771 */

        /* renamed from: a */
        public ChatToDraftMailAction[] newArray(int i) {
            return new ChatToDraftMailAction[i];
        }

        /* renamed from: a */
        public ChatToDraftMailAction createFromParcel(Parcel parcel) {
            return new ChatToDraftMailAction(parcel);
        }
    };

    private ChatToDraftMailAction(Parcel parcel) {
        this(parcel.readString());
    }

    public ChatToDraftMailAction(String str) {
        super(str);
    }

    public ChatToDraftMailAction(String str, String str2) {
        super(str, str2);
    }
}
