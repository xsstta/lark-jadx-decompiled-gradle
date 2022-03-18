package com.ss.android.lark.money.redpacket.history.fragment.p2370a;

import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.money.MoneyModule;
import com.ss.android.lark.money.p2367c.C48033a;
import com.ss.android.lark.money.redpacket.dto.RedPacketHistoryItem;
import com.ss.android.lark.money.redpacket.history.fragment.p2371b.C48135a;
import com.ss.android.lark.money_export.IMoneyModuleDependency;
import com.ss.android.lark.utils.UIHelper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: com.ss.android.lark.money.redpacket.history.fragment.a.a */
public abstract class AbstractC48127a implements AbstractC48129c {

    /* renamed from: a */
    protected IMoneyModuleDependency.IChatDependency f121132a = MoneyModule.getDependency().getChatDependency();

    /* renamed from: b */
    private SimpleDateFormat f121133b = new SimpleDateFormat("MM-dd");

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo168514a(RedPacketHistoryItem redPacketHistoryItem);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo168516b(RedPacketHistoryItem redPacketHistoryItem);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo168517c(RedPacketHistoryItem redPacketHistoryItem);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo168518d(RedPacketHistoryItem redPacketHistoryItem);

    /* renamed from: e */
    private String m190002e(RedPacketHistoryItem redPacketHistoryItem) {
        return this.f121133b.format(new Date(redPacketHistoryItem.time * 1000));
    }

    /* renamed from: f */
    private String m190003f(RedPacketHistoryItem redPacketHistoryItem) {
        return C48033a.m189577a(((double) redPacketHistoryItem.amount) * 0.01d) + UIHelper.getString(R.string.Lark_Legacy_DetailMoneyLabel);
    }

    @Override // com.ss.android.lark.money.redpacket.history.fragment.p2370a.AbstractC48129c
    /* renamed from: a */
    public List<C48135a> mo168515a(List<RedPacketHistoryItem> list) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (RedPacketHistoryItem redPacketHistoryItem : list) {
            C48135a aVar = new C48135a();
            aVar.f121144b = redPacketHistoryItem.id;
            aVar.f121146d = mo168514a(redPacketHistoryItem);
            aVar.f121145c = mo168516b(redPacketHistoryItem);
            aVar.f121148f = m190002e(redPacketHistoryItem);
            aVar.f121149g = m190003f(redPacketHistoryItem);
            aVar.f121147e = mo168517c(redPacketHistoryItem);
            aVar.f121150h = mo168518d(redPacketHistoryItem);
            arrayList.add(aVar);
        }
        return arrayList;
    }
}
