package com.ss.android.lark.threaddetail.view.message.p2756a;

import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.message.ImageContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.ImageMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.AbstractC33142f;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.IEditImageMenuHandler;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.threaddetail.view.message.a.b */
public class C55928b extends C33330b<ImageContentVO, ImageMessageCell.ImageMessageViewHolder> {

    /* renamed from: c */
    private final IEditImageMenuHandler f138218c;

    public C55928b(AbstractC33342d dVar, IEditImageMenuHandler aVar) {
        super(dVar);
        this.f138218c = aVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b, com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo122821a((List<C34029b>) list, (C33141d) obj);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b
    /* renamed from: a */
    public void mo122821a(List<C34029b> list, C33141d<AbsMessageVO<ImageContentVO>, ImageMessageCell.ImageMessageViewHolder> dVar) {
        boolean z = !this.f85878a.mo122546j();
        ImageContentVO fVar = (ImageContentVO) dVar.f85280b.mo121699g();
        if (z) {
            boolean i = fVar.mo121814i();
            if (i && fVar.mo121930y() != null) {
                fVar = (ImageContentVO) fVar.mo121930y();
            }
            if (fVar != null && fVar.mo121850h() == null) {
                fVar.mo121843a(new MessageIdentity(dVar.f85280b.mo121681a(), dVar.f85280b.mo121692b()));
            }
            if (fVar == null) {
                LKUIToast.show(this.f85878a.mo122543g(), UIHelper.getString(R.string.Lark_Legacy_PhotoGetFail));
                return;
            }
            List<PhotoItem> a = C58659h.m227513a(Collections.singletonList(new ImageSet(fVar.mo121842a(), fVar.mo121844b(), fVar.mo121846d(), fVar.mo121847e(), fVar.mo121848f(), fVar.mo121850h())));
            if (!CollectionUtils.isEmpty(a)) {
                PhotoItem photoItem = a.get(0);
                photoItem.setMessageId(dVar.f85280b.mo121681a());
                photoItem.getTranslateProperty().setTranslated(i);
                list.add(AbstractC33142f.CC.m128076a(this.f138218c, photoItem, i));
            }
        }
    }
}
