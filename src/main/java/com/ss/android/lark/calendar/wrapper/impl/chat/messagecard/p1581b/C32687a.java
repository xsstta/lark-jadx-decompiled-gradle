package com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1581b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.location.ActivityIdentificationData;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.messagecard.IMessageCellFactory;
import com.ss.android.lark.calendar.impl.features.messagecard.general.C32198a;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.content.CalendarGeneralContent;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.parser.CalendarMessageDataHelp;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.vo.CalendarGeneralContentVO;
import com.ss.android.lark.chat.export.ui.menu.OpenMenuDataHolder;
import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.export.ui.message.IOpenCellCallback;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCell;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.export.ui.message.style.C34034b;
import com.ss.android.lark.chat.export.ui.message.style.C34035c;
import com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.export.vo.OpenMessageVO;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.b.a */
public class C32687a implements IOpenMessageCell<CalendarGeneralContentVO>, IOpenBubbleStyleProvider<CalendarGeneralContentVO> {

    /* renamed from: a */
    public static final int f83846a = UIHelper.dp2px(12.0f);

    /* renamed from: b */
    static AbstractC32594f f83847b = C32533b.m124620a();

    /* renamed from: c */
    private final IMessageContext f83848c;

    /* renamed from: d */
    private IMessageCellFactory f83849d;

    /* renamed from: e */
    private IOpenCellCallback<CalendarGeneralContentVO> f83850e;

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120410a(View view) {
    }

    /* renamed from: a */
    public void mo120422a(List<C34029b> list, OpenMenuDataHolder<CalendarGeneralContentVO> cVar) {
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: b */
    public C34035c mo120416b(OpenMessageVO<CalendarGeneralContentVO> cVar) {
        return null;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public Class<CalendarGeneralContentVO> mo120409a() {
        return CalendarGeneralContentVO.class;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public C34034b mo120408a(OpenMessageVO<CalendarGeneralContentVO> cVar) {
        return C34034b.m131983a(UIUtils.dp2px(this.f83848c.mo122543g(), 12.0f), UIUtils.dp2px(this.f83848c.mo122543g(), 6.0f), 0, 0, false, 2);
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public View mo120406a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f83849d.mo117503a(layoutInflater, viewGroup);
    }

    public C32687a(IMessageContext aVar, IOpenCellCallback<CalendarGeneralContentVO> bVar) {
        this.f83848c = aVar;
        this.f83850e = bVar;
        this.f83849d = new C32198a(aVar.mo122543g());
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public BubbleStyle mo120407a(OpenMessageVO<CalendarGeneralContentVO> cVar, View view) {
        return BubbleStyle.m131964a((int) ActivityIdentificationData.WALKING, view.findViewById(R.id.bot_head_container), new int[]{0, 0, 0, f83846a});
    }

    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo120422a((List<C34029b>) list, (OpenMenuDataHolder) obj);
    }

    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, OpenMenuDataHolder<CalendarGeneralContentVO> cVar) {
        if (!cVar.mo126137a().mo121699g().mo120468a() || bVar.f87966a == 5 || bVar.f87966a == 11 || bVar.f87966a == 13 || bVar.f87966a == 12 || bVar.f87966a == 9 || bVar.f87966a == 25) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m125486a(View view, OpenMessageVO cVar, View view2) {
        return this.f83850e.mo122833b(view, cVar);
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120411a(View view, int i, OpenMessageVO<CalendarGeneralContentVO> cVar) {
        this.f83849d.mo117504a(view, i, ((CalendarGeneralContent) cVar.mo121699g().mo126168z()).getCalendarInternalGeneralContent(), CalendarMessageDataHelp.m125509a(cVar));
        view.setOnLongClickListener(new View.OnLongClickListener(view, cVar) {
            /* class com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1581b.$$Lambda$a$5BCODk9EDUDq6wnrfW9TC79mB0 */
            public final /* synthetic */ View f$1;
            public final /* synthetic */ OpenMessageVO f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final boolean onLongClick(View view) {
                return C32687a.m270319lambda$5BCODk9EDUDq6wnrfW9TC79mB0(C32687a.this, this.f$1, this.f$2, view);
            }
        });
    }
}
