package ru.amm.fileexplorer.server.entity;

import java.util.Date;

public class FileData {
    private String relativePath;
    private String name;
    private Date lastModifiedTime;
    private long size;
    private boolean isDirectory;
    private String mimeType;

    public FileData(String name, Date lastModifiedTime, long size, boolean isDirectory) {
        this.name = name;
        this.lastModifiedTime = lastModifiedTime;
        this.size = size;
        this.isDirectory = isDirectory;
    }

    public FileData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public boolean isDirectory() {
        return isDirectory;
    }

    public void setDirectory(boolean directory) {
        isDirectory = directory;
    }

    public String getRelativePath() {
        return relativePath;
    }

    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }
}
