package com.ss.android.lark.setting.page.content.general.wheniviewachat;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.setting.page.content.general.wheniviewachat.IWhenIViewAChatContract;
import com.ss.android.lark.setting.page.statistics.SettingHitPointNew;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001&B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u001cH\u0016J\u0012\u0010\u001f\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001e\u0010\u0016\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/WhenIViewAChatView;", "Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/IWhenIViewAChatContract$IView;", "context", "Landroid/content/Context;", "viewDependency", "Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/WhenIViewAChatView$ViewDependency;", "(Landroid/content/Context;Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/WhenIViewAChatView$ViewDependency;)V", "newestUnreadCb", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "getNewestUnreadCb", "()Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "setNewestUnreadCb", "(Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;)V", "newestUnreadLayout", "Landroid/view/ViewGroup;", "getNewestUnreadLayout", "()Landroid/view/ViewGroup;", "setNewestUnreadLayout", "(Landroid/view/ViewGroup;)V", "recentLeftCb", "getRecentLeftCb", "setRecentLeftCb", "recentLeftLayout", "getRecentLeftLayout", "setRecentLeftLayout", "viewDelegate", "Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/IWhenIViewAChatContract$IView$Delegate;", "create", "", "destroy", "initListeners", "setViewDelegate", "showToast", "msg", "", "updateMessagePosition", "messagePosition", "Lcom/ss/android/lark/chat/entity/chat/Chat$MessagePosition;", "ViewDependency", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class WhenIViewAChatView implements IWhenIViewAChatContract.IView {

    /* renamed from: a */
    public IWhenIViewAChatContract.IView.Delegate f134808a;

    /* renamed from: b */
    private final Context f134809b;

    /* renamed from: c */
    private final ViewDependency f134810c;
    @BindView(7395)
    public UDCheckBox newestUnreadCb;
    @BindView(7396)
    public ViewGroup newestUnreadLayout;
    @BindView(7521)
    public UDCheckBox recentLeftCb;
    @BindView(7522)
    public ViewGroup recentLeftLayout;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/WhenIViewAChatView$ViewDependency;", "", "()V", "injectView", "", "view", "Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/WhenIViewAChatView;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.wheniviewachat.WhenIViewAChatView$a */
    public static abstract class ViewDependency {
        /* renamed from: a */
        public void mo186346a(WhenIViewAChatView whenIViewAChatView) {
            Intrinsics.checkParameterIsNotNull(whenIViewAChatView, "view");
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f134810c.mo186346a(this);
    }

    /* renamed from: b */
    public final UDCheckBox mo186351b() {
        UDCheckBox uDCheckBox = this.recentLeftCb;
        if (uDCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentLeftCb");
        }
        return uDCheckBox;
    }

    /* renamed from: c */
    public final UDCheckBox mo186352c() {
        UDCheckBox uDCheckBox = this.newestUnreadCb;
        if (uDCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newestUnreadCb");
        }
        return uDCheckBox;
    }

    @Override // com.ss.android.lark.setting.page.content.general.wheniviewachat.IWhenIViewAChatContract.IView
    /* renamed from: a */
    public void mo186347a() {
        ViewGroup viewGroup = this.recentLeftLayout;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentLeftLayout");
        }
        viewGroup.setOnClickListener(new View$OnClickListenerC54526b(this));
        ViewGroup viewGroup2 = this.newestUnreadLayout;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newestUnreadLayout");
        }
        viewGroup2.setOnClickListener(new View$OnClickListenerC54527c(this));
        UDCheckBox uDCheckBox = this.recentLeftCb;
        if (uDCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentLeftCb");
        }
        uDCheckBox.setOnCheckedChangeListener(new C54528d(this));
        UDCheckBox uDCheckBox2 = this.newestUnreadCb;
        if (uDCheckBox2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newestUnreadCb");
        }
        uDCheckBox2.setOnCheckedChangeListener(new C54529e(this));
    }

    /* renamed from: a */
    public void setViewDelegate(IWhenIViewAChatContract.IView.Delegate aVar) {
        this.f134808a = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/setting/page/content/general/wheniviewachat/WhenIViewAChatView$initListeners$3", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$OnCheckedChangeListener;", "onCheckedChanged", "", "buttonView", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "isChecked", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.wheniviewachat.WhenIViewAChatView$d */
    public static final class C54528d implements UDCheckBox.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ WhenIViewAChatView f134813a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54528d(WhenIViewAChatView whenIViewAChatView) {
            this.f134813a = whenIViewAChatView;
        }

        @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
        public void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
            Intrinsics.checkParameterIsNotNull(uDCheckBox, "buttonView");
            if (!z && !this.f134813a.mo186352c().isChecked()) {
                this.f134813a.mo186351b().setChecked(true);
                SettingHitPointNew.m211614a(SettingHitPointNew.SettingDetailClickParam.CHAT_START_FROM, SettingHitPointNew.SettingDetailType.LEFT_OFF, SettingHitPointNew.SettingDetailType.LEFT_OFF);
            } else if (z) {
                this.f134813a.mo186352c().setChecked(false);
                IWhenIViewAChatContract.IView.Delegate aVar = this.f134813a.f134808a;
                if (aVar != null) {
                    aVar.mo186357a(Chat.MessagePosition.RECENT_LEFT);
                }
                SettingHitPointNew.m211614a(SettingHitPointNew.SettingDetailClickParam.CHAT_START_FROM, SettingHitPointNew.SettingDetailType.LEFT_OFF, SettingHitPointNew.SettingDetailType.RECENT_UNREAD);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/setting/page/content/general/wheniviewachat/WhenIViewAChatView$initListeners$4", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$OnCheckedChangeListener;", "onCheckedChanged", "", "buttonView", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "isChecked", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.wheniviewachat.WhenIViewAChatView$e */
    public static final class C54529e implements UDCheckBox.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ WhenIViewAChatView f134814a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54529e(WhenIViewAChatView whenIViewAChatView) {
            this.f134814a = whenIViewAChatView;
        }

        @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
        public void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
            Intrinsics.checkParameterIsNotNull(uDCheckBox, "buttonView");
            if (!z && !this.f134814a.mo186351b().isChecked()) {
                this.f134814a.mo186352c().setChecked(true);
                SettingHitPointNew.m211614a(SettingHitPointNew.SettingDetailClickParam.CHAT_START_FROM, SettingHitPointNew.SettingDetailType.RECENT_UNREAD, SettingHitPointNew.SettingDetailType.RECENT_UNREAD);
            } else if (z) {
                this.f134814a.mo186351b().setChecked(false);
                IWhenIViewAChatContract.IView.Delegate aVar = this.f134814a.f134808a;
                if (aVar != null) {
                    aVar.mo186357a(Chat.MessagePosition.NEWEST_UNREAD);
                }
                SettingHitPointNew.m211614a(SettingHitPointNew.SettingDetailClickParam.CHAT_START_FROM, SettingHitPointNew.SettingDetailType.RECENT_UNREAD, SettingHitPointNew.SettingDetailType.LEFT_OFF);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.wheniviewachat.WhenIViewAChatView$b */
    static final class View$OnClickListenerC54526b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WhenIViewAChatView f134811a;

        View$OnClickListenerC54526b(WhenIViewAChatView whenIViewAChatView) {
            this.f134811a = whenIViewAChatView;
        }

        public final void onClick(View view) {
            this.f134811a.mo186351b().setChecked(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.wheniviewachat.WhenIViewAChatView$c */
    static final class View$OnClickListenerC54527c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WhenIViewAChatView f134812a;

        View$OnClickListenerC54527c(WhenIViewAChatView whenIViewAChatView) {
            this.f134812a = whenIViewAChatView;
        }

        public final void onClick(View view) {
            this.f134812a.mo186352c().setChecked(true);
        }
    }

    @Override // com.ss.android.lark.setting.page.content.general.wheniviewachat.IWhenIViewAChatContract.IView
    /* renamed from: a */
    public void mo186350a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        LKUIToast.show(this.f134809b, str);
    }

    @Override // com.ss.android.lark.setting.page.content.general.wheniviewachat.IWhenIViewAChatContract.IView
    /* renamed from: a */
    public void mo186348a(Chat.MessagePosition messagePosition) {
        Intrinsics.checkParameterIsNotNull(messagePosition, "messagePosition");
        if (messagePosition == Chat.MessagePosition.NEWEST_UNREAD) {
            UDCheckBox uDCheckBox = this.newestUnreadCb;
            if (uDCheckBox == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newestUnreadCb");
            }
            uDCheckBox.setChecked(true);
            UDCheckBox uDCheckBox2 = this.recentLeftCb;
            if (uDCheckBox2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recentLeftCb");
            }
            uDCheckBox2.setChecked(false);
            return;
        }
        UDCheckBox uDCheckBox3 = this.recentLeftCb;
        if (uDCheckBox3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentLeftCb");
        }
        uDCheckBox3.setChecked(true);
        UDCheckBox uDCheckBox4 = this.newestUnreadCb;
        if (uDCheckBox4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newestUnreadCb");
        }
        uDCheckBox4.setChecked(false);
    }

    public WhenIViewAChatView(Context context, ViewDependency aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "viewDependency");
        this.f134809b = context;
        this.f134810c = aVar;
    }
}
