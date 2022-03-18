package com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalendarChatterPickerViewModel;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR!\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u001d\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R!\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020 0\u000ej\b\u0012\u0004\u0012\u00020 `\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0012R\u0016\u0010\"\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\fR!\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0012R!\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0012R\u0011\u0010(\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0016¨\u0006+"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarPickerEntranceParams;", "Ljava/io/Serializable;", "builder", "Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarPickerEntranceParams$Builder;", "(Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarPickerEntranceParams$Builder;)V", "activityOpenDirection", "Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarChatterPickerViewModel$ActivityOpenDirection;", "getActivityOpenDirection", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarChatterPickerViewModel$ActivityOpenDirection;", "chatterPickerTitleResId", "", "getChatterPickerTitleResId", "()I", "disabledMemberIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getDisabledMemberIds", "()Ljava/util/ArrayList;", "enableOneWayContactCheck", "", "getEnableOneWayContactCheck", "()Z", "isAddMail", "isCheckPermission", "isShowExpandMeetingChatTip", "isShowSelectDepartmentTip", "needAddOuterUser", "getNeedAddOuterUser", "needSearchOuterUser", "getNeedSearchOuterUser", "preSelectBeanInfos", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "getPreSelectBeanInfos", "searchHintTextResId", "getSearchHintTextResId", "selectChatterIds", "getSelectChatterIds", "selectGroupIds", "getSelectGroupIds", "supportAddDepartment", "getSupportAddDepartment", "Builder", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarPickerEntranceParams implements Serializable {
    private final CalendarChatterPickerViewModel.ActivityOpenDirection activityOpenDirection;
    private final int chatterPickerTitleResId;
    private final ArrayList<String> disabledMemberIds;
    private final boolean enableOneWayContactCheck;
    private final boolean isAddMail;
    private final boolean isCheckPermission;
    private final boolean isShowExpandMeetingChatTip;
    private final boolean isShowSelectDepartmentTip;
    private final boolean needAddOuterUser;
    private final boolean needSearchOuterUser;
    private final ArrayList<SearchBaseInfo> preSelectBeanInfos;
    private final int searchHintTextResId;
    private final ArrayList<String> selectChatterIds;
    private final ArrayList<String> selectGroupIds;
    private final boolean supportAddDepartment;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0004J\u0010\u0010\u001b\u001a\u00020\u00002\b\b\u0001\u0010\u001c\u001a\u00020\u0006J\u0016\u0010\u001d\u001a\u00020\u00002\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001fJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\fJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\fJ\u000e\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\fJ\u000e\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\fJ\u000e\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\fJ\u000e\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\fJ\u0016\u0010,\u001a\u00020\u00002\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001fJ\u0010\u0010.\u001a\u00020\u00002\b\b\u0001\u0010/\u001a\u00020\u0006J\u0016\u00100\u001a\u00020\u00002\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001fJ\u0016\u00102\u001a\u00020\u00002\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001fJ\u000e\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\fJ\u000e\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\fJ\u0006\u00108\u001a\u000209J\u0006\u0010\u001c\u001a\u00020\u0006J\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nJ\u0006\u0010:\u001a\u00020\u0004J\u0006\u0010#\u001a\u00020\fJ\u0006\u0010%\u001a\u00020\fJ\u0006\u0010;\u001a\u00020\fJ\u0006\u0010<\u001a\u00020\fJ\u0006\u0010=\u001a\u00020\fJ\u0006\u0010>\u001a\u00020\fJ\u0006\u0010'\u001a\u00020\fJ\u0016\u0010?\u001a\u0012\u0012\u0004\u0012\u00020\u00140\bj\b\u0012\u0004\u0012\u00020\u0014`\nJ\u0006\u0010/\u001a\u00020\u0006J\u0016\u00101\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nJ\u0016\u0010@\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nJ\u0006\u00107\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00140\bj\b\u0012\u0004\u0012\u00020\u0014`\nX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarPickerEntranceParams$Builder;", "", "()V", "mActivityOpenDirection", "Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarChatterPickerViewModel$ActivityOpenDirection;", "mChatterPickerTitle", "", "mDisabledMemberIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "mEnableOneWayContactCheck", "", "mIsAddMail", "mIsCheckPermission", "mIsShowExpandMeetingChatTip", "mIsShowSelectDepartmentTip", "mNeedAddOuterUser", "mNeedSearchOuterUser", "mPreSelectBeanInfos", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "mSearchHintText", "mSelectChatterIds", "mSelectGroupIds", "mSupportAddDepartment", "attachActivityOpenDirection", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "attachChatterPickerTitleResId", "chatterPickerTitleResId", "attachDisabledMemberIds", "disabledMemberIds", "", "attachEnableOneWayContactCheck", "enableOneWayContactCheck", "attachIsAddMail", "isAddMail", "attachIsCheckPermission", "isCheckPermission", "attachIsShowSelectDepartmentTip", "isShowSelectDepartmentTip", "attachNeedAddOuterUser", "needAddOuterUser", "attachNeedSearchOuterUser", "needSearchOuterUser", "attachPreSelectBeanInfos", "beanInfos", "attachSearchHintTextResId", "searchHintTextResId", "attachSelectChatterIds", "selectChatterIds", "attachSelectGroupIds", "selectChatIds", "attachShowExpandMeetingChatTip", "isShowExpandMeetingChat", "attachSupportAddDepartment", "supportAddDepartment", "build", "Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarPickerEntranceParams;", "getActivityOpenDirection", "isEnableOneWayContactCheck", "isNeedAddOuterUser", "isNeedSearchOuterUser", "isShowExpandMeetingChatTip", "preSelectBeanInfos", "selectGroupIds", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalendarPickerEntranceParams$a */
    public static final class Builder {

        /* renamed from: a */
        private int f78862a = R.string.Calendar_Edit_AddGuest;

        /* renamed from: b */
        private int f78863b = R.string.Calendar_Common_Search;

        /* renamed from: c */
        private ArrayList<String> f78864c = new ArrayList<>();

        /* renamed from: d */
        private ArrayList<String> f78865d = new ArrayList<>();

        /* renamed from: e */
        private ArrayList<SearchBaseInfo> f78866e = new ArrayList<>();

        /* renamed from: f */
        private ArrayList<String> f78867f = new ArrayList<>();

        /* renamed from: g */
        private boolean f78868g;

        /* renamed from: h */
        private boolean f78869h;

        /* renamed from: i */
        private boolean f78870i;

        /* renamed from: j */
        private boolean f78871j;

        /* renamed from: k */
        private boolean f78872k;

        /* renamed from: l */
        private boolean f78873l;

        /* renamed from: m */
        private boolean f78874m;

        /* renamed from: n */
        private boolean f78875n;

        /* renamed from: o */
        private CalendarChatterPickerViewModel.ActivityOpenDirection f78876o = CalendarChatterPickerViewModel.ActivityOpenDirection.HORIZONTAL;

        /* renamed from: a */
        public final int mo113102a() {
            return this.f78862a;
        }

        /* renamed from: b */
        public final int mo113107b() {
            return this.f78863b;
        }

        /* renamed from: i */
        public final boolean mo113125i() {
            return this.f78870i;
        }

        /* renamed from: j */
        public final boolean mo113126j() {
            return this.f78871j;
        }

        /* renamed from: k */
        public final boolean mo113127k() {
            return this.f78872k;
        }

        /* renamed from: l */
        public final boolean mo113128l() {
            return this.f78873l;
        }

        /* renamed from: m */
        public final boolean mo113129m() {
            return this.f78874m;
        }

        /* renamed from: n */
        public final boolean mo113130n() {
            return this.f78875n;
        }

        /* renamed from: o */
        public final CalendarChatterPickerViewModel.ActivityOpenDirection mo113131o() {
            return this.f78876o;
        }

        /* renamed from: c */
        public final ArrayList<String> mo113113c() {
            return this.f78864c;
        }

        /* renamed from: d */
        public final ArrayList<String> mo113116d() {
            return this.f78865d;
        }

        /* renamed from: e */
        public final ArrayList<SearchBaseInfo> mo113118e() {
            return this.f78866e;
        }

        /* renamed from: f */
        public final ArrayList<String> mo113120f() {
            return this.f78867f;
        }

        /* renamed from: g */
        public final boolean mo113122g() {
            return this.f78868g;
        }

        /* renamed from: h */
        public final boolean mo113124h() {
            return this.f78869h;
        }

        /* renamed from: p */
        public final CalendarPickerEntranceParams mo113132p() {
            return new CalendarPickerEntranceParams(this);
        }

        /* renamed from: c */
        public final Builder mo113112c(boolean z) {
            this.f78869h = z;
            return this;
        }

        /* renamed from: d */
        public final Builder mo113115d(boolean z) {
            this.f78870i = z;
            return this;
        }

        /* renamed from: e */
        public final Builder mo113117e(boolean z) {
            this.f78873l = z;
            return this;
        }

        /* renamed from: f */
        public final Builder mo113119f(boolean z) {
            this.f78872k = z;
            return this;
        }

        /* renamed from: g */
        public final Builder mo113121g(boolean z) {
            this.f78874m = z;
            return this;
        }

        /* renamed from: h */
        public final Builder mo113123h(boolean z) {
            this.f78875n = z;
            return this;
        }

        /* renamed from: a */
        public final Builder mo113103a(int i) {
            this.f78862a = i;
            return this;
        }

        /* renamed from: b */
        public final Builder mo113108b(int i) {
            this.f78863b = i;
            return this;
        }

        /* renamed from: a */
        public final Builder mo113104a(CalendarChatterPickerViewModel.ActivityOpenDirection activityOpenDirection) {
            Intrinsics.checkParameterIsNotNull(activityOpenDirection, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
            this.f78876o = activityOpenDirection;
            return this;
        }

        /* renamed from: b */
        public final Builder mo113109b(List<String> list) {
            if (list != null) {
                this.f78864c.clear();
                this.f78864c.addAll(list);
            }
            return this;
        }

        /* renamed from: c */
        public final Builder mo113111c(List<? extends SearchBaseInfo> list) {
            if (list != null) {
                this.f78866e.clear();
                this.f78866e.addAll(list);
            }
            return this;
        }

        /* renamed from: d */
        public final Builder mo113114d(List<String> list) {
            if (list != null) {
                this.f78867f.clear();
                this.f78867f.addAll(list);
            }
            return this;
        }

        /* renamed from: a */
        public final Builder mo113105a(List<String> list) {
            if (list != null) {
                this.f78865d.clear();
                this.f78865d.addAll(list);
            }
            return this;
        }

        /* renamed from: b */
        public final Builder mo113110b(boolean z) {
            this.f78871j = z;
            return this;
        }

        /* renamed from: a */
        public final Builder mo113106a(boolean z) {
            this.f78868g = z;
            return this;
        }
    }

    public final CalendarChatterPickerViewModel.ActivityOpenDirection getActivityOpenDirection() {
        return this.activityOpenDirection;
    }

    public final int getChatterPickerTitleResId() {
        return this.chatterPickerTitleResId;
    }

    public final ArrayList<String> getDisabledMemberIds() {
        return this.disabledMemberIds;
    }

    public final boolean getEnableOneWayContactCheck() {
        return this.enableOneWayContactCheck;
    }

    public final boolean getNeedAddOuterUser() {
        return this.needAddOuterUser;
    }

    public final boolean getNeedSearchOuterUser() {
        return this.needSearchOuterUser;
    }

    public final ArrayList<SearchBaseInfo> getPreSelectBeanInfos() {
        return this.preSelectBeanInfos;
    }

    public final int getSearchHintTextResId() {
        return this.searchHintTextResId;
    }

    public final ArrayList<String> getSelectChatterIds() {
        return this.selectChatterIds;
    }

    public final ArrayList<String> getSelectGroupIds() {
        return this.selectGroupIds;
    }

    public final boolean getSupportAddDepartment() {
        return this.supportAddDepartment;
    }

    public final boolean isAddMail() {
        return this.isAddMail;
    }

    public final boolean isCheckPermission() {
        return this.isCheckPermission;
    }

    public final boolean isShowExpandMeetingChatTip() {
        return this.isShowExpandMeetingChatTip;
    }

    public final boolean isShowSelectDepartmentTip() {
        return this.isShowSelectDepartmentTip;
    }

    public CalendarPickerEntranceParams(Builder aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "builder");
        this.chatterPickerTitleResId = aVar.mo113102a();
        this.searchHintTextResId = aVar.mo113107b();
        this.selectChatterIds = aVar.mo113116d();
        this.selectGroupIds = aVar.mo113113c();
        this.disabledMemberIds = aVar.mo113120f();
        this.preSelectBeanInfos = aVar.mo113118e();
        this.isAddMail = aVar.mo113126j();
        this.isShowExpandMeetingChatTip = aVar.mo113122g();
        this.needSearchOuterUser = aVar.mo113124h();
        this.needAddOuterUser = aVar.mo113125i();
        this.enableOneWayContactCheck = aVar.mo113127k();
        this.isCheckPermission = aVar.mo113128l();
        this.supportAddDepartment = aVar.mo113129m();
        this.isShowSelectDepartmentTip = aVar.mo113130n();
        this.activityOpenDirection = aVar.mo113131o();
    }
}
