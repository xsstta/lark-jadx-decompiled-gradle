package com.ss.android.vc.meeting.module.subtitle;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.event.bx;

/* renamed from: com.ss.android.vc.meeting.module.subtitle.g */
public class C63159g {
    /* renamed from: a */
    public static void m247310a(Context context, final String str, View view, final VideoChat videoChat) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.subtitle_history_menu, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.copy);
        final BasePopupWindow basePopupWindow = new BasePopupWindow(inflate, -2, -2, true);
        basePopupWindow.setTouchable(true);
        basePopupWindow.setOutsideTouchable(true);
        basePopupWindow.setBackgroundDrawable(new BitmapDrawable());
        inflate.measure(0, 0);
        int measuredWidth = inflate.getMeasuredWidth();
        int measuredHeight = inflate.getMeasuredHeight();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        try {
            basePopupWindow.showAtLocation(view, 0, (iArr[0] + (view.getWidth() / 2)) - (measuredWidth / 2), iArr[1] - measuredHeight);
        } catch (Exception e) {
            C60700b.m235851b("MenuFactory", "[showMessageMenuPopupWindow]", "fail. " + e.getMessage());
        }
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.C63159g.View$OnClickListenerC631601 */

            public void onClick(View view) {
                bx.m250225a(12, videoChat);
                ((ClipboardManager) ar.m236694a().getSystemService("clipboard")).setText(C57814c.m224352c(str));
                C60738ac.m236023a((int) R.string.View_G_CopiedSuccessfully);
                try {
                    basePopupWindow.dismiss();
                } catch (Exception e) {
                    C60700b.m235851b("MenuFactory", "[dismiss]", "fail. " + e.getMessage());
                }
            }
        });
    }
}
