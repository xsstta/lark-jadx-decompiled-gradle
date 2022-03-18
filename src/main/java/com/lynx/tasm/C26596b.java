package com.lynx.tasm;

import android.os.SystemClock;
import android.util.Log;
import com.C1711a;
import com.lynx.devtoolwrapper.AbstractC26489a;
import com.lynx.devtoolwrapper.AbstractC26490b;
import com.lynx.devtoolwrapper.C26491c;
import com.lynx.devtoolwrapper.LynxInspectorManager;
import com.lynx.jsbridge.C26506a;
import com.lynx.jsbridge.C26508c;
import com.lynx.jsbridge.C26509d;
import com.lynx.jsbridge.CallbackImpl;
import com.lynx.jsbridge.HandlerC26510e;
import com.lynx.jsbridge.LynxMethod;
import com.lynx.jsbridge.LynxModule;
import com.lynx.jsbridge.LynxModuleManager;
import com.lynx.jsbridge.LynxModuleWrapper;
import com.lynx.jsbridge.MethodDescriptor;
import com.lynx.jsbridge.NetworkingModule;
import com.lynx.jsbridge.Promise;
import com.lynx.jsbridge.PromiseImpl;
import com.lynx.react.bridge.AbstractAsyncTaskC26520d;
import com.lynx.react.bridge.AbstractAsyncTaskC26521e;
import com.lynx.react.bridge.AbstractC26517a;
import com.lynx.react.bridge.AbstractC26523g;
import com.lynx.react.bridge.AbstractRunnableC26522f;
import com.lynx.react.bridge.C26518b;
import com.lynx.react.bridge.C26519c;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.react.bridge.WritableArray;
import com.lynx.react.bridge.WritableMap;
import com.lynx.react.p1214a.p1215a.C26512a;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.analytics.C26558d;
import com.lynx.tasm.animation.C26562a;
import com.lynx.tasm.animation.C26570b;
import com.lynx.tasm.animation.p1217a.C26563a;
import com.lynx.tasm.animation.p1217a.C26568b;
import com.lynx.tasm.animation.p1218b.AbstractC26573a;
import com.lynx.tasm.animation.p1218b.AbstractC26574b;
import com.lynx.tasm.animation.p1218b.C26575c;
import com.lynx.tasm.animation.p1218b.C26578d;
import com.lynx.tasm.animation.p1218b.C26579e;
import com.lynx.tasm.animation.p1218b.C26581g;
import com.lynx.tasm.animation.p1218b.C26583i;
import com.lynx.tasm.animation.p1219c.C26585a;
import com.lynx.tasm.base.AbstractC26617e;
import com.lynx.tasm.base.C26614b;
import com.lynx.tasm.base.C26618f;
import com.lynx.tasm.base.CalledByNative;
import com.lynx.tasm.base.JNINamespace;
import com.lynx.tasm.base.SystemMessageHandler;
import com.lynx.tasm.base.SystemThread;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.behavior.AbstractC26624b;
import com.lynx.tasm.behavior.AbstractC26672f;
import com.lynx.tasm.behavior.AbstractC26674h;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.C26622a;
import com.lynx.tasm.behavior.C26636c;
import com.lynx.tasm.behavior.C26662d;
import com.lynx.tasm.behavior.C26670e;
import com.lynx.tasm.behavior.C26673g;
import com.lynx.tasm.behavior.C26690o;
import com.lynx.tasm.behavior.C26693p;
import com.lynx.tasm.behavior.C26694q;
import com.lynx.tasm.behavior.C26696r;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.C26737t;
import com.lynx.tasm.behavior.LayoutContext;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.LynxPropGroup;
import com.lynx.tasm.behavior.LynxPropsHolder;
import com.lynx.tasm.behavior.PaintingContext;
import com.lynx.tasm.behavior.p1223c.AbstractC26656j;
import com.lynx.tasm.behavior.p1223c.p1224a.AbstractC26638a;
import com.lynx.tasm.behavior.p1223c.p1224a.C26639b;
import com.lynx.tasm.behavior.shadow.AbstractC26702c;
import com.lynx.tasm.behavior.shadow.AbstractC26703d;
import com.lynx.tasm.behavior.shadow.C26698a;
import com.lynx.tasm.behavior.shadow.C26700b;
import com.lynx.tasm.behavior.shadow.C26704e;
import com.lynx.tasm.behavior.shadow.C26705f;
import com.lynx.tasm.behavior.shadow.C26706g;
import com.lynx.tasm.behavior.shadow.C26708i;
import com.lynx.tasm.behavior.shadow.C26709j;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.MeasureMode;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode;
import com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.C26715b;
import com.lynx.tasm.behavior.shadow.text.C26716c;
import com.lynx.tasm.behavior.shadow.text.C26717d;
import com.lynx.tasm.behavior.shadow.text.C26719f;
import com.lynx.tasm.behavior.shadow.text.C26720g;
import com.lynx.tasm.behavior.shadow.text.C26722i;
import com.lynx.tasm.behavior.shadow.text.C26728l;
import com.lynx.tasm.behavior.shadow.text.C26731m;
import com.lynx.tasm.behavior.shadow.text.C26733n;
import com.lynx.tasm.behavior.shadow.text.C26734o;
import com.lynx.tasm.behavior.shadow.text.HandlerThreadC26724k;
import com.lynx.tasm.behavior.shadow.text.InlineTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.RawTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextRenderer;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import com.lynx.tasm.behavior.ui.AbstractC26746a;
import com.lynx.tasm.behavior.ui.AbstractC26757c;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.lynx.tasm.behavior.ui.background.AbstractC26751a;
import com.lynx.tasm.behavior.ui.background.AbstractC26753c;
import com.lynx.tasm.behavior.ui.background.BackgroundLinearGradientLayer;
import com.lynx.tasm.behavior.ui.background.C26754d;
import com.lynx.tasm.behavior.ui.background.C26755e;
import com.lynx.tasm.behavior.ui.background.C26756f;
import com.lynx.tasm.behavior.ui.image.AbsUIImage;
import com.lynx.tasm.behavior.ui.image.C26785a;
import com.lynx.tasm.behavior.ui.list.C26801f;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.scroll.C26806a;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;
import com.lynx.tasm.behavior.ui.text.AbstractC26821a;
import com.lynx.tasm.behavior.ui.text.AndroidText;
import com.lynx.tasm.behavior.ui.text.FlattenUIText;
import com.lynx.tasm.behavior.ui.text.UIText;
import com.lynx.tasm.behavior.ui.utils.AbstractC26831d;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import com.lynx.tasm.behavior.ui.utils.BorderRadius;
import com.lynx.tasm.behavior.ui.utils.BorderStyle;
import com.lynx.tasm.behavior.ui.utils.C26828a;
import com.lynx.tasm.behavior.ui.utils.C26829b;
import com.lynx.tasm.behavior.ui.utils.C26830c;
import com.lynx.tasm.behavior.ui.utils.C26832e;
import com.lynx.tasm.behavior.ui.utils.C26834g;
import com.lynx.tasm.behavior.ui.utils.C26837i;
import com.lynx.tasm.behavior.ui.view.C26840a;
import com.lynx.tasm.behavior.ui.view.C26841b;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.behavior.ui.view.UIView;
import com.lynx.tasm.behavior.utils.C26846d;
import com.lynx.tasm.behavior.utils.LynxUISetter;
import com.lynx.tasm.behavior.utils.PropsUpdater;
import com.lynx.tasm.behavior.utils.Settable;
import com.lynx.tasm.behavior.utils.ShadowNodeSetter;
import com.lynx.tasm.common.C26872a;
import com.lynx.tasm.common.C26874b;
import com.lynx.tasm.core.C26880a;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.core.LynxRuntimeManager;
import com.lynx.tasm.core.ResourceLoader;
import com.lynx.tasm.fontface.C26890b;
import com.lynx.tasm.p1216a.C26545a;
import com.lynx.tasm.p1216a.C26546b;
import com.lynx.tasm.p1216a.C26548d;
import com.lynx.tasm.p1216a.C26549e;
import com.lynx.tasm.p1216a.C26553i;
import com.lynx.tasm.p1220b.C26603c;
import com.lynx.tasm.p1225c.p1226a.AbstractC26862a;
import com.lynx.tasm.p1227d.C26886a;
import com.lynx.tasm.provider.AbstractC26933a;
import com.lynx.tasm.provider.AbstractC26934b;
import com.lynx.tasm.provider.AbstractC26942i;
import com.lynx.tasm.provider.AbstractC26943j;
import com.lynx.tasm.utils.C26945b;
import com.lynx.tasm.utils.C26948e;
import com.lynx.tasm.utils.C26949f;
import com.lynx.tasm.utils.C26950g;
import com.lynx.tasm.utils.C26953h;
import com.lynx.tasm.utils.C26955i;
import com.lynx.tasm.utils.C26959m;
import com.lynx.tasm.utils.C26960n;
import com.lynx.tasm.utils.ColorUtils;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import com.lynx.tasm.utils.ValueUtils;
import java.util.List;

/* renamed from: com.lynx.tasm.b */
public class C26596b {

    /* renamed from: a */
    private static volatile boolean f65856a;

    /* renamed from: a */
    public static void m96400a() {
        if (!f65856a) {
            f65856a = true;
            C26880a.m97713a().execute(new Runnable() {
                /* class com.lynx.tasm.C26596b.RunnableC265982 */

                public void run() {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    try {
                        Class.forName(AbstractC26934b.class.getName());
                        Class.forName(C26846d.class.getName());
                        Class.forName(C26662d.class.getName());
                        Class.forName(C26622a.class.getName());
                        Class.forName(LynxModuleManager.class.getName());
                        Class.forName(CallbackImpl.class.getName());
                        Class.forName(C26904h.class.getName());
                        Class.forName(C26872a.class.getName());
                        Class.forName(C26558d.class.getName());
                        Class.forName(C26509d.class.getName());
                        Class.forName(TraceController.class.getName());
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        Log.i("Lynx_ClassWarmer", "Task0 class warm-up cost:" + (uptimeMillis2 - uptimeMillis));
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
            C26880a.m97713a().execute(new Runnable() {
                /* class com.lynx.tasm.C26596b.RunnableC265993 */

                public void run() {
                    try {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        C1711a.m7628a("lynx");
                        Log.i("Lynx_ClassWarmer", "Task1 preload Lynx so cost:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
            C26880a.m97713a().execute(new Runnable() {
                /* class com.lynx.tasm.C26596b.RunnableC266004 */

                public void run() {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    try {
                        Class.forName(C26506a.class.getName());
                        Class.forName(LynxMethod.class.getName());
                        Class.forName(C26508c.class.getName());
                        Class.forName(LynxModule.class.getName());
                        Class.forName(LynxModuleWrapper.class.getName());
                        Class.forName(MethodDescriptor.class.getName());
                        Class.forName(NetworkingModule.class.getName());
                        Class.forName(Promise.class.getName());
                        Class.forName(HandlerC26510e.AbstractC26511a.class.getName());
                        Class.forName(HandlerC26510e.class.getName());
                        Class.forName(Callback.class.getName());
                        Class.forName(AbstractC26517a.class.getName());
                        Class.forName(AbstractAsyncTaskC26520d.class.getName());
                        Class.forName(AbstractAsyncTaskC26521e.class.getName());
                        Class.forName(AbstractRunnableC26522f.class.getName());
                        Class.forName(AbstractC26523g.class.getName());
                        Class.forName(ReadableArray.class.getName());
                        Class.forName(ReadableMap.class.getName());
                        Class.forName(ReadableMapKeySetIterator.class.getName());
                        Class.forName(ReadableType.class.getName());
                        Class.forName(C26512a.AbstractC26513a.class.getName());
                        Class.forName(C26596b.class.getName());
                        Class.forName(EventEmitter.class.getName());
                        Class.forName(AbstractC26861c.class.getName());
                        Class.forName(AbstractC26887e.class.getName());
                        Class.forName(C26888f.class.getName());
                        Class.forName(LynxEnv.class.getName());
                        Class.forName(C26908k.class.getName());
                        Class.forName(C26910m.class.getName());
                        Class.forName(TemplateData.class.getName());
                        Class.forName(TemplateAssembler.AbstractC26543a.class.getName());
                        Class.forName(ThreadStrategyForRendering.class.getName());
                        Class.forName(C26614b.class.getName());
                        Class.forName(CalledByNative.class.getName());
                        Class.forName(JNINamespace.class.getName());
                        Class.forName(AbstractC26617e.class.getName());
                        Class.forName(SystemMessageHandler.class.getName());
                        Class.forName(SystemThread.class.getName());
                        Class.forName(AbstractC26624b.class.getName());
                        Class.forName(C26636c.class.getName());
                        Class.forName(C26670e.class.getName());
                        Class.forName(AbstractC26672f.class.getName());
                        Class.forName(AbstractC26674h.class.getName());
                        Class.forName(AbstractC26573a.class.getName());
                        Class.forName(C26575c.class.getName());
                        Class.forName(LayoutContext.class.getName());
                        Class.forName(C26568b.AbstractC26569a.class.getName());
                        Class.forName(C26568b.class.getName());
                        Class.forName(C26563a.class.getName());
                        Class.forName(LynxProp.class.getName());
                        Class.forName(LynxPropGroup.class.getName());
                        Class.forName(LynxPropsHolder.class.getName());
                        Class.forName(C26690o.class.getName());
                        Class.forName(PaintingContext.class.getName());
                        Class.forName(C26693p.class.getName());
                        Class.forName(C26696r.class.getName());
                        Class.forName(C26697s.class.getName());
                        Class.forName(C26737t.class.getName());
                        Class.forName(AbstractC26656j.class.getName());
                        Class.forName(LayoutNode.class.getName());
                        Class.forName(AbstractC26702c.class.getName());
                        Class.forName(AbstractC26703d.class.getName());
                        Class.forName(MeasureMode.class.getName());
                        Class.forName(C26704e.class.getName());
                        Class.forName(C26705f.class.getName());
                        Class.forName(C26706g.class.getName());
                        Class.forName(C26708i.class.getName());
                        Class.forName(C26715b.class.getName());
                        Class.forName(C26716c.class.getName());
                        Class.forName(C26717d.class.getName());
                        Class.forName(C26719f.class.getName());
                        Class.forName(C26720g.class.getName());
                        Class.forName(C26722i.class.getName());
                        Class.forName(HandlerThreadC26724k.class.getName());
                        Class.forName(TextRenderer.class.getName());
                        Class.forName(C26728l.class.getName());
                        Class.forName(C26731m.C26732a.class.getName());
                        Class.forName(C26731m.class.getName());
                        Class.forName(C26733n.class.getName());
                        Class.forName(C26734o.AbstractC26735a.class.getName());
                        Class.forName(C26734o.class.getName());
                        Class.forName(UIComponent.class.getName());
                        Class.forName(C26841b.class.getName());
                        Class.forName(AbstractC26746a.AbstractC26747a.class.getName());
                        Class.forName(AbstractC26746a.class.getName());
                        Class.forName(LynxBaseUI.class.getName());
                        Class.forName(AbstractC26757c.class.getName());
                        Class.forName(C26785a.class.getName());
                        Class.forName(C26806a.AbstractC26811a.class.getName());
                        Class.forName(AbstractC26821a.class.getName());
                        Class.forName(AndroidText.class.getName());
                        Class.forName(BackgroundDrawable.BorderRadiusLocation.class.getName());
                        Class.forName(BackgroundDrawable.class.getName());
                        Class.forName(C26829b.class.getName());
                        Class.forName(C26830c.class.getName());
                        Class.forName(AbstractC26831d.class.getName());
                        Class.forName(C26832e.class.getName());
                        Class.forName(C26837i.class.getName());
                        Class.forName(PropsUpdater.class.getName());
                        Class.forName(Settable.class.getName());
                        Class.forName(C26874b.class.getName());
                        Class.forName(LynxRuntimeManager.class.getName());
                        Class.forName(ResourceLoader.class.getName());
                        Class.forName(C26545a.class.getName());
                        Class.forName(C26548d.class.getName());
                        Class.forName(C26618f.class.getName());
                        Class.forName(AbstractC26933a.class.getName());
                        Class.forName(AbstractC26934b.AbstractC26935a.class.getName());
                        Class.forName(ColorUtils.class.getName());
                        Class.forName(DisplayMetricsHolder.class.getName());
                        Class.forName(C26945b.class.getName());
                        Class.forName(C26948e.class.getName());
                        Class.forName(C26949f.class.getName());
                        Class.forName(C26955i.class.getName());
                        Class.forName(C26959m.class.getName());
                        Class.forName(C26960n.class.getName());
                        Class.forName(ValueUtils.class.getName());
                        Class.forName(C26950g.class.getName());
                        Class.forName(C26603c.class.getName());
                        Class.forName(AbstractC26942i.class.getName());
                        Class.forName(AbstractC26943j.class.getName());
                        Class.forName(C26886a.class.getName());
                        Class.forName(NetworkingModule.class.getName());
                        Class.forName(PromiseImpl.class.getName());
                        Class.forName(C26518b.class.getName());
                        Class.forName(C26519c.class.getName());
                        Class.forName(WritableArray.class.getName());
                        Class.forName(WritableMap.class.getName());
                        Class.forName(LynxTemplateRender.C26539d.class.getName());
                        Class.forName(AbstractC26911n.class.getName());
                        Class.forName(TemplateAssembler.class.getName());
                        Class.forName(AbstractC26862a.class.getName());
                        Class.forName(AbstractC26574b.class.getName());
                        Class.forName(C26581g.class.getName());
                        Class.forName(C26583i.class.getName());
                        Class.forName(AbstractC26684l.class.getName());
                        Class.forName(C26694q.class.getName());
                        Class.forName(AbstractC26638a.class.getName());
                        Class.forName(C26698a.class.getName());
                        Class.forName(C26700b.class.getName());
                        Class.forName(ShadowNode.class.getName());
                        Class.forName(C26709j.class.getName());
                        Class.forName(LynxFlattenUI.class.getName());
                        Class.forName(LynxUI.class.getName());
                        Class.forName(UIBody.UIBodyView.class.getName());
                        Class.forName(C26806a.class.getName());
                        Class.forName(C26828a.class.getName());
                        Class.forName(BorderStyle.class.getName());
                        Class.forName(C26834g.class.getName());
                        Class.forName(C26840a.class.getName());
                        Class.forName(LynxUISetter.class.getName());
                        Class.forName(ShadowNodeSetter.class.getName());
                        Class.forName(C26953h.class.getName());
                        Class.forName(JSProxy.class.getName());
                        Class.forName(C26546b.class.getName());
                        Class.forName(C26553i.class.getName());
                        Class.forName(JavaOnlyArray.class.getName());
                        Class.forName(JavaOnlyMap.class.getName());
                        Class.forName(C26931o.class.getName());
                        Class.forName(LynxView.class.getName());
                        Class.forName(C26578d.class.getName());
                        Class.forName(C26579e.class.getName());
                        Class.forName(C26585a.class.getName());
                        Class.forName(C26562a.class.getName());
                        Class.forName(C26570b.class.getName());
                        Class.forName(C26639b.class.getName());
                        Class.forName(AbsInlineImageShadowNode.class.getName());
                        Class.forName(BaseTextShadowNode.class.getName());
                        Class.forName(RawTextShadowNode.class.getName());
                        Class.forName(UIGroup.class.getName());
                        Class.forName(UIShadowProxy.C26745c.class.getName());
                        Class.forName(AbsUIImage.class.getName());
                        Class.forName(FlattenUIText.class.getName());
                        Class.forName(UIText.class.getName());
                        Class.forName(C26754d.class.getName());
                        Class.forName(AbstractC26753c.class.getName());
                        Class.forName(AbstractC26751a.class.getName());
                        Class.forName(BackgroundLinearGradientLayer.class.getName());
                        Class.forName(C26756f.class.getName());
                        Class.forName(C26755e.class.getName());
                        Class.forName(C26673g.class.getName());
                        Class.forName(C26890b.class.getName());
                        Class.forName(C26549e.class.getName());
                        Class.forName(InlineTextShadowNode.class.getName());
                        Class.forName(TextShadowNode.class.getName());
                        Class.forName(UIBody.class.getName());
                        Class.forName(UIShadowProxy.class.getName());
                        Class.forName(UISimpleView.class.getName());
                        Class.forName(UIScrollView.class.getName());
                        Class.forName(UIView.class.getName());
                        Class.forName(UIList.class.getName());
                        Class.forName(C26801f.class.getName());
                        Class.forName(AbstractC26489a.class.getName());
                        Class.forName(AbstractC26490b.class.getName());
                        Class.forName(C26491c.class.getName());
                        Class.forName(LynxInspectorManager.class.getName());
                        new BorderRadius();
                        C26948e.m97913a();
                        new BorderRadius.C26826a();
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        Log.i("Lynx_ClassWarmer", "Task2 class warm-up cost:" + (uptimeMillis2 - uptimeMillis));
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m96401a(final List<C26622a> list) {
        C26880a.m97713a().execute(new Runnable() {
            /* class com.lynx.tasm.C26596b.RunnableC265971 */

            public void run() {
                long uptimeMillis = SystemClock.uptimeMillis();
                try {
                    for (C26622a aVar : list) {
                        AbstractC26544a b = aVar.mo94568b();
                        if (b != null) {
                            b.mo94344a();
                        }
                    }
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    Log.i("warmClassForBehaviors", "Task0 class warm-up cost:" + (uptimeMillis2 - uptimeMillis));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }
}
