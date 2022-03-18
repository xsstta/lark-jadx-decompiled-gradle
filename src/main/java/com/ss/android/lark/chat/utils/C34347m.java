package com.ss.android.lark.chat.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.MediaContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33302l;
import com.ss.android.lark.chat.entity.media.MediaImageSet;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.p2851u.p2852a.C57308c;
import com.ss.android.lark.permission.AbstractC51324c;
import com.ss.android.lark.permission.C51327f;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.utils.m */
public class C34347m {
    /* renamed from: a */
    public static void m133190a(Context context, View view, AbsMessageVO<MediaContentVO> aVar, boolean z, AbstractC33302l lVar) {
        if (C29990c.m110930b().mo134515N().mo134398a(aVar.mo121697e())) {
            m133192c(context, view, aVar, z, lVar);
        } else {
            m133191b(context, view, aVar, z, lVar);
        }
    }

    /* renamed from: c */
    private static void m133192c(final Context context, final View view, final AbsMessageVO<MediaContentVO> aVar, final boolean z, final AbstractC33302l lVar) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (ContextCompat.checkSelfPermission(activity, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                C51327f.m199083b(activity, new AbstractC51324c() {
                    /* class com.ss.android.lark.chat.utils.C34347m.C343481 */

                    @Override // com.ss.android.lark.permission.AbstractC51324c
                    /* renamed from: b */
                    public void mo49824b() {
                    }

                    @Override // com.ss.android.lark.permission.AbstractC51324c
                    /* renamed from: a */
                    public void mo49823a() {
                        C34347m.m133191b(context, view, aVar, z, lVar);
                    }
                });
            } else {
                m133191b(context, view, aVar, z, lVar);
            }
        }
    }

    /* renamed from: b */
    public static void m133191b(Context context, View view, AbsMessageVO<MediaContentVO> aVar, boolean z, AbstractC33302l lVar) {
        if (lVar != null) {
            MediaContentVO g = aVar.mo121699g();
            MediaImageSet a = C57308c.m222069a(g);
            if (a == null) {
                LKUIToast.show(context, UIHelper.getString(R.string.Lark_Legacy_PhotoGetFail));
                return;
            }
            a.setMessageIdentity(new MessageIdentity(aVar.mo121681a(), aVar.mo121692b()));
            List<PhotoItem> a2 = C58659h.m227513a(Collections.singletonList(a));
            if (!CollectionUtils.isEmpty(a2)) {
                PhotoItem photoItem = a2.get(0);
                if (!aVar.ai()) {
                    lVar.mo122772a(view, null, photoItem, z, false, 4);
                } else if (!new File(g.mo121866i()).exists()) {
                    LKUIToast.show(context, UIHelper.getString(R.string.Lark_Legacy_VideoMessageVideoUnavailable));
                } else {
                    lVar.mo122773a(view, photoItem, z);
                }
            }
        }
    }
}
