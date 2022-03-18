package com.ss.android.openbusiness.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.openbusiness.C59480b;

/* renamed from: com.ss.android.openbusiness.ui.c */
public class C59603c extends UDDialogController {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateContent() {
        final View onCreateContent = super.onCreateContent();
        if (onCreateContent != null) {
            final ImageView imageView = (ImageView) onCreateContent.findViewById(R.id.opb_external_tip_img);
            onCreateContent.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                /* class com.ss.android.openbusiness.ui.C59603c.ViewTreeObserver$OnPreDrawListenerC596041 */

                public boolean onPreDraw() {
                    onCreateContent.getViewTreeObserver().removeOnPreDrawListener(this);
                    int measuredWidth = onCreateContent.getMeasuredWidth();
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    layoutParams.height = (int) (((double) (measuredWidth - C57582a.m223600a(40))) * 0.86d);
                    imageView.setLayoutParams(layoutParams);
                    return false;
                }
            });
            C59480b.m230865a().mo144877c();
            imageView.setImageResource(R.drawable.app_shortcut_recommendtip_pic);
            if (TextUtils.equals(C59480b.m230865a().mo144879e().getLanguage(), "zh")) {
                imageView.setImageResource(R.drawable.app_shortcut_recommendtip_pic);
            } else {
                imageView.setImageResource(R.drawable.app_shortcut_recommendtip_pic_eng);
            }
        }
        return onCreateContent;
    }

    public C59603c(Context context) {
        super(context);
    }
}
