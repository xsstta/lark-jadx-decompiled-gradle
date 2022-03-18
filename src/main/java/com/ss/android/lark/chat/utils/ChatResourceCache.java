package com.ss.android.lark.chat.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J>\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u00052#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u0001H\t0\f¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0005J3\u0010\u0014\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052#\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chat/utils/ChatResourceCache;", "", "()V", "map", "Ljava/util/concurrent/ConcurrentHashMap;", "", "clear", "", "get", "T", "resId", "default", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "put", "fetch", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.utils.f */
public final class ChatResourceCache {

    /* renamed from: a */
    public static final ChatResourceCache f88672a = new ChatResourceCache();

    /* renamed from: b */
    private static final ConcurrentHashMap<Integer, Object> f88673b = new ConcurrentHashMap<>(30);

    private ChatResourceCache() {
    }

    /* renamed from: a */
    public final void mo126919a() {
        f88673b.clear();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.utils.f$a */
    public static final class C34338a extends Lambda implements Function1<Integer, Drawable> {
        final /* synthetic */ Context $context;
        final /* synthetic */ int $resId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34338a(Context context, int i) {
            super(1);
            this.$context = context;
            this.$resId = i;
        }

        public final Drawable invoke(int i) {
            return this.$context.getDrawable(this.$resId);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Drawable invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* renamed from: a */
    public final Drawable mo126918a(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return (Drawable) mo126921b(i, new C34338a(context, i));
    }

    /* renamed from: b */
    public final <T> T mo126921b(int i, Function1<? super Integer, ? extends T> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "default");
        T t = (T) f88673b.get(Integer.valueOf(i));
        return t != null ? t : (T) function1.invoke(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo126920a(int i, Function1<? super Integer, ? extends Object> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "fetch");
        ConcurrentHashMap<Integer, Object> concurrentHashMap = f88673b;
        Integer valueOf = Integer.valueOf(i);
        if (concurrentHashMap.get(valueOf) == null) {
            concurrentHashMap.putIfAbsent(valueOf, function1.invoke(Integer.valueOf(i)));
        }
    }
}
