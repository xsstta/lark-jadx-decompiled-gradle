package com.bytedance.ee.bear.drive.biz.preview.more.menu.find;

import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

public class FindItemV2 extends BaseMoreItem implements ITextMoreItem {
    private boolean mEnable;
    private AbstractC6679a mFindCallback;
    private String mUnableTips;
    private boolean mVisible;

    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.menu.find.FindItemV2$a */
    public interface AbstractC6679a {
        /* renamed from: a */
        void mo26287a();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_card_search_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "id_drive_findV2";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        return this.mUnableTips;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        return this.mEnable;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        return this.mVisible;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_Facade_LookFor);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        getHost().mo39166c();
        AbstractC6679a aVar = this.mFindCallback;
        if (aVar != null) {
            aVar.mo26287a();
        }
        if (getMoreInfo() != null) {
            C7130c a = C6920b.m27342f().mo27166a();
            IMoreInfo moreInfo = getMoreInfo();
            ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38968a(getHost().mo39165b().getArguments(), moreInfo.mo39041h(), moreInfo.mo39036e(), false, moreInfo.mo39038f(), "find", "none", "", "", "", false, a.mo27977l());
        }
    }

    public FindItemV2(boolean z, boolean z2, String str, AbstractC6679a aVar) {
        this.mVisible = z;
        this.mEnable = z2;
        this.mUnableTips = str;
        this.mFindCallback = aVar;
    }
}
