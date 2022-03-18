package com.ss.android.vc.lark.message.meeting.chatcell;

import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.dto.VideoChatContent;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/ss/android/vc/lark/message/meeting/chatcell/VideoMeetingContentVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/vc/dto/VideoChatContent;", "content", "(Lcom/ss/android/vc/dto/VideoChatContent;)V", "meetingCard", "Lcom/ss/android/vc/dto/VideoChatContent$MeetingCard;", "getMeetingCard", "()Lcom/ss/android/vc/dto/VideoChatContent$MeetingCard;", "meetingCard$delegate", "Lkotlin/Lazy;", ShareHitPoint.f121869d, "", "getType", "()I", "type$delegate", "canReply", "", "convert2Content", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.lark.message.meeting.a.a */
public final class VideoMeetingContentVO extends ContentVO<VideoChatContent> {

    /* renamed from: a */
    private final Lazy f153021a;

    /* renamed from: b */
    private final Lazy f153022b;

    /* renamed from: a */
    public final int mo211346a() {
        return ((Number) this.f153021a.getValue()).intValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/dto/VideoChatContent$MeetingCard;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.lark.message.meeting.a.a$a */
    static final class C61099a extends Lambda implements Function0<VideoChatContent.MeetingCard> {
        final /* synthetic */ VideoChatContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61099a(VideoChatContent videoChatContent) {
            super(0);
            this.$content = videoChatContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final VideoChatContent.MeetingCard invoke() {
            return this.$content.meetingCard;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.lark.message.meeting.a.a$b */
    static final class C61100b extends Lambda implements Function0<Integer> {
        final /* synthetic */ VideoChatContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61100b(VideoChatContent videoChatContent) {
            super(0);
            this.$content = videoChatContent;
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return this.$content.type;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoMeetingContentVO(VideoChatContent videoChatContent) {
        super(videoChatContent);
        Intrinsics.checkParameterIsNotNull(videoChatContent, "content");
        this.f153021a = LazyKt.lazy(new C61100b(videoChatContent));
        this.f153022b = LazyKt.lazy(new C61099a(videoChatContent));
    }
}
