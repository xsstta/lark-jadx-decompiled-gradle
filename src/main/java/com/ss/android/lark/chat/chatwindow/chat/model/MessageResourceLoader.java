package com.ss.android.lark.chat.chatwindow.chat.model;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33386b;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.entity.message.content.BaseTextContent;
import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.utils.C34332b;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.keyboard.plugin.tool.voice.statistics.AppreciablePerformance;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1820e.p1821a.C36903e;
import com.ss.android.lark.widget.richtext.RichText;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\r\u0018\u0000 \u001d2\u00020\u0001:\b\u001b\u001c\u001d\u001e\u001f !\"B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0002JD\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u00072\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u00102 \u0010\u0014\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u0016\u0018\u00010\u0015J\u001c\u0010\u0017\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0014\u0010\u0018\u001a\u00020\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010J\u0006\u0010\u0019\u001a\u00020\u0012J\u0006\u0010\u001a\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader;", "", "contextDependency", "Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader$IContextDependency;", "(Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader$IContextDependency;)V", "messageLoadTaskMap", "", "", "Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader$IMessageLoadTask;", "totalMessageIds", "", "", "deduplicate", "", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "messageInfoList", "", "forceLoad", "", "taskType", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "generateTask", "handleMessages", "onCreate", "onDestroy", "AudioResourceLoadTask", "BaseMessageLoadTask", "Companion", "DocsResourceLoadTask", "IContextDependency", "IMessageLoadTask", "MiniAppResourceLoadTask", "TaskType", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class MessageResourceLoader {

    /* renamed from: b */
    public static final Companion f85987b = new Companion(null);

    /* renamed from: a */
    public final IContextDependency f85988a;

    /* renamed from: c */
    private final Map<Integer, IMessageLoadTask> f85989c = new HashMap();

    /* renamed from: d */
    private final Set<String> f85990d = new HashSet();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader$TaskType;", "", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface TaskType {
        public static final Companion Companion = Companion.f85991a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader$TaskType$Companion;", "", "()V", "AUDIO_TASK", "", "DOCS_TASK", "MINI_APP_TASK", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader$TaskType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f85991a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\n\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\rH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0012\u0010\t\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader$IContextDependency;", "", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "isBotChat", "", "()Z", "isSecretChat", "batchUpdate", "", "patchList", "", "Lcom/ss/android/lark/chatbase/BasePageStore$PatchProvider;", "", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader$e */
    public interface IContextDependency {
        /* renamed from: a */
        Context mo122906a();

        /* renamed from: a */
        void mo122907a(List<? extends AbstractC34417b.AbstractC34426h<String, AbstractC34006a>> list);

        /* renamed from: b */
        boolean mo122908b();

        /* renamed from: c */
        boolean mo122909c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J<\u0010\u0006\u001a\u00020\u00032\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2 \u0010\n\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f\u0018\u00010\u000bH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0018\u0010\u0012\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH&J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader$IMessageLoadTask;", "", "isDeduplicate", "", "()Z", "isEnabled", "forceLoad", "messageInfoList", "", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "interrupt", "isSupported", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "load", "setContextDependency", "", "dependency", "Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader$IContextDependency;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader$f */
    public interface IMessageLoadTask {
        /* renamed from: a */
        void mo122903a(IContextDependency eVar);

        /* renamed from: a */
        boolean mo122897a();

        /* renamed from: a */
        boolean mo122898a(Message.Type type);

        /* renamed from: a */
        boolean mo122899a(Set<? extends MessageInfo> set);

        /* renamed from: a */
        boolean mo122900a(Set<? extends MessageInfo> set, IGetDataCallback<Map<String, String>> iGetDataCallback);

        /* renamed from: b */
        boolean mo122904b();

        /* renamed from: c */
        boolean mo122905c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader$Companion;", "", "()V", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader$c */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J<\u0010\u0007\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2 \u0010\u000b\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r\u0018\u00010\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0016JB\u0010\u0012\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0013\u001a\u00020\u00052 \u0010\u000b\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r\u0018\u00010\fH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader$AudioResourceLoadTask;", "Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader$BaseMessageLoadTask;", "Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader;", "(Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader;)V", "isDeduplicate", "", "()Z", "forceLoad", "messageInfoList", "", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "isSupported", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "load", "forceFetch", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader$a */
    public final class AudioResourceLoadTask extends BaseMessageLoadTask {
        @Override // com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.BaseMessageLoadTask, com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.IMessageLoadTask
        /* renamed from: a */
        public boolean mo122897a() {
            return false;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader$a$a */
        public static final class RunnableC33382a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ AudioResourceLoadTask f85993a;

            /* renamed from: b */
            final /* synthetic */ boolean f85994b;

            /* renamed from: c */
            final /* synthetic */ Map f85995c;

            /* renamed from: d */
            final /* synthetic */ Map f85996d;

            /* renamed from: e */
            final /* synthetic */ IGetDataCallback f85997e;

            RunnableC33382a(AudioResourceLoadTask aVar, boolean z, Map map, Map map2, IGetDataCallback iGetDataCallback) {
                this.f85993a = aVar;
                this.f85994b = z;
                this.f85995c = map;
                this.f85996d = map2;
                this.f85997e = iGetDataCallback;
            }

            public final void run() {
                if (this.f85994b) {
                    for (Map.Entry entry : this.f85995c.entrySet()) {
                        String str = (String) entry.getValue();
                        Log.m165389i("MessageResourceLoader", "forceFetch audio download begin, key:" + ((String) entry.getKey()) + ", messageId:" + str);
                        AppreciablePerformance.f104480a.mo147940a(str);
                    }
                }
                C34332b.m133112a(this.f85995c.keySet(), MessageResourceLoader.this.f85988a.mo122908b(), new IGetDataCallback<Map<String, ? extends String>>(this) {
                    /* class com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.AudioResourceLoadTask.RunnableC33382a.C333831 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC33382a f85998a;

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f85998a = r1;
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Intrinsics.checkParameterIsNotNull(errorResult, "err");
                        Log.m165397w("MessageResourceLoader", "prepareAudioMessage error: " + errorResult.getDisplayMsg());
                        IGetDataCallback iGetDataCallback = this.f85998a.f85997e;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onError(errorResult);
                        }
                    }

                    /* renamed from: a */
                    public void onSuccess(Map<String, String> map) {
                        Intrinsics.checkParameterIsNotNull(map, "keyPathMap");
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            String value = entry.getValue();
                            Map map2 = this.f85998a.f85995c;
                            MessageInfo messageInfo = (MessageInfo) this.f85998a.f85996d.get((String) map2.get(entry.getKey()));
                            if (messageInfo != null) {
                                Content content = messageInfo.getMessage().getContent();
                                Intrinsics.checkExpressionValueIsNotNull(content, "messageInfo.getMessage()…etContent<AudioContent>()");
                                AudioContent audioContent = (AudioContent) content;
                                if (!TextUtils.isEmpty(value)) {
                                    audioContent.setFileState(AudioContent.AudioState.DONE);
                                    audioContent.setLocalFilePath(value);
                                    audioContent.setAudioWaveBytes(C36903e.m145675a().mo136253a(audioContent.getLocalFilePath()));
                                } else {
                                    audioContent.setFileState(AudioContent.AudioState.DOWNLOAD);
                                }
                                arrayList.add(messageInfo);
                            }
                        }
                        IContextDependency eVar = MessageResourceLoader.this.f85988a;
                        List<AbstractC34417b.AbstractC34426h<String, AbstractC34006a>> c = C33386b.m129362c(arrayList);
                        Intrinsics.checkExpressionValueIsNotNull(c, "MessagePatchProvidersFac…         messageInfoList)");
                        eVar.mo122907a(c);
                        Log.m165379d("MessageResourceLoader", "prepareAudioMessage2：" + Thread.currentThread() + "/" + arrayList.size());
                        IGetDataCallback iGetDataCallback = this.f85998a.f85997e;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(map);
                        }
                    }
                });
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public AudioResourceLoadTask() {
            super();
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.IMessageLoadTask
        /* renamed from: a */
        public boolean mo122898a(Message.Type type) {
            Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
            if (type == Message.Type.AUDIO) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.IMessageLoadTask
        /* renamed from: a */
        public boolean mo122899a(Set<? extends MessageInfo> set) {
            Intrinsics.checkParameterIsNotNull(set, "messageInfoList");
            return m129320a(set, false, null);
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.BaseMessageLoadTask, com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.IMessageLoadTask
        /* renamed from: a */
        public boolean mo122900a(Set<? extends MessageInfo> set, IGetDataCallback<Map<String, String>> iGetDataCallback) {
            if (set != null) {
                return m129320a(set, true, iGetDataCallback);
            }
            return false;
        }

        /* renamed from: a */
        private final boolean m129320a(Set<? extends MessageInfo> set, boolean z, IGetDataCallback<Map<String, String>> iGetDataCallback) {
            Message message;
            Log.m165389i("MessageResourceLoader", "load audio forceLoad =" + z);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (MessageInfo messageInfo : set) {
                if (messageInfo != null) {
                    message = messageInfo.getMessage();
                } else {
                    message = null;
                }
                if (message != null) {
                    Message message2 = messageInfo.getMessage();
                    Intrinsics.checkExpressionValueIsNotNull(message2, "messageInfo.getMessage()");
                    if (message2.getType() == Message.Type.AUDIO) {
                        Message message3 = messageInfo.getMessage();
                        Intrinsics.checkExpressionValueIsNotNull(message3, "messageInfo.getMessage()");
                        Content content = message3.getContent();
                        Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<AudioContent>()");
                        AudioContent audioContent = (AudioContent) content;
                        String key = audioContent.getKey();
                        if (!TextUtils.isEmpty(key) && ((z || TextUtils.isEmpty(audioContent.getLocalFilePath()) || audioContent.getAudioWaveBytes() == null) && !TextUtils.equals(message3.getId(), message3.getcId()))) {
                            String id = message3.getId();
                            hashMap.put(key, id);
                            Intrinsics.checkExpressionValueIsNotNull(id, "messageId");
                            hashMap2.put(id, messageInfo);
                        }
                    }
                }
            }
            if (CollectionUtils.isEmpty(hashMap)) {
                return false;
            }
            if (z) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    Log.m165389i("MessageResourceLoader", "forceFetch audio key:" + ((String) entry.getKey()) + ", messageId:" + ((String) entry.getValue()));
                }
            }
            Log.m165379d("MessageResourceLoader", "prepareAudioMessage1:" + hashMap.size());
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getCachedThreadPool().execute(new RunnableC33382a(this, z, hashMap, hashMap2, iGetDataCallback));
            return true;
        }
    }

    /* renamed from: a */
    public final void mo122893a() {
        this.f85989c.put(1, m129314a(1, this.f85988a));
        this.f85989c.put(2, m129314a(2, this.f85988a));
        this.f85989c.put(3, m129314a(3, this.f85988a));
        Log.m165389i("MessageResourceLoader", "onCreate");
    }

    /* renamed from: b */
    public final void mo122896b() {
        for (IMessageLoadTask fVar : this.f85989c.values()) {
            if (fVar == null) {
                Intrinsics.throwNpe();
            }
            fVar.mo122905c();
        }
        Log.m165389i("MessageResourceLoader", "onDestroy");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b¦\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J<\u0010\r\u001a\u00020\u00042\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f2 \u0010\u0011\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0013\u0018\u00010\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader$BaseMessageLoadTask;", "Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader$IMessageLoadTask;", "(Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader;)V", "isDeduplicate", "", "()Z", "isEnabled", "mContextDependency", "Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader$IContextDependency;", "getMContextDependency", "()Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader$IContextDependency;", "setMContextDependency", "(Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader$IContextDependency;)V", "forceLoad", "messageInfoList", "", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "interrupt", "setContextDependency", "", "dependency", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader$b */
    public abstract class BaseMessageLoadTask implements IMessageLoadTask {

        /* renamed from: a */
        private IContextDependency f85999a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.IMessageLoadTask
        /* renamed from: a */
        public boolean mo122897a() {
            return true;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.IMessageLoadTask
        /* renamed from: b */
        public boolean mo122904b() {
            return true;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.IMessageLoadTask
        /* renamed from: c */
        public boolean mo122905c() {
            return true;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.IMessageLoadTask
        /* renamed from: a */
        public void mo122903a(IContextDependency eVar) {
            this.f85999a = eVar;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public BaseMessageLoadTask() {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.IMessageLoadTask
        /* renamed from: a */
        public boolean mo122900a(Set<? extends MessageInfo> set, IGetDataCallback<Map<String, String>> iGetDataCallback) {
            if (set != null) {
                return mo122899a(set);
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader$DocsResourceLoadTask;", "Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader$BaseMessageLoadTask;", "Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader;", "(Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader;)V", "isSupported", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "load", "messageInfoList", "", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader$d */
    public final class DocsResourceLoadTask extends BaseMessageLoadTask {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public DocsResourceLoadTask() {
            super();
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.IMessageLoadTask
        /* renamed from: a */
        public boolean mo122898a(Message.Type type) {
            Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
            if (type == Message.Type.TEXT || type == Message.Type.POST) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.IMessageLoadTask
        /* renamed from: a */
        public boolean mo122899a(Set<? extends MessageInfo> set) {
            Intrinsics.checkParameterIsNotNull(set, "messageInfoList");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (MessageInfo messageInfo : set) {
                if (messageInfo == null) {
                    Intrinsics.throwNpe();
                }
                Message message = messageInfo.getMessage();
                Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo!!.getMessage()");
                RichText richText = null;
                BaseTextContent baseTextContent = null;
                if (message.getType() == Message.Type.TEXT) {
                    baseTextContent = (BaseTextContent) message.getContent();
                } else if (message.getType() == Message.Type.POST) {
                    baseTextContent = (BaseTextContent) message.getContent();
                }
                if (baseTextContent != null) {
                    richText = baseTextContent.getRichText();
                }
                if (!(richText == null || richText.getUrls() == null)) {
                    List<String> urls = richText.getUrls();
                    if (urls == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(urls, "richText.urls!!");
                    linkedHashSet.addAll(urls);
                }
            }
            Log.m165389i("MessageResourceLoader", "preloadDocs docs size:" + linkedHashSet.size());
            LinkedHashSet linkedHashSet2 = linkedHashSet;
            if (!CollectionUtils.isNotEmpty(linkedHashSet2)) {
                return true;
            }
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134513L().mo134674a(new ArrayList(linkedHashSet2));
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J<\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072 \u0010\t\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b\u0018\u00010\nH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader$MiniAppResourceLoadTask;", "Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader$BaseMessageLoadTask;", "Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader;", "(Lcom/ss/android/lark/chat/chatwindow/chat/model/MessageResourceLoader;)V", "forceLoad", "", "messageInfoList", "", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "isSupported", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "load", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader$g */
    public final class MiniAppResourceLoadTask extends BaseMessageLoadTask {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public MiniAppResourceLoadTask() {
            super();
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.IMessageLoadTask
        /* renamed from: a */
        public boolean mo122898a(Message.Type type) {
            Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
            if (type == Message.Type.CARD) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.IMessageLoadTask
        /* renamed from: a */
        public boolean mo122899a(Set<? extends MessageInfo> set) {
            CardContent.ExtraInfo extraInfo;
            Intrinsics.checkParameterIsNotNull(set, "messageInfoList");
            boolean z = false;
            for (MessageInfo messageInfo : set) {
                if (messageInfo == null) {
                    Intrinsics.throwNpe();
                }
                Content content = messageInfo.getMessage().getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "messageInfo!!.getMessage…getContent<CardContent>()");
                CardContent cardContent = (CardContent) content;
                if (!(cardContent == null || (extraInfo = cardContent.getExtraInfo()) == null || !extraInfo.isGadgetPreload())) {
                    z = true;
                }
            }
            Log.m165389i("MessageResourceLoader", "load mini app needPreload =" + z);
            if (z) {
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                b.mo134588p().mo134750b(MessageResourceLoader.this.f85988a.mo122906a());
            }
            return true;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.BaseMessageLoadTask, com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.IMessageLoadTask
        /* renamed from: a */
        public boolean mo122900a(Set<? extends MessageInfo> set, IGetDataCallback<Map<String, String>> iGetDataCallback) {
            if (!MessageResourceLoader.this.f85988a.mo122909c()) {
                return true;
            }
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134588p().mo134747a(MessageResourceLoader.this.f85988a.mo122906a());
            Log.m165389i("MessageResourceLoader", "load mini app");
            return true;
        }
    }

    public MessageResourceLoader(IContextDependency eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "contextDependency");
        this.f85988a = eVar;
    }

    /* renamed from: b */
    private final Set<MessageInfo> m129315b(List<? extends MessageInfo> list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MessageInfo messageInfo : list) {
            String id = messageInfo.getId();
            if (!TextUtils.isEmpty(id) && !this.f85990d.contains(id)) {
                linkedHashSet.add(messageInfo);
                Set<String> set = this.f85990d;
                Intrinsics.checkExpressionValueIsNotNull(id, "messageId");
                set.add(id);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: a */
    public final void mo122895a(List<? extends MessageInfo> list) {
        HashSet hashSet;
        Intrinsics.checkParameterIsNotNull(list, "messageInfoList");
        Set<MessageInfo> b = m129315b(list);
        for (IMessageLoadTask fVar : this.f85989c.values()) {
            if (fVar == null) {
                Intrinsics.throwNpe();
            }
            if (fVar.mo122904b()) {
                if (fVar.mo122897a()) {
                    hashSet = b;
                } else {
                    hashSet = new HashSet(list);
                }
                Log.m165379d("MessageResourceLoader", "handleMessages:" + fVar.mo122897a() + "/" + hashSet.size());
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (MessageInfo messageInfo : hashSet) {
                    Message message = messageInfo.getMessage();
                    Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
                    Message.Type type = message.getType();
                    Intrinsics.checkExpressionValueIsNotNull(type, "messageInfo.getMessage().type");
                    if (fVar.mo122898a(type)) {
                        linkedHashSet.add(messageInfo);
                    }
                }
                if (CollectionUtils.isNotEmpty(linkedHashSet)) {
                    fVar.mo122899a(linkedHashSet);
                }
            }
        }
    }

    /* renamed from: a */
    private final IMessageLoadTask m129314a(@TaskType int i, IContextDependency eVar) {
        AudioResourceLoadTask aVar = null;
        if (i == 1) {
            aVar = new AudioResourceLoadTask();
        } else if (i == 2) {
            aVar = new DocsResourceLoadTask();
        } else if (i == 3) {
            aVar = new MiniAppResourceLoadTask();
        }
        if (aVar != null) {
            aVar.mo122903a(eVar);
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo122894a(@TaskType int i, List<? extends MessageInfo> list, IGetDataCallback<Map<String, String>> iGetDataCallback) {
        HashSet hashSet;
        if (list != null) {
            hashSet = new HashSet(list);
        } else {
            hashSet = null;
        }
        IMessageLoadTask fVar = this.f85989c.get(Integer.valueOf(i));
        if (fVar != null) {
            fVar.mo122900a(hashSet, iGetDataCallback);
        }
    }
}
