package com.ss.android.lark.pin.impl.v3;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.p2466a.AbstractC51472a;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.widget.p2932c.C58354g;
import java.io.File;

/* renamed from: com.ss.android.lark.pin.impl.v3.i */
public class C51641i {
    /* renamed from: a */
    public static boolean m200348a(final Context context, View view, float f, float f2, final Object obj) {
        return C58354g.m226229a(context, view, f, f2, new C58354g.AbstractC58372a() {
            /* class com.ss.android.lark.pin.impl.v3.C51641i.C516421 */

            @Override // com.ss.android.lark.widget.p2932c.C58354g.AbstractC58372a
            /* renamed from: a */
            public void mo122329a(final IGetDataCallback<File> iGetDataCallback) {
                ImageLoader.with(context).load(obj).downloadOnly(new C38818i<File>() {
                    /* class com.ss.android.lark.pin.impl.v3.C51641i.C516421.C516431 */

                    /* renamed from: a */
                    public void mo49248a(File file) {
                        super.mo49248a((Object) file);
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(file);
                        }
                    }

                    @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
                    /* renamed from: a */
                    public void mo49247a(Drawable drawable) {
                        super.mo49247a(drawable);
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onError(new ErrorResult(context.getString(R.string.Lark_Legacy_SaveFailTip)));
                        }
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public static boolean m200347a(Context context, View view, float f, float f2, Message message) {
        if (message.getSendStatus() != SendStatus.SUCCESS) {
            return false;
        }
        MediaContent mediaContent = (MediaContent) message.getContent();
        String key = mediaContent.getKey();
        return m200349a(context, view, f, f2, message.getId(), message.getSourceId(), message.getChatId(), mediaContent.getSource().getNumber(), key, C57881t.m224618a(context, mediaContent.getMime(), key));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m200346a(Context context, String str, String str2, String str3, int i, String str4, String str5, View view) {
        AbstractC51472a b = PinModule.m199585b();
        if (b != null && (context instanceof Activity)) {
            C57805b.m224333d((Activity) context, new C57805b.AbstractC57809a(context, b, str, str2, str3, i, str4, str5) {
                /* class com.ss.android.lark.pin.impl.v3.$$Lambda$i$gGnHI7JHym1QTskBupA6_OfqlU */
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ AbstractC51472a f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ String f$3;
                public final /* synthetic */ String f$4;
                public final /* synthetic */ int f$5;
                public final /* synthetic */ String f$6;
                public final /* synthetic */ String f$7;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                    this.f$6 = r7;
                    this.f$7 = r8;
                }

                @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                public final void permissionGranted(boolean z) {
                    C51641i.m200345a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, z);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m200345a(final Context context, AbstractC51472a aVar, String str, String str2, String str3, int i, String str4, String str5, boolean z) {
        if (z) {
            aVar.mo144033g().mo144056a(context, str, str2, str3, i, str4, str5, new IGetDataCallback<String>() {
                /* class com.ss.android.lark.pin.impl.v3.C51641i.C516442 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    LKUIToast.loadSuccess(context, (int) R.string.Lark_Legacy_SaveSuccess);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    LKUIToast.loadFail(context, (int) R.string.Lark_Legacy_SaveFailTip);
                }
            }, null);
            LKUIToast.showLoading(context, (int) R.string.Lark_Legacy_FileDownloading);
        }
    }

    /* renamed from: a */
    public static boolean m200349a(Context context, View view, float f, float f2, String str, String str2, String str3, int i, String str4, String str5) {
        return C58354g.m226228a(context, view, f, f2, new View.OnClickListener(context, str, str2, str3, i, str4, str5) {
            /* class com.ss.android.lark.pin.impl.v3.$$Lambda$i$pNT4cAZNvgcNII7q0lvv6b0Xd4 */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ int f$4;
            public final /* synthetic */ String f$5;
            public final /* synthetic */ String f$6;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
            }

            public final void onClick(View view) {
                C51641i.m200346a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, view);
            }
        });
    }
}
