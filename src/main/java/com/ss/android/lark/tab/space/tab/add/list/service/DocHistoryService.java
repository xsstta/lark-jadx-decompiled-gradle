package com.ss.android.lark.tab.space.tab.add.list.service;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.bytedance.lark.pb.basic.v1.Icon;
import com.bytedance.lark.pb.space.doc.v1.DocHistory;
import com.bytedance.lark.pb.space.doc.v1.GetDocsHistoryRequest;
import com.bytedance.lark.pb.space.doc.v1.GetDocsHistoryResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.doc.entity.C36837b;
import com.ss.android.lark.doc.entity.C36838c;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.sdk.SdkSender;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/list/service/DocHistoryService;", "", "()V", "loadDocsHistory", "", "count", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/doc/entity/DocHistoryResult;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.tab.add.list.a.a */
public final class DocHistoryService {

    /* renamed from: a */
    public static final DocHistoryService f136569a = new DocHistoryService();

    private DocHistoryService() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/doc/entity/DocHistoryResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.a.a$a */
    static final class C55340a<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C55340a f136570a = new C55340a();

        C55340a() {
        }

        /* renamed from: a */
        public final C36838c parse(byte[] bArr) {
            GetDocsHistoryResponse decode = GetDocsHistoryResponse.ADAPTER.decode(bArr);
            if (decode != null) {
                GetDocsHistoryResponse getDocsHistoryResponse = decode;
                C36838c cVar = new C36838c();
                Boolean bool = getDocsHistoryResponse.has_more;
                Intrinsics.checkExpressionValueIsNotNull(bool, "response.has_more");
                cVar.mo135978a(bool.booleanValue());
                cVar.mo135976a((int) getDocsHistoryResponse.total.longValue());
                ArrayList arrayList = new ArrayList();
                List<DocHistory> list = getDocsHistoryResponse.docs;
                Intrinsics.checkExpressionValueIsNotNull(list, "response.docs");
                for (T t : list) {
                    C36837b bVar = new C36837b();
                    bVar.mo135959a(t.url);
                    bVar.mo135964b(t.title);
                    bVar.mo135966c(t.creator_id);
                    bVar.mo135968d(t.editor_id);
                    Doc.Type type = t.doc_type;
                    Intrinsics.checkExpressionValueIsNotNull(type, "doc.doc_type");
                    bVar.mo135957a(DocType.forNumber(type.getValue()));
                    Doc.Type type2 = t.wiki_subtype;
                    if (type2 != null) {
                        bVar.mo135963b(DocType.forNumber(type2.getValue()));
                    }
                    Long l = t.open_time;
                    Intrinsics.checkExpressionValueIsNotNull(l, "doc.open_time");
                    bVar.mo135962b(l.longValue());
                    Long l2 = t.update_time;
                    Intrinsics.checkExpressionValueIsNotNull(l2, "doc.update_time");
                    bVar.mo135956a(l2.longValue());
                    Boolean bool2 = t.is_cross_tenant;
                    Intrinsics.checkExpressionValueIsNotNull(bool2, "doc.is_cross_tenant");
                    bVar.mo135960a(bool2.booleanValue());
                    bVar.mo135970e(t.doc_id);
                    Icon icon = t.icon;
                    if (icon != null) {
                        com.ss.android.lark.doc.entity.Icon icon2 = new com.ss.android.lark.doc.entity.Icon();
                        Icon.Type type3 = icon.type;
                        Intrinsics.checkExpressionValueIsNotNull(type3, ShareHitPoint.f121869d);
                        icon2.setType(type3.getValue());
                        icon2.setValue(icon.value);
                        bVar.mo135958a(icon2);
                    }
                    arrayList.add(bVar);
                }
                cVar.mo135977a(arrayList);
                return cVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.lark.pb.space.doc.v1.GetDocsHistoryResponse");
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m214632a(int i, IGetDataCallback<C36838c> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.asynSendRequestNonWrap(Command.GET_DOCS_HISTORY, new GetDocsHistoryRequest.C19255a().mo65706a(0L).mo65708b(Long.valueOf((long) i)), iGetDataCallback, C55340a.f136570a);
    }
}
