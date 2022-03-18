package com.ss.android.lark.chat.chatwindow.chat.v2.component.message;

import android.content.Intent;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.ShareGroupChatContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.dependency.AbstractC36461ah;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36495k;
import com.ss.android.lark.dependency.AbstractC36497m;
import com.ss.android.lark.ding.entity.DingStatus;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListResultHandler;", "", "mHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListResultHandler$IMessageListResultHandler;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListResultHandler$IMessageListResultHandler;)V", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "Companion", "IMessageListResultHandler", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.f */
public final class MessageListResultHandler {

    /* renamed from: b */
    public static final Companion f86580b = new Companion(null);

    /* renamed from: a */
    public IMessageListResultHandler f86581a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J<\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH&J\b\u0010\u000f\u001a\u00020\u0003H&J$\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H&¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListResultHandler$IMessageListResultHandler;", "", "gotoP2PBuildGroupSelectChatter", "", "initBuildGroupState", "requestCode", "", "selectEntities", "", "Lcom/ss/android/lark/chat/entity/chat/PickChatEntity;", "showDepartmentId", "", "contacts", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/contact/entity/Contact;", "onMergeForwardSuccess", "updateMsg", "key", "Lcom/ss/android/lark/chatbase/BasePageStore$ItemTwoKey;", "updater", "Lcom/ss/android/lark/chatbase/model/PageStore$IItemPatch;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.f$b */
    public interface IMessageListResultHandler {
        /* renamed from: E */
        void mo123337E();

        /* renamed from: F */
        void mo123338F();

        /* renamed from: a */
        void mo123342a(int i, List<? extends PickChatEntity> list, String str, ArrayList<Contact> arrayList);

        /* renamed from: a */
        void mo123314a(AbstractC34417b.AbstractC34421c<String> cVar, AbstractC34432b.AbstractC34434b<AbstractC34006a> bVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListResultHandler$Companion;", "", "()V", "KEY_DEPARTMENT_ID", "", "TAG", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.f$d */
    public static final class RunnableC33600d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MessageListResultHandler f86583a;

        /* renamed from: b */
        final /* synthetic */ int f86584b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f86585c;

        /* renamed from: d */
        final /* synthetic */ String f86586d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f86587e;

        RunnableC33600d(MessageListResultHandler fVar, int i, ArrayList arrayList, String str, ArrayList arrayList2) {
            this.f86583a = fVar;
            this.f86584b = i;
            this.f86585c = arrayList;
            this.f86586d = str;
            this.f86587e = arrayList2;
        }

        public final void run() {
            this.f86583a.f86581a.mo123342a(this.f86584b, this.f86585c, this.f86586d, this.f86587e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¨\u0006\u0005"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListResultHandler$onActivityResult$1", "Lcom/ss/android/lark/chatbase/model/PageStore$OnlyExistItemPatcher;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "doUpdateIfExist", "existedItem", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.f$c */
    public static final class C33599c extends AbstractC34432b.AbstractC34435c<AbstractC34006a> {

        /* renamed from: a */
        final /* synthetic */ DingStatus f86582a;

        C33599c(DingStatus dingStatus) {
            this.f86582a = dingStatus;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public AbstractC34006a mo122917a(AbstractC34006a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "existedItem");
            Message message = aVar.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "existedItem.getMessage()");
            message.setDing(true);
            ((MessageInfo) aVar).setDingStatus(this.f86582a);
            return aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¨\u0006\u0005"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListResultHandler$onActivityResult$3", "Lcom/ss/android/lark/chatbase/model/PageStore$OnlyExistItemPatcher;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "doUpdateIfExist", "existedItem", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.f$e */
    public static final class C33601e extends AbstractC34432b.AbstractC34435c<AbstractC34006a> {

        /* renamed from: a */
        final /* synthetic */ ShareGroupChatContent.GroupState f86588a;

        C33601e(ShareGroupChatContent.GroupState groupState) {
            this.f86588a = groupState;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public AbstractC34006a mo122917a(AbstractC34006a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "existedItem");
            Message message = aVar.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "existedItem.getMessage()");
            if (message.getType() == Message.Type.SHARE_GROUP_CHAT) {
                Content content = aVar.getMessage().getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "existedItem.getMessage()…<ShareGroupChatContent>()");
                ((ShareGroupChatContent) content).setJoinChatErrState(this.f86588a);
            }
            return aVar;
        }
    }

    public MessageListResultHandler(IMessageListResultHandler bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "mHandler");
        this.f86581a = bVar;
    }

    /* renamed from: a */
    public final void mo123417a(int i, int i2, Intent intent) {
        boolean z;
        if (i2 == -1 && intent != null) {
            if (i != 18) {
                if (i != 19) {
                    switch (i) {
                        case 6:
                            AbstractC36474h b = C29990c.m110930b();
                            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                            AbstractC36497m J = b.mo134511J();
                            Intrinsics.checkExpressionValueIsNotNull(J, "dingDependency");
                            Serializable serializableExtra = intent.getSerializableExtra(J.mo134662a());
                            if (serializableExtra != null) {
                                Message message = (Message) serializableExtra;
                                if (message == null || !message.isFromMe()) {
                                    Log.m165383e("MessageResultHandler", "Ding msg failed");
                                    return;
                                }
                                Serializable serializableExtra2 = intent.getSerializableExtra(J.mo134665b());
                                if (serializableExtra2 != null) {
                                    this.f86581a.mo123314a(new AbstractC34417b.C34425g(message.getId()), new C33599c((DingStatus) serializableExtra2));
                                    return;
                                }
                                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.ding.entity.DingStatus");
                            }
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.message.Message");
                        case 7:
                            break;
                        case 8:
                            this.f86581a.mo123338F();
                            return;
                        case 9:
                            this.f86581a.mo123337E();
                            return;
                        default:
                            return;
                    }
                }
                AbstractC36474h b2 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
                AbstractC36495k M = b2.mo134514M();
                Intrinsics.checkExpressionValueIsNotNull(M, "ChatModuleInstanceHolder…y().createGroupDependency");
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(M.mo134657a());
                String stringExtra = intent.getStringExtra("department_id");
                AbstractC36474h b3 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
                AbstractC36495k M2 = b3.mo134514M();
                Intrinsics.checkExpressionValueIsNotNull(M2, "ChatModuleInstanceHolder…y().createGroupDependency");
                UICallbackExecutor.executeDelayed(new RunnableC33600d(this, i, parcelableArrayListExtra, stringExtra, intent.getParcelableArrayListExtra(M2.mo134660b())), 50);
                return;
            }
            AbstractC36474h b4 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b4, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36461ah V = b4.mo134523V();
            Intrinsics.checkExpressionValueIsNotNull(V, "profileDependency");
            String stringExtra2 = intent.getStringExtra(V.mo134433a());
            ShareGroupChatContent.GroupState groupState = (ShareGroupChatContent.GroupState) intent.getSerializableExtra(V.mo134440b());
            String str = stringExtra2;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || groupState == null) {
                Log.m165383e("MessageResultHandler", "Group msg failed");
            } else {
                this.f86581a.mo123314a(new AbstractC34417b.C34425g(stringExtra2), new C33601e(groupState));
            }
        }
    }
}
