package com.ss.lark.android.passport.biz.feature.user_item_list;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49226y;
import com.ss.android.lark.utils.LarkContext;
import com.ss.lark.android.passport.biz.C64340b;
import com.ss.lark.android.passport.biz.entity.UserItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u001d\u001e\u001f !B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\u0014\u0010\u001a\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001cR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/user_item_list/UserItemGroupAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/lark/android/passport/biz/feature/user_item_list/UserItemGroupAdapter$VH;", "mActivity", "Landroid/app/Activity;", "mListener", "Lcom/ss/lark/android/passport/biz/feature/user_item_list/UserItemGroupAdapter$UserItemListener;", "(Landroid/app/Activity;Lcom/ss/lark/android/passport/biz/feature/user_item_list/UserItemGroupAdapter$UserItemListener;)V", "allData", "", "Lcom/ss/lark/android/passport/biz/feature/user_item_list/UserItemWrapper;", "logger", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "getLogger", "()Lcom/ss/android/lark/passport/infra/log/PassportLog;", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "", "Companion", "SubtitleHolder", "UserHolder", "UserItemListener", "VH", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.user_item_list.a */
public final class UserItemGroupAdapter extends RecyclerView.Adapter<VH> {

    /* renamed from: a */
    public static final int f163968a;

    /* renamed from: b */
    public static final int f163969b = C49154ag.m193838b((Context) LarkContext.getApplication(), (int) R.dimen.signin_sdk_rect_avatar_radius);

    /* renamed from: c */
    public static final Companion f163970c = new Companion(null);

    /* renamed from: d */
    private final List<UserItemWrapper> f163971d = new ArrayList();

    /* renamed from: e */
    private final PassportLog f163972e = PassportLog.f123351c.mo171474a();

    /* renamed from: f */
    private final Activity f163973f;

    /* renamed from: g */
    private final UserItemListener f163974g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/user_item_list/UserItemGroupAdapter$UserItemListener;", "", "onUserItemClick", "", "userItem", "Lcom/ss/lark/android/passport/biz/entity/UserItem;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.user_item_list.a$d */
    public interface UserItemListener {
        /* renamed from: a */
        void mo224281a(UserItem userItem);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/user_item_list/UserItemGroupAdapter$Companion;", "", "()V", "AVATAR_ROUND_SIZE", "", "AVATAR_SIZE", "ITEM_TYPE_CARD", "ITEM_TYPE_TITLE", "TAG", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.user_item_list.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f163971d.size();
    }

    static {
        C64340b a = C64340b.m252955a();
        Intrinsics.checkExpressionValueIsNotNull(a, "SigninManager.getInstance()");
        f163968a = C49154ag.m193828a(a.mo222860b(), 48.0f);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/user_item_list/UserItemGroupAdapter$UserHolder;", "Lcom/ss/lark/android/passport/biz/feature/user_item_list/UserItemGroupAdapter$VH;", "itemView", "Landroid/view/View;", "mListener", "Lcom/ss/lark/android/passport/biz/feature/user_item_list/UserItemGroupAdapter$UserItemListener;", "logger", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "(Landroid/view/View;Lcom/ss/lark/android/passport/biz/feature/user_item_list/UserItemGroupAdapter$UserItemListener;Lcom/ss/android/lark/passport/infra/log/PassportLog;)V", "cardRoot", "Landroidx/constraintlayout/widget/ConstraintLayout;", "ivArrow", "Landroid/widget/ImageView;", "ivAvatar", "llUser", "Landroid/widget/LinearLayout;", "getLogger", "()Lcom/ss/android/lark/passport/infra/log/PassportLog;", "tvAppeal", "Landroid/widget/TextView;", "tvStatus", "tvTenantName", "tvUserName", "render", "", "info", "Lcom/ss/lark/android/passport/biz/feature/user_item_list/UserItemWrapper;", "position", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.user_item_list.a$c */
    public static final class UserHolder extends VH {

        /* renamed from: a */
        public final UserItemListener f163978a;

        /* renamed from: b */
        private final ConstraintLayout f163979b;

        /* renamed from: c */
        private final ImageView f163980c;

        /* renamed from: d */
        private final TextView f163981d;

        /* renamed from: e */
        private final TextView f163982e;

        /* renamed from: f */
        private final TextView f163983f;

        /* renamed from: g */
        private final TextView f163984g;

        /* renamed from: h */
        private final ImageView f163985h;

        /* renamed from: i */
        private final LinearLayout f163986i;

        /* renamed from: j */
        private final PassportLog f163987j;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.user_item_list.a$c$a */
        static final class View$OnClickListenerC65107a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ UserHolder f163988a;

            /* renamed from: b */
            final /* synthetic */ UserItem f163989b;

            View$OnClickListenerC65107a(UserHolder cVar, UserItem userItem) {
                this.f163988a = cVar;
                this.f163989b = userItem;
            }

            public final void onClick(View view) {
                UserItemListener dVar = this.f163988a.f163978a;
                if (dVar != null) {
                    dVar.mo224281a(this.f163989b);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
            if (r3 != null) goto L_0x008f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00be, code lost:
            if (r3 != null) goto L_0x008f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x011b  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0145  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x0150  */
        @Override // com.ss.lark.android.passport.biz.feature.user_item_list.UserItemGroupAdapter.VH
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo224279a(com.ss.lark.android.passport.biz.feature.user_item_list.UserItemWrapper r13, int r14) {
            /*
            // Method dump skipped, instructions count: 550
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.lark.android.passport.biz.feature.user_item_list.UserItemGroupAdapter.UserHolder.mo224279a(com.ss.lark.android.passport.biz.feature.user_item_list.UserItemWrapper, int):void");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UserHolder(View view, UserItemListener dVar, PassportLog passportLog) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            Intrinsics.checkParameterIsNotNull(passportLog, "logger");
            this.f163978a = dVar;
            this.f163987j = passportLog;
            View findViewById = view.findViewById(R.id.cardRoot);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.cardRoot)");
            this.f163979b = (ConstraintLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.ivAvatar);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.ivAvatar)");
            this.f163980c = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvTenantName);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.tvTenantName)");
            this.f163981d = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvUserName);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.tvUserName)");
            this.f163982e = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.tvStatus);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "itemView.findViewById(R.id.tvStatus)");
            this.f163983f = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.tvAppeal);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "itemView.findViewById(R.id.tvAppeal)");
            this.f163984g = (TextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.ivArrow);
            Intrinsics.checkExpressionValueIsNotNull(findViewById7, "itemView.findViewById(R.id.ivArrow)");
            this.f163985h = (ImageView) findViewById7;
            View findViewById8 = view.findViewById(R.id.llUser);
            Intrinsics.checkExpressionValueIsNotNull(findViewById8, "itemView.findViewById(R.id.llUser)");
            this.f163986i = (LinearLayout) findViewById8;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/user_item_list/UserItemGroupAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "render", "", "info", "Lcom/ss/lark/android/passport/biz/feature/user_item_list/UserItemWrapper;", "position", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.user_item_list.a$e */
    public static abstract class VH extends RecyclerView.ViewHolder {
        /* renamed from: a */
        public abstract void mo224279a(UserItemWrapper userItemWrapper, int i);

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public VH(View view) {
            super(view);
            if (view == null) {
                Intrinsics.throwNpe();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f163971d.get(i).itemType;
    }

    /* renamed from: a */
    public final void mo224278a(List<? extends UserItemWrapper> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f163971d.clear();
        this.f163971d.addAll(list);
        notifyDataSetChanged();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/user_item_list/UserItemGroupAdapter$SubtitleHolder;", "Lcom/ss/lark/android/passport/biz/feature/user_item_list/UserItemGroupAdapter$VH;", "mActivity", "Landroid/app/Activity;", "itemView", "Landroid/view/View;", "logger", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "(Landroid/app/Activity;Landroid/view/View;Lcom/ss/android/lark/passport/infra/log/PassportLog;)V", "getLogger", "()Lcom/ss/android/lark/passport/infra/log/PassportLog;", "tvSubtitle", "Landroid/widget/TextView;", "render", "", "info", "Lcom/ss/lark/android/passport/biz/feature/user_item_list/UserItemWrapper;", "position", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.user_item_list.a$b */
    public static final class SubtitleHolder extends VH {

        /* renamed from: a */
        private final TextView f163975a;

        /* renamed from: b */
        private final Activity f163976b;

        /* renamed from: c */
        private final PassportLog f163977c;

        @Override // com.ss.lark.android.passport.biz.feature.user_item_list.UserItemGroupAdapter.VH
        /* renamed from: a */
        public void mo224279a(UserItemWrapper userItemWrapper, int i) {
            Intrinsics.checkParameterIsNotNull(userItemWrapper, "info");
            C49226y.m194061a(this.f163976b, this.f163975a, userItemWrapper.subTitle, null, this.f163977c);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SubtitleHolder(Activity activity, View view, PassportLog passportLog) {
            super(view);
            Intrinsics.checkParameterIsNotNull(activity, "mActivity");
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            Intrinsics.checkParameterIsNotNull(passportLog, "logger");
            this.f163976b = activity;
            this.f163977c = passportLog;
            View findViewById = view.findViewById(R.id.tvTitle);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.tvTitle)");
            this.f163975a = (TextView) findViewById;
        }
    }

    public UserItemGroupAdapter(Activity activity, UserItemListener dVar) {
        Intrinsics.checkParameterIsNotNull(activity, "mActivity");
        this.f163973f = activity;
        this.f163974g = dVar;
    }

    /* renamed from: a */
    public void onBindViewHolder(VH eVar, int i) {
        Intrinsics.checkParameterIsNotNull(eVar, "holder");
        if (i < 0 || i >= this.f163971d.size()) {
            this.f163972e.mo171471d("UserItemGroupAdapter", "onBindViewHolder position");
        } else {
            eVar.mo224279a(this.f163971d.get(i), i);
        }
    }

    /* renamed from: a */
    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i != 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.signin_sdk_user_list_item_card, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…item_card, parent, false)");
            return new UserHolder(inflate, this.f163974g, this.f163972e);
        }
        Activity activity = this.f163973f;
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.signin_sdk_user_list_item_title, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate2, "LayoutInflater.from(pare…tem_title, parent, false)");
        return new SubtitleHolder(activity, inflate2, this.f163972e);
    }
}
