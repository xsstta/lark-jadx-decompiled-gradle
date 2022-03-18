package com.ss.android.lark.chatwindow.view.burn;

import android.content.Context;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class CountDownView extends AppCompatTextView {

    /* renamed from: a */
    public long f91104a;

    /* renamed from: b */
    public boolean f91105b;

    /* renamed from: c */
    private AbstractC35265a f91106c;

    /* renamed from: e */
    private CountDownTimer f91107e;

    /* renamed from: f */
    private volatile long f91108f;

    /* renamed from: g */
    private volatile long f91109g;

    /* renamed from: h */
    private volatile boolean f91110h;

    /* renamed from: com.ss.android.lark.chatwindow.view.burn.CountDownView$a */
    public interface AbstractC35265a {
        void onFinish();
    }

    /* renamed from: c */
    public void mo129802c() {
        mo129801b();
        m137753f();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo129798a();
    }

    /* renamed from: a */
    public void mo129798a() {
        CountDownTimer countDownTimer = this.f91107e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f91107e = null;
        }
    }

    /* renamed from: b */
    public void mo129801b() {
        this.f91110h = false;
        CountDownTimer countDownTimer = this.f91107e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f91107e = null;
        }
    }

    /* renamed from: d */
    public boolean mo129803d() {
        if (this.f91108f <= SystemClock.elapsedRealtime()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void mo129804e() {
        this.f91110h = false;
        AbstractC35265a aVar = this.f91106c;
        if (aVar != null) {
            aVar.onFinish();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f91110h) {
            return;
        }
        if (mo129803d()) {
            mo129804e();
        } else {
            mo129802c();
        }
    }

    /* renamed from: f */
    private void m137753f() {
        long j;
        this.f91110h = true;
        long elapsedRealtime = this.f91108f - SystemClock.elapsedRealtime();
        if (this.f91105b) {
            j = this.f91104a;
        } else {
            j = elapsedRealtime;
        }
        setText(mo129797a(j));
        if (!this.f91105b) {
            this.f91107e = new CountDownTimer(elapsedRealtime, this.f91109g) {
                /* class com.ss.android.lark.chatwindow.view.burn.CountDownView.CountDownTimerC352641 */

                /* renamed from: b */
                private long f91112b = -1;

                public void onFinish() {
                    if (!CountDownView.this.f91105b) {
                        CountDownView.this.mo129804e();
                    }
                }

                public void onTick(long j) {
                    if (CountDownView.this.f91105b) {
                        j = CountDownView.this.f91104a;
                    }
                    if (j != this.f91112b) {
                        CountDownView countDownView = CountDownView.this;
                        countDownView.setText(countDownView.mo129797a(j));
                        this.f91112b = j;
                    }
                }
            }.start();
        }
    }

    public void setOnCountDownListener(AbstractC35265a aVar) {
        this.f91106c = aVar;
    }

    public CountDownView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public String mo129797a(long j) {
        int round = (int) Math.round((((double) j) * 1.0d) / 1000.0d);
        int i = round / 86400;
        int i2 = round % 86400;
        int i3 = i2 / 3600;
        int i4 = i2 % 3600;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i > 0) {
            return String.format("%dd:%02dh:%02dm", Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i5));
        }
        return String.format("%02dh:%02dm:%02ds", Integer.valueOf(i3), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    public CountDownView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public synchronized void mo129799a(long j, long j2) {
        m137752a(j, j, j2, false);
    }

    public CountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f91104a = -1;
        setMinimumWidth((int) getPaint().measureText(mo129797a(0)));
    }

    /* renamed from: a */
    public synchronized void mo129800a(long j, long j2, long j3) {
        m137752a(j, j2, j3, true);
    }

    /* renamed from: a */
    private synchronized void m137752a(long j, long j2, long j3, boolean z) {
        mo129801b();
        this.f91104a = j;
        this.f91108f = SystemClock.elapsedRealtime() + j2;
        this.f91109g = j3;
        this.f91105b = z;
        m137753f();
    }
}
