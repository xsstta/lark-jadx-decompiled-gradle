package com.ss.android.ugc.effectmanager.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0017\u0018\u0000 \u001f2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001fB\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8V@VX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0018\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/effectmanager/common/model/UrlModel;", "Lcom/ss/android/ugc/effectmanager/common/model/UrlModelTemplate;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "urlModel", "Lcom/ss/ugc/effectplatform/model/UrlModel;", "(Lcom/ss/ugc/effectplatform/model/UrlModel;)V", "value", "", "uri", "getUri", "()Ljava/lang/String;", "setUri", "(Ljava/lang/String;)V", "", "urlList", "getUrlList", "()Ljava/util/List;", "setUrlList", "(Ljava/util/List;)V", "getUrlModel", "()Lcom/ss/ugc/effectplatform/model/UrlModel;", "url_list", "getUrl_list", "setUrl_list", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Companion", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public class UrlModel extends UrlModelTemplate implements Parcelable, Serializable {
    public static final Parcelable.Creator<UrlModel> CREATOR = new C60545b();
    public static final Companion Companion = new Companion(null);
    private final transient com.ss.ugc.effectplatform.model.UrlModel urlModel;

    public UrlModel() {
        this(null, 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/effectmanager/common/model/UrlModel$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/effectmanager/common/model/UrlModel;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.common.model.UrlModel$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/effectmanager/common/model/UrlModel$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/effectmanager/common/model/UrlModel;", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/ugc/effectmanager/common/model/UrlModel;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.common.model.UrlModel$b */
    public static final class C60545b implements Parcelable.Creator<UrlModel> {
        C60545b() {
        }

        /* renamed from: a */
        public UrlModel[] newArray(int i) {
            return new UrlModel[i];
        }

        /* renamed from: a */
        public UrlModel createFromParcel(Parcel parcel) {
            Object obj;
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            com.ss.ugc.effectplatform.model.UrlModel urlModel = null;
            try {
                Object obj2 = com.ss.ugc.effectplatform.model.UrlModel.class.getField("CREATOR").get(null);
                if (!(obj2 instanceof Parcelable.Creator)) {
                    obj2 = null;
                }
                Parcelable.Creator creator = (Parcelable.Creator) obj2;
                if (creator != null) {
                    obj = creator.createFromParcel(parcel);
                } else {
                    obj = null;
                }
                if (!(obj instanceof com.ss.ugc.effectplatform.model.UrlModel)) {
                    obj = null;
                }
                urlModel = (com.ss.ugc.effectplatform.model.UrlModel) obj;
            } catch (Exception e) {
                EPLog.m235177a("createFromParcel", "get creator failed!", e);
            }
            return new UrlModel(urlModel);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.UrlModelTemplate
    public com.ss.ugc.effectplatform.model.UrlModel getUrlModel() {
        return this.urlModel;
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.UrlModelTemplate
    public List<String> getUrlList() {
        return super.getUrlList();
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel
    public String getUri() {
        String uri;
        com.ss.ugc.effectplatform.model.UrlModel urlModel2 = getUrlModel();
        if (urlModel2 == null || (uri = urlModel2.getUri()) == null) {
            return super.getUri();
        }
        return uri;
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel
    public List<String> getUrl_list() {
        List<String> url_list;
        com.ss.ugc.effectplatform.model.UrlModel urlModel2 = getUrlModel();
        if (urlModel2 == null || (url_list = urlModel2.getUrl_list()) == null) {
            return super.getUrl_list();
        }
        return url_list;
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel
    public void setUri(String str) {
        com.ss.ugc.effectplatform.model.UrlModel urlModel2 = getUrlModel();
        if (urlModel2 != null) {
            urlModel2.setUri(str);
        }
        super.setUri(str);
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.UrlModelTemplate
    public void setUrlList(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setUrlList(list);
    }

    public UrlModel(com.ss.ugc.effectplatform.model.UrlModel urlModel2) {
        super(urlModel2);
        this.urlModel = urlModel2;
        com.ss.ugc.effectplatform.model.UrlModel urlModel3 = getUrlModel();
        if (urlModel3 != null) {
            String uri = urlModel3.getUri();
            if (uri != null) {
                super.setUri(uri);
            }
            List<String> url_list = urlModel3.getUrl_list();
            if (url_list != null) {
                super.setUrl_list(url_list);
            }
        }
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel
    public void setUrl_list(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.UrlModel urlModel2 = getUrlModel();
        if (urlModel2 != null) {
            urlModel2.setUrl_list(list);
        }
        super.setUrl_list(list);
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel, com.ss.android.ugc.effectmanager.common.model.UrlModelTemplate
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "dest");
        if (getUrlModel() != null) {
            com.ss.ugc.effectplatform.model.UrlModel urlModel2 = getUrlModel();
            if (urlModel2 != null) {
                urlModel2.writeToParcel(parcel, i);
                return;
            }
            return;
        }
        super.writeToParcel(parcel, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UrlModel(com.ss.ugc.effectplatform.model.UrlModel urlModel2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : urlModel2);
    }
}
