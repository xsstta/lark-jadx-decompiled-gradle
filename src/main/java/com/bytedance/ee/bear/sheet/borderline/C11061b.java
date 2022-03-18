package com.bytedance.ee.bear.sheet.borderline;

import android.os.Bundle;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.sheet.toolbar2.C11342f;

/* renamed from: com.bytedance.ee.bear.sheet.borderline.b */
public class C11061b extends AbstractC1142af {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private C1177w<BorderLineData> borderLineData;
    private AbstractC11062a callback;
    private C1177w<Boolean> isClearBorderLinePanel;

    /* renamed from: com.bytedance.ee.bear.sheet.borderline.b$a */
    public interface AbstractC11062a {
        /* renamed from: a */
        <V> void mo42146a(V v);
    }

    public void clearBorderLinePanel() {
        isClearBorderLinePanel().mo5929b(Boolean.TRUE);
    }

    public C1177w<BorderLineData> getBorderLineData() {
        if (this.borderLineData == null) {
            this.borderLineData = new C1177w<>();
        }
        return this.borderLineData;
    }

    public C1177w<Boolean> isClearBorderLinePanel() {
        if (this.isClearBorderLinePanel == null) {
            this.isClearBorderLinePanel = new C1177w<>();
        }
        return this.isClearBorderLinePanel;
    }

    public void setCallback(AbstractC11062a aVar) {
        this.callback = aVar;
    }

    public void onBorderLineSelected(String str, String str2, String str3) {
        if (this.callback != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("border", (Object) str);
            jSONObject.put("color", (Object) str2);
            jSONObject.put("choose", (Object) str3);
            this.callback.mo42146a(jSONObject);
        }
    }

    public void openBorderLinePanel(Fragment fragment, BorderLineData borderLineData2, AbstractC11062a aVar) {
        Bundle bundle;
        getBorderLineData().mo5929b(borderLineData2);
        this.callback = aVar;
        if (fragment.getArguments() == null) {
            bundle = new Bundle();
        } else {
            bundle = fragment.getArguments();
        }
        ((DialogInterface$OnCancelListenerC1021b) Fragment.instantiate(fragment.getActivity(), C11342f.class.getName(), bundle)).mo5511a(fragment.getActivity().getSupportFragmentManager(), "select_border");
    }
}
