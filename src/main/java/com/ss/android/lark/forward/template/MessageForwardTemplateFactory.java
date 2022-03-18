package com.ss.android.lark.forward.template;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.lark.pb.im.v1.Transmit2ThreadTarget;
import com.bytedance.lark.pb.im.v1.TransmitResponse;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ShareDataForwardData;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.template.AbstractC38405a;
import com.ss.android.lark.forward.dto.template.ForwardCallType;
import com.ss.android.lark.forward.dto.template.ForwardFeature;
import com.ss.android.lark.forward.dto.template.ForwardHitPoint;
import com.ss.android.lark.forward.dto.template.ForwardLocation;
import com.ss.android.lark.forward.dto.template.ForwardViewDependency;
import com.ss.android.lark.forward.dto.template.IForwardSelectListener;
import com.ss.android.lark.forward.impl.statistics.AppreciablePerformance;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MessageForwardTemplateFactory {

    public @interface From {
    }

    /* renamed from: a */
    private static AbstractC38405a m151779a(ImageContent imageContent) {
        return new AbstractC38405a() {
            /* class com.ss.android.lark.forward.template.$$Lambda$MessageForwardTemplateFactory$hD3HkOVL1SroKVuFRPuQ6RehQ1o */

            @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a
            public final void onForward(List list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
                MessageForwardTemplateFactory.m151782a(ImageContent.this, list, bundle, aVar);
            }
        };
    }

    /* renamed from: a */
    private static AbstractC38405a m151777a(Context context, Message message) {
        return new AbstractC38405a(context) {
            /* class com.ss.android.lark.forward.template.$$Lambda$MessageForwardTemplateFactory$E8YPxMP8y67OvwLkRl6JAk1iAw */
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a
            public final void onForward(List list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
                MessageForwardTemplateFactory.m151781a(Message.this, this.f$1, list, bundle, aVar);
            }
        };
    }

    /* renamed from: b */
    private static boolean m151783b(Context context, Message message) {
        StickerContent stickerContent;
        if (message.getType() != Message.Type.STICKER || (stickerContent = (StickerContent) message.getContent()) == null || stickerContent.isPaid()) {
            return false;
        }
        LKUIToast.show(context, (int) R.string.Lark_Chat_StickerPackNeedBuy);
        return true;
    }

    /* renamed from: a */
    private static AbstractC38405a m151778a(Message message, int i, String str) {
        return new AbstractC38405a(i, message, str) {
            /* class com.ss.android.lark.forward.template.$$Lambda$MessageForwardTemplateFactory$ral5Z4qumqRbZMvIs1dWVpcCr8 */
            public final /* synthetic */ int f$0;
            public final /* synthetic */ Message f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a
            public final void onForward(List list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
                MessageForwardTemplateFactory.m151780a(this.f$0, this.f$1, this.f$2, list, bundle, aVar);
            }
        };
    }

    /* renamed from: a */
    public static ForwardTemplate m151776a(Context context, Message message, ForwardCallType forwardCallType, ForwardLocation forwardLocation) {
        return m151775a(context, message, 1, null, forwardCallType, forwardLocation, "");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m151782a(ImageContent imageContent, List list, final Bundle bundle, final AbstractC38405a.AbstractC38406a aVar) {
        final ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ForwardTarget) it.next()).mo140567b());
        }
        final ShareDataForwardData shareDataForwardData = new ShareDataForwardData();
        shareDataForwardData.setImages(imageContent.getImageSet().getOrigin().getUrls());
        Observable.create(new ObservableOnSubscribe<Map<String, Chat>>() {
            /* class com.ss.android.lark.forward.template.MessageForwardTemplateFactory.C384815 */

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(ObservableEmitter<Map<String, Chat>> observableEmitter) throws Exception {
                observableEmitter.onNext(C38364a.m151054a().mo140442d().mo140474a(arrayList));
            }
        }).subscribeOn(LarkRxSchedulers.io()).subscribe(new Consumer<Map<String, Chat>>() {
            /* class com.ss.android.lark.forward.template.MessageForwardTemplateFactory.C384793 */

            /* renamed from: a */
            public void accept(Map<String, Chat> map) throws Exception {
                String string = bundle.getString("key_param_addition_note", "");
                for (Chat chat : map.values()) {
                    shareDataForwardData.setExtraInfo(string);
                    C38364a.m151054a().mo140451m().mo140515a(chat, shareDataForwardData);
                }
                aVar.mo140599a(-1, (Intent) null);
            }
        }, new Consumer<Throwable>() {
            /* class com.ss.android.lark.forward.template.MessageForwardTemplateFactory.C384804 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                aVar.mo140601a((String) null, false);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m151781a(Message message, final Context context, List list, Bundle bundle, final AbstractC38405a.AbstractC38406a aVar) {
        final String a = AppreciablePerformance.f98815c.mo140988a("ForwardPickFragment", 3);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ForwardTarget) it.next()).mo140567b());
        }
        C38364a.m151054a().mo140442d().mo140482a(message.getThreadId(), message.getChatId(), arrayList, new IGetDataCallback<Void>() {
            /* class com.ss.android.lark.forward.template.MessageForwardTemplateFactory.C384782 */

            /* renamed from: a */
            public void onSuccess(Void r3) {
                AppreciablePerformance.f98815c.mo140996b(a, 3);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                AppreciablePerformance.f98815c.mo140991a(errorResult.getErrorCode(), errorResult.getMessage(), "ForwardPickFragment", 3);
                if (!TemplateFactoryUtils.m151923a(errorResult) && errorResult != null && errorResult.getErrorCode() == C38364a.m151054a().mo140442d().mo140468a()) {
                    aVar.mo140601a(errorResult.getDisplayMsg(UIUtils.getString(context, R.string.Lark_Chat_TopicMessageShareFailedTip)), false);
                }
            }
        });
        aVar.mo140599a(-1, (Intent) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m151780a(int i, final Message message, String str, List list, final Bundle bundle, final AbstractC38405a.AbstractC38406a aVar) {
        if (i == 3) {
            C38364a.m151054a().mo140440b();
        }
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ForwardTarget forwardTarget = (ForwardTarget) it.next();
            if (forwardTarget.mo140565a() != 2) {
                arrayList.add(forwardTarget.mo140567b());
            } else if (forwardTarget.mo140573g() != null) {
                arrayList2.add(new Transmit2ThreadTarget(forwardTarget.mo140567b(), forwardTarget.mo140573g().getChatId()));
            }
        }
        C38364a.m151054a().mo140442d().mo140486a(arrayList, message.getId(), arrayList2, str, new IGetDataCallback<TransmitResponse>() {
            /* class com.ss.android.lark.forward.template.MessageForwardTemplateFactory.C384771 */

            /* renamed from: a */
            public void onSuccess(TransmitResponse transmitResponse) {
                if (message.getType() == Message.Type.SHARE_CALENDAR_EVENT) {
                    C38364a.m151054a().mo140446h().mo140460a();
                }
                m151784a(arrayList, transmitResponse);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (!TemplateFactoryUtils.m151923a(errorResult)) {
                    aVar.mo140601a(errorResult.getDisplayMsg(), false);
                }
            }

            /* renamed from: a */
            private void m151784a(List<String> list, TransmitResponse transmitResponse) {
                String string = bundle.getString("key_param_addition_note");
                if (!TextUtils.isEmpty(string) && transmitResponse != null) {
                    for (String str : list) {
                        if (!TextUtils.isEmpty(str)) {
                            C38364a.m151054a().mo140442d().mo140483a(str, string, transmitResponse.message_ids, (IGetDataCallback<String>) null);
                        }
                    }
                    if (CollectionUtils.isNotEmpty(transmitResponse.message2threads)) {
                        for (Transmit2ThreadTarget transmit2ThreadTarget : transmitResponse.message2threads.values()) {
                            C38364a.m151054a().mo140442d().mo140480a(string, transmit2ThreadTarget.channel_id, transmit2ThreadTarget.thread_id);
                        }
                    }
                }
            }
        });
        aVar.mo140599a(-1, (Intent) null);
    }

    /* renamed from: a */
    public static ForwardTemplate m151775a(Context context, Message message, int i, IForwardSelectListener iForwardSelectListener, ForwardCallType forwardCallType, ForwardLocation forwardLocation, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        ForwardTemplate.C38388a aVar = new ForwardTemplate.C38388a();
        String str2 = null;
        if (message == null || m151783b(context, message)) {
            return null;
        }
        ForwardFeature.C38394a aVar2 = new ForwardFeature.C38394a();
        boolean z4 = false;
        if (message.getType() != Message.Type.SHARE_CALENDAR_EVENT) {
            z = true;
        } else {
            z = false;
        }
        ForwardFeature.C38394a a = aVar2.mo140775a(z);
        if (i != 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        aVar.mo140610a(a.mo140780e(z2).mo140774a(iForwardSelectListener).mo140777b());
        if (i == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i != 0) {
            z4 = true;
        }
        aVar.mo140613a(C38508c.m151889a(context, message, z3, z4));
        if (i == 1) {
            str2 = UIHelper.getString(R.string.Lark_Chat_TopicToolShareTo);
        }
        ForwardHitPoint.Builder aVar3 = new ForwardHitPoint.Builder();
        if (i == 2) {
            aVar3.mo140796a("in_file_page");
        }
        aVar3.mo140797a(new ArrayList(Collections.singleton(message.getId())));
        aVar3.mo140794a(forwardCallType);
        aVar3.mo140795a(forwardLocation);
        aVar.mo140611a(aVar3.mo140798a());
        aVar.mo140615a(new ForwardViewDependency.C38404a().mo140898c(str2).mo140891a(C38506b.m151886a(context, message)).mo140892a(new MessageForwardEnhancedView()).mo140897b());
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_message", message);
        aVar.mo140609a(bundle);
        if (i == 4) {
            return aVar.mo140617a(m151779a((ImageContent) message.getContent()));
        }
        if (i == 1) {
            return aVar.mo140617a(m151777a(context, message));
        }
        return aVar.mo140617a(m151778a(message, i, str));
    }
}
