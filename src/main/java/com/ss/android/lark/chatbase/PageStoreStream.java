package com.ss.android.lark.chatbase;

import com.huawei.hms.actions.SearchIntents;
import com.ss.android.lark.chat.chatwindow.chat.model.C33410f;
import com.ss.android.lark.chat.core.model.AbstractExecutorC33962g;
import com.ss.android.lark.chat.core.model.C33952a;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001#B'\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0002J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0018H\u0016J \u0010\u001f\u001a\u00020 2\u0016\u0010!\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0014H\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016R,\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u00140\u0013X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u0019X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/chatbase/PageStoreStream;", "T", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "Lcom/ss/android/lark/chatbase/Stream;", "dataStore", "Lcom/ss/android/lark/chatbase/BasePageStore;", "Lcom/ss/android/lark/chat/core/model/BasePageData;", "executor", "Lcom/ss/android/lark/chat/core/model/ISerialExecutor;", "(Lcom/ss/android/lark/chatbase/BasePageStore;Lcom/ss/android/lark/chat/core/model/ISerialExecutor;)V", "getDataStore", "()Lcom/ss/android/lark/chatbase/BasePageStore;", "setDataStore", "(Lcom/ss/android/lark/chatbase/BasePageStore;)V", "getExecutor", "()Lcom/ss/android/lark/chat/core/model/ISerialExecutor;", "setExecutor", "(Lcom/ss/android/lark/chat/core/model/ISerialExecutor;)V", "mFilterList", "", "Lkotlin/Function1;", "", "mQueryKeySet", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "filter", "getDataList", "", SearchIntents.EXTRA_QUERY, "key", "reduce", "", "operation", "toList", "DataOperationPatch", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatbase.c */
public final class PageStoreStream<T extends AbstractC34006a> implements Stream<AbstractC34006a> {

    /* renamed from: a */
    private List<Function1<AbstractC34006a, Boolean>> f88911a = new ArrayList();

    /* renamed from: b */
    private HashSet<String> f88912b = new LinkedHashSet();

    /* renamed from: c */
    private AbstractC34417b<T, C33952a<T>> f88913c;

    /* renamed from: d */
    private AbstractExecutorC33962g f88914d;

    /* renamed from: b */
    public final AbstractC34417b<T, C33952a<T>> mo127145b() {
        return this.f88913c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatbase.c$b */
    static final class RunnableC34436b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PageStoreStream f88916a;

        /* renamed from: b */
        final /* synthetic */ Function1 f88917b;

        RunnableC34436b(PageStoreStream cVar, Function1 function1) {
            this.f88916a = cVar;
            this.f88917b = function1;
        }

        public final void run() {
            List<AbstractC34006a> a = this.f88916a.mo127144a();
            if (a.isEmpty()) {
                AbstractC34006a aVar = (AbstractC34006a) this.f88917b.invoke(null);
                if (aVar != null) {
                    this.f88916a.mo127145b().mo127102a(new C33410f(aVar.getMessage()), new AbstractC34417b.C34419a(aVar));
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (final AbstractC34006a aVar2 : a) {
                arrayList.add(new AbstractC34417b.AbstractC34426h<String, AbstractC34006a>(this) {
                    /* class com.ss.android.lark.chatbase.PageStoreStream.RunnableC34436b.C344371 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC34436b f88918a;

                    @Override // com.ss.android.lark.chatbase.AbstractC34417b.AbstractC34426h
                    /* renamed from: a */
                    public AbstractC34417b.AbstractC34421c<String> mo122918a() {
                        return new C33410f(aVar2.getMessage());
                    }

                    @Override // com.ss.android.lark.chatbase.AbstractC34417b.AbstractC34426h
                    /* renamed from: b */
                    public AbstractC34432b.AbstractC34434b<AbstractC34006a> mo122919b() {
                        return new DataOperationPatch(this.f88918a.f88917b);
                    }

                    {
                        this.f88918a = r1;
                    }
                });
            }
            this.f88916a.mo127145b().mo127110b((List<AbstractC34417b.AbstractC34426h<String, AbstractC34006a>>) arrayList);
        }
    }

    /* renamed from: a */
    public final List<AbstractC34006a> mo127144a() {
        List<T> list;
        if (this.f88912b.isEmpty()) {
            list = this.f88913c.mo127118g();
        } else {
            list = this.f88913c.mo127100a((Collection<String>) this.f88912b);
        }
        if (list.isEmpty()) {
            Intrinsics.checkExpressionValueIsNotNull(list, "queryList");
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        if (!this.f88911a.isEmpty()) {
            for (Function1<AbstractC34006a, Boolean> function1 : this.f88911a) {
                Iterator it = arrayList.iterator();
                Intrinsics.checkExpressionValueIsNotNull(it, "retList.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    Intrinsics.checkExpressionValueIsNotNull(next, "it.next()");
                    if (!function1.invoke((AbstractC34006a) next).booleanValue()) {
                        it.remove();
                    }
                }
            }
        }
        return arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016R!\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chatbase/PageStoreStream$DataOperationPatch;", "Lcom/ss/android/lark/chatbase/model/PageStore$IItemPatch;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "operation", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "getOperation", "()Lkotlin/jvm/functions/Function1;", "doUpdate", "existedItem", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatbase.c$a */
    private static final class DataOperationPatch implements AbstractC34432b.AbstractC34434b<AbstractC34006a> {

        /* renamed from: a */
        private final Function1<AbstractC34006a, AbstractC34006a> f88915a;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.ss.android.lark.chat.entity.message.a, ? extends com.ss.android.lark.chat.entity.message.a> */
        /* JADX WARN: Multi-variable type inference failed */
        public DataOperationPatch(Function1<? super AbstractC34006a, ? extends AbstractC34006a> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "operation");
            this.f88915a = function1;
        }

        /* renamed from: a */
        public AbstractC34006a doUpdate(AbstractC34006a aVar) {
            return this.f88915a.invoke(aVar);
        }
    }

    @Override // com.ss.android.lark.chatbase.Stream
    /* renamed from: a */
    public Stream<AbstractC34006a> mo127142a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        this.f88912b.add(str);
        return this;
    }

    @Override // com.ss.android.lark.chatbase.Stream
    /* renamed from: a */
    public Stream<AbstractC34006a> mo127143a(Function1<? super AbstractC34006a, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "filter");
        this.f88911a.add(function1);
        return this;
    }

    @Override // com.ss.android.lark.chatbase.Stream
    /* renamed from: b */
    public void mo127146b(Function1<? super AbstractC34006a, ? extends AbstractC34006a> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "operation");
        this.f88914d.execute(new RunnableC34436b(this, function1));
    }

    public PageStoreStream(AbstractC34417b<T, C33952a<T>> bVar, AbstractExecutorC33962g gVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dataStore");
        Intrinsics.checkParameterIsNotNull(gVar, "executor");
        this.f88913c = bVar;
        this.f88914d = gVar;
    }
}
