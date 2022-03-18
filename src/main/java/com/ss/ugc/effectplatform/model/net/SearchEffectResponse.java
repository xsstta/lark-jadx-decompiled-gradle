package com.ss.ugc.effectplatform.model.net;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.NetResponseChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\b\u0010(\u001a\u00020\u0003H\u0016J\n\u0010)\u001a\u0004\u0018\u00010\u0000H\u0016J\n\u0010*\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010+\u001a\u00020\u0005H\u0016R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u0002\n\u0000R0\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F@FX\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR0\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F@FX\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0012R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010\u001a¨\u0006,"}, d2 = {"Lcom/ss/ugc/effectplatform/model/net/SearchEffectResponse;", "Lcom/ss/ugc/effectplatform/model/NetResponseChecker;", "has_more", "", "cursor", "", "effects", "", "Lcom/ss/ugc/effectplatform/model/Effect;", "collection", "bind_effects", "status_code", "message", "", "(ZILjava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/String;)V", "getBind_effects", "()Ljava/util/List;", "setBind_effects", "(Ljava/util/List;)V", "value", "collection_list", "getCollection_list", "setCollection_list", "getCursor", "()I", "setCursor", "(I)V", "effect_list", "getEffect_list", "setEffect_list", "getHas_more", "()Z", "setHas_more", "(Z)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getStatus_code", "setStatus_code", "checkValue", "getResponseData", "getResponseMessage", "getStatusCode", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
public class SearchEffectResponse extends NetResponseChecker<SearchEffectResponse> {
    private List<? extends Effect> bind_effects;
    private List<? extends Effect> collection;
    private int cursor;
    private List<? extends Effect> effects;
    private boolean has_more;
    private String message;
    private int status_code;

    public SearchEffectResponse() {
        this(false, 0, null, null, null, 0, null, SmActions.ACTION_ONTHECALL_ENTRY, null);
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public SearchEffectResponse getResponseData() {
        return this;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public List<Effect> getBind_effects() {
        return this.bind_effects;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getCollection_list() {
        return this.collection;
    }

    public int getCursor() {
        return this.cursor;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getEffect_list() {
        return this.effects;
    }

    public boolean getHas_more() {
        return this.has_more;
    }

    public String getMessage() {
        return this.message;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public String getResponseMessage() {
        return getMessage();
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public int getStatusCode() {
        return getStatus_code();
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public boolean checkValue() {
        return !getEffect_list().isEmpty();
    }

    public void setCursor(int i) {
        this.cursor = i;
    }

    public void setHas_more(boolean z) {
        this.has_more = z;
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
        this.effects = list;
    }

    public SearchEffectResponse(boolean z, int i, List<? extends Effect> list, List<? extends Effect> list2, List<? extends Effect> list3, int i2, String str) {
        Intrinsics.checkParameterIsNotNull(list, "effects");
        Intrinsics.checkParameterIsNotNull(list2, "collection");
        Intrinsics.checkParameterIsNotNull(list3, "bind_effects");
        this.has_more = z;
        this.cursor = i;
        this.effects = list;
        this.collection = list2;
        this.bind_effects = list3;
        this.status_code = i2;
        this.message = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SearchEffectResponse(boolean r6, int r7, java.util.List r8, java.util.List r9, java.util.List r10, int r11, java.lang.String r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            r0 = 0
            if (r14 == 0) goto L_0x0007
            r14 = 0
            goto L_0x0008
        L_0x0007:
            r14 = r6
        L_0x0008:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x000e
            r1 = 0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x001b
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r8 = r6
            java.util.List r8 = (java.util.List) r8
        L_0x001b:
            r2 = r8
            r6 = r13 & 8
            if (r6 == 0) goto L_0x0028
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r9 = r6
            java.util.List r9 = (java.util.List) r9
        L_0x0028:
            r3 = r9
            r6 = r13 & 16
            if (r6 == 0) goto L_0x0035
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r10 = r6
            java.util.List r10 = (java.util.List) r10
        L_0x0035:
            r4 = r10
            r6 = r13 & 32
            if (r6 == 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r0 = r11
        L_0x003c:
            r6 = r13 & 64
            if (r6 == 0) goto L_0x0044
            r6 = 0
            r12 = r6
            java.lang.String r12 = (java.lang.String) r12
        L_0x0044:
            r13 = r12
            r6 = r5
            r7 = r14
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.net.SearchEffectResponse.<init>(boolean, int, java.util.List, java.util.List, java.util.List, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
