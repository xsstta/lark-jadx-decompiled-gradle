package com.ss.android.lark.moments.impl.publish.hashtag;

import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B0\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0002\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R,\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/hashtag/AssociationViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$AssociationItem;", "Landroid/view/View;", "itemView", "onClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", ChatTypeStateKeeper.f135670e, "", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "onBind", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.publish.hashtag.b */
public final class AssociationViewHolder extends AbstractC58967a<MomentsPublishViewModel.AssociationItem, View> {

    /* renamed from: a */
    public static final Companion f120797a = new Companion(null);

    /* renamed from: b */
    private final Function1<String, Unit> f120798b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/hashtag/AssociationViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/moments/impl/publish/hashtag/AssociationViewHolder;", "parent", "Landroid/view/ViewGroup;", "onClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", ChatTypeStateKeeper.f135670e, "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.hashtag.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AssociationViewHolder mo168104a(ViewGroup viewGroup, Function1<? super String, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            Intrinsics.checkParameterIsNotNull(function1, "onClick");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moments_association_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new AssociationViewHolder(inflate, function1);
        }
    }

    /* renamed from: a */
    public final Function1<String, Unit> mo168102a() {
        return this.f120798b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/publish/hashtag/AssociationViewHolder$onBind$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.hashtag.b$b */
    public static final class C47985b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ AssociationViewHolder f120799a;

        /* renamed from: b */
        final /* synthetic */ MomentsPublishViewModel.AssociationItem f120800b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f120799a.mo168102a().invoke(((MomentsPublishViewModel.AssociationItem.InputItem) this.f120800b).mo167885a());
        }

        C47985b(AssociationViewHolder bVar, MomentsPublishViewModel.AssociationItem bVar2) {
            this.f120799a = bVar;
            this.f120800b = bVar2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/publish/hashtag/AssociationViewHolder$onBind$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.hashtag.b$c */
    public static final class C47986c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ AssociationViewHolder f120801a;

        /* renamed from: b */
        final /* synthetic */ MomentsPublishViewModel.AssociationItem f120802b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f120801a.mo168102a().invoke(((MomentsPublishViewModel.AssociationItem.MatchItem) this.f120802b).mo167890a());
        }

        C47986c(AssociationViewHolder bVar, MomentsPublishViewModel.AssociationItem bVar2) {
            this.f120801a = bVar;
            this.f120802b = bVar2;
        }
    }

    /* renamed from: a */
    public void mo165944a(MomentsPublishViewModel.AssociationItem bVar) {
        String str;
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super.mo165944a((Object) bVar);
        if (bVar instanceof MomentsPublishViewModel.AssociationItem.InputItem) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            ((TextView) view.findViewById(R.id.topicName)).setTextColor(C52990a.m205239c(view2.getContext(), R.color.text_link_normal));
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            TextView textView = (TextView) view3.findViewById(R.id.topicName);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.topicName");
            MomentsPublishViewModel.AssociationItem.InputItem aVar = (MomentsPublishViewModel.AssociationItem.InputItem) bVar;
            textView.setText(aVar.mo167885a());
            if (aVar.mo167886b()) {
                View view4 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                TextView textView2 = (TextView) view4.findViewById(R.id.topicStatus);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.topicStatus");
                View view5 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
                textView2.setText(C52990a.m205228a(view5.getContext(), (int) R.string.Lark_Community_NewHashtag));
                View view6 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
                TextView textView3 = (TextView) view6.findViewById(R.id.topicStatus);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.topicStatus");
                textView3.setVisibility(0);
            } else {
                View view7 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
                TextView textView4 = (TextView) view7.findViewById(R.id.topicStatus);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.topicStatus");
                textView4.setText("");
                View view8 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
                TextView textView5 = (TextView) view8.findViewById(R.id.topicStatus);
                Intrinsics.checkExpressionValueIsNotNull(textView5, "itemView.topicStatus");
                textView5.setVisibility(8);
            }
            this.itemView.setOnClickListener(new C47985b(this, bVar));
        } else if (bVar instanceof MomentsPublishViewModel.AssociationItem.MatchItem) {
            View view9 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
            View view10 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
            ((TextView) view9.findViewById(R.id.topicName)).setTextColor(C52990a.m205239c(view10.getContext(), R.color.text_link_normal));
            View view11 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view11, "itemView");
            TextView textView6 = (TextView) view11.findViewById(R.id.topicName);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "itemView.topicName");
            MomentsPublishViewModel.AssociationItem.MatchItem bVar2 = (MomentsPublishViewModel.AssociationItem.MatchItem) bVar;
            textView6.setText(bVar2.mo167890a());
            View view12 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view12, "itemView");
            TextView textView7 = (TextView) view12.findViewById(R.id.topicStatus);
            Intrinsics.checkExpressionValueIsNotNull(textView7, "itemView.topicStatus");
            if (bVar2.mo167891b() > 9999) {
                str = UIHelper.getString(R.string.Lark_Community_NewPost9999Reactions);
            } else {
                str = UIHelper.getQuantityString(R.plurals.Lark_Community_TopicsNumberTimesEngagement, bVar2.mo167891b());
            }
            textView7.setText(str);
            View view13 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view13, "itemView");
            TextView textView8 = (TextView) view13.findViewById(R.id.topicStatus);
            Intrinsics.checkExpressionValueIsNotNull(textView8, "itemView.topicStatus");
            textView8.setVisibility(0);
            this.itemView.setOnClickListener(new C47986c(this, bVar));
        }
        View view14 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view14, "itemView");
        TextView textView9 = (TextView) view14.findViewById(R.id.topicStatus);
        Intrinsics.checkExpressionValueIsNotNull(textView9, "itemView.topicStatus");
        TextPaint paint = textView9.getPaint();
        View view15 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view15, "itemView");
        TextView textView10 = (TextView) view15.findViewById(R.id.topicStatus);
        Intrinsics.checkExpressionValueIsNotNull(textView10, "itemView.topicStatus");
        View view16 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view16, "itemView");
        int measureText = ((int) paint.measureText(textView10.getText().toString())) + C52990a.m205224a(view16.getContext(), 28.0f);
        View view17 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view17, "itemView");
        TextView textView11 = (TextView) view17.findViewById(R.id.topicName);
        Intrinsics.checkExpressionValueIsNotNull(textView11, "itemView.topicName");
        TextView textView12 = textView11;
        textView12.setPadding(textView12.getPaddingLeft(), textView12.getPaddingTop(), measureText, textView12.getPaddingBottom());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AssociationViewHolder(View view, Function1<? super String, Unit> function1) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(function1, "onClick");
        this.f120798b = function1;
    }
}
