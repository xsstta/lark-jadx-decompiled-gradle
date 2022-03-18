package com.ss.android.vc.meeting.module.preview;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.base.watermark.IWatermarkable;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60748b;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils;
import com.ss.android.vc.meeting.module.p3130k.p3131a.C62003a;
import com.ss.android.vc.meeting.module.preview.AbstractC62712e;
import com.ss.android.vc.meeting.module.preview.facade.MeetingPreviewActivity;
import com.ss.android.vc.meeting.utils.TimeConsumeUtils;
import com.ss.android.vc.meeting.utils.UserCallStatusMonitor;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vc.statistics.event2.MeetingPreEvent;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vc.statistics.p3180a.C63697g;
import io.reactivex.p3457e.C68296b;
import java.util.UUID;

/* renamed from: com.ss.android.vc.meeting.module.preview.c */
public abstract class AbstractC62684c<MP extends AbstractC62712e> extends BaseFragment implements IWatermarkable {

    /* renamed from: a */
    protected int f157734a;

    /* renamed from: b */
    protected MP f157735b;

    /* renamed from: c */
    protected String f157736c;

    /* renamed from: d */
    protected VideoChat.VendorType f157737d;

    /* renamed from: e */
    protected boolean f157738e;

    /* renamed from: f */
    private View f157739f;

    /* renamed from: g */
    private boolean f157740g = true;

    /* renamed from: h */
    private final UserCallStatusMonitor.AbstractC63478a f157741h = new UserCallStatusMonitor.AbstractC63478a() {
        /* class com.ss.android.vc.meeting.module.preview.$$Lambda$c$Tpf2vqJm1aEb8N5yNL38pc9Mx6g */

        @Override // com.ss.android.vc.meeting.utils.UserCallStatusMonitor.AbstractC63478a
        public final void onEnterOnCall(int i) {
            AbstractC62684c.this.m245206a((AbstractC62684c) i);
        }
    };

    /* renamed from: i */
    private final AbstractC62746h f157742i = new AbstractC62746h() {
        /* class com.ss.android.vc.meeting.module.preview.AbstractC62684c.C626851 */

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62746h
        /* renamed from: a */
        public int mo216599a() {
            return AbstractC62684c.this.f157734a;
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62746h
        /* renamed from: b */
        public void mo216600b() {
            AbstractC62684c.this.finish();
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62746h
        /* renamed from: d */
        public String mo216602d() {
            return AbstractC62684c.this.mo216561a();
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62746h
        /* renamed from: c */
        public boolean mo216601c() {
            return AbstractC62684c.this.f157735b.mo216667h();
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62746h
        /* renamed from: e */
        public String mo216603e() {
            if (AbstractC62684c.this.f157735b != null) {
                return AbstractC62684c.this.f157735b.mo216666g();
            }
            return "";
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract MP mo216560a(BaseFragment baseFragment, AbstractC62746h hVar);

    /* renamed from: a */
    public String mo216561a() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo216597b() {
        return R.layout.activity_meeting_preview;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo216563d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo216564e();

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public boolean enableGlobalWatermark() {
        return true;
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public int getWatermarkMode() {
        return 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m245210h() {
        MP mp = this.f157735b;
        if (mp != null) {
            mp.mo216664b();
        }
    }

    /* renamed from: f */
    private void mo216614f() {
        this.f157739f.setOnKeyListener(new View.OnKeyListener() {
            /* class com.ss.android.vc.meeting.module.preview.$$Lambda$c$CSGu_UtLFit9OdAv9ZTgwPqSgk */

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return AbstractC62684c.this.m245207a(view, i, keyEvent);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m245209g() {
        C60700b.m235851b("MeetingPreviewBaseFragment", "[onResume]", "init rtc");
        C61237h.m238223a().mo211788a(this.f157737d, false);
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.preview.$$Lambda$c$o04yl4fSQ0dKVGGCVfLiWkRbKs */

            public final void run() {
                AbstractC62684c.this.m245210h();
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a
    public void onFinish() {
        FragmentActivity activity = getActivity();
        if (activity != null && DesktopUtil.m144301a((Context) activity) && DesktopUtil.m144300a((Activity) activity)) {
            activity.finish();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingPreviewBaseFragment:onStart");
        C60700b.m235851b("MeetingPreviewBaseFragment", "[onStart]", "onStart");
        this.f157735b.mo216669j();
        this.f157740g = true;
        TimeConsumeUtils.m248928a(a);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStop() {
        C60700b.m235851b("MeetingPreviewBaseFragment", "[onStop]", "onStop");
        C63697g.m249707e();
        this.f157735b.mo216670k();
        super.onStop();
    }

    /* renamed from: c */
    public void mo216598c() {
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingPreviewBaseFragment:initMvp");
        MP mp = this.f157735b;
        if (mp != null) {
            mp.destroy();
            this.f157735b = null;
        }
        MP a2 = mo216560a(this, this.f157742i);
        this.f157735b = a2;
        a2.mo216663a(this.f157736c);
        this.f157735b.create();
        this.f157735b.mo216590a(this.f157738e);
        TimeConsumeUtils.m248928a(a);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f157740g && this.f157737d != null && (VideoChatModuleDependency.getLifeCycleDependency().mo196414b() instanceof MeetingPreviewActivity)) {
            this.f157740g = false;
            if (C61237h.m238223a().mo210551i()) {
                C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingPreviewBaseFragment:onResume");
                MP mp = this.f157735b;
                if (mp != null) {
                    mp.mo216664b();
                }
                TimeConsumeUtils.m248928a(a);
                return;
            }
            C60735ab.m236015d().post(new Runnable() {
                /* class com.ss.android.vc.meeting.module.preview.$$Lambda$c$XnIa7p7AqLFKULVSdcd6yOvNmU */

                public final void run() {
                    AbstractC62684c.this.m245209g();
                }
            });
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        boolean i = this.f157735b.mo216668i();
        VideoChat.VendorType vendorType = this.f157737d;
        if (!(vendorType == null || vendorType == VideoChat.VendorType.UNKNOWN_VENDOR_TYPE)) {
            boolean isFloatIconShown = VideoChatModuleDependency.getVoIpDependency().isFloatIconShown();
            boolean isOngoing = VideoChatService.m249602d().isOngoing(true);
            C60700b.m235851b("MeetingPreviewBaseFragment", "[onDestroyView]", "voipOngoing = " + isFloatIconShown + ", vcOngoing = " + isOngoing + ", isLaunchOrJoinSuccess = " + i);
            if (!isOngoing && !isFloatIconShown && !i) {
                long currentTimeMillis = System.currentTimeMillis();
                C61237h.m238223a().mo211781F();
                LabsUtils.m242899a((C61303k) null);
                C60700b.m235851b("MeetingPreviewBaseFragment", "[onDestroyView2]", "reset cost " + (System.currentTimeMillis() - currentTimeMillis));
            }
        }
        MP mp = this.f157735b;
        if (mp != null) {
            mp.mo216671l();
            this.f157735b.destroy();
            this.f157735b = null;
        }
        UserCallStatusMonitor.m248763b(this.f157741h);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MP mp = this.f157735b;
        if (mp != null) {
            mp.mo216665c();
        }
        C62003a.m242249a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            onStop();
        } else {
            onStart();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m245206a(int i) {
        C60700b.m235851b("MeetingPreviewBaseFragment", "[onCallStatusListener]", "dismiss because user enter oncall + type: " + i);
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo216587a(Bundle bundle) {
        if (bundle.getInt("param_start_source", 0) == 0) {
            C60700b.m235864f("MeetingPreviewBaseFragment", "[parseParams]", "Start activity illegally.");
            return false;
        }
        String string = bundle.getString("param_env_id");
        if (TextUtils.isEmpty(string)) {
            string = UUID.randomUUID().toString();
        }
        this.f157736c = string;
        int i = bundle.getInt("param_preview_type", Integer.MIN_VALUE);
        this.f157734a = i;
        if (i == Integer.MIN_VALUE) {
            C60700b.m235864f("MeetingPreviewBaseFragment", "[parseParams2]", "Param error. [type]" + this.f157734a);
            return false;
        }
        this.f157737d = VideoChat.VendorType.valueOf(bundle.getInt("param_vendor_type"));
        this.f157738e = bundle.getBoolean("param_enter_from_url");
        mo216563d();
        MeetingPreEvent.m249851a().mo220333a(this.f157736c, MeetingDeviceSwitchStateUtil.m245167b(), MeetingDeviceSwitchStateUtil.m245165a(), false, this.f157738e);
        return true;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingPreviewBaseFragment:onCreate");
        if (!mo216587a(getArguments())) {
            finish();
            return;
        }
        C60700b.m235851b("MeetingPreviewBaseFragment", "[onCreate]", "【Preview Page】" + mo216564e() + ", vendorType = " + this.f157737d);
        UserCallStatusMonitor.m248762a(this.f157741h);
        TimeConsumeUtils.m248928a(a);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingPreviewBaseFragment:onViewCreated");
        mo216598c();
        mo216614f();
        if (this.f157737d == VideoChat.VendorType.UNKNOWN_VENDOR_TYPE) {
            C60700b.m235864f("MeetingPreviewBaseFragment", "[onViewCreated]", "unknown venderType");
            if (VideoChatModule.getDependency().getAppEnvDependency().isProductionEnv()) {
                this.f157737d = VideoChat.VendorType.LARK_RTC;
            } else {
                this.f157737d = VideoChat.VendorType.LARK_PRE_RTC;
            }
        }
        if (getView() != null) {
            getView().getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                /* class com.ss.android.vc.meeting.module.preview.AbstractC62684c.ViewTreeObserver$OnPreDrawListenerC626862 */

                public boolean onPreDraw() {
                    C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingPreviewBaseFragment:onPreDraw");
                    if (AbstractC62684c.this.getView() != null) {
                        AbstractC62684c.this.getView().getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                    C63697g.m249704b();
                    TimeConsumeUtils.m248928a(a);
                    return true;
                }
            });
        }
        TimeConsumeUtils.m248928a(a);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingPreviewBaseFragment:onCreateView");
        this.f157739f = (ViewGroup) C60748b.m236068a(getActivity(), mo216597b(), viewGroup, false);
        TimeConsumeUtils.m248928a(a);
        return this.f157739f;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m245207a(View view, int i, KeyEvent keyEvent) {
        if (!DesktopUtil.m144301a((Context) getActivity()) || keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66) {
            return false;
        }
        C63693e.m249680a();
        this.f157735b.mo216662a();
        return true;
    }
}
