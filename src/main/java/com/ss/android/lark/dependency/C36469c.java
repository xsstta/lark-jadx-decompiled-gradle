package com.ss.android.lark.dependency;

import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.dependency.c */
public class C36469c {

    /* renamed from: a */
    private static final Map<Integer, Integer> f94026a;

    /* renamed from: a */
    public static Map<Integer, Integer> m143790a() {
        if (C29990c.m110930b().mo134580h()) {
            f94026a.put(Integer.valueOf((int) R.layout.chat_window_message_common_item_new), 8);
        } else {
            f94026a.put(Integer.valueOf((int) R.layout.chat_window_message_common_item), 8);
        }
        return f94026a;
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f94026a = linkedHashMap;
        linkedHashMap.put(Integer.valueOf((int) R.layout.kb_keyboard), 1);
        linkedHashMap.put(Integer.valueOf((int) R.layout.kb_input_normal), 1);
        linkedHashMap.put(Integer.valueOf((int) R.layout.kb_input_post), 1);
        linkedHashMap.put(Integer.valueOf((int) R.layout.text_content_light_item2), 8);
        linkedHashMap.put(Integer.valueOf((int) R.layout.post_content_light_item2), 8);
        linkedHashMap.put(Integer.valueOf((int) R.layout.image_content_item), 4);
        linkedHashMap.put(Integer.valueOf((int) R.layout.media_content_item), 4);
        linkedHashMap.put(Integer.valueOf((int) R.layout.audio_content_item_layout), 10);
        linkedHashMap.put(Integer.valueOf((int) R.layout.merge_forward_content_item), 4);
        linkedHashMap.put(Integer.valueOf((int) R.layout.share_group_chat_content_item), 4);
        linkedHashMap.put(Integer.valueOf((int) R.layout.activity_chat_window_system_item_new), 8);
        linkedHashMap.put(Integer.valueOf((int) R.layout.file_content_item), 6);
        linkedHashMap.put(Integer.valueOf((int) R.layout.recall_message_content), 4);
        linkedHashMap.put(Integer.valueOf((int) R.layout.telephone_system_content_item), 4);
        linkedHashMap.put(Integer.valueOf((int) R.layout.chat_message_item_unkown), 4);
        linkedHashMap.put(Integer.valueOf((int) R.layout.audio_content_text_translation), 2);
        linkedHashMap.put(Integer.valueOf((int) R.layout.chat_window_reply_stub_layout), 8);
        linkedHashMap.put(Integer.valueOf((int) R.layout.chat_message_preview_layout), 4);
    }
}
