package com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.universe_design.p1166switch.UDSwitch;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.IPrivacySettingContactV2;
import com.ss.android.lark.contact.impl.statistics.PrivacyHitPoint;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\fH\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/PrivacySettingViewV2;", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/IPrivacySettingContactV2$IView;", "mContext", "Landroid/content/Context;", "mRootView", "Landroid/view/View;", "mViewDependency", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/PrivacySettingViewV2$ViewDependency;", "(Landroid/content/Context;Landroid/view/View;Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/PrivacySettingViewV2$ViewDependency;)V", "mBlockListListener", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "mDelegate", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/IPrivacySettingContactV2$IView$Delegate;", "create", "", "destroy", "hideBlockView", "init", "initPhoneCheckNotification", "initTitleBar", "setViewDelegate", "viewDelegate", "showErrorToast", "showNotificationStatus", "isChecked", "", "updateBlockNum", "number", "", "updateBlockView", "Companion", "ViewDependency", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.e */
public final class PrivacySettingViewV2 implements IPrivacySettingContactV2.IView {

    /* renamed from: c */
    public static final Companion f93179c = new Companion(null);

    /* renamed from: a */
    public IPrivacySettingContactV2.IView.Delegate f93180a;

    /* renamed from: b */
    public final ViewDependency f93181b;

    /* renamed from: d */
    private final OnSingleClickListener f93182d = new C36053f(this);

    /* renamed from: e */
    private final Context f93183e;

    /* renamed from: f */
    private final View f93184f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/PrivacySettingViewV2$ViewDependency;", "", "finishPage", "", "startAddMeWayPage", "startBlockListPage", "startSingleChatPage", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.e$b */
    public interface ViewDependency {
        /* renamed from: a */
        void mo132564a();

        /* renamed from: b */
        void mo132565b();

        /* renamed from: c */
        void mo132566c();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/PrivacySettingViewV2$Companion;", "", "()V", "TAG", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m141389c();
    }

    @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.IPrivacySettingContactV2.IView
    /* renamed from: b */
    public void mo132561b() {
        Log.m165383e("PrivacySettingViewV2", "Failed to update user phone check notification setting");
        UDToast.show(this.f93183e, (int) R.string.Lark_Setting_PrivacySetupFailed);
    }

    @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.IPrivacySettingContactV2.IView
    /* renamed from: a */
    public void mo132558a() {
        TextView textView = (TextView) this.f93184f.findViewById(R.id.text_contact_list_number);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.text_contact_list_number");
        textView.setText("");
    }

    /* renamed from: e */
    private final void m141391e() {
        int i;
        LinearLayout linearLayout = (LinearLayout) this.f93184f.findViewById(R.id.layout_phone_check_notification);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "mRootView.layout_phone_check_notification");
        AbstractC35361b a = C35358a.m138143a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ContactModule.getDependency()");
        if (a.mo130150b().mo130208a("messenger.message_settings_viewphone_notification")) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    /* renamed from: c */
    private final void m141389c() {
        m141390d();
        m141391e();
        ((ConstraintLayout) this.f93184f.findViewById(R.id.layout_add_me_way)).setOnClickListener(new C36050c(this));
        ((ConstraintLayout) this.f93184f.findViewById(R.id.layout_chat_me)).setOnClickListener(new C36051d(this));
        ((ConstraintLayout) this.f93184f.findViewById(R.id.layout_contact_list)).setOnClickListener(this.f93182d);
        ((UDSwitch) this.f93184f.findViewById(R.id.switch_phone_check_notification)).setOnCheckedChangeListener(new C36052e(this));
    }

    /* renamed from: d */
    private final void m141390d() {
        if (!DesktopUtil.m144301a(this.f93183e)) {
            CommonTitleBar commonTitleBar = (CommonTitleBar) this.f93184f.findViewById(R.id.title_bar);
            Intrinsics.checkExpressionValueIsNotNull(commonTitleBar, "mRootView.title_bar");
            commonTitleBar.setVisibility(0);
            TextView textView = (TextView) this.f93184f.findViewById(R.id.desktop_mine_title);
            Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.desktop_mine_title");
            textView.setVisibility(8);
            ((CommonTitleBar) this.f93184f.findViewById(R.id.title_bar)).setTitle(R.string.Lark_NewSettings_Privacy);
            return;
        }
        CommonTitleBar commonTitleBar2 = (CommonTitleBar) this.f93184f.findViewById(R.id.title_bar);
        Intrinsics.checkExpressionValueIsNotNull(commonTitleBar2, "mRootView.title_bar");
        commonTitleBar2.setVisibility(8);
        TextView textView2 = (TextView) this.f93184f.findViewById(R.id.desktop_mine_title);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "mRootView.desktop_mine_title");
        textView2.setVisibility(0);
        ((TextView) this.f93184f.findViewById(R.id.desktop_mine_title)).setText(R.string.Lark_NewSettings_Privacy);
    }

    @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.IPrivacySettingContactV2.IView
    /* renamed from: a */
    public void mo132559a(int i) {
        m141388b(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/PrivacySettingViewV2$init$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.e$c */
    public static final class C36050c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ PrivacySettingViewV2 f93185a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36050c(PrivacySettingViewV2 eVar) {
            this.f93185a = eVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f93185a.f93181b.mo132564a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/PrivacySettingViewV2$init$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.e$d */
    public static final class C36051d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ PrivacySettingViewV2 f93186a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36051d(PrivacySettingViewV2 eVar) {
            this.f93186a = eVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f93186a.f93181b.mo132565b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/PrivacySettingViewV2$mBlockListListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.e$f */
    public static final class C36053f extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ PrivacySettingViewV2 f93188a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36053f(PrivacySettingViewV2 eVar) {
            this.f93188a = eVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f93188a.f93181b.mo132566c();
        }
    }

    /* renamed from: a */
    public void setViewDelegate(IPrivacySettingContactV2.IView.Delegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f93180a = aVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ IPrivacySettingContactV2.IView.Delegate m141387a(PrivacySettingViewV2 eVar) {
        IPrivacySettingContactV2.IView.Delegate aVar = eVar.f93180a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDelegate");
        }
        return aVar;
    }

    /* renamed from: b */
    private final void m141388b(int i) {
        String mustacheFormat = UIHelper.mustacheFormat(UIHelper.getString(R.string.Lark_NewSettings_BlocklistCountUser), "N", String.valueOf(i));
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…stCountUser), \"N\", count)");
        TextView textView = (TextView) this.f93184f.findViewById(R.id.text_contact_list_number);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.text_contact_list_number");
        textView.setText(mustacheFormat);
    }

    @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.IPrivacySettingContactV2.IView
    /* renamed from: a */
    public void mo132560a(boolean z) {
        UDSwitch uDSwitch = (UDSwitch) this.f93184f.findViewById(R.id.switch_phone_check_notification);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "mRootView.switch_phone_check_notification");
        uDSwitch.setChecked(z);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.e$e */
    public static final class C36052e implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ PrivacySettingViewV2 f93187a;

        C36052e(PrivacySettingViewV2 eVar) {
            this.f93187a = eVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            PrivacySettingViewV2.m141387a(this.f93187a).mo132562a(z);
            PrivacyHitPoint.f92909a.mo132209a(z);
        }
    }

    public PrivacySettingViewV2(Context context, View view, ViewDependency bVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        Intrinsics.checkParameterIsNotNull(bVar, "mViewDependency");
        this.f93183e = context;
        this.f93184f = view;
        this.f93181b = bVar;
    }
}
