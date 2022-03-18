package com.bytedance.ee.bear.debug.bugtool;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.bytedance.ee.bear.facade.common.BaseService;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.larksuite.suite.R;
import com.ss.ttm.player.MediaPlayer;

public class FloatWindowService extends BaseService implements View.OnTouchListener {

    /* renamed from: a */
    private WindowManager f15035a;

    /* renamed from: b */
    private WindowManager.LayoutParams f15036b;

    /* renamed from: c */
    private DisplayMetrics f15037c;

    /* renamed from: d */
    private PersistenceSharedPreference f15038d;

    /* renamed from: e */
    private PersistenceSharedPreference f15039e;

    /* renamed from: f */
    private String f15040f;

    /* renamed from: g */
    private LinearLayout f15041g;

    /* renamed from: h */
    private float f15042h;

    /* renamed from: i */
    private float f15043i;

    /* renamed from: j */
    private boolean f15044j;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        if (this.f15041g.isAttachedToWindow()) {
            this.f15035a.removeView(this.f15041g);
        }
        super.onDestroy();
    }

    @Override // com.bytedance.ee.bear.facade.common.BaseService
    public void onCreate() {
        super.onCreate();
        this.f15038d = new PersistenceSharedPreference("debug_config");
        PersistenceSharedPreference aVar = new PersistenceSharedPreference("bug_tool_sp");
        this.f15039e = aVar;
        this.f15040f = aVar.getString("bug_tool_reporter", "");
        this.f15035a = (WindowManager) getSystemService("window");
        this.f15036b = new WindowManager.LayoutParams();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f15036b.type = 2038;
        } else {
            this.f15036b.type = 2002;
        }
        this.f15036b.flags = 8;
        this.f15036b.format = 1;
        this.f15036b.gravity = 8388659;
        this.f15036b.alpha = 0.8f;
        this.f15037c = new DisplayMetrics();
        this.f15035a.getDefaultDisplay().getMetrics(this.f15037c);
        this.f15036b.width = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
        this.f15036b.height = 100;
        this.f15036b.x = this.f15037c.widthPixels - this.f15036b.width;
        this.f15036b.y = (int) (((double) this.f15037c.heightPixels) * 0.25d);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this).inflate(R.layout.bug_tool_view_float_window, (ViewGroup) null);
        this.f15041g = linearLayout;
        Button button = (Button) linearLayout.findViewById(R.id.bug_tool_btn_submit_bug);
        Button button2 = (Button) this.f15041g.findViewById(R.id.bug_tool_btn_config);
        Button button3 = (Button) this.f15041g.findViewById(R.id.bug_tool_btn_close);
        button.setOnTouchListener(this);
        button2.setOnTouchListener(this);
        button3.setOnTouchListener(this);
        button.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.debug.bugtool.$$Lambda$FloatWindowService$A7AVykwJhdbGWKQyNs5a2QCzMoY */

            public final void onClick(View view) {
                FloatWindowService.lambda$A7AVykwJhdbGWKQyNs5a2QCzMoY(FloatWindowService.this, view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.debug.bugtool.$$Lambda$FloatWindowService$6CEJpiXB8gR_zLMwCixB8Ti5kwo */

            public final void onClick(View view) {
                FloatWindowService.lambda$6CEJpiXB8gR_zLMwCixB8Ti5kwo(FloatWindowService.this, view);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.debug.bugtool.$$Lambda$FloatWindowService$jhfeOvdPZXGNV7lo4gpVw7ER3Ek */

            public final void onClick(View view) {
                FloatWindowService.lambda$jhfeOvdPZXGNV7lo4gpVw7ER3Ek(FloatWindowService.this, view);
            }
        });
        this.f15035a.addView(this.f15041g, this.f15036b);
        if ("".equals(this.f15040f)) {
            button2.performClick();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21499a(View view) {
        this.f15038d.mo34037a("bug_tool_enable", false);
        stopSelf();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m21502c(View view) {
        Intent intent = new Intent(this, BugSubmitAcitivity.class);
        intent.setFlags(268435456);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m21501b(View view) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this).inflate(R.layout.bug_tool_dialog_config, (ViewGroup) null);
        EditText editText = (EditText) linearLayout.findViewById(R.id.bug_tool_et_reporter);
        editText.setText(this.f15040f);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("缺陷报告人（请输入邮箱前缀）");
        builder.setView(linearLayout);
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener(editText) {
            /* class com.bytedance.ee.bear.debug.bugtool.$$Lambda$FloatWindowService$tykSvYAguZcqoMGjdG8et4gpk8 */
            public final /* synthetic */ EditText f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                FloatWindowService.m269148lambda$tykSvYAguZcqoMGjdG8et4gpk8(FloatWindowService.this, this.f$1, dialogInterface, i);
            }
        });
        builder.setNegativeButton("取消", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        if (Build.VERSION.SDK_INT >= 26) {
            create.getWindow().setType(2038);
        } else {
            create.getWindow().setType(2003);
        }
        create.show();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f15042h = motionEvent.getRawX();
            this.f15043i = motionEvent.getRawY();
            this.f15044j = false;
        } else if (action == 1) {
            this.f15036b.x = Math.max(0, Math.min(this.f15037c.widthPixels - this.f15036b.width, this.f15036b.x));
            this.f15036b.y = Math.max(0, Math.min(this.f15037c.heightPixels - this.f15036b.height, this.f15036b.y));
            if (!this.f15044j) {
                view.performClick();
            }
        } else if (action == 2 && (this.f15044j || Math.abs(this.f15042h - motionEvent.getRawX()) >= 15.0f || Math.abs(this.f15043i - motionEvent.getRawY()) >= 15.0f)) {
            WindowManager.LayoutParams layoutParams = this.f15036b;
            layoutParams.x = (int) ((((float) layoutParams.x) + rawX) - this.f15042h);
            WindowManager.LayoutParams layoutParams2 = this.f15036b;
            layoutParams2.y = (int) ((((float) layoutParams2.y) + rawY) - this.f15043i);
            this.f15042h = rawX;
            this.f15043i = rawY;
            this.f15035a.updateViewLayout(this.f15041g, this.f15036b);
            this.f15044j = true;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21500a(EditText editText, DialogInterface dialogInterface, int i) {
        String trim = editText.getText().toString().trim();
        this.f15040f = trim;
        this.f15039e.mo34037a("bug_tool_reporter", trim);
    }
}
