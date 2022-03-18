package com.ss.android.lark.chat.chatwindow.chat.message.text;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33347e;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.dependency.ICalendarDependency;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.statistics.intention.IntentionHitPoint;
import com.ss.android.lark.widget.light.listener.IIntentionClickListener;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.span.IntentionInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.text.a */
public class C33377a implements IIntentionClickListener, LinkEmojiTextView.AbstractC58523h {

    /* renamed from: a */
    public final WeakReference<Context> f85970a;

    /* renamed from: b */
    public final AbstractC33347e f85971b;

    /* renamed from: c */
    private final AbstractC33380a f85972c;

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.text.a$a */
    public interface AbstractC33380a {
        /* renamed from: a */
        void mo122890a(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback);
    }

    /* renamed from: a */
    private void m129289a(final IntentionInfo intentionInfo, final IGetDataCallback<IntentionInfo> iGetDataCallback) {
        this.f85972c.mo122890a(intentionInfo.chatId, new IGetDataCallback<ChatChatterResponse>() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.C33377a.C333792 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onSuccess(intentionInfo);
            }

            /* renamed from: a */
            public void onSuccess(ChatChatterResponse aVar) {
                Chat n = C33377a.this.f85971b.mo122550n();
                if (n == null) {
                    iGetDataCallback.onSuccess(intentionInfo);
                    return;
                }
                if (n.getType() == Chat.Type.P2P || intentionInfo.isAtAll) {
                    for (ChatChatter chatChatter : aVar.mo136071e()) {
                        if (!chatChatter.isBot()) {
                            if (intentionInfo.chatterIds.indexOf(chatChatter.getChatter().getId()) == -1) {
                                intentionInfo.chatterIds.add(chatChatter.getChatter().getId());
                            }
                            if (intentionInfo.chatterIds.size() > 100) {
                                break;
                            }
                        }
                    }
                }
                iGetDataCallback.onSuccess(intentionInfo);
            }
        });
    }

    @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58523h, com.ss.android.lark.widget.light.listener.IIntentionClickListener
    /* renamed from: a */
    public void mo122884a(View view, IntentionInfo intentionInfo) {
        if (this.f85970a.get() != null) {
            IntentionHitPoint.f135746a.mo187499a(intentionInfo.chatId, intentionInfo.messageId);
            mo122887a(intentionInfo, true);
        }
    }

    /* renamed from: a */
    public void mo122885a(IntentionInfo intentionInfo, Activity activity) {
        C29990c.m110930b().mo134517P().mo134339a(activity, intentionInfo.chatId, intentionInfo.isMeetting, intentionInfo.startTime, intentionInfo.endTime, intentionInfo.title, new ArrayList<>(intentionInfo.chatterIds), intentionInfo.isAtAll, ICalendarDependency.Scene.FREEBUSY);
    }

    /* renamed from: a */
    public void mo122886a(IntentionInfo intentionInfo, Context context) {
        String[] strArr = {context.getString(R.string.Calendar_ChatFindTime_ActionSheetCreateNewEvent)};
        View inflate = LayoutInflater.from(context).inflate(R.layout.footer_intention_dialog, (ViewGroup) null);
        inflate.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.$$Lambda$a$G2UAma8sBtG6JJOXlIrk4JC3cI */

            public final void onClick(View view) {
                DialogC25637f.this.dismiss();
            }
        });
    }

    /* renamed from: a */
    public void mo122887a(IntentionInfo intentionInfo, final boolean z) {
        m129289a(intentionInfo, new IGetDataCallback<IntentionInfo>() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.C33377a.C333781 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(IntentionInfo intentionInfo) {
                Context context = C33377a.this.f85970a.get();
                if (context != null) {
                    if (z) {
                        C33377a.this.mo122886a(intentionInfo, context);
                    } else {
                        C33377a.this.mo122885a(intentionInfo, (Activity) context);
                    }
                }
            }
        });
    }

    public C33377a(Context context, AbstractC33380a aVar, AbstractC33347e eVar) {
        this.f85970a = new WeakReference<>(context);
        this.f85972c = aVar;
        this.f85971b = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m129288a(IntentionInfo intentionInfo, Context context, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            IntentionHitPoint.f135746a.mo187500b(intentionInfo.chatId, intentionInfo.messageId);
            mo122885a(intentionInfo, (Activity) context);
        }
        dialogInterface.dismiss();
    }
}
