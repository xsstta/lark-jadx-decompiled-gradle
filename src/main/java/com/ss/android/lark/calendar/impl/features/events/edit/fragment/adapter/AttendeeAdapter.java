package com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.common.widget.group.data.GroupMemberPageData;
import com.ss.android.lark.calendar.impl.features.events.detail.p1507d.C31256c;
import com.ss.android.lark.calendar.impl.features.events.edit.data.AttendeeFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EditAttendeeViewData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.EditAttendeeFragment;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.EditAttendeeHelper;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32662o;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0018\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002Z[B-\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u0010'\u001a\u00020(2\u0006\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020\u0011H\u0002J\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110\bJ\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\bJ\"\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010-2\u0006\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\u0013H\u0002J\u0018\u00103\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0002J\"\u00104\u001a\u00020(2\u0006\u00105\u001a\u0002062\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020908J&\u0010:\u001a\u00020(2\u0006\u00105\u001a\u0002062\u0016\b\u0002\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u000209\u0018\u000108J\u001a\u0010;\u001a\u00020(2\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0002J\u000e\u0010@\u001a\u00020(2\u0006\u0010A\u001a\u00020\rJ\u000e\u0010B\u001a\u00020(2\u0006\u0010C\u001a\u00020\u001fJ\u0018\u0010D\u001a\u00020(2\u0006\u0010%\u001a\u00020&2\u0006\u0010/\u001a\u00020-H\u0002J\u0010\u0010E\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u0011H\u0002J \u0010F\u001a\u00020(2\u0006\u0010G\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&2\u0006\u0010.\u001a\u00020\u0006H\u0002J \u0010H\u001a\u00020(2\u0006\u0010G\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&2\u0006\u0010.\u001a\u00020\u0006H\u0002J\u0018\u0010I\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0002J&\u0010J\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00112\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00110L2\u0006\u0010%\u001a\u00020&H\u0002J \u0010M\u001a\u00020(2\u0006\u0010G\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&2\u0006\u0010.\u001a\u00020\u0006H\u0002J\u0018\u0010N\u001a\u00020(2\u0006\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020\u0011H\u0002J\u0010\u0010O\u001a\u00020(2\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u0010P\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0002J \u0010Q\u001a\u00020(2\u0006\u0010G\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&2\u0006\u0010.\u001a\u00020\u0006H\u0002J\u0018\u0010R\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010S\u001a\u00020(H\u0002J\u0018\u0010T\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u0010U\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u0010V\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010W\u001a\u00020(2\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u0010X\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u0010Y\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0002R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u001a*\u0004\u0018\u00010\u00190\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006\\"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/AttendeeAdapter;", "Landroid/widget/ArrayAdapter;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EditAttendeeViewData;", "context", "Landroid/content/Context;", "resourceId", "", "showAttendees", "Ljava/util/ArrayList;", "dependency", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/AttendeeAdapter$AttendeeDependency;", "(Landroid/content/Context;ILjava/util/ArrayList;Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/AttendeeAdapter$AttendeeDependency;)V", "mAdapterChangedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$OnAdapterChangedListener;", "mAttendeeDependency", "mContext", "mCurrentAttendee", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "mEventCanGuestInvite", "", "mExchangeCalendarName", "", "mIsExchangeEvent", "mIsGoogleEvent", "mLoginDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/ILoginDependency;", "kotlin.jvm.PlatformType", "mLoginUserCustomer", "mLoginUserTenantId", "mResourceId", "<set-?>", "", "mShowGroupMembers", "getMShowGroupMembers", "()[Z", "checkGroupMemberExist", "groupAttendeeData", "viewHolder", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/AttendeeAdapter$ViewHolder;", "checkShowGroupTip", "", "attendee", "getAllItemAttendees", "getAllItems", "getView", "Landroid/view/View;", "position", "convertView", "parent", "Landroid/view/ViewGroup;", "isExternalEvent", "judgeShowDeleteBtnByExchange", "refreshData", "attendeeFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/AttendeeFragmentData;", "cacheGroupMember", "", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/GroupMemberPageData;", "setAdapterData", "setAttendeeStatusImage", UpdateKey.STATUS, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;", "statusImageView", "Landroid/widget/ImageView;", "setOnAdapterChangedListener", "adapterChangedListener", "setShowGroupMembers", "showGroupMembers", "setViewHolderConf", "shouldShowOuterUserLabel", "showBreakUpBtn", "attendeeData", "showBreakupButton", "showDeleteButton", "showGroupMember", "groupMembers", "", "showGroupMemberArrow", "showGroupMemberGuideTip", "showHideForSafeTip", "showInvisibleGroupMember", "showLoadingView", "showName", "showNotInGroupTipDialog", "showOptionalLabel", "showOuterUserLabel", "showPartialGroup", "showSpreadArrow", "showSpreadButton", "showStatus", "AttendeeDependency", "ViewHolder", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a.a */
public final class AttendeeAdapter extends ArrayAdapter<EditAttendeeViewData> {

    /* renamed from: a */
    public EditAttendeeFragment.OnAdapterChangedListener f80317a;

    /* renamed from: b */
    public AttendeeDependency f80318b;

    /* renamed from: c */
    private Context f80319c;

    /* renamed from: d */
    private AbstractC30054s f80320d = C30022a.f74882a.loginDependency();

    /* renamed from: e */
    private int f80321e;

    /* renamed from: f */
    private CalendarEventAttendee f80322f;

    /* renamed from: g */
    private boolean[] f80323g;

    /* renamed from: h */
    private boolean f80324h;

    /* renamed from: i */
    private String f80325i;

    /* renamed from: j */
    private boolean f80326j;

    /* renamed from: k */
    private boolean f80327k;

    /* renamed from: l */
    private String f80328l = "";

    /* renamed from: m */
    private boolean f80329m = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/AttendeeAdapter$AttendeeDependency;", "", "onClickBreakUpButton", "", "attendeeData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EditAttendeeViewData;", "groupId", "", "position", "", "onShowGroupMemberFragment", "attendee", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a.a$a */
    public interface AttendeeDependency {
        /* renamed from: a */
        void mo115171a(EditAttendeeViewData cVar, String str, int i);

        /* renamed from: a */
        void mo115172a(CalendarEventAttendee calendarEventAttendee);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00103\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u0010\u0017R\u001c\u00106\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0015\"\u0004\b8\u0010\u0017R\u001c\u00109\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0015\"\u0004\b;\u0010\u0017R\u001c\u0010<\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001b\"\u0004\b>\u0010\u001dR\u001c\u0010?\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001b\"\u0004\bA\u0010\u001dR\u001c\u0010B\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001b\"\u0004\bD\u0010\u001dR\u001c\u0010E\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u001b\"\u0004\bG\u0010\u001d¨\u0006H"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/AttendeeAdapter$ViewHolder;", "", "()V", "mAttendeeFeatureContainer", "Landroid/view/ViewGroup;", "getMAttendeeFeatureContainer", "()Landroid/view/ViewGroup;", "setMAttendeeFeatureContainer", "(Landroid/view/ViewGroup;)V", "mAttendeeLayout", "getMAttendeeLayout", "setMAttendeeLayout", "mAvatarImgView", "Lcom/joooonho/SelectableRoundedImageView;", "getMAvatarImgView", "()Lcom/joooonho/SelectableRoundedImageView;", "setMAvatarImgView", "(Lcom/joooonho/SelectableRoundedImageView;)V", "mDeleteBtn", "Landroid/widget/RelativeLayout;", "getMDeleteBtn", "()Landroid/widget/RelativeLayout;", "setMDeleteBtn", "(Landroid/widget/RelativeLayout;)V", "mDisplayNameTextView", "Landroid/widget/TextView;", "getMDisplayNameTextView", "()Landroid/widget/TextView;", "setMDisplayNameTextView", "(Landroid/widget/TextView;)V", "mGroupLoadingView", "Landroid/widget/ProgressBar;", "getMGroupLoadingView", "()Landroid/widget/ProgressBar;", "setMGroupLoadingView", "(Landroid/widget/ProgressBar;)V", "mIvArrow", "Landroid/widget/ImageView;", "getMIvArrow", "()Landroid/widget/ImageView;", "setMIvArrow", "(Landroid/widget/ImageView;)V", "mIvStatus", "getMIvStatus", "setMIvStatus", "mLlGroupMembers", "Landroid/widget/LinearLayout;", "getMLlGroupMembers", "()Landroid/widget/LinearLayout;", "setMLlGroupMembers", "(Landroid/widget/LinearLayout;)V", "mRlBreakUpGroup", "getMRlBreakUpGroup", "setMRlBreakUpGroup", "mRlInvisibleGroupMembers", "getMRlInvisibleGroupMembers", "setMRlInvisibleGroupMembers", "mRlSpreadGroupMembers", "getMRlSpreadGroupMembers", "setMRlSpreadGroupMembers", "mTvOptional", "getMTvOptional", "setMTvOptional", "mTvOrganizer", "getMTvOrganizer", "setMTvOrganizer", "mTvOuterUser", "getMTvOuterUser", "setMTvOuterUser", "mTvPartialGroup", "getMTvPartialGroup", "setMTvPartialGroup", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a.a$b */
    public static final class ViewHolder {

        /* renamed from: a */
        private SelectableRoundedImageView f80330a;

        /* renamed from: b */
        private ImageView f80331b;

        /* renamed from: c */
        private TextView f80332c;

        /* renamed from: d */
        private TextView f80333d;

        /* renamed from: e */
        private TextView f80334e;

        /* renamed from: f */
        private TextView f80335f;

        /* renamed from: g */
        private ViewGroup f80336g;

        /* renamed from: h */
        private TextView f80337h;

        /* renamed from: i */
        private RelativeLayout f80338i;

        /* renamed from: j */
        private RelativeLayout f80339j;

        /* renamed from: k */
        private RelativeLayout f80340k;

        /* renamed from: l */
        private RelativeLayout f80341l;

        /* renamed from: m */
        private ImageView f80342m;

        /* renamed from: n */
        private LinearLayout f80343n;

        /* renamed from: o */
        private ViewGroup f80344o;

        /* renamed from: p */
        private ProgressBar f80345p;

        /* renamed from: a */
        public final SelectableRoundedImageView mo115173a() {
            return this.f80330a;
        }

        /* renamed from: b */
        public final ImageView mo115181b() {
            return this.f80331b;
        }

        /* renamed from: c */
        public final TextView mo115186c() {
            return this.f80333d;
        }

        /* renamed from: d */
        public final TextView mo115189d() {
            return this.f80334e;
        }

        /* renamed from: e */
        public final TextView mo115192e() {
            return this.f80335f;
        }

        /* renamed from: f */
        public final TextView mo115194f() {
            return this.f80337h;
        }

        /* renamed from: g */
        public final RelativeLayout mo115195g() {
            return this.f80338i;
        }

        /* renamed from: h */
        public final RelativeLayout mo115196h() {
            return this.f80339j;
        }

        /* renamed from: i */
        public final RelativeLayout mo115197i() {
            return this.f80340k;
        }

        /* renamed from: j */
        public final RelativeLayout mo115198j() {
            return this.f80341l;
        }

        /* renamed from: k */
        public final ImageView mo115199k() {
            return this.f80342m;
        }

        /* renamed from: l */
        public final LinearLayout mo115200l() {
            return this.f80343n;
        }

        /* renamed from: m */
        public final ProgressBar mo115201m() {
            return this.f80345p;
        }

        /* renamed from: a */
        public final void mo115174a(ViewGroup viewGroup) {
            this.f80336g = viewGroup;
        }

        /* renamed from: b */
        public final void mo115182b(ViewGroup viewGroup) {
            this.f80344o = viewGroup;
        }

        /* renamed from: c */
        public final void mo115187c(RelativeLayout relativeLayout) {
            this.f80340k = relativeLayout;
        }

        /* renamed from: d */
        public final void mo115190d(RelativeLayout relativeLayout) {
            this.f80341l = relativeLayout;
        }

        /* renamed from: e */
        public final void mo115193e(TextView textView) {
            this.f80337h = textView;
        }

        /* renamed from: a */
        public final void mo115175a(ImageView imageView) {
            this.f80331b = imageView;
        }

        /* renamed from: b */
        public final void mo115183b(ImageView imageView) {
            this.f80342m = imageView;
        }

        /* renamed from: c */
        public final void mo115188c(TextView textView) {
            this.f80334e = textView;
        }

        /* renamed from: d */
        public final void mo115191d(TextView textView) {
            this.f80335f = textView;
        }

        /* renamed from: a */
        public final void mo115176a(LinearLayout linearLayout) {
            this.f80343n = linearLayout;
        }

        /* renamed from: b */
        public final void mo115184b(RelativeLayout relativeLayout) {
            this.f80339j = relativeLayout;
        }

        /* renamed from: a */
        public final void mo115177a(ProgressBar progressBar) {
            this.f80345p = progressBar;
        }

        /* renamed from: b */
        public final void mo115185b(TextView textView) {
            this.f80333d = textView;
        }

        /* renamed from: a */
        public final void mo115178a(RelativeLayout relativeLayout) {
            this.f80338i = relativeLayout;
        }

        /* renamed from: a */
        public final void mo115179a(TextView textView) {
            this.f80332c = textView;
        }

        /* renamed from: a */
        public final void mo115180a(SelectableRoundedImageView selectableRoundedImageView) {
            this.f80330a = selectableRoundedImageView;
        }
    }

    /* renamed from: a */
    public final boolean[] mo115165a() {
        return this.f80323g;
    }

    /* renamed from: a */
    public final void mo115164a(boolean[] zArr) {
        Intrinsics.checkParameterIsNotNull(zArr, "showGroupMembers");
        this.f80323g = zArr;
    }

    /* renamed from: a */
    private final boolean m119510a(CalendarEventAttendee calendarEventAttendee) {
        if (this.f80324h) {
            return false;
        }
        if (calendarEventAttendee.isThirdParty()) {
            return true;
        }
        if (C32662o.m125351b(calendarEventAttendee)) {
            return calendarEventAttendee.getIsCrossTenantGroup();
        }
        return calendarEventAttendee.isOuterUser(this.f80325i);
    }

    /* renamed from: a */
    public final void mo115162a(AttendeeFragmentData attendeeFragmentData, Map<String, GroupMemberPageData> map) {
        Intrinsics.checkParameterIsNotNull(attendeeFragmentData, "attendeeFragmentData");
        this.f80323g = new boolean[attendeeFragmentData.getShowAttendeeList().size()];
        this.f80322f = attendeeFragmentData.getEditorAttendee();
        this.f80326j = attendeeFragmentData.isGoogleEvent();
        this.f80327k = attendeeFragmentData.isExchangeEvent();
        this.f80328l = attendeeFragmentData.getExchangeCalendarName();
        AbstractC30054s sVar = this.f80320d;
        Intrinsics.checkExpressionValueIsNotNull(sVar, "mLoginDependency");
        this.f80324h = sVar.mo108270b();
        AbstractC30054s sVar2 = this.f80320d;
        Intrinsics.checkExpressionValueIsNotNull(sVar2, "mLoginDependency");
        this.f80325i = sVar2.mo108271c();
        this.f80329m = attendeeFragmentData.isCanInviteGuestOrModify();
    }

    /* renamed from: e */
    private final boolean m119520e() {
        if (this.f80326j || this.f80327k) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final ArrayList<EditAttendeeViewData> mo115166b() {
        ArrayList<EditAttendeeViewData> arrayList = new ArrayList<>();
        int count = getCount();
        for (int i = 0; i < count; i++) {
            EditAttendeeViewData cVar = (EditAttendeeViewData) getItem(i);
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final ArrayList<CalendarEventAttendee> mo115168c() {
        ArrayList<CalendarEventAttendee> arrayList = new ArrayList<>();
        int count = getCount();
        for (int i = 0; i < count; i++) {
            EditAttendeeViewData cVar = (EditAttendeeViewData) getItem(i);
            if (cVar != null) {
                arrayList.add(cVar.mo115078a());
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final void mo115169d() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Calendar_Common_Notice)).message(R.string.Calendar_Detail_GroupHiddedTip)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, (DialogInterface.OnClickListener) null)).messageTextSize(14)).messageTextColor(R.color.text_caption)).show();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a.a$f */
    public static final class View$OnClickListenerC31641f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AttendeeAdapter f80353a;

        View$OnClickListenerC31641f(AttendeeAdapter aVar) {
            this.f80353a = aVar;
        }

        public final void onClick(View view) {
            this.f80353a.mo115169d();
        }
    }

    /* renamed from: a */
    public final void mo115163a(EditAttendeeFragment.OnAdapterChangedListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "adapterChangedListener");
        this.f80317a = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a.a$e */
    public static final class View$OnClickListenerC31640e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AttendeeAdapter f80351a;

        /* renamed from: b */
        final /* synthetic */ CalendarEventAttendee f80352b;

        View$OnClickListenerC31640e(AttendeeAdapter aVar, CalendarEventAttendee calendarEventAttendee) {
            this.f80351a = aVar;
            this.f80352b = calendarEventAttendee;
        }

        public final void onClick(View view) {
            this.f80351a.f80318b.mo115172a(this.f80352b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a.a$c */
    static final class View$OnClickListenerC31638c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AttendeeAdapter f80346a;

        /* renamed from: b */
        final /* synthetic */ int f80347b;

        View$OnClickListenerC31638c(AttendeeAdapter aVar, int i) {
            this.f80346a = aVar;
            this.f80347b = i;
        }

        public final void onClick(View view) {
            AttendeeAdapter aVar = this.f80346a;
            aVar.remove(aVar.getItem(this.f80347b));
            this.f80346a.notifyDataSetChanged();
            EditAttendeeFragment.OnAdapterChangedListener bVar = this.f80346a.f80317a;
            if (bVar != null) {
                bVar.mo115540a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a.a$d */
    public static final class View$OnClickListenerC31639d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AttendeeAdapter f80348a;

        /* renamed from: b */
        final /* synthetic */ EditAttendeeViewData f80349b;

        /* renamed from: c */
        final /* synthetic */ int f80350c;

        View$OnClickListenerC31639d(AttendeeAdapter aVar, EditAttendeeViewData cVar, int i) {
            this.f80348a = aVar;
            this.f80349b = cVar;
            this.f80350c = i;
        }

        public final void onClick(View view) {
            String groupId;
            CalendarEventAttendee a = this.f80349b.mo115078a();
            if (!this.f80349b.mo115081b() && (groupId = a.getGroupId()) != null) {
                this.f80348a.f80318b.mo115171a(this.f80349b, groupId, this.f80350c);
            }
        }
    }

    /* renamed from: a */
    private final void m119502a(ViewHolder bVar) {
        LinearLayout l = bVar.mo115200l();
        if (l != null) {
            l.setVisibility(8);
        }
        ImageView k = bVar.mo115199k();
        if (k != null) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            k.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_down_outlined, UDColorUtils.getColor(context2, R.color.icon_n3)));
        }
    }

    /* renamed from: b */
    private final void m119512b(ViewHolder bVar) {
        TextView textView = new TextView(getContext());
        textView.setText(C32634ae.m125182b(R.string.Calendar_Detail_HideForSafe));
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(C32634ae.m125178a(R.color.lkui_N500));
        textView.setGravity(17);
        textView.setPadding(UIUtils.dp2px(getContext(), 32.0f), UIUtils.dp2px(getContext(), 10.0f), UIUtils.dp2px(getContext(), 32.0f), UIUtils.dp2px(getContext(), 20.0f));
        textView.setClickable(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        LinearLayout l = bVar.mo115200l();
        if (l != null) {
            l.addView(textView, layoutParams);
        }
    }

    /* renamed from: a */
    private final void m119504a(ViewHolder bVar, CalendarEventAttendee calendarEventAttendee) {
        if (calendarEventAttendee.getGroupId() != null) {
            m119513b(bVar, calendarEventAttendee);
        }
    }

    /* renamed from: e */
    private final void m119519e(CalendarEventAttendee calendarEventAttendee, ViewHolder bVar) {
        if (calendarEventAttendee.isOptional()) {
            TextView d = bVar.mo115189d();
            if (d != null) {
                d.setVisibility(0);
                return;
            }
            return;
        }
        TextView d2 = bVar.mo115189d();
        if (d2 != null) {
            d2.setVisibility(8);
        }
    }

    /* renamed from: h */
    private final void m119523h(CalendarEventAttendee calendarEventAttendee, ViewHolder bVar) {
        int i;
        if (!C32662o.m125351b(calendarEventAttendee) || !calendarEventAttendee.isSelfInGroup() || !calendarEventAttendee.isAnyRemoved()) {
            i = 8;
        } else {
            i = 0;
        }
        TextView f = bVar.mo115194f();
        if (f != null) {
            f.setVisibility(i);
        }
    }

    /* renamed from: b */
    private final void m119514b(CalendarEventAttendee calendarEventAttendee, ViewHolder bVar) {
        if (!this.f80327k || TextUtils.isEmpty(this.f80328l) || !Intrinsics.areEqual(calendarEventAttendee.getLocalizedDisplayName(), this.f80328l)) {
            RelativeLayout g = bVar.mo115195g();
            if (g != null) {
                g.setVisibility(0);
                return;
            }
            return;
        }
        RelativeLayout g2 = bVar.mo115195g();
        if (g2 != null) {
            g2.setVisibility(8);
        }
    }

    /* renamed from: c */
    private final void m119516c(CalendarEventAttendee calendarEventAttendee, ViewHolder bVar) {
        if (!C32662o.m125351b(calendarEventAttendee) || !calendarEventAttendee.isSelfInGroup()) {
            RelativeLayout h = bVar.mo115196h();
            if (h != null) {
                h.setVisibility(8);
                return;
            }
            return;
        }
        RelativeLayout h2 = bVar.mo115196h();
        if (h2 != null) {
            h2.setVisibility(0);
        }
    }

    /* renamed from: f */
    private final void m119521f(CalendarEventAttendee calendarEventAttendee, ViewHolder bVar) {
        if (!m119510a(calendarEventAttendee) || m119520e()) {
            TextView c = bVar.mo115186c();
            if (c != null) {
                c.setVisibility(8);
                return;
            }
            return;
        }
        TextView c2 = bVar.mo115186c();
        if (c2 != null) {
            LarkNameTag.Companion fVar = LarkNameTag.f62897a;
            Context context = c2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            fVar.mo90057f(context).mo90029a(true).mo90027e().mo90004a(c2);
            c2.setVisibility(0);
        }
    }

    /* renamed from: d */
    private final void m119518d(CalendarEventAttendee calendarEventAttendee, ViewHolder bVar) {
        if (!C32662o.m125351b(calendarEventAttendee) || calendarEventAttendee.isSelfInGroup()) {
            RelativeLayout j = bVar.mo115198j();
            if (j != null) {
                j.setVisibility(8);
                return;
            }
            return;
        }
        RelativeLayout j2 = bVar.mo115198j();
        if (j2 != null) {
            j2.setVisibility(0);
        }
        RelativeLayout j3 = bVar.mo115198j();
        if (j3 != null) {
            j3.setOnClickListener(new View$OnClickListenerC31641f(this));
        }
    }

    /* renamed from: g */
    private final void m119522g(CalendarEventAttendee calendarEventAttendee, ViewHolder bVar) {
        if (m119520e()) {
            TextView e = bVar.mo115192e();
            if (e != null) {
                e.setText(calendarEventAttendee.getLocalizedDisplayName());
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(calendarEventAttendee.getLocalizedDisplayName());
        if (C32662o.m125351b(calendarEventAttendee) && calendarEventAttendee.isSelfInGroup()) {
            sb.append("  (");
            sb.append(calendarEventAttendee.getValidMemberCount());
            sb.append(")");
        }
        TextView e2 = bVar.mo115192e();
        if (e2 != null) {
            e2.setText(sb.toString());
        }
    }

    /* renamed from: i */
    private final void m119524i(CalendarEventAttendee calendarEventAttendee, ViewHolder bVar) {
        if (m119520e() || calendarEventAttendee.isThirdParty()) {
            Bitmap a = C31256c.m117133a(36.0f, calendarEventAttendee.getLocalizedDisplayName());
            SelectableRoundedImageView a2 = bVar.mo115173a();
            if (a2 != null) {
                a2.setImageBitmap(a);
            }
        } else {
            C31256c.m117134a(getContext(), bVar.mo115173a(), 36, 36, calendarEventAttendee, true);
        }
        CalendarEventAttendee.Status status = calendarEventAttendee.getStatus();
        Intrinsics.checkExpressionValueIsNotNull(status, UpdateKey.STATUS);
        m119506a(status, bVar.mo115181b());
    }

    /* renamed from: a */
    private final void m119503a(ViewHolder bVar, View view) {
        bVar.mo115180a((SelectableRoundedImageView) view.findViewById(R.id.iv_avatar));
        bVar.mo115175a((ImageView) view.findViewById(R.id.iv_status));
        bVar.mo115191d((TextView) view.findViewById(R.id.tv_attendee_name));
        bVar.mo115174a((ViewGroup) view.findViewById(R.id.rl_attendee_feature));
        bVar.mo115179a((TextView) view.findViewById(R.id.tv_organizer));
        bVar.mo115185b((TextView) view.findViewById(R.id.tv_outer_user));
        bVar.mo115188c((TextView) view.findViewById(R.id.tv_optional));
        bVar.mo115178a((RelativeLayout) view.findViewById(R.id.btn_delete_attendee));
        bVar.mo115184b((RelativeLayout) view.findViewById(R.id.rl_spread_group_members));
        bVar.mo115190d((RelativeLayout) view.findViewById(R.id.rl_invisible_group_members));
        bVar.mo115183b((ImageView) view.findViewById(R.id.iv_arrow));
        bVar.mo115176a((LinearLayout) view.findViewById(R.id.ll_group_members));
        bVar.mo115182b((ViewGroup) view.findViewById(R.id.ll_attendee_layout));
        bVar.mo115187c((RelativeLayout) view.findViewById(R.id.rl_breakup_group));
        bVar.mo115193e((TextView) view.findViewById(R.id.tv_partial_group));
        bVar.mo115177a((ProgressBar) view.findViewById(R.id.group_attendee_loading));
    }

    /* renamed from: a */
    private final void m119506a(CalendarEventAttendee.Status status, ImageView imageView) {
        int i = C31642b.f80354a[status.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.ud_icon_succeed_colorful);
                }
            } else if (i == 3) {
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.ud_icon_delete_colorful);
                }
            } else if (i == 4) {
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.ud_icon_file_round_unknow_colorful);
                }
            }
        } else if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* renamed from: b */
    private final void m119513b(ViewHolder bVar, CalendarEventAttendee calendarEventAttendee) {
        TextView textView = new TextView(getContext());
        textView.setText(C32634ae.m125182b(R.string.Calendar_Edit_SeeMoreGuest));
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(C32634ae.m125178a(R.color.lkui_B600));
        textView.setPadding(UIUtils.dp2px(getContext(), 89.0f), UIUtils.dp2px(getContext(), 10.0f), 0, UIUtils.dp2px(getContext(), 20.0f));
        textView.setClickable(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        textView.setOnClickListener(new View$OnClickListenerC31640e(this, calendarEventAttendee));
        LinearLayout l = bVar.mo115200l();
        if (l != null) {
            l.addView(textView, layoutParams);
        }
    }

    /* renamed from: a */
    private final void m119507a(CalendarEventAttendee calendarEventAttendee, ViewHolder bVar) {
        if (!this.f80329m || !calendarEventAttendee.isEditable()) {
            RelativeLayout g = bVar.mo115195g();
            if (g != null) {
                g.setVisibility(8);
                return;
            }
            return;
        }
        m119514b(calendarEventAttendee, bVar);
    }

    /* renamed from: b */
    public final void mo115167b(AttendeeFragmentData attendeeFragmentData, Map<String, GroupMemberPageData> map) {
        Intrinsics.checkParameterIsNotNull(attendeeFragmentData, "attendeeFragmentData");
        Intrinsics.checkParameterIsNotNull(map, "cacheGroupMember");
        clear();
        addAll(EditAttendeeHelper.f79930a.mo114609a(attendeeFragmentData.getShowAttendeeList(), map));
        m119505a(this, attendeeFragmentData, null, 2, null);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    private final boolean m119509a(EditAttendeeViewData cVar, ViewHolder bVar) {
        boolean z;
        boolean z2;
        CalendarEventAttendee a = cVar.mo115078a();
        List<? extends CalendarEventAttendee> groupMembers = cVar.mo115078a().getGroupMembers();
        List<? extends CalendarEventAttendee> list = groupMembers;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (groupMembers.size() > 100) {
                groupMembers = groupMembers.subList(0, 100);
            }
            m119508a(a, groupMembers, bVar);
            return true;
        }
        List<? extends CalendarEventAttendee> c = cVar.mo115082c();
        List<? extends CalendarEventAttendee> list2 = c;
        if (list2 == null || list2.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return false;
        }
        if (c.size() > 100) {
            c = c.subList(0, 100);
        }
        m119508a(a, c, bVar);
        return true;
    }

    /* renamed from: c */
    private final void m119515c(EditAttendeeViewData cVar, ViewHolder bVar, int i) {
        RelativeLayout i2 = bVar.mo115197i();
        if (i2 != null) {
            i2.setVisibility(0);
        }
        RelativeLayout i3 = bVar.mo115197i();
        if (i3 != null) {
            i3.setOnClickListener(new View$OnClickListenerC31639d(this, cVar, i));
        }
    }

    /* renamed from: d */
    private final void m119517d(EditAttendeeViewData cVar, ViewHolder bVar, int i) {
        CalendarEventAttendee a = cVar.mo115078a();
        int i2 = 8;
        if (!C32662o.m125351b(a) || !a.isSelfInGroup()) {
            ProgressBar m = bVar.mo115201m();
            if (m != null) {
                m.setVisibility(8);
                return;
            }
            return;
        }
        ProgressBar m2 = bVar.mo115201m();
        if (m2 != null) {
            if (cVar.mo115081b()) {
                i2 = 0;
            }
            m2.setVisibility(i2);
        }
    }

    /* renamed from: a */
    private final void m119501a(EditAttendeeViewData cVar, ViewHolder bVar, int i) {
        CalendarEventAttendee a = cVar.mo115078a();
        if (!C32662o.m125351b(a) || !a.isSelfInGroup()) {
            LinearLayout l = bVar.mo115200l();
            if (l != null) {
                l.removeAllViews();
            }
            LinearLayout l2 = bVar.mo115200l();
            if (l2 != null) {
                l2.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout l3 = bVar.mo115200l();
        if (l3 != null) {
            l3.removeAllViews();
        }
        boolean[] zArr = this.f80323g;
        if (i >= zArr.length || !zArr[i]) {
            m119502a(bVar);
        } else if (!cVar.mo115081b() && !m119509a(cVar, bVar)) {
            m119502a(bVar);
        }
    }

    /* renamed from: b */
    private final void m119511b(EditAttendeeViewData cVar, ViewHolder bVar, int i) {
        boolean z;
        CalendarEventAttendee a = cVar.mo115078a();
        if (!C32662o.m125351b(a) || !a.isSelfInGroup()) {
            RelativeLayout i2 = bVar.mo115197i();
            if (i2 != null) {
                i2.setVisibility(8);
                return;
            }
            return;
        }
        if (!a.getOpenSecurity() || a.getValidMemberCount() <= a.getShowMemberLimit()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            RelativeLayout i3 = bVar.mo115197i();
            if (i3 != null) {
                i3.setVisibility(8);
            }
        } else if (!this.f80329m || !a.isEditable()) {
            RelativeLayout i4 = bVar.mo115197i();
            if (i4 != null) {
                i4.setVisibility(8);
            }
        } else if (a.getIsCrossTenantGroup()) {
            RelativeLayout i5 = bVar.mo115197i();
            if (i5 != null) {
                i5.setVisibility(8);
            }
        } else {
            m119515c(cVar, bVar, i);
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder bVar;
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(this.f80321e, viewGroup, false);
            bVar = new ViewHolder();
            Intrinsics.checkExpressionValueIsNotNull(view, "convertView");
            m119503a(bVar, view);
            view.setTag(bVar);
        } else {
            Object tag = view.getTag();
            if (tag != null) {
                bVar = (ViewHolder) tag;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.AttendeeAdapter.ViewHolder");
            }
        }
        EditAttendeeViewData cVar = (EditAttendeeViewData) getItem(i);
        if (cVar != null) {
            Intrinsics.checkExpressionValueIsNotNull(cVar, "getItem(position) ?: return convertView");
            CalendarEventAttendee a = cVar.mo115078a();
            m119522g(a, bVar);
            m119523h(a, bVar);
            m119524i(a, bVar);
            m119521f(a, bVar);
            m119519e(a, bVar);
            m119516c(a, bVar);
            m119511b(cVar, bVar, i);
            m119507a(a, bVar);
            m119501a(cVar, bVar, i);
            m119518d(a, bVar);
            m119517d(cVar, bVar, i);
            RelativeLayout g = bVar.mo115195g();
            if (g != null) {
                g.setOnClickListener(new View$OnClickListenerC31638c(this, i));
            }
        }
        return view;
    }

    /* renamed from: a */
    private final void m119508a(CalendarEventAttendee calendarEventAttendee, List<? extends CalendarEventAttendee> list, ViewHolder bVar) {
        int i;
        LinearLayout l = bVar.mo115200l();
        if (l != null) {
            l.setVisibility(0);
        }
        LinearLayout l2 = bVar.mo115200l();
        if (l2 != null) {
            l2.removeAllViews();
        }
        boolean openSecurity = calendarEventAttendee.getOpenSecurity();
        int showMemberLimit = calendarEventAttendee.getShowMemberLimit();
        if (openSecurity) {
            i = Math.min(list.size(), showMemberLimit);
        } else {
            i = list.size();
        }
        int i2 = 0;
        for (CalendarEventAttendee calendarEventAttendee2 : list) {
            if (calendarEventAttendee2.getStatus() != CalendarEventAttendee.Status.REMOVED) {
                i2++;
                if (i2 > i) {
                    break;
                }
                int screenWidth = DeviceUtils.getScreenWidth(getContext()) - UIUtils.dp2px(getContext(), 78.0f);
                View inflate = LayoutInflater.from(getContext()).inflate(R.layout.item_attendee_group_members, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(R.id.tv_attendee_name);
                TextView textView2 = (TextView) inflate.findViewById(R.id.tv_item_outer_user);
                Intrinsics.checkExpressionValueIsNotNull(textView, "memberName");
                textView.setText(calendarEventAttendee2.getLocalizedDisplayName());
                C31256c.m117134a(getContext(), (SelectableRoundedImageView) inflate.findViewById(R.id.iv_group_member_avatar), 32, 32, calendarEventAttendee2, true);
                CalendarEventAttendee.Status status = calendarEventAttendee2.getStatus();
                Intrinsics.checkExpressionValueIsNotNull(status, "member.status");
                m119506a(status, (ImageView) inflate.findViewById(R.id.iv_group_member_status));
                if (!m119510a(calendarEventAttendee2) || m119520e()) {
                    Intrinsics.checkExpressionValueIsNotNull(textView2, "outerUserIcon");
                    textView2.setVisibility(8);
                } else {
                    if (textView2 != null) {
                        LarkNameTag.Companion fVar = LarkNameTag.f62897a;
                        Context context = textView2.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context, "context");
                        fVar.mo90057f(context).mo90029a(true).mo90027e().mo90004a(textView2);
                        textView2.setVisibility(0);
                    }
                    screenWidth -= UIUtils.dp2px(getContext(), 36.0f);
                }
                textView.setMaxWidth(screenWidth);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C32634ae.m125185e(R.dimen.dp_56));
                layoutParams.gravity = 16;
                LinearLayout l3 = bVar.mo115200l();
                if (l3 != null) {
                    l3.addView(inflate, layoutParams);
                }
            }
        }
        if (calendarEventAttendee.getValidMemberCount() > i) {
            if (!openSecurity) {
                m119504a(bVar, calendarEventAttendee);
            } else if (calendarEventAttendee.getShowMemberLimit() > 100) {
                m119504a(bVar, calendarEventAttendee);
            } else {
                m119512b(bVar);
            }
        }
        LinearLayout l4 = bVar.mo115200l();
        if (l4 != null) {
            l4.setClickable(true);
        }
        ImageView k = bVar.mo115199k();
        if (k != null) {
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            Context context3 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            k.setImageDrawable(UDIconUtils.getIconDrawable(context2, (int) R.drawable.ud_icon_up_outlined, UDColorUtils.getColor(context3, R.color.icon_n3)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AttendeeAdapter(Context context, int i, ArrayList<EditAttendeeViewData> arrayList, AttendeeDependency aVar) {
        super(context, i, arrayList);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(arrayList, "showAttendees");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f80319c = context;
        this.f80321e = i;
        this.f80323g = new boolean[arrayList.size()];
        this.f80318b = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m119505a(AttendeeAdapter aVar, AttendeeFragmentData attendeeFragmentData, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        aVar.mo115162a(attendeeFragmentData, map);
    }
}
