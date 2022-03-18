package com.ss.android.ugc.effectmanager.model;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R0\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R0\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R0\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8V@VX\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/effectmanager/model/ExtendedUrlModel;", "Lcom/ss/android/ugc/effectmanager/model/ExtendedUrlModelTemplate;", "Ljava/io/Serializable;", "kUrlModel", "Lcom/ss/ugc/effectplatform/model/algorithm/ExtendedUrlModel;", "(Lcom/ss/ugc/effectplatform/model/algorithm/ExtendedUrlModel;)V", "getKUrlModel", "()Lcom/ss/ugc/effectplatform/model/algorithm/ExtendedUrlModel;", "value", "", "uri", "getUri", "()Ljava/lang/String;", "setUri", "(Ljava/lang/String;)V", "", "urlList", "getUrlList", "()Ljava/util/List;", "setUrlList", "(Ljava/util/List;)V", "url_list", "getUrl_list", "setUrl_list", "zipUrlList", "getZipUrlList", "setZipUrlList", "zip_url_list", "getZip_url_list", "setZip_url_list", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ExtendedUrlModel extends ExtendedUrlModelTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel;

    public ExtendedUrlModel() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.model.ExtendedUrlModelTemplate
    public com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel getKUrlModel() {
        return this.kUrlModel;
    }

    @Override // com.ss.android.ugc.effectmanager.model.ExtendedUrlModelTemplate
    public List<String> getUrlList() {
        return super.getUrlList();
    }

    @Override // com.ss.android.ugc.effectmanager.model.ExtendedUrlModelTemplate
    public List<String> getZipUrlList() {
        return super.getZipUrlList();
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public String getUri() {
        String uri;
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 == null || (uri = kUrlModel2.getUri()) == null) {
            return super.getUri();
        }
        return uri;
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public List<String> getUrl_list() {
        List<String> url_list;
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 == null || (url_list = kUrlModel2.getUrl_list()) == null) {
            return super.getUrl_list();
        }
        return url_list;
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public List<String> getZip_url_list() {
        List<String> zip_url_list;
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 == null || (zip_url_list = kUrlModel2.getZip_url_list()) == null) {
            return super.getZip_url_list();
        }
        return zip_url_list;
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public void setUri(String str) {
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 != null) {
            kUrlModel2.setUri(str);
        }
        super.setUri(str);
    }

    @Override // com.ss.android.ugc.effectmanager.model.ExtendedUrlModelTemplate
    public void setUrlList(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setUrlList(list);
    }

    @Override // com.ss.android.ugc.effectmanager.model.ExtendedUrlModelTemplate
    public void setZipUrlList(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setZipUrlList(list);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public void setUrl_list(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 != null) {
            kUrlModel2.setUrl_list(list);
        }
        super.setUrl_list(list);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public void setZip_url_list(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 != null) {
            kUrlModel2.setZip_url_list(list);
        }
        super.setZip_url_list(list);
    }

    public ExtendedUrlModel(com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel extendedUrlModel) {
        super(extendedUrlModel);
        this.kUrlModel = extendedUrlModel;
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 != null) {
            String uri = kUrlModel2.getUri();
            if (uri != null) {
                super.setUri(uri);
            }
            List<String> url_list = kUrlModel2.getUrl_list();
            if (url_list != null) {
                super.setUrl_list(url_list);
            }
            List<String> zip_url_list = kUrlModel2.getZip_url_list();
            if (zip_url_list != null) {
                super.setZip_url_list(zip_url_list);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExtendedUrlModel(com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel extendedUrlModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : extendedUrlModel);
    }
}
