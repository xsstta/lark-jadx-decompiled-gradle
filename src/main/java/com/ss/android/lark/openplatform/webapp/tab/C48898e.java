package com.ss.android.lark.openplatform.webapp.tab;

import android.content.Context;
import android.net.Uri;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.openplatform.webapp.tab.p2410a.AbstractC48889e;
import com.ss.android.lark.openplatform.webapp.tab.p2410a.C48881a;
import com.ss.android.lark.openplatform.webapp.tab.p2410a.C48882b;
import com.ss.android.lark.openplatform.webapp.tab.p2410a.C48883c;
import com.ss.android.lark.openplatform.webapp.tab.p2410a.C48884d;
import com.ss.android.lark.openplatform.webapp.tab.plugin.SetMainNavRightItemsPlugin;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.openplatform.webapp.tab.e */
public class C48898e implements ITitleInfo {

    /* renamed from: a */
    private TabAppInfo f122849a;

    /* renamed from: b */
    private Context f122850b;

    /* renamed from: c */
    private AbstractC48889e f122851c;

    /* renamed from: d */
    private boolean f122852d;

    /* renamed from: e */
    private List<AbstractC44545b> f122853e;

    /* renamed from: f */
    private List<AbstractC48899a> f122854f = new ArrayList();

    /* renamed from: com.ss.android.lark.openplatform.webapp.tab.e$a */
    public interface AbstractC48899a {
        /* renamed from: a */
        void mo170712a();
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: a */
    public boolean mo33255a() {
        return true;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: f */
    public ITitleInfo.AbstractC44542a mo33260f() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: g */
    public ITitleInfo.C44543b mo33261g() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: c */
    public ITitleInfo.IconStyle mo33257c() {
        return ITitleInfo.IconStyle.Hide;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: e */
    public ITitleInfo.Status mo33259e() {
        return ITitleInfo.Status.Normal;
    }

    /* renamed from: h */
    public boolean mo170743h() {
        return this.f122852d;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: b */
    public String mo33256b() {
        TabAppInfo tabAppInfo = this.f122849a;
        if (tabAppInfo != null) {
            return C48880a.m192567a(this.f122850b, tabAppInfo);
        }
        return "";
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: d */
    public List<AbstractC44545b> mo33258d() {
        if (CollectionUtils.isEmpty(this.f122853e)) {
            if (this.f122852d) {
                this.f122853e = m192663k();
            } else {
                this.f122853e = m192662j();
            }
        }
        return this.f122853e;
    }

    /* renamed from: i */
    public void mo170744i() {
        for (AbstractC48899a aVar : this.f122854f) {
            aVar.mo170712a();
        }
    }

    /* renamed from: j */
    private List<AbstractC44545b> m192662j() {
        ArrayList arrayList = new ArrayList();
        C48881a aVar = new C48881a(this.f122850b, this.f122851c);
        C48883c cVar = new C48883c(this.f122850b, this.f122851c);
        arrayList.add(aVar);
        arrayList.add(cVar);
        arrayList.add(new C48884d(this.f122850b, this.f122851c));
        this.f122854f.add(aVar);
        this.f122854f.add(cVar);
        return arrayList;
    }

    /* renamed from: k */
    private List<AbstractC44545b> m192663k() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C48882b(this.f122850b));
        arrayList.add(new C48882b(this.f122850b));
        arrayList.add(new C48882b(this.f122850b));
        return arrayList;
    }

    /* renamed from: a */
    public boolean mo170742a(SetMainNavRightItemsPlugin.Item[] itemArr) {
        if (!mo170743h() || itemArr == null || itemArr.length > 3) {
            return false;
        }
        if (itemArr.length == 1) {
            ((C48882b) this.f122853e.get(0)).mo170713a((SetMainNavRightItemsPlugin.Item) null);
            ((C48882b) this.f122853e.get(1)).mo170713a((SetMainNavRightItemsPlugin.Item) null);
            ((C48882b) this.f122853e.get(2)).mo170713a(itemArr[0]);
        } else if (itemArr.length == 2) {
            ((C48882b) this.f122853e.get(0)).mo170713a((SetMainNavRightItemsPlugin.Item) null);
            ((C48882b) this.f122853e.get(1)).mo170713a(itemArr[0]);
            ((C48882b) this.f122853e.get(2)).mo170713a(itemArr[1]);
        } else if (itemArr.length == 3) {
            ((C48882b) this.f122853e.get(0)).mo170713a(itemArr[0]);
            ((C48882b) this.f122853e.get(1)).mo170713a(itemArr[1]);
            ((C48882b) this.f122853e.get(2)).mo170713a(itemArr[2]);
        }
        return true;
    }

    public C48898e(Context context, TabAppInfo tabAppInfo, AbstractC48889e eVar) {
        this.f122849a = tabAppInfo;
        this.f122850b = context;
        this.f122851c = eVar;
        this.f122852d = Uri.parse(tabAppInfo.getExtra().getUrl()).getBooleanQueryParameter("lark_custom_main_nav_right_items", false);
    }
}
