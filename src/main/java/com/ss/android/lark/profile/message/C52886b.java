package com.ss.android.lark.profile.message;

import android.content.Intent;
import android.view.View;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.keyboard.ISupportForItem;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.UIHelper;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.profile.message.b */
public class C52886b implements IPlusItem {

    /* renamed from: a */
    private ISupportForItem f130697a;

    /* renamed from: b */
    private final Chat f130698b;

    /* renamed from: c */
    private boolean f130699c;

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public int mo31048a() {
        return R.drawable.profile_ic_keyboard_plus_circle;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: b */
    public IPlusItem.IconUrlInfo mo31053b() {
        return null;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: b */
    public void mo31054b(boolean z) {
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: d */
    public boolean mo31056d() {
        return true;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: e */
    public int mo31057e() {
        return 70;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: c */
    public String mo31055c() {
        return UIHelper.getString(R.string.Lark_Legacy_SendUserCard);
    }

    /* renamed from: f */
    private void m204580f() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_button", "usercard");
            Statistics.sendEvent("im_chat_input_toolbar_plus", jSONObject);
            JSONObject jSONObject2 = new JSONObject(ChatParamUtils.m133135a(this.f130698b, C52239a.m202617d().mo133587q().mo133622a()));
            jSONObject2.put("click", "personal_card");
            jSONObject2.put("target", "im_chat_main_view");
            Statistics.sendEvent("im_chat_input_plus_click", jSONObject2);
        } catch (Exception e) {
            Log.m165383e("ProfileKBPlusItem", e.getMessage());
        }
    }

    public C52886b(Chat chat) {
        this.f130698b = chat;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31050a(ISupportForItem cVar) {
        this.f130697a = cVar;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31051a(boolean z) {
        ISupportForItem cVar;
        if (!(this.f130699c == z || (cVar = this.f130697a) == null)) {
            cVar.mo124327a(this);
        }
        this.f130699c = z;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31049a(View view) {
        C52239a.m202617d().mo133582l().mo133650a(this.f130697a.mo124328b(), this.f130697a.mo124329c(), UIUtils.getString(this.f130697a.mo124328b(), R.string.Lark_Legacy_SelectUserCard), this.f130698b, false, 2184);
        m204580f();
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public boolean mo31052a(Intent intent, int i) {
        Log.m165379d("ProfileKBPlusItem", "onActivityResult:" + i);
        if (i != 2184) {
            return false;
        }
        C52239a.m202617d().mo133586p().mo133609a(this.f130698b.getId(), "", "", (ProfileContent) intent.getSerializableExtra("extra_key_profile_content"), new IGetDataCallback<String>() {
            /* class com.ss.android.lark.profile.message.C52886b.C528871 */

            /* renamed from: a */
            public void onSuccess(String str) {
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }
        });
        return false;
    }
}
