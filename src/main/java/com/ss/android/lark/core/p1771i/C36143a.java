package com.ss.android.lark.core.p1771i;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.ImageView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.keyboard.C40682g;
import com.ss.android.lark.keyboard.dependency.IKeyboardDependency;
import com.ss.android.lark.platform.p2493n.C51854a;
import com.ss.android.lark.platform.settings.SettingModuleProvider;
import com.ss.android.lark.ug.p2874e.C57480a;

/* renamed from: com.ss.android.lark.core.i.a */
public class C36143a {

    /* renamed from: com.ss.android.lark.core.i.a$a */
    public static class C36145a {

        /* renamed from: a */
        public static final IKeyboardDependency f93335a = C36143a.m142119b();
    }

    /* renamed from: a */
    public static C40682g m142118a() {
        return new C40682g(C36145a.f93335a);
    }

    /* renamed from: b */
    public static IKeyboardDependency m142119b() {
        return new IKeyboardDependency() {
            /* class com.ss.android.lark.core.p1771i.C36143a.C361441 */

            @Override // com.ss.android.lark.keyboard.dependency.IKeyboardDependency
            /* renamed from: b */
            public int mo133172b() {
                return C36083a.m141486a().getIMDependency().mo132781C();
            }

            @Override // com.ss.android.lark.keyboard.dependency.IKeyboardDependency
            /* renamed from: c */
            public String mo133175c() {
                return C36083a.m141486a().getIMDependency().mo132792N();
            }

            @Override // com.ss.android.lark.keyboard.dependency.IKeyboardDependency
            /* renamed from: a */
            public boolean mo133170a() {
                return SettingModuleProvider.f129183h.mo178263a().mo185224j();
            }

            @Override // com.ss.android.lark.keyboard.dependency.IKeyboardDependency
            /* renamed from: c */
            public void mo133176c(String str) {
                C57480a.m223132a().mo141830f(str);
            }

            @Override // com.ss.android.lark.keyboard.dependency.IKeyboardDependency
            /* renamed from: a */
            public int mo133166a(DocType docType) {
                return C36083a.m141486a().getIMDependency().mo132800a(docType);
            }

            @Override // com.ss.android.lark.keyboard.dependency.IKeyboardDependency
            /* renamed from: b */
            public boolean mo133174b(String str) {
                return C57480a.m223132a().mo141828e(str);
            }

            @Override // com.ss.android.lark.keyboard.dependency.IKeyboardDependency
            /* renamed from: a */
            public boolean mo133171a(String str) {
                return C37239a.m146648b().mo136951a(str);
            }

            @Override // com.ss.android.lark.keyboard.dependency.IKeyboardDependency
            /* renamed from: a */
            public void mo133167a(Context context, String str) {
                C36083a.m141486a().getIMDependency().mo132828a(context, str, (DialogInterface.OnDismissListener) null);
            }

            @Override // com.ss.android.lark.keyboard.dependency.IKeyboardDependency
            /* renamed from: b */
            public void mo133173b(String str, IGetDataCallback<UrlPreviewEntity> iGetDataCallback) {
                while (str.length() > 1 && str.startsWith(" ")) {
                    str = str.substring(1);
                }
                while (str.length() > 1 && str.endsWith("\n")) {
                    str = str.substring(0, str.length() - 1);
                }
                C36083a.m141486a().getIMDependency().mo132928e(str, iGetDataCallback);
            }

            @Override // com.ss.android.lark.keyboard.dependency.IKeyboardDependency
            /* renamed from: a */
            public void mo133169a(String str, IGetDataCallback<DocResult> iGetDataCallback) {
                if (!C36083a.m141486a().getCCMDependency().mo132716b(str)) {
                    iGetDataCallback.onError(new ErrorResult("is not a http url"));
                    return;
                }
                while (str.length() > 1 && str.startsWith(" ")) {
                    str = str.substring(1);
                }
                while (str.length() > 1 && str.endsWith("\n")) {
                    str = str.substring(0, str.length() - 1);
                }
                C36083a.m141486a().getIMDependency().mo132921d(str, iGetDataCallback);
            }

            @Override // com.ss.android.lark.keyboard.dependency.IKeyboardDependency
            /* renamed from: a */
            public void mo133168a(String str, ImageView imageView, int i, int i2) {
                C51854a.m201094a().mo142168b(imageView.getContext(), imageView, str, new LoadParams().mo105413a(i).mo105422b(i2));
            }
        };
    }
}
