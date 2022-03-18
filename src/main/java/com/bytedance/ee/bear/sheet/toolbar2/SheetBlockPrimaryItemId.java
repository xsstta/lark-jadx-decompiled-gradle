package com.bytedance.ee.bear.sheet.toolbar2;

import com.bytedance.ee.bear.document.model.toolbar.ItemIdV2;

public enum SheetBlockPrimaryItemId implements ItemIdV2.AbstractC5875a {
    addNewBlock,
    separator,
    cellAttribute,
    textTransform,
    reminder,
    alignTransform,
    insertImage,
    checkbox,
    mention;

    /* renamed from: com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId$a */
    enum EnumC11324a implements ItemIdV2.AbstractC5876b {
        separator,
        horizontalLeft,
        horizontalCenter,
        horizontalRight,
        verticalTop,
        verticalCenter,
        verticalBottom;

        @Override // com.bytedance.ee.bear.document.model.toolbar.ItemIdV2
        public ItemIdV2[] children() {
            return null;
        }

        @Override // com.bytedance.ee.bear.document.model.toolbar.ItemIdV2
        public ItemIdV2.DisplayMode displayMode() {
            return ItemIdV2.DisplayMode.NoDisplay;
        }
    }

    /* renamed from: com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId$b */
    enum EnumC11325b implements ItemIdV2.AbstractC5876b {
        separator,
        merge,
        autoWrap,
        overflow,
        clip,
        borderLine,
        backColor;

        @Override // com.bytedance.ee.bear.document.model.toolbar.ItemIdV2
        public ItemIdV2[] children() {
            return null;
        }

        @Override // com.bytedance.ee.bear.document.model.toolbar.ItemIdV2
        public ItemIdV2.DisplayMode displayMode() {
            return ItemIdV2.DisplayMode.NoDisplay;
        }
    }

    /* renamed from: com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId$c */
    enum EnumC11326c implements ItemIdV2.AbstractC5876b {
        separator,
        bold,
        italic,
        underline,
        strikethrough,
        foreColor,
        fontSize;

        @Override // com.bytedance.ee.bear.document.model.toolbar.ItemIdV2
        public ItemIdV2[] children() {
            return null;
        }

        @Override // com.bytedance.ee.bear.document.model.toolbar.ItemIdV2
        public ItemIdV2.DisplayMode displayMode() {
            return ItemIdV2.DisplayMode.NoDisplay;
        }
    }

    @Override // com.bytedance.ee.bear.document.model.toolbar.ItemIdV2
    public ItemIdV2.DisplayMode displayMode() {
        int i = C113231.f30451a[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return ItemIdV2.DisplayMode.SubToolBarV2;
        }
        if (i != 4) {
            return ItemIdV2.DisplayMode.NoDisplay;
        }
        return ItemIdV2.DisplayMode.FunctionPanel;
    }

    /* renamed from: com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId$1 */
    static /* synthetic */ class C113231 {

        /* renamed from: a */
        static final /* synthetic */ int[] f30451a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId[] r0 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.C113231.f30451a = r0
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.cellAttribute     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.C113231.f30451a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.textTransform     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.C113231.f30451a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.alignTransform     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.C113231.f30451a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.insertImage     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.C113231.<clinit>():void");
        }
    }

    @Override // com.bytedance.ee.bear.document.model.toolbar.ItemIdV2
    public ItemIdV2[] children() {
        int i = C113231.f30451a[ordinal()];
        if (i == 1) {
            return EnumC11325b.values();
        }
        if (i == 2) {
            return EnumC11326c.values();
        }
        if (i != 3) {
            return null;
        }
        return EnumC11324a.values();
    }
}
