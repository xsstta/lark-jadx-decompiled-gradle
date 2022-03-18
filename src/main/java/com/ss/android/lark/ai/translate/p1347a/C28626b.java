package com.ss.android.lark.ai.translate.p1347a;

import com.bytedance.lark.pb.ai.v1.PutTranslationFeedbackRequest;
import com.bytedance.lark.pb.ai.v1.PutTranslationFeedbackResponse;
import com.bytedance.lark.pb.ai.v1.TranslationScene;
import com.bytedance.lark.pb.basic.v1.Command;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.ai.translate.feedback.TranslationFeedback;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;

/* renamed from: com.ss.android.lark.ai.translate.a.b */
public class C28626b implements AbstractC28625a {
    @Override // com.ss.android.lark.ai.translate.p1347a.AbstractC28625a
    /* renamed from: a */
    public void mo101870a(TranslationFeedback translationFeedback, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.PUT_TRANSLATION_FEEDBACK, new PutTranslationFeedbackRequest.C14629a().mo53969a(TranslationScene.fromValue(translationFeedback.scene.getValue())).mo53972a(translationFeedback.objectId).mo53971a(translationFeedback.getScore()).mo53975b(translationFeedback.originText).mo53976c(translationFeedback.targetText).mo53970a(Boolean.valueOf(translationFeedback.hasSuggestedText)).mo53977d(translationFeedback.suggestedText).mo53974b(Boolean.valueOf(translationFeedback.editedSuggestedText)).mo53978e(translationFeedback.originLang).mo53979f(translationFeedback.targetLang), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.ai.translate.p1347a.C28626b.C286271 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                PutTranslationFeedbackResponse.ADAPTER.decode(bArr);
                return true;
            }
        });
    }
}
