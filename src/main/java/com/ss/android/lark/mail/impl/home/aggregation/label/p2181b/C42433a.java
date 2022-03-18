package com.ss.android.lark.mail.impl.home.aggregation.label.p2181b;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.home.aggregation.label.p2180a.C42432a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.home.aggregation.label.b.a */
public class C42433a {

    /* renamed from: a */
    public static final int[] f108031a = {R.color.lkui_B500, R.color.lkui_I500, R.color.lkui_P500, R.color.lkui_V500, R.color.lkui_C500, R.color.lkui_R500, R.color.lkui_O500, R.color.lkui_Y600, R.color.lkui_L600, R.color.lkui_G600, R.color.lkui_T700, R.color.lkui_W700};

    /* renamed from: b */
    public static final int[] f108032b = {R.color.lkui_B500, R.color.lkui_I500, R.color.lkui_P500, R.color.lkui_V500, R.color.lkui_C500, R.color.lkui_R500, R.color.lkui_O500, R.color.lkui_Y500, R.color.lkui_L500, R.color.lkui_G500, R.color.lkui_T500, R.color.lkui_W500};

    /* renamed from: c */
    public static final int[] f108033c = {R.color.lkui_B600, R.color.lkui_I600, R.color.lkui_P600, R.color.lkui_V600, R.color.lkui_C600, R.color.lkui_R600, R.color.lkui_O600, R.color.lkui_Y600, R.color.lkui_L600, R.color.lkui_G600, R.color.lkui_T600, R.color.lkui_W600};

    /* renamed from: d */
    public static final int[] f108034d = {R.color.lkui_B100, R.color.lkui_I100, R.color.lkui_P100, R.color.lkui_V100, R.color.lkui_C100, R.color.lkui_R100, R.color.lkui_O100, R.color.lkui_Y200, R.color.lkui_L200, R.color.lkui_G200, R.color.lkui_T200, R.color.lkui_W200};

    /* renamed from: f */
    private static C42433a f108035f;

    /* renamed from: e */
    private List<C42432a> f108036e = new ArrayList();

    /* renamed from: b */
    public List<C42432a> mo152720b() {
        return this.f108036e;
    }

    private C42433a() {
    }

    /* renamed from: a */
    public static synchronized C42433a m169436a() {
        C42433a aVar;
        synchronized (C42433a.class) {
            if (f108035f == null) {
                f108035f = new C42433a();
            }
            aVar = f108035f;
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo152719a(Context context, IGetDataCallback iGetDataCallback) {
        Log.m165388i("MailLabelColorModel requestColorList start");
        this.f108036e.clear();
        int i = 0;
        while (true) {
            int[] iArr = f108031a;
            if (i >= iArr.length) {
                break;
            }
            C42432a aVar = new C42432a();
            aVar.mo152713a(context.getResources().getColor(iArr[i]));
            aVar.mo152716b(context.getResources().getColor(f108034d[i]));
            this.f108036e.add(aVar);
            i++;
        }
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(this.f108036e);
        }
    }
}
