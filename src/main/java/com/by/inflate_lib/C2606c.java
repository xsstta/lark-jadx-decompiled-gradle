package com.by.inflate_lib;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.by.p098a.C2570a;
import com.by.p098a.C2571aa;
import com.by.p098a.C2572ab;
import com.by.p098a.C2573ac;
import com.by.p098a.C2574b;
import com.by.p098a.C2575c;
import com.by.p098a.C2576d;
import com.by.p098a.C2577e;
import com.by.p098a.C2578f;
import com.by.p098a.C2579g;
import com.by.p098a.C2580h;
import com.by.p098a.C2581i;
import com.by.p098a.C2582j;
import com.by.p098a.C2583k;
import com.by.p098a.C2584l;
import com.by.p098a.C2585m;
import com.by.p098a.C2586n;
import com.by.p098a.C2587o;
import com.by.p098a.C2588p;
import com.by.p098a.C2589q;
import com.by.p098a.C2590r;
import com.by.p098a.C2591s;
import com.by.p098a.C2592t;
import com.by.p098a.C2593u;
import com.by.p098a.C2594v;
import com.by.p098a.C2595w;
import com.by.p098a.C2596x;
import com.by.p098a.C2597y;
import com.by.p098a.C2598z;
import com.larksuite.suite.R;

/* renamed from: com.by.inflate_lib.c */
public class C2606c {

    /* renamed from: a */
    private static SparseArray<AbstractC2604b> f8297a = new SparseArray<>();

    /* renamed from: a */
    private static void m10965a() {
        f8297a.put(R.layout.activity_chat_window, new C2570a());
        f8297a.put(R.layout.recall_message_content, new C2594v());
        f8297a.put(R.layout.activity_chat_window_system_item_new, new C2574b());
        f8297a.put(R.layout.video_meeting_share_card, new C2572ab());
        f8297a.put(R.layout.chat_red_dot_view, new C2577e());
        f8297a.put(R.layout.chat_window_component_keyboard, new C2578f());
        f8297a.put(R.layout.media_content_item, new C2589q());
        f8297a.put(R.layout.location_content_item, new C2587o());
        f8297a.put(R.layout.text_card_content_item, new C2596x());
        f8297a.put(R.layout.file_content_item, new C2581i());
        f8297a.put(R.layout.message_vote_card_content_item, new C2590r());
        f8297a.put(R.layout.audio_content_item_layout, new C2575c());
        f8297a.put(R.layout.mail_home_thread_item_layout, new C2588p());
        f8297a.put(R.layout.layout_reaction_component_flow_detail_item, new C2586n());
        f8297a.put(R.layout.chat_window_reply_stub_layout, new C2579g());
        f8297a.put(R.layout.kb_keyboard, new C2585m());
        f8297a.put(R.layout.post_content_item_new2, new C2591s());
        f8297a.put(R.layout.kb_input_normal, new C2583k());
        f8297a.put(R.layout.kb_input_post, new C2584l());
        f8297a.put(R.layout.view_chat_timezone_tip, new C2573ac());
        f8297a.put(R.layout.text_translate_content2, new C2571aa());
        f8297a.put(R.layout.text_content_item_new2, new C2597y());
        f8297a.put(R.layout.text_content_light_item2, new C2598z());
        f8297a.put(R.layout.telephone_system_content_item, new C2595w());
        f8297a.put(R.layout.default_white_ptr_loading, new C2580h());
        f8297a.put(R.layout.image_content_item, new C2582j());
        f8297a.put(R.layout.chat_message_item_unkown, new C2576d());
        f8297a.put(R.layout.post_content_light_item2, new C2592t());
        f8297a.put(R.layout.post_translate_content2, new C2593u());
    }

    static {
        m10965a();
    }

    /* renamed from: a */
    public static AbstractC2604b m10964a(int i) {
        return f8297a.get(i);
    }

    /* renamed from: a */
    static View m10963a(AbstractC2604b bVar, int i, Context context, ViewGroup viewGroup, boolean z) throws Exception {
        return bVar.mo11274a(context, viewGroup, z);
    }
}
