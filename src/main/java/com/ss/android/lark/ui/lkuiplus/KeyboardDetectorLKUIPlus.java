package com.ss.android.lark.ui.lkuiplus;

import android.view.View;
import com.larksuite.component.ui.layout.ILKUILayout;
import com.larksuite.component.ui.layout.OnMeasureData;
import com.larksuite.component.ui.layout.plus.BaseLKUIPlus;
import com.larksuite.framework.utils.KeyboardUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\tJ\u0006\u0010\r\u001a\u00020\u0006J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/ui/lkuiplus/KeyboardDetectorLKUIPlus;", "Lcom/larksuite/component/ui/layout/plus/BaseLKUIPlus;", "layout", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "(Lcom/larksuite/component/ui/layout/ILKUILayout;)V", "keyboardShowing", "", "listenerList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/ui/lkuiplus/KeyboardDetectorLKUIPlus$SoftKeyboardStateListener;", "addOnSoftKeyboardListener", "", "listener", "isKeyboardShowing", "onDelegateMeasureStart", "onMeasureData", "Lcom/larksuite/component/ui/layout/OnMeasureData;", "removeOnSoftKeyboardListener", "SoftKeyboardStateListener", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
public final class KeyboardDetectorLKUIPlus extends BaseLKUIPlus {
    private boolean keyboardShowing;
    private final ArrayList<SoftKeyboardStateListener> listenerList = new ArrayList<>(2);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/ui/lkuiplus/KeyboardDetectorLKUIPlus$SoftKeyboardStateListener;", "", "onSoftKeyboardClosed", "", "onSoftKeyboardOpened", "keyboardHeightInPx", "", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ui.lkuiplus.KeyboardDetectorLKUIPlus$a */
    public interface SoftKeyboardStateListener {
        /* renamed from: a */
        void mo195599a();

        /* renamed from: a */
        void mo195600a(int i);
    }

    public final boolean isKeyboardShowing() {
        return this.keyboardShowing;
    }

    public final void removeOnSoftKeyboardListener(SoftKeyboardStateListener aVar) {
        this.listenerList.remove(aVar);
    }

    public final void addOnSoftKeyboardListener(SoftKeyboardStateListener aVar) {
        if (this.listenerList.indexOf(aVar) == -1) {
            this.listenerList.add(aVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyboardDetectorLKUIPlus(ILKUILayout iLKUILayout) {
        super(iLKUILayout);
        Intrinsics.checkParameterIsNotNull(iLKUILayout, "layout");
    }

    @Override // com.larksuite.component.ui.layout.plus.BaseLKUIPlus
    public void onDelegateMeasureStart(OnMeasureData cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "onMeasureData");
        int height = getLayout().getHeight() - View.MeasureSpec.getSize(cVar.mo89738b());
        if (height > 400) {
            KeyboardUtils.setKeyboardHeight(height);
            this.keyboardShowing = true;
            Iterator<SoftKeyboardStateListener> it = this.listenerList.iterator();
            while (it.hasNext()) {
                SoftKeyboardStateListener next = it.next();
                if (next != null) {
                    next.mo195600a(height);
                }
            }
        } else if (height < -400) {
            this.keyboardShowing = false;
            Iterator<SoftKeyboardStateListener> it2 = this.listenerList.iterator();
            while (it2.hasNext()) {
                SoftKeyboardStateListener next2 = it2.next();
                if (next2 != null) {
                    next2.mo195599a();
                }
            }
        }
        super.onDelegateMeasureStart(cVar);
    }
}
