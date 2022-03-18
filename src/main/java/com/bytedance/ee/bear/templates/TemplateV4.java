package com.bytedance.ee.bear.templates;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p700c.C13598b;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\bT\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u00012\u00020\u00012\u00020\u0002:\u0002\u0001BÅ\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\b\b\u0002\u0010#\u001a\u00020\u0007\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010&\u0012\b\b\u0002\u0010'\u001a\u00020\"¢\u0006\u0002\u0010(J\b\u0010W\u001a\u00020\"H\u0002J\t\u0010X\u001a\u00020\u0004HÆ\u0003J\t\u0010Y\u001a\u00020\u0004HÆ\u0003J\t\u0010Z\u001a\u00020\u0010HÆ\u0003J\t\u0010[\u001a\u00020\u0004HÆ\u0003J\t\u0010\\\u001a\u00020\u0004HÆ\u0003J\t\u0010]\u001a\u00020\u0004HÆ\u0003J\t\u0010^\u001a\u00020\u0004HÆ\u0003J\t\u0010_\u001a\u00020\u0007HÆ\u0003J\t\u0010`\u001a\u00020\u0010HÆ\u0003J\t\u0010a\u001a\u00020\u0010HÆ\u0003J\t\u0010b\u001a\u00020\u0010HÆ\u0003J\t\u0010c\u001a\u00020\u0004HÆ\u0003J\t\u0010d\u001a\u00020\u0010HÆ\u0003J\t\u0010e\u001a\u00020\u0004HÆ\u0003J\t\u0010f\u001a\u00020\u0004HÆ\u0003J\t\u0010g\u001a\u00020\u0007HÆ\u0003J\t\u0010h\u001a\u00020\u0004HÆ\u0003J\t\u0010i\u001a\u00020\u0004HÆ\u0003J\t\u0010j\u001a\u00020 HÆ\u0003J\t\u0010k\u001a\u00020\"HÆ\u0003J\t\u0010l\u001a\u00020\u0007HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010n\u001a\u00020\u0007HÆ\u0003J\u0011\u0010o\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010&HÆ\u0003J\t\u0010p\u001a\u00020\"HÆ\u0003J\t\u0010q\u001a\u00020\u0004HÆ\u0003J\t\u0010r\u001a\u00020\u0004HÆ\u0003J\t\u0010s\u001a\u00020\u0004HÆ\u0003J\t\u0010t\u001a\u00020\u0007HÆ\u0003J\t\u0010u\u001a\u00020\u0004HÆ\u0003J\t\u0010v\u001a\u00020\u0004HÆ\u0003JÉ\u0002\u0010w\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010&2\b\b\u0002\u0010'\u001a\u00020\"HÆ\u0001J\t\u0010x\u001a\u00020\u0007HÖ\u0001J\u0013\u0010y\u001a\u00020\"2\b\u0010z\u001a\u0004\u0018\u00010{HÖ\u0003J\u0006\u0010|\u001a\u00020\u0004J\u0006\u0010}\u001a\u00020\u0004J\t\u0010~\u001a\u00020\u0007HÖ\u0001J\u0006\u0010\u001a\u00020\"J\u0007\u0010\u0001\u001a\u00020\"J\u0007\u0010\u0001\u001a\u00020\"J\u0007\u0010\u0001\u001a\u00020\"J\u0007\u0010\u0001\u001a\u00020\"J\n\u0010\u0001\u001a\u00020\u0004HÖ\u0001J\u001e\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001a\u0010'\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0011\u0010\u0015\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u001a\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u0011\u0010\u001b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010*R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010*R\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010*\"\u0004\b5\u00106R\u0011\u0010\u001e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010*R\u0011\u0010\u001d\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010*R\u0011\u0010\u0016\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010*R\u0011\u0010\u001c\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b<\u00100R\u001a\u0010!\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010,\"\u0004\b>\u0010.R\u0011\u0010\u0012\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010*R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b@\u0010:R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010*R\u0011\u0010\u0019\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bB\u0010:R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010*R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010*R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bE\u00100R\"\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010*R\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010*R\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010*R\u0011\u0010\u0018\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bM\u0010:R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bN\u00100R\u001a\u0010#\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u00100\"\u0004\bP\u0010QR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0011\u0010\u0017\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bT\u0010:R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010*R\u0011\u0010\u0014\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010*¨\u0006\u0001"}, d2 = {"Lcom/bytedance/ee/bear/templates/TemplateV4;", "Landroid/os/Parcelable;", "Lcom/bytedance/ee/util/io/NonProguard;", "id", "", "name", "objType", "", "objToken", "categoryId", "description", ShareHitPoint.f121868c, "platform", "operationalLabel", "operationalLabelV2", "heat", "", "authorName", "fromUserId", "userAvatarUrl", "userName", "bottomLabelType", "createTime", "updateTime", "shareTime", "lastUsedTime", "boxColorBg", "boxColorShadow", "displayType", "coverToken", "coverDownloadUrl", "thumbnailExtra", "Lcom/bytedance/ee/bear/templates/ThumbnailExtra;", "enable", "", "templateType", "collectionId", "objTypes", "", "blankDocument", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJJJLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/bytedance/ee/bear/templates/ThumbnailExtra;ZILjava/lang/String;Ljava/util/List;Z)V", "getAuthorName", "()Ljava/lang/String;", "getBlankDocument", "()Z", "setBlankDocument", "(Z)V", "getBottomLabelType", "()I", "getBoxColorBg", "getBoxColorShadow", "getCategoryId", "getCollectionId", "setCollectionId", "(Ljava/lang/String;)V", "getCoverDownloadUrl", "getCoverToken", "getCreateTime", "()J", "getDescription", "getDisplayType", "getEnable", "setEnable", "getFromUserId", "getHeat", "getId", "getLastUsedTime", "getName", "getObjToken", "getObjType", "getObjTypes", "()Ljava/util/List;", "setObjTypes", "(Ljava/util/List;)V", "getOperationalLabel", "getOperationalLabelV2", "getPlatform", "getShareTime", "getSource", "getTemplateType", "setTemplateType", "(I)V", "getThumbnailExtra", "()Lcom/bytedance/ee/bear/templates/ThumbnailExtra;", "getUpdateTime", "getUserAvatarUrl", "getUserName", "canReportNotEncryption", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "getReportName", "getReportToken", "hashCode", "isBlankDocumentTemplate", "isBusinessTemplate", "isCustomTemplate", "isSceneTemplate", "isSystemTemplate", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class TemplateV4 implements Parcelable, NonProguard {
    public static final Parcelable.Creator CREATOR = new C11435b();
    public static final Companion Companion = new Companion(null);
    private final String authorName;
    private boolean blankDocument;
    private final int bottomLabelType;
    private final String boxColorBg;
    private final String boxColorShadow;
    private final String categoryId;
    private String collectionId;
    private final String coverDownloadUrl;
    private final String coverToken;
    private final long createTime;
    private final String description;
    private final int displayType;
    private boolean enable;
    private final String fromUserId;
    private final long heat;
    private final String id;
    private final long lastUsedTime;
    private final String name;
    private final String objToken;
    private final int objType;
    private List<Integer> objTypes;
    private final String operationalLabel;
    private final String operationalLabelV2;
    private final String platform;
    private final long shareTime;
    private final int source;
    private int templateType;
    private final ThumbnailExtra thumbnailExtra;
    private final long updateTime;
    private final String userAvatarUrl;
    private final String userName;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.TemplateV4$b */
    public static class C11435b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            String str;
            ArrayList arrayList;
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            int readInt2 = parcel.readInt();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            long readLong = parcel.readLong();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            int readInt3 = parcel.readInt();
            long readLong2 = parcel.readLong();
            long readLong3 = parcel.readLong();
            long readLong4 = parcel.readLong();
            long readLong5 = parcel.readLong();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            int readInt4 = parcel.readInt();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            ThumbnailExtra thumbnailExtra = (ThumbnailExtra) ThumbnailExtra.CREATOR.createFromParcel(parcel);
            boolean z = parcel.readInt() != 0;
            int readInt5 = parcel.readInt();
            String readString17 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                arrayList = new ArrayList(readInt6);
                while (readInt6 != 0) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                    readInt6--;
                    readString9 = readString9;
                }
                str = readString9;
            } else {
                str = readString9;
                arrayList = null;
            }
            return new TemplateV4(readString, readString2, readInt, readString3, readString4, readString5, readInt2, readString6, readString7, readString8, readLong, str, readString10, readString11, readString12, readInt3, readLong2, readLong3, readLong4, readLong5, readString13, readString14, readInt4, readString15, readString16, thumbnailExtra, z, readInt5, readString17, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TemplateV4[i];
        }
    }

    public TemplateV4() {
        this(null, null, 0, null, null, null, 0, null, null, null, 0, null, null, null, null, 0, 0, 0, 0, 0, null, null, 0, null, null, null, false, 0, null, null, false, Integer.MAX_VALUE, null);
    }

    public static /* synthetic */ TemplateV4 copy$default(TemplateV4 templateV4, String str, String str2, int i, String str3, String str4, String str5, int i2, String str6, String str7, String str8, long j, String str9, String str10, String str11, String str12, int i3, long j2, long j3, long j4, long j5, String str13, String str14, int i4, String str15, String str16, ThumbnailExtra thumbnailExtra2, boolean z, int i5, String str17, List list, boolean z2, int i6, Object obj) {
        return templateV4.copy((i6 & 1) != 0 ? templateV4.id : str, (i6 & 2) != 0 ? templateV4.name : str2, (i6 & 4) != 0 ? templateV4.objType : i, (i6 & 8) != 0 ? templateV4.objToken : str3, (i6 & 16) != 0 ? templateV4.categoryId : str4, (i6 & 32) != 0 ? templateV4.description : str5, (i6 & 64) != 0 ? templateV4.source : i2, (i6 & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? templateV4.platform : str6, (i6 & DynamicModule.f58006b) != 0 ? templateV4.operationalLabel : str7, (i6 & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? templateV4.operationalLabelV2 : str8, (i6 & 1024) != 0 ? templateV4.heat : j, (i6 & 2048) != 0 ? templateV4.authorName : str9, (i6 & 4096) != 0 ? templateV4.fromUserId : str10, (i6 & 8192) != 0 ? templateV4.userAvatarUrl : str11, (i6 & 16384) != 0 ? templateV4.userName : str12, (i6 & 32768) != 0 ? templateV4.bottomLabelType : i3, (i6 & 65536) != 0 ? templateV4.createTime : j2, (i6 & 131072) != 0 ? templateV4.updateTime : j3, (i6 & 262144) != 0 ? templateV4.shareTime : j4, (i6 & 524288) != 0 ? templateV4.lastUsedTime : j5, (i6 & 1048576) != 0 ? templateV4.boxColorBg : str13, (2097152 & i6) != 0 ? templateV4.boxColorShadow : str14, (i6 & 4194304) != 0 ? templateV4.displayType : i4, (i6 & 8388608) != 0 ? templateV4.coverToken : str15, (i6 & 16777216) != 0 ? templateV4.coverDownloadUrl : str16, (i6 & 33554432) != 0 ? templateV4.thumbnailExtra : thumbnailExtra2, (i6 & 67108864) != 0 ? templateV4.enable : z, (i6 & 134217728) != 0 ? templateV4.templateType : i5, (i6 & 268435456) != 0 ? templateV4.collectionId : str17, (i6 & 536870912) != 0 ? templateV4.objTypes : list, (i6 & 1073741824) != 0 ? templateV4.blankDocument : z2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.operationalLabelV2;
    }

    public final long component11() {
        return this.heat;
    }

    public final String component12() {
        return this.authorName;
    }

    public final String component13() {
        return this.fromUserId;
    }

    public final String component14() {
        return this.userAvatarUrl;
    }

    public final String component15() {
        return this.userName;
    }

    public final int component16() {
        return this.bottomLabelType;
    }

    public final long component17() {
        return this.createTime;
    }

    public final long component18() {
        return this.updateTime;
    }

    public final long component19() {
        return this.shareTime;
    }

    public final String component2() {
        return this.name;
    }

    public final long component20() {
        return this.lastUsedTime;
    }

    public final String component21() {
        return this.boxColorBg;
    }

    public final String component22() {
        return this.boxColorShadow;
    }

    public final int component23() {
        return this.displayType;
    }

    public final String component24() {
        return this.coverToken;
    }

    public final String component25() {
        return this.coverDownloadUrl;
    }

    public final ThumbnailExtra component26() {
        return this.thumbnailExtra;
    }

    public final boolean component27() {
        return this.enable;
    }

    public final int component28() {
        return this.templateType;
    }

    public final String component29() {
        return this.collectionId;
    }

    public final int component3() {
        return this.objType;
    }

    public final List<Integer> component30() {
        return this.objTypes;
    }

    public final boolean component31() {
        return this.blankDocument;
    }

    public final String component4() {
        return this.objToken;
    }

    public final String component5() {
        return this.categoryId;
    }

    public final String component6() {
        return this.description;
    }

    public final int component7() {
        return this.source;
    }

    public final String component8() {
        return this.platform;
    }

    public final String component9() {
        return this.operationalLabel;
    }

    public final TemplateV4 copy(String str, String str2, int i, String str3, String str4, String str5, int i2, String str6, String str7, String str8, long j, String str9, String str10, String str11, String str12, int i3, long j2, long j3, long j4, long j5, String str13, String str14, int i4, String str15, String str16, ThumbnailExtra thumbnailExtra2, boolean z, int i5, String str17, List<Integer> list, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "objToken");
        Intrinsics.checkParameterIsNotNull(str4, "categoryId");
        Intrinsics.checkParameterIsNotNull(str5, "description");
        Intrinsics.checkParameterIsNotNull(str6, "platform");
        Intrinsics.checkParameterIsNotNull(str7, "operationalLabel");
        Intrinsics.checkParameterIsNotNull(str8, "operationalLabelV2");
        Intrinsics.checkParameterIsNotNull(str9, "authorName");
        Intrinsics.checkParameterIsNotNull(str10, "fromUserId");
        Intrinsics.checkParameterIsNotNull(str11, "userAvatarUrl");
        Intrinsics.checkParameterIsNotNull(str12, "userName");
        Intrinsics.checkParameterIsNotNull(str13, "boxColorBg");
        Intrinsics.checkParameterIsNotNull(str14, "boxColorShadow");
        Intrinsics.checkParameterIsNotNull(str15, "coverToken");
        Intrinsics.checkParameterIsNotNull(str16, "coverDownloadUrl");
        Intrinsics.checkParameterIsNotNull(thumbnailExtra2, "thumbnailExtra");
        return new TemplateV4(str, str2, i, str3, str4, str5, i2, str6, str7, str8, j, str9, str10, str11, str12, i3, j2, j3, j4, j5, str13, str14, i4, str15, str16, thumbnailExtra2, z, i5, str17, list, z2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TemplateV4) {
                TemplateV4 templateV4 = (TemplateV4) obj;
                if (Intrinsics.areEqual(this.id, templateV4.id) && Intrinsics.areEqual(this.name, templateV4.name)) {
                    if ((this.objType == templateV4.objType) && Intrinsics.areEqual(this.objToken, templateV4.objToken) && Intrinsics.areEqual(this.categoryId, templateV4.categoryId) && Intrinsics.areEqual(this.description, templateV4.description)) {
                        if ((this.source == templateV4.source) && Intrinsics.areEqual(this.platform, templateV4.platform) && Intrinsics.areEqual(this.operationalLabel, templateV4.operationalLabel) && Intrinsics.areEqual(this.operationalLabelV2, templateV4.operationalLabelV2)) {
                            if ((this.heat == templateV4.heat) && Intrinsics.areEqual(this.authorName, templateV4.authorName) && Intrinsics.areEqual(this.fromUserId, templateV4.fromUserId) && Intrinsics.areEqual(this.userAvatarUrl, templateV4.userAvatarUrl) && Intrinsics.areEqual(this.userName, templateV4.userName)) {
                                if (this.bottomLabelType == templateV4.bottomLabelType) {
                                    if (this.createTime == templateV4.createTime) {
                                        if (this.updateTime == templateV4.updateTime) {
                                            if (this.shareTime == templateV4.shareTime) {
                                                if ((this.lastUsedTime == templateV4.lastUsedTime) && Intrinsics.areEqual(this.boxColorBg, templateV4.boxColorBg) && Intrinsics.areEqual(this.boxColorShadow, templateV4.boxColorShadow)) {
                                                    if ((this.displayType == templateV4.displayType) && Intrinsics.areEqual(this.coverToken, templateV4.coverToken) && Intrinsics.areEqual(this.coverDownloadUrl, templateV4.coverDownloadUrl) && Intrinsics.areEqual(this.thumbnailExtra, templateV4.thumbnailExtra)) {
                                                        if (this.enable == templateV4.enable) {
                                                            if ((this.templateType == templateV4.templateType) && Intrinsics.areEqual(this.collectionId, templateV4.collectionId) && Intrinsics.areEqual(this.objTypes, templateV4.objTypes)) {
                                                                if (this.blankDocument == templateV4.blankDocument) {
                                                                    return true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.objType) * 31;
        String str3 = this.objToken;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.categoryId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.description;
        int hashCode5 = (((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.source) * 31;
        String str6 = this.platform;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.operationalLabel;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.operationalLabelV2;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        long j = this.heat;
        int i2 = (((hashCode7 + hashCode8) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str9 = this.authorName;
        int hashCode9 = (i2 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.fromUserId;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.userAvatarUrl;
        int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.userName;
        int hashCode12 = str12 != null ? str12.hashCode() : 0;
        long j2 = this.createTime;
        long j3 = this.updateTime;
        long j4 = this.shareTime;
        long j5 = this.lastUsedTime;
        int i3 = (((((((((((hashCode11 + hashCode12) * 31) + this.bottomLabelType) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        String str13 = this.boxColorBg;
        int hashCode13 = (i3 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.boxColorShadow;
        int hashCode14 = (((hashCode13 + (str14 != null ? str14.hashCode() : 0)) * 31) + this.displayType) * 31;
        String str15 = this.coverToken;
        int hashCode15 = (hashCode14 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.coverDownloadUrl;
        int hashCode16 = (hashCode15 + (str16 != null ? str16.hashCode() : 0)) * 31;
        ThumbnailExtra thumbnailExtra2 = this.thumbnailExtra;
        int hashCode17 = (hashCode16 + (thumbnailExtra2 != null ? thumbnailExtra2.hashCode() : 0)) * 31;
        boolean z = this.enable;
        int i4 = 1;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = (((hashCode17 + i5) * 31) + this.templateType) * 31;
        String str17 = this.collectionId;
        int hashCode18 = (i8 + (str17 != null ? str17.hashCode() : 0)) * 31;
        List<Integer> list = this.objTypes;
        if (list != null) {
            i = list.hashCode();
        }
        int i9 = (hashCode18 + i) * 31;
        boolean z2 = this.blankDocument;
        if (!z2) {
            i4 = z2 ? 1 : 0;
        }
        return i9 + i4;
    }

    public String toString() {
        return "TemplateV4(id=" + this.id + ", name=" + this.name + ", objType=" + this.objType + ", objToken=" + this.objToken + ", categoryId=" + this.categoryId + ", description=" + this.description + ", source=" + this.source + ", platform=" + this.platform + ", operationalLabel=" + this.operationalLabel + ", operationalLabelV2=" + this.operationalLabelV2 + ", heat=" + this.heat + ", authorName=" + this.authorName + ", fromUserId=" + this.fromUserId + ", userAvatarUrl=" + this.userAvatarUrl + ", userName=" + this.userName + ", bottomLabelType=" + this.bottomLabelType + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", shareTime=" + this.shareTime + ", lastUsedTime=" + this.lastUsedTime + ", boxColorBg=" + this.boxColorBg + ", boxColorShadow=" + this.boxColorShadow + ", displayType=" + this.displayType + ", coverToken=" + this.coverToken + ", coverDownloadUrl=" + this.coverDownloadUrl + ", thumbnailExtra=" + this.thumbnailExtra + ", enable=" + this.enable + ", templateType=" + this.templateType + ", collectionId=" + this.collectionId + ", objTypes=" + this.objTypes + ", blankDocument=" + this.blankDocument + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeInt(this.objType);
        parcel.writeString(this.objToken);
        parcel.writeString(this.categoryId);
        parcel.writeString(this.description);
        parcel.writeInt(this.source);
        parcel.writeString(this.platform);
        parcel.writeString(this.operationalLabel);
        parcel.writeString(this.operationalLabelV2);
        parcel.writeLong(this.heat);
        parcel.writeString(this.authorName);
        parcel.writeString(this.fromUserId);
        parcel.writeString(this.userAvatarUrl);
        parcel.writeString(this.userName);
        parcel.writeInt(this.bottomLabelType);
        parcel.writeLong(this.createTime);
        parcel.writeLong(this.updateTime);
        parcel.writeLong(this.shareTime);
        parcel.writeLong(this.lastUsedTime);
        parcel.writeString(this.boxColorBg);
        parcel.writeString(this.boxColorShadow);
        parcel.writeInt(this.displayType);
        parcel.writeString(this.coverToken);
        parcel.writeString(this.coverDownloadUrl);
        this.thumbnailExtra.writeToParcel(parcel, 0);
        parcel.writeInt(this.enable ? 1 : 0);
        parcel.writeInt(this.templateType);
        parcel.writeString(this.collectionId);
        List<Integer> list = this.objTypes;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Integer num : list) {
                parcel.writeInt(num.intValue());
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.blankDocument ? 1 : 0);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/templates/TemplateV4$Companion;", "", "()V", "CUSTOM", "", "DISPLAY_TYPE_COVER", "DISPLAY_TYPE_MIXTURE", "DISPLAY_TYPE_THUMBNAIL", "TYPE_CREATE_TIME", "TYPE_NORMAL_TEMPLATE", "TYPE_SCENE_TEMPLATE", "TYPE_SHARE_EDIT_TIME", "TYPE_SHARE_LAST_USE_TIME", "TYPE_SHARE_USER", "TYPE_USED", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.TemplateV4$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final boolean getBlankDocument() {
        return this.blankDocument;
    }

    public final int getBottomLabelType() {
        return this.bottomLabelType;
    }

    public final String getBoxColorBg() {
        return this.boxColorBg;
    }

    public final String getBoxColorShadow() {
        return this.boxColorShadow;
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final String getCoverDownloadUrl() {
        return this.coverDownloadUrl;
    }

    public final String getCoverToken() {
        return this.coverToken;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getDisplayType() {
        return this.displayType;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final String getFromUserId() {
        return this.fromUserId;
    }

    public final long getHeat() {
        return this.heat;
    }

    public final String getId() {
        return this.id;
    }

    public final long getLastUsedTime() {
        return this.lastUsedTime;
    }

    public final String getName() {
        return this.name;
    }

    public final String getObjToken() {
        return this.objToken;
    }

    public final int getObjType() {
        return this.objType;
    }

    public final List<Integer> getObjTypes() {
        return this.objTypes;
    }

    public final String getOperationalLabel() {
        return this.operationalLabel;
    }

    public final String getOperationalLabelV2() {
        return this.operationalLabelV2;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final long getShareTime() {
        return this.shareTime;
    }

    public final int getSource() {
        return this.source;
    }

    public final int getTemplateType() {
        return this.templateType;
    }

    public final ThumbnailExtra getThumbnailExtra() {
        return this.thumbnailExtra;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final String getUserAvatarUrl() {
        return this.userAvatarUrl;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final boolean isBlankDocumentTemplate() {
        return this.blankDocument;
    }

    private final boolean canReportNotEncryption() {
        if (this.source == 1) {
            return true;
        }
        return false;
    }

    public final boolean isSystemTemplate() {
        if (this.source == 1) {
            return true;
        }
        return false;
    }

    public final boolean isBusinessTemplate() {
        if (this.source == 3) {
            return true;
        }
        return false;
    }

    public final boolean isCustomTemplate() {
        if (this.source == 2) {
            return true;
        }
        return false;
    }

    public final boolean isSceneTemplate() {
        if (this.templateType == 2) {
            return true;
        }
        return false;
    }

    public final String getReportName() {
        if (canReportNotEncryption()) {
            return this.name;
        }
        String d = C13598b.m55197d(this.name);
        Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncription(name)");
        return d;
    }

    public final String getReportToken() {
        if (canReportNotEncryption()) {
            return this.objToken;
        }
        String d = C13598b.m55197d(this.objToken);
        Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncription(objToken)");
        return d;
    }

    public final void setBlankDocument(boolean z) {
        this.blankDocument = z;
    }

    public final void setCollectionId(String str) {
        this.collectionId = str;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setObjTypes(List<Integer> list) {
        this.objTypes = list;
    }

    public final void setTemplateType(int i) {
        this.templateType = i;
    }

    public TemplateV4(String str, String str2, int i, String str3, String str4, String str5, int i2, String str6, String str7, String str8, long j, String str9, String str10, String str11, String str12, int i3, long j2, long j3, long j4, long j5, String str13, String str14, int i4, String str15, String str16, ThumbnailExtra thumbnailExtra2, boolean z, int i5, String str17, List<Integer> list, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "objToken");
        Intrinsics.checkParameterIsNotNull(str4, "categoryId");
        Intrinsics.checkParameterIsNotNull(str5, "description");
        Intrinsics.checkParameterIsNotNull(str6, "platform");
        Intrinsics.checkParameterIsNotNull(str7, "operationalLabel");
        Intrinsics.checkParameterIsNotNull(str8, "operationalLabelV2");
        Intrinsics.checkParameterIsNotNull(str9, "authorName");
        Intrinsics.checkParameterIsNotNull(str10, "fromUserId");
        Intrinsics.checkParameterIsNotNull(str11, "userAvatarUrl");
        Intrinsics.checkParameterIsNotNull(str12, "userName");
        Intrinsics.checkParameterIsNotNull(str13, "boxColorBg");
        Intrinsics.checkParameterIsNotNull(str14, "boxColorShadow");
        Intrinsics.checkParameterIsNotNull(str15, "coverToken");
        Intrinsics.checkParameterIsNotNull(str16, "coverDownloadUrl");
        Intrinsics.checkParameterIsNotNull(thumbnailExtra2, "thumbnailExtra");
        this.id = str;
        this.name = str2;
        this.objType = i;
        this.objToken = str3;
        this.categoryId = str4;
        this.description = str5;
        this.source = i2;
        this.platform = str6;
        this.operationalLabel = str7;
        this.operationalLabelV2 = str8;
        this.heat = j;
        this.authorName = str9;
        this.fromUserId = str10;
        this.userAvatarUrl = str11;
        this.userName = str12;
        this.bottomLabelType = i3;
        this.createTime = j2;
        this.updateTime = j3;
        this.shareTime = j4;
        this.lastUsedTime = j5;
        this.boxColorBg = str13;
        this.boxColorShadow = str14;
        this.displayType = i4;
        this.coverToken = str15;
        this.coverDownloadUrl = str16;
        this.thumbnailExtra = thumbnailExtra2;
        this.enable = z;
        this.templateType = i5;
        this.collectionId = str17;
        this.objTypes = list;
        this.blankDocument = z2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TemplateV4(java.lang.String r39, java.lang.String r40, int r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, int r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, long r49, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, int r55, long r56, long r58, long r60, long r62, java.lang.String r64, java.lang.String r65, int r66, java.lang.String r67, java.lang.String r68, com.bytedance.ee.bear.templates.ThumbnailExtra r69, boolean r70, int r71, java.lang.String r72, java.util.List r73, boolean r74, int r75, kotlin.jvm.internal.DefaultConstructorMarker r76) {
        /*
        // Method dump skipped, instructions count: 409
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.templates.TemplateV4.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, long, long, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, com.bytedance.ee.bear.templates.ThumbnailExtra, boolean, int, java.lang.String, java.util.List, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
