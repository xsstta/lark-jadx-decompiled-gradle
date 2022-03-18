package com.ss.android.lark.mail.impl.widget.time.multitimezone;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mail.impl.widget.time.mvp.IModelCalendar;
import com.ss.android.lark.mail.impl.widget.time.mvp.IViewCalender;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/ITimeZoneSelectorContract;", "", "ITimeZoneSelectorModel", "ITimeZoneSelectorView", "IViewAction", "IViewData", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.g */
public interface ITimeZoneSelectorContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\tH&J\n\u0010\u0012\u001a\u0004\u0018\u00010\tH&J\n\u0010\u0013\u001a\u0004\u0018\u00010\tH&J\u0012\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&J\u0018\u0010\u0017\u001a\u00020\u000f2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019H&J\u0018\u0010\u001a\u001a\u00020\u000f2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0019H&J\u0012\u0010\u001c\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH&R\u0018\u0010\u0003\u001a\u00020\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/ITimeZoneSelectorContract$ITimeZoneSelectorModel;", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/IModelCalendar;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/ITimeZoneSelectorContract$IViewData;", "isShowToast", "", "()Z", "setShowToast", "(Z)V", ShareHitPoint.f121868c, "", "getSource", "()Ljava/lang/String;", "setSource", "(Ljava/lang/String;)V", "deleteAllRecentTimeZone", "", "deleteRecentTimeZone", "timeZoneId", "getDeviceTimeZoneId", "getSelectedTimeZoneId", "setDeviceTimeZone", "timeZoneData", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneItemData;", "setRecentTomeZone", "recentTimeZoneIdList", "Ljava/util/ArrayList;", "setSearchResult", "searchTimeZoneList", "setSelectedTimeZoneId", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.g$a */
    public interface ITimeZoneSelectorModel extends IModelCalendar<IViewData> {
        /* renamed from: a */
        void mo157019a(TimeZoneItemData iVar);

        /* renamed from: a */
        void mo157020a(String str);

        /* renamed from: a */
        void mo157021a(ArrayList<String> arrayList);

        /* renamed from: a */
        boolean mo157022a();

        /* renamed from: b */
        void mo157023b(ArrayList<TimeZoneItemData> arrayList);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/ITimeZoneSelectorContract$ITimeZoneSelectorView;", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/IViewCalender;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/ITimeZoneSelectorContract$IViewData;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/ITimeZoneSelectorContract$IViewAction;", "hideKeyboard", "", "modifyForDesktop", "showDeviceTimeZoneData", "showRecentTimeZoneData", "showRecentView", "showSearchNotData", "showSearchResultData", "showSearchView", "showSelectTimeZone", "showSelectedToast", "timeZoneTip", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.g$b */
    public interface ITimeZoneSelectorView extends IViewCalender<IViewData, IViewAction> {
        /* renamed from: a */
        void mo157024a();

        /* renamed from: a */
        void mo157025a(String str);

        /* renamed from: b */
        void mo157026b();

        /* renamed from: c */
        void mo157027c();

        /* renamed from: d */
        void mo157028d();

        /* renamed from: e */
        void mo157029e();

        /* renamed from: f */
        void mo157030f();

        /* renamed from: g */
        void mo157031g();

        /* renamed from: h */
        void mo157032h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/ITimeZoneSelectorContract$IViewAction;", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/IViewCalender$IViewAction;", "onClearAllRecentTimeZoneClick", "", "delTimeZoneIds", "Ljava/util/ArrayList;", "", "onDeleteRecentTimeZoneClick", "delTimeZoneId", "onSearchCancelClick", "onSearchClick", "searchKey", "onSearchEditViewClick", "onTimeZoneSelected", "timeZoneId", "onTitleBarCloseClicked", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.g$c */
    public interface IViewAction extends IViewCalender.IViewAction {
        /* renamed from: a */
        void mo157033a();

        /* renamed from: a */
        void mo157034a(String str);

        /* renamed from: b */
        void mo157035b();

        /* renamed from: b */
        void mo157036b(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/ITimeZoneSelectorContract$IViewData;", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/IViewCalender$IViewData;", "getDeviceTimeZone", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneItemData;", "getRecentResult", "Ljava/util/ArrayList;", "getSearchResult", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.g$d */
    public interface IViewData extends IViewCalender.IViewData {
        /* renamed from: a */
        TimeZoneItemData mo157037a();

        /* renamed from: b */
        ArrayList<TimeZoneItemData> mo157038b();
    }
}
