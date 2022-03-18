package com.bytedance.ee.webapp.menu;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.menu.AbstractC13135b;
import com.bytedance.ee.larkbrand.menu.C13141f;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.larksuite.component.webview.container.dto.C25838g;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class WebMoreCommonItem extends C25838g {

    /* renamed from: a */
    public static final int OpenPlatform_AppActions_UnfavoriteBttn = 2131838397;

    /* renamed from: b */
    public static final int OpenPlatform_AppActions_FavoriteBttn = 2131838394;

    /* renamed from: f */
    private static final int f36067f = 2131234584;

    /* renamed from: g */
    private static final int f36068g = 2131234574;

    /* renamed from: c */
    public boolean f36069c;

    /* renamed from: d */
    AbstractC13812a f36070d;

    /* renamed from: e */
    AbstractC13135b f36071e;

    /* renamed from: h */
    private IAppContext f36072h;

    /* renamed from: i */
    private String f36073i;

    /* renamed from: j */
    private OnSingleClickListener f36074j;

    /* renamed from: com.bytedance.ee.webapp.menu.WebMoreCommonItem$a */
    public interface AbstractC13812a {
        /* renamed from: a */
        void mo50895a(Type type, boolean z, C13813a aVar);
    }

    public enum Type {
        ADD("add"),
        REMOVE("remove");
        
        private String value;

        public String getValue() {
            return this.value;
        }

        private Type(String str) {
            this.value = str;
        }
    }

    public void P_() {
        String str;
        AppBrandLogger.m52830i("WebMoreCommonItem", "handleDeleteCommon");
        AbstractC13135b bVar = this.f36071e;
        if (bVar != null && (str = this.f36073i) != null) {
            bVar.mo49190c(str, new C13141f.AbstractC13143a() {
                /* class com.bytedance.ee.webapp.menu.WebMoreCommonItem.C138102 */

                @Override // com.bytedance.ee.larkbrand.menu.C13141f.AbstractC13143a
                /* renamed from: a */
                public void mo49197a(SendHttpResponse sendHttpResponse, C13141f.C13144b bVar) {
                    WebMoreCommonItem.this.f36069c = false;
                    WebMoreCommonItem webMoreCommonItem = WebMoreCommonItem.this;
                    webMoreCommonItem.mo50893b(webMoreCommonItem.f36069c);
                    WebMoreCommonItem.this.mo50890a(Type.REMOVE, true, null);
                }

                @Override // com.bytedance.ee.larkbrand.menu.C13141f.AbstractC13143a
                /* renamed from: a */
                public void mo49198a(ErrorResult errorResult, C13141f.C13144b bVar) {
                    AppBrandLogger.m52830i("WebMoreCommonItem", "delete onError " + errorResult);
                    WebMoreCommonItem.this.mo50890a(Type.REMOVE, false, new C13813a(errorResult.getErrorCode(), errorResult.getDisplayMsg()));
                }
            });
        }
    }

    public void Q_() {
        String str;
        AppBrandLogger.m52830i("WebMoreCommonItem", "handleAddCommon");
        AbstractC13135b bVar = this.f36071e;
        if (bVar != null && (str = this.f36073i) != null) {
            bVar.mo49189b(str, new C13141f.AbstractC13143a() {
                /* class com.bytedance.ee.webapp.menu.WebMoreCommonItem.C138113 */

                @Override // com.bytedance.ee.larkbrand.menu.C13141f.AbstractC13143a
                /* renamed from: a */
                public void mo49197a(SendHttpResponse sendHttpResponse, C13141f.C13144b bVar) {
                    WebMoreCommonItem.this.f36069c = true;
                    WebMoreCommonItem webMoreCommonItem = WebMoreCommonItem.this;
                    webMoreCommonItem.mo50893b(webMoreCommonItem.f36069c);
                    WebMoreCommonItem.this.mo50890a(Type.ADD, true, null);
                }

                @Override // com.bytedance.ee.larkbrand.menu.C13141f.AbstractC13143a
                /* renamed from: a */
                public void mo49198a(ErrorResult errorResult, C13141f.C13144b bVar) {
                    AppBrandLogger.m52830i("WebMoreCommonItem", "add onError " + errorResult);
                    WebMoreCommonItem.this.mo50890a(Type.ADD, false, new C13813a(errorResult.getErrorCode(), errorResult.getDisplayMsg()));
                }
            });
        }
    }

    /* renamed from: a */
    public void mo50891a(String str) {
        this.f36073i = str;
    }

    /* renamed from: a */
    public void mo50892a(boolean z) {
        this.f36069c = z;
    }

    /* renamed from: b */
    public void mo50893b(boolean z) {
        int i;
        int i2;
        if (z) {
            i = f36067f;
        } else {
            i = f36068g;
        }
        mo91918a(i);
        Context applicationContext = this.f36072h.getApplicationContext();
        if (z) {
            i2 = OpenPlatform_AppActions_UnfavoriteBttn;
        } else {
            i2 = OpenPlatform_AppActions_FavoriteBttn;
        }
        mo91921b(UIUtils.getString(applicationContext, i2));
    }

    /* renamed from: a */
    public void mo50890a(Type type, boolean z, C13813a aVar) {
        if (this.f36070d != null) {
            AppBrandLogger.m52830i("WebMoreCommonItem", "notify common menu changed " + type.getValue() + " " + z);
            this.f36070d.mo50895a(type, z, aVar);
        }
    }

    public WebMoreCommonItem(IAppContext iAppContext, int i, String str, AbstractC13812a aVar) {
        super(i, str, null);
        C138091 r3 = new OnSingleClickListener() {
            /* class com.bytedance.ee.webapp.menu.WebMoreCommonItem.C138091 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (WebMoreCommonItem.this.f36069c) {
                    WebMoreCommonItem.this.P_();
                } else {
                    WebMoreCommonItem.this.Q_();
                }
            }
        };
        this.f36074j = r3;
        this.f36072h = iAppContext;
        mo91919a(r3);
        this.f36070d = aVar;
        if (iAppContext != null) {
            this.f36071e = (AbstractC13135b) iAppContext.findServiceByInterface(AbstractC13135b.class);
        }
    }
}
