package com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.aj;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.lark.pb.basic.v1.ImageTranslationInfo;
import com.bytedance.lark.pb.basic.v1.MessageSource;
import com.bytedance.lark.pb.basic.v1.MessageSourceType;
import com.bytedance.lark.pb.im.v1.PushImageTranslationInfo;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.api.service.AbstractC32908l;
import com.ss.android.lark.chat.api.service.p1600b.C32895j;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import com.ss.android.lark.chat.entity.translate.LanguageInfo;
import com.ss.android.lark.chat.entity.translate.TranslateInfo;
import com.ss.android.lark.chat.entity.translate.TranslateLanguageSetting;
import com.ss.android.lark.chat.export.entity.message.MessageType;
import com.ss.android.lark.chat.utils.C34350p;
import com.ss.android.lark.dependency.AbstractC36502p;
import com.ss.android.lark.dependency.AbstractC36503q;
import com.ss.android.lark.dependency.AbstractC36508v;
import com.ss.android.lark.dto.translate.C36874a;
import com.ss.android.lark.dto.translate.TranslateState;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2993y.p2995b.p2996a.C59359a;
import com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor;
import com.ss.android.lark.statistics.translate.TranslateHitPoint;
import com.ss.android.lark.util.share_preference.C57744a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.b.ae */
public class C33103ae extends AbstractC1142af implements AbstractC33134w<AbstractC34006a> {
    protected String mCurrentChatId;
    protected AbstractC33134w.AbstractC33135a mDataProvider;
    private final AbstractC36502p mFeatureConfigDependency = C29990c.m110930b().af();
    protected final AbstractC36503q mFeatureGatingDependency = C29990c.m110930b().mo134586n();
    protected final AbstractC36508v mGuideDependency = C29990c.m110930b().mo134583k();
    protected Set<String> mTranslateIdSet = new HashSet();
    protected AbstractC32908l mTranslateService = C32895j.m126597a();
    protected TranslateLanguageSetting mTranslateSetting;

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w
    public void clearCache() {
        Set<String> set = this.mTranslateIdSet;
        if (set != null) {
            set.clear();
        }
    }

    public List<LanguageInfo> getSupportedLanguages() {
        TranslateLanguageSetting translateLanguageSetting = this.mTranslateSetting;
        if (translateLanguageSetting == null) {
            return Collections.emptyList();
        }
        return translateLanguageSetting.getSupportedLanguageList();
    }

    public String getTargetTranslateKey() {
        TranslateLanguageSetting translateLanguageSetting = this.mTranslateSetting;
        if (translateLanguageSetting != null) {
            return translateLanguageSetting.getTargetLanguageKey();
        }
        return "";
    }

    public String getTargetTranslateLanguage() {
        TranslateLanguageSetting translateLanguageSetting = this.mTranslateSetting;
        if (translateLanguageSetting != null) {
            return translateLanguageSetting.getTargetLanguageName();
        }
        return "";
    }

    public int getTranslateTimes() {
        return C57744a.m224104a().getInt("key_translate_times_new", 0);
    }

    private void initTranslateSetting() {
        if (this.mFeatureConfigDependency.mo134683a()) {
            this.mTranslateService.mo121377a(new IGetDataCallback<TranslateLanguageSetting>() {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33103ae.C331041 */

                /* renamed from: a */
                public void onSuccess(TranslateLanguageSetting translateLanguageSetting) {
                    C33103ae.this.mTranslateSetting = translateLanguageSetting;
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165397w("TranslateHandler", "initTranslateSetting:" + errorResult.getDisplayMsg());
                }
            });
        }
    }

    public void completeAutoTranslateGuide() {
        if (C29990c.m110930b().mo134583k() != null) {
            C29990c.m110930b().mo134583k().mo134719a("all_auto_translation_setting", false);
        }
    }

    public C33103ae() {
    }

    public Map<String, String> getTranslateOptions() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TranslateLanguageSetting translateLanguageSetting = this.mTranslateSetting;
        if (translateLanguageSetting == null) {
            return linkedHashMap;
        }
        for (LanguageInfo languageInfo : translateLanguageSetting.getSupportedLanguageList()) {
            boolean a = C29990c.m110930b().mo134586n().mo134685a("translate.settings.v2.enable");
            String key = languageInfo.getKey();
            if (a) {
                str = languageInfo.getCurLanguageDisplayName();
            } else {
                str = languageInfo.getDisplayName();
            }
            linkedHashMap.put(key, str);
        }
        return linkedHashMap;
    }

    public boolean needShowAutoTranslateGuide() {
        TranslateLanguageSetting translateLanguageSetting;
        if (!C29990c.m110930b().mo134579g() || (((translateLanguageSetting = this.mTranslateSetting) != null && translateLanguageSetting.isGlobalAutoTranslate()) || !this.mGuideDependency.mo134722b("all_auto_translation_setting"))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.b.ae$a */
    public static class C33110a implements IGetDataCallback<C36874a> {

        /* renamed from: a */
        boolean f85269a;

        /* renamed from: b */
        private final Map<String, AbstractC34006a> f85270b;

        private C33110a(Map<String, AbstractC34006a> map) {
            this.f85270b = map;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            if (!this.f85269a) {
                TranslateHitPoint.f135913a.mo187760a(errorResult.getErrorMsg());
                this.f85269a = true;
            }
        }

        /* renamed from: a */
        public void onSuccess(C36874a aVar) {
            boolean z;
            boolean z2 = !aVar.mo136143a().isEmpty();
            for (Map.Entry<String, TranslateState> entry : aVar.mo136147b().entrySet()) {
                AbstractC34006a aVar2 = this.f85270b.get(entry.getKey());
                Message message = entry.getValue().getMessage();
                if (!(aVar2 == null || message == null)) {
                    if (C34350p.m133217a(aVar2) || !C34350p.m133219b(message)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    z2 |= z;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            Log.m165379d("TranslateHandler", "hasTranslationWork = " + z2);
            if (!this.f85269a && z2) {
                TranslateHitPoint.f135913a.mo187760a("success");
                this.f85269a = true;
            }
        }
    }

    private List<AbstractC34006a> getMessageInfoList(List<String> list) {
        return this.mDataProvider.mo122322a(list, 0);
    }

    public void fetchTranslateLanguages(IGetDataCallback<TranslateLanguageSetting> iGetDataCallback) {
        this.mTranslateService.mo121377a(iGetDataCallback);
    }

    public AbstractC34006a getMessageInfoById(String str) {
        return getMessageInfoById(str, 0);
    }

    public static C33103ae from(FragmentActivity fragmentActivity) {
        return (C33103ae) aj.m5366a(fragmentActivity).mo6005a(C33103ae.class);
    }

    public void setTranslateTimes(int i) {
        C57744a.m224104a().putInt("key_translate_times_new", i);
    }

    private boolean isTranslated(String str) {
        if (this.mTranslateIdSet.contains(str)) {
            return true;
        }
        this.mTranslateIdSet.add(str);
        return false;
    }

    /* access modifiers changed from: protected */
    public MessageSource getMessageSource(String str) {
        MessageSourceType messageSourceType;
        boolean z = !TextUtils.isEmpty(str);
        if (z) {
            messageSourceType = MessageSourceType.MERGE_FORWARD_MESSAGE;
        } else {
            messageSourceType = MessageSourceType.COMMON_MESSAGE;
        }
        if (!z) {
            str = null;
        }
        return new MessageSource(messageSourceType, str);
    }

    /* access modifiers changed from: protected */
    public Map<String, AbstractC34006a> getMessageInfoMap(List<String> list) {
        List<AbstractC34006a> messageInfoList = getMessageInfoList(list);
        HashMap hashMap = new HashMap();
        if (messageInfoList != null) {
            for (AbstractC34006a aVar : messageInfoList) {
                if (aVar != null) {
                    hashMap.put(aVar.getId(), aVar);
                }
            }
        }
        return hashMap;
    }

    public void handlePushImageTranslationInfo(PushImageTranslationInfo pushImageTranslationInfo) {
        Log.m165389i("TranslateHandler", "TranslateImage PushImageTranslationInfo: " + pushImageTranslationInfo.toString());
        if (C29990c.m110930b().mo134586n().mo134685a("translate.message.image.viewer.enable")) {
            ImageTranslationInfo imageTranslationInfo = pushImageTranslationInfo.images_translation_info;
            if (ImageTranslationInfo.EntityType.MESSAGE_ENTITY.equals(imageTranslationInfo.entity_type)) {
                Boolean bool = pushImageTranslationInfo.affect_entity_to_origin;
                if (bool == null || bool.booleanValue()) {
                    translateMsg(imageTranslationInfo.entity_id, getTargetTranslateKey());
                }
            }
        }
    }

    private void batchUpdateMergeForwardTranslate(List<AbstractC34006a> list) {
        for (AbstractC34006a aVar : list) {
            if (aVar.getMessage().getType() == Message.Type.MERGE_FORWARD && (!aVar.getMessage().isFromMe() || aVar.getMessage().isTranslatedManually())) {
                List<Message> messages = ((MergeForwardContent) aVar.getMessage().getContent()).getMessages();
                ArrayList arrayList = new ArrayList();
                for (Message message : messages) {
                    if (message.getType() == Message.Type.TEXT || message.getType() == Message.Type.POST) {
                        arrayList.add(message.getId());
                    }
                }
                if (!CollectionUtils.isEmpty(arrayList)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(aVar.getId(), aVar);
                    translate(arrayList, hashMap, false, "", getMessageSource(aVar.getId()), this.mCurrentChatId, null, new C33110a(hashMap));
                }
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w
    public void batchUpdateTranslateState(List<AbstractC34006a> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC34006a aVar : list) {
            if (!isTranslated(aVar.getId())) {
                Message message = aVar.getMessage();
                if (!message.isRemoved() && !message.isRecalled() && !message.isBurned()) {
                    if (message.getType() == Message.Type.MERGE_FORWARD) {
                        arrayList2.add(aVar);
                    } else if (message.getType() == Message.Type.TEXT || message.getType() == Message.Type.IMAGE || message.getType() == Message.Type.POST) {
                        arrayList.add(aVar);
                    }
                }
            }
        }
        if (!CollectionUtils.isEmpty(arrayList2)) {
            batchUpdateMergeForwardTranslate(arrayList2);
        }
        if (!CollectionUtils.isEmpty(arrayList)) {
            batchUpdateTranslateState(arrayList, this.mCurrentChatId, false, "", "");
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w
    public void setInitData(String str, AbstractC33134w.AbstractC33135a aVar) {
        this.mCurrentChatId = str;
        this.mDataProvider = aVar;
        initTranslateSetting();
    }

    static /* synthetic */ int lambda$completeMergeForwardTransInfo$0(Message message, Message message2) {
        return (int) (message.getUpdateTime() - message2.getUpdateTime());
    }

    public AbstractC34006a getMessageInfoById(String str, int i) {
        List<AbstractC34006a> a = this.mDataProvider.mo122322a(Collections.singletonList(str), i);
        if (a.isEmpty()) {
            return null;
        }
        return a.get(0);
    }

    public void translateMsg(String str, String str2) {
        String str3;
        Chat j;
        List<String> singletonList = Collections.singletonList(str);
        MessageSource messageSource = getMessageSource("");
        Map<String, AbstractC34006a> messageInfoMap = getMessageInfoMap(singletonList);
        AbstractC34006a aVar = messageInfoMap.get(str);
        if (aVar != null) {
            String str4 = this.mCurrentChatId;
            if (!(aVar instanceof ThreadInfo) || (j = ((ThreadInfo) aVar).mo126028j()) == null) {
                str3 = str4;
            } else {
                str3 = j.getId();
            }
            translate(singletonList, messageInfoMap, true, str2, messageSource, str3, null);
        }
    }

    public C33103ae(String str, AbstractC33134w.AbstractC33135a aVar) {
        setInitData(str, aVar);
    }

    private void handleTranslateError(Map<String, TranslateState> map, AbstractC33134w.AbstractC33136b bVar) {
        if (bVar != null) {
            int size = map.size();
            int i = 0;
            String str = "";
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (Map.Entry<String, TranslateState> entry : map.entrySet()) {
                TranslateState value = entry.getValue();
                if (value.getErrorCode() == 252) {
                    i2++;
                } else if (value.getErrorCode() == 254) {
                    i3++;
                } else if (value.getErrorCode() == 1) {
                    i4++;
                }
                MessageSource messageSource = value.getMessageSource();
                if (messageSource.source_type == MessageSourceType.MERGE_FORWARD_MESSAGE) {
                    str = messageSource.source_id;
                } else {
                    str = value.getMessageId();
                }
            }
            if (size == i2) {
                i = 252;
            } else if (size == i3) {
                i = 254;
            } else if (size == i4) {
                i = 1;
            }
            TranslateState translateState = new TranslateState();
            translateState.setMessageId(str);
            translateState.setErrorCode(i);
            bVar.mo122325a(translateState);
        }
    }

    private void completeMergeForwardTransInfo(AbstractC34006a aVar, TranslateInfo translateInfo) {
        MergeForwardContent mergeForwardContent;
        if (aVar != null && translateInfo != null && aVar.getMessage().getType() == Message.Type.MERGE_FORWARD) {
            MergeForwardContent mergeForwardContent2 = (MergeForwardContent) aVar.getMessage().getContent();
            MergeForwardContent mergeForwardContent3 = (MergeForwardContent) translateInfo.getTranslateContent();
            List<Message> messages = mergeForwardContent2.getMessages();
            List<Message> messages2 = mergeForwardContent3.getMessages();
            if (messages != null && messages2 != null && messages.size() != messages2.size()) {
                TranslateInfo translateInfo2 = aVar.getTranslateInfo();
                if (translateInfo2 != null) {
                    mergeForwardContent = (MergeForwardContent) translateInfo2.getTranslateContent();
                } else {
                    mergeForwardContent = null;
                }
                HashSet hashSet = new HashSet();
                if (mergeForwardContent3.getMessages() != null) {
                    hashSet.addAll(mergeForwardContent3.getMessages());
                }
                if (!(mergeForwardContent == null || mergeForwardContent.getMessages() == null)) {
                    hashSet.addAll(mergeForwardContent.getMessages());
                }
                if (mergeForwardContent2.getMessages() != null) {
                    hashSet.addAll(mergeForwardContent2.getMessages());
                }
                ArrayList arrayList = new ArrayList(hashSet);
                Collections.sort(arrayList, $$Lambda$ae$IDNO_nou8UuLrPcZ4hBOSSP3i28.INSTANCE);
                mergeForwardContent3.setMessages(arrayList);
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w
    public void handlePushTranslateState(C36874a aVar, AbstractC33134w.AbstractC33136b bVar) {
        if (this.mDataProvider != null) {
            Log.m165379d("TranslateHandler", "handlePushTranslateState1");
            if (!CollectionUtils.isEmpty(aVar.mo136149c())) {
                ArrayList arrayList = new ArrayList(aVar.mo136149c().keySet());
                handleTranslating(arrayList, false, getMessageInfoMap(arrayList));
                if (aVar.mo136150d() && bVar != null) {
                    handleTranslateError(aVar.mo136149c(), bVar);
                }
                Log.m165379d("TranslateHandler", "handlePushTranslateState1：" + aVar.mo136149c().size());
            }
            if (!CollectionUtils.isEmpty(aVar.mo136147b())) {
                handleTranslateResult(aVar.mo136147b(), getMessageInfoMap(new ArrayList(aVar.mo136147b().keySet())));
                if (bVar != null) {
                    bVar.mo122326a(aVar.mo136147b());
                }
                Log.m165379d("TranslateHandler", "handlePushTranslateState2：" + aVar.mo136147b().size());
            }
        }
    }

    public void handleTranslateResult(Map<String, TranslateState> map, Map<String, AbstractC34006a> map2) {
        HashSet hashSet = new HashSet();
        for (String str : new ArrayList(map.keySet())) {
            AbstractC34006a aVar = map2.get(str);
            if (aVar != null) {
                AbstractC34006a clone = aVar.clone();
                clone.setIsTranslating(false);
                TranslateState translateState = map.get(str);
                if (translateState != null && translateState.getErrorCode() <= 0) {
                    completeMergeForwardTransInfo(clone, translateState.getTranslateInfo());
                    clone.setTranslateInfo(translateState.getTranslateInfo());
                    clone.setMessage(translateState.getMessage());
                }
                if (clone.getMessage() != null) {
                    hashSet.add(clone);
                }
            }
        }
        if (!CollectionUtils.isEmpty(hashSet)) {
            if (hashSet.size() == 1) {
                Message message = ((AbstractC34006a) hashSet.iterator().next()).getMessage();
                PerfChatPerformanceMonitor.m213462a(message.getId(), MessageType.Companion.mo126090a(message.getType().getNumber()), 0, ChatBundle.ChatType.GROUP, (ErrorResult) null);
            }
            this.mDataProvider.mo122324b(hashSet);
        }
    }

    public void setAutoTranslate(final String str, boolean z, final IGetDataCallback<Boolean> iGetDataCallback) {
        this.mTranslateService.mo121381a(z, new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33103ae.C331052 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                C33103ae.this.mTranslateService.mo121378a(str, new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33103ae.C331052.C331061 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(bool);
                        }
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onError(errorResult);
                        }
                    }
                });
            }
        });
    }

    public void translate(final AbstractC34006a aVar, String str, final IGetDataCallback<Map<String, TranslateState>> iGetDataCallback) {
        PerfChatPerformanceMonitor.m213467b(aVar.getId());
        translate(aVar, str, this.mCurrentChatId, new IGetDataCallback<Map<String, TranslateState>>() {
            /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33103ae.C331073 */

            /* renamed from: a */
            public void onSuccess(Map<String, TranslateState> map) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(map);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
                Message message = aVar.getMessage();
                if (message != null) {
                    PerfChatPerformanceMonitor.m213462a(message.getId(), MessageType.Companion.mo126090a(message.getType().getNumber()), 0, ChatBundle.ChatType.GROUP, errorResult);
                }
            }
        });
    }

    public void handleTranslating(List<String> list, boolean z, Map<String, AbstractC34006a> map) {
        HashSet hashSet = new HashSet();
        for (String str : list) {
            AbstractC34006a aVar = map.get(str);
            if (!(aVar == null || aVar.getMessage() == null)) {
                aVar.setIsTranslating(z);
                hashSet.add(aVar);
            }
        }
        if (!CollectionUtils.isEmpty(hashSet)) {
            this.mDataProvider.mo122323a(new ArrayList(hashSet));
        }
    }

    public void sendTranslateHitPoint(boolean z, String str, int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (elapsedRealtime >= 1000) {
            TranslateHitPoint.f135913a.mo187763a(z, elapsedRealtime, i);
        }
        if (!TextUtils.isEmpty(str)) {
            TranslateHitPoint.f135913a.mo187765a(z, str, i);
        }
    }

    public void translateTexts(String[] strArr, String str, String str2, final IGetDataCallback<List<String>> iGetDataCallback) {
        C29990c.m110930b().mo134526Y().mo134643a(str, str2, strArr, new IGetDataCallback<List<String>>() {
            /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33103ae.C331095 */

            /* renamed from: a */
            public void onSuccess(List<String> list) {
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
        });
    }

    public void batchUpdateTranslateState(List<AbstractC34006a> list, boolean z, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC34006a aVar : list) {
            if (!isTranslated(aVar.getId())) {
                arrayList.add(aVar);
            }
        }
        batchUpdateTranslateState(arrayList, this.mCurrentChatId, z, str, str2);
    }

    public boolean handlePushTranslateSetting(String str, List<String> list, Integer num, Map<String, Integer> map) {
        boolean z;
        Log.m165379d("TranslateHandler", "onPushTranslateSetting: " + str + "/" + list + "/" + num + "/" + map);
        boolean z2 = true;
        if (str != null) {
            TranslateLanguageSetting translateLanguageSetting = this.mTranslateSetting;
            if (translateLanguageSetting != null) {
                translateLanguageSetting.setTargetLanguageKey(str);
            }
            z = true;
        } else {
            z = false;
        }
        if (list != null) {
            z = true;
        }
        if (num != null) {
            TranslateLanguageSetting translateLanguageSetting2 = this.mTranslateSetting;
            if (translateLanguageSetting2 != null) {
                translateLanguageSetting2.setGlobalDisplayConfig(num.intValue());
            }
            z = true;
        }
        if (map == null) {
            z2 = z;
        }
        if (z2) {
            clearCache();
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    public void translate(AbstractC34006a aVar, String str, String str2, IGetDataCallback<Map<String, TranslateState>> iGetDataCallback) {
        int i;
        String str3;
        TranslateLanguageSetting translateLanguageSetting;
        this.mTranslateIdSet.add(aVar.getId());
        if (aVar.getMessage().getType() == Message.Type.MERGE_FORWARD) {
            boolean b = C34350p.m133219b(aVar.getMessage());
            ArrayList arrayList = new ArrayList();
            MessageSource messageSource = getMessageSource(aVar.getId());
            MergeForwardContent mergeForwardContent = (MergeForwardContent) aVar.getMessage().getContent();
            int i2 = 0;
            if (mergeForwardContent.getMessages() != null) {
                for (Message message : mergeForwardContent.getMessages()) {
                    if ((message.getType() == Message.Type.TEXT || message.getType() == Message.Type.POST || message.getType() == Message.Type.IMAGE) && !TextUtils.equals(message.getMessageLanguage(), "not_lang")) {
                        if (!TextUtils.isEmpty(str) || (translateLanguageSetting = this.mTranslateSetting) == null) {
                            str3 = str;
                        } else {
                            str3 = translateLanguageSetting.getTargetLanguageKey();
                        }
                        if (TextUtils.equals(str3, message.getMessageLanguage())) {
                            i2++;
                        } else if (b == C34350p.m133219b(message)) {
                            arrayList.add(message.getId());
                        }
                    }
                }
            }
            if (!CollectionUtils.isEmpty(arrayList)) {
                HashMap hashMap = new HashMap();
                hashMap.put(aVar.getId(), aVar);
                translate(arrayList, hashMap, true, str, messageSource, str2, iGetDataCallback);
            } else if (iGetDataCallback != null) {
                if (i2 > 0) {
                    i = 252;
                } else {
                    i = 254;
                }
                iGetDataCallback.onError(new ErrorResult(i, aVar.getId()));
            }
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(aVar.getId(), aVar);
            translate(new ArrayList(hashMap2.keySet()), hashMap2, true, str, getMessageSource(""), str2, iGetDataCallback);
            if (aVar.getMessage().getType() == Message.Type.AUDIO && !C34350p.m133217a(aVar)) {
                TranslateHitPoint.f135913a.mo187758a();
            }
        }
    }

    private void batchUpdateTranslateState(List<AbstractC34006a> list, String str, boolean z, String str2, String str3) {
        if (!CollectionUtils.isEmpty(list) && NetworkUtils.isNetworkAvailable(C29990c.m110930b().mo134528a())) {
            MessageSource messageSource = getMessageSource(str3);
            int size = list.size();
            if (size <= 5) {
                updateTranslateState(list, str, z, str2, messageSource);
                return;
            }
            int i = size - 5;
            int i2 = 0;
            while (i2 <= i) {
                int i3 = i2 + 5;
                updateTranslateState(list.subList(i2, i3), str, z, str2, messageSource);
                i2 = i3;
            }
            if (i2 < size) {
                updateTranslateState(list.subList(i2, size), str, z, str2, messageSource);
            }
        }
    }

    private void updateTranslateState(List<AbstractC34006a> list, String str, boolean z, String str2, MessageSource messageSource) {
        HashMap hashMap = new HashMap();
        for (AbstractC34006a aVar : list) {
            String id = aVar.getMessage().getId();
            if (!TextUtils.isEmpty(id)) {
                hashMap.put(id, aVar);
            }
        }
        if (!CollectionUtils.isEmpty(hashMap)) {
            translate(new ArrayList(hashMap.keySet()), hashMap, z, str2, messageSource, str, null, new C33110a(hashMap));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w
    public boolean handlePushTranslateSettingV2(String str, List<String> list, Integer num, Map<String, Integer> map, Map<String, Integer> map2) {
        boolean z;
        Log.m165379d("TranslateHandler", "onPushTranslateSetting: " + str + "/" + list + "/" + num + "/" + map);
        boolean z2 = true;
        if (str != null) {
            TranslateLanguageSetting translateLanguageSetting = this.mTranslateSetting;
            if (translateLanguageSetting != null) {
                translateLanguageSetting.setTargetLanguageKey(str);
            }
            z = true;
        } else {
            z = false;
        }
        if (list != null) {
            z = true;
        }
        if (num != null) {
            TranslateLanguageSetting translateLanguageSetting2 = this.mTranslateSetting;
            if (translateLanguageSetting2 != null) {
                translateLanguageSetting2.setGlobalDisplayConfig(num.intValue());
            }
            z = true;
        }
        if (map != null) {
            z = true;
        }
        if (map2 == null) {
            z2 = z;
        }
        if (z2) {
            clearCache();
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    public void translate(List<String> list, Map<String, AbstractC34006a> map, boolean z, String str, MessageSource messageSource, String str2, IGetDataCallback<Map<String, TranslateState>> iGetDataCallback) {
        translate(list, map, z, str, messageSource, str2, iGetDataCallback, null);
    }

    private void translate(final List<String> list, final Map<String, AbstractC34006a> map, final boolean z, String str, MessageSource messageSource, String str2, final IGetDataCallback<Map<String, TranslateState>> iGetDataCallback, final C33110a aVar) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.mTranslateService.mo121380a(list, z, str, messageSource, str2, new IGetDataCallback<C36874a>() {
            /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33103ae.C331084 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165379d("TranslateHandler", "translate-onError:" + errorResult.getDisplayMsg());
                C33103ae.this.handleTranslating(list, false, map);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
                C33110a aVar = aVar;
                if (aVar != null) {
                    aVar.onError(errorResult);
                }
                C33103ae.this.sendTranslateHitPoint(z, errorResult.getErrorMsg(), list.size(), elapsedRealtime);
            }

            /* renamed from: a */
            public void onSuccess(C36874a aVar) {
                if (!CollectionUtils.isEmpty(aVar.mo136143a())) {
                    Log.m165379d("TranslateHandler", "translate-loading:" + aVar.mo136143a().size());
                    C33103ae.this.handleTranslating(aVar.mo136143a(), true, map);
                }
                if (!CollectionUtils.isEmpty(aVar.mo136147b())) {
                    Log.m165379d("TranslateHandler", "translate-result:" + aVar.mo136147b().size());
                    C59359a.m230421a().mo201711a(aVar);
                }
                if (!CollectionUtils.isEmpty(aVar.mo136149c())) {
                    Log.m165379d("TranslateHandler", "translate-error:" + aVar.mo136149c().size());
                    C33103ae.this.handleTranslateResult(aVar.mo136149c(), map);
                }
                C33103ae.this.sendTranslateHitPoint(z, "", list.size(), elapsedRealtime);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(aVar.mo136147b());
                }
                C33110a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.onSuccess(aVar);
                }
            }
        });
    }
}
