package com.ss.ugc.effectplatform.model.net;

import com.google.firebase.messaging.Constants;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.NetResponseChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\b\u0017\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B[\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\u0010\fJ\u0010\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\n\u0010#\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010$\u001a\u00020\tH\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002X\u000e¢\u0006\u0002\n\u0000R0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F@FX\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002X\u000e¢\u0006\u0002\n\u0000R0\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F@FX\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\u0010¨\u0006%"}, d2 = {"Lcom/ss/ugc/effectplatform/model/net/EffectListResponse;", "Lcom/ss/ugc/effectplatform/model/NetResponseChecker;", "", "Lcom/ss/ugc/effectplatform/model/Effect;", "url_prefix", "", "bind_effects", "collection", "status_code", "", "message", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/util/List;)V", "getBind_effects", "()Ljava/util/List;", "setBind_effects", "(Ljava/util/List;)V", "value", "collection_list", "getCollection_list", "setCollection_list", "effect_list", "getEffect_list", "setEffect_list", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getStatus_code", "()I", "setStatus_code", "(I)V", "getUrl_prefix", "setUrl_prefix", "getResponseData", "getResponseMessage", "getStatusCode", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
public class EffectListResponse extends NetResponseChecker<List<? extends Effect>> {
    private List<? extends Effect> bind_effects;
    private List<? extends Effect> collection;
    private List<? extends Effect> data;
    private String message;
    private int status_code;
    private List<String> url_prefix;

    public EffectListResponse() {
        this(null, null, null, 0, null, null, 63, null);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public List<Effect> getBind_effects() {
        return this.bind_effects;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getCollection_list() {
        return this.collection;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getEffect_list() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public String getResponseMessage() {
        return getMessage();
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public int getStatusCode() {
        return getStatus_code();
    }

    /* Return type fixed from 'java.util.List<com.ss.ugc.effectplatform.model.Effect>' to match base method */
    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public List<? extends Effect> getResponseData() {
        return getEffect_list();
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setBind_effects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.bind_effects = list;
    }

    public final void setCollection_list(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.collection = list;
    }

    public final void setEffect_list(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.data = list;
    }

    public void setUrl_prefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.url_prefix = list;
    }

    public EffectListResponse(List<String> list, List<? extends Effect> list2, List<? extends Effect> list3, int i, String str, List<? extends Effect> list4) {
        Intrinsics.checkParameterIsNotNull(list, "url_prefix");
        Intrinsics.checkParameterIsNotNull(list2, "bind_effects");
        Intrinsics.checkParameterIsNotNull(list3, "collection");
        Intrinsics.checkParameterIsNotNull(list4, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.url_prefix = list;
        this.bind_effects = list2;
        this.collection = list3;
        this.status_code = i;
        this.message = str;
        this.data = list4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ EffectListResponse(java.util.List r5, java.util.List r6, java.util.List r7, int r8, java.lang.String r9, java.util.List r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x000b
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r5 = (java.util.List) r5
        L_0x000b:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x0016
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r6 = (java.util.List) r6
        L_0x0016:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0023
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = r6
            java.util.List r7 = (java.util.List) r7
        L_0x0023:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L_0x002b
            r8 = 0
            r1 = 0
            goto L_0x002c
        L_0x002b:
            r1 = r8
        L_0x002c:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0034
            r6 = 0
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9
        L_0x0034:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0041
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r10 = r6
            java.util.List r10 = (java.util.List) r10
        L_0x0041:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.net.EffectListResponse.<init>(java.util.List, java.util.List, java.util.List, int, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
