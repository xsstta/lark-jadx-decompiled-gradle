package com.ss.android.lark.chat.service;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.Message;
import com.bytedance.lark.pb.settings.v1.SetDataDisplayWeightRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.DeviceUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.abtest.ExperimentConfig;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.service.m */
public class C34298m {

    /* renamed from: a */
    private boolean f88588a;

    /* renamed from: b */
    private boolean f88589b;

    /* renamed from: c */
    private Map<Integer, Double> f88590c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.m$a */
    public static final class C34300a {

        /* renamed from: a */
        public static final C34298m f88591a = new C34298m();
    }

    /* renamed from: a */
    public static C34298m m132985a() {
        return C34300a.f88591a;
    }

    /* renamed from: c */
    public boolean mo126843c() {
        return this.f88588a;
    }

    private C34298m() {
        this.f88590c = new HashMap();
        this.f88588a = ExperimentConfig.f71633b.mo101364b();
        m132987e();
    }

    /* renamed from: f */
    private Map<Integer, SetDataDisplayWeightRequest.DisplayWeight> m132988f() {
        HashMap hashMap = new HashMap(3);
        hashMap.put(Integer.valueOf(SetDataDisplayWeightRequest.DataType.CHAT_MESSAGE.getValue()), m132986b(UIHelper.dp2px(BitmapDescriptorFactory.HUE_RED)));
        return hashMap;
    }

    /* renamed from: b */
    public void mo126842b() {
        if (this.f88588a && !this.f88589b) {
            SetDataDisplayWeightRequest.C19203a aVar = new SetDataDisplayWeightRequest.C19203a();
            aVar.mo65572a(m132988f());
            SdkSender.asynSendRequestNonWrap(Command.SET_DATA_DISPLAY_WEIGHT, aVar, null, null);
            this.f88589b = true;
        }
    }

    /* renamed from: d */
    public int mo126844d() {
        return (DeviceUtils.getScreenHeight(C29990c.m110930b().mo134528a()) / UIHelper.dp2px(20.0f)) + 1;
    }

    /* renamed from: e */
    private void m132987e() {
        Map<Integer, Double> map = this.f88590c;
        Integer valueOf = Integer.valueOf(Message.Type.UNKNOWN.getValue());
        Double valueOf2 = Double.valueOf(1.0d);
        map.put(valueOf, valueOf2);
        Map<Integer, Double> map2 = this.f88590c;
        Integer valueOf3 = Integer.valueOf(Message.Type.POST.getValue());
        Double valueOf4 = Double.valueOf(2.0d);
        map2.put(valueOf3, valueOf4);
        Map<Integer, Double> map3 = this.f88590c;
        Integer valueOf5 = Integer.valueOf(Message.Type.FILE.getValue());
        Double valueOf6 = Double.valueOf(1.5d);
        map3.put(valueOf5, valueOf6);
        this.f88590c.put(Integer.valueOf(Message.Type.TEXT.getValue()), valueOf2);
        this.f88590c.put(Integer.valueOf(Message.Type.IMAGE.getValue()), valueOf4);
        this.f88590c.put(Integer.valueOf(Message.Type.SYSTEM.getValue()), valueOf2);
        this.f88590c.put(Integer.valueOf(Message.Type.AUDIO.getValue()), valueOf2);
        Map<Integer, Double> map4 = this.f88590c;
        Integer valueOf7 = Integer.valueOf(Message.Type.SHARE_GROUP_CHAT.getValue());
        Double valueOf8 = Double.valueOf(3.0d);
        map4.put(valueOf7, valueOf8);
        this.f88590c.put(Integer.valueOf(Message.Type.STICKER.getValue()), valueOf4);
        this.f88590c.put(Integer.valueOf(Message.Type.MERGE_FORWARD.getValue()), valueOf6);
        this.f88590c.put(Integer.valueOf(Message.Type.CALENDAR.getValue()), valueOf8);
        this.f88590c.put(Integer.valueOf(Message.Type.CARD.getValue()), valueOf8);
        this.f88590c.put(Integer.valueOf(Message.Type.MEDIA.getValue()), valueOf4);
        this.f88590c.put(Integer.valueOf(Message.Type.SHARE_CALENDAR_EVENT.getValue()), valueOf8);
        this.f88590c.put(Integer.valueOf(Message.Type.HONGBAO.getValue()), valueOf4);
        this.f88590c.put(Integer.valueOf(Message.Type.VIDEO_CHAT.getValue()), Double.valueOf(2.5d));
        this.f88590c.put(Integer.valueOf(Message.Type.LOCATION.getValue()), Double.valueOf(3.5d));
        this.f88590c.put(Integer.valueOf(Message.Type.GENERAL_CALENDAR.getValue()), valueOf8);
        this.f88590c.put(Integer.valueOf(Message.Type.TODO.getValue()), valueOf8);
    }

    /* renamed from: a */
    public double mo126841a(int i) {
        Double d = this.f88590c.get(Integer.valueOf(i));
        if (d == null) {
            return 1.0d;
        }
        return d.doubleValue();
    }

    /* renamed from: b */
    private SetDataDisplayWeightRequest.DisplayWeight m132986b(int i) {
        SetDataDisplayWeightRequest.DisplayWeight.C19201a aVar = new SetDataDisplayWeightRequest.DisplayWeight.C19201a();
        HashMap hashMap = new HashMap();
        for (Map.Entry<Integer, Double> entry : this.f88590c.entrySet()) {
            hashMap.put(entry.getKey(), Double.valueOf(entry.getValue().doubleValue() + ((double) i)));
        }
        aVar.mo65566a(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(Integer.valueOf(Message.Type.TEXT.getValue()), Double.valueOf(6.0d));
        hashMap2.put(Integer.valueOf(Message.Type.POST.getValue()), Double.valueOf(6.0d));
        aVar.mo65568b(hashMap2);
        return aVar.build();
    }
}
