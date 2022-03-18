package com.ss.ugc.effectplatform.model.net;

import com.google.firebase.messaging.Constants;
import com.ss.ugc.effectplatform.model.CategoryEffectModel;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.NetResponseChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002/0B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010+\u001a\u00020\u0019H\u0016J\n\u0010,\u001a\u0004\u0018\u00010\u0000H\u0016J\n\u0010-\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010.\u001a\u00020\u0007H\u0016R0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F@FX\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R0\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F@FX\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010!\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00058V@VX\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R0\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n8V@VX\u000e¢\u0006\f\u001a\u0004\b)\u0010\u000e\"\u0004\b*\u0010\u0010¨\u00061"}, d2 = {"Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse;", "Lcom/ss/ugc/effectplatform/model/NetResponseChecker;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse$Data;", "message", "", "status_code", "", "(Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse$Data;Ljava/lang/String;I)V", "value", "", "Lcom/ss/ugc/effectplatform/model/Effect;", "collection_list", "getCollection_list", "()Ljava/util/List;", "setCollection_list", "(Ljava/util/List;)V", "getData", "()Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse$Data;", "setData", "(Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse$Data;)V", "effect_list", "getEffect_list", "setEffect_list", "isFromCache", "", "()Z", "setFromCache", "(Z)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "recId", "getRecId", "setRecId", "getStatus_code", "()I", "setStatus_code", "(I)V", "urlPrefix", "getUrlPrefix", "setUrlPrefix", "checkValue", "getResponseData", "getResponseMessage", "getStatusCode", "Data", "Extra", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
public class FetchHotEffectResponse extends NetResponseChecker<FetchHotEffectResponse> {
    private Data data;
    private boolean isFromCache;
    private String message;
    private int status_code;

    public FetchHotEffectResponse() {
        this(null, null, 0, 7, null);
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public FetchHotEffectResponse getResponseData() {
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0017\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R(\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse$Data;", "", "category_effects", "Lcom/ss/ugc/effectplatform/model/CategoryEffectModel;", "extra", "Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse$Extra;", "url_prefix", "", "", "(Lcom/ss/ugc/effectplatform/model/CategoryEffectModel;Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse$Extra;Ljava/util/List;)V", "value", "Lcom/ss/ugc/effectplatform/model/Effect;", "collection", "getCollection", "()Ljava/util/List;", "setCollection", "(Ljava/util/List;)V", "effects", "getEffects", "setEffects", "recId", "getRecId", "()Ljava/lang/String;", "setRecId", "(Ljava/lang/String;)V", "getUrl_prefix", "setUrl_prefix", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static class Data {
        private final CategoryEffectModel category_effects;
        private final Extra extra;
        private List<String> url_prefix;

        public Data() {
            this(null, null, null, 7, null);
        }

        public List<String> getUrl_prefix() {
            return this.url_prefix;
        }

        public List<Effect> getCollection() {
            return this.category_effects.getCollection();
        }

        public List<Effect> getEffects() {
            return this.category_effects.getCategory_effects();
        }

        public String getRecId() {
            Extra extra2 = this.extra;
            if (extra2 != null) {
                return extra2.getRec_id();
            }
            return null;
        }

        public void setRecId(String str) {
            Extra extra2 = this.extra;
            if (extra2 != null) {
                extra2.setRec_id(str);
            }
        }

        public void setUrl_prefix(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "<set-?>");
            this.url_prefix = list;
        }

        public void setCollection(List<? extends Effect> list) {
            Intrinsics.checkParameterIsNotNull(list, "value");
            this.category_effects.setCollection(list);
        }

        public void setEffects(List<? extends Effect> list) {
            Intrinsics.checkParameterIsNotNull(list, "value");
            this.category_effects.setCategory_effects(list);
        }

        public Data(CategoryEffectModel categoryEffectModel, Extra extra2, List<String> list) {
            Intrinsics.checkParameterIsNotNull(categoryEffectModel, "category_effects");
            Intrinsics.checkParameterIsNotNull(list, "url_prefix");
            this.category_effects = categoryEffectModel;
            this.extra = extra2;
            this.url_prefix = list;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Data(com.ss.ugc.effectplatform.model.CategoryEffectModel r13, com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Extra r14, java.util.List r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
            /*
                r12 = this;
                r0 = r16 & 1
                if (r0 == 0) goto L_0x0016
                com.ss.ugc.effectplatform.model.CategoryEffectModel r0 = new com.ss.ugc.effectplatform.model.CategoryEffectModel
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 255(0xff, float:3.57E-43)
                r11 = 0
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                goto L_0x0017
            L_0x0016:
                r0 = r13
            L_0x0017:
                r1 = r16 & 2
                if (r1 == 0) goto L_0x0023
                com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse$Extra r1 = new com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse$Extra
                r2 = 0
                r3 = 1
                r1.<init>(r2, r3, r2)
                goto L_0x0024
            L_0x0023:
                r1 = r14
            L_0x0024:
                r2 = r16 & 4
                if (r2 == 0) goto L_0x0031
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.List r2 = (java.util.List) r2
                r3 = r12
                goto L_0x0033
            L_0x0031:
                r3 = r12
                r2 = r15
            L_0x0033:
                r12.<init>(r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data.<init>(com.ss.ugc.effectplatform.model.CategoryEffectModel, com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse$Extra, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse$Extra;", "", "rec_id", "", "(Ljava/lang/String;)V", "getRec_id", "()Ljava/lang/String;", "setRec_id", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static class Extra {
        private String rec_id;

        public Extra() {
            this(null, 1, null);
        }

        public String getRec_id() {
            return this.rec_id;
        }

        public void setRec_id(String str) {
            this.rec_id = str;
        }

        public Extra(String str) {
            this.rec_id = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Extra(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    public Data getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public final boolean isFromCache() {
        return this.isFromCache;
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public String getResponseMessage() {
        return getMessage();
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public int getStatusCode() {
        return getStatus_code();
    }

    public final List<Effect> getCollection_list() {
        return getData().getCollection();
    }

    public final List<Effect> getEffect_list() {
        return getData().getEffects();
    }

    public String getRecId() {
        Data data2 = getData();
        if (data2 != null) {
            return data2.getRecId();
        }
        return null;
    }

    public List<String> getUrlPrefix() {
        return getData().getUrl_prefix();
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public boolean checkValue() {
        List<Effect> effect_list = getEffect_list();
        if (effect_list == null || !(!effect_list.isEmpty())) {
            return false;
        }
        return true;
    }

    public final void setFromCache(boolean z) {
        this.isFromCache = z;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setData(Data data2) {
        Intrinsics.checkParameterIsNotNull(data2, "<set-?>");
        this.data = data2;
    }

    public final void setCollection_list(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        getData().setCollection(list);
    }

    public final void setEffect_list(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        getData().setEffects(list);
    }

    public void setRecId(String str) {
        Data data2 = getData();
        if (data2 != null) {
            data2.setRecId(str);
        }
    }

    public void setUrlPrefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        Data data2 = getData();
        if (data2 != null) {
            data2.setUrl_prefix(list);
        }
    }

    public FetchHotEffectResponse(Data data2, String str, int i) {
        Intrinsics.checkParameterIsNotNull(data2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.data = data2;
        this.message = str;
        this.status_code = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FetchHotEffectResponse(Data data2, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new Data(null, null, null, 7, null) : data2, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
