package com.ss.android.ugc.effectmanager.effect.model.net;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001$B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007H\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007H\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007H\u0016J\b\u0010 \u001a\u00020\u0010H\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0016J\u0016\u0010\"\u001a\u00020#2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007H\u0016R0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u00108V@VX\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00168V@VX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/net/FetchFavoriteListResponse;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/FetchFavoriteListResponseTemplate;", "Ljava/io/Serializable;", "kFavoriteModel", "Lcom/ss/ugc/effectplatform/model/net/FetchFavoriteListResponse;", "(Lcom/ss/ugc/effectplatform/model/net/FetchFavoriteListResponse;)V", "value", "", "Lcom/ss/ugc/effectplatform/model/net/FetchFavoriteListResponse$Data;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getKFavoriteModel", "()Lcom/ss/ugc/effectplatform/model/net/FetchFavoriteListResponse;", "", "message", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "", "status_code", "getStatus_code", "()I", "setStatus_code", "(I)V", "getBindEffects", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "getCollectEffects", "getEffects", "getType", "getUrlPrefix", "setEffects", "", "Data", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class FetchFavoriteListResponse extends FetchFavoriteListResponseTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel;

    public FetchFavoriteListResponse() {
        this(null, 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00168V@VX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR0\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00160\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/net/FetchFavoriteListResponse$Data;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/FetchFavoriteListResponseTemplate$DataTemplate;", "Ljava/io/Serializable;", "kData", "Lcom/ss/ugc/effectplatform/model/net/FetchFavoriteListResponse$Data;", "(Lcom/ss/ugc/effectplatform/model/net/FetchFavoriteListResponse$Data;)V", "value", "", "Lcom/ss/ugc/effectplatform/model/Effect;", "bind_effects", "getBind_effects", "()Ljava/util/List;", "setBind_effects", "(Ljava/util/List;)V", "collection", "getCollection", "setCollection", "effects", "getEffects", "setEffects", "getKData", "()Lcom/ss/ugc/effectplatform/model/net/FetchFavoriteListResponse$Data;", "", ShareHitPoint.f121869d, "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "url_prefix", "getUrl_prefix", "setUrl_prefix", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class Data extends FetchFavoriteListResponseTemplate.DataTemplate implements Serializable {
        private final transient FetchFavoriteListResponse.Data kData;

        public Data() {
            this(null, 1, null);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate.DataTemplate
        public FetchFavoriteListResponse.Data getKData() {
            return this.kData;
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public List<Effect> getBind_effects() {
            List<Effect> bind_effects;
            FetchFavoriteListResponse.Data kData2 = getKData();
            if (kData2 == null || (bind_effects = kData2.getBind_effects()) == null) {
                return super.getBind_effects();
            }
            return bind_effects;
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public List<Effect> getCollection() {
            List<Effect> collection;
            FetchFavoriteListResponse.Data kData2 = getKData();
            if (kData2 == null || (collection = kData2.getCollection()) == null) {
                return super.getCollection();
            }
            return collection;
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public List<Effect> getEffects() {
            List<Effect> effects;
            FetchFavoriteListResponse.Data kData2 = getKData();
            if (kData2 == null || (effects = kData2.getEffects()) == null) {
                return super.getEffects();
            }
            return effects;
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public String getType() {
            String type;
            FetchFavoriteListResponse.Data kData2 = getKData();
            if (kData2 == null || (type = kData2.getType()) == null) {
                return super.getType();
            }
            return type;
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public List<String> getUrl_prefix() {
            List<String> url_prefix;
            FetchFavoriteListResponse.Data kData2 = getKData();
            if (kData2 == null || (url_prefix = kData2.getUrl_prefix()) == null) {
                return super.getUrl_prefix();
            }
            return url_prefix;
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public void setBind_effects(List<? extends Effect> list) {
            Intrinsics.checkParameterIsNotNull(list, "value");
            FetchFavoriteListResponse.Data kData2 = getKData();
            if (kData2 != null) {
                kData2.setBind_effects(list);
            }
            super.setBind_effects(list);
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public void setCollection(List<? extends Effect> list) {
            Intrinsics.checkParameterIsNotNull(list, "value");
            FetchFavoriteListResponse.Data kData2 = getKData();
            if (kData2 != null) {
                kData2.setCollection(list);
            }
            super.setCollection(list);
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public void setEffects(List<? extends Effect> list) {
            Intrinsics.checkParameterIsNotNull(list, "value");
            FetchFavoriteListResponse.Data kData2 = getKData();
            if (kData2 != null) {
                kData2.setEffects(list);
            }
            super.setEffects(list);
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public void setType(String str) {
            Intrinsics.checkParameterIsNotNull(str, "value");
            FetchFavoriteListResponse.Data kData2 = getKData();
            if (kData2 != null) {
                kData2.setType(str);
            }
            super.setType(str);
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public void setUrl_prefix(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "value");
            FetchFavoriteListResponse.Data kData2 = getKData();
            if (kData2 != null) {
                kData2.setUrl_prefix(list);
            }
            super.setUrl_prefix(list);
        }

        public Data(FetchFavoriteListResponse.Data data) {
            super(data);
            this.kData = data;
            FetchFavoriteListResponse.Data kData2 = getKData();
            if (kData2 != null) {
                List<Effect> bind_effects = kData2.getBind_effects();
                if (bind_effects != null) {
                    super.setBind_effects(bind_effects);
                }
                List<Effect> collection = kData2.getCollection();
                if (collection != null) {
                    super.setCollection(collection);
                }
                List<Effect> effects = kData2.getEffects();
                if (effects != null) {
                    super.setEffects(effects);
                }
                String type = kData2.getType();
                if (type != null) {
                    super.setType(type);
                }
                List<String> url_prefix = kData2.getUrl_prefix();
                if (url_prefix != null) {
                    super.setUrl_prefix(url_prefix);
                }
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Data(FetchFavoriteListResponse.Data data, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : data);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate
    public com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse getKFavoriteModel() {
        return this.kFavoriteModel;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate
    public List<com.ss.android.ugc.effectmanager.effect.model.Effect> getBindEffects() {
        return super.getBindEffects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate
    public List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCollectEffects() {
        return super.getCollectEffects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate
    public List<com.ss.android.ugc.effectmanager.effect.model.Effect> getEffects() {
        return super.getEffects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate
    public String getType() {
        return super.getType();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate
    public List<String> getUrlPrefix() {
        return super.getUrlPrefix();
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse
    public int getStatus_code() {
        com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel2 = getKFavoriteModel();
        if (kFavoriteModel2 != null) {
            return kFavoriteModel2.getStatus_code();
        }
        return super.getStatus_code();
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse
    public List<FetchFavoriteListResponse.Data> getData() {
        List<FetchFavoriteListResponse.Data> data;
        com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel2 = getKFavoriteModel();
        if (kFavoriteModel2 == null || (data = kFavoriteModel2.getData()) == null) {
            return super.getData();
        }
        return data;
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse
    public String getMessage() {
        String message;
        com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel2 = getKFavoriteModel();
        if (kFavoriteModel2 == null || (message = kFavoriteModel2.getMessage()) == null) {
            return super.getMessage();
        }
        return message;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate
    public void setEffects(List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setEffects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse
    public void setMessage(String str) {
        com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel2 = getKFavoriteModel();
        if (kFavoriteModel2 != null) {
            kFavoriteModel2.setMessage(str);
        }
        super.setMessage(str);
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse
    public void setStatus_code(int i) {
        com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel2 = getKFavoriteModel();
        if (kFavoriteModel2 != null) {
            kFavoriteModel2.setStatus_code(i);
        }
        super.setStatus_code(i);
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse
    public void setData(List<? extends FetchFavoriteListResponse.Data> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel2 = getKFavoriteModel();
        if (kFavoriteModel2 != null) {
            kFavoriteModel2.setData(list);
        }
        super.setData(list);
    }

    public FetchFavoriteListResponse(com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse fetchFavoriteListResponse) {
        super(fetchFavoriteListResponse);
        this.kFavoriteModel = fetchFavoriteListResponse;
        com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel2 = getKFavoriteModel();
        if (kFavoriteModel2 != null) {
            List<Effect> collection_effects = kFavoriteModel2.getCollection_effects();
            if (collection_effects != null) {
                super.setCollection_effects(collection_effects);
            }
            List<FetchFavoriteListResponse.Data> data = kFavoriteModel2.getData();
            if (data != null) {
                super.setData(data);
            }
            List<Effect> effect_list = kFavoriteModel2.getEffect_list();
            if (effect_list != null) {
                super.setEffect_list(effect_list);
            }
            String message = kFavoriteModel2.getMessage();
            if (message != null) {
                super.setMessage(message);
            }
            super.setStatus_code(kFavoriteModel2.getStatus_code());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FetchFavoriteListResponse(com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse fetchFavoriteListResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fetchFavoriteListResponse);
    }
}
