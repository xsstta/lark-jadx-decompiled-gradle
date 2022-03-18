package com.ss.android.vc.common.p3077b;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57887w;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import java.io.File;

/* renamed from: com.ss.android.vc.common.b.d */
public class C60703d extends BasePopupWindow {

    /* renamed from: a */
    public static boolean f151846a = true;

    /* renamed from: b */
    public Activity f151847b;

    /* renamed from: c */
    private View f151848c;

    /* renamed from: d */
    private View f151849d;

    /* renamed from: e */
    private TextView f151850e;

    /* renamed from: f */
    private TextView f151851f;

    /* renamed from: g */
    private TextView f151852g;

    /* renamed from: h */
    private TextView f151853h;

    @Override // com.larksuite.framework.ui.BasePopupWindow
    public void dismiss() {
        try {
            super.dismiss();
        } catch (IllegalArgumentException e) {
            C60700b.m235864f("VideoChatTab_MeetingTitlePopWindow", "[dismiss]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m235871a(final Context context) {
        C57865c.m224574a(new C57865c.AbstractC57873d<File>() {
            /* class com.ss.android.vc.common.p3077b.C60703d.C607085 */

            /* renamed from: a */
            public File produce() {
                String name = VideoChatModule.getDependency().getChatDependency().getLoginChatter().getName();
                return C57887w.m224666a(context.getApplicationContext(), VideoChatModuleDependency.getDependency().getMailDependency().mo196433b(), VideoChatModuleDependency.m236630c(), VideoChatModuleDependency.m236629b(), name, VideoChatModuleDependency.getDependency().getAppEnvDependency().mo196334d());
            }
        }, new C57865c.AbstractC57871b<File>() {
            /* class com.ss.android.vc.common.p3077b.C60703d.C607096 */

            /* renamed from: a */
            public void consume(File file) {
                if (file == null || !file.exists()) {
                    C60738ac.m236029a("upload log error!");
                    return;
                }
                C60738ac.m236023a((int) R.string.Lark_Legacy_AboutUploadLogIng);
                C60703d.m235872a(file);
            }
        });
    }

    /* renamed from: a */
    public static void m235872a(File file) {
        VideoChatModule.getDependency().getChatDependency().sendMessage("6990627336442183681", file, null);
    }

    /* renamed from: a */
    public static void m235870a(Activity activity, String str) {
        if (f151846a) {
            new C60703d(activity, str).showAtLocation(activity.getWindow().getDecorView(), 17, 0, 0);
        }
    }

    public C60703d(Activity activity, String str) {
        super(-1, -2);
        this.f151847b = activity;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.vc_popup_window_log_notice, (ViewGroup) null);
        this.f151848c = inflate;
        inflate.setFocusable(true);
        this.f151848c.setFocusableInTouchMode(true);
        setOutsideTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        mo93124a(true);
        setContentView(this.f151848c);
        TextView textView = (TextView) this.f151848c.findViewById(R.id.content_tv);
        this.f151850e = textView;
        textView.setText(str);
        View findViewById = this.f151848c.findViewById(R.id.close_icon);
        this.f151849d = findViewById;
        findViewById.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.common.p3077b.C60703d.C607041 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C60703d.this.dismiss();
            }
        });
        TextView textView2 = (TextView) this.f151848c.findViewById(R.id.upload_tv);
        this.f151851f = textView2;
        textView2.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.common.p3077b.C60703d.C607052 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C60703d.m235871a(C60703d.this.f151847b);
                C60703d.this.dismiss();
            }
        });
        TextView textView3 = (TextView) this.f151848c.findViewById(R.id.cancel_tv);
        this.f151852g = textView3;
        textView3.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.common.p3077b.C60703d.C607063 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C60703d.this.dismiss();
            }
        });
        TextView textView4 = (TextView) this.f151848c.findViewById(R.id.close_tv);
        this.f151853h = textView4;
        textView4.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.common.p3077b.C60703d.C607074 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C60703d.f151846a = false;
                C60703d.this.dismiss();
            }
        });
    }
}
