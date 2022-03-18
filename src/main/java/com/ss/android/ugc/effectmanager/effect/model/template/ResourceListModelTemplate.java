package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import com.ss.ugc.effectplatform.model.ResourceListModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001:\u0001\u001aB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003R*\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00058V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR*\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00058V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\nR2\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R2\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u00108V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/template/ResourceListModelTemplate;", "Lcom/ss/ugc/effectplatform/model/ResourceListModel;", "kResourceModel", "(Lcom/ss/ugc/effectplatform/model/ResourceListModel;)V", "value", "", "iconUri", "getIconUri", "()Ljava/lang/String;", "setIconUri", "(Ljava/lang/String;)V", "getKResourceModel", "()Lcom/ss/ugc/effectplatform/model/ResourceListModel;", "param", "getParam", "setParam", "", "Lcom/ss/android/ugc/effectmanager/effect/model/ResourceListModel$ResourceListBean;", "resourceList", "getResourceList", "()Ljava/util/List;", "setResourceList", "(Ljava/util/List;)V", "urlPrefix", "getUrlPrefix", "setUrlPrefix", "ResourceListBeanTemplate", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public class ResourceListModelTemplate extends ResourceListModel {
    private String iconUri;
    private final transient ResourceListModel kResourceModel;
    private String param;
    private List<ResourceListModel.ResourceListBean> resourceList;
    private List<String> urlPrefix;

    public ResourceListModelTemplate() {
        this(null, 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R*\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/template/ResourceListModelTemplate$ResourceListBeanTemplate;", "Lcom/ss/ugc/effectplatform/model/ResourceListModel$ResourceListBean;", "kResourceBean", "(Lcom/ss/ugc/effectplatform/model/ResourceListModel$ResourceListBean;)V", "getKResourceBean", "()Lcom/ss/ugc/effectplatform/model/ResourceListModel$ResourceListBean;", "value", "", "resourceUrl", "getResourceUrl", "()Ljava/lang/String;", "setResourceUrl", "(Ljava/lang/String;)V", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static class ResourceListBeanTemplate extends ResourceListModel.ResourceListBean {
        private final transient ResourceListModel.ResourceListBean kResourceBean;
        private String resourceUrl;

        public ResourceListBeanTemplate() {
            this(null, 1, null);
        }

        public ResourceListModel.ResourceListBean getKResourceBean() {
            return this.kResourceBean;
        }

        public String getResourceUrl() {
            String resource_uri;
            ResourceListModel.ResourceListBean kResourceBean2 = getKResourceBean();
            if (kResourceBean2 == null || (resource_uri = kResourceBean2.getResource_uri()) == null) {
                return super.getResource_uri();
            }
            return resource_uri;
        }

        public ResourceListBeanTemplate(ResourceListModel.ResourceListBean resourceListBean) {
            super(null, null, null, 7, null);
            this.kResourceBean = resourceListBean;
        }

        public void setResourceUrl(String str) {
            this.resourceUrl = str;
            ResourceListModel.ResourceListBean kResourceBean2 = getKResourceBean();
            if (kResourceBean2 != null) {
                kResourceBean2.setResource_uri(str);
            }
            super.setResource_uri(str);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ResourceListBeanTemplate(ResourceListModel.ResourceListBean resourceListBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : resourceListBean);
        }
    }

    public com.ss.ugc.effectplatform.model.ResourceListModel getKResourceModel() {
        return this.kResourceModel;
    }

    public String getIconUri() {
        String icon_uri;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 == null || (icon_uri = kResourceModel2.getIcon_uri()) == null) {
            return super.getIcon_uri();
        }
        return icon_uri;
    }

    public String getParam() {
        String params;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 == null || (params = kResourceModel2.getParams()) == null) {
            return super.getParams();
        }
        return params;
    }

    public List<String> getUrlPrefix() {
        List<String> url_prefix;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 == null || (url_prefix = kResourceModel2.getUrl_prefix()) == null) {
            return super.getUrl_prefix();
        }
        return url_prefix;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.ResourceListModel$ResourceListBean> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate, com.ss.ugc.effectplatform.model.ResourceListModel] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.ResourceListModel.ResourceListBean> getResourceList() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate.getResourceList():java.util.List");
    }

    public void setIconUri(String str) {
        this.iconUri = str;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 != null) {
            kResourceModel2.setIcon_uri(str);
        }
        super.setIcon_uri(str);
    }

    public void setParam(String str) {
        this.param = str;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 != null) {
            kResourceModel2.setParams(str);
        }
        super.setParams(str);
    }

    public ResourceListModelTemplate(com.ss.ugc.effectplatform.model.ResourceListModel resourceListModel) {
        super(null, null, null, null, 15, null);
        this.kResourceModel = resourceListModel;
        this.resourceList = new ArrayList();
        this.urlPrefix = new ArrayList();
    }

    public void setResourceList(List<ResourceListModel.ResourceListBean> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.resourceList = list;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 != null) {
            kResourceModel2.setResource_list(list);
        }
        super.setResource_list(list);
    }

    public void setUrlPrefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.urlPrefix = list;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 != null) {
            kResourceModel2.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResourceListModelTemplate(com.ss.ugc.effectplatform.model.ResourceListModel resourceListModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : resourceListModel);
    }
}
