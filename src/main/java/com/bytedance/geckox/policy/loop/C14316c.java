package com.bytedance.geckox.policy.loop;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.policy.loop.model.LoopRequestModel;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.geckox.policy.loop.c */
public class C14316c {

    /* renamed from: a */
    public int f37616a;

    /* renamed from: b */
    public Map<String, LoopRequestModel> f37617b = new ConcurrentHashMap();

    /* renamed from: c */
    public AbstractC14318a f37618c;

    /* renamed from: d */
    private Handler f37619d;

    /* renamed from: e */
    private String f37620e;

    /* renamed from: f */
    private AtomicBoolean f37621f = new AtomicBoolean(false);

    /* renamed from: com.bytedance.geckox.policy.loop.c$a */
    public interface AbstractC14318a {
        /* renamed from: a */
        void mo52378a(int i, Map<String, LoopRequestModel> map);
    }

    /* renamed from: a */
    public static HandlerThread m57708a(String str, int i) {
        return C20341a.m74147a() ? C20339a.m74145a(str, i, C20341a.f49621b) : new HandlerThread(str, i);
    }

    /* renamed from: b */
    public void mo52376b() {
        this.f37621f.set(true);
        Message obtainMessage = this.f37619d.obtainMessage();
        obtainMessage.what = this.f37616a;
        obtainMessage.arg1 = 3;
        this.f37619d.sendMessageDelayed(obtainMessage, (long) (this.f37616a * 1000));
    }

    /* renamed from: a */
    public void mo52372a() {
        int i = this.f37616a;
        if (i != 0 && !this.f37619d.hasMessages(i) && !this.f37621f.get()) {
            C14276b.m57604a("gecko-debug-tag", "[loop]start loop,interval level:", this.f37620e, ",combine deployments:", this.f37617b);
            mo52376b();
        }
    }

    /* renamed from: a */
    public void mo52374a(AbstractC14318a aVar) {
        this.f37618c = aVar;
    }

    /* renamed from: a */
    private LoopRequestModel m57709a(String str) {
        LoopRequestModel loopRequestModel = this.f37617b.get(str);
        if (loopRequestModel == null) {
            return new LoopRequestModel(new HashMap(), new LoopRequestModel.LoopDeploymentModel());
        }
        return loopRequestModel;
    }

    /* renamed from: a */
    public void mo52373a(int i) {
        if (this.f37616a != i) {
            if (this.f37621f.get()) {
                this.f37619d.removeMessages(this.f37616a);
                this.f37621f.set(false);
            }
            this.f37616a = i;
            mo52372a();
        }
    }

    public C14316c(String str, int i) {
        this.f37620e = str;
        this.f37616a = i;
        HandlerThread a = m57708a("combine", 3);
        a.start();
        this.f37619d = new Handler(a.getLooper()) {
            /* class com.bytedance.geckox.policy.loop.C14316c.HandlerC143171 */

            public void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.arg1 == 3) {
                    C14276b.m57604a("gecko-debug-tag", "[loop]loop msg.what:", Integer.valueOf(message.what), "interval:", Integer.valueOf(C14316c.this.f37616a), "time:", Long.valueOf(System.currentTimeMillis()));
                    if (C14316c.this.f37617b != null && !C14316c.this.f37617b.isEmpty()) {
                        if (C14316c.this.f37618c != null) {
                            C14316c.this.f37618c.mo52378a(C14316c.this.f37616a, C14316c.this.f37617b);
                        }
                        C14316c.this.mo52376b();
                    }
                }
            }
        };
    }

    /* renamed from: a */
    public void mo52375a(String str, List<String> list, Map<String, List<CheckRequestBodyModel.TargetChannel>> map, Map<String, Map<String, Object>> map2) {
        if (map != null) {
            for (String str2 : map.keySet()) {
                LoopRequestModel a = m57709a(str2);
                if (!TextUtils.isEmpty(str) && !"default".equals(str) && !a.getDeployment().getGroupName().contains(str)) {
                    a.getDeployment().getGroupName().add(str);
                }
                if (!(map2 == null || map2.get(str2) == null)) {
                    a.getCustom().putAll(map2.get(str2));
                }
                List<CheckRequestBodyModel.TargetChannel> list2 = map.get(str2);
                if (list2 == null || list2.isEmpty()) {
                    this.f37617b.put(str2, a);
                } else {
                    for (CheckRequestBodyModel.TargetChannel targetChannel : list2) {
                        Iterator<CheckRequestBodyModel.TargetChannel> it = a.getDeployment().getTargetChannels().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (it.next().channelName.equals(targetChannel.channelName)) {
                                    break;
                                }
                            } else {
                                a.getDeployment().getTargetChannels().add(targetChannel);
                                break;
                            }
                        }
                    }
                    this.f37617b.put(str2, a);
                }
            }
        } else if (!TextUtils.isEmpty(str) && !"default".equals(str) && list != null && !list.isEmpty()) {
            for (String str3 : list) {
                LoopRequestModel a2 = m57709a(str3);
                if (!TextUtils.isEmpty(str) && !a2.getDeployment().getGroupName().contains(str)) {
                    a2.getDeployment().getGroupName().add(str);
                }
                if (!(map2 == null || map2.get(str3) == null)) {
                    a2.getCustom().putAll(map2.get(str3));
                }
                this.f37617b.put(str3, a2);
            }
        }
    }
}
