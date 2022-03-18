package com.ss.android.lark.mine.impl.custom_status.my_status;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.C0796b;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.C1556v;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.TransitionSet;
import com.bytedance.lark.pb.basic.v1.StatusEffectiveInterval;
import com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusMeta;
import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import com.bytedance.lark.pb.contact.v1.UserCustomStatusDuration;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.timepicker.impl.action.UDTimePickerBuilder;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerModel;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.framework.utils.ak;
import com.larksuite.suite.R;
import com.ss.android.lark.mine.impl.custom_status.C45616s;
import com.ss.android.lark.mine.impl.custom_status.CustomStatusUIUtils;
import com.ss.android.lark.mine.impl.custom_status.my_status.switch.IStatusSwitcher;
import com.ss.android.lark.mine.impl.custom_status.my_status.switch.StatusSwitcher;
import com.ss.android.lark.mine.impl.custom_status.my_status.switch.TimeSwitcher;
import com.ss.android.lark.mine.impl.custom_status.statistics.UserCustomStatusHitPoint;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000e>?@ABCDEFGHIJKB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001f\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010 J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0011H\u0016J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0011H\u0016J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\fH\u0016J\b\u0010(\u001a\u00020\u000eH\u0016J\"\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\u00162\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u0018H\u0002J\u0018\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u000eH\u0016J&\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0016J\u0010\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u000203H\u0002J\u0018\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u000eH\u0016J\"\u00108\u001a\u00020\u001d2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u00182\u0006\u0010:\u001a\u00020\fJ\f\u0010;\u001a\u00020<*\u00020\u0011H\u0002J\f\u0010=\u001a\u00020<*\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016X\u000e¢\u0006\u0002\n\u0000R6\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u00182\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u0018@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u001a\u0010\u001b¨\u0006L"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$UserCustomStatusViewHolder;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/IClickableViewHolder;", "context", "Landroid/content/Context;", "clickListener", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$OnClickListener;", "(Landroid/content/Context;Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$OnClickListener;)V", "getContext", "()Landroid/content/Context;", "currentTime", "", "itemLayoutRes", "", "openId", "openedStatus", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "getOpenedStatus", "()Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "pullId", "userCustomStatusItems", "", "value", "", "userCustomStatusMap", "setUserCustomStatusMap", "(Ljava/util/Map;)V", "clickOnCustomTime", "", "item", "customTime", "(Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;Ljava/lang/Long;)V", "clickOnDuration", "duration", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatusDuration;", "clickOnHeader", "clickOnMoreSetting", "clickOnPullIcon", "newPullId", "getItemCount", "getOrderedStatusList", "map", "onBindViewHolder", "holder", "position", "payloads", "", "", "onClick", "switcher", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/IStatusSwitcher;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "items", "newOpenId", "isOpen", "", "isPulled", "CloseNoPullBind", "ClosePullBind", "Companion", "Diff", "ICloseBind", "INoPullBind", "IOpenBind", "IPullBind", "IViewHolderBinder", "OnClickListener", "OpenNoPullBind", "OpenPullBind", "UserCustomStatusViewHolder", "ViewHolderBinder", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b */
public final class UserCustomStatusAdapter extends RecyclerView.Adapter<UserCustomStatusViewHolder> implements IClickableViewHolder {

    /* renamed from: a */
    public static final Companion f115169a = new Companion(null);

    /* renamed from: b */
    private Map<Long, UserCustomStatus> f115170b = MapsKt.emptyMap();

    /* renamed from: c */
    private List<UserCustomStatus> f115171c = CollectionsKt.emptyList();

    /* renamed from: d */
    private long f115172d = -1;

    /* renamed from: e */
    private final int f115173e = R.layout.item_user_custom_status;

    /* renamed from: f */
    private long f115174f = -1;

    /* renamed from: g */
    private long f115175g = (C45616s.m180945b() / 1000);

    /* renamed from: h */
    private final Context f115176h;

    /* renamed from: i */
    private final OnClickListener f115177i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$OnClickListener;", "", "onMoreSettingClick", "", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "onUpdateMeta", "list", "", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$j */
    public interface OnClickListener {
        /* renamed from: a */
        void mo160599a(UserCustomStatus userCustomStatus);

        /* renamed from: a */
        void mo160600a(List<UpdateUserCustomStatusMeta> list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rXT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$Companion;", "", "()V", "DIFF_CLOSE", "", "DIFF_COLLAPSE", "DIFF_DISTURB", "DIFF_EXPAND", "DIFF_ICON", "DIFF_OPEN", "DIFF_TIME", "DIFF_TITLE", "OPEN_ID_NOT_EXIST", "", "getCustomSelectedTime", "year", "", "monthOfYear", "dayOfMonth", "hourOfDay", "minute", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$c */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo160652a(int i, int i2, int i3, int i4, int i5) {
            Calendar instance = Calendar.getInstance();
            instance.set(i, i2, i3, i4, i5);
            Intrinsics.checkExpressionValueIsNotNull(instance, "calendar");
            return instance.getTimeInMillis();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\bR\u0011\u0010\u001d\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\bR\u0011\u0010\u001f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\bR\u0011\u0010!\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\fR\u0011\u0010#\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010%\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\bR\u0011\u0010'\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\bR\u0011\u0010)\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\b¨\u0006+"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$UserCustomStatusViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "duration", "Landroid/widget/TextView;", "getDuration", "()Landroid/widget/TextView;", "flowLayout", "Landroid/view/ViewGroup;", "getFlowLayout", "()Landroid/view/ViewGroup;", "header", "getHeader", "hour1", "getHour1", "hour2", "getHour2", "hour4", "getHour4", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "iconPull", "getIconPull", "minute", "getMinute", "moreSetting", "getMoreSetting", "otherTime", "getOtherTime", "pullCard", "getPullCard", "silenceIcon", "getSilenceIcon", "silenceText", "getSilenceText", "title", "getTitle", "tonight", "getTonight", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$m */
    public static final class UserCustomStatusViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final ImageView f115212a;

        /* renamed from: b */
        private final TextView f115213b;

        /* renamed from: c */
        private final TextView f115214c;

        /* renamed from: d */
        private final TextView f115215d;

        /* renamed from: e */
        private final ViewGroup f115216e;

        /* renamed from: f */
        private final ViewGroup f115217f;

        /* renamed from: g */
        private final TextView f115218g;

        /* renamed from: h */
        private final ImageView f115219h;

        /* renamed from: i */
        private final ImageView f115220i;

        /* renamed from: j */
        private final TextView f115221j;

        /* renamed from: k */
        private final TextView f115222k;

        /* renamed from: l */
        private final TextView f115223l;

        /* renamed from: m */
        private final TextView f115224m;

        /* renamed from: n */
        private final TextView f115225n;

        /* renamed from: o */
        private final TextView f115226o;

        /* renamed from: p */
        private final ViewGroup f115227p;

        /* renamed from: a */
        public final ImageView mo160676a() {
            return this.f115212a;
        }

        /* renamed from: b */
        public final TextView mo160677b() {
            return this.f115213b;
        }

        /* renamed from: c */
        public final TextView mo160678c() {
            return this.f115214c;
        }

        /* renamed from: d */
        public final TextView mo160679d() {
            return this.f115215d;
        }

        /* renamed from: e */
        public final ViewGroup mo160680e() {
            return this.f115216e;
        }

        /* renamed from: f */
        public final ViewGroup mo160681f() {
            return this.f115217f;
        }

        /* renamed from: g */
        public final TextView mo160682g() {
            return this.f115218g;
        }

        /* renamed from: h */
        public final ImageView mo160683h() {
            return this.f115219h;
        }

        /* renamed from: i */
        public final ImageView mo160684i() {
            return this.f115220i;
        }

        /* renamed from: j */
        public final TextView mo160685j() {
            return this.f115221j;
        }

        /* renamed from: k */
        public final TextView mo160686k() {
            return this.f115222k;
        }

        /* renamed from: l */
        public final TextView mo160687l() {
            return this.f115223l;
        }

        /* renamed from: m */
        public final TextView mo160688m() {
            return this.f115224m;
        }

        /* renamed from: n */
        public final TextView mo160689n() {
            return this.f115225n;
        }

        /* renamed from: o */
        public final TextView mo160690o() {
            return this.f115226o;
        }

        /* renamed from: p */
        public final ViewGroup mo160691p() {
            return this.f115227p;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UserCustomStatusViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            ImageView imageView = (ImageView) view.findViewById(R.id.status_icon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.status_icon");
            this.f115212a = imageView;
            TextView textView = (TextView) view.findViewById(R.id.title_text);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.title_text");
            this.f115213b = textView;
            TextView textView2 = (TextView) view.findViewById(R.id.text_duration);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.text_duration");
            this.f115214c = textView2;
            TextView textView3 = (TextView) view.findViewById(R.id.text_silence);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.text_silence");
            this.f115215d = textView3;
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.layout_status_card_pull);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "itemView.layout_status_card_pull");
            this.f115216e = constraintLayout;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(R.id.layout_status_card_header);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "itemView.layout_status_card_header");
            this.f115217f = constraintLayout2;
            TextView textView4 = (TextView) view.findViewById(R.id.more_setting);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.more_setting");
            this.f115218g = textView4;
            ImageView imageView2 = (ImageView) view.findViewById(R.id.icon_silence);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "itemView.icon_silence");
            this.f115219h = imageView2;
            ImageView imageView3 = (ImageView) view.findViewById(R.id.icon_pull);
            Intrinsics.checkExpressionValueIsNotNull(imageView3, "itemView.icon_pull");
            this.f115220i = imageView3;
            TextView textView5 = (TextView) view.findViewById(R.id.text_end_time_thirty);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "itemView.text_end_time_thirty");
            this.f115221j = textView5;
            TextView textView6 = (TextView) view.findViewById(R.id.text_end_time_one);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "itemView.text_end_time_one");
            this.f115222k = textView6;
            TextView textView7 = (TextView) view.findViewById(R.id.text_end_time_two);
            Intrinsics.checkExpressionValueIsNotNull(textView7, "itemView.text_end_time_two");
            this.f115223l = textView7;
            TextView textView8 = (TextView) view.findViewById(R.id.text_end_time_four);
            Intrinsics.checkExpressionValueIsNotNull(textView8, "itemView.text_end_time_four");
            this.f115224m = textView8;
            TextView textView9 = (TextView) view.findViewById(R.id.text_end_time_tonight);
            Intrinsics.checkExpressionValueIsNotNull(textView9, "itemView.text_end_time_tonight");
            this.f115225n = textView9;
            TextView textView10 = (TextView) view.findViewById(R.id.text_end_time_other);
            Intrinsics.checkExpressionValueIsNotNull(textView10, "itemView.text_end_time_other");
            this.f115226o = textView10;
            FlowLinearLayout flowLinearLayout = (FlowLinearLayout) view.findViewById(R.id.layout_status_card);
            Intrinsics.checkExpressionValueIsNotNull(flowLinearLayout, "itemView.layout_status_card");
            this.f115227p = flowLinearLayout;
        }
    }

    /* renamed from: a */
    public final void mo160642a(Map<Long, UserCustomStatus> map, long j) {
        Intrinsics.checkParameterIsNotNull(map, "items");
        List<UserCustomStatus> b = m180800b(map);
        List<UserCustomStatus> list = this.f115171c;
        long j2 = this.f115174f;
        C1374g.C1377b a = C1374g.m6297a(new Diff(this, list, b, j2, j2, this.f115172d, j));
        Intrinsics.checkExpressionValueIsNotNull(a, "DiffUtil.calculateDiff(D…llId, openId, newOpenId))");
        m180799a(map);
        this.f115172d = j;
        a.mo7412a(this);
    }

    /* renamed from: a */
    public void onBindViewHolder(UserCustomStatusViewHolder mVar, int i, List<Object> list) {
        IViewHolderBinder iVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Intrinsics.checkParameterIsNotNull(mVar, "holder");
        Intrinsics.checkParameterIsNotNull(list, "payloads");
        UserCustomStatus userCustomStatus = this.f115171c.get(i);
        if (m180801c(userCustomStatus)) {
            iVar = m180802d(userCustomStatus) ? new OpenPullBind() : new OpenNoPullBind();
        } else {
            iVar = m180802d(userCustomStatus) ? new ClosePullBind() : new CloseNoPullBind();
        }
        boolean z6 = true;
        boolean z7 = !list.isEmpty();
        Bundle bundle = new Bundle();
        if (z7) {
            Object obj = list.get(0);
            if (obj != null) {
                Bundle bundle2 = (Bundle) obj;
                boolean z8 = bundle2.getBoolean("time");
                z5 = bundle2.getBoolean("title");
                z4 = bundle2.getBoolean("icon");
                z3 = bundle2.getBoolean("disturb");
                z2 = bundle2.containsKey("expand") || bundle2.containsKey("collapse");
                if (!bundle2.containsKey("open") && !bundle2.containsKey("close")) {
                    z6 = false;
                }
                bundle = bundle2;
                z = z6;
                z6 = z8;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.os.Bundle");
            }
        } else {
            z = true;
            z5 = true;
            z4 = true;
            z3 = true;
            z2 = true;
        }
        if (!z7 || !z2) {
            if (z2 || z) {
                iVar.mo160664a(mVar);
            }
            if (z2) {
                iVar.mo160666b(mVar);
            }
        } else if (bundle.containsKey("expand")) {
            iVar.mo160664a(mVar);
            iVar.mo160666b(mVar);
        } else if (bundle.containsKey("collapse")) {
            iVar.mo160666b(mVar);
            iVar.mo160664a(mVar);
        }
        if (z2 || z) {
            iVar.mo160665b(this.f115176h, mVar);
        }
        if (z6 || z) {
            iVar.mo160644a(this.f115176h, userCustomStatus, mVar, this.f115175g);
        }
        if (z2) {
            iVar.mo160662a(mVar.mo160684i(), userCustomStatus);
        }
        if (z3) {
            iVar.mo160663a(userCustomStatus, mVar);
        }
        if (z5) {
            mVar.mo160677b().setText(userCustomStatus.title);
        }
        if (z4) {
            C52977a.m205190a().mo180995a(mVar.mo160676a(), userCustomStatus.icon_key);
        }
        if (z) {
            iVar.mo160645a(this.f115176h, mVar);
        }
        iVar.mo160661a(this.f115176h, mVar, userCustomStatus);
        ak.m95027a(mVar.mo160684i(), CustomStatusUIUtils.f115068a.mo160434a(20), CustomStatusUIUtils.f115068a.mo160434a(4), CustomStatusUIUtils.f115068a.mo160434a(20), CustomStatusUIUtils.f115068a.mo160434a(20));
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00060\u0001R\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$CloseNoPullBind;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$ViewHolderBinder;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$ICloseBind;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$INoPullBind;", "(Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter;)V", "getHeaderBackgroundResource", "", "getIconPullBackgroundResource", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$a */
    public final class CloseNoPullBind extends ViewHolderBinder implements ICloseBind, INoPullBind {
        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: a */
        public int mo160643a() {
            return R.drawable.bg_status_card_header;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: b */
        public int mo160647b() {
            return 0;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: c */
        public int mo160648c() {
            return INoPullBind.C45579a.m180843a(this);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: d */
        public int mo160650d() {
            return INoPullBind.C45579a.m180846b(this);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: e */
        public int mo160651e() {
            return ICloseBind.C45577a.m180839a(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public CloseNoPullBind() {
            super();
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: c */
        public View.OnClickListener mo160649c(UserCustomStatus userCustomStatus) {
            Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
            return INoPullBind.C45579a.m180844a(this, userCustomStatus);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: a */
        public void mo160646a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "iconPull");
            INoPullBind.C45579a.m180845a(this, view);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: a */
        public void mo160645a(Context context, UserCustomStatusViewHolder mVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(mVar, "holder");
            ICloseBind.C45577a.m180842a(this, context, mVar);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: a */
        public void mo160644a(Context context, UserCustomStatus userCustomStatus, UserCustomStatusViewHolder mVar, long j) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
            Intrinsics.checkParameterIsNotNull(mVar, "holder");
            ICloseBind.C45577a.m180841a(this, context, userCustomStatus, mVar, j);
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00060\u0001R\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$ClosePullBind;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$ViewHolderBinder;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$ICloseBind;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$IPullBind;", "(Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter;)V", "getHeaderBackgroundResource", "", "getIconPullBackgroundResource", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$b */
    public final class ClosePullBind extends ViewHolderBinder implements ICloseBind, IPullBind {
        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: a */
        public int mo160643a() {
            return R.drawable.bg_status_card_header_pulled;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: b */
        public int mo160647b() {
            return R.drawable.bg_icon_more_pull;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: c */
        public int mo160648c() {
            return IPullBind.C45585a.m180853a(this);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: d */
        public int mo160650d() {
            return IPullBind.C45585a.m180856b(this);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: e */
        public int mo160651e() {
            return ICloseBind.C45577a.m180839a(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ClosePullBind() {
            super();
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: c */
        public View.OnClickListener mo160649c(UserCustomStatus userCustomStatus) {
            Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
            return IPullBind.C45585a.m180854a(this, userCustomStatus);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: a */
        public void mo160646a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "iconPull");
            IPullBind.C45585a.m180855a(this, view);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: a */
        public void mo160645a(Context context, UserCustomStatusViewHolder mVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(mVar, "holder");
            ICloseBind.C45577a.m180842a(this, context, mVar);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: a */
        public void mo160644a(Context context, UserCustomStatus userCustomStatus, UserCustomStatusViewHolder mVar, long j) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
            Intrinsics.checkParameterIsNotNull(mVar, "holder");
            ICloseBind.C45577a.m180841a(this, context, userCustomStatus, mVar, j);
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$Diff;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "newList", "oldPullId", "", "newPullId", "oldOpenId", "newOpenId", "(Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter;Ljava/util/List;Ljava/util/List;JJJJ)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getChangePayload", "Landroid/os/Bundle;", "oldItem", "newItem", "getNewListSize", "getOldListSize", "isTheSameTimeDisplay", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$d */
    public final class Diff extends C1374g.AbstractC1376a {

        /* renamed from: a */
        final /* synthetic */ UserCustomStatusAdapter f115180a;

        /* renamed from: b */
        private final List<UserCustomStatus> f115181b;

        /* renamed from: c */
        private final List<UserCustomStatus> f115182c;

        /* renamed from: d */
        private final long f115183d;

        /* renamed from: e */
        private final long f115184e;

        /* renamed from: f */
        private final long f115185f;

        /* renamed from: g */
        private final long f115186g;

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: b */
        public boolean mo7383b(int i, int i2) {
            return false;
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: a */
        public int mo7380a() {
            return this.f115181b.size();
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: b */
        public int mo7382b() {
            return this.f115182c.size();
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: a */
        public boolean mo7381a(int i, int i2) {
            return Intrinsics.areEqual(this.f115181b.get(i).id, this.f115182c.get(i2).id);
        }

        /* renamed from: b */
        private final boolean m180832b(UserCustomStatus userCustomStatus, UserCustomStatus userCustomStatus2) {
            StatusEffectiveInterval statusEffectiveInterval = userCustomStatus.effective_interval;
            StatusEffectiveInterval statusEffectiveInterval2 = userCustomStatus.effective_interval;
            if ((statusEffectiveInterval == null || statusEffectiveInterval2 == null || (!(!Intrinsics.areEqual(statusEffectiveInterval.is_show_end_time, statusEffectiveInterval2.is_show_end_time)) && !(!Intrinsics.areEqual(statusEffectiveInterval.start_time, statusEffectiveInterval2.start_time)) && !(!Intrinsics.areEqual(statusEffectiveInterval.end_time, statusEffectiveInterval2.end_time)))) && userCustomStatus.last_selected_duration == userCustomStatus2.last_selected_duration && !(!Intrinsics.areEqual(userCustomStatus.last_customized_end_time, userCustomStatus2.last_customized_end_time))) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public Bundle mo7384c(int i, int i2) {
            if (!mo7381a(i, i2)) {
                return C0796b.m3875a(new Pair[0]);
            }
            return m180831a(this.f115181b.get(i), this.f115182c.get(i2));
        }

        /* renamed from: a */
        private final Bundle m180831a(UserCustomStatus userCustomStatus, UserCustomStatus userCustomStatus2) {
            Bundle a = C0796b.m3875a(TuplesKt.to("time", Boolean.valueOf(!m180832b(userCustomStatus, userCustomStatus2))), TuplesKt.to("title", Boolean.valueOf(!Intrinsics.areEqual(userCustomStatus.title, userCustomStatus2.title))), TuplesKt.to("disturb", Boolean.valueOf(!Intrinsics.areEqual(userCustomStatus.is_not_disturb_mode, userCustomStatus2.is_not_disturb_mode))), TuplesKt.to("icon", Boolean.valueOf(!Intrinsics.areEqual(userCustomStatus.icon_key, userCustomStatus2.icon_key))));
            if (this.f115185f != this.f115186g) {
                Long l = userCustomStatus.id;
                long j = this.f115185f;
                if (l != null && l.longValue() == j) {
                    a.putBoolean("close", true);
                } else {
                    long j2 = this.f115186g;
                    if (l != null && l.longValue() == j2) {
                        a.putBoolean("open", true);
                    }
                }
            }
            if (this.f115183d != this.f115184e) {
                Long l2 = userCustomStatus.id;
                long j3 = this.f115183d;
                if (l2 != null && l2.longValue() == j3) {
                    a.putBoolean("collapse", true);
                } else {
                    long j4 = this.f115184e;
                    if (l2 != null && l2.longValue() == j4) {
                        a.putBoolean("expand", true);
                    }
                }
            }
            return a;
        }

        public Diff(UserCustomStatusAdapter bVar, List<UserCustomStatus> list, List<UserCustomStatus> list2, long j, long j2, long j3, long j4) {
            Intrinsics.checkParameterIsNotNull(list, "oldList");
            Intrinsics.checkParameterIsNotNull(list2, "newList");
            this.f115180a = bVar;
            this.f115181b = list;
            this.f115182c = list2;
            this.f115183d = j;
            this.f115184e = j2;
            this.f115185f = j3;
            this.f115186g = j4;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00060\u0001R\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$OpenNoPullBind;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$ViewHolderBinder;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$IOpenBind;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$INoPullBind;", "(Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter;)V", "getHeaderBackgroundResource", "", "getIconPullBackgroundResource", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$k */
    public final class OpenNoPullBind extends ViewHolderBinder implements INoPullBind, IOpenBind {
        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: a */
        public int mo160643a() {
            return R.drawable.bg_status_card_header_open;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: b */
        public int mo160647b() {
            return 0;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: c */
        public int mo160648c() {
            return INoPullBind.C45579a.m180843a(this);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: d */
        public int mo160650d() {
            return INoPullBind.C45579a.m180846b(this);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: e */
        public int mo160651e() {
            return IOpenBind.C45581a.m180847a(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OpenNoPullBind() {
            super();
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: c */
        public View.OnClickListener mo160649c(UserCustomStatus userCustomStatus) {
            Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
            return INoPullBind.C45579a.m180844a(this, userCustomStatus);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: a */
        public void mo160646a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "iconPull");
            INoPullBind.C45579a.m180845a(this, view);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: a */
        public void mo160645a(Context context, UserCustomStatusViewHolder mVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(mVar, "holder");
            IOpenBind.C45581a.m180850a(this, context, mVar);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: a */
        public void mo160644a(Context context, UserCustomStatus userCustomStatus, UserCustomStatusViewHolder mVar, long j) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
            Intrinsics.checkParameterIsNotNull(mVar, "holder");
            IOpenBind.C45581a.m180849a(this, context, userCustomStatus, mVar, j);
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00060\u0001R\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$OpenPullBind;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$ViewHolderBinder;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$IOpenBind;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$IPullBind;", "(Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter;)V", "getHeaderBackgroundResource", "", "getIconPullBackgroundResource", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$l */
    public final class OpenPullBind extends ViewHolderBinder implements IOpenBind, IPullBind {
        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: a */
        public int mo160643a() {
            return R.drawable.bg_status_card_header_open_pulled;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: b */
        public int mo160647b() {
            return R.drawable.bg_icon_more_pull_open;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: c */
        public int mo160648c() {
            return IPullBind.C45585a.m180853a(this);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: d */
        public int mo160650d() {
            return IPullBind.C45585a.m180856b(this);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: e */
        public int mo160651e() {
            return IOpenBind.C45581a.m180847a(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OpenPullBind() {
            super();
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: c */
        public View.OnClickListener mo160649c(UserCustomStatus userCustomStatus) {
            Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
            return IPullBind.C45585a.m180854a(this, userCustomStatus);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: a */
        public void mo160646a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "iconPull");
            IPullBind.C45585a.m180855a(this, view);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: a */
        public void mo160645a(Context context, UserCustomStatusViewHolder mVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(mVar, "holder");
            IOpenBind.C45581a.m180850a(this, context, mVar);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: a */
        public void mo160644a(Context context, UserCustomStatus userCustomStatus, UserCustomStatusViewHolder mVar, long j) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
            Intrinsics.checkParameterIsNotNull(mVar, "holder");
            IOpenBind.C45581a.m180849a(this, context, userCustomStatus, mVar, j);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f115171c.size();
    }

    /* renamed from: a */
    private final UserCustomStatus m180797a() {
        return this.f115170b.get(Long.valueOf(this.f115172d));
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\bb\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH&J\b\u0010\r\u001a\u00020\u000bH&J\b\u0010\u000e\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\u000bH&J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J(\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001fH&¨\u0006 "}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$IViewHolderBinder;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/IClickableViewHolder;", "bindCommon", "", "context", "Landroid/content/Context;", "holder", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$UserCustomStatusViewHolder;", "item", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "getHeaderBackgroundResource", "", "getIconPullBackgroundResource", "getIconPullForegroundResource", "getIconPullForegroundTintColor", "getPullCardVisibility", "getPullIconClickListener", "Landroid/view/View$OnClickListener;", "openTimePicker", "setDisturbVisibility", "setHeaderBackground", "setIconPullLayouts", "iconPull", "Landroid/view/View;", "setPullCard", "setPullIconClickListener", "pullIcon", "setPullIconStyle", "setSilence", "setTime", "currentTime", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$i */
    public interface IViewHolderBinder extends IClickableViewHolder {
        /* renamed from: a */
        int mo160643a();

        /* renamed from: a */
        void mo160660a(Context context, UserCustomStatus userCustomStatus);

        /* renamed from: a */
        void mo160644a(Context context, UserCustomStatus userCustomStatus, UserCustomStatusViewHolder mVar, long j);

        /* renamed from: a */
        void mo160645a(Context context, UserCustomStatusViewHolder mVar);

        /* renamed from: a */
        void mo160661a(Context context, UserCustomStatusViewHolder mVar, UserCustomStatus userCustomStatus);

        /* renamed from: a */
        void mo160646a(View view);

        /* renamed from: a */
        void mo160662a(View view, UserCustomStatus userCustomStatus);

        /* renamed from: a */
        void mo160663a(UserCustomStatus userCustomStatus, UserCustomStatusViewHolder mVar);

        /* renamed from: a */
        void mo160664a(UserCustomStatusViewHolder mVar);

        /* renamed from: b */
        int mo160647b();

        /* renamed from: b */
        void mo160665b(Context context, UserCustomStatusViewHolder mVar);

        /* renamed from: b */
        void mo160666b(UserCustomStatusViewHolder mVar);

        /* renamed from: c */
        int mo160648c();

        /* renamed from: c */
        View.OnClickListener mo160649c(UserCustomStatus userCustomStatus);

        /* renamed from: d */
        int mo160650d();

        /* renamed from: e */
        int mo160651e();

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$i$a */
        public static final class C45587a {

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$i$a$a */
            public static final class C45588a extends Lambda implements Function1<View, Unit> {
                final /* synthetic */ Context $context;
                final /* synthetic */ UserCustomStatus $item;
                final /* synthetic */ IViewHolderBinder this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45588a(IViewHolderBinder iVar, UserCustomStatus userCustomStatus, Context context) {
                    super(1);
                    this.this$0 = iVar;
                    this.$item = userCustomStatus;
                    this.$context = context;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke(view);
                    return Unit.INSTANCE;
                }

                public final void invoke(View view) {
                    this.this$0.mo160613a(this.$item);
                    C45616s.m180943a(this.$context);
                }
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$i$a$b */
            public static final class C45589b extends Lambda implements Function1<View, Unit> {
                final /* synthetic */ Context $context;
                final /* synthetic */ UserCustomStatus $item;
                final /* synthetic */ IViewHolderBinder this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45589b(IViewHolderBinder iVar, UserCustomStatus userCustomStatus, Context context) {
                    super(1);
                    this.this$0 = iVar;
                    this.$item = userCustomStatus;
                    this.$context = context;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke(view);
                    return Unit.INSTANCE;
                }

                public final void invoke(View view) {
                    this.this$0.mo160614a(this.$item, UserCustomStatusDuration.MINUTES_30);
                    C45616s.m180943a(this.$context);
                }
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$i$a$c */
            public static final class C45590c extends Lambda implements Function1<View, Unit> {
                final /* synthetic */ Context $context;
                final /* synthetic */ UserCustomStatus $item;
                final /* synthetic */ IViewHolderBinder this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45590c(IViewHolderBinder iVar, UserCustomStatus userCustomStatus, Context context) {
                    super(1);
                    this.this$0 = iVar;
                    this.$item = userCustomStatus;
                    this.$context = context;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke(view);
                    return Unit.INSTANCE;
                }

                public final void invoke(View view) {
                    this.this$0.mo160614a(this.$item, UserCustomStatusDuration.HOUR_1);
                    C45616s.m180943a(this.$context);
                }
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$i$a$d */
            public static final class C45591d extends Lambda implements Function1<View, Unit> {
                final /* synthetic */ Context $context;
                final /* synthetic */ UserCustomStatus $item;
                final /* synthetic */ IViewHolderBinder this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45591d(IViewHolderBinder iVar, UserCustomStatus userCustomStatus, Context context) {
                    super(1);
                    this.this$0 = iVar;
                    this.$item = userCustomStatus;
                    this.$context = context;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke(view);
                    return Unit.INSTANCE;
                }

                public final void invoke(View view) {
                    this.this$0.mo160614a(this.$item, UserCustomStatusDuration.HOUR_2);
                    C45616s.m180943a(this.$context);
                }
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$i$a$e */
            public static final class C45592e extends Lambda implements Function1<View, Unit> {
                final /* synthetic */ Context $context;
                final /* synthetic */ UserCustomStatus $item;
                final /* synthetic */ IViewHolderBinder this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45592e(IViewHolderBinder iVar, UserCustomStatus userCustomStatus, Context context) {
                    super(1);
                    this.this$0 = iVar;
                    this.$item = userCustomStatus;
                    this.$context = context;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke(view);
                    return Unit.INSTANCE;
                }

                public final void invoke(View view) {
                    this.this$0.mo160614a(this.$item, UserCustomStatusDuration.HOUR_4);
                    C45616s.m180943a(this.$context);
                }
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$i$a$f */
            public static final class C45593f extends Lambda implements Function1<View, Unit> {
                final /* synthetic */ Context $context;
                final /* synthetic */ UserCustomStatus $item;
                final /* synthetic */ IViewHolderBinder this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45593f(IViewHolderBinder iVar, UserCustomStatus userCustomStatus, Context context) {
                    super(1);
                    this.this$0 = iVar;
                    this.$item = userCustomStatus;
                    this.$context = context;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke(view);
                    return Unit.INSTANCE;
                }

                public final void invoke(View view) {
                    this.this$0.mo160614a(this.$item, UserCustomStatusDuration.UNTIL_TONIGHT);
                    C45616s.m180943a(this.$context);
                }
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$i$a$g */
            public static final class C45594g extends Lambda implements Function1<View, Unit> {
                final /* synthetic */ UserCustomStatus $item;
                final /* synthetic */ IViewHolderBinder this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45594g(IViewHolderBinder iVar, UserCustomStatus userCustomStatus) {
                    super(1);
                    this.this$0 = iVar;
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
                    this.this$0.mo160616b(this.$item);
                }
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$i$a$i */
            public static final class DialogInterface$OnDismissListenerC45596i implements DialogInterface.OnDismissListener {

                /* renamed from: a */
                final /* synthetic */ UserCustomStatus f115207a;

                DialogInterface$OnDismissListenerC45596i(UserCustomStatus userCustomStatus) {
                    this.f115207a = userCustomStatus;
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    UserCustomStatusHitPoint.f115066a.mo160431h((int) this.f115207a.id.longValue());
                }
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$IViewHolderBinder$setHeaderBackground$1$1"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$i$a$j */
            public static final class C45597j implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a */
                final /* synthetic */ GradientDrawable f115208a;

                /* renamed from: b */
                final /* synthetic */ float f115209b;

                C45597j(GradientDrawable gradientDrawable, float f) {
                    this.f115208a = gradientDrawable;
                    this.f115209b = f;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        float a = (float) CustomStatusUIUtils.f115068a.mo160434a(((Integer) animatedValue).intValue());
                        GradientDrawable gradientDrawable = this.f115208a;
                        float f = this.f115209b;
                        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, a, a, a, a});
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
            }

            /* renamed from: b */
            public static void m180879b(IViewHolderBinder iVar, UserCustomStatusViewHolder mVar) {
                int i;
                Intrinsics.checkParameterIsNotNull(mVar, "holder");
                if (iVar.mo160648c() == 0) {
                    i = 1;
                } else {
                    i = 2;
                }
                Fade fade = new Fade(i);
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.mo7878a(350L);
                transitionSet.mo7933a(new Fade(i));
                transitionSet.mo7933a(new ChangeBounds());
                C1556v.m7131a(mVar.mo160680e(), fade);
                mVar.mo160680e().setVisibility(iVar.mo160648c());
            }

            /* renamed from: a */
            public static void m180878a(IViewHolderBinder iVar, UserCustomStatusViewHolder mVar) {
                int i;
                int i2;
                Intrinsics.checkParameterIsNotNull(mVar, "holder");
                ViewGroup f = mVar.mo160681f();
                Drawable background = f.getBackground();
                if (!(background instanceof GradientDrawable)) {
                    background = null;
                }
                if (((GradientDrawable) background) == null) {
                    f.setBackgroundResource(iVar.mo160643a());
                    return;
                }
                Drawable drawable = UIHelper.getDrawable(iVar.mo160643a());
                if (drawable != null) {
                    GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                    if (mVar.mo160680e().getVisibility() == 0) {
                        i = 0;
                    } else {
                        i = 20;
                    }
                    if (iVar.mo160648c() == 0) {
                        i2 = 0;
                    } else {
                        i2 = 20;
                    }
                    if (i == i2) {
                        f.setBackground(gradientDrawable);
                        return;
                    }
                    float a = (float) CustomStatusUIUtils.f115068a.mo160434a(20);
                    float a2 = (float) CustomStatusUIUtils.f115068a.mo160434a(i);
                    gradientDrawable.setCornerRadii(new float[]{a, a, a, a, a2, a2, a2, a2});
                    f.setBackground(gradientDrawable);
                    ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
                    ofInt.addUpdateListener(new C45597j(gradientDrawable, a));
                    ofInt.setDuration(50L);
                    ofInt.start();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$IViewHolderBinder$openTimePicker$1", "Lcom/larksuite/component/universe_design/timepicker/impl/action/UDTimePickerBuilder$TimePickerActonListener;", "onClickRightAction", "", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "year", "", "monthOfYear", "dayOfMonth", "hourOfDay", "minute", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$i$a$h */
            public static final class C45595h implements UDTimePickerBuilder.TimePickerActonListener {

                /* renamed from: a */
                final /* synthetic */ IViewHolderBinder f115204a;

                /* renamed from: b */
                final /* synthetic */ UserCustomStatus f115205b;

                /* renamed from: c */
                final /* synthetic */ Context f115206c;

                C45595h(IViewHolderBinder iVar, UserCustomStatus userCustomStatus, Context context) {
                    this.f115204a = iVar;
                    this.f115205b = userCustomStatus;
                    this.f115206c = context;
                }

                @Override // com.larksuite.component.universe_design.timepicker.impl.action.UDTimePickerBuilder.TimePickerActonListener
                public void onClickRightAction(UDDialog uDDialog, int i, int i2, int i3, int i4, int i5) {
                    long a = UserCustomStatusAdapter.f115169a.mo160652a(i, i2, i3, i4, i5) / 1000;
                    UserCustomStatusHitPoint.f115066a.mo160402a((int) this.f115205b.id.longValue(), String.valueOf(a));
                    if (1000 * a < C45616s.m180945b()) {
                        UDToast.show(this.f115206c, (int) R.string.Lark_Profile_LastTimeDesc);
                        return;
                    }
                    if (uDDialog != null) {
                        uDDialog.dismiss();
                    }
                    this.f115204a.mo160615a(this.f115205b, Long.valueOf(a));
                    C45616s.m180943a(this.f115206c);
                }
            }

            /* renamed from: a */
            public static void m180876a(IViewHolderBinder iVar, View view, UserCustomStatus userCustomStatus) {
                Intrinsics.checkParameterIsNotNull(view, "pullIcon");
                Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
                view.setOnClickListener(iVar.mo160649c(userCustomStatus));
            }

            /* renamed from: a */
            public static void m180874a(IViewHolderBinder iVar, Context context, UserCustomStatusViewHolder mVar) {
                Intrinsics.checkParameterIsNotNull(context, "context");
                Intrinsics.checkParameterIsNotNull(mVar, "holder");
                ImageView i = mVar.mo160684i();
                iVar.mo160646a(i);
                i.setBackgroundResource(iVar.mo160647b());
                Drawable drawable = UIUtils.getDrawable(context, iVar.mo160650d());
                drawable.setTint(UIUtils.getColor(context, iVar.mo160651e()));
                i.setImageDrawable(drawable);
            }

            /* renamed from: a */
            public static void m180873a(IViewHolderBinder iVar, Context context, UserCustomStatus userCustomStatus) {
                Intrinsics.checkParameterIsNotNull(context, "context");
                Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
                UserCustomStatusHitPoint.f115066a.mo160420d((int) userCustomStatus.id.longValue());
                UDTimePickerBuilder a = new UDTimePickerBuilder(context).mo91492a(PickerModel.MONTHDAY_HOUR_MINUTE_24H);
                String string = UIHelper.getString(R.string.Lark_Profile_Cancel);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.string.Lark_Profile_Cancel)");
                UDTimePickerBuilder a2 = a.mo91493a(string);
                String string2 = UIHelper.getString(R.string.Lark_Profile_Enable);
                Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.string.Lark_Profile_Enable)");
                UDTimePickerBuilder b = a2.mo91496b(string2);
                String string3 = UIHelper.getString(R.string.Lark_Profile_SetTime_EndingTime);
                Intrinsics.checkExpressionValueIsNotNull(string3, "UIHelper.getString(R.str…ofile_SetTime_EndingTime)");
                ((UDTimePickerBuilder) b.mo91497c(string3).mo91491a(new C45595h(iVar, userCustomStatus, context)).onDismissListener(new DialogInterface$OnDismissListenerC45596i(userCustomStatus))).show();
                UserCustomStatusHitPoint.f115066a.mo160429g((int) userCustomStatus.id.longValue());
            }

            /* renamed from: a */
            public static void m180877a(IViewHolderBinder iVar, UserCustomStatus userCustomStatus, UserCustomStatusViewHolder mVar) {
                Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
                Intrinsics.checkParameterIsNotNull(mVar, "holder");
                Boolean bool = userCustomStatus.is_not_disturb_mode;
                Intrinsics.checkExpressionValueIsNotNull(bool, "item.is_not_disturb_mode");
                if (bool.booleanValue()) {
                    mVar.mo160683h().setVisibility(0);
                    mVar.mo160679d().setVisibility(0);
                    return;
                }
                mVar.mo160683h().setVisibility(8);
                mVar.mo160679d().setVisibility(8);
            }

            /* renamed from: a */
            public static void m180875a(IViewHolderBinder iVar, Context context, UserCustomStatusViewHolder mVar, UserCustomStatus userCustomStatus) {
                Intrinsics.checkParameterIsNotNull(context, "context");
                Intrinsics.checkParameterIsNotNull(mVar, "holder");
                Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
                CustomStatusUIUtils.f115068a.mo160435a(mVar.mo160681f(), new C45588a(iVar, userCustomStatus, context));
                CustomStatusUIUtils.f115068a.mo160435a(mVar.mo160685j(), new C45589b(iVar, userCustomStatus, context));
                CustomStatusUIUtils.f115068a.mo160435a(mVar.mo160686k(), new C45590c(iVar, userCustomStatus, context));
                CustomStatusUIUtils.f115068a.mo160435a(mVar.mo160687l(), new C45591d(iVar, userCustomStatus, context));
                CustomStatusUIUtils.f115068a.mo160435a(mVar.mo160688m(), new C45592e(iVar, userCustomStatus, context));
                CustomStatusUIUtils.f115068a.mo160435a(mVar.mo160689n(), new C45593f(iVar, userCustomStatus, context));
                CustomStatusUIUtils.f115068a.mo160435a(mVar.mo160682g(), new C45594g(iVar, userCustomStatus));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b¢\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0001J\u0011\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001J\u0011\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001J\u0011\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\tH\u0001¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$ViewHolderBinder;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$IViewHolderBinder;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/IClickableViewHolder;", "(Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter;)V", "clickOnCustomTime", "", "item", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "customTime", "", "(Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;Ljava/lang/Long;)V", "clickOnDuration", "duration", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatusDuration;", "clickOnHeader", "clickOnMoreSetting", "clickOnPullIcon", "newPullId", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$n */
    private abstract class ViewHolderBinder implements IClickableViewHolder, IViewHolderBinder {

        /* renamed from: a */
        private final /* synthetic */ UserCustomStatusAdapter f115228a;

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.IClickableViewHolder
        /* renamed from: a */
        public void mo160612a(long j) {
            this.f115228a.mo160612a(j);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.IClickableViewHolder
        /* renamed from: a */
        public void mo160613a(UserCustomStatus userCustomStatus) {
            Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
            this.f115228a.mo160613a(userCustomStatus);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.IClickableViewHolder
        /* renamed from: a */
        public void mo160614a(UserCustomStatus userCustomStatus, UserCustomStatusDuration userCustomStatusDuration) {
            Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
            Intrinsics.checkParameterIsNotNull(userCustomStatusDuration, "duration");
            this.f115228a.mo160614a(userCustomStatus, userCustomStatusDuration);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.IClickableViewHolder
        /* renamed from: a */
        public void mo160615a(UserCustomStatus userCustomStatus, Long l) {
            Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
            this.f115228a.mo160615a(userCustomStatus, l);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.IClickableViewHolder
        /* renamed from: b */
        public void mo160616b(UserCustomStatus userCustomStatus) {
            Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
            this.f115228a.mo160616b(userCustomStatus);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewHolderBinder() {
            this.f115228a = UserCustomStatusAdapter.this;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: b */
        public void mo160666b(UserCustomStatusViewHolder mVar) {
            Intrinsics.checkParameterIsNotNull(mVar, "holder");
            IViewHolderBinder.C45587a.m180879b(this, mVar);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: a */
        public void mo160664a(UserCustomStatusViewHolder mVar) {
            Intrinsics.checkParameterIsNotNull(mVar, "holder");
            IViewHolderBinder.C45587a.m180878a(this, mVar);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: a */
        public void mo160660a(Context context, UserCustomStatus userCustomStatus) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
            IViewHolderBinder.C45587a.m180873a(this, context, userCustomStatus);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: b */
        public void mo160665b(Context context, UserCustomStatusViewHolder mVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(mVar, "holder");
            IViewHolderBinder.C45587a.m180874a(this, context, mVar);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: a */
        public void mo160662a(View view, UserCustomStatus userCustomStatus) {
            Intrinsics.checkParameterIsNotNull(view, "pullIcon");
            Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
            IViewHolderBinder.C45587a.m180876a(this, view, userCustomStatus);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: a */
        public void mo160663a(UserCustomStatus userCustomStatus, UserCustomStatusViewHolder mVar) {
            Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
            Intrinsics.checkParameterIsNotNull(mVar, "holder");
            IViewHolderBinder.C45587a.m180877a(this, userCustomStatus, mVar);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.IViewHolderBinder
        /* renamed from: a */
        public void mo160661a(Context context, UserCustomStatusViewHolder mVar, UserCustomStatus userCustomStatus) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(mVar, "holder");
            Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
            IViewHolderBinder.C45587a.m180875a(this, context, mVar, userCustomStatus);
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bb\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J(\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$ICloseBind;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$IViewHolderBinder;", "getIconPullForegroundTintColor", "", "getSelectedDurationText", "", "duration", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatusDuration;", "setSilence", "", "context", "Landroid/content/Context;", "holder", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$UserCustomStatusViewHolder;", "setTime", "item", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "currentTime", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$e */
    public interface ICloseBind extends IViewHolderBinder {

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$e$a */
        public static final class C45577a {
            /* renamed from: a */
            public static int m180839a(ICloseBind eVar) {
                return R.color.icon_n3;
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$ICloseBind$setTime$1$1"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$e$a$a */
            public static final class View$OnClickListenerC45578a implements View.OnClickListener {

                /* renamed from: a */
                final /* synthetic */ ICloseBind f115187a;

                /* renamed from: b */
                final /* synthetic */ Context f115188b;

                /* renamed from: c */
                final /* synthetic */ UserCustomStatus f115189c;

                View$OnClickListenerC45578a(ICloseBind eVar, Context context, UserCustomStatus userCustomStatus) {
                    this.f115187a = eVar;
                    this.f115188b = context;
                    this.f115189c = userCustomStatus;
                }

                public final void onClick(View view) {
                    this.f115187a.mo160660a(this.f115188b, this.f115189c);
                }
            }

            /* renamed from: a */
            private static String m180840a(ICloseBind eVar, UserCustomStatusDuration userCustomStatusDuration) {
                int i = C45599c.f115230a[userCustomStatusDuration.ordinal()];
                if (i == 1) {
                    String string = UIHelper.getString(R.string.Lark_Profile_ThirtyMins);
                    Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str….Lark_Profile_ThirtyMins)");
                    return string;
                } else if (i == 2) {
                    String string2 = UIHelper.getString(R.string.Lark_Profile_AnHour);
                    Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.string.Lark_Profile_AnHour)");
                    return string2;
                } else if (i == 3) {
                    String string3 = UIHelper.getString(R.string.Lark_Profile_TwoHours);
                    Intrinsics.checkExpressionValueIsNotNull(string3, "UIHelper.getString(R.string.Lark_Profile_TwoHours)");
                    return string3;
                } else if (i == 4) {
                    String string4 = UIHelper.getString(R.string.Lark_Profile_FourHours);
                    Intrinsics.checkExpressionValueIsNotNull(string4, "UIHelper.getString(R.str…g.Lark_Profile_FourHours)");
                    return string4;
                } else if (i != 5) {
                    return "";
                } else {
                    String string5 = UIHelper.getString(R.string.Lark_Profile_UntilTonight);
                    Intrinsics.checkExpressionValueIsNotNull(string5, "UIHelper.getString(R.str…ark_Profile_UntilTonight)");
                    return string5;
                }
            }

            /* renamed from: a */
            public static void m180842a(ICloseBind eVar, Context context, UserCustomStatusViewHolder mVar) {
                Intrinsics.checkParameterIsNotNull(context, "context");
                Intrinsics.checkParameterIsNotNull(mVar, "holder");
                mVar.mo160683h().setImageResource(R.drawable.ic_icon_silence_status_close);
                mVar.mo160679d().setTextColor(UIUtils.getColor(context, R.color.text_placeholder));
            }

            /* renamed from: a */
            public static void m180841a(ICloseBind eVar, Context context, UserCustomStatus userCustomStatus, UserCustomStatusViewHolder mVar, long j) {
                Intrinsics.checkParameterIsNotNull(context, "context");
                Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
                Intrinsics.checkParameterIsNotNull(mVar, "holder");
                mVar.mo160677b().setTextColor(UIUtils.getColor(context, R.color.text_title));
                mVar.mo160678c().setTextColor(UIUtils.getColor(context, R.color.text_placeholder));
                ViewGroup p = mVar.mo160691p();
                if (p != null) {
                    ((FlowLinearLayout) p).mo160579a();
                    TextView o = mVar.mo160690o();
                    o.setText(UIHelper.getString(R.string.Lark_Profile_OtherTimes));
                    o.setOnClickListener(new View$OnClickListenerC45578a(eVar, context, userCustomStatus));
                    StatusEffectiveInterval statusEffectiveInterval = userCustomStatus.effective_interval;
                    if (statusEffectiveInterval != null) {
                        Boolean bool = statusEffectiveInterval.is_show_end_time;
                        Intrinsics.checkExpressionValueIsNotNull(bool, "it.is_show_end_time");
                        if (bool.booleanValue()) {
                            UserCustomStatusDuration userCustomStatusDuration = userCustomStatus.last_selected_duration;
                            TextView c = mVar.mo160678c();
                            Intrinsics.checkExpressionValueIsNotNull(userCustomStatusDuration, "selectDuration");
                            c.setText(m180840a(eVar, userCustomStatusDuration));
                            return;
                        }
                        mVar.mo160678c().setText("");
                        return;
                    }
                    mVar.mo160678c().setText("");
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mine.impl.custom_status.my_status.FlowLinearLayout");
            }
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bb\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J(\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J(\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J \u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$IOpenBind;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$IViewHolderBinder;", "getIconPullForegroundTintColor", "", "setCustomEndTime", "", "context", "Landroid/content/Context;", "item", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "holder", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$UserCustomStatusViewHolder;", "setDuration", "endTime", "", "setSilence", "setTime", "currentTime", "setUnEndTime", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$g */
    public interface IOpenBind extends IViewHolderBinder {

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$g$a */
        public static final class C45581a {
            /* renamed from: a */
            public static int m180847a(IOpenBind gVar) {
                return R.color.static_white;
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$IOpenBind$setCustomEndTime$1$1"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$g$a$a */
            public static final class View$OnClickListenerC45582a implements View.OnClickListener {

                /* renamed from: a */
                final /* synthetic */ IOpenBind f115192a;

                /* renamed from: b */
                final /* synthetic */ String f115193b;

                /* renamed from: c */
                final /* synthetic */ UserCustomStatus f115194c;

                /* renamed from: d */
                final /* synthetic */ Context f115195d;

                View$OnClickListenerC45582a(IOpenBind gVar, String str, UserCustomStatus userCustomStatus, Context context) {
                    this.f115192a = gVar;
                    this.f115193b = str;
                    this.f115194c = userCustomStatus;
                    this.f115195d = context;
                }

                public final void onClick(View view) {
                    this.f115192a.mo160615a(this.f115194c, (Long) null);
                    C45616s.m180943a(this.f115195d);
                }
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$IOpenBind$setDuration$1$1"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$g$a$b */
            public static final class View$OnClickListenerC45583b implements View.OnClickListener {

                /* renamed from: a */
                final /* synthetic */ IOpenBind f115196a;

                /* renamed from: b */
                final /* synthetic */ Context f115197b;

                /* renamed from: c */
                final /* synthetic */ UserCustomStatus f115198c;

                View$OnClickListenerC45583b(IOpenBind gVar, Context context, UserCustomStatus userCustomStatus) {
                    this.f115196a = gVar;
                    this.f115197b = context;
                    this.f115198c = userCustomStatus;
                }

                public final void onClick(View view) {
                    this.f115196a.mo160660a(this.f115197b, this.f115198c);
                }
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$IOpenBind$setUnEndTime$1$1"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$g$a$c */
            public static final class View$OnClickListenerC45584c implements View.OnClickListener {

                /* renamed from: a */
                final /* synthetic */ IOpenBind f115199a;

                /* renamed from: b */
                final /* synthetic */ Context f115200b;

                /* renamed from: c */
                final /* synthetic */ UserCustomStatus f115201c;

                View$OnClickListenerC45584c(IOpenBind gVar, Context context, UserCustomStatus userCustomStatus) {
                    this.f115199a = gVar;
                    this.f115200b = context;
                    this.f115201c = userCustomStatus;
                }

                public final void onClick(View view) {
                    this.f115199a.mo160660a(this.f115200b, this.f115201c);
                }
            }

            /* renamed from: a */
            public static void m180850a(IOpenBind gVar, Context context, UserCustomStatusViewHolder mVar) {
                Intrinsics.checkParameterIsNotNull(context, "context");
                Intrinsics.checkParameterIsNotNull(mVar, "holder");
                mVar.mo160683h().setImageResource(R.drawable.ic_icon_silence_status_open);
                mVar.mo160679d().setTextColor(UIUtils.getColor(context, R.color.static_white));
            }

            /* renamed from: a */
            private static void m180848a(IOpenBind gVar, Context context, UserCustomStatus userCustomStatus, UserCustomStatusViewHolder mVar) {
                Long l = userCustomStatus.last_customized_end_time;
                Intrinsics.checkExpressionValueIsNotNull(l, "item.last_customized_end_time");
                String a = C45616s.m180942a(l.longValue(), context);
                mVar.mo160678c().setText(UIHelper.mustacheFormat((int) R.string.Lark_Profile_LastUntilTime, "time", a));
                TextView o = mVar.mo160690o();
                o.setText(a);
                o.setOnClickListener(new View$OnClickListenerC45582a(gVar, a, userCustomStatus, context));
                ViewGroup p = mVar.mo160691p();
                if (p != null) {
                    ((FlowLinearLayout) p).mo160580a(R.id.text_end_time_other);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mine.impl.custom_status.my_status.FlowLinearLayout");
            }

            /* renamed from: a */
            private static void m180851a(IOpenBind gVar, Context context, UserCustomStatusViewHolder mVar, UserCustomStatus userCustomStatus) {
                mVar.mo160678c().setText(UIUtils.getString(context, R.string.Lark_Profile_StatusEndTimeTillMeetingEnds_Option));
                ViewGroup p = mVar.mo160691p();
                if (p != null) {
                    ((FlowLinearLayout) p).mo160580a(R.id.text_end_time_other);
                    TextView o = mVar.mo160690o();
                    o.setText(UIHelper.getString(R.string.Lark_Profile_StatusEndTimeTillMeetingEnds_Option));
                    o.setOnClickListener(new View$OnClickListenerC45584c(gVar, context, userCustomStatus));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mine.impl.custom_status.my_status.FlowLinearLayout");
            }

            /* renamed from: a */
            public static void m180849a(IOpenBind gVar, Context context, UserCustomStatus userCustomStatus, UserCustomStatusViewHolder mVar, long j) {
                Intrinsics.checkParameterIsNotNull(context, "context");
                Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
                Intrinsics.checkParameterIsNotNull(mVar, "holder");
                mVar.mo160677b().setTextColor(UIUtils.getColor(context, R.color.static_white));
                mVar.mo160678c().setTextColor(UIUtils.getColor(context, R.color.static_white_80));
                StatusEffectiveInterval statusEffectiveInterval = userCustomStatus.effective_interval;
                if (statusEffectiveInterval != null) {
                    Boolean bool = statusEffectiveInterval.is_show_end_time;
                    Intrinsics.checkExpressionValueIsNotNull(bool, "it.is_show_end_time");
                    if (bool.booleanValue()) {
                        Long l = userCustomStatus.last_customized_end_time;
                        if (l == null || l.longValue() < j) {
                            Long l2 = statusEffectiveInterval.end_time;
                            Intrinsics.checkExpressionValueIsNotNull(l2, "it.end_time");
                            m180852b(gVar, context, userCustomStatus, mVar, l2.longValue());
                            return;
                        }
                        m180848a(gVar, context, userCustomStatus, mVar);
                        return;
                    }
                    m180851a(gVar, context, mVar, userCustomStatus);
                    return;
                }
                m180851a(gVar, context, mVar, userCustomStatus);
            }

            /* renamed from: b */
            private static void m180852b(IOpenBind gVar, Context context, UserCustomStatus userCustomStatus, UserCustomStatusViewHolder mVar, long j) {
                CharSequence charSequence;
                int i;
                TextView o = mVar.mo160690o();
                o.setText(UIHelper.getString(R.string.Lark_Profile_OtherTimes));
                o.setOnClickListener(new View$OnClickListenerC45583b(gVar, context, userCustomStatus));
                UserCustomStatusDuration userCustomStatusDuration = userCustomStatus.last_selected_duration;
                Intrinsics.checkExpressionValueIsNotNull(userCustomStatusDuration, "item.last_selected_duration");
                int value = userCustomStatusDuration.getValue();
                String a = C45616s.m180942a(j, context);
                TextView c = mVar.mo160678c();
                if (!TextUtils.isEmpty(a)) {
                    charSequence = UIHelper.mustacheFormat((int) R.string.Lark_Profile_LastUntilTime, "time", a);
                }
                c.setText(charSequence);
                ViewGroup p = mVar.mo160691p();
                if (p != null) {
                    FlowLinearLayout flowLinearLayout = (FlowLinearLayout) p;
                    if (value == UserCustomStatusDuration.MINUTES_30.getValue()) {
                        i = R.id.text_end_time_thirty;
                    } else if (value == UserCustomStatusDuration.HOUR_1.getValue()) {
                        i = R.id.text_end_time_one;
                    } else if (value == UserCustomStatusDuration.HOUR_2.getValue()) {
                        i = R.id.text_end_time_two;
                    } else if (value == UserCustomStatusDuration.HOUR_4.getValue()) {
                        i = R.id.text_end_time_four;
                    } else if (value == UserCustomStatusDuration.UNTIL_TONIGHT.getValue()) {
                        i = R.id.text_end_time_tonight;
                    } else {
                        i = -1;
                    }
                    flowLinearLayout.mo160580a(i);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mine.impl.custom_status.my_status.FlowLinearLayout");
            }
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bb\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$IPullBind;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$IViewHolderBinder;", "getIconPullForegroundResource", "", "getPullCardVisibility", "getPullIconClickListener", "Landroid/view/View$OnClickListener;", "item", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "setIconPullLayouts", "", "iconPull", "Landroid/view/View;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$h */
    public interface IPullBind extends IViewHolderBinder {

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$h$a */
        public static final class C45585a {
            /* renamed from: a */
            public static int m180853a(IPullBind hVar) {
                return 0;
            }

            /* renamed from: b */
            public static int m180856b(IPullBind hVar) {
                return R.drawable.ud_icon_up_outlined;
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$h$a$a */
            public static final class View$OnClickListenerC45586a implements View.OnClickListener {

                /* renamed from: a */
                final /* synthetic */ IPullBind f115202a;

                /* renamed from: b */
                final /* synthetic */ UserCustomStatus f115203b;

                View$OnClickListenerC45586a(IPullBind hVar, UserCustomStatus userCustomStatus) {
                    this.f115202a = hVar;
                    this.f115203b = userCustomStatus;
                }

                public final void onClick(View view) {
                    this.f115202a.mo160612a(-1);
                    UserCustomStatusHitPoint.f115066a.mo160412b((int) this.f115203b.id.longValue());
                }
            }

            /* renamed from: a */
            public static View.OnClickListener m180854a(IPullBind hVar, UserCustomStatus userCustomStatus) {
                Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
                return new View$OnClickListenerC45586a(hVar, userCustomStatus);
            }

            /* renamed from: a */
            public static void m180855a(IPullBind hVar, View view) {
                Intrinsics.checkParameterIsNotNull(view, "iconPull");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    layoutParams2.width = CustomStatusUIUtils.f115068a.mo160434a(36);
                    layoutParams2.height = CustomStatusUIUtils.f115068a.mo160434a(36);
                    layoutParams2.setMarginEnd(CustomStatusUIUtils.f115068a.mo160434a(16));
                    view.setLayoutParams(layoutParams2);
                    view.setPadding(CustomStatusUIUtils.f115068a.mo160434a(8), CustomStatusUIUtils.f115068a.mo160434a(8), CustomStatusUIUtils.f115068a.mo160434a(8), CustomStatusUIUtils.f115068a.mo160434a(8));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
    }

    /* renamed from: a */
    private final void m180798a(IStatusSwitcher aVar) {
        List<UpdateUserCustomStatusMeta> a = aVar.mo160617a();
        mo160642a(aVar.mo160618a(this.f115170b, a), aVar.mo160619b());
        this.f115177i.mo160600a(a);
    }

    /* renamed from: b */
    private final List<UserCustomStatus> m180800b(Map<Long, UserCustomStatus> map) {
        return CollectionsKt.sortedWith(map.values(), new C45598o());
    }

    /* renamed from: c */
    private final boolean m180801c(UserCustomStatus userCustomStatus) {
        Long l = userCustomStatus.id;
        long j = this.f115172d;
        if (l != null && l.longValue() == j) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final boolean m180802d(UserCustomStatus userCustomStatus) {
        Long l = userCustomStatus.id;
        long j = this.f115174f;
        if (l != null && l.longValue() == j) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bb\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$INoPullBind;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$IViewHolderBinder;", "getIconPullForegroundResource", "", "getPullCardVisibility", "getPullIconClickListener", "Landroid/view/View$OnClickListener;", "item", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "setIconPullLayouts", "", "iconPull", "Landroid/view/View;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$f */
    public interface INoPullBind extends IViewHolderBinder {

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$f$a */
        public static final class C45579a {
            /* renamed from: a */
            public static int m180843a(INoPullBind fVar) {
                return 8;
            }

            /* renamed from: b */
            public static int m180846b(INoPullBind fVar) {
                return R.drawable.ud_icon_more_outlined;
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$f$a$a */
            public static final class View$OnClickListenerC45580a implements View.OnClickListener {

                /* renamed from: a */
                final /* synthetic */ INoPullBind f115190a;

                /* renamed from: b */
                final /* synthetic */ UserCustomStatus f115191b;

                View$OnClickListenerC45580a(INoPullBind fVar, UserCustomStatus userCustomStatus) {
                    this.f115190a = fVar;
                    this.f115191b = userCustomStatus;
                }

                public final void onClick(View view) {
                    INoPullBind fVar = this.f115190a;
                    Long l = this.f115191b.id;
                    Intrinsics.checkExpressionValueIsNotNull(l, "item.id");
                    fVar.mo160612a(l.longValue());
                    UserCustomStatusHitPoint.f115066a.mo160401a((int) this.f115191b.id.longValue());
                    UserCustomStatusHitPoint.f115066a.mo160416c((int) this.f115191b.id.longValue());
                }
            }

            /* renamed from: a */
            public static View.OnClickListener m180844a(INoPullBind fVar, UserCustomStatus userCustomStatus) {
                Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
                return new View$OnClickListenerC45580a(fVar, userCustomStatus);
            }

            /* renamed from: a */
            public static void m180845a(INoPullBind fVar, View view) {
                Intrinsics.checkParameterIsNotNull(view, "iconPull");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    layoutParams2.width = CustomStatusUIUtils.f115068a.mo160434a(20);
                    layoutParams2.height = CustomStatusUIUtils.f115068a.mo160434a(20);
                    layoutParams2.setMarginEnd(CustomStatusUIUtils.f115068a.mo160434a(24));
                    view.setLayoutParams(layoutParams2);
                    view.setPadding(0, 0, 0, 0);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
    }

    /* renamed from: a */
    private final void m180799a(Map<Long, UserCustomStatus> map) {
        this.f115171c = m180800b(map);
        this.f115170b = map;
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.my_status.IClickableViewHolder
    /* renamed from: b */
    public void mo160616b(UserCustomStatus userCustomStatus) {
        Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
        this.f115177i.mo160599a(userCustomStatus);
        UserCustomStatusHitPoint.f115066a.mo160426f((int) userCustomStatus.id.longValue());
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.my_status.IClickableViewHolder
    /* renamed from: a */
    public void mo160612a(long j) {
        List<UserCustomStatus> list = this.f115171c;
        long j2 = this.f115174f;
        long j3 = this.f115172d;
        C1374g.C1377b a = C1374g.m6297a(new Diff(this, list, list, j2, j, j3, j3));
        Intrinsics.checkExpressionValueIsNotNull(a, "DiffUtil.calculateDiff(\n…wPullId, openId, openId))");
        this.f115174f = j;
        a.mo7412a(this);
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.my_status.IClickableViewHolder
    /* renamed from: a */
    public void mo160613a(UserCustomStatus userCustomStatus) {
        StatusSwitcher dVar;
        boolean z;
        Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
        UserCustomStatus a = m180797a();
        if (a == null) {
            dVar = new StatusSwitcher(new TimeSwitcher.DefaultTimeSwitcher(userCustomStatus), null, 2, null);
        } else if (Intrinsics.areEqual(userCustomStatus.id, a.id)) {
            dVar = new StatusSwitcher(new TimeSwitcher.CloseTimeSwitcher(userCustomStatus), null, 2, null);
        } else {
            dVar = new StatusSwitcher(new TimeSwitcher.DefaultTimeSwitcher(userCustomStatus), new TimeSwitcher.CloseTimeSwitcher(a));
        }
        m180798a(dVar);
        UserCustomStatusHitPoint aVar = UserCustomStatusHitPoint.f115066a;
        int longValue = (int) userCustomStatus.id.longValue();
        if (a == null || !Intrinsics.areEqual(userCustomStatus.id, a.id)) {
            z = true;
        } else {
            z = false;
        }
        aVar.mo160403a(longValue, z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.b$o */
    public static final class C45598o<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(t.order_weight, t2.order_weight);
        }
    }

    public UserCustomStatusAdapter(Context context, OnClickListener jVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(jVar, "clickListener");
        this.f115176h = context;
        this.f115177i = jVar;
    }

    /* renamed from: a */
    public UserCustomStatusViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f115176h).inflate(this.f115173e, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…LayoutRes, parent, false)");
        return new UserCustomStatusViewHolder(inflate);
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.my_status.IClickableViewHolder
    /* renamed from: a */
    public void mo160614a(UserCustomStatus userCustomStatus, UserCustomStatusDuration userCustomStatusDuration) {
        StatusSwitcher dVar;
        Long l;
        Long l2;
        Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
        Intrinsics.checkParameterIsNotNull(userCustomStatusDuration, "duration");
        UserCustomStatus a = m180797a();
        boolean z = true;
        if (a == null) {
            dVar = new StatusSwitcher(new TimeSwitcher.DurationTimeSwitcher(userCustomStatus, userCustomStatusDuration), null, 2, null);
        } else if (!Intrinsics.areEqual(a.id, userCustomStatus.id)) {
            dVar = new StatusSwitcher(new TimeSwitcher.DurationTimeSwitcher(userCustomStatus, userCustomStatusDuration), new TimeSwitcher.CloseTimeSwitcher(a));
        } else if ((userCustomStatus.last_customized_end_time == null || ((l2 = userCustomStatus.last_customized_end_time) != null && l2.longValue() == 0)) && userCustomStatus.last_selected_duration == userCustomStatusDuration) {
            dVar = new StatusSwitcher(new TimeSwitcher.CloseTimeSwitcher(userCustomStatus), null, 2, null);
        } else {
            dVar = new StatusSwitcher(new TimeSwitcher.DurationTimeSwitcher(userCustomStatus, userCustomStatusDuration), null, 2, null);
        }
        UserCustomStatusHitPoint aVar = UserCustomStatusHitPoint.f115066a;
        if (a != null && Intrinsics.areEqual(a.id, userCustomStatus.id) && ((userCustomStatus.last_customized_end_time == null || ((l = userCustomStatus.last_customized_end_time) != null && l.longValue() == 0)) && userCustomStatus.last_selected_duration == userCustomStatusDuration)) {
            z = false;
        }
        aVar.mo160404a(userCustomStatusDuration, z, (int) userCustomStatus.id.longValue());
        m180798a(dVar);
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.my_status.IClickableViewHolder
    /* renamed from: a */
    public void mo160615a(UserCustomStatus userCustomStatus, Long l) {
        StatusSwitcher dVar;
        Intrinsics.checkParameterIsNotNull(userCustomStatus, "item");
        UserCustomStatus a = m180797a();
        if (l == null) {
            dVar = new StatusSwitcher(new TimeSwitcher.CloseTimeSwitcher(userCustomStatus), null, 2, null);
            UserCustomStatusHitPoint.f115066a.mo160423e((int) userCustomStatus.id.longValue());
        } else if (a == null || Intrinsics.areEqual(a.id, userCustomStatus.id)) {
            dVar = new StatusSwitcher(new TimeSwitcher.CustomTimeSwitcher(userCustomStatus, l.longValue()), null, 2, null);
        } else {
            dVar = new StatusSwitcher(new TimeSwitcher.CustomTimeSwitcher(userCustomStatus, l.longValue()), new TimeSwitcher.CloseTimeSwitcher(a));
        }
        m180798a(dVar);
    }

    /* renamed from: a */
    public void onBindViewHolder(UserCustomStatusViewHolder mVar, int i) {
        Intrinsics.checkParameterIsNotNull(mVar, "holder");
        onBindViewHolder(mVar, i, new ArrayList());
    }
}
