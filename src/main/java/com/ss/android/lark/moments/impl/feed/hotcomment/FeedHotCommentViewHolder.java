package com.ss.android.lark.moments.impl.feed.hotcomment;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lark.pb.basic.v1.Image;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.impl.common.span.FakeBoldSpan;
import com.ss.android.lark.moments.impl.commonvo.IMomentsUser;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment;
import com.ss.android.lark.moments.impl.detail.MomentsDetailLauncher;
import com.ss.android.lark.moments.impl.feed.nineimage.MomentsDialogMenuClickListener;
import com.ss.android.lark.moments.impl.feed.nineimage.NineImageViewHolder;
import com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/hotcomment/FeedHotCommentViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsComment;", "Landroid/view/View;", "itemView", "(Landroid/view/View;)V", "bindComment", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "bindImage", "calculateImageSize", "", "imageSet", "Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "getSingleMaxWidth", "", "onBind", "Companion", "LineSpan", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.b.c */
public final class FeedHotCommentViewHolder extends AbstractC58967a<IMomentsComment, View> {

    /* renamed from: a */
    public static final Companion f119821a = new Companion(null);

    /* renamed from: b */
    private static final int f119822b = UIHelper.dp2px(100.0f);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/hotcomment/FeedHotCommentViewHolder$Companion;", "", "()V", "IMAGE_SIZE", "", "create", "Lcom/ss/android/lark/moments/impl/feed/hotcomment/FeedHotCommentViewHolder;", "parent", "Landroid/view/ViewGroup;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.b.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final FeedHotCommentViewHolder mo166955a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moments_item_hot_comment, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new FeedHotCommentViewHolder(inflate);
        }
    }

    /* renamed from: a */
    private final int m188252a() {
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        return (int) (((float) DeviceUtils.getScreenWidth(view.getContext())) * 0.6f);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J<\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/hotcomment/FeedHotCommentViewHolder$LineSpan;", "Landroid/text/style/LineHeightSpan;", "fontMetrics", "Landroid/graphics/Paint$FontMetrics;", "(Landroid/graphics/Paint$FontMetrics;)V", "chooseHeight", "", "text", "", "start", "", "end", "spanstartv", "lineHeight", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.b.c$b */
    public static final class LineSpan implements LineHeightSpan {

        /* renamed from: a */
        private final Paint.FontMetrics f119823a;

        public LineSpan(Paint.FontMetrics fontMetrics) {
            Intrinsics.checkParameterIsNotNull(fontMetrics, "fontMetrics");
            this.f119823a = fontMetrics;
        }

        public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
            if (fontMetricsInt != null) {
                fontMetricsInt.descent = (int) this.f119823a.descent;
                fontMetricsInt.top = (int) this.f119823a.top;
                fontMetricsInt.ascent = (int) this.f119823a.ascent;
                fontMetricsInt.bottom = (int) this.f119823a.bottom;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedHotCommentViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    /* renamed from: a */
    public void mo165944a(IMomentsComment aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super.mo165944a((Object) aVar);
        m188254b(aVar);
        m188255c(aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/feed/hotcomment/FeedHotCommentViewHolder$bindComment$1", "Lcom/ss/android/lark/reaction/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.b.c$c */
    public static final class C47496c extends AbstractView$OnClickListenerC52989b {

        /* renamed from: a */
        final /* synthetic */ FeedHotCommentViewHolder f119824a;

        /* renamed from: b */
        final /* synthetic */ IMomentsComment f119825b;

        @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
        /* renamed from: a */
        public void mo122732a(View view) {
            MomentsDetailLauncher eVar = MomentsDetailLauncher.f119660a;
            View view2 = this.f119824a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            Context context = view2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
            String str = this.f119825b.mo166412w().post_id;
            Intrinsics.checkExpressionValueIsNotNull(str, "data.comment.post_id");
            MomentsDetailLauncher.m187945a(eVar, context, str, false, this.f119825b.mo166379a(), "feed_page", false, false, 96, (Object) null);
        }

        C47496c(FeedHotCommentViewHolder cVar, IMomentsComment aVar) {
            this.f119824a = cVar;
            this.f119825b = aVar;
        }
    }

    /* renamed from: a */
    private final int[] m188253a(ImageSet imageSet) {
        int i;
        int i2;
        Integer num;
        Integer num2;
        Image image = imageSet.origin;
        if (image == null || (num2 = image.width) == null) {
            i = 0;
        } else {
            i = num2.intValue();
        }
        if (image == null || (num = image.height) == null) {
            i2 = 0;
        } else {
            i2 = num.intValue();
        }
        int[] a = ImageUtils.m224135a(i, i2, m188252a(), m188252a(), NineImageViewHolder.f120005c.mo167104a(), NineImageViewHolder.f120005c.mo167104a());
        a[0] = (int) (((float) a[0]) * 0.75f);
        a[1] = (int) (((float) a[1]) * 0.75f);
        Intrinsics.checkExpressionValueIsNotNull(a, "sizeArray");
        return a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/feed/hotcomment/FeedHotCommentViewHolder$bindImage$1", "Lcom/ss/android/lark/reaction/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.b.c$d */
    public static final class C47497d extends AbstractView$OnClickListenerC52989b {

        /* renamed from: a */
        final /* synthetic */ FeedHotCommentViewHolder f119826a;

        /* renamed from: b */
        final /* synthetic */ ImageSet f119827b;

        @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
        /* renamed from: a */
        public void mo122732a(View view) {
            List<PhotoItem> a = C58659h.m227513a(CollectionsKt.listOf(MomentsDependencyHolder.f118998b.mo165899a().imageDependency().mo144713a(this.f119827b)));
            C58630d.C58631a b = C58630d.m227364a().mo198658a(view).mo198667a(new ArrayList<>(a)).mo198657a(0).mo198674c(false).mo198675d(true).mo198676e(false).mo198678g(false).mo198677f(false).mo198679h(false).mo198664a(new MomentsDialogMenuClickListener()).mo198668a(true).mo198659a(Biz.Moments).mo198660a(Scene.Moments).mo198672b(1);
            View view2 = this.f119826a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            Context context = view2.getContext();
            if (context != null) {
                b.mo198669a((Activity) context);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }

        C47497d(FeedHotCommentViewHolder cVar, ImageSet imageSet) {
            this.f119826a = cVar;
            this.f119827b = imageSet;
        }
    }

    /* renamed from: b */
    private final void m188254b(IMomentsComment aVar) {
        MomentUser.Type type;
        String str;
        String str2;
        RichText b = aVar.mo166386b();
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView = (EllipsizedEmojiconTextView) view.findViewById(R.id.comment_digest);
        Intrinsics.checkExpressionValueIsNotNull(ellipsizedEmojiconTextView, "itemView.comment_digest");
        ellipsizedEmojiconTextView.setVisibility(0);
        IMomentsUser y = aVar.mo166414y();
        String str3 = null;
        if (y != null) {
            type = y.mo166368g();
        } else {
            type = null;
        }
        if (type == MomentUser.Type.ANONYMOUS) {
            IMomentsUser y2 = aVar.mo166414y();
            if (y2 != null) {
                str2 = y2.mo166363b();
            } else {
                str2 = null;
            }
            if (Intrinsics.areEqual(str2, "0")) {
                str = UIHelper.getString(R.string.Lark_Community_AnonymousUser);
            } else {
                IMomentsUser y3 = aVar.mo166414y();
                if (y3 != null) {
                    str3 = y3.mo166363b();
                }
                str = UIHelper.mustacheFormat((int) R.string.Lark_Community_SpectatorNumber, "number", str3);
            }
        } else {
            IMomentsUser y4 = aVar.mo166414y();
            if (y4 == null || (str = y4.mo166361a()) == null) {
                str = "";
            }
        }
        CharSequence a = C59035h.m229203a(b, false, false, true, false, UIHelper.getColor(R.color.ud_N700));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + ":\b");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new FakeBoldSpan(), 0, length, 33);
        spannableStringBuilder.append(a);
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView2 = (EllipsizedEmojiconTextView) view2.findViewById(R.id.comment_digest);
        Intrinsics.checkExpressionValueIsNotNull(ellipsizedEmojiconTextView2, "itemView.comment_digest");
        TextPaint paint = ellipsizedEmojiconTextView2.getPaint();
        Intrinsics.checkExpressionValueIsNotNull(paint, "itemView.comment_digest.paint");
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        Intrinsics.checkExpressionValueIsNotNull(fontMetrics, "itemView.comment_digest.paint.fontMetrics");
        spannableStringBuilder.setSpan(new LineSpan(fontMetrics), length, spannableStringBuilder.length(), 33);
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView3 = (EllipsizedEmojiconTextView) view3.findViewById(R.id.comment_digest);
        Intrinsics.checkExpressionValueIsNotNull(ellipsizedEmojiconTextView3, "itemView.comment_digest");
        ellipsizedEmojiconTextView3.setText(spannableStringBuilder);
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        ((EllipsizedEmojiconTextView) view4.findViewById(R.id.comment_digest)).setShouldEllipsized(false);
        this.itemView.setOnClickListener(new C47496c(this, aVar));
    }

    /* renamed from: c */
    private final void m188255c(IMomentsComment aVar) {
        ImageSet c = aVar.mo166389c();
        if (c == null || !com.ss.android.lark.moments.impl.common.utils.ImageUtils.f119250a.mo166202a(c)) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) view.findViewById(R.id.comment_image);
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "itemView.comment_image");
            lKUIRoundedImageView2.setVisibility(8);
            return;
        }
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        LKUIRoundedImageView2 lKUIRoundedImageView22 = (LKUIRoundedImageView2) view2.findViewById(R.id.comment_image);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView22, "itemView.comment_image");
        lKUIRoundedImageView22.setVisibility(0);
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        ((LKUIRoundedImageView2) view3.findViewById(R.id.comment_image)).setBorderColor(C25653b.m91893a(UIHelper.getColor(R.color.ud_N900), 0.15f));
        int[] a = m188253a(c);
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        LKUIRoundedImageView2 lKUIRoundedImageView23 = (LKUIRoundedImageView2) view4.findViewById(R.id.comment_image);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView23, "itemView.comment_image");
        ViewGroup.LayoutParams layoutParams = lKUIRoundedImageView23.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = a[0];
            marginLayoutParams.height = a[1];
            com.ss.android.lark.moments.impl.common.utils.ImageUtils bVar = com.ss.android.lark.moments.impl.common.utils.ImageUtils.f119250a;
            View view5 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            LKUIRoundedImageView2 lKUIRoundedImageView24 = (LKUIRoundedImageView2) view5.findViewById(R.id.comment_image);
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView24, "itemView.comment_image");
            com.ss.android.lark.moments.impl.common.utils.ImageUtils.m187225a(bVar, c, lKUIRoundedImageView24, a[0], a[1], null, 16, null);
            View view6 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
            ((LKUIRoundedImageView2) view6.findViewById(R.id.comment_image)).setOnClickListener(new C47497d(this, c));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
