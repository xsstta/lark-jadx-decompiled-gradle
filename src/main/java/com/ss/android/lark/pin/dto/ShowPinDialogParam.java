package com.ss.android.lark.pin.dto;

import android.content.Context;
import com.ss.android.lark.chat.entity.message.Message;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\u0018\u00002\u00020\u0001:\u0002./Bw\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010#R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0017¨\u00060"}, d2 = {"Lcom/ss/android/lark/pin/dto/ShowPinDialogParam;", "", "context", "Landroid/content/Context;", "msg", "Lcom/ss/android/lark/chat/entity/message/Message;", "pinId", "", "pinOperatorId", "pinOperatorName", "pinTimeStamp", "", "chatId", "chatOwnerId", "selfId", "selfName", "msgSenderName", "pinActionListener", "Lcom/ss/android/lark/pin/dto/ShowPinDialogParam$IPinActionListener;", "isThread", "", "(Landroid/content/Context;Lcom/ss/android/lark/chat/entity/message/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/pin/dto/ShowPinDialogParam$IPinActionListener;Z)V", "getChatId", "()Ljava/lang/String;", "getChatOwnerId", "getContext", "()Landroid/content/Context;", "()Z", "getMsg", "()Lcom/ss/android/lark/chat/entity/message/Message;", "getMsgSenderName", "getPinActionListener", "()Lcom/ss/android/lark/pin/dto/ShowPinDialogParam$IPinActionListener;", "getPinId", "setPinId", "(Ljava/lang/String;)V", "getPinOperatorId", "setPinOperatorId", "getPinOperatorName", "setPinOperatorName", "getPinTimeStamp", "()J", "setPinTimeStamp", "(J)V", "getSelfId", "getSelfName", "Builder", "IPinActionListener", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.dto.e */
public final class ShowPinDialogParam {

    /* renamed from: a */
    private final Context f128115a;

    /* renamed from: b */
    private final Message f128116b;

    /* renamed from: c */
    private String f128117c;

    /* renamed from: d */
    private String f128118d;

    /* renamed from: e */
    private String f128119e;

    /* renamed from: f */
    private long f128120f;

    /* renamed from: g */
    private final String f128121g;

    /* renamed from: h */
    private final String f128122h;

    /* renamed from: i */
    private final String f128123i;

    /* renamed from: j */
    private final String f128124j;

    /* renamed from: k */
    private final String f128125k;

    /* renamed from: l */
    private final IPinActionListener f128126l;

    /* renamed from: m */
    private final boolean f128127m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/pin/dto/ShowPinDialogParam$IPinActionListener;", "", "onPin", "", "add", "", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.dto.e$b */
    public interface IPinActionListener {
        void onPin(boolean z);
    }

    /* renamed from: a */
    public final Context mo177286a() {
        return this.f128115a;
    }

    /* renamed from: b */
    public final Message mo177287b() {
        return this.f128116b;
    }

    /* renamed from: c */
    public final String mo177288c() {
        return this.f128117c;
    }

    /* renamed from: d */
    public final String mo177289d() {
        return this.f128118d;
    }

    /* renamed from: e */
    public final String mo177290e() {
        return this.f128119e;
    }

    /* renamed from: f */
    public final long mo177291f() {
        return this.f128120f;
    }

    /* renamed from: g */
    public final String mo177292g() {
        return this.f128121g;
    }

    /* renamed from: h */
    public final String mo177293h() {
        return this.f128122h;
    }

    /* renamed from: i */
    public final String mo177294i() {
        return this.f128123i;
    }

    /* renamed from: j */
    public final String mo177295j() {
        return this.f128124j;
    }

    /* renamed from: k */
    public final String mo177296k() {
        return this.f128125k;
    }

    /* renamed from: l */
    public final IPinActionListener mo177297l() {
        return this.f128126l;
    }

    /* renamed from: m */
    public final boolean mo177298m() {
        return this.f128127m;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/pin/dto/ShowPinDialogParam$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "chatId", "", "chatOwnerId", "getContext", "()Landroid/content/Context;", "isThread", "", "msg", "Lcom/ss/android/lark/chat/entity/message/Message;", "msgSenderName", "pinActionListener", "Lcom/ss/android/lark/pin/dto/ShowPinDialogParam$IPinActionListener;", "pinId", "pinOperatorId", "pinOperatorName", "pinTimeStamp", "", "selfId", "selfName", "build", "Lcom/ss/android/lark/pin/dto/ShowPinDialogParam;", "message", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.dto.e$a */
    public static final class Builder {

        /* renamed from: a */
        private Message f128128a;

        /* renamed from: b */
        private String f128129b;

        /* renamed from: c */
        private String f128130c;

        /* renamed from: d */
        private String f128131d;

        /* renamed from: e */
        private String f128132e;

        /* renamed from: f */
        private String f128133f;

        /* renamed from: g */
        private boolean f128134g;

        /* renamed from: h */
        private String f128135h;

        /* renamed from: i */
        private String f128136i;

        /* renamed from: j */
        private String f128137j;

        /* renamed from: k */
        private long f128138k;

        /* renamed from: l */
        private IPinActionListener f128139l;

        /* renamed from: m */
        private final Context f128140m;

        /* renamed from: a */
        public final ShowPinDialogParam mo177304a() {
            Context context = this.f128140m;
            Message message = this.f128128a;
            if (message == null) {
                Intrinsics.throwUninitializedPropertyAccessException("msg");
            }
            String str = this.f128135h;
            String str2 = this.f128136i;
            String str3 = this.f128137j;
            long j = this.f128138k;
            String str4 = this.f128129b;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatId");
            }
            String str5 = this.f128130c;
            if (str5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatOwnerId");
            }
            String str6 = this.f128131d;
            if (str6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("selfId");
            }
            String str7 = this.f128132e;
            if (str7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("selfName");
            }
            String str8 = this.f128133f;
            if (str8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("msgSenderName");
            }
            return new ShowPinDialogParam(context, message, str, str2, str3, j, str4, str5, str6, str7, str8, this.f128139l, this.f128134g, null);
        }

        /* renamed from: a */
        public final Builder mo177299a(long j) {
            this.f128138k = j;
            return this;
        }

        /* renamed from: f */
        public final Builder mo177309f(String str) {
            this.f128135h = str;
            return this;
        }

        /* renamed from: g */
        public final Builder mo177310g(String str) {
            this.f128136i = str;
            return this;
        }

        /* renamed from: h */
        public final Builder mo177311h(String str) {
            this.f128137j = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo177300a(Message message) {
            Intrinsics.checkParameterIsNotNull(message, "msg");
            this.f128128a = message;
            return this;
        }

        /* renamed from: b */
        public final Builder mo177305b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatOwnerId");
            this.f128130c = str;
            return this;
        }

        /* renamed from: c */
        public final Builder mo177306c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "selfId");
            this.f128131d = str;
            return this;
        }

        /* renamed from: d */
        public final Builder mo177307d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "selfName");
            this.f128132e = str;
            return this;
        }

        /* renamed from: e */
        public final Builder mo177308e(String str) {
            Intrinsics.checkParameterIsNotNull(str, "msgSenderName");
            this.f128133f = str;
            return this;
        }

        public Builder(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            this.f128140m = context;
        }

        /* renamed from: a */
        public final Builder mo177301a(IPinActionListener bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "pinActionListener");
            this.f128139l = bVar;
            return this;
        }

        /* renamed from: a */
        public final Builder mo177302a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            this.f128129b = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo177303a(boolean z) {
            this.f128134g = z;
            return this;
        }
    }

    private ShowPinDialogParam(Context context, Message message, String str, String str2, String str3, long j, String str4, String str5, String str6, String str7, String str8, IPinActionListener bVar, boolean z) {
        this.f128115a = context;
        this.f128116b = message;
        this.f128117c = str;
        this.f128118d = str2;
        this.f128119e = str3;
        this.f128120f = j;
        this.f128121g = str4;
        this.f128122h = str5;
        this.f128123i = str6;
        this.f128124j = str7;
        this.f128125k = str8;
        this.f128126l = bVar;
        this.f128127m = z;
    }

    public /* synthetic */ ShowPinDialogParam(Context context, Message message, String str, String str2, String str3, long j, String str4, String str5, String str6, String str7, String str8, IPinActionListener bVar, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, message, str, str2, str3, j, str4, str5, str6, str7, str8, bVar, z);
    }
}
