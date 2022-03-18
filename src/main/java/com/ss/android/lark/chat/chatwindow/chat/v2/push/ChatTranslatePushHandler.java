package com.ss.android.lark.chat.chatwindow.chat.v2.push;

import com.bytedance.lark.pb.im.v1.PushImageTranslationInfo;
import com.ss.android.lark.biz.im.api.AbstractC29628t;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o;
import com.ss.android.lark.chat.entity.translate.TranslateLanguageSetting;
import com.ss.android.lark.dto.translate.C36874a;
import com.ss.android.lark.p2993y.p2995b.p2996a.C59359a;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\b\u0018\u00002\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00030\u00030\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatTranslatePushHandler;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/PushHandlerManager$IPushHandler;", "listener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatTranslatePushHandler$ITranslatePushListener;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatTranslatePushHandler$ITranslatePushListener;)V", "mPushImageTranslationInfoListener", "Lcom/ss/android/lark/translate/service/impl/TranslatePush$IPushImageTranslationInfoListener;", "mPushTranslateSettingListener", "com/ss/android/lark/chat/chatwindow/chat/v2/push/ChatTranslatePushHandler$mPushTranslateSettingListener$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatTranslatePushHandler$mPushTranslateSettingListener$1;", "mPushTranslateStateListener", "Lcom/ss/android/lark/translate/service/impl/TranslatePush$IPushTranslateStateListener;", "mRefs", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "register", "", "unRegister", "ITranslatePushListener", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.m */
public final class ChatTranslatePushHandler implements C33466o.AbstractC33467a {

    /* renamed from: a */
    public WeakReference<ITranslatePushListener> f86256a;

    /* renamed from: b */
    private C59359a.AbstractC59363c f86257b = new C33465d(this);

    /* renamed from: c */
    private C59359a.AbstractC59362b f86258c = new C33463b(this);

    /* renamed from: d */
    private C33464c f86259d = new C33464c(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J]\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eH&¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatTranslatePushHandler$ITranslatePushListener;", "", "onPushImageTranslationInfo", "", "info", "Lcom/bytedance/lark/pb/im/v1/PushImageTranslationInfo;", "onPushTranslateSetting", "targetLanguage", "", "disableKeys", "", "globalDisplayConfig", "", "displayConfigMap", "", "autoTranslateMap", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;)V", "onPushTranslateState", "translateState", "Lcom/ss/android/lark/dto/translate/TranslateResult;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.m$a */
    public interface ITranslatePushListener {
        /* renamed from: a */
        void mo123111a(PushImageTranslationInfo pushImageTranslationInfo);

        /* renamed from: a */
        void mo123112a(C36874a aVar);

        /* renamed from: a */
        void mo123113a(String str, List<String> list, Integer num, Map<String, Integer> map, Map<String, Integer> map2);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: a */
    public void mo123055a() {
        C59359a.m230421a().mo201713a(this.f86257b);
        C59359a.m230421a().mo201712a(this.f86258c);
        C59359a.m230421a().mo201710a(this.f86259d);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: b */
    public void mo123056b() {
        C59359a.m230421a().mo201717b(this.f86257b);
        C59359a.m230421a().mo201716b(this.f86258c);
        C59359a.m230421a().mo201715b(this.f86259d);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00032\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\fH\u0016J\u001e\u0010\r\u001a\u00020\u00032\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\fH\u0016J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u0012"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/push/ChatTranslatePushHandler$mPushTranslateSettingListener$1", "Lcom/ss/android/lark/biz/im/api/IPushTranslateLanguageSettingListener;", "onPushDisableAutoTranslateLanguages", "", "languageKeys", "", "", "onPushGlobalAutoTranslateScope", "globalAutoTranslateScope", "", "onPushSpecificAutoTranslateScopeChanged", "displaySetting", "", "onPushSpecificDisplayChanged", "onPushTranslateDisplayRules", "translateSetting", "Lcom/ss/android/lark/chat/entity/translate/TranslateLanguageSetting;", "onPushTranslateLanguageSetting", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.m$c */
    public static final class C33464c implements AbstractC29628t {

        /* renamed from: a */
        final /* synthetic */ ChatTranslatePushHandler f86261a;

        @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
        /* renamed from: a */
        public void mo106752a(int i) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33464c(ChatTranslatePushHandler mVar) {
            this.f86261a = mVar;
        }

        @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
        /* renamed from: a */
        public void mo106753a(TranslateLanguageSetting translateLanguageSetting) {
            ITranslatePushListener aVar;
            if (translateLanguageSetting != null && (aVar = this.f86261a.f86256a.get()) != null) {
                aVar.mo123113a(translateLanguageSetting.getTargetLanguageKey(), null, null, null, null);
            }
        }

        @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
        /* renamed from: b */
        public void mo106757b(Map<String, Integer> map) {
            ITranslatePushListener aVar = this.f86261a.f86256a.get();
            if (aVar != null) {
                aVar.mo123113a(null, null, null, null, map);
            }
        }

        @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
        /* renamed from: a */
        public void mo106754a(List<String> list) {
            ITranslatePushListener aVar = this.f86261a.f86256a.get();
            if (aVar != null) {
                aVar.mo123113a(null, list, null, null, null);
            }
        }

        @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
        /* renamed from: b */
        public void mo106756b(TranslateLanguageSetting translateLanguageSetting) {
            ITranslatePushListener aVar;
            if (translateLanguageSetting != null && (aVar = this.f86261a.f86256a.get()) != null) {
                aVar.mo123113a(null, null, Integer.valueOf(translateLanguageSetting.getGlobalDisplayConfig()), translateLanguageSetting.getDisplayConfigMap(), null);
            }
        }

        @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
        /* renamed from: a */
        public void mo106755a(Map<String, Integer> map) {
            ITranslatePushListener aVar = this.f86261a.f86256a.get();
            if (aVar != null) {
                aVar.mo123113a(null, null, null, map, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "info", "Lcom/bytedance/lark/pb/im/v1/PushImageTranslationInfo;", "kotlin.jvm.PlatformType", "onPushImageTranslationInfo"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.m$b */
    static final class C33463b implements C59359a.AbstractC59362b {

        /* renamed from: a */
        final /* synthetic */ ChatTranslatePushHandler f86260a;

        C33463b(ChatTranslatePushHandler mVar) {
            this.f86260a = mVar;
        }

        @Override // com.ss.android.lark.p2993y.p2995b.p2996a.C59359a.AbstractC59362b
        /* renamed from: a */
        public final void mo123114a(PushImageTranslationInfo pushImageTranslationInfo) {
            ITranslatePushListener aVar = this.f86260a.f86256a.get();
            if (aVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(pushImageTranslationInfo, "info");
                aVar.mo123111a(pushImageTranslationInfo);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "translateResult", "Lcom/ss/android/lark/dto/translate/TranslateResult;", "kotlin.jvm.PlatformType", "onPushTranslateState"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.m$d */
    static final class C33465d implements C59359a.AbstractC59363c {

        /* renamed from: a */
        final /* synthetic */ ChatTranslatePushHandler f86262a;

        C33465d(ChatTranslatePushHandler mVar) {
            this.f86262a = mVar;
        }

        @Override // com.ss.android.lark.p2993y.p2995b.p2996a.C59359a.AbstractC59363c
        /* renamed from: a */
        public final void mo123115a(C36874a aVar) {
            ITranslatePushListener aVar2 = this.f86262a.f86256a.get();
            if (aVar2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(aVar, "translateResult");
                aVar2.mo123112a(aVar);
            }
        }
    }

    public ChatTranslatePushHandler(ITranslatePushListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f86256a = new WeakReference<>(aVar);
    }
}
