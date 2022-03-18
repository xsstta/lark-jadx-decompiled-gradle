package org.webrtc;

import org.webrtc.GlGenericDrawer;

public class GlRectDrawer extends GlGenericDrawer {

    private static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader glShader) {
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4) {
        }

        private ShaderCallbacks() {
        }
    }

    @Override // org.webrtc.RendererCommon.GlDrawer, org.webrtc.GlGenericDrawer
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    public GlRectDrawer() {
        super("void main() {\n  gl_FragColor = sample(tc);\n}\n", new ShaderCallbacks());
    }

    @Override // org.webrtc.RendererCommon.GlDrawer, org.webrtc.GlGenericDrawer
    public /* bridge */ /* synthetic */ void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        super.drawOes(i, fArr, i2, i3, i4, i5, i6, i7);
    }

    @Override // org.webrtc.RendererCommon.GlDrawer, org.webrtc.GlGenericDrawer
    public /* bridge */ /* synthetic */ void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        super.drawRgb(i, fArr, i2, i3, i4, i5, i6, i7);
    }

    @Override // org.webrtc.RendererCommon.GlDrawer, org.webrtc.GlGenericDrawer
    public /* bridge */ /* synthetic */ void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6) {
        super.drawYuv(iArr, fArr, i, i2, i3, i4, i5, i6);
    }

    @Override // org.webrtc.RendererCommon.GlDrawer, org.webrtc.GlGenericDrawer
    public /* bridge */ /* synthetic */ void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, FilterType filterType, int i8, int i9) {
        super.drawOes(i, fArr, i2, i3, i4, i5, i6, i7, filterType, i8, i9);
    }

    @Override // org.webrtc.RendererCommon.GlDrawer, org.webrtc.GlGenericDrawer
    public /* bridge */ /* synthetic */ void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, FilterType filterType, int i8, int i9) {
        super.drawRgb(i, fArr, i2, i3, i4, i5, i6, i7, filterType, i8, i9);
    }

    @Override // org.webrtc.RendererCommon.GlDrawer, org.webrtc.GlGenericDrawer
    public /* bridge */ /* synthetic */ void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6, FilterType filterType, int i7, int i8) {
        super.drawYuv(iArr, fArr, i, i2, i3, i4, i5, i6, filterType, i7, i8);
    }
}
