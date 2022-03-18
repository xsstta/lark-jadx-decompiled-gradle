package com.ss.android.lark.todo.impl.rustadapter.service;

import com.bytedance.lark.pb.basic.v1.Doc;
import com.bytedance.lark.pb.basic.v1.Icon;
import com.bytedance.lark.pb.basic.v1.PreviewEntityPair;
import com.bytedance.lark.pb.basic.v1.UrlPreviewEntity;
import com.bytedance.lark.pb.im.v1.GetMessagePreviewsResponse;
import com.bytedance.lark.pb.space.doc.v1.GetDocByURLsResponse;
import com.bytedance.lark.pb.todo.v1.GetTodoAssigneesByChatterIdsResponse;
import com.bytedance.lark.pb.todo.v1.TodoAssignee;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.doc.entity.Icon;
import com.ss.android.lark.todo.impl.rustadapter.service.RustLog;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0002\u0010\u0007JE\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\tH@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J'\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\fH@ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/todo/impl/rustadapter/service/TodoRustCommon;", "", "()V", "getDocByURL", "Lcom/ss/android/lark/doc/entity/Doc;", "content", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessagePreview", "", "Lcom/bytedance/lark/pb/basic/v1/UrlPreviewEntity;", "previewMap", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPreviewEntityByURL", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "getTodoAssigneesByIds", "Lcom/bytedance/lark/pb/todo/v1/TodoAssignee;", "ids", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.g */
public final class TodoRustCommon {

    /* renamed from: a */
    public static final TodoRustCommon f141116a = new TodoRustCommon();

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H@"}, d2 = {"getDocByURL", "", "content", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/ss/android/lark/doc/entity/Doc;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCommon", mo239173f = "TodoRustCommon.kt", mo239174i = {0, 0, 0}, mo239175l = {151}, mo239176m = "getDocByURL", mo239177n = {"this", "content", "builder"}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.g$a */
    public static final class C57277a extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoRustCommon this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57277a(TodoRustCommon gVar, Continuation cVar) {
            super(cVar);
            this.this$0 = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194357b(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u00032&\u0010\u0006\u001a\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003\u0018\u00010\u00030\u0007H@"}, d2 = {"getMessagePreview", "", "previewMap", "", "", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/bytedance/lark/pb/basic/v1/UrlPreviewEntity;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCommon", mo239173f = "TodoRustCommon.kt", mo239174i = {0, 0, 0, 0}, mo239175l = {SmEvents.EVENT_NE_RR}, mo239176m = "getMessagePreview", mo239177n = {"this", "previewMap", "previewEntityMap", "builder"}, mo239178s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.g$c */
    public static final class C57279c extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoRustCommon this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57279c(TodoRustCommon gVar, Continuation cVar) {
            super(cVar);
            this.this$0 = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194356a((Map<String, ? extends List<String>>) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H@"}, d2 = {"getPreviewEntityByURL", "", "content", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCommon", mo239173f = "TodoRustCommon.kt", mo239174i = {0, 0, 0}, mo239175l = {78}, mo239176m = "getPreviewEntityByURL", mo239177n = {"this", "content", "builder"}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.g$e */
    public static final class C57281e extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoRustCommon this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57281e(TodoRustCommon gVar, Continuation cVar) {
            super(cVar);
            this.this$0 = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194354a((String) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00030\u0006H@"}, d2 = {"getTodoAssigneesByIds", "", "ids", "", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/bytedance/lark/pb/todo/v1/TodoAssignee;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCommon", mo239173f = "TodoRustCommon.kt", mo239174i = {0, 0, 0}, mo239175l = {47}, mo239176m = "getTodoAssigneesByIds", mo239177n = {"this", "ids", "builder"}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.g$g */
    public static final class C57283g extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TodoRustCommon this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57283g(TodoRustCommon gVar, Continuation cVar) {
            super(cVar);
            this.this$0 = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo194355a((List<String>) null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u00020\u0001J,\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J*\u0010\b\u001a\u00020\u00032 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoRustCommon$getMessagePreview$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "", "", "Lcom/bytedance/lark/pb/basic/v1/UrlPreviewEntity;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parseToString", "map", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.g$d */
    public static final class C57280d implements RustLog.ParserString<Map<String, ? extends Map<String, ? extends UrlPreviewEntity>>> {
        /* renamed from: a */
        public String mo194360a(Map<String, ? extends Map<String, UrlPreviewEntity>> map) {
            return map != null ? "EXIST" : "NULL";
        }

        C57280d() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.lark.todo.impl.rustadapter.service.RustLog.ParserString
        /* renamed from: a */
        public /* bridge */ /* synthetic */ String mo194250a(Map<String, ? extends Map<String, ? extends UrlPreviewEntity>> map) {
            return mo194360a((Map<String, ? extends Map<String, UrlPreviewEntity>>) map);
        }

        /* renamed from: a */
        public Map<String, Map<String, UrlPreviewEntity>> parse(byte[] bArr) {
            HashMap hashMap = new HashMap();
            Map<String, PreviewEntityPair> map = GetMessagePreviewsResponse.ADAPTER.decode(bArr).preview_entities;
            Intrinsics.checkExpressionValueIsNotNull(map, "pbResponse.preview_entities");
            for (Map.Entry<String, PreviewEntityPair> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue().preview_entity);
            }
            return hashMap;
        }
    }

    private TodoRustCommon() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoRustCommon$getDocByURL$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "Lcom/ss/android/lark/doc/entity/Doc;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parseToString", "", "doc", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.g$b */
    public static final class C57278b implements RustLog.ParserString<Doc> {

        /* renamed from: a */
        final /* synthetic */ String f141117a;

        /* renamed from: a */
        public String mo194250a(Doc doc) {
            return doc != null ? "EXIST" : "NULL";
        }

        C57278b(String str) {
            this.f141117a = str;
        }

        /* renamed from: a */
        public Doc parse(byte[] bArr) {
            com.bytedance.lark.pb.basic.v1.Doc doc;
            Doc doc2 = null;
            if (!(bArr == null || (doc = GetDocByURLsResponse.ADAPTER.decode(bArr).docs.get(this.f141117a)) == null)) {
                doc2 = new Doc();
                doc2.setName(doc.name);
                doc2.setAbstract(doc.abstract_);
                doc2.setOwnerName(doc.owner_name);
                doc2.setUrl(doc.url);
                Doc.Type type = doc.type;
                Intrinsics.checkExpressionValueIsNotNull(type, "pbDoc.type");
                doc2.setDocType(DocType.forNumber(type.getValue()));
                Long l = doc.create_time;
                Intrinsics.checkExpressionValueIsNotNull(l, "pbDoc.create_time");
                doc2.setCreateTime(l.longValue());
                Long l2 = doc.update_time;
                Intrinsics.checkExpressionValueIsNotNull(l2, "pbDoc.update_time");
                doc2.setUpdateTime(l2.longValue());
                doc2.setIconKey(doc.icon_key);
                doc2.setId(doc.key);
                Icon icon = new Icon();
                com.bytedance.lark.pb.basic.v1.Icon icon2 = doc.icon;
                if (icon2 != null) {
                    icon.setValue(icon2.value);
                    Icon.Type type2 = icon2.type;
                    Intrinsics.checkExpressionValueIsNotNull(type2, "it.type");
                    icon.setType(type2.getValue());
                }
                doc2.setIcon(icon);
            }
            return doc2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoRustCommon$getPreviewEntityByURL$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parseToString", "", "urlPreviewEntity", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.g$f */
    public static final class C57282f implements RustLog.ParserString<com.ss.android.lark.chat.entity.preview.UrlPreviewEntity> {

        /* renamed from: a */
        final /* synthetic */ String f141118a;

        /* renamed from: a */
        public String mo194250a(com.ss.android.lark.chat.entity.preview.UrlPreviewEntity urlPreviewEntity) {
            return urlPreviewEntity != null ? "EXIST" : "NULL";
        }

        C57282f(String str) {
            this.f141118a = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0065  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.ss.android.lark.chat.entity.preview.UrlPreviewEntity parse(byte[] r15) {
            /*
            // Method dump skipped, instructions count: 133
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCommon.C57282f.parse(byte[]):com.ss.android.lark.chat.entity.preview.UrlPreviewEntity");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J\u001a\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/service/TodoRustCommon$getTodoAssigneesByIds$result$1", "Lcom/ss/android/lark/todo/impl/rustadapter/service/RustLog$ParserString;", "", "Lcom/bytedance/lark/pb/todo/v1/TodoAssignee;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parseToString", "", "obj", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.g$h */
    public static final class C57284h implements RustLog.ParserString<List<? extends TodoAssignee>> {

        /* renamed from: a */
        final /* synthetic */ List f141119a;

        C57284h(List list) {
            this.f141119a = list;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.lark.todo.impl.rustadapter.service.RustLog.ParserString
        /* renamed from: a */
        public /* bridge */ /* synthetic */ String mo194250a(List<? extends TodoAssignee> list) {
            return mo194364a((List<TodoAssignee>) list);
        }

        /* renamed from: a */
        public String mo194364a(List<TodoAssignee> list) {
            String valueOf;
            if (list == null || (valueOf = String.valueOf(list.size())) == null) {
                return "NULL";
            }
            return valueOf;
        }

        /* renamed from: a */
        public List<TodoAssignee> parse(byte[] bArr) {
            if (bArr == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : this.f141119a) {
                List<TodoAssignee> list = GetTodoAssigneesByChatterIdsResponse.ADAPTER.decode(bArr).assignees;
                Intrinsics.checkExpressionValueIsNotNull(list, "GetTodoAssigneesByChatte…ER.decode(data).assignees");
                for (T t : list) {
                    if (Intrinsics.areEqual(str, t.assignee_id)) {
                        arrayList.add(t);
                    }
                }
            }
            return arrayList;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0096 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194354a(java.lang.String r10, kotlin.coroutines.Continuation<? super com.ss.android.lark.chat.entity.preview.UrlPreviewEntity> r11) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCommon.mo194354a(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194357b(java.lang.String r10, kotlin.coroutines.Continuation<? super com.ss.android.lark.doc.entity.Doc> r11) {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCommon.mo194357b(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194355a(java.util.List<java.lang.String> r10, kotlin.coroutines.Continuation<? super java.util.List<com.bytedance.lark.pb.todo.v1.TodoAssignee>> r11) {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCommon.mo194355a(java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo194356a(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r11, kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, com.bytedance.lark.pb.basic.v1.UrlPreviewEntity>>> r12) {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCommon.mo194356a(java.util.Map, kotlin.coroutines.c):java.lang.Object");
    }
}
