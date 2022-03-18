package com.ss.android.lark.forward.template;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.lark.pb.im.v1.MergeForwardMessagesResponse;
import com.bytedance.lark.pb.im.v1.Transmit2ThreadTarget;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.template.AbstractC38405a;
import com.ss.android.lark.forward.dto.template.ForwardCallType;
import com.ss.android.lark.forward.dto.template.ForwardHitPoint;
import com.ss.android.lark.forward.dto.template.ForwardLocation;
import com.ss.android.lark.forward.dto.template.ForwardViewDependency;
import com.ss.android.lark.forward.dto.template.IForwardProxyExecutor;
import com.ss.android.lark.forward.template.MergeForwardTemplateFactory;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.utils.statistics.PerfLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MergeForwardTemplateFactory {

    /* access modifiers changed from: private */
    public static class ThreadMessageForwardExecutor implements IForwardProxyExecutor {
        public static final Parcelable.Creator<ThreadMessageForwardExecutor> CREATOR = new Parcelable.Creator<ThreadMessageForwardExecutor>() {
            /* class com.ss.android.lark.forward.template.MergeForwardTemplateFactory.ThreadMessageForwardExecutor.C384581 */

            /* renamed from: a */
            public ThreadMessageForwardExecutor[] newArray(int i) {
                return new ThreadMessageForwardExecutor[i];
            }

            /* renamed from: a */
            public ThreadMessageForwardExecutor createFromParcel(Parcel parcel) {
                return new ThreadMessageForwardExecutor();
            }
        };

        /* renamed from: a */
        public Activity f98879a;

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
        }

        ThreadMessageForwardExecutor() {
        }

        @Override // com.ss.android.lark.forward.dto.template.IForwardProxyExecutor
        /* renamed from: a */
        public void mo140900a(Activity activity) {
            this.f98879a = activity;
        }

        @Override // com.ss.android.lark.forward.dto.template.IForwardProxyExecutor
        /* renamed from: a */
        public void mo140901a(List<ForwardTarget> list, final Bundle bundle, final AbstractC38405a.AbstractC38406a aVar) {
            final ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            for (ForwardTarget forwardTarget : list) {
                if (forwardTarget.mo140565a() != 2) {
                    arrayList.add(forwardTarget.mo140567b());
                } else if (forwardTarget.mo140573g() != null) {
                    arrayList2.add(new Transmit2ThreadTarget(forwardTarget.mo140567b(), forwardTarget.mo140573g().getChatId()));
                }
            }
            final ArrayList<String> stringArrayList = bundle.getStringArrayList("key_message_ids");
            final Message message = (Message) bundle.getSerializable("key_message");
            final String string = bundle.getString("key_thread_id");
            final String string2 = bundle.getString("key_origin_merge_forward_id");
            final boolean z = bundle.getBoolean("key_need_copy_reaction", false);
            if (CollectionUtils.isEmpty(stringArrayList)) {
                C53241h.m205894a("MergeForwardTemplateFactory", "Topic merge forward failed，messageId is null");
            } else if (message == null) {
                C53241h.m205894a("MergeForwardTemplateFactory", "Topic merge forward failed，message is null");
            } else {
                C38364a.m151054a().mo140442d().mo140487a(arrayList, stringArrayList, message.getContent(), true, false, string, z, string2, arrayList2, new IGetDataCallback<MergeForwardMessagesResponse>() {
                    /* class com.ss.android.lark.forward.template.MergeForwardTemplateFactory.ThreadMessageForwardExecutor.C384592 */

                    /* renamed from: a */
                    public void onSuccess(MergeForwardMessagesResponse mergeForwardMessagesResponse) {
                        MergeForwardTemplateFactory.m151709a(bundle.getString("key_param_addition_note"), arrayList, mergeForwardMessagesResponse);
                        aVar.mo140599a(-1, (Intent) null);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(final ErrorResult errorResult) {
                        if (TemplateFactoryUtils.m151923a(errorResult)) {
                            aVar.mo140599a(-1, (Intent) null);
                        } else {
                            UICallbackExecutor.execute(new Runnable() {
                                /* class com.ss.android.lark.forward.template.MergeForwardTemplateFactory.ThreadMessageForwardExecutor.C384592.RunnableC384601 */

                                public void run() {
                                    if (errorResult.getErrorCode() == C38364a.m151054a().mo140442d().mo140493c()) {
                                        C384592.this.mo141086b(errorResult);
                                    } else if (errorResult.getErrorCode() == C38364a.m151054a().mo140442d().mo140496d()) {
                                        C384592.this.mo141085a(errorResult);
                                    } else if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                                        aVar.mo140601a(errorResult.getDisplayMsg(), true);
                                    }
                                }
                            });
                        }
                    }

                    /* renamed from: b */
                    public void mo141086b(ErrorResult errorResult) {
                        new C25639g(ThreadMessageForwardExecutor.this.f98879a).mo89237b(UIUtils.getString(ThreadMessageForwardExecutor.this.f98879a, R.string.Lark_Chat_TopicToolForward)).mo89238b(true).mo89242c(errorResult.getDisplayMsg()).mo89224a(R.id.lkui_dialog_btn_center, R.string.Lark_Legacy_Confirm, new DialogInterface.OnClickListener() {
                            /* class com.ss.android.lark.forward.template.$$Lambda$MergeForwardTemplateFactory$ThreadMessageForwardExecutor$2$llB0wGj64ubWN4WhUWI9lULF0 */

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                MergeForwardTemplateFactory.ThreadMessageForwardExecutor.C384592.m151717a(AbstractC38405a.AbstractC38406a.this, dialogInterface, i);
                            }
                        }).mo89239c();
                    }

                    /* renamed from: a */
                    public void mo141085a(ErrorResult errorResult) {
                        new C25639g(ThreadMessageForwardExecutor.this.f98879a).mo89237b(UIUtils.getString(ThreadMessageForwardExecutor.this.f98879a, R.string.Lark_Chat_TopicToolForward)).mo89238b(true).mo89242c(errorResult.getDisplayMsg()).mo89224a(R.id.lkui_dialog_btn_left, R.string.lkui_navigation_cancel, new DialogInterface.OnClickListener() {
                            /* class com.ss.android.lark.forward.template.$$Lambda$MergeForwardTemplateFactory$ThreadMessageForwardExecutor$2$v1k0oP9DqKVgeuKx0ioNRS8Qbck */

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                MergeForwardTemplateFactory.ThreadMessageForwardExecutor.C384592.m151719b(AbstractC38405a.AbstractC38406a.this, dialogInterface, i);
                            }
                        }).mo89225a(R.id.lkui_dialog_btn_right, UIUtils.getString(ThreadMessageForwardExecutor.this.f98879a, R.string.Lark_Chat_TopicToolForwardErrorContinue), new DialogInterface.OnClickListener(arrayList, stringArrayList, message, string, z, string2, arrayList2, bundle, aVar) {
                            /* class com.ss.android.lark.forward.template.$$Lambda$MergeForwardTemplateFactory$ThreadMessageForwardExecutor$2$jswPic6mGTki47wg9nP4z0f98 */
                            public final /* synthetic */ List f$1;
                            public final /* synthetic */ List f$2;
                            public final /* synthetic */ Message f$3;
                            public final /* synthetic */ String f$4;
                            public final /* synthetic */ boolean f$5;
                            public final /* synthetic */ String f$6;
                            public final /* synthetic */ List f$7;
                            public final /* synthetic */ Bundle f$8;
                            public final /* synthetic */ AbstractC38405a.AbstractC38406a f$9;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                                this.f$3 = r4;
                                this.f$4 = r5;
                                this.f$5 = r6;
                                this.f$6 = r7;
                                this.f$7 = r8;
                                this.f$8 = r9;
                                this.f$9 = r10;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                MergeForwardTemplateFactory.ThreadMessageForwardExecutor.C384592.this.m151718a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, dialogInterface, i);
                            }
                        }).mo89239c();
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public static /* synthetic */ void m151717a(AbstractC38405a.AbstractC38406a aVar, DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        aVar.mo140599a(-1, (Intent) null);
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: b */
                    public static /* synthetic */ void m151719b(AbstractC38405a.AbstractC38406a aVar, DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        aVar.mo140599a(-1, (Intent) null);
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public /* synthetic */ void m151718a(final List list, List list2, Message message, String str, boolean z, String str2, List list3, final Bundle bundle, final AbstractC38405a.AbstractC38406a aVar, DialogInterface dialogInterface, int i) {
                        C38364a.m151054a().mo140442d().mo140487a(list, list2, message.getContent(), true, true, str, z, str2, list3, new IGetDataCallback<MergeForwardMessagesResponse>() {
                            /* class com.ss.android.lark.forward.template.MergeForwardTemplateFactory.ThreadMessageForwardExecutor.C384592.C384612 */

                            /* renamed from: a */
                            public void onSuccess(MergeForwardMessagesResponse mergeForwardMessagesResponse) {
                                String string = bundle.getString("key_param_addition_note");
                                if (!TextUtils.isEmpty(string)) {
                                    MergeForwardTemplateFactory.m151709a(string, list, mergeForwardMessagesResponse);
                                }
                                aVar.mo140599a(-1, (Intent) null);
                            }

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                if (!TemplateFactoryUtils.m151923a(errorResult) && errorResult != null && !TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                                    aVar.mo140601a(errorResult.getDisplayMsg(), true);
                                }
                            }
                        });
                        dialogInterface.dismiss();
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private static IForwardProxyExecutor m151707a() {
        return new ThreadMessageForwardExecutor();
    }

    /* renamed from: a */
    private static Message m151705a(Chat chat) {
        Message message = new Message();
        message.setChatId(chat.getId());
        message.setType(Message.Type.MERGE_FORWARD);
        MergeForwardContent mergeForwardContent = new MergeForwardContent();
        mergeForwardContent.setType(chat.getType());
        if (chat.getType() == Chat.Type.P2P) {
            mergeForwardContent.setP2pCreatorName(C38364a.m151054a().mo140442d().mo140490b());
            if (C38364a.m151054a().mo140445g().mo140457b().equals(chat.getP2pChatterId())) {
                mergeForwardContent.setP2pPartnerName("");
            } else {
                mergeForwardContent.setP2pPartnerName(C38364a.m151054a().mo140442d().mo140497d(chat.getP2pChatterId()));
            }
        } else {
            mergeForwardContent.setGroupChatName(chat.getName());
        }
        message.setMessageContent(mergeForwardContent);
        return message;
    }

    /* renamed from: a */
    public static void m151709a(String str, List<String> list, MergeForwardMessagesResponse mergeForwardMessagesResponse) {
        if (!TextUtils.isEmpty(str) && mergeForwardMessagesResponse != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    C38364a.m151054a().mo140442d().mo140483a(str2, str, mergeForwardMessagesResponse.message_ids, (IGetDataCallback<String>) null);
                }
            }
            if (CollectionUtils.isNotEmpty(mergeForwardMessagesResponse.message2threads)) {
                for (Transmit2ThreadTarget transmit2ThreadTarget : mergeForwardMessagesResponse.message2threads.values()) {
                    C38364a.m151054a().mo140442d().mo140480a(str, transmit2ThreadTarget.channel_id, transmit2ThreadTarget.thread_id);
                }
            }
        }
    }

    /* renamed from: a */
    private static AbstractC38405a m151708a(ArrayList<String> arrayList, Message message, boolean z, String str) {
        return new AbstractC38405a(arrayList, message, z, str) {
            /* class com.ss.android.lark.forward.template.$$Lambda$MergeForwardTemplateFactory$Sv5b3N04DkwNkER2MdR7kVjtS8 */
            public final /* synthetic */ ArrayList f$0;
            public final /* synthetic */ Message f$1;
            public final /* synthetic */ boolean f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a
            public final void onForward(List list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
                MergeForwardTemplateFactory.m151710a(this.f$0, this.f$1, this.f$2, this.f$3, list, bundle, aVar);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m151710a(ArrayList arrayList, Message message, boolean z, String str, List list, final Bundle bundle, final AbstractC38405a.AbstractC38406a aVar) {
        final String contextId = PerfLog.getContextId();
        PerfLog.start("send_merge_forward", contextId, "");
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ForwardTarget forwardTarget = (ForwardTarget) it.next();
            if (forwardTarget.mo140565a() != 2) {
                arrayList2.add(forwardTarget.mo140567b());
            } else if (forwardTarget.mo140573g() != null) {
                arrayList3.add(new Transmit2ThreadTarget(forwardTarget.mo140567b(), forwardTarget.mo140573g().getChatId()));
            }
        }
        PerfLog.start("async_call_send_message", contextId, "");
        C38364a.m151054a().mo140442d().mo140487a(arrayList2, arrayList, message.getContent(), false, false, "", z, str, arrayList3, new IGetDataCallback<MergeForwardMessagesResponse>() {
            /* class com.ss.android.lark.forward.template.MergeForwardTemplateFactory.C384571 */

            /* renamed from: a */
            public void onSuccess(MergeForwardMessagesResponse mergeForwardMessagesResponse) {
                MergeForwardTemplateFactory.m151709a(bundle.getString("key_param_addition_note"), arrayList2, mergeForwardMessagesResponse);
                PerfLog.end("async_call_send_message", contextId, "");
                PerfLog.end("send_merge_forward", contextId, "");
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (!TemplateFactoryUtils.m151923a(errorResult)) {
                    UICallbackExecutor.execute(new Runnable(errorResult) {
                        /* class com.ss.android.lark.forward.template.$$Lambda$MergeForwardTemplateFactory$1$ac3gs6RWlrMbsjDdeeXB6b9yTaA */
                        public final /* synthetic */ ErrorResult f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            MergeForwardTemplateFactory.C384571.m151711a(AbstractC38405a.AbstractC38406a.this, this.f$1);
                        }
                    });
                    PerfLog.end("async_call_send_messag", contextId, "");
                    PerfLog.end("send_merge_forward", contextId, "");
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m151711a(AbstractC38405a.AbstractC38406a aVar, ErrorResult errorResult) {
                aVar.mo140601a(errorResult.getDisplayMsg(), false);
            }
        });
        aVar.mo140599a(-1, new Intent());
    }

    /* renamed from: a */
    public static ForwardTemplate m151706a(Context context, Chat chat, ArrayList<String> arrayList, int i, boolean z, String str, ForwardCallType forwardCallType, ForwardLocation forwardLocation, boolean z2, String str2) {
        ForwardHitPoint forwardHitPoint;
        if (chat == null) {
            return null;
        }
        ForwardTemplate.C38388a aVar = new ForwardTemplate.C38388a();
        Message a = m151705a(chat);
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_message", a);
        if (z) {
            bundle.putStringArrayList("key_message_ids", arrayList);
            bundle.putString("key_thread_id", str);
            bundle.putString("key_origin_merge_forward_id", str2);
            bundle.putBoolean("key_need_copy_reaction", z2);
        }
        aVar.mo140609a(bundle);
        aVar.mo140613a(C38508c.m151888a(context, a));
        aVar.mo140615a(new ForwardViewDependency.C38404a().mo140891a(C38506b.m151886a(context, a)).mo140892a(new MessageForwardEnhancedView()).mo140897b());
        if (z) {
            forwardHitPoint = new ForwardHitPoint.Builder().mo140799b("group_topic").mo140794a(forwardCallType).mo140795a(forwardLocation).mo140797a(arrayList).mo140798a();
        } else {
            forwardHitPoint = new ForwardHitPoint.Builder().mo140794a(forwardCallType).mo140795a(forwardLocation).mo140797a(arrayList).mo140798a();
        }
        aVar.mo140611a(forwardHitPoint);
        if (z) {
            return aVar.mo140616a(m151707a());
        }
        return aVar.mo140617a(m151708a(arrayList, a, z2, str2));
    }
}
