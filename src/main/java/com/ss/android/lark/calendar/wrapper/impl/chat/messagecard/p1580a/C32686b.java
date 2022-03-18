package com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1580a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.location.ActivityIdentificationData;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.messagecard.IMessageCellFactory;
import com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.C32187a;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.parser.CalendarMessageDataHelp;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.vo.CalendarContentVO;
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

/* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.a.b */
public class C32686b implements IOpenMessageCell<CalendarContentVO>, IOpenBubbleStyleProvider<CalendarContentVO> {

    /* renamed from: a */
    public static final int f83842a = UIHelper.dp2px(12.0f);

    /* renamed from: b */
    IOpenCellCallback<CalendarContentVO> f83843b;

    /* renamed from: c */
    private final IMessageContext f83844c;

    /* renamed from: d */
    private IMessageCellFactory f83845d;

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120410a(View view) {
    }

    /* renamed from: a */
    public void mo120412a(List<C34029b> list, OpenMenuDataHolder<CalendarContentVO> cVar) {
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: b */
    public C34035c mo120416b(OpenMessageVO<CalendarContentVO> cVar) {
        return null;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public Class<CalendarContentVO> mo120409a() {
        return CalendarContentVO.class;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public C34034b mo120408a(OpenMessageVO<CalendarContentVO> cVar) {
        return C34034b.m131983a(UIUtils.dp2px(this.f83844c.mo122543g(), 12.0f), UIUtils.dp2px(this.f83844c.mo122543g(), 6.0f), 0, 0, false, 2);
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public View mo120406a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f83845d.mo117503a(layoutInflater, viewGroup);
    }

    public C32686b(IMessageContext aVar, IOpenCellCallback<CalendarContentVO> bVar) {
        this.f83844c = aVar;
        this.f83843b = bVar;
        this.f83845d = new C32187a(aVar.mo122543g());
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public BubbleStyle mo120407a(OpenMessageVO<CalendarContentVO> cVar, View view) {
        boolean z;
        int i;
        if (cVar.mo121699g().mo120467a().getCalendarInternalContent().getMeesageType() != CalendarInternalContent.CalendarMessageType.EVENT_DELETE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = ActivityIdentificationData.WALKING;
        } else {
            i = 100;
        }
        return BubbleStyle.m131964a(i, view.findViewById(R.id.bot_head_container), new int[]{0, 0, 0, f83842a});
    }

    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo120412a((List<C34029b>) list, (OpenMenuDataHolder) obj);
    }

    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, OpenMenuDataHolder<CalendarContentVO> cVar) {
        if (bVar.f87966a == 7 || bVar.f87966a == 11 || bVar.f87966a == 13) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m125470a(View view, OpenMessageVO cVar, View view2) {
        return this.f83843b.mo122833b(view, cVar);
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120411a(View view, int i, OpenMessageVO<CalendarContentVO> cVar) {
        this.f83845d.mo117504a(view, i, cVar.mo121699g().mo120467a().getCalendarInternalContent(), CalendarMessageDataHelp.m125509a(cVar));
        view.setOnLongClickListener(new View.OnLongClickListener(view, cVar) {
            /* class com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1580a.$$Lambda$b$1LUESwA1Q8hR96POCl97O_6gsw */
            public final /* synthetic */ View f$1;
            public final /* synthetic */ OpenMessageVO f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final boolean onLongClick(View view) {
                return C32686b.m270318lambda$1LUESwA1Q8hR96POCl97O_6gsw(C32686b.this, this.f$1, this.f$2, view);
            }
        });
    }
}
