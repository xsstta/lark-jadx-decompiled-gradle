package com.larksuite.component.openplatform.api.entity;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.google.gson.JsonObject;
import com.larksuite.component.openplatform.api.p1104c.AbstractC24369b;
import com.larksuite.component.openplatform.api.p1104c.AbstractC24370c;
import com.larksuite.component.openplatform.api.p1104c.AbstractC24371d;
import java.util.HashSet;
import java.util.Set;

public class OPContainerBundle {

    /* renamed from: a */
    public String f60145a;

    /* renamed from: b */
    public String f60146b;

    /* renamed from: c */
    private final Bundle f60147c;

    /* renamed from: d */
    private final Context f60148d;

    /* renamed from: e */
    private AbstractC24370c f60149e;

    /* renamed from: f */
    private FragmentManager f60150f;

    /* renamed from: g */
    private final Set<AbstractC24369b> f60151g = new HashSet();

    /* renamed from: h */
    private final Set<C24376a> f60152h = new HashSet();

    /* renamed from: i */
    private AbstractC24371d f60153i;

    public enum API_TYPE {
        INVOKE("invoke"),
        ON("on");
        
        private final String type;

        public String getType() {
            return this.type;
        }

        private API_TYPE(String str) {
            this.type = str;
        }
    }

    /* renamed from: a */
    public Set<C24376a> mo87143a() {
        return this.f60152h;
    }

    /* renamed from: b */
    public AbstractC24371d mo87151b() {
        return this.f60153i;
    }

    /* renamed from: c */
    public Bundle mo87152c() {
        return this.f60147c;
    }

    /* renamed from: d */
    public Context mo87153d() {
        return this.f60148d;
    }

    /* renamed from: e */
    public AbstractC24370c mo87154e() {
        return this.f60149e;
    }

    /* renamed from: f */
    public Set<AbstractC24369b> mo87155f() {
        return this.f60151g;
    }

    /* renamed from: g */
    public FragmentManager mo87156g() {
        return this.f60150f;
    }

    /* renamed from: a */
    public void mo87144a(FragmentManager fragmentManager) {
        this.f60150f = fragmentManager;
    }

    /* renamed from: a */
    public void mo87145a(JsonObject jsonObject) {
        this.f60147c.putString("typedDataCollection", jsonObject.toString());
    }

    /* renamed from: a */
    public void mo87146a(AbstractC24369b bVar) {
        this.f60151g.add(bVar);
    }

    /* renamed from: a */
    public void mo87147a(AbstractC24370c cVar) {
        this.f60149e = cVar;
    }

    /* renamed from: a */
    public void mo87148a(AbstractC24371d dVar) {
        this.f60153i = dVar;
    }

    /* renamed from: com.larksuite.component.openplatform.api.entity.OPContainerBundle$a */
    public static class C24376a {

        /* renamed from: a */
        public String f60154a;

        /* renamed from: b */
        public API_TYPE f60155b;

        public C24376a(String str, API_TYPE api_type) {
            this.f60154a = str;
            this.f60155b = api_type;
        }
    }

    public OPContainerBundle(Bundle bundle, Context context) {
        this.f60147c = bundle;
        this.f60148d = context;
    }

    /* renamed from: a */
    public void mo87149a(String str, API_TYPE api_type) {
        this.f60152h.add(new C24376a(str, api_type));
    }

    /* renamed from: a */
    public void mo87150a(String str, String str2) {
        this.f60145a = str;
        this.f60146b = str2;
    }
}
