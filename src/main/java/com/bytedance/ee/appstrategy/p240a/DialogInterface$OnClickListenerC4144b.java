package com.bytedance.ee.appstrategy.p240a;

import android.content.DialogInterface;
import android.net.Uri;

/* renamed from: com.bytedance.ee.appstrategy.a.b */
public class DialogInterface$OnClickListenerC4144b implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private String f12595a;

    /* renamed from: b */
    private String f12596b;

    /* renamed from: c */
    private C4148f f12597c;

    /* renamed from: d */
    private AbstractC4146d f12598d;

    public void onClick(DialogInterface dialogInterface, int i) {
        Uri parse = Uri.parse(this.f12597c.f12605b);
        String path = parse.getPath();
        path.hashCode();
        char c = 65535;
        switch (path.hashCode()) {
            case -2029690228:
                if (path.equals("/install")) {
                    c = 0;
                    break;
                }
                break;
            case -1069077292:
                if (path.equals("/apply/access")) {
                    c = 1;
                    break;
                }
                break;
            case 1258824625:
                if (path.equals("/confirm")) {
                    c = 2;
                    break;
                }
                break;
            case 1577408721:
                if (path.equals("/contact/admin")) {
                    c = 3;
                    break;
                }
                break;
            case 1690242921:
                if (path.equals("/cancel")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f12598d.mo16246a(this.f12595a, this.f12596b, parse.getQueryParameter("url"));
                return;
            case 1:
                this.f12598d.mo16249c(this.f12595a, this.f12596b);
                return;
            case 2:
                this.f12598d.mo16245a(this.f12595a, this.f12596b);
                return;
            case 3:
                this.f12598d.mo16248b(this.f12595a, this.f12596b, parse.getQueryParameter("userId"));
                return;
            case 4:
                this.f12598d.mo16247b(this.f12595a, this.f12596b);
                return;
            default:
                return;
        }
    }

    public DialogInterface$OnClickListenerC4144b(String str, String str2, C4148f fVar, AbstractC4146d dVar) {
        this.f12595a = str;
        this.f12596b = str2;
        this.f12597c = fVar;
        this.f12598d = dVar;
    }
}
