package com.bytedance.ee.bear.facade.common.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import com.bytedance.ee.bear.facade.common.widget.ErrorTipsView;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

public class ErrorTipsView extends UDNotice {

    public enum TipsType {
        warning,
        error,
        normal
    }

    /* renamed from: com.bytedance.ee.bear.facade.common.widget.ErrorTipsView$a */
    public interface AbstractC7725a {
        /* renamed from: a */
        void mo24919a(String str, String str2);
    }

    /* renamed from: a */
    private void m30880a() {
        setIconButton(R.drawable.ud_icon_close_small_outlined);
    }

    /* renamed from: com.bytedance.ee.bear.facade.common.widget.ErrorTipsView$3 */
    static /* synthetic */ class C77243 {

        /* renamed from: a */
        static final /* synthetic */ int[] f20854a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.ee.bear.facade.common.widget.ErrorTipsView$TipsType[] r0 = com.bytedance.ee.bear.facade.common.widget.ErrorTipsView.TipsType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.facade.common.widget.ErrorTipsView.C77243.f20854a = r0
                com.bytedance.ee.bear.facade.common.widget.ErrorTipsView$TipsType r1 = com.bytedance.ee.bear.facade.common.widget.ErrorTipsView.TipsType.warning     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.facade.common.widget.ErrorTipsView.C77243.f20854a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.facade.common.widget.ErrorTipsView$TipsType r1 = com.bytedance.ee.bear.facade.common.widget.ErrorTipsView.TipsType.error     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.facade.common.widget.ErrorTipsView.C77243.f20854a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.facade.common.widget.ErrorTipsView$TipsType r1 = com.bytedance.ee.bear.facade.common.widget.ErrorTipsView.TipsType.normal     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.facade.common.widget.ErrorTipsView.C77243.<clinit>():void");
        }
    }

    public ErrorTipsView(Context context) {
        this(context, null);
    }

    public ErrorTipsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30883a(String str, Throwable th) throws Exception {
        C13479a.m54758a("ErrorTipsView", "err happens when try to render errview : " + th.getMessage());
        setText(str);
    }

    public ErrorTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30880a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Pair m30879a(String str, String str2, String str3) throws Exception {
        int lastIndexOf = str.lastIndexOf(str2);
        int length = str2.length() + lastIndexOf;
        if (lastIndexOf != -1) {
            C13479a.m54772d("ErrorTipsView", "found linktext in : " + lastIndexOf + " - " + length + "in thread:" + Thread.currentThread().getName());
            return new Pair(Integer.valueOf(lastIndexOf), Integer.valueOf(length));
        }
        throw new RuntimeException("can not find target linktext:" + str2 + " in :" + str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30882a(String str, AbstractC7725a aVar, String str2, Pair pair) throws Exception {
        setText(str);
        mo91029a(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), new View.OnClickListener(str2) {
            /* class com.bytedance.ee.bear.facade.common.widget.$$Lambda$ErrorTipsView$0FP4ccQOgka1NrS5iyQs8C5SbFs */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                ErrorTipsView.AbstractC7725a.this.mo24919a("linkUrl", this.f$1);
            }
        });
        C13479a.m54772d("ErrorTipsView", "render complete in thread : " + Thread.currentThread().getName());
    }

    /* renamed from: a */
    public void mo30225a(String str, String str2, String str3, boolean z, final String str4, String str5, TipsType tipsType, final AbstractC7725a aVar) {
        int i = C77243.f20854a[tipsType.ordinal()];
        if (i == 1) {
            setType(UDNotice.Type.WARNING);
            setIconColorful(true);
            setIcon(R.drawable.ud_icon_warning_colorful);
        } else if (i != 2) {
            setType(UDNotice.Type.INFO);
            setIconColorful(true);
            setIcon(R.drawable.ud_icon_info_colorful);
        } else {
            setType(UDNotice.Type.ERROR);
            setIconColorful(true);
            setIcon(R.drawable.ud_icon_error_colorful);
        }
        mo91032b(z);
        if (z) {
            setIconButtonListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.facade.common.widget.ErrorTipsView.C77221 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    aVar.mo24919a("close", "");
                }
            });
        }
        setTextButtonPosition(UDNotice.TextButtonPosition.AUTO);
        if (!TextUtils.isEmpty(str5)) {
            setTextButton(str5);
            setTextButtonListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.facade.common.widget.ErrorTipsView.C77232 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    aVar.mo24919a(str4, "");
                }
            });
        }
        if (TextUtils.isEmpty(str)) {
            C13479a.m54758a("ErrorTipsView", "empty whole text");
            return;
        }
        C13479a.m54772d("ErrorTipsView", "start render error tips");
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            C13479a.m54772d("ErrorTipsView", "no need to render");
            setText(str);
            return;
        }
        AbstractC68307f.m265083a(str).mo237985a(C11678b.m48480d()).mo238020d(new Function(str, str2) {
            /* class com.bytedance.ee.bear.facade.common.widget.$$Lambda$ErrorTipsView$VPhADjbfwgrP1y5B3Xzw5LeE2G0 */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ErrorTipsView.m30879a(this.f$0, this.f$1, (String) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(str, aVar, str3) {
            /* class com.bytedance.ee.bear.facade.common.widget.$$Lambda$ErrorTipsView$IFuXb4qsBrNuMQKcmaj18ZqO_k */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ ErrorTipsView.AbstractC7725a f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ErrorTipsView.this.m30882a(this.f$1, this.f$2, this.f$3, (Pair) obj);
            }
        }, new Consumer(str) {
            /* class com.bytedance.ee.bear.facade.common.widget.$$Lambda$ErrorTipsView$HIK3sTzdp8J0OyjxdHU5CiFrZGM */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ErrorTipsView.this.m30883a((ErrorTipsView) this.f$1, (String) ((Throwable) obj));
            }
        });
    }
}
