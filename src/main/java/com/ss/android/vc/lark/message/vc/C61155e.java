package com.ss.android.vc.lark.message.vc;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.ui.menu.OpenMenuDataHolder;
import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCell;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.export.ui.message.style.C34034b;
import com.ss.android.lark.chat.export.ui.message.style.C34035c;
import com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.export.vo.OpenMessageVO;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.service.impl.VideoChatService;
import java.util.List;

/* renamed from: com.ss.android.vc.lark.message.vc.e */
public class C61155e implements IOpenMessageCell<VCSysContentVO>, IOpenBubbleStyleProvider<VCSysContentVO> {

    /* renamed from: a */
    public static final int f153208a = UIHelper.dp2px(12.0f);

    /* renamed from: b */
    private static final int f153209b = UIHelper.dp2px(12.0f);

    /* renamed from: c */
    private static final int f153210c = UIHelper.dp2px(12.0f);

    /* renamed from: d */
    private static final int f153211d = UIHelper.dp2px(8.0f);

    /* renamed from: e */
    private final IMessageContext f153212e;

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120410a(View view) {
    }

    /* renamed from: a */
    public void mo211457a(List<C34029b> list, OpenMenuDataHolder<VCSysContentVO> cVar) {
    }

    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, OpenMenuDataHolder<VCSysContentVO> cVar) {
        return false;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: b */
    public C34035c mo120416b(OpenMessageVO<VCSysContentVO> cVar) {
        return null;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public Class<VCSysContentVO> mo120409a() {
        return VCSysContentVO.class;
    }

    /* renamed from: b */
    private boolean m237796b() {
        if (TextUtils.isEmpty(this.f153212e.mo122544h())) {
            return false;
        }
        if (!this.f153212e.mo122545i() && this.f153212e.mo122545i()) {
            return false;
        }
        return true;
    }

    public C61155e(IMessageContext aVar) {
        this.f153212e = aVar;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public C34034b mo120408a(OpenMessageVO<VCSysContentVO> cVar) {
        return C34034b.m131982a(UIHelper.dp2px(8.0f), 2);
    }

    /* renamed from: com.ss.android.vc.lark.message.vc.e$a */
    static class C61156a {

        /* renamed from: a */
        public TextView f153213a;

        /* renamed from: b */
        public TextView f153214b;

        /* renamed from: c */
        public final View f153215c;

        private C61156a(View view) {
            this.f153215c = view;
            this.f153213a = (TextView) view.findViewById(R.id.vc_info);
            this.f153214b = (TextView) view.findViewById(R.id.vc_tv);
            view.setTag(this);
        }

        /* renamed from: a */
        public static C61156a m237808a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return new C61156a(layoutInflater.inflate(R.layout.vc_vc_content_item, viewGroup, false));
        }
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public View mo120406a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C61156a.m237808a(layoutInflater, viewGroup).f153215c;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m237795a(VCSysContentVO dVar, View view) {
        if (dVar.mo211453b() != null) {
            if (dVar.mo211453b().isDimission()) {
                C60738ac.m236023a((int) R.string.Lark_Legacy_ChatterResignPermissionPhone);
            } else if (m237796b()) {
                VideoChatService.m249602d().mo220075a(dVar.mo211453b(), this.f153212e.mo122544h(), "bubble", this.f153212e.mo122546j(), false, null);
            }
        }
    }

    @Override // com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider
    /* renamed from: a */
    public BubbleStyle mo120407a(OpenMessageVO<VCSysContentVO> cVar, View view) {
        if (cVar.mo121698f() || !cVar.ah()) {
            int i = !cVar.mo121695c() ? 1 : 0;
            int i2 = f153210c;
            int i3 = f153211d;
            return BubbleStyle.m131964a(i, (View) null, new int[]{i2, i3, i2, i3});
        }
        int i4 = !cVar.mo121695c() ? 1 : 0;
        int i5 = f153210c;
        return BubbleStyle.m131964a(i4, (View) null, new int[]{i5, f153211d, i5, f153209b});
    }

    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo211457a((List<C34029b>) list, (OpenMenuDataHolder) obj);
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public void mo120411a(View view, int i, OpenMessageVO<VCSysContentVO> cVar) {
        String str;
        Context context = view.getContext();
        C61156a aVar = (C61156a) view.getTag();
        VCSysContentVO g = cVar.mo121699g();
        aVar.f153213a.setText(g.mo211455d());
        if (g.mo211454c()) {
            if (g.mo211452a()) {
                str = context.getString(R.string.View_AV_CallAgain);
            } else {
                str = context.getString(R.string.View_AV_CallBack);
            }
            aVar.f153214b.setVisibility(0);
            aVar.f153214b.setText(str);
        } else {
            aVar.f153214b.setVisibility(8);
        }
        aVar.f153214b.setOnClickListener(new View.OnClickListener(g) {
            /* class com.ss.android.vc.lark.message.vc.$$Lambda$e$SR7q3oLn5vacbySQsf1X6nmgQ */
            public final /* synthetic */ VCSysContentVO f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C61155e.m271169lambda$SR7q3oLn5vacbySQsf1X6nmgQ(C61155e.this, this.f$1, view);
            }
        });
    }
}
