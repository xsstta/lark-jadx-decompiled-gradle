package com.ss.android.lark.forward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.biz.core.api.FavoriteForwardData;
import com.ss.android.lark.biz.core.api.ShareDataForwardData;
import com.ss.android.lark.biz.core.api.ShareTextForwardData;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.base.StandAloneParam;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.forward.dto.CalendarForwardData;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.TodoForwardData;
import com.ss.android.lark.forward.dto.template.ForwardCallType;
import com.ss.android.lark.forward.dto.template.ForwardLocation;
import com.ss.android.lark.forward.dto.template.IForwardSelectListener;
import com.ss.android.lark.forward.impl.C38408a;
import com.ss.android.lark.forward.impl.ForwardPickActivity;
import com.ss.android.lark.forward.impl.statistics.AppreciablePerformance;
import com.ss.android.lark.forward.p1898a.AbstractC38365a;
import com.ss.android.lark.forward.template.C38502a;
import com.ss.android.lark.forward.template.C38512f;
import com.ss.android.lark.forward.template.C38515g;
import com.ss.android.lark.forward.template.C38519i;
import com.ss.android.lark.forward.template.C38521j;
import com.ss.android.lark.forward.template.C38524k;
import com.ss.android.lark.forward.template.C38526m;
import com.ss.android.lark.forward.template.MailForwardTemplateFactory;
import com.ss.android.lark.forward.template.MergeForwardTemplateFactory;
import com.ss.android.lark.forward.template.MessageForwardTemplateFactory;
import com.ss.android.lark.forward.template.MomentsForwardTemplateFactory;
import com.ss.android.lark.forward.template.ShareCalendarForwardTemplateFactory;
import com.ss.android.lark.forward.template.ShareCopyFileForwardTemplateFactory;
import com.ss.android.lark.forward.template.ShareFileForwardTemplateFactory;
import com.ss.android.lark.forward.template.ShareForwardTemplateFactory;
import com.ss.android.lark.forward.template.ShareStickerSetForwardTemplateFactory;
import com.ss.android.lark.forward.template.ShareTodoForwardTemplateFactory;
import com.ss.android.lark.forward.template.TransferCalendarForwardTemplateFactory;
import com.ss.android.lark.openapi.jsapi.entity.ShareModel;
import com.ss.android.lark.thirdshare.container.LarkShareContainerConfig;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.ss.android.lark.forward.a */
public class C38364a {

    /* renamed from: a */
    private static volatile AbstractC38365a f98602a;

    /* renamed from: a */
    public static AbstractC38365a m151054a() {
        return f98602a;
    }

    /* renamed from: a */
    public void mo140420a(Context context, ForwardTemplate forwardTemplate) {
        mo140421a(context, forwardTemplate, -1);
    }

    /* renamed from: a */
    public void mo140421a(Context context, ForwardTemplate forwardTemplate, int i) {
        mo140422a(context, forwardTemplate, i, (int[]) null, (int[]) null);
    }

    /* renamed from: a */
    public void mo140422a(Context context, ForwardTemplate forwardTemplate, int i, int[] iArr, int[] iArr2) {
        mo140417a(context, (C36516a) null, forwardTemplate, i, iArr, iArr2);
    }

    /* renamed from: a */
    public void mo140417a(Context context, C36516a aVar, ForwardTemplate forwardTemplate, int i, int[] iArr, int[] iArr2) {
        if (forwardTemplate != null) {
            Intent intent = new Intent(context, ForwardPickActivity.class);
            intent.putExtra("parcelable_forward_template", forwardTemplate);
            if (iArr != null) {
                intent.putExtra("key_transition_anim_in", iArr);
            }
            if (iArr2 != null) {
                intent.putExtra("key_transition_anim_out", iArr2);
            }
            if (!DesktopUtil.m144301a(context)) {
                m151055a(context, intent, i, forwardTemplate);
            } else if (forwardTemplate.mo140596i().mo140805a() == 0) {
                C38408a aVar2 = new C38408a();
                aVar2.setArguments(intent.getExtras());
                FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b();
                if (aVar != null) {
                    C36512a.m144041a().mo134760a(aVar, aVar2, a, i);
                } else {
                    C36512a.m144041a().mo134762a(aVar2, a);
                }
            } else if (context != null) {
                boolean z = context instanceof Activity;
                if (!z) {
                    intent.addFlags(268435456);
                }
                StandAloneParam a2 = new StandAloneParam.C36572a(intent).mo134969c(i).mo134967a();
                if (z) {
                    C36512a.m144041a().mo134756a((Activity) context, a2);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo140409a(Context context, Message message, String str, String str2, String str3) {
        mo140405a(context, message, 0, str, str2, str3);
    }

    /* renamed from: a */
    public void mo140406a(Context context, Message message, IForwardSelectListener iForwardSelectListener, String str, String str2, String str3) {
        mo140403a(context, message, 0, iForwardSelectListener, str, str2, str3);
    }

    /* renamed from: a */
    public void mo140405a(Context context, Message message, int i, String str, String str2, String str3) {
        mo140403a(context, message, i, (IForwardSelectListener) null, str, str2, str3);
    }

    /* renamed from: a */
    public void mo140404a(Context context, Message message, int i, String str) {
        mo140405a(context, message, i, ForwardCallType.CLICK.getValue(), ForwardLocation.OTHER.getValue(), str);
    }

    /* renamed from: a */
    public void mo140403a(Context context, Message message, int i, IForwardSelectListener iForwardSelectListener, String str, String str2, String str3) {
        mo140420a(context, MessageForwardTemplateFactory.m151775a(context, message, i == 9 ? 3 : i == 11 ? 2 : 0, iForwardSelectListener, ForwardCallType.forNumber(str), ForwardLocation.forNumber(str2), str3));
    }

    /* renamed from: a */
    public void mo140415a(Context context, C36516a aVar, Chat chat, ArrayList<String> arrayList, int i, String str, String str2, boolean z, String str3) {
        ForwardTemplate a = MergeForwardTemplateFactory.m151706a(context, chat, arrayList, i, false, "", ForwardCallType.forNumber(str), ForwardLocation.forNumber(str2), z, str3);
        AppreciablePerformance.f98815c.mo140990a(1);
        mo140417a(context, aVar, a, i, (int[]) null, (int[]) null);
    }

    /* renamed from: a */
    public void mo140416a(Context context, C36516a aVar, Chat chat, ArrayList<String> arrayList, boolean z, String str, int i) {
        mo140415a(context, aVar, chat, arrayList, i, ForwardCallType.CLICK.getValue(), ForwardLocation.OTHER.getValue(), z, str);
    }

    /* renamed from: a */
    public void mo140414a(Context context, C36516a aVar, Chat chat, ArrayList<String> arrayList, int i, String str, String str2, String str3) {
        ForwardTemplate a = C38512f.m151894a(context, chat, arrayList, ForwardCallType.forNumber(str), ForwardLocation.forNumber(str2), str3);
        AppreciablePerformance.f98815c.mo140990a(2);
        mo140417a(context, aVar, a, i, (int[]) null, (int[]) null);
    }

    /* renamed from: a */
    public void mo140413a(Context context, C36516a aVar, Chat chat, ArrayList<String> arrayList, int i, String str) {
        mo140414a(context, aVar, chat, arrayList, i, ForwardCallType.CLICK.getValue(), ForwardLocation.OTHER.getValue(), str);
    }

    /* renamed from: a */
    public void mo140401a(Context context, Chat chat, int i) {
        mo140420a(context, C38519i.m151907a(context, chat));
    }

    /* renamed from: a */
    public void mo140412a(Context context, ProfileContent profileContent) {
        mo140422a(context, C38521j.m151912a(context, profileContent), -1, ActivityAnimationManager.ANIM_SLIDE_UP_IN, ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    /* renamed from: a */
    public void mo140398a(Context context, ShareDataForwardData shareDataForwardData, int i) {
        if (shareDataForwardData == null || shareDataForwardData.isEmpty()) {
            LKUIToast.show(context, (int) R.string.Lark_Legacy_ShareUnsupportTypeError);
            return;
        }
        shareDataForwardData.setCanAddExtraInfo(true);
        mo140420a(context, ShareFileForwardTemplateFactory.m151826a(context, shareDataForwardData));
    }

    /* renamed from: a */
    public void mo140419a(Context context, CalendarForwardData calendarForwardData, int i) {
        mo140422a(context, ShareCalendarForwardTemplateFactory.m151813a(context, calendarForwardData), i, ActivityAnimationManager.ANIM_SLIDE_UP_IN, ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    /* renamed from: a */
    public void mo140418a(Context context, C36516a aVar, TodoForwardData todoForwardData, int i) {
        ForwardTemplate a = ShareTodoForwardTemplateFactory.m151849a(todoForwardData);
        if (aVar == null) {
            mo140422a(context, a, i, ActivityAnimationManager.ANIM_SLIDE_UP_IN, ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
        } else {
            mo140430b(context, aVar, a, i, ActivityAnimationManager.ANIM_SLIDE_UP_IN, ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
        }
    }

    /* renamed from: a */
    public void mo140428a(Context context, String str, String str2, int i, int i2) {
        mo140422a(context, MomentsForwardTemplateFactory.m151890a(context, str, str2, i), i2, ActivityAnimationManager.ANIM_SLIDE_UP_IN, ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    /* renamed from: a */
    public void mo140407a(Context context, Message message, ShareModel shareModel) {
        mo140420a(context, ShareForwardTemplateFactory.m151836a(context, message, shareModel));
    }

    /* renamed from: a */
    public void mo140427a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            LKUIToast.show(context, (int) R.string.Lark_Legacy_ShareUnsupportTypeError);
        } else {
            mo140420a(context, C38526m.m151925a(context, str, str2));
        }
    }

    /* renamed from: a */
    public void mo140399a(Context context, ShareTextForwardData shareTextForwardData) {
        mo140400a(context, shareTextForwardData, -1);
    }

    /* renamed from: a */
    public void mo140400a(Context context, ShareTextForwardData shareTextForwardData, int i) {
        if (shareTextForwardData != null && !shareTextForwardData.isEmpty()) {
            mo140421a(context, C38524k.m151917a(context, shareTextForwardData), i);
        }
    }

    /* renamed from: a */
    public void mo140423a(Context context, String str) {
        mo140424a(context, str, -1);
    }

    /* renamed from: a */
    public void mo140424a(Context context, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            LKUIToast.show(context, (int) R.string.Lark_Legacy_ShareUnsupportTypeError);
            return;
        }
        ShareDataForwardData shareDataForwardData = new ShareDataForwardData();
        shareDataForwardData.setImages(Collections.singletonList(str));
        shareDataForwardData.setSystemShare(true);
        mo140421a(context, ShareFileForwardTemplateFactory.m151826a(context, shareDataForwardData), i);
    }

    /* renamed from: a */
    public void mo140410a(Context context, ImageContent imageContent) {
        mo140411a(context, imageContent, -1);
    }

    /* renamed from: a */
    public void mo140425a(Context context, String str, StickerContent stickerContent) {
        mo140426a(context, str, stickerContent, -1);
    }

    /* renamed from: a */
    public void mo140411a(Context context, ImageContent imageContent, int i) {
        int i2;
        if (imageContent != null && imageContent.getImageSet() != null) {
            Message message = new Message();
            message.setMessageContent(imageContent);
            message.setType(Message.Type.IMAGE);
            if (imageContent.getImageSet().getMessageIdentity() != null) {
                message.setId(imageContent.getImageSet().getMessageIdentity().getMessageId());
                i2 = 0;
            } else if (imageContent.getImageSet().getOrigin() != null) {
                i2 = 4;
            } else {
                return;
            }
            mo140422a(context, MessageForwardTemplateFactory.m151775a(context, message, i2, null, ForwardCallType.CLICK, ForwardLocation.IMAGE, ""), i, ActivityAnimationManager.ANIM_SLIDE_UP_IN, ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
        }
    }

    /* renamed from: a */
    public void mo140426a(Context context, String str, StickerContent stickerContent, int i) {
        if (stickerContent != null && !TextUtils.isEmpty(stickerContent.getKey())) {
            Message message = new Message();
            message.setId(str);
            message.setMessageContent(stickerContent);
            message.setType(Message.Type.STICKER);
            mo140421a(context, MessageForwardTemplateFactory.m151775a(context, message, 0, null, ForwardCallType.CLICK, ForwardLocation.IMAGE, ""), i);
        }
    }

    /* renamed from: a */
    public void mo140408a(Context context, Message message, String str, String str2) {
        mo140420a(context, MessageForwardTemplateFactory.m151776a(context, message, ForwardCallType.forNumber(str), ForwardLocation.forNumber(str2)));
    }

    /* renamed from: a */
    public void mo140429a(Context context, String str, String str2, long j, boolean z, String str3) {
        mo140420a(context, ShareCopyFileForwardTemplateFactory.m151903a(str, str2, j, z, str3));
    }

    /* renamed from: a */
    public void mo140402a(Context context, Chat chat, ArrayList<String> arrayList, String str, int i, String str2, String str3) {
        ForwardTemplate a = MergeForwardTemplateFactory.m151706a(context, chat, arrayList, i, true, str, ForwardCallType.forNumber(str2), ForwardLocation.forNumber(str3), true, "");
        AppreciablePerformance.f98815c.mo140990a(1);
        mo140421a(context, a, i);
    }

    public C38364a(AbstractC38365a aVar) {
        m151057a(aVar);
    }

    /* renamed from: a */
    private static void m151057a(AbstractC38365a aVar) {
        f98602a = aVar;
    }

    /* renamed from: a */
    public Fragment mo140393a(LarkShareContainerConfig.InappConfig cVar) {
        ForwardTemplate a = C38515g.m151902a(cVar);
        a.mo140593f().mo140870a(false);
        a.mo140593f().mo140874b(false);
        Bundle bundle = new Bundle();
        bundle.putParcelable("parcelable_forward_template", a);
        C38408a aVar = new C38408a();
        aVar.setArguments(bundle);
        return aVar;
    }

    /* renamed from: b */
    public void mo140432b(Context context, String str) {
        mo140420a(context, ShareStickerSetForwardTemplateFactory.m151842a(context, str, 0));
    }

    /* renamed from: c */
    public void mo140433c(Context context, String str) {
        mo140420a(context, ShareStickerSetForwardTemplateFactory.m151842a(context, str, 1));
    }

    /* renamed from: a */
    public void mo140397a(Context context, ShareDataForwardData shareDataForwardData) {
        if (shareDataForwardData == null || shareDataForwardData.isEmpty()) {
            LKUIToast.show(context, (int) R.string.Lark_Legacy_ShareUnsupportTypeError);
        } else {
            mo140420a(context, ShareFileForwardTemplateFactory.m151826a(context, shareDataForwardData));
        }
    }

    /* renamed from: b */
    public void mo140431b(Context context, CalendarForwardData calendarForwardData, int i) {
        mo140421a(context, TransferCalendarForwardTemplateFactory.m151863a(context, calendarForwardData), i);
    }

    /* renamed from: a */
    public Fragment mo140392a(Context context, Bundle bundle, Chat chat) {
        ForwardTemplate a = C38519i.m151907a(context, chat);
        a.mo140593f().mo140870a(false);
        a.mo140593f().mo140874b(false);
        bundle.putParcelable("parcelable_forward_template", a);
        C38408a aVar = new C38408a();
        aVar.setArguments(bundle);
        return aVar;
    }

    /* renamed from: a */
    private void m151056a(C36516a aVar, Intent intent, int i, ForwardTemplate forwardTemplate) {
        if (aVar != null && intent != null) {
            Bundle h = forwardTemplate.mo140595h();
            if (h != null && h.getBoolean("sdkshare")) {
                intent.addFlags(335544320);
            }
            aVar.startActivityForResult(intent, i);
        }
    }

    /* renamed from: a */
    private void m151055a(Context context, Intent intent, int i, ForwardTemplate forwardTemplate) {
        if (context != null && intent != null) {
            Bundle h = forwardTemplate.mo140595h();
            if (h != null && h.getBoolean("sdkshare")) {
                intent.addFlags(335544320);
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
            ((Activity) context).startActivityForResult(intent, i);
        }
    }

    /* renamed from: a */
    public void mo140395a(Context context, FavoriteForwardData favoriteForwardData, int i, int i2) {
        mo140396a(context, favoriteForwardData, i, ForwardCallType.CLICK.getValue(), i2);
    }

    /* renamed from: a */
    public void mo140396a(Context context, FavoriteForwardData favoriteForwardData, int i, String str, int i2) {
        mo140421a(context, C38502a.m151881a(context, favoriteForwardData, ForwardCallType.forNumber(str)), i2);
    }

    /* renamed from: a */
    public void mo140394a(Context context, int i, Bundle bundle, int i2, String str, String str2) {
        mo140421a(context, MailForwardTemplateFactory.m151690a(i2, str, bundle, str2), i);
    }

    /* renamed from: b */
    public void mo140430b(Context context, C36516a aVar, ForwardTemplate forwardTemplate, int i, int[] iArr, int[] iArr2) {
        if (forwardTemplate != null) {
            Intent intent = new Intent(context, ForwardPickActivity.class);
            intent.putExtra("parcelable_forward_template", forwardTemplate);
            if (iArr != null) {
                intent.putExtra("key_transition_anim_in", iArr);
            }
            if (iArr2 != null) {
                intent.putExtra("key_transition_anim_out", iArr2);
            }
            m151056a(aVar, intent, i, forwardTemplate);
        }
    }
}
