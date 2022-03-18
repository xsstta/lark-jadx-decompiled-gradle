package com.ss.android.lark.chat.chatwindow.chat.message.p1626c;

import android.text.TextUtils;
import android.view.View;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.ImageContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.ImageMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.AbstractC33142f;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33120i;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33133v;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33137x;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.chat.entity.message.content.ImageTranslateProperty;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.c.e */
public class C33333e extends C33330b<ImageContentVO, ImageMessageCell.ImageMessageViewHolder> {

    /* renamed from: c */
    public final AbstractC33120i f85880c;

    public C33333e(AbstractC33342d dVar, AbstractC33120i iVar) {
        super(dVar);
        this.f85880c = iVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b, com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo122821a((List<C34029b>) list, (C33141d) obj);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b
    /* renamed from: a */
    public void mo122821a(List<C34029b> list, C33141d<AbsMessageVO<ImageContentVO>, ImageMessageCell.ImageMessageViewHolder> dVar) {
        Value value = dVar.f85280b;
        ImageContentVO fVar = (ImageContentVO) value.mo121699g();
        if (C29990c.m110930b().mo134586n().mo134685a("messenger.message_picture_addsticker") && !value.ai() && !value.mo121706n()) {
            String c = fVar.mo121845c();
            if (!TextUtils.isEmpty(c)) {
                list.add(AbstractC33142f.CC.m128065a(new C33137x(this.f85878a.mo122543g()), c, value.mo121681a()));
            }
        }
        if (C29990c.m110930b().mo134586n().mo134685a("translate.image.chat.menu.enable")) {
            ImageContentVO fVar2 = (ImageContentVO) dVar.f85280b.mo121699g();
            ImageTranslateProperty g = fVar2.mo121849g();
            Log.m165389i("TranslateImage", fVar2.mo121842a() + " -> " + g.toString());
            Boolean canTranslate = g.getCanTranslate();
            if (canTranslate == null || canTranslate.booleanValue()) {
                final boolean i = fVar2.mo121814i();
                Log.m165389i("TranslateImage", "isTranslated: " + i);
                list.add(AbstractC33142f.CC.m128079a(i, new AbstractC33133v() {
                    /* class com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33333e.C333341 */

                    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33133v
                    /* renamed from: a */
                    public void mo122321a(View view, AbstractC59010e eVar, AbsMessageVO aVar) {
                        if (C33333e.this.f85880c != null) {
                            C33333e.this.f85880c.mo122321a(view, eVar, aVar);
                            if (i) {
                                Statistics.sendEvent("untranslate_image");
                            } else {
                                Statistics.sendEvent("translate_image");
                            }
                        }
                    }
                }, ((ImageMessageCell.ImageMessageViewHolder) dVar.f85279a).f146209n, dVar.f85279a, dVar.f85280b));
            }
        }
        if (!this.f85878a.mo122546j()) {
            ImageContentVO fVar3 = (ImageContentVO) dVar.f85280b.mo121699g();
            boolean i2 = fVar3.mo121814i();
            if (i2 && fVar3.mo121930y() != null) {
                fVar3 = (ImageContentVO) fVar3.mo121930y();
            }
            if (fVar3 != null && fVar3.mo121850h() == null) {
                fVar3.mo121843a(new MessageIdentity(dVar.f85280b.mo121681a(), dVar.f85280b.mo121692b()));
            }
            if (fVar3 == null) {
                LKUIToast.show(this.f85878a.mo122543g(), UIHelper.getString(R.string.Lark_Legacy_PhotoGetFail));
                return;
            }
            List<PhotoItem> a = C58659h.m227513a(Collections.singletonList(new ImageSet(fVar3.mo121842a(), fVar3.mo121844b(), fVar3.mo121846d(), fVar3.mo121847e(), fVar3.mo121848f(), fVar3.mo121850h())));
            if (!CollectionUtils.isEmpty(a)) {
                PhotoItem photoItem = a.get(0);
                photoItem.setMessageIdentity(fVar3.mo121850h());
                photoItem.getTranslateProperty().setTranslated(i2);
                list.add(AbstractC33142f.CC.m128076a(this.f85880c, photoItem, i2));
            }
        }
    }
}
