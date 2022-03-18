package com.ss.android.lark.share_group;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.api.service.IChatService;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.entity.chat.AddChatChatterApply;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ShareGroupChatContent;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.chatwindow.C35228b;
import com.ss.android.lark.dependency.IChatSettingDependency;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.chat.ChatHitPointExtraParams;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.threadtab.C55973a;
import com.ss.android.lark.threadwindow.C56095h;
import com.ss.android.lark.threadwindow.C56146m;
import com.ss.android.lark.utils.C57885u;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.navigation.Navigation;
import com.ss.android.lark.widget.billing.BillingTipsDialog;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.share_group.f */
public class C54821f {

    /* renamed from: a */
    private static final IChatService f135335a = C32821b.m126120a();

    /* renamed from: a */
    public static void m212677a(Chat chat, Message message, boolean z, String str) {
        Map<String, ? extends Object> a = ChatParamUtils.f88665a.mo126913a(message);
        a.put("is_toast_remind", z ? "true" : "false");
        if (z && str != null) {
            a.put("toast_remind", str);
        }
        ChatHitPointNew.f135660c.mo187384a(chat, "group_card_button_share", "none", a);
    }

    /* renamed from: a */
    private static void m212679a(String str, final IGetDataCallback<Boolean> iGetDataCallback) {
        final String a = C29990c.m110930b().mo134515N().mo134394a();
        C32821b.m126120a().mo121040b(str, Collections.singletonList(a), new UIGetDataCallback(new IGetDataCallback<Map<String, Boolean>>() {
            /* class com.ss.android.lark.share_group.C54821f.C548286 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C57885u.m224660b();
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Map<String, Boolean> map) {
                boolean z;
                C57885u.m224660b();
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (map.get(a) == null || !map.get(a).booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                iGetDataCallback.onSuccess(Boolean.valueOf(z));
            }
        }));
        C57885u.m224659a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m212676a(Chat chat, Context context, String str, TextView textView, TextView textView2, ShareGroupChatContent shareGroupChatContent, View view, String str2) {
        MessageHitPoint.m213275a(TextUtils.isEmpty(str2));
        HashMap hashMap = new HashMap();
        hashMap.put("is_reason_filled", TextUtils.isEmpty(str2) ? "false" : "true");
        ChatHitPointNew.f135660c.mo187393b(chat, "confirm", "none", hashMap);
        m212667a(context, chat, str2, str, textView, textView2, shareGroupChatContent);
    }

    /* renamed from: a */
    public static void m212673a(ErrorResult errorResult, TextView textView, TextView textView2, Context context, Chat chat, ShareGroupChatContent shareGroupChatContent, int i, Message message, String str) {
        ShareGroupChatContent.GroupState groupState;
        if (errorResult == null) {
            Log.m165389i("ShareGroupChatHelper", "error is null");
            return;
        }
        ShareGroupChatContent.GroupState groupState2 = ShareGroupChatContent.GroupState.SHARE_EXPIRED;
        int errorCode = errorResult.getErrorCode();
        String str2 = "";
        if (errorCode == 4018) {
            UDToast.makeToast(context, errorResult.getDisplayMsg(UIUtils.getString(context, R.string.Lark_Group_UnableJoinDisbandedToast))).show();
            groupState = ShareGroupChatContent.GroupState.GROUP_DISBANDED;
            str2 = "group_disband";
        } else if (errorCode != 4037) {
            if (errorCode != 5008) {
                if (errorCode == 5016) {
                    UDToast.makeToast(context, errorResult.getDisplayMsg(UIUtils.getString(context, R.string.Lark_Group_UnableJoinLeftToast))).show();
                    groupState = ShareGroupChatContent.GroupState.INVITER_LEFT;
                    str2 = "sharing_group_user_exit";
                } else if (errorCode == 5020) {
                    m212666a(context, chat, str, textView, textView2, shareGroupChatContent);
                    groupState = ShareGroupChatContent.GroupState.NEED_APPLY;
                } else if (errorCode == 6002) {
                    BillingTipsDialog.m226151a(context, errorResult.getDisplayMsg(), BillingTipsDialog.Type.CHAT_JOIN_GROUP_NUMBER_LIMIT);
                    groupState = ShareGroupChatContent.GroupState.GROUP_IS_FULL;
                } else if (errorCode != 260008) {
                    switch (errorCode) {
                        case 4011:
                            boolean z = shareGroupChatContent.getExpireTime() * 1000 > System.currentTimeMillis();
                            UDToast.makeToast(context, errorResult.getDisplayMsg(UIUtils.getString(context, z ? R.string.Lark_Group_InvitationDisabledToast : R.string.Lark_Group_InvitationExpiredToast))).show();
                            ShareGroupChatContent.GroupState groupState3 = z ? ShareGroupChatContent.GroupState.SHARING_DISABLED : ShareGroupChatContent.GroupState.SHARE_EXPIRED;
                            String str3 = z ? "sharing_method_stop" : str2;
                            shareGroupChatContent.setJoinToken(str2);
                            groupState = groupState3;
                            str2 = str3;
                            break;
                        case 4012:
                            break;
                        case 4013:
                            UDToast.makeToast(context, errorResult.getDisplayMsg(UIUtils.getString(context, R.string.Lark_Legacy_GroupMemberOutOfRange))).show();
                            groupState = ShareGroupChatContent.GroupState.GROUP_IS_FULL;
                            ChatHitPointNew.f135660c.mo187397c(ChatHitPointExtraParams.TextType.MEMBER_JOIN);
                            str2 = "group_member_full";
                            break;
                        default:
                            switch (errorCode) {
                                case 4026:
                                    UDToast.makeToast(context, errorResult.getDisplayMsg(UIUtils.getString(context, R.string.Lark_Groups_CantOpenGroupLink))).show();
                                    groupState = ShareGroupChatContent.GroupState.LINK_CERTIFIED_REFUSE;
                                    break;
                                case 4027:
                                    UDToast.makeToast(context, errorResult.getDisplayMsg(UIUtils.getString(context, R.string.Lark_Groups_CantReadGroupCode))).show();
                                    groupState = ShareGroupChatContent.GroupState.QR_CODE_CERTIFIED_REFUSE;
                                    break;
                                case 4028:
                                    UDToast.makeToast(context, errorResult.getDisplayMsg(UIUtils.getString(context, R.string.Lark_Groups_CantJoinGroup))).show();
                                    groupState = ShareGroupChatContent.GroupState.SHARE_CARD_CERTIFIED_REFUSE;
                                    break;
                                default:
                                    groupState = ShareGroupChatContent.GroupState.SHARE_EXPIRED;
                                    UDToast.makeToast(context, errorResult.getDisplayMsg()).show();
                                    break;
                            }
                    }
                } else {
                    UDToast.makeToast(context, errorResult.getDisplayMsg(UIUtils.getString(context, R.string.Lark_Contacts_PermissionControlDescFive))).show();
                    groupState = ShareGroupChatContent.GroupState.NO_EXTERNAL_COMMUNICATION_AUTHORITY;
                    str2 = "internal_user_cannot_operate";
                }
            }
            C35228b.m137564a().mo121114a(context, ChatBundle.m109259a().mo105927a(chat.getId()).mo105923a(ChatBundle.SourceType.CARD).mo105929a());
            C29990c.m110930b().mo134512K().mo134694b(chat.getId());
            groupState = ShareGroupChatContent.GroupState.ALREADY_IN_GROUP;
        } else {
            UDToast.makeToast(context, errorResult.getDisplayMsg(UIUtils.getString(context, R.string.Lark_Group_InternalContactAdminJoinToast))).show();
            groupState = ShareGroupChatContent.GroupState.EXTERNAL_USERS_CANNOT_OPERATE;
            str2 = "external_user_cannot_operate";
        }
        shareGroupChatContent.setJoinChatErrState(groupState);
        m212678a(chat, groupState, textView, textView2);
        m212677a(chat, message, true, str2);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static void m212678a(Chat chat, ShareGroupChatContent.GroupState groupState, TextView textView, TextView textView2) {
        boolean z;
        if (textView != null) {
            int i = R.color.line_border_component;
            Context context = textView.getContext();
            int i2 = C548232.f135342a[groupState.ordinal()];
            int i3 = R.color.ud_button_blue_text;
            int i4 = R.string.Lark_Group_ApplyToEnter;
            int i5 = R.string.Lark_Groups_GroupCard;
            boolean z2 = true;
            switch (i2) {
                case 1:
                    i5 = R.string.Lark_Legacy_EnterGroupChat;
                    i4 = R.string.Lark_Legacy_Open;
                    i3 = R.color.text_title;
                    z = true;
                    break;
                case 2:
                    i = R.color.ud_button_blue_stroke;
                    z = true;
                    break;
                case 3:
                    i5 = R.string.Lark_Legacy_EventShareExpired;
                    z = false;
                    i3 = R.color.text_disable;
                    i4 = 0;
                    z2 = false;
                    break;
                case 4:
                    i5 = R.string.Lark_Group_PendingApprovalButton;
                    z = false;
                    i3 = R.color.text_disable;
                    break;
                case 5:
                    i5 = R.string.Lark_Group_InviterLeftButton;
                    z = false;
                    i3 = R.color.text_disable;
                    i4 = 0;
                    z2 = false;
                    break;
                case 6:
                    i5 = R.string.Lark_Group_DisbandedButton;
                    z = false;
                    i3 = R.color.text_disable;
                    i4 = 0;
                    z2 = false;
                    break;
                case 7:
                    i5 = R.string.Lark_Group_InvitationDisabledButton;
                    z = false;
                    i3 = R.color.text_disable;
                    i4 = 0;
                    z2 = false;
                    break;
                case 8:
                    i5 = R.string.Lark_Group_UnableJoinExternalGroup;
                    z = false;
                    i3 = R.color.text_disable;
                    i4 = 0;
                    z2 = false;
                    break;
                case 9:
                    i5 = R.string.Lark_Legacy_GroupMemberOutOfRange;
                    z = false;
                    i3 = R.color.text_disable;
                    i4 = 0;
                    z2 = false;
                    break;
                case 10:
                    i5 = R.string.Lark_Group_ContactAdminButton;
                    z = false;
                    i3 = R.color.text_disable;
                    i4 = 0;
                    z2 = false;
                    break;
                case 11:
                    i5 = R.string.Lark_Groups_CantJoinGroup;
                    z = false;
                    i3 = R.color.text_disable;
                    i4 = 0;
                    z2 = false;
                    break;
                default:
                    i4 = R.string.Lark_Legacy_JoinGroupChat;
                    i = R.color.ud_button_blue_stroke;
                    z = true;
                    break;
            }
            if (textView2 != null) {
                textView2.setText(i5);
            }
            if (!z2 || i3 == 0) {
                textView.setVisibility(4);
                return;
            }
            textView.setVisibility(0);
            textView.setText(i4);
            textView.setTextColor(UDColorUtils.getColor(context, i3));
            textView.setEnabled(z);
            if (textView instanceof UDButton) {
                ((UDButton) textView).setStrokeColor(UDColorUtils.getColor(context, i));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m212674a(Chat chat, Context context, View view) {
        if (chat != null) {
            C35228b.m137564a().mo121114a(context, ChatBundle.m109259a().mo105927a(chat.getId()).mo105926a(chat.getChatMode()).mo105923a(ChatBundle.SourceType.CARD).mo105929a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m212675a(Chat chat, Context context, ShareGroupChatContent shareGroupChatContent, Message message, View view) {
        if (C29990c.m110930b().mo134586n().mo134685a("group.role.obeserver") && C56146m.m218889a(chat)) {
            C56095h.m218564a().mo191239a(Navigation.from(context), chat.getId(), "group_share_card");
        } else if (chat.isEdu()) {
            m212663a(context, (TextView) null, (TextView) null, chat, shareGroupChatContent, 0, message, shareGroupChatContent.getJoinToken());
        } else {
            m212669a(context, message);
            ChatHitPointNew.f135660c.mo187384a(chat, "group_card_title_share", "im_chat_group_card_view", ChatParamUtils.f88665a.mo126913a(message));
        }
    }

    /* renamed from: a */
    public static boolean m212680a(Message message) {
        ShareGroupChatContent shareGroupChatContent = (ShareGroupChatContent) message.getContent();
        if (shareGroupChatContent == null || shareGroupChatContent.getChat() == null) {
            return true;
        }
        long expireTime = shareGroupChatContent.getExpireTime();
        if (TextUtils.isEmpty(shareGroupChatContent.getJoinToken()) || expireTime * 1000 <= System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m212672a(final TextView textView) {
        if (textView != null) {
            final String string = UIHelper.getString(R.string.Lark_Legacy_EventShareExpired);
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.share_group.C54821f.AnonymousClass10 */

                public void run() {
                    textView.setText(string);
                    TextView textView = textView;
                    textView.setTextColor(UIUtils.getColor(textView.getContext(), R.color.text_disable));
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.share_group.f$2 */
    public static /* synthetic */ class C548232 {

        /* renamed from: a */
        static final /* synthetic */ int[] f135342a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 133
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.share_group.C54821f.C548232.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m212669a(Context context, Message message) {
        C54834h.m212699a(context, message);
    }

    /* renamed from: a */
    public static void m212662a(Context context, View view, Message message) {
        ShareGroupChatContent shareGroupChatContent = (ShareGroupChatContent) message.getContent();
        Chat chat = shareGroupChatContent.getChat();
        if (f135335a.mo121044b(chat)) {
            view.setOnClickListener(new View.OnClickListener(context) {
                /* class com.ss.android.lark.share_group.$$Lambda$f$IKzBqRizXbrarqTbfGfmxx1xMKc */
                public final /* synthetic */ Context f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C54821f.m212674a(Chat.this, this.f$1, view);
                }
            });
        } else {
            view.setOnClickListener(new View.OnClickListener(context, shareGroupChatContent, message) {
                /* class com.ss.android.lark.share_group.$$Lambda$f$TiI1Szu0zvmOlOktgCobx5tuKUc */
                public final /* synthetic */ Context f$1;
                public final /* synthetic */ ShareGroupChatContent f$2;
                public final /* synthetic */ Message f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void onClick(View view) {
                    C54821f.m212675a(Chat.this, this.f$1, this.f$2, this.f$3, view);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m212671a(final Context context, final ShareGroupChatContent shareGroupChatContent, final Chat chat) {
        C32821b.m126120a().mo121144n(shareGroupChatContent.getJoinToken(), new IGetDataCallback<String>() {
            /* class com.ss.android.lark.share_group.C54821f.C548319 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                LKUIToast.show(context, UIHelper.getString(R.string.Lark_Legacy_EventShareExpired));
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                C29990c.m110930b().mo134523V().mo134438a(context, chat.getId(), shareGroupChatContent.getJoinToken(), chat.getTenantId(), str, true);
            }
        });
    }

    /* renamed from: a */
    public static void m212670a(Context context, Message message, boolean z, boolean z2) {
        C54834h.m212700a(context, message, z, z2);
    }

    /* renamed from: a */
    public static void m212668a(Context context, Chat chat, boolean z, boolean z2) {
        Message message = new Message();
        ShareGroupChatContent shareGroupChatContent = new ShareGroupChatContent();
        shareGroupChatContent.setChat(chat);
        shareGroupChatContent.setExpireTime(System.currentTimeMillis());
        message.setMessageContent(shareGroupChatContent);
        message.setType(Message.Type.SHARE_GROUP_CHAT);
        m212670a(context, message, z, z2);
    }

    /* renamed from: a */
    public static void m212664a(Context context, TextView textView, TextView textView2, Message message, int i) {
        m212665a(context, textView, textView2, message, i, (View.OnClickListener) null);
    }

    /* renamed from: a */
    public static void m212665a(final Context context, final TextView textView, final TextView textView2, final Message message, final int i, final View.OnClickListener onClickListener) {
        final ShareGroupChatContent shareGroupChatContent = (ShareGroupChatContent) message.getContent();
        shareGroupChatContent.getExpireTime();
        final String joinToken = shareGroupChatContent.getJoinToken();
        final Chat chat = shareGroupChatContent.getChat();
        boolean b = f135335a.mo121044b(chat);
        ShareGroupChatContent.GroupState groupState = ShareGroupChatContent.GroupState.CAN_JOIN_DIRECTLY;
        if (b) {
            MessageHitPoint.f135779d.mo187527a(chat, true);
            groupState = ShareGroupChatContent.GroupState.ALREADY_IN_GROUP;
            textView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.share_group.C54821f.View$OnClickListenerC548221 */

                public void onClick(View view) {
                    C54821f.m212677a(chat, message, false, (String) null);
                    C35228b.m137564a().mo121114a(context, ChatBundle.m109259a().mo105927a(chat.getId()).mo105923a(ChatBundle.SourceType.CARD).mo105933c("group_share").mo105929a());
                    C29990c.m110930b().mo134512K().mo134694b(chat.getId());
                    View.OnClickListener onClickListener = onClickListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                }
            });
        } else {
            if (m212680a(message)) {
                if (i != 4) {
                    groupState = ShareGroupChatContent.GroupState.SHARE_EXPIRED;
                    textView.setOnClickListener(new View.OnClickListener() {
                        /* class com.ss.android.lark.share_group.C54821f.View$OnClickListenerC548243 */

                        public void onClick(View view) {
                            C54821f.m212677a(chat, message, false, (String) null);
                            View.OnClickListener onClickListener = onClickListener;
                            if (onClickListener != null) {
                                onClickListener.onClick(view);
                            }
                        }
                    });
                }
            }
            textView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.share_group.C54821f.View$OnClickListenerC548254 */

                public void onClick(View view) {
                    View.OnClickListener onClickListener = onClickListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    if (i == 4) {
                        C55973a.m217526a(context, chat.getId(), new C55973a.AbstractC55975a() {
                            /* class com.ss.android.lark.share_group.C54821f.View$OnClickListenerC548254.C548261 */

                            @Override // com.ss.android.lark.threadtab.C55973a.AbstractC55975a
                            /* renamed from: c */
                            public void mo187056c(String str) {
                            }

                            @Override // com.ss.android.lark.threadtab.C55973a.AbstractC55975a
                            /* renamed from: d */
                            public void mo187057d(String str) {
                            }

                            @Override // com.ss.android.lark.threadtab.C55973a.AbstractC55975a
                            /* renamed from: e */
                            public void mo187058e(String str) {
                            }

                            @Override // com.ss.android.lark.threadtab.C55973a.AbstractC55975a
                            /* renamed from: a */
                            public void mo187054a(String str) {
                                UDToast.show(context, (int) R.string.Lark_Legacy_RequestSentApprovalPendingToast);
                            }

                            @Override // com.ss.android.lark.threadtab.C55973a.AbstractC55975a
                            /* renamed from: b */
                            public void mo187055b(String str) {
                                C35228b.m137564a().mo121114a(context, ChatBundle.m109259a().mo105927a(chat.getId()).mo105923a(ChatBundle.SourceType.CARD).mo105929a());
                                C29990c.m110930b().mo134512K().mo134694b(chat.getId());
                            }
                        });
                        return;
                    }
                    MessageHitPoint.f135779d.mo187527a(chat, false);
                    Chat chat = chat;
                    if (chat == null || !chat.isEdu()) {
                        C54821f.m212681b(context, textView, textView2, chat, shareGroupChatContent, i, message, joinToken);
                    } else {
                        C54821f.m212663a(context, textView, textView2, chat, shareGroupChatContent, i, message, joinToken);
                    }
                }
            });
            if (shareGroupChatContent.getJoinChatErrState() != null) {
                groupState = shareGroupChatContent.getJoinChatErrState();
            }
        }
        m212678a(chat, groupState, textView, textView2);
    }

    /* renamed from: a */
    private static void m212666a(Context context, Chat chat, String str, TextView textView, TextView textView2, ShareGroupChatContent shareGroupChatContent) {
        C29990c.m110930b().mo134595w().mo134355a(context, new IChatSettingDependency.AbstractC36448a(context, str, textView, textView2, shareGroupChatContent) {
            /* class com.ss.android.lark.share_group.$$Lambda$f$n1iKWIuH4naB46CsKuZeJGhNAYo */
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ TextView f$3;
            public final /* synthetic */ TextView f$4;
            public final /* synthetic */ ShareGroupChatContent f$5;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
            }

            @Override // com.ss.android.lark.dependency.IChatSettingDependency.AbstractC36448a
            public final void onClick(View view, String str) {
                C54821f.m212676a(Chat.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, view, str);
            }
        });
        ChatHitPointNew.f135660c.mo187392b(chat);
    }

    /* renamed from: a */
    private static void m212667a(final Context context, final Chat chat, String str, String str2, final TextView textView, final TextView textView2, final ShareGroupChatContent shareGroupChatContent) {
        C32821b.m126120a().mo120995a(chat.getId(), AddChatChatterApply.Ways.VIA_SHARE, Collections.singletonList(C29990c.m110930b().mo134515N().mo134394a()), str, (String) null, str2, new UIGetDataCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.share_group.C54821f.C548297 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                UDToast.show(context, (int) R.string.Lark_Legacy_RequestSentApprovalPendingToast);
                C54821f.m212678a(chat, ShareGroupChatContent.GroupState.PENDING_APPROVAL, textView, textView2);
                shareGroupChatContent.setJoinChatErrState(ShareGroupChatContent.GroupState.PENDING_APPROVAL);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                    UDToast.show(context, errorResult.getDisplayMsg());
                }
                Log.m165382e(errorResult.toString());
            }
        }));
    }

    /* renamed from: a */
    public static void m212663a(final Context context, final TextView textView, final TextView textView2, final Chat chat, final ShareGroupChatContent shareGroupChatContent, final int i, final Message message, final String str) {
        m212679a(chat.getId(), new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.share_group.C54821f.C548275 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                    LKUIToast.show(context, errorResult.getDisplayMsg());
                }
                C54821f.m212672a(textView);
                shareGroupChatContent.setJoinToken("");
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (bool.booleanValue()) {
                    C54821f.m212681b(context, textView, textView2, chat, shareGroupChatContent, i, message, str);
                } else {
                    C54821f.m212671a(context, shareGroupChatContent, chat);
                }
            }
        });
    }

    /* renamed from: b */
    public static void m212681b(final Context context, final TextView textView, final TextView textView2, final Chat chat, final ShareGroupChatContent shareGroupChatContent, final int i, final Message message, final String str) {
        f135335a.mo121058e(message.getId(), str, new UIGetDataCallback(new IGetDataCallback<Chat>() {
            /* class com.ss.android.lark.share_group.C54821f.C548308 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C54821f.m212673a(errorResult, textView, textView2, context, chat, shareGroupChatContent, i, message, str);
            }

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                C35228b.m137564a().mo121114a(context, ChatBundle.m109259a().mo105927a(chat.getId()).mo105923a(ChatBundle.SourceType.CARD).mo105929a());
                C29990c.m110930b().mo134512K().mo134694b(chat.getId());
                C54821f.m212677a(chat, message, false, (String) null);
            }
        }));
    }
}
