package com.bytedance.ee.bear.document.tips;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.larksuite.component.universe_design.notice.UDNotice;
import org.koin.java.KoinJavaComponent;

public class TipsWithConfirmView extends UDNotice {

    /* renamed from: e */
    private TipsData f17196e;

    /* renamed from: a */
    private void m24934a() {
        setTextButtonPosition(UDNotice.TextButtonPosition.AUTO);
    }

    public TipsWithConfirmView(Context context) {
        this(context, null);
    }

    private void setItemTips(TipsItem cVar) {
        setText(cVar.mo24951b());
    }

    public TipsWithConfirmView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m24936a(TipsItem cVar, AbstractC7947h hVar) {
        setTextButton(cVar.mo24951b());
        setTextButtonListener(new View.OnClickListener(cVar) {
            /* class com.bytedance.ee.bear.document.tips.$$Lambda$TipsWithConfirmView$pkoJvOiXUfjCc9oFlu9cOwbM27M */
            public final /* synthetic */ TipsItem f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                TipsWithConfirmView.m24937a(AbstractC7947h.this, this.f$1, view);
            }
        });
    }

    /* renamed from: a */
    public void mo24931a(String str, AbstractC7947h hVar) {
        this.f17196e = new TipsData(str);
        setVisibility(0);
        m24935a(this.f17196e, hVar);
        ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36641d().mo36658d();
    }

    /* renamed from: a */
    private void m24935a(TipsData bVar, AbstractC7947h hVar) {
        if (bVar != null) {
            for (int i = 0; i < bVar.mo24945a().size(); i++) {
                TipsItem cVar = bVar.mo24945a().get(i);
                if (i == 1) {
                    setItemTips(cVar);
                } else if (i == 2) {
                    m24936a(cVar, hVar);
                }
            }
        }
    }

    public TipsWithConfirmView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24934a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m24937a(AbstractC7947h hVar, TipsItem cVar, View view) {
        if (hVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", (Object) Integer.valueOf(cVar.mo24949a()));
            hVar.mo17188a(jSONObject);
        }
        ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36641d().mo36659e();
    }
}
