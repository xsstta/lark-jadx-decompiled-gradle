package com.bytedance.ee.bear.sheet.reminder;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.DocumentPluginV2;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.reminder.ReminderViewModel;
import com.bytedance.ee.bear.reminder.model.C10621b;
import com.bytedance.ee.bear.sheet.common.C11088a;
import com.bytedance.ee.bear.sheet.reminder.SheetReminderModel;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0002\u0019\u001aB\u0005¢\u0006\u0002\u0010\u0003J \u0010\n\u001a\u00020\u000b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\rH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000bH\u0002J\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u000bH\u0002R\u0014\u0010\u0004\u001a\b\u0018\u00010\u0005R\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/sheet/reminder/SheetReminderPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPluginV2;", "Lcom/bytedance/ee/bear/document/orientation/OrientationSupportPanel;", "()V", "reminderHandler", "Lcom/bytedance/ee/bear/sheet/reminder/SheetReminderPlugin$SheetReminderHandler;", "sheetAnalytic", "Lcom/bytedance/ee/bear/sheet/common/SheetAnalytic;", "viewModel", "Lcom/bytedance/ee/bear/sheet/reminder/SheetReminderViewModel;", "getBridgeHandlers", "", "handlersHolder", "", "", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "getReminderFragment", "Lcom/bytedance/ee/bear/sheet/reminder/SheetReminderFragment;", "hideFragment", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/browser/plugin/PluginHost;", "shouldDisableLandscape", "", "showFragment", "Companion", "SheetReminderHandler", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SheetReminderPlugin extends DocumentPluginV2 implements AbstractC6054a {
    public static final Companion Companion = new Companion(null);
    public SheetReminderHandler reminderHandler;
    public final C11088a sheetAnalytic = new C11088a();
    public C11294c viewModel;

    @Override // com.bytedance.ee.bear.document.orientation.AbstractC6054a
    public boolean shouldDisableLandscape() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/sheet/reminder/SheetReminderPlugin$Companion;", "", "()V", "TAG", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.reminder.SheetReminderPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0006\u0010\u0013\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/sheet/reminder/SheetReminderPlugin$SheetReminderHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/sheet/reminder/SheetReminderModel;", "(Lcom/bytedance/ee/bear/sheet/reminder/SheetReminderPlugin;)V", "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "getCallback", "()Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "setCallback", "(Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;)V", "sheetId", "", "getSheetId", "()Ljava/lang/String;", "setSheetId", "(Ljava/lang/String;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onCancel", "onSave", "Lcom/bytedance/ee/bear/sheet/reminder/SheetReminderModel$SheetReminderData;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.reminder.SheetReminderPlugin$b */
    public final class SheetReminderHandler implements AbstractC7945d<SheetReminderModel> {

        /* renamed from: b */
        private AbstractC7947h f30359b;

        /* renamed from: c */
        private String f30360c;

        /* renamed from: a */
        public final String mo43254a() {
            return this.f30360c;
        }

        /* renamed from: b */
        public final void mo43257b() {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((Object) "isCanceled", (Object) true);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("sheetId", (Object) this.f30360c);
            jSONObject2.put((Object) "reminderUpdateArgs", (Object) jSONObject3);
            C13479a.m54764b("SheetReminderPlugin", "Cancel to edit reminder.");
            AbstractC7947h hVar = this.f30359b;
            if (hVar != null) {
                hVar.mo17188a(jSONObject);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public SheetReminderHandler() {
        }

        /* renamed from: a */
        public final void mo43255a(SheetReminderModel.SheetReminderData sheetReminderData) {
            Intrinsics.checkParameterIsNotNull(sheetReminderData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            sheetReminderData.setSheetId(this.f30360c);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((Object) "reminderUpdateArgs", (Object) sheetReminderData);
            jSONObject2.put((Object) "isCanceled", (Object) false);
            C13479a.m54764b("SheetReminderPlugin", "onSave data.");
            AbstractC7947h hVar = this.f30359b;
            if (hVar != null) {
                hVar.mo17188a(jSONObject);
            }
        }

        /* renamed from: a */
        public void handle(SheetReminderModel sheetReminderModel, AbstractC7947h hVar) {
            C13479a.m54764b("SheetReminderPlugin", "SheetReminderHandler handle data: " + sheetReminderModel);
            this.f30359b = hVar;
            if (sheetReminderModel == null || sheetReminderModel.getData() == null) {
                C11294c cVar = SheetReminderPlugin.this.viewModel;
                if (cVar != null) {
                    cVar.setActive(false);
                    return;
                }
                return;
            }
            SheetReminderModel.SheetReminderData data = sheetReminderModel.getData();
            Intrinsics.checkExpressionValueIsNotNull(data, "data.data");
            this.f30360c = data.getSheetId();
            C11294c cVar2 = SheetReminderPlugin.this.viewModel;
            if (cVar2 != null) {
                C11293b sheetReminderSettings = sheetReminderModel.toSheetReminderSettings();
                Intrinsics.checkExpressionValueIsNotNull(sheetReminderSettings, "data.toSheetReminderSettings()");
                cVar2.setOriginReminderSettings(sheetReminderSettings);
            }
            C11294c cVar3 = SheetReminderPlugin.this.viewModel;
            if (cVar3 != null) {
                cVar3.setActive(true);
            }
        }
    }

    public final void hideFragment() {
        C11291a reminderFragment = getReminderFragment();
        if (reminderFragment != null) {
            reminderFragment.mo5513b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016¨\u0006\u0011"}, d2 = {"com/bytedance/ee/bear/sheet/reminder/SheetReminderPlugin$onAttachToHost$2", "Lcom/bytedance/ee/bear/reminder/ReminderViewModel$IReminderDelegate;", "onCalendarSelect", "", "onCancelAllDay", "onClickConfirmQuit", "onClickContinueEdit", "onClickNoReminder", "onClose", "onMonthChange", "onSave", "settings", "Lcom/bytedance/ee/bear/reminder/model/ReminderSettings;", "onSelectReminderTime", "onSelectTime", "onSetAllDay", "onShowReminderPersonCountLimitToast", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.reminder.SheetReminderPlugin$d */
    public static final class C11290d implements ReminderViewModel.IReminderDelegate {

        /* renamed from: a */
        final /* synthetic */ SheetReminderPlugin f30362a;

        @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
        /* renamed from: b */
        public void mo40159b() {
        }

        @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
        /* renamed from: c */
        public void mo40160c() {
        }

        @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
        /* renamed from: d */
        public void mo40161d() {
        }

        @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
        /* renamed from: e */
        public void mo40162e() {
        }

        @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
        /* renamed from: f */
        public void mo40163f() {
        }

        @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
        /* renamed from: g */
        public void mo40164g() {
        }

        @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
        /* renamed from: h */
        public void mo40165h() {
        }

        @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
        /* renamed from: i */
        public void mo40166i() {
        }

        @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
        /* renamed from: j */
        public void mo40167j() {
        }

        @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
        /* renamed from: a */
        public void mo40157a() {
            C13479a.m54764b("SheetReminderPlugin", "close SheetReminderFragment.");
            C11294c cVar = this.f30362a.viewModel;
            if (cVar != null) {
                cVar.setActive(false);
            }
            SheetReminderHandler bVar = this.f30362a.reminderHandler;
            if (bVar != null) {
                bVar.mo43257b();
            }
        }

        @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
        /* renamed from: k */
        public void mo40168k() {
            String str;
            C13479a.m54764b("SheetReminderPlugin", "report reminder person count limit event");
            C11088a aVar = this.f30362a.sheetAnalytic;
            SheetReminderHandler bVar = this.f30362a.reminderHandler;
            if (bVar == null || (str = bVar.mo43254a()) == null) {
                str = "";
            }
            aVar.mo42262a(str);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11290d(SheetReminderPlugin sheetReminderPlugin) {
            this.f30362a = sheetReminderPlugin;
        }

        @Override // com.bytedance.ee.bear.reminder.ReminderViewModel.IReminderDelegate
        /* renamed from: a */
        public void mo40158a(C10621b bVar) {
            C13479a.m54764b("SheetReminderPlugin", "save ReminderSettings. " + bVar);
            C11294c cVar = this.f30362a.viewModel;
            if (cVar != null) {
                cVar.setActive(false);
            }
            if (!(bVar instanceof C11293b)) {
                bVar = null;
            }
            SheetReminderModel.SheetReminderData newInstance = SheetReminderModel.newInstance((C11293b) bVar);
            SheetReminderHandler bVar2 = this.f30362a.reminderHandler;
            if (bVar2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(newInstance, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                bVar2.mo43255a(newInstance);
            }
        }
    }

    private final C11291a getReminderFragment() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "activity.supportFragmentManager");
        return (C11291a) supportFragmentManager.findFragmentByTag("SheetReminderPlugin");
    }

    public final void showFragment() {
        if (getReminderFragment() == null) {
            FragmentActivity activity = getActivity();
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
            ((C11291a) instantiateFragment(C11291a.class)).mo5511a(activity.getSupportFragmentManager(), "SheetReminderPlugin");
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPluginV2, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        Intrinsics.checkParameterIsNotNull(map, "handlersHolder");
        SheetReminderHandler bVar = new SheetReminderHandler();
        this.reminderHandler = bVar;
        if (bVar == null) {
            Intrinsics.throwNpe();
        }
        map.put("biz.sheet.showReminderPanel", bVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "active", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.reminder.SheetReminderPlugin$c */
    static final class C11289c<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SheetReminderPlugin f30361a;

        C11289c(SheetReminderPlugin sheetReminderPlugin) {
            this.f30361a = sheetReminderPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "active");
            if (bool.booleanValue()) {
                UnspecifiedOrientationPlugin unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) this.f30361a.findPlugin(UnspecifiedOrientationPlugin.class);
                if (unspecifiedOrientationPlugin != null) {
                    unspecifiedOrientationPlugin.onOrientationSupportPanelShowing(this.f30361a);
                }
                C13479a.m54764b("SheetReminderPlugin", "show SheetReminderFragment.");
                this.f30361a.showFragment();
                return;
            }
            C13479a.m54764b("SheetReminderPlugin", "remove SheetReminderFragment.");
            UnspecifiedOrientationPlugin unspecifiedOrientationPlugin2 = (UnspecifiedOrientationPlugin) this.f30361a.findPlugin(UnspecifiedOrientationPlugin.class);
            if (unspecifiedOrientationPlugin2 != null) {
                unspecifiedOrientationPlugin2.onOrientationSupportPanelDismiss(this.f30361a);
            }
            this.f30361a.hideFragment();
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        C1177w<Boolean> active;
        super.onAttachToHost(eVar);
        C11294c cVar = (C11294c) C4950k.m20476a(this, C11294c.class);
        this.viewModel = cVar;
        if (!(cVar == null || (active = cVar.getActive()) == null)) {
            active.mo5923a(getLifecycleOwner(), new C11289c(this));
        }
        C11294c cVar2 = this.viewModel;
        if (cVar2 != null) {
            cVar2.setDelegate(new C11290d(this));
        }
        C11294c cVar3 = this.viewModel;
        if (cVar3 != null) {
            cVar3.setBearUrl(getEditorAbility().mo24602q().getBearUrl());
        }
        this.sheetAnalytic.mo42260a(getEditorAbility().mo24602q().getBearUrl());
    }
}
