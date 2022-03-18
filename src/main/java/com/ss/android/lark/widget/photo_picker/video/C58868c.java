package com.ss.android.lark.widget.photo_picker.video;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a;

/* renamed from: com.ss.android.lark.widget.photo_picker.video.c */
public class C58868c extends AbstractView$OnAttachStateChangeListenerC52070a {

    /* renamed from: a */
    public View.OnClickListener f145637a;

    /* renamed from: b */
    private ViewGroup f145638b;

    /* renamed from: c */
    private AbstractC58871a f145639c;

    /* renamed from: com.ss.android.lark.widget.photo_picker.video.c$a */
    public interface AbstractC58871a {
        /* renamed from: a */
        void mo199109a();
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h
    /* renamed from: a */
    public void mo127010a() {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a
    /* renamed from: b */
    public void mo127043b() {
        super.mo127043b();
        mo178425b(8);
        this.f145638b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.video.C58868c.View$OnClickListenerC588691 */

            public void onClick(View view) {
            }
        });
        this.f145638b.findViewById(R.id.error_close).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.video.C58868c.View$OnClickListenerC588702 */

            public void onClick(View view) {
                if (C58868c.this.f145637a != null) {
                    C58868c.this.f145637a.onClick(view);
                }
            }
        });
    }

    public C58868c(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo199482a(View.OnClickListener onClickListener) {
        this.f145637a = onClickListener;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a
    /* renamed from: a */
    public View mo127009a(Context context) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.online_error_cover, (ViewGroup) null);
        this.f145638b = viewGroup;
        return viewGroup;
    }

    /* renamed from: a */
    public void mo199483a(AbstractC58871a aVar) {
        this.f145639c = aVar;
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h, com.ss.android.lark.player.p2511a.AbstractC52071b
    /* renamed from: a */
    public void mo127014a(int i, Bundle bundle) {
        mo178425b(8);
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h, com.ss.android.lark.player.p2511a.AbstractC52071b
    /* renamed from: c */
    public void mo127025c(int i, Bundle bundle) {
        Log.m165389i("OnlineErrorCover", "onErrorEvent:" + i);
        if (i != -88019) {
            LKUIToast.show(mo178442k(), (int) R.string.Lark_Legacy_RecallMessage);
            return;
        }
        String string = bundle.getString("string_data");
        if (!TextUtils.isEmpty(string) && string.contains("HTTP/1.1 410 Gone")) {
            AbstractC58871a aVar = this.f145639c;
            if (aVar != null) {
                aVar.mo199109a();
            }
            mo178425b(0);
        }
    }
}
