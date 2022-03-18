package com.ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate;
import com.ss.ugc.effectplatform.model.ResourceListModel;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u00022\u00020\u0003:\u000201B\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8V@VX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR(\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\rR0\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198V@VX\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR0\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00192\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020 0\u00198V@VX\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR0\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u00192\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00198V@VX\u000e¢\u0006\f\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR0\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u00192\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00198V@VX\u000e¢\u0006\f\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001f¨\u00062"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/ResourceListModel;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/ResourceListModelTemplate;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "kResourceModel", "Lcom/ss/ugc/effectplatform/model/ResourceListModel;", "(Lcom/ss/ugc/effectplatform/model/ResourceListModel;)V", "value", "", "iconUri", "getIconUri", "()Ljava/lang/String;", "setIconUri", "(Ljava/lang/String;)V", "icon_uri", "getIcon_uri", "setIcon_uri", "getKResourceModel", "()Lcom/ss/ugc/effectplatform/model/ResourceListModel;", "param", "getParam", "setParam", "params", "getParams", "setParams", "", "Lcom/ss/android/ugc/effectmanager/effect/model/ResourceListModel$ResourceListBean;", "resourceList", "getResourceList", "()Ljava/util/List;", "setResourceList", "(Ljava/util/List;)V", "Lcom/ss/ugc/effectplatform/model/ResourceListModel$ResourceListBean;", "resource_list", "getResource_list", "setResource_list", "urlPrefix", "getUrlPrefix", "setUrlPrefix", "url_prefix", "getUrl_prefix", "setUrl_prefix", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Companion", "ResourceListBean", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ResourceListModel extends ResourceListModelTemplate implements Parcelable, Serializable {
    public static final Parcelable.Creator<ResourceListModel> CREATOR = new C60623b();
    public static final Companion Companion = new Companion(null);
    private final transient com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001eB\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8V@VX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR(\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR(\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/ResourceListModel$ResourceListBean;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/ResourceListModelTemplate$ResourceListBeanTemplate;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "kResourceBean", "Lcom/ss/ugc/effectplatform/model/ResourceListModel$ResourceListBean;", "(Lcom/ss/ugc/effectplatform/model/ResourceListModel$ResourceListBean;)V", "getKResourceBean", "()Lcom/ss/ugc/effectplatform/model/ResourceListModel$ResourceListBean;", "value", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "resourceUrl", "getResourceUrl", "setResourceUrl", "resource_uri", "getResource_uri", "setResource_uri", "getValue", "setValue", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Companion", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class ResourceListBean extends ResourceListModelTemplate.ResourceListBeanTemplate implements Parcelable, Serializable {
        public static final Parcelable.Creator<ResourceListBean> CREATOR = new C60622b();
        public static final Companion Companion = new Companion(null);
        private final transient ResourceListModel.ResourceListBean kResourceBean;

        public ResourceListBean() {
            this(null, 1, null);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/ResourceListModel$ResourceListBean$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/effectmanager/effect/model/ResourceListModel$ResourceListBean;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.effectmanager.effect.model.ResourceListModel$ResourceListBean$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/effectmanager/effect/model/ResourceListModel$ResourceListBean$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/effectmanager/effect/model/ResourceListModel$ResourceListBean;", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/ugc/effectmanager/effect/model/ResourceListModel$ResourceListBean;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.effectmanager.effect.model.ResourceListModel$ResourceListBean$b */
        public static final class C60622b implements Parcelable.Creator<ResourceListBean> {
            C60622b() {
            }

            /* renamed from: a */
            public ResourceListBean[] newArray(int i) {
                return new ResourceListBean[i];
            }

            /* renamed from: a */
            public ResourceListBean createFromParcel(Parcel parcel) {
                Object obj;
                Intrinsics.checkParameterIsNotNull(parcel, "parcel");
                ResourceListModel.ResourceListBean resourceListBean = null;
                try {
                    Object obj2 = ResourceListModel.ResourceListBean.class.getField("CREATOR").get(null);
                    if (!(obj2 instanceof Parcelable.Creator)) {
                        obj2 = null;
                    }
                    Parcelable.Creator creator = (Parcelable.Creator) obj2;
                    if (creator != null) {
                        obj = creator.createFromParcel(parcel);
                    } else {
                        obj = null;
                    }
                    if (!(obj instanceof ResourceListModel.ResourceListBean)) {
                        obj = null;
                    }
                    resourceListBean = (ResourceListModel.ResourceListBean) obj;
                } catch (Exception e) {
                    EPLog.m235177a("createFromParcel", "get creator failed!", e);
                }
                return new ResourceListBean(resourceListBean);
            }
        }

        @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate.ResourceListBeanTemplate
        public ResourceListModel.ResourceListBean getKResourceBean() {
            return this.kResourceBean;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate.ResourceListBeanTemplate
        public String getResourceUrl() {
            return super.getResourceUrl();
        }

        @Override // com.ss.ugc.effectplatform.model.ResourceListModel.ResourceListBean
        public String getName() {
            String name;
            ResourceListModel.ResourceListBean kResourceBean2 = getKResourceBean();
            if (kResourceBean2 == null || (name = kResourceBean2.getName()) == null) {
                return super.getName();
            }
            return name;
        }

        @Override // com.ss.ugc.effectplatform.model.ResourceListModel.ResourceListBean
        public String getResource_uri() {
            String resource_uri;
            ResourceListModel.ResourceListBean kResourceBean2 = getKResourceBean();
            if (kResourceBean2 == null || (resource_uri = kResourceBean2.getResource_uri()) == null) {
                return super.getResource_uri();
            }
            return resource_uri;
        }

        @Override // com.ss.ugc.effectplatform.model.ResourceListModel.ResourceListBean
        public String getValue() {
            String value;
            ResourceListModel.ResourceListBean kResourceBean2 = getKResourceBean();
            if (kResourceBean2 == null || (value = kResourceBean2.getValue()) == null) {
                return super.getValue();
            }
            return value;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate.ResourceListBeanTemplate
        public void setResourceUrl(String str) {
            super.setResourceUrl(str);
        }

        @Override // com.ss.ugc.effectplatform.model.ResourceListModel.ResourceListBean
        public void setName(String str) {
            ResourceListModel.ResourceListBean kResourceBean2 = getKResourceBean();
            if (kResourceBean2 != null) {
                kResourceBean2.setName(str);
            }
            super.setName(str);
        }

        @Override // com.ss.ugc.effectplatform.model.ResourceListModel.ResourceListBean
        public void setResource_uri(String str) {
            ResourceListModel.ResourceListBean kResourceBean2 = getKResourceBean();
            if (kResourceBean2 != null) {
                kResourceBean2.setResource_uri(str);
            }
            super.setResource_uri(str);
        }

        @Override // com.ss.ugc.effectplatform.model.ResourceListModel.ResourceListBean
        public void setValue(String str) {
            ResourceListModel.ResourceListBean kResourceBean2 = getKResourceBean();
            if (kResourceBean2 != null) {
                kResourceBean2.setValue(str);
            }
            super.setValue(str);
        }

        public ResourceListBean(ResourceListModel.ResourceListBean resourceListBean) {
            super(resourceListBean);
            this.kResourceBean = resourceListBean;
            ResourceListModel.ResourceListBean kResourceBean2 = getKResourceBean();
            if (kResourceBean2 != null) {
                String name = kResourceBean2.getName();
                if (name != null) {
                    super.setName(name);
                }
                String resource_uri = kResourceBean2.getResource_uri();
                if (resource_uri != null) {
                    super.setResource_uri(resource_uri);
                }
                String value = kResourceBean2.getValue();
                if (value != null) {
                    super.setValue(value);
                }
            }
        }

        @Override // com.ss.ugc.effectplatform.model.ResourceListModel.ResourceListBean
        public void writeToParcel(Parcel parcel, int i) {
            Intrinsics.checkParameterIsNotNull(parcel, "dest");
            if (getKResourceBean() != null) {
                ResourceListModel.ResourceListBean kResourceBean2 = getKResourceBean();
                if (kResourceBean2 != null) {
                    kResourceBean2.writeToParcel(parcel, i);
                    return;
                }
                return;
            }
            super.writeToParcel(parcel, i);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ResourceListBean(ResourceListModel.ResourceListBean resourceListBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : resourceListBean);
        }
    }

    public ResourceListModel() {
        this(null, 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/ResourceListModel$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/effectmanager/effect/model/ResourceListModel;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.ResourceListModel$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/effectmanager/effect/model/ResourceListModel$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/effectmanager/effect/model/ResourceListModel;", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/ugc/effectmanager/effect/model/ResourceListModel;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.ResourceListModel$b */
    public static final class C60623b implements Parcelable.Creator<ResourceListModel> {
        C60623b() {
        }

        /* renamed from: a */
        public ResourceListModel[] newArray(int i) {
            return new ResourceListModel[i];
        }

        /* renamed from: a */
        public ResourceListModel createFromParcel(Parcel parcel) {
            Object obj;
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            com.ss.ugc.effectplatform.model.ResourceListModel resourceListModel = null;
            try {
                Object obj2 = com.ss.ugc.effectplatform.model.ResourceListModel.class.getField("CREATOR").get(null);
                if (!(obj2 instanceof Parcelable.Creator)) {
                    obj2 = null;
                }
                Parcelable.Creator creator = (Parcelable.Creator) obj2;
                if (creator != null) {
                    obj = creator.createFromParcel(parcel);
                } else {
                    obj = null;
                }
                if (!(obj instanceof com.ss.ugc.effectplatform.model.ResourceListModel)) {
                    obj = null;
                }
                resourceListModel = (com.ss.ugc.effectplatform.model.ResourceListModel) obj;
            } catch (Exception e) {
                EPLog.m235177a("createFromParcel", "get creator failed!", e);
            }
            return new ResourceListModel(resourceListModel);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public com.ss.ugc.effectplatform.model.ResourceListModel getKResourceModel() {
        return this.kResourceModel;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public String getIconUri() {
        return super.getIconUri();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public String getParam() {
        return super.getParam();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public List<ResourceListBean> getResourceList() {
        return super.getResourceList();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public List<String> getUrlPrefix() {
        return super.getUrlPrefix();
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public String getIcon_uri() {
        String icon_uri;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 == null || (icon_uri = kResourceModel2.getIcon_uri()) == null) {
            return super.getIcon_uri();
        }
        return icon_uri;
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public String getParams() {
        String params;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 == null || (params = kResourceModel2.getParams()) == null) {
            return super.getParams();
        }
        return params;
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public List<ResourceListModel.ResourceListBean> getResource_list() {
        List<ResourceListModel.ResourceListBean> resource_list;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 == null || (resource_list = kResourceModel2.getResource_list()) == null) {
            return super.getResource_list();
        }
        return resource_list;
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public List<String> getUrl_prefix() {
        List<String> url_prefix;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 == null || (url_prefix = kResourceModel2.getUrl_prefix()) == null) {
            return super.getUrl_prefix();
        }
        return url_prefix;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public void setIconUri(String str) {
        super.setIconUri(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public void setParam(String str) {
        super.setParam(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public void setIcon_uri(String str) {
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 != null) {
            kResourceModel2.setIcon_uri(str);
        }
        super.setIcon_uri(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public void setParams(String str) {
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 != null) {
            kResourceModel2.setParams(str);
        }
        super.setParams(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public void setResourceList(List<ResourceListBean> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setResourceList(list);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public void setUrlPrefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setUrlPrefix(list);
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public void setResource_list(List<? extends ResourceListModel.ResourceListBean> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 != null) {
            kResourceModel2.setResource_list(list);
        }
        super.setResource_list(list);
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public void setUrl_prefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 != null) {
            kResourceModel2.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    public ResourceListModel(com.ss.ugc.effectplatform.model.ResourceListModel resourceListModel) {
        super(resourceListModel);
        this.kResourceModel = resourceListModel;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 != null) {
            String icon_uri = kResourceModel2.getIcon_uri();
            if (icon_uri != null) {
                super.setIcon_uri(icon_uri);
            }
            String params = kResourceModel2.getParams();
            if (params != null) {
                super.setParams(params);
            }
            List<ResourceListModel.ResourceListBean> resource_list = kResourceModel2.getResource_list();
            if (resource_list != null) {
                super.setResource_list(resource_list);
            }
            List<String> url_prefix = kResourceModel2.getUrl_prefix();
            if (url_prefix != null) {
                super.setUrl_prefix(url_prefix);
            }
        }
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "dest");
        if (getKResourceModel() != null) {
            com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
            if (kResourceModel2 != null) {
                kResourceModel2.writeToParcel(parcel, i);
                return;
            }
            return;
        }
        super.writeToParcel(parcel, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResourceListModel(com.ss.ugc.effectplatform.model.ResourceListModel resourceListModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : resourceListModel);
    }
}
