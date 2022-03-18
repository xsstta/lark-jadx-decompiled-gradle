package com.ss.android.lark.chat.chatwindow.chat.v2.push;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.url.v1.PushUrlPreviews;
import com.bytedance.lark.pb.url.v1.UrlPreviewEntries;
import com.bytedance.lark.pb.url.v1.UrlPreviewEntry;
import com.bytedance.lark.pb.url.v1.UrlPreviewSourceType;
import com.ss.android.lark.biz.im.api.preview.IPreviewCache;
import com.ss.android.lark.chat.api.service.impl.PreviewCache;
import com.ss.android.lark.chat.api.service.impl.PreviewPush;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.chat.preview.entity.UrlPreViewEntries;
import com.ss.android.lark.chat.preview.entity.UrlPreViewEntry;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.parser.internal.ModelParserPreview;
import com.ss.android.lark.sdk.C53248k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0010\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00030\u00030\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatPreviewPushHandler;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/PushHandlerManager$IPushHandler;", "listener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatPreviewPushHandler$IPreviewPushListener;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatPreviewPushHandler$IPreviewPushListener;)V", "mPushPreviewListener", "com/ss/android/lark/chat/chatwindow/chat/v2/push/ChatPreviewPushHandler$mPushPreviewListener$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatPreviewPushHandler$mPushPreviewListener$1;", "mRefs", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "register", "", "unRegister", "Companion", "IPreviewPushListener", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.g */
public final class ChatPreviewPushHandler implements C33466o.AbstractC33467a {

    /* renamed from: b */
    public static final Companion f86230b = new Companion(null);

    /* renamed from: a */
    public WeakReference<IPreviewPushListener> f86231a;

    /* renamed from: c */
    private final C33451c f86232c = new C33451c(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032 \u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0018\u00010\u0005H&J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatPreviewPushHandler$IPreviewPushListener;", "", "onPushPreview", "", "previews", "", "", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "onPushSignUrlPreview", "entriesList", "", "Lcom/ss/android/lark/chat/preview/entity/UrlPreViewEntries;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.g$b */
    public interface IPreviewPushListener {
        void onPushPreview(Map<String, ? extends Map<String, ? extends UrlPreviewEntity>> map);

        void onPushSignUrlPreview(List<UrlPreViewEntries> list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatPreviewPushHandler$Companion;", "", "()V", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: a */
    public void mo123055a() {
        PreviewCache.f84447c.mo121325a().mo121322a(this.f86232c);
        PreviewPush.f84455b.mo121331a().mo121328a(this.f86232c);
        C53248k.m205912a().mo181697a(Command.PUSH_URL_PREVIEWS, new C33452d(this));
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: b */
    public void mo123056b() {
        PreviewCache.f84447c.mo121325a().mo121324b(this.f86232c);
        PreviewPush.f84455b.mo121331a().mo121330b(this.f86232c);
        C53248k.m205912a().mo181696a(Command.PUSH_URL_PREVIEWS);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0007j\b\u0012\u0004\u0012\u00020\u0006`\b0\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/push/ChatPreviewPushHandler$mPushPreviewListener$1", "Lcom/ss/android/lark/biz/im/api/preview/IPreviewCache$PreviewCacheObserver;", "onCacheChanged", "", "updateMaps", "", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.g$c */
    public static final class C33451c implements IPreviewCache.PreviewCacheObserver {

        /* renamed from: a */
        final /* synthetic */ ChatPreviewPushHandler f86233a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33451c(ChatPreviewPushHandler gVar) {
            this.f86233a = gVar;
        }

        @Override // com.ss.android.lark.biz.im.api.preview.IPreviewCache.PreviewCacheObserver
        public void onCacheChanged(Map<String, ? extends ArrayList<String>> map) {
            Intrinsics.checkParameterIsNotNull(map, "updateMaps");
            Map<String, Map<String, UrlPreviewEntity>> a = PreviewCache.f84447c.mo121325a().mo121320a(map);
            IPreviewPushListener bVar = this.f86233a.f86231a.get();
            if (bVar != null) {
                bVar.onPushPreview(a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/push/ChatPreviewPushHandler$register$1", "Lcom/ss/android/lark/sdk/PushDispatcher$ISdkPushListener;", "onPush", "", "request", "", "sid", "", "fromServerPipe", "", "offlinePush", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.g$d */
    public static final class C33452d implements C53248k.AbstractC53250a {

        /* renamed from: a */
        final /* synthetic */ ChatPreviewPushHandler f86234a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33452d(ChatPreviewPushHandler gVar) {
            this.f86234a = gVar;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            Log.m165389i("ChatPreviewPushHandler", "personal push url previews ");
            Map<String, UrlPreviewEntries> map = PushUrlPreviews.ADAPTER.decode(bArr).url_preview_entries;
            ArrayList arrayList = new ArrayList(map.size());
            Intrinsics.checkExpressionValueIsNotNull(map, "urlPreviewEntriesMap");
            for (Map.Entry<String, UrlPreviewEntries> entry : map.entrySet()) {
                UrlPreviewEntries value = entry.getValue();
                ArrayList arrayList2 = new ArrayList(value.entries.size());
                List<UrlPreviewEntry> list = value.entries;
                if (list != null) {
                    for (T t : list) {
                        com.bytedance.lark.pb.basic.v1.UrlPreviewEntity urlPreviewEntity = t.preview_entity;
                        if (urlPreviewEntity != null) {
                            Integer num = t.offset;
                            Intrinsics.checkExpressionValueIsNotNull(num, "urlPreviewEntry.offset");
                            int intValue = num.intValue();
                            Integer num2 = t.length;
                            Intrinsics.checkExpressionValueIsNotNull(num2, "urlPreviewEntry.length");
                            int intValue2 = num2.intValue();
                            String str2 = t.preview_id;
                            Intrinsics.checkExpressionValueIsNotNull(str2, "urlPreviewEntry.preview_id");
                            Intrinsics.checkExpressionValueIsNotNull(urlPreviewEntity, "previewEntity");
                            arrayList2.add(new UrlPreViewEntry(intValue, intValue2, str2, ModelParserPreview.m222175a(urlPreviewEntity)));
                        }
                    }
                }
                String str3 = value.source_id;
                String str4 = value.source_text_md5;
                Intrinsics.checkExpressionValueIsNotNull(str4, "urlPreViewEntriesPb.source_text_md5");
                UrlPreViewEntries.UrlPreViewSourceType.Companion aVar = UrlPreViewEntries.UrlPreViewSourceType.Companion;
                UrlPreviewSourceType urlPreviewSourceType = value.source_type;
                Intrinsics.checkExpressionValueIsNotNull(urlPreviewSourceType, "urlPreViewEntriesPb.source_type");
                arrayList.add(new UrlPreViewEntries(str3, str4, aVar.mo126375b(urlPreviewSourceType.getValue()), arrayList2));
            }
            IPreviewPushListener bVar = this.f86234a.f86231a.get();
            if (bVar != null) {
                bVar.onPushSignUrlPreview(arrayList);
            }
        }
    }

    public ChatPreviewPushHandler(IPreviewPushListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f86231a = new WeakReference<>(bVar);
    }
}
