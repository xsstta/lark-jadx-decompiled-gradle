package com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1584e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.location.ActivityIdentificationData;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.messagecard.IMessageCellFactory;
import com.ss.android.lark.calendar.impl.features.messagecard.share.C32208a;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.content.ShareCalendarEventContent;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.parser.CalendarMessageDataHelp;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.vo.ShareCalendarContentVO;
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

/* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.e.b */
public class C32702b implements IOpenMessageCell<ShareCalendarContentVO>, IOpenBubbleStyleProvider<ShareCalendarContentVO> {

    /* renamed from: a */
    public static final int f83880a = UIHelper.dp2px(12.0f);

    /* renamed from: b */
    private final IMessageContext f83881b;

    /* renamed from: c */
    private final IOpenCellCallback<ShareCalendarContentVO> f83882c;

    /* renamed from: d */
    private IMessageCellFactory f83883d;

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120410a(View view) {
    }

    /* renamed from: a */
    public void mo120464a(List<C34029b> list, OpenMenuDataHolder<ShareCalendarContentVO> cVar) {
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: b */
    public C34035c mo120416b(OpenMessageVO<ShareCalendarContentVO> cVar) {
        return null;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public Class<ShareCalendarContentVO> mo120409a() {
        return ShareCalendarContentVO.class;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public C34034b mo120408a(OpenMessageVO<ShareCalendarContentVO> cVar) {
        return C34034b.m131983a(UIUtils.dp2px(this.f83881b.mo122543g(), 12.0f), UIUtils.dp2px(this.f83881b.mo122543g(), 6.0f), 0, 0, false, 2);
    }

    public C32702b(IMessageContext aVar, IOpenCellCallback<ShareCalendarContentVO> bVar) {
        this(aVar, false, bVar);
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public View mo120406a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f83883d.mo117503a(layoutInflater, viewGroup);
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public BubbleStyle mo120407a(OpenMessageVO<ShareCalendarContentVO> cVar, View view) {
        int i;
        if (((ShareCalendarEventContent) cVar.mo121699g().mo126168z()).getCalendarInternalShareEventContent().isSharable()) {
            i = ActivityIdentificationData.WALKING;
        } else {
            i = 100;
        }
        return BubbleStyle.m131964a(i, view.findViewById(R.id.bot_head_container), new int[]{0, 0, 0, f83880a});
    }

    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo120464a((List<C34029b>) list, (OpenMenuDataHolder) obj);
    }

    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, OpenMenuDataHolder<ShareCalendarContentVO> cVar) {
        if (bVar.f87966a == 11 || bVar.f87966a == 25) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m125538a(View view, OpenMessageVO cVar, View view2) {
        return this.f83882c.mo122833b(view, cVar);
    }

    public C32702b(IMessageContext aVar, boolean z, IOpenCellCallback<ShareCalendarContentVO> bVar) {
        this.f83881b = aVar;
        this.f83882c = bVar;
        this.f83883d = new C32208a(aVar, z);
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120411a(View view, int i, OpenMessageVO<ShareCalendarContentVO> cVar) {
        this.f83883d.mo117504a(view, i, ((ShareCalendarEventContent) cVar.mo121699g().mo126168z()).getCalendarInternalShareEventContent(), CalendarMessageDataHelp.m125509a(cVar));
        view.setOnLongClickListener(new View.OnLongClickListener(view, cVar) {
            /* class com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1584e.$$Lambda$b$466fbQZDMlN636pUv88Gn6yfDy4 */
            public final /* synthetic */ View f$1;
            public final /* synthetic */ OpenMessageVO f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final boolean onLongClick(View view) {
                return C32702b.lambda$466fbQZDMlN636pUv88Gn6yfDy4(C32702b.this, this.f$1, this.f$2, view);
            }
        });
    }
}
