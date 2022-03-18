package com.ss.android.ugc.effectmanager.effect.model;

import com.google.firebase.messaging.Constants;
import com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002)*B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u001eH\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001eH\u0016J\u0016\u0010'\u001a\u00020(2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020%0\u001eH\u0016R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000f8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000f8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00188V@VX\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR0\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001e8V@VX\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006+"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/FetchHotEffectResponse;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/FetchHotEffectResponseTemplate;", "Ljava/io/Serializable;", "kFetchHotModel", "Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse;", "(Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse;)V", "value", "Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse$Data;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getData", "()Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse$Data;", "setData", "(Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse$Data;)V", "getKFetchHotModel", "()Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse;", "", "message", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "recId", "getRecId", "setRecId", "", "status_code", "getStatus_code", "()I", "setStatus_code", "(I)V", "", "urlPrefix", "getUrlPrefix", "()Ljava/util/List;", "setUrlPrefix", "(Ljava/util/List;)V", "getCollection", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "getEffects", "setEffects", "", "Data", "Extra", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class FetchHotEffectResponse extends FetchHotEffectResponseTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel;

    public FetchHotEffectResponse() {
        this(null, 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u00138V@VX\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R0\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00130\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/FetchHotEffectResponse$Data;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/FetchHotEffectResponseTemplate$DataTemplate;", "Ljava/io/Serializable;", "kData", "Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse$Data;", "(Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse$Data;)V", "value", "", "Lcom/ss/ugc/effectplatform/model/Effect;", "collection", "getCollection", "()Ljava/util/List;", "setCollection", "(Ljava/util/List;)V", "effects", "getEffects", "setEffects", "getKData", "()Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse$Data;", "", "recId", "getRecId", "()Ljava/lang/String;", "setRecId", "(Ljava/lang/String;)V", "url_prefix", "getUrl_prefix", "setUrl_prefix", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class Data extends FetchHotEffectResponseTemplate.DataTemplate implements Serializable {
        private final transient FetchHotEffectResponse.Data kData;

        public Data() {
            this(null, 1, null);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate.DataTemplate
        public FetchHotEffectResponse.Data getKData() {
            return this.kData;
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public List<Effect> getCollection() {
            List<Effect> collection;
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 == null || (collection = kData2.getCollection()) == null) {
                return super.getCollection();
            }
            return collection;
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public List<Effect> getEffects() {
            List<Effect> effects;
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 == null || (effects = kData2.getEffects()) == null) {
                return super.getEffects();
            }
            return effects;
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public String getRecId() {
            String recId;
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 == null || (recId = kData2.getRecId()) == null) {
                return super.getRecId();
            }
            return recId;
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public List<String> getUrl_prefix() {
            List<String> url_prefix;
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 == null || (url_prefix = kData2.getUrl_prefix()) == null) {
                return super.getUrl_prefix();
            }
            return url_prefix;
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public void setRecId(String str) {
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 != null) {
                kData2.setRecId(str);
            }
            super.setRecId(str);
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public void setCollection(List<? extends Effect> list) {
            Intrinsics.checkParameterIsNotNull(list, "value");
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 != null) {
                kData2.setCollection(list);
            }
            super.setCollection(list);
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public void setEffects(List<? extends Effect> list) {
            Intrinsics.checkParameterIsNotNull(list, "value");
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 != null) {
                kData2.setEffects(list);
            }
            super.setEffects(list);
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public void setUrl_prefix(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "value");
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 != null) {
                kData2.setUrl_prefix(list);
            }
            super.setUrl_prefix(list);
        }

        public Data(FetchHotEffectResponse.Data data) {
            super(data);
            this.kData = data;
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 != null) {
                List<Effect> collection = kData2.getCollection();
                if (collection != null) {
                    super.setCollection(collection);
                }
                List<Effect> effects = kData2.getEffects();
                if (effects != null) {
                    super.setEffects(effects);
                }
                String recId = kData2.getRecId();
                if (recId != null) {
                    super.setRecId(recId);
                }
                List<String> url_prefix = kData2.getUrl_prefix();
                if (url_prefix != null) {
                    super.setUrl_prefix(url_prefix);
                }
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Data(FetchHotEffectResponse.Data data, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : data);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/FetchHotEffectResponse$Extra;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/FetchHotEffectResponseTemplate$ExtraTemplate;", "Ljava/io/Serializable;", "kData", "Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse$Extra;", "(Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse$Extra;)V", "getKData", "()Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse$Extra;", "value", "", "rec_id", "getRec_id", "()Ljava/lang/String;", "setRec_id", "(Ljava/lang/String;)V", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class Extra extends FetchHotEffectResponseTemplate.ExtraTemplate implements Serializable {
        private final transient FetchHotEffectResponse.Extra kData;

        public Extra() {
            this(null, 1, null);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate.ExtraTemplate
        public FetchHotEffectResponse.Extra getKData() {
            return this.kData;
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Extra
        public String getRec_id() {
            String rec_id;
            FetchHotEffectResponse.Extra kData2 = getKData();
            if (kData2 == null || (rec_id = kData2.getRec_id()) == null) {
                return super.getRec_id();
            }
            return rec_id;
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Extra
        public void setRec_id(String str) {
            FetchHotEffectResponse.Extra kData2 = getKData();
            if (kData2 != null) {
                kData2.setRec_id(str);
            }
            super.setRec_id(str);
        }

        public Extra(FetchHotEffectResponse.Extra extra) {
            super(extra);
            String rec_id;
            this.kData = extra;
            FetchHotEffectResponse.Extra kData2 = getKData();
            if (kData2 != null && (rec_id = kData2.getRec_id()) != null) {
                super.setRec_id(rec_id);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Extra(FetchHotEffectResponse.Extra extra, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : extra);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate
    public com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse getKFetchHotModel() {
        return this.kFetchHotModel;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate
    public List<Effect> getCollection() {
        return super.getCollection();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate
    public List<Effect> getEffects() {
        return super.getEffects();
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public int getStatus_code() {
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 != null) {
            return kFetchHotModel2.getStatus_code();
        }
        return super.getStatus_code();
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public FetchHotEffectResponse.Data getData() {
        FetchHotEffectResponse.Data data;
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 == null || (data = kFetchHotModel2.getData()) == null) {
            return super.getData();
        }
        return data;
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public String getMessage() {
        String message;
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 == null || (message = kFetchHotModel2.getMessage()) == null) {
            return super.getMessage();
        }
        return message;
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public String getRecId() {
        String recId;
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 == null || (recId = kFetchHotModel2.getRecId()) == null) {
            return super.getRecId();
        }
        return recId;
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public List<String> getUrlPrefix() {
        List<String> urlPrefix;
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 == null || (urlPrefix = kFetchHotModel2.getUrlPrefix()) == null) {
            return super.getUrlPrefix();
        }
        return urlPrefix;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate
    public void setEffects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setEffects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public void setMessage(String str) {
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 != null) {
            kFetchHotModel2.setMessage(str);
        }
        super.setMessage(str);
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public void setRecId(String str) {
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 != null) {
            kFetchHotModel2.setRecId(str);
        }
        super.setRecId(str);
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public void setStatus_code(int i) {
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 != null) {
            kFetchHotModel2.setStatus_code(i);
        }
        super.setStatus_code(i);
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public void setData(FetchHotEffectResponse.Data data) {
        Intrinsics.checkParameterIsNotNull(data, "value");
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 != null) {
            kFetchHotModel2.setData(data);
        }
        super.setData(data);
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public void setUrlPrefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 != null) {
            kFetchHotModel2.setUrlPrefix(list);
        }
        super.setUrlPrefix(list);
    }

    public FetchHotEffectResponse(com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse fetchHotEffectResponse) {
        super(fetchHotEffectResponse);
        this.kFetchHotModel = fetchHotEffectResponse;
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 != null) {
            List<Effect> collection_list = kFetchHotModel2.getCollection_list();
            if (collection_list != null) {
                super.setCollection_list(collection_list);
            }
            FetchHotEffectResponse.Data data = kFetchHotModel2.getData();
            if (data != null) {
                super.setData(data);
            }
            List<Effect> effect_list = kFetchHotModel2.getEffect_list();
            if (effect_list != null) {
                super.setEffect_list(effect_list);
            }
            super.setFromCache(kFetchHotModel2.isFromCache());
            String message = kFetchHotModel2.getMessage();
            if (message != null) {
                super.setMessage(message);
            }
            String recId = kFetchHotModel2.getRecId();
            if (recId != null) {
                super.setRecId(recId);
            }
            super.setStatus_code(kFetchHotModel2.getStatus_code());
            List<String> urlPrefix = kFetchHotModel2.getUrlPrefix();
            if (urlPrefix != null) {
                super.setUrlPrefix(urlPrefix);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FetchHotEffectResponse(com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse fetchHotEffectResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fetchHotEffectResponse);
    }
}
