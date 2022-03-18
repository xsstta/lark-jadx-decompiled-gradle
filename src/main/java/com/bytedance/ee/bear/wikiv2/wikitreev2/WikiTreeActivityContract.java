package com.bytedance.ee.bear.wikiv2.wikitreev2;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010.\u001a\u00020\bH\u0016J\u0018\u0010/\u001a\u0002002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u00101\u001a\u00020\bH\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR\u001a\u0010\u0019\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\fR\u001a\u0010\u001f\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\fR\u001c\u0010\"\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001c\u0010%\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010\u0012R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00063"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/WikiTreeActivityContract;", "Landroid/os/Parcelable;", "Lcom/bytedance/ee/util/io/NonProguard;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "createDocumentType", "", "getCreateDocumentType", "()I", "setCreateDocumentType", "(I)V", "documentName", "", "getDocumentName", "()Ljava/lang/String;", "setDocumentName", "(Ljava/lang/String;)V", "documentToken", "getDocumentToken", "setDocumentToken", "pageMode", "getPageMode", "setPageMode", "spaceId", "getSpaceId", "setSpaceId", "srcIsLock", "getSrcIsLock", "setSrcIsLock", "srcObjType", "getSrcObjType", "setSrcObjType", "srcParentToken", "getSrcParentToken", "setSrcParentToken", "srcToken", "getSrcToken", "setSrcToken", "wikiDocument", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikiDocument;", "getWikiDocument", "()Lcom/bytedance/ee/bear/contract/route/parcelable/WikiDocument;", "setWikiDocument", "(Lcom/bytedance/ee/bear/contract/route/parcelable/WikiDocument;)V", "describeContents", "writeToParcel", "", "flags", "CREATOR", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class WikiTreeActivityContract implements Parcelable, NonProguard {
    public static final CREATOR CREATOR = new CREATOR(null);
    private int createDocumentType;
    private String documentName;
    private String documentToken;
    private int pageMode;
    private String spaceId;
    private int srcIsLock;
    private int srcObjType;
    private String srcParentToken;
    private String srcToken;
    private WikiDocument wikiDocument;

    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/WikiTreeActivityContract$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/WikiTreeActivityContract;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bytedance/ee/bear/wikiv2/wikitreev2/WikiTreeActivityContract;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.WikiTreeActivityContract$a */
    public static final class CREATOR implements Parcelable.Creator<WikiTreeActivityContract> {
        private CREATOR() {
        }

        /* renamed from: a */
        public WikiTreeActivityContract[] newArray(int i) {
            return new WikiTreeActivityContract[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public WikiTreeActivityContract createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new WikiTreeActivityContract(parcel);
        }
    }

    public final int getCreateDocumentType() {
        return this.createDocumentType;
    }

    public final String getDocumentName() {
        return this.documentName;
    }

    public final String getDocumentToken() {
        return this.documentToken;
    }

    public final int getPageMode() {
        return this.pageMode;
    }

    public final String getSpaceId() {
        return this.spaceId;
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

    public final WikiDocument getWikiDocument() {
        return this.wikiDocument;
    }

    public WikiTreeActivityContract() {
        this.spaceId = "";
        this.documentToken = "";
        this.documentName = "";
        this.srcToken = "";
        this.srcParentToken = "";
        this.srcIsLock = -1;
        this.createDocumentType = -1;
        this.srcObjType = -1;
    }

    public final void setCreateDocumentType(int i) {
        this.createDocumentType = i;
    }

    public final void setDocumentName(String str) {
        this.documentName = str;
    }

    public final void setDocumentToken(String str) {
        this.documentToken = str;
    }

    public final void setPageMode(int i) {
        this.pageMode = i;
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

    public final void setWikiDocument(WikiDocument wikiDocument2) {
        this.wikiDocument = wikiDocument2;
    }

    public final void setSpaceId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.spaceId = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WikiTreeActivityContract(Parcel parcel) {
        this();
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        String readString = parcel.readString();
        String str = "";
        this.spaceId = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.documentToken = readString2 == null ? str : readString2;
        String readString3 = parcel.readString();
        this.documentName = readString3 == null ? str : readString3;
        this.pageMode = parcel.readInt();
        String readString4 = parcel.readString();
        this.srcToken = readString4 == null ? str : readString4;
        String readString5 = parcel.readString();
        this.srcParentToken = readString5 != null ? readString5 : str;
        this.srcIsLock = parcel.readInt();
        this.createDocumentType = parcel.readInt();
        this.wikiDocument = (WikiDocument) parcel.readParcelable(WikiDocument.class.getClassLoader());
        this.srcObjType = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.spaceId);
        parcel.writeString(this.documentToken);
        parcel.writeString(this.documentName);
        parcel.writeInt(this.pageMode);
        parcel.writeString(this.srcToken);
        parcel.writeString(this.srcParentToken);
        parcel.writeInt(this.srcIsLock);
        parcel.writeInt(this.createDocumentType);
        parcel.writeParcelable(this.wikiDocument, i);
        parcel.writeInt(this.srcObjType);
    }
}
