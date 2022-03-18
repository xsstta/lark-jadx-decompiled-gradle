package com.bytedance.ee.bear.document.model.toolbar;

import com.bytedance.ee.bear.document.model.toolbar.ItemIdV2;

public enum ToolbarPrimaryItemId implements ItemIdV2.AbstractC5875a {
    addNewBlock,
    separator,
    blockTransform,
    textTransform,
    reminder,
    alignTransform,
    insertImage,
    checkbox,
    mention,
    insertTable,
    calloutBlock,
    undo,
    redo,
    indentLeft,
    indentRight;

    public enum AlignTransformSecondaryItemId implements ItemIdV2.AbstractC5876b {
        separator,
        indentLeft,
        indentRight,
        alignLeft,
        alignCenter,
        alignRight;

        @Override // com.bytedance.ee.bear.document.model.toolbar.ItemIdV2
        public ItemIdV2[] children() {
            return null;
        }

        @Override // com.bytedance.ee.bear.document.model.toolbar.ItemIdV2
        public ItemIdV2.DisplayMode displayMode() {
            return ItemIdV2.DisplayMode.NoDisplay;
        }
    }

    public enum BlockTransformSecondaryItemId implements ItemIdV2.AbstractC5876b {
        separator,
        t,
        h1,
        h2,
        h3,
        h4,
        h5,
        h6,
        h7,
        h8,
        h9,
        checkbox,
        unorderedList,
        orderedList,
        codeList,
        blockQuote,
        insertSeparator,
        plainText;

        @Override // com.bytedance.ee.bear.document.model.toolbar.ItemIdV2
        public ItemIdV2[] children() {
            return null;
        }

        @Override // com.bytedance.ee.bear.document.model.toolbar.ItemIdV2
        public ItemIdV2.DisplayMode displayMode() {
            return ItemIdV2.DisplayMode.NoDisplay;
        }
    }

    public enum TextTransformSecondaryItemId implements ItemIdV2.AbstractC5876b {
        separator,
        bold,
        italic,
        underline,
        strikethrough,
        highlight,
        oldHighlight,
        inlineCode;

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
        int i = C58771.f16448a[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return ItemIdV2.DisplayMode.SubToolBarV2;
        }
        if (i != 4) {
            return ItemIdV2.DisplayMode.NoDisplay;
        }
        return ItemIdV2.DisplayMode.FunctionPanel;
    }

    /* renamed from: com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId$1 */
    static /* synthetic */ class C58771 {

        /* renamed from: a */
        static final /* synthetic */ int[] f16448a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId[] r0 = com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId.C58771.f16448a = r0
                com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId r1 = com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId.blockTransform     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId.C58771.f16448a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId r1 = com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId.textTransform     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId.C58771.f16448a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId r1 = com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId.alignTransform     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId.C58771.f16448a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId r1 = com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId.insertImage     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId.C58771.<clinit>():void");
        }
    }

    @Override // com.bytedance.ee.bear.document.model.toolbar.ItemIdV2
    public ItemIdV2[] children() {
        int i = C58771.f16448a[ordinal()];
        if (i == 1) {
            return BlockTransformSecondaryItemId.values();
        }
        if (i == 2) {
            return TextTransformSecondaryItemId.values();
        }
        if (i != 3) {
            return null;
        }
        return AlignTransformSecondaryItemId.values();
    }

    public static ItemIdV2 of(String str) {
        ToolbarPrimaryItemId[] values = values();
        for (ToolbarPrimaryItemId toolbarPrimaryItemId : values) {
            if (toolbarPrimaryItemId.name().equals(str)) {
                return toolbarPrimaryItemId;
            }
        }
        return ItemIdV2.ConstId.unknown;
    }
}
