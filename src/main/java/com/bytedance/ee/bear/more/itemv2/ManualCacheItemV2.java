package com.bytedance.ee.bear.more.itemv2;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.ee.bear.contract.BinderIManualOfflineCallback;
import com.bytedance.ee.bear.contract.BinderIManualOfflineDialogCallback;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.more.C10196b;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.more.itemv2.ManualCacheItemV2;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p718t.C13748k;
import com.larksuite.suite.R;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

public class ManualCacheItemV2 extends BaseMoreItem implements IGridMoreItem {
    private final long K_INTERNEL_CLICK = 800;
    private long lastClickTime;
    public Activity mActivity;
    private Disposable mDisposable;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public String getUnableTips() {
        return "";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public boolean isEnable() {
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public boolean needShowBadge() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return CommonMoreItemId.MANUAL_CACHE.getId();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        if (isManualOffline()) {
            return R.drawable.ud_icon_cancel_offline_outlined;
        }
        return R.drawable.ud_icon_offline_outlined;
    }

    private boolean isFromSpace() {
        Bundle arguments = getHost().mo39165b().getArguments();
        if (arguments == null || arguments.getInt("more_scene", -1) != 0) {
            return false;
        }
        return true;
    }

    private boolean isManualOffline() {
        if (getMoreInfo() == null || !getMoreInfo().mo39054u()) {
            return false;
        }
        return true;
    }

    private boolean isValidClick() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.lastClickTime < 800) {
            return false;
        }
        this.lastClickTime = uptimeMillis;
        return true;
    }

    public void dismissMenu() {
        try {
            Disposable disposable = this.mDisposable;
            if (disposable != null && !disposable.isDisposed()) {
                this.mDisposable.dispose();
            }
            getHost().mo39166c();
        } catch (Exception e) {
            C13479a.m54761a("ManualCacheItemV2", e);
        }
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        int i;
        if (isManualOffline()) {
            i = R.string.Doc_More_OfflineRemove;
        } else {
            i = R.string.Doc_More_OfflineMakeAvailable;
        }
        return getString(i);
    }

    public /* synthetic */ void lambda$onClick$0$ManualCacheItemV2() {
        Activity activity = this.mActivity;
        Toast.showSuccessText(activity, activity.getString(R.string.Doc_Facade_RemoveSuccessfully), 0);
        dismissMenu();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        if (!(getMoreInfo() instanceof DocMoreInfo)) {
            return false;
        }
        DocMoreInfo aVar = (DocMoreInfo) getMoreInfo();
        if (aVar.mo39010F()) {
            return false;
        }
        return ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31507a(aVar.mo39036e());
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public void onClick() {
        String str;
        String str2;
        if (!isValidClick()) {
            C13479a.m54775e("ManualCacheItemV2", "click manual cache menu unValidClick, just ignore this action.");
            return;
        }
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo == null) {
            C13479a.m54758a("ManualCacheItemV2", "onClick, but more info == null");
            return;
        }
        if (moreInfo.mo39054u()) {
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31502a(moreInfo.mo39041h(), moreInfo.mo39036e(), false, "");
            C13748k.m55732a(new Runnable() {
                /* class com.bytedance.ee.bear.more.itemv2.$$Lambda$ManualCacheItemV2$jAA2tehP5h7aHLdY9qx3M_mqpwA */

                public final void run() {
                    ManualCacheItemV2.this.lambda$onClick$0$ManualCacheItemV2();
                }
            });
        } else {
            Document document = new Document();
            document.mo32451i(moreInfo.mo39041h());
            document.mo32433d(moreInfo.mo39036e());
            this.mDisposable = ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31526g(moreInfo.mo39041h()).mo238001b(new Consumer(document) {
                /* class com.bytedance.ee.bear.more.itemv2.$$Lambda$ManualCacheItemV2$p78IJuB9L4R3b2Yr7yKAZciKZk */
                public final /* synthetic */ Document f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ManualCacheItemV2.this.lambda$onClick$1$ManualCacheItemV2(this.f$1, (Boolean) obj);
                }
            }, new Consumer(document) {
                /* class com.bytedance.ee.bear.more.itemv2.$$Lambda$ManualCacheItemV2$jxJkUuEmsosdzXaHTsGjKZ3LieE */
                public final /* synthetic */ Document f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ManualCacheItemV2.this.lambda$onClick$2$ManualCacheItemV2(this.f$1, (Throwable) obj);
                }
            });
        }
        if (moreInfo instanceof DocMoreInfo) {
            if (isFromSpace()) {
                str = "none";
            } else {
                str = "ccm_docs_page_view";
            }
            Bundle arguments = getHost().mo39165b().getArguments();
            String h = moreInfo.mo39041h();
            int e = moreInfo.mo39036e();
            String f = moreInfo.mo39038f();
            if (moreInfo.mo39054u()) {
                str2 = "turn_off_offline";
            } else {
                str2 = "turn_on_offline";
            }
            C10196b.m42463a(arguments, h, e, false, f, str2, str, "", "", "", moreInfo instanceof WikiMoreInfo, ((DocMoreInfo) moreInfo).mo39008D());
        }
    }

    public ManualCacheItemV2(Activity activity) {
        this.mActivity = activity;
    }

    private void doManualOffline(Document document) {
        String str = "drive";
        if (!(getHost() == null || getHost().mo39165b() == null || getHost().mo39165b().getArguments() == null)) {
            str = getHost().mo39165b().getArguments().getString("module", str);
        }
        ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31506a(true, false, str, true, document, (BinderIManualOfflineCallback) new BinderIManualOfflineCallback.Stub() {
            /* class com.bytedance.ee.bear.more.itemv2.ManualCacheItemV2.BinderC102261 */

            @Override // com.bytedance.ee.bear.contract.am.AbstractC5110c
            public void onDownloadStatusChange() {
                C13748k.m55732a(new Runnable() {
                    /* class com.bytedance.ee.bear.more.itemv2.$$Lambda$ManualCacheItemV2$1$DJcj1WTOFqY7d_bgM5dxEtDQxw */

                    public final void run() {
                        ManualCacheItemV2.BinderC102261.this.lambda$onDownloadStatusChange$4$ManualCacheItemV2$1();
                    }
                });
            }

            public /* synthetic */ void lambda$onDownloadStatusChange$4$ManualCacheItemV2$1() {
                Toast.showSuccessText(ManualCacheItemV2.this.mActivity, ManualCacheItemV2.this.mActivity.getString(R.string.Doc_Facade_EnableManualCache), 0);
                ManualCacheItemV2.this.dismissMenu();
            }

            public /* synthetic */ void lambda$null$2$ManualCacheItemV2$1(DialogInterface dialogInterface) {
                ManualCacheItemV2.this.dismissMenu();
            }

            @Override // com.bytedance.ee.bear.contract.am.AbstractC5110c
            public void onShowConfirmDownloadDialog(Document document, long j, BinderIManualOfflineDialogCallback binderIManualOfflineDialogCallback) {
                C13748k.m55732a(new Runnable(j, binderIManualOfflineDialogCallback, document) {
                    /* class com.bytedance.ee.bear.more.itemv2.$$Lambda$ManualCacheItemV2$1$a5bBaIxYqdSv6zkKAmTLFcSIqIE */
                    public final /* synthetic */ long f$1;
                    public final /* synthetic */ BinderIManualOfflineDialogCallback f$2;
                    public final /* synthetic */ Document f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r4;
                        this.f$3 = r5;
                    }

                    public final void run() {
                        ManualCacheItemV2.BinderC102261.this.lambda$onShowConfirmDownloadDialog$3$ManualCacheItemV2$1(this.f$1, this.f$2, this.f$3);
                    }
                });
            }

            public /* synthetic */ void lambda$onShowConfirmDownloadDialog$3$ManualCacheItemV2$1(long j, BinderIManualOfflineDialogCallback binderIManualOfflineDialogCallback, Document document) {
                if (ManualCacheItemV2.this.mActivity != null && !ManualCacheItemV2.this.mActivity.isFinishing()) {
                    String string = ManualCacheItemV2.this.mActivity.getString(R.string.Doc_Facade_OfflineDisconnectWIFI);
                    new BearUDDialogBuilder(ManualCacheItemV2.this.mActivity).mo45353a(string).mo45357b(C10539a.m43639a(ManualCacheItemV2.this.mActivity, R.string.Doc_Facade_OfflineMaxFileTips, "size", C13675f.m55508b(j))).mo45360c(8388611).mo45351a(BearUDDialogBuilder.ActionBottomOrientation.VERTICAL).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_OfflineWIFIDownload, new DialogInterface.OnClickListener(document) {
                        /* class com.bytedance.ee.bear.more.itemv2.$$Lambda$ManualCacheItemV2$1$1tLhzRx_guN8FjeikSSmqUvz4g */
                        public final /* synthetic */ Document f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            BinderIManualOfflineDialogCallback.this.onWaitingWifi(this.f$1);
                        }
                    }).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_OfflineProcess, new DialogInterface.OnClickListener(document) {
                        /* class com.bytedance.ee.bear.more.itemv2.$$Lambda$ManualCacheItemV2$1$59CpMkVU6seZ1_GIzYad4PBzpQ */
                        public final /* synthetic */ Document f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            BinderIManualOfflineDialogCallback.this.onConfirmDownload(this.f$1);
                        }
                    }).mo45346a(R.id.ud_dialog_btn_secondary2, R.string.Doc_Facade_Cancel, (DialogInterface.OnClickListener) null).mo45350a(new DialogInterface.OnDismissListener() {
                        /* class com.bytedance.ee.bear.more.itemv2.$$Lambda$ManualCacheItemV2$1$hUKYnhVZKcPUohGT2fvJdgB_5Wo */

                        public final void onDismiss(DialogInterface dialogInterface) {
                            ManualCacheItemV2.BinderC102261.this.lambda$null$2$ManualCacheItemV2$1(dialogInterface);
                        }
                    }).mo45355a().show();
                }
            }
        });
    }

    public /* synthetic */ void lambda$onClick$1$ManualCacheItemV2(Document document, Boolean bool) throws Exception {
        document.mo32431b(bool.booleanValue());
        doManualOffline(document);
    }

    public /* synthetic */ void lambda$onClick$2$ManualCacheItemV2(Document document, Throwable th) throws Exception {
        C13479a.m54758a("ManualCacheItemV2", "throwable = " + th);
        doManualOffline(document);
    }
}
