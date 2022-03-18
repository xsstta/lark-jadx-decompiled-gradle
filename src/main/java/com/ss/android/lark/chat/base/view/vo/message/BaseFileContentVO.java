package com.ss.android.lark.chat.base.view.vo.message;

import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.BaseFileContent;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\b\u0010E\u001a\u00020\rH\u0016J\u0016\u0010F\u001a\u00020\r2\f\u0010G\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\f\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\r8FX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0011\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\r8FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0013\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\r8FX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0015\u0010\u000eR\u001b\u0010\u0017\u001a\u00020\r8FX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0019\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8FX\u0002¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b\u001e\u0010\u001fR!\u0010!\u001a\u00020\"8FX\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0010\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010(\u001a\u00020\u001d8FX\u0002¢\u0006\f\n\u0004\b*\u0010\u0010\u001a\u0004\b)\u0010\u001fR\u001b\u0010+\u001a\u00020\u001d8FX\u0002¢\u0006\f\n\u0004\b-\u0010\u0010\u001a\u0004\b,\u0010\u001fR!\u0010.\u001a\u00020\"8FX\u0002¢\u0006\u0012\n\u0004\b1\u0010\u0010\u0012\u0004\b/\u0010$\u001a\u0004\b0\u0010&R\u001b\u00102\u001a\u0002038FX\u0002¢\u0006\f\n\u0004\b6\u0010\u0010\u001a\u0004\b4\u00105R!\u00107\u001a\u00020\"8FX\u0002¢\u0006\u0012\n\u0004\b:\u0010\u0010\u0012\u0004\b8\u0010$\u001a\u0004\b9\u0010&R\u001c\u0010;\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001f\"\u0004\b=\u0010>R\u001c\u0010?\u001a\u0004\u0018\u00010@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006H"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/message/BaseFileContentVO;", "T", "Lcom/ss/android/lark/chat/entity/message/content/BaseFileContent;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "content", "(Lcom/ss/android/lark/chat/entity/message/content/BaseFileContent;)V", "fileDeletedStatus", "Lcom/ss/android/lark/chat/entity/message/Message$FileDeletedStatus;", "getFileDeletedStatus", "()Lcom/ss/android/lark/chat/entity/message/Message$FileDeletedStatus;", "setFileDeletedStatus", "(Lcom/ss/android/lark/chat/entity/message/Message$FileDeletedStatus;)V", "isFromDrive", "", "()Z", "isFromDrive$delegate", "Lkotlin/Lazy;", "isInMyNutStore", "isInMyNutStore$delegate", "isLanTrans", "isLanTrans$delegate", "isLanTransferring", "isLanTransferring$delegate", "isSender", "isSender$delegate", "isSourceFileDeleted", "setSourceFileDeleted", "(Z)V", "key", "", "getKey", "()Ljava/lang/String;", "key$delegate", "lanTransStatus", "", "lanTransStatus$annotations", "()V", "getLanTransStatus", "()I", "lanTransStatus$delegate", "name", "getName", "name$delegate", "nameSpace", "getNameSpace", "nameSpace$delegate", "saveToDrive", "saveToDrive$annotations", "getSaveToDrive", "saveToDrive$delegate", "size", "", "getSize", "()J", "size$delegate", ShareHitPoint.f121868c, "source$annotations", "getSource", "source$delegate", "sourceId", "getSourceId", "setSourceId", "(Ljava/lang/String;)V", "sourceType", "Lcom/ss/android/lark/chat/entity/message/Message$SourceType;", "getSourceType", "()Lcom/ss/android/lark/chat/entity/message/Message$SourceType;", "setSourceType", "(Lcom/ss/android/lark/chat/entity/message/Message$SourceType;)V", "canReply", "isContentSame", "diffable", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.base.view.vo.message.c */
public abstract class BaseFileContentVO<T extends BaseFileContent<T>> extends ContentVO<T> {

    /* renamed from: a */
    private final Lazy f84810a;

    /* renamed from: b */
    private final Lazy f84811b;

    /* renamed from: c */
    private final Lazy f84812c;

    /* renamed from: d */
    private final Lazy f84813d;

    /* renamed from: e */
    private final Lazy f84814e;

    /* renamed from: f */
    private final Lazy f84815f;

    /* renamed from: g */
    private final Lazy f84816g;

    /* renamed from: h */
    private final Lazy f84817h;

    /* renamed from: i */
    private final Lazy f84818i;

    /* renamed from: j */
    private final Lazy f84819j;

    /* renamed from: k */
    private final Lazy f84820k;

    /* renamed from: l */
    private final Lazy f84821l;

    /* renamed from: m */
    private boolean f84822m;

    /* renamed from: n */
    private String f84823n = "";

    /* renamed from: o */
    private Message.SourceType f84824o = Message.SourceType.TYPE_FROM_UNKONWN;

    /* renamed from: p */
    private Message.FileDeletedStatus f84825p = Message.FileDeletedStatus.NORMAL;

    /* renamed from: a */
    public final String mo121820a() {
        return (String) this.f84810a.getValue();
    }

    /* renamed from: b */
    public final String mo121825b() {
        return (String) this.f84811b.getValue();
    }

    /* renamed from: c */
    public final long mo121826c() {
        return ((Number) this.f84812c.getValue()).longValue();
    }

    /* renamed from: d */
    public final int mo121827d() {
        return ((Number) this.f84815f.getValue()).intValue();
    }

    /* renamed from: e */
    public final boolean mo121828e() {
        return ((Boolean) this.f84816g.getValue()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo121829f() {
        return ((Boolean) this.f84817h.getValue()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo121830g() {
        return ((Boolean) this.f84818i.getValue()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo121831h() {
        return ((Boolean) this.f84819j.getValue()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo121832i() {
        return ((Boolean) this.f84820k.getValue()).booleanValue();
    }

    /* renamed from: j */
    public final int mo121833j() {
        return ((Number) this.f84821l.getValue()).intValue();
    }

    /* renamed from: k */
    public final boolean mo121834k() {
        return this.f84822m;
    }

    /* renamed from: l */
    public final String mo121835l() {
        return this.f84823n;
    }

    /* renamed from: m */
    public final Message.SourceType mo121836m() {
        return this.f84824o;
    }

    /* renamed from: n */
    public final Message.FileDeletedStatus mo121837n() {
        return this.f84825p;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/chat/entity/message/content/BaseFileContent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.c$b */
    static final class C32961b extends Lambda implements Function0<Boolean> {
        final /* synthetic */ BaseFileContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32961b(BaseFileContent baseFileContent) {
            super(0);
            this.$content = baseFileContent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.$content.isInMyNutStore();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/chat/entity/message/content/BaseFileContent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.c$c */
    static final class C32962c extends Lambda implements Function0<Boolean> {
        final /* synthetic */ BaseFileContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32962c(BaseFileContent baseFileContent) {
            super(0);
            this.$content = baseFileContent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.$content.isLanTransfer();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/chat/entity/message/content/BaseFileContent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.c$d */
    static final class C32963d extends Lambda implements Function0<Boolean> {
        final /* synthetic */ BaseFileContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32963d(BaseFileContent baseFileContent) {
            super(0);
            this.$content = baseFileContent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.$content.isLanTransferring();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/chat/entity/message/content/BaseFileContent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.c$e */
    static final class C32964e extends Lambda implements Function0<Boolean> {
        final /* synthetic */ BaseFileContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32964e(BaseFileContent baseFileContent) {
            super(0);
            this.$content = baseFileContent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.$content.isSender();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/chat/entity/message/content/BaseFileContent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.c$g */
    static final class C32966g extends Lambda implements Function0<Integer> {
        final /* synthetic */ BaseFileContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32966g(BaseFileContent baseFileContent) {
            super(0);
            this.$content = baseFileContent;
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return this.$content.getLanTransStatus();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/chat/entity/message/content/BaseFileContent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.c$j */
    static final class C32969j extends Lambda implements Function0<Integer> {
        final /* synthetic */ BaseFileContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32969j(BaseFileContent baseFileContent) {
            super(0);
            this.$content = baseFileContent;
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return this.$content.getSaveToDrive();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/chat/entity/message/content/BaseFileContent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.c$k */
    static final class C32970k extends Lambda implements Function0<Long> {
        final /* synthetic */ BaseFileContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32970k(BaseFileContent baseFileContent) {
            super(0);
            this.$content = baseFileContent;
        }

        /* Return type fixed from 'long' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return this.$content.getSize();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/chat/entity/message/content/BaseFileContent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.c$l */
    static final class C32971l extends Lambda implements Function0<Integer> {
        final /* synthetic */ BaseFileContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32971l(BaseFileContent baseFileContent) {
            super(0);
            this.$content = baseFileContent;
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return this.$content.getSource();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/chat/entity/message/content/BaseFileContent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.c$f */
    static final class C32965f extends Lambda implements Function0<String> {
        final /* synthetic */ BaseFileContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32965f(BaseFileContent baseFileContent) {
            super(0);
            this.$content = baseFileContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getKey();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/chat/entity/message/content/BaseFileContent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.c$h */
    static final class C32967h extends Lambda implements Function0<String> {
        final /* synthetic */ BaseFileContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32967h(BaseFileContent baseFileContent) {
            super(0);
            this.$content = baseFileContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getName();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/chat/entity/message/content/BaseFileContent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.c$i */
    static final class C32968i extends Lambda implements Function0<String> {
        final /* synthetic */ BaseFileContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32968i(BaseFileContent baseFileContent) {
            super(0);
            this.$content = baseFileContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String nameSpace = this.$content.getNameSpace();
            if (nameSpace != null) {
                return nameSpace;
            }
            return "";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/chat/entity/message/content/BaseFileContent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.c$a */
    static final class C32960a extends Lambda implements Function0<Boolean> {
        final /* synthetic */ BaseFileContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32960a(BaseFileContent baseFileContent) {
            super(0);
            this.$content = baseFileContent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            if (this.$content.getSource() == 2) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final void mo121822a(Message.SourceType sourceType) {
        this.f84824o = sourceType;
    }

    /* renamed from: a */
    public final void mo121821a(Message.FileDeletedStatus fileDeletedStatus) {
        Intrinsics.checkParameterIsNotNull(fileDeletedStatus, "<set-?>");
        this.f84825p = fileDeletedStatus;
    }

    /* renamed from: a */
    public final void mo121823a(String str) {
        this.f84823n = str;
    }

    /* renamed from: a */
    public final void mo121824a(boolean z) {
        this.f84822m = z;
    }

    @Override // com.ss.android.lark.chat.export.vo.ContentVO
    /* renamed from: a */
    public boolean mo121780a(ContentVO<?> aVar) {
        if (!super.mo121780a(aVar) || aVar == null || !(aVar instanceof BaseFileContentVO)) {
            return false;
        }
        BaseFileContentVO cVar = (BaseFileContentVO) aVar;
        if (mo121827d() == cVar.mo121827d() && mo121828e() == cVar.mo121828e() && this.f84822m == cVar.f84822m && mo121829f() == cVar.mo121829f() && this.f84825p == cVar.f84825p && mo121830g() == cVar.mo121830g() && mo121831h() == cVar.mo121831h() && mo121833j() == cVar.mo121833j()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseFileContentVO(T t) {
        super(t);
        Intrinsics.checkParameterIsNotNull(t, "content");
        this.f84810a = LazyKt.lazy(new C32965f(t));
        this.f84811b = LazyKt.lazy(new C32967h(t));
        this.f84812c = LazyKt.lazy(new C32970k(t));
        this.f84813d = LazyKt.lazy(new C32968i(t));
        this.f84814e = LazyKt.lazy(new C32971l(t));
        this.f84815f = LazyKt.lazy(new C32969j(t));
        this.f84816g = LazyKt.lazy(new C32960a(t));
        this.f84817h = LazyKt.lazy(new C32961b(t));
        this.f84818i = LazyKt.lazy(new C32962c(t));
        this.f84819j = LazyKt.lazy(new C32964e(t));
        this.f84820k = LazyKt.lazy(new C32963d(t));
        this.f84821l = LazyKt.lazy(new C32966g(t));
    }
}
