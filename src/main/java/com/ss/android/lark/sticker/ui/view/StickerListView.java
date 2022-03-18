package com.ss.android.lark.sticker.ui.view;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.C25644o;
import com.larksuite.component.ui.dialog.LKUIListItemData;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.ui.StableGridLayoutManager;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.sticker.C54996a;
import com.ss.android.lark.sticker.dependency.IStickerModuleDependency;
import com.ss.android.lark.sticker.dto.UISticker;
import com.ss.android.lark.sticker.ui.C55079a;
import com.ss.android.lark.sticker.ui.adapter.StickerGridAdapter;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.dialog.CommonLoadingDialog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StickerListView implements C55079a.AbstractC55082b {

    /* renamed from: a */
    public StickerGridAdapter f136297a;

    /* renamed from: b */
    public AbstractC55240a f136298b;

    /* renamed from: c */
    public C55079a.AbstractC55082b.AbstractC55083a f136299c;

    /* renamed from: d */
    public Activity f136300d;

    /* renamed from: e */
    public IStickerModuleDependency.AbstractC55072c f136301e = C54996a.m213619a().mo144102f();

    /* renamed from: f */
    private CommonLoadingDialog f136302f;
    @BindView(6674)
    TextView mDeleteTV;
    @BindView(6511)
    View mEmptyBgView;
    @BindView(6833)
    RecyclerView mGridView;
    @BindView(7224)
    TextView mPinTV;
    @BindView(7640)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.sticker.ui.view.StickerListView$a */
    public interface AbstractC55240a {
        /* renamed from: a */
        void mo188004a();

        /* renamed from: a */
        void mo188005a(StickerListView stickerListView);

        /* renamed from: b */
        void mo188006b();
    }

    /* renamed from: f */
    private void m214238f() {
        this.f136302f = new CommonLoadingDialog();
    }

    @Override // com.ss.android.lark.sticker.ui.C55079a.AbstractC55082b
    /* renamed from: a */
    public void mo187976a() {
        this.mGridView.scrollToPosition(0);
    }

    @Override // com.ss.android.lark.sticker.ui.C55079a.AbstractC55082b
    /* renamed from: d */
    public void mo187983d() {
        this.f136302f.dismiss();
    }

    /* renamed from: e */
    private void m214237e() {
        m214241i();
        m214239g();
        m214240h();
        m214238f();
    }

    @Override // com.ss.android.lark.sticker.ui.C55079a.AbstractC55082b
    /* renamed from: b */
    public void mo187981b() {
        this.mGridView.scrollToPosition(this.f136297a.getItemCount() - 1);
    }

    @Override // com.ss.android.lark.sticker.ui.C55079a.AbstractC55082b
    /* renamed from: c */
    public void mo187982c() {
        if (UIUtils.isActivityRunning(this.f136300d)) {
            this.f136302f.show(this.f136300d);
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        AbstractC55240a aVar = this.f136298b;
        if (aVar != null) {
            aVar.mo188005a(this);
        }
        m214237e();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        m214242j();
        this.f136298b = null;
        this.f136299c = null;
    }

    /* renamed from: h */
    private void m214240h() {
        this.mPinTV.setEnabled(false);
        this.mDeleteTV.setEnabled(false);
        this.mPinTV.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.sticker.ui.view.StickerListView.View$OnClickListenerC552302 */

            public void onClick(View view) {
                StickerListView.this.f136299c.mo187984a();
            }
        });
        this.mDeleteTV.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.sticker.ui.view.StickerListView.View$OnClickListenerC552313 */

            public void onClick(View view) {
                ((C25644o) ((C25644o) ((C25644o) new C25644o(StickerListView.this.f136300d).mo89205a(new ArrayList<LKUIListItemData>() {
                    /* class com.ss.android.lark.sticker.ui.view.StickerListView.View$OnClickListenerC552313.C552332 */

                    {
                        add(new LKUIListItemData(UIHelper.getString(R.string.Lark_Legacy_Delete)) {
                            /* class com.ss.android.lark.sticker.ui.view.StickerListView.View$OnClickListenerC552313.C552332.C552341 */

                            {
                                mo89289b(R.color.function_danger_500);
                            }
                        });
                        add(new LKUIListItemData(UIHelper.getString(R.string.Lark_Legacy_Cancel)));
                    }
                })).mo89237b(UIHelper.getString(R.string.Lark_Legacy_UnrecoverableAfterRemoved))).mo89290y(0).mo89202a(new DialogInterface.OnClickListener() {
                    /* class com.ss.android.lark.sticker.ui.view.StickerListView.View$OnClickListenerC552313.DialogInterface$OnClickListenerC552321 */

                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (i == 0) {
                            StickerListView.this.f136299c.mo187987b();
                        }
                        dialogInterface.dismiss();
                    }
                })).mo89239c();
            }
        });
    }

    /* renamed from: j */
    private void m214242j() {
        if (this.f136297a != null) {
            this.mGridView.setItemAnimator(null);
            this.mGridView.setAdapter(null);
            this.mGridView = null;
        }
    }

    /* renamed from: g */
    private void m214239g() {
        this.mEmptyBgView.setVisibility(8);
        this.mGridView.setVisibility(0);
        this.mGridView.setLayoutManager(new StableGridLayoutManager(this.f136300d, 5));
        this.mGridView.addItemDecoration(new C55241a(this.f136300d));
        StickerGridAdapter stickerGridAdapter = new StickerGridAdapter(this.f136300d);
        this.f136297a = stickerGridAdapter;
        this.mGridView.setAdapter(stickerGridAdapter);
        this.f136297a.mo187994a(new StickerGridAdapter.AbstractC55089b() {
            /* class com.ss.android.lark.sticker.ui.view.StickerListView.C552291 */

            @Override // com.ss.android.lark.sticker.ui.adapter.StickerGridAdapter.AbstractC55089b
            /* renamed from: a */
            public void mo188002a(int i) {
                StickerListView.this.f136299c.mo187985a(StickerListView.this.f136297a.mo187996b(), StickerListView.this.f136297a.mo187993a());
            }
        });
    }

    /* renamed from: i */
    private void m214241i() {
        this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
        this.mTitleBar.removeAllActions();
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.sticker.ui.view.StickerListView.View$OnClickListenerC552354 */

            public void onClick(View view) {
                StickerListView.this.f136299c.mo187988c();
                StickerListView.this.f136298b.mo188006b();
            }
        });
        this.mTitleBar.addAction(new IActionTitlebar.TextAction(this.f136300d.getResources().getText(R.string.Lark_Legacy_ActionAdd).toString(), R.color.function_info_500) {
            /* class com.ss.android.lark.sticker.ui.view.StickerListView.C552365 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                super.performAction(view);
                StickerListView.this.f136298b.mo188004a();
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(C55079a.AbstractC55082b.AbstractC55083a aVar) {
        this.f136299c = aVar;
    }

    @Override // com.ss.android.lark.sticker.ui.C55079a.AbstractC55082b
    /* renamed from: a */
    public void mo187978a(final ErrorResult errorResult) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.sticker.ui.view.StickerListView.RunnableC552387 */

            public void run() {
                if (errorResult.getErrorCode() == 1) {
                    LKUIToast.show(StickerListView.this.f136300d, UIHelper.mustacheFormat((int) R.string.Lark_Legacy_StickerFileTooLargeTip, "file_name", errorResult.getErrorMsg()), 3500);
                } else if (errorResult.getErrorCode() == StickerListView.this.f136301e.mo144117a()) {
                    StickerListView.this.f136301e.mo144118a(StickerListView.this.f136300d, errorResult.getDisplayMsg(StickerListView.this.f136301e.mo144119b()));
                } else {
                    new C25639g(StickerListView.this.f136300d).mo89237b(UIUtils.getString(StickerListView.this.f136300d, R.string.Lark_Legacy_Hint)).mo89238b(true).mo89242c(UIHelper.getString(R.string.Lark_Legacy_FailedStatusWarning)).mo89225a(R.id.lkui_dialog_btn_right, UIUtils.getString(StickerListView.this.f136300d, R.string.Lark_Legacy_ConfirmTip), (DialogInterface.OnClickListener) null).mo89233b().show();
                }
            }
        });
    }

    @Override // com.ss.android.lark.sticker.ui.C55079a.AbstractC55082b
    /* renamed from: a */
    public void mo187979a(final List<UISticker> list) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.sticker.ui.view.StickerListView.RunnableC552376 */

            public void run() {
                StickerListView.this.f136297a.mo187998b(list);
            }
        });
    }

    @Override // com.ss.android.lark.sticker.ui.C55079a.AbstractC55082b
    /* renamed from: a */
    public void mo187977a(int i) {
        if (i == 0) {
            this.mDeleteTV.setEnabled(false);
            this.mPinTV.setEnabled(false);
            this.mDeleteTV.setText(this.f136300d.getResources().getText(R.string.Lark_Legacy_Delete));
        } else if (i > 0) {
            this.mDeleteTV.setEnabled(true);
            this.mPinTV.setEnabled(true);
            TextView textView = this.mDeleteTV;
            textView.setText(((Object) this.f136300d.getResources().getText(R.string.Lark_Legacy_Delete)) + "(" + i + ")");
        }
    }

    public StickerListView(AbstractC55240a aVar, Activity activity) {
        this.f136298b = aVar;
        this.f136300d = activity;
    }

    @Override // com.ss.android.lark.sticker.ui.C55079a.AbstractC55082b
    /* renamed from: a */
    public void mo187980a(final List<String> list, int i, final boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("total_number", Integer.toString(i));
        hashMap.put("failed_number", Integer.toString(list.size()));
        new C25639g(this.f136300d).mo89237b(UIUtils.getString(this.f136300d, R.string.Lark_Legacy_Hint)).mo89238b(true).mo89242c(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_StickerUploadFailTip, hashMap)).mo89225a(R.id.lkui_dialog_btn_right, UIHelper.mustacheFormat((int) R.string.Lark_Legacy_StickerUploadRetryCount, "retry_number", Integer.toString(list.size())), new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.sticker.ui.view.StickerListView.DialogInterface$OnClickListenerC552398 */

            public void onClick(DialogInterface dialogInterface, int i) {
                StickerListView.this.f136299c.mo187986a(list, z);
            }
        }).mo89225a(R.id.lkui_dialog_btn_left, UIUtils.getString(this.f136300d, R.string.Lark_Legacy_Cancel), (DialogInterface.OnClickListener) null).mo89233b().show();
    }
}
