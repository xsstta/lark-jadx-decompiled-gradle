package com.ss.android.vc.lark.message.meeting.cardview;

import android.util.SparseArray;
import com.ss.android.vc.net.push.VideoChatPush;

/* renamed from: com.ss.android.vc.lark.message.meeting.cardview.a */
public class C61114a {

    /* renamed from: a */
    private static SparseArray<VideoChatPush.AbstractC63568h> f153082a = new SparseArray<>();

    /* renamed from: a */
    public static void m237673a(int i) {
        if (f153082a.get(i) != null) {
            VideoChatPush.m249004a().mo219739b(f153082a.get(i));
            f153082a.remove(i);
        }
    }

    /* renamed from: a */
    public static void m237674a(int i, VideoChatPush.AbstractC63568h hVar) {
        if (f153082a.get(i) != null) {
            VideoChatPush.m249004a().mo219739b(f153082a.get(i));
        }
        f153082a.put(i, hVar);
        VideoChatPush.m249004a().mo219716a(hVar);
    }
}
