package com.ss.android.lark.phone.impl.phonequerylimit.mvp;

import android.app.Activity;
import android.content.DialogInterface;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.phone.C51341b;
import com.ss.android.lark.phone.impl.common.PhoneControlStatus;
import com.ss.android.lark.phone.impl.phonequerylimit.mvp.AbstractC51400a;
import com.ss.android.lark.phone.impl.phonequerylimit.p2461a.C51385a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;

public class PhoneQueryLimitView implements AbstractC51400a.AbstractC51402b {

    /* renamed from: a */
    public AbstractC51399b f127917a;

    /* renamed from: b */
    public AbstractC51400a.AbstractC51402b.AbstractC51403a f127918b;

    /* renamed from: c */
    public Activity f127919c;

    /* renamed from: d */
    private SparseArray<AbstractC51398a> f127920d = new SparseArray<>();
    @BindView(5875)
    TextView mApplyForPhoneCallAmountTV;
    @BindView(6354)
    LinearLayout mPhoneCallContinueLL;
    @BindView(6355)
    TextView mPhoneCallContinueTV;
    @BindView(6356)
    TextView mPhoneQueryLimitBtnTV;
    @BindView(6357)
    TextView mPhoneQueryLimitHintContentTV;
    @BindView(6358)
    TextView mPhoneQueryLimitHintTitleTV;
    @BindView(6595)
    CommonTitleBar mTitleBar;
    @BindView(6658)
    TextView mUnderStandPhoneControlDetailTV;
    @BindView(6688)
    RelativeLayout mVoiceUrgentCallActionRL;
    @BindView(6689)
    LinearLayout mVoiceUrgentCallHintLL;
    @BindView(6690)
    LinearLayout mVoiceUrgentCallTipsLL;

    /* renamed from: com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView$a */
    public interface AbstractC51398a {
        void onShowPhoneControlView();
    }

    /* renamed from: com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView$b */
    public interface AbstractC51399b {
        /* renamed from: a */
        void mo177002a();

        /* renamed from: a */
        void mo177003a(PhoneQueryLimitView phoneQueryLimitView);

        /* renamed from: a */
        void mo177004a(String str, int i);
    }

    /* renamed from: b */
    private void m199274b() {
        m199281g();
        m199276c();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f127917a = null;
        this.f127918b = null;
    }

    /* renamed from: c */
    private void m199276c() {
        m199278d();
        m199280f();
        m199279e();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f127917a.mo177003a(this);
        m199274b();
    }

    /* renamed from: d */
    private void m199278d() {
        this.mVoiceUrgentCallActionRL.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView.View$OnClickListenerC513968 */

            public void onClick(View view) {
                if (PhoneQueryLimitView.this.f127918b != null) {
                    PhoneQueryLimitView.this.f127918b.mo177031a(PhoneQueryLimitView.this.f127919c);
                }
            }
        });
        this.mUnderStandPhoneControlDetailTV.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView.View$OnClickListenerC513979 */

            public void onClick(View view) {
                if (PhoneQueryLimitView.this.f127918b != null) {
                    PhoneQueryLimitView.this.f127918b.mo177030a();
                }
            }
        });
    }

    /* renamed from: f */
    private void m199280f() {
        this.mPhoneCallContinueTV.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView.AnonymousClass10 */

            public void onClick(View view) {
                if (PhoneQueryLimitView.this.f127918b != null) {
                    PhoneQueryLimitView.this.f127918b.mo177033b(PhoneQueryLimitView.this.f127919c);
                }
            }
        });
        this.mApplyForPhoneCallAmountTV.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView.AnonymousClass11 */

            public void onClick(View view) {
                if (PhoneQueryLimitView.this.f127918b != null) {
                    PhoneQueryLimitView.this.f127918b.mo177032b();
                }
            }
        });
    }

    /* renamed from: g */
    private void m199281g() {
        this.mTitleBar.setTitle(UIUtils.getString(this.f127919c, R.string.Lark_Legacy_PhoneCallManageTitle));
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView.View$OnClickListenerC513883 */

            public void onClick(View view) {
                if (PhoneQueryLimitView.this.f127917a != null) {
                    PhoneQueryLimitView.this.f127917a.mo177002a();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m199282h() {
        this.mVoiceUrgentCallHintLL.setVisibility(8);
        this.mPhoneCallContinueLL.setVisibility(8);
        this.mPhoneQueryLimitBtnTV.setVisibility(8);
    }

    /* renamed from: e */
    private void m199279e() {
        if (!C51341b.m199137a().mo144001a("byteview.call.encrypted.android")) {
            Log.m165389i("PhoneQueryLimitView", "updateUrgentViewVisibleStatus called. fg is false, so set voice urgentcall gone.");
            this.mVoiceUrgentCallActionRL.setVisibility(8);
            this.mVoiceUrgentCallTipsLL.setVisibility(8);
            return;
        }
        this.mVoiceUrgentCallActionRL.setVisibility(0);
        this.mVoiceUrgentCallTipsLL.setVisibility(0);
    }

    /* renamed from: a */
    private void m199270a() {
        this.f127920d.put(PhoneControlStatus.NO_PERMISSION.getNumber(), new AbstractC51398a() {
            /* class com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView.C513861 */

            @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView.AbstractC51398a
            public void onShowPhoneControlView() {
                PhoneQueryLimitView.this.mVoiceUrgentCallHintLL.setVisibility(0);
                PhoneQueryLimitView.this.mPhoneCallContinueLL.setVisibility(8);
                PhoneQueryLimitView.this.mPhoneQueryLimitBtnTV.setVisibility(8);
            }
        });
        this.f127920d.put(PhoneControlStatus.ACQUIRED_IN_161TH_TIME.getNumber(), new AbstractC51398a() {
            /* class com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView.C513894 */

            @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView.AbstractC51398a
            public void onShowPhoneControlView() {
                PhoneQueryLimitView.this.mVoiceUrgentCallHintLL.setVisibility(8);
                PhoneQueryLimitView.this.mPhoneCallContinueLL.setVisibility(8);
                PhoneQueryLimitView.this.mPhoneQueryLimitBtnTV.setVisibility(0);
                PhoneQueryLimitView.this.mPhoneQueryLimitBtnTV.setText(UIUtils.getString(PhoneQueryLimitView.this.f127919c, R.string.Lark_Legacy_ApplicationPhoneCallTimeButtonKnow));
                PhoneQueryLimitView.this.mPhoneQueryLimitBtnTV.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView.C513894.View$OnClickListenerC513901 */

                    public void onClick(View view) {
                        if (PhoneQueryLimitView.this.f127917a != null) {
                            PhoneQueryLimitView.this.f127917a.mo177002a();
                        }
                    }
                });
            }
        });
        this.f127920d.put(PhoneControlStatus.ONLY_2_TIMES_LEFT.getNumber(), new AbstractC51398a() {
            /* class com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView.C513915 */

            @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView.AbstractC51398a
            public void onShowPhoneControlView() {
                PhoneQueryLimitView.this.mVoiceUrgentCallHintLL.setVisibility(8);
                PhoneQueryLimitView.this.mPhoneCallContinueLL.setVisibility(0);
                PhoneQueryLimitView.this.mPhoneQueryLimitBtnTV.setVisibility(8);
            }
        });
        this.f127920d.put(PhoneControlStatus.REACH_UPPER_LIMIT_IN_24_HOURS.getNumber(), new AbstractC51398a() {
            /* class com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView.C513926 */

            @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView.AbstractC51398a
            public void onShowPhoneControlView() {
                PhoneQueryLimitView.this.mVoiceUrgentCallHintLL.setVisibility(8);
                PhoneQueryLimitView.this.mPhoneCallContinueLL.setVisibility(8);
                PhoneQueryLimitView.this.mPhoneQueryLimitBtnTV.setVisibility(0);
                PhoneQueryLimitView.this.mPhoneQueryLimitBtnTV.setText(UIUtils.getString(PhoneQueryLimitView.this.f127919c, R.string.Lark_Legacy_ApplicationPhoneCallTimeButtonApp));
                PhoneQueryLimitView.this.mPhoneQueryLimitBtnTV.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView.C513926.View$OnClickListenerC513931 */

                    public void onClick(View view) {
                        if (PhoneQueryLimitView.this.f127918b != null) {
                            PhoneQueryLimitView.this.f127918b.mo177032b();
                        }
                    }
                });
            }
        });
        this.f127920d.put(PhoneControlStatus.NO_QUERY_AMOUNT.getNumber(), new AbstractC51398a() {
            /* class com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView.C513947 */

            @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView.AbstractC51398a
            public void onShowPhoneControlView() {
                PhoneQueryLimitView.this.mVoiceUrgentCallHintLL.setVisibility(8);
                PhoneQueryLimitView.this.mPhoneCallContinueLL.setVisibility(8);
                PhoneQueryLimitView.this.mPhoneQueryLimitBtnTV.setVisibility(0);
                PhoneQueryLimitView.this.mPhoneQueryLimitBtnTV.setText(UIUtils.getString(PhoneQueryLimitView.this.f127919c, R.string.Lark_Legacy_ApplicationPhoneCallTimeButtonApp));
                PhoneQueryLimitView.this.mPhoneQueryLimitBtnTV.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView.C513947.View$OnClickListenerC513951 */

                    public void onClick(View view) {
                        if (PhoneQueryLimitView.this.f127918b != null) {
                            PhoneQueryLimitView.this.f127918b.mo177032b();
                        }
                    }
                });
            }
        });
        this.f127920d.put(PhoneControlStatus.PERMISSION_CONTROL.getNumber(), new AbstractC51398a() {
            /* class com.ss.android.lark.phone.impl.phonequerylimit.mvp.$$Lambda$PhoneQueryLimitView$opMonPnE_kqk9FDTMTZ2fepRCss */

            @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView.AbstractC51398a
            public final void onShowPhoneControlView() {
                PhoneQueryLimitView.lambda$opMonPnE_kqk9FDTMTZ2fepRCss(PhoneQueryLimitView.this);
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC51400a.AbstractC51402b.AbstractC51403a aVar) {
        this.f127918b = aVar;
    }

    /* renamed from: c */
    private void m199277c(String str) {
        this.mPhoneQueryLimitHintContentTV.setText(str);
    }

    @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.AbstractC51400a.AbstractC51402b
    /* renamed from: a */
    public void mo177010a(int i) {
        Activity activity = this.f127919c;
        LKUIToast.show(activity, UIUtils.getString(activity, i));
    }

    /* renamed from: a */
    private void m199271a(PhoneControlStatus phoneControlStatus) {
        AbstractC51398a aVar = this.f127920d.get(phoneControlStatus.getNumber());
        if (aVar == null) {
            Log.m165383e("PhoneQueryLimitView", "control status is unknown");
        } else {
            aVar.onShowPhoneControlView();
        }
    }

    /* renamed from: b */
    private String m199273b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("APP_DISPLAY_NAME", UIHelper.getAppName());
        hashMap.put("name", str);
        return UIHelper.mustacheFormat((int) R.string.Lark_Legacy_ApplicationPhoneCallTimeWindow, hashMap);
    }

    /* renamed from: b */
    private void m199275b(PhoneControlStatus phoneControlStatus) {
        if (phoneControlStatus == PhoneControlStatus.NO_PERMISSION) {
            this.mPhoneQueryLimitHintTitleTV.setText(UIUtils.getString(this.f127919c, R.string.Lark_Legacy_PhoneCallManageSubTitle));
        } else {
            this.mPhoneQueryLimitHintTitleTV.setText(UIUtils.getString(this.f127919c, R.string.Lark_Legacy_ApplicationPhoneCallTimePagSubTitle));
        }
    }

    @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.AbstractC51400a.AbstractC51402b
    /* renamed from: a */
    public void mo177011a(C51385a aVar) {
        m199272a(aVar.mo177008b(), aVar.mo177005a());
        m199271a(aVar.mo177008b());
    }

    @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.AbstractC51400a.AbstractC51402b
    /* renamed from: a */
    public void mo177013a(String str) {
        new C25639g(this.f127919c).mo89248g(R.string.Lark_Legacy_ApplicationPhoneCallTimeCardTitle).mo89242c(m199273b(str)).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_ApplicationPhoneCallTimeWindowN, (DialogInterface.OnClickListener) null).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ApplicationPhoneCallTimeWindowY, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView.DialogInterface$OnClickListenerC513872 */

            public void onClick(DialogInterface dialogInterface, int i) {
                if (PhoneQueryLimitView.this.f127918b != null) {
                    PhoneQueryLimitView.this.f127918b.mo177034c();
                }
            }
        }).mo89238b(true).mo89239c();
    }

    /* renamed from: a */
    private void m199272a(PhoneControlStatus phoneControlStatus, String str) {
        m199275b(phoneControlStatus);
        m199277c(str);
    }

    public PhoneQueryLimitView(Activity activity, AbstractC51399b bVar) {
        this.f127919c = activity;
        this.f127917a = bVar;
        m199270a();
    }

    @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.AbstractC51400a.AbstractC51402b
    /* renamed from: a */
    public void mo177014a(String str, int i) {
        AbstractC51399b bVar = this.f127917a;
        if (bVar != null) {
            bVar.mo177004a(str, i);
            this.f127917a.mo177002a();
        }
    }
}
