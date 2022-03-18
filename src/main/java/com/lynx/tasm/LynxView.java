package com.lynx.tasm;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.kit.nglynx.log.LynxKitALogDelegate;
import com.lynx.devtoolwrapper.AbstractC26489a;
import com.lynx.devtoolwrapper.C26491c;
import com.lynx.jsbridge.C26507b;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC26674h;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.p1222b.C26630b;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.core.VSyncMonitor;
import com.lynx.tasm.p1227d.C26886a;
import com.lynx.tasm.utils.C26959m;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.util.Map;

public class LynxView extends UIBody.UIBodyView {
    private boolean mAttached;
    private boolean mCanDispatchTouchEvent;
    protected boolean mDispatchTouchEventToDev = true;
    private boolean mIsDevtoolConfigView;
    private LynxTemplateRender mLynxTemplateRender;

    public LynxPerfMetric forceGetPerf() {
        return null;
    }

    public Object getTag() {
        return "lynxview";
    }

    public void setIsLynxDevtoolConfigView() {
        this.mIsDevtoolConfigView = true;
    }

    public boolean isLynxDevtoolConfigView() {
        return this.mIsDevtoolConfigView;
    }

    public static C26910m builder() {
        return new C26910m();
    }

    public void syncFlush() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.syncFlush();
        }
    }

    public long getFirstMeasureTime() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return -1;
        }
        return lynxTemplateRender.getFirstMeasureTime();
    }

    public AbstractC26684l getLynxContext() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            return lynxTemplateRender.getLynxContext();
        }
        return null;
    }

    public UIGroup<UIBody.UIBodyView> getLynxUIRoot() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.getLynxRootUI();
    }

    public String getPageVersion() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return "";
        }
        return lynxTemplateRender.getPageVersion();
    }

    public String getTemplateUrl() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.getTemplateUrl();
    }

    public C26886a getTheme() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.getTheme();
    }

    public ThreadStrategyForRendering getThreadStrategyForRendering() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.getThreadStrategyForRendering();
    }

    public void pauseRootLayoutAnimation() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.pauseRootLayoutAnimation();
        }
    }

    public void resumeRootLayoutAnimation() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.resumeRootLayoutAnimation();
        }
    }

    public AbstractC26489a getBaseInspectorOwner() {
        C26491c devTool;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null || (devTool = lynxTemplateRender.getDevTool()) == null) {
            return null;
        }
        return devTool.mo93941e();
    }

    public C26903g getLynxConfigInfo() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return new C26903g("", "", "", "");
        }
        return lynxTemplateRender.getLynxConfigInfo();
    }

    public void destroy() {
        LLog.m96425c("LynxView", "lynxview destroy " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.destroy();
            this.mLynxTemplateRender = null;
            C26630b.m96516b().mo94599b(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LLog.m96425c(LynxKitALogDelegate.f38587a, "onAttachedToWindow:" + hashCode());
        this.mAttached = true;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.onAttachedToWindow();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        LLog.m96425c(LynxKitALogDelegate.f38587a, "onDetachedFromWindow:" + hashCode());
        this.mAttached = false;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.onDetachedFromWindow();
        }
        super.onDetachedFromWindow();
    }

    public void onEnterBackground() {
        LLog.m96425c("LynxView", "onEnterBackground" + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.onEnterBackground();
        }
    }

    public void onEnterForeground() {
        LLog.m96425c("LynxView", "onEnterForeground " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.onEnterForeground();
        }
    }

    public LynxView(Context context) {
        super(context);
    }

    public void addStateListener(AbstractC26885d dVar) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.addLStateListener(dVar);
        }
    }

    public void removeStateListener(AbstractC26885d dVar) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.removeStateListener(dVar);
        }
    }

    public void updateData(String str) {
        updateData(str, (String) null);
    }

    public static C26910m builder(Context context) {
        return new C26910m();
    }

    public void addLynxViewClient(AbstractC26911n nVar) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.addLynxViewClient(nVar);
        }
    }

    public LynxBaseUI findUIByIdSelector(String str) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.findUIByIdSelector(str);
    }

    public LynxBaseUI findUIByIndex(int i) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            return lynxTemplateRender.findUIByIndex(i);
        }
        return null;
    }

    public LynxBaseUI findUIByName(String str) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.findUIByName(str);
    }

    public View findViewByIdSelector(String str) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.findViewByIdSelector(str);
    }

    public View findViewByName(String str) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.findViewByName(str);
    }

    public void getCurrentData(AbstractC26907j jVar) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.getCurrentData(jVar);
        }
    }

    public C26507b getJSModule(String str) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.getJSModule(str);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null && this.mCanDispatchTouchEvent) {
            lynxTemplateRender.onInterceptTouchEvent(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null && this.mCanDispatchTouchEvent) {
            lynxTemplateRender.onTouchEvent(motionEvent);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void removeLynxViewClient(AbstractC26911n nVar) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.removeLynxViewClient(nVar);
        }
    }

    public void setGlobalProps(TemplateData templateData) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.setGlobalProps(templateData);
        }
    }

    public void setImageInterceptor(AbstractC26674h hVar) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.setImageInterceptor(hVar);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        boolean z;
        if (onClickListener == null) {
            z = true;
        } else {
            z = false;
        }
        setFocusableInTouchMode(z);
        super.setOnClickListener(onClickListener);
    }

    public void setTheme(C26886a aVar) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.setTheme(aVar);
        }
    }

    public void updateData(Map<String, Object> map) {
        updateData(map, (String) null);
    }

    public void setGlobalProps(Map<String, Object> map) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.setGlobalProps(map);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLynxTemplateRender == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mCanDispatchTouchEvent = true;
        }
        if (this.mCanDispatchTouchEvent) {
            z = this.mLynxTemplateRender.dispatchTouchEvent(motionEvent);
        } else {
            z = false;
        }
        if (action == 1 || action == 3) {
            this.mCanDispatchTouchEvent = false;
        }
        if (this.mLynxTemplateRender.enableEventThrough() && !z) {
            return false;
        }
        if (this.mDispatchTouchEventToDev) {
            this.mLynxTemplateRender.onDispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        LLog.m96425c(LynxKitALogDelegate.f38587a, "setVisibility:" + hashCode() + " " + i);
    }

    public void updateData(TemplateData templateData) {
        LLog.m96425c("LynxView", "updateData with data in " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.updateData(templateData);
        }
    }

    public void attachTemplateRender(final LynxTemplateRender lynxTemplateRender) {
        if (lynxTemplateRender == null) {
            LLog.m96427d(LynxKitALogDelegate.f38587a, "render is null! in " + toString());
        } else if (!C26959m.m97972a()) {
            C26959m.m97969a(new Runnable() {
                /* class com.lynx.tasm.LynxView.RunnableC265401 */

                public void run() {
                    LynxView.this.attachTemplateRender(lynxTemplateRender);
                }
            });
        } else if (this.mLynxTemplateRender != null) {
            LLog.m96427d(LynxKitALogDelegate.f38587a, "already attached" + toString());
        } else if (lynxTemplateRender.attach(this)) {
            if (this.mAttached) {
                lynxTemplateRender.onAttachedToWindow();
            }
            this.mLynxTemplateRender = lynxTemplateRender;
        }
    }

    /* access modifiers changed from: package-private */
    public void innerSetMeasuredDimension(int i, int i2) {
        setMeasuredDimension(i, i2);
    }

    public LynxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void sendGlobalEvent(String str, JavaOnlyArray javaOnlyArray) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.sendGlobalEvent(str, javaOnlyArray);
        }
    }

    public void updateScreenMetrics(int i, int i2) {
        if (this.mLynxTemplateRender != null) {
            DisplayMetricsHolder.m97900a(i, i2);
            this.mLynxTemplateRender.updateScreenMetrics(i, i2);
        }
    }

    public void updateViewport(int i, int i2) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.updateViewport(i, i2);
        }
    }

    public LynxView(Context context, C26910m mVar) {
        super(context);
        LLog.m96425c("LynxView", "new lynxview  " + toString());
        setFocusableInTouchMode(true);
        VSyncMonitor.m97712a((WindowManager) context.getSystemService("window"));
        this.mLynxTemplateRender = new LynxTemplateRender(context, this, mVar);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        LLog.m96425c(LynxKitALogDelegate.f38587a, "onMeasure:" + hashCode() + ", width" + View.MeasureSpec.toString(i) + ", height" + View.MeasureSpec.toString(i2));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            super.onMeasure(i, i2);
        } else {
            lynxTemplateRender.onMeasure(i, i2);
        }
    }

    public void renderTemplate(byte[] bArr, TemplateData templateData) {
        LLog.m96425c("LynxView", "renderTemplate with templateData in " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplate(bArr, templateData);
        }
    }

    public void renderTemplateUrl(String str, TemplateData templateData) {
        LLog.m96425c("LynxView", "renderTemplateUrl " + str + "with templatedata in" + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplateUrl(str, templateData);
        }
    }

    public void renderTemplate(byte[] bArr, Map<String, Object> map) {
        LLog.m96425c("LynxView", "renderTemplate with initdata in " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplate(bArr, map);
        }
    }

    public void renderTemplateUrl(String str, String str2) {
        LLog.m96425c("LynxView", "renderTemplateUrl " + str + "with jsonData in" + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplateUrl(str, str2);
        }
    }

    public void updateData(String str, String str2) {
        LLog.m96425c("LynxView", "updateData with json in " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.updateData(str, str2);
        }
    }

    public void renderTemplateUrl(String str, Map<String, Object> map) {
        LLog.m96425c("LynxView", "renderTemplateUrl " + str + "with Map in" + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplateUrl(str, map);
        }
    }

    public void updateData(Map<String, Object> map, String str) {
        LLog.m96425c("LynxView", "updateData with map in " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.updateData(map, str);
        }
    }

    public void renderTemplateWithBaseUrl(byte[] bArr, TemplateData templateData, String str) {
        LLog.m96425c("LynxView", "renderTemplateWithBaseUrl " + str + "with templateData in " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplateWithBaseUrl(bArr, templateData, str);
        }
    }

    public void renderTemplateWithBaseUrl(byte[] bArr, String str, String str2) {
        LLog.m96425c("LynxView", "renderTemplateWithBaseUrl " + str2 + "with stringdata in" + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplateWithBaseUrl(bArr, str, str2);
        }
    }

    public void renderTemplateWithBaseUrl(byte[] bArr, Map<String, Object> map, String str) {
        LLog.m96425c("LynxView", "renderTemplateWithBaseUrl " + str + "with map in " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplateWithBaseUrl(bArr, map, str);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.onLayout(z, i, i2, i3, i4);
            LLog.m96425c(LynxKitALogDelegate.f38587a, "onLayout:" + hashCode() + i + " " + i2 + " " + i3 + " " + i4);
        }
    }
}
