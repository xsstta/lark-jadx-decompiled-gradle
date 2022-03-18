package com.ss.android.lark.mail.impl.home.threadlist.header.status.storage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lark.pb.email.client.v1.Setting;
import com.bytedance.lark.pb.email.client.v1.StorageLimitNotify;
import com.google.firebase.messaging.Constants;
import com.larksuite.arch.jack.Async;
import com.larksuite.arch.jack.Disposable;
import com.larksuite.arch.jack.ISubscriber;
import com.larksuite.arch.jack.JackView;
import com.larksuite.arch.jack.JackViewModel;
import com.larksuite.arch.jack.LifecycleOwnerHolder;
import com.larksuite.arch.jack.State;
import com.larksuite.arch.jack.SubscriptionConfig;
import com.larksuite.arch.jack.Tuple1;
import com.larksuite.arch.jack.Tuple2;
import com.larksuite.arch.jack.Tuple3;
import com.larksuite.arch.jack.Tuple4;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.suite.R;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.mail.impl.home.DelayLoadComponent;
import com.ss.android.lark.mail.impl.home.threadlist.header.status.IStatusHeader;
import com.ss.android.lark.mail.impl.home.threadlist.header.status.IStatusHeaderRefresher;
import com.ss.android.lark.mail.impl.p2165d.C42047h;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.settings.appconfig.MailCapacityLimitConfig;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.tokenautocomplete.C43843b;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty1;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0016H\u0016J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/storage/StorageLimitTipsComponent;", "Lcom/ss/android/lark/mail/impl/home/DelayLoadComponent;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/storage/StorageState;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/storage/StorageLimitTipsViewModel;", "Lcom/larksuite/arch/jack/JackView;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/IStatusHeader;", "fragment", "Landroidx/fragment/app/Fragment;", "refresher", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/IStatusHeaderRefresher;", "mCurrentVisibility", "", "(Landroidx/fragment/app/Fragment;Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/IStatusHeaderRefresher;Z)V", "mCapacityBinding", "Lcom/ss/android/lark/mail/impl/databinding/MailHomeStatusCapacityBinding;", "getMCurrentVisibility", "()Z", "setMCurrentVisibility", "(Z)V", "viewStub", "Landroid/view/ViewStub;", "bindCapacityViewHolder", "", "item", "Lcom/bytedance/lark/pb/email/client/v1/StorageLimitNotify;", "buildWordingWithLink", "", "context", "Landroid/content/Context;", "tips", "", "getInitView", "Landroid/view/View;", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "onDelayInit", "setUDNoticeErrorStyle", "notice", "Lcom/larksuite/component/universe_design/notice/UDNotice;", "setUDNoticeWarningStyle", "setViewVisibility", "show", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.d.a */
public final class StorageLimitTipsComponent extends DelayLoadComponent<StorageState, StorageLimitTipsViewModel> implements JackView, IStatusHeader {

    /* renamed from: b */
    public C42047h f108574b;

    /* renamed from: c */
    public final IStatusHeaderRefresher f108575c;

    /* renamed from: d */
    private final ViewStub f108576d;

    /* renamed from: e */
    private final Fragment f108577e;

    /* renamed from: f */
    private boolean f108578f;

    @Override // com.ss.android.lark.mail.impl.home.threadlist.header.status.IStatusHeader
    /* renamed from: e */
    public boolean mo153243e() {
        return this.f108578f;
    }

    /* renamed from: a */
    public final void mo153288a(StorageLimitNotify storageLimitNotify) {
        CharSequence charSequence;
        String str;
        if (this.f108574b == null) {
            this.f108574b = C42047h.m167239a(this.f108576d.inflate());
            Unit unit = Unit.INSTANCE;
        }
        C42047h hVar = this.f108574b;
        if (hVar != null) {
            UDNotice a = hVar.mo151062a();
            Intrinsics.checkExpressionValueIsNotNull(a, "it.root");
            Boolean bool = storageLimitNotify.enable;
            Intrinsics.checkExpressionValueIsNotNull(bool, "item.enable");
            if (bool.booleanValue()) {
                a.setVisibility(0);
                a.setIconColorful(true);
                if (Intrinsics.compare(storageLimitNotify.limit.intValue(), 100) < 0) {
                    m170131a(a);
                    a.setIcon(R.drawable.ud_icon_warning_colorful);
                    a.setIconButton(R.drawable.ud_icon_close_outlined);
                    a.mo91032b(true);
                    HashMap hashMap = new HashMap();
                    hashMap.put("Number", "" + storageLimitNotify.limit);
                    Context requireContext = this.f108577e.requireContext();
                    Intrinsics.checkExpressionValueIsNotNull(requireContext, "fragment.requireContext()");
                    String a2 = C43819s.m173687a((int) R.string.Mail_Billing_ExceedNumberPleaseUpgrade, hashMap);
                    Intrinsics.checkExpressionValueIsNotNull(a2, "StringUtils.getStringCon…NumberPleaseUpgrade, key)");
                    charSequence = m170130a(requireContext, a2);
                    a.setIconButtonListener(new View$OnClickListenerC42664a(this, storageLimitNotify));
                } else {
                    m170132b(a);
                    a.setIcon(R.drawable.ud_icon_error_colorful);
                    a.mo91032b(false);
                    Boolean bool2 = storageLimitNotify.isAdmin;
                    Intrinsics.checkExpressionValueIsNotNull(bool2, "item.isAdmin");
                    if (bool2.booleanValue()) {
                        Context requireContext2 = this.f108577e.requireContext();
                        Intrinsics.checkExpressionValueIsNotNull(requireContext2, "fragment.requireContext()");
                        String a3 = C43819s.m173684a((int) R.string.Mail_Billing_FullUpgradePlan);
                        Intrinsics.checkExpressionValueIsNotNull(a3, "StringUtils.getString(st…_Billing_FullUpgradePlan)");
                        str = m170130a(requireContext2, a3);
                    } else {
                        String a4 = C43819s.m173684a((int) R.string.Mail_Billing_StorageFullServiceSuspendContactAdmin);
                        Intrinsics.checkExpressionValueIsNotNull(a4, "StringUtils.getString(\n …rviceSuspendContactAdmin)");
                        str = a4;
                    }
                    charSequence = str;
                }
                a.setText(charSequence);
                return;
            }
            a.setVisibility(8);
        }
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public LifecycleOwnerHolder mo86226a() {
        return JackView.C24027a.m87835a(this);
    }

    @Override // com.larksuite.arch.jack.LifecycleOwnerHolder
    public LifecycleOwner aZ_() {
        return JackView.C24027a.m87836b(this);
    }

    @Override // com.ss.android.lark.mail.impl.home.threadlist.header.HeaderComponentViewGetter
    /* renamed from: c */
    public View mo153210c() {
        return this.f108576d;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.f108577e.getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(lifecycle, "fragment.lifecycle");
        return lifecycle;
    }

    @Override // com.ss.android.lark.mail.impl.home.DelayLoadComponent
    /* renamed from: d */
    public void mo152510d() {
        ISubscriber.C24024a.m87808a(this, getValue(), (SubscriptionConfig) null, new C42667c(this), 1, (Object) null);
        C43350d a = C43350d.m172098a();
        Intrinsics.checkExpressionValueIsNotNull(a, "EmailSettingService.getInstance()");
        a.mo155021M().mo5923a(this.f108577e, new C42668d(this));
    }

    @Override // com.ss.android.lark.mail.impl.home.threadlist.header.status.IStatusHeader
    /* renamed from: a */
    public void mo153241a(boolean z) {
        this.f108578f = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mail/impl/home/threadlist/header/status/storage/StorageLimitTipsComponent$buildWordingWithLink$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.d.a$b */
    public static final class C42665b extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Context f108581a;

        C42665b(Context context) {
            this.f108581a = context;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"com/ss/android/lark/mail/impl/home/threadlist/header/status/storage/StorageLimitTipsComponent$buildWordingWithLink$1$onClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/mail/impl/settings/appconfig/MailCapacityLimitConfig;", "defaultServiceUrl", "", "getDefaultServiceUrl", "()Ljava/lang/String;", "setDefaultServiceUrl", "(Ljava/lang/String;)V", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "config", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.d.a$b$a */
        public static final class C42666a implements IGetDataCallback<MailCapacityLimitConfig> {

            /* renamed from: a */
            final /* synthetic */ C42665b f108582a;

            /* renamed from: b */
            final /* synthetic */ View f108583b;

            /* renamed from: c */
            private String f108584c;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                C42699a.m170291j(this.f108582a.f108581a, this.f108584c);
            }

            /* renamed from: a */
            public void onSuccess(MailCapacityLimitConfig mailCapacityLimitConfig) {
                Intrinsics.checkParameterIsNotNull(mailCapacityLimitConfig, "config");
                String str = mailCapacityLimitConfig.f110280a;
                if (TextUtils.isEmpty(str)) {
                    str = this.f108584c;
                }
                C42699a.m170291j(this.f108583b.getContext(), str);
            }

            C42666a(C42665b bVar, View view) {
                String str;
                this.f108582a = bVar;
                this.f108583b = view;
                if (C26284k.m95186b(bVar.f108581a)) {
                    str = "https://applink.feishu.cn/client/helpdesk/open?id=6934871265543159828&extra=%7B%22channel%22%3A14%2C%22created_at%22%3A1617246713%2C%22human_service%22%3Atrue%2C%22scenario_id%22%3A6937491551345967123%2C%22signature%22%3A%229df9ed53d1cd7fd62be8055f37ab2f8b8cf71583%22%7D";
                } else {
                    str = "https://applink.feishu.cn/client/helpdesk/open?id=6626260912531570952&extra=%7B%22channel%22%3A14%2C%22created_at%22%3A1616898084%2C%22human_service%22%3Atrue%2C%22scenario_id%22%3A6888204905589325826%2C%22signature%22%3A%2278b0c5156b727a66d02c9b689ea0785d1a865bb5%22%7D";
                }
                this.f108584c = str;
            }
        }

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            SettingManager.getInstance().get(MailCapacityLimitConfig.class, new C42666a(this, view));
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setColor(UIHelper.getColor(R.color.primary_pri_500));
            textPaint.setUnderlineText(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/storage/StorageState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.d.a$c */
    static final class C42667c extends Lambda implements Function1<StorageState, Unit> {
        final /* synthetic */ StorageLimitTipsComponent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42667c(StorageLimitTipsComponent aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StorageState cVar) {
            invoke(cVar);
            return Unit.INSTANCE;
        }

        public final void invoke(StorageState cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "$receiver");
            Boolean bool = cVar.mo153299a().enable;
            Intrinsics.checkExpressionValueIsNotNull(bool, "capacityLimitItem.enable");
            if (!bool.booleanValue() || Intrinsics.compare(cVar.mo153299a().limit.intValue(), 100) > 0) {
                this.this$0.f108575c.mo153260a(this.this$0, false);
            } else {
                this.this$0.f108575c.mo153260a(this.this$0, true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/storage/StorageState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.d.a$e */
    static final class C42669e extends Lambda implements Function1<StorageState, Unit> {
        final /* synthetic */ StorageLimitTipsComponent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42669e(StorageLimitTipsComponent aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StorageState cVar) {
            invoke(cVar);
            return Unit.INSTANCE;
        }

        public final void invoke(StorageState cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            if (this.this$0.mo153243e()) {
                this.this$0.mo153288a(cVar.mo153299a());
                return;
            }
            C42047h hVar = this.this$0.f108574b;
            if (hVar != null) {
                UDNotice a = hVar.mo151062a();
                Intrinsics.checkExpressionValueIsNotNull(a, "it.root");
                a.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/mail/impl/home/threadlist/header/status/storage/StorageLimitTipsComponent$bindCapacityViewHolder$2$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.d.a$a */
    public static final class View$OnClickListenerC42664a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StorageLimitTipsComponent f108579a;

        /* renamed from: b */
        final /* synthetic */ StorageLimitNotify f108580b;

        View$OnClickListenerC42664a(StorageLimitTipsComponent aVar, StorageLimitNotify storageLimitNotify) {
            this.f108579a = aVar;
            this.f108580b = storageLimitNotify;
        }

        public final void onClick(View view) {
            C43350d.m172098a().mo155026a(new Setting.C16982a().mo59982a(new StorageLimitNotify.C16990a().mo60020a(Boolean.FALSE).mo60021a(this.f108580b.limit).mo60023b(this.f108580b.isAdmin).build()).build(), 11, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/lark/pb/email/client/v1/StorageLimitNotify;", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.d.a$d */
    static final class C42668d<T> implements AbstractC1178x<StorageLimitNotify> {

        /* renamed from: a */
        final /* synthetic */ StorageLimitTipsComponent f108585a;

        C42668d(StorageLimitTipsComponent aVar) {
            this.f108585a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(StorageLimitNotify storageLimitNotify) {
            StorageLimitNotify storageLimitNotify2;
            if (storageLimitNotify != null) {
                storageLimitNotify2 = new StorageLimitNotify(storageLimitNotify.limit, storageLimitNotify.enable, storageLimitNotify.isAdmin);
            } else {
                storageLimitNotify2 = new StorageLimitNotify(0, false, false);
            }
            ((StorageLimitTipsViewModel) this.f108585a.getValue()).updateCapacityStatus(storageLimitNotify2);
        }
    }

    /* renamed from: a */
    private final void m170131a(UDNotice uDNotice) {
        uDNotice.setBackgroundColor(UIHelper.getColor(R.color.function_warning_100));
        uDNotice.setTextColor(UIHelper.getColor(R.color.text_title));
        uDNotice.setIconColor(UIHelper.getColor(R.color.function_warning_500));
        uDNotice.setIconButtonColor(UIHelper.getColor(R.color.icon_n2));
        uDNotice.setTextButtonColor(UIHelper.getColor(R.color.primary_pri_500));
        uDNotice.setTextActionColor(UIHelper.getColor(R.color.primary_pri_500));
    }

    /* renamed from: b */
    private final void m170132b(UDNotice uDNotice) {
        uDNotice.setBackgroundColor(UIHelper.getColor(R.color.function_danger_100));
        uDNotice.setTextColor(UIHelper.getColor(R.color.text_title));
        uDNotice.setIconColor(UIHelper.getColor(R.color.function_danger_500));
        uDNotice.setIconButtonColor(UIHelper.getColor(R.color.icon_n2));
        uDNotice.setTextButtonColor(UIHelper.getColor(R.color.primary_pri_500));
        uDNotice.setTextActionColor(UIHelper.getColor(R.color.primary_pri_500));
    }

    @Override // com.ss.android.lark.mail.impl.home.threadlist.header.status.IStatusHeader
    /* renamed from: b */
    public void mo153242b(boolean z) {
        if (z) {
            ((StorageLimitTipsViewModel) getValue()).withState(new C42669e(this));
            return;
        }
        C42047h hVar = this.f108574b;
        if (hVar != null) {
            UDNotice a = hVar.mo151062a();
            Intrinsics.checkExpressionValueIsNotNull(a, "it.root");
            a.setVisibility(8);
        }
    }

    /* renamed from: a */
    private final CharSequence m170130a(Context context, String str) {
        String a = C43819s.m173684a((int) R.string.Mail_Billing_ContactServiceConsultant);
        SpannableString spannableString = new SpannableString(StringsKt.trimIndent("\n    " + str + "\n    " + a + "\n    "));
        int length = str.length() + 1;
        spannableString.setSpan(new C42665b(context), length, a.length() + length, 33);
        spannableString.setSpan(new C43843b(UIHelper.dp2px(24.0f)), length, a.length() + length, 33);
        return spannableString;
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State> Disposable mo86220a(JackViewModel<S> lVar, SubscriptionConfig<S> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$subscribe");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87829a(this, lVar, vVar, function1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StorageLimitTipsComponent(androidx.fragment.app.Fragment r12, com.ss.android.lark.mail.impl.home.threadlist.header.status.IStatusHeaderRefresher r13, boolean r14) {
        /*
            r11 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r0)
            java.lang.String r0 = "refresher"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r13, r0)
            androidx.lifecycle.ak r2 = r12.getViewModelStore()
            java.lang.String r0 = "fragment.viewModelStore"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r0)
            androidx.lifecycle.ai$b r3 = r12.getDefaultViewModelProviderFactory()
            java.lang.String r0 = "fragment.defaultViewModelProviderFactory"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r0)
            java.lang.Class<com.ss.android.lark.mail.impl.home.threadlist.header.b.d.b> r0 = com.ss.android.lark.mail.impl.home.threadlist.header.status.storage.StorageLimitTipsViewModel.class
            kotlin.reflect.KClass r4 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
            r5 = 0
            r7 = 0
            r9 = 24
            r10 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r7, r9, r10)
            r11.f108577e = r12
            r11.f108575c = r13
            r11.f108578f = r14
            android.view.ViewStub r13 = new android.view.ViewStub
            android.content.Context r12 = r12.getContext()
            r13.<init>(r12)
            r12 = 2131494805(0x7f0c0795, float:1.8613129E38)
            r13.setLayoutResource(r12)
            android.view.ViewGroup$LayoutParams r12 = new android.view.ViewGroup$LayoutParams
            r14 = -1
            r0 = -2
            r12.<init>(r14, r0)
            r13.setLayoutParams(r12)
            r11.f108576d = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.home.threadlist.header.status.storage.StorageLimitTipsComponent.<init>(androidx.fragment.app.Fragment, com.ss.android.lark.mail.impl.home.threadlist.header.b.b, boolean):void");
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A> Disposable mo86221a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, SubscriptionConfig<Tuple1<A>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87830a(this, lVar, eVar, vVar, function1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StorageLimitTipsComponent(Fragment fragment, IStatusHeaderRefresher bVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, bVar, (i & 4) != 0 ? false : z);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B> Disposable mo86223a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, SubscriptionConfig<Tuple2<A, B>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87832a(this, lVar, eVar, eVar2, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, T> Disposable mo86222a(JackViewModel<S> lVar, KProperty1<S, ? extends Async<? extends T>> eVar, SubscriptionConfig<Tuple1<Async<T>>> vVar, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        return JackView.C24027a.m87831a(this, lVar, eVar, vVar, function1, function0, function12);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B, C> Disposable mo86224a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, SubscriptionConfig<Tuple3<A, B, C>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87833a(this, lVar, eVar, eVar2, eVar3, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B, C, D> Disposable mo86225a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, KProperty1<S, ? extends D> eVar4, SubscriptionConfig<Tuple4<A, B, C, D>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
        Intrinsics.checkParameterIsNotNull(eVar4, "prop4");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87834a(this, lVar, eVar, eVar2, eVar3, eVar4, vVar, function1);
    }
}
