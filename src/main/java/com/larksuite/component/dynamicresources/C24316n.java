package com.larksuite.component.dynamicresources;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.larksuite.component.dynamicresources.C24284a;
import com.larksuite.component.dynamicresources.C24308i;
import java.util.Map;

/* renamed from: com.larksuite.component.dynamicresources.n */
class C24316n extends C24284a {
    /* renamed from: a */
    public static void m88748a(Map<String, Map<String, C24308i.AbstractC24310a>> map) {
        m88673a(map, new C24284a.C24285a("TextView", "textColor", "color"), new C24308i.AbstractC24310a<TextView>() {
            /* class com.larksuite.component.dynamicresources.C24316n.C243171 */

            /* renamed from: a */
            public void mo86981a(TextView textView, AbstractC24311j jVar, int i) {
                textView.setTextColor(jVar.getColor(i));
            }
        });
        m88673a(map, new C24284a.C24285a("TextView", "textColor", "color_selector"), new C24308i.AbstractC24310a<TextView>() {
            /* class com.larksuite.component.dynamicresources.C24316n.C243248 */

            /* renamed from: a */
            public void mo86981a(TextView textView, AbstractC24311j jVar, int i) {
                textView.setTextColor(jVar.getColorStateList(i));
            }
        });
        m88673a(map, new C24284a.C24285a("TextView", "textColorHint", "color"), new C24308i.AbstractC24310a<TextView>() {
            /* class com.larksuite.component.dynamicresources.C24316n.C243259 */

            /* renamed from: a */
            public void mo86981a(TextView textView, AbstractC24311j jVar, int i) {
                textView.setHintTextColor(jVar.getColor(i));
            }
        });
        m88673a(map, new C24284a.C24285a("TextView", "textColorHint", "color_selector"), new C24308i.AbstractC24310a<TextView>() {
            /* class com.larksuite.component.dynamicresources.C24316n.AnonymousClass10 */

            /* renamed from: a */
            public void mo86981a(TextView textView, AbstractC24311j jVar, int i) {
                textView.setHintTextColor(jVar.getColorStateList(i));
            }
        });
        m88673a(map, new C24284a.C24285a("TextView", "textColorHighlight", "color"), new C24308i.AbstractC24310a<TextView>() {
            /* class com.larksuite.component.dynamicresources.C24316n.AnonymousClass11 */

            /* renamed from: a */
            public void mo86981a(TextView textView, AbstractC24311j jVar, int i) {
                textView.setHighlightColor(jVar.getColor(i));
            }
        });
        m88673a(map, new C24284a.C24285a("TextView", "textColorLink", "color"), new C24308i.AbstractC24310a<TextView>() {
            /* class com.larksuite.component.dynamicresources.C24316n.AnonymousClass12 */

            /* renamed from: a */
            public void mo86981a(TextView textView, AbstractC24311j jVar, int i) {
                textView.setLinkTextColor(jVar.getColor(i));
            }
        });
        m88673a(map, new C24284a.C24285a("TextView", "textColorLink", "color_selector"), new C24308i.AbstractC24310a<TextView>() {
            /* class com.larksuite.component.dynamicresources.C24316n.AnonymousClass13 */

            /* renamed from: a */
            public void mo86981a(TextView textView, AbstractC24311j jVar, int i) {
                textView.setLinkTextColor(jVar.getColor(i));
            }
        });
        m88673a(map, new C24284a.C24285a("TextView", "shadowColor", "color"), new C24308i.AbstractC24310a<TextView>() {
            /* class com.larksuite.component.dynamicresources.C24316n.AnonymousClass14 */

            /* renamed from: a */
            public void mo86981a(TextView textView, AbstractC24311j jVar, int i) {
                textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), textView.getShadowDy(), jVar.getColor(i));
            }
        });
        m88673a(map, new C24284a.C24285a("TextView", "drawableBottom", "drawable"), new C24308i.AbstractC24310a<TextView>() {
            /* class com.larksuite.component.dynamicresources.C24316n.AnonymousClass15 */

            /* renamed from: a */
            public void mo86981a(TextView textView, AbstractC24311j jVar, int i) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], jVar.getDrawable(i));
            }
        });
        m88673a(map, new C24284a.C24285a("TextView", "drawableTop", "drawable"), new C24308i.AbstractC24310a<TextView>() {
            /* class com.larksuite.component.dynamicresources.C24316n.C243182 */

            /* renamed from: a */
            public void mo86981a(TextView textView, AbstractC24311j jVar, int i) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawables[0], jVar.getDrawable(i), compoundDrawables[2], compoundDrawables[3]);
            }
        });
        m88673a(map, new C24284a.C24285a("TextView", "drawableStart", "drawable"), new C24308i.AbstractC24310a<TextView>() {
            /* class com.larksuite.component.dynamicresources.C24316n.C243193 */

            /* renamed from: a */
            public void mo86981a(TextView textView, AbstractC24311j jVar, int i) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(jVar.getDrawable(i), compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
            }
        });
        m88673a(map, new C24284a.C24285a("TextView", "drawableLeft", "drawable"), new C24308i.AbstractC24310a<TextView>() {
            /* class com.larksuite.component.dynamicresources.C24316n.C243204 */

            /* renamed from: a */
            public void mo86981a(TextView textView, AbstractC24311j jVar, int i) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(jVar.getDrawable(i), compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
            }
        });
        m88673a(map, new C24284a.C24285a("TextView", "drawableEnd", "drawable"), new C24308i.AbstractC24310a<TextView>() {
            /* class com.larksuite.component.dynamicresources.C24316n.C243215 */

            /* renamed from: a */
            public void mo86981a(TextView textView, AbstractC24311j jVar, int i) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawables[0], compoundDrawables[1], jVar.getDrawable(i), compoundDrawables[3]);
            }
        });
        m88673a(map, new C24284a.C24285a("TextView", "drawableRight", "drawable"), new C24308i.AbstractC24310a<TextView>() {
            /* class com.larksuite.component.dynamicresources.C24316n.C243226 */

            /* renamed from: a */
            public void mo86981a(TextView textView, AbstractC24311j jVar, int i) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawables[0], compoundDrawables[1], jVar.getDrawable(i), compoundDrawables[3]);
            }
        });
        m88673a(map, new C24284a.C24285a("TextView", "text", "text"), new C24308i.AbstractC24310a<TextView>() {
            /* class com.larksuite.component.dynamicresources.C24316n.C243237 */

            /* renamed from: a */
            public void mo86981a(TextView textView, AbstractC24311j jVar, int i) {
                textView.setText(jVar.getText(i));
            }
        });
    }
}
