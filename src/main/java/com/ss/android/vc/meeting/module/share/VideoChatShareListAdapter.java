package com.ss.android.vc.meeting.module.share;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.C0689b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.common.widget.tag.ExternalTag;
import com.ss.android.vc.dependency.AbstractC60882ag;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.aj;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u0018\u0000 `2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006^_`abcB-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\u0018\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u0018H\u0002J\b\u0010J\u001a\u00020GH\u0002J\b\u0010K\u001a\u00020GH\u0002J\u0010\u0010L\u001a\u00020G2\u0006\u0010M\u001a\u00020\nH\u0002J\b\u0010N\u001a\u00020\u000eH\u0016J\u0010\u0010O\u001a\u00020\u000e2\u0006\u0010P\u001a\u00020\u000eH\u0016J\u0006\u0010Q\u001a\u00020\u0018J\u0018\u0010R\u001a\u00020G2\u0006\u0010H\u001a\u00020\u00022\u0006\u0010P\u001a\u00020\u000eH\u0016J\u0018\u0010S\u001a\u00020\u00022\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u000eH\u0016J\u0014\u0010W\u001a\u00020G2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00180YJ\u0014\u0010\u001c\u001a\u00020G2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00180YJ\u000e\u0010Z\u001a\u00020G2\u0006\u0010[\u001a\u00020.J\u000e\u0010\\\u001a\u00020G2\u0006\u0010[\u001a\u000204J\u000e\u0010]\u001a\u00020G2\u0006\u0010[\u001a\u00020:R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R.\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010'R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R*\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dR\u001c\u0010-\u001a\u0004\u0018\u00010.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00103\u001a\u0004\u0018\u000104X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u00109\u001a\u0004\u0018\u00010:X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bD\u0010E¨\u0006d"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/VideoChatShareListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareListAdapter$ViewHolder;", "context", "Landroid/content/Context;", "view", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareView;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "authMode", "", "searchMode", "(Landroid/content/Context;Lcom/ss/android/vc/meeting/module/share/VideoChatShareView;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;ZZ)V", "SIZE", "", "getSIZE", "()I", "TAG", "", "kotlin.jvm.PlatformType", "getAuthMode", "()Z", "calendarGroupChildData", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "Lkotlin/collections/ArrayList;", "getCalendarGroupChildData", "()Ljava/util/ArrayList;", "setCalendarGroupChildData", "(Ljava/util/ArrayList;)V", "calendarGroupHolder", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareListAdapter$CalendarGroupHolder;", "getCalendarGroupHolder", "()Lcom/ss/android/vc/meeting/module/share/VideoChatShareListAdapter$CalendarGroupHolder;", "setCalendarGroupHolder", "(Lcom/ss/android/vc/meeting/module/share/VideoChatShareListAdapter$CalendarGroupHolder;)V", "calendarGroupIsExpand", "getCalendarGroupIsExpand", "setCalendarGroupIsExpand", "(Z)V", "getContext", "()Landroid/content/Context;", "feedList", "getFeedList", "setFeedList", "mListener", "Lcom/ss/android/vc/meeting/module/share/OnVideoChatShareItemClickListener;", "getMListener", "()Lcom/ss/android/vc/meeting/module/share/OnVideoChatShareItemClickListener;", "setMListener", "(Lcom/ss/android/vc/meeting/module/share/OnVideoChatShareItemClickListener;)V", "mOnTouchListener", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareListAdapter$IOnItemTouchListener;", "getMOnTouchListener", "()Lcom/ss/android/vc/meeting/module/share/VideoChatShareListAdapter$IOnItemTouchListener;", "setMOnTouchListener", "(Lcom/ss/android/vc/meeting/module/share/VideoChatShareListAdapter$IOnItemTouchListener;)V", "mSelectedItemsListener", "Lcom/ss/android/vc/meeting/module/share/VideoChatGetSelectedItemsListener;", "getMSelectedItemsListener", "()Lcom/ss/android/vc/meeting/module/share/VideoChatGetSelectedItemsListener;", "setMSelectedItemsListener", "(Lcom/ss/android/vc/meeting/module/share/VideoChatGetSelectedItemsListener;)V", "getMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "setMeeting", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "getSearchMode", "getView", "()Lcom/ss/android/vc/meeting/module/share/VideoChatShareView;", "bindCustomStatus", "", "holder", "card", "collapseCalendarGroupChildData", "expandCalendarGroupChildData", "expandView", "expand", "getItemCount", "getItemViewType", "position", "initCalendarGroup", "onBindViewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "resetAll", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "setOnItemClickListener", "listener", "setOnPressedListener", "setSelectedItemsListener", "CalendarGroupChildHolder", "CalendarGroupHolder", "Companion", "IOnItemTouchListener", "P2PHolder", "ViewHolder", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.share.e */
public final class VideoChatShareListAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public static final int f158643a = 1;

    /* renamed from: b */
    public static final int f158644b = 2;

    /* renamed from: c */
    public static final int f158645c = 3;

    /* renamed from: d */
    public static final int f158646d = 30;

    /* renamed from: e */
    public static final Companion f158647e = new Companion(null);

    /* renamed from: f */
    private final String f158648f = getClass().getSimpleName();

    /* renamed from: g */
    private final int f158649g;

    /* renamed from: h */
    private ArrayList<VideoChatShareItem> f158650h;

    /* renamed from: i */
    private OnVideoChatShareItemClickListener f158651i;

    /* renamed from: j */
    private VideoChatGetSelectedItemsListener f158652j;

    /* renamed from: k */
    private IOnItemTouchListener f158653k;

    /* renamed from: l */
    private boolean f158654l;

    /* renamed from: m */
    private ArrayList<VideoChatShareItem> f158655m;

    /* renamed from: n */
    private CalendarGroupHolder f158656n;

    /* renamed from: o */
    private final Context f158657o;

    /* renamed from: p */
    private final VideoChatShareView f158658p;

    /* renamed from: q */
    private C61303k f158659q;

    /* renamed from: r */
    private final boolean f158660r;

    /* renamed from: s */
    private final boolean f158661s;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/VideoChatShareListAdapter$IOnItemTouchListener;", "", "onPressed", "", "position", "", "onRelease", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.e$d */
    public interface IOnItemTouchListener {
        /* renamed from: a */
        void mo217616a(int i);

        /* renamed from: b */
        void mo217617b(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/VideoChatShareListAdapter$CalendarGroupHolder;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareListAdapter$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "arrowBottomView", "Lcom/ss/android/vc/common/widget/IconFontView;", "kotlin.jvm.PlatformType", "getArrowBottomView", "()Lcom/ss/android/vc/common/widget/IconFontView;", "setArrowBottomView", "(Lcom/ss/android/vc/common/widget/IconFontView;)V", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.e$b */
    public static final class CalendarGroupHolder extends ViewHolder {

        /* renamed from: a */
        private IconFontView f158662a;

        /* renamed from: a */
        public final IconFontView mo217614a() {
            return this.f158662a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CalendarGroupHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f158662a = (IconFontView) view.findViewById(R.id.arrow_bottom_view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/VideoChatShareListAdapter$Companion;", "", "()V", "MAX_SHARE_NUM", "", "getMAX_SHARE_NUM", "()I", "TYPE_CALENDAR_GROUP", "getTYPE_CALENDAR_GROUP", "TYPE_CALENDAR_GROUP_CHILD", "getTYPE_CALENDAR_GROUP_CHILD", "TYPE_OTHER", "getTYPE_OTHER", "TYPE_SEARCH_P2P", "getTYPE_SEARCH_P2P", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.e$c */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo217615a() {
            return VideoChatShareListAdapter.f158646d;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/VideoChatShareListAdapter$P2PHolder;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareListAdapter$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "onLeavetag", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getOnLeavetag", "()Landroid/widget/TextView;", "setOnLeavetag", "(Landroid/widget/TextView;)V", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.e$e */
    public static final class P2PHolder extends ViewHolder {

        /* renamed from: a */
        private TextView f158663a;

        /* renamed from: a */
        public final TextView mo217618a() {
            return this.f158663a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public P2PHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f158663a = (TextView) view.findViewById(R.id.on_leave_tag);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u00130\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n \u0007*\u0004\u0018\u00010\u00030\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0004R\"\u0010\u001c\u001a\n \u0007*\u0004\u0018\u00010\u001d0\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0019\u0010\"\u001a\n \u0007*\u0004\u0018\u00010\u00130\u0013¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0019\u0010$\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0011R\"\u0010&\u001a\n \u0007*\u0004\u0018\u00010'0'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010,\u001a\n \u0007*\u0004\u0018\u00010'0'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+¨\u00063"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/VideoChatShareListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "avatar", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView;", "kotlin.jvm.PlatformType", "getAvatar", "()Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView;", "checkbox", "Landroid/widget/CheckBox;", "getCheckbox", "()Landroid/widget/CheckBox;", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "desc", "Landroid/widget/TextView;", "getDesc", "()Landroid/widget/TextView;", "setDesc", "(Landroid/widget/TextView;)V", "divider", "getDivider", "()Landroid/view/View;", "setDivider", "externalTag", "Lcom/ss/android/vc/common/widget/tag/ExternalTag;", "getExternalTag", "()Lcom/ss/android/vc/common/widget/tag/ExternalTag;", "setExternalTag", "(Lcom/ss/android/vc/common/widget/tag/ExternalTag;)V", "name", "getName", "nameLayout", "getNameLayout", UpdateKey.STATUS, "Landroidx/appcompat/widget/AppCompatImageView;", "getStatus", "()Landroidx/appcompat/widget/AppCompatImageView;", "setStatus", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "zenModeTag", "getZenModeTag", "setZenModeTag", "hideDivider", "", "hide", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.e$f */
    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final LKUIRoundedImageView f158664a;

        /* renamed from: b */
        private final TextView f158665b;

        /* renamed from: c */
        private final CheckBox f158666c;

        /* renamed from: d */
        private final ConstraintLayout f158667d;

        /* renamed from: e */
        private final ConstraintLayout f158668e;

        /* renamed from: f */
        private ExternalTag f158669f;

        /* renamed from: g */
        private AppCompatImageView f158670g;

        /* renamed from: h */
        private AppCompatImageView f158671h;

        /* renamed from: i */
        private View f158672i;

        /* renamed from: j */
        private TextView f158673j;

        /* renamed from: b */
        public final LKUIRoundedImageView mo217620b() {
            return this.f158664a;
        }

        /* renamed from: c */
        public final TextView mo217621c() {
            return this.f158665b;
        }

        /* renamed from: d */
        public final CheckBox mo217622d() {
            return this.f158666c;
        }

        /* renamed from: e */
        public final ConstraintLayout mo217623e() {
            return this.f158667d;
        }

        /* renamed from: f */
        public final ConstraintLayout mo217624f() {
            return this.f158668e;
        }

        /* renamed from: g */
        public final ExternalTag mo217625g() {
            return this.f158669f;
        }

        /* renamed from: h */
        public final AppCompatImageView mo217626h() {
            return this.f158670g;
        }

        /* renamed from: i */
        public final AppCompatImageView mo217627i() {
            return this.f158671h;
        }

        /* renamed from: j */
        public final View mo217628j() {
            return this.f158672i;
        }

        /* renamed from: k */
        public final TextView mo217629k() {
            return this.f158673j;
        }

        /* renamed from: a */
        public final void mo217619a(boolean z) {
            if (z) {
                View view = this.f158672i;
                if (view != null) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            View view2 = this.f158672i;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f158664a = (LKUIRoundedImageView) view.findViewById(R.id.avatar);
            this.f158665b = (TextView) view.findViewById(R.id.name);
            this.f158666c = (CheckBox) view.findViewById(R.id.checkbox);
            this.f158667d = (ConstraintLayout) view.findViewById(R.id.container);
            this.f158668e = (ConstraintLayout) view.findViewById(R.id.name_layout);
            this.f158669f = (ExternalTag) view.findViewById(R.id.external_tag);
            this.f158670g = (AppCompatImageView) view.findViewById(R.id.do_not_disturb_tag);
            this.f158671h = (AppCompatImageView) view.findViewById(R.id.status);
            this.f158672i = view.findViewById(R.id.divider_next_people);
            this.f158673j = (TextView) view.findViewById(R.id.description);
        }
    }

    /* renamed from: a */
    public final OnVideoChatShareItemClickListener mo217598a() {
        return this.f158651i;
    }

    /* renamed from: b */
    public final VideoChatGetSelectedItemsListener mo217606b() {
        return this.f158652j;
    }

    /* renamed from: c */
    public final IOnItemTouchListener mo217608c() {
        return this.f158653k;
    }

    /* renamed from: d */
    public final boolean mo217609d() {
        return this.f158654l;
    }

    /* renamed from: h */
    public final boolean mo217613h() {
        return this.f158660r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f158650h.size();
    }

    /* renamed from: e */
    public final void mo217610e() {
        ArrayList<VideoChatShareItem> arrayList = this.f158655m;
        if (arrayList == null) {
            this.f158658p.mo217684q();
            return;
        }
        ArrayList<VideoChatShareItem> arrayList2 = this.f158650h;
        if (arrayList == null) {
            Intrinsics.throwNpe();
        }
        arrayList2.addAll(1, arrayList);
        notifyDataSetChanged();
        m246559b(true);
    }

    /* renamed from: f */
    public final void mo217611f() {
        ArrayList<VideoChatShareItem> arrayList = this.f158655m;
        if (arrayList != null) {
            ArrayList<VideoChatShareItem> arrayList2 = this.f158650h;
            if (arrayList == null) {
                Intrinsics.throwNpe();
            }
            arrayList2.removeAll(arrayList);
            notifyDataSetChanged();
            m246559b(false);
        }
    }

    /* renamed from: g */
    public final VideoChatShareItem mo217612g() {
        String string = this.f158657o.getResources().getString(R.string.View_G_EventGuests);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.resources.getStr…tring.View_G_EventGuests)");
        return new VideoChatShareItem("", string, "", "", ShareItemType.CALENDAR_GROUP, false, null, null, false, false, false, 0, null, null, null, false, null, 130048, null);
    }

    /* renamed from: a */
    public final void mo217600a(OnVideoChatShareItemClickListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f158651i = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/VideoChatShareListAdapter$CalendarGroupChildHolder;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareListAdapter$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.e$a */
    public static final class CalendarGroupChildHolder extends ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CalendarGroupChildHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
        }
    }

    /* renamed from: a */
    public final void mo217601a(VideoChatGetSelectedItemsListener dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "listener");
        this.f158652j = dVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.e$k */
    public static final class View$OnClickListenerC62970k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareListAdapter f158683a;

        View$OnClickListenerC62970k(VideoChatShareListAdapter eVar) {
            this.f158683a = eVar;
        }

        public final void onClick(View view) {
            if (!this.f158683a.mo217609d()) {
                this.f158683a.mo217605a(true);
                this.f158683a.mo217610e();
                return;
            }
            this.f158683a.mo217605a(false);
            this.f158683a.mo217611f();
        }
    }

    /* renamed from: a */
    public final void mo217602a(IOnItemTouchListener dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "listener");
        this.f158653k = dVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "iconKey", "", "kotlin.jvm.PlatformType", "onStatus"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.e$g */
    public static final class C62966g implements AbstractC60882ag.AbstractC60883a {

        /* renamed from: a */
        final /* synthetic */ ViewHolder f158674a;

        C62966g(ViewHolder fVar) {
            this.f158674a = fVar;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60882ag.AbstractC60883a
        public final void onStatus(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C52977a.m205190a().mo180995a(this.f158674a.mo217627i(), str);
                return;
            }
            AppCompatImageView i = this.f158674a.mo217627i();
            Intrinsics.checkExpressionValueIsNotNull(i, "holder.status");
            i.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "iconKey", "", "kotlin.jvm.PlatformType", "onStatus"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.e$h */
    public static final class C62967h implements AbstractC60882ag.AbstractC60883a {

        /* renamed from: a */
        final /* synthetic */ ViewHolder f158675a;

        C62967h(ViewHolder fVar) {
            this.f158675a = fVar;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60882ag.AbstractC60883a
        public final void onStatus(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C52977a.m205190a().mo180995a(this.f158675a.mo217627i(), str);
                return;
            }
            AppCompatImageView i = this.f158675a.mo217627i();
            Intrinsics.checkExpressionValueIsNotNull(i, "holder.status");
            i.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo217605a(boolean z) {
        this.f158654l = z;
    }

    /* renamed from: b */
    private final void m246559b(boolean z) {
        CalendarGroupHolder bVar = this.f158656n;
        if (bVar == null) {
            return;
        }
        if (z) {
            if (bVar == null) {
                Intrinsics.throwNpe();
            }
            View j = bVar.mo217628j();
            Intrinsics.checkExpressionValueIsNotNull(j, "calendarGroupHolder!!.divider");
            j.setVisibility(8);
            CalendarGroupHolder bVar2 = this.f158656n;
            if (bVar2 == null) {
                Intrinsics.throwNpe();
            }
            bVar2.mo217614a().setText(R.string.iconfont_icon_arrow_up);
            return;
        }
        if (bVar == null) {
            Intrinsics.throwNpe();
        }
        View j2 = bVar.mo217628j();
        Intrinsics.checkExpressionValueIsNotNull(j2, "calendarGroupHolder!!.divider");
        j2.setVisibility(0);
        CalendarGroupHolder bVar3 = this.f158656n;
        if (bVar3 == null) {
            Intrinsics.throwNpe();
        }
        bVar3.mo217614a().setText(R.string.iconfont_icon_arrow_down);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        ShareItemType shareItemType;
        ShareItemType shareItemType2;
        if (C60742af.m236059a(this.f158650h)) {
            return f158643a;
        }
        VideoChatShareItem videoChatShareItem = this.f158650h.get(i);
        ShareItemType shareItemType3 = null;
        if (this.f158661s) {
            if (videoChatShareItem != null) {
                shareItemType2 = videoChatShareItem.getType();
            } else {
                shareItemType2 = null;
            }
            if (shareItemType2 != ShareItemType.GROUP) {
                return 0;
            }
        }
        if (videoChatShareItem != null) {
            shareItemType = videoChatShareItem.getType();
        } else {
            shareItemType = null;
        }
        if (shareItemType == ShareItemType.CALENDAR_GROUP) {
            return f158644b;
        }
        if (videoChatShareItem != null) {
            shareItemType3 = videoChatShareItem.getType();
        }
        if (shareItemType3 == ShareItemType.CALENDAR_GROUP_CHILD) {
            return f158645c;
        }
        return f158643a;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.e$i */
    public static final class View$OnClickListenerC62968i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareListAdapter f158676a;

        /* renamed from: b */
        final /* synthetic */ ViewHolder f158677b;

        /* renamed from: c */
        final /* synthetic */ VideoChatShareItem f158678c;

        /* renamed from: d */
        final /* synthetic */ int f158679d;

        View$OnClickListenerC62968i(VideoChatShareListAdapter eVar, ViewHolder fVar, VideoChatShareItem videoChatShareItem, int i) {
            this.f158676a = eVar;
            this.f158677b = fVar;
            this.f158678c = videoChatShareItem;
            this.f158679d = i;
        }

        public final void onClick(View view) {
            boolean z;
            ArrayList<VideoChatShareItem> arrayList;
            ArrayList<VideoChatShareItem> a;
            if (this.f158677b instanceof CalendarGroupChildHolder) {
                return;
            }
            if (this.f158678c.isBlocked()) {
                C60738ac.m236023a((int) R.string.View_G_NoPermissionsToShareMeetingBlocked);
            } else if (!this.f158678c.getHasPermission()) {
                C60738ac.m236024a(R.drawable.icon_no_support_link_error, R.string.View_M_NoPermissionToShareMeetingShort, 3000);
            } else {
                if (!this.f158676a.mo217613h()) {
                    VideoChatGetSelectedItemsListener b = this.f158676a.mo217606b();
                    Integer num = null;
                    if (b != null) {
                        arrayList = b.mo217597a();
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        VideoChatGetSelectedItemsListener b2 = this.f158676a.mo217606b();
                        if (!(b2 == null || (a = b2.mo217597a()) == null)) {
                            num = Integer.valueOf(a.size());
                        }
                        if (num == null) {
                            Intrinsics.throwNpe();
                        }
                        if (num.intValue() >= VideoChatShareListAdapter.f158647e.mo217615a()) {
                            CheckBox d = this.f158677b.mo217622d();
                            Intrinsics.checkExpressionValueIsNotNull(d, "holder.checkbox");
                            if (!d.isChecked()) {
                                C60738ac.m236029a(UIHelper.mustacheFormat((int) R.string.View_G_SelectMaxNew, "selectCount", String.valueOf(VideoChatShareListAdapter.f158647e.mo217615a())));
                                return;
                            }
                        }
                    }
                }
                CheckBox d2 = this.f158677b.mo217622d();
                Intrinsics.checkExpressionValueIsNotNull(d2, "holder.checkbox");
                CheckBox d3 = this.f158677b.mo217622d();
                Intrinsics.checkExpressionValueIsNotNull(d3, "holder.checkbox");
                if (d3.isChecked() || !this.f158678c.getHasPermission() || this.f158678c.isBlocked()) {
                    z = false;
                } else {
                    z = true;
                }
                d2.setChecked(z);
                OnVideoChatShareItemClickListener a2 = this.f158676a.mo217598a();
                if (a2 != null) {
                    a2.mo217588a(this.f158678c, this.f158679d);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo217607b(List<VideoChatShareItem> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        List<VideoChatShareItem> list2 = list;
        if (!CollectionUtils.isEmpty(list2)) {
            ArrayList<VideoChatShareItem> arrayList = this.f158655m;
            if (arrayList != null) {
                ArrayList<VideoChatShareItem> arrayList2 = this.f158650h;
                if (arrayList == null) {
                    Intrinsics.throwNpe();
                }
                arrayList2.removeAll(arrayList);
                ArrayList<VideoChatShareItem> arrayList3 = this.f158655m;
                if (arrayList3 == null) {
                    Intrinsics.throwNpe();
                }
                arrayList3.clear();
            }
            ArrayList<VideoChatShareItem> arrayList4 = new ArrayList<>(list2);
            this.f158655m = arrayList4;
            ArrayList<VideoChatShareItem> arrayList5 = this.f158650h;
            if (arrayList4 == null) {
                Intrinsics.throwNpe();
            }
            arrayList5.addAll(1, arrayList4);
            m246559b(true);
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo217604a(List<VideoChatShareItem> list) {
        VideoChat.MeetingSource meetingSource;
        VideoChat e;
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f158650h.clear();
        List<VideoChatShareItem> list2 = list;
        if (!CollectionUtils.isEmpty(list2)) {
            C61303k kVar = this.f158659q;
            if (kVar != null) {
                if (kVar == null || (e = kVar.mo212056e()) == null) {
                    meetingSource = null;
                } else {
                    meetingSource = e.getMeetingSource();
                }
                if (meetingSource == VideoChat.MeetingSource.VC_FROM_CALENDAR && !this.f158661s && this.f158660r) {
                    this.f158650h.add(mo217612g());
                }
            }
            this.f158650h.addAll(list2);
        }
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.e$j */
    public static final class View$OnTouchListenerC62969j implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareListAdapter f158680a;

        /* renamed from: b */
        final /* synthetic */ ViewHolder f158681b;

        /* renamed from: c */
        final /* synthetic */ int f158682c;

        View$OnTouchListenerC62969j(VideoChatShareListAdapter eVar, ViewHolder fVar, int i) {
            this.f158680a = eVar;
            this.f158681b = fVar;
            this.f158682c = i;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Integer num;
            if (motionEvent != null) {
                num = Integer.valueOf(motionEvent.getAction());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                this.f158681b.mo217619a(true);
                IOnItemTouchListener c = this.f158680a.mo217608c();
                if (c != null) {
                    c.mo217616a(this.f158682c);
                }
            } else if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 3)) {
                this.f158681b.mo217619a(false);
                IOnItemTouchListener c2 = this.f158680a.mo217608c();
                if (c2 != null) {
                    c2.mo217617b(this.f158682c);
                }
            }
            if (view != null) {
                return view.onTouchEvent(motionEvent);
            }
            return true;
        }
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == f158643a) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.videochat_share_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "v");
            return new ViewHolder(inflate);
        } else if (i == f158644b) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.videochat_share_calendar_group_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate2, "v");
            return new CalendarGroupHolder(inflate2);
        } else if (i == f158645c) {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.videochat_share_calendar_group_child_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate3, "v");
            return new CalendarGroupChildHolder(inflate3);
        } else {
            View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.videochat_share_p2p_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate4, "v");
            return new P2PHolder(inflate4);
        }
    }

    /* renamed from: a */
    private final void m246558a(ViewHolder fVar, VideoChatShareItem videoChatShareItem) {
        if (videoChatShareItem.getType() != ShareItemType.USER && videoChatShareItem.getType() != ShareItemType.CALENDAR_GROUP_CHILD) {
            AppCompatImageView i = fVar.mo217627i();
            Intrinsics.checkExpressionValueIsNotNull(i, "holder.status");
            i.setVisibility(8);
        } else if (fVar instanceof CalendarGroupChildHolder) {
            AbstractC60882ag g = VideoChatModuleDependency.m236634g();
            Intrinsics.checkExpressionValueIsNotNull(g, "VideoChatModuleDependency.getProfileDependency()");
            if (g.mo196512b()) {
                AppCompatImageView i2 = fVar.mo217627i();
                Intrinsics.checkExpressionValueIsNotNull(i2, "holder.status");
                i2.setVisibility(0);
                VideoChatModuleDependency.m236634g().mo196511a(videoChatShareItem.getCustomStatuses(), new C62966g(fVar));
                return;
            }
            AppCompatImageView i3 = fVar.mo217627i();
            Intrinsics.checkExpressionValueIsNotNull(i3, "holder.status");
            i3.setVisibility(8);
        } else {
            C0689b bVar = new C0689b();
            bVar.mo3901b(fVar.mo217624f());
            AbstractC60882ag g2 = VideoChatModuleDependency.m236634g();
            Intrinsics.checkExpressionValueIsNotNull(g2, "VideoChatModuleDependency.getProfileDependency()");
            if (g2.mo196512b()) {
                bVar.mo3882a(R.id.name, 7, R.id.status, 6);
                bVar.mo3882a(R.id.on_leave_tag, 6, R.id.status, 7);
                bVar.mo3905c(fVar.mo217624f());
                AppCompatImageView i4 = fVar.mo217627i();
                Intrinsics.checkExpressionValueIsNotNull(i4, "holder.status");
                i4.setVisibility(0);
                VideoChatModuleDependency.m236634g().mo196511a(videoChatShareItem.getCustomStatuses(), new C62967h(fVar));
                return;
            }
            bVar.mo3882a(R.id.name, 7, R.id.do_not_disturb_tag, 6);
            bVar.mo3882a(R.id.on_leave_tag, 6, R.id.do_not_disturb_tag, 7);
            bVar.mo3905c(fVar.mo217624f());
            AppCompatImageView i5 = fVar.mo217627i();
            Intrinsics.checkExpressionValueIsNotNull(i5, "holder.status");
            i5.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder fVar, int i) {
        boolean z;
        int i2;
        Intrinsics.checkParameterIsNotNull(fVar, "holder");
        VideoChatShareItem videoChatShareItem = this.f158650h.get(i);
        Intrinsics.checkExpressionValueIsNotNull(videoChatShareItem, "feedList[position]");
        VideoChatShareItem videoChatShareItem2 = videoChatShareItem;
        m246558a(fVar, videoChatShareItem2);
        boolean z2 = true;
        if (TextUtils.isEmpty(videoChatShareItem2.getName())) {
            int i3 = C62971f.f158684a[videoChatShareItem2.getType().ordinal()];
            if (i3 == 1 || i3 == 2) {
                String a = C60773o.m236119a((int) R.string.Lark_View_ServerNoTitle);
                Intrinsics.checkExpressionValueIsNotNull(a, "VCCommonUtils.getString(….Lark_View_ServerNoTitle)");
                videoChatShareItem2.setName(a);
            } else if (i3 == 3 || i3 == 4) {
                String a2 = C60773o.m236119a((int) R.string.Lark_Legacy_UserUnknown);
                Intrinsics.checkExpressionValueIsNotNull(a2, "VCCommonUtils.getString(….Lark_Legacy_UserUnknown)");
                videoChatShareItem2.setName(a2);
            } else if (i3 != 5) {
                String a3 = C60773o.m236119a((int) R.string.View_VM_Unknown);
                Intrinsics.checkExpressionValueIsNotNull(a3, "VCCommonUtils.getString(R.string.View_VM_Unknown)");
                videoChatShareItem2.setName(a3);
            } else {
                String a4 = C60773o.m236119a((int) R.string.View_M_MeetingRoom);
                Intrinsics.checkExpressionValueIsNotNull(a4, "VCCommonUtils.getString(…tring.View_M_MeetingRoom)");
                videoChatShareItem2.setName(a4);
            }
        }
        TextView c = fVar.mo217621c();
        Intrinsics.checkExpressionValueIsNotNull(c, "holder.name");
        c.setText(C57782ag.m224235a(videoChatShareItem2.getName(), videoChatShareItem2.getHitTerms(), C60773o.m236126d(R.color.primary_pri_500)).toString());
        boolean z3 = fVar instanceof CalendarGroupHolder;
        if (z3) {
            this.f158656n = (CalendarGroupHolder) fVar;
        } else {
            int i4 = this.f158649g;
            C60783v.m236230a(videoChatShareItem2.getImageKey(), videoChatShareItem2.getId(), ParticipantType.LARK_USER, fVar.mo217620b(), i4, i4);
        }
        if (fVar instanceof CalendarGroupChildHolder) {
            ConstraintLayout e = fVar.mo217623e();
            Intrinsics.checkExpressionValueIsNotNull(e, "holder.container");
            e.setEnabled(false);
            CheckBox d = fVar.mo217622d();
            Intrinsics.checkExpressionValueIsNotNull(d, "holder.checkbox");
            d.setVisibility(4);
            int i5 = i + 1;
            if (i5 > this.f158650h.size() - 1 || this.f158650h.get(i5).getType() == ShareItemType.CALENDAR_GROUP_CHILD) {
                fVar.mo217619a(true);
            } else {
                fVar.mo217619a(false);
            }
        } else {
            CheckBox d2 = fVar.mo217622d();
            Intrinsics.checkExpressionValueIsNotNull(d2, "holder.checkbox");
            d2.setVisibility(0);
        }
        CheckBox d3 = fVar.mo217622d();
        Intrinsics.checkExpressionValueIsNotNull(d3, "holder.checkbox");
        if (!this.f158658p.mo217670a(videoChatShareItem2) || !videoChatShareItem2.getHasPermission()) {
            z = false;
        } else {
            z = true;
        }
        d3.setChecked(z);
        CheckBox d4 = fVar.mo217622d();
        Intrinsics.checkExpressionValueIsNotNull(d4, "holder.checkbox");
        if (!videoChatShareItem2.getHasPermission() || videoChatShareItem2.isBlocked()) {
            z2 = false;
        }
        d4.setEnabled(z2);
        fVar.mo217623e().setOnClickListener(new View$OnClickListenerC62968i(this, fVar, videoChatShareItem2, i));
        fVar.itemView.setOnTouchListener(new View$OnTouchListenerC62969j(this, fVar, i));
        boolean e2 = VideoChatModuleDependency.m236632e();
        if (!videoChatShareItem2.isExternal() || !e2) {
            ExternalTag g = fVar.mo217625g();
            Intrinsics.checkExpressionValueIsNotNull(g, "holder.externalTag");
            g.setVisibility(8);
        } else {
            ExternalTag g2 = fVar.mo217625g();
            Intrinsics.checkExpressionValueIsNotNull(g2, "holder.externalTag");
            g2.setVisibility(0);
        }
        AbstractC60882ag g3 = VideoChatModuleDependency.m236634g();
        Intrinsics.checkExpressionValueIsNotNull(g3, "VideoChatModuleDependency.getProfileDependency()");
        boolean b = g3.mo196512b();
        TextView k = fVar.mo217629k();
        Intrinsics.checkExpressionValueIsNotNull(k, "holder.desc");
        if (TextUtils.isEmpty(videoChatShareItem2.getDesc())) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        k.setVisibility(i2);
        if (fVar instanceof P2PHolder) {
            TextView k2 = fVar.mo217629k();
            Intrinsics.checkExpressionValueIsNotNull(k2, "holder.desc");
            k2.setText(videoChatShareItem2.getDesc());
            if (videoChatShareItem2.isLeave()) {
                TextView a5 = ((P2PHolder) fVar).mo217618a();
                Intrinsics.checkExpressionValueIsNotNull(a5, "holder.onLeavetag");
                a5.setVisibility(0);
            } else {
                TextView a6 = ((P2PHolder) fVar).mo217618a();
                Intrinsics.checkExpressionValueIsNotNull(a6, "holder.onLeavetag");
                a6.setVisibility(8);
            }
            long zenModeEndTime = videoChatShareItem2.getZenModeEndTime();
            aj settingDependency = VideoChatModuleDependency.getSettingDependency();
            Intrinsics.checkExpressionValueIsNotNull(settingDependency, "VideoChatModuleDependency.getSettingDependency()");
            if (zenModeEndTime <= settingDependency.getSyncNtpTimeMillis() || b) {
                AppCompatImageView h = fVar.mo217626h();
                Intrinsics.checkExpressionValueIsNotNull(h, "holder.zenModeTag");
                h.setVisibility(8);
                return;
            }
            AppCompatImageView h2 = fVar.mo217626h();
            Intrinsics.checkExpressionValueIsNotNull(h2, "holder.zenModeTag");
            h2.setVisibility(0);
        } else if (z3) {
            ((CalendarGroupHolder) fVar).mo217614a().setOnClickListener(new View$OnClickListenerC62970k(this));
        } else {
            TextView k3 = fVar.mo217629k();
            Intrinsics.checkExpressionValueIsNotNull(k3, "holder.desc");
            k3.setText(C57782ag.m224235a(videoChatShareItem2.getDesc(), videoChatShareItem2.getSubtitleHitTerms(), C60773o.m236126d(R.color.primary_pri_500)).toString());
        }
    }

    public VideoChatShareListAdapter(Context context, VideoChatShareView hVar, C61303k kVar, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(hVar, "view");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        this.f158657o = context;
        this.f158658p = hVar;
        this.f158659q = kVar;
        this.f158660r = z;
        this.f158661s = z2;
        this.f158649g = DeviceUtils.getDpFromDimenXml(context, R.dimen.avatar_width_resize);
        this.f158650h = new ArrayList<>();
    }
}
