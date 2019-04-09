package com.hiddenramblings.tagmo;

import org.parceler.Parcel;
import org.parceler.ParcelConstructor;

import java.io.File;

@Parcel
public class AmiiboFile {
    protected File filePath;
    protected long id;
    protected String hexid;

    @ParcelConstructor
    public AmiiboFile(File filePath, long id) {
        this.filePath = filePath;
        this.id = id;
        this.hexid = TagUtil.amiiboIdToHex(id);
    }

    public File getFilePath() {
        return filePath;
    }

    public void setFilePath(File filePath) {
        this.filePath = filePath;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHexId() {return hexid;}

    public void setHexId(String id) {this.hexid = id;}
}
