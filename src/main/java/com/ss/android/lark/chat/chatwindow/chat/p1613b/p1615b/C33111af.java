package com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chatbase.p1690c.C34438a;
import com.ss.android.lark.chatwindow.C35212a;
import com.ss.android.lark.chatwindow.view.WindowDialogManager;
import com.ss.android.lark.chatwindow.view.firsttip.ChatTipController;
import com.ss.android.lark.dto.translate.TranslateState;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.statistics.translate.TranslateHitPoint;
import com.ss.android.lark.utils.C57783ah;
import com.ss.android.lark.widget.photo_picker.entity.C58639a;
import com.ss.android.lark.widget.photo_picker.entity.C58640b;
import com.ss.android.lark.widget.photo_picker.service.TranslateImageService;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.b.af */
public class C33111af implements C57783ah.AbstractC57787c {

    /* renamed from: a */
    public C33103ae f85271a;

    /* renamed from: b */
    private FragmentActivity f85272b;

    /* renamed from: a */
    public void mo122312a(String str) {
        AbstractC34006a messageInfoById = this.f85271a.getMessageInfoById(str);
        if (messageInfoById != null && messageInfoById.getTranslateInfo() != null) {
            TranslateHitPoint.f135913a.mo187762a(messageInfoById.getMessage().getType().toString(), messageInfoById.getId(), messageInfoById.getMessage().getMessageLanguage(), messageInfoById.getMessage().getTranslateLanguage());
            String b = C34438a.m133586b(this.f85272b, messageInfoById.getMessage().getContent());
            String b2 = C34438a.m133586b(this.f85272b, messageInfoById.getTranslateInfo().getTranslateContent());
            String messageLanguage = messageInfoById.getMessage().getMessageLanguage();
            String translateLanguage = messageInfoById.getMessage().getTranslateLanguage();
            C53241h.m205899c("TranslateHandler", "originLang = " + messageLanguage);
            C53241h.m205899c("TranslateHandler", "targetLang = " + translateLanguage);
            WindowDialogManager.f91123a.mo129819a(m128014a(this.f85272b, str, b, b2, messageLanguage, translateLanguage));
        }
    }

    /* renamed from: a */
    public void mo122308a() {
        C57783ah.m224245a().mo196094b(-1);
    }

    public C33111af(FragmentActivity fragmentActivity) {
        this(fragmentActivity, C33103ae.from(fragmentActivity));
    }

    /* renamed from: b */
    private void m128019b(String str) {
        LKUIToast.show(this.f85272b, str);
    }

    @Override // com.ss.android.lark.utils.C57783ah.AbstractC57787c
    public void handleMessage(C57783ah.C57786b bVar) {
        if (bVar.mo196098b() instanceof C58640b) {
            C53241h.m205898b("TranslateImage", "handleMessage: " + bVar);
            C58640b bVar2 = (C58640b) bVar.mo196098b();
            this.f85271a.translateMsg(bVar2.f144795a, bVar2.f144796b);
        }
    }

    /* renamed from: a */
    public void mo122311a(TranslateState translateState) {
        RichText richText;
        List<String> elementIds;
        List<String> imageIds;
        if (translateState != null) {
            if (translateState.getErrorCode() == 254) {
                m128019b(UIUtils.getString(this.f85272b, R.string.Lark_Chat_TranslateAudioMessageError));
            } else if (translateState.getErrorCode() == 252) {
                AbstractC34006a messageInfoById = this.f85271a.getMessageInfoById(translateState.getMessageId());
                boolean isAtLeast = this.f85272b.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED);
                if (!isAtLeast) {
                    C53241h.m205899c("TranslateHandler", "Error won't show up, because the activity is not resumed: " + this.f85272b);
                }
                if (messageInfoById != null && isAtLeast) {
                    Message message = messageInfoById.getMessage();
                    if (Message.Type.IMAGE.equals(message.getType())) {
                        m128015a((View) null, translateState.getMessageId());
                    } else if (!Message.Type.POST.equals(message.getType()) || (richText = ((PostContent) message.getContent()).getRichText()) == null || (elementIds = richText.getElementIds()) == null || elementIds.size() != 1 || (imageIds = richText.getImageIds()) == null || imageIds.size() != 1) {
                        m128017a((View) null, this.f85271a.getTranslateOptions(), translateState.getMessageId());
                    } else {
                        m128015a((View) null, translateState.getMessageId());
                    }
                }
            } else if (!TextUtils.isEmpty(translateState.getError())) {
                m128019b(translateState.getError());
            }
        }
    }

    public C33111af(FragmentActivity fragmentActivity, C33103ae aeVar) {
        this.f85272b = fragmentActivity;
        this.f85271a = aeVar;
        C57783ah.m224245a().mo196092a(-1, (C57783ah.AbstractC57787c) this);
    }

    /* renamed from: a */
    private int m128013a(String[] strArr, String str) {
        for (int i = 0; i < strArr.length - 1; i++) {
            if (str.equals(strArr[i])) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private void m128015a(View view, String str) {
        String targetTranslateKey = this.f85271a.getTargetTranslateKey();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<C58639a> imageSupportedLanguageList = TranslateImageService.INSTANCE.getImageSupportedLanguageList();
        int i = -1;
        for (int i2 = 0; i2 < imageSupportedLanguageList.size(); i2++) {
            C58639a aVar = imageSupportedLanguageList.get(i2);
            arrayList.add(aVar.mo198834b());
            arrayList2.add(aVar.mo198832a());
            if (i == -1 && targetTranslateKey.equals(aVar.mo198832a())) {
                i = i2;
            }
        }
        C35212a.m137533a(this.f85272b, arrayList, i, new C35212a.AbstractC35217c(view, arrayList2, str) {
            /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.$$Lambda$af$8KkJGnKSF_OTd4j9LP_5nfrlHzA */
            public final /* synthetic */ View f$1;
            public final /* synthetic */ List f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.ss.android.lark.chatwindow.C35212a.AbstractC35217c
            public final void onChecked(int i) {
                C33111af.lambda$8KkJGnKSF_OTd4j9LP_5nfrlHzA(C33111af.this, this.f$1, this.f$2, this.f$3, i);
            }
        });
    }

    /* renamed from: a */
    private void m128017a(View view, Map<String, String> map, String str) {
        if (map != null) {
            String[] strArr = (String[]) map.keySet().toArray(new String[map.size()]);
            int a = m128013a(strArr, this.f85271a.getTargetTranslateKey());
            C35212a.m137542b(this.f85272b, (String[]) map.values().toArray(new String[map.size()]), a, new C35212a.AbstractC35217c(view, strArr, str) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.$$Lambda$af$B6jgfh3rulMlRti09em2GEX5vc */
                public final /* synthetic */ View f$1;
                public final /* synthetic */ String[] f$2;
                public final /* synthetic */ String f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                @Override // com.ss.android.lark.chatwindow.C35212a.AbstractC35217c
                public final void onChecked(int i) {
                    C33111af.m270349lambda$B6jgfh3rulMlRti09em2GEX5vc(C33111af.this, this.f$1, this.f$2, this.f$3, i);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo122309a(View view, String str, String str2) {
        mo122310a(view, str, str2, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m128018a(View view, String[] strArr, String str, int i) {
        mo122309a(view, strArr[i], str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m128016a(View view, List list, String str, int i) {
        mo122309a(view, (String) list.get(i), str);
    }

    /* renamed from: a */
    public void mo122310a(final View view, String str, String str2, int i) {
        final AbstractC34006a messageInfoById = this.f85271a.getMessageInfoById(str2, i);
        if (messageInfoById != null) {
            String translateLanguage = messageInfoById.getMessage().getTranslateLanguage();
            if (!TextUtils.isEmpty(translateLanguage)) {
                str = translateLanguage;
            } else if (TextUtils.isEmpty(str)) {
                str = this.f85271a.getTargetTranslateKey();
            }
            int translateDisplayRule = messageInfoById.getMessage().getTranslateDisplayRule();
            if (translateDisplayRule == 3) {
                TranslateHitPoint.f135913a.mo187764a(messageInfoById.getMessage().isTranslatedManually(), "");
            } else if (translateDisplayRule == 1 || translateDisplayRule == 0) {
                TranslateHitPoint.f135913a.mo187761a(str2, "", messageInfoById.getMessage().getType().name());
            }
            C53241h.m205899c("TranslateHandler", "onTranslateClicked:" + translateLanguage + "/" + str);
            this.f85271a.translate(messageInfoById, str, new UIGetDataCallback(new IGetDataCallback<Map<String, TranslateState>>() {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33111af.C331121 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    TranslateState translateState = new TranslateState();
                    translateState.setErrorCode(errorResult.getErrorCode());
                    translateState.setMessageId(errorResult.getDebugMsg());
                    C33111af.this.mo122311a(translateState);
                }

                /* renamed from: a */
                public void onSuccess(Map<String, TranslateState> map) {
                    boolean z = !TextUtils.isEmpty(messageInfoById.getMessage().getTranslateLanguage());
                    if (view != null && !z && C33111af.this.f85271a.needShowAutoTranslateGuide()) {
                        int translateTimes = C33111af.this.f85271a.getTranslateTimes() + 1;
                        C33111af.this.f85271a.setTranslateTimes(translateTimes);
                        if (translateTimes == 3) {
                            ChatTipController.f91138a.mo129831a(view, C33111af.this.f85271a);
                        } else if (translateTimes > 3) {
                            C33111af.this.f85271a.setTranslateTimes(1);
                        }
                    }
                }
            }));
        }
    }

    /* renamed from: a */
    private Dialog m128014a(Context context, String str, String str2, String str3, String str4, String str5) {
        return C29990c.m110930b().mo134526Y().mo134642a(context, str, str2, str3, str4, str5);
    }
}
