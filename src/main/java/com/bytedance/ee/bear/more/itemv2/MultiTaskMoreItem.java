package com.bytedance.ee.bear.more.itemv2;

import com.bytedance.ee.bear.more.C10196b;
import com.bytedance.ee.bear.more.C10208e;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.IMultiTaskMoreItemHelper;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/more/itemv2/MultiTaskMoreItem;", "Lcom/bytedance/ee/bear/more/moreprotocol/IGridMoreItem;", "Lcom/bytedance/ee/bear/more/moreprotocol/BaseMoreItem;", "helper", "Lcom/bytedance/ee/bear/more/moreprotocol/IMultiTaskMoreItemHelper;", "(Lcom/bytedance/ee/bear/more/moreprotocol/IMultiTaskMoreItemHelper;)V", "TAG", "", "getIcon", "", "getIconTint", "getId", "getTitle", "isVisible", "", "needShowBadge", "onClick", "", "reportMoreItemClick", "click", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class MultiTaskMoreItem extends BaseMoreItem implements IGridMoreItem {
    private final String TAG = "MultiTaskMoreItem";
    private final IMultiTaskMoreItemHelper helper;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return CommonMoreItemId.MULTI_TASK.getId();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public String getUnableTips() {
        return IGridMoreItem.C10237a.m42704b(this);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public boolean isEnable() {
        return IGridMoreItem.C10237a.m42703a(this);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        if (this.helper.mo23764b()) {
            return R.drawable.ud_icon_unmultitask_outlined;
        }
        return R.drawable.ud_icon_multitask_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        boolean a = this.helper.mo23763a();
        String str = this.TAG;
        C13479a.m54764b(str, "isInDocOrDrive = " + a);
        return a;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public boolean needShowBadge() {
        boolean a = C10208e.m42526a(getId());
        String str = this.TAG;
        C13479a.m54764b(str, "needShowBadge()...isNew: " + a);
        return a;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        boolean b = this.helper.mo23764b();
        String str = this.TAG;
        C13479a.m54764b(str, "isDuplicatedTask: " + b);
        if (b) {
            return getString(R.string.Lark_Core_CancelFloating);
        }
        return getString(R.string.Lark_Core_FloatingWindow);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public void onClick() {
        C13479a.m54764b(this.TAG, "onClick()...");
        C10208e.m42527b(getId());
        if (this.helper.mo23763a()) {
            if (this.helper.mo23764b()) {
                this.helper.mo23765c();
                reportMoreItemClick("remove_from_tasklist");
            } else {
                this.helper.mo23766d();
                reportMoreItemClick("add_to_tasklist");
            }
        }
        getHost().mo39166c();
    }

    public MultiTaskMoreItem(IMultiTaskMoreItemHelper bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "helper");
        this.helper = bVar;
    }

    private final void reportMoreItemClick(String str) {
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo instanceof DocMoreInfo) {
            C10196b.m42463a(getHost().mo39165b().getArguments(), moreInfo.mo39041h(), moreInfo.mo39036e(), moreInfo.mo39009E(), moreInfo.mo39038f(), str, "none", "", "", "", moreInfo instanceof WikiMoreInfo, ((DocMoreInfo) moreInfo).mo39008D());
        }
    }
}
