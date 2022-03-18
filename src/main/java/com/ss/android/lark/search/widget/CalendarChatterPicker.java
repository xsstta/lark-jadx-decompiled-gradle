package com.ss.android.lark.search.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.widget.BasePicker;
import com.ss.android.lark.search.widget.calendar.AddEmailView;
import com.ss.android.lark.search.widget.calendar.EmailInfo;
import com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency;
import com.ss.android.lark.search.widget.params.CalendarChatterPickerParams;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u0001$B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0013H\u0002J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0013H\u0016J\u0016\u0010\u001e\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0013H\u0016J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/search/widget/CalendarChatterPicker;", "Lcom/ss/android/lark/search/widget/AbsChatterPicker;", "Lcom/ss/android/lark/search/widget/params/CalendarChatterPickerParams;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mAddEmailView", "Lcom/ss/android/lark/search/widget/calendar/AddEmailView;", "mCalendarDependency", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$ICalendarController;", "mContext", "mIsAddMail", "", "addEmailAttendee", "", "emailStr", "", "hideAddMailWhenEmailEquals", "searchKey", "infoList", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "initListener", "judgeShowMailView", "content", "onSearchEmpty", SearchIntents.EXTRA_QUERY, "onSearchSuccess", "onStartSearch", "transformByPickerParams", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "searchContext", "pickerParams", "Companion", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarChatterPicker extends AbsChatterPicker<CalendarChatterPickerParams, CalendarChatterPicker> {

    /* renamed from: A */
    public static final Companion f133011A = new Companion(null);

    /* renamed from: B */
    private Context f133012B;

    /* renamed from: C */
    private boolean f133013C;

    /* renamed from: y */
    public final SearchWidgetModuleDependency.ISearchWidgetModuleDependency.ICalendarController f133014y;

    /* renamed from: z */
    public final AddEmailView f133015z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/search/widget/CalendarChatterPicker$Companion;", "", "()V", "MAP_KEY_EMAILS", "", "MAP_KEY_NUMBER", "TAG", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.CalendarChatterPicker$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: o */
    private final void m208486o() {
        this.f133015z.getMAddMailContainer().setOnClickListener(new View$OnClickListenerC53863b(this));
        getMSearchInputView().setImeOptions(6);
        mo183570b(R.string.Calendar_Edit_AddGuestPlaceholder);
        getMSearchInputView().setOnEditorActionListener(new C53864c(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CalendarChatterPicker(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.ss.android.lark.search.widget.BasePicker, com.ss.android.lark.search.widget.AbsChatterPicker
    /* renamed from: a */
    public void mo183487a(List<SearchBaseInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "infoList");
        super.mo183487a(list);
        if (list.size() > 0) {
            m208484a(getQuery(), list);
        }
    }

    @Override // com.ss.android.lark.search.widget.BasePicker
    /* renamed from: e */
    public boolean mo183578e(String str) {
        Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
        if (this.f133015z.getVisibility() != 0) {
            return super.mo183578e(str);
        }
        getMSearchResultView().mo184615b();
        return true;
    }

    @Override // com.ss.android.lark.search.widget.BasePicker
    /* renamed from: d */
    public void mo183576d(String str) {
        boolean z;
        CalendarChatterPickerParams bVar;
        Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
        super.mo183576d(str);
        BasePicker.OnPickerParamsLoader mOnPickerParamsLoader = getMOnPickerParamsLoader();
        if (mOnPickerParamsLoader == null || (bVar = (CalendarChatterPickerParams) mOnPickerParamsLoader.onLoadPickerParams()) == null) {
            z = false;
        } else {
            z = bVar.mo183656c();
        }
        this.f133013C = z;
        if (z) {
            m208485h(str);
        }
    }

    /* renamed from: g */
    public final void mo183638g(String str) {
        if (!TextUtils.isEmpty(str) && this.f133013C) {
            EmailInfo emailInfo = new EmailInfo(str);
            this.f133015z.setVisibility(8);
            mo183569a((SearchBaseInfo) emailInfo, true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.CalendarChatterPicker$b */
    public static final class View$OnClickListenerC53863b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarChatterPicker f133016a;

        View$OnClickListenerC53863b(CalendarChatterPicker calendarChatterPicker) {
            this.f133016a = calendarChatterPicker;
        }

        public final void onClick(View view) {
            if (!TextUtils.isEmpty(this.f133016a.getQuery())) {
                List<String> b = this.f133016a.f133014y.mo102997b(this.f133016a.getQuery());
                if (b != null && (!b.isEmpty())) {
                    for (String str : b) {
                        this.f133016a.mo183638g(str);
                    }
                    this.f133016a.f133014y.mo102999c();
                }
                this.f133016a.getMSearchInputView().mo184584c();
            }
        }
    }

    /* renamed from: h */
    private final void m208485h(String str) {
        int i;
        if (!this.f133014y.mo102995a()) {
            this.f133015z.setVisibility(8);
        } else if (!this.f133014y.mo102996a(str)) {
            this.f133015z.setVisibility(8);
        } else {
            getMSearchResultView().mo184615b();
            this.f133015z.setVisibility(0);
            List<String> b = this.f133014y.mo102997b(str);
            if (b != null) {
                i = b.size();
            } else {
                i = 0;
            }
            if (i > 1) {
                HashMap hashMap = new HashMap();
                hashMap.put("number", String.valueOf(i));
                hashMap.put("emails", str);
                String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Calendar_EmailGuest_AddXEmailsMobile, hashMap);
                Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…               formatMap)");
                this.f133015z.getMMailNameTv().setText(mustacheFormat);
            } else if (i == 1) {
                TextView mMailNameTv = this.f133015z.getMMailNameTv();
                if (b == null) {
                    Intrinsics.throwNpe();
                }
                mMailNameTv.setText(b.get(0));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarChatterPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f133014y = SearchWidgetModuleDependency.m208511a().mo102936i();
        Log.m165379d("LarkSearch.SearchWidget.CalendarChatterPicker", "constructor, CalendarChatterPicker.");
        this.f133012B = context;
        AddEmailView addEmailView = new AddEmailView(context);
        this.f133015z = addEmailView;
        setHeadCustomView(addEmailView);
        addEmailView.setVisibility(8);
        m208486o();
    }

    /* renamed from: a */
    public SearchContext mo183482a(SearchContext searchContext, CalendarChatterPickerParams bVar) {
        Intrinsics.checkParameterIsNotNull(searchContext, "searchContext");
        searchContext.mo184391a(Scene.Type.SEARCH_IN_CALENDAR_SCENE);
        if (bVar != null) {
            searchContext.mo184407c(bVar.mo183694h());
            searchContext.mo184426k(bVar.mo183657d());
        }
        searchContext.mo184418g(getAddChatterFromDepartmentBySearch());
        searchContext.mo184420h(getMIsDepartmentSelectableWhenVisible());
        return searchContext;
    }

    /* renamed from: a */
    private final void m208484a(String str, List<SearchBaseInfo> list) {
        if (this.f133013C) {
            boolean z = false;
            Iterator<SearchBaseInfo> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SearchBaseInfo next = it.next();
                if (next instanceof SearchChatterInfo) {
                    String mailAddress = ((SearchChatterInfo) next).getMailAddress();
                    Intrinsics.checkExpressionValueIsNotNull(mailAddress, "info.mailAddress");
                    if (mailAddress != null) {
                        String lowerCase = mailAddress.toLowerCase();
                        Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (str != null) {
                            String lowerCase2 = str.toLowerCase();
                            Intrinsics.checkExpressionValueIsNotNull(lowerCase2, "(this as java.lang.String).toLowerCase()");
                            if (lowerCase.equals(lowerCase2)) {
                                z = true;
                                break;
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
            if (z) {
                this.f133015z.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "actionId", "", "event", "Landroid/view/KeyEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.CalendarChatterPicker$c */
    public static final class C53864c extends Lambda implements Function3<TextView, Integer, KeyEvent, Boolean> {
        final /* synthetic */ CalendarChatterPicker this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53864c(CalendarChatterPicker calendarChatterPicker) {
            super(3);
            this.this$0 = calendarChatterPicker;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ Boolean invoke(TextView textView, Integer num, KeyEvent keyEvent) {
            return Boolean.valueOf(invoke(textView, num.intValue(), keyEvent));
        }

        public final boolean invoke(TextView textView, int i, KeyEvent keyEvent) {
            String str;
            if (!(i == 4 || i == 6 || (keyEvent != null && 66 == keyEvent.getKeyCode() && keyEvent.getAction() == 0))) {
                return false;
            }
            if (!TextUtils.isEmpty(this.this$0.getQuery())) {
                str = this.this$0.getQuery();
            } else {
                str = "";
            }
            if (this.this$0.f133014y.mo102996a(str)) {
                List<String> b = this.this$0.f133014y.mo102997b(str);
                if (b == null) {
                    Intrinsics.throwNpe();
                }
                for (String str2 : b) {
                    this.this$0.mo183638g(str2);
                }
                this.this$0.getMSearchInputView().mo184584c();
                this.this$0.f133014y.mo102998b();
                return false;
            }
            this.this$0.f133015z.setVisibility(8);
            return false;
        }
    }
}
