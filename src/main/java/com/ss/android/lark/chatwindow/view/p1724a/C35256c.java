package com.ss.android.lark.chatwindow.view.p1724a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.lark.chat.base.view.AbstractC32925a;
import com.ss.android.lark.chat.base.view.AbstractC32939b;
import com.ss.android.lark.chat.base.view.vo.message.preview.BasePreviewVO;
import com.ss.android.lark.chat.base.view.vo.message.preview.NewUrlPreviewVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chatwindow.view.preview.IPreviewBinder;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.chatwindow.view.a.c */
public class C35256c {

    /* renamed from: a */
    private final Context f91045a;

    /* renamed from: b */
    private final AbstractC33342d f91046b;

    public C35256c(AbstractC33342d dVar) {
        this.f91045a = dVar.mo122543g();
        this.f91046b = dVar;
    }

    /* renamed from: a */
    public boolean mo129753a(AbstractC32939b bVar) {
        if (bVar == null || bVar.mo121629d() == null || bVar.mo121629d().getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m137671a(AbstractC32925a aVar) {
        BasePreviewVO a = aVar.mo121567a(aVar.mo121571d().intValue());
        if (a instanceof NewUrlPreviewVO) {
            NewUrlPreviewVO cVar = (NewUrlPreviewVO) a;
            if (cVar.mo121797a() != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("is_succeed_render", "true");
                hashMap.put("url_domain_path", cVar.mo121797a().getUrl());
                hashMap.put("url_id", cVar.mo121797a().getPreviewId());
                ChatHitPointNew.f135660c.mo187396b(aVar.mo121576i(), hashMap);
            }
        }
    }

    /* renamed from: a */
    private ViewGroup m137669a(AbstractC32939b bVar, IPreviewBinder cVar) {
        if (cVar == null) {
            bVar.mo121626a().setVisibility(8);
            bVar.mo121628c().setVisibility(8);
            if (bVar.mo121629d() != null) {
                bVar.mo121629d().setVisibility(8);
            }
            return null;
        }
        int a = cVar.mo129762a();
        if (a != 1) {
            if (a == 2) {
                bVar.mo121626a().setVisibility(0);
                bVar.mo121628c().setVisibility(8);
                if (bVar.mo121629d() != null) {
                    bVar.mo121629d().setVisibility(8);
                }
                return bVar.mo121626a();
            } else if (a != 3) {
                if (a != 4) {
                    bVar.mo121626a().setVisibility(8);
                    bVar.mo121628c().setVisibility(8);
                    if (bVar.mo121629d() != null) {
                        bVar.mo121629d().setVisibility(8);
                    }
                    return null;
                }
                bVar.mo121628c().setVisibility(0);
                if (bVar.mo121629d() != null) {
                    bVar.mo121629d().setVisibility(8);
                }
                bVar.mo121626a().setVisibility(8);
                return bVar.mo121627b();
            }
        }
        bVar.mo121626a().setVisibility(8);
        bVar.mo121628c().setVisibility(8);
        if (bVar.mo121629d() != null) {
            bVar.mo121629d().setVisibility(0);
            return bVar.mo121629d();
        }
        ViewGroup e = bVar.mo121630e();
        e.setVisibility(0);
        return e;
    }

    /* renamed from: a */
    private IPreviewBinder m137670a(AbstractC32939b bVar, AbstractC32925a aVar, View.OnLongClickListener onLongClickListener) {
        int intValue = aVar.mo121571d().intValue();
        if (intValue == 1) {
            return new NormalPreviewBinderCreator(bVar, aVar, onLongClickListener).mo129756a(this.f91045a);
        }
        if (intValue == 2) {
            return new DocPreviewBinderCreator(bVar, aVar, onLongClickListener).mo129732a(this.f91045a);
        }
        if (intValue == 3) {
            return new LocalPreviewBinderCreator(bVar, aVar, onLongClickListener).mo129745a(this.f91045a);
        }
        if (intValue != 4) {
            return null;
        }
        return new NetPreviewBinderCreator(bVar, aVar, onLongClickListener, this.f91046b).mo129754a(this.f91045a);
    }

    /* renamed from: a */
    public void mo129752a(AbstractC32939b bVar, AbstractC32925a aVar, boolean z, View.OnLongClickListener onLongClickListener) {
        IPreviewBinder a = m137670a(bVar, aVar, onLongClickListener);
        ViewGroup a2 = m137669a(bVar, a);
        if (a2 == null) {
            return;
        }
        if (aVar.mo121572e() > 1) {
            bVar.mo121628c().setVisibility(8);
            return;
        }
        BasePreviewVO a3 = aVar.mo121567a(a.mo129762a());
        a.mo129765a(a3, a.mo129764a(a3, a2));
        m137671a(aVar);
    }
}
