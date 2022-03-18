package com.ss.android.lark.profile.func.medal.wall;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.PassThroughImage;
import com.ss.android.lark.pb.entities.ImageSetPassThrough;
import com.ss.android.lark.profile.func.medal.Medal;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u001a\u001b\u001c\u001dB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0016J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/wall/MedalWallAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallAdapter$MedalViewHolder;", "Lcom/ss/android/lark/profile/func/medal/Medal;", "medalDependency", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallAdapter$IMedalDependency;", "(Lcom/ss/android/lark/profile/func/medal/wall/MedalWallAdapter$IMedalDependency;)V", "isSelf", "", "getMedalDependency", "()Lcom/ss/android/lark/profile/func/medal/wall/MedalWallAdapter$IMedalDependency;", "medalSize", "", "getMedalSize", "()I", "setMedalSize", "(I)V", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setIsSelf", "Companion", "IMedalDependency", "MedalStatus", "MedalViewHolder", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MedalWallAdapter extends LarkRecyclerViewBaseAdapter<MedalViewHolder, Medal> {

    /* renamed from: a */
    public static final Companion f129818a = new Companion(null);

    /* renamed from: b */
    private int f129819b = UIHelper.dp2px(64.0f);

    /* renamed from: c */
    private boolean f129820c;

    /* renamed from: d */
    private final IMedalDependency f129821d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/wall/MedalWallAdapter$IMedalDependency;", "", "onMedalClick", "", "medalId", "", "grantId", "takeOffMedal", "medal", "Lcom/ss/android/lark/profile/func/medal/Medal;", "wearMedal", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.MedalWallAdapter$b */
    public interface IMedalDependency {
        /* renamed from: a */
        void mo179318a(Medal aVar);

        /* renamed from: a */
        void mo179319a(String str, String str2);

        /* renamed from: b */
        void mo179320b(Medal aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/wall/MedalWallAdapter$Companion;", "", "()V", "TAG", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.MedalWallAdapter$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final IMedalDependency mo179314a() {
        return this.f129821d;
    }

    /* renamed from: a */
    public final void mo179317a(boolean z) {
        this.f129820c = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/wall/MedalWallAdapter$MedalViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "medalView", "Landroid/view/View;", "(Landroid/view/View;)V", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.MedalWallAdapter$c */
    public static final class MedalViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MedalViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "medalView");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/profile/func/medal/wall/MedalWallAdapter$onBindViewHolder$5$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.MedalWallAdapter$d */
    public static final class View$OnClickListenerC52387d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MedalWallAdapter f129822a;

        /* renamed from: b */
        final /* synthetic */ Medal f129823b;

        /* renamed from: c */
        final /* synthetic */ MedalViewHolder f129824c;

        View$OnClickListenerC52387d(MedalWallAdapter medalWallAdapter, Medal aVar, MedalViewHolder cVar) {
            this.f129822a = medalWallAdapter;
            this.f129823b = aVar;
            this.f129824c = cVar;
        }

        public final void onClick(View view) {
            IMedalDependency a = this.f129822a.mo179314a();
            Medal aVar = this.f129823b;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "medalData");
            a.mo179318a(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/profile/func/medal/wall/MedalWallAdapter$onBindViewHolder$5$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.MedalWallAdapter$e */
    public static final class View$OnClickListenerC52388e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MedalWallAdapter f129825a;

        /* renamed from: b */
        final /* synthetic */ Medal f129826b;

        /* renamed from: c */
        final /* synthetic */ MedalViewHolder f129827c;

        View$OnClickListenerC52388e(MedalWallAdapter medalWallAdapter, Medal aVar, MedalViewHolder cVar) {
            this.f129825a = medalWallAdapter;
            this.f129826b = aVar;
            this.f129827c = cVar;
        }

        public final void onClick(View view) {
            IMedalDependency a = this.f129825a.mo179314a();
            Medal aVar = this.f129826b;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "medalData");
            a.mo179320b(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.MedalWallAdapter$f */
    public static final class View$OnClickListenerC52389f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MedalWallAdapter f129828a;

        /* renamed from: b */
        final /* synthetic */ Medal f129829b;

        View$OnClickListenerC52389f(MedalWallAdapter medalWallAdapter, Medal aVar) {
            this.f129828a = medalWallAdapter;
            this.f129829b = aVar;
        }

        public final void onClick(View view) {
            this.f129828a.mo179314a().mo179319a(this.f129829b.mo179230a(), this.f129829b.mo179236f());
        }
    }

    public MedalWallAdapter(IMedalDependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "medalDependency");
        this.f129821d = bVar;
    }

    /* renamed from: a */
    public MedalViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.medal_item_layout, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new MedalViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(MedalViewHolder cVar, int i) {
        int i2;
        boolean z;
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        Medal aVar = (Medal) getItem(i);
        ImageSetPassThrough c = aVar.mo179232c();
        if (c != null) {
            String str = c.mkey;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(!z)) {
                c = null;
            }
            if (c != null) {
                View view = cVar.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
                IRequestCreator load = ImageLoader.with(view.getContext()).load(new PassThroughImage(c.mkey, c.mfs_unit));
                View view2 = cVar.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
                Context context = view2.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "holder.itemView.context");
                IRequestCreator placeholder = load.placeholder(UDColorUtils.getColor(context, R.color.bg_body_overlay));
                int i3 = this.f129819b;
                IRequestCreator override = placeholder.override(i3, i3);
                View view3 = cVar.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view3, "holder.itemView");
                override.into((ImageView) view3.findViewById(R.id.iv_medal));
            }
        }
        View view4 = cVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "holder.itemView");
        ((ImageView) view4.findViewById(R.id.iv_medal)).setOnClickListener(new View$OnClickListenerC52389f(this, aVar));
        View view5 = cVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "holder.itemView");
        TextView textView = (TextView) view5.findViewById(R.id.tv_medal_name);
        textView.setText(aVar.mo179233d());
        if (aVar.mo179234e() == MedalStatus.INVALID) {
            i2 = R.color.text_disable;
        } else {
            i2 = R.color.text_title;
        }
        Context context2 = textView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        textView.setTextColor(UDColorUtils.getColor(context2, i2));
        if (!this.f129820c) {
            View view6 = cVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view6, "holder.itemView");
            UIUtils.hide((TextView) view6.findViewById(R.id.tv_medal_status));
            if (aVar.mo179234e() == MedalStatus.WORN) {
                View view7 = cVar.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view7, "holder.itemView");
                UIUtils.show((MedalWearTag) view7.findViewById(R.id.tag_wearing));
                return;
            }
            View view8 = cVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view8, "holder.itemView");
            UIUtils.hide((MedalWearTag) view8.findViewById(R.id.tag_wearing));
            return;
        }
        View view9 = cVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view9, "holder.itemView");
        UIUtils.show((TextView) view9.findViewById(R.id.tv_medal_status));
        View view10 = cVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view10, "holder.itemView");
        TextView textView2 = (TextView) view10.findViewById(R.id.tv_medal_status);
        int i4 = C52393b.f129845a[aVar.mo179234e().ordinal()];
        if (i4 == 1) {
            Intrinsics.checkExpressionValueIsNotNull(textView2, "this");
            textView2.setBackground(UIUtils.getDrawable(textView2.getContext(), R.drawable.btn_medal_status_worn));
            Context context3 = textView2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            textView2.setTextColor(UDColorUtils.getColor(context3, R.color.primary_pri_500));
            textView2.setText(UIHelper.getString(R.string.Lark_Profile_TakeOff));
            View view11 = cVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view11, "holder.itemView");
            UIUtils.show((MedalWearTag) view11.findViewById(R.id.tag_wearing));
            textView2.setOnClickListener(new View$OnClickListenerC52387d(this, aVar, cVar));
        } else if (i4 == 2) {
            Intrinsics.checkExpressionValueIsNotNull(textView2, "this");
            textView2.setBackground(UIUtils.getDrawable(textView2.getContext(), R.drawable.btn_medal_status_unwear));
            Context context4 = textView2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context4, "context");
            textView2.setTextColor(UDColorUtils.getColor(context4, R.color.static_white));
            textView2.setText(UIHelper.getString(R.string.Lark_Profile_Wear));
            View view12 = cVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view12, "holder.itemView");
            UIUtils.hide((MedalWearTag) view12.findViewById(R.id.tag_wearing));
            textView2.setOnClickListener(new View$OnClickListenerC52388e(this, aVar, cVar));
        } else if (i4 == 3) {
            Intrinsics.checkExpressionValueIsNotNull(textView2, "this");
            textView2.setBackground(UIUtils.getDrawable(textView2.getContext(), R.drawable.btn_medal_status_invalid));
            Context context5 = textView2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context5, "context");
            textView2.setTextColor(UDColorUtils.getColor(context5, R.color.icon_disable));
            textView2.setText(UIHelper.getString(R.string.Lark_Profile_Expired));
            View view13 = cVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view13, "holder.itemView");
            UIUtils.hide((MedalWearTag) view13.findViewById(R.id.tag_wearing));
            textView2.setClickable(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/wall/MedalWallAdapter$MedalStatus;", "", "value", "", "(Ljava/lang/String;II)V", "VALID", "INVALID", "WORN", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum MedalStatus {
        VALID(0),
        INVALID(1),
        WORN(2);

        private MedalStatus(int i) {
        }
    }
}
