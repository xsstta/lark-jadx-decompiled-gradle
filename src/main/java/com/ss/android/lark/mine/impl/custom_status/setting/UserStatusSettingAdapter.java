package com.ss.android.lark.mine.impl.custom_status.setting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.impl.custom_status.CustomStatusUIUtils;
import com.ss.android.lark.mine.impl.custom_status.setting.ExpandableAdapter;
import com.ss.android.lark.mine.impl.custom_status.statistics.UserCustomStatusHitPoint;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000  2\u001c\u0012\b\u0012\u00060\u0002R\u00020\u0000\u0012\b\u0012\u00060\u0003R\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0001:\u0004 !\"#B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0016J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0016J\u0018\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\bH\u0016J\u0018\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006$"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/setting/UserStatusSettingAdapter;", "Lcom/ss/android/lark/mine/impl/custom_status/setting/ExpandableAdapter;", "Lcom/ss/android/lark/mine/impl/custom_status/setting/UserStatusSettingAdapter$UserStatusViewHolder;", "Lcom/ss/android/lark/mine/impl/custom_status/setting/UserStatusSettingAdapter$FooterViewHolder;", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "context", "Landroid/content/Context;", "threshold", "", "onStatusClickListener", "Lcom/ss/android/lark/mine/impl/custom_status/setting/UserStatusSettingAdapter$OnStatusClickListener;", "(Landroid/content/Context;ILcom/ss/android/lark/mine/impl/custom_status/setting/UserStatusSettingAdapter$OnStatusClickListener;)V", "getOnStatusClickListener", "()Lcom/ss/android/lark/mine/impl/custom_status/setting/UserStatusSettingAdapter$OnStatusClickListener;", "createFooterItem", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "displayState", "Lcom/ss/android/lark/mine/impl/custom_status/setting/ExpandableAdapter$DisplayState;", "createNormalItem", "isDataContentTheSame", "", "oldData", "newData", "isDataTheSame", "isItemTheSame", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "Companion", "FooterViewHolder", "OnStatusClickListener", "UserStatusViewHolder", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.j */
public final class UserStatusSettingAdapter extends ExpandableAdapter<UserStatusViewHolder, FooterViewHolder, UserCustomStatus> {

    /* renamed from: a */
    public static final Companion f115272a = new Companion(null);

    /* renamed from: b */
    private final OnStatusClickListener f115273b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/setting/UserStatusSettingAdapter$OnStatusClickListener;", "", "onClick", "", "context", "Landroid/content/Context;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.j$c */
    public interface OnStatusClickListener {
        /* renamed from: a */
        void mo160739a(Context context, UserCustomStatus userCustomStatus);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/setting/UserStatusSettingAdapter$Companion;", "", "()V", "TAG", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.j$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: f */
    public final OnStatusClickListener mo160753f() {
        return this.f115273b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/setting/UserStatusSettingAdapter$FooterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "displayState", "Lcom/ss/android/lark/mine/impl/custom_status/setting/ExpandableAdapter$DisplayState;", "(Lcom/ss/android/lark/mine/impl/custom_status/setting/UserStatusSettingAdapter;Landroid/view/View;Lcom/ss/android/lark/mine/impl/custom_status/setting/ExpandableAdapter$DisplayState;)V", "getDisplayState", "()Lcom/ss/android/lark/mine/impl/custom_status/setting/ExpandableAdapter$DisplayState;", "bind", "", "bind$core_mine_release", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.j$b */
    public final class FooterViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ UserStatusSettingAdapter f115274a;

        /* renamed from: b */
        private final ExpandableAdapter.DisplayState f115275b;

        /* renamed from: a */
        public final void mo160754a() {
            TextView textView = (TextView) this.itemView.findViewById(R.id.text);
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.itemView.findViewById(R.id.icon);
            int i = C45651k.f115281a[this.f115275b.ordinal()];
            if (i == 1) {
                Intrinsics.checkExpressionValueIsNotNull(textView, "text");
                textView.setText(UIHelper.getString(R.string.Lark_Profile_ShowAll));
                appCompatImageView.setImageDrawable(UIUtils.getDrawable(this.f115274a.mo160714e(), R.drawable.ud_icon_down_outlined));
                this.itemView.setOnClickListener(new View$OnClickListenerC45648a(this));
            } else if (i != 2) {
                Log.m165383e("UserStatusSettingAdapter", "invalid display type: " + this.f115275b);
            } else {
                Intrinsics.checkExpressionValueIsNotNull(textView, "text");
                textView.setText(UIHelper.getString(R.string.Lark_Profile_Hide));
                appCompatImageView.setImageDrawable(UIUtils.getDrawable(this.f115274a.mo160714e(), R.drawable.ud_icon_up_outlined));
                this.itemView.setOnClickListener(new View$OnClickListenerC45649b(this));
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.j$b$a */
        public static final class View$OnClickListenerC45648a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ FooterViewHolder f115276a;

            View$OnClickListenerC45648a(FooterViewHolder bVar) {
                this.f115276a = bVar;
            }

            public final void onClick(View view) {
                this.f115276a.f115274a.mo160712c();
                UserCustomStatusHitPoint.f115066a.mo160418c(true);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.j$b$b */
        public static final class View$OnClickListenerC45649b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ FooterViewHolder f115277a;

            View$OnClickListenerC45649b(FooterViewHolder bVar) {
                this.f115277a = bVar;
            }

            public final void onClick(View view) {
                this.f115277a.f115274a.mo160713d();
                UserCustomStatusHitPoint.f115066a.mo160418c(false);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FooterViewHolder(UserStatusSettingAdapter jVar, View view, ExpandableAdapter.DisplayState displayState) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            Intrinsics.checkParameterIsNotNull(displayState, "displayState");
            this.f115274a = jVar;
            this.f115275b = displayState;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/setting/UserStatusSettingAdapter$UserStatusViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ss/android/lark/mine/impl/custom_status/setting/UserStatusSettingAdapter;Landroid/view/View;)V", "centerContent", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "leftImage", "Landroidx/appcompat/widget/AppCompatImageView;", "bind", "", "item", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "bind$core_mine_release", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.j$d */
    public final class UserStatusViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ UserStatusSettingAdapter f115278a;

        /* renamed from: b */
        private TextView f115279b;

        /* renamed from: c */
        private AppCompatImageView f115280c;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.j$d$a */
        public static final class C45650a extends Lambda implements Function1<View, Unit> {
            final /* synthetic */ UserCustomStatus $item;
            final /* synthetic */ UserStatusViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C45650a(UserStatusViewHolder dVar, UserCustomStatus userCustomStatus) {
                super(1);
                this.this$0 = dVar;
                this.$item = userCustomStatus;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                this.this$0.f115278a.mo160753f().mo160739a(this.this$0.f115278a.mo160714e(), this.$item);
            }
        }

        /* renamed from: a */
        public final void mo160757a(UserCustomStatus userCustomStatus) {
            Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
            TextView textView = this.f115279b;
            Intrinsics.checkExpressionValueIsNotNull(textView, "centerContent");
            textView.setText(userCustomStatus.title);
            this.f115280c.clearColorFilter();
            C52977a.m205190a().mo180995a(this.f115280c, userCustomStatus.icon_key);
            CustomStatusUIUtils bVar = CustomStatusUIUtils.f115068a;
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            bVar.mo160435a(view, new C45650a(this, userCustomStatus));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UserStatusViewHolder(UserStatusSettingAdapter jVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f115278a = jVar;
            this.f115279b = (TextView) view.findViewById(R.id.center_content);
            this.f115280c = (AppCompatImageView) view.findViewById(R.id.left_image);
        }
    }

    /* renamed from: a */
    private final RecyclerView.ViewHolder m181004a(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(mo160714e()).inflate(R.layout.item_user_custom_status_setting, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new UserStatusViewHolder(this, inflate);
    }

    /* renamed from: a */
    public boolean mo160709a(UserCustomStatus userCustomStatus, UserCustomStatus userCustomStatus2) {
        Intrinsics.checkParameterIsNotNull(userCustomStatus, "oldData");
        Intrinsics.checkParameterIsNotNull(userCustomStatus2, "newData");
        return m181006c(userCustomStatus, userCustomStatus2);
    }

    /* renamed from: b */
    public boolean mo160711b(UserCustomStatus userCustomStatus, UserCustomStatus userCustomStatus2) {
        Intrinsics.checkParameterIsNotNull(userCustomStatus, "oldData");
        Intrinsics.checkParameterIsNotNull(userCustomStatus2, "newData");
        return m181006c(userCustomStatus, userCustomStatus2);
    }

    /* renamed from: b */
    private final RecyclerView.ViewHolder m181005b(ViewGroup viewGroup, ExpandableAdapter.DisplayState displayState) {
        View inflate = LayoutInflater.from(mo160714e()).inflate(R.layout.item_expand_or_collapse, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new FooterViewHolder(this, inflate, displayState);
    }

    /* renamed from: c */
    private final boolean m181006c(UserCustomStatus userCustomStatus, UserCustomStatus userCustomStatus2) {
        if (!Intrinsics.areEqual(userCustomStatus.id, userCustomStatus2.id) || !Intrinsics.areEqual(userCustomStatus.title, userCustomStatus2.title) || !Intrinsics.areEqual(userCustomStatus.icon_key, userCustomStatus2.icon_key) || !Intrinsics.areEqual(userCustomStatus.order_weight, userCustomStatus2.order_weight)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.setting.ExpandableAdapter
    /* renamed from: a */
    public RecyclerView.ViewHolder mo160706a(ViewGroup viewGroup, ExpandableAdapter.DisplayState displayState) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Intrinsics.checkParameterIsNotNull(displayState, "displayState");
        if (C45652l.f115282a[displayState.ordinal()] != 1) {
            return m181005b(viewGroup, displayState);
        }
        return m181004a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (viewHolder instanceof UserStatusViewHolder) {
            ((UserStatusViewHolder) viewHolder).mo160757a((UserCustomStatus) mo160707a().get(i));
        } else if (viewHolder instanceof FooterViewHolder) {
            ((FooterViewHolder) viewHolder).mo160754a();
        } else {
            Log.m165383e("UserStatusSettingAdapter", "invalid holder type");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserStatusSettingAdapter(Context context, int i, OnStatusClickListener cVar) {
        super(context, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "onStatusClickListener");
        this.f115273b = cVar;
    }
}
