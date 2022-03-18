package com.bytedance.ee.bear.document.bitable;

import android.content.Context;
import android.util.Log;
import com.bytedance.ee.bear.TableSimpleInfo;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.larksuite.suite.R;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/document/bitable/BitableProMoreItem;", "Lcom/bytedance/ee/bear/more/moreprotocol/ITextMoreItem;", "Lcom/bytedance/ee/bear/more/moreprotocol/BaseMoreItem;", "()V", "TAG", "", "getIcon", "", "getIconTint", "getId", "getTitle", "isVisible", "", "onClick", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BitableProMoreItem extends BaseMoreItem implements ITextMoreItem {
    private final String TAG = "BitableProMoreItem";

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.icon_bitable_authorization;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return this.TAG;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Bitable_AdvancedPermission_Setting);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        return ITextMoreItem.C10238a.m42706b(this);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        return ITextMoreItem.C10238a.m42705a(this);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return ITextMoreItem.C10238a.m42707c(this);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        boolean z;
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo == null) {
            return false;
        }
        if (!(moreInfo instanceof DocMoreInfo) || !((DocMoreInfo) moreInfo).mo39016L()) {
            z = false;
        } else {
            z = true;
        }
        boolean o = moreInfo.mo39048o();
        boolean a = C4211a.m17514a().mo16536a("ccm.bitable.mobile.advanced_permission", false);
        String str = this.TAG;
        Log.i(str, "isOwner = " + o + ", isPro = " + z + ", fg = " + a);
        if (!moreInfo.mo39048o() || !z || !a) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        String str;
        ArrayList<TableSimpleInfo> arrayList;
        String str2;
        Context context = getHost().mo39165b().getContext();
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo != null) {
            str = moreInfo.mo39041h();
        } else {
            str = null;
        }
        IMoreInfo moreInfo2 = getMoreInfo();
        if (moreInfo2 instanceof DocMoreInfo) {
            arrayList = ((DocMoreInfo) moreInfo2).mo39017M();
        } else {
            arrayList = new ArrayList<>();
        }
        if (moreInfo2 != null) {
            str2 = moreInfo2.mo39043j();
        } else {
            str2 = null;
        }
        if (context == null || str == null) {
            Log.w(this.TAG, "context is null or token is null");
            return;
        }
        ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17295b("/bitable/pro/activity").mo17314a("extra_token", str).mo17314a("extra_owner_id", str2).mo17312a("extra_table_list", (Serializable) arrayList).mo17317a();
        getHost().mo39166c();
    }
}
