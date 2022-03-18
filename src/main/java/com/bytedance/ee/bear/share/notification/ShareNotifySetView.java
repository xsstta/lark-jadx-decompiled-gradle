package com.bytedance.ee.bear.share.notification;

import android.content.Context;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13748k;
import com.larksuite.component.universe_design.p1166switch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.lark.doc.IFetchRemindCallback;
import com.ss.android.lark.doc.IPutRemindCallback;
import com.ss.android.lark.doc.IRemindStateChangeListener;
import com.ss.android.lark.doc.IReminder;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0004#$%&B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\u001a\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0019H\u0014J\u0018\u0010!\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\b\u0010\"\u001a\u00020\u0019H\u0002R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0018\u00010\u0011R\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0018\u00010\u0013R\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0018\u00010\u0015R\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/bytedance/ee/bear/share/notification/ShareNotifySetView;", "Landroid/widget/RelativeLayout;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "deathRecipient", "Landroid/os/IBinder$DeathRecipient;", "docFeedId", "", "fetchRemindCallback", "Lcom/bytedance/ee/bear/share/notification/ShareNotifySetView$IFetchRemindCallbackImpl;", "putRemindCallback", "Lcom/bytedance/ee/bear/share/notification/ShareNotifySetView$IPutRemindCallbackImpl;", "remindStateChangeListener", "Lcom/bytedance/ee/bear/share/notification/ShareNotifySetView$IRemindStateChangeListenerImpl;", "reminder", "Lcom/ss/android/lark/doc/IReminder;", "init", "", "initNotification", "onCheckedChanged", "buttonView", "Landroid/widget/CompoundButton;", "isChecked", "", "onDetachedFromWindow", "setInfo", "setRemindState", "Companion", "IFetchRemindCallbackImpl", "IPutRemindCallbackImpl", "IRemindStateChangeListenerImpl", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ShareNotifySetView extends RelativeLayout implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: g */
    public static final Companion f29634g = new Companion(null);

    /* renamed from: a */
    public String f29635a;

    /* renamed from: b */
    public IReminder f29636b;

    /* renamed from: c */
    public IBinder.DeathRecipient f29637c;

    /* renamed from: d */
    public IRemindStateChangeListenerImpl f29638d;

    /* renamed from: e */
    public IFetchRemindCallbackImpl f29639e;

    /* renamed from: f */
    public IPutRemindCallbackImpl f29640f;

    /* renamed from: h */
    private HashMap f29641h;

    /* renamed from: a */
    public View mo42014a(int i) {
        if (this.f29641h == null) {
            this.f29641h = new HashMap();
        }
        View view = (View) this.f29641h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f29641h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/share/notification/ShareNotifySetView$Companion;", "", "()V", "TAG", "", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.notification.ShareNotifySetView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0002¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/share/notification/ShareNotifySetView$IPutRemindCallbackImpl;", "Lcom/ss/android/lark/doc/IPutRemindCallback$Stub;", "(Lcom/bytedance/ee/bear/share/notification/ShareNotifySetView;)V", "onFaile", "", "code", "", "onSuccess", "docFeedId", "", "registerRemindListener", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public final class IPutRemindCallbackImpl extends IPutRemindCallback.Stub {
        private final void registerRemindListener() {
            IReminder iReminder;
            try {
                if (ShareNotifySetView.this.isAttachedToWindow() && ShareNotifySetView.this.f29636b != null && ShareNotifySetView.this.f29638d != null && (iReminder = ShareNotifySetView.this.f29636b) != null) {
                    iReminder.registerRemindListener(ShareNotifySetView.this.f29638d);
                }
            } catch (Throwable th) {
                C13479a.m54759a("ShareNotifySetView", "IPutRemindCallbackImpl registerRemindListener error", th);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public IPutRemindCallbackImpl() {
        }

        @Override // com.ss.android.lark.doc.IPutRemindCallback
        public void onSuccess(String str) {
            C13479a.m54764b("ShareNotifySetView", " remind set success");
            registerRemindListener();
        }

        @Override // com.ss.android.lark.doc.IPutRemindCallback
        public void onFaile(int i) {
            C13479a.m54758a("ShareNotifySetView", " remind set failed, code = " + i);
            registerRemindListener();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "binderDied"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.notification.ShareNotifySetView$b */
    public static final class C11018b implements IBinder.DeathRecipient {

        /* renamed from: a */
        final /* synthetic */ ShareNotifySetView f29648a;

        C11018b(ShareNotifySetView shareNotifySetView) {
            this.f29648a = shareNotifySetView;
        }

        public final void binderDied() {
            IBinder asBinder;
            IReminder iReminder = this.f29648a.f29636b;
            if (!(iReminder == null || (asBinder = iReminder.asBinder()) == null)) {
                IBinder.DeathRecipient deathRecipient = this.f29648a.f29637c;
                if (deathRecipient == null) {
                    Intrinsics.throwNpe();
                }
                asBinder.unlinkToDeath(deathRecipient, 0);
            }
            this.f29648a.f29636b = null;
            this.f29648a.f29639e = null;
            this.f29648a.f29638d = null;
            this.f29648a.f29640f = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        IReminder iReminder;
        super.onDetachedFromWindow();
        try {
            IRemindStateChangeListenerImpl iRemindStateChangeListenerImpl = this.f29638d;
            if (!(iRemindStateChangeListenerImpl == null || (iReminder = this.f29636b) == null)) {
                iReminder.unRegisterRemindListener(iRemindStateChangeListenerImpl);
            }
            this.f29636b = null;
            this.f29638d = null;
            this.f29640f = null;
            this.f29639e = null;
        } catch (Throwable th) {
            C13479a.m54759a("ShareNotifySetView", "unRegisterRemindListener error", th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/share/notification/ShareNotifySetView$IFetchRemindCallbackImpl;", "Lcom/ss/android/lark/doc/IFetchRemindCallback$Stub;", "(Lcom/bytedance/ee/bear/share/notification/ShareNotifySetView;)V", "onFaile", "", "code", "", "onSuccess", "feedDocId", "", "remind", "", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public final class IFetchRemindCallbackImpl extends IFetchRemindCallback.Stub {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.share.notification.ShareNotifySetView$IFetchRemindCallbackImpl$a */
        static final class RunnableC11016a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ IFetchRemindCallbackImpl f29642a;

            /* renamed from: b */
            final /* synthetic */ boolean f29643b;

            /* renamed from: c */
            final /* synthetic */ String f29644c;

            RunnableC11016a(IFetchRemindCallbackImpl iFetchRemindCallbackImpl, boolean z, String str) {
                this.f29642a = iFetchRemindCallbackImpl;
                this.f29643b = z;
                this.f29644c = str;
            }

            public final void run() {
                if (ShareNotifySetView.this.isAttachedToWindow()) {
                    boolean z = this.f29643b;
                    UDSwitch uDSwitch = (UDSwitch) ShareNotifySetView.this.mo42014a(R.id.shareNotificationSwitch);
                    Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "shareNotificationSwitch");
                    if (z != uDSwitch.isChecked() && TextUtils.equals(ShareNotifySetView.this.f29635a, this.f29644c)) {
                        UDSwitch uDSwitch2 = (UDSwitch) ShareNotifySetView.this.mo42014a(R.id.shareNotificationSwitch);
                        Intrinsics.checkExpressionValueIsNotNull(uDSwitch2, "shareNotificationSwitch");
                        uDSwitch2.setChecked(this.f29643b);
                    }
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public IFetchRemindCallbackImpl() {
        }

        @Override // com.ss.android.lark.doc.IFetchRemindCallback
        public void onFaile(int i) {
            C13479a.m54758a("ShareNotifySetView", "remind getState fail");
        }

        @Override // com.ss.android.lark.doc.IFetchRemindCallback
        public void onSuccess(String str, boolean z) {
            C13748k.m55732a(new RunnableC11016a(this, z, str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/share/notification/ShareNotifySetView$IRemindStateChangeListenerImpl;", "Lcom/ss/android/lark/doc/IRemindStateChangeListener$Stub;", "(Lcom/bytedance/ee/bear/share/notification/ShareNotifySetView;)V", "onChange", "", "feedId", "", "isRemind", "", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public final class IRemindStateChangeListenerImpl extends IRemindStateChangeListener.Stub {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.share.notification.ShareNotifySetView$IRemindStateChangeListenerImpl$a */
        static final class RunnableC11017a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ IRemindStateChangeListenerImpl f29645a;

            /* renamed from: b */
            final /* synthetic */ boolean f29646b;

            /* renamed from: c */
            final /* synthetic */ String f29647c;

            RunnableC11017a(IRemindStateChangeListenerImpl iRemindStateChangeListenerImpl, boolean z, String str) {
                this.f29645a = iRemindStateChangeListenerImpl;
                this.f29646b = z;
                this.f29647c = str;
            }

            public final void run() {
                if (ShareNotifySetView.this.isAttachedToWindow()) {
                    boolean z = this.f29646b;
                    UDSwitch uDSwitch = (UDSwitch) ShareNotifySetView.this.mo42014a(R.id.shareNotificationSwitch);
                    Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "shareNotificationSwitch");
                    if (z != uDSwitch.isChecked() && TextUtils.equals(ShareNotifySetView.this.f29635a, this.f29647c)) {
                        UDSwitch uDSwitch2 = (UDSwitch) ShareNotifySetView.this.mo42014a(R.id.shareNotificationSwitch);
                        Intrinsics.checkExpressionValueIsNotNull(uDSwitch2, "shareNotificationSwitch");
                        uDSwitch2.setChecked(this.f29646b);
                    }
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public IRemindStateChangeListenerImpl() {
        }

        @Override // com.ss.android.lark.doc.IRemindStateChangeListener
        public void onChange(String str, boolean z) {
            C13748k.m55732a(new RunnableC11017a(this, z, str));
        }
    }

    /* renamed from: a */
    private final void m45877a() {
        IBinder asBinder;
        IReminder iReminder = this.f29636b;
        boolean z = true;
        int i = 0;
        if (iReminder == null || (asBinder = iReminder.asBinder()) == null || !asBinder.isBinderAlive() || TextUtils.isEmpty(this.f29635a)) {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        setVisibility(i);
        if (z) {
            if (this.f29639e == null) {
                this.f29639e = new IFetchRemindCallbackImpl();
            }
            if (this.f29638d == null) {
                this.f29638d = new IRemindStateChangeListenerImpl();
            }
            if (this.f29637c == null) {
                this.f29637c = new C11018b(this);
            }
            try {
                IReminder iReminder2 = this.f29636b;
                if (iReminder2 != null) {
                    iReminder2.getRemindState(this.f29635a, this.f29639e);
                }
                IReminder iReminder3 = this.f29636b;
                if (iReminder3 != null) {
                    iReminder3.registerRemindListener(this.f29638d);
                }
            } catch (Throwable th) {
                C13479a.m54759a("ShareNotifySetView", "init notification error", th);
            }
        }
    }

    /* renamed from: b */
    private final void m45879b() {
        IBinder asBinder;
        IReminder iReminder;
        StringBuilder sb = new StringBuilder();
        sb.append("set remind state: ");
        UDSwitch uDSwitch = (UDSwitch) mo42014a(R.id.shareNotificationSwitch);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "shareNotificationSwitch");
        sb.append(uDSwitch.isChecked());
        C13479a.m54764b("ShareNotifySetView", sb.toString());
        try {
            IReminder iReminder2 = this.f29636b;
            if (iReminder2 != null && (asBinder = iReminder2.asBinder()) != null && asBinder.isBinderAlive()) {
                if (this.f29640f == null) {
                    this.f29640f = new IPutRemindCallbackImpl();
                }
                IRemindStateChangeListenerImpl iRemindStateChangeListenerImpl = this.f29638d;
                if (!(iRemindStateChangeListenerImpl == null || (iReminder = this.f29636b) == null)) {
                    iReminder.registerRemindListener(iRemindStateChangeListenerImpl);
                }
                IReminder iReminder3 = this.f29636b;
                if (iReminder3 != null) {
                    String str = this.f29635a;
                    UDSwitch uDSwitch2 = (UDSwitch) mo42014a(R.id.shareNotificationSwitch);
                    Intrinsics.checkExpressionValueIsNotNull(uDSwitch2, "shareNotificationSwitch");
                    iReminder3.setRemind(str, uDSwitch2.isChecked(), this.f29640f);
                }
            }
        } catch (Throwable th) {
            C13479a.m54759a("ShareNotifySetView", "setRemindState error", th);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShareNotifySetView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m45878a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.share_notification_layout, this);
        ((UDSwitch) mo42014a(R.id.shareNotificationSwitch)).setOnCheckedChangeListener(this);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        m45879b();
    }

    /* renamed from: a */
    public final void mo42015a(String str, IReminder iReminder) {
        Intrinsics.checkParameterIsNotNull(str, "docFeedId");
        this.f29635a = str;
        this.f29636b = iReminder;
        m45877a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShareNotifySetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareNotifySetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f29635a = "";
        m45878a(context);
    }
}
