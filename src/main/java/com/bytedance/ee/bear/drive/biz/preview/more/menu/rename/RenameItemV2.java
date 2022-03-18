package com.bytedance.ee.bear.drive.biz.preview.more.menu.rename;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.biz.preview.more.menu.AbstractC6677b;
import com.bytedance.ee.bear.drive.biz.preview.more.menu.rename.UpdateFileInfoRepository;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.drive.view.p362a.C7207a;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.dialog.inputdialog.BearUDInputDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13672c;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p716r.C13721c;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import org.koin.java.KoinJavaComponent;

public class RenameItemV2 extends BaseMoreItem implements AbstractC6677b, ITextMoreItem {
    public Context mContext;
    public C6880a mDriveCacheManager;
    private C7207a mDriveDialogManager;
    public C7130c mDriveReport;
    public C7086a mFileModel;
    private AbstractC6683a mIRenameCallback;
    private IMoreInfo mMoreInfo;
    public String mNewName;
    private UpdateFileInfoRepository mUpdateFileInfoRepository = new UpdateFileInfoRepository((NetService) KoinJavaComponent.m268610a(NetService.class));

    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.menu.rename.RenameItemV2$a */
    public interface AbstractC6683a {
        /* renamed from: a */
        void mo26288a(String str, boolean z);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_ccm_rename_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "item_renameV2";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Drive_Drive_Rename);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        IMoreInfo dVar = this.mMoreInfo;
        if (dVar == null || !dVar.mo39049p()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.drive.biz.preview.more.menu.AbstractC6677b
    public void onDetach() {
        this.mContext = null;
        this.mIRenameCallback = null;
        this.mFileModel = null;
        this.mMoreInfo = null;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        Context context = this.mContext;
        if (context == null) {
            return "";
        }
        return C10539a.m43639a(this.mContext, R.string.Doc_Facade_MoreRenameTips, ShareHitPoint.f121869d, context.getString(R.string.Doc_Facade_MoreRenameTypeFile));
    }

    public void onNameNoChange() {
        this.mDriveReport.mo27916a(C7130c.m28587b(this.mFileModel), "use_old");
        this.mDriveReport.mo27979n(C7130c.m28587b(this.mFileModel));
        Toast.showSuccessText(C13615c.f35773a, (int) R.string.Drive_Drive_RenameSuccess);
        callbackRename(this.mFileModel.mo27322a().mo27358a(), false);
    }

    private void confirmSecondary() {
        Context context = this.mContext;
        if (context == null) {
            C13479a.m54775e("DRIVE_RenameItemV2", "confirmSecondary()...mContext == null");
            return;
        }
        String a = C10539a.m43639a(context, R.string.Drive_Drive_UseExtension, "ext", "." + C13672c.m55481b(this.mNewName));
        Context context2 = this.mContext;
        this.mDriveDialogManager.mo28225c(this.mContext, a, C10539a.m43639a(context2, R.string.Drive_Drive_KeepExtension, "ext", "." + C13672c.m55481b(this.mFileModel.mo27322a().mo27358a())), new C7207a.AbstractC7208a() {
            /* class com.bytedance.ee.bear.drive.biz.preview.more.menu.rename.RenameItemV2.C66822 */

            @Override // com.bytedance.ee.bear.drive.view.p362a.C7207a.AbstractC7208a
            /* renamed from: b */
            public void mo25759b() {
                RenameItemV2.this.mDriveReport.mo27934b(C7130c.m28587b(RenameItemV2.this.mFileModel), "use_new");
                RenameItemV2 renameItemV2 = RenameItemV2.this;
                renameItemV2.renameFile(renameItemV2.mNewName, true);
            }

            @Override // com.bytedance.ee.bear.drive.view.p362a.C7207a.AbstractC7208a
            /* renamed from: a */
            public void mo25758a() {
                RenameItemV2.this.mDriveReport.mo27934b(C7130c.m28587b(RenameItemV2.this.mFileModel), "use_old");
                String g = RenameItemV2.this.mFileModel.mo27322a().mo27364g();
                String a = C13672c.m55480a(RenameItemV2.this.mNewName);
                RenameItemV2 renameItemV2 = RenameItemV2.this;
                if (!TextUtils.isEmpty(g)) {
                    a = a.concat(".").concat(g);
                }
                renameItemV2.mNewName = a;
                RenameItemV2 renameItemV22 = RenameItemV2.this;
                renameItemV22.renameFile(renameItemV22.mNewName, false);
            }
        });
    }

    private void showFileNameEditView() {
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40644a(((BearUDInputDialogBuilder) new BearUDInputDialogBuilder(this.mContext).title(R.string.Drive_Drive_Rename)).mo45395b(R.string.Drive_Drive_PleaseEnterTitle).mo45397b(this.mFileModel.mo27322a().mo27358a()).mo45390a(getCursorIndex(this.mFileModel.mo27322a().mo27358a())).mo45399c(R.string.Doc_Facade_Confirm).mo45391a(new BearUDInputDialogBuilder.OnBtnClickListener() {
            /* class com.bytedance.ee.bear.drive.biz.preview.more.menu.rename.$$Lambda$RenameItemV2$7gOD979043I8pxjTq3byp9opiFo */

            @Override // com.bytedance.ee.bear.widgets.dialog.inputdialog.BearUDInputDialogBuilder.OnBtnClickListener
            public final void onClick(String str) {
                RenameItemV2.this.lambda$showFileNameEditView$0$RenameItemV2(str);
            }
        }).mo45402d(R.string.Doc_Facade_Cancel).mo45396b(new BearUDInputDialogBuilder.OnBtnClickListener() {
            /* class com.bytedance.ee.bear.drive.biz.preview.more.menu.rename.$$Lambda$RenameItemV2$BkBVtxa7yrUEbs0vTGvSkK8UiI */

            @Override // com.bytedance.ee.bear.widgets.dialog.inputdialog.BearUDInputDialogBuilder.OnBtnClickListener
            public final void onClick(String str) {
                RenameItemV2.this.lambda$showFileNameEditView$1$RenameItemV2(str);
            }
        }).mo45393a(true).show());
        IMoreInfo dVar = this.mMoreInfo;
        if (dVar != null) {
            C7130c.m28602i(dVar.mo39041h(), this.mMoreInfo.mo39038f());
        }
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        showFileNameEditView();
        if (getMoreInfo() != null) {
            IMoreInfo moreInfo = getMoreInfo();
            ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38968a(getHost().mo39165b().getArguments(), moreInfo.mo39041h(), moreInfo.mo39036e(), false, moreInfo.mo39038f(), "rename", "ccm_space_drive_rename_view", "", "", "", false, this.mDriveReport.mo27977l());
        }
        getHost().mo39166c();
    }

    public void setRenameCallback(AbstractC6683a aVar) {
        this.mIRenameCallback = aVar;
    }

    public /* synthetic */ void lambda$showFileNameEditView$0$RenameItemV2(String str) {
        callbackConfirm(C13721c.m55649c(str));
    }

    public void onTypeModify(String str) {
        this.mNewName = str;
        confirmSecondary();
    }

    public /* synthetic */ void lambda$showFileNameEditView$1$RenameItemV2(String str) {
        this.mDriveReport.mo27916a(C7130c.m28587b(this.mFileModel), "use_old");
    }

    private boolean checkTypeModify(String str) {
        String str2;
        C7086a aVar = this.mFileModel;
        if (aVar == null) {
            str2 = "";
        } else {
            str2 = aVar.mo27322a().mo27364g();
        }
        return !TextUtils.equals(str2, C13672c.m55481b(str));
    }

    private int getCursorIndex(String str) {
        if (str == null) {
            return -1;
        }
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf < 0) {
            return str.length();
        }
        return lastIndexOf;
    }

    private void callbackConfirm(String str) {
        if (TextUtils.equals(this.mFileModel.mo27322a().mo27358a(), str)) {
            onNameNoChange();
        } else if (checkTypeModify(str)) {
            onTypeModify(str);
        } else {
            onNameModify(str);
        }
    }

    public void onNameModify(String str) {
        if (str.equals(this.mNewName)) {
            this.mDriveReport.mo27916a(C7130c.m28587b(this.mFileModel), "use_old");
        } else {
            this.mDriveReport.mo27916a(C7130c.m28587b(this.mFileModel), "use_new");
        }
        this.mDriveReport.mo27979n(C7130c.m28587b(this.mFileModel));
        this.mNewName = str;
        renameFile(str, false);
    }

    public void callbackRename(String str, boolean z) {
        AbstractC6683a aVar = this.mIRenameCallback;
        if (aVar != null) {
            aVar.mo26288a(str, z);
        }
    }

    public void renameFile(final String str, final boolean z) {
        this.mUpdateFileInfoRepository.mo26368a(this.mFileModel.mo27322a().f18785a, str, this.mFileModel.mo27322a().f19095n, new UpdateFileInfoRepository.AbstractC6688b() {
            /* class com.bytedance.ee.bear.drive.biz.preview.more.menu.rename.RenameItemV2.C66811 */

            @Override // com.bytedance.ee.bear.drive.biz.preview.more.menu.rename.UpdateFileInfoRepository.AbstractC6688b
            /* renamed from: a */
            public void mo26366a() {
                if (RenameItemV2.this.mContext == null) {
                    C13479a.m54758a("DRIVE_RenameItemV2", "onSuccess context is null");
                    return;
                }
                Toast.showSuccessText(RenameItemV2.this.mContext, RenameItemV2.this.mContext.getString(R.string.Drive_Drive_RenameSuccess), 0);
                RenameItemV2.this.callbackRename(str, z);
                RenameItemV2.this.mDriveCacheManager.mo27090b(C6880a.m27076a(RenameItemV2.this.mFileModel.mo27322a().f18785a), str);
            }

            @Override // com.bytedance.ee.bear.drive.biz.preview.more.menu.rename.UpdateFileInfoRepository.AbstractC6688b
            /* renamed from: a */
            public void mo26367a(int i) {
                int i2;
                C13479a.m54764b("DRIVE_RenameItemV2", "renameFile onFailure errorCode = " + i);
                if (RenameItemV2.this.mContext == null) {
                    C13479a.m54758a("DRIVE_RenameItemV2", "onFailure context is null");
                    return;
                }
                if (i == 10009) {
                    i2 = R.string.Drive_Drive_OpeationFailByPolicy;
                } else {
                    i2 = R.string.Drive_Drive_RenameFail;
                }
                Toast.showFailureText(RenameItemV2.this.mContext, RenameItemV2.this.mContext.getString(i2), 0);
            }
        });
    }

    public RenameItemV2(Context context, C10917c cVar, C7086a aVar, IMoreInfo dVar, C7130c cVar2) {
        this.mContext = context;
        this.mFileModel = aVar;
        this.mMoreInfo = dVar;
        this.mDriveDialogManager = C6920b.m27342f().mo27178g();
        this.mDriveCacheManager = C6920b.m27342f().mo27170e();
        this.mDriveReport = cVar2;
    }
}
