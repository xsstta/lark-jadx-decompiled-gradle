package com.ss.android.lark.integrator.im;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.util.C0844e;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.contact.IInitBuilder;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.chat.export.ui.p1673c.AbstractC34033a;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.im.C39438c;
import com.ss.android.lark.integrator.voip.VoIpModuleProvider;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.vc.api.AbstractC57901c;
import com.ss.android.lark.vcintegrator.VideoChatModuleProvider;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.p2932c.C58329a;
import com.ss.android.lark.widget.p2932c.C58333b;
import com.ss.android.lark.widget.p2932c.C58339d;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.dto.VCLaunchError;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.service.IVideoChatService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.im.c */
public class C39438c {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.integrator.im.c$a */
    public interface AbstractC39450a<T> {
        /* renamed from: a */
        boolean mo143327a(T t);
    }

    /* renamed from: a */
    public AbstractC34033a mo143324a(Activity activity, Chat chat, Chatter chatter) {
        if (chat.isSuper() || chat.isAnonymousSecret()) {
            return null;
        }
        if (chat.isP2PChat()) {
            return m155743a(activity, chat, (OpenChatter) chatter);
        }
        VideoChatModuleProvider.m224872a();
        return VideoChatModule.m235642a(activity, chat, chatter);
    }

    /* renamed from: a */
    private static boolean m155752a(Chat chat) {
        return m155751a() && !chat.isCrossTenant() && !chat.isSecret() && VideoChatModuleProvider.m224877f().mo220083c();
    }

    /* renamed from: a */
    private static boolean m155751a() {
        return C63634c.m249496b("byteview.meeting.businessphone");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.integrator.im.c$9 */
    public static /* synthetic */ class C394499 {

        /* renamed from: a */
        static final /* synthetic */ int[] f100823a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.vc.dto.VCLaunchError[] r0 = com.ss.android.vc.dto.VCLaunchError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.integrator.im.C39438c.C394499.f100823a = r0
                com.ss.android.vc.dto.VCLaunchError r1 = com.ss.android.vc.dto.VCLaunchError.COLLABORATION_AUTH_FAILED_NO_RIGHTS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.integrator.im.C39438c.C394499.f100823a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.dto.VCLaunchError r1 = com.ss.android.vc.dto.VCLaunchError.COLLABORATION_AUTH_FAILED_BLOCKED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.integrator.im.C39438c.C394499.f100823a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.dto.VCLaunchError r1 = com.ss.android.vc.dto.VCLaunchError.COLLABORATION_AUTH_FAILED_BE_BLOCKED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.integrator.im.C39438c.C394499.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.integrator.im.c$b */
    public static class C39451b {
        /* renamed from: a */
        private static VCLaunchError m155771a(int i) {
            switch (i) {
                case 260000:
                    return VCLaunchError.COLLABORATION_AUTH_FAILED_BLOCKED;
                case 260001:
                    return VCLaunchError.COLLABORATION_AUTH_FAILED_NO_RIGHTS;
                case 260002:
                default:
                    return null;
                case 260003:
                    return VCLaunchError.COLLABORATION_AUTH_FAILED_BE_BLOCKED;
            }
        }

        /* renamed from: a */
        public static void m155772a(Context context, OpenChatter openChatter, OpenChat openChat, int i) {
            m155773a(context, openChatter, openChat, m155771a(i));
        }

        /* renamed from: a */
        public static void m155773a(Context context, OpenChatter openChatter, OpenChat openChat, VCLaunchError vCLaunchError) {
            if (vCLaunchError != null) {
                IIMApi iIMApi = (IIMApi) ApiUtils.getApi(IIMApi.class);
                ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
                int i = C394499.f100823a[vCLaunchError.ordinal()];
                if (i == 1) {
                    C39438c.m155747a(context, openChatter, openChat);
                } else if (i == 2) {
                    LKUIToast.show(context, (int) R.string.Lark_NewContacts_BlockedOthersUnableToXToastGeneral);
                    iIMApi.sendVoiceBlock();
                } else if (i == 3) {
                    LKUIToast.show(context, (int) R.string.Lark_NewContacts_BlockedUnableToXToastGeneral);
                    iIMApi.sendVoiceBlock();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m155747a(Context context, OpenChatter openChatter, OpenChat openChat) {
        ContactSource contactSource = new ContactSource();
        contactSource.setSourceType(5);
        contactSource.setSourceId(openChat.getId());
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).showApplyCollabDialog(context, new IInitBuilder(context, contactSource) {
            /* class com.ss.android.lark.integrator.im.$$Lambda$c$g5tzLNYb4pIOeFMkGYhcWroQCT8 */
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ ContactSource f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder
            public final void init(IInitBuilder.IDialogBuilder cVar) {
                C39438c.m155748a(OpenChatter.this, this.f$1, this.f$2, (IInitBuilder.IApplyCollabDialogBuilder) cVar);
            }
        });
    }

    /* renamed from: a */
    private AbstractC34033a m155743a(Activity activity, final Chat chat, final OpenChatter openChatter) {
        int i;
        final boolean z;
        if (chat != null && !chat.isSoloChat() && openChatter != null && !openChatter.isBot()) {
            final ImageView imageView = new ImageView(activity);
            if (chat.isSecret()) {
                i = R.color.static_white;
            } else {
                i = R.color.icon_n1;
            }
            imageView.setImageDrawable(UDIconUtils.getIconDrawable(activity, (int) R.drawable.ud_icon_call_video_outlined, UDColorUtils.getColor(activity, i)));
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            final C0844e<List<C58339d.C58341a>, Boolean> a = m155742a(activity, chat, openChatter, (AbstractC39450a<C58339d.C58341a>) null);
            F f = a.f3317a;
            if (f != null && !f.isEmpty()) {
                if (a.f3318b == null || !a.f3318b.booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    imageView.setImageDrawable(UDIconUtils.getIconDrawable(activity, (int) R.drawable.ud_icon_video_outlined, UDColorUtils.getColor(activity, i)));
                }
                return new AbstractC34033a() {
                    /* class com.ss.android.lark.integrator.im.C39438c.C394391 */

                    @Override // com.ss.android.lark.chat.export.ui.p1673c.AbstractC34033a
                    /* renamed from: a */
                    public void mo126139a() {
                    }

                    @Override // com.ss.android.lark.chat.export.ui.p1673c.AbstractC34033a
                    /* renamed from: a */
                    public View mo126138a(final Activity activity) {
                        imageView.setOnClickListener(new OnSingleClickListener() {
                            /* class com.ss.android.lark.integrator.im.C39438c.C394391.C394401 */

                            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                            public void onSingleClick(View view) {
                                C39438c.m155745a(activity, chat, openChatter, a.f3317a, z).run();
                            }
                        });
                        return imageView;
                    }
                };
            }
        }
        return null;
    }

    /* renamed from: b */
    private static C58339d.C58341a m155753b(Activity activity, final Chat chat, final OpenChatter openChatter) {
        final IIMApi iIMApi = (IIMApi) ApiUtils.getApi(IIMApi.class);
        ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
        if (!m155752a(chat)) {
            return null;
        }
        return new C58329a.C58331a().mo197551d(R.color.line_divider_default).mo197546a(UIHelper.getString(R.string.View_MV_OfficePhonePaid)).mo197550c(R.color.text_title).mo197548b(R.color.icon_n1).mo197544a(R.drawable.ud_icon_officephone_outlined).mo197545a(new C58339d.AbstractC58343b() {
            /* class com.ss.android.lark.integrator.im.C39438c.C394412 */

            @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
            public void onMenuItemClick() {
                iIMApi.sendCallSelectClick(chat, 4);
                VideoChatModuleProvider.m224877f().mo220074a(openChatter, chat.getId(), "ChatTitleBarVCDependency");
            }
        }).mo197558j();
    }

    /* renamed from: c */
    private static C58339d.C58341a m155755c(final Activity activity, final Chat chat, final OpenChatter openChatter) {
        boolean z;
        String str;
        final IIMApi iIMApi = (IIMApi) ApiUtils.getApi(IIMApi.class);
        ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
        if (chat.isCrossTenant() || chat.isSecret()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return null;
        }
        if (m155752a(chat)) {
            str = UIHelper.getString(R.string.View_MV_SelfPhoneHere);
        } else {
            str = UIHelper.getString(R.string.Lark_Legacy_StartPhoneCall);
        }
        return new C58329a.C58331a().mo197551d(R.color.line_divider_default).mo197546a(str).mo197550c(R.color.text_title).mo197548b(R.color.icon_n1).mo197544a(R.drawable.ud_icon_phone_outlined).mo197545a(new C58339d.AbstractC58343b() {
            /* class com.ss.android.lark.integrator.im.C39438c.C394423 */

            @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
            public void onMenuItemClick() {
                iIMApi.sendCallSelectClick(chat, 1);
                iIMApi.sendOnClickPhone();
                iIMApi.queryPhoneNumber(activity, openChatter.getId(), new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.integrator.im.C39438c.C394423.C394431 */

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        iIMApi.makeUserCall(activity, openChatter.getId(), str);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        UDToast.show(activity, UIHelper.getString(R.string.Lark_Legacy_ProfileDetailGettingPhoneFailed));
                        C39451b.m155772a(activity, openChatter, chat, errorResult.getErrorCode());
                    }
                });
            }
        }).mo197558j();
    }

    /* renamed from: d */
    private static C58339d.C58341a m155756d(final Activity activity, final Chat chat, final OpenChatter openChatter) {
        final IIMApi iIMApi = (IIMApi) ApiUtils.getApi(IIMApi.class);
        if (chat.isSecret()) {
            return null;
        }
        return new C58329a.C58331a().mo197551d(R.color.line_divider_default).mo197546a(UIHelper.getString(R.string.Lark_View_VoiceCallName)).mo197550c(R.color.text_title).mo197548b(R.color.icon_n1).mo197544a(((IIMApi) ApiUtils.getApi(IIMApi.class)).getCallMenuVoiceCallIcon()).mo197545a(new C58339d.AbstractC58343b() {
            /* class com.ss.android.lark.integrator.im.C39438c.C394455 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m155764a(Boolean bool) {
            }

            @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
            public void onMenuItemClick() {
                iIMApi.sendCallSelectClick(chat, 3);
                iIMApi.sendOnClickVoice();
                C57865c.m224574a(new C57865c.AbstractC57873d(chat, activity) {
                    /* class com.ss.android.lark.integrator.im.$$Lambda$c$5$7qQfdW8nrjzHk3ZQEG2k9HBXrsQ */
                    public final /* synthetic */ Chat f$1;
                    public final /* synthetic */ Activity f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
                    public final Object produce() {
                        return C39438c.C394455.m155762a(OpenChatter.this, this.f$1, this.f$2);
                    }
                }, $$Lambda$c$5$pRIg5dmD2_bZxhWTFl6qGvWEB_s.INSTANCE);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ Boolean m155762a(OpenChatter openChatter, Chat chat, Activity activity) {
                VideoChatModuleProvider.m224877f().mo220075a(openChatter, chat.getId(), "chat_window_banner", chat.isSecret(), true, new IVideoChatService.AbstractC63626a(activity, openChatter, chat) {
                    /* class com.ss.android.lark.integrator.im.$$Lambda$c$5$YSFIkvVw5gyI96QpgtQ9VcsjHk8 */
                    public final /* synthetic */ Activity f$0;
                    public final /* synthetic */ OpenChatter f$1;
                    public final /* synthetic */ Chat f$2;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    @Override // com.ss.android.vc.service.IVideoChatService.AbstractC63626a
                    public final void onError(VCLaunchError vCLaunchError) {
                        C39438c.C394455.m155763a(this.f$0, this.f$1, this.f$2, vCLaunchError);
                    }
                });
                return true;
            }
        }).mo197558j();
    }

    /* renamed from: e */
    private static C58339d.C58341a m155757e(final Activity activity, final Chat chat, final OpenChatter openChatter) {
        int i;
        boolean a = VideoChatModuleProvider.m224872a().mo208150a(chat);
        final IIMApi iIMApi = (IIMApi) ApiUtils.getApi(IIMApi.class);
        ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
        if (!a) {
            return null;
        }
        if (DesktopUtil.m144307b()) {
            i = R.drawable.ic_svg_call_menu_video_chat_desktop;
        } else {
            i = R.drawable.ud_icon_video_outlined;
        }
        return new C58329a.C58331a().mo197551d(R.color.line_divider_default).mo197546a(UIHelper.getString(R.string.Lark_Legacy_StartCall)).mo197550c(R.color.text_title).mo197548b(R.color.icon_n1).mo197544a(i).mo197545a(new C58339d.AbstractC58343b() {
            /* class com.ss.android.lark.integrator.im.C39438c.C394466 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m155767a(Boolean bool) {
            }

            @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
            public void onMenuItemClick() {
                iIMApi.sendCallSelectClick(chat, 2);
                iIMApi.sendPhoneOnClickVideo();
                C57865c.m224574a(new C57865c.AbstractC57873d(chat, activity) {
                    /* class com.ss.android.lark.integrator.im.$$Lambda$c$6$t7idXx4ts_lxDhQiTrmT7d6vzuw */
                    public final /* synthetic */ Chat f$1;
                    public final /* synthetic */ Activity f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
                    public final Object produce() {
                        return C39438c.C394466.m155765a(OpenChatter.this, this.f$1, this.f$2);
                    }
                }, $$Lambda$c$6$wLZCDecrlH5CGZXv5bTvtZPV4Sw.INSTANCE);
                VideoChatModuleProvider.m224877f().mo220079a(chat.isSecret());
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ Boolean m155765a(OpenChatter openChatter, Chat chat, Activity activity) {
                VideoChatModuleProvider.m224877f().mo220075a(openChatter, chat.getId(), "chat_window_banner", chat.isSecret(), false, new IVideoChatService.AbstractC63626a(activity, openChatter, chat) {
                    /* class com.ss.android.lark.integrator.im.$$Lambda$c$6$VlGNs1Z5XQSP3K7NtbGGtLtyIY */
                    public final /* synthetic */ Activity f$0;
                    public final /* synthetic */ OpenChatter f$1;
                    public final /* synthetic */ Chat f$2;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    @Override // com.ss.android.vc.service.IVideoChatService.AbstractC63626a
                    public final void onError(VCLaunchError vCLaunchError) {
                        C39438c.C394466.m155766a(this.f$0, this.f$1, this.f$2, vCLaunchError);
                    }
                });
                return true;
            }
        }).mo197558j();
    }

    /* renamed from: b */
    private static C58339d.C58341a m155754b(final Activity activity, OpenChat openChat, final OpenChatter openChatter) {
        boolean a = C37239a.m146648b().mo136951a("lark.call.sos");
        final IIMApi iIMApi = (IIMApi) ApiUtils.getApi(IIMApi.class);
        ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
        if (!a || openChat.isCrossTenant() || openChat.isSecret()) {
            return null;
        }
        return new C58329a.C58331a().mo197551d(R.color.line_divider_default).mo197546a(UIHelper.getString(R.string.Lark_Legacy_UrgentCallEntrance)).mo197550c(R.color.primary_pri_500).mo197548b(R.color.function_danger_500).mo197544a(R.drawable.ud_icon_alarm_outlined).mo197545a(new C58339d.AbstractC58343b() {
            /* class com.ss.android.lark.integrator.im.C39438c.C394488 */

            @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
            public void onMenuItemClick() {
                iIMApi.emergencyCall(activity, openChatter.getId());
            }
        }).mo197558j();
    }

    /* renamed from: a */
    private static C58339d.C58341a m155744a(final Activity activity, final OpenChat openChat, final OpenChatter openChatter) {
        boolean a = C37239a.m146648b().mo136951a("byteview.call.encrypted.android");
        final IIMApi iIMApi = (IIMApi) ApiUtils.getApi(IIMApi.class);
        ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
        if (!a || !openChat.isSecret()) {
            return null;
        }
        return new C58329a.C58331a().mo197551d(R.color.line_divider_default).mo197546a(UIHelper.getString(R.string.Lark_View_EncryptedCallName)).mo197550c(R.color.text_title).mo197544a(R.drawable.ud_icon_call_secret_outlined).mo197548b(R.color.icon_n1).mo197545a(new C58339d.AbstractC58343b() {
            /* class com.ss.android.lark.integrator.im.C39438c.C394477 */

            @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
            public void onMenuItemClick() {
                iIMApi.sendOnClickVoip();
                C57865c.m224576a(new Runnable(activity, openChatter, openChat) {
                    /* class com.ss.android.lark.integrator.im.$$Lambda$c$7$EcCHoU0fQzRynUhrNXisscO7pE */
                    public final /* synthetic */ Activity f$0;
                    public final /* synthetic */ OpenChatter f$1;
                    public final /* synthetic */ OpenChat f$2;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C39438c.C394477.m155768a(this.f$0, this.f$1, this.f$2);
                    }
                });
                VoIpModuleProvider.m158862a().mo196604d().mo196628a(openChat.isSecret());
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m155768a(Activity activity, OpenChatter openChatter, OpenChat openChat) {
                VoIpModuleProvider.m158862a().mo196598a(activity, openChatter, openChat.getId(), new AbstractC57901c(activity, openChatter, openChat) {
                    /* class com.ss.android.lark.integrator.im.$$Lambda$c$7$JarRpk0K3BiKoFaPhP85nzOyIDg */
                    public final /* synthetic */ Activity f$0;
                    public final /* synthetic */ OpenChatter f$1;
                    public final /* synthetic */ OpenChat f$2;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    @Override // com.ss.android.lark.vc.api.AbstractC57901c
                    public final void onError(VCLaunchError vCLaunchError) {
                        C39438c.C394477.m155769a(this.f$0, this.f$1, this.f$2, vCLaunchError);
                    }
                });
            }
        }).mo197558j();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m155749a(OpenChatter openChatter, Chat chat, Activity activity) {
        VideoChatModuleProvider.m224877f().mo220075a(openChatter, chat.getId(), "chat_window_banner", chat.isSecret(), false, new IVideoChatService.AbstractC63626a(activity, openChatter, chat) {
            /* class com.ss.android.lark.integrator.im.$$Lambda$c$bRBpKuTubwNrYEtRUKQkddxlEM */
            public final /* synthetic */ Activity f$0;
            public final /* synthetic */ OpenChatter f$1;
            public final /* synthetic */ Chat f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.vc.service.IVideoChatService.AbstractC63626a
            public final void onError(VCLaunchError vCLaunchError) {
                C39438c.m155746a(this.f$0, this.f$1, this.f$2, vCLaunchError);
            }
        });
    }

    /* renamed from: a */
    private static C0844e<List<C58339d.C58341a>, Boolean> m155742a(Activity activity, Chat chat, OpenChatter openChatter, AbstractC39450a<C58339d.C58341a> aVar) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (!DesktopUtil.m144307b()) {
            C58339d.C58341a b = m155753b(activity, chat, openChatter);
            if (b != null && (aVar == null || aVar.mo143327a(b))) {
                arrayList.add(b);
            }
            C58339d.C58341a c = m155755c(activity, chat, openChatter);
            if (c != null && (aVar == null || aVar.mo143327a(b))) {
                arrayList.add(c);
            }
        }
        C58339d.C58341a d = m155756d(activity, chat, openChatter);
        if (d != null && (aVar == null || aVar.mo143327a(d))) {
            arrayList.add(d);
        }
        C58339d.C58341a a = m155744a(activity, (OpenChat) chat, openChatter);
        if (a != null && (aVar == null || aVar.mo143327a(a))) {
            arrayList.add(a);
        }
        C58339d.C58341a e = m155757e(activity, chat, openChatter);
        boolean z2 = false;
        if (e == null || (aVar != null && !aVar.mo143327a(e))) {
            z = false;
        } else {
            arrayList.add(e);
            z = true;
        }
        C58339d.C58341a b2 = m155754b(activity, (OpenChat) chat, openChatter);
        if (b2 != null && (aVar == null || aVar.mo143327a(b2))) {
            arrayList.add(b2);
        }
        if (z && arrayList.size() == 1) {
            z2 = true;
        }
        return new C0844e<>(arrayList, Boolean.valueOf(z2));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m155748a(OpenChatter openChatter, Context context, ContactSource contactSource, IInitBuilder.IApplyCollabDialogBuilder aVar) {
        IInitBuilder.IApplyCollabDialogBuilder aVar2 = (IInitBuilder.IApplyCollabDialogBuilder) ((IInitBuilder.IApplyCollabDialogBuilder) aVar.mo105548a(new Contact(openChatter.getId(), openChatter.getAvatarKey(), openChatter.getLocalizedName())).mo105553b(UIUtils.getString(context, R.string.Lark_NewContacts_AddToContactsDialogContent))).mo105547a(contactSource).mo105555d("chat_vc_confirm");
    }

    /* renamed from: a */
    public static Runnable m155745a(Activity activity, Chat chat, OpenChatter openChatter, List<C58339d.C58341a> list, boolean z) {
        IIMApi iIMApi = (IIMApi) ApiUtils.getApi(IIMApi.class);
        ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
        return new Runnable(z, iIMApi, openChatter, chat, activity, list) {
            /* class com.ss.android.lark.integrator.im.$$Lambda$c$IrzeFQZzth2J0Ac_hyUvnKinxBY */
            public final /* synthetic */ boolean f$0;
            public final /* synthetic */ IIMApi f$1;
            public final /* synthetic */ OpenChatter f$2;
            public final /* synthetic */ Chat f$3;
            public final /* synthetic */ Activity f$4;
            public final /* synthetic */ List f$5;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
            }

            public final void run() {
                C39438c.m155750a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m155750a(boolean z, final IIMApi iIMApi, OpenChatter openChatter, Chat chat, Activity activity, List list) {
        if (z) {
            iIMApi.sendPhoneOnClickVideo();
            C57865c.m224576a(new Runnable(chat, activity) {
                /* class com.ss.android.lark.integrator.im.$$Lambda$c$_xqI9HBCrVyZTC3KYIf8z0xaHxI */
                public final /* synthetic */ Chat f$1;
                public final /* synthetic */ Activity f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C39438c.m155749a(OpenChatter.this, this.f$1, this.f$2);
                }
            });
            VideoChatModuleProvider.m224877f().mo220079a(chat.isSecret());
            return;
        }
        iIMApi.sendPhoneOnClickCall();
        if (openChatter.isDimission()) {
            UDToast.show(activity, UIHelper.getString(R.string.Lark_Legacy_ChatterResignPermissionPhone));
        } else if (DesktopUtil.m144301a((Context) activity)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C58339d.C58341a aVar = (C58339d.C58341a) it.next();
                aVar.mo197572b(false);
                aVar.mo197574d(UIUtils.dp2px(activity, 50.0f));
                aVar.mo197571b(14);
                aVar.mo197575e(UIUtils.dp2px(activity, 13.0f));
            }
            C58333b.m226185a(activity, list, new float[]{(float) UIUtils.dp2px(activity, 6.0f), (float) UIUtils.dp2px(activity, 60.0f)});
        } else {
            iIMApi.sendChatCallSelectView(chat);
            C58339d.m226193a(activity, list, true, new View.OnClickListener() {
                /* class com.ss.android.lark.integrator.im.C39438c.View$OnClickListenerC394444 */

                public void onClick(View view) {
                    iIMApi.sendPhoneOnClickCancel();
                }
            });
        }
    }
}
