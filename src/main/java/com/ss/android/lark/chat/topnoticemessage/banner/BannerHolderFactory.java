package com.ss.android.lark.chat.topnoticemessage.banner;

import android.content.Context;
import com.ss.android.lark.chat.topnoticemessage.bannerholder.GeneralMsgBannerHolder;
import com.ss.android.lark.chat.topnoticemessage.bannerholder.ImageMsgBannerHolder;
import com.ss.android.lark.chat.topnoticemessage.bannerholder.MessageBannerViewHolder;
import com.ss.android.lark.chat.topnoticemessage.bannerholder.StickerMsgBannerHolder;
import com.ss.android.lark.chat.topnoticemessage.message.entity.AnnouncementTopNoticeMessage;
import com.ss.android.lark.chat.topnoticemessage.message.entity.GeneralTopNoticeMessage;
import com.ss.android.lark.chat.topnoticemessage.message.entity.ITopNoticeMessage;
import com.ss.android.lark.chat.topnoticemessage.message.entity.ImageTopNoticeMessage;
import com.ss.android.lark.chat.topnoticemessage.message.entity.StickerTopNoticeMessage;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J#\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\bH\u0000¢\u0006\u0002\b\u0011RW\u0010\u0005\u001aK\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b0\u0007\u00121\u0012/\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002\u0012\u0016\u0012\u0014\u0012\u0010\b\u0001\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b0\f0\t0\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R0\u0010\r\u001a$\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\b0\u0007\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\f0\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/chat/topnoticemessage/banner/BannerHolderFactory;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "constructors", "", "Ljava/lang/Class;", "Lcom/ss/android/lark/chat/topnoticemessage/message/entity/ITopNoticeMessage;", "Lkotlin/reflect/KFunction1;", "Lkotlin/ParameterName;", "name", "Lcom/ss/android/lark/chat/topnoticemessage/bannerholder/MessageBannerViewHolder;", "instanceMap", "", "getOrCreate", "noticeMessage", "getOrCreate$im_chat_chat_productionUsRelease", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.topnoticemessage.a.a */
public final class BannerHolderFactory {

    /* renamed from: a */
    private final Map<Class<? extends ITopNoticeMessage<? extends Object>>, KFunction<MessageBannerViewHolder<? extends ITopNoticeMessage<? extends Object>>>> f88592a = MapsKt.mapOf(TuplesKt.to(GeneralTopNoticeMessage.class, C34301a.INSTANCE), TuplesKt.to(AnnouncementTopNoticeMessage.class, C34302b.INSTANCE), TuplesKt.to(ImageTopNoticeMessage.class, C34303c.INSTANCE), TuplesKt.to(StickerTopNoticeMessage.class, C34304d.INSTANCE));

    /* renamed from: b */
    private final Map<Class<? extends ITopNoticeMessage<?>>, MessageBannerViewHolder<ITopNoticeMessage<?>>> f88593b = new LinkedHashMap();

    /* renamed from: c */
    private final Context f88594c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/topnoticemessage/bannerholder/GeneralMsgBannerHolder;", "p1", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", "context", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.a.a$a */
    static final /* synthetic */ class C34301a extends FunctionReference implements Function1<Context, GeneralMsgBannerHolder> {
        public static final C34301a INSTANCE = new C34301a();

        C34301a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(GeneralMsgBannerHolder.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "<init>(Landroid/content/Context;)V";
        }

        public final GeneralMsgBannerHolder invoke(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "p1");
            return new GeneralMsgBannerHolder(context);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/topnoticemessage/bannerholder/GeneralMsgBannerHolder;", "p1", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", "context", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.a.a$b */
    static final /* synthetic */ class C34302b extends FunctionReference implements Function1<Context, GeneralMsgBannerHolder> {
        public static final C34302b INSTANCE = new C34302b();

        C34302b() {
            super(1);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(GeneralMsgBannerHolder.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "<init>(Landroid/content/Context;)V";
        }

        public final GeneralMsgBannerHolder invoke(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "p1");
            return new GeneralMsgBannerHolder(context);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/topnoticemessage/bannerholder/ImageMsgBannerHolder;", "p1", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", "context", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.a.a$c */
    static final /* synthetic */ class C34303c extends FunctionReference implements Function1<Context, ImageMsgBannerHolder> {
        public static final C34303c INSTANCE = new C34303c();

        C34303c() {
            super(1);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(ImageMsgBannerHolder.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "<init>(Landroid/content/Context;)V";
        }

        public final ImageMsgBannerHolder invoke(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "p1");
            return new ImageMsgBannerHolder(context);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/topnoticemessage/bannerholder/StickerMsgBannerHolder;", "p1", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", "context", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.a.a$d */
    static final /* synthetic */ class C34304d extends FunctionReference implements Function1<Context, StickerMsgBannerHolder> {
        public static final C34304d INSTANCE = new C34304d();

        C34304d() {
            super(1);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(StickerMsgBannerHolder.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "<init>(Landroid/content/Context;)V";
        }

        public final StickerMsgBannerHolder invoke(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "p1");
            return new StickerMsgBannerHolder(context);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.util.Map<java.lang.Class<? extends com.ss.android.lark.chat.topnoticemessage.message.a.c<?>>, com.ss.android.lark.chat.topnoticemessage.b.c<com.ss.android.lark.chat.topnoticemessage.message.a.c<?>>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final MessageBannerViewHolder<ITopNoticeMessage<?>> mo126848a(ITopNoticeMessage<?> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "noticeMessage");
        Class<?> cls = cVar.getClass();
        Map<Class<? extends ITopNoticeMessage<?>>, MessageBannerViewHolder<ITopNoticeMessage<?>>> map = this.f88593b;
        Object obj = map.get(cls);
        if (obj == null) {
            KFunction<MessageBannerViewHolder<? extends ITopNoticeMessage<? extends Object>>> bVar = this.f88592a.get(cls);
            if (bVar != null) {
                obj = (MessageBannerViewHolder) ((Function1) bVar).invoke(this.f88594c);
            } else {
                obj = null;
            }
            if (obj != null) {
                map.put(cls, obj);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.topnoticemessage.bannerholder.MessageBannerViewHolder<com.ss.android.lark.chat.topnoticemessage.message.entity.ITopNoticeMessage<*>>");
            }
        }
        return (MessageBannerViewHolder) obj;
    }

    public BannerHolderFactory(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f88594c = context;
    }
}
