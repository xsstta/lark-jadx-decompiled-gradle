package com.bytedance.ee.bear.p391g.p394c;

import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AbstractC5173g;
import com.bytedance.ee.bear.contract.BinderIMarkFeedCallback;
import com.bytedance.ee.bear.contract.BinderIProcessStart;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.more.p500a.AbstractC10195a;
import com.bytedance.ee.bear.more.p502c.AbstractC10204a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.ss.android.lark.doc.IDocCallback;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.ee.bear.g.c.a */
public class C7809a extends AbstractC5173g {

    /* renamed from: a */
    public static AbstractC10195a f21099a;

    /* renamed from: b */
    public static AbstractC10204a f21100b;

    /* renamed from: c */
    private static IDocCallback f21101c;

    /* renamed from: d */
    private List<ak.AbstractC5107c> f21102d = new CopyOnWriteArrayList();

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void goToHelpCenter() {
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5173g, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void goToCustomService() {
        AbstractC10195a aVar = f21099a;
        if (aVar != null) {
            aVar.mo38981a();
        }
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void fetchEmojis() {
        if (C4511g.m18593c() == null) {
            C13479a.m54758a("SdkHostServiceImp", "fetchEmojis() fail : sReactionAgent == null");
        } else {
            C4511g.m18593c().mo20288c();
        }
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public List<String> getRecentReactionList() {
        if (C4511g.m18593c() != null) {
            return C4511g.m18593c().mo20283a();
        }
        C13479a.m54758a("SdkHostServiceImp", "getRecentReactionList() fail : sReactionAgent == null");
        return new ArrayList();
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public List<String> getWholeReactionList() {
        if (C4511g.m18593c() != null) {
            return C4511g.m18593c().mo20287b();
        }
        C13479a.m54758a("SdkHostServiceImp", "getWholeReactionList() fail : sReactionAgent == null");
        return new ArrayList();
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void onProcessStart() {
        for (ak.AbstractC5107c cVar : this.f21102d) {
            cVar.onProcessStart();
        }
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void routeToLarkAbout() {
        C13479a.m54772d("SdkHostServiceImp", "routeToLarkAbout");
        Bundle bundle = new Bundle();
        bundle.putString("command", "mine_about");
        doCommand(bundle);
    }

    /* renamed from: a */
    public static void m31289a(IBinder iBinder) {
        f21101c = IDocCallback.Stub.asInterface(iBinder);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void addProcessStartCallback(BinderIProcessStart binderIProcessStart) {
        this.f21102d.add(binderIProcessStart);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void removeProcessStartCallback(BinderIProcessStart binderIProcessStart) {
        this.f21102d.remove(binderIProcessStart);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public boolean isFeedCardShortcut(String str) {
        AbstractC10204a aVar = f21100b;
        if (aVar != null) {
            return aVar.mo38998a(str);
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public String getEmojiImageFromNet(String str) {
        if (C4511g.m18593c() != null) {
            return C4511g.m18593c().mo20286b(str);
        }
        C13479a.m54758a("SdkHostServiceImp", "getEmojiImageFromNet() fail : sReactionAgent == null");
        return null;
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void jumpToLarkFeed(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("command", "jump_to_feed");
        bundle.putString("page_name", str);
        doCommand(bundle);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void routeTabDocs(int i) {
        Bundle bundle = new Bundle();
        bundle.putString("command", "tab_docs");
        bundle.putInt("tab", i);
        doCommand(bundle);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public Bundle doCommand(Bundle bundle) {
        IDocCallback iDocCallback = f21101c;
        if (iDocCallback == null || !iDocCallback.asBinder().isBinderAlive()) {
            return null;
        }
        try {
            return f21101c.doCommand(bundle);
        } catch (RemoteException e) {
            C13479a.m54758a("SdkHostServiceImp", " doCommand  RemoteException: " + e);
            return null;
        }
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void handleQrResult(String str) {
        C13479a.m54772d("SdkHostServiceImp", "handleQrResult(), result:" + C13598b.m55197d(str));
        Bundle bundle = new Bundle();
        bundle.putString("command", "handle_result_qr");
        bundle.putString("result_qr", str);
        doCommand(bundle);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void updateOrder(String str) {
        C13479a.m54764b("SdkHostServiceImp", "updateOrder(): reactionKey = " + str);
        if (C4511g.m18593c() == null) {
            C13479a.m54758a("SdkHostServiceImp", "updateOrder() fail : sReactionAgent == null");
        } else {
            C4511g.m18593c().mo20285a(str);
        }
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public String recognizeQRCode(String str) {
        C13479a.m54772d("SdkHostServiceImp", "recognizeQRCode(), path:" + C13598b.m55197d(str));
        if (TextUtils.isEmpty(str)) {
            C13479a.m54758a("SdkHostServiceImp", "recognizeQRCode(), photo path is null");
            return "";
        }
        Bundle bundle = new Bundle();
        bundle.putString("command", "recognize_qr");
        bundle.putString("photo_qr", str);
        Bundle doCommand = doCommand(bundle);
        if (doCommand == null) {
            C13479a.m54758a("SdkHostServiceImp", "recognizeQRCode(), is null");
            return "";
        } else if (TextUtils.equals(doCommand.getString("command"), "recognize_qr")) {
            return doCommand.getString("result_qr");
        } else {
            return "";
        }
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void shareTextPlain(String str, String str2) {
        Bundle a = m31288a(str, str2);
        a.putString("android.intent.extra.MIME_TYPES", "text/plain");
        doCommand(a);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void getResMapFromNet(int i, List<String> list) {
        if (C4511g.m18593c() == null) {
            C13479a.m54758a("SdkHostServiceImp", "getResMapFromNet() fail : sReactionAgent == null");
        } else {
            C4511g.m18593c().mo20284a(i, list);
        }
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void goToProfileMain(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            Bundle bundle = new Bundle();
            bundle.putString("command", "profile_main");
            bundle.putString("user_id", str);
            bundle.putString("title", str2);
            doCommand(bundle);
        }
    }

    /* renamed from: a */
    private Bundle m31288a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("command", "share");
        if (str != null) {
            bundle.putString("android.intent.extra.TITLE", str);
        }
        if (str2 != null) {
            bundle.putString("android.intent.extra.TEXT", str2);
        }
        bundle.putString("android.intent.extra.USER", "Docs");
        bundle.putBoolean("android.intent.extra.LOCAL_ONLY", true);
        return bundle;
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void openExternalUrl(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            Bundle bundle = new Bundle();
            bundle.putString("command", "open_url");
            bundle.putString("url", str);
            if (map != null && !map.isEmpty()) {
                bundle.putSerializable("extra", (Serializable) map);
            }
            doCommand(bundle);
        }
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void shareImages(String str, String str2, ArrayList<Uri> arrayList) {
        Bundle a = m31288a(str, str2);
        a.putString("android.intent.extra.MIME_TYPES", "image/*");
        if (arrayList != null) {
            a.putParcelableArrayList("android.intent.extra.STREAM", arrayList);
        }
        doCommand(a);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void shareTextPlain(String str, String str2, boolean z) {
        Bundle a = m31288a(str, str2);
        a.putBoolean("support_addition_note", z);
        a.putString("android.intent.extra.MIME_TYPES", "text/plain");
        doCommand(a);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void markFeedCardShortcut(boolean z, int i, String str, BinderIMarkFeedCallback binderIMarkFeedCallback) {
        AbstractC10204a aVar = f21100b;
        if (aVar != null) {
            aVar.mo38997a(z, i, str, binderIMarkFeedCallback);
        }
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void shareImages(String str, String str2, ArrayList<Uri> arrayList, boolean z) {
        Bundle a = m31288a(str, str2);
        a.putBoolean("support_addition_note", z);
        a.putString("android.intent.extra.MIME_TYPES", "image/*");
        if (arrayList != null) {
            a.putParcelableArrayList("android.intent.extra.STREAM", arrayList);
        }
        doCommand(a);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void notifyAnnouncementChange(String str, String str2, boolean z, String str3, IBinder iBinder) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C13479a.m54764b("SdkHostServiceImp", "notifyAnnouncementChange: chat id = " + str + ", url = " + C13598b.m55197d(str2));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("command", "notify_announcement_change");
        bundle.putString("chat_id", str);
        bundle.putString("thumbnail", str2);
        bundle.putBoolean("is_edited", z);
        bundle.putString("announce_name", str3);
        bundle.putBinder("announce_send_callback", iBinder);
        doCommand(bundle);
    }
}
