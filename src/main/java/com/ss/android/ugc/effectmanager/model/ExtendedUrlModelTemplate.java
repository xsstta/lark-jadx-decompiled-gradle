package com.ss.android.ugc.effectmanager.model;

import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R2\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR2\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/effectmanager/model/ExtendedUrlModelTemplate;", "Lcom/ss/ugc/effectplatform/model/algorithm/ExtendedUrlModel;", "Ljava/io/Serializable;", "kUrlModel", "(Lcom/ss/ugc/effectplatform/model/algorithm/ExtendedUrlModel;)V", "getKUrlModel", "()Lcom/ss/ugc/effectplatform/model/algorithm/ExtendedUrlModel;", "value", "", "", "urlList", "getUrlList", "()Ljava/util/List;", "setUrlList", "(Ljava/util/List;)V", "zipUrlList", "getZipUrlList", "setZipUrlList", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public class ExtendedUrlModelTemplate extends ExtendedUrlModel implements Serializable {
    private final transient ExtendedUrlModel kUrlModel;
    private List<String> urlList;
    private List<String> zipUrlList;

    public ExtendedUrlModelTemplate() {
        this(null, 1, null);
    }

    public ExtendedUrlModel getKUrlModel() {
        return this.kUrlModel;
    }

    public List<String> getUrlList() {
        List<String> url_list;
        ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 == null || (url_list = kUrlModel2.getUrl_list()) == null) {
            return super.getUrl_list();
        }
        return url_list;
    }

    public List<String> getZipUrlList() {
        List<String> zip_url_list;
        ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 == null || (zip_url_list = kUrlModel2.getZip_url_list()) == null) {
            return super.getZip_url_list();
        }
        return zip_url_list;
    }

    public ExtendedUrlModelTemplate(ExtendedUrlModel extendedUrlModel) {
        super(null, null, null, 7, null);
        this.kUrlModel = extendedUrlModel;
        this.zipUrlList = new ArrayList();
        this.urlList = new ArrayList();
    }

    public void setUrlList(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.urlList = list;
        ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 != null) {
            kUrlModel2.setUrl_list(list);
        }
        super.setUrl_list(list);
    }

    public void setZipUrlList(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.zipUrlList = list;
        ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 != null) {
            kUrlModel2.setZip_url_list(list);
        }
        super.setZip_url_list(list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExtendedUrlModelTemplate(ExtendedUrlModel extendedUrlModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : extendedUrlModel);
    }
}
