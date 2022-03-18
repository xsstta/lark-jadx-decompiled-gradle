package com.bytedance.ee.bear.list.more.itemv2;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ee.bear.contract.drive.AbstractC5141c;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.bytedance.ee.bear.service.C10917c;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

public class ImportAsItemV2 extends BaseMoreItem implements ITextMoreItem {
    private Context mContext;
    private Document mDocument;
    private int mImportType;
    private boolean mIsGrid;
    private C10917c mServiceContext;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_doc_replace_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "import_fileV2";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        return this.mContext.getString(R.string.Doc_List_MakeImportToOnlineFileForbidden);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        return !"".equals(getTitle());
    }

    private String getConvertType() {
        int i = this.mImportType;
        if (i == 101) {
            return "doc";
        }
        if (i == 102) {
            return "sheet";
        }
        if (i == 103) {
            return "mindnote";
        }
        return "";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        int a = ((AbstractC5141c) KoinJavaComponent.m268610a(AbstractC5141c.class)).mo20431a(this.mDocument.mo32469n());
        this.mImportType = a;
        int a2 = C8292f.m34120a(a, this.mDocument);
        if (a2 == Integer.MAX_VALUE) {
            return "";
        }
        return getString(a2);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        if (!(getMoreInfo() instanceof DocMoreInfo)) {
            return false;
        }
        DocMoreInfo aVar = (DocMoreInfo) getMoreInfo();
        if (!aVar.mo39010F() || !aVar.mo39006B()) {
            return aVar.mo39051r();
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        boolean z;
        C8292f.m34156a(this.mServiceContext, this.mDocument, this.mIsGrid);
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo != null) {
            AbstractC10194a aVar = (AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class);
            Bundle arguments = getHost().mo39165b().getArguments();
            String h = moreInfo.mo39041h();
            int e = moreInfo.mo39036e();
            String f = moreInfo.mo39038f();
            String convertType = getConvertType();
            if (moreInfo.mo39036e() == C8275a.f22377j.mo32555b()) {
                z = true;
            } else {
                z = false;
            }
            aVar.mo38968a(arguments, h, e, false, f, "convert_to_online", "ccm_docs_page_view", "", convertType, "", z, false);
        }
        getHost().mo39166c();
    }

    public ImportAsItemV2(Context context, C10917c cVar, Document document, boolean z) {
        this.mContext = context;
        this.mServiceContext = cVar;
        this.mDocument = document;
        this.mIsGrid = z;
    }
}
