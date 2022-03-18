package com.huawei.hms.maps.model;

import java.net.URL;

public abstract class UrlTileProvider implements TileProvider {

    /* renamed from: a */
    private final int f58808a;

    /* renamed from: b */
    private final int f58809b;

    public UrlTileProvider(int i, int i2) {
        this.f58809b = i;
        this.f58808a = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a A[SYNTHETIC, Splitter:B:35:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0094 A[SYNTHETIC, Splitter:B:40:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b1 A[SYNTHETIC, Splitter:B:48:0x00b1] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00cb A[SYNTHETIC, Splitter:B:53:0x00cb] */
    @Override // com.huawei.hms.maps.model.TileProvider
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.huawei.hms.maps.model.Tile getTile(int r9, int r10, int r11) {
        /*
        // Method dump skipped, instructions count: 228
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.maps.model.UrlTileProvider.getTile(int, int, int):com.huawei.hms.maps.model.Tile");
    }

    public abstract URL getTileUrl(int i, int i2, int i3);
}
