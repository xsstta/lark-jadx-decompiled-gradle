package com.ss.android.lark.contact.impl.setting.one_way_contact.block_list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.contact.impl.setting.one_way_contact.entity.ExceptionUser;
import com.ss.android.lark.contact.impl.statistics.PrivacyHitPoint;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u001c\u001d\u001e\u001fB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0007H\u0016J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListAdapter$PrivacyContactViewHolder;", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/entity/ExceptionUser;", "mContext", "Landroid/content/Context;", "mMode", "", "mItemClickListener", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListAdapter$OnItemClickListener;", "(Landroid/content/Context;ILcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListAdapter$OnItemClickListener;)V", "getMContext", "()Landroid/content/Context;", "getMMode", "()I", "setMMode", "(I)V", "initInDesktop", "", "holder", "onBindViewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setMode", "mode", "Companion", "Mode", "OnItemClickListener", "PrivacyContactViewHolder", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PrivacyBlockListAdapter extends LarkRecyclerViewBaseAdapter<PrivacyContactViewHolder, ExceptionUser> {

    /* renamed from: b */
    public static final int f93107b = UIHelper.dp2px(48.0f);

    /* renamed from: c */
    public static final Companion f93108c = new Companion(null);

    /* renamed from: a */
    public final OnItemClickListener f93109a;

    /* renamed from: d */
    private final Context f93110d;

    /* renamed from: e */
    private int f93111e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListAdapter$Mode;", "", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Mode {
        public static final Companion Companion = Companion.f93112a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListAdapter$Mode$Companion;", "", "()V", "DELETE", "", "VIEW", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.PrivacyBlockListAdapter$Mode$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f93112a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListAdapter$OnItemClickListener;", "", "onItemClick", "", "userId", "", "onItemDeleteClick", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.PrivacyBlockListAdapter$b */
    public interface OnItemClickListener {
        /* renamed from: a */
        void mo132494a(String str);

        /* renamed from: b */
        void mo132495b(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListAdapter$Companion;", "", "()V", "GROUP_AVATAR_SIZE", "", "getGROUP_AVATAR_SIZE", "()I", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.PrivacyBlockListAdapter$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListAdapter$PrivacyContactViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mAvatarIv", "Landroid/widget/ImageView;", "getMAvatarIv", "()Landroid/widget/ImageView;", "mDeleteBt", "Landroid/widget/TextView;", "getMDeleteBt", "()Landroid/widget/TextView;", "mNameTv", "getMNameTv", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.PrivacyBlockListAdapter$c */
    public static final class PrivacyContactViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final ImageView f93113a;

        /* renamed from: b */
        private final TextView f93114b;

        /* renamed from: c */
        private final TextView f93115c;

        /* renamed from: a */
        public final ImageView mo132496a() {
            return this.f93113a;
        }

        /* renamed from: b */
        public final TextView mo132497b() {
            return this.f93114b;
        }

        /* renamed from: c */
        public final TextView mo132498c() {
            return this.f93115c;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PrivacyContactViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            LarkAvatarView larkAvatarView = (LarkAvatarView) view.findViewById(R.id.avatar);
            Intrinsics.checkExpressionValueIsNotNull(larkAvatarView, "itemView.avatar");
            this.f93113a = larkAvatarView;
            TextView textView = (TextView) view.findViewById(R.id.name);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.name");
            this.f93114b = textView;
            TextView textView2 = (TextView) view.findViewById(R.id.delete_button);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.delete_button");
            this.f93115c = textView2;
        }
    }

    /* renamed from: a */
    public final void mo132492a(int i) {
        this.f93111e = i;
        notifyDataSetChanged();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListAdapter$onBindViewHolder$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.PrivacyBlockListAdapter$d */
    public static final class C36027d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ PrivacyBlockListAdapter f93116a;

        /* renamed from: b */
        final /* synthetic */ ExceptionUser f93117b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            OnItemClickListener bVar = this.f93116a.f93109a;
            String userId = this.f93117b.getUserId();
            if (userId == null) {
                Intrinsics.throwNpe();
            }
            bVar.mo132494a(userId);
        }

        C36027d(PrivacyBlockListAdapter privacyBlockListAdapter, ExceptionUser exceptionUser) {
            this.f93116a = privacyBlockListAdapter;
            this.f93117b = exceptionUser;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.PrivacyBlockListAdapter$e */
    public static final class View$OnClickListenerC36028e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PrivacyBlockListAdapter f93118a;

        /* renamed from: b */
        final /* synthetic */ ExceptionUser f93119b;

        View$OnClickListenerC36028e(PrivacyBlockListAdapter privacyBlockListAdapter, ExceptionUser exceptionUser) {
            this.f93118a = privacyBlockListAdapter;
            this.f93119b = exceptionUser;
        }

        public final void onClick(View view) {
            PrivacyHitPoint.f92909a.mo132210b();
            OnItemClickListener bVar = this.f93118a.f93109a;
            String userId = this.f93119b.getUserId();
            if (userId == null) {
                Intrinsics.throwNpe();
            }
            bVar.mo132495b(userId);
        }
    }

    /* renamed from: a */
    private final void m141269a(PrivacyContactViewHolder cVar) {
        DesktopUtil.m144304b(cVar.mo132496a());
        DesktopUtil.m144299a(cVar.mo132497b());
        DesktopUtil.m144299a(cVar.mo132498c());
    }

    /* renamed from: a */
    public PrivacyContactViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f93110d).inflate(R.layout.item_privacy_block, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new PrivacyContactViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(PrivacyContactViewHolder cVar, int i) {
        int i2;
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        if (DesktopUtil.m144301a(this.f93110d)) {
            m141269a(cVar);
        }
        Object item = getItem(i);
        Intrinsics.checkExpressionValueIsNotNull(item, "getItem(position)");
        ExceptionUser exceptionUser = (ExceptionUser) item;
        cVar.itemView.setOnClickListener(new C36027d(this, exceptionUser));
        TextView c = cVar.mo132498c();
        if (this.f93111e == 1) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        c.setVisibility(i2);
        cVar.mo132498c().setOnClickListener(new View$OnClickListenerC36028e(this, exceptionUser));
        cVar.mo132497b().setText(exceptionUser.getUserName());
        String avatarKey = exceptionUser.getAvatarKey();
        String userId = exceptionUser.getUserId();
        int i3 = f93107b;
        AvatarImage build = AvatarImage.Builder.obtain(avatarKey, userId, i3, i3).build();
        Intrinsics.checkExpressionValueIsNotNull(build, "AvatarImage.Builder.obta…ROUP_AVATAR_SIZE).build()");
        ImageLoader.with(this.f93110d).load(build).into(cVar.mo132496a());
    }

    public PrivacyBlockListAdapter(Context context, int i, OnItemClickListener bVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mItemClickListener");
        this.f93110d = context;
        this.f93111e = i;
        this.f93109a = bVar;
    }
}
