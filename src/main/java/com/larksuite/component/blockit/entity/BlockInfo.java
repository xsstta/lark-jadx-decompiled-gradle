package com.larksuite.component.blockit.entity;

import java.io.Serializable;

public class BlockInfo implements Serializable {
    public String blockID;
    public String blockTypeID;
    public String i18nPreview;
    public String i18nSummary;
    public String sourceData;
    public String sourceLink;
    public String sourceMeta;

    public BlockInfo(BlockEntity blockEntity) {
        this.blockID = blockEntity.getBlockID();
        this.blockTypeID = blockEntity.getBlockTypeID();
        this.sourceLink = blockEntity.getSourceLink();
        this.sourceMeta = blockEntity.getSourceMeta();
        this.sourceData = blockEntity.getSourceData();
        this.i18nPreview = blockEntity.getPreview();
        this.i18nSummary = blockEntity.getSummary();
    }
}
