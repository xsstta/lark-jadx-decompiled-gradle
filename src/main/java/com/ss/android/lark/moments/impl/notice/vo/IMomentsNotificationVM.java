package com.ss.android.lark.moments.impl.notice.vo;

import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.moments.v1.Media;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.moments.impl.commonvo.IMomentsUser;
import com.ss.android.lark.widget.richtext.RichText;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0012\u0010\t\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\bR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u0004\u0018\u00010#X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0012\u0010&\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0005R\u0012\u0010(\u001a\u00020)X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/ss/android/lark/moments/impl/notice/vo/IMomentsNotificationVM;", "Lcom/ss/android/lark/moments/impl/notice/vo/IMomentsNotificationBaseVM;", "id", "", "getId", "()Ljava/lang/String;", "isPostDeleted", "", "()Z", "isSourceDeleted", "jumpCommentId", "getJumpCommentId", "jumpPostId", "getJumpPostId", "needShowFollow", "getNeedShowFollow", "notificationContent", "Lcom/ss/android/lark/widget/richtext/RichText;", "getNotificationContent", "()Lcom/ss/android/lark/widget/richtext/RichText;", "notificationTitle", "", "getNotificationTitle", "()Ljava/lang/CharSequence;", "sender", "Lcom/ss/android/lark/moments/impl/commonvo/IMomentsUser;", "getSender", "()Lcom/ss/android/lark/moments/impl/commonvo/IMomentsUser;", "sourceContent", "getSourceContent", "sourceImage", "Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "getSourceImage", "()Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "sourceMedia", "Lcom/bytedance/lark/pb/moments/v1/Media;", "getSourceMedia", "()Lcom/bytedance/lark/pb/moments/v1/Media;", "timeLabelText", "getTimeLabelText", ShareHitPoint.f121869d, "", "getType", "()I", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.notice.vo.b */
public interface IMomentsNotificationVM extends IMomentsNotificationBaseVM {
    /* renamed from: b */
    String mo167584b();

    /* renamed from: c */
    int mo167585c();

    /* renamed from: d */
    String mo167586d();

    /* renamed from: e */
    IMomentsUser mo167587e();

    /* renamed from: f */
    CharSequence mo167588f();

    /* renamed from: g */
    RichText mo167589g();

    /* renamed from: h */
    String mo167590h();

    /* renamed from: i */
    String mo167591i();

    /* renamed from: j */
    CharSequence mo167592j();

    /* renamed from: k */
    ImageSet mo167593k();

    /* renamed from: l */
    Media mo167594l();

    /* renamed from: m */
    boolean mo167595m();

    /* renamed from: n */
    boolean mo167596n();

    /* renamed from: o */
    boolean mo167597o();
}
