package com.ss.android.lark.chat.message_menu.provider;

import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.biz.im.extension.ActionProvider;
import com.ss.android.lark.biz.im.extension.MessageAction;
import com.ss.android.lark.chat.base.view.vo.message.ImageContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.IEditImageMenuHandler;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chat/message_menu/provider/EditImageActionProvider;", "Lcom/ss/android/lark/biz/im/extension/ActionProvider;", "()V", "isTranslated", "", "selectedPhotoItem", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "getSupportPageTypes", "", "Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "provideAction", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "shouldShowAction", "supportMessage", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "EditImageMessageAction", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.c.c.q */
public final class EditImageActionProvider implements ActionProvider {

    /* renamed from: a */
    private PhotoItem f84955a;

    /* renamed from: b */
    private boolean f84956b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bJ\r\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bJ\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chat/message_menu/provider/EditImageActionProvider$EditImageMessageAction;", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "selectedPhotoItem", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "isTranslated", "", "(Lcom/ss/android/lark/biz/im/extension/ActionContext;Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;Z)V", "getIconDrawableRes", "", "()Ljava/lang/Integer;", "getIconTintColorRes", "getId", "getLabel", "", "isEnable", "onClick", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.c.c.q$a */
    public static final class EditImageMessageAction extends MessageAction {

        /* renamed from: a */
        private final PhotoItem f84957a;

        /* renamed from: b */
        private final boolean f84958b;

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: a */
        public int mo106818a() {
            return 27;
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: e */
        public boolean mo106822e() {
            return true;
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: b */
        public Integer mo106819b() {
            return Integer.valueOf((int) R.drawable.ud_icon_edit_outlined);
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: c */
        public Integer mo106820c() {
            return Integer.valueOf((int) R.color.chat_operation_item_color_selector);
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: d */
        public String mo106821d() {
            String string = UIHelper.getString(R.string.Lark_Legacy_Edit);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.string.Lark_Legacy_Edit)");
            return string;
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: f */
        public void mo106823f() {
            ActionContext h = mo106825h();
            if (h != null) {
                ((IEditImageMenuHandler) h).mo121937a(this.f84957a, this.f84958b);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.IEditImageMenuHandler");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public EditImageMessageAction(ActionContext actionContext, PhotoItem photoItem, boolean z) {
            super(actionContext);
            Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
            Intrinsics.checkParameterIsNotNull(photoItem, "selectedPhotoItem");
            this.f84957a = photoItem;
            this.f84958b = z;
        }
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public Collection<ActionContext.PageType> mo106806a() {
        return CollectionsKt.listOf((Object[]) new ActionContext.PageType[]{ActionContext.PageType.NORMAL_SINGLE_CHAT, ActionContext.PageType.NORMAL_GROUP_CHAT, ActionContext.PageType.CHAT_THREAD, ActionContext.PageType.THREAD, ActionContext.PageType.THREAD_DETAIL});
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public boolean mo106808a(Message.Type type) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        if (type == Message.Type.IMAGE) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: b */
    public MessageAction mo106809b(ActionContext actionContext) {
        Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
        PhotoItem photoItem = this.f84955a;
        if (photoItem == null) {
            Intrinsics.throwNpe();
        }
        return new EditImageMessageAction(actionContext, photoItem, this.f84956b);
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public boolean mo106807a(ActionContext actionContext) {
        boolean z;
        MessageIdentity messageIdentity;
        boolean z2;
        PhotoItem.TranslateProperty translateProperty;
        TranslatableContentVO oVar;
        Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
        ContentVO g = actionContext.mo106788h().mo121699g();
        if (!(g instanceof ImageContentVO)) {
            g = null;
        }
        ImageContentVO fVar = (ImageContentVO) g;
        if (fVar != null) {
            z = fVar.mo121814i();
        } else {
            z = false;
        }
        this.f84956b = z;
        if (z) {
            if (fVar != null) {
                oVar = fVar.mo121930y();
            } else {
                oVar = null;
            }
            if (oVar != null) {
                TranslatableContentVO y = fVar.mo121930y();
                if (y != null) {
                    fVar = (ImageContentVO) y;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.base.view.vo.message.ImageContentVO");
                }
            }
        }
        Chat e = actionContext.mo106785e();
        if (fVar != null) {
            messageIdentity = fVar.mo121850h();
        } else {
            messageIdentity = null;
        }
        if (!(messageIdentity != null || e == null || fVar == null)) {
            fVar.mo121843a(new MessageIdentity(actionContext.mo106788h().mo121681a(), e.getId()));
        }
        if (fVar == null) {
            LKUIToast.show(actionContext.mo106782b(), UIHelper.getString(R.string.Lark_Legacy_PhotoGetFail));
            return false;
        }
        List<PhotoItem> a = C58659h.m227513a(CollectionsKt.listOf(new ImageSet(fVar.mo121842a(), fVar.mo121844b(), fVar.mo121846d(), fVar.mo121847e(), fVar.mo121848f(), fVar.mo121850h())));
        List<PhotoItem> list = a;
        if (list == null || list.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            this.f84955a = a.get(0);
            if (fVar.mo121850h() != null) {
                PhotoItem photoItem = this.f84955a;
                if (photoItem != null) {
                    photoItem.setMessageIdentity(fVar.mo121850h());
                }
            } else {
                PhotoItem photoItem2 = this.f84955a;
                if (photoItem2 != null) {
                    photoItem2.setMessageId(actionContext.mo106788h().mo121681a());
                }
            }
            PhotoItem photoItem3 = this.f84955a;
            if (!(photoItem3 == null || (translateProperty = photoItem3.getTranslateProperty()) == null)) {
                translateProperty.setTranslated(this.f84956b);
            }
        } else {
            this.f84955a = null;
        }
        if (this.f84955a != null) {
            return true;
        }
        return false;
    }
}
