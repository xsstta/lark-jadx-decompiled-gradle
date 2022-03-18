package com.ss.android.lark.pin.impl;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.C25644o;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.dialog.LKUIListItemData;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.impl.C51489b;
import com.ss.android.lark.pin.impl.entity.Pin;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.service.PinService;
import com.ss.android.lark.pin.impl.statistics.ChatPinExtraParams;
import com.ss.android.lark.pin.impl.statistics.ChatPinHitPoint;
import com.ss.android.lark.pin.impl.v3.binder.C51530a;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.C51543d;
import com.ss.android.lark.pin.impl.view.DesktopPinDialog;
import com.ss.android.lark.ui.BasePopupWindow;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.lark.pin.impl.b */
public class C51489b {

    /* renamed from: com.ss.android.lark.pin.impl.b$a */
    public interface AbstractC51492a {
        /* renamed from: a */
        void mo177254a(boolean z);
    }

    /* renamed from: com.ss.android.lark.pin.impl.b$b */
    public interface AbstractC51493b {
        /* renamed from: a */
        void mo177334a(PinInfo bVar);

        /* renamed from: b */
        void mo177335b(PinInfo bVar);

        /* renamed from: c */
        void mo177336c(PinInfo bVar);

        /* renamed from: d */
        void mo177337d(PinInfo bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m199746a(AbstractC51493b bVar, PinInfo bVar2, PopupWindow popupWindow, View view) {
        bVar.mo177337d(bVar2);
        popupWindow.dismiss();
    }

    /* renamed from: a */
    public static boolean m199749a(Message message) {
        return message.getType() == Message.Type.CARD && ((CardContent) message.getContent()).getType() == CardContent.Type.VOTE;
    }

    /* renamed from: a */
    public static boolean m199748a(Chat chat, Message message) {
        if (chat.isSecret() || chat.isOnCall()) {
            return false;
        }
        if (message != null) {
            return !message.isPreMessage() && m199752c(message) != -1;
        }
        return true;
    }

    /* renamed from: a */
    public static void m199747a(final String str, final int i, final String str2, final String str3, final String str4, final boolean z) {
        PinService.f128155a.mo177339a(str, z, new IGetDataCallback<Void>() {
            /* class com.ss.android.lark.pin.impl.C51489b.C514912 */

            /* renamed from: a */
            public void onSuccess(Void r9) {
                boolean equals = str3.equals(str4);
                if (z) {
                    ChatPinHitPoint.f128202a.mo177402a(str2, i, str, "success", equals);
                } else {
                    ChatPinHitPoint.f128202a.mo177404a(str2, String.valueOf(i), str, "0", equals, "1");
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                boolean equals = str3.equals(str4);
                if (z) {
                    ChatPinHitPoint.f128202a.mo177402a(str2, i, str, "failure", equals);
                } else {
                    ChatPinHitPoint.f128202a.mo177404a(str2, String.valueOf(i), str, "-1", equals, "1");
                }
            }
        });
    }

    /* renamed from: b */
    public static boolean m199751b(Message message) {
        if (message.getType() == Message.Type.FILE) {
            return !((FileContent) message.getContent()).isLanTransfer();
        }
        return !m199749a(message);
    }

    /* renamed from: c */
    public static int m199752c(Message message) {
        Message.Type type = message.getType();
        if (type == Message.Type.TEXT) {
            return 1;
        }
        if (type == Message.Type.POST) {
            return 2;
        }
        if (type == Message.Type.IMAGE) {
            return 4;
        }
        if (type == Message.Type.FILE) {
            return 8;
        }
        if (type == Message.Type.SHARE_GROUP_CHAT) {
            return 16;
        }
        if (type == Message.Type.AUDIO) {
            return 32;
        }
        if (type == Message.Type.MERGE_FORWARD) {
            if (((MergeForwardContent) message.getContent()).isFromPrivateTopic()) {
                return 65536;
            }
            return 64;
        } else if (type == Message.Type.MEDIA) {
            return SmActions.ACTION_ONTHECALL_EXIT;
        } else {
            if (type == Message.Type.SHARE_CALENDAR_EVENT) {
                return DynamicModule.f58006b;
            }
            if (type == Message.Type.STICKER) {
                return 1024;
            }
            if (type == Message.Type.LOCATION) {
                return 2048;
            }
            if (type == Message.Type.SHARE_USER_CARD) {
                return 8192;
            }
            if (m199749a(message)) {
                return MediaPlayer.MEDIA_PLAYER_OPTION_APPID;
            }
            if (type == Message.Type.TODO) {
                return 16384;
            }
            if (type != Message.Type.FOLDER) {
                Log.m165383e("PinBinderFactory", "not support Message type : " + type);
                return -1;
            } else if (PinModule.m199585b().mo144035i().mo144078a()) {
                return 32768;
            } else {
                return -1;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Unit m199737a(AbstractC51492a aVar, boolean z) {
        if (aVar == null) {
            return null;
        }
        aVar.mo177254a(z);
        return null;
    }

    /* renamed from: a */
    private static LKUIListItemData m199736a(Context context, int i) {
        LKUIListItemData nVar = new LKUIListItemData();
        nVar.mo89287a(UIUtils.getString(context, i));
        return nVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m199743a(DialogInterface dialogInterface, int i) {
        ChatPinHitPoint.f128202a.mo177411c(ChatPinExtraParams.Click.CANCEL.plus(ChatPinExtraParams.Target.IM_CHAT_PIN_VIEW));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Unit m199738a(AbstractC58992f fVar, PinInfo bVar, Dialog dialog) {
        ViewGroup viewGroup = (ViewGroup) dialog.findViewById(R.id.pin_content_wrapper);
        RecyclerView.ViewHolder a = fVar.mo200113a(viewGroup);
        if (a.itemView.getParent() == null) {
            viewGroup.addView(a.itemView);
        }
        fVar.mo31174a(a, 0, bVar);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m199750b(AbstractC51493b bVar, PinInfo bVar2, PopupWindow popupWindow, View view) {
        bVar.mo177336c(bVar2);
        popupWindow.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m199753c(AbstractC51493b bVar, PinInfo bVar2, PopupWindow popupWindow, View view) {
        bVar.mo177335b(bVar2);
        popupWindow.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m199754d(AbstractC51493b bVar, PinInfo bVar2, PopupWindow popupWindow, View view) {
        bVar.mo177334a(bVar2);
        popupWindow.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m199745a(AbstractC51492a aVar, boolean z, DialogInterface dialogInterface, int i) {
        ChatPinHitPoint.f128202a.mo177411c(ChatPinExtraParams.Click.CONFIRM.plus(ChatPinExtraParams.Target.IM_CHAT_PIN_VIEW));
        if (aVar != null) {
            aVar.mo177254a(z);
        }
    }

    /* renamed from: a */
    public static void m199740a(Context context, View view, PinInfo bVar, boolean z, AbstractC51493b bVar2) {
        boolean z2;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        View inflate = LayoutInflater.from(context).inflate(R.layout.chat_pin_menu_popup, (ViewGroup) null);
        BasePopupWindow basePopupWindow = new BasePopupWindow(inflate, -2, -2);
        TextView textView = (TextView) inflate.findViewById(R.id.btn_unpin);
        View findViewById = inflate.findViewById(R.id.un_pin_divider);
        TextView textView2 = (TextView) inflate.findViewById(R.id.btn_view_chat);
        View findViewById2 = inflate.findViewById(R.id.view_chat_divider);
        TextView textView3 = (TextView) inflate.findViewById(R.id.btn_forward);
        View findViewById3 = inflate.findViewById(R.id.forward_divider);
        TextView textView4 = (TextView) inflate.findViewById(R.id.btn_copy);
        Message.Type type = bVar.mo177396g().getType();
        if (type == Message.Type.TEXT || type == Message.Type.POST) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean b = m199751b(bVar.mo177396g());
        textView.setVisibility(0);
        textView.setOnClickListener(new View.OnClickListener(bVar, basePopupWindow) {
            /* class com.ss.android.lark.pin.impl.$$Lambda$b$xtfrqYt1zhqAeoME_pP_3Eo2VGU */
            public final /* synthetic */ PinInfo f$1;
            public final /* synthetic */ PopupWindow f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                C51489b.m199754d(C51489b.AbstractC51493b.this, this.f$1, this.f$2, view);
            }
        });
        findViewById.setVisibility(0);
        if (z) {
            textView2.setText(R.string.Lark_Chat_TopicImageJumpToTopic);
        }
        textView2.setVisibility(0);
        textView2.setOnClickListener(new View.OnClickListener(bVar, basePopupWindow) {
            /* class com.ss.android.lark.pin.impl.$$Lambda$b$ULYmmkC_XVYTsaEo25i__DDgDnM */
            public final /* synthetic */ PinInfo f$1;
            public final /* synthetic */ PopupWindow f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                C51489b.m199753c(C51489b.AbstractC51493b.this, this.f$1, this.f$2, view);
            }
        });
        if (b) {
            findViewById2.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setOnClickListener(new View.OnClickListener(bVar, basePopupWindow) {
                /* class com.ss.android.lark.pin.impl.$$Lambda$b$JptBFIDM6HTjpoX3nky_cQJQlo */
                public final /* synthetic */ PinInfo f$1;
                public final /* synthetic */ PopupWindow f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(View view) {
                    C51489b.m199750b(C51489b.AbstractC51493b.this, this.f$1, this.f$2, view);
                }
            });
        }
        if (z2) {
            findViewById3.setVisibility(0);
            textView4.setVisibility(0);
            textView4.setOnClickListener(new View.OnClickListener(bVar, basePopupWindow) {
                /* class com.ss.android.lark.pin.impl.$$Lambda$b$H8px9pAJ9LsDEV0PU96z6BEIFI */
                public final /* synthetic */ PinInfo f$1;
                public final /* synthetic */ PopupWindow f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(View view) {
                    C51489b.m199746a(C51489b.AbstractC51493b.this, this.f$1, this.f$2, view);
                }
            });
        }
        int measuredWidth = (-UIUtils.getWidth(inflate)) + view.getMeasuredWidth();
        int measuredHeight = (-UIUtils.getHeight(inflate)) - view.getMeasuredHeight();
        if (iArr[1] + measuredHeight <= 0) {
            measuredHeight = 0;
        }
        inflate.setOnClickListener(new View.OnClickListener(basePopupWindow) {
            /* class com.ss.android.lark.pin.impl.$$Lambda$b$uIfsw2FM0jnckmLODHphNNliyUY */
            public final /* synthetic */ PopupWindow f$0;

            {
                this.f$0 = r1;
            }

            public final void onClick(View view) {
                C51489b.m199744a(this.f$0, view);
            }
        });
        inflate.setFocusable(true);
        inflate.setFocusableInTouchMode(true);
        basePopupWindow.setFocusable(true);
        basePopupWindow.setOutsideTouchable(false);
        basePopupWindow.showAsDropDown(view, measuredWidth, measuredHeight);
    }

    /* renamed from: a */
    public static void m199742a(Context context, PinInfo bVar, boolean z, Chat chat, AbstractC51493b bVar2) {
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        Message.Type type = bVar.mo177396g().getType();
        if (type == Message.Type.TEXT || type == Message.Type.POST) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean b = m199751b(bVar.mo177396g());
        ArrayList arrayList = new ArrayList();
        if (PinModule.m199585b().mo144042p().mo144053a(chat)) {
            int size = arrayList.size();
            arrayList.add(m199736a(context, (int) R.string.Lark_Pin_UnpinButton));
            i = size;
        } else {
            i = -1;
        }
        int size2 = arrayList.size();
        if (z) {
            i2 = R.string.Lark_Chat_TopicImageJumpToTopic;
        } else {
            i2 = R.string.Lark_Pin_PinViewInChat;
        }
        arrayList.add(m199736a(context, i2));
        if (b) {
            int size3 = arrayList.size();
            arrayList.add(m199736a(context, (int) R.string.Lark_Pin_ForwardButton));
            i3 = size3;
        } else {
            i3 = -1;
        }
        if (z2) {
            int size4 = arrayList.size();
            arrayList.add(m199736a(context, (int) R.string.Lark_Pin_CopyButton));
            i4 = size4;
        } else {
            i4 = -1;
        }
        arrayList.add(m199736a(context, (int) R.string.Lark_Pin_CancelButton));
        ((C25644o) ((C25644o) ((C25644o) new C25644o(context).mo89205a(arrayList)).mo89210d(R.layout.chatpin_menu_dialog_item)).mo89290y(0).mo89202a(new DialogInterface.OnClickListener(i, bVar2, bVar, size2, i3, i4) {
            /* class com.ss.android.lark.pin.impl.$$Lambda$b$wBc46eH7qkcx9nFC4ngsm_ixT0c */
            public final /* synthetic */ int f$0;
            public final /* synthetic */ C51489b.AbstractC51493b f$1;
            public final /* synthetic */ PinInfo f$2;
            public final /* synthetic */ int f$3;
            public final /* synthetic */ int f$4;
            public final /* synthetic */ int f$5;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C51489b.m199739a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, dialogInterface, i);
            }
        })).mo89239c();
        ChatPinHitPoint.f128202a.mo177418j();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m199739a(int i, AbstractC51493b bVar, PinInfo bVar2, int i2, int i3, int i4, DialogInterface dialogInterface, int i5) {
        if (i5 == i) {
            bVar.mo177334a(bVar2);
        } else if (i5 == i2) {
            bVar.mo177335b(bVar2);
        } else if (i5 == i3) {
            bVar.mo177336c(bVar2);
        } else if (i5 == i4) {
            bVar.mo177337d(bVar2);
        }
        dialogInterface.dismiss();
    }

    /* renamed from: a */
    public static void m199741a(Context context, PinInfo bVar, String str, String str2, String str3, String str4, String str5, Boolean bool, AbstractC51492a aVar) {
        boolean z;
        String str6;
        int i;
        final AbstractC58992f<PinInfo, ? extends RecyclerView.ViewHolder> fVar;
        if (bVar.mo177397h() == null) {
            z = true;
        } else {
            z = false;
        }
        boolean b = DesktopUtil.m144307b();
        if (bool.booleanValue()) {
            str6 = context.getString(R.string.Lark_Chat_TopicToolPinAlertTitle);
            if (!z) {
                str6 = context.getString(R.string.Lark_Chat_TopicToolUnPinAlertTitle);
            }
        } else {
            str6 = UIHelper.mustacheFormat((int) R.string.Lark_Pin_TipForPinConfirmation, (String) null, (String) null);
            if (!z) {
                str6 = context.getString(R.string.Lark_Pin_TipForUnpinConfirmation);
            }
        }
        if (TextUtils.isEmpty(str) && !z) {
            str6 = context.getString(R.string.Lark_Legacy_UnpinConfirmationTitle);
        }
        String string = context.getString(R.string.Lark_Legacy_Cancel);
        if (z) {
            i = R.string.Lark_Pin_ConfirmPin;
        } else {
            i = R.string.Lark_Pin_ConfirmUnpin;
        }
        String string2 = context.getString(i);
        final PinInfo bVar2 = new PinInfo(bVar.mo177396g(), bVar.mo177397h(), str5);
        bVar2.mo177390a(true);
        if (z) {
            bVar2.mo177388a(new Pin(bVar.mo177396g().getId(), str4, str3, System.currentTimeMillis()));
        }
        C51530a aVar2 = new C51530a(context, null, null);
        int a = aVar2.mo31301a(bVar2);
        if (a == Message.Type.SHARE_GROUP_CHAT.getNumber()) {
            fVar = new C51543d(context, null);
        } else {
            fVar = aVar2.mo31302a(a);
        }
        if (!b) {
            new C25639g(context).mo89237b(str6).mo89238b(true).mo89251j(2).mo89252k(3).mo89258q(R.layout.chat_message_pin_item).mo89230a(new C25639g.AbstractC25641b() {
                /* class com.ss.android.lark.pin.impl.C51489b.C514901 */

                /* access modifiers changed from: protected */
                @Override // com.larksuite.component.ui.dialog.C25639g.AbstractC25641b
                /* renamed from: b */
                public void mo89274b(DialogC25637f fVar) {
                    ViewGroup viewGroup = (ViewGroup) fVar.findViewById(R.id.chat_message_pin_item_container);
                    RecyclerView.ViewHolder a = fVar.mo200113a(viewGroup);
                    if (a.itemView.getParent() == null) {
                        viewGroup.addView(a.itemView);
                    }
                    fVar.mo31174a(a, 0, bVar2);
                }
            }).mo89225a(R.id.lkui_dialog_btn_left, string, $$Lambda$b$Pm0F76PsQKaKEQUTbfEa49_Ha2w.INSTANCE).mo89225a(R.id.lkui_dialog_btn_right, string2, new DialogInterface.OnClickListener(z) {
                /* class com.ss.android.lark.pin.impl.$$Lambda$b$JtLXaFdKvaDSChYXeDSzTvEw3A4 */
                public final /* synthetic */ boolean f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C51489b.m199745a(C51489b.AbstractC51492a.this, this.f$1, dialogInterface, i);
                }
            }).mo89239c();
        } else {
            new DesktopPinDialog(context).mo177693b(str6).mo177690a(string).mo177691a(string2, new Function0(z) {
                /* class com.ss.android.lark.pin.impl.$$Lambda$b$zO1w91H8cUrc7XHb9vENwrbVnM */
                public final /* synthetic */ boolean f$1;

                {
                    this.f$1 = r2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C51489b.m199737a(C51489b.AbstractC51492a.this, this.f$1);
                }
            }).mo177692a(new Function1(bVar2) {
                /* class com.ss.android.lark.pin.impl.$$Lambda$b$2k1Ufkka0fr2Ruqfn7M3wJoWY */
                public final /* synthetic */ PinInfo f$1;

                {
                    this.f$1 = r2;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C51489b.m199738a(AbstractC58992f.this, this.f$1, (Dialog) obj);
                }
            }).show();
        }
        String valueOf = String.valueOf(bVar.mo177396g().getType());
        String id = bVar.mo177396g().getId();
        boolean equals = TextUtils.equals(str2, str4);
        if (z) {
            ChatPinHitPoint.f128202a.mo177403a(str, valueOf, id, "0", equals);
        } else {
            ChatPinHitPoint.f128202a.mo177409b(str, valueOf, id, "0", equals);
        }
        ChatPinHitPoint.f128202a.mo177419k();
    }
}
