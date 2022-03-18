package com.ss.android.lark.chatthread.p1716c;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.contact.v2.PushContactApplicationBannerAffectEvent;
import com.bytedance.lark.pb.im.v1.PushImageTranslationInfo;
import com.bytedance.lark.pb.im.v1.PushSpeechRecognitionStatus;
import com.bytedance.lark.pb.im.v1.SendSpeechRecognitionResponse;
import com.bytedance.lark.pb.im.v1.ToggleTextOnAudioResponse;
import com.bytedance.lark.pb.media.v1.UploadAudioDataResponse;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.C26134a;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26308n;
import com.larksuite.framework.utils.C26325y;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.im.api.C29601ad;
import com.ss.android.lark.biz.im.api.C29631w;
import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.biz.im.api.p1409b.C29609a;
import com.ss.android.lark.chat.api.service.IChatService;
import com.ss.android.lark.chat.api.service.IMessageService;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.api.service.p1600b.C32835d;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.base.model.C32915a;
import com.ss.android.lark.chat.base.model.dispatch.RemoveTopNoticeMsgAction;
import com.ss.android.lark.chat.base.model.p1602a.AbstractC32919a;
import com.ss.android.lark.chat.base.model.p1602a.C32920b;
import com.ss.android.lark.chat.chatwindow.chat.data.p1620a.C33220b;
import com.ss.android.lark.chat.chatwindow.chat.data.p1620a.C33223m;
import com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader;
import com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33385a;
import com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33395d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33103ae;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.operation.PreviewUpdater;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33454i;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatAudioPushHandler;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatDingPushHandler;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatFilePushHandler;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatPreviewPushHandler;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatReactionPushHandler;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatStickerPushHandler;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatTranslatePushHandler;
import com.ss.android.lark.chat.chatwindow.secretchat.data.convert.SecretChatDataMapper;
import com.ss.android.lark.chat.core.model.AbstractC33959e;
import com.ss.android.lark.chat.core.model.AbstractExecutorC33962g;
import com.ss.android.lark.chat.core.model.C33955c;
import com.ss.android.lark.chat.core.model.SerialExecutor;
import com.ss.android.lark.chat.core.model.entity.C33960a;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.MessageUrlPreview;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FileState;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.chat.entity.message.p1669a.C34007a;
import com.ss.android.lark.chat.entity.message.p1669a.C34009b;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.chat.preview.entity.UrlPreViewEntries;
import com.ss.android.lark.chat.service.AbstractC34295j;
import com.ss.android.lark.chat.service.IInnerMessageService;
import com.ss.android.lark.chat.service.impl.AbstractC34231l;
import com.ss.android.lark.chat.service.impl.C34218i;
import com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback;
import com.ss.android.lark.chat.service.lkp.ConvertOfficeToSpaceService;
import com.ss.android.lark.chat.service.lkp.IConvertOfficeToSpaceService;
import com.ss.android.lark.chat.topnoticemessage.MessageTopNoticeModel;
import com.ss.android.lark.chat.topnoticemessage.message.TopNoticeMessage;
import com.ss.android.lark.chat.topnoticemessage.message.entity.ITopNoticeMessage;
import com.ss.android.lark.chat.utils.C34350p;
import com.ss.android.lark.chat.utils.C34352r;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.chatbase.Stream;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;
import com.ss.android.lark.chatbase.p1690c.C34438a;
import com.ss.android.lark.chatthread.AbstractC35135g;
import com.ss.android.lark.chatthread.C35095c;
import com.ss.android.lark.chatthread.model.datastore.ChatThreadDataStore;
import com.ss.android.lark.chatthread.model.loader.ChatThreadDataLoader;
import com.ss.android.lark.chatthread.p1714a.C35079a;
import com.ss.android.lark.chatthread.p1716c.C35098a;
import com.ss.android.lark.contact.entity.UserRelationResponse;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36493i;
import com.ss.android.lark.dependency.AbstractC36502p;
import com.ss.android.lark.dependency.AbstractC36510y;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.ding.entity.DingStatus;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.dto.p1815d.C36871a;
import com.ss.android.lark.dto.translate.C36874a;
import com.ss.android.lark.dto.translate.TranslateState;
import com.ss.android.lark.keyboard.utils.KBRichTextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1820e.p1821a.C36894a;
import com.ss.android.lark.p1820e.p1821a.C36903e;
import com.ss.android.lark.p2071k.C40672a;
import com.ss.android.lark.statistics.chat.C54948d;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.richtext.RichText;
import io.reactivex.disposables.C68289a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.lark.chatthread.c.a */
public class C35098a implements ChatPreviewPushHandler.IPreviewPushListener, C33454i.AbstractC33459b, C33955c.AbstractC33957b<ChatMessageVO>, IThreadPushListener, AbstractC35135g.AbstractC35136a {

    /* renamed from: A */
    private C33466o f90635A;

    /* renamed from: B */
    private final C33103ae f90636B;

    /* renamed from: C */
    private MessageTopNoticeModel f90637C;

    /* renamed from: D */
    private final boolean f90638D;

    /* renamed from: E */
    private final C26134a<List<MessageInfo>> f90639E;

    /* renamed from: a */
    protected final C68289a f90640a;

    /* renamed from: b */
    protected AbstractC35135g.AbstractC35136a.AbstractC35137a f90641b;

    /* renamed from: c */
    public final AbstractC36510y f90642c;

    /* renamed from: d */
    public Chat f90643d;

    /* renamed from: e */
    public ChatChatter f90644e;

    /* renamed from: f */
    public ChatChatter f90645f;

    /* renamed from: g */
    public final ChatThreadDataStore f90646g;

    /* renamed from: h */
    public final AtomicBoolean f90647h;

    /* renamed from: i */
    IInnerMessageService f90648i;

    /* renamed from: j */
    AbstractExecutorC33962g f90649j;

    /* renamed from: k */
    private final IChatService f90650k = C32821b.m126120a();

    /* renamed from: l */
    private final C32835d f90651l = C32835d.m126323c();

    /* renamed from: m */
    private final AbstractC36474h f90652m;

    /* renamed from: n */
    private final AbstractC36450aa f90653n;

    /* renamed from: o */
    private final CallbackManager f90654o;

    /* renamed from: p */
    private final IStickerDependency f90655p;

    /* renamed from: q */
    private final IConvertOfficeToSpaceService f90656q;

    /* renamed from: r */
    private final AbstractC36502p f90657r;

    /* renamed from: s */
    private final AbstractC36493i f90658s;

    /* renamed from: t */
    private C35095c f90659t;

    /* renamed from: u */
    private String f90660u;

    /* renamed from: v */
    private String f90661v;

    /* renamed from: w */
    private MessageInfo f90662w;

    /* renamed from: x */
    private OpenApp f90663x;

    /* renamed from: y */
    private MessageResourceLoader f90664y;

    /* renamed from: z */
    private final HashMap<String, MessageInfo> f90665z;

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatTranslatePushHandler.ITranslatePushListener
    /* renamed from: a */
    public void mo123111a(PushImageTranslationInfo pushImageTranslationInfo) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatOneWayContactPushHandler.OneWayContactPush
    /* renamed from: a */
    public void mo123082a(String str) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33454i.AbstractC33459b
    public void onPushChatRemoveChatters(Chat chat, Map<String, ? extends Chatter> map) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatPreviewPushHandler.IPreviewPushListener
    public void onPushSignUrlPreview(List<UrlPreViewEntries> list) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatFilePushHandler.IFilePushListener
    public void onSwitchToCellularDataNetwork(boolean z) {
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a
    /* renamed from: d */
    public OpenApp mo129453d() {
        return this.f90663x;
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a
    /* renamed from: e */
    public Chatter mo129455e() {
        return this.f90645f;
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a
    /* renamed from: a */
    public List<MessageInfo> mo129417a() {
        return new ArrayList(this.f90646g.mo127118g());
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a
    /* renamed from: a */
    public void mo129438a(List<ChatMessageVO> list) {
        if (!CollectionUtils.isEmpty(list)) {
            ArrayList arrayList = new ArrayList();
            for (ChatMessageVO cVar : list) {
                arrayList.add(mo129443b(cVar.mo121681a()));
            }
            this.f90639E.mo93035a(arrayList);
        }
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: a */
    public void mo129432a(String str, RichText richText, String str2, RichText richText2) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable(str, richText, str2, richText2) {
            /* class com.ss.android.lark.chatthread.p1716c.$$Lambda$a$olNkWsa23eY8yFfpIa1zw1T3RXE */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ RichText f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ RichText f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                C35098a.this.m136942b(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a
    /* renamed from: a */
    public void mo129419a(IGetDataCallback<C35095c> iGetDataCallback) {
        C35095c cVar = this.f90659t;
        if (cVar != null) {
            this.f90643d = cVar.f90625a;
            this.f90663x = this.f90659t.f90629e;
            this.f90645f = this.f90659t.f90627c;
            this.f90644e = this.f90659t.f90626b;
            this.f90662w = this.f90659t.f90628d;
            iGetDataCallback.onSuccess(this.f90659t);
            return;
        }
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable(iGetDataCallback) {
            /* class com.ss.android.lark.chatthread.p1716c.$$Lambda$a$dchvQLdftuRcJFTb4dtLsDdMAFA */
            public final /* synthetic */ IGetDataCallback f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C35098a.this.m136945c((C35098a) this.f$1);
            }
        });
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a
    /* renamed from: a */
    public void mo129428a(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback) {
        this.f90650k.mo121020a(str, (String) null, true, (IGetDataCallback<ChatChatterResponse>) this.f90654o.wrapAndAddGetDataCallback(iGetDataCallback), 0);
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a
    /* renamed from: b */
    public void mo129448b(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        Message message = mo129443b(str).getMessage();
        if (message.getType() == Message.Type.STICKER) {
            StickerContent stickerContent = (StickerContent) message.getContent();
            if (!stickerContent.isPaid()) {
                LKUIToast.show(C29990c.m110930b().mo134528a(), (int) R.string.Lark_Chat_StickerPackNeedBuy);
                return;
            }
            this.f90655p.mo134385a(Collections.singletonList(C33223m.m128430a(stickerContent)), iGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: a */
    public void mo129435a(String str, String str2, RichText richText) {
        if (KBRichTextUtils.m160783a(richText, str)) {
            mo129431a(str2, richText);
        } else {
            this.f90648i.mo121267b(((C29609a.C29610a) ((C29609a.C29610a) ((C29609a.C29610a) C29609a.m109497a().mo106692a(str).mo106693a(false).mo125332j(this.f90660u)).mo125330h(this.f90662w.getMessage().getId())).mo125331i(this.f90662w.getMessage().getId())).mo106691a(richText).mo106694a(), new C35113b(this));
        }
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: a */
    public void mo129431a(String str, RichText richText) {
        this.f90648i.mo121267b(((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) C29601ad.m109464a().mo106659a(richText).mo125332j(this.f90660u)).mo125330h(this.f90662w.getMessage().getId())).mo125331i(this.f90662w.getMessage().getId())).mo106660a(), new C35113b(this));
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: a */
    public void mo129425a(IStickerDependency.StickerFileInfo stickerFileInfo) {
        this.f90648i.mo121267b(((C34009b.C34010a) ((C34009b.C34010a) ((C34009b.C34010a) C34009b.m131850a().mo125324a(stickerFileInfo).mo125332j(this.f90660u)).mo125330h(this.f90662w.getMessage().getId())).mo125331i(this.f90662w.getMessage().getId())).mo125325a(), new C35113b(this));
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: a */
    public void mo129418a(Context context, final String str) {
        String str2;
        MessageInfo messageInfo = (MessageInfo) this.f90646g.mo127099a(str);
        if (messageInfo != null && messageInfo.getMessage().getType() == Message.Type.FILE) {
            Message message = messageInfo.getMessage();
            FileContent fileContent = (FileContent) messageInfo.getMessage().getContent();
            mo129429a(str, FileState.DOWNLOADING, (String) null, 0);
            String x = C57881t.m224652x(context);
            if (this.f90643d.isSecret()) {
                str2 = null;
            } else {
                str2 = C26308n.m95252a(context, x, fileContent.getName());
            }
            C29990c.m110930b().mo134591s().mo134677a(context, str, message.getSourceId(), this.f90660u, message.getSourceType().getNumber(), fileContent.getKey(), str2, (IGetDataCallback) this.f90654o.wrapAndAddCallback(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.chatthread.p1716c.C35098a.AnonymousClass19 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165389i("chat_thread", "onError:" + errorResult);
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    if (TextUtils.isEmpty(str)) {
                        Log.m165389i("chat_thread", "download success, filePath is empty");
                        C35098a.this.mo129429a(str, FileState.DOWNLOAD, (String) null, 0);
                    } else if (new File(str).exists()) {
                        Log.m165389i("chat_thread", "download success, filePath is:" + str);
                        C35098a.this.mo129429a(str, FileState.DONE, str, 100);
                    }
                }
            }), new AbstractC25974h(str) {
                /* class com.ss.android.lark.chatthread.p1716c.$$Lambda$a$OoF4jHpV34g6m26ouS8mlJgjcuc */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.larksuite.framework.callback.AbstractC25974h
                public final void onUpdateProgress(long j, int i) {
                    C35098a.this.m136937a((C35098a) this.f$1, (String) j, (long) i);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo129429a(String str, final FileState fileState, final String str2, final int i) {
        this.f90646g.mo127105a(str, new AbstractC34432b.AbstractC34435c<AbstractC34006a>() {
            /* class com.ss.android.lark.chatthread.p1716c.C35098a.AnonymousClass20 */

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public AbstractC34006a mo122917a(AbstractC34006a aVar) {
                FileContent fileContent = (FileContent) aVar.getMessage().getContent();
                FileState fileState = fileState;
                if (fileState != null) {
                    fileContent.setFileState(fileState);
                }
                String str = str2;
                if (str != null) {
                    fileContent.setFilePath(str);
                }
                fileContent.setProgress(i);
                return aVar;
            }
        });
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: a */
    public void mo129436a(String str, String str2, String str3, Message.SourceType sourceType, IGetDataCallback<String> iGetDataCallback) {
        C29990c.m110930b().mo134503B().mo134614a(str, str2, str3, sourceType, (IGetDataCallback) this.f90654o.wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: a */
    public void mo129434a(String str, String str2, Message.SourceType sourceType, IGetDataCallback<String> iGetDataCallback) {
        C29990c.m110930b().mo134503B().mo134613a(str, str2, sourceType, (IGetDataCallback) this.f90654o.wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: a */
    public void mo129427a(String str, final int i) {
        this.f90646g.mo127105a(str, new AbstractC34432b.AbstractC34435c<AbstractC34006a>() {
            /* class com.ss.android.lark.chatthread.p1716c.C35098a.C351012 */

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public AbstractC34006a mo122917a(AbstractC34006a aVar) {
                Message message = aVar.getMessage();
                if (message.getType() == Message.Type.FILE) {
                    ((FileContent) message.getContent()).setSaveToDrive(i);
                }
                return aVar;
            }
        });
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: a */
    public void mo129437a(final String str, final boolean z) {
        final MessageInfo b = mo129443b(str);
        if (b != null && b.getMessage().getType() == Message.Type.AUDIO) {
            this.f90648i.mo121268b(str, z, new IGetDataCallback<ToggleTextOnAudioResponse>() {
                /* class com.ss.android.lark.chatthread.p1716c.C35098a.C351023 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }

                /* renamed from: a */
                public void onSuccess(ToggleTextOnAudioResponse toggleTextOnAudioResponse) {
                    String str;
                    AudioContent audioContent = (AudioContent) b.getMessage().getContent();
                    if (z && TextUtils.isEmpty(audioContent.getRecognizedText())) {
                        Log.m165379d("chat_thread", "sendAudioMessage2Text request：" + audioContent.getRecognizedText());
                        String locale = C35098a.this.f90642c.mo134745d().toString();
                        if (!TextUtils.isEmpty(locale)) {
                            str = locale.toLowerCase();
                        } else {
                            str = "zh_ch";
                        }
                        C35098a.this.f90648i.mo121260a(str, str, 16000, "opus", new IGetDataCallback<Boolean>() {
                            /* class com.ss.android.lark.chatthread.p1716c.C35098a.C351023.C351031 */

                            /* renamed from: a */
                            public void onSuccess(Boolean bool) {
                                Log.m165379d("chat_thread", "sendAudioMessage2Text success：" + bool);
                            }

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                String str;
                                Log.m165379d("chat_thread", "sendAudioMessage2Text error：" + errorResult.getErrorMsg());
                                AbstractC35135g.AbstractC35136a.AbstractC35137a aVar = C35098a.this.f90641b;
                                if (errorResult.getErrorCode() != 5029) {
                                    str = errorResult.getErrorMsg();
                                } else {
                                    str = UIUtils.getString(C29990c.m110930b().mo134528a(), R.string.Lark_Chat_AudioConvertToTextError);
                                }
                                aVar.mo129489a(str);
                            }
                        });
                    }
                    C35098a.this.f90646g.mo127105a(str, new AbstractC34432b.AbstractC34435c<AbstractC34006a>() {
                        /* class com.ss.android.lark.chatthread.p1716c.C35098a.C351023.C351042 */

                        /* access modifiers changed from: protected */
                        /* renamed from: a */
                        public AbstractC34006a mo122917a(AbstractC34006a aVar) {
                            ((AudioContent) aVar.getMessage().getContent()).setNeedHideText(!z);
                            return aVar;
                        }
                    });
                }
            });
        }
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: a */
    public Message mo129416a(String str, String str2, String str3, String str4) {
        return ((C34007a.C34008a) ((C34007a.C34008a) ((C34007a.C34008a) ((C34007a.C34008a) C34007a.m131841a().mo125332j(this.f90660u)).mo125330h(str)).mo125331i(str2)).mo106709g(str4)).mo125319a(str3).mo125318a(AudioContent.AudioState.RECORDING).mo125320a().mo106656a(str4, this.f90653n.mo134394a());
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: a */
    public void mo129420a(Message message, String str, String str2, int i) {
        String id = this.f90662w.getMessage().getId();
        AudioContent audioContent = (AudioContent) message.getContent();
        this.f90648i.mo121267b(((C34007a.C34008a) ((C34007a.C34008a) ((C34007a.C34008a) ((C34007a.C34008a) C34007a.m131841a().mo125332j(this.f90660u)).mo125330h(id)).mo125331i(id)).mo125319a(str).mo125317a(i).mo125321b(audioContent.getUploadId()).mo125322c(audioContent.getAudioToken()).mo125318a(AudioContent.AudioState.DOWNLOAD).mo106709g(str2)).mo125320a(), new C35113b(this));
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: a */
    public void mo129421a(Message message, final String str, final String str2, String str3, final int i) {
        AudioContent audioContent = (AudioContent) message.getContent();
        this.f90648i.mo121267b(((C34007a.C34008a) ((C34007a.C34008a) ((C34007a.C34008a) ((C34007a.C34008a) ((C34007a.C34008a) C34007a.m131841a().mo125332j(this.f90660u)).mo125330h(message.getRootId())).mo125331i(message.getParentId())).mo125328c(this.f90643d.getLastMessagePosition() + 1)).mo106709g(str3)).mo125318a(AudioContent.AudioState.DOWNLOAD).mo125317a(i).mo125319a(str2).mo125323d(str).mo125321b(audioContent.getUploadId()).mo125322c(audioContent.getAudioToken()).mo125320a(), new C35113b(this) {
            /* class com.ss.android.lark.chatthread.p1716c.C35098a.C351054 */

            @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.AbstractC34125f, com.ss.android.lark.chatthread.p1716c.C35098a.C35113b
            /* renamed from: a */
            public void mo123034a(MessageInfo messageInfo) {
                super.mo123034a(messageInfo);
                AudioContent audioContent = (AudioContent) messageInfo.getMessage().getContent();
                audioContent.setDuration(i);
                audioContent.setLocalFilePath(str2);
                audioContent.setAudioWithText(true);
                audioContent.setNeedHideText(false);
                audioContent.setRecognizedText(str);
                audioContent.setFileState(AudioContent.AudioState.DOWNLOAD);
            }
        });
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: a */
    public Message mo129415a(final Message message, final int i, ByteBuffer byteBuffer, boolean z, final boolean z2, final IGetDataCallback iGetDataCallback) {
        if (message != null && message.getType() == Message.Type.AUDIO) {
            final AudioContent audioContent = (AudioContent) message.getContent();
            if (audioContent.getUploadId() == null) {
                return message;
            }
            if (z) {
                int i2 = i == 1 ? 1 : z2 ? 2 : 0;
                if (z2) {
                    MessageHitPoint.f135779d.mo187558h(audioContent.getUploadId());
                }
                this.f90648i.mo121257a(audioContent.getUploadId(), i, this.f90642c.mo134745d().toString(), UserSP.getInstance().getString("user_audio_2_text_locale", "zh_ch"), byteBuffer.array(), i2, 16000, "opus", true, this.f90660u, new IGetDataCallback<SendSpeechRecognitionResponse>() {
                    /* class com.ss.android.lark.chatthread.p1716c.C35098a.C351065 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        C35098a.this.mo129447b("", i, "", true, new int[0]);
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onError(errorResult);
                        }
                        if (z2) {
                            MessageHitPoint.f135779d.mo187534a(audioContent.getUploadId(), false);
                        }
                        Log.m165381d("chat_thread", errorResult);
                    }

                    /* renamed from: a */
                    public void onSuccess(SendSpeechRecognitionResponse sendSpeechRecognitionResponse) {
                        String str;
                        if (sendSpeechRecognitionResponse.sequence_id.intValue() >= audioContent.getSequenceId() && sendSpeechRecognitionResponse.is_available.booleanValue()) {
                            audioContent.setSequenceId(sendSpeechRecognitionResponse.sequence_id.intValue());
                            C35098a.this.mo129447b(audioContent.getUploadId(), i, sendSpeechRecognitionResponse.result, sendSpeechRecognitionResponse.is_end.booleanValue(), C34438a.m133582a(sendSpeechRecognitionResponse.diff_index_slice));
                        }
                        if (sendSpeechRecognitionResponse.is_end.booleanValue()) {
                            MessageHitPoint.f135779d.mo187534a(audioContent.getUploadId(), true);
                        }
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            if (sendSpeechRecognitionResponse != null) {
                                str = sendSpeechRecognitionResponse.result;
                            } else {
                                str = "";
                            }
                            iGetDataCallback.onSuccess(str);
                        }
                        Log.m165379d("chat_thread", "audio2text:" + sendSpeechRecognitionResponse.result + "/" + sendSpeechRecognitionResponse.is_available + "/" + sendSpeechRecognitionResponse.is_end);
                    }
                });
            } else {
                this.f90648i.mo121258a(audioContent.getUploadId(), i, byteBuffer.array(), z, z2, "", new IGetDataCallback<UploadAudioDataResponse>() {
                    /* class com.ss.android.lark.chatthread.p1716c.C35098a.C351076 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onError(errorResult);
                        }
                        Log.m165379d("chat_thread", "sendAudioData-onError:" + message.getId());
                    }

                    /* renamed from: a */
                    public void onSuccess(UploadAudioDataResponse uploadAudioDataResponse) {
                        String str;
                        if (uploadAudioDataResponse != null) {
                            audioContent.setSequenceId(uploadAudioDataResponse.sequence_id.intValue());
                            audioContent.setAudioToken(uploadAudioDataResponse.token);
                            if (!TextUtils.isEmpty(uploadAudioDataResponse.audio2text)) {
                                audioContent.setRecognizedText(uploadAudioDataResponse.audio2text);
                            }
                            Log.m165379d("chat_thread", "sendAudioData-token:" + uploadAudioDataResponse.token);
                        }
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            if (uploadAudioDataResponse != null) {
                                str = uploadAudioDataResponse.audio2text;
                            } else {
                                str = "";
                            }
                            iGetDataCallback.onSuccess(str);
                        }
                        Log.m165379d("chat_thread", "sendAudioData-onSuccess:" + message.getId());
                    }
                });
            }
        }
        return message;
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: a */
    public void mo129441a(List<String> list, boolean z, String str, String str2) {
        C32915a.m126762a(this.f90660u, list).mo121547a(z).mo121541a(this.f90643d.getLastMessagePosition()).mo121551b(str2).mo121546a(str).mo121553c(this.f90643d.isSecret()).mo121545a(new C35113b(this)).mo121542a(Biz.Messenger).mo121543a(Scene.Chat).mo121550b(1).mo121548a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void m136941b(Photo photo, String str) {
        C351087 r0 = new AbstractC35112a(this) {
            /* class com.ss.android.lark.chatthread.p1716c.C35098a.C351087 */

            @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.impl.AbstractC34231l
            /* renamed from: b */
            public void mo121318b(final Message message) {
                super.mo121318b(message);
                C35098a.this.f90646g.mo127105a(message.getcId(), new AbstractC34432b.AbstractC34435c<AbstractC34006a>() {
                    /* class com.ss.android.lark.chatthread.p1716c.C35098a.C351087.C351091 */

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public AbstractC34006a mo122917a(AbstractC34006a aVar) {
                        aVar.setMessage(message);
                        return aVar;
                    }
                });
            }
        };
        r0.mo126558a(Message.Type.MEDIA);
        String id = this.f90662w.getMessage().getId();
        if (TextUtils.isEmpty(str)) {
            str = id;
        }
        this.f90648i.mo121267b(((C29631w.C29633a) ((C29631w.C29633a) ((C29631w.C29633a) ((C29631w.C29633a) ((C29631w.C29633a) C29631w.m109564a().mo125332j(this.f90660u)).mo125330h(id)).mo125331i(str)).mo125328c(this.f90643d.getLastMessagePosition())).mo106770b(photo.getDuration()).mo106767a(new File(photo.getPath())).mo106766a(photo.getSize()).mo106770b(photo.getDuration()).mo106768a(photo.getMimeType()).mo125334l(r0.mo126560b())).mo106771b(photo.getCompressPath()).mo106769a(), r0);
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a
    /* renamed from: a */
    public void mo129430a(String str, final DingStatus dingStatus, boolean z) {
        this.f90646g.mo127105a(str, new AbstractC34417b.AbstractC34424f<AbstractC34006a>() {
            /* class com.ss.android.lark.chatthread.p1716c.C35098a.C351108 */

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.chatbase.AbstractC34417b.AbstractC34424f
            /* renamed from: a */
            public AbstractC34006a mo122923a(AbstractC34006a aVar) {
                MessageInfo messageInfo = (MessageInfo) aVar;
                messageInfo.getMessage().setDing(true);
                messageInfo.setDingStatus(dingStatus);
                return messageInfo;
            }
        });
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatTranslatePushHandler.ITranslatePushListener
    /* renamed from: a */
    public void mo123113a(String str, List<String> list, Integer num, Map<String, Integer> map, Map<String, Integer> map2) {
        AbstractC35135g.AbstractC35136a.AbstractC35137a aVar;
        C33103ae aeVar = this.f90636B;
        if (aeVar != null && aeVar.handlePushTranslateSettingV2(str, list, num, map, map2) && (aVar = this.f90641b) != null) {
            aVar.mo129511b();
        }
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a
    /* renamed from: a */
    public void mo129422a(MessageInfo messageInfo) {
        messageInfo.getMessage().setBurned(true);
        C34438a.m133577a("burn message ", messageInfo.getMessage());
        mo129450c(messageInfo);
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a
    /* renamed from: a */
    public void mo129433a(String str, final String str2) {
        this.f90664y.mo122894a(1, Collections.singletonList(mo129443b(str2)), new IGetDataCallback<Map<String, String>>() {
            /* class com.ss.android.lark.chatthread.p1716c.C35098a.C351119 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m137051a() {
                UDToast.show(UIHelper.getContext(), UIHelper.getString(R.string.Lark_Video_CantDownloadTryAgain));
            }

            /* renamed from: a */
            public void onSuccess(Map<String, String> map) {
                C35098a.this.f90646g.mo127105a(str2, new C33385a(AudioContent.AudioState.DONE_OPEN));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C35098a.this.f90646g.mo127105a(str2, new C33385a(AudioContent.AudioState.DOWNLOAD));
                UICallbackExecutor.execute($$Lambda$a$9$24pZmbvquAdwMLYgOx2EMbq968c.INSTANCE);
            }
        });
    }

    /* renamed from: a */
    private boolean m136939a(Message message, Message message2) {
        boolean isPreMessage = message.isPreMessage();
        boolean isPreMessage2 = message2.isPreMessage();
        boolean z = message.getUpdateTime() >= message2.getUpdateTime();
        if (isPreMessage) {
            return isPreMessage2 && z;
        }
        if (isPreMessage2 || z) {
            return true;
        }
    }

    @Override // com.ss.android.lark.p2392o.AbstractC48707q
    /* renamed from: a */
    public void mo123873a(boolean z) {
        this.f90641b.mo129510a(z);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatAudioPushHandler.IAudioPushListener
    /* renamed from: a */
    public void mo123058a(String str, PushSpeechRecognitionStatus.Status status) {
        this.f90641b.mo129491a(str, status);
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: a */
    public void mo129440a(List<Photo> list, String str, String str2) {
        if (!CollectionUtils.isEmpty(list)) {
            C57865c.m224576a(new Runnable(list.get(0), str2) {
                /* class com.ss.android.lark.chatthread.p1716c.$$Lambda$a$S0WlLzp3iIueVBEDIE9slUgYgE */
                public final /* synthetic */ Photo f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C35098a.this.m136941b((C35098a) this.f$1, (Photo) this.f$2);
                }
            });
        }
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: a */
    public void mo129439a(List<String> list, final IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback) {
        if (list != null && list.size() > 0) {
            C29990c.m110930b().mo134522U().mo134620a(list, "", (IGetDataCallback) this.f90654o.wrapAndAddCallback(new IGetDataCallback<List<FavoriteMessageInfo>>() {
                /* class com.ss.android.lark.chatthread.p1716c.C35098a.AnonymousClass11 */

                /* renamed from: a */
                public void onSuccess(List<FavoriteMessageInfo> list) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(list);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }
            }));
        }
    }

    /* renamed from: a */
    public void mo129423a(AbstractC35135g.AbstractC35136a.AbstractC35137a aVar) {
        this.f90641b = aVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatAudioPushHandler.IAudioPushListener
    /* renamed from: a */
    public void mo123057a(String str, int i, String str2, boolean z, int[] iArr) {
        AbstractC35135g.AbstractC35136a.AbstractC35137a aVar;
        if (TextUtils.isEmpty(str2) && z && (aVar = this.f90641b) != null) {
            aVar.mo129489a(UIUtils.getString(C29990c.m110930b().mo134528a(), R.string.Lark_Chat_AudioConvertToTextError));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatOneWayContactPushHandler.OneWayContactPush
    /* renamed from: a */
    public void mo123081a(PushContactApplicationBannerAffectEvent pushContactApplicationBannerAffectEvent) {
        if (this.f90645f != null && pushContactApplicationBannerAffectEvent.target_user_ids.contains(this.f90645f.getId())) {
            mo129457f();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatTranslatePushHandler.ITranslatePushListener
    /* renamed from: a */
    public void mo123112a(C36874a aVar) {
        this.f90636B.handlePushTranslateState(aVar, new AbstractC33134w.AbstractC33136b() {
            /* class com.ss.android.lark.chatthread.p1716c.C35098a.AnonymousClass14 */

            @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w.AbstractC33136b
            /* renamed from: a */
            public void mo122326a(Map<String, TranslateState> map) {
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w.AbstractC33136b
            /* renamed from: a */
            public void mo122325a(TranslateState translateState) {
                if (C35098a.this.f90641b != null) {
                    C35098a.this.f90641b.mo129507a(translateState);
                }
            }
        });
    }

    /* renamed from: q */
    private void m136958q() {
        C36894a.m145605a().mo136207d();
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a
    /* renamed from: b */
    public Chat mo129442b() {
        return this.f90643d;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatFilePushHandler.IFilePushListener, com.ss.android.lark.chat.chatwindow.chat.v2.push.IStreamProvider
    public Stream<AbstractC34006a> stream() {
        return this.f90646g.mo127124k();
    }

    /* renamed from: k */
    private void m136952k() {
        MessageResourceLoader messageResourceLoader = new MessageResourceLoader(new MessageResourceLoader.IContextDependency() {
            /* class com.ss.android.lark.chatthread.p1716c.C35098a.C350991 */

            @Override // com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.IContextDependency
            /* renamed from: a */
            public Context mo122906a() {
                return C35098a.this.f90641b.mo129488a();
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.IContextDependency
            /* renamed from: b */
            public boolean mo122908b() {
                if (C35098a.this.f90643d == null || !C35098a.this.f90643d.isSecret()) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.IContextDependency
            /* renamed from: c */
            public boolean mo122909c() {
                if (C35098a.this.f90645f == null || C35098a.this.f90645f.getType() != Chatter.ChatterType.BOT) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.IContextDependency
            /* renamed from: a */
            public void mo122907a(List<? extends AbstractC34417b.AbstractC34426h<String, AbstractC34006a>> list) {
                C35098a.this.f90646g.mo127110b((List<AbstractC34417b.AbstractC34426h<String, AbstractC34006a>>) new ArrayList(list));
            }
        });
        this.f90664y = messageResourceLoader;
        messageResourceLoader.mo122893a();
    }

    /* renamed from: o */
    private void m136956o() {
        this.f90639E.mo93034a(new C26134a.AbstractC26136a() {
            /* class com.ss.android.lark.chatthread.p1716c.$$Lambda$a$jpEp7K9Twh8X4KI9uLTXkpygFas */

            @Override // com.larksuite.framework.thread.C26134a.AbstractC26136a
            public final void onExecute(List list) {
                C35098a.this.m136948d((C35098a) list);
            }
        });
    }

    /* renamed from: p */
    private void m136957p() {
        this.f90636B.setInitData(this.f90660u, new AbstractC33134w.AbstractC33135a() {
            /* class com.ss.android.lark.chatthread.p1716c.C35098a.AnonymousClass15 */

            @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w.AbstractC33135a
            /* renamed from: b */
            public void mo122324b(Collection<AbstractC34006a> collection) {
                mo122323a(collection);
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w.AbstractC33135a
            /* renamed from: a */
            public void mo122323a(Collection<AbstractC34006a> collection) {
                Iterator<AbstractC34006a> it = collection.iterator();
                while (it.hasNext()) {
                    C35098a.this.mo129450c((MessageInfo) it.next());
                }
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w.AbstractC33135a
            /* renamed from: a */
            public List<AbstractC34006a> mo122322a(Collection<String> collection, int i) {
                ArrayList arrayList = new ArrayList();
                for (String str : collection) {
                    arrayList.add(C35098a.this.mo129443b(str));
                }
                return arrayList;
            }
        });
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: i */
    public boolean mo129462i() {
        return !this.f90653n.mo134402e();
    }

    /* renamed from: j */
    private AbstractC33959e<MessageInfo, ChatMessageVO<?>> m136951j() {
        if (this.f90643d.isSecret()) {
            return new SecretChatDataMapper(false, null);
        }
        return new C33220b(false);
    }

    /* renamed from: m */
    private void m136954m() {
        this.f90635A.mo123119b();
        C29990c.m110930b().mo134524W().mo134470b(this);
        this.f90635A = null;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatFilePushHandler.IFilePushListener
    public void onFileDownloadFail() {
        LKUIToast.show(this.f90652m.mo134528a(), UIHelper.getString(R.string.Lark_Legacy_FileDownloadFail));
    }

    /* renamed from: n */
    private void m136955n() {
        this.f90651l.mo121197a(this.f90660u, C29990c.m110930b().mo134515N().mo134394a(), (IGetDataCallback) this.f90654o.wrapAndAddCallback(new IGetDataCallback<ChatChatter>() {
            /* class com.ss.android.lark.chatthread.p1716c.C35098a.AnonymousClass12 */

            /* renamed from: a */
            public void onSuccess(ChatChatter chatChatter) {
                C35098a.this.f90644e = chatChatter;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C35098a.this.f90644e = null;
                Log.m165397w("chat_thread", errorResult.getDebugMsg());
            }
        }));
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a
    /* renamed from: c */
    public Chatter mo129449c() {
        if (this.f90644e == null) {
            this.f90644e = this.f90651l.m126324c(this.f90660u, C29990c.m110930b().mo134515N().mo134394a());
        }
        return this.f90644e;
    }

    /* renamed from: f */
    public void mo129457f() {
        ChatChatter chatChatter;
        Chat b = mo129442b();
        if (b != null && b.getType() == Chat.Type.P2P && b.isCrossTenant() && (chatChatter = this.f90645f) != null && !chatChatter.isBot()) {
            final String id = this.f90645f.getId();
            this.f90658s.mo134648a(id, new IGetDataCallback<UserRelationResponse>() {
                /* class com.ss.android.lark.chatthread.p1716c.C35098a.AnonymousClass16 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }

                /* renamed from: a */
                public void onSuccess(UserRelationResponse userRelationResponse) {
                    C35098a.this.f90641b.mo129508a(id, userRelationResponse);
                }
            });
        }
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: g */
    public void mo129459g() {
        this.f90647h.set(false);
        this.f90665z.clear();
        new ChatThreadDataLoader(this.f90646g, this.f90661v, this.f90643d.getFirstMessagePosition(), new ChatThreadDataLoader.ReplyMessageLoadCallback() {
            /* class com.ss.android.lark.chatthread.p1716c.C35098a.AnonymousClass17 */

            @Override // com.ss.android.lark.chatthread.model.loader.ChatThreadDataLoader.ReplyMessageLoadCallback
            /* renamed from: b */
            public void mo129469b() {
                C35098a.this.f90647h.set(true);
                C35098a.this.mo129461h();
            }

            @Override // com.ss.android.lark.chatthread.model.loader.ChatThreadDataLoader.ReplyMessageLoadCallback
            /* renamed from: a */
            public void mo129468a() {
                if (!C35098a.this.f90643d.isSecret()) {
                    C35098a.this.f90641b.mo129514e();
                }
            }
        }).mo129493a();
    }

    /* renamed from: h */
    public void mo129461h() {
        synchronized (this.f90665z) {
            if (!this.f90665z.isEmpty()) {
                for (MessageInfo messageInfo : this.f90665z.values()) {
                    mo129450c(messageInfo);
                }
                this.f90665z.clear();
            }
        }
    }

    /* renamed from: l */
    private void m136953l() {
        this.f90635A = new C33466o();
        String str = this.f90660u;
        ChatThreadDataStore aVar = this.f90646g;
        aVar.getClass();
        C33454i iVar = new C33454i(str, this, new C33454i.AbstractC33458a() {
            /* class com.ss.android.lark.chatthread.p1716c.$$Lambda$MNOUihKUtOoIStBKx5JUZ8TL4 */

            @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33454i.AbstractC33458a
            public final MessageInfo getMessageById(String str) {
                return (MessageInfo) ChatThreadDataStore.this.mo127099a(str);
            }
        });
        ChatFilePushHandler eVar = new ChatFilePushHandler(this.f90660u, this);
        ChatDingPushHandler dVar = new ChatDingPushHandler(this.f90660u, this);
        ChatStickerPushHandler kVar = new ChatStickerPushHandler(this);
        ChatReactionPushHandler hVar = new ChatReactionPushHandler();
        ChatTranslatePushHandler mVar = new ChatTranslatePushHandler(this);
        ChatAudioPushHandler aVar2 = new ChatAudioPushHandler(this);
        this.f90635A.mo123117a(iVar).mo123117a(eVar).mo123117a(mVar).mo123117a(dVar).mo123117a(kVar).mo123117a(hVar).mo123117a(aVar2).mo123117a(new ChatPreviewPushHandler(this)).mo123118a();
        C29990c.m110930b().mo134524W().mo134468a(this);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        if (TextUtils.isEmpty(this.f90660u) || TextUtils.isEmpty(this.f90661v)) {
            Log.m165383e("chat_thread", "init param is empty");
            this.f90641b.mo129513d();
            return;
        }
        m136955n();
        m136953l();
        m136956o();
        m136957p();
        mo129457f();
        m136958q();
        this.f90637C.mo126866d();
        C32920b.from((FragmentActivity) this.f90641b.mo129488a()).registerActionListener(this.f90646g);
        if (this.f90638D) {
            C32920b.from((FragmentActivity) this.f90641b.mo129488a()).registerActionListener(new C32920b.AbstractC32921a() {
                /* class com.ss.android.lark.chatthread.p1716c.$$Lambda$a$NnZCT7Mkfd5X6Fn2hpE_fhJHECk */

                @Override // com.ss.android.lark.chat.base.model.p1602a.C32920b.AbstractC32921a
                public final boolean onAction(AbstractC32919a aVar) {
                    return C35098a.this.m136938a((C35098a) aVar);
                }
            });
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f90640a.mo237935a();
        m136958q();
        C36903e.m145675a().mo136256c();
        m136954m();
        this.f90637C.mo126868f();
        C32920b.from((FragmentActivity) this.f90641b.mo129488a()).unregisterActionHandler(this.f90646g);
        if (this.f90638D) {
            C32920b.from((FragmentActivity) this.f90641b.mo129488a()).unregisterActionHandler(new C32920b.AbstractC32921a() {
                /* class com.ss.android.lark.chatthread.p1716c.$$Lambda$a$NnZCT7Mkfd5X6Fn2hpE_fhJHECk */

                @Override // com.ss.android.lark.chat.base.model.p1602a.C32920b.AbstractC32921a
                public final boolean onAction(AbstractC32919a aVar) {
                    return C35098a.this.m136938a((C35098a) aVar);
                }
            });
        }
    }

    /* renamed from: com.ss.android.lark.chatthread.c.a$a */
    private static abstract class AbstractC35112a extends C35113b implements AbstractC34231l {
        AbstractC35112a(C35098a aVar) {
            super(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m136946c(List list) {
        this.f90641b.mo129509a(list);
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: e */
    public void mo129456e(String str) {
        this.f90648i.mo121109c(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chatthread.c.a$b */
    public static class C35113b extends MonitorMessageSendCallback {

        /* renamed from: a */
        private final WeakReference<C35098a> f90719a;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ AbstractC34006a m137053a(AbstractC34006a aVar) {
            if (aVar != null) {
                aVar.getMessage().setSendStatus(SendStatus.FAIL);
            }
            return aVar;
        }

        C35113b(C35098a aVar) {
            this.f90719a = new WeakReference<>(aVar);
            if (aVar != null) {
                mo126648a(aVar.f90643d);
                mo126649a(aVar.f90645f);
            }
        }

        @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.AbstractC34125f
        /* renamed from: a */
        public void mo123034a(MessageInfo messageInfo) {
            super.mo123034a(messageInfo);
            C35098a aVar = this.f90719a.get();
            if (aVar != null) {
                aVar.f90646g.mo127119g(messageInfo);
                EventBus.getDefault().trigger(new C40672a(messageInfo));
            }
        }

        @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.AbstractC34125f
        /* renamed from: a */
        public void mo121287a(ErrorResult errorResult, Message message) {
            C35098a aVar = this.f90719a.get();
            if (aVar != null) {
                aVar.f90646g.mo127105a(message.getcId(), $$Lambda$a$b$XsV7taWii9vX_pbQm3x6W4d5fKo.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chatthread.c.a$c */
    public static class C35114c implements IGetDataCallback<String>, AbstractC34231l, AbstractC34295j {

        /* renamed from: a */
        private final MessageInfo f90720a;

        /* renamed from: b */
        private final WeakReference<IGetDataCallback<String>> f90721b;

        /* renamed from: c */
        private final WeakReference<C35098a> f90722c;

        /* renamed from: a */
        public void onSuccess(String str) {
            IGetDataCallback<String> iGetDataCallback = this.f90721b.get();
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(str);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            IGetDataCallback<String> iGetDataCallback = this.f90721b.get();
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        @Override // com.ss.android.lark.chat.service.AbstractC34295j
        /* renamed from: a */
        public void mo121315a(Message message) {
            C35098a aVar = this.f90722c.get();
            if (aVar != null) {
                this.f90720a.setMessage(message);
                aVar.mo129450c(this.f90720a);
            }
        }

        @Override // com.ss.android.lark.chat.service.impl.AbstractC34231l
        /* renamed from: b */
        public void mo121318b(Message message) {
            C35098a aVar = this.f90722c.get();
            if (aVar != null) {
                this.f90720a.setMessage(message);
                aVar.mo129450c(this.f90720a);
            }
        }

        public C35114c(MessageInfo messageInfo, IGetDataCallback<String> iGetDataCallback, C35098a aVar) {
            this.f90720a = messageInfo;
            this.f90721b = new WeakReference<>(iGetDataCallback);
            this.f90722c = new WeakReference<>(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC34006a m136935a(AbstractC34006a aVar) {
        if (aVar != null) {
            aVar.getMessage().setBurned(true);
        }
        return aVar;
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: g */
    public void mo129460g(String str) {
        this.f90646g.mo127105a(str, new C33395d());
    }

    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33957b
    public void onChanged(List<ChatMessageVO> list) {
        UICallbackExecutor.execute(new Runnable(list) {
            /* class com.ss.android.lark.chatthread.p1716c.$$Lambda$a$6FiSjclgSLL1XunCt3YzLOaYEt8 */
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C35098a.this.m136946c((C35098a) this.f$1);
            }
        });
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatPreviewPushHandler.IPreviewPushListener
    public void onPushPreview(final Map<String, ? extends Map<String, ? extends UrlPreviewEntity>> map) {
        CoreThreadPool.getBackgroundHandler().postDelayed(new Runnable() {
            /* class com.ss.android.lark.chatthread.p1716c.C35098a.AnonymousClass13 */

            public void run() {
                C35098a.this.f90646g.mo127124k().mo127143a(new Function1(map) {
                    /* class com.ss.android.lark.chatthread.p1716c.$$Lambda$a$13$m8HQYM6Tx4rms0g8iasw3xdc8ms */
                    public final /* synthetic */ Map f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C35098a.AnonymousClass13.m137022a(this.f$0, (AbstractC34006a) obj);
                    }
                }).mo127146b(new PreviewUpdater(map));
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ Boolean m137022a(Map map, AbstractC34006a aVar) {
                return Boolean.valueOf(map.containsKey(aVar.getId()));
            }
        }, 500);
    }

    /* renamed from: d */
    private MessageInfo m136947d(MessageInfo messageInfo) {
        String id = messageInfo.getMessage().getId();
        this.f90646g.mo127105a(id, new AbstractC34432b.AbstractC34434b(messageInfo.getMessage(), id, messageInfo) {
            /* class com.ss.android.lark.chatthread.p1716c.$$Lambda$a$JngMOvyPpxgjF403v8YAjiWaQcY */
            public final /* synthetic */ Message f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ MessageInfo f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.ss.android.lark.chatbase.p1688b.AbstractC34432b.AbstractC34434b
            public final Object doUpdate(Object obj) {
                return C35098a.this.m136933a((C35098a) this.f$1, (Message) this.f$2, (String) this.f$3, (MessageInfo) ((AbstractC34006a) obj));
            }
        });
        return null;
    }

    /* renamed from: h */
    private boolean m136950h(String str) {
        MessageInfo messageInfo = this.f90662w;
        if (messageInfo != null) {
            return C26325y.m95335a(messageInfo.getMessage().getId(), str);
        }
        return false;
    }

    /* renamed from: b */
    private void m136943b(List<MessageInfo> list) {
        boolean z;
        Chat chat = this.f90643d;
        if (chat == null || !chat.isSuper()) {
            z = false;
        } else {
            z = true;
        }
        this.f90648i.mo121101a(list, this.f90643d.getReadPosition(), z, (IGetDataCallback<C33960a>) null);
    }

    /* renamed from: e */
    private boolean m136949e(MessageInfo messageInfo) {
        Message message = messageInfo.getMessage();
        Message message2 = this.f90662w.getMessage();
        String id = message.getId();
        if (!message2.getChatId().equals(message.getChatId()) || (!message2.getId().equals(message.getRootId()) && !message2.getId().equals(id))) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a
    /* renamed from: d */
    public void mo129454d(final String str) {
        final MessageUrlPreview a = C34352r.m133224a(mo129443b(str));
        if (a != null) {
            AnonymousClass18 r1 = new IGetDataCallback<List<IMessageService.C32815a>>() {
                /* class com.ss.android.lark.chatthread.p1716c.C35098a.AnonymousClass18 */

                /* renamed from: a */
                public void onSuccess(final List<IMessageService.C32815a> list) {
                    C35098a.this.f90646g.mo127105a(str, new AbstractC34432b.AbstractC34435c<AbstractC34006a>() {
                        /* class com.ss.android.lark.chatthread.p1716c.C35098a.AnonymousClass18.C351001 */

                        /* access modifiers changed from: protected */
                        /* renamed from: a */
                        public AbstractC34006a mo122917a(AbstractC34006a aVar) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                IMessageService.C32815a aVar2 = (IMessageService.C32815a) it.next();
                                if (aVar2.mo121112a().equals(a.getMessageId()) && aVar2.mo121113b() == a.getSequenceId()) {
                                    a.setDeleted(true);
                                    break;
                                }
                            }
                            return aVar;
                        }
                    });
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    LKUIToast.show(C29990c.m110930b().mo134528a(), (int) R.string.Lark_Legacy_HidePreviewFailed);
                }
            };
            this.f90648i.mo121270c(Collections.singletonList(new IMessageService.C32815a(a.getMessageId(), a.getSequenceId())), this.f90654o.wrapAndAddGetDataCallback(r1));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatDingPushHandler.IDingPushListener
    public void onPushDingMessage(MessageInfo messageInfo) {
        if (this.f90660u.equals(messageInfo.getMessage().getChatId())) {
            this.f90646g.mo127105a(messageInfo.getMessage().getId(), new AbstractC34432b.AbstractC34434b() {
                /* class com.ss.android.lark.chatthread.p1716c.$$Lambda$a$vFSng6SjVeBZxxdSmaQgiPecRsU */

                @Override // com.ss.android.lark.chatbase.p1688b.AbstractC34432b.AbstractC34434b
                public final Object doUpdate(Object obj) {
                    return C35098a.m136934a(MessageInfo.this, (AbstractC34006a) obj);
                }
            });
        }
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a
    /* renamed from: b */
    public MessageInfo mo129443b(String str) {
        if (str != null) {
            return (MessageInfo) this.f90646g.mo127099a(str);
        }
        return null;
    }

    /* renamed from: c */
    public void mo129450c(MessageInfo messageInfo) {
        if (m136949e(messageInfo)) {
            Message message = messageInfo.getMessage();
            String id = message.getId();
            if (!this.f90647h.get()) {
                synchronized (this.f90665z) {
                    MessageInfo messageInfo2 = this.f90665z.get(id);
                    if (messageInfo2 == null || m136939a(message, messageInfo2.getMessage())) {
                        this.f90665z.put(id, messageInfo);
                    }
                }
            } else if (C34438a.m133579a(message)) {
                this.f90646g.mo127105a(message.getId(), $$Lambda$a$z8yhJnTbk7l5vJNcWr473n9uhSE.INSTANCE);
            } else {
                this.f90646g.mo127105a(message.getcId(), new AbstractC34432b.AbstractC34434b(messageInfo) {
                    /* class com.ss.android.lark.chatthread.p1716c.$$Lambda$a$KQCtkycivF264GfhrnoEwJ9vCtQ */
                    public final /* synthetic */ MessageInfo f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.lark.chatbase.p1688b.AbstractC34432b.AbstractC34434b
                    public final Object doUpdate(Object obj) {
                        return C35098a.this.m136940b((C35098a) this.f$1, (MessageInfo) ((AbstractC34006a) obj));
                    }
                });
            }
        }
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: f */
    public void mo129458f(final String str) {
        MessageInfo messageInfo = (MessageInfo) this.f90646g.mo127099a(str);
        if (messageInfo != null && messageInfo.getMessage().getType() == Message.Type.FILE) {
            Message message = messageInfo.getMessage();
            C29990c.m110930b().mo134591s().mo134680a(str, ((FileContent) messageInfo.getMessage().getContent()).getKey(), message.getSourceId(), message.getSourceType().getNumber(), (IGetDataCallback) this.f90654o.wrapAndAddCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.chatthread.p1716c.C35098a.AnonymousClass21 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    C35098a.this.mo129429a(str, FileState.DOWNLOAD, (String) null, 0);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("chat_thread", "cancel download failed:" + errorResult);
                }
            }));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33454i.AbstractC33459b
    public void onPushChat(Chat chat) {
        if (this.f90643d != null && TextUtils.equals(chat.getId(), this.f90660u)) {
            Chat chat2 = this.f90643d;
            this.f90643d = chat;
            if (chat2.isAutoTranslate() != this.f90643d.isAutoTranslate()) {
                C33103ae aeVar = this.f90636B;
                if (aeVar != null) {
                    aeVar.clearCache();
                }
                AbstractC35135g.AbstractC35136a.AbstractC35137a aVar = this.f90641b;
                if (aVar != null) {
                    aVar.mo129511b();
                }
            }
            if (chat2.getBurnLife() != this.f90643d.getBurnLife()) {
                this.f90641b.mo129505a(chat.getBurnLife());
            }
            this.f90641b.mo129506a(chat);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m136945c(IGetDataCallback iGetDataCallback) {
        C36871a c = C32821b.m126120a().mo121045c(this.f90660u);
        this.f90662w = C32848e.m126401b().mo121106b(this.f90661v);
        if (c == null || c.mo136109a() == null || c.mo136109a().getRole() != Chat.Role.MEMBER || this.f90662w == null) {
            iGetDataCallback.onError(new ErrorResult(String.format("load init data failed, chatId: %s, rootId: %s", this.f90660u, this.f90661v)));
            return;
        }
        this.f90643d = c.mo136109a();
        this.f90663x = c.mo136110b();
        this.f90645f = C32835d.m126323c().mo121202b(this.f90660u, this.f90643d.getP2pChatterId());
        if (this.f90644e == null) {
            this.f90644e = C32835d.m126323c().mo121202b(this.f90660u, this.f90653n.mo134394a());
        }
        iGetDataCallback.onSuccess(C35095c.m136924a().mo129405a(this.f90643d).mo129406a(this.f90644e).mo129404a(this.f90663x).mo129409b(this.f90645f).mo129407a(this.f90662w).mo129408a());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m136948d(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            if (list2 != null) {
                hashSet.addAll(list2);
            }
        }
        ArrayList arrayList = new ArrayList();
        if (!hashSet.isEmpty()) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                MessageInfo messageInfo = (MessageInfo) it2.next();
                Message message = messageInfo.getMessage();
                if (message.isPreMessage()) {
                    it2.remove();
                } else if (message.getType() == Message.Type.TEXT || message.getType() == Message.Type.MERGE_FORWARD || message.getType() == Message.Type.IMAGE || (message.getType() == Message.Type.POST && !((PostContent) message.getContent()).isGroupAnnouncement())) {
                    if (this.f90643d.isAutoTranslate() || C34350p.m133219b(message)) {
                        arrayList.add(messageInfo);
                    }
                }
            }
            m136943b(new ArrayList(hashSet));
            MessageResourceLoader messageResourceLoader = this.f90664y;
            if (messageResourceLoader != null) {
                messageResourceLoader.mo122895a(new ArrayList(hashSet));
            }
            if (this.f90636B != null && this.f90657r.mo134683a()) {
                this.f90636B.batchUpdateTranslateState(new ArrayList(arrayList));
            }
        }
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: b */
    public void mo129444b(IGetDataCallback<Chatter> iGetDataCallback) {
        this.f90651l.mo121190a(this.f90654o.wrapAndAddGetDataCallback(iGetDataCallback));
    }

    /* renamed from: b */
    public void mo129445b(MessageInfo messageInfo) {
        if (messageInfo != null) {
            Message message = messageInfo.getMessage();
            Message message2 = this.f90662w.getMessage();
            if (message.getChatId().equals(message2.getChatId()) && message.getRootId().equals(message2.getId())) {
                this.f90646g.mo127105a(messageInfo.getMessage().getcId(), new AbstractC34432b.AbstractC34434b() {
                    /* class com.ss.android.lark.chatthread.p1716c.$$Lambda$a$sdHJlnQcqbocE_xmFDJhpkJ0Q */

                    @Override // com.ss.android.lark.chatbase.p1688b.AbstractC34432b.AbstractC34434b
                    public final Object doUpdate(Object obj) {
                        return C35098a.m136944c(MessageInfo.this, (AbstractC34006a) obj);
                    }
                });
            }
        }
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a
    /* renamed from: c */
    public void mo129451c(String str) {
        MessageInfo b = mo129443b(str);
        Message message = b.getMessage();
        if (message.getType() == Message.Type.MEDIA) {
            MediaContent mediaContent = (MediaContent) message.getContent();
            if (!new File(mediaContent.getOriginPath()).exists()) {
                this.f90641b.mo129512c();
                return;
            }
            mediaContent.setFileState(FileState.COMPRESSING);
        }
        message.setSendStatus(SendStatus.SENDING);
        mo129450c(b);
        this.f90648i.mo121087a(message, (IGetDataCallback) this.f90654o.wrapCallback(m136931a(b, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.chatthread.p1716c.C35098a.AnonymousClass10 */

            /* renamed from: a */
            public void onSuccess(String str) {
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }
        })));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private boolean m136938a(AbstractC32919a aVar) {
        C1177w<ITopNoticeMessage<?>> a = this.f90637C.mo126857a();
        if (!(aVar instanceof RemoveTopNoticeMsgAction) || !this.f90638D || this.f90643d.isSecret() || C26325y.m95335a(a, TopNoticeMessage.f88632a.mo126894a())) {
            return false;
        }
        Object f = a.mo5927b().mo126900f();
        if (!(f instanceof Message)) {
            return false;
        }
        RemoveTopNoticeMsgAction fVar = (RemoveTopNoticeMsgAction) aVar;
        if (!fVar.mo121565a().equals(((Message) f).getId())) {
            return false;
        }
        if (fVar.mo121566b()) {
            this.f90637C.mo126861a(true);
        } else {
            this.f90637C.mo126864b(true);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ AbstractC34006a m136940b(MessageInfo messageInfo, AbstractC34006a aVar) {
        if (aVar != null) {
            return m136932a((MessageInfo) aVar, messageInfo);
        }
        return m136947d(messageInfo);
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: c */
    public void mo129452c(String str, IGetDataCallback<String> iGetDataCallback) {
        this.f90656q.mo126547a(str, (IGetDataCallback) this.f90654o.wrapAndAddCallback(iGetDataCallback));
    }

    /* renamed from: a */
    private IGetDataCallback<String> m136931a(MessageInfo messageInfo, IGetDataCallback<String> iGetDataCallback) {
        if (messageInfo.getMessage().getType() == Message.Type.MEDIA) {
            return new C35114c(messageInfo, iGetDataCallback, this);
        }
        return iGetDataCallback;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ AbstractC34006a m136944c(MessageInfo messageInfo, AbstractC34006a aVar) {
        if (aVar != null && aVar.getMessage().isPreMessage()) {
            aVar.setMessage(messageInfo.getMessage());
        }
        return aVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33454i.AbstractC33459b
    public void onPushMessage(List<MessageInfo> list, boolean z) {
        for (MessageInfo messageInfo : list) {
            if (z) {
                mo129445b(messageInfo);
            } else {
                if (messageInfo.isPreMessage()) {
                    C54948d.m213136a(messageInfo.getMessage());
                } else {
                    C54948d.m213139b(messageInfo.getMessage());
                }
                mo129450c(messageInfo);
            }
        }
    }

    /* renamed from: a */
    private MessageInfo m136932a(MessageInfo messageInfo, MessageInfo messageInfo2) {
        Message message = messageInfo2.getMessage();
        if (m136939a(message, messageInfo.getMessage())) {
            if (message.isRecalled()) {
                m136936a(messageInfo, messageInfo2.getRecallUser());
            }
            messageInfo.setMessage(message);
            messageInfo.setReactionInfoList(messageInfo2.getReactionInfoList());
            messageInfo.setTranslateInfo(messageInfo2.getTranslateInfo());
            messageInfo.setNeedToAutoTranslate(messageInfo2.isNeedToAutoTranslate());
            messageInfo.setIsTranslating(messageInfo2.isTranslating());
            messageInfo.setPin(messageInfo2.getPin());
        }
        return messageInfo;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC34006a m136934a(MessageInfo messageInfo, AbstractC34006a aVar) {
        MessageInfo messageInfo2 = (MessageInfo) aVar;
        if (messageInfo2 == null) {
            return null;
        }
        messageInfo2.getMessage().setDing(true);
        messageInfo2.setDingStatus(messageInfo.getDingStatus());
        return messageInfo2;
    }

    /* renamed from: a */
    private void m136936a(MessageInfo messageInfo, ChatChatter chatChatter) {
        Message message = messageInfo.getMessage();
        if (message.getType() == Message.Type.AUDIO && C36894a.m145605a().mo136202a(((AudioContent) message.getContent()).getLocalFilePath())) {
            C36894a.m145605a().mo136207d();
        }
        if (chatChatter != null) {
            messageInfo.setRecallUser(chatChatter);
        }
    }

    @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b
    /* renamed from: b */
    public void mo129446b(String str, int i) {
        this.f90650k.mo120992a(str, i, (IGetDataCallback<Chat>) null);
    }

    public C35098a(C35095c cVar, C35079a aVar, C33103ae aeVar) {
        AbstractC36474h b = C29990c.m110930b();
        this.f90652m = b;
        this.f90653n = b.mo134515N();
        this.f90654o = new CallbackManager();
        this.f90655p = C29990c.m110930b().mo134502A();
        this.f90642c = C29990c.m110930b().mo134587o();
        this.f90656q = ConvertOfficeToSpaceService.f88310h.mo126548a();
        this.f90657r = C29990c.m110930b().af();
        this.f90658s = C29990c.m110930b().ah();
        this.f90660u = null;
        this.f90665z = new HashMap<>();
        this.f90647h = new AtomicBoolean(false);
        this.f90638D = C29990c.m110929a().mo104184K();
        this.f90648i = C32848e.m126401b();
        this.f90649j = new SerialExecutor(CoreThreadPool.getDefault().getSingleScheduledThreadPool("chat-thread-model2"));
        this.f90639E = new C26134a<>(500, CoreThreadPool.getDefault().getScheduleThreadPool());
        this.f90640a = new C68289a();
        this.f90636B = aeVar;
        if (cVar != null) {
            this.f90659t = cVar;
            this.f90643d = cVar.f90625a;
            this.f90660u = cVar.f90625a.getId();
            this.f90662w = cVar.f90628d;
            this.f90661v = cVar.f90628d.getId();
            this.f90645f = cVar.f90627c;
            this.f90663x = cVar.f90629e;
        } else if (aVar != null) {
            this.f90660u = aVar.f90533a;
            this.f90661v = aVar.f90534b;
        }
        ChatThreadDataStore aVar2 = new ChatThreadDataStore(this.f90661v, this.f90649j);
        this.f90646g = aVar2;
        aVar2.mo127101a(this.f90643d.getLastMessagePosition());
        new C33955c(aVar2.mo127125l(), m136951j(), Collections.emptyList(), this);
        m136952k();
        this.f90637C = new MessageTopNoticeModel(this.f90660u);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m136937a(String str, long j, int i) {
        if (j > 0) {
            mo129429a(str, (FileState) null, (String) null, (int) ((((long) i) * 100) / j));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m136942b(String str, RichText richText, String str2, RichText richText2) {
        C34218i.m132791a().mo126555a(str, this.f90660u, null, richText, str2, richText2, false);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ AbstractC34006a m136933a(Message message, String str, MessageInfo messageInfo, AbstractC34006a aVar) {
        if (message.isRemoved()) {
            if (m136950h(str)) {
                return m136932a((MessageInfo) aVar, messageInfo);
            }
            return null;
        } else if (aVar != null) {
            return m136932a((MessageInfo) aVar, messageInfo);
        } else {
            return messageInfo;
        }
    }

    /* renamed from: b */
    public void mo129447b(String str, int i, String str2, boolean z, int[] iArr) {
        AbstractC35135g.AbstractC35136a.AbstractC35137a aVar = this.f90641b;
        if (aVar != null) {
            aVar.mo129490a(str, i, str2, z, iArr);
        }
    }
}
