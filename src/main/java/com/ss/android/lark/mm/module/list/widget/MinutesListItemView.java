package com.ss.android.lark.mm.module.list.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDInputDialogBuilder;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.base.p2289a.C45861b;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.MmDetailActivity;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.ObjectStatus;
import com.ss.android.lark.mm.module.detail.baseinfo.ReviewStatus;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.mm.module.list.data.MinutesSummaryData;
import com.ss.android.lark.mm.module.list.data.MmListRankType;
import com.ss.android.lark.mm.module.list.my.MmListFilterPreference;
import com.ss.android.lark.mm.module.list.widget.C46467d;
import com.ss.android.lark.mm.module.list.widget.MmListItemMenuHelper;
import com.ss.android.lark.mm.module.podcast.MmPodcastLinkInfo;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import com.ss.android.lark.mm.module.record.model.Language;
import com.ss.android.lark.mm.p2288b.C45852d;
import com.ss.android.lark.mm.p2288b.C45853e;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.statistics.hitpoint.C47085h;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.hitpoint.ListPageClickEvent;
import com.ss.android.lark.mm.utils.C47098d;
import com.ss.android.lark.mm.utils.C47119t;
import com.ss.android.lark.mm.utils.FormatUtil;
import com.ss.android.lark.mm.utils.MmTimeUtils;
import com.ss.android.lark.mm.utils.ResString;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.mm.widget.BoldTextView;
import com.ss.android.lark.mm.widget.avatar.Avatar;
import com.ss.android.lark.mm.widget.swipemenu.SwipeMenuLayout;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 52\u00020\u0001:\u00015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fJ0\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002JK\u0010\u0018\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010\u001eJU\u0010\u001f\u001a\u0004\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\t2\b\u0010 \u001a\u0004\u0018\u00010\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010!J\u0017\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010$J \u0010%\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\fH\u0002J\b\u0010&\u001a\u00020\u000eH\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010)\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\fH\u0002J(\u0010*\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J@\u0010+\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010-H\u0002J\u0018\u0010.\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010/\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u00100\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u00101\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\fH\u0002J\u0010\u00102\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J(\u00103\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u00104\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020\fH\u0002R\u000e\u0010\u000b\u001a\u00020\fXD¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ss/android/lark/mm/module/list/widget/MinutesListItemView;", "Lcom/ss/android/lark/mm/widget/swipemenu/SwipeMenuLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "bindData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/list/data/MinutesSummaryData;", "ds", "Lcom/ss/android/lark/mm/module/list/control/MmListControl$DataSource;", "repoId", "deleteConfirmWhenBroken", ChatTypeStateKeeper.f135670e, "token", "getDataUrl", "getStatusBadge", "objectToken", "reviewStatus", UpdateKey.STATUS, "processProgress", "processStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;", "getStatusText", "uploadingProgress", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;", "getUploadingText", "progress", "(Ljava/lang/Integer;)Ljava/lang/String;", "gotoDetailPage", "init", "isRecordingLottie", "", "onClickItem", "removeOrDeleteConfirm", "renameConfirm", "onRenamed", "Lkotlin/Function0;", "setTopicText", "showCover", "showDuration", "showMenu", "showStatus", "showTimestamp", "isDisabled", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MinutesListItemView extends SwipeMenuLayout {

    /* renamed from: b */
    public static final Companion f116962b = new Companion(null);

    /* renamed from: a */
    public final String f116963a;

    /* renamed from: d */
    private HashMap f116964d;

    /* renamed from: a */
    public View mo163292a(int i) {
        if (this.f116964d == null) {
            this.f116964d = new HashMap();
        }
        View view = (View) this.f116964d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f116964d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mm/module/list/widget/MinutesListItemView$Companion;", "", "()V", "RecordingLottieJson", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.widget.MinutesListItemView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo163298a(MinutesSummaryData minutesSummaryData, MmListControl.DataSource dataSource, String str) {
        int i;
        Intrinsics.checkParameterIsNotNull(minutesSummaryData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        Intrinsics.checkParameterIsNotNull(str, "repoId");
        boolean z = ObjectStatus.Companion.mo161607b(minutesSummaryData.getStatus()) && !minutesSummaryData.isRecordingType();
        if (z) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            i = UDColorUtils.getColor(context, R.color.bg_body_overlay);
        } else {
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            i = UDColorUtils.getColor(context2, R.color.bg_body);
        }
        setBackgroundColor(i);
        m183784a(minutesSummaryData);
        Context context3 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "context");
        mo163293a(context3, minutesSummaryData);
        m183786b(minutesSummaryData);
        m183783a(dataSource, minutesSummaryData, z, str);
        m183788c(minutesSummaryData);
        m183787c(dataSource, minutesSummaryData, str);
        m183785b(dataSource, minutesSummaryData, str);
    }

    /* renamed from: a */
    private final void m183783a(MmListControl.DataSource dataSource, MinutesSummaryData minutesSummaryData, boolean z, String str) {
        String str2;
        int i;
        MmListFilterPreference b;
        MmListFilterPreference b2;
        int i2 = C46466c.f117009a[dataSource.ordinal()];
        boolean z2 = false;
        if (i2 == 1) {
            BoldTextView boldTextView = (BoldTextView) mo163292a(R.id.tvDescription);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvDescription");
            boldTextView.setVisibility(8);
            LinearLayout linearLayout = (LinearLayout) mo163292a(R.id.homeDesLayout);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "homeDesLayout");
            linearLayout.setVisibility(0);
            TextView textView = (TextView) mo163292a(R.id.tvOwner);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvOwner");
            textView.setText(minutesSummaryData.getOwnerName());
            TextView textView2 = (TextView) mo163292a(R.id.tvTime);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tvTime");
            textView2.setText(FormatUtil.f118607a.mo165484b(minutesSummaryData.getTime()));
        } else if (i2 == 2 || i2 == 3) {
            LinearLayout linearLayout2 = (LinearLayout) mo163292a(R.id.homeDesLayout);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "homeDesLayout");
            linearLayout2.setVisibility(8);
            BoldTextView boldTextView2 = (BoldTextView) mo163292a(R.id.tvDescription);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView2, "tvDescription");
            boldTextView2.setVisibility(0);
            String b3 = FormatUtil.f118607a.mo165484b(minutesSummaryData.getTime());
            String str3 = b3;
            if (str3 == null || str3.length() == 0) {
                z2 = true;
            }
            if (z2) {
                str2 = "";
            } else {
                MmListRankType mmListRankType = null;
                if (dataSource == MmListControl.DataSource.MyList) {
                    MmListControl b4 = MmListControl.f116817j.mo163013b(str);
                    if (!(b4 == null || (b2 = b4.mo162986b()) == null)) {
                        mmListRankType = b2.mo162897c();
                    }
                    if (mmListRankType == MmListRankType.CREATE_TIME) {
                        Context context = getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context, "context");
                        String string = context.getResources().getString(R.string.MMWeb_G_Created);
                        Intrinsics.checkExpressionValueIsNotNull(string, "context.resources.getStr…g(string.MMWeb_G_Created)");
                        str2 = string + ' ' + b3;
                    } else {
                        str2 = UIHelper.mustacheFormat((int) R.string.MMWeb_M_LastOpenedAt_Text, "time", b3);
                    }
                } else {
                    MmListControl b5 = MmListControl.f116817j.mo163013b(str);
                    if (!(b5 == null || (b = b5.mo162986b()) == null)) {
                        mmListRankType = b.mo162899e();
                    }
                    if (mmListRankType == MmListRankType.SHARE_TIME) {
                        Context context2 = getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                        String string2 = context2.getResources().getString(R.string.MMWeb_G_Shared);
                        Intrinsics.checkExpressionValueIsNotNull(string2, "context.resources.getString(string.MMWeb_G_Shared)");
                        str2 = string2 + ' ' + b3;
                    } else {
                        str2 = UIHelper.mustacheFormat((int) R.string.MMWeb_M_LastOpenedAt_Text, "time", b3);
                    }
                }
            }
            BoldTextView boldTextView3 = (BoldTextView) mo163292a(R.id.tvDescription);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView3, "tvDescription");
            if (!Intrinsics.areEqual(boldTextView3.getText(), str2)) {
                BoldTextView boldTextView4 = (BoldTextView) mo163292a(R.id.tvDescription);
                Intrinsics.checkExpressionValueIsNotNull(boldTextView4, "tvDescription");
                boldTextView4.setText(str2);
            }
            BoldTextView boldTextView5 = (BoldTextView) mo163292a(R.id.tvDescription);
            if (z) {
                Context context3 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context3, "context");
                i = UDColorUtils.getColor(context3, R.color.text_disable);
            } else {
                Context context4 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context4, "context");
                i = UDColorUtils.getColor(context4, R.color.text_placeholder);
            }
            boldTextView5.setTextColor(i);
        } else if (i2 == 4) {
            LinearLayout linearLayout3 = (LinearLayout) mo163292a(R.id.homeDesLayout);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "homeDesLayout");
            linearLayout3.setVisibility(8);
            BoldTextView boldTextView6 = (BoldTextView) mo163292a(R.id.tvDescription);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView6, "tvDescription");
            boldTextView6.setVisibility(0);
            Long time = minutesSummaryData.getTime();
            if (time != null) {
                long j = (long) 60;
                long longValue = (time.longValue() / ((long) 1000)) / j;
                long j2 = longValue / j;
                long j3 = j2 / ((long) 24);
                if (j2 < 1) {
                    Context context5 = getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context5, "context");
                    ((BoldTextView) mo163292a(R.id.tvDescription)).setTextColor(UDColorUtils.getColor(context5, R.color.function_danger_500));
                    BoldTextView boldTextView7 = (BoldTextView) mo163292a(R.id.tvDescription);
                    Intrinsics.checkExpressionValueIsNotNull(boldTextView7, "tvDescription");
                    boldTextView7.setText(UIHelper.mustacheFormat((int) R.string.MMWeb_M_Trash_NumberMinutesRemaining, "number", String.valueOf(longValue)));
                    return;
                }
                int i3 = (j3 > 1 ? 1 : (j3 == 1 ? 0 : -1));
                if (i3 < 0) {
                    Context context6 = getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context6, "context");
                    ((BoldTextView) mo163292a(R.id.tvDescription)).setTextColor(UDColorUtils.getColor(context6, R.color.function_danger_500));
                    BoldTextView boldTextView8 = (BoldTextView) mo163292a(R.id.tvDescription);
                    Intrinsics.checkExpressionValueIsNotNull(boldTextView8, "tvDescription");
                    boldTextView8.setText(UIHelper.mustacheFormat((int) R.string.MMWeb_M_Trash_NumberHourRemaining, "number", String.valueOf(j2)));
                    return;
                }
                int i4 = R.string.MMWeb_M_Trash_NumberDaysRemaining;
                if (j3 <= 10) {
                    Context context7 = getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context7, "context");
                    ((BoldTextView) mo163292a(R.id.tvDescription)).setTextColor(UDColorUtils.getColor(context7, R.color.function_danger_500));
                    if (i3 == 0) {
                        i4 = R.string.MMWeb_M_Trash_NumberDayRemaining;
                    }
                    BoldTextView boldTextView9 = (BoldTextView) mo163292a(R.id.tvDescription);
                    Intrinsics.checkExpressionValueIsNotNull(boldTextView9, "tvDescription");
                    boldTextView9.setText(UIHelper.mustacheFormat(i4, "number", String.valueOf(j3)));
                    return;
                }
                Context context8 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context8, "context");
                ((BoldTextView) mo163292a(R.id.tvDescription)).setTextColor(UDColorUtils.getColor(context8, R.color.text_placeholder));
                BoldTextView boldTextView10 = (BoldTextView) mo163292a(R.id.tvDescription);
                Intrinsics.checkExpressionValueIsNotNull(boldTextView10, "tvDescription");
                boldTextView10.setText(UIHelper.mustacheFormat((int) R.string.MMWeb_M_Trash_NumberDaysRemaining, "number", String.valueOf(j3)));
            }
        }
    }

    /* renamed from: a */
    public final void mo163294a(MmListControl.DataSource dataSource, MinutesSummaryData minutesSummaryData, String str) {
        List<MinutesSummaryData> d;
        if (dataSource != MmListControl.DataSource.TrashList) {
            boolean areEqual = Intrinsics.areEqual((Object) minutesSummaryData.isRecordingDevice(), (Object) true);
            MmRecordManager.Companion aVar = MmRecordManager.f117918g;
            String objectToken = minutesSummaryData.getObjectToken();
            if (objectToken == null) {
                objectToken = "";
            }
            MmRecordManager.RecordState a = aVar.mo164546a(objectToken);
            boolean z = (a == MmRecordManager.RecordState.STOPPED || a == MmRecordManager.RecordState.UNKNOWN) ? false : true;
            boolean e = ObjectStatus.Companion.mo161610e(minutesSummaryData.getStatus());
            String str2 = this.f116963a;
            C45855f.m181664c(str2, "isRecordingDevice: " + areEqual + ", " + "localRecording: " + z + ", isServerRecording: " + e + ", data: " + minutesSummaryData);
            if (!(z || (!areEqual && e))) {
                String d2 = m183789d(minutesSummaryData);
                ArrayList arrayList = new ArrayList();
                MmListControl b = MmListControl.f116817j.mo163013b(str);
                if (!(b == null || (d = b.mo162995d(dataSource)) == null)) {
                    int size = d.size();
                    for (int i = 0; i < size; i++) {
                        if (i < d.size()) {
                            MinutesSummaryData minutesSummaryData2 = d.get(i);
                            String d3 = m183789d(minutesSummaryData2);
                            String topic = minutesSummaryData2.getTopic();
                            if (topic == null) {
                                topic = "";
                            }
                            arrayList.add(new MmPodcastLinkInfo(d3, topic));
                        }
                    }
                }
                MmDetailActivity.Companion aVar2 = MmDetailActivity.f115761d;
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                MmDetailActivity.Companion.m182008a(aVar2, context, d2, 13, arrayList, null, null, 48, null);
            } else if (!Intrinsics.areEqual((Object) minutesSummaryData.isRecordingDevice(), (Object) true)) {
                MmRecordManager a2 = C45852d.m181651a().mo161150a(minutesSummaryData.getObjectToken());
                MmBaseInfo mmBaseInfo = new MmBaseInfo();
                mmBaseInfo.setObjectToken(minutesSummaryData.getObjectToken());
                mmBaseInfo.setTopic(minutesSummaryData.getTopic());
                mmBaseInfo.setOwner(minutesSummaryData.isOwner());
                mmBaseInfo.setRecordingDevice(false);
                Long startTime = minutesSummaryData.getStartTime();
                mmBaseInfo.setStartTime(startTime != null ? startTime.longValue() : System.currentTimeMillis());
                a2.mo164519a(mmBaseInfo, new Language());
                a2.mo164529h();
            } else {
                C45852d.m181651a().mo161150a(minutesSummaryData.getObjectToken()).mo164529h();
            }
        }
    }

    /* renamed from: a */
    public final void mo163297a(MmListControl.DataSource dataSource, String str, String str2, String str3, MinutesSummaryData minutesSummaryData) {
        if (C47098d.m186535b(getContext())) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).titleBold(true)).title(R.string.MMWeb_G_ContentUnavailable)).message(R.string.MMWeb_G_ContentUnavailableCorruptedFile)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.MMWeb_G_GoBack, new DialogInterface$OnClickListenerC46452b(minutesSummaryData))).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90706b(R.string.MMWeb_G_Delete).mo90710d(R.color.ud_R500).mo90703a(new DialogInterface$OnClickListenerC46453c(this, minutesSummaryData, str3, dataSource, str2)))).show();
        }
        C47083e.m186425a(C47085h.m186431a(minutesSummaryData), "vc_minutes_delete_view", C47086i.m186432a().mo165421c());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo163295a(MmListControl.DataSource dataSource, MinutesSummaryData minutesSummaryData, String str, String str2, String str3, Function0<Unit> function0) {
        if (C47098d.m186535b(getContext())) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = str;
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            ((UDInputDialogBuilder) ((UDInputDialogBuilder) ((UDInputDialogBuilder) ((UDInputDialogBuilder) ((UDInputDialogBuilder) new UDInputDialogBuilder(context).title(R.string.MMWeb_G_Rename)).titleBold(true)).message(" ")).mo90904b(str).addActionButton(R.id.ud_dialog_btn_primary, R.string.MMWeb_G_Rename, new DialogInterface$OnClickListenerC46456f(this, str3, dataSource, str2, objectRef, minutesSummaryData, function0))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.MMWeb_G_Cancel, (DialogInterface.OnClickListener) null)).mo90900a(new C46458g(objectRef)).show();
        }
    }

    /* renamed from: a */
    public final void mo163296a(MmListControl.DataSource dataSource, String str, String str2, MinutesSummaryData minutesSummaryData) {
        if (C47098d.m186535b(getContext())) {
            new C46467d(getContext(), dataSource, minutesSummaryData.isOwner(), minutesSummaryData, new C46455e(this, str2, dataSource, str)).mo163324a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.widget.MinutesListItemView$k */
    public static final class RunnableC46463k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MinutesListItemView f116992a;

        RunnableC46463k(MinutesListItemView minutesListItemView) {
            this.f116992a = minutesListItemView;
        }

        public final void run() {
            ((LKUILottieAnimationView) this.f116992a.mo163292a(R.id.ivBadge)).resumeAnimation();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/mm/module/list/widget/MinutesListItemView$showMenu$1", "Lcom/ss/android/lark/mm/module/list/widget/MmListItemMenuHelper$IListMenuCallback;", "onDelete", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/list/data/MinutesSummaryData;", "onDeletePermanently", "onRemove", "onRename", "onRestore", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.widget.MinutesListItemView$j */
    public static final class C46461j implements MmListItemMenuHelper.IListMenuCallback {

        /* renamed from: a */
        final /* synthetic */ MinutesListItemView f116989a;

        /* renamed from: b */
        final /* synthetic */ MmListControl.DataSource f116990b;

        /* renamed from: c */
        final /* synthetic */ String f116991c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.list.widget.MinutesListItemView$j$a */
        static final class C46462a extends Lambda implements Function0<Unit> {
            final /* synthetic */ MinutesSummaryData $data;
            final /* synthetic */ C46461j this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46462a(C46461j jVar, MinutesSummaryData minutesSummaryData) {
                super(0);
                this.this$0 = jVar;
                this.$data = minutesSummaryData;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                if (this.this$0.f116990b != MmListControl.DataSource.HomeList) {
                    C45861b.m181700a().f115693d.mo161176a(this.$data);
                }
            }
        }

        @Override // com.ss.android.lark.mm.module.list.widget.MmListItemMenuHelper.IListMenuCallback
        /* renamed from: b */
        public void mo163308b(MinutesSummaryData minutesSummaryData) {
            Intrinsics.checkParameterIsNotNull(minutesSummaryData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            MinutesListItemView minutesListItemView = this.f116989a;
            MmListControl.DataSource dataSource = this.f116990b;
            String objectToken = minutesSummaryData.getObjectToken();
            if (objectToken == null) {
                objectToken = "";
            }
            minutesListItemView.mo163296a(dataSource, objectToken, this.f116991c, minutesSummaryData);
        }

        @Override // com.ss.android.lark.mm.module.list.widget.MmListItemMenuHelper.IListMenuCallback
        /* renamed from: d */
        public void mo163310d(MinutesSummaryData minutesSummaryData) {
            Intrinsics.checkParameterIsNotNull(minutesSummaryData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            MinutesListItemView minutesListItemView = this.f116989a;
            MmListControl.DataSource dataSource = this.f116990b;
            String objectToken = minutesSummaryData.getObjectToken();
            if (objectToken == null) {
                objectToken = "";
            }
            minutesListItemView.mo163296a(dataSource, objectToken, this.f116991c, minutesSummaryData);
        }

        @Override // com.ss.android.lark.mm.module.list.widget.MmListItemMenuHelper.IListMenuCallback
        /* renamed from: a */
        public void mo163307a(MinutesSummaryData minutesSummaryData) {
            String str;
            String str2;
            Intrinsics.checkParameterIsNotNull(minutesSummaryData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            new ListPageClickEvent("rename", null, 2, null).mo165437a();
            MinutesListItemView minutesListItemView = this.f116989a;
            MmListControl.DataSource dataSource = this.f116990b;
            String topic = minutesSummaryData.getTopic();
            if (topic != null) {
                str = topic;
            } else {
                str = "";
            }
            String objectToken = minutesSummaryData.getObjectToken();
            if (objectToken != null) {
                str2 = objectToken;
            } else {
                str2 = "";
            }
            minutesListItemView.mo163295a(dataSource, minutesSummaryData, str, str2, this.f116991c, new C46462a(this, minutesSummaryData));
        }

        @Override // com.ss.android.lark.mm.module.list.widget.MmListItemMenuHelper.IListMenuCallback
        /* renamed from: c */
        public void mo163309c(MinutesSummaryData minutesSummaryData) {
            Intrinsics.checkParameterIsNotNull(minutesSummaryData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            new ListPageClickEvent("delete", null, 2, null).mo165437a();
            MinutesListItemView minutesListItemView = this.f116989a;
            MmListControl.DataSource dataSource = this.f116990b;
            String objectToken = minutesSummaryData.getObjectToken();
            if (objectToken == null) {
                objectToken = "";
            }
            minutesListItemView.mo163296a(dataSource, objectToken, this.f116991c, minutesSummaryData);
        }

        @Override // com.ss.android.lark.mm.module.list.widget.MmListItemMenuHelper.IListMenuCallback
        /* renamed from: e */
        public void mo163311e(MinutesSummaryData minutesSummaryData) {
            Intrinsics.checkParameterIsNotNull(minutesSummaryData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            MmListControl b = MmListControl.f116817j.mo163013b(this.f116991c);
            if (b != null) {
                String objectToken = minutesSummaryData.getObjectToken();
                if (objectToken == null) {
                    objectToken = "";
                }
                b.mo162989b(objectToken);
            }
            this.f116989a.mo165848b();
        }

        C46461j(MinutesListItemView minutesListItemView, MmListControl.DataSource dataSource, String str) {
            this.f116989a = minutesListItemView;
            this.f116990b = dataSource;
            this.f116991c = str;
        }
    }

    /* renamed from: d */
    private final void m183790d() {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_minutes_list_item, this);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.widget.MinutesListItemView$h */
    public static final class RunnableC46459h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MinutesListItemView f116983a;

        /* renamed from: b */
        final /* synthetic */ Context f116984b;

        /* renamed from: c */
        final /* synthetic */ MinutesSummaryData f116985c;

        /* renamed from: d */
        final /* synthetic */ boolean f116986d;

        RunnableC46459h(MinutesListItemView minutesListItemView, Context context, MinutesSummaryData minutesSummaryData, boolean z) {
            this.f116983a = minutesListItemView;
            this.f116984b = context;
            this.f116985c = minutesSummaryData;
            this.f116986d = z;
        }

        public final void run() {
            Integer num;
            String string = this.f116984b.getString(R.string.MMWeb_G_ExternalLabel);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.MMWeb_G_ExternalLabel)");
            String str = this.f116985c.getTopic() + "  " + string;
            BoldTextView boldTextView = (BoldTextView) this.f116983a.mo163292a(R.id.tvTopic);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvTopic");
            boldTextView.setText(str);
            BoldTextView boldTextView2 = (BoldTextView) this.f116983a.mo163292a(R.id.tvTopic);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView2, "tvTopic");
            Layout layout = boldTextView2.getLayout();
            if (layout != null) {
                BoldTextView boldTextView3 = (BoldTextView) this.f116983a.mo163292a(R.id.tvTopic);
                Intrinsics.checkExpressionValueIsNotNull(boldTextView3, "tvTopic");
                Layout layout2 = boldTextView3.getLayout();
                Intrinsics.checkExpressionValueIsNotNull(layout2, "tvTopic.layout");
                int ellipsisCount = layout.getEllipsisCount(layout2.getLineCount() - 1);
                String topic = this.f116985c.getTopic();
                if (topic != null) {
                    num = Integer.valueOf(topic.length());
                } else {
                    num = null;
                }
                C45855f.m181663b(this.f116983a.f116963a, "before processing - trueTopicLength: " + num);
                if (ellipsisCount > 0) {
                    C45855f.m181663b(this.f116983a.f116963a, "before processing - topicWithTag: " + str);
                    C45855f.m181663b(this.f116983a.f116963a, "processing params - topicWithTag.length: " + str.length() + " ellipsisCount: " + ellipsisCount);
                    StringBuilder sb = new StringBuilder();
                    int length = (str.length() - ellipsisCount) - string.length();
                    if (str != null) {
                        String substring = str.substring(0, length);
                        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb.append(substring);
                        sb.append("...");
                        sb.append(string);
                        str = sb.toString();
                        C45855f.m181663b(this.f116983a.f116963a, "after processing - topicWithTag: " + str + " topicWithTagLength: " + str.length());
                        num = Integer.valueOf(str.length() - string.length());
                        C45855f.m181663b(this.f116983a.f116963a, "after processing - trueTopicLength: " + num);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                String str2 = str;
                int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, string, 0, false, 6, (Object) null);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                spannableStringBuilder.setSpan(new C47119t(UDColorUtils.getColor(this.f116984b, R.color.udtoken_tag_text_s_blue), UIUtils.dp2px(this.f116984b, 12.0f), UDColorUtils.getColor(this.f116984b, R.color.udtoken_tag_bg_blue)), indexOf$default, string.length() + indexOf$default, 33);
                if (num != null && num.intValue() > 0) {
                    if (this.f116986d) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(UDColorUtils.getColor(this.f116984b, R.color.text_placeholder)), 0, num.intValue(), 18);
                    } else {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(UDColorUtils.getColor(this.f116984b, R.color.text_title)), 0, num.intValue(), 18);
                    }
                }
                BoldTextView boldTextView4 = (BoldTextView) this.f116983a.mo163292a(R.id.tvTopic);
                Intrinsics.checkExpressionValueIsNotNull(boldTextView4, "tvTopic");
                boldTextView4.setText(spannableStringBuilder);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.widget.MinutesListItemView$d */
    public static final class C46454d extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MinutesSummaryData $data;
        final /* synthetic */ MmListControl.DataSource $ds;
        final /* synthetic */ String $repoId;
        final /* synthetic */ MinutesListItemView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46454d(MinutesListItemView minutesListItemView, MinutesSummaryData minutesSummaryData, MmListControl.DataSource dataSource, String str) {
            super(1);
            this.this$0 = minutesListItemView;
            this.$data = minutesSummaryData;
            this.$ds = dataSource;
            this.$repoId = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            String str;
            String str2;
            Intrinsics.checkParameterIsNotNull(view, "it");
            if (!ObjectStatus.Companion.mo161607b(this.$data.getStatus()) || this.$data.isRecordingType()) {
                Integer status = this.$data.getStatus();
                int value = ObjectStatus.FileCorrupted.getValue();
                if (status != null && status.intValue() == value) {
                    MinutesListItemView minutesListItemView = this.this$0;
                    MmListControl.DataSource dataSource = this.$ds;
                    String topic = this.$data.getTopic();
                    if (topic != null) {
                        str = topic;
                    } else {
                        str = "";
                    }
                    String objectToken = this.$data.getObjectToken();
                    if (objectToken != null) {
                        str2 = objectToken;
                    } else {
                        str2 = "";
                    }
                    minutesListItemView.mo163297a(dataSource, str, str2, this.$repoId, this.$data);
                    return;
                }
                int i = C46466c.f117010b[this.$ds.ordinal()];
                if (i == 1) {
                    C47083e.m186425a(C47085h.m186431a(this.$data), "vc_minutes_list_click", C47086i.m186432a().mo165422d("object").mo165423e("vc_minutes_detail_view").mo165426h("home_page").mo165421c());
                } else if (i == 2) {
                    MmListControl b = MmListControl.f116817j.mo163013b(this.$repoId);
                    if (b != null) {
                        b.mo163000e(MinutesSummaryData.copy$default(this.$data, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, Long.valueOf(System.currentTimeMillis()), null, null, null, false, null, null, null, 267386879, null));
                    }
                    C47083e.m186425a(C47085h.m186431a(this.$data), "vc_minutes_list_click", C47086i.m186432a().mo165422d("object").mo165423e("vc_minutes_detail_view").mo165426h("my_content").mo165421c());
                } else if (i == 3) {
                    MmListControl b2 = MmListControl.f116817j.mo163013b(this.$repoId);
                    if (b2 != null) {
                        b2.mo163002f(MinutesSummaryData.copy$default(this.$data, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, Long.valueOf(System.currentTimeMillis()), null, null, null, false, null, null, null, 267386879, null));
                    }
                    C47083e.m186425a(C47085h.m186431a(this.$data), "vc_minutes_list_click", C47086i.m186432a().mo165422d("object").mo165423e("vc_minutes_detail_view").mo165426h("shared_with_me").mo165421c());
                }
                this.this$0.mo163294a(this.$ds, this.$data, this.$repoId);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mm/module/list/widget/MinutesListItemView$renameConfirm$2", "Lcom/larksuite/component/universe_design/dialog/UDInputDialogBuilder$OnTextChangedListener;", "onTextChanged", "", "s", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.widget.MinutesListItemView$g */
    public static final class C46458g implements UDInputDialogBuilder.OnTextChangedListener {

        /* renamed from: a */
        final /* synthetic */ Ref.ObjectRef f116982a;

        C46458g(Ref.ObjectRef objectRef) {
            this.f116982a = objectRef;
        }

        @Override // com.larksuite.component.universe_design.dialog.UDInputDialogBuilder.OnTextChangedListener
        /* renamed from: a */
        public void mo89293a(CharSequence charSequence) {
            this.f116982a.element = (T) String.valueOf(charSequence);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MinutesListItemView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/list/widget/MinutesListItemView$removeOrDeleteConfirm$1", "Lcom/ss/android/lark/mm/module/list/widget/MmListDeleteConfirmDialog$IListDeleteCallback;", "onCancel", "", "dialog", "Landroid/content/DialogInterface;", "onConfirm", "isChecked", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.widget.MinutesListItemView$e */
    public static final class C46455e implements C46467d.AbstractC46477a {

        /* renamed from: a */
        final /* synthetic */ MinutesListItemView f116971a;

        /* renamed from: b */
        final /* synthetic */ String f116972b;

        /* renamed from: c */
        final /* synthetic */ MmListControl.DataSource f116973c;

        /* renamed from: d */
        final /* synthetic */ String f116974d;

        @Override // com.ss.android.lark.mm.module.list.widget.C46467d.AbstractC46477a
        /* renamed from: a */
        public void mo163302a(DialogInterface dialogInterface) {
            new ListPageClickEvent("cancel", "delete").mo165437a();
            this.f116971a.mo165848b();
        }

        @Override // com.ss.android.lark.mm.module.list.widget.C46467d.AbstractC46477a
        /* renamed from: a */
        public void mo163303a(DialogInterface dialogInterface, boolean z) {
            new ListPageClickEvent("confirm", "delete").mo165437a();
            MmListControl b = MmListControl.f116817j.mo163013b(this.f116972b);
            if (b != null) {
                Context context = this.f116971a.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                b.mo162975a(context, this.f116973c, this.f116974d, z);
            }
            this.f116971a.mo165848b();
        }

        C46455e(MinutesListItemView minutesListItemView, String str, MmListControl.DataSource dataSource, String str2) {
            this.f116971a = minutesListItemView;
            this.f116972b = str;
            this.f116973c = dataSource;
            this.f116974d = str2;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "onBitmapLoaded"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.widget.MinutesListItemView$i */
    public static final class C46460i implements C45853e.AbstractC45854a {

        /* renamed from: a */
        final /* synthetic */ MinutesListItemView f116987a;

        /* renamed from: b */
        final /* synthetic */ MinutesSummaryData f116988b;

        C46460i(MinutesListItemView minutesListItemView, MinutesSummaryData minutesSummaryData) {
            this.f116987a = minutesListItemView;
            this.f116988b = minutesSummaryData;
        }

        @Override // com.ss.android.lark.mm.p2288b.C45853e.AbstractC45854a
        /* renamed from: a */
        public final void mo161154a(Bitmap bitmap) {
            if (bitmap != null) {
                Avatar avatar = (Avatar) this.f116987a.mo163292a(R.id.ivCover);
                Intrinsics.checkExpressionValueIsNotNull(avatar, "ivCover");
                if (Intrinsics.areEqual(avatar.getTag(), this.f116988b.getVideoCover())) {
                    ((Avatar) this.f116987a.mo163292a(R.id.ivCover)).setImageBitmap(bitmap);
                }
            }
        }
    }

    /* renamed from: a */
    private final String m183781a(Integer num) {
        if (num == null) {
            return ResString.f118656a.mo165504a(R.string.MMWeb_G_Uploading);
        }
        return ResString.f118656a.mo165504a(R.string.MMWeb_G_Uploading) + num + "%";
    }

    /* renamed from: e */
    private final boolean m183791e(MinutesSummaryData minutesSummaryData) {
        if (!ObjectStatus.Companion.mo161610e(minutesSummaryData.getStatus())) {
            return false;
        }
        MmRecordManager.Companion aVar = MmRecordManager.f117918g;
        String objectToken = minutesSummaryData.getObjectToken();
        if (objectToken == null) {
            objectToken = "";
        }
        if (C46466c.f117011c[aVar.mo164546a(objectToken).ordinal()] != 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final void m183788c(MinutesSummaryData minutesSummaryData) {
        long j;
        Long duration = minutesSummaryData.getDuration();
        if (duration != null) {
            j = duration.longValue();
        } else {
            j = 0;
        }
        String a = MmTimeUtils.m186493a(j);
        if (m183791e(minutesSummaryData)) {
            BoldTextView boldTextView = (BoldTextView) mo163292a(R.id.tvRecordingDuration);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvRecordingDuration");
            boldTextView.setVisibility(0);
            BoldTextView boldTextView2 = (BoldTextView) mo163292a(R.id.tvDuration);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView2, "tvDuration");
            boldTextView2.setVisibility(8);
            BoldTextView boldTextView3 = (BoldTextView) mo163292a(R.id.tvRecordingDuration);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView3, "tvRecordingDuration");
            boldTextView3.setText(a);
            return;
        }
        BoldTextView boldTextView4 = (BoldTextView) mo163292a(R.id.tvDuration);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView4, "tvDuration");
        boldTextView4.setText(a);
        BoldTextView boldTextView5 = (BoldTextView) mo163292a(R.id.tvRecordingDuration);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView5, "tvRecordingDuration");
        boldTextView5.setVisibility(8);
        BoldTextView boldTextView6 = (BoldTextView) mo163292a(R.id.tvDuration);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView6, "tvDuration");
        boldTextView6.setVisibility(0);
    }

    /* renamed from: d */
    private final String m183789d(MinutesSummaryData minutesSummaryData) {
        boolean z;
        String url = minutesSummaryData.getUrl();
        String str = url;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            IMmDepend.AbstractC45879g hostDepend = a.getHostDepend();
            Intrinsics.checkExpressionValueIsNotNull(hostDepend, "MmDepend.impl().hostDepend");
            if (!hostDepend.mo144643k()) {
                return url;
            }
        }
        IMmDepend a2 = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
        IMmDepend.AbstractC45875c domainDepend = a2.getDomainDepend();
        Intrinsics.checkExpressionValueIsNotNull(domainDepend, "MmDepend.impl().domainDepend");
        String a3 = domainDepend.mo144616a();
        if (a3 == null) {
            a3 = "";
        }
        if (!StringsKt.endsWith$default(a3, "/", false, 2, (Object) null)) {
            a3 = a3 + "/";
        }
        return a3 + "minutes/" + minutesSummaryData.getObjectToken();
    }

    /* renamed from: a */
    private final void m183784a(MinutesSummaryData minutesSummaryData) {
        int i;
        boolean z;
        Object obj;
        if (minutesSummaryData.isVideo()) {
            i = R.drawable.mm_ic_list_video;
        } else {
            i = R.drawable.mm_ic_list_audio;
        }
        Object tag = ((Avatar) mo163292a(R.id.ivCover)).getTag(R.id.mm_image_view_tag);
        String videoCover = minutesSummaryData.getVideoCover();
        boolean z2 = false;
        if (videoCover == null || videoCover.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            obj = minutesSummaryData.getVideoCover();
        } else {
            obj = Integer.valueOf(i);
        }
        if (!Intrinsics.areEqual(tag, obj)) {
            ((Avatar) mo163292a(R.id.ivCover)).setTag(R.id.mm_image_view_tag, obj);
            ((Avatar) mo163292a(R.id.ivCover)).setImageResource(i);
            Avatar avatar = (Avatar) mo163292a(R.id.ivCover);
            Intrinsics.checkExpressionValueIsNotNull(avatar, "ivCover");
            avatar.setTag(minutesSummaryData.getVideoCover());
            String videoCover2 = minutesSummaryData.getVideoCover();
            if (videoCover2 == null || videoCover2.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                C45853e.m181656a(getContext(), minutesSummaryData.getVideoCover(), UIUtils.dp2px(getContext(), 120.0f), UIUtils.dp2px(getContext(), 68.0f), new C46460i(this, minutesSummaryData));
            }
        }
    }

    /* renamed from: b */
    private final void m183786b(MinutesSummaryData minutesSummaryData) {
        boolean z;
        boolean z2;
        Integer a = m183780a(minutesSummaryData.getTopic(), minutesSummaryData.getObjectToken(), minutesSummaryData.getReviewStatus(), minutesSummaryData.getStatus(), minutesSummaryData.getProcessingProgress(), minutesSummaryData.getProcessingStatus());
        if (a != null) {
            String str = this.f116963a;
            C45855f.m181664c(str, "[showStatus] topic: " + minutesSummaryData.getTopic() + ", token: " + minutesSummaryData.getObjectToken() + ", badgeDrawable is nonnull");
            LKUILottieAnimationView lKUILottieAnimationView = (LKUILottieAnimationView) mo163292a(R.id.ivBadge);
            Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView, "ivBadge");
            lKUILottieAnimationView.setVisibility(0);
            ((LKUILottieAnimationView) mo163292a(R.id.ivBadge)).setImageResource(a.intValue());
            if (a.intValue() == R.drawable.mm_ic_list_badge_noauth) {
                ((BoldTextView) mo163292a(R.id.tvStatus)).setTextColor(UIUtils.getColor(getContext(), R.color.function_danger_500));
            } else if (a.intValue() == R.drawable.mm_ic_list_badge_processing) {
                ((BoldTextView) mo163292a(R.id.tvStatus)).setTextColor(UIUtils.getColor(getContext(), R.color.function_warning_500));
            } else if (a.intValue() == R.drawable.mm_ic_list_badge_uploading) {
                ((BoldTextView) mo163292a(R.id.tvStatus)).setTextColor(UIUtils.getColor(getContext(), R.color.function_info_500));
            } else if (a.intValue() == R.drawable.mm_ic_list_badge_failed) {
                ((BoldTextView) mo163292a(R.id.tvStatus)).setTextColor(UIUtils.getColor(getContext(), R.color.function_danger_500));
            } else {
                ((BoldTextView) mo163292a(R.id.tvStatus)).setTextColor(UIUtils.getColor(getContext(), R.color.text_caption));
            }
        } else if (m183791e(minutesSummaryData)) {
            String str2 = this.f116963a;
            C45855f.m181664c(str2, "[showStatus] topic: " + minutesSummaryData.getTopic() + ",  token: " + minutesSummaryData.getObjectToken() + ", isRecordingLottie");
            ((BoldTextView) mo163292a(R.id.tvStatus)).setTextColor(UIUtils.getColor(getContext(), R.color.text_caption));
            if (((LKUILottieAnimationView) mo163292a(R.id.ivBadge)).getTag(R.id.mm_image_view_tag) == null) {
                ((LKUILottieAnimationView) mo163292a(R.id.ivBadge)).setTag(R.id.mm_image_view_tag, "mm_record_list_wave.json");
                ((LKUILottieAnimationView) mo163292a(R.id.ivBadge)).setAnimation("mm_record_list_wave.json");
                LKUILottieAnimationView lKUILottieAnimationView2 = (LKUILottieAnimationView) mo163292a(R.id.ivBadge);
                Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView2, "ivBadge");
                lKUILottieAnimationView2.setVisibility(0);
                LKUILottieAnimationView lKUILottieAnimationView3 = (LKUILottieAnimationView) mo163292a(R.id.ivBadge);
                Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView3, "ivBadge");
                lKUILottieAnimationView3.setRepeatCount(-1);
                z2 = true;
            } else {
                z2 = false;
            }
            Integer status = minutesSummaryData.getStatus();
            int value = ObjectStatus.RealTimePause.getValue();
            if ((status != null && status.intValue() == value) || minutesSummaryData.getRecordingStatus() == MmRecordManager.RecordState.PAUSED) {
                ((LKUILottieAnimationView) mo163292a(R.id.ivBadge)).pauseAnimation();
            } else if (z2) {
                ((LKUILottieAnimationView) mo163292a(R.id.ivBadge)).playAnimation();
            } else {
                ((LKUILottieAnimationView) mo163292a(R.id.ivBadge)).postDelayed(new RunnableC46463k(this), 1000);
            }
        } else {
            String str3 = this.f116963a;
            C45855f.m181664c(str3, "[showStatus] topic: " + minutesSummaryData.getTopic() + ", token: " + minutesSummaryData.getObjectToken() + ", gone");
            LKUILottieAnimationView lKUILottieAnimationView4 = (LKUILottieAnimationView) mo163292a(R.id.ivBadge);
            Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView4, "ivBadge");
            lKUILottieAnimationView4.setVisibility(8);
            ((LKUILottieAnimationView) mo163292a(R.id.ivBadge)).setTag(R.id.mm_image_view_tag, null);
        }
        String a2 = m183782a(minutesSummaryData.getTopic(), minutesSummaryData.getObjectToken(), minutesSummaryData.getReviewStatus(), minutesSummaryData.getStatus(), minutesSummaryData.getUploadingProgress(), minutesSummaryData.getProcessingProgress(), minutesSummaryData.getProcessingStatus());
        String str4 = a2;
        if (str4 == null || str4.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            BoldTextView boldTextView = (BoldTextView) mo163292a(R.id.tvStatus);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvStatus");
            boldTextView.setVisibility(8);
            return;
        }
        BoldTextView boldTextView2 = (BoldTextView) mo163292a(R.id.tvStatus);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView2, "tvStatus");
        if (boldTextView2.getVisibility() != 0) {
            BoldTextView boldTextView3 = (BoldTextView) mo163292a(R.id.tvStatus);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView3, "tvStatus");
            boldTextView3.setVisibility(0);
        }
        BoldTextView boldTextView4 = (BoldTextView) mo163292a(R.id.tvStatus);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView4, "tvStatus");
        if (!Intrinsics.areEqual(boldTextView4.getText(), a2)) {
            BoldTextView boldTextView5 = (BoldTextView) mo163292a(R.id.tvStatus);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView5, "tvStatus");
            boldTextView5.setText(str4);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.widget.MinutesListItemView$f */
    public static final class DialogInterface$OnClickListenerC46456f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MinutesListItemView f116975a;

        /* renamed from: b */
        final /* synthetic */ String f116976b;

        /* renamed from: c */
        final /* synthetic */ MmListControl.DataSource f116977c;

        /* renamed from: d */
        final /* synthetic */ String f116978d;

        /* renamed from: e */
        final /* synthetic */ Ref.ObjectRef f116979e;

        /* renamed from: f */
        final /* synthetic */ MinutesSummaryData f116980f;

        /* renamed from: g */
        final /* synthetic */ Function0 f116981g;

        DialogInterface$OnClickListenerC46456f(MinutesListItemView minutesListItemView, String str, MmListControl.DataSource dataSource, String str2, Ref.ObjectRef objectRef, MinutesSummaryData minutesSummaryData, Function0 function0) {
            this.f116975a = minutesListItemView;
            this.f116976b = str;
            this.f116977c = dataSource;
            this.f116978d = str2;
            this.f116979e = objectRef;
            this.f116980f = minutesSummaryData;
            this.f116981g = function0;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            MmListControl b = MmListControl.f116817j.mo163013b(this.f116976b);
            if (b != null) {
                b.mo162979a(this.f116977c, this.f116978d, this.f116979e.element, new Function1<String, Unit>(this) {
                    /* class com.ss.android.lark.mm.module.list.widget.MinutesListItemView.DialogInterface$OnClickListenerC46456f.C464571 */
                    final /* synthetic */ DialogInterface$OnClickListenerC46456f this$0;

                    {
                        this.this$0 = r1;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                        invoke(str);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(String str) {
                        boolean z;
                        String str2;
                        Intrinsics.checkParameterIsNotNull(str, "errorMsg");
                        if (str.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            boolean areEqual = Intrinsics.areEqual(this.this$0.f116980f.getTopic(), this.this$0.f116979e.element);
                            C47084f a = C47085h.m186431a(this.this$0.f116980f);
                            C47086i a2 = C47086i.m186432a().mo165422d("header_title_edit").mo165423e("none").mo165414a("is_change", !areEqual);
                            int i = C46466c.f117013e[this.this$0.f116977c.ordinal()];
                            if (i == 1) {
                                str2 = "home_page";
                            } else if (i != 2) {
                                str2 = "";
                            } else {
                                str2 = "my_content";
                            }
                            C47083e.m186425a(a, "vc_minutes_list_click", a2.mo165413a("page_name", str2).mo165421c());
                            this.this$0.f116980f.setTopic(this.this$0.f116979e.element);
                            Function0 function0 = this.this$0.f116981g;
                            if (function0 != null) {
                                Unit unit = (Unit) function0.invoke();
                            }
                            MinutesListItemView minutesListItemView = this.this$0.f116975a;
                            Context context = this.this$0.f116975a.getContext();
                            Intrinsics.checkExpressionValueIsNotNull(context, "context");
                            minutesListItemView.mo163293a(context, this.this$0.f116980f);
                            C45852d a3 = C45852d.m181651a();
                            Intrinsics.checkExpressionValueIsNotNull(a3, "MmControl.of()");
                            a3.mo161151b().mo164268a(this.this$0.f116978d, this.this$0.f116979e.element);
                        }
                        this.this$0.f116975a.mo165848b();
                    }
                });
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MinutesListItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.widget.MinutesListItemView$b */
    public static final class DialogInterface$OnClickListenerC46452b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MinutesSummaryData f116965a;

        DialogInterface$OnClickListenerC46452b(MinutesSummaryData minutesSummaryData) {
            this.f116965a = minutesSummaryData;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            new ListPageClickEvent("cancel", "delete").mo165437a();
            C47083e.m186425a(C47085h.m186431a(this.f116965a), "vc_minutes_delete_click", C47086i.m186432a().mo165422d("cancel").mo165423e("none").mo165421c());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.widget.MinutesListItemView$c */
    public static final class DialogInterface$OnClickListenerC46453c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MinutesListItemView f116966a;

        /* renamed from: b */
        final /* synthetic */ MinutesSummaryData f116967b;

        /* renamed from: c */
        final /* synthetic */ String f116968c;

        /* renamed from: d */
        final /* synthetic */ MmListControl.DataSource f116969d;

        /* renamed from: e */
        final /* synthetic */ String f116970e;

        DialogInterface$OnClickListenerC46453c(MinutesListItemView minutesListItemView, MinutesSummaryData minutesSummaryData, String str, MmListControl.DataSource dataSource, String str2) {
            this.f116966a = minutesListItemView;
            this.f116967b = minutesSummaryData;
            this.f116968c = str;
            this.f116969d = dataSource;
            this.f116970e = str2;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            new ListPageClickEvent("confirm", "delete").mo165437a();
            C47083e.m186425a(C47085h.m186431a(this.f116967b), "vc_minutes_delete_click", C47086i.m186432a().mo165422d("confirm").mo165423e("none").mo165421c());
            MmListControl b = MmListControl.f116817j.mo163013b(this.f116968c);
            if (b != null) {
                Context context = this.f116966a.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                b.mo162975a(context, this.f116969d, this.f116970e, this.f116967b.isOwner());
            }
        }
    }

    /* renamed from: a */
    public final void mo163293a(Context context, MinutesSummaryData minutesSummaryData) {
        boolean z;
        int i;
        if (!ObjectStatus.Companion.mo161607b(minutesSummaryData.getStatus()) || minutesSummaryData.isRecordingType()) {
            z = false;
        } else {
            z = true;
        }
        if (Intrinsics.areEqual((Object) minutesSummaryData.getShowExternalTag(), (Object) false)) {
            BoldTextView boldTextView = (BoldTextView) mo163292a(R.id.tvTopic);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvTopic");
            if (true ^ Intrinsics.areEqual(boldTextView.getText(), minutesSummaryData.getTopic())) {
                BoldTextView boldTextView2 = (BoldTextView) mo163292a(R.id.tvTopic);
                Intrinsics.checkExpressionValueIsNotNull(boldTextView2, "tvTopic");
                boldTextView2.setText(minutesSummaryData.getTopic());
            }
            BoldTextView boldTextView3 = (BoldTextView) mo163292a(R.id.tvTopic);
            if (z) {
                i = UDColorUtils.getColor(context, R.color.text_placeholder);
            } else {
                i = UDColorUtils.getColor(context, R.color.text_title);
            }
            boldTextView3.setTextColor(i);
            return;
        }
        ((BoldTextView) mo163292a(R.id.tvTopic)).post(new RunnableC46459h(this, context, minutesSummaryData, z));
    }

    /* renamed from: b */
    private final void m183785b(MmListControl.DataSource dataSource, MinutesSummaryData minutesSummaryData, String str) {
        RelativeLayout relativeLayout = (RelativeLayout) mo163292a(R.id.item);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "item");
        C47110e.m186573a(relativeLayout, new C46454d(this, minutesSummaryData, dataSource, str));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MinutesListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f116963a = "MinutesListItemView";
        m183790d();
    }

    /* renamed from: c */
    private final void m183787c(MmListControl.DataSource dataSource, MinutesSummaryData minutesSummaryData, String str) {
        MmListItemMenuHelper eVar = MmListItemMenuHelper.f117032a;
        TextView textView = (TextView) mo163292a(R.id.menuLeft);
        Intrinsics.checkExpressionValueIsNotNull(textView, "menuLeft");
        TextView textView2 = (TextView) mo163292a(R.id.menuRight);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "menuRight");
        eVar.mo163335a(dataSource, minutesSummaryData, textView, textView2, new C46461j(this, dataSource, str));
    }

    /* renamed from: a */
    private final Integer m183780a(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4) {
        String str3;
        Integer valueOf = Integer.valueOf((int) R.drawable.mm_ic_list_badge_processing);
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == ReviewStatus.NoAuth.getValue() || intValue == ReviewStatus.AppealFailed.getValue()) {
                String str4 = this.f116963a;
                C45855f.m181663b(str4, "[getStatusBadge] topic: " + str + ", token: " + str2 + ", status: " + num2 + ", icon: mm_ic_list_badge_noauth");
                return Integer.valueOf((int) R.drawable.mm_ic_list_badge_noauth);
            } else if (intValue == ReviewStatus.ToAppeal.getValue()) {
                String str5 = this.f116963a;
                C45855f.m181663b(str5, "[getStatusBadge] topic: " + str + ", token: " + str2 + ", status: " + num2 + ", icon: mm_ic_list_badge_processing");
                return valueOf;
            }
        }
        int value = ObjectStatus.Complete.getValue();
        if (num2 != null && value == num2.intValue()) {
            return null;
        }
        if (ObjectStatus.Companion.mo161608c(num2)) {
            MmRecordManager.Companion aVar = MmRecordManager.f117918g;
            if (str2 != null) {
                str3 = str2;
            } else {
                str3 = "";
            }
            int i = C46466c.f117012d[aVar.mo164546a(str3).ordinal()];
            if (i == 1) {
                String str6 = this.f116963a;
                C45855f.m181664c(str6, "[getStatusBadge] topic: " + str + ", token: " + str2 + ", status: " + num2 + ", icon: mm_ic_list_badge_uploading");
                return Integer.valueOf((int) R.drawable.mm_ic_list_badge_uploading);
            } else if (i == 2 || i == 3 || i == 4) {
                String str7 = this.f116963a;
                C45855f.m181663b(str7, "[getStatusBadge] topic: " + str + ", token: " + str2 + ", status: " + num2 + ", icon: null");
                return null;
            } else if (ObjectStatus.Companion.mo161611f(num2)) {
                String str8 = this.f116963a;
                C45855f.m181663b(str8, "[getStatusBadge] topic: " + str + ", token: " + str2 + ", status: " + num2 + ", icon: mm_ic_list_badge_uploading2");
                return Integer.valueOf((int) R.drawable.mm_ic_list_badge_uploading);
            }
        }
        if (!ObjectStatus.Companion.mo161607b(num4)) {
            int value2 = ObjectStatus.WaitASR.getValue();
            if (num4 == null || num4.intValue() != value2) {
                int value3 = ObjectStatus.WaitASR.getValue();
                if (num2 != null && num2.intValue() == value3) {
                    String str9 = this.f116963a;
                    C45855f.m181663b(str9, "[getStatusBadge] topic: " + str + ", token: " + str2 + ", status: " + num2 + ", icon: mm_ic_list_badge_processing3");
                    return valueOf;
                }
                int value4 = ObjectStatus.Failed.getValue();
                if (num2 == null || num2.intValue() != value4) {
                    int value5 = ObjectStatus.FileCorrupted.getValue();
                    if (num2 == null || num2.intValue() != value5) {
                        return null;
                    }
                }
                String str10 = this.f116963a;
                C45855f.m181663b(str10, "[getStatusBadge] topic: " + str + ", token: " + str2 + ", status: " + num2 + ", icon: mm_ic_list_badge_failed");
                return Integer.valueOf((int) R.drawable.mm_ic_list_badge_failed);
            }
        }
        String str11 = this.f116963a;
        C45855f.m181663b(str11, "[getStatusBadge] topic: " + str + ", token: " + str2 + ", status: " + num2 + ", icon: mm_ic_list_badge_processing2");
        return valueOf;
    }

    /* renamed from: a */
    private final String m183782a(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        boolean z;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == ReviewStatus.NoAuth.getValue() || intValue == ReviewStatus.AppealFailed.getValue()) {
                String str3 = this.f116963a;
                C45855f.m181664c(str3, "[getStatusText] topic: " + str + ", token: " + str2 + ", noAuth or AppealFailed");
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                return context.getResources().getString(R.string.MMWeb_G_ReviewFailed);
            } else if (intValue == ReviewStatus.ToAppeal.getValue()) {
                String str4 = this.f116963a;
                C45855f.m181664c(str4, "[getStatusText] topic: " + str + ", token: " + str2 + ", toAppeal");
                Context context2 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                return context2.getResources().getString(R.string.MMWeb_G_UnderReview);
            }
        }
        int value = ObjectStatus.Complete.getValue();
        String str5 = "";
        if (num2 != null && value == num2.intValue()) {
            return str5;
        }
        if (ObjectStatus.Companion.mo161608c(num2)) {
            MmRecordManager.Companion aVar = MmRecordManager.f117918g;
            if (str2 != null) {
                str5 = str2;
            }
            if (aVar.mo164546a(str5) == MmRecordManager.RecordState.STOPPED) {
                z = true;
            } else {
                z = false;
            }
            if (z || ObjectStatus.Companion.mo161611f(num2)) {
                String str6 = this.f116963a;
                C45855f.m181664c(str6, "[getStatusText] topic: " + str + ", token: " + str2 + ", getUploadingText, uploadingProgress:" + num3 + ", isStopped: " + z);
                return m183781a(num3);
            }
            String str7 = this.f116963a;
            C45855f.m181664c(str7, "[getStatusText]topic: " + str + ", token: " + str2 + ", recording");
            return ResString.f118656a.mo165504a(R.string.MMWeb_G_Recording);
        } else if (ObjectStatus.Companion.mo161607b(num5)) {
            String str8 = this.f116963a;
            C45855f.m181664c(str8, "[getStatusText] topic: " + str + ", token: " + str2 + ", processing, processProgress:" + num4);
            Context context3 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            String string = context3.getResources().getString(R.string.MMWeb_G_Processing);
            if (num4 != null) {
                return string + num4 + '%';
            }
            return string + "0%";
        } else {
            int value2 = ObjectStatus.WaitASR.getValue();
            if (num5 != null && num5.intValue() == value2) {
                String str9 = this.f116963a;
                C45855f.m181664c(str9, "[getStatusText] topic: " + str + ", token: " + str2 + ", TranscriptionInProgress, processProgress:" + num4);
                Context context4 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context4, "context");
                String string2 = context4.getResources().getString(R.string.MMWeb_G_TranscriptionInProgress);
                if (num4 != null) {
                    return string2 + num4 + '%';
                }
                return string2 + "0%";
            }
            int value3 = ObjectStatus.WaitASR.getValue();
            if (num2 != null && num2.intValue() == value3) {
                String str10 = this.f116963a;
                C45855f.m181664c(str10, "[getStatusText] topic: " + str + ", token: " + str2 + ", WaitASR");
                Context context5 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context5, "context");
                return context5.getResources().getString(R.string.MMWeb_G_TranscriptionInProgress);
            }
            int value4 = ObjectStatus.Failed.getValue();
            if (num2 == null || num2.intValue() != value4) {
                int value5 = ObjectStatus.FileCorrupted.getValue();
                if (num2 == null || num2.intValue() != value5) {
                    int value6 = ObjectStatus.RealTimeRecording.getValue();
                    if (num2 == null || num2.intValue() != value6) {
                        return str5;
                    }
                    String str11 = this.f116963a;
                    C45855f.m181664c(str11, "[getStatusText] topic: " + str + ", token: " + str2 + ", RealTimeRecording");
                    Context context6 = getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context6, "context");
                    return context6.getResources().getString(R.string.MMWeb_G_Recording);
                }
            }
            String str12 = this.f116963a;
            C45855f.m181664c(str12, "[getStatusText] topic: " + str + ", token: " + str2 + ", FileCorrupted");
            Context context7 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context7, "context");
            return context7.getResources().getString(R.string.MMWeb_G_Failed);
        }
    }
}
