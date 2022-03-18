package com.ss.android.lark.chat.base.view.vo.message;

import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.ImageTranslateProperty;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.image.entity.Image;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okio.ByteString;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010;\u001a\u00020\u0012H\u0016J\u0016\u0010<\u001a\u00020\u00122\f\u0010=\u001a\b\u0012\u0002\b\u0003\u0018\u00010>H\u0016J\b\u0010?\u001a\u00020\u0012H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0011\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00128FX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0015\u0010\u0013R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00188FX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001d\u0010\"\u001a\u0004\u0018\u00010#8FX\u0002¢\u0006\f\n\u0004\b&\u0010\u0010\u001a\u0004\b$\u0010%R\u001d\u0010'\u001a\u0004\u0018\u00010#8FX\u0002¢\u0006\f\n\u0004\b)\u0010\u0010\u001a\u0004\b(\u0010%R\u001d\u0010*\u001a\u0004\u0018\u00010\u00188FX\u0002¢\u0006\f\n\u0004\b,\u0010\u0010\u001a\u0004\b+\u0010\u001aR\u001b\u0010-\u001a\u00020.8FX\u0002¢\u0006\f\n\u0004\b1\u0010\u0010\u001a\u0004\b/\u00100R\u001a\u00102\u001a\u000203X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001d\u00108\u001a\u0004\u0018\u00010#8FX\u0002¢\u0006\f\n\u0004\b:\u0010\u0010\u001a\u0004\b9\u0010%¨\u0006@"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/message/ImageContentVO;", "Lcom/ss/android/lark/chat/base/view/vo/message/TranslatableContentVO;", "Lcom/ss/android/lark/chat/entity/message/content/ImageContent;", "content", "(Lcom/ss/android/lark/chat/entity/message/content/ImageContent;)V", "imageTranslateProperty", "Lcom/ss/android/lark/chat/entity/message/content/ImageTranslateProperty;", "getImageTranslateProperty", "()Lcom/ss/android/lark/chat/entity/message/content/ImageTranslateProperty;", "setImageTranslateProperty", "(Lcom/ss/android/lark/chat/entity/message/content/ImageTranslateProperty;)V", "inlinePreview", "Lokio/ByteString;", "getInlinePreview", "()Lokio/ByteString;", "inlinePreview$delegate", "Lkotlin/Lazy;", "isFromMe", "", "()Z", "isFromMe$delegate", "isOriginSource", "isOriginSource$delegate", "key", "", "getKey", "()Ljava/lang/String;", "key$delegate", "messageIdentity", "Lcom/ss/android/lark/chat/entity/message/MessageIdentity;", "getMessageIdentity", "()Lcom/ss/android/lark/chat/entity/message/MessageIdentity;", "setMessageIdentity", "(Lcom/ss/android/lark/chat/entity/message/MessageIdentity;)V", "middle", "Lcom/ss/android/lark/image/entity/Image;", "getMiddle", "()Lcom/ss/android/lark/image/entity/Image;", "middle$delegate", "origin", "getOrigin", "origin$delegate", "originKey", "getOriginKey", "originKey$delegate", "originSize", "", "getOriginSize", "()J", "originSize$delegate", "progress", "", "getProgress", "()I", "setProgress", "(I)V", "thumbnail", "getThumbnail", "thumbnail$delegate", "canReply", "isContentSame", "diffable", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "isTranslated", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.base.view.vo.message.f */
public final class ImageContentVO extends TranslatableContentVO<ImageContent> {

    /* renamed from: a */
    private final Lazy f84830a;

    /* renamed from: b */
    private final Lazy f84831b;

    /* renamed from: c */
    private final Lazy f84832c;

    /* renamed from: d */
    private final Lazy f84833d;

    /* renamed from: e */
    private final Lazy f84834e;

    /* renamed from: f */
    private final Lazy f84835f;

    /* renamed from: g */
    private ImageTranslateProperty f84836g;

    /* renamed from: h */
    private MessageIdentity f84837h;

    /* renamed from: i */
    private int f84838i;

    /* renamed from: j */
    private final Lazy f84839j;

    /* renamed from: k */
    private final Lazy f84840k;

    /* renamed from: l */
    private final Lazy f84841l;

    /* renamed from: a */
    public final String mo121842a() {
        return (String) this.f84830a.getValue();
    }

    /* renamed from: b */
    public final Image mo121844b() {
        return (Image) this.f84831b.getValue();
    }

    /* renamed from: c */
    public final String mo121845c() {
        return (String) this.f84832c.getValue();
    }

    /* renamed from: d */
    public final Image mo121846d() {
        return (Image) this.f84833d.getValue();
    }

    /* renamed from: e */
    public final Image mo121847e() {
        return (Image) this.f84834e.getValue();
    }

    /* renamed from: f */
    public final ByteString mo121848f() {
        return (ByteString) this.f84835f.getValue();
    }

    /* renamed from: j */
    public final boolean mo121851j() {
        return ((Boolean) this.f84839j.getValue()).booleanValue();
    }

    /* renamed from: k */
    public final long mo121852k() {
        return ((Number) this.f84840k.getValue()).longValue();
    }

    /* renamed from: l */
    public final boolean mo121853l() {
        return ((Boolean) this.f84841l.getValue()).booleanValue();
    }

    /* renamed from: g */
    public final ImageTranslateProperty mo121849g() {
        return this.f84836g;
    }

    /* renamed from: h */
    public final MessageIdentity mo121850h() {
        return this.f84837h;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lokio/ByteString;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.f$a */
    static final class C32976a extends Lambda implements Function0<ByteString> {
        final /* synthetic */ ImageContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32976a(ImageContent imageContent) {
            super(0);
            this.$content = imageContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ByteString invoke() {
            ImageSet imageSet = this.$content.getImageSet();
            if (imageSet != null) {
                return imageSet.getInlinePreview();
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.f$d */
    static final class C32979d extends Lambda implements Function0<String> {
        final /* synthetic */ ImageContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32979d(ImageContent imageContent) {
            super(0);
            this.$content = imageContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            ImageSet imageSet = this.$content.getImageSet();
            if (imageSet != null) {
                return imageSet.getKey();
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/image/entity/Image;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.f$e */
    static final class C32980e extends Lambda implements Function0<Image> {
        final /* synthetic */ ImageContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32980e(ImageContent imageContent) {
            super(0);
            this.$content = imageContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Image invoke() {
            ImageSet imageSet = this.$content.getImageSet();
            if (imageSet != null) {
                return imageSet.getMiddle();
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/image/entity/Image;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.f$f */
    static final class C32981f extends Lambda implements Function0<Image> {
        final /* synthetic */ ImageContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32981f(ImageContent imageContent) {
            super(0);
            this.$content = imageContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Image invoke() {
            ImageSet imageSet = this.$content.getImageSet();
            if (imageSet != null) {
                return imageSet.getOrigin();
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.f$h */
    static final class C32983h extends Lambda implements Function0<Long> {
        final /* synthetic */ ImageContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32983h(ImageContent imageContent) {
            super(0);
            this.$content = imageContent;
        }

        /* Return type fixed from 'long' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            ImageSet imageSet = this.$content.getImageSet();
            if (imageSet != null) {
                return imageSet.getOriginSize();
            }
            return 0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/image/entity/Image;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.f$i */
    static final class C32984i extends Lambda implements Function0<Image> {
        final /* synthetic */ ImageContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32984i(ImageContent imageContent) {
            super(0);
            this.$content = imageContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Image invoke() {
            ImageSet imageSet = this.$content.getImageSet();
            if (imageSet != null) {
                return imageSet.getThumbnail();
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.f$b */
    static final class C32977b extends Lambda implements Function0<Boolean> {
        final /* synthetic */ ImageContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32977b(ImageContent imageContent) {
            super(0);
            this.$content = imageContent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            ImageSet imageSet = this.$content.getImageSet();
            if (imageSet != null) {
                return imageSet.isFromMe();
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.f$c */
    static final class C32978c extends Lambda implements Function0<Boolean> {
        final /* synthetic */ ImageContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32978c(ImageContent imageContent) {
            super(0);
            this.$content = imageContent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            ImageSet imageSet = this.$content.getImageSet();
            if (imageSet != null) {
                return imageSet.isOriginSource();
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.f$g */
    static final class C32982g extends Lambda implements Function0<String> {
        final /* synthetic */ ImageContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32982g(ImageContent imageContent) {
            super(0);
            this.$content = imageContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Image origin;
            ImageSet imageSet = this.$content.getImageSet();
            if (imageSet == null || (origin = imageSet.getOrigin()) == null) {
                return null;
            }
            return origin.getKey();
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
    public final void mo121843a(MessageIdentity messageIdentity) {
        this.f84837h = messageIdentity;
    }

    @Override // com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO, com.ss.android.lark.chat.export.vo.ContentVO
    /* renamed from: a */
    public boolean mo121780a(ContentVO<?> aVar) {
        if (!super.mo121780a(aVar) || aVar == null || !(aVar instanceof ImageContentVO)) {
            return false;
        }
        ImageContentVO fVar = (ImageContentVO) aVar;
        if (!C26247a.m94981a(this.f84837h, fVar.f84837h) || this.f84838i != fVar.f84838i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageContentVO(ImageContent imageContent) {
        super(imageContent);
        Intrinsics.checkParameterIsNotNull(imageContent, "content");
        this.f84830a = LazyKt.lazy(new C32979d(imageContent));
        this.f84831b = LazyKt.lazy(new C32981f(imageContent));
        this.f84832c = LazyKt.lazy(new C32982g(imageContent));
        this.f84833d = LazyKt.lazy(new C32984i(imageContent));
        this.f84834e = LazyKt.lazy(new C32980e(imageContent));
        this.f84835f = LazyKt.lazy(new C32976a(imageContent));
        this.f84836g = imageContent.getImageTranslateProperty();
        this.f84838i = imageContent.getProgress();
        this.f84839j = LazyKt.lazy(new C32978c(imageContent));
        this.f84840k = LazyKt.lazy(new C32983h(imageContent));
        this.f84841l = LazyKt.lazy(new C32977b(imageContent));
    }
}
