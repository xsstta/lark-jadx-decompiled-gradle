package com.bytedance.ee.bear.list.more.itemv2;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.ee.bear.AbstractC4306b;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceFileOpenEntity;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.middleground_permission_export.model.IAuditApi;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/list/more/itemv2/ListDownloadItemV2;", "Lcom/bytedance/ee/bear/more/moreprotocol/BaseMoreItem;", "Lcom/bytedance/ee/bear/more/moreprotocol/ITextMoreItem;", "context", "Landroid/content/Context;", "doc", "Lcom/bytedance/ee/bear/list/dto/Document;", "isNetworkAvailable", "", "(Landroid/content/Context;Lcom/bytedance/ee/bear/list/dto/Document;Z)V", "getIcon", "", "getIconTint", "getId", "", "getTitle", "getUnableTips", "isEnable", "isVisible", "onClick", "", "Companion", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ListDownloadItemV2 extends BaseMoreItem implements ITextMoreItem {
    public static final Companion Companion = new Companion(null);
    private final Context context;
    private final Document doc;
    private final boolean isNetworkAvailable;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_download_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "item_downloadV2";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/list/more/itemv2/ListDownloadItemV2$Companion;", "", "()V", "ID_DOWNLOAD", "", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.more.itemv2.ListDownloadItemV2$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return ITextMoreItem.C10238a.m42707c(this);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        Resources resources;
        String string;
        Context context2 = this.context;
        if (context2 == null || (resources = context2.getResources()) == null || (string = resources.getString(R.string.CreationMobile_ECM_SaveToLocal_option)) == null) {
            return "";
        }
        return string;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        String string;
        Context context2 = this.context;
        if (context2 == null || (string = context2.getString(R.string.CreationMobile_ECM_AdminDisableToast)) == null) {
            return "";
        }
        return string;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        Document document = this.doc;
        if (document == null || !C8292f.m34164a(document, getMoreInfo())) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        if (!(getMoreInfo() instanceof DocMoreInfo)) {
            return false;
        }
        DocMoreInfo aVar = (DocMoreInfo) getMoreInfo();
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        if (aVar.mo39010F() && aVar.mo39006B()) {
            return false;
        }
        String str = null;
        IAdminPermissionProxy bVar = (IAdminPermissionProxy) KoinJavaComponent.m268613a(IAdminPermissionProxy.class, null, null, 6, null);
        int x = aVar.mo39057x();
        Document document = this.doc;
        if (document != null) {
            str = document.mo32472o();
        }
        return bVar.mo36546e(x, str);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        String str;
        String str2;
        String str3;
        String C;
        getHost().mo39166c();
        if (!this.isNetworkAvailable) {
            Context context2 = this.context;
            if (context2 == null) {
                Intrinsics.throwNpe();
            }
            Toast.showFailureText(context2, context2.getString(R.string.Doc_Facade_OperateFailed), 0);
            return;
        }
        IAuditApi cVar = (IAuditApi) KoinJavaComponent.m268613a(IAuditApi.class, null, null, 6, null);
        Document document = this.doc;
        String str4 = "";
        if (document == null || (str = document.mo32472o()) == null) {
            str = str4;
        }
        cVar.mo37701a(3, 7, str);
        Document document2 = this.doc;
        if (document2 == null || (str2 = document2.mo32472o()) == null) {
            str2 = str4;
        }
        Document document3 = this.doc;
        if (document3 == null || (str3 = document3.mo32469n()) == null) {
            str3 = str4;
        }
        SpaceFileOpenEntity spaceFileOpenEntity = new SpaceFileOpenEntity(str2, str3);
        Document document4 = this.doc;
        if (!(document4 == null || (C = document4.mo32377C()) == null)) {
            str4 = C;
        }
        spaceFileOpenEntity.setFileExt(str4);
        ((AbstractC4306b) KoinJavaComponent.m268613a(AbstractC4306b.class, null, null, 6, null)).mo16902a(this.context, spaceFileOpenEntity);
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo != null) {
            ((AbstractC10194a) KoinJavaComponent.m268613a(AbstractC10194a.class, null, null, 6, null)).mo38968a(getHost().mo39165b().getArguments(), moreInfo.mo39041h(), moreInfo.mo39036e(), false, moreInfo.mo39038f(), "download", "none", "", "", "", false, false);
        }
    }

    public ListDownloadItemV2(Context context2, Document document, boolean z) {
        this.context = context2;
        this.doc = document;
        this.isNetworkAvailable = z;
    }
}
