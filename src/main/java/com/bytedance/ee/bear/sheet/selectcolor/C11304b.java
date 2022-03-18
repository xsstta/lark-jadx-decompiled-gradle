package com.bytedance.ee.bear.sheet.selectcolor;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.sheet.toolbar2.C11344g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.sheet.selectcolor.b */
public class C11304b extends AbstractC1142af {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected AbstractC11305a callback;
    private C1177w<SheetSelectColorData> selectColorData;
    private Map<String, C1177w<SheetSelectColorData>> selectColorDatas = new HashMap();

    /* renamed from: com.bytedance.ee.bear.sheet.selectcolor.b$a */
    public interface AbstractC11305a {
        void onColorSelected(String str);
    }

    public C1177w<SheetSelectColorData> getSelectColorData() {
        if (this.selectColorData == null) {
            this.selectColorData = new C1177w<>();
        }
        return this.selectColorData;
    }

    public void setCallback(AbstractC11305a aVar) {
        this.callback = aVar;
    }

    public C1177w<SheetSelectColorData> getSelectColorData(String str) {
        C1177w<SheetSelectColorData> wVar = this.selectColorDatas.get(str);
        if (wVar != null) {
            return wVar;
        }
        C1177w<SheetSelectColorData> wVar2 = new C1177w<>();
        this.selectColorDatas.put(str, wVar2);
        return wVar2;
    }

    public void onTopicColorSelected(String str) {
        SheetSelectColorData b = getSelectColorData().mo5927b();
        if (b != null) {
            onSpecificColorSelected(SheetSelectColorData.findDefaultColor(b.getColorSchemeList(), str));
        }
    }

    public void onSpecificColorSelected(String str) {
        String str2;
        SheetSelectColorData b = getSelectColorData().mo5927b();
        if (b != null) {
            str2 = b.getSelectedColor();
        } else {
            str2 = null;
        }
        if (this.callback != null && !TextUtils.equals(str2, str)) {
            this.callback.onColorSelected(str);
        }
    }

    public void onTopicColorSelected(String str, String str2) {
        SheetSelectColorData b = getSelectColorData(str).mo5927b();
        if (b != null) {
            onSpecificColorSelected(str, SheetSelectColorData.findDefaultColor(b.getColorSchemeList(), str2));
        }
    }

    public void openSelectColorPanel(Fragment fragment, AbstractC11305a aVar) {
        Bundle bundle;
        this.callback = aVar;
        if (fragment.getArguments() == null) {
            bundle = new Bundle();
        } else {
            bundle = fragment.getArguments();
        }
        ((DialogInterface$OnCancelListenerC1021b) Fragment.instantiate(fragment.getActivity(), C11344g.class.getName(), bundle)).mo5511a(fragment.getActivity().getSupportFragmentManager(), "select_color");
    }

    public void onSpecificColorSelected(String str, String str2) {
        String str3;
        SheetSelectColorData b = getSelectColorData(str).mo5927b();
        if (b != null) {
            str3 = b.getSelectedColor();
        } else {
            str3 = null;
        }
        if (this.callback != null && !TextUtils.equals(str3, str2)) {
            this.callback.onColorSelected(str2);
        }
    }
}
