package com.ss.android.lark.chat.chatwindow.chat.v2.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.callback.C25969c;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.AndroidThrottle;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.C58996h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u000e\u0018\u0000 B*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004BCDEB'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0019H\u0002J\b\u00105\u001a\u000203H\u0002J\u0016\u00106\u001a\u0002032\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000008H\u0002J\b\u00109\u001a\u000203H\u0002J \u0010:\u001a\u0002032\u0006\u00104\u001a\u00020\u00192\u0006\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u001eH\u0002J\u0014\u0010=\u001a\u0002032\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000!J\u0006\u0010?\u001a\u000203J\u0006\u0010@\u001a\u000203J\u0014\u0010A\u001a\u0002032\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000!R\u001e\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!0\u001bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\"\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b&\u0010\u0015\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006F"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector;", "T", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "dataProvider", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector$ItemDataProvider;", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$Adapter;Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector$ItemDataProvider;)V", "getAdapter", "()Landroidx/recyclerview/widget/RecyclerView$Adapter;", "setAdapter", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "mCancelableCallbackExecutor", "Lcom/larksuite/framework/callback/CancelableCallbackExecutor;", "mDataObserver", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "getMDataObserver", "()Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "mDataObserver$delegate", "Lkotlin/Lazy;", "mHandler", "Landroid/os/Handler;", "mIsFirstDetected", "", "mItemFilterList", "", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector$ItemFilter;", "mLastScrollEnd", "", "mLastScrollStart", "mListenerList", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector$ItemDetectListener;", "mScrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "getMScrollListener", "()Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "mScrollListener$delegate", "mScrolledDy", "getMScrolledDy", "()I", "setMScrolledDy", "(I)V", "mThrottle", "Lcom/larksuite/framework/utils/AndroidThrottle;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "collectCurrentPageData", "", "scrolled", "collectCurrentPageDataDelay", "notifyItemDetected", "dataList", "", "notifyReachToBottom", "notifyScrollPassed", "scrolledStartIndex", "scrolledEndIndex", "registerItemDetectListener", "listener", "startDetect", "stopDetect", "unregisterItemDetectListener", "Companion", "ItemDataProvider", "ItemDetectListener", "ItemFilter", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.widget.b */
public final class RecyclerViewItemDetector<T> {

    /* renamed from: c */
    public static final int f87335c = UIHelper.dp2px(12.0f);

    /* renamed from: d */
    public static final Companion f87336d = new Companion(null);

    /* renamed from: a */
    public List<ItemDetectListener<T>> f87337a = new ArrayList();

    /* renamed from: b */
    public AndroidThrottle<T> f87338b;

    /* renamed from: e */
    private int f87339e;

    /* renamed from: f */
    private List<ItemFilter<T>> f87340f = new ArrayList();

    /* renamed from: g */
    private boolean f87341g = true;

    /* renamed from: h */
    private int f87342h;

    /* renamed from: i */
    private int f87343i;

    /* renamed from: j */
    private final C25969c f87344j;

    /* renamed from: k */
    private Handler f87345k;

    /* renamed from: l */
    private final Lazy f87346l;

    /* renamed from: m */
    private final Lazy f87347m;

    /* renamed from: n */
    private RecyclerView f87348n;

    /* renamed from: o */
    private RecyclerView.Adapter<?> f87349o;

    /* renamed from: p */
    private ItemDataProvider<T> f87350p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00028\u0001H&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector$ItemDataProvider;", "T", "", "getItem", "position", "", "(I)Ljava/lang/Object;", "getKey", "", "item", "(Ljava/lang/Object;)Ljava/lang/String;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.widget.b$b */
    public interface ItemDataProvider<T> {
        /* renamed from: a */
        String mo123406a(T t);

        /* renamed from: b */
        T mo123407b(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H&J \u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector$ItemDetectListener;", "T", "", "onItemDetected", "", "itemList", "", "onReachToBottom", "onScrollPassed", "scrolled", "", "scrolledStartIndex", "", "scrolledEndIndex", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.widget.b$c */
    public interface ItemDetectListener<T> {
        /* renamed from: a */
        void mo122146a();

        /* renamed from: a */
        void mo122147a(List<? extends T> list);

        /* renamed from: a */
        void mo122148a(boolean z, int i, int i2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector$ItemFilter;", "T", "", "accept", "", "item", "(Ljava/lang/Object;)Z", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.widget.b$d */
    public interface ItemFilter<T> {
        /* renamed from: a */
        boolean mo123943a(T t);
    }

    /* renamed from: f */
    private final RecyclerView.OnScrollListener m131181f() {
        return (RecyclerView.OnScrollListener) this.f87346l.getValue();
    }

    /* renamed from: g */
    private final RecyclerView.AdapterDataObserver m131182g() {
        return (RecyclerView.AdapterDataObserver) this.f87347m.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector$Companion;", "", "()V", "DEFAULT_DETECT_INTERVAL", "", "DEFAULT_SCROLL_THRESHOLD", "", "getDEFAULT_SCROLL_THRESHOLD", "()I", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.widget.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo123942a() {
            return RecyclerViewItemDetector.f87335c;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo123933a() {
        return this.f87339e;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.widget.b$e */
    public static final class RunnableC33887e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RecyclerViewItemDetector f87352a;

        RunnableC33887e(RecyclerViewItemDetector bVar) {
            this.f87352a = bVar;
        }

        public final void run() {
            this.f87352a.mo123937a(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0004*\u0001\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "com/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector$mDataObserver$2$1", "T", "invoke", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector$mDataObserver$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.widget.b$f */
    static final class C33888f extends Lambda implements Function0<C338891> {
        final /* synthetic */ RecyclerViewItemDetector this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33888f(RecyclerViewItemDetector bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C338891 invoke() {
            return new RecyclerView.AdapterDataObserver(this) {
                /* class com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.C33888f.C338891 */

                /* renamed from: a */
                final /* synthetic */ C33888f f87353a;

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onChanged() {
                    super.onChanged();
                    this.f87353a.this$0.mo123940d();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f87353a = r1;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeChanged(int i, int i2) {
                    super.onItemRangeChanged(i, i2);
                    this.f87353a.this$0.mo123940d();
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeInserted(int i, int i2) {
                    super.onItemRangeInserted(i, i2);
                    this.f87353a.this$0.mo123940d();
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0004*\u0001\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "com/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector$mScrollListener$2$1", "T", "invoke", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector$mScrollListener$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.widget.b$g */
    static final class C33890g extends Lambda implements Function0<C338911> {
        final /* synthetic */ RecyclerViewItemDetector this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33890g(RecyclerViewItemDetector bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C338911 invoke() {
            return new RecyclerView.OnScrollListener(this) {
                /* class com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.C33890g.C338911 */

                /* renamed from: a */
                final /* synthetic */ C33890g f87354a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f87354a = r1;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
                    super.onScrolled(recyclerView, i, i2);
                    boolean a = C58996h.m228977a(recyclerView);
                    RecyclerViewItemDetector bVar = this.f87354a.this$0;
                    bVar.mo123934a(bVar.mo123933a() + i2);
                    if (Math.abs(this.f87354a.this$0.mo123933a()) > RecyclerViewItemDetector.f87336d.mo123942a() || i2 == 0) {
                        boolean z = false;
                        this.f87354a.this$0.mo123934a(0);
                        RecyclerViewItemDetector bVar2 = this.f87354a.this$0;
                        if (i2 != 0) {
                            z = true;
                        }
                        bVar2.mo123937a(z);
                    }
                    if (a) {
                        this.f87354a.this$0.mo123941e();
                    }
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.widget.b$i */
    static final class RunnableC33893i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RecyclerViewItemDetector f87357a;

        RunnableC33893i(RecyclerViewItemDetector bVar) {
            this.f87357a = bVar;
        }

        public final void run() {
            this.f87357a.f87338b.mo93302a();
        }
    }

    /* renamed from: d */
    public final void mo123940d() {
        this.f87344j.mo92345a(new RunnableC33887e(this));
    }

    /* renamed from: b */
    public final void mo123938b() {
        this.f87348n.addOnScrollListener(m131181f());
        this.f87349o.registerAdapterDataObserver(m131182g());
    }

    /* renamed from: e */
    public final void mo123941e() {
        Iterator<T> it = this.f87337a.iterator();
        while (it.hasNext()) {
            it.next().mo122146a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.widget.b$h */
    public static final class RunnableC33892h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RecyclerViewItemDetector f87355a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f87356b;

        RunnableC33892h(RecyclerViewItemDetector bVar, ArrayList arrayList) {
            this.f87355a = bVar;
            this.f87356b = arrayList;
        }

        public final void run() {
            Iterator<T> it = this.f87355a.f87337a.iterator();
            while (it.hasNext()) {
                it.next().mo122147a(new ArrayList(this.f87356b));
            }
        }
    }

    /* renamed from: c */
    public final void mo123939c() {
        this.f87348n.removeOnScrollListener(m131181f());
        this.f87349o.unregisterAdapterDataObserver(m131182g());
        this.f87344j.mo92349b();
        this.f87345k.post(new RunnableC33893i(this));
    }

    /* renamed from: a */
    public final void mo123934a(int i) {
        this.f87339e = i;
    }

    /* renamed from: a */
    public final synchronized void mo123935a(ItemDetectListener<T> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f87337a.add(cVar);
    }

    /* renamed from: a */
    public final void mo123936a(Collection<? extends T> collection) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            boolean z = true;
            for (ItemFilter<T> dVar : this.f87340f) {
                z &= dVar.mo123943a(obj);
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getUIExecutor().execute(new RunnableC33892h(this, arrayList));
    }

    /* renamed from: a */
    public final void mo123937a(boolean z) {
        int i;
        int i2;
        RecyclerView.LayoutManager layoutManager = this.f87348n.getLayoutManager();
        int i3 = -1;
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            i3 = linearLayoutManager.findFirstVisibleItemPosition();
            i = linearLayoutManager.findLastVisibleItemPosition();
        } else {
            i = -1;
        }
        if (i3 >= 0 && i >= 0) {
            int i4 = this.f87342h;
            if (i3 != i4 || i != (i2 = this.f87343i) || i4 + i2 <= 0) {
                this.f87342h = i3;
                this.f87343i = i;
                Log.m165379d("RecyclerViewItemDetector", "collectCurrentPageData:" + i3 + '/' + i + '/' + z + '/' + f87335c);
                m131180a(z, i3, i);
                ArrayList arrayList = new ArrayList();
                if (i3 <= i) {
                    while (true) {
                        T b = this.f87350p.mo123407b(i3);
                        if (b != null) {
                            arrayList.add(b);
                        }
                        if (i3 == i) {
                            break;
                        }
                        i3++;
                    }
                }
                if (this.f87341g) {
                    mo123936a(arrayList);
                    this.f87341g = false;
                    return;
                }
                this.f87338b.mo93304a((Collection) arrayList);
            }
        }
    }

    /* renamed from: a */
    private final void m131180a(boolean z, int i, int i2) {
        Iterator<T> it = this.f87337a.iterator();
        while (it.hasNext()) {
            it.next().mo122148a(z, i, i2);
        }
    }

    public RecyclerViewItemDetector(RecyclerView recyclerView, RecyclerView.Adapter<?> adapter, ItemDataProvider<T> bVar) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        Intrinsics.checkParameterIsNotNull(bVar, "dataProvider");
        this.f87348n = recyclerView;
        this.f87349o = adapter;
        this.f87350p = bVar;
        Handler nonblockingHandler = CoreThreadPool.getNonblockingHandler();
        Intrinsics.checkExpressionValueIsNotNull(nonblockingHandler, "CoreThreadPool.getNonblockingHandler()");
        this.f87345k = nonblockingHandler;
        AndroidThrottle<T> a = new AndroidThrottle.C26229a().mo93309a(300L).mo93311a(new DistinctDetectBuffer(this.f87350p)).mo93310a(this.f87345k).mo93312a(new AndroidThrottle.AbstractC26233e<T>(this) {
            /* class com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.C338861 */

            /* renamed from: a */
            final /* synthetic */ RecyclerViewItemDetector f87351a;

            {
                this.f87351a = r1;
            }

            @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26233e
            public final void execute(Collection<T> collection) {
                Intrinsics.checkParameterIsNotNull(collection, "tasks");
                this.f87351a.mo123936a(collection);
            }
        }).mo93313a();
        Intrinsics.checkExpressionValueIsNotNull(a, "AndroidThrottle.Builder<…s) }\n            .build()");
        this.f87338b = a;
        this.f87344j = new C25969c(new Handler(Looper.getMainLooper()));
        this.f87346l = LazyKt.lazy(new C33890g(this));
        this.f87347m = LazyKt.lazy(new C33888f(this));
    }
}
