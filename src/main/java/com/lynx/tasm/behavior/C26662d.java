package com.lynx.tasm.behavior;

import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.InlineTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.RawTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;
import com.lynx.tasm.behavior.ui.text.FiberBaseTextUI;
import com.lynx.tasm.behavior.ui.text.FiberFlattenUIText;
import com.lynx.tasm.behavior.ui.text.FiberRawText;
import com.lynx.tasm.behavior.ui.text.FiberUIText;
import com.lynx.tasm.behavior.ui.text.FlattenUIText;
import com.lynx.tasm.behavior.ui.text.UIText;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.behavior.ui.view.UIView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.lynx.tasm.behavior.d */
public class C26662d implements AbstractC26624b {
    @Override // com.lynx.tasm.behavior.AbstractC26624b
    /* renamed from: a */
    public List<C26622a> mo53784a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C26622a("view", true) {
            /* class com.lynx.tasm.behavior.C26662d.C266631 */

            @Override // com.lynx.tasm.behavior.C26622a
            /* renamed from: a */
            public LynxUI mo33935a(AbstractC26684l lVar) {
                return new UIView(lVar);
            }

            @Override // com.lynx.tasm.behavior.C26622a
            /* renamed from: d */
            public LynxFlattenUI mo94571d(AbstractC26684l lVar) {
                return new LynxFlattenUI(lVar);
            }
        });
        arrayList.add(new C26622a("text", true) {
            /* class com.lynx.tasm.behavior.C26662d.C266642 */

            @Override // com.lynx.tasm.behavior.C26622a
            /* renamed from: a */
            public ShadowNode mo67433a() {
                return new TextShadowNode();
            }

            @Override // com.lynx.tasm.behavior.C26622a
            /* renamed from: c */
            public LynxUI mo94569c(AbstractC26684l lVar) {
                return new FiberUIText(lVar);
            }

            @Override // com.lynx.tasm.behavior.C26622a
            /* renamed from: e */
            public LynxFlattenUI mo94573e(AbstractC26684l lVar) {
                return new FiberFlattenUIText(lVar);
            }

            @Override // com.lynx.tasm.behavior.C26622a
            /* renamed from: a */
            public LynxUI mo33935a(AbstractC26684l lVar) {
                if (lVar.mo94671a()) {
                    return mo94569c(lVar);
                }
                return new UIText(lVar);
            }

            @Override // com.lynx.tasm.behavior.C26622a
            /* renamed from: d */
            public LynxFlattenUI mo94571d(AbstractC26684l lVar) {
                if (lVar.mo94671a()) {
                    return mo94573e(lVar);
                }
                return new FlattenUIText(lVar);
            }
        });
        arrayList.add(new C26622a("raw-text") {
            /* class com.lynx.tasm.behavior.C26662d.C266653 */

            @Override // com.lynx.tasm.behavior.C26622a
            /* renamed from: a */
            public ShadowNode mo67433a() {
                return new RawTextShadowNode();
            }

            @Override // com.lynx.tasm.behavior.C26622a
            /* renamed from: f */
            public LynxBaseUI mo94574f(AbstractC26684l lVar) {
                return new FiberRawText(lVar);
            }
        });
        arrayList.add(new C26622a("inline-text") {
            /* class com.lynx.tasm.behavior.C26662d.C266664 */

            @Override // com.lynx.tasm.behavior.C26622a
            /* renamed from: a */
            public ShadowNode mo67433a() {
                return new InlineTextShadowNode();
            }

            @Override // com.lynx.tasm.behavior.C26622a
            /* renamed from: f */
            public LynxBaseUI mo94574f(AbstractC26684l lVar) {
                return new FiberBaseTextUI(lVar, "inline-text");
            }
        });
        arrayList.add(new C26622a("scroll-view") {
            /* class com.lynx.tasm.behavior.C26662d.C266675 */

            @Override // com.lynx.tasm.behavior.C26622a
            /* renamed from: a */
            public LynxUI mo33935a(AbstractC26684l lVar) {
                return new UIScrollView(lVar);
            }
        });
        arrayList.add(new C26622a("component", true) {
            /* class com.lynx.tasm.behavior.C26662d.C266686 */

            @Override // com.lynx.tasm.behavior.C26622a
            /* renamed from: a */
            public LynxUI mo33935a(AbstractC26684l lVar) {
                return new UIComponent(lVar);
            }

            @Override // com.lynx.tasm.behavior.C26622a
            /* renamed from: d */
            public LynxFlattenUI mo94571d(AbstractC26684l lVar) {
                return new LynxFlattenUI(lVar);
            }
        });
        arrayList.add(new C26622a("list") {
            /* class com.lynx.tasm.behavior.C26662d.C266697 */

            @Override // com.lynx.tasm.behavior.C26622a
            /* renamed from: a */
            public LynxUI mo33935a(AbstractC26684l lVar) {
                return new UIList(lVar);
            }
        });
        return arrayList;
    }
}
