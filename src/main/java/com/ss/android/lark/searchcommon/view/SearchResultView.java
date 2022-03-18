package com.ss.android.lark.searchcommon.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.loading.UDLoadingDrawable;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchFileInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMessageInfo;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.searchcommon.view.binder.ICustomBinder;
import com.ss.android.lark.searchcommon.view.binder.IOnProfileClickListener;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.C58996h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 f2\u00020\u0001:\u0007efghijkB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0015H\u0002J\u0006\u00105\u001a\u000203J\u0006\u00106\u001a\u000203J\u0006\u00107\u001a\u000203J\u000e\u00108\u001a\u0002032\u0006\u00108\u001a\u00020\rJ\u0006\u00109\u001a\u000203J\u0006\u0010:\u001a\u000203J\u0006\u0010;\u001a\u000203J\b\u0010<\u001a\u000203H\u0002J\b\u0010=\u001a\u000203H\u0002J\u000e\u0010>\u001a\u0002032\u0006\u0010?\u001a\u00020\u001dJ\u0014\u0010@\u001a\u0002032\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001d0BJ\u0014\u0010C\u001a\u0002032\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001d0BJ\b\u0010E\u001a\u000203H\u0002J\u0010\u0010F\u001a\u0002032\b\u0010G\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010H\u001a\u0002032\u0006\u0010I\u001a\u00020JJ\u000e\u0010K\u001a\u0002032\u0006\u0010L\u001a\u00020*J\u000e\u0010M\u001a\u0002032\u0006\u0010N\u001a\u00020\rJ\u0010\u0010O\u001a\u0002032\b\u0010P\u001a\u0004\u0018\u00010QJ\u000e\u0010R\u001a\u0002032\u0006\u0010S\u001a\u00020\u000fJ\u000e\u0010T\u001a\u0002032\u0006\u0010U\u001a\u00020VJ\u000e\u0010W\u001a\u0002032\u0006\u0010X\u001a\u00020\u0011J\u000e\u0010Y\u001a\u0002032\u0006\u0010Z\u001a\u00020\u0013J\u000e\u0010[\u001a\u0002032\u0006\u0010U\u001a\u00020\\J\u000e\u0010]\u001a\u0002032\u0006\u00104\u001a\u00020\u0015J\u0006\u0010^\u001a\u000203J\u0014\u0010_\u001a\u0002032\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001d0BJ\u000e\u0010`\u001a\u0002032\u0006\u0010a\u001a\u00020\rJ\u000e\u0010b\u001a\u0002032\u0006\u0010c\u001a\u00020dR\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X.¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020(X.¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X.¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0001X.¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020*X.¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X.¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\"X\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u000e¢\u0006\u0002\n\u0000¨\u0006l"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchResultView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "loadingDrawable", "Lcom/larksuite/component/universe_design/loading/UDLoadingDrawable;", "mClickHandler", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "mNeedLoadMore", "", "mOnClickEmptyView", "Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnClickEmptyView;", "mOnLoadMore", "Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnLoadMore;", "mOnResultScroll", "Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnResultScroll;", "mOriginText", "", "kotlin.jvm.PlatformType", "mQueryWidth", "", "mResultAdapter", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter;", "mResultData", "Ljava/util/LinkedHashSet;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "Lkotlin/collections/LinkedHashSet;", "mResultRV", "Landroidx/recyclerview/widget/RecyclerView;", "mScrolledPx", "", "getMScrolledPx", "()I", "setMScrolledPx", "(I)V", "mSearchEmptyHintText", "Landroid/widget/TextView;", "mSearchResultEmptyView", "Landroid/view/View;", "mSearchResultHeadContainer", "mSearchResultLoadingView", "mSearchResultPtrFL", "Lcom/ss/android/lark/widget/ptr/LKUIPtrClassicFrameLayout;", "mStartIndex", "state", "Lcom/ss/android/lark/searchcommon/view/SearchResultView$STATE;", "attachEmptyText", "", SearchIntents.EXTRA_QUERY, "bgBase", "clearHeadCustomView", "default_t", "disableExternalChatter", "erasePadding", "error", "hideAllResultAboutView", "initOnLoadMore", "initViews", "notifyItemUpdate", "baseInfo", "refreshResult", "selectedList", "", "resetResult", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "resetViewBeforeShowData", "setClickHandler", "clickHandler", "setCustomBinder", "customBinder", "Lcom/ss/android/lark/searchcommon/view/binder/ICustomBinder;", "setHeadCustomView", "customView", "setNeedLoadMore", "needLoadMore", "setOnBusinessConsumeItem", "onBusinessConsumeItem", "Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnBusinessConsumeItem;", "setOnClickEmptyView", "onClickEmptyView", "setOnItemOnScreenListener", "listener", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemOnScreenListener;", "setOnLoadMore", "onLoadMore", "setOnResultScroll", "onResultScroll", "setProfileClickListener", "Lcom/ss/android/lark/searchcommon/view/binder/IOnProfileClickListener;", "showEmpty", "showLoading", "showResult", "switchMultiple", "isMultiple", "updateFileContent", "fileContent", "Lcom/ss/android/lark/chat/entity/message/content/FileContent;", "CheckBoxBindStatus", "Companion", "IOnBusinessConsumeItem", "IOnClickEmptyView", "IOnLoadMore", "IOnResultScroll", "STATE", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SearchResultView extends FrameLayout {

    /* renamed from: o */
    public static final Companion f133449o = new Companion(null);

    /* renamed from: a */
    public LKUIPtrClassicFrameLayout f133450a;

    /* renamed from: b */
    public View f133451b;

    /* renamed from: c */
    public View f133452c;

    /* renamed from: d */
    public TextView f133453d;

    /* renamed from: e */
    public SearchResultViewAdapter f133454e;

    /* renamed from: f */
    public SearchResultViewAdapter.IOnItemClickHandler f133455f;

    /* renamed from: g */
    public IOnLoadMore f133456g;

    /* renamed from: h */
    public float f133457h;

    /* renamed from: i */
    public String f133458i;

    /* renamed from: j */
    public int f133459j;

    /* renamed from: k */
    public UDLoadingDrawable f133460k;

    /* renamed from: l */
    public boolean f133461l;

    /* renamed from: m */
    public IOnResultScroll f133462m;

    /* renamed from: n */
    public IOnClickEmptyView f133463n;

    /* renamed from: p */
    private RecyclerView f133464p;

    /* renamed from: q */
    private FrameLayout f133465q;

    /* renamed from: r */
    private LinkedHashSet<SearchBaseInfo> f133466r;

    /* renamed from: s */
    private int f133467s;

    /* renamed from: t */
    private STATE f133468t;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnBusinessConsumeItem;", "", "onBusinessBindItemCheckBox", "Lcom/ss/android/lark/searchcommon/view/SearchResultView$CheckBoxBindStatus;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "onBusinessConsumeItemClick", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchResultView$c */
    public interface IOnBusinessConsumeItem {
        /* renamed from: a */
        CheckBoxBindStatus mo110048a(SearchBaseInfo searchBaseInfo);

        /* renamed from: b */
        boolean mo110049b(SearchBaseInfo searchBaseInfo);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnClickEmptyView;", "", "onClickEmptyView", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchResultView$d */
    public interface IOnClickEmptyView {
        /* renamed from: a */
        void mo182498a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnLoadMore;", "", "canLoadMore", "", "onLoadMore", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchResultView$e */
    public interface IOnLoadMore {
        /* renamed from: a */
        boolean mo182494a();

        /* renamed from: b */
        void mo182495b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnResultScroll;", "", "onResultScroll", "", "onResultScrollScreen", "pageNum", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchResultView$f */
    public interface IOnResultScroll {

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.searchcommon.view.SearchResultView$f$a */
        public static final class C53967a {
            /* renamed from: a */
            public static void m209313a(IOnResultScroll fVar) {
            }

            /* renamed from: a */
            public static void m209314a(IOnResultScroll fVar, int i) {
            }
        }

        /* renamed from: a */
        void mo182496a();

        /* renamed from: a */
        void mo182497a(int i);
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchResultView$STATE;", "", "(Ljava/lang/String;I)V", "DEFAULT", "LOADING", "RESULT_EMPTY", "RESULT", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchResultView$g */
    public enum STATE {
        DEFAULT,
        LOADING,
        RESULT_EMPTY,
        RESULT
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0007\"\u0004\b\n\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchResultView$CheckBoxBindStatus;", "", "isConsume", "", "isChecked", "isEnabled", "(ZZZ)V", "()Z", "setChecked", "(Z)V", "setConsume", "setEnabled", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchResultView$a */
    public static final class CheckBoxBindStatus {

        /* renamed from: a */
        private boolean f133469a;

        /* renamed from: b */
        private boolean f133470b;

        /* renamed from: c */
        private boolean f133471c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckBoxBindStatus)) {
                return false;
            }
            CheckBoxBindStatus aVar = (CheckBoxBindStatus) obj;
            return this.f133469a == aVar.f133469a && this.f133470b == aVar.f133470b && this.f133471c == aVar.f133471c;
        }

        public int hashCode() {
            boolean z = this.f133469a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            boolean z2 = this.f133470b;
            if (z2) {
                z2 = true;
            }
            int i6 = z2 ? 1 : 0;
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = (i5 + i6) * 31;
            boolean z3 = this.f133471c;
            if (!z3) {
                i = z3 ? 1 : 0;
            }
            return i9 + i;
        }

        public String toString() {
            return "CheckBoxBindStatus(isConsume=" + this.f133469a + ", isChecked=" + this.f133470b + ", isEnabled=" + this.f133471c + ")";
        }

        /* renamed from: a */
        public final boolean mo184636a() {
            return this.f133469a;
        }

        /* renamed from: b */
        public final boolean mo184637b() {
            return this.f133470b;
        }

        /* renamed from: c */
        public final boolean mo184638c() {
            return this.f133471c;
        }

        public CheckBoxBindStatus(boolean z, boolean z2, boolean z3) {
            this.f133469a = z;
            this.f133470b = z2;
            this.f133471c = z3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchResultView$Companion;", "", "()V", "TAG", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchResultView$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getMScrolledPx() {
        return this.f133467s;
    }

    /* renamed from: c */
    public final void mo184619c() {
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.f133450a;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultPtrFL");
        }
        lKUIPtrClassicFrameLayout.refreshComplete();
    }

    /* renamed from: e */
    public final void mo184622e() {
        findViewById(R.id.result_layout).setPadding(0, 0, 0, 0);
    }

    /* renamed from: f */
    public final void mo184623f() {
        findViewById(R.id.result_layout).setBackgroundColor(C57582a.m223616d(getContext(), R.color.bg_base));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchResultView$m */
    public static final class RunnableC53973m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchResultView f133480a;

        RunnableC53973m(SearchResultView searchResultView) {
            this.f133480a = searchResultView;
        }

        public final void run() {
            SearchResultView.m209280b(this.f133480a).setVisibility(0);
            SearchResultView.m209281c(this.f133480a).setVisibility(8);
            SearchResultView.m209282d(this.f133480a).setVisibility(8);
            SearchResultView.m209283e(this.f133480a).start();
        }
    }

    /* renamed from: a */
    public final void mo184609a() {
        if (this.f133468t == STATE.LOADING) {
            Log.m165379d("LarkSearch.Common.SearchResultView", "already LOADING.");
            return;
        }
        this.f133468t = STATE.LOADING;
        Log.m165379d("LarkSearch.Common.SearchResultView", "showLoading");
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.f133450a;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultPtrFL");
        }
        lKUIPtrClassicFrameLayout.refreshComplete();
        this.f133466r.clear();
        SearchResultViewAdapter jVar = this.f133454e;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResultAdapter");
        }
        jVar.clear();
        post(new RunnableC53973m(this));
    }

    /* renamed from: b */
    public final void mo184615b() {
        View view = this.f133452c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultEmptyView");
        }
        view.setVisibility(8);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.f133450a;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultPtrFL");
        }
        lKUIPtrClassicFrameLayout.setVisibility(8);
        View view2 = this.f133451b;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultLoadingView");
        }
        view2.setVisibility(8);
    }

    /* renamed from: h */
    private final void m209286h() {
        SearchPtrFooter searchPtrFooter = new SearchPtrFooter(getContext());
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.f133450a;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultPtrFL");
        }
        lKUIPtrClassicFrameLayout.setKeepHeaderWhenRefresh(true);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = this.f133450a;
        if (lKUIPtrClassicFrameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultPtrFL");
        }
        lKUIPtrClassicFrameLayout2.setFooterView(searchPtrFooter);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout3 = this.f133450a;
        if (lKUIPtrClassicFrameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultPtrFL");
        }
        lKUIPtrClassicFrameLayout3.addPtrUIHandler(searchPtrFooter);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout4 = this.f133450a;
        if (lKUIPtrClassicFrameLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultPtrFL");
        }
        lKUIPtrClassicFrameLayout4.disableWhenHorizontalMove(true);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout5 = this.f133450a;
        if (lKUIPtrClassicFrameLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultPtrFL");
        }
        lKUIPtrClassicFrameLayout5.setForceBackWhenComplete(true);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout6 = this.f133450a;
        if (lKUIPtrClassicFrameLayout6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultPtrFL");
        }
        lKUIPtrClassicFrameLayout6.setEnableScrollContentAfterLoad(true);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout7 = this.f133450a;
        if (lKUIPtrClassicFrameLayout7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultPtrFL");
        }
        lKUIPtrClassicFrameLayout7.setPtrHandler(new C53968h(this));
    }

    /* renamed from: i */
    private final void m209287i() {
        if (this.f133468t == STATE.RESULT) {
            Log.m165379d("LarkSearch.Common.SearchResultView", "already RESULT.");
            return;
        }
        this.f133468t = STATE.RESULT;
        Log.m165389i("LarkSearch.Common.SearchResultView", "switch view state.");
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.f133450a;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultPtrFL");
        }
        lKUIPtrClassicFrameLayout.setVisibility(0);
        View view = this.f133451b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultLoadingView");
        }
        view.setVisibility(8);
        View view2 = this.f133452c;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultEmptyView");
        }
        view2.setVisibility(8);
        UDLoadingDrawable aVar = this.f133460k;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingDrawable");
        }
        aVar.stop();
    }

    /* renamed from: d */
    public final void mo184621d() {
        Log.m165379d("LarkSearch.Common.SearchResultView", "default_t!!!");
        if (this.f133468t == STATE.DEFAULT) {
            Log.m165379d("LarkSearch.Common.SearchResultView", "already default_t!!!");
            return;
        }
        this.f133468t = STATE.DEFAULT;
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.f133450a;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultPtrFL");
        }
        lKUIPtrClassicFrameLayout.setVisibility(0);
        View view = this.f133451b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultLoadingView");
        }
        view.setVisibility(8);
        View view2 = this.f133452c;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultEmptyView");
        }
        view2.setVisibility(8);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = this.f133450a;
        if (lKUIPtrClassicFrameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultPtrFL");
        }
        lKUIPtrClassicFrameLayout2.refreshComplete();
        this.f133466r.clear();
        SearchResultViewAdapter jVar = this.f133454e;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResultAdapter");
        }
        jVar.clear();
        this.f133467s = 0;
        UDLoadingDrawable aVar = this.f133460k;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingDrawable");
        }
        aVar.stop();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchResultView$l */
    public static final class RunnableC53972l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchResultView f133478a;

        /* renamed from: b */
        final /* synthetic */ String f133479b;

        RunnableC53972l(SearchResultView searchResultView, String str) {
            this.f133478a = searchResultView;
            this.f133479b = str;
        }

        public final void run() {
            SearchResultView searchResultView = this.f133478a;
            String str = searchResultView.f133458i;
            Intrinsics.checkExpressionValueIsNotNull(str, "mOriginText");
            searchResultView.f133459j = StringsKt.indexOf$default((CharSequence) str, "{", 0, false, 6, (Object) null);
            String str2 = this.f133478a.f133458i;
            Intrinsics.checkExpressionValueIsNotNull(str2, "mOriginText");
            int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str2, "}", 0, false, 6, (Object) null) + 1;
            StringBuilder sb = new StringBuilder();
            String str3 = this.f133478a.f133458i;
            Intrinsics.checkExpressionValueIsNotNull(str3, "mOriginText");
            int i = this.f133478a.f133459j;
            if (str3 != null) {
                String substring = str3.substring(0, i);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                sb.append(substring);
                String str4 = this.f133478a.f133458i;
                Intrinsics.checkExpressionValueIsNotNull(str4, "mOriginText");
                if (str4 != null) {
                    String substring2 = str4.substring(lastIndexOf$default);
                    Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.String).substring(startIndex)");
                    sb.append(substring2);
                    float measureText = SearchResultView.m209284f(this.f133478a).getPaint().measureText(sb.toString());
                    int paddingLeft = SearchResultView.m209284f(this.f133478a).getPaddingLeft();
                    int paddingRight = SearchResultView.m209284f(this.f133478a).getPaddingRight();
                    SearchResultView searchResultView2 = this.f133478a;
                    searchResultView2.f133457h = ((float) ((SearchResultView.m209284f(searchResultView2).getWidth() - paddingLeft) - paddingRight)) - measureText;
                    this.f133478a.mo184616b(this.f133479b);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* renamed from: g */
    private final void m209285g() {
        View findViewById = findViewById(R.id.search_result_rv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.search_result_rv)");
        this.f133464p = (RecyclerView) findViewById;
        View findViewById2 = findViewById(R.id.search_result_ptr_fl);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.search_result_ptr_fl)");
        this.f133450a = (LKUIPtrClassicFrameLayout) findViewById2;
        View findViewById3 = findViewById(R.id.search_result_loading);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.search_result_loading)");
        this.f133451b = findViewById3;
        View findViewById4 = findViewById(R.id.search_result_empty);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.search_result_empty)");
        this.f133452c = findViewById4;
        View findViewById5 = findViewById(R.id.search_empty_hint);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.search_empty_hint)");
        this.f133453d = (TextView) findViewById5;
        View findViewById6 = findViewById(R.id.search_result_head_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "findViewById(R.id.search_result_head_container)");
        this.f133465q = (FrameLayout) findViewById6;
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        this.f133454e = new SearchResultViewAdapter(context, new C53970j(this));
        RecyclerView recyclerView = this.f133464p;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResultRV");
        }
        C58996h.m228978b(recyclerView);
        SearchResultViewAdapter jVar = this.f133454e;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResultAdapter");
        }
        recyclerView.setAdapter(jVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.addOnScrollListener(new C53969i(recyclerView, this));
        m209286h();
        View view = this.f133452c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultEmptyView");
        }
        view.setOnClickListener(new View$OnClickListenerC53971k(this));
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        UDLoadingDrawable aVar = new UDLoadingDrawable(context2);
        aVar.mo7701a(C57582a.m223616d(getContext(), R.color.primary_pri_500));
        this.f133460k = aVar;
        ImageView imageView = (ImageView) findViewById(R.id.search_result_loading_img);
        UDLoadingDrawable aVar2 = this.f133460k;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingDrawable");
        }
        imageView.setImageDrawable(aVar2);
    }

    public final void setClickHandler(SearchResultViewAdapter.IOnItemClickHandler bVar) {
        this.f133455f = bVar;
    }

    public final void setMScrolledPx(int i) {
        this.f133467s = i;
    }

    public final void setNeedLoadMore(boolean z) {
        this.f133461l = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/searchcommon/view/SearchResultView$initOnLoadMore$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "checkCanDoRefresh", "header", "onLoadMoreBegin", "", "onRefreshBegin", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchResultView$h */
    public static final class C53968h extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ SearchResultView f133473a;

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler, com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler
        public boolean checkCanDoRefresh(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            Intrinsics.checkParameterIsNotNull(view, "content");
            Intrinsics.checkParameterIsNotNull(view2, "header");
            return false;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53968h(SearchResultView searchResultView) {
            this.f133473a = searchResultView;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            IOnLoadMore eVar = this.f133473a.f133456g;
            if (eVar != null) {
                eVar.mo182495b();
            }
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            Intrinsics.checkParameterIsNotNull(view, "content");
            Intrinsics.checkParameterIsNotNull(view2, "footer");
            if (!super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2) || !this.f133473a.f133461l) {
                return false;
            }
            IOnLoadMore eVar = this.f133473a.f133456g;
            if (eVar != null) {
                z = eVar.mo182494a();
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/searchcommon/view/SearchResultView$initViews$1", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "onItemClick", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "isSelected", "", "position", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchResultView$j */
    public static final class C53970j implements SearchResultViewAdapter.IOnItemClickHandler {

        /* renamed from: a */
        final /* synthetic */ SearchResultView f133476a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53970j(SearchResultView searchResultView) {
            this.f133476a = searchResultView;
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchResultViewAdapter.IOnItemClickHandler
        /* renamed from: a */
        public void mo182499a(SearchBaseInfo searchBaseInfo, boolean z, int i) {
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            SearchResultViewAdapter.IOnItemClickHandler bVar = this.f133476a.f133455f;
            if (bVar != null) {
                bVar.mo182499a(searchBaseInfo, z, i);
            }
        }
    }

    public final void setOnClickEmptyView(IOnClickEmptyView dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "onClickEmptyView");
        this.f133463n = dVar;
    }

    public final void setOnLoadMore(IOnLoadMore eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "onLoadMore");
        this.f133456g = eVar;
    }

    public final void setOnResultScroll(IOnResultScroll fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "onResultScroll");
        this.f133462m = fVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchResultView$k */
    public static final class View$OnClickListenerC53971k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchResultView f133477a;

        View$OnClickListenerC53971k(SearchResultView searchResultView) {
            this.f133477a = searchResultView;
        }

        public final void onClick(View view) {
            IOnClickEmptyView dVar = this.f133477a.f133463n;
            if (dVar != null) {
                dVar.mo182498a();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SearchResultView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public static final /* synthetic */ SearchResultViewAdapter m209279a(SearchResultView searchResultView) {
        SearchResultViewAdapter jVar = searchResultView.f133454e;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResultAdapter");
        }
        return jVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m209280b(SearchResultView searchResultView) {
        View view = searchResultView.f133451b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultLoadingView");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ LKUIPtrClassicFrameLayout m209281c(SearchResultView searchResultView) {
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = searchResultView.f133450a;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultPtrFL");
        }
        return lKUIPtrClassicFrameLayout;
    }

    /* renamed from: d */
    public static final /* synthetic */ View m209282d(SearchResultView searchResultView) {
        View view = searchResultView.f133452c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultEmptyView");
        }
        return view;
    }

    /* renamed from: e */
    public static final /* synthetic */ UDLoadingDrawable m209283e(SearchResultView searchResultView) {
        UDLoadingDrawable aVar = searchResultView.f133460k;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingDrawable");
        }
        return aVar;
    }

    /* renamed from: f */
    public static final /* synthetic */ TextView m209284f(SearchResultView searchResultView) {
        TextView textView = searchResultView.f133453d;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchEmptyHintText");
        }
        return textView;
    }

    public final void setOnBusinessConsumeItem(IOnBusinessConsumeItem cVar) {
        SearchResultViewAdapter jVar = this.f133454e;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResultAdapter");
        }
        jVar.mo184982a(cVar);
    }

    /* renamed from: a */
    public final void mo184611a(SearchBaseInfo searchBaseInfo) {
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, "baseInfo");
        SearchResultViewAdapter jVar = this.f133454e;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResultAdapter");
        }
        jVar.notifyItemChanged(searchBaseInfo);
    }

    /* renamed from: b */
    public final void mo184618b(boolean z) {
        SearchResultViewAdapter jVar = this.f133454e;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResultAdapter");
        }
        jVar.mo184987b(z);
    }

    public final void setCustomBinder(ICustomBinder nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "customBinder");
        SearchResultViewAdapter jVar = this.f133454e;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResultAdapter");
        }
        jVar.mo184983a(nVar);
    }

    public final void setOnItemOnScreenListener(SearchResultViewAdapter.IOnItemOnScreenListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        SearchResultViewAdapter jVar = this.f133454e;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResultAdapter");
        }
        jVar.mo184985a(cVar);
    }

    public final void setProfileClickListener(IOnProfileClickListener oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "listener");
        SearchResultViewAdapter jVar = this.f133454e;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResultAdapter");
        }
        jVar.mo184984a(oVar);
    }

    public final void setHeadCustomView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "customView");
        FrameLayout frameLayout = this.f133465q;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultHeadContainer");
        }
        frameLayout.setVisibility(0);
        FrameLayout frameLayout2 = this.f133465q;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultHeadContainer");
        }
        frameLayout2.removeAllViews();
        FrameLayout frameLayout3 = this.f133465q;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultHeadContainer");
        }
        frameLayout3.addView(view);
    }

    /* renamed from: a */
    public final void mo184613a(List<? extends SearchBaseInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        m209287i();
        LinkedHashSet<SearchBaseInfo> linkedHashSet = this.f133466r;
        linkedHashSet.addAll(list);
        SearchResultViewAdapter jVar = this.f133454e;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResultAdapter");
        }
        jVar.diff(linkedHashSet);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.f133450a;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultPtrFL");
        }
        lKUIPtrClassicFrameLayout.refreshComplete();
    }

    /* renamed from: b */
    public final void mo184616b(String str) {
        String str2 = str;
        TextView textView = this.f133453d;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchEmptyHintText");
        }
        String obj = TextUtils.ellipsize(str2, textView.getPaint(), this.f133457h, TextUtils.TruncateAt.MIDDLE).toString();
        String mustacheFormat = UIHelper.mustacheFormat(this.f133458i, "search_key", obj);
        int i = this.f133459j;
        if (i != -1) {
            CharSequence a = C57782ag.m224238a(mustacheFormat, this.f133459j, i + obj.length(), obj, UIHelper.getColor(R.color.lkui_B500));
            TextView textView2 = this.f133453d;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchEmptyHintText");
            }
            textView2.setText(a);
            return;
        }
        TextView textView3 = this.f133453d;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchEmptyHintText");
        }
        textView3.setText(mustacheFormat);
    }

    /* renamed from: c */
    public final void mo184620c(List<? extends SearchBaseInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "selectedList");
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.f133450a;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultPtrFL");
        }
        lKUIPtrClassicFrameLayout.refreshComplete();
        Iterator<SearchBaseInfo> it = this.f133466r.iterator();
        while (it.hasNext()) {
            SearchBaseInfo next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "item");
            if (next.isSelected() != list.contains(next)) {
                next.selected(list.contains(next));
                SearchResultViewAdapter jVar = this.f133454e;
                if (jVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mResultAdapter");
                }
                jVar.notifyItemChanged(next);
            }
        }
    }

    /* renamed from: a */
    public final void mo184610a(FileContent fileContent) {
        Intrinsics.checkParameterIsNotNull(fileContent, "fileContent");
        SearchResultViewAdapter jVar = this.f133454e;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResultAdapter");
        }
        for (SearchBaseInfo searchBaseInfo : jVar.getItems()) {
            if (searchBaseInfo instanceof SearchFileInfo) {
                SearchFileInfo searchFileInfo = (SearchFileInfo) searchBaseInfo;
                if (searchFileInfo.getFileContent() != null && Intrinsics.areEqual(fileContent.getKey(), searchFileInfo.getFileContent().getKey())) {
                    searchFileInfo.setFileContent(fileContent);
                    SearchResultViewAdapter jVar2 = this.f133454e;
                    if (jVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mResultAdapter");
                    }
                    jVar2.notifyItemChanged(searchBaseInfo);
                    return;
                }
            } else if (searchBaseInfo instanceof SearchMessageInfo) {
                SearchMessageInfo searchMessageInfo = (SearchMessageInfo) searchBaseInfo;
                if (searchMessageInfo.getFileContent() != null) {
                    String key = fileContent.getKey();
                    FileContent fileContent2 = searchMessageInfo.getFileContent();
                    if (fileContent2 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (Intrinsics.areEqual(key, fileContent2.getKey())) {
                        searchMessageInfo.setFileContent(fileContent);
                        SearchResultViewAdapter jVar3 = this.f133454e;
                        if (jVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mResultAdapter");
                        }
                        jVar3.notifyItemChanged(searchBaseInfo);
                        return;
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
    }

    /* renamed from: b */
    public final void mo184617b(List<? extends SearchBaseInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        m209287i();
        LinkedHashSet<SearchBaseInfo> linkedHashSet = this.f133466r;
        linkedHashSet.clear();
        linkedHashSet.addAll(list);
        SearchResultViewAdapter jVar = this.f133454e;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResultAdapter");
        }
        jVar.resetAll(linkedHashSet);
        this.f133467s = 0;
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.f133450a;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultPtrFL");
        }
        lKUIPtrClassicFrameLayout.refreshComplete();
    }

    /* renamed from: a */
    public final void mo184612a(String str) {
        Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
        if (this.f133468t == STATE.RESULT_EMPTY) {
            Log.m165379d("LarkSearch.Common.SearchResultView", "already RESULT_EMPTY.");
            return;
        }
        this.f133468t = STATE.RESULT_EMPTY;
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.f133450a;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultPtrFL");
        }
        lKUIPtrClassicFrameLayout.refreshComplete();
        View view = this.f133452c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultEmptyView");
        }
        view.setVisibility(0);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = this.f133450a;
        if (lKUIPtrClassicFrameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultPtrFL");
        }
        lKUIPtrClassicFrameLayout2.setVisibility(8);
        View view2 = this.f133451b;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultLoadingView");
        }
        view2.setVisibility(8);
        if (StringsKt.isBlank(str)) {
            TextView textView = this.f133453d;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchEmptyHintText");
            }
            textView.setText(getResources().getText(R.string.Lark_Legacy_SearchNoAnyResult));
        } else if (this.f133457h == BitmapDescriptorFactory.HUE_RED) {
            TextView textView2 = this.f133453d;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchEmptyHintText");
            }
            textView2.post(new RunnableC53972l(this, str));
        } else {
            mo184616b(str);
        }
        View view3 = this.f133452c;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultEmptyView");
        }
        C57582a.m223615c(view3);
        UDLoadingDrawable aVar = this.f133460k;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingDrawable");
        }
        aVar.stop();
    }

    /* renamed from: a */
    public final void mo184614a(boolean z) {
        SearchResultViewAdapter jVar = this.f133454e;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResultAdapter");
        }
        jVar.mo184986a(z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/searchcommon/view/SearchResultView$initViews$2$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchResultView$i */
    public static final class C53969i extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f133474a;

        /* renamed from: b */
        final /* synthetic */ SearchResultView f133475b;

        C53969i(RecyclerView recyclerView, SearchResultView searchResultView) {
            this.f133474a = recyclerView;
            this.f133475b = searchResultView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            if (i == 0) {
                IOnResultScroll fVar = this.f133475b.f133462m;
                if (fVar != null) {
                    fVar.mo182496a();
                }
                SearchResultViewAdapter.IOnItemOnScreenListener a = SearchResultView.m209279a(this.f133475b).mo184981a();
                if (a != null) {
                    a.mo183169a();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            if (this.f133474a.getHeight() > 0) {
                SearchResultView searchResultView = this.f133475b;
                searchResultView.setMScrolledPx(searchResultView.getMScrolledPx() + i2);
                int mScrolledPx = this.f133475b.getMScrolledPx() / this.f133474a.getHeight();
                Log.m165379d("LarkSearch.Common.SearchResultView", "dy: " + i2 + " scrolledPx: " + this.f133475b.getMScrolledPx() + " pageNum: " + mScrolledPx);
                IOnResultScroll fVar = this.f133475b.f133462m;
                if (fVar != null) {
                    fVar.mo182497a(mScrolledPx);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f133466r = new LinkedHashSet<>();
        this.f133458i = getResources().getString(R.string.Lark_Legacy_Noresult);
        this.f133459j = -1;
        this.f133461l = true;
        this.f133468t = STATE.RESULT_EMPTY;
        LayoutInflater.from(context).inflate(R.layout.view_search_result, (ViewGroup) this, true);
        m209285g();
    }
}
