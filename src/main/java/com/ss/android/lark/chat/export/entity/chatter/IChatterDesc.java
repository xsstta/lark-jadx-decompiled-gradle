package com.ss.android.lark.chat.export.entity.chatter;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0002\u0006\u0007J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/export/entity/chatter/IChatterDesc;", "", "getContent", "", "getType", "Lcom/ss/android/lark/chat/export/entity/chatter/IChatterDesc$Type;", "Companion", "Type", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IChatterDesc {

    /* renamed from: a */
    public static final Companion f87951a = Companion.f87952a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/export/entity/chatter/IChatterDesc$Type;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", "DEFAULT", "BUSINESS", "LEAVE", "MEETING", "Companion", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Type {
        DEFAULT(0),
        BUSINESS(1),
        LEAVE(2),
        MEETING(3);
        
        public static final Companion Companion = new Companion(null);
        private final int number;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/export/entity/chatter/IChatterDesc$Type$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/chat/export/entity/chatter/IChatterDesc$Type;", "value", "", "valueOf", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.export.entity.chatter.IChatterDesc$Type$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final Type mo126085a(int i) {
                return m131914b(i);
            }

            /* renamed from: b */
            private final Type m131914b(int i) {
                if (i == 0) {
                    return Type.DEFAULT;
                }
                if (i == 1) {
                    return Type.BUSINESS;
                }
                if (i == 2) {
                    return Type.LEAVE;
                }
                if (i == 3) {
                    return Type.MEETING;
                }
                return null;
            }
        }

        public final int getNumber() {
            return this.number;
        }

        private Type(int i) {
            this.number = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/export/entity/chatter/IChatterDesc$Companion;", "", "()V", "default", "Lcom/ss/android/lark/chat/export/entity/chatter/IChatterDesc;", "getDefault", "()Lcom/ss/android/lark/chat/export/entity/chatter/IChatterDesc;", "create", "content", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/export/entity/chatter/IChatterDesc$Type;", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.export.entity.chatter.IChatterDesc$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f87952a;

        /* renamed from: b */
        private static final IChatterDesc f87953b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/export/entity/chatter/IChatterDesc$Companion$create$1", "Lcom/ss/android/lark/chat/export/entity/chatter/IChatterDesc;", "getContent", "", "getType", "Lcom/ss/android/lark/chat/export/entity/chatter/IChatterDesc$Type;", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.export.entity.chatter.IChatterDesc$a$a */
        public static final class C34025a implements IChatterDesc {

            /* renamed from: b */
            final /* synthetic */ String f87954b;

            /* renamed from: c */
            final /* synthetic */ Type f87955c;

            @Override // com.ss.android.lark.chat.export.entity.chatter.IChatterDesc
            public String getContent() {
                return this.f87954b;
            }

            C34025a(String str, Type type) {
                this.f87954b = str;
                this.f87955c = type;
            }
        }

        private Companion() {
        }

        /* renamed from: a */
        public final IChatterDesc mo126086a() {
            return f87953b;
        }

        static {
            Companion aVar = new Companion();
            f87952a = aVar;
            f87953b = aVar.mo126087a("", Type.DEFAULT);
        }

        /* renamed from: a */
        public final IChatterDesc mo126087a(String str, Type type) {
            Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
            return new C34025a(str, type);
        }
    }

    String getContent();
}
