package com.larksuite.component.openplatform.infra.network.department;

import com.bytedance.ee.lark.infra.network.ref.entity.AbstractC12876c;
import com.bytedance.ee.lark.infra.network.ref.entity.AbstractC12877d;
import com.bytedance.ee.lark.infra.network.ref.entity.MethodType;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12865a;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12872h;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.component.openplatform.infra.network.base.C25542c;
import com.larksuite.component.openplatform.infra.network.base.C25545f;
import com.larksuite.component.openplatform.infra.network.base.OpenPlatformRequestConfig;
import com.larksuite.component.openplatform.infra.network.openchatid2chatid.C25551c;
import java.util.ArrayList;
import java.util.List;

public class DepartmentIds2OpenDepartmentIdsConfig extends OpenPlatformRequestConfig {
    @Override // com.bytedance.ee.lark.infra.network.ref.p636b.AbstractC12871g
    /* renamed from: c */
    public String mo48526c() {
        return "/open-apis/mina/getChatIDsByOpenChatIDs";
    }

    @Override // com.bytedance.ee.lark.infra.network.ref.p636b.AbstractC12871g
    /* renamed from: d */
    public MethodType mo48527d() {
        return MethodType.POST;
    }

    @Override // com.bytedance.ee.lark.infra.network.ref.p636b.AbstractC12871g
    /* renamed from: h */
    public AbstractC12876c mo48531h() {
        return new C12865a();
    }

    @Override // com.bytedance.ee.lark.infra.network.ref.p636b.AbstractC12871g
    /* renamed from: i */
    public AbstractC12877d mo48532i() {
        return new C25548a();
    }

    @Override // com.larksuite.component.openplatform.infra.network.base.OpenPlatformRequestConfig
    /* renamed from: k */
    public List<C12872h> mo88683k() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C25542c(DomainSettings.Alias.MP_CONFIG));
        arrayList.add(new C25551c());
        arrayList.add(new C25545f());
        return arrayList;
    }
}
