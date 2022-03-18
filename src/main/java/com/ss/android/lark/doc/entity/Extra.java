package com.ss.android.lark.doc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class Extra implements Parcelable, Serializable {
    public static final Parcelable.Creator<Extra> CREATOR = new Parcelable.Creator<Extra>() {
        /* class com.ss.android.lark.doc.entity.Extra.C368341 */

        /* renamed from: a */
        public Extra[] newArray(int i) {
            return new Extra[i];
        }

        /* renamed from: a */
        public Extra createFromParcel(Parcel parcel) {
            return new Extra(parcel);
        }
    };
    public boolean owner_in_group;
    public int send_card_auth_perm;
    public int single_page_state;

    public int describeContents() {
        return 0;
    }

    public Extra() {
    }

    public int getSend_card_auth_perm() {
        return this.send_card_auth_perm;
    }

    public boolean isOwner_in_group() {
        return this.owner_in_group;
    }

    public boolean isPageStateContainer() {
        if (this.single_page_state == 1) {
            return true;
        }
        return false;
    }

    public boolean hasReadOrEditPer() {
        int i = this.send_card_auth_perm;
        if ((i & 1) == 0 && (i & 4) == 0) {
            return false;
        }
        return true;
    }

    public boolean isPageStateSinglePage() {
        if (this.single_page_state == 2) {
            return true;
        }
        return false;
    }

    public void setOwner_in_group(boolean z) {
        this.owner_in_group = z;
    }

    public void setSend_card_auth_perm(int i) {
        this.send_card_auth_perm = i;
    }

    protected Extra(Parcel parcel) {
        boolean z;
        this.send_card_auth_perm = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.owner_in_group = z;
        this.single_page_state = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.send_card_auth_perm);
        parcel.writeByte(this.owner_in_group ? (byte) 1 : 0);
        parcel.writeInt(this.single_page_state);
    }
}
