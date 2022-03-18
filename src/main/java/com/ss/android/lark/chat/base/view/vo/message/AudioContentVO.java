package com.ss.android.lark.chat.base.view.vo.message;

import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.export.vo.ContentVO;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010:\u001a\u00020\u001dH\u0016J\u0016\u0010;\u001a\u00020\u001d2\f\u0010<\u001a\b\u0012\u0002\b\u0003\u0018\u00010=H\u0016J\b\u0010>\u001a\u00020\u001dH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128FX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8FX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001c\u0010\u001eR\u001b\u0010 \u001a\u00020\u001d8FX\u0002¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b \u0010\u001eR\u001b\u0010\"\u001a\u00020\u001d8FX\u0002¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b\"\u0010\u001eR\u001a\u0010$\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001e\"\u0004\b%\u0010&R\u001b\u0010'\u001a\u00020(8FX\u0002¢\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b)\u0010*R\u001c\u0010,\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010*\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u00103R\u001d\u00104\u001a\u0004\u0018\u00010(8FX\u0002¢\u0006\f\n\u0004\b6\u0010\n\u001a\u0004\b5\u0010*R\u001b\u00107\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b9\u0010\n\u001a\u0004\b8\u0010\b¨\u0006?"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/message/AudioContentVO;", "Lcom/ss/android/lark/chat/base/view/vo/message/TranslatableContentVO;", "Lcom/ss/android/lark/chat/entity/message/content/AudioContent;", "content", "(Lcom/ss/android/lark/chat/entity/message/content/AudioContent;)V", "audio2TextStartTime", "", "getAudio2TextStartTime", "()J", "audio2TextStartTime$delegate", "Lkotlin/Lazy;", "audioWaveBytes", "", "getAudioWaveBytes", "()[B", "setAudioWaveBytes", "([B)V", "duration", "", "getDuration", "()I", "duration$delegate", "fileState", "Lcom/ss/android/lark/chat/entity/message/content/AudioContent$AudioState;", "getFileState", "()Lcom/ss/android/lark/chat/entity/message/content/AudioContent$AudioState;", "setFileState", "(Lcom/ss/android/lark/chat/entity/message/content/AudioContent$AudioState;)V", "isAudioWithText", "", "()Z", "isAudioWithText$delegate", "isNeedHideText", "isNeedHideText$delegate", "isRecognizeFinished", "isRecognizeFinished$delegate", "isSourceFileDeleted", "setSourceFileDeleted", "(Z)V", "key", "", "getKey", "()Ljava/lang/String;", "key$delegate", "localFilePath", "getLocalFilePath", "setLocalFilePath", "(Ljava/lang/String;)V", "progress", "getProgress", "setProgress", "(I)V", "recognizedText", "getRecognizedText", "recognizedText$delegate", "size", "getSize", "size$delegate", "canReply", "isContentSame", "diffable", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "isTranslated", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.base.view.vo.message.b */
public final class AudioContentVO extends TranslatableContentVO<AudioContent> {

    /* renamed from: a */
    private final Lazy f84797a;

    /* renamed from: b */
    private final Lazy f84798b;

    /* renamed from: c */
    private final Lazy f84799c;

    /* renamed from: d */
    private final Lazy f84800d;

    /* renamed from: e */
    private final Lazy f84801e;

    /* renamed from: f */
    private final Lazy f84802f;

    /* renamed from: g */
    private final Lazy f84803g;

    /* renamed from: h */
    private final Lazy f84804h;

    /* renamed from: i */
    private AudioContent.AudioState f84805i;

    /* renamed from: j */
    private String f84806j;

    /* renamed from: k */
    private int f84807k;

    /* renamed from: l */
    private byte[] f84808l;

    /* renamed from: m */
    private boolean f84809m;

    /* renamed from: a */
    public final String mo121801a() {
        return (String) this.f84797a.getValue();
    }

    /* renamed from: b */
    public final long mo121807b() {
        return ((Number) this.f84798b.getValue()).longValue();
    }

    /* renamed from: c */
    public final int mo121808c() {
        return ((Number) this.f84799c.getValue()).intValue();
    }

    /* renamed from: d */
    public final boolean mo121809d() {
        return ((Boolean) this.f84800d.getValue()).booleanValue();
    }

    /* renamed from: e */
    public final String mo121810e() {
        return (String) this.f84801e.getValue();
    }

    /* renamed from: f */
    public final boolean mo121811f() {
        return ((Boolean) this.f84802f.getValue()).booleanValue();
    }

    /* renamed from: g */
    public final long mo121812g() {
        return ((Number) this.f84803g.getValue()).longValue();
    }

    /* renamed from: h */
    public final boolean mo121813h() {
        return ((Boolean) this.f84804h.getValue()).booleanValue();
    }

    /* renamed from: j */
    public final AudioContent.AudioState mo121815j() {
        return this.f84805i;
    }

    /* renamed from: k */
    public final String mo121816k() {
        return this.f84806j;
    }

    /* renamed from: l */
    public final int mo121817l() {
        return this.f84807k;
    }

    /* renamed from: m */
    public final byte[] mo121818m() {
        return this.f84808l;
    }

    /* renamed from: n */
    public final boolean mo121819n() {
        return this.f84809m;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.b$a */
    static final class C32952a extends Lambda implements Function0<Long> {
        final /* synthetic */ AudioContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32952a(AudioContent audioContent) {
            super(0);
            this.$content = audioContent;
        }

        /* Return type fixed from 'long' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return this.$content.getAudio2TextStartTime();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.b$b */
    static final class C32953b extends Lambda implements Function0<Integer> {
        final /* synthetic */ AudioContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32953b(AudioContent audioContent) {
            super(0);
            this.$content = audioContent;
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return this.$content.getDuration();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.b$c */
    static final class C32954c extends Lambda implements Function0<Boolean> {
        final /* synthetic */ AudioContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32954c(AudioContent audioContent) {
            super(0);
            this.$content = audioContent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.$content.isAudioWithText();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.b$d */
    static final class C32955d extends Lambda implements Function0<Boolean> {
        final /* synthetic */ AudioContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32955d(AudioContent audioContent) {
            super(0);
            this.$content = audioContent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.$content.isNeedHideText();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.b$e */
    static final class C32956e extends Lambda implements Function0<Boolean> {
        final /* synthetic */ AudioContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32956e(AudioContent audioContent) {
            super(0);
            this.$content = audioContent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.$content.isRecognizeFinished();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.b$h */
    static final class C32959h extends Lambda implements Function0<Long> {
        final /* synthetic */ AudioContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32959h(AudioContent audioContent) {
            super(0);
            this.$content = audioContent;
        }

        /* Return type fixed from 'long' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return this.$content.getSize();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.b$f */
    static final class C32957f extends Lambda implements Function0<String> {
        final /* synthetic */ AudioContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32957f(AudioContent audioContent) {
            super(0);
            this.$content = audioContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getKey();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.b$g */
    static final class C32958g extends Lambda implements Function0<String> {
        final /* synthetic */ AudioContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32958g(AudioContent audioContent) {
            super(0);
            this.$content = audioContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getRecognizedText();
        }
    }

    @Override // com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO
    /* renamed from: i */
    public boolean mo121814i() {
        if (mo121929x() == 1 || mo121929x() == 0 || mo121930y() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo121802a(int i) {
        this.f84807k = i;
    }

    /* renamed from: a */
    public final void mo121803a(AudioContent.AudioState audioState) {
        Intrinsics.checkParameterIsNotNull(audioState, "<set-?>");
        this.f84805i = audioState;
    }

    /* renamed from: a */
    public final void mo121804a(String str) {
        this.f84806j = str;
    }

    /* renamed from: a */
    public final void mo121805a(boolean z) {
        this.f84809m = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioContentVO(AudioContent audioContent) {
        super(audioContent);
        Intrinsics.checkParameterIsNotNull(audioContent, "content");
        this.f84797a = LazyKt.lazy(new C32957f(audioContent));
        this.f84798b = LazyKt.lazy(new C32959h(audioContent));
        this.f84799c = LazyKt.lazy(new C32953b(audioContent));
        this.f84800d = LazyKt.lazy(new C32955d(audioContent));
        this.f84801e = LazyKt.lazy(new C32958g(audioContent));
        this.f84802f = LazyKt.lazy(new C32956e(audioContent));
        this.f84803g = LazyKt.lazy(new C32952a(audioContent));
        this.f84804h = LazyKt.lazy(new C32954c(audioContent));
        this.f84805i = audioContent.getFileState();
    }

    /* renamed from: a */
    public final void mo121806a(byte[] bArr) {
        this.f84808l = bArr;
    }

    @Override // com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO, com.ss.android.lark.chat.export.vo.ContentVO
    /* renamed from: a */
    public boolean mo121780a(ContentVO<?> aVar) {
        if (!super.mo121780a(aVar) || !(aVar instanceof AudioContentVO)) {
            return false;
        }
        AudioContentVO bVar = (AudioContentVO) aVar;
        if (C26247a.m94981a(mo121801a(), bVar.mo121801a()) && mo121807b() == bVar.mo121807b() && mo121808c() == bVar.mo121808c() && this.f84805i == bVar.f84805i && mo121809d() == bVar.mo121809d() && C26247a.m94981a(mo121810e(), bVar.mo121810e()) && mo121811f() == bVar.mo121811f() && mo121812g() == bVar.mo121812g() && mo121813h() == bVar.mo121813h() && this.f84809m == bVar.f84809m) {
            return true;
        }
        return false;
    }
}
