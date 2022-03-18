package com.ss.android.vc.common.utils;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.view.View;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.C25647t;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.dialog.ILKUIGlobalDialog;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28460b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.p3084a.C60729a;
import com.ss.android.vc.common.p3083e.p3084a.C60731c;
import com.ss.android.vc.common.widget.C60841b;
import com.ss.android.vc.common.widget.C60865i;
import com.ss.android.vc.common.widget.LKVCJumpDialogController;
import com.ss.android.vc.common.widget.maxwidthdialog.LKVCJumpMaxWidthDialogController;
import com.ss.android.vc.common.widget.p3086b.C60843a;
import com.ss.android.vc.common.widget.p3087c.C60851a;
import com.ss.android.vc.common.widget.p3087c.C60854c;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.entity.livestream.MsgWithUrlInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.module.breakoutroom.p3113b.C61521a;
import com.ss.android.vc.meeting.module.breakoutroom.widgets.BreakoutRoomPopWindowDialogController;
import com.ss.android.vc.meeting.module.interpretation.widget.C61992a;
import com.ss.android.vcxp.C63791b;
import com.ss.ttm.player.MediaPlayer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J(\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00132\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J \u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0015\u001a\u00020\u0006H\u0007J \u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0015\u001a\u00020\u0006H\u0007J\u0018\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0007J \u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0007J\"\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00132\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0007J \u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00132\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0017\u001a\u00020\u000fH\u0007J\"\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00132\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0007J \u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0007J(\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0007J \u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00132\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u001a\u001a\u00020\u000fH\u0007J(\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00132\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0007J8\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0011H\u0007J\\\u0010%\u001a\u0004\u0018\u00010\u001c2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0004H\u0007JL\u00102\u001a\u0004\u0018\u0001032\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u00062\b\b\u0002\u00107\u001a\u00020\u0006H\u0007JX\u00108\u001a\u0002092\u0006\u0010(\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00062\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u000fH\u0007J*\u0010=\u001a\u0002092\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010>\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0006H\u0007JQ\u0010@\u001a\u0002092\u0006\u0010(\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00062\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010BJH\u0010C\u001a\u0002092\u0006\u0010(\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0006H\u0007Jf\u0010D\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u000f2\b\b\u0002\u00104\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020G2\u0006\u0010>\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00062\b\b\u0002\u00107\u001a\u00020\u0006H\u0007JF\u0010I\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010(\u001a\u0004\u0018\u00010\u00042\u0006\u00104\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010>\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u0006H\u0007JT\u0010K\u001a\u0004\u0018\u0001032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010L\u001a\u00020M2\u0006\u0010(\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0006H\u0007JT\u0010N\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0006H\u0007JT\u0010N\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0006H\u0007JX\u0010R\u001a\u0004\u0018\u0001032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u00105\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00062\b\b\u0002\u00107\u001a\u00020\u00062\u0006\u0010:\u001a\u00020SH\u0007Je\u0010T\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010(\u001a\u00020\u000f2\b\b\u0002\u00104\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u00105\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010UJe\u0010T\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010(\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u00105\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010VJ2\u0010W\u001a\u0004\u0018\u00010X2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0006H\u0007J2\u0010W\u001a\u0004\u0018\u00010X2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0006H\u0007J[\u0010Y\u001a\u00020X2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u000f2\b\b\u0002\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00062\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010ZJ:\u0010Y\u001a\u0004\u0018\u00010X2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0006H\u0007J]\u0010Y\u001a\u00020X2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010(\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00062\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010[Jn\u0010\\\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u000f2\b\b\u0002\u00104\u001a\u00020\u000f2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00062\b\b\u0002\u0010`\u001a\u00020\u0004H\u0007Jn\u0010a\u001a\u0004\u0018\u0001032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010(\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00062\b\b\u0002\u00107\u001a\u00020\u00062\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u000fH\u0007Jo\u0010b\u001a\u0004\u0018\u0001032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010(\u001a\u0004\u0018\u00010\u000f2\u0006\u00104\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u00105\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00062\b\b\u0002\u00107\u001a\u00020\u00062\u0006\u0010:\u001a\u00020;H\u0007¢\u0006\u0002\u0010cJJ\u0010d\u001a\u00020X2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u000f2\b\b\u0002\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0006H\u0007J^\u0010e\u001a\u0004\u0018\u00010X2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010f\u001a\u00020M2\u0006\u0010(\u001a\u00020\u000f2\b\b\u0002\u00104\u001a\u00020\u000f2\b\b\u0002\u0010g\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0006H\u0007JB\u0010h\u001a\u0004\u0018\u00010X2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0006H\u0007JT\u0010i\u001a\u0004\u0018\u00010X2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u000f2\b\b\u0002\u00104\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0006H\u0007JT\u0010i\u001a\u0004\u0018\u00010X2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u000f2\b\b\u0002\u00104\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0006H\u0007JT\u0010i\u001a\u0004\u0018\u00010X2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0006H\u0007JT\u0010i\u001a\u0004\u0018\u00010X2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0006H\u0007J^\u0010j\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u000f2\b\b\u0002\u00104\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010k\u001a\u00020\u000f2\u0006\u0010l\u001a\u00020\u00112\u0006\u0010m\u001a\u00020\u000f2\u0006\u0010n\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00062\b\b\u0002\u00107\u001a\u00020\u0006H\u0007JT\u0010o\u001a\u0004\u0018\u00010X2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010f\u001a\u00020M2\u0006\u0010(\u001a\u00020\u000f2\b\b\u0002\u00104\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0006H\u0007JT\u0010p\u001a\u0004\u0018\u00010X2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0006H\u0007JV\u0010q\u001a\u00020X2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00062\n\b\u0002\u0010r\u001a\u0004\u0018\u00010sH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006t"}, d2 = {"Lcom/ss/android/vc/common/utils/VCDialogUtils;", "", "()V", "TAG", "", "lightMode", "", "getLightMode", "()Z", "setLightMode", "(Z)V", "addRightButton", "Lcom/larksuite/component/ui/dialog/LKUIDialogBuilder;", "builder", "text", "", "action", "Landroid/content/DialogInterface$OnClickListener;", "addRightPrimaryButton", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "setCancelable", "enable", "setMessageStyle", "gravity", "message", "setTitleStyle", "lines", "showAutoEndConfirmDialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "context", "Landroid/content/Context;", "meetingEndTime", "", "meetingEndReceiveTime", "leftAction", "rightAction", "timeoutAction", "showBreakoutRoomPopDialog", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "title", "primaryText", "secondText", "cancelable", "iDelegate", "Lcom/ss/android/vc/meeting/module/breakoutroom/widgets/BreakoutRoomPopWindowDialogController$IDelegate;", "shouldShow", "onShouldShowListener", "Lcom/ss/android/vc/meeting/module/breakoutroom/widgets/BreakoutRoomPopWindowDialogController$OnShouldShowListener;", "roomId", "showFloatWindowPermissionDialog", "Landroid/app/Dialog;", "titleLines", "leftText", "rightText", "isLightMode", "showGlobalJumpWithTitleAndMessage", "Lcom/larksuite/component/ui/dialog/ILKUIGlobalDialog;", "listener", "Lcom/ss/android/vc/common/widget/LKVCJumpDialogController$OnJumpListener;", "startIndex", "showGlobalOnlyMessage", "centerText", "centerAction", "showGlobalWithTitle", "rightColor", "(IIILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;ZLjava/lang/Integer;)Lcom/larksuite/component/ui/dialog/ILKUIGlobalDialog;", "showGlobalWithTitleAndMessage", "showInterpretationConfirmDialog", "isGlobalShow", "left", "Lcom/ss/android/vc/entity/LanguageType;", "right", "showShareSecurityMessage", HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, "showWithContentView", "content", "Landroid/view/View;", "showWithCustomFooter", "firstText", "firstAction", "secondAction", "showWithMaxWidthJumpMessage", "Lcom/ss/android/vc/common/widget/maxwidthdialog/LKVCJumpMaxWidthDialogController$OnJumpListener;", "showWithMaxWidthTitleMessageOrContent", "(Landroid/content/Context;Landroid/view/View;IILjava/lang/Integer;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;Z)Lcom/larksuite/component/universe_design/dialog/UDDialog;", "(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;ILjava/lang/Integer;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;Z)Lcom/larksuite/component/universe_design/dialog/UDDialog;", "showWithOnlyMessage", "Lcom/larksuite/component/ui/dialog/LKUIDialog;", "showWithTitle", "(Landroid/content/Context;IIILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;ZLjava/lang/Integer;)Lcom/larksuite/component/ui/dialog/LKUIDialog;", "(Landroid/content/Context;Ljava/lang/String;IILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;ZLjava/lang/Integer;)Lcom/larksuite/component/ui/dialog/LKUIDialog;", "showWithTitleAndCheckBox", "msgWithUrl", "Lcom/ss/android/vc/entity/livestream/MsgWithUrlInfo;", "checkBoxHint", "envID", "showWithTitleAndJumpMessage", "showWithTitleAndJumpMessageLeftRed", "(Landroid/content/Context;Ljava/lang/Integer;ILjava/lang/String;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;ZZLcom/ss/android/vc/common/widget/LKVCJumpDialogController$OnJumpListener;)Landroid/app/Dialog;", "showWithTitleBothBlack", "showWithTitleCustomLayout", "contentLayout", "titlePaddingBottom", "showWithTitleMessage", "showWithTitleMessage2", "showWithTitleMessageAutoOrientationActions", "headText", "headAction", "tailText", "tailAction", "showWithTitleMessageCustomLayout", "showWithTitleMessageRightRed", "showWithTitleRightRed", "onShow", "Landroid/content/DialogInterface$OnShowListener;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.common.e.s */
public final class VCDialogUtils {

    /* renamed from: a */
    public static final VCDialogUtils f151980a = new VCDialogUtils();

    /* renamed from: b */
    private static boolean f151981b = true;

    @JvmStatic
    /* renamed from: a */
    public static final Dialog m236161a(Context context, int i, int i2, String str, int i3, DialogInterface.OnClickListener onClickListener, int i4, DialogInterface.OnClickListener onClickListener2, boolean z, LKVCJumpDialogController.OnJumpListener aVar, int i5) {
        return m236163a(context, i, i2, str, i3, onClickListener, i4, onClickListener2, z, false, aVar, i5, (int) MediaPlayer.MEDIA_PLAYER_OPTION_APPID, (Object) null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final Dialog m236165a(Context context, Integer num, int i, String str, int i2, DialogInterface.OnClickListener onClickListener, int i3, DialogInterface.OnClickListener onClickListener2, boolean z, LKVCJumpDialogController.OnJumpListener aVar) {
        return m236167a(context, num, i, str, i2, onClickListener, i3, onClickListener2, z, false, aVar, MediaPlayer.MEDIA_PLAYER_OPTION_APPID, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final Dialog m236168a(Context context, String str, int i, DialogInterface.OnClickListener onClickListener, int i2, DialogInterface.OnClickListener onClickListener2, boolean z, LKVCJumpMaxWidthDialogController.OnJumpListener aVar) {
        return m236170a(context, str, i, onClickListener, i2, onClickListener2, z, false, aVar, (int) SmActions.ACTION_ONTHECALL_EXIT, (Object) null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final ILKUIGlobalDialog m236171a(int i, int i2, int i3, DialogInterface.OnClickListener onClickListener, int i4, DialogInterface.OnClickListener onClickListener2, boolean z) {
        return m236173a(i, i2, i3, onClickListener, i4, onClickListener2, z, (Integer) null, (int) SmActions.ACTION_ONTHECALL_EXIT, (Object) null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final DialogC25637f m236178a(Context context, int i, int i2, int i3, DialogInterface.OnClickListener onClickListener, int i4, DialogInterface.OnClickListener onClickListener2, boolean z) {
        return m236180a(context, i, i2, i3, onClickListener, i4, onClickListener2, z, (Integer) null, (int) DynamicModule.f58006b, (Object) null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final DialogC25637f m236184a(Context context, String str, int i, int i2, DialogInterface.OnClickListener onClickListener, int i3, DialogInterface.OnClickListener onClickListener2, boolean z) {
        return m236188a(context, str, i, i2, onClickListener, i3, onClickListener2, z, (Integer) null, (int) DynamicModule.f58006b, (Object) null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final Object m236211a(Context context, boolean z, int i, int i2, MsgWithUrlInfo bVar, String str, int i3, DialogInterface.OnClickListener onClickListener, int i4, DialogInterface.OnClickListener onClickListener2, boolean z2) {
        return m236213a(context, z, i, i2, bVar, str, i3, onClickListener, i4, onClickListener2, z2, (String) null, 2048, (Object) null);
    }

    @JvmStatic
    /* renamed from: b */
    public static final DialogC25637f m236215b(Context context, String str, int i, int i2, DialogInterface.OnClickListener onClickListener, int i3, DialogInterface.OnClickListener onClickListener2, boolean z) {
        return m236186a(context, str, i, i2, onClickListener, i3, onClickListener2, z, (DialogInterface.OnShowListener) null, (int) DynamicModule.f58006b, (Object) null);
    }

    @JvmStatic
    /* renamed from: b */
    public static final UDDialog m236218b(Context context, int i, int i2, int i3, int i4, DialogInterface.OnClickListener onClickListener, int i5, DialogInterface.OnClickListener onClickListener2, boolean z) {
        return m236202a(context, i, i2, i3, i4, onClickListener, i5, onClickListener2, z, false, (int) MediaPlayer.MEDIA_PLAYER_OPTION_APPID, (Object) null);
    }

    private VCDialogUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final DialogC25637f m236183a(Context context, View view, int i, int i2, int i3, int i4, DialogInterface.OnClickListener onClickListener, int i5, DialogInterface.OnClickListener onClickListener2, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "contentLayout");
        Intrinsics.checkParameterIsNotNull(onClickListener, "secondAction");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "firstAction");
        C25639g u = new C25639g(context).mo89237b(UIHelper.getString(i)).mo89223a(-1, -1, -1, i3).mo89236b(view).mo89224a(R.id.lkui_dialog_btn_left, i5, onClickListener2).mo89265x(R.style.VcLarkUIDialog).mo89262u(C60773o.m236122b((double) (C60776r.m236148f() / -2)));
        Intrinsics.checkExpressionValueIsNotNull(u, "builder");
        m236193a(u, i4, onClickListener);
        m236192a(u, i2);
        m236195a(u, z);
        return u.mo89239c();
    }

    @JvmStatic
    /* renamed from: a */
    public static final UDDialog m236206a(Context context, String str, int i, String str2, int i2, DialogInterface.OnClickListener onClickListener, int i3, DialogInterface.OnClickListener onClickListener2, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str2, "message");
        Intrinsics.checkParameterIsNotNull(onClickListener, "firstAction");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "secondAction");
        String string = UIHelper.getString(i2);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(firstText)");
        String string2 = UIHelper.getString(i3);
        Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(secondText)");
        return m236208a(context, str, i, str2, string, onClickListener, string2, onClickListener2, z);
    }

    @JvmStatic
    /* renamed from: a */
    public static final UDDialog m236208a(Context context, String str, int i, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str2, "message");
        Intrinsics.checkParameterIsNotNull(str3, "secondText");
        Intrinsics.checkParameterIsNotNull(onClickListener, "secondAction");
        Intrinsics.checkParameterIsNotNull(str4, "firstText");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "firstAction");
        UDDialogBuilder eVar = (UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(str)).message(str2)).style(R.style.VcLarkUIDialog)).translationOnY(C60773o.m236122b((double) (C60776r.m236148f() / -2)))).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90704a(str4).mo90703a(onClickListener2))).addActionButton(R.id.ud_dialog_btn_secondary, str3, onClickListener)).actionButtonOrientation(UDBaseDialogBuilder.ActionBottomOrientation.VERTICAL);
        UDDialogBuilder eVar2 = eVar;
        m236196a(eVar2, i);
        m236199a(eVar2, str2);
        m236200a(eVar2, z);
        return eVar.show();
    }

    /* renamed from: a */
    public static /* synthetic */ Object m236213a(Context context, boolean z, int i, int i2, MsgWithUrlInfo bVar, String str, int i3, DialogInterface.OnClickListener onClickListener, int i4, DialogInterface.OnClickListener onClickListener2, boolean z2, String str2, int i5, Object obj) {
        return m236212a(context, z, i, (i5 & 8) != 0 ? 1 : i2, bVar, str, i3, onClickListener, i4, onClickListener2, z2, (i5 & 2048) != 0 ? "" : str2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final Object m236212a(Context context, boolean z, int i, int i2, MsgWithUrlInfo bVar, String str, int i3, DialogInterface.OnClickListener onClickListener, int i4, DialogInterface.OnClickListener onClickListener2, boolean z2, String str2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "msgWithUrl");
        Intrinsics.checkParameterIsNotNull(str, "checkBoxHint");
        Intrinsics.checkParameterIsNotNull(onClickListener, "leftAction");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "rightAction");
        Intrinsics.checkParameterIsNotNull(str2, "envID");
        C60843a aVar = (C60843a) ((C60843a) ((C60843a) ((C60843a) new C60843a(context).mo89237b(UIHelper.getString(i))).mo208639a(true).mo208636a(bVar).mo208638a(str2).mo208637a((CharSequence) str).mo89224a(R.id.lkui_dialog_btn_left, i3, onClickListener)).mo89265x(R.style.VcLarkUIDialog)).mo89262u(C60773o.m236122b((double) (C60776r.m236148f() / -2)));
        Intrinsics.checkExpressionValueIsNotNull(aVar, "builder");
        C60843a aVar2 = aVar;
        m236192a(aVar2, i2);
        m236191a(aVar2);
        m236195a(aVar2, z2);
        m236193a(aVar2, i4, onClickListener2);
        if (z) {
            return aVar.mo89244d();
        }
        return aVar.mo89239c();
    }

    /* renamed from: a */
    public static /* synthetic */ ILKUIGlobalDialog m236173a(int i, int i2, int i3, DialogInterface.OnClickListener onClickListener, int i4, DialogInterface.OnClickListener onClickListener2, boolean z, Integer num, int i5, Object obj) {
        return m236172a(i, i2, i3, onClickListener, i4, onClickListener2, z, (i5 & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? null : num);
    }

    @JvmStatic
    /* renamed from: a */
    public static final ILKUIGlobalDialog m236172a(int i, int i2, int i3, DialogInterface.OnClickListener onClickListener, int i4, DialogInterface.OnClickListener onClickListener2, boolean z, Integer num) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "leftAction");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "rightAction");
        C25639g a = new C25639g(ar.m236694a()).mo89237b(UIHelper.getString(i)).mo89265x(R.style.VcLarkUIDialog).mo89224a(R.id.lkui_dialog_btn_left, i3, onClickListener).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89269b(i4).mo89267a(onClickListener2).mo89271d(num != null ? num.intValue() : 0));
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        m236192a(a, i2);
        m236195a(a, z);
        ILKUIGlobalDialog d = a.mo89244d();
        Intrinsics.checkExpressionValueIsNotNull(d, "dialog");
        return d;
    }

    @JvmStatic
    /* renamed from: a */
    public static final ILKUIGlobalDialog m236176a(String str, int i, DialogInterface.OnClickListener onClickListener, boolean z) {
        C25647t tVar;
        Intrinsics.checkParameterIsNotNull(onClickListener, "centerAction");
        Context a = ar.m236694a();
        if (C63791b.m250468b()) {
            tVar = new C25647t(a);
        } else {
            tVar = new C25639g(a);
        }
        if (str != null) {
            tVar.mo89242c(str);
        }
        tVar.mo89265x(R.style.VcLarkUIDialog).mo89224a(R.id.lkui_dialog_btn_center, i, onClickListener);
        m236194a(tVar, str);
        m236195a(tVar, z);
        ILKUIGlobalDialog d = tVar.mo89244d();
        Intrinsics.checkExpressionValueIsNotNull(d, "dialog");
        return d;
    }

    @JvmStatic
    /* renamed from: a */
    public static final ILKUIGlobalDialog m236174a(int i, int i2, String str, int i3, DialogInterface.OnClickListener onClickListener, int i4, DialogInterface.OnClickListener onClickListener2, boolean z) {
        C25647t tVar;
        Intrinsics.checkParameterIsNotNull(str, "message");
        Intrinsics.checkParameterIsNotNull(onClickListener, "leftAction");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "rightAction");
        Context a = ar.m236694a();
        if (C63791b.m250468b()) {
            tVar = new C25647t(a);
        } else {
            tVar = new C25639g(a);
        }
        tVar.mo89237b(UIHelper.getString(i)).mo89242c(str).mo89265x(R.style.VcLarkUIDialog).mo89224a(R.id.lkui_dialog_btn_left, i3, onClickListener);
        m236192a(tVar, i2);
        m236194a(tVar, str);
        m236195a(tVar, z);
        m236193a(tVar, i4, onClickListener2);
        ILKUIGlobalDialog d = tVar.mo89244d();
        Intrinsics.checkExpressionValueIsNotNull(d, "dialog");
        return d;
    }

    @JvmStatic
    /* renamed from: a */
    public static final ILKUIGlobalDialog m236175a(int i, int i2, String str, int i3, DialogInterface.OnClickListener onClickListener, int i4, DialogInterface.OnClickListener onClickListener2, boolean z, LKVCJumpDialogController.OnJumpListener aVar, int i5) {
        C60865i iVar;
        Intrinsics.checkParameterIsNotNull(str, "message");
        Intrinsics.checkParameterIsNotNull(onClickListener, "leftAction");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "rightAction");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        Context a = ar.m236694a();
        if (C63791b.m250468b()) {
            iVar = new C60865i(a);
        } else {
            iVar = new C60841b(a);
        }
        ((C60841b) ((C60841b) ((C60841b) ((C60841b) iVar.mo89237b(UIHelper.getString(i))).mo89242c(str)).mo208634a(str, aVar, i5).mo89265x(R.style.VcLarkUIDialog)).mo89262u(C60773o.m236122b((double) (C60776r.m236148f() / -2)))).mo89224a(R.id.lkui_dialog_btn_left, i3, onClickListener);
        C60841b bVar = iVar;
        m236192a(bVar, i2);
        m236191a(bVar);
        m236195a(bVar, z);
        m236193a(bVar, i4, onClickListener2);
        ILKUIGlobalDialog d = iVar.mo89244d();
        Intrinsics.checkExpressionValueIsNotNull(d, "dialog");
        return d;
    }

    @JvmStatic
    /* renamed from: a */
    public static final DialogC25637f m236189a(Context context, String str, int i, int i2, DialogInterface.OnClickListener onClickListener, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(onClickListener, "centerAction");
        C25639g a = new C25639g(context).mo89237b(str).mo89265x(R.style.VcLarkUIDialog).mo89262u(C60773o.m236122b((double) (C60776r.m236148f() / -2))).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_center).mo89269b(i2).mo89267a(onClickListener));
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        m236192a(a, i);
        m236195a(a, z);
        return a.mo89239c();
    }

    /* renamed from: a */
    public static /* synthetic */ DialogC25637f m236180a(Context context, int i, int i2, int i3, DialogInterface.OnClickListener onClickListener, int i4, DialogInterface.OnClickListener onClickListener2, boolean z, Integer num, int i5, Object obj) {
        return m236179a(context, i, (i5 & 4) != 0 ? 1 : i2, i3, onClickListener, i4, onClickListener2, z, (i5 & DynamicModule.f58006b) != 0 ? null : num);
    }

    @JvmStatic
    /* renamed from: a */
    public static final DialogC25637f m236179a(Context context, int i, int i2, int i3, DialogInterface.OnClickListener onClickListener, int i4, DialogInterface.OnClickListener onClickListener2, boolean z, Integer num) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(onClickListener, "leftAction");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "rightAction");
        String string = UIHelper.getString(i);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(title)");
        return m236187a(context, string, i2, i3, onClickListener, i4, onClickListener2, z, num);
    }

    /* renamed from: a */
    public static /* synthetic */ DialogC25637f m236188a(Context context, String str, int i, int i2, DialogInterface.OnClickListener onClickListener, int i3, DialogInterface.OnClickListener onClickListener2, boolean z, Integer num, int i4, Object obj) {
        return m236187a(context, str, (i4 & 4) != 0 ? 1 : i, i2, onClickListener, i3, onClickListener2, z, (i4 & DynamicModule.f58006b) != 0 ? null : num);
    }

    @JvmStatic
    /* renamed from: a */
    public static final DialogC25637f m236187a(Context context, String str, int i, int i2, DialogInterface.OnClickListener onClickListener, int i3, DialogInterface.OnClickListener onClickListener2, boolean z, Integer num) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(onClickListener, "leftAction");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "rightAction");
        if (context == null) {
            context = VCAppLifeCycle.m236256c();
        }
        if (context == null) {
            C60700b.m235864f("VCDialogUtils", "[showWithTitle]", "context is null");
        }
        C25639g a = new C25639g(context).mo89237b(str).mo89265x(R.style.VcLarkUIDialog).mo89262u(C60773o.m236122b((double) (C60776r.m236148f() / -2))).mo89224a(R.id.lkui_dialog_btn_left, i2, onClickListener).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89269b(i3).mo89267a(onClickListener2).mo89271d(num != null ? num.intValue() : 0));
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        m236192a(a, i);
        m236195a(a, z);
        DialogC25637f c = a.mo89239c();
        Intrinsics.checkExpressionValueIsNotNull(c, "dialog");
        return c;
    }

    /* renamed from: a */
    public static /* synthetic */ DialogC25637f m236186a(Context context, String str, int i, int i2, DialogInterface.OnClickListener onClickListener, int i3, DialogInterface.OnClickListener onClickListener2, boolean z, DialogInterface.OnShowListener onShowListener, int i4, Object obj) {
        return m236185a(context, str, (i4 & 4) != 0 ? 1 : i, i2, onClickListener, i3, onClickListener2, z, (i4 & DynamicModule.f58006b) != 0 ? null : onShowListener);
    }

    @JvmStatic
    /* renamed from: a */
    public static final DialogC25637f m236185a(Context context, String str, int i, int i2, DialogInterface.OnClickListener onClickListener, int i3, DialogInterface.OnClickListener onClickListener2, boolean z, DialogInterface.OnShowListener onShowListener) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(onClickListener, "leftAction");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "rightAction");
        C25639g a = new C25639g(context).mo89237b(str).mo89265x(R.style.VcLarkUIDialog).mo89262u(C60773o.m236122b((double) (C60776r.m236148f() / -2))).mo89224a(R.id.lkui_dialog_btn_left, i2, onClickListener).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89271d(R.color.function_danger_500).mo89269b(i3).mo89267a(onClickListener2));
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        m236192a(a, i);
        m236195a(a, z);
        DialogC25637f b = a.mo89233b();
        if (onShowListener != null) {
            b.setOnShowListener(onShowListener);
        }
        b.show();
        Intrinsics.checkExpressionValueIsNotNull(b, "dialog");
        return b;
    }

    @JvmStatic
    /* renamed from: a */
    public static final UDDialog m236207a(Context context, String str, int i, String str2, String str3, int i2, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str3, "centerText");
        C60731c cVar = new C60731c(context);
        if (str != null) {
            cVar.title(str);
        }
        if (str2 != null) {
            cVar.message(str2);
        }
        UDBaseDialogBuilder addActionButton = cVar.mo208359a(str3, i2).style(R.style.VcLarkUIDialog).translationOnY(C60773o.m236122b((double) (C60776r.m236148f() / -2))).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90704a(str3));
        m236197a(addActionButton, i, 1);
        m236199a(addActionButton, str2);
        m236200a(addActionButton, z);
        return addActionButton.show();
    }

    @JvmStatic
    /* renamed from: a */
    public static final DialogC25637f m236177a(Context context, int i, int i2, int i3, int i4, DialogInterface.OnClickListener onClickListener, int i5, DialogInterface.OnClickListener onClickListener2, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(onClickListener, "leftAction");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "rightAction");
        String string = UIHelper.getString(i);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(title)");
        String string2 = UIHelper.getString(i3);
        Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(message)");
        return m236216b(context, string, i2, string2, i4, onClickListener, i5, onClickListener2, z);
    }

    @JvmStatic
    /* renamed from: a */
    public static final DialogC25637f m236182a(Context context, int i, int i2, String str, int i3, DialogInterface.OnClickListener onClickListener, int i4, DialogInterface.OnClickListener onClickListener2, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "message");
        Intrinsics.checkParameterIsNotNull(onClickListener, "leftAction");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "rightAction");
        String string = UIHelper.getString(i);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(title)");
        return m236216b(context, string, i2, str, i3, onClickListener, i4, onClickListener2, z);
    }

    @JvmStatic
    /* renamed from: a */
    public static final UDDialog m236204a(Context context, View view, int i, int i2, Integer num, int i3, DialogInterface.OnClickListener onClickListener, int i4, DialogInterface.OnClickListener onClickListener2, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(onClickListener, "leftAction");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "rightAction");
        String a = C60773o.m236119a(i);
        Intrinsics.checkExpressionValueIsNotNull(a, "VCCommonUtils.getString(title)");
        return m236205a(context, view, a, i2, num, i3, onClickListener, i4, onClickListener2, z);
    }

    @JvmStatic
    /* renamed from: a */
    public static final UDDialog m236205a(Context context, View view, String str, int i, Integer num, int i2, DialogInterface.OnClickListener onClickListener, int i3, DialogInterface.OnClickListener onClickListener2, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(onClickListener, "leftAction");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "rightAction");
        C60854c cVar = new C60854c(context);
        if (view != null) {
            C60854c cVar2 = (C60854c) cVar.contentLayout(view);
        }
        if (num != null) {
            int intValue = num.intValue();
            cVar.message(intValue);
            m236199a(cVar, C60773o.m236119a(intValue));
        }
        C60854c cVar3 = (C60854c) ((C60854c) ((C60854c) cVar.title(str)).addActionButton(R.id.ud_dialog_btn_secondary, i2, onClickListener)).translationOnY(C60773o.m236122b((double) (C60776r.m236148f() / -2)));
        Intrinsics.checkExpressionValueIsNotNull(cVar3, "builder");
        C60854c cVar4 = cVar3;
        m236198a(cVar4, i3, onClickListener2);
        m236196a(cVar4, i);
        m236200a(cVar4, z);
        return cVar3.show();
    }

    /* renamed from: a */
    public static /* synthetic */ UDDialog m236202a(Context context, int i, int i2, int i3, int i4, DialogInterface.OnClickListener onClickListener, int i5, DialogInterface.OnClickListener onClickListener2, boolean z, boolean z2, int i6, Object obj) {
        return m236201a(context, i, (i6 & 4) != 0 ? 1 : i2, i3, i4, onClickListener, i5, onClickListener2, z, (i6 & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? f151981b : z2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final UDDialog m236201a(Context context, int i, int i2, int i3, int i4, DialogInterface.OnClickListener onClickListener, int i5, DialogInterface.OnClickListener onClickListener2, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(onClickListener, "headAction");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "tailAction");
        UDDialogBuilder eVar = new UDDialogBuilder(context);
        String a = C60773o.m236119a(i);
        Intrinsics.checkExpressionValueIsNotNull(a, "VCCommonUtils.getString(title)");
        String a2 = C60773o.m236119a(i3);
        Intrinsics.checkExpressionValueIsNotNull(a2, "VCCommonUtils.getString(message)");
        UDDialogBuilder eVar2 = (UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(a)).message(a2)).style(R.style.VcLarkUIDialog)).translationOnY(C60773o.m236122b((double) (C60776r.m236148f() / -2)))).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90706b(i5).mo90703a(onClickListener2))).addActionButton(R.id.ud_dialog_btn_secondary, i4, onClickListener)).actionButtonOrientation(UDBaseDialogBuilder.ActionBottomOrientation.VERTICAL);
        UDDialogBuilder eVar3 = eVar2;
        m236200a(eVar3, z);
        m236196a(eVar3, i2);
        m236199a(eVar3, C60773o.m236119a(i3));
        return eVar2.show();
    }

    @JvmStatic
    /* renamed from: a */
    public static final DialogC25637f m236181a(Context context, int i, int i2, DialogInterface.OnClickListener onClickListener, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(onClickListener, "centerAction");
        String a = C60773o.m236119a(i);
        Intrinsics.checkExpressionValueIsNotNull(a, "VCCommonUtils.getString(message)");
        return m236190a(context, a, i2, onClickListener, z);
    }

    @JvmStatic
    /* renamed from: a */
    public static final DialogC25637f m236190a(Context context, String str, int i, DialogInterface.OnClickListener onClickListener, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "message");
        Intrinsics.checkParameterIsNotNull(onClickListener, "centerAction");
        C25639g a = new C25639g(context).mo89242c(str).mo89265x(R.style.VcLarkUIDialog).mo89262u(C60773o.m236122b((double) (C60776r.m236148f() / -2))).mo89224a(R.id.lkui_dialog_btn_center, i, onClickListener);
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        m236194a(a, str);
        m236195a(a, z);
        return a.mo89239c();
    }

    /* renamed from: a */
    public static /* synthetic */ Dialog m236170a(Context context, String str, int i, DialogInterface.OnClickListener onClickListener, int i2, DialogInterface.OnClickListener onClickListener2, boolean z, boolean z2, LKVCJumpMaxWidthDialogController.OnJumpListener aVar, int i3, Object obj) {
        return m236169a(context, str, i, onClickListener, i2, onClickListener2, z, (i3 & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? f151981b : z2, aVar);
    }

    @JvmStatic
    /* renamed from: a */
    public static final Dialog m236169a(Context context, String str, int i, DialogInterface.OnClickListener onClickListener, int i2, DialogInterface.OnClickListener onClickListener2, boolean z, boolean z2, LKVCJumpMaxWidthDialogController.OnJumpListener aVar) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "leftAction");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "rightAction");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        C60851a aVar2 = new C60851a(context);
        if (str != null) {
            aVar2.message(str);
            aVar2.mo208658a(str, aVar);
        }
        C60851a aVar3 = (C60851a) ((C60851a) ((C60851a) aVar2.style(R.style.VcLarkUIDialog)).translationOnY(C60773o.m236122b((double) (C60776r.m236148f() / -2)))).addActionButton(R.id.ud_dialog_btn_secondary, i, onClickListener);
        Intrinsics.checkExpressionValueIsNotNull(aVar3, "builder");
        C60851a aVar4 = aVar3;
        m236198a(aVar4, i2, onClickListener2);
        m236199a(aVar4, str);
        m236200a(aVar4, z);
        return aVar3.show();
    }

    @JvmStatic
    /* renamed from: a */
    public static final Object m236210a(Context context, boolean z, int i, int i2, int i3, LanguageType languageType, LanguageType languageType2, int i4, DialogInterface.OnClickListener onClickListener, boolean z2, boolean z3) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(languageType, "left");
        Intrinsics.checkParameterIsNotNull(languageType2, "right");
        Intrinsics.checkParameterIsNotNull(onClickListener, "centerAction");
        C61992a b = new C61992a(context).mo214594a(languageType).mo214596b(languageType2);
        ((C61992a) ((C61992a) ((C61992a) ((C61992a) b.mo89237b(UIHelper.getString(i))).mo89242c(UIHelper.getString(i3))).mo214595a(UIHelper.getString(i3)).mo89265x(R.style.VcLarkUIDialog)).mo89262u(C60773o.m236122b((double) (C60776r.m236148f() / -2)))).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_center).mo89268a(C60773o.m236119a(i4)).mo89267a(onClickListener));
        Intrinsics.checkExpressionValueIsNotNull(b, "builder");
        C61992a aVar = b;
        m236192a(aVar, i2);
        m236191a(aVar);
        m236195a(aVar, z2);
        if (z) {
            return b.mo89244d();
        }
        return b.mo89239c();
    }

    @JvmStatic
    /* renamed from: a */
    public static final UDDialog m236209a(C61303k kVar, Context context, int i, int i2, int i3, boolean z, BreakoutRoomPopWindowDialogController.IDelegate aVar, boolean z2, BreakoutRoomPopWindowDialogController.OnShouldShowListener bVar, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "iDelegate");
        Intrinsics.checkParameterIsNotNull(bVar, "onShouldShowListener");
        Intrinsics.checkParameterIsNotNull(str, "roomId");
        UDBaseDialogBuilder actionButtonOrientation = new C61521a(context).mo213224a(z2).mo213221a(aVar).mo213223a(str).mo213220a(kVar).mo213222a(bVar).title(i).style(R.style.VcLarkUIDialog).translationOnY(C60773o.m236122b((double) (C60776r.m236148f() / -2))).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90704a(C60773o.m236119a(i2))).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_secondary).mo90704a(C60773o.m236119a(i3))).actionButtonOrientation(UDBaseDialogBuilder.ActionBottomOrientation.VERTICAL);
        m236196a(actionButtonOrientation, 5);
        m236200a(actionButtonOrientation, z);
        return actionButtonOrientation.show();
    }

    @JvmStatic
    /* renamed from: a */
    public static final C25639g<?> m236195a(C25639g<?> gVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(gVar, "builder");
        C25639g<?> d = gVar.mo89247e(z).mo89247e(z).mo89246d(z);
        Intrinsics.checkExpressionValueIsNotNull(d, "builder.cancelOnTouchOut…      .cancelable(enable)");
        return d;
    }

    @JvmStatic
    /* renamed from: a */
    public static final UDBaseDialogBuilder<?> m236200a(UDBaseDialogBuilder<?> uDBaseDialogBuilder, boolean z) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        return uDBaseDialogBuilder.cancelOnTouchOutside(z).cancelOnTouchOutside(z).cancelable(z);
    }

    @JvmStatic
    /* renamed from: a */
    public static final C25639g<?> m236192a(C25639g<?> gVar, int i) {
        Intrinsics.checkParameterIsNotNull(gVar, "builder");
        C25639g<?> j = gVar.mo89238b(true).mo89251j(i);
        Intrinsics.checkExpressionValueIsNotNull(j, "builder.titleBold(true)\n…   .titleLineCount(lines)");
        return j;
    }

    @JvmStatic
    /* renamed from: a */
    public static final UDBaseDialogBuilder<?> m236197a(UDBaseDialogBuilder<?> uDBaseDialogBuilder, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        uDBaseDialogBuilder.titleGravity(i2);
        return uDBaseDialogBuilder.titleBold(true).titleLineCount(i);
    }

    @JvmStatic
    /* renamed from: a */
    public static final C25639g<?> m236191a(C25639g<?> gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "builder");
        C25639g<?> o = gVar.mo89256o(R.color.text_title);
        Intrinsics.checkExpressionValueIsNotNull(o, "builder.messageTextColor(R.color.text_title)");
        return o;
    }

    @JvmStatic
    /* renamed from: a */
    public static final C25639g<?> m236194a(C25639g<?> gVar, String str) {
        Intrinsics.checkParameterIsNotNull(gVar, "builder");
        Paint paint = new Paint();
        int a = C60773o.m236115a(16.0d);
        float e = (float) ((C60776r.m236147e() - (C60773o.m236115a(36.0d) * 2)) - (C60773o.m236115a(20.0d) * 2));
        paint.setTextSize((float) a);
        if (str != null) {
            int length = str.length();
            int i = 0;
            int i2 = 0;
            float f = BitmapDescriptorFactory.HUE_RED;
            for (int i3 = 0; i3 < length; i3++) {
                if (i >= 0 && i < str.length()) {
                    f = paint.measureText(str, i, i3 + 1);
                }
                if (f > e && i2 < 2) {
                    i2++;
                    if (i2 > 1) {
                        gVar.mo89253l(8388611);
                    }
                    i = i3;
                }
            }
        }
        C25639g<?> o = gVar.mo89256o(R.color.text_title);
        Intrinsics.checkExpressionValueIsNotNull(o, "builder.messageTextColor(R.color.text_title)");
        return o;
    }

    @JvmStatic
    /* renamed from: a */
    public static final UDBaseDialogBuilder<?> m236199a(UDBaseDialogBuilder<?> uDBaseDialogBuilder, String str) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Paint paint = new Paint();
        int a = C60773o.m236115a(16.0d);
        float e = (float) ((C60776r.m236147e() - (C60773o.m236115a(36.0d) * 2)) - (C60773o.m236115a(20.0d) * 2));
        paint.setTextSize((float) a);
        if (str != null) {
            int length = str.length();
            int i = 0;
            int i2 = 0;
            float f = BitmapDescriptorFactory.HUE_RED;
            for (int i3 = 0; i3 < length; i3++) {
                if (i >= 0 && i < str.length()) {
                    f = paint.measureText(str, i, i3 + 1);
                }
                if (f > e && i2 < 2) {
                    i2++;
                    if (i2 > 1) {
                        uDBaseDialogBuilder.messageGravity(8388611);
                    }
                    i = i3;
                }
            }
        }
        return uDBaseDialogBuilder.messageTextColor(R.color.text_title);
    }

    @JvmStatic
    /* renamed from: a */
    public static final C25639g<?> m236193a(C25639g<?> gVar, int i, DialogInterface.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(gVar, "builder");
        Intrinsics.checkParameterIsNotNull(onClickListener, "action");
        C25639g<?> a = gVar.mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89269b(i).mo89267a(onClickListener));
        Intrinsics.checkExpressionValueIsNotNull(a, "builder.addActionButton(….onClickListener(action))");
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final UDBaseDialogBuilder<?> m236198a(UDBaseDialogBuilder<?> uDBaseDialogBuilder, int i, DialogInterface.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(onClickListener, "action");
        return uDBaseDialogBuilder.addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90706b(i).mo90703a(onClickListener));
    }

    @JvmStatic
    /* renamed from: a */
    public static final UDDialog m236203a(Context context, long j, long j2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(onClickListener, "leftAction");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "rightAction");
        Intrinsics.checkParameterIsNotNull(onClickListener3, "timeoutAction");
        C60729a aVar = new C60729a(context);
        aVar.marginInDp(36);
        aVar.title(R.string.View_MV_MeetingEndSingleMember_PopUpTitle);
        aVar.titleSize(17);
        C60729a aVar2 = aVar;
        m236197a(aVar2, 1, 1);
        aVar.titleBold(false);
        aVar.message(R.string.View_MV_SingleMemberSetEnd_PopUpExplain);
        aVar.messageTextSize(16);
        m236217b(aVar2, R.string.View_MV_SingleMemberSetEnd_PopUpExplain);
        m236200a((UDBaseDialogBuilder<?>) aVar2, false);
        return ((C60729a) ((C60729a) ((C60729a) ((C60729a) ((C60729a) aVar.mo208353a(R.string.View_MV_EndMeetingTimer_PopUpButton).mo208354a(j).mo208356b(j2).mo208355a(onClickListener3).style(R.style.VcLarkUIDialog)).translationOnY(C60773o.m236122b((double) (C60776r.m236148f() / -2)))).footerLayoutRes(R.layout.vc_meeting_auto_end_confirm_dialog_footer)).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_secondary).mo90706b(R.string.View_MV_StayMeeting_PopUpButton).mo90707c(17).mo90703a(onClickListener))).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90706b(R.string.View_MV_EndMeetingTimer_PopUpButton).mo90707c(17).mo90710d(R.color.vc_meeting_auto_end_text_color).mo90703a(onClickListener2))).show();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.e.s$b */
    public static final class DialogInterface$OnClickListenerC60780b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC60780b f151983a = new DialogInterface$OnClickListenerC60780b();

        DialogInterface$OnClickListenerC60780b() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.e.s$a */
    public static final class DialogInterface$OnClickListenerC60779a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC60779a f151982a = new DialogInterface$OnClickListenerC60779a();

        DialogInterface$OnClickListenerC60779a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C28460b.m104295a(ar.m236697b());
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final UDBaseDialogBuilder<?> m236196a(UDBaseDialogBuilder<?> uDBaseDialogBuilder, int i) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        return uDBaseDialogBuilder.titleBold(true).titleLineCount(i);
    }

    @JvmStatic
    /* renamed from: b */
    public static final UDBaseDialogBuilder<?> m236217b(UDBaseDialogBuilder<?> uDBaseDialogBuilder, int i) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        return uDBaseDialogBuilder.messageGravity(i).messageTextColor(R.color.text_title);
    }

    @JvmStatic
    /* renamed from: a */
    public static final Dialog m236160a(Context context, int i, int i2, String str, int i3, int i4, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "message");
        UDDialogBuilder eVar = new UDDialogBuilder(context);
        String string = UIHelper.getString(i);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(title)");
        UDDialogBuilder eVar2 = (UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(string)).message(str)).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90706b(i4).mo90703a(DialogInterface$OnClickListenerC60779a.f151982a))).addActionButton(R.id.ud_dialog_btn_secondary, i3, DialogInterface$OnClickListenerC60780b.f151983a)).style(R.style.VcLarkUIDialog);
        UDDialogBuilder eVar3 = eVar2;
        m236196a(eVar3, i2);
        m236199a(eVar3, str);
        m236200a(eVar3, z);
        return eVar2.show();
    }

    @JvmStatic
    /* renamed from: b */
    public static final DialogC25637f m236214b(Context context, int i, int i2, int i3, DialogInterface.OnClickListener onClickListener, int i4, DialogInterface.OnClickListener onClickListener2, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(onClickListener, "leftAction");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "rightAction");
        C25639g a = new C25639g(context).mo89237b(UIHelper.getString(i)).mo89265x(R.style.VcLarkUIDialog).mo89262u(C60773o.m236122b((double) (C60776r.m236148f() / -2))).mo89224a(R.id.lkui_dialog_btn_left, i3, onClickListener).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89271d(R.color.footer_text_color_black_light).mo89269b(i4).mo89267a(onClickListener2));
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        m236192a(a, i2);
        m236195a(a, z);
        DialogC25637f c = a.mo89239c();
        Intrinsics.checkExpressionValueIsNotNull(c, "dialog");
        return c;
    }

    @JvmStatic
    /* renamed from: c */
    public static final DialogC25637f m236219c(Context context, String str, int i, String str2, int i2, DialogInterface.OnClickListener onClickListener, int i3, DialogInterface.OnClickListener onClickListener2, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str2, "message");
        Intrinsics.checkParameterIsNotNull(onClickListener, "leftAction");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "rightAction");
        C25639g a = new C25639g(context).mo89237b(str).mo89242c(str2).mo89265x(R.style.VcLarkUIDialog).mo89262u(C60773o.m236122b((double) (C60776r.m236148f() / -2))).mo89224a(R.id.lkui_dialog_btn_left, i2, onClickListener).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89269b(i3).mo89267a(onClickListener2).mo89271d(R.color.function_danger_500));
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        m236192a(a, i);
        m236194a(a, str2);
        m236195a(a, z);
        return a.mo89239c();
    }

    @JvmStatic
    /* renamed from: b */
    public static final DialogC25637f m236216b(Context context, String str, int i, String str2, int i2, DialogInterface.OnClickListener onClickListener, int i3, DialogInterface.OnClickListener onClickListener2, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str2, "message");
        Intrinsics.checkParameterIsNotNull(onClickListener, "leftAction");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "rightAction");
        C25639g a = new C25639g(context).mo89237b(str).mo89242c(str2).mo89265x(R.style.VcLarkUIDialog).mo89262u(C60773o.m236122b((double) (C60776r.m236148f() / -2))).mo89224a(R.id.lkui_dialog_btn_left, i2, onClickListener);
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        m236193a(a, i3, onClickListener2);
        m236192a(a, i);
        m236194a(a, str2);
        m236195a(a, z);
        return a.mo89239c();
    }

    @JvmStatic
    /* renamed from: a */
    public static final Dialog m236164a(Context context, View view, int i, int i2, int i3, DialogInterface.OnClickListener onClickListener, int i4, DialogInterface.OnClickListener onClickListener2, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "content");
        Intrinsics.checkParameterIsNotNull(onClickListener, "leftAction");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "rightAction");
        C25639g u = new C25639g(context).mo89237b(UIHelper.getString(i)).mo89236b(view).mo89224a(R.id.lkui_dialog_btn_left, i3, onClickListener).mo89265x(R.style.VcLarkUIDialog).mo89262u(C60773o.m236122b((double) (C60776r.m236148f() / -2)));
        Intrinsics.checkExpressionValueIsNotNull(u, "builder");
        m236192a(u, i2);
        m236195a(u, z);
        m236193a(u, i4, onClickListener2);
        return u.mo89239c();
    }

    @JvmStatic
    /* renamed from: a */
    public static final Dialog m236166a(Context context, Integer num, int i, String str, int i2, DialogInterface.OnClickListener onClickListener, int i3, DialogInterface.OnClickListener onClickListener2, boolean z, boolean z2, LKVCJumpDialogController.OnJumpListener aVar) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "leftAction");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "rightAction");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        C60841b bVar = new C60841b(context);
        if (num != null) {
            C60841b bVar2 = (C60841b) bVar.mo89237b(UIHelper.getString(num.intValue()));
        }
        if (str != null) {
            bVar.mo89242c(str);
            bVar.mo208633a(str, aVar);
        }
        C60841b bVar3 = (C60841b) ((C60841b) ((C60841b) bVar.mo89265x(R.style.VcLarkUIDialog)).mo89262u(C60773o.m236122b((double) (C60776r.m236148f() / -2)))).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_left).mo89269b(i2).mo89267a(onClickListener).mo89271d(R.color.function_danger_500));
        Intrinsics.checkExpressionValueIsNotNull(bVar3, "builder");
        C60841b bVar4 = bVar3;
        m236193a(bVar4, i3, onClickListener2);
        m236192a(bVar4, i);
        m236191a(bVar4);
        m236195a(bVar4, z);
        return bVar3.mo89239c();
    }

    @JvmStatic
    /* renamed from: a */
    public static final Dialog m236162a(Context context, int i, int i2, String str, int i3, DialogInterface.OnClickListener onClickListener, int i4, DialogInterface.OnClickListener onClickListener2, boolean z, boolean z2, LKVCJumpDialogController.OnJumpListener aVar, int i5) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        Intrinsics.checkParameterIsNotNull(onClickListener, "leftAction");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "rightAction");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        C60841b bVar = (C60841b) ((C60841b) ((C60841b) ((C60841b) ((C60841b) new C60841b(context).mo89237b(UIHelper.getString(i))).mo89242c(str)).mo208634a(str, aVar, i5).mo89265x(R.style.VcLarkUIDialog)).mo89262u(C60773o.m236122b((double) (C60776r.m236148f() / -2)))).mo89224a(R.id.lkui_dialog_btn_left, i3, onClickListener);
        Intrinsics.checkExpressionValueIsNotNull(bVar, "builder");
        C60841b bVar2 = bVar;
        m236193a(bVar2, i4, onClickListener2);
        m236192a(bVar2, i2);
        m236191a(bVar2);
        m236195a(bVar2, z);
        return bVar.mo89239c();
    }

    /* renamed from: a */
    public static /* synthetic */ Dialog m236167a(Context context, Integer num, int i, String str, int i2, DialogInterface.OnClickListener onClickListener, int i3, DialogInterface.OnClickListener onClickListener2, boolean z, boolean z2, LKVCJumpDialogController.OnJumpListener aVar, int i4, Object obj) {
        boolean z3;
        if ((i4 & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0) {
            z3 = f151981b;
        } else {
            z3 = z2;
        }
        return m236166a(context, num, i, str, i2, onClickListener, i3, onClickListener2, z, z3, aVar);
    }

    /* renamed from: a */
    public static /* synthetic */ Dialog m236163a(Context context, int i, int i2, String str, int i3, DialogInterface.OnClickListener onClickListener, int i4, DialogInterface.OnClickListener onClickListener2, boolean z, boolean z2, LKVCJumpDialogController.OnJumpListener aVar, int i5, int i6, Object obj) {
        boolean z3;
        if ((i6 & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0) {
            z3 = f151981b;
        } else {
            z3 = z2;
        }
        return m236162a(context, i, i2, str, i3, onClickListener, i4, onClickListener2, z, z3, aVar, i5);
    }
}
