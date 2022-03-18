package com.ss.android.lark.integrator.moments.dependency;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.PreviewEntityPair;
import com.bytedance.lark.pb.basic.v1.RichText;
import com.bytedance.lark.pb.basic.v1.UrlPreviewHangPoint;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.biz.im.api.preview.IPreviewCache;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.moments.dependency.idependency.IChatModuleDependency;
import com.ss.android.lark.utils.ApiUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u0016\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017H\u0016JH\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\f2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020 \u0018\u00010\u001c2\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\"\u0018\u00010\u001cH\u0016J\u0010\u0010#\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\bH\u0016J\u0016\u0010$\u001a\u00020\b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H\u0016J&\u0010(\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00172\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0016J\u0010\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\fH\u0016J\u001e\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020\f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020-0&H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/lark/integrator/moments/dependency/MomentsChatModule;", "Lcom/ss/android/lark/moments/dependency/idependency/IChatModuleDependency;", "()V", "mPushPreviewObserverMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ss/android/lark/moments/dependency/idependency/IChatModuleDependency$PreviewCacheObserver;", "Lcom/ss/android/lark/biz/im/api/preview/IPreviewCache$PreviewCacheObserver;", "addPreviewCacheObserver", "", "observer", "getAllRecentReactionList", "", "", "getDisplayName", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "getRecentReactionList", "getWholeReactionList", "openChatWindowActivity", "context", "Landroid/content/Context;", "chatId", "parseRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "pbRichText", "Lcom/bytedance/lark/pb/basic/v1/RichText;", "richText", "parseUrlPreviewHangPointFromPb", "", "Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", "id", "hangPointMap", "Lcom/bytedance/lark/pb/basic/v1/UrlPreviewHangPoint;", "pbPreviewEntities", "Lcom/bytedance/lark/pb/basic/v1/PreviewEntityPair;", "removePreviewCacheObserver", "syncReactionOrder", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "transformRichTextByPreview", "previews", "updateLocalOrder", "reactionKey", "updateRecentEmojiOrder", "", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.moments.a.d */
public final class MomentsChatModule implements IChatModuleDependency {

    /* renamed from: a */
    private final ConcurrentHashMap<IChatModuleDependency.PreviewCacheObserver, IPreviewCache.PreviewCacheObserver> f101578a = new ConcurrentHashMap<>();

    @Override // com.ss.android.lark.moments.dependency.idependency.IChatModuleDependency
    /* renamed from: a */
    public void mo144702a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).updateReactionOrder(str);
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IChatModuleDependency
    /* renamed from: a */
    public void mo144703a(String str, IGetDataCallback<Integer> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).putReactionPassThrough(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IChatModuleDependency
    /* renamed from: d */
    public void mo144707d() {
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).syncReactionOrder();
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IChatModuleDependency
    /* renamed from: b */
    public List<String> mo144704b() {
        Object api = ApiUtils.getApi(IIMApi.class);
        Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(IIMApi::class.java)");
        List<String> allRecentReactionList = ((IIMApi) api).getAllRecentReactionList();
        Intrinsics.checkExpressionValueIsNotNull(allRecentReactionList, "ApiUtils.getApi(IIMApi::…va).allRecentReactionList");
        return allRecentReactionList;
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IChatModuleDependency
    /* renamed from: c */
    public List<String> mo144706c() {
        Object api = ApiUtils.getApi(IIMApi.class);
        Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(IIMApi::class.java)");
        List<String> wholeReactionList = ((IIMApi) api).getWholeReactionList();
        Intrinsics.checkExpressionValueIsNotNull(wholeReactionList, "ApiUtils.getApi(IIMApi::…s.java).wholeReactionList");
        return wholeReactionList;
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IChatModuleDependency
    /* renamed from: a */
    public List<String> mo144696a() {
        Object api = ApiUtils.getApi(IIMApi.class);
        Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(IIMApi::class.java)");
        List<String> recentReactionList = ((IIMApi) api).getRecentReactionList();
        Intrinsics.checkExpressionValueIsNotNull(recentReactionList, "ApiUtils.getApi(IIMApi::….java).recentReactionList");
        return recentReactionList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0007j\b\u0012\u0004\u0012\u00020\u0006`\b0\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/integrator/moments/dependency/MomentsChatModule$addPreviewCacheObserver$pushObserver$1", "Lcom/ss/android/lark/biz/im/api/preview/IPreviewCache$PreviewCacheObserver;", "onCacheChanged", "", "updateMaps", "", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.a.d$a */
    public static final class C39896a implements IPreviewCache.PreviewCacheObserver {

        /* renamed from: a */
        final /* synthetic */ IChatModuleDependency.PreviewCacheObserver f101579a;

        C39896a(IChatModuleDependency.PreviewCacheObserver aVar) {
            this.f101579a = aVar;
        }

        @Override // com.ss.android.lark.biz.im.api.preview.IPreviewCache.PreviewCacheObserver
        public void onCacheChanged(Map<String, ? extends ArrayList<String>> map) {
            Intrinsics.checkParameterIsNotNull(map, "updateMaps");
            this.f101579a.mo165894a(((IIMApi) ApiUtils.getApi(IIMApi.class)).getUrlPreviewsFromCache(map));
        }
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IChatModuleDependency
    /* renamed from: a */
    public RichText mo144694a(com.ss.android.lark.widget.richtext.RichText richText) {
        Intrinsics.checkParameterIsNotNull(richText, "richText");
        RichText parsePbFromRichText = ((IIMApi) ApiUtils.getApi(IIMApi.class)).parsePbFromRichText(richText);
        Intrinsics.checkExpressionValueIsNotNull(parsePbFromRichText, "ApiUtils.getApi(IIMApi::…ePbFromRichText(richText)");
        return parsePbFromRichText;
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IChatModuleDependency
    /* renamed from: a */
    public com.ss.android.lark.widget.richtext.RichText mo144695a(RichText richText) {
        Intrinsics.checkParameterIsNotNull(richText, "pbRichText");
        com.ss.android.lark.widget.richtext.RichText richText2 = ((IIMApi) ApiUtils.getApi(IIMApi.class)).getRichText(richText);
        Intrinsics.checkExpressionValueIsNotNull(richText2, "ApiUtils.getApi(IIMApi::…).getRichText(pbRichText)");
        return richText2;
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IChatModuleDependency
    /* renamed from: b */
    public void mo144705b(IChatModuleDependency.PreviewCacheObserver aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        IPreviewCache.PreviewCacheObserver aVar2 = this.f101578a.get(aVar);
        if (aVar2 != null) {
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "mPushPreviewObserverMap[observer] ?: return");
            ((IIMApi) ApiUtils.getApi(IIMApi.class)).removePreviewCacheObserver(aVar2);
            this.f101578a.remove(aVar);
        }
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IChatModuleDependency
    /* renamed from: a */
    public void mo144699a(IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).syncReactionOrder(iGetDataCallback);
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IChatModuleDependency
    /* renamed from: a */
    public void mo144700a(IChatModuleDependency.PreviewCacheObserver aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        C39896a aVar2 = new C39896a(aVar);
        this.f101578a.put(aVar, aVar2);
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).addPreviewCacheObserver(aVar2);
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IChatModuleDependency
    /* renamed from: a */
    public void mo144698a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).openChat(context, ChatBundle.m109259a().mo105927a(str).mo105923a(ChatBundle.SourceType.LINK).mo105933c("moments_anonymous").mo105929a());
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IChatModuleDependency
    /* renamed from: a */
    public void mo144701a(com.ss.android.lark.widget.richtext.RichText richText, Map<String, PreviewHangPoint> map) {
        Intrinsics.checkParameterIsNotNull(richText, "richText");
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).transformRichTextByPreview(richText, map);
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IChatModuleDependency
    /* renamed from: a */
    public Map<String, PreviewHangPoint> mo144697a(String str, Map<String, UrlPreviewHangPoint> map, Map<String, PreviewEntityPair> map2) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Map<String, PreviewHangPoint> parseUrlPreviewHangPointFromPb = ((IIMApi) ApiUtils.getApi(IIMApi.class)).parseUrlPreviewHangPointFromPb(str, map, map2);
        Intrinsics.checkExpressionValueIsNotNull(parseUrlPreviewHangPointFromPb, "ApiUtils.getApi(IIMApi::…ntMap, pbPreviewEntities)");
        return parseUrlPreviewHangPointFromPb;
    }
}
