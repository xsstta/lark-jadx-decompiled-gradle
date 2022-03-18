package com.ss.android.lark.setting.page.v1.mvp;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.C25644o;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.page.statistics.SettingHitPoint;
import com.ss.android.lark.setting.page.v1.mvp.AbstractC54566a;
import com.ss.android.lark.setting.page.v1.p2672a.C54554a;
import com.ss.android.lark.setting.page.v1.view.NotificationEntranceView;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.C57886v;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.dialog.CommonLoadingDialog;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

public class MineSystemSettingView implements AbstractC54566a.AbstractC54569b {

    /* renamed from: a */
    public AbstractC54565a f134856a;

    /* renamed from: b */
    public AbstractC54566a.AbstractC54569b.AbstractC54570a f134857b;

    /* renamed from: c */
    private final Activity f134858c;

    /* renamed from: d */
    private CommonLoadingDialog f134859d;

    /* renamed from: e */
    private Disposable f134860e;

    /* renamed from: f */
    private View f134861f;
    View mAboutLarkRL;
    TextView mAboutLarkTV;
    View mAccountAndSecurityLayout;
    TextView mAppVersionSettingTV;
    View mInternalSettings;
    public View mLogoutBtn;
    ImageView mNewVersionTipIV;
    NotificationEntranceView mNotificationEntrance;
    View mPrivateSetting;
    View mSettingCalendar;
    View mSettingEmail;
    View mSettingGeneral;
    View mSettingMoments;
    TextView mSettingMomentsTitle;
    View mSettingTodo;
    View mSettingVideoChat;
    View mSettingWrittenLanguageLayout;
    public CommonTitleBar mTitleBar;
    TextView mTvAccountAndSecurity;

    /* renamed from: com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView$a */
    public interface AbstractC54565a {
        /* renamed from: a */
        void mo186445a();

        /* renamed from: a */
        void mo186446a(MineSystemSettingView mineSystemSettingView);

        /* renamed from: a */
        void mo186447a(String str);

        /* renamed from: b */
        void mo186448b();

        /* renamed from: c */
        void mo186449c();

        /* renamed from: d */
        void mo186450d();

        /* renamed from: e */
        void mo186451e();

        /* renamed from: f */
        void mo186452f();

        /* renamed from: g */
        void mo186453g();

        /* renamed from: h */
        void mo186454h();

        /* renamed from: i */
        void mo186455i();

        /* renamed from: j */
        void mo186456j();

        /* renamed from: k */
        void mo186457k();

        /* renamed from: l */
        void mo186458l();

        /* renamed from: m */
        void mo186459m();

        /* renamed from: n */
        void mo186460n();

        /* renamed from: o */
        void mo186461o();
    }

    /* renamed from: i */
    private void m211662i() {
        this.f134859d = new CommonLoadingDialog();
    }

    @Override // com.ss.android.lark.setting.page.v1.mvp.AbstractC54566a.AbstractC54569b
    /* renamed from: a */
    public void mo186428a() {
        AbstractC54565a aVar = this.f134856a;
        if (aVar != null) {
            aVar.mo186450d();
        }
    }

    @Override // com.ss.android.lark.setting.page.v1.mvp.AbstractC54566a.AbstractC54569b
    /* renamed from: b */
    public void mo186433b() {
        this.mLogoutBtn.setEnabled(true);
    }

    @Override // com.ss.android.lark.setting.page.v1.mvp.AbstractC54566a.AbstractC54569b
    /* renamed from: d */
    public void mo186436d() {
        this.f134856a.mo186459m();
    }

    @Override // com.ss.android.lark.setting.page.v1.mvp.AbstractC54566a.AbstractC54569b
    /* renamed from: e */
    public void mo186437e() {
        AbstractC54565a aVar = this.f134856a;
        if (aVar != null) {
            aVar.mo186460n();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f134856a.mo186446a(this);
        m211661h();
        m211662i();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        Disposable disposable = this.f134860e;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f134857b = null;
        this.f134856a = null;
    }

    @Override // com.ss.android.lark.setting.page.v1.mvp.AbstractC54566a.AbstractC54569b
    /* renamed from: c */
    public void mo186435c() {
        m211659b(this.f134859d);
        LKUIToast.show(this.f134858c, "logout fail");
        this.mLogoutBtn.setEnabled(true);
    }

    /* renamed from: j */
    private void m211663j() {
        this.mAppVersionSettingTV.setText(String.format("%s %s", UIHelper.getString(R.string.Lark_NewSettings_AboutFeishuCurrentVersionMobile), "V" + C57824f.m224459a(this.f134858c)));
    }

    @Override // com.ss.android.lark.setting.page.v1.mvp.AbstractC54566a.AbstractC54569b
    /* renamed from: f */
    public void mo186438f() {
        this.mLogoutBtn.setEnabled(false);
        m211656a(this.f134859d);
        this.f134860e = Observable.timer(10000, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            /* class com.ss.android.lark.setting.page.v1.mvp.$$Lambda$MineSystemSettingView$hw2_GkNIGUyLcMKssqLm19iceFs */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MineSystemSettingView.lambda$hw2_GkNIGUyLcMKssqLm19iceFs(MineSystemSettingView.this, (Long) obj);
            }
        });
    }

    /* renamed from: g */
    public void mo186439g() {
        String string = this.f134858c.getString(R.string.Lark_Settings_LogOut);
        if (DesktopUtil.m144301a((Context) this.f134858c)) {
            C25639g gVar = new C25639g(this.f134858c);
            gVar.mo89242c(string).mo89222a(440.0f).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, $$Lambda$MineSystemSettingView$6P5t1cvkt2qz9cBWyTtY3cnGnQ.INSTANCE).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89269b(R.string.Lark_Legacy_LarkLogout).mo89271d(R.color.lkui_R500).mo89267a(new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.setting.page.v1.mvp.$$Lambda$MineSystemSettingView$KR4C9AHqPilNvp0uzThrEjRd038 */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    MineSystemSettingView.lambda$KR4C9AHqPilNvp0uzThrEjRd038(MineSystemSettingView.this, dialogInterface, i);
                }
            })).mo89239c();
            return;
        }
        ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) new C25644o(this.f134858c).mo89237b(string)).mo89250i(R.color.lkui_N600)).mo89249h(14)).mo89206a(this.f134858c.getString(R.string.Lark_Legacy_LarkLogout), this.f134858c.getString(R.string.Lark_Legacy_Cancel))).mo89210d(R.layout.setting_setting_menu_dialog_item)).mo89290y(0).mo89202a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.setting.page.v1.mvp.$$Lambda$MineSystemSettingView$Vnr4T4GB1VTaSvXU5dmxMv9cg */

            public final void onClick(DialogInterface dialogInterface, int i) {
                MineSystemSettingView.m270976lambda$Vnr4T4GB1VTaSvXU5dmxMv9cg(MineSystemSettingView.this, dialogInterface, i);
            }
        })).mo89239c();
    }

    /* renamed from: h */
    private void m211661h() {
        if (DesktopUtil.m144301a((Context) this.f134858c)) {
            this.mTitleBar.setLeftVisible(true);
            this.mTitleBar.getLeftText().setText(R.string.Lark_Legacy_SystemSetting);
            this.mTitleBar.getLeftText().setTextColor(this.f134858c.getResources().getColor(R.color.lkui_N900));
            this.mTitleBar.getLeftText().setTextSize((float) CommonTitleBarConstants.DEFAULT_MAIN_TEXT_SIZE);
            this.mTitleBar.setLeftImageDrawable(null);
            this.mTitleBar.getCenterLayout().setVisibility(8);
            this.mTitleBar.setLeftClickListener(null);
            this.mTitleBar.setLeftTextPadding(16, 12, 0, 12);
        } else {
            this.mTitleBar.setLeftVisible(true);
        }
        this.mLogoutBtn.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.C545551 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                    /* class com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.C545551.RunnableC545561 */

                    public void run() {
                        SettingHitPoint.f134851a.mo186407g();
                    }
                });
                MineSystemSettingView.this.mo186439g();
            }
        });
        this.mNotificationEntrance.setOnEntranceClickListener(new NotificationEntranceView.AbstractC54587a() {
            /* class com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.C545616 */

            @Override // com.ss.android.lark.setting.page.v1.view.NotificationEntranceView.AbstractC54587a
            /* renamed from: a */
            public void mo186442a() {
                MineSystemSettingView.this.f134856a.mo186461o();
            }

            @Override // com.ss.android.lark.setting.page.v1.view.NotificationEntranceView.AbstractC54587a
            /* renamed from: b */
            public void mo186444b() {
                MineSystemSettingView mineSystemSettingView = MineSystemSettingView.this;
                mineSystemSettingView.mo186429a(mineSystemSettingView.mNotificationEntrance);
                MineSystemSettingView.this.f134856a.mo186451e();
            }

            @Override // com.ss.android.lark.setting.page.v1.view.NotificationEntranceView.AbstractC54587a
            /* renamed from: a */
            public void mo186443a(String str) {
                MineSystemSettingView.this.f134856a.mo186447a(str);
            }
        });
        this.mPrivateSetting.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.C545627 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                MineSystemSettingView.this.mo186429a(view);
                SettingHitPoint.f134851a.mo186408h();
                SettingHitPoint.f134851a.mo186409i();
                MineSystemSettingView.this.f134856a.mo186452f();
            }
        });
        this.mSettingCalendar.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.C545638 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                MineSystemSettingView.this.mo186429a(view);
                MineSystemSettingView.this.f134856a.mo186453g();
            }
        });
        if (C54115c.m210080a().mo178312x()) {
            this.mSettingTodo.setVisibility(0);
            this.mSettingTodo.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.C545649 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    MineSystemSettingView.this.mo186429a(view);
                    MineSystemSettingView.this.f134856a.mo186454h();
                }
            });
        } else {
            this.mSettingTodo.setVisibility(8);
        }
        if (C54115c.m210080a().mo178313y()) {
            this.mSettingMoments.setVisibility(0);
            this.mSettingMomentsTitle.setText(C54115c.m210080a().mo178314z());
            this.mSettingMoments.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.AnonymousClass10 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    MineSystemSettingView.this.mo186429a(view);
                    MineSystemSettingView.this.f134856a.mo186455i();
                }
            });
        } else {
            this.mSettingMoments.setVisibility(8);
        }
        if (C54115c.m210080a().mo178310v()) {
            UIUtils.show(this.mSettingVideoChat);
            this.mSettingVideoChat.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.AnonymousClass11 */

                public void onClick(View view) {
                    MineSystemSettingView.this.mo186429a(view);
                    MineSystemSettingView.this.f134856a.mo186456j();
                }
            });
        }
        this.mSettingGeneral.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.AnonymousClass12 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                MineSystemSettingView.this.mo186429a(view);
                MineSystemSettingView.this.f134856a.mo186457k();
            }
        });
        if (C54115c.m210080a().mo178311w() && !DesktopUtil.m144301a((Context) this.f134858c)) {
            UIUtils.show(this.mSettingEmail);
            this.mSettingEmail.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.AnonymousClass13 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    MineSystemSettingView.this.f134856a.mo186458l();
                }
            });
        }
        this.mAccountAndSecurityLayout.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.C545572 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                MineSystemSettingView.this.mo186429a(view);
                MineSystemSettingView.this.f134856a.mo186445a();
            }
        });
        if (C54115c.m210080a().mo178291e().mo178337a("lark.account.security.center")) {
            this.mTvAccountAndSecurity.setText(R.string.Lark_Passport_AccountSecurityCenter_TitleMobile);
        }
        this.mSettingWrittenLanguageLayout.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.C545583 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                MineSystemSettingView.this.mo186429a(view);
                MineSystemSettingView.this.f134856a.mo186448b();
            }
        });
        UIUtils.show(this.mInternalSettings);
        this.mInternalSettings.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.C545594 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                MineSystemSettingView.this.mo186429a(view);
                MineSystemSettingView.this.f134856a.mo186449c();
            }
        });
        UIUtils.getString(this.f134858c, R.string.Lark_App_Name);
        this.mAboutLarkTV.setText(UIHelper.mustacheFormat((int) R.string.Lark_NewSettings_AboutFeishuMobile));
        this.mAboutLarkRL.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.setting.page.v1.mvp.MineSystemSettingView.C545605 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                MineSystemSettingView.this.mo186429a(view);
                MineSystemSettingView.this.f134857b.mo186470a();
            }
        });
        m211663j();
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC54566a.AbstractC54569b.AbstractC54570a aVar) {
        this.f134857b = aVar;
    }

    /* renamed from: b */
    private void m211659b(CommonLoadingDialog commonLoadingDialog) {
        if (commonLoadingDialog != null && UIUtils.isActivityRunning(this.f134858c)) {
            commonLoadingDialog.dismiss();
        }
    }

    /* renamed from: a */
    private void m211656a(CommonLoadingDialog commonLoadingDialog) {
        if (commonLoadingDialog != null && UIUtils.isActivityRunning(this.f134858c)) {
            commonLoadingDialog.show(this.f134858c);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m211657a(Long l) {
        m211659b(this.f134859d);
        View view = this.mLogoutBtn;
        if (view != null) {
            view.setEnabled(true);
        }
    }

    @Override // com.ss.android.lark.setting.page.v1.mvp.AbstractC54566a.AbstractC54569b
    /* renamed from: b */
    public void mo186434b(boolean z) {
        if (z) {
            this.mNewVersionTipIV.setVisibility(0);
            this.mNewVersionTipIV.setImageBitmap(C57886v.m224663a(R.layout.setting_view_upgrade_tip, this.f134858c, R.dimen.setting_upgrade_tip_width, R.dimen.setting_upgrade_tip_height));
            return;
        }
        this.mNewVersionTipIV.setVisibility(8);
    }

    /* renamed from: a */
    public void mo186429a(View view) {
        if (DesktopUtil.m144301a((Context) this.f134858c)) {
            if (view != null) {
                view.setSelected(true);
            }
            View view2 = this.f134861f;
            if (view2 != null) {
                view2.setSelected(false);
            }
            this.f134861f = view;
        }
    }

    @Override // com.ss.android.lark.setting.page.v1.mvp.AbstractC54566a.AbstractC54569b
    /* renamed from: a */
    public void mo186430a(C54554a aVar) {
        this.mNotificationEntrance.mo186482a(aVar);
    }

    @Override // com.ss.android.lark.setting.page.v1.mvp.AbstractC54566a.AbstractC54569b
    /* renamed from: a */
    public void mo186432a(boolean z) {
        this.mNotificationEntrance.mo186483a(z);
    }

    public MineSystemSettingView(Activity activity, AbstractC54565a aVar) {
        this.f134858c = activity;
        this.f134856a = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m211660c(DialogInterface dialogInterface, int i) {
        this.f134857b.mo186471a(this.f134858c);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m211655a(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            this.f134857b.mo186471a(this.f134858c);
        }
        dialogInterface.dismiss();
    }
}
