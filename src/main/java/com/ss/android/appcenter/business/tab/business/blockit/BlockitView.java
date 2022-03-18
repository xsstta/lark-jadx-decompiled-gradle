package com.ss.android.appcenter.business.tab.business.blockit;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.google.gson.JsonObject;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.blockit.AbstractC24073e;
import com.larksuite.component.blockit.C24046a;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.openplatform.api.AbstractC24361a;
import com.larksuite.component.openplatform.api.entity.C24377a;
import com.larksuite.component.openplatform.api.entity.OPContainerBundle;
import com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25904o;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.monitor.p1269a.C27702b;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.net.dto.BlockitInfo;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.tab.business.blockit.api.BlockitApiPlugin;
import com.ss.android.appcenter.business.tab.business.blockit.p1274a.C27833c;
import com.ss.android.appcenter.business.tab.business.blockit.p1275b.C27835a;
import com.ss.android.appcenter.business.tab.business.blockit.part.BlockitSlot;
import com.ss.android.appcenter.business.tab.business.blockit.part.BlockitStatusView;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a.C27906b;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27923c;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27924d;
import com.ss.android.appcenter.business.tab.business.widget.C27952c;
import com.ss.android.appcenter.business.tab.business.widget.OpenBlockPlugin;
import com.ss.android.appcenter.business.tab.fragmentv3.C28082d;
import com.ss.android.appcenter.business.tab.fragmentv3.component.header.CommonHeader;
import com.ss.android.appcenter.business.tab.fragmentv3.p1283a.C28036c;
import com.ss.android.appcenter.common.util.C28182f;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.util.share_preference.UserSP;
import com.tt.refer.p3400a.p3410g.AbstractC67729a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 Ü\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002Ü\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u0017\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB\u001f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0001\u001a\u00020\u001c2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0014\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0014J\u0013\u0010\u0001\u001a\u00020\u001c2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0011\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u000eJ\u0007\u0010<\u001a\u00030\u0001J\u0014\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0007\u0010\u0001\u001a\u00020\u000eJ\n\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\u001b\u0010\u0001\u001a\u00030\u00012\b\u0010 \u0001\u001a\u00030¡\u00012\u0007\u0010¢\u0001\u001a\u00020\u001cJL\u0010\u0001\u001a\u00030\u00012\b\u0010 \u0001\u001a\u00030¡\u00012\u0007\u0010£\u0001\u001a\u00020\u000e2\u0007\u0010¢\u0001\u001a\u00020\u001c2\t\u0010¤\u0001\u001a\u0004\u0018\u00010M2\b\u0010g\u001a\u0004\u0018\u00010K2\u0011\u0010¥\u0001\u001a\f\u0012\u0005\u0012\u00030\u0001\u0018\u00010¦\u0001J\u001b\u0010§\u0001\u001a\u00030\u00012\u000f\u0010¨\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010¦\u0001H\u0002J\u001b\u0010©\u0001\u001a\u00030\u00012\u000f\u0010¥\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010¦\u0001H\u0002J\b\u0010ª\u0001\u001a\u00030\u0001J\u0013\u0010«\u0001\u001a\u00030\u00012\u0007\u0010¬\u0001\u001a\u00020\u0013H\u0016J\t\u0010­\u0001\u001a\u00020\u001cH\u0002J\u0013\u0010®\u0001\u001a\u00030\u00012\u0007\u0010¯\u0001\u001a\u00020\u0013H\u0002J\u0013\u0010°\u0001\u001a\u00030\u00012\u0007\u0010¯\u0001\u001a\u00020\u0013H\u0002J\u0013\u0010±\u0001\u001a\u00030\u00012\u0007\u0010²\u0001\u001a\u00020\u001cH\u0002J\u0016\u0010³\u0001\u001a\u00030\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0002J\u001f\u0010´\u0001\u001a\u00030\u00012\n\u0010µ\u0001\u001a\u0005\u0018\u00010¶\u00012\u0007\u0010·\u0001\u001a\u00020\u001cH\u0002J.\u0010¸\u0001\u001a\u00030\u00012\u0007\u0010¹\u0001\u001a\u00020\u000e2\u0007\u0010º\u0001\u001a\u00020\u000e2\u0007\u0010»\u0001\u001a\u00020\u000e2\u0007\u0010¼\u0001\u001a\u00020\u000eH\u0016J\n\u0010½\u0001\u001a\u00030\u0001H\u0016J\u001c\u0010¾\u0001\u001a\u00030\u00012\u0007\u0010¿\u0001\u001a\u00020\u000e2\u0007\u0010À\u0001\u001a\u00020\u000eH\u0014J\u001e\u0010Á\u0001\u001a\u00030\u00012\b\u0010Â\u0001\u001a\u00030Ã\u00012\b\u0010\u0001\u001a\u00030Ä\u0001H\u0016J\u001e\u0010Å\u0001\u001a\u00030\u00012\b\u0010Æ\u0001\u001a\u00030Ç\u00012\b\u0010È\u0001\u001a\u00030É\u0001H\u0016J\u0011\u0010Ê\u0001\u001a\u00030\u00012\u0007\u0010Ë\u0001\u001a\u00020\u0013J\u0014\u0010Ì\u0001\u001a\u00030\u00012\n\u0010Í\u0001\u001a\u0005\u0018\u00010Î\u0001J\u0012\u0010Ï\u0001\u001a\u00020\u001c2\u0007\u0010Ð\u0001\u001a\u00020\u0013H\u0016J\u0013\u0010Ñ\u0001\u001a\u00030\u00012\t\u0010Ò\u0001\u001a\u0004\u0018\u000104J\u0013\u0010Ó\u0001\u001a\u00030\u00012\u0007\u0010Ô\u0001\u001a\u00020\u001cH\u0002J\b\u0010Õ\u0001\u001a\u00030\u0001J\b\u0010Ö\u0001\u001a\u00030\u0001J\u0007\u0010×\u0001\u001a\u00020\u001cJ\u0014\u0010Ø\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030Ù\u0001H\u0002J\u0013\u0010Ú\u0001\u001a\u00020\u001c2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010Û\u0001\u001a\u00030\u0001H\u0002J\b\u0010\u0001\u001a\u00030\u0001R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001c\u0010$\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0010\u00103\u001a\u0004\u0018\u000104X\u000e¢\u0006\u0002\n\u0000R\u0012\u00105\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0004\n\u0002\u00106R\u0012\u00107\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0004\n\u0002\u00106R\u001a\u00108\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001e\"\u0004\b:\u0010 R\u000e\u0010;\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010<\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u0010 R\u001c\u0010?\u001a\u0004\u0018\u00010@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0010\u0010E\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010G\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u001e\"\u0004\bI\u0010 R\u0010\u0010J\u001a\u0004\u0018\u00010KX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010L\u001a\u0004\u0018\u00010MX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010N\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u001e\"\u0004\bO\u0010 R\u000e\u0010P\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010Q\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u001e\"\u0004\bR\u0010 R\u0010\u0010S\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020UX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020UX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020XX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020ZX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020XX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010^\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u001e\"\u0004\b`\u0010 R\u001c\u0010a\u001a\u0004\u0018\u00010bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0010\u0010g\u001a\u0004\u0018\u00010KX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010h\u001a\u0004\u0018\u00010MX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010i\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010j\u001a\u00020UX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u000e\u0010o\u001a\u00020pX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010u\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0015\"\u0004\bw\u0010\u0017R\u000e\u0010x\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010y\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010\u001e\"\u0004\b{\u0010 R\u000e\u0010|\u001a\u00020\u0013XD¢\u0006\u0002\n\u0000R\u001f\u0010}\u001a\u0004\u0018\u00010~X\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0001\u001a\u00020\u0013X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\u0015\"\u0005\b\u0001\u0010\u0017R\u000f\u0010\u0001\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R!\u0010\u0001\u001a\u0004\u0018\u00010~X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u000f\u0010\u0001\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000¨\u0006Ý\u0001"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/blockit/BlockitView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Lcom/ss/android/appcenter/business/tab/business/blockit/api/BlockitApiPlugin$BlockitApiHandler;", "Lcom/ss/android/appcenter/business/tab/business/blockit/part/BlockitSlot$IBlockitSlotSizeChangedListener;", "Lcom/ss/android/appcenter/business/tab/business/blockit/part/BlockitStatusView$IStatusViewClickListener;", "Landroidx/lifecycle/LifecycleEventObserver;", "Lcom/ss/android/appcenter/business/tab/business/blockit/part/BlockitSlot$IContentTapListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "apiPlugin", "Lcom/ss/android/appcenter/business/tab/business/blockit/api/BlockitApiPlugin;", "appId", "", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "appName", "getAppName", "setAppName", "autoMode", "", "getAutoMode", "()Z", "setAutoMode", "(Z)V", "blkId", "getBlkId", "setBlkId", "blkTypeId", "getBlkTypeId", "setBlkTypeId", "blockLogger", "Lcom/tt/refer/abs/log/AbsRuntimeLogger;", "getBlockLogger", "()Lcom/tt/refer/abs/log/AbsRuntimeLogger;", "setBlockLogger", "(Lcom/tt/refer/abs/log/AbsRuntimeLogger;)V", "blockMenuEntity", "Lcom/ss/android/appcenter/business/tab/business/view/itemmenu/block/BlockMenuEntity;", "getBlockMenuEntity", "()Lcom/ss/android/appcenter/business/tab/business/view/itemmenu/block/BlockMenuEntity;", "setBlockMenuEntity", "(Lcom/ss/android/appcenter/business/tab/business/view/itemmenu/block/BlockMenuEntity;)V", "blockMenuListener", "Lcom/ss/android/appcenter/business/tab/business/blockit/IBlockMenuListener;", "componentHeightPx", "Ljava/lang/Integer;", "containerHeightPx", "demoMode", "getDemoMode", "setDemoMode", "errorFlag", "forceUpdate", "getForceUpdate", "setForceUpdate", "fragment", "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "setFragment", "(Landroidx/fragment/app/Fragment;)V", "iconKey", "inLongClickAction", "inited", "getInited", "setInited", "insideHeader", "Lcom/ss/android/appcenter/business/tab/fragmentv3/component/header/CommonHeader;", "insideHeaderModel", "Lcom/ss/android/appcenter/business/tab/fragmentv3/component/header/CommonHeader$Model;", "isCreatedBlock", "setCreatedBlock", "isMove", "isTitleInside", "setTitleInside", "itemId", "lastX", "", "lastY", "launchDuration", "", "longClickAction", "Ljava/lang/Runnable;", "mountTimestamp", "mounted", "mounting", "oldHost", "getOldHost", "setOldHost", "opAppContainer", "Lcom/larksuite/component/openplatform/api/OPAppContainer;", "getOpAppContainer", "()Lcom/larksuite/component/openplatform/api/OPAppContainer;", "setOpAppContainer", "(Lcom/larksuite/component/openplatform/api/OPAppContainer;)V", "outsideHeader", "outsideHeaderModel", "previewToken", "roundCorner", "getRoundCorner", "()F", "setRoundCorner", "(F)V", "roundPath", "Landroid/graphics/Path;", "roundRect", "Landroid/graphics/RectF;", "showFrame", "showStartLoading", "sourceData", "getSourceData", "setSourceData", "standardComponentHeightPx", "standardMode", "getStandardMode", "setStandardMode", "tag", "templateConfig", "Lcom/google/gson/JsonObject;", "getTemplateConfig", "()Lcom/google/gson/JsonObject;", "setTemplateConfig", "(Lcom/google/gson/JsonObject;)V", "templateId", "getTemplateId", "setTemplateId", "touchSlop", "typedDataCollection", "getTypedDataCollection", "setTypedDataCollection", "useIgStyle", "addMenuItem", "menuItem", "Lcom/ss/android/appcenter/business/tab/business/view/itemmenu/menuitem/MenuItem;", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "dispatchTouchEvent", "event", "Landroid/view/MotionEvent;", "editComponentHeight", "height", "getBaseOPMonitor", "Lcom/ss/android/lark/opmonitor/service/OPMonitor;", "monitorCode", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "getHeaderHeight", "handleGetContainerRect", "Lorg/json/JSONObject;", "handleHeaderAndContainer", "init", "info", "Lcom/ss/android/appcenter/business/net/dto/ItemInfo;", "gifLoadingMode", "componentHeight", "headerModal", "editorMenuItems", "", "initConfigMenuitems", "blockMenuItems", "initEditorMenuitems", "initHostConsole", "invokeApiMonitor", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "isAutoMode", "logE", "msg", "logI", "mountBlockit", "useForceUpdate", "onButtonSlotClick", "onConfigLoaded", "config", "Lcom/ss/android/appcenter/business/tab/business/blockit/entity/BlockitConfigEntity;", "supportedDarkMode", "onContainerResize", "w", C14002h.f36692e, "oldW", "oldH", "onContentTap", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onStateChanged", ShareHitPoint.f121868c, "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/Lifecycle$Event;", "onStatusViewClick", "v", "Landroid/view/View;", UpdateKey.STATUS, "Lcom/ss/android/appcenter/business/tab/business/blockit/part/BlockitStatusView$Status;", "onThemeChange", "theme", "registerToLifeCycle", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "removeMenuItem", "key", "setMenuListener", "l", "showBackground", "show", "showContent", "showError", "showHeader", "triggerLifeCycleEvent", "Lcom/larksuite/component/openplatform/api/lifecycle/OPContainerLifecycleEventEnum;", "updateMenuItem", "updateMenuVisible", "Companion", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BlockitView extends LinearLayoutCompat implements AbstractC1168n, BlockitApiPlugin.BlockitApiHandler, BlockitSlot.IBlockitSlotSizeChangedListener, BlockitSlot.IContentTapListener, BlockitStatusView.IStatusViewClickListener {

    /* renamed from: k */
    public static final Companion f69470k = new Companion(null);

    /* renamed from: A */
    private boolean f69471A;

    /* renamed from: B */
    private final int f69472B;

    /* renamed from: C */
    private final Runnable f69473C;

    /* renamed from: D */
    private boolean f69474D;

    /* renamed from: E */
    private String f69475E;

    /* renamed from: F */
    private String f69476F;

    /* renamed from: G */
    private String f69477G;

    /* renamed from: H */
    private String f69478H;

    /* renamed from: I */
    private String f69479I;

    /* renamed from: J */
    private String f69480J;

    /* renamed from: K */
    private boolean f69481K;

    /* renamed from: L */
    private String f69482L;

    /* renamed from: M */
    private String f69483M;

    /* renamed from: N */
    private boolean f69484N;

    /* renamed from: O */
    private boolean f69485O;

    /* renamed from: P */
    private boolean f69486P;

    /* renamed from: Q */
    private CommonHeader.C28077b f69487Q;

    /* renamed from: R */
    private CommonHeader.C28077b f69488R;

    /* renamed from: S */
    private CommonHeader f69489S;

    /* renamed from: T */
    private CommonHeader f69490T;

    /* renamed from: U */
    private C27906b f69491U;

    /* renamed from: V */
    private Fragment f69492V;

    /* renamed from: W */
    private boolean f69493W;

    /* renamed from: a */
    public final BlockitApiPlugin f69494a = new BlockitApiPlugin(this);
    private boolean aa;
    private boolean ab;
    private HashMap ac;

    /* renamed from: b */
    public float f69495b;

    /* renamed from: c */
    public float f69496c;

    /* renamed from: d */
    public AbstractC27836c f69497d;

    /* renamed from: e */
    public boolean f69498e;

    /* renamed from: f */
    public boolean f69499f;

    /* renamed from: g */
    public boolean f69500g;

    /* renamed from: h */
    public boolean f69501h;

    /* renamed from: i */
    public long f69502i;

    /* renamed from: j */
    public long f69503j;

    /* renamed from: l */
    private boolean f69504l;

    /* renamed from: m */
    private AbstractC67729a f69505m;

    /* renamed from: n */
    private final String f69506n = "BlockitView";

    /* renamed from: o */
    private int f69507o = C28209p.m103291a(150.0f);

    /* renamed from: p */
    private Integer f69508p;

    /* renamed from: q */
    private Integer f69509q;

    /* renamed from: r */
    private AbstractC24361a f69510r;

    /* renamed from: s */
    private String f69511s = "";

    /* renamed from: t */
    private boolean f69512t;

    /* renamed from: u */
    private JsonObject f69513u;

    /* renamed from: v */
    private JsonObject f69514v;

    /* renamed from: w */
    private float f69515w = ((float) C28209p.m103293a(getContext(), 12.0f));

    /* renamed from: x */
    private Path f69516x = new Path();

    /* renamed from: y */
    private RectF f69517y = new RectF();

    /* renamed from: z */
    private boolean f69518z;

    /* renamed from: b */
    public View mo99226b(int i) {
        if (this.ac == null) {
            this.ac = new HashMap();
        }
        View view = (View) this.ac.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.ac.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: f */
    public final void mo99237f() {
        this.f69484N = true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/blockit/BlockitView$Companion;", "", "()V", "ERROR_CODE_LOADING_TIME_OUT", "", "ERROR_MSG_LOADING_TIME_OUT", "HEIGHT_THRESHOLD1", "", "HEIGHT_THRESHOLD2", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.BlockitView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo99224a() {
        return this.f69486P;
    }

    public final String getAppId() {
        return this.f69477G;
    }

    public final String getAppName() {
        return this.f69475E;
    }

    public final boolean getAutoMode() {
        return this.ab;
    }

    public final String getBlkId() {
        return this.f69478H;
    }

    public final String getBlkTypeId() {
        return this.f69479I;
    }

    public final AbstractC67729a getBlockLogger() {
        return this.f69505m;
    }

    public final C27906b getBlockMenuEntity() {
        return this.f69491U;
    }

    public final boolean getDemoMode() {
        return this.f69504l;
    }

    public final boolean getForceUpdate() {
        return this.f69512t;
    }

    public final Fragment getFragment() {
        return this.f69492V;
    }

    public final boolean getInited() {
        return this.f69474D;
    }

    public final boolean getOldHost() {
        return this.aa;
    }

    public final AbstractC24361a getOpAppContainer() {
        return this.f69510r;
    }

    public final float getRoundCorner() {
        return this.f69515w;
    }

    public final String getSourceData() {
        return this.f69480J;
    }

    public final boolean getStandardMode() {
        return this.f69493W;
    }

    public final JsonObject getTemplateConfig() {
        return this.f69513u;
    }

    public final String getTemplateId() {
        return this.f69511s;
    }

    public final JsonObject getTypedDataCollection() {
        return this.f69514v;
    }

    /* renamed from: a */
    public final void mo99221a(ItemInfo itemInfo, boolean z) {
        Intrinsics.checkParameterIsNotNull(itemInfo, "info");
        this.f69493W = true;
        this.f69491U.f69761b = true;
        mo99220a(itemInfo, this.f69507o, z, null, null, null);
    }

    /* renamed from: a */
    public final void mo99220a(ItemInfo itemInfo, int i, boolean z, CommonHeader.C28077b bVar, CommonHeader commonHeader, List<? extends C27923c> list) {
        BlockitInfo block;
        Intrinsics.checkParameterIsNotNull(itemInfo, "info");
        if (!this.f69474D) {
            this.f69474D = true;
            this.f69508p = Integer.valueOf(i);
            this.f69509q = Integer.valueOf(i);
            BlockitStatusView blockitStatusView = (BlockitStatusView) mo99226b(R.id.blockit_status_view);
            Integer num = this.f69508p;
            if (num == null) {
                Intrinsics.throwNpe();
            }
            blockitStatusView.setContainerHeight(num.intValue());
            this.f69486P = bVar != null ? bVar.f70286a : true;
            this.f69490T = (CommonHeader) mo99226b(R.id.blockit_inside_header);
            this.f69487Q = bVar;
            this.f69489S = commonHeader;
            if (!C28182f.m103238c(list)) {
                if (list == null) {
                    Intrinsics.throwNpe();
                }
                m101628a(list);
            }
            C27906b bVar2 = this.f69491U;
            BlockitInfo block2 = itemInfo.getBlock();
            String str = null;
            bVar2.f69764e = (block2 == null || !block2.hasSetting || (block = itemInfo.getBlock()) == null) ? null : block.settingUrl;
            C28209p.m103299a((BlockitStatusView) mo99226b(R.id.blockit_status_view), i);
            this.f69475E = itemInfo.getName();
            this.f69476F = itemInfo.getIconKey();
            this.f69477G = itemInfo.getAppId();
            this.f69482L = itemInfo.getItemId();
            this.f69481K = itemInfo.isCreatedBlock();
            BlockitInfo block3 = itemInfo.getBlock();
            this.f69478H = block3 != null ? block3.blockId : null;
            BlockitInfo block4 = itemInfo.getBlock();
            this.f69479I = block4 != null ? block4.blockTypeId : null;
            BlockitInfo block5 = itemInfo.getBlock();
            this.f69483M = block5 != null ? block5.previewToken : null;
            BlockitInfo block6 = itemInfo.getBlock();
            if (block6 != null) {
                str = block6.sourceData;
            }
            this.f69480J = str;
            if (this.f69513u != null) {
                JsonObject jsonObject = new JsonObject();
                this.f69514v = jsonObject;
                jsonObject.add("templateConfig", this.f69513u);
            }
            mo99223a("init>>> componentHeight:" + i + ", model:" + bVar + ", itemInfo:" + itemInfo + '.');
            C28082d.m102671g().mo99972a(this.f69475E, this.f69478H);
            m101629a(false);
        }
    }

    /* renamed from: a */
    public final void mo99222a(C27835a aVar, boolean z) {
        String str;
        CommonHeader.C28077b bVar;
        CommonHeader.C28076a aVar2;
        C27548m m = C27548m.m100547m();
        Intrinsics.checkExpressionValueIsNotNull(m, "Providers.getInstance()");
        boolean a = m.mo98225i().mo98187a("openplatform.workplace.block.console");
        mo99223a("onConfigLoaded>>> config:" + aVar + ", consoleFg:" + a);
        List<C27923c> list = null;
        if (aVar == null || !aVar.f69572a) {
            this.f69488R = null;
            BlockitStatusView blockitStatusView = (BlockitStatusView) mo99226b(R.id.blockit_status_view);
            CommonHeader.C28077b bVar2 = this.f69487Q;
            if (bVar2 == null || !bVar2.f70287b) {
                str = this.f69475E;
            } else {
                CommonHeader.C28077b bVar3 = this.f69487Q;
                str = bVar3 != null ? bVar3.f70288c : null;
            }
            blockitStatusView.setBlockName(str);
        } else {
            String a2 = C28036c.m102461a(aVar.f69573b);
            if (!TextUtils.isEmpty(a2) || !TextUtils.isEmpty(aVar.f69574c)) {
                bVar = new CommonHeader.C28077b(a2, aVar.f69574c, aVar.f69575d, this.f69486P, true, "block");
            } else {
                bVar = new CommonHeader.C28077b(this.f69475E, this.f69476F, aVar.f69575d, this.f69486P, true, "block");
            }
            this.f69488R = bVar;
            if (this.f69486P) {
                aVar2 = null;
            } else {
                aVar2 = new CommonHeader.C28076a(C28209p.m103291a(16.0f), C28209p.m103291a(16.0f));
            }
            bVar.f70291f = aVar2;
            BlockitStatusView blockitStatusView2 = (BlockitStatusView) mo99226b(R.id.blockit_status_view);
            CommonHeader.C28077b bVar4 = this.f69488R;
            blockitStatusView2.setBlockName(bVar4 != null ? bVar4.f70288c : null);
        }
        if (aVar != null) {
            list = aVar.f69577f;
        }
        if (!C28182f.m103238c(list)) {
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            List<C27923c> list2 = aVar.f69577f;
            Intrinsics.checkExpressionValueIsNotNull(list2, "config!!.menuItems");
            m101631b(list2);
        }
        if (this.f69492V != null && a && aVar != null && aVar.f69576e) {
            mo99227b();
        }
        UICallbackExecutor.execute(new RunnableC27816h(this, z));
    }

    /* renamed from: a */
    public final void mo99223a(String str) {
        String str2 = this.f69506n;
        C28184h.m103250d(str2, "name:" + this.f69475E + ". appId=" + this.f69477G + ". blkTypeId=" + this.f69479I + ". blkId=" + this.f69478H + " msg:" + str);
    }

    @Override // com.ss.android.appcenter.business.tab.business.blockit.api.BlockitApiPlugin.BlockitApiHandler
    /* renamed from: a */
    public boolean mo99225a(C27923c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "menuItem");
        for (C27923c cVar2 : this.f69491U.f69762c) {
            if (TextUtils.equals(cVar.f69818a, cVar2.f69818a)) {
                cVar2.mo99549a(cVar);
                return true;
            }
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\u001c\u0010\r\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016¨\u0006\u0012"}, d2 = {"com/ss/android/appcenter/business/tab/business/blockit/BlockitView$mountBlockit$statusListener$1", "Lcom/larksuite/component/blockit/IBlockStatusListener;", "hideLoading", "", "loadingTimeOut", "onConfigLoad", "blockConfig", "Lcom/larksuite/component/blockit/IBlockStatusListener$BlockConfig;", "onLaunchStatusError", "errorCode", "", "errorMsg", "onLaunchSuccess", "onMountFail", "onMountSuccess", "container", "Lcom/larksuite/component/openplatform/api/OPAppContainer;", "onUpdateReady", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.BlockitView$g */
    public static final class C27810g implements AbstractC24073e {

        /* renamed from: a */
        final /* synthetic */ BlockitView f69527a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.BlockitView$g$a */
        static final class RunnableC27811a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C27810g f69528a;

            RunnableC27811a(C27810g gVar) {
                this.f69528a = gVar;
            }

            public final void run() {
                this.f69528a.f69527a.mo99230c();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.BlockitView$g$e */
        static final class RunnableC27815e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C27810g f69533a;

            RunnableC27815e(C27810g gVar) {
                this.f69533a = gVar;
            }

            public final void run() {
                this.f69533a.f69527a.f69498e = true;
                this.f69533a.f69527a.f69499f = false;
                this.f69533a.f69527a.mo99233d();
            }
        }

        @Override // com.larksuite.component.blockit.AbstractC24073e
        /* renamed from: c */
        public void mo86341c() {
            this.f69527a.mo99223a("loadingTimeOut>>>");
            UICallbackExecutor.execute(new RunnableC27812b(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.BlockitView$g$c */
        static final class RunnableC27813c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C27810g f69530a;

            /* renamed from: b */
            final /* synthetic */ Ref.BooleanRef f69531b;

            RunnableC27813c(C27810g gVar, Ref.BooleanRef booleanRef) {
                this.f69530a = gVar;
                this.f69531b = booleanRef;
            }

            public final void run() {
                this.f69530a.f69527a.f69498e = true;
                this.f69530a.f69527a.f69499f = false;
                if (this.f69531b.element) {
                    ((BlockitStatusView) this.f69530a.f69527a.mo99226b(R.id.blockit_status_view)).mo99325a(BlockitStatusView.Status.Upgrade);
                } else {
                    this.f69530a.f69527a.mo99233d();
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.BlockitView$g$d */
        static final class RunnableC27814d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C27810g f69532a;

            RunnableC27814d(C27810g gVar) {
                this.f69532a = gVar;
            }

            public final void run() {
                this.f69532a.f69527a.f69498e = true;
                this.f69532a.f69527a.f69499f = false;
                BlockitView blockitView = this.f69532a.f69527a;
                blockitView.mo99223a("onLaunchSuccess>>> showStartLoading:" + this.f69532a.f69527a.f69501h);
                if (!this.f69532a.f69527a.f69501h) {
                    this.f69532a.f69527a.mo99230c();
                }
            }
        }

        @Override // com.larksuite.component.blockit.AbstractC24073e
        /* renamed from: a */
        public void mo86335a() {
            this.f69527a.f69503j = System.currentTimeMillis() - this.f69527a.f69502i;
            BlockitView blockitView = this.f69527a;
            OPMonitorCode oPMonitorCode = C27702b.f69237h;
            Intrinsics.checkExpressionValueIsNotNull(oPMonitorCode, "AppCenterMonitorCode.WOR…LACE_BLOCK_RENDER_SUCCESS");
            blockitView.mo99215a(oPMonitorCode).addCategoryValue("duration", Long.valueOf(this.f69527a.f69503j)).setResultTypeSuccess().flush();
            UICallbackExecutor.execute(new RunnableC27814d(this));
        }

        @Override // com.larksuite.component.blockit.AbstractC24073e
        /* renamed from: b */
        public void mo86339b() {
            this.f69527a.mo99223a("hideLoading>>>");
            if (((BlockitStatusView) this.f69527a.mo99226b(R.id.blockit_status_view)).mo99324a() == BlockitStatusView.Status.Loading) {
                UICallbackExecutor.execute(new RunnableC27811a(this));
            }
        }

        @Override // com.larksuite.component.blockit.AbstractC24073e
        /* renamed from: d */
        public void mo86342d() {
            BlockitView blockitView = this.f69527a;
            blockitView.mo99223a("onUpdateReady>>> forceUpdate=" + this.f69527a.getForceUpdate());
            if (this.f69527a.getForceUpdate()) {
                this.f69527a.mo99261j();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.BlockitView$g$b */
        static final class RunnableC27812b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C27810g f69529a;

            RunnableC27812b(C27810g gVar) {
                this.f69529a = gVar;
            }

            public final void run() {
                if (((BlockitStatusView) this.f69529a.f69527a.mo99226b(R.id.blockit_status_view)).mo99324a() == BlockitStatusView.Status.Loading) {
                    this.f69529a.f69527a.mo99223a("loadingTimeOut>>> change to error.");
                    BlockitView blockitView = this.f69529a.f69527a;
                    OPMonitorCode oPMonitorCode = C27702b.f69238i;
                    Intrinsics.checkExpressionValueIsNotNull(oPMonitorCode, "AppCenterMonitorCode.WORKPLACE_BLOCK_RENDER_FAIL");
                    blockitView.mo99215a(oPMonitorCode).addCategoryValue("timeout", true).setErrorCode("-233").setErrorMessage("-timeout").setResultTypeFail().flush();
                    this.f69529a.f69527a.mo99233d();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C27810g(BlockitView blockitView) {
            this.f69527a = blockitView;
        }

        @Override // com.larksuite.component.blockit.AbstractC24073e
        /* renamed from: a */
        public void mo86337a(AbstractC24361a aVar) {
            AbstractC25904o u;
            IAppContext d;
            AbstractC25904o u2;
            this.f69527a.mo99223a("onMountSuccess>>>");
            this.f69527a.setOpAppContainer(aVar);
            if (!(aVar == null || (u2 = aVar.mo92183u()) == null)) {
                u2.mo92199a(this.f69527a.f69494a);
            }
            if (!(this.f69527a.getBlockLogger() == null || aVar == null || (d = aVar.mo87113d()) == null)) {
                d.registerService(AbstractC67729a.class, this.f69527a.getBlockLogger());
            }
            if (this.f69527a.getDemoMode() && aVar != null && (u = aVar.mo92183u()) != null) {
                u.mo92199a(new OpenBlockPlugin());
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x0061  */
        @Override // com.larksuite.component.blockit.AbstractC24073e
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo86336a(com.larksuite.component.blockit.AbstractC24073e.C24074a r8) {
            /*
            // Method dump skipped, instructions count: 153
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.appcenter.business.tab.business.blockit.BlockitView.C27810g.mo86336a(com.larksuite.component.blockit.e$a):void");
        }

        @Override // com.larksuite.component.blockit.AbstractC24073e
        /* renamed from: b */
        public void mo86340b(String str, String str2) {
            boolean z;
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = false;
            if (Intrinsics.areEqual(str, "-10016") && str2 != null) {
                if (new JSONObject(str2).optInt(UpdateKey.STATUS) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                booleanRef.element = z;
            }
            BlockitView blockitView = this.f69527a;
            OPMonitorCode oPMonitorCode = C27702b.f69238i;
            Intrinsics.checkExpressionValueIsNotNull(oPMonitorCode, "AppCenterMonitorCode.WORKPLACE_BLOCK_RENDER_FAIL");
            blockitView.mo99215a(oPMonitorCode).addCategoryValue("timeout", false).setErrorCode(str).setErrorMessage(str2).setResultTypeFail().flush();
            UICallbackExecutor.execute(new RunnableC27813c(this, booleanRef));
        }

        @Override // com.larksuite.component.blockit.AbstractC24073e
        /* renamed from: a */
        public void mo86338a(String str, String str2) {
            BlockitView blockitView = this.f69527a;
            OPMonitorCode oPMonitorCode = C27702b.f69238i;
            Intrinsics.checkExpressionValueIsNotNull(oPMonitorCode, "AppCenterMonitorCode.WORKPLACE_BLOCK_RENDER_FAIL");
            blockitView.mo99215a(oPMonitorCode).addCategoryValue("timeout", false).setErrorCode(str).setErrorMessage(str2).setResultTypeFail().flush();
            UICallbackExecutor.execute(new RunnableC27815e(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.BlockitView$c */
    static final class RunnableC27806c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BlockitView f69521a;

        RunnableC27806c(BlockitView blockitView) {
            this.f69521a = blockitView;
        }

        public final void run() {
            this.f69521a.mo99236e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.BlockitView$i */
    static final class RunnableC27817i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BlockitView f69536a;

        RunnableC27817i(BlockitView blockitView) {
            this.f69536a = blockitView;
        }

        public final void run() {
            this.f69536a.mo99236e();
        }
    }

    /* renamed from: l */
    private final boolean m101635l() {
        if (this.f69493W || !this.ab) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.appcenter.business.tab.business.blockit.part.BlockitSlot.IContentTapListener
    /* renamed from: g */
    public void mo99238g() {
        C27710b.m101265a(this.f69477G, this.f69479I, this.f69478H, this.f69475E, this.f69493W, this.aa);
    }

    /* renamed from: e */
    public final void mo99236e() {
        CommonHeader commonHeader;
        if (this.f69486P) {
            commonHeader = this.f69490T;
        } else {
            commonHeader = this.f69489S;
        }
        if (commonHeader != null) {
            commonHeader.mo99949a(this.f69491U.mo99500b(), new View$OnClickListenerC27818j(this));
        }
    }

    public final int getHeaderHeight() {
        CommonHeader commonHeader;
        if (this.f69486P) {
            commonHeader = this.f69490T;
        } else {
            commonHeader = this.f69489S;
        }
        if (commonHeader == null || commonHeader.getVisibility() != 0) {
            return 0;
        }
        return CommonHeader.m102627a(this.f69486P);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.BlockitView$f */
    static final class RunnableC27809f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BlockitView f69526a;

        RunnableC27809f(BlockitView blockitView) {
            this.f69526a = blockitView;
        }

        public final void run() {
            AbstractC27836c cVar;
            if (this.f69526a.getBlockMenuEntity().mo99500b() && (cVar = this.f69526a.f69497d) != null) {
                cVar.open();
            }
            long currentTimeMillis = System.currentTimeMillis();
            BlockitView.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 3, this.f69526a.f69495b, this.f69526a.f69496c, 0));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.BlockitView$h */
    public static final class RunnableC27816h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BlockitView f69534a;

        /* renamed from: b */
        final /* synthetic */ boolean f69535b;

        RunnableC27816h(BlockitView blockitView, boolean z) {
            this.f69534a = blockitView;
            this.f69535b = z;
        }

        public final void run() {
            if (this.f69535b) {
                BlockitSlot blockitSlot = (BlockitSlot) this.f69534a.mo99226b(R.id.blockit_mount_slot);
                Intrinsics.checkExpressionValueIsNotNull(blockitSlot, "blockit_mount_slot");
                blockitSlot.setBackground(null);
                return;
            }
            ((BlockitSlot) this.f69534a.mo99226b(R.id.blockit_mount_slot)).setBackgroundResource(R.drawable.workplace_widget_white_bg);
        }
    }

    /* renamed from: h */
    public final boolean mo99259h() {
        boolean z;
        boolean z2;
        CommonHeader.C28077b bVar = this.f69488R;
        if (bVar != null) {
            z = bVar.f70287b;
        } else {
            z = false;
        }
        if (!z) {
            CommonHeader.C28077b bVar2 = this.f69487Q;
            if (bVar2 != null) {
                z2 = bVar2.f70287b;
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
        }
        if (((BlockitStatusView) mo99226b(R.id.blockit_status_view)).mo99324a() == BlockitStatusView.Status.Content) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo99233d() {
        this.f69485O = true;
        if (((BlockitStatusView) mo99226b(R.id.blockit_status_view)).mo99324a() != BlockitStatusView.Status.Error) {
            long currentTimeMillis = System.currentTimeMillis() - this.f69502i;
            m101633d("showError>>>");
            ((BlockitStatusView) mo99226b(R.id.blockit_status_view)).mo99325a(BlockitStatusView.Status.Error);
            OPMonitorCode oPMonitorCode = C27702b.f69241l;
            Intrinsics.checkExpressionValueIsNotNull(oPMonitorCode, "AppCenterMonitorCode.WORKPLACE_BLOCK_SHOW_FAIL");
            mo99215a(oPMonitorCode).addCategoryValue("duration", Long.valueOf(currentTimeMillis)).setResultTypeFail().flush();
            C28082d.m102671g().mo99977c(this.f69475E, this.f69478H);
        }
    }

    @Override // com.ss.android.appcenter.business.tab.business.blockit.api.BlockitApiPlugin.BlockitApiHandler
    /* renamed from: i */
    public JSONObject mo99260i() {
        int i;
        JSONObject jSONObject = new JSONObject();
        if (m101635l()) {
            jSONObject.put("height", "auto");
        } else {
            Integer num = this.f69509q;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            jSONObject.put("height", C28209p.m103292a(i));
        }
        jSONObject.put("width", C28209p.m103292a(getWidth()));
        mo99223a("getContainerRect>>> resule:" + jSONObject);
        return jSONObject;
    }

    /* renamed from: j */
    public final void mo99261j() {
        CommonHeader commonHeader;
        int i;
        this.f69491U.f69762c.clear();
        if (this.f69486P) {
            commonHeader = this.f69490T;
        } else {
            commonHeader = this.f69489S;
        }
        if (commonHeader == null || commonHeader.getVisibility() != 0) {
            i = 0;
        } else {
            i = CommonHeader.m102627a(this.f69486P);
            commonHeader.setVisibility(8);
        }
        if (!m101635l()) {
            BlockitStatusView blockitStatusView = (BlockitStatusView) mo99226b(R.id.blockit_status_view);
            Integer num = this.f69508p;
            if (num == null) {
                Intrinsics.throwNpe();
            }
            C28209p.m103299a(blockitStatusView, num.intValue());
        } else {
            BlockitStatusView blockitStatusView2 = (BlockitStatusView) mo99226b(R.id.blockit_status_view);
            Intrinsics.checkExpressionValueIsNotNull(blockitStatusView2, "blockit_status_view");
            C28209p.m103299a((BlockitStatusView) mo99226b(R.id.blockit_status_view), blockitStatusView2.getHeight() + i);
        }
        ((BlockitStatusView) mo99226b(R.id.blockit_status_view)).mo99325a(BlockitStatusView.Status.Loading);
        m101627a(OPContainerLifecycleEventEnum.ON_DESTROY);
        this.f69498e = false;
        m101629a(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d0  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m101634k() {
        /*
        // Method dump skipped, instructions count: 219
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.appcenter.business.tab.business.blockit.BlockitView.m101634k():void");
    }

    /* renamed from: c */
    public final void mo99230c() {
        long j;
        if (((BlockitStatusView) mo99226b(R.id.blockit_status_view)).mo99324a() != BlockitStatusView.Status.Content) {
            long currentTimeMillis = System.currentTimeMillis() - this.f69502i;
            mo99223a("showContent>>>");
            m101634k();
            m101632b(this.f69500g);
            if (m101635l()) {
                C28209p.m103299a(this, -2);
                C28209p.m103299a((BlockitStatusView) mo99226b(R.id.blockit_status_view), -2);
                C28209p.m103299a((BlockitSlot) mo99226b(R.id.blockit_mount_slot), -2);
            }
            ((BlockitStatusView) mo99226b(R.id.blockit_status_view)).mo99325a(BlockitStatusView.Status.Content);
            OPMonitorCode oPMonitorCode = C27702b.f69240k;
            Intrinsics.checkExpressionValueIsNotNull(oPMonitorCode, "AppCenterMonitorCode.WORKPLACE_BLOCK_SHOW_CONTENT");
            mo99215a(oPMonitorCode).addCategoryValue("duration", Long.valueOf(currentTimeMillis)).addCategoryValue("use_start_loading", Boolean.valueOf(this.f69501h)).setResultTypeSuccess().flush();
            if (!this.f69485O) {
                if (this.f69501h) {
                    j = currentTimeMillis - this.f69503j;
                } else {
                    j = 0;
                }
                OPMonitorCode oPMonitorCode2 = C27702b.f69225V;
                Intrinsics.checkExpressionValueIsNotNull(oPMonitorCode2, "AppCenterMonitorCode.WORKPLACE_BLOCK_STARTUP");
                mo99215a(oPMonitorCode2).addCategoryValue("on_loaded", Long.valueOf(this.f69503j)).addCategoryValue("on_content_loaded", Long.valueOf(j)).setResultTypeSuccess().flush();
            }
            C28082d.m102671g().mo99975b(this.f69475E, this.f69478H);
        }
    }

    /* renamed from: b */
    public final void mo99227b() {
        AbstractC24361a aVar;
        IAppContext d;
        mo99223a("initHostConsole>>>");
        AbstractC67729a a = C27952c.m102076a().mo99660a(this.f69478H).mo99663a();
        this.f69505m = a;
        if (!(a == null || (aVar = this.f69510r) == null || (d = aVar.mo87113d()) == null)) {
            d.registerService(AbstractC67729a.class, this.f69505m);
        }
        this.f69491U.f69766g = C27924d.m101945a(this.f69492V, this.f69478H);
    }

    public final void setAppId(String str) {
        this.f69477G = str;
    }

    public final void setAppName(String str) {
        this.f69475E = str;
    }

    public final void setAutoMode(boolean z) {
        this.ab = z;
    }

    public final void setBlkId(String str) {
        this.f69478H = str;
    }

    public final void setBlkTypeId(String str) {
        this.f69479I = str;
    }

    public final void setBlockLogger(AbstractC67729a aVar) {
        this.f69505m = aVar;
    }

    public final void setCreatedBlock(boolean z) {
        this.f69481K = z;
    }

    public final void setDemoMode(boolean z) {
        this.f69504l = z;
    }

    public final void setForceUpdate(boolean z) {
        this.f69512t = z;
    }

    public final void setFragment(Fragment fragment) {
        this.f69492V = fragment;
    }

    public final void setInited(boolean z) {
        this.f69474D = z;
    }

    public final void setMenuListener(AbstractC27836c cVar) {
        this.f69497d = cVar;
    }

    public final void setOldHost(boolean z) {
        this.aa = z;
    }

    public final void setOpAppContainer(AbstractC24361a aVar) {
        this.f69510r = aVar;
    }

    public final void setRoundCorner(float f) {
        this.f69515w = f;
    }

    public final void setSourceData(String str) {
        this.f69480J = str;
    }

    public final void setStandardMode(boolean z) {
        this.f69493W = z;
    }

    public final void setTemplateConfig(JsonObject jsonObject) {
        this.f69513u = jsonObject;
    }

    public final void setTitleInside(boolean z) {
        this.f69486P = z;
    }

    public final void setTypedDataCollection(JsonObject jsonObject) {
        this.f69514v = jsonObject;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.BlockitView$b */
    static final class View$OnClickListenerC27805b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BlockitView f69519a;

        /* renamed from: b */
        final /* synthetic */ C27923c f69520b;

        View$OnClickListenerC27805b(BlockitView blockitView, C27923c cVar) {
            this.f69519a = blockitView;
            this.f69520b = cVar;
        }

        public final void onClick(View view) {
            this.f69519a.mo99231c(this.f69520b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.BlockitView$d */
    public static final class View$OnClickListenerC27807d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BlockitView f69522a;

        /* renamed from: b */
        final /* synthetic */ C27923c f69523b;

        View$OnClickListenerC27807d(BlockitView blockitView, C27923c cVar) {
            this.f69522a = blockitView;
            this.f69523b = cVar;
        }

        public final void onClick(View view) {
            this.f69522a.mo99231c(this.f69523b);
        }
    }

    public final void setBlockMenuEntity(C27906b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "<set-?>");
        this.f69491U = bVar;
    }

    public final void setTemplateId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f69511s = str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.BlockitView$j */
    public static final class View$OnClickListenerC27818j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BlockitView f69537a;

        View$OnClickListenerC27818j(BlockitView blockitView) {
            this.f69537a = blockitView;
        }

        public final void onClick(View view) {
            AbstractC27836c cVar = this.f69537a.f69497d;
            if (cVar != null) {
                cVar.open();
            }
        }
    }

    /* renamed from: a */
    public final void mo99216a(int i) {
        this.f69508p = Integer.valueOf(i);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.BlockitView$e */
    public static final class View$OnClickListenerC27808e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BlockitView f69524a;

        /* renamed from: b */
        final /* synthetic */ C27923c f69525b;

        View$OnClickListenerC27808e(BlockitView blockitView, C27923c cVar) {
            this.f69524a = blockitView;
            this.f69525b = cVar;
        }

        public final void onClick(View view) {
            C27548m m = C27548m.m100547m();
            Intrinsics.checkExpressionValueIsNotNull(m, "Providers.getInstance()");
            m.mo98222f().mo98206c(this.f69524a.getContext(), this.f69525b.f69821d);
        }
    }

    /* renamed from: a */
    public final void mo99219a(Lifecycle lifecycle) {
        if (lifecycle != null) {
            lifecycle.addObserver(this);
        }
    }

    @Override // com.ss.android.appcenter.business.tab.business.blockit.api.BlockitApiPlugin.BlockitApiHandler
    /* renamed from: b */
    public void mo99228b(String str) {
        Intrinsics.checkParameterIsNotNull(str, HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        OPMonitorCode oPMonitorCode = C27702b.f69242m;
        Intrinsics.checkExpressionValueIsNotNull(oPMonitorCode, "AppCenterMonitorCode.WORKPLACE_BLOCK_INVOKE_API");
        mo99215a(oPMonitorCode).addCategoryValue("api_type", str).flush();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        canvas.clipPath(this.f69516x);
        canvas.save();
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* renamed from: b */
    private final void m101632b(boolean z) {
        Drawable drawable;
        if (z) {
            drawable = C28209p.m103296a(getContext(), (int) this.f69515w, (int) R.color.bg_float, this.f69484N);
        } else {
            drawable = null;
        }
        setBackground(drawable);
        if (this.f69484N) {
            setPadding(1, 1, 1, 1);
        } else {
            setPadding(0, 0, 0, 0);
        }
    }

    /* renamed from: d */
    private final void m101633d(String str) {
        String str2 = this.f69506n;
        C28184h.m103248b(str2, "name:" + this.f69475E + ". appId=" + this.f69477G + ". blkTypeId=" + this.f69479I + ". blkId=" + this.f69478H + " msg:" + str);
    }

    /* renamed from: c */
    public final void mo99231c(C27923c cVar) {
        if (cVar != null) {
            JSONObject c = cVar.mo99552c();
            mo99223a("onButtonSlotClick>>> menu clicked:" + c);
            AbstractC24361a aVar = this.f69510r;
            if (aVar != null) {
                aVar.mo87110a("onMenuItemTap", c);
            }
        }
    }

    /* renamed from: a */
    private final void m101627a(OPContainerLifecycleEventEnum oPContainerLifecycleEventEnum) {
        if (this.f69498e) {
            try {
                mo99223a("trigger LifeCycle Event:" + oPContainerLifecycleEventEnum + ",view@" + hashCode());
                AbstractC24361a aVar = this.f69510r;
                if (aVar != null) {
                    aVar.mo87108a(oPContainerLifecycleEventEnum, new Object[0]);
                }
            } catch (Exception e) {
                m101633d("trigger LifeCycle Event Error:" + oPContainerLifecycleEventEnum + ",exception:" + e);
            }
        }
    }

    /* renamed from: b */
    private final void m101631b(List<? extends C27923c> list) {
        ArrayList arrayList = new ArrayList();
        for (C27923c cVar : list) {
            if (cVar.mo99551b(getContext())) {
                cVar.f69823f = new View$OnClickListenerC27807d(this, cVar);
                arrayList.add(cVar);
            } else {
                m101633d("invalid menuItem:" + cVar);
            }
        }
        this.f69491U.f69762c = arrayList;
    }

    @Override // com.ss.android.appcenter.business.tab.business.blockit.api.BlockitApiPlugin.BlockitApiHandler
    /* renamed from: c */
    public boolean mo99232c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        for (C27923c cVar : this.f69491U.f69762c) {
            if (TextUtils.equals(str, cVar.f69818a)) {
                this.f69491U.f69762c.remove(cVar);
                UICallbackExecutor.post(new RunnableC27817i(this));
                return true;
            }
        }
        return false;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (!(action == 3 || action == 4)) {
                        removeCallbacks(this.f69473C);
                    }
                } else if (!this.f69518z && (Math.abs(this.f69495b - x) > ((float) this.f69472B) || Math.abs(this.f69496c - y) > ((float) this.f69472B))) {
                    this.f69518z = true;
                    removeCallbacks(this.f69473C);
                }
            }
            removeCallbacks(this.f69473C);
            if (this.f69471A) {
                motionEvent.setAction(3);
                super.dispatchTouchEvent(motionEvent);
                return true;
            }
        } else {
            this.f69518z = false;
            this.f69471A = false;
            this.f69495b = x;
            this.f69496c = y;
            postDelayed(this.f69473C, (long) ViewConfiguration.getLongPressTimeout());
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent.getAction() != 0 || dispatchTouchEvent) {
            return dispatchTouchEvent;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockitView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        Intrinsics.checkExpressionValueIsNotNull(viewConfiguration, "ViewConfiguration.get(context)");
        this.f69472B = viewConfiguration.getScaledTouchSlop();
        this.f69473C = new RunnableC27809f(this);
        this.f69486P = true;
        this.f69491U = new C27906b();
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(R.layout.workplace_blockit_view, (ViewGroup) this, true);
        ((BlockitSlot) mo99226b(R.id.blockit_mount_slot)).mo99317a(this);
        ((BlockitSlot) mo99226b(R.id.blockit_mount_slot)).setContentTapListener(this);
        ((BlockitStatusView) mo99226b(R.id.blockit_status_view)).setStatusClickListener(this);
    }

    /* renamed from: a */
    private final void m101628a(List<? extends C27923c> list) {
        ArrayList arrayList = new ArrayList();
        for (C27923c cVar : list) {
            if (cVar.mo99550a(getContext())) {
                cVar.f69823f = new View$OnClickListenerC27808e(this, cVar);
                arrayList.add(cVar);
            } else {
                m101633d("invalid menuitem:" + cVar);
            }
        }
        this.f69491U.f69763d = arrayList;
    }

    /* renamed from: a */
    private final void m101629a(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        String str2 = this.f69477G;
        boolean z5 = false;
        if (str2 == null || str2.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            String str3 = this.f69478H;
            if (str3 == null || str3.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                String str4 = this.f69479I;
                if (str4 == null || str4.length() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4 && !this.f69498e && !this.f69499f) {
                    AbstractC24361a aVar = this.f69510r;
                    if (aVar != null) {
                        aVar.mo87112c();
                    }
                    this.f69499f = true;
                    BlockEntity blockEntity = new BlockEntity(this.f69478H);
                    blockEntity.setAppID(this.f69477G);
                    blockEntity.setBlockTypeID(this.f69479I);
                    blockEntity.setSourceData(this.f69480J);
                    Bundle bundle = new Bundle();
                    bundle.putString(C24377a.f60162g, C27833c.f69562a);
                    String str5 = this.f69483M;
                    if (str5 == null || str5.length() == 0) {
                        z5 = true;
                    }
                    if (!z5) {
                        bundle.putString("preview_token", this.f69483M);
                    }
                    if (z) {
                        str = "force_update";
                    } else {
                        str = "default";
                    }
                    bundle.putString("block_launch_type", str);
                    OPContainerBundle oPContainerBundle = new OPContainerBundle(bundle, getContext());
                    if (this.f69504l) {
                        oPContainerBundle.mo87149a("_openDemoBlock", OPContainerBundle.API_TYPE.INVOKE);
                    }
                    oPContainerBundle.mo87150a("workplace", this.f69511s);
                    JsonObject jsonObject = this.f69514v;
                    if (jsonObject != null) {
                        oPContainerBundle.mo87145a(jsonObject);
                    }
                    m101632b(true);
                    ((BlockitStatusView) mo99226b(R.id.blockit_status_view)).mo99325a(BlockitStatusView.Status.Loading);
                    mo99223a("mountBlockit>>> ");
                    this.f69502i = System.currentTimeMillis();
                    C27810g gVar = new C27810g(this);
                    if (this.f69481K) {
                        BlockitSlot blockitSlot = (BlockitSlot) mo99226b(R.id.blockit_mount_slot);
                        String str6 = this.f69477G;
                        if (str6 == null) {
                            Intrinsics.throwNpe();
                        }
                        String str7 = this.f69478H;
                        if (str7 == null) {
                            Intrinsics.throwNpe();
                        }
                        C24046a.m87862a(blockitSlot, str6, str7, oPContainerBundle, gVar);
                    } else {
                        C24046a.m87861a((BlockitSlot) mo99226b(R.id.blockit_mount_slot), blockEntity, oPContainerBundle, gVar);
                    }
                    OPMonitorCode oPMonitorCode = C27702b.f69239j;
                    Intrinsics.checkExpressionValueIsNotNull(oPMonitorCode, "AppCenterMonitorCode.WORKPLACE_BLOCK_START_MOUNT");
                    mo99215a(oPMonitorCode).addCategoryValue("forceUpdate", Boolean.valueOf(z)).setResultTypeSuccess().flush();
                    C27710b.m101277b(this.f69477G, this.f69479I, this.f69478H, this.f69475E, this.f69493W, this.aa);
                }
            }
        }
    }

    /* renamed from: a */
    public final OPMonitor mo99215a(OPMonitorCode oPMonitorCode) {
        OPTrace oPTrace;
        IAppContext d;
        OPMonitor monitorCode = C27700a.m101232a("op_workplace_event").setMonitorCode(oPMonitorCode);
        String str = this.f69475E;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        OPMonitor addCategoryValue = monitorCode.addCategoryValue("app_name", str);
        String str3 = this.f69477G;
        if (str3 == null) {
            str3 = str2;
        }
        OPMonitor addCategoryValue2 = addCategoryValue.addCategoryValue("app_id", str3);
        String str4 = this.f69479I;
        if (str4 == null) {
            str4 = str2;
        }
        OPMonitor addCategoryValue3 = addCategoryValue2.addCategoryValue("block_type_id", str4);
        String str5 = this.f69478H;
        if (str5 != null) {
            str2 = str5;
        }
        OPMonitor addCategoryValue4 = addCategoryValue3.addCategoryValue("block_id", str2);
        AbstractC24361a aVar = this.f69510r;
        if (aVar == null || (d = aVar.mo87113d()) == null) {
            oPTrace = null;
        } else {
            oPTrace = d.getTracingSpan();
        }
        OPMonitor tracing = addCategoryValue4.tracing(oPTrace);
        Intrinsics.checkExpressionValueIsNotNull(tracing, "AppCenterMonitor.build(A….appContext?.tracingSpan)");
        return tracing;
    }

    @Override // com.ss.android.appcenter.business.tab.business.blockit.api.BlockitApiPlugin.BlockitApiHandler
    /* renamed from: b */
    public boolean mo99229b(C27923c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "menuItem");
        for (C27923c cVar2 : this.f69491U.f69762c) {
            if (TextUtils.equals(cVar.f69818a, cVar2.f69818a)) {
                return false;
            }
        }
        cVar.f69823f = new View$OnClickListenerC27805b(this, cVar);
        this.f69491U.f69762c.add(cVar);
        UICallbackExecutor.post(new RunnableC27806c(this));
        return true;
    }

    @Override // com.ss.android.appcenter.business.tab.business.blockit.part.BlockitStatusView.IStatusViewClickListener
    /* renamed from: a */
    public void mo99218a(View view, BlockitStatusView.Status status) {
        Intrinsics.checkParameterIsNotNull(view, "v");
        Intrinsics.checkParameterIsNotNull(status, UpdateKey.STATUS);
        int i = C27834b.f69570a[status.ordinal()];
        if (i == 1) {
            this.f69498e = false;
            m101629a(false);
        } else if (i == 2) {
            C27548m m = C27548m.m100547m();
            Intrinsics.checkExpressionValueIsNotNull(m, "Providers.getInstance()");
            m.mo98216a().mo98154a(getContext());
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f69516x.reset();
        this.f69517y.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getMeasuredWidth(), (float) getMeasuredHeight());
        float f = this.f69515w;
        this.f69516x.addRoundRect(this.f69517y, f, f, Path.Direction.CCW);
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(event, "event");
        int i = C27834b.f69571b[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                m101627a(OPContainerLifecycleEventEnum.ON_HIDE);
            } else if (i == 3) {
                m101627a(OPContainerLifecycleEventEnum.ON_STOP);
            } else if (i == 4) {
                m101627a(OPContainerLifecycleEventEnum.ON_DESTROY);
            }
        } else if (!(lifecycleOwner instanceof Fragment)) {
            m101627a(OPContainerLifecycleEventEnum.ON_SHOW);
        } else if (((Fragment) lifecycleOwner).getUserVisibleHint()) {
            m101627a(OPContainerLifecycleEventEnum.ON_SHOW);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockitView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        Intrinsics.checkExpressionValueIsNotNull(viewConfiguration, "ViewConfiguration.get(context)");
        this.f69472B = viewConfiguration.getScaledTouchSlop();
        this.f69473C = new RunnableC27809f(this);
        this.f69486P = true;
        this.f69491U = new C27906b();
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(R.layout.workplace_blockit_view, (ViewGroup) this, true);
        ((BlockitSlot) mo99226b(R.id.blockit_mount_slot)).mo99317a(this);
        ((BlockitSlot) mo99226b(R.id.blockit_mount_slot)).setContentTapListener(this);
        ((BlockitStatusView) mo99226b(R.id.blockit_status_view)).setStatusClickListener(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockitView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        Intrinsics.checkExpressionValueIsNotNull(viewConfiguration, "ViewConfiguration.get(context)");
        this.f69472B = viewConfiguration.getScaledTouchSlop();
        this.f69473C = new RunnableC27809f(this);
        this.f69486P = true;
        this.f69491U = new C27906b();
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(R.layout.workplace_blockit_view, (ViewGroup) this, true);
        ((BlockitSlot) mo99226b(R.id.blockit_mount_slot)).mo99317a(this);
        ((BlockitSlot) mo99226b(R.id.blockit_mount_slot)).setContentTapListener(this);
        ((BlockitStatusView) mo99226b(R.id.blockit_status_view)).setStatusClickListener(this);
    }

    @Override // com.ss.android.appcenter.business.tab.business.blockit.part.BlockitSlot.IBlockitSlotSizeChangedListener
    /* renamed from: a */
    public void mo99217a(int i, int i2, int i3, int i4) {
        if (!m101635l()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("height", C28209p.m103292a(i2));
            jSONObject.put("width", C28209p.m103292a(i));
            mo99223a("onContainerResize>>> resule:" + jSONObject);
            AbstractC24361a aVar = this.f69510r;
            if (aVar != null) {
                aVar.mo87110a("onContainerResize", jSONObject);
                return;
            }
            return;
        }
        int headerHeight = i2 + getHeaderHeight();
        UserSP instance = UserSP.getInstance();
        instance.putInt("block_auto_height_" + this.f69478H, headerHeight);
    }
}
