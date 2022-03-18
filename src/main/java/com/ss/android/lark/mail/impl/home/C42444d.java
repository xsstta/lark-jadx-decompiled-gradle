package com.ss.android.lark.mail.impl.home;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.lark.pb.email.client.v1.Setting;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.ButtonAction;
import com.ss.android.lark.guide.ui.config.ButtonBubbleConfig;
import com.ss.android.lark.guide.ui.config.ButtonConfig;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.C42087a;
import com.ss.android.lark.mail.impl.home.C42444d;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.p2196j.C42711a;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.mail.impl.home.d */
public class C42444d {

    /* renamed from: a */
    public final Context f108048a;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.home.d$a */
    public interface AbstractC42458a {
        boolean allowShow();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.home.d$b */
    public interface AbstractC42459b {
        boolean allowShow();
    }

    /* renamed from: c */
    private boolean m169482c() {
        if (!C43374f.m172264f().mo155134v() || !m169483d()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m169483d() {
        C42087a m = C43277a.m171921a().mo154949m();
        if (m == null || m.f107030g != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo152741a() {
        if (!m169483d()) {
            Log.m165389i("HomeOnboardingHelper", "hideBubbleIfAccountInvalid");
            C41816b.m166115a().mo150118H().mo150195a(C42711a.m170316a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo152744b() {
        Log.m165389i("HomeOnboardingHelper", "showTurnOnSmartInboxOnboardingDialog");
        if (!m169483d()) {
            Log.m165383e("HomeOnboardingHelper", "showTurnOnSmartInboxOnboardingDialog abort");
        } else if (C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.hide_ai_point")) {
            Log.m165383e("HomeOnboardingHelper", "showTurnOnSmartInboxOnboardingDialog abort 2");
        }
    }

    C42444d(Context context) {
        this.f108048a = context;
    }

    /* renamed from: a */
    public static void m169478a(final Context context) {
        Log.m165389i("HomeOnboardingHelper", "showConversationOnboarding");
        if (context instanceof Activity) {
            C41816b.m166115a().mo150118H().mo150197a("all_mail_settings_nonconversationmode", new C38708a((Activity) context, new AbstractC38707a() {
                /* class com.ss.android.lark.mail.impl.home.C42444d.C424495 */

                /* renamed from: a */
                UDDialog f108055a;

                /* renamed from: b */
                UDCheckBox f108056b;

                /* renamed from: c */
                boolean f108057c;

                @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
                /* renamed from: c */
                public void mo129839c(String str) {
                }

                @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
                /* renamed from: a */
                public void mo129837a(String str) {
                    Log.m165389i("HomeOnboardingHelper", "showConversationOnboarding onCloseGuide");
                    UDDialog uDDialog = this.f108055a;
                    if (uDDialog != null) {
                        uDDialog.dismiss();
                    }
                }

                @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
                /* renamed from: b */
                public void mo129838b(String str) {
                    if ("all_mail_settings_nonconversationmode".equals(str)) {
                        UDDialog build = ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Mail_Settings_ChatModeOnboardTitle)).controller(new UDDialogController(context) {
                            /* class com.ss.android.lark.mail.impl.home.C42444d.C424495.C424501 */

                            /* access modifiers changed from: protected */
                            @Override // com.larksuite.component.universe_design.dialog.UDDialogController
                            public View createView() {
                                View createView = super.createView();
                                C424495.this.f108056b = (UDCheckBox) createView.findViewById(R.id.mail_conversation_mode_content_onboarding_conversation_radio);
                                final UDCheckBox uDCheckBox = (UDCheckBox) createView.findViewById(R.id.mail_conversation_mode_content_onboarding_nonconversation_radio);
                                final View findViewById = createView.findViewById(R.id.mail_conversation_mode_content_onboarding_conversation_illustration);
                                final View findViewById2 = createView.findViewById(R.id.mail_conversation_mode_content_onboarding_nonconversation_illustration);
                                C42444d.m169479a(true, C424495.this.f108056b, uDCheckBox, findViewById, findViewById2);
                                C424495.this.f108056b.setOnClickListener(new View.OnClickListener() {
                                    /* class com.ss.android.lark.mail.impl.home.C42444d.C424495.C424501.View$OnClickListenerC424511 */

                                    public void onClick(View view) {
                                        C42444d.m169479a(true, C424495.this.f108056b, uDCheckBox, findViewById, findViewById2);
                                    }
                                });
                                uDCheckBox.setOnClickListener(new View.OnClickListener() {
                                    /* class com.ss.android.lark.mail.impl.home.C42444d.C424495.C424501.View$OnClickListenerC424522 */

                                    public void onClick(View view) {
                                        C42444d.m169479a(false, C424495.this.f108056b, uDCheckBox, findViewById, findViewById2);
                                    }
                                });
                                findViewById.setOnClickListener(new View.OnClickListener() {
                                    /* class com.ss.android.lark.mail.impl.home.C42444d.C424495.C424501.View$OnClickListenerC424533 */

                                    public void onClick(View view) {
                                        C42444d.m169479a(true, C424495.this.f108056b, uDCheckBox, findViewById, findViewById2);
                                    }
                                });
                                findViewById2.setOnClickListener(new View.OnClickListener() {
                                    /* class com.ss.android.lark.mail.impl.home.C42444d.C424495.C424501.View$OnClickListenerC424544 */

                                    public void onClick(View view) {
                                        C42444d.m169479a(false, C424495.this.f108056b, uDCheckBox, findViewById, findViewById2);
                                    }
                                });
                                return createView;
                            }
                        })).contentLayoutRes(R.layout.mail_thread_list_conversation_mode_onboarding_layout)).titleGravity(3)).footerLayoutRes(R.layout.mail_thread_list_conversation_mode_onboarding_footer)).headerLayoutRes(R.layout.mail_thread_list_conversation_mode_onboarding_header)).autoDismiss(true)).actionButtonOrientation(UDBaseDialogBuilder.ActionBottomOrientation.VERTICAL)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Mail_Settings_ChatModeConfirm, new DialogInterface.OnClickListener() {
                            /* class com.ss.android.lark.mail.impl.home.C42444d.C424495.DialogInterface$OnClickListenerC424574 */

                            public void onClick(DialogInterface dialogInterface, int i) {
                                Log.m165389i("HomeOnboardingHelper", "showConversationOnboarding click positive button");
                                if (C424495.this.f108056b == null) {
                                    Log.m165389i("HomeOnboardingHelper", "showConversationOnboarding cannot access convRadio");
                                    return;
                                }
                                boolean isChecked = C424495.this.f108056b.isChecked();
                                C43350d.m172099a(C43277a.m171921a().mo154946j()).mo155026a(new Setting.C16982a().mo60003l(Boolean.valueOf(isChecked)).build(), 13, null);
                                C424495.this.f108057c = true;
                                C42330c.m169050a(C42330c.C42334c.f107683j, Boolean.valueOf(isChecked));
                            }
                        })).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Mail_Settings_ChatModeSkip, new DialogInterface.OnClickListener() {
                            /* class com.ss.android.lark.mail.impl.home.C42444d.C424495.DialogInterface$OnClickListenerC424563 */

                            public void onClick(DialogInterface dialogInterface, int i) {
                                Log.m165389i("HomeOnboardingHelper", "showConversationOnboarding click negative button");
                            }
                        })).onDismissListener(new DialogInterface.OnDismissListener() {
                            /* class com.ss.android.lark.mail.impl.home.C42444d.C424495.DialogInterface$OnDismissListenerC424552 */

                            public void onDismiss(DialogInterface dialogInterface) {
                                C41816b.m166115a().mo150118H().mo150198b("all_mail_settings_nonconversationmode");
                                if (!C424495.this.f108057c) {
                                    C42330c.m169050a(C42330c.C42334c.f107684k, (Boolean) null);
                                }
                            }
                        })).build();
                        this.f108055a = build;
                        build.show();
                        C42330c.m169083h();
                    }
                }
            }));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m169480b(View view, AbstractC42458a aVar) {
        ButtonBubbleConfig dVar = new ButtonBubbleConfig(new AnchorConfig(new WeakReference(view), AnchorConfig.AnchorGravity.BOTTOM), new MaskConfig(0, BitmapDescriptorFactory.HUE_RED, MaskConfig.ShapeType.RECTANGLE, null, null), C43819s.m173684a((int) R.string.Mail_SmartInbox_Name), C43819s.m173684a((int) R.string.Mail_SmartInbox_OnboardingTipContent), null, new ButtonConfig(C43819s.m173684a((int) R.string.Mail_SmartInbox_OnboardingGotIt), new ButtonAction() {
            /* class com.ss.android.lark.mail.impl.home.C42444d.C424451 */

            @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
            public void onClick(View view, GuideDelegate gVar) {
                gVar.mo141659b();
            }
        }));
        final WeakReference weakReference = new WeakReference(aVar);
        C41816b.m166115a().mo150118H().mo150197a("all_email_smartinbox_intro", new C38708a((Activity) this.f108048a, new AbstractC38707a() {
            /* class com.ss.android.lark.mail.impl.home.C42444d.C424462 */

            @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
            /* renamed from: a */
            public void mo129837a(String str) {
            }

            @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
            /* renamed from: c */
            public void mo129839c(String str) {
            }

            @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
            /* renamed from: b */
            public void mo129838b(String str) {
                AbstractC42458a aVar = (AbstractC42458a) weakReference.get();
                if (aVar != null && !aVar.allowShow()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str);
                    C41816b.m166115a().mo150118H().mo150195a(arrayList);
                }
            }
        }, dVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m169481b(View view, AbstractC42459b bVar) {
        AnchorConfig anchorConfig = new AnchorConfig(new WeakReference(view), AnchorConfig.AnchorGravity.BOTTOM);
        MaskConfig maskConfig = new MaskConfig(0, BitmapDescriptorFactory.HUE_RED, MaskConfig.ShapeType.RECTANGLE, null, null);
        ButtonConfig eVar = new ButtonConfig(C43819s.m173684a((int) R.string.Mail_SmartInbox_OnboardingGotIt), new ButtonAction() {
            /* class com.ss.android.lark.mail.impl.home.C42444d.C424473 */

            @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
            public void onClick(View view, GuideDelegate gVar) {
                gVar.mo141659b();
            }
        });
        final WeakReference weakReference = new WeakReference(bVar);
        C41816b.m166115a().mo150118H().mo150197a("all_email_previewcard", new C38708a((Activity) this.f108048a, new AbstractC38707a() {
            /* class com.ss.android.lark.mail.impl.home.C42444d.C424484 */

            @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
            /* renamed from: a */
            public void mo129837a(String str) {
            }

            @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
            /* renamed from: c */
            public void mo129839c(String str) {
            }

            @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
            /* renamed from: b */
            public void mo129838b(String str) {
                AbstractC42459b bVar = (AbstractC42459b) weakReference.get();
                if (bVar != null && !bVar.allowShow()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str);
                    C41816b.m166115a().mo150118H().mo150195a(arrayList);
                }
            }
        }, new ButtonBubbleConfig(anchorConfig, maskConfig, C43819s.m173684a((int) R.string.Mail_SmartInbox_Name), C43819s.m173684a((int) R.string.Mail_SmartInbox_OnboardingOthersEmail), null, eVar)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo152742a(View view, AbstractC42458a aVar) {
        Log.m165389i("HomeOnboardingHelper", "enqueueSmartInboxLabelOnboarding");
        if (!m169482c()) {
            Log.m165383e("HomeOnboardingHelper", "enqueueSmartInboxLabelOnboarding abort");
        } else if (view == null) {
            Log.m165383e("HomeOnboardingHelper", "enqueueSmartInboxLabelOnboarding empty view");
        } else {
            C43849u.m173826a(new Runnable(view, aVar) {
                /* class com.ss.android.lark.mail.impl.home.$$Lambda$d$4AwjwuG23yV8ItmyNfZQhcAAITw */
                public final /* synthetic */ View f$1;
                public final /* synthetic */ C42444d.AbstractC42458a f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C42444d.lambda$4AwjwuG23yV8ItmyNfZQhcAAITw(C42444d.this, this.f$1, this.f$2);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo152743a(View view, AbstractC42459b bVar) {
        Log.m165389i("HomeOnboardingHelper", "enqueueSmartInboxPreviewCardOnboarding");
        if (!m169482c()) {
            Log.m165383e("HomeOnboardingHelper", "enqueueSmartInboxPreviewCardOnboarding abort");
        } else if (view == null) {
            Log.m165383e("HomeOnboardingHelper", "enqueueSmartInboxPreviewCardOnboarding empty view");
        } else {
            C43849u.m173826a(new Runnable(view, bVar) {
                /* class com.ss.android.lark.mail.impl.home.$$Lambda$d$fcsHA_va_dvQMUvpWbJc4jlNDcs */
                public final /* synthetic */ View f$1;
                public final /* synthetic */ C42444d.AbstractC42459b f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C42444d.lambda$fcsHA_va_dvQMUvpWbJc4jlNDcs(C42444d.this, this.f$1, this.f$2);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m169479a(boolean z, UDCheckBox uDCheckBox, UDCheckBox uDCheckBox2, View view, View view2) {
        int i;
        uDCheckBox.setChecked(z);
        uDCheckBox2.setChecked(!z);
        int i2 = R.drawable.mail_thread_list_conversation_mode_onboarding_illustration_background_chosen;
        if (z) {
            i = R.drawable.mail_thread_list_conversation_mode_onboarding_illustration_background_chosen;
        } else {
            i = R.drawable.mail_thread_list_conversation_mode_onboarding_illustration_background_default;
        }
        view.setBackgroundResource(i);
        if (z) {
            i2 = R.drawable.mail_thread_list_conversation_mode_onboarding_illustration_background_default;
        }
        view2.setBackgroundResource(i2);
    }
}
