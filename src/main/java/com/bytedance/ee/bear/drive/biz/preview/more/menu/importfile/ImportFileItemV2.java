package com.bytedance.ee.bear.drive.biz.preview.more.menu.importfile;

import android.content.Context;
import com.bytedance.ee.bear.drive.biz.importfile.p328b.C6476a;
import com.bytedance.ee.bear.drive.biz.preview.more.menu.AbstractC6677b;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.importfile.ImportFileEntity;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.p325b.C6319a;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.larksuite.suite.R;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;

public class ImportFileItemV2 extends BaseMoreItem implements AbstractC6677b, ITextMoreItem {
    private Context mContext;
    private C7086a mFileModel;
    private IMoreInfo mMoreInfo;

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
        return "item_import_fileV2";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        return "";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        return true;
    }

    @Override // com.bytedance.ee.bear.drive.biz.preview.more.menu.AbstractC6677b
    public void onDetach() {
        this.mFileModel = null;
        this.mContext = null;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(C6476a.m26024b(this.mFileModel));
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        if (!this.mMoreInfo.mo39051r() || !C6476a.m26022a(this.mFileModel)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        boolean a = ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38977a("item_import_fileV2");
        ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38980b("item_import_fileV2");
        return a;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        getHost().mo39166c();
        C7130c a = C6920b.m27342f().mo27166a();
        if (this.mContext != null) {
            ImportFileEntity importFileEntity = new ImportFileEntity(this.mFileModel.mo27322a().f18785a, this.mFileModel.mo27322a().mo27358a());
            importFileEntity.mo27486a(new HashMap<String, String>() {
                /* class com.bytedance.ee.bear.drive.biz.preview.more.menu.importfile.ImportFileItemV2.C66801 */

                {
                    put("is_file_detail", String.valueOf(true));
                }
            });
            C6319a.m25392a(this.mContext, importFileEntity);
        }
        if (getMoreInfo() != null) {
            IMoreInfo moreInfo = getMoreInfo();
            ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38968a(getHost().mo39165b().getArguments(), moreInfo.mo39041h(), moreInfo.mo39036e(), false, moreInfo.mo39038f(), "import_as", "ccm_docs_page_view", "", "", "", false, a.mo27977l());
        }
    }

    public ImportFileItemV2(Context context, C7086a aVar, IMoreInfo dVar) {
        this.mContext = context;
        this.mFileModel = aVar;
        this.mMoreInfo = dVar;
    }
}
