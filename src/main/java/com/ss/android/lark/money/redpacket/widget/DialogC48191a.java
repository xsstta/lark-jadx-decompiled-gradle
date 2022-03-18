package com.ss.android.lark.money.redpacket.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.money.redpacket.widget.a */
public class DialogC48191a extends BaseDialog {

    /* renamed from: a */
    private Handler f121268a = new HandlerC48192a(this);

    /* renamed from: a */
    public void mo168644a() {
        super.show();
    }

    @Override // com.larksuite.framework.ui.BaseDialog
    public void dismiss() {
        this.f121268a.removeMessages(0);
        super.dismiss();
    }

    @Override // com.larksuite.framework.ui.BaseDialog
    public void show() {
        this.f121268a.sendEmptyMessageDelayed(0, 300);
    }

    /* renamed from: com.ss.android.lark.money.redpacket.widget.a$a */
    private static class HandlerC48192a extends Handler {

        /* renamed from: a */
        private WeakReference<DialogC48191a> f121269a;

        public HandlerC48192a(DialogC48191a aVar) {
            this.f121269a = new WeakReference<>(aVar);
        }

        public void handleMessage(Message message) {
            DialogC48191a aVar = this.f121269a.get();
            if (aVar != null && message.what == 0) {
                aVar.mo168644a();
            }
        }
    }

    /* renamed from: a */
    private void m190203a(Context context) {
        setContentView(LayoutInflater.from(context).inflate(R.layout.red_packet_loading, (ViewGroup) null));
    }

    public DialogC48191a(Context context) {
        super(context, R.style.CommonDialog);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        m190203a(context);
    }
}
