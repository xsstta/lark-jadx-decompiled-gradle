package com.ss.android.lark.app.task.initor;

import android.content.Context;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.photoeditor.LarkPhotoEditorModule;
import com.ss.android.lark.photoeditor.p2462a.AbstractC51426a;
import com.ss.android.lark.utils.ApiUtils;

public class LarkPhotoEditorModuleDependencyInitor {
    /* renamed from: a */
    private static AbstractC51426a m106401a() {
        return new AbstractC51426a() {
            /* class com.ss.android.lark.app.task.initor.LarkPhotoEditorModuleDependencyInitor.C289951 */

            @Override // com.ss.android.lark.photoeditor.p2462a.AbstractC51426a
            /* renamed from: a */
            public AbstractC51426a.AbstractC51427a mo102818a() {
                return new AbstractC51426a.AbstractC51427a() {
                    /* class com.ss.android.lark.app.task.initor.LarkPhotoEditorModuleDependencyInitor.C289951.C289961 */

                    @Override // com.ss.android.lark.photoeditor.p2462a.AbstractC51426a.AbstractC51427a
                    /* renamed from: a */
                    public void mo102822a(String str) {
                        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).completeGuide(str);
                    }

                    @Override // com.ss.android.lark.photoeditor.p2462a.AbstractC51426a.AbstractC51427a
                    /* renamed from: b */
                    public boolean mo102823b(String str) {
                        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).checkToShow(str);
                    }
                };
            }

            @Override // com.ss.android.lark.photoeditor.p2462a.AbstractC51426a
            /* renamed from: a */
            public boolean mo102820a(String str) {
                return C37239a.m146648b().mo136955b(str, false);
            }

            @Override // com.ss.android.lark.photoeditor.p2462a.AbstractC51426a
            /* renamed from: a */
            public boolean mo102821a(String str, boolean z) {
                return ((IIMApi) ApiUtils.getApi(IIMApi.class)).checkImageDownloadAuthorization(str, z);
            }

            @Override // com.ss.android.lark.photoeditor.p2462a.AbstractC51426a
            /* renamed from: a */
            public void mo102819a(Context context, String str, int i) {
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).goImageForwardSelectPage(context, str, i);
            }
        };
    }

    /* renamed from: a */
    public static void m106402a(Context context) {
        LarkPhotoEditorModule.m199351a(m106401a());
    }
}
