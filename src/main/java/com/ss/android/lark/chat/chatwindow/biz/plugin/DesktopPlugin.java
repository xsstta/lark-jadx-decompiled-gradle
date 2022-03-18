package com.ss.android.lark.chat.chatwindow.biz.plugin;

import android.app.Dialog;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.layout.ILKUILayout;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardHideJudge;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.data.p1620a.C33224n;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.service.impl.C34278w;
import com.ss.android.lark.chat.utils.FileSendUtils;
import com.ss.android.lark.chatbase.keyboard.FaceKBPluginDependency;
import com.ss.android.lark.chatbase.p1687a.C34416c;
import com.ss.android.lark.chatbase.vote.statistics.VoteHitPoint;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36506t;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.p1788b.p1790b.AbstractC36536a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.C40964l;
import com.ss.android.lark.keyboard.plugin.tool.face.DesktopFaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency;
import com.ss.android.lark.keyboard.plugin.tool.more.PlusKBDesktopPlugin;
import com.ss.android.lark.keyboard.plugin.tool.more.file.FilePlusItem;
import com.ss.android.lark.keyboard.plugin.tool.more.file.IFileDependency;
import com.ss.android.lark.keyboard.plugin.tool.more.vote.IVoteDependency;
import com.ss.android.lark.keyboard.plugin.tool.more.vote.VotePlusItem;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.keyboard.plugin.tool.preview.FilePreviewDialog;
import com.ss.android.lark.keyboard.plugin.tool.preview.FilePreviewDialogCallback;
import com.ss.android.lark.keyboard.plugin.tool.preview.IScreenShotDependency;
import com.ss.android.lark.keyboard.plugin.tool.preview.IScreenshotCallBack;
import com.ss.android.lark.keyboard.plugin.tool.preview.ScreenShotDesktopPlugin;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.drive.ChatDriveHitPoint;
import com.ss.android.lark.ui.lkuiplus.DragDropLKUIPlus;
import com.ss.android.lark.utils.ao;
import com.ss.android.lark.widget.drag.DragDropController;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\"\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001e\u0010\u001c\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0018\u0010$\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020\u000eH\u0016J\u001e\u0010&\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010'\u001a\u00020\u000eH\u0002J\u001e\u0010(\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010)\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/plugin/DesktopPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "()V", "keyboardComponent", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent;", "mChatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "mKeyEventHandler", "Lcom/ss/android/lark/desktopmode/frame/dispatcher/IKeyEventHandler;", "messageListComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent;", "messageSender", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/IMessageSender;", "attachDragDrop", "", "layout", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "keyboard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "getFacePlugin", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "chatApp", "getMorePlugin", "chatChatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "getScreenshotPlugin", "handleDropFiles", "filePaths", "", "", "isKeyboardHide", "", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "onCreate", "onDestroy", "onSendMultiFile", "registerKeyEventHandler", "showFilePreviewDialog", "unregisterKeyEventHandler", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.a */
public final class DesktopPlugin extends BaseChatPlugin {

    /* renamed from: e */
    public static final Companion f85087e = new Companion(null);

    /* renamed from: a */
    public IKeyboardComponent f85088a;

    /* renamed from: b */
    public IMessageListComponent f85089b;

    /* renamed from: c */
    public IMessageSender f85090c;

    /* renamed from: d */
    public IChatWindowApp f85091d;

    /* renamed from: f */
    private AbstractC36536a f85092f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/plugin/DesktopPlugin$Companion;", "", "()V", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/plugin/DesktopPlugin$onCreate$1", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "onKeyboardReady", "", "keyboard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.a$g */
    public static final class C33049g implements IKeyboardComponent.IKeyboardComponentCallbacks {

        /* renamed from: a */
        final /* synthetic */ DesktopPlugin f85105a;

        /* renamed from: b */
        final /* synthetic */ C35219b f85106b;

        /* renamed from: c */
        final /* synthetic */ IChatWindowApp f85107c;

        /* renamed from: d */
        final /* synthetic */ boolean f85108d;

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: a */
        public void mo122065a() {
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127734a(this);
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: b */
        public void mo122067b() {
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127736b(this);
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: a */
        public void mo122066a(KeyBoard fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "keyboard");
            IKeyboardComponent a = DesktopPlugin.m127785a(this.f85105a);
            DesktopPlugin aVar = this.f85105a;
            Chat chat = this.f85106b.f90956f;
            Intrinsics.checkExpressionValueIsNotNull(chat, "initData.chat");
            a.mo121978a("face", aVar.mo122110a(chat, this.f85107c, fVar));
            if (this.f85108d) {
                IKeyboardComponent a2 = DesktopPlugin.m127785a(this.f85105a);
                DesktopPlugin aVar2 = this.f85105a;
                Chat chat2 = this.f85106b.f90956f;
                Intrinsics.checkExpressionValueIsNotNull(chat2, "initData.chat");
                a2.mo121978a("screenshot", aVar2.mo122112a(chat2, fVar));
            }
            IKeyboardComponent a3 = DesktopPlugin.m127785a(this.f85105a);
            DesktopPlugin aVar3 = this.f85105a;
            Chat chat3 = this.f85106b.f90956f;
            Intrinsics.checkExpressionValueIsNotNull(chat3, "initData.chat");
            a3.mo121978a("plus", aVar3.mo122111a(chat3, this.f85106b.f90957g, this.f85107c));
            if (!this.f85105a.mo122116a(this.f85106b)) {
                DesktopPlugin aVar4 = this.f85105a;
                ILKUILayout k = DesktopPlugin.m127786b(aVar4).mo123140k();
                Chat chat4 = this.f85106b.f90956f;
                Intrinsics.checkExpressionValueIsNotNull(chat4, "initData.chat");
                aVar4.mo122113a(k, chat4, fVar);
            }
        }

        C33049g(DesktopPlugin aVar, C35219b bVar, IChatWindowApp dVar, boolean z) {
            this.f85105a = aVar;
            this.f85106b = bVar;
            this.f85107c = dVar;
            this.f85108d = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/plugin/DesktopPlugin$getMorePlugin$2", "Lcom/ss/android/lark/keyboard/plugin/tool/more/vote/IVoteDependency;", "getContext", "Landroid/content/Context;", "startVote", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.a$e */
    public static final class C33046e implements IVoteDependency {

        /* renamed from: a */
        final /* synthetic */ IChatWindowApp f85100a;

        /* renamed from: b */
        final /* synthetic */ Chat f85101b;

        /* renamed from: a */
        public Context mo122120a() {
            return this.f85100a.mo123135f();
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.more.vote.IVoteDependency
        /* renamed from: b */
        public void mo122121b() {
            VoteHitPoint.f88921a.mo127149a();
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134588p().mo134748a(mo122120a(), this.f85101b.getId());
        }

        C33046e(IChatWindowApp dVar, Chat chat) {
            this.f85100a = dVar;
            this.f85101b = chat;
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    public void as_() {
        super.as_();
        m127789c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/plugin/DesktopPlugin$getFacePlugin$1", "Lcom/ss/android/lark/keyboard/plugin/tool/face/FacePluginDependency;", "getBaseFragment", "Landroidx/fragment/app/Fragment;", "onSendStickerMsg", "", "stickerFileInfo", "Lcom/ss/android/lark/keyboard/plugin/tool/face/StickerFileInfo;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.a$c */
    public static final class C33044c implements FacePluginDependency {

        /* renamed from: a */
        final /* synthetic */ IChatWindowApp f85095a;

        /* renamed from: b */
        final /* synthetic */ KeyBoard f85096b;

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency
        /* renamed from: a */
        public Fragment mo122020a() {
            Object o = this.f85095a.mo123193o();
            if (o != null) {
                return (Fragment) o;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency
        /* renamed from: a */
        public void mo122021a(C40964l lVar) {
            IMessageSender g = this.f85095a.mo123136g();
            IStickerDependency.StickerFileInfo a = C33224n.m128431a(lVar);
            Intrinsics.checkExpressionValueIsNotNull(a, "StickerFileInfoConverter.convert(stickerFileInfo)");
            g.mo123010a(a, this.f85096b.mo146836q(), this.f85096b.mo146837r());
        }

        C33044c(IChatWindowApp dVar, KeyBoard fVar) {
            this.f85095a = dVar;
            this.f85096b = fVar;
        }
    }

    /* renamed from: b */
    private final void m127787b() {
        if (this.f85092f == null) {
            this.f85092f = new C33050h(this);
        }
        C36512a a = C36512a.m144041a();
        AbstractC36536a aVar = this.f85092f;
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        a.mo134765a(aVar);
    }

    /* renamed from: c */
    private final void m127789c() {
        AbstractC36536a aVar = this.f85092f;
        if (aVar != null) {
            C36512a.m144041a().mo134773b(aVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/plugin/DesktopPlugin$attachDragDrop$1", "Lcom/ss/android/lark/widget/drag/DragDropController$OnDragDropListener;", "onDrop", "", "filePaths", "", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.a$b */
    public static final class C33043b implements DragDropController.OnDragDropListener {

        /* renamed from: a */
        final /* synthetic */ DesktopPlugin f85093a;

        /* renamed from: b */
        final /* synthetic */ KeyBoard f85094b;

        @Override // com.ss.android.lark.widget.drag.DragDropController.OnDragDropListener
        /* renamed from: a */
        public void mo122119a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "filePaths");
            this.f85093a.mo122115a(list, this.f85094b);
        }

        C33043b(DesktopPlugin aVar, KeyBoard fVar) {
            this.f85093a = aVar;
            this.f85094b = fVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH\u0016¨\u0006\u0015"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/plugin/DesktopPlugin$getMorePlugin$1", "Lcom/ss/android/lark/keyboard/plugin/tool/more/file/IFileDependency;", "getContext", "Landroid/content/Context;", "launchFileChooser", "", "requestCode", "", "parseFileChooseResult", "Lcom/ss/android/lark/keyboard/plugin/tool/more/file/IFileDependency$FileChooseResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "sendFile", "files", "", "Ljava/io/File;", "sendFileByUri", "uri", "Landroid/net/Uri;", "sendNutFile", "Lcom/ss/android/lark/keyboard/plugin/tool/more/file/IFileDependency$NutFileInfo;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.a$d */
    public static final class C33045d implements IFileDependency {

        /* renamed from: a */
        final /* synthetic */ DesktopPlugin f85097a;

        /* renamed from: b */
        final /* synthetic */ IChatWindowApp f85098b;

        /* renamed from: c */
        final /* synthetic */ C36516a f85099c;

        @Override // com.ss.android.lark.keyboard.plugin.tool.more.file.IFileDependency
        /* renamed from: a */
        public void mo122026a(Uri uri) {
            Intrinsics.checkParameterIsNotNull(uri, "uri");
            DesktopPlugin.m127791d(this.f85097a).mo123006a(uri);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.more.file.IFileDependency
        /* renamed from: a */
        public void mo122027a(List<? extends File> list) {
            Intrinsics.checkParameterIsNotNull(list, "files");
            DesktopPlugin.m127791d(this.f85097a).mo123013a(list);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.more.file.IFileDependency
        /* renamed from: a */
        public IFileDependency.FileChooseResult mo122024a(Intent intent) {
            Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36506t I = b.mo134510I();
            Intrinsics.checkExpressionValueIsNotNull(I, "ChatModuleInstanceHolder…cy().filePickerDependency");
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra(I.mo134708a());
            ClipData clipData = intent.getClipData();
            if (clipData == null) {
                return new IFileDependency.FileChooseResult(stringArrayListExtra, null, 2, null);
            }
            Intrinsics.checkExpressionValueIsNotNull(clipData, "data.clipData ?: return …leChooseResult(filePaths)");
            return new IFileDependency.FileChooseResult(stringArrayListExtra, IFileDependency.FileChooseResult.f104173a.mo147650a(clipData));
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.more.file.IFileDependency
        /* renamed from: a */
        public void mo122025a(int i) {
            FragmentActivity activity = this.f85099c.getActivity();
            if (activity != null) {
                String a = FileSendUtils.f88686a.mo126927a(5368709120L);
                String b = FileSendUtils.f88686a.mo126928b(5368709120L);
                AbstractC36474h b2 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
                b2.mo134510I().mo134709a(activity, this.f85099c, i, 5368709120L, 5368709120L, a, b, true);
                if (i == 2185) {
                    ChatDriveHitPoint.m213217a();
                }
            }
        }

        C33045d(DesktopPlugin aVar, IChatWindowApp dVar, C36516a aVar2) {
            this.f85097a = aVar;
            this.f85098b = dVar;
            this.f85099c = aVar2;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/KeyEvent;", "kotlin.jvm.PlatformType", "dispatchKeyEvent"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.a$h */
    public static final class C33050h implements AbstractC36536a {

        /* renamed from: a */
        final /* synthetic */ DesktopPlugin f85109a;

        C33050h(DesktopPlugin aVar) {
            this.f85109a = aVar;
        }

        @Override // com.ss.android.lark.desktopmode.p1788b.p1790b.AbstractC36536a
        /* renamed from: a */
        public final boolean mo122126a(KeyEvent keyEvent) {
            return DesktopPlugin.m127786b(this.f85109a).mo123139j();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/plugin/DesktopPlugin$showFilePreviewDialog$dialog$1", "Lcom/ss/android/lark/keyboard/plugin/tool/preview/FilePreviewDialogCallback;", "onNegativeClick", "", "dialog", "Landroid/app/Dialog;", "onPositiveClick", "filePaths", "", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.a$i */
    public static final class C33051i implements FilePreviewDialogCallback {

        /* renamed from: a */
        final /* synthetic */ DesktopPlugin f85110a;

        /* renamed from: b */
        final /* synthetic */ KeyBoard f85111b;

        @Override // com.ss.android.lark.keyboard.plugin.tool.preview.FilePreviewDialogCallback
        /* renamed from: a */
        public boolean mo122058a(Dialog dialog) {
            Intrinsics.checkParameterIsNotNull(dialog, "dialog");
            dialog.dismiss();
            return true;
        }

        C33051i(DesktopPlugin aVar, KeyBoard fVar) {
            this.f85110a = aVar;
            this.f85111b = fVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.preview.FilePreviewDialogCallback
        /* renamed from: a */
        public boolean mo122059a(Dialog dialog, List<String> list) {
            Intrinsics.checkParameterIsNotNull(dialog, "dialog");
            Intrinsics.checkParameterIsNotNull(list, "filePaths");
            this.f85110a.mo122118b(list, this.f85111b);
            dialog.dismiss();
            return true;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IKeyboardComponent m127785a(DesktopPlugin aVar) {
        IKeyboardComponent cVar = aVar.f85088a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyboardComponent");
        }
        return cVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ IChatWindowApp m127786b(DesktopPlugin aVar) {
        IChatWindowApp dVar = aVar.f85091d;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatApp");
        }
        return dVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ IMessageListComponent m127788c(DesktopPlugin aVar) {
        IMessageListComponent iMessageListComponent = aVar.f85089b;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        return iMessageListComponent;
    }

    /* renamed from: d */
    public static final /* synthetic */ IMessageSender m127791d(DesktopPlugin aVar) {
        IMessageSender aVar2 = aVar.f85090c;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageSender");
        }
        return aVar2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0010"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/plugin/DesktopPlugin$getScreenshotPlugin$1", "Lcom/ss/android/lark/keyboard/plugin/tool/preview/IScreenShotDependency;", "requestScreenshot", "", "callBack", "Lcom/ss/android/lark/keyboard/plugin/tool/preview/IScreenshotCallBack;", "sendImage", "", "paths", "", "", "uploadEncryptImage", "Lio/reactivex/Observable;", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "progressListener", "Lcom/larksuite/framework/callback/OnUpdateProgressListener;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.a$f */
    public static final class C33047f implements IScreenShotDependency {

        /* renamed from: a */
        final /* synthetic */ DesktopPlugin f85102a;

        /* renamed from: b */
        final /* synthetic */ KeyBoard f85103b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "image", "Lcom/ss/android/lark/image/entity/Image;", "apply"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.a$f$a */
        static final class C33048a<T, R> implements Function<T, R> {

            /* renamed from: a */
            public static final C33048a f85104a = new C33048a();

            C33048a() {
            }

            /* renamed from: a */
            public final IPhotoDependency.Image apply(Image image) {
                Intrinsics.checkParameterIsNotNull(image, "image");
                List<String> urls = image.getUrls();
                Intrinsics.checkExpressionValueIsNotNull(urls, "image.urls");
                int width = image.getWidth();
                int height = image.getHeight();
                String token = image.getToken();
                Intrinsics.checkExpressionValueIsNotNull(token, "image.token");
                return new IPhotoDependency.Image(urls, width, height, token);
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.preview.IScreenShotDependency
        /* renamed from: a */
        public void mo122123a(IScreenshotCallBack eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "callBack");
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.ag().mo134622a(eVar);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.preview.IScreenShotDependency
        /* renamed from: a */
        public boolean mo122124a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "paths");
            DesktopPlugin.m127791d(this.f85102a).mo123015a(list, true, this.f85103b.mo146836q(), this.f85103b.mo146837r());
            return true;
        }

        C33047f(DesktopPlugin aVar, KeyBoard fVar) {
            this.f85102a = aVar;
            this.f85103b = fVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.preview.IScreenShotDependency
        /* renamed from: a */
        public Observable<IPhotoDependency.Image> mo122122a(List<String> list, AbstractC25974h hVar) {
            Intrinsics.checkParameterIsNotNull(list, "paths");
            Observable<R> map = C34278w.m132953a().mo126827a(list, false, hVar, (Biz) null, (Scene) null).map(C33048a.f85104a);
            Intrinsics.checkExpressionValueIsNotNull(map, "PostService.inst()\n     …ge.height, image.token) }");
            return map;
        }
    }

    /* renamed from: a */
    public final boolean mo122116a(C35219b bVar) {
        IKeyboardComponent cVar = this.f85088a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyboardComponent");
        }
        if (cVar.mo121992j() || KeyboardHideJudge.f85065a.mo122099a(bVar.f90956f, bVar.f90957g, bVar.f90960j)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final void m127790c(List<String> list, KeyBoard fVar) {
        Log.m165389i("DesktopPlugin", "Attempting to create RecyclerView with the files" + list);
        IChatWindowApp dVar = this.f85091d;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatApp");
        }
        new FilePreviewDialog(dVar.mo123135f(), list, new C33051i(this, fVar)).show();
    }

    /* renamed from: a */
    public final IKeyBoardPlugin mo122112a(Chat chat, KeyBoard fVar) {
        return new ScreenShotDesktopPlugin(chat.isSecret(), true, new C33047f(this, fVar));
    }

    /* renamed from: b */
    public final void mo122118b(List<String> list, KeyBoard fVar) {
        String q = fVar.mo146836q();
        String r = fVar.mo146837r();
        for (String str : list) {
            String c = C26311p.m95283c(str);
            Intrinsics.checkExpressionValueIsNotNull(c, "fileType");
            String str2 = c;
            if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "image/", false, 2, (Object) null) || StringsKt.endsWith$default(str, ".0", false, 2, (Object) null)) {
                IMessageSender aVar = this.f85090c;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("messageSender");
                }
                aVar.mo123015a(CollectionsKt.listOf(str), true, q, r);
            } else if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "video/", false, 2, (Object) null)) {
                File file = new File(str);
                Photo photo = new Photo();
                photo.setPath(file.getPath());
                photo.setMimeType(c);
                photo.setSize(C26311p.m95281c(file));
                photo.setDuration(0);
                IChatWindowApp dVar = this.f85091d;
                if (dVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChatApp");
                }
                photo.setCompressPath(ao.m224300a(dVar.mo123135f(), file.getPath(), false));
                IMessageSender aVar2 = this.f85090c;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("messageSender");
                }
                aVar2.mo123014a(CollectionsKt.listOf(photo), q, r);
            } else {
                IMessageSender aVar3 = this.f85090c;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("messageSender");
                }
                aVar3.mo123013a(CollectionsKt.listOf(new File(str)));
            }
        }
        fVar.mo146841v();
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        super.mo122114a(dVar, bVar);
        this.f85091d = dVar;
        this.f85090c = dVar.mo123136g();
        this.f85088a = (IKeyboardComponent) dVar.mo123122a(IKeyboardComponent.class);
        this.f85089b = (IMessageListComponent) dVar.mo123122a(IMessageListComponent.class);
        if (DesktopUtil.m144301a(dVar.mo123135f())) {
            if (bVar.f90956f.isSecret() || !RomUtils.m94953h()) {
                z = false;
            } else {
                z = true;
            }
            IKeyboardComponent cVar = this.f85088a;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("keyboardComponent");
            }
            cVar.mo121971a(new C33049g(this, bVar, dVar, z));
            IMessageListComponent iMessageListComponent = this.f85089b;
            if (iMessageListComponent == null) {
                Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
            }
            iMessageListComponent.getLifecycle().addObserver(new DesktopPlugin$onCreate$2(this));
            m127787b();
        }
    }

    /* renamed from: a */
    public final void mo122115a(List<String> list, KeyBoard fVar) {
        if (!CollectionUtils.isEmpty(list)) {
            if (DragDropController.f143463a.mo197513a()) {
                mo122118b(list, fVar);
            } else {
                m127790c(list, fVar);
            }
        }
    }

    /* renamed from: a */
    public final IKeyBoardPlugin mo122110a(Chat chat, IChatWindowApp dVar, KeyBoard fVar) {
        return new DesktopFaceKBPlugin(!chat.isSecret(), chat.isSecret(), new FaceKBPluginDependency(new C33044c(dVar, fVar)), true);
    }

    /* renamed from: a */
    public final IKeyBoardPlugin mo122111a(Chat chat, ChatChatter chatChatter, IChatWindowApp dVar) {
        PlusKBDesktopPlugin cVar = new PlusKBDesktopPlugin(chat.isSecret(), false, 2, null);
        Object o = dVar.mo123193o();
        if (o != null) {
            C36516a<?> aVar = (C36516a) o;
            cVar.mo147651a(aVar);
            cVar.mo147652b(new FilePlusItem(new C33045d(this, dVar, aVar)));
            if (!chat.isCrossWithKa() && !chat.isP2PChat() && !chat.isCustomerService() && !chat.isSecret()) {
                cVar.mo147652b(new VotePlusItem(new C33046e(dVar, chat)));
            }
            AbstractC36474h b = C29990c.m110930b();
            if (b != null) {
                b.mo134537a(dVar.mo123135f(), chat, chatChatter, new C34416c(cVar));
            }
            return cVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.desktopmode.app.DesktopCompatFragment<*>");
    }

    /* renamed from: a */
    public final void mo122113a(ILKUILayout iLKUILayout, Chat chat, KeyBoard fVar) {
        if (DragDropController.f143463a.mo197516b()) {
            ((DragDropLKUIPlus) iLKUILayout.registerPlus(DragDropLKUIPlus.class)).setCurrentChatName(chat.getName()).setOnDragDropListener(new C33043b(this, fVar));
        }
    }
}
