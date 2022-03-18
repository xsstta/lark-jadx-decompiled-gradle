package com.bytedance.ee.bear.doc.toolbar;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4942d;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.doc.toolbar.SlideHideKeyboardPlugin;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.toolbar2.BaseToolbarV2Plugin;
import com.bytedance.ee.bear.edit.component.toolbar2.DocToolbarV2Compat;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class SlideHideKeyboardPlugin extends DocumentPlugin implements View.OnTouchListener {
    private GestureDetector gestureDetector;

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.gestureDetector.onTouchEvent(motionEvent);
        return false;
    }

    public void onAttachToUIContainer(final C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        this.gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {
            /* class com.bytedance.ee.bear.doc.toolbar.SlideHideKeyboardPlugin.C55411 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m22497a(BaseToolbarV2Plugin baseToolbarV2Plugin) {
                DocToolbarV2Compat.of(SlideHideKeyboardPlugin.this.getActivity()).forceClearToolbar();
            }

            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (f2 <= BitmapDescriptorFactory.HUE_RED) {
                    return false;
                }
                sVar.mo19549a(BaseToolbarV2Plugin.class, new AbstractC4942d() {
                    /* class com.bytedance.ee.bear.doc.toolbar.$$Lambda$SlideHideKeyboardPlugin$1$aHsBZIIAjV7XrQ3aOEoegt9arA */

                    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
                    public final void onPluginFound(AbstractC4941c cVar) {
                        SlideHideKeyboardPlugin.C55411.this.m22497a((BaseToolbarV2Plugin) cVar);
                    }
                });
                C10548d.m43697a(SlideHideKeyboardPlugin.this.getWeb().mo19435b());
                return true;
            }
        });
        getWeb().mo19422a(this);
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        getWeb().mo19436b(this);
    }
}
