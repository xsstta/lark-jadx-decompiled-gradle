package com.ss.ugc.effectplatform.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B¥\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0013J\t\u00105\u001a\u000206HÖ\u0001J\u0019\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u000206HÖ\u0001R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0015\"\u0004\b0\u0010\u0017R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u0010\u001bR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0015\"\u0004\b4\u0010\u0017¨\u0006<"}, d2 = {"Lcom/ss/ugc/effectplatform/model/EffectCategoryResponse;", "Lcom/ss/ugc/effectplatform/model/AndroidParcelable;", "id", "", "name", "key", "icon_normal_url", "icon_selected_url", "front_effect", "Lcom/ss/ugc/effectplatform/model/Effect;", "rear_effect", "total_effects", "", "tags", "tags_update_time", "collection_effect", "is_default", "", "extra", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/ugc/effectplatform/model/Effect;Lcom/ss/ugc/effectplatform/model/Effect;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;)V", "getCollection_effect", "()Ljava/util/List;", "setCollection_effect", "(Ljava/util/List;)V", "getExtra", "()Ljava/lang/String;", "setExtra", "(Ljava/lang/String;)V", "getFront_effect", "()Lcom/ss/ugc/effectplatform/model/Effect;", "setFront_effect", "(Lcom/ss/ugc/effectplatform/model/Effect;)V", "getIcon_normal_url", "setIcon_normal_url", "getIcon_selected_url", "setIcon_selected_url", "getId", "setId", "()Z", "set_default", "(Z)V", "getKey", "setKey", "getName", "setName", "getRear_effect", "setRear_effect", "getTags", "setTags", "getTags_update_time", "setTags_update_time", "getTotal_effects", "setTotal_effects", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
public class EffectCategoryResponse implements AndroidParcelable {
    public static final Parcelable.Creator CREATOR = new C65513a();
    private List<? extends Effect> collection_effect;
    private String extra;
    private Effect front_effect;
    private String icon_normal_url;
    private String icon_selected_url;
    private String id;
    private boolean is_default;
    private String key;
    private String name;
    private Effect rear_effect;
    private List<String> tags;
    private String tags_update_time;
    private List<? extends Effect> total_effects;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.model.EffectCategoryResponse$a */
    public static class C65513a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Effect effect = (Effect) parcel.readParcelable(EffectCategoryResponse.class.getClassLoader());
            Effect effect2 = (Effect) parcel.readParcelable(EffectCategoryResponse.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((Effect) parcel.readParcelable(EffectCategoryResponse.class.getClassLoader()));
                readInt--;
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            String readString6 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList2.add((Effect) parcel.readParcelable(EffectCategoryResponse.class.getClassLoader()));
                readInt2--;
            }
            return new EffectCategoryResponse(readString, readString2, readString3, readString4, readString5, effect, effect2, arrayList, createStringArrayList, readString6, arrayList2, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EffectCategoryResponse[i];
        }
    }

    public EffectCategoryResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, false, null, 8191, null);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.key);
        parcel.writeString(this.icon_normal_url);
        parcel.writeString(this.icon_selected_url);
        parcel.writeParcelable(this.front_effect, i);
        parcel.writeParcelable(this.rear_effect, i);
        List<? extends Effect> list = this.total_effects;
        parcel.writeInt(list.size());
        for (Effect effect : list) {
            parcel.writeParcelable(effect, i);
        }
        parcel.writeStringList(this.tags);
        parcel.writeString(this.tags_update_time);
        List<? extends Effect> list2 = this.collection_effect;
        parcel.writeInt(list2.size());
        for (Effect effect2 : list2) {
            parcel.writeParcelable(effect2, i);
        }
        parcel.writeInt(this.is_default ? 1 : 0);
        parcel.writeString(this.extra);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public List<Effect> getCollection_effect() {
        return this.collection_effect;
    }

    public String getExtra() {
        return this.extra;
    }

    public Effect getFront_effect() {
        return this.front_effect;
    }

    public String getIcon_normal_url() {
        return this.icon_normal_url;
    }

    public String getIcon_selected_url() {
        return this.icon_selected_url;
    }

    public String getId() {
        return this.id;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public Effect getRear_effect() {
        return this.rear_effect;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTags_update_time() {
        return this.tags_update_time;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public List<Effect> getTotal_effects() {
        return this.total_effects;
    }

    public boolean is_default() {
        return this.is_default;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFront_effect(Effect effect) {
        this.front_effect = effect;
    }

    public void setIcon_normal_url(String str) {
        this.icon_normal_url = str;
    }

    public void setIcon_selected_url(String str) {
        this.icon_selected_url = str;
    }

    public void setRear_effect(Effect effect) {
        this.rear_effect = effect;
    }

    public void setTags_update_time(String str) {
        this.tags_update_time = str;
    }

    public void set_default(boolean z) {
        this.is_default = z;
    }

    public void setCollection_effect(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.collection_effect = list;
    }

    public void setId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.id = str;
    }

    public void setKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.key = str;
    }

    public void setName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.name = str;
    }

    public void setTags(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.tags = list;
    }

    public void setTotal_effects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.total_effects = list;
    }

    public EffectCategoryResponse(String str, String str2, String str3, String str4, String str5, Effect effect, Effect effect2, List<? extends Effect> list, List<String> list2, String str6, List<? extends Effect> list3, boolean z, String str7) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "key");
        Intrinsics.checkParameterIsNotNull(list, "total_effects");
        Intrinsics.checkParameterIsNotNull(list2, "tags");
        Intrinsics.checkParameterIsNotNull(list3, "collection_effect");
        this.id = str;
        this.name = str2;
        this.key = str3;
        this.icon_normal_url = str4;
        this.icon_selected_url = str5;
        this.front_effect = effect;
        this.rear_effect = effect2;
        this.total_effects = list;
        this.tags = list2;
        this.tags_update_time = str6;
        this.collection_effect = list3;
        this.is_default = z;
        this.extra = str7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ EffectCategoryResponse(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, com.ss.ugc.effectplatform.model.Effect r20, com.ss.ugc.effectplatform.model.Effect r21, java.util.List r22, java.util.List r23, java.lang.String r24, java.util.List r25, boolean r26, java.lang.String r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.EffectCategoryResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.ugc.effectplatform.model.Effect, com.ss.ugc.effectplatform.model.Effect, java.util.List, java.util.List, java.lang.String, java.util.List, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
