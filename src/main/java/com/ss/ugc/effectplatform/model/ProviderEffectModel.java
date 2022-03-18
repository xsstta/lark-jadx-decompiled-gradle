package com.ss.ugc.effectplatform.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0017\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015¨\u0006\""}, d2 = {"Lcom/ss/ugc/effectplatform/model/ProviderEffectModel;", "", "search_tips", "", "cursor", "", "has_more", "", "sticker_list", "", "Lcom/ss/ugc/effectplatform/model/ProviderEffect;", "subtitle", "extra", "(Ljava/lang/String;IZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getCursor", "()I", "setCursor", "(I)V", "getExtra", "()Ljava/lang/String;", "setExtra", "(Ljava/lang/String;)V", "getHas_more", "()Z", "setHas_more", "(Z)V", "getSearch_tips", "setSearch_tips", "getSticker_list", "()Ljava/util/List;", "setSticker_list", "(Ljava/util/List;)V", "getSubtitle", "setSubtitle", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
public class ProviderEffectModel {
    private int cursor;
    private String extra;
    private boolean has_more;
    private String search_tips;
    private List<? extends ProviderEffect> sticker_list;
    private String subtitle;

    public ProviderEffectModel() {
        this(null, 0, false, null, null, null, 63, null);
    }

    public int getCursor() {
        return this.cursor;
    }

    public String getExtra() {
        return this.extra;
    }

    public boolean getHas_more() {
        return this.has_more;
    }

    public String getSearch_tips() {
        return this.search_tips;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.ProviderEffect>, java.util.List<com.ss.ugc.effectplatform.model.ProviderEffect> */
    public List<ProviderEffect> getSticker_list() {
        return this.sticker_list;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setCursor(int i) {
        this.cursor = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setHas_more(boolean z) {
        this.has_more = z;
    }

    public void setSearch_tips(String str) {
        this.search_tips = str;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public void setSticker_list(List<? extends ProviderEffect> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.sticker_list = list;
    }

    public ProviderEffectModel(String str, int i, boolean z, List<? extends ProviderEffect> list, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(list, "sticker_list");
        this.search_tips = str;
        this.cursor = i;
        this.has_more = z;
        this.sticker_list = list;
        this.subtitle = str2;
        this.extra = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ProviderEffectModel(java.lang.String r5, int r6, boolean r7, java.util.List r8, java.lang.String r9, java.lang.String r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            r0 = 0
            if (r12 == 0) goto L_0x0008
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
        L_0x0008:
            r12 = r11 & 2
            r1 = 0
            if (r12 == 0) goto L_0x000f
            r12 = 0
            goto L_0x0010
        L_0x000f:
            r12 = r6
        L_0x0010:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r1 = r7
        L_0x0016:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x0022
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r8 = r6
            java.util.List r8 = (java.util.List) r8
        L_0x0022:
            r2 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x002a
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
        L_0x002a:
            r3 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0032
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
        L_0x0032:
            r0 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.ProviderEffectModel.<init>(java.lang.String, int, boolean, java.util.List, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
