package com.ss.ugc.effectplatform.model;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J \u0010%\u001a\u00020&2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u0006\u0010(\u001a\u00020\u0003H\u0002Jc\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\u0016\u0010/\u001a\u0002002\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bJ\t\u00101\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001b¨\u00062"}, d2 = {"Lcom/ss/ugc/effectplatform/model/PlatformEffect;", "", "name", "", "hint", "file_uri", "icon_uri", "types", "", "hint_uri", "requirements", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getFile_uri", "()Ljava/lang/String;", "setFile_uri", "(Ljava/lang/String;)V", "getHint", "setHint", "getHint_uri", "setHint_uri", "getIcon_uri", "setIcon_uri", "getName", "setName", "getRequirements", "()Ljava/util/List;", "setRequirements", "(Ljava/util/List;)V", "getTypes", "setTypes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "concatPrefixWithUri", "Lcom/ss/ugc/effectplatform/model/UrlModel;", "url_prefix", "uri", "copy", "equals", "", "other", "hashCode", "", "toEffect", "Lcom/ss/ugc/effectplatform/model/Effect;", "toString", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PlatformEffect {
    private String file_uri;
    private String hint;
    private String hint_uri;
    private String icon_uri;
    private String name;
    private List<String> requirements;
    private List<String> types;

    public PlatformEffect() {
        this(null, null, null, null, null, null, null, SmActions.ACTION_ONTHECALL_ENTRY, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.ss.ugc.effectplatform.model.PlatformEffect */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlatformEffect copy$default(PlatformEffect platformEffect, String str, String str2, String str3, String str4, List list, String str5, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = platformEffect.name;
        }
        if ((i & 2) != 0) {
            str2 = platformEffect.hint;
        }
        if ((i & 4) != 0) {
            str3 = platformEffect.file_uri;
        }
        if ((i & 8) != 0) {
            str4 = platformEffect.icon_uri;
        }
        if ((i & 16) != 0) {
            list = platformEffect.types;
        }
        if ((i & 32) != 0) {
            str5 = platformEffect.hint_uri;
        }
        if ((i & 64) != 0) {
            list2 = platformEffect.requirements;
        }
        return platformEffect.copy(str, str2, str3, str4, list, str5, list2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.hint;
    }

    public final String component3() {
        return this.file_uri;
    }

    public final String component4() {
        return this.icon_uri;
    }

    public final List<String> component5() {
        return this.types;
    }

    public final String component6() {
        return this.hint_uri;
    }

    public final List<String> component7() {
        return this.requirements;
    }

    public final PlatformEffect copy(String str, String str2, String str3, String str4, List<String> list, String str5, List<String> list2) {
        Intrinsics.checkParameterIsNotNull(str3, "file_uri");
        Intrinsics.checkParameterIsNotNull(str4, "icon_uri");
        Intrinsics.checkParameterIsNotNull(str5, "hint_uri");
        return new PlatformEffect(str, str2, str3, str4, list, str5, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformEffect)) {
            return false;
        }
        PlatformEffect platformEffect = (PlatformEffect) obj;
        return Intrinsics.areEqual(this.name, platformEffect.name) && Intrinsics.areEqual(this.hint, platformEffect.hint) && Intrinsics.areEqual(this.file_uri, platformEffect.file_uri) && Intrinsics.areEqual(this.icon_uri, platformEffect.icon_uri) && Intrinsics.areEqual(this.types, platformEffect.types) && Intrinsics.areEqual(this.hint_uri, platformEffect.hint_uri) && Intrinsics.areEqual(this.requirements, platformEffect.requirements);
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.hint;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.file_uri;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.icon_uri;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<String> list = this.types;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        String str5 = this.hint_uri;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<String> list2 = this.requirements;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        return "PlatformEffect(name=" + this.name + ", hint=" + this.hint + ", file_uri=" + this.file_uri + ", icon_uri=" + this.icon_uri + ", types=" + this.types + ", hint_uri=" + this.hint_uri + ", requirements=" + this.requirements + ")";
    }

    public final String getFile_uri() {
        return this.file_uri;
    }

    public final String getHint() {
        return this.hint;
    }

    public final String getHint_uri() {
        return this.hint_uri;
    }

    public final String getIcon_uri() {
        return this.icon_uri;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getRequirements() {
        return this.requirements;
    }

    public final List<String> getTypes() {
        return this.types;
    }

    public final void setHint(String str) {
        this.hint = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setRequirements(List<String> list) {
        this.requirements = list;
    }

    public final void setTypes(List<String> list) {
        this.types = list;
    }

    public final void setFile_uri(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.file_uri = str;
    }

    public final void setHint_uri(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.hint_uri = str;
    }

    public final void setIcon_uri(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.icon_uri = str;
    }

    public final Effect toEffect(List<String> list) {
        Effect effect = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, -1, 16383, null);
        String str = this.name;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        effect.setName(str);
        String str3 = this.hint;
        if (str3 == null) {
            str3 = str2;
        }
        effect.setHint(str3);
        effect.setFile_url(concatPrefixWithUri(list, this.file_uri));
        ArrayList arrayList = this.types;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        effect.setTypes(arrayList);
        effect.setHint_icon(concatPrefixWithUri(list, this.hint_uri));
        effect.setIcon_url(concatPrefixWithUri(list, this.icon_uri));
        ArrayList arrayList2 = this.requirements;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        effect.setRequirements(arrayList2);
        String str4 = this.file_uri;
        if (str4 != null) {
            str2 = str4;
        }
        effect.setId(str2);
        return effect;
    }

    private final UrlModel concatPrefixWithUri(List<String> list, String str) {
        UrlModel urlModel = new UrlModel(null, null, 3, null);
        urlModel.setUri(str);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i) + str);
            }
            urlModel.setUrl_list(arrayList);
        }
        return urlModel;
    }

    public PlatformEffect(String str, String str2, String str3, String str4, List<String> list, String str5, List<String> list2) {
        Intrinsics.checkParameterIsNotNull(str3, "file_uri");
        Intrinsics.checkParameterIsNotNull(str4, "icon_uri");
        Intrinsics.checkParameterIsNotNull(str5, "hint_uri");
        this.name = str;
        this.hint = str2;
        this.file_uri = str3;
        this.icon_uri = str4;
        this.types = list;
        this.hint_uri = str5;
        this.requirements = list2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PlatformEffect(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.util.List r10, java.lang.String r11, java.util.List r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            r0 = 0
            if (r14 == 0) goto L_0x0008
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
        L_0x0008:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x000f
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
        L_0x000f:
            r14 = r7
            r7 = r13 & 4
            java.lang.String r1 = ""
            if (r7 == 0) goto L_0x0018
            r2 = r1
            goto L_0x0019
        L_0x0018:
            r2 = r8
        L_0x0019:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001f
            r3 = r1
            goto L_0x0020
        L_0x001f:
            r3 = r9
        L_0x0020:
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0027
            r10 = r0
            java.util.List r10 = (java.util.List) r10
        L_0x0027:
            r4 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r1 = r11
        L_0x002e:
            r7 = r13 & 64
            if (r7 == 0) goto L_0x0035
            r12 = r0
            java.util.List r12 = (java.util.List) r12
        L_0x0035:
            r0 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r1
            r14 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.PlatformEffect.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
