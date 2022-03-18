package com.ss.android.lark.chat.chatwindow.chat;

import com.bytedance.apm.ApmAgent;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.d */
public class C33218d {

    /* renamed from: a */
    private Set<String> f85432a = new HashSet();

    /* renamed from: b */
    private Set<String> f85433b = new HashSet();

    /* renamed from: c */
    private AbstractC33219a f85434c;

    /* renamed from: d */
    private List<Runnable> f85435d = new LinkedList();

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.d$a */
    public interface AbstractC33219a {
        /* renamed from: a */
        List<String> mo122450a(Collection<String> collection);
    }

    /* renamed from: a */
    public void mo122448a() {
        if (!this.f85432a.isEmpty()) {
            m128327b();
        }
        for (Runnable runnable : this.f85435d) {
            CoreThreadPool.getBackgroundHandler().removeCallbacks(runnable);
        }
        this.f85435d.clear();
        this.f85432a.clear();
        this.f85433b.clear();
        Log.m165379d("ChatMonitorHandler", "destroy");
    }

    /* renamed from: b */
    private void m128327b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("eesa_secret_chat_message_count", this.f85432a.size());
            jSONObject.put("eesa_secret_chat_empty_message_count", this.f85433b.size());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ApmAgent.monitorEvent("secret_chat_message_empty_count", null, jSONObject, null);
        Log.m165379d("ChatMonitorHandler", "reportMonitorState:" + this.f85432a.size() + "/" + this.f85433b.size());
    }

    public C33218d(AbstractC33219a aVar) {
        this.f85434c = aVar;
    }

    /* renamed from: a */
    private void m128326a(Set<String> set) {
        $$Lambda$d$CDTKgCtfdFp1L0w7eY0tc93f8N0 r0 = new Runnable(set) {
            /* class com.ss.android.lark.chat.chatwindow.chat.$$Lambda$d$CDTKgCtfdFp1L0w7eY0tc93f8N0 */
            public final /* synthetic */ Set f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C33218d.lambda$CDTKgCtfdFp1L0w7eY0tc93f8N0(C33218d.this, this.f$1);
            }
        };
        this.f85435d.add(r0);
        CoreThreadPool.getBackgroundHandler().postDelayed(r0, 3000);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m128328b(Set set) {
        AbstractC33219a aVar = this.f85434c;
        if (aVar != null) {
            List<String> a = aVar.mo122450a(set);
            this.f85433b.addAll(a);
            Log.m165379d("ChatMonitorHandler", "checkMsgState finish:" + a.size());
        }
    }

    /* renamed from: a */
    public void mo122449a(List<String> list) {
        HashSet hashSet = new HashSet(list);
        hashSet.removeAll(this.f85432a);
        if (!hashSet.isEmpty()) {
            m128326a(hashSet);
            this.f85432a.addAll(hashSet);
        }
        Log.m165389i("ChatMonitorHandler", "handleCurrentMsg:" + hashSet.size());
    }
}
