package com.ss.android.lark.moments.impl.feed.hotcomment;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.impl.common.span.FakeBoldSpan;
import com.ss.android.lark.moments.impl.common.utils.ImageUtils;
import com.ss.android.lark.moments.impl.commonvo.IMomentsUser;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment;
import com.ss.android.lark.moments.impl.detail.MomentsDetailLauncher;
import com.ss.android.lark.moments.impl.feed.nineimage.MomentsDialogMenuClickListener;
import com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000b\fB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/hotcomment/FeedCommentViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsComment;", "Landroid/view/View;", "itemView", "(Landroid/view/View;)V", "bindComment", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "bindImage", "onBind", "Companion", "LineSpan", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.b.a */
public final class FeedCommentViewHolder extends AbstractC58967a<IMomentsComment, View> {

    /* renamed from: a */
    public static final Companion f119813a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/hotcomment/FeedCommentViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/moments/impl/feed/hotcomment/FeedCommentViewHolder;", "parent", "Landroid/view/ViewGroup;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final FeedCommentViewHolder mo166950a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moments_feed_comment_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new FeedCommentViewHolder(inflate);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J<\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/hotcomment/FeedCommentViewHolder$LineSpan;", "Landroid/text/style/LineHeightSpan;", "fontMetrics", "Landroid/graphics/Paint$FontMetrics;", "(Landroid/graphics/Paint$FontMetrics;)V", "chooseHeight", "", "text", "", "start", "", "end", "spanstartv", "lineHeight", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.b.a$b */
    public static final class LineSpan implements LineHeightSpan {

        /* renamed from: a */
        private final Paint.FontMetrics f119814a;

        public LineSpan(Paint.FontMetrics fontMetrics) {
            Intrinsics.checkParameterIsNotNull(fontMetrics, "fontMetrics");
            this.f119814a = fontMetrics;
        }

        public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
            if (fontMetricsInt != null) {
                fontMetricsInt.descent = (int) this.f119814a.descent;
                fontMetricsInt.top = (int) this.f119814a.top;
                fontMetricsInt.ascent = (int) this.f119814a.ascent;
                fontMetricsInt.bottom = (int) this.f119814a.bottom;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedCommentViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    /* renamed from: a */
    public void mo165944a(IMomentsComment aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super.mo165944a((Object) aVar);
        m188243b(aVar);
        m188244c(aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/feed/hotcomment/FeedCommentViewHolder$bindComment$4", "Lcom/ss/android/lark/reaction/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.b.a$c */
    public static final class C47494c extends AbstractView$OnClickListenerC52989b {

        /* renamed from: a */
        final /* synthetic */ FeedCommentViewHolder f119815a;

        /* renamed from: b */
        final /* synthetic */ IMomentsComment f119816b;

        @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
        /* renamed from: a */
        public void mo122732a(View view) {
            MomentsDetailLauncher eVar = MomentsDetailLauncher.f119660a;
            View view2 = this.f119815a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            Context context = view2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
            String str = this.f119816b.mo166412w().post_id;
            Intrinsics.checkExpressionValueIsNotNull(str, "data.comment.post_id");
            MomentsDetailLauncher.m187945a(eVar, context, str, false, this.f119816b.mo166379a(), "feed_page", false, false, 96, (Object) null);
        }

        C47494c(FeedCommentViewHolder aVar, IMomentsComment aVar2) {
            this.f119815a = aVar;
            this.f119816b = aVar2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/feed/hotcomment/FeedCommentViewHolder$bindImage$1", "Lcom/ss/android/lark/reaction/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.b.a$d */
    public static final class C47495d extends AbstractView$OnClickListenerC52989b {

        /* renamed from: a */
        final /* synthetic */ FeedCommentViewHolder f119817a;

        /* renamed from: b */
        final /* synthetic */ ImageSet f119818b;

        @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
        /* renamed from: a */
        public void mo122732a(View view) {
            List<PhotoItem> a = C58659h.m227513a(CollectionsKt.listOf(MomentsDependencyHolder.f118998b.mo165899a().imageDependency().mo144713a(this.f119818b)));
            C58630d.C58631a b = C58630d.m227364a().mo198658a(view).mo198667a(new ArrayList<>(a)).mo198657a(0).mo198674c(false).mo198675d(true).mo198676e(false).mo198678g(false).mo198677f(false).mo198679h(false).mo198664a(new MomentsDialogMenuClickListener()).mo198668a(true).mo198659a(Biz.Moments).mo198660a(Scene.Moments).mo198672b(1);
            View view2 = this.f119817a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            Context context = view2.getContext();
            if (context != null) {
                b.mo198669a((Activity) context);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }

        C47495d(FeedCommentViewHolder aVar, ImageSet imageSet) {
            this.f119817a = aVar;
            this.f119818b = imageSet;
        }
    }

    /* renamed from: c */
    private final void m188244c(IMomentsComment aVar) {
        ImageSet c = aVar.mo166389c();
        if (c == null || !ImageUtils.f119250a.mo166202a(c)) {
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
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        int dp2px = UIUtils.dp2px(view4.getContext(), 72.0f);
        ImageUtils bVar = ImageUtils.f119250a;
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        LKUIRoundedImageView2 lKUIRoundedImageView23 = (LKUIRoundedImageView2) view5.findViewById(R.id.comment_image);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView23, "itemView.comment_image");
        ImageUtils.m187225a(bVar, c, lKUIRoundedImageView23, dp2px, dp2px, null, 16, null);
        View view6 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
        ((LKUIRoundedImageView2) view6.findViewById(R.id.comment_image)).setOnClickListener(new C47495d(this, c));
    }

    /* renamed from: b */
    private final void m188243b(IMomentsComment aVar) {
        int i;
        MomentUser.Type type;
        String str;
        String str2;
        RichText b = aVar.mo166386b();
        String str3 = null;
        if (aVar.mo166397i()) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.hot_tag_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.hot_tag_tv");
            textView.setVisibility(0);
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(R.id.hot_tag_icon);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "itemView.hot_tag_icon");
            appCompatImageView.setVisibility(0);
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            TextView textView2 = (TextView) view3.findViewById(R.id.tv_baseline);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.tv_baseline");
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            if (!(layoutParams instanceof ConstraintLayout.LayoutParams)) {
                layoutParams = null;
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.f2816h = R.id.hot_tag_tv;
                layoutParams2.f2819k = R.id.hot_tag_tv;
            }
            View view4 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            TextView textView3 = (TextView) view4.findViewById(R.id.hot_tag_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.hot_tag_tv");
            FakeBoldSpan.Companion aVar2 = FakeBoldSpan.f119246a;
            View view5 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            textView3.setText(aVar2.mo166167a(UIUtils.getString(view5.getContext(), R.string.Lark_Community_HotComments)));
            View view6 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
            TextView textView4 = (TextView) view6.findViewById(R.id.hot_tag_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.hot_tag_tv");
            TextPaint paint = textView4.getPaint();
            View view7 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
            TextView textView5 = (TextView) view7.findViewById(R.id.hot_tag_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "itemView.hot_tag_tv");
            float measureText = paint.measureText(textView5.getText().toString());
            View view8 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
            i = UIUtils.dp2px(view8.getContext(), 26.0f) + ((int) measureText);
        } else {
            View view9 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
            TextView textView6 = (TextView) view9.findViewById(R.id.hot_tag_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "itemView.hot_tag_tv");
            textView6.setVisibility(8);
            View view10 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view10.findViewById(R.id.hot_tag_icon);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "itemView.hot_tag_icon");
            appCompatImageView2.setVisibility(8);
            View view11 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view11, "itemView");
            TextView textView7 = (TextView) view11.findViewById(R.id.tv_baseline);
            Intrinsics.checkExpressionValueIsNotNull(textView7, "itemView.tv_baseline");
            ViewGroup.LayoutParams layoutParams3 = textView7.getLayoutParams();
            if (!(layoutParams3 instanceof ConstraintLayout.LayoutParams)) {
                layoutParams3 = null;
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            if (layoutParams4 != null) {
                layoutParams4.f2816h = R.id.root;
                layoutParams4.f2819k = -1;
            }
            i = 0;
        }
        IMomentsUser y = aVar.mo166414y();
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
        View view12 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view12, "itemView");
        CharSequence a = C59035h.m229203a(b, false, false, true, false, UIUtils.getColor(view12.getContext(), R.color.text_caption));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + ':');
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard(i, 0), 0, spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(new FakeBoldSpan(), 0, length, 33);
        spannableStringBuilder.append((CharSequence) "\b");
        spannableStringBuilder.append(a);
        View view13 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view13, "itemView");
        spannableStringBuilder.setSpan(new ForegroundColorSpan(UIUtils.getColor(view13.getContext(), R.color.text_caption)), length, spannableStringBuilder.length(), 33);
        View view14 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view14, "itemView");
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView = (EllipsizedEmojiconTextView) view14.findViewById(R.id.comment_digest);
        Intrinsics.checkExpressionValueIsNotNull(ellipsizedEmojiconTextView, "itemView.comment_digest");
        TextPaint paint2 = ellipsizedEmojiconTextView.getPaint();
        Intrinsics.checkExpressionValueIsNotNull(paint2, "itemView.comment_digest.paint");
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        Intrinsics.checkExpressionValueIsNotNull(fontMetrics, "itemView.comment_digest.paint.fontMetrics");
        spannableStringBuilder.setSpan(new LineSpan(fontMetrics), length, spannableStringBuilder.length(), 33);
        View view15 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view15, "itemView");
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView2 = (EllipsizedEmojiconTextView) view15.findViewById(R.id.comment_digest);
        Intrinsics.checkExpressionValueIsNotNull(ellipsizedEmojiconTextView2, "itemView.comment_digest");
        ellipsizedEmojiconTextView2.setText(spannableStringBuilder);
        View view16 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view16, "itemView");
        ((EllipsizedEmojiconTextView) view16.findViewById(R.id.comment_digest)).setShouldEllipsized(false);
        this.itemView.setOnClickListener(new C47494c(this, aVar));
    }
}
