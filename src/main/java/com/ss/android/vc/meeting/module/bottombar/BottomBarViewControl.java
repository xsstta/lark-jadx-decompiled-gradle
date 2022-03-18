package com.ss.android.vc.meeting.module.bottombar;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.C1395n;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60740ad;
import com.ss.android.vc.common.p3083e.C60748b;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.common.widget.LineHeightTextView;
import com.ss.android.vc.common.widget.insta.InstagramDotView;
import com.ss.android.vc.dependency.AbstractC60902q;
import com.ss.android.vc.dependency.IVideoChatDependency;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.lark.guidetips.VideoChatGuideConstants;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.audio.AudioRouteHelper;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.base.AbstractC61417a;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.base.MeetingActivity;
import com.ss.android.vc.meeting.module.base.util.DataAdapterUtil;
import com.ss.android.vc.meeting.module.bottombar.AbstractC61444a;
import com.ss.android.vc.meeting.module.bottombar.BottomBarBottomSheetBehavior;
import com.ss.android.vc.meeting.module.bottombar.function.BottomBarFunctionRv;
import com.ss.android.vc.meeting.module.bottombar.function.C61503b;
import com.ss.android.vc.meeting.module.bottombar.function.FunctionItem;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.module.chat.AbstractC61566a;
import com.ss.android.vc.meeting.module.chat.C61584f;
import com.ss.android.vc.meeting.module.chat.p3115a.AbstractC61567a;
import com.ss.android.vc.meeting.module.foregroundservice.C61869a;
import com.ss.android.vc.meeting.module.interpretation.p3126a.C61938d;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils;
import com.ss.android.vc.meeting.module.multi.viewstub.DesktopHostControlStub;
import com.ss.android.vc.meeting.module.p3148o.AbstractC62555a;
import com.ss.android.vc.meeting.module.p3148o.p3149a.C62556a;
import com.ss.android.vc.meeting.module.p3148o.p3149a.p3150a.C62557a;
import com.ss.android.vc.meeting.module.p3155q.AbstractC62782a;
import com.ss.android.vc.meeting.module.reaction.AbsReactionControl;
import com.ss.android.vc.meeting.module.reaction.entity.IMSource;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessage;
import com.ss.android.vc.statistics.event2.MeetingChatReactionEvent;
import com.ss.android.vc.statistics.event2.MeetingControlBarEvent;
import com.ss.android.vc.statistics.event2.MeetingOnTheCallEvent2;
import com.ss.android.vc.statistics.event2.MeetingPopupEvent;
import com.ss.android.vc.statistics.event2.SpeakerOptionEvent;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u000f\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0012\u0010g\u001a\u00020h2\b\u0010i\u001a\u0004\u0018\u00010ZH\u0002J\u0010\u0010j\u001a\u00020h2\u0006\u0010k\u001a\u00020KH\u0002J\b\u0010l\u001a\u00020hH\u0002J\b\u0010m\u001a\u00020hH\u0002J\b\u0010n\u001a\u00020hH\u0002J\b\u0010o\u001a\u00020hH\u0016J\b\u0010p\u001a\u00020hH\u0016J\b\u0010q\u001a\u00020hH\u0016J\b\u0010r\u001a\u00020hH\u0016J\b\u0010s\u001a\u00020hH\u0016J\n\u0010t\u001a\u0004\u0018\u00010uH\u0016J\u000e\u0010v\u001a\b\u0012\u0004\u0012\u00020I0HH\u0002J\b\u0010w\u001a\u00020xH\u0016J\u0010\u0010y\u001a\u00020h2\u0006\u0010z\u001a\u00020CH\u0016J\u0010\u0010{\u001a\u00020h2\u0006\u0010z\u001a\u00020CH\u0016J\b\u0010|\u001a\u00020hH\u0016J\b\u0010}\u001a\u00020hH\u0002J\b\u0010~\u001a\u00020hH\u0002J\b\u0010\u001a\u00020hH\u0002J\u0012\u0010\u0001\u001a\u00020h2\u0007\u0010\u0001\u001a\u00020\u000bH\u0002J\t\u0010\u0001\u001a\u00020hH\u0002J\t\u0010\u0001\u001a\u00020hH\u0016J\t\u0010\u0001\u001a\u00020hH\u0016J\t\u0010\u0001\u001a\u00020hH\u0002J\t\u0010\u0001\u001a\u00020hH\u0002J\t\u0010\u0001\u001a\u00020hH\u0002J\t\u0010\u0001\u001a\u00020hH\u0002J\t\u0010\u0001\u001a\u00020hH\u0002J\t\u0010\u0001\u001a\u00020hH\u0002J\t\u0010\u0001\u001a\u00020hH\u0002J\t\u0010\u0001\u001a\u00020hH\u0002J\t\u0010\u0001\u001a\u00020hH\u0002J\t\u0010\u0001\u001a\u00020hH\u0002J\t\u0010\u0001\u001a\u00020hH\u0002J\t\u0010\u0001\u001a\u00020hH\u0002J\t\u0010\u0001\u001a\u00020CH\u0016J\u0018\u0010\u0001\u001a\u00020C2\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020I0HH\u0002J\t\u0010\u0001\u001a\u00020CH\u0016J\t\u0010\u0001\u001a\u00020hH\u0016J\t\u0010\u0001\u001a\u00020CH\u0016J\t\u0010\u0001\u001a\u00020hH\u0016J\u001b\u0010\u0001\u001a\u00020h2\b\u0010\u0001\u001a\u00030\u00012\u0006\u0010i\u001a\u00020\u0013H\u0016J\t\u0010\u0001\u001a\u00020hH\u0016J\t\u0010\u0001\u001a\u00020hH\u0016J\t\u0010\u0001\u001a\u00020hH\u0016J\t\u0010\u0001\u001a\u00020hH\u0016J\t\u0010\u0001\u001a\u00020hH\u0016J\u0012\u0010 \u0001\u001a\u00020h2\u0007\u0010¡\u0001\u001a\u00020CH\u0002J\u0012\u0010¢\u0001\u001a\u00020h2\u0007\u0010£\u0001\u001a\u00020CH\u0002J\u0012\u0010¤\u0001\u001a\u00020h2\u0007\u0010¥\u0001\u001a\u00020CH\u0016J\u0012\u0010¦\u0001\u001a\u00020h2\u0007\u0010§\u0001\u001a\u00020CH\u0016J\u0015\u0010¨\u0001\u001a\u00020h2\n\u0010©\u0001\u001a\u0005\u0018\u00010ª\u0001H\u0002J\t\u0010«\u0001\u001a\u00020hH\u0002J\t\u0010¬\u0001\u001a\u00020hH\u0016J\u0015\u0010­\u0001\u001a\u00020h2\n\u0010®\u0001\u001a\u0005\u0018\u00010¯\u0001H\u0016J\t\u0010°\u0001\u001a\u00020hH\u0002J\u0013\u0010°\u0001\u001a\u00020h2\b\u0010±\u0001\u001a\u00030²\u0001H\u0016J\u0012\u0010³\u0001\u001a\u00020h2\u0007\u0010´\u0001\u001a\u00020CH\u0016J\u0012\u0010µ\u0001\u001a\u00020h2\u0007\u0010´\u0001\u001a\u00020CH\u0016J\u0015\u0010¶\u0001\u001a\u00020h2\n\u0010©\u0001\u001a\u0005\u0018\u00010ª\u0001H\u0016J\t\u0010·\u0001\u001a\u00020hH\u0002J\u0012\u0010¸\u0001\u001a\u00020h2\u0007\u0010¡\u0001\u001a\u00020CH\u0016J\u0012\u0010¹\u0001\u001a\u00020h2\u0007\u0010º\u0001\u001a\u00020CH\u0016J\t\u0010»\u0001\u001a\u00020hH\u0002J\t\u0010¼\u0001\u001a\u00020hH\u0002J\t\u0010½\u0001\u001a\u00020hH\u0016J\t\u0010¾\u0001\u001a\u00020hH\u0016J\u0012\u0010¿\u0001\u001a\u00020h2\u0007\u0010À\u0001\u001a\u00020CH\u0016J\u0012\u0010Á\u0001\u001a\u00020h2\u0007\u0010Â\u0001\u001a\u00020CH\u0016J\u0012\u0010Ã\u0001\u001a\u00020h2\u0007\u0010Ä\u0001\u001a\u00020\u000bH\u0016J\u0012\u0010Å\u0001\u001a\u00020h2\u0007\u0010Æ\u0001\u001a\u00020\u000bH\u0002J\u0012\u0010Ç\u0001\u001a\u00020h2\u0007\u0010º\u0001\u001a\u00020CH\u0016J\t\u0010È\u0001\u001a\u00020hH\u0016J\u0012\u0010É\u0001\u001a\u00020h2\u0007\u0010Ê\u0001\u001a\u00020\u000bH\u0016R\u000e\u0010\n\u001a\u00020\u000bXD¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00130'X.¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010:X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020CX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020CX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020CX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010G\u001a\b\u0012\u0004\u0012\u00020I0HX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020KX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010L\u001a\u0004\u0018\u00010MX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010N\u001a\u0004\u0018\u00010OX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010P\u001a\u0004\u0018\u00010QX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010R\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010S\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010T\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010U\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010V\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010W\u001a\u0004\u0018\u00010XX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010Y\u001a\u0004\u0018\u00010ZX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010[\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\\\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010]\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010_\u001a\u0004\u0018\u000102X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010b\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010c\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010d\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020CX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010f\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006Ë\u0001"}, d2 = {"Lcom/ss/android/vc/meeting/module/bottombar/BottomBarViewControl;", "Lcom/ss/android/vc/meeting/module/base/BaseViewControl;", "Lcom/ss/android/vc/meeting/module/bottombar/AbsBottomBarControl$IBottomBarViewListener;", "Lcom/ss/android/vc/meeting/module/bottombar/AbsBottomBarControl$IFunctionClickListener;", "Lcom/ss/android/vc/meeting/module/chat/message/AbsMessageControl$IMessageViewControlListener;", "Lcom/ss/android/vc/meeting/basedialog/FullScreen/IBackPressedHandler;", "Lcom/ss/android/vc/meeting/module/audio/AudioRouteHelper$IRouteAction;", "present", "Lcom/ss/android/vc/meeting/module/base/IMeetingCallPresent;", "(Lcom/ss/android/vc/meeting/module/base/IMeetingCallPresent;)V", "FunctionPageItemSize", "", "TAG", "", "alphaBoundaryOffset", "", "argbEvaluator", "Landroid/animation/ArgbEvaluator;", "audioContainer", "Landroid/view/View;", "audioForbidIcon", "audioIcon", "Landroid/widget/ImageView;", "audioRouteHelper", "Lcom/ss/android/vc/meeting/module/audio/AudioRouteHelper;", "audioText", "Landroid/widget/TextView;", "bottomBarEndColor", "bottomBarNotify", "bottomBarNumNotify", "bottomBarNumNotifyContainer", "bottomBarRootView", "bottomBarStartColor", "bottomExtraLayout", "Landroid/widget/LinearLayout;", "bottomExtraLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "bottomSheet", "bottomSheetBehavior", "Lcom/ss/android/vc/meeting/module/bottombar/BottomBarBottomSheetBehavior;", "bottomStubContainer", "breakoutRoomHelpView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "cameraContainer", "cameraForbidIcon", "cameraIcon", "cameraText", "collapseArea", "collapseMenuContainer", "collapseStateArrowArea", "Landroid/widget/FrameLayout;", "collapseStateTitleArrow", "curFunctionListSize", "currExpandHeight", "desktopHostControlStub", "Lcom/ss/android/vc/meeting/module/multi/viewstub/DesktopHostControlStub;", "dotHeight", "echoDialog", "Lcom/larksuite/component/ui/dialog/LKUIDialog;", "expandArea", "Landroid/widget/RelativeLayout;", "expandStateTitleArrow", "functionAndHostControlArea", "functionAndHostControlAreaWithoutBg", "functionRv", "Lcom/ss/android/vc/meeting/module/bottombar/function/BottomBarFunctionRv;", "isFirstExpand", "", "isReactionExpanding", "isReactionExtendUp", "lastBottomSheetState", "lastFunctionList", "", "Lcom/ss/android/vc/meeting/module/bottombar/function/FunctionItem;", "lastSlideOffset", "", "mDotView", "Lcom/ss/android/vc/common/widget/insta/InstagramDotView;", "mFunctionRVAdapter", "Lcom/ss/android/vc/meeting/module/bottombar/function/FunctionRVAdapter;", "mHostControlsViewHolder", "Lcom/ss/android/vc/meeting/module/setting/settingdialog/commonview/HostControlViewHolder;", "newMessageView", "participantContainer", "participantHasNotify", "participantIcon", "participantNumber", "participantTxt", "Lcom/ss/android/vc/common/widget/LineHeightTextView;", "reactionSendArea", "Landroid/view/ViewGroup;", "receiverContainer", "receiverIcon", "receiverText", "rvItemHorizontalMargin", "shadow", "shadowEndColor", "shadowStartColor", "shareContainer", "shareText", "shareToolbarContainer", "slideUpOrDown", "subtitleContainer", "beginTransition", "", "view", "changeAlphaWhileSliding", "offset", "checkDeviceWidth", "checkTelephoneOnCreate", "checkTelephoneOnResume", "collapseBottomBar", "destroy", "disableViewAfterHangup", "dismissEchoDialog", "expandBottomBar", "getActivity", "Landroid/app/Activity;", "getFunctionList", "getMessageSource", "Lcom/ss/android/vc/meeting/module/reaction/entity/IMSource;", "hideBreakoutRoomTips", "withAnimation", "hideMessage", "init", "initBottomExtraLayoutListener", "initBottomSheet", "initCameraBtn", "initDotView", "pageCount", "initFunctionArea", "initHostControlArea", "initHostControlBtnForDesktop", "initLiveStatus", "initLogicOfViews", "initMessageBubble", "initMicBtn", "initPadding", "initParticipantBtn", "initParticipantBtnAsMulti", "initParticipantBtnAsSingle", "initReactionArea", "initRecordStatus", "initShareBtn", "initSpeakerBtn", "isBottomBarViewShowing", "isFunctionListChanged", "functionLists", "isShowing", "onAudioRouteSwitch", "onBackPressed", "onConfigurationChanged", "onFunctionClicked", ShareHitPoint.f121869d, "Lcom/ss/android/vc/meeting/module/bottombar/function/FunctionItem$FunctionType;", "onMeetingUpgrade", "onPlaybackDigitalMute", "onReactionCollapse", "onReactionExpand", "onStart", "refreshCameraIcon", "isVideoMuted", "refreshMicIcon", "isAudioMuted", "setBottomBarViewInvisible", "invisible", "setCanBottomBarExpand", "canExpand", "setMessageView", "message", "Lcom/ss/android/vc/meeting/module/reaction/entity/InteractionMessage;", "setSpeakerMute", "showBreakoutRoomToolTip", "showEchoDialog", "task", "Ljava/lang/Runnable;", "showGuide", "guideType", "Lcom/ss/android/vc/lark/guidetips/VideoChatGuideConstants$GuideType;", "showHideBottomBarView", "show", "showHideBottomOtherView", "showMessage", "showRedDot", "updateCameraIcon", "updateCollapseAreaBgColor", "sharing", "updateExpandHeight", "updateExpandHeightWithTransition", "updateFunctionArea", "updateLiveAndRecord", "updateMicIcon", "muted", "updateParticipantNotify", "hasNotify", "updateParticipantNum", "num", "updateReactionLayoutRule", "judgeHeight", "updateShareText", "updateSpeakerView", "updateUnreadCount", "unreadCount", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.bottombar.c */
public final class BottomBarViewControl extends AbstractC61424d implements AbstractC61214a, AudioRouteHelper.IRouteAction, AbstractC61444a.AbstractC61445a, AbstractC61444a.AbstractC61446b, AbstractC61567a.AbstractC61568a {

    /* renamed from: A */
    public List<FunctionItem> f154135A = CollectionsKt.toMutableList((Collection) CollectionsKt.emptyList());

    /* renamed from: B */
    public AudioRouteHelper f154136B;

    /* renamed from: C */
    public DialogC25637f f154137C;

    /* renamed from: D */
    private int f154138D;

    /* renamed from: E */
    private View f154139E = findViewById(R.id.collapse_menu_container);

    /* renamed from: F */
    private View f154140F;

    /* renamed from: G */
    private View f154141G = findViewById(R.id.audio_container);

    /* renamed from: H */
    private ImageView f154142H = ((ImageView) findViewById(R.id.audio));

    /* renamed from: I */
    private TextView f154143I = ((TextView) findViewById(R.id.bottom_mic_text));

    /* renamed from: J */
    private View f154144J = findViewById(R.id.audio_forbid);

    /* renamed from: K */
    private View f154145K = findViewById(R.id.camera_container);

    /* renamed from: L */
    private ImageView f154146L = ((ImageView) findViewById(R.id.camera));

    /* renamed from: M */
    private TextView f154147M = ((TextView) findViewById(R.id.bottom_camera_text));

    /* renamed from: N */
    private View f154148N = findViewById(R.id.camera_forbid);

    /* renamed from: O */
    private View f154149O = findViewById(R.id.receiver_container);

    /* renamed from: P */
    private ImageView f154150P = ((ImageView) findViewById(R.id.receiver_icon));

    /* renamed from: Q */
    private TextView f154151Q = ((TextView) findViewById(R.id.receiver_text));

    /* renamed from: R */
    private View f154152R = findViewById(R.id.share_container);

    /* renamed from: S */
    private TextView f154153S = ((TextView) findViewById(R.id.share_text));

    /* renamed from: T */
    private View f154154T = findViewById(R.id.participant_container);

    /* renamed from: U */
    private ImageView f154155U = ((ImageView) findViewById(R.id.participant));

    /* renamed from: V */
    private TextView f154156V = ((TextView) findViewById(R.id.participant_num_textview));

    /* renamed from: W */
    private View f154157W = findViewById(R.id.participant_has_notify);

    /* renamed from: X */
    private LineHeightTextView f154158X = ((LineHeightTextView) findViewById(R.id.participant_txt));

    /* renamed from: Y */
    private RelativeLayout f154159Y = ((RelativeLayout) findViewById(R.id.expand_area));

    /* renamed from: Z */
    private LinearLayout f154160Z = ((LinearLayout) findViewById(R.id.ll_function_and_host_control));

    /* renamed from: a */
    public final String f154161a = "BottomBarViewControl";
    private LinearLayout aa = ((LinearLayout) findViewById(R.id.ll_function_and_host_control_without_bg));
    private C61503b ab;
    private C62557a ac;
    private View ad;
    private FrameLayout ae = ((FrameLayout) findViewById(R.id.fl_collapse_bottom_bar_title));
    private View af = findViewById(R.id.iv_bottom_bar_arrow_expand);
    private LinearLayout ag = ((LinearLayout) findViewById(R.id.container_bottom_extra_layout));
    private ViewTreeObserver.OnGlobalLayoutListener ah;

    /* renamed from: ai  reason: collision with root package name */
    private int f175459ai;
    private final int aj = C60773o.m236126d(R.color.ud_N00);
    private int ak = ((C60776r.m236139a() - (C60773o.m236115a(108.0d) * 3)) / 6);
    private boolean al;
    private boolean am = true;
    private int an;
    private double ao = 0.12d;

    /* renamed from: b */
    public final int f154162b = 8;

    /* renamed from: c */
    public BottomBarBottomSheetBehavior<View> f154163c;

    /* renamed from: d */
    public View f154164d = C60748b.m236068a(getActivity(), R.layout.vc_bottom_bar_layout, (FrameLayout) findViewById(R.id.container_bottom_bar), true);

    /* renamed from: e */
    public LinearLayout f154165e = ((LinearLayout) findViewById(R.id.collapse_area));

    /* renamed from: f */
    public ViewGroup f154166f = ((ViewGroup) findViewById(R.id.reaction_send_container));

    /* renamed from: g */
    public BottomBarFunctionRv f154167g;

    /* renamed from: h */
    public InstagramDotView f154168h;

    /* renamed from: i */
    public FrameLayout f154169i = ((FrameLayout) findViewById(R.id.bottom_bar_shadow));

    /* renamed from: j */
    public TextView f154170j = ((TextView) findViewById(R.id.bottombar_num_notify));

    /* renamed from: k */
    public View f154171k = findViewById(R.id.function_num_notify_container);

    /* renamed from: l */
    public View f154172l = findViewById(R.id.bottombar_has_notify);

    /* renamed from: m */
    public DesktopHostControlStub f154173m;

    /* renamed from: n */
    public View f154174n = findViewById(R.id.container_share_toolbar);

    /* renamed from: o */
    public View f154175o = findViewById(R.id.container_subtitle);

    /* renamed from: p */
    public View f154176p = findViewById(R.id.container_bottom_stub);

    /* renamed from: q */
    public final ArgbEvaluator f154177q = new ArgbEvaluator();

    /* renamed from: r */
    public final int f154178r = C60773o.m236126d(R.color.vctoken_meeting_bg_actionpanel);

    /* renamed from: s */
    public final int f154179s = C60773o.m236126d(R.color.vc_transparent);

    /* renamed from: t */
    public final int f154180t = C60773o.m236126d(R.color.vctoken_meeting_fill_mask);

    /* renamed from: u */
    public int f154181u = 4;

    /* renamed from: v */
    public boolean f154182v = true;

    /* renamed from: w */
    public boolean f154183w = true;

    /* renamed from: x */
    public float f154184x = -1.1f;

    /* renamed from: y */
    public ConstraintLayout f154185y = ((ConstraintLayout) findViewById(R.id.stub_new_message));

    /* renamed from: z */
    public ConstraintLayout f154186z = ((ConstraintLayout) findViewById(R.id.stub_breakout_help_view));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/bottombar/BottomBarViewControl$initFunctionArea$1", "Lcom/ss/android/vc/meeting/module/foregroundservice/IdleHandlerManager$Task;", "getTimeOutInMs", "", "run", "", "timeOut", "", "taskTime", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$j */
    public static final class C61473j extends C61869a.AbstractC61872b {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154201a;

        @Override // com.ss.android.vc.meeting.module.foregroundservice.C61869a.AbstractC61872b
        /* renamed from: a */
        public long mo212168a() {
            return 1000;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/vc/meeting/module/bottombar/BottomBarViewControl$initFunctionArea$1$run$2", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$j$a */
        public static final class C61474a extends RecyclerView.AbstractC1335d {
            C61474a() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                Intrinsics.checkParameterIsNotNull(rect, "outRect");
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
                Intrinsics.checkParameterIsNotNull(state, "state");
                rect.top = C60773o.m236115a(20.0d);
                rect.bottom = C60773o.m236115a(12.0d);
                rect.left = C60773o.m236115a(12.0d);
                rect.right = C60773o.m236115a(12.0d);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/bottombar/BottomBarViewControl$initFunctionArea$1$run$3", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$j$b */
        public static final class C61475b extends RecyclerView.OnScrollListener {

            /* renamed from: a */
            final /* synthetic */ C61473j f154202a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C61475b(C61473j jVar) {
                this.f154202a = jVar;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    int i2 = 0;
                    if (layoutManager instanceof GridLayoutManager) {
                        i2 = ((GridLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() / 8;
                    } else if (layoutManager instanceof LinearLayoutManager) {
                        i2 = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
                    }
                    InstagramDotView instagramDotView = this.f154202a.f154201a.f154168h;
                    if (instagramDotView != null) {
                        instagramDotView.mo208705b(i2);
                    }
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61473j(BottomBarViewControl cVar) {
            this.f154201a = cVar;
        }

        @Override // com.ss.android.vc.meeting.module.foregroundservice.C61869a.AbstractC61872b
        /* renamed from: a */
        public void mo212169a(boolean z, long j) {
            RecyclerView.Adapter adapter;
            RecyclerView.Adapter adapter2;
            RecyclerView.Adapter adapter3;
            List<FunctionItem> s = this.f154201a.mo213101s();
            if (this.f154201a.mo213095a(s)) {
                this.f154201a.f154135A = s;
                Iterator<T> it = s.iterator();
                String str = "functionList:";
                while (it.hasNext()) {
                    str = str + " " + it.next().getFuncType().name();
                }
                C60700b.m235851b(this.f154201a.f154161a, "[initFunctionArea]", str);
                int ceil = (int) Math.ceil((((double) s.size()) * 1.0d) / ((double) this.f154201a.f154162b));
                BottomBarFunctionRv bottomBarFunctionRv = this.f154201a.f154167g;
                C61503b bVar = null;
                if (bottomBarFunctionRv != null) {
                    adapter = bottomBarFunctionRv.getAdapter();
                } else {
                    adapter = null;
                }
                if (!(adapter instanceof C61503b)) {
                    adapter = null;
                }
                if (((C61503b) adapter) != null) {
                    BottomBarFunctionRv bottomBarFunctionRv2 = this.f154201a.f154167g;
                    if (bottomBarFunctionRv2 != null) {
                        bottomBarFunctionRv2.setLayoutManager(new LinearLayoutManager(this.f154201a.getContext(), 0, false));
                    }
                    BottomBarFunctionRv bottomBarFunctionRv3 = this.f154201a.f154167g;
                    if (bottomBarFunctionRv3 != null) {
                        adapter3 = bottomBarFunctionRv3.getAdapter();
                    } else {
                        adapter3 = null;
                    }
                    if (adapter3 instanceof C61503b) {
                        bVar = adapter3;
                    }
                    C61503b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.mo213150a(s, ceil);
                    }
                } else {
                    BottomBarFunctionRv bottomBarFunctionRv4 = this.f154201a.f154167g;
                    if (bottomBarFunctionRv4 != null) {
                        bottomBarFunctionRv4.setLayoutManager(new LinearLayoutManager(this.f154201a.getContext(), 0, false));
                    }
                    BottomBarFunctionRv bottomBarFunctionRv5 = this.f154201a.f154167g;
                    if (bottomBarFunctionRv5 != null) {
                        bottomBarFunctionRv5.addItemDecoration(new C61474a());
                    }
                    BottomBarFunctionRv bottomBarFunctionRv6 = this.f154201a.f154167g;
                    if (bottomBarFunctionRv6 != null) {
                        bottomBarFunctionRv6.setAdapter(new C61503b(this.f154201a.getActivity(), this.f154201a.getMeeting(), s, ceil, this.f154201a.f154162b, this.f154201a));
                    }
                    BottomBarFunctionRv bottomBarFunctionRv7 = this.f154201a.f154167g;
                    if (bottomBarFunctionRv7 != null) {
                        bottomBarFunctionRv7.addOnScrollListener(new C61475b(this));
                    }
                    new C1395n().attachToRecyclerView(this.f154201a.f154167g);
                    BottomBarFunctionRv bottomBarFunctionRv8 = this.f154201a.f154167g;
                    if (!(bottomBarFunctionRv8 == null || (adapter2 = bottomBarFunctionRv8.getAdapter()) == null)) {
                        adapter2.notifyDataSetChanged();
                    }
                }
                this.f154201a.mo213097c(ceil);
                this.f154201a.mo213067k();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: n */
    public void mo213070n() {
        mo213100r();
    }

    @Override // com.ss.android.vc.meeting.module.chat.p3115a.AbstractC61567a.AbstractC61568a
    /* renamed from: v */
    public IMSource mo213104v() {
        return IMSource.BOTTOM_BAR;
    }

    /* renamed from: a */
    public final boolean mo213095a(List<FunctionItem> list) {
        if (list.size() != this.f154135A.size()) {
            return true;
        }
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (this.f154135A.get(i).getFuncType() != t.getFuncType()) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    /* renamed from: H */
    private final void m239969H() {
        mo213047a(VideoChatGuideConstants.GuideType.chatAndReaction);
    }

    @Override // com.ss.android.vc.meeting.module.audio.AudioRouteHelper.IRouteAction
    public void bV_() {
        MeetingAudioManager.m239471k().mo212708m();
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: j */
    public void mo213066j() {
        mo213070n();
        m239970I();
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: k */
    public void mo213067k() {
        m239989z();
        m239962A();
    }

    /* renamed from: R */
    private final void m239979R() {
        C60735ab.m236018e(new RunnableC61496z(this));
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a
    public boolean bS_() {
        C60700b.m235851b(this.f154161a, "[onBackPressed]", "onBackPressed");
        mo213069m();
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: g */
    public void mo213060g() {
        C26171w.m94675a(new RunnableC61491v(this));
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a, com.ss.android.vc.meeting.module.base.AbstractC61424d
    public Activity getActivity() {
        return C60773o.m236124b(getContext());
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: m */
    public void mo213069m() {
        BottomBarBottomSheetBehavior<View> bottomBarBottomSheetBehavior = this.f154163c;
        if (bottomBarBottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
        }
        bottomBarBottomSheetBehavior.mo212990b(4);
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: p */
    public void mo213072p() {
        this.al = false;
        C60700b.m235851b(this.f154161a, "[onReactionCollapse]", "onReactionCollapse");
        m239964C();
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: q */
    public void mo213073q() {
        DialogC25637f fVar = this.f154137C;
        if (fVar != null) {
            fVar.dismiss();
        }
        this.f154137C = null;
    }

    /* renamed from: r */
    public final void mo213100r() {
        C61869a.m241680a().mo214246a(new C61473j(this));
    }

    /* renamed from: t */
    public void mo213102t() {
        BottomBarBottomSheetBehavior<View> bottomBarBottomSheetBehavior = this.f154163c;
        if (bottomBarBottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
        }
        bottomBarBottomSheetBehavior.mo212990b(3);
    }

    @Override // com.ss.android.vc.meeting.module.chat.p3115a.AbstractC61567a.AbstractC61568a
    /* renamed from: u */
    public boolean mo213103u() {
        ConstraintLayout constraintLayout = this.f154185y;
        if (constraintLayout == null || constraintLayout == null || constraintLayout.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/bottombar/BottomBarViewControl$initMicBtn$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$l */
    public static final class C61477l extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154204a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$l$a */
        static final class RunnableC61478a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C61477l f154205a;

            RunnableC61478a(C61477l lVar) {
                this.f154205a = lVar;
            }

            public final void run() {
                C61303k meeting = this.f154205a.f154204a.getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
                meeting.ai().mo213025e();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61477l(BottomBarViewControl cVar) {
            this.f154204a = cVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            C61303k meeting = this.f154204a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            meeting.ai().mo213010a(new RunnableC61478a(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/bottombar/BottomBarViewControl$initParticipantBtnAsMulti$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$m */
    public static final class C61479m extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154206a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$m$a */
        static final class RunnableC61480a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C61479m f154207a;

            RunnableC61480a(C61479m mVar) {
                this.f154207a = mVar;
            }

            public final void run() {
                C61303k meeting = this.f154207a.f154206a.getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
                meeting.ai().mo213014b(this.f154207a.f154206a.getActivity());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61479m(BottomBarViewControl cVar) {
            this.f154206a = cVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            if (BottomBarViewControl.m239981a(this.f154206a).mo212982a() == 4) {
                C61303k meeting = this.f154206a.getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
                meeting.ai().mo213014b(this.f154206a.getActivity());
                return;
            }
            this.f154206a.mo213069m();
            C60735ab.m236002a(new RunnableC61480a(this), 200);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/bottombar/BottomBarViewControl$initParticipantBtnAsSingle$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$n */
    public static final class C61481n extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154208a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$n$a */
        static final class RunnableC61482a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C61481n f154209a;

            RunnableC61482a(C61481n nVar) {
                this.f154209a = nVar;
            }

            public final void run() {
                C61303k meeting = this.f154209a.f154208a.getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
                meeting.ai().mo213014b(this.f154209a.f154208a.getActivity());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61481n(BottomBarViewControl cVar) {
            this.f154208a = cVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            if (BottomBarViewControl.m239981a(this.f154208a).mo212982a() == 4) {
                C61303k meeting = this.f154208a.getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
                meeting.ai().mo213014b(this.f154208a.getActivity());
                return;
            }
            this.f154208a.mo213069m();
            C60735ab.m236002a(new RunnableC61482a(this), 200);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/bottombar/BottomBarViewControl$initShareBtn$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$q */
    public static final class C61485q extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154212a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$q$a */
        static final class RunnableC61486a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C61485q f154213a;

            RunnableC61486a(C61485q qVar) {
                this.f154213a = qVar;
            }

            public final void run() {
                C61303k meeting = this.f154213a.f154212a.getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
                meeting.ai().mo213005a(this.f154213a.f154212a.getActivity());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61485q(BottomBarViewControl cVar) {
            this.f154212a = cVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            if (BottomBarViewControl.m239981a(this.f154212a).mo212982a() == 4) {
                C61303k meeting = this.f154212a.getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
                meeting.ai().mo213005a(this.f154212a.getActivity());
                return;
            }
            this.f154212a.mo213069m();
            C60735ab.m236002a(new RunnableC61486a(this), 200);
        }
    }

    /* renamed from: C */
    private final void m239964C() {
        m239963B();
        if (this.am) {
            BottomBarBottomSheetBehavior<View> bottomBarBottomSheetBehavior = this.f154163c;
            if (bottomBarBottomSheetBehavior == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            }
            if (bottomBarBottomSheetBehavior.mo212982a() == 3) {
                m239982a((ViewGroup) this.f154140F);
            }
        }
    }

    /* renamed from: F */
    private final void m239967F() {
        ViewTreeObserver viewTreeObserver;
        if (this.ah == null) {
            this.ah = new ViewTreeObserver$OnGlobalLayoutListenerC61467d(this);
        }
        LinearLayout linearLayout = this.ag;
        if (linearLayout != null && (viewTreeObserver = linearLayout.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.ah);
        }
    }

    /* renamed from: J */
    private final void m239971J() {
        TextView textView = this.f154156V;
        if (textView != null) {
            textView.setVisibility(0);
        }
        View view = this.f154157W;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f154154T;
        if (view2 != null) {
            view2.setOnClickListener(new C61479m(this));
        }
    }

    /* renamed from: N */
    private final void m239975N() {
        ImageView imageView = this.f154150P;
        if (imageView != null) {
            imageView.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_speaker_mute_filled));
        }
        TextView textView = this.f154151Q;
        if (textView != null) {
            textView.setText(R.string.View_MV_AlreadyMutedButton);
        }
    }

    /* renamed from: S */
    private final void m239980S() {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.aC().mo213385a(this);
    }

    /* renamed from: x */
    private final void m239987x() {
        if (C60776r.m236139a() < C60773o.m236115a(360.0d)) {
            int a = C60773o.m236115a(8.0d);
            View view = this.f154139E;
            if (view != null) {
                view.setPadding(a, 0, a, 0);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: h */
    public void mo213063h() {
        RecyclerView.Adapter adapter;
        BottomBarFunctionRv bottomBarFunctionRv = this.f154167g;
        C61503b bVar = null;
        if (bottomBarFunctionRv != null) {
            adapter = bottomBarFunctionRv.getAdapter();
        } else {
            adapter = null;
        }
        if (adapter instanceof C61503b) {
            bVar = adapter;
        }
        C61503b bVar2 = bVar;
        if (bVar2 != null) {
            bVar2.mo213148a();
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void init() {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.ai().mo213007a(this);
        m239967F();
        m239973L();
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: o */
    public void mo213071o() {
        this.al = true;
        C60700b.m235851b(this.f154161a, "[onReactionExpand]", "onReactionExpand");
        m239964C();
        MeetingChatReactionEvent.Companion aVar = MeetingChatReactionEvent.f160835a;
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        aVar.mo220281a(meeting);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$b */
    public static final class RunnableC61463b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154191a;

        RunnableC61463b(BottomBarViewControl cVar) {
            this.f154191a = cVar;
        }

        public final void run() {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            ConstraintLayout constraintLayout = this.f154191a.f154186z;
            if (constraintLayout != null) {
                constraintLayout.setAlpha(1.0f);
            }
            ConstraintLayout constraintLayout2 = this.f154191a.f154186z;
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(0);
            }
            ConstraintLayout constraintLayout3 = this.f154191a.f154186z;
            if (constraintLayout3 != null && (animate = constraintLayout3.animate()) != null && (alpha = animate.alpha(BitmapDescriptorFactory.HUE_RED)) != null && (duration = alpha.setDuration(500)) != null) {
                duration.setListener(new Animator.AnimatorListener(this) {
                    /* class com.ss.android.vc.meeting.module.bottombar.BottomBarViewControl.RunnableC61463b.C614641 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC61463b f154192a;

                    public void onAnimationRepeat(Animator animator) {
                    }

                    public void onAnimationStart(Animator animator) {
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f154192a = r1;
                    }

                    public void onAnimationCancel(Animator animator) {
                        ConstraintLayout constraintLayout = this.f154192a.f154191a.f154186z;
                        if (constraintLayout != null) {
                            constraintLayout.setVisibility(8);
                        }
                    }

                    public void onAnimationEnd(Animator animator) {
                        ConstraintLayout constraintLayout = this.f154192a.f154191a.f154186z;
                        if (constraintLayout != null) {
                            constraintLayout.setVisibility(8);
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$c */
    public static final class RunnableC61465c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154193a;

        RunnableC61465c(BottomBarViewControl cVar) {
            this.f154193a = cVar;
        }

        public final void run() {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            ConstraintLayout constraintLayout = this.f154193a.f154185y;
            if (constraintLayout != null) {
                constraintLayout.setAlpha(1.0f);
            }
            ConstraintLayout constraintLayout2 = this.f154193a.f154185y;
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(0);
            }
            ConstraintLayout constraintLayout3 = this.f154193a.f154185y;
            if (constraintLayout3 != null && (animate = constraintLayout3.animate()) != null && (alpha = animate.alpha(BitmapDescriptorFactory.HUE_RED)) != null && (duration = alpha.setDuration(500)) != null) {
                duration.setListener(new Animator.AnimatorListener(this) {
                    /* class com.ss.android.vc.meeting.module.bottombar.BottomBarViewControl.RunnableC61465c.C614661 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC61465c f154194a;

                    public void onAnimationRepeat(Animator animator) {
                    }

                    public void onAnimationStart(Animator animator) {
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f154194a = r1;
                    }

                    public void onAnimationCancel(Animator animator) {
                        ConstraintLayout constraintLayout = this.f154194a.f154193a.f154185y;
                        if (constraintLayout != null) {
                            constraintLayout.setVisibility(8);
                        }
                    }

                    public void onAnimationEnd(Animator animator) {
                        ConstraintLayout constraintLayout = this.f154194a.f154193a.f154185y;
                        if (constraintLayout != null) {
                            constraintLayout.setVisibility(8);
                        }
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$y */
    static final class RunnableC61495y implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154225a;

        /* renamed from: b */
        final /* synthetic */ InteractionMessage f154226b;

        RunnableC61495y(BottomBarViewControl cVar, InteractionMessage aVar) {
            this.f154225a = cVar;
            this.f154226b = aVar;
        }

        public final void run() {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            this.f154225a.mo213094a(this.f154226b);
            ConstraintLayout constraintLayout = this.f154225a.f154185y;
            if (constraintLayout != null) {
                constraintLayout.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
            ConstraintLayout constraintLayout2 = this.f154225a.f154185y;
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(0);
            }
            ConstraintLayout constraintLayout3 = this.f154225a.f154185y;
            if (constraintLayout3 != null && (animate = constraintLayout3.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(500)) != null) {
                duration.setListener(null);
            }
        }
    }

    /* renamed from: I */
    private final void m239970I() {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        if (meeting.mo212058g() == VideoChat.Type.CALL) {
            m239972K();
        } else {
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            if (meeting2.mo212058g() == VideoChat.Type.MEET) {
                m239971J();
            }
        }
        LineHeightTextView lineHeightTextView = this.f154158X;
        if (lineHeightTextView != null) {
            lineHeightTextView.setText(R.string.View_M_Participants);
        }
        C61303k meeting3 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
        meeting3.ai().mo213043n();
    }

    /* renamed from: L */
    private final void m239973L() {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        AbstractC62782a af2 = meeting.af();
        Intrinsics.checkExpressionValueIsNotNull(af2, "meeting.telephoneControl");
        if (af2.mo216825c()) {
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            meeting2.af().mo216820a();
            C61303k meeting3 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
            meeting3.af().mo216823b();
        }
    }

    /* renamed from: O */
    private final void m239976O() {
        AbstractC61444a ai2;
        C61303k meeting = getMeeting();
        if (!(meeting == null || (ai2 = meeting.ai()) == null)) {
            DataAdapterUtil aVar = DataAdapterUtil.f154006a;
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            ai2.mo213031f(aVar.mo212855c(meeting2));
        }
        TextView textView = this.f154147M;
        if (textView != null) {
            textView.setText(R.string.View_VM_Camera);
        }
        View view = this.f154145K;
        if (view != null) {
            view.setOnClickListener(new C61472i(this));
        }
    }

    /* renamed from: P */
    private final void m239977P() {
        AbstractC61444a ai2;
        C61303k meeting = getMeeting();
        if (!(meeting == null || (ai2 = meeting.ai()) == null)) {
            DataAdapterUtil aVar = DataAdapterUtil.f154006a;
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            ai2.mo213035g(aVar.mo212853b(meeting2));
        }
        TextView textView = this.f154143I;
        if (textView != null) {
            textView.setText(R.string.View_G_MicAbbreviated);
        }
        View view = this.f154141G;
        if (view != null) {
            view.setOnClickListener(new C61477l(this));
        }
    }

    /* renamed from: Q */
    private final void m239978Q() {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        AbstractC62782a af2 = meeting.af();
        Intrinsics.checkExpressionValueIsNotNull(af2, "meeting.telephoneControl");
        if (af2.mo216826d()) {
            C60738ac.m236037c((int) R.string.View_G_PhoneCallMicCameraOff);
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            AbstractC62782a af3 = meeting2.af();
            Intrinsics.checkExpressionValueIsNotNull(af3, "meeting.telephoneControl");
            af3.mo216822a(false);
        }
    }

    /* renamed from: w */
    private final void m239986w() {
        m239987x();
        m239977P();
        m239976O();
        m239974M();
        m239970I();
        m239988y();
        m239966E();
        mo213065i();
        m239965D();
        mo213100r();
        m239980S();
        m239969H();
        m239979R();
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a, com.ss.android.vc.meeting.module.audio.AudioRouteHelper.IRouteAction
    public void bW_() {
        m239975N();
        DataAdapterUtil aVar = DataAdapterUtil.f154006a;
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        if (!aVar.mo212853b(meeting)) {
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            meeting2.ai().mo213025e();
            AudioRouteHelper bVar = this.f154136B;
            if (bVar != null) {
                bVar.mo212742c(true);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        ViewTreeObserver viewTreeObserver;
        LinearLayout linearLayout = this.ag;
        if (!(linearLayout == null || (viewTreeObserver = linearLayout.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.ah);
        }
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.ai().mo213015b(this);
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        meeting2.aC().mo213388b(this);
        AudioRouteHelper bVar = this.f154136B;
        if (bVar != null) {
            bVar.mo212739b();
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: e */
    public void mo213056e() {
        ImageView imageView = this.f154142H;
        if (imageView != null) {
            imageView.setEnabled(false);
        }
        View view = this.f154141G;
        if (view != null) {
            view.setClickable(false);
        }
        ImageView imageView2 = this.f154146L;
        if (imageView2 != null) {
            imageView2.setEnabled(false);
        }
        View view2 = this.f154145K;
        if (view2 != null) {
            view2.setClickable(false);
        }
        ImageView imageView3 = this.f154150P;
        if (imageView3 != null) {
            imageView3.setEnabled(false);
        }
        View view3 = this.f154149O;
        if (view3 != null) {
            view3.setClickable(false);
        }
        ImageView imageView4 = this.f154155U;
        if (imageView4 != null) {
            imageView4.setEnabled(false);
        }
        View view4 = this.f154154T;
        if (view4 != null) {
            view4.setClickable(false);
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: l */
    public boolean mo213068l() {
        View view;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.container_bottom_bar);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "container");
        if (frameLayout.getVisibility() == 0 && (view = this.f154176p) != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onStart() {
        m239978Q();
        DataAdapterUtil aVar = DataAdapterUtil.f154006a;
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        m239985l(aVar.mo212853b(meeting));
        DataAdapterUtil aVar2 = DataAdapterUtil.f154006a;
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        m239984k(aVar2.mo212855c(meeting2));
        if (C60776r.m236157o()) {
            m239968G();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$aa */
    public static final class RunnableC61462aa implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154189a;

        /* renamed from: b */
        final /* synthetic */ int f154190b;

        RunnableC61462aa(BottomBarViewControl cVar, int i) {
            this.f154189a = cVar;
            this.f154190b = i;
        }

        public final void run() {
            String str;
            if (this.f154190b <= 0) {
                TextView textView = this.f154189a.f154170j;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                View view = this.f154189a.f154171k;
                if (view != null) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            String str2 = this.f154189a.f154161a;
            C60700b.m235851b(str2, "[updateUnreadCount]", "num = " + this.f154190b);
            int i = this.f154190b;
            if (i <= 999) {
                str = String.valueOf(i);
            } else {
                str = "···";
            }
            TextView textView2 = this.f154189a.f154170j;
            if (textView2 != null) {
                textView2.setText(str);
            }
            TextView textView3 = this.f154189a.f154170j;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            View view2 = this.f154189a.f154171k;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = this.f154189a.f154172l;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onGlobalLayout"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$d */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC61467d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154195a;

        ViewTreeObserver$OnGlobalLayoutListenerC61467d(BottomBarViewControl cVar) {
            this.f154195a = cVar;
        }

        public final void onGlobalLayout() {
            Integer num;
            Integer num2 = null;
            if (this.f154195a.f154175o != null) {
                View view = this.f154195a.f154175o;
                if (view != null) {
                    num = Integer.valueOf(view.getMeasuredHeight());
                } else {
                    num = null;
                }
                if (num == null) {
                    Intrinsics.throwNpe();
                }
                if (num.intValue() > 0) {
                    View view2 = this.f154195a.f154176p;
                    if (view2 != null) {
                        view2.setBackgroundColor(C60773o.m236126d(R.color.vc_bg_body));
                        return;
                    }
                    return;
                }
            }
            if (this.f154195a.f154174n != null) {
                View view3 = this.f154195a.f154174n;
                if (view3 != null) {
                    num2 = Integer.valueOf(view3.getMeasuredHeight());
                }
                if (num2 == null) {
                    Intrinsics.throwNpe();
                }
                if (num2.intValue() > 0) {
                    View view4 = this.f154195a.f154176p;
                    if (view4 != null) {
                        view4.setBackgroundColor(C60773o.m236126d(R.color.vc_bg_mobile_share_bar));
                        return;
                    }
                    return;
                }
            }
            View view5 = this.f154195a.f154176p;
            if (view5 != null) {
                view5.setBackgroundColor(C60773o.m236126d(R.color.vc_bg_body));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$v */
    static final class RunnableC61491v implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154220a;

        RunnableC61491v(BottomBarViewControl cVar) {
            this.f154220a = cVar;
        }

        public final void run() {
            LineHeightTextView lineHeightTextView;
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            ConstraintLayout constraintLayout = this.f154220a.f154186z;
            if (constraintLayout != null) {
                lineHeightTextView = (LineHeightTextView) constraintLayout.findViewById(R.id.tv_help_content);
            } else {
                lineHeightTextView = null;
            }
            if (lineHeightTextView != null) {
                lineHeightTextView.setText(UIHelper.getString(R.string.View_G_AskHostForHelpInfo));
            }
            ConstraintLayout constraintLayout2 = this.f154220a.f154186z;
            if (constraintLayout2 != null) {
                constraintLayout2.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
            ConstraintLayout constraintLayout3 = this.f154220a.f154186z;
            if (constraintLayout3 != null) {
                constraintLayout3.setVisibility(0);
            }
            ConstraintLayout constraintLayout4 = this.f154220a.f154186z;
            if (!(constraintLayout4 == null || (animate = constraintLayout4.animate()) == null || (alpha = animate.alpha(1.0f)) == null || (duration = alpha.setDuration(500)) == null)) {
                duration.setListener(null);
            }
            C60735ab.m236002a(new Runnable(this) {
                /* class com.ss.android.vc.meeting.module.bottombar.BottomBarViewControl.RunnableC61491v.RunnableC614921 */

                /* renamed from: a */
                final /* synthetic */ RunnableC61491v f154221a;

                {
                    this.f154221a = r1;
                }

                public final void run() {
                    this.f154221a.f154220a.mo213099j(false);
                }
            }, 3000);
        }
    }

    /* renamed from: A */
    private final void m239962A() {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        AbstractC62555a aa2 = meeting.aa();
        Intrinsics.checkExpressionValueIsNotNull(aa2, "meeting.settingMoreControl");
        if (aa2.mo216272a()) {
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            AbsBreakoutRoomControl al2 = meeting2.al();
            Intrinsics.checkExpressionValueIsNotNull(al2, "meeting.breakoutRoomControl");
            if (al2.mo213181h()) {
                C61303k meeting3 = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
                AbsBreakoutRoomControl al3 = meeting3.al();
                Intrinsics.checkExpressionValueIsNotNull(al3, "meeting.breakoutRoomControl");
                if (!al3.mo213183j()) {
                    return;
                }
            }
            C61303k meeting4 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
            meeting4.am().mo214681f();
        }
    }

    /* renamed from: D */
    private final void m239965D() {
        int i;
        int b = C60776r.m236144b() - C60776r.m236148f();
        int b2 = C60773o.m236123b((int) R.dimen.bottom_bar_expand_state_height_as_unhost);
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        boolean z = false;
        if (meeting.aa().mo216286n()) {
            i = C60773o.m236123b((int) R.dimen.bottom_bar_host_control_area_height);
        } else {
            i = C60773o.m236123b((int) R.dimen.bottom_bar_reaction_expand_height_diff) + 0 + C60773o.m236123b((int) R.dimen.bottom_bar_view_pager_dot_height);
        }
        if (b > b2 + i) {
            z = true;
        }
        this.am = z;
        C61869a.m241680a().mo214246a(new C61484p(this));
    }

    /* renamed from: E */
    private final void m239966E() {
        BottomBarBottomSheetBehavior<View> b = BottomBarBottomSheetBehavior.m239800b(this.f154140F);
        Intrinsics.checkExpressionValueIsNotNull(b, "BottomBarBottomSheetBeha…r.from<View>(bottomSheet)");
        this.f154163c = b;
        if (b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
        }
        b.mo212990b(4);
        FrameLayout frameLayout = this.f154169i;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new View$OnClickListenerC61468e(this));
        }
        View view = this.af;
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC61469f(this));
        }
        FrameLayout frameLayout2 = this.ae;
        if (frameLayout2 != null) {
            frameLayout2.setOnClickListener(new View$OnClickListenerC61470g(this));
        }
        BottomBarBottomSheetBehavior<View> bottomBarBottomSheetBehavior = this.f154163c;
        if (bottomBarBottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
        }
        bottomBarBottomSheetBehavior.mo212986a(new C61471h(this));
        mo213069m();
    }

    /* renamed from: G */
    private final void m239968G() {
        int a = (C60776r.m236139a() - (C60773o.m236115a(108.0d) * 3)) / 6;
        if (a > this.ak) {
            String str = this.f154161a;
            C60700b.m235851b(str, "[checkDeviceWidth]", "width: " + a + " != rvItemHorizontalMargin: " + this.ak + ' ');
            this.ak = a;
            C61503b bVar = this.ab;
            if (bVar != null) {
                bVar.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: K */
    private final void m239972K() {
        Drawable drawable;
        TextView textView = this.f154156V;
        if (textView != null) {
            textView.setVisibility(0);
        }
        View view = this.f154157W;
        if (view != null) {
            view.setVisibility(8);
        }
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        if (meeting.ai().mo213018b()) {
            View view2 = this.f154154T;
            if (view2 != null) {
                view2.setOnClickListener(new C61481n(this));
                return;
            }
            return;
        }
        ImageView imageView = this.f154155U;
        if (!(imageView == null || (drawable = imageView.getDrawable()) == null)) {
            drawable.setTint(C60773o.m236126d(R.color.icon_disable));
        }
        TextView textView2 = this.f154156V;
        if (textView2 != null) {
            textView2.setTextColor(C60773o.m236126d(R.color.text_disable));
        }
        LineHeightTextView lineHeightTextView = this.f154158X;
        if (lineHeightTextView != null) {
            lineHeightTextView.setTextColor(C60773o.m236126d(R.color.text_disable));
        }
        View view3 = this.f154154T;
        if (view3 != null) {
            view3.setOnClickListener(View$OnClickListenerC61483o.f154210a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        if (r0.mo212923h() != false) goto L_0x0037;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m239988y() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f154161a
            java.lang.String r1 = "[initMoreBtn]"
            java.lang.String r2 = "needShowMoreBtn"
            com.ss.android.vc.common.p3077b.C60700b.m235851b(r0, r1, r2)
            android.view.View r0 = r3.f154152R
            r1 = 0
            if (r0 == 0) goto L_0x0011
            r0.setVisibility(r1)
        L_0x0011:
            android.view.View r0 = r3.f154152R
            if (r0 == 0) goto L_0x001f
            com.ss.android.vc.meeting.module.bottombar.c$q r2 = new com.ss.android.vc.meeting.module.bottombar.c$q
            r2.<init>(r3)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r0.setOnClickListener(r2)
        L_0x001f:
            com.ss.android.vc.meeting.module.base.i r0 = r3.mPresent
            java.lang.String r2 = "mPresent"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r0 = r0.mo212924i()
            if (r0 != 0) goto L_0x0037
            com.ss.android.vc.meeting.module.base.i r0 = r3.mPresent
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r0 = r0.mo212923h()
            if (r0 == 0) goto L_0x0038
        L_0x0037:
            r1 = 1
        L_0x0038:
            r3.mo213061g(r1)
            com.ss.android.vc.meeting.module.base.i r0 = r3.mPresent
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r0 = r0.mo212923h()
            r3.mo213064h(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.bottombar.BottomBarViewControl.m239988y():void");
    }

    /* renamed from: z */
    private final void m239989z() {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        AbstractC62555a aa2 = meeting.aa();
        Intrinsics.checkExpressionValueIsNotNull(aa2, "meeting.settingMoreControl");
        if (aa2.mo216272a()) {
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            AbsBreakoutRoomControl al2 = meeting2.al();
            Intrinsics.checkExpressionValueIsNotNull(al2, "meeting.breakoutRoomControl");
            if (al2.mo213181h()) {
                C61303k meeting3 = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
                AbsBreakoutRoomControl al3 = meeting3.al();
                Intrinsics.checkExpressionValueIsNotNull(al3, "meeting.breakoutRoomControl");
                if (!al3.mo213183j()) {
                    return;
                }
            }
            C61303k meeting4 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
            meeting4.mo212106X().mo217369g();
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: f */
    public void mo213058f() {
        View a;
        View a2;
        View a3;
        if (DesktopUtil.m144307b()) {
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            if (meeting.aa().mo216284l()) {
                DesktopHostControlStub aVar = this.f154173m;
                if (!(aVar == null || (a3 = aVar.mo216108a()) == null)) {
                    a3.setVisibility(0);
                }
                DesktopHostControlStub aVar2 = this.f154173m;
                if (aVar2 != null && (a2 = aVar2.mo216108a()) != null) {
                    a2.setOnClickListener(new View$OnClickListenerC61476k(this));
                    return;
                }
                return;
            }
            DesktopHostControlStub aVar3 = this.f154173m;
            if (aVar3 != null && (a = aVar3.mo216108a()) != null) {
                a.setVisibility(8);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: i */
    public void mo213065i() {
        if (this.ac == null) {
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            if (!(!meeting.aa().mo216286n() || getMeeting() == null || getRootView() == null)) {
                C62557a aVar = new C62557a(getMeeting(), null, getActivity(), this);
                this.ac = aVar;
                if (aVar != null) {
                    aVar.mo216328b(getRootView());
                }
            }
        }
        if (this.ac != null) {
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            if (meeting2.aa().mo216286n()) {
                C62557a aVar2 = this.ac;
                if (aVar2 != null) {
                    aVar2.mo216324a(0);
                }
                C62557a aVar3 = this.ac;
                if (aVar3 != null) {
                    aVar3.mo216327b();
                }
            } else {
                C62557a aVar4 = this.ac;
                if (aVar4 != null) {
                    aVar4.mo216324a(8);
                }
            }
            C62557a aVar5 = this.ac;
            if (aVar5 != null) {
                aVar5.mo216323a();
            }
        }
        m239963B();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$z */
    public static final class RunnableC61496z implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154227a;

        RunnableC61496z(BottomBarViewControl cVar) {
            this.f154227a = cVar;
        }

        public final void run() {
            boolean z;
            boolean z2;
            C61303k meeting = this.f154227a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            AbstractC61417a W = meeting.mo212105W();
            Intrinsics.checkExpressionValueIsNotNull(W, "meeting.meetingControl");
            AbstractC61566a s = W.mo212840s();
            Intrinsics.checkExpressionValueIsNotNull(s, "meeting.meetingControl.chatControl");
            boolean z3 = true;
            if (s.mo213380i() >= 1) {
                BottomBarViewControl cVar = this.f154227a;
                C61303k meeting2 = cVar.getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
                AbstractC61417a W2 = meeting2.mo212105W();
                Intrinsics.checkExpressionValueIsNotNull(W2, "meeting.meetingControl");
                AbstractC61566a s2 = W2.mo212840s();
                Intrinsics.checkExpressionValueIsNotNull(s2, "meeting.meetingControl.chatControl");
                cVar.mo213050b(s2.mo213380i());
                return;
            }
            IVideoChatDependency dependency = VideoChatModule.getDependency();
            Intrinsics.checkExpressionValueIsNotNull(dependency, "VideoChatModule.getDependency()");
            AbstractC60902q guideDependency = dependency.getGuideDependency();
            C61303k meeting3 = this.f154227a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
            AbstractC62555a aa = meeting3.aa();
            Intrinsics.checkExpressionValueIsNotNull(aa, "meeting.settingMoreControl");
            if (!aa.mo216275c() || !guideDependency.checkToShow("all_vc_subtitles")) {
                z = false;
            } else {
                z = true;
            }
            boolean a = LabsUtils.m242901a();
            C61303k meeting4 = this.f154227a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
            AbstractC62555a aa2 = meeting4.aa();
            Intrinsics.checkExpressionValueIsNotNull(aa2, "meeting.settingMoreControl");
            if (!aa2.mo216279g()) {
                z2 = false;
            } else if (this.f154227a.getMeeting().f153550c == VideoChat.Type.MEET) {
                z2 = guideDependency.checkToShow("all_vc_meet_live_entrance");
            } else {
                z2 = guideDependency.checkToShow("all_vc_call_live_entrance");
            }
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            if (!z && !z2 && !a) {
                z3 = false;
            }
            booleanRef.element = z3;
            String str = this.f154227a.f154161a;
            C60700b.m235851b(str, "[showSettingMoreRedDot]", "shouldShowRedDot=" + booleanRef.element + " , shouldShowSubtitleGuide=" + z + ' ' + ", shouldShowLivestreamEntranceGuide=" + z2 + ", shouldShowLabsGuide=" + a);
            C26171w.m94675a(new Runnable(this) {
                /* class com.ss.android.vc.meeting.module.bottombar.BottomBarViewControl.RunnableC61496z.RunnableC614971 */

                /* renamed from: a */
                final /* synthetic */ RunnableC61496z f154228a;

                {
                    this.f154228a = r1;
                }

                public final void run() {
                    int i;
                    View view = this.f154228a.f154227a.f154172l;
                    if (view != null) {
                        if (booleanRef.element) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        view.setVisibility(i);
                    }
                }
            });
        }
    }

    /* renamed from: B */
    private final void m239963B() {
        ViewGroup.LayoutParams layoutParams;
        int i;
        View view = this.f154140F;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        int b = C60773o.m236123b((int) R.dimen.bottom_bar_expand_state_height_as_unhost);
        if (this.f154138D <= 4) {
            b -= C60773o.m236115a(102.0d);
        }
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        int i2 = 0;
        if (meeting.aa().mo216286n()) {
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            if (meeting2.aa().mo216285m()) {
                i = C60773o.m236123b((int) R.dimen.bottom_bar_host_control_area_height);
            } else {
                i = C60773o.m236123b((int) R.dimen.bottom_bar_host_control_area_height) - C60773o.m236123b((int) R.dimen.host_advance_option_area_height);
            }
        } else {
            i = 0;
        }
        m239983d(b + i + this.f175459ai + C60773o.m236123b((int) R.dimen.bottom_bar_reaction_expand_height_diff));
        if (this.al && this.am) {
            i2 = C60773o.m236123b((int) R.dimen.bottom_bar_reaction_expand_height_diff);
        }
        int i3 = b + this.f175459ai + i + i2;
        this.an = i3;
        if (layoutParams != null) {
            layoutParams.height = i3;
        }
        View view2 = this.f154140F;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams);
        }
        this.ao = ((double) C60773o.m236115a(76.0d)) / ((double) this.an);
    }

    /* renamed from: M */
    private final void m239974M() {
        String str = this.f154161a;
        StringBuilder sb = new StringBuilder();
        sb.append("isPlaybackDigitalMute: ");
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        sb.append(meeting.mo212092J().mo212510G());
        C60700b.m235851b(str, "[initSpeakerBtn]", sb.toString());
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        if (meeting2.mo212092J().mo212510G()) {
            m239975N();
        } else {
            C61303k meeting3 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
            Boolean E = meeting3.mo212092J().mo212508E();
            if (E != null) {
                AbstractC61429i iVar = this.mPresent;
                Intrinsics.checkExpressionValueIsNotNull(iVar, "mPresent");
                if (!iVar.mo212924i()) {
                    AbstractC61429i iVar2 = this.mPresent;
                    Intrinsics.checkExpressionValueIsNotNull(iVar2, "mPresent");
                    if (!iVar2.mo212922g()) {
                        MeetingAudioManager.m239471k().mo212702f(!E.booleanValue());
                    }
                }
            }
            mo213054d();
        }
        View view = this.f154149O;
        if (view != null) {
            view.setOnClickListener(new C61487r(this));
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: d */
    public void mo213054d() {
        MeetingAudioManager k = MeetingAudioManager.m239471k();
        Intrinsics.checkExpressionValueIsNotNull(k, "MeetingAudioManager.getInstance()");
        if (k.mo212721z()) {
            ImageView imageView = this.f154150P;
            if (imageView != null) {
                imageView.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_speaker_filled));
            }
            TextView textView = this.f154151Q;
            if (textView != null) {
                textView.setText(R.string.View_A_Speaker);
                return;
            }
            return;
        }
        MeetingAudioManager k2 = MeetingAudioManager.m239471k();
        Intrinsics.checkExpressionValueIsNotNull(k2, "MeetingAudioManager.getInstance()");
        MeetingAudioManager.AudioType y = k2.mo212720y();
        if (y != null) {
            int i = C61498d.f154230a[y.ordinal()];
            if (i == 1) {
                ImageView imageView2 = this.f154150P;
                if (imageView2 != null) {
                    imageView2.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_ear_outlined));
                }
                TextView textView2 = this.f154151Q;
                if (textView2 != null) {
                    textView2.setText(R.string.View_G_Receiver);
                }
            } else if (i == 2) {
                ImageView imageView3 = this.f154150P;
                if (imageView3 != null) {
                    imageView3.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_bluetooth_filled));
                }
                TextView textView3 = this.f154151Q;
                if (textView3 != null) {
                    textView3.setText(R.string.View_G_Bluetooth);
                }
            } else if (i == 3) {
                ImageView imageView4 = this.f154150P;
                if (imageView4 != null) {
                    imageView4.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_headphone_filled));
                }
                TextView textView4 = this.f154151Q;
                if (textView4 != null) {
                    textView4.setText(R.string.View_G_Headphones);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$s */
    static final class RunnableC61488s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154215a;

        /* renamed from: b */
        final /* synthetic */ FunctionItem.FunctionType f154216b;

        /* renamed from: c */
        final /* synthetic */ View f154217c;

        RunnableC61488s(BottomBarViewControl cVar, FunctionItem.FunctionType functionType, View view) {
            this.f154215a = cVar;
            this.f154216b = functionType;
            this.f154217c = view;
        }

        public final void run() {
            switch (C61498d.f154231b[this.f154216b.ordinal()]) {
                case 1:
                    C61303k meeting = this.f154215a.getMeeting();
                    Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
                    meeting.ai().mo213022c(this.f154215a.getActivity());
                    return;
                case 2:
                    C61303k meeting2 = this.f154215a.getMeeting();
                    Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
                    meeting2.ai().by_();
                    return;
                case 3:
                    C61303k meeting3 = this.f154215a.getMeeting();
                    Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
                    meeting3.ai().mo213041j();
                    return;
                case 4:
                    C61303k meeting4 = this.f154215a.getMeeting();
                    Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
                    meeting4.ai().mo213006a(this.f154217c, this.f154215a.getActivity());
                    View findViewById = this.f154217c.findViewById(R.id.function_onboarding);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById<View>(R.id.function_onboarding)");
                    findViewById.setVisibility(8);
                    return;
                case 5:
                    C61303k meeting5 = this.f154215a.getMeeting();
                    Intrinsics.checkExpressionValueIsNotNull(meeting5, "meeting");
                    meeting5.ai().mo213024d(this.f154215a.getActivity());
                    View findViewById2 = this.f154217c.findViewById(R.id.function_onboarding);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById<View>(R.id.function_onboarding)");
                    findViewById2.setVisibility(8);
                    return;
                case 6:
                    C61303k meeting6 = this.f154215a.getMeeting();
                    Intrinsics.checkExpressionValueIsNotNull(meeting6, "meeting");
                    meeting6.ai().mo213026e(this.f154215a.getActivity());
                    View findViewById3 = this.f154217c.findViewById(R.id.function_onboarding);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById<View>(R.id.function_onboarding)");
                    findViewById3.setVisibility(8);
                    return;
                case 7:
                    C61303k meeting7 = this.f154215a.getMeeting();
                    Intrinsics.checkExpressionValueIsNotNull(meeting7, "meeting");
                    meeting7.ai().mo213030f(this.f154215a.getActivity());
                    return;
                case 8:
                    C61303k meeting8 = this.f154215a.getMeeting();
                    Intrinsics.checkExpressionValueIsNotNull(meeting8, "meeting");
                    meeting8.ai().mo213034g(this.f154215a.getActivity());
                    return;
                case 9:
                    C61303k meeting9 = this.f154215a.getMeeting();
                    Intrinsics.checkExpressionValueIsNotNull(meeting9, "meeting");
                    meeting9.ai().mo213038h(this.f154215a.getActivity());
                    return;
                case 10:
                    C61303k meeting10 = this.f154215a.getMeeting();
                    Intrinsics.checkExpressionValueIsNotNull(meeting10, "meeting");
                    meeting10.ai().mo213040i(this.f154215a.getActivity());
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x022d, code lost:
        if (r1.mo216380c() != false) goto L_0x022f;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.vc.meeting.module.bottombar.function.FunctionItem> mo213101s() {
        /*
        // Method dump skipped, instructions count: 582
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.bottombar.BottomBarViewControl.mo213101s():java.util.List");
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: b */
    public void mo213051b(boolean z) {
        m239984k(z);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "show", "", "callback"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$a */
    public static final class C61461a implements C61938d.AbstractC61940a {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154188a;

        C61461a(BottomBarViewControl cVar) {
            this.f154188a = cVar;
        }

        @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.C61938d.AbstractC61940a
        /* renamed from: a */
        public final void mo213105a(boolean z) {
            if (z) {
                this.f154188a.mo213100r();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/vc/meeting/module/bottombar/BottomBarViewControl$initBottomSheet$4", "Lcom/ss/android/vc/meeting/module/bottombar/BottomBarBottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$h */
    public static final class C61471h extends BottomBarBottomSheetBehavior.AbstractC61442a {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154199a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61471h(BottomBarViewControl cVar) {
            this.f154199a = cVar;
        }

        @Override // com.ss.android.vc.meeting.module.bottombar.BottomBarBottomSheetBehavior.AbstractC61442a
        /* renamed from: a */
        public void mo213001a(View view, float f) {
            Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
            if (Float.valueOf(FloatCompanionObject.f173206a.mo239332b()).equals(Float.valueOf(f))) {
                FrameLayout frameLayout = this.f154199a.f154169i;
                if (frameLayout != null) {
                    frameLayout.setBackgroundColor(this.f154199a.f154180t);
                }
                view.setBackgroundColor(this.f154199a.f154178r);
                return;
            }
            BottomBarViewControl cVar = this.f154199a;
            boolean z = false;
            if (f - cVar.f154184x > ((float) 0)) {
                z = true;
            }
            cVar.f154182v = z;
            this.f154199a.f154184x = f;
            float abs = Math.abs(f);
            Object evaluate = this.f154199a.f154177q.evaluate(abs, Integer.valueOf(this.f154199a.f154179s), Integer.valueOf(this.f154199a.f154180t));
            if (evaluate != null) {
                int intValue = ((Integer) evaluate).intValue();
                FrameLayout frameLayout2 = this.f154199a.f154169i;
                if (frameLayout2 != null) {
                    frameLayout2.setBackgroundColor(intValue);
                }
                this.f154199a.mo213093a(abs);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }

        @Override // com.ss.android.vc.meeting.module.bottombar.BottomBarBottomSheetBehavior.AbstractC61442a
        /* renamed from: a */
        public void mo213002a(View view, int i) {
            AbsReactionControl ar;
            Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
            if (i == 1) {
                C60700b.m235851b(this.f154199a.f154161a, "[onStateChanged3]", "newState is STATE_DRAGGING");
                FrameLayout frameLayout = this.f154199a.f154169i;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
                View view2 = this.f154199a.f154172l;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                View view3 = this.f154199a.f154171k;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                this.f154199a.mo213098i(false);
            } else if (i == 2) {
                C60700b.m235851b(this.f154199a.f154161a, "[onStateChanged4]", "newState is STATE_SETTLING");
                FrameLayout frameLayout2 = this.f154199a.f154169i;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(0);
                }
                View view4 = this.f154199a.f154172l;
                if (view4 != null) {
                    view4.setVisibility(8);
                }
                View view5 = this.f154199a.f154171k;
                if (view5 != null) {
                    view5.setVisibility(8);
                }
                this.f154199a.mo213098i(false);
            } else if (i == 3) {
                C60700b.m235851b(this.f154199a.f154161a, "[onStateChanged]", "newState is STATE_EXPANDED");
                FrameLayout frameLayout3 = this.f154199a.f154169i;
                if (frameLayout3 != null) {
                    frameLayout3.setVisibility(0);
                }
                View view6 = this.f154199a.f154172l;
                if (view6 != null) {
                    view6.setVisibility(8);
                }
                View view7 = this.f154199a.f154171k;
                if (view7 != null) {
                    view7.setVisibility(8);
                }
                LinearLayout linearLayout = this.f154199a.f154165e;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                this.f154199a.mo213098i(false);
                this.f154199a.f154181u = 3;
                this.f154199a.f154182v = false;
                if (this.f154199a.f154183w) {
                    this.f154199a.f154183w = false;
                    C61303k meeting = this.f154199a.getMeeting();
                    if (!(meeting == null || (ar = meeting.ar()) == null)) {
                        ar.mo216859c();
                    }
                }
                if (this.f154199a.getActivity() != null) {
                    Activity activity = this.f154199a.getActivity();
                    if (activity != null) {
                        ((MeetingActivity) activity).mo212771a(this.f154199a);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.vc.meeting.module.base.MeetingActivity");
                    }
                }
                View view8 = this.f154199a.f154164d;
                if (view8 != null) {
                    view8.setFocusableInTouchMode(true);
                }
                View view9 = this.f154199a.f154164d;
                if (view9 != null) {
                    view9.requestFocus();
                }
                MeetingControlBarEvent.Companion aVar = MeetingControlBarEvent.f160837a;
                C61303k meeting2 = this.f154199a.getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
                aVar.mo220285a(meeting2);
            } else if (i == 4) {
                C60700b.m235851b(this.f154199a.f154161a, "[onStateChanged2]", "newState is STATE_COLLAPSED");
                FrameLayout frameLayout4 = this.f154199a.f154169i;
                if (frameLayout4 != null) {
                    frameLayout4.setVisibility(8);
                }
                BottomBarViewControl cVar = this.f154199a;
                C61303k meeting3 = cVar.getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
                AbstractC61417a W = meeting3.mo212105W();
                Intrinsics.checkExpressionValueIsNotNull(W, "meeting.meetingControl");
                AbstractC61566a s = W.mo212840s();
                Intrinsics.checkExpressionValueIsNotNull(s, "meeting.meetingControl.chatControl");
                cVar.mo213050b(s.mo213380i());
                BottomBarFunctionRv bottomBarFunctionRv = this.f154199a.f154167g;
                if (bottomBarFunctionRv != null) {
                    bottomBarFunctionRv.scrollToPosition(0);
                }
                InstagramDotView instagramDotView = this.f154199a.f154168h;
                if (instagramDotView != null) {
                    instagramDotView.mo208705b(0);
                }
                this.f154199a.f154181u = 4;
                this.f154199a.f154182v = true;
                if (this.f154199a.getActivity() != null) {
                    Activity activity2 = this.f154199a.getActivity();
                    if (activity2 != null) {
                        ((MeetingActivity) activity2).mo212776b(this.f154199a);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.vc.meeting.module.base.MeetingActivity");
                    }
                }
                LinearLayout linearLayout2 = this.f154199a.f154165e;
                if (linearLayout2 != null) {
                    linearLayout2.setAlpha(1.0f);
                }
                LinearLayout linearLayout3 = this.f154199a.f154165e;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(0);
                }
                C61303k meeting4 = this.f154199a.getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
                meeting4.ar().mo216860d();
            } else if (i == 5) {
                C60700b.m235851b(this.f154199a.f154161a, "[onStateChanged5]", "newState is STATE_HIDDEN");
                FrameLayout frameLayout5 = this.f154199a.f154169i;
                if (frameLayout5 != null) {
                    frameLayout5.setVisibility(8);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/bottombar/BottomBarViewControl$initCameraBtn$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$i */
    public static final class C61472i extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154200a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61472i(BottomBarViewControl cVar) {
            this.f154200a = cVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            C61303k meeting = this.f154200a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            meeting.ai().mo213033g();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$o */
    public static final class View$OnClickListenerC61483o implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC61483o f154210a = new View$OnClickListenerC61483o();

        View$OnClickListenerC61483o() {
        }

        public final void onClick(View view) {
            C60738ac.m236037c((int) R.string.View_G_OtherUserUnsupported);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/bottombar/BottomBarViewControl$initReactionArea$1", "Lcom/ss/android/vc/meeting/module/foregroundservice/IdleHandlerManager$Task;", "getTimeOutInMs", "", "run", "", "timeOut", "", "taskTime", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$p */
    public static final class C61484p extends C61869a.AbstractC61872b {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154211a;

        @Override // com.ss.android.vc.meeting.module.foregroundservice.C61869a.AbstractC61872b
        /* renamed from: a */
        public long mo212168a() {
            return 1000;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61484p(BottomBarViewControl cVar) {
            this.f154211a = cVar;
        }

        @Override // com.ss.android.vc.meeting.module.foregroundservice.C61869a.AbstractC61872b
        /* renamed from: a */
        public void mo212169a(boolean z, long j) {
            C61303k meeting = this.f154211a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            meeting.ar().mo216846a(this.f154211a.f154166f);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/bottombar/BottomBarViewControl$initSpeakerBtn$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$r */
    public static final class C61487r extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154214a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61487r(BottomBarViewControl cVar) {
            this.f154214a = cVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            C61303k meeting = this.f154214a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            AbstractC61444a ai2 = meeting.ai();
            AudioRouteHelper bVar = this.f154214a.f154136B;
            if (bVar == null) {
                Intrinsics.throwNpe();
            }
            ai2.mo213039h(bVar.mo212738a(this.f154214a.getActivity()));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$g */
    public static final class View$OnClickListenerC61470g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154198a;

        View$OnClickListenerC61470g(BottomBarViewControl cVar) {
            this.f154198a = cVar;
        }

        public final void onClick(View view) {
            this.f154198a.mo213102t();
            this.f154198a.mo213099j(false);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ BottomBarBottomSheetBehavior m239981a(BottomBarViewControl cVar) {
        BottomBarBottomSheetBehavior<View> bottomBarBottomSheetBehavior = cVar.f154163c;
        if (bottomBarBottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
        }
        return bottomBarBottomSheetBehavior;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$u */
    public static final class View$OnClickListenerC61490u implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154219a;

        View$OnClickListenerC61490u(BottomBarViewControl cVar) {
            this.f154219a = cVar;
        }

        public final void onClick(View view) {
            C60700b.m235851b(this.f154219a.f154161a, "[onClick2]", "click close icon");
            this.f154219a.mo213098i(true);
        }
    }

    /* renamed from: a */
    private final void m239982a(ViewGroup viewGroup) {
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.setDuration(200L);
        TransitionManager.beginDelayedTransition(viewGroup, autoTransition);
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: b */
    public void mo213050b(int i) {
        BottomBarBottomSheetBehavior<View> bottomBarBottomSheetBehavior = this.f154163c;
        if (bottomBarBottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
        }
        if (bottomBarBottomSheetBehavior.mo212982a() == 4) {
            C60735ab.m236001a(new RunnableC61462aa(this, i));
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: c */
    public void mo213053c(boolean z) {
        AudioRouteHelper bVar;
        m239985l(z);
        if (!z && (bVar = this.f154136B) != null) {
            bVar.mo212740b(C60788y.m236250b(getActivity()));
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: g */
    public void mo213061g(boolean z) {
        int i;
        TextView textView = this.f154153S;
        if (textView != null) {
            if (z) {
                i = R.string.View_VM_ShareNew;
            } else {
                i = R.string.View_VM_ShareButton;
            }
            textView.setText(i);
        }
    }

    @Override // com.ss.android.vc.meeting.module.chat.p3115a.AbstractC61567a.AbstractC61568a
    /* renamed from: i */
    public void mo213098i(boolean z) {
        ConstraintLayout constraintLayout = this.f154185y;
        if (constraintLayout != null) {
            if (z) {
                C26171w.m94675a(new RunnableC61465c(this));
            } else if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
        }
    }

    /* renamed from: j */
    public void mo213099j(boolean z) {
        ConstraintLayout constraintLayout = this.f154186z;
        if (constraintLayout != null) {
            if (z) {
                C26171w.m94675a(new RunnableC61463b(this));
            } else if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$e */
    public static final class View$OnClickListenerC61468e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154196a;

        View$OnClickListenerC61468e(BottomBarViewControl cVar) {
            this.f154196a = cVar;
        }

        public final void onClick(View view) {
            this.f154196a.mo213069m();
            MeetingOnTheCallEvent2 a = MeetingOnTheCallEvent2.f160846b.mo220311a();
            C61303k meeting = this.f154196a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            MeetingOnTheCallEvent2.m249824a(a, meeting, "hide_control_bar", null, null, null, null, 60, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$f */
    public static final class View$OnClickListenerC61469f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154197a;

        View$OnClickListenerC61469f(BottomBarViewControl cVar) {
            this.f154197a = cVar;
        }

        public final void onClick(View view) {
            this.f154197a.mo213069m();
            MeetingOnTheCallEvent2 a = MeetingOnTheCallEvent2.f160846b.mo220311a();
            C61303k meeting = this.f154197a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            MeetingOnTheCallEvent2.m249824a(a, meeting, "hide_control_bar", null, null, null, null, 60, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$k */
    static final class View$OnClickListenerC61476k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154203a;

        View$OnClickListenerC61476k(BottomBarViewControl cVar) {
            this.f154203a = cVar;
        }

        public final void onClick(View view) {
            C62556a aVar;
            if (this.f154203a.getActivity() != null) {
                DesktopHostControlStub aVar2 = this.f154203a.f154173m;
                if (aVar2 == null || aVar2.mo216108a() == null) {
                    aVar = null;
                } else {
                    Activity activity = this.f154203a.getActivity();
                    if (activity == null) {
                        Intrinsics.throwNpe();
                    }
                    aVar = new C62556a(activity, view, this.f154203a.getMeeting());
                }
                if (aVar != null) {
                    aVar.mo211606a();
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: a */
    public void mo213046a(int i) {
        TextView textView = this.f154156V;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    @Override // com.ss.android.vc.meeting.module.chat.p3115a.AbstractC61567a.AbstractC61568a
    /* renamed from: b */
    public void mo213096b(InteractionMessage aVar) {
        BottomBarBottomSheetBehavior<View> bottomBarBottomSheetBehavior = this.f154163c;
        if (bottomBarBottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
        }
        if (bottomBarBottomSheetBehavior.mo212982a() == 4 && this.f154185y != null) {
            C26171w.m94675a(new RunnableC61495y(this, aVar));
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: f */
    public void mo213059f(boolean z) {
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.container_share_toolbar);
        if (frameLayout != null) {
            if (z) {
                Intrinsics.checkExpressionValueIsNotNull(frameLayout, "shareBarContainer");
                frameLayout.setVisibility(0);
            } else {
                Intrinsics.checkExpressionValueIsNotNull(frameLayout, "shareBarContainer");
                frameLayout.setVisibility(8);
            }
        }
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.container_subtitle);
        if (frameLayout2 == null) {
            return;
        }
        if (z) {
            Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "subtitleContainer");
            frameLayout2.setVisibility(0);
            return;
        }
        Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "subtitleContainer");
        frameLayout2.setVisibility(8);
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: h */
    public void mo213064h(boolean z) {
        int i;
        LinearLayout linearLayout = this.f154165e;
        if (linearLayout != null) {
            if (z) {
                i = R.color.ud_N200;
            } else {
                i = R.color.bg_base;
            }
            linearLayout.setBackgroundColor(C60773o.m236126d(i));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$t */
    public static final class View$OnClickListenerC61489t implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154218a;

        View$OnClickListenerC61489t(BottomBarViewControl cVar) {
            this.f154218a = cVar;
        }

        public final void onClick(View view) {
            C60700b.m235851b(this.f154218a.f154161a, "[onClick]", "click message bubble");
            if (this.f154218a.getMeeting() != null) {
                C61303k meeting = this.f154218a.getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
                meeting.as().mo213371a(true);
                ConstraintLayout constraintLayout = this.f154218a.f154185y;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(8);
                }
                Activity b = C60773o.m236124b(this.f154218a.getContext());
                if (b != null) {
                    C61584f.m240416a(b, this.f154218a.getMeeting()).mo211606a();
                }
            }
        }
    }

    /* renamed from: d */
    private final void m239983d(int i) {
        ViewGroup.LayoutParams layoutParams;
        boolean z;
        LinearLayout linearLayout = this.f154160Z;
        if (linearLayout != null) {
            layoutParams = linearLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (C60776r.m236144b() - C60776r.m236148f() > i) {
                z = true;
            } else {
                z = false;
            }
            this.am = z;
            if (z) {
                layoutParams2.addRule(3, R.id.reaction_send_container);
                layoutParams2.topMargin = C60773o.m236115a(10.0d);
            } else {
                layoutParams2.addRule(3, R.id.iv_bottom_bar_arrow_expand);
                layoutParams2.topMargin = C60773o.m236115a(74.0d);
            }
            LinearLayout linearLayout2 = this.f154160Z;
            if (linearLayout2 != null) {
                linearLayout2.setLayoutParams(layoutParams2);
            }
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            meeting.ar().mo216853a(this.am);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    /* renamed from: k */
    private final void m239984k(boolean z) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        if (C60788y.m236247a(getActivity())) {
            View view = this.f154148N;
            if (view != null) {
                C60752f.m236083c(view);
            }
            if (z) {
                ImageView imageView = this.f154146L;
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.ud_icon_video_off_filled);
                }
                ImageView imageView2 = this.f154146L;
                if (imageView2 != null && (drawable3 = imageView2.getDrawable()) != null) {
                    drawable3.setTint(C60773o.m236126d(R.color.function_danger_500));
                    return;
                }
                return;
            }
            ImageView imageView3 = this.f154146L;
            if (imageView3 != null) {
                imageView3.setImageResource(R.drawable.ud_icon_video_filled);
            }
            ImageView imageView4 = this.f154146L;
            if (imageView4 != null && (drawable2 = imageView4.getDrawable()) != null) {
                drawable2.setTint(C60773o.m236126d(R.color.ud_N700));
                return;
            }
            return;
        }
        View view2 = this.f154148N;
        if (view2 != null) {
            C60752f.m236079a(view2);
        }
        ImageView imageView5 = this.f154146L;
        if (imageView5 != null) {
            imageView5.setImageResource(R.drawable.ud_icon_video_off_filled);
        }
        ImageView imageView6 = this.f154146L;
        if (imageView6 != null && (drawable = imageView6.getDrawable()) != null) {
            drawable.setTint(C60773o.m236126d(R.color.icon_disable));
        }
    }

    /* renamed from: l */
    private final void m239985l(boolean z) {
        Drawable drawable;
        int i;
        Drawable drawable2;
        boolean b = C60788y.m236250b(getActivity());
        int i2 = R.drawable.ud_icon_mic_off_filled;
        if (b) {
            View view = this.f154144J;
            if (view != null) {
                C60752f.m236083c(view);
            }
            if (z) {
                i = R.color.function_danger_500;
            } else {
                i2 = R.drawable.ud_icon_mic_filled;
                i = R.color.ud_N700;
            }
            ImageView imageView = this.f154142H;
            if (imageView != null) {
                imageView.setImageResource(i2);
            }
            ImageView imageView2 = this.f154142H;
            if (imageView2 != null && (drawable2 = imageView2.getDrawable()) != null) {
                drawable2.setTint(C60773o.m236126d(i));
                return;
            }
            return;
        }
        View view2 = this.f154144J;
        if (view2 != null) {
            C60752f.m236079a(view2);
        }
        ImageView imageView3 = this.f154142H;
        if (imageView3 != null) {
            imageView3.setImageResource(R.drawable.ud_icon_mic_off_filled);
        }
        ImageView imageView4 = this.f154142H;
        if (imageView4 != null && (drawable = imageView4.getDrawable()) != null) {
            drawable.setTint(C60773o.m236126d(R.color.icon_disable));
        }
    }

    /* renamed from: a */
    public final void mo213093a(float f) {
        double d = (double) f;
        double d2 = this.ao;
        if (d <= d2) {
            float f2 = ((float) (((d2 - d) / d2) * 0.7d)) + 0.3f;
            LinearLayout linearLayout = this.f154165e;
            if (linearLayout != null) {
                linearLayout.setAlpha(f2);
            }
            LinearLayout linearLayout2 = this.f154165e;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            RelativeLayout relativeLayout = this.f154159Y;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(4);
                return;
            }
            return;
        }
        float f3 = ((float) (((d - d2) / (((double) 1) - d2)) * 0.7d)) + 0.3f;
        RelativeLayout relativeLayout2 = this.f154159Y;
        if (relativeLayout2 != null) {
            relativeLayout2.setAlpha(f3);
        }
        RelativeLayout relativeLayout3 = this.f154159Y;
        if (relativeLayout3 != null) {
            relativeLayout3.setVisibility(0);
        }
        LinearLayout linearLayout3 = this.f154165e;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final void mo213097c(int i) {
        InstagramDotView instagramDotView;
        if (i < 2) {
            InstagramDotView instagramDotView2 = this.f154168h;
            if (instagramDotView2 != null) {
                instagramDotView2.setVisibility(8);
            }
            this.f175459ai = 0;
            m239963B();
            return;
        }
        InstagramDotView instagramDotView3 = this.f154168h;
        if (instagramDotView3 == null) {
            C60740ad.m236052b((ViewStub) findViewById(R.id.stub_dot));
            View view = this.f154164d;
            if (view != null) {
                instagramDotView = (InstagramDotView) view.findViewById(R.id.view_instagram_dot);
            } else {
                instagramDotView = null;
            }
            this.f154168h = instagramDotView;
            this.f175459ai = C60773o.m236123b((int) R.dimen.bottom_bar_view_pager_dot_height);
        } else {
            if (instagramDotView3 != null) {
                instagramDotView3.setVisibility(0);
            }
            this.f175459ai = C60773o.m236123b((int) R.dimen.bottom_bar_view_pager_dot_height);
        }
        m239963B();
        InstagramDotView instagramDotView4 = this.f154168h;
        if (instagramDotView4 != null) {
            instagramDotView4.mo208704a(i);
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: e */
    public void mo213057e(boolean z) {
        String str = this.f154161a;
        C60700b.m235851b(str, "[setBottomBarViewInvisible]", "invisible: " + z);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.container_bottom_bar);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "container");
        if ((frameLayout.getVisibility() == 0 && z) || (frameLayout.getVisibility() != 0 && !z)) {
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            meeting.aC().mo213387a(false);
        }
        if (!z) {
            frameLayout.setVisibility(0);
            View view = this.f154176p;
            if (view != null) {
                view.setVisibility(0);
            }
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            AbstractC61566a as = meeting2.as();
            Intrinsics.checkExpressionValueIsNotNull(as, "meeting.chatControl");
            mo213050b(as.mo213380i());
            mo213100r();
            return;
        }
        frameLayout.setVisibility(4);
        View view2 = this.f154176p;
        if (view2 != null) {
            view2.setVisibility(4);
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: a */
    public void mo213047a(VideoChatGuideConstants.GuideType guideType) {
        Intrinsics.checkParameterIsNotNull(guideType, "guideType");
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.av().mo213462a(this.ad, guideType);
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: d */
    public void mo213055d(boolean z) {
        String str = this.f154161a;
        C60700b.m235851b(str, "[showHideBottomBarView]", "show: " + z);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.container_bottom_bar);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "container");
        if ((frameLayout.getVisibility() == 0 && !z) || (frameLayout.getVisibility() != 0 && z)) {
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            meeting.aC().mo213387a(false);
        }
        if (z) {
            frameLayout.setVisibility(0);
            View view = this.f154176p;
            if (view != null) {
                view.setVisibility(0);
            }
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            AbstractC61566a as = meeting2.as();
            Intrinsics.checkExpressionValueIsNotNull(as, "meeting.chatControl");
            mo213050b(as.mo213380i());
            mo213100r();
            return;
        }
        frameLayout.setVisibility(8);
        View view2 = this.f154176p;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    public BottomBarViewControl(AbstractC61429i iVar) {
        super(iVar);
        if (DesktopUtil.m144307b()) {
            ViewGroup rootView = getRootView();
            Intrinsics.checkExpressionValueIsNotNull(rootView, "rootView");
            this.f154173m = new DesktopHostControlStub(rootView);
        }
        this.f154140F = findViewById(R.id.bottom_sheet);
        this.ad = findViewById(R.id.iv_bottom_bar_arrow_collapse);
        this.f154167g = (BottomBarFunctionRv) findViewById(R.id.rv_function_area);
        AudioRouteHelper bVar = new AudioRouteHelper(getMeeting(), MeetingAudioManager.m239471k(), this);
        this.f154136B = bVar;
        if (bVar == null) {
            Intrinsics.throwNpe();
        }
        bVar.mo212735a(new AudioRouteHelper.IStatisAction(this) {
            /* class com.ss.android.vc.meeting.module.bottombar.BottomBarViewControl.C614601 */

            /* renamed from: a */
            final /* synthetic */ BottomBarViewControl f154187a;

            @Override // com.ss.android.vc.meeting.module.audio.AudioRouteHelper.IStatisAction
            /* renamed from: a */
            public void mo212748a() {
                String str;
                SpeakerOptionEvent a = SpeakerOptionEvent.f160813b.mo220241a();
                C61303k meeting = this.f154187a.getMeeting();
                VideoChat videoChat = null;
                if (meeting != null) {
                    str = meeting.mo212093K();
                } else {
                    str = null;
                }
                C61303k meeting2 = this.f154187a.getMeeting();
                if (meeting2 != null) {
                    videoChat = meeting2.mo212056e();
                }
                a.mo220239a(str, "meeting_onthecall", videoChat);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f154187a = r1;
            }

            @Override // com.ss.android.vc.meeting.module.audio.AudioRouteHelper.IStatisAction
            /* renamed from: a */
            public void mo212749a(String str) {
                VideoChat videoChat;
                Intrinsics.checkParameterIsNotNull(str, "action");
                SpeakerOptionEvent a = SpeakerOptionEvent.f160813b.mo220241a();
                C61303k meeting = this.f154187a.getMeeting();
                String str2 = null;
                if (meeting != null) {
                    videoChat = meeting.mo212056e();
                } else {
                    videoChat = null;
                }
                C61303k meeting2 = this.f154187a.getMeeting();
                if (meeting2 != null) {
                    str2 = meeting2.mo212093K();
                }
                a.mo220240a("meeting_onthecall", str, videoChat, str2);
            }
        });
        init();
        m239986w();
    }

    /* JADX WARNING: Removed duplicated region for block: B:87:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo213094a(com.ss.android.vc.meeting.module.reaction.entity.InteractionMessage r12) {
        /*
        // Method dump skipped, instructions count: 363
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.bottombar.BottomBarViewControl.mo213094a(com.ss.android.vc.meeting.module.reaction.entity.a):void");
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: a */
    public void mo213048a(Runnable runnable) {
        Activity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        this.f154137C = VCDialogUtils.m236179a((Context) activity, (int) R.string.View_MV_OpenMicEcho, 2, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC61493w(this), (int) R.string.View_MV_ConfirmButtonTwo, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC61494x(this, runnable), false, Integer.valueOf((int) R.color.function_danger_500));
        MeetingPopupEvent a = MeetingPopupEvent.f160854b.mo220325a();
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        a.mo220317a("mic_on", meeting.mo212056e());
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61445a
    /* renamed from: a */
    public void mo213049a(boolean z) {
        int i;
        View view = this.f154157W;
        int i2 = 0;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
        TextView textView = this.f154156V;
        if (textView != null) {
            if (z) {
                i2 = 8;
            }
            textView.setVisibility(i2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$w */
    static final class DialogInterface$OnClickListenerC61493w implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154222a;

        DialogInterface$OnClickListenerC61493w(BottomBarViewControl cVar) {
            this.f154222a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f154222a.f154137C = null;
            MeetingPopupEvent a = MeetingPopupEvent.f160854b.mo220325a();
            C61303k meeting = this.f154222a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            MeetingPopupEvent.m249839a(a, "cancel", "mic_on", meeting.mo212056e(), null, 8, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.c$x */
    static final class DialogInterface$OnClickListenerC61494x implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomBarViewControl f154223a;

        /* renamed from: b */
        final /* synthetic */ Runnable f154224b;

        DialogInterface$OnClickListenerC61494x(BottomBarViewControl cVar, Runnable runnable) {
            this.f154223a = cVar;
            this.f154224b = runnable;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f154223a.f154137C = null;
            Runnable runnable = this.f154224b;
            if (runnable != null) {
                runnable.run();
            }
            MeetingPopupEvent a = MeetingPopupEvent.f160854b.mo220325a();
            C61303k meeting = this.f154223a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            MeetingPopupEvent.m249839a(a, "confirm", "mic_on", meeting.mo212056e(), null, 8, null);
        }
    }

    @Override // com.ss.android.vc.meeting.module.bottombar.AbstractC61444a.AbstractC61446b
    /* renamed from: a */
    public void mo213074a(FunctionItem.FunctionType functionType, View view) {
        Intrinsics.checkParameterIsNotNull(functionType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(view, "view");
        mo213069m();
        C60735ab.m236002a(new RunnableC61488s(this, functionType, view), 200);
        if (getMeeting() != null) {
            MeetingOnTheCallEvent2 a = MeetingOnTheCallEvent2.f160846b.mo220311a();
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            a.mo220304a(functionType, meeting);
        }
    }
}
