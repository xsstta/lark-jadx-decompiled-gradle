package com.ss.android.lark.calendar.wrapper.impl.tabspec;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.al;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30028g;
import com.ss.android.lark.calendar.wrapper.impl.tabspec.title.CalendarTitleInfo;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.maincore.ITitleController;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\u0012\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/wrapper/impl/tabspec/CalendarTitleProxyImpl;", "Lcom/ss/android/lark/calendar/dependency/idependency/entity/ITitleControllerProxy;", "context", "Landroid/content/Context;", "mTitleController", "Lcom/ss/android/lark/maincore/ITitleController;", "(Landroid/content/Context;Lcom/ss/android/lark/maincore/ITitleController;)V", "funcBtnList", "", "Lcom/ss/android/lark/maincore/IFunctionButton;", "mTitleInfo", "Lcom/ss/android/lark/calendar/wrapper/impl/tabspec/title/CalendarTitleInfo;", "search", "Landroid/widget/ImageView;", "getTitleBarHeight", "", "getTitleInfo", "isShowNewStyle", "", "modifyPopWindowSelectedIndex", "", "index", "setLoadingStatus", "setNormalStatus", "showImportExchangeGuide", "updateTitle", "title", "", "Companion", "calendar-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.wrapper.impl.tabspec.b */
public final class CalendarTitleProxyImpl implements AbstractC30028g {

    /* renamed from: d */
    public static final Companion f83915d = new Companion(null);

    /* renamed from: a */
    public final ImageView f83916a;

    /* renamed from: b */
    public final CalendarTitleInfo f83917b;

    /* renamed from: c */
    public ITitleController f83918c;

    /* renamed from: e */
    private final List<AbstractC44545b> f83919e;

    /* renamed from: f */
    private Context f83920f;

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30028g
    /* renamed from: a */
    public void mo108168a() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/wrapper/impl/tabspec/CalendarTitleProxyImpl$Companion;", "", "()V", "KEY_PARAMS_CALENDAR_SEARCH_TITLE", "", "TAG", "parseTitleController", "Lcom/ss/android/lark/calendar/wrapper/impl/tabspec/CalendarTitleProxyImpl;", "context", "Landroid/content/Context;", "titleController", "Lcom/ss/android/lark/maincore/ITitleController;", "calendar-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.tabspec.b$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "getContentView"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.tabspec.b$c */
    static final class C32721c implements AbstractC44545b {

        /* renamed from: a */
        final /* synthetic */ CalendarTitleProxyImpl f83923a;

        C32721c(CalendarTitleProxyImpl bVar) {
            this.f83923a = bVar;
        }

        /* renamed from: a */
        public final ImageView getContentView() {
            return this.f83923a.f83916a;
        }
    }

    /* renamed from: c */
    public final boolean mo120480c() {
        ITitleController.Style style;
        ITitleController.Style style2 = ITitleController.Style.New;
        ITitleController iTitleController = this.f83918c;
        if (iTitleController != null) {
            style = iTitleController.mo99193b();
        } else {
            style = null;
        }
        if (style2 == style) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final CalendarTitleInfo mo120479b() {
        boolean c = mo120480c();
        Log.m165389i("CalendarTitleProxyImpl", C32673y.m125378d("getTitleInfo isShow = " + c));
        if (!c) {
            return null;
        }
        this.f83917b.mo120478a(this.f83919e);
        return this.f83917b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.tabspec.b$d */
    static final class RunnableC32722d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CalendarTitleProxyImpl f83924a;

        /* renamed from: b */
        final /* synthetic */ String f83925b;

        RunnableC32722d(CalendarTitleProxyImpl bVar, String str) {
            this.f83924a = bVar;
            this.f83925b = str;
        }

        public final void run() {
            if (this.f83925b != null) {
                this.f83924a.f83917b.mo120477a(this.f83925b);
                if (this.f83924a.mo120480c()) {
                    ITitleController iTitleController = this.f83924a.f83918c;
                    if (iTitleController != null) {
                        iTitleController.mo99191a(this.f83924a.f83917b);
                    }
                    Log.m165389i("CalendarTitleProxyImpl", C32673y.m125378d("updateTitle " + this.f83925b));
                    return;
                }
                Log.m165389i("CalendarTitleProxyImpl", C32673y.m125378d("updateTitle isShowNewStyle is false"));
            }
        }
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30028g
    /* renamed from: a */
    public void mo108169a(String str) {
        UICallbackExecutor.post(new RunnableC32722d(this, str));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/calendar/wrapper/impl/tabspec/CalendarTitleProxyImpl$search$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.tabspec.b$a */
    static final class View$OnClickListenerC32720a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f83921a;

        /* renamed from: b */
        final /* synthetic */ CalendarTitleProxyImpl f83922b;

        View$OnClickListenerC32720a(ImageView imageView, CalendarTitleProxyImpl bVar) {
            this.f83921a = imageView;
            this.f83922b = bVar;
        }

        public final void onClick(View view) {
            int i;
            Bitmap c;
            ITitleController iTitleController = this.f83922b.f83918c;
            if (!(iTitleController == null || (c = iTitleController.mo99195c()) == null)) {
                al.m95028a().mo93366a("key_calendar_search_title", c);
            }
            ITitleController iTitleController2 = this.f83922b.f83918c;
            if (iTitleController2 != null) {
                i = iTitleController2.mo99189a();
            } else {
                i = 0;
            }
            C30022a.f74882a.searchModuleDependency().mo108176a(this.f83921a.getContext(), "", "key_calendar_search_title", i);
        }
    }

    public CalendarTitleProxyImpl(Context context, ITitleController iTitleController) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f83920f = context;
        this.f83918c = iTitleController;
        ImageView imageView = new ImageView(this.f83920f);
        imageView.setImageResource(R.drawable.icon_top_navigation_search_entrance);
        imageView.setOnClickListener(new View$OnClickListenerC32720a(imageView, this));
        this.f83916a = imageView;
        List<AbstractC44545b> mutableListOf = CollectionsKt.mutableListOf(new C32721c(this));
        this.f83919e = mutableListOf;
        CalendarTitleInfo aVar = new CalendarTitleInfo();
        this.f83917b = aVar;
        aVar.mo120478a(mutableListOf);
        if (this.f83918c == null) {
            Log.m165383e("CalendarTitleProxyImpl", C32673y.m125378d("mTitleController is null"));
        }
    }
}
