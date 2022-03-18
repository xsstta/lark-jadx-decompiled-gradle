package com.ss.android.lark.chat.chatwindow.chat.p1613b;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.MediaContentVO;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.widget.p2932c.C58354g;
import com.ss.android.lark.widget.richtext.Image;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.io.File;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.g */
public class C33143g {
    /* renamed from: a */
    public static Object m128103a(Image image) {
        String str = "";
        if (image == null) {
            return str;
        }
        String token = image.getToken();
        if (!CollectionUtils.isEmpty(image.getUrls())) {
            str = image.getUrls().get(0);
        }
        if (TextUtils.isEmpty(token)) {
            return str;
        }
        String key = image.getKey();
        if (TextUtils.isEmpty(key)) {
            return str;
        }
        return new C38824b(key);
    }

    /* renamed from: a */
    public static boolean m128109a(final Context context, View view, float f, float f2, final Object obj) {
        return C58354g.m226229a(context, view, f, f2, new C58354g.AbstractC58372a() {
            /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.C33143g.C331441 */

            @Override // com.ss.android.lark.widget.p2932c.C58354g.AbstractC58372a
            /* renamed from: a */
            public void mo122329a(final IGetDataCallback<File> iGetDataCallback) {
                ImageLoader.with(context).load(obj).downloadOnly(new C38818i<File>() {
                    /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.C33143g.C331441.C331451 */

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
    public static boolean m128106a(Context context, View view, float f, float f2, AbsMessageVO<MediaContentVO> aVar) {
        if (aVar.mo121656B() != SendStatus.SUCCESS) {
            return false;
        }
        MediaContentVO g = aVar.mo121699g();
        String a = g.mo121854a();
        return m128111a(context, view, f, f2, aVar.mo121681a(), aVar.mo121697e(), aVar.mo121692b(), g.mo121862e().getNumber(), a, C57881t.m224618a(context, g.mo121861d(), a));
    }

    /* renamed from: a */
    public static boolean m128107a(Context context, View view, float f, float f2, Message message) {
        if (message.getSendStatus() != SendStatus.SUCCESS) {
            return false;
        }
        MediaContent mediaContent = (MediaContent) message.getContent();
        String key = mediaContent.getKey();
        return m128111a(context, view, f, f2, message.getId(), message.getSourceId(), message.getChatId(), mediaContent.getSource().getNumber(), key, C57881t.m224618a(context, mediaContent.getMime(), key));
    }

    /* renamed from: a */
    public static boolean m128108a(Context context, View view, float f, float f2, RichTextElement.MediaProperty mediaProperty, AbsMessageVO<PostContentVO> aVar) {
        if (aVar.mo121656B() != SendStatus.SUCCESS) {
            return false;
        }
        String key = mediaProperty.getKey();
        return m128111a(context, view, f, f2, aVar.mo121681a(), aVar.mo121697e(), aVar.mo121692b(), mediaProperty.getSource().getNumber(), key, C57881t.m224618a(context, mediaProperty.getMime(), key));
    }

    /* renamed from: a */
    public static boolean m128110a(final Context context, View view, float f, float f2, final Object obj, View.OnClickListener onClickListener, boolean z) {
        return C58354g.m226230a(context, view, f, f2, new C58354g.AbstractC58372a() {
            /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.C33143g.C331473 */

            @Override // com.ss.android.lark.widget.p2932c.C58354g.AbstractC58372a
            /* renamed from: a */
            public void mo122329a(final IGetDataCallback<File> iGetDataCallback) {
                ImageLoader.with(context).load(obj).downloadOnly(new C38818i<File>() {
                    /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.C33143g.C331473.C331481 */

                    /* renamed from: a */
                    public void mo49248a(File file) {
                        super.mo49248a((Object) file);
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(file);
                        }
                    }
                });
            }
        }, onClickListener, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m128104a(Context context, String str, String str2, String str3, int i, String str4, String str5, View view) {
        if (context instanceof Activity) {
            C57805b.m224333d((Activity) context, new C57805b.AbstractC57809a(context, str, str2, str3, i, str4, str5) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$g$3igIAkgN6fcQpwsid90Lncn_q8 */
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

                @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                public final void permissionGranted(boolean z) {
                    C33143g.m270358lambda$3igIAkgN6fcQpwsid90Lncn_q8(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, z);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m128105a(final Context context, String str, String str2, String str3, int i, String str4, String str5, boolean z) {
        if (z) {
            C29990c.m110930b().mo134591s().mo134681b(context, str, str2, str3, i, str4, str5, new IGetDataCallback<String>() {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.C33143g.C331462 */

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
    public static boolean m128111a(Context context, View view, float f, float f2, String str, String str2, String str3, int i, String str4, String str5) {
        return C58354g.m226228a(context, view, f, f2, new View.OnClickListener(context, str, str2, str3, i, str4, str5) {
            /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$g$jZOdtQ4b_CAAyxvS7drCKXjkhM */
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
                C33143g.m270359lambda$jZOdtQ4b_CAAyxvS7drCKXjkhM(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, view);
            }
        });
    }
}
