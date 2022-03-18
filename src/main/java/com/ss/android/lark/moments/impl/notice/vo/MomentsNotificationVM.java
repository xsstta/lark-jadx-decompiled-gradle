package com.ss.android.lark.moments.impl.notice.vo;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.moments.v1.Comment;
import com.bytedance.lark.pb.moments.v1.Media;
import com.bytedance.lark.pb.moments.v1.Notification;
import com.bytedance.lark.pb.moments.v1.Post;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.moments.impl.common.utils.C47281d;
import com.ss.android.lark.moments.impl.common.utils.ImageUtils;
import com.ss.android.lark.moments.impl.common.utils.TimeLabelUtils;
import com.ss.android.lark.moments.impl.commonvo.IMomentsUser;
import com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationBaseVM;
import com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001OB\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0002\u0010\u0015J\b\u0010A\u001a\u00020>H\u0016J\u0012\u0010B\u001a\u00020\u001a2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\u0012\u0010E\u001a\u00020\u001a2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\u0006\u0010F\u001a\u00020GJ\b\u0010H\u001a\u00020\u001aH\u0002J\n\u0010I\u001a\u0004\u0018\u00010&H\u0002J\n\u0010J\u001a\u0004\u0018\u00010\u000eH\u0002J\n\u0010K\u001a\u0004\u0018\u00010&H\u0002J\n\u0010L\u001a\u0004\u0018\u00010\u0007H\u0002J\n\u0010M\u001a\u0004\u0018\u000102H\u0002J\n\u0010N\u001a\u0004\u0018\u000107H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001a8VX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0014\u0010!\u001a\u00020\u001aX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001d\u0010%\u001a\u0004\u0018\u00010&8VX\u0002¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b'\u0010(R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u001d\u0010.\u001a\u0004\u0018\u00010\u00078VX\u0002¢\u0006\f\n\u0004\b0\u0010\u001e\u001a\u0004\b/\u0010+R\u001d\u00101\u001a\u0004\u0018\u0001028VX\u0002¢\u0006\f\n\u0004\b5\u0010\u001e\u001a\u0004\b3\u00104R\u001d\u00106\u001a\u0004\u0018\u0001078VX\u0002¢\u0006\f\n\u0004\b:\u0010\u001e\u001a\u0004\b8\u00109R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0018R\u0014\u0010=\u001a\u00020>X\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@¨\u0006P"}, d2 = {"Lcom/ss/android/lark/moments/impl/notice/vo/MomentsNotificationVM;", "Lcom/ss/android/lark/moments/impl/notice/vo/IMomentsNotificationVM;", "notification", "Lcom/bytedance/lark/pb/moments/v1/Notification;", "sender", "Lcom/ss/android/lark/moments/impl/commonvo/IMomentsUser;", "notificationTitle", "", "contentPost", "Lcom/bytedance/lark/pb/moments/v1/Post;", "contentComment", "Lcom/bytedance/lark/pb/moments/v1/Comment;", "contentPreview", "", "", "Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", "jumpPostId", "jumpCommentId", "sourcePost", "sourceComment", "sourcePreview", "(Lcom/bytedance/lark/pb/moments/v1/Notification;Lcom/ss/android/lark/moments/impl/commonvo/IMomentsUser;Ljava/lang/CharSequence;Lcom/bytedance/lark/pb/moments/v1/Post;Lcom/bytedance/lark/pb/moments/v1/Comment;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/lark/pb/moments/v1/Post;Lcom/bytedance/lark/pb/moments/v1/Comment;Ljava/util/Map;)V", "id", "getId", "()Ljava/lang/String;", "isPostDeleted", "", "()Z", "isSourceDeleted", "isSourceDeleted$delegate", "Lkotlin/Lazy;", "getJumpCommentId", "getJumpPostId", "needShowFollow", "getNeedShowFollow", "getNotification", "()Lcom/bytedance/lark/pb/moments/v1/Notification;", "notificationContent", "Lcom/ss/android/lark/widget/richtext/RichText;", "getNotificationContent", "()Lcom/ss/android/lark/widget/richtext/RichText;", "notificationContent$delegate", "getNotificationTitle", "()Ljava/lang/CharSequence;", "getSender", "()Lcom/ss/android/lark/moments/impl/commonvo/IMomentsUser;", "sourceContent", "getSourceContent", "sourceContent$delegate", "sourceImage", "Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "getSourceImage", "()Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "sourceImage$delegate", "sourceMedia", "Lcom/bytedance/lark/pb/moments/v1/Media;", "getSourceMedia", "()Lcom/bytedance/lark/pb/moments/v1/Media;", "sourceMedia$delegate", "timeLabelText", "getTimeLabelText", ShareHitPoint.f121869d, "", "getType", "()I", "getItemType", "isContentSame", "diffable", "Lcom/ss/android/lark/moments/impl/notice/vo/IMomentsNotificationBaseVM;", "isItemSame", "newBuilder", "Lcom/ss/android/lark/moments/impl/notice/vo/MomentsNotificationVM$Builder;", "parseIsDeleted", "parseNotificationContent", "parseNotificationImageContent", "parseNotificationRichText", "parseSourceContent", "parseSourceImage", "parseSourceMedia", "Builder", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.notice.vo.d */
public final class MomentsNotificationVM implements IMomentsNotificationVM {

    /* renamed from: a */
    private final String f120432a;

    /* renamed from: b */
    private final int f120433b;

    /* renamed from: c */
    private final String f120434c;

    /* renamed from: d */
    private final boolean f120435d;

    /* renamed from: e */
    private final Lazy f120436e;

    /* renamed from: f */
    private final Lazy f120437f;

    /* renamed from: g */
    private final Lazy f120438g;

    /* renamed from: h */
    private final Lazy f120439h;

    /* renamed from: i */
    private final Lazy f120440i;

    /* renamed from: j */
    private final boolean f120441j;

    /* renamed from: k */
    private final Notification f120442k;

    /* renamed from: l */
    private final IMomentsUser f120443l;

    /* renamed from: m */
    private final CharSequence f120444m;

    /* renamed from: n */
    private final Post f120445n;

    /* renamed from: o */
    private final Comment f120446o;

    /* renamed from: p */
    private final Map<String, PreviewHangPoint> f120447p;

    /* renamed from: q */
    private final String f120448q;

    /* renamed from: r */
    private final String f120449r;

    /* renamed from: s */
    private final Post f120450s;

    /* renamed from: t */
    private final Comment f120451t;

    /* renamed from: u */
    private final Map<String, PreviewHangPoint> f120452u;

    @Override // com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationVM
    /* renamed from: g */
    public RichText mo167589g() {
        return (RichText) this.f120436e.getValue();
    }

    @Override // com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationVM
    /* renamed from: j */
    public CharSequence mo167592j() {
        return (CharSequence) this.f120438g.getValue();
    }

    @Override // com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationVM
    /* renamed from: k */
    public ImageSet mo167593k() {
        return (ImageSet) this.f120439h.getValue();
    }

    @Override // com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationVM
    /* renamed from: l */
    public Media mo167594l() {
        return (Media) this.f120440i.getValue();
    }

    @Override // com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationVM
    /* renamed from: m */
    public boolean mo167595m() {
        return ((Boolean) this.f120437f.getValue()).booleanValue();
    }

    @Override // com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationVM
    /* renamed from: b */
    public String mo167584b() {
        return this.f120432a;
    }

    @Override // com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationVM
    /* renamed from: c */
    public int mo167585c() {
        return this.f120433b;
    }

    @Override // com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationVM
    /* renamed from: d */
    public String mo167586d() {
        return this.f120434c;
    }

    @Override // com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationVM
    /* renamed from: e */
    public IMomentsUser mo167587e() {
        return this.f120443l;
    }

    @Override // com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationVM
    /* renamed from: f */
    public CharSequence mo167588f() {
        return this.f120444m;
    }

    @Override // com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationVM
    /* renamed from: h */
    public String mo167590h() {
        return this.f120448q;
    }

    @Override // com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationVM
    /* renamed from: i */
    public String mo167591i() {
        return this.f120449r;
    }

    @Override // com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationVM
    /* renamed from: n */
    public boolean mo167596n() {
        return this.f120435d;
    }

    @Override // com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationVM
    /* renamed from: o */
    public boolean mo167597o() {
        return this.f120441j;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.vo.d$b */
    static final class C47818b extends Lambda implements Function0<Boolean> {
        final /* synthetic */ MomentsNotificationVM this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47818b(MomentsNotificationVM dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.this$0.mo167606t();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/widget/richtext/RichText;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.vo.d$c */
    static final class C47819c extends Lambda implements Function0<RichText> {
        final /* synthetic */ MomentsNotificationVM this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47819c(MomentsNotificationVM dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final RichText invoke() {
            return this.this$0.mo167602p();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.vo.d$d */
    static final class C47820d extends Lambda implements Function0<CharSequence> {
        final /* synthetic */ MomentsNotificationVM this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47820d(MomentsNotificationVM dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CharSequence invoke() {
            return this.this$0.mo167603q();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.vo.d$e */
    static final class C47821e extends Lambda implements Function0<ImageSet> {
        final /* synthetic */ MomentsNotificationVM this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47821e(MomentsNotificationVM dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImageSet invoke() {
            return this.this$0.mo167604r();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/moments/v1/Media;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.vo.d$f */
    static final class C47822f extends Lambda implements Function0<Media> {
        final /* synthetic */ MomentsNotificationVM this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47822f(MomentsNotificationVM dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Media invoke() {
            return this.this$0.mo167605s();
        }
    }

    /* renamed from: s */
    public final Media mo167605s() {
        Post.PostContent postContent;
        Post post = this.f120450s;
        if (post == null || (postContent = post.post_content) == null) {
            return null;
        }
        return postContent.media;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u001c\u0010\u000b\u001a\u00020\u00002\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\nJ\u001c\u0010\u0015\u001a\u00020\u00002\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/moments/impl/notice/vo/MomentsNotificationVM$Builder;", "", "notification", "Lcom/bytedance/lark/pb/moments/v1/Notification;", "contentTitle", "", "(Lcom/bytedance/lark/pb/moments/v1/Notification;Ljava/lang/CharSequence;)V", "contentComment", "Lcom/bytedance/lark/pb/moments/v1/Comment;", "contentPost", "Lcom/bytedance/lark/pb/moments/v1/Post;", "contentPreview", "", "", "Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", "jumpCommentId", "jumpPostId", "sender", "Lcom/ss/android/lark/moments/impl/commonvo/IMomentsUser;", "sourceComment", "sourcePost", "sourcePreview", "build", "Lcom/ss/android/lark/moments/impl/notice/vo/IMomentsNotificationVM;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.vo.d$a */
    public static final class Builder {

        /* renamed from: a */
        private IMomentsUser f120453a;

        /* renamed from: b */
        private Post f120454b;

        /* renamed from: c */
        private Comment f120455c;

        /* renamed from: d */
        private Map<String, PreviewHangPoint> f120456d;

        /* renamed from: e */
        private String f120457e;

        /* renamed from: f */
        private String f120458f;

        /* renamed from: g */
        private Post f120459g;

        /* renamed from: h */
        private Comment f120460h;

        /* renamed from: i */
        private Map<String, PreviewHangPoint> f120461i;

        /* renamed from: j */
        private final Notification f120462j;

        /* renamed from: k */
        private final CharSequence f120463k;

        /* renamed from: a */
        public final IMomentsNotificationVM mo167608a() {
            return new MomentsNotificationVM(this.f120462j, this.f120453a, this.f120463k, this.f120454b, this.f120455c, this.f120456d, this.f120457e, this.f120458f, this.f120459g, this.f120460h, this.f120461i);
        }

        /* renamed from: a */
        public final Builder mo167609a(Comment comment) {
            Builder aVar = this;
            aVar.f120455c = comment;
            return aVar;
        }

        /* renamed from: b */
        public final Builder mo167614b(Comment comment) {
            Builder aVar = this;
            aVar.f120460h = comment;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo167610a(Post post) {
            Builder aVar = this;
            aVar.f120454b = post;
            return aVar;
        }

        /* renamed from: b */
        public final Builder mo167615b(Post post) {
            Builder aVar = this;
            aVar.f120459g = post;
            return aVar;
        }

        /* renamed from: b */
        public final Builder mo167616b(String str) {
            Builder aVar = this;
            aVar.f120458f = str;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo167611a(IMomentsUser cVar) {
            Builder aVar = this;
            aVar.f120453a = cVar;
            return aVar;
        }

        /* renamed from: b */
        public final Builder mo167617b(Map<String, PreviewHangPoint> map) {
            Builder aVar = this;
            aVar.f120461i = map;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo167612a(String str) {
            Builder aVar = this;
            aVar.f120457e = str;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo167613a(Map<String, PreviewHangPoint> map) {
            Builder aVar = this;
            aVar.f120456d = map;
            return aVar;
        }

        public Builder(Notification notification, CharSequence charSequence) {
            Intrinsics.checkParameterIsNotNull(notification, "notification");
            Intrinsics.checkParameterIsNotNull(charSequence, "contentTitle");
            this.f120462j = notification;
            this.f120463k = charSequence;
        }
    }

    @Override // com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationBaseVM
    /* renamed from: a */
    public int mo167583a() {
        if (mo167585c() == Notification.Type.UNKNOWN.ordinal()) {
            return IMomentsNotificationBaseVM.ItemType.ITEM_TYPE_UNKNOWN.ordinal();
        }
        return IMomentsNotificationBaseVM.ItemType.ITEM_TYPE_NOTIFICATION.ordinal();
    }

    /* renamed from: p */
    public final RichText mo167602p() {
        RichText v = m188943v();
        if (!C59035h.m229210a(v)) {
            return v;
        }
        String w = m188944w();
        if (!TextUtils.isEmpty(w)) {
            return C59029c.m229161b(w);
        }
        return null;
    }

    /* renamed from: r */
    public final ImageSet mo167604r() {
        Comment.CommentContent commentContent;
        List<ImageSet> list;
        Post post = this.f120450s;
        if (post != null) {
            Post.PostContent postContent = post.post_content;
            if (postContent != null) {
                list = postContent.image_set_list;
            } else {
                list = null;
            }
            if (list == null || list.size() <= 0) {
                return null;
            }
            return list.get(0);
        }
        Comment comment = this.f120451t;
        if (comment == null || (commentContent = comment.content) == null) {
            return null;
        }
        return commentContent.image_set;
    }

    /* renamed from: t */
    public final boolean mo167606t() {
        Boolean bool;
        Post post = this.f120450s;
        if (post != null) {
            Boolean bool2 = post.is_deleted;
            Intrinsics.checkExpressionValueIsNotNull(bool2, "sourcePost.is_deleted");
            return bool2.booleanValue();
        }
        Comment comment = this.f120451t;
        if (comment != null) {
            bool = comment.is_deleted;
        } else {
            bool = false;
        }
        Intrinsics.checkExpressionValueIsNotNull(bool, "if (sourceComment != nul…          false\n        }");
        return bool.booleanValue();
    }

    /* renamed from: u */
    public final Builder mo167607u() {
        return new Builder(this.f120442k, mo167588f()).mo167611a(mo167587e()).mo167610a(this.f120445n).mo167609a(this.f120446o).mo167612a(mo167590h()).mo167616b(mo167591i()).mo167615b(this.f120450s).mo167614b(this.f120451t);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.ss.android.lark.widget.richtext.RichText m188943v() {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.notice.vo.MomentsNotificationVM.m188943v():com.ss.android.lark.widget.richtext.RichText");
    }

    /* renamed from: w */
    private final String m188944w() {
        StringBuilder sb = new StringBuilder();
        Post post = this.f120445n;
        ImageSet imageSet = null;
        Media media = null;
        if (post != null) {
            Post.PostContent postContent = post.post_content;
            List<ImageSet> list = postContent != null ? postContent.image_set_list : null;
            if (list != null && list.size() > 0) {
                for (ImageSet imageSet2 : list) {
                    sb.append(UIHelper.getString(R.string.Lark_Community_Image));
                }
            }
            Post.PostContent postContent2 = this.f120445n.post_content;
            if (postContent2 != null) {
                media = postContent2.media;
            }
            if (ImageUtils.f119250a.mo166203a(media)) {
                sb.append(UIHelper.getString(R.string.Lark_Community_Video));
            }
        } else if (this.f120446o != null) {
            ImageUtils bVar = ImageUtils.f119250a;
            Comment.CommentContent commentContent = this.f120446o.content;
            if (commentContent != null) {
                imageSet = commentContent.image_set;
            }
            if (bVar.mo166202a(imageSet)) {
                sb.append(UIHelper.getString(R.string.Lark_Community_Image));
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence mo167603q() {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.notice.vo.MomentsNotificationVM.mo167603q():java.lang.CharSequence");
    }

    /* renamed from: a */
    public boolean isItemSame(IMomentsNotificationBaseVM iMomentsNotificationBaseVM) {
        if (iMomentsNotificationBaseVM == null || !(iMomentsNotificationBaseVM instanceof MomentsNotificationVM) || !Intrinsics.areEqual(((MomentsNotificationVM) iMomentsNotificationBaseVM).mo167584b(), mo167584b())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean isContentSame(IMomentsNotificationBaseVM iMomentsNotificationBaseVM) {
        if (!(iMomentsNotificationBaseVM instanceof MomentsNotificationVM)) {
            return false;
        }
        MomentsNotificationVM dVar = (MomentsNotificationVM) iMomentsNotificationBaseVM;
        if (mo167585c() != dVar.mo167585c() || !Intrinsics.areEqual(mo167586d(), dVar.mo167586d()) || mo167596n() != dVar.mo167596n() || !Intrinsics.areEqual(mo167589g(), dVar.mo167589g()) || !Intrinsics.areEqual(mo167592j(), dVar.mo167592j()) || !C47281d.m187233a(mo167593k(), dVar.mo167593k()) || !C47281d.m187234a(mo167594l(), dVar.mo167594l()) || !Intrinsics.areEqual(mo167587e(), dVar.mo167587e()) || mo167595m() != dVar.mo167595m()) {
            return false;
        }
        return true;
    }

    public MomentsNotificationVM(Notification notification, IMomentsUser cVar, CharSequence charSequence, Post post, Comment comment, Map<String, PreviewHangPoint> map, String str, String str2, Post post2, Comment comment2, Map<String, PreviewHangPoint> map2) {
        boolean z;
        Boolean bool;
        Intrinsics.checkParameterIsNotNull(notification, "notification");
        Intrinsics.checkParameterIsNotNull(charSequence, "notificationTitle");
        this.f120442k = notification;
        this.f120443l = cVar;
        this.f120444m = charSequence;
        this.f120445n = post;
        this.f120446o = comment;
        this.f120447p = map;
        this.f120448q = str;
        this.f120449r = str2;
        this.f120450s = post2;
        this.f120451t = comment2;
        this.f120452u = map2;
        String str3 = notification.id;
        Intrinsics.checkExpressionValueIsNotNull(str3, "notification.id");
        this.f120432a = str3;
        this.f120433b = notification.type.ordinal();
        TimeLabelUtils jVar = TimeLabelUtils.f119256a;
        Long l = notification.create_time_msec;
        Intrinsics.checkExpressionValueIsNotNull(l, "notification.create_time_msec");
        this.f120434c = jVar.mo166217a(l.longValue());
        boolean z2 = false;
        if (UserGlobalConfigAndSettingsManager.f120180a.mo167311i() || notification.type != Notification.Type.FOLLOWER) {
            z = false;
        } else {
            z = true;
        }
        this.f120435d = z;
        this.f120436e = LazyKt.lazy(new C47819c(this));
        this.f120437f = LazyKt.lazy(new C47818b(this));
        this.f120438g = LazyKt.lazy(new C47820d(this));
        this.f120439h = LazyKt.lazy(new C47821e(this));
        this.f120440i = LazyKt.lazy(new C47822f(this));
        if (!(post2 == null || (bool = post2.is_deleted) == null)) {
            z2 = bool.booleanValue();
        }
        this.f120441j = z2;
    }
}
