package com.ss.ugc.effectplatform.model.algorithm;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B1\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/ss/ugc/effectplatform/model/algorithm/ExtendedUrlModel;", "", "url_list", "", "", "uri", "zip_url_list", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getUri", "()Ljava/lang/String;", "setUri", "(Ljava/lang/String;)V", "getUrl_list", "()Ljava/util/List;", "setUrl_list", "(Ljava/util/List;)V", "getZip_url_list", "setZip_url_list", "getUrl", ShareHitPoint.f121869d, "Lcom/ss/ugc/effectplatform/model/algorithm/FetchModelType;", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
public class ExtendedUrlModel {
    private String uri;
    private List<String> url_list;
    private List<String> zip_url_list;

    public ExtendedUrlModel() {
        this(null, null, null, 7, null);
    }

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrl_list() {
        return this.url_list;
    }

    public List<String> getZip_url_list() {
        return this.zip_url_list;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrl_list(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.url_list = list;
    }

    public void setZip_url_list(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.zip_url_list = list;
    }

    public final List<String> getUrl(FetchModelType fetchModelType) {
        Intrinsics.checkParameterIsNotNull(fetchModelType, ShareHitPoint.f121869d);
        int i = C65517a.f164938a[fetchModelType.ordinal()];
        if (i == 1) {
            return getZip_url_list();
        }
        if (i == 2) {
            return getUrl_list();
        }
        throw new NoWhenBranchMatchedException();
    }

    public ExtendedUrlModel(List<String> list, String str, List<String> list2) {
        Intrinsics.checkParameterIsNotNull(list, "url_list");
        Intrinsics.checkParameterIsNotNull(list2, "zip_url_list");
        this.url_list = list;
        this.uri = str;
        this.zip_url_list = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExtendedUrlModel(List list, String str, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? new ArrayList() : list2);
    }
}
