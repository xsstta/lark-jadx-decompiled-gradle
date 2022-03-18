package com.ss.android.lark.chat.chatwindow.chat.message.p1624a;

import android.app.Activity;
import android.view.View;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.utils.C34353s;
import com.ss.android.lark.chatwindow.view.photo_preview.DialogMenuClickListenerImpl;
import com.ss.android.lark.p2851u.p2852a.C57305aa;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import com.ss.android.lark.widget.richtext.Image;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.a.b */
public class C33292b {

    /* renamed from: a */
    Activity f85790a;

    /* renamed from: b */
    Scene f85791b;

    public C33292b(Activity activity, Scene scene) {
        this.f85790a = activity;
        this.f85791b = scene;
    }

    /* renamed from: a */
    public void mo122757a(View view, List<Image> list, Image image) {
        List<PhotoItem> c = C58659h.m227520c(C57305aa.m222056a(list));
        C58630d.m227364a().mo198658a(view).mo198664a(new DialogMenuClickListenerImpl("")).mo198676e(false).mo198667a((ArrayList) c).mo198657a(C34353s.m133238a(c, C58659h.m227520c(Collections.singletonList(C57305aa.m222055a(image))).get(0))).mo198659a(Biz.Messenger).mo198660a(this.f85791b).mo198672b(7).mo198671a(this.f85790a, Biz.Messenger, this.f85791b, 7);
    }
}
