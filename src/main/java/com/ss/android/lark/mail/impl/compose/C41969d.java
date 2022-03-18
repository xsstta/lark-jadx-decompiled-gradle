package com.ss.android.lark.mail.impl.compose;

import android.text.TextUtils;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.compose.attachment.LocalAttachment;
import com.ss.android.lark.mail.impl.entity.MailImage;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.compose.d */
public class C41969d {
    /* renamed from: b */
    private static long m166940b(String str) {
        try {
            return Long.parseLong(str);
        } catch (Exception e) {
            Log.m165384e("ComposeUtils", "optLongFromJsonString", e);
            return 0;
        }
    }

    /* renamed from: a */
    static MailImage m166936a(LocalAttachment localAttachment) {
        Log.m165389i("ComposeUtils", "composeImageDataForPreview");
        if (localAttachment == null) {
            Log.m165383e("ComposeUtils", "composeImageDataForPreview empty data");
            return null;
        } else if (TextUtils.isEmpty(localAttachment.mo151234j())) {
            Log.m165383e("ComposeUtils", "composeImageDataForPreview empty file token");
            return null;
        } else {
            MailImage mailImage = new MailImage();
            mailImage.mo151473c(localAttachment.mo151234j());
            mailImage.mo151472b(localAttachment.mo151229f());
            mailImage.mo151469a(localAttachment.mo151231h());
            return mailImage;
        }
    }

    /* renamed from: a */
    public static ArrayList<MailImage> m166937a(String str) {
        Log.m165389i("ComposeUtils", "extractImageListFromJson");
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("ComposeUtils", "extractImageListFromJson invalid data");
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            ArrayList<MailImage> arrayList = new ArrayList<>();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                MailImage mailImage = new MailImage();
                mailImage.mo151475d(jSONObject.optString("cid"));
                mailImage.mo151472b(jSONObject.optString("name"));
                mailImage.mo151473c(jSONObject.optString("token"));
                mailImage.mo151469a(m166940b(jSONObject.optString("size")));
                m166939a(mailImage);
                arrayList.add(mailImage);
            }
            return arrayList;
        } catch (Exception e) {
            Log.m165384e("ComposeUtils", "extractImageListFromJson", e);
            return null;
        }
    }

    /* renamed from: a */
    static ArrayList<MailImage> m166938a(List<LocalAttachment> list) {
        MailImage a;
        Log.m165389i("ComposeUtils", "extractImageListFromAttachmentList");
        if (CollectionUtils.isEmpty(list)) {
            Log.m165383e("ComposeUtils", "extractImageListFromAttachmentList empty data");
            return null;
        }
        ArrayList<MailImage> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            LocalAttachment localAttachment = list.get(i);
            if (!(localAttachment == null || !C26311p.m95292l(C26311p.m95283c(localAttachment.mo151229f())) || (a = m166936a(localAttachment)) == null)) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m166939a(MailImage mailImage) {
        if (mailImage != null) {
            if (TextUtils.isEmpty(mailImage.mo151477e()) || mailImage.mo151477e().equals("undefined")) {
                mailImage.mo151472b(mailImage.mo151480f() + ".png");
            }
        }
    }
}
