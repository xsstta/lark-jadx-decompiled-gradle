package com.ss.android.lark.chat.chatwindow.chat.v2.component.message;

import android.view.View;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33296f;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33307q;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33120i;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33128q;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.dto.group.GroupRecallEntity;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.widget.photo_picker.animation.activity_transition.ActivityTransitionLauncher;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.richtext.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0016J,\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\u001c\u0010\u001c\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001c\u0010\u001f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J8\u0010 \u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\"2\u0014\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0019\u0018\u00010\tH\u0016J8\u0010$\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00192\u0014\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u0019\u0018\u00010\tH\u0016J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0012\u0010(\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0012\u0010*\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0010H\u0016J\u0012\u0010/\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u00100\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u00101\u001a\u000202H\u0016J\u0012\u00103\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020\u00070\u00192\u0006\u00105\u001a\u000202H\u0016J>\u00106\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010\u00172\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010-2\u0006\u0010;\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u00102\u0006\u0010=\u001a\u000202H\u0016J\u0012\u0010>\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010?\u001a\u00020\u0005H\u0016J\u0012\u0010@\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010A\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010B\u001a\u00020\u00052\u0006\u0010C\u001a\u000202H\u0016J\u0012\u0010D\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010E\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010F\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u0010H\u0016J\u0010\u0010H\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J$\u0010I\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010\u00172\b\u0010:\u001a\u0004\u0018\u00010-2\u0006\u0010;\u001a\u00020\u0010H\u0016J\u001c\u0010J\u001a\u00020\u00052\b\u0010K\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010L\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010M\u001a\u0004\u0018\u00010\u00072\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\u001e\u0010P\u001a\u00020\u00052\u0014\u0010Q\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030S\u0018\u00010RH\u0016J\"\u0010T\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\"H\u0016J\"\u0010U\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010V\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u0019H\u0016J\u0010\u0010W\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0018\u0010X\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010C\u001a\u000202H\u0016J\u0012\u0010Y\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010Z\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0010\u0010[\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0012\u0010\\\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016J<\u0010]\u001a\u00020\u00052\u0006\u0010^\u001a\u0002022\u000e\u0010_\u001a\n\u0012\u0004\u0012\u00020a\u0018\u00010`2\b\u0010b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010c\u001a\n\u0012\u0004\u0012\u00020d\u0018\u00010\"H\u0016J\u0010\u0010e\u001a\u00020\u00052\u0006\u0010f\u001a\u00020\u0010H\u0016J\u0012\u0010g\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010h\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0018\u0010i\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010j\u001a\u000202H\u0016J\u001a\u0010k\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010l\u001a\u00020\u0010H\u0016JD\u0010m\u001a\u00020\u0005\"\u0016\b\u0000\u0010n*\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030S\u0018\u00010R2\u0006\u00107\u001a\u00020\u00172\u0006\u0010o\u001a\u00020p2\u0012\u0010q\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030S0RH\u0016J\b\u0010r\u001a\u00020\u0005H\u0016J\"\u0010s\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u00172\u0010\u0010t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030v0uH\u0016J.\u0010w\u001a\u00020\u00052\u0006\u0010x\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010M\u001a\u0004\u0018\u00010\u00072\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\u001a\u0010y\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010j\u001a\u000202H\u0016J\u001c\u0010z\u001a\u00020\u00052\b\u0010{\u001a\u0004\u0018\u00010\u00072\b\u0010M\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006|"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageCallbackHandler;", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/handler/IMenuHandlerHub;", "Lcom/ss/android/lark/chat/chatwindow/chat/message/callbacks/MessageCallbackHub;", "()V", "getChatChatter", "", "chatId", "", "dataCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/dto/chat/ChatChatterResponse;", "onActionHandleAsyncStart", "msgId", "onAddSticker", "messageId", "onAvatarLongClick", "", "chatterVO", "Lcom/ss/android/lark/chat/vo/ChatChatterVO;", "onCancelUploadClick", "messageCid", "onCardImageClick", "imageView", "Landroid/view/View;", "cardImags", "", "Lcom/ss/android/lark/widget/richtext/Image;", "clickedImageItem", "onCellEndBind", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "onCellStartBind", "onCheckChatterInChat", "chatterIds", "Ljava/util/ArrayList;", "callback", "onCheckMembersInChat", "entities", "Lcom/ss/android/lark/dto/group/GroupRecallEntity;", "onClosePreview", "onContinueUploadClick", "onDingMessage", "onDownloadFileBtnClick", "onEditClicked", "selectPhotoItem", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "isTranslated", "onFileClick", "onFolderClick", "topicTabType", "", "onForward", "onGetAudioMessageCids", "startPosition", "onImageClick", "itemView", "locationInfo", "Lcom/ss/android/lark/widget/photo_picker/animation/activity_transition/ActivityTransitionLauncher$LocationInfo;", "photoItem", "isMutePlay", "isClickTranslated", "fromType", "onInvalidGroupShare", "onMergeForwardSuccess", "onMessageBurned", "onMessageRead", "onMultiSelect", "adapterPosition", "onOnlineReviewFileClick", "onOpenLKPFileBtnClick", "onPinMessage", "isAdd", "onPlay", "onPreMediaClick", "onPrepareAudio", "audioKey", "onPreviewFileInDrive", "sourceId", "sourceType", "Lcom/ss/android/lark/chat/entity/message/Message$SourceType;", "onReEdit", "messageVO", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "onRecallChatters", "onRecallMembers", "entityList", "onReplyAreaClick", "onReplyMessage", "onRetrySendMessage", "onSaveFavorite", "onShowMoreClick", "onShowTranslatePreview", "onStartBuildGroup", "requestCode", "selectEntities", "", "Lcom/ss/android/lark/chat/entity/chat/PickChatEntity;", "departmentId", "contactsToApply", "Lcom/ss/android/lark/contact/entity/Contact;", "onStartPhoneCallSysClick", "recallOrCallBack", "onStopDownloadFileBtnClick", "onThreadMergeForwardClick", "onTodoClick", "position", "onToggleAudioTextClick", "shown", "onTranslate", "M", "hiveHolder", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveHolder;", "translatableMessageVO", "onTranslateSettingClick", "onTranslateShowOriginClick", "textMessageVO", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "Lcom/ss/android/lark/chat/base/view/vo/message/TranslatableContentVO;", "onUploadToDriveSpaceBtnClick", "fileKey", "onViewMessageInChat", "sendUserSignRequest", "description", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.c */
public abstract class MessageCallbackHandler implements AbstractC33120i, AbstractC33296f {
    /* renamed from: a */
    public void mo123415a() {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33121j
    /* renamed from: a */
    public void mo121935a(int i) {
    }

    /* renamed from: a */
    public void mo123416a(int i, List<? extends PickChatEntity> list, String str, ArrayList<Contact> arrayList) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33128q
    /* renamed from: a */
    public /* synthetic */ void mo122318a(View view, AbsMessageVO aVar) {
        AbstractC33128q.CC.$default$a(this, view, aVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33307q
    /* renamed from: a */
    public void mo122778a(View view, ChatMessageVO<TranslatableContentVO<?>> cVar) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(cVar, "textMessageVO");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33301k
    /* renamed from: a */
    public void mo122772a(View view, ActivityTransitionLauncher.LocationInfo locationInfo, PhotoItem photoItem, boolean z, boolean z2, int i) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33301k
    /* renamed from: a */
    public void mo122773a(View view, PhotoItem photoItem, boolean z) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33133v
    /* renamed from: a */
    public <M extends AbsMessageVO<? extends ContentVO<?>>> void mo122321a(View view, AbstractC59010e eVar, AbsMessageVO<? extends ContentVO<?>> aVar) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(eVar, "hiveHolder");
        Intrinsics.checkParameterIsNotNull(aVar, "translatableMessageVO");
    }

    @Override // com.ss.android.lark.chat.export.ui.p1671a.AbstractC34027a
    /* renamed from: a */
    public void mo122830a(View view, List<Image> list, Image image) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33295e
    /* renamed from: a */
    public void mo122761a(AbsMessageVO<? extends ContentVO<?>> aVar) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.IEditImageMenuHandler
    /* renamed from: a */
    public void mo121937a(PhotoItem photoItem, boolean z) {
        Intrinsics.checkParameterIsNotNull(photoItem, "selectPhotoItem");
    }

    @Override // com.ss.android.lark.chat.export.ui.p1671a.AbstractC34027a
    /* renamed from: a */
    public void mo122832a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msgId");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33126o
    /* renamed from: a */
    public void mo121938a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.text.C33377a.AbstractC33380a
    /* renamed from: a */
    public void mo122890a(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33298h
    /* renamed from: a */
    public void mo122763a(String str, Message.Type type) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.block.MessageUserInfoBlock.AbstractC33319a
    /* renamed from: a */
    public void mo122810a(String str, String str2) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: a */
    public void mo122765a(String str, String str2, Message.SourceType sourceType) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: a */
    public void mo122766a(String str, String str2, String str3, Message.SourceType sourceType) {
        Intrinsics.checkParameterIsNotNull(str, "fileKey");
    }

    @Override // com.ss.android.lark.chat.utils.C34365w.AbstractC34377a
    /* renamed from: a */
    public void mo123349a(String str, List<GroupRecallEntity> list) {
    }

    @Override // com.ss.android.lark.chat.utils.C34365w.AbstractC34377a
    /* renamed from: a */
    public void mo123350a(String str, List<GroupRecallEntity> list, IGetDataCallback<List<GroupRecallEntity>> iGetDataCallback) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33123l
    /* renamed from: a */
    public void mo121939a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33303m
    /* renamed from: a */
    public void mo122775a(boolean z) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33297g
    /* renamed from: a */
    public boolean mo122762a(C33973b bVar) {
        return false;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33116e
    /* renamed from: b */
    public void mo121940b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33130s
    /* renamed from: b */
    public void mo122319b(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33298h
    /* renamed from: b */
    public void mo122764b(String str, Message.Type type) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33293c
    /* renamed from: b */
    public void mo122759b(String str, String str2) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33132u
    /* renamed from: b */
    public void mo121941b(String str, boolean z) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33117f
    /* renamed from: c */
    public void mo121942c(String str) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.IViewInChatMenuHandler
    /* renamed from: c */
    public void mo123352c(String str, int i) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33124m
    /* renamed from: d */
    public void mo121943d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.view.message.callbacks.OnFolderClickListener
    /* renamed from: d */
    public void mo123355d(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33127p
    /* renamed from: e */
    public void mo121944e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33113b
    public void e_(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33306p, com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33129r
    /* renamed from: f */
    public void mo121946f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
    }

    @Override // com.ss.android.lark.chat.utils.C34365w.AbstractC34377a
    public void f_(String str) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.block.MessageStatusBlock.AbstractC33313a
    /* renamed from: g */
    public void mo122797g(String str) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.block.MessageStatusBlock.AbstractC33313a
    /* renamed from: h */
    public void mo122798h(String str) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33291a
    /* renamed from: i */
    public void mo122756i(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33294d
    /* renamed from: j */
    public void mo122760j(String str) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: k */
    public void mo122767k(String str) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: l */
    public void mo122768l(String str) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: m */
    public void mo122769m(String str) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: n */
    public void mo122770n(String str) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33300j
    /* renamed from: o */
    public void mo122771o(String str) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33302l
    /* renamed from: p */
    public void mo122774p(String str) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33305o
    /* renamed from: q */
    public void mo122776q(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33307q
    /* renamed from: r */
    public void mo122779r(String str) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33307q
    /* renamed from: s */
    public /* synthetic */ void mo122780s(String str) {
        AbstractC33307q.CC.$default$s(this, str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.view.message.callbacks.OnThreadMergeForwardClickListener
    /* renamed from: u */
    public void mo123362u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33293c
    /* renamed from: b */
    public List<String> mo122758b(int i) {
        return new ArrayList();
    }
}
