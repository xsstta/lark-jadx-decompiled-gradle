package com.ss.android.lark.calendar.impl.features.calendars.share.picker.confirm;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarMember;
import com.bytedance.lark.pb.calendar.v1.CalendarMemberCommit;
import com.bytedance.lark.pb.calendar.v1.CalendarMemberCommits;
import com.bytedance.lark.pb.calendar.v1.CalendarSaveInfo;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorModel;
import com.ss.android.lark.calendar.impl.features.calendars.share.helper.CalendarShareDataHelper;
import com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.CalendarMemberPickerData;
import com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.CalendarShareExtraParam;
import com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.ShareState;
import com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c.C32502i;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003JH\u0010/\u001a\u0002002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u001a\u00101\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u00172\u001a\u00102\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0017J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u00020(H\u0002J\b\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u000200H\u0002J\u0010\u00109\u001a\u0002002\u0006\u00105\u001a\u00020(H\u0016J\u0010\u0010:\u001a\u0002002\u0006\u0010;\u001a\u00020\u0016H\u0016J\u0018\u0010<\u001a\u0002002\u0006\u00105\u001a\u00020(2\u0006\u0010=\u001a\u000204H\u0016J\b\u0010>\u001a\u000200H\u0016J\u0010\u0010?\u001a\u0002002\u0006\u00105\u001a\u00020@H\u0002J\b\u0010A\u001a\u000200H\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R*\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R&\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010%\"\u0004\b*\u0010+R*\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0019\"\u0004\b.\u0010\u001b¨\u0006B"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarShareMemberViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/ICalendarShareMemberVM;", "()V", "calendarPickerParam", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarMemberPickerData;", "getCalendarPickerParam", "()Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarMemberPickerData;", "setCalendarPickerParam", "(Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarMemberPickerData;)V", "calendarShareParam", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarShareExtraParam;", "getCalendarShareParam", "()Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarShareExtraParam;", "setCalendarShareParam", "(Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarShareExtraParam;)V", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "getCallbackManager", "()Lcom/larksuite/framework/callback/CallbackManager;", "chatIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getChatIds", "()Ljava/util/ArrayList;", "setChatIds", "(Ljava/util/ArrayList;)V", "commentString", "getCommentString", "()Ljava/lang/String;", "setCommentString", "(Ljava/lang/String;)V", "shareStateLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/ShareState;", "getShareStateLiveData", "()Landroidx/lifecycle/MutableLiveData;", "showCalendarMembers", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember$Builder;", "getShowCalendarMembers", "setShowCalendarMembers", "(Landroidx/lifecycle/MutableLiveData;)V", "userIds", "getUserIds", "setUserIds", "create", "", "selectedChatters", "selectedGroupIds", "getMemberAccessRole", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$AccessRole;", "member", "getOwnerShareCalendarSaveInfo", "Lcom/bytedance/lark/pb/calendar/v1/CalendarSaveInfo;", "loadCalendarMemberListByIds", "onDeleteMemberClicked", "onEditComment", Comment.f24093e, "onEditMemberAccessRole", "newAccessRole", "onShareActionClicked", "removeDeletedMemberId", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "sendShareCalendarRequestByOwner", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.a.c */
public final class CalendarShareMemberViewModel extends AbstractC1142af {
    private CalendarMemberPickerData calendarPickerParam;
    private CalendarShareExtraParam calendarShareParam;
    private final CallbackManager callbackManager = new CallbackManager();
    private ArrayList<String> chatIds = new ArrayList<>();
    private String commentString = "";
    private final C1177w<ShareState> shareStateLiveData = new C1177w<>();
    private C1177w<List<CalendarMember.C15546a>> showCalendarMembers = new C1177w<>();
    private ArrayList<String> userIds = new ArrayList<>();

    public final CalendarMemberPickerData getCalendarPickerParam() {
        return this.calendarPickerParam;
    }

    public final CalendarShareExtraParam getCalendarShareParam() {
        return this.calendarShareParam;
    }

    public final CallbackManager getCallbackManager() {
        return this.callbackManager;
    }

    public final ArrayList<String> getChatIds() {
        return this.chatIds;
    }

    public final String getCommentString() {
        return this.commentString;
    }

    public C1177w<ShareState> getShareStateLiveData() {
        return this.shareStateLiveData;
    }

    public C1177w<List<CalendarMember.C15546a>> getShowCalendarMembers() {
        return this.showCalendarMembers;
    }

    public final ArrayList<String> getUserIds() {
        return this.userIds;
    }

    private final void sendShareCalendarRequestByOwner() {
        getShareStateLiveData().mo5929b(new ShareState(ShareState.STATE.LOADING, null, false, 6, null));
        C30531b bVar = new C30531b(this);
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        CalendarSaveInfo ownerShareCalendarSaveInfo = getOwnerShareCalendarSaveInfo();
        UIGetDataCallback wrapAndAddGetDataCallback = this.callbackManager.wrapAndAddGetDataCallback(bVar);
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…GetDataCallback(callback)");
        aVar.mo118926a(ownerShareCalendarSaveInfo, wrapAndAddGetDataCallback);
    }

    public void onShareActionClicked() {
        String str;
        boolean z;
        sendShareCalendarRequestByOwner();
        CalendarShareExtraParam calendarShareExtraParam = this.calendarShareParam;
        if (calendarShareExtraParam != null) {
            str = calendarShareExtraParam.getCalendarId();
        } else {
            str = null;
        }
        boolean z2 = false;
        if (this.commentString.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        CalendarMemberPickerData calendarMemberPickerData = this.calendarPickerParam;
        if (calendarMemberPickerData != null && calendarMemberPickerData.isFromCalendarCreate()) {
            z2 = true;
        }
        C32502i.m124375a(str, "share", z, z2);
    }

    private final void loadCalendarMemberListByIds() {
        String calendarId;
        boolean z;
        CalendarShareExtraParam calendarShareExtraParam = this.calendarShareParam;
        if (calendarShareExtraParam != null && (calendarId = calendarShareExtraParam.getCalendarId()) != null) {
            ArrayList<String> arrayList = this.userIds;
            boolean z2 = false;
            if (arrayList == null || arrayList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ArrayList<String> arrayList2 = this.chatIds;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    z2 = true;
                }
                if (z2) {
                    return;
                }
            }
            UIGetDataCallback wrapAndAddGetDataCallback = this.callbackManager.wrapAndAddGetDataCallback(new C30530a(this, String.valueOf(new Date().getTime()), "loadCalendarMemberListByIds"));
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…         }\n            })");
            CalendarSDKService.f83473a.mo118955b(calendarId, this.userIds, this.chatIds, wrapAndAddGetDataCallback);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.bytedance.lark.pb.calendar.v1.CalendarMemberCommits$a */
    /* JADX WARN: Multi-variable type inference failed */
    private final CalendarSaveInfo getOwnerShareCalendarSaveInfo() {
        ArrayList arrayList;
        List<CalendarMember.C15546a> b = getShowCalendarMembers().mo5927b();
        String str = null;
        if (b != null) {
            List<CalendarMember.C15546a> list = b;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (T t : list) {
                CalendarMemberCommit.C15552a aVar = new CalendarMemberCommit.C15552a();
                Calendar.AccessRole accessRole = t.f41216d;
                Intrinsics.checkExpressionValueIsNotNull(accessRole, "it.access_role");
                aVar.mo56414a(Calendar.AccessRole.fromValue(accessRole.getValue()));
                CalendarMember.CalendarMemberType calendarMemberType = t.f41222j;
                if (calendarMemberType != null && C30532d.f76370a[calendarMemberType.ordinal()] == 1) {
                    aVar.mo56417a(new CalendarMemberCommit.User.C15550a().mo56409a(t.f41215c).build());
                    aVar.mo56415a(CalendarMemberCommit.CalendarMemberType.INDIVIDUAL);
                } else {
                    aVar.mo56416a(new CalendarMemberCommit.Group.C15548a().mo56404a(t.f41223k).build());
                    aVar.mo56415a(CalendarMemberCommit.CalendarMemberType.GROUP);
                }
                arrayList2.add(aVar.build());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        CalendarMemberCommits a = new CalendarMemberCommits.C15554a().mo56423a(arrayList).mo56422a(this.commentString).build();
        CalendarSaveInfo.C15558a aVar2 = new CalendarSaveInfo.C15558a();
        CalendarShareExtraParam calendarShareExtraParam = this.calendarShareParam;
        if (calendarShareExtraParam != null) {
            str = calendarShareExtraParam.getCalendarId();
        }
        CalendarSaveInfo a2 = aVar2.mo56439a(str).mo56437a(a).build();
        Intrinsics.checkExpressionValueIsNotNull(a2, "CalendarSaveInfo.Builder…its)\n            .build()");
        return a2;
    }

    public final void setCalendarPickerParam(CalendarMemberPickerData calendarMemberPickerData) {
        this.calendarPickerParam = calendarMemberPickerData;
    }

    public final void setCalendarShareParam(CalendarShareExtraParam calendarShareExtraParam) {
        this.calendarShareParam = calendarShareExtraParam;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarShareMemberViewModel$sendShareCalendarRequestByOwner$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.a.c$b */
    public static final class C30531b implements IGetDataCallback<Object> {

        /* renamed from: a */
        final /* synthetic */ CalendarShareMemberViewModel f76369a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30531b(CalendarShareMemberViewModel cVar) {
            this.f76369a = cVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public void onSuccess(Object obj) {
            this.f76369a.getShareStateLiveData().mo5929b(new ShareState(ShareState.STATE.SUCCESS, null, false, 6, null));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
            if (r5 != null) goto L_0x0049;
         */
        @Override // com.larksuite.framework.callback.IGetDataCallback
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onError(com.larksuite.framework.callback.Entity.ErrorResult r5) {
            /*
                r4 = this;
                java.lang.String r0 = "err"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
                int r0 = r5.getErrorCode()
                r1 = 8050(0x1f72, float:1.128E-41)
                r2 = 0
                if (r0 == r1) goto L_0x0025
                r1 = 8099(0x1fa3, float:1.1349E-41)
                if (r0 == r1) goto L_0x0025
                com.ss.android.lark.calendar.impl.features.calendars.share.picker.a.c r5 = r4.f76369a
                androidx.lifecycle.w r5 = r5.getShareStateLiveData()
                com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.ShareState r0 = new com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.ShareState
                com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.ShareState$STATE r1 = com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.ShareState.STATE.FAILED
                java.lang.String r3 = ""
                r0.<init>(r1, r3, r2)
                r5.mo5929b(r0)
                goto L_0x0059
            L_0x0025:
                java.lang.String r5 = r5.getDisplayMsg()
                r0 = 1
                if (r5 == 0) goto L_0x0042
                java.lang.String r1 = "it"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r1)
                r1 = r5
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x003b
                r2 = 1
            L_0x003b:
                if (r2 == 0) goto L_0x003e
                goto L_0x003f
            L_0x003e:
                r5 = 0
            L_0x003f:
                if (r5 == 0) goto L_0x0042
                goto L_0x0049
            L_0x0042:
                r5 = 2131822928(0x7f110950, float:1.9278641E38)
                java.lang.String r5 = com.ss.android.lark.calendar.impl.utils.C32634ae.m125182b(r5)
            L_0x0049:
                com.ss.android.lark.calendar.impl.features.calendars.share.picker.a.c r1 = r4.f76369a
                androidx.lifecycle.w r1 = r1.getShareStateLiveData()
                com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.ShareState r2 = new com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.ShareState
                com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.ShareState$STATE r3 = com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.ShareState.STATE.FAILED
                r2.<init>(r3, r5, r0)
                r1.mo5929b(r2)
            L_0x0059:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendars.share.picker.confirm.CalendarShareMemberViewModel.C30531b.onError(com.larksuite.framework.callback.Entity.ErrorResult):void");
        }
    }

    public void onEditComment(String str) {
        Intrinsics.checkParameterIsNotNull(str, Comment.f24093e);
        this.commentString = str;
    }

    public final void setChatIds(ArrayList<String> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.chatIds = arrayList;
    }

    public final void setCommentString(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.commentString = str;
    }

    public void setShowCalendarMembers(C1177w<List<CalendarMember.C15546a>> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.showCalendarMembers = wVar;
    }

    public final void setUserIds(ArrayList<String> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.userIds = arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarShareMemberViewModel$loadCalendarMemberListByIds$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.a.c$a */
    public static final class C30530a implements IGetDataCallback<List<? extends CalendarMember>> {

        /* renamed from: a */
        final /* synthetic */ CalendarShareMemberViewModel f76366a;

        /* renamed from: b */
        final /* synthetic */ String f76367b;

        /* renamed from: c */
        final /* synthetic */ String f76368c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(CalendarCreatorModel.f75888b.mo109484a(), C32673y.m125370a(this.f76367b, this.f76368c, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(List<CalendarMember> list) {
            boolean z;
            List<CalendarMember> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                onError(new ErrorResult("data is null"));
                return;
            }
            List<CalendarMember> list3 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                CalendarMember.C15546a newBuilder = it.next().newBuilder();
                CalendarShareMemberViewModel cVar = this.f76366a;
                Intrinsics.checkExpressionValueIsNotNull(newBuilder, "this");
                newBuilder.f41216d = cVar.getMemberAccessRole(newBuilder);
                arrayList.add(newBuilder);
            }
            this.f76366a.getShowCalendarMembers().mo5926a(new ArrayList(arrayList));
        }

        C30530a(CalendarShareMemberViewModel cVar, String str, String str2) {
            this.f76366a = cVar;
            this.f76367b = str;
            this.f76368c = str2;
        }
    }

    private final void removeDeletedMemberId(CalendarMember calendarMember) {
        CalendarMember.CalendarMemberType calendarMemberType = calendarMember.member_type;
        if (calendarMemberType != null && C30532d.f76371b[calendarMemberType.ordinal()] == 1) {
            this.userIds.remove(calendarMember.user_id);
        } else {
            this.chatIds.remove(calendarMember.chat_id);
        }
    }

    public final Calendar.AccessRole getMemberAccessRole(CalendarMember.C15546a aVar) {
        Calendar.CalendarShareOptions calendarShareOptions;
        String str;
        CalendarShareExtraParam calendarShareExtraParam = this.calendarShareParam;
        if (calendarShareExtraParam == null || (calendarShareOptions = calendarShareExtraParam.getCalendarShareOptions()) == null) {
            return Calendar.AccessRole.FREE_BUSY_READER;
        }
        CalendarShareDataHelper aVar2 = CalendarShareDataHelper.f76316a;
        CalendarShareExtraParam calendarShareExtraParam2 = this.calendarShareParam;
        if (calendarShareExtraParam2 != null) {
            str = calendarShareExtraParam2.getCalendarTenantId();
        } else {
            str = null;
        }
        if (aVar2.mo110024a(str, aVar)) {
            return CalendarShareDataHelper.f76316a.mo110021a(calendarShareOptions.default_share_option);
        }
        return CalendarShareDataHelper.f76316a.mo110021a(calendarShareOptions.cross_default_share_option);
    }

    public void onDeleteMemberClicked(CalendarMember.C15546a aVar) {
        T t;
        Intrinsics.checkParameterIsNotNull(aVar, "member");
        List<CalendarMember.C15546a> b = getShowCalendarMembers().mo5927b();
        if (b != null) {
            Iterator<T> it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                CalendarShareDataHelper aVar2 = CalendarShareDataHelper.f76316a;
                CalendarMember a = t.build();
                Intrinsics.checkExpressionValueIsNotNull(a, "it.build()");
                CalendarMember a2 = aVar.build();
                Intrinsics.checkExpressionValueIsNotNull(a2, "member.build()");
                if (aVar2.mo110023a(a, a2)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                CalendarMember a3 = aVar.build();
                Intrinsics.checkExpressionValueIsNotNull(a3, "member.build()");
                removeDeletedMemberId(a3);
                List<CalendarMember.C15546a> b2 = getShowCalendarMembers().mo5927b();
                if (b2 != null) {
                    b2.remove(t2);
                }
                getShowCalendarMembers().mo5929b(getShowCalendarMembers().mo5927b());
            }
        }
    }

    public void onEditMemberAccessRole(CalendarMember.C15546a aVar, Calendar.AccessRole accessRole) {
        T t;
        Intrinsics.checkParameterIsNotNull(aVar, "member");
        Intrinsics.checkParameterIsNotNull(accessRole, "newAccessRole");
        List<CalendarMember.C15546a> b = getShowCalendarMembers().mo5927b();
        if (b != null) {
            Iterator<T> it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                CalendarShareDataHelper aVar2 = CalendarShareDataHelper.f76316a;
                CalendarMember a = t.build();
                Intrinsics.checkExpressionValueIsNotNull(a, "it.build()");
                CalendarMember a2 = aVar.build();
                Intrinsics.checkExpressionValueIsNotNull(a2, "member.build()");
                if (aVar2.mo110023a(a, a2)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                t2.f41216d = accessRole;
                getShowCalendarMembers().mo5929b(getShowCalendarMembers().mo5927b());
            }
        }
    }

    public final void create(CalendarMemberPickerData calendarMemberPickerData, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        CalendarShareExtraParam calendarShareExtraParam;
        if (arrayList != null) {
            this.userIds = new ArrayList<>(arrayList);
        }
        if (arrayList2 != null) {
            this.chatIds = new ArrayList<>(arrayList2);
        }
        this.calendarPickerParam = calendarMemberPickerData;
        if (calendarMemberPickerData != null) {
            calendarShareExtraParam = calendarMemberPickerData.getCalendarShareExtraParam();
        } else {
            calendarShareExtraParam = null;
        }
        this.calendarShareParam = calendarShareExtraParam;
        loadCalendarMemberListByIds();
    }
}
