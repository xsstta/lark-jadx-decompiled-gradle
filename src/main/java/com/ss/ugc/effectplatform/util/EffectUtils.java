package com.ss.ugc.effectplatform.util;

import bytekn.foundation.io.file.FileManager;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.UrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ(\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004J\u001e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004J \u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004J\u001e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0004J&\u0010\u001b\u001a\u00020\u00122\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004¨\u0006\u001c"}, d2 = {"Lcom/ss/ugc/effectplatform/util/EffectUtils;", "", "()V", "appendUriForUrlPrefix", "", "", "urlPrefix", "uri", "getUrl", "effect", "Lcom/ss/ugc/effectplatform/model/ProviderEffect;", "urlModel", "Lcom/ss/ugc/effectplatform/model/UrlModel;", "isEffectValid", "", "Lcom/ss/ugc/effectplatform/model/Effect;", "isUrlModelEmpty", "setEffectField", "", "parentDir", "panel", "effects", "setEffectPath", "setEffectRecId", "recId", "setInfoEffectPath", "Lcom/ss/ugc/effectplatform/model/net/InfoStickerEffect;", "setUrlModel", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.util.j */
public final class EffectUtils {

    /* renamed from: a */
    public static final EffectUtils f165112a = new EffectUtils();

    private EffectUtils() {
    }

    /* renamed from: a */
    public final boolean mo228314a(Effect effect) {
        if (effect == null) {
            return false;
        }
        return !mo228315a(effect.getFile_url());
    }

    /* renamed from: a */
    public final boolean mo228315a(UrlModel urlModel) {
        boolean z;
        if (urlModel != null) {
            List<String> url_list = urlModel.getUrl_list();
            if (url_list == null || url_list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final List<String> mo228316b(UrlModel urlModel) {
        if (urlModel == null || mo228315a(urlModel)) {
            return new ArrayList();
        }
        return urlModel.getUrl_list();
    }

    /* renamed from: a */
    private final List<String> m257073a(List<String> list, String str) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next() + str);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo228313a(List<String> list, List<? extends Effect> list2) {
        boolean z;
        if (list2 != null) {
            for (Effect effect : list2) {
                UrlModel file_url = effect.getFile_url();
                ArrayList a = m257073a(list, effect.getFile_url().getUri());
                if (a == null) {
                    a = new ArrayList();
                }
                file_url.setUrl_list(a);
                UrlModel icon_url = effect.getIcon_url();
                ArrayList a2 = m257073a(list, effect.getIcon_url().getUri());
                if (a2 == null) {
                    a2 = new ArrayList();
                }
                icon_url.setUrl_list(a2);
                List<String> url_list = effect.getHint_icon().getUrl_list();
                if (url_list == null || url_list.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    UrlModel hint_icon = effect.getHint_icon();
                    ArrayList a3 = m257073a(list, effect.getHint_icon().getUri());
                    if (a3 == null) {
                        a3 = new ArrayList();
                    }
                    hint_icon.setUrl_list(a3);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo228312a(String str, String str2, List<? extends Effect> list) {
        String str3;
        Intrinsics.checkParameterIsNotNull(str, "parentDir");
        if (list != null) {
            for (Effect effect : list) {
                effect.setZipPath(str + FileManager.f5817a.mo8712a() + effect.getId() + ".zip");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(FileManager.f5817a.mo8712a());
                sb.append(effect.getId());
                effect.setUnzipPath(sb.toString());
                if (str2 != null) {
                    str3 = str2;
                } else {
                    str3 = "";
                }
                effect.setPanel(str3);
            }
        }
    }
}
