package com.ss.android.lark.filedetail.impl;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.im.api.AbstractC29625q;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FileState;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.filedetail.FileDetailModule;
import com.ss.android.lark.filedetail.dto.AbstractC38215b;
import com.ss.android.lark.filedetail.dto.C38212a;
import com.ss.android.lark.filedetail.dto.FileDetailLaunchParams;
import com.ss.android.lark.filedetail.impl.detail.AbstractC38253d;
import com.ss.android.lark.filedetail.impl.detail.C38233b;
import com.ss.android.lark.filedetail.impl.detail.C38243c;
import com.ss.android.lark.filedetail.impl.detail.FileDownloadState;
import com.ss.android.lark.filedetail.impl.detail.listener.IPushMessageListener;
import com.ss.android.lark.filedetail.impl.open.C38279a;
import com.ss.android.lark.filedetail.impl.open.C38292b;
import com.ss.android.lark.filedetail.impl.open.C38303c;
import com.ss.android.lark.filedetail.impl.open.OpenFileInfo;
import com.ss.android.lark.filedetail.impl.open.OpenFileParams;
import com.ss.android.lark.filedetail.impl.statistic.DriveHitPoint;
import com.ss.android.lark.filedetail.impl.statistic.FileHitPoint;
import com.ss.android.lark.filedetail.p1885a.AbstractC38197a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.C51327f;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.p2932c.C58333b;
import com.ss.android.lark.widget.p2932c.C58339d;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.vesdk.C64034n;
import io.reactivex.disposables.Disposable;
import java.util.List;

public class FileDetailFragment extends BaseFragment implements AbstractC38253d {

    /* renamed from: a */
    public static final int f97968a = FileDetailModule.f97880b.mo139564a().getDownloadFileMonitorDependency().mo139617a();

    /* renamed from: A */
    private AbstractC29625q f97969A;

    /* renamed from: B */
    private final AbstractC38197a f97970B;

    /* renamed from: C */
    private final AbstractC38197a.AbstractC38199b f97971C;

    /* renamed from: D */
    private final IPushMessageListener f97972D;

    /* renamed from: E */
    private Disposable f97973E;

    /* renamed from: F */
    private boolean f97974F;

    /* renamed from: G */
    private final boolean f97975G;

    /* renamed from: H */
    private LKUIStatus f97976H;

    /* renamed from: I */
    private final Runnable f97977I;

    /* renamed from: J */
    private AbstractC38226a f97978J;

    /* renamed from: b */
    AbstractC38197a.AbstractC38202e f97979b;

    /* renamed from: c */
    public int f97980c;

    /* renamed from: d */
    public FileContent f97981d;

    /* renamed from: e */
    public String f97982e;

    /* renamed from: f */
    public String f97983f;

    /* renamed from: g */
    public boolean f97984g;

    /* renamed from: h */
    public FileDownloadState f97985h = FileDownloadState.NORMAL;

    /* renamed from: i */
    public FileDetailModule.NetworkType f97986i;

    /* renamed from: j */
    public final AbstractC38197a.AbstractC38200c f97987j;

    /* renamed from: k */
    public boolean f97988k;

    /* renamed from: l */
    public final Runnable f97989l;

    /* renamed from: m */
    private C38243c f97990m;
    ImageView mCloseIv;
    ViewGroup mRootView;
    TextView mTipsTv;

    /* renamed from: n */
    private Message f97991n;

    /* renamed from: o */
    private FavoriteMessageInfo f97992o;

    /* renamed from: p */
    private String f97993p;

    /* renamed from: q */
    private boolean f97994q;

    /* renamed from: r */
    private int f97995r = -1;

    /* renamed from: s */
    private boolean f97996s;

    /* renamed from: t */
    private boolean f97997t = true;

    /* renamed from: u */
    private String f97998u;

    /* renamed from: v */
    private boolean f97999v;
    TextView vBtnFunction;
    ImageView vImageFileIcon;
    View vLayoutProgress;
    ProgressBar vProgressBar;
    TextView vTextFileName;
    CommonTitleBar vTitleBar;

    /* renamed from: w */
    private AbstractC38197a.AbstractC38201d f98000w;

    /* renamed from: x */
    private OpenFileInfo f98001x;

    /* renamed from: y */
    private AbstractC38215b f98002y;

    /* renamed from: z */
    private OpenFileParams f98003z;

    /* renamed from: com.ss.android.lark.filedetail.impl.FileDetailFragment$a */
    public interface AbstractC38226a {
        /* renamed from: a */
        void mo139771a(String str);
    }

    /* renamed from: l */
    private boolean m150272l() {
        return this.f97997t;
    }

    @Override // com.ss.android.lark.filedetail.impl.detail.AbstractC38253d
    /* renamed from: f */
    public void mo139762f() {
        finish();
    }

    /* renamed from: a */
    public void mo139753a(FileDownloadState fileDownloadState) {
        Log.m165389i("FileDetailFragment", "change download state :" + fileDownloadState);
        this.f97990m.mo139836a(fileDownloadState);
        switch (C382183.f98010a[fileDownloadState.ordinal()]) {
            case 1:
                m150263b(0);
                m150258a(this.vBtnFunction, R.drawable.file_download_function_btn_normal_bg_selector, R.color.static_white, UIUtils.getString(getContext(), R.string.Lark_Legacy_Download) + String.format("(%s)", C26311p.m95262a(this.f97981d.getSize())));
                this.vProgressBar.setSecondaryProgress(0);
                UIUtils.hide(this.vLayoutProgress);
                this.f97990m.mo139845c();
                break;
            case 2:
                m150263b(0);
                long size = this.f97981d.getSize() - ((this.f97981d.getSize() * ((long) this.vProgressBar.getProgress())) / 100);
                m150258a(this.vBtnFunction, R.drawable.file_download_function_btn_normal_bg_selector, R.color.static_white, UIUtils.getString(getContext(), R.string.Lark_Legacy_FileResumeDownload) + String.format("(%s)", C26311p.m95262a(size)));
                this.vProgressBar.setSecondaryProgress(0);
                UIUtils.hide(this.mTipsTv);
                UIUtils.show(this.vLayoutProgress);
                this.f97990m.mo139845c();
                break;
            case 3:
                m150263b(0);
                UIUtils.show(this.vLayoutProgress);
                m150258a(this.vBtnFunction, R.drawable.file_download_function_btn_pause_bg_selector, R.color.primary_pri_500, UIUtils.getString(getContext(), R.string.Lark_Legacy_FileSuspendDownload));
                UIUtils.hide(this.mTipsTv);
                this.vProgressBar.setSecondaryProgress(0);
                mo139759c();
                m150274n();
                break;
            case 4:
                this.f97981d.setFileState(FileState.DONE);
                if (!m150273m()) {
                    m150263b(0);
                    m150277q();
                    UIUtils.show(this.vLayoutProgress);
                    this.vProgressBar.setProgress(100);
                    this.vProgressBar.setSecondaryProgress(0);
                    this.mCloseIv.setImageResource(R.drawable.file_download_completed);
                    if (!m150278r()) {
                        m150258a(this.vBtnFunction, R.drawable.file_download_function_btn_normal_bg_selector, R.color.static_white, UIUtils.getString(getContext(), m150275o()));
                        m150261a(this.f97981d.getKey());
                        m150258a(this.mTipsTv, 0, R.color.primary_pri_500, UIUtils.getString(getContext(), R.string.Lark_Legacy_UnsupportedFormatPleaseUseOtherApp));
                    } else {
                        UIUtils.hide(this.vBtnFunction);
                    }
                    this.f98000w.mo139620a(this.f97981d.getKey(), this.f97982e);
                    break;
                } else {
                    UICallbackExecutor.executeDelayed(this.f97977I, 300);
                    this.f97990m.mo139834a(this.f97991n, this.f97981d, getContext(), this.f98003z);
                    this.f98000w.mo139620a(this.f97981d.getKey(), this.f97982e);
                    return;
                }
            case 5:
                m150263b(0);
                UIUtils.hide(this.vLayoutProgress);
                this.f97981d.setFileState(FileState.DOWNLOAD);
                this.f97990m.mo139845c();
                UIUtils.hide(this.mTipsTv);
                m150258a(this.vBtnFunction, R.drawable.file_download_function_btn_normal_bg_selector, R.color.static_white, UIUtils.getString(getContext(), R.string.Lark_Legacy_Download) + String.format("(%s)", C26311p.m95262a(this.f97981d.getSize())));
                this.f98000w.mo139620a(this.f97981d.getKey(), this.f97982e);
                break;
            case 6:
                m150263b(0);
                UIUtils.show(this.vLayoutProgress);
                this.f97990m.mo139845c();
                ProgressBar progressBar = this.vProgressBar;
                progressBar.setSecondaryProgress(progressBar.getProgress());
                m150258a(this.mTipsTv, 0, R.color.function_danger_500, UIUtils.getString(getContext(), R.string.Lark_Legacy_FileDownloadFail));
                m150258a(this.vBtnFunction, R.drawable.file_download_function_btn_normal_bg_selector, R.color.static_white, UIUtils.getString(getContext(), R.string.Lark_Legacy_ReDownload));
                break;
            case 7:
                m150263b(0);
                this.f97990m.mo139845c();
                mo139760d();
                break;
            case 8:
                m150263b(0);
                this.f97990m.mo139845c();
                mo139761e();
                break;
            case 9:
                m150263b(0);
                this.f97981d.setFileState(FileState.DOWNLOAD);
                UIUtils.hide(this.vBtnFunction);
                UIUtils.hide(this.vLayoutProgress);
                break;
        }
        this.f97985h = fileDownloadState;
    }

    /* renamed from: a */
    public void mo139755a(boolean z) {
        FileOpenDialogUtils.m150339a(this.mContext, z, new DialogInterface.OnDismissListener() {
            /* class com.ss.android.lark.filedetail.impl.$$Lambda$FileDetailFragment$fraXpcgMEcAzS0EDbNSiUXiWRtM */

            public final void onDismiss(DialogInterface dialogInterface) {
                FileDetailFragment.lambda$fraXpcgMEcAzS0EDbNSiUXiWRtM(FileDetailFragment.this, dialogInterface);
            }
        });
    }

    /* renamed from: a */
    public void mo139752a(MessageInfo messageInfo) {
        if (!C57881t.m224633e(this.f97981d.getFilePath(), this.f97981d.getName())) {
            Message message = messageInfo.getMessage();
            Message message2 = this.f97991n;
            if (message2 != null && message2.getId().equals(message.getId())) {
                if (message.isBurned()) {
                    mo139753a(FileDownloadState.BURNED);
                } else if (message.getStatus() == Message.Status.DELETED) {
                    mo139753a(FileDownloadState.RECALL);
                }
            }
        }
    }

    @Override // com.ss.android.lark.filedetail.impl.detail.AbstractC38253d
    /* renamed from: a */
    public void mo139751a(Message message) {
        UIUtils.hide(this.vLayoutProgress);
        if (this.f97985h != FileDownloadState.PAUSE && this.f97985h != FileDownloadState.STOP) {
            mo139753a(FileDownloadState.FAILED);
        }
    }

    @Override // com.ss.android.lark.filedetail.impl.detail.AbstractC38253d
    /* renamed from: a */
    public boolean mo139756a(List<String> list) {
        C58630d.m227373a(getContext(), list, 0, this.vBtnFunction, false);
        return true;
    }

    @Override // com.ss.android.lark.filedetail.impl.detail.AbstractC38253d
    /* renamed from: a */
    public void mo139750a(Fragment fragment, String str) {
        ((FragmentActivity) this.mContext).getSupportFragmentManager().beginTransaction().replace(16908290, fragment).commitAllowingStateLoss();
        AbstractC38226a aVar = this.f97978J;
        if (aVar != null) {
            aVar.mo139771a(str);
        }
    }

    /* renamed from: a */
    public void mo139749a(View view) {
        OpenFileInfo openFileInfo = this.f98001x;
        if (openFileInfo != null && openFileInfo.mFileContent != null) {
            C38292b bVar = new C38292b(getContext(), this.f98001x, true);
            if (!DesktopUtil.m144301a(this.mContext)) {
                C58339d.m226195a(this.mContext, bVar.mo140069a());
            } else if (bVar.mo140069a().size() > 1) {
                C58333b.m226183a(this.mContext, view, bVar.mo140069a().subList(0, bVar.mo140069a().size() - 1));
            }
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: v */
    private /* synthetic */ void m150282v() {
        this.f97976H.mo89837a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m150276p();
    }

    /* renamed from: k */
    private boolean m150271k() {
        boolean z = this.f97996s;
        if (!z) {
            return this.f97997t;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: public */
    /* renamed from: w */
    private /* synthetic */ void m150283w() {
        if (!this.f97988k) {
            LKUIToast.showLoading(this.mContext, "");
        }
    }

    /* renamed from: b */
    public void mo139757b() {
        mo139753a(FileDownloadState.DONE);
        m150277q();
    }

    /* renamed from: g */
    private void m150267g() {
        this.f97986i = FileDetailModule.NetworkType.Companion.mo139563a(this.f98000w.mo139618a(getContext()));
        C382194 r0 = new AbstractC38215b() {
            /* class com.ss.android.lark.filedetail.impl.FileDetailFragment.C382194 */

            @Override // com.ss.android.lark.filedetail.dto.AbstractC38215b
            /* renamed from: a */
            public void mo139738a(final FileDetailModule.NetworkType networkType) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.filedetail.impl.FileDetailFragment.C382194.RunnableC382201 */

                    public void run() {
                        FileDetailFragment.this.f97986i = networkType;
                        Log.m165389i("FileDetailFragment", "currentNetWork type:" + networkType + " state:" + FileDetailFragment.this.f97985h + " is Manually paused:" + FileDetailFragment.this.f97984g);
                        if (FileDetailFragment.this.f97985h != FileDownloadState.BURNED && FileDetailFragment.this.f97985h != FileDownloadState.RECALL && FileDetailFragment.this.f97985h != FileDownloadState.DONE && FileDetailFragment.this.f97985h != FileDownloadState.NORMAL) {
                            if (FileDetailFragment.this.f97984g) {
                                FileDetailFragment.this.mo139753a(FileDownloadState.PAUSE);
                            } else if (FileDetailFragment.this.f97986i == FileDetailModule.NetworkType.WIFI) {
                                if (FileDetailFragment.this.f97985h == FileDownloadState.PAUSE) {
                                    C38233b.m150370a(FileDetailFragment.this.f97983f, FileDetailFragment.this.f97981d, FileDetailFragment.this.f97980c, "other");
                                }
                                FileDetailFragment.this.mo139753a(FileDownloadState.DOWNLOADING);
                            } else if (FileDetailFragment.this.f97986i == FileDetailModule.NetworkType.CELLULAR_DATA_NETWORK) {
                                long size = FileDetailFragment.this.f97981d.getSize() - ((FileDetailFragment.this.f97981d.getSize() * ((long) FileDetailFragment.this.vProgressBar.getProgress())) / 100);
                                Log.m165389i("FileDetailFragment", "current remaining:" + size);
                                if (size <= ((long) FileDetailFragment.f97968a)) {
                                    if (FileDetailFragment.this.f97985h == FileDownloadState.PAUSE) {
                                        C38233b.m150370a(FileDetailFragment.this.f97983f, FileDetailFragment.this.f97981d, FileDetailFragment.this.f97980c, "other");
                                    }
                                    FileDetailFragment.this.mo139753a(FileDownloadState.DOWNLOADING);
                                    FileDetailFragment.this.f97984g = false;
                                    LKUIToast.show(FileDetailFragment.this.getContext(), (int) R.string.Lark_Legacy_SwitchedToMobileNetwork);
                                    return;
                                }
                                C38233b.m150372a(FileDetailFragment.this.f97983f, FileDetailFragment.this.f97981d, (long) FileDetailFragment.this.f97980c, FileDetailFragment.this.f97985h, "other");
                                FileDetailFragment.this.mo139753a(FileDownloadState.PAUSE);
                                LKUIToast.show(FileDetailFragment.this.getContext(), (int) R.string.Lark_Legacy_SwitchedToMobileNetworkDownloadsupend);
                            } else if (FileDetailFragment.this.f97986i == FileDetailModule.NetworkType.NO_INTERNET_CONNECTION) {
                                C38233b.m150372a(FileDetailFragment.this.f97983f, FileDetailFragment.this.f97981d, (long) FileDetailFragment.this.f97980c, FileDetailFragment.this.f97985h, "other");
                                FileDetailFragment.this.mo139753a(FileDownloadState.FAILED);
                            }
                        }
                    }
                });
            }
        };
        this.f98002y = r0;
        this.f97970B.addListenerToNetworkTypeDispatcher(r0);
    }

    /* renamed from: j */
    private void m150270j() {
        if (this.f98003z.isSecret()) {
            this.vBtnFunction.setVisibility(8);
            this.vImageFileIcon.setVisibility(8);
            this.vTextFileName.setVisibility(8);
        }
    }

    /* renamed from: m */
    private boolean m150273m() {
        if (!this.f98003z.isSecret() || !FileDetailModule.f97880b.mo139564a().isFeatureGatingEnable("lark.secret.file_preview")) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private int m150275o() {
        if (this.f97994q) {
            return R.string.Lark_Legacy_FileInstall;
        }
        if (C38279a.m150665a().mo140046a(this.f97981d)) {
            return R.string.Lark_Legacy_Open;
        }
        return R.string.Lark_Legacy_OpenInAnotherApp;
    }

    /* access modifiers changed from: public */
    /* renamed from: t */
    private /* synthetic */ void m150280t() {
        this.vBtnFunction.setVisibility(0);
        this.vImageFileIcon.setVisibility(0);
        this.vTextFileName.setVisibility(0);
    }

    /* access modifiers changed from: public */
    /* renamed from: u */
    private /* synthetic */ Integer m150281u() {
        return Integer.valueOf(this.f97990m.mo139841b(this.f97981d.getKey()));
    }

    /* renamed from: q */
    private void m150277q() {
        Drawable a;
        if (this.f97994q && (a = C26246a.m94976a(C57881t.m224631d(this.f97981d.getFilePath(), this.f97981d.getName()), getContext())) != null) {
            this.vImageFileIcon.setImageDrawable(a);
        }
    }

    /* renamed from: r */
    private boolean m150278r() {
        if (!C38279a.m150665a().mo140046a(this.f97981d)) {
            return false;
        }
        C38279a.m150665a().mo140045a(getContext(), this.f97981d, this.f98003z);
        finish();
        return true;
    }

    /* renamed from: s */
    private void m150279s() {
        boolean z;
        boolean z2 = true;
        if (this.f97986i == FileDetailModule.NetworkType.WIFI) {
            z = true;
        } else {
            z = false;
        }
        if (this.f97981d.getSize() - ((this.f97981d.getSize() * ((long) this.vProgressBar.getProgress())) / 100) > ((long) f97968a)) {
            z2 = false;
        }
        C38233b.m150373a(this.f97983f, this.f97981d, z & z2);
    }

    /* renamed from: d */
    public void mo139760d() {
        DialogC25637f b = new C25639g(getContext()).mo89248g(R.string.Lark_Legacy_Hint).mo89238b(true).mo89254m(R.string.Lark_Legacy_FileHasBeenBurnedCanNotDownload).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmTip, (DialogInterface.OnClickListener) null).mo89233b();
        b.setOnDismissListener(new DialogInterface.OnDismissListener() {
            /* class com.ss.android.lark.filedetail.impl.$$Lambda$FileDetailFragment$YuHUC49cueYN1GfX8o5YyDQXjY */

            public final void onDismiss(DialogInterface dialogInterface) {
                FileDetailFragment.m270539lambda$YuHUC49cueYN1GfX8o5YyDQXjY(FileDetailFragment.this, dialogInterface);
            }
        });
        b.show();
    }

    @Override // com.ss.android.lark.filedetail.impl.detail.AbstractC38253d
    /* renamed from: e */
    public void mo139761e() {
        DialogC25637f b = new C25639g(getContext()).mo89248g(R.string.Lark_Legacy_Hint).mo89238b(true).mo89254m(R.string.Lark_Legacy_FileHasBeenRecalledCanNotDownload).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmTip, (DialogInterface.OnClickListener) null).mo89233b();
        b.setOnDismissListener(new DialogInterface.OnDismissListener() {
            /* class com.ss.android.lark.filedetail.impl.$$Lambda$FileDetailFragment$C8W0l68PWDXQIaLEAALyn60QivE */

            public final void onDismiss(DialogInterface dialogInterface) {
                FileDetailFragment.lambda$C8W0l68PWDXQIaLEAALyn60QivE(FileDetailFragment.this, dialogInterface);
            }
        });
        b.show();
    }

    /* renamed from: com.ss.android.lark.filedetail.impl.FileDetailFragment$3 */
    public static /* synthetic */ class C382183 {

        /* renamed from: a */
        static final /* synthetic */ int[] f98010a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.filedetail.impl.FileDetailFragment.C382183.<clinit>():void");
        }
    }

    public FileDetailFragment() {
        AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
        this.f97970B = a;
        this.f97987j = a.getDownloadDependency();
        this.f97971C = a.getChatDependency();
        this.f97972D = new IPushMessageListener() {
            /* class com.ss.android.lark.filedetail.impl.$$Lambda$M_oiIKv2zilszfdbvmrOfgNHzQ */

            @Override // com.ss.android.lark.filedetail.impl.detail.listener.IPushMessageListener
            public final void onPushMessage(MessageInfo messageInfo) {
                FileDetailFragment.this.mo139752a(messageInfo);
            }
        };
        this.f97973E = null;
        this.f97974F = false;
        this.f97988k = false;
        this.f97989l = new Runnable() {
            /* class com.ss.android.lark.filedetail.impl.$$Lambda$FileDetailFragment$HVBE1Ht15UktwHSl3k6ujtsEXho */

            public final void run() {
                FileDetailFragment.lambda$HVBE1Ht15UktwHSl3k6ujtsEXho(FileDetailFragment.this);
            }
        };
        this.f97975G = false;
        this.f97977I = new Runnable() {
            /* class com.ss.android.lark.filedetail.impl.$$Lambda$FileDetailFragment$8G3w8DzerthfIkXnN3e0Tym73V8 */

            public final void run() {
                FileDetailFragment.lambda$8G3w8DzerthfIkXnN3e0Tym73V8(FileDetailFragment.this);
            }
        };
    }

    /* renamed from: n */
    private void m150274n() {
        String str;
        Message.SourceType sourceType;
        boolean z;
        Message message = this.f97991n;
        if (message != null) {
            str = message.getSourceId();
        } else {
            str = "";
        }
        Message message2 = this.f97991n;
        if (message2 != null) {
            sourceType = message2.getSourceType();
        } else {
            sourceType = null;
        }
        String a = DownloadFileUtils.m150309a(this.mContext, this.f97981d.getName());
        C38212a.C38214a a2 = C38212a.m150238a();
        int i = 0;
        if (this.f97991n != null) {
            z = true;
        } else {
            z = false;
        }
        C38212a.C38214a b = a2.mo139732a(z).mo139736c(this.f97981d.getKey()).mo139731a(this.f97982e).mo139737d(a).mo139730a(this.f97981d.getSize()).mo139734b(str);
        if (sourceType != null) {
            i = sourceType.getNumber();
        }
        this.f98000w.mo139619a(b.mo139729a(i).mo139733a());
    }

    /* renamed from: p */
    private void m150276p() {
        this.f97981d.setFileState(FileState.DOWNLOAD);
        this.f97986i = FileDetailModule.NetworkType.Companion.mo139563a(this.f98000w.mo139618a(getContext()));
        if (TextUtils.isEmpty(this.f97981d.getFilePath()) || !C57881t.m224633e(this.f97981d.getFilePath(), this.f97981d.getName())) {
            C57865c.m224574a(new C57865c.AbstractC57873d<String>() {
                /* class com.ss.android.lark.filedetail.impl.FileDetailFragment.C382259 */

                /* renamed from: a */
                public String produce() {
                    return FileDetailFragment.this.f97987j.mo139614b(FileDetailFragment.this.f97981d.getKey());
                }
            }, new C57865c.AbstractC57871b<String>() {
                /* class com.ss.android.lark.filedetail.impl.FileDetailFragment.AnonymousClass10 */

                /* renamed from: a */
                public void consume(String str) {
                    FileDownloadState fileDownloadState;
                    if (C57881t.m224633e(str, FileDetailFragment.this.f97981d.getName())) {
                        FileDetailFragment.this.f97981d.setFilePath(str);
                        if (FileDetailFragment.this.f97986i == FileDetailModule.NetworkType.NO_INTERNET_CONNECTION) {
                            FileDetailFragment.this.mo139757b();
                        } else {
                            FileDetailFragment.this.mo139746a();
                        }
                    } else if (FileDetailFragment.this.f97984g) {
                        FileDetailFragment.this.mo139753a(FileDownloadState.PAUSE);
                    } else if (FileDetailFragment.this.f97986i == FileDetailModule.NetworkType.WIFI) {
                        FileDetailFragment.this.mo139753a(FileDownloadState.DOWNLOADING);
                    } else if (FileDetailFragment.this.f97986i == FileDetailModule.NetworkType.CELLULAR_DATA_NETWORK) {
                        if (FileDetailFragment.this.f97981d.getSize() - ((FileDetailFragment.this.f97981d.getSize() * ((long) FileDetailFragment.this.vProgressBar.getProgress())) / 100) <= ((long) FileDetailFragment.f97968a)) {
                            FileDetailFragment.this.mo139753a(FileDownloadState.DOWNLOADING);
                            return;
                        }
                        FileDetailFragment fileDetailFragment = FileDetailFragment.this;
                        if (fileDetailFragment.f97985h != FileDownloadState.NORMAL) {
                            fileDownloadState = FileDownloadState.PAUSE;
                        } else {
                            fileDownloadState = FileDownloadState.NORMAL;
                        }
                        fileDetailFragment.mo139753a(fileDownloadState);
                    } else if (FileDetailFragment.this.f97986i == FileDetailModule.NetworkType.NO_INTERNET_CONNECTION) {
                        FileDetailFragment fileDetailFragment2 = FileDetailFragment.this;
                        fileDetailFragment2.mo139753a(fileDetailFragment2.f97985h);
                    }
                }
            });
        } else {
            mo139746a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        UICallbackExecutor.removeCallbacks(this.f97977I);
        LKUIStatus lKUIStatus = this.f97976H;
        if (lKUIStatus != null && lKUIStatus.mo89851h()) {
            this.f97976H.mo89847d();
        }
        EventBus.getDefault().unregister(this);
        AbstractC29625q qVar = this.f97969A;
        if (qVar != null && !this.f97974F) {
            this.f97970B.removeListenerToDriveSaveStateEventPush(qVar);
        }
        C38243c cVar = this.f97990m;
        if (cVar != null) {
            cVar.mo139830a();
        }
        if (!(this.f97991n == null || this.f97974F || this.f97980c == 6)) {
            this.f97970B.getPushDependency().mo139629b(String.valueOf(hashCode()), this.f97991n.getChatId(), this.f97972D);
        }
        AbstractC38215b bVar = this.f98002y;
        if (bVar != null) {
            this.f97970B.removeListenerToNetworkTypeDispatcher(bVar);
        }
        Disposable disposable = this.f97973E;
        if (disposable != null && !disposable.isDisposed()) {
            this.f97973E.dispose();
        }
    }

    /* renamed from: i */
    private void m150269i() {
        int i;
        this.f97976H = new LKUIStatus.C25680a(this.mRootView).mo89859a();
        if (!DesktopUtil.m144301a((Context) getActivity())) {
            this.vTitleBar.setTitle(this.f97993p);
        }
        if (m150271k()) {
            this.vTitleBar.addAction(new IActionTitlebar.C57573a(R.drawable.titlebar_more_bg_selector) {
                /* class com.ss.android.lark.filedetail.impl.FileDetailFragment.C382215 */

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    super.performAction(view);
                    FileDetailFragment.this.mo139749a(view);
                }
            });
        }
        TextView textView = this.vBtnFunction;
        if (m150272l()) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        this.vTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.filedetail.impl.FileDetailFragment.View$OnClickListenerC382226 */

            public void onClick(View view) {
                FileDetailFragment.this.finish();
            }
        });
        this.f97973E = C57865c.m224574a(new C57865c.AbstractC57873d() {
            /* class com.ss.android.lark.filedetail.impl.$$Lambda$FileDetailFragment$5aizAf9NmySnMeuiMdfDH8sws0 */

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return FileDetailFragment.m270537lambda$5aizAf9NmySnMeuiMdfDH8sws0(FileDetailFragment.this);
            }
        }, new C57865c.AbstractC57871b() {
            /* class com.ss.android.lark.filedetail.impl.$$Lambda$FileDetailFragment$N9QiC8cgBNFJl80uGGLarHfhDI */

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public final void consume(Object obj) {
                FileDetailFragment.m270538lambda$N9QiC8cgBNFJl80uGGLarHfhDI(FileDetailFragment.this, (Integer) obj);
            }
        });
        this.vTextFileName.setText(this.f97993p);
        this.vImageFileIcon.setImageResource(C57881t.m224626c(this.f97981d.getMime(), this.f97981d.getName()));
        this.mCloseIv.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.filedetail.impl.FileDetailFragment.View$OnClickListenerC382237 */

            public void onClick(View view) {
                if (FileDetailFragment.this.f97985h != FileDownloadState.DONE) {
                    FileDetailFragment.this.mo139753a(FileDownloadState.STOP);
                    C38233b.m150369a(FileDetailFragment.this.f97983f, FileDetailFragment.this.f97981d, FileDetailFragment.this.f97980c);
                }
            }
        });
        this.vBtnFunction.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.filedetail.impl.FileDetailFragment.View$OnClickListenerC382248 */

            public void onClick(View view) {
                if (C38303c.m150714a()) {
                    Log.m165383e("FileDetailFragment", "[cipher] FileDetailFragment: Cipher is ON, download is forbidden!");
                    LKUIToast.enableToast();
                    LKUIToast.show(LarkContext.getApplication(), (int) R.string.Lark_Core_SecuritySettingKAToast);
                } else if (FileDetailFragment.this.f97985h == FileDownloadState.DONE) {
                    FileDetailFragment.this.mo139759c();
                } else if (FileDetailFragment.this.f97985h == FileDownloadState.DOWNLOADING) {
                    C38233b.m150372a(FileDetailFragment.this.f97983f, FileDetailFragment.this.f97981d, (long) FileDetailFragment.this.f97980c, FileDetailFragment.this.f97985h, "click_pause_download");
                    FileDetailFragment.this.f97984g = true;
                    FileDetailFragment.this.mo139753a(FileDownloadState.PAUSE);
                } else if (FileDetailFragment.this.f97985h != FileDownloadState.BURNED && FileDetailFragment.this.f97985h != FileDownloadState.RECALL) {
                    if (FileDetailFragment.this.f97985h == FileDownloadState.NORMAL || FileDetailFragment.this.f97985h == FileDownloadState.STOP) {
                        C38233b.m150371a(FileDetailFragment.this.f97983f, FileDetailFragment.this.f97981d, (long) FileDetailFragment.this.f97980c);
                    } else if (FileDetailFragment.this.f97985h == FileDownloadState.PAUSE) {
                        C38233b.m150370a(FileDetailFragment.this.f97983f, FileDetailFragment.this.f97981d, FileDetailFragment.this.f97980c, "click_resume_download");
                    } else if (FileDetailFragment.this.f97985h == FileDownloadState.FAILED) {
                        C38233b.m150370a(FileDetailFragment.this.f97983f, FileDetailFragment.this.f97981d, FileDetailFragment.this.f97980c, "click_retry_download");
                    }
                    FileDetailFragment.this.mo139753a(FileDownloadState.DOWNLOADING);
                }
            }
        });
        m150270j();
        m150265b(!this.f97996s);
    }

    /* renamed from: c */
    public void mo139759c() {
        String str;
        if (this.f97981d.getFileState() == FileState.DONE) {
            DriveHitPoint.f98022a.mo139775b(this.f97981d.getMime());
            if (!C38279a.m150665a().mo140046a(this.f97981d)) {
                Message message = this.f97991n;
                if (message != null) {
                    str = message.getChatId();
                } else {
                    str = this.f97983f;
                }
                C38233b.m150368a(this.f97981d, str, "button");
            }
            if (this.f97999v) {
                FileHitPoint.f98024a.mo139780b(this.f97998u);
            }
            Message message2 = this.f97991n;
            if (message2 != null) {
                this.f97990m.mo139834a(message2, this.f97981d, getContext(), this.f98003z);
            } else {
                this.f97990m.mo139835a(this.f97981d, this.f97982e, getContext(), this.f98003z);
            }
        } else {
            if (C51327f.m199081a(getContext(), "android.permission.WRITE_EXTERNAL_STORAGE") || !C51327f.f127826a) {
                Message message3 = this.f97991n;
                if (message3 != null) {
                    this.f97990m.mo139834a(message3, this.f97981d, getContext(), this.f98003z);
                } else {
                    this.f97990m.mo139835a(this.f97981d, this.f97982e, getContext(), this.f98003z);
                }
            } else {
                Message message4 = this.f97991n;
                if (message4 != null) {
                    this.f97990m.mo139843b(message4, this.f97981d, getContext(), this.f98003z);
                } else {
                    this.f97990m.mo139844b(this.f97981d, this.f97982e, getContext(), this.f98003z);
                }
            }
            if (this.f97999v) {
                FileHitPoint.f98024a.mo139777a(this.f97998u);
            }
        }
    }

    /* renamed from: h */
    private boolean m150268h() {
        FileDetailLaunchParams fileDetailLaunchParams;
        String str;
        Message message;
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments == null || (fileDetailLaunchParams = (FileDetailLaunchParams) arguments.getSerializable("extra.launch.params")) == null) {
            return false;
        }
        this.f97980c = (int) fileDetailLaunchParams.getFrom();
        this.f97991n = fileDetailLaunchParams.getMessage();
        this.f97992o = fileDetailLaunchParams.getFavoriteMessage();
        if (this.f97991n == null) {
            this.f97991n = this.f97971C.mo139603b(fileDetailLaunchParams.getMessageId());
        }
        Message message2 = this.f97991n;
        if (message2 != null && message2.getType() != Message.Type.FILE && this.f97991n.getType() != Message.Type.FOLDER) {
            return false;
        }
        this.f97981d = fileDetailLaunchParams.getFileContent();
        this.f97982e = fileDetailLaunchParams.getMessageId();
        if (this.f97981d == null && (message = this.f97991n) != null && message.getType() == Message.Type.FILE) {
            this.f97981d = (FileContent) this.f97991n.getContent();
        }
        FileContent fileContent = this.f97981d;
        if (fileContent != null && !TextUtils.isEmpty(fileContent.getName())) {
            this.f97974F = fileDetailLaunchParams.isFromFolderManage();
            OpenFileInfo openFileInfo = new OpenFileInfo();
            this.f98001x = openFileInfo;
            openFileInfo.mFileContent = this.f97981d;
            this.f98001x.mMessageId = this.f97982e;
            this.f98001x.mMenuFlag = fileDetailLaunchParams.getMenuFlag();
            m150259a(this.f98001x);
            this.f98001x.mFavoriteMessage = this.f97992o;
            this.f98001x.threadId = fileDetailLaunchParams.getThreadId();
            this.f98001x.isFromFolderManage = fileDetailLaunchParams.isFromFolderManage();
            OpenFileInfo openFileInfo2 = this.f98001x;
            int jumpPosition = fileDetailLaunchParams.getJumpPosition();
            openFileInfo2.mJumpPosition = jumpPosition;
            this.f97995r = jumpPosition;
            this.f97996s = fileDetailLaunchParams.isSecret();
            this.f97997t = fileDetailLaunchParams.getShowMenu();
            OpenFileInfo openFileInfo3 = this.f98001x;
            String chatId = fileDetailLaunchParams.getChatId();
            openFileInfo3.mChatId = chatId;
            this.f97983f = chatId;
            if (fileDetailLaunchParams.isSearch()) {
                str = "y";
            } else {
                str = C64034n.f161683a;
            }
            this.f97998u = str;
            this.f97999v = fileDetailLaunchParams.getNeedHitPoint();
            this.f98001x.mIsSecret = this.f97996s;
            this.f98003z = OpenFileParams.Companion.mo140044a().mo140035a(this.f97981d).mo140036a(this.f97982e).mo140040b(this.f97983f).mo140033a(this.f97995r).mo140037a(this.f97996s).mo140034a(this.f98001x.mMenuFlag).mo140042c(fileDetailLaunchParams.getMergeMsgChatId()).mo140039b(fileDetailLaunchParams.getDownloadFileScene()).mo140038a();
            String name = this.f97981d.getName();
            this.f97993p = name;
            z = true;
            if (name != null && name.endsWith(".apk")) {
                this.f97994q = true;
            }
            C38243c cVar = new C38243c(this.f97996s);
            this.f97990m = cVar;
            cVar.mo139837a(this);
        }
        return z;
    }

    /* renamed from: a */
    public void mo139746a() {
        Message message = this.f97991n;
        if (message == null) {
            mo139757b();
        } else {
            m150262a(this.f97982e, message.getSourceId(), this.f97991n.getSourceType().getNumber(), new IGetDataCallback<com.ss.android.lark.filedetail.dto.FileState>() {
                /* class com.ss.android.lark.filedetail.impl.FileDetailFragment.AnonymousClass11 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165397w("FileDetailFragment", errorResult.getDebugMsg());
                    LKUIToast.cancelLoading();
                    FileDetailFragment.this.f97988k = true;
                    FileDetailFragment.this.mo139757b();
                }

                /* renamed from: a */
                public void onSuccess(com.ss.android.lark.filedetail.dto.FileState fileState) {
                    Log.m165389i("FileDetailFragment", "check file state: " + fileState.name());
                    UICallbackExecutor.removeCallbacks(FileDetailFragment.this.f97989l);
                    LKUIToast.cancelLoading();
                    FileDetailFragment.this.f97988k = true;
                    if (fileState == com.ss.android.lark.filedetail.dto.FileState.RECOVERABLE) {
                        FileDetailFragment.this.mo139755a(false);
                    } else if (fileState == com.ss.android.lark.filedetail.dto.FileState.UNRECOVERABLE) {
                        FileDetailFragment.this.mo139755a(true);
                    } else if (fileState == com.ss.android.lark.filedetail.dto.FileState.DELETED) {
                        FileDetailFragment.this.mo139761e();
                    } else {
                        FileDetailFragment.this.mo139757b();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m150257a(DialogInterface dialogInterface) {
        finish();
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m150264b(DialogInterface dialogInterface) {
        finish();
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m150266c(DialogInterface dialogInterface) {
        finish();
    }

    /* renamed from: a */
    public void mo139747a(int i) {
        FileContent fileContent = this.f97981d;
        if (fileContent != null) {
            fileContent.setSaveToDrive(i);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof AbstractC38226a) {
            this.f97978J = (AbstractC38226a) context;
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m150260a(Integer num) {
        int i;
        ProgressBar progressBar = this.vProgressBar;
        if (this.f97985h == FileDownloadState.DONE) {
            i = 100;
        } else {
            i = num.intValue();
        }
        progressBar.setProgress(i);
    }

    /* renamed from: b */
    private void m150263b(int i) {
        if (this.f98003z.isSecret()) {
            UICallbackExecutor.executeDelayed(new Runnable() {
                /* class com.ss.android.lark.filedetail.impl.$$Lambda$FileDetailFragment$iU3YUwoGs0ZfznW_9VTAvAyacYs */

                public final void run() {
                    FileDetailFragment.lambda$iU3YUwoGs0ZfznW_9VTAvAyacYs(FileDetailFragment.this);
                }
            }, (long) i);
        }
    }

    /* renamed from: b */
    private void m150265b(boolean z) {
        if (getActivity() != null) {
            Window window = getActivity().getWindow();
            if (z) {
                window.clearFlags(8192);
            } else {
                window.setFlags(8192, 8192);
            }
        }
    }

    /* renamed from: a */
    private void m150259a(OpenFileInfo openFileInfo) {
        int i = this.f97980c;
        if (i == 5) {
            openFileInfo.mSourceType = Message.SourceType.TYPE_FROM_CHAT_PIN;
            openFileInfo.mSourceId = this.f97982e;
        } else if (i != 6) {
            if (i != 7) {
                Message message = this.f97991n;
                if (message != null) {
                    openFileInfo.mSourceType = message.getSourceType();
                    openFileInfo.mSourceId = this.f97991n.getSourceId();
                    return;
                }
                return;
            }
            openFileInfo.mSourceType = Message.SourceType.TYPE_FROM_TODO_REFER_RESOURCE;
            openFileInfo.mSourceId = this.f97991n.getSourceId();
        } else if (this.f97992o != null) {
            openFileInfo.mSourceType = Message.SourceType.TYPE_FROM_FAVORITE;
            openFileInfo.mSourceId = this.f97992o.getId();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ButterKnife.bind(this, getView());
        this.f97979b = this.f97970B.getDriveDependency();
        this.f98000w = this.f97970B.getDownloadFileMonitorDependency();
        this.f97969A = new AbstractC29625q() {
            /* class com.ss.android.lark.filedetail.impl.FileDetailFragment.C382161 */

            @Override // com.ss.android.lark.biz.im.api.AbstractC29625q
            /* renamed from: a */
            public void mo106747a(String str, int i) {
                FileDetailFragment.this.mo139758b(str, i);
            }
        };
        if (!m150268h()) {
            finish();
            return;
        }
        m150269i();
        m150267g();
        EventBus.getDefault().register(this);
        if (!this.f97974F) {
            this.f97970B.addListenerToDriveSaveStateEventPush(this.f97969A);
        }
        if (!(this.f97991n == null || this.f97974F || this.f97980c == 6)) {
            this.f97970B.getPushDependency().mo139628a(String.valueOf(hashCode()), this.f97991n.getChatId(), this.f97972D);
        }
        if (this.f97980c == 1) {
            m150279s();
        }
    }

    /* renamed from: a */
    private void m150261a(String str) {
        String string = UIHelper.getString(R.string.Lark_Legacy_OpenInAnotherApp);
        if (string != null && string.equals(UIUtils.getString(getContext(), m150275o())) && !this.f97990m.mo139840a(str)) {
            m150258a(this.vBtnFunction, R.drawable.file_download_function_btn_disable_bg_selector, R.color.static_white, string);
        }
    }

    /* renamed from: a */
    public void mo139754a(final String str, final int i) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.filedetail.impl.FileDetailFragment.RunnableC382172 */

            public void run() {
                if (str.equals(FileDetailFragment.this.f97982e)) {
                    FileDetailFragment.this.mo139747a(i);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo139758b(String str, int i) {
        String str2;
        FileContent fileContent;
        String str3;
        if (str != null && (str2 = this.f97982e) != null && TextUtils.equals(str, str2)) {
            Message message = this.f97991n;
            if (message == null || message.getType() != Message.Type.FILE) {
                fileContent = this.f97981d;
            } else {
                fileContent = (FileContent) this.f97991n.getContent();
            }
            if (i == 0) {
                str3 = "success";
            } else {
                str3 = "fail";
            }
            DriveHitPoint.f98022a.mo139773a(fileContent.getMime(), str3, fileContent.getSize());
            mo139754a(str, i);
        }
    }

    @Override // com.ss.android.lark.filedetail.impl.detail.AbstractC38253d
    /* renamed from: a */
    public void mo139748a(int i, int i2) {
        String str;
        if (getContext() != null) {
            this.vProgressBar.setMax(i2);
            this.vProgressBar.setProgress(i);
            if (this.f97991n == null || !this.f97981d.isFromDrive()) {
                str = "local";
            } else {
                str = ShareHitPoint.f121868c;
            }
            if (C57881t.m224633e(this.f97981d.getFilePath(), this.f97981d.getName())) {
                mo139753a(FileDownloadState.DONE);
                DriveHitPoint.f98022a.mo139774a(this.f97981d.getMime(), "success", str, this.f97981d.getSize());
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.activity_file_detail, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            boolean z = true;
            if (i == 1) {
                C38243c cVar = this.f97990m;
                if (this.f97991n != null) {
                    z = false;
                }
                cVar.mo139839a(z);
            }
        }
    }

    /* renamed from: a */
    private void m150258a(TextView textView, int i, int i2, String str) {
        if (textView != this.vBtnFunction) {
            UIUtils.show(textView);
        } else if (this.f97997t) {
            UIUtils.show(textView);
        }
        textView.setText(str);
        textView.setTextColor(UIUtils.getColor(getContext(), i2));
        textView.setBackgroundResource(i);
    }

    /* renamed from: a */
    private void m150262a(String str, String str2, int i, IGetDataCallback<com.ss.android.lark.filedetail.dto.FileState> iGetDataCallback) {
        UICallbackExecutor.executeDelayed(this.f97989l, 300);
        if (this.f97974F) {
            iGetDataCallback.onSuccess(com.ss.android.lark.filedetail.dto.FileState.NORMAL);
        } else {
            this.f97987j.mo139609a(str, str2, i, this.f98003z.getDownloadFileScene(), getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
        }
    }
}
