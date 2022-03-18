package com.bytedance.ee.bear.wikiv2.home.viewall;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eJ\t\u0010#\u001a\u00020\u0007HÖ\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\r\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 ¨\u0006)"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListArgs;", "Landroid/os/Parcelable;", "Lcom/bytedance/ee/util/io/NonProguard;", "spaceList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikiDocument;", "pageMode", "", "createDocumentType", "srcToken", "", "srcObjType", "srcParentToken", "srcIsLock", "(Ljava/util/ArrayList;IILjava/lang/String;ILjava/lang/String;I)V", "getCreateDocumentType", "()I", "setCreateDocumentType", "(I)V", "getPageMode", "setPageMode", "getSpaceList", "()Ljava/util/ArrayList;", "setSpaceList", "(Ljava/util/ArrayList;)V", "getSrcIsLock", "setSrcIsLock", "getSrcObjType", "setSrcObjType", "getSrcParentToken", "()Ljava/lang/String;", "setSrcParentToken", "(Ljava/lang/String;)V", "getSrcToken", "setSrcToken", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class WikiSpaceListArgs implements Parcelable, NonProguard {
    public static final Parcelable.Creator CREATOR = new C12296a();
    private int createDocumentType;
    private int pageMode;
    private ArrayList<WikiDocument> spaceList;
    private int srcIsLock;
    private int srcObjType;
    private String srcParentToken;
    private String srcToken;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall.WikiSpaceListArgs$a */
    public static class C12296a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add((WikiDocument) parcel.readParcelable(WikiSpaceListArgs.class.getClassLoader()));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            return new WikiSpaceListArgs(arrayList, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WikiSpaceListArgs[i];
        }
    }

    public WikiSpaceListArgs() {
        this(null, 0, 0, null, 0, null, 0, SmActions.ACTION_ONTHECALL_ENTRY, null);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        ArrayList<WikiDocument> arrayList = this.spaceList;
        if (arrayList != null) {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            for (WikiDocument wikiDocument : arrayList) {
                parcel.writeParcelable(wikiDocument, i);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.pageMode);
        parcel.writeInt(this.createDocumentType);
        parcel.writeString(this.srcToken);
        parcel.writeInt(this.srcObjType);
        parcel.writeString(this.srcParentToken);
        parcel.writeInt(this.srcIsLock);
    }

    public final int getCreateDocumentType() {
        return this.createDocumentType;
    }

    public final int getPageMode() {
        return this.pageMode;
    }

    public final ArrayList<WikiDocument> getSpaceList() {
        return this.spaceList;
    }

    public final int getSrcIsLock() {
        return this.srcIsLock;
    }

    public final int getSrcObjType() {
        return this.srcObjType;
    }

    public final String getSrcParentToken() {
        return this.srcParentToken;
    }

    public final String getSrcToken() {
        return this.srcToken;
    }

    public final void setCreateDocumentType(int i) {
        this.createDocumentType = i;
    }

    public final void setPageMode(int i) {
        this.pageMode = i;
    }

    public final void setSpaceList(ArrayList<WikiDocument> arrayList) {
        this.spaceList = arrayList;
    }

    public final void setSrcIsLock(int i) {
        this.srcIsLock = i;
    }

    public final void setSrcObjType(int i) {
        this.srcObjType = i;
    }

    public final void setSrcParentToken(String str) {
        this.srcParentToken = str;
    }

    public final void setSrcToken(String str) {
        this.srcToken = str;
    }

    public WikiSpaceListArgs(ArrayList<WikiDocument> arrayList, int i, int i2, String str, int i3, String str2, int i4) {
        this.spaceList = arrayList;
        this.pageMode = i;
        this.createDocumentType = i2;
        this.srcToken = str;
        this.srcObjType = i3;
        this.srcParentToken = str2;
        this.srcIsLock = i4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ WikiSpaceListArgs(java.util.ArrayList r6, int r7, int r8, java.lang.String r9, int r10, java.lang.String r11, int r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            r0 = 0
            if (r14 == 0) goto L_0x0008
            r6 = r0
            java.util.ArrayList r6 = (java.util.ArrayList) r6
        L_0x0008:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x000f
            r7 = 0
            r14 = 0
            goto L_0x0010
        L_0x000f:
            r14 = r7
        L_0x0010:
            r7 = r13 & 4
            r1 = -1
            if (r7 == 0) goto L_0x0017
            r2 = -1
            goto L_0x0018
        L_0x0017:
            r2 = r8
        L_0x0018:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001f
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
        L_0x001f:
            r3 = r9
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0026
            r4 = -1
            goto L_0x0027
        L_0x0026:
            r4 = r10
        L_0x0027:
            r7 = r13 & 32
            if (r7 == 0) goto L_0x002e
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
        L_0x002e:
            r0 = r11
            r7 = r13 & 64
            if (r7 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r1 = r12
        L_0x0035:
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r0
            r14 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.wikiv2.home.viewall.WikiSpaceListArgs.<init>(java.util.ArrayList, int, int, java.lang.String, int, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
