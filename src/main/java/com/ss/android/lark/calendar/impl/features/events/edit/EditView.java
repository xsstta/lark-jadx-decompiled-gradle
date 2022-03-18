package com.ss.android.lark.calendar.impl.features.events.edit;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.calendar.v1.LevelRelatedInfo;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.features.events.edit.EditPresenter;
import com.ss.android.lark.calendar.impl.features.events.edit.IEditContract;
import com.ss.android.lark.calendar.impl.features.events.edit.data.BuildingFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.DescriptionSaveData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.MeetingRoomFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.ReminderFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseCalendarFragment;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseColorFragment;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseCustomRepeatFragment;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseMeetingRoomFragment;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseReminderFragment;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseRepeatEndFragment;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseRepeatFragment;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseStatusFragment;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseVisibilityFragment;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.EditAttendeeFragment;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.EditDescriptionFragment;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.EditMultiTimeFragment;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.ResourceExpandFragment;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingFragment;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.videomeeting.EventVideoMeetingFragment;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.EditAttendeeHelper;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener;
import com.ss.android.lark.calendar.impl.features.events.edit.part.EditCalendarPart;
import com.ss.android.lark.calendar.impl.features.events.edit.part.EditEventUIVisible;
import com.ss.android.lark.calendar.impl.features.events.edit.part.MeetingRoomLimitData;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.ControlChildViewClickableLayout;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.ResourceAppendFragment;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.AppendResourceData;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.MeetingRoomFormFragment;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoVideoMeeting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SimpleMember;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.VideoMeeting;
import com.ss.android.lark.calendar.impl.rustadapter.parser.ModelDataParserCalendar;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32669t;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.EventRecurrence;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.DialogC57586c;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0015\u0010\u0013&-03EHKPS]`cfiux\u0001\u0018\u0000 ä\u00012\u00020\u0001:\u0004ä\u0001å\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020VH\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\t\u0010\u0001\u001a\u00020)H\u0016J\u0014\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0014\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0014\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\u001c\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020}2\u0007\u0010\u0001\u001a\u00020{H\u0016J\u0014\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002JB\u0010 \u0001\u001a\u00030\u00012\b\u0010¡\u0001\u001a\u00030\u00012\b\u0010¢\u0001\u001a\u00030£\u00012\u0007\u0010¤\u0001\u001a\u00020V2\u0007\u0010¥\u0001\u001a\u00020V2\u0007\u0010¦\u0001\u001a\u00020V2\u0007\u0010§\u0001\u001a\u00020VH\u0016J\u0014\u0010¨\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0014\u0010©\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0014\u0010ª\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0014\u0010«\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0014\u0010¬\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0014\u0010­\u0001\u001a\u00030\u00012\b\u0010®\u0001\u001a\u00030\u0001H\u0016J\u0014\u0010¯\u0001\u001a\u00030\u00012\b\u0010°\u0001\u001a\u00030\u0001H\u0016J\u0014\u0010±\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J1\u0010²\u0001\u001a\u00030\u00012\u001b\u0010³\u0001\u001a\u0016\u0012\u0005\u0012\u00030µ\u00010´\u0001j\n\u0012\u0005\u0012\u00030µ\u0001`¶\u00012\b\u0010·\u0001\u001a\u00030\u0001H\u0016J\u0014\u0010¸\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0014\u0010¹\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0014\u0010º\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010»\u0001\u001a\u00030\u0001H\u0016J\u0014\u0010¼\u0001\u001a\u00030\u00012\b\u0010½\u0001\u001a\u00030¾\u0001H\u0016JA\u0010¿\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\n\u0010À\u0001\u001a\u0005\u0018\u00010Á\u00012\u0007\u0010Â\u0001\u001a\u00020V2\n\b\u0002\u0010Ã\u0001\u001a\u00030\u00012\n\b\u0002\u0010Ä\u0001\u001a\u00030\u0001H\u0002J\u001e\u0010Å\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016J1\u0010Æ\u0001\u001a\u00030\u00012\b\u0010Ç\u0001\u001a\u00030È\u00012\b\u0010É\u0001\u001a\u00030È\u00012\u0007\u0010Ê\u0001\u001a\u00020V2\b\u0010Ë\u0001\u001a\u00030µ\u0001H\u0016J\u001e\u0010Ì\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010Í\u0001\u001a\u00030Î\u0001H\u0016J\u0014\u0010Ï\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010Ð\u0001\u001a\u00030\u00012\u0007\u0010Ñ\u0001\u001a\u00020VH\u0002J\u0014\u0010Ò\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0014\u0010Ó\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0014\u0010Ô\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0014\u0010Õ\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016J(\u0010Ö\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010×\u0001\u001a\u00030µ\u00012\b\u0010Ø\u0001\u001a\u00030Ù\u0001H\u0016J\u0014\u0010Ú\u0001\u001a\u00030\u00012\b\u0010Û\u0001\u001a\u00030Ü\u0001H\u0016J\u0014\u0010Ý\u0001\u001a\u00030\u00012\b\u0010Þ\u0001\u001a\u00030\u0001H\u0016J\n\u0010ß\u0001\u001a\u00030\u0001H\u0016J\n\u0010à\u0001\u001a\u00030\u0001H\u0002J2\u0010á\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010×\u0001\u001a\u00030µ\u00012\b\u0010Ø\u0001\u001a\u00030Ù\u00012\b\u0010â\u0001\u001a\u00030ã\u0001H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0010\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u00020&X\u0004¢\u0006\u0004\n\u0002\u0010'R\u000e\u0010(\u001a\u00020)X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u00020-X\u0004¢\u0006\u0004\n\u0002\u0010.R\u0010\u0010/\u001a\u000200X\u0004¢\u0006\u0004\n\u0002\u00101R\u0010\u00102\u001a\u000203X\u0004¢\u0006\u0004\n\u0002\u00104R\u000e\u00105\u001a\u000206X.¢\u0006\u0002\n\u0000R\u001b\u00107\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b8\u0010\nR\u000e\u0010;\u001a\u00020<X.¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020<X.¢\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010CX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u00020EX\u0004¢\u0006\u0004\n\u0002\u0010FR\u0010\u0010G\u001a\u00020HX\u0004¢\u0006\u0004\n\u0002\u0010IR\u0010\u0010J\u001a\u00020KX\u0004¢\u0006\u0004\n\u0002\u0010LR\u0010\u0010M\u001a\u0004\u0018\u00010NX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010O\u001a\u00020PX\u0004¢\u0006\u0004\n\u0002\u0010QR\u0010\u0010R\u001a\u00020SX\u0004¢\u0006\u0004\n\u0002\u0010TR\u000e\u0010U\u001a\u00020VX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020VX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010X\u001a\u0004\u0018\u00010YX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010Z\u001a\u0004\u0018\u00010[X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\\\u001a\u00020]X\u0004¢\u0006\u0004\n\u0002\u0010^R\u0010\u0010_\u001a\u00020`X\u0004¢\u0006\u0004\n\u0002\u0010aR\u0010\u0010b\u001a\u00020cX\u0004¢\u0006\u0004\n\u0002\u0010dR\u0010\u0010e\u001a\u00020fX\u0004¢\u0006\u0004\n\u0002\u0010gR\u0010\u0010h\u001a\u00020iX\u0004¢\u0006\u0004\n\u0002\u0010jR\u0010\u0010k\u001a\u0004\u0018\u00010lX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010m\u001a\u0004\u0018\u00010nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0003X.¢\u0006\u0002\n\u0000R\u0010\u0010p\u001a\u0004\u0018\u00010qX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020<X.¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020<X.¢\u0006\u0002\n\u0000R\u0010\u0010t\u001a\u00020uX\u0004¢\u0006\u0004\n\u0002\u0010vR\u0010\u0010w\u001a\u00020xX\u0004¢\u0006\u0004\n\u0002\u0010yR\u000e\u0010z\u001a\u00020{X.¢\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020}X.¢\u0006\u0002\n\u0000R\u0011\u0010~\u001a\u00020X\u0004¢\u0006\u0005\n\u0003\u0010\u0001R\u0013\u0010\u0001\u001a\u00030\u0001X\u0004¢\u0006\u0005\n\u0003\u0010\u0001¨\u0006æ\u0001"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$IEditViewApi;", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "actionWrapper", "Lcom/ss/android/lark/calendar/impl/utils/IgnoreFastActionWrapper;", "currentAction", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "getCurrentAction", "()Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "setCurrentAction", "(Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;)V", "mBuildingFragment", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingFragment;", "mBuildingFragmentAction", "com/ss/android/lark/calendar/impl/features/events/edit/EditView$mBuildingFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$mBuildingFragmentAction$1;", "mBuildingFragmentAction2", "com/ss/android/lark/calendar/impl/features/events/edit/EditView$mBuildingFragmentAction2$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$mBuildingFragmentAction2$1;", "mChooseCalendarFragment", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseCalendarFragment;", "mChooseColorFragment", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseColorFragment;", "mChooseCustomRepeatFragment", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseCustomRepeatFragment;", "mChooseReminderFragment", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseReminderFragment;", "mChooseRepeatEndFragment", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseRepeatEndFragment;", "mChooseRepeatFragment", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseRepeatFragment;", "mChooseStatusFragment", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseStatusFragment;", "mChooseVisibilityFragment", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseVisibilityFragment;", "mColorFragmentAction", "com/ss/android/lark/calendar/impl/features/events/edit/EditView$mColorFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$mColorFragmentAction$1;", "mContext", "Landroid/content/Context;", "mCurrentFragment", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "mCustomRepeatFragmentAction", "com/ss/android/lark/calendar/impl/features/events/edit/EditView$mCustomRepeatFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$mCustomRepeatFragmentAction$1;", "mDescriptionFragmentAction", "com/ss/android/lark/calendar/impl/features/events/edit/EditView$mDescriptionFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$mDescriptionFragmentAction$1;", "mDetailListener", "com/ss/android/lark/calendar/impl/features/events/edit/EditView$mDetailListener$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$mDetailListener$1;", "mDinaIternateBold", "Landroid/graphics/Typeface;", "mDisableFinishBtnAction", "getMDisableFinishBtnAction", "mDisableFinishBtnAction$delegate", "Lkotlin/Lazy;", "mDismissEventContentAnimation", "Landroid/view/animation/Animation;", "mDismissFragmentAnimation", "mEditAttendeeFragment", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment;", "mEditDescriptionFragment", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditDescriptionFragment;", "mEditMultiTimeFragment", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditMultiTimeFragment;", "mEditResourceExpandFragmentAction", "com/ss/android/lark/calendar/impl/features/events/edit/EditView$mEditResourceExpandFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$mEditResourceExpandFragmentAction$1;", "mEventAttendeeAction", "com/ss/android/lark/calendar/impl/features/events/edit/EditView$mEventAttendeeAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$mEventAttendeeAction$1;", "mEventCalendarAction", "com/ss/android/lark/calendar/impl/features/events/edit/EditView$mEventCalendarAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$mEventCalendarAction$1;", "mEventVideoMeetingFragment", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/videomeeting/EventVideoMeetingFragment;", "mEventVideoMeetingFragmentAction", "com/ss/android/lark/calendar/impl/features/events/edit/EditView$mEventVideoMeetingFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$mEventVideoMeetingFragmentAction$1;", "mFinishBtnAction", "com/ss/android/lark/calendar/impl/features/events/edit/EditView$mFinishBtnAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$mFinishBtnAction$1;", "mIsChosenStartTime", "", "mIsShowUsableBoardroom", "mMeetingRoomFormFragment", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/MeetingRoomFormFragment;", "mMeetingRoomFragment", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseMeetingRoomFragment;", "mMeetingRoomFragmentAction", "com/ss/android/lark/calendar/impl/features/events/edit/EditView$mMeetingRoomFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$mMeetingRoomFragmentAction$1;", "mMultiEventTimeAction", "com/ss/android/lark/calendar/impl/features/events/edit/EditView$mMultiEventTimeAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$mMultiEventTimeAction$1;", "mReminderFragmentAction", "com/ss/android/lark/calendar/impl/features/events/edit/EditView$mReminderFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$mReminderFragmentAction$1;", "mRepeatEndFragmentAction", "com/ss/android/lark/calendar/impl/features/events/edit/EditView$mRepeatEndFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$mRepeatEndFragmentAction$1;", "mRepeatFragmentAction", "com/ss/android/lark/calendar/impl/features/events/edit/EditView$mRepeatFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$mRepeatFragmentAction$1;", "mResourceAppendFragment", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/ResourceAppendFragment;", "mResourceExpandFragment", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/ResourceExpandFragment;", "mRootView", "mSaveSwitchDialog", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "mShowEventContentAnimation", "mShowFragmentAnimation", "mStatusFragmentAction", "com/ss/android/lark/calendar/impl/features/events/edit/EditView$mStatusFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$mStatusFragmentAction$1;", "mUsableFinishBtnAction", "com/ss/android/lark/calendar/impl/features/events/edit/EditView$mUsableFinishBtnAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$mUsableFinishBtnAction$1;", "mViewAction", "Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$IEditViewAction;", "mViewData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$IEditViewData;", "mVisibilityFragmentAction", "com/ss/android/lark/calendar/impl/features/events/edit/EditView$mVisibilityFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$mVisibilityFragmentAction$1;", "meetingRoomFormFragmentAction", "com/ss/android/lark/calendar/impl/features/events/edit/EditView$meetingRoomFormFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$meetingRoomFormFragmentAction$1;", "closeSwitchSaveLoading", "", "isSuccess", "create", "destroy", "focusOnSummary", "getContext", "hideCurrentFragment", "mActivityDependency", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditPresenter$ActivityDependency;", "hideFragment", "featureId", "", "hideResourceExpandFragment", "activityDependency", "initAnimation", "initClickCallback", "initFont", "initTitleBar", "pressBack", "refreshCalendarList", "refreshCurrentFragment", "refreshEditView", "refreshTimeFragment", "setDependency", "viewData", "viewAction", "showBuildingFragment", "showCalendarSwitchDialog", "currentIndex", "changeType", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditCalendarPart$CHANGE_TYPE;", "changedMeetingRoom", "changedAttendee", "changedReminder", "changedRepeat", "showChooseCalendarFragment", "showChooseMultiTimeFragment", "showCustomRepeatFragment", "showDescriptionFragment", "showEditAttendeeFragment", "showErrorDialogWithMsg", "errorMsgId", "showEventAttendeeOutnumberAlert", "maxAttendeeNum", "showEventColorFragment", "showEventDepartmentAttendeeOutAlert", "departmentNames", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "maxDepartmentAttendeeNum", "showEventStatusFragment", "showEventVideoFragment", "showEventVisibilityFragment", "showExceedLimitMeetingGroupDialog", "showFinishBtn", ShareHitPoint.f121869d, "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$SaveType;", "showFragment", "fragment", "Landroidx/fragment/app/Fragment;", "isFirstAdd", "enterAnimation", "outAnimation", "showFragmentByFeatureId", "showMeetingRoomApprovalDialog", "startTime", "", "endTime", "allDay", "timeZoneId", "showMeetingRoomFragment", "meetingRoomFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/MeetingRoomFragmentData;", "showReminderFragment", "showRepeatContainerData", "isCreateOrEditable", "showRepeatEndFragment", "showRepeatFragment", "showResourceAppendFragment", "showResourceExpandFragment", "showResourceFormFragment", "calendarId", "resourceCustomization", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "showSwitchSaveLoading", "activity", "Landroid/app/Activity;", "showToast", "stringId", "showUnSaveChangeDialog", "startShowFragmentAnimation", "startShowResourceFormFragment", "action", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/MeetingRoomFormFragment$MeetingRoomFormFragmentAction;", "Companion", "SaveType", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EditView implements IEditContract.IEditViewApi {

    /* renamed from: j */
    public static final Companion f79847j = new Companion(null);

    /* renamed from: A */
    private EventVideoMeetingFragment f79848A;

    /* renamed from: B */
    private MeetingRoomFormFragment f79849B;

    /* renamed from: C */
    private ResourceExpandFragment f79850C;

    /* renamed from: D */
    private ResourceAppendFragment f79851D;

    /* renamed from: E */
    private Typeface f79852E;

    /* renamed from: F */
    private final C31523o f79853F = new C31523o(this, C32634ae.m125182b(R.string.Calendar_Common_Save), R.color.primary_pri_500);

    /* renamed from: G */
    private final C31529u f79854G = new C31529u(C32634ae.m125182b(R.string.Calendar_Common_Save), R.color.text_placeholder);

    /* renamed from: H */
    private final Lazy f79855H = LazyKt.lazy(C31518k.INSTANCE);

    /* renamed from: I */
    private final C31517j f79856I = new C31517j(this);

    /* renamed from: J */
    private final C31525q f79857J = new C31525q(this);

    /* renamed from: K */
    private final C31521m f79858K = new C31521m(this);

    /* renamed from: L */
    private final EditView$mEventCalendarAction$1 f79859L = new EditView$mEventCalendarAction$1(this);

    /* renamed from: M */
    private final EditView$mColorFragmentAction$1 f79860M = new EditView$mColorFragmentAction$1(this);

    /* renamed from: N */
    private final C31528t f79861N = new C31528t(this);

    /* renamed from: O */
    private final C31530v f79862O = new C31530v(this);

    /* renamed from: P */
    private final C31526r f79863P = new C31526r(this);

    /* renamed from: Q */
    private final C31514g f79864Q = new C31514g(this);

    /* renamed from: R */
    private final C31513f f79865R = new C31513f(this);

    /* renamed from: S */
    private final C31524p f79866S = new C31524p(this);

    /* renamed from: T */
    private final EditView$mRepeatFragmentAction$1 f79867T = new EditView$mRepeatFragmentAction$1(this);

    /* renamed from: U */
    private final C31515h f79868U = new C31515h(this);

    /* renamed from: V */
    private final C31527s f79869V = new C31527s(this);

    /* renamed from: W */
    private final C31516i f79870W = new C31516i(this);

    /* renamed from: X */
    private final C31522n f79871X = new C31522n(this);

    /* renamed from: Y */
    private final C31520l f79872Y = new C31520l(this);

    /* renamed from: Z */
    private final C31531w f79873Z = new C31531w(this);

    /* renamed from: a */
    public View f79874a;
    private AbstractC32629e aa;
    private RequestLoadingDialog ab;

    /* renamed from: b */
    public IEditContract.IEditViewData f79875b;

    /* renamed from: c */
    public IEditContract.IEditViewAction f79876c;

    /* renamed from: d */
    public Animation f79877d;

    /* renamed from: e */
    public ChooseMeetingRoomFragment f79878e;

    /* renamed from: f */
    public ChooseCustomRepeatFragment f79879f;

    /* renamed from: g */
    public boolean f79880g = true;

    /* renamed from: h */
    public boolean f79881h = true;

    /* renamed from: i */
    public final C32669t f79882i = new C32669t(new RunnableC31509b(this));

    /* renamed from: k */
    private Context f79883k;

    /* renamed from: l */
    private Animation f79884l;

    /* renamed from: m */
    private Animation f79885m;

    /* renamed from: n */
    private Animation f79886n;

    /* renamed from: o */
    private View$OnClickListenerC31538b f79887o;

    /* renamed from: p */
    private EditMultiTimeFragment f79888p;

    /* renamed from: q */
    private EditAttendeeFragment f79889q;

    /* renamed from: r */
    private ChooseCalendarFragment f79890r;

    /* renamed from: s */
    private ChooseColorFragment f79891s;

    /* renamed from: t */
    private ChooseStatusFragment f79892t;

    /* renamed from: u */
    private ChooseVisibilityFragment f79893u;

    /* renamed from: v */
    private ChooseReminderFragment f79894v;

    /* renamed from: w */
    private BuildingFragment f79895w;

    /* renamed from: x */
    private ChooseRepeatFragment f79896x;

    /* renamed from: y */
    private ChooseRepeatEndFragment f79897y;

    /* renamed from: z */
    private EditDescriptionFragment f79898z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$SaveType;", "", "(Ljava/lang/String;I)V", "ENABLE_SAVE", "DISABLE_SAVE_WITH_TOAST", "DISABLE_SAVE_TOTALLY", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum SaveType {
        ENABLE_SAVE,
        DISABLE_SAVE_WITH_TOAST,
        DISABLE_SAVE_TOTALLY
    }

    /* renamed from: k */
    private final AbstractC32629e m118553k() {
        return (AbstractC32629e) this.f79855H.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewApi
    /* renamed from: e */
    public Context mo114333e() {
        return this.f79883k;
    }

    /* renamed from: a */
    public void mo109795a(IEditContract.IEditViewData eVar, IEditContract.IEditViewAction cVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "viewData");
        Intrinsics.checkParameterIsNotNull(cVar, "viewAction");
        this.f79875b = eVar;
        this.f79876c = cVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewApi
    /* renamed from: a */
    public void mo114321a(EditPresenter.ActivityDependency aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "activityDependency");
        switch (i) {
            case 2:
                m118544c(aVar);
                return;
            case 3:
            case 5:
            case 11:
            case HwBuildEx.VersionCodes.EMUI_5_1:
            case 18:
            default:
                return;
            case 4:
                m118546d(aVar);
                return;
            case 6:
                m118547e(aVar);
                return;
            case 7:
                m118548f(aVar);
                return;
            case 8:
                m118550h(aVar);
                return;
            case 9:
                m118549g(aVar);
                return;
            case 10:
                m118552j(aVar);
                return;
            case 13:
                m118551i(aVar);
                return;
            case 14:
                m118556l(aVar);
                return;
            case 15:
                m118558m(aVar);
                return;
            case 16:
                m118560n(aVar);
                return;
            case 17:
                m118562o(aVar);
                return;
            case 19:
                m118563p(aVar);
                return;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewApi
    /* renamed from: a */
    public void mo114322a(EditPresenter.ActivityDependency aVar, MeetingRoomFragmentData meetingRoomFragmentData) {
        Intrinsics.checkParameterIsNotNull(aVar, "activityDependency");
        Intrinsics.checkParameterIsNotNull(meetingRoomFragmentData, "meetingRoomFragmentData");
        IEditContract.IEditViewAction cVar = this.f79876c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        cVar.mo114515a(this.f79895w);
        ChooseMeetingRoomFragment bVar = this.f79878e;
        boolean z = bVar == null;
        if (bVar != null) {
            bVar.mo115284a(meetingRoomFragmentData);
        } else {
            this.f79878e = new ChooseMeetingRoomFragment(this.f79866S, meetingRoomFragmentData);
        }
        m118538a(this, aVar, this.f79878e, z, 0, 0, 24, null);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewApi
    /* renamed from: a */
    public void mo114323a(EditPresenter.ActivityDependency aVar, String str, SchemaExtraData.ResourceCustomization resourceCustomization) {
        Intrinsics.checkParameterIsNotNull(aVar, "activityDependency");
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(resourceCustomization, "resourceCustomization");
        IEditContract.IEditViewAction cVar = this.f79876c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        cVar.mo114535d();
        View view = this.f79874a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.event_feature_fragment_container);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mRootView.event_feature_fragment_container");
        frameLayout.setVisibility(0);
        m118540a(aVar, str, resourceCustomization, this.f79873Z);
        mo114314a();
        GeneralHitPoint.f83331a.mo118716C("add_meeting_info");
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewApi
    /* renamed from: a */
    public void mo114320a(EditPresenter.ActivityDependency aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "activityDependency");
        IEditContract.IEditViewAction cVar = this.f79876c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        cVar.mo114535d();
        View view = this.f79874a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.event_feature_fragment_container);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mRootView.event_feature_fragment_container");
        frameLayout.setVisibility(0);
        ResourceExpandFragment aVar2 = this.f79850C;
        boolean z = aVar2 == null;
        if (aVar2 != null) {
            IEditContract.IEditViewData eVar = this.f79875b;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            aVar2.mo115331a(eVar.mo114564S());
        } else {
            IEditContract.IEditViewData eVar2 = this.f79875b;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            this.f79850C = new ResourceExpandFragment(eVar2.mo114564S(), this.f79872Y, this.f79856I);
        }
        m118539a(aVar, this.f79850C, z, R.anim.slide_right_left, R.anim.slide_left_right);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewApi
    /* renamed from: a */
    public void mo114324a(ArrayList<String> arrayList, int i) {
        Intrinsics.checkParameterIsNotNull(arrayList, "departmentNames");
        String join = TextUtils.join(C32634ae.m125182b(R.string.Calendar_Common_Comma), arrayList);
        UDDialogBuilder eVar = new UDDialogBuilder(this.f79883k);
        String a = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Edit_AddOrganizationMaxNum, "number", String.valueOf(i));
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDependencyHolder…ntAttendeeNum.toString())");
        Intrinsics.checkExpressionValueIsNotNull(join, "namesStr");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(a)).titleLineCount(2)).message(join)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_GotIt, (DialogInterface.OnClickListener) null)).show();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewApi
    /* renamed from: a */
    public void mo114325a(boolean z) {
        RequestLoadingDialog requestLoadingDialog = this.ab;
        if (requestLoadingDialog != null) {
            if (z) {
                requestLoadingDialog.dismiss();
            } else {
                requestLoadingDialog.mo112586a(R.string.Calendar_Toast_FailedToTransferEventToCalendar, 2000);
            }
            this.ab = null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditView$mBuildingFragmentAction2$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/ResourceAppendFragment$IBuildingFragmentAction;", "cachePbMultiLevelData", "", "pbMultiLevelData", "", "", "Lcom/bytedance/lark/pb/calendar/v1/LevelRelatedInfo;", "onBackPressed", "onMeetingRoomInfoClicked", "resourceCalendarId", "selectMeetingRoom", "resourceList", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/AppendResourceData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$g */
    public static final class C31514g implements ResourceAppendFragment.IBuildingFragmentAction {

        /* renamed from: a */
        final /* synthetic */ EditView f79904a;

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.ResourceAppendFragment.IBuildingFragmentAction
        /* renamed from: a */
        public void mo114351a() {
            this.f79904a.mo114315a(10);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31514g(EditView editView) {
            this.f79904a = editView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.ResourceAppendFragment.IBuildingFragmentAction
        /* renamed from: a */
        public void mo114352a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "resourceCalendarId");
            EditView.m118541b(this.f79904a).mo114530b(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.ResourceAppendFragment.IBuildingFragmentAction
        /* renamed from: a */
        public void mo114353a(List<AppendResourceData> list) {
            Intrinsics.checkParameterIsNotNull(list, "resourceList");
            this.f79904a.mo114315a(10);
            EditView.m118541b(this.f79904a).mo114532b(EditAttendeeHelper.f79930a.mo114610a(list));
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.ResourceAppendFragment.IBuildingFragmentAction
        /* renamed from: a */
        public void mo114354a(Map<String, LevelRelatedInfo> map) {
            Intrinsics.checkParameterIsNotNull(map, "pbMultiLevelData");
            EditView.m118543c(this.f79904a).mo114570a(map);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditView$mDescriptionFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditDescriptionFragment$DescriptionFragmentAction;", "onBackPressed", "", "onSavePressed", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/DescriptionSaveData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$i */
    public static final class C31516i implements EditDescriptionFragment.DescriptionFragmentAction {

        /* renamed from: a */
        final /* synthetic */ EditView f79906a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.EditDescriptionFragment.DescriptionFragmentAction
        /* renamed from: a */
        public void mo114357a() {
            this.f79906a.mo114315a(17);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31516i(EditView editView) {
            this.f79906a = editView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.EditDescriptionFragment.DescriptionFragmentAction
        /* renamed from: a */
        public void mo114358a(DescriptionSaveData aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f79906a.mo114315a(17);
            EditView.m118541b(this.f79906a).mo114517a(aVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditView$mEditResourceExpandFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/ResourceExpandFragment$EditResourceExpandFragmentAction;", "onBackPressed", "", "onResourceFormSavePressed", "calendarId", "", "resourceCustomization", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$l */
    public static final class C31520l implements ResourceExpandFragment.EditResourceExpandFragmentAction {

        /* renamed from: a */
        final /* synthetic */ EditView f79908a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.ResourceExpandFragment.EditResourceExpandFragmentAction
        /* renamed from: a */
        public void mo114373a() {
            this.f79908a.mo114315a(0);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31520l(EditView editView) {
            this.f79908a = editView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.ResourceExpandFragment.EditResourceExpandFragmentAction
        /* renamed from: a */
        public void mo114374a(String str, SchemaExtraData.ResourceCustomization resourceCustomization) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            Intrinsics.checkParameterIsNotNull(resourceCustomization, "resourceCustomization");
            EditView.m118541b(this.f79908a).mo114531b(str, resourceCustomization);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditView$mEventAttendeeAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$AttendeeFragmentAction;", "getEventSimpleMap", "", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SimpleMember;", "onBackPressed", "", "onSavePressed", "displayAttendees", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "Lkotlin/collections/ArrayList;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$m */
    public static final class C31521m implements EditAttendeeFragment.AttendeeFragmentAction {

        /* renamed from: a */
        final /* synthetic */ EditView f79909a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.EditAttendeeFragment.AttendeeFragmentAction
        /* renamed from: a */
        public void mo114375a() {
            this.f79909a.mo114315a(4);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.EditAttendeeFragment.AttendeeFragmentAction
        /* renamed from: b */
        public Map<String, List<SimpleMember>> mo114377b() {
            return EditView.m118543c(this.f79909a).mo114557L();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31521m(EditView editView) {
            this.f79909a = editView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.EditAttendeeFragment.AttendeeFragmentAction
        /* renamed from: a */
        public void mo114376a(ArrayList<CalendarEventAttendee> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "displayAttendees");
            this.f79909a.mo114315a(4);
            EditView.m118541b(this.f79909a).mo114524a(arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J(\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditView$mMultiEventTimeAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditMultiTimeFragment$EventTimeFragmentAction;", "onBackPressed", "", "onSaveBtnPressed", "startTime", "", "endTime", "allDay", "", "timeZoneId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$q */
    public static final class C31525q implements EditMultiTimeFragment.EventTimeFragmentAction {

        /* renamed from: a */
        final /* synthetic */ EditView f79913a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.EditMultiTimeFragment.EventTimeFragmentAction
        /* renamed from: a */
        public void mo114382a() {
            this.f79913a.mo114315a(2);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31525q(EditView editView) {
            this.f79913a = editView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.EditMultiTimeFragment.EventTimeFragmentAction
        /* renamed from: a */
        public void mo114383a(long j, long j2, boolean z, String str) {
            Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
            EditView.m118541b(this.f79913a).mo114514a(j, j2, z, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u001b\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditView$mReminderFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseReminderFragment$ReminderFragmentAction;", "onBackPressed", "", "onSavePressed", "chosenIndexArray", "", "", "([Ljava/lang/Integer;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$r */
    public static final class C31526r implements ChooseReminderFragment.ReminderFragmentAction {

        /* renamed from: a */
        final /* synthetic */ EditView f79914a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseReminderFragment.ReminderFragmentAction
        /* renamed from: a */
        public void mo114384a() {
            this.f79914a.mo114315a(13);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31526r(EditView editView) {
            this.f79914a = editView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseReminderFragment.ReminderFragmentAction
        /* renamed from: a */
        public void mo114385a(Integer[] numArr) {
            Intrinsics.checkParameterIsNotNull(numArr, "chosenIndexArray");
            this.f79914a.mo114315a(13);
            EditView.m118541b(this.f79914a).mo114527a(numArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J(\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditView$mRepeatEndFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseRepeatEndFragment$RepeatEndFragmentAction;", "onBackPressed", "", "onSavePressed", "isNeverEnd", "", "year", "", "month", "day", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$s */
    public static final class C31527s implements ChooseRepeatEndFragment.RepeatEndFragmentAction {

        /* renamed from: a */
        final /* synthetic */ EditView f79915a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseRepeatEndFragment.RepeatEndFragmentAction
        /* renamed from: a */
        public void mo114386a() {
            this.f79915a.mo114315a(16);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31527s(EditView editView) {
            this.f79915a = editView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseRepeatEndFragment.RepeatEndFragmentAction
        /* renamed from: a */
        public void mo114387a(boolean z, int i, int i2, int i3) {
            this.f79915a.mo114315a(16);
            EditView.m118541b(this.f79915a).mo114526a(z, i, i2, i3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditView$mStatusFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseStatusFragment$StatusFragmentAction;", "onBackPressed", "", "onSavePressed", "isFree", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$t */
    public static final class C31528t implements ChooseStatusFragment.StatusFragmentAction {

        /* renamed from: a */
        final /* synthetic */ EditView f79916a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseStatusFragment.StatusFragmentAction
        /* renamed from: a */
        public void mo114388a() {
            this.f79916a.mo114315a(9);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31528t(EditView editView) {
            this.f79916a = editView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseStatusFragment.StatusFragmentAction
        /* renamed from: a */
        public void mo114389a(boolean z) {
            CalendarEventHitPoint.m124339a("edit_availability", (String) null, (Boolean) null, (Boolean) null, (Boolean) null, 30, (Object) null);
            this.f79916a.mo114315a(9);
            EditView.m118541b(this.f79916a).mo114525a(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditView$mVisibilityFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseVisibilityFragment$VisibilityFragmentAction;", "onBackPressed", "", "onSavePressed", "visibility", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Visibility;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$v */
    public static final class C31530v implements ChooseVisibilityFragment.VisibilityFragmentAction {

        /* renamed from: a */
        final /* synthetic */ EditView f79917a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseVisibilityFragment.VisibilityFragmentAction
        /* renamed from: a */
        public void mo114390a() {
            this.f79917a.mo114315a(8);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31530v(EditView editView) {
            this.f79917a = editView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseVisibilityFragment.VisibilityFragmentAction
        /* renamed from: a */
        public void mo114391a(CalendarEvent.Visibility visibility) {
            Intrinsics.checkParameterIsNotNull(visibility, "visibility");
            this.f79917a.mo114315a(8);
            EditView.m118541b(this.f79917a).mo114518a(visibility);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditView$meetingRoomFormFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/MeetingRoomFormFragment$MeetingRoomFormFragmentAction;", "onCompletePressed", "", "calendarId", "", "resourceCustomization", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "onFragmentBackPressed", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$w */
    public static final class C31531w implements MeetingRoomFormFragment.MeetingRoomFormFragmentAction {

        /* renamed from: a */
        final /* synthetic */ EditView f79918a;

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.form.MeetingRoomFormFragment.MeetingRoomFormFragmentAction
        /* renamed from: a */
        public void mo114392a() {
            this.f79918a.mo114315a(20);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31531w(EditView editView) {
            this.f79918a = editView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.form.MeetingRoomFormFragment.MeetingRoomFormFragmentAction
        /* renamed from: a */
        public void mo114393a(String str, SchemaExtraData.ResourceCustomization resourceCustomization) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            Intrinsics.checkParameterIsNotNull(resourceCustomization, "resourceCustomization");
            this.f79918a.mo114315a(20);
            EditView.m118541b(this.f79918a).mo114531b(str, resourceCustomization);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewApi
    /* renamed from: h */
    public void mo114336h() {
        EditMultiTimeFragment jVar = this.f79888p;
        if (jVar != null) {
            jVar.mo115559b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¨\u0006\u001c"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditView$mDetailListener$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/IDetailItemListener;", "onAddAttendeeClicked", "", "onAttendeeFreeBusyClicked", "onChangeRepeatEnd", "onClickExpandResource", "onDeleteEventBtnClicked", "onHideFeature", "featureId", "", "onLocationClicked", "onMeetingRoomDeleteClicked", "meetingRoom", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "onMeetingRoomItemClicked", "calendarId", "", "onMtRoomScheduleClicked", "resourceCustomization", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "onShouldShowFeatureIcon", "", "onShowFeatureFragmentClicked", "onSummaryTextChanged", "summary", "onTimeChosenItemChanged", "isChosenStart", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$j */
    public static final class C31517j implements IDetailItemListener {

        /* renamed from: a */
        final /* synthetic */ EditView f79907a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener
        /* renamed from: c */
        public void mo114368c() {
            CalendarHitPoint.m124100B();
            EditView.m118541b(this.f79907a).mo114537e();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener
        /* renamed from: e */
        public void mo114371e() {
            EditView.m118541b(this.f79907a).mo114542i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener
        /* renamed from: f */
        public void mo114372f() {
            EditView.m118541b(this.f79907a).mo114545l();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener
        /* renamed from: d */
        public void mo114370d() {
            ((EditDetailView) EditView.m118537a(this.f79907a).findViewById(R.id.append_event_detail_view)).setDividerBottomVisibility(0);
            EditView.m118541b(this.f79907a).mo114543j();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener
        /* renamed from: a */
        public void mo114359a() {
            EditView.m118541b(this.f79907a).mo114535d();
            EditView.m118541b(this.f79907a).mo114540g();
            ((ControlChildViewClickableLayout) EditView.m118537a(this.f79907a).findViewById(R.id.ll_event_content)).startAnimation(EditView.m118545d(this.f79907a));
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener
        /* renamed from: b */
        public void mo114365b() {
            EditView.m118541b(this.f79907a).mo114535d();
            EditView.m118541b(this.f79907a).mo114541h();
            ((ControlChildViewClickableLayout) EditView.m118537a(this.f79907a).findViewById(R.id.ll_event_content)).startAnimation(EditView.m118545d(this.f79907a));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31517j(EditView editView) {
            this.f79907a = editView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener
        /* renamed from: a */
        public void mo114364a(boolean z) {
            this.f79907a.f79880g = z;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener
        /* renamed from: a */
        public void mo114361a(CalendarEventAttendee calendarEventAttendee) {
            Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "meetingRoom");
            EditView.m118541b(this.f79907a).mo114519a(calendarEventAttendee);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener
        /* renamed from: b */
        public void mo114366b(int i) {
            EditView.m118541b(this.f79907a).mo114534c(i);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener
        /* renamed from: a */
        public void mo114362a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "summary");
            EditView.m118541b(this.f79907a).mo114522a(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener
        /* renamed from: b */
        public void mo114367b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            EditView.m118541b(this.f79907a).mo114530b(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener
        /* renamed from: c */
        public boolean mo114369c(int i) {
            if (i != 10 || !EditView.m118543c(this.f79907a).mo114555J()) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener
        /* renamed from: a */
        public void mo114360a(int i) {
            if (!EditView.m118543c(this.f79907a).mo114565T() || i != 4) {
                EditView.m118541b(this.f79907a).mo114535d();
                FrameLayout frameLayout = (FrameLayout) EditView.m118537a(this.f79907a).findViewById(R.id.event_feature_fragment_container);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mRootView.event_feature_fragment_container");
                frameLayout.setVisibility(0);
                EditView.m118541b(this.f79907a).mo114529b(i);
                this.f79907a.mo114314a();
                return;
            }
            this.f79907a.mo114327b(R.string.Calendar_Common_LoadAndWait);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener
        /* renamed from: a */
        public void mo114363a(String str, SchemaExtraData.ResourceCustomization resourceCustomization) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            Intrinsics.checkParameterIsNotNull(resourceCustomization, "resourceCustomization");
            EditView.m118541b(this.f79907a).mo114523a(str, resourceCustomization);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/calendar/impl/features/events/edit/EditView$mDisableFinishBtnAction$2$1", "invoke", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$mDisableFinishBtnAction$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$k */
    static final class C31518k extends Lambda implements Function0<C315191> {
        public static final C31518k INSTANCE = new C31518k();

        C31518k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C315191 invoke() {
            return new AbstractC32629e(C32634ae.m125182b(R.string.Calendar_Common_Save), R.color.primary_pri_200) {
                /* class com.ss.android.lark.calendar.impl.features.events.edit.EditView.C31518k.C315191 */

                @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
                /* renamed from: a */
                public void mo109419a(View view) {
                    Intrinsics.checkParameterIsNotNull(view, "view");
                    Log.m165389i("EditView", C32673y.m125369a("save"));
                    Context a = C32634ae.m125179a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "ResUtil.getAppContext()");
                    UDToast.show(a, (int) R.string.Calendar_Edit_CantSaveNeedUpdateToast);
                }
            };
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m118559n();
        m118561o();
        m118557m();
        m118555l();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$b */
    static final class RunnableC31509b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EditView f79899a;

        RunnableC31509b(EditView editView) {
            this.f79899a = editView;
        }

        public final void run() {
            ((EditDetailView) EditView.m118537a(this.f79899a).findViewById(R.id.append_event_detail_view)).mo114283a();
            EditView.m118541b(this.f79899a).mo114528b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditView$mCustomRepeatFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseCustomRepeatFragment$CustomRepeatFragmentAction;", "onBackPressed", "", "onSavePressed", "customRRule", "Lcom/ss/android/lark/calendar/impl/utils/EventRecurrence;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$h */
    public static final class C31515h implements ChooseCustomRepeatFragment.CustomRepeatFragmentAction {

        /* renamed from: a */
        final /* synthetic */ EditView f79905a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseCustomRepeatFragment.CustomRepeatFragmentAction
        /* renamed from: a */
        public void mo114355a() {
            EditView.m118541b(this.f79905a).mo114515a(this.f79905a.f79879f);
            EditView.m118541b(this.f79905a).mo114529b(14);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31515h(EditView editView) {
            this.f79905a = editView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseCustomRepeatFragment.CustomRepeatFragmentAction
        /* renamed from: a */
        public void mo114356a(EventRecurrence eventRecurrence) {
            Intrinsics.checkParameterIsNotNull(eventRecurrence, "customRRule");
            this.f79905a.mo114315a(15);
            EditView.m118541b(this.f79905a).mo114521a(eventRecurrence);
        }
    }

    /* renamed from: l */
    private final void m118555l() {
        View view = this.f79874a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        ((EditDetailView) view.findViewById(R.id.append_event_detail_view)).setOnItemClickedCallBack(this.f79856I);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewApi
    /* renamed from: b */
    public void mo114326b() {
        ChooseCalendarFragment chooseCalendarFragment = this.f79890r;
        if (chooseCalendarFragment != null) {
            IEditContract.IEditViewData eVar = this.f79875b;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            chooseCalendarFragment.mo115145a(eVar.mo114576g());
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        View view = this.f79874a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        ((EditDetailView) view.findViewById(R.id.append_event_detail_view)).mo114298b();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewApi
    /* renamed from: g */
    public void mo114335g() {
        View view = this.f79874a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        ((EditDetailView) view.findViewById(R.id.append_event_detail_view)).mo114299c();
    }

    /* renamed from: m */
    private final void m118557m() {
        Typeface createFromAsset = Typeface.createFromAsset(UIUtils.getAssets(this.f79883k), "fonts/DINPro-Bold.ttf");
        Intrinsics.checkExpressionValueIsNotNull(createFromAsset, "Typeface.createFromAsset…PE_FACE_DINPRO_BOLD_PATH)");
        this.f79852E = createFromAsset;
        View view = this.f79874a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        EditDetailView editDetailView = (EditDetailView) view.findViewById(R.id.append_event_detail_view);
        Typeface typeface = this.f79852E;
        if (typeface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDinaIternateBold");
        }
        editDetailView.setTimeTypeface(typeface);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewApi
    /* renamed from: c */
    public void mo114329c() {
        View$OnClickListenerC31538b bVar = this.f79887o;
        if (bVar instanceof ResourceExpandFragment) {
            View view = this.f79874a;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.event_feature_fragment_container);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mRootView.event_feature_fragment_container");
            if (frameLayout.getVisibility() == 0) {
                ResourceExpandFragment aVar = (ResourceExpandFragment) bVar;
                IEditContract.IEditViewData eVar = this.f79875b;
                if (eVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewData");
                }
                aVar.mo115331a(eVar.mo114564S());
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewApi
    /* renamed from: f */
    public void mo114334f() {
        View view = this.f79874a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.event_feature_fragment_container);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mRootView.event_feature_fragment_container");
        if (frameLayout.getVisibility() == 0) {
            View$OnClickListenerC31538b bVar = this.f79887o;
            if (bVar != null) {
                bVar.mo113714e();
                return;
            }
            return;
        }
        IEditContract.IEditViewAction cVar = this.f79876c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        cVar.mo114511a();
    }

    /* renamed from: n */
    private final void m118559n() {
        View view = this.f79874a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        ((CommonTitleBar) view.findViewById(R.id.title_bar)).setLeftImageDrawable(null);
        View view2 = this.f79874a;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        ((CommonTitleBar) view2.findViewById(R.id.title_bar)).setLeftText(R.string.Calendar_Common_Cancel);
        View view3 = this.f79874a;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        ((CommonTitleBar) view3.findViewById(R.id.title_bar)).setLeftClickListener(new C31512e(this));
        View view4 = this.f79874a;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        ((CommonTitleBar) view4.findViewById(R.id.title_bar)).addAction(this.f79853F);
        View view5 = this.f79874a;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        ((CommonTitleBar) view5.findViewById(R.id.title_bar)).setDividerVisible(false);
    }

    /* renamed from: o */
    private final void m118561o() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f79883k, R.anim.fragment_slide_in_from_bottom_slow);
        Intrinsics.checkExpressionValueIsNotNull(loadAnimation, "AnimationUtils.loadAnima…lide_in_from_bottom_slow)");
        this.f79884l = loadAnimation;
        if (loadAnimation == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mShowFragmentAnimation");
        }
        loadAnimation.setAnimationListener(new animationAnimation$AnimationListenerC31510c(this));
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f79883k, R.anim.fragment_slide_out_to_bottom);
        Intrinsics.checkExpressionValueIsNotNull(loadAnimation2, "AnimationUtils.loadAnima…ment_slide_out_to_bottom)");
        this.f79885m = loadAnimation2;
        if (loadAnimation2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDismissFragmentAnimation");
        }
        loadAnimation2.setAnimationListener(new animationAnimation$AnimationListenerC31511d(this));
        Animation loadAnimation3 = AnimationUtils.loadAnimation(this.f79883k, R.anim.main_content_slide_out_slow);
        Intrinsics.checkExpressionValueIsNotNull(loadAnimation3, "AnimationUtils.loadAnima…n_content_slide_out_slow)");
        this.f79877d = loadAnimation3;
        Animation loadAnimation4 = AnimationUtils.loadAnimation(this.f79883k, R.anim.fragment_main_slide_in_slow);
        Intrinsics.checkExpressionValueIsNotNull(loadAnimation4, "AnimationUtils.loadAnima…gment_main_slide_in_slow)");
        this.f79886n = loadAnimation4;
    }

    /* renamed from: a */
    public final void mo114314a() {
        View view = this.f79874a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.event_feature_fragment_container);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mRootView.event_feature_fragment_container");
        frameLayout.setVisibility(0);
        View view2 = this.f79874a;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        FrameLayout frameLayout2 = (FrameLayout) view2.findViewById(R.id.event_feature_fragment_container);
        Animation animation = this.f79884l;
        if (animation == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mShowFragmentAnimation");
        }
        frameLayout2.startAnimation(animation);
        View view3 = this.f79874a;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        ControlChildViewClickableLayout controlChildViewClickableLayout = (ControlChildViewClickableLayout) view3.findViewById(R.id.ll_event_content);
        Animation animation2 = this.f79877d;
        if (animation2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDismissEventContentAnimation");
        }
        controlChildViewClickableLayout.startAnimation(animation2);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewApi
    /* renamed from: d */
    public void mo114331d() {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f79883k).title(R.string.Calendar_Common_Notice)).message(R.string.Calendar_Edit_UnSaveTip)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, new DialogInterface$OnClickListenerC31533y(this))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).messageTextColor(R.color.text_caption)).messageTextSize(14)).show();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewApi
    /* renamed from: j */
    public void mo114338j() {
        UDDialogBuilder eVar = new UDDialogBuilder(this.f79883k);
        IEditContract.IEditViewData eVar2 = this.f79875b;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        UDDialogBuilder eVar3 = (UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(eVar2.mo114566U())).titleGravity(3)).titleLineCount(4);
        IEditContract.IEditViewData eVar4 = this.f79875b;
        if (eVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar3.message(eVar4.mo114567V())).messageGravity(3)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_GotIt, (DialogInterface.OnClickListener) null)).show();
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x019e  */
    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewApi
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo114337i() {
        /*
        // Method dump skipped, instructions count: 783
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.EditView.mo114337i():void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditView$initAnimation$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$c  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC31510c implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ EditView f79900a;

        public void onAnimationRepeat(Animation animation) {
            Intrinsics.checkParameterIsNotNull(animation, "animation");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        animationAnimation$AnimationListenerC31510c(EditView editView) {
            this.f79900a = editView;
        }

        public void onAnimationEnd(Animation animation) {
            Intrinsics.checkParameterIsNotNull(animation, "animation");
            ControlChildViewClickableLayout controlChildViewClickableLayout = (ControlChildViewClickableLayout) EditView.m118537a(this.f79900a).findViewById(R.id.ll_event_content);
            Intrinsics.checkExpressionValueIsNotNull(controlChildViewClickableLayout, "mRootView.ll_event_content");
            controlChildViewClickableLayout.setVisibility(8);
            ((ControlChildViewClickableLayout) EditView.m118537a(this.f79900a).findViewById(R.id.ll_event_content)).setChildViewClickable(true);
        }

        public void onAnimationStart(Animation animation) {
            Intrinsics.checkParameterIsNotNull(animation, "animation");
            FrameLayout frameLayout = (FrameLayout) EditView.m118537a(this.f79900a).findViewById(R.id.event_feature_fragment_container);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mRootView.event_feature_fragment_container");
            frameLayout.setVisibility(0);
            ((ControlChildViewClickableLayout) EditView.m118537a(this.f79900a).findViewById(R.id.ll_event_content)).setChildViewClickable(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditView$initAnimation$2", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$d  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC31511d implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ EditView f79901a;

        public void onAnimationRepeat(Animation animation) {
            Intrinsics.checkParameterIsNotNull(animation, "animation");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        animationAnimation$AnimationListenerC31511d(EditView editView) {
            this.f79901a = editView;
        }

        public void onAnimationEnd(Animation animation) {
            Intrinsics.checkParameterIsNotNull(animation, "animation");
            FrameLayout frameLayout = (FrameLayout) EditView.m118537a(this.f79901a).findViewById(R.id.event_feature_fragment_container);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mRootView.event_feature_fragment_container");
            frameLayout.setVisibility(8);
            EditView.m118541b(this.f79901a).mo114533c();
        }

        public void onAnimationStart(Animation animation) {
            Intrinsics.checkParameterIsNotNull(animation, "animation");
            ControlChildViewClickableLayout controlChildViewClickableLayout = (ControlChildViewClickableLayout) EditView.m118537a(this.f79901a).findViewById(R.id.ll_event_content);
            Intrinsics.checkExpressionValueIsNotNull(controlChildViewClickableLayout, "mRootView.ll_event_content");
            controlChildViewClickableLayout.setVisibility(0);
            ((ControlChildViewClickableLayout) EditView.m118537a(this.f79901a).findViewById(R.id.ll_event_content)).setChildViewClickable(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditView$initTitleBar$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$e */
    public static final class C31512e extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ EditView f79902a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31512e(EditView editView) {
            this.f79902a = editView;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            Log.m165389i("EditView", C32673y.m125369a("back"));
            ((EditDetailView) EditView.m118537a(this.f79902a).findViewById(R.id.append_event_detail_view)).mo114283a();
            EditView.m118541b(this.f79902a).mo114511a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\u00032\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditView$mBuildingFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingFragment$BuildingFragmentAction;", "onBackPressed", "", "chosenMeetingRoomList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "Lkotlin/collections/ArrayList;", "onDeletePressedWhenOneItem", "onMeetingRoomInfoClicked", "calendarId", "", "onSearchItemSavePressed", "meetingRoom", "startBoardRoomFragment", "meetingRoomFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/MeetingRoomFragmentData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$f */
    public static final class C31513f implements BuildingFragment.BuildingFragmentAction {

        /* renamed from: a */
        final /* synthetic */ EditView f79903a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingFragment.BuildingFragmentAction
        /* renamed from: a */
        public void mo114346a() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31513f(EditView editView) {
            this.f79903a = editView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingFragment.BuildingFragmentAction
        /* renamed from: a */
        public void mo114347a(MeetingRoomFragmentData meetingRoomFragmentData) {
            Intrinsics.checkParameterIsNotNull(meetingRoomFragmentData, "meetingRoomFragmentData");
            EditView.m118541b(this.f79903a).mo114516a(meetingRoomFragmentData);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingFragment.BuildingFragmentAction
        /* renamed from: a */
        public void mo114348a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            EditView.m118541b(this.f79903a).mo114530b(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingFragment.BuildingFragmentAction
        /* renamed from: a */
        public void mo114349a(ArrayList<EventMeetingRoomData> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "chosenMeetingRoomList");
            this.f79903a.mo114315a(10);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingFragment.BuildingFragmentAction
        /* renamed from: b */
        public void mo114350b(ArrayList<EventMeetingRoomData> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "meetingRoom");
            this.f79903a.mo114315a(10);
            IEditContract.IEditViewAction b = EditView.m118541b(this.f79903a);
            ArrayList<EventMeetingRoomData> arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator<T> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(EditAttendeeHelper.f79930a.mo114607a((EventMeetingRoomData) it.next()));
            }
            b.mo114532b(new ArrayList<>(arrayList3));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditView$mEventVideoMeetingFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/videomeeting/EventVideoMeetingFragment$VideoMeetingFragmentAction;", "onSavePressed", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/VideoMeeting;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$n */
    public static final class C31522n implements EventVideoMeetingFragment.VideoMeetingFragmentAction {

        /* renamed from: a */
        final /* synthetic */ EditView f79910a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31522n(EditView editView) {
            this.f79910a = editView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.videomeeting.EventVideoMeetingFragment.VideoMeetingFragmentAction
        /* renamed from: a */
        public void mo114378a(VideoMeeting aaVar) {
            Intrinsics.checkParameterIsNotNull(aaVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f79910a.mo114315a(19);
            com.bytedance.lark.pb.calendar.v1.VideoMeeting a = ModelDataParserCalendar.f83420a.mo118799a(aaVar);
            if (a != null) {
                EditView.m118541b(this.f79910a).mo114520a(new DoVideoMeeting(a));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditView$mMeetingRoomFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseMeetingRoomFragment$MeetingRoomFragmentAction;", "onBackPressed", "", "isShowUsableBoardroom", "", "onMeetingRoomInfoClicked", "resourceCalendarId", "", "onSavePressed", "meetingRoomData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$p */
    public static final class C31524p implements ChooseMeetingRoomFragment.MeetingRoomFragmentAction {

        /* renamed from: a */
        final /* synthetic */ EditView f79912a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31524p(EditView editView) {
            this.f79912a = editView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseMeetingRoomFragment.MeetingRoomFragmentAction
        /* renamed from: a */
        public void mo114380a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "resourceCalendarId");
            EditView.m118541b(this.f79912a).mo114530b(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseMeetingRoomFragment.MeetingRoomFragmentAction
        /* renamed from: a */
        public void mo114381a(boolean z) {
            this.f79912a.f79881h = z;
            EditView.m118541b(this.f79912a).mo114515a(this.f79912a.f79878e);
            EditView.m118541b(this.f79912a).mo114529b(10);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseMeetingRoomFragment.MeetingRoomFragmentAction
        /* renamed from: a */
        public void mo114379a(EventMeetingRoomData eventMeetingRoomData) {
            Intrinsics.checkParameterIsNotNull(eventMeetingRoomData, "meetingRoomData");
            this.f79912a.f79881h = true;
            this.f79912a.mo114315a(11);
            IEditContract.IEditViewAction b = EditView.m118541b(this.f79912a);
            ArrayList<CalendarEventAttendee> arrayList = new ArrayList<>();
            arrayList.add(EditAttendeeHelper.f79930a.mo114607a(eventMeetingRoomData));
            b.mo114532b(arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$x */
    static final class View$OnClickListenerC31532x implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditView f79919a;

        View$OnClickListenerC31532x(EditView editView) {
            this.f79919a = editView;
        }

        public final void onClick(View view) {
            EditView.m118541b(this.f79919a).mo114544k();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ View m118537a(EditView editView) {
        View view = editView.f79874a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return view;
    }

    /* renamed from: b */
    public static final /* synthetic */ IEditContract.IEditViewAction m118541b(EditView editView) {
        IEditContract.IEditViewAction cVar = editView.f79876c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        return cVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ IEditContract.IEditViewData m118543c(EditView editView) {
        IEditContract.IEditViewData eVar = editView.f79875b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        return eVar;
    }

    /* renamed from: d */
    public static final /* synthetic */ Animation m118545d(EditView editView) {
        Animation animation = editView.f79877d;
        if (animation == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDismissEventContentAnimation");
        }
        return animation;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditView$mFinishBtnAction$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "view", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$o */
    public static final class C31523o extends AbstractC32629e {

        /* renamed from: a */
        final /* synthetic */ EditView f79911a;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Log.m165389i("EditView", C32673y.m125369a("save"));
            this.f79911a.f79882i.mo120361a();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31523o(EditView editView, String str, int i) {
            super(str, i);
            this.f79911a = editView;
        }
    }

    /* renamed from: k */
    private final void m118554k(EditPresenter.ActivityDependency aVar) {
        ResourceAppendFragment.Companion aVar2 = ResourceAppendFragment.f81871a;
        IEditContract.IEditViewData eVar = this.f79875b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        ResourceAppendFragment a = aVar2.mo116914a(eVar.mo114590u());
        this.f79851D = a;
        if (a != null) {
            a.mo116910a(this.f79864Q);
        }
        m118538a(this, aVar, this.f79851D, true, 0, 0, 24, null);
        CalendarEventHitPoint.m124339a("add_resource", (String) null, (Boolean) null, (Boolean) null, (Boolean) null, 30, (Object) null);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewApi
    /* renamed from: b */
    public void mo114327b(int i) {
        Context a = C32634ae.m125179a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ResUtil.getAppContext()");
        UDToast.show(a, i);
    }

    /* renamed from: c */
    private final void m118544c(EditPresenter.ActivityDependency aVar) {
        boolean z;
        EditMultiTimeFragment jVar = this.f79888p;
        if (jVar == null) {
            z = true;
        } else {
            z = false;
        }
        if (jVar != null) {
            IEditContract.IEditViewData eVar = this.f79875b;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            jVar.mo115558a(eVar.mo114583n(), this.f79880g);
        } else {
            C31525q qVar = this.f79857J;
            IEditContract.IEditViewData eVar2 = this.f79875b;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            this.f79888p = new EditMultiTimeFragment(qVar, eVar2.mo114583n(), this.f79880g);
        }
        m118538a(this, aVar, this.f79888p, z, 0, 0, 24, null);
    }

    /* renamed from: d */
    private final void m118546d(EditPresenter.ActivityDependency aVar) {
        boolean z;
        GeneralHitPoint.m124235c("full_event_editor");
        EditAttendeeFragment hVar = this.f79889q;
        if (hVar == null) {
            z = true;
        } else {
            z = false;
        }
        if (hVar != null) {
            IEditContract.IEditViewData eVar = this.f79875b;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            hVar.mo115529a(eVar.mo114579j());
        } else {
            C31521m mVar = this.f79858K;
            IEditContract.IEditViewData eVar2 = this.f79875b;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            this.f79889q = new EditAttendeeFragment(mVar, eVar2.mo114579j());
        }
        CalendarEventHitPoint.m124339a("view_attendee", (String) null, (Boolean) null, (Boolean) null, (Boolean) null, 30, (Object) null);
        m118538a(this, aVar, this.f79889q, z, 0, 0, 24, null);
    }

    /* renamed from: e */
    private final void m118547e(EditPresenter.ActivityDependency aVar) {
        boolean z;
        ChooseCalendarFragment chooseCalendarFragment = this.f79890r;
        if (chooseCalendarFragment == null) {
            z = true;
        } else {
            z = false;
        }
        if (chooseCalendarFragment != null) {
            IEditContract.IEditViewData eVar = this.f79875b;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            chooseCalendarFragment.mo115145a(eVar.mo114576g());
        } else {
            EditView$mEventCalendarAction$1 editView$mEventCalendarAction$1 = this.f79859L;
            IEditContract.IEditViewData eVar2 = this.f79875b;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            this.f79890r = new ChooseCalendarFragment(editView$mEventCalendarAction$1, eVar2.mo114576g());
        }
        m118538a(this, aVar, this.f79890r, z, 0, 0, 24, null);
    }

    /* renamed from: f */
    private final void m118548f(EditPresenter.ActivityDependency aVar) {
        boolean z;
        ChooseColorFragment chooseColorFragment = this.f79891s;
        if (chooseColorFragment == null) {
            z = true;
        } else {
            z = false;
        }
        if (chooseColorFragment != null) {
            IEditContract.IEditViewData eVar = this.f79875b;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            chooseColorFragment.mo115149b(eVar.mo114580k());
        } else {
            EditView$mColorFragmentAction$1 editView$mColorFragmentAction$1 = this.f79860M;
            IEditContract.IEditViewData eVar2 = this.f79875b;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            this.f79891s = new ChooseColorFragment(editView$mColorFragmentAction$1, eVar2.mo114580k());
        }
        m118538a(this, aVar, this.f79891s, z, 0, 0, 24, null);
    }

    /* renamed from: g */
    private final void m118549g(EditPresenter.ActivityDependency aVar) {
        boolean z;
        ChooseStatusFragment eVar = this.f79892t;
        if (eVar == null) {
            z = true;
        } else {
            z = false;
        }
        if (eVar != null) {
            IEditContract.IEditViewData eVar2 = this.f79875b;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            eVar.mo115476a(eVar2.mo114581l());
        } else {
            C31528t tVar = this.f79861N;
            IEditContract.IEditViewData eVar3 = this.f79875b;
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            this.f79892t = new ChooseStatusFragment(tVar, eVar3.mo114581l());
        }
        m118538a(this, aVar, this.f79892t, z, 0, 0, 24, null);
    }

    /* renamed from: h */
    private final void m118550h(EditPresenter.ActivityDependency aVar) {
        boolean z;
        ChooseVisibilityFragment fVar = this.f79893u;
        if (fVar == null) {
            z = true;
        } else {
            z = false;
        }
        if (fVar != null) {
            IEditContract.IEditViewData eVar = this.f79875b;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            fVar.mo115523a(eVar.mo114582m());
        } else {
            C31530v vVar = this.f79862O;
            IEditContract.IEditViewData eVar2 = this.f79875b;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            this.f79893u = new ChooseVisibilityFragment(vVar, eVar2.mo114582m());
        }
        m118538a(this, aVar, this.f79893u, z, 0, 0, 24, null);
    }

    /* renamed from: i */
    private final void m118551i(EditPresenter.ActivityDependency aVar) {
        boolean z;
        ChooseReminderFragment cVar = this.f79894v;
        if (cVar == null) {
            z = true;
        } else {
            z = false;
        }
        if (cVar != null) {
            IEditContract.IEditViewData eVar = this.f79875b;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            ReminderFragmentData q = eVar.mo114586q();
            IEditContract.IEditViewData eVar2 = this.f79875b;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            cVar.mo115325a(q, eVar2.mo114587r());
        } else {
            C31526r rVar = this.f79863P;
            IEditContract.IEditViewData eVar3 = this.f79875b;
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            ReminderFragmentData q2 = eVar3.mo114586q();
            IEditContract.IEditViewData eVar4 = this.f79875b;
            if (eVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            this.f79894v = new ChooseReminderFragment(rVar, q2, eVar4.mo114587r());
        }
        m118538a(this, aVar, this.f79894v, z, 0, 0, 24, null);
    }

    /* renamed from: j */
    private final void m118552j(EditPresenter.ActivityDependency aVar) {
        boolean z;
        if (C30022a.f74883b.mo112692F()) {
            m118554k(aVar);
            return;
        }
        if (this.f79895w == null) {
            z = true;
        } else {
            z = false;
        }
        IEditContract.IEditViewData eVar = this.f79875b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        BuildingFragmentData t = eVar.mo114589t();
        t.setShowUsableBoardroom(this.f79881h);
        BuildingFragment aVar2 = this.f79895w;
        if (aVar2 != null) {
            aVar2.mo115668a(t);
        } else {
            this.f79895w = new BuildingFragment(this.f79865R, t);
        }
        CalendarEventHitPoint.m124339a("add_resource", (String) null, (Boolean) null, (Boolean) null, (Boolean) null, 30, (Object) null);
        m118538a(this, aVar, this.f79895w, z, 0, 0, 24, null);
    }

    /* renamed from: l */
    private final void m118556l(EditPresenter.ActivityDependency aVar) {
        boolean z;
        ChooseRepeatFragment chooseRepeatFragment = this.f79896x;
        if (chooseRepeatFragment == null) {
            z = true;
        } else {
            z = false;
        }
        if (chooseRepeatFragment != null) {
            IEditContract.IEditViewData eVar = this.f79875b;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            chooseRepeatFragment.mo115153a(eVar.mo114593x());
        } else {
            EditView$mRepeatFragmentAction$1 editView$mRepeatFragmentAction$1 = this.f79867T;
            IEditContract.IEditViewData eVar2 = this.f79875b;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            this.f79896x = new ChooseRepeatFragment(editView$mRepeatFragmentAction$1, eVar2.mo114593x());
        }
        m118538a(this, aVar, this.f79896x, z, 0, 0, 24, null);
    }

    /* renamed from: p */
    private final void m118563p(EditPresenter.ActivityDependency aVar) {
        com.bytedance.lark.pb.calendar.v1.VideoMeeting videoMeeting;
        boolean z;
        ModelDataParserCalendar.Companion aVar2 = ModelDataParserCalendar.f83420a;
        IEditContract.IEditViewData eVar = this.f79875b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        DoVideoMeeting P = eVar.mo114561P();
        if (P != null) {
            videoMeeting = P.getVchat();
        } else {
            videoMeeting = null;
        }
        VideoMeeting a = aVar2.mo118800a(videoMeeting);
        if (a != null) {
            EventVideoMeetingFragment aVar3 = this.f79848A;
            if (aVar3 == null) {
                z = true;
            } else {
                z = false;
            }
            if (aVar3 != null) {
                aVar3.mo115477a(a);
            } else {
                this.f79848A = new EventVideoMeetingFragment(a, this.f79871X);
            }
            m118538a(this, aVar, this.f79848A, z, 0, 0, 24, null);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewApi
    /* renamed from: b */
    public void mo114328b(EditPresenter.ActivityDependency aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "mActivityDependency");
        View$OnClickListenerC31538b bVar = this.f79887o;
        if (bVar != null) {
            EditPresenter.ActivityDependency.C31840a.m120917a(aVar, bVar, 0, 0, 6, null);
        }
        this.f79887o = null;
    }

    public EditView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f79874a = view;
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
        this.f79883k = context;
    }

    /* renamed from: b */
    private final void m118542b(boolean z) {
        CalendarDate calendarDate;
        String str;
        IEditContract.IEditViewData eVar = this.f79875b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        MeetingRoomLimitData M = eVar.mo114558M();
        View view = this.f79874a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        EditDetailView editDetailView = (EditDetailView) view.findViewById(R.id.append_event_detail_view);
        IEditContract.IEditViewData eVar2 = this.f79875b;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        String A = eVar2.mo114546A();
        IEditContract.IEditViewData eVar3 = this.f79875b;
        if (eVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        String E = eVar3.mo114550E();
        IEditContract.IEditViewData eVar4 = this.f79875b;
        if (eVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        Pair<EditEventUIVisible.EditUIState, EditEventUIVisible.DisableReason> s = eVar4.mo114573d().mo116396s();
        IEditContract.IEditViewData eVar5 = this.f79875b;
        if (eVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        boolean B = eVar5.mo114547B();
        IEditContract.IEditViewData eVar6 = this.f79875b;
        if (eVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        boolean F = eVar6.mo114551F();
        IEditContract.IEditViewData eVar7 = this.f79875b;
        if (eVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        boolean k = eVar7.mo114573d().mo116388k();
        if (M != null) {
            calendarDate = M.mo116397a();
        } else {
            calendarDate = null;
        }
        if (M != null) {
            str = M.mo116398b();
        } else {
            str = null;
        }
        IEditContract.IEditViewData eVar8 = this.f79875b;
        if (eVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        boolean N = eVar8.mo114559N();
        IEditContract.IEditViewData eVar9 = this.f79875b;
        if (eVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        editDetailView.mo114295a(z, A, E, s, B, F, k, calendarDate, str, N, eVar9.mo114560O());
    }

    /* renamed from: m */
    private final void m118558m(EditPresenter.ActivityDependency aVar) {
        boolean z;
        IEditContract.IEditViewAction cVar = this.f79876c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        cVar.mo114515a(this.f79896x);
        ChooseCustomRepeatFragment aVar2 = this.f79879f;
        if (aVar2 == null) {
            z = true;
        } else {
            z = false;
        }
        if (aVar2 != null) {
            IEditContract.IEditViewData eVar = this.f79875b;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            CalendarDate y = eVar.mo114594y();
            IEditContract.IEditViewData eVar2 = this.f79875b;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            boolean C = eVar2.mo114548C();
            IEditContract.IEditViewData eVar3 = this.f79875b;
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            aVar2.mo115156a(y, C, eVar3.mo114595z());
        } else {
            EditView editView = this;
            C31515h hVar = editView.f79868U;
            IEditContract.IEditViewData eVar4 = editView.f79875b;
            if (eVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            CalendarDate y2 = eVar4.mo114594y();
            IEditContract.IEditViewData eVar5 = editView.f79875b;
            if (eVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            boolean C2 = eVar5.mo114548C();
            IEditContract.IEditViewData eVar6 = editView.f79875b;
            if (eVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            editView.f79879f = new ChooseCustomRepeatFragment(hVar, y2, C2, eVar6.mo114595z());
        }
        m118538a(this, aVar, this.f79879f, z, 0, 0, 24, null);
    }

    /* renamed from: n */
    private final void m118560n(EditPresenter.ActivityDependency aVar) {
        boolean z;
        ChooseRepeatEndFragment dVar = this.f79897y;
        if (dVar == null) {
            z = true;
        } else {
            z = false;
        }
        if (dVar != null) {
            IEditContract.IEditViewData eVar = this.f79875b;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            dVar.mo115346a(eVar.mo114549D());
        } else {
            C31527s sVar = this.f79869V;
            IEditContract.IEditViewData eVar2 = this.f79875b;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            this.f79897y = new ChooseRepeatEndFragment(sVar, eVar2.mo114549D());
        }
        m118538a(this, aVar, this.f79897y, z, 0, 0, 24, null);
    }

    /* renamed from: o */
    private final void m118562o(EditPresenter.ActivityDependency aVar) {
        boolean z;
        EditDescriptionFragment iVar = this.f79898z;
        if (iVar == null) {
            z = true;
        } else {
            z = false;
        }
        if (iVar != null) {
            IEditContract.IEditViewData eVar = this.f79875b;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            iVar.mo115544a(eVar.mo114553H());
        } else {
            C31516i iVar2 = this.f79870W;
            IEditContract.IEditViewData eVar2 = this.f79875b;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            this.f79898z = new EditDescriptionFragment(iVar2, eVar2.mo114553H());
        }
        m118538a(this, aVar, this.f79898z, z, 0, 0, 24, null);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewApi
    /* renamed from: c */
    public void mo114330c(int i) {
        String a = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Toast_MaxGuest, "max_number", Integer.toString(i));
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDependencyHolder…toString(maxAttendeeNum))");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f79883k).title(R.string.Calendar_Common_Notice)).message(a)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_OK, (DialogInterface.OnClickListener) null)).messageTextSize(14)).messageTextColor(R.color.text_caption)).cancelable(false)).cancelOnTouchOutside(false)).show();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewApi
    /* renamed from: a */
    public void mo114315a(int i) {
        View view = this.f79874a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        ControlChildViewClickableLayout controlChildViewClickableLayout = (ControlChildViewClickableLayout) view.findViewById(R.id.ll_event_content);
        Intrinsics.checkExpressionValueIsNotNull(controlChildViewClickableLayout, "mRootView.ll_event_content");
        controlChildViewClickableLayout.setVisibility(0);
        View view2 = this.f79874a;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        FrameLayout frameLayout = (FrameLayout) view2.findViewById(R.id.event_feature_fragment_container);
        Animation animation = this.f79885m;
        if (animation == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDismissFragmentAnimation");
        }
        frameLayout.startAnimation(animation);
        View view3 = this.f79874a;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        ControlChildViewClickableLayout controlChildViewClickableLayout2 = (ControlChildViewClickableLayout) view3.findViewById(R.id.ll_event_content);
        Animation animation2 = this.f79886n;
        if (animation2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mShowEventContentAnimation");
        }
        controlChildViewClickableLayout2.startAnimation(animation2);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewApi
    /* renamed from: d */
    public void mo114332d(int i) {
        DialogC57586c cVar = new DialogC57586c(mo114333e());
        cVar.mo195559a("");
        cVar.mo195563b(C32634ae.m125182b(i));
        cVar.mo195567c(C32634ae.m125182b(R.string.Calendar_Common_Confirm), new View$OnClickListenerC31532x(this), true);
        cVar.mo195562b(16);
        cVar.mo195568d(C32634ae.m125178a(R.color.text_title));
        cVar.setCanceledOnTouchOutside(false);
        cVar.setCancelable(false);
        cVar.show();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewApi
    /* renamed from: a */
    public void mo114317a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Context e = mo114333e();
        if (e != null) {
            RequestLoadingDialog requestLoadingDialog = new RequestLoadingDialog((Activity) e);
            requestLoadingDialog.mo112594e(SmActions.ACTION_ONTHECALL_EXIT);
            requestLoadingDialog.setCancelable(false);
            requestLoadingDialog.mo112585a(R.string.Calendar_Toast_Saving);
            this.ab = requestLoadingDialog;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    /* renamed from: a */
    public void mo114318a(SaveType saveType) {
        C31523o oVar;
        Intrinsics.checkParameterIsNotNull(saveType, ShareHitPoint.f121869d);
        int i = C31865i.f81213a[saveType.ordinal()];
        if (i == 1) {
            oVar = this.f79853F;
        } else if (i == 2) {
            oVar = this.f79854G;
        } else if (i == 3) {
            oVar = m118553k();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (!Intrinsics.areEqual(this.aa, oVar)) {
            this.aa = oVar;
            View view = this.f79874a;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            ((CommonTitleBar) view.findViewById(R.id.title_bar)).removeAllActions();
            View view2 = this.f79874a;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            ((CommonTitleBar) view2.findViewById(R.id.title_bar)).addAction(this.aa);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditView$mUsableFinishBtnAction$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "view", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$u */
    public static final class C31529u extends AbstractC32629e {
        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
        }

        C31529u(String str, int i) {
            super(str, i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditView$y */
    static final class DialogInterface$OnClickListenerC31533y implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditView f79920a;

        DialogInterface$OnClickListenerC31533y(EditView editView) {
            this.f79920a = editView;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            EditView.m118541b(this.f79920a).mo114539f();
        }
    }

    /* renamed from: a */
    private final void m118540a(EditPresenter.ActivityDependency aVar, String str, SchemaExtraData.ResourceCustomization resourceCustomization, MeetingRoomFormFragment.MeetingRoomFormFragmentAction aVar2) {
        boolean z;
        MeetingRoomFormFragment aVar3 = this.f79849B;
        if (aVar3 == null) {
            z = true;
        } else {
            z = false;
        }
        if (aVar3 != null) {
            MeetingRoomFormFragment.m121981a(aVar3, str, resourceCustomization, null, 4, null);
        } else {
            this.f79849B = new MeetingRoomFormFragment(str, resourceCustomization, aVar2);
        }
        m118538a(this, aVar, this.f79849B, z, 0, 0, 24, null);
    }

    /* renamed from: a */
    private final void m118539a(EditPresenter.ActivityDependency aVar, Fragment fragment, boolean z, int i, int i2) {
        if (z) {
            View view = this.f79874a;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.event_feature_fragment_container);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mRootView.event_feature_fragment_container");
            aVar.mo114277a(fragment, frameLayout.getId(), i, i2);
        } else {
            aVar.mo114276a(fragment, i, i2);
        }
        if (fragment != null) {
            this.f79887o = (View$OnClickListenerC31538b) fragment;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.calendar.impl.features.events.edit.CalendarBaseEventFragment");
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewApi
    /* renamed from: a */
    public void mo114316a(int i, EditCalendarPart.CHANGE_TYPE change_type, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkParameterIsNotNull(change_type, "changeType");
        ChooseCalendarFragment chooseCalendarFragment = this.f79890r;
        if (chooseCalendarFragment != null) {
            chooseCalendarFragment.mo115144a(i, change_type, z, z2, z3, z4);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m118538a(EditView editView, EditPresenter.ActivityDependency aVar, Fragment fragment, boolean z, int i, int i2, int i3, Object obj) {
        int i4;
        int i5;
        if ((i3 & 8) != 0) {
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i3 & 16) != 0) {
            i5 = 0;
        } else {
            i5 = i2;
        }
        editView.m118539a(aVar, fragment, z, i4, i5);
    }
}
