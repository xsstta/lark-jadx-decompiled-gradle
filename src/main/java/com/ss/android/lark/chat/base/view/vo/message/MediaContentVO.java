package com.ss.android.lark.chat.base.view.vo.message;

import android.text.TextUtils;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.FileState;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010O\u001a\u00020$H\u0016J\u0016\u0010P\u001a\u00020$2\f\u0010Q\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00068FX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0017\u0010\bR\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u001a8FX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001f8FX\u0002¢\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b \u0010!R\u001a\u0010#\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010%\"\u0004\b&\u0010'R\u001b\u0010(\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b*\u0010\n\u001a\u0004\b)\u0010\bR\u001b\u0010+\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b,\u0010\bR\u001b\u0010.\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b0\u0010\n\u001a\u0004\b/\u0010\bR\u001d\u00101\u001a\u0004\u0018\u00010\u00068FX\u0002¢\u0006\f\n\u0004\b3\u0010\n\u001a\u0004\b2\u0010\bR\u0013\u00104\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b5\u0010\bR\u001b\u00106\u001a\u0002078FX\u0002¢\u0006\f\n\u0004\b:\u0010\n\u001a\u0004\b8\u00109R\u0014\u0010;\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u000eR\u001b\u0010=\u001a\u00020>8FX\u0002¢\u0006\f\n\u0004\bA\u0010\n\u001a\u0004\b?\u0010@R\u001c\u0010B\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\b\"\u0004\bD\u0010ER\u001c\u0010F\u001a\u0004\u0018\u00010GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001b\u0010L\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\bN\u0010\n\u001a\u0004\bM\u0010\b¨\u0006R"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/message/MediaContentVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/chat/entity/message/content/MediaContent;", "content", "(Lcom/ss/android/lark/chat/entity/message/content/MediaContent;)V", "compressPath", "", "getCompressPath", "()Ljava/lang/String;", "compressPath$delegate", "Lkotlin/Lazy;", "duration", "", "getDuration", "()J", "duration$delegate", "fileDeletedStatus", "Lcom/ss/android/lark/chat/entity/message/Message$FileDeletedStatus;", "getFileDeletedStatus", "()Lcom/ss/android/lark/chat/entity/message/Message$FileDeletedStatus;", "setFileDeletedStatus", "(Lcom/ss/android/lark/chat/entity/message/Message$FileDeletedStatus;)V", "filePath", "getFilePath", "filePath$delegate", "fileState", "Lcom/ss/android/lark/chat/entity/message/content/FileState;", "getFileState", "()Lcom/ss/android/lark/chat/entity/message/content/FileState;", "fileState$delegate", "imageSet", "Lcom/ss/android/lark/chat/entity/image/ImageSet;", "getImageSet", "()Lcom/ss/android/lark/chat/entity/image/ImageSet;", "imageSet$delegate", "isSourceFileDelete", "", "()Z", "setSourceFileDelete", "(Z)V", "key", "getKey", "key$delegate", "mime", "getMime", "mime$delegate", "name", "getName", "name$delegate", "originPath", "getOriginPath", "originPath$delegate", "playPath", "getPlayPath", "progress", "", "getProgress", "()I", "progress$delegate", "size", "getSize", ShareHitPoint.f121868c, "Lcom/ss/android/lark/chat/entity/message/content/MediaContent$Source;", "getSource", "()Lcom/ss/android/lark/chat/entity/message/content/MediaContent$Source;", "source$delegate", "sourceId", "getSourceId", "setSourceId", "(Ljava/lang/String;)V", "sourceType", "Lcom/ss/android/lark/chat/entity/message/Message$SourceType;", "getSourceType", "()Lcom/ss/android/lark/chat/entity/message/Message$SourceType;", "setSourceType", "(Lcom/ss/android/lark/chat/entity/message/Message$SourceType;)V", "url", "getUrl", "url$delegate", "canReply", "isContentSame", "diffable", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.base.view.vo.message.g */
public final class MediaContentVO extends ContentVO<MediaContent> {

    /* renamed from: a */
    private final Lazy f84842a;

    /* renamed from: b */
    private final Lazy f84843b;

    /* renamed from: c */
    private final long f84844c;

    /* renamed from: d */
    private final Lazy f84845d;

    /* renamed from: e */
    private final Lazy f84846e;

    /* renamed from: f */
    private final Lazy f84847f;

    /* renamed from: g */
    private final Lazy f84848g;

    /* renamed from: h */
    private final Lazy f84849h;

    /* renamed from: i */
    private final Lazy f84850i;

    /* renamed from: j */
    private final Lazy f84851j;

    /* renamed from: k */
    private final Lazy f84852k;

    /* renamed from: l */
    private final Lazy f84853l;

    /* renamed from: m */
    private final Lazy f84854m;

    /* renamed from: n */
    private String f84855n = "";

    /* renamed from: o */
    private Message.SourceType f84856o = Message.SourceType.TYPE_FROM_UNKONWN;

    /* renamed from: p */
    private boolean f84857p;

    /* renamed from: q */
    private Message.FileDeletedStatus f84858q = Message.FileDeletedStatus.NORMAL;

    /* renamed from: a */
    public final String mo121854a() {
        return (String) this.f84842a.getValue();
    }

    /* renamed from: b */
    public final String mo121859b() {
        return (String) this.f84843b.getValue();
    }

    /* renamed from: d */
    public final String mo121861d() {
        return (String) this.f84845d.getValue();
    }

    /* renamed from: e */
    public final MediaContent.Source mo121862e() {
        return (MediaContent.Source) this.f84846e.getValue();
    }

    /* renamed from: f */
    public final ImageSet mo121863f() {
        return (ImageSet) this.f84847f.getValue();
    }

    /* renamed from: g */
    public final long mo121864g() {
        return ((Number) this.f84848g.getValue()).longValue();
    }

    /* renamed from: h */
    public final int mo121865h() {
        return ((Number) this.f84849h.getValue()).intValue();
    }

    /* renamed from: i */
    public final String mo121866i() {
        return (String) this.f84850i.getValue();
    }

    /* renamed from: j */
    public final String mo121867j() {
        return (String) this.f84851j.getValue();
    }

    /* renamed from: k */
    public final FileState mo121868k() {
        return (FileState) this.f84853l.getValue();
    }

    /* renamed from: l */
    public final String mo121869l() {
        return (String) this.f84854m.getValue();
    }

    /* renamed from: c */
    public final long mo121860c() {
        return this.f84844c;
    }

    /* renamed from: m */
    public final String mo121870m() {
        return this.f84855n;
    }

    /* renamed from: n */
    public final Message.SourceType mo121871n() {
        return this.f84856o;
    }

    /* renamed from: o */
    public final boolean mo121872o() {
        return this.f84857p;
    }

    /* renamed from: p */
    public final Message.FileDeletedStatus mo121873p() {
        return this.f84858q;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.g$b */
    static final class C32986b extends Lambda implements Function0<Long> {
        final /* synthetic */ MediaContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32986b(MediaContent mediaContent) {
            super(0);
            this.$content = mediaContent;
        }

        /* Return type fixed from 'long' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return this.$content.getDuration();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/message/content/FileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.g$d */
    static final class C32988d extends Lambda implements Function0<FileState> {
        final /* synthetic */ MediaContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32988d(MediaContent mediaContent) {
            super(0);
            this.$content = mediaContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final FileState invoke() {
            return this.$content.getFileState();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/image/ImageSet;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.g$e */
    static final class C32989e extends Lambda implements Function0<ImageSet> {
        final /* synthetic */ MediaContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32989e(MediaContent mediaContent) {
            super(0);
            this.$content = mediaContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImageSet invoke() {
            return this.$content.getImageSet();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.g$j */
    static final class C32994j extends Lambda implements Function0<Integer> {
        final /* synthetic */ MediaContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32994j(MediaContent mediaContent) {
            super(0);
            this.$content = mediaContent;
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return this.$content.getProgress();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/message/content/MediaContent$Source;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.g$k */
    static final class C32995k extends Lambda implements Function0<MediaContent.Source> {
        final /* synthetic */ MediaContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32995k(MediaContent mediaContent) {
            super(0);
            this.$content = mediaContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MediaContent.Source invoke() {
            return this.$content.getSource();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.g$a */
    static final class C32985a extends Lambda implements Function0<String> {
        final /* synthetic */ MediaContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32985a(MediaContent mediaContent) {
            super(0);
            this.$content = mediaContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getCompressPath();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.g$c */
    static final class C32987c extends Lambda implements Function0<String> {
        final /* synthetic */ MediaContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32987c(MediaContent mediaContent) {
            super(0);
            this.$content = mediaContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getFilePath();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.g$f */
    static final class C32990f extends Lambda implements Function0<String> {
        final /* synthetic */ MediaContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32990f(MediaContent mediaContent) {
            super(0);
            this.$content = mediaContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getKey();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.g$g */
    static final class C32991g extends Lambda implements Function0<String> {
        final /* synthetic */ MediaContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32991g(MediaContent mediaContent) {
            super(0);
            this.$content = mediaContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getMime();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.g$h */
    static final class C32992h extends Lambda implements Function0<String> {
        final /* synthetic */ MediaContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32992h(MediaContent mediaContent) {
            super(0);
            this.$content = mediaContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getName();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.g$i */
    static final class C32993i extends Lambda implements Function0<String> {
        final /* synthetic */ MediaContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32993i(MediaContent mediaContent) {
            super(0);
            this.$content = mediaContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getOriginPath();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.g$l */
    static final class C32996l extends Lambda implements Function0<String> {
        final /* synthetic */ MediaContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32996l(MediaContent mediaContent) {
            super(0);
            this.$content = mediaContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getUrl();
        }
    }

    /* renamed from: q */
    public final String mo121874q() {
        if (!TextUtils.isEmpty(mo121866i())) {
            return mo121866i();
        }
        return mo121867j();
    }

    /* renamed from: a */
    public final void mo121856a(Message.SourceType sourceType) {
        this.f84856o = sourceType;
    }

    /* renamed from: a */
    public final void mo121855a(Message.FileDeletedStatus fileDeletedStatus) {
        Intrinsics.checkParameterIsNotNull(fileDeletedStatus, "<set-?>");
        this.f84858q = fileDeletedStatus;
    }

    /* renamed from: a */
    public final void mo121857a(String str) {
        this.f84855n = str;
    }

    /* renamed from: a */
    public final void mo121858a(boolean z) {
        this.f84857p = z;
    }

    @Override // com.ss.android.lark.chat.export.vo.ContentVO
    /* renamed from: a */
    public boolean mo121780a(ContentVO<?> aVar) {
        if (!super.mo121780a(aVar) || aVar == null || !(aVar instanceof MediaContentVO)) {
            return false;
        }
        MediaContentVO gVar = (MediaContentVO) aVar;
        if (mo121864g() == gVar.mo121864g() && mo121865h() == gVar.mo121865h() && mo121868k() == gVar.mo121868k() && this.f84857p == gVar.f84857p && C26247a.m94981a(mo121874q(), gVar.mo121874q())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaContentVO(MediaContent mediaContent) {
        super(mediaContent);
        Intrinsics.checkParameterIsNotNull(mediaContent, "content");
        this.f84842a = LazyKt.lazy(new C32990f(mediaContent));
        this.f84843b = LazyKt.lazy(new C32992h(mediaContent));
        this.f84845d = LazyKt.lazy(new C32991g(mediaContent));
        this.f84846e = LazyKt.lazy(new C32995k(mediaContent));
        this.f84847f = LazyKt.lazy(new C32989e(mediaContent));
        this.f84848g = LazyKt.lazy(new C32986b(mediaContent));
        this.f84849h = LazyKt.lazy(new C32994j(mediaContent));
        this.f84850i = LazyKt.lazy(new C32993i(mediaContent));
        this.f84851j = LazyKt.lazy(new C32987c(mediaContent));
        this.f84852k = LazyKt.lazy(new C32985a(mediaContent));
        this.f84853l = LazyKt.lazy(new C32988d(mediaContent));
        this.f84854m = LazyKt.lazy(new C32996l(mediaContent));
    }
}
