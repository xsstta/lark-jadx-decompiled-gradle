package com.ss.android.lark.moments.dependency.idependency;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.PreviewEntityPair;
import com.bytedance.lark.pb.basic.v1.RichText;
import com.bytedance.lark.pb.basic.v1.UrlPreviewHangPoint;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001*J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH&J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0013H&JH\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\b2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0018H&J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010 \u001a\u00020\u0003H&J\u0016\u0010 \u001a\u00020\u00032\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H&J&\u0010$\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00132\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H&J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\bH&J\u001e\u0010(\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020)0\"H&¨\u0006+"}, d2 = {"Lcom/ss/android/lark/moments/dependency/idependency/IChatModuleDependency;", "", "addPreviewCacheObserver", "", "observer", "Lcom/ss/android/lark/moments/dependency/idependency/IChatModuleDependency$PreviewCacheObserver;", "getAllRecentReactionList", "", "", "getDisplayName", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "getRecentReactionList", "getWholeReactionList", "openChatWindowActivity", "context", "Landroid/content/Context;", "chatId", "parseRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "pbRichText", "Lcom/bytedance/lark/pb/basic/v1/RichText;", "richText", "parseUrlPreviewHangPointFromPb", "", "Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", "id", "hangPointMap", "Lcom/bytedance/lark/pb/basic/v1/UrlPreviewHangPoint;", "pbPreviewEntities", "Lcom/bytedance/lark/pb/basic/v1/PreviewEntityPair;", "removePreviewCacheObserver", "syncReactionOrder", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "transformRichTextByPreview", "previews", "updateLocalOrder", "reactionKey", "updateRecentEmojiOrder", "", "PreviewCacheObserver", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.b.a.e */
public interface IChatModuleDependency {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032 \u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0018\u00010\u0005H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/moments/dependency/idependency/IChatModuleDependency$PreviewCacheObserver;", "", "onCacheChanged", "", "updateMaps", "", "", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.b.a.e$a */
    public interface PreviewCacheObserver {
        /* renamed from: a */
        void mo165894a(Map<String, ? extends Map<String, ? extends UrlPreviewEntity>> map);
    }

    /* renamed from: a */
    RichText mo144694a(com.ss.android.lark.widget.richtext.RichText richText);

    /* renamed from: a */
    com.ss.android.lark.widget.richtext.RichText mo144695a(RichText richText);

    /* renamed from: a */
    List<String> mo144696a();

    /* renamed from: a */
    Map<String, PreviewHangPoint> mo144697a(String str, Map<String, UrlPreviewHangPoint> map, Map<String, PreviewEntityPair> map2);

    /* renamed from: a */
    void mo144698a(Context context, String str);

    /* renamed from: a */
    void mo144699a(IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo144700a(PreviewCacheObserver aVar);

    /* renamed from: a */
    void mo144701a(com.ss.android.lark.widget.richtext.RichText richText, Map<String, PreviewHangPoint> map);

    /* renamed from: a */
    void mo144702a(String str);

    /* renamed from: a */
    void mo144703a(String str, IGetDataCallback<Integer> iGetDataCallback);

    /* renamed from: b */
    List<String> mo144704b();

    /* renamed from: b */
    void mo144705b(PreviewCacheObserver aVar);

    /* renamed from: c */
    List<String> mo144706c();

    /* renamed from: d */
    void mo144707d();
}
