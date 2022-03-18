package com.ss.android.vc.meeting.module.enterprisephone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.dto.VCLaunchError;
import com.ss.android.vc.entity.VcEnterprisePhoneLinkConfig;
import com.ss.android.vc.meeting.framework.manager.C61282e;
import com.ss.android.vc.service.IVideoChatService;
import com.ss.android.vc.service.VideoChatManager;
import com.ss.android.vc.service.impl.VideoChatService;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneLimitationObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "chatId", "", "chatter", "Lcom/ss/android/lark/chat/export/entity/chatter/OpenChatter;", "closeView", "Landroid/view/View;", "getFragment", "()Landroidx/fragment/app/Fragment;", "setFragment", "learnMore", "mRootView", "url", "voiceCallView", "warningContentView", "Landroid/widget/TextView;", "initLimitationViews", "", "showStatusBar", "show", "", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class EnterprisePhoneLimitationObserver implements DefaultLifecycleObserver {

    /* renamed from: d */
    public static final Companion f154634d = new Companion(null);

    /* renamed from: a */
    public OpenChatter f154635a;

    /* renamed from: b */
    public String f154636b;

    /* renamed from: c */
    public String f154637c;

    /* renamed from: e */
    private View f154638e;

    /* renamed from: f */
    private View f154639f;

    /* renamed from: g */
    private TextView f154640g;

    /* renamed from: h */
    private View f154641h;

    /* renamed from: i */
    private View f154642i;

    /* renamed from: j */
    private Fragment f154643j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneLimitationObserver$initLimitationViews$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneLimitationObserver$c */
    public static final class C61642c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneLimitationObserver f154645a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneLimitationObserver$initLimitationViews$2$onSingleClick$1", "Lcom/ss/android/vc/service/IVideoChatService$IVCLaunchResultCallback;", "onError", "", "error", "Lcom/ss/android/vc/dto/VCLaunchError;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneLimitationObserver$c$a */
        public static final class C61643a implements IVideoChatService.AbstractC63626a {
            C61643a() {
            }

            @Override // com.ss.android.vc.service.IVideoChatService.AbstractC63626a
            public void onError(VCLaunchError vCLaunchError) {
                C60700b.m235851b("EnterprisePhoneLog_EnterpriseCallLimitationObserver", "[launchVideoChat]", "failure");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61642c(EnterprisePhoneLimitationObserver enterprisePhoneLimitationObserver) {
            this.f154645a = enterprisePhoneLimitationObserver;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            C60700b.m235851b("EnterprisePhoneLog_EnterpriseCallLimitationObserver", "[onClick]", "voiceCallView");
            VideoChatService.m249602d().mo220075a(this.f154645a.f154635a, this.f154645a.f154636b, "", false, true, new C61643a());
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        DefaultLifecycleObserver.CC.$default$onCreate(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        DefaultLifecycleObserver.CC.$default$onDestroy(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        DefaultLifecycleObserver.CC.$default$onPause(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        DefaultLifecycleObserver.CC.$default$onResume(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        DefaultLifecycleObserver.CC.$default$onStart(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        DefaultLifecycleObserver.CC.$default$onStop(this, lifecycleOwner);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneLimitationObserver$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneLimitationObserver$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final Fragment mo213535a() {
        return this.f154643j;
    }

    /* renamed from: b */
    private final void m240594b() {
        View view;
        View view2;
        TextView textView;
        String str;
        View view3 = this.f154638e;
        View view4 = null;
        if (view3 != null) {
            view = view3.findViewById(R.id.iv_close);
        } else {
            view = null;
        }
        this.f154639f = view;
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC61641b(this));
        }
        View view5 = this.f154638e;
        if (view5 != null) {
            view2 = view5.findViewById(R.id.container_voice_call);
        } else {
            view2 = null;
        }
        this.f154641h = view2;
        if (view2 != null) {
            view2.setOnClickListener(new C61642c(this));
        }
        View view6 = this.f154638e;
        if (view6 != null) {
            textView = (TextView) view6.findViewById(R.id.warning_content);
        } else {
            textView = null;
        }
        this.f154640g = textView;
        if (textView != null) {
            OpenChatter openChatter = this.f154635a;
            if (openChatter != null) {
                str = openChatter.getName();
            } else {
                str = null;
            }
            textView.setText(UIHelper.mustacheFormat((int) R.string.View_MV_HelloAdminControlled, "name", str));
        }
        View view7 = this.f154638e;
        if (view7 != null) {
            view4 = view7.findViewById(R.id.container_learn_more);
        }
        this.f154642i = view4;
        if (view4 != null) {
            view4.setOnClickListener(new C61644d(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneLimitationObserver$initLimitationViews$3", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneLimitationObserver$d */
    public static final class C61644d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneLimitationObserver f154646a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61644d(EnterprisePhoneLimitationObserver enterprisePhoneLimitationObserver) {
            this.f154646a = enterprisePhoneLimitationObserver;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            C60700b.m235851b("EnterprisePhoneLog_EnterpriseCallLimitationObserver", "[onClick]", "learnMore, url is empty:" + TextUtils.isEmpty(this.f154646a.f154637c));
            FragmentActivity activity = this.f154646a.mo213535a().getActivity();
            if (activity != null) {
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f154646a.f154637c)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneLimitationObserver$b */
    public static final class View$OnClickListenerC61641b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneLimitationObserver f154644a;

        View$OnClickListenerC61641b(EnterprisePhoneLimitationObserver enterprisePhoneLimitationObserver) {
            this.f154644a = enterprisePhoneLimitationObserver;
        }

        public final void onClick(View view) {
            C60700b.m235851b("EnterprisePhoneLog_EnterpriseCallLimitationObserver", "[onClick]", "closeView");
            FragmentActivity activity = this.f154644a.mo213535a().getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: a */
    private final void m240593a(boolean z) {
        View view = this.f154638e;
        if (view == null) {
            return;
        }
        if (z) {
            view.setPadding(view.getLeft(), C60776r.m236148f(), view.getRight(), view.getBottom());
        } else if (view.getTop() != 0) {
            view.setPadding(view.getLeft(), 0, view.getRight(), view.getBottom());
        }
    }

    public EnterprisePhoneLimitationObserver(Fragment fragment) {
        String str;
        VcEnterprisePhoneLinkConfig f;
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        this.f154643j = fragment;
        VideoChatManager a = VideoChatManager.m249444a();
        Intrinsics.checkExpressionValueIsNotNull(a, "VideoChatManager.getInstance()");
        C61282e k = a.mo220133k();
        this.f154637c = (k == null || (f = k.mo211945f()) == null || (str = f.getControlLink()) == null) ? "" : str;
        this.f154638e = this.f154643j.getView();
        m240593a(true);
        Bundle arguments = this.f154643j.getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("open_chatter");
            if (serializable != null) {
                this.f154635a = (OpenChatter) serializable;
                this.f154636b = arguments.getString("chat_id");
                m240594b();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.export.entity.chatter.OpenChatter");
        }
    }
}
