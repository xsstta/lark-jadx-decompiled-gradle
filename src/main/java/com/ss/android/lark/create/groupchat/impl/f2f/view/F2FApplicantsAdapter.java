package com.ss.android.lark.create.groupchat.impl.f2f.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.C1356d;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.avatar.v2.ChatterAvatar;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.framework.ui.StableGridLayoutManager;
import com.larksuite.suite.R;
import com.ss.android.lark.create.groupchat.dto.ApplicantInfo;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#$B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0006\u0010\u0016\u001a\u00020\u0011J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011H\u0016J\u0014\u0010\u001e\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u000fJ\u000e\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0011J\b\u0010\"\u001a\u00020\nH\u0002R\u0010\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/view/F2FApplicantsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/create/groupchat/impl/f2f/view/F2FApplicantsAdapter$ApplicantsViewHolder;", "target", "Landroidx/recyclerview/widget/RecyclerView;", "(Landroidx/recyclerview/widget/RecyclerView;)V", "differ", "com/ss/android/lark/create/groupchat/impl/f2f/view/F2FApplicantsAdapter$differ$1", "Lcom/ss/android/lark/create/groupchat/impl/f2f/view/F2FApplicantsAdapter$differ$1;", "enabled", "", "originSet", "", "Lcom/ss/android/lark/create/groupchat/dto/ApplicantInfo;", "getFilterListByOrigin", "", "getItemCount", "", "getItemId", "", "position", "getItemViewType", "getOriginItemCount", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setupLayoutManager", "rootContainerWidth", "showEllipsis", "ApplicantsViewHolder", "Companion", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.c.a */
public final class F2FApplicantsAdapter extends RecyclerView.Adapter<ApplicantsViewHolder> {

    /* renamed from: a */
    public static final Companion f93626a = new Companion(null);

    /* renamed from: b */
    private boolean f93627b;

    /* renamed from: c */
    private final Set<ApplicantInfo> f93628c = new LinkedHashSet();

    /* renamed from: d */
    private final C36299d f93629d = new C36299d(this, this, new C36300e());

    /* renamed from: e */
    private final RecyclerView f93630e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0005J\u0006\u0010\u0018\u001a\u00020\u0013J\u0006\u0010\u0019\u001a\u00020\u0013J\u0012\u0010\u001a\u001a\u00020\u00132\b\b\u0001\u0010\u001b\u001a\u00020\u0005H\u0002J\u0006\u0010\u001c\u001a\u00020\u0013R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \t*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\n \t*\u0004\u0018\u00010\u00100\u0010X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \t*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/view/F2FApplicantsAdapter$ApplicantsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", ShareHitPoint.f121869d, "", "(Landroid/view/View;I)V", "avatar", "Lcom/larksuite/component/ui/avatar/v2/LarkAvatarView;", "kotlin.jvm.PlatformType", "countTV", "Landroid/widget/TextView;", "itemType", "getItemType", "()I", "roundBackground", "Lcom/larksuite/component/ui/layout/LKUIRoundableLayout;", "tvName", "bindChatter", "", "t", "Lcom/ss/android/lark/create/groupchat/dto/ApplicantInfo;", "bindEllipsis", "count", "bindEmpty", "bindGone", "setRoundBackgroundColor", "colorRes", "unbindView", "Companion", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.c.a$b */
    public static final class ApplicantsViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public static final Companion f93631a = new Companion(null);

        /* renamed from: b */
        private final LarkAvatarView f93632b;

        /* renamed from: c */
        private final TextView f93633c;

        /* renamed from: d */
        private final LKUIRoundableLayout f93634d;

        /* renamed from: e */
        private final TextView f93635e;

        /* renamed from: f */
        private final int f93636f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/view/F2FApplicantsAdapter$ApplicantsViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/create/groupchat/impl/f2f/view/F2FApplicantsAdapter$ApplicantsViewHolder;", "context", "Landroid/content/Context;", "viewType", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.c.a$b$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            /* renamed from: a */
            public final ApplicantsViewHolder mo133917a(Context context, int i) {
                Intrinsics.checkParameterIsNotNull(context, "context");
                View inflate = LayoutInflater.from(context).inflate(R.layout.item_group_applicants, (ViewGroup) null);
                Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
                return new ApplicantsViewHolder(inflate, i);
            }
        }

        /* renamed from: a */
        public final int mo133911a() {
            return this.f93636f;
        }

        /* renamed from: c */
        public final void mo133915c() {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            view.setVisibility(8);
        }

        /* renamed from: b */
        public final void mo133914b() {
            LKUIRoundableLayout lKUIRoundableLayout = this.f93634d;
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundableLayout, "roundBackground");
            lKUIRoundableLayout.setVisibility(0);
            this.f93634d.setBorderWidth(1.0f);
            m142913b(R.color.bg_body);
        }

        /* renamed from: d */
        public final void mo133916d() {
            this.f93632b.mo89077a(ChatterAvatar.class);
            TextView textView = this.f93633c;
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvName");
            CharSequence charSequence = null;
            textView.setText(charSequence);
            TextView textView2 = this.f93635e;
            Intrinsics.checkExpressionValueIsNotNull(textView2, "countTV");
            textView2.setText(charSequence);
            LarkAvatarView larkAvatarView = this.f93632b;
            Intrinsics.checkExpressionValueIsNotNull(larkAvatarView, "avatar");
            larkAvatarView.setVisibility(8);
            TextView textView3 = this.f93633c;
            Intrinsics.checkExpressionValueIsNotNull(textView3, "tvName");
            textView3.setVisibility(8);
            TextView textView4 = this.f93635e;
            Intrinsics.checkExpressionValueIsNotNull(textView4, "countTV");
            textView4.setVisibility(8);
            LKUIRoundableLayout lKUIRoundableLayout = this.f93634d;
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundableLayout, "roundBackground");
            lKUIRoundableLayout.setVisibility(8);
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            view.setVisibility(0);
            this.f93634d.setBorderWidth(BitmapDescriptorFactory.HUE_RED);
            m142913b(R.color.fill_disable);
        }

        /* renamed from: b */
        private final void m142913b(int i) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            this.f93634d.setBackgroundColor(ContextCompat.getColor(view.getContext(), i));
        }

        /* renamed from: a */
        public final void mo133912a(int i) {
            TextView textView = this.f93633c;
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvName");
            textView.setVisibility(0);
            TextView textView2 = this.f93635e;
            Intrinsics.checkExpressionValueIsNotNull(textView2, "countTV");
            textView2.setVisibility(0);
            LKUIRoundableLayout lKUIRoundableLayout = this.f93634d;
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundableLayout, "roundBackground");
            lKUIRoundableLayout.setVisibility(0);
            TextView textView3 = this.f93635e;
            Intrinsics.checkExpressionValueIsNotNull(textView3, "countTV");
            textView3.setText(String.valueOf(i));
            TextView textView4 = this.f93633c;
            Intrinsics.checkExpressionValueIsNotNull(textView4, "tvName");
            textView4.setText(UIHelper.mustacheFormat((int) R.string.Lark_NearbyGroup_CountOthers, "count", String.valueOf(i)));
        }

        /* renamed from: a */
        public final void mo133913a(ApplicantInfo aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "t");
            this.f93632b.mo89076a(((ChatterAvatar.Builder) ((ChatterAvatar.Builder) new ChatterAvatar.Builder().mo89081c(aVar.mo133784a()).mo88962a(aVar.mo133786c())).mo88967b(aVar.mo133784a())).mo88976k());
            TextView textView = this.f93633c;
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvName");
            textView.setText(aVar.mo133785b());
            LarkAvatarView larkAvatarView = this.f93632b;
            Intrinsics.checkExpressionValueIsNotNull(larkAvatarView, "avatar");
            larkAvatarView.setVisibility(0);
            TextView textView2 = this.f93633c;
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tvName");
            textView2.setVisibility(0);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ApplicantsViewHolder(View view, int i) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f93632b = (LarkAvatarView) view.findViewById(R.id.avatar);
            this.f93633c = (TextView) view.findViewById(R.id.tv_user_name);
            this.f93634d = (LKUIRoundableLayout) view.findViewById(R.id.round_layout);
            this.f93635e = (TextView) view.findViewById(R.id.remain_counts);
            this.f93636f = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/view/F2FApplicantsAdapter$Companion;", "", "()V", "FORMAT_KEY", "", "ID_ELLIPSIS", "", "ID_EMPTY", "ITEM_WIDTH", "", "LOG_TAG", "MAX_ITEM_LIMIT", "SCREEN_WIDTH_MIDDLE", "SCREEN_WIDTH_MIN", "SPAN_COUNT_HDPI", "SPAN_COUNT_LDPI", "SPAN_COUNT_MDPI", "TYPE_ELLIPSIS", "TYPE_EMPTY", "TYPE_GONE", "TYPE_NORMAL", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.c.a$c */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/create/groupchat/impl/f2f/view/F2FApplicantsAdapter$differ$2", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ss/android/lark/create/groupchat/dto/ApplicantInfo;", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.c.a$e */
    public static final class C36300e extends C1374g.AbstractC1378c<ApplicantInfo> {
        C36300e() {
        }

        /* renamed from: a */
        public boolean areItemsTheSame(ApplicantInfo aVar, ApplicantInfo aVar2) {
            Intrinsics.checkParameterIsNotNull(aVar, "oldItem");
            Intrinsics.checkParameterIsNotNull(aVar2, "newItem");
            return Intrinsics.areEqual(aVar, aVar2);
        }

        /* renamed from: b */
        public boolean areContentsTheSame(ApplicantInfo aVar, ApplicantInfo aVar2) {
            Intrinsics.checkParameterIsNotNull(aVar, "oldItem");
            Intrinsics.checkParameterIsNotNull(aVar2, "newItem");
            return Intrinsics.areEqual(aVar, aVar2);
        }
    }

    /* renamed from: a */
    public final int mo133905a() {
        return this.f93628c.size();
    }

    /* renamed from: b */
    private final boolean m142906b() {
        if (mo133905a() > 200) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (m142906b()) {
            return this.f93629d.mo7374a().size() + 2;
        }
        return this.f93629d.mo7374a().size() + 1;
    }

    /* renamed from: c */
    private final List<ApplicantInfo> m142907c() {
        List mutableList = CollectionsKt.toMutableList((Collection) this.f93628c);
        if (mutableList.size() > 1) {
            CollectionsKt.sortWith(mutableList, new C36298a());
        }
        int i = LocationRequest.PRIORITY_HD_ACCURACY;
        if (m142906b()) {
            i = 199;
        }
        return CollectionsKt.take(mutableList, i);
    }

    public F2FApplicantsAdapter(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "target");
        this.f93630e = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        int i2;
        if (i == getItemCount() - 1) {
            return (long) 65535;
        }
        ApplicantInfo aVar = (ApplicantInfo) this.f93629d.mo7374a().get(i);
        if (!m142906b() || i != getItemCount() - 2) {
            i2 = aVar.hashCode();
        } else {
            i2 = 1048575;
        }
        return (long) i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (mo133905a() < 200) {
            if (i == getItemCount() - 1) {
                return -1;
            }
            return 0;
        } else if (mo133905a() == 200) {
            if (i == getItemCount() - 1) {
                return 2;
            }
            return 0;
        } else if (!m142906b() || i == getItemCount() - 1) {
            return 2;
        } else {
            if (i == getItemCount() - 2) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo133907a(int i) {
        int i2;
        if (!this.f93627b) {
            this.f93627b = true;
            this.f93630e.setVisibility(0);
            Context context = this.f93630e.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "target.context");
            Resources resources = context.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "target.context.resources");
            float f = ((float) i) / resources.getDisplayMetrics().density;
            if (f < 352.0f) {
                i2 = 4;
            } else if (f < 352.0f || f >= 490.0f) {
                i2 = 8;
            } else {
                i2 = 5;
            }
            RecyclerView.ItemAnimator itemAnimator = this.f93630e.getItemAnimator();
            if (itemAnimator != null) {
                ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
                RecyclerView recyclerView = this.f93630e;
                recyclerView.setLayoutManager(new StableGridLayoutManager(recyclerView.getContext(), i2));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        }
    }

    /* renamed from: a */
    public final void mo133909a(List<ApplicantInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f93628c.addAll(list);
        this.f93629d.mo7376a(m142907c());
        if (m142906b()) {
            notifyItemChanged(getItemCount() - 2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.c.a$a */
    public static final class C36298a<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(t.mo133787d()), Integer.valueOf(t2.mo133787d()));
        }
    }

    /* renamed from: a */
    public ApplicantsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        ApplicantsViewHolder.Companion aVar = ApplicantsViewHolder.f93631a;
        Context context = viewGroup.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
        return aVar.mo133917a(context, i);
    }

    /* renamed from: a */
    public void onBindViewHolder(ApplicantsViewHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        bVar.mo133916d();
        int a = bVar.mo133911a();
        if (a == -1) {
            bVar.mo133914b();
        } else if (a == 0) {
            Object obj = this.f93629d.mo7374a().get(i);
            Intrinsics.checkExpressionValueIsNotNull(obj, "differ.currentList[position]");
            bVar.mo133913a((ApplicantInfo) obj);
        } else if (a == 1) {
            bVar.mo133912a((mo133905a() - 200) + 1);
        } else if (a == 2) {
            bVar.mo133915c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/ss/android/lark/create/groupchat/impl/f2f/view/F2FApplicantsAdapter$differ$1", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/ss/android/lark/create/groupchat/dto/ApplicantInfo;", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.c.a$d */
    public static final class C36299d extends C1356d<ApplicantInfo> {

        /* renamed from: d */
        final /* synthetic */ F2FApplicantsAdapter f93637d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36299d(F2FApplicantsAdapter aVar, RecyclerView.Adapter adapter, C1374g.AbstractC1378c cVar) {
            super(adapter, cVar);
            this.f93637d = aVar;
        }
    }
}
