package com.tt.miniapp.p3323q;

import android.app.ActivityManager;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a;
import com.larksuite.suite.R;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.util.C67590h;

/* renamed from: com.tt.miniapp.q.f */
public class C66683f {

    /* renamed from: com.tt.miniapp.q.f$a */
    public interface AbstractC66685a {
        /* renamed from: a */
        void mo232435a();
    }

    /* renamed from: com.tt.miniapp.q.f$b */
    public static class C66686b {

        /* renamed from: a */
        public long f168341a = -1;

        /* renamed from: b */
        public long f168342b = -1;

        /* renamed from: c */
        public long f168343c = -1;

        /* renamed from: a */
        public static C66686b m260440a(IAppContext iAppContext) {
            return C67485a.m262488a(iAppContext).mo234280a().f170183j;
        }
    }

    /* renamed from: a */
    private static void m260437a(TextView textView) {
        textView.setTextSize(14.0f);
        textView.setGravity(19);
        textView.setTextColor(textView.getContext().getResources().getColor(R.color.microapp_m_ssxinzi1));
    }

    /* renamed from: a */
    public static void m260434a(long j, IAppContext iAppContext) {
        C66686b.m260440a(iAppContext).f168341a = j;
    }

    /* renamed from: b */
    public static void m260438b(long j, IAppContext iAppContext) {
        C66686b.m260440a(iAppContext).f168343c = j;
    }

    /* renamed from: a */
    private static void m260436a(ViewGroup viewGroup, Context context) {
        View view = new View(context);
        view.setBackgroundColor(context.getResources().getColor(R.color.microapp_m_divder_color));
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, (int) C67590h.m263065a(context, 0.5f)));
        viewGroup.addView(view);
    }

    /* renamed from: a */
    public static void m260435a(Context context, final AbstractC66685a aVar, boolean z, IAppContext iAppContext) {
        StringBuffer stringBuffer;
        View inflate = View.inflate(context, R.layout.microapp_m_title_menu, null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.microapp_m_menu_container);
        linearLayout.setShowDividers(0);
        Dialog dialog = new Dialog(context, R.style.microapp_i_titlemenudialog);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) C67590h.m263065a(context, 38.0f));
        layoutParams.leftMargin = (int) C67590h.m263065a(context, 14.0f);
        TextView textView = new TextView(context);
        m260437a(textView);
        textView.setTextSize(16.0f);
        textView.setText(context.getText(R.string.microapp_m_performance_title));
        linearLayout.addView(textView, layoutParams);
        m260436a(linearLayout, context);
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
            TextView textView2 = new TextView(context);
            Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()});
            StringBuffer stringBuffer2 = new StringBuffer(context.getString(R.string.microapp_m_performance_total_memory));
            stringBuffer2.append(processMemoryInfo[0].dalvikPss);
            stringBuffer2.append(" bytes");
            textView2.setText(stringBuffer2);
            m260437a(textView2);
            linearLayout.addView(textView2, layoutParams);
        }
        TextView textView3 = new TextView(context);
        C66686b a = C66686b.m260440a(iAppContext);
        StringBuffer stringBuffer3 = new StringBuffer(context.getString(R.string.microapp_m_performance_miniapp_launch_time));
        stringBuffer3.append(a.f168341a);
        stringBuffer3.append(" ms");
        m260437a(textView3);
        textView3.setText(stringBuffer3);
        linearLayout.addView(textView3, layoutParams);
        TextView textView4 = new TextView(context);
        StringBuffer stringBuffer4 = new StringBuffer(context.getString(R.string.microapp_m_performance_miniapp_download_time));
        if (a.f168342b > 0) {
            stringBuffer4.append(a.f168342b);
            stringBuffer4.append(" ms");
        } else {
            stringBuffer4.append(" --");
        }
        m260437a(textView4);
        textView4.setText(stringBuffer4);
        linearLayout.addView(textView4, layoutParams);
        TextView textView5 = new TextView(context);
        long c = C66692i.m260477c(iAppContext);
        if (c >= 0) {
            stringBuffer = new StringBuffer(context.getString(R.string.microapp_m_performance_page_router));
            stringBuffer.append(c);
            stringBuffer.append(" ms");
        } else {
            stringBuffer = new StringBuffer(context.getString(R.string.microapp_m_performance_page_router));
            stringBuffer.append("--");
        }
        m260437a(textView5);
        textView5.setText(stringBuffer);
        linearLayout.addView(textView5, layoutParams);
        TextView textView6 = new TextView(context);
        StringBuffer stringBuffer5 = new StringBuffer(context.getString(R.string.microapp_m_performance_page_render));
        if (a.f168343c >= 0) {
            stringBuffer5.append(a.f168343c);
            stringBuffer5.append(" ms");
        } else {
            stringBuffer5.append(" --");
        }
        m260437a(textView6);
        textView6.setText(stringBuffer5);
        linearLayout.addView(textView6, layoutParams);
        TextView textView7 = new TextView(context);
        StringBuffer stringBuffer6 = new StringBuffer(context.getString(R.string.microapp_m_performance_page_fps));
        stringBuffer6.append(C66689h.m260454b(iAppContext));
        stringBuffer6.append(" /s");
        m260437a(textView7);
        textView7.setText(stringBuffer6);
        linearLayout.addView(textView7, layoutParams);
        TextView textView8 = new TextView(context);
        StringBuffer stringBuffer7 = new StringBuffer(context.getString(R.string.microapp_m_performance_set_storage_size));
        stringBuffer7.append(((AbstractC12910a) iAppContext.findServiceByInterface(AbstractC12910a.class)).mo48694b());
        stringBuffer7.append(" bytes");
        m260437a(textView8);
        textView8.setText(stringBuffer7);
        linearLayout.addView(textView8, layoutParams);
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            /* class com.tt.miniapp.p3323q.C66683f.DialogInterface$OnDismissListenerC666841 */

            public void onDismiss(DialogInterface dialogInterface) {
                aVar.mo232435a();
            }
        });
        dialog.setContentView(inflate);
        Window window = dialog.getWindow();
        if (window != null) {
            if (TextUtils.equals(C67043j.m261271a().toLowerCase(), "huawei") && AppbrandContext.getInst().isGame()) {
                window.setFlags(1024, 1024);
                window.getDecorView().setSystemUiVisibility(2822);
            }
            window.setLayout(-1, -2);
            window.setGravity(80);
            window.setWindowAnimations(R.style.microapp_i_BottomDialogAnimation);
            window.getDecorView().setSystemUiVisibility(2304);
        }
        dialog.show();
    }
}
