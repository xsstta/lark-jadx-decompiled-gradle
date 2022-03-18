package com.lynx.tasm.behavior.shadow.text;

import com.lynx.react.bridge.AbstractC26517a;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import java.text.DecimalFormat;

public class RawTextShadowNode extends ShadowNode {

    /* renamed from: a */
    private String f66117a;

    /* renamed from: b */
    private boolean f66118b;

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    /* renamed from: g */
    public boolean mo94804g() {
        return true;
    }

    /* renamed from: a */
    public String mo67399a() {
        return this.f66117a;
    }

    /* renamed from: b */
    public boolean mo94869b() {
        return this.f66118b;
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public String toString() {
        return mo94805h() + " [text: " + this.f66117a + "]";
    }

    /* renamed from: com.lynx.tasm.behavior.shadow.text.RawTextShadowNode$1 */
    static /* synthetic */ class C267121 {

        /* renamed from: a */
        static final /* synthetic */ int[] f66119a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.lynx.react.bridge.ReadableType[] r0 = com.lynx.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.lynx.tasm.behavior.shadow.text.RawTextShadowNode.C267121.f66119a = r0
                com.lynx.react.bridge.ReadableType r1 = com.lynx.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.lynx.tasm.behavior.shadow.text.RawTextShadowNode.C267121.f66119a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.lynx.react.bridge.ReadableType r1 = com.lynx.react.bridge.ReadableType.Int     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.lynx.tasm.behavior.shadow.text.RawTextShadowNode.C267121.f66119a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.lynx.react.bridge.ReadableType r1 = com.lynx.react.bridge.ReadableType.Long     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.lynx.tasm.behavior.shadow.text.RawTextShadowNode.C267121.f66119a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.lynx.react.bridge.ReadableType r1 = com.lynx.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.lynx.tasm.behavior.shadow.text.RawTextShadowNode.C267121.f66119a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.lynx.react.bridge.ReadableType r1 = com.lynx.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.shadow.text.RawTextShadowNode.C267121.<clinit>():void");
        }
    }

    @LynxProp(name = "pseudo")
    public void setPsuedo(boolean z) {
        this.f66118b = z;
    }

    /* renamed from: a */
    private String m96824a(double d) {
        return new DecimalFormat("###################.###########").format(d);
    }

    @LynxProp(name = "text")
    public void setText(AbstractC26517a aVar) {
        int i = C267121.f66119a[aVar.mo94071g().ordinal()];
        if (i == 1) {
            this.f66117a = aVar.mo94069e();
        } else if (i == 2 || i == 3) {
            this.f66117a = String.valueOf(aVar.mo94068d());
        } else if (i == 4) {
            this.f66117a = m96824a(aVar.mo94067c());
        } else if (i == 5) {
            this.f66117a = String.valueOf(aVar.mo94066b());
        }
        mo94787d();
    }
}
