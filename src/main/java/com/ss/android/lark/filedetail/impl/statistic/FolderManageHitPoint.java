package com.ss.android.lark.filedetail.impl.statistic;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.filedetail.FileDetailModule;
import com.ss.android.lark.filedetail.impl.folder.manage.entity.FileType;
import com.ss.android.lark.filedetail.p1885a.AbstractC38197a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/statistic/FolderManageHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "Params", "Value", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.a.d */
public final class FolderManageHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f98025a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0007J*\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00040\rH\u0002J0\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004H\u0003J:\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004H\u0007J \u0010\u0015\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005J\u0010\u0010\u0016\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005J \u0010\u0017\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/statistic/FolderManageHitPoint$Companion;", "", "()V", "getSingleFileParamsMap", "", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FileType;", "suffix", "loadChat", "", "curChatId", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "sendBaseEvent", "key", "extraParams", "sendFolderManageClick", "chatId", "click", "target", "sendFolderManageMoreClick", "sendFolderManageMoreView", "sendFolderManageView", ShareHitPoint.f121868c, "", "totalItemCount", "", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo139789a(String str, String str2, String str3, Map<String, ? extends Object> map) {
            Intrinsics.checkParameterIsNotNull(str2, "click");
            Intrinsics.checkParameterIsNotNull(str3, "target");
            String str4 = str;
            if (!(str4 == null || str4.length() == 0)) {
                if (map == null) {
                    map = new HashMap();
                }
                Map<String, ? extends Object> mutableMap = MapsKt.toMutableMap(map);
                mutableMap.put("click", str2);
                mutableMap.put("target", str3);
                m150330a(str, "im_chat_file_manage_click", mutableMap);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.filedetail.impl.a.d$a$a */
        public static final class RunnableC38227a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f98026a;

            /* renamed from: b */
            final /* synthetic */ IGetDataCallback f98027b;

            RunnableC38227a(String str, IGetDataCallback iGetDataCallback) {
                this.f98026a = str;
                this.f98027b = iGetDataCallback;
            }

            public final void run() {
                Chat chat;
                String str;
                AbstractC38197a.AbstractC38199b chatDependency;
                AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
                if (a == null || (chatDependency = a.getChatDependency()) == null) {
                    chat = null;
                } else {
                    chat = chatDependency.mo139604c(this.f98026a);
                }
                AbstractC38197a a2 = FileDetailModule.f97880b.mo139564a();
                if (a2 != null) {
                    str = a2.getUserId();
                } else {
                    str = null;
                }
                if (chat == null) {
                    this.f98027b.onError(new ErrorResult("chat is null or userId is empty"));
                } else {
                    this.f98027b.onSuccess(ChatParamUtils.m133137a(chat, str, (Chatter) null, 4, (Object) null));
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¨\u0006\r"}, d2 = {"com/ss/android/lark/filedetail/impl/statistic/FolderManageHitPoint$Companion$sendBaseEvent$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "sendEvent", "params", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.filedetail.impl.a.d$a$b */
        public static final class C38228b implements IGetDataCallback<Map<String, ? extends Object>> {

            /* renamed from: a */
            final /* synthetic */ String f98028a;

            /* renamed from: b */
            final /* synthetic */ Map f98029b;

            /* renamed from: c */
            final /* synthetic */ String f98030c;

            /* renamed from: a */
            public void onSuccess(Map<String, ? extends Object> map) {
                if (map != null) {
                    m150336b(map);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                m150336b(MapsKt.mapOf(TuplesKt.to("chat_id", this.f98028a)));
            }

            /* renamed from: b */
            private final void m150336b(Map<String, ? extends Object> map) {
                JSONObject jSONObject = new JSONObject(map);
                Map map2 = this.f98029b;
                if (map2 != null) {
                    for (Map.Entry entry : map2.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                }
                Statistics.sendEvent(this.f98030c, jSONObject);
            }

            C38228b(String str, Map map, String str2) {
                this.f98028a = str;
                this.f98029b = map;
                this.f98030c = str2;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo139786a(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                m150330a(str, "im_chat_file_manage_more_view", MapsKt.mapOf(TuplesKt.to("file_type", "folder")));
            }
        }

        /* renamed from: a */
        private final void m150329a(String str, IGetDataCallback<Map<String, Object>> iGetDataCallback) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getFixedThreadPool().execute(new RunnableC38227a(str, iGetDataCallback));
        }

        @JvmStatic
        /* renamed from: a */
        public final Map<String, Object> mo139785a(FileType fileType, String str) {
            Intrinsics.checkParameterIsNotNull(fileType, ShareHitPoint.f121869d);
            HashMap hashMap = new HashMap();
            if (fileType == FileType.FOLDER) {
                str = "folder";
            } else {
                boolean z = false;
                if (str != null && str.length() > 0) {
                    z = true;
                }
                if (!z) {
                    str = "unknown";
                } else if (str == null) {
                    Intrinsics.throwNpe();
                }
            }
            hashMap.put("file_type", str);
            return hashMap;
        }

        /* renamed from: a */
        private final void m150330a(String str, String str2, Map<String, ? extends Object> map) {
            C38228b bVar = new C38228b(str, map, str2);
            Map<String, Object> b = ChatParamUtils.m133149b(str);
            if (b != null) {
                bVar.onSuccess(b);
            } else {
                m150329a(str, bVar);
            }
        }

        /* renamed from: a */
        public final void mo139787a(String str, int i, long j) {
            boolean z;
            String str2;
            String str3 = str;
            if (str3 == null || str3.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (i == 8 || i == 7) {
                    str2 = "file_search_mobile";
                } else {
                    str2 = "none";
                }
                Pair[] pairArr = {TuplesKt.to(ShareHitPoint.f121868c, str2), TuplesKt.to("total_item_count", Long.valueOf(j))};
                m150330a(str, "im_chat_file_manage_view", MapsKt.mapOf(pairArr));
            }
        }

        /* renamed from: a */
        public final void mo139788a(String str, String str2, String str3) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(str2, "click");
            Intrinsics.checkParameterIsNotNull(str3, "target");
            String str4 = str;
            if (str4 == null || str4.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Pair[] pairArr = {TuplesKt.to("file_type", "folder"), TuplesKt.to("click", str2), TuplesKt.to("target", str3)};
                m150330a(str, "im_chat_file_manage_more_click", MapsKt.mapOf(pairArr));
            }
        }

        /* renamed from: a */
        public static /* synthetic */ Map m150327a(Companion aVar, FileType fileType, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return aVar.mo139785a(fileType, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.filedetail.impl.a.d$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ void m150328a(Companion aVar, String str, String str2, String str3, Map map, int i, Object obj) {
            if ((i & 8) != 0) {
                map = null;
            }
            aVar.mo139789a(str, str2, str3, map);
        }
    }
}
