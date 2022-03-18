package com.ss.android.lark.calendar.impl.features.events.detail.share;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.share.Interface.InnerShareDependency;
import com.ss.android.lark.calendar.impl.features.events.detail.share.entity.ShareItemViewData;
import com.ss.android.lark.calendar.impl.features.events.detail.share.entity.ShareType;
import com.ss.android.lark.calendar.impl.features.events.detail.share.handle.BaseShareHandler;
import com.ss.android.lark.calendar.impl.features.events.detail.share.util.ShareActionFactory;
import com.ss.android.lark.calendar.impl.features.events.detail.share.util.ShareItemFactory;
import com.ss.android.lark.calendar.impl.features.events.detail.share.widget.ShareItemDecoration;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/share/EventShareDialog;", "Lcom/larksuite/framework/ui/BaseDialog;", "context", "Landroid/content/Context;", "mDependency", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/EventShareDialog$EventShareDependency;", "(Landroid/content/Context;Lcom/ss/android/lark/calendar/impl/features/events/detail/share/EventShareDialog$EventShareDependency;)V", "mItemData", "", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareItemViewData;", "shareItemAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/EventShareAdapter;", "getGridColumnNumber", "", "getShareContent", "", "getShareItemData", "initRecycleView", "", "initView", "initWindow", "Companion", "EventShareDependency", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.b */
public final class EventShareDialog extends BaseDialog {

    /* renamed from: b */
    public static final List<ShareType> f79492b = CollectionsKt.listOfNotNull((Object[]) new ShareType[]{ShareType.LARK, ShareType.WX, ShareType.WX_TIMELINE, ShareType.QQ, ShareType.WEIBO, ShareType.CREATE_IMAGE, ShareType.COPY, ShareType.SYS});

    /* renamed from: c */
    public static final List<ShareType> f79493c = CollectionsKt.listOfNotNull((Object[]) new ShareType[]{ShareType.LARK, ShareType.COPY, ShareType.CREATE_IMAGE, ShareType.SYS});

    /* renamed from: d */
    public static final Companion f79494d = new Companion(null);

    /* renamed from: a */
    public final EventShareDependency f79495a;

    /* renamed from: e */
    private List<ShareItemViewData> f79496e;

    /* renamed from: f */
    private final EventShareAdapter f79497f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/share/EventShareDialog$EventShareDependency;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/Interface/InnerShareDependency;", "getEventTime", "", "getEventTitle", "getLinkAddress", "getShareText", "shareEventHitPoint", "", "shareType", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareType;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.b$b */
    public interface EventShareDependency extends InnerShareDependency {
        /* renamed from: a */
        void mo113875a(ShareType shareType);

        /* renamed from: b */
        String mo113876b();

        /* renamed from: c */
        String mo113877c();

        /* renamed from: d */
        String mo113878d();

        /* renamed from: e */
        String mo113879e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\rXT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/share/EventShareDialog$Companion;", "", "()V", "ITEM_ROW_SPACING", "", "LARK_SHARE_ITEMS", "", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareType;", "getLARK_SHARE_ITEMS", "()Ljava/util/List;", "SHARE_ITEMS", "getSHARE_ITEMS", "THRESHOLD_ITEM_SIZE", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    private final void m118074b() {
        m118075c();
        ((TextView) findViewById(R.id.cancelTv)).setOnClickListener(new View$OnClickListenerC31378c(this));
    }

    /* renamed from: d */
    private final int m118076d() {
        int i;
        List<ShareItemViewData> list = this.f79496e;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        if (1 <= i && 5 >= i) {
            return i;
        }
        return 5;
    }

    /* renamed from: e */
    private final List<ShareItemViewData> m118077e() {
        if (C30022a.f74882a.utilsDependency().mo108198b(getContext())) {
            return ShareItemFactory.f79503a.mo113954a(f79493c);
        }
        return ShareItemFactory.f79503a.mo113954a(f79492b);
    }

    /* renamed from: f */
    private final void m118078f() {
        WindowManager.LayoutParams layoutParams;
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        Window window = getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setGravity(80);
        }
    }

    /* renamed from: a */
    public final String mo113947a() {
        boolean z;
        String e = this.f79495a.mo113879e();
        if (e.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Calendar_Share_LinkContent);
            if (mustacheFormat != null) {
                return mustacheFormat;
            }
            return "";
        }
        String mustacheFormat2 = UIHelper.mustacheFormat((int) R.string.Calendar_Share_TimeFront, "EventTime", e);
        if (mustacheFormat2 != null) {
            return mustacheFormat2;
        }
        return "";
    }

    /* renamed from: c */
    private final void m118075c() {
        this.f79496e = m118077e();
        int d = m118076d();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), d);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.shareChannelsRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "shareChannelsRv");
        recyclerView.setLayoutManager(gridLayoutManager);
        ((RecyclerView) findViewById(R.id.shareChannelsRv)).addItemDecoration(new ShareItemDecoration(d, UIHelper.dp2px(16.0f)));
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.shareChannelsRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "shareChannelsRv");
        recyclerView2.setAdapter(this.f79497f);
        this.f79497f.addAll(this.f79496e);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.b$c */
    public static final class View$OnClickListenerC31378c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EventShareDialog f79498a;

        View$OnClickListenerC31378c(EventShareDialog bVar) {
            this.f79498a = bVar;
        }

        public final void onClick(View view) {
            this.f79498a.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "shareType", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareType;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.b$d */
    static final class C31379d extends Lambda implements Function1<ShareType, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ EventShareDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31379d(EventShareDialog bVar, Context context) {
            super(1);
            this.this$0 = bVar;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ShareType shareType) {
            invoke(shareType);
            return Unit.INSTANCE;
        }

        public final void invoke(ShareType shareType) {
            String str;
            String str2;
            Intrinsics.checkParameterIsNotNull(shareType, "shareType");
            this.this$0.dismiss();
            BaseShareHandler a = ShareActionFactory.f79501a.mo113952a(shareType, this.this$0.f79495a);
            if (a != null) {
                Context context = this.$context;
                String d = this.this$0.f79495a.mo113878d();
                String a2 = this.this$0.mo113947a();
                String c = this.this$0.f79495a.mo113877c();
                if (c != null) {
                    str = c;
                } else {
                    str = "";
                }
                String b = this.this$0.f79495a.mo113876b();
                if (b != null) {
                    str2 = b;
                } else {
                    str2 = "";
                }
                a.mo113989a(context, d, a2, str, str2);
            }
            this.this$0.f79495a.mo113875a(shareType);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventShareDialog(Context context, EventShareDependency bVar) {
        super(context, R.style.EventShareDialog);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "mDependency");
        this.f79495a = bVar;
        this.f79497f = new EventShareAdapter(new C31379d(this, context));
        setContentView(R.layout.event_share_dialog);
        m118078f();
        m118074b();
    }
}
