package com.ss.android.lark.chat.chatwindow.chat.message.text;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.AbstractC32925a;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TextContentVO;
import com.ss.android.lark.chat.base.view.vo.message.preview.BasePreviewVO;
import com.ss.android.lark.chat.base.view.vo.message.preview.DocUrlPreviewVO;
import com.ss.android.lark.chat.base.view.vo.message.preview.NewUrlPreviewVO;
import com.ss.android.lark.chat.base.view.vo.message.preview.NormalUrlPreviewVO;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.MessageUrlPreview;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.entity.preview.LocalUrlPreviewEntity;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.chat.utils.C34352r;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.tangram.base.render.Render;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.text.b */
public class C33381b implements AbstractC32925a {

    /* renamed from: a */
    private String f85978a = "";

    /* renamed from: b */
    private String f85979b;

    /* renamed from: c */
    private String f85980c;

    /* renamed from: d */
    private String f85981d = "";

    /* renamed from: e */
    private String f85982e;

    /* renamed from: f */
    private String f85983f;

    /* renamed from: g */
    private final boolean f85984g;

    /* renamed from: h */
    private boolean f85985h;

    /* renamed from: i */
    private final AbsMessageVO f85986i;

    @Override // com.ss.android.lark.chat.base.view.AbstractC32925a
    /* renamed from: a */
    public String mo121568a() {
        return this.f85978a;
    }

    @Override // com.ss.android.lark.chat.base.view.AbstractC32925a
    /* renamed from: b */
    public boolean mo121569b() {
        return this.f85984g;
    }

    @Override // com.ss.android.lark.chat.base.view.AbstractC32925a
    /* renamed from: g */
    public String mo121574g() {
        return this.f85979b;
    }

    @Override // com.ss.android.lark.chat.base.view.AbstractC32925a
    /* renamed from: h */
    public String mo121575h() {
        return this.f85980c;
    }

    @Override // com.ss.android.lark.chat.base.view.AbstractC32925a
    /* renamed from: i */
    public String mo121576i() {
        return this.f85982e;
    }

    @Override // com.ss.android.lark.chat.base.view.AbstractC32925a
    /* renamed from: j */
    public String mo121577j() {
        return this.f85981d;
    }

    @Override // com.ss.android.lark.chat.base.view.AbstractC32925a
    /* renamed from: k */
    public String mo121578k() {
        return this.f85983f;
    }

    @Override // com.ss.android.lark.chat.base.view.AbstractC32925a
    /* renamed from: l */
    public boolean mo121579l() {
        return this.f85985h;
    }

    @Override // com.ss.android.lark.chat.base.view.AbstractC32925a
    /* renamed from: c */
    public boolean mo121570c() {
        return this.f85986i.mo121695c();
    }

    @Override // com.ss.android.lark.chat.base.view.AbstractC32925a
    /* renamed from: f */
    public String mo121573f() {
        AbsMessageVO aVar = this.f85986i;
        if (aVar != null) {
            return aVar.mo121697e();
        }
        return "";
    }

    /* renamed from: m */
    private DocResult m129297m() {
        ContentVO g = this.f85986i.mo121699g();
        if (g instanceof TextContentVO) {
            return ((TextContentVO) g).mo121903n();
        }
        if (g instanceof PostContentVO) {
            return ((PostContentVO) g).mo121884p();
        }
        return null;
    }

    /* renamed from: o */
    private PreviewHangPoint m129299o() {
        ContentVO g = this.f85986i.mo121699g();
        if (g instanceof TextContentVO) {
            return ((TextContentVO) g).mo121904o();
        }
        if (g instanceof PostContentVO) {
            return ((PostContentVO) g).mo121885q();
        }
        return null;
    }

    /* renamed from: p */
    private Render m129300p() {
        ContentVO g = this.f85986i.mo121699g();
        if (g instanceof TextContentVO) {
            return ((TextContentVO) g).mo121791k();
        }
        if (g instanceof PostContentVO) {
            return ((PostContentVO) g).mo121791k();
        }
        return null;
    }

    /* renamed from: n */
    private MessageUrlPreview m129298n() {
        MessageUrlPreview messageUrlPreview;
        ContentVO g = this.f85986i.mo121699g();
        if (g instanceof TextContentVO) {
            messageUrlPreview = ((TextContentVO) g).mo121902m();
        } else if (g instanceof PostContentVO) {
            messageUrlPreview = ((PostContentVO) g).mo121883o();
        } else {
            messageUrlPreview = null;
        }
        if (messageUrlPreview == null || messageUrlPreview.isDeleted()) {
            return null;
        }
        return messageUrlPreview;
    }

    @Override // com.ss.android.lark.chat.base.view.AbstractC32925a
    /* renamed from: e */
    public int mo121572e() {
        ContentVO g = this.f85986i.mo121699g();
        if (g instanceof TextContentVO) {
            return ((TextContent) g.mo126168z()).getPreviewHangPoints().size();
        }
        if (g instanceof PostContentVO) {
            return ((PostContent) g.mo126168z()).getPreviewHangPoints().size();
        }
        return 0;
    }

    @Override // com.ss.android.lark.chat.base.view.AbstractC32925a
    /* renamed from: d */
    public Integer mo121571d() {
        if (m129299o() != null && m129299o().hasPreViewBodyAndUrl() && C29990c.m110930b().mo134586n().mo134685a("is_urlpreview_on")) {
            return 4;
        }
        if (m129299o() != null && (m129299o().getUrlPreviewEntity() instanceof LocalUrlPreviewEntity) && C29990c.m110930b().mo134586n().mo134685a("is_urlpreview_on")) {
            return 3;
        }
        if (m129297m() != null && C34352r.m133232a(m129297m(), this.f85986i.mo121695c())) {
            return 2;
        }
        if (m129298n() != null) {
            return 1;
        }
        return 0;
    }

    @Override // com.ss.android.lark.chat.base.view.AbstractC32925a
    /* renamed from: a */
    public BasePreviewVO mo121567a(int i) {
        if (i == 1) {
            return new NormalUrlPreviewVO(m129298n());
        }
        if (i == 2) {
            return new DocUrlPreviewVO(m129297m());
        }
        if (i == 3) {
            return new NewUrlPreviewVO(m129299o(), 3, m129300p());
        }
        if (i != 4) {
            return null;
        }
        return new NewUrlPreviewVO(m129299o(), 4, m129300p());
    }

    public C33381b(AbsMessageVO aVar, Chat chat, C33973b bVar) {
        boolean z;
        this.f85986i = aVar;
        if (bVar != null) {
            this.f85978a = bVar.mo124208e();
            this.f85979b = bVar.mo124202c();
            this.f85980c = bVar.mo124216h();
        }
        if (chat != null) {
            this.f85982e = chat.getId();
            this.f85981d = chat.getName();
            this.f85983f = chat.getAvatarKey();
            this.f85985h = chat.isCrossTenant();
        }
        if (chat == null || !chat.isGroup()) {
            z = false;
        } else {
            z = true;
        }
        this.f85984g = z;
    }
}
