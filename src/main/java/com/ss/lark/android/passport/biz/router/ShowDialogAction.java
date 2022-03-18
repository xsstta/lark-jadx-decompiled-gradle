package com.ss.lark.android.passport.biz.router;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.network.handler.UnknownCodeHandler;
import com.ss.android.lark.passport.infra.base.router.AbstractC49088b;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.listenermanage.UserSwitchListenerManager;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.AbstractC49128n;
import com.ss.android.lark.passport.infra.service.ISessionInvalidService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.statistics.StatisticsHelper;
import com.ss.android.lark.passport.infra.util.AppActivityManager;
import com.ss.android.lark.passport.infra.util.C49202p;
import com.ss.android.lark.passport.infra.util.C49226y;
import com.ss.android.lark.passport.infra.widget.DialogC49246b;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.contants.ButtonType;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.feature.company_login.SSOLoginStatisticsHelper;
import com.ss.lark.android.passport.biz.feature.constants.LogoutReason;
import com.ss.lark.android.passport.biz.feature.user_item_list.UserListStatisticsHelper;
import com.ss.lark.android.passport.biz.router.ShowDialogAction;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@RouterAnno(name = "show_dialog")
public class ShowDialogAction extends AbstractC49088b {

    /* renamed from: b */
    private static AtomicBoolean f164116b = new AtomicBoolean(false);

    /* renamed from: c */
    private static Set<Function1<Boolean, Unit>> f164117c = new LinkedHashSet();

    /* renamed from: d */
    private final int[] f164118d = {R.id.ud_dialog_btn_primary, R.id.ud_dialog_btn_secondary, R.id.ud_dialog_btn_secondary2};

    /* renamed from: e */
    private final String[] f164119e = {"Main", "Secondary", "Secondary2"};

    public static class ShowDialogStepInfo implements Serializable {
        @JSONField(name = "button_list")
        public List<ButtonInfo> buttonListStepInfos;
        @JSONField(name = "logout_reason")
        public int logoutReason;
        @JSONField(name = "subtitle")
        public String mSubTitle;
        @JSONField(name = "title")
        public String mTitle;
        @JSONField(name = "switch_reason")
        public int switchReason;
        @JSONField(name = "target_user_id")
        public String targetUserId;
    }

    /* renamed from: b */
    private String m255996b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "APPLINK" : "PASSPORT_EXTERNAL" : "ENTER_APP" : "LOG_OUT" : "SESSION_INVALID";
    }

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: c */
    public String mo171383c() {
        return "ShowDialogAction";
    }

    /* renamed from: a */
    public static void m255992a(Function1<Boolean, Unit> function1) {
        synchronized (ShowDialogAction.class) {
            f164117c.add(function1);
        }
    }

    /* renamed from: a */
    public static void m255993a(boolean z) {
        LinkedHashSet<Function1> linkedHashSet;
        if (f164116b.compareAndSet(!z, z)) {
            synchronized (ShowDialogAction.class) {
                linkedHashSet = new LinkedHashSet(f164117c);
            }
            for (Function1 function1 : linkedHashSet) {
                function1.invoke(Boolean.valueOf(z));
            }
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49088b, com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: a */
    public void mo171380a(Context context, String str, final JSONObject jSONObject, int i, boolean z, final UniContext uniContext, final AbstractC49336a aVar) {
        this.f123291a.mo171465b("n_action_showdialog_start", "start");
        if (jSONObject == null) {
            this.f123291a.mo171471d("n_action_showdialog_start", "stepInfo is null");
        } else if (f164116b.get()) {
            if (aVar != null) {
                aVar.onRouterResult(-103, null);
            }
            this.f123291a.mo171465b("n_action_showdialog_start", "already has showing dialog");
        } else {
            if (!(context instanceof Activity)) {
                context = AppActivityManager.m193861a();
            }
            Activity activity = (Activity) context;
            if (!m255994a(activity)) {
                activity = AppActivityManager.m193861a();
                this.f123291a.mo171465b("n_action_showdialog_start", "get top activity");
            }
            if (m255994a(activity)) {
                this.f123291a.mo171465b("n_action_showdialog_start", "top activity is active");
                mo224392a(activity, jSONObject, uniContext, aVar);
                return;
            }
            AppActivityManager.m193866a(new Function1<Activity, Unit>() {
                /* class com.ss.lark.android.passport.biz.router.ShowDialogAction.C651751 */

                /* renamed from: a */
                public Unit invoke(Activity activity) {
                    ShowDialogAction.this.f123291a.mo171465b("n_action_showdialog_start", "show_dialog action run, use next resume activity");
                    ShowDialogAction.this.mo224392a(activity, jSONObject, uniContext, aVar);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* renamed from: a */
    private boolean m255994a(Activity activity) {
        return activity != null && !activity.isFinishing() && !activity.isDestroyed();
    }

    /* renamed from: a */
    public void mo224392a(Activity activity, JSONObject jSONObject, UniContext uniContext, AbstractC49336a aVar) {
        ShowDialogStepInfo showDialogStepInfo;
        int i;
        ButtonInfo buttonInfo;
        ISessionInvalidService mVar;
        final ShowDialogStepInfo showDialogStepInfo2 = (ShowDialogStepInfo) C49202p.m193968a(jSONObject.toJSONString(), ShowDialogStepInfo.class);
        if (showDialogStepInfo2 != null && showDialogStepInfo2.switchReason == 4 && ServiceFinder.m193744a().isUserHasValidSession(showDialogStepInfo2.targetUserId) && (mVar = (ISessionInvalidService) ServiceFinder.m193746a(ISessionInvalidService.class)) != null) {
            mVar.sessionMayInvalid("switch_target");
        }
        if (!m255995a(activity, showDialogStepInfo2, uniContext)) {
            this.f123291a.mo171471d("n_action_showdialog_show", "Do not showDialog");
        } else if (showDialogStepInfo2 == null) {
            this.f123291a.mo171471d("n_action_showdialog_show", "Do not showDialog");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("switch_reason", m255996b(showDialogStepInfo2.switchReason));
            hashMap.put("logout_reason", m255984a(showDialogStepInfo2.logoutReason));
            if (showDialogStepInfo2.buttonListStepInfos != null) {
                StringBuilder sb = new StringBuilder();
                for (ButtonInfo buttonInfo2 : showDialogStepInfo2.buttonListStepInfos) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("action_type", ButtonType.fromValue(buttonInfo2.actionType).toString());
                    if (buttonInfo2.next != null) {
                        hashMap2.put("next_step", buttonInfo2.next.nextStep);
                    }
                    sb.append(JSON.toJSONString(hashMap2));
                    sb.append(";");
                }
                hashMap.put("button_list", sb.toString());
            }
            this.f123291a.mo171467b("n_action_showdialog_show", " buildAndShowDialog", hashMap);
            View inflate = LayoutInflater.from(activity).inflate(R.layout.signin_sdk_register_dialog_content, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.lkui_dialog_content_message_tv);
            UDDialogBuilder eVar = (UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(activity).title(showDialogStepInfo2.mTitle)).titleBold(true)).cancelOnTouchOutside(false);
            if (textView != null) {
                C49226y.m194061a(activity, textView, showDialogStepInfo2.mSubTitle, null, this.f123291a);
                eVar.contentLayout(inflate);
            } else {
                eVar.message(showDialogStepInfo2.mSubTitle);
            }
            if (showDialogStepInfo2.switchReason == 1) {
                eVar.cancelable(false);
                eVar.autoDismiss(false);
            }
            if (showDialogStepInfo2.buttonListStepInfos.size() >= 3) {
                eVar.actionButtonOrientation(UDBaseDialogBuilder.ActionBottomOrientation.VERTICAL);
                if (ButtonType.OPT_IN_NOT_ACCEPT.getValue() == showDialogStepInfo2.buttonListStepInfos.get(0).actionType) {
                    eVar.cancelable(false);
                    eVar.autoDismiss(false);
                }
            }
            int i2 = 0;
            while (i2 < showDialogStepInfo2.buttonListStepInfos.size()) {
                ButtonInfo buttonInfo3 = showDialogStepInfo2.buttonListStepInfos.get(i2);
                if (buttonInfo3 == null || TextUtils.isEmpty(buttonInfo3.text)) {
                    showDialogStepInfo = showDialogStepInfo2;
                    i = i2;
                    this.f123291a.mo171471d("n_action_showdialog_show", "currentButtonStepInfo is null");
                } else {
                    int[] iArr = this.f164118d;
                    if (i2 < iArr.length) {
                        showDialogStepInfo = showDialogStepInfo2;
                        i = i2;
                        buttonInfo = buttonInfo3;
                        eVar.addActionButton(iArr[i2], buttonInfo3.text, new DialogInterface.OnClickListener(activity, showDialogStepInfo2, buttonInfo3, uniContext, i2, activity, aVar) {
                            /* class com.ss.lark.android.passport.biz.router.$$Lambda$ShowDialogAction$GeXOpnvddBNIlYChES_3yCGptFI */
                            public final /* synthetic */ Context f$1;
                            public final /* synthetic */ ShowDialogAction.ShowDialogStepInfo f$2;
                            public final /* synthetic */ ButtonInfo f$3;
                            public final /* synthetic */ UniContext f$4;
                            public final /* synthetic */ int f$5;
                            public final /* synthetic */ Activity f$6;
                            public final /* synthetic */ AbstractC49336a f$7;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                                this.f$3 = r4;
                                this.f$4 = r5;
                                this.f$5 = r6;
                                this.f$6 = r7;
                                this.f$7 = r8;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                ShowDialogAction.this.m255986a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, dialogInterface, i);
                            }
                        });
                    } else {
                        showDialogStepInfo = showDialogStepInfo2;
                        i = i2;
                        buttonInfo = buttonInfo3;
                    }
                    if (ButtonType.VERIFY_TENANT_DOMAIN.getValue() == buttonInfo.actionType) {
                        SSOLoginStatisticsHelper.m254154e();
                    }
                }
                i2 = i + 1;
                showDialogStepInfo2 = showDialogStepInfo;
            }
            UDDialog build = eVar.build();
            AppActivityManager.m193864a(activity, new Function0<Unit>() {
                /* class com.ss.lark.android.passport.biz.router.ShowDialogAction.C651762 */

                /* renamed from: a */
                public Unit invoke() {
                    ShowDialogAction.m255993a(false);
                    return null;
                }
            });
            build.setOnDismissListener(new DialogInterface.OnDismissListener() {
                /* class com.ss.lark.android.passport.biz.router.ShowDialogAction.DialogInterface$OnDismissListenerC651773 */

                public void onDismiss(DialogInterface dialogInterface) {
                    ShowDialogAction.m255993a(false);
                }
            });
            build.setOnShowListener(new DialogInterface.OnShowListener() {
                /* class com.ss.lark.android.passport.biz.router.ShowDialogAction.DialogInterface$OnShowListenerC651784 */

                public void onShow(DialogInterface dialogInterface) {
                    boolean z;
                    if (showDialogStepInfo2.switchReason == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_dialog_view").mo171607a("is_session_expired", String.valueOf(z)));
                    ShowDialogAction.m255993a(true);
                }
            });
            this.f123291a.mo171465b("n_action_showdialog_show", "dialog.show() ");
            build.show();
        }
    }

    /* renamed from: a */
    private void m255990a(DialogInterface dialogInterface, Context context, ShowDialogStepInfo showDialogStepInfo, ButtonInfo buttonInfo, UniContext uniContext, String str, Activity activity, AbstractC49336a aVar) {
        boolean z = true;
        if (showDialogStepInfo.switchReason != 1) {
            z = false;
        }
        int i = buttonInfo.actionType;
        switch (i) {
            case 8:
            case 9:
                m255998b(dialogInterface, context, showDialogStepInfo, buttonInfo, uniContext, str, activity, aVar);
                return;
            case 10:
                m255991a(dialogInterface, context, showDialogStepInfo, buttonInfo, str, uniContext, activity, aVar);
                return;
            default:
                switch (i) {
                    case 24:
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                    case 26:
                        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_dialog_click").mo171607a("click", "button_click").mo171607a("action_type", str).mo171607a("target", "none").mo171607a("is_session_expired", String.valueOf(z)));
                        m255988a(dialogInterface, context, buttonInfo, activity);
                        return;
                    default:
                        if (String.valueOf(ButtonType.VERIFY_TENANT_DOMAIN.getValue()).equals(str)) {
                            SSOLoginStatisticsHelper.m254152c();
                        } else {
                            StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_dialog_click").mo171607a("click", "button_click").mo171607a("action_type", str).mo171607a("target", "none").mo171607a("is_session_expired", String.valueOf(z)));
                        }
                        m255989a(dialogInterface, context, buttonInfo, str, uniContext, activity, aVar);
                        return;
                }
        }
    }

    /* renamed from: a */
    private void m255991a(DialogInterface dialogInterface, final Context context, ShowDialogStepInfo showDialogStepInfo, ButtonInfo buttonInfo, String str, UniContext uniContext, Activity activity, AbstractC49336a aVar) {
        if (showDialogStepInfo == null) {
            this.f123291a.mo171471d("n_action_showdialog_cancel", "Info is invalid");
            return;
        }
        boolean z = showDialogStepInfo.switchReason == 1;
        if (String.valueOf(ButtonType.VERIFY_TENANT_DOMAIN.getValue()).equals(str)) {
            SSOLoginStatisticsHelper.m254153d();
        } else {
            StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_dialog_click").mo171607a("click", "button_click").mo171607a("action_type", str).mo171607a("target", "none").mo171607a("is_session_expired", String.valueOf(z)));
        }
        mo224393a(dialogInterface, activity);
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", ButtonType.fromValue(buttonInfo.actionType).toString());
        hashMap.put("switch_reason", m255996b(showDialogStepInfo.switchReason));
        hashMap.put("logout_reason", m255984a(showDialogStepInfo.logoutReason));
        if (buttonInfo.next != null) {
            hashMap.put("next_step", buttonInfo.next.nextStep);
        }
        this.f123291a.mo171467b("n_action_showdialog_cancel", "[I known button] click ", hashMap);
        if (1 == showDialogStepInfo.switchReason) {
            ((AbstractC49128n) ServiceFinder.m193746a(AbstractC49128n.class)).switchToNextValidUser(context, 1, 0, new IGetDataCallback<User>() {
                /* class com.ss.lark.android.passport.biz.router.ShowDialogAction.C651827 */

                /* renamed from: a */
                public void onSuccess(User user) {
                    ShowDialogAction.this.f123291a.mo171465b("n_action_showdialog_cancel", "switchToNextValidUser success");
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    UnknownCodeHandler.f123256a.mo171329a(context, new NetworkErrorResult(errorResult.getErrorCode(), errorResult.getDisplayMsg()));
                    ShowDialogAction.this.f123291a.mo171471d("n_action_showdialog_cancel", "switchToNextValidUser onError");
                }
            });
        } else {
            m255987a(context, m255997b(buttonInfo), m255982a(buttonInfo), str, uniContext, aVar);
        }
    }

    /* renamed from: a */
    public void mo224393a(DialogInterface dialogInterface, Activity activity) {
        m255993a(false);
        if (m255994a(activity) && dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    private boolean m255995a(Context context, ShowDialogStepInfo showDialogStepInfo, UniContext uniContext) {
        if (showDialogStepInfo == null || TextUtils.isEmpty(showDialogStepInfo.mTitle) || TextUtils.isEmpty(showDialogStepInfo.mSubTitle) || showDialogStepInfo.buttonListStepInfos == null) {
            this.f123291a.mo171471d("n_action_showdialog_show", "invalid stepInfo!");
            return false;
        } else if (showDialogStepInfo.logoutReason != 1 || showDialogStepInfo.switchReason == 1) {
            return true;
        } else {
            this.f123291a.mo171465b("n_action_showdialog_show", "session invalid and Diff User");
            C49092f.m193529a(context, m255983a(showDialogStepInfo), RouterScene.ALL.value, uniContext, this.f123291a, new AbstractC49336a() {
                /* class com.ss.lark.android.passport.biz.router.$$Lambda$ShowDialogAction$d4tPJyY0nw38kxyloJMwNplMO3E */

                @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                public final void onRouterResult(int i, Object obj) {
                    ShowDialogAction.this.m255985a((ShowDialogAction) i, (int) obj);
                }
            });
            return false;
        }
    }

    /* renamed from: a */
    private String m255984a(int i) {
        LogoutReason a = LogoutReason.Companion.mo223520a(i);
        if (a != null) {
            return a.getDesc();
        }
        return "null";
    }

    /* renamed from: a */
    private JSONObject m255982a(ButtonInfo buttonInfo) {
        if (buttonInfo != null && buttonInfo.next != null) {
            return buttonInfo.next.getStepInfo();
        }
        this.f123291a.mo171471d("n_action_showdialog_button_click", "currentButtonStepInfo next is null");
        return null;
    }

    /* renamed from: b */
    private String m255997b(ButtonInfo buttonInfo) {
        if (buttonInfo != null && buttonInfo.next != null) {
            return buttonInfo.next.nextStep;
        }
        this.f123291a.mo171471d("n_action_showdialog_button_click", "currentButtonStepInfo next is null");
        return "";
    }

    /* renamed from: a */
    private BaseStepData m255983a(ShowDialogStepInfo showDialogStepInfo) {
        if (showDialogStepInfo == null || showDialogStepInfo.buttonListStepInfos == null) {
            return new BaseStepData();
        }
        List<ButtonInfo> list = showDialogStepInfo.buttonListStepInfos;
        for (int i = 0; i < list.size(); i++) {
            if (9 == list.get(i).actionType) {
                if (list.get(i).next == null) {
                    return new BaseStepData();
                } else {
                    return list.get(i).next;
                }
            }
        }
        return new BaseStepData();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m255985a(int i, Object obj) {
        PassportLog passportLog = this.f123291a;
        passportLog.mo171465b("n_action_showdialog_show", "onRouterResult: " + i + ", data = " + obj);
    }

    /* renamed from: a */
    private void m255988a(DialogInterface dialogInterface, final Context context, ButtonInfo buttonInfo, final Activity activity) {
        mo224393a(dialogInterface, activity);
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", ButtonType.fromValue(buttonInfo.actionType).toString());
        if (buttonInfo.next != null) {
            hashMap.put("next_step", buttonInfo.next.nextStep);
        }
        this.f123291a.mo171467b("n_action_showdialog_opt_in_click", "", hashMap);
        if (buttonInfo.next != null && buttonInfo.next.stepInfo != null) {
            JSONObject jSONObject = buttonInfo.next.stepInfo;
            boolean booleanValue = jSONObject.getBooleanValue("opt_in");
            String string = jSONObject.getString("flow_type");
            boolean booleanValue2 = jSONObject.getBooleanValue("use_package_domain");
            final DialogC49246b bVar = new DialogC49246b(context, true);
            bVar.setOnKeyListener(new DialogInterface.OnKeyListener() {
                /* class com.ss.lark.android.passport.biz.router.ShowDialogAction.DialogInterface$OnKeyListenerC651795 */

                public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return false;
                }
            });
            bVar.show();
            this.f123291a.mo171460a("n_action_showdialog_choose_opt_in_req");
            FeatureCApi.m253707a(booleanValue, booleanValue2, string, new ICallback<BaseStepData>() {
                /* class com.ss.lark.android.passport.biz.router.ShowDialogAction.C651806 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public Type mo101474a() {
                    return BaseStepData.class;
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public void mo101475a(NetworkErrorResult networkErrorResult) {
                    ShowDialogAction.this.f123291a.mo171460a("n_action_showdialog_choose_opt_in_req_error");
                    UnknownCodeHandler.f123256a.mo171331c(context, networkErrorResult);
                    bVar.dismiss();
                    activity.finish();
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                    bVar.dismiss();
                    ShowDialogAction.this.f123291a.mo171460a("n_action_showdialog_choose_opt_in_req_succ");
                    if (responseModel.getData() == null || responseModel.getData().stepInfo == null) {
                        ShowDialogAction.this.f123291a.mo171471d("n_action_showdialog_choose_opt_in_req_succ", "data or stepInfo is null");
                    } else {
                        C49092f.m193531a(context, responseModel.getData().nextStep, responseModel.getData().stepInfo, RouterScene.ALL.value, (PassportLog) null, new AbstractC49336a() {
                            /* class com.ss.lark.android.passport.biz.router.ShowDialogAction.C651806.C651811 */

                            @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                            public void onRouterResult(int i, Object obj) {
                                activity.finish();
                            }
                        });
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m255987a(Context context, String str, JSONObject jSONObject, String str2, UniContext uniContext, AbstractC49336a aVar) {
        if (jSONObject == null) {
            PassportLog passportLog = this.f123291a;
            passportLog.mo171471d("n_action_showdialog_button_click", str2 + " btn clicked, but next is null");
            if (aVar != null) {
                aVar.onRouterResult(-100, null);
            }
        } else if (TextUtils.isEmpty(str)) {
            PassportLog passportLog2 = this.f123291a;
            passportLog2.mo171465b("n_action_showdialog_button_click", str2 + " btn clicked, but nextStep is empty");
            if (aVar != null) {
                aVar.onRouterResult(-100, null);
            }
        } else {
            C49092f.m193532a(context, str, jSONObject, RouterScene.ALL.value, uniContext, this.f123291a, aVar);
        }
    }

    /* renamed from: a */
    private void m255989a(DialogInterface dialogInterface, Context context, ButtonInfo buttonInfo, String str, UniContext uniContext, Activity activity, AbstractC49336a aVar) {
        mo224393a(dialogInterface, activity);
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", ButtonType.fromValue(buttonInfo.actionType).toString());
        if (buttonInfo.next != null) {
            hashMap.put("next_step", buttonInfo.next.nextStep);
        }
        this.f123291a.mo171467b("n_action_showdialog_button_click", "default Action click ", hashMap);
        m255987a(context, m255997b(buttonInfo), m255982a(buttonInfo), str, uniContext, aVar);
    }

    /* renamed from: b */
    private void m255998b(final DialogInterface dialogInterface, Context context, ShowDialogStepInfo showDialogStepInfo, ButtonInfo buttonInfo, UniContext uniContext, String str, final Activity activity, AbstractC49336a aVar) {
        if (showDialogStepInfo == null) {
            this.f123291a.mo171471d("n_action_showdialog_button_click", "check dialog/info/activity is failed");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", ButtonType.fromValue(buttonInfo.actionType).toString());
        hashMap.put("switch_reason", m255996b(showDialogStepInfo.switchReason));
        hashMap.put("logout_reason", m255984a(showDialogStepInfo.logoutReason));
        if (buttonInfo.next != null) {
            hashMap.put("next_step", buttonInfo.next.nextStep);
        }
        this.f123291a.mo171467b("n_action_showdialog_button_click", "verifyOrAppeal Action click ", hashMap);
        boolean z = false;
        if (String.valueOf(8).equals(str)) {
            UserListStatisticsHelper.m255714b("", false);
            this.f123291a.mo171467b("n_action_showdialog_appeal_click", "appeal click ", hashMap);
        } else {
            if (showDialogStepInfo.switchReason == 1) {
                z = true;
            }
            StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_dialog_click").mo171607a("click", "button_click").mo171607a("action_type", str).mo171607a("target", "none").mo171607a("is_session_expired", String.valueOf(z)));
        }
        if (1 != showDialogStepInfo.switchReason) {
            mo224393a(dialogInterface, activity);
        } else {
            UserSwitchListenerManager.m193648a(new AbstractC49379a() {
                /* class com.ss.lark.android.passport.biz.router.ShowDialogAction.C651838 */

                @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                /* renamed from: a */
                public /* synthetic */ void mo102549a(C49380b bVar) {
                    AbstractC49379a.CC.$default$a(this, bVar);
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                /* renamed from: a */
                public /* synthetic */ void mo102550a(C49381c cVar) {
                    AbstractC49379a.CC.$default$a(this, cVar);
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                public void onUserSwitchSuccess(C49382d dVar) {
                    ShowDialogAction.this.mo224393a(dialogInterface, activity);
                    UserSwitchListenerManager.m193650b(this);
                }
            });
            AppActivityManager.m193864a(activity, new Function0<Unit>() {
                /* class com.ss.lark.android.passport.biz.router.ShowDialogAction.C651849 */

                /* renamed from: a */
                public Unit invoke() {
                    ShowDialogAction.this.mo224393a(dialogInterface, activity);
                    return Unit.INSTANCE;
                }
            });
        }
        m255987a(context, m255997b(buttonInfo), m255982a(buttonInfo), str, uniContext, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m255986a(Context context, ShowDialogStepInfo showDialogStepInfo, ButtonInfo buttonInfo, UniContext uniContext, int i, Activity activity, AbstractC49336a aVar, DialogInterface dialogInterface, int i2) {
        m255990a(dialogInterface, context, showDialogStepInfo, buttonInfo, uniContext, this.f164119e[i], activity, aVar);
    }
}
