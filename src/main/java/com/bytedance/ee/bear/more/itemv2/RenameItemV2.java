package com.bytedance.ee.bear.more.itemv2;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.C10196b;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.bytedance.ee.bear.more.rename.RenameSheetExecutor;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.dialog.inputdialog.BearUDInputDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.lang.ref.WeakReference;
import org.koin.java.KoinJavaComponent;

public class RenameItemV2 extends BaseMoreItem implements ITextMoreItem {
    public Activity mActivity;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_ccm_rename_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return CommonMoreItemId.RENAME.getId();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_More_RenameSheetTitle);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        if (!isItemDisabledByJSMsg() && isVisible() && getMoreInfo().mo39049p()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.more.itemv2.RenameItemV2$a */
    public static class C10227a implements RenameSheetExecutor.AbstractC10248a {

        /* renamed from: a */
        private WeakReference<RenameItemV2> f27612a;

        /* renamed from: b */
        private String f27613b;

        /* renamed from: c */
        private String f27614c;

        @Override // com.bytedance.ee.bear.more.rename.RenameSheetExecutor.AbstractC10248a
        /* renamed from: a */
        public void mo39138a() {
            C13479a.m54758a("RenameItemV2", "rename sheet fail");
            if (this.f27612a.get() != null) {
                RenameItemV2 renameItemV2 = this.f27612a.get();
                Toast.showFailureText(renameItemV2.mActivity, renameItemV2.mActivity.getString(R.string.Doc_Facade_RenameFailed), 0);
            }
        }

        @Override // com.bytedance.ee.bear.more.rename.RenameSheetExecutor.AbstractC10248a
        /* renamed from: a */
        public void mo39139a(RenameSheetExecutor.RenameResult renameResult) {
            C13479a.m54764b("RenameItemV2", "rename sheet success");
            if (this.f27612a.get() != null) {
                RenameItemV2 renameItemV2 = this.f27612a.get();
                Toast.showSuccessText(renameItemV2.mActivity, renameItemV2.mActivity.getString(R.string.Doc_Facade_RenameSuccessfully), 0);
                ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31504a(this.f27613b, this.f27614c);
            }
        }

        public C10227a(RenameItemV2 renameItemV2, String str, String str2) {
            this.f27612a = new WeakReference<>(renameItemV2);
            this.f27613b = str;
            this.f27614c = str2;
        }
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        boolean z;
        int i;
        Activity activity;
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo == null || moreInfo.mo39036e() != C8275a.f22373f.mo32555b()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            activity = this.mActivity;
            i = R.string.Doc_Facade_MoreRenameTypeBitable;
        } else {
            activity = this.mActivity;
            i = R.string.Doc_Facade_MoreRenameTypeSheet;
        }
        return C10539a.m43639a(this.mActivity, R.string.Doc_Facade_MoreRenameTips, ShareHitPoint.f121869d, activity.getString(i));
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        IMoreInfo moreInfo;
        if (isItemInvisibleByJSMsg() || (moreInfo = getMoreInfo()) == null) {
            return false;
        }
        if (moreInfo.mo39036e() == C8275a.f22372e.mo32555b() || moreInfo.mo39036e() == C8275a.f22373f.mo32555b()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        IMoreInfo moreInfo = getMoreInfo();
        C13479a.m54772d("RenameItemV2", "onItemClick: docInfoData = " + moreInfo);
        C10196b.m42465a(moreInfo, "rename");
        if (moreInfo != null) {
            getHost().mo39166c();
            ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40651a(moreInfo.mo39041h(), String.valueOf(moreInfo.mo39036e()), ((BearUDInputDialogBuilder) new BearUDInputDialogBuilder(this.mActivity).title(R.string.Doc_More_RenameSheetTitle)).mo45395b(R.string.Doc_More_RenameSheetPlaceholder).mo45397b(moreInfo.mo39042i()).mo45399c(R.string.Doc_Facade_Confirm).mo45391a(new BearUDInputDialogBuilder.OnBtnClickListener(moreInfo) {
                /* class com.bytedance.ee.bear.more.itemv2.$$Lambda$RenameItemV2$r3f4PAwMKNvMitr4pu23L5xlRZQ */
                public final /* synthetic */ IMoreInfo f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.bytedance.ee.bear.widgets.dialog.inputdialog.BearUDInputDialogBuilder.OnBtnClickListener
                public final void onClick(String str) {
                    RenameItemV2.this.lambda$onClick$0$RenameItemV2(this.f$1, str);
                }
            }).mo45402d(R.string.Doc_Facade_Cancel).show());
            if (moreInfo instanceof DocMoreInfo) {
                ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38968a(getHost().mo39165b().getArguments(), moreInfo.mo39041h(), moreInfo.mo39036e(), moreInfo.mo39009E(), moreInfo.mo39038f(), "rename", "ccm_space_drive_rename_view", "", "", "", moreInfo instanceof WikiMoreInfo, ((DocMoreInfo) moreInfo).mo39008D());
            }
        }
    }

    public RenameItemV2(Activity activity) {
        this.mActivity = activity;
    }

    public /* synthetic */ void lambda$onClick$0$RenameItemV2(IMoreInfo dVar, String str) {
        if (TextUtils.equals(dVar.mo39042i(), str)) {
            C13479a.m54764b("RenameItemV2", "onClick Positive: title doesn't changed, so dismiss dialog");
        } else {
            renameTitle(dVar.mo39041h(), dVar.mo39036e(), str);
        }
    }

    private void renameTitle(String str, int i, String str2) {
        if (str != null && str2 != null) {
            new RenameSheetExecutor((NetService) KoinJavaComponent.m268610a(NetService.class)).mo39193a(str, i, str2, new C10227a(this, str, str2));
        }
    }
}
