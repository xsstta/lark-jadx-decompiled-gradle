package com.ss.android.lark.keyboard.plugin.tool;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
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
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.framework.utils.ak;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.keyboard.C40682g;
import com.ss.android.lark.keyboard.IKeyBoard;
import com.ss.android.lark.keyboard.IKeyBoardDependency;
import com.ss.android.lark.keyboard.IKeyBoardStartedCallback;
import com.ss.android.lark.keyboard.IKeyBoardStatusListener;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.KeyboardScene;
import com.ss.android.lark.keyboard.base.KeyBoardObserveFrameLayout;
import com.ss.android.lark.keyboard.base.NestScrollFrameLayout;
import com.ss.android.lark.keyboard.p2074c.C40680e;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.IOutInputSupport;
import com.ss.android.lark.keyboard.plugin.input.InputPluginController;
import com.ss.android.lark.keyboard.plugin.input.TransationData;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.DesktopFaceKBPlugin;
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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 º\u00012\u00020\u0001:\nº\u0001»\u0001¼\u0001½\u0001¾\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\t\u0012\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n0\t\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0010\u0010H\u001a\u0002092\u0006\u0010I\u001a\u00020\u0010H\u0002J\u0010\u0010J\u001a\u0002092\u0006\u0010K\u001a\u00020LH\u0016J\u0018\u0010M\u001a\u0002092\u0006\u0010N\u001a\u00020\f2\u0006\u0010O\u001a\u00020PH\u0016J \u0010M\u001a\u0002092\u000e\u0010Q\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0R2\u0006\u0010O\u001a\u00020PH\u0016J1\u0010S\u001a\u0002092\"\u0010T\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0R0U\"\n\u0012\u0006\b\u0001\u0012\u00020\u000b0RH\u0016¢\u0006\u0002\u0010VJ\u0010\u0010W\u001a\u00020\u00052\u0006\u0010X\u001a\u00020YH\u0002J\u0010\u0010Z\u001a\u0002092\u0006\u0010[\u001a\u00020\u000bH\u0016J\b\u0010\\\u001a\u000209H\u0016J\u001e\u0010]\u001a\u0002092\u0006\u0010^\u001a\u00020\f2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020908H\u0002J\b\u0010`\u001a\u000209H\u0002J\b\u0010a\u001a\u00020bH\u0016J\n\u0010c\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010d\u001a\u00020&H\u0002J!\u0010e\u001a\u0004\u0018\u0001Hf\"\b\b\u0000\u0010f*\u00020\u000e2\u0006\u0010N\u001a\u00020\fH\u0016¢\u0006\u0002\u0010gJ\b\u0010h\u001a\u00020&H\u0016J\b\u0010i\u001a\u00020\fH\u0016J!\u0010j\u001a\u0004\u0018\u0001Hf\"\b\b\u0000\u0010f*\u00020\u000b2\u0006\u0010N\u001a\u00020\fH\u0016¢\u0006\u0002\u0010kJ\b\u0010l\u001a\u00020\fH\u0016J\u0010\u0010m\u001a\u00020&2\u0006\u0010X\u001a\u00020YH\u0002J\b\u0010n\u001a\u00020DH\u0016J\b\u0010o\u001a\u00020&H\u0002J\u0010\u0010p\u001a\u0002092\u0006\u0010[\u001a\u00020\u000bH\u0002J\b\u0010q\u001a\u000209H\u0016J\b\u0010r\u001a\u000209H\u0016J\b\u0010s\u001a\u000209H\u0016J\u0016\u0010t\u001a\u0002092\f\u0010u\u001a\b\u0012\u0004\u0012\u00020908H\u0002J\b\u0010v\u001a\u000209H\u0016J\u0010\u0010w\u001a\u0002092\u0006\u0010x\u001a\u00020$H\u0002J\u0010\u0010y\u001a\u00020\u00102\u0006\u0010N\u001a\u00020\fH\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010z\u001a\u00020\u0010H\u0016J\b\u0010{\u001a\u00020\u0010H\u0016J\b\u0010|\u001a\u00020\u0010H\u0016J\b\u0010}\u001a\u00020\u0010H\u0016J\u0010\u0010~\u001a\u0002092\u0006\u0010\u001a\u00020\u0010H\u0002J\u0012\u0010\u0001\u001a\u0002092\u0007\u0010\u0001\u001a\u00020\u0010H\u0002J\t\u0010\u0001\u001a\u000209H\u0016J'\u0010\u0001\u001a\u00020\u00102\u0007\u0010\u0001\u001a\u00020&2\u0007\u0010\u0001\u001a\u00020&2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\t\u0010\u0001\u001a\u00020\u0010H\u0016J\t\u0010\u0001\u001a\u000209H\u0016J\u0013\u0010\u0001\u001a\u0002092\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0019\u0010\u0001\u001a\u0002092\u0006\u0010N\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\u000eH\u0016J\u0019\u0010\u0001\u001a\u0002092\u0006\u0010N\u001a\u00020\f2\u0006\u0010[\u001a\u00020\u000bH\u0016J\u0012\u0010\u0001\u001a\u0002092\t\b\u0002\u0010\u0001\u001a\u00020\u0010J\u0012\u0010\u0001\u001a\u0002092\u0007\u0010\u0001\u001a\u00020\fH\u0016J5\u0010\u0001\u001a\u0002092\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\t\u0010\u0001\u001a\u0004\u0018\u00010\f2\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\u0007\u0010\u0001\u001a\u00020\u0010H\u0016J\u0012\u0010\u0001\u001a\u0002092\u0007\u0010\u0001\u001a\u00020=H\u0002J\u0012\u0010\u0001\u001a\u0002092\u0007\u0010\u0001\u001a\u00020\u0010H\u0016J\u0012\u0010\u0001\u001a\u0002092\u0007\u0010\u0001\u001a\u000205H\u0016J\u0012\u0010\u0001\u001a\u0002092\u0007\u0010\u0001\u001a\u00020\u001cH\u0016J\u0012\u0010 \u0001\u001a\u0002092\u0007\u0010¡\u0001\u001a\u00020\u0010H\u0016J\u001b\u0010 \u0001\u001a\u0002092\u0007\u0010\u0001\u001a\u00020\f2\u0007\u0010¡\u0001\u001a\u00020\u0010H\u0016J#\u0010 \u0001\u001a\u0002092\u000f\u0010¢\u0001\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0R2\u0007\u0010¡\u0001\u001a\u00020\u0010H\u0016J\u0013\u0010£\u0001\u001a\u0002092\b\u0010¤\u0001\u001a\u00030¥\u0001H\u0016J\u001b\u0010¦\u0001\u001a\u0002092\u0007\u0010\u0001\u001a\u00020\f2\u0007\u0010§\u0001\u001a\u00020\u0010H\u0016J#\u0010¦\u0001\u001a\u0002092\u000f\u0010¢\u0001\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0R2\u0007\u0010¨\u0001\u001a\u00020\u0010H\u0016J\u0012\u0010©\u0001\u001a\u0002092\u0007\u0010ª\u0001\u001a\u00020DH\u0016J\u0014\u0010«\u0001\u001a\u0002092\t\b\u0001\u0010¬\u0001\u001a\u00020&H\u0016J\t\u0010­\u0001\u001a\u000209H\u0016J\t\u0010®\u0001\u001a\u000209H\u0016J\t\u0010¯\u0001\u001a\u000209H\u0016J(\u0010°\u0001\u001a\u0002092\u001d\u0010±\u0001\u001a\u0018\u0012\r\u0012\u000b\u0012\u0006\b\u0001\u0012\u00020\u000b0³\u0001\u0012\u0004\u0012\u00020&0²\u0001H\u0016J\t\u0010´\u0001\u001a\u000209H\u0016J\u0013\u0010´\u0001\u001a\u0002092\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\t\u0010µ\u0001\u001a\u000209H\u0016J\u0013\u0010¶\u0001\u001a\u0002092\b\u0010\u0001\u001a\u00030\u0001H\u0016J\t\u0010·\u0001\u001a\u000209H\u0016J\u0018\u0010¸\u0001\u001a\u00020\u0010*\u00020\u001e2\t\u0010¹\u0001\u001a\u0004\u0018\u00010=H\u0002R\u000e\u0010\u0012\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n0\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020&X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000b0)X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020&X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002000)X\u0004¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b02X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020908X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020=X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000b02X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010GX\u0004¢\u0006\u0002\n\u0000¨\u0006¿\u0001"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/PluginsController;", "Lcom/ss/android/lark/keyboard/IKeyBoard;", "mActivity", "Landroid/app/Activity;", "mRootContainer", "Landroid/view/ViewGroup;", "keyBoardDependency", "Lcom/ss/android/lark/keyboard/IKeyBoardDependency;", "mKBPlugins", "", "Lkotlin/Pair;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "", "mInputPlugins", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "mRefactorEnable", "", "(Landroid/app/Activity;Landroid/view/ViewGroup;Lcom/ss/android/lark/keyboard/IKeyBoardDependency;Ljava/util/List;Ljava/util/List;Z)V", "enableNewObserverFrameLayout", "isFinishReplyWhenSend", "isKeyBoardShowInner", "mActionQueue", "Ljava/util/Queue;", "Lcom/ss/android/lark/keyboard/plugin/tool/PluginsController$IActionIn;", "mComponentCallback", "Landroid/content/ComponentCallbacks2;", "mCurrPlugin", "mIKeyBoardStatusListener", "Lcom/ss/android/lark/keyboard/IKeyBoardStatusListener;", "mInputContainer", "Landroid/widget/FrameLayout;", "mInputPluginController", "Lcom/ss/android/lark/keyboard/plugin/input/InputPluginController;", "mKBObserverLayout", "Lcom/ss/android/lark/keyboard/base/KeyBoardObserveFrameLayout;", "mKeyBoardContext", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;", "mKeyboardHeight", "", "mMinSysKeyboardHeight", "mNameToInstanceMap", "", "mNewMinSysKeyboardHeight", "mOnGlobalChangeListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "mPluginContainer", "Lcom/ss/android/lark/keyboard/base/NestScrollFrameLayout;", "mPluginInfoMap", "Lcom/ss/android/lark/keyboard/plugin/tool/PluginsController$PluginInfo;", "mPluginInstances", "", "mStarted", "mStartedCallback", "Lcom/ss/android/lark/keyboard/IKeyBoardStartedCallback;", "mSysKeyboardHeight", "mTaskOnHideKeyboard", "Lkotlin/Function0;", "", "mToolMenuLL", "Lcom/ss/android/lark/keyboard/widget/KBPluginContainerView;", "mToolMenuRegion", "Landroid/view/View;", "mTouchActionNotifier", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$ITouchActionNotifier;", "orientation", "orientationChanged", "screenHeight", "sourceScene", "Lcom/ss/android/lark/keyboard/KeyboardScene;", "startedPluginRecorder", "sysKeyBoardObserveFrameLayout", "Lcom/ss/android/lark/keyboard/widget/SysKeyBoardObserveFrameLayout;", "changePluginUseable", "isUseable", "changeToReplyMode", "replyInfo", "Lcom/ss/android/lark/keyboard/KeyBoard$ReplyInfo;", "changeToSpecificInputSupport", "name", "param", "Lcom/ss/android/lark/keyboard/plugin/input/TransationData;", "inputSupport", "Lkotlin/reflect/KClass;", "changeVisiblePlugins", "visibles", "", "([Lkotlin/reflect/KClass;)V", "createIconWrapper", "context", "Landroid/content/Context;", "createPluginPanel", "plugin", "destroy", "doActionWhenReady", "tag", "action", "doActionsInQueue", "getCurrInputSupport", "Lcom/ss/android/lark/keyboard/plugin/input/IOutInputSupport;", "getCurrentKbPluginName", "getInputContainerMinHeight", "getInputPlugin", "T", "(Ljava/lang/String;)Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "getKeyBoardHeight", "getParentMsgId", "getPlugin", "(Ljava/lang/String;)Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "getRootMsgId", "getScreenHeight", "getSourceScene", "getSysKeyBoardHeight", "handlePluginSelected", "hide", "hidePanelAndSysKeyboard", "hideSysKeyBoard", "hideSysKeyboard", "taskAfterHideKeyboard", "hideToolMenu", "initPluginInstances", "keyBoardContext", "isCurrInputSupportSameWith", "isInReplyMode", "isKeyBoardShow", "isSysKeyBoardShow", "isToolBoxShow", "notifyKeyboardChanged", "shown", "notifyReplyModeChanged", "isReplyMode", "notifySend", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "pause", "registerInputPluginChangeListener", "listener", "Lcom/ss/android/lark/keyboard/plugin/input/InputPluginController$InputSupportPluginChangeListener;", "registerInputSupport", "registerKBPlugin", "removeAllPluginViews", "removeGone", "selectPlugin", "pluginName", "setDraftText", "messageRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "title", "richText", "append", "setIconTouchDelegate", "v", "setIsFinishReplyWhenSend", "isFinishReply", "setKeyBoardStartedCallback", "callback", "setKeyBoardStatusListener", "setPluginEnable", "isEnable", "pluginChanged", "setPluginLayoutManager", "pluginLayoutManager", "Lcom/ss/android/lark/keyboard/widget/IPluginLayoutManager;", "setPluginVisible", "isVisiable", "isVisible", "setSourceScene", "scene", "setToolbarRegionColorRes", "colorRes", "show", "showSysKeyBoard", "showToolMenu", "sortKBPlugin", "orderMap", "", "Ljava/lang/Class;", "start", "stop", "unRegisterInputPluginChangeListener", "unSelectedCurrPlugin", "contain", "view", "Companion", "IActionIn", "KeyBoardContextImpl", "KeyBoardOnGlobalChangeListener", "PluginInfo", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.d */
public final class PluginsController implements IKeyBoard {

    /* renamed from: y */
    public static final Companion f103811y = new Companion(null);

    /* renamed from: A */
    private final KeyBoardObserveFrameLayout f103812A;

    /* renamed from: B */
    private final SysKeyBoardObserveFrameLayout f103813B;

    /* renamed from: C */
    private final FrameLayout f103814C;

    /* renamed from: D */
    private IKeyBoardPlugin.IKeyBoardContext f103815D;

    /* renamed from: E */
    private final IKeyBoardPlugin.ITouchActionNotifier f103816E;

    /* renamed from: F */
    private final int f103817F;

    /* renamed from: G */
    private final int f103818G;

    /* renamed from: H */
    private final boolean f103819H;

    /* renamed from: I */
    private final Queue<IActionIn> f103820I;

    /* renamed from: J */
    private final IKeyBoardDependency f103821J;

    /* renamed from: K */
    private final List<Pair<IKeyBoardPlugin, String>> f103822K;

    /* renamed from: L */
    private final List<Pair<IInputSupportPlugin, String>> f103823L;

    /* renamed from: M */
    private boolean f103824M;

    /* renamed from: a */
    public List<IKeyBoardPlugin> f103825a = new ArrayList();

    /* renamed from: b */
    public Map<String, IKeyBoardPlugin> f103826b = new HashMap();

    /* renamed from: c */
    public final NestScrollFrameLayout f103827c;

    /* renamed from: d */
    public final View f103828d;

    /* renamed from: e */
    public ViewTreeObserver.OnGlobalLayoutListener f103829e;

    /* renamed from: f */
    public final InputPluginController f103830f;

    /* renamed from: g */
    public final Map<IKeyBoardPlugin, PluginInfo> f103831g = new HashMap();

    /* renamed from: h */
    public ComponentCallbacks2 f103832h;

    /* renamed from: i */
    public boolean f103833i;

    /* renamed from: j */
    public KeyboardScene f103834j;

    /* renamed from: k */
    public boolean f103835k;

    /* renamed from: l */
    public IKeyBoardPlugin f103836l;

    /* renamed from: m */
    public final List<IKeyBoardPlugin> f103837m;

    /* renamed from: n */
    public Function0<Unit> f103838n;

    /* renamed from: o */
    public int f103839o;

    /* renamed from: p */
    public int f103840p;

    /* renamed from: q */
    public int f103841q;

    /* renamed from: r */
    public int f103842r;

    /* renamed from: s */
    public IKeyBoardStatusListener f103843s;

    /* renamed from: t */
    public boolean f103844t;

    /* renamed from: u */
    public IKeyBoardStartedCallback f103845u;

    /* renamed from: v */
    public boolean f103846v;

    /* renamed from: w */
    public final Activity f103847w;

    /* renamed from: x */
    public final ViewGroup f103848x;

    /* renamed from: z */
    private final KBPluginContainerView f103849z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/PluginsController$IActionIn;", "", "doAction", "", "tag", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$b */
    public interface IActionIn {
        /* renamed from: a */
        void mo147446a();

        /* renamed from: b */
        String mo147447b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$n */
    static final class C40843n extends Lambda implements Function0<Unit> {
        public static final C40843n INSTANCE = new C40843n();

        C40843n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/PluginsController$Companion;", "", "()V", "TAG", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016J\u0016\u0010\u0018\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016J\b\u0010\u001d\u001a\u00020\bH\u0016J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\bH\u0016J\u0016\u0010)\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0016J\"\u0010*\u001a\u00020\b2\u000e\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0,2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0010\u00100\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u00101\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/PluginsController$KeyBoardContextImpl;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;", "mInputPluginController", "Lcom/ss/android/lark/keyboard/plugin/input/InputPluginController;", "mActivity", "Landroid/app/Activity;", "(Lcom/ss/android/lark/keyboard/plugin/tool/PluginsController;Lcom/ss/android/lark/keyboard/plugin/input/InputPluginController;Landroid/app/Activity;)V", "clearPluginPanelContainer", "", "getActivity", "getInputHeight", "", "getKeyBoardInputSupport", "Lcom/ss/android/lark/keyboard/plugin/input/IOutInputSupport;", "getMenuHeight", "getParentMsgId", "", "getRootMsgId", "getSourceScene", "Lcom/ss/android/lark/keyboard/KeyboardScene;", "getToolPanelHeight", "hasKeyBoardInputSupport", "", "hideSysKeyBoard", "hideSysKeyboardAndRun", "action", "Lkotlin/Function0;", "isSysKeyBoardShow", "isToolPanelShow", "notifySend", "registerInputPluginChangeListener", "listener", "Lcom/ss/android/lark/keyboard/plugin/input/InputPluginController$InputSupportPluginChangeListener;", "selectPluginWithNoPanel", "plugin", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "selectPluginWithPanel", "setEditorWatcher", "textWatcher", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext$ITextWatcher;", "showSysKeyBoard", "showSysKeyboardAndRun", "startInputSupportPlugin", "inputSupportPlugin", "Lkotlin/reflect/KClass;", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "param", "Lcom/ss/android/lark/keyboard/plugin/input/TransationData;", "unRegisterInputPluginChangeListener", "unSelectedCurrPlugin", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$c */
    public final class KeyBoardContextImpl implements IKeyBoardPlugin.IKeyBoardContext {

        /* renamed from: a */
        final /* synthetic */ PluginsController f103853a;

        /* renamed from: b */
        private final InputPluginController f103854b;

        /* renamed from: c */
        private final Activity f103855c;

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
        /* renamed from: b */
        public void mo147373b(IKeyBoardPlugin bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "plugin");
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
        /* renamed from: B */
        public Activity mo147365B() {
            return this.f103855c;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
        /* renamed from: A */
        public boolean mo147364A() {
            return this.f103854b.mo147164j();
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
        /* renamed from: b */
        public KeyboardScene mo147372b() {
            return this.f103853a.f103834j;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
        /* renamed from: d */
        public boolean mo147374d() {
            return this.f103853a.f103835k;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
        /* renamed from: q */
        public String mo147377q() {
            return this.f103854b.mo147167m();
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
        /* renamed from: r */
        public String mo147378r() {
            return this.f103854b.mo147168n();
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
        /* renamed from: z */
        public IOutInputSupport mo147381z() {
            return this.f103854b.mo147163i();
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
        /* renamed from: C */
        public int mo147366C() {
            return this.f103853a.f103828d.getHeight();
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
        /* renamed from: D */
        public int mo147367D() {
            return this.f103853a.f103827c.getHeight();
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
        /* renamed from: E */
        public int mo147368E() {
            return this.f103854b.mo147163i().mo146906n();
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
        /* renamed from: F */
        public boolean mo147369F() {
            if (this.f103853a.f103836l != null) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
        /* renamed from: j */
        public void mo147375j() {
            if (!this.f103853a.f103835k) {
                KeyboardUtils.showKeyboard(this.f103855c);
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
        /* renamed from: k */
        public void mo147376k() {
            if (this.f103853a.f103835k) {
                KeyboardUtils.hideKeyboard(this.f103855c);
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
        /* renamed from: v */
        public void mo147379v() {
            if (this.f103853a.f103846v) {
                this.f103854b.mo147118a();
                this.f103853a.mo147440d(false);
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
        /* renamed from: y */
        public void mo147380y() {
            if (this.f103853a.f103836l != null) {
                PluginsController dVar = this.f103853a;
                IKeyBoardPlugin bVar = dVar.f103836l;
                if (bVar == null) {
                    Intrinsics.throwNpe();
                }
                dVar.mo147438b(bVar);
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
        /* renamed from: a */
        public void mo147370a(IKeyBoardPlugin.IKeyBoardContext.ITextWatcher aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "textWatcher");
            this.f103854b.mo147151a(aVar);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext
        /* renamed from: a */
        public void mo147371a(KClass<? extends IInputSupportPlugin> kClass, TransationData jVar) {
            Intrinsics.checkParameterIsNotNull(kClass, "inputSupportPlugin");
            InputPluginController hVar = this.f103854b;
            IOutInputSupport i = hVar.mo147163i();
            if (!(i instanceof IInputSupportPlugin)) {
                i = null;
            }
            hVar.mo147121a(kClass, (IInputSupportPlugin) i, jVar);
        }

        public KeyBoardContextImpl(PluginsController dVar, InputPluginController hVar, Activity activity) {
            Intrinsics.checkParameterIsNotNull(hVar, "mInputPluginController");
            Intrinsics.checkParameterIsNotNull(activity, "mActivity");
            this.f103853a = dVar;
            this.f103854b = hVar;
            this.f103855c = activity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/PluginsController$PluginInfo;", "", "()V", "icon", "Landroid/view/View;", "getIcon", "()Landroid/view/View;", "setIcon", "(Landroid/view/View;)V", "panel", "getPanel", "setPanel", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$e */
    public static final class PluginInfo {

        /* renamed from: a */
        private View f103859a;

        /* renamed from: b */
        private View f103860b;

        /* renamed from: a */
        public final View mo147449a() {
            return this.f103859a;
        }

        /* renamed from: b */
        public final View mo147451b() {
            return this.f103860b;
        }

        /* renamed from: a */
        public final void mo147450a(View view) {
            this.f103859a = view;
        }

        /* renamed from: b */
        public final void mo147452b(View view) {
            this.f103860b = view;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/PluginsController$doActionWhenReady$1", "Lcom/ss/android/lark/keyboard/plugin/tool/PluginsController$IActionIn;", "doAction", "", "tag", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$i */
    public static final class C40836i implements IActionIn {

        /* renamed from: a */
        final /* synthetic */ Function0 f103861a;

        /* renamed from: b */
        final /* synthetic */ String f103862b;

        @Override // com.ss.android.lark.keyboard.plugin.tool.PluginsController.IActionIn
        /* renamed from: b */
        public String mo147447b() {
            return this.f103862b;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.PluginsController.IActionIn
        /* renamed from: a */
        public void mo147446a() {
            this.f103861a.invoke();
        }

        C40836i(Function0 function0, String str) {
            this.f103861a = function0;
            this.f103862b = str;
        }
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: b */
    public KeyboardScene mo146813b() {
        return this.f103834j;
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: d */
    public boolean mo146822d() {
        return this.f103835k;
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: i */
    public boolean mo146828i() {
        return this.f103835k;
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: u */
    public boolean mo146840u() {
        return this.f103846v;
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146803a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        IKeyBoard.C40674a.m160760a(this, str);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146811a(KClass<? extends IKeyBoardPlugin>... kClassArr) {
        Intrinsics.checkParameterIsNotNull(kClassArr, "visibles");
        for (T t : this.f103825a) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(t.getClass());
            PluginInfo eVar = this.f103831g.get(t);
            if (eVar == null) {
                Intrinsics.throwNpe();
            }
            View b = eVar.mo147451b();
            if (b != null) {
                b.setVisibility(C69043h.m265767b(kClassArr, orCreateKotlinClass) ? 0 : 8);
            }
            t.mo147295b(C69043h.m265767b(kClassArr, orCreateKotlinClass));
        }
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146809a(KClass<? extends IKeyBoardPlugin> kClass, boolean z) {
        Intrinsics.checkParameterIsNotNull(kClass, "pluginChanged");
        m161695a("setPluginEnable[ " + C69113a.m265954a((KClass) kClass).getSimpleName() + " : " + z, new C40847r(this, kClass, z));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146807a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "pluginName");
        m161695a("setPluginEnable[ " + str + " : " + z, new C40848s(this, str, z));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146810a(boolean z) {
        m161695a("setPluginEnable[ " + z, new C40849t(this, z));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146800a(IKeyBoardPlugin bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "plugin");
        PluginInfo eVar = this.f103831g.get(bVar);
        if (eVar != null && eVar.mo147449a() == null) {
            eVar.mo147450a(bVar.mo147287a(this.f103827c));
        }
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146801a(IPluginLayoutManager eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "pluginLayoutManager");
        this.f103849z.setPluginLayoutManager(eVar);
    }

    /* renamed from: a */
    public final void mo147436a(Function0<Unit> function0) {
        if (!this.f103835k) {
            Log.m165389i("keyboard", "hideSysKeyboard()，keyboard is not shown");
            function0.invoke();
            return;
        }
        Log.m165389i("keyboard", "hideSysKeyboard()，keyboard is shown ，hide keyboard first");
        this.f103838n = function0;
        KeyboardUtils.hideKeyboard(this.f103847w);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146805a(String str, TransationData jVar) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(jVar, "param");
        m161695a("changeToSpecificInputSupport[ " + str + " , " + jVar, new C40834g(this, str, jVar));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146802a(RichText richText, String str, RichText richText2, boolean z) {
        m161695a("setDraftText", new C40846q(this, richText, str, richText2, z));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146806a(String str, IKeyBoardPlugin bVar) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(bVar, "plugin");
        this.f103825a.add(bVar);
        this.f103831g.put(bVar, new PluginInfo());
        this.f103826b.put(str, bVar);
        if (!this.f103824M) {
            bVar.mo147290a(this.f103815D);
            bVar.mo147294b(this.f103827c);
            Context context = this.f103849z.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "mToolMenuLL.context");
            ViewGroup b = m161696b(context);
            View a = bVar.mo147288a(b, this.f103816E);
            if (a != null) {
                b.addView(a);
                this.f103849z.addView(b);
            }
            PluginInfo eVar = this.f103831g.get(bVar);
            if (eVar == null) {
                Intrinsics.throwNpe();
            }
            eVar.mo147452b(b);
        }
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146804a(String str, IInputSupportPlugin fVar) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(fVar, "inputSupport");
        this.f103830f.mo147156a(TuplesKt.to(fVar, str));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146808a(Map<Class<? extends IKeyBoardPlugin>, Integer> map) {
        Intrinsics.checkParameterIsNotNull(map, "orderMap");
        List<IKeyBoardPlugin> list = this.f103825a;
        if (list.size() > 1) {
            CollectionsKt.sortWith(list, new C40853x(map));
        }
        if (!this.f103824M) {
            this.f103849z.removeAllViews();
            for (T t : this.f103825a) {
                Context context = this.f103849z.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "mToolMenuLL.context");
                ViewGroup b = m161696b(context);
                View a = t.mo147288a(b, this.f103816E);
                if (a != null) {
                    b.addView(a);
                    this.f103849z.addView(b);
                    m161692a(a);
                }
                PluginInfo eVar = this.f103831g.get(t);
                if (eVar == null) {
                    Intrinsics.throwNpe();
                }
                eVar.mo147452b(b);
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146799a(TransationData jVar) {
        if (this.f103824M) {
            m161693a(this.f103815D);
            this.f103849z.removeAllViews();
            for (T t : this.f103825a) {
                t.mo147290a(this.f103815D);
                t.mo147294b(this.f103827c);
                Context context = this.f103849z.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "mToolMenuLL.context");
                ViewGroup b = m161696b(context);
                View a = t.mo147288a(b, this.f103816E);
                if (a != null) {
                    b.addView(a);
                    this.f103849z.addView(b);
                    m161692a(a);
                }
                PluginInfo eVar = this.f103831g.get(t);
                if (eVar == null) {
                    Intrinsics.throwNpe();
                }
                eVar.mo147452b(b);
            }
        }
        this.f103830f.mo147150a(jVar);
        this.f103844t = true;
        if (this.f103824M) {
            Log.m165389i("keyboard", "life start");
            m161691A();
        }
        this.f103828d.post(new RunnableC40854y(this));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public boolean mo146812a(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null) {
            if (!this.f103824M || this.f103844t) {
                Iterator<T> it = this.f103825a.iterator();
                while (it.hasNext()) {
                    if (it.next().mo147292a(i, intent)) {
                        return true;
                    }
                }
            } else {
                this.f103830f.mo147153a(new RunnableC40844o(this, i, intent));
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo147437a(FrameLayout frameLayout, View view) {
        int childCount = frameLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (frameLayout.getChildAt(i) == view) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: h */
    public IOutInputSupport mo146827h() {
        return this.f103830f.mo147163i();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: p */
    public boolean mo146835p() {
        return this.f103830f.mo147166l();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: q */
    public String mo146836q() {
        return this.f103830f.mo147167m();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: r */
    public String mo146837r() {
        return this.f103830f.mo147168n();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: v */
    public void mo146841v() {
        this.f103815D.mo147379v();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: w */
    public void mo146842w() {
        mo146799a((TransationData) null);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: x */
    public void mo146843x() {
        this.f103830f.mo147169o();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: y */
    public void mo146844y() {
        this.f103815D.mo147380y();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$g */
    static final class C40834g extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $name;
        final /* synthetic */ TransationData $param;
        final /* synthetic */ PluginsController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40834g(PluginsController dVar, String str, TransationData jVar) {
            super(0);
            this.this$0 = dVar;
            this.$name = str;
            this.$param = jVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.f103830f.mo147154a(this.$name, this.$param);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$l */
    public static final class C40839l extends Lambda implements Function0<Unit> {
        final /* synthetic */ PluginsController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40839l(PluginsController dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo147436a(new Function0<Unit>(this) {
                /* class com.ss.android.lark.keyboard.plugin.tool.PluginsController.C40839l.C408401 */
                final /* synthetic */ C40839l this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    if (this.this$0.this$0.f103836l != null) {
                        IKeyBoardPlugin bVar = this.this$0.this$0.f103836l;
                        if (bVar != null) {
                            bVar.mo147305i();
                        }
                        PluginsController.m161694a(this.this$0.this$0, false, 1, (Object) null);
                        this.this$0.this$0.f103836l = null;
                        NestScrollFrameLayout nestScrollFrameLayout = this.this$0.this$0.f103827c;
                        nestScrollFrameLayout.getLayoutParams().height = 0;
                        nestScrollFrameLayout.setVisibility(8);
                        IKeyBoardStatusListener eVar = this.this$0.this$0.f103843s;
                        if (eVar != null) {
                            eVar.mo122009a(false, this.this$0.this$0.mo146825f(), this.this$0.this$0.mo146837r());
                        }
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$q */
    static final class C40846q extends Lambda implements Function0<Unit> {
        final /* synthetic */ boolean $append;
        final /* synthetic */ RichText $messageRichText;
        final /* synthetic */ RichText $richText;
        final /* synthetic */ String $title;
        final /* synthetic */ PluginsController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40846q(PluginsController dVar, RichText richText, String str, RichText richText2, boolean z) {
            super(0);
            this.this$0 = dVar;
            this.$messageRichText = richText;
            this.$title = str;
            this.$richText = richText2;
            this.$append = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.f103830f.mo147152a(this.$messageRichText, this.$title, this.$richText, this.$append);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$z */
    static final class C40855z extends Lambda implements Function0<Unit> {
        final /* synthetic */ PluginsController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40855z(PluginsController dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            Log.m165389i("keyboard", "life stop impl");
            this.this$0.f103830f.mo147161g();
        }
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: j */
    public void mo146829j() {
        m161695a("showSysKeyBoard", new C40852w(this));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: n */
    public void mo146833n() {
        m161695a("hide", new C40838k(this));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: o */
    public void mo146834o() {
        m161695a("show", new C40851v(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$k */
    static final class C40838k extends Lambda implements Function0<Unit> {
        final /* synthetic */ PluginsController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40838k(PluginsController dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.f103848x.setVisibility(8);
            IKeyBoardStatusListener eVar = this.this$0.f103843s;
            if (eVar != null) {
                eVar.mo122008a(this.this$0.mo146825f());
            }
            this.this$0.mo147439c(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$o */
    static final class RunnableC40844o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PluginsController f103864a;

        /* renamed from: b */
        final /* synthetic */ int f103865b;

        /* renamed from: c */
        final /* synthetic */ Intent f103866c;

        RunnableC40844o(PluginsController dVar, int i, Intent intent) {
            this.f103864a = dVar;
            this.f103865b = i;
            this.f103866c = intent;
        }

        public final void run() {
            Iterator<T> it = this.f103864a.f103825a.iterator();
            while (it.hasNext()) {
                it.next().mo147292a(this.f103865b, this.f103866c);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$s */
    static final class C40848s extends Lambda implements Function0<Unit> {
        final /* synthetic */ boolean $isEnable;
        final /* synthetic */ String $pluginName;
        final /* synthetic */ PluginsController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40848s(PluginsController dVar, String str, boolean z) {
            super(0);
            this.this$0 = dVar;
            this.$pluginName = str;
            this.$isEnable = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            IKeyBoardPlugin bVar = this.this$0.f103826b.get(this.$pluginName);
            if (bVar != null) {
                bVar.mo147291a(this.$isEnable);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$v */
    static final class C40851v extends Lambda implements Function0<Unit> {
        final /* synthetic */ PluginsController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40851v(PluginsController dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.f103848x.setVisibility(0);
            IKeyBoardStatusListener eVar = this.this$0.f103843s;
            if (eVar != null) {
                eVar.mo122008a(this.this$0.mo146825f());
            }
            this.this$0.mo147439c(true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$w */
    public static final class C40852w extends Lambda implements Function0<Unit> {
        final /* synthetic */ PluginsController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40852w(PluginsController dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            if (!this.this$0.f103835k) {
                KeyboardUtils.showKeyboard(this.this$0.f103830f.mo147163i().mo146904l());
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: c */
    public void mo146820c() {
        m161695a("hidePanelAndSysKeyBoard", new C40839l(this));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: k */
    public void mo146830k() {
        if (this.f103835k) {
            KeyboardUtils.hideKeyboard(this.f103847w, this.f103830f.mo147163i().mo146904l());
        }
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: s */
    public void mo146838s() {
        Log.m165389i("keyboard", "life destroy");
        m161695a("destroy", new C40835h(this));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: t */
    public void mo146839t() {
        Log.m165389i("keyboard", "life stop");
        m161695a("stop", new C40855z(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$f */
    static final class C40833f extends Lambda implements Function0<Unit> {
        final /* synthetic */ KeyBoard.ReplyInfo $replyInfo;
        final /* synthetic */ PluginsController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40833f(PluginsController dVar, KeyBoard.ReplyInfo bVar) {
            super(0);
            this.this$0 = dVar;
            this.$replyInfo = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            KeyBoard.ReplyInfo bVar = this.$replyInfo;
            this.this$0.f103830f.mo147155a(bVar.mo146868a(), bVar.mo146869b(), bVar.mo146870c(), bVar.mo146871d(), bVar.mo146872e(), bVar.mo146873f());
            IKeyBoardStatusListener eVar = this.this$0.f103843s;
            if (eVar != null) {
                eVar.mo122009a(this.this$0.f103835k, this.this$0.mo146825f(), this.this$0.mo146837r());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$p */
    static final class C40845p extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $pluginName;
        final /* synthetic */ PluginsController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40845p(PluginsController dVar, String str) {
            super(0);
            this.this$0 = dVar;
            this.$pluginName = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            IKeyBoardPlugin bVar = this.this$0.f103826b.get(this.$pluginName);
            if (bVar != null) {
                this.this$0.mo147438b(bVar);
                return;
            }
            Log.m165396w("select plugin is not register : " + this.$pluginName);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$r */
    static final class C40847r extends Lambda implements Function0<Unit> {
        final /* synthetic */ boolean $isEnable;
        final /* synthetic */ KClass $pluginChanged;
        final /* synthetic */ PluginsController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40847r(PluginsController dVar, KClass kClass, boolean z) {
            super(0);
            this.this$0 = dVar;
            this.$pluginChanged = kClass;
            this.$isEnable = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            for (T t : this.this$0.f103825a) {
                if (Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(t.getClass()), this.$pluginChanged)) {
                    t.mo147291a(this.$isEnable);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$t */
    static final class C40849t extends Lambda implements Function0<Unit> {
        final /* synthetic */ boolean $isEnable;
        final /* synthetic */ PluginsController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40849t(PluginsController dVar, boolean z) {
            super(0);
            this.this$0 = dVar;
            this.$isEnable = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            for (Map.Entry<String, IKeyBoardPlugin> entry : this.this$0.f103826b.entrySet()) {
                entry.getValue().mo147291a(this.$isEnable);
            }
            this.this$0.f103830f.mo147157a(this.$isEnable);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$u */
    static final class C40850u extends Lambda implements Function0<Unit> {
        final /* synthetic */ boolean $isVisiable;
        final /* synthetic */ String $pluginName;
        final /* synthetic */ PluginsController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40850u(PluginsController dVar, String str, boolean z) {
            super(0);
            this.this$0 = dVar;
            this.$pluginName = str;
            this.$isVisiable = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            int i;
            IKeyBoardPlugin bVar = this.this$0.f103826b.get(this.$pluginName);
            if (bVar != null) {
                PluginInfo eVar = this.this$0.f103831g.get(bVar);
                if (eVar == null) {
                    Intrinsics.throwNpe();
                }
                View b = eVar.mo147451b();
                if (b != null) {
                    if (this.$isVisiable) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    b.setVisibility(i);
                }
                bVar.mo147295b(this.$isVisiable);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$y */
    public static final class RunnableC40854y implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PluginsController f103868a;

        RunnableC40854y(PluginsController dVar) {
            this.f103868a = dVar;
        }

        public final void run() {
            IKeyBoardStartedCallback dVar = this.f103868a.f103845u;
            if (dVar != null) {
                int f = this.f103868a.mo146825f();
                Log.m165378d("mStartedCallback?.onStarted(" + f + ')');
                dVar.mo146866a(f);
            }
        }
    }

    /* renamed from: A */
    private final void m161691A() {
        while (!this.f103820I.isEmpty()) {
            IActionIn poll = this.f103820I.poll();
            poll.mo147446a();
            Log.m165389i("keyboard", "doActionsInQueue : tag " + poll.mo147447b());
        }
    }

    /* renamed from: z */
    private final int m161697z() {
        EditText editText = new EditText(this.f103847w);
        editText.setTextSize(16.0f);
        editText.measure(View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
        return Math.max(editText.getMeasuredHeight(), UIUtils.dp2px(this.f103847w, 22.0f)) + UIUtils.dp2px(this.f103847w, 0.5f);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: l */
    public void mo146831l() {
        this.f103828d.setVisibility(8);
        ViewGroup viewGroup = this.f103848x;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = UIHelper.dp2px(8.0f);
            viewGroup.setLayoutParams(marginLayoutParams);
            this.f103848x.requestLayout();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: m */
    public void mo146832m() {
        this.f103828d.setVisibility(0);
        ViewGroup viewGroup = this.f103848x;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = UIHelper.dp2px(BitmapDescriptorFactory.HUE_RED);
            viewGroup.setLayoutParams(marginLayoutParams);
            this.f103848x.requestLayout();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$h */
    static final class C40835h extends Lambda implements Function0<Unit> {
        final /* synthetic */ PluginsController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40835h(PluginsController dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            Log.m165389i("keyboard", "life destroy impl");
            this.this$0.f103830f.mo147162h();
            Iterator<T> it = this.this$0.f103825a.iterator();
            while (it.hasNext()) {
                it.next().mo147306j();
            }
            this.this$0.mo147442f(true);
            Window window = this.this$0.f103847w.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "mActivity.window");
            View decorView = window.getDecorView();
            Intrinsics.checkExpressionValueIsNotNull(decorView, "mActivity.window.decorView");
            decorView.getViewTreeObserver().removeOnGlobalLayoutListener(this.this$0.f103829e);
            ComponentCallbacks2 componentCallbacks2 = this.this$0.f103832h;
            if (componentCallbacks2 != null) {
                this.this$0.f103847w.unregisterComponentCallbacks(componentCallbacks2);
            }
            this.this$0.f103832h = null;
            this.this$0.f103845u = null;
            this.this$0.f103844t = false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/PluginsController$keyBoardListener$1", "Lcom/ss/android/lark/keyboard/base/KeyBoardObserveFrameLayout$IOnKeyBoardListener;", "onKeyBoardHide", "", "onKeyBoardShow", "heightDiff", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$m */
    public static final class C40841m implements KeyBoardObserveFrameLayout.IOnKeyBoardListener {

        /* renamed from: a */
        final /* synthetic */ PluginsController f103863a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$m$a */
        static final class C40842a extends Lambda implements Function0<Unit> {
            public static final C40842a INSTANCE = new C40842a();

            C40842a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
            }
        }

        @Override // com.ss.android.lark.keyboard.base.KeyBoardObserveFrameLayout.IOnKeyBoardListener
        /* renamed from: a */
        public void mo129626a() {
            Log.m165389i("keyboard", "onKeyBoardHide(), before isKeyBoardShow=" + this.f103863a.f103835k + ", mCurrPlugin=" + this.f103863a.f103836l);
            if (this.f103863a.f103835k) {
                this.f103863a.f103835k = false;
                IKeyBoardStatusListener eVar = this.f103863a.f103843s;
                if (eVar != null) {
                    eVar.mo122009a(false, this.f103863a.mo146825f(), this.f103863a.mo146837r());
                }
                this.f103863a.f103838n.invoke();
                this.f103863a.f103838n = C40842a.INSTANCE;
                this.f103863a.mo147441e(false);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40841m(PluginsController dVar) {
            this.f103863a = dVar;
        }

        @Override // com.ss.android.lark.keyboard.base.KeyBoardObserveFrameLayout.IOnKeyBoardListener
        /* renamed from: a */
        public void mo129627a(int i) {
            Log.m165389i("keyboard", "onKeyBoardShow(), before isKeyBoardShow=" + this.f103863a.f103835k + ", mCurrPlugin=" + this.f103863a.f103836l);
            if (!this.f103863a.f103835k) {
                this.f103863a.f103835k = true;
                IKeyBoardStatusListener eVar = this.f103863a.f103843s;
                if (eVar != null) {
                    eVar.mo122009a(true, this.f103863a.mo146825f(), this.f103863a.mo146837r());
                }
                if (this.f103863a.f103836l != null) {
                    Log.m165389i("keyboard", "onKeyBoardShow(), handlePluginSelected, mCurrPlugin=" + this.f103863a.f103836l);
                    PluginsController dVar = this.f103863a;
                    IKeyBoardPlugin bVar = dVar.f103836l;
                    if (bVar == null) {
                        Intrinsics.throwNpe();
                    }
                    dVar.mo147438b(bVar);
                }
                this.f103863a.mo147441e(true);
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: e */
    public boolean mo146824e() {
        IKeyBoardPlugin bVar = this.f103836l;
        if (bVar != null) {
            if (bVar == null) {
                Intrinsics.throwNpe();
            }
            if (bVar.mo147307k()) {
                return true;
            }
            IKeyBoardPlugin bVar2 = this.f103836l;
            if (bVar2 == null) {
                Intrinsics.throwNpe();
            }
            mo147438b(bVar2);
            return true;
        } else if (this.f103830f.mo147165k()) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: f */
    public int mo146825f() {
        if (this.f103848x.getVisibility() == 8) {
            Log.m165379d("onLayoutHeightChanged", "mRootContainer is gone");
            return 0;
        }
        int n = mo146827h().mo146906n() + this.f103828d.getHeight();
        if (this.f103836l != null) {
            int i = this.f103839o;
            if (i == 0) {
                i = mo147434a();
            }
            n += i;
        }
        Log.m165379d("onLayoutHeightChanged", "mInputContainer height = " + this.f103814C.getHeight());
        return n;
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: g */
    public String mo146826g() {
        if (this.f103836l == null) {
            return null;
        }
        Map<String, IKeyBoardPlugin> map = this.f103826b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, IKeyBoardPlugin> entry : map.entrySet()) {
            Class<?> cls = entry.getValue().getClass();
            IKeyBoardPlugin bVar = this.f103836l;
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

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$j */
    public static final class C40837j extends Lambda implements Function0<Unit> {
        final /* synthetic */ IKeyBoardPlugin $plugin;
        final /* synthetic */ PluginsController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40837j(PluginsController dVar, IKeyBoardPlugin bVar) {
            super(0);
            this.this$0 = dVar;
            this.$plugin = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            int i;
            IKeyBoardPlugin bVar = this.this$0.f103836l;
            if (bVar != null) {
                bVar.mo147305i();
            }
            PluginsController.m161694a(this.this$0, false, 1, (Object) null);
            if (this.$plugin instanceof DesktopFaceKBPlugin) {
                PluginInfo eVar = this.this$0.f103831g.get(this.$plugin);
                if (eVar == null) {
                    Intrinsics.throwNpe();
                }
                View b = eVar.mo147451b();
                if (b != null) {
                    b.performClick();
                    return;
                }
                return;
            }
            PluginInfo eVar2 = this.this$0.f103831g.get(this.$plugin);
            if (eVar2 == null) {
                Intrinsics.throwNpe();
            }
            View a = eVar2.mo147449a();
            if (a == null) {
                a = this.$plugin.mo147287a(this.this$0.f103827c);
                PluginInfo eVar3 = this.this$0.f103831g.get(this.$plugin);
                if (eVar3 == null) {
                    Intrinsics.throwNpe();
                }
                eVar3.mo147450a(a);
            }
            if (a != null) {
                PluginsController dVar = this.this$0;
                if (!dVar.mo147437a(dVar.f103827c, a)) {
                    this.this$0.f103827c.addView(a);
                }
                NestScrollFrameLayout nestScrollFrameLayout = this.this$0.f103827c;
                ViewGroup.LayoutParams layoutParams = nestScrollFrameLayout.getLayoutParams();
                if (this.this$0.f103839o != 0) {
                    i = this.this$0.f103839o;
                } else {
                    i = this.this$0.mo147434a();
                }
                layoutParams.height = i;
                nestScrollFrameLayout.setVisibility(0);
            }
            if (!this.this$0.f103837m.contains(this.$plugin)) {
                this.this$0.f103837m.add(this.$plugin);
                this.$plugin.mo147303g();
            } else {
                this.$plugin.mo147304h();
            }
            this.this$0.f103836l = this.$plugin;
            IKeyBoardStatusListener eVar4 = this.this$0.f103843s;
            if (eVar4 != null) {
                eVar4.mo122009a(true, this.this$0.mo146825f(), this.this$0.mo146837r());
            }
        }
    }

    /* renamed from: a */
    public final int mo147434a() {
        if (!DesktopUtil.m144307b()) {
            int i = this.f103840p;
            if (i == 0) {
                return this.f103818G;
            }
            return i;
        }
        int keyboardHeight = KeyboardUtils.getKeyboardHeight(this.f103847w);
        int i2 = this.f103817F;
        return keyboardHeight < i2 ? i2 : keyboardHeight;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/PluginsController$KeyBoardOnGlobalChangeListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "(Lcom/ss/android/lark/keyboard/plugin/tool/PluginsController;)V", "preHeigth", "", "preWindowHeight", "onGlobalLayout", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$d */
    private final class KeyBoardOnGlobalChangeListener implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        private int f103857b = -1;

        /* renamed from: c */
        private int f103858c;

        public void onGlobalLayout() {
            Rect rect = new Rect();
            if (PluginsController.this.f103833i) {
                PluginsController dVar = PluginsController.this;
                int a = dVar.mo147435a(dVar.f103847w);
                if (a != PluginsController.this.f103841q) {
                    Log.m165379d("keyboard", "configuration change screen height = " + a);
                    PluginsController.this.f103841q = a;
                    PluginsController.this.f103833i = false;
                }
            }
            Window window = PluginsController.this.f103847w.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "mActivity.window");
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            if (DesktopUtil.m144301a((Context) PluginsController.this.f103847w)) {
                PluginsController dVar2 = PluginsController.this;
                dVar2.f103841q = DeviceUtils.getScreenHeight(dVar2.f103847w);
            }
            int i = PluginsController.this.f103841q - rect.bottom;
            PluginsController dVar3 = PluginsController.this;
            dVar3.f103835k = C40680e.m160789a(i, dVar3.f103841q);
            if (this.f103858c == 0) {
                this.f103858c = rect.height();
            } else if (PluginsController.this.f103835k && this.f103858c != rect.height()) {
                PluginsController.this.f103840p = this.f103858c - rect.height();
            }
            if (PluginsController.this.f103839o == 0 && PluginsController.this.f103835k) {
                PluginsController dVar4 = PluginsController.this;
                dVar4.f103839o = dVar4.mo147434a();
                Log.m165379d("keyboard", "mKeyboardHeight value = " + PluginsController.this.f103839o);
            }
            Log.m165389i("keyboard", "onGlobalLayout() ，isKeyBoardShow = " + PluginsController.this.f103835k + "， sysKeyboardHeight=" + i + ", screenHeight=" + PluginsController.this.f103841q);
            int f = PluginsController.this.mo146825f();
            if (f != this.f103857b) {
                this.f103857b = f;
                IKeyBoardStatusListener eVar = PluginsController.this.f103843s;
                if (eVar != null) {
                    eVar.mo122008a(f);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public KeyBoardOnGlobalChangeListener() {
        }
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146795a(KeyboardScene keyboardScene) {
        Intrinsics.checkParameterIsNotNull(keyboardScene, "scene");
        this.f103834j = keyboardScene;
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: b */
    public void mo146817b(boolean z) {
        this.f103846v = z;
    }

    /* renamed from: a */
    private final void m161692a(View view) {
        ak.m95026a(view, UIUtils.dp2px(view.getContext(), 9.0f));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: b */
    public void mo146814b(int i) {
        this.f103828d.setBackgroundColor(UDColorUtils.getColor(this.f103847w, i));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: c */
    public <T extends IKeyBoardPlugin> T mo146819c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        return (T) this.f103826b.get(str);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: d */
    public <T extends IInputSupportPlugin> T mo146821d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        return (T) this.f103830f.mo147160c(str);
    }

    /* renamed from: b */
    private final ViewGroup m161696b(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        return frameLayout;
    }

    /* renamed from: d */
    public final void mo147440d(boolean z) {
        Iterator<T> it = this.f103825a.iterator();
        while (it.hasNext()) {
            it.next().mo147299d(z);
        }
    }

    /* renamed from: e */
    public final void mo147441e(boolean z) {
        Iterator<T> it = this.f103825a.iterator();
        while (it.hasNext()) {
            it.next().mo147301e(z);
        }
        mo146827h().mo146900a(z);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: b */
    public void mo146815b(InputPluginController.InputSupportPluginChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f103830f.mo147158b(aVar);
    }

    /* renamed from: c */
    public final void mo147439c(boolean z) {
        Iterator<T> it = this.f103825a.iterator();
        while (it.hasNext()) {
            it.next().mo147297c(z);
        }
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: e */
    public void mo146823e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "pluginName");
        m161695a("selectPlugin[ " + str, new C40845p(this, str));
    }

    /* renamed from: f */
    public final void mo147442f(boolean z) {
        if (z) {
            this.f103827c.removeAllViews();
            return;
        }
        for (int childCount = this.f103827c.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f103827c.getChildAt(childCount);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
            if (childAt.getVisibility() != 8 && childAt.getHeight() > 0) {
                this.f103827c.removeViewAt(childCount);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: java.util.Map<java.lang.String, com.ss.android.lark.keyboard.plugin.tool.b> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private final void m161693a(IKeyBoardPlugin.IKeyBoardContext bVar) {
        for (T t : this.f103822K) {
            IKeyBoardPlugin bVar2 = (IKeyBoardPlugin) t.getFirst();
            if (!this.f103824M) {
                bVar2.mo147290a(bVar);
                bVar2.mo147294b(this.f103827c);
            }
            this.f103825a.add(bVar2);
            this.f103831g.put(bVar2, new PluginInfo());
            this.f103826b.put(t.getSecond(), bVar2);
        }
    }

    /* renamed from: b */
    public final void mo147438b(IKeyBoardPlugin bVar) {
        Log.m165389i("keyboard", "handlePluginSelected(" + bVar + "), mCurrPlugin=" + this.f103836l);
        if (bVar == this.f103836l) {
            Log.m165389i("keyboard", "handlePluginSelected() un select");
            IKeyBoardPlugin bVar2 = this.f103836l;
            if (bVar2 != null) {
                bVar2.mo147305i();
            }
            m161694a(this, false, 1, (Object) null);
            NestScrollFrameLayout nestScrollFrameLayout = this.f103827c;
            nestScrollFrameLayout.getLayoutParams().height = 0;
            nestScrollFrameLayout.setVisibility(8);
            this.f103836l = null;
            IKeyBoardStatusListener eVar = this.f103843s;
            if (eVar != null) {
                eVar.mo122009a(false, mo146825f(), mo146837r());
                return;
            }
            return;
        }
        Log.m165389i("keyboard", "handlePluginSelected() select new plugins");
        mo147436a(new C40837j(this, bVar));
    }

    /* renamed from: a */
    public final int mo147435a(Context context) {
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        int i = resources.getDisplayMetrics().heightPixels;
        Log.m165389i("keyboard", "init var screenHeight = " + i + " ,context = " + context);
        return i;
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: b */
    public boolean mo146818b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        return this.f103830f.mo147159b(str);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146796a(IKeyBoardStatusListener eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "listener");
        this.f103843s = eVar;
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146797a(KeyBoard.ReplyInfo bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "replyInfo");
        m161695a("changeToReplyMode", new C40833f(this, bVar));
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146798a(InputPluginController.InputSupportPluginChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f103830f.mo147149a(aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d$x */
    public static final class C40853x<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Map f103867a;

        public C40853x(Map map) {
            this.f103867a = map;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues((Integer) this.f103867a.get(t.getClass()), (Integer) this.f103867a.get(t2.getClass()));
        }
    }

    /* renamed from: a */
    private final void m161695a(String str, Function0<Unit> function0) {
        if (this.f103844t || !this.f103824M) {
            function0.invoke();
        } else {
            this.f103820I.offer(new C40836i(function0, str));
        }
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: b */
    public void mo146816b(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "pluginName");
        m161695a("setPluginVisible[ " + str + " : " + z, new C40850u(this, str, z));
    }

    /* renamed from: a */
    public static /* synthetic */ void m161694a(PluginsController dVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        dVar.mo147442f(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: java.util.List<? extends kotlin.Pair<? extends com.ss.android.lark.keyboard.plugin.tool.b, java.lang.String>> */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: java.util.List<? extends kotlin.Pair<? extends com.ss.android.lark.keyboard.plugin.input.f, java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public PluginsController(Activity activity, ViewGroup viewGroup, IKeyBoardDependency cVar, List<? extends Pair<? extends IKeyBoardPlugin, String>> list, List<? extends Pair<? extends IInputSupportPlugin, String>> list2, boolean z) {
        Intrinsics.checkParameterIsNotNull(activity, "mActivity");
        Intrinsics.checkParameterIsNotNull(viewGroup, "mRootContainer");
        Intrinsics.checkParameterIsNotNull(cVar, "keyBoardDependency");
        Intrinsics.checkParameterIsNotNull(list, "mKBPlugins");
        Intrinsics.checkParameterIsNotNull(list2, "mInputPlugins");
        this.f103847w = activity;
        this.f103848x = viewGroup;
        this.f103821J = cVar;
        this.f103822K = list;
        this.f103823L = list2;
        this.f103824M = z;
        this.f103817F = UIUtils.dp2px(activity, 236.0f);
        this.f103818G = UIUtils.dp2px(activity, 260.0f);
        this.f103819H = C40682g.m160850a().mo133171a("messenger.keyboard.enable_new_observe_view");
        this.f103834j = KeyboardScene.UNKNOWN;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.kb_keyboard, viewGroup);
        View findViewById = inflate.findViewById(R.id.tool_menu);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "keyBoard.findViewById(R.id.tool_menu)");
        KBPluginContainerView kBPluginContainerView = (KBPluginContainerView) findViewById;
        this.f103849z = kBPluginContainerView;
        this.f103812A = (KeyBoardObserveFrameLayout) inflate.findViewById(R.id.kb_observer_layout);
        View findViewById2 = inflate.findViewById(R.id.plugin_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "keyBoard.findViewById(R.id.plugin_container)");
        NestScrollFrameLayout nestScrollFrameLayout = (NestScrollFrameLayout) findViewById2;
        this.f103827c = nestScrollFrameLayout;
        nestScrollFrameLayout.getLayoutParams().height = 0;
        nestScrollFrameLayout.setVisibility(8);
        cVar.mo122095a(nestScrollFrameLayout);
        this.f103813B = (SysKeyBoardObserveFrameLayout) viewGroup.getRootView().findViewWithTag(SysKeyBoardObserveFrameLayout.class);
        View findViewById3 = inflate.findViewById(R.id.input_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "keyBoard.findViewById(R.id.input_container)");
        FrameLayout frameLayout = (FrameLayout) findViewById3;
        this.f103814C = frameLayout;
        View findViewById4 = inflate.findViewById(R.id.toolbar_region);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "keyBoard.findViewById(R.id.toolbar_region)");
        this.f103828d = findViewById4;
        if (this.f103824M) {
            frameLayout.setMinimumHeight(m161697z());
            kBPluginContainerView.setMinimumHeight(UIUtils.dp2px(activity, 44.0f));
        }
        kBPluginContainerView.removeAllViews();
        frameLayout.removeAllViews();
        mo147442f(true);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.btn_send_region);
        Intrinsics.checkExpressionValueIsNotNull(viewGroup2, "btnRegion");
        InputPluginController hVar = new InputPluginController(this, frameLayout, activity, viewGroup2, cVar, CollectionsKt.toMutableList((Collection) list2), this.f103824M);
        this.f103830f = hVar;
        hVar.mo147148a(new IInputSupportPlugin.OnReplyModelChangeListener(this) {
            /* class com.ss.android.lark.keyboard.plugin.tool.PluginsController.C408301 */

            /* renamed from: a */
            final /* synthetic */ PluginsController f103850a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f103850a = r1;
            }

            @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin.OnReplyModelChangeListener
            /* renamed from: a */
            public void mo147128a(boolean z) {
                PluginsController dVar = this.f103850a;
                dVar.mo147440d(dVar.mo146835p());
            }
        });
        KeyBoardContextImpl cVar2 = new KeyBoardContextImpl(this, hVar, activity);
        this.f103815D = cVar2;
        if (!this.f103824M) {
            m161693a(cVar2);
        }
        this.f103816E = new IKeyBoardPlugin.ITouchActionNotifier(this) {
            /* class com.ss.android.lark.keyboard.plugin.tool.PluginsController.C408312 */

            /* renamed from: a */
            final /* synthetic */ PluginsController f103851a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f103851a = r1;
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.ITouchActionNotifier
            /* renamed from: b */
            public void mo147314b(IKeyBoardPlugin bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "clicked");
                PluginHitPointUtil.m161652a(bVar, this.f103851a.mo146827h());
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.ITouchActionNotifier
            /* renamed from: a */
            public void mo147313a(IKeyBoardPlugin bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "plugin");
                if (Intrinsics.areEqual(bVar, this.f103851a.f103836l)) {
                    EditText l = this.f103851a.f103830f.mo147163i().mo146904l();
                    if (l != null) {
                        l.requestFocus();
                    }
                    this.f103851a.mo146829j();
                    return;
                }
                this.f103851a.mo147438b(bVar);
                PluginHitPointUtil.m161652a(bVar, this.f103851a.mo146827h());
            }
        };
        if (!this.f103824M) {
            for (T t : this.f103825a) {
                Context context = this.f103849z.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "mToolMenuLL.context");
                ViewGroup b = m161696b(context);
                View a = t.mo147288a(b, this.f103816E);
                if (a != null) {
                    b.addView(a);
                    this.f103849z.addView(b);
                }
                PluginInfo eVar = this.f103831g.get(t);
                if (eVar == null) {
                    Intrinsics.throwNpe();
                }
                eVar.mo147452b(b);
            }
        }
        this.f103829e = new KeyBoardOnGlobalChangeListener();
        Window window = this.f103847w.getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "mActivity.window");
        View decorView = window.getDecorView();
        Intrinsics.checkExpressionValueIsNotNull(decorView, "mActivity.window.decorView");
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(this.f103829e);
        C40841m mVar = new C40841m(this);
        SysKeyBoardObserveFrameLayout sysKeyBoardObserveFrameLayout = this.f103813B;
        if (!this.f103819H || sysKeyBoardObserveFrameLayout == null) {
            KeyBoardObserveFrameLayout keyBoardObserveFrameLayout = this.f103812A;
            if (keyBoardObserveFrameLayout != null) {
                keyBoardObserveFrameLayout.setActivity(this.f103847w);
                this.f103812A.setKeyBoardListener(mVar);
            }
        } else {
            sysKeyBoardObserveFrameLayout.setActivity(this.f103847w);
            sysKeyBoardObserveFrameLayout.mo148228a(mVar);
        }
        if (this.f103832h == null) {
            ComponentCallbacks2C408323 r9 = new ComponentCallbacks2(this) {
                /* class com.ss.android.lark.keyboard.plugin.tool.PluginsController.ComponentCallbacks2C408323 */

                /* renamed from: a */
                final /* synthetic */ PluginsController f103852a;

                public void onLowMemory() {
                }

                public void onTrimMemory(int i) {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f103852a = r1;
                }

                public void onConfigurationChanged(Configuration configuration) {
                    Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
                    if (this.f103852a.f103842r != configuration.orientation) {
                        this.f103852a.mo146820c();
                        this.f103852a.f103833i = true;
                        Log.m165389i("keyboard", "onGlobalLayout onConfiguration Changed");
                        this.f103852a.f103842r = configuration.orientation;
                        Window window = this.f103852a.f103847w.getWindow();
                        Intrinsics.checkExpressionValueIsNotNull(window, "mActivity.window");
                        View decorView = window.getDecorView();
                        Intrinsics.checkExpressionValueIsNotNull(decorView, "mActivity.window.decorView");
                        decorView.getViewTreeObserver().removeOnGlobalLayoutListener(this.f103852a.f103829e);
                        PluginsController dVar = this.f103852a;
                        dVar.f103829e = new KeyBoardOnGlobalChangeListener();
                        Window window2 = this.f103852a.f103847w.getWindow();
                        Intrinsics.checkExpressionValueIsNotNull(window2, "mActivity.window");
                        View decorView2 = window2.getDecorView();
                        Intrinsics.checkExpressionValueIsNotNull(decorView2, "mActivity.window.decorView");
                        decorView2.getViewTreeObserver().addOnGlobalLayoutListener(this.f103852a.f103829e);
                    }
                }
            };
            this.f103832h = r9;
            this.f103847w.registerComponentCallbacks(r9);
        }
        this.f103837m = new ArrayList();
        this.f103838n = C40843n.INSTANCE;
        this.f103841q = mo147435a(this.f103847w);
        Resources resources = this.f103847w.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "mActivity.resources");
        this.f103842r = resources.getConfiguration().orientation;
        this.f103846v = true;
        this.f103820I = new LinkedList();
    }
}
