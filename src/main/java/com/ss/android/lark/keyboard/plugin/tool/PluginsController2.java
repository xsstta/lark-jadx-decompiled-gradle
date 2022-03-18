package com.ss.android.lark.keyboard.plugin.tool;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.framework.utils.ak;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.keyboard.IKeyBoard;
import com.ss.android.lark.keyboard.IKeyBoardDependency;
import com.ss.android.lark.keyboard.IKeyBoardStartedCallback;
import com.ss.android.lark.keyboard.IKeyBoardStatusListener;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.KeyboardScene;
import com.ss.android.lark.keyboard.base.KeyBoardObserveFrameLayout;
import com.ss.android.lark.keyboard.base.NestScrollFrameLayout;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.IOutInputSupport;
import com.ss.android.lark.keyboard.plugin.input.InputPluginController;
import com.ss.android.lark.keyboard.plugin.input.TransationData;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.plugingroup.IKeyBoardPluginGroup;
import com.ss.android.lark.keyboard.widget.IPluginLayoutManager;
import com.ss.android.lark.keyboard.widget.KBPluginContainerView;
import com.ss.android.lark.keyboard.widget.SysKeyBoardObserveFrameLayout;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.C69043h;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.C69113a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000´\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 â\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0006â\u0001ã\u0001ä\u0001B]\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\f\u0012\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\r0\f\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0010\u0010K\u001a\u00020C2\u0006\u0010L\u001a\u00020\u0013H\u0002J\u0010\u0010M\u001a\u00020C2\u0006\u0010N\u001a\u00020OH\u0016J\u0018\u0010P\u001a\u00020C2\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020SH\u0016J \u0010P\u001a\u00020C2\u000e\u0010T\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110U2\u0006\u0010R\u001a\u00020SH\u0016J1\u0010V\u001a\u00020C2\"\u0010W\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0U0X\"\n\u0012\u0006\b\u0001\u0012\u00020\u000e0UH\u0016¢\u0006\u0002\u0010YJ\b\u0010Z\u001a\u00020CH\u0016J\u0010\u0010[\u001a\u00020\b2\u0006\u0010\\\u001a\u00020]H\u0002J\u0010\u0010^\u001a\u00020C2\u0006\u0010_\u001a\u00020\u000eH\u0002J\u0010\u0010`\u001a\u00020C2\u0006\u0010_\u001a\u00020\u000eH\u0016J\b\u0010a\u001a\u00020CH\u0016J\u001e\u0010b\u001a\u00020C2\u0006\u0010c\u001a\u00020\u000f2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020C0BH\u0002J\b\u0010e\u001a\u00020CH\u0002J\u0010\u0010f\u001a\u00020C2\u0006\u0010g\u001a\u00020hH\u0002J\u001c\u0010i\u001a\u00020C2\u0012\u0010j\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u0002070\rH\u0002J\b\u0010k\u001a\u00020\u0006H\u0016J\b\u0010l\u001a\u00020mH\u0016J\n\u0010n\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010o\u001a\u00020\u001bH\u0002J\b\u0010p\u001a\u00020\u001bH\u0016J!\u0010q\u001a\u0004\u0018\u0001Hr\"\b\b\u0000\u0010r*\u00020\u00112\u0006\u0010Q\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010sJ\b\u0010t\u001a\u00020\u001bH\u0016J\b\u0010u\u001a\u00020mH\u0016J\u0014\u0010v\u001a\u00020\u001b2\n\b\u0002\u0010w\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010x\u001a\u00020\u001bH\u0016J\u0012\u0010y\u001a\u0004\u0018\u0001072\u0006\u0010_\u001a\u00020\u000eH\u0002J\b\u0010z\u001a\u00020\u000fH\u0016J!\u0010{\u001a\u0004\u0018\u0001Hr\"\b\b\u0000\u0010r*\u00020\u000e2\u0006\u0010Q\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010|J\b\u0010}\u001a\u00020\u000fH\u0016J\b\u0010~\u001a\u00020=H\u0016J\b\u0010\u001a\u00020\u001bH\u0002J\t\u0010\u0001\u001a\u00020\u001bH\u0016J\u001c\u0010\u0001\u001a\u00020C2\u0006\u0010_\u001a\u00020\u000e2\t\b\u0002\u0010\u0001\u001a\u00020\u0013H\u0002J\t\u0010\u0001\u001a\u00020CH\u0002J\t\u0010\u0001\u001a\u00020\u0013H\u0016J\t\u0010\u0001\u001a\u00020CH\u0016J\t\u0010\u0001\u001a\u00020CH\u0016J\u0011\u0010\u0001\u001a\u00020C2\u0006\u0010g\u001a\u00020hH\u0002J\t\u0010\u0001\u001a\u00020CH\u0016J\u0017\u0010\u0001\u001a\u00020C2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020C0BH\u0016J\t\u0010\u0001\u001a\u00020CH\u0016J\t\u0010\u0001\u001a\u00020CH\u0002J\u0011\u0010\u0001\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\t\u0010\u0001\u001a\u00020\u0013H\u0016J\t\u0010\u0001\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\t\u0010\u0001\u001a\u00020\u0013H\u0016J\t\u0010\u0001\u001a\u00020\u0013H\u0016J\u0012\u0010\u0001\u001a\u00020C2\u0007\u0010\u0001\u001a\u00020\u0013H\u0002J\u001d\u0010\u0001\u001a\u00020C2\u0007\u0010\u0001\u001a\u00020\u00132\t\b\u0002\u0010\u0001\u001a\u00020\u001bH\u0002J\u0018\u0010\u0001\u001a\u00020C2\u0007\u0010\u0001\u001a\u00020\u0013H\u0000¢\u0006\u0003\b\u0001J\t\u0010\u0001\u001a\u00020CH\u0016J'\u0010\u0001\u001a\u00020\u00132\u0007\u0010\u0001\u001a\u00020\u001b2\u0007\u0010\u0001\u001a\u00020\u001b2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\t\u0010\u0001\u001a\u00020\u0013H\u0016J\t\u0010 \u0001\u001a\u00020CH\u0016J\t\u0010¡\u0001\u001a\u00020CH\u0016J\u0012\u0010¢\u0001\u001a\u00020C2\u0007\u0010£\u0001\u001a\u00020\u001bH\u0016J\t\u0010¤\u0001\u001a\u00020CH\u0016J\u0013\u0010¥\u0001\u001a\u00020C2\b\u0010¦\u0001\u001a\u00030§\u0001H\u0016J\u0019\u0010¨\u0001\u001a\u00020C2\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010T\u001a\u00020\u0011H\u0016J\u0019\u0010©\u0001\u001a\u00020C2\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010_\u001a\u00020\u000eH\u0016J\u0014\u0010ª\u0001\u001a\u00020C2\t\b\u0002\u0010«\u0001\u001a\u00020\u0013H\u0002J\u0012\u0010¬\u0001\u001a\u00020C2\u0007\u0010­\u0001\u001a\u00020\u000fH\u0016J\u0011\u0010®\u0001\u001a\u00020C2\u0006\u0010_\u001a\u00020\u000eH\u0002J\u0011\u0010¯\u0001\u001a\u00020C2\u0006\u0010_\u001a\u00020\u000eH\u0016J\u0011\u0010°\u0001\u001a\u00020C2\u0006\u0010_\u001a\u00020\u000eH\u0016J5\u0010±\u0001\u001a\u00020C2\n\u0010²\u0001\u001a\u0005\u0018\u00010³\u00012\t\u0010´\u0001\u001a\u0004\u0018\u00010\u000f2\n\u0010µ\u0001\u001a\u0005\u0018\u00010³\u00012\u0007\u0010¶\u0001\u001a\u00020\u0013H\u0016J\u0013\u0010·\u0001\u001a\u00020C2\b\u0010¸\u0001\u001a\u00030¹\u0001H\u0016J\u0012\u0010º\u0001\u001a\u00020C2\u0007\u0010»\u0001\u001a\u000207H\u0002J\u0012\u0010¼\u0001\u001a\u00020C2\u0007\u0010½\u0001\u001a\u00020\u0013H\u0016J\u0012\u0010¾\u0001\u001a\u00020C2\u0007\u0010¿\u0001\u001a\u000202H\u0016J\u0012\u0010À\u0001\u001a\u00020C2\u0007\u0010¦\u0001\u001a\u00020!H\u0016J\u0012\u0010Á\u0001\u001a\u00020C2\u0007\u0010Â\u0001\u001a\u00020\u0013H\u0016J\u001b\u0010Á\u0001\u001a\u00020C2\u0007\u0010­\u0001\u001a\u00020\u000f2\u0007\u0010Â\u0001\u001a\u00020\u0013H\u0016J#\u0010Á\u0001\u001a\u00020C2\u000f\u0010Ã\u0001\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0U2\u0007\u0010Â\u0001\u001a\u00020\u0013H\u0016J\u0013\u0010Ä\u0001\u001a\u00020C2\b\u0010Å\u0001\u001a\u00030Æ\u0001H\u0016J\u001b\u0010Ç\u0001\u001a\u00020C2\u0007\u0010­\u0001\u001a\u00020\u000f2\u0007\u0010È\u0001\u001a\u00020\u0013H\u0016J#\u0010Ç\u0001\u001a\u00020C2\u000f\u0010Ã\u0001\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0U2\u0007\u0010É\u0001\u001a\u00020\u0013H\u0016J\u0012\u0010Ê\u0001\u001a\u00020C2\u0007\u0010Ë\u0001\u001a\u00020=H\u0016J\u0014\u0010Ì\u0001\u001a\u00020C2\t\b\u0001\u0010Í\u0001\u001a\u00020\u001bH\u0016J\t\u0010Î\u0001\u001a\u00020CH\u0016J\t\u0010Ï\u0001\u001a\u00020CH\u0016J\u0017\u0010Ð\u0001\u001a\u00020C2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020C0BH\u0016J\t\u0010Ñ\u0001\u001a\u00020CH\u0016J(\u0010Ò\u0001\u001a\u00020C2\u001d\u0010Ó\u0001\u001a\u0018\u0012\r\u0012\u000b\u0012\u0006\b\u0001\u0012\u00020\u000e0Õ\u0001\u0012\u0004\u0012\u00020\u001b0Ô\u0001H\u0016J\t\u0010Ö\u0001\u001a\u00020CH\u0016J\u0013\u0010Ö\u0001\u001a\u00020C2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J%\u0010×\u0001\u001a\u00020C2\u000f\u0010Ø\u0001\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110U2\t\u0010Ù\u0001\u001a\u0004\u0018\u00010SH\u0016J\t\u0010Ú\u0001\u001a\u00020CH\u0016J\u0011\u0010Û\u0001\u001a\u00020C2\u0006\u0010_\u001a\u00020\u000eH\u0002J\u0013\u0010Ü\u0001\u001a\u00020C2\b\u0010¦\u0001\u001a\u00030§\u0001H\u0016J\u0014\u0010Ý\u0001\u001a\u00020C2\t\b\u0002\u0010Þ\u0001\u001a\u00020\u0013H\u0002J\t\u0010ß\u0001\u001a\u00020CH\u0016J\u0018\u0010à\u0001\u001a\u00020\u0013*\u00020#2\t\u0010á\u0001\u001a\u0004\u0018\u000107H\u0002R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0004¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\r0\fX\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000e0(X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020-0(X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0/X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020=X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000e0/X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u0004\u0018\u00010@X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020C0BX\u000e¢\u0006\u0002\n\u0000R.\u0010F\u001a\u0004\u0018\u000107*\u0004\u0018\u00010\u000e2\b\u0010E\u001a\u0004\u0018\u0001078B@BX\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006å\u0001"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/PluginsController2;", "Lcom/ss/android/lark/keyboard/base/KeyBoardObserveFrameLayout$IOnKeyBoardListener;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lcom/ss/android/lark/keyboard/IKeyBoard;", "mActivity", "Landroid/app/Activity;", "mRootContainer", "Landroid/view/ViewGroup;", "keyBoardDependency", "Lcom/ss/android/lark/keyboard/IKeyBoardDependency;", "mKBPlugins", "", "Lkotlin/Pair;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "", "mInputPlugins", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "mRefactorEnable", "", "(Landroid/app/Activity;Landroid/view/ViewGroup;Lcom/ss/android/lark/keyboard/IKeyBoardDependency;Ljava/util/List;Ljava/util/List;Z)V", "curInvisiblePlugins", "", "isFinishReplyWhenSend", "isRequestingShowSysKeyboard", "isSysKeyBoardShow", "keyboardLastTotalHeight", "", "mActionQueue", "Ljava/util/Queue;", "Lcom/ss/android/lark/keyboard/plugin/tool/PluginsController2$IActionIn;", "mCurrActivePlugin", "mIKeyBoardStatusListener", "Lcom/ss/android/lark/keyboard/IKeyBoardStatusListener;", "mInputContainer", "Landroid/widget/FrameLayout;", "mInputPluginController", "Lcom/ss/android/lark/keyboard/plugin/input/InputPluginController;", "mMinSysKeyboardHeight", "mNameToInstanceMap", "", "mNewMinSysKeyboardHeight", "mPluginContainer", "Lcom/ss/android/lark/keyboard/base/NestScrollFrameLayout;", "mPluginInfoMap", "Lcom/ss/android/lark/keyboard/plugin/tool/PluginsController2$PluginInfo;", "mPluginInstances", "", "mStarted", "mStartedCallback", "Lcom/ss/android/lark/keyboard/IKeyBoardStartedCallback;", "mSysKeyboardHeight", "mToolMenuLL", "Lcom/ss/android/lark/keyboard/widget/KBPluginContainerView;", "mToolMenuRegion", "Landroid/view/View;", "mToolMenuWrapper", "mTouchActionNotifier", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$ITouchActionNotifier;", "navbarOriginalColor", "sourceScene", "Lcom/ss/android/lark/keyboard/KeyboardScene;", "startedPluginRecorder", "sysKeyBoardObserveFrameLayout", "Lcom/ss/android/lark/keyboard/widget/SysKeyBoardObserveFrameLayout;", "taskOnKeyboardHide", "Lkotlin/Function0;", "", "taskOnKeyboardShow", "value", "panel", "getPanel", "(Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;)Landroid/view/View;", "setPanel", "(Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;Landroid/view/View;)V", "changePluginUseable", "isUseable", "changeToReplyMode", "replyInfo", "Lcom/ss/android/lark/keyboard/KeyBoard$ReplyInfo;", "changeToSpecificInputSupport", "name", "param", "Lcom/ss/android/lark/keyboard/plugin/input/TransationData;", "inputSupport", "Lkotlin/reflect/KClass;", "changeVisiblePlugins", "visibles", "", "([Lkotlin/reflect/KClass;)V", "clearPluginPanelContainer", "createIconWrapper", "context", "Landroid/content/Context;", "createKBPlugin", "plugin", "createPluginPanel", "destroy", "doActionWhenReady", "tag", "action", "doActionsInQueue", "expandPluginGroupToolMenu", "pluginGroup", "Lcom/ss/android/lark/keyboard/plugin/tool/plugingroup/IKeyBoardPluginGroup;", "expandPluginGroupToolMenuInner", "viewPair", "getActivity", "getCurrInputSupport", "Lcom/ss/android/lark/keyboard/plugin/input/IOutInputSupport;", "getCurrentKbPluginName", "getInputContainerMinHeight", "getInputHeight", "getInputPlugin", "T", "(Ljava/lang/String;)Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "getKeyBoardHeight", "getKeyBoardInputSupport", "getKeyBoardTotalHeight", "targetPlugin", "getMenuHeight", "getOrCreatePluginPanel", "getParentMsgId", "getPlugin", "(Ljava/lang/String;)Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "getRootMsgId", "getSourceScene", "getSysKeyBoardHeight", "getToolPanelHeight", "handlePluginSelected", "showSysKeyboardWhenHidePanel", "handlePluginVisibilityChange", "hasKeyBoardInputSupport", "hide", "hidePanelAndSysKeyboard", "hidePluginGroupToolMenu", "hideSysKeyBoard", "hideSysKeyboardAndRun", "hideToolMenu", "initPluginInstances", "isCurrInputSupportSameWith", "isInReplyMode", "isKeyBoardShow", "isToolBoxShow", "isToolPanelShow", "notifyKeyboardChanged", "shown", "notifyKeyboardStateChange", "isKeyboardOrPanelShow", "height", "notifyReplyModeChanged", "isReplyMode", "notifyReplyModeChanged$im_keyboard_release", "notifySend", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onGlobalLayout", "onKeyBoardHide", "onKeyBoardShow", "heightDiff", "pause", "registerInputPluginChangeListener", "listener", "Lcom/ss/android/lark/keyboard/plugin/input/InputPluginController$InputSupportPluginChangeListener;", "registerInputSupport", "registerKBPlugin", "removeAllPluginPanels", "removeGone", "selectPlugin", "pluginName", "selectPluginInner", "selectPluginWithNoPanel", "selectPluginWithPanel", "setDraftText", "messageRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "title", "richText", "append", "setEditorWatcher", "textWatcher", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext$ITextWatcher;", "setIconTouchDelegate", "v", "setIsFinishReplyWhenSend", "isFinishReply", "setKeyBoardStartedCallback", "callback", "setKeyBoardStatusListener", "setPluginEnable", "isEnable", "pluginChanged", "setPluginLayoutManager", "pluginLayoutManager", "Lcom/ss/android/lark/keyboard/widget/IPluginLayoutManager;", "setPluginVisible", "isVisiable", "isVisible", "setSourceScene", "scene", "setToolbarRegionColorRes", "colorRes", "show", "showSysKeyBoard", "showSysKeyboardAndRun", "showToolMenu", "sortKBPlugin", "orderMap", "", "Ljava/lang/Class;", "start", "startInputSupportPlugin", "inputSupportPlugin", "params", "stop", "stopPluginInner", "unRegisterInputPluginChangeListener", "unSelectCurrentPluginInner", "passively", "unSelectedCurrPlugin", "contain", "view", "Companion", "IActionIn", "PluginInfo", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.e */
public final class PluginsController2 implements ViewTreeObserver.OnGlobalLayoutListener, IKeyBoard, KeyBoardObserveFrameLayout.IOnKeyBoardListener, IKeyBoardPlugin.IKeyBoardContext {

    /* renamed from: o */
    public static final Companion f103869o = new Companion(null);

    /* renamed from: A */
    private int f103870A;

    /* renamed from: B */
    private KeyboardScene f103871B;

    /* renamed from: C */
    private boolean f103872C;

    /* renamed from: D */
    private Function0<Unit> f103873D;

    /* renamed from: E */
    private Function0<Unit> f103874E;

    /* renamed from: F */
    private final Queue<IActionIn> f103875F;

    /* renamed from: G */
    private final IKeyBoardDependency f103876G;

    /* renamed from: H */
    private final List<Pair<IKeyBoardPlugin, String>> f103877H;

    /* renamed from: I */
    private final List<Pair<IInputSupportPlugin, String>> f103878I;

    /* renamed from: J */
    private boolean f103879J;

    /* renamed from: a */
    public List<IKeyBoardPlugin> f103880a = new ArrayList();

    /* renamed from: b */
    public Map<String, IKeyBoardPlugin> f103881b = new HashMap();

    /* renamed from: c */
    public final InputPluginController f103882c;

    /* renamed from: d */
    public IKeyBoardPlugin f103883d;

    /* renamed from: e */
    public final NestScrollFrameLayout f103884e;

    /* renamed from: f */
    public boolean f103885f;

    /* renamed from: g */
    public final Set<IKeyBoardPlugin> f103886g;

    /* renamed from: h */
    public boolean f103887h;

    /* renamed from: i */
    public int f103888i;

    /* renamed from: j */
    public IKeyBoardStatusListener f103889j;

    /* renamed from: k */
    public boolean f103890k;

    /* renamed from: l */
    public IKeyBoardStartedCallback f103891l;

    /* renamed from: m */
    public final Activity f103892m;

    /* renamed from: n */
    public final ViewGroup f103893n;

    /* renamed from: p */
    private final ViewGroup f103894p;

    /* renamed from: q */
    private final KBPluginContainerView f103895q;

    /* renamed from: r */
    private final SysKeyBoardObserveFrameLayout f103896r;

    /* renamed from: s */
    private final FrameLayout f103897s;

    /* renamed from: t */
    private final Map<IKeyBoardPlugin, PluginInfo> f103898t = new HashMap();

    /* renamed from: u */
    private final IKeyBoardPlugin.ITouchActionNotifier f103899u;

    /* renamed from: v */
    private final int f103900v;

    /* renamed from: w */
    private final int f103901w;

    /* renamed from: x */
    private int f103902x;

    /* renamed from: y */
    private final List<IKeyBoardPlugin> f103903y;

    /* renamed from: z */
    private final View f103904z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$ac */
    static final class C40862ac extends Lambda implements Function0<Unit> {
        public static final C40862ac INSTANCE = new C40862ac();

        C40862ac() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$ad */
    static final class C40863ad extends Lambda implements Function0<Unit> {
        public static final C40863ad INSTANCE = new C40863ad();

        C40863ad() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/PluginsController2$IActionIn;", "", "doAction", "", "tag", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$b */
    public interface IActionIn {
        /* renamed from: a */
        void mo147472a();

        /* renamed from: b */
        String mo147473b();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$i */
    public static final class C40869i extends Lambda implements Function0<Unit> {
        public static final C40869i INSTANCE = new C40869i();

        C40869i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$m */
    static final class C40874m extends Lambda implements Function0<Unit> {
        public static final C40874m INSTANCE = new C40874m();

        C40874m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$n */
    static final class C40875n extends Lambda implements Function0<Unit> {
        public static final C40875n INSTANCE = new C40875n();

        C40875n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/PluginsController2$Companion;", "", "()V", "TAG", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/PluginsController2$PluginInfo;", "", "()V", "icon", "Landroid/view/View;", "getIcon", "()Landroid/view/View;", "setIcon", "(Landroid/view/View;)V", "panel", "getPanel", "setPanel", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$c */
    public static final class PluginInfo {

        /* renamed from: a */
        private View f103908a;

        /* renamed from: b */
        private View f103909b;

        /* renamed from: a */
        public final View mo147474a() {
            return this.f103908a;
        }

        /* renamed from: b */
        public final View mo147476b() {
            return this.f103909b;
        }

        /* renamed from: a */
        public final void mo147475a(View view) {
            this.f103908a = view;
        }

        /* renamed from: b */
        public final void mo147477b(View view) {
            this.f103909b = view;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/PluginsController2$doActionWhenReady$1", "Lcom/ss/android/lark/keyboard/plugin/tool/PluginsController2$IActionIn;", "doAction", "", "tag", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$g */
    public static final class C40867g implements IActionIn {

        /* renamed from: a */
        final /* synthetic */ Function0 f103910a;

        /* renamed from: b */
        final /* synthetic */ String f103911b;

        @Override // com.ss.android.lark.keyboard.plugin.tool.PluginsController2.IActionIn
        /* renamed from: b */
        public String mo147473b() {
            return this.f103911b;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.PluginsController2.IActionIn
        /* renamed from: a */
        public void mo147472a() {
            this.f103910a.invoke();
        }

        C40867g(Function0 function0, String str) {
            this.f103910a = function0;
            this.f103911b = str;
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
    /* renamed from: B */
    public Activity mo147365B() {
        return this.f103892m;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext, com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: b */
    public KeyboardScene mo146813b() {
        return this.f103871B;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext, com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: d */
    public boolean mo146822d() {
        return this.f103885f;
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: i */
    public boolean mo146828i() {
        return this.f103885f;
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: u */
    public boolean mo146840u() {
        return this.f103872C;
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146803a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        IKeyBoard.C40674a.m160760a(this, str);
    }

    @Override // com.ss.android.lark.keyboard.base.KeyBoardObserveFrameLayout.IOnKeyBoardListener
    /* renamed from: a */
    public void mo129627a(int i) {
        this.f103887h = false;
        Log.m165389i("keyboard", "onKeyBoardShow: currentPlugin=" + this.f103883d + ", " + "isSysKeyBoardShow=" + this.f103885f + " , " + "mSysKeyboardHeight=" + i);
        if (!this.f103885f) {
            this.f103885f = true;
            this.f103902x = i;
            IKeyBoardPlugin bVar = this.f103883d;
            if ((bVar != null ? m161820i(bVar) : null) != null) {
                Log.m165389i("keyboard", "onKeyBoardShow: currentActive plugin has panel, now unselect it");
                mo147465c(true);
                mo147458I();
            }
            this.f103874E.invoke();
            this.f103874E = C40875n.INSTANCE;
            m161808a(this, true, 0, 2, (Object) null);
        }
    }

    @Override // com.ss.android.lark.keyboard.base.KeyBoardObserveFrameLayout.IOnKeyBoardListener
    /* renamed from: a */
    public void mo129626a() {
        this.f103887h = false;
        Log.m165389i("keyboard", "onKeyBoardShow: currentPlugin=" + this.f103883d + ", " + "isSysKeyBoardShow=" + this.f103885f);
        if (this.f103885f) {
            this.f103885f = false;
            this.f103873D.invoke();
            this.f103873D = C40874m.INSTANCE;
            this.f103884e.requestLayout();
            m161808a(this, false, 0, 2, (Object) null);
        }
    }

    /* renamed from: a */
    public final void mo147459a(IKeyBoardPlugin bVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("handlePluginSelected: plugin is ");
        sb.append(bVar);
        sb.append(", ");
        sb.append("currentPlugin is ");
        sb.append(this.f103883d);
        sb.append(", ");
        sb.append("plugin has panel ");
        sb.append(m161820i(bVar) != null);
        sb.append(", ");
        sb.append("plugin is IKeyBoardPluginGroup ");
        boolean z2 = bVar instanceof IKeyBoardPluginGroup;
        sb.append(z2);
        Log.m165389i("keyboard", sb.toString());
        if (!this.f103886g.contains(bVar)) {
            if (Intrinsics.areEqual(bVar, this.f103883d)) {
                if (m161820i(bVar) == null || !z) {
                    m161809a(this, false, 1, (Object) null);
                    mo147458I();
                    return;
                }
                C40868h hVar = C40869i.INSTANCE;
                if (z2) {
                    hVar = new C40868h(this);
                }
                mo147463b(hVar);
            } else if (m161820i(bVar) != null) {
                mo147464c(bVar);
            } else {
                mo147373b(bVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo147460a(IKeyBoardPluginGroup aVar) {
        aVar.mo147300e().mo147349a(this.f103894p);
        m161811a(TuplesKt.to(aVar.mo147296c(), this.f103895q));
    }

    /* renamed from: a */
    public void mo147461a(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "action");
        Log.m165389i("keyboard", "hideSysKeyboardAndRun: isSysKeyBoardShow " + this.f103885f);
        if (!this.f103885f) {
            function0.invoke();
            return;
        }
        mo146830k();
        this.f103873D = function0;
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146811a(KClass<? extends IKeyBoardPlugin>... kClassArr) {
        Intrinsics.checkParameterIsNotNull(kClassArr, "visibles");
        HashSet j = C69043h.m265785j(kClassArr);
        this.f103886g.clear();
        this.f103886g.addAll(this.f103880a);
        for (T t : this.f103880a) {
            if (j.contains(Reflection.getOrCreateKotlinClass(t.getClass()))) {
                this.f103886g.remove(t);
            }
        }
        mo147456G();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146809a(KClass<? extends IKeyBoardPlugin> kClass, boolean z) {
        Intrinsics.checkParameterIsNotNull(kClass, "pluginChanged");
        m161810a("setPluginEnable[ " + C69113a.m265954a((KClass) kClass).getSimpleName() + " : " + z, new C40881t(this, kClass, z));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146807a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "pluginName");
        m161810a("setPluginEnable[ " + str + " : " + z, new C40882u(this, str, z));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146810a(boolean z) {
        m161810a("setPluginEnable[ " + z, new C40883v(this, z));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146800a(IKeyBoardPlugin bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "plugin");
        m161816f(bVar);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146801a(IPluginLayoutManager eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "pluginLayoutManager");
        this.f103895q.setPluginLayoutManager(eVar);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146805a(String str, TransationData jVar) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(jVar, "param");
        m161810a("changeToSpecificInputSupport[ " + str + " , " + jVar, new C40865e(this, str, jVar));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146797a(KeyBoard.ReplyInfo bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "replyInfo");
        m161810a("changeToReplyMode", new C40864d(bVar, this));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146802a(RichText richText, String str, RichText richText2, boolean z) {
        m161810a("setDraftText", new C40880s(this, richText, str, richText2, z));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146796a(IKeyBoardStatusListener eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "listener");
        this.f103889j = eVar;
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146806a(String str, IKeyBoardPlugin bVar) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(bVar, "plugin");
        this.f103880a.add(bVar);
        this.f103898t.put(bVar, new PluginInfo());
        this.f103881b.put(str, bVar);
        if (!this.f103879J) {
            m161819h(bVar);
        }
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146804a(String str, IInputSupportPlugin fVar) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(fVar, "inputSupport");
        this.f103882c.mo147156a(TuplesKt.to(fVar, str));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146798a(InputPluginController.InputSupportPluginChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f103882c.mo147149a(aVar);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146808a(Map<Class<? extends IKeyBoardPlugin>, Integer> map) {
        Intrinsics.checkParameterIsNotNull(map, "orderMap");
        List<IKeyBoardPlugin> list = this.f103880a;
        if (list.size() > 1) {
            CollectionsKt.sortWith(list, new C40887z(map));
        }
        if (!this.f103879J) {
            this.f103895q.removeAllViews();
            for (T t : this.f103880a) {
                Context context = this.f103895q.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "mToolMenuLL.context");
                ViewGroup a = m161805a(context);
                View a2 = t.mo147288a(a, this.f103899u);
                if (a2 != null) {
                    a.addView(a2);
                    this.f103895q.addView(a);
                    m161806a(a2);
                }
                PluginInfo cVar = this.f103898t.get(t);
                if (cVar == null) {
                    Intrinsics.throwNpe();
                }
                cVar.mo147477b(a);
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146799a(TransationData jVar) {
        if (this.f103879J) {
            m161802K();
            this.f103895q.removeAllViews();
            Iterator<T> it = this.f103880a.iterator();
            while (it.hasNext()) {
                m161819h(it.next());
            }
        }
        this.f103882c.mo147150a(jVar);
        this.f103890k = true;
        if (this.f103879J) {
            Log.m165389i("keyboard", "life start");
            m161803L();
        }
        this.f103904z.post(new RunnableC40860aa(this));
        Window window = this.f103892m.getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "mActivity.window");
        this.f103888i = window.getNavigationBarColor();
        Window window2 = this.f103892m.getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window2, "mActivity.window");
        window2.setNavigationBarColor(UDColorUtils.getColor(this.f103892m, R.color.bg_body_overlay));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public boolean mo146812a(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null) {
            if (!this.f103879J || this.f103890k) {
                Iterator<T> it = this.f103880a.iterator();
                while (it.hasNext()) {
                    if (it.next().mo147292a(i, intent)) {
                        return true;
                    }
                }
            } else {
                this.f103882c.mo147153a(new RunnableC40873l(this, i, intent));
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo147462a(FrameLayout frameLayout, View view) {
        int childCount = frameLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (frameLayout.getChildAt(i) == view) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
    /* renamed from: a */
    public void mo147370a(IKeyBoardPlugin.IKeyBoardContext.ITextWatcher aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "textWatcher");
        this.f103882c.mo147151a(aVar);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
    /* renamed from: a */
    public void mo147371a(KClass<? extends IInputSupportPlugin> kClass, TransationData jVar) {
        Intrinsics.checkParameterIsNotNull(kClass, "inputSupportPlugin");
        InputPluginController hVar = this.f103882c;
        IOutInputSupport i = hVar.mo147163i();
        if (!(i instanceof IInputSupportPlugin)) {
            i = null;
        }
        hVar.mo147121a(kClass, (IInputSupportPlugin) i, jVar);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
    /* renamed from: A */
    public boolean mo147364A() {
        return this.f103882c.mo147164j();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
    /* renamed from: C */
    public int mo147366C() {
        return this.f103904z.getHeight();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
    /* renamed from: D */
    public int mo147367D() {
        return this.f103884e.getHeight();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: f */
    public int mo146825f() {
        return m161804a(this, (IKeyBoardPlugin) null, 1, (Object) null);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: h */
    public IOutInputSupport mo146827h() {
        return this.f103882c.mo147163i();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: p */
    public boolean mo146835p() {
        return this.f103882c.mo147166l();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext, com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: q */
    public String mo146836q() {
        return this.f103882c.mo147167m();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext, com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: r */
    public String mo146837r() {
        return this.f103882c.mo147168n();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: w */
    public void mo146842w() {
        mo146799a((TransationData) null);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: x */
    public void mo146843x() {
        this.f103882c.mo147169o();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
    /* renamed from: z */
    public IOutInputSupport mo147381z() {
        return this.f103882c.mo147163i();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$ab */
    static final class C40861ab extends Lambda implements Function0<Unit> {
        final /* synthetic */ PluginsController2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40861ab(PluginsController2 eVar) {
            super(0);
            this.this$0 = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            Log.m165389i("keyboard", "life stop impl");
            this.this$0.f103882c.mo147161g();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$e */
    static final class C40865e extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $name;
        final /* synthetic */ TransationData $param;
        final /* synthetic */ PluginsController2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40865e(PluginsController2 eVar, String str, TransationData jVar) {
            super(0);
            this.this$0 = eVar;
            this.$name = str;
            this.$param = jVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.f103882c.mo147154a(this.$name, this.$param);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$h */
    public static final class C40868h extends Lambda implements Function0<Unit> {
        final /* synthetic */ PluginsController2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40868h(PluginsController2 eVar) {
            super(0);
            this.this$0 = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo147465c(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$k */
    public static final class C40871k extends Lambda implements Function0<Unit> {
        final /* synthetic */ PluginsController2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40871k(PluginsController2 eVar) {
            super(0);
            this.this$0 = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo147461a(new Function0<Unit>(this) {
                /* class com.ss.android.lark.keyboard.plugin.tool.PluginsController2.C40871k.C408721 */
                final /* synthetic */ C40871k this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    this.this$0.this$0.mo147465c(true);
                    this.this$0.this$0.mo147458I();
                    if (this.this$0.this$0.f103885f) {
                        PluginsController2.m161808a(this.this$0.this$0, false, 0, 2, (Object) null);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$p */
    public static final class C40877p extends Lambda implements Function0<Unit> {
        final /* synthetic */ Function0 $action;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40877p(Function0 function0) {
            super(0);
            this.$action = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.$action.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$s */
    static final class C40880s extends Lambda implements Function0<Unit> {
        final /* synthetic */ boolean $append;
        final /* synthetic */ RichText $messageRichText;
        final /* synthetic */ RichText $richText;
        final /* synthetic */ String $title;
        final /* synthetic */ PluginsController2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40880s(PluginsController2 eVar, RichText richText, String str, RichText richText2, boolean z) {
            super(0);
            this.this$0 = eVar;
            this.$messageRichText = richText;
            this.$title = str;
            this.$richText = richText2;
            this.$append = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.f103882c.mo147152a(this.$messageRichText, this.$title, this.$richText, this.$append);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
    /* renamed from: E */
    public int mo147368E() {
        return this.f103882c.mo147163i().mo146906n();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
    /* renamed from: F */
    public boolean mo147369F() {
        View view;
        IKeyBoardPlugin bVar = this.f103883d;
        if (bVar != null) {
            view = m161820i(bVar);
        } else {
            view = null;
        }
        if (view != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext, com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: j */
    public void mo146829j() {
        m161810a("showSysKeyBoard", new C40886y(this));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: n */
    public void mo146833n() {
        m161810a("hide", new C40870j(this));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: o */
    public void mo146834o() {
        m161810a("show", new C40885x(this));
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext, com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: v */
    public void mo146841v() {
        if (this.f103872C) {
            this.f103882c.mo147118a();
            mo147468e(false);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext, com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: y */
    public void mo146844y() {
        IKeyBoardPlugin bVar = this.f103883d;
        if (bVar != null) {
            if (bVar == null) {
                Intrinsics.throwNpe();
            }
            m161807a(this, bVar, false, 2, (Object) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$l */
    static final class RunnableC40873l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PluginsController2 f103912a;

        /* renamed from: b */
        final /* synthetic */ int f103913b;

        /* renamed from: c */
        final /* synthetic */ Intent f103914c;

        RunnableC40873l(PluginsController2 eVar, int i, Intent intent) {
            this.f103912a = eVar;
            this.f103913b = i;
            this.f103914c = intent;
        }

        public final void run() {
            Iterator<T> it = this.f103912a.f103880a.iterator();
            while (it.hasNext()) {
                it.next().mo147292a(this.f103913b, this.f103914c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$q */
    public static final class C40878q extends Lambda implements Function0<Unit> {
        final /* synthetic */ IKeyBoardPlugin $plugin;
        final /* synthetic */ PluginsController2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40878q(PluginsController2 eVar, IKeyBoardPlugin bVar) {
            super(0);
            this.this$0 = eVar;
            this.$plugin = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            IKeyBoardPlugin bVar = this.$plugin;
            if (bVar instanceof IKeyBoardPluginGroup) {
                this.this$0.mo147460a((IKeyBoardPluginGroup) bVar);
            }
            this.this$0.mo147466d(this.$plugin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$u */
    static final class C40882u extends Lambda implements Function0<Unit> {
        final /* synthetic */ boolean $isEnable;
        final /* synthetic */ String $pluginName;
        final /* synthetic */ PluginsController2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40882u(PluginsController2 eVar, String str, boolean z) {
            super(0);
            this.this$0 = eVar;
            this.$pluginName = str;
            this.$isEnable = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            IKeyBoardPlugin bVar = this.this$0.f103881b.get(this.$pluginName);
            if (bVar != null) {
                bVar.mo147291a(this.$isEnable);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$x */
    static final class C40885x extends Lambda implements Function0<Unit> {
        final /* synthetic */ PluginsController2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40885x(PluginsController2 eVar) {
            super(0);
            this.this$0 = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.f103893n.setVisibility(0);
            IKeyBoardStatusListener eVar = this.this$0.f103889j;
            if (eVar != null) {
                eVar.mo122008a(PluginsController2.m161804a(this.this$0, (IKeyBoardPlugin) null, 1, (Object) null));
            }
            this.this$0.mo147467d(true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$y */
    public static final class C40886y extends Lambda implements Function0<Unit> {
        final /* synthetic */ PluginsController2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40886y(PluginsController2 eVar) {
            super(0);
            this.this$0 = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            if (!this.this$0.f103885f && !this.this$0.f103887h) {
                this.this$0.f103887h = true;
                KeyboardUtils.showKeyboard(this.this$0.f103892m);
            }
        }
    }

    /* renamed from: H */
    public final int mo147457H() {
        if (!DesktopUtil.m144307b()) {
            int i = this.f103902x;
            if (i == 0) {
                return this.f103901w;
            }
            return i;
        }
        int keyboardHeight = KeyboardUtils.getKeyboardHeight(this.f103892m);
        int i2 = this.f103900v;
        return keyboardHeight < i2 ? i2 : keyboardHeight;
    }

    /* renamed from: I */
    public void mo147458I() {
        m161814b(this, false, 1, null);
        NestScrollFrameLayout nestScrollFrameLayout = this.f103884e;
        nestScrollFrameLayout.getLayoutParams().height = 0;
        nestScrollFrameLayout.setVisibility(8);
        this.f103884e.requestLayout();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: c */
    public void mo146820c() {
        m161810a("hidePanelAndSysKeyBoard", new C40871k(this));
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext, com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: k */
    public void mo146830k() {
        if (this.f103885f) {
            KeyboardUtils.hideKeyboard(this.f103892m, mo146827h().mo146904l());
        }
    }

    public void onGlobalLayout() {
        int a = m161804a(this, (IKeyBoardPlugin) null, 1, (Object) null);
        if (a != this.f103870A) {
            IKeyBoardStatusListener eVar = this.f103889j;
            if (eVar != null) {
                eVar.mo122008a(a);
            }
            this.f103870A = a;
        }
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: t */
    public void mo146839t() {
        Log.m165389i("keyboard", "life stop");
        m161810a("stop", new C40861ab(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$aa */
    public static final class RunnableC40860aa implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PluginsController2 f103907a;

        RunnableC40860aa(PluginsController2 eVar) {
            this.f103907a = eVar;
        }

        public final void run() {
            IKeyBoardStartedCallback dVar = this.f103907a.f103891l;
            if (dVar != null) {
                int a = PluginsController2.m161804a(this.f103907a, (IKeyBoardPlugin) null, 1, (Object) null);
                Log.m165379d("keyboard", "mStartedCallback?.onStarted(" + a + ')');
                dVar.mo146866a(a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/keyboard/plugin/tool/PluginsController2$changeToReplyMode$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$d */
    static final class C40864d extends Lambda implements Function0<Unit> {
        final /* synthetic */ KeyBoard.ReplyInfo $this_with;
        final /* synthetic */ PluginsController2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40864d(KeyBoard.ReplyInfo bVar, PluginsController2 eVar) {
            super(0);
            this.$this_with = bVar;
            this.this$0 = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.f103882c.mo147155a(this.$this_with.mo146868a(), this.$this_with.mo146869b(), this.$this_with.mo146870c(), this.$this_with.mo146871d(), this.$this_with.mo146872e(), this.$this_with.mo146873f());
            PluginsController2 eVar = this.this$0;
            PluginsController2.m161808a(eVar, eVar.f103885f, 0, 2, (Object) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$j */
    static final class C40870j extends Lambda implements Function0<Unit> {
        final /* synthetic */ PluginsController2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40870j(PluginsController2 eVar) {
            super(0);
            this.this$0 = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.f103893n.setVisibility(8);
            IKeyBoardStatusListener eVar = this.this$0.f103889j;
            if (eVar != null) {
                eVar.mo122008a(PluginsController2.m161804a(this.this$0, (IKeyBoardPlugin) null, 1, (Object) null));
            }
            this.this$0.mo147467d(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$o */
    static final class C40876o extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $pluginName;
        final /* synthetic */ PluginsController2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40876o(PluginsController2 eVar, String str) {
            super(0);
            this.this$0 = eVar;
            this.$pluginName = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            IKeyBoardPlugin bVar = this.this$0.f103881b.get(this.$pluginName);
            if (bVar != null) {
                this.this$0.mo147459a(bVar, true);
                return;
            }
            Log.m165397w("keyboard", "select plugin is not register : " + this.$pluginName);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$t */
    static final class C40881t extends Lambda implements Function0<Unit> {
        final /* synthetic */ boolean $isEnable;
        final /* synthetic */ KClass $pluginChanged;
        final /* synthetic */ PluginsController2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40881t(PluginsController2 eVar, KClass kClass, boolean z) {
            super(0);
            this.this$0 = eVar;
            this.$pluginChanged = kClass;
            this.$isEnable = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            for (T t : this.this$0.f103880a) {
                if (Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(t.getClass()), this.$pluginChanged)) {
                    t.mo147291a(this.$isEnable);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$v */
    static final class C40883v extends Lambda implements Function0<Unit> {
        final /* synthetic */ boolean $isEnable;
        final /* synthetic */ PluginsController2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40883v(PluginsController2 eVar, boolean z) {
            super(0);
            this.this$0 = eVar;
            this.$isEnable = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            for (Map.Entry<String, IKeyBoardPlugin> entry : this.this$0.f103881b.entrySet()) {
                entry.getValue().mo147291a(this.$isEnable);
            }
            this.this$0.f103882c.mo147157a(this.$isEnable);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$w */
    static final class C40884w extends Lambda implements Function0<Unit> {
        final /* synthetic */ boolean $isVisiable;
        final /* synthetic */ String $pluginName;
        final /* synthetic */ PluginsController2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40884w(PluginsController2 eVar, String str, boolean z) {
            super(0);
            this.this$0 = eVar;
            this.$pluginName = str;
            this.$isVisiable = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            IKeyBoardPlugin bVar = this.this$0.f103881b.get(this.$pluginName);
            if (bVar == null) {
                return;
            }
            if (this.$isVisiable) {
                if (this.this$0.f103886g.remove(bVar)) {
                    this.this$0.mo147456G();
                }
            } else if (this.this$0.f103886g.add(bVar)) {
                this.this$0.mo147456G();
            }
        }
    }

    /* renamed from: J */
    private final int m161801J() {
        EditText editText = new EditText(this.f103892m);
        editText.setTextSize(16.0f);
        editText.measure(View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
        return Math.max(editText.getMeasuredHeight(), UIUtils.dp2px(this.f103892m, 22.0f)) + UIUtils.dp2px(this.f103892m, 0.5f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: java.util.Map<java.lang.String, com.ss.android.lark.keyboard.plugin.tool.b> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K */
    private final void m161802K() {
        for (T t : this.f103877H) {
            IKeyBoardPlugin bVar = (IKeyBoardPlugin) t.getFirst();
            this.f103880a.add(bVar);
            this.f103898t.put(bVar, new PluginInfo());
            this.f103881b.put(t.getSecond(), bVar);
        }
    }

    /* renamed from: L */
    private final void m161803L() {
        String str;
        while (!this.f103875F.isEmpty()) {
            IActionIn poll = this.f103875F.poll();
            if (poll != null) {
                poll.mo147472a();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("doActionsInQueue : tag ");
            if (poll != null) {
                str = poll.mo147473b();
            } else {
                str = null;
            }
            sb.append(str);
            Log.m165389i("keyboard", sb.toString());
        }
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: l */
    public void mo146831l() {
        this.f103904z.setVisibility(8);
        ViewGroup viewGroup = this.f103893n;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = UIHelper.dp2px(8.0f);
            viewGroup.setLayoutParams(marginLayoutParams);
            this.f103893n.requestLayout();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: m */
    public void mo146832m() {
        this.f103904z.setVisibility(0);
        ViewGroup viewGroup = this.f103893n;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = UIHelper.dp2px(BitmapDescriptorFactory.HUE_RED);
            viewGroup.setLayoutParams(marginLayoutParams);
            this.f103893n.requestLayout();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: s */
    public void mo146838s() {
        ViewTreeObserver viewTreeObserver;
        Log.m165389i("keyboard", "life destroy");
        m161810a("destroy", new C40866f(this));
        SysKeyBoardObserveFrameLayout sysKeyBoardObserveFrameLayout = this.f103896r;
        if (sysKeyBoardObserveFrameLayout != null && (viewTreeObserver = sysKeyBoardObserveFrameLayout.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$f */
    static final class C40866f extends Lambda implements Function0<Unit> {
        final /* synthetic */ PluginsController2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40866f(PluginsController2 eVar) {
            super(0);
            this.this$0 = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            Log.m165389i("keyboard", "life destroy impl");
            this.this$0.f103882c.mo147162h();
            Iterator<T> it = this.this$0.f103880a.iterator();
            while (it.hasNext()) {
                it.next().mo147306j();
            }
            this.this$0.mo147469f(true);
            this.this$0.f103891l = null;
            this.this$0.f103890k = false;
            Window window = this.this$0.f103892m.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "mActivity.window");
            window.setNavigationBarColor(this.this$0.f103888i);
        }
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: e */
    public boolean mo146824e() {
        IKeyBoardPlugin bVar = this.f103883d;
        if (bVar != null) {
            if (bVar == null) {
                Intrinsics.throwNpe();
            }
            if (bVar.mo147307k()) {
                return true;
            }
            IKeyBoardPlugin bVar2 = this.f103883d;
            if (bVar2 == null) {
                Intrinsics.throwNpe();
            }
            m161807a(this, bVar2, false, 2, (Object) null);
            return true;
        } else if (this.f103882c.mo147165k()) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$r */
    public static final class C40879r extends Lambda implements Function0<Unit> {
        final /* synthetic */ View $panel;
        final /* synthetic */ IKeyBoardPlugin $plugin;
        final /* synthetic */ PluginsController2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40879r(PluginsController2 eVar, IKeyBoardPlugin bVar, View view) {
            super(0);
            this.this$0 = eVar;
            this.$plugin = bVar;
            this.$panel = view;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            boolean z;
            IKeyBoardPlugin bVar;
            Log.m165389i("keyboard", "selectPluginWithPanel: after hide system keyboard, plugin is " + this.$plugin + " ," + " currentPlugin=" + this.this$0.f103883d);
            if (!(this.this$0.f103883d instanceof IKeyBoardPluginGroup) || !Intrinsics.areEqual(this.$plugin, this.this$0.f103883d)) {
                z = false;
            } else {
                z = true;
            }
            if ((!z || (!Intrinsics.areEqual(this.$plugin, this.this$0.f103883d))) && (bVar = this.this$0.f103883d) != null) {
                bVar.mo147305i();
            }
            PluginsController2.m161814b(this.this$0, false, 1, null);
            PluginsController2 eVar = this.this$0;
            if (!eVar.mo147462a(eVar.f103884e, this.$panel)) {
                this.this$0.f103884e.addView(this.$panel);
            }
            NestScrollFrameLayout nestScrollFrameLayout = this.this$0.f103884e;
            nestScrollFrameLayout.getLayoutParams().height = this.this$0.mo147457H();
            nestScrollFrameLayout.setVisibility(0);
            this.this$0.f103884e.requestLayout();
            this.this$0.mo147466d(this.$plugin);
            PluginsController2.m161808a(this.this$0, true, 0, 2, (Object) null);
        }
    }

    /* renamed from: G */
    public final void mo147456G() {
        boolean z;
        View b;
        View b2;
        Iterator it = CollectionsKt.toList(this.f103886g).iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            IKeyBoardPlugin bVar = (IKeyBoardPlugin) it.next();
            PluginInfo cVar = this.f103898t.get(bVar);
            View b3 = cVar != null ? cVar.mo147476b() : null;
            if (b3 != null && b3.getVisibility() == 8) {
                z2 = false;
            }
            if (z2) {
                PluginInfo cVar2 = this.f103898t.get(bVar);
                if (!(cVar2 == null || (b2 = cVar2.mo147476b()) == null)) {
                    b2.setVisibility(8);
                }
                if (Intrinsics.areEqual(this.f103883d, bVar)) {
                    m161807a(this, bVar, false, 2, (Object) null);
                }
                bVar.mo147295b(false);
            }
        }
        for (IKeyBoardPlugin bVar2 : CollectionsKt.toList(CollectionsKt.minus((Iterable) this.f103880a, (Iterable) this.f103886g))) {
            PluginInfo cVar3 = this.f103898t.get(bVar2);
            View b4 = cVar3 != null ? cVar3.mo147476b() : null;
            if (b4 == null || b4.getVisibility() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                PluginInfo cVar4 = this.f103898t.get(bVar2);
                if (!(cVar4 == null || (b = cVar4.mo147476b()) == null)) {
                    b.setVisibility(0);
                }
                bVar2.mo147295b(true);
            }
        }
        this.f103895q.requestLayout();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: g */
    public String mo146826g() {
        if (this.f103883d == null) {
            return null;
        }
        Map<String, IKeyBoardPlugin> map = this.f103881b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, IKeyBoardPlugin> entry : map.entrySet()) {
            Class<?> cls = entry.getValue().getClass();
            IKeyBoardPlugin bVar = this.f103883d;
            if (Intrinsics.areEqual(cls, bVar != null ? bVar.getClass() : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.keySet());
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String) arrayList.get(0);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146795a(KeyboardScene keyboardScene) {
        Intrinsics.checkParameterIsNotNull(keyboardScene, "scene");
        this.f103871B = keyboardScene;
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: b */
    public void mo146817b(boolean z) {
        this.f103872C = z;
    }

    /* renamed from: e */
    private final void m161815e(IKeyBoardPlugin bVar) {
        if (!(!Intrinsics.areEqual(bVar, this.f103883d))) {
            bVar.mo147305i();
        }
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: c */
    public <T extends IKeyBoardPlugin> T mo146819c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        return (T) this.f103881b.get(str);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: d */
    public <T extends IInputSupportPlugin> T mo146821d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        return (T) this.f103882c.mo147160c(str);
    }

    /* renamed from: a */
    private final ViewGroup m161805a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        return frameLayout;
    }

    /* renamed from: b */
    private final void m161813b(IKeyBoardPluginGroup aVar) {
        aVar.mo147300e().mo147350b(this.f103894p);
        m161811a(TuplesKt.to(this.f103895q, aVar.mo147296c()));
    }

    /* renamed from: f */
    private final View m161816f(IKeyBoardPlugin bVar) {
        PluginInfo cVar = this.f103898t.get(bVar);
        if (cVar == null) {
            return null;
        }
        View a = cVar.mo147474a();
        if (a != null) {
            return a;
        }
        View a2 = bVar.mo147287a(this.f103884e);
        cVar.mo147475a(a2);
        return a2;
    }

    /* renamed from: g */
    private final void m161818g(boolean z) {
        Iterator<T> it = this.f103880a.iterator();
        while (it.hasNext()) {
            it.next().mo147301e(z);
        }
        mo146827h().mo146900a(z);
    }

    /* renamed from: i */
    private final View m161820i(IKeyBoardPlugin bVar) {
        if (bVar == null) {
            return null;
        }
        if (bVar instanceof IKeyBoardPluginGroup) {
            return ((IKeyBoardPluginGroup) bVar).mo147308l();
        }
        return m161816f(bVar);
    }

    /* renamed from: d */
    public final void mo147467d(boolean z) {
        Iterator<T> it = this.f103880a.iterator();
        while (it.hasNext()) {
            it.next().mo147297c(z);
        }
    }

    /* renamed from: e */
    public final void mo147468e(boolean z) {
        Iterator<T> it = this.f103880a.iterator();
        while (it.hasNext()) {
            it.next().mo147299d(z);
        }
    }

    /* renamed from: a */
    private final void m161806a(View view) {
        ak.m95026a(view, UIUtils.dp2px(view.getContext(), 9.0f));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: b */
    public void mo146814b(int i) {
        this.f103904z.setBackgroundColor(UDColorUtils.getColor(this.f103892m, i));
    }

    /* renamed from: c */
    public void mo147464c(IKeyBoardPlugin bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "plugin");
        Log.m165389i("keyboard", "selectPluginWithPanel: before hide system keyboard");
        View i = m161820i(bVar);
        if (i != null) {
            mo147461a(new C40879r(this, bVar, i));
        }
    }

    /* renamed from: d */
    public final void mo147466d(IKeyBoardPlugin bVar) {
        if (!Intrinsics.areEqual(bVar, this.f103883d)) {
            if (!this.f103903y.contains(bVar)) {
                this.f103903y.add(bVar);
                bVar.mo147303g();
            } else {
                bVar.mo147304h();
            }
            this.f103883d = bVar;
        }
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: e */
    public void mo146823e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "pluginName");
        m161810a("selectPlugin[ " + str, new C40876o(this, str));
    }

    /* renamed from: f */
    public final void mo147469f(boolean z) {
        if (z) {
            this.f103884e.removeAllViews();
            return;
        }
        for (int childCount = this.f103884e.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f103884e.getChildAt(childCount);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
            if (childAt.getVisibility() != 8 && childAt.getHeight() > 0) {
                this.f103884e.removeViewAt(childCount);
            }
        }
    }

    /* renamed from: g */
    private final int m161817g(IKeyBoardPlugin bVar) {
        View view;
        if (this.f103893n.getVisibility() == 8) {
            Log.m165379d("onLayoutHeightChanged", "mRootContainer is gone");
            return 0;
        }
        int n = mo146827h().mo146906n() + this.f103904z.getHeight();
        if (bVar != null) {
            view = m161820i(bVar);
        } else {
            view = null;
        }
        if (view != null) {
            n += mo147457H();
        }
        Log.m165379d("onLayoutHeightChanged", "mInputContainer height = " + this.f103897s.getHeight());
        return n;
    }

    /* renamed from: h */
    private final void m161819h(IKeyBoardPlugin bVar) {
        bVar.mo147290a(this);
        bVar.mo147294b(this.f103884e);
        Context context = this.f103895q.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "mToolMenuLL.context");
        ViewGroup a = m161805a(context);
        View a2 = bVar.mo147288a(a, this.f103899u);
        if (a2 != null) {
            a.addView(a2);
            this.f103895q.addView(a);
            m161806a(a2);
        }
        PluginInfo cVar = this.f103898t.get(bVar);
        if (cVar == null) {
            Intrinsics.throwNpe();
        }
        cVar.mo147477b(a);
        if (bVar instanceof IKeyBoardPluginGroup) {
            ViewGroup c = ((IKeyBoardPluginGroup) bVar).mo147296c();
            c.setVisibility(8);
            this.f103894p.addView(c);
        }
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: b */
    public void mo146815b(InputPluginController.InputSupportPluginChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f103882c.mo147158b(aVar);
    }

    /* renamed from: c */
    public final void mo147465c(boolean z) {
        IKeyBoardPlugin bVar = this.f103883d;
        StringBuilder sb = new StringBuilder();
        sb.append("unSelectCurrentPlugin: passively ");
        sb.append(z);
        sb.append(" , ");
        sb.append("currentPlugin is ");
        sb.append(this.f103883d);
        sb.append(" , ");
        sb.append("currentPlugin is IKeyBoardPluginGroup ");
        boolean z2 = bVar instanceof IKeyBoardPluginGroup;
        sb.append(z2);
        Log.m165389i("keyboard", sb.toString());
        if (!z || !z2) {
            IKeyBoardPlugin bVar2 = this.f103883d;
            if (bVar2 != null) {
                m161815e(bVar2);
            }
            this.f103883d = null;
            if (z2) {
                m161813b((IKeyBoardPluginGroup) bVar);
                mo147456G();
                return;
            }
            return;
        }
        ((IKeyBoardPluginGroup) bVar).mo147309m();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
    /* renamed from: b */
    public void mo147373b(IKeyBoardPlugin bVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(bVar, "plugin");
        StringBuilder sb = new StringBuilder();
        sb.append("selectPluginWithNoPanel: plugin ");
        sb.append(bVar);
        sb.append(" , ");
        sb.append("plugin is IKeyBoardPluginGroup ");
        sb.append(bVar instanceof IKeyBoardPluginGroup);
        sb.append(" ,");
        sb.append("currentPlugin ");
        sb.append(this.f103883d);
        sb.append(" ,");
        sb.append("currentPlugin has panel ");
        if (m161820i(this.f103883d) != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        Log.m165389i("keyboard", sb.toString());
        C40878q qVar = new C40878q(this, bVar);
        IKeyBoardPlugin bVar2 = this.f103883d;
        if (bVar2 == null || m161820i(bVar2) == null) {
            m161809a(this, false, 1, (Object) null);
            qVar.invoke();
            return;
        }
        mo147463b(new C40877p(qVar));
    }

    /* renamed from: b */
    public void mo147463b(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "action");
        Log.m165389i("keyboard", "showSysKeyboardAndRun: isSysKeyBoardShow " + this.f103885f);
        if (this.f103885f) {
            function0.invoke();
            return;
        }
        mo146829j();
        this.f103874E = function0;
    }

    /* renamed from: a */
    private final void m161811a(Pair<? extends View, ? extends View> pair) {
        View view = (View) pair.getFirst();
        ((View) pair.getSecond()).setVisibility(8);
        view.setVisibility(0);
        view.bringToFront();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: b */
    public boolean mo146818b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        return this.f103882c.mo147159b(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e$z */
    public static final class C40887z<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Map f103915a;

        public C40887z(Map map) {
            this.f103915a = map;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues((Integer) this.f103915a.get(t.getClass()), (Integer) this.f103915a.get(t2.getClass()));
        }
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: b */
    public void mo146816b(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "pluginName");
        m161810a("setPluginVisible[ " + str + " : " + z, new C40884w(this, str, z));
    }

    /* renamed from: a */
    private final void m161810a(String str, Function0<Unit> function0) {
        if (this.f103890k || !this.f103879J) {
            function0.invoke();
        } else {
            this.f103875F.offer(new C40867g(function0, str));
        }
    }

    /* renamed from: a */
    private final void m161812a(boolean z, int i) {
        IKeyBoardStatusListener eVar = this.f103889j;
        if (eVar != null) {
            eVar.mo122009a(z, i, mo146837r());
        }
        m161818g(z);
    }

    /* renamed from: a */
    static /* synthetic */ int m161804a(PluginsController2 eVar, IKeyBoardPlugin bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = eVar.f103883d;
        }
        return eVar.m161817g(bVar);
    }

    /* renamed from: b */
    static /* synthetic */ void m161814b(PluginsController2 eVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        eVar.mo147469f(z);
    }

    /* renamed from: a */
    static /* synthetic */ void m161809a(PluginsController2 eVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        eVar.mo147465c(z);
    }

    /* renamed from: a */
    static /* synthetic */ void m161807a(PluginsController2 eVar, IKeyBoardPlugin bVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        eVar.mo147459a(bVar, z);
    }

    /* renamed from: a */
    static /* synthetic */ void m161808a(PluginsController2 eVar, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m161804a(eVar, (IKeyBoardPlugin) null, 1, (Object) null);
        }
        eVar.m161812a(z, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: java.util.List<? extends kotlin.Pair<? extends com.ss.android.lark.keyboard.plugin.tool.b, java.lang.String>> */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: java.util.List<? extends kotlin.Pair<? extends com.ss.android.lark.keyboard.plugin.input.f, java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public PluginsController2(Activity activity, ViewGroup viewGroup, IKeyBoardDependency cVar, List<? extends Pair<? extends IKeyBoardPlugin, String>> list, List<? extends Pair<? extends IInputSupportPlugin, String>> list2, boolean z) {
        Intrinsics.checkParameterIsNotNull(activity, "mActivity");
        Intrinsics.checkParameterIsNotNull(viewGroup, "mRootContainer");
        Intrinsics.checkParameterIsNotNull(cVar, "keyBoardDependency");
        Intrinsics.checkParameterIsNotNull(list, "mKBPlugins");
        Intrinsics.checkParameterIsNotNull(list2, "mInputPlugins");
        this.f103892m = activity;
        this.f103893n = viewGroup;
        this.f103876G = cVar;
        this.f103877H = list;
        this.f103878I = list2;
        this.f103879J = z;
        this.f103900v = UIUtils.dp2px(activity, 236.0f);
        this.f103901w = UIUtils.dp2px(activity, 260.0f);
        this.f103903y = new ArrayList();
        this.f103886g = new LinkedHashSet();
        this.f103871B = KeyboardScene.UNKNOWN;
        this.f103888i = -1;
        this.f103872C = true;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.kb_keyboard, viewGroup);
        View findViewById = inflate.findViewById(R.id.tool_menu_wrapper);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "keyBoard.findViewById(R.id.tool_menu_wrapper)");
        this.f103894p = (ViewGroup) findViewById;
        View findViewById2 = inflate.findViewById(R.id.tool_menu);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "keyBoard.findViewById(R.id.tool_menu)");
        KBPluginContainerView kBPluginContainerView = (KBPluginContainerView) findViewById2;
        this.f103895q = kBPluginContainerView;
        View findViewById3 = inflate.findViewById(R.id.plugin_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "keyBoard.findViewById(R.id.plugin_container)");
        NestScrollFrameLayout nestScrollFrameLayout = (NestScrollFrameLayout) findViewById3;
        this.f103884e = nestScrollFrameLayout;
        nestScrollFrameLayout.getLayoutParams().height = 0;
        nestScrollFrameLayout.setVisibility(8);
        cVar.mo122095a(nestScrollFrameLayout);
        this.f103896r = (SysKeyBoardObserveFrameLayout) viewGroup.getRootView().findViewWithTag(SysKeyBoardObserveFrameLayout.class);
        View findViewById4 = inflate.findViewById(R.id.input_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "keyBoard.findViewById(R.id.input_container)");
        FrameLayout frameLayout = (FrameLayout) findViewById4;
        this.f103897s = frameLayout;
        View findViewById5 = inflate.findViewById(R.id.toolbar_region);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "keyBoard.findViewById(R.id.toolbar_region)");
        this.f103904z = findViewById5;
        if (this.f103879J) {
            frameLayout.setMinimumHeight(m161801J());
            kBPluginContainerView.setMinimumHeight(UIUtils.dp2px(activity, 44.0f));
        }
        kBPluginContainerView.removeAllViews();
        frameLayout.removeAllViews();
        mo147469f(true);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.btn_send_region);
        Intrinsics.checkExpressionValueIsNotNull(viewGroup2, "btnRegion");
        InputPluginController hVar = new InputPluginController(this, frameLayout, activity, viewGroup2, cVar, CollectionsKt.toMutableList((Collection) list2), this.f103879J);
        this.f103882c = hVar;
        hVar.mo147148a(new IInputSupportPlugin.OnReplyModelChangeListener(this) {
            /* class com.ss.android.lark.keyboard.plugin.tool.PluginsController2.C408581 */

            /* renamed from: a */
            final /* synthetic */ PluginsController2 f103905a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f103905a = r1;
            }

            @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin.OnReplyModelChangeListener
            /* renamed from: a */
            public void mo147128a(boolean z) {
                PluginsController2 eVar = this.f103905a;
                eVar.mo147468e(eVar.mo146835p());
            }
        });
        if (!this.f103879J) {
            m161802K();
        }
        this.f103899u = new IKeyBoardPlugin.ITouchActionNotifier(this) {
            /* class com.ss.android.lark.keyboard.plugin.tool.PluginsController2.C408592 */

            /* renamed from: a */
            final /* synthetic */ PluginsController2 f103906a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f103906a = r1;
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.ITouchActionNotifier
            /* renamed from: b */
            public void mo147314b(IKeyBoardPlugin bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "clicked");
                PluginHitPointUtil.m161652a(bVar, this.f103906a.mo146827h());
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.ITouchActionNotifier
            /* renamed from: a */
            public void mo147313a(IKeyBoardPlugin bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "plugin");
                this.f103906a.mo147459a(bVar, true);
                PluginHitPointUtil.m161652a(bVar, this.f103906a.mo146827h());
            }
        };
        if (!this.f103879J) {
            Iterator<T> it = this.f103880a.iterator();
            while (it.hasNext()) {
                m161819h(it.next());
            }
        }
        this.f103896r.setActivity(this.f103892m);
        this.f103896r.mo148228a(this);
        SysKeyBoardObserveFrameLayout sysKeyBoardObserveFrameLayout = this.f103896r;
        Intrinsics.checkExpressionValueIsNotNull(sysKeyBoardObserveFrameLayout, "sysKeyBoardObserveFrameLayout");
        sysKeyBoardObserveFrameLayout.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f103873D = C40862ac.INSTANCE;
        this.f103874E = C40863ad.INSTANCE;
        this.f103875F = new LinkedList();
    }
}
