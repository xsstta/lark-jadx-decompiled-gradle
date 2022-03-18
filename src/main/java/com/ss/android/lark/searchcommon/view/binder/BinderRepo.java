package com.ss.android.lark.searchcommon.view.binder;

import android.content.Context;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.view.SearchResultView;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010`\u001a\u00020a2\u0006\u0010`\u001a\u00020bJ\u000e\u0010c\u001a\u00020a2\u0006\u0010c\u001a\u00020bJ\u0010\u0010d\u001a\u00020a2\b\u0010e\u001a\u0004\u0018\u00010fJ\u000e\u0010g\u001a\u00020a2\u0006\u0010h\u001a\u00020iJ\u000e\u0010j\u001a\u00020a2\u0006\u0010k\u001a\u00020bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020-¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u000201¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u00104\u001a\u000205¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u00108\u001a\u000209¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010<\u001a\u00020=¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010@\u001a\u00020A¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010D\u001a\u00020E¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010H\u001a\u00020I¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010L\u001a\u00020M¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010P\u001a\u00020Q¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0011\u0010T\u001a\u00020U¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0011\u0010X\u001a\u00020Y¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0011\u0010\\\u001a\u00020]¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_¨\u0006l"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/BinderRepo;", "", "mContext", "Landroid/content/Context;", "mOnItemClickHandler", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "(Landroid/content/Context;Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;)V", "actionRecommendBinder", "Lcom/ss/android/lark/searchcommon/view/binder/ActionRecommendBinder;", "getActionRecommendBinder", "()Lcom/ss/android/lark/searchcommon/view/binder/ActionRecommendBinder;", "calendarEventBinder", "Lcom/ss/android/lark/searchcommon/view/binder/CalendarEventBinder;", "getCalendarEventBinder", "()Lcom/ss/android/lark/searchcommon/view/binder/CalendarEventBinder;", "cardBinder", "Lcom/ss/android/lark/searchcommon/view/binder/CardBinder;", "getCardBinder", "()Lcom/ss/android/lark/searchcommon/view/binder/CardBinder;", "ccmBinder", "Lcom/ss/android/lark/searchcommon/view/binder/CCMBinder;", "getCcmBinder", "()Lcom/ss/android/lark/searchcommon/view/binder/CCMBinder;", "chatBinder", "Lcom/ss/android/lark/searchcommon/view/binder/ChatBinder;", "getChatBinder", "()Lcom/ss/android/lark/searchcommon/view/binder/ChatBinder;", "chatterBinder", "Lcom/ss/android/lark/searchcommon/view/binder/ChatterBinder;", "getChatterBinder", "()Lcom/ss/android/lark/searchcommon/view/binder/ChatterBinder;", "commonBinder", "Lcom/ss/android/lark/searchcommon/view/binder/CommonBinder;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "getCommonBinder", "()Lcom/ss/android/lark/searchcommon/view/binder/CommonBinder;", "departmentBinder", "Lcom/ss/android/lark/searchcommon/view/binder/DepartmentBinder;", "getDepartmentBinder", "()Lcom/ss/android/lark/searchcommon/view/binder/DepartmentBinder;", "emptyBuilder", "Lcom/ss/android/lark/searchcommon/view/binder/EmptyBinder;", "getEmptyBuilder", "()Lcom/ss/android/lark/searchcommon/view/binder/EmptyBinder;", "feedbackBinder", "Lcom/ss/android/lark/searchcommon/view/binder/SearchFeedbackBinder;", "getFeedbackBinder", "()Lcom/ss/android/lark/searchcommon/view/binder/SearchFeedbackBinder;", "helpDeskBinder", "Lcom/ss/android/lark/searchcommon/view/binder/HelpDeskBinder;", "getHelpDeskBinder", "()Lcom/ss/android/lark/searchcommon/view/binder/HelpDeskBinder;", "historyBinder", "Lcom/ss/android/lark/searchcommon/view/binder/HistoryBinder;", "getHistoryBinder", "()Lcom/ss/android/lark/searchcommon/view/binder/HistoryBinder;", "linkBinder", "Lcom/ss/android/lark/searchcommon/view/binder/LinkBinder;", "getLinkBinder", "()Lcom/ss/android/lark/searchcommon/view/binder/LinkBinder;", "lynxCardBinder", "Lcom/ss/android/lark/searchcommon/view/binder/LynxCardBinder;", "getLynxCardBinder", "()Lcom/ss/android/lark/searchcommon/view/binder/LynxCardBinder;", "mailContactBinder", "Lcom/ss/android/lark/searchcommon/view/binder/MailContactBinder;", "getMailContactBinder", "()Lcom/ss/android/lark/searchcommon/view/binder/MailContactBinder;", "messageBinder", "Lcom/ss/android/lark/searchcommon/view/binder/MessageBinder;", "getMessageBinder", "()Lcom/ss/android/lark/searchcommon/view/binder/MessageBinder;", "moreBinder", "Lcom/ss/android/lark/searchcommon/view/binder/SearchMoreBinder;", "getMoreBinder", "()Lcom/ss/android/lark/searchcommon/view/binder/SearchMoreBinder;", "openAppBinder", "Lcom/ss/android/lark/searchcommon/view/binder/OpenAppBinder;", "getOpenAppBinder", "()Lcom/ss/android/lark/searchcommon/view/binder/OpenAppBinder;", "openSearchBinder", "Lcom/ss/android/lark/searchcommon/view/binder/OpenSearchBinder;", "getOpenSearchBinder", "()Lcom/ss/android/lark/searchcommon/view/binder/OpenSearchBinder;", "openSearchFilterBinder", "Lcom/ss/android/lark/searchcommon/view/binder/OpenSearchFilterBinder;", "getOpenSearchFilterBinder", "()Lcom/ss/android/lark/searchcommon/view/binder/OpenSearchFilterBinder;", "placeholderBinder", "Lcom/ss/android/lark/searchcommon/view/binder/PlaceholderBinder;", "getPlaceholderBinder", "()Lcom/ss/android/lark/searchcommon/view/binder/PlaceholderBinder;", "threadBinder", "Lcom/ss/android/lark/searchcommon/view/binder/ThreadBinder;", "getThreadBinder", "()Lcom/ss/android/lark/searchcommon/view/binder/ThreadBinder;", "disableExternalChat", "", "", "disableExternalChatter", "setOnBusinessConsumeItem", "onBusinessConsumeItem", "Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnBusinessConsumeItem;", "setProfileClickListener", "listener", "Lcom/ss/android/lark/searchcommon/view/binder/IOnProfileClickListener;", "switchMultiple", "isMultiple", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.b */
public final class BinderRepo {

    /* renamed from: a */
    private final ChatterBinder f133586a;

    /* renamed from: b */
    private final ChatBinder f133587b;

    /* renamed from: c */
    private final MessageBinder f133588c;

    /* renamed from: d */
    private final DepartmentBinder f133589d;

    /* renamed from: e */
    private final CCMBinder f133590e;

    /* renamed from: f */
    private final ThreadBinder f133591f;

    /* renamed from: g */
    private final CalendarEventBinder f133592g;

    /* renamed from: h */
    private final CommonBinder<SearchBaseInfo> f133593h;

    /* renamed from: i */
    private final EmptyBinder f133594i = new EmptyBinder();

    /* renamed from: j */
    private final SearchMoreBinder f133595j;

    /* renamed from: k */
    private final HelpDeskBinder f133596k;

    /* renamed from: l */
    private final OpenAppBinder f133597l;

    /* renamed from: m */
    private final HistoryBinder f133598m;

    /* renamed from: n */
    private final ActionRecommendBinder f133599n;

    /* renamed from: o */
    private final LinkBinder f133600o;

    /* renamed from: p */
    private final OpenSearchFilterBinder f133601p;

    /* renamed from: q */
    private final OpenSearchBinder f133602q;

    /* renamed from: r */
    private final SearchFeedbackBinder f133603r;

    /* renamed from: s */
    private final LynxCardBinder f133604s;

    /* renamed from: t */
    private final CardBinder f133605t;

    /* renamed from: u */
    private final PlaceholderBinder f133606u;

    /* renamed from: v */
    private final MailContactBinder f133607v;

    /* renamed from: a */
    public final ChatterBinder mo184777a() {
        return this.f133586a;
    }

    /* renamed from: b */
    public final ChatBinder mo184781b() {
        return this.f133587b;
    }

    /* renamed from: c */
    public final MessageBinder mo184783c() {
        return this.f133588c;
    }

    /* renamed from: d */
    public final DepartmentBinder mo184784d() {
        return this.f133589d;
    }

    /* renamed from: e */
    public final CCMBinder mo184785e() {
        return this.f133590e;
    }

    /* renamed from: f */
    public final ThreadBinder mo184786f() {
        return this.f133591f;
    }

    /* renamed from: g */
    public final CalendarEventBinder mo184787g() {
        return this.f133592g;
    }

    /* renamed from: h */
    public final CommonBinder<SearchBaseInfo> mo184788h() {
        return this.f133593h;
    }

    /* renamed from: i */
    public final EmptyBinder mo184789i() {
        return this.f133594i;
    }

    /* renamed from: j */
    public final SearchMoreBinder mo184790j() {
        return this.f133595j;
    }

    /* renamed from: k */
    public final HelpDeskBinder mo184791k() {
        return this.f133596k;
    }

    /* renamed from: l */
    public final OpenAppBinder mo184792l() {
        return this.f133597l;
    }

    /* renamed from: m */
    public final HistoryBinder mo184793m() {
        return this.f133598m;
    }

    /* renamed from: n */
    public final ActionRecommendBinder mo184794n() {
        return this.f133599n;
    }

    /* renamed from: o */
    public final LinkBinder mo184795o() {
        return this.f133600o;
    }

    /* renamed from: p */
    public final OpenSearchFilterBinder mo184796p() {
        return this.f133601p;
    }

    /* renamed from: q */
    public final OpenSearchBinder mo184797q() {
        return this.f133602q;
    }

    /* renamed from: r */
    public final SearchFeedbackBinder mo184798r() {
        return this.f133603r;
    }

    /* renamed from: s */
    public final LynxCardBinder mo184799s() {
        return this.f133604s;
    }

    /* renamed from: t */
    public final CardBinder mo184800t() {
        return this.f133605t;
    }

    /* renamed from: u */
    public final PlaceholderBinder mo184801u() {
        return this.f133606u;
    }

    /* renamed from: v */
    public final MailContactBinder mo184802v() {
        return this.f133607v;
    }

    /* renamed from: b */
    public final void mo184782b(boolean z) {
        this.f133586a.mo184829a(z);
    }

    /* renamed from: a */
    public final void mo184779a(IOnProfileClickListener oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "listener");
        this.f133586a.mo184828a(oVar);
    }

    /* renamed from: a */
    public final void mo184778a(SearchResultView.IOnBusinessConsumeItem cVar) {
        this.f133586a.mo184852a(cVar);
        this.f133587b.mo184852a(cVar);
        this.f133588c.mo184852a(cVar);
        this.f133589d.mo184852a(cVar);
        this.f133590e.mo184852a(cVar);
        this.f133591f.mo184852a(cVar);
        this.f133592g.mo184852a(cVar);
        this.f133593h.mo184852a(cVar);
        this.f133596k.mo184852a(cVar);
        this.f133597l.mo184852a(cVar);
        this.f133607v.mo184852a(cVar);
    }

    /* renamed from: a */
    public final void mo184780a(boolean z) {
        this.f133586a.mo184853b(z);
        this.f133587b.mo184853b(z);
        this.f133588c.mo184853b(z);
        this.f133589d.mo184853b(z);
        this.f133590e.mo184853b(z);
        this.f133591f.mo184853b(z);
        this.f133592g.mo184853b(z);
        this.f133593h.mo184853b(z);
        this.f133596k.mo184853b(z);
        this.f133597l.mo184853b(z);
        this.f133607v.mo184853b(z);
    }

    public BinderRepo(Context context, SearchResultViewAdapter.IOnItemClickHandler bVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mOnItemClickHandler");
        this.f133586a = new ChatterBinder(context, bVar);
        this.f133587b = new ChatBinder(context, bVar);
        this.f133588c = new MessageBinder(context, bVar);
        this.f133589d = new DepartmentBinder(context, bVar);
        this.f133590e = new CCMBinder(context, bVar);
        this.f133591f = new ThreadBinder(context, bVar);
        this.f133592g = new CalendarEventBinder(context, bVar);
        this.f133593h = new CommonBinder<>(context, bVar);
        this.f133595j = new SearchMoreBinder(bVar);
        this.f133596k = new HelpDeskBinder(context, bVar);
        this.f133597l = new OpenAppBinder(context, bVar);
        this.f133598m = new HistoryBinder(context);
        this.f133599n = new ActionRecommendBinder(context);
        this.f133600o = new LinkBinder(context, bVar);
        this.f133601p = new OpenSearchFilterBinder(bVar);
        this.f133602q = new OpenSearchBinder(context, bVar);
        this.f133603r = new SearchFeedbackBinder();
        this.f133604s = new LynxCardBinder(bVar);
        this.f133605t = new CardBinder(bVar);
        this.f133606u = new PlaceholderBinder();
        this.f133607v = new MailContactBinder(context, bVar);
    }
}
